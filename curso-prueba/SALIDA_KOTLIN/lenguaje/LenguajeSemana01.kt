package lenguaje

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object LenguajeSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "leng_t01_s01",
            title = "El Circuito Comunicativo: Fases, Elementos y Fenómenos Interferentes",
            theory = LessonTheory(
                title = "La Comunicación: Concepto, Elementos, Fases y Tipología",
                content = """## 2. MAPA CONCEPTUAL Y CIRCUITO DE LA COMUNICACIÓN

```
                                  EL CIRCUITO COMUNICATIVO
                                              │
                                        [ CONTEXTO ]
                                (Espacio, tiempo y situación)
                                              │
                                         [ REFERENTE ]
                                 (Realidad objetiva aludida)
                                              │
                      ┌────────────────── [ MENSAJE ] ──────────────────┐
                      │             (Contenido transmitido)             │
                      ▼                                                 ▼
                [ EMISOR ] ────────────── [ CANAL ] ────────────── [ RECEPTOR ]
              (Encodifica)             (Soporte físico)             (Decodifica)
                      │                                                 │
                      └───────────────── [ CÓDIGO ] ────────────────────┘
                                   (Sistema de signos)
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. La Comunicación: Concepto, Fases y Tipología
1. **Definición**: Proceso social dinámico e interactivo mediante el cual un emisor transmite intencionalmente información (ideas, emociones, órdenes, datos) a un receptor utilizando un sistema de signos compartido a través de un canal determinado.
2. **Las Tres Fases de la Comunicación**:
   - **Fase Psíquica**: En el emisor ocurre la ideación y la **encodificación** (selección de signos en el cerebro); en el receptor, la **decodificación** (asociación de signos con significados).
   - **Fase Fisiológica**: En el emisor, impulsos nerviosos activan los órganos fonadores (aparato fonador) o motores (manos); en el receptor, se activan los órganos receptores (oído, vista).
   - **Fase Física**: El desplazamiento de ondas sonoras o luminosas a través del medio ambiente (canal).
3. **Tipos de Comunicación**:
   - **Según el Código Empleado**:
     - *Comunicación Humana Lingüística o Verbal*: Utiliza la palabra hablada (oral-acústica) o la palabra escrita (visuográfica).
     - *Comunicación Humana No Lingüística o No Verbal*: Emplea signos no idiomáticos: visuales/cromáticos (semáforo, tarjeta roja), acústicos (sirena de ambulancia, silbato policial), gestuales/mímicos (guiño, saludo con la mano), táctiles (braille, apretón de manos), proxémicos (distancia física interpersonal).
     - *Comunicación No Humana*: Sistemas de señales instintivas entre animales (danzas de las abejas, feromonas, cantos de apareamiento) o vegetales.
   - **Según la Relación entre Emisor y Receptor**:
     - *Intrapersonal*: El emisor y el receptor son la misma persona (el monólogo interior, la conciencia reflexiva).
     - *Interpersonal*: Interacción entre dos o más personas distintas.
   - **Según el Espacio o Ubicación Física**:
     - *Directa / Próxima*: Emisor y receptor comparten el mismo espacio físico y temporal (una conversación cara a cara, una clase presencial).
     - *Indirecta / A Distancia*: Emisor y receptor están separados en el espacio o en el tiempo (una llamada telefónica, un correo electrónico, la lectura de un libro de Homero).
   - **According to Directionality (Direccionalidad)**:
     - *Unidireccional / Unilateral*: No hay alternancia ni intercambio de roles; el emisor no recibe retroalimentación inmediata (leer un periódico impreso, escuchar la radio, ver un cartel publicitario).
     - *Bidireccional / Recíproca / Bilateral*: Emisor y receptor intercambian continuamente sus roles comunicativos mediante diálogo o debate.
   - **Según el Tipo de Emisor y Receptor**:
     - *Privada*: Dirigida a un destinatario determinado o selecto (una carta personal, un mensaje de WhatsApp individual).
     - *Pública / De Masas*: Mensaje masivo dirigido a una colectividad anónima e indeterminada (conferencia de prensa, editorial de televisión).

---



### B. Elementos del Proceso Comunicativo
1. **Emisor (Encodificador)**: Sujeto, fuente o grupo que concibe, estructura y emite el mensaje codificado con una intención comunicativa determinada.
2. **Receptor (Decodificador / Destinatario)**: Sujeto o audiencia que recibe el mensaje a través de sus sentidos y realiza el proceso inverso de descifrar e interpretar los signos recibidos.
3. **Mensaje**: El contenido cognitivo, afectivo o volitivo que se transmite; la información organizada y configurada en signos.
4. **Código**: Sistema convencional y estructurado de signos y reglas combinatorias que el emisor y el receptor deben compartir forzosamente para que haya comprensión mutua (ej. el idioma castellano, el código Morse, el sistema Braille, las luces del semáforo).
5. **Canal**: El **soporte físico o medio material** a través del cual viaja el mensaje desde el emisor hacia el receptor:
   - *Natural*: El aire y las ondas sonoras en la conversación oral directa.
   - *Artificial*: El papel en una carta, el cable de fibra óptica, las ondas electromagnéticas en la radio, la pantalla del teléfono celular.
6. **Referente (Realidad Aludida)**: El aspecto concreto o abstracto del mundo real o imaginario al que alude el mensaje (el tema, el objeto o hecho del que se habla).
7. **Contexto o Circunstancia**: El entorno socioespacial, temporal, cultural y psicológico en el que se produce el acto comunicativo, el cual condiciona decisivamente el significado preciso del mensaje (*"No es lo mismo decir '¡Fuego!' en un campo de tiro que en una sala de cine llena"*).
8. **Fenómenos Interferentes**:
   - **Ruido**: Cualquier interferencia, perturbación u obstáculo físico, técnico, semántico o psicológico que dificulta, distorsiona o impide la recepción fiel del mensaje (manchas de tinta, ruido de motores, mala ortografía, estática telefónica).
   - **Redundancia**: Todo recurso verbal o técnico empleado deliberadamente para reforzar el mensaje, combatir el ruido y asegurar su correcta decodificación (repeticiones, subrayados, mayúsculas, gestos enfáticos).
   - **Retroalimentación (*Feedback*)**: La respuesta o reacción observable del receptor que permite al emisor verificar si el mensaje fue comprendido y ajustar su emisión.

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia del Canal:
> **"EL CANAL ES EL PUENTE FÍSICO POR DONDE VIAJA LA SEÑAL"**
- Si es voz viva = Aire / ondas sonoras.
- Si es libro = Papel impreso.
- Si es llamada = Cable / ondas electromagnéticas.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 2: Intermedio / Identificación de Elementos
**Enunciado**: Durante la final de un torneo de fútbol, el árbitro principal hace sonar enérgicamente su silbato metálico para indicar el final del encuentro deportivo. En este acto de comunicación, el **código** y el **canal** son, respectivamente:
A) El árbitro y el silbato metálico  
B) El sistema acústico de toques de silbato y el aire (ondas sonoras)  
C) La cancha de fútbol y el pitazo arbitral  
D) Los futbolistas y el reglamento de la FIFA  
E) El silbato y los tímpanos de los espectadores  

- **Resolución**:
  - Código: El sistema convencional de toques de silbato preestablecido por las reglas del fútbol.
  - Canal: El medio físico a través del cual se propagan las ondas sonoras (el aire atmosférico).
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El arqueólogo Julio C. Tello desentierra en la cuenca de Casma un monolito de piedra con incisiones iconográficas chavín que representan a un ser antropomorfo felínico con garras y colmillos amenazantes. Tras arduos análisis semióticos, Tello publica un informe donde concluye que dicha litoescultura funcionaba hace tres mil años como un dispositivo de terror sacerdotal para subordinar a los campesinos del valle. En este fenómeno de comunicación semiótica a través de la historia, identifique la aseveración técnicamente correcta:
A) Se trata de una comunicación lingüística oral de tipo intrapersonal e inmediata.  
B) El canal físico está constituido por el bloque de granito lítico, el código es el sistema iconográfico chavín y la comunicación es humana no verbal, indirecta y asincrónica a través de los siglos.  
C) El referente primordial es la física de partículas y el emisor es la población campesina receptora.  
D) No existe proceso comunicativo debido a la ausencia de un receptor vivo contemporáneo a la cultura Chavín.  
E) El código empleado es el castellano andino colonial del siglo XVI.  

- **Resolución**:
  - El monolito de piedra tallada funciona como el **soporte material o canal** físico.
  - La iconografía religiosa es un **código no lingüístico / no verbal** de signos visuales.
  - La comunicación es **indirecta y asincrónica**, pues emisor y receptor están separados por milenios en el tiempo histórico; la decodificación arqueológica demuestra la eficacia del circuito semiótico humano.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Encodificación**: Proceso mental psíquico mediante el cual el emisor selecciona signos del código para construir su mensaje.
2. **Decodificación**: Proceso interpretativo inverso mediante el cual el receptor descifra los signos y aprehende el mensaje.
3. **Canal**: Medio físico material o soporte que porta y transporta las señales del mensaje en el espacio-tiempo.
4. **Código**: Conjunto normado y convencional de signos y reglas que permite la estructuración y comprensión del mensaje.
5. **Referente**: Entidad, tema o estado de la realidad objetiva o conceptual al que alude el contenido del mensaje.
6. **Ruido**: Cualquier interferencia física, ambiental o técnica que distorsiona u obstaculiza la transmisión del mensaje.
7. **Redundancia**: Reiteración o refuerzo deliberado del mensaje utilizado para neutralizar el efecto perturbador del ruido.
8. **Función Fática**: Uso del lenguaje enfocado en abrir, verificar, mantener o interrumpir el canal de contacto.
9. **Función Metalingüística**: Empleo del código verbal para estudiar, definir o aclarar las reglas del propio código.
10. **Doble Articulación**: Propiedad del lenguaje humano (Martinet) consistente en estructurarse en monemas (significados) y fonemas (sonidos distintivos).

---



### D. Las Seis Funciones del Lenguaje (Karl Bühler y Roman Jakobson)
Cada acto lingüístico enfatiza predominantemente un elemento del circuito comunicativo:

```
                            FUNCIONES DEL LENGUAJE (JAKOBSON)
                                           │
         ┌──────────────────┬──────────────┼──────────────┬──────────────────┐
         ▼                  ▼              ▼              ▼                  ▼
    REFERENCIAL        EXPRESIVA       APELATIVA       FÁTICA            POÉTICA
   (Referente)          (Emisor)       (Receptor)      (Canal)          (Mensaje)
         │                  │              │              │                  │
• Informa hechos     • Expresa       • Busca influir • Verifica o      • Crea belleza
  objetivos            sentimientos    en el receptor  mantiene el       y ritmo con
• Textos científicos   y emociones   • Órdenes,        canal abierto     recursos
  y periodísticos    • ¡Qué dolor!     ruegos, avisos  • ¿Aló? ¿Me oyes? retóricos
                                                                             │
                                                                   METALINGÜÍSTICA
                                                                      (Código)
                                                              • Explica el propio idioma
```

#### 1. Función Representativa, Referencial o Denotativa (Karl Bühler)
- **Elemento Focal**: El **Referente** (la realidad objetiva exterior).
- **Finalidad**: Transmitir información objetiva, neutra, verificable y conceptual sobre hechos o estados de cosas del mundo, sin implicar emociones subjetivas del emisor.
- **Tipología textual**: Informes científicos, manuales técnicos, libros de historia, noticias periodísticas objetivas.
- *Ejemplo*: *"Arequipa está ubicada a 2325 metros sobre el nivel del mar"* o *"El agua se compone de hidrógeno y oxígeno"*.

#### 2. Función Expresiva, Emotiva o Sintomática (Karl Bühler)
- **Elemento Focal**: El **Emisor**.
- **Finalidad**: Exteriorizar el mundo interior subjetivo del hablante: sus estados anímicos, sentimientos, emociones, valoraciones íntimas o deseos.
- **Rasgos lingüísticos**: Uso de interjecciones, oraciones exclamativas, entonaciones emotivas, sufijos afectivos y diminutivos/despectivos.
- *Ejemplo*: *"¡Qué alegría inmensa verte ingresar a la universidad!"* o *"¡Ojalá no llueva esta tarde!"*.

#### 3. Función Apelativa o Conativa (Karl Bühler)
- **Elemento Focal**: El **Receptor**.
- **Finalidad**: Influir, persuadir, convencer, conmover o modificar la conducta del oyente para que ejecute una acción, responda a una pregunta o cambie de parecer.
- **Rasgos lingüísticos**: Empleo de oraciones imperativas (mandatos), vocativos, oraciones interrogativas y fórmulas de cortesía.
- **Tipología textual**: Mensajes publicitarios, discursos políticos, arengas militares, reglamentos.
- *Ejemplo*: *"¡Cierra la puerta inmediatamente!"*, *"Postulante, concéntrate en tu examen"* o *"Consume productos nacionales"*.

#### 4. Función Fática o de Contacto (Roman Jakobson)
- **Elemento Focal**: El **Canal** físico de transmisión.
- **Finalidad**: Constatar, abrir, mantener, prolongar, verificar o interrumpir la continuidad del canal de comunicación para asegurar que el mensaje fluye sin cortes técnicos.
- **Rasgos lingüísticos**: Frases de cortesía rituales, muletillas fáticas, fórmulas de saludo y despedida.
- *Ejemplo*: *"¿Aló? ¿Me escuchas bien?"*, *"Uno, dos, tres, probando micrófono"*, *"Buenos días, hasta luego"* o *"Ajá... sí, claro, te sigo"*.

#### 5. Función Poética o Estética (Roman Jakobson)
- **Elemento Focal**: El **Mensaje** en su propia forma material y belleza discursiva.
- **Finalidad**: Atraer la atención sobre la estructura artística, la armonía fónica, el ritmo y la elegancia de las palabras mediante recursos estilísticos y figuras retóricas.
- **Tipología textual**: Poesía, novelas literarias, refranes populares, eslóganes publicitarios ingeniosos.
- *Ejemplo*: *"Volverán las oscuras golondrinas en tu balcón sus nidos a colgar"* o *"Camarón que se duerme se lo lleva la corriente"*.

#### 6. Función Metalingüística o de Glosa (Roman Jakobson)
- **Elemento Focal**: El **Código** lingüístico (el propio idioma).
- **Finalidad**: Utilizar el lenguaje como instrumento para reflexionar, analizar, definir o aclarar las reglas gramaticales, ortográficas o semánticas del propio código lingüístico.
- **Tipología textual**: Diccionarios, clases de gramática, tratados de lingüística, correcciones ortográficas.
- *Ejemplo*: *"La palabra 'canción' lleva tilde por ser aguda terminada en n"* o *"El sustantivo es el núcleo del sintagma nominal"*.

---



## 4. CUADRO COMPARATIVO: ELEMENTOS Y FUNCIONES DEL LENGUAJE

| Elemento de la Comunicación | Función del Lenguaje Asociada | Propósito Comunicativo Primordial | Ejemplo Característico de Admisión |
| :--- | :--- | :--- | :--- |
| **Referente** | **Representativa / Referencial** | Informar con objetividad científica o factual. | *"El punto de ebullición del agua pura es 100 °C".* |
| **Emisor** | **Expresiva / Emotiva** | Manifestar estados anímicos y juicios íntimos. | *"¡Qué calor insoportable hace en este desierto!".* |
| **Receptor** | **Apelativa / Conativa** | Inducir una respuesta, orden o persuasión. | *"¡Guarden silencio y abran sus cuadernos de trabajo!".* |
| **Canal** | **Fática / De Contacto** | Abrir, verificar o cerrar el canal físico. | *"¿Hola? ¿Estás todavía en la línea telefónica?".* |
| **Mensaje** | **Poética / Estética** | Realzar la belleza y plasticidad de las palabras. | *"Hay golpes en la vida tan fuertes... ¡Yo no sé!".* |
| **Código** | **Metalingüística / Glosa** | Explicar el significado o norma del propio idioma.| *"Los verbos transitivos exigen objeto directo".* |

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa del Canal vs. Código**:
   - El *código* es abstracto (el idioma castellano, el inglés, las señales de tránsito).
   - El *canal* es el soporte material físico (la hoja de papel, el aire, la pantalla del celular). Confundir el idioma español con el canal es el error más castigado en admisión.
2. **Poética vs. Expresiva**:
   - Si la oración transmite una emoción cruda sin elaboración artística (*"¡Me duele la muela!"*) \rightarrow **Expresiva**.
   - Si utiliza metáforas, rima o cuidado rítmico estético (*"Tus ojos son dos luceros que iluminan mi sendero"*) \rightarrow **Poética**.
3. **Metalingüística encubierta**:
   - Toda definición de diccionario o regla de acentuación es **función metalingüística**, aunque aparentemente informe un hecho objetivo. Si el mensaje habla de palabras, fonemas o verbos, el código habla de sí mismo \rightarrow Metalingüística.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: En un salón de clases, el docente de química escribe en la pizarra: *"El ácido sulfúrico es un compuesto químico altamente corrosivo cuya fórmula molecular es \text{H}_2\text{SO}_4"*. La función del lenguaje que predomina de manera excluyente en dicho enunciado es la:
A) Emotiva o expresiva  
B) Fática o de contacto  
C) Representativa o referencial  
D) Poética o estética  
E) Conativa o apelativa  

- **Resolución**: El enunciado comunica una información objetiva, neutra, verificable y científica de la realidad empírica, sin implicar emociones del hablante ni figuras poéticas; por ende, predomina la **función representativa o referencial**.
- **Clave Correcta**: **C**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea con atención el siguiente texto escrito por un profesor de gramática en la pizarra:
> *"La palabra 'ómnibus' es un vocablo esdrújulo; por consiguiente, todas las palabras esdrújulas se tildan obligatoriamente sin excepción en el idioma castellano"*.

Respecto a los elementos de la comunicación y las funciones del lenguaje en el texto anterior, se concluye con rigor lingüístico que:
A) El referente es la historia del transporte público en la ciudad de Lima.  
B) La función predominante es la metalingüística, debido a que el mensaje utiliza la lengua española para analizar y describir las normas ortográficas del propio código lingüístico.  
C) El canal de transmisión son las ondas hertzianas de una emisora radial.  
D) La función conativa es hegemónica porque busca convencer al lector de comprar un boleto de viaje.  
E) Constituye un acto de comunicación no verbal gestual directo.  

- **Resolución**: El enunciado tiene como propósito explicar una regla de acentuación gráfica del propio idioma español (el concepto de palabra esdrújula); cuando el lenguaje se utiliza para hablar sobre las normas del propio código gramatical, la función hegemónica es la **metalingüística o de glosa**.
- **Clave Correcta**: **B**

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿A qué elemento de la comunicación corresponde la Función Metalingüística?
  - *Reverso*: Al Código (utiliza el lenguaje para reflexionar sobre el propio lenguaje).

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Canal y Código?
  - *Reverso*: El Canal es el soporte material físico (aire, papel, cable); el Código es el sistema abstracto de signos (el idioma, el semáforo).

- **Flashcard 3**:
  - *Anverso*: ¿Qué función del lenguaje predomina en una orden como "¡Guarda tu teléfono celular inmediatamente!"?
  - *Reverso*: La Función Apelativa o Conativa (orientada a modificar la conducta del Receptor).

- **Flashcard 4**:
  - *Anverso*: ¿Qué elemento del lenguaje es psíquico, social y casi fijo según Ferdinand de Saussure?
  - *Reverso*: La Lengua (el código abstracto socialmente compartido por la comunidad).

---



### C. Lenguaje, Lengua y Habla: Los Tres Planos de Ferdinand de Saussure
1. **El Lenguaje**:
   - Facultad humana universal y biológica de comunicarse mediante signos articulados.
   - Rasgos: Universal, innato (Chomsky), inmutable, racional y doblemente articulado (André Martinet: monemas y fonemas).
2. **La Lengua**:
   - Sistema de signos o código abstracto socialmente compartido por los miembros de una comunidad lingüística determinada (el español, el quechua, el inglés).
   - Rasgos: Social, psíquica (está en la mente colectiva), virtual, casi fija y perdurable.
3. **El Habla**:
   - El uso individual, fáctico y concreto que cada hablante hace de su lengua en un momento y lugar determinados.
   - Rasgos: Individual, psicofísica (implica mente y aparato fonador), momentánea, efímera y mutable.

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Una operadora de telefonía móvil se comunica con un cliente y pronuncia las siguientes frases sucesivas:
1. *"¿Aló? ¿Me escucha con claridad, señor Quispe?"*
2. *"Por favor, confirme su número de documento de identidad para activar su plan"*.

Las funciones del lenguaje que se manifiestan de manera predominante en las expresiones 1 y 2 son, respectivamente:
A) Metalingüística y expresiva  
B) Fática y apelativa  
C) Referencial y poética  
D) Fática y representativa  
E) Apelativa y emotiva  

- **Resolución**:
  - En la expresión 1 (*"¿Aló? ¿Me escucha...?"*), el propósito es verificar la operatividad técnica del canal telefónico \rightarrow **Función fática**.
  - En la expresión 2 (*"Por favor, confirme..."*), se busca inducir una acción u orden imperativa en el receptor \rightarrow **Función apelativa o conativa**.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t01_s01_c01",
                    question = "¿En qué fase de la comunicación ocurre la selección y articulación mental de los signos que estructuran el mensaje?",
                    options = listOf(
                        "Fase psíquica del emisor",
                        "Fase física del canal",
                        "Fase motora del emisor",
                        "Fase fisiológica del receptor"
                    ),
                    correctIndex = 0,
                    explanation = "La encodificación es un proceso mental que ocurre en la fase psíquica del emisor, donde se seleccionan y combinan los signos del código antes de emitirlos."
                ),
                Challenge(
                    id = "leng_t01_s01_c02",
                    question = "Si un estudiante lee una obra de Mario Vargas Llosa en su habitación, el canal físico de dicho acto comunicativo es:",
                    options = listOf(
                        "El idioma castellano estándar",
                        "La novela como obra de arte",
                        "La memoria visual del estudiante",
                        "El papel impreso del libro"
                    ),
                    correctIndex = 3,
                    explanation = "El canal es el soporte material físico que porta el mensaje. En la lectura de un libro impreso, el canal es el papel impreso (el castellano es el código)."
                ),
                Challenge(
                    id = "leng_t01_s01_c03",
                    question = "Durante una clase universitaria, el zumbido constante de un proyector defectuoso impide oír con claridad al profesor. Este obstáculo constituye un claro ejemplo de:",
                    options = listOf(
                        "Ruido",
                        "Redundancia física",
                        "Contexto asincrónico",
                        "Retroalimentación diferida"
                    ),
                    correctIndex = 0,
                    explanation = "El ruido es cualquier interferencia o perturbación física, técnica o ambiental que entorpece la recepción correcta del mensaje a través del canal."
                ),
                Challenge(
                    id = "leng_t01_s01_c04",
                    question = "El elemento del circuito comunicativo que alude a la realidad concreta o abstracta, objeto o tema del que trata el mensaje se denomina:",
                    options = listOf(
                        "Contexto",
                        "Referente",
                        "Código",
                        "Canal"
                    ),
                    correctIndex = 1,
                    explanation = "El referente es la realidad objetiva o conceptual exterior aludida por el mensaje (el tema, hecho o entidad del que se habla)."
                ),
                Challenge(
                    id = "leng_t01_s01_c05",
                    question = "¿Cuál es la función pedagógica principal de la redundancia en el acto comunicativo?",
                    options = listOf(
                        "Reemplazar al referente cuando este es abstracto",
                        "Neutralizar y combatir los efectos distorsionadores del ruido",
                        "Eliminar la necesidad de compartir un mismo código lingüístico",
                        "Acelerar la fase fisiológica del receptor"
                    ),
                    correctIndex = 1,
                    explanation = "La redundancia consiste en reiterar o reforzar elementos del mensaje para asegurar su correcta decodificación y contrarrestar las pérdidas causadas por el ruido."
                ),
                Challenge(
                    id = "leng_t01_s01_c06",
                    question = "El proceso inverso mediante el cual el receptor descifra los signos acústicos o gráficos y los asocia a sus respectivos conceptos se denomina:",
                    options = listOf(
                        "Transmisión física",
                        "Articulación motora",
                        "Encodificación",
                        "Decodificación"
                    ),
                    correctIndex = 3,
                    explanation = "La decodificación es el proceso psíquico realizado por el receptor, consistente en descifrar e interpretar los signos del mensaje."
                ),
                Challenge(
                    id = "leng_t01_s01_c07",
                    question = "En la expresión '¡Fuego!', su interpretación exacta varía si se pronuncia en un polígono de tiro militar o en un auditorio cerrado. Esta variación depende directamente del:",
                    options = listOf(
                        "Contexto o circunstancia",
                        "Canal",
                        "Emisor encodificador",
                        "Código"
                    ),
                    correctIndex = 0,
                    explanation = "El contexto o circunstancia es el espacio, tiempo y situación socioambiental que condiciona y determina el sentido exacto del mensaje emitido."
                ),
                Challenge(
                    id = "leng_t01_s01_c08",
                    question = "La respuesta o reacción observable del receptor que permite al emisor comprobar si su mensaje fue comprendido y reajustarlo se denomina:",
                    options = listOf(
                        "Decodificación pasiva",
                        "Redundancia contextual",
                        "Retroalimentación o feedback",
                        "Ruido semántico"
                    ),
                    correctIndex = 2,
                    explanation = "El feedback o retroalimentación es la respuesta emitida por el receptor que permite al emisor evaluar el éxito de la comunicación."
                ),
                Challenge(
                    id = "leng_t01_s01_c09",
                    question = "Si dos personas intentan dialogar, pero una habla exclusivamente quechua y la otra exclusivamente japonés, la comunicación fracasa primordialmente debido a la falta de concordancia en el:",
                    options = listOf(
                        "Canal natural",
                        "Contexto físico",
                        "Código",
                        "Referente"
                    ),
                    correctIndex = 2,
                    explanation = "El código es el sistema convencional de signos que obligatoriamente deben compartir emisor y receptor para que haya comprensión mutua."
                ),
                Challenge(
                    id = "leng_t01_s01_c10",
                    question = "En un mensaje oral emitido cara a cara entre dos amigos en un parque, el canal de comunicación es:",
                    options = listOf(
                        "El idioma español coloquial",
                        "El tímpano del oyente",
                        "La voz humana articulada",
                        "El aire y las ondas sonoras"
                    ),
                    correctIndex = 3,
                    explanation = "El canal natural en la comunicación oral directa es el aire a través del cual se desplazan las ondas sonoras que transmiten la señal acústica."
                )
            )
        ),
        LessonNode(
            id = "leng_t01_s02",
            title = "Tipología de la Comunicación: Clasificación y Criterios",
            theory = LessonTheory(
                title = "Lenguaje, Lengua, Habla y las Seis Funciones del Lenguaje",
                content = """# TEMA 01: COMUNICACIÓN Y LENGUAJE

---



### A. La Comunicación: Concepto, Fases y Tipología
1. **Definición**: Proceso social dinámico e interactivo mediante el cual un emisor transmite intencionalmente información (ideas, emociones, órdenes, datos) a un receptor utilizando un sistema de signos compartido a través de un canal determinado.
2. **Las Tres Fases de la Comunicación**:
   - **Fase Psíquica**: En el emisor ocurre la ideación y la **encodificación** (selección de signos en el cerebro); en el receptor, la **decodificación** (asociación de signos con significados).
   - **Fase Fisiológica**: En el emisor, impulsos nerviosos activan los órganos fonadores (aparato fonador) o motores (manos); en el receptor, se activan los órganos receptores (oído, vista).
   - **Fase Física**: El desplazamiento de ondas sonoras o luminosas a través del medio ambiente (canal).
3. **Tipos de Comunicación**:
   - **Según el Código Empleado**:
     - *Comunicación Humana Lingüística o Verbal*: Utiliza la palabra hablada (oral-acústica) o la palabra escrita (visuográfica).
     - *Comunicación Humana No Lingüística o No Verbal*: Emplea signos no idiomáticos: visuales/cromáticos (semáforo, tarjeta roja), acústicos (sirena de ambulancia, silbato policial), gestuales/mímicos (guiño, saludo con la mano), táctiles (braille, apretón de manos), proxémicos (distancia física interpersonal).
     - *Comunicación No Humana*: Sistemas de señales instintivas entre animales (danzas de las abejas, feromonas, cantos de apareamiento) o vegetales.
   - **Según la Relación entre Emisor y Receptor**:
     - *Intrapersonal*: El emisor y el receptor son la misma persona (el monólogo interior, la conciencia reflexiva).
     - *Interpersonal*: Interacción entre dos o más personas distintas.
   - **Según el Espacio o Ubicación Física**:
     - *Directa / Próxima*: Emisor y receptor comparten el mismo espacio físico y temporal (una conversación cara a cara, una clase presencial).
     - *Indirecta / A Distancia*: Emisor y receptor están separados en el espacio o en el tiempo (una llamada telefónica, un correo electrónico, la lectura de un libro de Homero).
   - **According to Directionality (Direccionalidad)**:
     - *Unidireccional / Unilateral*: No hay alternancia ni intercambio de roles; el emisor no recibe retroalimentación inmediata (leer un periódico impreso, escuchar la radio, ver un cartel publicitario).
     - *Bidireccional / Recíproca / Bilateral*: Emisor y receptor intercambian continuamente sus roles comunicativos mediante diálogo o debate.
   - **Según el Tipo de Emisor y Receptor**:
     - *Privada*: Dirigida a un destinatario determinado o selecto (una carta personal, un mensaje de WhatsApp individual).
     - *Pública / De Masas*: Mensaje masivo dirigido a una colectividad anónima e indeterminada (conferencia de prensa, editorial de televisión).

---



### Nivel 2: Intermedio / Identificación de Elementos
**Enunciado**: Durante la final de un torneo de fútbol, el árbitro principal hace sonar enérgicamente su silbato metálico para indicar el final del encuentro deportivo. En este acto de comunicación, el **código** y el **canal** son, respectivamente:
A) El árbitro y el silbato metálico  
B) El sistema acústico de toques de silbato y el aire (ondas sonoras)  
C) La cancha de fútbol y el pitazo arbitral  
D) Los futbolistas y el reglamento de la FIFA  
E) El silbato y los tímpanos de los espectadores  

- **Resolución**:
  - Código: El sistema convencional de toques de silbato preestablecido por las reglas del fútbol.
  - Canal: El medio físico a través del cual se propagan las ondas sonoras (el aire atmosférico).
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El arqueólogo Julio C. Tello desentierra en la cuenca de Casma un monolito de piedra con incisiones iconográficas chavín que representan a un ser antropomorfo felínico con garras y colmillos amenazantes. Tras arduos análisis semióticos, Tello publica un informe donde concluye que dicha litoescultura funcionaba hace tres mil años como un dispositivo de terror sacerdotal para subordinar a los campesinos del valle. En este fenómeno de comunicación semiótica a través de la historia, identifique la aseveración técnicamente correcta:
A) Se trata de una comunicación lingüística oral de tipo intrapersonal e inmediata.  
B) El canal físico está constituido por el bloque de granito lítico, el código es el sistema iconográfico chavín y la comunicación es humana no verbal, indirecta y asincrónica a través de los siglos.  
C) El referente primordial es la física de partículas y el emisor es la población campesina receptora.  
D) No existe proceso comunicativo debido a la ausencia de un receptor vivo contemporáneo a la cultura Chavín.  
E) El código empleado es el castellano andino colonial del siglo XVI.  

- **Resolución**:
  - El monolito de piedra tallada funciona como el **soporte material o canal** físico.
  - La iconografía religiosa es un **código no lingüístico / no verbal** de signos visuales.
  - La comunicación es **indirecta y asincrónica**, pues emisor y receptor están separados por milenios en el tiempo histórico; la decodificación arqueológica demuestra la eficacia del circuito semiótico humano.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea con atención el siguiente texto escrito por un profesor de gramática en la pizarra:
> *"La palabra 'ómnibus' es un vocablo esdrújulo; por consiguiente, todas las palabras esdrújulas se tildan obligatoriamente sin excepción en el idioma castellano"*.

Respecto a los elementos de la comunicación y las funciones del lenguaje en el texto anterior, se concluye con rigor lingüístico que:
A) El referente es la historia del transporte público en la ciudad de Lima.  
B) La función predominante es la metalingüística, debido a que el mensaje utiliza la lengua española para analizar y describir las normas ortográficas del propio código lingüístico.  
C) El canal de transmisión son las ondas hertzianas de una emisora radial.  
D) La función conativa es hegemónica porque busca convencer al lector de comprar un boleto de viaje.  
E) Constituye un acto de comunicación no verbal gestual directo.  

- **Resolución**: El enunciado tiene como propósito explicar una regla de acentuación gráfica del propio idioma español (el concepto de palabra esdrújula); cuando el lenguaje se utiliza para hablar sobre las normas del propio código gramatical, la función hegemónica es la **metalingüística o de glosa**.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Encodificación**: Proceso mental psíquico mediante el cual el emisor selecciona signos del código para construir su mensaje.
2. **Decodificación**: Proceso interpretativo inverso mediante el cual el receptor descifra los signos y aprehende el mensaje.
3. **Canal**: Medio físico material o soporte que porta y transporta las señales del mensaje en el espacio-tiempo.
4. **Código**: Conjunto normado y convencional de signos y reglas que permite la estructuración y comprensión del mensaje.
5. **Referente**: Entidad, tema o estado de la realidad objetiva o conceptual al que alude el contenido del mensaje.
6. **Ruido**: Cualquier interferencia física, ambiental o técnica que distorsiona u obstaculiza la transmisión del mensaje.
7. **Redundancia**: Reiteración o refuerzo deliberado del mensaje utilizado para neutralizar el efecto perturbador del ruido.
8. **Función Fática**: Uso del lenguaje enfocado en abrir, verificar, mantener o interrumpir el canal de contacto.
9. **Función Metalingüística**: Empleo del código verbal para estudiar, definir o aclarar las reglas del propio código.
10. **Doble Articulación**: Propiedad del lenguaje humano (Martinet) consistente en estructurarse en monemas (significados) y fonemas (sonidos distintivos).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿A qué elemento de la comunicación corresponde la Función Metalingüística?
  - *Reverso*: Al Código (utiliza el lenguaje para reflexionar sobre el propio lenguaje).

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Canal y Código?
  - *Reverso*: El Canal es el soporte material físico (aire, papel, cable); el Código es el sistema abstracto de signos (el idioma, el semáforo).

- **Flashcard 3**:
  - *Anverso*: ¿Qué función del lenguaje predomina en una orden como "¡Guarda tu teléfono celular inmediatamente!"?
  - *Reverso*: La Función Apelativa o Conativa (orientada a modificar la conducta del Receptor).

- **Flashcard 4**:
  - *Anverso*: ¿Qué elemento del lenguaje es psíquico, social y casi fijo según Ferdinand de Saussure?
  - *Reverso*: La Lengua (el código abstracto socialmente compartido por la comunidad).

---



### D. Las Seis Funciones del Lenguaje (Karl Bühler y Roman Jakobson)
Cada acto lingüístico enfatiza predominantemente un elemento del circuito comunicativo:

```
                            FUNCIONES DEL LENGUAJE (JAKOBSON)
                                           │
         ┌──────────────────┬──────────────┼──────────────┬──────────────────┐
         ▼                  ▼              ▼              ▼                  ▼
    REFERENCIAL        EXPRESIVA       APELATIVA       FÁTICA            POÉTICA
   (Referente)          (Emisor)       (Receptor)      (Canal)          (Mensaje)
         │                  │              │              │                  │
• Informa hechos     • Expresa       • Busca influir • Verifica o      • Crea belleza
  objetivos            sentimientos    en el receptor  mantiene el       y ritmo con
• Textos científicos   y emociones   • Órdenes,        canal abierto     recursos
  y periodísticos    • ¡Qué dolor!     ruegos, avisos  • ¿Aló? ¿Me oyes? retóricos
                                                                             │
                                                                   METALINGÜÍSTICA
                                                                      (Código)
                                                              • Explica el propio idioma
```

#### 1. Función Representativa, Referencial o Denotativa (Karl Bühler)
- **Elemento Focal**: El **Referente** (la realidad objetiva exterior).
- **Finalidad**: Transmitir información objetiva, neutra, verificable y conceptual sobre hechos o estados de cosas del mundo, sin implicar emociones subjetivas del emisor.
- **Tipología textual**: Informes científicos, manuales técnicos, libros de historia, noticias periodísticas objetivas.
- *Ejemplo*: *"Arequipa está ubicada a 2325 metros sobre el nivel del mar"* o *"El agua se compone de hidrógeno y oxígeno"*.

#### 2. Función Expresiva, Emotiva o Sintomática (Karl Bühler)
- **Elemento Focal**: El **Emisor**.
- **Finalidad**: Exteriorizar el mundo interior subjetivo del hablante: sus estados anímicos, sentimientos, emociones, valoraciones íntimas o deseos.
- **Rasgos lingüísticos**: Uso de interjecciones, oraciones exclamativas, entonaciones emotivas, sufijos afectivos y diminutivos/despectivos.
- *Ejemplo*: *"¡Qué alegría inmensa verte ingresar a la universidad!"* o *"¡Ojalá no llueva esta tarde!"*.

#### 3. Función Apelativa o Conativa (Karl Bühler)
- **Elemento Focal**: El **Receptor**.
- **Finalidad**: Influir, persuadir, convencer, conmover o modificar la conducta del oyente para que ejecute una acción, responda a una pregunta o cambie de parecer.
- **Rasgos lingüísticos**: Empleo de oraciones imperativas (mandatos), vocativos, oraciones interrogativas y fórmulas de cortesía.
- **Tipología textual**: Mensajes publicitarios, discursos políticos, arengas militares, reglamentos.
- *Ejemplo*: *"¡Cierra la puerta inmediatamente!"*, *"Postulante, concéntrate en tu examen"* o *"Consume productos nacionales"*.

#### 4. Función Fática o de Contacto (Roman Jakobson)
- **Elemento Focal**: El **Canal** físico de transmisión.
- **Finalidad**: Constatar, abrir, mantener, prolongar, verificar o interrumpir la continuidad del canal de comunicación para asegurar que el mensaje fluye sin cortes técnicos.
- **Rasgos lingüísticos**: Frases de cortesía rituales, muletillas fáticas, fórmulas de saludo y despedida.
- *Ejemplo*: *"¿Aló? ¿Me escuchas bien?"*, *"Uno, dos, tres, probando micrófono"*, *"Buenos días, hasta luego"* o *"Ajá... sí, claro, te sigo"*.

#### 5. Función Poética o Estética (Roman Jakobson)
- **Elemento Focal**: El **Mensaje** en su propia forma material y belleza discursiva.
- **Finalidad**: Atraer la atención sobre la estructura artística, la armonía fónica, el ritmo y la elegancia de las palabras mediante recursos estilísticos y figuras retóricas.
- **Tipología textual**: Poesía, novelas literarias, refranes populares, eslóganes publicitarios ingeniosos.
- *Ejemplo*: *"Volverán las oscuras golondrinas en tu balcón sus nidos a colgar"* o *"Camarón que se duerme se lo lleva la corriente"*.

#### 6. Función Metalingüística o de Glosa (Roman Jakobson)
- **Elemento Focal**: El **Código** lingüístico (el propio idioma).
- **Finalidad**: Utilizar el lenguaje como instrumento para reflexionar, analizar, definir o aclarar las reglas gramaticales, ortográficas o semánticas del propio código lingüístico.
- **Tipología textual**: Diccionarios, clases de gramática, tratados de lingüística, correcciones ortográficas.
- *Ejemplo*: *"La palabra 'canción' lleva tilde por ser aguda terminada en n"* o *"El sustantivo es el núcleo del sintagma nominal"*.

---



## 4. CUADRO COMPARATIVO: ELEMENTOS Y FUNCIONES DEL LENGUAJE

| Elemento de la Comunicación | Función del Lenguaje Asociada | Propósito Comunicativo Primordial | Ejemplo Característico de Admisión |
| :--- | :--- | :--- | :--- |
| **Referente** | **Representativa / Referencial** | Informar con objetividad científica o factual. | *"El punto de ebullición del agua pura es 100 °C".* |
| **Emisor** | **Expresiva / Emotiva** | Manifestar estados anímicos y juicios íntimos. | *"¡Qué calor insoportable hace en este desierto!".* |
| **Receptor** | **Apelativa / Conativa** | Inducir una respuesta, orden o persuasión. | *"¡Guarden silencio y abran sus cuadernos de trabajo!".* |
| **Canal** | **Fática / De Contacto** | Abrir, verificar o cerrar el canal físico. | *"¿Hola? ¿Estás todavía en la línea telefónica?".* |
| **Mensaje** | **Poética / Estética** | Realzar la belleza y plasticidad de las palabras. | *"Hay golpes en la vida tan fuertes... ¡Yo no sé!".* |
| **Código** | **Metalingüística / Glosa** | Explicar el significado o norma del propio idioma.| *"Los verbos transitivos exigen objeto directo".* |

---



### B. Elementos del Proceso Comunicativo
1. **Emisor (Encodificador)**: Sujeto, fuente o grupo que concibe, estructura y emite el mensaje codificado con una intención comunicativa determinada.
2. **Receptor (Decodificador / Destinatario)**: Sujeto o audiencia que recibe el mensaje a través de sus sentidos y realiza el proceso inverso de descifrar e interpretar los signos recibidos.
3. **Mensaje**: El contenido cognitivo, afectivo o volitivo que se transmite; la información organizada y configurada en signos.
4. **Código**: Sistema convencional y estructurado de signos y reglas combinatorias que el emisor y el receptor deben compartir forzosamente para que haya comprensión mutua (ej. el idioma castellano, el código Morse, el sistema Braille, las luces del semáforo).
5. **Canal**: El **soporte físico o medio material** a través del cual viaja el mensaje desde el emisor hacia el receptor:
   - *Natural*: El aire y las ondas sonoras en la conversación oral directa.
   - *Artificial*: El papel en una carta, el cable de fibra óptica, las ondas electromagnéticas en la radio, la pantalla del teléfono celular.
6. **Referente (Realidad Aludida)**: El aspecto concreto o abstracto del mundo real o imaginario al que alude el mensaje (el tema, el objeto o hecho del que se habla).
7. **Contexto o Circunstancia**: El entorno socioespacial, temporal, cultural y psicológico en el que se produce el acto comunicativo, el cual condiciona decisivamente el significado preciso del mensaje (*"No es lo mismo decir '¡Fuego!' en un campo de tiro que en una sala de cine llena"*).
8. **Fenómenos Interferentes**:
   - **Ruido**: Cualquier interferencia, perturbación u obstáculo físico, técnico, semántico o psicológico que dificulta, distorsiona o impide la recepción fiel del mensaje (manchas de tinta, ruido de motores, mala ortografía, estática telefónica).
   - **Redundancia**: Todo recurso verbal o técnico empleado deliberadamente para reforzar el mensaje, combatir el ruido y asegurar su correcta decodificación (repeticiones, subrayados, mayúsculas, gestos enfáticos).
   - **Retroalimentación (*Feedback*)**: La respuesta o reacción observable del receptor que permite al emisor verificar si el mensaje fue comprendido y ajustar su emisión.

---



## 2. MAPA CONCEPTUAL Y CIRCUITO DE LA COMUNICACIÓN

```
                                  EL CIRCUITO COMUNICATIVO
                                              │
                                        [ CONTEXTO ]
                                (Espacio, tiempo y situación)
                                              │
                                         [ REFERENTE ]
                                 (Realidad objetiva aludida)
                                              │
                      ┌────────────────── [ MENSAJE ] ──────────────────┐
                      │             (Contenido transmitido)             │
                      ▼                                                 ▼
                [ EMISOR ] ────────────── [ CANAL ] ────────────── [ RECEPTOR ]
              (Encodifica)             (Soporte físico)             (Decodifica)
                      │                                                 │
                      └───────────────── [ CÓDIGO ] ────────────────────┘
                                   (Sistema de signos)
```

---



### C. Lenguaje, Lengua y Habla: Los Tres Planos de Ferdinand de Saussure
1. **El Lenguaje**:
   - Facultad humana universal y biológica de comunicarse mediante signos articulados.
   - Rasgos: Universal, innato (Chomsky), inmutable, racional y doblemente articulado (André Martinet: monemas y fonemas).
2. **La Lengua**:
   - Sistema de signos o código abstracto socialmente compartido por los miembros de una comunidad lingüística determinada (el español, el quechua, el inglés).
   - Rasgos: Social, psíquica (está en la mente colectiva), virtual, casi fija y perdurable.
3. **El Habla**:
   - El uso individual, fáctico y concreto que cada hablante hace de su lengua en un momento y lugar determinados.
   - Rasgos: Individual, psicofísica (implica mente y aparato fonador), momentánea, efímera y mutable.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t01_s02_c01",
                    question = "El sonido estridente de la sirena de una ambulancia que solicita paso en una avenida principal constituye una comunicación:",
                    options = listOf(
                        "No humana sensorial",
                        "Verbal visuográfica",
                        "Lingüística acústica",
                        "Humana no verbal acústica"
                    ),
                    correctIndex = 3,
                    explanation = "La sirena de ambulancia es una señal sonora artificial no verbal producida por el ser humano para transmitir un mensaje de emergencia."
                ),
                Challenge(
                    id = "leng_t01_s02_c02",
                    question = "Cuando un postulante reflexiona en silencio sobre las alternativas antes de marcar su tarjeta de respuestas, se manifiesta una comunicación:",
                    options = listOf(
                        "Intrapersonal",
                        "Interpersonal indirecta",
                        "Unidireccional de masas",
                        "Bilateral pública"
                    ),
                    correctIndex = 0,
                    explanation = "La comunicación intrapersonal es aquella donde emisor y receptor coinciden en el mismo individuo mediante el pensamiento o monólogo interior."
                ),
                Challenge(
                    id = "leng_t01_s02_c03",
                    question = "¿Qué tipo de comunicación se produce durante un encarnizado debate electoral televisado entre dos candidatos presidenciales?",
                    options = listOf(
                        "Unidireccional e intrapersonal",
                        "No lingüística y unidireccional",
                        "Privada y no verbal",
                        "Bidireccional, interpersonal y directa"
                    ),
                    correctIndex = 3,
                    explanation = "En un debate presencial, los interlocutores comparten espacio y alternan roles de emisor y receptor en diálogo recíproco (bidireccional, interpersonal y directa)."
                ),
                Challenge(
                    id = "leng_t01_s02_c04",
                    question = "La lectura de un cartel publicitario colocado en la carretera Panamericana Sur corresponde a una comunicación:",
                    options = listOf(
                        "Directa y no lingüística",
                        "Unidireccional, pública e indirecta",
                        "Intrapersonal y acústica",
                        "Bidireccional y privada"
                    ),
                    correctIndex = 1,
                    explanation = "Un cartel publicitario no permite réplica inmediata (unidireccional), se dirige a una masa indeterminada (pública) y el emisor no está presente físicamente ante el conductor (indirecta)."
                ),
                Challenge(
                    id = "leng_t01_s02_c05",
                    question = "El sistema de lectura y escritura táctil para invidentes ideado por Louis Braille se clasifica como comunicación:",
                    options = listOf(
                        "Humana no lingüística táctil",
                        "Proxémica espacial",
                        "No humana biológica",
                        "Exclusivamente oral acústica"
                    ),
                    correctIndex = 0,
                    explanation = "El sistema Braille utiliza puntos en relieve percibidos mediante el sentido del tacto (comunicación no lingüística / no verbal táctil)."
                ),
                Challenge(
                    id = "leng_t01_s02_c06",
                    question = "La danza en forma de ocho que realiza una abeja exploradora para informar a la colmena la ubicación y distancia del néctar es un ejemplo de:",
                    options = listOf(
                        "Comunicación no humana",
                        "Comunicación intrapersonal",
                        "Comunicación verbal no idiomática",
                        "Comunicación indirecta visuográfica"
                    ),
                    correctIndex = 0,
                    explanation = "Las señales instintivas y biológicas transmitidas entre animales forman parte de los sistemas de comunicación no humana."
                ),
                Challenge(
                    id = "leng_t01_s02_c07",
                    question = "Si un joven envía una carta manuscrita a su abuelo que reside en otra provincia, por el espacio temporal y geográfico la comunicación es:",
                    options = listOf(
                        "Directa o próxima",
                        "Indirecta o a distancia",
                        "Intrapersonal acústica",
                        "Pública o de masas"
                    ),
                    correctIndex = 1,
                    explanation = "Cuando el emisor y el receptor se hallan separados por la distancia física o el tiempo, la comunicación es indirecta o a distancia."
                ),
                Challenge(
                    id = "leng_t01_s02_c08",
                    question = "¿Cuál de las siguientes situaciones ejemplifica una comunicación humana no verbal gestual o mímica?",
                    options = listOf(
                        "Un mensaje de correo electrónico con acuse de recibo",
                        "El silbato del réferi al cobrar penal",
                        "La lectura de las noticias del periódico matutino",
                        "Un guiño de complicidad entre dos compañeros en el aula"
                    ),
                    correctIndex = 3,
                    explanation = "El guiño es un movimiento ocular intencional que transmite un mensaje mediante la expresión facial (comunicación no verbal gestual)."
                ),
                Challenge(
                    id = "leng_t01_s02_c09",
                    question = "La luz roja de un semáforo que ordena detenerse a los conductores en una intersección es un signo comunicativo de tipo:",
                    options = listOf(
                        "Verbal articulado",
                        "Visual o cromático",
                        "Acústico",
                        "Proxémico"
                    ),
                    correctIndex = 1,
                    explanation = "Las luces del semáforo emplean el color como código visual convencional para regular el tránsito vehicular (comunicación no verbal visual/cromática)."
                ),
                Challenge(
                    id = "leng_t01_s02_c10",
                    question = "Cuando escuchamos la transmisión de un programa informativo por la radio sin participar como locutores, la comunicación es clasificada como:",
                    options = listOf(
                        "Bidireccional",
                        "Intrapersonal",
                        "Directa y recíproca",
                        "Unidireccional"
                    ),
                    correctIndex = 3,
                    explanation = "Es unidireccional porque el oyente actúa como receptor pasivo sin intercambiar roles comunicativos de inmediato con el emisor radial."
                )
            )
        ),
        LessonNode(
            id = "leng_t01_s03",
            title = "Planos del Lenguaje y las Seis Funciones del Lenguaje (Bühler y Jakobson)",
            theory = LessonTheory(
                title = "Lenguaje, Lengua, Habla y las Seis Funciones del Lenguaje",
                content = """# TEMA 01: COMUNICACIÓN Y LENGUAJE

---



### C. Lenguaje, Lengua y Habla: Los Tres Planos de Ferdinand de Saussure
1. **El Lenguaje**:
   - Facultad humana universal y biológica de comunicarse mediante signos articulados.
   - Rasgos: Universal, innato (Chomsky), inmutable, racional y doblemente articulado (André Martinet: monemas y fonemas).
2. **La Lengua**:
   - Sistema de signos o código abstracto socialmente compartido por los miembros de una comunidad lingüística determinada (el español, el quechua, el inglés).
   - Rasgos: Social, psíquica (está en la mente colectiva), virtual, casi fija y perdurable.
3. **El Habla**:
   - El uso individual, fáctico y concreto que cada hablante hace de su lengua en un momento y lugar determinados.
   - Rasgos: Individual, psicofísica (implica mente y aparato fonador), momentánea, efímera y mutable.

---



### D. Las Seis Funciones del Lenguaje (Karl Bühler y Roman Jakobson)
Cada acto lingüístico enfatiza predominantemente un elemento del circuito comunicativo:

```
                            FUNCIONES DEL LENGUAJE (JAKOBSON)
                                           │
         ┌──────────────────┬──────────────┼──────────────┬──────────────────┐
         ▼                  ▼              ▼              ▼                  ▼
    REFERENCIAL        EXPRESIVA       APELATIVA       FÁTICA            POÉTICA
   (Referente)          (Emisor)       (Receptor)      (Canal)          (Mensaje)
         │                  │              │              │                  │
• Informa hechos     • Expresa       • Busca influir • Verifica o      • Crea belleza
  objetivos            sentimientos    en el receptor  mantiene el       y ritmo con
• Textos científicos   y emociones   • Órdenes,        canal abierto     recursos
  y periodísticos    • ¡Qué dolor!     ruegos, avisos  • ¿Aló? ¿Me oyes? retóricos
                                                                             │
                                                                   METALINGÜÍSTICA
                                                                      (Código)
                                                              • Explica el propio idioma
```

#### 1. Función Representativa, Referencial o Denotativa (Karl Bühler)
- **Elemento Focal**: El **Referente** (la realidad objetiva exterior).
- **Finalidad**: Transmitir información objetiva, neutra, verificable y conceptual sobre hechos o estados de cosas del mundo, sin implicar emociones subjetivas del emisor.
- **Tipología textual**: Informes científicos, manuales técnicos, libros de historia, noticias periodísticas objetivas.
- *Ejemplo*: *"Arequipa está ubicada a 2325 metros sobre el nivel del mar"* o *"El agua se compone de hidrógeno y oxígeno"*.

#### 2. Función Expresiva, Emotiva o Sintomática (Karl Bühler)
- **Elemento Focal**: El **Emisor**.
- **Finalidad**: Exteriorizar el mundo interior subjetivo del hablante: sus estados anímicos, sentimientos, emociones, valoraciones íntimas o deseos.
- **Rasgos lingüísticos**: Uso de interjecciones, oraciones exclamativas, entonaciones emotivas, sufijos afectivos y diminutivos/despectivos.
- *Ejemplo*: *"¡Qué alegría inmensa verte ingresar a la universidad!"* o *"¡Ojalá no llueva esta tarde!"*.

#### 3. Función Apelativa o Conativa (Karl Bühler)
- **Elemento Focal**: El **Receptor**.
- **Finalidad**: Influir, persuadir, convencer, conmover o modificar la conducta del oyente para que ejecute una acción, responda a una pregunta o cambie de parecer.
- **Rasgos lingüísticos**: Empleo de oraciones imperativas (mandatos), vocativos, oraciones interrogativas y fórmulas de cortesía.
- **Tipología textual**: Mensajes publicitarios, discursos políticos, arengas militares, reglamentos.
- *Ejemplo*: *"¡Cierra la puerta inmediatamente!"*, *"Postulante, concéntrate en tu examen"* o *"Consume productos nacionales"*.

#### 4. Función Fática o de Contacto (Roman Jakobson)
- **Elemento Focal**: El **Canal** físico de transmisión.
- **Finalidad**: Constatar, abrir, mantener, prolongar, verificar o interrumpir la continuidad del canal de comunicación para asegurar que el mensaje fluye sin cortes técnicos.
- **Rasgos lingüísticos**: Frases de cortesía rituales, muletillas fáticas, fórmulas de saludo y despedida.
- *Ejemplo*: *"¿Aló? ¿Me escuchas bien?"*, *"Uno, dos, tres, probando micrófono"*, *"Buenos días, hasta luego"* o *"Ajá... sí, claro, te sigo"*.

#### 5. Función Poética o Estética (Roman Jakobson)
- **Elemento Focal**: El **Mensaje** en su propia forma material y belleza discursiva.
- **Finalidad**: Atraer la atención sobre la estructura artística, la armonía fónica, el ritmo y la elegancia de las palabras mediante recursos estilísticos y figuras retóricas.
- **Tipología textual**: Poesía, novelas literarias, refranes populares, eslóganes publicitarios ingeniosos.
- *Ejemplo*: *"Volverán las oscuras golondrinas en tu balcón sus nidos a colgar"* o *"Camarón que se duerme se lo lleva la corriente"*.

#### 6. Función Metalingüística o de Glosa (Roman Jakobson)
- **Elemento Focal**: El **Código** lingüístico (el propio idioma).
- **Finalidad**: Utilizar el lenguaje como instrumento para reflexionar, analizar, definir o aclarar las reglas gramaticales, ortográficas o semánticas del propio código lingüístico.
- **Tipología textual**: Diccionarios, clases de gramática, tratados de lingüística, correcciones ortográficas.
- *Ejemplo*: *"La palabra 'canción' lleva tilde por ser aguda terminada en n"* o *"El sustantivo es el núcleo del sintagma nominal"*.

---



## 4. CUADRO COMPARATIVO: ELEMENTOS Y FUNCIONES DEL LENGUAJE

| Elemento de la Comunicación | Función del Lenguaje Asociada | Propósito Comunicativo Primordial | Ejemplo Característico de Admisión |
| :--- | :--- | :--- | :--- |
| **Referente** | **Representativa / Referencial** | Informar con objetividad científica o factual. | *"El punto de ebullición del agua pura es 100 °C".* |
| **Emisor** | **Expresiva / Emotiva** | Manifestar estados anímicos y juicios íntimos. | *"¡Qué calor insoportable hace en este desierto!".* |
| **Receptor** | **Apelativa / Conativa** | Inducir una respuesta, orden o persuasión. | *"¡Guarden silencio y abran sus cuadernos de trabajo!".* |
| **Canal** | **Fática / De Contacto** | Abrir, verificar o cerrar el canal físico. | *"¿Hola? ¿Estás todavía en la línea telefónica?".* |
| **Mensaje** | **Poética / Estética** | Realzar la belleza y plasticidad de las palabras. | *"Hay golpes en la vida tan fuertes... ¡Yo no sé!".* |
| **Código** | **Metalingüística / Glosa** | Explicar el significado o norma del propio idioma.| *"Los verbos transitivos exigen objeto directo".* |

---



### Nemotecnia de Elementos vs. Funciones:
> **"RE-RE, EMI-EX, RECEP-APE, CA-FA, MEN-POE, CÓD-META"**
- **RE**ferente \rightarrow **RE**ferencial
- **EMI**sor \rightarrow **EX**presiva
- **RECEP**tor \rightarrow **APE**lativa
- **CA**nal \rightarrow **FÁ**tica
- **MEN**saje \rightarrow **POE**tica
- **CÓD**igo \rightarrow **META**lingüística



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa del Canal vs. Código**:
   - El *código* es abstracto (el idioma castellano, el inglés, las señales de tránsito).
   - El *canal* es el soporte material físico (la hoja de papel, el aire, la pantalla del celular). Confundir el idioma español con el canal es el error más castigado en admisión.
2. **Poética vs. Expresiva**:
   - Si la oración transmite una emoción cruda sin elaboración artística (*"¡Me duele la muela!"*) \rightarrow **Expresiva**.
   - Si utiliza metáforas, rima o cuidado rítmico estético (*"Tus ojos son dos luceros que iluminan mi sendero"*) \rightarrow **Poética**.
3. **Metalingüística encubierta**:
   - Toda definición de diccionario o regla de acentuación es **función metalingüística**, aunque aparentemente informe un hecho objetivo. Si el mensaje habla de palabras, fonemas o verbos, el código habla de sí mismo \rightarrow Metalingüística.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: En un salón de clases, el docente de química escribe en la pizarra: *"El ácido sulfúrico es un compuesto químico altamente corrosivo cuya fórmula molecular es \text{H}_2\text{SO}_4"*. La función del lenguaje que predomina de manera excluyente en dicho enunciado es la:
A) Emotiva o expresiva  
B) Fática o de contacto  
C) Representativa o referencial  
D) Poética o estética  
E) Conativa o apelativa  

- **Resolución**: El enunciado comunica una información objetiva, neutra, verificable y científica de la realidad empírica, sin implicar emociones del hablante ni figuras poéticas; por ende, predomina la **función representativa o referencial**.
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Una operadora de telefonía móvil se comunica con un cliente y pronuncia las siguientes frases sucesivas:
1. *"¿Aló? ¿Me escucha con claridad, señor Quispe?"*
2. *"Por favor, confirme su número de documento de identidad para activar su plan"*.

Las funciones del lenguaje que se manifiestan de manera predominante en las expresiones 1 y 2 son, respectivamente:
A) Metalingüística y expresiva  
B) Fática y apelativa  
C) Referencial y poética  
D) Fática y representativa  
E) Apelativa y emotiva  

- **Resolución**:
  - En la expresión 1 (*"¿Aló? ¿Me escucha...?"*), el propósito es verificar la operatividad técnica del canal telefónico \rightarrow **Función fática**.
  - En la expresión 2 (*"Por favor, confirme..."*), se busca inducir una acción u orden imperativa en el receptor \rightarrow **Función apelativa o conativa**.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea con atención el siguiente texto escrito por un profesor de gramática en la pizarra:
> *"La palabra 'ómnibus' es un vocablo esdrújulo; por consiguiente, todas las palabras esdrújulas se tildan obligatoriamente sin excepción en el idioma castellano"*.

Respecto a los elementos de la comunicación y las funciones del lenguaje en el texto anterior, se concluye con rigor lingüístico que:
A) El referente es la historia del transporte público en la ciudad de Lima.  
B) La función predominante es la metalingüística, debido a que el mensaje utiliza la lengua española para analizar y describir las normas ortográficas del propio código lingüístico.  
C) El canal de transmisión son las ondas hertzianas de una emisora radial.  
D) La función conativa es hegemónica porque busca convencer al lector de comprar un boleto de viaje.  
E) Constituye un acto de comunicación no verbal gestual directo.  

- **Resolución**: El enunciado tiene como propósito explicar una regla de acentuación gráfica del propio idioma español (el concepto de palabra esdrújula); cuando el lenguaje se utiliza para hablar sobre las normas del propio código gramatical, la función hegemónica es la **metalingüística o de glosa**.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Encodificación**: Proceso mental psíquico mediante el cual el emisor selecciona signos del código para construir su mensaje.
2. **Decodificación**: Proceso interpretativo inverso mediante el cual el receptor descifra los signos y aprehende el mensaje.
3. **Canal**: Medio físico material o soporte que porta y transporta las señales del mensaje en el espacio-tiempo.
4. **Código**: Conjunto normado y convencional de signos y reglas que permite la estructuración y comprensión del mensaje.
5. **Referente**: Entidad, tema o estado de la realidad objetiva o conceptual al que alude el contenido del mensaje.
6. **Ruido**: Cualquier interferencia física, ambiental o técnica que distorsiona u obstaculiza la transmisión del mensaje.
7. **Redundancia**: Reiteración o refuerzo deliberado del mensaje utilizado para neutralizar el efecto perturbador del ruido.
8. **Función Fática**: Uso del lenguaje enfocado en abrir, verificar, mantener o interrumpir el canal de contacto.
9. **Función Metalingüística**: Empleo del código verbal para estudiar, definir o aclarar las reglas del propio código.
10. **Doble Articulación**: Propiedad del lenguaje humano (Martinet) consistente en estructurarse en monemas (significados) y fonemas (sonidos distintivos).

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿A qué elemento de la comunicación corresponde la Función Metalingüística?
  - *Reverso*: Al Código (utiliza el lenguaje para reflexionar sobre el propio lenguaje).

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Canal y Código?
  - *Reverso*: El Canal es el soporte material físico (aire, papel, cable); el Código es el sistema abstracto de signos (el idioma, el semáforo).

- **Flashcard 3**:
  - *Anverso*: ¿Qué función del lenguaje predomina en una orden como "¡Guarda tu teléfono celular inmediatamente!"?
  - *Reverso*: La Función Apelativa o Conativa (orientada a modificar la conducta del Receptor).

- **Flashcard 4**:
  - *Anverso*: ¿Qué elemento del lenguaje es psíquico, social y casi fijo según Ferdinand de Saussure?
  - *Reverso*: La Lengua (el código abstracto socialmente compartido por la comunidad).

---



## 2. MAPA CONCEPTUAL Y CIRCUITO DE LA COMUNICACIÓN

```
                                  EL CIRCUITO COMUNICATIVO
                                              │
                                        [ CONTEXTO ]
                                (Espacio, tiempo y situación)
                                              │
                                         [ REFERENTE ]
                                 (Realidad objetiva aludida)
                                              │
                      ┌────────────────── [ MENSAJE ] ──────────────────┐
                      │             (Contenido transmitido)             │
                      ▼                                                 ▼
                [ EMISOR ] ────────────── [ CANAL ] ────────────── [ RECEPTOR ]
              (Encodifica)             (Soporte físico)             (Decodifica)
                      │                                                 │
                      └───────────────── [ CÓDIGO ] ────────────────────┘
                                   (Sistema de signos)
```

---



### A. La Comunicación: Concepto, Fases y Tipología
1. **Definición**: Proceso social dinámico e interactivo mediante el cual un emisor transmite intencionalmente información (ideas, emociones, órdenes, datos) a un receptor utilizando un sistema de signos compartido a través de un canal determinado.
2. **Las Tres Fases de la Comunicación**:
   - **Fase Psíquica**: En el emisor ocurre la ideación y la **encodificación** (selección de signos en el cerebro); en el receptor, la **decodificación** (asociación de signos con significados).
   - **Fase Fisiológica**: En el emisor, impulsos nerviosos activan los órganos fonadores (aparato fonador) o motores (manos); en el receptor, se activan los órganos receptores (oído, vista).
   - **Fase Física**: El desplazamiento de ondas sonoras o luminosas a través del medio ambiente (canal).
3. **Tipos de Comunicación**:
   - **Según el Código Empleado**:
     - *Comunicación Humana Lingüística o Verbal*: Utiliza la palabra hablada (oral-acústica) o la palabra escrita (visuográfica).
     - *Comunicación Humana No Lingüística o No Verbal*: Emplea signos no idiomáticos: visuales/cromáticos (semáforo, tarjeta roja), acústicos (sirena de ambulancia, silbato policial), gestuales/mímicos (guiño, saludo con la mano), táctiles (braille, apretón de manos), proxémicos (distancia física interpersonal).
     - *Comunicación No Humana*: Sistemas de señales instintivas entre animales (danzas de las abejas, feromonas, cantos de apareamiento) o vegetales.
   - **Según la Relación entre Emisor y Receptor**:
     - *Intrapersonal*: El emisor y el receptor son la misma persona (el monólogo interior, la conciencia reflexiva).
     - *Interpersonal*: Interacción entre dos o más personas distintas.
   - **Según el Espacio o Ubicación Física**:
     - *Directa / Próxima*: Emisor y receptor comparten el mismo espacio físico y temporal (una conversación cara a cara, una clase presencial).
     - *Indirecta / A Distancia*: Emisor y receptor están separados en el espacio o en el tiempo (una llamada telefónica, un correo electrónico, la lectura de un libro de Homero).
   - **According to Directionality (Direccionalidad)**:
     - *Unidireccional / Unilateral*: No hay alternancia ni intercambio de roles; el emisor no recibe retroalimentación inmediata (leer un periódico impreso, escuchar la radio, ver un cartel publicitario).
     - *Bidireccional / Recíproca / Bilateral*: Emisor y receptor intercambian continuamente sus roles comunicativos mediante diálogo o debate.
   - **Según el Tipo de Emisor y Receptor**:
     - *Privada*: Dirigida a un destinatario determinado o selecto (una carta personal, un mensaje de WhatsApp individual).
     - *Pública / De Masas*: Mensaje masivo dirigido a una colectividad anónima e indeterminada (conferencia de prensa, editorial de televisión).

---



### B. Elementos del Proceso Comunicativo
1. **Emisor (Encodificador)**: Sujeto, fuente o grupo que concibe, estructura y emite el mensaje codificado con una intención comunicativa determinada.
2. **Receptor (Decodificador / Destinatario)**: Sujeto o audiencia que recibe el mensaje a través de sus sentidos y realiza el proceso inverso de descifrar e interpretar los signos recibidos.
3. **Mensaje**: El contenido cognitivo, afectivo o volitivo que se transmite; la información organizada y configurada en signos.
4. **Código**: Sistema convencional y estructurado de signos y reglas combinatorias que el emisor y el receptor deben compartir forzosamente para que haya comprensión mutua (ej. el idioma castellano, el código Morse, el sistema Braille, las luces del semáforo).
5. **Canal**: El **soporte físico o medio material** a través del cual viaja el mensaje desde el emisor hacia el receptor:
   - *Natural*: El aire y las ondas sonoras en la conversación oral directa.
   - *Artificial*: El papel en una carta, el cable de fibra óptica, las ondas electromagnéticas en la radio, la pantalla del teléfono celular.
6. **Referente (Realidad Aludida)**: El aspecto concreto o abstracto del mundo real o imaginario al que alude el mensaje (el tema, el objeto o hecho del que se habla).
7. **Contexto o Circunstancia**: El entorno socioespacial, temporal, cultural y psicológico en el que se produce el acto comunicativo, el cual condiciona decisivamente el significado preciso del mensaje (*"No es lo mismo decir '¡Fuego!' en un campo de tiro que en una sala de cine llena"*).
8. **Fenómenos Interferentes**:
   - **Ruido**: Cualquier interferencia, perturbación u obstáculo físico, técnico, semántico o psicológico que dificulta, distorsiona o impide la recepción fiel del mensaje (manchas de tinta, ruido de motores, mala ortografía, estática telefónica).
   - **Redundancia**: Todo recurso verbal o técnico empleado deliberadamente para reforzar el mensaje, combatir el ruido y asegurar su correcta decodificación (repeticiones, subrayados, mayúsculas, gestos enfáticos).
   - **Retroalimentación (*Feedback*)**: La respuesta o reacción observable del receptor que permite al emisor verificar si el mensaje fue comprendido y ajustar su emisión.

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El arqueólogo Julio C. Tello desentierra en la cuenca de Casma un monolito de piedra con incisiones iconográficas chavín que representan a un ser antropomorfo felínico con garras y colmillos amenazantes. Tras arduos análisis semióticos, Tello publica un informe donde concluye que dicha litoescultura funcionaba hace tres mil años como un dispositivo de terror sacerdotal para subordinar a los campesinos del valle. En este fenómeno de comunicación semiótica a través de la historia, identifique la aseveración técnicamente correcta:
A) Se trata de una comunicación lingüística oral de tipo intrapersonal e inmediata.  
B) El canal físico está constituido por el bloque de granito lítico, el código es el sistema iconográfico chavín y la comunicación es humana no verbal, indirecta y asincrónica a través de los siglos.  
C) El referente primordial es la física de partículas y el emisor es la población campesina receptora.  
D) No existe proceso comunicativo debido a la ausencia de un receptor vivo contemporáneo a la cultura Chavín.  
E) El código empleado es el castellano andino colonial del siglo XVI.  

- **Resolución**:
  - El monolito de piedra tallada funciona como el **soporte material o canal** físico.
  - La iconografía religiosa es un **código no lingüístico / no verbal** de signos visuales.
  - La comunicación es **indirecta y asincrónica**, pues emisor y receptor están separados por milenios en el tiempo histórico; la decodificación arqueológica demuestra la eficacia del circuito semiótico humano.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t01_s03_c01",
                    question = "La función del lenguaje en la cual el emisor busca influir en el comportamiento del receptor para que realice una acción se denomina:",
                    options = listOf(
                        "Expresiva",
                        "Fática",
                        "Apelativa o conativa",
                        "Metalingüística"
                    ),
                    correctIndex = 2,
                    explanation = "La función apelativa o conativa está centrada en el receptor y tiene como objetivo ordenar, pedir o modificar su conducta."
                ),
                Challenge(
                    id = "leng_t01_s03_c02",
                    question = "En la frase 'El punto de ebullición del agua a nivel del mar es 100 grados Celsius', la función del lenguaje predominante es:",
                    options = listOf(
                        "Poética o estética",
                        "Emotiva",
                        "Representativa o referencial",
                        "Fática de contacto"
                    ),
                    correctIndex = 2,
                    explanation = "El enunciado informa de manera objetiva, científica y verificable sobre un hecho de la realidad sin emociones del emisor, cumpliendo función referencial."
                ),
                Challenge(
                    id = "leng_t01_s03_c03",
                    question = "¿A qué elemento focal del circuito comunicativo corresponde la función metalingüística del lenguaje?",
                    options = listOf(
                        "Al canal",
                        "Al referente",
                        "Al emisor",
                        "Al código"
                    ),
                    correctIndex = 3,
                    explanation = "La función metalingüística se centra en el código, pues utiliza la lengua para explicar las reglas y conceptos del propio idioma."
                ),
                Challenge(
                    id = "leng_t01_s03_c04",
                    question = "Cuando en una llamada decimos '¿Aló? ¿Me escuchas? Sí, ajá...', la función lingüística que se activa primordialmente es:",
                    options = listOf(
                        "Representativa",
                        "Conativa",
                        "Fática o de contacto",
                        "Estética"
                    ),
                    correctIndex = 2,
                    explanation = "La función fática verifica, abre o mantiene el canal físico de comunicación para comprobar que la señal fluye adecuadamente."
                ),
                Challenge(
                    id = "leng_t01_s03_c05",
                    question = "En el verso 'Hay golpes en la vida tan fuertes... ¡Yo no sé!' de César Vallejo, el lenguaje cumple predominantemente la función:",
                    options = listOf(
                        "Metalingüística",
                        "Referencial pura",
                        "Poética o estética",
                        "Fática"
                    ),
                    correctIndex = 2,
                    explanation = "La función poética o estética se enfoca en el mensaje mismo, empleando recursos estilísticos, cadencia y belleza literaria."
                ),
                Challenge(
                    id = "leng_t01_s03_c06",
                    question = "La afirmación 'Los verbos transitivos exigen obligatoriamente la presencia de un objeto directo' cumple una función:",
                    options = listOf(
                        "Apelativa",
                        "Metalingüística",
                        "Expresiva",
                        "Poética"
                    ),
                    correctIndex = 1,
                    explanation = "El mensaje aborda y explica una regla gramatical del idioma español; cuando el lenguaje habla del lenguaje, la función es metalingüística."
                ),
                Challenge(
                    id = "leng_t01_s03_c07",
                    question = "Según Ferdinand de Saussure, la lengua se diferencia esencialmente del habla por ser:",
                    options = listOf(
                        "Social, psíquica y un código abstracto compartido",
                        "Un acto puramente motor",
                        "Individual y momentánea",
                        "Psicofísica y efímera"
                    ),
                    correctIndex = 0,
                    explanation = "La lengua es el sistema social, virtual y psíquico compartido por la comunidad, mientras que el habla es su realización individual y concreta."
                ),
                Challenge(
                    id = "leng_t01_s03_c08",
                    question = "La expresión '¡Qué alegría tan inmensa siento por tu ingreso a Medicina!' cumple preponderantemente la función:",
                    options = listOf(
                        "Referencial",
                        "Expresiva o emotiva",
                        "Apelativa",
                        "Fática"
                    ),
                    correctIndex = 1,
                    explanation = "La función expresiva o emotiva se centra en el emisor para manifestar sus emociones, sentimientos o estados de ánimo subjetivos."
                ),
                Challenge(
                    id = "leng_t01_s03_c09",
                    question = "¿Quién formuló el principio de la doble articulación del lenguaje humano (morfemas y fonemas)?",
                    options = listOf(
                        "Karl Bühler",
                        "Roman Jakobson",
                        "André Martinet",
                        "Noam Chomsky"
                    ),
                    correctIndex = 2,
                    explanation = "André Martinet postuló que el lenguaje humano se articula en dos niveles: primera articulación en monemas (significado) y segunda articulación en fonemas (distintivos)."
                ),
                Challenge(
                    id = "leng_t01_s03_c10",
                    question = "La orden 'Postulantes, guarden sus mochilas y muestren su carné de inscripción' cumple la función del lenguaje centrada en el:",
                    options = listOf(
                        "Receptor",
                        "Mensaje",
                        "Emisor",
                        "Canal"
                    ),
                    correctIndex = 0,
                    explanation = "Cumple la función apelativa o conativa, la cual está centrada en el receptor para guiar o mandar sobre su conducta."
                ),
                Challenge(
                    id = "leng_t01_s03_c11",
                    question = "El carácter innato del lenguaje, como facultad biológica heredada e inscrita genéticamente en el cerebro humano, fue sostenido fundamentalmente por:",
                    options = listOf(
                        "Ferdinand de Saussure",
                        "Noam Chomsky",
                        "Roman Jakobson",
                        "Karl Bühler"
                    ),
                    correctIndex = 1,
                    explanation = "Noam Chomsky desarrolló la teoría generativa que postula el carácter innato y universal de la facultad del lenguaje humano."
                ),
                Challenge(
                    id = "leng_t01_s03_c12",
                    question = "En la frase 'La palabra árbol es grave y se tilda porque termina en consonante l', la función predominante es:",
                    options = listOf(
                        "Apelativa",
                        "Representativa",
                        "Metalingüística",
                        "Fática"
                    ),
                    correctIndex = 2,
                    explanation = "Explica la regla de acentuación de una palabra del idioma; por tanto, el código habla de sí mismo en función metalingüística."
                )
            )
        )
    )
}
