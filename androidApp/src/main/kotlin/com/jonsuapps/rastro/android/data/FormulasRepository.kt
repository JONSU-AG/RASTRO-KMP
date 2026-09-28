package com.jonsuapps.rastro.android.data

/**
 * Representa una variable de fórmula con su símbolo, nombre explicativo y unidad del Sistema Internacional (S.I.).
 */
data class FormulaVar(
    val symbol: String,
    val name: String,
    val unit: String
)

/**
 * Representa un despeje o variante de la fórmula principal.
 */
data class FormulaDespeje(
    val name: String,
    val mathExpression: String
)

/**
 * Elemento de Fórmula Canónica con formato matemático enriquecido:
 * - leftSide: Lado izquierdo de la ecuación (e.g. "v", "a", "x", "E_c", "H_max")
 * - numerator / denominator: Cuando la fórmula es una fracción real destacada (e.g. numerator = "d", denominator = "t")
 * - mainExpression: Expresión matemática completa formateada (con superíndices, subíndices y signos)
 * - radicalExpression: Expresión dentro de un radical si corresponde (e.g. "b² - 4ac")
 */
data class CanonicalFormula(
    val id: String,
    val subject: String, // Física, Química, Trigonometría, Aritmética, Lenguaje, Biología
    val topic: String,
    val level: String, // Básica, Fundamental, Fija UNSA, Atajo
    val name: String,
    val leftSide: String,
    val numerator: String? = null,
    val denominator: String? = null,
    val prefix: String = "",
    val suffix: String = "",
    val mainExpression: String,
    val radicalExpression: String? = null,
    val description: String,
    val vars: List<FormulaVar> = emptyList(),
    val despejes: List<FormulaDespeje> = emptyList(),
    val datoClave: String,
    val mnemotecnia: String = "",
    val graphicType: String? = null
)

object FormulasRepository {

    val allFormulas: List<CanonicalFormula> = listOf(
        // ── FÍSICA ─────────────────────────────────────────────────────────
        CanonicalFormula(
            id = "fis_mru_rapidez",
            subject = "Física",
            topic = "Cinemática MRU",
            level = "Fundamental",
            name = "MRU: Rapidez y Distancia",
            leftSide = "v",
            numerator = "d",
            denominator = "t",
            mainExpression = "v = d / t",
            description = "En el Movimiento Rectilíneo Uniforme la velocidad permanece constante y la aceleración es nula.",
            vars = listOf(
                FormulaVar("v", "Rapidez constante", "m/s"),
                FormulaVar("d", "Distancia recorrida", "m"),
                FormulaVar("t", "Tiempo empleado", "s")
            ),
            despejes = listOf(
                FormulaDespeje("Distancia (d)", "d = v · t"),
                FormulaDespeje("Tiempo (t)", "t = d / v")
            ),
            datoClave = "Mnemotecnia clásica UNSA: 'Diosito lo ve todo' (D = V · T). Cubres la letra que buscas en el triángulo y obtienes el despeje instantáneo."
        ),
        CanonicalFormula(
            id = "fis_mruv_aceleracion",
            subject = "Física",
            topic = "Cinemática MRUV",
            level = "Fundamental",
            name = "MRUV: Aceleración Constante",
            leftSide = "a",
            numerator = "v_f - v_0",
            denominator = "t",
            mainExpression = "a = (v_f - v_0) / t",
            description = "Mide la tasa de cambio de la velocidad respecto al tiempo transcurrido.",
            vars = listOf(
                FormulaVar("a", "Aceleración", "m/s²"),
                FormulaVar("v_f", "Velocidad final", "m/s"),
                FormulaVar("v_0", "Velocidad inicial", "m/s"),
                FormulaVar("t", "Intervalo de tiempo", "s")
            ),
            despejes = listOf(
                FormulaDespeje("Velocidad final", "v_f = v_0 ± a · t"),
                FormulaDespeje("Velocidad inicial", "v_0 = v_f ∓ a · t")
            ),
            datoClave = "Usa '+' si el móvil acelera (aumenta rapidez) y '-' si frena o desacelera."
        ),
        CanonicalFormula(
            id = "fis_mruv_distancia",
            subject = "Física",
            topic = "Cinemática MRUV",
            level = "Fija UNSA",
            name = "MRUV: Distancia con Aceleración",
            leftSide = "d",
            prefix = "v_0 · t ± ",
            numerator = "1",
            denominator = "2",
            suffix = " a · t²",
            mainExpression = "d = v_0 · t ± ½ a · t²",
            description = "Calcula la distancia recorrida conociendo la velocidad inicial y la aceleración en el tiempo t.",
            vars = listOf(
                FormulaVar("d", "Distancia", "m"),
                FormulaVar("v_0", "Rapidez inicial", "m/s"),
                FormulaVar("t", "Tiempo", "s"),
                FormulaVar("a", "Aceleración", "m/s²")
            ),
            despejes = listOf(
                FormulaDespeje("Si parte del reposo (v_0 = 0)", "d = ½ a · t²"),
                FormulaDespeje("Fórmula de Torricelli", "v_f² = v_0² ± 2 · a · d"),
                FormulaDespeje("Distancia promedio", "d = ((v_0 + v_f) / 2) · t")
            ),
            datoClave = "Si un móvil parte del reposo, t = √(2d / a). En el examen UNSA siempre que digan 'parte del reposo', v_0 = 0."
        ),
        CanonicalFormula(
            id = "fis_caida_libre_hmax",
            subject = "Física",
            topic = "Caída Libre Vertical",
            level = "Fija UNSA",
            name = "MVCL: Altura Máxima y Tiempo de Vuelo",
            leftSide = "H_max",
            numerator = "v_0²",
            denominator = "2g",
            mainExpression = "H_max = v_0² / (2g)",
            description = "Altura cumbre en un lanzamiento vertical hacia arriba cuando la velocidad en la cúspide se anula (v = 0).",
            vars = listOf(
                FormulaVar("H_max", "Altura máxima", "m"),
                FormulaVar("v_0", "Rapidez de lanzamiento", "m/s"),
                FormulaVar("g", "Gravedad (aprox 9.8 o 10)", "m/s²")
            ),
            despejes = listOf(
                FormulaDespeje("Tiempo de subida (t_sub)", "t_sub = v_0 / g"),
                FormulaDespeje("Tiempo de vuelo total", "t_vuelo = 2 · t_sub = (2 · v_0) / g"),
                FormulaDespeje("Velocidad de impacto", "v_impacto = v_0 (a la misma altura)")
            ),
            datoClave = "A un mismo nivel horizontal, la rapidez de subida es EXACTAMENTE igual a la rapidez de bajada. El tiempo de subida es igual al tiempo de bajada."
        ),
        CanonicalFormula(
            id = "fis_newton_fuerza",
            subject = "Física",
            topic = "Dinámica Lineal",
            level = "Fundamental",
            name = "Segunda Ley de Newton",
            leftSide = "F_R",
            mainExpression = "F_R = m · a",
            description = "La aceleración que adquiere un cuerpo es directamente proporcional a la fuerza resultante e inversamente proporcional a su masa.",
            vars = listOf(
                FormulaVar("F_R", "Fuerza resultante", "Newton [N] = kg·m/s²"),
                FormulaVar("m", "Masa del cuerpo", "kg"),
                FormulaVar("a", "Aceleración", "m/s²")
            ),
            despejes = listOf(
                FormulaDespeje("Aceleración despejada", "a = F_R / m"),
                FormulaDespeje("Peso del cuerpo (P)", "P = m · g")
            ),
            datoClave = "En el Diagrama de Cuerpo Libre (DCL): F_R = (Fuerzas a favor de 'a') - (Fuerzas en contra de 'a')."
        ),
        CanonicalFormula(
            id = "fis_energia_cinetica",
            subject = "Física",
            topic = "Trabajo y Energía",
            level = "Fundamental",
            name = "Energía Cinética",
            leftSide = "E_c",
            numerator = "1",
            denominator = "2",
            suffix = " m · v²",
            mainExpression = "E_c = ½ m · v²",
            description = "Energía asociada al movimiento de una masa a una determinada rapidez.",
            vars = listOf(
                FormulaVar("E_c", "Energía cinética", "Joule [J]"),
                FormulaVar("m", "Masa", "kg"),
                FormulaVar("v", "Rapidez", "m/s")
            ),
            despejes = listOf(
                FormulaDespeje("Energía Potencial Gravitatoria", "E_pg = m · g · h"),
                FormulaDespeje("Energía Mecánica Total", "E_M = E_c + E_pg + E_pe"),
                FormulaDespeje("Conservación de Energía", "E_M(inicial) = E_M(final)")
            ),
            datoClave = "Si duplicas la rapidez (v se hace 2v), ¡la energía cinética se cuadruplica (4x) porque depende del cuadrado de la rapidez!"
        ),
        CanonicalFormula(
            id = "fis_presion_hidrostatica",
            subject = "Física",
            topic = "Hidrostática",
            level = "Fija UNSA",
            name = "Presión Hidrostática Fundamental",
            leftSide = "P_h",
            mainExpression = "P_h = ρ_liq · g · h",
            description = "Presión ejercida por una columna de líquido en reposo a una profundidad h.",
            vars = listOf(
                FormulaVar("P_h", "Presión hidrostática", "Pascal [Pa] = N/m²"),
                FormulaVar("ρ_liq", "Densidad del líquido (Agua: 1000)", "kg/m³"),
                FormulaVar("g", "Gravedad", "m/s²"),
                FormulaVar("h", "Profundidad bajo el nivel libre", "m")
            ),
            despejes = listOf(
                FormulaDespeje("Presión Total / Absoluta", "P_total = P_atm + P_h"),
                FormulaDespeje("Principio de Pascal (Prensa)", "F₁ / A₁ = F₂ / A₂"),
                FormulaDespeje("Empuje de Arquímedes", "E = ρ_liq · g · V_sumergido")
            ),
            datoClave = "A mayor profundidad, mayor presión. La presión hidrostática NO depende de la forma del recipiente (Paradoja hidrostática de Stevin)."
        ),

        // ── QUÍMICA ────────────────────────────────────────────────────────
        CanonicalFormula(
            id = "qui_gases_ideales",
            subject = "Química",
            topic = "Estado Gaseoso",
            level = "Fija UNSA",
            name = "Ecuación de Gases Ideales (Pavo = Ratón)",
            leftSide = "P · V",
            mainExpression = "P · V = n · R · T",
            description = "Relaciona presión, volumen, temperatura y cantidad de sustancia de un gas ideal.",
            vars = listOf(
                FormulaVar("P", "Presión absoluta", "atm o mmHg"),
                FormulaVar("V", "Volumen del recipiente", "Litros [L]"),
                FormulaVar("n", "Número de moles (m / M̄)", "mol"),
                FormulaVar("R", "Constante universal (0.082 atm·L/mol·K ó 62.4 mmHg)", "atm·L/mol·K"),
                FormulaVar("T", "Temperatura absoluta (Celsius + 273)", "Kelvin [K]")
            ),
            despejes = listOf(
                FormulaDespeje("Forma con Masa Molar (Pavo = Masa/M̄ · R · T)", "P · M̄ = d · R · T"),
                FormulaDespeje("Densidad del gas", "d = (P · M̄) / (R · T)"),
                FormulaDespeje("Ley combinada de gases", "(P₁ · V₁) / T₁ = (P₂ · V₂) / T₂")
            ),
            datoClave = "¡Regla de oro UNSA! La temperatura SIEMPRE debe estar en escala absoluta KELVIN (K = °C + 273). Si usas °C el ejercicio saldrá mal."
        ),
        CanonicalFormula(
            id = "qui_soluciones_molaridad",
            subject = "Química",
            topic = "Soluciones Químicas",
            level = "Fundamental",
            name = "Molaridad (M)",
            leftSide = "M",
            numerator = "n_soluto",
            denominator = "V_solucion(L)",
            mainExpression = "M = n_soluto / V_solucion(L)",
            description = "Concentración química expresada en moles de soluto disueltos por cada litro de solución.",
            vars = listOf(
                FormulaVar("M", "Molaridad", "mol/L"),
                FormulaVar("n_soluto", "Moles de soluto (masa / M̄)", "mol"),
                FormulaVar("V_solucion", "Volumen total de solución", "Litros [L]")
            ),
            despejes = listOf(
                FormulaDespeje("Molaridad con porcentaje en masa y densidad", "M = (10 · %m · ρ) / M̄"),
                FormulaDespeje("Neutralización (Normalidad)", "N₁ · V₁ = N₂ · V₂"),
                FormulaDespeje("Relación Normalidad - Molaridad (Nemo)", "N = M · θ")
            ),
            datoClave = "Mnemotecnia 'Nemo': N = M · θ. El parámetro theta (θ) es: Ácidos = #H⁺ reemplazables; Hidróxidos = #OH⁻; Sales = carga total del catión."
        ),

        // ── TRIGONOMETRÍA & GEOMETRÍA ──────────────────────────────────────
        CanonicalFormula(
            id = "tri_pitagoras_geometrico",
            subject = "Trigonometría",
            topic = "Relaciones Métricas en Triángulos Rectángulos",
            level = "Fija UNSA",
            name = "Teorema de Pitágoras (Relación Métrica)",
            leftSide = "c²",
            mainExpression = "c² = a² + b²",
            radicalExpression = "a² + b²",
            description = "En todo triángulo rectángulo, el cuadrado de la longitud de la hipotenusa (c) es igual a la suma de los cuadrados de las longitudes de los catetos (a y b). Demostración geométrica visual de áreas.",
            vars = listOf(
                FormulaVar("c", "Hipotenusa (lado mayor opuesto al ángulo recto 90°)", "m"),
                FormulaVar("a", "Cateto 1 (adyacente u opuesto)", "m"),
                FormulaVar("b", "Cateto 2 (adyacente u opuesto)", "m")
            ),
            despejes = listOf(
                FormulaDespeje("Hipotenusa (c)", "c = √(a² + b²)"),
                FormulaDespeje("Cateto a", "a = √(c² - b²)"),
                FormulaDespeje("Cateto b", "b = √(c² - a²)"),
                FormulaDespeje("Tríada Notables 37°-53°", "Catetos 3k, 4k ⟹ Hipotenusa 5k"),
                FormulaDespeje("Tríada 5-12-13", "Catetos 5k, 12k ⟹ Hipotenusa 13k")
            ),
            datoClave = "¡Distinción Académica Clave!: En Matemática y Geometría, Pitágoras es la relación métrica cuadrática (a² + b² = c²). En Filosofía, Pitágoras de Samos es el filósofo presocrático que acuñó el término 'filosofía' y sostuvo que el Número y la Armonía son el Arjé del cosmos. No confundir ambas áreas por nombre.",
            mnemotecnia = "«El cuadrado del hipopótamo es igual a la suma de los cuadrados de los dos patos»: Hipotenusa² = Cateto₁² + Cateto₂². ¡La Hipotenusa va SIEMPRE solitaria en el primer miembro!",
            graphicType = "pythagoras"
        ),
        CanonicalFormula(
            id = "tri_pitagorica_fundamental",
            subject = "Trigonometría",
            topic = "Identidades Fundamentales",
            level = "Fundamental",
            name = "Identidad Pitagórica Fundamental",
            leftSide = "sin²θ + cos²θ",
            mainExpression = "sin²θ + cos²θ = 1",
            description = "La relación geométrica madre de todas las identidades trigonométricas en la circunferencia unitaria.",
            vars = listOf(
                FormulaVar("θ", "Ángulo en radianes o grados", "rad / °"),
                FormulaVar("sin θ", "Seno del ángulo", "adimensional"),
                FormulaVar("cos θ", "Coseno del ángulo", "adimensional")
            ),
            despejes = listOf(
                FormulaDespeje("Seno al cuadrado", "sin²θ = 1 - cos²θ"),
                FormulaDespeje("Coseno al cuadrado", "cos²θ = 1 - sin²θ"),
                FormulaDespeje("Con Tangente y Secante", "1 + tan²θ = sec²θ"),
                FormulaDespeje("Con Cotangente y Cosecante", "1 + cot²θ = csc²θ")
            ),
            datoClave = "En simplificaciones de fracciones trigonométricas, siempre que veas (1 - sin²θ) cámbialo de inmediato por cos²θ para simplificar."
        ),
        CanonicalFormula(
            id = "tri_tangente_cociente",
            subject = "Trigonometría",
            topic = "Identidades por Cociente",
            level = "Fundamental",
            name = "Tangente y Cotangente por Cociente",
            leftSide = "tan θ",
            numerator = "sin θ",
            denominator = "cos θ",
            mainExpression = "tan θ = sin θ / cos θ",
            description = "Definición de tangente y cotangente en términos de las funciones fundamentales seno y coseno.",
            vars = listOf(
                FormulaVar("tan θ", "Tangente", "adimensional"),
                FormulaVar("cot θ", "Cotangente", "adimensional")
            ),
            despejes = listOf(
                FormulaDespeje("Cotangente por cociente", "cot θ = cos θ / sin θ"),
                FormulaDespeje("Identidad recíproca", "tan θ · cot θ = 1")
            ),
            datoClave = "Estrategia infalible en el examen: Si no sabes cómo empezar una demostración trigonométrica, pasa TODO a términos de SENO y COSENO."
        ),

        // ── ARITMÉTICA & ÁLGEBRA ───────────────────────────────────────────
        CanonicalFormula(
            id = "alg_formula_cuadratica",
            subject = "Aritmética",
            topic = "Ecuación Cuadrática",
            level = "Fija UNSA",
            name = "Fórmula General de la Ecuación Cuadrática",
            leftSide = "x",
            prefix = "",
            numerator = "-b ± √(b² - 4ac)",
            denominator = "2a",
            mainExpression = "x = (-b ± √(b² - 4ac)) / (2a)",
            radicalExpression = "b² - 4ac",
            description = "Resuelve cualquier ecuación polinomial de segundo grado de la forma ax² + bx + c = 0.",
            vars = listOf(
                FormulaVar("a", "Coeficiente cuadrático (a ≠ 0)", "Real"),
                FormulaVar("b", "Coeficiente lineal", "Real"),
                FormulaVar("c", "Término independiente", "Real"),
                FormulaVar("Δ", "Discriminante (b² - 4ac)", "Real")
            ),
            despejes = listOf(
                FormulaDespeje("Suma de raíces (Cardano)", "x₁ + x₂ = -b / a"),
                FormulaDespeje("Producto de raíces (Cardano)", "x₁ · x₂ = c / a"),
                FormulaDespeje("Discriminante (Δ)", "Δ = b² - 4ac")
            ),
            datoClave = "Análisis del discriminante (Δ): Si Δ > 0: 2 raíces reales y diferentes. Si Δ = 0: raíces reales e iguales (raíz única). Si Δ < 0: raíces complejas conjugadas."
        ),
        CanonicalFormula(
            id = "ari_suma_naturales",
            subject = "Aritmética",
            topic = "Series Notables",
            level = "Fija UNSA",
            name = "Suma de los 'n' Primeros Naturales",
            leftSide = "S_n",
            numerator = "n(n + 1)",
            denominator = "2",
            mainExpression = "S_n = n(n + 1) / 2",
            description = "Suma de la serie aritmética 1 + 2 + 3 + ... + n descubierta por Carl Friedrich Gauss.",
            vars = listOf(
                FormulaVar("n", "Cantidad de términos consecutivos", "Entero positivo"),
                FormulaVar("S_n", "Suma total acumulada", "Entero")
            ),
            despejes = listOf(
                FormulaDespeje("Suma de números pares (2+4+...+2n)", "S_pares = n(n + 1)"),
                FormulaDespeje("Suma de impares (1+3+...+(2n-1))", "S_impares = n²"),
                FormulaDespeje("Suma de cuadrados (1²+2²+...+n²)", "S_cuadrados = (n(n + 1)(2n + 1)) / 6")
            ),
            datoClave = "Para números impares: toma el último número, súmale 1, divídelo entre 2 y ese resultado elévalo al cuadrado (n²)."
        ),

        // ── LENGUAJE ───────────────────────────────────────────────────────
        CanonicalFormula(
            id = "len_diptongos_hiatos",
            subject = "Lenguaje",
            topic = "Fonología y Sílaba",
            level = "Fija UNSA",
            name = "Regla de Oro: Diptongos vs Hiatos",
            leftSide = "Regla",
            mainExpression = "Diptongo: V_C + V_A  |  Hiato: V_A - V_A  ó  V́_C - V_A",
            description = "Unión y separación silábica según la fuerza acústica vocálica (Abiertas: A, E, O | Cerradas: I, U).",
            vars = listOf(
                FormulaVar("V_A", "Vocal abierta (fuerte)", "A, E, O"),
                FormulaVar("V_C", "Vocal cerrada (débil)", "I, U"),
                FormulaVar("V́_C", "Vocal cerrada con tilde (gana fuerza)", "Í, Ú")
            ),
            despejes = listOf(
                FormulaDespeje("Diptongo Creciente", "V_C + V_A → puer-ta, via-je"),
                FormulaDespeje("Diptongo Decreciente", "V_A + V_C → cau-sa, pei-ne"),
                FormulaDespeje("Hiato Acentual (Adiptongo)", "V́_C - V_A → ba-úl, tí-a, ma-íz")
            ),
            datoClave = "Dos vocales abiertas (A, E, O) NUNCA van juntas en la misma sílaba (siempre forman hiato). Si una cerrada lleva tilde (í, ú), rompe el diptongo automáticamente."
        ),

        // ── BIOLOGÍA ───────────────────────────────────────────────────────
        CanonicalFormula(
            id = "bio_fotosintesis_global",
            subject = "Biología",
            topic = "Bioenergética Celular",
            level = "Fija UNSA",
            name = "Ecuación Global de la Fotosíntesis",
            leftSide = "Reacción",
            mainExpression = "6 CO₂ + 6 H₂O + luz → C₆H₁₂O₆ + 6 O₂",
            description = "Transformación de energía lumínica en energía química acumulada en los enlaces covalentes de la glucosa.",
            vars = listOf(
                FormulaVar("CO₂", "Dióxido de carbono (Fase Oscura / Ciclo de Calvin)", "Molécula inorgánica"),
                FormulaVar("H₂O", "Agua (Donador de electrones y protones / Fotólisis de Hill)", "Líquido vital"),
                FormulaVar("O₂", "Oxígeno molecular liberado a la atmósfera", "Gas respiratorio"),
                FormulaVar("C₆H₁₂O₆", "Glucosa (Molécula orgánica energética)", "Monosacárido")
            ),
            despejes = listOf(
                FormulaDespeje("Fase Luminosa (Tilacoide)", "Fotólisis de Hill → Se libera O₂ y se produce NADPH y ATP"),
                FormulaDespeje("Fase Oscura (Estroma)", "Ciclo de Calvin-Benson → Se fija el CO₂ gracias a la enzima RuBisCO"),
                FormulaDespeje("Rendimiento Respiratorio", "1 Glucosa → 36 a 38 ATP en respiración aeróbica")
            ),
            datoClave = "¡Pregunta fija de examen de admisión! El oxígeno (O₂) que respiramos NO proviene del CO₂, proviene de la FOTÓLISIS DEL AGUA (H₂O) en la fase luminosa."
        )
    )

    fun getBySubject(subject: String): List<CanonicalFormula> {
        return if (subject == "Todas" || subject.isBlank()) allFormulas
        else allFormulas.filter { it.subject.equals(subject, ignoreCase = true) }
    }
}
