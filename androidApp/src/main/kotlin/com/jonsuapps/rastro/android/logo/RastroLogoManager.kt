package com.jonsuapps.rastro.android.logo

import android.content.Context
import android.content.SharedPreferences
import com.jonsuapps.rastro.R
import com.jonsuapps.rastro.gamification.GamificationManager
import com.jonsuapps.rastro.logo.LogoMoodConfig
import com.jonsuapps.rastro.logo.RastroLogoEvaluator
import com.jonsuapps.rastro.logo.RastroLogoMood
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.collectLatest
import kotlinx.coroutines.launch
import kotlinx.datetime.Clock
import kotlinx.datetime.LocalDate

/**
 * Fuente de verdad única en Android para el estado dinámico del logo de RASTRO.
 *
 * Escucha la racha real de GamificationManager y el historial de última actividad,
 * actualizando el estado de logo en tiempo real para todos los componentes de la interfaz.
 */
object RastroLogoManager {

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.Main.immediate)

    private val _currentMood = MutableStateFlow(RastroLogoMood.BASE)
    val currentMood: StateFlow<RastroLogoMood> = _currentMood.asStateFlow()

    private val _currentDrawableRes = MutableStateFlow(R.drawable.astro_logo)
    val currentDrawableRes: StateFlow<Int> = _currentDrawableRes.asStateFlow()

    private var appContext: Context? = null
    private var prefs: SharedPreferences? = null
    private const val PREF_KEY_LAST_ACTIVE_MILLIS = "rastro_last_active_millis"

    /**
     * Inicializa el gestor con el contexto de la aplicación.
     */
    fun initialize(context: Context) {
        appContext = context.applicationContext
        prefs = context.getSharedPreferences("rastro_logo_prefs", Context.MODE_PRIVATE)
        recordUserActive()

        // Observar cambios en la racha para actualizar el logo inmediatamente
        scope.launch {
            GamificationManager.streakState.collectLatest {
                recomputeMood()
            }
        }
    }

    /**
     * Registra que el usuario interactuó con la aplicación en este momento.
     * Esto hace que si estaba en ENOJO o FURIA, al regresar vuelva automáticamente a BASE.
     */
    fun recordUserActive() {
        val now = Clock.System.now().toEpochMilliseconds()
        prefs?.edit()?.putLong(PREF_KEY_LAST_ACTIVE_MILLIS, now)?.apply()
        recomputeMood()
    }

    /**
     * Recalcula el estado emocional del logo combinando la racha real y la inactividad.
     */
    fun recomputeMood() {
        val now = Clock.System.now().toEpochMilliseconds()
        val lastActive = prefs?.getLong(PREF_KEY_LAST_ACTIVE_MILLIS, now) ?: now
        val diffMillis = (now - lastActive).coerceAtLeast(0L)
        val inactiveHours = diffMillis / (1000L * 60 * 60)

        // Verificar racha perdida real
        val streak = GamificationManager.streakState.value
        val today = GamificationManager.getLocalDayString()
        val isStreakLost = evaluateStreakLoss(streak, today)

        // El usuario está actualmente interactuando si entró hace menos de 1 hora
        val isCurrentlyActive = inactiveHours < 1L

        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = isStreakLost,
            inactiveHours = inactiveHours,
            isUserCurrentlyActive = isCurrentlyActive
        )

        _currentMood.value = mood
        _currentDrawableRes.value = getDrawableForMood(mood)
        appContext?.let { ctx ->
            updateLauncherIcon(ctx, mood)
        }
    }

    /**
     * Determina si la racha real del usuario se perdió.
     * Solo es true si el usuario tenía una racha mayor a 1 que se rompió y hoy no ha estudiado.
     */
    private fun evaluateStreakLoss(streak: GamificationManager.StreakState, today: String): Boolean {
        if (streak.lastActiveDate.isBlank()) return false
        val previous = runCatching { LocalDate.parse(streak.lastActiveDate) }.getOrNull() ?: return false
        val currentLocal = runCatching { LocalDate.parse(today) }.getOrNull() ?: return false
        val days = currentLocal.toEpochDays() - previous.toEpochDays()

        // Si pasó más de un día sin estudiar y no tenía congelador de racha
        return days > 1 && streak.streakFreezeCount <= 0 && streak.bestStreak > 1 && streak.currentStreak <= 1
    }

    /**
     * Mapea el estado emocional al recurso de imagen PNG correspondiente.
     *
     * Utiliza reflection segura sobre R.drawable para los recursos rastro_logo_*
     * con fallback automático a astro_logo si el asset aún está sincronizándose.
     */
    fun getDrawableForMood(mood: RastroLogoMood): Int {
        // En primer lugar intentamos usar los nuevos recursos rastro_logo_* si están disponibles
        return when (mood) {
            RastroLogoMood.BASE -> resolveDrawableOrFallback("rastro_logo_base", R.drawable.astro_logo)
            RastroLogoMood.ENOJO -> resolveDrawableOrFallback("rastro_logo_enojo", R.drawable.astro_logo)
            RastroLogoMood.FURIA -> resolveDrawableOrFallback("rastro_logo_furia", R.drawable.astro_logo)
            RastroLogoMood.TRISTE -> resolveDrawableOrFallback("rastro_logo_triste", R.drawable.astro_logo)
        }
    }

    private fun resolveDrawableOrFallback(name: String, fallback: Int): Int {
        return try {
            val field = R.drawable::class.java.getField(name)
            field.getInt(null)
        } catch (_: Throwable) {
            fallback
        }
    }

    /**
     * Alterna de forma segura el alias activo del lanzador de Android para cambiar el icono real de la app.
     * Habilita primero el alias objetivo para garantizar que la app nunca desaparezca del cajón/escritorio.
     */
    fun updateLauncherIcon(context: Context, mood: RastroLogoMood) {
        try {
            val pm = context.packageManager
            val packageName = context.packageName

            val aliases = mapOf(
                RastroLogoMood.BASE to "$packageName.android.MainActivityBase",
                RastroLogoMood.ENOJO to "$packageName.android.MainActivityEnojo",
                RastroLogoMood.FURIA to "$packageName.android.MainActivityFuria",
                RastroLogoMood.TRISTE to "$packageName.android.MainActivityTriste"
            )

            val targetAlias = aliases[mood] ?: aliases[RastroLogoMood.BASE]!!
            val targetComponent = android.content.ComponentName(packageName, targetAlias)

            val currentSetting = pm.getComponentEnabledSetting(targetComponent)
            if (currentSetting == android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_ENABLED) {
                return
            }

            // 1. Habilitar primero el alias deseado para evitar iconos desaparecidos
            pm.setComponentEnabledSetting(
                targetComponent,
                android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_ENABLED,
                android.content.pm.PackageManager.DONT_KILL_APP
            )

            // 2. Deshabilitar los demás alias para no duplicar iconos
            aliases.values.forEach { alias ->
                if (alias != targetAlias) {
                    val comp = android.content.ComponentName(packageName, alias)
                    pm.setComponentEnabledSetting(
                        comp,
                        android.content.pm.PackageManager.COMPONENT_ENABLED_STATE_DISABLED,
                        android.content.pm.PackageManager.DONT_KILL_APP
                    )
                }
            }
        } catch (_: Throwable) {
            // Protección contra fallos en entornos con permisos restringidos
        }
    }

    /**
     * Establece un override para pruebas/QA sin alterar datos reales del usuario.
     */
    fun setDebugOverride(mood: RastroLogoMood?) {
        RastroLogoEvaluator.debugOverride = mood
        recomputeMood()
    }

    /**
     * Limpia el override de pruebas.
     */
    fun clearDebugOverride() {
        RastroLogoEvaluator.clearDebugOverride()
        recomputeMood()
    }
}
