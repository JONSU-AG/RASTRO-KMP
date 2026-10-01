package com.jonsuapps.rastro.logo

import kotlin.test.*

class RastroLogoEvaluatorTest {

    @BeforeTest
    fun setUp() {
        LogoMoodConfig.resetToDefaults()
        RastroLogoEvaluator.clearDebugOverride()
    }

    @AfterTest
    fun tearDown() {
        RastroLogoEvaluator.clearDebugOverride()
    }

    @Test
    fun testUserActiveReturnsBase() {
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 2,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.BASE, mood, "Usuario activo debe ver LOGOBASE")
    }

    @Test
    fun testInactiveFirstLevelReturnsEnojo() {
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = LogoMoodConfig.inactiveAngryThresholdHours,
            isUserCurrentlyActive = false
        )
        assertEquals(RastroLogoMood.ENOJO, mood, "Primer nivel de inactividad debe ser LOGO-ENOJO")
    }

    @Test
    fun testInactiveSecondLevelReturnsFuria() {
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = LogoMoodConfig.inactiveFuriousThresholdHours,
            isUserCurrentlyActive = false
        )
        assertEquals(RastroLogoMood.FURIA, mood, "Segundo nivel de inactividad debe ser LOGO-FURIA")
    }

    @Test
    fun testStreakLostReturnsTriste() {
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = true,
            inactiveHours = 5,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.TRISTE, mood, "Racha perdida real debe mostrar LOGOTRISTE")
    }

    @Test
    fun testStreakLostPrecedesInactivity() {
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = true,
            inactiveHours = 100, // Inactividad extrema que normalmente sería FURIA
            isUserCurrentlyActive = false
        )
        assertEquals(RastroLogoMood.TRISTE, mood, "Pérdida de racha tiene máxima prioridad sobre inactividad")
    }

    @Test
    fun testUserReturnFromEnojoReturnsBase() {
        // Usuario estuvo inactivo 30 horas pero acaba de regresar e interactuar en RASTRO
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 0,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.BASE, mood, "Al regresar a RASTRO debe volver automáticamente a BASE")
    }

    @Test
    fun testUserReturnFromFuriaReturnsBase() {
        // Usuario estuvo inactivo 80 horas pero acaba de regresar e interactuar en RASTRO
        val mood = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 0,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.BASE, mood, "Al regresar a RASTRO debe volver automáticamente a BASE")
    }

    @Test
    fun testCentralizedThresholdsCanBeConfigured() {
        // Cambiamos configuración centralizada
        LogoMoodConfig.inactiveAngryThresholdHours = 12L
        LogoMoodConfig.inactiveFuriousThresholdHours = 36L

        val moodAt15Hours = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 15,
            isUserCurrentlyActive = false
        )
        assertEquals(RastroLogoMood.ENOJO, moodAt15Hours)

        val moodAt40Hours = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 40,
            isUserCurrentlyActive = false
        )
        assertEquals(RastroLogoMood.FURIA, moodAt40Hours)
    }

    @Test
    fun testDebugOverridePrecedesAllWithoutTouchingUserData() {
        RastroLogoEvaluator.debugOverride = RastroLogoMood.FURIA

        val evaluated = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 0,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.FURIA, evaluated, "debugOverride debe prevalecer para pruebas controladas")

        RastroLogoEvaluator.clearDebugOverride()
        val afterClear = RastroLogoEvaluator.evaluateMood(
            isStreakLost = false,
            inactiveHours = 0,
            isUserCurrentlyActive = true
        )
        assertEquals(RastroLogoMood.BASE, afterClear, "Al limpiar override debe evaluar normalmente")
    }
}
