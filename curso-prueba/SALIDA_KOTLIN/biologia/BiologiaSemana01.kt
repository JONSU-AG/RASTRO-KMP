package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t01_s01",
            title = "La Biología como Ciencia y Método Científico - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "La Biología como Ciencia y Método Científico - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Biología Fundamental y Epistemología Científica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.0 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              LA BIOLOGÍA
                                   │
         ┌─────────────────────────┴─────────────────────────┐
         ▼                                                   ▼
DEFINICIÓN Y DESARROLLO HISTÓRICO                    EL MÉTODO CIENTÍFICO
• Término acuñado por Lamarck y Treviranus (1802)    • Observación rigurosa
• Objeto de estudio: La vida y los seres vivos       • Planteamiento del Problema
• Etapas: Antigua, Renacentista, Moderna, Molecular  • Formulación de la Hipótesis
         │                                           • Experimentación controlada:
         ▼                                             - Variable Independiente (Causa)
RAMAS SISTEMÁTICAS DE LA BIOLOGÍA                      - Variable Dependiente (Efecto)
• Por el organismo estudiado:                          - Variables Controladas / Grupo Control
  - Zoología (Protozoología, Helmintología, etc.)    • Análisis de Resultados y Contrastación
  - Botánica (Criptógamas, Fanerógamas)              • Conclusiones y Teoría / Ley Científica
  - Microbiología (Virología, Bacteriología, Micología)
• Por el nivel o aspecto abordado:
  - Citología, Histología, Anatomía, Fisiología
  - Genética, Ecología, Evolución, Taxonomía, Biotecnología
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición, Etimología e Historia de la Biología
La Biología es la ciencia fáctica, natural y empírico-racional que tiene como objeto de estudio integral a la **vida**, a los seres vivos y a los fenómenos vitales: su origen, morfología, fisiología, genética, evolución, taxonomía e interacción con el entorno biocenótico.
* **Etimología:** Vocablos griegos *Bios* (vida) y *Logos* (estudio, tratado o doctrina).
* **Acuñación del Término (1802):** Introducido de manera independiente y formal por el naturalista francés **Jean-Baptiste de Monet, Caballero de Lamarck** en su obra *Hydrogéologie*, y por el naturalista alemán **Gottfried Reinhold Treviranus** en *Biologie oder Philosophie der lebenden Natur*.

#### Hitos Históricos Fundamentales:
1. **Aristóteles (384-322 a.C.):** Padre de la Biología y de la Zoología clásica. Realizó la primera clasificación de los animales (con sangre roja o *enaimos*, y sin sangre roja o *anaimos*). Postuló el origen espontáneo de la vida (abiogénesis/vitalismo).
2. **Teofrasto (371-287 a.C.):** Padre de la Botánica (*De historia plantarum*). Clasificó a las plantas en árboles, arbustos, subarbustos y hierbas.
3. **Andrés Vesalio (1514-1564):** Padre de la Anatomía Moderna (*De humani corporis fabrica*), corrigiendo los errores seculares de Galeno mediante la disección cadavérica directa.
4. **Robert Hooke (1665):** Padre de la Citología. Acuñó el término "célula" (*cell*) al observar los poros hexagonales poliédricos muertos en una fina lámina de corcho con un microscopio compuesto rudimentario (*Micrographia*).
5. **Anton van Leeuwenhoek (1632-1723):** Padre de la Protozoología y Microscopía. Descubrió los primeros microorganismos vivos unicelulares ("animáculos"), bacterias, protozoarios, glóbulos rojos y espermatozoides.
6. **Carl von Linné (Linneo, 1707-1778):** Padre de la Taxonomía y Nomenclatura Binomial (*Systema Naturae*).
7. **Louis Pasteur (1822-1895):** Padre de la Microbiología y la Inmunología moderna. Derrocó definitivamente la teoría de la generación espontánea con sus matraces con cuello de cisne (Biogénesis); desarrolló la pasteurización y vacunas contra la rabia y el ántrax.
8. **Charles Darwin y Alfred Russel Wallace (1858-1859):** Postularon la Teoría de la Evolución por Selección Natural.
9. **Gregor Johann Mendel (1865):** Padre de la Genética. Estableció las leyes de la herencia mendeliana experimentando con guisantes (*Pisum sativum*).
10. **James Watson, Francis Crick, Rosalind Franklin y Maurice Wilkins (1953):** Propusieron el modelo tridimensional de la doble hélice del ADN, marcando el nacimiento de la **Biología Molecular**.

### 3.2. Ramas y Especialidades de la Biología

#### A. Por el Organismo Estudiado (Criterio Taxonómico)
1. **Zoología (Animales):**
   * *Entomología:* Insectos (hexápodos).
   * *Helmintología:* Gusanos planos y cilíndricos (Platelmintos, Nemátodos, Anélidos).
   * *Malacología:* Moluscos (caracoles, pulpos, almejas).
   * *Ictiología:* Peces (condrictios y osteíctios).
   * *Herpetología:* Anfibios y reptiles.
   * *Ornitología:* Aves.
   * *Mastozoología (Mafiología):* Mamíferos.
2. **Botánica o Fitología (Plantas):**
   * *Criptogamia:* Plantas sin semillas ni flores verdaderas:
     - Ficología (Algología): Algas eucariotas.
     - Briología: Musgos y hepáticas (plantas no vasculares).
     - Pteridología: Helechos y colas de caballo (vasculares sin semilla).
   * *Fanerogamia:* Plantas vasculares con semillas:
     - Gimnospermas (semillas desnudas: pinos).
     - Angiospermas (semillas en frutos: monocotiledóneas y dicotiledóneas).
3. **Microbiología (Microorganismos):**
   * *Bacteriología:* Bacterias y arqueas.
   * *Micología:* Hongos mohos, levaduras y setas (reino Fungi).
   * *Protozoología:* Protozoarios unicelulares eucariotas (Amoeba, Paramecium, Plasmodium).
   * *Virología:* Virus, viroides y priones (entidades infecciosas acelulares).

#### B. Por el Nivel Estructural o Aspecto Abordado
1. **Citología (Biología Celular):** Estructura, función y bioquímica de las células.
2. **Histología:** Tejidos biológicos animales y vegetales.
3. **Anatomía:** Estructura macroscópica y disposición espacial de órganos y sistemas.
4. **Fisiología:** Funciones dinámicas, fisicoquímicas y homeostáticas de los seres vivos.
5. **Genética:** Mecanismos de la herencia y variación del material genético (ADN/ARN).
6. **Ecología:** Interrelaciones entre los organismos vivos (biocenosis) y su entorno físico abiótico (biotopo).
7. **Biogeografía:** Distribución geográfica de los taxones en la biosfera (Fitogeografía y Zoogeografía).
8. **Paleontología:** Fósiles y restos orgánicos extintos de eras geológicas pasadas.
9. **Embriología (Biología del Desarrollo):** Formación y desarrollo del organismo desde la fecundación del cigoto hasta el nacimiento.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Confundir Variable Independiente con Variable Dependiente. Pregunta típica de admisión: \"En un experimento donde se aplican concentraciones crecientes de auxinas (X) y \", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t01_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: \"Una hipótesis comprobada en un solo experimento se convierte en Ley\". FALSO CRÍTICO. Un solo experimento no establece una ley científica. Requiere replicabilidad estadís\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t01_s01_c03",
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
                    id = "bio_t01_s01_c04",
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
                    id = "bio_t01_s01_c05",
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
                    id = "bio_t01_s01_c06",
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
                    id = "bio_t01_s01_c07",
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
                    id = "bio_t01_s01_c08",
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
                    id = "bio_t01_s01_c09",
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
                    id = "bio_t01_s01_c10",
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
            id = "bio_t01_s02",
            title = "La Biología como Ciencia y Método Científico - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "La Biología como Ciencia y Método Científico - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
10. **Bioética:** Rama ética que regula la investigación y praxis médica y biotecnológica protegiendo la dignidad y la biosfera.

### 3.3. El Método Científico en las Ciencias Biológicas
Conjunto estructurado y sistemático de pasos lógicos, reproducibles y empíricos que emplea la ciencia para generar conocimiento objetivo y contrastable sobre la naturaleza.

```
[OBSERVACIÓN DE UN HECHO NATURAL]
                 │
                 ▼
     [PREGUNTA / PROBLEMA]
                 │
                 ▼
       [HIPÓTESIS EXPLICATIVA]
 (Proposición tentativa predictiva)
                 │
                 ▼
   [EXPERIMENTACIÓN CONTROLADA]
 (Diseño con Grupo Control y Variables)
                 │
      ┌──────────┴──────────┐
      ▼                     ▼
[DATOS REFUTAN]      [DATOS CONFIRMAN]
(Rechazo/Nueva H.)          │
                            ▼
                    [CONCLUSIÓN Y LEY]
```

1. **Observación Rigurosa:** Detección y descripción cualitativa y cuantitativa minuciosa de un fenómeno biológico natural mediante los órganos sensoriales e instrumental científico (microscopios, sensores). Debe ser objetiva, sistemática y desprejuiciada.
2. **Planteamiento del Problema:** Formulación de una pregunta clara, precisa y delimitada sobre las causas o mecanismos del fenómeno observado.
3. **Formulación de la Hipótesis:** Respuesta tentativa, lógica y fundamentada que propone una explicación causal provisional al problema planteado. **Requisito epistemológico:** Debe ser necesariamente **falsable** (Karl Popper) y contrastable experimentalmente.
4. **Experimentación:** Procedimiento controlado en el laboratorio o campo para poner a prueba la validez de la hipótesis.
   * **Variables de la Investigación:**
     * **Variable Independiente (X, Causa o Factor manipulado):** Aquella variable que el investigador modifica deliberadamente para evaluar sus efectos.
     * **Variable Dependiente (Y, Efecto o Respuesta medida):** Variable biológica que cambia como consecuencia directa de la manipulación de la variable independiente.
     * **Variables Controladas:** Factores ambientales y biológicos que se mantienen estrictamente constantes durante todo el ensayo (temperatura, pH, fotoperiodo, especie).
   * **Diseño con Grupos de Comparación:**
     * **Grupo Experimental:** Sometido a la acción de la variable independiente.
     * **Grupo Control (Testigo):** Idéntico al experimental en todas las variables, pero **sin la presencia de la variable independiente**. Permite descartar factores fortuitos y atribuir con certeza estadística la causa del fenómeno.
5. **Análisis de Resultados:** Recolección, ordenamiento estadístico, graficación e interpretación de los datos empíricos.
6. **Conclusión y Contrastación:** Se determina si los datos respaldan o refutan la hipótesis:
   * Si la refutan: Se descarta la hipótesis y se reformula una nueva.
   * Si la confirman repetidamente en diversos laboratorios independientes del mundo, adquiere el rango de:
     * **Teoría Científica:** Explicación amplia, unificadora y rigurosamente contrastada de un conjunto vasto de fenómenos naturales (ej. Teoría Celular, Teoría de la Evolución por Selección Natural, Teoría Cromosómica de la Herencia).
     * **Ley Científica:** Enunciado descriptivo matemático o verbal invariable y universal que describe regularidades constantes de la naturaleza (ej. Leyes de Mendel de la segregación independiente).

---

### 4. SISTEMA DE CLASIFICACIÓN EPISTEMOLÓGICA DE LAS CIENCIAS
* **Ciencias Formales:** Trabajan con entes abstractos e ideales creados por la mente humana; usan la deducción estricta (Lógica, Matemática).
* **Ciencias Fácticas:** Trabajan con hechos materiales reales del universo; usan la observación y la contrastación empírica:
  * *Ciencias Naturales:* Biología, Física, Química, Geología, Astronomía.
  * *Ciencias Sociales:* Historia, Sociología, Antropología, Economía.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Pasos del Método Científico:** **"O-P-H-E-C"**
  * **O**bservación \to **P**roblema \to **H**ipótesis \to **E**xperimentación \to **C**onclusión.
* **Mnemotecnia Ramas de la Botánica:**
  * **"FI-BRI-PTE" son criptógamas (sin semillas):**
    * **Fi**cología (Algas)
    * **Bri**ología (Musgos)
    * **Pte**ridología (Helechos).
* **Hacking de Variables en Examen:**
  * Si la pregunta dice: *"Para investigar el EFECTO DE [A] SOBRE [B]"*:
    * [A] = Variable Independiente (Causa).
    * [B] = Variable Dependiente (Efecto medido).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir Variable Independiente con Variable Dependiente.** Pregunta típica de admisión: "En un experimento donde se aplican concentraciones crecientes de auxinas (X) y se mide el alargamiento de los tallos de maíz (Y)": La concentración de auxinas es la **Variable Independiente** (el investigador la manipula) y la longitud del tallo es la **Variable Dependiente** (la respuesta fisiológica).
* **Trampa 2: "Una hipótesis comprobada en un solo experimento se convierte en Ley".** FALSO CRÍTICO. Un solo experimento no establece una ley científica. Requiere replicabilidad estadística independiente a nivel internacional y universalidad causal.
* **Trampa 3: Asignar a Robert Hooke el descubrimiento de células vivas.** FALSO. Hooke solo observó las paredes celulares vacías de células vegetales muertas en tejido suberoso de corcho. Quien observó las primeras células y microorganismos vivos móviles fue **Anton van Leeuwenhoek**.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t01_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Asignar a Robert Hooke el descubrimiento de células vivas. FALSO. Hooke solo observó las paredes celulares vacías de células vegetales muertas en tejido suberoso de corch\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t01_s02_c02",
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
                    id = "bio_t01_s02_c03",
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
                    id = "bio_t01_s02_c04",
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
                    id = "bio_t01_s02_c05",
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
                    id = "bio_t01_s02_c06",
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
                    id = "bio_t01_s02_c07",
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
                    id = "bio_t01_s02_c08",
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
                    id = "bio_t01_s02_c09",
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
                    id = "bio_t01_s02_c10",
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
