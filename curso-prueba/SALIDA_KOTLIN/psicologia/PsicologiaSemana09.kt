package psicologia

object PsicologiaSemana09 {

    val lessons = listOf(
        LessonNode(
            id = "psi_t09_s01",
            subjectId = "psicologia",
            semana = 9,
            subtema = "9.1",
            title = "3.1. Definición y Características del Aprendizaje",
            theory = LessonTheory(
                content = """## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Definición y Características del Aprendizaje
- **Definición Psicológica:** Proceso de cambio relativamente permanente en la conducta, en los procesos cognitivos o en el potencial conductual de un organismo, resultante de la práctica, la experiencia o la interacción con el ambiente.
- **Lo que NO es Aprendizaje:**
  - Cambios debidos a la **maduración biológica** (ej. aprender a caminar a los 12 meses por mielinización neuronal).
  - Respuestas causadas por **reflejos innatos** o instintos biológicos (ej. parpadeo corneal, reflejo rotuliano).
  - Modificaciones temporales por **fatiga**, ingestión de sustancias químicas (drogas, alcohol) o adaptación sensorial (ej. acostumbrarse a un olor fuerte).

---



### 4.1. Condicionamiento Clásico o Respondiente (Pávlov y Watson)
Se basa en la asociación por contigüidad temporal entre dos estímulos (E \to E):
1. **Fórmula del Proceso:**
   - **Antes del condicionamiento:**
     \text{Estímulo Incondicionado (EI: comida)} \longrightarrow \text{Respuesta Incondicionada (RI: salivación)}
     \text{Estímulo Neutro (EN: campana)} \longrightarrow \text{Respuesta de Orientación (No salivación)}
   - **Durante el condicionamiento:**
     \text{EN (campana)} + \text{EI (comida)} \longrightarrow \text{RI (salivación)}
   - **Después del condicionamiento:**
     \text{Estímulo Condicionado (EC: campana)} \longrightarrow \text{Respuesta Condicionada (RC: salivación)}
2. **Fenómenos del Condicionamiento Clásico:**
   - **Extinción:** Presentación reiterada del EC sin el EI; la RC se debilita gradualmente hasta desaparecer.
   - **Recuperación Espontánea:** Reaparición de la RC extinguida tras un periodo de descanso temporal.
   - **Generalización de Estímulos:** La RC se dispara ante estímulos similares al EC original (ej. campanas de distinto tono).
   - **Discriminación o Diferenciación:** El sujeto aprende a responder exclusivamente al EC específico y no a variantes.



### Problema 2: Elementos del Condicionamiento Clásico (Nivel Intermedio)
**Enunciado:** De pequeño, Raúl sufrió una dolorosa quemadura tras escuchar el silbido estridente de una tetera hirviendo. Hoy en día, a sus 18 años, cada vez que escucha el silbido agudo de una tetera o de un pito similar, su ritmo cardíaco se acelera y retira la mano de forma refleja con angustia. En este caso de condicionamiento clásico, el dolor físico de la quemadura y el silbido de la tetera actúan respectivamente como:
A) Estímulo condicionado y respuesta incondicionada.  
B) Estímulo incondicionado y estímulo condicionado.  
C) Estímulo neutro y estímulo discriminativo.  
D) Respuesta condicionada y refuerzo aversivo.  
E) Estímulo incondicionado y respuesta condicionada.  

**Solución paso a paso:**
1. El dolor físico de la quemadura es un estímulo biológico que desencadena dolor y reflejos de forma innata sin aprendizaje previo: **Estímulo Incondicionado (EI)**.
2. El silbido de la tetera originalmente era un estímulo sonoro neutro que, al asociarse por contigüidad al dolor de la quemadura, adquiere la capacidad de evocar la respuesta de miedo y sobresalto: **Estímulo Condicionado (EC)**.

**Respuesta:** B) Estímulo incondicionado y estímulo condicionado.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es la diferencia medular entre refuerzo y castigo en el condicionamiento operante?**
  *R: El refuerzo siempre incrementa la probabilidad de la conducta; el castigo siempre disminuye o extingue la conducta.*
- **P: ¿Qué es el refuerzo negativo?**
  *R: Es el aumento de una conducta como resultado de la eliminación o prevención de un estímulo aversivo (no es un castigo).*
- **P: ¿Cuáles son los cuatro componentes del condicionamiento clásico de Pávlov?**
  *R: Estímulo Incondicionado (EI), Respuesta Incondicionada (RI), Estímulo Condicionado (EC) y Respuesta Condicionada (RC).*
- **P: ¿Qué se requiere indispensablemente para que ocurra un aprendizaje significativo según Ausubel?**
  *R: Que el estudiante cuente con saberes previos pertinentes (subsumidores) donde anclar el nuevo conocimiento de forma no arbitraria.*
- **P: ¿Qué programa de refuerzo de Skinner es el más resistente a la extinción?**
  *R: El programa de Razón Variable (RV).*

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[TEORÍAS DEL APRENDIZAJE] --> B[Enfoques Conductistas]
    A --> C[Enfoques Cognitivos y Sociales]
    A --> D[Enfoques Constructivistas]
    A --> E[Estilos de Aprendizaje]

    B --> B1[Condicionamiento Clásico: Pávlov y Watson EI, RI, EC, RC]
    B --> B2[Condicionamiento Instrumental: Thorndike Ley del Efecto]
    B --> B3[Condicionamiento Operante: Skinner R+, R-, C+, C-]

    C --> C1[Insight Gestáltico: Köhler]
    C --> C2[Aprendizaje Latente y Mapas: Tolman]
    C --> C3[Aprendizaje Social Vicario: Bandura Modelado]

    D --> D1[Aprendizaje Significativo: Ausubel Saberes Previos]
    D --> D2[Teoría Psicogenética: Piaget Asimilación y Acomodación]
    D --> D3[Teoría Sociocultural: Vygotsky ZDP y Andamiaje]
    D --> D4[Aprendizaje por Descubrimiento: Bruner]

    E --> E1[Modelo VAK: Visual, Auditivo, Kinestésico]
    E --> E2[Modelo de Kolb: Experiencia Concreta y Conceptualización]
```

---



### 4.3. Teorías Cognitivas y Constructivistas
1. **Aprendizaje Social o Vicario (Albert Bandura):**
   Aprendizaje por observación e imitación de modelos conductuales sin necesidad de ejecutar directamente la conducta ni recibir refuerzo inmediato. Requiere cuatro fases secuenciales:
   \text{Atención} \longrightarrow \text{Retención (Memoria)} \longrightarrow \text{Reproducción Motora} \longrightarrow \text{Motivación / Refuerzo Vicario}
2. **Aprendizaje Significativo (David Ausubel):**
   Ocurre cuando la nueva información se conecta de manera sustantiva y no arbitraria con los **saberes previos** (*subsumidores*) ya existentes en la estructura cognitiva del aprendiz.
   - Empleo de **organizadores previos** (puentes cognitivos entre lo que el alumno ya sabe y lo que necesita aprender).
   - Se opone frontalmente al *aprendizaje memorístico o repetitivo mecánico*.
3. **Teoría Sociocultural (Lev Vygotsky):**
   - El aprendizaje precede al desarrollo y es mediado por herramientas e instrumentos semióticos (el lenguaje).
   - **Zona de Desarrollo Real (ZDR):** Lo que el estudiante es capaz de resolver por sí mismo de forma autónoma.
   - **Zona de Desarrollo Próximo (ZDP):** Distancia entre la ZDR y el nivel de desarrollo potencial alcanzable con la guía de un adulto o mediador experto.
   - **Andamiaje (*Scaffolding* - Jerome Bruner):** Apoyo temporal y ajustable que brinda el docente o tutor en la ZDP y que se retira progresivamente a medida que el aprendiz gana autonomía.



### 4.4. Estilos de Aprendizaje
- **Modelo VAK:**
  - **Visual:** Recuerda mejor con imágenes, diagramas, esquemas, colores y lectura de textos.
  - **Auditivo:** Aprende escuchando explicaciones, debates orales, audiolibros y repetición en voz alta.
  - **Kinestésico:** Aprende mediante la acción física, manipulación de objetos, dramatización y experimentos de laboratorio.
- **Modelo de David Kolb (Ciclo Experiencial):**
  - Cruza dos ejes: Percepción (Experiencia Concreta vs. Conceptualización Abstracta) y Procesamiento (Experimentación Activa vs. Observación Reflexiva), generando cuatro estilos: *Convergente*, *Divergente*, *Asimilador* y *Acomodador*.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Regla de Oro de Skinner:**
   > **"Refuerzo siempre SUMA conducta (aumenta)"**  
   > **"Castigo siempre RESTA conducta (disminuye)"**  
   > **"Positivo = Dar (+)"** / **"Negativo = Quitar (-)"**
2. **Fases del Modelado de Bandura:**
   > **"A-RE-MO"** \implies **A**tención, **Re**tención, **Re**producción motora, **Mo**tivación.
3. **Las Zonas de Vygotsky:**
   > **ZDR:** *"Lo que hago solo"*.  
   > **ZDP:** *"El puente de aprendizaje con ayuda"*.  
   > **ZDPotencial:** *"Lo que haré mañana con autonomía"*.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Confundir Refuerzo Negativo con Castigo):** ¡El error número 1 en admisión!
  - El **Refuerzo Negativo** elimina un estímulo aversivo para **AUMENTAR** la conducta deseada (ej. tomar una pastilla para quitarse el dolor de cabeza aumenta el hábito de tomarla; ponerse el cinturón para callar la alarma ruidosa del auto).
  - El **Castigo** siempre busca **DISMINUIR** o extinguir la conducta (positivo si da dolor, negativo si quita un privilegio).
- **Trampa 2 (Condicionamiento Clásico vs. Operante):** En el clásico la conducta es **involuntaria y refleja** (sistema nervioso autónomo: salivar, asustarse, taquicardia); en el operante la conducta es **voluntaria y motora** (sistema esquelético: apretar una palanca, estudiar, comprar).
- **Trampa 3 (Aprendizaje Significativo):** Para que haya aprendizaje significativo según Ausubel, es condición indispensable que el estudiante cuente con **ideas o saberes previos pertinentes** en su estructura cognitiva.

---



### Problema 4: Aprendizaje Social Vicario de Bandura (Nivel Avanzado)
**Enunciado:** En el famoso experimento del Muñeco Bobo (*Bobo Doll Experiment*) de Albert Bandura:
1. Niños en edad preescolar observaron a un adulto golpear violentamente a un muñeco inflable con un martillo mientras profería insultos verbales específicos.
2. Posteriormente, los niños fueron colocados en una habitación con juguetes atractivos y se les permitió jugar libremente con el muñeco.
Los resultados experimentales demostraron que:
A) Los niños ignoraron al muñeco por no haber recibido un refuerzo de comida previo.  
B) Los niños imitaron con precisión los mismos actos agresivos y expresiones verbales del adulto, demostrando que la conducta se adquiere por observación vicaria sin necesidad de reforzamiento directo previo.  
C) Solo los niños con lesiones prefrontales imitaron la conducta del modelo adulto.  
D) La agresión infantil es un instinto genético puro que no sufre influencia ambiental.  
E) La imitación cesó inmediatamente al retirar al adulto de la habitación.  

**Solución paso a paso:**
1. El experimento de Bandura demostró que el aprendizaje humano no depende exclusivamente de la ejecución motora directa reforzada (como sostenía Skinner).
2. Los niños aprenden repertorios conductuales complejos mediante la **atención y retención cognitiva del modelo (aprendizaje vicario u observacional)**, exhibiendo las conductas agresivas aprendidas de manera espontánea.

**Respuesta:** B) Los niños imitaron con precisión los mismos actos agresivos y expresiones verbales del adulto, demostrando que la conducta se adquiere por observación vicaria sin necesidad de reforzamiento directo previo.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué fisiólogo ruso descubrió accidentalmente las leyes del condicionamiento clásico mientras investigaba los reflejos digestivos de los perros?
   - *Pista:* Premio Nobel de Medicina en 1904.
   - *Clave:* Iván Pávlov.

2. Un conductor se pone el cinturón de seguridad de su automóvil para apagar el chirrido molesto de la alarma del tablero. Este aumento en la conducta de usar el cinturón ejemplifica un:
   - *Pista:* Elimina un estímulo aversivo para aumentar la conducta.
   - *Clave:* Refuerzo negativo (de escape/evitación).

3. ¿Qué teórico postuló el concepto de "aprendizaje significativo", destacando la integración sustantiva entre la nueva información y los saberes previos?
   - *Pista:* Psicólogo educativo estadounidense de apellido Ausubel.
   - *Clave:* David Ausubel.

4. Un estudiante comprende súbitamente la solución de un problema de geometría mientras caminaba hacia su casa, exclamando: *"¡Eureka, ahora veo cómo trazar la línea auxiliar!"*. Este aprendizaje corresponde a:
   - *Pista:* Fenómeno gestáltico estudiado por Wolfgang Köhler.
   - *Clave:* Aprendizaje por insight (o reestructuración perceptiva).

5. ¿Cómo se denomina el estilo de aprendizaje del modelo VAK en el cual la persona aprende mejor realizando experimentos de laboratorio, tocando materiales y ejecutando movimientos físicos?
   - *Pista:* Movimiento y sensación corporal.
   - *Clave:* Kinestésico (o cinestésico).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Aprendizaje:** Cambio conductual o cognitivo relativamente permanente originado por la experiencia, el entrenamiento o la práctica interactiva.
2. **Condicionamiento Clásico:** Aprendizaje asociativo por contigüidad donde un estímulo neutro adquiere la propiedad de evocar una respuesta refleja involuntaria.
3. **Condicionamiento Operante:** Aprendizaje donde la probabilidad de emisión de una respuesta voluntaria es modulada por las consecuencias reforzantes o aversivas que le siguen.
4. **Refuerzo Negativo:** Incremento de una conducta motivado por la eliminación, reducción o evitación de un estímulo aversivo desagradable.
5. **Costo de Respuesta:** Disminución de una conducta provocada por la retirada deliberada de un reforzador positivo que el sujeto ya poseía (Castigo Negativo).
6. **Aprendizaje Vicario:** Adquisición de pautas de comportamiento a través de la observación atenta de las acciones y consecuencias en un modelo externo (Bandura).
7. **Zona de Desarrollo Próximo (ZDP):** Espacio conceptual entre las capacidades que el estudiante ya domina de forma autónoma y las que puede alcanzar con mediación experta (Vygotsky).
8. **Andamiaje:** Sistema estructurado de soportes y ayudas temporales brindadas al aprendiz para acompañar su progreso en la ZDP (Bruner).
9. **Aprendizaje Significativo:** Asimilación cognitiva de nuevos conceptos anclados de forma coherente y no arbitraria en ideas previas relevantes (Ausubel).
10. **Insight:** Fenómeno de comprensión repentina y reorganización global del campo perceptual que resuelve un problema intelectual (Gestalt).

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Diseño de Videojuegos y Gamificación:** Los sistemas de recompensas aleatorias (cofres de botín, *loot boxes*) se basan directamente en los programas de Razón Variable de Skinner para maximizar la tasa de juego constante y adictiva.
- **Pedagogía Universitaria y Currículo por Competencias:** El aprendizaje basado en problemas (ABP) y el aula invertida (*flipped classroom*) operan aplicando los principios de la ZDP de Vygotsky y el aprendizaje por descubrimiento guiado de Bruner.
- **Terapia Conductual y Modificación de Conducta:** Técnicas como la desensibilización sistemática de Joseph Wolpe (basada en el contracondicionamiento clásico) curan fobias específicas a volar o a animales asociando el estímulo temido con relajación muscular profunda.

---



### 4.2. Condicionamiento Operante o Instrumental (Thorndike y Skinner)
La conducta está en función de sus consecuencias ambientales (R \to C):
1. **Ley del Efecto de Edward Thorndike:** Las conductas seguidas de consecuencias satisfactorias tienden a repetirse; las seguidas de consecuencias displacenteras tienden a extinguirse.
2. **Triple Relación de Contingencia de B. F. Skinner:**
   E^D \ (\text{Estímulo Discriminativo}) \longrightarrow R \ (\text{Respuesta Operante}) \longrightarrow E^C \ (\text{Estímulo Consecuente})
3. **Matriz de Contingencias Operantes:**

| Naturaleza del Procedimiento | Consecuencia Apetecible / Agradable | Consecuencia Aversiva / Desagradable |
| :--- | :--- | :--- |
| **Se entrega o administra (Añadir estímulo, +)** | **REFUERZO POSITIVO (R^+):**<br>Incrementa la frecuencia de la conducta.<br>*(Ej. elogio, diploma, premio por sacar 20).* | **CASTIGO POSITIVO (C^+):**<br>Disminuye la frecuencia de la conducta.<br>*(Ej. llamada de atención, planas, multa).* |
| **Se retira o elimina (Quitar estímulo, -)** | **CASTIGO NEGATIVO (C^- o Costo de Respuesta):**<br>Disminuye la frecuencia de la conducta.<br>*(Ej. quitar el celular por desaprobar).* | **REFUERZO NEGATIVO (R^-):**<br>Incrementa la frecuencia de la conducta.<br>- *Escape:* Quita un dolor presente.<br>- *Evitación:* Previene un dolor futuro. |

4. **Programas de Reforzamiento Intermitente:**
   - **Razón Fija (RF):** Refuerzo tras un número fijo constante de conductas (ej. comisión tras vender 5 libros).
   - **Razón Variable (RV):** Refuerzo tras un número impredecible y variable de conductas (ej. máquinas tragamonedas de casino). Es el más resistente a la extinción.
   - **Intervalo Fijo (IF):** Refuerzo a la primera conducta tras cumplirse un tiempo fijo exacto (ej. cobrar sueldo cada 30 días, examen cada viernes).
   - **Intervalo Variable (IV):** Refuerzo a la primera conducta tras intervalos temporales imprevistos (ej. simulacros sorpresa del docente).



### Problema 3: Teoría Sociocultural de Lev Vygotsky (Nivel Intermedio-Avanzado)
**Enunciado:** Un estudiante preuniversitario intenta resolver un problema de cinemática con derivadas y se bloquea por completo. El profesor no le resuelve el ejercicio, sino que le hace dos preguntas clave: *"¿Qué representa geométricamente la pendiente de la gráfica posición vs. tiempo?"* y *"¿Cómo se define la aceleración instantánea en función de la velocidad?"*. Con estas pistas y preguntas orientadoras, el estudiante deduce la solución por sí mismo. El profesor actuó dentro de:
A) La zona de desarrollo real del estudiante mediante castigo positivo.  
B) La zona de desarrollo próximo del estudiante brindando un andamiaje cognitivo.  
C) La asimilación pura sin acomodación piagetiana.  
D) El condicionamiento instrumental por ensayo y error.  
E) El moldeamiento conductual por aproximaciones sucesivas.  

**Solución paso a paso:**
1. El estudiante no podía resolver el problema solo (estaba fuera de su Zona de Desarrollo Real), pero tenía el potencial para hacerlo con la ayuda adecuada.
2. La intervención del docente mediante preguntas guía y pistas temporales constituye el **andamiaje** (*scaffolding* de Bruner) dentro de la **Zona de Desarrollo Próximo (ZDP)** postulada por Vygotsky.

**Respuesta:** B) La zona de desarrollo próximo del estudiante brindando un andamiaje cognitivo.

---



### Problema 5: Programas de Reforzamiento de Skinner (Boss Challenge)
**Enunciado:** Analice los siguientes dos casos de conducta en relación con los programas de reforzamiento de B. F. Skinner:
Caso 1: Un obrero de una fábrica textil recibe una bonificación económica de 50 soles cada vez que confecciona exactamente 20 pantalones completos.
Caso 2: Un apostador introduce monedas en una máquina tragamonedas en el casino de Arequipa; a veces gana un premio tras 3 intentos, otras tras 45 intentos, y otras tras 12 intentos.
Los programas de reforzamiento que mantienen las conductas en el Caso 1 y Caso 2 son respectivamente:
A) Intervalo Fijo e Intervalo Variable.  
B) Razón Variable y Razón Fija.  
C) Razón Fija y Razón Variable.  
D) Intervalo Fijo y Razón Variable.  
E) Razón Fija e Intervalo Fijo.  

**Solución paso a paso:**
1. Caso 1: La entrega del reforzador económico depende estrictamente del número de conductas emitidas (20\text{ pantalones} constantes) \implies **Programa de Razón Fija (RF)**.
2. Caso 2: El refuerzo depende del número de intentos mecánicos, pero la cantidad exacta de palancazos requerida cambia aleatoriamente e impredeciblemente alrededor de un promedio \implies **Programa de Razón Variable (RV)**.
3. El orden correcto es: Razón Fija y Razón Variable.

**Respuesta:** C) Razón Fija y Razón Variable.

---



### Problema 1: Análisis de Contingencias Operantes de Skinner (Nivel Básico)
**Enunciado:** Cada vez que el perro de Pamela ladra de madrugada para subirse a la cama, Pamela le retira el juguete interactivo que más le gusta y lo guarda en un cajón con llave hasta el mediodía siguiente. Con este procedimiento, los ladridos nocturnos del perro disminuyen drásticamente en dos semanas. ¿Qué principio del condicionamiento operante aplicó Pamela?
A) Refuerzo positivo  
B) Refuerzo negativo  
C) Castigo positivo  
D) Castigo negativo (costo de respuesta)  
E) Extinción clásica  

**Solución paso a paso:**
1. Evaluamos el efecto sobre la conducta: los ladridos *disminuyeron* en frecuencia \implies se trata de un **Castigo**.
2. Evaluamos la acción del estímulo: se le *retiró o quitó* un estímulo apetecible (su juguete favorito) \implies es de naturaleza **Negativa**.
3. Por lo tanto, el procedimiento aplicado es un **Castigo Negativo** (o costo de respuesta).

**Respuesta:** D) Castigo negativo (costo de respuesta).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t09_s01_c01",
                    question = "En psicología científica, el 'Aprendizaje' se define formalmente como:",
                    options = listOf(
                        "Cualquier cambio corporal transitorio provocado por la fatiga o la embriaguez alcohólica.",
                        "La maduración biológica espontánea del sistema motor (como empezar a caminar al cumplir el año).",
                        "El cambio relativamente permanente en la conducta o en las representaciones mentales y esquemas cognitivos, producido como resultado de la experiencia, práctica o entrenamiento.",
                        "El crecimiento en estatura y peso de los niños.",
                    ),
                    correctIndex = 2,
                    explanation = "Para que un cambio sea aprendizaje debe ser duradero y derivado de la experiencia; se excluyen cambios efímeros por drogas, fatiga o la mera maduración biológica genética."
                ),
                Challenge(
                    id = "psi_t09_s01_c02",
                    question = "¿Cuál de las siguientes conductas NO constituye un aprendizaje sino un reflejo innato no aprendido?",
                    options = listOf(
                        "Manejar una motocicleta en una avenida transitada",
                        "Retirar instantáneamente la mano al tocar una olla hirviendo (reflejo de flexión)",
                        "Escribir un ensayo en procesador de textos",
                        "Recitar las tablas de multiplicar de memoria",
                    ),
                    correctIndex = 1,
                    explanation = "Los reflejos medulares innatos son circuitos preprogramados biológicamente para la defensa inmediata sin intervención de la experiencia previa."
                ),
                Challenge(
                    id = "psi_t09_s01_c03",
                    question = "El cambio de conducta que se produce únicamente por el desarrollo físico y mielinización progresiva del sistema nervioso (como el control de esfínteres a cierta edad) se debe al proceso de:",
                    options = listOf(
                        "Aprendizaje por descubrimiento",
                        "Maduración biológica",
                        "Condicionamiento operante",
                        "Refuerzo secundario",
                    ),
                    correctIndex = 1,
                    explanation = "La maduración es el despliegue del programa genético biológico; proporciona el sustrato anatómico sobre el cual luego puede intervenir el aprendizaje."
                ),
                Challenge(
                    id = "psi_t09_s01_c04",
                    question = "El Condicionamiento Clásico (o respondiente) fue descubierto accidentalmente en Rusia por el fisiólogo premio Nobel:",
                    options = listOf(
                        "Iván Pávlov",
                        "Lev Vygotsky",
                        "Alexander Luria",
                        "Vladimir Béjterev",
                    ),
                    correctIndex = 0,
                    explanation = "Pávlov investigaba la digestión en perros y descubrió las 'secreciones psíquicas': los animales salivaban antes de ver la comida ante estímulos asociados al cuidador."
                ),
                Challenge(
                    id = "psi_t09_s01_c05",
                    question = "En el paradigma experimental del condicionamiento clásico de Pávlov, la carne molida colocada en la boca del perro actúa como un:",
                    options = listOf(
                        "Estímulo Incondicionado (EI)",
                        "Estímulo Condicionado (EC)",
                        "Estímulo Neutro (EN)",
                        "Respuesta Condicionada (RC)",
                    ),
                    correctIndex = 0,
                    explanation = "El EI es el estímulo biológico que desencadena de forma innata y automática una respuesta refleja no aprendida (la salivación incondicionada)."
                ),
                Challenge(
                    id = "psi_t09_s01_c06",
                    question = "El sonido de una campana que inicialmente no provocaba salivación en el animal (Estímulo Neutro), tras ser emparejado repetidamente justo antes de la presentación de la comida, se convierte en un:",
                    options = listOf(
                        "Refuerzo negativo",
                        "Estímulo Incondicionado (EI)",
                        "Estímulo Condicionado (EC)",
                        "Castigo vicario",
                    ),
                    correctIndex = 2,
                    explanation = "Por contigüidad temporal y asociación repetida, el estímulo previamente neutro adquiere la capacidad de evocar la salivación, denominándose Estímulo Condicionado."
                ),
                Challenge(
                    id = "psi_t09_s01_c07",
                    question = "La salivación provocada únicamente por el sonido de la campana en ausencia total de comida es técnicamente la:",
                    options = listOf(
                        "Conducta de escape",
                        "Respuesta Incondicionada (RI)",
                        "Respuesta Condicionada (RC)",
                        "Extinción operante",
                    ),
                    correctIndex = 2,
                    explanation = "La RC es la respuesta refleja aprendida evocada por el Estímulo Condicionado tras el proceso asociativo."
                ),
                Challenge(
                    id = "psi_t09_s01_c08",
                    question = "John B. Watson y Rosalie Rayner demostraron que las emociones humanas pueden condicionarse clásicamente mediante el célebre y éticamente controvertido experimento con:",
                    options = listOf(
                        "El mono Rhesus y la madre de felpa",
                        "La paloma de Skinner en la cámara de picoteo",
                        "El gato encerrado en la caja problema de Thorndike",
                        "El pequeño Albert (condicionamiento del miedo fóbico a una rata blanca mediante un ruido metálico aterrador)",
                    ),
                    correctIndex = 3,
                    explanation = "Watson condicionó el miedo emparejando la presencia de una rata blanca inofensiva con un estruendo metálico; el niño generalizó luego el terror a objetos peludos y conejos."
                ),
                Challenge(
                    id = "psi_t09_s01_c09",
                    question = "En el condicionamiento clásico, el proceso de 'Extinción' se produce formalmente cuando:",
                    options = listOf(
                        "Se administra una descarga eléctrica dolorosa al organismo.",
                        "Se presenta reiteradamente el Estímulo Condicionado (campana) solo, sin asociarlo nunca más con el Estímulo Incondicionado (comida), debilitándose la respuesta hasta desaparecer.",
                        "El animal fallece por inanición.",
                        "Se cambia el color de las paredes del laboratorio.",
                    ),
                    correctIndex = 1,
                    explanation = "Sin el reforzamiento natural que aporta el EI, el vínculo asociativo se inhibe paulatinamente cesando la emisión de la Respuesta Condicionada."
                ),
                Challenge(
                    id = "psi_t09_s01_c10",
                    question = "El fenómeno de 'Generalización del Estímulo' se manifiesta cuando el sujeto condicionado emite la respuesta aprendida ante:",
                    options = listOf(
                        "Estímulos nuevos que guardan una estrecha semejanza física o auditiva con el estímulo condicionado original (ej. salivar ante campanas de diferentes tonos).",
                        "Estímulos totalmente opuestos y de naturaleza distinta.",
                        "Cualquier palabra pronunciada en otro idioma.",
                        "La ausencia absoluta de estímulos sensoriales.",
                    ),
                    correctIndex = 0,
                    explanation = "Cuanto más semejante sea el nuevo estímulo al EC original, mayor será la probabilidad e intensidad con que se desencadene la respuesta condicionada."
                ),
            )
        ),
        LessonNode(
            id = "psi_t09_s02",
            subjectId = "psicologia",
            semana = 9,
            subtema = "9.2",
            title = "4.2. Condicionamiento Operante o Instrumental (Thorndike y Skinner)",
            theory = LessonTheory(
                content = """# TEMA 09: APRENDIZAJE: TEORÍAS Y ESTILOS

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[TEORÍAS DEL APRENDIZAJE] --> B[Enfoques Conductistas]
    A --> C[Enfoques Cognitivos y Sociales]
    A --> D[Enfoques Constructivistas]
    A --> E[Estilos de Aprendizaje]

    B --> B1[Condicionamiento Clásico: Pávlov y Watson EI, RI, EC, RC]
    B --> B2[Condicionamiento Instrumental: Thorndike Ley del Efecto]
    B --> B3[Condicionamiento Operante: Skinner R+, R-, C+, C-]

    C --> C1[Insight Gestáltico: Köhler]
    C --> C2[Aprendizaje Latente y Mapas: Tolman]
    C --> C3[Aprendizaje Social Vicario: Bandura Modelado]

    D --> D1[Aprendizaje Significativo: Ausubel Saberes Previos]
    D --> D2[Teoría Psicogenética: Piaget Asimilación y Acomodación]
    D --> D3[Teoría Sociocultural: Vygotsky ZDP y Andamiaje]
    D --> D4[Aprendizaje por Descubrimiento: Bruner]

    E --> E1[Modelo VAK: Visual, Auditivo, Kinestésico]
    E --> E2[Modelo de Kolb: Experiencia Concreta y Conceptualización]
```

---



### 3.1. Definición y Características del Aprendizaje
- **Definición Psicológica:** Proceso de cambio relativamente permanente en la conducta, en los procesos cognitivos o en el potencial conductual de un organismo, resultante de la práctica, la experiencia o la interacción con el ambiente.
- **Lo que NO es Aprendizaje:**
  - Cambios debidos a la **maduración biológica** (ej. aprender a caminar a los 12 meses por mielinización neuronal).
  - Respuestas causadas por **reflejos innatos** o instintos biológicos (ej. parpadeo corneal, reflejo rotuliano).
  - Modificaciones temporales por **fatiga**, ingestión de sustancias químicas (drogas, alcohol) o adaptación sensorial (ej. acostumbrarse a un olor fuerte).

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



### 4.2. Condicionamiento Operante o Instrumental (Thorndike y Skinner)
La conducta está en función de sus consecuencias ambientales (R \to C):
1. **Ley del Efecto de Edward Thorndike:** Las conductas seguidas de consecuencias satisfactorias tienden a repetirse; las seguidas de consecuencias displacenteras tienden a extinguirse.
2. **Triple Relación de Contingencia de B. F. Skinner:**
   E^D \ (\text{Estímulo Discriminativo}) \longrightarrow R \ (\text{Respuesta Operante}) \longrightarrow E^C \ (\text{Estímulo Consecuente})
3. **Matriz de Contingencias Operantes:**

| Naturaleza del Procedimiento | Consecuencia Apetecible / Agradable | Consecuencia Aversiva / Desagradable |
| :--- | :--- | :--- |
| **Se entrega o administra (Añadir estímulo, +)** | **REFUERZO POSITIVO (R^+):**<br>Incrementa la frecuencia de la conducta.<br>*(Ej. elogio, diploma, premio por sacar 20).* | **CASTIGO POSITIVO (C^+):**<br>Disminuye la frecuencia de la conducta.<br>*(Ej. llamada de atención, planas, multa).* |
| **Se retira o elimina (Quitar estímulo, -)** | **CASTIGO NEGATIVO (C^- o Costo de Respuesta):**<br>Disminuye la frecuencia de la conducta.<br>*(Ej. quitar el celular por desaprobar).* | **REFUERZO NEGATIVO (R^-):**<br>Incrementa la frecuencia de la conducta.<br>- *Escape:* Quita un dolor presente.<br>- *Evitación:* Previene un dolor futuro. |

4. **Programas de Reforzamiento Intermitente:**
   - **Razón Fija (RF):** Refuerzo tras un número fijo constante de conductas (ej. comisión tras vender 5 libros).
   - **Razón Variable (RV):** Refuerzo tras un número impredecible y variable de conductas (ej. máquinas tragamonedas de casino). Es el más resistente a la extinción.
   - **Intervalo Fijo (IF):** Refuerzo a la primera conducta tras cumplirse un tiempo fijo exacto (ej. cobrar sueldo cada 30 días, examen cada viernes).
   - **Intervalo Variable (IV):** Refuerzo a la primera conducta tras intervalos temporales imprevistos (ej. simulacros sorpresa del docente).



### 4.3. Teorías Cognitivas y Constructivistas
1. **Aprendizaje Social o Vicario (Albert Bandura):**
   Aprendizaje por observación e imitación de modelos conductuales sin necesidad de ejecutar directamente la conducta ni recibir refuerzo inmediato. Requiere cuatro fases secuenciales:
   \text{Atención} \longrightarrow \text{Retención (Memoria)} \longrightarrow \text{Reproducción Motora} \longrightarrow \text{Motivación / Refuerzo Vicario}
2. **Aprendizaje Significativo (David Ausubel):**
   Ocurre cuando la nueva información se conecta de manera sustantiva y no arbitraria con los **saberes previos** (*subsumidores*) ya existentes en la estructura cognitiva del aprendiz.
   - Empleo de **organizadores previos** (puentes cognitivos entre lo que el alumno ya sabe y lo que necesita aprender).
   - Se opone frontalmente al *aprendizaje memorístico o repetitivo mecánico*.
3. **Teoría Sociocultural (Lev Vygotsky):**
   - El aprendizaje precede al desarrollo y es mediado por herramientas e instrumentos semióticos (el lenguaje).
   - **Zona de Desarrollo Real (ZDR):** Lo que el estudiante es capaz de resolver por sí mismo de forma autónoma.
   - **Zona de Desarrollo Próximo (ZDP):** Distancia entre la ZDR y el nivel de desarrollo potencial alcanzable con la guía de un adulto o mediador experto.
   - **Andamiaje (*Scaffolding* - Jerome Bruner):** Apoyo temporal y ajustable que brinda el docente o tutor en la ZDP y que se retira progresivamente a medida que el aprendiz gana autonomía.



### 4.4. Estilos de Aprendizaje
- **Modelo VAK:**
  - **Visual:** Recuerda mejor con imágenes, diagramas, esquemas, colores y lectura de textos.
  - **Auditivo:** Aprende escuchando explicaciones, debates orales, audiolibros y repetición en voz alta.
  - **Kinestésico:** Aprende mediante la acción física, manipulación de objetos, dramatización y experimentos de laboratorio.
- **Modelo de David Kolb (Ciclo Experiencial):**
  - Cruza dos ejes: Percepción (Experiencia Concreta vs. Conceptualización Abstracta) y Procesamiento (Experimentación Activa vs. Observación Reflexiva), generando cuatro estilos: *Convergente*, *Divergente*, *Asimilador* y *Acomodador*.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Regla de Oro de Skinner:**
   > **"Refuerzo siempre SUMA conducta (aumenta)"**  
   > **"Castigo siempre RESTA conducta (disminuye)"**  
   > **"Positivo = Dar (+)"** / **"Negativo = Quitar (-)"**
2. **Fases del Modelado de Bandura:**
   > **"A-RE-MO"** \implies **A**tención, **Re**tención, **Re**producción motora, **Mo**tivación.
3. **Las Zonas de Vygotsky:**
   > **ZDR:** *"Lo que hago solo"*.  
   > **ZDP:** *"El puente de aprendizaje con ayuda"*.  
   > **ZDPotencial:** *"Lo que haré mañana con autonomía"*.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Confundir Refuerzo Negativo con Castigo):** ¡El error número 1 en admisión!
  - El **Refuerzo Negativo** elimina un estímulo aversivo para **AUMENTAR** la conducta deseada (ej. tomar una pastilla para quitarse el dolor de cabeza aumenta el hábito de tomarla; ponerse el cinturón para callar la alarma ruidosa del auto).
  - El **Castigo** siempre busca **DISMINUIR** o extinguir la conducta (positivo si da dolor, negativo si quita un privilegio).
- **Trampa 2 (Condicionamiento Clásico vs. Operante):** En el clásico la conducta es **involuntaria y refleja** (sistema nervioso autónomo: salivar, asustarse, taquicardia); en el operante la conducta es **voluntaria y motora** (sistema esquelético: apretar una palanca, estudiar, comprar).
- **Trampa 3 (Aprendizaje Significativo):** Para que haya aprendizaje significativo según Ausubel, es condición indispensable que el estudiante cuente con **ideas o saberes previos pertinentes** en su estructura cognitiva.

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Análisis de Contingencias Operantes de Skinner (Nivel Básico)
**Enunciado:** Cada vez que el perro de Pamela ladra de madrugada para subirse a la cama, Pamela le retira el juguete interactivo que más le gusta y lo guarda en un cajón con llave hasta el mediodía siguiente. Con este procedimiento, los ladridos nocturnos del perro disminuyen drásticamente en dos semanas. ¿Qué principio del condicionamiento operante aplicó Pamela?
A) Refuerzo positivo  
B) Refuerzo negativo  
C) Castigo positivo  
D) Castigo negativo (costo de respuesta)  
E) Extinción clásica  

**Solución paso a paso:**
1. Evaluamos el efecto sobre la conducta: los ladridos *disminuyeron* en frecuencia \implies se trata de un **Castigo**.
2. Evaluamos la acción del estímulo: se le *retiró o quitó* un estímulo apetecible (su juguete favorito) \implies es de naturaleza **Negativa**.
3. Por lo tanto, el procedimiento aplicado es un **Castigo Negativo** (o costo de respuesta).

**Respuesta:** D) Castigo negativo (costo de respuesta).

---



### Problema 3: Teoría Sociocultural de Lev Vygotsky (Nivel Intermedio-Avanzado)
**Enunciado:** Un estudiante preuniversitario intenta resolver un problema de cinemática con derivadas y se bloquea por completo. El profesor no le resuelve el ejercicio, sino que le hace dos preguntas clave: *"¿Qué representa geométricamente la pendiente de la gráfica posición vs. tiempo?"* y *"¿Cómo se define la aceleración instantánea en función de la velocidad?"*. Con estas pistas y preguntas orientadoras, el estudiante deduce la solución por sí mismo. El profesor actuó dentro de:
A) La zona de desarrollo real del estudiante mediante castigo positivo.  
B) La zona de desarrollo próximo del estudiante brindando un andamiaje cognitivo.  
C) La asimilación pura sin acomodación piagetiana.  
D) El condicionamiento instrumental por ensayo y error.  
E) El moldeamiento conductual por aproximaciones sucesivas.  

**Solución paso a paso:**
1. El estudiante no podía resolver el problema solo (estaba fuera de su Zona de Desarrollo Real), pero tenía el potencial para hacerlo con la ayuda adecuada.
2. La intervención del docente mediante preguntas guía y pistas temporales constituye el **andamiaje** (*scaffolding* de Bruner) dentro de la **Zona de Desarrollo Próximo (ZDP)** postulada por Vygotsky.

**Respuesta:** B) La zona de desarrollo próximo del estudiante brindando un andamiaje cognitivo.

---



### Problema 4: Aprendizaje Social Vicario de Bandura (Nivel Avanzado)
**Enunciado:** En el famoso experimento del Muñeco Bobo (*Bobo Doll Experiment*) de Albert Bandura:
1. Niños en edad preescolar observaron a un adulto golpear violentamente a un muñeco inflable con un martillo mientras profería insultos verbales específicos.
2. Posteriormente, los niños fueron colocados en una habitación con juguetes atractivos y se les permitió jugar libremente con el muñeco.
Los resultados experimentales demostraron que:
A) Los niños ignoraron al muñeco por no haber recibido un refuerzo de comida previo.  
B) Los niños imitaron con precisión los mismos actos agresivos y expresiones verbales del adulto, demostrando que la conducta se adquiere por observación vicaria sin necesidad de reforzamiento directo previo.  
C) Solo los niños con lesiones prefrontales imitaron la conducta del modelo adulto.  
D) La agresión infantil es un instinto genético puro que no sufre influencia ambiental.  
E) La imitación cesó inmediatamente al retirar al adulto de la habitación.  

**Solución paso a paso:**
1. El experimento de Bandura demostró que el aprendizaje humano no depende exclusivamente de la ejecución motora directa reforzada (como sostenía Skinner).
2. Los niños aprenden repertorios conductuales complejos mediante la **atención y retención cognitiva del modelo (aprendizaje vicario u observacional)**, exhibiendo las conductas agresivas aprendidas de manera espontánea.

**Respuesta:** B) Los niños imitaron con precisión los mismos actos agresivos y expresiones verbales del adulto, demostrando que la conducta se adquiere por observación vicaria sin necesidad de reforzamiento directo previo.

---



### Problema 5: Programas de Reforzamiento de Skinner (Boss Challenge)
**Enunciado:** Analice los siguientes dos casos de conducta en relación con los programas de reforzamiento de B. F. Skinner:
Caso 1: Un obrero de una fábrica textil recibe una bonificación económica de 50 soles cada vez que confecciona exactamente 20 pantalones completos.
Caso 2: Un apostador introduce monedas en una máquina tragamonedas en el casino de Arequipa; a veces gana un premio tras 3 intentos, otras tras 45 intentos, y otras tras 12 intentos.
Los programas de reforzamiento que mantienen las conductas en el Caso 1 y Caso 2 son respectivamente:
A) Intervalo Fijo e Intervalo Variable.  
B) Razón Variable y Razón Fija.  
C) Razón Fija y Razón Variable.  
D) Intervalo Fijo y Razón Variable.  
E) Razón Fija e Intervalo Fijo.  

**Solución paso a paso:**
1. Caso 1: La entrega del reforzador económico depende estrictamente del número de conductas emitidas (20\text{ pantalones} constantes) \implies **Programa de Razón Fija (RF)**.
2. Caso 2: El refuerzo depende del número de intentos mecánicos, pero la cantidad exacta de palancazos requerida cambia aleatoriamente e impredeciblemente alrededor de un promedio \implies **Programa de Razón Variable (RV)**.
3. El orden correcto es: Razón Fija y Razón Variable.

**Respuesta:** C) Razón Fija y Razón Variable.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué fisiólogo ruso descubrió accidentalmente las leyes del condicionamiento clásico mientras investigaba los reflejos digestivos de los perros?
   - *Pista:* Premio Nobel de Medicina en 1904.
   - *Clave:* Iván Pávlov.

2. Un conductor se pone el cinturón de seguridad de su automóvil para apagar el chirrido molesto de la alarma del tablero. Este aumento en la conducta de usar el cinturón ejemplifica un:
   - *Pista:* Elimina un estímulo aversivo para aumentar la conducta.
   - *Clave:* Refuerzo negativo (de escape/evitación).

3. ¿Qué teórico postuló el concepto de "aprendizaje significativo", destacando la integración sustantiva entre la nueva información y los saberes previos?
   - *Pista:* Psicólogo educativo estadounidense de apellido Ausubel.
   - *Clave:* David Ausubel.

4. Un estudiante comprende súbitamente la solución de un problema de geometría mientras caminaba hacia su casa, exclamando: *"¡Eureka, ahora veo cómo trazar la línea auxiliar!"*. Este aprendizaje corresponde a:
   - *Pista:* Fenómeno gestáltico estudiado por Wolfgang Köhler.
   - *Clave:* Aprendizaje por insight (o reestructuración perceptiva).

5. ¿Cómo se denomina el estilo de aprendizaje del modelo VAK en el cual la persona aprende mejor realizando experimentos de laboratorio, tocando materiales y ejecutando movimientos físicos?
   - *Pista:* Movimiento y sensación corporal.
   - *Clave:* Kinestésico (o cinestésico).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Aprendizaje:** Cambio conductual o cognitivo relativamente permanente originado por la experiencia, el entrenamiento o la práctica interactiva.
2. **Condicionamiento Clásico:** Aprendizaje asociativo por contigüidad donde un estímulo neutro adquiere la propiedad de evocar una respuesta refleja involuntaria.
3. **Condicionamiento Operante:** Aprendizaje donde la probabilidad de emisión de una respuesta voluntaria es modulada por las consecuencias reforzantes o aversivas que le siguen.
4. **Refuerzo Negativo:** Incremento de una conducta motivado por la eliminación, reducción o evitación de un estímulo aversivo desagradable.
5. **Costo de Respuesta:** Disminución de una conducta provocada por la retirada deliberada de un reforzador positivo que el sujeto ya poseía (Castigo Negativo).
6. **Aprendizaje Vicario:** Adquisición de pautas de comportamiento a través de la observación atenta de las acciones y consecuencias en un modelo externo (Bandura).
7. **Zona de Desarrollo Próximo (ZDP):** Espacio conceptual entre las capacidades que el estudiante ya domina de forma autónoma y las que puede alcanzar con mediación experta (Vygotsky).
8. **Andamiaje:** Sistema estructurado de soportes y ayudas temporales brindadas al aprendiz para acompañar su progreso en la ZDP (Bruner).
9. **Aprendizaje Significativo:** Asimilación cognitiva de nuevos conceptos anclados de forma coherente y no arbitraria en ideas previas relevantes (Ausubel).
10. **Insight:** Fenómeno de comprensión repentina y reorganización global del campo perceptual que resuelve un problema intelectual (Gestalt).

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es la diferencia medular entre refuerzo y castigo en el condicionamiento operante?**
  *R: El refuerzo siempre incrementa la probabilidad de la conducta; el castigo siempre disminuye o extingue la conducta.*
- **P: ¿Qué es el refuerzo negativo?**
  *R: Es el aumento de una conducta como resultado de la eliminación o prevención de un estímulo aversivo (no es un castigo).*
- **P: ¿Cuáles son los cuatro componentes del condicionamiento clásico de Pávlov?**
  *R: Estímulo Incondicionado (EI), Respuesta Incondicionada (RI), Estímulo Condicionado (EC) y Respuesta Condicionada (RC).*
- **P: ¿Qué se requiere indispensablemente para que ocurra un aprendizaje significativo según Ausubel?**
  *R: Que el estudiante cuente con saberes previos pertinentes (subsumidores) donde anclar el nuevo conocimiento de forma no arbitraria.*
- **P: ¿Qué programa de refuerzo de Skinner es el más resistente a la extinción?**
  *R: El programa de Razón Variable (RV).*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Diseño de Videojuegos y Gamificación:** Los sistemas de recompensas aleatorias (cofres de botín, *loot boxes*) se basan directamente en los programas de Razón Variable de Skinner para maximizar la tasa de juego constante y adictiva.
- **Pedagogía Universitaria y Currículo por Competencias:** El aprendizaje basado en problemas (ABP) y el aula invertida (*flipped classroom*) operan aplicando los principios de la ZDP de Vygotsky y el aprendizaje por descubrimiento guiado de Bruner.
- **Terapia Conductual y Modificación de Conducta:** Técnicas como la desensibilización sistemática de Joseph Wolpe (basada en el contracondicionamiento clásico) curan fobias específicas a volar o a animales asociando el estímulo temido con relajación muscular profunda.

---



### 4.1. Condicionamiento Clásico o Respondiente (Pávlov y Watson)
Se basa en la asociación por contigüidad temporal entre dos estímulos (E \to E):
1. **Fórmula del Proceso:**
   - **Antes del condicionamiento:**
     \text{Estímulo Incondicionado (EI: comida)} \longrightarrow \text{Respuesta Incondicionada (RI: salivación)}
     \text{Estímulo Neutro (EN: campana)} \longrightarrow \text{Respuesta de Orientación (No salivación)}
   - **Durante el condicionamiento:**
     \text{EN (campana)} + \text{EI (comida)} \longrightarrow \text{RI (salivación)}
   - **Después del condicionamiento:**
     \text{Estímulo Condicionado (EC: campana)} \longrightarrow \text{Respuesta Condicionada (RC: salivación)}
2. **Fenómenos del Condicionamiento Clásico:**
   - **Extinción:** Presentación reiterada del EC sin el EI; la RC se debilita gradualmente hasta desaparecer.
   - **Recuperación Espontánea:** Reaparición de la RC extinguida tras un periodo de descanso temporal.
   - **Generalización de Estímulos:** La RC se dispara ante estímulos similares al EC original (ej. campanas de distinto tono).
   - **Discriminación o Diferenciación:** El sujeto aprende a responder exclusivamente al EC específico y no a variantes.



### Problema 2: Elementos del Condicionamiento Clásico (Nivel Intermedio)
**Enunciado:** De pequeño, Raúl sufrió una dolorosa quemadura tras escuchar el silbido estridente de una tetera hirviendo. Hoy en día, a sus 18 años, cada vez que escucha el silbido agudo de una tetera o de un pito similar, su ritmo cardíaco se acelera y retira la mano de forma refleja con angustia. En este caso de condicionamiento clásico, el dolor físico de la quemadura y el silbido de la tetera actúan respectivamente como:
A) Estímulo condicionado y respuesta incondicionada.  
B) Estímulo incondicionado y estímulo condicionado.  
C) Estímulo neutro y estímulo discriminativo.  
D) Respuesta condicionada y refuerzo aversivo.  
E) Estímulo incondicionado y respuesta condicionada.  

**Solución paso a paso:**
1. El dolor físico de la quemadura es un estímulo biológico que desencadena dolor y reflejos de forma innata sin aprendizaje previo: **Estímulo Incondicionado (EI)**.
2. El silbido de la tetera originalmente era un estímulo sonoro neutro que, al asociarse por contigüidad al dolor de la quemadura, adquiere la capacidad de evocar la respuesta de miedo y sobresalto: **Estímulo Condicionado (EC)**.

**Respuesta:** B) Estímulo incondicionado y estímulo condicionado.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t09_s02_c01",
                    question = "Edward Thorndike formuló la 'Ley del Efecto' a partir de sus experimentos con gatos en 'cajas problema', principio fundacional que establece que:",
                    options = listOf(
                        "Los animales aprenden por telepatía instantánea.",
                        "El cerebro se expande cuando un gato come pescado.",
                        "Toda conducta es el producto exclusivo de la imitación social.",
                        "Las conductas seguidas de consecuencias satisfactorias o placenteras tienden a fortalecerse y repetirse, mientras que aquellas seguidas de consecuencias aversivas o displacenteras tienden a debilitarse y desaparecer.",
                    ),
                    correctIndex = 3,
                    explanation = "La Ley del Efecto demostró que las consecuencias de un acto seleccionan mecánicamente las conexiones estímulo-respuesta exitosas por ensayo y error."
                ),
                Challenge(
                    id = "psi_t09_s02_c02",
                    question = "B. F. Skinner desarrolló el 'Condicionamiento Operante o Instrumental', cuyo postulado central sostiene que la conducta voluntaria se modifica y mantiene en función de:",
                    options = listOf(
                        "Los estímulos precedentes incondicionados exclusivamente.",
                        "La interpretación consciente del inconsciente reprimido.",
                        "El peso del encéfalo en gramos.",
                        "Las consecuencias ambientales que produce en el entorno (contingencias de reforzamiento o castigo).",
                    ),
                    correctIndex = 3,
                    explanation = "En el condicionamiento operante, el sujeto 'opera' sobre el medio ambiente; la conducta es modelada por los reforzadores o castigos que siguen a su emisión."
                ),
                Challenge(
                    id = "psi_t09_s02_c03",
                    question = "En el condicionamiento operante, el 'Reforzamiento Positivo' se define rigurosamente como aquel procedimiento que:",
                    options = listOf(
                        "Ignora la conducta del alumno hasta que se canse.",
                        "Retira el teléfono celular por una semana al adolescente rebelde.",
                        "Aplica una descarga eléctrica para suprimir un comportamiento inadecuado.",
                        "Aumenta la probabilidad de emisión de una conducta mediante la entrega o adición de un estímulo placentero o deseado tras la ejecución de la conducta.",
                    ),
                    correctIndex = 3,
                    explanation = "Refuerzo positivo = dar algo agradable (felicitación, dinero, comida, elogio) inmediatamente después de la conducta para que esta se incremente en el futuro."
                ),
                Challenge(
                    id = "psi_t09_s02_c04",
                    question = "El 'Reforzamiento Negativo' se distingue conceptualmente del castigo porque el reforzamiento negativo:",
                    options = listOf(
                        "Aumenta y fortalece la conducta futura al eliminar, retirar o evitar un estímulo aversivo o desagradable cuando el sujeto emite la conducta (conductas de escape y evitación).",
                        "Presenta un estímulo reforzador apetitivo inmediatamente después de la respuesta.",
                        "Disminuye y extingue una conducta indeseable mediante un insulto verbal.",
                        "Es un procedimiento pedagógico prohibido por la ley.",
                    ),
                    correctIndex = 0,
                    explanation = "Reforzar SIEMPRE significa aumentar la conducta. Es 'negativo' porque la conducta elimina algo molesto (tomar aspirina elimina el dolor de cabeza, por eso volveremos a tomarla)."
                ),
                Challenge(
                    id = "psi_t09_s02_c05",
                    question = "El 'Castigo Positivo' (por aplicación) tiene como finalidad pedagógica y conductual:",
                    options = listOf(
                        "Incrementar las notas escolares premiando con dinero en efectivo.",
                        "Retirar los privilegios de juego al niño.",
                        "Disminuir o extinguir la frecuencia de una conducta indeseada mediante la presentación o aplicación de un estímulo aversivo y desagradable (ej. una reprimenda, llamada de atención o multa de tránsito).",
                        "Aprender a tocar violín escuchando música clásica.",
                    ),
                    correctIndex = 2,
                    explanation = "Castigo SIEMPRE busca disminuir o extinguir una conducta. Es positivo porque se añade o aplica un estímulo aversivo tras la conducta infractora."
                ),
                Challenge(
                    id = "psi_t09_s02_c06",
                    question = "El 'Castigo Negativo' (costo de respuesta o tiempo fuera) consiste en la disminución de una conducta mediante:",
                    options = listOf(
                        "La administración de choques eléctricos dolorosos.",
                        "El aplauso efusivo de los compañeros de clase.",
                        "La asignación de una beca de honor.",
                        "La retirada, pérdida o privación de un estímulo apetitivo o privilegio que la persona ya poseía (ej. quitarle el automóvil por llegar tarde, suspender el recreo).",
                    ),
                    correctIndex = 3,
                    explanation = "Castigo negativo = quitar algo agradable como consecuencia de una mala conducta para suprimir su recurrencia futura."
                ),
                Challenge(
                    id = "psi_t09_s02_c07",
                    question = "La Teoría del Aprendizaje Social o Vicario (Observacional), formulada por Albert Bandura con el famoso experimento del 'Muñeco Bobo', demostró que los seres humanos pueden aprender:",
                    options = listOf(
                        "Únicamente si son sometidos a condicionamiento fisiológico directo con electrochoques.",
                        "Por observación e imitación de la conducta de modelos significativos y de las consecuencias (premios o castigos vicarios) que estos reciben, sin necesidad de práctica directa inmediata.",
                        "Solo durante los primeros seis meses de vida biológica.",
                        "Por transmisión genética directa de los padres.",
                    ),
                    correctIndex = 1,
                    explanation = "Bandura demostró que los niños expuestos a modelos adultos que golpeaban al muñeco Bobo imitaron con agresividad idénticas pautas motoras, formulando las fases de atención, retención, reproducción y motivación."
                ),
                Challenge(
                    id = "psi_t09_s02_c08",
                    question = "En la psicología cognitiva, David Ausubel postuló la teoría del 'Aprendizaje Significativo', la cual sostiene que el verdadero aprendizaje ocurre cuando:",
                    options = listOf(
                        "Se memoriza mecánicamente un conjunto de datos aislados por simple repetición asociativa sin conexión conceptual.",
                        "La nueva información se relaciona y conecta de manera sustantiva y no arbitraria con los conocimientos y esquemas previos que ya posee el estudiante en su estructura cognitiva.",
                        "Se aplican programas de reforzamiento continuo mediante fichas canjeables de conducta.",
                        "El estudiante reproduce miméticamente las pautas conductuales observadas en un modelo vicario."
                    ),
                    correctIndex = 1,
                    explanation = "Ausubel contrastó el aprendizaje memorístico mecánico con el significativo: los saberes previos anclan y dotan de sentido a los nuevos conceptos (inclusión cognitiva)."
                ),
                Challenge(
                    id = "psi_t09_s02_c09",
                    question = "Jerome Bruner propuso la teoría del 'Aprendizaje por Descubrimiento', en la cual el rol central del docente consiste en:",
                    options = listOf(
                        "Resolver todos los ejercicios en la pizarra sin permitir preguntas.",
                        "Dictar clases magistrales pasivas de cinco horas continuas.",
                        "Actuar como facilitador y guía que proporciona retos y andamiajes para que sea el propio estudiante quien indague, descubra y construya inductivamente los principios y conceptos fundamentales.",
                        "Castigar severamente cualquier equivocación cometida en clase.",
                    ),
                    correctIndex = 2,
                    explanation = "Bruner defendió que el descubrimiento guiado despierta la curiosidad intrínseca y la metacognición, transformando al alumno en un investigador activo."
                ),
                Challenge(
                    id = "psi_t09_s02_c10",
                    question = "Wolfgang Köhler estudió el aprendizaje en chimpancés (el célebre mono Sultán) y descubrió el fenómeno cognitivo de 'Insight' (comprensión súbita o 'discernimiento'), el cual ocurre cuando el animal:",
                    options = listOf(
                        "Reorganiza súbitamente los elementos del campo perceptual y mental, comprendiendo de golpe la solución a un problema (experiencia '¡Ajá!').",
                        "Aprende tras dos mil ensayos ciegos por condicionamiento operante estricto.",
                        "Se rinde y abandona toda actividad motora.",
                        "Aprende mediante ensayo y error ciego por reforzamiento gradual.",
                    ),
                    correctIndex = 0,
                    explanation = "Köhler probó que el aprendizaje no es solo ensayo-error ciego, sino reorganización perceptual inteligente de la situación para alcanzar una banana uniendo palos o apilando cajas."
                ),
            )
        )
    )
}
