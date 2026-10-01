package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana09 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t09_s01",
            title = "Detección de Falacias Simples - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Detección de Falacias Simples - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE I: Aptitud Académica |
| **Componente / Asignatura** | Razonamiento Lógico |
| **Tema Oficial N.°** | Tema IX: Detección de falacias simples |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 6-7, 44-45) |
| **Ponderación por Pregunta** | **1.124150000 pts** (Áreas: Ingenierías, Biomédicas, Sociales) |
| **Preguntas por Examen** | 4 preguntas en componente Lógico (Total: 4.4966000 pts de 20.00 pts de Aptitud) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Crítico, Evaluación Argumentativa y Metacognición |
| **Conexión Interuniversitaria** | **UNSA:** Falacias no formales de atingencia y ambigüedad en discursos.<br>**UNMSM (DECO):** Preguntas de lectura crítica, debilitamiento/reforzamiento de argumentos.<br>**UNI:** Lógica dialéctica, inconsistencia pragmática y sofismas en debates. |

### Matriz de Indicadores de Logro Evaluados
1. **Identificación de falacias no formales:** Reconocer argumentos engañosos que psicológicamente persuaden pero que carecen de soporte lógico formal.
2. **Generalización indebida (*Secundum Quid*):** Detectar extrapolaciones abusivas a partir de muestras reducidas o casos aislados.
3. **Falsa causa (*Post hoc ergo propter hoc* / *Non causa pro causa*):** Discriminar entre mera correlación cronológica y una genuina relación de causalidad física o matemática.
4. **Falacias de ambigüedad lógica:** Detectar equívocos léxicos, anfibologías sintácticas y desplazamientos de significado a mitad de un razonamiento.
5. **Evaluación de la solidez argumentativa:** Juzgar si una conclusión se sostiene por premisas pertinentes y suficientes o mediante trucos retóricos.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                            TEORÍA DE LAS FALACIAS
                                      │
           ┌──────────────────────────┴──────────────────────────┐
           ▼                                                     ▼
   FALACIAS FORMALES                                    FALACIAS NO FORMALES
 (Violan leyes de cálculo)                            (Defectos de contenido/contexto)
           │                                                     │
     ┌─────┴─────┐                               ┌───────────────┴───────────────┐
     ▼           ▼                               ▼                               ▼
Afirmación    Negación del             FALACIAS DE ATINGENCIA              FALACIAS DE AMBIGÜEDAD
del Consec.   Antecedente              (Falta de conexión lógica)           (Lenguaje confuso)
                                                 │                               │
                      ┌──────────────────────────┼───────────────┐        ┌──────┴──────┐
                      ▼                          ▼               ▼        ▼             ▼
                 Generalización                Falsa           Otras   Equívoco    Anfibología
                    Indebida                   Causa          (Ad hominem,
                 (Muestra sesgada)         (Post hoc...)      Ad populum...)
```

### Ontología de la Falacia
- **Falacia:** Argumento que parece válido pero que resulta lógicamente incorrecto tras un escrutinio riguroso.
- **Paralogismo:** Razonamiento falaz cometido de buena fe o por ignorancia, sin intención de engañar.
- **Sofisma:** Razonamiento falaz construido deliberadamente con la intención maliciosa de manipular o engañar al receptor.
- **Premisa Irrelevante (Inatingencia):** Proposición que no aporta evidencia pertinente para fundar la conclusión pretendida.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Falacias de Atingencia Prioritarias en el Temario UNSA

#### A. Generalización Indebida (*Secundum Quid* / Muestra Insuficiente)
- **Mecanismo:** Se infiere una conclusión universal o atributiva sobre toda una población a partir del análisis de un número minúsculo, no representativo o sesgado de casos particulares.
- **Estructura lógica defectuosa:**
  X_1 \in A \land X_1 \text{ es } B, \quad X_2 \in A \land X_2 \text{ es } B \implies \forall x (x \in A \to x \text{ es } B)
- *Ejemplo típico:* "Ayer vi a dos conductores de transporte público cruzar la luz roja en la Av. Ejército. Por tanto, todos los choferes de transporte público de Arequipa son irresponsables".

#### B. Falsa Causa (*Non Causa Pro Causa* y *Post Hoc Ergo Propter Hoc*)
- **Mecanismo:** Consiste en atribuir a un fenómeno antecedente la condición de causa determinante de un fenómeno consecuente basándose únicamente en la coincidencia temporal de ambos.
- **Axioma científico violado:** *"Correlación no implica causalidad"* (\text{Corr}(X, Y) \neq X \implies Y).
- *Ejemplo típico:* "Desde que el nuevo presidente asumió el cargo, no ha llovido en la cuenca del Chili. Por lo tanto, el mandatario es el culpable de la sequía regional".

#### C. Falacia de Contradicción Interna (Inconsistencia Discursiva)
- **Mecanismo:** Un mismo emisor sostiene dos proposiciones que no pueden coexistir bajo el principio de no contradicción, anulando por completo la validez de su tesis principal.
- *Ejemplo:* "El Estado debe garantizar la libertad absoluta de todos los ciudadanos sin ninguna restricción, y al mismo tiempo prohibir y sancionar severamente todo contenido que ofenda la moral pública".

### 3.2 Falacias de Ambigüedad Lógica


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE DETECCIÓN DE FALACIAS

| Tipo de Falacia | Error Lógico Específico | Pregunta de Detección Inmediata |
| :--- | :--- | :--- |
| **Generalización Indebida** | Muestra no representativa ni estadísticamente significativa. | *¿Se analizó una muestra representativa o solo 2 o 3 casos anecdóticos?* |
| **Falsa Causa** | Confundir orden temporal con causalidad biológica o física. | *¿El suceso B ocurriría igualmente sin el suceso A? ¿Hay un tercer factor oculto?* |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t09_s01_c01",
                    question = "**Enunciado:** Identifique la falacia presente en el siguiente texto:",
                    options = listOf(
                        "Falacia de apelación a la autoridad",
                        "Generalización indebida (*Secundum quid*)",
                        "Falacia de falsa causa",
                        "Argumento Ad Ignorantiam"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos la premisa y la conclusión: - Premisa: Dos teléfonos particulares de la marca X presentaron fallas mecánicas. - Conclusión: La totalidad universal de los productos elaborados por dicha marca carece de calidad. 2. La muestra observada consta de solo dos unidades frente a una producción masiva de miles o millones de terminales tecnológicos. 3. Se extrapola una propiedad observada en una muestra minúscula y no representativa hacia el universo completo de la población. 4. Esta estructura corresponde formalmente a la falacia de **Generalización Indebida**. **Respuesta:** B ---"
                ),
                Challenge(
                    id = "rl_t09_s01_c02",
                    question = "**Enunciado (Modelo UNSA Ordinario):** Lea atentamente el siguiente fragmento:",
                    options = listOf(
                        "Falacia del equívoco",
                        "Falacia de apelación a la masa (*Ad populum*)",
                        "Falacia de falsa causa (*Post hoc ergo propter hoc*)",
                        "Falacia de afirmación del consecuente"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos los hechos expuestos: - Evento A: Tocar los tambores durante el eclipse. - Evento B: Retorno de la luz solar. 2. Relación temporal: El evento B ocurre cronológicamente después del evento A. 3. El emisor infiere una relación causa-efecto exclusivamente a partir de la sucesión cronológica. 4. El eclipse culmina debido a la mecánica celeste orbital entre la Luna, la Tierra y el Sol, con absoluta independencia de las ondas sonoras generadas por los tambores terrestres. 5. Incurre de manera paradigmática en la falacia de **Falsa Causa** (*Post hoc ergo propter hoc*). **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t09_s01_c03",
                    question = "**Enunciado:** Analice el siguiente silogismo:",
                    options = listOf(
                        "Contradice el principio de transitividad.",
                        "Comete la falacia de negación del antecedente.",
                        "Comete la falacia de ambigüedad denominada equívoco.",
                        "Presenta un término medio universalmente distribuido."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Examinamos los términos que intervienen en el silogismo: - Término 1: \"Justicia\" en la Premisa 1 designa el concepto abstracto ético-filosófico de dar a cada quien lo que le corresponde. - Término 2: \"Justicia\" en la Premisa 2 designa a la institución burocrática del Poder Judicial (jueces y magistrados). 2. El término puente (\"justicia\") cambia de significado radicalmente entre la premisa 1 y la premisa 2. 3. Aparenta tener 3 términos cuando en realidad posee 4 términos conceptuales disjuntos. 4. Este desplazamiento de significado dentro de una misma cadena deductiva constituye la falacia de **Equívoco** (ambigüedad semántica). **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t09_s01_c04",
                    question = "Un candidato afirma: 'Mi rival propone reducir impuestos, pero no le crean porque él jamás ha administrado una empresa privada'. Esta intervención constituye una falacia de:",
                    options = listOf(
                        "Falsa causa",
                        "Argumentum Ad Hominem",
                        "Generalización indebida",
                        "Anfibología"
                    ),
                    correctIndex = 1,
                    explanation = "Se descalifica la propuesta atacando directamente la condición personal del emisor en lugar de evaluar el impacto macroeconómico de la medida tributaria."
                ),
                Challenge(
                    id = "rl_t09_s01_c05",
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
                    id = "rl_t09_s01_c06",
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
                    id = "rl_t09_s01_c07",
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
                    id = "rl_t09_s01_c08",
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
                    id = "rl_t09_s01_c09",
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
                    id = "rl_t09_s01_c10",
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
            id = "rl_t09_s02",
            title = "Detección de Falacias Simples - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Detección de Falacias Simples - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### A. El Equívoco (Ambigüedad Semántica / Cuatro Términos)
- **Mecanismo:** Se utiliza una palabra polisémica con dos o más acepciones distintas a lo largo de las premisas de un mismo silogismo.
- *Ejemplo clásico:*
  - Premisa 1: El fin de las cosas es su perfección.
  - Premisa 2: La muerte es el fin de la vida.
  - Conclusión: Por tanto, la muerte es la perfección de la vida.
  *(El término "fin" mutó de objetivo teleológico a terminación cronológica).*

#### B. La Anfibología (Ambigüedad Sintáctica)
- **Mecanismo:** El razonamiento descansa sobre enunciados cuya estructura gramatical deficiente o puntuación ambigua permite interpretaciones discordantes.
- *Ejemplo:* "Un perro mordió a un niño y la policía lo persiguió" *(¿A quién persiguió la policía: al perro o al niño?)*.

### 3.3 Falacias Tradicionales de Alta Frecuencia en Exámenes de Admisión

1. **Argumentum Ad Hominem (Ataque al Hombre):** Descalificar un argumento atacando los defectos morales, el origen social, la religión o el pasado del interlocutor en lugar de refutar sus premisas lógicas.
2. **Argumentum Ad Populum (Apelación a la Masa):** Sostener que una afirmación es verdadera únicamente porque la gran mayoría de personas cree en ella o la practica.
3. **Argumentum Ad Verecundiam (Apelación a la Falsa Autoridad):** Defender una tesis citando la opinión de una persona famosa o experta en un campo totalmente ajeno al tema debatido.
4. **Argumentum Ad Ignorantiam (Apelación a la Ignorancia):** Afirmar que algo es verdadero simplemente porque no se ha demostrado que sea falso (o viceversa).
5. **Argumentum Ad Baculum (Apelación a la Fuerza o Amenaza):** Imponer una conclusión recurriendo al miedo, la intimidación o la coacción física/laboral.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Equívoco** | Cambio subrepticio del sentido de una palabra clave. | *¿La palabra X significa exactamente lo mismo en la Premisa 1 y en la Premisa 2?* |
| **Ad Hominem** | Sustituir el debate de ideas por el insulto personal. | *¿Se está rebatiendo el dato o se está descalificando al individuo?* |
| **Ad Populum** | Confundir popularidad de una idea con su verdad empírica. | *¿Que millones de personas lo crean hace que sea una ley científica comprobada?* |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: La Prueba de la Sustitución Léxica (Desactivar el Equívoco)
Si sospechas que un silogismo es falaz por equívoco:
1. Toma el término sospechoso (ejemplo: "banco").
2. Reemplázalo en cada premisa por su definición exacta:
   - "Me senté en el banco (asiento de madera)".
   - "Fui al banco a pedir un préstamo (institución financiera)".
3. Reescribe el silogismo con las definiciones explícitas: notarás de inmediato que hay **4 términos distintos** y que el puente deductivo está completamente roto.

### Hack 2: La Búsqueda de la Variable Confundente (Contra la Falsa Causa)
Cuando un enunciado sostenga que el factor X causó Y:
- Pregúntate de inmediato: *¿Existe una tercera variable Z que esté provocando tanto a X como a Y?*
- *Ejemplo de examen:* "El aumento en el consumo de helados causa que aumente la tasa de ahogamientos en las piscinas".
  - Variable Z oculta: El verano (las altas temperaturas aumentan el consumo de helados y simultáneamente hacen que más gente vaya a nadar). La causalidad directa es una falacia.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "Las 4 Falsas Alarmas" (\text{G-C-C-A})
Para escanear textos argumentativos en el examen:
- **G**eneralización apresurada: *"Uno es así \to Todos son así"*.
- **C**ausa ilusoria: *"Sucedió después \to Sucedió a causa de eso"*.
- **C**ontradicción interna: *"Afirmo A en la línea 2 y niego A en la línea 6"*.
- **A**mbigüedad / Equívoco: *"La misma palabra cambia de disfraz léxico"*.

### Mnemotecnia 2: "El Escudo contra el Sofisma"
Frente a un texto manipulador, haz tres preguntas de filtro:
1. ¿Quién lo dice? \to Si importa más que el argumento = Posible *Ad Hominem* o *Ad Verecundiam*.
2. ¿A cuántos convenció? \to Si se usa como prueba = Posible *Ad Populum*.
3. ¿Cómo se probó? \to Si no hay datos causales directos = Posible *Falsa Causa*.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Ataque Pertinente NO es Ad Hominem**
> Si un testigo en un juicio por falsificación de documentos tiene tres condenas judiciales previas por perjurio y falsificación probada, señalar ese hecho para cuestionar su credibilidad testimonial **NO es una falacia Ad Hominem**, sino una objeción de pertinencia probatoria plenamente válida en la epistemología jurídica. Solo es falaz cuando el ataque personal es irrelevante para el fondo del argumento (ejemplo: descalificar la teoría de la relatividad de Einstein por su vestimenta o vida matrimonial).

> [!CAUTION]
> **Trampa 2: La Conclusión Verdadera en un Argumento Falaz**
> Que un argumento sea falaz **no significa automáticamente que su conclusión sea fácticamente falsa**. Solo significa que el camino argumentativo no la sostiene lógicamente. Afirmar que una conclusión es falsa simplemente porque fue defendida con una falacia es incurrir en la *Falacia de la Falacia* (*Argumentum ad logicam*).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la era de las redes sociales, los algoritmos de recomendación y las campañas electorales, las falacias de generalización indebida y falsa causa son el combustible de la desinformación masiva (*fake news*) y el terraplanismo. Del mismo modo, en el desarrollo de fármacos e investigaciones epidemiológicas (ensayos clínicos de vacunas), los científicos emplean grupos de control con doble ciego para evitar caer en la falacia *post hoc*: demostrar matemáticamente que la recuperación del paciente se debe al principio activo del medicamento y no al mero efecto placebo o al curso natural de la enfermedad.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t09_s02_c01",
                    question = "**Enunciado (Tipo San Marcos DECO / UNSA):** En un debate sobre la reforma del transporte urbano en Arequipa, un expositor afirma:",
                    options = listOf(
                        "Es un argumento sólido porque los antecedentes éticos de un expositor determinan la exactitud de sus cálculos matemáticos.",
                        "Es débil e inválido, pues recurre a la falacia *Ad Hominem* ofensiva para eludir el análisis técnico de la propuesta de transporte.",
                        "Es un razonamiento inductivo válido por analogía de comportamiento.",
                        "Presenta una falacia de falsa analogía entre la vida privada y los autobuses."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Descomponemos el argumento: - Tesis a refutar: La viabilidad técnica del carril exclusivo para autobuses propuesta por el ingeniero Gómez. - Evidencia aportada: Su despido laboral pasado y su vida privada personal. 2. Evaluamos la pertinencia: Las dimensiones morales privadas o el historial contractual de un proyectista no invalidan *per se* la física del tráfico, el flujo vehicular ni la ingeniería del transporte. 3. El hablante desplaza el foco de discusión: en lugar de atacar la propuesta técnica, ataca a la persona que la formula con la intención de desacreditarla ante el público. 4. Esto constituye formalmente una falacia **Ad Hominem Ofensiva**, destruyendo la solidez lógica de la argumentación. **Respuesta:** B ---"
                ),
                Challenge(
                    id = "rl_t09_s02_c02",
                    question = "**Enunciado (Nivel UNI / Máxima Exigencia):** Durante un congreso académico, se pronuncia el siguiente discurso:",
                    options = listOf(
                        "Falsa causa y Argumento Ad Populum",
                        "Equívoco (extrapolación indebida de concepto físico a ético) y Argumento Ad Baculum",
                        "Generalización indebida y Modus Ponens",
                        "Argumento Ad Ignorantiam y Petitio Principii"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos la primera inferencia: - Premisa: La teoría física de Einstein demuestra la relatividad espaciotemporal de las mediciones inerciales. - Conclusión: La ética y la moral humana son relativas y no existen principios objetivos. - Análisis crítico: El término \"relatividad\" en física denota la invariancia de las leyes físicas en sistemas de referencia inerciales; extrapolar ese término al campo de los valores humanos y axiológicos es una manipulación léxica que constituye una falacia de **Equívoco** (o falsa analogía categorial profunda). 2. Analizamos la segunda inferencia / cláusula final: - *\"Y quien no acepte esto [...] debería ser destituido de la docencia universitaria\"*. - Análisis crítico: Se intenta forzar la aceptación de la conclusión mediante la amenaza explícita de pérdida de empleo y coacción laboral. - Esto corresponde formalmente al **Argumentum Ad Baculum** (apelación al miedo o a la fuerza). 3. La combinación exacta, rigurosa y correlativa es: Equívoco / extrapolación ilegítima seguida de apelación al miedo o la fuerza (*Ad Baculum*). **Respuesta:** B ---"
                ),
                Challenge(
                    id = "rl_t09_s02_c03",
                    question = "Afirmar que 'Millones de personas en todo el mundo creen en la astrología, por lo tanto los horóscopos tienen fundamento científico' corresponde a la falacia:",
                    options = listOf(
                        "Ad Populum",
                        "Ad Verecundiam",
                        "Secundum Quid",
                        "Equívoco"
                    ),
                    correctIndex = 0,
                    explanation = "La falacia Ad Populum apela erróneamente a la popularidad masiva o al consenso popular como si fuera prueba de validez científica."
                ),
                Challenge(
                    id = "rl_t09_s02_c04",
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
                    id = "rl_t09_s02_c05",
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
                    id = "rl_t09_s02_c06",
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
                    id = "rl_t09_s02_c07",
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
                    id = "rl_t09_s02_c08",
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
                    id = "rl_t09_s02_c09",
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
                    id = "rl_t09_s02_c10",
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
