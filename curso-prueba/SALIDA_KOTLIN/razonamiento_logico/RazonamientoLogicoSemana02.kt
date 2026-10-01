package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t02_s01",
            title = "CONECTORES LÓGICOS Y TABLAS DE VERDAD - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "CONECTORES LÓGICOS Y TABLAS DE VERDAD - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Clasificación de conectores lógicos, tablas de verdad de fórmulas moleculares, tautología / contradicción / contingencia, y conector condicional directo e inverso. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de conectores lógicos en textos legales (Constitución, leyes), contratos y condicionales necesarios vs. suficientes. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Leyes del álgebra proposicional (De Morgan, absorción, transposición), minimización de esquemas moleculares y circuitos de conmutación. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Interpretar el sentido semántico y formal de los conectores: negación, conjunción, disyunción débil y fuerte, condicional y bicondicional.
2. Analizar el impacto determinante del conector sobre el valor de verdad global de un esquema molecular.
3. Reconocer alteraciones semánticas y cambios de sentido al modificar o negar conectores lógicos en un discurso.
4. Construir y evaluar tablas de verdad matrices clasificando el resultado en Tautológico, Contradictorio o Contingente.
5. Aplicar leyes lógicas fundamentales para simplificar expresiones proposicionales extensas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Conector Monádico (Afecta a una sola variable: Negación ~)
        ┌─ 1. Tipología de ────┴─ Conectores Diádicos (Enlazan dos variables proposicionales)
        │      Conectores
        │
CONECTORES                     ┌─ Conjunción (p ^ q): Nexo copulativo
LÓGICOS Y ──────┼─ 2. Los Seis ────────┼─ Disyunción Débil (p v q) y Disyunción Fuerte (p Delta q)
TABLAS          │      Operadores      ├─ Condicional Directo (p -> q) e Inverso (q <- p)
DE VERDAD       │      Canónicos       ├─ Bicondicional (p <-> q)
        │                      └─ Barra de Sheffer (~(p ^ q)) y Flecha de Peirce (~(p v q))
        │
        │                      ┌─ Matriz Principal y Número de Filas: 2^n
        ├─ 3. Evaluación de ───┼─ Tautología (Todo Verdadero)
        │      Esquemas        ├─ Contradicción (Todo Falso)
        │                      └─ Contingencia o Consistencia (Valores mixtos V y F)
        │
        └─ 4. Leyes del ───────┌─ Leyes de De Morgan: ~(p ^ q) = ~p v ~q
               Álgebra         ├─ Ley del Condicional: p -> q = ~p v q
               Proposicional   └─ Leyes de Absorción (Claves para simplificación rápida)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Clasificación y Semántica de los Conectores Lógicos

#### A. Conector Monádico: La Negación (\sim, \neg)
Afecta a una sola proposición o a un bloque agrupado entre signos de colección.
* **Operación:** Invierte el valor de verdad: \sim V = F, \sim F = V.
* **Traducciones verbales:** "no", "ni", "es falso que", "no es cierto que", "es inadmisible que", "carece de verdad que".

---

#### B. Conectores Diádicos (Binarios)

1. **La Conjunción (\land, \&):**
   * **Semántica:** Copulativa y simultánea. Exige que ambas condiciones se satisfagan plenamente.
   * **Regla estricta:** Es **VERDADERA** únicamente cuando **ambas componentes son verdaderas**.
   * **Traducciones verbales:** "y", "e", "pero", "sin embargo", "además", "aunque", "a la vez que", "no obstante", "tanto... como...", "también".

2. **La Disyunción Inclusiva o Débil (\lor):**
   * **Semántica:** Opción no excluyente; admite la posibilidad de que ambas proposiciones ocurran simultáneamente.
   * **Regla estricta:** Es **FALSA** únicamente cuando **ambas componentes son falsas**.
   * **Traducciones verbales:** "o", "a menos que", "salvo que", "excepto que", "o en su defecto".

3. **La Disyunción Exclusiva o Fuerte (\vartriangle, \oplus, \not\leftrightarrow):**
   * **Semántica:** Opción mutuamente excluyente; una alternativa descarta por completo a la otra.
   * **Regla estricta:** Es **VERDADERA** cuando los valores de verdad son **DIFERENTES** (V \vartriangle F = V, F \vartriangle V = V). Si son iguales, es falsa (V \vartriangle V = F, F \vartriangle F = F).
   * **Traducciones verbales:** "o bien p o bien q", "ya bien... ya bien...", "o solo p o solo q".

4. **El Condicional Directo (\to):**
   * **Semántica:** Estructura de Causa-Efecto, Antecedente \implies Consecuente.
   * **Regla estricta:** Es **FALSA** únicamente cuando el **antecedente es Verdadero y el consecuente es Falso** (V \to F = F). En todos los demás casos es V.
   * **Traducciones verbales (Antecedente \to Consecuente):**  
     "si p, entonces q", "p por lo tanto q", "p en consecuencia q", "p luego q", "p de ahí que q", "dado que p, q".

5. **El Condicional Inverso (\leftarrow):**
   * **Semántica:** El consecuente aparece al inicio de la oración y el antecedente al final.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE LEYES DEL ÁLGEBRA PROPOSICIONAL

| Nombre de la Ley | Expresión Lógica Equivalente |
| :--- | :--- |
| **Idempotencia** | p \land p \equiv p <br> p \lor p \equiv p |
| **Conmutativa** | p \land q \equiv q \land p <br> p \lor q \equiv q \lor p |
| **Asociativa** | (p \land q) \land r \equiv p \land (q \land r) <br> (p \lor q) \lor r \equiv p \lor (q \lor r) |
| **Distributiva** | p \land (q \lor r) \equiv (p \land q) \lor (p \land r) <br> p \lor (q \land r) \equiv (p \lor q) \land (p \lor r) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t02_s01_c01",
                    question = "Al evaluar la tabla de verdad de la fórmula molecular:",
                    options = listOf(
                        "V, V, F, V",
                        "V, V, F, F",
                        "V, F, V, V",
                        "F, V, V, V"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t02_s01_c02",
                    question = "Formalice correctamente el siguiente enunciado:",
                    options = listOf(
                        "p \\to (q \\land \\sim r)",
                        "(q \\land \\sim r) \\to p",
                        "(q \\to \\sim r) \\to p",
                        "(p \\land q) \\to \\sim r"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t02_s01_c03",
                    question = "Simplifique al máximo el siguiente esquema molecular:",
                    options = listOf(
                        "p",
                        "\\sim p",
                        "q",
                        "\\sim q"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t02_s01_c04",
                    question = "¿A qué equivale la fórmula del condicional p \\to q mediante disyunción?",
                    options = listOf(
                        "Por Ley de De Morgan: \"No llueve O no hace frío\" (\\sim p \\lor \\sim q).",
                        "Tiene 2^3 = 8 filas.",
                        "Valor o condición no aplicable al caso planteado",
                        "Equivale a \\sim p \\lor q (\"Niega al primero O mantén al segundo\")."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Equivale a \\sim p \\lor q (\"Niega al primero O mantén al segundo\")."
                ),
                Challenge(
                    id = "rl_t02_s01_c05",
                    question = "¿Cuál es la negación de la proposición \"Llueve y hace frío\"?",
                    options = listOf(
                        "Por Ley de De Morgan: \"No llueve O no hace frío\" (\\sim p \\lor \\sim q).",
                        "Equivale a \\sim p \\lor q (\"Niega al primero O mantén al segundo\").",
                        "Tiene 2^3 = 8 filas.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Por Ley de De Morgan: \"No llueve O no hace frío\" (\\sim p \\lor \\sim q)."
                ),
                Challenge(
                    id = "rl_t02_s01_c06",
                    question = "¿Cuántas filas tiene la tabla de verdad de una proposición con 3 variables (p, q, r)?",
                    options = listOf(
                        "Equivale a \\sim p \\lor q (\"Niega al primero O mantén al segundo\").",
                        "Tiene 2^3 = 8 filas.",
                        "Por Ley de De Morgan: \"No llueve O no hace frío\" (\\sim p \\lor \\sim q).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Tiene 2^3 = 8 filas."
                ),
                Challenge(
                    id = "rl_t02_s01_c07",
                    question = "Simplifique al máximo el circuito equivalente a: p y [q o (~p o (p y ~q))]. ¿A qué proposición simple equivale?",
                    options = listOf(
                        "p",
                        "q",
                        "~p",
                        "p y q"
                    ),
                    correctIndex = 0,
                    explanation = "Por absorción, ~p o (p y ~q) = ~p o ~q. Luego [q o ~q o ~p] = [V o ~p] = V. Finalmente: p y V = p."
                ),
                Challenge(
                    id = "rl_t02_s01_c08",
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
                    id = "rl_t02_s01_c09",
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
                    id = "rl_t02_s01_c10",
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
            id = "rl_t02_s02",
            title = "CONECTORES LÓGICOS Y TABLAS DE VERDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "CONECTORES LÓGICOS Y TABLAS DE VERDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   * **Regla de traducción:** "p porque q" se formaliza rigurosamente como:
     q \to p
   * **Traducciones verbales (Consecuente \leftarrow Antecedente):**  
     "p puesto que q", "p ya que q", "p porque q", "p siempre que q", "p si q", "p dado que q".

6. **El Bicondicional (\leftrightarrow, \equiv):**
   * **Semántica:** Doble implicación recíproca y equivalencia lógica.
   * **Regla estricta:** Es **VERDADERA** cuando ambas proposiciones tienen el **MISMO valor de verdad** (V \leftrightarrow V = V, F \leftrightarrow F = V).
   * **Traducciones verbales:** "si y solo si", "cuando y solo cuando", "es equivalente a", "es condición necesaria y suficiente para".

---

### 3.2 Construcción y Evaluación de Tablas de Verdad

* **Número de Filas de la Tabla (N):** Para una fórmula proposicional con n variables atómicas distintas:
  N = 2^n
  *(Para 2 variables: 2^2 = 4 filas; para 3 variables: 2^3 = 8 filas; para 4 variables: 2^4 = 16 filas).*

#### Tabla de Verdad de los 5 Conectores Principales:
\begin{array}{|c|c||c|c|c|c|c|}
\hline
p & q & p \land q & p \lor q & p \vartriangle q & p \to q & p \leftrightarrow q \\
\hline
V & V & \mathbf{V} & V & F & V & \mathbf{V} \\
V & F & F & V & \mathbf{V} & \mathbf{F} & F \\
F & V & F & V & \mathbf{V} & V & F \\
F & F & F & \mathbf{F} & F & V & \mathbf{V} \\
\hline
\end{array}

#### Clasificación de la Matriz Principal Resultante:
1. **Tautología:** Todos los valores de la columna del conector principal son **Verdaderos (V)**. Representa una ley lógica universal.
2. **Contradicción:** Todos los valores de la columna principal son **Falsos (F)**.
3. **Contingencia (o Consistencia):** La columna principal contiene **al menos un valor Verdadero y al menos un valor Falso**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Doble Negación** | \sim(\sim p) \equiv p |
| **Leyes de De Morgan** | \sim(p \land q) \equiv \sim p \lor \sim q <br> \sim(p \lor q) \equiv \sim p \land \sim q |
| **Definición del Condicional** | p \to q \equiv \sim p \lor q <br> \sim(p \to q) \equiv p \land \sim q |
| **Transposición (Contrarecíproca)** | p \to q \equiv \sim q \to \sim p |
| **Definición del Bicondicional** | p \leftrightarrow q \equiv (p \to q) \land (q \to p) <br> p \leftrightarrow q \equiv (p \land q) \lor (\sim p \land \sim q) |
| **Leyes de Absorción (Claves UNI/UNSA)** | **Caso 1:** p \land (p \lor q) \equiv p <br> **Caso 2:** p \lor (p \land q) \equiv p <br> **Caso 3:** p \land (\sim p \lor q) \equiv p \land q <br> **Caso 4:** p \lor (\sim p \land q) \equiv p \lor q |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### El Método del Valor Forzado (Evita Construir Tablas de 16 Filas)
Si un problema te dice: *"Sabiendo que el esquema [(p \land \sim q) \to (r \to s)] es FALSO, determine..."*
* **NO construyas la tabla de verdad.**
* Empieza desde el conector principal forzándolo a ser F:
  1. Para que un condicional sea F, el antecedente debe ser V y el consecuente F.
  2. (p \land \sim q) = V \implies p = V, q = F.
  3. (r \to s) = F \implies r = V, s = F.
* Obtienes los 4 valores de golpe en 15 segundos sin usar papel adicional.

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL CONDICIONAL ES UN NO AL PRIMERO O EL SEGUNDO"
> La ley más preguntada de toda la lógica preuniversitaria:
> p \to q \equiv \mathbf{\sim p \lor q}
> **"Niega al primero O mantén al segundo"**.  
> *Ejemplo:* "Si estudias, ingresas" es exactamente lo mismo que decir: "No estudias o ingresas".

### Mnemotecnia 2: La Absorción de Signos Opuestos
> En p \lor (\sim p \land q):
> **"El de afuera (p) se come al opuesto (\sim p) y se queda con el amigo (q)"**:
> p \lor (\sim p \land q) \equiv \mathbf{p \lor q}
> Te permite simplificar expresiones monstruosas de examen en 5 segundos.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La trampa del Condicional Inverso ("porque", "ya que"):**
   * *"Ingresas a la UNSA porque estudias a conciencia"*.
   * **El error clásico:** Formalizar p \to q.
   * **Lo correcto:** Como "estudias a conciencia" es la CAUSA, esa proposición es el antecedente: q \to p.
2. ⚠️ **Negación de la condicional:**
   * La negación de "Si trabajas, ganas dinero" **NO es** "Si trabajas, no ganas dinero".
   * La negación formal es: **"Trabajas y no ganas dinero"** (\sim(p \to q) \equiv p \land \sim q).
3. ⚠️ **La diferencia entre Disyunción Débil y Fuerte:**
   * "Viajo a Lima por avión o por carretera" \implies Disyunción exclusiva (\vartriangle), porque físicamente no puedes viajar en ambos medios simultáneamente en el mismo trayecto.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Condicionales en la Lógica Jurídica y Constitucional (Derecho UNSA)
El artículo 2.°, inciso 24, literal f de la Constitución Política del Perú establece:
*"Nadie puede ser detenido sino por mandamiento escrito y motivado del juez o por las autoridades policiales en caso de flagrante delito."*
* Formalización lógica:
  - p: Una persona es detenida.
  - q: Existe mandamiento escrito y motivado del juez.
  - r: Existe flagrante delito.
* Estructura normativa de garantía constitucional:
  p \to (q \lor r)
* Por la ley contrarecíproca (\sim(q \lor r) \to \sim p \equiv (\sim q \land \sim r) \to \sim p):  
  Si no hay orden judicial Y no hay flagrancia, entonces la detención es **absolutamente ilegal y arbitraria**. La lógica rige el Habeas Corpus.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t02_s02_c01",
                    question = "Reduzca a su forma canónica más simple la proposición compuesta:",
                    options = listOf(
                        "p \\lor q",
                        "p \\land q",
                        "p",
                        "q"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t02_s02_c02",
                    question = "El siguiente circuito eléctrico está compuesto por interruptores controlados por las proposiciones p, q y r:",
                    options = listOf(
                        "S/.\\, 50 (1 solo interruptor)",
                        "S/.\\, 100 (2 interruptores)",
                        "S/.\\, 150 (3 interruptores)",
                        "S/.\\, 0 (El circuito es siempre cerrado / cable directo)"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t02_s02_c03",
                    question = "Si la matriz principal de una tabla de verdad tiene solo valores Verdaderos, ¿cómo se clasifica?",
                    options = listOf(
                        "Es un condicional inverso: q \\to p (\"Tiene vacaciones \\implies Pedro viaja\").",
                        "Valor o condición no aplicable al caso planteado",
                        "Se clasifica como una **Tautología**.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Se clasifica como una **Tautología**."
                ),
                Challenge(
                    id = "rl_t02_s02_c04",
                    question = "¿Cómo se formaliza el enunciado \"Pedro viaja porque tiene vacaciones\"?",
                    options = listOf(
                        "Se clasifica como una **Tautología**.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Es un condicional inverso: q \\to p (\"Tiene vacaciones \\implies Pedro viaja\")."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Es un condicional inverso: q \\to p (\"Tiene vacaciones \\implies Pedro viaja\")."
                ),
                Challenge(
                    id = "rl_t02_s02_c05",
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
                    id = "rl_t02_s02_c06",
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
                    id = "rl_t02_s02_c07",
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
                    id = "rl_t02_s02_c08",
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
                    id = "rl_t02_s02_c09",
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
                    id = "rl_t02_s02_c10",
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
