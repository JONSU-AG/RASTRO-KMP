# TEMA 01 · PROPOSICIONES Y ENUNCIADOS LÓGICOS
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Lógico  
**Código del Tema:** `APT_RL_01`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO verdad empírica vs. verdad formal] [UNI: Lógica proposicional rigurosa, enunciados abiertos y paradojas]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Clasificación de enunciados (proposición, enunciado abierto, no proposicional), distinción de proposiciones simples y compuestas, valores de verdad en contextos fácticos. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de discursos argumentativos, declaraciones científicas e históricas, detección de enunciados con sentido o sin sentido. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Formalización estricta en lenguaje formal ($\mathcal{L}$), cuantificadores universales/existenciales implícitos, paradojas autorreferenciales clásicas (Russell, Epiménides). | Avanzado | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar proposiciones lógicas distinguiéndolas con precisión de oraciones no proposicionales.
2. Determinar y discriminar valores de verdad (Verdadero $V$ o Falso $F$) según el contexto fáctico o formal dado.
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

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 El Enunciado y sus Categorías Epistemológicas
* **Enunciado:** Toda frase, oración o expresión lingüística emitida mediante el lenguaje verbal o escrito.
* **Proposición Lógica:** Es un enunciado aseverativo (afirmativo o negativo) susceptible de ser calificado unívocamente como **Verdadero ($V$)** o **Falso ($F$)**, pero nunca ambos a la vez. Posee un significado objetivo e invariable.
  * *Ejemplo Verdadero:* "Arequipa es la capital del departamento homónimo". ($V$)
  * *Ejemplo Falso:* "$2^3 + 3^2 = 25$". ($F$, pues $8 + 9 = 17 \neq 25$).

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
8. **Paradojas Lógicas Autorreferenciales:** "Esta afirmación que estoy escribiendo es falsa" (Si es verdadera, es falsa; si es falsa, es verdadera $\implies$ Indecidible).

---

### 3.3 Enunciado Abierto (Función Proposicional)
Es un enunciado que contiene una o más variables libres y que no puede ser calificado como $V$ o $F$ **hasta que la variable no sea reemplazada por una constante específica del universo**:
* *Ejemplo 1:* "$x + 5 = 12$" (Es un enunciado abierto).
  - Si $x = 7 \implies 7 + 5 = 12$ ($V$, se transforma en proposición).
  - Si $x = 3 \implies 3 + 5 = 12$ ($F$, se transforma en proposición).
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
   * "7 es menor que 15" ($7 < 15$).
   * "Mario y Andrea son hermanos consanguíneos". *(¡Ojo: no se puede partir en 'Mario es hermano' y 'Andrea es hermana')*.

#### B. Proposiciones Compuestas (Moleculares o Coligativas)
Resultan de la unión de dos o más proposiciones simples mediante conectores lógicos, o de la alteración de una proposición simple mediante la negación.
* **Conjuntiva ($p \land q$):** Une dos ideas simultáneas ("y", "pero", "sin embargo", "aunque", "además").
* **Disyuntiva Inclusiva ($p \lor q$):** Al menos una es verdadera ("o").
* **Disyuntiva Exclusiva ($p \vartriangle q$):** Una y solo una es verdadera ("o bien $p$ o bien $q$").
* **Condicional ($p \to q$):** Causa-Efecto ("si... entonces...", "por lo tanto", "en consecuencia").
* **Bicondicional ($p \leftrightarrow q$):** Equivalencia ("si y solo si", "cuando y solo cuando").
* **Negativa ($\sim p$):** Invierte el valor de verdad ("no", "es falso que", "no es cierto que").

---

## 4. 📐 FORMULARIO MAESTRO DE OPERADORES Y VALORES DE VERDAD

| Operación Lógica | Símbolo | Conector Clave | Regla de Oro Preuniversitaria |
| :--- | :---: | :---: | :--- |
| **Negación** | $\sim p$ | "no", "es falso que" | Invierte el valor: $\sim V = F$, $\sim F = V$. |
| **Conjunción** | $p \land q$ | "y", "pero", "además" | **Solo es VERDADERA si AMBAS son Verdaderas ($V \land V = V$).** En cualquier otro caso es $F$. |
| **Disyunción Débil** | $p \lor q$ | "o" | **Solo es FALSA si AMBAS son Falsas ($F \lor F = F$).** En cualquier otro caso es $V$. |
| **Disyunción Fuerte** | $p \vartriangle q$ | "o... o..." | **Es VERDADERA si tienen valores DIFERENTES.** Si tienen valores iguales es $F$. |
| **Condicional** | $p \to q$ | "si... entonces" | **Solo es FALSA cuando el antecedente es $V$ y el consecuente es $F$ ($V \to F = F$).** |
| **Bicondicional** | $p \leftrightarrow q$ | "si y solo si" | **Es VERDADERA cuando AMBOS tienen IGUAL valor de verdad ($V \leftrightarrow V = V$, $F \leftrightarrow F = V$).** |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para el Condicional ("V-F-F")
> **"VERDADERO ENTONCES FALSO ES FALSÍSIMO"**  
> (O la regla del *"Verano Feliz = Fiasco"*):
> $$V \to F \equiv \mathbf{F}$$
> En todos los demás casos ($V \to V$, $F \to V$, $F \to F$), el condicional es **automáticamente VERDADERO**.

### Mnemotecnia 2: Identificar Proposiciones Relacionales
> **"LA PRUEBA DEL CORTE"**  
> Si tienes una oración con "y" (ej. *"Ana y Beto son novios"*):
> 1. Corta la oración en dos: "¿Ana es novia?" / "¿Beto es novio?".
> 2. Si las oraciones cortadas **pierden su sentido original**, la proposición es **SIMPLE RELACIONAL**, ¡no es compuesta!

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Detección Instantánea de Proposiciones en Listas de Opciones (Examen UNSA)
Aplica el **Filtro de Tres Preguntas**:
1. ¿Es una orden, una pregunta o un deseo? $\to$ Si es SÍ, **DESCÁRTALA** (No es proposición).
2. ¿Tiene variables sin definir ($x$, $y$, "Él", "Ella")? $\to$ Si es SÍ, es **ENUNCIADO ABIERTO**, no es proposición.
3. ¿Afirma un hecho objetivo verificable en la realidad o en la lógica formal? $\to$ Si es SÍ, **ES PROPOSICIÓN LÓGICA**.

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Las expresiones matemáticas con incógnitas:**
   * "$x + 2 = 8$" $\implies$ **Enunciado Abierto** (NO es proposición).
   * "$\forall x \in \mathbb{R}: x + 0 = x$" $\implies$ **SÍ ES PROPOSICIÓN** (tiene cuantificador universal y es Verdadera).
   * "$3 + 2 = 9$" $\implies$ **SÍ ES PROPOSICIÓN** (es una proposición Falsa).
2. ⚠️ **El conector "pero", "sin embargo" y "aunque":**
   * En el lenguaje cotidiano indican contraste; pero en la lógica formal son **rigurosamente equivalentes a una conjunción ($\land$)**.
   * "Estudió mucho pero no ingresó" $\equiv p \land \sim q$.
3. ⚠️ **La negación externa que afecta a todo un bloque:**
   * "Es falso que Pedro trabaje y estudie" $\equiv \sim(p \land q) \equiv \sim p \lor \sim q$ (Ley de De Morgan).
   * Muchos alumnos escriben erróneamente $\sim p \land q$.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Arquitectura de Compuertas Lógicas y Circuitos Digitales
En la ingeniería mecatrónica y de sistemas de la UNSA, todo procesador digital se fundamenta en proposiciones lógicas:
* El bit $1$ representa el valor Verdadero ($V$).
* El bit $0$ representa el valor Falso ($F$).
* Los conectores son compuertas físicas de transistores:
  - $\land \implies \text{Compuerta AND}$ (circuito en serie).
  - $\lor \implies \text{Compuerta OR}$ (circuito en paralelo).
  - $\sim \implies \text{Compuerta NOT}$ (inversor lógico).
* La lógica proposicional es la base matemática sobre la que operan todos los chips de computadoras, smartphones y satélites modernos.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Identificación de Proposiciones)
De los siguientes enunciados:
1. El volcán Misti se encuentra en el departamento de Arequipa.
2. ¿Cuál es el puntaje mínimo para ingresar a Medicina?
3. ¡Viva la Universidad Nacional de San Agustín!
4. $x^2 - 1 = 8$
5. La suma de los ángulos interiores de todo triángulo euclidiano es $180^\circ$.
¿Cuáles son proposiciones lógicas?
A) 1 y 4  
B) 1 y 5  
C) 1, 2 y 5  
D) 2 y 3  
E) Todas  

**Solución Paso a Paso:**
1. Analizamos cada expresión:
   - (1): "El volcán Misti se encuentra en Arequipa" es un enunciado aseverativo que puede calificarse como Verdadero ($V$). $\implies$ **SÍ es proposición**.
   - (2): Es una oración interrogativa. $\implies$ **NO es proposición**.
   - (3): Es una oración exclamativa/emotiva. $\implies$ **NO es proposición**.
   - (4): "$x^2 - 1 = 8$" contiene una variable libre $x$ sin cuantificar. Es un enunciado abierto. $\implies$ **NO es proposición**.
   - (5): "La suma de los ángulos interiores de todo triángulo es $180^\circ$" es un teorema matemático aseverativo Verdadero ($V$). $\implies$ **SÍ es proposición**.
2. Por lo tanto, únicamente son proposiciones lógicas las expresiones **1 y 5**.  
**Clave: B**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Clasificación Simple vs. Compuesta)
Identifique cuál de las siguientes proposiciones es clasificada como **compuesta**:
A) Mario Vargas Llosa nació en la ciudad de Arequipa.  
B) 13 y 17 son números primos coprimos entre sí.  
C) Lima y Callao son ciudades limítrofes.  
D) Arequipa es una ciudad volcánica o colonial.  
E) La Tierra gira alrededor del Sol describiendo una órbita elíptica.  

**Solución Paso a Paso:**
1. Analizamos la estructura sintáctica y semántica de cada opción:
   - A) Atribuye un solo predicado a un sujeto singular $\implies$ Simple predicativa.
   - B) Establece una relación simétrica entre dos números que no se puede independizar $\implies$ Simple relacional.
   - C) "Limítrofes" es un predicado que exige dos sujetos en relación espacial indisociable $\implies$ Simple relacional.
   - D) "Arequipa es una ciudad volcánica **o** colonial" contiene el conector disyuntivo "o". Enlaza dos proposiciones simples: ($p$: Arequipa es ciudad volcánica) $\lor$ ($q$: Arequipa es ciudad colonial) $\implies$ **COMPUESTA DISYUNTIVA**.
   - E) Atribuye una sola acción astronómica al planeta Tierra $\implies$ Simple predicativa.  
**Clave: D**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Valores de Verdad Contextualizados)
Se sabe que la proposición molecular:
$$(p \land \sim q) \to (r \lor \sim s)$$
es **FALSA**. Determine el valor de verdad de las proposiciones $p$, $q$, $r$ y $s$ en ese orden estricto.
A) $V, F, F, V$  
B) $V, V, F, F$  
C) $F, V, V, F$  
D) $V, F, V, F$  
E) $F, F, F, V$  

**Solución Paso a Paso:**
1. El conector principal de la proposición es el **condicional ($\to$)**:
   $$\underbrace{(p \land \sim q)}_{\text{Antecedente}} \to \underbrace{(r \lor \sim s)}_{\text{Consecuente}} \equiv \mathbf{F}$$
2. Por la regla fundamental del condicional, para que sea Falso, el antecedente debe ser **VERDADERO** y el consecuente debe ser **FALSO**:
   - Antecedente: $p \land \sim q \equiv \mathbf{V}$
   - Consecuente: $r \lor \sim s \equiv \mathbf{F}$
3. Analizamos el antecedente ($p \land \sim q \equiv V$):
   - Una conjunción solo es verdadera si ambos miembros son verdaderos:
     $$p \equiv \mathbf{V}$$
     $$\sim q \equiv V \implies q \equiv \mathbf{F}$$
4. Analizamos el consecuente ($r \lor \sim s \equiv F$):
   - Una disyunción solo es falsa si ambos miembros son falsos:
     $$r \equiv \mathbf{F}$$
     $$\sim s \equiv F \implies s \equiv \mathbf{V}$$
5. Los valores de verdad ordenados $(p, q, r, s)$ son:
   $$\mathbf{V, F, F, V}$$.  
**Clave: A**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Formalización de Discursos)
Formalice la siguiente expresión del lenguaje natural:  
*"No es verdad que si llueve en Arequipa y no llevas paraguas, te enfermes; a menos que tus defensas biológicas estén bajas."*  
Donde:  
$p$: Llueve en Arequipa.  
$q$: Llevas paraguas.  
$r$: Te enfermas.  
$s$: Tus defensas biológicas están bajas.  
A) $\sim(p \land \sim q \to r) \lor s$  
B) $\sim[(p \land q) \to r] \land s$  
C) $(p \land \sim q) \to (r \lor s)$  
D) $\sim(p \lor \sim q) \to (r \land s)$  
E) $\sim(p \land \sim q \to r) \land \sim s$  

**Solución Paso a Paso:**
1. Desglosamos por operadores lógicos:
   - "Llueve en Arequipa y no llevas paraguas": $(p \land \sim q)$.
   - "si llueve en Arequipa y no llevas paraguas, te enfermes": $(p \land \sim q) \to r$.
   - "No es verdad que...": niega todo el condicional precedente: $\sim[(p \land \sim q) \to r]$.
   - "...a menos que...": es un conector equivalente a la **disyunción inclusiva ($\lor$)**.
   - "...tus defensas biológicas estén bajas": $s$.
2. Estructura formalizada completa:
   $$\sim(p \land \sim q \to r) \lor s$$.  
**Clave: A**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Paradoja y Condición Metalógica)
Considere las siguientes dos afirmaciones escritas en una pizarra de la Facultad de Ciencias:
- Afirmación $P$: "Al menos una de las afirmaciones $P$ o $Q$ es falsa".
- Afirmación $Q$: "La afirmación $P$ es verdadera si y solo si $2 + 2 = 5$".
Determine de manera rigurosa y analítica el valor de verdad bivalente de la afirmación $P$ y de la afirmación $Q$.
A) $P$ es $V$ y $Q$ es $F$  
B) $P$ es $F$ y $Q$ es $V$  
C) Ambas son $V$  
D) Ambas son $F$  
E) Es un sistema paradójico que no admite asignación bivalente consistente  

**Solución Paso a Paso:**
1. Formalicemos las relaciones metalógicas:
   - $P \equiv (\sim P \lor \sim Q)$.
   - $Q \equiv (P \leftrightarrow \text{FALSO})$, ya que $2 + 2 = 5$ es una proposición aritmética Falsa ($F$).
   - Por propiedad bicondicional con Falso: $(P \leftrightarrow F) \equiv \sim P$.
   - Por tanto: $Q \equiv \sim P$.
2. Analicemos el caso 1: Supongamos que $P$ es **FALSA** ($P \equiv F$):
   - Si $P \equiv F$, entonces $Q \equiv \sim P \equiv \sim F \equiv V$.
   - Evaluemos la definición de $P$:
     $$P \equiv (\sim P \lor \sim Q) \equiv (\sim F \lor \sim V) \equiv (V \lor F) \equiv V$$
   - ¡Contradicción! Asumimos $P \equiv F$ y dedujimos que $P \equiv V$. El caso 1 es inconsistente.
3. Analicemos el caso 2: Supongamos que $P$ es **VERDADERA** ($P \equiv V$):
   - Si $P \equiv V$, entonces $Q \equiv \sim P \equiv \sim V \equiv F$.
   - Evaluemos la definición de $P$:
     $$P \equiv (\sim P \lor \sim Q) \equiv (\sim V \lor \sim F) \equiv (F \lor V) \equiv V$$
   - ¡Consistencia absoluta! Asumimos $P \equiv V$ y la equivalencia se cumple idénticamente.
4. Por lo tanto, el sistema posee una única solución consistente en lógica bivalente clásica:
   $$\mathbf{P \text{ es } V \quad \text{y} \quad Q \text{ es } F}$$.  
**Clave: A**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Proposición Lógica:** Enunciado aseverativo susceptible de poseer un único valor de verdad formal (Verdadero o Falso).
2. **Enunciado Abierto:** Expresión matemática o lingüística con variables que deviene en proposición al concretar el valor de la variable.
3. **Proposición Atómica (Simple):** Estructura proposicional indivisible que carece de enlaces oracionales lógicos y de negación.
4. **Proposición Molecular (Compuesta):** Enunciado articulado mediante uno o más conectores que opera sobre proposiciones simples.
5. **Proposición Relacional:** Proposición atómica que expresa un nexo intrínseco e inseparable entre dos o más entes.
6. **Conjunción:** Operador de copulación simultánea verdadero únicamente cuando todos sus componentes son verdaderos.
7. **Condicional Material:** Operador que formaliza la relación de causalidad lógica o suficiencia entre un antecedente y un consecuente.
8. **Bicondicional:** Operador de doble implicación o equivalencia mutua estricta.
9. **Principio de Bivalencia:** Axioma formal que establece que toda proposición admite exactamente uno de dos valores: verdad o falsedad.
10. **Paradoja:** Enunciado autorreferencial que colapsa el principio de no contradicción, implicando lógicamente su propia negación.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuál es la única combinación de valores que hace FALSA a una proposición condicional ($p \to q$)?  
  **A:** Cuando el antecedente es Verdadero y el consecuente es Falso ($V \to F = F$).
* **Q:** ¿Por qué la frase "¡Por favor, estudia para ingresar a la UNSA!" NO es una proposición lógica?  
  **A:** Porque es una oración imperativa/ruego y carece de valor de verdad objetivo (no se puede calificar como verdadera o falsa).
* **Q:** ¿Qué tipo de proposición simple es "Arequipa y Moquegua son departamentos vecinos"?  
  **A:** Es una **proposición simple relacional** (no se puede desdoblar en dos oraciones independientes sin perder el sentido geográfico).
* **Q:** ¿A qué operador lógico corresponden en el lenguaje ordinario las palabras "pero", "sin embargo" y "aunque"?  
  **A:** Corresponden rigurosamente a una **conjunción ($\land$)**.
* **Q:** ¿Cuál es la diferencia entre una disyunción inclusiva ($\lor$) y una exclusiva ($\vartriangle$)?  
  **A:** La inclusiva permite que ambas sean verdaderas a la vez; la exclusiva exige que una y solo una sea verdadera ($V \vartriangle V = F$).

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RL_01",
  "title": "Proposiciones y Enunciados Lógicos",
  "required_level": 8,
  "xp_reward": 210,
  "gems_reward": 25,
  "skills": ["Identificación de Proposiciones", "Tabla de Verdad del Condicional", "Proposiciones Relacionales"],
  "boss_challenge": {
    "boss_name": "El Guardián de la Lógica Bivalente",
    "question": "Si (p y ~q) -> (r o ~s) es estrictamente FALSA, ¿cuál es el valor de verdad ordenado de (p, q, r, s)?",
    "options": ["V, F, F, V", "V, V, F, F", "F, V, V, F", "V, F, V, F"],
    "correct_index": 0,
    "explanation": "El condicional es Falso solo con V -> F. Luego (p y ~q) = V => p=V, q=F. Y (r o ~s) = F => r=F, s=V. Resultado: V, F, F, V."
  }
}
```
