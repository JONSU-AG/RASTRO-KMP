package razonamiento_verbal

object RazonamientoVerbalSemana02 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t02_s01",
            subjectId = "razonamiento_verbal",
            semana = 2,
            subtema = "2.1",
            title = "3.1 La Estructura y Notación Formal de la Analogía",
            theory = LessonTheory(
                content = """# TEMA II: Analogías Verbales

---



### Matriz de Indicadores de Logro Evaluados
1. **Identificación de la relación analógica dominante:** Extraer el nexo semántico estructural que vincula al par matriz o par base (A : B).
2. **Tipología analógica múltiple:** Clasificar el vínculo en relaciones semánticas, funcionales, de causa-efecto, meronímicas (parte-todo) o de inclusión-exclusión (especie-género).
3. **Control del principio de orden:** Preservar la direccionalidad estricta del vínculo (A \to B vs. B \to A) para evitar distractores invertidos.
4. **Discriminación por naturaleza del campo semántico:** Desempatar alternativas mediante la afinidad de dominio temático, grado de abstracción y categoría gramatical.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                             ANALOGÍAS VERBALES
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼                                                   ▼
 ANALOGÍAS HORIZONTALES                              ANALOGÍAS VERTICALES
    (A : B :: C : D)                                 (A : B :: C : D)
(El nexo se da entre A y B)                         (El nexo se da entre A y C)
           │                                                   │
  ┌────────┴────────────────────────┬──────────────────────────┤
  ▼                                 ▼                          ▼
RELACIONES DE FORMA               RELACIONES FUNCIONALES     RELACIONES DE PROCESO
• Parte : Todo (Meronimia)        • Sujeto : Instrumento     • Causa : Efecto
• Elemento : Conjunto             • Objeto : Función         • Evolución histórica
• Especie : Género (Hiponimia)    • Materia prima : Producto • Grado / Intensidad
• Sinonimia / Antonimia           • Especialista : Objeto de • Secuencialidad
                                    estudio
```



### Ontología de la Relación Analógica
- **Par Base (Par Matriz):** Pareja de términos propuesta como premisa canónica que establece el patrón relacional (A : B).
- **Par Análogo (Par Clave):** Pareja de términos entre las alternativas que reproduce con mayor fidelidad la relación, orden y naturaleza del par base (C : D).
- **Isomorfismo Semántico:** Correspondencia estructural entre dos pares que comparten la misma red relacional subyacente.
- **Relación Primaria (Genérica):** Vínculo conceptual amplio (ejemplo: *Causa - Efecto*).
- **Relación Secundaria (Específica):** Rasgos particulares o sutiles que desempatan opciones afines (ejemplo: *efecto destructivo involuntario vs. efecto creativo deliberado*).

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 La Estructura y Notación Formal de la Analogía
La analogía es una proporción semántica que se lee formalmente:
A \text{ es a } B \quad \text{como} \quad C \text{ es a } D
Notación matemática y lógica:
A : B :: C : D
Donde:
- : denota "es a" (relación intraléxica).
- :: denota "como" (relación interléxica o paralelismo estructural).



### 3.2 El Método Científico de Resolución: Principio R-O-N
Para alcanzar un 100% de efectividad en las preguntas de analogías de la UNSA, UNMSM y UNI, es obligatorio aplicar secuencialmente el filtro jerárquico **R-O-N**:

```
[1. RELACIÓN]  ───▶  Determinar el nexo verbal exacto mediante una oración breve.
      │
      ▼
  [2. ORDEN]   ───▶  Verificar la direccionalidad (de izquierda a derecha).
      │
      ▼
[3. NATURALEZA]───▶  Desempatar evaluando campo temático, características físicas y abstracción.
```

#### Paso 1: RELACIÓN (R)
Consiste en formular una oración simple y precisa que enlace el primer término con el segundo utilizando la menor cantidad de palabras posible.
*Ejemplo:* **CIRUJANO : BISTURÍ** \to Oración: *"El cirujano utiliza el bisturí como instrumento manual de trabajo principal para realizar incisiones"*.

#### Paso 2: ORDEN (O)
Verificar rigurosamente que el par análogo conserve la misma orientación:
- Si el par base es **SUJETO : OBJETO**, la respuesta DEBE ser **SUJETO : OBJETO**, jamás **OBJETO : SUJETO**.
- *Ejemplo de distractor por orden invertido:* **SERRUCHO : CARPINTERO** (Tiene la misma relación funcional, pero el orden es inverso: está al revés. Queda automáticamente eliminada).

#### Paso 3: NATURALEZA (N)
Si tras aplicar R y O subsisten dos o tres alternativas viables, se aplica el criterio de la **Naturaleza del campo semántico**:
- *¿Son entes vivos o inanimados?*
- *¿Es una acción física, intelectual o artística?*
- *¿El instrumento es manual, mecánico o electrónico?*
- *¿La transformación de la materia es química o puramente física?*



### 3.3 Catálogo de Tipos Analógicos Fundamentales

| Tipo Analógico | Fórmula Relacional | Ejemplo Paradigmático |
| :--- | :--- | :--- |
| **Parte : Todo** | A es una fracción física inseparable de B | **PÁGINA : LIBRO** / **ÁPICE : HOJA** |
| **Elemento : Conjunto** | A es el individuo singular y B su sustantivo colectivo | **CERDO : PIARA** / **ARCHIPIÉLAGO : ISLA** (Invertido) |
| **Especie : Género** | A está incluido taxonómicamente en B | **VICUÑA : CAMÉLIDO** / **ORO : METAL** |
| **Causa : Efecto** | A desencadena o provoca necesariamente el suceso B | **CHISPA : INCENDIO** / **VIRUS : INFECCIÓN** |
| **Sujeto : Instrumento** | A es el agente profesional que manipula la herramienta B | **ESCULTOR : CINCEL** / **PINTOR : PINCEL** |
| **Materia Prima : Producto** | A se transforma mediante un proceso físico/químico en B | **ARCILLA : LADRILLO** / **LECHE : QUESO** |
| **Intensidad o Grado** | A y B expresan la misma idea en escalas extremas | **LOBISMO : TERROR** / **LLOVÍZNA : DILUVIO** |
| **Asociación por Función** | A tiene como función teleológica principal B | **BRÚJULA : ORIENTAR** / **LÁMPARA : ILUMINAR** |
| **Simbolismo / Representación**| A es el objeto convencional que representa la idea abstracta B| **PALOMA : PAZ** / **BALANZA : JUSTICIA** |

---



## 4. FORMULARIO MAESTRO DE RESOLUCIÓN ANALÓGICA

| Caso de Conflicto en Alternativas | Criterio Analítico de Desempate | Regla de Oro Preuniversitaria |
| :--- | :--- | :--- |
| **Conflicto de Intensidad** | Medir la escala de menor a mayor (A < B) | Si el par base crece en grado (palo \to viga), la respuesta debe crecer obligatoriamente. |
| **Conflicto Material vs. Espiritual** | Nivel de abstracción del concepto | Términos axiológicos o emotivos no se emparejan con herramientas mecánicas. |
| **Conflicto de Medio o Entorno** | Medio terrestre, aéreo o acuático | Elementos biológicos acuáticos prefieren pares que se desenvuelvan en el agua. |
| **Analogía por Contigüidad** | Secuencia cronológica o espacial | No confundir lo que ocurre antes (*preliminar*) con lo que es causa física obligada. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 2: "La Oración de la Flecha"
Transforma los dos puntos (:) en un verbo activo conjugado:
- En vez de leer *"MÉDICO : BISTURÍ"*, lee mentalmente:
  *"El MÉDICO [empuña hábilmente el] BISTURÍ"*.
- Aplica exactamente esa misma frase a las cinco alternativas: la que suene lógica y natural sin forzar el idioma será tu respuesta ganadora.

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 1: La Detección del "Par Espejo" (Distractor Invertido)
En el 80% de las preguntas de analogías de la UNSA, la comisión coloca como opción A o B el **par idéntico pero invertido**:
- Par Base: **ESCRITOR : NOVELA** (Sujeto : Objeto producido)
- Opción A: **SINFONÍA : COMPOSITOR** (Objeto producido : Sujeto)
- **HACK:** Táchala en un segundo sin dudar. Aunque la relación es hermosa, el orden está invertido y en el examen de admisión el orden es un mandato inquebrantable.



### Hack 2: Descarte por Discordancia Categorial
Si el par base está compuesto por **Sustantivo : Adjetivo**, ninguna opción compuesta por **Verbo : Sustantivo** o **Adjetivo : Adjetivo** puede ser la respuesta correcta. La identidad funcional gramatical es el primer filtro formal de la lingüística aplicada.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Parecido Fonético o Temático Superficial**
> Si el par base es **OROLOGÍA : MONTAÑA**, los distractores típicos incluirán palabras que suenen a cerros o naturaleza (**RÍO : CAUCE**, **MINERO : SOCAVÓN**). ¡No caigas en la trampa temática! La relación formal es *Ciencia que estudia : Objeto de estudio*. La clave análoga puede pertenecer a un ámbito totalmente distinto: **ICTIOLOGÍA : PEZ**.

> [!CAUTION]
> **Trampa 2: Confundir Parte-Todo con Especie-Género**
> - Parte-Todo (Meronimia): Si separas la parte, el objeto se destruye o queda incompleto (*Manubrio : Bicicleta*).
> - Especie-Género (Hiponimia): La especie ES un tipo del género (*Bicicleta : Vehículo*). Una bicicleta no es una parte del vehículo; es un vehículo en sí misma.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

El razonamiento analógico es la cúspide de la inteligencia humana y la base de los mayores descubrimientos científicos: Johannes Kepler formuló las leyes del movimiento planetario estableciendo una analogía con la óptica y el reloj mecánico; Niels Bohr concibió el modelo del átomo por analogía directa con el sistema solar. En el derecho constitucional, el *método analógico* permite a los magistrados del Tribunal Constitucional resolver vacíos legales aplicando la misma ratio decidendi de sentencias previas a nuevos casos de vulneración de derechos fundamentales.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Relación de Intensidad)
**Enunciado:** Determine la alternativa que reproduce la relación analógica del par base:
**TEMBLOR : TERREMOTO ::**
A) Lluvia : Diluvio  
B) Viento : Brisa  
C) Fuego : Ceniza  
D) Ola : Maremoto  
E) Caída : Fractura  

**Resolución Paso a Paso:**
1. Formulamos la relación del par base: Un *temblor* y un *terremoto* son movimientos sísmicos de la corteza terrestre, donde el *terremoto* representa el mismo fenómeno pero con un grado de **intensidad sísmica destructiva mucho mayor** (A < B por intensidad).
2. Analizamos las alternativas:
   - *B) Viento : Brisa:* Disminuye en intensidad (A > B). Descartada por orden.
   - *C) Fuego : Ceniza:* Causa - Efecto temporal. Descartada.
   - *E) Caída : Fractura:* Causa - Efecto lesivo. Descartada.
   - *D) Ola : Maremoto:* El maremoto es un sismo submarino que genera tsunamis, no es una ola de mayor grado de la misma naturaleza pura.
   - *A) Lluvia : Diluvio:* La lluvia es precipitación de agua y el diluvio es una precipitación torrencial de extrema intensidad de la misma naturaleza física (A < B).
3. La alternativa A reproduce fielmente la relación de intensidad creciente.
**Respuesta:** A

---



### Ejercicio 2 (Nivel Intermedio: Sujeto : Instrumento y Naturaleza de la Acción)
**Enunciado (Modelo Admisión UNSA):**
**ESCULTOR : CINCEL ::**
A) Pintor : Cuadro  
B) Cirujano : Bisturí  
C) Carpintero : Madera  
D) Músico : Partitura  
E) Carnicero : Carne  

**Resolución Paso a Paso:**
1. Aplicamos el método R-O-N:
   - **R (Relación):** El *escultor* es un artista/profesional que manipula un *cincel* como herramienta manual de corte directo para modelar su obra.
   - **O (Orden):** Sujeto profesional : Herramienta manual.
2. Analizamos las opciones:
   - *A) Pintor : Cuadro:* Sujeto : Objeto producido. Descartada.
   - *C) Carpintero : Madera:* Sujeto : Materia prima a trabajar. Descartada.
   - *D) Músico : Partitura:* Sujeto : Guía gráfica de lectura musical. Descartada.
   - *E) Carnicero : Carne:* Sujeto : Materia prima animal. Descartada.
   - *B) Cirujano : Bisturí:* El cirujano es un profesional que manipula el bisturí como herramienta manual de corte directo para intervenir en su labor.
3. El orden, la relación funcional y la naturaleza de herramienta de incisión manual coinciden plenamente.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Materia Prima : Producto con Desempate por Naturaleza)
**Enunciado:**
**LECHE : QUESO ::**
A) Harina : Pan  
B) Uva : Vino  
C) Cacao : Chocolate  
D) Petróleo : Gasolina  
E) Cuero : Zapato  

**Resolución Paso a Paso:**
1. Analizamos el par base **LECHE : QUESO**:
   - Relación genérica: Materia prima : Producto procesado alimenticio.
   - Naturaleza específica del proceso: La leche sufre una **fermentación láctica bioquímica bacteriana** que coagula y transforma la sustancia en un producto sólido derivado.
2. Evaluamos los candidatos afines:
   - *E) Cuero : Zapato:* Proceso puramente físico-mecánico de corte y confección (no químico alimenticio).
   - *D) Petróleo : Gasolina:* Destilación fraccionada de hidrocarburos fósiles (combustible, no alimento).
   - *A) Harina : Pan:* Cocción y horneado de mezcla.
   - *C) Cacao : Chocolate:* Molienda y mezcla con azúcar.
   - *B) Uva : Vino:* La uva pasa por un proceso idéntico de **fermentación bioquímica microbiológica (fermentación alcohólica)** donde los azúcares se transforman en una bebida clásica elaborada por el hombre desde la antigüedad.
   - Entre Uva:Vino y Harina:Pan, evaluemos la matriz más cercana al lácteo como producto de fermentación y cuajado. Tradicionalmente en los temarios preuniversitarios del Perú (Lumbreras / Ceprunsa), la pareja canónica de fermentación biológica es Leche:Queso :: Uva:Vino.
**Respuesta:** B

---



### Ejercicio 4 (Nivel Avanzado DECO: Analogía de Campo Científico y Objeto de Estudio)
**Enunciado (Tipo San Marcos DECO / UNSA):**
**ENTOMOLOGÍA : INSECTO ::**
A) Ornitología : Paloma  
B) Arqueología : Ruina  
C) Ictiología : Pez  
D) Paleontología : Hueso  
E) Taxidermia : Animal  

**Resolución Paso a Paso:**
1. Desglosamos la relación del par base:
   - *Entomología* es la rama de la biología zoológica que se encarga del estudio científico sistemático de los *insectos* (clase taxonómica zoológica completa).
2. Analizamos los términos de las alternativas:
   - *A) Ornitología : Paloma:* La ornitología estudia a las *aves* en general (clase), no a una sola especie particular como la paloma. Presenta una discordancia de nivel taxonómico.
   - *B) Arqueología : Ruina:* La arqueología estudia las sociedades del pasado a través de sus restos materiales, no solo ruinas arquitectónicas.
   - *D) Paleontología : Hueso:* La paleontología estudia los *fósiles* en general, no únicamente huesos.
   - *E) Taxidermia : Animal:* La taxidermia es una técnica de disecación artesanal, no una ciencia teórica natural.
   - *C) Ictiología : Pez:* La ictiología es la rama de la zoología que estudia a los *peces* (superclase/grupo taxonómico completo), guardando exacto paralelismo de disciplina zoológica : taxón biológico general.
**Respuesta:** C

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Analogía Simbólica y Filosófica de Doble Eje)
**Enunciado (Nivel UNI / Excelencia):**
**ANTORCHA : LIBERTAD ::**
A) Laurel : Triunfo  
B) Cetro : Poder  
C) Balanza : Justicia  
D) Cruz : Sacrificio  
E) Paloma : Paz  

**Resolución Paso a Paso:**
1. Desglosamos la relación profunda del par base **ANTORCHA : LIBERTAD**:
   - Una *antorcha* es un objeto físico concreto que funciona como **símbolo icónico universal** de un valor abstracto inmaterial: la *libertad* (ejemplo histórico: la Estatua de la Libertad de Bartholdi).
   - Todas las alternativas presentan la relación general *Símbolo : Idea abstracta*.
2. Aplicamos el criterio de desempate por **Naturaleza Semántica Fina (N)**:
   - ¿Qué tipo de símbolo es la antorcha? Es un objeto **portado por un ser humano en su mano**, que irradia luz viva y fuego activo guiando el camino en la oscuridad.
   - Analicemos la **Balanza : Justicia**: La balanza mide pesos mecánicos pasivos en equilibrio.
   - Analicemos el **Cetro : Poder**: El cetro es un objeto de mando ceremonial portado en la mano por el monarca que encarna la autoridad y el poder político de gobernar.
   - Analicemos la **Paloma : Paz**: La paloma es un ser vivo animal (fauna), no un objeto inanimado fabricado por el hombre.
   - Analicemos el **Laurel : Triunfo**: Es una planta vegetal (corona vegetal).
   - Entre el Cetro y la Balanza: La relación de la antorcha con la libertad y de la balanza con la justicia son los dos grandes símbolos grecorromanos universales de la civilización republicana occidental. La balanza mide con platillos la equidad. Sin embargo, el objeto manufacturado con función luminosa que guía y el cetro que rige son símbolos de investidura activa. En el canon clásico de exámenes de admisión del Perú, **BALANZA : JUSTICIA** representa el arquetipo exacto de emblema republicano universal de valor cívico cardinal.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Analogía:** Relación de semejanza o equivalencia estructural entre dos pares de palabras distintas.
2. **Par Base:** Pareja inicial que encabeza la pregunta y determina el patrón lógico a imitar.
3. **Par Análogo:** Pareja de respuesta que satisface el principio de relación, orden y naturaleza.
4. **Meronimia:** Relación semántica no simétrica existente entre una parte y el todo integral.
5. **Holonimia:** Término que designa el todo respecto a sus partes constitutivas.
6. **Hiponimia:** Relación de inclusión de una especie o elemento dentro de un género más amplio.
7. **Hiperonimia:** Relación de un concepto general o categoría abarcadora respecto a sus especies.
8. **Par Invertido:** Distractor que presenta la misma relación pero con la secuencia direccional contraria.
9. **Causa Concomitante:** Factor secundario que acompaña al efecto sin ser la causa determinante.
10. **Isomorfismo:** Correspondencia biunívoca en la forma lógica y estructura relacional entre dos sistemas.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué significa la sigla R-O-N en la resolución de analogías?**  
  **A:** Relación (nexo semántico), Orden (direccionalidad izquierda-derecha) y Naturaleza (campo semántico y características específicas).
- **Q: ¿Por qué la opción "MÉDICO : HOSPITAL" no es análoga a "PROFESOR : ALUMNO"?**  
  **A:** Porque "Médico : Hospital" es una relación de *Sujeto : Lugar de trabajo*, mientras que "Profesor : Alumno" es *Sujeto : Beneficiario o Receptor directo de la acción*.
- **Q: ¿Cómo se desempata entre dos alternativas que tienen la misma relación y el mismo orden?**  
  **A:** Analizando la naturaleza de los términos: si son seres animados o inanimados, procesos químicos o mecánicos, o el nivel de especialización profesional.
- **Q: Si el par base es "ALBA : OCASO", ¿cuál es su tipo analógico?**  
  **A:** Antonimia o extremos temporales del ciclo diurno (inicio del día vs. fin del día).
- **Q: ¿Cuál es el error común al enfrentar analogías de ciencias (ejemplo: CARDIOLOGÍA : CORAZÓN)?**  
  **A:** Confundir la ciencia médica con el órgano que cura (buscar pares donde la ciencia estudie o trate a dicho órgano o fenómeno).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t02_s01_c01",
                    question = "En la notación formal clásica de los ejercicios de analogías verbales, la expresión 'A : B :: C : D' se verbaliza e interpreta lógicamente como:",
                    options = listOf(
                        "'A es opuesto a B de la misma forma que C es igual a D'.",
                        "'A es a B como C es a D'.",
                        "'A suma a B tanto como C resta a D'.",
                        "'A causa a B porque C precede a D temporalmente'.",
                    ),
                    correctIndex = 1,
                    explanation = "En la notación analógica formal estándar, los dos puntos (:) significan 'es a' y los cuatro puntos (::) representan el conector proporcional 'como'."
                ),
                Challenge(
                    id = "rv_t02_s01_c02",
                    question = "El célebre 'Método R-O-N' empleado para resolver analogías de alto nivel en exámenes de admisión preuniversitaria prescribe analizar sucesivamente:",
                    options = listOf(
                        "Relación (vínculo esencial), Orden (dirección de la premisa) y Naturaleza (campo semántico o tema).",
                        "Raíz griega, Origen histórico y Nivel sociolingüístico.",
                        "Razón matemática, Operación lógica y Negación proposicional.",
                        "Rima, Ortografía y Número de sílabas.",
                    ),
                    correctIndex = 0,
                    explanation = "El método RON establece: primero identificar la Relación intrínseca entre premisas, luego constatar el Orden exacto de los términos, y finalmente evaluar la Naturaleza del campo semántico ante opciones muy parecidas."
                ),
                Challenge(
                    id = "rv_t02_s01_c03",
                    question = "Dada la premisa analógica 'BRÚJULA : ORIENTACIÓN ::', ¿cuál es el par análogo que reproduce con mayor precisión la relación de instrumento a función?",
                    options = listOf(
                        "Barómetro : Presión.",
                        "Telescopio : Satélite.",
                        "Termómetro : Medición.",
                        "Reloj : Cronómetro.",
                    ),
                    correctIndex = 2,
                    explanation = "La brújula es un instrumento cuya función genérica es la orientación; análogamente, el termómetro es un instrumento cuya función genérica es la medición (térmica)."
                ),
                Challenge(
                    id = "rv_t02_s01_c04",
                    question = "Considere la analogía: 'PINTOR : BROCHA :: ESCULTOR : CINCEL'. ¿Qué principio analógico básico se evidencia en esta estructura?",
                    options = listOf(
                        "Relación de Causa a Efecto.",
                        "Relación de Parte a Todo integral.",
                        "Relación de Evolución histórica cronológica.",
                        "Relación de Sujeto (agente) a Objeto de trabajo (instrumento específico).",
                    ),
                    correctIndex = 3,
                    explanation = "Se vincula el agente profesional o artístico con la herramienta o instrumento típico con el cual ejerce su actividad transformadora."
                ),
                Challenge(
                    id = "rv_t02_s01_c05",
                    question = "Si en una analogía la premisa presenta el orden 'PARTE : TODO' (por ejemplo, 'PÉTALO : FLOR'), una alternativa con el orden 'TODO : PARTE' (como 'CASA : HABITACIÓN') debe ser descartada rigurosamente por violar el principio de:",
                    options = listOf(
                        "Significado léxico.",
                        "Concordancia de género gramatical.",
                        "Direccionalidad u Orden analógico.",
                        "Extensión silábica.",
                    ),
                    correctIndex = 2,
                    explanation = "El criterio del Orden (la 'O' del método RON) exige que la relación se verifique en el mismo sentido direccional que la premisa: si la premisa va de parte a todo, la clave no puede ir de todo a parte."
                ),
                Challenge(
                    id = "rv_t02_s01_c06",
                    question = "Dada la premisa: 'ANTORCHA : LIBERTAD ::', ¿qué tipo de relación analógica se manifiesta de forma primordial?",
                    options = listOf(
                        "Relación Simbólica o de Representación cultural.",
                        "Relación de Grado de intensidad.",
                        "Relación de Materia prima a Producto.",
                        "Relación de Contigüidad física.",
                    ),
                    correctIndex = 0,
                    explanation = "La antorcha es el símbolo universalmente reconocido de la libertad; se trata de una relación analógica simbólica o emblemática."
                ),
                Challenge(
                    id = "rv_t02_s01_c07",
                    question = "'CINCEL : ESCULTOR :: PINCEL : PINTOR'. Si invertimos los términos de la segunda relación resultando 'PINTOR : PINCEL', la analogía se invalida porque:",
                    options = listOf(
                        "Altera el vector de orden lógico: instrumento a sujeto frente a sujeto a instrumento.",
                        "Se incurre en una falacia de anfibología gramatical.",
                        "Los vocablos no pertenecen a la misma categoría fonética.",
                        "Los pintores no utilizan pinceles en la modernidad.",
                    ),
                    correctIndex = 0,
                    explanation = "El orden vectorial de los términos en las analogías horizontales es estricto: no es equivalente 'instrumento : sujeto' que 'sujeto : instrumento'."
                ),
                Challenge(
                    id = "rv_t02_s01_c08",
                    question = "En las analogías denominadas 'verticales', la relación lógica no se establece entre el primer y segundo término de la premisa, sino entre:",
                    options = listOf(
                        "Las letras iniciales de los vocablos.",
                        "El número de vocales abiertas de cada oración.",
                        "Los nombres propios de los autores de la prueba.",
                        "El primer término de la premisa y el primer término de la opción, y correspondientemente entre los segundos términos.",
                    ),
                    correctIndex = 3,
                    explanation = "En la analogía vertical, cuando la relación horizontal es sumamente laxa o inexistente, se compara verticalmente A con C, y B con D (A es a C como B es a D)."
                ),
                Challenge(
                    id = "rv_t02_s01_c09",
                    question = "Dada la pareja 'FUEGO : CENIZA ::', la relación analógica subyacente es de:",
                    options = listOf(
                        "Contigüidad espacial.",
                        "Grado de menor a mayor intensidad.",
                        "Oposición complementaria.",
                        "Causa a Efecto (o proceso a residuo/producto final).",
                    ),
                    correctIndex = 3,
                    explanation = "El fuego genera como secuela o residuo material final la ceniza: es una relación causal y de producto terminal del proceso de combustión."
                ),
                Challenge(
                    id = "rv_t02_s01_c10",
                    question = "El principio de la 'Naturaleza' en el método analógico entra en juego fundamentalmente cuando:",
                    options = listOf(
                        "La pregunta trata únicamente sobre plantas y animales de la selva.",
                        "Existen dos o más alternativas que cumplen idéntica Relación y el mismo Orden, requiriéndose evaluar la cercanía temática y características intrínsecas del ámbito ontológico de la premisa.",
                        "No hay ninguna alternativa disponible en la hoja de examen.",
                        "El estudiante desconoce por completo el significado de las palabras.",
                    ),
                    correctIndex = 1,
                    explanation = "La Naturaleza es el criterio de desempate fino: permite elegir entre dos opciones formalmente válidas aquella que comparte el mismo ámbito (seres vivos, instrumentos técnicos, abstracciones morales, etc.)."
                ),
            )
        ),
        LessonNode(
            id = "rv_t02_s02",
            subjectId = "razonamiento_verbal",
            semana = 2,
            subtema = "2.2",
            title = "3.3 Catálogo de Tipos Analógicos Fundamentales",
            theory = LessonTheory(
                content = """## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                             ANALOGÍAS VERBALES
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼                                                   ▼
 ANALOGÍAS HORIZONTALES                              ANALOGÍAS VERTICALES
    (A : B :: C : D)                                 (A : B :: C : D)
(El nexo se da entre A y B)                         (El nexo se da entre A y C)
           │                                                   │
  ┌────────┴────────────────────────┬──────────────────────────┤
  ▼                                 ▼                          ▼
RELACIONES DE FORMA               RELACIONES FUNCIONALES     RELACIONES DE PROCESO
• Parte : Todo (Meronimia)        • Sujeto : Instrumento     • Causa : Efecto
• Elemento : Conjunto             • Objeto : Función         • Evolución histórica
• Especie : Género (Hiponimia)    • Materia prima : Producto • Grado / Intensidad
• Sinonimia / Antonimia           • Especialista : Objeto de • Secuencialidad
                                    estudio
```



### 3.1 La Estructura y Notación Formal de la Analogía
La analogía es una proporción semántica que se lee formalmente:
A \text{ es a } B \quad \text{como} \quad C \text{ es a } D
Notación matemática y lógica:
A : B :: C : D
Donde:
- : denota "es a" (relación intraléxica).
- :: denota "como" (relación interléxica o paralelismo estructural).



## 4. FORMULARIO MAESTRO DE RESOLUCIÓN ANALÓGICA

| Caso de Conflicto en Alternativas | Criterio Analítico de Desempate | Regla de Oro Preuniversitaria |
| :--- | :--- | :--- |
| **Conflicto de Intensidad** | Medir la escala de menor a mayor (A < B) | Si el par base crece en grado (palo \to viga), la respuesta debe crecer obligatoriamente. |
| **Conflicto Material vs. Espiritual** | Nivel de abstracción del concepto | Términos axiológicos o emotivos no se emparejan con herramientas mecánicas. |
| **Conflicto de Medio o Entorno** | Medio terrestre, aéreo o acuático | Elementos biológicos acuáticos prefieren pares que se desenvuelvan en el agua. |
| **Analogía por Contigüidad** | Secuencia cronológica o espacial | No confundir lo que ocurre antes (*preliminar*) con lo que es causa física obligada. |

---



### Mnemotecnia 1: "El Inspector R-O-N"
- **R:** ¿Qué **R**elación une a las dos palabras? (Haz una frase mental corta).
- **O:** ¿En qué **O**rden están colocadas? (¿Quién va primero, quién va después?).
- **N:** ¿De qué **N**aturaleza son? (Humanos con humanos, metales con metales, ciencia con ciencia).



### Ejercicio 4 (Nivel Avanzado DECO: Analogía de Campo Científico y Objeto de Estudio)
**Enunciado (Tipo San Marcos DECO / UNSA):**
**ENTOMOLOGÍA : INSECTO ::**
A) Ornitología : Paloma  
B) Arqueología : Ruina  
C) Ictiología : Pez  
D) Paleontología : Hueso  
E) Taxidermia : Animal  

**Resolución Paso a Paso:**
1. Desglosamos la relación del par base:
   - *Entomología* es la rama de la biología zoológica que se encarga del estudio científico sistemático de los *insectos* (clase taxonómica zoológica completa).
2. Analizamos los términos de las alternativas:
   - *A) Ornitología : Paloma:* La ornitología estudia a las *aves* en general (clase), no a una sola especie particular como la paloma. Presenta una discordancia de nivel taxonómico.
   - *B) Arqueología : Ruina:* La arqueología estudia las sociedades del pasado a través de sus restos materiales, no solo ruinas arquitectónicas.
   - *D) Paleontología : Hueso:* La paleontología estudia los *fósiles* en general, no únicamente huesos.
   - *E) Taxidermia : Animal:* La taxidermia es una técnica de disecación artesanal, no una ciencia teórica natural.
   - *C) Ictiología : Pez:* La ictiología es la rama de la zoología que estudia a los *peces* (superclase/grupo taxonómico completo), guardando exacto paralelismo de disciplina zoológica : taxón biológico general.
**Respuesta:** C

---



### Matriz de Indicadores de Logro Evaluados
1. **Identificación de la relación analógica dominante:** Extraer el nexo semántico estructural que vincula al par matriz o par base (A : B).
2. **Tipología analógica múltiple:** Clasificar el vínculo en relaciones semánticas, funcionales, de causa-efecto, meronímicas (parte-todo) o de inclusión-exclusión (especie-género).
3. **Control del principio de orden:** Preservar la direccionalidad estricta del vínculo (A \to B vs. B \to A) para evitar distractores invertidos.
4. **Discriminación por naturaleza del campo semántico:** Desempatar alternativas mediante la afinidad de dominio temático, grado de abstracción y categoría gramatical.

---



### Ontología de la Relación Analógica
- **Par Base (Par Matriz):** Pareja de términos propuesta como premisa canónica que establece el patrón relacional (A : B).
- **Par Análogo (Par Clave):** Pareja de términos entre las alternativas que reproduce con mayor fidelidad la relación, orden y naturaleza del par base (C : D).
- **Isomorfismo Semántico:** Correspondencia estructural entre dos pares que comparten la misma red relacional subyacente.
- **Relación Primaria (Genérica):** Vínculo conceptual amplio (ejemplo: *Causa - Efecto*).
- **Relación Secundaria (Específica):** Rasgos particulares o sutiles que desempatan opciones afines (ejemplo: *efecto destructivo involuntario vs. efecto creativo deliberado*).

---



### 3.3 Catálogo de Tipos Analógicos Fundamentales

| Tipo Analógico | Fórmula Relacional | Ejemplo Paradigmático |
| :--- | :--- | :--- |
| **Parte : Todo** | A es una fracción física inseparable de B | **PÁGINA : LIBRO** / **ÁPICE : HOJA** |
| **Elemento : Conjunto** | A es el individuo singular y B su sustantivo colectivo | **CERDO : PIARA** / **ARCHIPIÉLAGO : ISLA** (Invertido) |
| **Especie : Género** | A está incluido taxonómicamente en B | **VICUÑA : CAMÉLIDO** / **ORO : METAL** |
| **Causa : Efecto** | A desencadena o provoca necesariamente el suceso B | **CHISPA : INCENDIO** / **VIRUS : INFECCIÓN** |
| **Sujeto : Instrumento** | A es el agente profesional que manipula la herramienta B | **ESCULTOR : CINCEL** / **PINTOR : PINCEL** |
| **Materia Prima : Producto** | A se transforma mediante un proceso físico/químico en B | **ARCILLA : LADRILLO** / **LECHE : QUESO** |
| **Intensidad o Grado** | A y B expresan la misma idea en escalas extremas | **LOBISMO : TERROR** / **LLOVÍZNA : DILUVIO** |
| **Asociación por Función** | A tiene como función teleológica principal B | **BRÚJULA : ORIENTAR** / **LÁMPARA : ILUMINAR** |
| **Simbolismo / Representación**| A es el objeto convencional que representa la idea abstracta B| **PALOMA : PAZ** / **BALANZA : JUSTICIA** |

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

El razonamiento analógico es la cúspide de la inteligencia humana y la base de los mayores descubrimientos científicos: Johannes Kepler formuló las leyes del movimiento planetario estableciendo una analogía con la óptica y el reloj mecánico; Niels Bohr concibió el modelo del átomo por analogía directa con el sistema solar. En el derecho constitucional, el *método analógico* permite a los magistrados del Tribunal Constitucional resolver vacíos legales aplicando la misma ratio decidendi de sentencias previas a nuevos casos de vulneración de derechos fundamentales.

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Analogía Simbólica y Filosófica de Doble Eje)
**Enunciado (Nivel UNI / Excelencia):**
**ANTORCHA : LIBERTAD ::**
A) Laurel : Triunfo  
B) Cetro : Poder  
C) Balanza : Justicia  
D) Cruz : Sacrificio  
E) Paloma : Paz  

**Resolución Paso a Paso:**
1. Desglosamos la relación profunda del par base **ANTORCHA : LIBERTAD**:
   - Una *antorcha* es un objeto físico concreto que funciona como **símbolo icónico universal** de un valor abstracto inmaterial: la *libertad* (ejemplo histórico: la Estatua de la Libertad de Bartholdi).
   - Todas las alternativas presentan la relación general *Símbolo : Idea abstracta*.
2. Aplicamos el criterio de desempate por **Naturaleza Semántica Fina (N)**:
   - ¿Qué tipo de símbolo es la antorcha? Es un objeto **portado por un ser humano en su mano**, que irradia luz viva y fuego activo guiando el camino en la oscuridad.
   - Analicemos la **Balanza : Justicia**: La balanza mide pesos mecánicos pasivos en equilibrio.
   - Analicemos el **Cetro : Poder**: El cetro es un objeto de mando ceremonial portado en la mano por el monarca que encarna la autoridad y el poder político de gobernar.
   - Analicemos la **Paloma : Paz**: La paloma es un ser vivo animal (fauna), no un objeto inanimado fabricado por el hombre.
   - Analicemos el **Laurel : Triunfo**: Es una planta vegetal (corona vegetal).
   - Entre el Cetro y la Balanza: La relación de la antorcha con la libertad y de la balanza con la justicia son los dos grandes símbolos grecorromanos universales de la civilización republicana occidental. La balanza mide con platillos la equidad. Sin embargo, el objeto manufacturado con función luminosa que guía y el cetro que rige son símbolos de investidura activa. En el canon clásico de exámenes de admisión del Perú, **BALANZA : JUSTICIA** representa el arquetipo exacto de emblema republicano universal de valor cívico cardinal.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Analogía:** Relación de semejanza o equivalencia estructural entre dos pares de palabras distintas.
2. **Par Base:** Pareja inicial que encabeza la pregunta y determina el patrón lógico a imitar.
3. **Par Análogo:** Pareja de respuesta que satisface el principio de relación, orden y naturaleza.
4. **Meronimia:** Relación semántica no simétrica existente entre una parte y el todo integral.
5. **Holonimia:** Término que designa el todo respecto a sus partes constitutivas.
6. **Hiponimia:** Relación de inclusión de una especie o elemento dentro de un género más amplio.
7. **Hiperonimia:** Relación de un concepto general o categoría abarcadora respecto a sus especies.
8. **Par Invertido:** Distractor que presenta la misma relación pero con la secuencia direccional contraria.
9. **Causa Concomitante:** Factor secundario que acompaña al efecto sin ser la causa determinante.
10. **Isomorfismo:** Correspondencia biunívoca en la forma lógica y estructura relacional entre dos sistemas.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué significa la sigla R-O-N en la resolución de analogías?**  
  **A:** Relación (nexo semántico), Orden (direccionalidad izquierda-derecha) y Naturaleza (campo semántico y características específicas).
- **Q: ¿Por qué la opción "MÉDICO : HOSPITAL" no es análoga a "PROFESOR : ALUMNO"?**  
  **A:** Porque "Médico : Hospital" es una relación de *Sujeto : Lugar de trabajo*, mientras que "Profesor : Alumno" es *Sujeto : Beneficiario o Receptor directo de la acción*.
- **Q: ¿Cómo se desempata entre dos alternativas que tienen la misma relación y el mismo orden?**  
  **A:** Analizando la naturaleza de los términos: si son seres animados o inanimados, procesos químicos o mecánicos, o el nivel de especialización profesional.
- **Q: Si el par base es "ALBA : OCASO", ¿cuál es su tipo analógico?**  
  **A:** Antonimia o extremos temporales del ciclo diurno (inicio del día vs. fin del día).
- **Q: ¿Cuál es el error común al enfrentar analogías de ciencias (ejemplo: CARDIOLOGÍA : CORAZÓN)?**  
  **A:** Confundir la ciencia médica con el órgano que cura (buscar pares donde la ciencia estudie o trate a dicho órgano o fenómeno).

---



### Hack 1: La Detección del "Par Espejo" (Distractor Invertido)
En el 80% de las preguntas de analogías de la UNSA, la comisión coloca como opción A o B el **par idéntico pero invertido**:
- Par Base: **ESCRITOR : NOVELA** (Sujeto : Objeto producido)
- Opción A: **SINFONÍA : COMPOSITOR** (Objeto producido : Sujeto)
- **HACK:** Táchala en un segundo sin dudar. Aunque la relación es hermosa, el orden está invertido y en el examen de admisión el orden es un mandato inquebrantable.



### Ejercicio 1 (Nivel Básico: Relación de Intensidad)
**Enunciado:** Determine la alternativa que reproduce la relación analógica del par base:
**TEMBLOR : TERREMOTO ::**
A) Lluvia : Diluvio  
B) Viento : Brisa  
C) Fuego : Ceniza  
D) Ola : Maremoto  
E) Caída : Fractura  

**Resolución Paso a Paso:**
1. Formulamos la relación del par base: Un *temblor* y un *terremoto* son movimientos sísmicos de la corteza terrestre, donde el *terremoto* representa el mismo fenómeno pero con un grado de **intensidad sísmica destructiva mucho mayor** (A < B por intensidad).
2. Analizamos las alternativas:
   - *B) Viento : Brisa:* Disminuye en intensidad (A > B). Descartada por orden.
   - *C) Fuego : Ceniza:* Causa - Efecto temporal. Descartada.
   - *E) Caída : Fractura:* Causa - Efecto lesivo. Descartada.
   - *D) Ola : Maremoto:* El maremoto es un sismo submarino que genera tsunamis, no es una ola de mayor grado de la misma naturaleza pura.
   - *A) Lluvia : Diluvio:* La lluvia es precipitación de agua y el diluvio es una precipitación torrencial de extrema intensidad de la misma naturaleza física (A < B).
3. La alternativa A reproduce fielmente la relación de intensidad creciente.
**Respuesta:** A

---



### 3.2 El Método Científico de Resolución: Principio R-O-N
Para alcanzar un 100% de efectividad en las preguntas de analogías de la UNSA, UNMSM y UNI, es obligatorio aplicar secuencialmente el filtro jerárquico **R-O-N**:

```
[1. RELACIÓN]  ───▶  Determinar el nexo verbal exacto mediante una oración breve.
      │
      ▼
  [2. ORDEN]   ───▶  Verificar la direccionalidad (de izquierda a derecha).
      │
      ▼
[3. NATURALEZA]───▶  Desempatar evaluando campo temático, características físicas y abstracción.
```

#### Paso 1: RELACIÓN (R)
Consiste en formular una oración simple y precisa que enlace el primer término con el segundo utilizando la menor cantidad de palabras posible.
*Ejemplo:* **CIRUJANO : BISTURÍ** \to Oración: *"El cirujano utiliza el bisturí como instrumento manual de trabajo principal para realizar incisiones"*.

#### Paso 2: ORDEN (O)
Verificar rigurosamente que el par análogo conserve la misma orientación:
- Si el par base es **SUJETO : OBJETO**, la respuesta DEBE ser **SUJETO : OBJETO**, jamás **OBJETO : SUJETO**.
- *Ejemplo de distractor por orden invertido:* **SERRUCHO : CARPINTERO** (Tiene la misma relación funcional, pero el orden es inverso: está al revés. Queda automáticamente eliminada).

#### Paso 3: NATURALEZA (N)
Si tras aplicar R y O subsisten dos o tres alternativas viables, se aplica el criterio de la **Naturaleza del campo semántico**:
- *¿Son entes vivos o inanimados?*
- *¿Es una acción física, intelectual o artística?*
- *¿El instrumento es manual, mecánico o electrónico?*
- *¿La transformación de la materia es química o puramente física?*



### Ejercicio 2 (Nivel Intermedio: Sujeto : Instrumento y Naturaleza de la Acción)
**Enunciado (Modelo Admisión UNSA):**
**ESCULTOR : CINCEL ::**
A) Pintor : Cuadro  
B) Cirujano : Bisturí  
C) Carpintero : Madera  
D) Músico : Partitura  
E) Carnicero : Carne  

**Resolución Paso a Paso:**
1. Aplicamos el método R-O-N:
   - **R (Relación):** El *escultor* es un artista/profesional que manipula un *cincel* como herramienta manual de corte directo para modelar su obra.
   - **O (Orden):** Sujeto profesional : Herramienta manual.
2. Analizamos las opciones:
   - *A) Pintor : Cuadro:* Sujeto : Objeto producido. Descartada.
   - *C) Carpintero : Madera:* Sujeto : Materia prima a trabajar. Descartada.
   - *D) Músico : Partitura:* Sujeto : Guía gráfica de lectura musical. Descartada.
   - *E) Carnicero : Carne:* Sujeto : Materia prima animal. Descartada.
   - *B) Cirujano : Bisturí:* El cirujano es un profesional que manipula el bisturí como herramienta manual de corte directo para intervenir en su labor.
3. El orden, la relación funcional y la naturaleza de herramienta de incisión manual coinciden plenamente.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Materia Prima : Producto con Desempate por Naturaleza)
**Enunciado:**
**LECHE : QUESO ::**
A) Harina : Pan  
B) Uva : Vino  
C) Cacao : Chocolate  
D) Petróleo : Gasolina  
E) Cuero : Zapato  

**Resolución Paso a Paso:**
1. Analizamos el par base **LECHE : QUESO**:
   - Relación genérica: Materia prima : Producto procesado alimenticio.
   - Naturaleza específica del proceso: La leche sufre una **fermentación láctica bioquímica bacteriana** que coagula y transforma la sustancia en un producto sólido derivado.
2. Evaluamos los candidatos afines:
   - *E) Cuero : Zapato:* Proceso puramente físico-mecánico de corte y confección (no químico alimenticio).
   - *D) Petróleo : Gasolina:* Destilación fraccionada de hidrocarburos fósiles (combustible, no alimento).
   - *A) Harina : Pan:* Cocción y horneado de mezcla.
   - *C) Cacao : Chocolate:* Molienda y mezcla con azúcar.
   - *B) Uva : Vino:* La uva pasa por un proceso idéntico de **fermentación bioquímica microbiológica (fermentación alcohólica)** donde los azúcares se transforman en una bebida clásica elaborada por el hombre desde la antigüedad.
   - Entre Uva:Vino y Harina:Pan, evaluemos la matriz más cercana al lácteo como producto de fermentación y cuajado. Tradicionalmente en los temarios preuniversitarios del Perú (Lumbreras / Ceprunsa), la pareja canónica de fermentación biológica es Leche:Queso :: Uva:Vino.
**Respuesta:** B

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Parecido Fonético o Temático Superficial**
> Si el par base es **OROLOGÍA : MONTAÑA**, los distractores típicos incluirán palabras que suenen a cerros o naturaleza (**RÍO : CAUCE**, **MINERO : SOCAVÓN**). ¡No caigas en la trampa temática! La relación formal es *Ciencia que estudia : Objeto de estudio*. La clave análoga puede pertenecer a un ámbito totalmente distinto: **ICTIOLOGÍA : PEZ**.

> [!CAUTION]
> **Trampa 2: Confundir Parte-Todo con Especie-Género**
> - Parte-Todo (Meronimia): Si separas la parte, el objeto se destruye o queda incompleto (*Manubrio : Bicicleta*).
> - Especie-Género (Hiponimia): La especie ES un tipo del género (*Bicicleta : Vehículo*). Una bicicleta no es una parte del vehículo; es un vehículo en sí misma.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t02_s02_c01",
                    question = "En la analogía 'ARCHIPIÉLAGO : ISLA ::', ¿qué tipo de vínculo analógico específico une a ambos términos?",
                    options = listOf(
                        "Causa a Efecto natural.",
                        "Parte a Todo individual.",
                        "Sustantivo Colectivo a Sustantivo Individual.",
                        "Materia prima a Derivado químico.",
                    ),
                    correctIndex = 2,
                    explanation = "El archipiélago es el sustantivo colectivo que designa un conjunto geográfico de islas (sustantivo individual)."
                ),
                Challenge(
                    id = "rv_t02_s02_c02",
                    question = "Resuelva la siguiente analogía de admisión: 'LLUVIA : DILUVIO ::'",
                    options = listOf(
                        "Río : Lago.",
                        "Nieve : Hielo.",
                        "Ola : Playa.",
                        "Viento : Huracán.",
                    ),
                    correctIndex = 3,
                    explanation = "La relación es de Intensidad de menor a mayor: la lluvia incrementada en grado desmesurado es diluvio, así como el viento aumentado exponencialmente en fuerza es huracán."
                ),
                Challenge(
                    id = "rv_t02_s02_c03",
                    question = "Dada la premisa: 'PETRÓLEO : GASOLINA ::', ¿cuál es el par análogo que cumple con la relación de materia prima a derivado elaborado?",
                    options = listOf(
                        "Hierro : Mina.",
                        "Madera : Selva.",
                        "Leche : Queso.",
                        "Agua : Sed.",
                    ),
                    correctIndex = 2,
                    explanation = "El petróleo es la materia prima natural de la cual se obtiene mediante refinación la gasolina, del mismo modo que la leche es la materia prima para elaborar el queso."
                ),
                Challenge(
                    id = "rv_t02_s02_c04",
                    question = "En la analogía: 'FIEBRE : INFECCIÓN ::', la relación lógica que se establece entre el primer y segundo término es de:",
                    options = listOf(
                        "Instrumento a sujeto profesional.",
                        "Efecto (o signo clínico) a Causa etiológica.",
                        "Especie a género taxonómico.",
                        "Parte a todo integral.",
                    ),
                    correctIndex = 1,
                    explanation = "La fiebre es un signo fisiológico (efecto) desencadenado por una infección orgánica (causa)."
                ),
                Challenge(
                    id = "rv_t02_s02_c05",
                    question = "Resuelva la siguiente analogía: 'LEÓN : CARNÍVORO ::'",
                    options = listOf(
                        "Tigre : Jaula.",
                        "Oveja : Herbívoro.",
                        "Águila : Pluma.",
                        "Vaca : Pradera.",
                    ),
                    correctIndex = 1,
                    explanation = "La relación es de Sujeto a Característica taxonómica de régimen alimenticio: el león es carnívoro, como la oveja es herbívora."
                ),
                Challenge(
                    id = "rv_t02_s02_c06",
                    question = "Dada la premisa: 'ABOGADO : DEFENSA ::', ¿cuál es el par análogo más consistente?",
                    options = listOf(
                        "Juez : Cárcel.",
                        "Policía : Delincuente.",
                        "Reo : Condena.",
                        "Médico : Curación.",
                    ),
                    correctIndex = 3,
                    explanation = "La relación es de Profesional a su Función teleológica primordial: el abogado procura la defensa del patrocinado, así como el médico procura la curación del paciente."
                ),
                Challenge(
                    id = "rv_t02_s02_c07",
                    question = "En la relación analógica 'ÁLGEBRA : MATEMÁTICA ::', el vínculo analógico corresponde a:",
                    options = listOf(
                        "Especie a Género (o disciplina particular a ciencia general).",
                        "Efecto a Causa productora.",
                        "Oposición semántica excluyente.",
                        "Símbolo a significado cultural.",
                    ),
                    correctIndex = 0,
                    explanation = "El álgebra es una rama o especie particular perteneciente al género superior de la matemática."
                ),
                Challenge(
                    id = "rv_t02_s02_c08",
                    question = "Resuelva la analogía de evolución cronológica: 'ANTORCHA : BOMBILLA ::'",
                    options = listOf(
                        "Rueda : Camino.",
                        "Barco : Océano.",
                        "Carreta : Automóvil.",
                        "Vela : Fuego.",
                    ),
                    correctIndex = 2,
                    explanation = "La relación es de Evolución instrumental histórica: la antorcha fue el medio ancestral de iluminación sustituido por la bombilla eléctrica, así como la carreta fue el medio de transporte primitivo sustituido por el automóvil."
                ),
                Challenge(
                    id = "rv_t02_s02_c09",
                    question = "Dada la premisa: 'MÉDICO : HOSPITAL ::', la relación analógica predominante es de:",
                    options = listOf(
                        "Sujeto a su Lugar de trabajo típico (ambiente institucional).",
                        "Causa a consecuencia necesaria.",
                        "Materia prima a producto manufacturado.",
                        "Instrumento a objeto manipulado.",
                    ),
                    correctIndex = 0,
                    explanation = "El médico es el profesional y el hospital es el recinto o centro institucional habitual donde desempeña su labor."
                ),
                Challenge(
                    id = "rv_t02_s02_c10",
                    question = "Resuelva la siguiente analogía de antonimia: 'EFÍMERO : PERPETUO ::'",
                    options = listOf(
                        "Inmortal : Vitalicio.",
                        "Transitorio : Eterno.",
                        "Fugaz : Pasajero.",
                        "Sempiterno : Duradero.",
                    ),
                    correctIndex = 1,
                    explanation = "La relación de la premisa es de Antonimia (lo que dura poco frente a lo que no tiene fin); su par idéntico en relación y grado es 'transitorio : eterno'."
                ),
            )
        )
    )
}
