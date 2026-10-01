# TEMA 02 · CONECTORES LÓGICOS Y TABLAS DE VERDAD
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Lógico  
**Código del Tema:** `APT_RL_02`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO formalización de condicionales inversos] [UNI: Tablas de verdad, tautologías, contingencias y equivalencias lógicas notables]`

---

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

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Clasificación y Semántica de los Conectores Lógicos

#### A. Conector Monádico: La Negación ($\sim, \neg$)
Afecta a una sola proposición o a un bloque agrupado entre signos de colección.
* **Operación:** Invierte el valor de verdad: $\sim V = F$, $\sim F = V$.
* **Traducciones verbales:** "no", "ni", "es falso que", "no es cierto que", "es inadmisible que", "carece de verdad que".

---

#### B. Conectores Diádicos (Binarios)

1. **La Conjunción ($\land, \&$):**
   * **Semántica:** Copulativa y simultánea. Exige que ambas condiciones se satisfagan plenamente.
   * **Regla estricta:** Es **VERDADERA** únicamente cuando **ambas componentes son verdaderas**.
   * **Traducciones verbales:** "y", "e", "pero", "sin embargo", "además", "aunque", "a la vez que", "no obstante", "tanto... como...", "también".

2. **La Disyunción Inclusiva o Débil ($\lor$):**
   * **Semántica:** Opción no excluyente; admite la posibilidad de que ambas proposiciones ocurran simultáneamente.
   * **Regla estricta:** Es **FALSA** únicamente cuando **ambas componentes son falsas**.
   * **Traducciones verbales:** "o", "a menos que", "salvo que", "excepto que", "o en su defecto".

3. **La Disyunción Exclusiva o Fuerte ($\vartriangle, \oplus, \not\leftrightarrow$):**
   * **Semántica:** Opción mutuamente excluyente; una alternativa descarta por completo a la otra.
   * **Regla estricta:** Es **VERDADERA** cuando los valores de verdad son **DIFERENTES** ($V \vartriangle F = V$, $F \vartriangle V = V$). Si son iguales, es falsa ($V \vartriangle V = F$, $F \vartriangle F = F$).
   * **Traducciones verbales:** "o bien $p$ o bien $q$", "ya bien... ya bien...", "o solo $p$ o solo $q$".

4. **El Condicional Directo ($\to$):**
   * **Semántica:** Estructura de Causa-Efecto, Antecedente $\implies$ Consecuente.
   * **Regla estricta:** Es **FALSA** únicamente cuando el **antecedente es Verdadero y el consecuente es Falso** ($V \to F = F$). En todos los demás casos es $V$.
   * **Traducciones verbales (Antecedente $\to$ Consecuente):**  
     "si $p$, entonces $q$", "$p$ por lo tanto $q$", "$p$ en consecuencia $q$", "$p$ luego $q$", "$p$ de ahí que $q$", "dado que $p$, $q$".

5. **El Condicional Inverso ($\leftarrow$):**
   * **Semántica:** El consecuente aparece al inicio de la oración y el antecedente al final.
   * **Regla de traducción:** "$p$ porque $q$" se formaliza rigurosamente como:
     $$q \to p$$
   * **Traducciones verbales (Consecuente $\leftarrow$ Antecedente):**  
     "$p$ puesto que $q$", "$p$ ya que $q$", "$p$ porque $q$", "$p$ siempre que $q$", "$p$ si $q$", "$p$ dado que $q$".

6. **El Bicondicional ($\leftrightarrow, \equiv$):**
   * **Semántica:** Doble implicación recíproca y equivalencia lógica.
   * **Regla estricta:** Es **VERDADERA** cuando ambas proposiciones tienen el **MISMO valor de verdad** ($V \leftrightarrow V = V$, $F \leftrightarrow F = V$).
   * **Traducciones verbales:** "si y solo si", "cuando y solo cuando", "es equivalente a", "es condición necesaria y suficiente para".

---

### 3.2 Construcción y Evaluación de Tablas de Verdad

* **Número de Filas de la Tabla ($N$):** Para una fórmula proposicional con $n$ variables atómicas distintas:
  $$N = 2^n$$
  *(Para 2 variables: $2^2 = 4$ filas; para 3 variables: $2^3 = 8$ filas; para 4 variables: $2^4 = 16$ filas).*

#### Tabla de Verdad de los 5 Conectores Principales:
$$\begin{array}{|c|c||c|c|c|c|c|}
\hline
p & q & p \land q & p \lor q & p \vartriangle q & p \to q & p \leftrightarrow q \\
\hline
V & V & \mathbf{V} & V & F & V & \mathbf{V} \\
V & F & F & V & \mathbf{V} & \mathbf{F} & F \\
F & V & F & V & \mathbf{V} & V & F \\
F & F & F & \mathbf{F} & F & V & \mathbf{V} \\
\hline
\end{array}$$

#### Clasificación de la Matriz Principal Resultante:
1. **Tautología:** Todos los valores de la columna del conector principal son **Verdaderos ($V$)**. Representa una ley lógica universal.
2. **Contradicción:** Todos los valores de la columna principal son **Falsos ($F$)**.
3. **Contingencia (o Consistencia):** La columna principal contiene **al menos un valor Verdadero y al menos un valor Falso**.

---

## 4. 📐 FORMULARIO MAESTRO DE LEYES DEL ÁLGEBRA PROPOSICIONAL

| Nombre de la Ley | Expresión Lógica Equivalente |
| :--- | :--- |
| **Idempotencia** | $p \land p \equiv p$ <br> $p \lor p \equiv p$ |
| **Conmutativa** | $p \land q \equiv q \land p$ <br> $p \lor q \equiv q \lor p$ |
| **Asociativa** | $(p \land q) \land r \equiv p \land (q \land r)$ <br> $(p \lor q) \lor r \equiv p \lor (q \lor r)$ |
| **Distributiva** | $p \land (q \lor r) \equiv (p \land q) \lor (p \land r)$ <br> $p \lor (q \land r) \equiv (p \lor q) \land (p \lor r)$ |
| **Doble Negación** | $\sim(\sim p) \equiv p$ |
| **Leyes de De Morgan** | $\sim(p \land q) \equiv \sim p \lor \sim q$ <br> $\sim(p \lor q) \equiv \sim p \land \sim q$ |
| **Definición del Condicional** | $p \to q \equiv \sim p \lor q$ <br> $\sim(p \to q) \equiv p \land \sim q$ |
| **Transposición (Contrarecíproca)** | $p \to q \equiv \sim q \to \sim p$ |
| **Definición del Bicondicional** | $p \leftrightarrow q \equiv (p \to q) \land (q \to p)$ <br> $p \leftrightarrow q \equiv (p \land q) \lor (\sim p \land \sim q)$ |
| **Leyes de Absorción (Claves UNI/UNSA)** | **Caso 1:** $p \land (p \lor q) \equiv p$ <br> **Caso 2:** $p \lor (p \land q) \equiv p$ <br> **Caso 3:** $p \land (\sim p \lor q) \equiv p \land q$ <br> **Caso 4:** $p \lor (\sim p \land q) \equiv p \lor q$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL CONDICIONAL ES UN NO AL PRIMERO O EL SEGUNDO"
> La ley más preguntada de toda la lógica preuniversitaria:
> $$p \to q \equiv \mathbf{\sim p \lor q}$$
> **"Niega al primero O mantén al segundo"**.  
> *Ejemplo:* "Si estudias, ingresas" es exactamente lo mismo que decir: "No estudias o ingresas".

### Mnemotecnia 2: La Absorción de Signos Opuestos
> En $p \lor (\sim p \land q)$:
> **"El de afuera ($p$) se come al opuesto ($\sim p$) y se queda con el amigo ($q$)"**:
> $$p \lor (\sim p \land q) \equiv \mathbf{p \lor q}$$
> Te permite simplificar expresiones monstruosas de examen en 5 segundos.

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### El Método del Valor Forzado (Evita Construir Tablas de 16 Filas)
Si un problema te dice: *"Sabiendo que el esquema $[(p \land \sim q) \to (r \to s)]$ es FALSO, determine..."*
* **NO construyas la tabla de verdad.**
* Empieza desde el conector principal forzándolo a ser $F$:
  1. Para que un condicional sea $F$, el antecedente debe ser $V$ y el consecuente $F$.
  2. $(p \land \sim q) = V \implies p = V, q = F$.
  3. $(r \to s) = F \implies r = V, s = F$.
* Obtienes los 4 valores de golpe en 15 segundos sin usar papel adicional.

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La trampa del Condicional Inverso ("porque", "ya que"):**
   * *"Ingresas a la UNSA porque estudias a conciencia"*.
   * **El error clásico:** Formalizar $p \to q$.
   * **Lo correcto:** Como "estudias a conciencia" es la CAUSA, esa proposición es el antecedente: $q \to p$.
2. ⚠️ **Negación de la condicional:**
   * La negación de "Si trabajas, ganas dinero" **NO es** "Si trabajas, no ganas dinero".
   * La negación formal es: **"Trabajas y no ganas dinero"** ($\sim(p \to q) \equiv p \land \sim q$).
3. ⚠️ **La diferencia entre Disyunción Débil y Fuerte:**
   * "Viajo a Lima por avión o por carretera" $\implies$ Disyunción exclusiva ($\vartriangle$), porque físicamente no puedes viajar en ambos medios simultáneamente en el mismo trayecto.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Condicionales en la Lógica Jurídica y Constitucional (Derecho UNSA)
El artículo 2.°, inciso 24, literal f de la Constitución Política del Perú establece:
*"Nadie puede ser detenido sino por mandamiento escrito y motivado del juez o por las autoridades policiales en caso de flagrante delito."*
* Formalización lógica:
  - $p$: Una persona es detenida.
  - $q$: Existe mandamiento escrito y motivado del juez.
  - $r$: Existe flagrante delito.
* Estructura normativa de garantía constitucional:
  $$p \to (q \lor r)$$
* Por la ley contrarecíproca ($\sim(q \lor r) \to \sim p \equiv (\sim q \land \sim r) \to \sim p$):  
  Si no hay orden judicial Y no hay flagrancia, entonces la detención es **absolutamente ilegal y arbitraria**. La lógica rige el Habeas Corpus.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Tabla de Verdad Elemental)
Al evaluar la tabla de verdad de la fórmula molecular:
$$M = (p \lor q) \to p$$
¿cuál es la secuencia de su matriz principal de arriba hacia abajo?
A) $V, V, F, V$  
B) $V, V, F, F$  
C) $V, F, V, V$  
D) $F, V, V, V$  
E) $V, V, V, V$  

**Solución Paso a Paso:**
1. Construimos la tabla de verdad para las 4 combinaciones de $(p, q)$:
   - Fila 1 ($p=V, q=V$): $(V \lor V) \to V \equiv V \to V \equiv \mathbf{V}$
   - Fila 2 ($p=V, q=F$): $(V \lor F) \to V \equiv V \to V \equiv \mathbf{V}$
   - Fila 3 ($p=F, q=V$): $(F \lor V) \to F \equiv V \to F \equiv \mathbf{F}$
   - Fila 4 ($p=F, q=F$): $(F \lor F) \to F \equiv F \to F \equiv \mathbf{V}$
2. La columna del conector principal ($\to$) es:
   $$\mathbf{V, V, F, V}$$.  
*(Es un esquema contingente).*  
**Clave: A**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Condicional Inverso)
Formalice correctamente el siguiente enunciado:  
*"Arequipa tendrá un desarrollo agroindustrial sostenible ya que se ejecuta la represa de Angostura, siempre que las autoridades regionales no incurran en actos de corrupción."*  
Donde:  
$p$: Arequipa tendrá un desarrollo agroindustrial sostenible.  
$q$: Se ejecuta la represa de Angostura.  
$r$: Las autoridades regionales incurren en actos de corrupción.  
A) $p \to (q \land \sim r)$  
B) $(q \land \sim r) \to p$  
C) $(q \to \sim r) \to p$  
D) $(p \land q) \to \sim r$  
E) $\sim r \to (q \to p)$  

**Solución Paso a Paso:**
1. Identificamos los conectores de causa o condicionales inversos:
   - "ya que" introduce una causa antecedente.
   - "siempre que" introduce otra condición previa concurrente.
2. Las causas conjuntas para que ocurra el efecto $p$ son:
   - "Se ejecuta la represa de Angostura" ($q$).
   - "Las autoridades regionales NO incurran en corrupción" ($\sim r$).
3. Por lo tanto, el antecedente compuesto es $(q \land \sim r)$.
4. El efecto consecuente es $p$:
   $$(q \land \sim r) \to p$$.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Simplificación con Leyes de De Morgan)
Simplifique al máximo el siguiente esquema molecular:
$$E = \sim(p \lor \sim q) \lor (\sim p \land \sim q)$$
A) $p$  
B) $\sim p$  
C) $q$  
D) $\sim q$  
E) $p \land q$  

**Solución Paso a Paso:**
1. Aplicamos la **Ley de De Morgan** al primer bloque $\sim(p \lor \sim q)$:
   $$\sim(p \lor \sim q) \equiv \sim p \land \sim(\sim q) \equiv \sim p \land q$$
2. Sustituimos en la expresión original:
   $$E = (\sim p \land q) \lor (\sim p \land \sim q)$$
3. Aplicamos la **Ley Distributiva inversa (factorización lógica)** del término común $\sim p \land$:
   $$E \equiv \sim p \land (q \lor \sim q)$$
4. Por la ley del tercio excluido, $(q \lor \sim q) \equiv V$ (siempre Verdadero):
   $$E \equiv \sim p \land V$$
5. Por ley de identidad en la conjunción ($\sim p \land V \equiv \sim p$):
   $$E \equiv \mathbf{\sim p}$$.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Leyes de Absorción)
Reduzca a su forma canónica más simple la proposición compuesta:
$$W = [p \land (\sim p \lor q)] \lor [q \land (p \lor \sim q)]$$
A) $p \lor q$  
B) $p \land q$  
C) $p$  
D) $q$  
E) $V$  

**Solución Paso a Paso:**
1. Analizamos el primer corchete: $[p \land (\sim p \lor q)]$
   - Aplicamos la **Ley de Absorción de signos opuestos**:
     $$p \land (\sim p \lor q) \equiv p \land q$$
2. Analizamos el segundo corchete: $[q \land (p \lor \sim q)]$
   - Conmutamos dentro del paréntesis: $(p \lor \sim q) \equiv (\sim q \lor p)$.
   - Nos queda: $q \land (\sim q \lor p)$.
   - Aplicamos nuevamente la **Ley de Absorción**:
     $$q \land (\sim q \lor p) \equiv q \land p \equiv p \land q$$
3. Reemplazamos ambos resultados en $W$:
   $$W \equiv (p \land q) \lor (p \land q)$$
4. Por la ley de **Idempotencia** ($A \lor A \equiv A$):
   $$W \equiv \mathbf{p \land q}$$.  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Circuitos de Conmutación y Álgebra Booleana)
El siguiente circuito eléctrico está compuesto por interruptores controlados por las proposiciones $p$, $q$ y $r$:
Un interruptor $p$ en serie con una rama en paralelo formada por: $[q]$ y $[\sim p \lor (p \land \sim q)]$. Si cada interruptor cerrado cuesta $S/.\, 50$ en el diseño de un microchip, ¿cuál es el costo mínimo del circuito simplificado equivalente más económico?
A) $S/.\, 50$ (1 solo interruptor)  
B) $S/.\, 100$ (2 interruptores)  
C) $S/.\, 150$ (3 interruptores)  
D) $S/.\, 0$ (El circuito es siempre cerrado / cable directo)  
E) $S/.\, 200$ (4 interruptores)  

**Solución Paso a Paso:**
1. Traducimos el circuito eléctrico a fórmula proposicional:
   - Serie $\implies$ Conjunción ($\land$).
   - Paralelo $\implies$ Disyunción ($\lor$).
   $$Circuito = p \land [q \lor (\sim p \lor (p \land \sim q))]$$
2. Simplificamos el término interno: $[\sim p \lor (p \land \sim q)]$
   - Por Ley de Absorción: $\sim p \lor (p \land \sim q) \equiv \sim p \lor \sim q$.
3. Reemplazamos:
   $$Circuito \equiv p \land [q \lor (\sim p \lor \sim q)]$$
4. Asociamos dentro del corchete: $[(q \lor \sim q) \lor \sim p]$
   - Sabemos que $(q \lor \sim q) \equiv V$:
   $$[V \lor \sim p] \equiv V$$
5. La expresión completa se reduce a:
   $$Circuito \equiv p \land V \equiv \mathbf{p}$$
6. El circuito completo equivale a **un único interruptor $p$**.
7. Por lo tanto, el costo mínimo del diseño simplificado es:
   $$\text{Costo} = 1 \times S/.\, 50 = \mathbf{S/.\, 50}$$.  
**Clave: A**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Conector Lógico:** Operador formal que enlaza proposiciones atómicas generando funciones de verdad compuestas.
2. **Tautología:** Expresión molecular lógicamente válida cuya tabla de verdad arroja exclusivamente el valor Verdadero.
3. **Contradicción:** Esquema proposicional formalmente inconsistente que resulta Falso para cualquier asignación de valores.
4. **Contingencia:** Fórmula lógica cuya verdad empírica depende de los estados contingentes de sus variables atómicas.
5. **Antecedente:** Proposición componente que enuncia la condición previa o causa en una implicación condicional.
6. **Consecuente:** Proposición componente que establece el efecto necesario o deducción lógica del condicional.
7. **Contrarecíproca:** Principio de equivalencia formal que establece que $p \to q \equiv \sim q \to \sim p$.
8. **Ley de Absorción:** Regla de reducción algebraica que compacta fórmulas mixtas de conjunción y disyunción.
9. **Leyes de De Morgan:** Teoremas duales que rigen la distribución de la negación sobre conjunciones y disyunciones.
10. **Circuito Lógico:** Modelo físico-electrónico donde los interruptores en serie representan conjunciones y en paralelo disyunciones.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿A qué equivale la fórmula del condicional $p \to q$ mediante disyunción?  
  **A:** Equivale a $\sim p \lor q$ ("Niega al primero O mantén al segundo").
* **Q:** ¿Cuál es la negación de la proposición "Llueve y hace frío"?  
  **A:** Por Ley de De Morgan: "No llueve O no hace frío" ($\sim p \lor \sim q$).
* **Q:** ¿Cuántas filas tiene la tabla de verdad de una proposición con 3 variables ($p, q, r$)?  
  **A:** Tiene $2^3 = 8$ filas.
* **Q:** Si la matriz principal de una tabla de verdad tiene solo valores Verdaderos, ¿cómo se clasifica?  
  **A:** Se clasifica como una **Tautología**.
* **Q:** ¿Cómo se formaliza el enunciado "Pedro viaja porque tiene vacaciones"?  
  **A:** Es un condicional inverso: $q \to p$ ("Tiene vacaciones $\implies$ Pedro viaja").

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RL_02",
  "title": "Conectores Lógicos y Tablas de Verdad",
  "required_level": 9,
  "xp_reward": 220,
  "gems_reward": 25,
  "skills": ["Tablas de Verdad", "Leyes de De Morgan", "Circuitos Lógicos"],
  "boss_challenge": {
    "boss_name": "El Maestro de los Circuitos",
    "question": "Simplifique al máximo el circuito equivalente a: p y [q o (~p o (p y ~q))]. ¿A qué proposición simple equivale?",
    "options": ["p", "q", "~p", "p y q"],
    "correct_index": 0,
    "explanation": "Por absorción, ~p o (p y ~q) = ~p o ~q. Luego [q o ~q o ~p] = [V o ~p] = V. Finalmente: p y V = p."
  }
}
```
