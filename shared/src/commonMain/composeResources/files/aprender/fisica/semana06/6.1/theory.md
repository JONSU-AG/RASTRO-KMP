## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

El Trabajo y la Energía constituyen los principios unificadores fundamentales de la física clásica, permitiendo analizar sistemas mecánicos complejos mediante magnitudes escalares sin recurrir a la integración directa de ecuaciones vectoriales de movimiento:
1. **Trabajo Mecánico (W):** Magnitud escalar que cuantifica la transferencia de movimiento o deformación debida a una fuerza que actúa a lo largo de un desplazamiento (W = \vec{F} \cdot \Delta\vec{r} = F d \cos\theta, unidad SI: el **joule [\text{J} = \text{N}\cdot\text{m}]**). Trabajo de fuerzas variables mediante el cálculo integral y el área bajo la curva F vs. x.
2. **Potencia Mecánica (P):** Rapidez temporal con la que se transfiere energía o se realiza trabajo mecánico (P = W/\Delta t = \vec{F} \cdot \vec{v}, unidad SI: el **watt [\text{W} = \text{J/s}]**). Eficiencia mecánica o rendimiento de máquinas (\eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\%).
3. **Energía Mecánica (E_m):** Capacidad que posee un sistema material para realizar trabajo mecánico:
   - **Energía Cinética (E_c = \frac{1}{2} m v^2):** Asociada al estado de movimiento.
   - **Energía Potencial Gravitatoria (E_{pg} = m g h):** Asociada a la posición en el campo gravitatorio.
   - **Energía Potencial Elástica (E_{pe} = \frac{1}{2} k x^2):** Asociada a la deformación reversible de un resorte.
4. **Teoremas Fundamentales:**
   - **Teorema del Trabajo y la Energía Cinética (Teorema de las Fuerzas Vivas):** El trabajo neto de todas las fuerzas actuantes es igual a la variación de la energía cinética (W_{\text{neto}} = \Delta E_c).
   - **Conservación de la Energía Mecánica:** En presencia exclusiva de **fuerzas conservativas** (peso, fuerza elástica), la energía mecánica total permanece constante (E_{m1} = E_{m2}).
   - **Teorema de las Fuerzas No Conservativas:** En presencia de fricción o fuerzas disipativas: W_{FNC} = \Delta E_m = E_{mf} - E_{m0}.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. TRABAJO MECÁNICO

El trabajo mecánico cuantifica la acción motriz o resistente que ejerce una fuerza al desplazar a un cuerpo a lo largo de una trayectoria:

#### A. Trabajo Realizado por una Fuerza Constante
Si una fuerza constante \vec{F} desplaza una partícula en línea recta una distancia \vec{d} = \Delta \vec{r}:
W = \vec{F} \cdot \vec{d} = F \cdot d \cdot \cos\theta
Donde \theta es el ángulo comprendido entre el vector fuerza \vec{F} y el vector desplazamiento \vec{d}.
- **Unidad en el SI:** Joule (\text{J}), donde 1\text{ J} = 1\text{ N}\cdot\text{m} = 1\text{ kg}\cdot\text{m}^2/\text{s}^2.
- **Fórmula Dimensional:** [W] = ML^2T^{-2}.
- **Signo Físico del Trabajo:**
  - **Trabajo Motor o Positivo (W > 0):** Cuando 0^\circ \le \theta < 90^\circ (\cos\theta > 0). La fuerza colabora con el movimiento, transfiriendo energía al cuerpo (máximo cuando \theta = 0^\circ \implies W = F \cdot d).
  - **Trabajo Resistente o Negativo (W < 0):** Cuando 90^\circ < \theta \le 180^\circ (\cos\theta < 0). La fuerza se opone al movimiento, extrayendo energía del cuerpo (ej. fuerza de rozamiento cinético: \theta = 180^\circ \implies W_{f_k} = -f_k \cdot d).
  - **Trabajo Nulo (W = 0):** Cuando \theta = 90^\circ (\cos 90^\circ = 0). **Una fuerza perpendicular al desplazamiento NO realiza trabajo mecánico** (ej. la fuerza normal en un plano horizontal, o la fuerza centrípeta en cualquier movimiento circular: W_{F_c} = 0).

#### B. Trabajo Realizado por una Fuerza Variable Unidimensional
Para una fuerza cuya magnitud varía a lo largo de la trayectoria rectilínea F_x(x):
W = \int_{x_1}^{x_2} F_x(x) \, dx
- **Interpretación Gráfica:** En una gráfica de Fuerza versus Posición (F vs. x), **el área bajo la curva comprendida entre las posiciones inicial y final representa exactamente el trabajo mecánico realizado**:
  W_{x_1 \to x_2} = \text{Área bajo la curva } F-x
  *(Las áreas por encima del eje X representan trabajo positivo y las áreas por debajo trabajo negativo).*

#### C. Trabajo de Fuerzas Notables
1. **Trabajo de la Fuerza de Gravedad (Peso):**
   W_g = \pm m g h
   - Signo + si el cuerpo desciende (a favor de la gravedad).
   - Signo - si el cuerpo asciende (en contra de la gravedad).
   - *Propiedad:* Es independiente de la trayectoria; solo depende del desnivel vertical entre la posición inicial y final:
     W_g = -mg(y_f - y_0) = -\Delta E_{pg}
2. **Trabajo de la Fuerza Elástica (Resorte de Hooke):**
   Dado que F_e = -kx, al estirar o comprimir el resorte desde una posición x_1 hasta x_2:
   W_{\text{resorte}} = \int_{x_1}^{x_2} (-kx) \, dx = -\frac{1}{2} k x_2^2 + \frac{1}{2} k x_1^2 = -\Delta E_{pe}
3. **Trabajo Neto o Total (W_{\text{neto}}):**
   Es la suma algebraica de los trabajos realizados por todas las fuerzas individuales que actúan sobre el cuerpo, o equivalentemente el trabajo de la fuerza resultante:
   W_{\text{neto}} = \sum_{i=1}^{n} W_i = \vec{F}_R \cdot \Delta \vec{r}

---

### 2.2. POTENCIA MECÁNICA Y RENDIMIENTO

La potencia mecánica es la rapidez con la que se transfiere energía o se ejecuta trabajo mecánico:
1. **Potencia Media (P_m):**
   P_m = \frac{W}{\Delta t} \quad [\text{J/s} = \text{Watt (W)}]
   - Equivalencias clásicas:
     1\text{ Kilowatt (kW)} = 1000\text{ W}
     1\text{ Caballo de Vapor (CV)} \approx 735.5\text{ W}
     1\text{ Caballo de Fuerza (HP)} \approx 746\text{ W}
2. **Potencia Instantánea (P):**
   P = \frac{dW}{dt} = \frac{\vec{F} \cdot d\vec{r}}{dt} = \vec{F} \cdot \vec{v} = F \cdot v \cos\theta
   Si la fuerza y la velocidad son colineales y del mismo sentido:
   P = F \cdot v
3. **Eficiencia Mecánica o Rendimiento (\eta):**
   En toda máquina real, parte de la potencia consumida o entregada se disipa en calor debido a la fricción interna y viscosidad:
   P_{\text{entregada (total)}} = P_{\text{útil (aprovechada)}} + P_{\text{perdida (disipada)}}
   \eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\% \quad (0 < \eta < 100\%)

---


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES Y RELACIONES MATEMÁTICAS

1. **Trabajo Mecánico:**
   W = F \cdot d \cdot \cos\theta
   W = \text{Área}_{F-x}
   W_{\text{gravedad}} = \pm mgh
   W_{\text{resorte}} = -\left(\frac{1}{2}kx_f^2 - \frac{1}{2}kx_i^2\right)

2. **Potencia y Eficiencia:**
   P_m = \frac{W}{\Delta t}, \quad P = \vec{F} \cdot \vec{v} = F v \cos\theta
   \eta = \frac{P_{\text{útil}}}{P_{\text{entregada}}} \times 100\%
