package com.jonsuapps.rastro.logo

/**
 * Estados emocionales dinámicos del logo de RASTRO.
 * Cada estado representa la situación de actividad o racha del estudiante.
 */
enum class RastroLogoMood {
    /** Usuario activo / regresó a RASTRO */
    BASE,

    /** Primer nivel de inactividad (el usuario lleva un tiempo sin ingresar) */
    ENOJO,

    /** Segundo nivel de inactividad (el usuario lleva aún más tiempo sin ingresar) */
    FURIA,

    /** Estado crítico especial: el usuario perdió su racha de estudio */
    TRISTE
}
