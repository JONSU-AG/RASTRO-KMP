package literatura

object LiteraturaSemana01 {

    val lessons = listOf(
        LessonNode(
            id = "lit_t01_s01",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.1",
            title = "3.1. La Literatura y la Función Poética",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Teoría Literaria] --> B[Función Estética / Poética Roman Jakobson]
    B --> B1[Desvío del lenguaje estándar]
    B --> B2[Pacto ficcional y extrañamiento]
    B --> B3[Polisemia y connotación profunda]

    A --> C[Géneros Literarios Aristóteles / Preceptiva]
    C --> C1[Épico / Narrativo: Objetividad, narrador, diégesis]
    C --> C2[Lírico: Subjetividad, yo poético, emotividad]
    C --> C3[Dramático: Acción directa, diálogo, acotaciones, representación teatral]
    C --> C4[Didáctico / Ensayo: Reflexión crítica, argumentación estética]

    C1 --> C1a[Especies: Epopeya, Cantar de gesta, Mito, Novela, Cuento]
    C2 --> C2a[Especies: Oda, Elegía, Égloga, Madrigal, Epigrama, Yaraví]
    C3 --> C3a[Especies: Tragedia catarsis, Comedia risa crítica, Drama conflicto humano]

    A --> D[Figuras Literarias Retóricas]
    D --> D1[De Sentido / Tropos: Metáfora pura/impura, Símil, Metonimia, Sinécdoque]
    D --> D2[De Pensamiento: Antítesis, Paradoja, Hipérbole, Personificación/Prosopopeya]
    D --> D3[De Dicción y Sintaxis: Anáfora, Hipérbaton, Epíteto, Polisíndeton, Asíndeton]
```

---



## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA



### 3.1. La Literatura y la Función Poética
La **literatura** es un arte cuyo instrumento fundamental es la palabra oral o escrita. En el marco de la teoría lingüística de Roman Jakobson, en el hecho literario predomina la **función poética o estética**, donde el foco del acto comunicativo recae sobre la propia **forma del mensaje**.
- **La Literalidad (*Literariedad* de los formalistas rusos):** Conjunto de propiedades que transforman un discurso verbal común en una obra de arte, mediante el **extrañamiento** (*ostranenie* según Viktor Shklovski), desautomatizando la percepción cotidiana.
- **Pacto Ficcional:** Convención tácita entre autor y lector donde este último suspende temporalmente su incredulidad para aceptar como verosímil el universo representado, aun cuando carezca de correlato empírico directo.

---



### 3.2. Taxonomía de los Géneros Literarios

La división tripartita canónica se remonta a la *Poética* de Aristóteles:

| Género Literario | Perspectiva Predominante | Rasgos Definitorios | Especies Representativas |
| :--- | :--- | :--- | :--- |
| **Épico (Clásico) / Narrativo (Moderno)** | **Objetiva:** El autor contempla y relata acontecimientos externos reales o ficticios ocurridos en el pasado. | Presencia de un narrador; estructura cronotópica (tiempo y espacio); personajes y diégesis. La épica clásica se escribe en verso; la narrativa moderna, en prosa. | - **Epopeya:** Hazañas heroicas y deidades antiguas (*Ilíada*, *Odisea*).<br>- **Cantar de gesta:** Hazañas de caballeros medievales (*Cantar de Mio Cid*).<br>- **Novela:** Relato extenso, complejo y pluridimensional (*El Quijote*).<br>- **Cuento:** Relato breve, condensado, con tensión única (*El gato negro*). |
| **Lírico** | **Subjetiva:** Expresión del mundo interior, afectos, estados anímicos e impresiones del emisor. | Presencia de un **yo poético** o hablante lírico; ritmo, musicalidad, brevedad y alta densidad connotativa. Escrito predominantemente en verso. | - **Oda:** Poema de alabanza, entusiasmo o admiración.<br>- **Elegía:** Expresión de dolor ante la muerte o pérdida irreparable (*Coplas* de Manrique).<br>- **Égloga:** Poema pastoril idealizado en marco campestre bucólico (*Garcilaso*).<br>- **Madrigal:** Poema breve de amor no correspondido o galanteo.<br>- **Epigrama:** Poema breve satírico, mordaz o punzante.<br>- **Yaraví:** Composición lírica mestiza de origen quechua (harawi) sobre el desamor (Mariano Melgar). |
| **Dramático** | **Acción Directa y Dialógica:** No hay un narrador intermediario que relate los hechos; los personajes encarnan la historia. | Concebido para su **representación escénica** ante un público; uso de diálogos, monólogos y acotaciones teatrales (didascalias). | - **Tragedia:** Protagonistas nobles enfrentados a un destino inexorable (fatum); culmina en catástrofe y busca la purificación espiritual (**catarsis**). (*Edipo Rey*).<br>- **Comedia:** Enfoque cómico o satírico de la vida cotidiana; personajes vulgares; final feliz (*El avaro*, *Ña Catita*).<br>- **Drama (Tragicomedia):** Combina elementos trágicos y cómicos; refleja la condición humana real (*La vida es sueño*, *Fuenteovejuna*). |
| **Didáctico / Ensayo** | **Reflexiva y Argumentativa:** Exposición subjetiva y rigurosa de una tesis o juicio crítico. | Prosa argumentativa con voluntad de estilo artístico sin pretensión de exhaustividad técnica absoluta. Creado por Michel de Montaigne. | - **Ensayo:** *Pájinas libres* de Manuel González Prada.<br>- **Fábula:** Narración alegórica con moraleja explícita. |

---



## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES



## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL



## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS



### 1. Mnemotécnia de los Tres Géneros Aristotélicos: "E-L-D"
- **É**pico \longrightarrow **E**xterior / **E**ventos externos (Objetivo, narrador).
- **L**írico \longrightarrow **I**nterior / **I**ntimidad afectiva (Subjetivo, yo poético).
- **D**ramático \longrightarrow **D**iálogo / **D**irecto sobre tablas (Representación teatral).



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Confundir Épica con Género Dramático:**
   - *Trampa:* Decir que la *Ilíada* pertenece al género dramático porque hay diálogos entre Aquiles y Agamenón.
   - *Realidad Preuniversitaria:* La *Ilíada* es una **Epopeya** (Género Épico), porque los acontecimientos son narrados por un rapsoda u aedo épico omnisciente en verso hexámetro, no representados en un escenario teatral.
2. **Confundir Antítesis con Paradoja:**
   - *Antítesis:* Oposición lógica clara sin contradicción existencial (*El día es claro y la noche es oscura*).
   - *Paradoja:* Contradicción aparente que encierra una verdad conceptual profunda imposible de resolver formalmente (*Muero porque no muero*).
3. **Confundir la Tragedia con el Drama:**
   - La **Tragedia** está regida por la fatalidad del destino (*fatum*) y concluye invariablemente en aniquilación o castigo inevitable; el **Drama** permite el libre albedrío humano y yuxtapone lo risible con lo doloroso.

---



## 8. 5 PROBLEMAS RESUELTOS GRADUADOS



### Problema 1 (Nivel Básico: Identificación de Especies Líricas)
La composición poética que expresa lamento acongojado y dolor profundo por el fallecimiento de un ser querido se denomina:
- A) Oda
- B) Égloga
- C) Elegía
- D) Epigrama
- E) Madrigal

**Resolución:**
- La oda es un canto de exaltación o alabanza.
- La égloga es una composición bucólica de ambiente pastoril.
- El epigrama es un poema breve satírico.
- El madrigal es un poema de exaltación amorosa y galante.
- La **elegía** es la especie lírica destinada específicamente a manifestar el luto, la melancolía y el dolor por la muerte de un ser amado o una desgracia colectiva (*Coplas a la muerte de su padre* de Jorge Manrique).
**Respuesta:** **C**

---



### Problema 3 (Nivel Intermedio-Avanzado: Teoría Dramática Aristotélica)
En la preceptiva aristotélica sobre la tragedia clásica griega, el concepto de **catarsis** se define formalmente como:
- A) La transgresión de las leyes divinas por parte del héroe trágico.
- B) La intervención de los dioses para resolver un conflicto irresoluble.
- C) La purificación espiritual de las pasiones en el espectador mediante el terror y la compasión.
- D) El cambio súbito de la fortuna del protagonista de la felicidad a la desdicha.
- E) El enfrentamiento dialéctico entre el coro y los actores trágicos.

**Resolución:**
En la *Poética*, Aristóteles sostiene que la tragedia imita acciones graves y completas que, al suscitar en el público **compasión** (*éleos*) y **temor reverencial** (*phobos*), provocan la liberación, purga o purificación de los afectos y desgarros íntimos: la **catarsis** (*kátharsis*).
**Respuesta:** **C**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Acotación (Didascalia):** Indicación técnica que el dramaturgo inserta en el texto teatral entre paréntesis o cursivas para orientar la escenografía, gestos o movimientos de los actores.
2. **Antítesis:** Figura retórica que consiste en la yuxtaposición de dos ideas, palabras o frases de significados opuestos para realzar su vigor expresivo.
3. **Catarsis:** Purificación o sublimación moral y emocional del espectador provocada por el terror y la piedad tras contemplar la tragedia.
4. **Diégesis:** El universo ficticio, la trama o la historia en la que se desarrollan los acontecimientos relatados por un narrador.
5. **Égloga:** Subgénero lírico caracterizado por el diálogo idealizado de pastores sobre sus amores en un marco natural idílico (*locus amoenus*).
6. **Epíteto:** Adjetivo ornamental que resalta una característica propia, prototípica o consustancial del sustantivo al que acompaña.
7. **Hablante Lírico:** Voz ficticia o ente enunciativo que asume la expresión de los sentimientos y vivencias íntimas en el poema.
8. **Hipérbaton:** Figura sintáctica consistente en la alteración del orden gramatical natural y lógico de los elementos de la oración.
9. **Metáfora:** Tropo fundamental que traslada el significado de un término a otro mediante una analogía o cotejo implícito desprovisto de nexo conjuntivo.
10. **Símil:** Figura retórica que compara expresamente dos elementos diferentes valiéndose de un enlace comparativo explícito (*como, tal cual, parece*).

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Qué diferencia a la Epopeya del Cantar de Gesta? | La **epopeya** es de la Antigüedad clásica con intervención activa de dioses y mitos (*Ilíada*); el **cantar de gesta** es medieval, de carácter realista y con héroes caballerescos feudales (*Mio Cid*). |
| ¿Qué define al Género Dramático frente a la Épica? | En el género dramático **no hay narrador intermediario**; la historia se desarrolla a través de la acción dialógica y directa de los personajes en escena. |
| ¿Cuál es la diferencia formal entre Símil y Metáfora? | El **símil** lleva siempre un nexo comparativo explícito (*como, cual*); la **metáfora** establece una identificación analógica directa sin nexo comparativo. |
| ¿En qué consiste la Catarsis trágica según Aristóteles? | En la purificación y liberación de las pasiones del alma mediante la **compasión** (*éleos*) y el **terror** (*phobos*). |
| ¿Qué es un Hipérbaton? | La alteración deliberada del orden sintáctico habitual de la oración para lograr musicalidad y extrañamiento poético. |

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. *"El dulce néctar de tus labios encendió mi alma"*. La expresión *"dulce néctar"* constituye un ejemplo de:
   - A) Hipérbaton
   - B) Epíteto
   - C) Anáfora
   - D) Paradoja
   - *Respuesta correcta:* **B** (Adjetivo intrínseco ornamental que resalta una cualidad inherente).
2. Es la especie dramática que combina armónicamente elementos dolorosos y festivos de la vida humana:
   - A) Tragedia
   - B) Auto sacramental
   - C) Drama o tragicomedia
   - D) Comedia aristofánica
   - *Respuesta correcta:* **C** (Reflejo mestizo de la condición humana).
3. La obra de Jorge Manrique, *Coplas a la muerte de su padre*, pertenece a la especie lírica denominada:
   - A) Oda
   - B) Égloga
   - C) Elegía
   - D) Yaraví
   - *Respuesta correcta:* **C** (Lamento lírico fúnebre y meditativo).

---



# TEMA 01: CONCEPTOS FUNDAMENTALES DE LA LITERATURA: FUNCIÓN ESTÉTICA, GÉNEROS LITERARIOS Y FIGURAS RETÓRICAS

---



### 3.3. Figuras Literarias (Figuras Retóricas)

#### A. Figuras de Sentido o Tropos (Cambio de Significado)
1. **Metáfora:** Traslación del sentido recto de un vocablo a otro figurado mediante una relación de semejanza o analogía implícita:
   - *Metáfora Impura (A es B):* *"Nuestras vidas **son los ríos** que van a dar a la mar..."* (Jorge Manrique).
   - *Metáfora Pura (solo B en lugar de A):* *"La **luna de plata** surcaba el cielo"* (por la luna radiante).
2. **Símil (Comparación explícita):** Cotejo directo entre dos planos mediante nexos comparativos (*como, cual, tal, parece*):
   *"Tus ojos son **como** dos luceros en la noche oscura."*
3. **Metonimia:** Sustitución de un término por otro basada en relaciones de contigüidad espacial, causal o material:
   - Causa por efecto: *Vive de su sudor* (de su trabajo).
   - Autor por obra: *Compró un Picasso* (un cuadro de Picasso).
   - Continente por contenido: *Bebió una copa* (el líquido de la copa).
4. **Sinécdoque:** Variedad metonímica de inclusión cuantitativa (la parte por el todo o el todo por la parte):
   - *Ganarse el pan diario* (por el alimento).
   - *El estadio rugió* (los espectadores del estadio).

#### B. Figuras de Pensamiento (Contraste e Intensificación)
1. **Antítesis:** Contraposición dialéctica de dos ideas o palabras con significados opuestos:
   *"Es tan corto el amor y es tan largo el olvido."* (Pablo Neruda).
2. **Paradoja:** Unión aparente de dos conceptos irreconciliables que encierran una verdad poética profunda:
   *"Vivo sin vivir en mí, y tan alta vida espero, que muero porque no muero."* (Santa Teresa de Jesús).
3. **Hipérbole:** Exageración desmesurada de rasgos, dimensiones o acciones para impresionar la imaginación del lector:
   *"Érase un hombre a una nariz pegado..."* (Francisco de Quevedo).
   *"Tanto dolor se agrupa en mi costado, que por doler me duele hasta el aliento."* (Miguel Hernández).
4. **Prosopopeya (Personificación):** Atribución de facultades humanas o vitales a seres inanimados, conceptos abstractos o animales:
   *"La luna reía burlonamente tras las nubes de la cordillera."*

#### C. Figuras de Dicción y Sintaxis (Forma y Posición)
1. **Anáfora:** Reiteración rítmica de una o varias palabras al **comienzo** de versos o frases consecutivas:
   *"Temprano levantó la muerte el vuelo,*
   *temprano madrugó la madrugada,*
   *temprano estás rodando por el suelo."* (Miguel Hernández).
2. **Hipérbaton:** Alteración intencionada del orden sintáctico canónico de la oración (Sujeto + Verbo + Complementos):
   *"Volverán las oscuras golondrinas en tu balcón sus nidos a colgar."* (Gustavo Adolfo Bécquer).
   (Orden regular: *Las oscuras golondrinas volverán a colgar sus nidos en tu balcón*).
3. **Epíteto:** Adjetivo calificativo explicativo que destaca una cualidad intrínseca o consustancial del sustantivo:
   *"Por ti la **verde hierba**, el **fresco viento**, el **blanco lirio** y **colorada rosa**..."* (Garcilaso de la Vega).
4. **Polisíndeton vs. Asíndeton:**
   - *Polisíndeton:* Repetición deliberada de conjunciones coordinantes (*y, o, ni*) para dotar de solemnidad o lentitud al ritmo: *"Y sueña, y ama, y lucha, y vence"*.
   - *Asíndeton:* Omisión sistemática de conjunciones para dar dinamismo, velocidad o vértigo: *"Llegué, vi, vencí"* (*Veni, vidi, vici*).

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Lea con agudeza crítica la siguiente estrofa del poeta vanguardista César Vallejo:
> *"Hay golpes en la vida, tan fuertes... ¡Yo no sé!*
> *Golpes como del odio de Dios; como si ante ellos,*
> *la resaca de todo lo sufrido*
> *se empozara en el alma... ¡Yo no sé!"*

Determine la veracidad (V) o falsedad (F) de las siguientes afirmaciones teóricas:
I. Pertenece al género lírico y se evidencia la presencia de un hablante lírico desgarrado por el dolor existencial.
II. El verso *"Golpes como del odio de Dios"* estructura un símil que dimensiona metafísicamente la intensidad del sufrimiento.
III. Los versos 1 y 4 configuran una estructura de anáfora vertical continua estricta.
IV. La expresión *"la resaca de todo lo sufrido / se empozara en el alma"* constituye una poderosa metáfora que traslada una imagen física marina al ámbito psicológico espiritual.

- A) V - V - F - V
- B) V - V - V - V
- C) F - V - F - V
- D) V - F - V - F
- E) F - F - V - V

**Resolución Paso a Paso:**
- **Afirmación I (VERDADERA):** El poema *Los heraldos negros* pertenece al género lírico; el hablante lírico comunica en primera persona su desamparo existencial radical.
- **Afirmación II (VERDADERA):** La presencia del nexo comparativo explícito *"como"* une el dolor humano concreto con una magnitud teológica descomunal (*el odio de Dios*), constituyendo un **símil** de escala cósmica.
- **Afirmación III (FALSA):** La anáfora estricta exige la reiteración de una o varias palabras al **comienzo** de versos consecutivos inmediatos. La frase *¡Yo no sé!* se halla al **final** del verso 1 y al **final** del verso 4; se trata de una epífora o estribillo enmarcador, no de una anáfora canónica.
- **Afirmación IV (VERDADERA):** La "resaca" (sedimento y reflujo marino amargo) se proyecta sobre el "alma" como un depósito de dolor acumulado, configurando una **metáfora** de elevadísima densidad poética.
Secuencia correcta: **V - V - F - V**.
**Respuesta:** **A**

---



### Caso 1: Análisis del Discurso Poético de Mariano Melgar
En el *Yaraví IV* de Mariano Melgar leemos:
> *"Vuelve, que ya no puedo*
> *vivir sin tus cariños:*
> *vuelve mi palomita,*
> *vuelve a tu dulce nido."*

- **Género Literario:** Lírico (expresión de congoja y desgarro íntimo ante el desdén de Silvia).
- **Especie:** Yaraví (mestizaje entre la elegía hispánica y el *harawi* quechua prehispánico).
- **Figuras Retóricas Operativas:**
  1. *Anáfora:* Repetición imperativa y desesperada del verbo *"vuelve"* al inicio de los versos 1, 3 y 4.
  2. *Metáfora:* Identificación lírica de la amada Silvia con la *"palomita"* (símbolo andino del amor puro y esquivo: la *urpi*) y del hogar amoroso con el *"dulce nido"*.
  3. *Apóstrofe lírico:* Convocación angustiada a la interlocutora ausente.

---



### Problema 2 (Nivel Intermedio: Identificación de Figura Sintáctica)
En los versos de Góngora: *"Del salón en el ángulo oscuro, / de su dueña tal vez olvidada, / silenciosa y cubierta de polvo, / veíase el arpa"*, la figura retórica preponderante que afecta el orden sintáctico se denomina:
- A) Anáfora
- B) Hipérbaton
- C) Epíteto
- D) Metonimia
- E) Paradoja

**Resolución:**
El orden lógico habitual de la oración sería: *El arpa veíase silenciosa y cubierta de polvo en el ángulo oscuro del salón, tal vez olvidada de su dueña*. El poeta ha transpuesto y alterado deliberadamente la sintaxis ordinaria para generar tensión métrica y musicalidad. Dicha figura de construcción sintáctica es el **hipérbaton**.
**Respuesta:** **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "lit_t01_s01_c01",
                    question = "En la teoría literaria moderna formulada por Roman Jakobson, la función poética del lenguaje se caracteriza principalmente por:",
                    options = listOf(
                        "Centrar la atención en el propio mensaje por su configuración estética y estilística.",
                        "Transmitir información fáctica y verificable acerca del entorno extralingüístico.",
                        "Persuadir al receptor para que adopte una conducta o creencia determinada.",
                        "Verificar que el canal de comunicación permanezca abierto y operativo.",
                    ),
                    correctIndex = 0,
                    explanation = "La función poética o estética orienta el acto comunicativo hacia el mensaje mismo, seleccionando y combinando signos para generar belleza, extrañamiento y valor artístico formal."
                ),
                Challenge(
                    id = "lit_t01_s01_c02",
                    question = "¿Cuál de las siguientes composiciones líricas se caracteriza específicamente por ser un canto de lamento fúnebre ante la muerte de un ser querido o una pérdida irreparable?",
                    options = listOf(
                        "La elegía",
                        "La oda laudatoria",
                        "La égloga pastoril",
                        "El madrigal amoroso",
                    ),
                    correctIndex = 0,
                    explanation = "La elegía es una especie lírica de tono melancólico que expresa dolor, pesadumbre y duelo ante la muerte o una desgracia honda (ej. Coplas a la muerte de su padre de Jorge Manrique)."
                ),
                Challenge(
                    id = "lit_t01_s01_c03",
                    question = "En la preceptiva aristotélica expuesta en la Poética, la finalidad suprema de la tragedia clásica es la catarsis, entendida como:",
                    options = listOf(
                        "La purificación o purga espiritual de las pasiones en el espectador a través del terror y la compasión.",
                        "El desenlace funesto inevitable determinado por el capricho de los dioses olímpicos.",
                        "La resolución cómica de enredos mediante la intervención de un bufón o gracioso.",
                        "La ruptura de la cuarta pared para aleccionar moralmente a los ciudadanos atenienses.",
                    ),
                    correctIndex = 0,
                    explanation = "Aristóteles definió la catarsis (kátharsis) como la purificación espiritual de las emociones del público provocada al suscitar terror (phobos) y compasión (éleos) ante la catástrofe del héroe."
                ),
                Challenge(
                    id = "lit_t01_s01_c04",
                    question = "La especie del género épico que relata en verso las hazañas heroicas y bélicas de los caballeros medievales en defensa de su fe y su pueblo se denomina:",
                    options = listOf(
                        "Epopeya clásica",
                        "Cantar de gesta",
                        "Poema épico renacentista",
                        "Romance fronterizo",
                    ),
                    correctIndex = 1,
                    explanation = "Los cantares de gesta son poemas épicos medievales anónimos transmitidos por juglares que celebran a caballeros virtuosos e históricos (como el Cantar de Mio Cid o el Cantar de Roldán)."
                ),
                Challenge(
                    id = "lit_t01_s01_c05",
                    question = "Lea con atención los siguientes versos de Gustavo Adolfo Bécquer:\n«Volverán las oscuras golondrinas / en tu balcón sus nidos a colgar...»\nPor su contenido subjetivo e íntimo, donde se expresan emociones personales del yo poético, este texto pertenece al género:",
                    options = listOf(
                        "Épico",
                        "Dramático",
                        "Lírico",
                        "Narrativo",
                    ),
                    correctIndex = 2,
                    explanation = "El género lírico se distingue por la primacía de la interioridad subjetiva, la manifestación de vivencias afectivas y el predominio de la voz de un hablante lírico personal."
                ),
                Challenge(
                    id = "lit_t01_s01_c06",
                    question = "¿Cuál es el subgénero dramático nacido en la modernidad que combina elementos trágicos y cómicos con el fin de representar la vida humana de forma más fiel a la realidad?",
                    options = listOf(
                        "Drama (o tragicomedia)",
                        "Auto sacramental",
                        "Entremés",
                        "Sainete",
                    ),
                    correctIndex = 0,
                    explanation = "El drama o tragicomedia surge al romper la rígida separación clásica entre tragedia y comedia, mezclando pasiones solemnes con situaciones cotidianas o ligeras."
                ),
                Challenge(
                    id = "lit_t01_s01_c07",
                    question = "La composición lírica bucólica en la que pastores idealizados dialogan en medio de una naturaleza amena e incontaminada (locus amoenus) corresponde a:",
                    options = listOf(
                        "El epigrama",
                        "La epístola",
                        "La égloga",
                        "El soneto heroico",
                    ),
                    correctIndex = 2,
                    explanation = "La égloga es un subgénero poético de corte pastoril cultivado por Teócrito, Virgilio y magistralmente en España por Garcilaso de la Vega (Égloga I: Salicio y Nemoroso)."
                ),
                Challenge(
                    id = "lit_t01_s01_c08",
                    question = "En una obra teatral, las notas explicativas que el autor intercala entre paréntesis o cursivas para indicar los movimientos, entradas, salidas y tonos de los actores se denominan:",
                    options = listOf(
                        "Soliloquios",
                        "Apartes",
                        "Parlamentos",
                        "Acotaciones (o didascalias)",
                    ),
                    correctIndex = 3,
                    explanation = "Las acotaciones o didascalias son instrucciones del dramaturgo destinadas al director y actores para guiar la puesta en escena, gestualidad y escenografía."
                ),
                Challenge(
                    id = "lit_t01_s01_c09",
                    question = "La novela, el cuento y la fábula son especies literarias que pertenecen formalmente al género:",
                    options = listOf(
                        "Expositivo",
                        "Lírico",
                        "Narrativo",
                        "Dramático",
                    ),
                    correctIndex = 2,
                    explanation = "El género narrativo (evolución moderna de la épica en prosa) se estructura en torno a un narrador que relata acontecimientos ficticios protagonizados por personajes en un espacio y tiempo definidos."
                ),
                Challenge(
                    id = "lit_t01_s01_c10",
                    question = "El subgénero lírico que consiste en una composición poética breve, ingeniosa y habitualmente festiva o satírica con un remate mordaz se denomina:",
                    options = listOf(
                        "Himno",
                        "Epigrama",
                        "Oda",
                        "Madrigal",
                    ),
                    correctIndex = 1,
                    explanation = "El epigrama es un poema condensado y punzante que expresa con agudeza una burla, sátira moral o juicio ingenioso."
                ),
            )
        ),
        LessonNode(
            id = "lit_t01_s02",
            subjectId = "literatura",
            semana = 1,
            subtema = "1.2",
            title = "3.3. Figuras Literarias (Figuras Retóricas)",
            theory = LessonTheory(
                content = """# TEMA 01: CONCEPTOS FUNDAMENTALES DE LA LITERATURA: FUNCIÓN ESTÉTICA, GÉNEROS LITERARIOS Y FIGURAS RETÓRICAS

---



### 3.3. Figuras Literarias (Figuras Retóricas)

#### A. Figuras de Sentido o Tropos (Cambio de Significado)
1. **Metáfora:** Traslación del sentido recto de un vocablo a otro figurado mediante una relación de semejanza o analogía implícita:
   - *Metáfora Impura (A es B):* *"Nuestras vidas **son los ríos** que van a dar a la mar..."* (Jorge Manrique).
   - *Metáfora Pura (solo B en lugar de A):* *"La **luna de plata** surcaba el cielo"* (por la luna radiante).
2. **Símil (Comparación explícita):** Cotejo directo entre dos planos mediante nexos comparativos (*como, cual, tal, parece*):
   *"Tus ojos son **como** dos luceros en la noche oscura."*
3. **Metonimia:** Sustitución de un término por otro basada en relaciones de contigüidad espacial, causal o material:
   - Causa por efecto: *Vive de su sudor* (de su trabajo).
   - Autor por obra: *Compró un Picasso* (un cuadro de Picasso).
   - Continente por contenido: *Bebió una copa* (el líquido de la copa).
4. **Sinécdoque:** Variedad metonímica de inclusión cuantitativa (la parte por el todo o el todo por la parte):
   - *Ganarse el pan diario* (por el alimento).
   - *El estadio rugió* (los espectadores del estadio).

#### B. Figuras de Pensamiento (Contraste e Intensificación)
1. **Antítesis:** Contraposición dialéctica de dos ideas o palabras con significados opuestos:
   *"Es tan corto el amor y es tan largo el olvido."* (Pablo Neruda).
2. **Paradoja:** Unión aparente de dos conceptos irreconciliables que encierran una verdad poética profunda:
   *"Vivo sin vivir en mí, y tan alta vida espero, que muero porque no muero."* (Santa Teresa de Jesús).
3. **Hipérbole:** Exageración desmesurada de rasgos, dimensiones o acciones para impresionar la imaginación del lector:
   *"Érase un hombre a una nariz pegado..."* (Francisco de Quevedo).
   *"Tanto dolor se agrupa en mi costado, que por doler me duele hasta el aliento."* (Miguel Hernández).
4. **Prosopopeya (Personificación):** Atribución de facultades humanas o vitales a seres inanimados, conceptos abstractos o animales:
   *"La luna reía burlonamente tras las nubes de la cordillera."*

#### C. Figuras de Dicción y Sintaxis (Forma y Posición)
1. **Anáfora:** Reiteración rítmica de una o varias palabras al **comienzo** de versos o frases consecutivas:
   *"Temprano levantó la muerte el vuelo,*
   *temprano madrugó la madrugada,*
   *temprano estás rodando por el suelo."* (Miguel Hernández).
2. **Hipérbaton:** Alteración intencionada del orden sintáctico canónico de la oración (Sujeto + Verbo + Complementos):
   *"Volverán las oscuras golondrinas en tu balcón sus nidos a colgar."* (Gustavo Adolfo Bécquer).
   (Orden regular: *Las oscuras golondrinas volverán a colgar sus nidos en tu balcón*).
3. **Epíteto:** Adjetivo calificativo explicativo que destaca una cualidad intrínseca o consustancial del sustantivo:
   *"Por ti la **verde hierba**, el **fresco viento**, el **blanco lirio** y **colorada rosa**..."* (Garcilaso de la Vega).
4. **Polisíndeton vs. Asíndeton:**
   - *Polisíndeton:* Repetición deliberada de conjunciones coordinantes (*y, o, ni*) para dotar de solemnidad o lentitud al ritmo: *"Y sueña, y ama, y lucha, y vence"*.
   - *Asíndeton:* Omisión sistemática de conjunciones para dar dinamismo, velocidad o vértigo: *"Llegué, vi, vencí"* (*Veni, vidi, vici*).

---



### 4.1. Algoritmo de Identificación de Figuras Retóricas

\text{¿Existe nexo comparativo explícito (como, cual)?} \begin{cases} \text{SÍ} \longrightarrow \mathbf{S\acute{i}mil} \\ \text{NO} \longrightarrow \begin{cases} \text{¿Sustituye un término por semejanza conceptual?} \longrightarrow \mathbf{Met\acute{a}fora} \\ \text{¿Opone dos términos opuestos?} \longrightarrow \mathbf{Ant\acute{i}tesis} \\ \text{¿Altera el orden gramatical regular?} \longrightarrow \mathbf{Hip\acute{e}rbaton} \\ \text{¿Exagera una realidad desmesuradamente?} \longrightarrow \mathbf{Hip\acute{e}rbole} \end{cases} \end{cases}

---



### Caso 1: Análisis del Discurso Poético de Mariano Melgar
En el *Yaraví IV* de Mariano Melgar leemos:
> *"Vuelve, que ya no puedo*
> *vivir sin tus cariños:*
> *vuelve mi palomita,*
> *vuelve a tu dulce nido."*

- **Género Literario:** Lírico (expresión de congoja y desgarro íntimo ante el desdén de Silvia).
- **Especie:** Yaraví (mestizaje entre la elegía hispánica y el *harawi* quechua prehispánico).
- **Figuras Retóricas Operativas:**
  1. *Anáfora:* Repetición imperativa y desesperada del verbo *"vuelve"* al inicio de los versos 1, 3 y 4.
  2. *Metáfora:* Identificación lírica de la amada Silvia con la *"palomita"* (símbolo andino del amor puro y esquivo: la *urpi*) y del hogar amoroso con el *"dulce nido"*.
  3. *Apóstrofe lírico:* Convocación angustiada a la interlocutora ausente.

---



### 2. Hack de Oro: Símil vs. Metáfora
\text{Plano Real} + \mathbf{Nexo \ (como, \ cual, \ parece)} + \text{Plano Evocado} = \mathbf{S\acute{i}mil}
\text{Plano Real} + \mathbf{Verbo \ Ser \ o \ Nexo \ Nulo} + \text{Plano Evocado} = \mathbf{Met\acute{a}fora}

---



### Problema 2 (Nivel Intermedio: Identificación de Figura Sintáctica)
En los versos de Góngora: *"Del salón en el ángulo oscuro, / de su dueña tal vez olvidada, / silenciosa y cubierta de polvo, / veíase el arpa"*, la figura retórica preponderante que afecta el orden sintáctico se denomina:
- A) Anáfora
- B) Hipérbaton
- C) Epíteto
- D) Metonimia
- E) Paradoja

**Resolución:**
El orden lógico habitual de la oración sería: *El arpa veíase silenciosa y cubierta de polvo en el ángulo oscuro del salón, tal vez olvidada de su dueña*. El poeta ha transpuesto y alterado deliberadamente la sintaxis ordinaria para generar tensión métrica y musicalidad. Dicha figura de construcción sintáctica es el **hipérbaton**.
**Respuesta:** **B**

---



### Problema 4 (Nivel Avanzado: Figuras de Sentido y Tropos Complejos)
En la expresión poética: *"El Perú entero lloró la partida de su más insigne poeta"*, encontramos un caso emblemático de:
- A) Hipérbaton
- B) Metáfora pura
- C) Sinécdoque
- D) Antítesis
- E) Anáfora

**Resolución:**
La frase utiliza *"El Perú entero"* para designar a los habitantes o ciudadanos peruanos. Es la designación del **todo por la parte** (o el continente geográfico por los seres que lo pueblan). Dicha relación cuantitativa de inclusión es propia de la **sinécdoque** (tropo conexo a la metonimia).
**Respuesta:** **C**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Lea con agudeza crítica la siguiente estrofa del poeta vanguardista César Vallejo:
> *"Hay golpes en la vida, tan fuertes... ¡Yo no sé!*
> *Golpes como del odio de Dios; como si ante ellos,*
> *la resaca de todo lo sufrido*
> *se empozara en el alma... ¡Yo no sé!"*

Determine la veracidad (V) o falsedad (F) de las siguientes afirmaciones teóricas:
I. Pertenece al género lírico y se evidencia la presencia de un hablante lírico desgarrado por el dolor existencial.
II. El verso *"Golpes como del odio de Dios"* estructura un símil que dimensiona metafísicamente la intensidad del sufrimiento.
III. Los versos 1 y 4 configuran una estructura de anáfora vertical continua estricta.
IV. La expresión *"la resaca de todo lo sufrido / se empozara en el alma"* constituye una poderosa metáfora que traslada una imagen física marina al ámbito psicológico espiritual.

- A) V - V - F - V
- B) V - V - V - V
- C) F - V - F - V
- D) V - F - V - F
- E) F - F - V - V

**Resolución Paso a Paso:**
- **Afirmación I (VERDADERA):** El poema *Los heraldos negros* pertenece al género lírico; el hablante lírico comunica en primera persona su desamparo existencial radical.
- **Afirmación II (VERDADERA):** La presencia del nexo comparativo explícito *"como"* une el dolor humano concreto con una magnitud teológica descomunal (*el odio de Dios*), constituyendo un **símil** de escala cósmica.
- **Afirmación III (FALSA):** La anáfora estricta exige la reiteración de una o varias palabras al **comienzo** de versos consecutivos inmediatos. La frase *¡Yo no sé!* se halla al **final** del verso 1 y al **final** del verso 4; se trata de una epífora o estribillo enmarcador, no de una anáfora canónica.
- **Afirmación IV (VERDADERA):** La "resaca" (sedimento y reflujo marino amargo) se proyecta sobre el "alma" como un depósito de dolor acumulado, configurando una **metáfora** de elevadísima densidad poética.
Secuencia correcta: **V - V - F - V**.
**Respuesta:** **A**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Acotación (Didascalia):** Indicación técnica que el dramaturgo inserta en el texto teatral entre paréntesis o cursivas para orientar la escenografía, gestos o movimientos de los actores.
2. **Antítesis:** Figura retórica que consiste en la yuxtaposición de dos ideas, palabras o frases de significados opuestos para realzar su vigor expresivo.
3. **Catarsis:** Purificación o sublimación moral y emocional del espectador provocada por el terror y la piedad tras contemplar la tragedia.
4. **Diégesis:** El universo ficticio, la trama o la historia en la que se desarrollan los acontecimientos relatados por un narrador.
5. **Égloga:** Subgénero lírico caracterizado por el diálogo idealizado de pastores sobre sus amores en un marco natural idílico (*locus amoenus*).
6. **Epíteto:** Adjetivo ornamental que resalta una característica propia, prototípica o consustancial del sustantivo al que acompaña.
7. **Hablante Lírico:** Voz ficticia o ente enunciativo que asume la expresión de los sentimientos y vivencias íntimas en el poema.
8. **Hipérbaton:** Figura sintáctica consistente en la alteración del orden gramatical natural y lógico de los elementos de la oración.
9. **Metáfora:** Tropo fundamental que traslada el significado de un término a otro mediante una analogía o cotejo implícito desprovisto de nexo conjuntivo.
10. **Símil:** Figura retórica que compara expresamente dos elementos diferentes valiéndose de un enlace comparativo explícito (*como, tal cual, parece*).

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. *"El dulce néctar de tus labios encendió mi alma"*. La expresión *"dulce néctar"* constituye un ejemplo de:
   - A) Hipérbaton
   - B) Epíteto
   - C) Anáfora
   - D) Paradoja
   - *Respuesta correcta:* **B** (Adjetivo intrínseco ornamental que resalta una cualidad inherente).
2. Es la especie dramática que combina armónicamente elementos dolorosos y festivos de la vida humana:
   - A) Tragedia
   - B) Auto sacramental
   - C) Drama o tragicomedia
   - D) Comedia aristofánica
   - *Respuesta correcta:* **C** (Reflejo mestizo de la condición humana).
3. La obra de Jorge Manrique, *Coplas a la muerte de su padre*, pertenece a la especie lírica denominada:
   - A) Oda
   - B) Égloga
   - C) Elegía
   - D) Yaraví
   - *Respuesta correcta:* **C** (Lamento lírico fúnebre y meditativo).

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Teoría Literaria] --> B[Función Estética / Poética Roman Jakobson]
    B --> B1[Desvío del lenguaje estándar]
    B --> B2[Pacto ficcional y extrañamiento]
    B --> B3[Polisemia y connotación profunda]

    A --> C[Géneros Literarios Aristóteles / Preceptiva]
    C --> C1[Épico / Narrativo: Objetividad, narrador, diégesis]
    C --> C2[Lírico: Subjetividad, yo poético, emotividad]
    C --> C3[Dramático: Acción directa, diálogo, acotaciones, representación teatral]
    C --> C4[Didáctico / Ensayo: Reflexión crítica, argumentación estética]

    C1 --> C1a[Especies: Epopeya, Cantar de gesta, Mito, Novela, Cuento]
    C2 --> C2a[Especies: Oda, Elegía, Égloga, Madrigal, Epigrama, Yaraví]
    C3 --> C3a[Especies: Tragedia catarsis, Comedia risa crítica, Drama conflicto humano]

    A --> D[Figuras Literarias Retóricas]
    D --> D1[De Sentido / Tropos: Metáfora pura/impura, Símil, Metonimia, Sinécdoque]
    D --> D2[De Pensamiento: Antítesis, Paradoja, Hipérbole, Personificación/Prosopopeya]
    D --> D3[De Dicción y Sintaxis: Anáfora, Hipérbaton, Epíteto, Polisíndeton, Asíndeton]
```

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "lit_t01_s02_c01",
                    question = "En los versos de Jorge Manrique: «Nuestras vidas son los ríos / que van a dar en la mar, / que es el morir», la figura literaria predominante es:",
                    options = listOf(
                        "Hipérbaton",
                        "Sinestesia",
                        "Metáfora impura",
                        "Símil o comparación",
                    ),
                    correctIndex = 2,
                    explanation = "Se trata de una metáfora impura porque identifica de manera directa el término real A («vidas») con el término imaginario B («ríos») mediante el verbo copulativo ser (A es B)."
                ),
                Challenge(
                    id = "lit_t01_s02_c02",
                    question = "En la expresión poética: «El Perú entero lloró la partida de su más insigne poeta», se identifica un claro ejemplo de:",
                    options = listOf(
                        "Paradoja",
                        "Sinécdoque",
                        "Anáfora",
                        "Pleonasmo",
                    ),
                    correctIndex = 1,
                    explanation = "La sinécdoque es un tropo que designa el todo por la parte o el continente por el contenido (aquí «el Perú entero» designa a todos los habitantes peruanos)."
                ),
                Challenge(
                    id = "lit_t01_s02_c03",
                    question = "¿Cuál es la figura retórica consistente en alterar el orden sintáctico habitual de las palabras en una oración (sujeto + verbo + complementos)?",
                    options = listOf(
                        "Polisíndeton",
                        "Asíndeton",
                        "Hipérbole",
                        "Hipérbaton",
                    ),
                    correctIndex = 3,
                    explanation = "El hipérbaton invierte la disposición lógica o gramatical estándar de las palabras en el verso, como en «Del salón en el ángulo oscuro» (G. A. Bécquer)."
                ),
                Challenge(
                    id = "lit_t01_s02_c04",
                    question = "En el verso satírico de Francisco de Quevedo: «Érase un hombre a una nariz pegado», la figura retórica dominante es:",
                    options = listOf(
                        "Epíteto",
                        "Hipérbole",
                        "Antítesis",
                        "Elipsis",
                    ),
                    correctIndex = 1,
                    explanation = "La hipérbole es una exageración desmedida y magnificada de la realidad con fines expresivos o caricaturescos."
                ),
                Challenge(
                    id = "lit_t01_s02_c05",
                    question = "Identifique la figura retórica presente en la siguiente frase: «Compró un auténtico Picasso en la subasta de arte»:",
                    options = listOf(
                        "Sinécdoque",
                        "Símil",
                        "Prosopopeya",
                        "Metonimia",
                    ),
                    correctIndex = 3,
                    explanation = "La metonimia sustituye un término por otro con base en una relación causal o de contigüidad material; en este caso, se nombra al autor («Picasso») en lugar de la obra producida (un cuadro de Picasso)."
                ),
                Challenge(
                    id = "lit_t01_s02_c06",
                    question = "En los versos: «Vivo sin vivir en mí, / y tan alta vida espero, / que muero porque no muero» de Santa Teresa de Jesús, la figura central es:",
                    options = listOf(
                        "El oxímoron sensorial",
                        "La paradoja",
                        "La hipérbole épica",
                        "La antítesis simple",
                    ),
                    correctIndex = 1,
                    explanation = "La paradoja armoniza dos ideas aparentemente incompatibles o contradictorias en un plano lógico estricto para revelar una verdad mística o vivencial profunda."
                ),
                Challenge(
                    id = "lit_t01_s02_c07",
                    question = "La reiteración voluntaria de una o varias palabras al inicio de versos sucesivos o frases consecutivas se denomina:",
                    options = listOf(
                        "Anáfora",
                        "Concatenación",
                        "Epífora",
                        "Aliteración",
                    ),
                    correctIndex = 0,
                    explanation = "La anáfora es una figura de dicción que aporta ritmo y énfasis acústico repitiendo vocablos al comienzo de dos o más cláusulas o versos."
                ),
                Challenge(
                    id = "lit_t01_s02_c08",
                    question = "En la frase «ardiente fuego» o «blanca nieve», el empleo de un adjetivo inherente que resalta una cualidad intrínseca y prototípica del sustantivo constituye un:",
                    options = listOf(
                        "Tropos",
                        "Silepsis",
                        "Oxímoron",
                        "Epíteto",
                    ),
                    correctIndex = 3,
                    explanation = "El epíteto es un adjetivo explicativo que subraya una propiedad esencial ya consustancial al sustantivo, con fines estilísticos y estéticos."
                ),
                Challenge(
                    id = "lit_t01_s02_c09",
                    question = "La supresión deliberada de conjunciones coordinantes entre elementos oracionales para dotar al texto de rapidez, dinamismo y vehemencia («Llegué, vi, vencí») es:",
                    options = listOf(
                        "Polisíndeton",
                        "Anacoluto",
                        "Elipsis",
                        "Asíndeton",
                    ),
                    correctIndex = 3,
                    explanation = "El asíndeton prescinde de los nexos copulativos (como «y»), produciendo un ritmo acelerado y enérgico en el discurso."
                ),
                Challenge(
                    id = "lit_t01_s02_c10",
                    question = "La atribución de cualidades humanas, sentimientos o acciones voluntarias a seres inanimados o animales («El viento gemía en la noche fría») se denomina:",
                    options = listOf(
                        "Sinestesia",
                        "Hipálage",
                        "Personificación o prosopopeya",
                        "Alegoría",
                    ),
                    correctIndex = 2,
                    explanation = "La personificación o prosopopeya traslada atributos propios de los seres humanos (gemir, llorar, hablar) a entidades naturales, objetos abstractos o cosas inertes."
                ),
            )
        )
    )
}
