package filosofia

object FilosofiaSemana05 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t05_s01",
            subjectId = "filosofia",
            semana = 5,
            subtema = "5.1",
            title = "A. El Conocimiento Científico: Concepto y Niveles",
            theory = LessonTheory(
                content = """# TEMA 05: CONOCIMIENTO, CIENCIA Y VERDAD

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. El Conocimiento Científico: Concepto y Niveles
El conocimiento es una forma de aprehensión de la realidad. Se distingue en tres niveles fundamentales:
1. **Conocimiento Vulgar o Empírico-Espontáneo**:
   - Adquirido en la vida cotidiana mediante el sentido común, la tradición y la experiencia directa no controlada.
   - Es superficial, asistemático, acrítico, dogmático y subjetivo.
2. **Conocimiento Científico**:
   - Saber selectivo, riguroso y metódico que describe, explica y predice fenómenos de la realidad mediante modelos conceptuales contrastables.
3. **Conocimiento Filosófico**:
   - Saber universal, radical, totalizador y problematizador de los fundamentos últimos del ser y del conocer.

#### Características Esenciales del Conocimiento Científico:
- **Objetivo**: Se ajusta a los hechos y propiedades del objeto de estudio, independientemente de los deseos, emociones o sesgos del investigador.
- **Metódico**: No se obtiene por azar, sino siguiendo procedimientos, técnicas y protocolos lógicamente planificados (método científico).
- **Sistemático**: Constituye un cuerpo coherente, organizado e interconectado de proposiciones, leyes y teorías, no un cúmulo caótico de datos aislados.
- **Verificable / Contrastable**: Sus enunciados deben someterse a prueba mediante la observación rigurosa o el experimento controlado.
- **Falible**: Reconoce su propia imperfección; no postula dogmas inmutables, sino que está permanentemente abierto a la rectificación o superación histórica.
- **Comunicable y Preciso**: Utiliza un lenguaje unívoco, claro y técnico, susceptible de ser comprendido, replicado y criticado por la comunidad científica universal.



### B. El Método Científico: Estructura Operativa
Secuencia lógica y procedimental para resolver enigmas sobre la naturaleza y la sociedad:
1. **Observación y Detección de Anomalías**: Identificación de un hecho fáctico que no encaja con el conocimiento científico previo.
2. **Planteamiento del Problema**: Formulación rigurosa y precisa de una interrogante que delimita variables observables (¿\text{De qué manera influye } X \text{ en } Y?).
3. **Formulación de la Hipótesis**: Enunciado conjetural, provisional y fundado teóricamente que propone una respuesta tentativa a la pregunta de investigación. Debe ser lógicamente coherente y empíricamente contrastable.
4. **Diseño y Ejecución de la Contrastación**: Prueba experimental o empírica sistemática con control de variables (variable independiente, dependiente e interviniente).
5. **Análisis de Datos y Conclusión**: Determinación de si la evidencia empírica corrobora o refuta la hipótesis.
6. **Incorporación al Cuerpo del Saber**: Si la hipótesis es corroborada sistemáticamente, puede dar origen a nuevas leyes o integrarse en teorías existentes.



### D. Relación Ciencia, Tecnología y Sociedad (CTS)
- **Ciencia**: Búsqueda desinteresada del saber y la verdad objetiva para explicar el cosmos (dimensión cognoscitiva).
- **Tecnología**: Aplicación práctica, instrumental y sistemática del conocimiento científico para diseñar herramientas, procesos y artefactos que modifican la realidad y satisfacen necesidades humanas.
- **Sociedad**: Contexto ético, político, económico y ecológico donde se desarrollan la ciencia y la tecnología. El enfoque CTS estudia el impacto social y los dilemas bioéticos (inteligencia artificial, manipulación genética, armamento atómico, calentamiento global).



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia de Características de la Ciencia (Mario Bunge):
> **"FA - ME - O - SI - CO - VER"**
- **FA**: Falible
- **ME**: Metódica
- **O**: Objetiva
- **SI**: Sistemática
- **CO**: Comunicable
- **VER**: Verificable

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Verificación vs. Falsación**:
   - Si una alternativa dice *"Karl Popper propuso que las teorías científicas se demuestran verdaderas de forma concluyente mediante la acumulación inductiva de verificaciones"*, es **FALSA**. Popper rechaza la inducción y el verificacionismo; defiende la **falsabilidad deductiva**.
2. **Ley vs. Teoría**:
   - Una teoría **no es una ley que creció**; la teoría explica por qué ocurren las leyes. Por ejemplo, la teoría de la gravedad de Einstein explica la ley de la gravitación y sus límites. Una teoría jamás "se convierte" en ley.
3. **Ciencias Formales vs. Fácticas**:
   - Las ciencias formales (lógica, matemáticas) **no usan el método experimental ni contrastan hechos**; usan la demostración deductiva interna. Si el examen pregunta por una ciencia formal que estudia hechos materiales, es una trampa.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 1: Básico / Definición Directa
**Enunciado**: De acuerdo con la clasificación contemporánea de las ciencias propuesta por el epistemólogo Mario Bunge, la lógica y la matemática pura son catalogadas como ciencias:
A) Fácticas naturales  
B) Fácticas sociales  
C) Formales o ideales  
D) Hermenéuticas  
E) Pseudocientíficas  

- **Resolución**: Las ciencias formales tienen como objeto de estudio entes ideales (números, formas, proposiciones lógicas), no interactúan con objetos físicos materiales y emplean como método de justificación la demostración deductiva formal coherente. La lógica y la matemática son los ejemplos arquetípicos de **ciencias formales**.
- **Clave Correcta**: **C**

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE EPISTEMOLOGÍA

```
                             EPISTEMOLOGÍA Y CIENCIA
                                        │
         ┌──────────────────┬───────────┴───────────┬──────────────────┐
         ▼                  ▼                       ▼                  ▼
    CONOCIMIENTO         EL MÉTODO              ESTRUCTURA         DEBATE EPISTEMOLÓGICO
     CIENTÍFICO         CIENTÍFICO               TEÓRICA               CONTEMPORÁNEO
         │                  │                       │                  │
• Características:   • Observación           • Hecho            • Neopositivismo:
  - Objetivo           sistemática           • Hipótesis          (Verificacionismo)
  - Metódico         • Planteamiento           (Tentativa)      • Karl Popper:
  - Sistemático        del problema          • Ley                (Falsacionismo /
  - Verificable      • Formulación de          (Regularidad       Asimetría lógica)
  - Falible            hipótesis               constante)       • Thomas Kuhn:
  - Comunicable      • Contrastación         • Teoría             (Paradigmas y
  - Provisorio         (Experimento/           (Sistema           Revoluciones)
                       falsación)              explicativo      • Mario Bunge:
                     • Conclusión              unificado)         (Ciencia vs. Pseudociencia)
```

---



### C. Hecho, Hipótesis, Ley y Teoría Científica
- **Hecho**: Acontecimiento o estado de cosas observable y verificable en la realidad objetiva (ej. el agua hierve a 100 °C a 1 atm).
- **Hipótesis Científica**: Explicación tentativa que vincula dos o más variables para dar cuenta de un problema no resuelto.
- **Ley Científica**: Hipótesis científica confirmada que expresa una **relación constante, universal y necesaria** entre fenómenos o propiedades de la realidad (ej. Ley de Gravitación Universal: F = G \frac{m_1 m_2}{r^2}).
- **Teoría Científica**: El estrato superior del saber científico. Es un sistema conceptual unificado, estructurado deductivamente, que integra un conjunto coherente de leyes, hipótesis y principios para explicar y predecir de modo comprehensivo un ámbito de la realidad (ej. Teoría de la Relatividad, Teoría de la Selección Natural).



### E. Modelos Epistemológicos y Criterios de Demarcación

#### 1. El Positivismo Lógico / Neopositivismo (Círculo de Viena: Carnap, Schlick, Neurath)
- **Criterio de Demarcación**: **El Verificacionismo empírico**.
- Un enunciado tiene significado cognitivo si y solo si es analítico (lógica/matemática) o empíricamente verificable por la observación sensible.
- Califican a la Metafísica, la Ética pura y la Teología como **pseudoproposiciones carentes de sentido**.

#### 2. El Racionalismo Crítico de Karl Popper (Falsacionismo)
- **Crítica a la Inducción**: Popper demuestra que ninguna cantidad finita de observaciones positivas de cisnes blancos puede probar inductivamente la ley universal *"Todos los cisnes son blancos"*, pues basta un solo cisne negro para refutarla.
- **La Asimetría Lógica entre Verificación y Falsación**: Las leyes universales son formalmente inverificables de modo definitivo, pero son **falsables mediante un contraejemplo empírico**.
- **Criterio de Demarcación**: Una teoría es científica si formula predicciones arriesgadas que puedan ser empíricamente contrastadas y potencialmente refutadas (**falsabilidad**). Si una teoría es inmune a la refutación (como el psicoanálisis dogmático o la astrología, según Popper), no es ciencia, sino pseudociencia o mito.
- La ciencia progresa por **conjeturas y refutaciones**; las teorías no son verdades eternas, sino hipótesis provisionalmente corroboradas.

#### 3. La Estructura de las Revoluciones Científicas de Thomas Kuhn
- Introduce el enfoque socio-histórico en la epistemología frente al logicismo abstracto:
  - **Paradigma**: Matriz disciplinar compartida por una comunidad científica (teorías, valores, métodos, experimentos ejemplares).
  - **Ciencia Normal**: Etapa en que los científicos resuelven "rompecabezas" (*puzzles*) bajo las reglas del paradigma vigente sin cuestionar sus cimientos.
  - **Anomalías**: Hechos que el paradigma dominante no puede explicar.
  - **Crisis**: La acumulación de anomalías graves quiebra la confianza en el paradigma.
  - **Revolución Científica**: Aparición de un nuevo paradigma rival que sustituye al anterior (ej. paso del geocentrismo tolemaico al heliocentrismo copernicano; de la mecánica newtoniana a la relatividad einsteiniana).
  - **Inconmensurabilidad**: Dos paradigmas sucesivos utilizan lenguajes y visiones de mundo tan disímiles que no pueden compararse de forma neutra ni acumulativa lineal.

#### 4. Mario Bunge y las Pseudociencias
- Mario Bunge clasifica las ciencias en **Formales** (lógica y matemática; trabajan con entes ideales y su criterio es la coherencia formal) y **Fácticas** (naturales y sociales; trabajan con hechos materiales y su criterio es la contrastación empírica).
- Define la **pseudociencia** como todo campo de creencias o prácticas que pretende presentarse como científico pero carece de método experimental riguroso, no interactúa con otras ciencias, postula fuerzas inmateriales inescrutables y se niega a la autocrítica y evolución teórica.

---



### Nivel 3: Aplicación / Casuística Epistemológica
**Enunciado**: Un equipo de arqueólogos formula la siguiente afirmación: *"El colapso de la civilización Tiwanaku fue causado por una megasequía de dos décadas evidenciada en los núcleos de hielo del glaciar Quelccaya"*. Para que esta afirmación sea considerada una hipótesis científica de pleno derecho según el método hipotético-deductivo, debe:
A) Ser ratificada por el voto unánime de los sabios de la comunidad local.  
B) Ser deducible de los axiomas de la geometría no euclidiana.  
C) Ser susceptible de contrastación empírica independiente y refutación con datos paleoclimáticos.  
D) Convertirse inmediatamente en un axioma absoluto incuestionable.  
E) Carecer de variables cuantificables en el registro estratigráfico.  

- **Resolución**: Toda hipótesis científica requiere poseer consistencia lógica interna y ser empíricamente contrastable, es decir, susceptible de ser sometida a prueba frente a la evidencia material factual (registros geológicos y glaciares) para su corroboración o falsación.
- **Clave Correcta**: **C**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento de Thomas Kuhn:
> *"La transición de un paradigma en crisis a otro nuevo del que pueda surgir una nueva tradición de ciencia normal dista mucho de ser un proceso de acumulación, al que se llegue mediante una articulación o una extensión del antiguo paradigma. Es más bien una reconstrucción del campo a partir de nuevos fundamentos, reconstrucción que cambia algunas de las generalizaciones teóricas más elementales del campo, así como muchos de sus métodos y aplicaciones de paradigma"*. (*La estructura de las revoluciones científicas*).

Del texto citado se desprende que, según Kuhn:
A) El progreso científico es una trayectoria estrictamente lineal, pacífica y cuantitativa.  
B) Las revoluciones científicas representan rupturas cualitativas y epistemológicas profundas que transforman las bases mismas del conocimiento.  
C) Los nuevos paradigmas conservan inalteradas las matrices ontológicas del paradigma derrocado.  
D) La ciencia normal se desarrolla sin ningún marco conceptual compartido por los investigadores.  
E) El cambio de paradigma ocurre exclusivamente cuando se comprueba una tautología lógica.  

- **Resolución**: Kuhn defiende que el paso de un paradigma a otro no es un proceso acumulativo lineal, sino una "reconstrucción sobre nuevos fundamentos" que cambia las generalizaciones teóricas y metodológicas, es decir, una **ruptura cualitativa y revolucionaria**.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El físico y filósofo Paul Feyerabend, en su obra *Contra el método*, formuló la tesis del "anarquismo epistemológico" sosteniendo la famosa máxima *"todo vale"* (*anything goes*). Dicha crítica radical estuvo dirigida principalmente a desmitificar:
A) La existencia de entidades abstractas en la topología algebraica.  
B) La utilidad práctica de las vacunas en la epidemiología social.  
C) La creencia de que existe un único método científico universal, rígido, normativo e infalible que garantiza el progreso del conocimiento.  
D) El principio ontológico de no contradicción en la matemática intuicionista.  
E) La distinción aristotélica entre acto y potencia en la física de partículas.  

- **Resolución**: Feyerabend criticó frontalmente el monismo metodológico (la pretensión positivista y popperiana de imponer un método canónico y prescriptivo a toda la historia de la ciencia). Demostró que las grandes revoluciones de la física (como Galileo) triunfaron violando deliberadamente las reglas metodológicas vigentes en su época, concluyendo que no existe un método fijo universal.
- **Clave Correcta**: **C**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Episteme**: Vocablo griego que designa el conocimiento fundado, riguroso, objetivo y demostrable, en oposición a la mera opinión subjetiva (*doxa*).
2. **Doxa**: Mera creencia común u opinión subjetiva no fundamentada metódicamente.
3. **Falsacionismo**: Doctrina epistemológica que postula que las teorías científicas no son verificables definitivamente, sino conjeturas falsables sometidas a refutación.
4. **Asimetría Lógica**: Principio lógico que establece que ningún número de enunciados observacionales singulares puede verificar un enunciado universal, pero uno solo basta para refutarlo lógicamente.
5. **Paradigma**: Conjunto de compromisos teóricos, ontológicos y metodológicos compartidos por una comunidad científica que orienta la investigación durante una época.
6. **Inconmensurabilidad**: Imposibilidad de comparar dos paradigmas o teorías científicas bajo un patrón común neutral, debido a discrepancias conceptuales y terminológicas radicales.
7. **Ciencia Normal**: Período de investigación científica dominado por un paradigma indiscutido en el cual se resuelven enigmas empíricos y teóricos específicos.
8. **Anomalía**: Fenómeno recurrente y documentado que se resiste a ser asimilado o explicado por las leyes del paradigma vigente.
9. **Pseudociencia**: Conjunto de doctrinas o prácticas que reclaman estatus científico pero rechazan someterse a la contrastación empírica, la falsabilidad y la autocorrección.
10. **Tecnociencia**: Fusión contemporánea entre investigación científica pura y desarrollo tecnológico industrializado con financiamiento público y corporativo a gran escala.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre una ley científica y una teoría científica?
  - *Reverso*: La ley describe una relación constante y necesaria entre variables; la teoría es un sistema unificado que explica por qué y cómo ocurren dichas leyes y fenómenos.

- **Flashcard 2**:
  - *Anverso*: ¿Por qué Karl Popper rechaza el método inductivo para validar hipótesis universales?
  - *Reverso*: Porque la inducción no es lógicamente válida: millones de casos favorables no garantizan que el siguiente caso no refute la regla universal.

- **Flashcard 3**:
  - *Anverso*: ¿Qué define a la etapa de "Ciencia Normal" según Thomas Kuhn?
  - *Reverso*: Es la etapa en la que los científicos resuelven enigmas cotidianos dentro de los límites de un paradigma dominante aceptado sin cuestionar sus fundamentos.

- **Flashcard 4**:
  - *Anverso*: ¿Cuál es el criterio de demarcación del Neopositivismo del Círculo de Viena?
  - *Reverso*: El criterio de verificación empírica del significado.

---



## 4. CUADRO COMPARATIVO: DEBATE POPPER VS. KUHN

| Eje Epistemológico | Karl Popper (Racionalismo Crítico) | Thomas Kuhn (Historiografía Crítica) |
| :--- | :--- | :--- |
| **Criterio de demarcación** | La **falsabilidad**: capacidad de una teoría de ser refutada. | La existencia de un **paradigma** que define la práctica de la comunidad científica. |
| **Progreso de la ciencia** | Proceso acumulativo y racional de ensayo y error (**conjeturas y refutaciones**). | Proceso no lineal ni puramente acumulativo; rupturas revolucionarias entre paradigmas. |
| **Rol de la comunidad** | El científico debe ser un crítico severo que busque falsar sus propias teorías. | En la "ciencia normal", los científicos son conservadores y resuelven enigmas dentro del paradigma. |
| **Concepción de la teoría** | Hipótesis provisionalmente corroborada susceptible de caer ante un contraejemplo. | Marco conceptual comprehensivo e **inconmensurable** con paradigmas rivales. |

---



### Nivel 2: Intermedio / Comprensión de Criterios
**Enunciado**: El principio popperiano que establece que una hipótesis adquiere carácter genuinamente científico solo cuando formula enunciados observacionales precisos capaces de entrar en contradicción lógica con los hechos y ser potencialmente refutados, se denomina:
A) Verificacionismo holista  
B) Paradigma disciplinar  
C) Falsabilidad  
D) Anarquía metodológica  
E) Dialéctica fáctica  

- **Resolución**: Karl Popper introdujo el concepto de **falsabilidad** (o refutabilidad) como criterio de demarcación para distinguir enunciados científicos de enunciados metafísicos o pseudocientíficos.
- **Clave Correcta**: **C**

---



### Nemotecnia de las Fases de Kuhn:
> **"PRE - NOR - ANO - CRI - REVO"**
- **PRE**: Preciencia (múltiples escuelas dispersas)
- **NOR**: Ciencia **Normal** (dominio de un paradigma unificado)
- **ANO**: **Anomalías** (fallas inexplicables)
- **CRI**: **Crisis** del paradigma
- **REVO**: **Revolución** científica (reemplazo por un nuevo paradigma)"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t05_s01_c01",
                    question = "¿Cuál es la característica primordial que diferencia al conocimiento científico del saber cotidiano o vulgar?",
                    options = listOf(
                        "El conocimiento cotidiano utiliza formalizaciones lógico-matemáticas rigurosas.",
                        "El conocimiento científico es metódico, sistemático, fundamentado racionalmente y sujeto a contrastación empírica.",
                        "El conocimiento científico se transmite exclusivamente mediante tradiciones orales inmemoriales.",
                        "El conocimiento cotidiano es infalible y la ciencia es meramente intuitiva.",
                    ),
                    correctIndex = 1,
                    explanation = "A diferencia del saber espontáneo o vulgar, la ciencia opera mediante métodos rigurosos, organiza sistemáticamente sus enunciados y exige contrastación objetiva."
                ),
                Challenge(
                    id = "filo_t05_s01_c02",
                    question = "La característica de la ciencia denominada 'falibilidad' significa que:",
                    options = listOf(
                        "Las teorías científicas son dogmas sagrados e inmodificables por la eternidad.",
                        "Los científicos cometen fraudes continuos en sus experimentos de laboratorio.",
                        "El conocimiento científico reconoce que sus proposiciones no son verdades absolutas, sino hipótesis perfectibles susceptibles de corrección, revisión o refutación.",
                        "La ciencia carece de cualquier valor cognoscitivo sobre la realidad física.",
                    ),
                    correctIndex = 2,
                    explanation = "La falibilidad científica implica que ningún enunciado científico es definitivo; el progreso de la ciencia se basa en la autocrítica y la constante revisión de sus modelos teóricos."
                ),
                Challenge(
                    id = "filo_t05_s01_c03",
                    question = "En la clasificación epistemológica de las ciencias, la Lógica y la Matemática pertenecen al grupo de las ciencias:",
                    options = listOf(
                        "Sociales o históricas.",
                        "Fácticas o empíricas.",
                        "Hermenéuticas puras.",
                        "Formales o ideales.",
                    ),
                    correctIndex = 3,
                    explanation = "Las ciencias formales trabajan con entes ideales, formas y símbolos abstractos creados por la mente humana, demostrando sus teoremas mediante la deducción sin recurrir a la observación sensible."
                ),
                Challenge(
                    id = "filo_t05_s01_c04",
                    question = "¿Cuál es el criterio distintivo que define a las ciencias 'fácticas' (como la Física, la Biología o la Sociología)?",
                    options = listOf(
                        "Su objeto de estudio son hechos, procesos o acontecimientos de la realidad material o social, y contrastan sus hipótesis mediante la observación y experimentación.",
                        "Operan únicamente con axiomas numéricos sin ningún contacto con el mundo real.",
                        "Sus enunciados no admiten ninguna posibilidad de verificación ni refutación.",
                        "Sus leyes son dictadas exclusivamente por asambleas parlamentarias.",
                    ),
                    correctIndex = 0,
                    explanation = "Las ciencias fácticas (del latín factum = hecho) estudian fenómenos del mundo real espacio-temporal y convalidan sus teorías mediante contrastación empírica."
                ),
                Challenge(
                    id = "filo_t05_s01_c05",
                    question = "La función científica que consiste en deducir rigurosamente acontecimientos futuros o estados desconocidos a partir de leyes universales y condiciones iniciales se denomina:",
                    options = listOf(
                        "Descripción taxonómica.",
                        "Especulación teosófica.",
                        "Retrospección intuitiva.",
                        "Predicción científica.",
                    ),
                    correctIndex = 3,
                    explanation = "La predicción científica permite anticipar con base empírica y legal la ocurrencia de fenómenos futuros o descubrir hechos ignorados dadas ciertas condiciones antecedentes."
                ),
                Challenge(
                    id = "filo_t05_s01_c06",
                    question = "Decir que la ciencia es un saber 'selectivo' significa que:",
                    options = listOf(
                        "Acepta únicamente hipótesis que coincidan con la religión oficial del Estado.",
                        "Rechaza el uso de computadoras en el análisis estadístico.",
                        "Solo permite la investigación a personas de clases económicas acaudaladas.",
                        "Cada disciplina científica delimita y recorta una parcela o aspecto específico de la realidad para convertirlo en su objeto propio de estudio.",
                    ),
                    correctIndex = 3,
                    explanation = "La ciencia no estudia el todo amorfo e indistinto, sino que parcela analíticamente la realidad en regiones y niveles ontológicos específicos (química, biología, economía, etc.)."
                ),
                Challenge(
                    id = "filo_t05_s01_c07",
                    question = "La función científica de la 'explicación' responde fundamentalmente a la interrogante:",
                    options = listOf(
                        "¿Cómo se llama la deidad protectora del laboratorio?",
                        "¿Por qué ocurre un fenómeno y cuáles son las causas determinantes y leyes que lo rigen?",
                        "¿Quién financió el proyecto de investigación?",
                        "¿Cuál es el valor monetario de la patente comercial?",
                    ),
                    correctIndex = 1,
                    explanation = "Explicar científicamente un hecho es subsuntarlo bajo leyes universales y condiciones antecedentes, revelando la causa o el mecanismo determinante de su acaecimiento."
                ),
                Challenge(
                    id = "filo_t05_s01_c08",
                    question = "La propiedad de 'objetividad' en el conocimiento científico exige que:",
                    options = listOf(
                        "Las teorías reflejen los deseos, temores y preferencias subjetivas del investigador.",
                        "Todos los experimentos arrojen resultados idénticos a los del siglo XVIII.",
                        "Los enunciados describan las propiedades reales del objeto de estudio con independencia de los afectos, sesgos o ideologías del sujeto cognoscente.",
                        "Las investigaciones no utilicen unidades de medida ni instrumental técnico.",
                    ),
                    correctIndex = 2,
                    explanation = "La objetividad científica impone que las descripciones y modelos teóricos concuerden con las propiedades efectivas del objeto investigado, eliminando sesgos subjetivos."
                ),
                Challenge(
                    id = "filo_t05_s01_c09",
                    question = "El nivel de conocimiento que busca transformar el conocimiento científico en técnicas, procesos de ingeniería y artefactos para resolver problemas prácticos del hombre es el:",
                    options = listOf(
                        "Conocimiento cosmológico puro.",
                        "Conocimiento tecnológico o ciencia aplicada.",
                        "Conocimiento mítico-religioso.",
                        "Conocimiento esotérico hermético.",
                    ),
                    correctIndex = 1,
                    explanation = "La tecnología y la ciencia aplicada operan traduciendo los descubrimientos teóricos y leyes científicas en herramientas, diseños técnicos y soluciones productivas."
                ),
                Challenge(
                    id = "filo_t05_s01_c10",
                    question = "La contrastación experimental en las ciencias fácticas consiste en:",
                    options = listOf(
                        "El sometimiento de las consecuencias observacionales deducidas de una hipótesis a pruebas de laboratorio o de campo controladas.",
                        "El rechazo a priori de cualquier instrumento de medición óptica o electrónica.",
                        "La votación democrática de una hipótesis por el público general.",
                        "La simple lectura reiterada de textos clásicos griegos en bibliotecas.",
                    ),
                    correctIndex = 0,
                    explanation = "Contrastar empíricamente una hipótesis implica confrontar sus predicciones lógicas con datos empíricos obtenidos en condiciones observacionales u operativas controladas."
                ),
            )
        ),
        LessonNode(
            id = "filo_t05_s02",
            subjectId = "filosofia",
            semana = 5,
            subtema = "5.2",
            title = "C. Hecho, Hipótesis, Ley y Teoría Científica",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE EPISTEMOLOGÍA

```
                             EPISTEMOLOGÍA Y CIENCIA
                                        │
         ┌──────────────────┬───────────┴───────────┬──────────────────┐
         ▼                  ▼                       ▼                  ▼
    CONOCIMIENTO         EL MÉTODO              ESTRUCTURA         DEBATE EPISTEMOLÓGICO
     CIENTÍFICO         CIENTÍFICO               TEÓRICA               CONTEMPORÁNEO
         │                  │                       │                  │
• Características:   • Observación           • Hecho            • Neopositivismo:
  - Objetivo           sistemática           • Hipótesis          (Verificacionismo)
  - Metódico         • Planteamiento           (Tentativa)      • Karl Popper:
  - Sistemático        del problema          • Ley                (Falsacionismo /
  - Verificable      • Formulación de          (Regularidad       Asimetría lógica)
  - Falible            hipótesis               constante)       • Thomas Kuhn:
  - Comunicable      • Contrastación         • Teoría             (Paradigmas y
  - Provisorio         (Experimento/           (Sistema           Revoluciones)
                       falsación)              explicativo      • Mario Bunge:
                     • Conclusión              unificado)         (Ciencia vs. Pseudociencia)
```

---



### A. El Conocimiento Científico: Concepto y Niveles
El conocimiento es una forma de aprehensión de la realidad. Se distingue en tres niveles fundamentales:
1. **Conocimiento Vulgar o Empírico-Espontáneo**:
   - Adquirido en la vida cotidiana mediante el sentido común, la tradición y la experiencia directa no controlada.
   - Es superficial, asistemático, acrítico, dogmático y subjetivo.
2. **Conocimiento Científico**:
   - Saber selectivo, riguroso y metódico que describe, explica y predice fenómenos de la realidad mediante modelos conceptuales contrastables.
3. **Conocimiento Filosófico**:
   - Saber universal, radical, totalizador y problematizador de los fundamentos últimos del ser y del conocer.

#### Características Esenciales del Conocimiento Científico:
- **Objetivo**: Se ajusta a los hechos y propiedades del objeto de estudio, independientemente de los deseos, emociones o sesgos del investigador.
- **Metódico**: No se obtiene por azar, sino siguiendo procedimientos, técnicas y protocolos lógicamente planificados (método científico).
- **Sistemático**: Constituye un cuerpo coherente, organizado e interconectado de proposiciones, leyes y teorías, no un cúmulo caótico de datos aislados.
- **Verificable / Contrastable**: Sus enunciados deben someterse a prueba mediante la observación rigurosa o el experimento controlado.
- **Falible**: Reconoce su propia imperfección; no postula dogmas inmutables, sino que está permanentemente abierto a la rectificación o superación histórica.
- **Comunicable y Preciso**: Utiliza un lenguaje unívoco, claro y técnico, susceptible de ser comprendido, replicado y criticado por la comunidad científica universal.



### B. El Método Científico: Estructura Operativa
Secuencia lógica y procedimental para resolver enigmas sobre la naturaleza y la sociedad:
1. **Observación y Detección de Anomalías**: Identificación de un hecho fáctico que no encaja con el conocimiento científico previo.
2. **Planteamiento del Problema**: Formulación rigurosa y precisa de una interrogante que delimita variables observables (¿\text{De qué manera influye } X \text{ en } Y?).
3. **Formulación de la Hipótesis**: Enunciado conjetural, provisional y fundado teóricamente que propone una respuesta tentativa a la pregunta de investigación. Debe ser lógicamente coherente y empíricamente contrastable.
4. **Diseño y Ejecución de la Contrastación**: Prueba experimental o empírica sistemática con control de variables (variable independiente, dependiente e interviniente).
5. **Análisis de Datos y Conclusión**: Determinación de si la evidencia empírica corrobora o refuta la hipótesis.
6. **Incorporación al Cuerpo del Saber**: Si la hipótesis es corroborada sistemáticamente, puede dar origen a nuevas leyes o integrarse en teorías existentes.



### C. Hecho, Hipótesis, Ley y Teoría Científica
- **Hecho**: Acontecimiento o estado de cosas observable y verificable en la realidad objetiva (ej. el agua hierve a 100 °C a 1 atm).
- **Hipótesis Científica**: Explicación tentativa que vincula dos o más variables para dar cuenta de un problema no resuelto.
- **Ley Científica**: Hipótesis científica confirmada que expresa una **relación constante, universal y necesaria** entre fenómenos o propiedades de la realidad (ej. Ley de Gravitación Universal: F = G \frac{m_1 m_2}{r^2}).
- **Teoría Científica**: El estrato superior del saber científico. Es un sistema conceptual unificado, estructurado deductivamente, que integra un conjunto coherente de leyes, hipótesis y principios para explicar y predecir de modo comprehensivo un ámbito de la realidad (ej. Teoría de la Relatividad, Teoría de la Selección Natural).



### E. Modelos Epistemológicos y Criterios de Demarcación

#### 1. El Positivismo Lógico / Neopositivismo (Círculo de Viena: Carnap, Schlick, Neurath)
- **Criterio de Demarcación**: **El Verificacionismo empírico**.
- Un enunciado tiene significado cognitivo si y solo si es analítico (lógica/matemática) o empíricamente verificable por la observación sensible.
- Califican a la Metafísica, la Ética pura y la Teología como **pseudoproposiciones carentes de sentido**.

#### 2. El Racionalismo Crítico de Karl Popper (Falsacionismo)
- **Crítica a la Inducción**: Popper demuestra que ninguna cantidad finita de observaciones positivas de cisnes blancos puede probar inductivamente la ley universal *"Todos los cisnes son blancos"*, pues basta un solo cisne negro para refutarla.
- **La Asimetría Lógica entre Verificación y Falsación**: Las leyes universales son formalmente inverificables de modo definitivo, pero son **falsables mediante un contraejemplo empírico**.
- **Criterio de Demarcación**: Una teoría es científica si formula predicciones arriesgadas que puedan ser empíricamente contrastadas y potencialmente refutadas (**falsabilidad**). Si una teoría es inmune a la refutación (como el psicoanálisis dogmático o la astrología, según Popper), no es ciencia, sino pseudociencia o mito.
- La ciencia progresa por **conjeturas y refutaciones**; las teorías no son verdades eternas, sino hipótesis provisionalmente corroboradas.

#### 3. La Estructura de las Revoluciones Científicas de Thomas Kuhn
- Introduce el enfoque socio-histórico en la epistemología frente al logicismo abstracto:
  - **Paradigma**: Matriz disciplinar compartida por una comunidad científica (teorías, valores, métodos, experimentos ejemplares).
  - **Ciencia Normal**: Etapa en que los científicos resuelven "rompecabezas" (*puzzles*) bajo las reglas del paradigma vigente sin cuestionar sus cimientos.
  - **Anomalías**: Hechos que el paradigma dominante no puede explicar.
  - **Crisis**: La acumulación de anomalías graves quiebra la confianza en el paradigma.
  - **Revolución Científica**: Aparición de un nuevo paradigma rival que sustituye al anterior (ej. paso del geocentrismo tolemaico al heliocentrismo copernicano; de la mecánica newtoniana a la relatividad einsteiniana).
  - **Inconmensurabilidad**: Dos paradigmas sucesivos utilizan lenguajes y visiones de mundo tan disímiles que no pueden compararse de forma neutra ni acumulativa lineal.

#### 4. Mario Bunge y las Pseudociencias
- Mario Bunge clasifica las ciencias en **Formales** (lógica y matemática; trabajan con entes ideales y su criterio es la coherencia formal) y **Fácticas** (naturales y sociales; trabajan con hechos materiales y su criterio es la contrastación empírica).
- Define la **pseudociencia** como todo campo de creencias o prácticas que pretende presentarse como científico pero carece de método experimental riguroso, no interactúa con otras ciencias, postula fuerzas inmateriales inescrutables y se niega a la autocrítica y evolución teórica.

---



## 4. CUADRO COMPARATIVO: DEBATE POPPER VS. KUHN

| Eje Epistemológico | Karl Popper (Racionalismo Crítico) | Thomas Kuhn (Historiografía Crítica) |
| :--- | :--- | :--- |
| **Criterio de demarcación** | La **falsabilidad**: capacidad de una teoría de ser refutada. | La existencia de un **paradigma** que define la práctica de la comunidad científica. |
| **Progreso de la ciencia** | Proceso acumulativo y racional de ensayo y error (**conjeturas y refutaciones**). | Proceso no lineal ni puramente acumulativo; rupturas revolucionarias entre paradigmas. |
| **Rol de la comunidad** | El científico debe ser un crítico severo que busque falsar sus propias teorías. | En la "ciencia normal", los científicos son conservadores y resuelven enigmas dentro del paradigma. |
| **Concepción de la teoría** | Hipótesis provisionalmente corroborada susceptible de caer ante un contraejemplo. | Marco conceptual comprehensivo e **inconmensurable** con paradigmas rivales. |

---



### Nemotecnia de las Fases de Kuhn:
> **"PRE - NOR - ANO - CRI - REVO"**
- **PRE**: Preciencia (múltiples escuelas dispersas)
- **NOR**: Ciencia **Normal** (dominio de un paradigma unificado)
- **ANO**: **Anomalías** (fallas inexplicables)
- **CRI**: **Crisis** del paradigma
- **REVO**: **Revolución** científica (reemplazo por un nuevo paradigma)



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Verificación vs. Falsación**:
   - Si una alternativa dice *"Karl Popper propuso que las teorías científicas se demuestran verdaderas de forma concluyente mediante la acumulación inductiva de verificaciones"*, es **FALSA**. Popper rechaza la inducción y el verificacionismo; defiende la **falsabilidad deductiva**.
2. **Ley vs. Teoría**:
   - Una teoría **no es una ley que creció**; la teoría explica por qué ocurren las leyes. Por ejemplo, la teoría de la gravedad de Einstein explica la ley de la gravitación y sus límites. Una teoría jamás "se convierte" en ley.
3. **Ciencias Formales vs. Fácticas**:
   - Las ciencias formales (lógica, matemáticas) **no usan el método experimental ni contrastan hechos**; usan la demostración deductiva interna. Si el examen pregunta por una ciencia formal que estudia hechos materiales, es una trampa.

---



### Nivel 2: Intermedio / Comprensión de Criterios
**Enunciado**: El principio popperiano que establece que una hipótesis adquiere carácter genuinamente científico solo cuando formula enunciados observacionales precisos capaces de entrar en contradicción lógica con los hechos y ser potencialmente refutados, se denomina:
A) Verificacionismo holista  
B) Paradigma disciplinar  
C) Falsabilidad  
D) Anarquía metodológica  
E) Dialéctica fáctica  

- **Resolución**: Karl Popper introdujo el concepto de **falsabilidad** (o refutabilidad) como criterio de demarcación para distinguir enunciados científicos de enunciados metafísicos o pseudocientíficos.
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística Epistemológica
**Enunciado**: Un equipo de arqueólogos formula la siguiente afirmación: *"El colapso de la civilización Tiwanaku fue causado por una megasequía de dos décadas evidenciada en los núcleos de hielo del glaciar Quelccaya"*. Para que esta afirmación sea considerada una hipótesis científica de pleno derecho según el método hipotético-deductivo, debe:
A) Ser ratificada por el voto unánime de los sabios de la comunidad local.  
B) Ser deducible de los axiomas de la geometría no euclidiana.  
C) Ser susceptible de contrastación empírica independiente y refutación con datos paleoclimáticos.  
D) Convertirse inmediatamente en un axioma absoluto incuestionable.  
E) Carecer de variables cuantificables en el registro estratigráfico.  

- **Resolución**: Toda hipótesis científica requiere poseer consistencia lógica interna y ser empíricamente contrastable, es decir, susceptible de ser sometida a prueba frente a la evidencia material factual (registros geológicos y glaciares) para su corroboración o falsación.
- **Clave Correcta**: **C**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento de Thomas Kuhn:
> *"La transición de un paradigma en crisis a otro nuevo del que pueda surgir una nueva tradición de ciencia normal dista mucho de ser un proceso de acumulación, al que se llegue mediante una articulación o una extensión del antiguo paradigma. Es más bien una reconstrucción del campo a partir de nuevos fundamentos, reconstrucción que cambia algunas de las generalizaciones teóricas más elementales del campo, así como muchos de sus métodos y aplicaciones de paradigma"*. (*La estructura de las revoluciones científicas*).

Del texto citado se desprende que, según Kuhn:
A) El progreso científico es una trayectoria estrictamente lineal, pacífica y cuantitativa.  
B) Las revoluciones científicas representan rupturas cualitativas y epistemológicas profundas que transforman las bases mismas del conocimiento.  
C) Los nuevos paradigmas conservan inalteradas las matrices ontológicas del paradigma derrocado.  
D) La ciencia normal se desarrolla sin ningún marco conceptual compartido por los investigadores.  
E) El cambio de paradigma ocurre exclusivamente cuando se comprueba una tautología lógica.  

- **Resolución**: Kuhn defiende que el paso de un paradigma a otro no es un proceso acumulativo lineal, sino una "reconstrucción sobre nuevos fundamentos" que cambia las generalizaciones teóricas y metodológicas, es decir, una **ruptura cualitativa y revolucionaria**.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El físico y filósofo Paul Feyerabend, en su obra *Contra el método*, formuló la tesis del "anarquismo epistemológico" sosteniendo la famosa máxima *"todo vale"* (*anything goes*). Dicha crítica radical estuvo dirigida principalmente a desmitificar:
A) La existencia de entidades abstractas en la topología algebraica.  
B) La utilidad práctica de las vacunas en la epidemiología social.  
C) La creencia de que existe un único método científico universal, rígido, normativo e infalible que garantiza el progreso del conocimiento.  
D) El principio ontológico de no contradicción en la matemática intuicionista.  
E) La distinción aristotélica entre acto y potencia en la física de partículas.  

- **Resolución**: Feyerabend criticó frontalmente el monismo metodológico (la pretensión positivista y popperiana de imponer un método canónico y prescriptivo a toda la historia de la ciencia). Demostró que las grandes revoluciones de la física (como Galileo) triunfaron violando deliberadamente las reglas metodológicas vigentes en su época, concluyendo que no existe un método fijo universal.
- **Clave Correcta**: **C**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Episteme**: Vocablo griego que designa el conocimiento fundado, riguroso, objetivo y demostrable, en oposición a la mera opinión subjetiva (*doxa*).
2. **Doxa**: Mera creencia común u opinión subjetiva no fundamentada metódicamente.
3. **Falsacionismo**: Doctrina epistemológica que postula que las teorías científicas no son verificables definitivamente, sino conjeturas falsables sometidas a refutación.
4. **Asimetría Lógica**: Principio lógico que establece que ningún número de enunciados observacionales singulares puede verificar un enunciado universal, pero uno solo basta para refutarlo lógicamente.
5. **Paradigma**: Conjunto de compromisos teóricos, ontológicos y metodológicos compartidos por una comunidad científica que orienta la investigación durante una época.
6. **Inconmensurabilidad**: Imposibilidad de comparar dos paradigmas o teorías científicas bajo un patrón común neutral, debido a discrepancias conceptuales y terminológicas radicales.
7. **Ciencia Normal**: Período de investigación científica dominado por un paradigma indiscutido en el cual se resuelven enigmas empíricos y teóricos específicos.
8. **Anomalía**: Fenómeno recurrente y documentado que se resiste a ser asimilado o explicado por las leyes del paradigma vigente.
9. **Pseudociencia**: Conjunto de doctrinas o prácticas que reclaman estatus científico pero rechazan someterse a la contrastación empírica, la falsabilidad y la autocorrección.
10. **Tecnociencia**: Fusión contemporánea entre investigación científica pura y desarrollo tecnológico industrializado con financiamiento público y corporativo a gran escala.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre una ley científica y una teoría científica?
  - *Reverso*: La ley describe una relación constante y necesaria entre variables; la teoría es un sistema unificado que explica por qué y cómo ocurren dichas leyes y fenómenos.

- **Flashcard 2**:
  - *Anverso*: ¿Por qué Karl Popper rechaza el método inductivo para validar hipótesis universales?
  - *Reverso*: Porque la inducción no es lógicamente válida: millones de casos favorables no garantizan que el siguiente caso no refute la regla universal.

- **Flashcard 3**:
  - *Anverso*: ¿Qué define a la etapa de "Ciencia Normal" según Thomas Kuhn?
  - *Reverso*: Es la etapa en la que los científicos resuelven enigmas cotidianos dentro de los límites de un paradigma dominante aceptado sin cuestionar sus fundamentos.

- **Flashcard 4**:
  - *Anverso*: ¿Cuál es el criterio de demarcación del Neopositivismo del Círculo de Viena?
  - *Reverso*: El criterio de verificación empírica del significado.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: De acuerdo con la clasificación contemporánea de las ciencias propuesta por el epistemólogo Mario Bunge, la lógica y la matemática pura son catalogadas como ciencias:
A) Fácticas naturales  
B) Fácticas sociales  
C) Formales o ideales  
D) Hermenéuticas  
E) Pseudocientíficas  

- **Resolución**: Las ciencias formales tienen como objeto de estudio entes ideales (números, formas, proposiciones lógicas), no interactúan con objetos físicos materiales y emplean como método de justificación la demostración deductiva formal coherente. La lógica y la matemática son los ejemplos arquetípicos de **ciencias formales**.
- **Clave Correcta**: **C**

---



### D. Relación Ciencia, Tecnología y Sociedad (CTS)
- **Ciencia**: Búsqueda desinteresada del saber y la verdad objetiva para explicar el cosmos (dimensión cognoscitiva).
- **Tecnología**: Aplicación práctica, instrumental y sistemática del conocimiento científico para diseñar herramientas, procesos y artefactos que modifican la realidad y satisfacen necesidades humanas.
- **Sociedad**: Contexto ético, político, económico y ecológico donde se desarrollan la ciencia y la tecnología. El enfoque CTS estudia el impacto social y los dilemas bioéticos (inteligencia artificial, manipulación genética, armamento atómico, calentamiento global)."""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t05_s02_c01",
                    question = "En la estructura lógica de la investigación científica, una 'hipótesis' se define con precisión epistemológica como:",
                    options = listOf(
                        "Una verdad absoluta e incuestionable revelada por la divinidad.",
                        "El aparato mecánico utilizado para medir la presión atmosférica.",
                        "Una respuesta tentativa, probable y contrastable formulada teóricamente para resolver un problema de investigación.",
                        "Un dato sensorial aislado registrado sin marco conceptual.",
                    ),
                    correctIndex = 2,
                    explanation = "Una hipótesis científica es una solución conjetural, provisional y sistemática ante un problema empírico o conceptual, sujeta a contrastación."
                ),
                Challenge(
                    id = "filo_t05_s02_c02",
                    question = "Una 'Ley Científica' expresa epistemológicamente:",
                    options = listOf(
                        "Una opinión circunstancial que cambia según la estación climática.",
                        "Una regla moral para evitar que los científicos cometan faltas éticas.",
                        "Un decreto legislativo promulgado por el Congreso de la República.",
                        "Una proposición general que describe una relación constante, necesaria, universal y regular entre fenómenos de la naturaleza o la sociedad.",
                    ),
                    correctIndex = 3,
                    explanation = "La ley científica es una hipótesis confirmada que formula relaciones constantes, invariantes y necesarias entre magnitudes o propiedades de los fenómenos."
                ),
                Challenge(
                    id = "filo_t05_s02_c03",
                    question = "Una 'Teoría Científica' se concibe en la epistemología moderna como:",
                    options = listOf(
                        "Un sistema conceptual unificado, lógicamente articulado de hipótesis y leyes que explica integralmente un dominio amplio de fenómenos reales.",
                        "Una mera suposición sin ninguna base empírica o demostrativa.",
                        "Un conjunto desordenado de recetas culinarias y fórmulas farmacéuticas.",
                        "Una verdad literaria destinada al entretenimiento en teatros.",
                    ),
                    correctIndex = 0,
                    explanation = "La teoría científica es el grado supremo de sistematización del saber: una red deductiva y explicativa de leyes que da cuenta global de una amplia gama de fenómenos."
                ),
                Challenge(
                    id = "filo_t05_s02_c04",
                    question = "Karl Popper revolucionó la epistemología contemporánea al proponer el 'Falsacionismo' como criterio de demarcación científica, el cual postula que:",
                    options = listOf(
                        "Una hipótesis o teoría posee estatus científico si es potencialmente refutable o falsable empíricamente, es decir, si es posible concebir observaciones que puedan contradecirla.",
                        "Una teoría es científica si y solo si puede ser demostrada como verdadera de forma definitiva mediante inducción.",
                        "La ciencia debe rechazar el uso de la lógica deductiva.",
                        "Toda teoría científica es necesariamente una mentira fraudulenta inventada por los físicos.",
                    ),
                    correctIndex = 0,
                    explanation = "Popper demostró la asimetría lógica de la contrastación: ningún número de confirmaciones puede verificar definitivamente una ley universal, pero una sola observación contraria basta para falsarla."
                ),
                Challenge(
                    id = "filo_t05_s02_c05",
                    question = "Para los filósofos del Círculo de Viena y el Neopositivismo (Carnap, Schlick), el criterio que permite distinguir una proposición con sentido científico de un enunciado metafísico pseudocientífico es el:",
                    options = listOf(
                        "Apego estricto a la autoridad eclesiástica vaticana.",
                        "Sentimiento místico de comunión con el cosmos.",
                        "Criterio de verificabilidad empírica mediante el análisis lógico del lenguaje.",
                        "Principio de utilidad militar inmediata.",
                    ),
                    correctIndex = 2,
                    explanation = "El positivismo lógico sostuvo que una proposición solo posee significado cognoscitivo si es analítica (lógica/matemática) o empíricamente verificable por observación sensible."
                ),
                Challenge(
                    id = "filo_t05_s02_c06",
                    question = "En su célebre obra 'La estructura de las revoluciones científicas', Thomas Kuhn define un 'Paradigma' como:",
                    options = listOf(
                        "Un catálogo de computadoras industriales vendidas en el mercado europeo.",
                        "Una constelación de logros científicos, valores, métodos y supuestos teóricos compartidos por una comunidad científica que guía la investigación durante una época.",
                        "Una corriente poética vanguardista del siglo XX.",
                        "Un examen escrito estandarizado para calificar a los alumnos de primaria.",
                    ),
                    correctIndex = 1,
                    explanation = "Para Kuhn, el paradigma es el modelo o marco conceptual hegemónico aceptado por la comunidad científica que define qué problemas son relevantes y cómo investigarlos."
                ),
                Challenge(
                    id = "filo_t05_s02_c07",
                    question = "Según el modelo epistemológico de Thomas Kuhn, cuando un paradigma dominante acumula demasiadas anomalías no resueltas entra en una fase de:",
                    options = listOf(
                        "Retorno a los mitos babilónicos sobre el nacimiento de los dioses.",
                        "Crisis paradigmática que puede desembocar en una Revolución Científica y la adopción de un nuevo paradigma.",
                        "Disolución absoluta de las universidades mundiales.",
                        "Ciencia normal perpetua.",
                    ),
                    correctIndex = 1,
                    explanation = "La proliferación de anomalías desata una crisis en el paradigma; si un paradigma rival logra dar cuenta de las anomalías, sobreviene una revolución científica con cambio de paradigma."
                ),
                Challenge(
                    id = "filo_t05_s02_c08",
                    question = "Paul Feyerabend defendió en su libro 'Contra el método' la controvertida postura del 'Anarquismo Epistemológico', sintetizada en la máxima 'todo vale' (anything goes), según la cual:",
                    options = listOf(
                        "No existe un método científico universal, rígido y único que garantice el progreso cognoscitivo, pues la ciencia avanza quebrando y transgrediendo reglas metodológicas.",
                        "Los laboratorios científicos deben ser destruidos mediante protestas anarquistas.",
                        "Cualquier mentira política es equivalente a una ley de la gravitación universal.",
                        "La ciencia inductiva debe formular leyes matemáticas a priori sin necesidad de experimentos.",
                    ),
                    correctIndex = 0,
                    explanation = "Feyerabend argumentó que el desarrollo real de la ciencia en la historia demuestra que las reglas metodológicas fijas limitan la creatividad y que ningún método normativo es infalible."
                ),
                Challenge(
                    id = "filo_t05_s02_c09",
                    question = "Imre Lakatos formuló la 'Metodología de los Programas de Investigación Científica' (PIC), distinguiendo en una teoría entre:",
                    options = listOf(
                        "Las leyes religiosas y los dogmas monacales medievales.",
                        "Los versos heroicos y las rimas asonantes del texto científico.",
                        "El núcleo duro (irrefutable por decisión) protegido por un cinturón protector de hipótesis auxiliares modificables.",
                        "El capital financiero y el salario de los técnicos de laboratorio.",
                    ),
                    correctIndex = 2,
                    explanation = "Lakatos postuló que los programas científicos poseen un 'núcleo firme' (hard core) que no se abandona ante las primeras refutaciones, ajustándose en su lugar el 'cinturón protector' de hipótesis auxiliares."
                ),
                Challenge(
                    id = "filo_t05_s02_c10",
                    question = "El concepto de 'inconmensurabilidad' entre paradigmas formulado por Kuhn y Feyerabend implica que:",
                    options = listOf(
                        "Las medidas métricas decimales no pueden ser convertidas a pulgadas inglesas.",
                        "Los planetas del sistema solar poseen masas infinitas e incontables.",
                        "Los científicos no pueden comunicarse en el mismo idioma coloquial.",
                        "Dos paradigmas rivales sucesivos no pueden compararse de forma neutral y directa, ya que manejan lenguajes, conceptos y visiones del mundo radicalmente diferentes.",
                    ),
                    correctIndex = 3,
                    explanation = "La inconmensurabilidad postula que al cambiar de paradigma los conceptos mutan de significado (como 'masa' en Newton y Einstein), impidiendo una comparación puramente acumulativa o neutral."
                ),
            )
        )
    )
}
