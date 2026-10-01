package filosofia

object FilosofiaSemana06 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t06_s01",
            subjectId = "filosofia",
            semana = 6,
            subtema = "6.1",
            title = "A. Filosofía Antigua (Grecia y Roma)",
            theory = LessonTheory(
                content = """# TEMA 06: LA FILOSOFÍA EN LA HISTORIA

---



## 2. LÍNEA DE TIEMPO Y MAPA HISTÓRICO DE LA FILOSOFÍA

```
  ANTIGUA (s. VI a.C. - V d.C.)        MEDIEVAL (s. V - XV)      MODERNA (s. XVII - XVIII)   CONTEMPORÁNEA (s. XIX - XXI)
┌───────────────────────────────┐  ┌─────────────────────────┐  ┌────────────────────────┐  ┌───────────────────────────┐
│ • Presocráticos (El Arché)    │  │ • Patrística:           │  │ • Racionalismo:        │  │ • Positivismo (Comte)     │
│ • Período Antropológico:      │  │   San Agustín (Fe/Razón)│  │   Descartes, Spinoza   │  │ • Marxismo (Materialismo) │
│   Sócrates vs. Sofistas       │  │ • Escolástica:          │  │ • Empirismo:           │  │ • Vitalismo (Nietzsche)   │
│ • Grandes Sistemas:           │  │   Sto. Tomás (5 Vías)   │  │   Locke, Hume          │  │ • Fenomenología (Husserl) │
│   Platón (Ideas) y            │  │ • Nominalismo:          │  │ • Criticismo: Kant     │  │ • Existencialismo:        │
│   Aristóteles (Causas)        │  │   Guillermo de Ockham   │  │ • Idealismo Dialéctico:│  │   Sartre, Heidegger       │
│ • Helenismo: Estoicos,        │  │                         │  │   Hegel                │  │ • Posmodernidad: Lyotard,  │
│   Epicúreos, Cínicos          │  │                         │  │                        │  │   Foucault, Bauman         │
└───────────────────────────────┘  └─────────────────────────┘  └────────────────────────┘  └───────────────────────────┘
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Filosofía Antigua (Grecia y Roma)
1. **Período Cosmológico o Presocrático (s. VI - V a.C.)**: Indagan el *arché* (principio material/formal constitutivo del universo).
   - **Tales de Mileto**: El **agua** como sustancia primordial.
   - **Anaximandro**: El **ápeiron** (lo indeterminado, ilimitado, infinito).
   - **Anaxímenes**: El **aire** (por rarefacción y condensación).
   - **Pitágoras**: Los **números** y la armonía matemática cósmica.
   - **Heráclito de Éfeso**: El fuego y el **devenir continuo** (*"Todo fluye, nada permanece"*; lucha de contrarios regida por el *Logos*).
   - **Parménides de Elea**: El **Ser es uno, eterno, inmóvil, increado e inmutable**. El cambio y la multiplicidad son meras ilusiones de los sentidos (*"El ser es y el no ser no es"*).
   - **Demócrito y Leucipo**: El **átomo** (partículas indivisibles en el vacío; materialismo mecanicista).
2. **Período Antropológico (s. V a.C.)**: El centro del debate se traslada de la naturaleza a la *polis*, la moral y el lenguaje.
   - **Los Sofistas** (Protágoras, Gorgias): Maestros de retórica para la democracia ateniense. Postulan el **relativismo** (*"El hombre es la medida de todas las cosas"* - Protágoras) y el **escepticismo/nihilismo** (Gorgias: nada existe; si existiera no se podría conocer; si se conociera no se podría comunicar).
   - **Sócrates**: Rechaza el relativismo y el cobro por enseñar. Busca las definiciones universales de las virtudes morales mediante el diálogo:
     - *Ironía*: Conduce al interlocutor a reconocer su propia ignorancia (*"Solo sé que nada sé"*).
     - *Mayéutica* (arte de la partera): Ayuda a dar a luz la verdad que reside en el interior del alma.
     - *Intelectualismo moral*: Quien conoce el bien, actúa virtuosamente; el malvado es simplemente un ignorante.
3. **Período Ontológico o de los Grandes Sistemas (s. IV a.C.)**:
   - **Platón (Idealismo Objetivo)**:
     - *Teoría de los Dos Mundos*: El **Mundo Sensible** (material, corruptible, sombras, copias) y el **Mundo Inteligible o de las Ideas** (inmaterial, perfecto, eterno, real).
     - *Alegoría de la Caverna*: Metáfora del ascenso epistemológico de la ignorancia (*doxa*) al conocimiento del Bien supremo (*episteme*).
     - *Teoría de la Reminiscencia*: Conocer es recordar (*anámnesis*); el alma preexistió en el mundo de las ideas.
     - *La República*: Estado ideal dividido en tres clases según las tres partes del alma: gobernantes-filósofos (alma racional / sabiduría), guardianes (alma irascible / fortaleza) y productores (alma concupiscible / templanza).
   - **Aristóteles (Realismo Clásico / Hilemorfismo)**:
     - Discípulo crítico de Platón: *"Soy amigo de Platón, pero más amigo de la verdad"*. Rechaza la existencia separada del mundo de las ideas.
     - *Teoría Hilemórfica*: Todas las sustancias sensibles están compuestas indisociablemente de **Materia** (*hyle*, sustrato pasivo) y **Forma** (*morphé*, principio determinante que hace que una cosa sea lo que es).
     - *Acto y Potencia*: Explicación metafísica del movimiento. El **acto** (*enérgeia*) es lo que una cosa es en el presente; la **potencia** (*dýnamis*) es su capacidad de transformarse.
     - *Teoría de las Cuatro Causas*:
       1. Causa material (¿de qué está hecho?).
       2. Causa formal (¿qué es? su diseño o esencia).
       3. Causa eficiente (¿quién o qué lo produjo?).
       4. Causa final (¿para qué sirve? el fin o *telos*).
     - *El Motor Inmóvil*: Acto puro sin potencia que mueve al cosmos como causa final por atracción.
     - *Ética Eudemonista*: El fin supremo de la vida humana es la felicidad (*eudaimonía*), alcanzable mediante el ejercicio de la razón y el **justo medio** entre dos extremos viciosos (el exceso y el defecto).
4. **Período Helenístico-Romano (s. III a.C. - II d.C.)**: Énfasis en la ética práctica para alcanzar la tranquilidad individual.
   - **Estoicismo** (Zenón de Citio, Séneca, Epicteto, Marco Aurelio): Vivir en conformidad con el *Logos* universal, aceptar el destino con resignación y dominar las pasiones (*apatheia*).
   - **Epicureísmo** (Epicuro de Samos): El fin de la vida es el placer prudente y moderado (*hedonismo racional*), evitando el dolor del cuerpo y las turbaciones del alma (*ataraxia*). Cuádruple remedio (*Tetrapharmakos*): no temer a los dioses, a la muerte, al dolor ni al fracaso.
   - **Cinismo** (Diógenes de Sínope): Desprecio absoluto por las convenciones sociales, las riquezas y la civilización; retorno radical a la naturaleza animal austera.

---



### B. Filosofía Medieval (s. V - XV)
El problema rector es la **relación entre Fe y Razón** y la subordinación de la filosofía a la teología (*ancilla theologiae*).
1. **La Patrística (s. I - VIII)**: Fijación dogmática del cristianismo con categorías platónicas.
   - **San Agustín de Hipona**:
     - *"Cree para entender y entiende para creer"* (*Crede ut intelligas, intellige ut credas*). Subordina la razón a la fe.
     - *Teoría de la Iluminación*: La mente humana solo puede alcanzar las verdades eternas cuando es iluminada por la gracia de Dios.
     - *La Ciudad de Dios*: Filosofía de la historia que enfrenta la ciudad terrena (el egoísmo y el pecado) con la ciudad celeste (el amor a Dios).
2. **La Escolástica (s. IX - XIV)**: Filosofía enseñada en las escuelas catedralicias y primeras universidades (siglo XIII: Siglo de Oro).
   - **Santo Tomás de Aquino (Aristotelismo cristiano)**:
     - Distingue rigurosamente Fe y Razón: son dos fuentes distintas que proceden de Dios y no pueden contradecirse (armonía). La razón puede demostrar los preámbulos de la fe.
     - *Las Cinco Vías para demostrar la existencia de Dios* (a posteriori):
       1. Por el movimiento (debe existir un Primer Motor Inmóvil).
       2. Por la causa eficiente (debe existir una Primera Causa Incausada).
       3. Por la contingencia (debe existir un Ser Necesario por sí mismo).
       4. Por los grados de perfección (debe existir un Ser Máximamente Perfecto).
       5. Por el orden o finalidad del universo (debe existir una Inteligencia Ordenadora Suprema).
3. **El Ocaso Medieval y la Ruptura Nominalista (s. XIV)**:
   - **Guillermo de Ockham**: Rompe la síntesis tomista. Los conceptos universales no existen en la realidad ni en la mente divina; son meros nombres o signos convencionales (**Nominalismo**).
   - *Navaja de Ockham* (Principio de economía ontológica): *"No deben multiplicarse los entes sin necesidad"*. Abre el camino a la ciencia moderna experimental.

---



### D. Filosofía Contemporánea (s. XIX - XXI)
Ruptura con los grandes sistemas metafísicos; crítica a la razón ilustrada.
1. **Positivismo de Auguste Comte**:
   - La ciencia empírica positiva es el único saber válido. Rechaza toda metafísica.
   - **Ley de los Tres Estados**:
     1. *Estado Teológico o Ficticio*: Explicación por fuerzas divinas o sobrenaturales.
     2. *Estado Metafísico o Abstracto*: Explicación por fuerzas abstractas o esencias ocultas.
     3. *Estado Positivo o Científico*: Renuncia al porqué último y describe las leyes constantes de los fenómenos mediante la observación y experimentación.
2. **Materialismo Histórico y Dialéctico (Karl Marx y Friedrich Engels)**:
   - Invierte la dialéctica de Hegel poniéndola sobre bases materiales.
   - La base material económica (fuerzas productivas y relaciones de producción) o **Infraestructura** determina la **Superestructura** ideológica, jurídica, política y religiosa.
   - La historia de la humanidad es la historia de la **lucha de clases** (amo-esclavo, señor-siervo, burgués-proletario).
3. **Vitalismo y Filosofía de la Sospecha (Friedrich Nietzsche)**:
   - Crítica radical a la tradición socrático-platónica y cristiana por promover una moral de esclavos (resentimiento, renuncia vital).
   - Reivindica lo **Dionisíaco** (la pasión, el desenfreno, el cuerpo, la vida terrena) frente a lo **Apolíneo** (la razón abstracta, el orden, la contención).
   - Proclama la **Muerte de Dios**: el derrumbe de los valores trascendentes metafísicos que da paso al nihilismo.
   - Propone la **Voluntad de Poder**, la transvaloración de todos los valores, el **Eterno Retorno** y la llegada del **Superhombre** (*Übermensch*), creador de sus propios valores afirmativos de la vida terrenal.
4. **Existencialismo**:
   - **Jean-Paul Sartre**: *"La existencia precede a la esencia"*. El ser humano no nace con un propósito predeterminado; se hace a través de sus elecciones. Condenado a ser libre, asumir la angustia existencial y evitar la "mala fe" (autoengaño de culpar a las circunstancias).
   - **Martin Heidegger**: El hombre es el *Dasein* ("ser-ahí"), un ser arrojado al mundo cuya condición ontológica auténtica es ser un **ser-para-la-muerte** (*Sein-zum-Tode*).
5. **Posmodernismo y Crítica Cultural (Segunda mitad del s. XX)**:
   - **Jean-François Lyotard**: Define la condición posmoderna como la **incredulidad ante los metarrelatos** (el fin de las grandes promesas emancipadoras del Iluminismo, el Cristianismo y el Marxismo).
   - **Michel Foucault**: Análisis de la relación saber-poder y las instituciones de disciplinamiento y biopolítica (cárceles, manicomios, escuelas).
   - **Zygmunt Bauman**: Teoría de la **modernidad líquida**, caracterizada por la precariedad de los vínculos humanos, el consumismo fugaz y la disolución de certezas institucionales sólidas.

---



## 4. CUADRO COMPARATIVO: LAS CUATRO GRANDES ÉPOCAS FILOSÓFICAS

| Época Histórica | Período Clave | Problema Central | Paradigma / Tesis Arquetípica | Filósofos Cumbre |
| :--- | :--- | :--- | :--- | :--- |
| **Antigua** | S. VI a.C. - V d.C. | Naturaleza (*Cosmos*), Ser y Hombre en la *Polis*. | Búsqueda del *Arché*, Teoría de las Ideas y el Hilemorfismo. | Presocráticos, Sócrates, Platón, Aristóteles. |
| **Medieval** | S. V - XV d.C. | Dios, Teología y subordinación Fe-Razón. | Armonía o subordinación de la razón a la revelación divina. | San Agustín, Santo Tomás de Aquino, Ockham. |
| **Moderna** | S. XVII - XVIII | Origen, límites y validez del Conocimiento humano. | Giro subjetivo: Racionalismo vs. Empirismo \rightarrow Síntesis Crítica. | Descartes, Locke, Hume, Kant, Hegel. |
| **Contemporánea** | S. XIX - XXI | Sentido existencial, historia, poder y crítica de la razón. | Desmitificación de la metafísica: lucha de clases, voluntad de poder, libertad. | Comte, Marx, Nietzsche, Sartre, Foucault, Bauman. |

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia para los Presocráticos y su Arché:
> **"TAL-AGUA, ANAX-ÁPEIRON, MENES-AIRE, PITA-NÚMERO, HERA-FUEGO, PARME-SER"**
- **Tal**es: Agua
- **Anax**imandro: Ápeiron
- Anaxí**menes**: Aire
- **Pita**goras: Número
- **Hera**clito: Fuego / Devenir
- **Parme**nides: El Ser inmutable



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Platón vs. Aristóteles en las Ideas**:
   - Para Platón, las ideas existen en un mundo trascendente separado (*Topos Uranos*).
   - Para Aristóteles, las ideas (formas) están **dentro de las cosas mismas** en el mundo sensible (inmanencia hilemórfica). Si dicen que Aristóteles aceptó el dualismo ontológico de mundos separados, es **falso**.
2. **La trampa Nietzsche y el Nihilismo**:
   - Nietzsche **no es un nihilista pasivo**. Denuncia el nihilismo de la cultura occidental y propone un **nihilismo activo** para destruir los falsos valores y crear nuevos valores afirmativos con el Superhombre.
3. **Agustín vs. Tomás de Aquino**:
   - San Agustín adopta a **Platón** cristianizado.
   - Santo Tomás de Aquino adopta a **Aristóteles** cristianizado. Si te ponen a Santo Tomás con la reminiscencia platónica o la iluminación, es una trampa directa.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 1: Básico / Identificación Histórica
**Enunciado**: El filósofo de la antigüedad clásica que concibió el mundo sensible como un reflejo o copia imperfecta de un ámbito inmaterial y trascendente denominado el Mundo de las Ideas, exponiendo dicha doctrina en su célebre diálogo *La República*, fue:
A) Aristóteles  
B) Platón  
C) Heráclito  
D) Epicuro  
E) Protágoras  

- **Resolución**: Platón es el artífice del idealismo objetivo clásico y la teoría de los dos mundos (Sensible e Inteligible), plasmando la alegoría de la caverna en el libro VII de *La República*.
- **Clave Correcta**: **B**

---



### Nivel 2: Intermedio / Comprensión Doctrinal
**Enunciado**: Según la teoría de las cuatro causas de Aristóteles, si analizamos una estatua de mármol que representa al dios Apolo esculpida por Fidias para adornar el Partenón, la causa eficiente y la causa final de dicha obra son, respectivamente:
A) El mármol y la forma de Apolo  
B) El templo del Partenón y el cincel  
C) El escultor Fidias y el adorno del Partenón  
D) La forma de Apolo y el escultor Fidias  
E) El mármol y el bloque de piedra bruta  

- **Resolución**:
  - Causa material: El mármol.
  - Causa formal: La figura/idea de Apolo.
  - Causa eficiente: El agente que la produjo \rightarrow El escultor Fidias.
  - Causa final: El propósito o fin para el que se hizo \rightarrow Adornar el Partenón.
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: En un certamen de debate sobre sociología del trabajo, un ponente afirma: *"No son las leyes jurídicas ni las doctrinas religiosas de un país las que crean su prosperidad económica; al contrario, es la forma en que los seres humanos organizan la producción material y la tecnología fabril lo que termina determinando el tipo de leyes, moral y religión de esa sociedad"*. Esta postura se fundamenta directamente en las tesis del:
A) Positivismo de Comte  
B) Materialismo histórico de Karl Marx  
C) Vitalismo trágico de Nietzsche  
D) Racionalismo cartesiano  
E) Idealismo dialéctico de Hegel  

- **Resolución**: La tesis de que la infraestructura económica material condiciona o determina la superestructura política, jurídica e ideológica es el postulado central del **materialismo histórico** formulado por Karl Marx y Friedrich Engels.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: En el siglo XIV, Guillermo de Ockham desencadenó una profunda transformación gnoseológica al postular el nominalismo radical y la célebre "navaja de Ockham". La consecuencia epistemológica más revolucionaria de dicha doctrina para el nacimiento de la ciencia moderna fue:
A) Subordinar los experimentos físicos a la autoridad de los dogmas patrísticos.  
B) Consolidar el realismo metafísico de los universales platónicos en la cosmología tolemaica.  
C) Eliminar la multiplicación innecesaria de esencias metafísicas intermedias, propiciando que el estudio de la naturaleza se restrinja a los hechos empíricos individuales concretos.  
D) Refutar el método inductivo mediante las paradojas de la física cuántica del vacío.  
E) Instaurar el principio de contradicción como el único criterio válido para las ciencias sociales.  

- **Resolución**: Al sostener que los universales son meros nombres (*nomina*) y que *"no deben multiplicarse los entes sin necesidad"* (navaja de Ockham), despojó a la naturaleza de las esencias metafísicas escolásticas, reorientando la investigación racional hacia los entes empíricos concretos y singulares, lo que constituyó la antesala conceptual de la revolución científica de Galileo y Newton.
- **Clave Correcta**: **C**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Mayéutica**: Método dialógico socrático que, a través de preguntas guiadas, ayuda al discípulo a alumbrar la verdad que ya habita en su intelecto.
2. **Hilemorfismo**: Doctrina aristotélica que postula que los entes corporales están compuestos indisociablemente de materia (*hyle*) y forma (*morphé*).
3. **Eudaimonía**: Noción griega que designa la plenitud vital, florecimiento humano o felicidad suprema como fin del orden moral.
4. **Apatheia**: Ideal estoico de impasibilidad y ausencia de pasiones desordenadas frente a los sufrimientos y azares del destino.
5. **Nominalismo**: Postura medieval que rechaza la existencia real de los conceptos universales, reduciéndolos a simples términos lingüísticos o signos cognitivos convencionales.
6. **Cogito Ergo Sum**: Primera certeza fundamental de Descartes (*"Pienso, luego existo"*), obtenida tras superar la prueba de la duda metódica.
7. **Giro Copernicano (Kant)**: Revolución epistemológica según la cual el sujeto no es un receptor pasivo, sino que configura activamente el objeto de conocimiento con sus formas a priori.
8. **Dialéctica (Hegel)**: Proceso dinámico ontológico e histórico en el que la Idea progresa a través de contradicciones y superaciones sucesivas (tesis, antítesis y síntesis).
9. **Superestructura**: Concepto marxista que abarca el conjunto de instituciones jurídicas, políticas, ideologías, filosofías y religiones condicionadas por la infraestructura económica.
10. **Metarrelato**: Gran relato o esquema histórico totalizador (como el progreso iluminista o la redención comunista) que pretendía legitimar la historia universal y que entra en crisis en la posmodernidad (Lyotard).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Heráclito y Parménides respecto al cambio?
  - *Reverso*: Para Heráclito todo cambia continuamente (devenir regido por el fuego y el *Logos*); para Parménides el Ser es inmutable y eterno, siendo el cambio una ilusión sensible.

- **Flashcard 2**:
  - *Anverso*: ¿Cómo define Santo Tomás de Aquino la relación entre Fe y Razón?
  - *Reverso*: No hay contradicción entre ambas (proceden del mismo Dios); la razón es autónoma en su campo pero está armónicamente subordinada a las verdades de la fe.

- **Flashcard 3**:
  - *Anverso*: ¿Cuáles son los tres estados de la humanidad según Auguste Comte?
  - *Reverso*: 1) Teológico (ficticio); 2) Metafísico (abstracto); 3) Positivo (científico y experimental).

- **Flashcard 4**:
  - *Anverso*: ¿Qué significa la frase de Sartre: "El hombre está condenado a ser libre"?
  - *Reverso*: Que al no existir una naturaleza humana dada ni un plan divino previo, el ser humano no puede eludir la responsabilidad total de sus elecciones y actos en el mundo.

---



### C. Filosofía Moderna (s. XVII - XVIII)
El giro gnoseológico: el problema central ya no es Dios ni el Ser, sino el **Sujeto y el Conocimiento**.
1. **Racionalismo Continental**:
   - **René Descartes** (Padre de la Filosofía Moderna):
     - Obra cumbre: *Discurso del método* y *Meditaciones metafísicas*.
     - Aplica la **Duda Metódica**: duda de los sentidos, del mundo exterior y formula la hipótesis del *Genio Maligno*.
     - Llega a la primera verdad indubitable: *"Pienso, luego existo"* (*Cogito ergo sum*).
     - Distingue tres sustancias: *res cogitans* (sustancia pensante), *res extensa* (sustancia material) y *res infinita* (Dios).
   - **Baruch Spinoza**: Monismo panteísta: existe una sola sustancia infinita, Dios o la Naturaleza (*Deus sive Natura*).
   - **Gottfried Leibniz**: Pluralismo de sustancias inmateriales espirituales llamadas **mónadas**.
2. **Empirismo Británico**:
   - **John Locke**: Crítica radical a las ideas innatas. La mente es una *tabula rasa*. Todo proviene de las ideas de sensación y reflexión.
   - **George Berkeley**: Idealismo subjetivo e inmaterialismo: existir es ser percibido (*Esse est percipi*).
   - **David Hume**: Escepticismo empirista consecuente. Todo conocimiento se reduce a **impresiones** (vivas e inmediatas) e **ideas** (copias débiles). Crítica a la noción metafísica de causalidad (es solo una costumbre o hábito psicológico) y al concepto de "yo" o sustancia.
3. **La Ilustración y el Criticismo**:
   - **Immanuel Kant**: Síntesis trascendental en la *Crítica de la Razón Pura*.
     - Giro Copernicano en el conocimiento: no es el sujeto el que se adapta al objeto, sino el objeto el que se adapta a las estructuras a priori del sujeto cognoscente (espacio, tiempo y categorías).
     - Distinción irreductible entre **Fenómeno** (lo conocido) y **Noúmeno** (la cosa en sí incognoscible).
     - Ética formal en la *Crítica de la Razón Práctica*: El **Imperativo Categórico** (*"Obra de tal modo que la máxima de tu voluntad pueda valer siempre como ley universal"*).
4. **Idealismo Alemán**:
   - **G. W. F. Hegel**: Idealismo absoluto y dialéctico. *"Todo lo real es racional y todo lo racional es real"*. La realidad es el despliegue dinámico de la Idea o Espíritu Absoluto a través de la tríada dialéctica: **Tesis** (afirmación), **Antítesis** (negación) y **Síntesis** (superación conservadora o *Aufhebung*).

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento de Friedrich Nietzsche:
> *"¿Qué es lo que nos hace falta? ¿No se está haciendo la noche cada vez más oscura? ¿No es menester encender linternas por la mañana? ¿Acaso no oímos el ruido de los sepultureros que están enterrando a Dios? [...] ¡Dios ha muerto! ¡Dios permanece muerto! ¡Y nosotros lo hemos matado! ¿Cómo nos consolaremos nosotros, asesinos entre los asesinos?"*. (*La gaya ciencia*).

En la perspectiva nietzscheana, la proclamación de la "muerte de Dios" significa rigurosamente:
A) Un triunfo del ateísmo escolástico en el seno del catolicismo renacentista.  
B) El derrumbe del orden metafísico y de los valores trascendentes absolutos que fundamentaban la civilización occidental, abriendo paso al nihilismo.  
C) La validación científica empírica de que el alma humana es mortal e inextensible.  
D) El retorno obligatorio al cristianismo primitivo despojado de la influencia platónica.  
E) La demostración formal de que la física cuántica refuta la existencia del Primer Motor Inmóvil.  

- **Resolución**: La muerte de Dios en Nietzsche es una metáfora histórico-cultural: representa la pérdida de vigencia de los fundamentos trascendentes (Dios, la Verdad absoluta, el Bien platónico) sobre los que reposaba la cultura europea, lo que precipita a Occidente en la crisis del nihilismo y exige la transvaloración de todos los valores.
- **Clave Correcta**: **B**

---



### Nemotecnia para las 5 Vías de Santo Tomás:
> **"MO - CA - CON - GRA - FI"**
- **MO**: Movimiento (Primer Motor)
- **CA**: Causa eficiente (Primera Causa)
- **CON**: Contingencia (Ser Necesario)
- **GRA**: Grados de perfección (Ser Supremo)
- **FI**: Finalidad u orden (Inteligencia Ordenadora)

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t06_s01_c01",
                    question = "Sócrates de Atenas orientó la filosofía hacia el ámbito antropológico y moral ('Conócete a ti mismo'), empleando el método dialéctico denominado:",
                    options = listOf(
                        "Hilemorfismo inductivo.",
                        "Mayéutica (precedida por la ironía socrática).",
                        "Duda hiperbólica cartesiana.",
                        "Silogística analítica.",
                    ),
                    correctIndex = 1,
                    explanation = "Sócrates usaba primero la ironía para que el interlocutor reconociera su propia ignorancia, y luego la mayéutica (arte de dar a luz) para ayudarlo a alumbrar la verdad desde su propio intelecto."
                ),
                Challenge(
                    id = "filo_t06_s01_c02",
                    question = "En la epistemología platónica, el conocimiento verdadero no es una adquisición de datos novedosos externos, sino un proceso de 'reminiscencia' (anamnesis), el cual sostiene que:",
                    options = listOf(
                        "El hombre inventa las ideas mediante convenciones lingüísticas arbitrarias.",
                        "Todo conocimiento se reduce a impresiones sensoriales pasajeras.",
                        "Solo recordamos lo que soñamos durante la infancia temprana.",
                        "Conocer es recordar las Ideas que el alma inmortal contempló en el Mundo Inteligible antes de caer prisionera en el cuerpo sensible.",
                    ),
                    correctIndex = 3,
                    explanation = "Para Platón, el alma racional preexistió en el Mundo de las Ideas; al unirse al cuerpo olvida lo contemplado, y la experiencia sensible actúa como mero estímulo para que el alma 'recuerde' (anamnesis)."
                ),
                Challenge(
                    id = "filo_t06_s01_c03",
                    question = "Aristóteles refutó la teoría de las dos sustancias separadas de Platón formulando la teoría del 'Hilemorfismo', la cual establece que todas las sustancias sensibles del mundo están compuestas por:",
                    options = listOf(
                        "Átomos indivisibles y vacío infinito.",
                        "Fuego divino y números proporcionales armónicos.",
                        "Materia (hyle) indeterminada y Forma (morphe) sustancial unidas de manera indisoluble.",
                        "Espíritu universal y memoria genética heredada.",
                    ),
                    correctIndex = 2,
                    explanation = "El hilemorfismo aristotélico sostiene que cada ente concreto (sustancia primera) es un compuesto indisociable de materia (sustrato pasivo) y forma (principio determinante que hace ser a la cosa lo que es)."
                ),
                Challenge(
                    id = "filo_t06_s01_c04",
                    question = "Para explicar el movimiento y devenir de los seres en la naturaleza, Aristóteles formuló la célebre distinción ontológica entre:",
                    options = listOf(
                        "Sustancia pensante y sustancia extensa.",
                        "Apariencia sensorial y arquetipo celeste.",
                        "Acto (lo que un ser es en el presente) y Potencia (la capacidad real que tiene de transformarse o llegar a ser).",
                        "Apeiron infinito y elementos atómicos.",
                    ),
                    correctIndex = 2,
                    explanation = "El movimiento es definido por Aristóteles como el paso de la potencia al acto (el tránsito de una capacidad latente a su realización efectiva)."
                ),
                Challenge(
                    id = "filo_t06_s01_c05",
                    question = "En el periodo helenístico-romano, la escuela del 'Estoicismo' (fundada por Zenón de Citio y continuada por Séneca y Marco Aurelio) propuso como ideal moral la 'ataraxia' y la 'apatheia', que consisten en:",
                    options = listOf(
                        "La búsqueda desenfrenada de placeres sensuales corporales inmediatos.",
                        "El autodominio de las pasiones mediante la razón y la aceptación resignada del destino y la ley cósmica (logos).",
                        "El aislamiento total de la sociedad viviendo como mendigos errantes.",
                        "La rebelión armada contra las legiones del Imperio romano.",
                    ),
                    correctIndex = 1,
                    explanation = "Los estoicos proclamaban vivir conforme a la naturaleza y al logos universal, dominando los afectos y apetitos corporales mediante la templanza y serenidad imperturbable (ataraxia)."
                ),
                Challenge(
                    id = "filo_t06_s01_c06",
                    question = "Epicuro de Samos, fundador del 'Hedonismo' filosófico helenístico, concebía el placer (hedoné) supremo no como el goce desenfrenado de los sentidos, sino como:",
                    options = listOf(
                        "La ausencia de dolor en el cuerpo (aponía) y la tranquilidad y serenidad en el alma (ataraxia).",
                        "La adquisición desmedida de honores políticos y riqueza material.",
                        "El sacrificio corporal mediante el autocastigo y la flagelación mística.",
                        "La ingestión permanente de manjares y licores sin moderación.",
                    ),
                    correctIndex = 0,
                    explanation = "El hedonismo epicúreo es sumamente mesurado e intelectual: valora los placeres naturales y necesarios y busca la aponía (falta de dolor físico) y la ataraxia (paz espiritual)."
                ),
                Challenge(
                    id = "filo_t06_s01_c07",
                    question = "En la filosofía medieval patrística, Agustín de Hipona sintetizó el cristianismo con el platonismo, sintetizando la relación entre fe y razón bajo la célebre fórmula:",
                    options = listOf(
                        "'Cree para que entiendas, y entiende para que creas' (Credo ut intelligam, intellige ut credas).",
                        "Solo la razón pura sin fe puede alcanzar la divinidad.",
                        "La fe y la razón son enemigas irreconciliables que deben destruirse mutuamente.",
                        "La revelación bíblica es un error gramatical que debe corregirse con física.",
                    ),
                    correctIndex = 0,
                    explanation = "San Agustín subordina armoniosamente la razón a la fe, señalando que la fe ilumina a la razón para comprender las verdades reveladas y la razón ayuda a esclarecer el contenido de la fe."
                ),
                Challenge(
                    id = "filo_t06_s01_c08",
                    question = "Tomás de Aquino, máximo representante de la Escolástica medieval, cristianizó la filosofía de Aristóteles y formuló en la 'Summa Theologiae':",
                    options = listOf(
                        "El rechazo total a la doctrina de la inmortalidad del alma.",
                        "La teoría de la relatividad espacio-temporal universal.",
                        "Las 'Cinco Vías' racionales y cosmológicas para demostrar la existencia de Dios a partir de los efectos observables en el mundo.",
                        "La duda metódica como vía para negar la existencia del cosmos.",
                    ),
                    correctIndex = 2,
                    explanation = "Tomás de Aquino formuló cinco pruebas 'a posteriori' (movimiento, causalidad eficiente, contingencia, grados de perfección y finalidad del mundo) para demostrar la existencia de Dios mediante la razón natural."
                ),
                Challenge(
                    id = "filo_t06_s01_c09",
                    question = "En el gran debate escolástico sobre los 'Universales', el filósofo Guillermo de Ockham defendió la postura del 'Nominalismo', según la cual los conceptos universales:",
                    options = listOf(
                        "Son realidades ontológicas sustanciales que habitan fuera del espacio material.",
                        "Son ilusiones biológicas producidas por el sistema circulatorio.",
                        "Son percepciones sensibles originadas en la experiencia empírica inmediata.",
                        "No son cosas reales existentes fuera de la mente, sino meros nombres convencionales (nomina) o signos lingüísticos para agrupar individuos particulares concretos.",
                    ),
                    correctIndex = 3,
                    explanation = "Para el nominalismo de Ockham, solo existen los individuos singulares y concretos; los universales son 'nombres' o términos mentales (nomina) sin existencia sustancial independiente."
                ),
                Challenge(
                    id = "filo_t06_s01_c10",
                    question = "El principio metodológico conocido como la 'Navaja de Ockham' (o principio de parsimonia) preceptúa que:",
                    options = listOf(
                        "No deben multiplicarse los entes sin necesidad; es preferible elegir siempre la explicación más simple y que presuponga menos entidades o causas.",
                        "Los barberos deben afeitar con navajas de acero templado a los estudiantes.",
                        "Se debe recurrir a seres mitológicos para explicar cualquier fenómeno químico.",
                        "Las teorías científicas más complejas y contradictorias son las verdaderas.",
                    ),
                    correctIndex = 0,
                    explanation = "La navaja de Ockham ('Entia non sunt multiplicanda praeter necessitatem') aconseja optar por la explicación que postule la menor cantidad de supuestos o entidades metafísicas innecesarias."
                ),
            )
        ),
        LessonNode(
            id = "filo_t06_s02",
            subjectId = "filosofia",
            semana = 6,
            subtema = "6.2",
            title = "C. Filosofía Moderna (s. XVII - XVIII)",
            theory = LessonTheory(
                content = """## 2. LÍNEA DE TIEMPO Y MAPA HISTÓRICO DE LA FILOSOFÍA

```
  ANTIGUA (s. VI a.C. - V d.C.)        MEDIEVAL (s. V - XV)      MODERNA (s. XVII - XVIII)   CONTEMPORÁNEA (s. XIX - XXI)
┌───────────────────────────────┐  ┌─────────────────────────┐  ┌────────────────────────┐  ┌───────────────────────────┐
│ • Presocráticos (El Arché)    │  │ • Patrística:           │  │ • Racionalismo:        │  │ • Positivismo (Comte)     │
│ • Período Antropológico:      │  │   San Agustín (Fe/Razón)│  │   Descartes, Spinoza   │  │ • Marxismo (Materialismo) │
│   Sócrates vs. Sofistas       │  │ • Escolástica:          │  │ • Empirismo:           │  │ • Vitalismo (Nietzsche)   │
│ • Grandes Sistemas:           │  │   Sto. Tomás (5 Vías)   │  │   Locke, Hume          │  │ • Fenomenología (Husserl) │
│   Platón (Ideas) y            │  │ • Nominalismo:          │  │ • Criticismo: Kant     │  │ • Existencialismo:        │
│   Aristóteles (Causas)        │  │   Guillermo de Ockham   │  │ • Idealismo Dialéctico:│  │   Sartre, Heidegger       │
│ • Helenismo: Estoicos,        │  │                         │  │   Hegel                │  │ • Posmodernidad: Lyotard,  │
│   Epicúreos, Cínicos          │  │                         │  │                        │  │   Foucault, Bauman         │
└───────────────────────────────┘  └─────────────────────────┘  └────────────────────────┘  └───────────────────────────┘
```

---



### B. Filosofía Medieval (s. V - XV)
El problema rector es la **relación entre Fe y Razón** y la subordinación de la filosofía a la teología (*ancilla theologiae*).
1. **La Patrística (s. I - VIII)**: Fijación dogmática del cristianismo con categorías platónicas.
   - **San Agustín de Hipona**:
     - *"Cree para entender y entiende para creer"* (*Crede ut intelligas, intellige ut credas*). Subordina la razón a la fe.
     - *Teoría de la Iluminación*: La mente humana solo puede alcanzar las verdades eternas cuando es iluminada por la gracia de Dios.
     - *La Ciudad de Dios*: Filosofía de la historia que enfrenta la ciudad terrena (el egoísmo y el pecado) con la ciudad celeste (el amor a Dios).
2. **La Escolástica (s. IX - XIV)**: Filosofía enseñada en las escuelas catedralicias y primeras universidades (siglo XIII: Siglo de Oro).
   - **Santo Tomás de Aquino (Aristotelismo cristiano)**:
     - Distingue rigurosamente Fe y Razón: son dos fuentes distintas que proceden de Dios y no pueden contradecirse (armonía). La razón puede demostrar los preámbulos de la fe.
     - *Las Cinco Vías para demostrar la existencia de Dios* (a posteriori):
       1. Por el movimiento (debe existir un Primer Motor Inmóvil).
       2. Por la causa eficiente (debe existir una Primera Causa Incausada).
       3. Por la contingencia (debe existir un Ser Necesario por sí mismo).
       4. Por los grados de perfección (debe existir un Ser Máximamente Perfecto).
       5. Por el orden o finalidad del universo (debe existir una Inteligencia Ordenadora Suprema).
3. **El Ocaso Medieval y la Ruptura Nominalista (s. XIV)**:
   - **Guillermo de Ockham**: Rompe la síntesis tomista. Los conceptos universales no existen en la realidad ni en la mente divina; son meros nombres o signos convencionales (**Nominalismo**).
   - *Navaja de Ockham* (Principio de economía ontológica): *"No deben multiplicarse los entes sin necesidad"*. Abre el camino a la ciencia moderna experimental.

---



### C. Filosofía Moderna (s. XVII - XVIII)
El giro gnoseológico: el problema central ya no es Dios ni el Ser, sino el **Sujeto y el Conocimiento**.
1. **Racionalismo Continental**:
   - **René Descartes** (Padre de la Filosofía Moderna):
     - Obra cumbre: *Discurso del método* y *Meditaciones metafísicas*.
     - Aplica la **Duda Metódica**: duda de los sentidos, del mundo exterior y formula la hipótesis del *Genio Maligno*.
     - Llega a la primera verdad indubitable: *"Pienso, luego existo"* (*Cogito ergo sum*).
     - Distingue tres sustancias: *res cogitans* (sustancia pensante), *res extensa* (sustancia material) y *res infinita* (Dios).
   - **Baruch Spinoza**: Monismo panteísta: existe una sola sustancia infinita, Dios o la Naturaleza (*Deus sive Natura*).
   - **Gottfried Leibniz**: Pluralismo de sustancias inmateriales espirituales llamadas **mónadas**.
2. **Empirismo Británico**:
   - **John Locke**: Crítica radical a las ideas innatas. La mente es una *tabula rasa*. Todo proviene de las ideas de sensación y reflexión.
   - **George Berkeley**: Idealismo subjetivo e inmaterialismo: existir es ser percibido (*Esse est percipi*).
   - **David Hume**: Escepticismo empirista consecuente. Todo conocimiento se reduce a **impresiones** (vivas e inmediatas) e **ideas** (copias débiles). Crítica a la noción metafísica de causalidad (es solo una costumbre o hábito psicológico) y al concepto de "yo" o sustancia.
3. **La Ilustración y el Criticismo**:
   - **Immanuel Kant**: Síntesis trascendental en la *Crítica de la Razón Pura*.
     - Giro Copernicano en el conocimiento: no es el sujeto el que se adapta al objeto, sino el objeto el que se adapta a las estructuras a priori del sujeto cognoscente (espacio, tiempo y categorías).
     - Distinción irreductible entre **Fenómeno** (lo conocido) y **Noúmeno** (la cosa en sí incognoscible).
     - Ética formal en la *Crítica de la Razón Práctica*: El **Imperativo Categórico** (*"Obra de tal modo que la máxima de tu voluntad pueda valer siempre como ley universal"*).
4. **Idealismo Alemán**:
   - **G. W. F. Hegel**: Idealismo absoluto y dialéctico. *"Todo lo real es racional y todo lo racional es real"*. La realidad es el despliegue dinámico de la Idea o Espíritu Absoluto a través de la tríada dialéctica: **Tesis** (afirmación), **Antítesis** (negación) y **Síntesis** (superación conservadora o *Aufhebung*).

---



### D. Filosofía Contemporánea (s. XIX - XXI)
Ruptura con los grandes sistemas metafísicos; crítica a la razón ilustrada.
1. **Positivismo de Auguste Comte**:
   - La ciencia empírica positiva es el único saber válido. Rechaza toda metafísica.
   - **Ley de los Tres Estados**:
     1. *Estado Teológico o Ficticio*: Explicación por fuerzas divinas o sobrenaturales.
     2. *Estado Metafísico o Abstracto*: Explicación por fuerzas abstractas o esencias ocultas.
     3. *Estado Positivo o Científico*: Renuncia al porqué último y describe las leyes constantes de los fenómenos mediante la observación y experimentación.
2. **Materialismo Histórico y Dialéctico (Karl Marx y Friedrich Engels)**:
   - Invierte la dialéctica de Hegel poniéndola sobre bases materiales.
   - La base material económica (fuerzas productivas y relaciones de producción) o **Infraestructura** determina la **Superestructura** ideológica, jurídica, política y religiosa.
   - La historia de la humanidad es la historia de la **lucha de clases** (amo-esclavo, señor-siervo, burgués-proletario).
3. **Vitalismo y Filosofía de la Sospecha (Friedrich Nietzsche)**:
   - Crítica radical a la tradición socrático-platónica y cristiana por promover una moral de esclavos (resentimiento, renuncia vital).
   - Reivindica lo **Dionisíaco** (la pasión, el desenfreno, el cuerpo, la vida terrena) frente a lo **Apolíneo** (la razón abstracta, el orden, la contención).
   - Proclama la **Muerte de Dios**: el derrumbe de los valores trascendentes metafísicos que da paso al nihilismo.
   - Propone la **Voluntad de Poder**, la transvaloración de todos los valores, el **Eterno Retorno** y la llegada del **Superhombre** (*Übermensch*), creador de sus propios valores afirmativos de la vida terrenal.
4. **Existencialismo**:
   - **Jean-Paul Sartre**: *"La existencia precede a la esencia"*. El ser humano no nace con un propósito predeterminado; se hace a través de sus elecciones. Condenado a ser libre, asumir la angustia existencial y evitar la "mala fe" (autoengaño de culpar a las circunstancias).
   - **Martin Heidegger**: El hombre es el *Dasein* ("ser-ahí"), un ser arrojado al mundo cuya condición ontológica auténtica es ser un **ser-para-la-muerte** (*Sein-zum-Tode*).
5. **Posmodernismo y Crítica Cultural (Segunda mitad del s. XX)**:
   - **Jean-François Lyotard**: Define la condición posmoderna como la **incredulidad ante los metarrelatos** (el fin de las grandes promesas emancipadoras del Iluminismo, el Cristianismo y el Marxismo).
   - **Michel Foucault**: Análisis de la relación saber-poder y las instituciones de disciplinamiento y biopolítica (cárceles, manicomios, escuelas).
   - **Zygmunt Bauman**: Teoría de la **modernidad líquida**, caracterizada por la precariedad de los vínculos humanos, el consumismo fugaz y la disolución de certezas institucionales sólidas.

---



## 4. CUADRO COMPARATIVO: LAS CUATRO GRANDES ÉPOCAS FILOSÓFICAS

| Época Histórica | Período Clave | Problema Central | Paradigma / Tesis Arquetípica | Filósofos Cumbre |
| :--- | :--- | :--- | :--- | :--- |
| **Antigua** | S. VI a.C. - V d.C. | Naturaleza (*Cosmos*), Ser y Hombre en la *Polis*. | Búsqueda del *Arché*, Teoría de las Ideas y el Hilemorfismo. | Presocráticos, Sócrates, Platón, Aristóteles. |
| **Medieval** | S. V - XV d.C. | Dios, Teología y subordinación Fe-Razón. | Armonía o subordinación de la razón a la revelación divina. | San Agustín, Santo Tomás de Aquino, Ockham. |
| **Moderna** | S. XVII - XVIII | Origen, límites y validez del Conocimiento humano. | Giro subjetivo: Racionalismo vs. Empirismo \rightarrow Síntesis Crítica. | Descartes, Locke, Hume, Kant, Hegel. |
| **Contemporánea** | S. XIX - XXI | Sentido existencial, historia, poder y crítica de la razón. | Desmitificación de la metafísica: lucha de clases, voluntad de poder, libertad. | Comte, Marx, Nietzsche, Sartre, Foucault, Bauman. |

---



### Nemotecnia para las 5 Vías de Santo Tomás:
> **"MO - CA - CON - GRA - FI"**
- **MO**: Movimiento (Primer Motor)
- **CA**: Causa eficiente (Primera Causa)
- **CON**: Contingencia (Ser Necesario)
- **GRA**: Grados de perfección (Ser Supremo)
- **FI**: Finalidad u orden (Inteligencia Ordenadora)

---



### Nivel 2: Intermedio / Comprensión Doctrinal
**Enunciado**: Según la teoría de las cuatro causas de Aristóteles, si analizamos una estatua de mármol que representa al dios Apolo esculpida por Fidias para adornar el Partenón, la causa eficiente y la causa final de dicha obra son, respectivamente:
A) El mármol y la forma de Apolo  
B) El templo del Partenón y el cincel  
C) El escultor Fidias y el adorno del Partenón  
D) La forma de Apolo y el escultor Fidias  
E) El mármol y el bloque de piedra bruta  

- **Resolución**:
  - Causa material: El mármol.
  - Causa formal: La figura/idea de Apolo.
  - Causa eficiente: El agente que la produjo \rightarrow El escultor Fidias.
  - Causa final: El propósito o fin para el que se hizo \rightarrow Adornar el Partenón.
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: En un certamen de debate sobre sociología del trabajo, un ponente afirma: *"No son las leyes jurídicas ni las doctrinas religiosas de un país las que crean su prosperidad económica; al contrario, es la forma en que los seres humanos organizan la producción material y la tecnología fabril lo que termina determinando el tipo de leyes, moral y religión de esa sociedad"*. Esta postura se fundamenta directamente en las tesis del:
A) Positivismo de Comte  
B) Materialismo histórico de Karl Marx  
C) Vitalismo trágico de Nietzsche  
D) Racionalismo cartesiano  
E) Idealismo dialéctico de Hegel  

- **Resolución**: La tesis de que la infraestructura económica material condiciona o determina la superestructura política, jurídica e ideológica es el postulado central del **materialismo histórico** formulado por Karl Marx y Friedrich Engels.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea atentamente el siguiente fragmento de Friedrich Nietzsche:
> *"¿Qué es lo que nos hace falta? ¿No se está haciendo la noche cada vez más oscura? ¿No es menester encender linternas por la mañana? ¿Acaso no oímos el ruido de los sepultureros que están enterrando a Dios? [...] ¡Dios ha muerto! ¡Dios permanece muerto! ¡Y nosotros lo hemos matado! ¿Cómo nos consolaremos nosotros, asesinos entre los asesinos?"*. (*La gaya ciencia*).

En la perspectiva nietzscheana, la proclamación de la "muerte de Dios" significa rigurosamente:
A) Un triunfo del ateísmo escolástico en el seno del catolicismo renacentista.  
B) El derrumbe del orden metafísico y de los valores trascendentes absolutos que fundamentaban la civilización occidental, abriendo paso al nihilismo.  
C) La validación científica empírica de que el alma humana es mortal e inextensible.  
D) El retorno obligatorio al cristianismo primitivo despojado de la influencia platónica.  
E) La demostración formal de que la física cuántica refuta la existencia del Primer Motor Inmóvil.  

- **Resolución**: La muerte de Dios en Nietzsche es una metáfora histórico-cultural: representa la pérdida de vigencia de los fundamentos trascendentes (Dios, la Verdad absoluta, el Bien platónico) sobre los que reposaba la cultura europea, lo que precipita a Occidente en la crisis del nihilismo y exige la transvaloración de todos los valores.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Mayéutica**: Método dialógico socrático que, a través de preguntas guiadas, ayuda al discípulo a alumbrar la verdad que ya habita en su intelecto.
2. **Hilemorfismo**: Doctrina aristotélica que postula que los entes corporales están compuestos indisociablemente de materia (*hyle*) y forma (*morphé*).
3. **Eudaimonía**: Noción griega que designa la plenitud vital, florecimiento humano o felicidad suprema como fin del orden moral.
4. **Apatheia**: Ideal estoico de impasibilidad y ausencia de pasiones desordenadas frente a los sufrimientos y azares del destino.
5. **Nominalismo**: Postura medieval que rechaza la existencia real de los conceptos universales, reduciéndolos a simples términos lingüísticos o signos cognitivos convencionales.
6. **Cogito Ergo Sum**: Primera certeza fundamental de Descartes (*"Pienso, luego existo"*), obtenida tras superar la prueba de la duda metódica.
7. **Giro Copernicano (Kant)**: Revolución epistemológica según la cual el sujeto no es un receptor pasivo, sino que configura activamente el objeto de conocimiento con sus formas a priori.
8. **Dialéctica (Hegel)**: Proceso dinámico ontológico e histórico en el que la Idea progresa a través de contradicciones y superaciones sucesivas (tesis, antítesis y síntesis).
9. **Superestructura**: Concepto marxista que abarca el conjunto de instituciones jurídicas, políticas, ideologías, filosofías y religiones condicionadas por la infraestructura económica.
10. **Metarrelato**: Gran relato o esquema histórico totalizador (como el progreso iluminista o la redención comunista) que pretendía legitimar la historia universal y que entra en crisis en la posmodernidad (Lyotard).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Heráclito y Parménides respecto al cambio?
  - *Reverso*: Para Heráclito todo cambia continuamente (devenir regido por el fuego y el *Logos*); para Parménides el Ser es inmutable y eterno, siendo el cambio una ilusión sensible.

- **Flashcard 2**:
  - *Anverso*: ¿Cómo define Santo Tomás de Aquino la relación entre Fe y Razón?
  - *Reverso*: No hay contradicción entre ambas (proceden del mismo Dios); la razón es autónoma en su campo pero está armónicamente subordinada a las verdades de la fe.

- **Flashcard 3**:
  - *Anverso*: ¿Cuáles son los tres estados de la humanidad según Auguste Comte?
  - *Reverso*: 1) Teológico (ficticio); 2) Metafísico (abstracto); 3) Positivo (científico y experimental).

- **Flashcard 4**:
  - *Anverso*: ¿Qué significa la frase de Sartre: "El hombre está condenado a ser libre"?
  - *Reverso*: Que al no existir una naturaleza humana dada ni un plan divino previo, el ser humano no puede eludir la responsabilidad total de sus elecciones y actos en el mundo.

---



### A. Filosofía Antigua (Grecia y Roma)
1. **Período Cosmológico o Presocrático (s. VI - V a.C.)**: Indagan el *arché* (principio material/formal constitutivo del universo).
   - **Tales de Mileto**: El **agua** como sustancia primordial.
   - **Anaximandro**: El **ápeiron** (lo indeterminado, ilimitado, infinito).
   - **Anaxímenes**: El **aire** (por rarefacción y condensación).
   - **Pitágoras**: Los **números** y la armonía matemática cósmica.
   - **Heráclito de Éfeso**: El fuego y el **devenir continuo** (*"Todo fluye, nada permanece"*; lucha de contrarios regida por el *Logos*).
   - **Parménides de Elea**: El **Ser es uno, eterno, inmóvil, increado e inmutable**. El cambio y la multiplicidad son meras ilusiones de los sentidos (*"El ser es y el no ser no es"*).
   - **Demócrito y Leucipo**: El **átomo** (partículas indivisibles en el vacío; materialismo mecanicista).
2. **Período Antropológico (s. V a.C.)**: El centro del debate se traslada de la naturaleza a la *polis*, la moral y el lenguaje.
   - **Los Sofistas** (Protágoras, Gorgias): Maestros de retórica para la democracia ateniense. Postulan el **relativismo** (*"El hombre es la medida de todas las cosas"* - Protágoras) y el **escepticismo/nihilismo** (Gorgias: nada existe; si existiera no se podría conocer; si se conociera no se podría comunicar).
   - **Sócrates**: Rechaza el relativismo y el cobro por enseñar. Busca las definiciones universales de las virtudes morales mediante el diálogo:
     - *Ironía*: Conduce al interlocutor a reconocer su propia ignorancia (*"Solo sé que nada sé"*).
     - *Mayéutica* (arte de la partera): Ayuda a dar a luz la verdad que reside en el interior del alma.
     - *Intelectualismo moral*: Quien conoce el bien, actúa virtuosamente; el malvado es simplemente un ignorante.
3. **Período Ontológico o de los Grandes Sistemas (s. IV a.C.)**:
   - **Platón (Idealismo Objetivo)**:
     - *Teoría de los Dos Mundos*: El **Mundo Sensible** (material, corruptible, sombras, copias) y el **Mundo Inteligible o de las Ideas** (inmaterial, perfecto, eterno, real).
     - *Alegoría de la Caverna*: Metáfora del ascenso epistemológico de la ignorancia (*doxa*) al conocimiento del Bien supremo (*episteme*).
     - *Teoría de la Reminiscencia*: Conocer es recordar (*anámnesis*); el alma preexistió en el mundo de las ideas.
     - *La República*: Estado ideal dividido en tres clases según las tres partes del alma: gobernantes-filósofos (alma racional / sabiduría), guardianes (alma irascible / fortaleza) y productores (alma concupiscible / templanza).
   - **Aristóteles (Realismo Clásico / Hilemorfismo)**:
     - Discípulo crítico de Platón: *"Soy amigo de Platón, pero más amigo de la verdad"*. Rechaza la existencia separada del mundo de las ideas.
     - *Teoría Hilemórfica*: Todas las sustancias sensibles están compuestas indisociablemente de **Materia** (*hyle*, sustrato pasivo) y **Forma** (*morphé*, principio determinante que hace que una cosa sea lo que es).
     - *Acto y Potencia*: Explicación metafísica del movimiento. El **acto** (*enérgeia*) es lo que una cosa es en el presente; la **potencia** (*dýnamis*) es su capacidad de transformarse.
     - *Teoría de las Cuatro Causas*:
       1. Causa material (¿de qué está hecho?).
       2. Causa formal (¿qué es? su diseño o esencia).
       3. Causa eficiente (¿quién o qué lo produjo?).
       4. Causa final (¿para qué sirve? el fin o *telos*).
     - *El Motor Inmóvil*: Acto puro sin potencia que mueve al cosmos como causa final por atracción.
     - *Ética Eudemonista*: El fin supremo de la vida humana es la felicidad (*eudaimonía*), alcanzable mediante el ejercicio de la razón y el **justo medio** entre dos extremos viciosos (el exceso y el defecto).
4. **Período Helenístico-Romano (s. III a.C. - II d.C.)**: Énfasis en la ética práctica para alcanzar la tranquilidad individual.
   - **Estoicismo** (Zenón de Citio, Séneca, Epicteto, Marco Aurelio): Vivir en conformidad con el *Logos* universal, aceptar el destino con resignación y dominar las pasiones (*apatheia*).
   - **Epicureísmo** (Epicuro de Samos): El fin de la vida es el placer prudente y moderado (*hedonismo racional*), evitando el dolor del cuerpo y las turbaciones del alma (*ataraxia*). Cuádruple remedio (*Tetrapharmakos*): no temer a los dioses, a la muerte, al dolor ni al fracaso.
   - **Cinismo** (Diógenes de Sínope): Desprecio absoluto por las convenciones sociales, las riquezas y la civilización; retorno radical a la naturaleza animal austera.

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: En el siglo XIV, Guillermo de Ockham desencadenó una profunda transformación gnoseológica al postular el nominalismo radical y la célebre "navaja de Ockham". La consecuencia epistemológica más revolucionaria de dicha doctrina para el nacimiento de la ciencia moderna fue:
A) Subordinar los experimentos físicos a la autoridad de los dogmas patrísticos.  
B) Consolidar el realismo metafísico de los universales platónicos en la cosmología tolemaica.  
C) Eliminar la multiplicación innecesaria de esencias metafísicas intermedias, propiciando que el estudio de la naturaleza se restrinja a los hechos empíricos individuales concretos.  
D) Refutar el método inductivo mediante las paradojas de la física cuántica del vacío.  
E) Instaurar el principio de contradicción como el único criterio válido para las ciencias sociales.  

- **Resolución**: Al sostener que los universales son meros nombres (*nomina*) y que *"no deben multiplicarse los entes sin necesidad"* (navaja de Ockham), despojó a la naturaleza de las esencias metafísicas escolásticas, reorientando la investigación racional hacia los entes empíricos concretos y singulares, lo que constituyó la antesala conceptual de la revolución científica de Galileo y Newton.
- **Clave Correcta**: **C**

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Platón vs. Aristóteles en las Ideas**:
   - Para Platón, las ideas existen en un mundo trascendente separado (*Topos Uranos*).
   - Para Aristóteles, las ideas (formas) están **dentro de las cosas mismas** en el mundo sensible (inmanencia hilemórfica). Si dicen que Aristóteles aceptó el dualismo ontológico de mundos separados, es **falso**.
2. **La trampa Nietzsche y el Nihilismo**:
   - Nietzsche **no es un nihilista pasivo**. Denuncia el nihilismo de la cultura occidental y propone un **nihilismo activo** para destruir los falsos valores y crear nuevos valores afirmativos con el Superhombre.
3. **Agustín vs. Tomás de Aquino**:
   - San Agustín adopta a **Platón** cristianizado.
   - Santo Tomás de Aquino adopta a **Aristóteles** cristianizado. Si te ponen a Santo Tomás con la reminiscencia platónica o la iluminación, es una trampa directa.

---



### Nivel 1: Básico / Identificación Histórica
**Enunciado**: El filósofo de la antigüedad clásica que concibió el mundo sensible como un reflejo o copia imperfecta de un ámbito inmaterial y trascendente denominado el Mundo de las Ideas, exponiendo dicha doctrina en su célebre diálogo *La República*, fue:
A) Aristóteles  
B) Platón  
C) Heráclito  
D) Epicuro  
E) Protágoras  

- **Resolución**: Platón es el artífice del idealismo objetivo clásico y la teoría de los dos mundos (Sensible e Inteligible), plasmando la alegoría de la caverna en el libro VII de *La República*.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t06_s02_c01",
                    question = "René Descartes inició la filosofía moderna utilizando la 'duda metódica' no como un escepticismo destructivo final, sino como:",
                    options = listOf(
                        "Un juego literario para burlarse de los matemáticos renacentistas.",
                        "Un camino provisional y radical para derribar opiniones erróneas y hallar una verdad primera, indubitable, clara y distinta.",
                        "Una técnica médica para curar la amnesia y la melancolía.",
                        "Un dogma religioso para someter a los protestantes europeos.",
                    ),
                    correctIndex = 1,
                    explanation = "La duda cartesiana es metódica, universal y teorética: duda de los sentidos, del sueño y de las certezas lógicas para encontrar un punto de apoyo arquimédico inmune a toda duda."
                ),
                Challenge(
                    id = "filo_t06_s02_c02",
                    question = "¿Cuál es la primera verdad incuestionable a la que llega Descartes al advertir que incluso si un genio maligno lo engañara, es forzoso que él exista para ser engañado?",
                    options = listOf(
                        "'Dios existe y es el creador de la sustancia material extensa'.",
                        "'Pienso, luego existo' (Cogito, ergo sum / sustancia pensante).",
                        "'El cuerpo humano es una máquina perfecta e inmortal'.",
                        "'Los sentidos nunca nos engañan respecto a la distancia de las estrellas'.",
                    ),
                    correctIndex = 1,
                    explanation = "El 'Cogito ergo sum' es la primera verdad evidente: en el acto mismo de dudar o pensar se manifiesta con certeza apodíctica la existencia del sujeto pensante como res cogitans."
                ),
                Challenge(
                    id = "filo_t06_s02_c03",
                    question = "David Hume, culminador del empirismo radical inglés, sostuvo que todos los contenidos de la mente humana son percepciones, dividiéndolas rigurosamente en:",
                    options = listOf(
                        "Almas inmortales y cuerpos caducos en descomposición.",
                        "Conceptos puros del entendimiento y axiomas matemáticos innatos.",
                        "Voluntades inconscientes y pulsiones biológicas reprimidas.",
                        "Impresiones (percepciones vivas, directas e inmediatas) e Ideas (copias o imágenes débiles de las impresiones en la memoria y la imaginación).",
                    ),
                    correctIndex = 3,
                    explanation = "Para Hume, el criterio de verdad de una idea consiste en remitirla a la impresión sensible de la que deriva; si una idea carece de impresión empírica originaria, es una ficción ilegítima."
                ),
                Challenge(
                    id = "filo_t06_s02_c04",
                    question = "La demoledora crítica de David Hume al 'Principio de Causalidad' concluyó que el nexo causal necesario entre una causa y su efecto no es una ley racional objetiva del cosmos, sino:",
                    options = listOf(
                        "Una creencia subjetiva originada en el hábito o costumbre psicológica tras observar reiteradamente la conjunción constante de dos eventos.",
                        "Un teorema matemático demostrado geométricamente por Euclides.",
                        "Una revelación profética dictada por los evangelistas.",
                        "Una propiedad molecular intrínseca de los cuerpos pesados.",
                    ),
                    correctIndex = 0,
                    explanation = "Hume demostró que no tenemos impresión sensorial de la 'conexión necesaria', sino solo de la sucesión temporal; por tanto, la causalidad se funda en el hábito psicológico y la expectativa humana."
                ),
                Challenge(
                    id = "filo_t06_s02_c05",
                    question = "Immanuel Kant denominó a su revolución filosófica el 'Giro Copernicano' del conocimiento porque propuso que:",
                    options = listOf(
                        "La Tierra es el centro estático del universo y el sol gira a su alrededor.",
                        "La razón pura humana puede conocer las cosas en sí mismas (el noúmeno) sin auxilio de la experiencia sensible.",
                        "El sujeto cognoscente no es un receptor pasivo que se adapta al objeto, sino que el objeto se adecua y estructura según las formas y categorías a priori de la mente humana.",
                        "La filosofía debe subordinarse plenamente a los dogmas teológicos de la fe.",
                    ),
                    correctIndex = 2,
                    explanation = "Así como Copérnico puso al espectador en movimiento en lugar de los astros, Kant situó al sujeto cognoscente en el centro constitutivo del conocimiento fenoménico."
                ),
                Challenge(
                    id = "filo_t06_s02_c06",
                    question = "En la 'Crítica de la Razón Pura', Kant afirma que la ciencia (como la física de Newton) progresa porque está fundamentada en juicios:",
                    options = listOf(
                        "Sintéticos meramente contingentes y particulares.",
                        "Sintéticos a priori (aportan nueva información empírica y son universales y necesarios).",
                        "Analíticos a posteriori.",
                        "Analíticos puramente tautológicos sin referente fáctico.",
                    ),
                    correctIndex = 1,
                    explanation = "Los juicios sintéticos a priori son la base de la ciencia: son sintéticos porque amplían el conocimiento con datos de la experiencia y a priori porque poseen universalidad y necesidad estricta."
                ),
                Challenge(
                    id = "filo_t06_s02_c07",
                    question = "En el sistema del Idealismo Absoluto de Georg Wilhelm Friedrich Hegel, la realidad y la historia humana son concebidas como:",
                    options = listOf(
                        "El autodespliegue dialéctico y la autorrealización del Espíritu (Geist) o Idea a través de las fases de Tesis, Antítesis y Síntesis.",
                        "Un paraíso terrenal inmutable donde nunca ocurre ningún cambio civilizatorio.",
                        "Una colección inconexa de átomos materiales que flotan en el éter vacío.",
                        "Una ilusión de los sentidos generada por el cerebro reptiliano de los animales.",
                    ),
                    correctIndex = 0,
                    explanation = "Hegel formuló que 'todo lo real es racional y todo lo racional es real'; la historia es el proceso dialéctico de alienación y autoconciencia del Espíritu Absoluto hacia la libertad."
                ),
                Challenge(
                    id = "filo_t06_s02_c08",
                    question = "Para la dialéctica hegeliana, el motor intrínseco que impulsa el dinamismo, el cambio y la superación de cada etapa del pensamiento y de la historia es:",
                    options = listOf(
                        "La pasividad contemplativa y la ausencia de problemas sociales.",
                        "El decreto legal de un emperador omnipotente.",
                        "El azar ciego que opera sin ninguna ley de desarrollo.",
                        "La contradicción interna y el conflicto entre la afirmación (tesis) y la negación (antítesis) superadas en la síntesis (Aufhebung).",
                    ),
                    correctIndex = 3,
                    explanation = "En la dialéctica de Hegel, la contradicción es la raíz de todo movimiento y vitalidad; la oposición entre contrarios conduce dialécticamente a una síntesis superior que conserva y supera a la vez."
                ),
                Challenge(
                    id = "filo_t06_s02_c09",
                    question = "El Empirismo de John Locke rechazó las ideas innatas argumentando que si existieran ideas universales grabadas en el alma humana desde el nacimiento:",
                    options = listOf(
                        "Todos los gobiernos del planeta serían monarquías absolutas por derecho divino.",
                        "La física de Newton carecería de utilidad práctica para construir puentes.",
                        "Los niños, los ignorantes y las personas con discapacidades cognitivas severas las conocerían y expresarían con plena claridad de inmediato, cosa que la observación desmiente.",
                        "Los seres humanos no necesitarían alimentarse ni respirar oxígeno.",
                    ),
                    correctIndex = 2,
                    explanation = "Locke argumenta en el 'Ensayo sobre el entendimiento humano' que la falta de nociones lógicas o morales universales en niños y personas iletradas prueba que la mente no posee contenidos innatos."
                ),
                Challenge(
                    id = "filo_t06_s02_c10",
                    question = "Baruch Spinoza resolvió el dualismo cartesiano de mente y cuerpo formulando el 'Monismo de la Sustancia', el cual postula que:",
                    options = listOf(
                        "Solo existen los cuerpos materiales y el pensamiento es un engaño visual.",
                        "Existen múltiples sustancias independientes que no interactúan entre sí.",
                        "El alma de los animales es superior a la mente humana en cálculo numérico.",
                        "Existe una sola sustancia infinita (Dios o la Naturaleza), y el pensamiento y la extensión no son sustancias independientes, sino atributos paralelos de esa única realidad.",
                    ),
                    correctIndex = 3,
                    explanation = "Spinoza defiende el paralelismo psicofísico: el pensamiento y la extensión son dos atributos infinitos de una misma y única sustancia divina ('Deus sive Natura')."
                ),
            )
        )
    )
}
