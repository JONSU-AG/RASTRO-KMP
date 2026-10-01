package filosofia

object FilosofiaSemana01 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t01_s01",
            subjectId = "filosofia",
            semana = 1,
            subtema = "1.1",
            title = "3.1. Etimología y Definición de la Filosofía",
            theory = LessonTheory(
                content = """# TEMA 01: NOCIONES PRELIMINARES DE FILOSOFÍA

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[NOCIONES DE FILOSOFÍA] --> B[Etimología y Definiciones]
    A --> C[Origen Histórico: El Paso del Mito al Logos]
    A --> D[Características del Saber Filosófico]
    A --> E[Filosofía frente a Otros Saberes]

    B --> B1[Etimología: Philos + Sophia = Amor a la Sabiduría]
    B --> B2[Pitágoras: Filósofo vs. Sabio Sophos]
    B --> B3[Aristóteles: El asombro Thauma como motor]

    C --> C1[Condiciones en Grecia: Jonia / Mileto Siglo VI a.C.]
    C --> C2[Factores: Comercio, Democracia, Esclavismo, Ocio Scholé]
    C --> C3[Del Mito Cosmogónico al Logos Racional]

    D --> D1[Universal / Totalizadora]
    D --> D2[Radical / Fundamental]
    D --> D3[Crítica y Problematizadora]
    D --> D4[Racional y Trascendente]

    E --> E1[Filosofía vs. Mito: Razón vs. Fantasía]
    E --> E2[Filosofía vs. Religión: Argumento vs. Fe y Dogma]
    E --> E3[Filosofía vs. Ciencia: Totalidad vs. Parcialidad empírica]
```

---



## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Etimología y Definición de la Filosofía
- **Etimología Griega:** Formada por las raíces *philos* (amante, amigo, buscador apasionado) y *sophia* (sabiduría, conocimiento supremo). Literalmente: **"Amor a la sabiduría"**.
- **La Tradición Pitagórica:** Según testimonios de Cicerón y Heráclides Póntico, fue **Pitágoras de Samos** (siglo VI a.C.) quien utilizó por primera vez el término *philosophos* al ser interrogado por el tirano Leonte de Fliunte sobre su profesión. Pitágoras respondió que no era un sabio (*sophos*), pues la sabiduría absoluta solo pertenece a los dioses, sino un humilde amante o buscador de la sabiduría (*philosophos*), comparando la vida con los juegos olímpicos donde unos van a competir por gloria, otros por dinero y los mejores solo van como espectadores atentos a contemplar la verdad.
- **Definiciones Históricas Clásicas:**
  - *Sócrates:* La filosofía es un examen constante de uno mismo y de los demás a través de la mayéutica; es el reconocimiento de los propios límites cognitivos (*"Solo sé que nada sé"*).
  - *Platón:* La filosofía es la dialéctica del alma para ascender del mundo sensible (apariencias, *doxa*) al mundo inteligible de las Ideas eternas (*episteme*).
  - *Aristóteles:* La filosofía es la "ciencia teórica de los primeros principios y de las primeras causas de todas las cosas en tanto que son" (Metafísica).
  - *René Descartes:* La filosofía es como un árbol cuyas raíces son la metafísica, el tronco es la física y las ramas son la medicina, la mecánica y la moral.
  - *Karl Marx:* *"Los filósofos no han hecho más que interpretar de diversos modos el mundo, pero de lo que se trata es de transformarlo"* (Tesis XI sobre Feuerbach).



### 4.1. Características Esenciales del Saber Filosófico
1. **Universal o Totalizadora:** No se restringe a un sector específico de la realidad (como la física o la botánica), sino que abarca la totalidad del ser, del conocimiento, de la existencia y del cosmos en su conjunto.
2. **Radical:** Busca la "raíz" (*radix*), el fundamento último y los primeros principios que sostienen todas las cosas.
3. **Crítica:** Cuestiona todo supuesto, dogma o certeza preconcebida. No admite ninguna verdad por mera tradición o autoridad; somete todo juicio al tamiz de la razón.
4. **Problematizadora:** Formula preguntas permanentes e inquietantes; prefiere mantener abierta la duda antes que conformarse con respuestas dogmáticas superficiales.
5. **Racional y Metódica:** Utiliza el pensamiento lógico, conceptos rigurosos, argumentos demostrativos y coherencia deductiva e inductiva, descartando la fe ciega o la intuición esotérica.
6. **Trascendente:** Va más allá de la experiencia sensorial inmediata física; indaga por los fundamentos metafísicos, éticos y epistemológicos de la realidad.



### 4.2. Filosofía Frente a Otros Tipos de Saberes
| Criterio | Saber Mítico | Saber Religioso | Saber Científico | Saber Filosófico |
| :--- | :--- | :--- | :--- | :--- |
| **Fuente** | Tradición oral, imaginación poética. | Revelación divina, fe, textos sagrados. | Observación empírica, experimentación, método científico. | Razón reflexiva, crítica conceptual y argumentación lógica. |
| **Objeto** | Explicación personificada del origen del cosmos. | Salvación espiritual, relación con lo trascendente. | Parcial: parcelas delimitadas de la realidad (átomos, células, astros). | **Universal:** La totalidad del ser, el sentido, el valor y el conocimiento. |
| **Actitud** | Aceptación acrítica de narraciones fantásticas. | Dogmática (verdades inmutables por fe). | Metódica, verificable, cuantitativa y predictiva. | **Crítica, radical, problematizadora y emancipadora.** |

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Las 5 Características del Saber Filosófico:**
   > **"U-R-C-P-R"** \implies **U**niversal, **R**adical, **C**rítica, **P**roblematizadora, **R**acional.
2. **Cuna de la Filosofía:**
   > **"Jonia y Mileto en el Siglo VI"** \implies Con Tales de Mileto nació el Logos.
3. **El Motor del Filosofar:**
   > **"Thauma"** \implies Asombro ante el Cosmos.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿Quién creó el término vs. quién es el primer filósofo?):**
  - **Pitágoras:** Fue quien inventó la palabra y se autodenominó por primera vez "filósofo".
  - **Tales de Mileto:** Es considerado unánimemente por la historia y por Aristóteles como el **primer filósofo de Occidente** al buscar el principio material racional (*arjé*) de la naturaleza.
- **Trampa 2 (Diferencia entre Ciencia y Filosofía):** La ciencia es **regional o particular** (estudia un fragmento de la realidad: la biología a los seres vivos; la geología a la corteza terrestre); la filosofía es **universal o totalizadora** (se pregunta qué es la realidad en sí, qué es el ser).
- **Trampa 3 (Radical no es ser extremista político):** En el examen de admisión, el rasgo de **radicalidad** significa estrictamente **"ir a la raíz o a los primeros principios y causas fundamentales"** del problema.

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Origen del Término Filósofo (Nivel Básico)
**Enunciado:** Según la tradición clásica transmitida por Cicerón, ¿qué sabio de la Antigüedad utilizó por primera vez el término *filósofo* al compararse modestamente con un observador desinteresado en los juegos olímpicos que busca la verdad por amor al saber?
A) Sócrates  
B) Tales de Mileto  
C) Pitágoras de Samos  
D) Aristóteles  
E) Heráclito de Éfeso  

**Solución paso a paso:**
1. Aunque Tales fue el primer filósofo en la práctica, fue **Pitágoras de Samos** quien acuñó la palabra y se definió a sí mismo como *philosophos* (amante de la sabiduría) frente al tirano Leonte.

**Respuesta:** C) Pitágoras de Samos.

---



### Problema 2: Características del Saber Filosófico (Nivel Intermedio)
**Enunciado:** Mientras que un botánico estudia la anatomía celular de las plantas y un astrónomo analiza la composición estelar de las galaxias, el filósofo se pregunta: *"¿Qué es la realidad en su conjunto?", "¿Qué significa que las cosas existan?"* y *"¿Cuál es el fundamento ontológico del ser?"*. Esta distinción resalta que, a diferencia del carácter particular de las ciencias, la filosofía posee un carácter esencialmente:
A) Dogmático y hermético  
B) Universal y totalizador  
C) Parcial y empírico  
D) Utilitario e instrumental  
E) Sensorial y descriptivo  

**Solución paso a paso:**
1. Las ciencias positivas delimitan parcelas o regiones específicas de la realidad (objeto regional o fragmentario).
2. La filosofía aborda la realidad como una totalidad omnicomprensiva sin parcelar el ser, lo que define su rasgo de **universalidad o totalización**.

**Respuesta:** B) Universal y totalizador.

---



### Problema 4: La Actitud Radical y Crítica en Casos DECO (Nivel Avanzado)
**Enunciado:** Un destacado abogado afirma en televisión que una ley debe acatarse ciegamente *"porque emana de la costumbre ancestral y la autoridad del gobernante"*. Un filósofo del derecho interviene y objeta: *"Ninguna costumbre ni mandato de poder es sagrado en sí mismo; debemos preguntarnos: ¿cuál es el fundamento último de la justicia?, ¿qué hace que una ley sea legítima o tiránica?"*. En esta intervención, el filósofo manifiesta con vigor las características del saber filosófico denominadas:
A) Empírica y utilitaria.  
B) Crítica y radical.  
C) Dogmática y axiomática.  
D) Tradicionalista y contingente.  
E) Inmanente y descriptiva.  

**Solución paso a paso:**
1. Cuestionar el principio de autoridad y no aceptar como dogma la costumbre revela la actitud **Crítica**.
2. Buscar la raíz profunda, la justificación última y el fundamento esencial de la legitimidad de la ley revela la actitud **Radical**.

**Respuesta:** B) Crítica y radical.

---



### Problema 5: Epistemología y Definiciones Filosóficas en Debate (Boss Challenge)
**Enunciado:** Analice las siguientes tres tesis sobre la naturaleza de la filosofía:
I. Para Aristóteles, la filosofía es la ciencia teórica de los primeros principios y de las causas supremas del ser en tanto que ser.  
II. Para Karl Marx, la filosofía tradicional ha pecado de contemplativa y especulativa, por lo que su auténtico valor reside en convertirse en praxis revolucionaria emancipadora para transformar las estructuras sociales.  
III. La filosofía y la ciencia se diferencian en que la ciencia prescinde de la demostración racional mientras que la filosofía utiliza la experimentación en laboratorios.  
¿Cuáles de las afirmaciones formuladas son filosófica e históricamente verdaderas?
A) Solo I  
B) Solo II  
C) I y II  
D) II y III  
E) I, II y III  

**Solución paso a paso:**
1. Tesis I: **Verdadera.** Coincide literalmente con la definición aristotélica de la Metafísica o Filosofía Primera.
2. Tesis II: **Verdadera.** Corresponde a la célebre Tesis XI sobre Feuerbach: *"Los filósofos no han hecho más que interpretar de diversos modos el mundo, pero de lo que se trata es de transformarlo"*.
3. Tesis III: **Falsa.** La ciencia sí utiliza la demostración racional y el laboratorio; la filosofía no opera con instrumental de laboratorio físico, sino con el análisis conceptual, la argumentación lógica y la crítica de fundamentos.

**Respuesta:** C) I y II.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿En qué región geográfica de la cuenca del mar Egeo surgió la filosofía occidental durante el siglo VI a.C.?
   - *Pista:* Colonias griegas en las costas del Asia Menor.
   - *Clave:* Jonia (específicamente en la ciudad de Mileto).

2. ¿Qué pensador griego es considerado por la tradición y por Aristóteles como el primer filósofo de la historia al proponer al agua como el primer principio (*arjé*) de la naturaleza?
   - *Pista:* Sabio de Mileto.
   - *Clave:* Tales de Mileto.

3. ¿Cuál es la característica del saber filosófico que consiste en formular preguntas incisivas y problematizar permanentemente lo que el sentido común considera obvio o resuelto?
   - *Pista:* Condición de problema abierto.
   - *Clave:* Problematizadora.

4. ¿Qué actitud psicológica o vivencial señalaron Platón y Aristóteles como el verdadero motor y punto de partida que despierta el asombro y el deseo de filosofar?
   - *Pista:* Palabra griega *Thauma*.
   - *Clave:* El asombro (o admiración).

5. ¿Cuál es la diferencia medular entre la actitud religiosa y la actitud filosófica frente a los enigmas de la existencia?
   - *Pista:* Una descansa en la fe y el dogma sagrado; la otra en la razón y la duda crítica.
   - *Clave:* La religión se basa en la fe y la revelación dogmática; la filosofía se basa en la argumentación racional y el cuestionamiento crítico.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Logos:** Razón, discurso inteligible, argumento racional y principio universal que ordena el cosmos.
2. **Mito (*Mythos*):** Narración fantástica, sagrada y simbólica que explica el origen del mundo mediante la intervención de deidades sobrenaturales.
3. **Radicalidad:** Cualidad del pensar filosófico de descender hasta la raíz última y los fundamentos constitutivos de la realidad.
4. **Totalidad:** Carácter omniabarcante de la filosofía que persigue una visión holística y comprehensiva del ser en su conjunto.
5. **Asombro (*Thauma*):** Estado anímico de perplejidad y deslumbramiento ante la existencia del mundo que detona la interrogación filosófica.
6. **Arjé (*Arché*):** Principio material, origen y causa primordial de la cual proceden y en la cual se resuelven todas las cosas de la naturaleza.
7. **Scholé:** Término griego para el ocio creador y el tiempo libre consagrado al estudio desinteresado y a la contemplación intelectual.
8. **Mayéutica:** Método socrático dialógico de preguntas y respuestas orientadas a "hacer parir" la verdad latente en la mente del interlocutor.
9. **Doxa:** Opinión común, creencia subjetiva, no fundamentada rigurosamente; contrapuesta a la *episteme* (conocimiento científico seguro).
10. **Praxis:** Acción social transformadora orientada a la modificación real y material de las condiciones del mundo (marxismo).

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es el significado etimológico de la palabra Filosofía?**
  *R: Amor a la sabiduría (*Philos* = amor/amistad, *Sophia* = sabiduría).*
- **P: ¿Quién acuñó el término y quién es considerado el primer filósofo?**
  *R: Pitágoras de Samos acuñó el término; Tales de Mileto fue el primer filósofo práctico de la historia.*
- **P: ¿Qué significa "el paso del mito al logos"?**
  *R: La sustitución de explicaciones poético-mágicas y sobrenaturales arbitrarias por explicaciones racionales, demostrativas y basadas en leyes naturales.*
- **P: ¿Por qué la filosofía es un saber "radical"?**
  *R: Porque indaga por los primeros principios, causas y fundamentos últimos de todas las cosas (va a la raíz del problema).*
- **P: ¿Cuál es la diferencia de enfoque entre la ciencia y la filosofía?**
  *R: La ciencia parceliza la realidad en objetos regionales concretos; la filosofía estudia la realidad como una totalidad unificada y reflexiona sobre el fundamento de las ciencias.*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Epistemología de la Inteligencia Artificial:** La pregunta filosófica fundamental sobre qué es la mente, la conciencia y si un algoritmo puede pensar de verdad (*test de Turing*, habitación china de Searle) es un debate plenamente filosófico que define la arquitectura de la computación contemporánea.
- **Bioética y Biotecnología:** La edición genética mediante CRISPR-Cas9 y la clonación exigen el examen crítico filosófico de la dignidad de la vida, límites éticos del progreso y responsabilidad con las generaciones futuras.
- **Democracia y Filosofía Política:** La noción de derechos humanos, ciudadanía y separación de poderes surgió de la crítica filosófica contra el absolutismo teocrático monárquico durante la Ilustración.

---



### 3.2. El Origen Histórico: Del Mito al Logos
La filosofía surge en las colonias griegas del Asia Menor (Jonia, específicamente la ciudad puerto de **Mileto**) durante el **siglo VI a.C.** con **Tales de Mileto**.
- **El Tránsito del Mito al Logos:**
  - **El Mito (*Mythos*):** Relato tradicional fantástico y antropomórfico que explicaba el origen del cosmos mediante la voluntad arbitraria de divinidades mitológicas (Homero en la *Ilíada* y Hesíodo en la *Teogonía*).
  - **El Logos:** Discurso racional, argumentativo y demostrativo que busca el principio intrínseco o ley natural de la realidad sin apelar a caprichos sobrenaturales.
- **Condiciones que hicieron posible el milagro griego:**
  1. **Geográfica y Comercial:** Mileto era un puerto cosmopolita que permitía el intercambio mercantil y cultural con Egipto, Babilonia y Persia, relativizando las creencias locales.
  2. **Política (La Polis y la Democracia incipiente):** El debate público en el ágora, la ausencia de una casta sacerdotal teocrática dominante y la igualdad ante la ley (*isonomía*) favorecieron la libre argumentación.
  3. **Socioeconómica (El Esclavismo y el Ocio - *Scholé*):** La existencia de una clase social liberada del trabajo manual pesado permitió el desarrollo del ocio creador y la contemplación teórica desinteresada.
  4. **Psicológica (El Asombro - *Thauma*):** Tanto Platón como Aristóteles señalaron que el **asombro o admiración** ante lo desconocido y ante la regularidad del universo es la chispa originaria que despierta el filosofar.

---



### Problema 3: El Paso del Mito al Logos (Nivel Intermedio-Avanzado)
**Enunciado:** En la antigua Grecia del siglo VI a.C., la explicación de las tempestades marinas dejó de atribuirse a la furia caprichosa y antropomórfica del dios Poseidón blandiendo su tridente, para ser explicada por filósofos jonios como producto del calentamiento desigual de los vientos y la evaporación del agua. Esta transición epistémica fundamental en la historia del pensamiento humano se conoce como:
A) La escatología homérica  
B) El paso del mito al logos  
C) La revolución escolástica  
D) El método mayéutico platónico  
E) La dialéctica hegeliana  

**Solución paso a paso:**
1. Sustituir las explicaciones mítico-religiosas arbitrarias basadas en seres sobrenaturales antropomórficos por explicaciones causales racionales, naturales e inmanentes constituye el hito fundacional denominado **el paso del mito al logos**.

**Respuesta:** B) El paso del mito al logos.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t01_s01_c01",
                    question = "Etimológicamente, la palabra Filosofía procede de los vocablos griegos 'philos' (amor, amistad, anhelo) y 'sophia' (sabiduría). De acuerdo con la tradición histórica, el primer pensador en autodenominarse 'filósofo' fue:",
                    options = listOf(
                        "Sócrates de Atenas.",
                        "Tales de Mileto.",
                        "Pitágoras de Samos.",
                        "Aristóteles de Estagira.",
                    ),
                    correctIndex = 2,
                    explanation = "Según la tradición transmitida por Cicerón y Heráclides Póntico, fue Pitágoras de Samos quien rechazó el título de 'sabio' (sophos) y prefirió llamarse 'amante de la sabiduría' (philosophos)."
                ),
                Challenge(
                    id = "filo_t01_s01_c02",
                    question = "La actitud filosófica se distingue de la actitud cotidiana por su carácter 'radical'. ¿Qué significa rigurosamente que la filosofía sea radical?",
                    options = listOf(
                        "Que promueve revoluciones sociales violentas para transformar el Estado.",
                        "Que rechaza toda forma de conocimiento científico por considerarlo superficial.",
                        "Que niega la existencia de cualquier principio moral o metafísico universal.",
                        "Que busca indagar los principios primeros, las causas fundamentales y la raíz última de la realidad.",
                    ),
                    correctIndex = 3,
                    explanation = "El carácter radical de la filosofía radica en su afán de no conformarse con lo aparente, buscando alcanzar la raíz (radix), los fundamentos y los primeros principios del ser y del pensar."
                ),
                Challenge(
                    id = "filo_t01_s01_c03",
                    question = "Cuando afirmamos que la filosofía es un saber 'totalizador' o 'universal', nos referimos a que:",
                    options = listOf(
                        "Exige que todos los seres humanos piensen de una manera idéntica y dogmática.",
                        "Se limita a resumir los resultados de las ciencias particulares sin aportar nada nuevo.",
                        "Estudia únicamente los fenómenos biológicos y astronómicos del cosmos.",
                        "Abarca la totalidad de lo real, buscando una comprensión omniabarcante del cosmos, el hombre y el conocimiento.",
                    ),
                    correctIndex = 3,
                    explanation = "A diferencia de las ciencias particulares que parcelan la realidad en objetos específicos de estudio, la filosofía tiene una pretensión universal y totalizadora sobre el conjunto de la existencia."
                ),
                Challenge(
                    id = "filo_t01_s01_c04",
                    question = "La característica de la actitud filosófica que consiste en someter a examen constante todo presupuesto, creencia o dogma sin aceptar nada como verdad definitiva sin previo juicio racional se denomina:",
                    options = listOf(
                        "Inmanencia práctica.",
                        "Especulación mística.",
                        "Crítica.",
                        "Trascendencia empírica.",
                    ),
                    correctIndex = 2,
                    explanation = "La actitud crítica cuestiona certezas heredadas, desvela prejuicios y rechaza la aceptación pasiva de dogmas mediante el examen riguroso de la razón."
                ),
                Challenge(
                    id = "filo_t01_s01_c05",
                    question = "Para Aristóteles y Platón, la experiencia humana inicial que despierta el impulso hacia la investigación filosófica y arranca al hombre de la ignorancia es:",
                    options = listOf(
                        "El cálculo utilitario de ganancias.",
                        "La angustia ante la finitud de la existencia.",
                        "El miedo a las fuerzas sobrenaturales de la naturaleza.",
                        "El asombro o admiración (thaumazein).",
                    ),
                    correctIndex = 3,
                    explanation = "Tanto en el 'Teeteto' de Platón como en la 'Metafísica' de Aristóteles se establece que el asombro o admiración (thaumazein) es el principio generador de la interrogación filosófica."
                ),
                Challenge(
                    id = "filo_t01_s01_c06",
                    question = "La filosofía es un saber 'problemático' porque:",
                    options = listOf(
                        "Genera conflictos sociales insolubles entre distintas clases económicas.",
                        "Reabre permanentemente sus interrogantes y ninguna de sus respuestas agota la búsqueda de la verdad.",
                        "Carece de métodos analíticos y recurre a explicaciones contradictorias.",
                        "Sus premisas no pueden ser formuladas mediante el lenguaje natural.",
                    ),
                    correctIndex = 1,
                    explanation = "Es problemática porque sus cuestionamientos no se cierran de forma definitiva; cada respuesta filosófica da origen a nuevos problemas y replanteamientos sobre los fundamentos."
                ),
                Challenge(
                    id = "filo_t01_s01_c07",
                    question = "Se afirma que la filosofía posee un carácter 'metódico' y 'sistemático' debido a que:",
                    options = listOf(
                        "Depende exclusivamente de revelaciones esotéricas ordenadas cronológicamente.",
                        "Estructura sus argumentos en teorías coherentes, organizadas conceptualmente y fundamentadas con rigor lógico.",
                        "Rechaza cualquier formulación lógica en favor de la libre intuición poética.",
                        "Copia el método experimental cuantitativo de las ciencias físicas modernas.",
                    ),
                    correctIndex = 1,
                    explanation = "La filosofía no es un cúmulo de opiniones dispersas, sino un sistema articulado de proposiciones racionales fundamentadas mediante métodos rigurosos de argumentación."
                ),
                Challenge(
                    id = "filo_t01_s01_c08",
                    question = "En contraposición a la actitud religiosa basada en la fe en lo divino, la actitud filosófica se define primordialmente como:",
                    options = listOf(
                        "Racional y argumentativa.",
                        "Afectiva y ritualista.",
                        "Dogmática y esotérica.",
                        "Pasiva y contemplativa.",
                    ),
                    correctIndex = 0,
                    explanation = "La filosofía no fundamenta sus tesis en la autoridad divina ni en la revelación sagrada, sino en el uso autónomo de la razón discursiva y la argumentación demostrativa."
                ),
                Challenge(
                    id = "filo_t01_s01_c09",
                    question = "¿Cuál de las siguientes interrogantes expresa paradigmáticamente una preocupación de carácter estrictamente filosófico?",
                    options = listOf(
                        "¿A cuántos grados centígrados hierve el agua a nivel del mar?",
                        "¿Cuál es el fundamento ontológico del ser y por qué existe el ente en lugar de la nada?",
                        "¿Cuántos diputados componen el poder legislativo en el régimen republicano peruano?",
                        "¿Cuáles fueron los factores climatológicos que provocaron el Fenómeno del Niño en 1998?",
                    ),
                    correctIndex = 1,
                    explanation = "La interrogante por el ser y el fundamento último de la existencia es de índole ontológica y radical, típica del quehacer filosófico, a diferencia de las preguntas fácticas o normativas de las ciencias particulares."
                ),
                Challenge(
                    id = "filo_t01_s01_c10",
                    question = "La característica filosófica denominada 'trascendente' hace referencia a que este saber:",
                    options = listOf(
                        "Va más allá de las apariencias y experiencias fenoménicas inmediatas para alcanzar los principios inteligibles que las sustentan.",
                        "Se limita a constatar y registrar los datos sensibles inmediatos del mundo empírico.",
                        "Abandona el mundo real para refugiarse en fantasías míticas incomprobables.",
                        "Requiere necesariamente creer en dioses supranaturales para tener sentido.",
                    ),
                    correctIndex = 0,
                    explanation = "Trascendente significa que el pensamiento filosófico sobrepasa el ámbito fenoménico empírico inmediato en busca de las esencias, categorías y principios universales que explican la realidad."
                ),
            )
        ),
        LessonNode(
            id = "filo_t01_s02",
            subjectId = "filosofia",
            semana = 1,
            subtema = "1.2",
            title = "3.2. El Origen Histórico: Del Mito al Logos",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[NOCIONES DE FILOSOFÍA] --> B[Etimología y Definiciones]
    A --> C[Origen Histórico: El Paso del Mito al Logos]
    A --> D[Características del Saber Filosófico]
    A --> E[Filosofía frente a Otros Saberes]

    B --> B1[Etimología: Philos + Sophia = Amor a la Sabiduría]
    B --> B2[Pitágoras: Filósofo vs. Sabio Sophos]
    B --> B3[Aristóteles: El asombro Thauma como motor]

    C --> C1[Condiciones en Grecia: Jonia / Mileto Siglo VI a.C.]
    C --> C2[Factores: Comercio, Democracia, Esclavismo, Ocio Scholé]
    C --> C3[Del Mito Cosmogónico al Logos Racional]

    D --> D1[Universal / Totalizadora]
    D --> D2[Radical / Fundamental]
    D --> D3[Crítica y Problematizadora]
    D --> D4[Racional y Trascendente]

    E --> E1[Filosofía vs. Mito: Razón vs. Fantasía]
    E --> E2[Filosofía vs. Religión: Argumento vs. Fe y Dogma]
    E --> E3[Filosofía vs. Ciencia: Totalidad vs. Parcialidad empírica]
```

---



### 3.2. El Origen Histórico: Del Mito al Logos
La filosofía surge en las colonias griegas del Asia Menor (Jonia, específicamente la ciudad puerto de **Mileto**) durante el **siglo VI a.C.** con **Tales de Mileto**.
- **El Tránsito del Mito al Logos:**
  - **El Mito (*Mythos*):** Relato tradicional fantástico y antropomórfico que explicaba el origen del cosmos mediante la voluntad arbitraria de divinidades mitológicas (Homero en la *Ilíada* y Hesíodo en la *Teogonía*).
  - **El Logos:** Discurso racional, argumentativo y demostrativo que busca el principio intrínseco o ley natural de la realidad sin apelar a caprichos sobrenaturales.
- **Condiciones que hicieron posible el milagro griego:**
  1. **Geográfica y Comercial:** Mileto era un puerto cosmopolita que permitía el intercambio mercantil y cultural con Egipto, Babilonia y Persia, relativizando las creencias locales.
  2. **Política (La Polis y la Democracia incipiente):** El debate público en el ágora, la ausencia de una casta sacerdotal teocrática dominante y la igualdad ante la ley (*isonomía*) favorecieron la libre argumentación.
  3. **Socioeconómica (El Esclavismo y el Ocio - *Scholé*):** La existencia de una clase social liberada del trabajo manual pesado permitió el desarrollo del ocio creador y la contemplación teórica desinteresada.
  4. **Psicológica (El Asombro - *Thauma*):** Tanto Platón como Aristóteles señalaron que el **asombro o admiración** ante lo desconocido y ante la regularidad del universo es la chispa originaria que despierta el filosofar.

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Las 5 Características del Saber Filosófico:**
   > **"U-R-C-P-R"** \implies **U**niversal, **R**adical, **C**rítica, **P**roblematizadora, **R**acional.
2. **Cuna de la Filosofía:**
   > **"Jonia y Mileto en el Siglo VI"** \implies Con Tales de Mileto nació el Logos.
3. **El Motor del Filosofar:**
   > **"Thauma"** \implies Asombro ante el Cosmos.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿Quién creó el término vs. quién es el primer filósofo?):**
  - **Pitágoras:** Fue quien inventó la palabra y se autodenominó por primera vez "filósofo".
  - **Tales de Mileto:** Es considerado unánimemente por la historia y por Aristóteles como el **primer filósofo de Occidente** al buscar el principio material racional (*arjé*) de la naturaleza.
- **Trampa 2 (Diferencia entre Ciencia y Filosofía):** La ciencia es **regional o particular** (estudia un fragmento de la realidad: la biología a los seres vivos; la geología a la corteza terrestre); la filosofía es **universal o totalizadora** (se pregunta qué es la realidad en sí, qué es el ser).
- **Trampa 3 (Radical no es ser extremista político):** En el examen de admisión, el rasgo de **radicalidad** significa estrictamente **"ir a la raíz o a los primeros principios y causas fundamentales"** del problema.

---



### Problema 3: El Paso del Mito al Logos (Nivel Intermedio-Avanzado)
**Enunciado:** En la antigua Grecia del siglo VI a.C., la explicación de las tempestades marinas dejó de atribuirse a la furia caprichosa y antropomórfica del dios Poseidón blandiendo su tridente, para ser explicada por filósofos jonios como producto del calentamiento desigual de los vientos y la evaporación del agua. Esta transición epistémica fundamental en la historia del pensamiento humano se conoce como:
A) La escatología homérica  
B) El paso del mito al logos  
C) La revolución escolástica  
D) El método mayéutico platónico  
E) La dialéctica hegeliana  

**Solución paso a paso:**
1. Sustituir las explicaciones mítico-religiosas arbitrarias basadas en seres sobrenaturales antropomórficos por explicaciones causales racionales, naturales e inmanentes constituye el hito fundacional denominado **el paso del mito al logos**.

**Respuesta:** B) El paso del mito al logos.

---



### Problema 5: Epistemología y Definiciones Filosóficas en Debate (Boss Challenge)
**Enunciado:** Analice las siguientes tres tesis sobre la naturaleza de la filosofía:
I. Para Aristóteles, la filosofía es la ciencia teórica de los primeros principios y de las causas supremas del ser en tanto que ser.  
II. Para Karl Marx, la filosofía tradicional ha pecado de contemplativa y especulativa, por lo que su auténtico valor reside en convertirse en praxis revolucionaria emancipadora para transformar las estructuras sociales.  
III. La filosofía y la ciencia se diferencian en que la ciencia prescinde de la demostración racional mientras que la filosofía utiliza la experimentación en laboratorios.  
¿Cuáles de las afirmaciones formuladas son filosófica e históricamente verdaderas?
A) Solo I  
B) Solo II  
C) I y II  
D) II y III  
E) I, II y III  

**Solución paso a paso:**
1. Tesis I: **Verdadera.** Coincide literalmente con la definición aristotélica de la Metafísica o Filosofía Primera.
2. Tesis II: **Verdadera.** Corresponde a la célebre Tesis XI sobre Feuerbach: *"Los filósofos no han hecho más que interpretar de diversos modos el mundo, pero de lo que se trata es de transformarlo"*.
3. Tesis III: **Falsa.** La ciencia sí utiliza la demostración racional y el laboratorio; la filosofía no opera con instrumental de laboratorio físico, sino con el análisis conceptual, la argumentación lógica y la crítica de fundamentos.

**Respuesta:** C) I y II.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿En qué región geográfica de la cuenca del mar Egeo surgió la filosofía occidental durante el siglo VI a.C.?
   - *Pista:* Colonias griegas en las costas del Asia Menor.
   - *Clave:* Jonia (específicamente en la ciudad de Mileto).

2. ¿Qué pensador griego es considerado por la tradición y por Aristóteles como el primer filósofo de la historia al proponer al agua como el primer principio (*arjé*) de la naturaleza?
   - *Pista:* Sabio de Mileto.
   - *Clave:* Tales de Mileto.

3. ¿Cuál es la característica del saber filosófico que consiste en formular preguntas incisivas y problematizar permanentemente lo que el sentido común considera obvio o resuelto?
   - *Pista:* Condición de problema abierto.
   - *Clave:* Problematizadora.

4. ¿Qué actitud psicológica o vivencial señalaron Platón y Aristóteles como el verdadero motor y punto de partida que despierta el asombro y el deseo de filosofar?
   - *Pista:* Palabra griega *Thauma*.
   - *Clave:* El asombro (o admiración).

5. ¿Cuál es la diferencia medular entre la actitud religiosa y la actitud filosófica frente a los enigmas de la existencia?
   - *Pista:* Una descansa en la fe y el dogma sagrado; la otra en la razón y la duda crítica.
   - *Clave:* La religión se basa en la fe y la revelación dogmática; la filosofía se basa en la argumentación racional y el cuestionamiento crítico.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Logos:** Razón, discurso inteligible, argumento racional y principio universal que ordena el cosmos.
2. **Mito (*Mythos*):** Narración fantástica, sagrada y simbólica que explica el origen del mundo mediante la intervención de deidades sobrenaturales.
3. **Radicalidad:** Cualidad del pensar filosófico de descender hasta la raíz última y los fundamentos constitutivos de la realidad.
4. **Totalidad:** Carácter omniabarcante de la filosofía que persigue una visión holística y comprehensiva del ser en su conjunto.
5. **Asombro (*Thauma*):** Estado anímico de perplejidad y deslumbramiento ante la existencia del mundo que detona la interrogación filosófica.
6. **Arjé (*Arché*):** Principio material, origen y causa primordial de la cual proceden y en la cual se resuelven todas las cosas de la naturaleza.
7. **Scholé:** Término griego para el ocio creador y el tiempo libre consagrado al estudio desinteresado y a la contemplación intelectual.
8. **Mayéutica:** Método socrático dialógico de preguntas y respuestas orientadas a "hacer parir" la verdad latente en la mente del interlocutor.
9. **Doxa:** Opinión común, creencia subjetiva, no fundamentada rigurosamente; contrapuesta a la *episteme* (conocimiento científico seguro).
10. **Praxis:** Acción social transformadora orientada a la modificación real y material de las condiciones del mundo (marxismo).

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es el significado etimológico de la palabra Filosofía?**
  *R: Amor a la sabiduría (*Philos* = amor/amistad, *Sophia* = sabiduría).*
- **P: ¿Quién acuñó el término y quién es considerado el primer filósofo?**
  *R: Pitágoras de Samos acuñó el término; Tales de Mileto fue el primer filósofo práctico de la historia.*
- **P: ¿Qué significa "el paso del mito al logos"?**
  *R: La sustitución de explicaciones poético-mágicas y sobrenaturales arbitrarias por explicaciones racionales, demostrativas y basadas en leyes naturales.*
- **P: ¿Por qué la filosofía es un saber "radical"?**
  *R: Porque indaga por los primeros principios, causas y fundamentos últimos de todas las cosas (va a la raíz del problema).*
- **P: ¿Cuál es la diferencia de enfoque entre la ciencia y la filosofía?**
  *R: La ciencia parceliza la realidad en objetos regionales concretos; la filosofía estudia la realidad como una totalidad unificada y reflexiona sobre el fundamento de las ciencias.*

---



### 4.2. Filosofía Frente a Otros Tipos de Saberes
| Criterio | Saber Mítico | Saber Religioso | Saber Científico | Saber Filosófico |
| :--- | :--- | :--- | :--- | :--- |
| **Fuente** | Tradición oral, imaginación poética. | Revelación divina, fe, textos sagrados. | Observación empírica, experimentación, método científico. | Razón reflexiva, crítica conceptual y argumentación lógica. |
| **Objeto** | Explicación personificada del origen del cosmos. | Salvación espiritual, relación con lo trascendente. | Parcial: parcelas delimitadas de la realidad (átomos, células, astros). | **Universal:** La totalidad del ser, el sentido, el valor y el conocimiento. |
| **Actitud** | Aceptación acrítica de narraciones fantásticas. | Dogmática (verdades inmutables por fe). | Metódica, verificable, cuantitativa y predictiva. | **Crítica, radical, problematizadora y emancipadora.** |

---



### 3.1. Etimología y Definición de la Filosofía
- **Etimología Griega:** Formada por las raíces *philos* (amante, amigo, buscador apasionado) y *sophia* (sabiduría, conocimiento supremo). Literalmente: **"Amor a la sabiduría"**.
- **La Tradición Pitagórica:** Según testimonios de Cicerón y Heráclides Póntico, fue **Pitágoras de Samos** (siglo VI a.C.) quien utilizó por primera vez el término *philosophos* al ser interrogado por el tirano Leonte de Fliunte sobre su profesión. Pitágoras respondió que no era un sabio (*sophos*), pues la sabiduría absoluta solo pertenece a los dioses, sino un humilde amante o buscador de la sabiduría (*philosophos*), comparando la vida con los juegos olímpicos donde unos van a competir por gloria, otros por dinero y los mejores solo van como espectadores atentos a contemplar la verdad.
- **Definiciones Históricas Clásicas:**
  - *Sócrates:* La filosofía es un examen constante de uno mismo y de los demás a través de la mayéutica; es el reconocimiento de los propios límites cognitivos (*"Solo sé que nada sé"*).
  - *Platón:* La filosofía es la dialéctica del alma para ascender del mundo sensible (apariencias, *doxa*) al mundo inteligible de las Ideas eternas (*episteme*).
  - *Aristóteles:* La filosofía es la "ciencia teórica de los primeros principios y de las primeras causas de todas las cosas en tanto que son" (Metafísica).
  - *René Descartes:* La filosofía es como un árbol cuyas raíces son la metafísica, el tronco es la física y las ramas son la medicina, la mecánica y la moral.
  - *Karl Marx:* *"Los filósofos no han hecho más que interpretar de diversos modos el mundo, pero de lo que se trata es de transformarlo"* (Tesis XI sobre Feuerbach).



### Problema 1: Origen del Término Filósofo (Nivel Básico)
**Enunciado:** Según la tradición clásica transmitida por Cicerón, ¿qué sabio de la Antigüedad utilizó por primera vez el término *filósofo* al compararse modestamente con un observador desinteresado en los juegos olímpicos que busca la verdad por amor al saber?
A) Sócrates  
B) Tales de Mileto  
C) Pitágoras de Samos  
D) Aristóteles  
E) Heráclito de Éfeso  

**Solución paso a paso:**
1. Aunque Tales fue el primer filósofo en la práctica, fue **Pitágoras de Samos** quien acuñó la palabra y se definió a sí mismo como *philosophos* (amante de la sabiduría) frente al tirano Leonte.

**Respuesta:** C) Pitágoras de Samos.

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Epistemología de la Inteligencia Artificial:** La pregunta filosófica fundamental sobre qué es la mente, la conciencia y si un algoritmo puede pensar de verdad (*test de Turing*, habitación china de Searle) es un debate plenamente filosófico que define la arquitectura de la computación contemporánea.
- **Bioética y Biotecnología:** La edición genética mediante CRISPR-Cas9 y la clonación exigen el examen crítico filosófico de la dignidad de la vida, límites éticos del progreso y responsabilidad con las generaciones futuras.
- **Democracia y Filosofía Política:** La noción de derechos humanos, ciudadanía y separación de poderes surgió de la crítica filosófica contra el absolutismo teocrático monárquico durante la Ilustración.

---



### 4.1. Características Esenciales del Saber Filosófico
1. **Universal o Totalizadora:** No se restringe a un sector específico de la realidad (como la física o la botánica), sino que abarca la totalidad del ser, del conocimiento, de la existencia y del cosmos en su conjunto.
2. **Radical:** Busca la "raíz" (*radix*), el fundamento último y los primeros principios que sostienen todas las cosas.
3. **Crítica:** Cuestiona todo supuesto, dogma o certeza preconcebida. No admite ninguna verdad por mera tradición o autoridad; somete todo juicio al tamiz de la razón.
4. **Problematizadora:** Formula preguntas permanentes e inquietantes; prefiere mantener abierta la duda antes que conformarse con respuestas dogmáticas superficiales.
5. **Racional y Metódica:** Utiliza el pensamiento lógico, conceptos rigurosos, argumentos demostrativos y coherencia deductiva e inductiva, descartando la fe ciega o la intuición esotérica.
6. **Trascendente:** Va más allá de la experiencia sensorial inmediata física; indaga por los fundamentos metafísicos, éticos y epistemológicos de la realidad.



# TEMA 01: NOCIONES PRELIMINARES DE FILOSOFÍA

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t01_s02_c01",
                    question = "Históricamente, la filosofía occidental surgió en el siglo VI a.C. en las colonias griegas de la región de Jonia (Asia Menor), específicamente en la polis de:",
                    options = listOf(
                        "Mileto.",
                        "Tebas.",
                        "Esparta.",
                        "Atenas.",
                    ),
                    correctIndex = 0,
                    explanation = "El tránsito del mito al logos se originó en la ciudad mercantil de Mileto, cuna de los primeros pensadores jónicos: Tales, Anaximandro y Anaxímenes."
                ),
                Challenge(
                    id = "filo_t01_s02_c02",
                    question = "El célebre fenómeno histórico-cultural conocido como el 'paso del mito al logos' consistió fundamentalmente en:",
                    options = listOf(
                        "La invención del método experimental moderno con instrumental de laboratorio.",
                        "La sustitución de narraciones míticas antropomórficas por explicaciones racionales basadas en el orden y leyes de la naturaleza (physis).",
                        "La prohibición legal del culto a los dioses olímpicos mediante decretos políticos atenienses.",
                        "El reemplazo de la ciencia babilónica por rituales religiosos politeístas.",
                    ),
                    correctIndex = 1,
                    explanation = "El 'paso del mito al logos' representa el abandono del capricho antropomórfico de los dioses en los mitos homéricos y hesiódicos para postular un orden racional y necesario (logos) intrínseco al cosmos."
                ),
                Challenge(
                    id = "filo_t01_s02_c03",
                    question = "Entre los factores económicos y geográficos que hicieron posible el surgimiento de la filosofía en las colonias griegas de Jonia destaca:",
                    options = listOf(
                        "El aislamiento geográfico total que protegió a los griegos del contacto con otras civilizaciones.",
                        "La existencia de una economía exclusivamente agraria basada en el monopolio sacerdotal del suelo.",
                        "La imposición de un imperio teocrático militar centralizado al estilo mesopotámico.",
                        "El intenso intercambio comercial marítimo que generó prosperidad económica y contacto con saberes astronómicos y matemáticos de Oriente.",
                    ),
                    correctIndex = 3,
                    explanation = "La posición portuaria y mercantil de las colonias jonias facilitó el intercambio comercial y cultural con Egipto y Babilonia, ampliando el horizonte mental y flexibilizando las tradiciones míticas locales."
                ),
                Challenge(
                    id = "filo_t01_s02_c04",
                    question = "¿Qué factor político de la polis griega favoreció de manera determinante el desarrollo de la actitud racional y filosófica?",
                    options = listOf(
                        "El gobierno absolutista de reyes divinizados cuyos mandatos eran incuestionables.",
                        "La concentración de la justicia en una casta sacerdotal hereditaria que interpretaba los oráculos.",
                        "La consolidación de instituciones democráticas donde las leyes y decisiones se deliberaban públicamente mediante la palabra argumentada (el ágora).",
                        "La ausencia de debate público debido a la censura del tribunal de la Inquisición.",
                    ),
                    correctIndex = 2,
                    explanation = "La experiencia de la polis y el ágora, donde los ciudadanos debatían y aprobaban leyes mediante la argumentación racional y la oratoria, propició una cultura donde la razón y el discurso (logos) tenían primacía."
                ),
                Challenge(
                    id = "filo_t01_s02_c05",
                    question = "En comparación con civilizaciones orientales como Egipto o Babilonia, la estructura religiosa griega se caracterizó por un factor que impulsó el libre pensamiento:",
                    options = listOf(
                        "El control férreo de los templos sobre la educación primaria de todos los infantes.",
                        "La inexistencia de una casta sacerdotal dogmática poseedora de libros sagrados incuestionables.",
                        "La obligación civil de venerar a un único dios creador todopoderoso.",
                        "La condena a muerte de todo aquel que no recitara de memoria la Teogonía de Hesíodo.",
                    ),
                    correctIndex = 1,
                    explanation = "En Grecia no existía una casta sacerdotal depositaria de un dogma oficial o libro sagrado infalible, lo cual permitió una libertad intelectual y especulativa sin precedentes."
                ),
                Challenge(
                    id = "filo_t01_s02_c06",
                    question = "El concepto de 'ocio creador' o 'tiempo libre' (en griego, skholé) fue una condición sociocultural indispensable para la filosofía porque permitió:",
                    options = listOf(
                        "Que los pensadores se dedicaran a la pereza y el esparcimiento improductivo sin responsabilidades.",
                        "La disolución de los ejércitos para garantizar la paz universal en el mar Mediterráneo.",
                        "Que ciertos ciudadanos, liberados del trabajo físico extenuante por el sistema esclavista, consagraran su tiempo a la investigación teórica pura.",
                        "El cobro de salarios estatales a todos los ciudadanos que asistieran a los teatros.",
                    ),
                    correctIndex = 2,
                    explanation = "La 'skholé' (ocio fecundo) permitía disponer de tiempo liberado de las urgencias materiales inmediatas para consagrarse al cultivo del intelecto, la contemplación y la discusión racional."
                ),
                Challenge(
                    id = "filo_t01_s02_c07",
                    question = "En los relatos míticos de Homero y Hesíodo, los acontecimientos naturales y humanos se explicaban mediante:",
                    options = listOf(
                        "La voluntad caprichosa y antropomórfica de deidades celestiales sujetas a pasiones y disputas.",
                        "Leyes físico-químicas universales e invariables en el tiempo.",
                        "Demostraciones lógicas deductivas sustentadas en la observación empírica.",
                        "Ecuaciones algebraicas precisas calculadas por los astrónomos reales.",
                    ),
                    correctIndex = 0,
                    explanation = "El pensamiento mítico atribuye las fuerzas de la naturaleza a la voluntad, pasiones y caprichos de dioses antropomorfos, impidiendo la noción de ley natural objetiva."
                ),
                Challenge(
                    id = "filo_t01_s02_c08",
                    question = "La noción griega de 'Cosmos' introducida por los primeros filósofos frente al 'Caos' mítico expresa fundamentalmente:",
                    options = listOf(
                        "Una creación ex nihilo realizada por una divinidad providencial y bondadosa.",
                        "Un espacio vacío e infinito carente de materia viva.",
                        "Un universo ordenado y armónico regido por principios racionales comprensibles para la mente humana.",
                        "Un sistema caótico e impredecible gobernado por el azar y la discordia permanente.",
                    ),
                    correctIndex = 2,
                    explanation = "'Cosmos' alude a la armonía, orden y belleza de una naturaleza regida por una legalidad intrínseca que la razón humana puede descifrar."
                ),
                Challenge(
                    id = "filo_t01_s02_c09",
                    question = "Tales de Mileto es reconocido unánimemente como el padre de la filosofía occidental debido a que fue el primero en:",
                    options = listOf(
                        "Postular un principio material único y racional (arjé: el agua) para explicar el origen y dinamismo de la naturaleza sin recurrir al mito.",
                        "Defender el relativismo gnoseológico del hombre como medida de todas las cosas.",
                        "Formular por primera vez la teoría silogística de la lógica formal.",
                        "Sistematizar la física atómica basada en el vacío y las partículas indivisibles.",
                    ),
                    correctIndex = 0,
                    explanation = "Tales inaugura la filosofía al prescindir de explicaciones sobrenaturales y proponer un primer principio natural (el agua como arjé) para dar cuenta de la multiplicidad cósmica."
                ),
                Challenge(
                    id = "filo_t01_s02_c10",
                    question = "La consolidación de la moneda acuñada y la expansión del comercio en el mundo jónico del siglo VI a.C. influyeron en el pensamiento abstracto porque:",
                    options = listOf(
                        "Destruyeron el interés por la astronomía y la geometría náutica.",
                        "Prohibieron la posesión privada de metales preciosos para evitar la codicia personal.",
                        "Obligaron a los filósofos a trabajar como prestamistas bancarios en el templo de Éfeso.",
                        "Exigieron la sustitución del intercambio concreto de mercancías por un patrón monetario abstracto y de valor universal de cambio.",
                    ),
                    correctIndex = 3,
                    explanation = "El uso generalizado de la moneda favoreció la capacidad mental de abstracción, al igual que las leyes escritas formalizaban conceptos universales desligados de casos particulares."
                ),
            )
        )
    )
}
