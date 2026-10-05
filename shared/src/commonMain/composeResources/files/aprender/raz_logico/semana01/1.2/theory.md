## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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
