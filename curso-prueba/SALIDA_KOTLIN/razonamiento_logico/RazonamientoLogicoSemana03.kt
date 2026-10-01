package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t03_s01",
            title = "RELACIONES LÓGICAS ENTRE PROPOSICIONES - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "RELACIONES LÓGICAS ENTRE PROPOSICIONES - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Relaciones de causa-efecto, condición suficiente vs. necesaria, contradicción formal, equivalencia y compatibilidad de proposiciones. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de consistencia en testimonios judiciales, hipótesis científicas contrapuestas y coherencia discursiva. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Relaciones metalógicas de implicación tautológica (A \models B), equivalencia lógica formal (A \equiv B) e incompatibilidad analítica. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar y discriminar rigurosamente relaciones lógicas de causa-efecto, condición, consecuencia, contradicción y equivalencia.
2. Reconocer la compatibilidad o incompatibilidad lógica simultánea entre dos o más afirmaciones.
3. Evaluar la coherencia lógica interna y externa de conjuntos de enunciados.
4. Diferenciar con precisión una **condición suficiente** de una **condición necesaria**.
5. Determinar equivalencias lógicas directas mediante leyes de transformación sintáctica.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Causa - Efecto (Antecedente -> Consecuente)
        ┌─ 1. Relaciones de ───┼─ Condición Suficiente (Si ocurre A, necesariamente ocurre B)
        │      Condición       ├─ Condición Necesaria (B es indispensable para que ocurra A)
        │                      └─ Condición Necesaria y Suficiente (Bicondicional: A <-> B)
        │
RELACIONES                     ┌─ Relación de Equivalencia (Mismo valor de verdad en toda circunstancia)
LÓGICAS ENTRE ──┼─ 2. Relaciones de ───┼─ Relación de Implicación (A -> B es una Tautología)
PROPOSICIONES   │      Verdad Formal   └─ Subimplicación y Relaciones Subcontrarias
        │
        │                      ┌─ Contradicción (Tienen valores de verdad estrictamente opuestos)
        ├─ 3. Oposición e ─────┼─ Incompatibilidad (No pueden ser ambas verdaderas a la vez)
        │      Incompatibilidad└─ Contrariedad (Pueden ser ambas falsas, pero no ambas verdaderas)
        │
        └─ 4. Coherencia y ────┌─ Compatibilidad Lógica (Existe al menos una asignación donde ambas son V)
               Consistencia    └─ Inconsistencia / Contradicción Global (Conjunto insatisfacible)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Relaciones de Causalidad y Condición

#### A. Condición Suficiente (p \to q)
Decimos que p es **condición suficiente** para q cuando la sola presencia o verdad de p garantiza de manera infalible la ocurrencia de q.
* *Ejemplo:* "Nacer en la provincia de Arequipa (p)" es **suficiente** para "ser peruano de nacimiento (q)".
* **Fórmula:** p \to q.

#### B. Condición Necesaria (q \leftarrow p \equiv p \to q)
Decimos que q es **condición necesaria** para p cuando la ausencia o falsedad de q hace absolutamente imposible la ocurrencia de p. Es un requisito indispensable, aunque por sí solo no garantiza el resultado.
* *Ejemplo:* "Tener DNI o documento de identidad (q)" es **necesario** para "votar en las elecciones de la UNSA (p)". (Sin DNI no puedes votar; pero tener DNI no significa obligatoriamente que vayas a votar).
* **Fórmula canónica:** El término "necesario" **siempre es el CONSECUENTE**:
  p \to q \quad (q \text{ es condición necesaria para } p)

#### C. Condición Necesaria y Suficiente (p \leftrightarrow q)
Ocurre cuando la relación es bidireccional y de equivalencia estricta. Una ocurre si y solo si ocurre la otra.
* *Ejemplo:* "Un polígono tiene tres lados si y solo si es un triángulo".

---

### 3.2 Relaciones de Compatibilidad e Incompatibilidad Lógica

1. **Compatibilidad Lógica:**
   Dos proposiciones A y B son **compatibles** si y solo si existe **al menos una interpretación o combinación de valores** donde ambas proposiciones son simultáneamente **VERDADERAS**:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE RELACIONES Y EQUIVALENCIAS

### 4.1 Diccionario Rápido de Condicionales Preuniversitarios

| Frase del Enunciado | Identificación del Consecuente | Formalización |
| :--- | :--- | :---: |
| "A es condición suficiente para B" | B es el consecuente | A \to B |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t03_s01_c01",
                    question = "Identifique la alternativa que exprese formalmente que:",
                    options = listOf(
                        "T \\to D",
                        "D \\to T",
                        "T \\leftrightarrow D",
                        "\\sim T \\to D"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t03_s01_c02",
                    question = "¿Cuál de las siguientes proposiciones es lógicamente equivalente a:",
                    options = listOf(
                        "Si viajas a Mollendo, vas a la playa.",
                        "Viajas a Mollendo o no vas a la playa.",
                        "Si vas a la playa, viajas a Mollendo.",
                        "No viajas a Mollendo y vas a la playa."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t03_s01_c03",
                    question = "Analice las siguientes tres afirmaciones de política económica regional:",
                    options = listOf(
                        "Solo I y III",
                        "Solo I y II",
                        "Solo II y III",
                        "I, II y III"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t03_s01_c04",
                    question = "En la proposición \"A es condición suficiente para B\", ¿cómo se formaliza el condicional?",
                    options = listOf(
                        "B \\to A (la condición necesaria siempre se coloca en el consecuente).",
                        "Las contradictorias nunca pueden tener el mismo valor de verdad; las contrarias no pueden ser ambas verdaderas, pero **sí pueden ser ambas falsas**.",
                        "Valor o condición no aplicable al caso planteado",
                        "A \\to B (A es el antecedente y B el consecuente)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: A \\to B (A es el antecedente y B el consecuente)."
                ),
                Challenge(
                    id = "rl_t03_s01_c05",
                    question = "En la proposición \"A es condición necesaria para B\", ¿cómo se formaliza el condicional?",
                    options = listOf(
                        "B \\to A (la condición necesaria siempre se coloca en el consecuente).",
                        "A \\to B (A es el antecedente y B el consecuente).",
                        "Las contradictorias nunca pueden tener el mismo valor de verdad; las contrarias no pueden ser ambas verdaderas, pero **sí pueden ser ambas falsas**.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: B \\to A (la condición necesaria siempre se coloca en el consecuente)."
                ),
                Challenge(
                    id = "rl_t03_s01_c06",
                    question = "¿Cuál es la diferencia entre dos proposiciones contrarias y dos contradictorias?",
                    options = listOf(
                        "A \\to B (A es el antecedente y B el consecuente).",
                        "Las contradictorias nunca pueden tener el mismo valor de verdad; las contrarias no pueden ser ambas verdaderas, pero **sí pueden ser ambas falsas**.",
                        "B \\to A (la condición necesaria siempre se coloca en el consecuente).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Las contradictorias nunca pueden tener el mismo valor de verdad; las contrarias no pueden ser ambas verdaderas, pero **sí pueden ser ambas falsas**."
                ),
                Challenge(
                    id = "rl_t03_s01_c07",
                    question = "Si A es condición suficiente para B, B es necesaria para C, y C es contradictoria con D. Si D es FALSA, ¿qué afirmación es concluyente?",
                    options = listOf(
                        "A es necesariamente verdadera",
                        "B es necesariamente verdadera",
                        "A es necesariamente falsa",
                        "B es necesariamente falsa"
                    ),
                    correctIndex = 1,
                    explanation = "Como D=F y C es contradictoria con D => C=V. Como B es necesaria para C => C -> B es V. Como C=V => B debe ser necesariamente VERDADERA."
                ),
                Challenge(
                    id = "rl_t03_s01_c08",
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
                    id = "rl_t03_s01_c09",
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
                    id = "rl_t03_s01_c10",
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
            id = "rl_t03_s02",
            title = "RELACIONES LÓGICAS ENTRE PROPOSICIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "RELACIONES LÓGICAS ENTRE PROPOSICIONES - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   \text{Existe asignación tal que } (A = V \quad \text{y} \quad B = V) \iff A \land B \not\equiv F
2. **Incompatibilidad Lógica (Inconsistencia Relativa):**
   Dos proposiciones A y B son **incompatibles** cuando es lógicamente imposible que ambas sean verdaderas al mismo tiempo:
   A \land B \equiv \mathbf{F} \quad (\text{Contradicción absoluta})
   * *Ejemplo:* "x es un número par mayor que 10" y "x es un número primo mayor que 10". Son incompatibles porque el único primo par es el 2.

---

### 3.3 Relaciones de Contradicción y Contrariedad

| Tipo de Relación | ¿Pueden ser ambas V? | ¿Pueden ser ambas F? | Valores de Verdad | Ejemplo Formal |
| :--- | :---: | :---: | :--- | :---: |
| **Contradictorias** | **NO** | **NO** | Valores estrictamente opuestos (V-F o F-V) | p frente a \sim p |
| **Contrarias** | **NO** | **SÍ** | No pueden ser ambas verdaderas, pero sí pueden ser ambas falsas | "Todos los metales son sólidos" vs. "Ningún metal es sólido" *(Mercurio es líquido)* |
| **Subcontrarias** | **SÍ** | **NO** | Pueden ser ambas verdaderas, pero no pueden ser ambas falsas | "Algunos peruanos son arequipeños" vs. "Algunos peruanos no son arequipeños" |

---

### 3.4 Relación de Implicación Lógica (A \models B)
Decimos que la proposición A **implica lógicamente** a la proposición B (notación A \models B o A \Rightarrow B) cuando la fórmula condicional:
A \to B \equiv \text{TAUTOLOGÍA}
Es decir, no existe ninguna asignación donde A sea verdadero y B sea falso. La verdad de A arrastra necesariamente la verdad de B.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| "A es condición necesaria para B" | **A es el consecuente** | B \to A |
| "A solo si B" | B es el consecuente | A \to B |
| "A si B" | A es el consecuente | B \to A |
| "Para que ocurra A es indispensable que ocurra B" | B es el consecuente | A \to B |
| "No se da A a menos que se dé B" | \sim B \to \sim A \equiv A \to B | A \to B |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica de la Tabla Comparativa de Coherencia
Para verificar si dos fórmulas extensas A y B son **compatibles**:
1. No simplifiques ambas con leyes gigantes.
2. Busca una asignación simple donde A sea verdadera (ejemplo: haz todas las variables V).
3. Si con esa misma asignación B también resulta ser verdadera:
   👉 **A y B son formalmente COMPATIBLES**. (Prueba de existencia en 10 segundos).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL SUFI-VA-PRIMERO, EL NECE-VA-AL-FINAL"
> * **SUFI**ciente \implies Va **PRIMERO** (es el Antecedente: \text{SUFI} \to \text{efecto}).
> * **NECE**sario \implies Va al **FINAL** (es el Consecuente: \text{causa} \to \text{NECE}).  
> *Ejemplo:* Si dicen "El oxígeno es necesario para la combustión", el oxígeno va al final:  
> \text{Combustión} \to \text{Oxígeno}.

### Mnemotecnia 2: La Prueba del "SOLO SI"
> **"Lo que sigue a la palabra 'SOLO SI' es SIEMPRE la flecha de llegada (\to)"**  
> "Ingresas a la UNSA solo si rindes el examen" \implies \text{Ingresas} \to \text{Rindes el examen}.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Confundir "Contradicción" con "Contrariedad":**
   * *Contradictorias:* Si una es V, la otra es obligatoriamente F; si una es F, la otra es obligatoriamente V.
   * *Contrarias:* Si una es V, la otra es F; pero si una es F, **la otra puede ser también Falsa**.
2. ⚠️ **La trampa del "es necesario" ubicado al principio de la oración:**
   * *"Es necesario aprobar el examen para ingresar a la universidad"*.
   * **El error clásico:** Como "aprobar" está al inicio, poner: \text{Aprobar} \to \text{Ingresar}. (¡Grave error!).
   * **Lo correcto:** Como "aprobar" es lo necesario, va al final: \text{Ingresar} \to \text{Aprobar}.
3. ⚠️ **Incompatibilidad encubierta en enunciados numéricos:**
   * Proposición 1: "El número entero n es múltiplo de 6".
   * Proposición 2: "El número entero n es impar".
   * Son **incompatibles**, porque todo múltiplo de 6 es divisible entre 2 y por definición es estrictamente par.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Consistencia de Declaraciones Testimoniales en Criminalística
En la investigación de un asalto en el Cercado de Arequipa, la Fiscalía analiza los testimonios de dos sospechosos:
* Declaración del Sospechoso 1 (A): "Si yo estuve en el lugar de los hechos, entonces fui con Carlos (p \to q)".
* Declaración del Sospechoso 2 (B): "Carlos no estuvo en el lugar de los hechos, pero el Sospechoso 1 sí estuvo (\sim q \land p)".
* **Evaluación de Coherencia:**
  - Si el Sospechoso 2 dice la verdad: p = V y q = F.
  - Reemplazamos en la declaración del Sospechoso 1:
    p \to q \equiv V \to F \equiv \mathbf{F}
  - **Deducción pericial:** Las dos declaraciones son **mutuamente incompatibles**. Es lógicamente imposible que ambos digan la verdad simultáneamente; al menos uno está mintiendo flagrantemente.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t03_s02_c01",
                    question = "Dadas las fórmulas proposicionales:",
                    options = listOf(
                        "Sí implica, porque A \\to B es una Tautología",
                        "No implica, porque A \\to B es una Contingencia",
                        "No implica, porque A \\to B es una Contradicción",
                        "Son proposiciones contradictorias"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t03_s02_c02",
                    question = "Sean A, B y C tres esquemas proposicionales tales que:",
                    options = listOf(
                        "A es necesariamente verdadera",
                        "B es necesariamente verdadera",
                        "C es necesariamente verdadera",
                        "A es necesariamente falsa"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t03_s02_c03",
                    question = "¿Qué significa que una proposición A implique lógicamente a B (A \\models B)?",
                    options = listOf(
                        "Equivale formalmente a A \\to B (\"B es la condición hacia donde apunta la implicación\").",
                        "Valor o condición no aplicable al caso planteado",
                        "Significa que el condicional A \\to B es una **Tautología** (nunca puede darse que A sea verdadero y B falso).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Significa que el condicional A \\to B es una **Tautología** (nunca puede darse que A sea verdadero y B falso)."
                ),
                Challenge(
                    id = "rl_t03_s02_c04",
                    question = "¿Cuál es la expresión equivalente a \"A solo si B\"?",
                    options = listOf(
                        "Significa que el condicional A \\to B es una **Tautología** (nunca puede darse que A sea verdadero y B falso).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Equivale formalmente a A \\to B (\"B es la condición hacia donde apunta la implicación\")."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale formalmente a A \\to B (\"B es la condición hacia donde apunta la implicación\")."
                ),
                Challenge(
                    id = "rl_t03_s02_c05",
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
                    id = "rl_t03_s02_c06",
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
                    id = "rl_t03_s02_c07",
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
                    id = "rl_t03_s02_c08",
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
                    id = "rl_t03_s02_c09",
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
                    id = "rl_t03_s02_c10",
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
