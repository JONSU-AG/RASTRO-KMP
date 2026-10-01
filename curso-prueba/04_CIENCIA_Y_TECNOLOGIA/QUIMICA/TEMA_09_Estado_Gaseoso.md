# TEMA 09: Estado Gaseoso y Mezclas de Gases

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química del Estado Gaseoso
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Ecuación universal, procesos restringidos, presiones parciales y difusión de Graham)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.4 / 10

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ESTADO GASEOSO
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
TEORÍA CINÉTICO-MOLECULAR (TCM)                         LEYES DE LOS GASES IDEALES
• Choques perfectamente elásticos                       • Ley de Boyle-Mariotte ($T = \text{cte}$, Isotérmico)
• Volumen molecular despreciable                        • Ley de Charles ($P = \text{cte}$, Isobárico)
• Sin fuerzas intermoleculares ($F_a = F_r = 0$)        • Ley de Gay-Lussac ($V = \text{cte}$, Isocórico)
• $E_k \propto T$ (Kelvin)                               • Ecuación Combinada: $\frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}$
                                                                 │
         ┌───────────────────────────────────────────────────────┘
         ▼
ECUACIÓN UNIVERSAL DE LOS GASES:  $P \cdot V = n \cdot R \cdot T$
• Densidad de un gas:  $P \cdot \overline{M} = \rho \cdot R \cdot T$
• Constante Universal ($R$):
  - $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$
  - $R = 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})$
  - $R = 8.314\text{ J}/(\text{mol}\cdot\text{K})$
         │
         ▼
MEZCLAS DE GASES Y DIFUSIÓN
• Ley de las Presiones Parciales de Dalton:  $P_{\text{total}} = \sum P_i$  ;  $P_i = x_i \cdot P_{\text{total}}$
• Ley de los Volúmenes Parciales de Amagat:  $V_{\text{total}} = \sum V_i$  ;  $V_i = x_i \cdot V_{\text{total}}$
• Masa Molar Aparente de la Mezcla:  $\overline{M}_{\text{mezcla}} = \sum (x_i \cdot \overline{M}_i)$
• Ley de Efusión y Difusión de Graham:  $\frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}}$
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Postulados de la Teoría Cinético-Molecular de los Gases Ideales (Clausius, Maxwell, Boltzmann)
Un gas real se aproxima al comportamiento de un **gas ideal** a condiciones de **baja presión ($P \to 0$)** y **alta temperatura ($T \gg 0$)**:
1. Los gases están constituidos por partículas puntiformes pequeñísimas (moléculas o átomos) separadas por distancias enormes comparadas con sus diámetros. El volumen propio de las partículas se considera matemáticamente despreciable respecto al volumen total del recipiente ($V_{\text{gas}} \approx V_{\text{recipiente}}$).
2. Las moléculas se encuentran en movimiento caótico, continuo y rectilíneo al azar en todas las direcciones del espacio.
3. Las fuerzas de atracción y repulsión intermolecular (cohesión y Van der Waals) son totalmente nulas ($F_c = F_r = 0$).
4. Los choques intermoleculares y contra las paredes del recipiente son **perfectamente elásticos**: no hay pérdida neta de energía cinética total ($\Delta E_k = 0$).
5. La energía cinética media de traslación de las moléculas es directamente proporcional a la **Temperatura Absoluta** ($T$ en Kelvin):
   $$\overline{E}_k = \frac{1}{2} m \overline{v}^2 = \frac{3}{2} k_B T$$
   *(Donde $k_B$ es la constante de Boltzmann $k_B = R/N_A = 1.38 \times 10^{-23}\text{ J/K}$)*.

### 3.2. Variables de Estado de un Gas
* **Presión ($P$):** Fuerza que ejercen los choques moleculares por unidad de área de superficie:
  $$1\text{ atm} = 760\text{ mmHg} = 760\text{ Torr} = 101.325\text{ kPa} \approx 10^5\text{ Pa}$$
* **Volumen ($V$):** Espacio disponible que ocupa el gas (volumen del recipiente):
  $$1\text{ m}^3 = 1000\text{ L} = 10^6\text{ mL} = 10^6\text{ cm}^3$$
* **Temperatura Absoluta ($T$):** Medida de la agitación cinética media:
  $$T(\text{K}) = T(^\circ\text{C}) + 273.15 \approx T(^\circ\text{C}) + 273$$
  *(Jamás operar leyes de gases con grados Celsius)*.
* **Cantidad de sustancia ($n$):** Número de moles de gas:
  $$n = \frac{m}{\overline{M}}$$

### 3.3. Leyes Empíricas de los Gases Ideales (Procesos Restringidos)

#### A. Ley de Boyle - Mariotte (Proceso Isotérmico: $T = \text{constante}, n = \text{constante}$)
"A temperatura y masa constantes, el volumen de una masa gaseosa es inversamente proporcional a la presión absoluta que soporta":
$$P \cdot V = k \implies P_1 \cdot V_1 = P_2 \cdot V_2$$
* Gráfica $P$ vs $V$: Rama de hipérbola equilátera (Isoterma).

#### B. Ley de Charles (Proceso Isobárico: $P = \text{constante}, n = \text{constante}$)
"A presión y masa constantes, el volumen de un gas varía en forma directamente proporcional a su temperatura absoluta":
$$\frac{V}{T} = k \implies \frac{V_1}{T_1} = \frac{V_2}{T_2}$$
* Gráfica $V$ vs $T$: Línea recta que converge al cero absoluto ($0\text{ K}$) (Isobara).

#### C. Ley de Gay-Lussac (Proceso Isocórico o Isométrico: $V = \text{constante}, n = \text{constante}$)
"A volumen y masa constantes, la presión absoluta de un gas es directamente proporcional a su temperatura absoluta":
$$\frac{P}{T} = k \implies \frac{P_1}{T_1} = \frac{P_2}{T_2}$$
* Gráfica $P$ vs $T$: Línea recta orientada hacia el origen absoluto (Isócora).

#### D. Ecuación Combinada de los Gases
Relaciona dos estados de una misma masa fija de gas ($n = \text{constante}$):
$$\frac{P_1 \cdot V_1}{T_1} = \frac{P_2 \cdot V_2}{T_2}$$

### 3.4. Ecuación de Estado del Gas Ideal (Ecuación Universal)
Unifica todas las variables termodinámicas para cualquier sistema gaseoso ideal:
$$P \cdot V = n \cdot R \cdot T$$
Sustituyendo $n = \frac{m}{\overline{M}}$:
$$P \cdot V = \frac{m}{\overline{M}} \cdot R \cdot T$$
Reordenando con la densidad $\rho = \frac{m}{V}$:
$$P \cdot \overline{M} = \rho \cdot R \cdot T \implies \rho = \frac{P \cdot \overline{M}}{R \cdot T}$$

* **Valores de la Constante Universal de los Gases ($R$):**
  * Si la presión está en **atmósferas ($atm$)**:
    $$R = 0.08206 \approx 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$$
  * Si la presión está en **milímetros de mercurio ($mmHg$) o Torr**:
    $$R = 62.36 \approx 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})$$
  * Si la presión está en **Pascales ($Pa$)** y el volumen en **$m^3$** (SI):
    $$R = 8.314\text{ J}/(\text{mol}\cdot\text{K}) = 8.314\text{ Pa}\cdot\text{m}^3/(\text{mol}\cdot\text{K})$$

### 3.5. Mezclas Gaseosas

#### A. Fracción Molar ($x_i$)
Proporción de moles de un gas respecto al número total de moles en la mezcla:
$$x_i = \frac{n_i}{n_{\text{total}}} \quad ; \quad \sum x_i = 1 \quad ; \quad \% n_i = x_i \times 100\%$$

#### B. Ley de las Presiones Parciales de John Dalton (1801)
"La presión total ejercida por una mezcla de gases no reactivos es igual a la suma de las presiones parciales que ejercería cada gas si ocupara solo todo el volumen del recipiente a la misma temperatura":
$$P_{\text{total}} = P_1 + P_2 + \dots + P_k = \sum_{i=1}^k P_i$$
* **Cálculo de la Presión Parcial ($P_i$):**
  $$P_i = x_i \cdot P_{\text{total}}$$

#### C. Ley de los Volúmenes Parciales de Emile Amagat
"El volumen total ocupado por una mezcla gaseosa es igual a la suma de los volúmenes parciales de cada gas medidos a la misma presión y temperatura":
$$V_{\text{total}} = \sum V_i \quad ; \quad V_i = x_i \cdot V_{\text{total}} \implies \%V_i = \%n_i = x_i \times 100\%$$

#### D. Masa Molar Promedio o Aparente de la Mezcla ($\overline{M}_{\text{mezcla}}$)
$$\overline{M}_{\text{mezcla}} = x_1 \overline{M}_1 + x_2 \overline{M}_2 + \dots + x_k \overline{M}_k = \frac{m_{\text{total}}}{n_{\text{total}}}$$
* *Para el aire seco promedio:* $\approx 78\% N_2, 21\% O_2, 1\% Ar \implies \overline{M}_{\text{aire}} \approx 28.96\text{ g/mol} \approx 29\text{ g/mol}$.

#### E. Recolección de Gases sobre Agua (Gas Húmedo)
Cuando un gas se recolecta por desplazamiento de agua en una probeta o cuba neumática, el gas se satura con vapor de agua:
$$P_{\text{gas húmedo}} = P_{\text{gas seco}} + P_{v(H_2O)}$$
$$P_{\text{gas seco}} = P_{\text{total}} - P_{v(H_2O)}$$
*(La presión de vapor de agua $P_v$ solo depende de la temperatura y se obtiene de tablas termodinámicas)*.

### 3.6. Ley de Difusión y Efusión Gaseosa de Thomas Graham (1829)
* **Difusión:** Proceso espontáneo de dispersión y mezcla de un gas a través de otro.
* **Efusión:** Escape de un gas a través de un orificio microscópico hacia una zona de menor presión o vacío.
"A condiciones idénticas de presión y temperatura, las velocidades de difusión o efusión de dos gases son inversamente proporcionales a las raíces cuadradas de sus respectivas masas molares o densidades":
$$\frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}} = \sqrt{\frac{\rho_2}{\rho_1}} = \frac{t_2}{t_1}$$
*(Los gases más livianos como el $H_2$ o el $He$ se difunden a velocidades mucho mayores que los gases pesados como el $O_2, CO_2$ o $SO_2$)*.

---

## 4. GASES REALES Y FACTOR DE COMPRESIBILIDAD ($Z$)
Para gases reales bajo presiones moderadas o altas, las moléculas sí ocupan volumen propio y sí existen fuerzas de atracción intermolecular. Se define el **Factor de Compresibilidad ($Z$)**:
$$Z = \frac{P \cdot V}{n \cdot R \cdot T}$$
* Si $Z = 1$: El gas se comporta como estrictamente ideal.
* Si $Z > 1$: Predominan las fuerzas de repulsión volumétrica (gas difícil de comprimir).
* Si $Z < 1$: Predominan las fuerzas de atracción intermolecular (gas fácilmente licuable).
* **Ecuación de Van der Waals:**
  $$\left(P + \frac{a \cdot n^2}{V^2}\right)(V - n \cdot b) = n \cdot R \cdot T$$
  Donde $a$ corrige las fuerzas atractivas intermoleculares y $b$ corrige el volumen propio ocupado por las moléculas (covolumen).

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Operar con temperaturas en grados Celsius ($^\circ\text{C}$).** Si divides o multiplicas por $T(^\circ\text{C})$, todo el problema se anula. DEBES sumar siempre $273$ para convertir a Kelvin ($K$).
* **Trampa 2: Olvidar restar la presión de vapor del agua en gases recolectados sobre agua.** Si te dicen "gas recolectado sobre agua a $20^\circ\text{C}$ con presión total de $750\text{ mmHg}$ y $P_v(H_2O) = 17.5\text{ mmHg}$", la presión del gas seco para usar en $PV=nRT$ es $750 - 17.5 = 732.5\text{ mmHg}$.
* **Trampa 3: Invertir las masas en la Ley de Graham.** Es una proporción inversa: $\frac{v_1}{v_2} = \sqrt{\frac{M_2}{M_1}}$. En tiempos de efusión se invierte: el gas pesado tarda más tiempo, por lo que $\frac{t_1}{t_2} = \sqrt{\frac{M_1}{M_2}}$.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Ecuación Universal:** **"Pavo = Ratón"**
  $$P \cdot V = R \cdot T \cdot n$$
* **Mnemotecnia Densidad de un Gas:** **"Puma = Rata"**
  $$P \cdot \overline{M} = \rho \cdot R \cdot T$$
* **Mnemotecnia Ecuación Combinada:** **"Pavo Triste 1 = Pavo Triste 2"**
  $$\frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}$$

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Ecuación Universal de Gases)
Calcule el volumen en litros que ocupan $160\text{ g}$ de gas oxígeno ($O_2$) confinados a una presión de $4.1\text{ atm}$ y una temperatura de $127^\circ\text{C}$.
*(Masa atómica: $O = 16$; $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$)*.

* **Resolución:**
  1. Masa molar del oxígeno gaseoso ($O_2$):
     $$\overline{M} = 2 \times 16 = 32\text{ g/mol}$$
  2. Número de moles ($n$):
     $$n = \frac{m}{\overline{M}} = \frac{160\text{ g}}{32\text{ g/mol}} = 5\text{ moles}$$
  3. Conversión de temperatura a Kelvin:
     $$T = 127 + 273 = 400\text{ K}$$
  4. Aplicamos la ecuación de estado ($PV = nRT$):
     $$4.1 \times V = 5 \times 0.082 \times 400$$
     $$4.1 \times V = 164$$
     $$V = \frac{164}{4.1} = 40\text{ Litros}$$
* **Respuesta:** $40\text{ Litros}$.

---

### Problema 2 (Nivel Intermedio - Ecuación Combinada de Gases)
Un balón de acero contiene helio gaseoso a una presión de $10\text{ atm}$ y una temperatura de $27^\circ\text{C}$, ocupando un volumen de $12\text{ L}$. Si debido a un recalentamiento la temperatura asciende a $227^\circ\text{C}$ y el gas se expande hacia un tanque secundario hasta alcanzar un volumen total de $25\text{ L}$, determine la nueva presión final en atmósferas.

* **Resolución:**
  1. Identificamos los dos estados de la masa fija de gas:
     * **Estado 1:** $P_1 = 10\text{ atm}$, $V_1 = 12\text{ L}$, $T_1 = 27 + 273 = 300\text{ K}$.
     * **Estado 2:** $P_2 = ?$, $V_2 = 25\text{ L}$, $T_2 = 227 + 273 = 500\text{ K}$.
  2. Aplicamos la Ecuación Combinada:
     $$\frac{P_1 \cdot V_1}{T_1} = \frac{P_2 \cdot V_2}{T_2}$$
  3. Sustituimos valores y despejamos $P_2$:
     $$\frac{10 \times 12}{300} = \frac{P_2 \times 25}{500}$$
     $$\frac{120}{300} = \frac{25 P_2}{500}$$
     $$0.4 = \frac{P_2}{20} \implies P_2 = 0.4 \times 20 = 8\text{ atm}$$
* **Respuesta:** $8\text{ atmósferas}$.

---

### Problema 3 (Nivel Intermedio - Densidad y Masa Molar de un Gas Desconocido)
A una temperatura de $27^\circ\text{C}$ y bajo una presión de $1.23\text{ atm}$, un gas desconocido posee una densidad de $2.2\text{ g/L}$. Calcule la masa molar de dicho gas y determine cuál de los siguientes gases podría ser: $CH_4, C_3H_8, CO_2, SO_2$.
*(Dato: $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$)*.

* **Resolución:**
  1. Identificación de datos:
     * $T = 27 + 273 = 300\text{ K}$
     * $P = 1.23\text{ atm}$
     * $\rho = 2.2\text{ g/L}$
  2. Aplicación de la fórmula "Puma = Rata":
     $$P \cdot \overline{M} = \rho \cdot R \cdot T$$
     $$1.23 \cdot \overline{M} = 2.2 \times 0.082 \times 300$$
     $$1.23 \cdot \overline{M} = 2.2 \times 24.6 = 54.12$$
     $$\overline{M} = \frac{54.12}{1.23} = 44\text{ g/mol}$$
  3. Comparación con las masas molares de las alternativas:
     * $CH_4: 12 + 4 = 16\text{ g/mol}$
     * $C_3H_8: 3(12) + 8 = 44\text{ g/mol}$
     * $CO_2: 12 + 2(16) = 44\text{ g/mol}$
     * $SO_2: 32 + 2(16) = 64\text{ g/mol}$
* **Respuesta:** $\overline{M} = 44\text{ g/mol}$ (corresponde a propano $C_3H_8$ o dióxido de carbono $CO_2$).

---

### Problema 4 (Nivel Avanzado - Mezcla Gaseosa y Presión Parcial)
Un recipiente rígido de $20\text{ L}$ contiene una mezcla gaseosa constituida por $28\text{ g}$ de nitrógeno ($N_2$), $32\text{ g}$ de metano ($CH_4$) y $4\text{ g}$ de helio ($He$) a una temperatura de $27^\circ\text{C}$. Determine:
a) La masa molar promedio de la mezcla.
b) La presión total dentro del recipiente en atmósferas.
c) La presión parcial que ejerce el metano.
*(Masas atómicas: $N=14, C=12, H=1, He=4$; $R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$)*.

* **Resolución:**
  1. Cálculo de moles de cada gas:
     * $n(N_2) = \frac{28\text{ g}}{28\text{ g/mol}} = 1.0\text{ mol}$
     * $n(CH_4) = \frac{32\text{ g}}{16\text{ g/mol}} = 2.0\text{ moles}$
     * $n(He) = \frac{4\text{ g}}{4\text{ g/mol}} = 1.0\text{ mol}$
     * Moles totales: $n_{\text{total}} = 1.0 + 2.0 + 1.0 = 4.0\text{ moles}$.
  2. Masa total de la mezcla:
     $$m_{\text{total}} = 28 + 32 + 4 = 64\text{ g}$$
  3. a) Masa molar promedio ($\overline{M}_{\text{mezcla}}$):
     $$\overline{M}_{\text{mezcla}} = \frac{m_{\text{total}}}{n_{\text{total}}} = \frac{64\text{ g}}{4.0\text{ mol}} = 16\text{ g/mol}$$
  4. b) Presión total del sistema ($P_{\text{total}}$):
     $T = 27 + 273 = 300\text{ K}$, $V = 20\text{ L}$.
     $$P_{\text{total}} \cdot V = n_{\text{total}} \cdot R \cdot T$$
     $$P_{\text{total}} \times 20 = 4.0 \times 0.082 \times 300$$
     $$20 P_{\text{total}} = 4.0 \times 24.6 = 98.4 \implies P_{\text{total}} = \frac{98.4}{20} = 4.92\text{ atm}$$
  5. c) Presión parcial del metano ($P_{CH_4}$):
     * Fracción molar del metano:
       $$x_{CH_4} = \frac{n(CH_4)}{n_{\text{total}}} = \frac{2.0}{4.0} = 0.50$$
     * Presión parcial por ley de Dalton:
       $$P_{CH_4} = x_{CH_4} \cdot P_{\text{total}} = 0.50 \times 4.92\text{ atm} = 2.46\text{ atm}$$
* **Respuesta:**
  a) $\overline{M}_{\text{mezcla}} = 16\text{ g/mol}$.
  b) $P_{\text{total}} = 4.92\text{ atm}$.
  c) $P_{CH_4} = 2.46\text{ atm}$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Ley de Efusión de Graham y Difusión)
A través de un orificio diminuto de efusión, un volumen determinado de gas oxígeno ($O_2$) tarda exactamente $60\text{ segundos}$ en escapar a ciertas condiciones fijas de presión y temperatura. Un volumen idéntico de un gas desconocido $X$ tarda $30\text{ segundos}$ en efundir bajo las mismas condiciones. Calcule la masa molar del gas $X$ y determine cuántas veces más rápido se difunde $X$ en comparación con el gas oxígeno.

* **Resolución:**
  1. Relación entre tiempo de efusión y masa molar (Ley de Graham):
     Como el gas de menor masa molar es más veloz, requiere menor tiempo para escapar:
     $$\frac{t_1}{t_2} = \sqrt{\frac{\overline{M}_1}{\overline{M}_2}}$$
  2. Asignamos variables:
     * Gas 1: Oxígeno ($O_2$): $t_1 = 60\text{ s}$, $\overline{M}_1 = 32\text{ g/mol}$.
     * Gas 2: Gas $X$: $t_2 = 30\text{ s}$, $\overline{M}_2 = \overline{M}_X$.
  3. Reemplazamos en la ecuación:
     $$\frac{60}{30} = \sqrt{\frac{32}{\overline{M}_X}} \implies 2 = \sqrt{\frac{32}{\overline{M}_X}}$$
  4. Elevamos ambos miembros al cuadrado:
     $$4 = \frac{32}{\overline{M}_X} \implies \overline{M}_X = \frac{32}{4} = 8\text{ g/mol}$$
  5. Relación de velocidades de difusión:
     $$\frac{v_X}{v_{O_2}} = \frac{t_{O_2}}{t_X} = \frac{60\text{ s}}{30\text{ s}} = 2$$
     El gas $X$ se difunde exactamente **el doble de rápido ($2$ veces más veloz)** que el gas oxígeno.
* **Respuesta:** La masa molar del gas es $8\text{ g/mol}$ (ej. gas helio diatómico hipotético o mezcla ligera) y se difunde al doble de velocidad que el $O_2$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Gas Ideal:** Modelo teórico de fluido compuesto por partículas puntiformes sin volumen propio ni fuerzas de atracción intermolecular, cuyos choques son elásticos.
2. **Proceso Isotérmico:** Transformación termodinámica efectuada a temperatura estrictamente constante ($\Delta T = 0$), regida por la ley de Boyle.
3. **Proceso Isobárico:** Transformación física que ocurre a presión constante, regida por la ley de Charles.
4. **Proceso Isocórico:** Cambio de estado de un sistema a volumen constante, gobernado por la ley de Gay-Lussac.
5. **Presión Parcial:** Presión que ejercería un componente gaseoso individual de una mezcla si ocupase por sí solo todo el volumen del contenedor.
6. **Fracción Molar:** Cociente adimensional entre el número de moles de un componente y el número de moles totales de la mezcla.
7. **Difusión Gaseosa:** Fenómeno de dispersión gradual e irreversible de un gas en el seno de otro debido al movimiento molecular caótico.
8. **Efusión:** Escape de moléculas de gas a través de un orificio microscópico hacia una región con menor presión.
9. **Presión de Vapor:** Presión ejercida por el vapor en equilibrio dinámico con su líquido a una temperatura fijada.
10. **Factor de Compresibilidad ($Z$):** Relación matemática $PV/nRT$ que cuantifica la desviación de un gas real respecto al comportamiento ideal.

---

## 9. FLASHCARDS
* **Front:** ¿Bajo qué condiciones termodinámicas un gas real se aproxima al comportamiento ideal?
  * **Back:** A presiones muy bajas ($P \to 0$) y temperaturas muy elevadas ($T \gg 0$), donde las distancias intermoleculares son máximas y las fuerzas de Van der Waals se hacen despreciables.
* **Front:** ¿Cuál es la ecuación matemática que relaciona la densidad de un gas con su presión y temperatura?
  * **Back:** $P \cdot \overline{M} = \rho \cdot R \cdot T \implies \rho = \frac{P \cdot \overline{M}}{R \cdot T}$ ("Puma = Rata").
* **Front:** ¿Cómo se calcula la masa molar aparente de una mezcla gaseosa?
  * **Back:** $\overline{M}_{\text{mezcla}} = \sum (x_i \cdot \overline{M}_i) = \frac{m_{\text{total}}}{n_{\text{total}}}$ (promedio ponderado según fracciones molares).
* **Front:** ¿Qué establece la Ley de Difusión de Graham?
  * **Back:** Las velocidades de difusión de dos gases son inversamente proporcionales a las raíces cuadradas de sus masas molares: $\frac{v_1}{v_2} = \sqrt{\frac{M_2}{M_1}}$.
* **Front:** ¿A cuánto asciende el valor de la constante universal $R$ si la presión se expresa en $mmHg$?
  * **Back:** $R \approx 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})$. Si la presión está en $atm$, $R \approx 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})$.

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_09",
  "titulo": "Estado Gaseoso y Mezclas de Gases",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "Si un gas a 27 °C y 2 atm se calienta isotérmicamente duplicando su volumen, la nueva presión es:",
      "opciones": ["4 atm", "1 atm", "2 atm", "0.5 atm"],
      "respuesta_correcta": 1,
      "retroalimentacion": "Ley de Boyle (T = cte): P1 * V1 = P2 * V2 => 2 * V1 = P2 * (2 V1) => P2 = 1 atm."
    },
    {
      "id": "q2",
      "pregunta": "¿Cuál de los siguientes gases se difundirá a mayor velocidad a través de una membrana porosa a 25 °C?",
      "opciones": ["O2 (32 g/mol)", "CH4 (16 g/mol)", "He (4 g/mol)", "CO2 (44 g/mol)"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Según la Ley de Graham, el gas con menor masa molar (Helio, He = 4 g/mol) efunde y se difunde con la mayor velocidad."
    },
    {
      "id": "q3",
      "pregunta": "En una mezcla de gases con presión total de 8 atm, si la fracción molar de N2 es 0.75, su presión parcial es:",
      "opciones": ["2 atm", "4 atm", "6 atm", "8 atm"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Ley de Dalton: P(N2) = x(N2) * Ptotal = 0.75 * 8 atm = 6 atm."
    }
  ]
}
```
