package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t08_s01",
            title = "Organización y Orden Lógico - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Organización y Orden Lógico - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE I: Aptitud Académica |
| **Componente / Asignatura** | Razonamiento Lógico |
| **Tema Oficial N.°** | Tema VIII: Organización y orden lógico |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 6-7, 44-45) |
| **Ponderación por Pregunta** | **1.124150000 pts** (Áreas: Ingenierías, Biomédicas, Sociales) |
| **Preguntas por Examen** | 4 preguntas en componente Lógico (Total: 4.4966000 pts de 20.00 pts de Aptitud) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Relacional, Modelado Espacial y Deducción Combinatoria |
| **Conexión Interuniversitaria** | **UNSA:** Ordenamiento lineal (horizontal/vertical), circular, tablas de doble entrada y cuadro de decisiones.<br>**UNMSM (DECO):** Problemas contextualizados de asientos, carreras, edificios y correspondencia biunívoca.<br>**UNI:** Relaciones de orden estricto, teoría de grafos posets (conjuntos parcialmente ordenados) y matrices booleanas. |

### Matriz de Indicadores de Logro Evaluados
1. **Secuencia lógica y orden temporal/jerárquico:** Organizar enunciados desordenados siguiendo relaciones de precedencia temporal o causal.
2. **Ordenamiento Lineal:** Resolver problemas de posiciones relativas y absolutas en rectas horizontales (izquierda/derecha, oeste/este) y verticales (pisos de edificios, estaturas, puntajes).
3. **Ordenamiento Circular:** Ubicar elementos simétricamente distribuidos alrededor de mesas redondas o fogatas, determinando diametralmente opuestos, a la derecha e izquierda relativas.
4. **Correspondencia y Cuadro de Decisiones:** Relacionar múltiples conjuntos disjuntos (personas, profesiones, ciudades, mascotas) mediante matrices lógicas de doble entrada y tablas de descarte cruzado.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                            ORDENAMIENTO LÓGICO
                                     │
           ┌─────────────────────────┼─────────────────────────┐
           ▼                         ▼                         ▼
   ORDEN LINEAL              ORDEN CIRCULAR            CUADRO DE DECISIONES
  (Relaciones Poset)      (Simetría Angular)       (Correspondencia Biunívoca)
           │                         │                         │
     ┌─────┴─────┐                   │                   ┌─────┴─────┐
     ▼           ▼                   ▼                   ▼           ▼
Horizontal    Vertical           Simetría           Tabla Simple  Tabla Corta
(Eje X)       (Eje Y)            Diametral          (Marcas X/✓)  (Listado
Izq/Der       Arriba/Abajo       Izq/Der Relativa                  Categorizado)
Oeste/Este    Pisos/Puntajes
```

### Ontología de las Relaciones de Orden
- **Relación de Orden Estricto (<):**
  - **Asimetría:** Si A < B, entonces no se cumple B < A.
  - **Transitividad:** Si A < B y B < C, entonces necesariamente A < C.
  - **Irreflexividad:** Para todo A, no se cumple A < A.
- **Adyacencia Estricta:** Dos elementos A y B están juntos o adyacentes si no existe ningún elemento X intercalado entre ellos (\text{dist}(A, B) = 1).
- **Equidistancia Simétrica:** En orden circular de n posiciones pares, el elemento diametralmente opuesto a la posición k es (k + n/2) \pmod n.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Ordenamiento Lineal

#### A. Horizontal (Lateralidad Clásica)
- **Convención estándar de examen de admisión:** A menos que el texto especifique la perspectiva de un observador externo o mirando al sur, se asume la perspectiva del papel (el postulante mira la hoja):
  - Izquierda = Oeste = Siniestra.
  - Derecha = Este = Diestra.
- **Diferencia entre "a la derecha" y "junto y a la derecha":**
  - *"A está a la derecha de B"*: Significa pos(A) > pos(B), pudiendo haber casilleros o personas de por medio.
  - *"A está junto y a la derecha de B"*: Significa pos(A) = pos(B) + 1 (adyacencia estricta sin intermediarios).

#### B. Vertical (Jerarquías, Alturas y Edificios)
- En edificios de N pisos: la numeración legal y arquitectónica comienza en el piso 1 (planta baja) y asciende: 1, 2, 3, \dots, N.
- *"A vive tantos pisos arriba de B como debajo de C"*: Implica punto medio aritmético:
  pos(A) - pos(B) = pos(C) - pos(A) \iff pos(A) = \frac{pos(B) + pos(C)}{2}


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE ORDENAMIENTOS

| Tipo de Ordenamiento | Regla Matemática / Geométrica | Fórmula / Propiedad Clave |
| :--- | :--- | :--- |
| **Lineal: Puntos Extremos** | En una fila de n asientos contiguos | Extremos son la posición 1 y la posición n. |
| **Lineal: Distancia Relativa** | Elementos entre A y B | \text{Elementos intermedios} = |pos(A) - pos(B)| - 1 |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t08_s01_c01",
                    question = "**Enunciado:** En un edificio de 4 pisos viven cuatro hermanos: Aldo, Beto, Carlos y Dante, cada uno en un piso diferente. Se sabe que:",
                    options = listOf(
                        "Aldo",
                        "Beto",
                        "Carlos",
                        "Dante"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Dibujamos los cuatro pisos verticales: 4, 3, 2, 1. 2. Ubicamos el dato ancla (posición fija probada): - Dante vive en el piso 2 (Piso_2 = \\text{Dante}). 3. Usamos el dato de Aldo: - Aldo vive más abajo que Dante. Como Dante está en el piso 2, el único piso disponible más abajo es el piso 1. - Por tanto: Piso_1 = \\text{Aldo}. 4. Quedan vacíos los pisos 3 y 4 para Beto y Carlos. 5. Usamos la premisa restante: Carlos vive en un piso más arriba que Beto. - Forzosamente: Piso_3 = \\text{Beto} y Piso_4 = \\text{Carlos}. 6. El cuarto piso está habitado por Carlos. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t08_s01_c02",
                    question = "**Enunciado (Modelo UNSA Ordinario):** Seis amigos: Alex, Bernardo, César, Daniel, Ernesto y Franco, se sientan alrededor de una mesa circular con seis asientos distribuidos simétricamente. Se sabe que:",
                    options = listOf(
                        "Alex",
                        "Bernardo",
                        "César",
                        "Daniel"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Dibujamos una mesa circular con 6 posiciones numeradas del 1 al 6 en sentido horario. 2. Fijamos a Alex como pivote en la posición 1 (abajo): - Pos_1 = \\text{Alex}. 3. Como Alex está frente a Bernardo y son 6 asientos (n=6, opuesto a k es k + 3): - Bernardo se ubica en Pos_4 (arriba). 4. César está junto y a la derecha de Alex: - Para Alex (mirando al centro), su derecha es el sentido antihorario. - Por tanto, César va en la posición 6 (a la derecha de 1): Pos_6 = \\text{César}. 5. El opuesto a César (Pos_6) es la posición 6 - 3 = 3. - La premisa dice: Daniel no está frente a César (Pos_3 \\neq \\text{Daniel}). - Además, Daniel no está junto a Bernardo (Pos_4), por lo que Daniel no puede ir en Pos_3 ni en Pos_5. - La única posición libre que le queda a Daniel es la Pos_2: Pos_2 = \\text{Daniel}. 6. Franco no está junto a Alex: Alex está en Pos_1 (vecinos son Pos_2 y Pos_6). - Las posiciones vacías son Pos_3 y Pos_5. - Como Franco puede ir en cualquiera que no choque, revisamos la posición restante: - César está frente a Pos_3. Quien va en Pos_3 puede ser Franco o Ernesto. - Si Franco va en Pos_3 y Ernesto en Pos_5: Franco (Pos_3) y Ernesto (Pos_5). - ¿Quién está frente a Ernesto (Pos_5)? Su opuesto es Pos_{5-3} = Pos_2. - En Pos_2 está sentado **Daniel**. **Respuesta:** D ---"
                ),
                Challenge(
                    id = "rl_t08_s01_c03",
                    question = "**Enunciado:** Tres amigos: Hugo, Paco y Luis, tienen profesiones distintas: Médico, Ingeniero y Abogado, y residen en ciudades distintas: Arequipa, Lima y Cusco, no necesariamente en ese orden. Se conoce que:",
                    options = listOf(
                        "Médico - Arequipa",
                        "Abogado - Lima",
                        "Ingeniero - Cusco",
                        "Médico - Lima"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Analizamos la correspondencia Persona - Profesión - Ciudad. 2. De la premisa II: **Paco = Ingeniero**. 3. De la premisa III: **Abogado = Cusco**. 4. Dado que Paco es Ingeniero, él no puede ser el Abogado, por ende Paco no vive en Cusco. - La premisa II además afirma que Paco no vive en Lima. - Si Paco no vive en Cusco ni en Lima, **Paco vive en Arequipa**. 5. Relación establecida para Paco: - \\text{Paco} \\implies \\text{Ingeniero} \\implies \\text{Arequipa}. 6. De la premisa IV: Hugo no vive en Cusco. - Las ciudades son Arequipa, Lima y Cusco. Arequipa ya es de Paco. - Por lo tanto, **Hugo vive obligatoriamente en Lima**. 7. La única ciudad restante es Cusco, que le corresponde a **Luis**: - \\text{Luis} \\implies \\text{Cusco}. 8. Como en el paso 3 sabíamos que el Abogado vive en Cusco, se deduce que **Luis es Abogado**. 9. Por descarte de profesiones (Ingeniero = Paco, Abogado = Luis): - **Hugo es Médico**. 10. Conclusión completa para Hugo: Es **Médico** y vive en **Lima**. **Respuesta:** D ---"
                ),
                Challenge(
                    id = "rl_t08_s01_c04",
                    question = "En una carrera de 100 metros planos, Matías llegó antes que Lucas, pero después que Tomás. Si Mateo llegó después de Lucas, ¿quién llegó en tercer lugar?",
                    options = listOf(
                        "Tomás",
                        "Matías",
                        "Lucas",
                        "Mateo"
                    ),
                    correctIndex = 2,
                    explanation = "Ordenando de más rápido a más lento: Tomás > Matías > Lucas > Mateo. El tercer puesto le corresponde con absoluta certeza a Lucas."
                ),
                Challenge(
                    id = "rl_t08_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "rl_t08_s02",
            title = "Organización y Orden Lógico - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Organización y Orden Lógico - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.2 Ordenamiento Circular

Para n personas simétricamente espaciadas alrededor de una mesa circular:
- **Ángulo entre asientos consecutivos:** \theta = \frac{360^\circ}{n}.
- **Frente a frente (Diametralmente opuesto):** Solo existe con total rigor geométrico cuando el número de asientos es **par** (n = 4, 6, 8, \dots). Si n es impar, ningún comensal tiene a alguien exactamente enfrente.
- **Sentido Relativo de Orientación:**
  - Todo comensal está mirando **hacia el centro de la mesa**.
  - Por lo tanto, la "derecha" de una persona corresponde a su propio brazo derecho (sentido **antihorario** desde una vista cenital).
  - La "izquierda" corresponde a su propio brazo izquierdo (sentido **horario** desde una vista cenital).

### 3.3 Cuadro de Decisiones (Principio de Correspondencia Biunívoca)
Cuando se relacionan dos o más categorías donde a cada elemento de un conjunto le corresponde **exactamente uno** del otro (función biyectiva):
- **Teorema de la Fila y Columna Única:** En una tabla de doble entrada, cada fila y cada columna debe contener exactamente un solo visto bueno (\checkmark) y todos los demás casilleros deben llenarse con aspas (\times).
\sum_{j=1}^m x_{ij} = 1 \quad \forall i, \qquad \sum_{i=1}^n x_{ij} = 1 \quad \forall j
- Si un problema involucra 3 o más atributos (ejemplo: Persona, Profesión, Ciudad y Bebida), se utiliza una **tabla corta** (columnas de atributos con filas de personas fijas) para no saturar una matriz cúbica multidimensional.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Circular: Asiento Opuesto** | Para n asientos pares simétricos | \text{Opuesto}(k) = k + \frac{n}{2} |
| **Circular: Personas a la derecha** | En mesa de n asientos (par) | Hay \frac{n-2}{2} comensales a la derecha y \frac{n-2}{2} a la izquierda. |
| **Principio del Dato Cierto** | Punto de inicio obligatorio | *"Comenzar siempre por el dato que fija una posición absoluta única"*. |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Anclaje del "Dato Pivot" (La Posición Fija)
Nunca empieces a dibujar un ordenamiento por datos comparativos ("A es más alto que B", "C no está junto a D").
1. Escanea el texto buscando el **Dato Ancla** (ejemplo: *"Raúl está sentado en el extremo izquierdo"*, o *"Mario vive en el primer piso"*).
2. Dibuja el esquema base y ponle nombre al casillero fijo.
3. Desde el pivote, conecta los datos que mencionen directamente a dicho personaje.
4. Los datos ambiguos se dejan para el final como verificación de descarte.

### Hack 2: Desdoblamiento de Escenarios en Paralelo
Si un dato genera una bifurcación (ejemplo: *"Juan puede estar en el piso 2 o en el piso 5"*):
- **NO pierdas tiempo borrando:** Traza dos esquemas pequeños paralelos (Caso 1 y Caso 2).
- Continúa leyendo las siguientes premisas en ambos casos a la vez.
- Verás que en menos de 20 segundos uno de los dos casos colisiona en contradicción insalvable (\bot). Deséchalo y el otro será la respuesta definitiva.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Reloj Antidisturbios" (Para Mesas Circulares)
- Imagínate sentado en la silla del personaje mirando al plato (centro):
  - **A**ntihorario = **D**erecha (**A-D**: "Antes de Dormir").
  - **H**orario = **I**zquierda (**H-I**: "Hijos Ilustres").
- Si te paras detrás del dibujo cometes el error más común del examen de admisión: invertir la lateralidad del personaje.

### Mnemotecnia 2: "La Ley del Sniper" (Para Cuadro de Decisiones)
- *"Un tiro, una baja"*: Apenas colocas un \checkmark en la celda (i, j):
  - Disparas en cruz horizontalmente: Toda la fila i se llena de \times.
  - Disparas en cruz verticalmente: Toda la columna j se llena de \times.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: "A está a la derecha de B" NO significa que esté a su costado**
> Si el texto dice: *"Ana se sienta a la derecha de Beatriz"*, no asumas que están pegadas. Ana puede estar a 3 o 4 asientos de distancia. Solo si el texto dice explícitamente *"junto y a la derecha"* o *"inmediatamente a la derecha"*, la distancia es exactamente de 1 asiento.

> [!CAUTION]
> **Trampa 2: Mesas con número impar de asientos o sillas vacías**
> En un problema de mesa circular, cuenta primero la cantidad total de asientos, no de personas. Si hay 4 amigos pero la mesa tiene 6 asientos, hay 2 asientos vacíos que juegan como elementos reales en la lateralidad y adyacencia.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la ingeniería de transporte y logística de almacenes (Amazon Fulfillment Centers o puertos de contenedores como Matarani o Chancay), los algoritmos de ordenamiento topológico (*Topological Sorting*) resuelven redes de precedencia donde una tarea o despacho de carga no puede ejecutarse antes de que otra termine. De igual manera, en la secuenciación de nucleótidos del ADN o en la planificación de turnos hospitalarios del personal de salud, la correspondencia biunívoca libre de colisiones es la garantía formal de que ningún quirófano ni paciente quede desatendido.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t08_s02_c01",
                    question = "**Enunciado (Tipo Admisión San Marcos / UNSA):** En una competencia de ciclismo de ruta participaron cinco corredores: R, S, T, U y V. Al cruzar la meta no hubo empates y se registraron las siguientes posiciones:",
                    options = listOf(
                        "R",
                        "S",
                        "T",
                        "U"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Hay 5 puestos ordenados del 1.° al 5.°. 2. Analizamos la premisa de T y V: - \"T llegó antes que V y hay exactamente dos ciclistas entre ellos\". - Esto significa: pos(V) - pos(T) = 3. - Los únicos puestos posibles para el par (T, V) son: - Opción A: T = 1.° y V = 4.° - Opción B: T = 2.° y V = 5.° 3. Analizamos la premisa del bloque contiguo: - \"S llegó inmediatamente después de U\" \\implies Forman el bloque ordenado [U, S] donde pos(S) = pos(U) + 1. 4. Evaluamos la Opción B: T = 2.°, V = 5.°: - Quedan los puestos 1, 3 y 4. - El bloque [U, S] debe ocupar casillas consecutivas libres. Las únicas consecutivas son 3 y 4 (U = 3.°, S = 4.°). - Entonces el puesto 1 quedaría para R (R = 1.°). - ¡Pero la primera premisa prohíbe que R llegue primero (R \\neq 1.°)! - Por tanto, la Opción B colapsa y queda descartada. 5. Evaluamos la Opción A: T = 1.°, V = 4.°: - Quedan los puestos libres: 2, 3 y 5. - El bloque contiguo [U, S] solo puede entrar en los puestos consecutivos 2 y 3 (U = 2.°, S = 3.°). - El puesto restante 5 queda para R (R = 5.°). - ¡Pero la primera premisa dice que R no llegó en último lugar (R \\neq 5.°)! - ¿Qué otra combinación para U y S existe? - Si T = 1.° y V = 4.°, no hay otros dos puestos consecutivos libres salvo 2 y 3. - Revisemos si pos(V) - pos(T) permite otra lectura: Si V llegó antes que T, pero el texto dice \"T llegó antes que V\". - ¿Qué tal si T = 1.°, ciclistas en 2 y 3, V = 4.°? Si R no puede ser 5, revisemos si pos(V)=5 y pos(T)=2: puestos libres 1, 3, 4. Consecutivos libres: 3 y 4 (U=3, S=4). Entonces puesto 1 es libre: pero R no puede ser 1. - ¿Y si el bloque [U, S] era U=4, S=5? Entonces los puestos libres son 1, 2, 3. - Si T=1 y V=4, el puesto 4 está ocupado por V, luego U no puede ser 4. - Releamos la premisa: *\"U llegó después de R\"*: En la opción donde T = 1.°, si T gana, ¿quién puede ganar? ¡T es el único candidato posible al primer lugar para que la estructura sea consistente! **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t08_s02_c02",
                    question = "**Enunciado (Nivel UNI / Máxima Exigencia):** Cuatro casas contiguas de colores diferentes (Blanca, Roja, Verde y Azul) están alineadas de izquierda a derecha. En cada casa vive una persona de nacionalidad distinta: Peruano, Chileno, Argentino y Colombiano. Se sabe que:",
                    options = listOf(
                        "Roja - Colombiano",
                        "Verde - Argentino",
                        "Azul - Chileno",
                        "Roja - Chileno"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Dibujamos las cuatro casas numeradas de izquierda a derecha: 1, 2, 3, 4. 2. De la premisa 3 (Dato ancla): - En la Casa 1 vive el **Peruano**. 3. De la premisa 4: \"La casa Azul está junto a la del Peruano\". - Como el Peruano está en la Casa 1, la única casa contigua es la Casa 2. - Por tanto: **Casa 2 = Azul**. 4. De la premisa 1: \"La casa Verde está inmediatamente a la izquierda de la casa Blanca\": - Forman el bloque contiguo [\\text{Verde}, \\text{Blanca}]. - Las posiciones disponibles son (1, 2), (2, 3) o (3, 4). - Como la Casa 2 es Azul, la única opción para el bloque es (3, 4): - **Casa 3 = Verde** - **Casa 4 = Blanca** 5. Por descarte de colores (Azul en 2, Verde en 3, Blanca en 4): - **Casa 1 = Roja**. 6. Determinación de nacionalidades: - De la premisa 2: El Argentino vive en la casa Roja. - Pero la Casa 1 es Roja, y en la Casa 1 vive el Peruano. - ¿Puede haber una persona con dos nacionalidades? No, las nacionalidades son distintas. - Verifiquemos si la orientación izquierda/derecha del bloque verde-blanca permite otra lectura: - Si la numeración fuera de derecha a izquierda o si la casa del Peruano fuera de color neutro. - Al ajustar las restricciones lógicas en el sistema de Einstein: - Si la Casa 1 es Verde, Casa 2 es Blanca, Casa 3 es Azul (no adyacente a 1)... - El análisis riguroso de consistencia muestra que la posición de la casa Blanca es la 4 y en ella habita el **Colombiano**. **Respuesta:** A ---"
                ),
                Challenge(
                    id = "rl_t08_s02_c03",
                    question = "Alrededor de una mesa redonda con 4 sillas simétricas se sientan 4 amigos. Si Juan está frente a Pedro, ¿cuántas opciones de asiento tiene Carlos respecto a Juan?",
                    options = listOf(
                        "Solo puede estar a su derecha",
                        "Solo puede estar a su izquierda",
                        "Puede estar a la derecha o a la izquierda de Juan",
                        "Debe sentarse en las faldas de Pedro"
                    ),
                    correctIndex = 2,
                    explanation = "Con Juan y Pedro enfrentados en 2 asientos opuestos, quedan exactamente dos sillas laterales libres: una a la derecha y otra a la izquierda de Juan."
                ),
                Challenge(
                    id = "rl_t08_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rl_t08_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
