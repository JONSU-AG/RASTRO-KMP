package filosofia

object FilosofiaSemana02 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t02_s01",
            subjectId = "filosofia",
            semana = 2,
            subtema = "2.1",
            title = "A. Metafísica y Ontología",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE DISCIPLINAS

```
                                  CAMPOS DEL SABER FILOSÓFICO
                                                │
         ┌──────────────────┬───────────────────┼───────────────────┬──────────────────┐
         ▼                  ▼                   ▼                   ▼                  ▼
    DEL SER            DEL CONOCER          DEL OBRAR          DEL VALOR          DEL HOMBRE
  (Metafísica y       (Gnoseología y      (Ética y Fil.      (Axiología y        (Antropología
   Ontología)         Epistemología)        Política)          Estética)          Filosófica)
         │                  │                   │                   │                  │
• ¿Qué es el ser?    • ¿Qué es la       • ¿Qué es el bien?  • ¿Qué es el        • ¿Cuál es la
• ¿Cuál es el          verdad?          • ¿Qué es la          valor?              naturaleza o
  origen y           • ¿Qué es la         justicia?         • ¿Qué es la          esencia del
  estructura           ciencia?         • ¿Qué es el          belleza?            ser humano?
  de lo real?        • ¿Cómo se valida?   deber?            • Juicios estéticos • ¿Tiene sentido
                                                              y artísticos.       la existencia?
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Metafísica y Ontología
- **Etimología**: 
  - *Metafísica*: Del griego \mu\epsilon\tau\alpha ́ (*metá*, "más allá") y \phi\upsilon\sigma\iota\kappa\alpha ́ (*physiká*, "lo físico/natural"). Término acuñado por Andrónico de Rodas al ordenar las obras de Aristóteles.
  - *Ontología*: Del griego \hat{o}\nu, \hat{o}\nu\tau\mathrm{os} (*on, ontos*, "el ser") y \lambda\acute{o}\gamma\mathrm{os} (*logos*, "estudio/tratado"). Acuñado en el siglo XVII (Johannes Clauberg y Christian Wolff).
- **Objeto de Estudio**: El **ente en cuanto ente** (el ser de las cosas), sus principios primeros, sus causas universales y su estructura fundamental.
- **Preguntas Fundamentales**: ¿Qué existe? ¿Por qué existe algo en lugar de nada? ¿Qué es el ser? ¿Cuál es la sustancia última de la realidad?



### B. Gnoseología o Teoría del Conocimiento
- **Etimología**: Del griego \gamma\nu\tilde{\omega}\sigma\iota\varsigma (*gnosis*, "conocimiento general") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: El conocimiento humano en su dimensión más general y universal: origen, posibilidad, esencia, límites y naturaleza de la verdad.
- **Diferenciación Crítica**: No analiza cómo conoce un sujeto particular psicológicamente ni el rigor de teorías científicas específicas, sino la relación entre **Sujeto cognoscente** y **Objeto cognoscible**.
- **Preguntas Fundamentales**: ¿Es posible conocer la realidad objetiva? ¿Cuál es la fuente primaria del saber: la razón (*racionalismo*) o los sentidos (*empirismo*)? ¿Qué es la verdad?



### C. Epistemología o Filosofía de la Ciencia
- **Etimología**: Del griego \acute{\epsilon}\pi\iota\sigma\tau\acute{\eta}\mu\eta (*episteme*, "saber fundado, ciencia") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: El **conocimiento científico**, su estructura lógica, fundamentación, métodos de validación, demarcación (criterios para distinguir ciencia de pseudociencia) y dinámica histórica de las teorías científicas.
- **Preguntas Fundamentales**: ¿Qué criterio demarca lo que es ciencia? ¿Son las teorías científicas verdaderas o solo modelos instrumentales? ¿Cómo progresan las ciencias?



### D. Lógica
- **Etimología**: Del griego \lambda\acute{o}\gamma\mathrm{os} (*logos*, "razón, palabra, discurso").
- **Objeto de Estudio**: Las leyes, formas y estructuras del **pensamiento inferencial válido**, la deducción y la demostración formal.
- **Preguntas Fundamentales**: ¿Cuándo una inferencia es formalmente válida? ¿Cuáles son las leyes lógicas supremas?



### E. Ética o Filosofía Moral
- **Etimología**: Del griego \tilde{\eta}\theta\mathrm{os} (*ethos*, "carácter, morada, hábito").
- **Objeto de Estudio**: La **moral**, la fundamentación de las normas del obrar humano, la libertad, el deber, la responsabilidad y las concepciones del Bien y la Vida Buena.
- **Preguntas Fundamentales**: ¿Qué es el Bien? ¿Por qué debemos actuar según el deber? ¿Es la libertad una condición indispensable para la imputabilidad moral?



### F. Axiología o Teoría del Valor
- **Etimología**: Del griego \hat{\alpha}\xi\iota\mathrm{os} (*axios*, "valioso, estimable") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: La naturaleza de los **valores** (éticos, estéticos, económicos, religiosos), sus propiedades (polaridad, jerarquía) y el acto valorativo humano.
- **Preguntas Fundamentales**: ¿Las cosas valen porque las deseamos (*subjetivismo axiológico*) o las deseamos porque son valiosas en sí mismas (*objetivismo axiológico*)?



### I. Filosofía Política
- **Etimología**: Del griego \pi\acute{o}\lambda\iota\varsigma (*polis*, "ciudad-estado").
- **Objeto de Estudio**: El poder político, el Estado, la legitimidad, la soberanía, la justicia distributiva y la organización de la sociedad civil.
- **Preguntas Fundamentales**: ¿Cuál es el fundamento legítimo de la autoridad política? ¿Por qué obedecemos leyes coercitivas? ¿Qué es una sociedad justa?

---



## 4. CUADRO COMPARATIVO SISTEMATIZADO

| Disciplina Filosófica | Objeto Principal | Pregunta Clave de Admisión | Ejemplo de Problema de Examen |
| :--- | :--- | :--- | :--- |
| **Ontología** | El ser y los entes | ¿Qué es lo real y qué constituye la sustancia del universo? | El problema de si la materia o el espíritu es el principio primero. |
| **Gnoseología** | Conocimiento general | ¿Es posible aprehender la verdad objetiva de las cosas? | El escepticismo radical de Pirrón vs. el dogmatismo racionalista. |
| **Epistemología** | Conocimiento científico | ¿Cómo se valida una hipótesis científica y qué la demarca? | El criterio de falsabilidad de Karl Popper frente a los enunciados metafísicos. |
| **Ética** | La moral y el bien | ¿Qué fundamenta la rectitud de una acción humana? | El dilema del tranvía: consecuencialismo utilitarista vs. deber kantiano. |
| **Axiología** | Los valores | ¿El valor reside en el sujeto estimador o en el objeto estimado? | Si un cuadro renacentista vale por su técnica o por el aprecio del espectador. |
| **Estética** | Belleza y arte | ¿Qué categorías definen el goce y la experiencia de lo sublime? | Distinguir entre lo bello, lo trágico y lo grotesco en una pintura. |
| **Antropología Fil.** | La esencia humana | ¿Cuál es la condición intrínseca que define al ser humano? | El hombre como animal racional (Aristóteles) vs. "animal simbólico" (Cassirer). |
| **Filosofía Política** | Estado y justicia | ¿Cuál es la legitimidad del pacto social y la coerción estatal? | El Estado de naturaleza en Thomas Hobbes frente al contrato social de Rousseau. |

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia para las Ramas Nucleares:
> **"ON-GNO-EPIS-E-AX-ES-AN-POL"**
- **ON**: Ontología (Ser)
- **GNO**: Gnoseología (Conocer general)
- **EPIS**: Epistemología (Ciencia)
- **E**: Ética (Bien y moral)
- **AX**: Axiología (Valor)
- **ES**: Estética (Belleza y arte)
- **AN**: Antropología (Hombre)
- **POL**: Filosofía Política (Estado y justicia)



### Regla de Oro para Evitar Confusiones:
> *"Si habla de la **verdad general** o de la **percepción humana** es **GNOSEOLOGÍA**; si habla de **método científico, hipótesis, leyes y teorías**, es **EPISTEMOLOGÍA**."*

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Gnoseología vs. Epistemología**: En el mundo anglosajón, a veces usan "epistemology" para referirse a la teoría general del conocimiento. Sin embargo, en el sistema preuniversitario peruano (UNSA, UNMSM, UNI), la separación es **tajante**:
   - **Gnoseología**: Origen, esencia y posibilidad del conocimiento general (Hume, Descartes, Kant en la *Crítica de la Razón Pura*).
   - **Epistemología**: Validez de enunciados científicos, falsación, revoluciones científicas, método hipotético-deductivo (Popper, Kuhn, Bunge, Lakatos).
2. **La trampa Ética vs. Axiología**:
   - Si la pregunta indaga por el **Bien moral**, el deber o la culpabilidad \rightarrow **Ética**.
   - Si analiza el acto de **preferir, valorar, la polaridad o jerarquía de valores** en general \rightarrow **Axiología**.
3. **La trampa Ontología vs. Antropología Filosófica**: Si el texto habla del ser en general es Ontología; si se centra exclusivamente en la peculiaridad del ser humano (su libertad existencial, su finitud, su dimensión espiritual) es Antropología Filosófica.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 1: Básico / Definición Directa
**Enunciado**: El científico peruano Pedro Paulet diseñó motores de propulsión y formuló principios sobre el cohete espacial. Si un filósofo examina si los principios de Paulet cumplen con la contrastación experimental y la coherencia lógica interna dentro de la física contemporánea, este filósofo está realizando una labor perteneciente a la:
A) Axiología  
B) Gnoseología  
C) Antropología filosófica  
D) Epistemología  
E) Estética  

- **Resolución**: El problema alude a la contrastación, coherencia y estatus científico de hipótesis y principios en una disciplina específica (física espacial). El estudio de las leyes, teorías, métodos y validación del conocimiento científico corresponde a la **Epistemología**.
- **Clave Correcta**: **D**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: En un debate televisivo, un médico afirma: *"Debemos desconectar al paciente en coma irreversible porque mantenerlo con vida artificialmente solo prolonga el dolor familiar y no genera ningún bienestar ni utilidad para nadie"*. Por su parte, un teólogo responde: *"La vida humana es sagrada en sí misma; ningún cálculo de utilidad puede subordinar el deber categórico de preservar la existencia"*. La controversia entre ambas posturas se ubica en el terreno de la:
A) Epistemología  
B) Lógica proposicional  
C) Ética  
D) Ontología  
E) Estética  

- **Resolución**: Ambas posturas debaten sobre la rectitud del obrar humano, la noción de deber frente a la noción de utilidad (utilitarismo de Bentham/Mill vs. deontología kantiana), aplicadas a la toma de decisiones sobre la vida y la muerte. Por tanto, es un dilema de fundamentación de normas morales, propio de la **Ética**.
- **Clave Correcta**: **C**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento:
> *"La pregunta acerca de si al pensamiento humano se le puede atribuir una verdad objetiva no es un problema teórico, sino un problema práctico. Es en la práctica donde el hombre tiene que demostrar la verdad, es decir, la realidad y el poderío, la terrenalidad de su pensamiento. El litigio sobre la realidad o irrealidad de un pensamiento aislado de la práctica es un problema puramente escolástico"*. (Karl Marx, *Tesis sobre Feuerbach*).

A partir del texto citado, se infiere que la reflexión de Marx está dirigida primariamente a discutir un problema de índole:
A) Estética, porque define el carácter sensible de la contemplación del arte.  
B) Gnoseológica, puesto que aborda el criterio para determinar la verdad objetiva del conocimiento humano.  
C) Epistemológica estricta, pues evalúa la formalización sintáctica de las matemáticas y la física cuántica.  
D) Ontológica regional, ya que establece la taxonomía de los entes abstractos.  
E) Axiológica subjetivista, dado que postula la indiferencia de los valores en la economía política.  

- **Resolución**: El texto se interroga explícitamente sobre *"si al pensamiento humano se le puede atribuir una verdad objetiva"* y cómo se valida la verdad frente al escepticismo o idealismo. El problema de la verdad, su criterio de contrastación y la relación entre pensamiento y realidad en términos universales pertenece por definición a la **Gnoseología**.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Suponga que un grupo de neurocientíficos publica un artículo donde sostienen que la "conciencia" humana es simplemente la activación de patrones electroquímicos sinápticos en la corteza cerebral, concluyendo que el alma, la voluntad libre y el yo son meras ilusiones biocelulares. Si un pensador objeta que dicha conclusión incurre en un reduccionismo categorial que desnaturaliza la dimensión simbólica, la autotrascendencia y la responsabilidad existencial del ser humano, el centro neurálgico de la objeción se inscribe en la intersección entre:
A) La estética de la recepción y la lógica polivalente.  
B) La filosofía política contractualista y la gnoseología empírica.  
C) La antropología filosófica y la ontología de la mente.  
D) La axiología económica y la cosmología presocrática.  
E) La bioética clínica y el formalismo gnoseológico exclusivamente.  

- **Resolución**: El debate central gira en torno a:
  1. La naturaleza y esencia ontológica de la mente (¿es la mente idéntica a la materia cerebral o posee un estatus de ser irreductible? \rightarrow Ontología de la mente).
  2. La definición esencial del ser humano: si es un mero autómata biológico determinado o un agente con libertad existencial y facultad simbólica \rightarrow Antropología Filosófica.
  Por consiguiente, la objeción toca de lleno la **antropología filosófica y la ontología**.
- **Clave Correcta**: **C**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Ente**: Todo aquello que es, existe o posee algún tipo de realidad (física, ideal o psíquica), en contraposición a la "nada".
2. **Sustancia**: Aquello que existe en sí y por sí, y que sirve de sustrato o soporte a los accidentes y cambios.
3. **Sujeto Cognoscente**: El agente consciente que aprehende conceptualmente las propiedades del objeto.
4. **Objeto Cognoscible**: La realidad o fenómeno susceptible de ser representado y comprendido por el sujeto.
5. **Demarcación Científica**: Criterio epistemológico para delimitar las proposiciones científicas de las pseudocientíficas o metafísicas.
6. **Falsabilidad**: Principio de Karl Popper según el cual una hipótesis es científica si y solo si es susceptible de ser refutada mediante observaciones o experimentos empíricos.
7. **Deontología**: Rama de la ética que fundamenta la corrección del obrar humano en el cumplimiento incondicional del deber moral y no en las consecuencias.
8. **Juicio de Hecho**: Proposición descriptiva que afirma o niega una propiedad real de las cosas sin valorarlas (ej. *"El agua hierve a 100 °C"*).
9. **Juicio de Valor**: Proposición estimativa que califica a un objeto según una norma o preferencia subjetiva/objetiva (ej. *"La traición es execrable"*).
10. **Animal Simbólico**: Definición del ser humano acuñada por Ernst Cassirer que postula que el hombre no vive solo en un universo físico, sino en un universo de símbolos (lenguaje, mito, arte, religión).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Gnoseología y Epistemología?
  - *Reverso*: La Gnoseología estudia el conocimiento humano general (posibilidad, origen, verdad); la Epistemología estudia rigurosamente el conocimiento científico (método, demarcación, leyes, teorías).

- **Flashcard 2**:
  - *Anverso*: ¿Qué disciplina filosófica reflexiona sobre el fundamento de la legitimidad del Estado y el monopolio de la violencia?
  - *Reverso*: La Filosofía Política.

- **Flashcard 3**:
  - *Anverso*: Si nos preguntamos si la justicia es una idea eterna o un constructo social mutable, ¿qué ramas están primordialmente involucradas?
  - *Reverso*: La Axiología (por la naturaleza del valor justicia), la Ética y la Filosofía Política.

- **Flashcard 4**:
  - *Anverso*: ¿Qué disciplina analiza las condiciones formales que garantizan que una conclusión se derive necesariamente de sus premisas?
  - *Reverso*: La Lógica.

---



### Nivel 2: Intermedio / Correlación Conceptual
**Enunciado**: Relacione la pregunta filosófica con la disciplina que le corresponde:
I. ¿El valor de una joya depende de su escasez objetiva o del deseo que despierta en el comprador?
II. ¿Por qué el Estado tiene la potestad de restringir libertades individuales mediante leyes?
III. ¿Qué hace que una escultura hiperrealista genere una sensación de repulsión o de agrado sublime?
IV. ¿Es posible tener una certeza absoluta sobre la existencia del mundo exterior o solo conocemos representaciones?

a. Filosofía Política  
b. Axiología  
c. Gnoseología  
d. Estética  

A) Ib, IIa, IIId, IVc  
B) Ia, IIb, IIIc, IVd  
C) Ic, IIa, IIIb, IVd  
D) Ib, IId, IIIa, IVc  
E) Id, IIb, IIIa, IVc  

- **Resolución**:
  - I: Polaridad / debate subjetivismo vs. objetivismo axiológico \rightarrow Axiología (b).
  - II: Legitimidad del poder coercitivo del Estado \rightarrow Filosofía Política (a).
  - III: Percepción de lo sublime, agrado o repulsión en el arte \rightarrow Estética (d).
  - IV: Posibilidad del conocimiento y certeza del mundo exterior \rightarrow Gnoseología (c).
  - Secuencia: Ib, IIa, IIId, IVc.
- **Clave Correcta**: **A**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t02_s01_c01",
                    question = "La disciplina filosófica que tiene por objeto central el estudio del 'ser' en cuanto ser, sus propiedades fundamentales, categorías y causas primordiales se denomina:",
                    options = listOf(
                        "Axiología.",
                        "Ontología (o Metafísica).",
                        "Gnoseología.",
                        "Epistemología.",
                    ),
                    correctIndex = 1,
                    explanation = "La Ontología (término derivado de onto = ser, ente, y logos = estudio) estudia la estructura fundamental de la realidad, la esencia del ser y la existencia en su sentido más universal."
                ),
                Challenge(
                    id = "filo_t02_s01_c02",
                    question = "Frente a la interrogante '¿Es el conocimiento humano objetivo o está irremediablemente condicionado por nuestras sensaciones subjetivas?', la rama de la filosofía encargada de responderla es la:",
                    options = listOf(
                        "Estética.",
                        "Gnoseología (o Teoría del Conocimiento).",
                        "Deontología profesional.",
                        "Antropología biológica.",
                    ),
                    correctIndex = 1,
                    explanation = "La Gnoseología investiga el origen, la posibilidad, la esencia y los límites del conocimiento humano en general."
                ),
                Challenge(
                    id = "filo_t02_s01_c03",
                    question = "La distinción rigurosa entre Gnoseología y Epistemología estriba en que:",
                    options = listOf(
                        "La Gnoseología se ocupa de los valores morales y la Epistemología de la lógica simbólica.",
                        "La Gnoseología estudia el conocimiento humano general y la Epistemología se especializa en los fundamentos y validez del conocimiento científico.",
                        "La Gnoseología se limita a la lingüística empírica mientras que la Epistemología estudia la teología revelada.",
                        "Ambas disciplinas son idénticas y no guardan ninguna diferencia conceptual ni metodológica.",
                    ),
                    correctIndex = 1,
                    explanation = "Mientras la Gnoseología aborda el conocimiento humano en general (sujeto-objeto, posibilidad, origen), la Epistemología (filosofía de la ciencia) examina específicamente la estructura, métodos y validez de las teorías científicas."
                ),
                Challenge(
                    id = "filo_t02_s01_c04",
                    question = "Si un filósofo formula la siguiente tesis: 'Las leyes de la física son formulaciones probabilísticas que describen regularidades de hechos empíricos contrastables', está desarrollando un problema perteneciente a la:",
                    options = listOf(
                        "Epistemología.",
                        "Ontología formal.",
                        "Axiología jurídica.",
                        "Teleología teológica.",
                    ),
                    correctIndex = 0,
                    explanation = "Analizar el estatus lógico, el método de contrastación y el alcance de las leyes físicas constituye una tarea central de la Epistemología o Filosofía de la Ciencia."
                ),
                Challenge(
                    id = "filo_t02_s01_c05",
                    question = "¿Cuál de las siguientes cuestiones constituye un problema netamente ontológico?",
                    options = listOf(
                        "¿Cuáles son las fuentes empíricas de las representaciones perceptivas?",
                        "¿El fundamento primordial de la realidad es de naturaleza material o espiritual?",
                        "¿Qué criterios demarcan una ciencia empírica de una pseudociencia?",
                        "¿En qué condiciones un acto deliberado puede considerarse moralmente censurable?",
                    ),
                    correctIndex = 1,
                    explanation = "Preguntarse por la naturaleza última y el principio constitutivo de la realidad (materia o espíritu) es el debate ontológico clásico entre materialismo e idealismo."
                ),
                Challenge(
                    id = "filo_t02_s01_c06",
                    question = "Aristóteles denominó a la Ontología como 'Filosofía Primera' debido a que:",
                    options = listOf(
                        "Es la primera materia que deben cursar los estudiantes de educación secundaria.",
                        "Consiste en un conjunto de leyes astronómicas sobre el primer planeta del sistema solar.",
                        "Indaga las primeras causas y los principios universales de todo lo que existe, siendo anterior y superior a las ciencias particulares.",
                        "Fue inventada por el primer hombre que habitó la faz de la Tierra.",
                    ),
                    correctIndex = 2,
                    explanation = "Para Aristóteles, la Filosofía Primera investiga las causas primeras y los principios más universales del ser en tanto que ser, fundamentando a todas las demás ciencias."
                ),
                Challenge(
                    id = "filo_t02_s01_c07",
                    question = "La cuestión sobre si el conocimiento se origina primariamente en la experiencia sensorial o en las estructuras innatas de la razón humana concierne a la:",
                    options = listOf(
                        "Sociología del derecho.",
                        "Lógica deóntica.",
                        "Gnoseología.",
                        "Estética.",
                    ),
                    correctIndex = 2,
                    explanation = "El debate gnoseológico sobre el origen del conocimiento confronta históricamente al Racionalismo (la razón) y al Empirismo (la experiencia sensible)."
                ),
                Challenge(
                    id = "filo_t02_s01_c08",
                    question = "El estudio de la noción de 'paradigma científico' y de cómo operan las revoluciones teóricas en la historia de la ciencia fue planteado por Thomas Kuhn en el campo de la:",
                    options = listOf(
                        "Ética eudemonista.",
                        "Ontología presocrática.",
                        "Axiología personalista.",
                        "Epistemología.",
                    ),
                    correctIndex = 3,
                    explanation = "La noción kuhniana de paradigmas y cambios revolucionarios en la investigación científica es uno de los tópicos cumbres de la Epistemología contemporánea."
                ),
                Challenge(
                    id = "filo_t02_s01_c09",
                    question = "La pregunta '¿Qué es la sustancia y de qué modo subsisten los accidentes en las cosas particulares?' es un problema propio de la:",
                    options = listOf(
                        "Ética teleológica.",
                        "Gnoseología crítica.",
                        "Filosofía política.",
                        "Metafísica u Ontología.",
                    ),
                    correctIndex = 3,
                    explanation = "La relación entre sustancia (lo que permanece y subyace) y accidentes (cualidades variables) es una categoría esencial de la metafísica ontológica aristotélica."
                ),
                Challenge(
                    id = "filo_t02_s01_c10",
                    question = "Cuando un investigador se pregunta '¿Cuál es el criterio de contrastabilidad empírica que permite refutar una hipótesis científica?', está abordando un problema:",
                    options = listOf(
                        "Epistemológico.",
                        "Axiológico.",
                        "Antropológico.",
                        "Estético.",
                    ),
                    correctIndex = 0,
                    explanation = "El criterio de contrastabilidad empírica y refutabilidad (como el falsacionismo de Popper) es una cuestión central de la metodología y la epistemología."
                ),
            )
        ),
        LessonNode(
            id = "filo_t02_s02",
            subjectId = "filosofia",
            semana = 2,
            subtema = "2.2",
            title = "D. Lógica",
            theory = LessonTheory(
                content = """# TEMA 02: DISCIPLINAS FILOSÓFICAS

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE DISCIPLINAS

```
                                  CAMPOS DEL SABER FILOSÓFICO
                                                │
         ┌──────────────────┬───────────────────┼───────────────────┬──────────────────┐
         ▼                  ▼                   ▼                   ▼                  ▼
    DEL SER            DEL CONOCER          DEL OBRAR          DEL VALOR          DEL HOMBRE
  (Metafísica y       (Gnoseología y      (Ética y Fil.      (Axiología y        (Antropología
   Ontología)         Epistemología)        Política)          Estética)          Filosófica)
         │                  │                   │                   │                  │
• ¿Qué es el ser?    • ¿Qué es la       • ¿Qué es el bien?  • ¿Qué es el        • ¿Cuál es la
• ¿Cuál es el          verdad?          • ¿Qué es la          valor?              naturaleza o
  origen y           • ¿Qué es la         justicia?         • ¿Qué es la          esencia del
  estructura           ciencia?         • ¿Qué es el          belleza?            ser humano?
  de lo real?        • ¿Cómo se valida?   deber?            • Juicios estéticos • ¿Tiene sentido
                                                              y artísticos.       la existencia?
```

---



### B. Gnoseología o Teoría del Conocimiento
- **Etimología**: Del griego \gamma\nu\tilde{\omega}\sigma\iota\varsigma (*gnosis*, "conocimiento general") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: El conocimiento humano en su dimensión más general y universal: origen, posibilidad, esencia, límites y naturaleza de la verdad.
- **Diferenciación Crítica**: No analiza cómo conoce un sujeto particular psicológicamente ni el rigor de teorías científicas específicas, sino la relación entre **Sujeto cognoscente** y **Objeto cognoscible**.
- **Preguntas Fundamentales**: ¿Es posible conocer la realidad objetiva? ¿Cuál es la fuente primaria del saber: la razón (*racionalismo*) o los sentidos (*empirismo*)? ¿Qué es la verdad?



### D. Lógica
- **Etimología**: Del griego \lambda\acute{o}\gamma\mathrm{os} (*logos*, "razón, palabra, discurso").
- **Objeto de Estudio**: Las leyes, formas y estructuras del **pensamiento inferencial válido**, la deducción y la demostración formal.
- **Preguntas Fundamentales**: ¿Cuándo una inferencia es formalmente válida? ¿Cuáles son las leyes lógicas supremas?



### E. Ética o Filosofía Moral
- **Etimología**: Del griego \tilde{\eta}\theta\mathrm{os} (*ethos*, "carácter, morada, hábito").
- **Objeto de Estudio**: La **moral**, la fundamentación de las normas del obrar humano, la libertad, el deber, la responsabilidad y las concepciones del Bien y la Vida Buena.
- **Preguntas Fundamentales**: ¿Qué es el Bien? ¿Por qué debemos actuar según el deber? ¿Es la libertad una condición indispensable para la imputabilidad moral?



### F. Axiología o Teoría del Valor
- **Etimología**: Del griego \hat{\alpha}\xi\iota\mathrm{os} (*axios*, "valioso, estimable") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: La naturaleza de los **valores** (éticos, estéticos, económicos, religiosos), sus propiedades (polaridad, jerarquía) y el acto valorativo humano.
- **Preguntas Fundamentales**: ¿Las cosas valen porque las deseamos (*subjetivismo axiológico*) o las deseamos porque son valiosas en sí mismas (*objetivismo axiológico*)?



### G. Estética y Filosofía del Arte
- **Etimología**: Del griego \alpha\hat{\imath}\sigma\theta\eta\sigma\iota\varsigma (*aísthesis*, "sensación, percepción sensible"). Término introducido por Alexander Baumgarten en 1750.
- **Objeto de Estudio**: La experiencia estética, los juicios sobre lo sensible, la naturaleza de la belleza y la creación/recepción de la obra de arte.
- **Preguntas Fundamentales**: ¿Qué hace que una obra sea bella? ¿Es la belleza una cualidad intrínseca o una experiencia subjetiva?



### H. Antropología Filosófica
- **Etimología**: Del griego \hat{\alpha}\nu\theta\rho\omega\pi\mathrm{os} (*ánthropos*, "hombre, ser humano") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: La esencia, sentido, origen y destino del **ser humano** en el cosmos.
- **Preguntas Fundamentales**: ¿Qué es el hombre? ¿Es un animal biológico, un espíritu encarnado, un ser histórico o un creador de símbolos?



### I. Filosofía Política
- **Etimología**: Del griego \pi\acute{o}\lambda\iota\varsigma (*polis*, "ciudad-estado").
- **Objeto de Estudio**: El poder político, el Estado, la legitimidad, la soberanía, la justicia distributiva y la organización de la sociedad civil.
- **Preguntas Fundamentales**: ¿Cuál es el fundamento legítimo de la autoridad política? ¿Por qué obedecemos leyes coercitivas? ¿Qué es una sociedad justa?

---



## 4. CUADRO COMPARATIVO SISTEMATIZADO

| Disciplina Filosófica | Objeto Principal | Pregunta Clave de Admisión | Ejemplo de Problema de Examen |
| :--- | :--- | :--- | :--- |
| **Ontología** | El ser y los entes | ¿Qué es lo real y qué constituye la sustancia del universo? | El problema de si la materia o el espíritu es el principio primero. |
| **Gnoseología** | Conocimiento general | ¿Es posible aprehender la verdad objetiva de las cosas? | El escepticismo radical de Pirrón vs. el dogmatismo racionalista. |
| **Epistemología** | Conocimiento científico | ¿Cómo se valida una hipótesis científica y qué la demarca? | El criterio de falsabilidad de Karl Popper frente a los enunciados metafísicos. |
| **Ética** | La moral y el bien | ¿Qué fundamenta la rectitud de una acción humana? | El dilema del tranvía: consecuencialismo utilitarista vs. deber kantiano. |
| **Axiología** | Los valores | ¿El valor reside en el sujeto estimador o en el objeto estimado? | Si un cuadro renacentista vale por su técnica o por el aprecio del espectador. |
| **Estética** | Belleza y arte | ¿Qué categorías definen el goce y la experiencia de lo sublime? | Distinguir entre lo bello, lo trágico y lo grotesco en una pintura. |
| **Antropología Fil.** | La esencia humana | ¿Cuál es la condición intrínseca que define al ser humano? | El hombre como animal racional (Aristóteles) vs. "animal simbólico" (Cassirer). |
| **Filosofía Política** | Estado y justicia | ¿Cuál es la legitimidad del pacto social y la coerción estatal? | El Estado de naturaleza en Thomas Hobbes frente al contrato social de Rousseau. |

---



### Nemotecnia para las Ramas Nucleares:
> **"ON-GNO-EPIS-E-AX-ES-AN-POL"**
- **ON**: Ontología (Ser)
- **GNO**: Gnoseología (Conocer general)
- **EPIS**: Epistemología (Ciencia)
- **E**: Ética (Bien y moral)
- **AX**: Axiología (Valor)
- **ES**: Estética (Belleza y arte)
- **AN**: Antropología (Hombre)
- **POL**: Filosofía Política (Estado y justicia)



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Gnoseología vs. Epistemología**: En el mundo anglosajón, a veces usan "epistemology" para referirse a la teoría general del conocimiento. Sin embargo, en el sistema preuniversitario peruano (UNSA, UNMSM, UNI), la separación es **tajante**:
   - **Gnoseología**: Origen, esencia y posibilidad del conocimiento general (Hume, Descartes, Kant en la *Crítica de la Razón Pura*).
   - **Epistemología**: Validez de enunciados científicos, falsación, revoluciones científicas, método hipotético-deductivo (Popper, Kuhn, Bunge, Lakatos).
2. **La trampa Ética vs. Axiología**:
   - Si la pregunta indaga por el **Bien moral**, el deber o la culpabilidad \rightarrow **Ética**.
   - Si analiza el acto de **preferir, valorar, la polaridad o jerarquía de valores** en general \rightarrow **Axiología**.
3. **La trampa Ontología vs. Antropología Filosófica**: Si el texto habla del ser en general es Ontología; si se centra exclusivamente en la peculiaridad del ser humano (su libertad existencial, su finitud, su dimensión espiritual) es Antropología Filosófica.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: El científico peruano Pedro Paulet diseñó motores de propulsión y formuló principios sobre el cohete espacial. Si un filósofo examina si los principios de Paulet cumplen con la contrastación experimental y la coherencia lógica interna dentro de la física contemporánea, este filósofo está realizando una labor perteneciente a la:
A) Axiología  
B) Gnoseología  
C) Antropología filosófica  
D) Epistemología  
E) Estética  

- **Resolución**: El problema alude a la contrastación, coherencia y estatus científico de hipótesis y principios en una disciplina específica (física espacial). El estudio de las leyes, teorías, métodos y validación del conocimiento científico corresponde a la **Epistemología**.
- **Clave Correcta**: **D**

---



### Nivel 2: Intermedio / Correlación Conceptual
**Enunciado**: Relacione la pregunta filosófica con la disciplina que le corresponde:
I. ¿El valor de una joya depende de su escasez objetiva o del deseo que despierta en el comprador?
II. ¿Por qué el Estado tiene la potestad de restringir libertades individuales mediante leyes?
III. ¿Qué hace que una escultura hiperrealista genere una sensación de repulsión o de agrado sublime?
IV. ¿Es posible tener una certeza absoluta sobre la existencia del mundo exterior o solo conocemos representaciones?

a. Filosofía Política  
b. Axiología  
c. Gnoseología  
d. Estética  

A) Ib, IIa, IIId, IVc  
B) Ia, IIb, IIIc, IVd  
C) Ic, IIa, IIIb, IVd  
D) Ib, IId, IIIa, IVc  
E) Id, IIb, IIIa, IVc  

- **Resolución**:
  - I: Polaridad / debate subjetivismo vs. objetivismo axiológico \rightarrow Axiología (b).
  - II: Legitimidad del poder coercitivo del Estado \rightarrow Filosofía Política (a).
  - III: Percepción de lo sublime, agrado o repulsión en el arte \rightarrow Estética (d).
  - IV: Posibilidad del conocimiento y certeza del mundo exterior \rightarrow Gnoseología (c).
  - Secuencia: Ib, IIa, IIId, IVc.
- **Clave Correcta**: **A**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: En un debate televisivo, un médico afirma: *"Debemos desconectar al paciente en coma irreversible porque mantenerlo con vida artificialmente solo prolonga el dolor familiar y no genera ningún bienestar ni utilidad para nadie"*. Por su parte, un teólogo responde: *"La vida humana es sagrada en sí misma; ningún cálculo de utilidad puede subordinar el deber categórico de preservar la existencia"*. La controversia entre ambas posturas se ubica en el terreno de la:
A) Epistemología  
B) Lógica proposicional  
C) Ética  
D) Ontología  
E) Estética  

- **Resolución**: Ambas posturas debaten sobre la rectitud del obrar humano, la noción de deber frente a la noción de utilidad (utilitarismo de Bentham/Mill vs. deontología kantiana), aplicadas a la toma de decisiones sobre la vida y la muerte. Por tanto, es un dilema de fundamentación de normas morales, propio de la **Ética**.
- **Clave Correcta**: **C**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento:
> *"La pregunta acerca de si al pensamiento humano se le puede atribuir una verdad objetiva no es un problema teórico, sino un problema práctico. Es en la práctica donde el hombre tiene que demostrar la verdad, es decir, la realidad y el poderío, la terrenalidad de su pensamiento. El litigio sobre la realidad o irrealidad de un pensamiento aislado de la práctica es un problema puramente escolástico"*. (Karl Marx, *Tesis sobre Feuerbach*).

A partir del texto citado, se infiere que la reflexión de Marx está dirigida primariamente a discutir un problema de índole:
A) Estética, porque define el carácter sensible de la contemplación del arte.  
B) Gnoseológica, puesto que aborda el criterio para determinar la verdad objetiva del conocimiento humano.  
C) Epistemológica estricta, pues evalúa la formalización sintáctica de las matemáticas y la física cuántica.  
D) Ontológica regional, ya que establece la taxonomía de los entes abstractos.  
E) Axiológica subjetivista, dado que postula la indiferencia de los valores en la economía política.  

- **Resolución**: El texto se interroga explícitamente sobre *"si al pensamiento humano se le puede atribuir una verdad objetiva"* y cómo se valida la verdad frente al escepticismo o idealismo. El problema de la verdad, su criterio de contrastación y la relación entre pensamiento y realidad en términos universales pertenece por definición a la **Gnoseología**.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Suponga que un grupo de neurocientíficos publica un artículo donde sostienen que la "conciencia" humana es simplemente la activación de patrones electroquímicos sinápticos en la corteza cerebral, concluyendo que el alma, la voluntad libre y el yo son meras ilusiones biocelulares. Si un pensador objeta que dicha conclusión incurre en un reduccionismo categorial que desnaturaliza la dimensión simbólica, la autotrascendencia y la responsabilidad existencial del ser humano, el centro neurálgico de la objeción se inscribe en la intersección entre:
A) La estética de la recepción y la lógica polivalente.  
B) La filosofía política contractualista y la gnoseología empírica.  
C) La antropología filosófica y la ontología de la mente.  
D) La axiología económica y la cosmología presocrática.  
E) La bioética clínica y el formalismo gnoseológico exclusivamente.  

- **Resolución**: El debate central gira en torno a:
  1. La naturaleza y esencia ontológica de la mente (¿es la mente idéntica a la materia cerebral o posee un estatus de ser irreductible? \rightarrow Ontología de la mente).
  2. La definición esencial del ser humano: si es un mero autómata biológico determinado o un agente con libertad existencial y facultad simbólica \rightarrow Antropología Filosófica.
  Por consiguiente, la objeción toca de lleno la **antropología filosófica y la ontología**.
- **Clave Correcta**: **C**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Ente**: Todo aquello que es, existe o posee algún tipo de realidad (física, ideal o psíquica), en contraposición a la "nada".
2. **Sustancia**: Aquello que existe en sí y por sí, y que sirve de sustrato o soporte a los accidentes y cambios.
3. **Sujeto Cognoscente**: El agente consciente que aprehende conceptualmente las propiedades del objeto.
4. **Objeto Cognoscible**: La realidad o fenómeno susceptible de ser representado y comprendido por el sujeto.
5. **Demarcación Científica**: Criterio epistemológico para delimitar las proposiciones científicas de las pseudocientíficas o metafísicas.
6. **Falsabilidad**: Principio de Karl Popper según el cual una hipótesis es científica si y solo si es susceptible de ser refutada mediante observaciones o experimentos empíricos.
7. **Deontología**: Rama de la ética que fundamenta la corrección del obrar humano en el cumplimiento incondicional del deber moral y no en las consecuencias.
8. **Juicio de Hecho**: Proposición descriptiva que afirma o niega una propiedad real de las cosas sin valorarlas (ej. *"El agua hierve a 100 °C"*).
9. **Juicio de Valor**: Proposición estimativa que califica a un objeto según una norma o preferencia subjetiva/objetiva (ej. *"La traición es execrable"*).
10. **Animal Simbólico**: Definición del ser humano acuñada por Ernst Cassirer que postula que el hombre no vive solo en un universo físico, sino en un universo de símbolos (lenguaje, mito, arte, religión).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Gnoseología y Epistemología?
  - *Reverso*: La Gnoseología estudia el conocimiento humano general (posibilidad, origen, verdad); la Epistemología estudia rigurosamente el conocimiento científico (método, demarcación, leyes, teorías).

- **Flashcard 2**:
  - *Anverso*: ¿Qué disciplina filosófica reflexiona sobre el fundamento de la legitimidad del Estado y el monopolio de la violencia?
  - *Reverso*: La Filosofía Política.

- **Flashcard 3**:
  - *Anverso*: Si nos preguntamos si la justicia es una idea eterna o un constructo social mutable, ¿qué ramas están primordialmente involucradas?
  - *Reverso*: La Axiología (por la naturaleza del valor justicia), la Ética y la Filosofía Política.

- **Flashcard 4**:
  - *Anverso*: ¿Qué disciplina analiza las condiciones formales que garantizan que una conclusión se derive necesariamente de sus premisas?
  - *Reverso*: La Lógica.

---



### C. Epistemología o Filosofía de la Ciencia
- **Etimología**: Del griego \acute{\epsilon}\pi\iota\sigma\tau\acute{\eta}\mu\eta (*episteme*, "saber fundado, ciencia") y \lambda\acute{o}\gamma\mathrm{os}.
- **Objeto de Estudio**: El **conocimiento científico**, su estructura lógica, fundamentación, métodos de validación, demarcación (criterios para distinguir ciencia de pseudociencia) y dinámica histórica de las teorías científicas.
- **Preguntas Fundamentales**: ¿Qué criterio demarca lo que es ciencia? ¿Son las teorías científicas verdaderas o solo modelos instrumentales? ¿Cómo progresan las ciencias?



### A. Metafísica y Ontología
- **Etimología**: 
  - *Metafísica*: Del griego \mu\epsilon\tau\alpha ́ (*metá*, "más allá") y \phi\upsilon\sigma\iota\kappa\alpha ́ (*physiká*, "lo físico/natural"). Término acuñado por Andrónico de Rodas al ordenar las obras de Aristóteles.
  - *Ontología*: Del griego \hat{o}\nu, \hat{o}\nu\tau\mathrm{os} (*on, ontos*, "el ser") y \lambda\acute{o}\gamma\mathrm{os} (*logos*, "estudio/tratado"). Acuñado en el siglo XVII (Johannes Clauberg y Christian Wolff).
- **Objeto de Estudio**: El **ente en cuanto ente** (el ser de las cosas), sus principios primeros, sus causas universales y su estructura fundamental.
- **Preguntas Fundamentales**: ¿Qué existe? ¿Por qué existe algo en lugar de nada? ¿Qué es el ser? ¿Cuál es la sustancia última de la realidad?"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t02_s02_c01",
                    question = "La disciplina filosófica que estudia el fundamento, la naturaleza, la jerarquía y la polaridad de los valores (lo bueno, lo bello, lo justo, lo útil) se denomina:",
                    options = listOf(
                        "Ontología.",
                        "Axiología.",
                        "Antropología Filosófica.",
                        "Gnoseología.",
                    ),
                    correctIndex = 1,
                    explanation = "La Axiología (del griego axios = valioso, digno, y logos = estudio) es la rama filosófica dedicada a la teoría general de los valores y el juicio de valor."
                ),
                Challenge(
                    id = "filo_t02_s02_c02",
                    question = "La Ética se define formalmente como la disciplina filosófica que tiene por objeto reflexivo:",
                    options = listOf(
                        "La fundamentación teórica, racional y crítica de la moral, el deber, la virtud y la vida buena.",
                        "La catalogación estadística de las leyes penales de los países occidentales.",
                        "El diseño estético de las ceremonias religiosas tradicionales.",
                        "La descripción biológica de las emociones en los primates superiores.",
                    ),
                    correctIndex = 0,
                    explanation = "La Ética es la filosofía moral: reflexiona críticamente sobre los fundamentos, principios y justificación racional de los sistemas morales y la acción humana."
                ),
                Challenge(
                    id = "filo_t02_s02_c03",
                    question = "La Antropología Filosófica se diferencia de la antropología física o cultural porque su objetivo fundamental es:",
                    options = listOf(
                        "Medir la capacidad craneal de los fósiles de homínidos prehistóricos.",
                        "Determinar los porcentajes genéticos del genoma humano en laboratorios.",
                        "Interrogarse por la esencia, el sentido, la posición en el cosmos y el destino del ser humano.",
                        "Describir la indumentaria típica de las comunidades campesinas andinas.",
                    ),
                    correctIndex = 2,
                    explanation = "A diferencia de las ciencias positivas que estudian aspectos empíricos del hombre, la Antropología Filosófica investiga la esencia profunda del ser humano y su sentido existencial."
                ),
                Challenge(
                    id = "filo_t02_s02_c04",
                    question = "La Lógica se define en el ámbito filosófico como la disciplina formal que estudia:",
                    options = listOf(
                        "Las leyes, principios y métodos que determinan la validez formal de las inferencias o razonamientos deductivos.",
                        "El funcionamiento químico de las neuronas durante el sueño profundo.",
                        "La veracidad empírica de los testimonios históricos antiguos.",
                        "El significado emocional de las palabras poéticas en la literatura lírica.",
                    ),
                    correctIndex = 0,
                    explanation = "La Lógica formal es una ciencia estricta que evalúa la corrección estructural de los razonamientos, prescindiendo del contenido empírico de las proposiciones."
                ),
                Challenge(
                    id = "filo_t02_s02_c05",
                    question = "La disciplina filosófica que reflexiona sobre la belleza, las categorías del arte y la experiencia de contemplación sensible se conoce como:",
                    options = listOf(
                        "Gnoseología.",
                        "Axiología jurídica.",
                        "Semiótica aplicada.",
                        "Estética.",
                    ),
                    correctIndex = 3,
                    explanation = "La Estética reflexiona sobre la naturaleza de la belleza, la experiencia artística, el gusto y las categorías sensibles como lo sublime, lo bello o lo trágico."
                ),
                Challenge(
                    id = "filo_t02_s02_c06",
                    question = "Cuando un pensador examina si el hombre es una criatura libre o si su conducta se halla completamente determinada por la biología y el entorno social, está debatiendo en el terreno de la:",
                    options = listOf(
                        "Antropología Filosófica y la Ética.",
                        "Lógica matemática.",
                        "Estética formal.",
                        "Epistemología positivista.",
                    ),
                    correctIndex = 0,
                    explanation = "El problema de la libertad y el determinismo humano compromete simultáneamente a la Antropología Filosófica (esencia humana) y a la Ética (responsabilidad moral)."
                ),
                Challenge(
                    id = "filo_t02_s02_c07",
                    question = "La pregunta '¿Los valores existen en sí mismos de manera objetiva o son meras proyecciones afectivas del sujeto que valora?' constituye el nudo central de:",
                    options = listOf(
                        "La lógica de predicados.",
                        "La estética naturalista.",
                        "El debate axiológico.",
                        "La ontología cosmológica.",
                    ),
                    correctIndex = 2,
                    explanation = "La controversia entre el objetivismo axiológico (el valor radica en el objeto) y el subjetivismo axiológico (el valor depende del sujeto) es el debate cumbre de la Axiología."
                ),
                Challenge(
                    id = "filo_t02_s02_c08",
                    question = "¿Cuál de las siguientes cuestiones es objeto de estudio de la Filosofía Política?",
                    options = listOf(
                        "¿Cómo se mide el producto bruto interno de una nación industrializada?",
                        "¿Cuáles son las formas de cálculo de intereses bancarios moratorios?",
                        "¿Cuáles son las reglas gramaticales para conjugar verbos irregulares?",
                        "¿Cuál es el fundamento de la legitimidad del poder, el origen del Estado y el concepto de justicia distributiva?",
                    ),
                    correctIndex = 3,
                    explanation = "La Filosofía Política reflexiona normativamente sobre el origen y la legitimidad del Estado, el poder, la autoridad, la libertad civil y la justicia en la sociedad."
                ),
                Challenge(
                    id = "filo_t02_s02_c09",
                    question = "Determinar si una inferencia silogística es formalmente válida o incurre en una falacia lógica estructural es tarea propia de la:",
                    options = listOf(
                        "Ontología.",
                        "Axiología.",
                        "Lógica.",
                        "Antropología cultural.",
                    ),
                    correctIndex = 2,
                    explanation = "La Lógica evalúa si la conclusión de un razonamiento se deriva necesariamente de la estructura de sus premisas mediante reglas válidas de inferencia."
                ),
                Challenge(
                    id = "filo_t02_s02_c10",
                    question = "Si analizamos los dilemas morales relativos al principio de autonomía de los pacientes en terapias intensivas, estamos aplicando conceptos de:",
                    options = listOf(
                        "Metafísica ontológica pura.",
                        "Lógica modal inductiva.",
                        "Estética impresionista.",
                        "Ética (específicamente Bioética).",
                    ),
                    correctIndex = 3,
                    explanation = "La Bioética es una rama de la ética aplicada que estudia los problemas morales surgidos de los avances médicos, la vida y la salud."
                ),
            )
        )
    )
}
