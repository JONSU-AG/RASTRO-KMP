## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   \vec{E} = \lim_{q_0 \to 0} \frac{\vec{F}}{q_0} \quad \left[\frac{\text{N}}{\text{C}} = \frac{\text{V}}{\text{m}}\right]
   Para una carga puntual Q:
   \vec{E} = k_e \frac{Q}{r^2} \hat{r} \quad (\text{Radial saliente si } Q > 0, \text{ radial entrante si } Q < 0)
   Principio de superposición: \vec{E}_{\text{neto}} = \sum \vec{E}_i.
2. **Potencial Eléctrico (V):** Magnitud escalar que mide la energía potencial electrostática por unidad de carga testigo:
   V = \frac{U_e}{q_0} \quad [\text{Voltio, } \text{V} = \text{J/C}]
   Para una carga puntual Q (con referencia V_\infty = 0):
   V = k_e \frac{Q}{r}
   Superposición escalar: V_{\text{total}} = \sum V_i (considerando signos algebraicos).
3. **Trabajo del Campo Eléctrico y Diferencia de Potencial (\Delta V):**
   Dado que el campo electrostático es conservativo:
   W_{A \to B}^{\text{campo}} = -\Delta U_e = q (V_A - V_B)
   W_{A \to B}^{\text{agente externo (sin acel.)}} = \Delta U_e = q (V_B - V_A) = q \Delta V
4. **Campo Uniforme entre Placas Paralelas:**
   E = \frac{\Delta V}{d} \iff V_A - V_B = E \cdot d
   (Las líneas de campo apuntan hacia donde el potencial disminuye).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   V = I \cdot R \iff I = \frac{V}{R} \quad \left(R = \text{cte para conductores óhmicos}\right)
4. **Asociación de Resistencias:**
   - **En Serie (igual corriente I):**
     R_{\text{eq}} = R_1 + R_2 + \dots + R_n
   - **En Paralelo (igual voltaje V):**
     \frac{1}{R_{\text{eq}}} = \frac{1}{R_1} + \frac{1}{R_2} + \dots + \frac{1}{R_n} \implies (\text{para dos}): R_{\text{eq}} = \frac{R_1 R_2}{R_1 + R_2}

### 4.3. Circuitos de Corriente Continua y Leyes de Kirchhoff
1. **Fuerza Electromotriz (\mathcal{E}) y Resistencia Interna (r):**
   Tensión en bornes de una fuente real:
   V_{\text{ab}} = \mathcal{E} - I r \quad (\text{en descarga/generador})
   V_{\text{ab}} = \mathcal{E} + I r \quad (\text{en carga/receptor})
2. **Primera Ley de Kirchhoff (Ley de Nudos - Conservación de Carga):**
   \sum I_{\text{entrantes}} = \sum I_{\text{salientes}} \iff \sum I_{\text{nudo}} = 0
3. **Segunda Ley de Kirchhoff (Ley de Mallas - Conservación de Energía):**
   \sum_{\text{malla cerrada}} \Delta V = 0 \iff \sum \mathcal{E} = \sum I R
4. **Potencia Eléctrica y Efecto Joule:**
   P = V \cdot I = I^2 R = \frac{V^2}{R} \quad [\text{Watt, W}]
   Energía disipada en forma de calor (Ley de Joule):
   Q = P \cdot \Delta t = I^2 R \Delta t \quad [\text{Joule}] \approx 0.24\, I^2 R \Delta t \quad [\text{calorías}]
5. **Instrumentos de Medida Ideales:**
   - **Amperímetro:** Se conecta estrictamente en **serie**; resistencia interna ideal R_A \to 0.
   - **Voltímetro:** Se conecta estrictamente en **paralelo**; resistencia interna ideal R_V \to \infty.

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Asociaciones Inversas de R y C):** Los condensadores se asocian de forma **inversa** a las resistencias:
  - Condensadores en paralelo: **se suman directamente** (C_{\text{eq}} = C_1 + C_2).
  - Resistencias en paralelo: **se suman las inversas** (1/R_{\text{eq}} = 1/R_1 + 1/R_2).
- **Trampa 2 (Estiramiento de un Conductor Metálico):** Si un alambre de resistencia R se estira hasta duplicar su longitud sin perder masa, **su volumen se conserva** (V = A \cdot L = \text{cte}). Por lo tanto, si la longitud se duplica (L' = 2L), el área se reduce a la mitad (A' = A/2). La nueva resistencia se cuadruplica:
  R' = \rho \frac{2L}{A/2} = 4 \left(\rho \frac{L}{A}\right) = 4R
  *(Fórmula hack: R' = n^2 R, donde n es el factor de elongación).*
- **Trampa 3 (Condensador en Corriente Continua Estable):** En régimen estacionario de corriente continua, una rama que contiene un condensador cargado actúa como un **circuito abierto** (I = 0 por esa rama).
- **Trampa 4 (Puente de Wheatstone):** Si en un cuadrilátero de resistencias se cumple el producto cruzado R_1 R_4 = R_2 R_3, el potencial entre los nodos intermedios es igual (\Delta V = 0) y la resistencia conectada en ese puente **puede eliminarse del circuito**.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Ley de Ohm:**
   > **"VICTORIA = REINA DE INGLATERRA"** \implies V = R \cdot I
2. **Potencia Eléctrica:**
   > **"P-V-I"** \implies P = V \cdot I; y **"P = I²R"** ("Puro Indio al Cuadrado con Resistencia").
3. **Ley de Pouillet:**
   > **"RE-PO-L-A"** \implies R = \rho \cdot \frac{L}{A}
4. **Regla de los signos en Mallas (Kirchhoff):**
   > *"Al cruzar una resistencia a favor de la corriente: resta potencial (-IR). Al salir por la placa larga de la pila: suma f.e.m. (+\mathcal{E})."*

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurobiología y Fisiología:** Las neuronas transmiten impulsos nerviosos a través de potenciales de acción generados por gradientes electroquímicos de iones \text{Na}^+ y \text{K}^+, modelados mediante la ecuación de Nernst y circuitos equivalentes RC de membrana celular.
- **Microelectrónica:** Los transistores MOSFET, base de la computación moderna y los procesadores, modulan canales conductores mediante campos eléctricos en la puerta aislada por dióxido de silicio (óxido-semiconductor).
- **Seguridad Eléctrica Industrial:** Los interruptores diferenciales miden la Primera Ley de Kirchhoff en tiempo real: si la corriente entrante por la fase difiere de la corriente de retorno por el neutro (\Delta I > 30\text{ mA}), desconectan el circuito en milisegundos para evitar electrocuciones por fuga a tierra.

---

## Energía potencial eléctrica y potencial

El potencial eléctrico V es energía potencial por unidad de carga de prueba: V = U/q. Es una magnitud escalar y su unidad es J/C, llamada voltio. El campo eléctrico es vectorial y expresa fuerza por unidad de carga. No deben confundirse potencial, energía potencial y campo.

Al mover una carga q entre dos puntos, ΔU = qΔV. El trabajo del campo es W = −ΔU. Una carga positiva reduce su energía potencial al pasar hacia menor potencial; una negativa puede hacer lo contrario. Para una carga puntual con referencia en el infinito, V = kQ/r; los potenciales de varias cargas se suman algebraicamente con sus signos.
