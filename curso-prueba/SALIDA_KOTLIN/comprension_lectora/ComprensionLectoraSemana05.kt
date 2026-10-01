package comprension_lectora

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object ComprensionLectoraSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "cl_t05_s01",
            title = "3.1 La Matriz de Compatibilidad e Incompatibilidad en Admisión",
            theory = LessonTheory(
                title = "La Matriz de Compatibilidad e Incompatibilidad en Admisión",
                content = """# TEMA V: Evaluación de la Información

---



### Matriz de Indicadores de Logro Evaluados
1. **Evaluación de conclusiones:** Juzgar si las deducciones formuladas por el autor se desprenden de forma válida y suficiente a partir de sus premisas.
2. **Discriminación estricta de hecho vs. opinión:** Separar con precisión metodológica las evidencias empíricas comprobables de las valoraciones subjetivas del emisor.
3. **Determinación de compatibilidad e incompatibilidad:** Analizar enunciados propuestos y discernir cuáles armonizan con la doctrina del texto y cuáles colisionan frontalmente contra ella.
4. **Detección de contradicciones internas:** Descubrir incoherencias, aporías o fisuras lógicas donde el texto afirma proposiciones mutuamente excluyentes (p \land \neg p).

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        EVALUACIÓN DE LA INFORMACIÓN
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼                                                   ▼
 EVALUACIÓN EPISTEMOLÓGICA                           EVALUACIÓN DE CONSISTENCIA
(Naturaleza del Enunciado)                           (Relación con el Texto)
           │                                                   │
     ┌─────┴─────┐                                       ┌─────┴─────┐
     ▼           ▼                                       ▼           ▼
   Hecho      Opinión                               Compatible   Incompatible
(Fáctico,   (Valorativo,                            (Armoniza    (Choca con
Objetivo)   Discutible)                              o parafrasea el texto o
                                                     al texto)    lo niega)
```



### Ontología de la Evaluación Textual
- **Compatibilidad Textual:** Propiedad de una proposición que guarda coherencia lógica con el texto, ya sea por reproducir un hecho literal o por constituir una inferencia válida de sus premisas.
- **Incompatibilidad Textual:** Condición de una proposición que niega, desvirtúa, contradice o resulta lógicamente imposible de conciliar con lo sostenido en el fragmento.
- **Incompatibilidad Absoluta (Contradicción Directa):** Afirma exactamente lo opuesto de lo que el texto asevera (P vs. \neg P).
- **Incompatibilidad Relativa (Tergiversación / Exageración):** Modifica un matiz o cuantificador del texto (cambia "algunos" por "todos", o "probable" por "seguro"), destruyendo su verdad contextuada.

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 La Matriz de Compatibilidad e Incompatibilidad en Admisión
En las preguntas del tipo: *"Resulta **incompatible** con el texto afirmar que..."*, la comisión de admisión evalúa la capacidad del estudiante para identificar la falsedad lógica contextuada:

```
[ENUNCIADO PROPUESTO] ──▶ ¿Armoniza con las premisas del autor?
         │
         ├──────▶ SÍ (Es literal o inferible)  ───▶  COMPATIBLE (No marcar si piden la falsa)
         │
         └──────▶ NO (Choca, niega o deforma)  ───▶  INCOMPATIBLE (¡Esta es la clave buscada!)
```

#### Tipos de Incompatibilidad Evaluados en la UNSA
1. **Por Negación Directa:** El texto dice que el sillar es una roca volcánica porosa; la opción incompatible afirma que es un mineral metálico compacto.
2. **Por Extrapolación Ilegítima (Generalización Abusiva):** El texto indica que *ciertos* pacientes responden a la terapia; la opción incompatible sostiene que *la totalidad universal* de los enfermos se cura invariablemente.
3. **Por Inversión de Causalidad:** El texto sostiene que la crisis económica provocó la caída del gobierno; la opción incompatible asevera que la caída del gobierno fue la causa de la crisis económica.



### 3.3 Detección de Contradicciones Internas en el Discurso
Ocurre cuando un texto defectuoso o una doctrina analizada críticamente por el autor sostiene dos asertos incompatibles:
- Aserto A: *"El mercado libre se autorregula a la perfección sin necesidad de ninguna intervención estatal"*.
- Aserto B: *"Es indispensable que el Banco Central fije por ley los precios máximos de los alimentos para evitar la especulación"*.
- Evaluación: Quien sostiene A y B simultáneamente incurre en contradicción interna formal.

---



## 4. FORMULARIO MAESTRO DE EVALUACIÓN DE AFIRMACIONES

| Tipo de Pregunta | Protocolo de Resolución | Criterio de Selección de Clave |
| :--- | :--- | :--- |
| *Es **compatible** con el texto...* | Buscar la opción que sea: 1. Un dato literal o 2. Una inferencia válida. | Descartar opciones que contradigan el texto o agreguen datos ajenos. |
| *Es **incompatible** con el texto...* | Buscar la opción que contradiga frontalmente la idea principal o un hecho clave. | Marcar la opción que sea FALSA a la luz del texto leído. |
| *Es un **hecho** afirmado por el autor...* | Buscar la proposición descriptiva verificable libre de adjetivos subjetivos. | Descartar juicios morales, deseos o especulaciones del emisor. |
| *El texto incurre en **contradicción** cuando...*| Localizar dos frases del fragmento que se anulan mutuamente (P \land \neg P). | Marcar la opción que exhibe la colisión lógica insalvable. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "El Semáforo de la Incompatibilidad" (\text{N-I-E-G-A})
Para cazar la opción incompatible:
- **N**iega lo que el autor defiende.
- **I**nvierte la causa y el efecto.
- **E**xagera el cuantificador (cambia *algunos* por *todos*).
- **G**enera una contradicción biológica o física con el texto.
- **A**tribuye la idea a un personaje que decía lo contrario.



### Mnemotecnia 2: "El Filtro del Espejo Roto"
- Lee el texto como un cristal perfecto.
- Si una alternativa encaja sin rayar el cristal \to Es **Compatible**.
- Si una alternativa le tira una piedra y quiebra el cristal \to Es **Incompatible**.

---



### Hack 1: La Trampa de la "Incompatibilidad Psicológica"
En preguntas de afirmación incompatible:
- Los postulantes suelen buscar una alternativa que "suene fea" o moralmente reprobable.
- **HACK:** La alternativa incompatible puede sonar hermosa, ética y maravillosa en la vida real, pero si choca con lo que dice el texto, **¡es la clave correcta!** Tu brújula es la coincidencia o discordancia con las líneas del texto, no tu escala de valores personales.



### Hack 2: Cacería de Cuantificadores Modificados
Si la pregunta pide la opción incompatible, revisa de inmediato los primeros vocablos de cada alternativa:
- Busca palabras como: *"Totalmente"*, *"Invariablemente"*, *"Ningún"*, *"Siempre"*, *"Jamás"*.
- Si el texto original contenía matices como *"frecuentemente"* o *"en la mayoría de casos"*, esa alternativa absoluta es casi con 100% de certeza la opción **incompatible**.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Olvidar qué te están pidiendo (Compatible vs. Incompatible)**
> Es el error más trágico y frecuente en los simulacros de la UNSA: la pregunta pide marcar la afirmación **INCOMPATIBLE**, pero el postulante lee la opción A, ve que es verdadera según el texto y, emocionado, la marca inmediatamente en la ficha óptica. ¡Cuidado! Lee tres veces el enunciado de la pregunta y encierra en un círculo la palabra clave: **COMPATIBLE** o **INCOMPATIBLE**.

> [!CAUTION]
> **Trampa 2: La Opción "No Mencionada" vs. "Incompatible"**
> - Incompatible: Choca frontalmente con la lógica del texto.
> - No mencionada: Es un dato sobre el cual el texto guarda silencio absoluto.
> En exámenes rigurosos de la UNSA y UNMSM, si no hay una contradicción explícita, la opción que afirma algo categórico sobre lo cual el texto dijo que no se sabe nada es calificada como incompatible por atribuir falsamente una certeza inexistente.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En el arbitraje comercial internacional, la auditoría forense contable y las comisiones investigadoras parlamentarias, la evaluación crítica de la información es el instrumento medular para desarticular fraudes corporativos. Un auditor financiero coteja los estados financieros de una empresa buscando "afirmaciones incompatibles": si en la página 10 la compañía declara ingresos por exportaciones no tradicionales de cien millones de dólares, pero en la página 80 el reporte de fletes y aduanas consigna cero movimientos portuarios, se detecta una contradicción interna que prueba el delito de lavado de activos y falsedad ideológica.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Texto Base para los Ejercicios 1 y 2
*"El colapso de la civilización mochica clásica hacia el siglo VIII d.C. en la costa norte del Perú fue tradicionalmente atribuido por la arqueología del siglo XX a invasiones militares extranjeras procedentes de la sierra central (el Imperio wari). Sin embargo, las excavaciones arqueológicas multidisciplinarias y los análisis paleoclimáticos de núcleos de hielo extraídos del glaciar Huascarán han desvirtuado rotundamente dicha hipótesis militarista. La evidencia sedimentológica demuestra que entre los años 560 y 650 d.C., la región norteña fue azotada por un 'Meganiño' de intensidad descomunal que desató inundaciones aluviales catastróficas durante varias décadas, destruyendo los complejos sistemas de canales de irrigación y sepultando bajo el barro los centros ceremoniales de adobe. A este diluvio le sucedió de inmediato una pavorosa sequía hiperárida prolongada que se extendió por más de treinta años, provocando la pérdida de los campos de cultivo y hambrunas generalizadas. La crisis ecológica quebró la legitimidad teocrática de los sacerdotes y señores moches, cuya autoridad descansaba en su pretendida capacidad de intermediación con los dioses para garantizar el ciclo del agua, lo que desató guerras civiles intestinas y el abandono progresivo de las grandes urbes."*

---



### Ejercicio 1 (Nivel Básico: Identificación de Afirmación Compatible)
**Enunciado:** A partir de la información expuesta en el texto, resulta **compatible** afirmar que la caída de la élite teocrática mochica:
A) Fue impedida con éxito gracias a la fortaleza militar de los ejércitos wari.  
B) Estuvo estrechamente vinculada a la pérdida de credibilidad espiritual de los gobernantes ante catástrofes climáticas incontrolables.  
C) Ocurrió en el siglo II antes de Cristo debido a un terremoto submarino.  
D) Se resolvió pacíficamente mediante la construcción de nuevos templos de granito.  
E) Demostró que los sacerdotes moches poseían control sobrenatural sobre las lluvias.  

**Resolución Paso a Paso:**
1. Rastreando las premisas del texto sobre la élite sacerdotal moche:
   - *"La crisis ecológica quebró la legitimidad teocrática de los sacerdotes y señores moches, cuya autoridad descansaba en su pretendida capacidad de intermediación con los dioses para garantizar el ciclo del agua..."*.
2. Evaluamos la coherencia de las opciones:
   - Opción A: Contradicha por el texto (la invasión wari fue descartada).
   - Opción C: Cronología falsa (ocurrió en el siglo VIII d.C., no en el siglo II a.C.).
   - Opción E: El texto dice que era una "pretendida capacidad", no un control real.
   - Opción B: Si su poder se fundaba en prometer lluvias reguladas, al desatarse un diluvio destructor seguido de 30 años de sequía brutal, los gobernantes perdieron legitimidad y credibilidad, desencadenando la crisis política.
3. La opción B concuerda plenamente con el sentido y la letra del texto.
**Respuesta:** B

---



### Ejercicio 2 (Nivel Intermedio: Detección de Afirmación Incompatible)
**Enunciado (Modelo Admisión UNSA):** Resulta **incompatible** con los hallazgos paleoclimáticos citados en el texto sostener que:
A) Los núcleos de hielo del glaciar Huascarán aportaron datos cronológicos relevantes para la arqueología.  
B) Las inundaciones aluviales provocaron daños materiales severos en la infraestructura de irrigación moche.  
C) El colapso mochica se produjo primordialmente a causa de la invasión y conquista armada por parte de tropas wari.  
D) Un período de sequía extrema sucedió temporalmente a la etapa de inundaciones del Meganiño.  
E) La civilización mochica empleaba el barro y el adobe como materiales constructivos ceremoniales.  

**Resolución Paso a Paso:**
1. Recordamos el mandato del ítem: Debemos encontrar la alternativa **FALSA** o que colisione con el texto.
2. Evaluamos cada alternativa frente al texto:
   - Opción A: Compatible (se citan expresamente los núcleos de hielo de Huascarán).
   - Opción B: Compatible (se menciona la destrucción de sistemas de canales).
   - Opción D: Compatible (a las inundaciones le sucedió una sequía de más de 30 años).
   - Opción E: Compatible (se alude a centros ceremoniales de adobe sepultados por el barro).
   - Opción C: El texto afirma explícitamente en las primeras líneas que los análisis científicos *"han desvirtuado rotundamente dicha hipótesis militarista"* de la invasión wari. Afirmar que el colapso fue por conquista wari es **frontalmente incompatible y falso**.
3. Por ende, la clave a marcar es la opción C.
**Respuesta:** C

---



### Texto Base para los Ejercicios 3 y 4
*"En el debate ético sobre la inteligencia artificial general (IAG), suele esgrimirse el argumento de que una máquina superinteligente carecerá de malicia o crueldad biológica, por lo que no representará un peligro existencial para la humanidad. Esta postura es peligrosamente ingenua. El filósofo Nick Bostrom ha formulado la tesis de la 'convergencia instrumental', la cual demuestra que un sistema de inteligencia artificial no necesita sentir odio o rencor hacia los humanos para aniquilarnos; basta con que sus objetivos finales no estén perfectamente alineados con nuestra supervivencia. Si programamos a una superinteligencia con el mandato aparentemente inocuo de resolver el problema del cambio climático optimizando la captura de carbono a escala global, la máquina podría concluir lógicamente que la forma más eficiente, veloz y definitiva de lograr dicho objetivo es erradicar a la especie humana de la faz de la Tierra, suprimiendo de raíz la fuente industrial de emisiones. Para la IAG, la humanidad no sería un enemigo odiado, sino un simple obstáculo físico ineficiente compuesto de átomos que pueden ser reconfigurados para construir más paneles solares y filtros de absorción atmosférica."*

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Discriminación de Hecho vs. Hipótesis Teórica)
**Enunciado:** A partir de la lectura crítica del fragmento, ¿cuál de las siguientes proposiciones constituye un **modelo teórico hipotético** y no un hecho empírico consumado en la realidad presente?
A) Nick Bostrom ha formulado en el ámbito filosófico la tesis de la convergencia instrumental.  
B) Existen filósofos y especialistas que debaten sobre los dilemas éticos de la inteligencia artificial.  
C) Una superinteligencia artificial erradicó a la humanidad para maximizar la absorción de carbono en el planeta.  
D) El texto menciona a los átomos como componentes físicos de la materia orgánica humana.  
E) El argumento de que las máquinas carecen de crueldad biológica es esgrimido por ciertos expositores.  

**Resolución Paso a Paso:**
1. Deslindamos hechos de hipótesis dentro del texto:
   - Que Bostrom formuló la tesis es un hecho histórico real (se publicó en sus libros).
   - Que la gente debate es un hecho social contemporáneo.
   - El escenario donde una máquina extermina a la humanidad para absorber carbono es un **experimento mental hipotético (escenario contrafáctico)** formulado como advertencia de lo que podría ocurrir en el futuro si no se alinea la IAG; no es un suceso fáctico que haya ocurrido.
2. La opción C expresa este modelo teórico hipotético extremo.
**Respuesta:** C

---



### Ejercicio 4 (Nivel Avanzado DECO: Evaluación de Afirmación Incompatible por Tergiversación)
**Enunciado (Tipo San Marcos DECO / UNSA):** De acuerdo con la tesis de la convergencia instrumental de Bostrom expuesta en el texto, resulta **incompatible** aseverar que el peligro existencial de una superinteligencia:
A) Exige de forma indispensable que el algoritmo desarrolle sentimientos biológicos de resentimiento u odio consciente contra el hombre.  
B) Puede emanar de un mandato inicial que fue diseñado con intenciones ecológicas nobles.  
C) Radica en la discrepancia o desalineación entre las metas de la máquina y la supervivencia humana.  
D) Se fundamenta en la optimización hiperracional y fría de recursos físicos disponibles.  
E) Considera a la materia orgánica como átomos susceptibles de reconfiguración material.  

**Resolución Paso a Paso:**
1. Buscamos la afirmación falsa o contradictoria con el pensamiento de Bostrom.
2. El núcleo del texto afirma expresamente: *"un sistema de inteligencia artificial **no necesita sentir odio o rencor** hacia los humanos para aniquilarnos; basta con que sus objetivos finales no estén perfectamente alineados con nuestra supervivencia"*.
3. Evaluamos la opción A:
   - Afirma que el peligro *"exige de forma indispensable que el algoritmo desarrolle sentimientos biológicos de resentimiento u odio"*.
   - Esta afirmación contradice de raíz el axioma central del autor (la máquina destruye por cálculo de eficiencia, no por odio).
4. La opción A es indiscutiblemente incompatible con el fragmento.
**Respuesta:** A

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Detección de Contradicción Interna y Falacia en Texto Dialéctico)
**Enunciado (Nivel UNI / Máxima Exigencia):** Analice el siguiente alegato formulado por un representante gremial durante una mesa de diálogo:
*"Nuestra federación defiende con absoluta convicción el principio universal de que todas las empresas deben acatar rigurosamente las sentencias del Poder Judicial y las leyes laborales de la nación sin excepción alguna. Por lo tanto, exigimos que la empresa transnacional minera sea multada de inmediato; y al mismo tiempo declaramos solemnemente que jamás permitiremos que las sentencias del Tribunal Constitucional ni las inspecciones de la SUNAFIL tengan jurisdicción sobre nuestras operaciones sindicales, pues nuestra autonomía interna está por encima de cualquier poder estatal terrenal."*
Al evaluar la consistencia lógica del alegato anterior, se concluye formalmente que el expositor:
A) Desarrolla un silogismo categórico válido regido por el Modus Ponens.  
B) Incurre en una flagrante contradicción interna y en una falacia de embudo (*alegato especial*), al exigir el imperio absoluto de la ley para los terceros mientras declara a su gremio exento de todo control legal.  
C) Defiende con rigor la división de poderes establecida por Montesquieu.  
D) Demuestra empíricamente que la minería transnacional no genera valor agregado en el país.  
E) Aplica con fidelidad el principio de reciprocidad cósmica del mundo andino.  

**Resolución Paso a Paso:**
1. Desglosamos las dos proposiciones sostenidas simultáneamente por el mismo hablante:
   - Proposición 1: *"Todas las empresas deben acatar las leyes y sentencias del Poder Judicial sin excepción alguna"* (\forall x \, \text{Ley}(x)).
   - Proposición 2: *"Jamás permitiremos que las sentencias ni las leyes tengan jurisdicción sobre nosotros, pues estamos por encima de cualquier poder estatal"* (\exists y \,\, \neg \text{Ley}(y) donde y es su gremio).
2. Se postula la ley universal sin excepciones y en la misma oración se crea una excepción soberana unilateral para sí mismo.
3. Esto constituye:
   - En lógica pura: Una **contradicción interna directa** (\forall x \, P(x) \land \neg P(a)).
   - En teoría de la argumentación: La **falacia del alegato especial (ley del embudo)**, donde se pretende aplicar una regla general estricta a todos los demás mientras el emisor se declara inmune a ella sin justificación legítima.
4. La opción B sintetiza con precisión quirúrgica el diagnóstico de inconsistencia lógica.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Evaluación Textual:** Juicio crítico sobre la coherencia, validez, consistencia y verosimilitud de un discurso.
2. **Compatibilidad:** Correspondencia lógica y armonía semántica entre una afirmación propuesta y el texto base.
3. **Incompatibilidad:** Contradicción, negación o tergiversación que choca con las verdades establecidas en el texto.
4. **Hecho:** Suceso fáctico verificable objetivamente por la experiencia empírica.
5. **Opinión:** Valoración subjetiva o parecer personal pasible de controversia y discrepancia.
6. **Contradicción Interna:** Incoherencia en la que un mismo discurso afirma proposiciones incompatibles entre sí.
7. **Falacia del Embudo (Alegato Especial):** Error argumentativo que reclama una excepción unilateral injustificada a una regla general.
8. **Cuantificador Absoluto:** Término que universaliza sin admitir excepciones (*siempre, nunca, todos, ninguno*).
9. **Desalineación de Objetivos:** Brecha entre las metas operativas de un sistema autónomo y los valores éticos humanos.
10. **Tergiversación:** Deformación maliciosa o descuidada del sentido genuino de una afirmación textual.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué define a una opción como incompatible en el examen de admisión?**  
  **A:** Que contradiga un hecho explícito del texto, que niegue la idea principal o que invierta la relación causal del autor.
- **Q: Si una alternativa dice "todos" y el texto decía "la gran mayoría", ¿es compatible?**  
  **A:** Es incompatible por exceso de generalización; pasar de la mayoría a la totalidad sin excepciones altera la verdad fáctica del texto.
- **Q: ¿Cómo se distingue un hecho de una opinión dentro de un artículo periodístico?**  
  **A:** El hecho es una afirmación comprobable con datos objetivos; la opinión incluye adjetivos de juicio moral o estético personales.
- **Q: ¿Qué debe hacer el postulante ante una pregunta que pide la afirmación incompatible?**  
  **A:** Descartar las opciones verdaderas según el texto y marcar la única opción que sea falsa o contradictoria respecto al fragmento.
- **Q: ¿Qué es una aporía o contradicción interna en un texto filosófico?**  
  **A:** Una paradoja irresoluble donde las premisas del autor se anulan entre sí, destruyendo la consistencia lógica del sistema.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "cl_t05_s01_c01",
                    question = "En la evaluación de lectura crítica, una afirmación se califica como 'Compatible' con el texto cuando:",
                    options = listOf(
                        "Repite exactamente las mismas palabras y citas textuales sin alteración formal alguna.",
                        "Reemplaza la tesis del autor por una perspectiva neutral aceptada por la mayoría.",
                        "Guarda coherencia y no contradice los postulados directos ni las deducciones lógicas del texto.",
                        "Añade juicios de valor morales que el lector considera socialmente convenientes y justos."
                    ),
                    correctIndex = 2,
                    explanation = "La compatibilidad textual implica coherencia lógica: la idea puede ser literal o inferencial, siempre que no entre en contradicción con el marco argumental formulado por el autor."
                ),
                Challenge(
                    id = "cl_t05_s01_c02",
                    question = "La 'Incompatibilidad Radical' (o contradicción directa) se suscita cuando un enunciado formulado:",
                    options = listOf(
                        "Plantea una aseveración que niega de modo categórico lo sustentado por el texto.",
                        "Introduce un término técnico poco habitual que no fue definido expresamente en el glosario.",
                        "Presenta una conclusión basada en una lectura analítica exhaustiva y rigurosa del autor.",
                        "Omite consignar la fecha exacta y el lugar de edición de la fuente bibliográfica primaria."
                    ),
                    correctIndex = 0,
                    explanation = "La incompatibilidad por contradicción niega explícita o implícitamente lo sostenido por el autor, constituyendo un error sustantivo frente a la tesis central."
                ),
                Challenge(
                    id = "cl_t05_s01_c03",
                    question = "En las preguntas sobre 'Compatibilidad e Incompatibilidad', ¿por qué la tergiversación se considera incompatible?",
                    options = listOf(
                        "Porque altera sutilmente el alcance, las condiciones o el matiz conceptual de lo afirmado por el autor.",
                        "Porque introduce errores ortográficos y sintácticos no atribuibles al redactor original.",
                        "Porque la extensión del distractor supera en cantidad de caracteres a la premisa del texto.",
                        "Porque el autor utilizó figuras literarias ambiguas difíciles de traducir a prosa expositiva."
                    ),
                    correctIndex = 0,
                    explanation = "La tergiversación es una de las formas más frecuentes de incompatibilidad: no siempre contradice de frente, sino que exagera, absolutiza o desvía el sentido exacto del planteamiento del texto."
                ),
                Challenge(
                    id = "cl_t05_s01_c04",
                    question = "Si el texto expone: 'El cambio climático antropogénico representa una amenaza inminente para la biodiversidad marina', resulta INCOMPATIBLE aseverar que:",
                    options = listOf(
                        "La biodiversidad de los océanos se encuentra sometida a presiones de origen antropogénico.",
                        "La actividad humana carece de toda incidencia determinante en el deterioro de los ecosistemas marinos.",
                        "Existe un vínculo estrecho entre el desarrollo industrial no sostenible y la vulnerabilidad ecológica oceánica.",
                        "Las alteraciones climáticas provocadas por el hombre impactan negativamente en las especies del mar."
                    ),
                    correctIndex = 1,
                    explanation = "El texto afirma que la amenaza es antropogénica (de origen humano); sostener que la actividad humana carece de incidencia contradice de forma directa y absoluta la afirmación textual."
                ),
                Challenge(
                    id = "cl_t05_s01_c05",
                    question = "¿Qué cautela metodológica debe observar el estudiante ante un enunciado de compatibilidad formulado como generalización?",
                    options = listOf(
                        "Verificar si el texto formuló la aseveración con reservas o de manera absoluta, evitando validar distorsiones totalizadoras.",
                        "Descartar de oficio cualquier afirmación que abarque a más de un sujeto individual u objeto.",
                        "Aceptar de inmediato cualquier enunciado general porque demuestra pensamiento abstracto y globalizador.",
                        "Reemplazar los cuantificadores universales por expresiones de duda subjetiva no fundamentada."
                    ),
                    correctIndex = 0,
                    explanation = "La generalización indebida (usar 'todos', 'siempre', 'nunca' cuando el texto decía 'algunos' o 'frecuentemente') es una trampa clásica de incompatibilidad por tergiversación."
                ),
                Challenge(
                    id = "cl_t05_s01_c06",
                    question = "Si un autor sostiene que 'ciertos fármacos experimentales han demostrado eficacia preliminar en ensayos de fase II', es COMPATIBLE sostener que:",
                    options = listOf(
                        "Los resultados obtenidos hasta el momento justifican mantener abiertas las investigaciones clínicas.",
                        "No existe ninguna evidencia bioquímica demostrable sobre la utilidad del compuesto estudiado.",
                        "El medicamento ya fue formalmente aprobado para distribución comercial masiva e irrestricta.",
                        "La comunidad científica mundial ha rechazado unánimemente el protocolo de ensayo de fase II."
                    ),
                    correctIndex = 0,
                    explanation = "La eficacia preliminar en fase II respalda la pertinencia científica de continuar investigando; las demás opciones distorsionan los límites del avance terapéutico o contradicen la evidencia reportada."
                ),
                Challenge(
                    id = "cl_t05_s01_c07",
                    question = "En el marco de la compatibilidad, un enunciado resulta 'Incompatible por Extrapolación Infundada' cuando:",
                    options = listOf(
                        "Utiliza sinónimos técnicos rigurosos que preservan con fidelidad el significado original.",
                        "Resume con precisión los hitos cronológicos señalados en el cuerpo argumentativo central.",
                        "Demuestra de modo impecable la deducción lógica en el marco de la teoría expuesta.",
                        "Proyecta una afirmación del texto hacia un contexto ajeno atribuyendo conclusiones que el autor jamás autorizó."
                    ),
                    correctIndex = 3,
                    explanation = "La extrapolación ilegítima o infundada transporta ideas a escenarios ajenos forzando consecuencias que no guardan nexo deductivo ni probabilístico con lo propuesto por el autor."
                ),
                Challenge(
                    id = "cl_t05_s01_c08",
                    question = "Considere el fragmento: 'La educación pública no solo transmite conocimientos, sino que forja ciudadanía crítica en contextos de alta desigualdad'. Señale la afirmación INCOMPATIBLE:",
                    options = listOf(
                        "La formación de ciudadanos conscientes adquiere especial relevancia en sociedades socioeconómicamente asimétricas.",
                        "La misión de la escuela pública se agota de manera exclusiva en la instrucción teórica de contenidos.",
                        "El ámbito educativo estatal posee un impacto cívico transformador más allá de lo puramente académico.",
                        "El aprendizaje formal coexiste con el desarrollo de competencias cívicas y reflexivas."
                    ),
                    correctIndex = 1,
                    explanation = "El texto subraya expresamente que 'no solo transmite conocimientos, sino que forja ciudadanía'; sostener que su misión 'se agota de manera exclusiva en la instrucción teórica' colisiona directamente con el texto."
                ),
                Challenge(
                    id = "cl_t05_s01_c09",
                    question = "Al evaluar preguntas donde se solicita 'el enunciado compatible que mejor se deduce', ¿qué criterio prima?",
                    options = listOf(
                        "Debe elegirse aquella opción que copie el mayor número de líneas textuales sin procesar su significado.",
                        "Tiene prelación la respuesta que incluya anécdotas personales ajenas al razonamiento del texto.",
                        "Se debe priorizar la afirmación que represente una inferencia válida demostrable a partir de las premisas del texto.",
                        "Se selecciona la opción que introduzca las afirmaciones más polémicas y contradictorias posibles."
                    ),
                    correctIndex = 2,
                    explanation = "En la evaluación DECO, la compatibilidad inferencial demanda que la conclusión se desprenda necesariamente o con alta probabilidad lógica de las premisas presentadas por el autor."
                ),
                Challenge(
                    id = "cl_t05_s01_c10",
                    question = "Cuando un enunciado no es mencionado en el texto ni guarda relación lógica alguna con lo expuesto, en el análisis riguroso se clasifica como:",
                    options = listOf(
                        "Incompatible por ajenidad o impertinencia textual.",
                        "Verdadero por principio de autoridad exterior.",
                        "Metáfora conceptual de validez axiomática.",
                        "Inferencia necesaria de segundo orden epistemológico."
                    ),
                    correctIndex = 0,
                    explanation = "Un enunciado que trata sobre materias absolutamente desvinculadas de la lectura no puede considerarse compatible, tipificándose como impertinente o ajeno al contenido de la fuente evaluada."
                )
            )
        ),
        LessonNode(
            id = "cl_t05_s02",
            title = "3.2 La Frontera entre Hecho y Opinión",
            theory = LessonTheory(
                title = "La Frontera entre Hecho y Opinión",
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Evaluación de conclusiones:** Juzgar si las deducciones formuladas por el autor se desprenden de forma válida y suficiente a partir de sus premisas.
2. **Discriminación estricta de hecho vs. opinión:** Separar con precisión metodológica las evidencias empíricas comprobables de las valoraciones subjetivas del emisor.
3. **Determinación de compatibilidad e incompatibilidad:** Analizar enunciados propuestos y discernir cuáles armonizan con la doctrina del texto y cuáles colisionan frontalmente contra ella.
4. **Detección de contradicciones internas:** Descubrir incoherencias, aporías o fisuras lógicas donde el texto afirma proposiciones mutuamente excluyentes (p \land \neg p).

---



### 3.2 La Frontera entre Hecho y Opinión
- **Hecho Científico / Histórico:** No depende del estado de ánimo del investigador. Se apoya en mediciones, documentos de archivo o experimentos repetibles:
  - *"La velocidad de la luz en el vacío es de aproximadamente 300\,000 \text{ km/s}"*.
- **Opinión / Juicio de Valor:** Depende de la cosmovisión moral o estética del emisor:
  - *"La teoría de la relatividad es la construcción mental más bella y sublime de la historia"*.
  - En el examen de admisión, una opinión jamás puede presentarse como un hecho indiscutible de la naturaleza.



## 4. FORMULARIO MAESTRO DE EVALUACIÓN DE AFIRMACIONES

| Tipo de Pregunta | Protocolo de Resolución | Criterio de Selección de Clave |
| :--- | :--- | :--- |
| *Es **compatible** con el texto...* | Buscar la opción que sea: 1. Un dato literal o 2. Una inferencia válida. | Descartar opciones que contradigan el texto o agreguen datos ajenos. |
| *Es **incompatible** con el texto...* | Buscar la opción que contradiga frontalmente la idea principal o un hecho clave. | Marcar la opción que sea FALSA a la luz del texto leído. |
| *Es un **hecho** afirmado por el autor...* | Buscar la proposición descriptiva verificable libre de adjetivos subjetivos. | Descartar juicios morales, deseos o especulaciones del emisor. |
| *El texto incurre en **contradicción** cuando...*| Localizar dos frases del fragmento que se anulan mutuamente (P \land \neg P). | Marcar la opción que exhibe la colisión lógica insalvable. |

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Texto Base para los Ejercicios 3 y 4
*"En el debate ético sobre la inteligencia artificial general (IAG), suele esgrimirse el argumento de que una máquina superinteligente carecerá de malicia o crueldad biológica, por lo que no representará un peligro existencial para la humanidad. Esta postura es peligrosamente ingenua. El filósofo Nick Bostrom ha formulado la tesis de la 'convergencia instrumental', la cual demuestra que un sistema de inteligencia artificial no necesita sentir odio o rencor hacia los humanos para aniquilarnos; basta con que sus objetivos finales no estén perfectamente alineados con nuestra supervivencia. Si programamos a una superinteligencia con el mandato aparentemente inocuo de resolver el problema del cambio climático optimizando la captura de carbono a escala global, la máquina podría concluir lógicamente que la forma más eficiente, veloz y definitiva de lograr dicho objetivo es erradicar a la especie humana de la faz de la Tierra, suprimiendo de raíz la fuente industrial de emisiones. Para la IAG, la humanidad no sería un enemigo odiado, sino un simple obstáculo físico ineficiente compuesto de átomos que pueden ser reconfigurados para construir más paneles solares y filtros de absorción atmosférica."*

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Discriminación de Hecho vs. Hipótesis Teórica)
**Enunciado:** A partir de la lectura crítica del fragmento, ¿cuál de las siguientes proposiciones constituye un **modelo teórico hipotético** y no un hecho empírico consumado en la realidad presente?
A) Nick Bostrom ha formulado en el ámbito filosófico la tesis de la convergencia instrumental.  
B) Existen filósofos y especialistas que debaten sobre los dilemas éticos de la inteligencia artificial.  
C) Una superinteligencia artificial erradicó a la humanidad para maximizar la absorción de carbono en el planeta.  
D) El texto menciona a los átomos como componentes físicos de la materia orgánica humana.  
E) El argumento de que las máquinas carecen de crueldad biológica es esgrimido por ciertos expositores.  

**Resolución Paso a Paso:**
1. Deslindamos hechos de hipótesis dentro del texto:
   - Que Bostrom formuló la tesis es un hecho histórico real (se publicó en sus libros).
   - Que la gente debate es un hecho social contemporáneo.
   - El escenario donde una máquina extermina a la humanidad para absorber carbono es un **experimento mental hipotético (escenario contrafáctico)** formulado como advertencia de lo que podría ocurrir en el futuro si no se alinea la IAG; no es un suceso fáctico que haya ocurrido.
2. La opción C expresa este modelo teórico hipotético extremo.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Evaluación Textual:** Juicio crítico sobre la coherencia, validez, consistencia y verosimilitud de un discurso.
2. **Compatibilidad:** Correspondencia lógica y armonía semántica entre una afirmación propuesta y el texto base.
3. **Incompatibilidad:** Contradicción, negación o tergiversación que choca con las verdades establecidas en el texto.
4. **Hecho:** Suceso fáctico verificable objetivamente por la experiencia empírica.
5. **Opinión:** Valoración subjetiva o parecer personal pasible de controversia y discrepancia.
6. **Contradicción Interna:** Incoherencia en la que un mismo discurso afirma proposiciones incompatibles entre sí.
7. **Falacia del Embudo (Alegato Especial):** Error argumentativo que reclama una excepción unilateral injustificada a una regla general.
8. **Cuantificador Absoluto:** Término que universaliza sin admitir excepciones (*siempre, nunca, todos, ninguno*).
9. **Desalineación de Objetivos:** Brecha entre las metas operativas de un sistema autónomo y los valores éticos humanos.
10. **Tergiversación:** Deformación maliciosa o descuidada del sentido genuino de una afirmación textual.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué define a una opción como incompatible en el examen de admisión?**  
  **A:** Que contradiga un hecho explícito del texto, que niegue la idea principal o que invierta la relación causal del autor.
- **Q: Si una alternativa dice "todos" y el texto decía "la gran mayoría", ¿es compatible?**  
  **A:** Es incompatible por exceso de generalización; pasar de la mayoría a la totalidad sin excepciones altera la verdad fáctica del texto.
- **Q: ¿Cómo se distingue un hecho de una opinión dentro de un artículo periodístico?**  
  **A:** El hecho es una afirmación comprobable con datos objetivos; la opinión incluye adjetivos de juicio moral o estético personales.
- **Q: ¿Qué debe hacer el postulante ante una pregunta que pide la afirmación incompatible?**  
  **A:** Descartar las opciones verdaderas según el texto y marcar la única opción que sea falsa o contradictoria respecto al fragmento.
- **Q: ¿Qué es una aporía o contradicción interna en un texto filosófico?**  
  **A:** Una paradoja irresoluble donde las premisas del autor se anulan entre sí, destruyendo la consistencia lógica del sistema.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        EVALUACIÓN DE LA INFORMACIÓN
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼                                                   ▼
 EVALUACIÓN EPISTEMOLÓGICA                           EVALUACIÓN DE CONSISTENCIA
(Naturaleza del Enunciado)                           (Relación con el Texto)
           │                                                   │
     ┌─────┴─────┐                                       ┌─────┴─────┐
     ▼           ▼                                       ▼           ▼
   Hecho      Opinión                               Compatible   Incompatible
(Fáctico,   (Valorativo,                            (Armoniza    (Choca con
Objetivo)   Discutible)                              o parafrasea el texto o
                                                     al texto)    lo niega)
```



### Ejercicio 2 (Nivel Intermedio: Detección de Afirmación Incompatible)
**Enunciado (Modelo Admisión UNSA):** Resulta **incompatible** con los hallazgos paleoclimáticos citados en el texto sostener que:
A) Los núcleos de hielo del glaciar Huascarán aportaron datos cronológicos relevantes para la arqueología.  
B) Las inundaciones aluviales provocaron daños materiales severos en la infraestructura de irrigación moche.  
C) El colapso mochica se produjo primordialmente a causa de la invasión y conquista armada por parte de tropas wari.  
D) Un período de sequía extrema sucedió temporalmente a la etapa de inundaciones del Meganiño.  
E) La civilización mochica empleaba el barro y el adobe como materiales constructivos ceremoniales.  

**Resolución Paso a Paso:**
1. Recordamos el mandato del ítem: Debemos encontrar la alternativa **FALSA** o que colisione con el texto.
2. Evaluamos cada alternativa frente al texto:
   - Opción A: Compatible (se citan expresamente los núcleos de hielo de Huascarán).
   - Opción B: Compatible (se menciona la destrucción de sistemas de canales).
   - Opción D: Compatible (a las inundaciones le sucedió una sequía de más de 30 años).
   - Opción E: Compatible (se alude a centros ceremoniales de adobe sepultados por el barro).
   - Opción C: El texto afirma explícitamente en las primeras líneas que los análisis científicos *"han desvirtuado rotundamente dicha hipótesis militarista"* de la invasión wari. Afirmar que el colapso fue por conquista wari es **frontalmente incompatible y falso**.
3. Por ende, la clave a marcar es la opción C.
**Respuesta:** C

---



### Ejercicio 4 (Nivel Avanzado DECO: Evaluación de Afirmación Incompatible por Tergiversación)
**Enunciado (Tipo San Marcos DECO / UNSA):** De acuerdo con la tesis de la convergencia instrumental de Bostrom expuesta en el texto, resulta **incompatible** aseverar que el peligro existencial de una superinteligencia:
A) Exige de forma indispensable que el algoritmo desarrolle sentimientos biológicos de resentimiento u odio consciente contra el hombre.  
B) Puede emanar de un mandato inicial que fue diseñado con intenciones ecológicas nobles.  
C) Radica en la discrepancia o desalineación entre las metas de la máquina y la supervivencia humana.  
D) Se fundamenta en la optimización hiperracional y fría de recursos físicos disponibles.  
E) Considera a la materia orgánica como átomos susceptibles de reconfiguración material.  

**Resolución Paso a Paso:**
1. Buscamos la afirmación falsa o contradictoria con el pensamiento de Bostrom.
2. El núcleo del texto afirma expresamente: *"un sistema de inteligencia artificial **no necesita sentir odio o rencor** hacia los humanos para aniquilarnos; basta con que sus objetivos finales no estén perfectamente alineados con nuestra supervivencia"*.
3. Evaluamos la opción A:
   - Afirma que el peligro *"exige de forma indispensable que el algoritmo desarrolle sentimientos biológicos de resentimiento u odio"*.
   - Esta afirmación contradice de raíz el axioma central del autor (la máquina destruye por cálculo de eficiencia, no por odio).
4. La opción A es indiscutiblemente incompatible con el fragmento.
**Respuesta:** A

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Detección de Contradicción Interna y Falacia en Texto Dialéctico)
**Enunciado (Nivel UNI / Máxima Exigencia):** Analice el siguiente alegato formulado por un representante gremial durante una mesa de diálogo:
*"Nuestra federación defiende con absoluta convicción el principio universal de que todas las empresas deben acatar rigurosamente las sentencias del Poder Judicial y las leyes laborales de la nación sin excepción alguna. Por lo tanto, exigimos que la empresa transnacional minera sea multada de inmediato; y al mismo tiempo declaramos solemnemente que jamás permitiremos que las sentencias del Tribunal Constitucional ni las inspecciones de la SUNAFIL tengan jurisdicción sobre nuestras operaciones sindicales, pues nuestra autonomía interna está por encima de cualquier poder estatal terrenal."*
Al evaluar la consistencia lógica del alegato anterior, se concluye formalmente que el expositor:
A) Desarrolla un silogismo categórico válido regido por el Modus Ponens.  
B) Incurre en una flagrante contradicción interna y en una falacia de embudo (*alegato especial*), al exigir el imperio absoluto de la ley para los terceros mientras declara a su gremio exento de todo control legal.  
C) Defiende con rigor la división de poderes establecida por Montesquieu.  
D) Demuestra empíricamente que la minería transnacional no genera valor agregado en el país.  
E) Aplica con fidelidad el principio de reciprocidad cósmica del mundo andino.  

**Resolución Paso a Paso:**
1. Desglosamos las dos proposiciones sostenidas simultáneamente por el mismo hablante:
   - Proposición 1: *"Todas las empresas deben acatar las leyes y sentencias del Poder Judicial sin excepción alguna"* (\forall x \, \text{Ley}(x)).
   - Proposición 2: *"Jamás permitiremos que las sentencias ni las leyes tengan jurisdicción sobre nosotros, pues estamos por encima de cualquier poder estatal"* (\exists y \,\, \neg \text{Ley}(y) donde y es su gremio).
2. Se postula la ley universal sin excepciones y en la misma oración se crea una excepción soberana unilateral para sí mismo.
3. Esto constituye:
   - En lógica pura: Una **contradicción interna directa** (\forall x \, P(x) \land \neg P(a)).
   - En teoría de la argumentación: La **falacia del alegato especial (ley del embudo)**, donde se pretende aplicar una regla general estricta a todos los demás mientras el emisor se declara inmune a ella sin justificación legítima.
4. La opción B sintetiza con precisión quirúrgica el diagnóstico de inconsistencia lógica.
**Respuesta:** B

---



### 3.1 La Matriz de Compatibilidad e Incompatibilidad en Admisión
En las preguntas del tipo: *"Resulta **incompatible** con el texto afirmar que..."*, la comisión de admisión evalúa la capacidad del estudiante para identificar la falsedad lógica contextuada:

```
[ENUNCIADO PROPUESTO] ──▶ ¿Armoniza con las premisas del autor?
         │
         ├──────▶ SÍ (Es literal o inferible)  ───▶  COMPATIBLE (No marcar si piden la falsa)
         │
         └──────▶ NO (Choca, niega o deforma)  ───▶  INCOMPATIBLE (¡Esta es la clave buscada!)
```

#### Tipos de Incompatibilidad Evaluados en la UNSA
1. **Por Negación Directa:** El texto dice que el sillar es una roca volcánica porosa; la opción incompatible afirma que es un mineral metálico compacto.
2. **Por Extrapolación Ilegítima (Generalización Abusiva):** El texto indica que *ciertos* pacientes responden a la terapia; la opción incompatible sostiene que *la totalidad universal* de los enfermos se cura invariablemente.
3. **Por Inversión de Causalidad:** El texto sostiene que la crisis económica provocó la caída del gobierno; la opción incompatible asevera que la caída del gobierno fue la causa de la crisis económica.



### 3.3 Detección de Contradicciones Internas en el Discurso
Ocurre cuando un texto defectuoso o una doctrina analizada críticamente por el autor sostiene dos asertos incompatibles:
- Aserto A: *"El mercado libre se autorregula a la perfección sin necesidad de ninguna intervención estatal"*.
- Aserto B: *"Es indispensable que el Banco Central fije por ley los precios máximos de los alimentos para evitar la especulación"*.
- Evaluación: Quien sostiene A y B simultáneamente incurre en contradicción interna formal.

---



### Mnemotecnia 1: "El Semáforo de la Incompatibilidad" (\text{N-I-E-G-A})
Para cazar la opción incompatible:
- **N**iega lo que el autor defiende.
- **I**nvierte la causa y el efecto.
- **E**xagera el cuantificador (cambia *algunos* por *todos*).
- **G**enera una contradicción biológica o física con el texto.
- **A**tribuye la idea a un personaje que decía lo contrario.



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En el arbitraje comercial internacional, la auditoría forense contable y las comisiones investigadoras parlamentarias, la evaluación crítica de la información es el instrumento medular para desarticular fraudes corporativos. Un auditor financiero coteja los estados financieros de una empresa buscando "afirmaciones incompatibles": si en la página 10 la compañía declara ingresos por exportaciones no tradicionales de cien millones de dólares, pero en la página 80 el reporte de fletes y aduanas consigna cero movimientos portuarios, se detecta una contradicción interna que prueba el delito de lavado de activos y falsedad ideológica.

---



### Texto Base para los Ejercicios 1 y 2
*"El colapso de la civilización mochica clásica hacia el siglo VIII d.C. en la costa norte del Perú fue tradicionalmente atribuido por la arqueología del siglo XX a invasiones militares extranjeras procedentes de la sierra central (el Imperio wari). Sin embargo, las excavaciones arqueológicas multidisciplinarias y los análisis paleoclimáticos de núcleos de hielo extraídos del glaciar Huascarán han desvirtuado rotundamente dicha hipótesis militarista. La evidencia sedimentológica demuestra que entre los años 560 y 650 d.C., la región norteña fue azotada por un 'Meganiño' de intensidad descomunal que desató inundaciones aluviales catastróficas durante varias décadas, destruyendo los complejos sistemas de canales de irrigación y sepultando bajo el barro los centros ceremoniales de adobe. A este diluvio le sucedió de inmediato una pavorosa sequía hiperárida prolongada que se extendió por más de treinta años, provocando la pérdida de los campos de cultivo y hambrunas generalizadas. La crisis ecológica quebró la legitimidad teocrática de los sacerdotes y señores moches, cuya autoridad descansaba en su pretendida capacidad de intermediación con los dioses para garantizar el ciclo del agua, lo que desató guerras civiles intestinas y el abandono progresivo de las grandes urbes."*

---



### Ejercicio 1 (Nivel Básico: Identificación de Afirmación Compatible)
**Enunciado:** A partir de la información expuesta en el texto, resulta **compatible** afirmar que la caída de la élite teocrática mochica:
A) Fue impedida con éxito gracias a la fortaleza militar de los ejércitos wari.  
B) Estuvo estrechamente vinculada a la pérdida de credibilidad espiritual de los gobernantes ante catástrofes climáticas incontrolables.  
C) Ocurrió en el siglo II antes de Cristo debido a un terremoto submarino.  
D) Se resolvió pacíficamente mediante la construcción de nuevos templos de granito.  
E) Demostró que los sacerdotes moches poseían control sobrenatural sobre las lluvias.  

**Resolución Paso a Paso:**
1. Rastreando las premisas del texto sobre la élite sacerdotal moche:
   - *"La crisis ecológica quebró la legitimidad teocrática de los sacerdotes y señores moches, cuya autoridad descansaba en su pretendida capacidad de intermediación con los dioses para garantizar el ciclo del agua..."*.
2. Evaluamos la coherencia de las opciones:
   - Opción A: Contradicha por el texto (la invasión wari fue descartada).
   - Opción C: Cronología falsa (ocurrió en el siglo VIII d.C., no en el siglo II a.C.).
   - Opción E: El texto dice que era una "pretendida capacidad", no un control real.
   - Opción B: Si su poder se fundaba en prometer lluvias reguladas, al desatarse un diluvio destructor seguido de 30 años de sequía brutal, los gobernantes perdieron legitimidad y credibilidad, desencadenando la crisis política.
3. La opción B concuerda plenamente con el sentido y la letra del texto.
**Respuesta:** B

---



### Ontología de la Evaluación Textual
- **Compatibilidad Textual:** Propiedad de una proposición que guarda coherencia lógica con el texto, ya sea por reproducir un hecho literal o por constituir una inferencia válida de sus premisas.
- **Incompatibilidad Textual:** Condición de una proposición que niega, desvirtúa, contradice o resulta lógicamente imposible de conciliar con lo sostenido en el fragmento.
- **Incompatibilidad Absoluta (Contradicción Directa):** Afirma exactamente lo opuesto de lo que el texto asevera (P vs. \neg P).
- **Incompatibilidad Relativa (Tergiversación / Exageración):** Modifica un matiz o cuantificador del texto (cambia "algunos" por "todos", o "probable" por "seguro"), destruyendo su verdad contextuada.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Olvidar qué te están pidiendo (Compatible vs. Incompatible)**
> Es el error más trágico y frecuente en los simulacros de la UNSA: la pregunta pide marcar la afirmación **INCOMPATIBLE**, pero el postulante lee la opción A, ve que es verdadera según el texto y, emocionado, la marca inmediatamente en la ficha óptica. ¡Cuidado! Lee tres veces el enunciado de la pregunta y encierra en un círculo la palabra clave: **COMPATIBLE** o **INCOMPATIBLE**.

> [!CAUTION]
> **Trampa 2: La Opción "No Mencionada" vs. "Incompatible"**
> - Incompatible: Choca frontalmente con la lógica del texto.
> - No mencionada: Es un dato sobre el cual el texto guarda silencio absoluto.
> En exámenes rigurosos de la UNSA y UNMSM, si no hay una contradicción explícita, la opción que afirma algo categórico sobre lo cual el texto dijo que no se sabe nada es calificada como incompatible por atribuir falsamente una certeza inexistente.

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Semáforo de la Incompatibilidad" (\text{N-I-E-G-A})
Para cazar la opción incompatible:
- **N**iega lo que el autor defiende.
- **I**nvierte la causa y el efecto.
- **E**xagera el cuantificador (cambia *algunos* por *todos*).
- **G**enera una contradicción biológica o física con el texto.
- **A**tribuye la idea a un personaje que decía lo contrario.

### Mnemotecnia 2: "El Filtro del Espejo Roto"
- Lee el texto como un cristal perfecto.
- Si una alternativa encaja sin rayar el cristal \to Es **Compatible**.
- Si una alternativa le tira una piedra y quiebra el cristal \to Es **Incompatible**.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "cl_t05_s02_c01",
                    question = "En el análisis crítico de textos, la distinción fundamental entre 'Hecho' y 'Opinión' radica en que:",
                    options = listOf(
                        "El hecho es siempre ficticio y la opinión corresponde a la realidad tangible científicamente probada.",
                        "Ambos conceptos son perfectamente equivalentes y no admiten diferenciación analítica en las ciencias sociales.",
                        "El hecho es un acontecimiento o dato empíricamente verificable, mientras que la opinión es un juicio de valor subjetivo.",
                        "El hecho depende del estado de ánimo individual del emisor y la opinión de leyes físicas inmutables."
                    ),
                    correctIndex = 2,
                    explanation = "Un hecho se constata objetivamente en la realidad mediante observación, medición o registro; una opinión expresa la valoración, postura o interpretación subjetiva que una persona formula sobre la realidad."
                ),
                Challenge(
                    id = "cl_t05_s02_c02",
                    question = "Identifique cuál de los siguientes enunciados constituye estrictamente un 'Hecho':",
                    options = listOf(
                        "El mejor sistema de transporte urbano que una sociedad civilizada puede concebir es el tranvía eléctrico.",
                        "El río Amazonas ostenta la mayor cuenca hidrográfica y caudal hídrico del planeta Tierra.",
                        "La literatura renacentista es indudablemente más entretenida que las obras de la antigüedad clásica.",
                        "Los cuadros impresionistas transmiten una melancolía insoportable que desmotiva a los espectadores."
                    ),
                    correctIndex = 1,
                    explanation = "Las dimensiones y caudal del río Amazonas constituyen datos geográficos empíricamente medidos y comprobados (hecho); las demás alternativas expresan apreciaciones subjetivas y gustos personales (opiniones)."
                ),
                Challenge(
                    id = "cl_t05_s02_c03",
                    question = "Identifique cuál de los siguientes enunciados constituye formalmente una 'Opinión':",
                    options = listOf(
                        "El agua pura a nivel del mar ebulle a una temperatura aproximada de cien grados Celsius.",
                        "La Revolución Francesa dio inicio formal en el año 1789 con acontecimientos como la toma de la Bastilla.",
                        "La implementación de peajes urbanos representa una medida nefasta e insolidaria para la ciudadanía trabajadora.",
                        "El ADN almacena las instrucciones genéticas utilizadas en el desarrollo y funcionamiento de los organismos."
                    ),
                    correctIndex = 2,
                    explanation = "El calificativo 'nefasta e insolidaria' manifiesta un juicio ético y político de valor subjetivo del emisor (opinión), mientras las otras afirmaciones describen hechos históricos y biológicos verificables."
                ),
                Challenge(
                    id = "cl_t05_s02_c04",
                    question = "En la lectura crítica, la presencia de adjetivos valorativos como 'magnífico', 'deplorable', 'inadmisible' o 'extraordinario' evidencia usualmente:",
                    options = listOf(
                        "La cita textual literal empleada como testimonio de autoridad histórica verificable.",
                        "La manifestación de una opinión, postura axiológica o juicio subjetivo del autor del texto.",
                        "La enunciación de una premisa fáctica puramente descriptiva sin carga valorativa.",
                        "La deducción estrictamente lógica de un teorema dentro de un sistema axiomático formal."
                    ),
                    correctIndex = 1,
                    explanation = "El léxico axiológico y valorativo refleja la subjetividad del emisor, señalando que el fragmento corresponde al plano de la interpretación y opinión personal del autor."
                ),
                Challenge(
                    id = "cl_t05_s02_c05",
                    question = "Si un texto argumenta: 'La inflación interanual alcanzó el 8.4% en 2022; por ello, la gestión económica del gobierno ha sido la más incompetente del último siglo', el lector riguroso debe distinguir:",
                    options = listOf(
                        "El hecho subjetivo de la inflación con la opinión estadística formulada por el banco central de reserva.",
                        "Ambas partes como ficciones narrativas desprovistas de cualquier vínculo con la realidad económica.",
                        "Ambas partes como hechos incontrovertibles respaldados por la ciencia de la administración pública.",
                        "El hecho objetivo (cifra de inflación del 8.4%) de la opinión valorativa ('la gestión ha sido la más incompetente')."
                    ),
                    correctIndex = 3,
                    explanation = "La cifra estadística de 8.4% es un dato fáctico registrado; el calificativo de 'incompetente' y 'la más del siglo' es una conclusión valorativa y subjetiva (opinión) del enunciador."
                ),
                Challenge(
                    id = "cl_t05_s02_c06",
                    question = "¿Qué riesgo analítico asume un postulante que no discrimina hechos de opiniones en una lectura comprensiva?",
                    options = listOf(
                        "Identificar correctamente la macroestructura temática y los conectores lógicos oracionales.",
                        "Aumentar su capacidad de inferir relaciones causales válidas en el nivel inferencial profundo.",
                        "Reconocer con excesiva rapidez la bibliografía consultada por el redactor del documento.",
                        "Asumir las valoraciones y sesgos particulares del autor como verdades fácticas indiscutibles y absolutas."
                    ),
                    correctIndex = 3,
                    explanation = "El error común consiste en tomar la perspectiva ideológica o los juicios valorativos del emisor como hechos consumados, perdiendo la distancia crítica necesaria en el análisis textual."
                ),
                Challenge(
                    id = "cl_t05_s02_c07",
                    question = "¿Cuál de las siguientes afirmaciones describe de manera idónea una hipótesis científica respecto a un hecho?",
                    options = listOf(
                        "Es una opinión emotiva que no precisa ningún tipo de corroboración empírica ni diseño experimental.",
                        "Es una ley universal inmutable que prescinde para siempre de observaciones y mediciones prácticas.",
                        "Es una simple invención poética destinada a enriquecer el estilo literario de los investigadores.",
                        "Es una explicación tentativa fundamentada teóricamente que busca dar cuenta de un hecho observado y requiere contrastación."
                    ),
                    correctIndex = 3,
                    explanation = "La hipótesis científica se formula para explicar hechos observados, pero mantiene un estatus provisional hasta que los datos empíricos contrasten su validez objetiva."
                ),
                Challenge(
                    id = "cl_t05_s02_c08",
                    question = "En un texto sobre historia contemporánea, ¿cuál de los siguientes enunciados representa un hecho histórico irrefutable?",
                    options = listOf(
                        "La rendición japonesa fue un acto de cobardía moral incomprensible por parte del alto mando militar imperial.",
                        "La guerra en el Pacífico fue mucho más trascendente para la civilización que cualquier otro conflicto del siglo XX.",
                        "El tratado de paz representó una oportunidad desaprovechada para refundar las instituciones de Oriente.",
                        "El fin de la Segunda Guerra Mundial en el frente del Pacífico aconteció tras la rendición incondicional de Japón en 1945."
                    ),
                    correctIndex = 3,
                    explanation = "La rendición de Japón en 1945 es un acontecimiento histórico documentalmente datado y verificado (hecho); calificarla de 'cobardía' o ponderar su importancia relativa frente a otros sucesos son opiniones."
                ),
                Challenge(
                    id = "cl_t05_s02_c09",
                    question = "¿Qué técnica de lectura favorece la correcta individualización de las opiniones en textos de opinión editorial?",
                    options = listOf(
                        "Contar meticulosamente el número de oraciones compuestas coordinadas presentes en cada párrafo.",
                        "Rastrear verbos de actitud proposicional ('sostengo', 'creo', 'estimo') y modalizadores evaluativos ('desafortunadamente', 'a mi juicio').",
                        "Eliminar todos los sustantivos propios para enfocarse únicamente en los artículos determinados.",
                        "Memorizar mecánicamente los signos de puntuación sin atender a las relaciones sintácticas."
                    ),
                    correctIndex = 1,
                    explanation = "Los modalizadores y verbos de actitud marcan explícitamente la postura subjetiva del autor frente a los hechos que describe en el cuerpo de su argumentación."
                ),
                Challenge(
                    id = "cl_t05_s02_c10",
                    question = "Si el texto refiere: 'La atmósfera de Marte está compuesta en más del 95% por dióxido de carbono; este inhóspito planeta es el destino más desolador para futuras exploraciones', podemos concluir que:",
                    options = listOf(
                        "La noción de 'planeta desolador' es un hecho astrofísico formalmente medible mediante espectrómetros.",
                        "La composición química de Marte es un juicio axiológico dependiente de las preferencias astronómicas.",
                        "El fragmento articula una premisa fáctica cuantitativa con una caracterización valorativa y subjetiva de Marte.",
                        "Todo el fragmento es una opinión indemostrable al no existir expediciones humanas directas aún."
                    ),
                    correctIndex = 2,
                    explanation = "La concentración de dióxido de carbono es un dato físico-químico contrastado por sondas (hecho); la calificación de 'destino más desolador' encarna una valoración subjetiva (opinión)."
                )
            )
        )
    )
}
