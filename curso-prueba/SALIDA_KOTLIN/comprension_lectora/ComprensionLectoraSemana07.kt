package comprension_lectora

object ComprensionLectoraSemana07 {

    val lessons = listOf(
        LessonNode(
            id = "cl_t07_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "3.1 Mecanismos de Cohesión Textual en el Examen de Admisión",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Identificación de relaciones interparrafales:** Mapear cómo se enlazan las proposiciones de un texto mediante conectores lógico-textuales y signos de puntuación.
2. **Eliminación de oraciones por impertinencia (Inatingencia):** Detectar y suprimir la oración que se aparta del eje temático central o que aborda un aspecto ajeno y distractor.
3. **Eliminación de oraciones por redundancia:** Localizar y purgar el enunciado cuya información ya fue aportada con mayor riqueza o concisión por otra proposición del texto.
4. **Detección de desajustes de coherencia:** Identificar saltos lógicos injustificados, fisuras temporales o contradicciones que atentan contra la unidad de sentido global.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        TEXTUALIDAD: COHERENCIA Y COHESIÓN
                                       │
            ┌──────────────────────────┴──────────────────────────┐
            ▼                                                     ▼
     COHERENCIA GLOBAL                                     COHESIÓN LINEAL
    (Dimensión Semántica)                                (Dimensión Gramatical)
            │                                                     │
    ┌───────┴───────┐                                     ┌───────┴───────┐
    ▼               ▼                                     ▼               ▼
Unidad           No Contradicción                      Mecanismos      Conectores
Temática         (Sentido sin                          Referenciales   Lógicos
(Cero saltos     fisuras)                              (Anáfora,       (Causales,
temáticos)                                             Elipsis)        Opositivos)
            │                                                     │
            └──────────────────────────┬──────────────────────────┘
                                       ▼
                       SUPRESIÓN DE ORACIONES (DESCARTE)
                                       │
                        ┌──────────────┴──────────────┐
                        ▼                             ▼
                  IMPERTINENCIA                  REDUNDANCIA
               (Fuera de Tema /                 (Repetición Inútil
                Énfasis Distinto)               de Información)
```



### Ontología de la Textualidad
- **Texto:** Tejido verbal unitario, autónomo e intencional dotado de sentido completo (del latín *textus*, tejido).
- **Coherencia:** Condición semántica por la cual todas las partes del texto convergen armónicamente en el desarrollo de un único tema macroestructural.
- **Cohesión:** Red sintáctica y léxica superficial que encadena visiblemente las oraciones entre sí mediante pronombres, nexos y sinónimos.
- **Impertinencia Directa:** La oración aborda un tema radicalmente distinto al del resto del texto.
- **Impertinencia Indirecta (Por Énfasis):** La oración menciona el mismo tema general, pero enfoca un aspecto secundario o una perspectiva divergente que desentona con el cuerpo del párrafo.

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 Mecanismos de Cohesión Textual en el Examen de Admisión

#### A. Mecanismos Referenciales Gramaticales
1. **Anáfora:** Un pronombre o adverbio asume el significado de una palabra mencionada antes:
   - *"El volcán Misti domina el valle de Arequipa. **Este** macizo tutelar se eleva a 5822 m s. n. m."* (*Este* = El volcán Misti).
2. **Catáfora:** Anticipación de una información que será nombrada expresamente después:
   - *"**Ellos** fueron los grandes próceres de la independencia: San Martín, Bolívar y Sucre"*.
3. **Elipsis:** Supresión de un elemento que se sobreentiende con claridad, aligerando el peso sintáctico:
   - *"Mario Vargas Llosa escribió La ciudad y los perros en 1963; cuatro años después, [ \emptyset ] publicó Los cachorros"*.

#### B. Mecanismos de Cohesión Léxica
1. **Sustitución Sinonímica:** Empleo de vocablos sinónimos para no fatigar al lector con la misma palabra (*sismo \to terremoto \to movimiento telúrico*).
2. **Hiperonimia e Hiponimia:** Reemplazo de una especie por su género abarcador (*abeja \to insecto \to himenóptero*).
3. **Nominalización:** Transformar un verbo en sustantivo para conectar párrafos (*"Las placas tectónicas colisionaron. **Esta colisión** liberó energía..."*).



### 3.2 Los Dos Grandes Criterios de Supresión de Oraciones

```
                              CRITERIOS DE SUPRESIÓN
                                        │
           ┌────────────────────────────┴────────────────────────────┐
           ▼                                                         ▼
     IMPERTINENCIA                                              REDUNDANCIA
   (Falta de Coherencia)                                      (Falta de Concisión)
           │                                                         │
     ┌─────┴─────┐                                             ┌─────┴─────┐
     ▼           ▼                                             ▼           ▼
  Directa     Indirecta                                     Simple      Compuesta
 (Tema ajeno (Mismo tema,                                  (Copia a     (Resume a
  completo)   otro enfoque)                                una sola)    dos o más)
```

#### Criterio 1: Por Impertinencia (Inatingencia)
- Se elimina aquella proposición que rompe la unidad temática.
- **Caso sutil (Impertinencia por desfase de época o enfoque):** Si un texto habla exclusivamente de la arquitectura del Monasterio de Santa Catalina en la época virreinal, una oración que comente las tarifas actuales de los turistas en el año 2026 debe ser eliminada por **impertinencia de enfoque**.

#### Criterio 2: Por Redundancia (Pleonasmo Textual)
- Se elimina la proposición que reitera una información ya consignada en otra oración del texto:
  - **Regla de oro de eliminación:** Si la Oración II dice X de forma breve, y la Oración V dice X con lujo de detalles técnicos y explicaciones ricas, **¡se elimina la Oración II por deficiencia informativa!**
  - Se suprime siempre la que aporte menos riqueza o la que sea una repetición vacía.

---



## 4. FORMULARIO MAESTRO DE EVALUACIÓN DE COHERENCIA

| Paso de Resolución | Algoritmo de Descarte | Regla de Oro en Admisión |
| :--- | :--- | :--- |
| **1. Lectura Panorámica** | Determinar el **Tema Central** y el **Enfoque Dominante** del conjunto. | Sintetizar mentalmente el texto en una frase de 5 palabras. |
| **2. Búsqueda de la Impertinencia** | Cotejar cada oración contra el tema: *¿Esta oración rema hacia el mismo puerto?* | Si una oración habla de otro aspecto, esa es la eliminada sin dudar. |
| **3. Búsqueda de la Redundancia** | Si todas son pertinentes, buscar el par repetitivo (O_i \approx O_j). | Aplicar la ley: Se elimina la que aporte menor precisión léxica. |
| **4. Comprobación Final** | Leer el texto omitiendo la oración elegida para verificar que la lectura fluya con perfecta armonía. | Si la ilación del texto mejora y no se pierde nada vital, la respuesta es 100% segura. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "La Fiesta Exclusiva" (Impertinencia)
- Imagina que el texto es una fiesta temática donde todos deben ir vestidos de gala blanca (arquitectura colonial).
- De pronto llega una oración vestida con traje de baño fosforescente (turismo contemporáneo).
- **¡Sácala de la fiesta inmediatamente!** Por más bonita que sea la oración, no cumple el código de vestimenta del tema.



### Mnemotecnia 2: "El Clon Inútil" (Redundancia)
- Si en un equipo de fútbol ya tienes al delantero titular jugando en la cancha, ¿para qué vas a meter a su clon idéntico que no corre ni aporta nada nuevo?
- Expulsa al clon perezoso y quédate con el jugador que mejor rinda.

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 1: Detección de la Impertinencia por Cambio de Sujeto Gramatical
En el 80% de los ejercicios de eliminación de oraciones:
1. Revisa los sujetos gramaticales de las 5 oraciones:
   - Oración I: *La vicuña...*
   - Oración II: *Este camélido silvestre...*
   - Oración III: *La fibra de la vicuña...*
   - Oración IV: *La alpaca doméstica, en cambio, se cría para...*
   - Oración V: *La conservación de la vicuña en Pampa Galeras...*
2. **HACK:** La oración IV cambió de sujeto (habla de la alpaca mientras todas hablan de la vicuña). Se elimina de inmediato por impertinencia.



### Hack 2: La Redundancia Encubierta por Paráfrasis
Dos oraciones utilizan palabras completamente distintas pero dicen exactamente la misma verdad proposicional:
- Oración I: *"El tabaco contiene sustancias cancerígenas que elevan el riesgo de neoplasias pulmonares"*.
- Oración IV: *"Fumar cigarrillos es nocivo porque los componentes del humo inducen la formación de tumores malignos en el aparato respiratorio"*.
- **HACK:** Ambas dicen P \implies Q. Revisa cuál de las dos está mejor empalmada con sus oraciones vecinas y elimina la que esté aislada o suelta.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Creer que la Oración más Corta es Siempre la que se Elimina**
> No siempre se suprime la oración breve. A veces una oración de dos líneas es el encabezado matriz definitorio y la oración larga es un agregado palabrero redundante que no aporta nada nuevo. Evalúa el **contenido semántico**, no el número de caracteres impresos.

> [!CAUTION]
> **Trampa 2: La Impertinencia por Desfase de Énfasis**
> La trampa maestra de la UNSA: Todas las oraciones hablan del cerebro humano.
> - Oraciones I, II, III y V hablan de los neurotransmisores químicos en las sinapsis.
> - La oración IV habla del peso y tamaño del cerebro de los hombres prehistóricos.
> Aunque la oración IV menciona al cerebro, su enfoque es anatómico-evolutivo, mientras que el resto es bioquímico-funcional. Se elimina por **impertinencia de enfoque**.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la redacción de patentes tecnológicas ante INDECOPI, la formulación de normas jurídicas en el Congreso de la República y la programación de código limpio en ingeniería de software (*Clean Code / Refactoring*), la coherencia y cohesión sin redundancias es el estándar supremo de calidad. Un texto de ley con oraciones redundantes o impertinentes genera vacíos legales, interpretaciones judiciales contradictorias y litigios constitucionales interminables. La economía lingüística es precisión y seguridad jurídica.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Eliminación por Impertinencia Directa)
**Enunciado:** Identifique la oración que debe ser eliminada por romper la coherencia temática del texto:
(I) La vicuña es el camélido sudamericano silvestre que posee la fibra animal más fina y cotizada del planeta.  
(II) Habita en las altiplanicies andinas de la puna, a altitudes que superan los 3800 metros sobre el nivel del mar.  
(III) Su pelaje de color canela en el dorso y blanco en el pecho le confiere un camuflaje natural extraordinario frente a depredadores.  
(IV) El cóndor andino es un ave rapaz de hábitos carroñeros que anida en riscos elevados de la cordillera.  
(V) La caza furtiva de la vicuña durante el siglo XX puso a la especie al borde de la extinción biológica.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Determinamos el eje temático del texto:
   - Las oraciones I, II, III y V describen integralmente a la **vicuña** (taxonomía, hábitat andino, características de su pelaje y peligro de extinción).
2. Analizamos la oración IV:
   - Introduce de forma abrupta un tema biológico totalmente ajeno: las costumbres zoológicas del **cóndor andino** (*Vultur gryphus*).
3. La oración IV quiebra de manera frontal la unidad temática (impertinencia directa radical).
4. Por lo tanto, debe ser excluida del párrafo.
**Respuesta:** D

---



### Ejercicio 2 (Nivel Intermedio: Eliminación por Redundancia Simple)
**Enunciado (Modelo Admisión UNSA):** Elija la oración que debe ser suprimida por constituir una reiteración innecesaria:
(I) El sillar es una roca ígnea piroclástica de tonalidad blanquecina originada por flujos volcánicos consolidados.  
(II) Durante la época virreinal, los arquitectos arequipeños emplearon masivamente el sillar para levantar templos, portadas y claustros.  
(III) La catedral de Arequipa, símbolo indiscutible de la ciudad, fue edificada predominantemente con bloques labrados de sillar.  
(IV) En tiempos de la Colonia, las iglesias, fachadas y conventos de Arequipa se construyeron en gran escala utilizando sillar blanco.  
(V) Su consistencia porosa y ligereza mecánica permitieron esculpir relieves decorativos de extraordinario barroquismo mestizo.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Analizamos la proposición II:
   - *"Durante la época virreinal, los arquitectos arequipeños emplearon masivamente el sillar para levantar templos, portadas y claustros."*
2. Analizamos la proposición IV:
   - *"En tiempos de la Colonia, las iglesias, fachadas y conventos de Arequipa se construyeron en gran escala utilizando sillar blanco."*
3. Cotejo proposicional riguroso:
   - "Época virreinal" = "Tiempos de la Colonia".
   - "Templos, portadas y claustros" = "Iglesias, fachadas y conventos".
   - "Emplearon masivamente el sillar" = "Se construyeron en gran escala utilizando sillar blanco".
4. Las oraciones II y IV afirman exactamente la misma realidad fáctica con una mera sustitución de sinónimos.
5. Como la oración II enlaza mejor cronológicamente con la III y aporta el término técnico arquitectónico, la oración IV resulta un duplicado innecesario.
6. Por ende, la oración IV se elimina por **redundancia simple**.
**Respuesta:** D

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Impertinencia por Desfase de Enfoque)
**Enunciado:** Determine qué oración debe ser eliminada del siguiente texto científico:
(I) La fotosíntesis oxigénica es el proceso bioquímico mediante el cual las plantas, algas y cianobacterias convierten la energía solar en energía química.  
(II) En la fase luminosa, los fotones excitan a los electrones en los fotosistemas I y II ubicados en las membranas tilacoidales del cloroplasto.  
(III) La fotólisis del agua rompe las moléculas de H_2O, liberando oxígeno gaseoso como subproducto y generando ATP y NADPH.  
(IV) Los precios internacionales de los fertilizantes nitrogenados han aumentado considerablemente debido a los conflictos geopolíticos mundiales.  
(V) En la fase oscura o ciclo de Calvin, el ATP y NADPH producidos fijan el dióxido de carbono (CO_2) para sintetizar glucosa.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Mapeamos el eje temático:
   - Oraciones I, II, III y V describen con rigor de biología celular y bioquímica las **fases moleculares de la fotosíntesis oxigénica** (fase luminosa, fotólisis del agua y ciclo de Calvin).
2. Analizamos la oración IV:
   - Trata sobre la economía internacional, el costo comercial de los fertilizantes inorgánicos y los conflictos geopolíticos.
3. Aunque los fertilizantes tienen que ver indirectamente con la agricultura, la oración IV rompe la naturaleza bioquímica microscópica del discurso.
4. Se elimina categóricamente por **impertinencia temática y de enfoque**.
**Respuesta:** D

---



### Ejercicio 4 (Nivel Avanzado DECO: Eliminación por Redundancia Compuesta)
**Enunciado (Tipo San Marcos DECO / UNSA):** Identifique la oración prescindible en el siguiente fragmento:
(I) La enfermedad de Alzheimer es un trastorno neurodegenerativo progresivo caracterizado por el deterioro cognitivo y la pérdida irreversible de la memoria.  
(II) A nivel histopatológico, se distingue por la acumulación anormal de placas seniles de proteína beta-amiloide en el espacio extracelular del cerebro.  
(III) Asimismo, se observa la formación intracelular de ovillos neurofibrilares compuestos por proteína tau hiperfosforilada.  
(IV) Estas lesiones provocan la pérdida sináptica masiva y la muerte neuronal en regiones críticas como el hipocampo y la corteza cerebral.  
(V) El Alzheimer se manifiesta histológicamente tanto por las placas beta-amiloides como por los ovillos de proteína tau que destruyen las neuronas.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Evaluamos el contenido informativo de cada enunciado:
   - Oración I: Define la patología clínica y sus síntomas macroscópicos.
   - Oración II: Explica con rigor la primera lesión histopatológica (placas beta-amiloides).
   - Oración III: Explica con rigor la segunda lesión histopatológica (ovillos de proteína tau).
   - Oración IV: Describe la consecuencia lesiva en las regiones cerebrales (hipocampo y corteza).
2. Analizamos la oración V:
   - Afirma que el Alzheimer presenta placas beta-amiloides (dicho en II) y ovillos de tau (dicho en III) que dañan neuronas (dicho en IV).
3. La oración V no aporta un solo dato nuevo; es una síntesis empobrecedora que reitera lo ya explicado con mayor profundidad analítica en las oraciones II, III y IV.
4. Por el criterio de **redundancia compuesta**, la oración V es prescindible y debe ser suprimida.
**Respuesta:** E

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Eliminación por Contradicción Lógica Interna)
**Enunciado (Nivel UNI / Máxima Exigencia):** ¿Qué oración debe ser eliminada del siguiente ensayo sobre termodinámica y cosmología?
(I) El segundo principio de la termodinámica postula que en todo sistema físico aislado la entropía global tiende inexorablemente a aumentar con el tiempo.  
(II) Esta degradación continua de la energía disponible hacia formas térmicas no aprovechables establece una 'flecha del tiempo' unidireccional e irreversible en el universo.  
(III) En concordancia con esta ley, todos los sistemas cerrados del cosmos pueden espontáneamente disminuir su desorden y retornar por sí mismos a su estado inicial de mínima entropía sin gasto energético externo.  
(IV) A escala cosmológica, este proceso sostenido conducirá en el futuro remoto al escenario asintótico conocido como la 'muerte térmica' del universo.  
(V) En dicho estado final, cesarán todos los procesos físicos dinámicos al alcanzarse el equilibrio térmico absoluto a temperaturas cercanas al cero kelvin.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Analizamos la doctrina física expuesta en el texto:
   - Oración I: La entropía en sistemas aislados siempre aumenta (\Delta S \ge 0).
   - Oración II: Establece la flecha unidireccional del tiempo e irreversibilidad.
   - Oraciones IV y V: Describen la consecuencia cósmica inevitable (muerte térmica y equilibrio a cero kelvin).
2. Analizamos minuciosamente la proposición III:
   - *"todos los sistemas cerrados del cosmos pueden espontáneamente disminuir su desorden y retornar por sí mismos a su estado inicial de mínima entropía sin gasto energético..."*.
   - Esta afirmación afirma que los sistemas cerrados disminuyen su entropía espontáneamente (\Delta S < 0), lo cual **viola de manera frontal y categórica la segunda ley de la termodinámica** enunciada en la oración I y la irreversibilidad de la oración II.
3. La oración III incurre en una flagrante **contradicción interna con la tesis central** del texto.
4. En los exámenes de admisión de alta exigencia, la contradicción directa es causal indiscutible de supresión por destrucción de la coherencia textual.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Coherencia Textual:** Cualidad semántica que dota al texto de sentido unificado y convergente.
2. **Cohesión Textual:** Conjunto de enlaces gramaticales y léxicos que articulan formalmente las oraciones.
3. **Impertinencia:** Criterio de eliminación aplicado a oraciones que se desvían del tema central del párrafo.
4. **Redundancia:** Repetición viciosa de información ya expresada que no añade ningún valor cognitivo.
5. **Anáfora:** Mecanismo referencial donde un término asume el valor semántico de un antecedente textual.
6. **Catáfora:** Mecanismo de anticipación donde un pronombre señala a un término que aparecerá después.
7. **Elipsis:** Supresión voluntaria de un elemento sintáctico que el lector restituye mentalmente.
8. **Inatingencia por Enfoque:** Error de coherencia donde el tema es afín pero la perspectiva o disciplina choca con el texto.
9. **Redundancia Compuesta:** Reiteración en una sola proposición de datos dispersos en dos o más oraciones del texto.
10. **Contradicción Lógica:** Afirmación que niega de forma directa los postulados sostenidos en las premisas matrices del escrito.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la diferencia entre impertinencia directa e impertinencia indirecta?**  
  **A:** La directa trata de un tema totalmente ajeno; la indirecta trata del mismo tema general pero con un enfoque o aspecto secundario divergente.
- **Q: Si dos oraciones dicen lo mismo, ¿cuál de las dos debe ser eliminada?**  
  **A:** Se elimina la que aporte menor precisión, menor riqueza explicativa o la que quede desconectada del hilo argumentativo.
- **Q: ¿Qué es una anáfora en la cohesión de un párrafo?**  
  **A:** El uso de un pronombre o demostrativo para referirse a una palabra o idea que ya fue nombrada líneas arriba.
- **Q: ¿Por qué una contradicción interna es motivo de supresión de oración?**  
  **A:** Porque destruye el principio de no contradicción, que es el pilar innegociable de la coherencia semántica textual.
- **Q: ¿Cómo ayuda el subrayado del sujeto gramatical a detectar la oración impertinente?**  
  **A:** Permite identificar al instante la oración discordante que cambió de protagonista sin justificación discursiva.

---

---

## 4. FORMULARIO MAESTRO DE IDENTIFICACIÓN TIPOLÓGICA

| Rasgo Observable en el Examen | Conclusión Tipológica Inmediata | Estrategia de Lectura Eficaz |
| :--- | :--- | :--- |
| **Presencia de Tesis + Conectores Opositivos** | **Texto Argumentativo** | Rastrear la tesis central y los argumentos principales. |
| **Definiciones Científicas + Función Referencial** | **Texto Explicativo / Expositivo** | Identificar el fenómeno y sus causas determinantes. |
| **Presencia de Gráficos de Barras o Tablas** | **Texto Mixto / Discontinuo** | Cruzar la cifra estadística del gráfico con la afirmación del texto. |
| **Verbos Imperativos en Cascada Numérica** | **Texto Instructivo** | Leer la secuencia lineal de acciones obligatorias sin saltar pasos. |

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "La Brújula de las Cuatro Puntas" (\text{I-A-E-I})
- **I**nformativo = La Noticia (Te cuenta el hecho sin meter su cuchara).
- **A**rgumentativo = El Juicio (El fiscal defiende su teoría con uñas y dientes).
- **E**xplicativo = La Clase del Catedrático (Te explica cómo funciona la célula).
- **I**nstructivo = El Manual de Armado (Te ordena paso por paso qué tornillo ajustar).

### Mnemotecnia 2: "El Semáforo de la Postura"
- ⚪ **Blanco (Informativo / Explicativo):** Cero opinión personal, solo ciencia y datos.
- 🔴 **Rojo de Fuego (Argumentativo):** El autor toma partido y pelea por su idea.
- 🟡 **Amarillo de Alerta (Instructivo):** Órdenes directas que debes obedecer.

---

---

### 3.3 El Punto de Discrepancia en Textos Dialécticos
Cuando el examen presenta un texto con dos interlocutores en debate (Diálogo A vs. Diálogo B):
- **Discrepancia Central:** Aquello en lo que A y B se oponen diametralmente.
- **Puntos de Coincidencia (Trampa frecuente):** Datos o hechos de la realidad que ambos aceptan pero interpretan de forma divergente.
- *Ejemplo:* Si A dice: *"Debemos prohibir las corridas de toros por ser un acto cruel"*, y B responde: *"No debemos prohibirlas porque son una tradición cultural milenaria"*:
  - Punto de coincidencia: Ambos aceptan que las corridas de toros existen y forman parte de una tradición viva.
  - Punto de discrepancia: **Si la crueldad animal debe ser motivo suficiente para prohibir legalmente las corridas de toros**.

---

## 4. FORMULARIO MAESTRO DE EVALUACIÓN ARGUMENTATIVA

| Desafío en Admisión | Pregunta Clave de Interrogación | Criterio de Resolución |
| :--- | :--- | :--- |
| **Hallar la Tesis** | *¿Qué afirmación defiende con vehemencia el autor contra viento y marea?* | La tesis es siempre una oración enunciativa afirmativa o negativa, nunca una pregunta ni un sintagma nominal suelto. |
| **Hallar el Argumento Central** | *¿Cuál es el "PORQUE" nuclear que sostiene su tesis?* | El argumento debe ser la causa directa de la postura, no un mero ejemplo secundario. |
| **Debilitar Argumento** | *¿Qué información nueva vuelve insostenible o absurdo el puente causal del autor?* | El mejor debilitador ataca la conexión directa entre la premisa y la conclusión. |
| **Reforzar Argumento** | *¿Qué dato adicional descarta las dudas razonables del opositor?* | El mejor reforzador confirma la exclusividad de la relación causa-efecto planteada. |
| **Supuesto Subyacente** | *¿Qué premisa no dicha necesita el autor para que su argumento tenga sentido?* | Si el supuesto es falso, todo el argumento se derrumba de inmediato. |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "La Mesa de Tres Patas"
- El **tablero** superior es la **TESIS** (lo que se quiere mantener en pie).
- Las **patas** son los **ARGUMENTOS** (lo que sostiene al tablero).
- Si en una pregunta de examen te piden debilitar el argumento: **¡NO cortes el tablero, serrucha una de las patas!** Quien ataca los fundamentos empíricos derriba el texto completo.

### Mnemotecnia 2: "El Duelo de Vaqueros" (Discrepancia)
- Identifica el arma de Vaquero 1 (Tesis 1).
- Identifica el arma de Vaquero 2 (Tesis 2).
- El punto de choque donde se cruzan las balas es la **Discrepancia**. Si hablan de temas paralelos que no se tocan, todavía no has encontrado el núcleo del conflicto.

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: La Pregunta de Oro: "¿Y QUÉ?" (Prueba de Inatingencia)
Cuando te presenten una alternativa en una pregunta de debilitar/reforzar:
- Aplica la prueba del "¿Y qué?":
  - Si la alternativa dice algo verdadero pero que no afecta directamente a la tesis del autor, pregúntate: *¿Y qué tiene que ver eso con su argumento central?*
  - Si la respuesta es "nada relevante", es un **distractor fuera de foco**. Táchala de inmediato.

### Hack 2: La Prueba de la Negación para Encontrar el Supuesto
Para hallar el **supuesto de un argumento**:
1. Toma la alternativa que crees que es el supuesto.
2. Niégala categóricamente en tu mente (ponle un "NO").
3. Si al negarla el argumento del autor se vuelve completamente absurdo e inviable, **¡esa alternativa es el supuesto obligatorio!**

---

---

### 3.2 El Tono del Autor: Glosario de Actitudes Discursivas
El tono es la "música" interior del texto. Saber calificar el tono permite al postulante resolver la pregunta más sutil de la prueba:

```
[TONO CRÍTICO / SEVERO]   ──▶  Juzga con rigor intelectual señalando deficiencias y errores.
[TONO ESCÉPTICO / CAUTO]   ──▶  Duda de verdades absolutas, exige pruebas y desconfía de optimismos ingenuos.
[TONO IRÓNICO / SARCÁSTICO]──▶  Usa el doble sentido burlesco para mofarse de una situación o personaje.
[TONO SOLEMNE / PROTOCOLAR]──▶  Lenguaje grave, formal, majestuoso y respetuoso propio de actos oficiales.
[TONO PANEGÍRICO / LAUDATORIO]▶ Alaba con entusiasmo desmedido las virtudes de alguien o algo.
[TONO ELEGÍACO / NOSTÁLGICO] ──▶  Lamenta con melancolía y tristeza una pérdida irreparable o el pasado ido.
[TONO BELIGERANTE / AGRESIVO]──▶  Confrontacional, violento en adjetivos, busca la colisión frontal abierta.
[TONO ASERTIVO / OBJETIVO] ──▶  Tranquilo, firme, fundamentado en hechos empíricos sin apasionamiento ciego.
```

### 3.3 El Deslinde entre Hecho, Opinión y Punto de Vista
1. **Hecho:** Suceso fáctico comprobable empíricamente por cualquier observador neutral (*"Arequipa se ubica a 2325 m s. n. m."*).
2. **Opinión:** Juicio subjetivo o estimación personal del autor que admite discrepancia (*"Arequipa posee el clima más agradable de la cordillera andina"*).
3. **Punto de Vista:** La postura articulada donde el autor selecciona determinados hechos para fundamentar su opinión de manera sistemática.

---

## 4. FORMULARIO MAESTRO DE ANÁLISIS DE LA INTENCIÓN

| Pregunta de Examen | Método de Rastreo Textual | Fórmula de Elección de Clave |
| :--- | :--- | :--- |
| *¿Cuál es el propósito central del autor?* | Localizar la Idea Principal y transformarla en infinitivo activo. | \text{Propósito} = \text{Verbo Infinitivo Rector} + \text{Idea Principal}. |
| *¿Qué tono predomina en el texto?* | Subrayar los 5 adjetivos y adverbios más cargados de valor del autor. | Si los adjetivos son burlescos \to *Irónico*. Si son de duda \to *Escéptico*. |
| *El autor asume una postura...* | Evaluar si defiende, ataca o se mantiene al margen del tema. | Opciones de polaridad: *Favorable, Contraria, Imparcial o Crítica*. |

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "cl_t07_s01_c01",
                    question = "En las pruebas DECO, los 'Textos Dialécticos' (o de postura contrapuesta) presentan primordialmente:",
                    options = listOf(
                        "Un poema lírico acompañado de su transcripción fonética en el alfabeto de los lingüistas clásicos.",
                        "Una lista de instrucciones técnicas para la instalación domiciliaria de tuberías de gas natural.",
                        "Un monólogo narrativo donde un personaje ficticio describe sus recuerdos de infancia sin ningún conflicto.",
                        "Dos perspectivas divergentes o polémicas de distintos autores en torno a un mismo tema o problema controversial.",
                    ),
                    correctIndex = 3,
                    explanation = "El texto dialéctico (Texto A y Texto B) se articula sobre un núcleo polémico común: dos autores examinan una misma temática desde presupuestos teóricos o axiológicos antagónicos."
                ),
                Challenge(
                    id = "cl_t07_s01_c02",
                    question = "Para abordar eficazmente un texto dialéctico, el primer paso metodológico indispensable radica en determinar:",
                    options = listOf(
                        "El autor que haya empleado mayor cantidad de párrafos y oraciones complejas en su argumentación.",
                        "El 'Punto de Discrepancia' o eje temático en torno al cual colisionan las tesis de ambos autores.",
                        "Cuál de los dos autores posee un título doctoral obtenido en una universidad de prestigio internacional.",
                        "La postura política personal del profesor que diseñó el examen de admisión correspondiente.",
                    ),
                    correctIndex = 1,
                    explanation = "El 'Punto de Discrepancia' es el nudo argumental donde coinciden en el objeto de debate pero discrepan en su valoración, diagnóstico o solución propuesta."
                ),
                Challenge(
                    id = "cl_t07_s01_c03",
                    question = "Si el Texto A defiende la necesidad de subsidiar la educación universitaria pública y el Texto B postula que el financiamiento debe ser privado para garantizar eficiencia, el punto de discrepancia central es:",
                    options = listOf(
                        "El número de vacantes que deben asignarse a las carreras profesionales de humanidades y ciencias.",
                        "La edad límite que deben tener los estudiantes para postular a los programas de posgrado y maestría.",
                        "El modelo de financiamiento óptimo y la naturaleza pública o privada de la educación superior universitaria.",
                        "La conveniencia de construir comedores universitarios con fondos provenientes de donaciones anónimas.",
                    ),
                    correctIndex = 2,
                    explanation = "Ambos autores debaten sobre cómo debe solventarse económicamente la educación universitaria: Texto A aboga por el subsidio estatal y Texto B por el mercado y financiamiento privado."
                ),
                Challenge(
                    id = "cl_t07_s01_c04",
                    question = "En un texto dialéctico, ¿qué se entiende por 'Punto de Coincidencia' entre los autores?",
                    options = listOf(
                        "El aspecto, premisa fáctica o preocupación común que ambos reconocen como válida antes de bifurcar sus tesis.",
                        "El repudio unánime de ambos hacia las normas de la Real Academia Española de la Lengua.",
                        "La coincidencia formal en el número exacto de palabras empleadas en sus respectivos artículos editoriales.",
                        "La conclusión idéntica a la que llegan ambos textos a pesar de haber utilizado argumentos radicalmente distintos.",
                    ),
                    correctIndex = 0,
                    explanation = "A menudo los polemistas coinciden en la existencia y gravedad de un problema (ejemplo: la crisis de la salud pública), pero difieren frontalmente en las causas y en las medidas para resolverlo."
                ),
                Challenge(
                    id = "cl_t07_s01_c05",
                    question = "Si el Autor A sostiene: 'La inteligencia artificial destruirá empleos masivamente generando una crisis social sin precedentes', y el Autor B argumenta: 'La automatización transformará los empleos existentes y creará nuevas industrias más productivas', el desacuerdo estriba en:",
                    options = listOf(
                        "El impacto neto que la inteligencia artificial ejercerá sobre el futuro del mercado laboral y el empleo.",
                        "La historia biográfica de los pioneros de la informática durante el transcurso de la Segunda Guerra Mundial.",
                        "La viabilidad de implementar algoritmos de compresión de datos en redes neuronales profundas.",
                        "El costo monetario que implica adquirir una licencia de software para el uso escolar básico.",
                    ),
                    correctIndex = 0,
                    explanation = "La discrepancia gira en torno a las consecuencias laborales de la IA: visión pesimista y destructiva en el autor A versus visión adaptativa y creadora de oportunidades en el autor B."
                ),
                Challenge(
                    id = "cl_t07_s01_c06",
                    question = "¿Cuál es la principal recomendación operativa al contestar preguntas referidas exclusivamente a uno de los textos (ejemplo: 'Según el Autor A...')?",
                    options = listOf(
                        "Ceñirse estrictamente al marco argumentativo del Autor A, evitando contaminar la respuesta con premisas del Autor B.",
                        "Buscar en internet las declaraciones más recientes de los autores para verificar si cambiaron de opinión.",
                        "Responder considerando solo el texto B porque al estar ubicado en segundo término posee valor definitivo.",
                        "Mezclar las opiniones de ambos autores para construir una postura intermedia ecuménica y pacífica.",
                    ),
                    correctIndex = 0,
                    explanation = "Cuando el reactivo delimita la pregunta a uno de los emisores ('Según A'), validar opciones con tesis del emisor B constituye un error clásico de atribución indebida."
                ),
                Challenge(
                    id = "cl_t07_s01_c07",
                    question = "En un debate sobre eutanasia voluntaria, el Autor A fundamenta su postura en la autonomía moral del paciente, mientras el Autor B lo hace en la sacralidad biológica de la vida. Se infiere que la discrepancia descansa en:",
                    options = listOf(
                        "Diferencias insalvables sobre el costo de los sedantes en los hospitales de alta complejidad.",
                        "Presupuestos éticos y filosóficos disímiles sobre el principio rector de la existencia humana.",
                        "La falta de experiencia clínica directa de los médicos encargados de las unidades de cuidados paliativos.",
                        "Un malentendido terminológico sobre la etimología griega de los vocablos del derecho romano.",
                    ),
                    correctIndex = 1,
                    explanation = "El conflicto es de índole principista: la libertad y autodeterminación individual del individuo (Autor A) colisiona con el principio ético-religioso de inviolabilidad ontológica de la vida (Autor B)."
                ),
                Challenge(
                    id = "cl_t07_s01_c08",
                    question = "Si el Autor A califica una medida tributaria como 'progresiva y equitativa' y el Autor B la tilda de 'confiscatoria e inconstitucional', el tono de ambos autores puede caracterizarse respectivamente como:",
                    options = listOf(
                        "Elegíaco y luctuoso en A; festivo y jocoso en B.",
                        "Sarcástico y burlesco en A; indiferente y desinteresado en B.",
                        "Neutro y aséptico en A; poético y contemplativo en B.",
                        "Reivindicativo y entusiasta en A; admonitorio y crítico en B.",
                    ),
                    correctIndex = 3,
                    explanation = "El léxico utilizado revela una postura de respaldo moral y justicia social en el Autor A (reivindicativo/favorable) frente a una postura de alarma jurídica y rechazo en el Autor B (crítico/admonitorio)."
                ),
                Challenge(
                    id = "cl_t07_s01_c09",
                    question = "Un reactivo solicita: 'Ambos autores coincidirían necesariamente en que...'. Para responderlo correctamente, la alternativa debe ser:",
                    options = listOf(
                        "La tesis más extremista y polémica formulada por el texto más extenso de la controversia.",
                        "Una premisa fáctica o axiológica aceptada implícita o explícitamente en el razonamiento de los dos polemistas.",
                        "Una aseveración que uno defienda apasionadamente y el otro contradiga con datos estadísticos.",
                        "Un dato biográfico que no guarda relación con la controversia analizada en el examen.",
                    ),
                    correctIndex = 1,
                    explanation = "La coincidencia debe validarse como un punto de acuerdo común sustentado en ambos textos, constituyendo la base compartida sobre la cual se monta la discusión."
                ),
                Challenge(
                    id = "cl_t07_s01_c10",
                    question = "Si el Autor A descalifica el argumento del Autor B señalando: 'Mi contraparte es joven e inexperto para opinar sobre reformas fiscales', el Autor A está incurriendo en:",
                    options = listOf(
                        "Un argumento deductivo concluyente basado en el método inductivo de las ciencias naturales.",
                        "Una falacia 'ad hominem' que ataca al emisor en lugar de refutar los méritos sustantivos de su tesis.",
                        "Una metáfora retórica indispensable para la claridad explicativa del artículo periodístico.",
                        "Un principio formal aceptado unánimemente en la teoría económica de las finanzas estatales.",
                    ),
                    correctIndex = 1,
                    explanation = "En la lectura crítica de debates dialécticos, descalificar al proponente por su edad o trayectoria personal en vez de rebatir sus datos económicos constituye una evidente falacia contra la persona (ad hominem)."
                ),
            )
        ),
        LessonNode(
            id = "cl_t07_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "3.2 Los Dos Grandes Criterios de Supresión de Oraciones",
            theory = LessonTheory(
                content = """# TEMA VII: Coherencia y Cohesión Textual

---



## 4. FORMULARIO MAESTRO DE EVALUACIÓN DE COHERENCIA

| Paso de Resolución | Algoritmo de Descarte | Regla de Oro en Admisión |
| :--- | :--- | :--- |
| **1. Lectura Panorámica** | Determinar el **Tema Central** y el **Enfoque Dominante** del conjunto. | Sintetizar mentalmente el texto en una frase de 5 palabras. |
| **2. Búsqueda de la Impertinencia** | Cotejar cada oración contra el tema: *¿Esta oración rema hacia el mismo puerto?* | Si una oración habla de otro aspecto, esa es la eliminada sin dudar. |
| **3. Búsqueda de la Redundancia** | Si todas son pertinentes, buscar el par repetitivo (O_i \approx O_j). | Aplicar la ley: Se elimina la que aporte menor precisión léxica. |
| **4. Comprobación Final** | Leer el texto omitiendo la oración elegida para verificar que la lectura fluya con perfecta armonía. | Si la ilación del texto mejora y no se pierde nada vital, la respuesta es 100% segura. |

---



### Ejercicio 1 (Nivel Básico: Eliminación por Impertinencia Directa)
**Enunciado:** Identifique la oración que debe ser eliminada por romper la coherencia temática del texto:
(I) La vicuña es el camélido sudamericano silvestre que posee la fibra animal más fina y cotizada del planeta.  
(II) Habita en las altiplanicies andinas de la puna, a altitudes que superan los 3800 metros sobre el nivel del mar.  
(III) Su pelaje de color canela en el dorso y blanco en el pecho le confiere un camuflaje natural extraordinario frente a depredadores.  
(IV) El cóndor andino es un ave rapaz de hábitos carroñeros que anida en riscos elevados de la cordillera.  
(V) La caza furtiva de la vicuña durante el siglo XX puso a la especie al borde de la extinción biológica.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Determinamos el eje temático del texto:
   - Las oraciones I, II, III y V describen integralmente a la **vicuña** (taxonomía, hábitat andino, características de su pelaje y peligro de extinción).
2. Analizamos la oración IV:
   - Introduce de forma abrupta un tema biológico totalmente ajeno: las costumbres zoológicas del **cóndor andino** (*Vultur gryphus*).
3. La oración IV quiebra de manera frontal la unidad temática (impertinencia directa radical).
4. Por lo tanto, debe ser excluida del párrafo.
**Respuesta:** D

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Coherencia Textual:** Cualidad semántica que dota al texto de sentido unificado y convergente.
2. **Cohesión Textual:** Conjunto de enlaces gramaticales y léxicos que articulan formalmente las oraciones.
3. **Impertinencia:** Criterio de eliminación aplicado a oraciones que se desvían del tema central del párrafo.
4. **Redundancia:** Repetición viciosa de información ya expresada que no añade ningún valor cognitivo.
5. **Anáfora:** Mecanismo referencial donde un término asume el valor semántico de un antecedente textual.
6. **Catáfora:** Mecanismo de anticipación donde un pronombre señala a un término que aparecerá después.
7. **Elipsis:** Supresión voluntaria de un elemento sintáctico que el lector restituye mentalmente.
8. **Inatingencia por Enfoque:** Error de coherencia donde el tema es afín pero la perspectiva o disciplina choca con el texto.
9. **Redundancia Compuesta:** Reiteración en una sola proposición de datos dispersos en dos o más oraciones del texto.
10. **Contradicción Lógica:** Afirmación que niega de forma directa los postulados sostenidos en las premisas matrices del escrito.

---



### Ejercicio 4 (Nivel Avanzado DECO: Eliminación por Redundancia Compuesta)
**Enunciado (Tipo San Marcos DECO / UNSA):** Identifique la oración prescindible en el siguiente fragmento:
(I) La enfermedad de Alzheimer es un trastorno neurodegenerativo progresivo caracterizado por el deterioro cognitivo y la pérdida irreversible de la memoria.  
(II) A nivel histopatológico, se distingue por la acumulación anormal de placas seniles de proteína beta-amiloide en el espacio extracelular del cerebro.  
(III) Asimismo, se observa la formación intracelular de ovillos neurofibrilares compuestos por proteína tau hiperfosforilada.  
(IV) Estas lesiones provocan la pérdida sináptica masiva y la muerte neuronal en regiones críticas como el hipocampo y la corteza cerebral.  
(V) El Alzheimer se manifiesta histológicamente tanto por las placas beta-amiloides como por los ovillos de proteína tau que destruyen las neuronas.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Evaluamos el contenido informativo de cada enunciado:
   - Oración I: Define la patología clínica y sus síntomas macroscópicos.
   - Oración II: Explica con rigor la primera lesión histopatológica (placas beta-amiloides).
   - Oración III: Explica con rigor la segunda lesión histopatológica (ovillos de proteína tau).
   - Oración IV: Describe la consecuencia lesiva en las regiones cerebrales (hipocampo y corteza).
2. Analizamos la oración V:
   - Afirma que el Alzheimer presenta placas beta-amiloides (dicho en II) y ovillos de tau (dicho en III) que dañan neuronas (dicho en IV).
3. La oración V no aporta un solo dato nuevo; es una síntesis empobrecedora que reitera lo ya explicado con mayor profundidad analítica en las oraciones II, III y IV.
4. Por el criterio de **redundancia compuesta**, la oración V es prescindible y debe ser suprimida.
**Respuesta:** E

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Eliminación por Contradicción Lógica Interna)
**Enunciado (Nivel UNI / Máxima Exigencia):** ¿Qué oración debe ser eliminada del siguiente ensayo sobre termodinámica y cosmología?
(I) El segundo principio de la termodinámica postula que en todo sistema físico aislado la entropía global tiende inexorablemente a aumentar con el tiempo.  
(II) Esta degradación continua de la energía disponible hacia formas térmicas no aprovechables establece una 'flecha del tiempo' unidireccional e irreversible en el universo.  
(III) En concordancia con esta ley, todos los sistemas cerrados del cosmos pueden espontáneamente disminuir su desorden y retornar por sí mismos a su estado inicial de mínima entropía sin gasto energético externo.  
(IV) A escala cosmológica, este proceso sostenido conducirá en el futuro remoto al escenario asintótico conocido como la 'muerte térmica' del universo.  
(V) En dicho estado final, cesarán todos los procesos físicos dinámicos al alcanzarse el equilibrio térmico absoluto a temperaturas cercanas al cero kelvin.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Analizamos la doctrina física expuesta en el texto:
   - Oración I: La entropía en sistemas aislados siempre aumenta (\Delta S \ge 0).
   - Oración II: Establece la flecha unidireccional del tiempo e irreversibilidad.
   - Oraciones IV y V: Describen la consecuencia cósmica inevitable (muerte térmica y equilibrio a cero kelvin).
2. Analizamos minuciosamente la proposición III:
   - *"todos los sistemas cerrados del cosmos pueden espontáneamente disminuir su desorden y retornar por sí mismos a su estado inicial de mínima entropía sin gasto energético..."*.
   - Esta afirmación afirma que los sistemas cerrados disminuyen su entropía espontáneamente (\Delta S < 0), lo cual **viola de manera frontal y categórica la segunda ley de la termodinámica** enunciada en la oración I y la irreversibilidad de la oración II.
3. La oración III incurre en una flagrante **contradicción interna con la tesis central** del texto.
4. En los exámenes de admisión de alta exigencia, la contradicción directa es causal indiscutible de supresión por destrucción de la coherencia textual.
**Respuesta:** C

---



### Ejercicio 2 (Nivel Intermedio: Eliminación por Redundancia Simple)
**Enunciado (Modelo Admisión UNSA):** Elija la oración que debe ser suprimida por constituir una reiteración innecesaria:
(I) El sillar es una roca ígnea piroclástica de tonalidad blanquecina originada por flujos volcánicos consolidados.  
(II) Durante la época virreinal, los arquitectos arequipeños emplearon masivamente el sillar para levantar templos, portadas y claustros.  
(III) La catedral de Arequipa, símbolo indiscutible de la ciudad, fue edificada predominantemente con bloques labrados de sillar.  
(IV) En tiempos de la Colonia, las iglesias, fachadas y conventos de Arequipa se construyeron en gran escala utilizando sillar blanco.  
(V) Su consistencia porosa y ligereza mecánica permitieron esculpir relieves decorativos de extraordinario barroquismo mestizo.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Analizamos la proposición II:
   - *"Durante la época virreinal, los arquitectos arequipeños emplearon masivamente el sillar para levantar templos, portadas y claustros."*
2. Analizamos la proposición IV:
   - *"En tiempos de la Colonia, las iglesias, fachadas y conventos de Arequipa se construyeron en gran escala utilizando sillar blanco."*
3. Cotejo proposicional riguroso:
   - "Época virreinal" = "Tiempos de la Colonia".
   - "Templos, portadas y claustros" = "Iglesias, fachadas y conventos".
   - "Emplearon masivamente el sillar" = "Se construyeron en gran escala utilizando sillar blanco".
4. Las oraciones II y IV afirman exactamente la misma realidad fáctica con una mera sustitución de sinónimos.
5. Como la oración II enlaza mejor cronológicamente con la III y aporta el término técnico arquitectónico, la oración IV resulta un duplicado innecesario.
6. Por ende, la oración IV se elimina por **redundancia simple**.
**Respuesta:** D

---



### Matriz de Indicadores de Logro Evaluados
1. **Identificación de relaciones interparrafales:** Mapear cómo se enlazan las proposiciones de un texto mediante conectores lógico-textuales y signos de puntuación.
2. **Eliminación de oraciones por impertinencia (Inatingencia):** Detectar y suprimir la oración que se aparta del eje temático central o que aborda un aspecto ajeno y distractor.
3. **Eliminación de oraciones por redundancia:** Localizar y purgar el enunciado cuya información ya fue aportada con mayor riqueza o concisión por otra proposición del texto.
4. **Detección de desajustes de coherencia:** Identificar saltos lógicos injustificados, fisuras temporales o contradicciones que atentan contra la unidad de sentido global.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la diferencia entre impertinencia directa e impertinencia indirecta?**  
  **A:** La directa trata de un tema totalmente ajeno; la indirecta trata del mismo tema general pero con un enfoque o aspecto secundario divergente.
- **Q: Si dos oraciones dicen lo mismo, ¿cuál de las dos debe ser eliminada?**  
  **A:** Se elimina la que aporte menor precisión, menor riqueza explicativa o la que quede desconectada del hilo argumentativo.
- **Q: ¿Qué es una anáfora en la cohesión de un párrafo?**  
  **A:** El uso de un pronombre o demostrativo para referirse a una palabra o idea que ya fue nombrada líneas arriba.
- **Q: ¿Por qué una contradicción interna es motivo de supresión de oración?**  
  **A:** Porque destruye el principio de no contradicción, que es el pilar innegociable de la coherencia semántica textual.
- **Q: ¿Cómo ayuda el subrayado del sujeto gramatical a detectar la oración impertinente?**  
  **A:** Permite identificar al instante la oración discordante que cambió de protagonista sin justificación discursiva.

---



### Ontología de la Textualidad
- **Texto:** Tejido verbal unitario, autónomo e intencional dotado de sentido completo (del latín *textus*, tejido).
- **Coherencia:** Condición semántica por la cual todas las partes del texto convergen armónicamente en el desarrollo de un único tema macroestructural.
- **Cohesión:** Red sintáctica y léxica superficial que encadena visiblemente las oraciones entre sí mediante pronombres, nexos y sinónimos.
- **Impertinencia Directa:** La oración aborda un tema radicalmente distinto al del resto del texto.
- **Impertinencia Indirecta (Por Énfasis):** La oración menciona el mismo tema general, pero enfoca un aspecto secundario o una perspectiva divergente que desentona con el cuerpo del párrafo.

---



### 3.2 Los Dos Grandes Criterios de Supresión de Oraciones

```
                              CRITERIOS DE SUPRESIÓN
                                        │
           ┌────────────────────────────┴────────────────────────────┐
           ▼                                                         ▼
     IMPERTINENCIA                                              REDUNDANCIA
   (Falta de Coherencia)                                      (Falta de Concisión)
           │                                                         │
     ┌─────┴─────┐                                             ┌─────┴─────┐
     ▼           ▼                                             ▼           ▼
  Directa     Indirecta                                     Simple      Compuesta
 (Tema ajeno (Mismo tema,                                  (Copia a     (Resume a
  completo)   otro enfoque)                                una sola)    dos o más)
```

#### Criterio 1: Por Impertinencia (Inatingencia)
- Se elimina aquella proposición que rompe la unidad temática.
- **Caso sutil (Impertinencia por desfase de época o enfoque):** Si un texto habla exclusivamente de la arquitectura del Monasterio de Santa Catalina en la época virreinal, una oración que comente las tarifas actuales de los turistas en el año 2026 debe ser eliminada por **impertinencia de enfoque**.

#### Criterio 2: Por Redundancia (Pleonasmo Textual)
- Se elimina la proposición que reitera una información ya consignada en otra oración del texto:
  - **Regla de oro de eliminación:** Si la Oración II dice X de forma breve, y la Oración V dice X con lujo de detalles técnicos y explicaciones ricas, **¡se elimina la Oración II por deficiencia informativa!**
  - Se suprime siempre la que aporte menos riqueza o la que sea una repetición vacía.

---



### Mnemotecnia 1: "La Fiesta Exclusiva" (Impertinencia)
- Imagina que el texto es una fiesta temática donde todos deben ir vestidos de gala blanca (arquitectura colonial).
- De pronto llega una oración vestida con traje de baño fosforescente (turismo contemporáneo).
- **¡Sácala de la fiesta inmediatamente!** Por más bonita que sea la oración, no cumple el código de vestimenta del tema.



### Ejercicio 3 (Nivel Intermedio-Avanzado: Impertinencia por Desfase de Enfoque)
**Enunciado:** Determine qué oración debe ser eliminada del siguiente texto científico:
(I) La fotosíntesis oxigénica es el proceso bioquímico mediante el cual las plantas, algas y cianobacterias convierten la energía solar en energía química.  
(II) En la fase luminosa, los fotones excitan a los electrones en los fotosistemas I y II ubicados en las membranas tilacoidales del cloroplasto.  
(III) La fotólisis del agua rompe las moléculas de H_2O, liberando oxígeno gaseoso como subproducto y generando ATP y NADPH.  
(IV) Los precios internacionales de los fertilizantes nitrogenados han aumentado considerablemente debido a los conflictos geopolíticos mundiales.  
(V) En la fase oscura o ciclo de Calvin, el ATP y NADPH producidos fijan el dióxido de carbono (CO_2) para sintetizar glucosa.  
A) I  
B) II  
C) III  
D) IV  
E) V  

**Resolución Paso a Paso:**
1. Mapeamos el eje temático:
   - Oraciones I, II, III y V describen con rigor de biología celular y bioquímica las **fases moleculares de la fotosíntesis oxigénica** (fase luminosa, fotólisis del agua y ciclo de Calvin).
2. Analizamos la oración IV:
   - Trata sobre la economía internacional, el costo comercial de los fertilizantes inorgánicos y los conflictos geopolíticos.
3. Aunque los fertilizantes tienen que ver indirectamente con la agricultura, la oración IV rompe la naturaleza bioquímica microscópica del discurso.
4. Se elimina categóricamente por **impertinencia temática y de enfoque**.
**Respuesta:** D

---

---

### 3.2 El Tono del Autor: Glosario de Actitudes Discursivas
El tono es la "música" interior del texto. Saber calificar el tono permite al postulante resolver la pregunta más sutil de la prueba:

```
[TONO CRÍTICO / SEVERO]   ──▶  Juzga con rigor intelectual señalando deficiencias y errores.
[TONO ESCÉPTICO / CAUTO]   ──▶  Duda de verdades absolutas, exige pruebas y desconfía de optimismos ingenuos.
[TONO IRÓNICO / SARCÁSTICO]──▶  Usa el doble sentido burlesco para mofarse de una situación o personaje.
[TONO SOLEMNE / PROTOCOLAR]──▶  Lenguaje grave, formal, majestuoso y respetuoso propio de actos oficiales.
[TONO PANEGÍRICO / LAUDATORIO]▶ Alaba con entusiasmo desmedido las virtudes de alguien o algo.
[TONO ELEGÍACO / NOSTÁLGICO] ──▶  Lamenta con melancolía y tristeza una pérdida irreparable o el pasado ido.
[TONO BELIGERANTE / AGRESIVO]──▶  Confrontacional, violento en adjetivos, busca la colisión frontal abierta.
[TONO ASERTIVO / OBJETIVO] ──▶  Tranquilo, firme, fundamentado en hechos empíricos sin apasionamiento ciego.
```

### 3.3 El Deslinde entre Hecho, Opinión y Punto de Vista
1. **Hecho:** Suceso fáctico comprobable empíricamente por cualquier observador neutral (*"Arequipa se ubica a 2325 m s. n. m."*).
2. **Opinión:** Juicio subjetivo o estimación personal del autor que admite discrepancia (*"Arequipa posee el clima más agradable de la cordillera andina"*).
3. **Punto de Vista:** La postura articulada donde el autor selecciona determinados hechos para fundamentar su opinión de manera sistemática.

---

---

## 4. FORMULARIO MAESTRO DE ANÁLISIS DE LA INTENCIÓN

| Pregunta de Examen | Método de Rastreo Textual | Fórmula de Elección de Clave |
| :--- | :--- | :--- |
| *¿Cuál es el propósito central del autor?* | Localizar la Idea Principal y transformarla en infinitivo activo. | \text{Propósito} = \text{Verbo Infinitivo Rector} + \text{Idea Principal}. |
| *¿Qué tono predomina en el texto?* | Subrayar los 5 adjetivos y adverbios más cargados de valor del autor. | Si los adjetivos son burlescos \to *Irónico*. Si son de duda \to *Escéptico*. |
| *El autor asume una postura...* | Evaluar si defiende, ataca o se mantiene al margen del tema. | Opciones de polaridad: *Favorable, Contraria, Imparcial o Crítica*. |

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Radar V-I-P" (Propósito)
- **V**erbo en Infinitivo (Empieza siempre con *ar, er, ir*).
- **I**ntención Oculta (¿Qué quiere que yo haga o piense después de leer?).
- **P**ostura Central (¿A quién ataca o a quién apoya?).

### Mnemotecnia 2: "El Espejo de las Emociones" (Tono)
Mírate al espejo imaginando que tú escribiste ese texto:
- ¿Tienes las cejas fruncidas de enojo? \to Tono **indignado / crítico**.
- ¿Tienes una sonrisa burlona de lado? \to Tono **irónico / sarcástico**.
- ¿Tienes cara de sospecha rascándote la barbilla? \to Tono **escéptico**.
- ¿Tienes rostro inexpresivo de científico de bata blanca? \to Tono **neutro / objetivo**.

---

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: La Regla del "Verbo Inadecuado"
En preguntas de propósito principal:
- Si el texto defiende una postura apasionada con argumentos sólidos:
  - **Tacha de inmediato** opciones que comiencen con verbos neutros como: *"Describir"*, *"Narrar"* o *"Informar"*.
  - Busca opciones con verbos de combate intelectual: *"Demostrar"*, *"Rebatir"*, *"Persuadir"*, *"Defender"*, *"Postular"*.
- Si el texto es una enciclopedia aséptica sobre la mitosis celular:
  - **Tacha de inmediato** opciones que digan: *"Criticar la división celular"* o *"Condenar a los cromosomas"*.

### Hack 2: Descarte del Tono Extremo
En exámenes de admisión de la UNSA y UNMSM, rara vez la clave de tono es un extremo enfermizo como *"odio patológico"*, *"rabia irracional"* o *"fanatismo ciego"*, salvo que el texto sea un manifiesto delirante explícito. El lenguaje académico prefiere términos analíticos: *"mordaz"*, *"vehemente"*, *"severo"*, *"persuasivo"*.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "cl_t07_s02_c01",
                    question = "En el análisis DECO, el 'Tono del Autor' se define formalmente como:",
                    options = listOf(
                        "El volumen físico y la frecuencia acústica en decibeles con que el postulante realiza su lectura mental.",
                        "La velocidad cronometrada en palabras por minuto con la que se articula un discurso político formal.",
                        "El número de adjetivos abstractos que el corrector ortográfico del texto reemplazó por adverbios de modo.",
                        "La actitud emocional, afectiva o psicológica que el emisor proyecta hacia el tema que expone o hacia sus interlocutores.",
                    ),
                    correctIndex = 3,
                    explanation = "El tono textual refleja la dimensión subjetiva y afectiva del autor: ironía, indignación, entusiasmo, escepticismo, solemnidad, pesimismo o rigor neutral."
                ),
                Challenge(
                    id = "cl_t07_s02_c02",
                    question = "Por su parte, la 'Intención Comunicativa' (o propósito del autor) consiste en:",
                    options = listOf(
                        "El número de ejemplares impresos que la casa editorial aspira a vender en la feria anual del libro.",
                        "El deseo personal del autor de ser entrevistado en un programa televisivo de debate cultural.",
                        "El objetivo pragmático fundamental que persigue el texto: convencer, advertir, refutar, informar o conmover al lector.",
                        "La transcripción fidedigna de una conversación telefónica privada sin edición gramatical posterior.",
                    ),
                    correctIndex = 2,
                    explanation = "La intención es el para qué del texto: qué efecto comunicativo y persuasivo busca provocar el emisor en su auditorio o lector modelo."
                ),
                Challenge(
                    id = "cl_t07_s02_c03",
                    question = "Si un autor redacta: '¿De verdad pretendemos salvar los bosques amazónicos aprobando leyes que nadie fiscaliza y premiando a los taladores ilegales con impunidad vergonzosa?', su tono e intención son predominantemente:",
                    options = listOf(
                        "Tono eufórico y jubiloso; intención de celebrar los enormes éxitos de las entidades fiscalizadoras.",
                        "Tono frío y analítico; intención de medir con precisión milimétrica la tasa de deforestación anual.",
                        "Tono resignado y melancólico; intención de enseñar botánica básica a los estudiantes secundarios.",
                        "Tono cáustico e indignado; intención de denunciar y criticar la hipocresía en las políticas ambientales.",
                    ),
                    correctIndex = 3,
                    explanation = "Las preguntas retóricas y vocablos como 'impunidad vergonzosa' e 'hipocresía' revelan cólera moral (tono cáustico/indignado) con la finalidad de remecer la conciencia y fustigar la inacción estatal (denuncia)."
                ),
                Challenge(
                    id = "cl_t07_s02_c04",
                    question = "Un texto que expone meticulosamente los datos de un informe epidemiológico sin adjetivar ni formular juicios morales ostenta un tono:",
                    options = listOf(
                        "Objetivo, aséptico y neutral.",
                        "Nostálgico, melancólico y apesadumbrado.",
                        "Fanático, beligerante e irracional.",
                        "Sarcástico, burlón e irreverente.",
                    ),
                    correctIndex = 0,
                    explanation = "La ausencia de léxico valorativo y la primacía de datos empíricos contrastados configuran un tono científico objetivo, caracterizado por la neutralidad expositiva."
                ),
                Challenge(
                    id = "cl_t07_s02_c05",
                    question = "Cuando un autor recurre al 'Sarcasmo' en un artículo de opinión, su estrategia discursiva consiste en:",
                    options = listOf(
                        "Ocultar deliberadamente su tesis para evitar que los lectores descubran sus intenciones políticas.",
                        "Utilizar un vocabulario arcaico propio de los cantares de gesta de la Edad Media europea.",
                        "Emplear una ironía mordaz y punzante para ridiculizar una conducta, postura o argumento que juzga absurdo.",
                        "Escribir oraciones incompletas utilizando únicamente signos de interrogación y admiración.",
                    ),
                    correctIndex = 2,
                    explanation = "El sarcasmo es la ironía en su grado más hiriente: busca poner en evidencia la ridiculez o inconsistencia del adversario a través de la burla inteligente y afilada."
                ),
                Challenge(
                    id = "cl_t07_s02_c06",
                    question = "Si el artículo culmina con: 'Aún estamos a tiempo de evitar la extinción masiva de nuestras cuencas si implementamos hoy un plan integral de ordenamiento territorial', la intención principal es:",
                    options = listOf(
                        "Exhortar y persuadir a los decisores y a la sociedad a emprender acciones inmediatas de mitigación.",
                        "Reclamar la autoría intelectual exclusiva sobre las leyes biológicas del ciclo hidrológico mundial.",
                        "Publicar las tarifas de cobro para las consultorías ambientales dedicadas al ordenamiento de cuencas.",
                        "Constatar con resignación y apatía que toda acción humana es inútil frente a las fuerzas cósmicas.",
                    ),
                    correctIndex = 0,
                    explanation = "El llamado imperativo ('aún estamos a tiempo', 'implementamos hoy') es característico del discurso exhortativo, cuyo propósito cardinal es conmover la voluntad para la acción."
                ),
                Challenge(
                    id = "cl_t07_s02_c07",
                    question = "¿Cómo se identifica formalmente un tono 'Polemista' o 'Beligerante' en un ensayo filosófico o político?",
                    options = listOf(
                        "Por la narración pacífica y descriptiva de las costumbres gastronómicas de una comunidad campesina.",
                        "Por la recurrencia de contraargumentos firmes, refutaciones frontales de adversarios y un léxico combativo.",
                        "Por la constante duda escéptica que se abstiene de afirmar o negar cualquier enunciado posible.",
                        "Por la inclusión exclusiva de citas bíblicas desprovistas de cualquier comentario analítico.",
                    ),
                    correctIndex = 1,
                    explanation = "El tono polemista se distingue por confrontar tesis rivales con vehemencia, utilizando un aparato conceptual orientado al desmontaje riguroso de las posturas contrarias."
                ),
                Challenge(
                    id = "cl_t07_s02_c08",
                    question = "Si un autor aborda el descubrimiento de una nueva partícula elemental señalando que 'los datos son fascinantes, pero conviene aguardar confirmación en laboratorios independientes', el tono es:",
                    options = listOf(
                        "Cínico, resentido y desconfiado.",
                        "Triunfalista, soberbio y dogmático.",
                        "Desesperado, caótico y desordenado.",
                        "Cauteloso, escéptico y prudente.",
                    ),
                    correctIndex = 3,
                    explanation = "Reconocer el valor preliminar sin darlo por seguro e invocar la necesidad de replicación experimental denota la actitud prudente y metodológicamente cauta del quehacer científico."
                ),
                Challenge(
                    id = "cl_t07_s02_c09",
                    question = "En las preguntas sobre 'Propósito Fundamental del Texto', los distractores suelen pecar de:",
                    options = listOf(
                        "Estar redactados en dialectos extranjeros incomprensibles para la comunidad hispanohablante.",
                        "Presentar siempre errores ortográficos visibles en la concordancia de participios irregulares.",
                        "Ser demasiado estrechos (aludir a un detalle secundario) o excesivamente genéricos (perder el foco específico del tema).",
                        "Incluir fórmulas de geometría euclidiana que desorientan al postulante en el área de letras.",
                    ),
                    correctIndex = 2,
                    explanation = "Las trampas en preguntas de propósito radican en seleccionar una intención tangencial (un ejemplo del párrafo 2) o una generalización vaga que no capta el núcleo argumentativo central."
                ),
                Challenge(
                    id = "cl_t07_s02_c10",
                    question = "Cuando un autor expresa: 'Lamentablemente, asistimos al ocaso irreversible de las lenguas amazónicas ancestrales sin que a casi nadie le conmueva', el tono dominante es:",
                    options = listOf(
                        "Alborozado, optimista y festivo.",
                        "Técnico, desapasionado e insensible.",
                        "Pesaroso, elegíaco y consternado.",
                        "Irreverente, burlesco y satírico.",
                    ),
                    correctIndex = 2,
                    explanation = "El adverbio 'lamentablemente' y la noción de 'ocaso irreversible' proyectan dolor moral y pesadumbre (tono elegíaco/pesaroso) ante la pérdida irremediable del patrimonio lingüístico."
                ),
            )
        )
    )
}
