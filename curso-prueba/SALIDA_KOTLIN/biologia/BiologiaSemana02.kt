package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t02_s01",
            title = "Seres Vivos, Características, Niveles de Organización y Virus - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Seres Vivos, Características, Niveles de Organización y Virus - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Biología Celular y Supramolecular / Virología Médica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Mecanismos de homeostasis, niveles de organización, estructura vírica y ciclos lítico/lisogénico)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.8 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         EL SER VIVO Y LA MATERIA VIVA
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
CARACTERÍSTICAS DEL SER VIVO                                NIVELES DE ORGANIZACIÓN
• Organización compleja y específica                        • Nivel Químico / Abiótico:
• Metabolismo (Anabolismo y Catabolismo)                      - Subatómico, Atómico, Molecular,
• Homeostasis (Equilibrio interno dinámico)                    Macromolecular, Supramolecular (Virus)
• Irritabilidad y Coordinación                              • Nivel Biológico / Celular:
• Adaptación y Evolución                                      - Célula, Tejido, Órgano, Sistema, Individuo
• Reproducción (Asexual y Sexual)                           • Nivel Ecológico:
• Crecimiento e Hipertrofia/Hiperplasia                       - Población, Comunidad (Biocenosis),
                                                                Ecosistema, Bioma, Biosfera
         ┌───────────────────────────────────────────────────────────┘
         ▼
LOS VIRUS (ENTIDADES ACELULARES SUPRAMOLECULARES)
• Parásitos intracelulares obligados (Sin metabolismo propio)
• Estructura: Genoma (ADN o ARN, nunca ambos) + Cápside (capsómeros) \pm Envoltura lipídica
• Viroides (ARN desnudo monocatenario circular en plantas)
• Priones (Proteínas infecciosas mal plegadas PrP^{Sc}, sin ácidos nucleicos)
• Ciclos de Replicación Viral:
  - Ciclo Lítico (Infección virulenta, lisis celular)
  - Ciclo Lisogénico (Integración como Prófago / Provirus, latencia)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Características Fundamentales de los Seres Vivos
Un ser vivo es un sistema termodinámico abierto, altamente organizado, complejo, homeostático y autopoiético (Maturana y Varela), capaz de intercambiar materia y energía con el entorno, perpetuando su información genética a través de generaciones:

1. **Organización Compleja y Específica:** Poseen una estructura jerárquica tridimensional donde la unidad morfológica, funcional y genética mínima de vida independiente es la **célula**.
2. **Metabolismo:** Conjunto integrado de reacciones bioquímicas enzimáticas acopladas que ocurren en el seno celular para transformar materia y energía:
   * **Anabolismo (Fase de Síntesis / Asimilación):** Vía endergónica (\Delta G > 0) que construye moléculas complejas a partir de precursores simples con consumo de energía metabólica (ATP).
     * Ejemplos: Fotosíntesis, síntesis de proteínas (traducción), gluconeogénesis, replicación del ADN.
   * **Catabolismo (Fase de Degradación / Desasimilación):** Vía exergónica (\Delta G < 0) que fragmenta biomoléculas complejas en sustancias más sencillas liberando energía útil que se almacena como ATP.
     * Ejemplos: Respiración celular aerobia, glucólisis, ciclo de Krebs, fermentación láctica, digestión enzimática.
3. **Homeostasis (Claude Bernard y Walter Cannon):** Capacidad biológica de mantener una estabilidad relativa y dinámica en las condiciones fisicoquímicas del medio interno celular y tisular frente a fluctuaciones ambientales (ej. regulación de temperatura corporal, balance osmótico hídrico, concentración de glucosa en sangre [70-100\text{ mg/dL}], pH sanguíneo [7.35-7.45]).
4. **Irritabilidad y Coordinación:**
   * **Irritabilidad:** Respuesta biológica inmediata, transitoria y coordinada ante estímulos ambientales físicos o químicos (ej. contracción muscular, parpadeo ante un destello, secreción glandular).
   * **Movimientos en Plantas y Animales:**
     * *Taxismo (o Taxia):* Desplazamiento locomotor orientado de células u organismos libres ante un estímulo (ej. fototaxia en *Euglena*, quimiotaxia positiva de espermatozoides).
     * *Tropismo:* Crecimiento o curvatura permanente e irreversible de una planta hacia o contra el estímulo (ej. fototropismo positivo del tallo, geotropismo positivo de la raíz).
     * *Nastia:* Movimiento rápido, temporal y reversible de una planta sin orientación fija a la dirección del estímulo (ej. cierre de hojas de *Mimosa pudica* por sismonastia, apertura nocturna de flores por nictinastia).
5. **Adaptación y Evolución:**
   * **Adaptación:** Respuesta lenta y progresiva a largo plazo en la cual una especie modifica sus rasgos morfológicos, fisiológicos o conductuales para aumentar su eficacia biológica (*fitness*) y supervivencia ante cambios ambientales.
   * **Evolución:** Cambio acumulativo en las frecuencias génicas de una población a través de generaciones sucesivas guiado por la selección natural y deriva genética.
6. **Reproducción:** Proceso biológico autoperpetuante que asegura la continuidad de la especie en el tiempo:
   * **Asexual (Agámica / Clonal):** Participa un solo progenitor, no intervienen gametos ni fecundación, ocurre por mitosis; genera descendientes genéticamente idénticos (clones) sin variabilidad genética (salvo mutación) (ej. bipartición, gemación, esporulación, fragmentación).
   * **Sexual (Gámica):** Generalmente dos progenitores con formación de gametos haploides (n) por meiosis y posterior fecundación (singamia); origina descendientes con alta **variabilidad genética** por *crossing-over* y segregación al azar.
7. **Crecimiento y Desarrollo:**
   * Crecimiento en unicelulares: Aumento del volumen celular individual.
   * Crecimiento en pluricelulares: Por aumento del número de células (**Hiperplasia** por mitosis) y aumento del tamaño celular (**Hipertrofia**).

### 3.2. Niveles de Organización de la Materia
La materia se estructura en niveles jerárquicos de complejidad creciente donde en cada nivel emergen **propiedades emergentes** no presentes en los niveles inferiores:

```
[NIVEL QUÍMICO / ABIÓTICO]
Subatómico -> Atómico -> Molecular -> Macromolecular -> Complejo Supramolecular (Virus)
                                                                    │
                                            [FRONTERA DE LA VIDA]  ▼
[NIVEL BIOLÓGICO / CELULAR]
Célula (Mínima unidad de vida) -> Tejido -> Órgano -> Sistema -> Individuo
                                                                    │
                                                                    ▼
[NIVEL ECOLÓGICO]
Población -> Comunidad (Biocenosis) -> Ecosistema -> Bioma -> Biosfera
```

1. **Nivel Químico (Abiótico / Inerte):**
   * *Subatómico:* Protones, neutrones, electrones, quarks.
   * *Atómico:* Bioelementos (C, H, O, N, P, S, Fe, Ca).
   * *Molecular:* Moléculas simples inorgánicas y orgánicas (H_2O, CO_2, glucosa, aminoácidos, nucleótidos).
   * *Macromolecular:* Polímeros de alto peso molecular (proteínas, polisacáridos como glucógeno y almidón, ácidos nucleicos ADN y ARN).
   * *Asociación Supramolecular:* Interacción macromolecular no covalente: **Virus**, ribosomas, cromatina, membranas biológicas.
2. **Nivel Biológico (Biótico / Vivo):**
   * *Nivel Celular:* Primera manifestación formal de vida independiente (bacterias, protozoarios, miocito, neurona).
   * *Nivel Tisular:* Agrupación de células especializadas con origen embriológico y función común (tejido epitelial, óseo, xilema).
   * *Nivel Orgánico:* Conjunto estructurado de tejidos que desempeñan una función específica (corazón, hígado, hoja, raíz).
   * *Nivel Sistémico:* Integración funcional de órganos coordinados (sistema nervioso, digestivo, circulatorio).
   * *Nivel Individuo (Organismo):* Ser vivo unicelular o pluricelular considerado como una unidad biológica integral.
3. **Nivel Ecológico:**
   * *Población:* Conjunto de individuos de la **misma especie** que conviven en un espacio geográfico delimitado y tiempo determinado, capaces de reproducirse entre sí.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"Los virus pertenecen al Reino Monera o Protista\". ERROR GRAVE. Los virus NO pertenecen a ningún reino de la naturaleza (Monera, Protista, Fungi, Plantae, Animalia) porqu\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t02_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: \"Los priones contienen ADN o ARN monocatenario protegido\". FALSO. Stanley Prusiner demostró que los priones son agentes puramente proteicos sin trazas de ácidos nucleicos\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t02_s01_c03",
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
                    id = "bio_t02_s01_c04",
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
                    id = "bio_t02_s01_c05",
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
                    id = "bio_t02_s01_c06",
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
                    id = "bio_t02_s01_c07",
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
                    id = "bio_t02_s01_c08",
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
                    id = "bio_t02_s01_c09",
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
                    id = "bio_t02_s01_c10",
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
            id = "bio_t02_s02",
            title = "Seres Vivos, Características, Niveles de Organización y Virus - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Seres Vivos, Características, Niveles de Organización y Virus - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   * *Comunidad o Biocenosis:* Conjunto de poblaciones de **diferentes especies** (animales, plantas, microorganismos) que interactúan en un mismo biotopo.
   * *Ecosistema:* Unidad funcional de la ecología constituida por la interacción dinámica entre la comunidad biológica (**Biocenosis**) y el medio físico abiótico (**Biotopo**).
   * *Bioma:* Gran región ecológica caracterizada por un macroclima homogéneo y formaciones vegetales y faunísticas distintivas (Tundra, Taiga, Selva tropical).
   * *Biosfera:* La totalidad del planeta Tierra donde se manifiesta la vida (suma de litosfera, hidrosfera y troposfera habitadas).

### 3.3. Los Virus: Entidades Acelulares Supramoleculares

#### A. Naturaleza Biológica de los Virus
Los virus **NO son seres vivos** según el consenso de la biología celular contemporánea:
* Carecen de estructura celular (acelulares), no poseen citoplasma, organelas ni metabolismo propio.
* No sintetizan ATP ni tienen ribosomas para ensamblar proteínas de forma autónoma.
* Son **parásitos intracelulares obligados**: requieren secuestrar la maquinaria enzimática y traduccional de una célula hospedera para replicarse.
* En estado extracelular inerte son partículas metabólicamente inactivas llamadas **viriones**, las cuales son capaces de **cristalizar** (Wendy Stanley, 1935, virus del mosaico del tabaco).

#### B. Estructura Morfológica del Virión
1. **Genoma Viral (Core o Núcleo Ácido):** Contiene la información genética del virus. Puede ser **ADN o ARN, pero NUNCA ambos simultáneamente**. Puede ser monocatenario (mc) o bicatenario (bc), lineal o circular.
2. **Cápside:** Cubierta protectora proteica constituida por subunidades globulares llamadas **capsómeros**.
   * *Simetría de la cápside:*
     * *Icosaédrica:* Forma poliédrica de 20 caras triangulares (ej. Adenovirus, Poliovirus).
     * *Helicoidal / Cilíndrica:* Disposición en espiral tubular (ej. Virus del mosaico del tabaco, Rabia).
     * *Compleja:* Cabeza icosaédrica unida a una cola helicoidal con placa basal y espículas de fijación (típica de **Bacteriófagos** o fagos).
3. **Envoltura Lipoproteica:** Membrana de bicapa lipídica derivada de la célula hospedera durante la gemación, con glicoproteínas virales insertadas (espículas, como la proteína Spike S del SARS-CoV-2 o la Hemaglutinina y Neuraminidasa del virus de la influenza). Los virus sin envoltura se llaman **virus desnudos**.

#### C. Ciclos de Replicación Viral
1. **Ciclo Lítico (Vía Virulenta):**
   * **Fijación o Adsorción:** Interacción específica entre receptores de la membrana celular y ligandos proteicos del virión.
   * **Penetración:** Inyección del material genético viral al interior del citoplasma (bacteriófagos) o endocitosis / fusión de membrana (virus con envoltura).
   * **Replicación y Eclipse:** Replicación forzada del genoma viral y síntesis masiva de proteínas capsulares por los ribosomas celulares.
   * **Ensamblaje:** Empaquetamiento automático de los genomas dentro de las nuevas cápsides para constituir viriones hijos maduros.
   * **Liberación o Lisis:** Destrucción y ruptura violenta de la pared/membrana de la célula hospedera liberando cientos de viriones infectivos al exterior celular.
2. **Ciclo Lisogénico (Vía Apirulenta o Latente):**
   * Tras la penetración, el genoma viral no toma el control metabólico inmediato, sino que se inserta covalentemente en el cromosoma bacteriano o genoma celular.
   * El genoma viral integrado y silente se denomina **Prófago** (en bacterias) o **Provirus** (en eucariotas, ej. VIH o virus del Herpes).
   * La célula infectada se reproduce por mitosis transmitiendo el genoma viral a todas sus células hijas sin destruirse.
   * Ante factores estresantes (radiación UV, daño térmico), el prófago se desreprime, escinde del genoma y activa el ciclo lítico destructivo.

#### D. Entidades Subvíricas
1. **Viroides:** Moléculas infecciosas de **ARN monocatenario circular desnudo** (sin cápside proteica) de muy bajo peso molecular (250-400\text{ nucleótidos}). Infectan y causan enfermedades exclusivamente en **plantas** (ej. tubérculo fusiforme de la papa).
2. **Priones (Prusiner, Premio Nobel 1997):** Proteínas acelulares infecciosas **desprovistas por completo de ácidos nucleicos**. Son isoformas patógenas anormales mal plegadas (PrP^{Sc}, ricas en láminas \beta) de una proteína normal celular (PrP^C, rica en hélices \alpha). Inducen un cambio conformacional degenerativo en cadena sobre las proteínas normales del sistema nervioso central:
   * Causan **Encefalopatías Espongiformes Transmisibles (EET)**: Mal de las vacas locas (Encefalopatía espongiforme bovina), Kuru, Enfermedad de Creutzfeldt-Jakob e Insomnio Familiar Fatal.

---

### 4. CUADRO COMPARATIVO: VIRUS, VIROIDES Y PRIONES
\begin{array}{|l|c|c|c|}
\hline
\textbf{Parámetro} & \textbf{Virus} & \textbf{Viroide} & \textbf{Prión} \\
\hline
\textbf{Composición} & \text{Ácido nucleico (ADN o ARN) + Proteínas} & \text{ARN circular desnudo exclusivamente} & \text{Proteína infecciosa } (PrP^{Sc}) \text{ exclusivamente} \\
\textbf{Ácido nucleico} & \text{Presente (ADN o ARN)} & \text{Presente (ARN corto)} & \textbf{AUSENTE TOTALMENTE} \\
\textbf{Cápside proteica} & \text{Presente} & \text{Ausente} & \text{Ausente} \\
\textbf{Huéspedes} & \text{Bacterias, plantas, animales, hongos} & \text{Exclusivamente vegetales} & \text{Mamíferos y seres humanos} \\
\textbf{Ejemplos} & \text{VIH, SARS-CoV-2, Bacteriófago T4} & \text{Viroide del enanismo del crisantemo} & \text{Mal de las vacas locas, Creutzfeldt-Jakob} \\
\hline
\end{array}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Niveles Ecológicos:** **"P-C-E-B-B"**
  * **P**oblación \to **C**omunidad \to **E**cosistema \to **B**ioma \to **B**iosfera.
* **Mnemotecnia Anabolismo y Catabolismo:**
  * **A-B-C-D:**
    * **A**nabolismo **B**uilds (Construye con ATP).
    * **C**atabolismo **D**estruye (Degrada y libera energía).
* **Hacking de Virus:**
  * Si te preguntan si un virus tiene ADN y ARN simultáneamente, la respuesta es invariablemente **NO**. Solo poseen uno de los dos.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "Los virus pertenecen al Reino Monera o Protista".** ERROR GRAVE. Los virus NO pertenecen a ningún reino de la naturaleza (Monera, Protista, Fungi, Plantae, Animalia) porque no son seres vivos y carecen de célula. Pertenecen al nivel de organización supramolecular abiótico.
* **Trampa 2: "Los priones contienen ADN o ARN monocatenario protegido".** FALSO. Stanley Prusiner demostró que los priones son agentes puramente proteicos sin trazas de ácidos nucleicos.
* **Trampa 3: Confundir Tropismo con Taxismo.** El tropismo es un crecimiento irreversible y lento propio de vegetales fijos; el taxismo es un desplazamiento o natación de organismos con movilidad propia libre (protozoarios, bacterias, células animales).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t02_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Confundir Tropismo con Taxismo. El tropismo es un crecimiento irreversible y lento propio de vegetales fijos; el taxismo es un desplazamiento o natación de organismos con\", el procedimiento analítico riguroso exige:",
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
                    id = "bio_t02_s02_c02",
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
                    id = "bio_t02_s02_c03",
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
                    id = "bio_t02_s02_c04",
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
                    id = "bio_t02_s02_c05",
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
                    id = "bio_t02_s02_c06",
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
                    id = "bio_t02_s02_c07",
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
                    id = "bio_t02_s02_c08",
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
                    id = "bio_t02_s02_c09",
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
                    id = "bio_t02_s02_c10",
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
