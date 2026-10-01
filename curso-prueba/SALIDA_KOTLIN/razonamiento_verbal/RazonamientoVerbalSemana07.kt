package razonamiento_verbal

object RazonamientoVerbalSemana07 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t07_s01",
            subjectId = "razonamiento_verbal",
            semana = 7,
            subtema = "7.1",
            title = "3.1 Los Principales Vicios de Sentido en el Examen de Admisión",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Detección de incoherencias semánticas:** Localizar colisiones de significado, contradicciones internas o falsos sentidos en enunciados breves.
2. **Erradicación de redundancias y pleonasmos:** Identificar y suprimir términos que repiten innecesariamente un sema ya expresado en el núcleo oracional (*lapso de tiempo, subir arriba*).
3. **Selección de la palabra exacta (Propiedad léxica):** Sustituir vocablos coloquiales o vagos por términos técnicos precisos adecuados al registro académico.
4. **Corrección de discordancias lógico-sintácticas:** Subsanar falsas concordancias de sentido, anfibologías y solecismos que distorsionan el mensaje.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                         CORRECCIÓN POR SENTIDO
                                   │
         ┌─────────────────────────┼─────────────────────────┐
         ▼                         ▼                         ▼
INCOHERENCIA SEMÁNTICA       REDUNDANCIA VICIOSA       IMPRECISIÓN LÉXICA
(Colisión de Sentido)         (Semas Duplicados)       (Pobreza de Vocabulario)
         │                         │                         │
   ┌─────┴─────┐             ┌─────┴─────┐             ┌─────┴─────┐
   ▼           ▼             ▼           ▼             ▼           ▼
Contradicción  Anfibología   Pleonasmo   Tautología    Verbos      Términos
Interna        Sintáctica    Vicioso     Léxica        Comodín     Baúl
("Gélido       ("Vio al      ("Volver a  ("Mendrugo    (Tener,     (Cosa,
 ardor")       perro...")    repetir")   de pan")      Hacer)      Algo)
```



### Ontología de la Norma Lingüística y la Semántica
- **Propiedad Léxica:** Uso de cada palabra con su significado exacto y castizo, conforme a las definiciones académicas de la RAE y la ASALE.
- **Incoherencia Semántica:** Defecto por el cual dos o más vocablos de un enunciado se anulan mutuamente en sus rasgos distintivos (Sema_1 \land \neg Sema_1).
- **Pleonasmo Vicioso:** Repetición injustificada y viciosa de una misma idea con palabras distintas que no aportan ningún matiz expresivo legítimo.
- **Tautología:** Definición o explicación viciosa que reitera lo mismo con vocablos equivalentes sin añadir contenido cognitivo.
- **Monotonía o Pobreza Léxica:** Empleo reiterado de un repertorio léxico reducido y rudimentario que empobrece la comunicación.

---



### 3.1 Los Principales Vicios de Sentido en el Examen de Admisión

#### A. Redundancias Léxicas y Pleonasmos Comunes
En el examen de la UNSA, la comisión evalúa sistemáticamente expresiones viciosas enquistadas en el habla cotidiana:

| Expresión Viciosa Popular | Por qué es Redundante | Corrección Culta Formal |
| :--- | :--- | :--- |
| *Lapso de tiempo* | Un *lapso* es por definición un período de tiempo. | **Lapso** o **período** |
| *Volver a repetir* | *Repetir* ya significa volver a hacer o decir algo. | **Repetir** |
| *Hemorragia de sangre* | Toda *hemorragia* es flujo copioso de sangre. | **Hemorragia** |
| *Erario público* | El *erario* es el tesoro o patrimonio público del Estado. | **Erario** |
| *Jauría de perros* | Una *jauría* es por definición un conjunto de perros o lobos. | **Jauría** |
| *Completamente gratis* | La condición de *gratis* no admite gradación: se paga o no. | **Gratis** |
| *Previsto de antemano* | *Prever* implica etimológicamente ver antes. | **Previsto** |
| *Bifurcarse en dos caminos* | *Bifurcarse* significa dividirse en dos ramales (*bi-*). | **Bifurcarse** |

#### B. La Incoherencia Semántica (Colisión Lógica)
Se produce cuando los atributos asignados a un sujeto son incompatibles con su naturaleza:
- *Enunciado incoherente:* *"El testigo permaneció en un **absoluto mutismo**, expresando con voz firme su inocencia"*.
  - Colisión: El *mutismo* es el silencio voluntario o involuntario. No se puede estar en mutismo y hablar con voz firme al mismo tiempo.
  - *Corrección:* *"El testigo rompió su mutismo y proclamó con voz firme su inocencia"*.

#### C. La Imprecisión Léxica y los "Verbos Comodín"
El enriquecimiento del vocabulario universitario radica en sustituir los cuatro verbos universales del habla descuidada (*dar, tener, poner, hacer*):

\begin{array}{rcl}
\text{Tener} \text{ síntomas} & \implies & \textbf{Manifestar / Presentar} \text{ síntomas} \\
\text{Dar} \text{ miedo} & \implies & \textbf{Infundir / Provocar} \text{ pavor} \\
\text{Hacer} \text{ un túnel} & \implies & \textbf{Excavar / Perforar} \text{ un túnel} \\
\text{Poner} \text{ una queja} & \implies & \textbf{Interponer / Formular} \text{ una queja} \\
\text{Tener} \text{ dudas} & \implies & \textbf{Albergar / Abrigarse de} \text{ dudas} \\
\text{Echar} \text{ a un trabajador} & \implies & \textbf{Despedir / Destituir} \text{ a un trabajador}
\end{array}



## 4. FORMULARIO MAESTRO DE CORRECCIÓN ESTILÍSTICA

| Defecto de Sentido | Prueba Diagnóstica Inmediata | Algoritmo de Corrección |
| :--- | :--- | :--- |
| **Pleonasmo** | ¿Si elimino la palabra, se pierde alguna información esencial? | Si la respuesta es NO, elimina la palabra redundante de inmediato. |
| **Imprecisión** | ¿El verbo empleado describe la técnica exacta de la acción? | Sustituye el verbo por el término científico o específico de la disciplina. |
| **Anfibología** | ¿El pronombre posesivo (*su*) o el modificador admite dos dueños? | Reordena la sintaxis o especifica el nombre (*"el auto de Juan"*). |
| **Incoherencia** | ¿Existe un choque formal entre el sustantivo y su adjetivo? | Modifica el adjetivo por uno compatible con el semema nuclear. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "La Tijera de Ockham Léxica"
*"Si dos palabras dicen exactamente lo mismo, una de ellas sobra por mandato de la elegancia"*:
- *Subir arriba* \to ¡Corta *arriba*!
- *Entrar adentro* \to ¡Corta *adentro*!
- *Mendrugo de pan* \to ¡Corta *de pan* (el mendrugo siempre es de pan)!
- *Persona humana* \to ¡Corta *humana* (en derecho natural y lenguaje cotidiano la persona es humana)!



### Mnemotecnia 2: "El Semáforo de la Precisión"
- 🔴 **Rojo (Peligro):** Usar *cosa, algo, hacer, tener, poner*.
- 🟡 **Amarillo (Neutro):** Usar *realizar, fabricar, poseer*.
- 🟢 **Verde (Nivel Universidad de Élite):** Usar *redactar, cincelar, perpetrar, compilar, ostentar, conjeturar*.

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Pleonasmo Retórico Literario Aceptado vs. El Vicioso**
> En poesía o literatura, la RAE tolera pleonasmos enfáticos con valor estético: *"Lo vi con mis propios ojos"*, *"Lloró con amargo llanto"*. Sin embargo, en el examen de admisión de Aptitud Académica, salvo que te especifiquen que se analiza una figura poética, todo pleonasmo es clasificado como **vicio de redacción y redundancia a eliminar**.

> [!CAUTION]
> **Trampa 2: La Falsa Sinonimia entre "Ostentar" y "Detentar"**
> - **Ostentar:** Exhibir con orgullo, legítimamente o con lucimiento algo que se posee (*"El catedrático ostenta el grado de doctor"*).
> - **Detentar:** Retener o ejercer un poder o cargo de manera **ilegítima o usurpadora** (*"El dictador detenta el poder tras el golpe militar"*).
> En preguntas de precisión léxica, usar *detentar* como simple sinónimo neutral de *ocupar un cargo* es un distractor de alta mortalidad.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Detección de Pleonasmo Vicioso)
**Enunciado:** Identifique la oración que contiene una redundancia viciosa que afecta la corrección por sentido:
A) El testigo relató los hechos con admirable serenidad.  
B) El arqueólogo descubrió una osamenta de huesos en la tumba real.  
C) La comisión evaluadora publicó los resultados oficiales del concurso.  
D) Los científicos examinaron las muestras recolectadas en la Antártida.  
E) El conferencista disertó sobre los desafíos de la inteligencia artificial.  

**Resolución Paso a Paso:**
1. Analizamos minuciosamente el léxico de cada alternativa:
   - En la opción B: *"descubrió una osamenta de huesos"*.
   - Definición lexicográfica de **osamenta** según la RAE: "Conjunto de los huesos que forman el esqueleto de un ser humano o animal".
   - Por definición semántica intrínseca, una osamenta está compuesta necesariamente por huesos; no existe una osamenta de madera o metal.
   - Añadir *"de huesos"* es un pleonasmo vicioso y redundante que no aporta ningún dato semántico nuevo.
2. Las restantes opciones muestran un uso pulcro, sobrio y normativo del vocabulario.
**Respuesta:** B

---



### Ejercicio 2 (Nivel Intermedio: Precisión Léxica y Verbos Comodín)
**Enunciado (Modelo Admisión UNSA):** Seleccione la opción que corrige el enunciado con la mayor precisión léxica:
*"El cabecilla de la banda delictiva LOGRÓ HACER un plan maestro para fugar de la prisión de máxima seguridad."*
A) consiguió tramar  
B) ideó un plan maestro  
C) ejecutó un proyecto  
D) hizo la estructura  
E) pensó un croquis  

**Resolución Paso a Paso:**
1. Analizamos la expresión coloquial *"logró hacer un plan maestro"*:
   - "Hacer un plan" recurre al verbo comodín baúl *hacer*.
   - En el plano intelectual y estratégico, concebir mentalmente un plan o proyecto complejo se expresa con verbos como *idear, concebir, urdir, diseñar o trazar*.
2. Evaluamos la elegancia sintáctica y concisión:
   - *"Ideó un plan maestro"* sintetiza la operación mental en un solo verbo culto, exacto y vigoroso.
   - *Idear* significa: "Formar y disponer en la mente un plan para conseguir un fin".
3. Por tanto, la opción B es la fórmula óptima de precisión léxica.
**Respuesta:** B

---



### Ejercicio 4 (Nivel Avanzado DECO: Corrección Integral de Párrafo Periodístico)
**Enunciado (Tipo San Marcos DECO / UNSA):** Lea el siguiente texto con vicios de redacción:
*"El alcalde provincial inauguró una obra que la misma costó millones del erario público del Estado, donde los vecinos se quejaron de que no había agua potable en sus casas de ellos."*
¿Cuál es la versión debidamente corregida, libre de queísmo, redundancias y ambigüedades?
A) El alcalde provincial inauguró una obra que costó millones del erario, en la cual los vecinos se quejaron porque no tenían agua potable en sus casas.  
B) El alcalde provincial inauguró una obra de la cual la misma costó millones del erario público, donde los vecinos reclamaron por el agua.  
C) El burgomaestre inauguró una obra costosa del erario del Estado en donde los vecinos de ellos no tenían agua en sus domicilios.  
D) Habiendo inaugurado la obra que costó millones del erario público, el alcalde vio que los vecinos no tenían agua en sus casas de ellos.  
E) El alcalde inauguró la obra costosa del erario, donde los mismos vecinos se quejaron de la falta de agua en las casas de ellos.  

**Resolución Paso a Paso:**
1. Identificamos los vicios del texto original:
   - Uso vicioso de *la misma* como pronombre anafórico.
   - Redundancia pleonástica en *"erario público del Estado"* (*erario* ya es el tesoro público del Estado).
   - Empleo incorrecto del adverbio relativo de lugar *donde* para introducir una circunstancia oracional que no es un espacio físico medible.
   - Dequeísmo vicioso en *"se quejaron de que"* (o construcción defectuosa) y pleonasmo redundante vulgar en *"sus casas de ellos"*.
2. Evaluamos la opción A:
   - Sustituye *"la misma"* por el pronombre relativo simple *que*.
   - Corrige *"erario público del Estado"* dejándolo con sobriedad en **el erario**.
   - Reemplaza el vicioso *donde* por el conector relativo adecuado **en la cual**.
   - Elimina la duplicación posesiva vulgar *"de ellos"* dejando simplemente **sus casas**.
3. La alternativa A restituye la impecabilidad gramatical y semántica total.
**Respuesta:** A

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación de Términos Parónimos y de Registro Culto)
**Enunciado (Nivel UNI / Máxima Exigencia):** Seleccione el enunciado que utiliza los vocablos con absoluta **propiedad léxica y adecuación semántica**, libre de cualquier error de sentido o confusión paronímica:
A) El juez penal absolvió al reo confeso porque las pruebas presentadas por la fiscalía adolecían de total validez.  
B) Tras el golpe militar, el dictador procedió a detentar ilegítimamente la presidencia de la república, conculcando las libertades civiles.  
C) El ministro de Salud advirtió que el virus presentaba un carácter inocuo sumamente mortífero para los ancianos.  
D) El fiscal provincial procedió a incautar los documentos que infringían un daño económico irreparable a la empresa.  
E) La asamblea universitaria aprobó por unanimidad la iniciativa, a pesar del escepticismo de la totalidad de sus miembros.  

**Resolución Paso a Paso:**
1. Analizamos la opción A: *"adolecían de total validez"*. El verbo *adolecer* significa "tener o padecer un defecto o enfermedad", no equivale a "carecer". Si una prueba "adolece de validez", significa erróneamente que tener validez es un defecto. Además, absolver a un "reo confeso" presenta inconsistencia de motivación judicial.
2. Analizamos la opción C: *"carácter inocuo sumamente mortífero"*. *Inocuo* significa que no hace daño; calificarlo de "sumamente mortífero" es una contradicción semántica directa.
3. Analizamos la opción D: *"infringían un daño"*. Se dice *infligir* daño (causar un daño o castigo), mientras que *infringir* significa quebrantar una ley o norma jurídica.
4. Analizamos la opción E: *"aprobó por unanimidad [...], a pesar del escepticismo de la totalidad"*. Si hubo escepticismo de la totalidad, no pudo aprobarse por unanimidad (colisión lógica).
5. Analizamos la opción B:
   - *Detentar:* Retener o ejercer un poder o cargo de manera usurpadora o sin título legítimo. El texto dice: *"el dictador procedió a detentar ilegítimamente la presidencia tras un golpe militar"*. El uso es impecable.
   - *Conculcar:* Quebrantar, vulnerar o atropellar una ley, fuero o derecho. Se usa con rigor formal insuperable.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Propiedad Léxica:** Uso de las palabras con el significado exacto y preciso asignado por la norma culta.
2. **Pleonasmo Vicioso:** Repetición innecesaria de ideas o semas que no aportan valor expresivo ni poético.
3. **Incoherencia Semántica:** Contradicción lógica interna que anula el sentido de un enunciado.
4. **Anfibología:** Ambigüedad generada por un orden sintáctico defectuoso que admite dos interpretaciones.
5. **Solecismo:** Error que atenta contra las reglas de concordancia, régimen preposicional o sintaxis.
6. **Dequeísmo:** Inserción indebida de la preposición "de" antes de la conjunción "que" en oraciones subordinadas sustantivas.
7. **Queísmo:** Supresión incorrecta de la preposición "de" (u otra) cuando es exigida por el verbo de régimen.
8. **Detentar:** Ejercer ilegítimamente un cargo, mando o poder público sin derecho legal.
9. **Ostentar:** Exhibir con legitimo derecho, orgullo o prestancia un título o cargo público.
10. **Infligir:** Causar o imponer un daño físico, castigo o pena a alguien.

---



### 3.2 Discordancias Gramaticales que Alteran el Sentido
1. **Discordancia de Número o Género Colectivo:**
   - *Incorrecto:* *"La mayoría de estudiantes desaprobaron el examen"*.
   - *Correcto con sentido singular estricto:* *"La mayoría de estudiantes desaprobó el examen"*.
2. **El "Dequeísmo" y "Queísmo":**
   - *Dequeísmo vicioso:* *"Pienso de que la economía mejorará"* (Lo correcto es: *"Pienso que..."*).
   - *Queísmo por supresión indebida:* *"Me convencí que tenía razón"* (Lo correcto es: *"Me convencí de que..."*).
3. **El Mal Uso del Adjetivo "Mismo":**
   - No debe emplearse *mismo* como pronombre anafórico sustituto de persona o cosa:
   - *Incorrecto:* *"Se aprobó el proyecto de ley y se ordenó la promulgación del mismo"*.
   - *Correcto:* *"Se aprobó el proyecto de ley y se ordenó su promulgación"*.

---



### Hack 1: La Prueba de la Doble Negación en el "Dequeísmo"
¿Dudas si una oración lleva "de que" o solo "que"?:
1. Transforma toda la proposición subordinada en la pregunta: **¿DE QUÉ...?** o **¿QUÉ...?**:
   - Oración: *"Él me dijo [de que vendría / que vendría]"*.
   - Pregunta de prueba: *¿Qué me dijo?* (Correcto) vs. *¿De qué me dijo?* (Absurdo).
   - Como la pregunta natural es *¿Qué me dijo?*, la respuesta correcta es: *"Él me dijo **que** vendría"*.
   - Caso contrario: *"Él se acordó [de que vendría]"* \to Pregunta: *¿De qué se acordó?* \to Lleva **de que** obligatoriamente.



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Por qué la frase "un lapso de dos horas de tiempo" es un pleonasmo vicioso?**  
  **A:** Porque "lapso" significa por definición período de tiempo; añadir "de tiempo" es una reiteración inútil.
- **Q: ¿Qué diferencia existe entre "infligir" e "infringir"?**  
  **A:** "Infligir" es causar daño o castigo; "infringir" es violar o quebrantar una norma o ley.
- **Q: ¿Cómo se comprueba si una oración contiene dequeísmo?**  
  **A:** Reemplazando la proposición por una pregunta: si la pregunta natural es "¿Qué?" (y no "¿De qué?"), el "de" es un dequeísmo que debe eliminarse.
- **Q: ¿Por qué es un error decir "Se reunió el comité y el mismo acordó suspender la huelga"?**  
  **A:** Porque la RAE desaconseja terminantemente usar "el mismo" como pronombre anafórico; debe sustituirse por un pronombre personal o posesivo ("y este acordó...").
- **Q: ¿Qué significa el verbo "adolecer" en el registro culto formal?**  
  **A:** Significa tener un defecto, vicio o padecer una enfermedad; no es sinónimo de "carecer".

---



### Hack 2: Rastreo del "Sujeto Fantasma" en Anfibologías
En oraciones como *"El perro mordió al cazador en su casa"*:
- ¿En la casa de quién? ¿Del perro o del cazador?
- Para desambiguar en el examen, busca la alternativa que coloque el complemento circunstancial de lugar pegado directamente al sustantivo que modifica: *"En su propia casa, el cazador fue mordido por el perro"*.

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Incoherencia Semántica Interna)
**Enunciado:** ¿Cuál de los siguientes enunciados incurre en una flagrante **incoherencia semántica**?
A) A pesar de su juventud inexperta, demostró una madurez sobresaliente en la toma de decisiones.  
B) El anciano filósofo guardó un riguroso silencio y explicó detalladamente las premisas del silogismo.  
C) El caudal del río Chili creció intempestivamente debido a las lluvias estivales en la cordillera.  
D) La economía regional experimentó un crecimiento sostenido durante el último quinquenio.  
E) El congresista declinó la invitación por razones estrictamente personales.  

**Resolución Paso a Paso:**
1. Analizamos el sentido lógico interno de la opción B:
   - Proposición 1: *"El anciano filósofo guardó un riguroso silencio"*. (Estado de mutismo absoluto sin emitir palabra alguna).
   - Proposición 2 vinculada por copulativa *"y"*: *"explicó detalladamente las premisas del silogismo"*. (Acción verbal discursiva que exige hablar de forma continua y prolongada).
2. Es física y lógicamente imposible guardar un riguroso silencio y al mismo tiempo explicar detalladamente un argumento mediante palabras sonoras.
3. Se produce una colisión semántica insalvable (P \land \neg P fáctico) que convierte al enunciado en un absurdo comunicativo.
**Respuesta:** B

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t07_s01_c01",
                    question = "El vicio de dicción denominado 'Anfibología' (o ambigüedad sintáctica) se define formalmente como:",
                    options = listOf(
                        "El uso de palabras en idiomas extranjeros sin traducirlas.",
                        "Una construcción sintáctica defectuosa que genera un doble sentido involuntario, permitiendo que la oración se interprete de dos o más maneras distintas.",
                        "La omisión de todas las preposiciones en un párrafo expositivo.",
                        "La repetición desagradable de sonidos idénticos en palabras cercanas.",
                    ),
                    correctIndex = 1,
                    explanation = "La anfibología es el vicio en el cual el ordenamiento de los elementos oracionales genera ambigüedad semántica (ej. 'Vi a tu hermano entrando a la discoteca': ¿quién entraba, yo o tu hermano?)."
                ),
                Challenge(
                    id = "rv_t07_s01_c02",
                    question = "Identifique la oración que incurre de manera flagrante en el vicio de 'Anfibología':",
                    options = listOf(
                        "El médico operó al paciente con gran profesionalismo en el quirófano.",
                        "Los estudiantes leyeron atentamente el ensayo filosófico.",
                        "El sol iluminaba las cumbres nevadas de la cordillera.",
                        "El juez interrogó al sospechoso en su oficina (¿en la oficina de quién?).",
                    ),
                    correctIndex = 3,
                    explanation = "El posesivo 'su' crea anfibología: no queda claro si la oficina pertenecía al juez o al sospechoso interrogado."
                ),
                Challenge(
                    id = "rv_t07_s01_c03",
                    question = "El vicio de dicción conocido como 'Pleonasmo' o redundancia viciosa consiste en:",
                    options = listOf(
                        "Pronunciar incorrectamente los fonemas consonánticos.",
                        "El uso de arcaísmos latinos en conversaciones juveniles.",
                        "La alteración del orden de las letras en una palabra.",
                        "El empleo innecesario de palabras que reiteran de manera vana conceptos ya contenidos intrínsecamente en el significado del vocablo principal (ej. 'subir arriba', 'entrar adentro').",
                    ),
                    correctIndex = 3,
                    explanation = "El pleonasmo vicioso añade palabras superfluas cuyo sentido ya está totalmente presupuesto en el verbo o sustantivo núcleo (ej. 'lapso de tiempo', 'erario público', 'hemorragia de sangre')."
                ),
                Challenge(
                    id = "rv_t07_s01_c04",
                    question = "Identifique la oración que presenta un caso censurable de 'Redundancia Viciosa':",
                    options = listOf(
                        "El fiscal solicitó una orden de detención previa antes del juicio oral.",
                        "El arqueólogo descubrió una osamenta humana fosilizada.",
                        "El testigo narró los sucesos con serenidad.",
                        "La temperatura ambiental descendió tres grados al amanecer.",
                    ),
                    correctIndex = 0,
                    explanation = "'Detención previa antes del juicio': 'previa' y 'antes' son redundantemente reiterativas; bastaba con decir 'detención previa al juicio'."
                ),
                Challenge(
                    id = "rv_t07_s01_c05",
                    question = "El vicio de 'Impropiedad Léxica' consiste formalmente en:",
                    options = listOf(
                        "Escribir poemas sin rima consonante.",
                        "Emplear palabras asignándoles un significado que no poseen en la norma lingüística culta por confusión conceptual o fonética con otro término.",
                        "Utilizar adjetivos calificativos en grado superlativo.",
                        "Separar en sílabas una palabra esdrújula.",
                    ),
                    correctIndex = 1,
                    explanation = "La impropiedad léxica ocurre cuando se usa un vocablo con un significado erróneo o impropio (ej. decir 'ostentar un problema' en vez de 'adolecer de un problema', ya que ostentar es exhibir con orgullo)."
                ),
                Challenge(
                    id = "rv_t07_s01_c06",
                    question = "Identifique la oración que contiene una 'Impropiedad Léxica':",
                    options = listOf(
                        "Los jueces ratificaron la sentencia condenatoria de primera instancia.",
                        "El herido adolecía de una severa fractura en el fémur izquierdo.",
                        "El político ostentaba una profunda ignorancia sobre la constitución nacional.",
                        "El conferencista expuso con notable lucidez conceptual.",
                    ),
                    correctIndex = 2,
                    explanation = "Incurre en impropiedad: 'ostentar' significa mostrar con orgullo y jactancia algo favorable; de la ignorancia no se ostenta, sino que se adolece o se padece."
                ),
                Challenge(
                    id = "rv_t07_s01_c07",
                    question = "El vicio de 'Monotonía' o pobreza de vocabulario se manifiesta cuando el redactor:",
                    options = listOf(
                        "Utiliza un léxico abundante, variado y lleno de sinónimos precisos.",
                        "Escribe únicamente en oraciones compuestas subordinadas.",
                        "Consulta diccionarios especializados de filosofía.",
                        "Reitera continuamente las mismas palabras comodín (como 'cosa', 'hacer', 'tener', 'poner') por carencia de recursos léxicos y precisión semántica.",
                    ),
                    correctIndex = 3,
                    explanation = "La monotonía o pobreza de léxico se evidencia en la repetición constante de términos baúl o comodines vacíos en lugar de recurrir al vocabulario específico correspondiente."
                ),
                Challenge(
                    id = "rv_t07_s01_c08",
                    question = "El vicio de 'Cacofonía' consiste en:",
                    options = listOf(
                        "El uso de oraciones excesivamente largas.",
                        "El encuentro o repetición desagradable y disonante de las mismas sílabas o sonidos fonéticos en palabras contiguas de una oración.",
                        "La falta de concordancia entre sujeto y verbo.",
                        "La mala pronunciación de palabras de origen quechua.",
                    ),
                    correctIndex = 1,
                    explanation = "La cacofonía es la disonancia acústica producida por la proximidad de sonidos idénticos (ej. 'Trata tanto de traerlo temprano')."
                ),
                Challenge(
                    id = "rv_t07_s01_c09",
                    question = "En la oración: 'El profesor le dijo a su colega que él debía corregir las pruebas de admisión', ¿cuál es el defecto pragmático-semántico?",
                    options = listOf(
                        "Ambigüedad por pronombre de referencia opaca: el pronombre 'él' no aclara si se refiere al profesor o a su colega.",
                        "Falta de tildación en el verbo 'dijo'.",
                        "Discordancia de número entre sujeto y predicado.",
                        "Uso incorrecto de la preposición 'de'.",
                    ),
                    correctIndex = 0,
                    explanation = "Existe anfibología pronominal: la referencia del pronombre 'él' es indeterminada, pudiendo aludir tanto al sujeto de la oración como al complemento indirecto."
                ),
                Challenge(
                    id = "rv_t07_s01_c10",
                    question = "Corrija con máxima precisión léxica la expresión descuidada: 'El gobierno va a *hacer* una nueva ley contra la delincuencia'.",
                    options = listOf(
                        "Va a fabricar una nueva ley.",
                        "Va a construir una nueva ley.",
                        "Va a colocar una nueva ley.",
                        "Va a promulgar (o formular) una nueva ley.",
                    ),
                    correctIndex = 3,
                    explanation = "Sustituir el verbo genérico 'hacer' por el término jurídico técnico y preciso 'promulgar' o 'formular' erradica la pobreza léxica y otorga rigor normativo."
                ),
            )
        ),
        LessonNode(
            id = "rv_t07_s02",
            subjectId = "razonamiento_verbal",
            semana = 7,
            subtema = "7.2",
            title = "3.2 Discordancias Gramaticales que Alteran el Sentido",
            theory = LessonTheory(
                content = """# TEMA VII: Corrección por Sentido

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 Los Principales Vicios de Sentido en el Examen de Admisión

#### A. Redundancias Léxicas y Pleonasmos Comunes
En el examen de la UNSA, la comisión evalúa sistemáticamente expresiones viciosas enquistadas en el habla cotidiana:

| Expresión Viciosa Popular | Por qué es Redundante | Corrección Culta Formal |
| :--- | :--- | :--- |
| *Lapso de tiempo* | Un *lapso* es por definición un período de tiempo. | **Lapso** o **período** |
| *Volver a repetir* | *Repetir* ya significa volver a hacer o decir algo. | **Repetir** |
| *Hemorragia de sangre* | Toda *hemorragia* es flujo copioso de sangre. | **Hemorragia** |
| *Erario público* | El *erario* es el tesoro o patrimonio público del Estado. | **Erario** |
| *Jauría de perros* | Una *jauría* es por definición un conjunto de perros o lobos. | **Jauría** |
| *Completamente gratis* | La condición de *gratis* no admite gradación: se paga o no. | **Gratis** |
| *Previsto de antemano* | *Prever* implica etimológicamente ver antes. | **Previsto** |
| *Bifurcarse en dos caminos* | *Bifurcarse* significa dividirse en dos ramales (*bi-*). | **Bifurcarse** |

#### B. La Incoherencia Semántica (Colisión Lógica)
Se produce cuando los atributos asignados a un sujeto son incompatibles con su naturaleza:
- *Enunciado incoherente:* *"El testigo permaneció en un **absoluto mutismo**, expresando con voz firme su inocencia"*.
  - Colisión: El *mutismo* es el silencio voluntario o involuntario. No se puede estar en mutismo y hablar con voz firme al mismo tiempo.
  - *Corrección:* *"El testigo rompió su mutismo y proclamó con voz firme su inocencia"*.

#### C. La Imprecisión Léxica y los "Verbos Comodín"
El enriquecimiento del vocabulario universitario radica en sustituir los cuatro verbos universales del habla descuidada (*dar, tener, poner, hacer*):

\begin{array}{rcl}
\text{Tener} \text{ síntomas} & \implies & \textbf{Manifestar / Presentar} \text{ síntomas} \\
\text{Dar} \text{ miedo} & \implies & \textbf{Infundir / Provocar} \text{ pavor} \\
\text{Hacer} \text{ un túnel} & \implies & \textbf{Excavar / Perforar} \text{ un túnel} \\
\text{Poner} \text{ una queja} & \implies & \textbf{Interponer / Formular} \text{ una queja} \\
\text{Tener} \text{ dudas} & \implies & \textbf{Albergar / Abrigarse de} \text{ dudas} \\
\text{Echar} \text{ a un trabajador} & \implies & \textbf{Despedir / Destituir} \text{ a un trabajador}
\end{array}



### 3.2 Discordancias Gramaticales que Alteran el Sentido
1. **Discordancia de Número o Género Colectivo:**
   - *Incorrecto:* *"La mayoría de estudiantes desaprobaron el examen"*.
   - *Correcto con sentido singular estricto:* *"La mayoría de estudiantes desaprobó el examen"*.
2. **El "Dequeísmo" y "Queísmo":**
   - *Dequeísmo vicioso:* *"Pienso de que la economía mejorará"* (Lo correcto es: *"Pienso que..."*).
   - *Queísmo por supresión indebida:* *"Me convencí que tenía razón"* (Lo correcto es: *"Me convencí de que..."*).
3. **El Mal Uso del Adjetivo "Mismo":**
   - No debe emplearse *mismo* como pronombre anafórico sustituto de persona o cosa:
   - *Incorrecto:* *"Se aprobó el proyecto de ley y se ordenó la promulgación del mismo"*.
   - *Correcto:* *"Se aprobó el proyecto de ley y se ordenó su promulgación"*.

---



## 4. FORMULARIO MAESTRO DE CORRECCIÓN ESTILÍSTICA

| Defecto de Sentido | Prueba Diagnóstica Inmediata | Algoritmo de Corrección |
| :--- | :--- | :--- |
| **Pleonasmo** | ¿Si elimino la palabra, se pierde alguna información esencial? | Si la respuesta es NO, elimina la palabra redundante de inmediato. |
| **Imprecisión** | ¿El verbo empleado describe la técnica exacta de la acción? | Sustituye el verbo por el término científico o específico de la disciplina. |
| **Anfibología** | ¿El pronombre posesivo (*su*) o el modificador admite dos dueños? | Reordena la sintaxis o especifica el nombre (*"el auto de Juan"*). |
| **Incoherencia** | ¿Existe un choque formal entre el sustantivo y su adjetivo? | Modifica el adjetivo por uno compatible con el semema nuclear. |

---



### Hack 1: La Prueba de la Doble Negación en el "Dequeísmo"
¿Dudas si una oración lleva "de que" o solo "que"?:
1. Transforma toda la proposición subordinada en la pregunta: **¿DE QUÉ...?** o **¿QUÉ...?**:
   - Oración: *"Él me dijo [de que vendría / que vendría]"*.
   - Pregunta de prueba: *¿Qué me dijo?* (Correcto) vs. *¿De qué me dijo?* (Absurdo).
   - Como la pregunta natural es *¿Qué me dijo?*, la respuesta correcta es: *"Él me dijo **que** vendría"*.
   - Caso contrario: *"Él se acordó [de que vendría]"* \to Pregunta: *¿De qué se acordó?* \to Lleva **de que** obligatoriamente.



### Hack 2: Rastreo del "Sujeto Fantasma" en Anfibologías
En oraciones como *"El perro mordió al cazador en su casa"*:
- ¿En la casa de quién? ¿Del perro o del cazador?
- Para desambiguar en el examen, busca la alternativa que coloque el complemento circunstancial de lugar pegado directamente al sustantivo que modifica: *"En su propia casa, el cazador fue mordido por el perro"*.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la redacción de sentencias judiciales de la Corte Suprema, diagnósticos en historias clínicas de hospitales y manuales de operaciones de ingeniería aeronáutica, la corrección por sentido es un imperativo ético y de seguridad pública. Una prescripción médica ambigua como *"Administrar una ampolla al paciente cuando tenga dolor cada seis horas"* puede interpretarse como administrarla cada seis horas fijas o solo si duele, poniendo en riesgo la vida del paciente por sobredosis farmacológica.

---



### Ejercicio 1 (Nivel Básico: Detección de Pleonasmo Vicioso)
**Enunciado:** Identifique la oración que contiene una redundancia viciosa que afecta la corrección por sentido:
A) El testigo relató los hechos con admirable serenidad.  
B) El arqueólogo descubrió una osamenta de huesos en la tumba real.  
C) La comisión evaluadora publicó los resultados oficiales del concurso.  
D) Los científicos examinaron las muestras recolectadas en la Antártida.  
E) El conferencista disertó sobre los desafíos de la inteligencia artificial.  

**Resolución Paso a Paso:**
1. Analizamos minuciosamente el léxico de cada alternativa:
   - En la opción B: *"descubrió una osamenta de huesos"*.
   - Definición lexicográfica de **osamenta** según la RAE: "Conjunto de los huesos que forman el esqueleto de un ser humano o animal".
   - Por definición semántica intrínseca, una osamenta está compuesta necesariamente por huesos; no existe una osamenta de madera o metal.
   - Añadir *"de huesos"* es un pleonasmo vicioso y redundante que no aporta ningún dato semántico nuevo.
2. Las restantes opciones muestran un uso pulcro, sobrio y normativo del vocabulario.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Incoherencia Semántica Interna)
**Enunciado:** ¿Cuál de los siguientes enunciados incurre en una flagrante **incoherencia semántica**?
A) A pesar de su juventud inexperta, demostró una madurez sobresaliente en la toma de decisiones.  
B) El anciano filósofo guardó un riguroso silencio y explicó detalladamente las premisas del silogismo.  
C) El caudal del río Chili creció intempestivamente debido a las lluvias estivales en la cordillera.  
D) La economía regional experimentó un crecimiento sostenido durante el último quinquenio.  
E) El congresista declinó la invitación por razones estrictamente personales.  

**Resolución Paso a Paso:**
1. Analizamos el sentido lógico interno de la opción B:
   - Proposición 1: *"El anciano filósofo guardó un riguroso silencio"*. (Estado de mutismo absoluto sin emitir palabra alguna).
   - Proposición 2 vinculada por copulativa *"y"*: *"explicó detalladamente las premisas del silogismo"*. (Acción verbal discursiva que exige hablar de forma continua y prolongada).
2. Es física y lógicamente imposible guardar un riguroso silencio y al mismo tiempo explicar detalladamente un argumento mediante palabras sonoras.
3. Se produce una colisión semántica insalvable (P \land \neg P fáctico) que convierte al enunciado en un absurdo comunicativo.
**Respuesta:** B

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación de Términos Parónimos y de Registro Culto)
**Enunciado (Nivel UNI / Máxima Exigencia):** Seleccione el enunciado que utiliza los vocablos con absoluta **propiedad léxica y adecuación semántica**, libre de cualquier error de sentido o confusión paronímica:
A) El juez penal absolvió al reo confeso porque las pruebas presentadas por la fiscalía adolecían de total validez.  
B) Tras el golpe militar, el dictador procedió a detentar ilegítimamente la presidencia de la república, conculcando las libertades civiles.  
C) El ministro de Salud advirtió que el virus presentaba un carácter inocuo sumamente mortífero para los ancianos.  
D) El fiscal provincial procedió a incautar los documentos que infringían un daño económico irreparable a la empresa.  
E) La asamblea universitaria aprobó por unanimidad la iniciativa, a pesar del escepticismo de la totalidad de sus miembros.  

**Resolución Paso a Paso:**
1. Analizamos la opción A: *"adolecían de total validez"*. El verbo *adolecer* significa "tener o padecer un defecto o enfermedad", no equivale a "carecer". Si una prueba "adolece de validez", significa erróneamente que tener validez es un defecto. Además, absolver a un "reo confeso" presenta inconsistencia de motivación judicial.
2. Analizamos la opción C: *"carácter inocuo sumamente mortífero"*. *Inocuo* significa que no hace daño; calificarlo de "sumamente mortífero" es una contradicción semántica directa.
3. Analizamos la opción D: *"infringían un daño"*. Se dice *infligir* daño (causar un daño o castigo), mientras que *infringir* significa quebrantar una ley o norma jurídica.
4. Analizamos la opción E: *"aprobó por unanimidad [...], a pesar del escepticismo de la totalidad"*. Si hubo escepticismo de la totalidad, no pudo aprobarse por unanimidad (colisión lógica).
5. Analizamos la opción B:
   - *Detentar:* Retener o ejercer un poder o cargo de manera usurpadora o sin título legítimo. El texto dice: *"el dictador procedió a detentar ilegítimamente la presidencia tras un golpe militar"*. El uso es impecable.
   - *Conculcar:* Quebrantar, vulnerar o atropellar una ley, fuero o derecho. Se usa con rigor formal insuperable.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Propiedad Léxica:** Uso de las palabras con el significado exacto y preciso asignado por la norma culta.
2. **Pleonasmo Vicioso:** Repetición innecesaria de ideas o semas que no aportan valor expresivo ni poético.
3. **Incoherencia Semántica:** Contradicción lógica interna que anula el sentido de un enunciado.
4. **Anfibología:** Ambigüedad generada por un orden sintáctico defectuoso que admite dos interpretaciones.
5. **Solecismo:** Error que atenta contra las reglas de concordancia, régimen preposicional o sintaxis.
6. **Dequeísmo:** Inserción indebida de la preposición "de" antes de la conjunción "que" en oraciones subordinadas sustantivas.
7. **Queísmo:** Supresión incorrecta de la preposición "de" (u otra) cuando es exigida por el verbo de régimen.
8. **Detentar:** Ejercer ilegítimamente un cargo, mando o poder público sin derecho legal.
9. **Ostentar:** Exhibir con legitimo derecho, orgullo o prestancia un título o cargo público.
10. **Infligir:** Causar o imponer un daño físico, castigo o pena a alguien.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Por qué la frase "un lapso de dos horas de tiempo" es un pleonasmo vicioso?**  
  **A:** Porque "lapso" significa por definición período de tiempo; añadir "de tiempo" es una reiteración inútil.
- **Q: ¿Qué diferencia existe entre "infligir" e "infringir"?**  
  **A:** "Infligir" es causar daño o castigo; "infringir" es violar o quebrantar una norma o ley.
- **Q: ¿Cómo se comprueba si una oración contiene dequeísmo?**  
  **A:** Reemplazando la proposición por una pregunta: si la pregunta natural es "¿Qué?" (y no "¿De qué?"), el "de" es un dequeísmo que debe eliminarse.
- **Q: ¿Por qué es un error decir "Se reunió el comité y el mismo acordó suspender la huelga"?**  
  **A:** Porque la RAE desaconseja terminantemente usar "el mismo" como pronombre anafórico; debe sustituirse por un pronombre personal o posesivo ("y este acordó...").
- **Q: ¿Qué significa el verbo "adolecer" en el registro culto formal?**  
  **A:** Significa tener un defecto, vicio o padecer una enfermedad; no es sinónimo de "carecer".

---



### Matriz de Indicadores de Logro Evaluados
1. **Detección de incoherencias semánticas:** Localizar colisiones de significado, contradicciones internas o falsos sentidos en enunciados breves.
2. **Erradicación de redundancias y pleonasmos:** Identificar y suprimir términos que repiten innecesariamente un sema ya expresado en el núcleo oracional (*lapso de tiempo, subir arriba*).
3. **Selección de la palabra exacta (Propiedad léxica):** Sustituir vocablos coloquiales o vagos por términos técnicos precisos adecuados al registro académico.
4. **Corrección de discordancias lógico-sintácticas:** Subsanar falsas concordancias de sentido, anfibologías y solecismos que distorsionan el mensaje.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                         CORRECCIÓN POR SENTIDO
                                   │
         ┌─────────────────────────┼─────────────────────────┐
         ▼                         ▼                         ▼
INCOHERENCIA SEMÁNTICA       REDUNDANCIA VICIOSA       IMPRECISIÓN LÉXICA
(Colisión de Sentido)         (Semas Duplicados)       (Pobreza de Vocabulario)
         │                         │                         │
   ┌─────┴─────┐             ┌─────┴─────┐             ┌─────┴─────┐
   ▼           ▼             ▼           ▼             ▼           ▼
Contradicción  Anfibología   Pleonasmo   Tautología    Verbos      Términos
Interna        Sintáctica    Vicioso     Léxica        Comodín     Baúl
("Gélido       ("Vio al      ("Volver a  ("Mendrugo    (Tener,     (Cosa,
 ardor")       perro...")    repetir")   de pan")      Hacer)      Algo)
```



### Ejercicio 4 (Nivel Avanzado DECO: Corrección Integral de Párrafo Periodístico)
**Enunciado (Tipo San Marcos DECO / UNSA):** Lea el siguiente texto con vicios de redacción:
*"El alcalde provincial inauguró una obra que la misma costó millones del erario público del Estado, donde los vecinos se quejaron de que no había agua potable en sus casas de ellos."*
¿Cuál es la versión debidamente corregida, libre de queísmo, redundancias y ambigüedades?
A) El alcalde provincial inauguró una obra que costó millones del erario, en la cual los vecinos se quejaron porque no tenían agua potable en sus casas.  
B) El alcalde provincial inauguró una obra de la cual la misma costó millones del erario público, donde los vecinos reclamaron por el agua.  
C) El burgomaestre inauguró una obra costosa del erario del Estado en donde los vecinos de ellos no tenían agua en sus domicilios.  
D) Habiendo inaugurado la obra que costó millones del erario público, el alcalde vio que los vecinos no tenían agua en sus casas de ellos.  
E) El alcalde inauguró la obra costosa del erario, donde los mismos vecinos se quejaron de la falta de agua en las casas de ellos.  

**Resolución Paso a Paso:**
1. Identificamos los vicios del texto original:
   - Uso vicioso de *la misma* como pronombre anafórico.
   - Redundancia pleonástica en *"erario público del Estado"* (*erario* ya es el tesoro público del Estado).
   - Empleo incorrecto del adverbio relativo de lugar *donde* para introducir una circunstancia oracional que no es un espacio físico medible.
   - Dequeísmo vicioso en *"se quejaron de que"* (o construcción defectuosa) y pleonasmo redundante vulgar en *"sus casas de ellos"*.
2. Evaluamos la opción A:
   - Sustituye *"la misma"* por el pronombre relativo simple *que*.
   - Corrige *"erario público del Estado"* dejándolo con sobriedad en **el erario**.
   - Reemplaza el vicioso *donde* por el conector relativo adecuado **en la cual**.
   - Elimina la duplicación posesiva vulgar *"de ellos"* dejando simplemente **sus casas**.
3. La alternativa A restituye la impecabilidad gramatical y semántica total.
**Respuesta:** A

---



### Ejercicio 2 (Nivel Intermedio: Precisión Léxica y Verbos Comodín)
**Enunciado (Modelo Admisión UNSA):** Seleccione la opción que corrige el enunciado con la mayor precisión léxica:
*"El cabecilla de la banda delictiva LOGRÓ HACER un plan maestro para fugar de la prisión de máxima seguridad."*
A) consiguió tramar  
B) ideó un plan maestro  
C) ejecutó un proyecto  
D) hizo la estructura  
E) pensó un croquis  

**Resolución Paso a Paso:**
1. Analizamos la expresión coloquial *"logró hacer un plan maestro"*:
   - "Hacer un plan" recurre al verbo comodín baúl *hacer*.
   - En el plano intelectual y estratégico, concebir mentalmente un plan o proyecto complejo se expresa con verbos como *idear, concebir, urdir, diseñar o trazar*.
2. Evaluamos la elegancia sintáctica y concisión:
   - *"Ideó un plan maestro"* sintetiza la operación mental en un solo verbo culto, exacto y vigoroso.
   - *Idear* significa: "Formar y disponer en la mente un plan para conseguir un fin".
3. Por tanto, la opción B es la fórmula óptima de precisión léxica.
**Respuesta:** B

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t07_s02_c01",
                    question = "La 'Discordancia Gramatical' es un error morfosintáctico que atenta contra el sentido claro del texto al violar las reglas de coincidencia obligatoria de:",
                    options = listOf(
                        "Tipo de letra en un procesador de textos.",
                        "Género y número en el sintagma nominal, o de número y persona entre el núcleo del sujeto y el verbo principal.",
                        "Número de versos y estrofas en una composición poética.",
                        "Longitud de los párrafos en un artículo de opinión.",
                    ),
                    correctIndex = 1,
                    explanation = "La concordancia gramatical es la correspondencia formal de morfemas flexivos entre palabras vinculadas sintácticamente (sustantivo-adjetivo; sujeto-verbo)."
                ),
                Challenge(
                    id = "rv_t07_s02_c02",
                    question = "Identifique la oración que presenta un error flagrante de discordancia con el verbo impersonal 'haber':",
                    options = listOf(
                        "Habían demasiadas personas esperando en la fila de ingreso al concierto.",
                        "Hubo graves disturbios en los alrededores del estadio municipal.",
                        "Ha habido múltiples quejas sobre el servicio de transporte.",
                        "Habrá una conferencia de prensa al mediodía.",
                    ),
                    correctIndex = 0,
                    explanation = "Cuando el verbo 'haber' funciona como impersonal indicando existencia, carece de sujeto y solo se conjuga en tercera persona del singular: lo correcto es 'Había demasiadas personas', no 'habían'."
                ),
                Challenge(
                    id = "rv_t07_s02_c03",
                    question = "En la oración: 'El grupo de manifestantes _______ enérgicamente ante las cámaras de televisión', la concordancia de sujeto colectivo singular con complemento plural admite formalmente:",
                    options = listOf(
                        "La eliminación del verbo en favor de un adjetivo.",
                        "Únicamente el verbo en tiempo futuro compuesto.",
                        "Tanto el verbo en singular concordando con el núcleo colectivo ('protestó') como en plural por concordancia de sentido o ad sensum ('protestaron'), siendo preferible el singular en la norma culta estricta.",
                        "Un verbo en modo imperativo plural de segunda persona.",
                    ),
                    correctIndex = 2,
                    explanation = "La RAE admite la concordancia en singular (concordancia gramatical con 'el grupo') o en plural (concordancia ad sensum con 'manifestantes'), recomendándose el singular en la prosa académica formal."
                ),
                Challenge(
                    id = "rv_t07_s02_c04",
                    question = "Identifique la oración que incurre en error de discordancia nominal de género y número:",
                    options = listOf(
                        "El fiscal presentó pruebas y argumentos contundente durante el alegato.",
                        "Compró camisas y pantalones importados de excelente calidad.",
                        "La delegación peruana obtuvo medallas de oro y plata en el torneo.",
                        "Los antiguos edificios coloniales fueron restaurados por el municipio.",
                    ),
                    correctIndex = 0,
                    explanation = "El adjetivo pospuesto a dos sustantivos coordinados debe concordar en plural: lo correcto es 'argumentos contundentes', no 'contundente'."
                ),
                Challenge(
                    id = "rv_t07_s02_c05",
                    question = "En la frase: 'Se alquila habitaciones amobladas para señoritas estudiantes', el error sintáctico radica en:",
                    options = listOf(
                        "El uso de la preposición 'para'.",
                        "El empleo de adjetivos en género femenino.",
                        "Discordancia de número en la pasiva refleja con 'se': como el sujeto paciente es plural ('habitaciones amobladas'), el verbo debe concordar obligatoriamente en plural ('Se alquilan habitaciones').",
                        "La posición del verbo al inicio de la oración.",
                    ),
                    correctIndex = 2,
                    explanation = "En la oración pasiva refleja con 'se', el sustantivo que sigue es el sujeto paciente gramatical y exige concordancia con el verbo: 'Se alquilan habitaciones'."
                ),
                Challenge(
                    id = "rv_t07_s02_c06",
                    question = "Identifique la oración redactada con rigurosa corrección gramatical:",
                    options = listOf(
                        "Detrás de mí venía corriendo el oficial de policía.",
                        "Detrás mío venía corriendo el oficial de policía.",
                        "Delante suyo estaban las autoridades del colegio.",
                        "Cerca tuyo se encuentra la biblioteca central.",
                    ),
                    correctIndex = 0,
                    explanation = "Los adverbios de lugar ('detrás', 'cerca', 'delante') no admiten posesivos ('detrás mío' es incorrección vulgar o solecismo); exigen complementos con preposición y pronombre personal tónico: 'detrás de mí'."
                ),
                Challenge(
                    id = "rv_t07_s02_c07",
                    question = "El error sintáctico denominado 'Dequeísmo' consiste en:",
                    options = listOf(
                        "Repetir la palabra 'que' diez veces en el mismo párrafo.",
                        "El uso indebido de la preposición 'de' antes de la conjunción 'que' en oraciones subordinadas sustantivas que funcionan como objeto directo (ej. 'Pienso de que vendrá' en lugar de 'Pienso que vendrá').",
                        "Omitir la preposición 'de' cuando es obligatoria por el régimen verbal.",
                        "Sustituir el pronombre 'quien' por 'cuyo'.",
                    ),
                    correctIndex = 1,
                    explanation = "El dequeísmo es la inserción espuria de la preposición 'de' ante 'que' cuando el verbo no rige dicha preposición (el objeto directo nunca lleva preposición 'de': 'me dijo que', no 'me dijo de que')."
                ),
                Challenge(
                    id = "rv_t07_s02_c08",
                    question = "Por el contrario, el 'Queísmo' consiste en:",
                    options = listOf(
                        "El uso abusivo de adjetivos explicativos.",
                        "Escribir oraciones interrogativas directas.",
                        "Utilizar el pronombre 'que' con tilde diacrítica en oraciones enunciativas.",
                        "La omisión incorrecta de la preposición 'de' (u otra requerida) antes de la conjunción 'que' cuando el verbo o sustantivo la exige por régimen preposicional (ej. 'Estoy seguro que vendrá' en vez de 'Estoy seguro de que vendrá').",
                    ),
                    correctIndex = 3,
                    explanation = "El queísmo suprime indebidamente la preposición obligatoria por el régimen del adjetivo o verbo ('estar seguro de algo', 'darse cuenta de algo')."
                ),
                Challenge(
                    id = "rv_t07_s02_c09",
                    question = "Identifique la oración que presenta un caso censurable de 'Dequeísmo':",
                    options = listOf(
                        "Me alegro de que hayas obtenido la beca universitaria.",
                        "Se percató de que había olvidado sus documentos de identidad.",
                        "El presidente afirmó de que la economía crecerá el próximo trimestre.",
                        "Estaba convencido de que la investigación arrojaría resultados positivos.",
                    ),
                    correctIndex = 2,
                    explanation = "El verbo 'afirmar' es transitivo y rige objeto directo sin preposición ('afirmó que...', no 'afirmó de que...'), cometiéndose dequeísmo."
                ),
                Challenge(
                    id = "rv_t07_s02_c10",
                    question = "En la oración: 'El calor y la humedad sofocante _______ a los deportistas durante el entrenamiento', el verbo en posición pospuesta a dos sujetos coordinados singulares debe concordar en:",
                    options = listOf(
                        "Tercera persona del singular obligatoriamente.",
                        "Primera persona del plural del modo subjuntivo.",
                        "Tercera persona del plural obligatoriamente ('agotaron'), pues la coordinación de dos sustantivos singulares forma un sujeto plural compuesto.",
                        "Forma no personal de gerundio simple.",
                    ),
                    correctIndex = 2,
                    explanation = "La coordinación copulativa de dos sintagmas nominales singulares pospuestos al verbo conforma un sujeto plural que exige concordancia verbal en plural ('agotaron')."
                ),
            )
        )
    )
}
