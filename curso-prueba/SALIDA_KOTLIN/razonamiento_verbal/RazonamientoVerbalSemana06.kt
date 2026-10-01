package razonamiento_verbal

object RazonamientoVerbalSemana06 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t06_s01",
            subjectId = "razonamiento_verbal",
            semana = 6,
            subtema = "6.1",
            title = "3.1 Presuposiciones vs. Implicaturas",
            theory = LessonTheory(
                content = """# TEMA VI: Pragmática en Enunciados

---



### Matriz de Indicadores de Logro Evaluados
1. **Intención comunicativa del emisor:** Identificar el propósito ilocutivo real (persuadir, advertir, ordenar, disculpar, ironizar) detrás de la apariencia gramatical neutra.
2. **Presuposiciones lingüísticas:** Descubrir las informaciones previas asumidas como verdaderas e incuestionables para que el enunciado tenga sentido.
3. **Implicaturas conversacionales (Grice):** Deducir el significado encubierto que se transmite al transgredir voluntariamente una máxima conversacional (ironía, atenuación, metáfora).
4. **Deslinde explícito vs. implícito:** Distinguir con rigor epistemológico los hechos literalmente manifestados de las deducciones necesarias del contexto situacional.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        PRAGMÁTICA LINGÜÍSTICA
                                  │
         ┌────────────────────────┼────────────────────────┐
         ▼                        ▼                        ▼
   ACTOS DE HABLA          LO NO DICHO             EL SENTIDO FIGURADO
  (Austin y Searle)      (Nivel Implícito)          (Metáfora / Ironía)
         │                        │                        │
   ┌─────┼─────┐            ┌─────┴─────┐            ┌─────┴─────┐
   ▼     ▼     ▼            ▼           ▼            ▼           ▼
Locutivo Ilocutivo Perlocutivo Presuposición Implicatura  Sentido   Sentido
(Lo que  (Lo que   (Efecto   (Dato previo   (Significado  Literal  Traslaticio
 dice)   hace)     logrado)  innegociable) contextual     (Denot.) (Connotat.)
                                            deducible)
```



### Ontología de la Pragmática
- **Pragmática:** Disciplina de la lingüística que estudia el lenguaje en su relación con los usuarios y las circunstancias concretas de la comunicación (contexto extralingüístico).
- **Enunciado vs. Oración:** Una oración es una estructura sintáctica abstracta; un enunciado es la actualización viva de una oración emitida por un hablante concreto en un espacio y tiempo determinados.
- **Acto Locutivo:** La emisión física de palabras con significado literal gramatical.
- **Acto Ilocutivo:** La fuerza o acción que se ejecuta al hablar (prometer, amenazar, rogar, felicitar).
- **Acto Perlocutivo:** El efecto psicológico o conductual que el enunciado genera en el oyente (convencer, asustar, ofender).

---



### 3.1 Presuposiciones vs. Implicaturas

| Parámetro | Presuposición | Implicatura Conversacional |
| :--- | :--- | :--- |
| **Definición** | Información implícita incrustada en la estructura lingüística de la oración que se asume como verdadera antes de emitirla. | Información adicional que el receptor deduce evaluando el contexto y la transgresión de máximas de diálogo. |
| **Prueba de la Negación** | **Resiste la negación.** Si niegas la oración, la presuposición sigue intacta. | **No resiste la negación formal.** Desaparece o muta radicalmente. |
| **Ejemplo** | *"Carlos dejó de fumar"* \to Presuposición: *Carlos fumaba antes*. (Si decimos *"Carlos no dejó de fumar"*, ¡sigue siendo cierto que fumaba!). | *"¿Vamos al cine hoy? —Tengo que rendir el examen de Ceprunsa mañana"* \to Implicatura: *No puedo ir al cine*. |
| **Activadores Léxicos** | Verbos de cambio de estado (*dejar, empezar, continuar*), verbos factivos (*lamentar, saber*). | Violación calculada de las máximas del Principio de Cooperación de Grice. |



### 3.3 Sentido Literal (Denotativo) vs. Sentido Figurado (Connotativo)
- **Sentido Literal:** Significado estricto, canónico y libre de traslaciones metafóricas (*"El corazón bombea sangre"*).
- **Sentido Figurado:** Desplazamiento semántico que utiliza la analogía, la metonimia o la hipérbole para enriquecer la expresividad (*"Ese médico tiene un corazón de oro"* \to significa que es sumamente compasivo y bondadoso).

---



## 4. FORMULARIO MAESTRO DE ANÁLISIS PRAGMÁTICO

| Herramienta Pragmática | Algoritmo de Detección | Aplicación en Examen de Admisión |
| :--- | :--- | :--- |
| **Fuerza Ilocutiva Directa** | Coincidencia entre forma y función | Una orden formulada como imperativo: *"¡Cierra la puerta!"*. |
| **Fuerza Ilocutiva Indirecta** | Discrepancia entre forma y función | Una orden formulada como pregunta de cortesía: *"¿Podrías cerrar la puerta?"* (No consulta la capacidad física, exige la acción). |
| **Prueba de Cancelabilidad** | Rasgo distintivo de la implicatura | Una implicatura puede cancelarse explícitamente sin contradicción (*"Tengo examen mañana, pero igual iré al cine"*). |
| **Foco de Presuposición** | Elementos como *incluso*, *también*, *hasta* | *"Hasta Pedro aprobó"* \implies Presupone que Pedro era el menos capacitado o el más reacio a aprobar. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 2: "El Semáforo de la Presuposición"
- Pregúntate: *Si le pongo "NO" al verbo principal, ¿la idea del fondo sigue siendo verdad?*
  - *"María lamenta haber perdido la billetera"*.
  - *"María NO lamenta haber perdido la billetera"*.
  - En ambos casos: **¡Perdió la billetera!** Esa es la presuposición inexpugnable.

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 1: Decodificación de la Ironía en Textos de Admisión
En textos donde un autor utiliza un tono socarrón o satírico:
1. Detecta la palabra excesivamente elogiosa que choca violentamente con la realidad descrita (ejemplo: llamar *"preclaro estadista"* a un tirano corrupto).
2. Invierte el valor semántico al 180°: el autor quiere decir exactamente lo opuesto de lo que está escrito literalmente.
3. En las alternativas, busca opciones que contengan verbos de censura: *criticar, censurar, fustigar, reprochar o satirizar*.



### Hack 2: Aislamiento de la Pregunta Trampa Pragmática
Preguntas del tipo: *"¿Sigues engañando a tus socios en la empresa?"*:
- Si respondes "SÍ" \to Aceptas que los engañas hoy.
- Si respondes "NO" \to Aceptas que los engañabas antes.
- **HACK:** La pregunta encierra una **presuposición forzada**. En el examen, identifícala como una falacia de pregunta compleja orientada a condicionar una admisión de culpabilidad previa.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir lo Implícito con lo Extrapolado o Fantaseado**
> Una deducción pragmática implícita **DEBE emanar necesariamente de las pistas contextuales del texto**.
> Si el texto dice: *"El paciente ingresó a la sala de emergencias a las 3:00 a.m. con el brazo vendado y gesto de dolor"*, lo implícito necesario es que el paciente sufrió una lesión física reciente.
> Lo fantaseado (distractor de examen): *"El paciente se cayó de una motocicleta porque iba a excesiva velocidad"*. ¡El texto no aporta ningún dato sobre motocicletas ni velocidades! No confundas inferencia legítima con invención.

> [!CAUTION]
> **Trampa 2: La Metáfora tomada en Sentido Denotativo Literal**
> Si en un diálogo literario un personaje dice: *"Se me cayó el alma a los pies al escuchar la noticia"*, marcar como alternativa que el personaje sufrió una caída física o un desmayo con daño anatómico es el clásico distractor literal para postulantes distraídos.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Identificación de la Intención Comunicativa)
**Enunciado:** En una calurosa tarde de verano, un comensal en un restaurante le dice al mozo:
*"Disculpe, ¿sabe si la ventana del fondo puede abrirse?"*
Pragmáticamente, el acto de habla emitido por el comensal constituye:
A) Una consulta técnica sobre la mecánica de los marcos de aluminio.  
B) Un acto locutivo sin fuerza perlocutiva.  
C) Una petición indirecta de cortesía para que se abra la ventana y se ventile el local.  
D) Una queja formal contra la administración del restaurante.  
E) Una felicitación por la arquitectura del establecimiento.  

**Resolución Paso a Paso:**
1. Analizamos la forma locutiva gramatical: Es una oración interrogativa indirecta sobre el conocimiento del mozo (*"¿sabe si...?"*).
2. Analizamos el contexto situacional: Ambiente caluroso, comensal sofocado en un comedor.
3. El comensal no tiene como meta averiguar los conocimientos de cerrajería del mozo; utiliza una fórmula de cortesía social (fuerza ilocutiva indirecta) para solicitar que se abra la ventana sin sonar autoritario o descortés.
4. Por ende, la intención comunicativa real es una **petición o solicitud indirecta de ventilación**.
**Respuesta:** C

---



### Ejercicio 2 (Nivel Intermedio: Detección de Presuposición)
**Enunciado (Modelo Admisión UNSA):** En el siguiente titular de prensa:
*"El nuevo ministro de Economía admitió que la inflación no podrá ser controlada este año."*
¿Cuál de las siguientes proposiciones constituye una **presuposición lingüística incuestionable** del enunciado?
A) La inflación bajará el próximo año.  
B) Existe un proceso inflacionario en curso en la economía.  
C) El ministro será destituido de inmediato por el presidente.  
D) Los ciudadanos aprueban la gestión del gabinete ministerial.  
E) La inflación es provocada por factores externos internacionales.  

**Resolución Paso a Paso:**
1. Identificamos el verbo rector del enunciado: el verbo factivo *"admitir"*.
2. El uso de *admitir* ("admitió que X") presupone que el contenido subordinado no es una fantasía o hipótesis, sino un hecho verídico que ya está ocurriendo en la realidad.
3. Además, hablar de "controlar la inflación" presupone forzosamente que el fenómeno de la inflación ya existe de antemano; no se puede intentar controlar algo que no está presente.
4. Si aplicamos la prueba de la negación: *"El nuevo ministro de Economía NO admitió que la inflación no podrá ser controlada este año"* \implies Sigue siendo un hecho indudable que la inflación existe.
5. Por lo tanto, la presuposición obligatoria es que **existe un proceso inflacionario real en curso**.
**Respuesta:** B

---



### Ejercicio 4 (Nivel Avanzado DECO: Interpretación de Sentido Figurado e Ironía)
**Enunciado (Tipo San Marcos DECO / UNSA):** En una columna de crítica cultural sobre la televisión contemporánea, se lee:
*"El nuevo programa dominical de concursos es un verdadero manantial inagotable de sabiduría humanística: en apenas dos horas de transmisión, los televidentes fuimos iluminados con profundos debates sobre qué participante tenía el corte de cabello más extravagante y qué pareja de la farándula se había dejado de seguir en Instagram."*
¿Cuál es el sentido contextual y la intención comunicativa predominante en el texto anterior?
A) Elogiar con rigor la labor pedagógica y académica de la televisión comercial dominical.  
B) Describir objetivamente las reglas técnicas de los concursos de farándula contemporánea.  
C) Demostrar que las redes sociales constituyen el objeto primordial de estudio de la filosofía.  
D) Criticar y satirizar mediante la ironía el carácter frívolo, banal y superficial del programa de televisión.  
E) Promover la masificación de los programas dominicales en los colegios de secundaria.  

**Resolución Paso a Paso:**
1. Desglosamos los elementos léxicos en tensión:
   - Expresiones solemnes y elevadas: *"manantial inagotable de sabiduría humanística"*, *"fuimos iluminados con profundos debates"*.
   - Realidad descrita: Cortes de cabello extravagantes y chismes de redes sociales de celebridades locales (*Instagram*).
2. Existe un abismo evidente entre los elogios mayúsculos y la absoluta intrascendencia cultural de los hechos expuestos.
3. El autor transgrede conscientemente la máxima de cualidad para construir una **ironía sarcástica**.
4. Su auténtica intención comunicativa es denunciar y mofarse de la vacuidad y frivolidad de los contenidos del programa televisivo.
5. La opción D traduce con absoluta lucidez crítica dicha postura.
**Respuesta:** D

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación Rigurosa de lo Explícito vs. Implícito)
**Enunciado (Nivel UNI / Máxima Exigencia):** Lea con detenimiento el siguiente reporte médico-legal:
*"El fiscal provincial de turno y el médico legista levantaron el acta respectiva en la ribera del río Chili a las 06:30 horas. El cuerpo no presentaba rigidez cadavérica (rigor mortis) ni livideces hipostáticas fijas en el plano dorsal. La temperatura rectal se mantuvo en 36.2 °C al momento de la intervención pericial, a pesar de que la temperatura ambiental era de 7.0 °C. Asimismo, no se hallaron signos de sumersión vital (hongo de espuma en vías respiratorias ausente y ausencia total de agua en cavidad gástrica o pleural), registrándose una herida punzocortante penetrante en el hemitórax izquierdo a nivel del quinto espacio intercostal."*
A partir del informe pericial y las leyes de la tanatología forense, ¿cuál de las siguientes conclusiones se desprende como una **inferencia implícita lógicamente necesaria**, distinguiéndola de los hechos explícitos?
A) El sujeto falleció producto de una caída accidental al cauce del río Chili.  
B) El deceso se produjo por asfixia mecánica provocada por sumersión líquida en el río.  
C) La persona fue asesinada en un lugar distinto al río y arrojada al agua pocos minutos antes de la intervención fiscal.  
D) El arma utilizada fue un puñal artesanal de acero inoxidable de diez centímetros.  
E) Los peritos tardaron más de veinticuatro horas en llegar a la ribera del río.  

**Resolución Paso a Paso:**
1. Analizamos la evidencia pericial explícita (datos brutos):
   - Temperatura corporal: 36.2^\circ C con ambiente a 7^\circ C. No hay enfriamiento cadavérico significativo ni *rigor mortis*. \implies Inferencia: **La muerte es sumamente reciente** (ocurrida hace muy pocos minutos respecto a la hora del hallazgo).
   - Signos de sumersión: Hongo de espuma ausente y vías respiratorias/cavidad gástrica limpias de agua. \implies Inferencia tanatológica: **El individuo NO murió ahogado** en el río (sumersión post mórtem o el cuerpo no aspiró agua viva).
   - Lesión: Herida penetrante en quinto espacio intercostal izquierdo (región precordial cardíaca). \implies Inferencia: **Muerte traumática por arma blanca que perforó el miocardio**.
2. Evaluamos la integración lógica de las inferencias:
   - Si no murió ahogado, murió por la herida punzocortante.
   - Si su temperatura aún era de 36.2^\circ C pese al frío andino del agua y aire de Arequipa a las 6:30 a.m., y el cuerpo estaba en el río, no estuvo sumergido durante horas; el hecho violento ocurrió instantes antes o fue depositado inmediatamente después del ataque.
3. Descartamos las opciones:
   - A y B chocan con la ausencia de signos de sumersión vital.
   - D es una invención (no se sabe el metal ni la longitud exacta del arma).
   - E choca con la temperatura de 36.2^\circ C.
   - C sintetiza con rigor forense que la causa de muerte no fue el río y que el deceso y traslado ocurrieron en una ventana temporal inmediata a la intervención.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Pragmática:** Estudio de cómo el contexto social y situacional influye en la interpretación del significado lingüístico.
2. **Acto Locutivo:** Emisión lingüística de sonidos, palabras y oraciones con significado literal referencial.
3. **Acto Ilocutivo:** Acción comunicativa intencional ejecutada mediante la emisión verbal (promesa, orden, bautizo).
4. **Acto Perlocutivo:** Efecto psicológico, emocional o conductual producido de facto en el interlocutor.
5. **Presuposición:** Suposición previa e incuestionable requerida por la estructura sintáctica de un enunciado.
6. **Implicatura:** Significado tácito que se infiere pragmáticamente más allá de lo dicho literalmente.
7. **Principio de Cooperación:** Supuesto tácito formulado por Grice que rige la interacción conversacional racional.
8. **Ironía Pragmática:** Figura retórica que consiste en dar a entender lo contrario de lo que se dice mediante la transgresión de la verdad.
9. **Sentido Figurado:** Empleo connotativo del lenguaje basado en traslaciones analógicas y asociaciones metafóricas.
10. **Contexto Situacional:** Entorno físico, cultural y temporal que rodea y dota de sentido a la comunicación viva.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué prueba permite saber si una idea es una presuposición o una simple afirmación?**  
  **A:** La prueba de la negación: si al negar la oración principal la idea sigue considerándose verdadera, es una presuposición.
- **Q: ¿Qué máxima de Grice se transgrede cuando un hablante miente a sabiendas o ironiza?**  
  **A:** La máxima de Cualidad (que exige no afirmar falsedades ni proposiciones sin evidencia).
- **Q: ¿Cuál es la diferencia entre el acto ilocutivo y el acto perlocutivo?**  
  **A:** El ilocutivo es lo que el emisor *hace al hablar* (su intención); el perlocutivo es la *reacción que logra* en el receptor.
- **Q: En la oración "¿Podrías pasarme la sal?", ¿cuál es su fuerza ilocutiva real?**  
  **A:** Es una petición u orden atenuada por cortesía, no una pregunta sobre la capacidad psicomotriz del brazo del receptor.
- **Q: ¿Por qué la ironía exige un contexto compartido para ser comprendida?**  
  **A:** Porque sin un conocimiento del contexto situacional y de la intención del emisor, el mensaje se interpretará erróneamente en su sentido literal falso.

---



### 3.2 El Principio de Cooperación y las Máximas de H. P. Grice
Para que una conversación sea exitosa, los hablantes respetan tácitamente cuatro máximas fundamentales:
1. **Máxima de Cantidad:** Haz que tu contribución sea tan informativa como sea necesario (ni más ni menos información).
2. **Máxima de Cualidad (Verdad):** No digas lo que creas falso ni aquello de lo que carezcas de pruebas suficientes.
3. **Máxima de Relación (Pertinencia):** Sé pertinente; no te desvíes del tema de discusión.
4. **Máxima de Modo (Claridad):** Sé claro, ordenado, breve y evita la ambigüedad y la oscuridad de expresión.

#### ¿Cómo nace la Implicatura?
Cuando un hablante **viola abiertamente** una máxima sin romper el diálogo, obliga al oyente a buscar un segundo sentido:
- *Ejemplo de Ironía (Violación de Cualidad):* Tras romper un vaso de cristal, la madre le dice a su hijo: *"¡Qué inteligente eres!"*.
  - Literalmente afirma que es inteligente.
  - Pragmáticamente (implicatura): Le recrimina con sarcasmo su evidente torpeza.



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la diplomacia internacional y la geopolítica (negociaciones de tratados de paz en la ONU), los cancilleres rara vez utilizan un lenguaje locutivo directo y agresivo; emplean fórmulas pragmáticas de cortesía atenuada (*"Mi gobierno ve con profunda preocupación las maniobras navales en la frontera"* \to Implicatura: *"Retiren sus buques inmediatamente o iniciaremos una confrontación militar"*). Igualmente, en los sistemas de procesamiento de lenguaje natural de asistentes virtuales (Siri, Alexa, ChatGPT), la ingeniería de *Prompting* y pragmática computacional permite a la IA entender que la frase *"Tengo frío"* dicha por el usuario en una habitación inteligente significa la orden perlocutiva de encender la calefacción.

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Implicatura Conversacional de Grice)
**Enunciado:** Analice el siguiente diálogo cotidiano:
- **Papá:** *"¿Qué tal le fue a tu hermano menor en su primer simulacro de admisión para Medicina en la UNSA?"*
- **Hijo mayor:** *"Bueno... por lo menos escribió su nombre y apellido completos sin faltas ortográficas en la ficha óptica."*
A partir del Principio de Cooperación de Grice, ¿qué implicatura conversacional se deduce de la respuesta del hijo mayor?
A) Que su hermano menor obtuvo el cómputo general en el examen.  
B) Que el examen de admisión no contenía preguntas de medicina.  
C) Que el hermano menor obtuvo un puntaje extremadamente bajo o deficiente en la prueba.  
D) Que la ficha óptica del examen estaba rota o deteriorada.  
E) Que el hermano menor es un destacado calígrafo profesional.  

**Resolución Paso a Paso:**
1. Analizamos la pregunta del padre: Indaga sobre el rendimiento académico integral en un simulacro de alta exigencia (Medicina Humana).
2. Evaluamos la respuesta del hermano mayor: En vez de responder con una cifra o nivel de rendimiento, resalta un dato trivial e insignificante (escribir su nombre sin faltas ortográficas).
3. El hijo mayor viola intencionalmente la **máxima de cantidad** (da información ridículamente irrelevante para el nivel del examen).
4. El recurso al eufemismo o ironía piadosa revela que el único mérito rescatable fue rellenar sus datos personales, lo que comunica de forma implícita que en el contenido de las preguntas académicas su desempeño fue desastroso.
5. Por ende, la implicatura conversacional deductiva es que **obtuvo un puntaje sumamente bajo y deficiente**.
**Respuesta:** C

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t06_s01_c01",
                    question = "En la pragmática y la filosofía del lenguaje, una 'Presuposición' se define formalmente como:",
                    options = listOf(
                        "Una metáfora poética que el lector debe memorizar.",
                        "Un supuesto semántico que debe ser necesariamente verdadero o asumido de antemano para que el enunciado tenga sentido y pueda evaluarse como verdadero o falso.",
                        "Una falta ortográfica que altera la pronunciación de las palabras.",
                        "La traducción literal de un modismo extranjero.",
                    ),
                    correctIndex = 1,
                    explanation = "La presuposición es una proposición implícita cuya verdad se asume como previa y aceptada para que la oración emitida sea lógicamente admisible y computable."
                ),
                Challenge(
                    id = "rv_t06_s01_c02",
                    question = "En el enunciado: 'Juan dejó de fumar el mes pasado', la presuposición lógica necesaria e ineludible que subyace al mensaje es:",
                    options = listOf(
                        "Fumar es una actividad social saludable.",
                        "Juan es médico especialista en neumología.",
                        "Juan fumaba con anterioridad.",
                        "Juan comenzará a fumar en el futuro.",
                    ),
                    correctIndex = 2,
                    explanation = "El verbo de cambio de estado 'dejar de' presupone necesariamente como hecho fáctico que la acción que se detuvo se ejecutaba antes de ese momento."
                ),
                Challenge(
                    id = "rv_t06_s01_c03",
                    question = "La 'Prueba de la Negación' es la técnica clásica para identificar presuposiciones lingüísticas porque:",
                    options = listOf(
                        "Convierte automáticamente las oraciones afirmativas en poemas líricos.",
                        "Al negar el verbo principal de la oración, las presuposiciones siguen manteniéndose indemnes y verdaderas ('Juan NO dejó de fumar' sigue presuponiendo que Juan fumaba).",
                        "Elimina las tildes diacríticas de todos los pronombres.",
                        "Demuestra que el emisor está mintiendo deliberadamente.",
                    ),
                    correctIndex = 1,
                    explanation = "A diferencia de las consecuencias lógicas (implicaciones) que cambian con la negación, la presuposición sobrevive intacta tanto a la negación como a la interrogación del enunciado."
                ),
                Challenge(
                    id = "rv_t06_s01_c04",
                    question = "A diferencia de la presuposición, una 'Implicatura Conversacional' (concepto formulado por H. P. Grice) se caracteriza por ser:",
                    options = listOf(
                        "Un significado no explícito que el receptor infiere o deduce a partir del contexto, el conocimiento compartido y la asunción de que el emisor respeta el principio de cooperación.",
                        "Un dato numérico exacto publicado en el diario oficial.",
                        "Una orden militar imperativa e indiscutible.",
                        "Una regla gramatical sobre el uso correcto de las letras 'b' y 'v'.",
                    ),
                    correctIndex = 0,
                    explanation = "La implicatura es el sentido sugerido o comunicado implícitamente más allá de lo dicho literalmente, descifrado contextualmente por el oyente."
                ),
                Challenge(
                    id = "rv_t06_s01_c05",
                    question = "Considere el siguiente diálogo breve: —María: '¿Vamos al cine esta noche?' —Pedro: 'Mañana rindo mi examen final de admisión'. La implicatura conversacional de la respuesta de Pedro es:",
                    options = listOf(
                        "Pedro es el dueño de la sala de cine del centro comercial.",
                        "Pedro rechaza la invitación al cine porque debe quedarse a estudiar para su examen.",
                        "Pedro tiene muchas ganas de ir al cine de inmediato.",
                        "El examen final fue cancelado por el rector universitario.",
                    ),
                    correctIndex = 1,
                    explanation = "Pedro no dice 'no', pero al enunciar un hecho incompatible con salir de fiesta (rendir un examen trascendental al día siguiente), el oyente infiere la negativa implícita."
                ),
                Challenge(
                    id = "rv_t06_s01_c06",
                    question = "En la oración interrogativa: '¿Lamentas haber renunciado a tu antiguo empleo?', la presuposición lingüística es:",
                    options = listOf(
                        "El interlocutor renunció efectivamente a su antiguo empleo.",
                        "El interlocutor planea demandar a la empresa judicialmente.",
                        "El interlocutor nunca tuvo un empleo formal.",
                        "El antiguo empleo era el mejor remunerado del país.",
                    ),
                    correctIndex = 0,
                    explanation = "El verbo de actitud proposicional factiva 'lamentar' presupone la verdad objetiva de la cláusula subordinada (que el sujeto renunció efectivamente al empleo)."
                ),
                Challenge(
                    id = "rv_t06_s01_c07",
                    question = "Las implicaturas 'convencionales' se diferencian de las implicaturas 'conversacionales' porque:",
                    options = listOf(
                        "Ambas formas son idénticas en todas sus dimensiones lingüísticas.",
                        "Las conversacionales no pueden ser comprendidas por hablantes nativos.",
                        "Las convencionales derivan directamente del significado léxico de ciertas palabras (como 'pero' o 'incluso') y no dependen del contexto de la conversación.",
                        "Las convencionales solo se usan en asambleas legislativas.",
                    ),
                    correctIndex = 2,
                    explanation = "La implicatura convencional está ligada a partículas léxicas concretas (ej. 'Era pobre pero honrado' implica convencionalmente por el 'pero' que la pobreza suele asociarse a la deshonestidad)."
                ),
                Challenge(
                    id = "rv_t06_s01_c08",
                    question = "Cuando un anfitrión en una reunión social mira repetidamente su reloj de pulsera y exclama en voz alta: '¡Vaya, qué rápido se ha hecho medianoche!', el sentido inferido pragmáticamente es:",
                    options = listOf(
                        "Que la reunión social debe concluir y los invitados deberían comenzar a despedirse.",
                        "Que comenzará a preparar una cena de seis platos para todos.",
                        "Que su reloj necesita cambio urgente de batería.",
                        "Que desconoce las fases lunares del calendario astronómico.",
                    ),
                    correctIndex = 0,
                    explanation = "El acto de habla indirecto y la implicatura contextual comunican sutil y cortésmente a los invitados que es hora de marcharse."
                ),
                Challenge(
                    id = "rv_t06_s01_c09",
                    question = "¿Cuál de las siguientes expresiones contiene un 'activador presuposicional' de iteración o repetición?",
                    options = listOf(
                        "Carlos volvió a perder las llaves de su departamento.",
                        "Carlos viajó a Huancayo por primera vez.",
                        "Carlos compró un automóvil nuevo.",
                        "Carlos estudia ingeniería civil en la universidad.",
                    ),
                    correctIndex = 0,
                    explanation = "La locución perifrástica 'volvió a' presupone necesariamente que el hecho de perder las llaves ya había ocurrido en ocasiones anteriores."
                ),
                Challenge(
                    id = "rv_t06_s01_c10",
                    question = "El estudio de la pragmática en la comprensión de textos preuniversitaria es crucial porque enseña al postulante a:",
                    options = listOf(
                        "Memorizar el árbol genealógico de las lenguas romances.",
                        "Distinguir con nitidez entre lo dicho explícitamente (sentido literal) y lo comunicado implícitamente a través de intenciones, presupuestos y contextos comunicativos.",
                        "Contar meticulosamente las palabras de cada párrafo.",
                        "Aceptar como válida cualquier interpretación subjetiva sin sustento textual.",
                    ),
                    correctIndex = 1,
                    explanation = "La competencia pragmática permite decodificar las intenciones reales del emisor, detectando ironías, presupuestos, dobles sentidos y propósitos discursivos encubiertos."
                ),
            )
        ),
        LessonNode(
            id = "rv_t06_s02",
            subjectId = "razonamiento_verbal",
            semana = 6,
            subtema = "6.2",
            title = "3.2 El Principio de Cooperación y las Máximas de H. P. Grice",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Intención comunicativa del emisor:** Identificar el propósito ilocutivo real (persuadir, advertir, ordenar, disculpar, ironizar) detrás de la apariencia gramatical neutra.
2. **Presuposiciones lingüísticas:** Descubrir las informaciones previas asumidas como verdaderas e incuestionables para que el enunciado tenga sentido.
3. **Implicaturas conversacionales (Grice):** Deducir el significado encubierto que se transmite al transgredir voluntariamente una máxima conversacional (ironía, atenuación, metáfora).
4. **Deslinde explícito vs. implícito:** Distinguir con rigor epistemológico los hechos literalmente manifestados de las deducciones necesarias del contexto situacional.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        PRAGMÁTICA LINGÜÍSTICA
                                  │
         ┌────────────────────────┼────────────────────────┐
         ▼                        ▼                        ▼
   ACTOS DE HABLA          LO NO DICHO             EL SENTIDO FIGURADO
  (Austin y Searle)      (Nivel Implícito)          (Metáfora / Ironía)
         │                        │                        │
   ┌─────┼─────┐            ┌─────┴─────┐            ┌─────┴─────┐
   ▼     ▼     ▼            ▼           ▼            ▼           ▼
Locutivo Ilocutivo Perlocutivo Presuposición Implicatura  Sentido   Sentido
(Lo que  (Lo que   (Efecto   (Dato previo   (Significado  Literal  Traslaticio
 dice)   hace)     logrado)  innegociable) contextual     (Denot.) (Connotat.)
                                            deducible)
```



### Ontología de la Pragmática
- **Pragmática:** Disciplina de la lingüística que estudia el lenguaje en su relación con los usuarios y las circunstancias concretas de la comunicación (contexto extralingüístico).
- **Enunciado vs. Oración:** Una oración es una estructura sintáctica abstracta; un enunciado es la actualización viva de una oración emitida por un hablante concreto en un espacio y tiempo determinados.
- **Acto Locutivo:** La emisión física de palabras con significado literal gramatical.
- **Acto Ilocutivo:** La fuerza o acción que se ejecuta al hablar (prometer, amenazar, rogar, felicitar).
- **Acto Perlocutivo:** El efecto psicológico o conductual que el enunciado genera en el oyente (convencer, asustar, ofender).

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.2 El Principio de Cooperación y las Máximas de H. P. Grice
Para que una conversación sea exitosa, los hablantes respetan tácitamente cuatro máximas fundamentales:
1. **Máxima de Cantidad:** Haz que tu contribución sea tan informativa como sea necesario (ni más ni menos información).
2. **Máxima de Cualidad (Verdad):** No digas lo que creas falso ni aquello de lo que carezcas de pruebas suficientes.
3. **Máxima de Relación (Pertinencia):** Sé pertinente; no te desvíes del tema de discusión.
4. **Máxima de Modo (Claridad):** Sé claro, ordenado, breve y evita la ambigüedad y la oscuridad de expresión.

#### ¿Cómo nace la Implicatura?
Cuando un hablante **viola abiertamente** una máxima sin romper el diálogo, obliga al oyente a buscar un segundo sentido:
- *Ejemplo de Ironía (Violación de Cualidad):* Tras romper un vaso de cristal, la madre le dice a su hijo: *"¡Qué inteligente eres!"*.
  - Literalmente afirma que es inteligente.
  - Pragmáticamente (implicatura): Le recrimina con sarcasmo su evidente torpeza.



### Mnemotecnia 1: "Las 3 Caras del Acto de Habla" (\text{L-I-P})
- **L**ocutivo = Las **L**etras (lo que dijo el aparato fonador).
- **I**locutivo = La **I**ntención (la orden, el ruego o la jugada oculta).
- **P**erlocutivo = El **P**ánico o efecto (cómo reaccionó el receptor).



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir lo Implícito con lo Extrapolado o Fantaseado**
> Una deducción pragmática implícita **DEBE emanar necesariamente de las pistas contextuales del texto**.
> Si el texto dice: *"El paciente ingresó a la sala de emergencias a las 3:00 a.m. con el brazo vendado y gesto de dolor"*, lo implícito necesario es que el paciente sufrió una lesión física reciente.
> Lo fantaseado (distractor de examen): *"El paciente se cayó de una motocicleta porque iba a excesiva velocidad"*. ¡El texto no aporta ningún dato sobre motocicletas ni velocidades! No confundas inferencia legítima con invención.

> [!CAUTION]
> **Trampa 2: La Metáfora tomada en Sentido Denotativo Literal**
> Si en un diálogo literario un personaje dice: *"Se me cayó el alma a los pies al escuchar la noticia"*, marcar como alternativa que el personaje sufrió una caída física o un desmayo con daño anatómico es el clásico distractor literal para postulantes distraídos.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la diplomacia internacional y la geopolítica (negociaciones de tratados de paz en la ONU), los cancilleres rara vez utilizan un lenguaje locutivo directo y agresivo; emplean fórmulas pragmáticas de cortesía atenuada (*"Mi gobierno ve con profunda preocupación las maniobras navales en la frontera"* \to Implicatura: *"Retiren sus buques inmediatamente o iniciaremos una confrontación militar"*). Igualmente, en los sistemas de procesamiento de lenguaje natural de asistentes virtuales (Siri, Alexa, ChatGPT), la ingeniería de *Prompting* y pragmática computacional permite a la IA entender que la frase *"Tengo frío"* dicha por el usuario en una habitación inteligente significa la orden perlocutiva de encender la calefacción.

---



### Ejercicio 1 (Nivel Básico: Identificación de la Intención Comunicativa)
**Enunciado:** En una calurosa tarde de verano, un comensal en un restaurante le dice al mozo:
*"Disculpe, ¿sabe si la ventana del fondo puede abrirse?"*
Pragmáticamente, el acto de habla emitido por el comensal constituye:
A) Una consulta técnica sobre la mecánica de los marcos de aluminio.  
B) Un acto locutivo sin fuerza perlocutiva.  
C) Una petición indirecta de cortesía para que se abra la ventana y se ventile el local.  
D) Una queja formal contra la administración del restaurante.  
E) Una felicitación por la arquitectura del establecimiento.  

**Resolución Paso a Paso:**
1. Analizamos la forma locutiva gramatical: Es una oración interrogativa indirecta sobre el conocimiento del mozo (*"¿sabe si...?"*).
2. Analizamos el contexto situacional: Ambiente caluroso, comensal sofocado en un comedor.
3. El comensal no tiene como meta averiguar los conocimientos de cerrajería del mozo; utiliza una fórmula de cortesía social (fuerza ilocutiva indirecta) para solicitar que se abra la ventana sin sonar autoritario o descortés.
4. Por ende, la intención comunicativa real es una **petición o solicitud indirecta de ventilación**.
**Respuesta:** C

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Implicatura Conversacional de Grice)
**Enunciado:** Analice el siguiente diálogo cotidiano:
- **Papá:** *"¿Qué tal le fue a tu hermano menor en su primer simulacro de admisión para Medicina en la UNSA?"*
- **Hijo mayor:** *"Bueno... por lo menos escribió su nombre y apellido completos sin faltas ortográficas en la ficha óptica."*
A partir del Principio de Cooperación de Grice, ¿qué implicatura conversacional se deduce de la respuesta del hijo mayor?
A) Que su hermano menor obtuvo el cómputo general en el examen.  
B) Que el examen de admisión no contenía preguntas de medicina.  
C) Que el hermano menor obtuvo un puntaje extremadamente bajo o deficiente en la prueba.  
D) Que la ficha óptica del examen estaba rota o deteriorada.  
E) Que el hermano menor es un destacado calígrafo profesional.  

**Resolución Paso a Paso:**
1. Analizamos la pregunta del padre: Indaga sobre el rendimiento académico integral en un simulacro de alta exigencia (Medicina Humana).
2. Evaluamos la respuesta del hermano mayor: En vez de responder con una cifra o nivel de rendimiento, resalta un dato trivial e insignificante (escribir su nombre sin faltas ortográficas).
3. El hijo mayor viola intencionalmente la **máxima de cantidad** (da información ridículamente irrelevante para el nivel del examen).
4. El recurso al eufemismo o ironía piadosa revela que el único mérito rescatable fue rellenar sus datos personales, lo que comunica de forma implícita que en el contenido de las preguntas académicas su desempeño fue desastroso.
5. Por ende, la implicatura conversacional deductiva es que **obtuvo un puntaje sumamente bajo y deficiente**.
**Respuesta:** C

---



### Ejercicio 4 (Nivel Avanzado DECO: Interpretación de Sentido Figurado e Ironía)
**Enunciado (Tipo San Marcos DECO / UNSA):** En una columna de crítica cultural sobre la televisión contemporánea, se lee:
*"El nuevo programa dominical de concursos es un verdadero manantial inagotable de sabiduría humanística: en apenas dos horas de transmisión, los televidentes fuimos iluminados con profundos debates sobre qué participante tenía el corte de cabello más extravagante y qué pareja de la farándula se había dejado de seguir en Instagram."*
¿Cuál es el sentido contextual y la intención comunicativa predominante en el texto anterior?
A) Elogiar con rigor la labor pedagógica y académica de la televisión comercial dominical.  
B) Describir objetivamente las reglas técnicas de los concursos de farándula contemporánea.  
C) Demostrar que las redes sociales constituyen el objeto primordial de estudio de la filosofía.  
D) Criticar y satirizar mediante la ironía el carácter frívolo, banal y superficial del programa de televisión.  
E) Promover la masificación de los programas dominicales en los colegios de secundaria.  

**Resolución Paso a Paso:**
1. Desglosamos los elementos léxicos en tensión:
   - Expresiones solemnes y elevadas: *"manantial inagotable de sabiduría humanística"*, *"fuimos iluminados con profundos debates"*.
   - Realidad descrita: Cortes de cabello extravagantes y chismes de redes sociales de celebridades locales (*Instagram*).
2. Existe un abismo evidente entre los elogios mayúsculos y la absoluta intrascendencia cultural de los hechos expuestos.
3. El autor transgrede conscientemente la máxima de cualidad para construir una **ironía sarcástica**.
4. Su auténtica intención comunicativa es denunciar y mofarse de la vacuidad y frivolidad de los contenidos del programa televisivo.
5. La opción D traduce con absoluta lucidez crítica dicha postura.
**Respuesta:** D

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación Rigurosa de lo Explícito vs. Implícito)
**Enunciado (Nivel UNI / Máxima Exigencia):** Lea con detenimiento el siguiente reporte médico-legal:
*"El fiscal provincial de turno y el médico legista levantaron el acta respectiva en la ribera del río Chili a las 06:30 horas. El cuerpo no presentaba rigidez cadavérica (rigor mortis) ni livideces hipostáticas fijas en el plano dorsal. La temperatura rectal se mantuvo en 36.2 °C al momento de la intervención pericial, a pesar de que la temperatura ambiental era de 7.0 °C. Asimismo, no se hallaron signos de sumersión vital (hongo de espuma en vías respiratorias ausente y ausencia total de agua en cavidad gástrica o pleural), registrándose una herida punzocortante penetrante en el hemitórax izquierdo a nivel del quinto espacio intercostal."*
A partir del informe pericial y las leyes de la tanatología forense, ¿cuál de las siguientes conclusiones se desprende como una **inferencia implícita lógicamente necesaria**, distinguiéndola de los hechos explícitos?
A) El sujeto falleció producto de una caída accidental al cauce del río Chili.  
B) El deceso se produjo por asfixia mecánica provocada por sumersión líquida en el río.  
C) La persona fue asesinada en un lugar distinto al río y arrojada al agua pocos minutos antes de la intervención fiscal.  
D) El arma utilizada fue un puñal artesanal de acero inoxidable de diez centímetros.  
E) Los peritos tardaron más de veinticuatro horas en llegar a la ribera del río.  

**Resolución Paso a Paso:**
1. Analizamos la evidencia pericial explícita (datos brutos):
   - Temperatura corporal: 36.2^\circ C con ambiente a 7^\circ C. No hay enfriamiento cadavérico significativo ni *rigor mortis*. \implies Inferencia: **La muerte es sumamente reciente** (ocurrida hace muy pocos minutos respecto a la hora del hallazgo).
   - Signos de sumersión: Hongo de espuma ausente y vías respiratorias/cavidad gástrica limpias de agua. \implies Inferencia tanatológica: **El individuo NO murió ahogado** en el río (sumersión post mórtem o el cuerpo no aspiró agua viva).
   - Lesión: Herida penetrante en quinto espacio intercostal izquierdo (región precordial cardíaca). \implies Inferencia: **Muerte traumática por arma blanca que perforó el miocardio**.
2. Evaluamos la integración lógica de las inferencias:
   - Si no murió ahogado, murió por la herida punzocortante.
   - Si su temperatura aún era de 36.2^\circ C pese al frío andino del agua y aire de Arequipa a las 6:30 a.m., y el cuerpo estaba en el río, no estuvo sumergido durante horas; el hecho violento ocurrió instantes antes o fue depositado inmediatamente después del ataque.
3. Descartamos las opciones:
   - A y B chocan con la ausencia de signos de sumersión vital.
   - D es una invención (no se sabe el metal ni la longitud exacta del arma).
   - E choca con la temperatura de 36.2^\circ C.
   - C sintetiza con rigor forense que la causa de muerte no fue el río y que el deceso y traslado ocurrieron en una ventana temporal inmediata a la intervención.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Pragmática:** Estudio de cómo el contexto social y situacional influye en la interpretación del significado lingüístico.
2. **Acto Locutivo:** Emisión lingüística de sonidos, palabras y oraciones con significado literal referencial.
3. **Acto Ilocutivo:** Acción comunicativa intencional ejecutada mediante la emisión verbal (promesa, orden, bautizo).
4. **Acto Perlocutivo:** Efecto psicológico, emocional o conductual producido de facto en el interlocutor.
5. **Presuposición:** Suposición previa e incuestionable requerida por la estructura sintáctica de un enunciado.
6. **Implicatura:** Significado tácito que se infiere pragmáticamente más allá de lo dicho literalmente.
7. **Principio de Cooperación:** Supuesto tácito formulado por Grice que rige la interacción conversacional racional.
8. **Ironía Pragmática:** Figura retórica que consiste en dar a entender lo contrario de lo que se dice mediante la transgresión de la verdad.
9. **Sentido Figurado:** Empleo connotativo del lenguaje basado en traslaciones analógicas y asociaciones metafóricas.
10. **Contexto Situacional:** Entorno físico, cultural y temporal que rodea y dota de sentido a la comunicación viva.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué prueba permite saber si una idea es una presuposición o una simple afirmación?**  
  **A:** La prueba de la negación: si al negar la oración principal la idea sigue considerándose verdadera, es una presuposición.
- **Q: ¿Qué máxima de Grice se transgrede cuando un hablante miente a sabiendas o ironiza?**  
  **A:** La máxima de Cualidad (que exige no afirmar falsedades ni proposiciones sin evidencia).
- **Q: ¿Cuál es la diferencia entre el acto ilocutivo y el acto perlocutivo?**  
  **A:** El ilocutivo es lo que el emisor *hace al hablar* (su intención); el perlocutivo es la *reacción que logra* en el receptor.
- **Q: En la oración "¿Podrías pasarme la sal?", ¿cuál es su fuerza ilocutiva real?**  
  **A:** Es una petición u orden atenuada por cortesía, no una pregunta sobre la capacidad psicomotriz del brazo del receptor.
- **Q: ¿Por qué la ironía exige un contexto compartido para ser comprendida?**  
  **A:** Porque sin un conocimiento del contexto situacional y de la intención del emisor, el mensaje se interpretará erróneamente en su sentido literal falso.

---



### 3.1 Presuposiciones vs. Implicaturas

| Parámetro | Presuposición | Implicatura Conversacional |
| :--- | :--- | :--- |
| **Definición** | Información implícita incrustada en la estructura lingüística de la oración que se asume como verdadera antes de emitirla. | Información adicional que el receptor deduce evaluando el contexto y la transgresión de máximas de diálogo. |
| **Prueba de la Negación** | **Resiste la negación.** Si niegas la oración, la presuposición sigue intacta. | **No resiste la negación formal.** Desaparece o muta radicalmente. |
| **Ejemplo** | *"Carlos dejó de fumar"* \to Presuposición: *Carlos fumaba antes*. (Si decimos *"Carlos no dejó de fumar"*, ¡sigue siendo cierto que fumaba!). | *"¿Vamos al cine hoy? —Tengo que rendir el examen de Ceprunsa mañana"* \to Implicatura: *No puedo ir al cine*. |
| **Activadores Léxicos** | Verbos de cambio de estado (*dejar, empezar, continuar*), verbos factivos (*lamentar, saber*). | Violación calculada de las máximas del Principio de Cooperación de Grice. |



### Hack 2: Aislamiento de la Pregunta Trampa Pragmática
Preguntas del tipo: *"¿Sigues engañando a tus socios en la empresa?"*:
- Si respondes "SÍ" \to Aceptas que los engañas hoy.
- Si respondes "NO" \to Aceptas que los engañabas antes.
- **HACK:** La pregunta encierra una **presuposición forzada**. En el examen, identifícala como una falacia de pregunta compleja orientada a condicionar una admisión de culpabilidad previa.

---



### Hack 1: Decodificación de la Ironía en Textos de Admisión
En textos donde un autor utiliza un tono socarrón o satírico:
1. Detecta la palabra excesivamente elogiosa que choca violentamente con la realidad descrita (ejemplo: llamar *"preclaro estadista"* a un tirano corrupto).
2. Invierte el valor semántico al 180°: el autor quiere decir exactamente lo opuesto de lo que está escrito literalmente.
3. En las alternativas, busca opciones que contengan verbos de censura: *criticar, censurar, fustigar, reprochar o satirizar*.



### Ejercicio 2 (Nivel Intermedio: Detección de Presuposición)
**Enunciado (Modelo Admisión UNSA):** En el siguiente titular de prensa:
*"El nuevo ministro de Economía admitió que la inflación no podrá ser controlada este año."*
¿Cuál de las siguientes proposiciones constituye una **presuposición lingüística incuestionable** del enunciado?
A) La inflación bajará el próximo año.  
B) Existe un proceso inflacionario en curso en la economía.  
C) El ministro será destituido de inmediato por el presidente.  
D) Los ciudadanos aprueban la gestión del gabinete ministerial.  
E) La inflación es provocada por factores externos internacionales.  

**Resolución Paso a Paso:**
1. Identificamos el verbo rector del enunciado: el verbo factivo *"admitir"*.
2. El uso de *admitir* ("admitió que X") presupone que el contenido subordinado no es una fantasía o hipótesis, sino un hecho verídico que ya está ocurriendo en la realidad.
3. Además, hablar de "controlar la inflación" presupone forzosamente que el fenómeno de la inflación ya existe de antemano; no se puede intentar controlar algo que no está presente.
4. Si aplicamos la prueba de la negación: *"El nuevo ministro de Economía NO admitió que la inflación no podrá ser controlada este año"* \implies Sigue siendo un hecho indudable que la inflación existe.
5. Por lo tanto, la presuposición obligatoria es que **existe un proceso inflacionario real en curso**.
**Respuesta:** B

---



## 4. FORMULARIO MAESTRO DE ANÁLISIS PRAGMÁTICO

| Herramienta Pragmática | Algoritmo de Detección | Aplicación en Examen de Admisión |
| :--- | :--- | :--- |
| **Fuerza Ilocutiva Directa** | Coincidencia entre forma y función | Una orden formulada como imperativo: *"¡Cierra la puerta!"*. |
| **Fuerza Ilocutiva Indirecta** | Discrepancia entre forma y función | Una orden formulada como pregunta de cortesía: *"¿Podrías cerrar la puerta?"* (No consulta la capacidad física, exige la acción). |
| **Prueba de Cancelabilidad** | Rasgo distintivo de la implicatura | Una implicatura puede cancelarse explícitamente sin contradicción (*"Tengo examen mañana, pero igual iré al cine"*). |
| **Foco de Presuposición** | Elementos como *incluso*, *también*, *hasta* | *"Hasta Pedro aprobó"* \implies Presupone que Pedro era el menos capacitado o el más reacio a aprobar. |

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "Las 3 Caras del Acto de Habla" (\text{L-I-P})
- **L**ocutivo = Las **L**etras (lo que dijo el aparato fonador).
- **I**locutivo = La **I**ntención (la orden, el ruego o la jugada oculta).
- **P**erlocutivo = El **P**ánico o efecto (cómo reaccionó el receptor).

### Mnemotecnia 2: "El Semáforo de la Presuposición"
- Pregúntate: *Si le pongo "NO" al verbo principal, ¿la idea del fondo sigue siendo verdad?*
  - *"María lamenta haber perdido la billetera"*.
  - *"María NO lamenta haber perdido la billetera"*.
  - En ambos casos: **¡Perdió la billetera!** Esa es la presuposición inexpugnable.

---

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Decodificación de la Ironía en Textos de Admisión
En textos donde un autor utiliza un tono socarrón o satírico:
1. Detecta la palabra excesivamente elogiosa que choca violentamente con la realidad descrita (ejemplo: llamar *"preclaro estadista"* a un tirano corrupto).
2. Invierte el valor semántico al 180°: el autor quiere decir exactamente lo opuesto de lo que está escrito literalmente.
3. En las alternativas, busca opciones que contengan verbos de censura: *criticar, censurar, fustigar, reprochar o satirizar*.

### Hack 2: Aislamiento de la Pregunta Trampa Pragmática
Preguntas del tipo: *"¿Sigues engañando a tus socios en la empresa?"*:
- Si respondes "SÍ" \to Aceptas que los engañas hoy.
- Si respondes "NO" \to Aceptas que los engañabas antes.
- **HACK:** La pregunta encierra una **presuposición forzada**. En el examen, identifícala como una falacia de pregunta compleja orientada a condicionar una admisión de culpabilidad previa.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t06_s02_c01",
                    question = "El 'Principio de Cooperación' formulado por el filósofo Paul Grice en su teoría pragmática estipula que en una interacción verbal los hablantes deben:",
                    options = listOf(
                        "Hablar simultáneamente en voz alta para demostrar entusiasmo.",
                        "Mentir sistemáticamente para poner a prueba la perspicacia del oyente.",
                        "Utilizar exclusivamente un vocabulario de menos de quinientas palabras.",
                        "Hacer que su contribución a la conversación sea la requerida, en el momento en que se produce y de acuerdo con el objetivo o dirección aceptada del intercambio comunicativo.",
                    ),
                    correctIndex = 3,
                    explanation = "El Principio de Cooperación es el postulado normativo implícito que guía la comunicación racional: cooperamos orientando nuestras emisiones hacia el entendimiento mutuo congruente."
                ),
                Challenge(
                    id = "rv_t06_s02_c02",
                    question = "La 'Máxima de Cantidad' de Paul Grice prescribe con precisión que el emisor debe:",
                    options = listOf(
                        "Hablar durante un mínimo de cuarenta y cinco minutos sin interrupción.",
                        "Hacer que su contribución sea tan informativa como sea necesario para los propósitos del diálogo, sin proporcionar más información de la que realmente se requiere.",
                        "Aportar la menor cantidad de sílabas posibles en cada oración.",
                        "Escribir textos de extensión enciclopédica en todo momento.",
                    ),
                    correctIndex = 1,
                    explanation = "La máxima de cantidad regula la dosificación informativa: no pecar por defecto (dar menos datos de los requeridos) ni por exceso abrumador innecesario."
                ),
                Challenge(
                    id = "rv_t06_s02_c03",
                    question = "La 'Máxima de Cualidad' (o Calidad) exige fundamentalmente que el hablante:",
                    options = listOf(
                        "Utilice adjetivos de alta calidad poética.",
                        "Imprima sus cartas en papel pergamino fino.",
                        "Hable con acento aristocrático europeo.",
                        "No diga aquello que cree que es falso ni afirme aquello de lo cual carece de pruebas o evidencia suficiente.",
                    ),
                    correctIndex = 3,
                    explanation = "La máxima de cualidad se sustenta en la veracidad y honestidad epistémica: prohíbe mentir a sabiendas o sostener tesis sin fundamento probatorio adecuado."
                ),
                Challenge(
                    id = "rv_t06_s02_c04",
                    question = "La 'Máxima de Relación' (o Pertinencia) se sintetiza formalmente en la regla:",
                    options = listOf(
                        "'Evite mirar a los ojos a su interlocutor'.",
                        "'Hable siempre de sus familiares cercanos'.",
                        "'Relacione todas sus ideas con la mitología escandinava'.",
                        "'Sea relevante' (vincule sus intervenciones de forma pertinente con el asunto tratado en la conversación).",
                    ),
                    correctIndex = 3,
                    explanation = "La pertinencia exige que lo emitido tenga relevancia lógica y temática con respecto al foco de la discusión en curso."
                ),
                Challenge(
                    id = "rv_t06_s02_c05",
                    question = "La 'Máxima de Modo' (o Manera) concierne no a lo que se dice, sino a cómo se dice, prescribiendo:",
                    options = listOf(
                        "Omitir los verbos conjugados en pasado imperfecto.",
                        "Gesticular enérgicamente con ambas manos durante el discurso.",
                        "Ser claro, evitar la oscuridad de expresión, evitar la ambigüedad, ser breve y ser ordenado en la exposición.",
                        "Usar siempre un tono de voz solemne y teatral.",
                    ),
                    correctIndex = 2,
                    explanation = "La manera regula la claridad estilística y estructural del mensaje, proscribiendo la ambigüedad, el desorden confuso y el barroquismo innecesario."
                ),
                Challenge(
                    id = "rv_t06_s02_c06",
                    question = "Si ante la pregunta de un policía: '¿Dónde vive el sospechoso?', un testigo responde con evasivas irrelevantes hablando del clima y de la comida típica del pueblo, el testigo está violando flagrantemente la máxima de:",
                    options = listOf(
                        "Relación o Pertinencia.",
                        "Modo puramente estético.",
                        "Concordancia nominal.",
                        "Tildación optativa.",
                    ),
                    correctIndex = 0,
                    explanation = "Al cambiar de tema e introducir información inconexa con la pregunta formulada, se trasgrede frontalmente la máxima de relación o pertinencia."
                ),
                Challenge(
                    id = "rv_t06_s02_c07",
                    question = "En la pragmática griceana, cuando un hablante viola de manera abierta, deliberada y ostensible una máxima (por ejemplo, diciendo '¡Qué clima tan cálido y primaveral!' en medio de una tormenta de nieve), está generando el fenómeno comunicativo de la:",
                    options = listOf(
                        "Afasia neurológica irreversible.",
                        "Demencia lingüística severa.",
                        "Discordancia gramatical de género.",
                        "Ironía mediante la explotación de una máxima.",
                    ),
                    correctIndex = 3,
                    explanation = "La transgresión deliberada y compartida de la máxima de cualidad es el mecanismo pragmático clásico que engendra la figura de la ironía, entendiendo el oyente el significado opuesto."
                ),
                Challenge(
                    id = "rv_t06_s02_c08",
                    question = "Un profesor escribe en la carta de recomendación de un alumno que postula a un doctorado en Filosofía: 'El postulante asiste puntualmente a clases y tiene una letra muy redonda y legible'. Al omitir deliberadamente toda mención a su talento intelectual o capacidad reflexiva, el profesor está explotando la máxima de:",
                    options = listOf(
                        "Pertinencia, al hablar de un animal cuadrúpedo.",
                        "Modo, porque la caligrafía es ilegible.",
                        "Cantidad, generando la implicatura de que el alumno carece de mérito intelectual para el posgrado.",
                        "Cualidad, porque la letra no existe físicamente.",
                    ),
                    correctIndex = 2,
                    explanation = "Es el clásico ejemplo de Grice: al proporcionar deliberadamente menos información académica de la requerida en una recomendación formal, se comunica implícitamente una evaluación negativa del candidato."
                ),
                Challenge(
                    id = "rv_t06_s02_c09",
                    question = "Cuando un comunicado oficial está redactado en un lenguaje tan intrincado, caótico y lleno de jergas técnicas incomprensibles que ningún ciudadano logra entender la norma, se incumple la máxima de:",
                    options = listOf(
                        "Puntuación prosódica.",
                        "Cantidad numérica.",
                        "Cualidad moral.",
                        "Modo (sea claro y evite la oscuridad de expresión).",
                    ),
                    correctIndex = 3,
                    explanation = "El lenguaje deliberadamente confuso u oscuro atenta contra la máxima de modo, que exige claridad, concisión y orden en la expresión comunicativa."
                ),
                Challenge(
                    id = "rv_t06_s02_c10",
                    question = "El concepto de 'Acto de Habla' (John L. Austin) establece que al emitir un enunciado lingüístico realizamos simultáneamente tres actos:",
                    options = listOf(
                        "Acto Primario, Acto Secundario y Acto Terciario de memoria.",
                        "Acto Fonético, Acto Gráfico y Acto Teatral.",
                        "Acto Locutivo (el decir físico de palabras con significado), Acto Ilocutivo (la fuerza o intención comunicativa: ordenar, prometer, advertir) y Acto Perlocutivo (el efecto real provocado en el receptor).",
                        "Acto Jurídico, Acto Político y Acto Militar.",
                    ),
                    correctIndex = 2,
                    explanation = "Austin formuló la teoría de los actos de habla distinguiendo el acto locutivo (lo que se dice), ilocutivo (lo que se hace al decirlo: la fuerza ilocucionaria) y perlocutivo (el efecto producido en el oyente)."
                ),
            )
        )
    )
}
