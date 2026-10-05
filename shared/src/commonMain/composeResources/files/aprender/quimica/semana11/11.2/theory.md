## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Expresión de la Constante de Equilibrio (K_c):**
  Para el sistema en equilibrio:
  aA_{(g)} + bB_{(ac)} \rightleftharpoons cC_{(g)} + dD_{(ac)}
  K_c = \frac{[C]^c [D]^d}{[A]^a [B]^b}
  * **Regla de Exclusión de Fases:** En la expresión de K_c y K_p **NUNCA se incluyen sólidos puros (s) ni líquidos puros (l, como el agua solvente)**, ya que sus concentraciones (densidades molares) son constantes y se hallan subsumidas en el valor de K.

* **Constante en Términos de Presiones Parciales (K_p):**
  Para sustancias exclusivamente en fase gaseosa:
  K_p = \frac{(P_C)^c (P_D)^d}{(P_A)^a (P_B)^b}
* **Relación Matemática entre K_p y K_c:**
  K_p = K_c \cdot (R \cdot T)^{\Delta n}
  Donde:
  * R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K}).
  * T: Temperatura absoluta en Kelvin.
  * \Delta n: Variación de moles gaseosos:
    \Delta n = \sum n_{\text{gaseosos}}(\text{productos}) - \sum n_{\text{gaseosos}}(\text{reactantes})
  * Si \Delta n = 0 \implies K_p = K_c.

* **Cociente de Reacción (Q):**
  Posee la misma expresión matemática que K_c, pero evaluada en cualquier instante fuera del equilibrio:
  * Si Q < K_c: La reacción avanza espontáneamente hacia la **derecha (\to, productos)** para alcanzar el equilibrio.
  * Si Q = K_c: El sistema se encuentra en **equilibrio químico**.
  * Si Q > K_c: La reacción avanza hacia la **izquierda (\leftarrow, reactantes)**.

### 3.6. Principio de Le Chatelier (1884)
"Si sobre un sistema químico en equilibrio se aplica una perturbación externa (cambio de concentración, temperatura o presión/volumen), el sistema evolucionará espontáneamente en el sentido que contrarreste o minimice dicha alteración, restableciendo un nuevo estado de equilibrio":

1. **Efecto de la Concentración:**
   * Si se **añade** una sustancia, el sistema se desplaza hacia el **lado opuesto** para consumirla.
   * Si se **retira** una sustancia, el sistema se desplaza hacia el **mismo lado** para reponerla.
2. **Efecto de la Presión y Volumen (Aplica solo a gases con \Delta n \ne 0):**
   * Si se **aumenta la presión** (o se disminuye el volumen), el sistema se desplaza hacia donde haya **menor número de moles gaseosos (\sum n_g)**.
   * Si se **disminuye la presión** (o se incrementa el volumen), el sistema se desplaza hacia donde haya **mayor número de moles gaseosos**.
   * Si \Delta n = 0, un cambio de presión **no altera el equilibrio**.
3. **Efecto de la Temperatura (El único factor que altera el valor numérico de K_c y K_p):**
   * *Reacción Exotérmica (\Delta H < 0 / Calor en productos):*
     * Si T \uparrow \implies Se desplaza hacia la izquierda (\leftarrow) \implies K_c \downarrow.
     * Si T \downarrow \implies Se desplaza hacia la derecha (\to) \implies K_c \uparrow.
   * *Reacción Endotérmica (\Delta H > 0 / Calor en reactantes):*
     * Si T \uparrow \implies Se desplaza hacia la derecha (\to) \implies K_c \uparrow.
     * Si T \downarrow \implies Se desplaza hacia la izquierda (\leftarrow) \implies K_c \downarrow.
4. **Adición de un Gas Inerte (ej. He, Ar):**
   * A **volumen constante**: Aumenta la presión total, pero las presiones parciales de los reactivos no cambian \implies **No altera el equilibrio**.
   * A **presión constante**: Provoca expansión del volumen total, favoreciendo el lado con mayor número de moles gaseosos.

---

### 4. PROPIEDADES ALGEBRAICAS DE LA CONSTANTE K
* Si se invierte la ecuación química: K' = \frac{1}{K}.
* Si se multiplica la ecuación por un factor n: K' = K^n.
* Si dos o más equilibrios se suman miembro a miembro: K_{\text{global}} = K_1 \cdot K_2 \cdot K_3 \dots

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia K_p y K_c:** **"Kapa = Koko por Ratón a la Delta ene"**
  K_p = K_c \cdot (RT)^{\Delta n}
* **Hacking de Le Chatelier para Presión:**
  * *"Más Presión \to Menos Moles gaseosos"* (la compresión obliga a las moléculas a juntarse).
  * *"Menos Presión \to Más Moles gaseosos"*.
* **Hacking Temperatura:** Considera al "Calor" como un reactivo más:
  * Endo: \text{Reactivo} + \text{Calor} \rightleftharpoons \text{Producto}. Si subes calor, empujas a la derecha.
  * Exo: \text{Reactivo} \rightleftharpoons \text{Producto} + \text{Calor}. Si subes calor, empujas a la izquierda.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Incluir sólidos o líquidos en la expresión de K_c o K_p.** Si la reacción es CaCO_{3(s)} \rightleftharpoons CaO_{(s)} + CO_{2(g)}, la constante es simplemente K_c = [CO_2] y K_p = P_{CO_2}. Los sólidos CaCO_3 y CaO NO figuran en el cociente.
* **Trampa 2: Afirmar que el catalizador aumenta el rendimiento o altera K_c.** FALSO TOTAL. El catalizador solo reduce el tiempo necesario para llegar al equilibrio acelerando por igual la velocidad directa y la inversa; el rendimiento final y el valor de K_c permanecen inalterados.
* **Trampa 3: Usar R = 62.4 en K_p = K_c(RT)^{\Delta n}.** En la deducción termodinámica de K_p, la constante R DEBE ser obligatoriamente 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K}) y la presión debe estar en atmósferas.

---
