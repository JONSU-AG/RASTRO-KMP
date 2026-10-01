package psicologia

object PsicologiaSemana05 {

    val lessons = listOf(
        LessonNode(
            id = "psi_t05_s01",
            subjectId = "psicologia",
            semana = 5,
            subtema = "5.1",
            title = "3.1. Identidad Personal y Social",
            theory = LessonTheory(
                content = """# TEMA 05: BÚSQUEDA DE IDENTIDAD Y AUTOESTIMA

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[BÚSQUEDA DE IDENTIDAD Y AUTOESTIMA] --> B[Identidad Psicosocial]
    A --> C[Estructura del Sí Mismo Self]
    A --> D[Estados de Identidad de James Marcia]
    A --> E[Escalera de la Autoestima de Rodríguez Estrada]

    B --> B1[Erikson: Identidad vs. Confusión de Roles]
    B --> B2[Identidad Personal y Social]
    B --> B3[Crisis de la Adolescencia y Moratoria]

    C --> C1[Autoconocimiento: Quién soy realmente]
    C --> C2[Autoconcepto: Dimensión cognitiva e imagen mental]
    C --> C3[Autoestima: Dimensión afectiva y valorativa]
    C --> C4[Autoeficacia: Creencia en la propia capacidad Bandura]

    D --> D1[Difusión de Identidad: Sin crisis ni compromiso]
    D --> D2[Exclusión / Hipotecada: Compromiso sin crisis previa]
    D --> D3[Moratoria: Crisis activa en exploración]
    D --> D4[Logro de Identidad: Compromiso tras crisis reflexiva]

    E --> E1[Autoconocimiento -> Autoconcepto -> Autoevaluación]
    E --> E2[Autoaceptación -> Autorespeto -> Autoestima Plena]
```

---



## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Identidad Personal y Social
- **Identidad:** Sentido integrador, continuo y diferenciado de mismidad que experimenta una persona a lo largo del tiempo (*¿Quién soy yo?*, *¿Quién quiero ser?*).
  - **Identidad Personal:** Conciencia de ser un individuo único, irrepetible, con una historia particular, un sistema de valores propios y un estilo distintivo de interactuar con el mundo.
  - **Identidad Social:** Parte del autoconcepto del individuo que deriva de su pertenencia a grupos sociales específicos (familia, nacionalidad, etnia, colectivos culturales, deportivos o profesionales) junto con el significado valorativo y emocional asociado (Henri Tajfel).
- **Crisis de Identidad en la Adolescencia (Erik Erikson):**
  - En su teoría del desarrollo psicosocial, la quinta etapa (12 a 20 años aprox.) enfrenta la tensión dialéctica: **Identidad vs. Confusión de Roles**.
  - Si el adolescente logra integrar sus transformaciones corporales, sus ideales y sus opciones vocacionales, alcanza la fidelidad y la coherencia identitaria. Si fracasa, experimenta dispersión, inseguridad sobre su rol social o identificación negativa con conductas marginales.



### 3.2. La Estructura del "Sí Mismo" (*Self*)
1. **Autoconocimiento:** Proceso reflexivo mediante el cual la persona identifica objetivamente sus fortalezas, debilidades, motivaciones, emociones, límites y deseos fundamentales. Es la base indispensable de la salud mental.
2. **Autoconcepto:** Dimensión estrictamente **cognitiva** del *self*. Es la imagen mental, descriptiva y conceptual, que una persona tiene de sí misma (*"Soy alto, tímido, hábil para la física y malo para bailar"*).
3. **Autoestima:** Dimensión **afectiva y valorativa** del *self*. Es el juicio de valor, aprecio o rechazo, y el grado de cariño y aceptación que la persona experimenta hacia su propio ser (*"Me quiero, me siento valioso y digno de ser feliz"*).
4. **Autoeficacia (Albert Bandura):** Creencia subjetiva en las propias capacidades organizativas y de acción para ejecutar con éxito una tarea específica o afrontar una demanda ambiental (*"Sé que soy capaz de resolver este examen si aplico mis estrategias"*). No es vanidad; es confianza en la propia competencia.

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



### 4.1. Estados de Identidad de James Marcia
James Marcia operacionalizó la teoría de Erikson cruzando dos variables dicotómicas: **Crisis (Exploración activa)** y **Compromiso (Firmeza en decisiones)**:

| Estado de Identidad | ¿Ha vivido Crisis / Exploración? | ¿Tiene Compromiso firme? | Características Psicológicas |
| :--- | :---: | :---: | :--- |
| **Difusión de Identidad** | **NO** | **NO** | Apático, desorientado, sin metas claras. No sabe qué estudiar ni le importa; posterga indefinidamente la reflexión sobre su futuro. |
| **Exclusión / Hipotecada** | **NO** | **SÍ** | Adopta ciegamente los valores o carreras de sus padres sin haber dudado ni explorado alternativas por cuenta propia (*"Seré militar porque mi padre lo decidió"*). |
| **Moratoria** | **SÍ** | **NO** | En plena crisis reflexiva y búsqueda activa. Explora carreras, duda, compara, debate, aún no toma una decisión definitiva pero está comprometido con la búsqueda. |
| **Logro de Identidad** | **SÍ** | **SÍ** | Tras un periodo de crisis y análisis consciente de opciones, ha elegido con madurez y convicción sus metas, valores y vocación. |



### 4.2. La Escalera de la Autoestima (Mauro Rodríguez Estrada)
Modelo secuencial ascendente que muestra cómo se construye la autoestima saludable paso a paso:
1. **Autoconocimiento:** *"Conozco mis virtudes, defectos, necesidades y talentos reales"*.
2. **Autoconcepto:** *"Me defino coherentemente con una imagen realista de mí mismo"*.
3. **Autoevaluación:** *"Juzgo constructivamente si lo que hago y soy me hace bien o me degrada"*.
4. **Autoaceptación:** *"Acepto incondicionalmente todo lo que soy, incluyendo mis imperfecciones, sin autoengañarme ni destruirme"*.
5. **Autorespeto:** *"Defiendo mis derechos, pongo límites a los demás y atiendo mis necesidades legítimas"*.
6. **Autoestima:** Cúspide de la escalera. Aprecio, amor propio y sentido de dignidad personal inquebrantable.



### 4.3. Niveles de Autoestima
- **Autoestima Alta (Saludable):** Confianza, asertividad, resiliencia ante el fracaso, empatía, apertura al aprendizaje, reconocimiento equilibrado de errores.
- **Autoestima Baja:** Inseguridad constante, perfeccionismo paralizante o conformismo, necesidad patológica de aprobación externa, hipersensibilidad a la crítica, miedo al fracaso.
- **Autoestima Inflada o Narcisista:** Fachada de grandiosidad y superioridad que encubre una profunda fragilidad interna; arrogancia, desprecio por los demás e incapacidad para tolerar frustraciones.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Los 4 Estados de Identidad de James Marcia:**
   > **"D-E-M-L"** \implies **D**ifusión, **E**xclusión, **M**oratoria, **L**ogro.
2. **Componentes del Self:**
   > **Autoconcepto = CEREBRO** (Pensamiento cognitivo: *"Lo que pienso de mí"*).  
   > **Autoestima = CORAZÓN** (Afecto valorativo: *"Lo que siento por mí"*).  
   > **Autoeficacia = MANOS** (Acción competente: *"Lo que creo que puedo lograr"*).
3. **Los 6 Peldaños de Rodríguez Estrada:**
   > **"CO-CON-E-ACEP-RES-EST"** \implies Autoconocimiento, Autoconcepto, Autoevaluación, Autoaceptación, Autorespeto, Autoestima.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Confundir Autoconcepto con Autoestima):**
  - Si el enunciado dice: *"Pedro sabe que mide 1.70 m y que es bueno para la matemática"* \implies es **AUTOCONCEPTO** (cognitivo/descriptivo).
  - Si dice: *"Pedro se siente orgulloso y feliz con su cuerpo y sus habilidades"* \implies es **AUTOESTIMA** (afectivo/evaluativo).
- **Trampa 2 (Exclusión vs. Logro en James Marcia):** En la identidad hipotecada o exclusión, el postulante tiene una decisión firme ("voy a medicina"), pero **NO pasó por crisis ni exploración autónoma**; simplemente obedeció el mandato familiar. Para haber Logro de Identidad es **obligatorio haber atravesado una crisis reflexiva previa**.
- **Trampa 3 (Autoestima Inflada vs. Autoestima Alta):** El sujeto que presume, humilla a otros y dice que "nadie está a su nivel" **NO tiene autoestima alta**; tiene una autoestima inflada o falsa, compensatoria de una profunda inseguridad inconsciente.

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Diferenciación entre Dimensiones del Self (Nivel Básico)
**Enunciado:** Mario, postulante preuniversitario, reflexiona sobre sí mismo: reconoce que tiene un temperamento introvertido y que le cuesta hablar en público (dimensión cognitiva descriptiva). Sin embargo, se valora positivamente, afirma que se quiere tal como es y no siente vergüenza de su forma de ser (dimensión evaluativa afectiva). Finalmente, declara con certeza que, si practica sus exposiciones frente al espejo, será completamente capaz de aprobar con éxito la entrevista personal (confianza en su capacidad de logro). Estas tres expresiones corresponden sucesivamente a:
A) Autoestima, autoeficacia y autoconcepto.  
B) Autoconcepto, autoestima y autoeficacia.  
C) Autoeficacia, autoconcepto y autoestima.  
D) Autoevaluación, autorespeto y autoconocimiento.  
E) Autoestima, autoconcepto y resiliencia.  

**Solución paso a paso:**
1. Describirse a sí mismo como introvertido y con dificultades oratorias es una representación mental cognitiva: **Autoconcepto**.
2. Valorarse con aprecio, quererse y sentirse digno a pesar de sus límites es el componente afectivo: **Autoestima**.
3. Creer con convicción en su capacidad para entrenarse y alcanzar un rendimiento exitoso es la expectativa de competencia: **Autoeficacia** (Bandura).
4. El orden riguroso es: Autoconcepto, autoestima y autoeficacia.

**Respuesta:** B) Autoconcepto, autoestima y autoeficacia.

---



### Problema 2: Estados de Identidad de Marcia en Casos DECO (Nivel Intermedio)
**Enunciado:** A sus 18 años, Joaquín no sabe qué carrera postular ni ha asistido a ninguna feria vocacional; pasa los días viendo series de televisión y cuando sus padres le preguntan sobre su futuro profesional, él responde con indiferencia: *"No sé, ya veré después, la verdad es que todo me da igual"*. De acuerdo con la tipología de estados de identidad de James Marcia, Joaquín se encuentra en un estado de:
A) Moratoria  
B) Logro de identidad  
C) Exclusión o identidad hipotecada  
D) Difusión de la identidad  
E) Autoliderazgo pasivo  

**Solución paso a paso:**
1. Joaquín no ha experimentado un proceso de crisis ni de exploración deliberada de alternativas vocacionales (Crisis: NO).
2. Tampoco ha asumido ningún compromiso ni meta vital para su futuro (Compromiso: NO).
3. La combinación (Crisis: NO / Compromiso: NO) acompañada de apatía existencial y postergación define el estado de **Difusión de la Identidad**.

**Respuesta:** D) Difusión de la identidad.

---



### Problema 3: Identidad Hipotecada vs. Moratoria (Nivel Intermedio-Avanzado)
**Enunciado:** Camila afirma con total seguridad: *"Voy a ser contadora pública y trabajaré en el banco de mi abuelo, porque en mi casa desde que nací todos me dijeron que esa era mi profesión; nunca he pensado en otra opción ni me ha interesado averiguar nada más"*. En cambio, su compañera Valeria señala: *"He estado visitando facultades de Arquitectura y de Diseño de Interiores, comparo las mallas curriculares, converso con profesionales de ambas áreas y todavía no me decido firmemente por ninguna, pero sé que pronto definiré mi camino"*. Según James Marcia, Camila y Valeria se encuentran respectivamente en estados de:
A) Logro de identidad y Difusión.  
B) Exclusión (hipotecada) y Moratoria.  
C) Moratoria y Exclusión.  
D) Difusión y Logro de identidad.  
E) Exclusión y Difusión.  

**Solución paso a paso:**
1. Camila tiene un compromiso firme asumido sin haber atravesado una crisis o exploración propia, adoptando el libreto impuesto por su familia: estado de **Exclusión o Identidad Hipotecada** (Crisis: NO / Compromiso: SÍ).
2. Valeria se encuentra en plena búsqueda activa, evaluando y comparando opciones sin haber cristalizado aún una decisión definitiva: estado de **Moratoria** (Crisis: SÍ / Compromiso: NO).

**Respuesta:** B) Exclusión (hipotecada) y Moratoria.

---



### Problema 4: La Escalera de la Autoestima de Rodríguez Estrada (Nivel Avanzado)
**Enunciado:** Luego de perder un examen de admisión, Gonzalo reconoce que cometió fallas graves al confiarse en el curso de matemáticas (autoevaluación). A pesar del dolor de la derrota, no se insulta ni se considera un "inútil", sino que asume con madurez que equivocarse forma parte de su condición de ser humano falible, reconociendo sus virtudes intactas y decidiendo cuidar su salud mental sin flagelarse. ¿Qué peldaño clave de la escalera de la autoestima de Mauro Rodríguez Estrada ha consolidado Gonzalo para evitar caer en una depresión autodestructiva?
A) Autoaceptación  
B) Difusión de rol  
C) Autoestima inflada  
D) Autoconcepto rígido  
E) Introyección patológica  

**Solución paso a paso:**
1. En el modelo de Rodríguez Estrada, la **Autoaceptación** es la capacidad de admitir y acoger incondicionalmente todos los aspectos de nuestro ser, tanto los logros como los errores y limitaciones, tratándonos con compasión y sin recurrir al autorrechazo destructivo.
2. Gonzalo reconoce su error sin descalificar su dignidad intrínseca como persona, lo que constituye la autoaceptación plena.

**Respuesta:** A) Autoaceptación.

---



### Problema 5: Autoeficacia y Rendimiento Académico (Boss Challenge)
**Enunciado:** Dos postulantes con idéntico cociente intelectual (CI = 118) y similar formación académica rinden un simulacro de admisión sumamente difícil. Ante las primeras tres preguntas complejas de trigonometría:
- Javier piensa: *"Esto es una pesadilla, no sirvo para las matemáticas avanzadas, seguro me voy a quedar fuera del cuadro de vacantes"*, experimentando taquicardia y abandonando la prueba.
- Renzo piensa: *"Estas preguntas son muy retadoras, pero he resuelto problemas similares en clase; si respiro con calma y aplico identidades trigonométricas auxiliares paso a paso, puedo encontrar la solución"*, manteniendo la concentración y logrando resolver dos de ellas.
Desde la teoría socio-cognitiva de Albert Bandura, la diferencia radical en el desempeño y afrontamiento de Javier y Renzo se explica por:
A) Un condicionamiento vicario operante con refuerzo intermitente.  
B) La disparidad en sus niveles de autoeficacia percibida frente a la tarea.  
C) El estadio de difusión de identidad en Renzo y de exclusión en Javier.  
D) Una lesión orgánica en la amígdala temporal de Javier.  
E) La presencia de una fobia específica alfanumérica hereditaria.  

**Solución paso a paso:**
1. La **autoeficacia percibida** (Bandura) es el juicio que tiene una persona sobre su propia capacidad para organizar y ejecutar las acciones necesarias para alcanzar determinados logros.
2. Una autoeficacia elevada (como la de Renzo) genera persistencia, menor activación fisiológica de pánico ante el desafío y estrategias activas de solución de problemas.
3. Una autoeficacia deficiente (como la de Javier) desata autodiálogos derrotistas que aumentan la ansiedad y conducen a la renuncia prematura.

**Respuesta:** B) La disparidad en sus niveles de autoeficacia percibida frente a la tarea.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué psicólogo del desarrollo formuló la crisis de "Identidad vs. Confusión de Roles" como el núcleo psicosocial de la adolescencia?
   - *Pista:* Creador de las ocho edades del hombre.
   - *Clave:* Erik Erikson.

2. Un joven de 19 años exploró diversas carreras durante un año sabático, realizó prácticas, conversó con profesionales y, tras sopesar sus opciones con autonomía, eligió con convicción estudiar Ingeniería Química. ¿En qué estado de identidad de James Marcia se encuentra?
   - *Pista:* Vivió crisis y alcanzó compromiso propio.
   - *Clave:* Logro de identidad.

3. ¿Cuál es el peldaño de la escalera de la autoestima que implica atender las propias necesidades, defender los derechos asertivamente y no permitir el maltrato de los demás?
   - *Pista:* Peldaño previo a la autoestima en el modelo de Rodríguez Estrada.
   - *Clave:* Autorespeto.

4. ¿A qué dimensión del sí mismo (*self*) corresponde la siguiente afirmación: *"Tengo la certeza absoluta de que puedo aprender a programar en Python si dedico dos horas diarias de práctica sostenida"*?
   - *Pista:* Concepto formulado por Albert Bandura.
   - *Clave:* Autoeficacia.

5. ¿Cómo se denomina el estado de identidad en el cual el sujeto asume compromisos vocacionales o ideológicos impuestos por sus padres o figuras de autoridad sin haber vivido jamás un periodo previo de cuestionamiento o crisis personal?
   - *Pista:* Identidad hipotecada.
   - *Clave:* Exclusión (o identidad hipotecada).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Identidad Personal:** Sentido subjetivo de continuidad, unicidad y coherencia interior que define quién es un individuo frente a sí mismo y al mundo.
2. **Identidad Social:** Componente del autoconcepto derivado de la pertenencia consciente y valorativa a determinados grupos o colectivos sociales.
3. **Autoconcepto:** Conjunto de creencias, esquemas cognitivos y descripciones que una persona sostiene sobre sus propias características físicas, psicológicas y sociales.
4. **Autoestima:** Actitud evaluativa y emocional que una persona experimenta hacia sí misma, expresada en sentimientos de dignidad, valor y amor propio.
5. **Autoeficacia:** Creencia o convicción subjetiva en la propia capacidad para ejecutar exitosamente las conductas requeridas para producir un resultado deseado (Bandura).
6. **Moratoria (James Marcia):** Estado de identidad caracterizado por la exploración activa, crisis y cuestionamiento reflexivo, sin haber asumido aún un compromiso definitivo.
7. **Exclusión / Hipotecada:** Estado de identidad en el cual se asumen compromisos rígidos prescritos por figuras de autoridad sin haber atravesado una fase previa de crisis o exploración.
8. **Difusión de Identidad:** Estado caracterizado por la ausencia simultánea de crisis reflexiva y de compromisos significativos en valores, metas o vocación.
9. **Autoaceptación:** Acto incondicional de acoger y admitir todas las facetas de la propia personalidad, incluyendo errores, límites y debilidades, sin reproches destructivos.
10. **Confusión de Roles:** Incapacidad para consolidar una identidad coherente durante la adolescencia, manifestada en inseguridad, dispersión y desorientación existencial (Erikson).

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es la diferencia medular entre autoconcepto y autoestima?**
  *R: El autoconcepto es cognitivo y descriptivo (*"cómo me veo y me pienso"*); la autoestima es afectiva y valorativa (*"cuánto me aprecio y me quiero"*).*
- **P: ¿Cuáles son las dos variables que cruza James Marcia para definir los estados de identidad?**
  *R: La presencia o ausencia de Crisis (Exploración) y la presencia o ausencia de Compromiso.*
- **P: ¿Qué caracteriza al estado de Moratoria de James Marcia?**
  *R: Crisis activa presente (búsqueda y exploración) con compromiso aún ausente.*
- **P: ¿Qué es la autoeficacia según Albert Bandura?**
  *R: La confianza subjetiva en la propia capacidad para llevar a cabo con éxito una tarea específica.*
- **P: ¿Cuál es la crisis psicosocial propia de la adolescencia según Erik Erikson?**
  *R: Identidad versus Confusión de Roles.*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Psiquiatría y Salud Mental Comunitaria:** La baja autoestima y la difusión de la identidad son predictores clínicos de riesgo para el desarrollo de trastornos de la conducta alimentaria (anorexia, bulimia), depresión mayor, autolesiones y adicciones en jóvenes.
- **Sociología y Redes Sociales:** Las plataformas digitales (Instagram, TikTok) operan amplificando la comparación social descendente y ascendente, distorsionando el autoconcepto corporal y generando autoestimas contingentes a la aprobación externa (*likes*).
- **Psicología del Deporte y Alto Rendimiento:** Los atletas de élite olímpica entrenan programas específicos de autoeficacia y autodiálogo positivo para mantener la estabilidad emocional y evitar el colapso bajo presión en momentos decisivos.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t05_s01_c01",
                    question = "En la psicología del desarrollo social, la 'Identidad Personal' se conceptualiza como:",
                    options = listOf(
                        "El número de serie del Documento Nacional de Identidad (DNI).",
                        "La conciencia de mismidad, continuidad y coherencia que una persona tiene sobre quién es, construida a partir de la integración de sus valores, metas, historia y roles.",
                        "La copia idéntica de la personalidad de un personaje de película.",
                        "La herencia genética del grupo sanguíneo.",
                    ),
                    correctIndex = 1,
                    explanation = "La identidad personal responde a la pregunta '¿Quién soy yo?': otorga sentido de unicidad y continuidad en el tiempo a pesar de los cambios físicos y circunstanciales."
                ),
                Challenge(
                    id = "psi_t05_s01_c02",
                    question = "El psicoanalista Erik Erikson postuló que la tarea o crisis psicosocial primordial que debe resolver el ser humano durante la etapa de la Adolescencia es:",
                    options = listOf(
                        "Confianza básica vs. Desconfianza",
                        "Generatividad vs. Estancamiento",
                        "Identidad vs. Confusión de roles (o difusión de identidad)",
                        "Integridad del yo vs. Desesperación",
                    ),
                    correctIndex = 2,
                    explanation = "En la adolescencia, el púber debe integrar sus cambios corporales, pulsiones y roles sociales para consolidar una identidad firme; si fracasa, cae en la confusión de roles."
                ),
                Challenge(
                    id = "psi_t05_s01_c03",
                    question = "James Marcia profundizó la teoría de Erikson proponiendo cuatro estados de identidad en la adolescencia; el estado de 'Moratoria' se caracteriza porque el joven:",
                    options = listOf(
                        "Ya resolvió todas sus dudas y ejerce una carrera profesional estable.",
                        "Se encuentra en plena crisis activa de exploración y búsqueda de alternativas vocacionales e ideológicas, pero aún no ha asumido compromisos definitivos.",
                        "No explora ni le interesa asumir ningún compromiso en la vida (difusión).",
                        "Ha asumido compromisos firmes sin haber explorado ninguna alternativa (identidad hipotecada).",
                    ),
                    correctIndex = 1,
                    explanation = "La moratoria es la crisis activa de búsqueda: el adolescente prueba, indaga, debate opciones y reflexiona intensamente antes de consagrar su compromiso vocacional."
                ),
                Challenge(
                    id = "psi_t05_s01_c04",
                    question = "La 'Identidad Social' (Henri Tajfel) es aquella parte del autoconcepto de un individuo que deriva de:",
                    options = listOf(
                        "Su peso y estatura física.",
                        "Los reflejos rotulianos espinales.",
                        "Su conocimiento y pertenencia a determinados grupos sociales (familia, etnia, nación, club, profesión), junto con el valor y significado emocional otorgado a esa membresía.",
                        "El saldo bancario individual en cuentas de ahorro.",
                    ),
                    correctIndex = 2,
                    explanation = "Tajfel demostró que categorizarse como miembro de un grupo ('somos peruanos', 'somos universitarios') modela la autoestima social y las conductas intergrupales."
                ),
                Challenge(
                    id = "psi_t05_s01_c05",
                    question = "La 'Autoestima' en psicología se distingue del 'Autoconcepto' en que este último es eminentemente cognitivo (lo que creo de mí), mientras que la Autoestima es:",
                    options = listOf(
                        "La dimensión valorativa y afectiva: la valoración positiva o negativa, el aprecio y cariño que una persona siente hacia sí misma.",
                        "Una medida métrica de la presión arterial.",
                        "La arrogancia despectiva hacia los demás.",
                        "La obediencia sumisa ante órdenes externas.",
                    ),
                    correctIndex = 0,
                    explanation = "El autoconcepto es la descripción objetiva de mis atributos ('soy alto, tímido, hábil con las matemáticas'); la autoestima es cómo me siento con esos atributos (aprecio, orgullo o desprecio)."
                ),
                Challenge(
                    id = "psi_t05_s01_c06",
                    question = "En la llamada 'Escalera de la Autoestima', el peldaño basal indispensable sobre el cual se edifican los demás niveles es el:",
                    options = listOf(
                        "Autoconocimiento",
                        "Autorespeto",
                        "Autoaceptación",
                        "Autoevaluación",
                    ),
                    correctIndex = 0,
                    explanation = "Nadie puede amar ni valorar lo que no conoce; el autoconocimiento honesto de las luces y sombras de uno mismo es la base previa para evaluarse y aceptarse."
                ),
                Challenge(
                    id = "psi_t05_s01_c07",
                    question = "La 'Autoaceptación' incondicional implica que la persona es capaz de:",
                    options = listOf(
                        "Creerse perfecta e incapaz de cometer cualquier equivocación.",
                        "Resignarse pasivamente a no superarse jamás.",
                        "Fingir ante los demás que todo en su vida es perfecto.",
                        "Admitir y reconocer serenamente todas las facetas de su personalidad (virtudes y defectos, limitaciones y errores pasados) sin reproches crueles ni autodestrucción.",
                    ),
                    correctIndex = 3,
                    explanation = "Autoaceptarse no es resignación mediocre: es abrazar la propia humanidad imperfecta con compasión, condición necesaria para emprender el cambio personal."
                ),
                Challenge(
                    id = "psi_t05_s01_c08",
                    question = "Una persona con autoestima inflada o narcisista ficticia suele manifestar conductas de:",
                    options = listOf(
                        "Empatía altruista desinteresada hacia los desfavorecidos.",
                        "Aislamiento tímido en las reuniones sociales.",
                        "Humildad sincera y escucha atenta a las opiniones divergentes.",
                        "Arrogancia, necesidad constante de admiración externa, desprecio por los demás y extrema fragilidad e ira violenta ante la menor crítica.",
                    ),
                    correctIndex = 3,
                    explanation = "La autoestima hipertrofiada o narcisista es una máscara defensiva que encubre una profunda inseguridad subyacente dependiente de la adulación ajena."
                ),
                Challenge(
                    id = "psi_t05_s01_c09",
                    question = "La 'Comunicación Asertiva' es la habilidad social madura que consiste en:",
                    options = listOf(
                        "Expresar los propios derechos, sentimientos, opiniones y necesidades de forma clara, directa, honesta y oportuna, respetando al mismo tiempo los derechos de los demás.",
                        "Utilizar el sarcasmo hiriente y la manipulación sutil.",
                        "Callar sumisamente y aceptar órdenes injustas para evitar el rechazo de los amigos (estilo pasivo).",
                        "Gritar e imponer los propios puntos de vista agrediendo verbalmente a los interlocutores (estilo agresivo).",
                    ),
                    correctIndex = 0,
                    explanation = "La asertividad es el punto de equilibrio ético entre la pasividad (renunciar a los propios derechos) y la agresividad (atropellar los derechos ajenos)."
                ),
                Challenge(
                    id = "psi_t05_s01_c10",
                    question = "La técnica asertiva del 'Disco Rayado' se utiliza eficazmente frente a la presión de grupo manipuladora y consiste en:",
                    options = listOf(
                        "Golpear un objeto ruidoso para asustar a los interlocutores.",
                        "Repetir con tranquilidad y serenidad el propio punto de vista o negativa ('No, gracias, prefiero no consumir alcohol porque debo estudiar') tantas veces como sea necesario, sin alterarse ni caer en provocaciones.",
                        "Insultar a quien hace la propuesta incitadora.",
                        "Ceder de inmediato a la primera insistencia de los amigos.",
                    ),
                    correctIndex = 1,
                    explanation = "El disco rayado mantiene la negativa firme y tranquila sin entrar en discusiones circulares, desarmando la insistencia del manipulador sin agresividad."
                ),
            )
        )
    )
}
