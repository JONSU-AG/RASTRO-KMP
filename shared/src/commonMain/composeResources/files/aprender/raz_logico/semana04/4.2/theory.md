## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
\end{array}

#### 3. Silogismo Hipotético Puro (SHP - Transitividad)
Si una causa genera un efecto intermedio, y ese efecto intermedio es causa de un resultado final:
\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
q \to r & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{p \to r} & (\text{Conclusión})
\end{array}

#### 4. Silogismo Disyuntivo (SD / Modus Tollendo Ponens - "Negando afirmo")
Si se tiene una disyunción y se niega una de las alternativas, se afirma forzosamente la otra:
\begin{array}{rl|rl}
p \lor q & & p \lor q & \\
\sim p & & \sim q & \\
\hline
\therefore \mathbf{q} & & \therefore \mathbf{p} &
\end{array}

#### 5. Dilema Constructivo (DC)
\begin{array}{rl}
(p \to q) \land (r \to s) & (\text{Dos implicaciones}) \\
p \lor r & (\text{Se afirma al menos un antecedente}) \\
\hline
\therefore \mathbf{q \lor s} & (\text{Se concluye la disyunción de sus consecuentes})
\end{array}

#### 6. Ley de Simplificación y Conjunción
* **Simplificación:** De p \land q se puede concluir válidamente p (o también q).
* **Conjunción:** Si se tiene p demostrado y q demostrado, se concluye válidamente p \land q.
* **Adición:** Si se tiene p, se puede concluir válidamente p \lor q (para cualquier q).

---

### 3.4 Inferencia vs. Opinión (Criterio Prospecto UNSA)
* **Inferencia Lógica:** Derivación forzosa basada en reglas sintácticas y semánticas de deducción objetiva. No depende de las creencias del observador.
* **Opinión o Creencia:** Juicio de valor subjetivo, conjetura verosímil, estimación o extrapolación no demostrada formalmente por las premisas.
  * *Premisa:* "El postulante Juan obtuvo 98 puntos de 100 en el examen CEPREUNSA".
  * *Inferencia lógica:* Juan obtuvo un puntaje aprobatorio y superó los 90 puntos.
  * *Opinión (No deducible lógicamente):* Juan será un excelente médico cirujano en el futuro. (Es un deseo u opinión, no una consecuencia lógica de la premisa).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Modus Ponens (Válido)** <br> p \to q, \quad p \implies \mathbf{q} | **Falacia de Afirmación del Consecuente** <br> *(Afirmar el consecuente NO permite deducir el antecedente)* | \begin{array}{c} p \to q \\ q \\ \hline \therefore p \text{ (¡INVÁLIDO!)} \end{array} |
| **Modus Tollens (Válido)** <br> p \to q, \quad \sim q \implies \mathbf{\sim p} | **Falacia de Negación del Antecedente** <br> *(Negar el antecedente NO permite deducir la negación del consecuente)* | \begin{array}{c} p \to q \\ \sim p \\ \hline \therefore \sim q \text{ (¡INVÁLIDO!)} \end{array} |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Diagrama de Euler para Inferencias Inmediatas
Cuando un problema de inferencia use cuantificadores ("Todos", "Ningún", "Algunos"):
1. Dibuja círculos de conjuntos (diagramas de Venn-Euler).
2. Superpón las premisas.
3. Lo que quede **sombreado o intersecado obligatoriamente en todos los dibujos posibles** es la **CONCLUSIÓN VÁLIDA**.
4. Cualquier alternativa que no se cumpla en al menos un diagrama posible se descarta inmediatamente como simple opinión o conjetura.

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL PONENS PONE, EL TOLLENS QUITA"
> * **Ponens (Pone):** Pone (afirma) el antecedente \implies Pone (obtiene) el consecuente (p \implies q).
> * **Tollens (Toma/Quita):** Quita (niega) el consecuente \implies Quita (niega) el antecedente (\sim q \implies \sim p).

### Mnemotecnia 2: La Trampa de la Lluvia y el Piso Mojado
> "Si llueve, la pista se moja (p \to q)".
> 1. *Caso Válido (MPP):* Está lloviendo \implies Conclusión forzosa: La pista está mojada.
> 2. *Caso Válido (MTT):* La pista está seca (\sim q) \implies Conclusión forzosa: No ha llovido (\sim p).
> 3. *Falacia 1:* La pista está mojada (q) \implies ¿Llovió? **¡NO NECESARIAMENTE!** (Pudieron haber regado la pista o roto una tubería).
> 4. *Falacia 2:* No llueve (\sim p) \implies ¿La pista no está mojada? **¡NO NECESARIAMENTE!**

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La falacia de la inversión condicional:**
   * Premisa: "Todos los ingenieros civiles colegiados estudiaron en la universidad".
   * Pregunta trampa: "¿Qué se concluye válidamente si Pedro estudió en la universidad?"
   * **El error común:** Marcar "Pedro es ingeniero civil".
   * **Lo correcto:** No se puede concluir que sea ingeniero civil; pudo haber estudiado Derecho, Medicina o Filosofía.
2. ⚠️ **El conector disyuntivo y la negación:**
   * Para aplicar el Silogismo Disyuntivo (p \lor q), debes **NEGAR** una de las dos partes para quedarte con la otra.
   * Si te dan p \lor q y luego te afirman p, **NO puedes deducir \sim q** (salvo que el enunciado diga explícitamente que es una disyunción fuerte o exclusiva).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diagnóstico Clínico Asistido por Algoritmos (Biomédicas UNSA)
En el departamento de infectología del Hospital Regional de Arequipa, se programa un sistema experto de triaje con la siguiente regla de inferencia médica:
1. *Regla 1:* Si un paciente presenta fiebre alta continua (p) y plaquetopenia severa (q), y reside en zona endémica (r), se concluye sospecha confirmada de Dengue grave (s):
   (p \land q \land r) \to s
2. *Registro de Triaje:* El paciente llega con fiebre alta (p = V), plaquetopenia severa (q = V), y vive en Camaná (zona endémica, r = V).
3. *Ejecución de la Inferencia (Modus Ponens):*
   (V \land V \land V) \equiv V \implies \mathbf{s = V}
4. El sistema emite la orden de hospitalización inmediata. Una inferencia lógica salva vidas al erradicar dudas humanas subjetivas en emergencias.

---
