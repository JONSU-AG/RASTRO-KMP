# TEMA 11: Cinética Química y Equilibrio Químico

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química Dinámica y Termodinámica Química
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Ley de velocidad, perfiles energéticos, cálculo de $K_c$ y $K_p$, y Principio de Le Chatelier)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.3 / 10

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         CINÉTICA Y EQUILIBRIO QUÍMICO
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
  CINÉTICA QUÍMICA                                          EQUILIBRIO QUÍMICO
• Teoría de las Colisiones Efectivas                        • Reacciones Reversibles: $v_{\text{directa}} = v_{\text{inversa}}$
• Energía de Activación ($E_a$)                             • Constante de Equilibrio en Concentraciones ($K_c$)
• Complejo Activado                                         • Constante en Presiones ($K_p$): $K_p = K_c (RT)^{\Delta n}$
• Ley de Acción de Masas (Guldberg y Waage):               • Cociente de Reacción ($Q$ vs $K$)
  $v_r = k [A]^\alpha [B]^\beta$                             • Principio de Henry Le Chatelier:
• Factores que modifican la velocidad:                        - Efecto de la Concentración
  - Concentración de reactivos                                - Efecto de la Presión y Volumen (fase gas)
  - Temperatura ($T \uparrow \implies v \uparrow$)            - Efecto de la Temperatura ($\Delta H$)
  - Grado de división / Superficie                            - Inercia del Catalizador (NO altera $K$)
  - Catalizadores (disminuyen $E_a$)
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Cinética Química: Velocidad de Reacción
La Cinética Química estudia la rapidez con que los reactivos se transforman en productos y los mecanismos moleculares detallados del proceso.
* **Velocidad Media de Reacción:** Variación de la concentración molar de una sustancia por unidad de tiempo:
  $$aA + bB \to cC + dD$$
  $$v_{\text{reacción}} = -\frac{1}{a} \frac{\Delta [A]}{\Delta t} = -\frac{1}{b} \frac{\Delta [B]}{\Delta t} = +\frac{1}{c} \frac{\Delta [C]}{\Delta t} = +\frac{1}{d} \frac{\Delta [D]}{\Delta t}$$
  *(El signo negativo indica consumo de reactantes y el positivo formación de productos)*.

### 3.2. Teoría de las Colisiones y Perfil de Energía Potencial
Para que una reacción química ocurra tras un choque molecular, deben cumplirse dos condiciones simultáneas:
1. **Orientación geométrica espacial adecuada.**
2. **Energía cinética mínima suficiente:** Denominada **Energía de Activación ($E_a$)**, requerida para vencer las repulsiones electrónicas y romper los enlaces iniciales formando el **Complejo Activado** (estado de transición inestable de máxima energía potencial).

* **Parámetros del Diagrama de Energía:**
  * **Variación de Entalpía ($\Delta H$):**
    $$\Delta H = H_{\text{productos}} - H_{\text{reactantes}}$$
    * Si $\Delta H < 0$: Proceso Exotérmico (libera calor).
    * Si $\Delta H > 0$: Proceso Endotérmico (absorbe calor).
  * **Energía de Activación Directa ($E_{a(d)}$):**
    $$E_{a(d)} = H_{\text{complejo activado}} - H_{\text{reactantes}}$$
  * **Energía de Activación Inversa ($E_{a(i)}$):**
    $$E_{a(i)} = H_{\text{complejo activado}} - H_{\text{productos}}$$
  * **Relación Fundamental:**
    $$\Delta H = E_{a(d)} - E_{a(i)}$$

### 3.3. Ley de Velocidad y Orden de Reacción
Para una reacción homogénea general en una sola etapa (reacción elemental):
$$aA + bB \to \text{Productos}$$
La Ley de Velocidad (Ley de Acción de Masas de Guldberg y Waage) es:
$$v = k [A]^a [B]^b$$
Para una reacción compleja en varias etapas, la velocidad está gobernada estrictamente por la **etapa más lenta (etapa determinante de la velocidad)**, y los órdenes de reacción ($\alpha, \beta$) se determinan **experimentalmente**:
$$v = k [A]^\alpha [B]^\beta$$
* $\alpha, \beta$: Órdenes parciales respecto a $A$ y $B$.
* $\alpha + \beta$: **Orden Total de la Reacción**.
* $k$: Constante cinética específica de velocidad (depende exclusivamente de la temperatura según la ecuación de Svante Arrhenius: $k = A e^{-E_a/RT}$).

### 3.4. Factores que Modifican la Velocidad de Reacción
1. **Naturaleza de los Reactantes:** Reacciones iónicas en disolución acuosa no requieren ruptura previa de enlaces y son casi instantáneas ($v \to \infty$); reacciones covalentes con enlaces múltiples son lentas.
2. **Concentración de Reactivos:** A mayor concentración molar, mayor densidad de moléculas por unidad de volumen y mayor frecuencia de colisiones por segundo ($v \uparrow$).
3. **Superficie de Contacto (Grado de División en Sólidos):** A mayor subdivisión (polvo fino vs fragmento macizo), mayor área expuesta a colisiones y mayor velocidad.
4. **Temperatura:** Un incremento térmico eleva la energía cinética media molecular; según la regla empírica de Van 't Hoff, por cada $10^\circ\text{C}$ de incremento, la velocidad se duplica o triplica.
5. **Catalizadores:** Sustancias que aumentan notablemente la velocidad de reacción ofreciendo una ruta alternativa con una **menor Energía de Activación ($E_a$)**.
   * *Propiedades del Catalizador:*
     * No se consume en la reacción (se recupera intacto).
     * No altera la entalpía de reacción ($\Delta H$ permanece constante).
     * No modifica la constante de equilibrio ($K_c$) ni desplaza el equilibrio; únicamente **acelera el tiempo para alcanzarlo**.

### 3.5. Equilibrio Químico y Ley de Acción de Masas
El equilibrio químico es un estado dinámico alcanzado por una reacción reversible en un sistema cerrado a temperatura constante, donde las **velocidades de la reacción directa e inversa se igualan**:
$$v_{\text{directa}} = v_{\text{inversa}}$$
Macroscópicamente, las concentraciones de reactantes y productos permanecen constantes en el tiempo.

* **Expresión de la Constante de Equilibrio ($K_c$):**
  Para el sistema en equilibrio:
  $$aA_{(g)} + bB_{(ac)} \rightleftharpoons cC_{(g)} + dD_{(ac)}$$
  $$K_c = \frac{[C]^c [D]^d}{[A]^a [B]^b}$$
  * **Regla de Exclusión de Fases:** En la expresión de $K_c$ y $K_p$ **NUNCA se incluyen sólidos puros ($s$) ni líquidos puros ($l$, como el agua solvente)**, ya que sus concentraciones (densidades molares) son constantes y se hallan subsumidas en el valor de $K$.

* **Constante en Términos de Presiones Parciales ($K_p$):**
  Para sustancias exclusivamente en fase gaseosa:
  $$K_p = \frac{(P_C)^c (P_D)^d}{(P_A)^a (P_B)^b}$$
* **Relación Matemática entre $K_p$ y $K_c$:**
  $$K_p = K_c \cdot (R \cdot T)^{\Delta n}$$
  Donde:
  * $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$.
  * $T$: Temperatura absoluta en Kelvin.
  * $\Delta n$: Variación de moles gaseosos:
    $$\Delta n = \sum n_{\text{gaseosos}}(\text{productos}) - \sum n_{\text{gaseosos}}(\text{reactantes})$$
  * Si $\Delta n = 0 \implies K_p = K_c$.

* **Cociente de Reacción ($Q$):**
  Posee la misma expresión matemática que $K_c$, pero evaluada en cualquier instante fuera del equilibrio:
  * Si $Q < K_c$: La reacción avanza espontáneamente hacia la **derecha ($\to$, productos)** para alcanzar el equilibrio.
  * Si $Q = K_c$: El sistema se encuentra en **equilibrio químico**.
  * Si $Q > K_c$: La reacción avanza hacia la **izquierda ($\leftarrow$, reactantes)**.

### 3.6. Principio de Le Chatelier (1884)
"Si sobre un sistema químico en equilibrio se aplica una perturbación externa (cambio de concentración, temperatura o presión/volumen), el sistema evolucionará espontáneamente en el sentido que contrarreste o minimice dicha alteración, restableciendo un nuevo estado de equilibrio":

1. **Efecto de la Concentración:**
   * Si se **añade** una sustancia, el sistema se desplaza hacia el **lado opuesto** para consumirla.
   * Si se **retira** una sustancia, el sistema se desplaza hacia el **mismo lado** para reponerla.
2. **Efecto de la Presión y Volumen (Aplica solo a gases con $\Delta n \ne 0$):**
   * Si se **aumenta la presión** (o se disminuye el volumen), el sistema se desplaza hacia donde haya **menor número de moles gaseosos ($\sum n_g$)**.
   * Si se **disminuye la presión** (o se incrementa el volumen), el sistema se desplaza hacia donde haya **mayor número de moles gaseosos**.
   * Si $\Delta n = 0$, un cambio de presión **no altera el equilibrio**.
3. **Efecto de la Temperatura (El único factor que altera el valor numérico de $K_c$ y $K_p$):**
   * *Reacción Exotérmica ($\Delta H < 0$ / Calor en productos):*
     * Si $T \uparrow \implies$ Se desplaza hacia la izquierda ($\leftarrow$) $\implies K_c \downarrow$.
     * Si $T \downarrow \implies$ Se desplaza hacia la derecha ($\to$) $\implies K_c \uparrow$.
   * *Reacción Endotérmica ($\Delta H > 0$ / Calor en reactantes):*
     * Si $T \uparrow \implies$ Se desplaza hacia la derecha ($\to$) $\implies K_c \uparrow$.
     * Si $T \downarrow \implies$ Se desplaza hacia la izquierda ($\leftarrow$) $\implies K_c \downarrow$.
4. **Adición de un Gas Inerte (ej. $He, Ar$):**
   * A **volumen constante**: Aumenta la presión total, pero las presiones parciales de los reactivos no cambian $\implies$ **No altera el equilibrio**.
   * A **presión constante**: Provoca expansión del volumen total, favoreciendo el lado con mayor número de moles gaseosos.

---

## 4. PROPIEDADES ALGEBRAICAS DE LA CONSTANTE $K$
* Si se invierte la ecuación química: $K' = \frac{1}{K}$.
* Si se multiplica la ecuación por un factor $n$: $K' = K^n$.
* Si dos o más equilibrios se suman miembro a miembro: $K_{\text{global}} = K_1 \cdot K_2 \cdot K_3 \dots$

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Incluir sólidos o líquidos en la expresión de $K_c$ o $K_p$.** Si la reacción es $CaCO_{3(s)} \rightleftharpoons CaO_{(s)} + CO_{2(g)}$, la constante es simplemente $K_c = [CO_2]$ y $K_p = P_{CO_2}$. Los sólidos $CaCO_3$ y $CaO$ NO figuran en el cociente.
* **Trampa 2: Afirmar que el catalizador aumenta el rendimiento o altera $K_c$.** FALSO TOTAL. El catalizador solo reduce el tiempo necesario para llegar al equilibrio acelerando por igual la velocidad directa y la inversa; el rendimiento final y el valor de $K_c$ permanecen inalterados.
* **Trampa 3: Usar $R = 62.4$ en $K_p = K_c(RT)^{\Delta n}$.** En la deducción termodinámica de $K_p$, la constante $R$ DEBE ser obligatoriamente $0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$ y la presión debe estar en atmósferas.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia $K_p$ y $K_c$:** **"Kapa = Koko por Ratón a la Delta ene"**
  $$K_p = K_c \cdot (RT)^{\Delta n}$$
* **Hacking de Le Chatelier para Presión:**
  * *"Más Presión $\to$ Menos Moles gaseosos"* (la compresión obliga a las moléculas a juntarse).
  * *"Menos Presión $\to$ Más Moles gaseosos"*.
* **Hacking Temperatura:** Considera al "Calor" como un reactivo más:
  * Endo: $\text{Reactivo} + \text{Calor} \rightleftharpoons \text{Producto}$. Si subes calor, empujas a la derecha.
  * Exo: $\text{Reactivo} \rightleftharpoons \text{Producto} + \text{Calor}$. Si subes calor, empujas a la izquierda.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Expresión de $K_c$ y $K_p$)
Escriba las expresiones matemáticas correctas de $K_c$ y $K_p$ para los siguientes sistemas en equilibrio químico:
a) $N_{2(g)} + 3H_{2(g)} \rightleftharpoons 2NH_{3(g)}$
b) $C_{(s)} + H_2O_{(g)} \rightleftharpoons CO_{(g)} + H_{2(g)}$

* **Resolución:**
  * a) Sistema homogéneo gaseoso:
    $$K_c = \frac{[NH_3]^2}{[N_2][H_2]^3} \quad ; \quad K_p = \frac{(P_{NH_3})^2}{(P_{N_2})(P_{H_2})^3}$$
    Cálculo de $\Delta n$: $\Delta n = 2 - (1 + 3) = 2 - 4 = -2 \implies K_p = K_c (RT)^{-2}$.
  * b) Sistema heterogéneo sólido-gas:
    El carbono es sólido puro ($C_{(s)}$), por lo que se excluye de las constantes:
    $$K_c = \frac{[CO][H_2]}{[H_2O]} \quad ; \quad K_p = \frac{(P_{CO})(P_{H_2})}{(P_{H_2O})}$$
    Cálculo de $\Delta n$: $\Delta n = (1 + 1) - 1 = 1 \implies K_p = K_c (RT)^1$.
* **Respuesta:** En b), el sólido puro $C_{(s)}$ no aparece en las expresiones.

---

### Problema 2 (Nivel Intermedio - Relación Numérica entre $K_c$ y $K_p$)
A una temperatura de $227^\circ\text{C}$, el valor de la constante de equilibrio $K_c$ para la descomposición del pentacloruro de fósforo:
$$PCl_{5(g)} \rightleftharpoons PCl_{3(g)} + Cl_{2(g)}$$
es igual a $0.041\text{ mol/L}$. Calcule el valor de la constante $K_p$ a dicha temperatura.
*(Dato: $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$)*.

* **Resolución:**
  1. Identificación de datos:
     * $T = 227 + 273 = 500\text{ K}$
     * $K_c = 0.041$
     * Cálculo de $\Delta n$:
       Productos gaseosos = $1 (PCl_3) + 1 (Cl_2) = 2\text{ moles}$.
       Reactantes gaseosos = $1 (PCl_5) = 1\text{ mol}$.
       $$\Delta n = 2 - 1 = +1$$
  2. Aplicamos la relación:
     $$K_p = K_c (RT)^{\Delta n}$$
     $$K_p = 0.041 \times (0.082 \times 500)^1$$
     $$0.082 \times 500 = 41$$
     $$K_p = 0.041 \times 41 = 1.681\text{ atm}$$
* **Respuesta:** $K_p = 1.681$.

---

### Problema 3 (Nivel Intermedio - Cálculo de Concentraciones en Equilibrio)
En un matraz cerrado de $2.0\text{ L}$ se introducen inicialmente $4.0\text{ moles}$ de yoduro de hidrógeno ($HI$) a $448^\circ\text{C}$. Al alcanzarse el equilibrio químico:
$$2HI_{(g)} \rightleftharpoons H_{2(g)} + I_{2(g)}$$
se encuentra que se han descompuesto el $20\%$ de las moles iniciales de $HI$. Calcule el valor de la constante de equilibrio $K_c$.

* **Resolución:**
  1. Concentración molar inicial de $HI$:
     $$[HI]_0 = \frac{4.0\text{ moles}}{2.0\text{ L}} = 2.0\text{ M}$$
  2. Grado de disociación ($\alpha = 20\% = 0.20$):
     Cantidad que reacciona de $HI$:
     $$\text{Reacciona} = 2.0\text{ M} \times 0.20 = 0.40\text{ M}$$
  3. Cuadro Estequiométrico de Concentraciones (I-R-E):
     $$\begin{array}{lcccc}
     & 2HI_{(g)} & \rightleftharpoons & H_{2(g)} & + & I_{2(g)} \\
     \textbf{Inicio (M):} & 2.0 & & 0 & & 0 \\
     \textbf{Reacciona/Forma (M):} & -0.40 & & +0.20 & & +0.20 \\
     \textbf{Equilibrio (M):} & 1.60 & & 0.20 & & 0.20
     \end{array}$$
  4. Cálculo de $K_c$:
     $$K_c = \frac{[H_2][I_2]}{[HI]^2} = \frac{(0.20)(0.20)}{(1.60)^2} = \frac{0.040}{2.56} = \frac{1}{64} \approx 0.0156$$
* **Respuesta:** $K_c = \frac{1}{64} \approx 0.0156$.

---

### Problema 4 (Nivel Avanzado - Principio de Le Chatelier Multifactorial)
Considere el siguiente proceso industrial de síntesis de amoníaco en equilibrio en fase gaseosa:
$$N_{2(g)} + 3H_{2(g)} \rightleftharpoons 2NH_{3(g)} \quad (\Delta H = -92.2\text{ kJ/mol})$$
Prediga razonadamente hacia dónde se desplaza el equilibrio químico (derecha $\to$ o izquierda $\leftarrow$) cuando:
a) Se extrae amoníaco ($NH_3$) continuamente del reactor.
b) Se duplica la presión total reduciendo el volumen del recipiente a la mitad.
c) Se incrementa la temperatura de $400^\circ\text{C}$ a $600^\circ\text{C}$.
d) Se añade un catalizador metálico de hierro poroso.
e) Se inyecta gas helio a volumen constante.

* **Resolución:**
  * a) **Extracción de $NH_3$:** Se reduce un producto; según Le Chatelier, el sistema evoluciona para reponerlo $\implies$ Se desplaza hacia la **DERECHA ($\to$)**.
  * b) **Aumento de Presión:** En reactantes hay $1 + 3 = 4\text{ moles gaseosos}$ y en productos hay $2\text{ moles gaseosos}$. El sistema busca disminuir la presión desplazándose hacia donde hay menos moles gaseosos ($2 < 4$) $\implies$ Se desplaza hacia la **DERECHA ($\to$)**.
  * c) **Aumento de Temperatura:** La reacción es exotérmica ($\Delta H < 0$), libera calor hacia la derecha. Al subir la temperatura, el sistema absorbe calor desplazándose en el sentido endotérmico $\implies$ Se desplaza hacia la **IZQUIERDA ($\leftarrow$)** (disminuye $K_c$ y el rendimiento de amoníaco).
  * d) **Adición de Catalizador:** El catalizador disminuye la energía de activación por igual en ambos sentidos. **NO desplaza el equilibrio** ni altera las concentraciones; solo reduce el tiempo necesario para alcanzarlo.
  * e) **Gas Helio a volumen constante:** Aumenta la presión total, pero las presiones parciales de $N_2, H_2$ y $NH_3$ permanecen constantes $\implies$ **NO altera el equilibrio**.
* **Respuesta:** a) Derecha; b) Derecha; c) Izquierda; d) No se desplaza; e) No se desplaza.

---

### Problema 5 (Nivel Reto UNSA / UNI - Cociente de Reacción $Q_c$ y Desplazamiento Espontáneo)
Para la reacción en fase gaseosa:
$$SO_{2(g)} + NO_{2(g)} \rightleftharpoons SO_{3(g)} + NO_{(g)}$$
la constante de equilibrio a cierta temperatura es $K_c = 16$. En un recipiente cerrado de $1.0\text{ L}$ se introducen simultáneamente: $0.10\text{ mol}$ de $SO_2$, $0.10\text{ mol}$ de $NO_2$, $0.80\text{ mol}$ de $SO_3$ y $0.80\text{ mol}$ de $NO$.
a) Determine el valor del cociente de reacción $Q_c$ e indique el sentido espontáneo del cambio.
b) Calcule las concentraciones molares de todas las especies en el nuevo estado de equilibrio.

* **Resolución:**
  1. Concentraciones iniciales (como el volumen es $1.0\text{ L}$, Molaridad = moles):
     $$[SO_2]_0 = 0.10\text{ M} \quad ; \quad [NO_2]_0 = 0.10\text{ M} \quad ; \quad [SO_3]_0 = 0.80\text{ M} \quad ; \quad [NO]_0 = 0.80\text{ M}$$
  2. a) Cálculo del Cociente de Reacción ($Q_c$):
     $$Q_c = \frac{[SO_3]_0 [NO]_0}{[SO_2]_0 [NO_2]_0} = \frac{(0.80)(0.80)}{(0.10)(0.10)} = \frac{0.64}{0.01} = 64$$
     * Comparación: Como $Q_c (64) > K_c (16)$, el sistema tiene un exceso de productos respecto al equilibrio. Por tanto, la reacción evoluciona espontáneamente hacia la **IZQUIERDA ($\leftarrow$, hacia los reactantes)** consumiendo $SO_3$ y $NO$ y produciendo $SO_2$ y $NO_2$.
  3. b) Planteamiento del equilibrio (sea $x$ la cantidad molar que reacciona hacia la izquierda):
     * $[SO_2]_{\text{eq}} = 0.10 + x$
     * $[NO_2]_{\text{eq}} = 0.10 + x$
     * $[SO_3]_{\text{eq}} = 0.80 - x$
     * $[NO]_{\text{eq}} = 0.80 - x$
  4. Expresión de $K_c = 16$:
     $$\frac{(0.80 - x)(0.80 - x)}{(0.10 + x)(0.10 + x)} = 16 \implies \frac{(0.80 - x)^2}{(0.10 + x)^2} = 16$$
  5. Extraemos raíz cuadrada a ambos miembros:
     $$\frac{0.80 - x}{0.10 + x} = \sqrt{16} = 4$$
     $$0.80 - x = 4(0.10 + x) = 0.40 + 4x$$
     $$0.80 - 0.40 = 5x \implies 0.40 = 5x \implies x = \frac{0.40}{5} = 0.08\text{ M}$$
  6. Concentraciones finales en el equilibrio:
     * $[SO_2] = 0.10 + 0.08 = 0.18\text{ M}$
     * $[NO_2] = 0.10 + 0.08 = 0.18\text{ M}$
     * $[SO_3] = 0.80 - 0.08 = 0.72\text{ M}$
     * $[NO] = 0.80 - 0.08 = 0.72\text{ M}$
  7. Comprobación:
     $$K_c = \frac{(0.72)(0.72)}{(0.18)(0.18)} = \left(\frac{0.72}{0.18}\right)^2 = (4)^2 = 16 \text{ (¡Exacto!)}$$
* **Respuesta:** $Q_c = 64 > 16$ (evoluciona hacia la izquierda); concentraciones en equilibrio: $[SO_2] = [NO_2] = 0.18\text{ M}$, $[SO_3] = [NO] = 0.72\text{ M}$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Velocidad de Reacción:** Tasa de consumo de un reactivo o de aparición de un producto por unidad de tiempo y de volumen.
2. **Energía de Activación:** Barrera energética potencial mínima que deben superar las moléculas reactantes para formar el complejo activado.
3. **Complejo Activado:** Estructura intermedia altamente inestable y energéticamente rica situada en el ápice de la coordenada de reacción.
4. **Catalizador:** Sustancia que acelera la velocidad de una reacción química proveyendo una vía con menor energía de activación sin consumirse.
5. **Equilibrio Químico:** Estado estacionario dinámico donde las velocidades de las reacciones directa e inversa son exactamente iguales.
6. **Constante $K_c$:** Producto de las concentraciones de equilibrio de los productos dividido entre el de los reactantes, elevados a sus coeficientes.
7. **Principio de Le Chatelier:** Postulado que establece que un sistema en equilibrio sometido a una tensión externa reacciona en el sentido que anula dicha perturbación.
8. **Cociente de Reacción ($Q$):** Expresión idéntica a la constante de equilibrio calculada con concentraciones instantáneas fuera del equilibrio.
9. **Reacción Elemental:** Transformación química que ocurre en una única etapa a través de un solo estado de transición.
10. **Equilibrio Heterogéneo:** Sistema en equilibrio químico donde las sustancias participantes coexisten en dos o más fases físicas distintas.

---

## 9. FLASHCARDS
* **Front:** ¿Qué parámetro termodinámico es el ÚNICO capaz de modificar el valor numérico de la constante de equilibrio $K_c$?
  * **Back:** Exclusivamente la **Temperatura**. Los cambios de concentración, presión, volumen o adición de catalizadores no modifican el valor numérico de $K_c$.
* **Front:** ¿Cuál es la relación matemática que vincula a $K_p$ con $K_c$?
  * **Back:** $K_p = K_c \cdot (R \cdot T)^{\Delta n}$, donde $\Delta n$ es la diferencia de moles de productos gaseosos menos reactantes gaseosos.
* **Front:** ¿Por qué los sólidos y líquidos puros no se incluyen en la expresión de $K_c$ o $K_p$?
  * **Back:** Porque su densidad y concentración molar son intrínsecamente constantes durante la reacción y ya se encuentran integradas en el valor de la constante $K$.
* **Front:** ¿Hacia dónde se desplaza un sistema gaseoso en equilibrio si se comprime aumentando la presión externa?
  * **Back:** Se desplaza hacia el miembro de la ecuación que posea el **menor número total de moles gaseosos** para reducir la presión interna.
* **Front:** ¿Qué indica físicamente que el cociente de reacción $Q$ sea menor que la constante de equilibrio $K$ ($Q < K$)?
  * **Back:** Indica que hay un déficit de productos respecto al equilibrio, por lo que la reacción avanzará espontáneamente hacia la derecha ($\to$, formación de productos).

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_11",
  "titulo": "Cinética Química y Equilibrio Químico",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál es la función principal de un catalizador en una reacción química?",
      "opciones": [
        "Aumentar el calor de reacción (ΔH)",
        "Desplazar el equilibrio químico hacia los productos",
        "Disminuir la energía de activación acelerando el proceso",
        "Modificar el valor numérico de Kc"
      ],
      "respuesta_correcta": 2,
      "retroalimentacion": "El catalizador provee un mecanismo alternativo con menor energía de activación (Ea), incrementando la velocidad sin alterar Kc ni ΔH."
    },
    {
      "id": "q2",
      "pregunta": "Para la reacción N2(g) + 3H2(g) <=> 2NH3(g), la relación entre Kp y Kc es:",
      "opciones": ["Kp = Kc (RT)^2", "Kp = Kc (RT)^-2", "Kp = Kc", "Kp = Kc (RT)^-1"],
      "respuesta_correcta": 1,
      "retroalimentacion": "Δn = 2 - (1 + 3) = 2 - 4 = -2. Por tanto, Kp = Kc * (RT)^-2."
    },
    {
      "id": "q3",
      "pregunta": "En una reacción exotérmica en equilibrio (A <=> B + Calor), si se aumenta la temperatura:",
      "opciones": [
        "El equilibrio se desplaza a la derecha y Kc aumenta",
        "El equilibrio se desplaza a la izquierda y Kc disminuye",
        "El equilibrio no se desplaza",
        "Aumenta la concentración de productos"
      ],
      "respuesta_correcta": 1,
      "retroalimentacion": "Al suministrar calor a un sistema exotérmico, el equilibrio se desplaza hacia los reactantes (izquierda), disminuyendo el valor de Kc."
    }
  ]
}
```
