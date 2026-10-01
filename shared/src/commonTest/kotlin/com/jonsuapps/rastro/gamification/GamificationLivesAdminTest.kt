package com.jonsuapps.rastro.gamification

import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertTrue

class GamificationLivesAdminTest {

    @Test
    fun testMaxLivesExtremes() {
        // Test values: 1, 10, 600, 1000000
        val testValues = listOf(1, 10, 600, 1_000_000)

        for (max in testValues) {
            GamificationManager.setMaxHearts(max)
            assertEquals(max, GamificationManager.maxHearts.value, "maxHearts debe configurarse exactamente a $max")
            assertTrue(GamificationManager.hearts.value in 0..max, "hearts debe estar acotado entre 0 y $max")
        }
    }

    @Test
    fun testRecoveryIntervalCalculationNoOverflow() {
        // 1 segundo, 30 segundos, 3 minutos, 2 horas, 7 días, 1 año, 30 años
        val intervals = listOf(
            Triple(1L, LifeRecoveryUnit.SEGUNDOS, 1_000L),
            Triple(30L, LifeRecoveryUnit.SEGUNDOS, 30_000L),
            Triple(3L, LifeRecoveryUnit.MINUTOS, 180_000L),
            Triple(2L, LifeRecoveryUnit.HORAS, 7_200_000L),
            Triple(7L, LifeRecoveryUnit.DIAS, 604_800_000L),
            Triple(1L, LifeRecoveryUnit.ANIOS, 31_557_600_000L),
            Triple(30L, LifeRecoveryUnit.ANIOS, 946_728_000_000L)
        )

        for ((amount, unit, expectedMillis) in intervals) {
            val calculated = GamificationManager.calculateIntervalMillis(amount, unit)
            assertEquals(expectedMillis, calculated, "El intervalo para $amount ${unit.name} debe ser exacto sin overflow")
            assertTrue(calculated > 0L, "El intervalo debe ser positivo")
        }

        // Caso super extremo (ej: 1000 años o Long.MAX_VALUE)
        val extremeMillis = GamificationManager.calculateIntervalMillis(1000L, LifeRecoveryUnit.ANIOS)
        assertTrue(extremeMillis > 0L, "1000 años debe caber en Long positivo sin overflow")
    }

    @Test
    fun testNormalExampleFromSpecification() {
        // Admin configura:
        // Máximo = 10, Recuperación = 3 minutos
        GamificationManager.setMaxHearts(10)
        GamificationManager.setRecoveryConfig(3L, LifeRecoveryUnit.MINUTOS)

        val t0 = 1_000_000_000L
        GamificationManager.refillHearts(0)
        GamificationManager.loseHeart(t0) // Fuerza timestamp inicial t0 con 0 vidas

        val threeMinMillis = 3 * 60 * 1000L

        // 3 min -> 1/10
        GamificationManager.updateHeartRegeneration(t0 + threeMinMillis)
        assertEquals(1, GamificationManager.hearts.value, "A los 3 minutos debe tener 1/10")

        // 6 min -> 2/10
        GamificationManager.updateHeartRegeneration(t0 + 2 * threeMinMillis)
        assertEquals(2, GamificationManager.hearts.value, "A los 6 minutos debe tener 2/10")

        // 30 min -> 10/10
        GamificationManager.updateHeartRegeneration(t0 + 10 * threeMinMillis)
        assertEquals(10, GamificationManager.hearts.value, "A los 30 minutos debe tener 10/10 (lleno)")
        assertEquals(0L, GamificationManager.lastHeartLostTimestamp.value, "Al llenarse, el timestamp debe ser 0L")
    }

    @Test
    fun testFastExampleFromSpecification() {
        // Admin configura:
        // Máximo = 10, Recuperación = 1 segundo
        GamificationManager.setMaxHearts(10)
        GamificationManager.setRecoveryConfig(1L, LifeRecoveryUnit.SEGUNDOS)

        val t0 = 2_000_000_000L
        GamificationManager.refillHearts(0)
        // Fijamos timestamp t0
        GamificationManager.loseHeart(t0)

        // 1 segundo -> 1/10
        GamificationManager.updateHeartRegeneration(t0 + 1000L)
        assertEquals(1, GamificationManager.hearts.value, "A 1 segundo debe tener 1/10")

        // 2 segundos -> 2/10
        GamificationManager.updateHeartRegeneration(t0 + 2000L)
        assertEquals(2, GamificationManager.hearts.value, "A 2 segundos debe tener 2/10")

        // 10 segundos -> 10/10
        GamificationManager.updateHeartRegeneration(t0 + 10000L)
        assertEquals(10, GamificationManager.hearts.value, "A 10 segundos debe tener 10/10")
    }

    @Test
    fun testExtreme30YearsExample() {
        // Admin configura:
        // Máximo = 10, Recuperación = 30 años
        GamificationManager.setMaxHearts(10)
        GamificationManager.setRecoveryConfig(30L, LifeRecoveryUnit.ANIOS)

        val t0 = 10_000_000_000L
        GamificationManager.refillHearts(0)
        GamificationManager.loseHeart(t0)

        val thirtyYearsMillis = GamificationManager.calculateIntervalMillis(30L, LifeRecoveryUnit.ANIOS)

        // Tras 15 años (mitad del intervalo) -> 0 vidas recuperadas
        GamificationManager.updateHeartRegeneration(t0 + thirtyYearsMillis / 2)
        assertEquals(0, GamificationManager.hearts.value, "A los 15 años no ha cumplido el intervalo de 30 años")

        // Tras 30 años exactos -> 1 vida recuperada
        GamificationManager.updateHeartRegeneration(t0 + thirtyYearsMillis)
        assertEquals(1, GamificationManager.hearts.value, "A los 30 años exactos debe tener 1/10")
    }

    @Test
    fun testAppClosedRecoverySimulation() {
        // Simular que el usuario queda 0/10 a las 12:00 con recuperación de 3 minutos
        val t0 = 1_700_000_000_000L
        GamificationManager.setMaxHearts(10)
        GamificationManager.setRecoveryConfig(3L, LifeRecoveryUnit.MINUTOS)
        GamificationManager.refillHearts(0)
        GamificationManager.loseHeart(t0)

        // Estado persistido antes de cerrar la app (Serialización a JSON)
        val savedState = GamificationManager.state.value
        val encodedJson = GamificationStateCodec.encode(savedState)

        // El usuario CIERRA la app. Pasan 30 minutos sin procesos en memoria.
        val thirtyMinutesLater = t0 + (30 * 60 * 1000L)

        // El usuario abre la app 30 minutos después: Deserialización y restore
        val loadedState = GamificationStateCodec.decode(encodedJson)
        GamificationManager.restore(loadedState)

        // La regeneración matemática calcula el tiempo transcurrido
        GamificationManager.updateHeartRegeneration(thirtyMinutesLater)

        assertEquals(10, GamificationManager.hearts.value, "Al abrir la app 30 min después debe tener 10/10")
        assertEquals(10, GamificationManager.maxHearts.value)
    }

    @Test
    fun testAdminIncreasesMaxRule() {
        // Regla: Si Admin aumenta el máximo: nuevoMax - antiguoMax se añade como capacidad/vidas adicionales
        GamificationManager.refillHearts(5) // reset baseline

        // Caso 1: 0/3 -> Admin cambia a 10 -> 7/10
        GamificationManager.setMaxHearts(3)
        GamificationManager.refillHearts(0)
        assertEquals(0, GamificationManager.hearts.value)
        assertEquals(3, GamificationManager.maxHearts.value)

        GamificationManager.setMaxHearts(10)
        assertEquals(10, GamificationManager.maxHearts.value)
        assertEquals(7, GamificationManager.hearts.value, "0/3 al cambiar a 10 debe resultar en 7/10")

        // Caso 2: 2/3 -> Admin cambia a 10 -> 9/10
        GamificationManager.setMaxHearts(3)
        GamificationManager.refillHearts(2)
        assertEquals(2, GamificationManager.hearts.value)

        GamificationManager.setMaxHearts(10)
        assertEquals(10, GamificationManager.maxHearts.value)
        assertEquals(9, GamificationManager.hearts.value, "2/3 al cambiar a 10 debe resultar en 9/10")

        // Caso 3: 3/3 -> Admin cambia a 10 -> 10/10
        GamificationManager.setMaxHearts(3)
        GamificationManager.refillHearts(3)
        assertEquals(3, GamificationManager.hearts.value)

        GamificationManager.setMaxHearts(10)
        assertEquals(10, GamificationManager.maxHearts.value)
        assertEquals(10, GamificationManager.hearts.value, "3/3 al cambiar a 10 debe resultar en 10/10")
    }

    @Test
    fun testContinuousRegenerationAfterMaxIncrease() {
        // Ejemplo de la especificación:
        // 0/3 -> Admin cambia a 10 -> 7/10
        // Config: 1 vida cada 3 minutos
        // 3 min -> 8/10
        // 6 min -> 9/10
        // 9 min -> 10/10
        GamificationManager.setMaxHearts(3)
        GamificationManager.refillHearts(0)
        val t0 = 1_000_000_000L
        GamificationManager.loseHeart(t0)

        GamificationManager.setRecoveryConfig(3L, LifeRecoveryUnit.MINUTOS)
        GamificationManager.setMaxHearts(10)
        assertEquals(7, GamificationManager.hearts.value)

        val threeMin = 3 * 60 * 1000L

        // 3 min -> 8/10
        GamificationManager.updateHeartRegeneration(t0 + threeMin)
        assertEquals(8, GamificationManager.hearts.value, "A los 3 min debe tener 8/10")

        // 6 min -> 9/10
        GamificationManager.updateHeartRegeneration(t0 + 2 * threeMin)
        assertEquals(9, GamificationManager.hearts.value, "A los 6 min debe tener 9/10")

        // 9 min -> 10/10
        GamificationManager.updateHeartRegeneration(t0 + 3 * threeMin)
        assertEquals(10, GamificationManager.hearts.value, "A los 9 min debe tener 10/10")
    }

    @Test
    fun testAdminReducesMaxRule() {
        // Regla:
        // 3/10 -> máximo 5 -> 3/5
        // 8/10 -> máximo 5 -> 5/5
        // Nunca currentLives < 0 ni > maxLives

        // Caso 1: 3/10 -> máximo 5 -> 3/5
        GamificationManager.setMaxHearts(10)
        GamificationManager.refillHearts(3)
        assertEquals(3, GamificationManager.hearts.value)

        GamificationManager.setMaxHearts(5)
        assertEquals(5, GamificationManager.maxHearts.value)
        assertEquals(3, GamificationManager.hearts.value, "3/10 al cambiar a máximo 5 debe ser 3/5")

        // Caso 2: 8/10 -> máximo 5 -> 5/5
        GamificationManager.setMaxHearts(10)
        GamificationManager.refillHearts(8)
        assertEquals(8, GamificationManager.hearts.value)

        GamificationManager.setMaxHearts(5)
        assertEquals(5, GamificationManager.maxHearts.value)
        assertEquals(5, GamificationManager.hearts.value, "8/10 al cambiar a máximo 5 debe ser 5/5")
    }

    @Test
    fun testAdminChangesRecoveryRateDynamically() {
        // Antes: 1 vida / 30 minutos
        // Después: 1 vida / 3 minutos
        GamificationManager.setMaxHearts(10)
        GamificationManager.setRecoveryConfig(30L, LifeRecoveryUnit.MINUTOS)

        val t0 = 1_000_000_000L
        GamificationManager.refillHearts(0)
        GamificationManager.loseHeart(t0)

        // Han pasado 15 minutos (mitad del intervalo anterior)
        val t15 = t0 + (15 * 60 * 1000L)
        GamificationManager.updateHeartRegeneration(t15)
        assertEquals(0, GamificationManager.hearts.value, "Con 30 min, a los 15 min tiene 0 vidas")

        // Admin cambia a 3 minutos a los 15 minutos:
        // 15 minutos transcurridos / 3 minutos = 5 vidas recuperadas
        GamificationManager.setRecoveryConfig(3L, LifeRecoveryUnit.MINUTOS, t15)
        assertEquals(5, GamificationManager.hearts.value, "Bajo la nueva tasa de 3 min, los 15 min acumulados otorgan 5 vidas")

        // 3 minutos más tarde (t = 18 min):
        val t18 = t0 + (18 * 60 * 1000L)
        GamificationManager.updateHeartRegeneration(t18)
        assertEquals(6, GamificationManager.hearts.value, "A los 18 minutos debe tener 6/10")
    }
}
