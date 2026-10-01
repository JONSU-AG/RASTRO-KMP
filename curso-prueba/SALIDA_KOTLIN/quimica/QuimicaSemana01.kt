package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t01_s01",
            title = "Química, Materia, Sustancias y Transformaciones - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Química, Materia, Sustancias y Transformaciones - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química General e Inorgánica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.2 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              LA MATERIA
                                  │
         ┌────────────────────────┴────────────────────────┐
         ▼                                                 ▼
 SUSTANCIA PURA                                        MEZCLA
(Composición fija, fórmula)             (Composición variable, sin fórmula)
         │                                                 │
    ┌────┴────┐                                      ┌─────┴─────┐
    ▼         ▼                                      ▼           ▼
ELEMENTO   COMPUESTO                            HOMOGÉNEA   HETEROGÉNEA
(1 solo    (2 o más elementos                   (1 fase,     (2 o más fases,
tipo átomo, combinados químicamente,             Solución)   agregados, coloides,
alótropos)  descomponibles)                                 suspensiones)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Objeto de Estudio de la Química
La Química es la ciencia central empírico-racional que estudia la materia, su composición íntima, estructura atómica y molecular, propiedades físicas y químicas, así como las transformaciones energéticas asociadas a los cambios que experimenta.

### 3.2. Clasificación Sistemática de la Materia

#### A. Sustancia Pura
Forma de materia homogénea de composición química definida e invariable, cuyas propiedades termodinámicas e intensivas son constantes a condiciones fijas de presión y temperatura.
1. **Sustancia Simple o Elemento:** Constituida por átomos con el mismo número atómico (Z). No se puede descomponer en sustancias más simples por métodos químicos ordinarios.
   * *Monoatómicos:* Gases nobles (He, Ne, Ar, Kr, Xe, Rn).
   * *Poliatómicos:* O_2, O_3, P_4, S_8, N_2, H_2, Cl_2.
   * *Fenómeno de Alotropía:* Existencia en un mismo estado físico de dos o más formas moleculares o cristalinas de un mismo elemento, con propiedades físicas marcadamente distintas (ej. Carbono: diamante sp^3, grafito sp^2, grafeno, fullerenos; Oxígeno: dioxígeno O_2, ozono O_3; Fósforo: blanco P_4, rojo amorfo).
2. **Sustancia Compuesta o Compuesto:** Unión química de dos o más elementos diferentes en proporciones de masa constantes y definidas (Ley de Proust). Se descomponen por métodos químicos (pirólisis, electrólisis, fotólisis).
   * Ejemplos: Agua pura (H_2O), dióxido de carbono (CO_2), glucosa (C_6H_{12}O_6), cloruro de sodio (NaCl), ácido sulfúrico (H_2SO_4).

#### B. Mezclas
Asociación física de dos o más sustancias puras en proporciones variables, donde cada componente conserva su identidad química intrínseca. No poseen fórmula química.
1. **Mezcla Homogénea (Solución):** Presenta una sola fase continua macroscópica y microscópicamente. El tamaño de partícula del soluto es inferior a 1\text{ nm} (10\text{ Å}). Sus componentes no sedimentan y no se separan por filtración simple.
   * *Gaseosas:* Aire seco y filtrado (N_2, O_2, Ar, CO_2).
   * *Líquidas:* Agua potable, salmuera, vinagre (ácido acético al 5% en agua), alcohol medicinal (70° o 96°).
   * *Sólidas (Aleaciones):* Bronce (Cu + Sn), Latón (Cu + Zn), Acero (Fe + C), Amalgama (Hg + \text{metal}).
2. **Mezcla Heterogénea:** Presenta dos o más fases distinguibles a simple vista o con microscopio óptico. Distribución no uniforme.
   * *Suspensiones:* Tamaño de partícula > 1000\text{ nm}. Sedimentan por gravedad (ej. jugo de papaya con pulpa, jarabes medicinales, leche de magnesia).
   * *Coloides (Sistemas Coloidales):* Tamaño de partícula entre 1\text{ nm} y 1000\text{ nm}. Presentan Efecto Tyndall (dispersión de luz) y Movimiento Browniano (ej. leche, mayonesa, gelatina, niebla, humo, sangre).


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t01_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"El agua potable o destilada es lo mismo\". FALSO. El agua destilada es una sustancia pura compuesta (H_2O), mientras que el agua potable o mineral es una mezcla homogén\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "quim_t01_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: \"Los alótropos son compuestos químicos\". FALSO. Los alótropos son sustancias simples (elementos) formadas por el mismo átomo pero diferente estructura geométrica o atomic\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 1,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "quim_t01_s01_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "quim_t01_s02",
            title = "Química, Materia, Sustancias y Transformaciones - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Química, Materia, Sustancias y Transformaciones - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3. Propiedades de la Materia
1. **Propiedades Generales o Extensivas:** Dependen de la cantidad de masa presente. Son aditivas.
   * *Masa, volumen, peso, inercia, impenetrabilidad, porosidad, divisibilidad, capacidad calorífica.*
2. **Propiedades Específicas o Intensivas:** No dependen de la cantidad de masa ni son aditivas. Permiten identificar y caracterizar a una sustancia.
   * *Densidad (\rho = m/V), temperatura de ebullición (T_e), temperatura de fusión (T_f), presión de vapor, viscosidad, dureza, tenacidad, ductilidad, maleabilidad, calor específico (c_e), índice de refracción, reactividad química, electronegatividad.*

### 3.4. Fenómenos o Cambios de la Materia
1. **Fenómeno Físico:** Modificación que no altera la estructura molecular ni la identidad química de la sustancia. Son generalmente reversibles y con bajo intercambio energético.
   * Cambios de estado físico (ebullición, fusión, condensación), disolución de azúcar en agua, dilatación térmica, fragmentación mecánica.
2. **Fenómeno Químico (Reacción Química):** Transformación irreversible o en equilibrio que altera la composición íntima y enlaces químicos, originando nuevas sustancias con propiedades distintas.
   * Combustión, corrosión/oxidación de metales, digestión de alimentos, fotosíntesis, fermentación, saponificación.
3. **Fenómeno Nuclear:** Alteración de los núcleos atómicos con transmutación de elementos y enorme desprendimiento de energía según E = \Delta m \cdot c^2.
   * Fisión nuclear (ruptura de núcleos pesados: U-235) y Fusión nuclear (unión de núcleos livianos: ^2H + ^3H \to ^4He + n).

---

### 4. SISTEMA INTERNACIONAL (SI) Y CONVERSIÓN DE UNIDADES
* **Masa:** Kilogramo (kg). 1\text{ kg} = 1000\text{ g} = 2.2046\text{ lb}. 1\text{ lb} = 453.59\text{ g}.
* **Volumen:** Metro cúbico (m^3). 1\text{ m}^3 = 1000\text{ L} = 10^6\text{ mL} = 10^6\text{ cm}^3. 1\text{ L} = 1\text{ dm}^3 = 1000\text{ mL}.
* **Presión:** Pascal (Pa = N/m^2). 1\text{ atm} = 760\text{ mmHg} = 760\text{ Torr} = 101.325\text{ kPa} \approx 10^5\text{ Pa} = 1.013\text{ bar}.
* **Temperatura:** Kelvin (K). Escala absoluta.
  \frac{C}{5} = \frac{F - 32}{9} = \frac{K - 273}{5} = \frac{R - 492}{9}
  K = C + 273.15 \quad ; \quad \Delta K = \Delta C

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia para Propiedades Extensivas:** **"MA-VO-PE-IN-CA"**
  * **Ma**sa, **Vo**lumen, **Pe**so, **In**ercia, **Ca**pacidad calorífica. (Si divides la materia, estas propiedades cambian).
* **Mnemotecnia para Aleaciones Clave de Examen:**
  * **BRON-TE-COSTA:** **Bron**ce = **Co**bre (Cu) + Es**ta**ño (Sn).
  * **LA-CO-ZINC:** **La**tón = **Co**bre (Cu) + **Zinc** (Zn).
  * **A-FE-CA:** **A**cero = **Fe**rro (Fe) + **Ca**rbono (C).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "El agua potable o destilada es lo mismo".** FALSO. El agua destilada es una sustancia pura compuesta (H_2O), mientras que el agua potable o mineral es una mezcla homogénea (solución de agua con sales disueltas: Ca^{2+}, Mg^{2+}, Cl^-, SO_4^{2-}).
* **Trampa 2: "Los alótropos son compuestos químicos".** FALSO. Los alótropos son sustancias simples (elementos) formadas por el mismo átomo pero diferente estructura geométrica o atomicidad (O_2 y O_3, diamante y grafito).
* **Trampa 3: "La densidad y el calor específico cambian si aumento la masa al doble".** FALSO. Son propiedades intensivas; un mililitro de agua tiene exactamente la misma densidad (1\text{ g/mL}) y calor específico (1\text{ cal/g}^\circ\text{C}) que un océano de agua pura.
* **Trampa 4: "La leche y la sangre son mezclas homogéneas porque no veo fases a simple vista".** TRAMPA CLÁSICA UNSA. Son mezclas heterogéneas coloidales (emulsión y sol, respectivamente) que exhiben efecto Tyndall bajo haz luminoso.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t01_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La densidad y el calor específico cambian si aumento la masa al doble\". FALSO. Son propiedades intensivas; un mililitro de agua tiene exactamente la misma densidad (1\\t\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "quim_t01_s02_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 4: \"La leche y la sangre son mezclas homogéneas porque no veo fases a simple vista\". TRAMPA CLÁSICA UNSA. Son mezclas heterogéneas coloidales (emulsión y sol, respectivament\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 1,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "quim_t01_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "quim_t01_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
