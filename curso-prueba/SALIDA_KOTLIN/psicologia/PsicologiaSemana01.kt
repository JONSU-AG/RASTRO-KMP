package psicologia

object PsicologiaSemana01 {

    val lessons = listOf(
        LessonNode(
            id = "psi_t01_s01",
            subjectId = "psicologia",
            semana = 1,
            subtema = "1.1",
            title = "3.1. Definición, Etimología y Evolución Epistemológica",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[LA PSICOLOGÍA CIENTÍFICA] --> B[Evolución Histórica]
    A --> C[Objeto de Estudio]
    A --> D[Métodos de Investigación]
    A --> E[Escuelas y Enfoques Modernos]

    B --> B1[Etapa Precientífica: Alma - Platón, Aristóteles]
    B --> B2[Nacimiento Científico: Wundt 1879, Leipzig]

    C --> C1[Conducta: Manifiesta, Observable, Medible]
    C --> C2[Procesos Mentales: Cognitivos, Afectivos, Conativos]

    D --> D1[Método Descriptivo y Observacional]
    D --> D2[Método Correlacional]
    D --> D3[Método Experimental: VI, VD, Control]
    D --> D4[Método Clínico y Genético]

    E --> E1[Estructuralismo vs. Funcionalismo]
    E --> E2[Psicoanálisis y Conductismo]
    E --> E3[Gestalt, Humanismo y Cognitivismo]
    E --> E4[Neurociencia y Enfoque Biopsicosocial]
```

---



## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Definición, Etimología y Evolución Epistemológica
- **Etimología:** Proviene de las voces griegas *psykhe* (alma, hálito vital o espíritu) y *logos* (estudio, tratado o razón).
- **Definición Científica Contemporánea:** Ciencia fáctica, social y natural que describe, explica, predice y modifica la **conducta humana** y los **procesos psicológicos** subyacentes en interacción con el entorno sociocultural y biológico.
- **Transición Histórica:**
  1. **Etapa Precientífica (Filosófica):**
     - *Platón:* Concepción dualista; el alma es inmaterial, inmortal y se encuentra atrapada en la cárcel del cuerpo (*Fedro*, *República*).
     - *Aristóteles:* Considerado el padre de la psicología antigua. Escribe *De Anima* (*Sobre el alma*), concibiendo el alma como entelequia o principio vital sustancial del cuerpo biológico (vegetativa, sensitiva y racional).
     - *René Descartes (Siglo XVII):* Dualismo cartesiano entre sustancia pensante (*res cogitans*) y sustancia extensa corpórea (*res extensa*), comunicadas en la glándula pineal.
  2. **Etapa Científica:**
     - **Hito Fundacional:** En **1879**, Wilhelm Wundt funda el **Primer Laboratorio de Psicología Experimental** en la Universidad de Leipzig (Alemania). La psicología se emancipa formalmente de la filosofía al adoptar el método experimental y la medición rigurosa de tiempos de reacción y sensaciones.



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



### 4.1. Escuelas Psicológicas Clásicas
| Escuela | Fundador / Representantes | Objeto Central | Método Principal | Aporte Histórico |
| :--- | :--- | :--- | :--- | :--- |
| **Estructuralismo** | Wilhelm Wundt, Edward Titchener | Estructura de la conciencia (sensaciones, imágenes, afectos) | Introspección analítica experimental | Primera escuela científica; independizó a la psicología. |
| **Funcionalismo** | William James, John Dewey | Función adaptativa de la conciencia al medio | Introspección y extrospección, pragmatismo | Precursor del conductismo y la psicología educativa. |
| **Conductismo** | John B. Watson, B.F. Skinner | Conducta observable y medible (E \to R) | Método experimental riguroso, extrospección | Leyes del condicionamiento; rechazo de lo mentalista. |
| **Gestalt** | Max Wertheimer, Köhler, Koffka | La percepción y la conciencia como totalidad organizada | Fenomenología experimental | "El todo es más que la suma de sus partes"; *insight*. |
| **Psicoanálisis** | Sigmund Freud, Carl Jung, Adler | El inconsciente dinámico, pulsiones psicosexuales | Asociación libre, análisis de sueños | Descubrimiento del aparato psíquico; psicopatología. |
| **Humanismo** | Abraham Maslow, Carl Rogers | El potencial humano, autorrealización y libre albedrío | Fenomenología clínica, terapia centrada en la persona | "Tercera fuerza"; visión holística positiva del ser humano. |
| **Cognitivismo** | Jean Piaget, Ulric Neisser, Bruner | Procesamiento de la información (mente como ordenador) | Modelado computacional, experimentación cognitiva | Revolución cognitiva; mediación entre estímulo y respuesta (E \to O \to R). |



### 4.2. Métodos de Investigación en Psicología
1. **Método Experimental:** Único método capaz de establecer **relaciones de causa-efecto**:
   - **Variable Independiente (VI):** Causa manipulada deliberadamente por el investigador.
   - **Variable Dependiente (VD):** Efecto o conducta medida para observar el impacto de la VI.
   - **Variables Extrañas (VE):** Factores ajenos que deben ser estrictamente controlados o aleatorizados para evitar sesgos.
   - **Grupos:** Grupo Experimental (recibe la VI) vs. Grupo Control (no recibe la VI o recibe placebo).
2. **Método Correlacional:** Evalúa el grado de asociación estadística lineal entre dos o más variables sin manipularlas:
   -1.00 \le r \le +1.00
   - r > 0: Correlación positiva directa (ambas aumentan).
   - r < 0: Correlación negativa inversa (una aumenta y la otra disminuye).
   - r = 0: Ausencia de correlación lineal.
   - *Regla de oro epistemológica:* **La correlación no implica causalidad.**
3. **Método Observacional y Descriptivo:** Registro sistemático de conductas en su entorno natural o en laboratorio (estudio de casos, encuestas, observación naturalista).

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fecha de Nacimiento de la Psicología:**
   > **"En el 79 Wundt se atrevió"** \implies **1879**, Wilhelm Wundt en Leipzig.
2. **Elementos de la Conciencia de Titchener:**
   > **"S-I-A"** \implies **S**ensaciones, **I**mágenes y **A**fectos (o sentimientos).
3. **Fórmula del Conductismo vs. Neoconductismo:**
   > Conductismo radical: **E - R** (Estímulo \to Respuesta).  
   > Neoconductismo / Cognitivismo: **E - O - R** (Estímulo \to Organismo mediador \to Respuesta).
4. **Metas de la Psicología:**
   > **"D-E-P-M"** \implies **D**escribir, **E**xplicar, **P**redecir y **M**odificar.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿Quién es el fundador?):** Si la pregunta pide el "fundador de la psicología antigua o filosófica", la clave es **Aristóteles**; si pide el "fundador de la psicología científica o moderna", la clave es **Wilhelm Wundt**.
- **Trampa 2 (Confundir Estructuralismo con Funcionalismo):** El estructuralismo preguntaba *¿QUÉ hay en la mente?* (elementos estáticos); el funcionalismo preguntaba *¿PARA QUÉ sirve la mente?* (función adaptativa de la conciencia).
- **Trampa 3 (Correlación vs. Causalidad):** Si un estudio muestra que "los estudiantes que duermen más obtienen mayores notas (r = +0.72)", el estudiante novato deduce erróneamente que "dormir causa mejores notas". La respuesta correcta DECO es: "existe una relación directamente proporcional o correlación positiva, pero no se puede concluir causalidad sin un diseño experimental controlado".

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Metas de la Psicología (Nivel Básico)
**Enunciado:** Un psicólogo educativo observa y anota cuidadosamente en un registro de frecuencia cuántas veces un niño se levanta de su asiento durante una clase de 45 minutos. ¿Qué meta u objetivo de la psicología está cumpliendo prioritariamente en esta fase?
A) Explicar  
B) Predecir  
C) Modificar  
D) Describir  
E) Controlar  

**Solución paso a paso:**
1. Las metas de la psicología son cuatro:
   - Describir: Responder al *¿cómo se manifiesta?*, recabando información cuantitativa o cualitativa de la conducta sin juzgar causas.
   - Explicar: Responder al *¿por qué ocurre?*, identificando causas y leyes.
   - Predecir: Anticipar conductas futuras bajo ciertas condiciones.
   - Modificar: Aplicar intervenciones para mejorar la conducta.
2. Registrar la frecuencia objetiva con la que el niño se para es un acto de recolección de datos observable. Por ende, corresponde a **describir**.

**Respuesta:** D) Describir.

---



### Problema 2: Identificación de Variables Experimentales (Nivel Intermedio)
**Enunciado:** Una investigadora desea probar la eficacia de una nueva técnica de respiración diafragmática para reducir la ansiedad ante exámenes de admisión. Para ello, selecciona a 60 postulantes con niveles similares de estrés: a 30 de ellos los entrena durante dos semanas en la técnica de respiración, mientras que a los otros 30 no les aplica ningún entrenamiento. Posteriormente, mide el nivel de cortisol salival en ambos grupos durante un simulacro real. En este diseño, la técnica de respiración diafragmática y el nivel de cortisol salival constituyen respectivamente:
A) Variable dependiente y variable independiente.  
B) Variable independiente y variable dependiente.  
C) Variable extraña y variable dependiente.  
D) Variable interviniente y variable de control.  
E) Variable independiente y variable extraña.  

**Solución paso a paso:**
1. La **Variable Independiente (VI)** es la condición manipulada por el experimentador como presunta causa. En este caso: la *técnica de respiración diafragmática*.
2. La **Variable Dependiente (VD)** es la respuesta o efecto medido para ver si cambió. En este caso: el *nivel de cortisol salival* (marcador biológico de la ansiedad).
3. Por ende, la relación ordenada es: Variable independiente y variable dependiente.

**Respuesta:** B) Variable independiente y variable dependiente.

---



### Problema 3: Escuelas Psicológicas y Fenomenología (Nivel Intermedio-Avanzado)
**Enunciado:** Cuando una persona observa cuatro puntos dispuestos en forma de cuadrado no percibe cuatro manchas aisladas, sino que su mente integra la figura como un "cuadrado completo", cerrando automáticamente los espacios vacíos. ¿Qué escuela psicológica explicó este fenómeno a través de sus leyes perceptivas del cierre o clausura?
A) Estructuralismo  
B) Funcionalismo  
C) Gestalt  
D) Psicoanálisis  
E) Humanismo  

**Solución paso a paso:**
1. La escuela de la **Gestalt** (creada por Max Wertheimer, Wolfgang Köhler y Kurt Koffka en Alemania) postuló que la mente configura los elementos que le llegan a través de los canales sensoriales mediante totalidades estructuradas.
2. Formularon las Leyes de la Percepción, entre ellas la **Ley de Cierre o Clausura**, según la cual la percepción tiende a completar figuras incompletas.

**Respuesta:** C) Gestalt.

---



### Problema 4: Enfoque Biopsicosocial y DECO (Nivel Avanzado)
**Enunciado:** Ricardo, de 19 años, asiste a consulta psicológica presentando síntomas de depresión mayor. El especialista determina que en el cuadro de Ricardo coexisten una predisposición genética (déficit de serotonina en su familia materna), un patrón de pensamientos distorsionados y rumiación pesimista aprendidos tras la separación de sus padres, y el aislamiento social debido al desempleo juvenil en su comunidad. El modelo integrador contemporáneo que utiliza el psicólogo para conceptualizar el caso de Ricardo es el:
A) Enfoque psicodinámico ortodoxo.  
B) Enfoque conductual radical.  
C) Enfoque biopsicosocial.  
D) Enfoque estructuralista.  
E) Modelo médico biologicista puro.  

**Solución paso a paso:**
1. El caso analiza tres niveles articulados:
   - Nivel Biológico: déficit de serotonina y base genética familiar.
   - Nivel Psicológico: esquemas cognitivos disfuncionales y rumiación.
   - Nivel Social: ruptura familiar y aislamiento por desempleo socioeconómico.
2. Propuesto originalmente por George Engel, el **modelo biopsicosocial** postula que la salud mental y la conducta son el resultado interactivo e indivisible de factores biológicos, psicológicos y socioculturales.

**Respuesta:** C) Enfoque biopsicosocial.

---



### Problema 5: Análisis Crítico de Métodos (Boss Challenge)
**Enunciado:** Un grupo de investigadores concluye en una prestigiosa revista científica que *"el uso de redes sociales deteriora el rendimiento académico en la universidad (r = -0.65, p < 0.01)"*. Ante esta publicación, un estudiante de epistemología señala tres afirmaciones:
I. El estudio demuestra fehacientemente que cancelar las cuentas de redes sociales provocará un incremento inmediato del promedio ponderado de los estudiantes.  
II. La correlación negativa indica que, en la muestra estudiada, a mayor tiempo invertido en redes sociales, tiende a registrarse un menor rendimiento académico.  
III. No es posible descartar la existencia de una tercera variable (como la falta de autorregulación emocional o la procrastinación crónica) que sea la causa real común de ambos fenómenos.  
¿Cuáles de las afirmaciones formuladas por el estudiante son epistemológicamente correctas?
A) Solo I  
B) Solo II  
C) I y II  
D) II y III  
E) I, II y III  

**Solución paso a paso:**
1. Análisis de I: **Falsa.** El estudio es correlacional (r = -0.65), no experimental. Por tanto, no demuestra relación causal de causa-efecto. Prohibir las redes no garantiza una mejora causal si no se aborda el origen.
2. Análisis de II: **Verdadera.** Una correlación negativa (r < 0) significa estrictamente covariación inversa: a mayor valor en una variable, menor valor promedio en la otra.
3. Análisis de III: **Verdadera.** En todo diseño correlacional existe el "problema de la tercera variable" (variable confusora): una variable latente (ej. déficit en hábitos de estudio o baja autorregulación) podría explicar tanto el exceso de redes como las bajas calificaciones.

**Respuesta:** D) II y III.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Cuál fue el método utilizado por Wilhelm Wundt y los estructuralistas que requería que sujetos entrenados describieran detalladamente sus vivencias conscientes ante estímulos controlados?
   - *Pista:* Introspección ligada a laboratorio.
   - *Clave:* Introspección experimental.

2. En un experimento psicológico sobre la memoria, se evalúa a dos grupos en retención de palabras: el grupo A escucha música clásica a 60 dB y el grupo B estudia en silencio absoluto. ¿Qué variable representa el tipo de ambiente sonoro?
   - *Pista:* Es la variable que el investigador manipula.
   - *Clave:* Variable independiente.

3. Corriente psicológica que sostiene que el ser humano posee una tendencia innata hacia la autorrealización y enfatiza el valor de la libertad personal y la empatía:
   - *Pista:* Fundada por Maslow y Rogers, llamada la "tercera fuerza".
   - *Clave:* Humanismo.

4. Si el coeficiente de correlación entre el nivel de autoestima y el nivel de ansiedad en una muestra clínica resulta ser r = -0.85, ¿cómo se interpreta esta relación?
   - *Pista:* Es una correlación negativa fuerte.
   - *Clave:* A mayor nivel de autoestima, menor nivel de ansiedad registrado.

5. Enfoque que concibe la mente humana mediante la analogía del ordenador, distinguiendo entre el soporte biológico (*hardware*) y los procesos mentales de entrada, almacenamiento y recuperación (*software*):
   - *Pista:* Escuela cognitiva fundada a partir de los años 50 y 60.
   - *Clave:* Enfoque cognitivo (procesamiento de información).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Conducta:** Respuesta motora, verbal o fisiológica observable y cuantificable emitida por un organismo frente a estímulos.
2. **Procesos Cognitivos:** Operaciones mentales internas que permiten aprehender, codificar, almacenar y transformar el conocimiento del mundo.
3. **Introspección Experimental:** Procedimiento sistemático mediante el cual una persona autoobserva y reporta sus propias experiencias sensoriales conscientes en condiciones de laboratorio estandarizadas.
4. **Variable Independiente (VI):** Factor manipulado deliberadamente por el experimentador para determinar su impacto causal en la variable dependiente.
5. **Variable Dependiente (VD):** Conducta o proceso medido por el investigador que se presume cambia como efecto de la variable independiente.
6. **Inconsciente (Psicoanálisis):** Estrato psíquico inaccesible a la introspección ordinaria, reservorio de pulsiones, deseos reprimidos y memorias traumáticas que gobiernan la conducta.
7. **Insight (Gestalt):** Comprensión súbita y reorganización perceptiva del campo problemático que conduce a la solución espontánea de una situación.
8. **Enfoque Biopsicosocial:** Paradigma científico que sostiene que la salud, el comportamiento y los trastornos psicológicos se derivan de la interacción compleja y recíproca de determinantes biológicos, psicológicos y sociales.
9. **Correlación Estadística:** Medida numérica (r de Pearson) que cuantifica la fuerza y dirección de la covariación lineal entre dos variables.
10. **Autorrealización:** Necesidad psicológica superior postulada por el humanismo consistente en el pleno despliegue de las potencialidades, talentos y propósitos personales.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿En qué año y con qué acontecimiento nace la psicología científica?**
  *R: En 1879, con la fundación del primer laboratorio de psicología experimental por Wilhelm Wundt en Leipzig, Alemania.*
- **P: ¿Cuál es la diferencia entre el estructuralismo y el funcionalismo?**
  *R: El estructuralismo buscaba los elementos anatómicos de la conciencia (sensación, imagen, afecto); el funcionalismo estudiaba la función adaptativa y práctica de la mente en el entorno.*
- **P: ¿Qué afirmaba John B. Watson respecto al objeto de estudio de la psicología?**
  *R: Que la psicología debía renunciar al estudio del alma y la conciencia subjetiva, y limitarse estrictamente a la conducta observable y medible (E \to R).*
- **P: ¿Una correlación estadística alta entre dos variables demuestra que una causa a la otra?**
  *R: No; correlación indica asociación matemática o covariación, pero la causalidad solo se demuestra mediante un diseño experimental riguroso.*
- **P: ¿Cuáles son las cuatro metas científicas de la psicología?**
  *R: Describir, explicar, predecir y modificar (o controlar).*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurociencias y Psiquiatría:** La integración entre la psicología cognitiva y la neurobiología mediante resonancia magnética funcional (fMRI) permite mapear en vivo los circuitos cerebrales del miedo (amígdala), la memoria episódica (hipocampo) y la toma de decisiones morales (corteza prefrontal dorsolateral).
- **Inteligencia Artificial y Ciencias de la Computación:** Las redes neuronales profundas y los modelos de procesamiento de lenguaje natural (LLMs) se inspiraron en las teorías cognitivas de esquemas mentales y procesamiento de información humana.
- **Salud Pública y Epidemiología:** El modelo biopsicosocial es el marco oficial de la Organización Mundial de la Salud (OMS) para la Clasificación Internacional del Funcionamiento, de la Discapacidad y de la Salud (CIF).

---



### 3.2. Objeto de Estudio de la Psicología
1. **La Conducta (Comportamiento):** Toda respuesta, acción, manifestación externa observable y medible que un organismo emite en relación con los estímulos de su entorno (ej. hablar, correr, llorar, tasa cardíaca).
2. **Los Procesos Mentales (Psíquicos o Cognitivos):** Actividades dinámicas internas del sistema nervioso y de la mente, subjetivas, no observables directamente, inferidas a través de la conducta:
   - **Procesos Cognitivos:** Permiten conocer, procesar y representar la realidad (sensación, percepción, memoria, pensamiento, lenguaje, imaginación).
   - **Procesos Afectivos:** Reflejan la relación valorativa entre el sujeto y su medio (emociones, sentimientos, pasiones, estados de ánimo).
   - **Procesos Conativos o Volitivos:** Orientan, regulan y sostienen la acción hacia metas elegidas conscientemente (motivación, voluntad, toma de decisiones).

---



# TEMA 01: LA PSICOLOGÍA COMO CIENCIA

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t01_s01_c01",
                    question = "Etimológicamente, la palabra Psicología deriva de las voces griegas 'Psyché' y 'Logos', cuyo significado original clásico es:",
                    options = listOf(
                        "Medición de la conducta observable.",
                        "Estudio del cerebro humano.",
                        "Tratamiento de las enfermedades mentales.",
                        "Tratado o estudio del alma.",
                    ),
                    correctIndex = 3,
                    explanation = "En la Grecia clásica (Platón y Aristóteles), psyché aludía al principio vital o alma inmaterial, y logos a tratado, estudio racional o discurso."
                ),
                Challenge(
                    id = "psi_t01_s01_c02",
                    question = "El nacimiento de la Psicología como ciencia experimental autónoma se produjo formalmente en 1879 en Leipzig (Alemania) cuando Wilhelm Wundt:",
                    options = listOf(
                        "Fundó el primer laboratorio de psicología experimental para estudiar la conciencia mediante la introspección analítica.",
                        "Publicó el libro 'La interpretación de los sueños'.",
                        "Demostró el condicionamiento reflejo en animales con saliva.",
                        "Formuló el test de cociente intelectual infantil.",
                    ),
                    correctIndex = 0,
                    explanation = "Wundt separó a la psicología de la tutela filosófica al aplicar el método experimental y la medición rigurosa de sensaciones y tiempos de reacción en su laboratorio de Leipzig."
                ),
                Challenge(
                    id = "psi_t01_s01_c03",
                    question = "La escuela psicológica del Estructuralismo, liderada por Edward Titchener en Estados Unidos a partir de las ideas de Wundt, sostenía que el objeto de estudio es:",
                    options = listOf(
                        "El inconsciente reprimido y la libido infantil.",
                        "La función adaptativa de la conducta para la supervivencia.",
                        "La estructura de la mente consciente descompuesta en sus elementos básicos: sensaciones, imágenes y sentimientos.",
                        "El condicionamiento de respuestas reflejas observables.",
                    ),
                    correctIndex = 2,
                    explanation = "El estructuralismo empleó la introspección experimental analítica para descomponer la experiencia consciente en átomos psicológicos elementales."
                ),
                Challenge(
                    id = "psi_t01_s01_c04",
                    question = "El Funcionalismo, corriente fundada por William James e influida decisivamente por la teoría evolucionista de Charles Darwin, postuló que la psicología debe estudiar:",
                    options = listOf(
                        "Las leyes matemáticas de la percepción visual.",
                        "Los complejos de castración y de Edipo en la infancia.",
                        "La estructura atómica del alma humana.",
                        "La función y utilidad adaptativa de los procesos mentales y la conciencia para la supervivencia del organismo en su medio.",
                    ),
                    correctIndex = 3,
                    explanation = "William James rechazó el atomismo estructuralista y estudió la mente como un flujo continuo ('corriente de la conciencia') cuyo fin supremo es la adaptación biológica y social."
                ),
                Challenge(
                    id = "psi_t01_s01_c05",
                    question = "En 1913, John B. Watson publicó el manifiesto conductista 'La psicología tal como la ve el conductista', rechazando tajantemente el estudio de la mente y la introspección para proponer como objeto exclusivo:",
                    options = listOf(
                        "Los arquetipos del inconsciente colectivo.",
                        "Las etapas del desarrollo psicosexual.",
                        "La conducta observable, medible y cuantificable en función del paradigma Estímulo - Respuesta (E - R).",
                        "La autorrealización espiritual de la persona.",
                    ),
                    correctIndex = 2,
                    explanation = "Watson postuló que para ser ciencia objetiva, la psicología debía prescindir de conceptos inobservables como 'conciencia' o 'mente', restringiéndose al registro experimental de la conducta motora."
                ),
                Challenge(
                    id = "psi_t01_s01_c06",
                    question = "La escuela de la Gestalt (Wertheimer, Köhler, Koffka) surgió en Alemania como reacción al atomismo, enunciando como principio epistemológico rector que:",
                    options = listOf(
                        "El pensamiento racional es un epifenómeno muscular.",
                        "El todo es mayor y diferente que la suma de sus partes constitutivas (enfoque holístico de la percepción y conciencia).",
                        "Toda motivación humana proviene de pulsiones de muerte.",
                        "La conducta se reduce a reflejos condicionados periféricos.",
                    ),
                    correctIndex = 1,
                    explanation = "La Gestalt demostró que el cerebro organiza holísticamente la información perceptual en totalidades integradas, configuraciones o formas con sentido (leyes gestálticas)."
                ),
                Challenge(
                    id = "psi_t01_s01_c07",
                    question = "El Psicoanálisis, creado por Sigmund Freud en Viena a fines del siglo XIX, revolucionó la psicología al sostener que la principal fuerza motivadora de la conducta reside en:",
                    options = listOf(
                        "La imitación deliberada de modelos paternos conscientes.",
                        "El cociente intelectual genéticamente heredado.",
                        "La estimulación ambiental externa directa.",
                        "El inconsciente dinámico, donde habitan pulsiones biológicas reprimidas, traumas infantiles y deseos sexuales y agresivos.",
                    ),
                    correctIndex = 3,
                    explanation = "Freud descubrió que los síntomas neuróticos y la conducta humana son guiados por determinantes inconscientes inaccesibles a la introspección consciente ordinaria, accesibles mediante la asociación libre."
                ),
                Challenge(
                    id = "psi_t01_s01_c08",
                    question = "La Psicología Humanista (llamada la 'Tercera Fuerza', con Maslow y Carl Rogers) se opuso tanto al mecanicismo conductista como al determinismo biológico psicoanalítico, enfocándose en:",
                    options = listOf(
                        "La medición neurofisiológica de sinapsis neuronales.",
                        "El potencial humano, la autorrealización, la libertad personal, el libre albedrío y la dignidad intrínseca de la persona.",
                        "El diagnóstico psiquiátrico de lesiones corticales.",
                        "El condicionamiento operante por programas de reforzamiento.",
                    ),
                    correctIndex = 1,
                    explanation = "El humanismo concibe al ser humano como un ser bondadoso y libre en búsqueda constante de crecimiento personal, plenitud existencial y autorrealización."
                ),
                Challenge(
                    id = "psi_t01_s01_c09",
                    question = "El enfoque Cognitivo contemporáneo (Piaget, Neisser, Ausubel) asume la metáfora computacional según la cual la mente humana funciona análogamente a:",
                    options = listOf(
                        "Una máquina hidráulica de fluidos pulsionales.",
                        "Un receptor pasivo que reacciona ciegamente a impulsos externos.",
                        "Una tabula rasa que solo graba copias fotográficas del medio.",
                        "Un sistema procesador activo de información que codifica, almacena, transforma y recupera datos para tomar decisiones.",
                    ),
                    correctIndex = 3,
                    explanation = "El cognitivismo rescata el estudio de los procesos mentales internos mediadores (E-O-R), concibiendo al individuo como un procesador activo de información y constructor de significados."
                ),
                Challenge(
                    id = "psi_t01_s01_c10",
                    question = "En la investigación psicológica, el método que permite establecer con certeza científica relaciones de causalidad mediante la manipulación deliberada de variables es el:",
                    options = listOf(
                        "Método correlacional observacional",
                        "Método experimental (manipulación de la variable independiente y control de variables extrañas)",
                        "Método biográfico anecdótico",
                        "Método de encuestas de opinión masiva",
                    ),
                    correctIndex = 1,
                    explanation = "Solo el experimento científico, al manipular la variable independiente (causa) para medir su impacto en la variable dependiente (efecto) controlando variables extrañas, permite verificar relaciones de causa-efecto."
                ),
            )
        ),
        LessonNode(
            id = "psi_t01_s02",
            subjectId = "psicologia",
            semana = 1,
            subtema = "1.2",
            title = "3.2. Objeto de Estudio de la Psicología",
            theory = LessonTheory(
                content = """# TEMA 01: LA PSICOLOGÍA COMO CIENCIA

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[LA PSICOLOGÍA CIENTÍFICA] --> B[Evolución Histórica]
    A --> C[Objeto de Estudio]
    A --> D[Métodos de Investigación]
    A --> E[Escuelas y Enfoques Modernos]

    B --> B1[Etapa Precientífica: Alma - Platón, Aristóteles]
    B --> B2[Nacimiento Científico: Wundt 1879, Leipzig]

    C --> C1[Conducta: Manifiesta, Observable, Medible]
    C --> C2[Procesos Mentales: Cognitivos, Afectivos, Conativos]

    D --> D1[Método Descriptivo y Observacional]
    D --> D2[Método Correlacional]
    D --> D3[Método Experimental: VI, VD, Control]
    D --> D4[Método Clínico y Genético]

    E --> E1[Estructuralismo vs. Funcionalismo]
    E --> E2[Psicoanálisis y Conductismo]
    E --> E3[Gestalt, Humanismo y Cognitivismo]
    E --> E4[Neurociencia y Enfoque Biopsicosocial]
```

---



### 3.2. Objeto de Estudio de la Psicología
1. **La Conducta (Comportamiento):** Toda respuesta, acción, manifestación externa observable y medible que un organismo emite en relación con los estímulos de su entorno (ej. hablar, correr, llorar, tasa cardíaca).
2. **Los Procesos Mentales (Psíquicos o Cognitivos):** Actividades dinámicas internas del sistema nervioso y de la mente, subjetivas, no observables directamente, inferidas a través de la conducta:
   - **Procesos Cognitivos:** Permiten conocer, procesar y representar la realidad (sensación, percepción, memoria, pensamiento, lenguaje, imaginación).
   - **Procesos Afectivos:** Reflejan la relación valorativa entre el sujeto y su medio (emociones, sentimientos, pasiones, estados de ánimo).
   - **Procesos Conativos o Volitivos:** Orientan, regulan y sostienen la acción hacia metas elegidas conscientemente (motivación, voluntad, toma de decisiones).

---



### Problema 1: Metas de la Psicología (Nivel Básico)
**Enunciado:** Un psicólogo educativo observa y anota cuidadosamente en un registro de frecuencia cuántas veces un niño se levanta de su asiento durante una clase de 45 minutos. ¿Qué meta u objetivo de la psicología está cumpliendo prioritariamente en esta fase?
A) Explicar  
B) Predecir  
C) Modificar  
D) Describir  
E) Controlar  

**Solución paso a paso:**
1. Las metas de la psicología son cuatro:
   - Describir: Responder al *¿cómo se manifiesta?*, recabando información cuantitativa o cualitativa de la conducta sin juzgar causas.
   - Explicar: Responder al *¿por qué ocurre?*, identificando causas y leyes.
   - Predecir: Anticipar conductas futuras bajo ciertas condiciones.
   - Modificar: Aplicar intervenciones para mejorar la conducta.
2. Registrar la frecuencia objetiva con la que el niño se para es un acto de recolección de datos observable. Por ende, corresponde a **describir**.

**Respuesta:** D) Describir.

---



### Problema 5: Análisis Crítico de Métodos (Boss Challenge)
**Enunciado:** Un grupo de investigadores concluye en una prestigiosa revista científica que *"el uso de redes sociales deteriora el rendimiento académico en la universidad (r = -0.65, p < 0.01)"*. Ante esta publicación, un estudiante de epistemología señala tres afirmaciones:
I. El estudio demuestra fehacientemente que cancelar las cuentas de redes sociales provocará un incremento inmediato del promedio ponderado de los estudiantes.  
II. La correlación negativa indica que, en la muestra estudiada, a mayor tiempo invertido en redes sociales, tiende a registrarse un menor rendimiento académico.  
III. No es posible descartar la existencia de una tercera variable (como la falta de autorregulación emocional o la procrastinación crónica) que sea la causa real común de ambos fenómenos.  
¿Cuáles de las afirmaciones formuladas por el estudiante son epistemológicamente correctas?
A) Solo I  
B) Solo II  
C) I y II  
D) II y III  
E) I, II y III  

**Solución paso a paso:**
1. Análisis de I: **Falsa.** El estudio es correlacional (r = -0.65), no experimental. Por tanto, no demuestra relación causal de causa-efecto. Prohibir las redes no garantiza una mejora causal si no se aborda el origen.
2. Análisis de II: **Verdadera.** Una correlación negativa (r < 0) significa estrictamente covariación inversa: a mayor valor en una variable, menor valor promedio en la otra.
3. Análisis de III: **Verdadera.** En todo diseño correlacional existe el "problema de la tercera variable" (variable confusora): una variable latente (ej. déficit en hábitos de estudio o baja autorregulación) podría explicar tanto el exceso de redes como las bajas calificaciones.

**Respuesta:** D) II y III.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Conducta:** Respuesta motora, verbal o fisiológica observable y cuantificable emitida por un organismo frente a estímulos.
2. **Procesos Cognitivos:** Operaciones mentales internas que permiten aprehender, codificar, almacenar y transformar el conocimiento del mundo.
3. **Introspección Experimental:** Procedimiento sistemático mediante el cual una persona autoobserva y reporta sus propias experiencias sensoriales conscientes en condiciones de laboratorio estandarizadas.
4. **Variable Independiente (VI):** Factor manipulado deliberadamente por el experimentador para determinar su impacto causal en la variable dependiente.
5. **Variable Dependiente (VD):** Conducta o proceso medido por el investigador que se presume cambia como efecto de la variable independiente.
6. **Inconsciente (Psicoanálisis):** Estrato psíquico inaccesible a la introspección ordinaria, reservorio de pulsiones, deseos reprimidos y memorias traumáticas que gobiernan la conducta.
7. **Insight (Gestalt):** Comprensión súbita y reorganización perceptiva del campo problemático que conduce a la solución espontánea de una situación.
8. **Enfoque Biopsicosocial:** Paradigma científico que sostiene que la salud, el comportamiento y los trastornos psicológicos se derivan de la interacción compleja y recíproca de determinantes biológicos, psicológicos y sociales.
9. **Correlación Estadística:** Medida numérica (r de Pearson) que cuantifica la fuerza y dirección de la covariación lineal entre dos variables.
10. **Autorrealización:** Necesidad psicológica superior postulada por el humanismo consistente en el pleno despliegue de las potencialidades, talentos y propósitos personales.

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurociencias y Psiquiatría:** La integración entre la psicología cognitiva y la neurobiología mediante resonancia magnética funcional (fMRI) permite mapear en vivo los circuitos cerebrales del miedo (amígdala), la memoria episódica (hipocampo) y la toma de decisiones morales (corteza prefrontal dorsolateral).
- **Inteligencia Artificial y Ciencias de la Computación:** Las redes neuronales profundas y los modelos de procesamiento de lenguaje natural (LLMs) se inspiraron en las teorías cognitivas de esquemas mentales y procesamiento de información humana.
- **Salud Pública y Epidemiología:** El modelo biopsicosocial es el marco oficial de la Organización Mundial de la Salud (OMS) para la Clasificación Internacional del Funcionamiento, de la Discapacidad y de la Salud (CIF).

---



### 3.1. Definición, Etimología y Evolución Epistemológica
- **Etimología:** Proviene de las voces griegas *psykhe* (alma, hálito vital o espíritu) y *logos* (estudio, tratado o razón).
- **Definición Científica Contemporánea:** Ciencia fáctica, social y natural que describe, explica, predice y modifica la **conducta humana** y los **procesos psicológicos** subyacentes en interacción con el entorno sociocultural y biológico.
- **Transición Histórica:**
  1. **Etapa Precientífica (Filosófica):**
     - *Platón:* Concepción dualista; el alma es inmaterial, inmortal y se encuentra atrapada en la cárcel del cuerpo (*Fedro*, *República*).
     - *Aristóteles:* Considerado el padre de la psicología antigua. Escribe *De Anima* (*Sobre el alma*), concibiendo el alma como entelequia o principio vital sustancial del cuerpo biológico (vegetativa, sensitiva y racional).
     - *René Descartes (Siglo XVII):* Dualismo cartesiano entre sustancia pensante (*res cogitans*) y sustancia extensa corpórea (*res extensa*), comunicadas en la glándula pineal.
  2. **Etapa Científica:**
     - **Hito Fundacional:** En **1879**, Wilhelm Wundt funda el **Primer Laboratorio de Psicología Experimental** en la Universidad de Leipzig (Alemania). La psicología se emancipa formalmente de la filosofía al adoptar el método experimental y la medición rigurosa de tiempos de reacción y sensaciones.



### 4.1. Escuelas Psicológicas Clásicas
| Escuela | Fundador / Representantes | Objeto Central | Método Principal | Aporte Histórico |
| :--- | :--- | :--- | :--- | :--- |
| **Estructuralismo** | Wilhelm Wundt, Edward Titchener | Estructura de la conciencia (sensaciones, imágenes, afectos) | Introspección analítica experimental | Primera escuela científica; independizó a la psicología. |
| **Funcionalismo** | William James, John Dewey | Función adaptativa de la conciencia al medio | Introspección y extrospección, pragmatismo | Precursor del conductismo y la psicología educativa. |
| **Conductismo** | John B. Watson, B.F. Skinner | Conducta observable y medible (E \to R) | Método experimental riguroso, extrospección | Leyes del condicionamiento; rechazo de lo mentalista. |
| **Gestalt** | Max Wertheimer, Köhler, Koffka | La percepción y la conciencia como totalidad organizada | Fenomenología experimental | "El todo es más que la suma de sus partes"; *insight*. |
| **Psicoanálisis** | Sigmund Freud, Carl Jung, Adler | El inconsciente dinámico, pulsiones psicosexuales | Asociación libre, análisis de sueños | Descubrimiento del aparato psíquico; psicopatología. |
| **Humanismo** | Abraham Maslow, Carl Rogers | El potencial humano, autorrealización y libre albedrío | Fenomenología clínica, terapia centrada en la persona | "Tercera fuerza"; visión holística positiva del ser humano. |
| **Cognitivismo** | Jean Piaget, Ulric Neisser, Bruner | Procesamiento de la información (mente como ordenador) | Modelado computacional, experimentación cognitiva | Revolución cognitiva; mediación entre estímulo y respuesta (E \to O \to R). |



### 4.2. Métodos de Investigación en Psicología
1. **Método Experimental:** Único método capaz de establecer **relaciones de causa-efecto**:
   - **Variable Independiente (VI):** Causa manipulada deliberadamente por el investigador.
   - **Variable Dependiente (VD):** Efecto o conducta medida para observar el impacto de la VI.
   - **Variables Extrañas (VE):** Factores ajenos que deben ser estrictamente controlados o aleatorizados para evitar sesgos.
   - **Grupos:** Grupo Experimental (recibe la VI) vs. Grupo Control (no recibe la VI o recibe placebo).
2. **Método Correlacional:** Evalúa el grado de asociación estadística lineal entre dos o más variables sin manipularlas:
   -1.00 \le r \le +1.00
   - r > 0: Correlación positiva directa (ambas aumentan).
   - r < 0: Correlación negativa inversa (una aumenta y la otra disminuye).
   - r = 0: Ausencia de correlación lineal.
   - *Regla de oro epistemológica:* **La correlación no implica causalidad.**
3. **Método Observacional y Descriptivo:** Registro sistemático de conductas en su entorno natural o en laboratorio (estudio de casos, encuestas, observación naturalista).

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fecha de Nacimiento de la Psicología:**
   > **"En el 79 Wundt se atrevió"** \implies **1879**, Wilhelm Wundt en Leipzig.
2. **Elementos de la Conciencia de Titchener:**
   > **"S-I-A"** \implies **S**ensaciones, **I**mágenes y **A**fectos (o sentimientos).
3. **Fórmula del Conductismo vs. Neoconductismo:**
   > Conductismo radical: **E - R** (Estímulo \to Respuesta).  
   > Neoconductismo / Cognitivismo: **E - O - R** (Estímulo \to Organismo mediador \to Respuesta).
4. **Metas de la Psicología:**
   > **"D-E-P-M"** \implies **D**escribir, **E**xplicar, **P**redecir y **M**odificar.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (¿Quién es el fundador?):** Si la pregunta pide el "fundador de la psicología antigua o filosófica", la clave es **Aristóteles**; si pide el "fundador de la psicología científica o moderna", la clave es **Wilhelm Wundt**.
- **Trampa 2 (Confundir Estructuralismo con Funcionalismo):** El estructuralismo preguntaba *¿QUÉ hay en la mente?* (elementos estáticos); el funcionalismo preguntaba *¿PARA QUÉ sirve la mente?* (función adaptativa de la conciencia).
- **Trampa 3 (Correlación vs. Causalidad):** Si un estudio muestra que "los estudiantes que duermen más obtienen mayores notas (r = +0.72)", el estudiante novato deduce erróneamente que "dormir causa mejores notas". La respuesta correcta DECO es: "existe una relación directamente proporcional o correlación positiva, pero no se puede concluir causalidad sin un diseño experimental controlado".

---



### Problema 4: Enfoque Biopsicosocial y DECO (Nivel Avanzado)
**Enunciado:** Ricardo, de 19 años, asiste a consulta psicológica presentando síntomas de depresión mayor. El especialista determina que en el cuadro de Ricardo coexisten una predisposición genética (déficit de serotonina en su familia materna), un patrón de pensamientos distorsionados y rumiación pesimista aprendidos tras la separación de sus padres, y el aislamiento social debido al desempleo juvenil en su comunidad. El modelo integrador contemporáneo que utiliza el psicólogo para conceptualizar el caso de Ricardo es el:
A) Enfoque psicodinámico ortodoxo.  
B) Enfoque conductual radical.  
C) Enfoque biopsicosocial.  
D) Enfoque estructuralista.  
E) Modelo médico biologicista puro.  

**Solución paso a paso:**
1. El caso analiza tres niveles articulados:
   - Nivel Biológico: déficit de serotonina y base genética familiar.
   - Nivel Psicológico: esquemas cognitivos disfuncionales y rumiación.
   - Nivel Social: ruptura familiar y aislamiento por desempleo socioeconómico.
2. Propuesto originalmente por George Engel, el **modelo biopsicosocial** postula que la salud mental y la conducta son el resultado interactivo e indivisible de factores biológicos, psicológicos y socioculturales.

**Respuesta:** C) Enfoque biopsicosocial.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Cuál fue el método utilizado por Wilhelm Wundt y los estructuralistas que requería que sujetos entrenados describieran detalladamente sus vivencias conscientes ante estímulos controlados?
   - *Pista:* Introspección ligada a laboratorio.
   - *Clave:* Introspección experimental.

2. En un experimento psicológico sobre la memoria, se evalúa a dos grupos en retención de palabras: el grupo A escucha música clásica a 60 dB y el grupo B estudia en silencio absoluto. ¿Qué variable representa el tipo de ambiente sonoro?
   - *Pista:* Es la variable que el investigador manipula.
   - *Clave:* Variable independiente.

3. Corriente psicológica que sostiene que el ser humano posee una tendencia innata hacia la autorrealización y enfatiza el valor de la libertad personal y la empatía:
   - *Pista:* Fundada por Maslow y Rogers, llamada la "tercera fuerza".
   - *Clave:* Humanismo.

4. Si el coeficiente de correlación entre el nivel de autoestima y el nivel de ansiedad en una muestra clínica resulta ser r = -0.85, ¿cómo se interpreta esta relación?
   - *Pista:* Es una correlación negativa fuerte.
   - *Clave:* A mayor nivel de autoestima, menor nivel de ansiedad registrado.

5. Enfoque que concibe la mente humana mediante la analogía del ordenador, distinguiendo entre el soporte biológico (*hardware*) y los procesos mentales de entrada, almacenamiento y recuperación (*software*):
   - *Pista:* Escuela cognitiva fundada a partir de los años 50 y 60.
   - *Clave:* Enfoque cognitivo (procesamiento de información).

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿En qué año y con qué acontecimiento nace la psicología científica?**
  *R: En 1879, con la fundación del primer laboratorio de psicología experimental por Wilhelm Wundt en Leipzig, Alemania.*
- **P: ¿Cuál es la diferencia entre el estructuralismo y el funcionalismo?**
  *R: El estructuralismo buscaba los elementos anatómicos de la conciencia (sensación, imagen, afecto); el funcionalismo estudiaba la función adaptativa y práctica de la mente en el entorno.*
- **P: ¿Qué afirmaba John B. Watson respecto al objeto de estudio de la psicología?**
  *R: Que la psicología debía renunciar al estudio del alma y la conciencia subjetiva, y limitarse estrictamente a la conducta observable y medible (E \to R).*
- **P: ¿Una correlación estadística alta entre dos variables demuestra que una causa a la otra?**
  *R: No; correlación indica asociación matemática o covariación, pero la causalidad solo se demuestra mediante un diseño experimental riguroso.*
- **P: ¿Cuáles son las cuatro metas científicas de la psicología?**
  *R: Describir, explicar, predecir y modificar (o controlar).*

---



### Problema 2: Identificación de Variables Experimentales (Nivel Intermedio)
**Enunciado:** Una investigadora desea probar la eficacia de una nueva técnica de respiración diafragmática para reducir la ansiedad ante exámenes de admisión. Para ello, selecciona a 60 postulantes con niveles similares de estrés: a 30 de ellos los entrena durante dos semanas en la técnica de respiración, mientras que a los otros 30 no les aplica ningún entrenamiento. Posteriormente, mide el nivel de cortisol salival en ambos grupos durante un simulacro real. En este diseño, la técnica de respiración diafragmática y el nivel de cortisol salival constituyen respectivamente:
A) Variable dependiente y variable independiente.  
B) Variable independiente y variable dependiente.  
C) Variable extraña y variable dependiente.  
D) Variable interviniente y variable de control.  
E) Variable independiente y variable extraña.  

**Solución paso a paso:**
1. La **Variable Independiente (VI)** es la condición manipulada por el experimentador como presunta causa. En este caso: la *técnica de respiración diafragmática*.
2. La **Variable Dependiente (VD)** es la respuesta o efecto medido para ver si cambió. En este caso: el *nivel de cortisol salival* (marcador biológico de la ansiedad).
3. Por ende, la relación ordenada es: Variable independiente y variable dependiente.

**Respuesta:** B) Variable independiente y variable dependiente.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t01_s02_c01",
                    question = "La definición científica contemporánea de la Psicología la conceptualiza como la ciencia que estudia:",
                    options = listOf(
                        "Las enfermedades somáticas del organismo y la quiromancia.",
                        "Los procesos psíquicos (mentales) internos y la conducta externa observable del ser humano en su interacción socioambiental.",
                        "Únicamente los reflejos pupilares ante la luz solar.",
                        "El movimiento de las almas tras el fallecimiento corporal.",
                    ),
                    correctIndex = 1,
                    explanation = "La psicología moderna integra la dimensión subjetiva interna (procesos cognitivos y afectivos) con la objetiva externa (conductas medibles) contextualizadas social y biológicamente."
                ),
                Challenge(
                    id = "psi_t01_s02_c02",
                    question = "¿Cuál de los siguientes fenómenos clasifica formalmente como un 'proceso psíquico cognitivo'?",
                    options = listOf(
                        "Un acceso de furia incontrolable ante una ofensa",
                        "El temblor muscular involuntario por frío extremo",
                        "La memoria de trabajo al recordar un número telefónico",
                        "La transpiración dérmica tras correr una maratón",
                    ),
                    correctIndex = 2,
                    explanation = "Los procesos cognitivos permiten conocer y procesar la realidad: percepción, memoria, pensamiento, lenguaje, imaginación y atención."
                ),
                Challenge(
                    id = "psi_t01_s02_c03",
                    question = "Los procesos psíquicos se clasifican según su naturaleza en tres grandes vertientes funcionales denominadas:",
                    options = listOf(
                        "Cognitivos (conocer), Afectivos (sentir) y Conativos-volitivos (motivar y orientar la acción).",
                        "Verbales, motrices y visuales únicamente.",
                        "Conscientes, preconscientes y subconscientes exclusivamente.",
                        "Orgánicos, inorgánicos y sintéticos.",
                    ),
                    correctIndex = 0,
                    explanation = "Los procesos psíquicos abarcan el saber (cognición), el valorar emocionalmente (afectividad) y la dirección deliberada hacia metas (conación y voluntad)."
                ),
                Challenge(
                    id = "psi_t01_s02_c04",
                    question = "La 'Conducta' en psicología se diferencia de los 'Procesos Psíquicos' en que la primera es:",
                    options = listOf(
                        "Completamente invisible y reservada al fuero íntimo del sujeto.",
                        "Cualquier manifestación externa, observable, medible y registrable directamente que expresa la actividad del organismo.",
                        "Heredada biológicamente sin posibilidad de modificación ambiental.",
                        "Un estado puramente metafísico carente de correlato fisiológico.",
                    ),
                    correctIndex = 1,
                    explanation = "La conducta abarca los actos motores, expresiones verbales y cambios psicofisiológicos observables a través de los cuales se manifiestan externamente los procesos psíquicos internos."
                ),
                Challenge(
                    id = "psi_t01_s02_c05",
                    question = "La rama de la Psicología que investiga los cambios psicológicos, cognitivos y conductuales que experimenta el ser humano a lo largo de todo su ciclo vital se denomina:",
                    options = listOf(
                        "Psicología del Desarrollo o Evolutiva",
                        "Psicología Organizacional",
                        "Psicología Jurídica y Forense",
                        "Psicología Publicitaria",
                    ),
                    correctIndex = 0,
                    explanation = "La psicología del desarrollo estudia las transformaciones normativas y cualitativas desde la concepción, infancia, adolescencia, adultez hasta la senectud."
                ),
                Challenge(
                    id = "psi_t01_s02_c06",
                    question = "¿Cuál es la especialidad aplicada de la psicología enfocada en el diagnóstico, pronóstico, prevención y psicoterapia de los trastornos mentales y del comportamiento?",
                    options = listOf(
                        "Psicología del Deporte",
                        "Psicología Educativa",
                        "Psicología Clínica o de la Salud",
                        "Psicología Social Comunitaria",
                    ),
                    correctIndex = 2,
                    explanation = "El psicólogo clínico interviene en centros hospitalarios y de consulta para evaluar y tratar desórdenes emocionales, trastornos de ansiedad, depresión y psicopatologías."
                ),
                Challenge(
                    id = "psi_t01_s02_c07",
                    question = "La Psicología Organizacional o del Trabajo interviene en las empresas e instituciones con el propósito central de:",
                    options = listOf(
                        "Recetar medicamentos psicotrópicos a los directivos.",
                        "Calcular la contabilidad financiera y los balances impositivos.",
                        "Optimizar la selección de personal, la motivación laboral, el clima organizacional y la productividad ergonómica de los equipos humanos.",
                        "Construir la infraestructura física de las oficinas.",
                    ),
                    correctIndex = 2,
                    explanation = "El ámbito organizacional gestiona el talento humano, liderazgos, cultura corporativa, evaluación de desempeño y bienestar laboral en el entorno de trabajo."
                ),
                Challenge(
                    id = "psi_t01_s02_c08",
                    question = "La Psicología Educativa orienta primordialmente su campo de acción hacia:",
                    options = listOf(
                        "Los procesos de enseñanza-aprendizaje, la orientación vocacional, la atención a necesidades educativas especiales y la mejora pedagógica escolar.",
                        "La supervisión de la dieta nutricional de los docentes.",
                        "La fabricación de fármacos antidepresivos.",
                        "La sanción penal de los delitos juveniles.",
                    ),
                    correctIndex = 0,
                    explanation = "El psicólogo educativo aborda las dificultades de aprendizaje, el desarrollo socioafectivo en las escuelas, programas de tutoría y el asesoramiento a docentes y familias."
                ),
                Challenge(
                    id = "psi_t01_s02_c09",
                    question = "Los procesos afectivos se diferencian de los cognitivos porque expresan fundamentalmente:",
                    options = listOf(
                        "La relación de agrado o desagrado, valoración personal y resonancia íntima que los estímulos del medio provocan en el sujeto (emociones, sentimientos, pasiones).",
                        "El almacenamiento de datos en la memoria a largo plazo.",
                        "Operaciones lógicas y deducciones matemáticas abstractas.",
                        "La velocidad de transmisión del impulso nervioso sináptico.",
                    ),
                    correctIndex = 0,
                    explanation = "La afectividad refleja cómo impacta la realidad en las necesidades y motivaciones del individuo, tiñendo su vivencia de tonalidades placenteras o aversivas."
                ),
                Challenge(
                    id = "psi_t01_s02_c10",
                    question = "El estudio de cómo los pensamientos, sentimientos y comportamientos de las personas son influenciados por la presencia real, imaginada o implícita de otros seres humanos corresponde a la:",
                    options = listOf(
                        "Psicobiología celular",
                        "Psicometría pura",
                        "Psicología comparada animal",
                        "Psicología Social",
                    ),
                    correctIndex = 3,
                    explanation = "La Psicología Social investiga la conformidad, persuasión, actitudes, prejuicios, roles de grupo, liderazgo e interacción interpersonal en sociedad."
                ),
            )
        )
    )
}
