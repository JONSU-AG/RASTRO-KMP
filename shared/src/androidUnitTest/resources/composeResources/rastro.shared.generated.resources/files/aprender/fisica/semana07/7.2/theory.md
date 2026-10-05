## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
\Delta C = \Delta K, \quad \Delta F = \Delta R, \quad \frac{\Delta C}{5} = \frac{\Delta F}{9} \implies \Delta F = 1.8 \Delta C

### 3.3. Dilatación Térmica
El aumento de agitación molecular distorsiona el pozo de potencial intermolecular asimétrico (potencial de Lennard-Jones), incrementando la distancia media interatómica con el aumento de temperatura.

1. **Dilatación Lineal:**
   \Delta L = L_0 \alpha \Delta T \implies L_f = L_0 (1 + \alpha \Delta T)
   Donde \alpha es el coeficiente de dilatación lineal [^\circ\text{C}^{-1} \text{ o } \text{K}^{-1}].
2. **Dilatación Superficial:**
   \Delta A = A_0 \beta \Delta T \implies A_f = A_0 (1 + \beta \Delta T)
   Para sólidos isotrópicos: \beta \approx 2\alpha.
3. **Dilatación Volumétrica:**
   \Delta V = V_0 \gamma \Delta T \implies V_f = V_0 (1 + \gamma \Delta T)
   Para sólidos isotrópicos: \gamma \approx 3\alpha.
4. **Variación de la Densidad con la Temperatura:**
   Dado que la masa se conserva (m = \rho_0 V_0 = \rho_f V_f):
   \rho_f = \frac{\rho_0}{1 + \gamma \Delta T} \approx \rho_0 (1 - \gamma \Delta T)
5. **Comportamiento Anómalo del Agua:**
   Entre 0^\circ\text{C} y 4^\circ\text{C}, el agua disminuye su volumen al calentarse (\gamma < 0), alcanzando su máxima densidad a 3.98^\circ\text{C} \approx 4^\circ\text{C} (\rho_{\max} \approx 1000 \text{ kg/m}^3). Esto permite la vida acuática en lagos congelados en la superficie.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   C_{\text{cal}} = M_{\text{eq}} \cdot c_{\text{agua}} \implies M_{\text{eq}} = \frac{m_{\text{cal}} c_{\text{cal}}}{c_{\text{agua}}}

4. **Principio de Conservación de la Energía Térmica (Ley Cero):**
   En un sistema adiabáticamente aislado:
   \sum Q_{\text{ganados}} + \sum Q_{\text{perdidos}} = 0 \iff \sum Q_{\text{ganados}} = \sum |Q_{\text{perdidos}}|

### 4.2. Cambio de Fase y Calor Latente
Durante un cambio de fase de una sustancia pura a presión constante, la temperatura permanece estrictamente invariante:
Q_L = \pm m L
- L_f (calor latente de fusión del hielo a 1\text{ atm}, 0^\circ\text{C}):
  L_f = 80 \text{ cal/g} = 3.34 \times 10^5 \text{ J/kg}
- L_v (calor latente de vaporización del agua a 1\text{ atm}, 100^\circ\text{C}):
  L_v = 540 \text{ cal/g} = 2.26 \times 10^6 \text{ J/kg}

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Mezclas con Hielo y Agua):** Nunca asumas a priori que todo el hielo se derrite o que la temperatura de equilibrio es > 0^\circ\text{C}. Primero calcula el calor necesario para llevar todo el hielo a 0^\circ\text{C} y fundirlo:
  Q_{\text{req}} = m_h c_h (0 - T_h) + m_h L_f
  Calcula el calor máximo que el agua caliente puede ceder enfriándose hasta 0^\circ\text{C}:
  Q_{\text{disp}} = m_a c_a (T_a - 0)
  Si Q_{\text{disp}} < Q_{\text{req}}, la temperatura final es **obligatoriamente 0^\circ\text{C}** y solo se funde una fracción de hielo.
- **Trampa 2 (Orificios en Placas Metálicas):** Cuando una placa metálica con un orificio central se calienta, **el orificio se expande exactamente con el mismo coeficiente de dilatación que si estuviera lleno del mismo material**. ¡Jamás se encoge!
- **Trampa 3 (Confundir \Delta T con T):** Una elevación de 20^\circ\text{C} equivale a una elevación de 20 \text{ K}, pero una temperatura de 20^\circ\text{C} equivale a 293 \text{ K}.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fórmula del Calor Sensible:**
   > **"QUÉ MA-CE-TA"** \implies Q = m \cdot c_e \cdot \Delta T
2. **Fórmula del Calor Latente:**
   > **"QUÉ MA-LA"** \implies Q = m \cdot L
3. **Escalas Termométricas:**
   > **"Cinco Fríos Restan Nueve"** \implies \frac{C}{5} = \frac{F-32}{9}
4. **Relación entre coeficientes de dilatación:**
   > **\alpha : \beta : \gamma = 1 : 2 : 3** (Lineal \to 1D, Superficie \to 2D, Volumen \to 3D).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Geología y Meteorología:** La elevada capacidad calorífica del agua (c = 1.0\ \text{cal/g}^\circ\text{C}) actúa como un amortiguador térmico planetario, regulando el clima costero e impidiendo oscilaciones térmicas extremas como las observadas en la Luna o en Marte.
- **Ingeniería Civil e Industrial:** Juntas de dilatación en puentes, rieles de ferrocarril y pavimentos de concreto evitan esfuerzos mecánicos catastróficos causados por la expansión térmica estacional.
- **Biología Marina:** La máxima densidad del agua a 4^\circ\text{C} asegura que los lagos se congelen de arriba hacia abajo, formando una capa superficial aislante de hielo que preserva el agua líquida en el fondo y sostiene la vida acuática durante el invierno.

---

## Equilibrio térmico y capacidad calorífica

Dos cuerpos están en equilibrio térmico cuando no existe transferencia neta de calor entre ellos por diferencia de temperatura. La ley cero permite comparar temperaturas mediante un tercer sistema. Temperatura no equivale a calor: calor es energía transferida por diferencia térmica.

La capacidad calorífica C relaciona calor recibido y variación de temperatura; el calor específico c es capacidad por unidad de masa. Cuando no hay cambio de fase y el modelo admite c constante, Q = mcΔT y C = mc. Para un sistema térmicamente aislado sin pérdidas, la suma de intercambios de calor es cero. Los cambios de fase requieren considerar calor latente y no pueden resolverse únicamente con mcΔT.
