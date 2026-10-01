package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t05_s01",
            title = "Enlace Químico y Fuerzas Intermoleculares - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Enlace Químico y Fuerzas Intermoleculares - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química General / Enlace y Estructura Molecular
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Geometría molecular, polaridad, puente de hidrógeno)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.7 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ENLACE QUÍMICO
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
FUERZAS INTRAMOLECULARES                                FUERZAS INTERMOLECULARES
(Unen átomos o iones / Fuertes)                         (Unen moléculas entre sí / Débiles)
         │                                                       │
 ┌───────┼───────┐                                       ┌───────┼───────┐
 ▼       ▼       ▼                                       ▼       ▼       ▼
IÓNICO  COVALENTE METÁLICO                         PUENTE DE   DIPOLO-  DISPERSIÓN
(Electro- (Compar- (Mar de                        HIDRÓGENO   DIPOLO   DE LONDON
valente)  tición)   electrones)                   (F, O, N)   (Keesom) (Moléculas
                                                                        apolares)
         │
 ┌───────┴───────┐
 ▼               ▼
APOLAR         POLAR
(\Delta EN = 0) (\Delta EN > 0)
(Normal / Coordinado o Dativo)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Principio Fundamental del Enlace Químico
Los átomos se enlazan para alcanzar un estado de **mínima energía potencial y máxima estabilidad termodinámica**, adquiriendo generalmente la configuración electrónica de un gas noble (Regla del Octeto de Gilbert N. Lewis: 8 electrones en su capa de valencia, salvo el hidrógeno y helio que cumplen el dueto).
* **Notación de Lewis:** Representación de los electrones de valencia mediante puntos o cruces alrededor del símbolo del elemento.
* **Excepciones a la Regla del Octeto:**
  1. *Octeto Incompleto:* Berilio (BeCl_2, 4 electrones centrales) y Boro (BF_3, 6 electrones centrales).
  2. *Octeto Expandido (Hipervalencia):* Elementos a partir del tercer período que usan orbitales d vacíos (PCl_5, 10 electrones; SF_6, 12 electrones).
  3. *Moléculas con Número Impar de Electrones (Radicales Libres):* NO, NO_2.

### 3.2. Clasificación de Enlaces Químicos Interatómicos

#### A. Enlace Iónico o Electrovalente
* **Naturaleza:** Atracción electrostática pura (Ley de Coulomb) entre iones de cargas opuestas (cationes y aniones).
* **Mecanismo:** Transferencia neta de uno o más electrones desde un metal de baja energía de ionización (grupos IA, IIA) hacia un no metal de alta electronegatividad (grupos VIA, VIIA).
* **Diferencia de Electronegatividad:** Generalmente \Delta EN \ge 1.7 (según Pauling).
* **Propiedades de los Compuestos Iónicos:**
  1. Forman **redes cristalinas tridimensionales** continuas (no forman moléculas individuales discretas).
  2. Son sólidos duros pero quebradizos a temperatura ambiente (25^\circ\text{C}).
  3. Poseen altos puntos de fusión y ebullición (> 400^\circ\text{C}) debido a su elevada Energía Reticular (U_0, ciclo de Born-Haber).
  4. En estado sólido **no conducen la corriente eléctrica** (electrones fijos en la red).
  5. Conducen la electricidad al estar **fundidos** o **disueltos en agua** (electrolitos de iones libres móviles).
  6. Son altamente solubles en solventes polares como el agua.

#### B. Enlace Covalente
* **Naturaleza:** Compartición equitativa o no de uno o más pares de electrones entre átomos no metálicos (EN similares).
* **Clasificación por la diferencia de Electronegatividad:**
  1. *Covalente Apolar o Puro:* \Delta EN = 0 o muy cercano a cero (\Delta EN \le 0.4). Los electrones se comparten simétricamente (ej. H_2, O_2, N_2, Cl_2, CH_4).
  2. *Covalente Polar:* 0.4 < \Delta EN < 1.7. Existe un desplazamiento de la densidad electrónica hacia el átomo más electronegativo, formándose dipolos de carga parcial (\delta^+ - \delta^-) (ej. HCl, H_2O, NH_3).
* **Clasificación por el aporte de electrones al par enlazante:**
  1. *Covalente Normal:* Cada átomo aporta 1 electrón para constituir el par enlazante.
  2. *Covalente Coordinado o Dativo (\to):* Uno de los átomos aporta el par solitario completo, mientras que el otro átomo receptor dispone de un orbital vacío para albergarlo (ej. NH_4^+, H_3O^+, SO_2, SO_3, O_3).

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. ESCALA COMPARATIVA DE FUERZA DE ENLACES
\text{Iónico } \approx \text{ Covalente } > \text{ Metálico } \gg \text{ Puente de Hidrógeno } > \text{ Dipolo-Dipolo } > \text{ Fuerzas de London}
*(Los enlaces químicos interatómicos son del orden de 150 - 900\text{ kJ/mol}, mientras que las fuerzas intermoleculares rondan entre 0.1 - 40\text{ kJ/mol}).*

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t05_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"Toda molécula con enlaces polares es polar\". FALSO CRÍTICO. Si la molécula es altamente simétrica, los vectores momentos dipolares individuales de enlace se cancelan geo\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t05_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: \"El enlace dativo o coordinado es más débil que el normal una vez formado\". FALSO. Una vez que se constituye el enlace dativo, es químicamente indistinguible e idéntico e\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t05_s01_c03",
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
                    id = "quim_t05_s01_c04",
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
                    id = "quim_t05_s01_c05",
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
                    id = "quim_t05_s01_c06",
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
                    id = "quim_t05_s01_c07",
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
                    id = "quim_t05_s01_c08",
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
                    id = "quim_t05_s01_c09",
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
                    id = "quim_t05_s01_c10",
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
            id = "quim_t05_s02",
            title = "Enlace Químico y Fuerzas Intermoleculares - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Enlace Químico y Fuerzas Intermoleculares - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Clasificación por el número de pares compartidos:**
  * *Simple:* 1 par compartido (\sigma).
  * *Doble:* 2 pares compartidos (1\sigma + 1\pi).
  * *Triple:* 3 pares compartidos (1\sigma + 2\pi).
  * *Enlaces Sigma (\sigma):* Solapamiento frontal de orbitales a lo largo del eje internuclear. Es más fuerte y de menor energía.
  * *Enlaces Pi (\pi):* Solapamiento lateral de orbitales p paralelos. Es más reactivo y débil.

#### C. Enlace Metálico
* **Modelo del Mar de Electrones (Lorentz-Drude) / Teoría de Bandas:** Los cationes metálicos fijos se hallan sumergidos en un fluido deslocalizado de electrones de valencia móviles.
* **Propiedades:** Alta conductividad eléctrica y térmica en estado sólido y líquido, brillo metálico característico, maleabilidad (láminas) y ductilidad (hilos).

### 3.3. Geometría Molecular y Polaridad (Teoría RPECV)
La **Teoría de Repulsión de Pares de Electrones de la Capa de Valencia (RPECV)** establece que las regiones de densidad electrónica alrededor de un átomo central se orientan para minimizar las repulsiones mutuas:
\text{Repulsión: } \text{Par Solitario - Par Solitario} > \text{Par Solitario - Par Enlazante} > \text{Par Enlazante - Par Enlazante}

| Molécula | Pares Enlazantes | Pares Libres | Geometría Electrónica | Geometría Molecular | Ángulo de Enlace | Momento Dipolar (\mu) |
| :--- | :---: | :---: | :--- | :--- | :---: | :---: |
| BeCl_2 / CO_2 | 2 | 0 | Lineal | Lineal | 180^\circ | \mu = 0 (Apolar) |
| BF_3 / SO_3 | 3 | 0 | Trigonal Plana | Trigonal Plana | 120^\circ | \mu = 0 (Apolar) |
| SO_2 / O_3 | 2 | 1 | Trigonal Plana | Angular | \approx 119^\circ | \mu \ne 0 (Polar) |
| CH_4 / CCl_4 | 4 | 0 | Tetraédrica | Tetraédrica | 109.5^\circ | \mu = 0 (Apolar) |
| NH_3 | 3 | 1 | Tetraédrica | Piramidal Trigonal | 107.3^\circ | \mu \ne 0 (Polar) |
| H_2O | 2 | 2 | Tetraédrica | Angular | 104.5^\circ | \mu \ne 0 (Polar) |

### 3.4. Fuerzas Intermoleculares (Fuerzas de Van der Waals)
Son atracciones electrostáticas secundarias entre moléculas discretas que determinan las propiedades macroscópicas (puntos de ebullición, fusión, viscosidad, tensión superficial):
1. **Enlace Puente de Hidrógeno:** Caso extremo y extraordinariamente intenso de atracción dipolo-dipolo. Ocurre cuando un átomo de **Hidrógeno** está unido covalentemente a un átomo diminuto y fuertemente electronegativo: **Flúor (F), Oxígeno (O) o Nitrógeno (N)** ("FON").
   * Explica los altísimos puntos de ebullición del H_2O, HF y NH_3 comparados con los hidruros de sus respectivos períodos inferiores (H_2S, HCl, PH_3), y la estructura en hélice del ADN.
2. **Fuerzas Dipolo-Dipolo (Fuerzas de Keesom):** Atracción electrostática entre los extremos permanentemente positivos y negativos de moléculas **polares** (\mu \ne 0) (ej. HCl, SO_2, CHCl_3).
3. **Fuerzas de Dispersión de London (Dipolo Instantáneo - Dipolo Inducido):** Fuerzas cuánticas de fluctuación presentes en **todas las moléculas e iones**, pero son las **únicas fuerzas presentes en moléculas apolares y gases nobles** (O_2, N_2, CO_2, CH_4, He). Su intensidad aumenta proporcionalmente con el peso molecular y la polarizabilidad de la nube electrónica.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia para Puentes de Hidrógeno:** **"H con FON"**
  * Solo hay puente de hidrógeno si el Hidrógeno está enlazado directamente a **F**lúor, **O**xígeno o **N**itrógeno (H-F, H-O, H-N).
* **Mnemotecnia para Contabilizar Enlaces \sigma y \pi:**
  * Enlace simple: 1\sigma.
  * Enlace doble: 1\sigma + 1\pi.
  * Enlace triple: 1\sigma + 2\pi.
* **Hacking de Polaridad Molecular:**
  * Si el átomo central NO tiene pares libres y todos los átomos periféricos que lo rodean son idénticos \implies La molécula es **APOLAR** (\mu_R = 0).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "Toda molécula con enlaces polares es polar".** FALSO CRÍTICO. Si la molécula es altamente simétrica, los vectores momentos dipolares individuales de enlace se cancelan geométricamente dando un momento dipolar resultante nulo (\mu_R = 0). Ejemplos: CO_2 (lineal), BF_3 (trigonal plana), CCl_4 (tetraédrica) tienen enlaces covalentes muy polares, pero las moléculas son **estrictamente apolares**.
* **Trampa 2: "El enlace dativo o coordinado es más débil que el normal una vez formado".** FALSO. Una vez que se constituye el enlace dativo, es químicamente indistinguible e idéntico en longitud, orden y energía a un enlace covalente normal.
* **Trampa 3: "El compuesto HF tiene enlaces iónicos porque \Delta EN = 4.0 - 2.1 = 1.9 > 1.7".** FALSO. Es la clásica excepción preuniversitaria: el fluoruro de hidrógeno (HF) es un compuesto covalente polar y gaseoso a temperatura ambiente, no un compuesto iónico reticular.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t05_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"El compuesto HF tiene enlaces iónicos porque \\Delta EN = 4.0 - 2.1 = 1.9 > 1.7\". FALSO. Es la clásica excepción preuniversitaria: el fluoruro de hidrógeno (HF) es un\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t05_s02_c02",
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
                    id = "quim_t05_s02_c03",
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
                    id = "quim_t05_s02_c04",
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
                    id = "quim_t05_s02_c05",
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
                    id = "quim_t05_s02_c06",
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
                    id = "quim_t05_s02_c07",
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
                    id = "quim_t05_s02_c08",
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
                    id = "quim_t05_s02_c09",
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
                    id = "quim_t05_s02_c10",
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
