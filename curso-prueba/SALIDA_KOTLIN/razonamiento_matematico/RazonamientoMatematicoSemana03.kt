package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t03_s01",
            title = "RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Traducción de lenguaje verbal a algebraico, problemas de edades (cuadros de doble entrada con pasado, presente y futuro) y equivalencias de balanzas. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas de edades contextualizados en árboles genealógicos familiares, años bisiestos y relaciones de producción. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Ecuaciones con condiciones de números enteros (\mathbb{Z}^+), ecuaciones diofánticas y restricciones lógicas de tiempo. | Avanzado | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Utilizar letras y símbolos como representaciones rigurosas de incógnitas y relaciones de orden.
2. Traducir enunciados del lenguaje natural cotidiano a expresiones y modelos algebraicos precisos.
3. Reconocer relaciones de equivalencia, simetría y transitividad entre expresiones algebraicas.
4. Plantear y resolver situaciones problemáticas formulando ecuaciones de primer y segundo grado.
5. Resolver problemas de edades con uno, dos o más sujetos en diferentes tiempos cronológicos.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Términos Clave de Traducción (Es a, excede, tanto como)
        ┌─ 1. Planteo de ──────┼─ Fracciones de Incógnitas (Parte de un todo algebraico)
        │      Ecuaciones      ├─ Ecuaciones Lineales y Cuadráticas Intuitivas
        │                      └─ Ecuaciones Diofánticas Simples (Soluciones enteras)
        │
RAZONAMIENTO                   ┌─ Para un Solo Sujeto (Línea de tiempo unidireccional)
ALGEBRAICO ─────┼─ 2. Problemas de ────┼─ Para Dos o Más Sujetos (Cuadros de Doble Entrada)
INTUITIVO       │      Edades          ├─ Principio Fundamental de la Diferencia Constante
        │                      └─ Relación entre Año de Nacimiento y Año Actual
        │
        └─ 3. Equivalencias ───┌─ Balanzas en Equilibrio (Sistemas lineales intuitivos)
               Lógicas         ├─ Regla de Conjunta (Método de reducción en cadena)
               y Balanzas      └─ Falsa Suposición y Rombo Algebraico
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Diccionario de Traducción Algebraica (Lenguaje Común a Lenguaje Simbólico)

| Enunciado Verbal | Traducción Matemática |
| :--- | :---: |
| El triple de un número, aumentado en 5 | 3x + 5 |
| El triple, de un número aumentado en 5 *(¡Atención a la coma!)* | 3(x + 5) |
| A es dos veces más que B (A es tres veces B) | A = 3B |
| A es dos veces B (A es el doble de B) | A = 2B |
| A excede a B en 8 unidades | A - B = 8 |
| El exceso de A sobre el triple de B es 12 | A - 3B = 12 |
| La suma de tres números enteros consecutivos | x + (x + 1) + (x + 2) = 3x + 3 |
| La suma de tres números enteros impares consecutivos | (2x - 1) + (2x + 1) + (2x + 3) |
| El cuadrado de la suma de dos números | (x + y)^2 |
| La suma de los cuadrados de dos números | x^2 + y^2 |

---

### 3.2 Teoría Rigurosa de Problemas sobre Edades

#### A. Caso I: Para un Solo Sujeto
Se trabaja sobre una **línea de tiempo** con una sola variable:
\begin{array}{ccccc}
\text{Pasado} & & \text{Presente} & & \text{Futuro} \\
\hline
\text{Hace } m \text{ años} & \longleftarrow & \text{Hoy} & \longrightarrow & \text{Dentro de } n \text{ años} \\
x - m & & x & & x + n
\end{array}

#### B. Caso II: Para Dos o Más Sujetos (Matriz Cronológica)

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO Y MÉTODOS DE RESOLUCIÓN

### 4.1 Método de la Regla de Conjunta (Equivalencias en Cadena)
Se utiliza para encontrar la equivalencia final entre dos elementos a partir de relaciones intermedias:
* Se disponen las equivalencias en columnas de modo que **el elemento que aparece a la derecha de una fila aparezca a la izquierda de la siguiente**.
* Se multiplican término a término los miembros de la izquierda y se igualan al producto de la derecha:
  \prod \text{Miembros de la Izquierda} = \prod \text{Miembros de la Derecha}

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t03_s01_c01",
                    question = "El exceso del cuádruple de un número sobre 18 equivale al doble del mismo número aumentado en 14. Calcule dicho número.",
                    options = listOf(
                        "12",
                        "14",
                        "16",
                        "18"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t03_s01_c02",
                    question = "La edad actual de Juan es el triple de la edad de Pedro. Si dentro de 10 años la edad de Juan será el doble de la que Pedro tenga en ese momento, ¿cuántos años tiene Juan actualmente?",
                    options = listOf(
                        "20 años",
                        "25 años",
                        "30 años",
                        "35 años"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t03_s01_c03",
                    question = "Yo tengo el doble de la edad que tú tenías cuando yo tenía la edad que tú tienes. Si la suma de nuestras edades actuales es de 63 años, ¿cuántos años tengo yo?",
                    options = listOf(
                        "28 años",
                        "32 años",
                        "35 años",
                        "36 años"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t03_s01_c04",
                    question = "¿Qué significa en lenguaje algebraico la frase \"A es tres veces más que B\"?",
                    options = listOf(
                        "La suma en aspa entre dos tiempos cualesquiera siempre es exactamente igual (a_1 + b_2 = b_1 + a_2).",
                        "\\text{Año de Nacimiento} + \\text{Edad} = \\text{Año Actual} - 1.",
                        "Valor o condición no aplicable al caso planteado",
                        "Significa A = 4B (el valor de B más tres veces su valor)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Significa A = 4B (el valor de B más tres veces su valor)."
                ),
                Challenge(
                    id = "rm_t03_s01_c05",
                    question = "¿Qué propiedad fundamental se cumple en la suma cruzada de un cuadro de edades para dos personas?",
                    options = listOf(
                        "La suma en aspa entre dos tiempos cualesquiera siempre es exactamente igual (a_1 + b_2 = b_1 + a_2).",
                        "Significa A = 4B (el valor de B más tres veces su valor).",
                        "\\text{Año de Nacimiento} + \\text{Edad} = \\text{Año Actual} - 1.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: La suma en aspa entre dos tiempos cualesquiera siempre es exactamente igual (a_1 + b_2 = b_1 + a_2)."
                ),
                Challenge(
                    id = "rm_t03_s01_c06",
                    question = "¿Cuál es la relación matemática entre el año de nacimiento y la edad si la persona aún NO cumple años en el año actual?",
                    options = listOf(
                        "Significa A = 4B (el valor de B más tres veces su valor).",
                        "\\text{Año de Nacimiento} + \\text{Edad} = \\text{Año Actual} - 1.",
                        "La suma en aspa entre dos tiempos cualesquiera siempre es exactamente igual (a_1 + b_2 = b_1 + a_2).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\text{Año de Nacimiento} + \\text{Edad} = \\text{Año Actual} - 1."
                ),
                Challenge(
                    id = "rm_t03_s01_c07",
                    question = "Yo tengo el doble de la edad que tú tenías cuando yo tenía la edad que tú tienes. Si la suma de nuestras edades actuales es 63 años, ¿qué edad tengo yo?",
                    options = listOf(
                        "28 años",
                        "32 años",
                        "35 años",
                        "36 años"
                    ),
                    correctIndex = 3,
                    explanation = "Al plantear la matriz con 'y' y '2x', la suma en aspa da 2y = 3x (y = 1.5x). La suma actual es 2x + 1.5x = 3.5x = 63 => x = 18. Mi edad es 2(18) = 36 años."
                ),
                Challenge(
                    id = "rm_t03_s01_c08",
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
                    id = "rm_t03_s01_c09",
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
                    id = "rm_t03_s01_c10",
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
            id = "rm_t03_s02",
            title = "RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RAZONAMIENTO ALGEBRAICO INTUITIVO Y EDADES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Se organiza un cuadro de doble entrada.

| Sujetos | Pasado | Presente | Futuro |
| :--- | :---: | :---: | :---: |
| **Persona A** | a_1 | a_2 | a_3 |
| **Persona B** | b_1 | b_2 | b_3 |

**PROPIEDADES FUNDAMENTALES INQUEBRANTABLES:**

1. **La diferencia de edades entre dos personas permanece CONSTANTE en cualquier tiempo:**
   a_1 - b_1 = a_2 - b_2 = a_3 - b_3
   *(Si tu hermano mayor te lleva por 4 años hoy, dentro de 50 años te seguirá llevando exactamente por 4 años).*

2. **La suma en aspa es constante:**
   a_1 + b_2 = b_1 + a_2
   a_2 + b_3 = b_2 + a_3
   a_1 + b_3 = b_1 + a_3

---

### 3.3 Relación entre Año de Nacimiento y Año Actual
Para cualquier ser humano:
\text{Año de Nacimiento} + \text{Edad Actual} = \text{Año Actual}
* **Condición biológica estricta:**
  * Si la persona **ya cumplió años** en el año de referencia:
    \text{Año de Nacimiento} + \text{Edad} = \text{Año de Referencia}
  * Si la persona **aún no cumple años** en el año de referencia:
    \text{Año de Nacimiento} + \text{Edad} = \text{Año de Referencia} - 1

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

### 4.2 Método del Rombo (Falsa Suposición Inmediata)
Para problemas con dos incógnitas, conociendo el número total de elementos (N_t) y la recaudación/suma total (S_t):

\text{Incógnita Menor (Abajo)} = \frac{N_t \cdot M_{\text{arriba}} - S_t}{M_{\text{arriba}} - m_{\text{abajo}}}

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Artificio de la Paridad en Suma de Años de Nacimiento
Cuando un problema de admisión UNSA/UNI dice:  
*"En 1990 la suma de las edades de 4 personas más sus años de nacimiento dio 7958..."*
* Si todas hubieran cumplido años, la suma teórica sería: 4 \times 1990 = 7960.
* Como la suma real dio 7958, la diferencia es: 7960 - 7958 = \mathbf{2}.
* **Conclusión instantánea:** Exactamente **2 personas aún no cumplen años** y 4 - 2 = \mathbf{2} personas ya cumplieron años. ¡Sin plantear ecuaciones con 4 incógnitas!

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL ASPA SALVADORA EN EDADES"
> En cualquier cuadro de edades de 2 personas:
> **"Lo que tengo más lo que tuviste es igual a lo que tienes más lo que tuve"**  
> Suma en cruz siempre da el mismo resultado numérico. Si tienes 3 datos y una incógnita en aspa, la despejas en 5 segundos.

### Mnemotecnia 2: "DOS VECES MÁS NO ES EL DOBLE"
> * **"Dos veces"** = Multiplicar por **2** (2x).
> * **"Dos veces MÁS"** = El original (x) más dos veces más (+2x) = Multiplicar por **3** (3x).
> * **"Tres veces MÁS"** = Multiplicar por **4** (4x).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La trampa de la coma en el lenguaje verbal:**
   * *"El triple de un número aumentado en 4"* \implies 3x + 4.
   * *"El triple, de un número aumentado en 4"* \implies 3(x + 4) = 3x + 12.
   *(Una simple coma cambia la respuesta de 16 a 24 en las alternativas de la UNSA).*
2. ⚠️ **Problemas de edades con tiempos cruzados:**
   * *"Tú tienes la edad que yo tenía cuando tú tenías la tercera parte de lo que yo tengo..."*
   * **El error común:** Querer plantearlo en una sola línea.
   * **La solución infalible:** Dibuja el cuadro de 2 filas y 3 columnas inmediatamente; cada frase encaja en una celda fija.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Modelación de Capacidad de Servidores Cloud
Una startup de Arequipa contrata instancias de servidores. El costo diario de una máquina de alto rendimiento excede en \15 al doble del costo de una máquina estándar. Si la empresa alquila 3 máquinas estándar y 2 de alto rendimiento pagando un total de \170 al día:
* Sea x el costo de la máquina estándar.
* Alto rendimiento: 2x + 15.
* Modelo algebraico:
  3x + 2(2x + 15) = 170 \implies 3x + 4x + 30 = 170 \implies 7x = 140 \implies x = \20
* Costo estándar: \20/\text{día}, Alto rendimiento: \55/\text{día}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t03_s02_c01",
                    question = "En una feria ganadera de Arequipa se sabe que por 3 vacas te dan 8 ovejas, por 6 ovejas te dan 5 cabras, y por 4 cabras te dan 9 cerdos. Si 10 cerdos cuestan S/.\\, 1,200, ¿cuánto costará comprar 2 vacas?",
                    options = listOf(
                        "S/.\\, 720",
                        "S/.\\, 800",
                        "S/.\\, 960",
                        "S/.\\, 1,080"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t03_s02_c02",
                    question = "En el año 2000, una persona multiplicó su edad por el año en que nació y al resultado le sumó el cuadrado de su edad, obteniendo exactamente 39,996. ¿En qué año nació dicha persona si ya había cumplido años en el año 2000?",
                    options = listOf(
                        "1978",
                        "1980",
                        "1982",
                        "1984"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t03_s02_c03",
                    question = "¿Qué diferencia hay entre \"4x - 10\" y \"4(x - 10)\" según el enunciado verbal?",
                    options = listOf(
                        "Falso. La razón geométrica (proporción) cambia con el tiempo; lo único que permanece constante es la diferencia de sus edades.",
                        "Valor o condición no aplicable al caso planteado",
                        "El primero es \"el cuádruple de un número disminuido en 10\"; el segundo es \"el cuádruple, de un número disminuido en 10\" (con coma).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El primero es \"el cuádruple de un número disminuido en 10\"; el segundo es \"el cuádruple, de un número disminuido en 10\" (con coma)."
                ),
                Challenge(
                    id = "rm_t03_s02_c04",
                    question = "Si Juan tiene el triple de la edad de Pedro hoy, ¿dentro de 10 años Juan seguirá teniendo el triple de la edad de Pedro?",
                    options = listOf(
                        "El primero es \"el cuádruple de un número disminuido en 10\"; el segundo es \"el cuádruple, de un número disminuido en 10\" (con coma).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Falso. La razón geométrica (proporción) cambia con el tiempo; lo único que permanece constante es la diferencia de sus edades."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Falso. La razón geométrica (proporción) cambia con el tiempo; lo único que permanece constante es la diferencia de sus edades."
                ),
                Challenge(
                    id = "rm_t03_s02_c05",
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
                    id = "rm_t03_s02_c06",
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
                    id = "rm_t03_s02_c07",
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
                    id = "rm_t03_s02_c08",
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
                    id = "rm_t03_s02_c09",
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
                    id = "rm_t03_s02_c10",
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
