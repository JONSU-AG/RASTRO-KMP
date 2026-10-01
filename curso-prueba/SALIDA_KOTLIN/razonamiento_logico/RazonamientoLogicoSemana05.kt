package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t05_s01",
            title = "SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Estructura del silogismo categórico (premisa mayor, premisa menor, conclusión), identificación de términos (Mayor, Menor, Medio) y diagramas de Venn de clases. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: razonamientos en lenguaje cotidiano con cuantificadores existenciales y universales implícitos, silogismos jurídicos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Modos y figuras válidas del silogismo (Bárbara, Celarent, Darii, Ferio...), leyes de distribución y falacias formales de silogismo. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar la estructura interna de razonamientos deductivos tipo silogismo: Premisa Mayor (P), Premisa Menor (S) y Término Medio (M).
2. Determinar la validez o invalidez formal de un silogismo simple mediante diagramas de clases (Venn) y reglas aristotélicas.
3. Identificar el Término Medio (M) reconociendo que este jamás debe figurar en la conclusión.
4. Detectar errores y falacias formales de razonamiento deductivo: término medio no distribuido, falacia de cuatro términos, premisas particulares o negativas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Universal Afirmativa (A: Todo S es P -> S n P' = vacío)
        ┌─ 1. Proposiciones ───┼─ Universal Negativa (E: Ningún S es P -> S n P = vacío)
        │      Categóricas     ├─ Particular Afirmativa (I: Algún S es P -> S n P =/= vacío)
        │      (A, E, I, O)    └─ Particular Negativa (O: Algún S no es P -> S n P' =/= vacío)
        │
SILOGISMOS                     ┌─ Término Mayor (P: Predicado de la conclusión)
Y RAZONAMIENTO ─┼─ 2. Estructura del ──┼─ Término Menor (S: Sujeto de la conclusión)
DEDUCTIVO       │      Silogismo       ├─ Término Medio (M: Conecta las premisas, NO va en conclusión)
        │                      └─ Premisa Mayor (contiene P) y Premisa Menor (contiene S)
        │
        │                      ┌─ Regla del Término Medio (Debe estar distribuido al menos una vez)
        ├─ 3. Reglas de ───────┼─ Regla de Negatividad (De dos premisas negativas NADA se concluye)
        │      Validez         ├─ Regla de Particularidad (De dos premisas particulares NADA se concluye)
        │                      └─ La Conclusión sigue siempre a la parte más débil (Negativa / Particular)
        │
        └─ 4. Métodos de ──────┌─ Método de Diagramas de Venn de Tres Conjuntos (S, P, M)
               Validación      └─ Las 4 Figuras del Silogismo Tradicional (M-P, P-M, etc.)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Proposiciones Categóricas Típicas (El Cuadro de Boole)
Aristóteles clasificó los juicios categóricos en cuatro formas canónicas identificadas por las vocales latinas **A, E, I, O**:

| Tipo | Denominación Clásica | Estructura | Cuantificador | Diagrama Booleano | Representación Venn |
| :---: | :--- | :--- | :---: | :---: | :---: |
| **A** | **Universal Afirmativa** | "Todo S es P" | Universal | S \cap \bar{P} = \emptyset | Zona de S fuera de P sombreada (vacía) |
| **E** | **Universal Negativa** | "Ningún S es P" | Universal | S \cap P = \emptyset | Zona de intersección S \cap P sombreada |
| **I** | **Particular Afirmativa** | "Algún S es P" | Existencial | S \cap P \neq \emptyset | Una "\times" en la intersección S \cap P |
| **O** | **Particular Negativa** | "Algún S no es P" | Existencial | S \cap \bar{P} \neq \emptyset | Una "\times" en la zona de S fuera de P |

* *Mnemotecnia latina:* **A**ff**I**rmo (A, I: Afirmativas) y n**E**g**O** (E, O: Negativas).

---

### 3.2 Distribución de Términos
Un término está **distribuido** en una proposición cuando dicha proposición se refiere a la **totalidad absoluta** de los elementos de la clase:
* En **A** (Todo S es P): El **Sujeto (S)** está distribuido.
* En **E** (Ningún S es P): **Ambos (S y P)** están distribuidos.
* En **I** (Algún S es P): **Ningún** término está distribuido.
* En **O** (Algún S no es P): El **Predicado (P)** está distribuido.

---

### 3.3 Estructura Formal del Silogismo Categórico
Un silogismo categórico estándar está compuesto rigurosamente por **tres proposiciones categóricas** que contienen exactamente **tres términos distintos**, cada uno de los cuales aparece en exactamente dos proposiciones.

\begin{array}{rll}
\text{Premisa Mayor:} & M - P \quad (\text{contiene al Término Medio y al Mayor}) \\

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE FIGURAS Y DIAGRAMAS DE VENN

### Las 4 Figuras Clásicas del Silogismo (Posición del Término Medio M)

\begin{array}{c|c|c|c}
\text{1.ª FIGURA} & \text{2.ª FIGURA} & \text{3.ª FIGURA} & \text{4.ª FIGURA} \\
\hline
M - P & P - M & M - P & P - M \\
S - M & S - M & M - S & M - S \\
\hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t05_s01_c01",
                    question = "Dado el siguiente silogismo:",
                    options = listOf(
                        "Delfines",
                        "Vertebrados",
                        "Mamíferos",
                        "Animales"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t05_s01_c02",
                    question = "Dadas las siguientes premisas:",
                    options = listOf(
                        "Algunos cocodrilos tienen respiración branquial.",
                        "Ningún cocodrilo tiene respiración branquial.",
                        "Todos los reptiles son cocodrilos.",
                        "Ningún animal branquial es vertebrado."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t05_s01_c03",
                    question = "En una investigación de campo en el Cañón del Colca se determinó que:",
                    options = listOf(
                        "Todos los guías turísticos son personas cultas.",
                        "Algunos guías turísticos son personas cultas.",
                        "Ningún guía turístico es persona culta.",
                        "Todas las personas cultas son guías turísticos."
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t05_s01_c04",
                    question = "¿Qué término del silogismo jamás debe aparecer en la conclusión?",
                    options = listOf(
                        "**Nada**; de dos premisas negativas no se deriva ninguna conclusión válida.",
                        "Están distribuidos **ambos términos** (tanto el Sujeto como el Predicado).",
                        "Valor o condición no aplicable al caso planteado",
                        "El **Término Medio (M)**."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: El **Término Medio (M)**."
                ),
                Challenge(
                    id = "rl_t05_s01_c05",
                    question = "¿Qué se puede concluir válidamente a partir de dos premisas negativas?",
                    options = listOf(
                        "**Nada**; de dos premisas negativas no se deriva ninguna conclusión válida.",
                        "El **Término Medio (M)**.",
                        "Están distribuidos **ambos términos** (tanto el Sujeto como el Predicado).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: **Nada**; de dos premisas negativas no se deriva ninguna conclusión válida."
                ),
                Challenge(
                    id = "rl_t05_s01_c06",
                    question = "¿Qué términos están distribuidos en una proposición universal negativa (E: \"Ningún S es P\")?",
                    options = listOf(
                        "El **Término Medio (M)**.",
                        "Están distribuidos **ambos términos** (tanto el Sujeto como el Predicado).",
                        "**Nada**; de dos premisas negativas no se deriva ninguna conclusión válida.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: Están distribuidos **ambos términos** (tanto el Sujeto como el Predicado)."
                ),
                Challenge(
                    id = "rl_t05_s01_c07",
                    question = "Premisas: Ningún reptil respira por branquias. Todos los cocodrilos son reptiles. ¿Qué se concluye válidamente?",
                    options = listOf(
                        "Todos los reptiles son cocodrilos",
                        "Ningún cocodrilo respira por branquias",
                        "Algunos cocodrilos respiran por branquias",
                        "Ningún reptil es cocodrilo"
                    ),
                    correctIndex = 1,
                    explanation = "Silogismo válido Celarent (EAE de 1.ª figura): Ningún M es P y Todo S es M concluye forzosamente Ningún S es P ('Ningún cocodrilo respira por branquias')."
                ),
                Challenge(
                    id = "rl_t05_s01_c08",
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
                    id = "rl_t05_s01_c09",
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
                    id = "rl_t05_s01_c10",
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
            id = "rl_t05_s02",
            title = "SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
\text{Premisa Menor:} & S - M \quad (\text{contiene al Término Menor y al Medio}) \\
\hline
\therefore \text{Conclusión:} & \mathbf{S - P} \quad (\text{El Término Medio } M \text{ DESAPARECE})
\end{array}

* **Término Mayor (P):** Predicado de la conclusión.
* **Término Menor (S):** Sujeto de la conclusión.
* **Término Medio (M):** Elemento conector que aparece en ambas premisas y **JAMÁS debe aparecer en la conclusión**.

---

### 3.4 Las 8 Leyes Aristotélicas de Validez del Silogismo

#### Leyes de los Términos:
1. Todo silogismo categórico debe tener únicamente **tres términos**: Mayor, Menor y Medio. *(Incurrir en cuatro términos es la Falacia de Cuatro Términos).*
2. El **Término Medio (M)** debe estar distribuido **al menos una vez** en las premisas.
3. Ningún término puede tener mayor extensión en la conclusión que en las premisas *(Falacia de Ilícito Mayor o Ilícito Menor)*.
4. El Término Medio **nunca debe pasar a la conclusión**.

#### Leyes de las Premisas:
5. De dos premisas negativas (\text{E, O}) **nada se concluye válidamente**.
6. De dos premisas particulares (\text{I, O}) **nada se concluye válidamente**.
7. De dos premisas afirmativas no se puede extraer una conclusión negativa.
8. **La conclusión siempre sigue a la premisa más débil:**
   * Si hay una premisa negativa, la conclusión debe ser negativa.
   * Si hay una premisa particular, la conclusión debe ser particular.
   * La jerarquía de debilidad es: Particular Negativa (O) > Particular Afirmativa (I) o Universal Negativa (E) > Universal Afirmativa (A).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
S - P & S - P & S - P & S - P \\
(\text{M sube en diagonal}) & (\text{M a la derecha}) & (\text{M a la izquierda}) & (\text{M baja en diagonal})
\end{array}

#### Modos Válidos Memorables (Mnemotecnia Medieval de Nombres):
* **1.ª Figura:** B**A**RB**A**R**A** (AAA), C**E**L**A**R**E**NT (EAE), D**A**R**II** (AII), F**E**R**IO** (EIO).
* **2.ª Figura:** C**E**S**A**R**E** (EAE), C**A**M**E**STR**E**S (AEE), F**E**ST**I**N**O** (EIO), B**A**R**O**C**O** (AOO).
* **3.ª Figura:** D**A**R**A**PT**I** (AAI), D**I**S**A**M**I**S (IAI), D**A**T**I**S**I** (AII), F**E**L**A**PT**O**N (EAO), B**O**C**A**RD**O** (OAO), F**E**R**I**S**O** (EIO).

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Diagrama de Venn de 3 Anillos Superpuestos
Para resolver cualquier silogismo en la UNSA sin memorizar nombres medievales:
1. Dibuja 3 círculos entrelazados: S (abajo izq.), P (abajo der.) y M (arriba).
2. **Grafica PRIMERO las premisas universales (A, E)**: Sombrea las regiones vacías.
3. **Grafica al final las particulares (I, O)**: Coloca una "\times". Si la "\times" puede ir en dos zonas, ponla sobre la línea divisoria.
4. **Tapa con la mano el círculo M**:
   - Observa únicamente los círculos S y P.
   - Lo que se lee directamente entre S y P es la **CONCLUSIÓN INFALIBLE**.

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL HILO CONDUCTOR QUE SE CORTA"
> El Término Medio (M) es como un fósforo o puente colgante:
> **"Une a S con P y se quema (desaparece)"**.  
> Si ves una alternativa en el examen donde el término medio aparece en la conclusión:  
> 👉 **TÁCHALA DE INMEDIATO (Es trampa asegurada).**

### Mnemotecnia 2: La Ley de la "Cuerda Más Débil"
> Si en las premisas ves una palabra como *"Algunos"* o *"Ningún"*:
> **"La conclusión jamás podrá ser 'Todos'"**.  
> La conclusión siempre hereda la debilidad: si una premisa es particular, la conclusión forzosamente será particular ("Algún...").

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Falacia de Término Medio No Distribuido:**
   * Premisa 1: Todos los arequipeños son peruanos (A \to P).
   * Premisa 2: Todos los cusqueños son peruanos (C \to P).
   * Conclusión tramposa: *"Todos los arequipeños son cusqueños"*.
   * **El error:** El término medio ("peruanos") está en el predicado de dos universales afirmativas, por lo que **no está distribuido en ninguna premisa**. No hay conexión lógica entre ellos.
2. ⚠️ **Premisas con negaciones encubiertas:**
   * "Casi ningún médico es impuntual" \equiv "Algún médico no es puntual" (O).
   * No te dejes confundir por palabras coloquiales como "raros", "escasos" o "la mayoría": son cuantificadores particulares existenciales (I, O).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Silogismo Jurídico y Sentencias Judiciales (Derecho UNSA)
En la teoría del Derecho procesal y penal, toda sentencia de un juez penal sigue la estructura de un silogismo subsuntivo:
* **Premisa Mayor (Norma Jurídica General):** El que mediante violencia se apodere de un bien mueble total o parcialmente ajeno será reprimido con pena privativa de la libertad no menor de tres ni mayor de ocho años (Art. 188 Código Penal - Robo agravado).
* **Premisa Menor (Hecho Fáctico Probado en Juicio):** El imputado Carlos se apoderó violentamente del teléfono móvil de la víctima María en la avenida Independencia.
* **Conclusión Silogística (Sentencia Condenatoria):** Por lo tanto, el imputado Carlos debe ser reprimido con pena privativa de la libertad entre tres y ocho años.
* La validez del silogismo garantiza la **seguridad jurídica** y prohíbe la arbitrariedad de los magistrados.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t05_s02_c01",
                    question = "Analice el siguiente razonamiento:",
                    options = listOf(
                        "Falacia de Término Medio No Distribuido",
                        "Falacia de Ilícito Mayor",
                        "Falacia de Ilícito Menor",
                        "Falacia de Premisas Excluyentes"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t05_s02_c02",
                    question = "Dadas las premisas categóricas no estándar:",
                    options = listOf(
                        "Ningún científico es crítico",
                        "Todo científico es crítico",
                        "Algún científico no es crítico",
                        "Todos los críticos son científicos"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rl_t05_s02_c03",
                    question = "Si una de las premisas de un silogismo es particular, ¿cómo debe ser la conclusión?",
                    options = listOf(
                        "La **Falacia del Término Medio No Distribuido**.",
                        "Valor o condición no aplicable al caso planteado",
                        "La conclusión forzosamente debe ser **particular** (la conclusión sigue a la parte más débil).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: La conclusión forzosamente debe ser **particular** (la conclusión sigue a la parte más débil)."
                ),
                Challenge(
                    id = "rl_t05_s02_c04",
                    question = "¿Qué falacia se comete si el Término Medio no está distribuido en ninguna de las dos premisas?",
                    options = listOf(
                        "La conclusión forzosamente debe ser **particular** (la conclusión sigue a la parte más débil).",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "La **Falacia del Término Medio No Distribuido**."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: La **Falacia del Término Medio No Distribuido**."
                ),
                Challenge(
                    id = "rl_t05_s02_c05",
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
                    id = "rl_t05_s02_c06",
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
                    id = "rl_t05_s02_c07",
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
                    id = "rl_t05_s02_c08",
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
                    id = "rl_t05_s02_c09",
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
                    id = "rl_t05_s02_c10",
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
