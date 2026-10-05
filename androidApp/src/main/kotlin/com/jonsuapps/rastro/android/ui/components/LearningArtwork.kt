package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import android.media.MediaPlayer
import android.os.SystemClock
import androidx.compose.foundation.Canvas
import androidx.compose.ui.graphics.drawscope.inset
import androidx.compose.ui.unit.sp
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import com.jonsuapps.rastro.android.ui.mascots.loki.*
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.window.Dialog
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleEventObserver
import androidx.lifecycle.compose.LocalLifecycleOwner
import com.airbnb.lottie.LottieAnimationView
import com.airbnb.lottie.LottieDrawable
import com.jonsuapps.rastro.theme.ThemeManager
import com.jonsuapps.rastro.theme.CartoonFinish
import com.jonsuapps.rastro.R

enum class ClassicCharacter(val folder: String) { LOKI("Loki"), ORSTTY("Orstty"), ARTYON("Artyon") }
enum class ClassicAppearance(val file: String, val loop: Boolean = true) {
    STUDY("secuencia_una_idea_nueva"), RETRY("secuencia_volver_a_intentar"),
    LEAVE("no_te_vayas"), ACHIEVEMENT("secuencia_meta_cumplida", false),
    EXPLOSION("leer_lanzar_explosion", false), STREAK("racha"), NEW_IDEA("idea_nueva", false),
    IN_LOVE("enamorado", false), HAPPY("feliz", false), SAD("triste", false), ANGRY("enojado", false),
    SLEEP("dormir"), KNOCKED_OUT("noqueado"), WELCOME("bienvenida")
}

/** Session variety; remembered UI selections do not draw again during recomposition. */
internal class VarietySelector<T> {
    private var last: T? = null
    private var consecutive = 0
    fun choose(valid: List<T>, random: kotlin.random.Random = kotlin.random.Random.Default): T {
        val choices = valid.distinct()
        require(choices.isNotEmpty())
        val alternatives = if (consecutive >= 2) choices.filter { it != last } else choices
        // A singleton result (non-perfect success = explosion) is the authorized exception.
        val chosen = (alternatives.ifEmpty { choices }).random(random)
        consecutive = if (chosen == last) consecutive + 1 else 1
        last = chosen
        return chosen
    }
}

object LearningArtworkResolver {
    const val EXPLOSION_SECONDS = 5.1f
    private val characters = VarietySelector<ClassicCharacter>()
    private val emotions = VarietySelector<ClassicAppearance>()
    fun character(random: kotlin.random.Random = kotlin.random.Random.Default): ClassicCharacter =
        characters.choose(ClassicCharacter.entries, random)
    fun explosionCharacter(random: kotlin.random.Random = kotlin.random.Random.Default): ClassicCharacter = character(random)
    fun victoryChoices(stars: Int): List<ClassicAppearance> = when {
        stars >= 3 -> listOf(ClassicAppearance.HAPPY, ClassicAppearance.IN_LOVE)
        stars == 2 -> listOf(ClassicAppearance.EXPLOSION)
        else -> listOf(ClassicAppearance.SAD, ClassicAppearance.ANGRY)
    }
    fun appearance(valid: List<ClassicAppearance>, random: kotlin.random.Random = kotlin.random.Random.Default): ClassicAppearance =
        emotions.choose(valid, random)
    fun victoryAppearance(stars: Int, random: kotlin.random.Random = kotlin.random.Random.Default): ClassicAppearance =
        appearance(victoryChoices(stars), random)
}

enum class LearningSound { COFRE, COMPLETADO, CORRECTA, INCORRECTA, LEVELUP, OPCIONES, EXPLOSION }

/** One player per visible flow. Specific events replace generic feedback; release on exit. */
class LearningAudio(private val context: Context) {
    companion object {
        private var currentOwner: LearningAudio? = null
        private var lastSpecific = 0L
    }
    private var player: MediaPlayer? = null
    private var optionPool: android.media.SoundPool? = null
    private var specificPlaying = false
    private val events = mutableSetOf<String>()
    fun play(sound: LearningSound, event: String? = null) {
        if (event != null && !events.add(event)) return
        if (!context.getSharedPreferences("rastro_preferences", Context.MODE_PRIVATE)
                .getBoolean("sounds_enabled", true)) return
        val now = SystemClock.uptimeMillis()
        if (sound == LearningSound.OPCIONES && (now - lastSpecific < 300 || currentOwner?.specificPlaying == true)) return
        if (sound != LearningSound.OPCIONES) lastSpecific = now
        currentOwner?.takeIf { it !== this }?.releasePlayer()
        releasePlayer()
        currentOwner = this
        specificPlaying = sound != LearningSound.OPCIONES
        // OPCIONES is a very short effect (2507 bytes). Use Android's short-sample
        // decoder instead of the streaming MediaPlayer that failed in device Logcat.
        if (sound == LearningSound.OPCIONES) {
            val pool = android.media.SoundPool.Builder().setMaxStreams(1)
                .setAudioAttributes(android.media.AudioAttributes.Builder()
                    .setUsage(android.media.AudioAttributes.USAGE_ASSISTANCE_SONIFICATION)
                    .setContentType(android.media.AudioAttributes.CONTENT_TYPE_SONIFICATION).build()).build()
            optionPool = pool
            pool.setOnLoadCompleteListener { loaded, sample, status ->
                if (optionPool === loaded) {
                    if (status == 0) loaded.play(sample, 1f, 1f, 1, 0, 1f)
                    else android.util.Log.e("LearningAudio", "OPCIONES: sample decode error $status")
                    android.os.Handler(android.os.Looper.getMainLooper()).postDelayed({
                        if (optionPool === loaded) releasePlayer()
                    }, 500L)
                }
            }
            try {
                context.assets.openFd("SONIDOS/OPCIONES.mp3").use { pool.load(it, 1) }
            } catch (error: java.io.IOException) {
                android.util.Log.e("LearningAudio", "OPCIONES: unavailable sample", error)
                releasePlayer()
            }
            return
        }
        val candidate = MediaPlayer()
        player = candidate
        try {
            context.assets.openFd("SONIDOS/${sound.name}.mp3").use { file ->
                candidate.apply {
                setDataSource(file.fileDescriptor, file.startOffset, file.length)
                setOnCompletionListener { completed -> if (player === completed) releasePlayer() }
                setOnErrorListener { failed, what, extra ->
                    android.util.Log.e("LearningAudio", "${sound.name}: decoder error $what/$extra")
                    if (player === failed) releasePlayer()
                    true
                }
                setOnPreparedListener { ready -> if (player === ready) ready.start() }
                prepareAsync()
                }
            }
        } catch (error: java.io.IOException) {
            android.util.Log.e("LearningAudio", "${sound.name}: unavailable audio", error)
            releasePlayer()
        } catch (error: IllegalStateException) {
            android.util.Log.e("LearningAudio", "${sound.name}: invalid player state", error)
            releasePlayer()
        }
    }
    private fun releasePlayer() {
        player?.release(); player = null
        optionPool?.release(); optionPool = null
        specificPlaying = false
        if (currentOwner === this) currentOwner = null
    }
    fun release() = releasePlayer()
}

@Composable fun rememberLearningAudio(): LearningAudio {
    val context = LocalContext.current.applicationContext
    val audio = remember(context) { LearningAudio(context) }
    val owner = LocalLifecycleOwner.current
    DisposableEffect(audio, owner) {
        val observer = LifecycleEventObserver { _, event -> if (event == Lifecycle.Event.ON_STOP) audio.release() }
        owner.lifecycle.addObserver(observer)
        // Navigation may unmount this flow immediately after a click. Its finite sound
        // finishes and releases itself; a newer event replaces it, background stops it.
        onDispose { owner.lifecycle.removeObserver(observer) }
    }
    return audio
}

@Composable private fun artworkActive(): Boolean {
    val owner = LocalLifecycleOwner.current
    var active by remember(owner) { mutableStateOf(owner.lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED)) }
    DisposableEffect(owner) {
        val observer = LifecycleEventObserver { _, _ -> active = owner.lifecycle.currentState.isAtLeast(Lifecycle.State.STARTED) }
        owner.lifecycle.addObserver(observer)
        onDispose { owner.lifecycle.removeObserver(observer) }
    }
    return active
}

/** Calls the actual Laboratory rig and its shared playback; no raster character assets. */
@Composable fun ClassicArtwork(
    appearance: ClassicAppearance,
    modifier: Modifier = Modifier,
    character: ClassicCharacter = remember { LearningArtworkResolver.character() },
    speed: Float = 1f,
    onExplosion: () -> Unit = {}
) {
    val theme = ThemeManager.currentTheme
    val callback by rememberUpdatedState(onExplosion)
    androidx.compose.runtime.key(character, appearance) {
        val seconds = when (appearance) {
            ClassicAppearance.EXPLOSION -> LearningArtworkResolver.EXPLOSION_SECONDS
            ClassicAppearance.ACHIEVEMENT -> LokiSequence.ACHIEVEMENT.seconds
            ClassicAppearance.NEW_IDEA -> LokiSequence.STUDY.seconds
            ClassicAppearance.WELCOME -> LokiSequence.WELCOME.seconds
            ClassicAppearance.STUDY, ClassicAppearance.RETRY -> 4.8f
            else -> 4f
        }
        val playback = rememberLokiPlayback("learning/$character/$appearance", seconds)
        SideEffect { playback.loop = appearance.loop; playback.speed = speed.coerceIn(.25f, 5f) }
        val species = when (character) {
            ClassicCharacter.LOKI -> LokiSpecies.LOKI
            ClassicCharacter.ORSTTY -> LokiSpecies.ORSTTY
            ClassicCharacter.ARTYON -> LokiSpecies.ARTYON
        }
        val model = remember(species) { LokiTemplate.base(species).withArtStyle(LokiArtStyle.CLASSIC) }
        val mood = when (appearance) {
            ClassicAppearance.LEAVE -> LokiClassicMood.PLEADING
            ClassicAppearance.STREAK -> LokiClassicMood.STREAK
            ClassicAppearance.IN_LOVE -> LokiClassicMood.IN_LOVE
            ClassicAppearance.HAPPY -> LokiClassicMood.HAPPY
            ClassicAppearance.SAD -> LokiClassicMood.SAD
            ClassicAppearance.ANGRY -> LokiClassicMood.ANGRY
            ClassicAppearance.SLEEP -> LokiClassicMood.SLEEPING
            ClassicAppearance.KNOCKED_OUT -> LokiClassicMood.KNOCKED_OUT
            ClassicAppearance.STUDY, ClassicAppearance.RETRY -> LokiClassicMood.DOUBTFUL
            else -> LokiClassicMood.NORMAL
        }
        val p = playback.progress
        val frame = when (appearance) {
            ClassicAppearance.EXPLOSION -> sampleLearningExplosion(p)
            ClassicAppearance.ACHIEVEMENT -> sampleLokiSequence(LokiSequence.ACHIEVEMENT, p)
            ClassicAppearance.NEW_IDEA -> sampleLokiSequence(LokiSequence.STUDY, p)
            ClassicAppearance.WELCOME -> sampleLokiSequence(LokiSequence.WELCOME, p)
            ClassicAppearance.STUDY -> sampleLoki(LokiEmotion.THINKING, LokiMotion.PONDER, p)
            ClassicAppearance.RETRY -> sampleLoki(LokiEmotion.CONFUSED, LokiMotion.SHRUG, p)
            else -> sampleLoki(LokiEmotion.NEUTRAL, LokiMotion.BREATHE, p)
        }
        var exploded by remember { mutableStateOf(false) }
        LaunchedEffect(frame.paperGag?.blast?.let { it > .001f } == true) {
            if (!exploded && (frame.paperGag?.blast ?: 0f) > .001f) { exploded = true; callback() }
        }
        val backdrop = if (theme.isDark && character == ClassicCharacter.LOKI) theme.surfaceAccent
            else androidx.compose.ui.graphics.Color.Transparent
        Canvas(modifier.clip(RoundedCornerShape(18.dp)).background(backdrop)
            .semantics { contentDescription = "${character.folder} Classic · $appearance" }) {
            drawLoki(frame, model, effectProgress = p, classicMood = mood)
        }
    }
}

/** Only the reading interval is shortened by 1.7 s; throwing/boom keep their original timing. */
internal fun sampleLearningExplosion(progress: Float): LokiFrame {
    val seconds = progress.coerceIn(0f, 1f) * LearningArtworkResolver.EXPLOSION_SECONDS
    val sourceSeconds = when {
        seconds <= .25f -> seconds
        seconds < 1.55f -> .25f + (seconds - .25f) * (3f / 1.3f)
        else -> seconds + 1.7f
    }
    return sampleLokiPaperGag(sourceSeconds / LOKI_PAPER_GAG_SECONDS)
}

/** Same stars, score cards and counters as the Laboratory, supplied with real lesson data. */
@Composable fun LearningResultsArtwork(stars: Int, answers: Int, earnedXp: Int, totalXp: Int,
    modifier: Modifier = Modifier, compact: Boolean = false, earnedCoins: Int = 0) {
    val theme = ThemeManager.currentTheme
    val playback = rememberLokiPlayback("learning/results", RewardScene.RESULTS.seconds)
    SideEffect {
        playback.loop = false
        playback.speed = if (compact) 1.3f else 1f
    }
    val settings = remember(stars, answers, earnedXp, totalXp, earnedCoins, compact) {
        RewardSettings(scene = RewardScene.RESULTS, stars = stars,
            labels = if (compact) listOf("Aciertos", "XP obtenida", "Monedas") else listOf("Aciertos", "XP de la lección", "XP acumulada"),
            values = if (compact) listOf(answers, earnedXp, earnedCoins) else listOf(answers, earnedXp, totalXp))
    }
    val text = remember { RewardTextPainter() }
    val scoreFont = remember { FontFamily(Font(R.font.welcome_lilita_one, FontWeight.Black)) }
    val scoreSurface = theme.surfaceAccent
    val scoreInk = contrastingText(scoreSurface)
    val context = LocalContext.current
    val owner = LocalLifecycleOwner.current
    LaunchedEffect(playback, compact, settings.values, stars, owner) {
        if (!compact) return@LaunchedEffect
        var previous = playback.progress * RewardScene.RESULTS.seconds
        snapshotFlow { playback.progress }.collect { progress ->
            val seconds = progress * RewardScene.RESULTS.seconds
            if (owner.lifecycle.currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                when (LessonResultTiming.pulse(previous, seconds, settings.values, stars)) {
                    LessonResultTiming.Pulse.COUNT -> DuolingoHaptics.playResultCountTick(context)
                    LessonResultTiming.Pulse.STAR -> DuolingoHaptics.playResultStarImpact(context)
                    null -> Unit
                }
            }
            previous = seconds
        }
    }
    if (compact) Column(modifier, verticalArrangement = Arrangement.spacedBy(4.dp)) {
        Canvas(Modifier.weight(1f).fillMaxWidth().semantics { contentDescription = "$stars de 3 estrellas" }) {
            // Extra virtual height keeps stars large instead of shrinking them with the score area.
            val extra = ((size.width / 320f * 280f - size.height) / 2f).coerceAtLeast(0f)
            inset(horizontal = 0f, vertical = -extra) {
                val starProgress = ((playback.progress * RewardScene.RESULTS.seconds - 3.95f) / RewardScene.STARS.seconds).coerceIn(0f, 1f)
                drawLokiReward(settings.copy(scene = RewardScene.STARS), starProgress, text, theme)
            }
        }
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.spacedBy(6.dp)) {
            settings.labels.forEachIndexed { index, label ->
                Sticker3dCard(modifier = Modifier.weight(1f), shape = RoundedCornerShape(12.dp),
                    containerColor = scoreSurface, strokeColor = CartoonFinish.ink(theme), strokeWidth = 2.5.dp,
                    bevelColor = lerp(theme.cardBevel, theme.accent, .28f), bevelHeight = 2.dp) {
                  Column(Modifier.fillMaxWidth().padding(6.dp), horizontalAlignment = Alignment.CenterHorizontally) {
                    Text(label, fontSize = 10.sp,
                        fontFamily = scoreFont, fontWeight = FontWeight.Black, color = scoreInk, maxLines = 1)
                    val count = LessonResultTiming.count(settings.values[index], index, playback.progress * RewardScene.RESULTS.seconds)
                    Text(count.toString(), fontFamily = scoreFont, fontWeight = FontWeight.Black, color = scoreInk,
                        maxLines = 1)
                  }
                }
            }
        }
    } else Canvas(modifier.semantics { contentDescription = "$answers aciertos, $earnedXp XP, $stars de 3 estrellas" }) {
        drawLokiReward(settings, playback.progress, text, theme, resultStarRadius = 38f)
    }
}

@Composable fun PreparedAnimation(name: String, modifier: Modifier = Modifier, loop: Boolean = false,
    static: Boolean = false, onProgress: (Float) -> Unit = {}) {
    val callback by rememberUpdatedState(onProgress)
    val active = artworkActive()
    androidx.compose.runtime.key(name, loop, static) {
        AndroidView(modifier = modifier, factory = { context ->
            LottieAnimationView(context).apply {
                tag = active
                setAnimation("ANIMACION/$name.json")
                repeatCount = if (loop && !static) LottieDrawable.INFINITE else 0
                addAnimatorUpdateListener { callback(progress) }
                addLottieOnCompositionLoadedListener {
                    if (static) progress = 0.55f else if (tag == true) playAnimation()
                }
            }
        }, update = {
            val wasActive = it.tag == true
            it.tag = active
            if (!active) it.pauseAnimation()
            else if (!wasActive && !static && (loop || it.progress < 1f)) it.resumeAnimation()
        }, onRelease = { it.cancelAnimation(); it.removeAllUpdateListeners() })
    }
}

/** New celebrations and help have one clear action and remain readable on small screens. */
@Composable fun LearningCelebrationDialog(title: String, message: String, onContinue: () -> Unit,
    artwork: @Composable () -> Unit) {
    val theme = ThemeManager.currentTheme
    Dialog(onDismissRequest = onContinue) {
        Sticker3dCard(containerColor = theme.surface, strokeColor = theme.strokeBorder,
            bevelColor = theme.cardBevel, shape = RoundedCornerShape(24.dp)) {
            Column(Modifier.fillMaxWidth().heightIn(max = 620.dp).verticalScroll(rememberScrollState()).padding(20.dp),
                horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.spacedBy(14.dp)) {
                artwork()
                Text(title, color = theme.textPrimary, fontWeight = FontWeight.Black)
                Text(message, color = theme.textSecondary)
                Sticker3dButton(onClick = onContinue, modifier = Modifier.fillMaxWidth(),
                    containerColor = theme.accent, bottomBevelColor = theme.accentBevel) {
                    Text(if (title == "Ayuda") "¡ENTENDIDO!" else "CONTINUAR", color = contrastingText(theme.accent), fontWeight = FontWeight.Bold)
                }
            }
        }
    }
}
