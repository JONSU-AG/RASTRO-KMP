## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Sustituyendo n = \frac{m}{\overline{M}}:
P \cdot V = \frac{m}{\overline{M}} \cdot R \cdot T
Reordenando con la densidad \rho = \frac{m}{V}:
P \cdot \overline{M} = \rho \cdot R \cdot T \implies \rho = \frac{P \cdot \overline{M}}{R \cdot T}

* **Valores de la Constante Universal de los Gases (R):**
  * Si la presión está en **atmósferas (atm)**:
    R = 0.08206 \approx 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})
  * Si la presión está en **milímetros de mercurio (mmHg) o Torr**:
    R = 62.36 \approx 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})
  * Si la presión está en **Pascales (Pa)** y el volumen en **m^3** (SI):
    R = 8.314\text{ J}/(\text{mol}\cdot\text{K}) = 8.314\text{ Pa}\cdot\text{m}^3/(\text{mol}\cdot\text{K})

### 3.5. Mezclas Gaseosas

#### A. Fracción Molar (x_i)
Proporción de moles de un gas respecto al número total de moles en la mezcla:
x_i = \frac{n_i}{n_{\text{total}}} \quad ; \quad \sum x_i = 1 \quad ; \quad \% n_i = x_i \times 100\%

#### B. Ley de las Presiones Parciales de John Dalton (1801)
"La presión total ejercida por una mezcla de gases no reactivos es igual a la suma de las presiones parciales que ejercería cada gas si ocupara solo todo el volumen del recipiente a la misma temperatura":
P_{\text{total}} = P_1 + P_2 + \dots + P_k = \sum_{i=1}^k P_i
* **Cálculo de la Presión Parcial (P_i):**
  P_i = x_i \cdot P_{\text{total}}

#### C. Ley de los Volúmenes Parciales de Emile Amagat
"El volumen total ocupado por una mezcla gaseosa es igual a la suma de los volúmenes parciales de cada gas medidos a la misma presión y temperatura":
V_{\text{total}} = \sum V_i \quad ; \quad V_i = x_i \cdot V_{\text{total}} \implies \%V_i = \%n_i = x_i \times 100\%

#### D. Masa Molar Promedio o Aparente de la Mezcla (\overline{M}_{\text{mezcla}})
\overline{M}_{\text{mezcla}} = x_1 \overline{M}_1 + x_2 \overline{M}_2 + \dots + x_k \overline{M}_k = \frac{m_{\text{total}}}{n_{\text{total}}}
* *Para el aire seco promedio:* \approx 78\% N_2, 21\% O_2, 1\% Ar \implies \overline{M}_{\text{aire}} \approx 28.96\text{ g/mol} \approx 29\text{ g/mol}.

#### E. Recolección de Gases sobre Agua (Gas Húmedo)
Cuando un gas se recolecta por desplazamiento de agua en una probeta o cuba neumática, el gas se satura con vapor de agua:
P_{\text{gas húmedo}} = P_{\text{gas seco}} + P_{v(H_2O)}
P_{\text{gas seco}} = P_{\text{total}} - P_{v(H_2O)}
*(La presión de vapor de agua P_v solo depende de la temperatura y se obtiene de tablas termodinámicas)*.

### 3.6. Ley de Difusión y Efusión Gaseosa de Thomas Graham (1829)
* **Difusión:** Proceso espontáneo de dispersión y mezcla de un gas a través de otro.
* **Efusión:** Escape de un gas a través de un orificio microscópico hacia una zona de menor presión o vacío.
"A condiciones idénticas de presión y temperatura, las velocidades de difusión o efusión de dos gases son inversamente proporcionales a las raíces cuadradas de sus respectivas masas molares o densidades":
\frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}} = \sqrt{\frac{\rho_2}{\rho_1}} = \frac{t_2}{t_1}
*(Los gases más livianos como el H_2 o el He se difunden a velocidades mucho mayores que los gases pesados como el O_2, CO_2 o SO_2)*.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* **Ecuación de Van der Waals:**
  \left(P + \frac{a \cdot n^2}{V^2}\right)(V - n \cdot b) = n \cdot R \cdot T
  Donde a corrige las fuerzas atractivas intermoleculares y b corrige el volumen propio ocupado por las moléculas (covolumen).

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Ecuación Universal:** **"Pavo = Ratón"**
  P \cdot V = R \cdot T \cdot n
* **Mnemotecnia Densidad de un Gas:** **"Puma = Rata"**
  P \cdot \overline{M} = \rho \cdot R \cdot T
* **Mnemotecnia Ecuación Combinada:** **"Pavo Triste 1 = Pavo Triste 2"**
  \frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Operar con temperaturas en grados Celsius (^\circ\text{C}).** Si divides o multiplicas por T(^\circ\text{C}), todo el problema se anula. DEBES sumar siempre 273 para convertir a Kelvin (K).
* **Trampa 2: Olvidar restar la presión de vapor del agua en gases recolectados sobre agua.** Si te dicen "gas recolectado sobre agua a 20^\circ\text{C} con presión total de 750\text{ mmHg} y P_v(H_2O) = 17.5\text{ mmHg}", la presión del gas seco para usar en PV=nRT es 750 - 17.5 = 732.5\text{ mmHg}.
* **Trampa 3: Invertir las masas en la Ley de Graham.** Es una proporción inversa: \frac{v_1}{v_2} = \sqrt{\frac{M_2}{M_1}}. En tiempos de efusión se invierte: el gas pesado tarda más tiempo, por lo que \frac{t_1}{t_2} = \sqrt{\frac{M_1}{M_2}}.

---
