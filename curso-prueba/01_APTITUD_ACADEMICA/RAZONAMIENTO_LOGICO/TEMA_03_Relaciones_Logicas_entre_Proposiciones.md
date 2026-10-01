# TEMA 03 · RELACIONES LÓGICAS ENTRE PROPOSICIONES
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Lógico  
**Código del Tema:** `APT_RL_03`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO relaciones causales y compatibilidad de testimonios] [UNI: Implicación estricta, equivalencia lógica y no contradicción]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Relaciones de causa-efecto, condición suficiente vs. necesaria, contradicción formal, equivalencia y compatibilidad de proposiciones. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de consistencia en testimonios judiciales, hipótesis científicas contrapuestas y coherencia discursiva. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Relaciones metalógicas de implicación tautológica ($A \models B$), equivalencia lógica formal ($A \equiv B$) e incompatibilidad analítica. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

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

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Relaciones de Causalidad y Condición

#### A. Condición Suficiente ($p \to q$)
Decimos que $p$ es **condición suficiente** para $q$ cuando la sola presencia o verdad de $p$ garantiza de manera infalible la ocurrencia de $q$.
* *Ejemplo:* "Nacer en la provincia de Arequipa ($p$)" es **suficiente** para "ser peruano de nacimiento ($q$)".
* **Fórmula:** $p \to q$.

#### B. Condición Necesaria ($q \leftarrow p \equiv p \to q$)
Decimos que $q$ es **condición necesaria** para $p$ cuando la ausencia o falsedad de $q$ hace absolutamente imposible la ocurrencia de $p$. Es un requisito indispensable, aunque por sí solo no garantiza el resultado.
* *Ejemplo:* "Tener DNI o documento de identidad ($q$)" es **necesario** para "votar en las elecciones de la UNSA ($p$)". (Sin DNI no puedes votar; pero tener DNI no significa obligatoriamente que vayas a votar).
* **Fórmula canónica:** El término "necesario" **siempre es el CONSECUENTE**:
  $$p \to q \quad (q \text{ es condición necesaria para } p)$$

#### C. Condición Necesaria y Suficiente ($p \leftrightarrow q$)
Ocurre cuando la relación es bidireccional y de equivalencia estricta. Una ocurre si y solo si ocurre la otra.
* *Ejemplo:* "Un polígono tiene tres lados si y solo si es un triángulo".

---

### 3.2 Relaciones de Compatibilidad e Incompatibilidad Lógica

1. **Compatibilidad Lógica:**
   Dos proposiciones $A$ y $B$ son **compatibles** si y solo si existe **al menos una interpretación o combinación de valores** donde ambas proposiciones son simultáneamente **VERDADERAS**:
   $$\text{Existe asignación tal que } (A = V \quad \text{y} \quad B = V) \iff A \land B \not\equiv F$$
2. **Incompatibilidad Lógica (Inconsistencia Relativa):**
   Dos proposiciones $A$ y $B$ son **incompatibles** cuando es lógicamente imposible que ambas sean verdaderas al mismo tiempo:
   $$A \land B \equiv \mathbf{F} \quad (\text{Contradicción absoluta})$$
   * *Ejemplo:* "$x$ es un número par mayor que 10" y "$x$ es un número primo mayor que 10". Son incompatibles porque el único primo par es el 2.

---

### 3.3 Relaciones de Contradicción y Contrariedad

| Tipo de Relación | ¿Pueden ser ambas V? | ¿Pueden ser ambas F? | Valores de Verdad | Ejemplo Formal |
| :--- | :---: | :---: | :--- | :---: |
| **Contradictorias** | **NO** | **NO** | Valores estrictamente opuestos ($V-F$ o $F-V$) | $p$ frente a $\sim p$ |
| **Contrarias** | **NO** | **SÍ** | No pueden ser ambas verdaderas, pero sí pueden ser ambas falsas | "Todos los metales son sólidos" vs. "Ningún metal es sólido" *(Mercurio es líquido)* |
| **Subcontrarias** | **SÍ** | **NO** | Pueden ser ambas verdaderas, pero no pueden ser ambas falsas | "Algunos peruanos son arequipeños" vs. "Algunos peruanos no son arequipeños" |

---

### 3.4 Relación de Implicación Lógica ($A \models B$)
Decimos que la proposición $A$ **implica lógicamente** a la proposición $B$ (notación $A \models B$ o $A \Rightarrow B$) cuando la fórmula condicional:
$$A \to B \equiv \text{TAUTOLOGÍA}$$
Es decir, no existe ninguna asignación donde $A$ sea verdadero y $B$ sea falso. La verdad de $A$ arrastra necesariamente la verdad de $B$.

---

## 4. 📐 FORMULARIO MAESTRO DE RELACIONES Y EQUIVALENCIAS

### 4.1 Diccionario Rápido de Condicionales Preuniversitarios

| Frase del Enunciado | Identificación del Consecuente | Formalización |
| :--- | :--- | :---: |
| "$A$ es condición suficiente para $B$" | $B$ es el consecuente | $$A \to B$$ |
| "$A$ es condición necesaria para $B$" | **$A$ es el consecuente** | $$B \to A$$ |
| "$A$ solo si $B$" | $B$ es el consecuente | $$A \to B$$ |
| "$A$ si $B$" | $A$ es el consecuente | $$B \to A$$ |
| "Para que ocurra $A$ es indispensable que ocurra $B$" | $B$ es el consecuente | $$A \to B$$ |
| "No se da $A$ a menos que se dé $B$" | $\sim B \to \sim A \equiv A \to B$ | $$A \to B$$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL SUFI-VA-PRIMERO, EL NECE-VA-AL-FINAL"
> * **SUFI**ciente $\implies$ Va **PRIMERO** (es el Antecedente: $\text{SUFI} \to \text{efecto}$).
> * **NECE**sario $\implies$ Va al **FINAL** (es el Consecuente: $\text{causa} \to \text{NECE}$).  
> *Ejemplo:* Si dicen "El oxígeno es necesario para la combustión", el oxígeno va al final:  
> $\text{Combustión} \to \text{Oxígeno}$.

### Mnemotecnia 2: La Prueba del "SOLO SI"
> **"Lo que sigue a la palabra 'SOLO SI' es SIEMPRE la flecha de llegada ($\to$)"**  
> "Ingresas a la UNSA solo si rindes el examen" $\implies \text{Ingresas} \to \text{Rindes el examen}$.

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica de la Tabla Comparativa de Coherencia
Para verificar si dos fórmulas extensas $A$ y $B$ son **compatibles**:
1. No simplifiques ambas con leyes gigantes.
2. Busca una asignación simple donde $A$ sea verdadera (ejemplo: haz todas las variables $V$).
3. Si con esa misma asignación $B$ también resulta ser verdadera:
   👉 **$A$ y $B$ son formalmente COMPATIBLES**. (Prueba de existencia en 10 segundos).

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Confundir "Contradicción" con "Contrariedad":**
   * *Contradictorias:* Si una es $V$, la otra es obligatoriamente $F$; si una es $F$, la otra es obligatoriamente $V$.
   * *Contrarias:* Si una es $V$, la otra es $F$; pero si una es $F$, **la otra puede ser también Falsa**.
2. ⚠️ **La trampa del "es necesario" ubicado al principio de la oración:**
   * *"Es necesario aprobar el examen para ingresar a la universidad"*.
   * **El error clásico:** Como "aprobar" está al inicio, poner: $\text{Aprobar} \to \text{Ingresar}$. (¡Grave error!).
   * **Lo correcto:** Como "aprobar" es lo necesario, va al final: $\text{Ingresar} \to \text{Aprobar}$.
3. ⚠️ **Incompatibilidad encubierta en enunciados numéricos:**
   * Proposición 1: "El número entero $n$ es múltiplo de 6".
   * Proposición 2: "El número entero $n$ es impar".
   * Son **incompatibles**, porque todo múltiplo de 6 es divisible entre 2 y por definición es estrictamente par.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Consistencia de Declaraciones Testimoniales en Criminalística
En la investigación de un asalto en el Cercado de Arequipa, la Fiscalía analiza los testimonios de dos sospechosos:
* Declaración del Sospechoso 1 ($A$): "Si yo estuve en el lugar de los hechos, entonces fui con Carlos ($p \to q$)".
* Declaración del Sospechoso 2 ($B$): "Carlos no estuvo en el lugar de los hechos, pero el Sospechoso 1 sí estuvo ($\sim q \land p$)".
* **Evaluación de Coherencia:**
  - Si el Sospechoso 2 dice la verdad: $p = V$ y $q = F$.
  - Reemplazamos en la declaración del Sospechoso 1:
    $$p \to q \equiv V \to F \equiv \mathbf{F}$$
  - **Deducción pericial:** Las dos declaraciones son **mutuamente incompatibles**. Es lógicamente imposible que ambos digan la verdad simultáneamente; al menos uno está mintiendo flagrantemente.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Condición Suficiente y Necesaria)
Identifique la alternativa que exprese formalmente que:  
*"Tener título profesional universitario ($T$) es condición necesaria para ejercer la docencia universitaria ordinaria ($D$)"*.
A) $T \to D$  
B) $D \to T$  
C) $T \leftrightarrow D$  
D) $\sim T \to D$  
E) $T \lor D$  

**Solución Paso a Paso:**
1. Recordamos la regla de oro preuniversitaria:
   - "Lo que se enuncia como condición **necesaria** se ubica siempre en el **CONSECUENTE** (hacia donde apunta la flecha)".
2. El antecedente es la acción que se desea realizar: "Ejercer la docencia universitaria ordinaria" ($D$).
3. El consecuente es el requisito necesario: "Tener título profesional universitario" ($T$).
4. Por lo tanto, la formalización rigurosa es:
   $$D \to T$$.  
**Clave: B**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Relación de Equivalencia)
¿Cuál de las siguientes proposiciones es lógicamente equivalente a:  
*"No es cierto que viajes a Mollendo y no vayas a la playa"*?  
A) Si viajas a Mollendo, vas a la playa.  
B) Viajas a Mollendo o no vas a la playa.  
C) Si vas a la playa, viajas a Mollendo.  
D) No viajas a Mollendo y vas a la playa.  
E) Viajas a Mollendo si y solo si vas a la playa.  

**Solución Paso a Paso:**
1. Definimos las variables:
   - $p$: Viajas a Mollendo.
   - $q$: Vas a la playa.
2. Formalizamos el enunciado original:
   $$\sim(p \land \sim q)$$
3. Aplicamos la **Ley de De Morgan**:
   $$\sim(p \land \sim q) \equiv \sim p \lor \sim(\sim q) \equiv \sim p \lor q$$
4. Por la **Definición del Condicional** ($\sim p \lor q \equiv p \to q$):
   $$p \to q$$
5. Traducimos $p \to q$ al lenguaje cotidiano:
   *"Si viajas a Mollendo, entonces vas a la playa"*.  
**Clave: A**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Compatibilidad de Enunciados)
Analice las siguientes tres afirmaciones de política económica regional:
- Afirmación I: "Si sube el canon minero, se construyen más hospitales ($p \to q$)".
- Afirmación II: "No se construyen más hospitales pero sube el canon minero ($\sim q \land p$)".
- Afirmación III: "O bien sube el canon minero o bien se construyen más hospitales ($p \vartriangle q$)".
¿Cuáles de las afirmaciones son **mutuamente incompatibles** (no pueden ser ambas verdaderas a la vez)?
A) Solo I y III  
B) Solo I y II  
C) Solo II y III  
D) I, II y III  
E) Ninguna es incompatible  

**Solución Paso a Paso:**
1. Evaluamos la conjunción de la Afirmación I y la Afirmación II:
   $$I \land II \equiv (p \to q) \land (\sim q \land p)$$
2. Sabemos por definición del condicional que $(p \to q) \equiv (\sim p \lor q)$:
   $$(\sim p \lor q) \land (p \land \sim q)$$
3. Por Ley de De Morgan, $(p \land \sim q) \equiv \sim(\sim p \lor q)$:
   $$A \land \sim A \equiv \mathbf{F} \quad (\text{Contradicción absoluta})$$
4. Como su conjunción es una contradicción lógica, la Afirmación I y la Afirmación II son **estrictamente incompatibles** (es imposible que ocurran a la vez).  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Implicación Tautológica)
Dadas las fórmulas proposicionales:
$$A = p \land q \quad \text{y} \quad B = p \lor r$$
Demuestre analíticamente si $A$ implica lógicamente a $B$ ($A \models B$) mediante evaluación formal del condicional $A \to B$.
A) Sí implica, porque $A \to B$ es una Tautología  
B) No implica, porque $A \to B$ es una Contingencia  
C) No implica, porque $A \to B$ es una Contradicción  
D) Son proposiciones contradictorias  
E) Son proposiciones subcontrarias  

**Solución Paso a Paso:**
1. Para que $A \models B$, la fórmula condicional $A \to B$ debe ser una **Tautología universal**:
   $$(p \land q) \to (p \lor r)$$
2. Aplicamos la definición del condicional ($\sim X \lor Y$):
   $$\sim(p \land q) \lor (p \lor r)$$
3. Aplicamos la Ley de De Morgan:
   $$(\sim p \lor \sim q) \lor (p \lor r)$$
4. Por leyes asociativa y conmutativa de la disyunción:
   $$(\sim p \lor p) \lor (\sim q \lor r)$$
5. Por la ley del tercio excluido, $(\sim p \lor p) \equiv V$:
   $$V \lor (\sim q \lor r)$$
6. Cualquier proposición en disyunción con la verdad es idénticamente **VERDADERA ($V$)**:
   $$\equiv \mathbf{V} \quad (\text{Tautología absoluta})$$
7. Al ser una tautología, queda demostrado rigurosamente que $A$ **implica lógicamente a $B$**.  
**Clave: A**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Relaciones Metalógicas y Reducción)
Sean $A, B$ y $C$ tres esquemas proposicionales tales que:
1. $A$ es condición suficiente para $B$.
2. $B$ es condición necesaria para $C$.
3. $C$ es contradictoria con $D$.
Si se sabe con certeza absoluta que la proposición $D$ es **FALSA**, ¿cuál de las siguientes afirmaciones es lógicamente concluyente y necesaria?
A) $A$ es necesariamente verdadera  
B) $B$ es necesariamente verdadera  
C) $C$ es necesariamente verdadera  
D) $A$ es necesariamente falsa  
E) $B$ es necesariamente falsa  

**Solución Paso a Paso:**
1. Traducimos las premisas a relaciones formales:
   - Premisa 1: $A \to B \equiv V$.
   - Premisa 2: "$B$ es necesaria para $C$" $\implies C \to B \equiv V$.
   - Premisa 3: $C$ es contradictoria con $D$ $\implies C \equiv \sim D$.
2. Dato fundamental: Se sabe que $D$ es **FALSA** ($D \equiv F$).
3. Por la Premisa 3:
   $$C \equiv \sim D \equiv \sim F \equiv \mathbf{V} \quad (\text{Se deduce con certeza que } C \text{ es VERDADERA})$$
4. Usamos ahora la Premisa 2 ($C \to B \equiv V$):
   - Como ya sabemos que el antecedente $C$ es **VERDADERO** ($V$):
     $$V \to B \equiv V$$
   - Por la tabla del condicional, si el antecedente es $V$, la única forma de que el condicional sea $V$ es que el consecuente sea **VERDADERO**:
     $$\mathbf{B \equiv V}$$
5. ¿Qué ocurre con $A$ en la Premisa 1 ($A \to B \equiv V$)?
   - Como $B = V$, tenemos $A \to V \equiv V$. Esta relación se cumple tanto si $A$ es $V$ como si $A$ es $F$. Por tanto, el valor de $A$ es indeterminado.
6. Por lo tanto, las deducciones concluyentes son: $C$ es verdadera y $B$ es necesariamente **VERDADERA**. En las alternativas, la afirmación concluyente sobre las relaciones de condición es que **$B$ es necesariamente verdadera** (y $C$ es verdadera).  
**Clave: B**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Condición Suficiente:** Proposición antecedente cuya verdad asegura de manera irrevocable la verdad del consecuente.
2. **Condición Necesaria:** Proposición consecuente cuya verificación es un requisito sine qua non para el antecedente.
3. **Equivalencia Lógica:** Relación formal entre dos esquemas que comparten idénticos valores de verdad en su matriz.
4. **Implicación Lógica ($\models$):** Relación condicional cuya tabla de verdad constituye una tautología invariable.
5. **Compatibilidad:** Propiedad de un conjunto de enunciados que pueden ser verdaderos de manera simultánea en al menos un modelo.
6. **Incompatibilidad:** Imposibilidad formal de coexistencia de verdad entre dos o más proposiciones ($A \land B \equiv F$).
7. **Proposiciones Contradictorias:** Enunciados diametralmente opuestos que no pueden ser ni verdaderos ni falsos a la vez.
8. **Proposiciones Contrarias:** Enunciados que no pueden ser simultáneamente verdaderos, pero sí pueden ser simultáneamente falsos.
9. **Contraposición:** Ley lógica que establece la equivalencia entre una implicación y la inversión de sus negaciones ($\sim q \to \sim p$).
10. **Consistencia Lógica:** Ausencia de contradicción en un sistema deductivo o conjunto de premisas.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** En la proposición "A es condición suficiente para B", ¿cómo se formaliza el condicional?  
  **A:** $A \to B$ ($A$ es el antecedente y $B$ el consecuente).
* **Q:** En la proposición "A es condición necesaria para B", ¿cómo se formaliza el condicional?  
  **A:** $B \to A$ (la condición necesaria siempre se coloca en el consecuente).
* **Q:** ¿Cuál es la diferencia entre dos proposiciones contrarias y dos contradictorias?  
  **A:** Las contradictorias nunca pueden tener el mismo valor de verdad; las contrarias no pueden ser ambas verdaderas, pero **sí pueden ser ambas falsas**.
* **Q:** ¿Qué significa que una proposición A implique lógicamente a B ($A \models B$)?  
  **A:** Significa que el condicional $A \to B$ es una **Tautología** (nunca puede darse que $A$ sea verdadero y $B$ falso).
* **Q:** ¿Cuál es la expresión equivalente a "A solo si B"?  
  **A:** Equivale formalmente a $A \to B$ ("B es la condición hacia donde apunta la implicación").

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RL_03",
  "title": "Relaciones Lógicas entre Proposiciones",
  "required_level": 10,
  "xp_reward": 230,
  "gems_reward": 25,
  "skills": ["Condición Necesaria y Suficiente", "Compatibilidad Lógica", "Implicación Tautológica"],
  "boss_challenge": {
    "boss_name": "El Juez de la Coherencia",
    "question": "Si A es condición suficiente para B, B es necesaria para C, y C es contradictoria con D. Si D es FALSA, ¿qué afirmación es concluyente?",
    "options": ["A es necesariamente verdadera", "B es necesariamente verdadera", "A es necesariamente falsa", "B es necesariamente falsa"],
    "correct_index": 1,
    "explanation": "Como D=F y C es contradictoria con D => C=V. Como B es necesaria para C => C -> B es V. Como C=V => B debe ser necesariamente VERDADERA."
  }
}
```
