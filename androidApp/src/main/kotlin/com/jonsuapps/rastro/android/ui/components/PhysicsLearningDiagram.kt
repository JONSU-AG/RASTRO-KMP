package com.jonsuapps.rastro.android.ui.components

/** Explicit presentation mapping. Unmapped lessons never receive a guessed or unrelated drawing. */
internal enum class PhysicsLearningDiagram(val title: String, val caption: String) {
    DIMENSIONS("De las magnitudes a sus dimensiones", "La masa tiene dimensión M y la aceleración LT⁻². Al multiplicarlas obtenemos la dimensión de una fuerza. Los símbolos dimensionales no son las unidades: M representa masa; kg es su unidad del SI."),
    VECTORS("Suma de vectores", "Ejemplo ilustrativo: A = (3, 0), B = (0, 2). R = A + B = (3, 2). Trasladar B no cambia su dirección ni su magnitud."),
    COMPONENTS("Componentes rectangulares", "Ejemplo ilustrativo: A = (3, 2) u. Sus proyecciones son Ax = 3 u y Ay = 2 u; no son vectores adicionales."),
    MRU("Movimiento rectilíneo uniforme", "Ejemplo ilustrativo: x₀ = 0 m, v = 2 m/s. En tiempos iguales recorre distancias iguales; a = 0."),
    MRUV("Movimiento con aceleración constante", "Ejemplo ilustrativo: x₀ = 0 m, v₀ = 0 m/s, a = 2 m/s². Compara posición, velocidad y aceleración en el mismo instante."),
    PROJECTILE("Trayectoria de un proyectil", "Ejemplo ilustrativo sin resistencia del aire: vx = 4 m/s, vy₀ = 4.9 m/s, g = 9.8 m/s². Sale y llega a la misma altura."),
    FORCES("Fuerzas sobre un bloque", "Ejemplo ilustrativo: bloque de 2 kg sobre una superficie horizontal. N = P = 19.6 N; F = 6 N y f = 2 N. La resultante horizontal es 4 N y a = 2 m/s²."),
    OHM("Voltaje y corriente", "Ejemplo ilustrativo de un conductor óhmico con R = 4 Ω constante. La pendiente de V frente a I es la resistencia; no todos los materiales son óhmicos.");

    companion object {
        fun forLesson(id: String, title: String): PhysicsLearningDiagram? {
            if (!id.startsWith("fis_")) return null
            val normalized = java.text.Normalizer.normalize(title, java.text.Normalizer.Form.NFD)
                .replace(Regex("\\p{M}+"), "").lowercase(java.util.Locale.ROOT)
            // Resource and legacy catalogs reuse IDs for different topics. Validate the actual title.
            if (id == "fis_t01_s01" && ("magnitudes" in normalized || "dimensional" in normalized)) return DIMENSIONS
            if (normalized.startsWith("cinematica -")) return if (id.endsWith("s01")) MRU else MRUV
            if (normalized.startsWith("dinamica -")) return FORCES
            if (normalized.startsWith("electricidad -")) return OHM
            if (id == "fis_t01_s02" && normalized.startsWith("la fisica, magnitudes y vectores")) return VECTORS
            return when {
                "paralelogramo" in normalized -> VECTORS
                "descomposicion rectangular" in normalized -> COMPONENTS
                "rectilineo uniforme (mru)" in normalized -> MRU
                ("uniformemente variado" in normalized && "circular" !in normalized) || "graficas cinematicas" in normalized -> MRUV
                "parabol" in normalized -> PROJECTILE
                "fuerzas, dcl" in normalized || "segunda ley de newton" in normalized -> FORCES
                "ley de ohm" in normalized -> OHM
                else -> null
            }
        }
        fun forFormula(id: String): PhysicsLearningDiagram? = when (id) {
            "fis_mru_rapidez" -> MRU
            "fis_mruv_aceleracion", "fis_mruv_distancia" -> MRUV
            "fis_newton_fuerza" -> FORCES
            "fis_ohm" -> OHM
            else -> null
        }
    }
}

internal object PhysicsDiagramMath {
    fun position(time: Float, velocity: Float, acceleration: Float = 0f) = velocity * time + 0.5f * acceleration * time * time
    fun velocity(time: Float, initial: Float, acceleration: Float) = initial + acceleration * time
    fun projectileHeight(time: Float) = 4.9f * time - 0.5f * 9.8f * time * time
    fun voltage(current: Float) = 4f * current
}
