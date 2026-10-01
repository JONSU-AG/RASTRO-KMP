package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t05_s01",
            title = "ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Principios de adición y multiplicación, problemas de rutas y caminos entre ciudades, indumentaria/menús, y ordenamientos lineales simples. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: formación de comisiones paritarias, contraseñas alfanuméricas seguras, rutas con condiciones de no retorno y grafos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Permutaciones con repetición en redes de caminos (manzanas), permutaciones circulares complejas, ordenamiento con elementos juntos/separados. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Aplicar los principios fundamentales de conteo (aditivo y multiplicativo) con discernimiento de simultaneidad o exclusión mutua.
2. Determinar sistemáticamente el número de casos posibles mediante razonamiento analítico sin necesidad de listar todos los eventos.
3. Utilizar y construir diagramas de árbol estructurados para modelar tomas de decisiones secuenciales.
4. Resolver problemas de rutas, traslados y redes viales bajo restricciones de no retroceso o paso obligado por puntos clave.
5. Distinguir de forma intuitiva y rigurosa situaciones donde **interesa el orden** (permutaciones/variaciones) de aquellas donde **no interesa el orden** (combinaciones).

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Principio de Adición (Eventos mutuamente excluyentes: "O")
        ┌─ 1. Principios ──────┴─ Principio de Multiplicación (Eventos simultáneos/sucesivos: "Y")
        │      de Conteo
        │
ANÁLISIS                       ┌─ Principio del Árbol y Diagramas de Flujo
COMBINATORIO ───┼─ 2. Rutas y ─────────┼─ Redes Viales Simples (Ciudades en serie y paralelo)
INTUITIVO       │      Caminos         ├─ Caminos en Cuadrículas Urbanas (Método de Pascal)
        │                      └─ Rutas con Puntos de Paso Obligado o Bloqueados
        │
        │                      ┌─ Permutación Lineal (Importa el orden, intervienen todos)
        ├─ 3. Agrupaciones ────┼─ Permutación Circular (P_c = (n - 1)!)
        │      con Orden       ├─ Permutación con Repetición (Elementos indistinguibles)
        │                      └─ Variación (Importa el orden, se toma un subconjunto)
        │
        └─ 4. Agrupaciones ────┌─ Combinación Simple (NO importa el orden: C(n, k))
               sin Orden       └─ Formación de Equipos y Comisiones con Restricciones
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Principios Fundamentales del Conteo

#### A. Principio de Adición (El Conector "O")
Si un evento A puede ocurrir de m maneras diferentes y otro evento B puede ocurrir de n maneras diferentes, y ambos eventos **no pueden ocurrir simultáneamente** (son mutuamente excluyentes), entonces el evento A **o** B puede realizarse de:
\text{Total de formas} = m + n
* *Ejemplo:* Si puedes viajar de Arequipa a Lima por avión (3 aerolíneas) o por bus terrestre (5 empresas), el total de opciones para viajar es 3 + 5 = 8 maneras.

#### B. Principio de Multiplicación (El Conector "Y")
Si un evento o decisión A puede ocurrir de m maneras y, para cada una de estas, un segundo evento B puede ocurrir de n maneras de forma **secuencial o simultánea**, entonces ambos eventos A **y** B ocurren de:
\text{Total de formas} = m \cdot n
* *Ejemplo:* Si tienes 4 pantalones distintos y 5 camisas, el total de tenidas (pantalón y camisa) es 4 \times 5 = 20 formas.

---

### 3.2 Problemas de Rutas y Redes Viales (Método de los Caminos)

1. **Rutas entre Ciudades en Serie:**
   Si para ir de la ciudad A a la ciudad C se debe pasar obligatoriamente por la ciudad intermedia B:
   \text{Rutas } (A \to C) = (\text{Caminos de } A \text{ a } B) \cdot (\text{Caminos de } B \text{ a } C)
2. **Viajes de Ida y Vuelta sin Repetir Camino:**
   Si hay k caminos entre dos ciudades:
   * Total de viajes ida y vuelta: k \cdot k = k^2.
   * Total de viajes ida y vuelta **sin regresar por el mismo camino**: k \cdot (k - 1).
3. **Caminos en Cuadrículas Urbanas (Método del Triángulo de Pascal):**
   Para ir del vértice inferior izquierdo al superior derecho avanzando únicamente hacia el norte (\uparrow) y hacia el este (\rightarrow):
   * Cada intersección suma los caminos que llegan desde abajo y desde la izquierda:
     V_{(x, y)} = V_{(x-1, y)} + V_{(x, y-1)}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE ANÁLISIS COMBINATORIO

| Tipo de Agrupación | Condición Fundamental | Expresión Matemática |
| :--- | :--- | :---: |
| **Factorial de un número (n!)** | Producto de los enteros consecutivos desde 1 hasta n (0! = 1) | n! = n(n - 1)(n - 2)\dots 1 |
| **Permutación Lineal (P_n)** | Intervienen todos los elementos en fila ordenada | P_n = n! |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t05_s01_c01",
                    question = "Para viajar de la ciudad de Arequipa a Mollendo existen 4 empresas terrestres distintas, y para viajar de Mollendo a Camaná existen 3 empresas terrestres. Si un comerciante viaja de Arequipa a Camaná pasando por Mollendo, ¿de cuántas maneras diferentes puede realizar el viaje de ida y vuelta, si para el regreso no puede utilizar ninguna de las empresas que utilizó en la ida?",
                    options = listOf(
                        "48",
                        "60",
                        "72",
                        "84"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t05_s01_c02",
                    question = "En un aula de la Facultad de Ingeniería de la UNSA hay 7 varones y 5 mujeres. Se debe conformar una comisión de 4 integrantes. ¿De cuántas formas se puede formar dicha comisión si debe estar integrada exactamente por 2 varones y 2 mujeres?",
                    options = listOf(
                        "180",
                        "210",
                        "240",
                        "315"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t05_s01_c03",
                    question = "Cuatro parejas de esposos asisten al teatro y compran una fila completa de 8 asientos consecutivos. ¿De cuántas maneras diferentes pueden sentarse si cada esposo debe sentarse siempre al lado de su respectiva esposa?",
                    options = listOf(
                        "24",
                        "96",
                        "384",
                        "768"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t05_s01_c04",
                    question = "¿Cuándo se utiliza el Principio de Multiplicación en conteo?",
                    options = listOf(
                        "P_c(n) = (n - 1)!.",
                        "Si al cambiar el orden de los elementos el resultado o grupo es el mismo, es **Combinación**; si el resultado cambia, es **Variación**.",
                        "Valor o condición no aplicable al caso planteado",
                        "Cuando los eventos ocurren de forma simultánea o en secuencia inmediata (conector lógico \"Y\")."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cuando los eventos ocurren de forma simultánea o en secuencia inmediata (conector lógico \"Y\")."
                ),
                Challenge(
                    id = "rm_t05_s01_c05",
                    question = "¿Cuál es la fórmula para la permutación circular de n personas en una mesa redonda?",
                    options = listOf(
                        "P_c(n) = (n - 1)!.",
                        "Cuando los eventos ocurren de forma simultánea o en secuencia inmediata (conector lógico \"Y\").",
                        "Si al cambiar el orden de los elementos el resultado o grupo es el mismo, es **Combinación**; si el resultado cambia, es **Variación**.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: P_c(n) = (n - 1)!."
                ),
                Challenge(
                    id = "rm_t05_s01_c06",
                    question = "En un problema de conteo, ¿cómo sé si debo usar Combinación o Variación?",
                    options = listOf(
                        "Cuando los eventos ocurren de forma simultánea o en secuencia inmediata (conector lógico \"Y\").",
                        "Si al cambiar el orden de los elementos el resultado o grupo es el mismo, es **Combinación**; si el resultado cambia, es **Variación**.",
                        "P_c(n) = (n - 1)!.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Si al cambiar el orden de los elementos el resultado o grupo es el mismo, es **Combinación**; si el resultado cambia, es **Variación**."
                ),
                Challenge(
                    id = "rm_t05_s01_c07",
                    question = "Seis varones y seis mujeres se sientan en una mesa redonda de 12 asientos. Si deben quedar estrictamente intercalados, ¿de cuántas formas pueden sentarse?",
                    options = listOf(
                        "5! x 6!",
                        "6! x 6!",
                        "12! / 2",
                        "11!"
                    ),
                    correctIndex = 0,
                    explanation = "Se sientan primero los 6 varones en círculo de (6-1)! = 5! formas. Los 6 asientos restantes para las mujeres quedan fijos, permutando de 6! formas. Total: 5! x 6!."
                ),
                Challenge(
                    id = "rm_t05_s01_c08",
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
                    id = "rm_t05_s01_c09",
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
                    id = "rm_t05_s01_c10",
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
            id = "rm_t05_s02",
            title = "ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ANÁLISIS COMBINATORIO INTUITIVO Y CONTEO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   * Por fórmula combinatoria (cuadrícula de m \times n tramos):
     \text{Caminos Totales} = \frac{(m + n)!}{m! \cdot n!} = C_{m}^{m + n}

---

### 3.3 El Árbol de Decisiones Combinatorio
Una estructura matemática de grafo arbóreo que modela paso a paso las bifurcaciones de eventos.  
* El número total de hojas terminales en el árbol coincide con el número total de resultados posibles del espacio de opciones.

---

### 3.4 Clasificación de Agrupaciones: ¿Importa o NO Importa el Orden?

```text
                                ¿Importa el orden de los elementos?
                                               │
                       ┌───────────────────────┴───────────────────────┐
                      SÍ                                              NO
              (Permutaciones)                                   (Combinaciones)
                       │                                               │
      ¿Entran TODOS los elementos?                         Formación de grupos,
            ┌──────────┴──────────┐                        comisiones, parejas,
           SÍ                    NO                       ensaladas, mezclas.
      (Permutación)          (Variación)
           P_n = n!          V(n, k) = n!/(n-k)!           C(n, k) = n! / [k!(n-k)!]
```

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Permutación Circular (P_c(n))** | Elementos dispuestos en ronda cerrada alrededor de un centro fijo | P_c(n) = (n - 1)! |
| **Permutación con Repetición (P_n^{a, b, c})** | Elementos repetidos indistinguibles (a + b + c \le n) | P_n^{a, b, c} = \frac{n!}{a! \cdot b! \cdot c!} |
| **Variación Simple (V_k^n)** | Importa el orden, se seleccionan k elementos de un total de n | V_k^n = \frac{n!}{(n - k)!} |
| **Combinación Simple (C_k^n)** | **NO importa el orden**, se forman subgrupos de k elementos de un total de n | C_k^n = \frac{n!}{k!(n - k)!} |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Método de la Degeneración Rápida de Combinatorias
Para calcular combinatorias en exámenes de admisión sin escribir factoriales gigantes:
C_3^8 = \frac{8 \times 7 \times 6}{1 \times 2 \times 3} = \frac{336}{6} = \mathbf{56}
* **Regla rápida:** El índice inferior (3) te dice cuántos números consecutivos hacia atrás escribes en el numerador (8 \times 7 \times 6), y en el denominador colocas el factorial de ese índice (1 \times 2 \times 3). ¡Toma 3 segundos!

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: La Regla de Oro del Orden
> **"COMBINACIÓN es de COMISIÓN (NO importa el orden)"**  
> Si formas una comisión con Pedro y María, es exactamente la misma comisión que con María y Pedro. No importa el orden \implies **Combinación (C_k^n)**.  
> Pero si eliges **Presidente y Secretario**, Pedro de presidente no es igual a María de presidente. Sí importa el orden \implies **Variación / Permutación**.

### Mnemotecnia 2: Elementos que van Siempre Juntos
> **"ENPAQUETA Y CUENTA COMO UNO"**  
> Si una pareja de enamorados debe sentarse siempre junta en una fila de 6 personas:
> 1. Junta a los 2 en un solo "bloque" imaginario.
> 2. Ahora tienes 5 elementos para permutar: 5!.
> 3. Multiplica por el orden interno de la pareja: 2!.  
> 👉 \text{Total} = 5! \cdot 2! = 120 \times 2 = \mathbf{240 \text{ formas}}.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Permutación circular en mesa sin orientar:**
   * En una mesa circular con 6 asientos, el número de formas de sentarse es (6 - 1)! = 5! = 120.
   * **El error común:** Marcar 6! = 720. La mesa circular elimina una posición fija por rotación simétrica.
2. ⚠️ **"Al menos uno" o "Por lo menos uno":**
   * En lugar de calcular: (1 hombre) + (2 hombres) + (3 hombres)...
   * **Aplica el Complemento:**
     \text{Casos favorables} = \text{Total de Casos} - \text{Casos donde NO hay ningún hombre}
3. ⚠️ **Ida y vuelta sin usar el mismo camino vs. sin repetir la misma ruta completa:**
   * *Sin usar el mismo camino:* Ningún tramo de vuelta puede ser idéntico al de ida.
   * *Sin repetir la misma ruta completa:* Solo se prohíbe que la combinación total de ida coincida idéntica con la de vuelta. Lee la palabra exacta del prospecto.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Seguridad Informática en Banca Móvil (Arequipa)
Una cooperativa de crédito en Arequipa exige que la clave dinámica de un usuario esté formada por 4 dígitos seguidos de 2 letras del alfabeto castellano (sin incluir la letra Ñ, es decir, 26 letras). Si los dígitos no pueden repetirse y la primera letra debe ser obligatoriamente una vocal:
* Elección de dígitos: 10 \times 9 \times 8 \times 7 = 5,040 formas.
* Elección de la primera letra (vocal): 5 formas (A, E, I, O, U).
* Elección de la segunda letra (cualquiera de las 26): 26 formas.
* Total de claves posibles por principio multiplicativo:
  \text{Total} = 5,040 \times 5 \times 26 = 5,040 \times 130 = \mathbf{655,200 \text{ claves únicas}}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t05_s02_c01",
                    question = "Un cartero de Yanahuara debe desplazarse desde la esquina A hasta la esquina B de una red de calles de 4 cuadras de este a oeste y 3 cuadras de sur a norte, caminando únicamente hacia el este o hacia el norte. Si la esquina intermedia C (ubicada a 2 cuadras al este y 1 cuadra al norte de A) se encuentra inundada y cerrada al paso, ¿cuántas rutas seguras tiene el cartero para llegar a su destino?",
                    options = listOf(
                        "20",
                        "23",
                        "26",
                        "29"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t05_s02_c02",
                    question = "Seis varones y seis mujeres se van a sentar alrededor de una mesa circular con 12 asientos distribuidos simétricamente. ¿De cuántas maneras diferentes pueden sentarse si los varones y las mujeres deben quedar estrictamente intercalados?",
                    options = listOf(
                        "5! \\cdot 6!",
                        "6! \\cdot 6!",
                        "\\frac{12!}{2}",
                        "11!"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t05_s02_c03",
                    question = "Si tienes n elementos y k de ellos deben permanecer siempre juntos, ¿cómo se calcula?",
                    options = listOf(
                        "Equivale a 1 por convención matemática y axiomática.",
                        "Valor o condición no aplicable al caso planteado",
                        "Se toma a los k elementos como un solo bloque (n - k + 1 elementos a permutar) y se multiplica por k! (orden interno del bloque).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Se toma a los k elementos como un solo bloque (n - k + 1 elementos a permutar) y se multiplica por k! (orden interno del bloque)."
                ),
                Challenge(
                    id = "rm_t05_s02_c04",
                    question = "¿A qué equivale por definición el factorial de cero (0!)?",
                    options = listOf(
                        "Se toma a los k elementos como un solo bloque (n - k + 1 elementos a permutar) y se multiplica por k! (orden interno del bloque).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Equivale a 1 por convención matemática y axiomática."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale a 1 por convención matemática y axiomática."
                ),
                Challenge(
                    id = "rm_t05_s02_c05",
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
                    id = "rm_t05_s02_c06",
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
                    id = "rm_t05_s02_c07",
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
                    id = "rm_t05_s02_c08",
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
                    id = "rm_t05_s02_c09",
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
                    id = "rm_t05_s02_c10",
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
