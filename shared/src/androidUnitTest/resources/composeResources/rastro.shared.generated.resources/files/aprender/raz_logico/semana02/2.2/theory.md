## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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
