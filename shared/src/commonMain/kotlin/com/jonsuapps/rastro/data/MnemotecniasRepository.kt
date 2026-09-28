package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.MnemotecniaBreakdown
import com.jonsuapps.rastro.model.MnemotecniaItem
import com.jonsuapps.rastro.model.MnemotecniaTriangulo

object MnemotecniasRepository {

    val items = listOf(
        MnemotecniaItem(
            id = "mne_fis_mru_diosito",
            subject = "Física",
            topic = "Cinemática MRU",
            phrase = "DIOSITO LO VE TODO",
            shortFormula = "d = v · t",
            importance = "Leyenda Pre-U",
            category = "Fórmula Fundamental",
            summary = "El triángulo nemotécnico más famoso de la física para distancia, velocidad y tiempo.",
            breakdown = listOf(
                MnemotecniaBreakdown("D", "Diosito", "Distancia recorrida (d)", "Metros [m]"),
                MnemotecniaBreakdown("V", "Ve", "Rapidez constante (v)", "m/s"),
                MnemotecniaBreakdown("T", "Todo", "Tiempo transcurrido (t)", "Segundos [s]")
            ),
            triangulo = MnemotecniaTriangulo(
                top = "d",
                bottomLeft = "v",
                bottomRight = "t",
                regla = "Tapa con tu dedo la variable que buscas: si buscas 'd' te queda 'v · t'; si buscas 'v' te queda 'd / t'; si buscas 't' te queda 'd / v'."
            ),
            explicacion = "En lugar de memorizar 3 despejes algebraicos por separado, la frase 'Diosito Ve Todo' coloca a Diosito (D) en la cúspide del triángulo y a Ve (V) y Todo (T) abajo multiplicándose.",
            fijaExamen = "¡OJO CON LAS UNIDADES! Si la rapidez te la dan en km/h y el tiempo en segundos, primero convierte a m/s multiplicando por 5/18 antes de usar la fórmula.",
            ejemplo = "Un móvil viaja a 72 km/h durante 6 s. ¿Qué distancia recorre? 1) Rapidez: 72 × (5/18) = 20 m/s. 2) Diosito Ve Todo: d = 20 × 6 = 120 metros.",
            tags = listOf("MRU", "Cinemática", "Triángulo", "Distancia")
        ),
        MnemotecniaItem(
            id = "mne_fis_ohm_reina_isabel",
            subject = "Física",
            topic = "Electrodinámica",
            phrase = "¡VIVA LA REINA ISABEL!",
            shortFormula = "V = R · I (o V = I · R)",
            importance = "Leyenda Pre-U",
            category = "Ley de Ohm",
            summary = "La mnemotecnia monárquica que define la relación entre Voltaje, Resistencia y Corriente.",
            breakdown = listOf(
                MnemotecniaBreakdown("V", "Viva", "Voltaje / Potencial eléctrico (V)", "Voltios [V]"),
                MnemotecniaBreakdown("R", "Reina", "Resistencia eléctrica (R)", "Ohmios [Ω]"),
                MnemotecniaBreakdown("I", "Isabel", "Intensidad de corriente (I)", "Amperios [A]")
            ),
            triangulo = MnemotecniaTriangulo(
                top = "V",
                bottomLeft = "I",
                bottomRight = "R",
                regla = "Tapa con el dedo: V = I · R | I = V / R | R = V / I"
            ),
            explicacion = "Alternativa clásica: 'Victoria Reina de Inglaterra'. Te asegura no dudar jamás si la intensidad va dividiendo o multiplicando.",
            fijaExamen = "En circuitos en serie, la corriente (I) es la misma para todas las resistencias; en paralelo, el voltaje (V) es el mismo en todas las ramas.",
            ejemplo = "Un foco de 20 Ω se conecta a 220 V. ¿Corriente? 'Viva la Reina Isabel' -> I = V / R = 220 / 20 = 11 Amperios.",
            tags = listOf("Ohm", "Electricidad", "Circuitos", "Voltaje")
        ),
        MnemotecniaItem(
            id = "mne_qui_gases_pavoraton",
            subject = "Química",
            topic = "Gases Ideales",
            phrase = "PAVO = RATÓN",
            shortFormula = "P · V = R · T · n",
            importance = "Indispensable UNSA",
            category = "Ecuación de Estado",
            summary = "La ecuación universal de los gases ideales memorizada al instante.",
            breakdown = listOf(
                MnemotecniaBreakdown("P", "Pa", "Presión del gas (P)", "atm o mmHg"),
                MnemotecniaBreakdown("V", "Vo", "Volumen ocupado (V)", "Litros [L]"),
                MnemotecniaBreakdown("R", "Ra", "Constante universal (R)", "0.082 o 62.4"),
                MnemotecniaBreakdown("T", "Tó", "Temperatura absoluta (T)", "Kelvin [K]"),
                MnemotecniaBreakdown("n", "n", "Número de moles (n)", "mol")
            ),
            triangulo = null,
            explicacion = "Multiplicas P por V a la izquierda (PAVO) y R por T por n a la derecha (RATÓN). R = 0.082 si P está en atmósferas; R = 62.4 si P está en mmHg.",
            fijaExamen = "¡SIEMPRE suma 273 a los grados Celsius para tener la temperatura en Kelvin! Nunca uses temperatura en °C.",
            ejemplo = "¿Qué volumen ocupan 2 moles de gas a 1 atm y 27°C? T = 27 + 273 = 300 K. PAVO = RATÓN: 1 · V = 0.082 · 300 · 2 -> V = 49.2 Litros.",
            tags = listOf("Gases", "Química", "Termodinámica", "Presión")
        ),
        MnemotecniaItem(
            id = "mne_bio_chonps",
            subject = "Biología",
            topic = "Bioelementos Primarios",
            phrase = "CHONPS (El club de la vida)",
            shortFormula = "C - H - O - N - P - S",
            importance = "Pregunta Fija",
            category = "Bioquímica",
            summary = "Los 6 bioelementos primarios u organógenos que constituyen el 96% al 99% de la masa de cualquier ser vivo.",
            breakdown = listOf(
                MnemotecniaBreakdown("C", "Carbono", "Equeleto molecular tetravalente", "%"),
                MnemotecniaBreakdown("H", "Hidrógeno", "Enlace en biomoléculas y agua", "%"),
                MnemotecniaBreakdown("O", "Oxígeno", "Aceptor final de electrones", "%"),
                MnemotecniaBreakdown("N", "Nitrógeno", "Constituyente de proteínas y ácidos nucleicos", "%"),
                MnemotecniaBreakdown("P", "Fósforo", "Esqueleto del ADN/ARN y moneda ATP", "%"),
                MnemotecniaBreakdown("S", "Azufre", "Puentes disulfuro en aminoácidos", "%")
            ),
            triangulo = null,
            explicacion = "Solo recuerda la palabra CHONPS. Si te piden los 4 básicos esenciales son CHON; si te piden los que incluyen energía y membranas sumas Fósforo y Azufre (PS).",
            fijaExamen = "El bioelemento más abundante en masa es el Oxígeno (por el agua H2O); el más abundante en variedad de enlaces químicos es el Carbono.",
            ejemplo = "¿Qué bioelemento es indispensable para formar puentes disulfuro en la estructura terciaria proteica? Respuesta directa: Azufre (S).",
            tags = listOf("Biología", "Bioelementos", "Célula", "Bioquímica")
        ),
        MnemotecniaItem(
            id = "mne_bio_mitosis_prometo",
            subject = "Biología",
            topic = "División Celular",
            phrase = "PROMETO A ANA TELEFONEARTE",
            shortFormula = "Profase - Metafase - Anafase - Telofase",
            importance = "Clásica de Admisión",
            category = "Mitosis",
            summary = "Las 4 fases cronológicas exactas de la mitosis celular en riguroso orden.",
            breakdown = listOf(
                MnemotecniaBreakdown("PRO", "Prometo", "Profase: Condensación cromatínica y carioteca desaparece", "Inicio"),
                MnemotecniaBreakdown("MET", "Met-", "Metafase: Placa ecuatorial máxima condensación", "Cromosomas"),
                MnemotecniaBreakdown("ANA", "Ana", "Anafase: Disyunción y separación de cromátides hermanas", "Separación"),
                MnemotecniaBreakdown("TEL", "Telefonearte", "Telofase: Reorganización carioteca y citocinesis", "Final")
            ),
            triangulo = null,
            explicacion = "Recuerda la promesa: PRO-METO A ANA TELEFONEARTE. Te asegura que jamás confundirás si anafase va antes o después de metafase.",
            fijaExamen = "¿En qué fase se realiza el cariotipo humano o se cuentan mejor los cromosomas? ¡En METAFASE porque alcanzan su máxima condensación!",
            ejemplo = "En un examen te preguntan por la etapa donde se separan los centrómeros y migran a los polos: 'Ana' = Anafase.",
            tags = listOf("Mitosis", "Genética", "Célula", "Ciclo Celular")
        ),
        MnemotecniaItem(
            id = "mne_fis_newton_fama",
            subject = "Física",
            topic = "Dinámica Lineal",
            phrase = "FAMA / FUMA",
            shortFormula = "F_R = m · a",
            importance = "Fundamental",
            category = "2da Ley de Newton",
            summary = "Fuerza resultante es igual a la masa multiplicada por la aceleración.",
            breakdown = listOf(
                MnemotecniaBreakdown("F", "Fuerza", "Fuerza Resultante neta (Fr)", "Newtons [N]"),
                MnemotecniaBreakdown("M", "Masa", "Masa inercial (m)", "Kilogramos [kg]"),
                MnemotecniaBreakdown("A", "Aceleración", "Aceleración del cuerpo (a)", "m/s²")
            ),
            triangulo = null,
            explicacion = "Acrónimo 'FAMA' (F = m · a). La aceleración siempre tiene la misma dirección y sentido que la fuerza resultante.",
            fijaExamen = "En planos inclinados o con rozamiento, primero calcula Fr = (Fuerzas a favor) - (Fuerzas en contra) antes de igualar a m · a.",
            ejemplo = "Una masa de 4 kg recibe una fuerza neta de 20 N. ¿Aceleración? a = F / m = 20 / 4 = 5 m/s².",
            tags = listOf("Dinámica", "Newton", "Fuerza", "Aceleración")
        ),
        MnemotecniaItem(
            id = "mne_fis_mruv_viejos_feos",
            subject = "Física",
            topic = "Cinemática MRUV",
            phrase = "VIEJO FEO = VIEJO IDIOTA MÁS ATORRANTE",
            shortFormula = "v_f = v_0 ± a · t",
            importance = "Alta Frecuencia",
            category = "Ecuación Temporal MRUV",
            summary = "Velocidad final en función de la velocidad inicial, aceleración y tiempo.",
            breakdown = listOf(
                MnemotecniaBreakdown("Vf", "Viejo Feo", "Velocidad final", "m/s"),
                MnemotecniaBreakdown("Vo", "Viejo Idiota / Vete", "Velocidad inicial", "m/s"),
                MnemotecniaBreakdown("a·t", "Más Atorrante", "Aceleración × Tiempo", "m/s")
            ),
            triangulo = null,
            explicacion = "El signo es (+) si el movimiento es acelerado (gana rapidez) y (-) si es retardado (frena).",
            fijaExamen = "Si el problema dice 'parte del reposo', Vo = 0. Si dice 'hasta detenerse', Vf = 0.",
            ejemplo = "Un auto parte del reposo con a = 3 m/s² durante 4 s. Vf = 0 + (3)(4) = 12 m/s.",
            tags = listOf("MRUV", "Cinemática", "Aceleración")
        ),
        MnemotecniaItem(
            id = "mne_fis_mruv_cuadrados",
            subject = "Física",
            topic = "Cinemática MRUV",
            phrase = "VIEJOS FEOS AL CUADRADO",
            shortFormula = "v_f² = v_0² ± 2 · a · d",
            importance = "Alta Frecuencia",
            category = "Ecuación Independiente del Tiempo",
            summary = "La fórmula que se usa cuando el problema NO te da el tiempo ni te lo pide.",
            breakdown = listOf(
                MnemotecniaBreakdown("Vf²", "Viejo Feo²", "Velocidad final al cuadrado", "(m/s)²"),
                MnemotecniaBreakdown("Vo²", "Viejo Idiota²", "Velocidad inicial al cuadrado", "(m/s)²"),
                MnemotecniaBreakdown("2ad", "Dos Amores Difíciles", "2 × aceleración × distancia", "(m/s)²")
            ),
            triangulo = null,
            explicacion = "Regla de oro: ¿En el enunciado no aparece el tiempo 't'? ¡Usa inmediatamente la ecuación de los cuadrados!",
            fijaExamen = "En caída libre vertical, la aceleración 'a' se reemplaza por la gravedad 'g' y 'd' por la altura 'h'.",
            ejemplo = "Un auto a 10 m/s frena hasta detenerse (Vf = 0) en 25 m. 0 = 10² - 2(a)(25) -> 50a = 100 -> a = 2 m/s².",
            tags = listOf("MRUV", "Sin Tiempo", "Cuadrados")
        ),
        MnemotecniaItem(
            id = "mne_fis_fraccion_chiquita",
            subject = "Física",
            topic = "Conversión de Unidades",
            phrase = "DE GRANDE A CHIQUITO: FRACCIÓN CHIQUITA (5/18)",
            shortFormula = "1 km/h × (5/18) = 1 m/s  ;  1 m/s × (18/5) = 1 km/h",
            importance = "Fundamental",
            category = "Conversión Rápida",
            summary = "¿Vas a una unidad más pequeña (km/h a m/s)? Multiplica por el número menor arriba (5/18).",
            breakdown = listOf(
                MnemotecniaBreakdown("km/h → m/s", "Hacia lo pequeño", "Multiplica por 5/18", "5 arriba"),
                MnemotecniaBreakdown("m/s → km/h", "Hacia lo grande", "Multiplica por 18/5", "18 arriba")
            ),
            triangulo = null,
            explicacion = "Evita hacer la doble regla de tres de 1000m / 3600s. Simplificando 1000/3600 da exactamente 5/18. Múltiplos: 18 km/h = 5 m/s, 36 = 10, 54 = 15, 72 = 20, 90 = 25.",
            fijaExamen = "Todos los múltiplos de 18 km/h equivalen a múltiplos de 5 m/s. 72 km/h -> 72/18 = 4 -> 4 × 5 = 20 m/s.",
            ejemplo = "54 km/h a m/s: 54 × (5/18) = 3 × 5 = 15 m/s.",
            tags = listOf("Conversión", "Velocidad", "Atajo")
        ),
        MnemotecniaItem(
            id = "mne_qui_densidad_policia_militar",
            subject = "Química",
            topic = "Gases Ideales y Densidad",
            phrase = "POLICÍA MILITAR = DEDO ROTO / PUMA = RATA",
            shortFormula = "P · M = d · R · T",
            importance = "Alta Frecuencia",
            category = "Densidad de Gases",
            summary = "Calcula la masa molar o densidad de cualquier gas ideal sin pasar por los moles.",
            breakdown = listOf(
                MnemotecniaBreakdown("P · M", "Policía Militar / PUMA", "Presión × Masa Molar del gas", "atm · g/mol"),
                MnemotecniaBreakdown("d · R · T", "Dedo Roto / RATA", "Densidad × Constante R × Temp", "g/L · R · K")
            ),
            triangulo = null,
            explicacion = "Deriva de sustituir n = m / M en PAVO = RATÓN y despejar la densidad d = m / V.",
            fijaExamen = "La densidad de los gases en química casi siempre se expresa en gramos por litro (g/L), no en kg/m³.",
            ejemplo = "Halla la masa molar de un gas con d = 1.4 g/L a 0.82 atm y 300 K. (0.82)(M) = (1.4)(0.082)(300) -> M = 42 g/mol.",
            tags = listOf("Gases", "Densidad", "Masa Molar")
        ),
        MnemotecniaItem(
            id = "mne_qui_molaridad_puercos",
            subject = "Química",
            topic = "Soluciones y Concentraciones",
            phrase = "10 PUERCOS DE MIERDA / 10 × %P × D / M",
            shortFormula = "M = (10 · %P · D) / M_soluto",
            importance = "Leyenda Pre-U",
            category = "Molaridad Directa",
            summary = "Calcula la Molaridad en un solo renglón cuando te dan porcentaje en peso (%P) y densidad (D).",
            breakdown = listOf(
                MnemotecniaBreakdown("10", "10", "Factor de conversión volumétrico", "Constante"),
                MnemotecniaBreakdown("%P", "Puercos", "Porcentaje en masa / pureza (%W)", "%"),
                MnemotecniaBreakdown("D", "De", "Densidad de la solución", "g/mL"),
                MnemotecniaBreakdown("M", "Mierda", "Masa molar del soluto", "g/mol")
            ),
            triangulo = null,
            explicacion = "Evita asumir 1000 mL de solución, calcular masa de solución y luego moles. ¡Se resuelve en 15 segundos!",
            fijaExamen = "El %P se coloca como número entero (si es 49%, pones 49, no 0.49). La densidad debe estar en g/mL.",
            ejemplo = "Solución de H2SO4 (M = 98 g/mol) al 49% en peso con D = 1.2 g/mL. M = (10 × 49 × 1.2) / 98 = 6 Molar.",
            tags = listOf("Soluciones", "Molaridad", "Concentración", "Atajo")
        ),
        MnemotecniaItem(
            id = "mne_qui_normalidad_no_me_olvides",
            subject = "Química",
            topic = "Soluciones Químicas",
            phrase = "NO ME OLVIDES (N = M · θ)",
            shortFormula = "N = M · θ",
            importance = "Alta Frecuencia",
            category = "Normalidad vs Molaridad",
            summary = "Relaciona la Normalidad con la Molaridad mediante el parámetro de carga (teta).",
            breakdown = listOf(
                MnemotecniaBreakdown("N", "No", "Normalidad de la solución", "Eq-g / L"),
                MnemotecniaBreakdown("M", "Me", "Molaridad de la solución", "mol / L"),
                MnemotecniaBreakdown("θ", "Olvides (teta)", "Parámetro equivalente", "H+, OH-, carga total")
            ),
            triangulo = null,
            explicacion = "Valores de θ: En ácidos = número de H+ liberables (HCl -> 1, H2SO4 -> 2). En hidróxidos = número de OH- (NaOH -> 1, Ca(OH)2 -> 2). En sales = carga total de cationes.",
            fijaExamen = "Para el ácido fosfórico H3PO4, θ = 3; para el ácido sulfúrico H2SO4, θ = 2.",
            ejemplo = "Si tienes H2SO4 a 1.5 Molar: N = M · θ = 1.5 × 2 = 3 Normal.",
            tags = listOf("Normalidad", "Molaridad", "Soluciones")
        ),
        MnemotecniaItem(
            id = "mne_qui_subniveles_sopa",
            subject = "Química",
            topic = "Estructura Atómica",
            phrase = "SOPA DE FIDEOS (s, p, d, f)",
            shortFormula = "s² ; p⁶ ; d¹⁰ ; f¹⁴",
            importance = "Fundamental",
            category = "Subniveles y Electrones",
            summary = "Orden y capacidad máxima de electrones en los 4 subniveles atómicos.",
            breakdown = listOf(
                MnemotecniaBreakdown("S", "Sopa", "Subnivel Sharp (l = 0)", "Máx 2 e⁻"),
                MnemotecniaBreakdown("P", "De", "Subnivel Principal (l = 1)", "Máx 6 e⁻"),
                MnemotecniaBreakdown("D", "Fideos", "Subnivel Difuso (l = 2)", "Máx 10 e⁻"),
                MnemotecniaBreakdown("F", "Sabrosos", "Subnivel Fundamental (l = 3)", "Máx 14 e⁻")
            ),
            triangulo = null,
            explicacion = "Cada subnivel aumenta de 4 en 4 electrones: 2 -> 6 -> 10 -> 14. El número de orbitales es la mitad de los electrones: 1, 3, 5, 7.",
            fijaExamen = "Los números cuánticos azimutales (l) asociados son: s = 0, p = 1, d = 2, f = 3.",
            ejemplo = "¿Cuántos orbitales tiene el subnivel d? Capacidad 10 e⁻ / 2 = 5 orbitales.",
            tags = listOf("Química", "Atómica", "Orbitales", "Configuración")
        ),
        MnemotecniaItem(
            id = "mne_tri_coca_coca_hielito",
            subject = "Trigonometría",
            topic = "Razones Trigonométricas",
            phrase = "COCA COCA HIELITO HIELITO",
            shortFormula = "sen=CO/H , cos=CA/H , tan=CO/CA , cot=CA/CO , sec=H/CA , csc=H/CO",
            importance = "Leyenda Pre-U",
            category = "Razones en Triángulo Rectángulo",
            summary = "Escribe 'CO-CA-CO-CA-HIE-HIE' de ida en los numeradores y de vuelta en los denominadores.",
            breakdown = listOf(
                MnemotecniaBreakdown("Ida (Numerador)", "CO - CA - CO - CA - H - H", "Numeradores de sen, cos, tan, cot, sec, csc", "Arriba"),
                MnemotecniaBreakdown("Vuelta (Denom)", "H - H - CA - CO - CA - CO", "Denominadores de abajo hacia arriba", "Abajo")
            ),
            triangulo = null,
            explicacion = "Escribe en columna Sen, Cos, Tan, Cot, Sec, Csc. En los numeradores cantas: CO, CA, CO, CA, H, H. Luego en los denominadores al revés: H, H, CA, CO, CA, CO.",
            fijaExamen = "Razones recíprocas: Sen × Csc = 1 ; Cos × Sec = 1 ; Tan × Cot = 1 (para el mismo ángulo).",
            ejemplo = "En un triángulo con CO = 3, CA = 4, H = 5: Sen = 3/5; Cos = 4/5; Tan = 3/4.",
            tags = listOf("Razones", "Trigonometría", "Coca-Coca", "SOH-CAH-TOA")
        ),
        MnemotecniaItem(
            id = "mne_tri_cuadrantes_chicas_cafe",
            subject = "Trigonometría",
            topic = "Ángulos en Posición Normal",
            phrase = "TODAS LAS CHICAS TOMAN CAFÉ",
            shortFormula = "I C: Todas (+) ; II C: Sen/Csc (+) ; III C: Tan/Cot (+) ; IV C: Cos/Sec (+)",
            importance = "Leyenda Pre-U",
            category = "Signos en los 4 Cuadrantes",
            summary = "Signos positivos de las razones trigonométricas en los cuatro cuadrantes del plano cartesiano.",
            breakdown = listOf(
                MnemotecniaBreakdown("I Cuadrante", "TODAS", "Todas las 6 razones son POSITIVAS (+)", "0° a 90°"),
                MnemotecniaBreakdown("II Cuadrante", "CHICAS (Seno)", "Seno y Cosecante son (+)", "90° a 180°"),
                MnemotecniaBreakdown("III Cuadrante", "TOMAN (Tangente)", "Tangente y Cotangente son (+)", "180° a 270°"),
                MnemotecniaBreakdown("IV Cuadrante", "CAFÉ (Coseno)", "Coseno y Secante son (+)", "270° a 360°")
            ),
            triangulo = null,
            explicacion = "Recorre en sentido antihorario desde el primer cuadrante: I (Todas) -> II (Seno / Chicas) -> III (Tangente / Toman) -> IV (Coseno / Café). Las que no se nombran son NEGATIVAS (-).",
            fijaExamen = "¿Qué signo tiene Sen(200°)? 200° está en el III C (mandan Tan y Cot). Por tanto, Sen(200°) es NEGATIVO (-).",
            ejemplo = "Cos(300°): 300° está en el IV C (Café = Coseno) -> es POSITIVO (+).",
            tags = listOf("Cuadrantes", "Signos", "Reducción", "Trigonometría")
        ),
        MnemotecniaItem(
            id = "mne_len_sustantivo_muy_mucho",
            subject = "Lenguaje",
            topic = "Morfología y Categorías Gramaticales",
            phrase = "LA PRUEBA REINA RAE: ¿MUY O MUCHO?",
            shortFormula = "Adjetivo / Adverbio <==> Admite 'MUY' | Sustantivo <==> Admite 'MUCHO/A/S'",
            importance = "Regla de Oro RAE",
            category = "Identificación de Sustantivo vs Adjetivo",
            summary = "La prueba lingüística formal de la RAE que supera al truco escolar de agregar 'grande'.",
            breakdown = listOf(
                MnemotecniaBreakdown("MUY", "Admite MUY", "Es Adjetivo o Adverbio", "muy alegre, muy veloz"),
                MnemotecniaBreakdown("MUCHO/A/S", "Admite MUCHO", "Es Sustantivo", "mucho frío, mucha paciencia")
            ),
            triangulo = null,
            explicacion = "Los sustantivos nunca admiten 'MUY' (*muy dinero* ❌, *muy perro* ❌). Solo admiten cuantificadores variables: mucho/mucha/muchos/muchas.",
            fijaExamen = "¿Dudas si 'inteligencia' es adjetivo o sustantivo? ¿'Mucha inteligencia' (✔) o 'Muy inteligencia' (❌)? Es SUSTANTIVO.",
            ejemplo = "'Mucho temor' (✔) -> 'Temor' es SUSTANTIVO. 'Muy temeroso' (✔) -> 'Temeroso' es ADJETIVO.",
            tags = listOf("Sustantivo", "Adjetivo", "Gramática", "RAE", "Hack")
        ),
        MnemotecniaItem(
            id = "mne_len_adverbio_soltero",
            subject = "Lenguaje",
            topic = "Morfología del Adverbio",
            phrase = "EL ADVERBIO ES SOLTERO (INVARIABLE)",
            shortFormula = "Adverbio ==> NUNCA cambia de género ni número (medio, demasiado, puro)",
            importance = "Fija UNSA",
            category = "Corrección Idiomática",
            summary = "El adverbio no se casa con nadie: jamás flexiona a femenino ni plural cuando modifica a un adjetivo o verbo.",
            breakdown = listOf(
                MnemotecniaBreakdown("CORRECTO ✔", "Medio molesta", "'Medio' es adverbio modificando adjetivo", "Invariable"),
                MnemotecniaBreakdown("INCORRECTO ❌", "Media molesta", "Error grave sancionado en admisión", "Trampa fija")
            ),
            triangulo = null,
            explicacion = "Si una palabra significa 'un poco' o 'parcialmente' (como 'medio'), actúa como adverbio y DEBE permanecer en masculino singular siempre.",
            fijaExamen = "Solo se dice 'media' cuando es fraccionario: 'media naranja'. Pero ante adjetivos: 'Ella está MEDIO distraída', 'Llegaron MEDIO cansados'.",
            ejemplo = "Incorrecto: 'Ellas son medias tímidas' ❌ -> Correcto: 'Ellas son MEDIO tímidas' ✔.",
            tags = listOf("Adverbio", "Concordancia", "Medio", "Ortografía")
        ),
        MnemotecniaItem(
            id = "mne_len_sega_acentuacion",
            subject = "Lenguaje",
            topic = "Acentuación General",
            phrase = "S - E - G - A (DE DERECHA A IZQUIERDA)",
            shortFormula = "S (4ta) <--- E (3ra) <--- G (2da) <--- A (1ra / última)",
            importance = "Fundamental",
            category = "Clasificación de Palabras",
            summary = "Escribe las iniciales S-E-G-A sobre las sílabas desde la última hacia atrás para tildar al instante.",
            breakdown = listOf(
                MnemotecniaBreakdown("A", "Agudas", "Última sílaba tónica", "Tilde si termina en N, S o vocal"),
                MnemotecniaBreakdown("G", "Graves", "Penúltima sílaba tónica", "Tilde si NO termina en N, S ni vocal"),
                MnemotecniaBreakdown("E", "Esdrújulas", "Antepenúltima sílaba tónica", "TODAS se tildan"),
                MnemotecniaBreakdown("S", "Sobreesdrújulas", "Antes de la antepenúltima", "TODAS se tildan")
            ),
            triangulo = null,
            explicacion = "Separa en sílabas y escribe de derecha a izquierda: A, G, E, S. Identifica dónde recae la fuerza de voz.",
            fijaExamen = "Si una palabra termina en 'S' precedida de otra consonante (cómics, bíceps), las agudas NO se tildan (robots), pero las graves SÍ (bíceps, récords).",
            ejemplo = "cár-cel -> Penúltima sílaba (G), termina en L -> Lleva tilde: cár-cel.",
            tags = listOf("Acentuación", "SEGA", "Tildación", "Sílaba")
        ),
        MnemotecniaItem(
            id = "mne_bio_bases_gardel_troilo",
            subject = "Biología",
            topic = "Ácidos Nucleicos",
            phrase = "CARLOS GARDEL (C-G) & ANÍBAL TROILO (A-T)",
            shortFormula = "Citosina ≡ Guanina (3 enlaces) ; Adenina = Timina (2 enlaces)",
            importance = "Alta Frecuencia",
            category = "Complementariedad de Bases ADN",
            summary = "Apareamiento complementario de bases nitrogenadas según la Ley de Chargaff.",
            breakdown = listOf(
                MnemotecniaBreakdown("C - G", "Carlos Gardel", "Citosina se une con Guanina mediante 3 puentes H", "3 enlaces H"),
                MnemotecniaBreakdown("A - T", "Aníbal Troilo", "Adenina se une con Timina mediante 2 puentes H", "2 enlaces H"),
                MnemotecniaBreakdown("Agua Pura", "AG-Purina", "Adenina y Guanina son bases PÚRICAS (2 anillos)", "Purinas")
            ),
            triangulo = null,
            explicacion = "En el ARN, la Timina es reemplazada por el Uracilo (A-U). La regla 'Agua Pura' (A-G = Púricas) recuerda las purinas.",
            fijaExamen = "El enlace Citosina-Guanina (C≡G) tiene 3 puentes de hidrógeno y es más resistente térmicamente que A=T (2 enlaces).",
            ejemplo = "Si un segmento de ADN tiene 30% de Guanina, tiene 30% de Citosina, 20% de Adenina y 20% de Timina.",
            tags = listOf("ADN", "Genética", "Bases", "Chargaff")
        ),
        MnemotecniaItem(
            id = "mne_ari_es_sobre_de",
            subject = "Aritmética",
            topic = "Tanto por Ciento",
            phrase = "\"ES\" SOBRE \"DE\" × 100%",
            shortFormula = "Porcentaje = [ Parte ('es') / Todo ('de') ] × 100%",
            importance = "Leyenda Pre-U",
            category = "Fracción y Tanto por Ciento",
            summary = "¿Qué tanto por ciento de A es B? La palabra 'es' va arriba (numerador) y 'de' va abajo (denominador).",
            breakdown = listOf(
                MnemotecniaBreakdown("ES", "Numerador", "La parte o lo que se compara (es, representa)", "Parte"),
                MnemotecniaBreakdown("DE", "Denominador", "El total o referencia (de, del, respecto a)", "Total")
            ),
            triangulo = null,
            explicacion = "En '¿Qué porcentaje de 80 es 20?', 'ES sobre DE' lo resuelve al instante: 20 ('es') / 80 ('de') × 100% = 25%.",
            fijaExamen = "Fíjate bien en la preposición: '¿Qué porcentaje es 15 respecto de 60?' -> ES = 15, DE = 60 -> (15/60) × 100% = 25%.",
            ejemplo = "¿Qué porcentaje de 50 es 10? 10 / 50 = 1/5 -> 1/5 × 100% = 20%.",
            tags = listOf("Porcentajes", "Aritmética", "RM", "Atajo")
        ),
        MnemotecniaItem(
            id = "mne_ari_campanadas_intervalos",
            subject = "Aritmética",
            topic = "Razonamiento Matemático",
            phrase = "INTERVALOS = CAMPANADAS - 1",
            shortFormula = "i = C - 1  ;  Tiempo Total = i × t_intervalo",
            importance = "Fija UNSA",
            category = "Problemas de Campanadas y Cortes",
            summary = "El tiempo transcurrido depende del número de INTERVALOS entre campanadas, ¡NUNCA de las campanadas!",
            breakdown = listOf(
                MnemotecniaBreakdown("Campanadas", "Golpes", "No miden tiempo por sí solas", "Eventos"),
                MnemotecniaBreakdown("Intervalos", "Campanadas - 1", "Los silencios reales donde pasa el tiempo", "Intervalos")
            ),
            triangulo = null,
            explicacion = "Trampa clásica: 'Un reloj da 4 campanadas en 6 s. ¿Cuánto tardará en dar 8 campanadas?'. 4 campanadas = 3 intervalos de 2 s. 8 campanadas = 7 intervalos -> 7 × 2 = 14 segundos.",
            fijaExamen = "Misma lógica para estacas y cortes: N° cortes = N° partes - 1; N° estacas = N° partes + 1.",
            ejemplo = "6 campanadas en 10 s -> 5 intervalos = 10 s -> 1 intervalo = 2 s. ¿11 campanadas? 10 intervalos × 2 s = 20 s.",
            tags = listOf("Campanadas", "Intervalos", "RM", "Trampa")
        )
    )

    fun getBySubject(subject: String): List<MnemotecniaItem> {
        if (subject.isBlank() || subject.equals("Todas", ignoreCase = true)) return items
        return items.filter { it.subject.equals(subject, ignoreCase = true) }
    }
}
