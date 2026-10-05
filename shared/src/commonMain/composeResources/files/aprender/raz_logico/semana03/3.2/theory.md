## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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
