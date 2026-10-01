package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana01 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t01_s01",
            title = "PROPOSICIONES Y ENUNCIADOS LÓGICOS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "PROPOSICIONES Y ENUNCIADOS LÓGICOS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Clasificación de enunciados (proposición, enunciado abierto, no proposicional), distinción de proposiciones simples y compuestas, valores de verdad en contextos fácticos. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de discursos argumentativos, declaraciones científicas e históricas, detección de enunciados con sentido o sin sentido. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Formalización estricta en lenguaje formal (\mathcal{L}), cuantificadores universales/existenciales implícitos, paradojas autorreferenciales clásicas (Russell, Epiménides). | Avanzado | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar proposiciones lógicas distinguiéndolas con precisión de oraciones no proposicionales.
2. Determinar y discriminar valores de verdad (Verdadero V o Falso F) según el contexto fáctico o formal dado.
3. Reconocer enunciados no proposicionales: directivos, expresivos, exclamativos, interrogativos, juicios estéticos y pseudoproposiciones.
4. Analizar, clasificar y formalizar afirmaciones simples (atómicas o elementales) y compuestas (moleculares o coligativas).

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Expresiones No Proposicionales (Deseos, órdenes, dudas, preguntas)
        ┌─ 1. Tipología de ────┼─ Enunciados Abiertos / Funciones Proposicionales (P(x) con variables)
        │      Enunciados      ├─ Pseudoproposiciones (Sin sentido lógico o metafísicas)
        │                      └─ Proposiciones Lógicas (Tienen valor bivalente V o F)
        │
PROPOSICIONES                  ┌─ Proposiciones Predicativas (Atribuyen una cualidad a un sujeto)
Y ENUNCIADOS ───┼─ 2. Proposiciones ───┴─ Proposiciones Relacionales (Establecen vínculo entre dos o más entes)
LÓGICOS         │      Simples
        │
        │                      ┌─ Conjuntivas (y, pero, aunque, sin embargo, además)
        ├─ 3. Proposiciones ───┼─ Disyuntivas Débiles o Inclusivas (o)
        │      Compuestas      ├─ Disyuntivas Fuertes o Exclusivas (o... o...)
        │                      ├─ Condicionales (Directa: p -> q; Inversa: q <- p)
        │                      ├─ Bicondicionales (si y solo si)
        │                      └─ Negativas (~p)
        │
        └─ 4. Criterios de ────┌─ Principio de Tercero Excluido (Solo V o F, no hay tercer estado)
               Bivalencia      └─ Principio de No Contradicción (~(p ^ ~p))
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 El Enunciado y sus Categorías Epistemológicas
* **Enunciado:** Toda frase, oración o expresión lingüística emitida mediante el lenguaje verbal o escrito.
* **Proposición Lógica:** Es un enunciado aseverativo (afirmativo o negativo) susceptible de ser calificado unívocamente como **Verdadero (V)** o **Falso (F)**, pero nunca ambos a la vez. Posee un significado objetivo e invariable.
  * *Ejemplo Verdadero:* "Arequipa es la capital del departamento homónimo". (V)
  * *Ejemplo Falso:* "2^3 + 3^2 = 25". (F, pues 8 + 9 = 17 \neq 25).

---

### 3.2 Clasificación Taxonómica de Expresiones No Proposicionales
No son proposiciones lógicas porque carecen de valor de verdad bivalente:
1. **Oraciones Interrogativas:** ¿A qué hora inicia el examen de la UNSA? (Buscan información, no afirman nada).
2. **Oraciones Imperativas / Directivas (Órdenes, mandatos, pedidos):** "¡Cierra la puerta inmediatamente!", "Prohibido fumar".
3. **Oraciones Exclamativas o Admirativas:** "¡Qué hermosa tarde arequipeña!", "¡Auxilio!".
4. **Oraciones Desiderativas (Deseos):** "Ojalá ingrese a Medicina en primera opción".
5. **Oraciones Dubitativas (Duda):** "Tal vez viaje a Mollendo este fin de semana".
6. **Juicios de Valor Estético o Subjetivo:** "La música clásica es superior al rock".
7. **Pseudoproposiciones / Disparates sin sentido:** "Los triángulos son inteligentes y cantan baladas".
8. **Paradojas Lógicas Autorreferenciales:** "Esta afirmación que estoy escribiendo es falsa" (Si es verdadera, es falsa; si es falsa, es verdadera \implies Indecidible).

---

### 3.3 Enunciado Abierto (Función Proposicional)
Es un enunciado que contiene una o más variables libres y que no puede ser calificado como V o F **hasta que la variable no sea reemplazada por una constante específica del universo**:
* *Ejemplo 1:* "x + 5 = 12" (Es un enunciado abierto).
  - Si x = 7 \implies 7 + 5 = 12 (V, se transforma en proposición).

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE OPERADORES Y VALORES DE VERDAD

| Operación Lógica | Símbolo | Conector Clave | Regla de Oro Preuniversitaria |
| :--- | :---: | :---: | :--- |
| **Negación** | \sim p | "no", "es falso que" | Invierte el valor: \sim V = F, \sim F = V. |
| **Conjunción** | p \land q | "y", "pero", "además" | **Solo es VERDADERA si AMBAS son Verdaderas (V \land V = V).** En cualquier otro caso es F. |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t01_s01_c01",
                    question = "De los siguientes enunciados:",
                    options = listOf(
                        "1 y 4",
                        "1 y 5",
                        "1, 2 y 5",
                        "2 y 3"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t01_s01_c02",
                    question = "Identifique cuál de las siguientes proposiciones es clasificada como **compuesta**:",
                    options = listOf(
                        "Mario Vargas Llosa nació en la ciudad de Arequipa.",
                        "13 y 17 son números primos coprimos entre sí.",
                        "Lima y Callao son ciudades limítrofes.",
                        "Arequipa es una ciudad volcánica o colonial."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t01_s01_c03",
                    question = "Se sabe que la proposición molecular:",
                    options = listOf(
                        "V, F, F, V",
                        "V, V, F, F",
                        "F, V, V, F",
                        "V, F, V, F"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t01_s01_c04",
                    question = "¿Cuál es la única combinación de valores que hace FALSA a una proposición condicional (p \\to q)?",
                    options = listOf(
                        "Porque es una oración imperativa/ruego y carece de valor de verdad objetivo (no se puede calificar como verdadera o falsa).",
                        "Es una **proposición simple relacional** (no se puede desdoblar en dos oraciones independientes sin perder el sentido geográfico).",
                        "Valor o condición no aplicable al caso planteado",
                        "Cuando el antecedente es Verdadero y el consecuente es Falso (V \\to F = F)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cuando el antecedente es Verdadero y el consecuente es Falso (V \\to F = F)."
                ),
                Challenge(
                    id = "rl_t01_s01_c05",
                    question = "¿Por qué la frase \"¡Por favor, estudia para ingresar a la UNSA!\" NO es una proposición lógica?",
                    options = listOf(
                        "Porque es una oración imperativa/ruego y carece de valor de verdad objetivo (no se puede calificar como verdadera o falsa).",
                        "Cuando el antecedente es Verdadero y el consecuente es Falso (V \\to F = F).",
                        "Es una **proposición simple relacional** (no se puede desdoblar en dos oraciones independientes sin perder el sentido geográfico).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Porque es una oración imperativa/ruego y carece de valor de verdad objetivo (no se puede calificar como verdadera o falsa)."
                ),
                Challenge(
                    id = "rl_t01_s01_c06",
                    question = "¿Qué tipo de proposición simple es \"Arequipa y Moquegua son departamentos vecinos\"?",
                    options = listOf(
                        "Cuando el antecedente es Verdadero y el consecuente es Falso (V \\to F = F).",
                        "Es una **proposición simple relacional** (no se puede desdoblar en dos oraciones independientes sin perder el sentido geográfico).",
                        "Porque es una oración imperativa/ruego y carece de valor de verdad objetivo (no se puede calificar como verdadera o falsa).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Es una **proposición simple relacional** (no se puede desdoblar en dos oraciones independientes sin perder el sentido geográfico)."
                ),
                Challenge(
                    id = "rl_t01_s01_c07",
                    question = "Si (p y ~q) -> (r o ~s) es estrictamente FALSA, ¿cuál es el valor de verdad ordenado de (p, q, r, s)?",
                    options = listOf(
                        "V, F, F, V",
                        "V, V, F, F",
                        "F, V, V, F",
                        "V, F, V, F"
                    ),
                    correctIndex = 0,
                    explanation = "El condicional es Falso solo con V -> F. Luego (p y ~q) = V => p=V, q=F. Y (r o ~s) = F => r=F, s=V. Resultado: V, F, F, V."
                ),
                Challenge(
                    id = "rl_t01_s01_c08",
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
                    id = "rl_t01_s01_c09",
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
                    id = "rl_t01_s01_c10",
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
            id = "rl_t01_s02",
            title = "PROPOSICIONES Y ENUNCIADOS LÓGICOS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "PROPOSICIONES Y ENUNCIADOS LÓGICOS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  - Si x = 3 \implies 3 + 5 = 12 (F, se transforma en proposición).
* *Ejemplo 2:* "Él fue el presidente del Perú durante la Guerra del Pacífico". (Enunciado abierto; "Él" es un pronombre variable).

---

### 3.4 Clasificación de las Proposiciones Lógicas

#### A. Proposiciones Simples (Atómicas o Elementales)
Carecen totalmente de conectores lógicos y de la partícula de negación. Contienen un solo verbo principal.
1. **Predicativas:** Atribuyen una propiedad, característica o cualidad a un solo sujeto:
   * "El tungsteno es un elemento químico metálico".
   * "Mariano Melgar fue un poeta romántico arequipeño".
2. **Relacionales:** Expresan un nexo, vínculo o comparación matemática, espacial, temporal o de parentesco entre dos o más sujetos que no pueden separarse:
   * "Cusco está al norte de Arequipa".
   * "7 es menor que 15" (7 < 15).
   * "Mario y Andrea son hermanos consanguíneos". *(¡Ojo: no se puede partir en 'Mario es hermano' y 'Andrea es hermana')*.

#### B. Proposiciones Compuestas (Moleculares o Coligativas)
Resultan de la unión de dos o más proposiciones simples mediante conectores lógicos, o de la alteración de una proposición simple mediante la negación.
* **Conjuntiva (p \land q):** Une dos ideas simultáneas ("y", "pero", "sin embargo", "aunque", "además").
* **Disyuntiva Inclusiva (p \lor q):** Al menos una es verdadera ("o").
* **Disyuntiva Exclusiva (p \vartriangle q):** Una y solo una es verdadera ("o bien p o bien q").
* **Condicional (p \to q):** Causa-Efecto ("si... entonces...", "por lo tanto", "en consecuencia").
* **Bicondicional (p \leftrightarrow q):** Equivalencia ("si y solo si", "cuando y solo cuando").
* **Negativa (\sim p):** Invierte el valor de verdad ("no", "es falso que", "no es cierto que").

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Disyunción Débil** | p \lor q | "o" | **Solo es FALSA si AMBAS son Falsas (F \lor F = F).** En cualquier otro caso es V. |
| **Disyunción Fuerte** | p \vartriangle q | "o... o..." | **Es VERDADERA si tienen valores DIFERENTES.** Si tienen valores iguales es F. |
| **Condicional** | p \to q | "si... entonces" | **Solo es FALSA cuando el antecedente es V y el consecuente es F (V \to F = F).** |
| **Bicondicional** | p \leftrightarrow q | "si y solo si" | **Es VERDADERA cuando AMBOS tienen IGUAL valor de verdad (V \leftrightarrow V = V, F \leftrightarrow F = V).** |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Detección Instantánea de Proposiciones en Listas de Opciones (Examen UNSA)
Aplica el **Filtro de Tres Preguntas**:
1. ¿Es una orden, una pregunta o un deseo? \to Si es SÍ, **DESCÁRTALA** (No es proposición).
2. ¿Tiene variables sin definir (x, y, "Él", "Ella")? \to Si es SÍ, es **ENUNCIADO ABIERTO**, no es proposición.
3. ¿Afirma un hecho objetivo verificable en la realidad o en la lógica formal? \to Si es SÍ, **ES PROPOSICIÓN LÓGICA**.

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para el Condicional ("V-F-F")
> **"VERDADERO ENTONCES FALSO ES FALSÍSIMO"**  
> (O la regla del *"Verano Feliz = Fiasco"*):
> V \to F \equiv \mathbf{F}
> En todos los demás casos (V \to V, F \to V, F \to F), el condicional es **automáticamente VERDADERO**.

### Mnemotecnia 2: Identificar Proposiciones Relacionales
> **"LA PRUEBA DEL CORTE"**  
> Si tienes una oración con "y" (ej. *"Ana y Beto son novios"*):
> 1. Corta la oración en dos: "¿Ana es novia?" / "¿Beto es novio?".
> 2. Si las oraciones cortadas **pierden su sentido original**, la proposición es **SIMPLE RELACIONAL**, ¡no es compuesta!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Las expresiones matemáticas con incógnitas:**
   * "x + 2 = 8" \implies **Enunciado Abierto** (NO es proposición).
   * "\forall x \in \mathbb{R}: x + 0 = x" \implies **SÍ ES PROPOSICIÓN** (tiene cuantificador universal y es Verdadera).
   * "3 + 2 = 9" \implies **SÍ ES PROPOSICIÓN** (es una proposición Falsa).
2. ⚠️ **El conector "pero", "sin embargo" y "aunque":**
   * En el lenguaje cotidiano indican contraste; pero en la lógica formal son **rigurosamente equivalentes a una conjunción (\land)**.
   * "Estudió mucho pero no ingresó" \equiv p \land \sim q.
3. ⚠️ **La negación externa que afecta a todo un bloque:**
   * "Es falso que Pedro trabaje y estudie" \equiv \sim(p \land q) \equiv \sim p \lor \sim q (Ley de De Morgan).
   * Muchos alumnos escriben erróneamente \sim p \land q.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Arquitectura de Compuertas Lógicas y Circuitos Digitales
En la ingeniería mecatrónica y de sistemas de la UNSA, todo procesador digital se fundamenta en proposiciones lógicas:
* El bit 1 representa el valor Verdadero (V).
* El bit 0 representa el valor Falso (F).
* Los conectores son compuertas físicas de transistores:
  - \land \implies \text{Compuerta AND} (circuito en serie).
  - \lor \implies \text{Compuerta OR} (circuito en paralelo).
  - \sim \implies \text{Compuerta NOT} (inversor lógico).
* La lógica proposicional es la base matemática sobre la que operan todos los chips de computadoras, smartphones y satélites modernos.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t01_s02_c01",
                    question = "Formalice la siguiente expresión del lenguaje natural:",
                    options = listOf(
                        "\\sim(p \\land \\sim q \\to r) \\lor s",
                        "\\sim[(p \\land q) \\to r] \\land s",
                        "(p \\land \\sim q) \\to (r \\lor s)",
                        "\\sim(p \\lor \\sim q) \\to (r \\land s)"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t01_s02_c02",
                    question = "Considere las siguientes dos afirmaciones escritas en una pizarra de la Facultad de Ciencias:",
                    options = listOf(
                        "P es V y Q es F",
                        "P es F y Q es V",
                        "Ambas son V",
                        "Ambas son F"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t01_s02_c03",
                    question = "¿A qué operador lógico corresponden en el lenguaje ordinario las palabras \"pero\", \"sin embargo\" y \"aunque\"?",
                    options = listOf(
                        "La inclusiva permite que ambas sean verdaderas a la vez; la exclusiva exige que una y solo una sea verdadera (V \\vartriangle V = F).",
                        "Valor o condición no aplicable al caso planteado",
                        "Corresponden rigurosamente a una **conjunción (\\land)**.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Corresponden rigurosamente a una **conjunción (\\land)**."
                ),
                Challenge(
                    id = "rl_t01_s02_c04",
                    question = "¿Cuál es la diferencia entre una disyunción inclusiva (\\lor) y una exclusiva (\\vartriangle)?",
                    options = listOf(
                        "Corresponden rigurosamente a una **conjunción (\\land)**.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "La inclusiva permite que ambas sean verdaderas a la vez; la exclusiva exige que una y solo una sea verdadera (V \\vartriangle V = F)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: La inclusiva permite que ambas sean verdaderas a la vez; la exclusiva exige que una y solo una sea verdadera (V \\vartriangle V = F)."
                ),
                Challenge(
                    id = "rl_t01_s02_c05",
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
                    id = "rl_t01_s02_c06",
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
                    id = "rl_t01_s02_c07",
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
                    id = "rl_t01_s02_c08",
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
                    id = "rl_t01_s02_c09",
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
                    id = "rl_t01_s02_c10",
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
