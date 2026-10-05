## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  La fuerza magnética actúa como fuerza centrípeta:
  F_B = F_c \implies |q| v B = \frac{m v^2}{R} \implies R = \frac{m v}{|q| B} = \frac{p}{|q| B}
  - **Periodo del Movimiento Ciclotrónico (T):**
    T = \frac{2\pi R}{v} = \frac{2\pi m}{|q| B} \quad (\text{Independiente del radio y de la velocidad})
  - Si \vec{v} forma un ángulo 0^\circ < \theta < 90^\circ con \vec{B}, la trayectoria es una **hélice circular** de paso:
    p = v_\parallel \cdot T = (v \cos\theta) \frac{2\pi m}{|q| B}

### 3.3. Fuerza Magnética sobre Conductores con Corriente
Para un conductor rectilíneo de longitud \vec{L} que transporta una corriente continua I en un campo \vec{B} uniforme:
\vec{F}_B = I (\vec{L} \times \vec{B}) \implies F_B = I L B \sin\theta
- **Fuerza entre dos conductores paralelos largos:**
  Dos conductores paralelos separados una distancia d que transportan corrientes I_1 e I_2:
  \frac{F}{L} = \frac{\mu_0 I_1 I_2}{2\pi d}
  - Si las corrientes circulan en el **mismo sentido**: se **atraen**.
  - Si las corrientes circulan en **sentidos contrarios**: se **repelen**.
  (Definición oficial del Amperio en el SI histórico).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

### 4.2. Inducción Electromagnética
1. **Flujo Magnético (\Phi):** Medida del número de líneas de campo magnético que atraviesan una superficie de área A:
   \Phi = \vec{B} \cdot \vec{A} = B A \cos\theta \quad [\text{Weber, } \text{Wb} = \text{T}\cdot\text{m}^2]
   (\theta es el ángulo formado entre \vec{B} y el vector normal unitario \hat{n} a la superficie).
2. **Ley de Faraday:** La magnitud de la fuerza electromotriz inducida (\mathcal{E}_{\text{ind}}) en un circuito cerrado es proporcional a la tasa de variación temporal del flujo magnético:
   \mathcal{E}_{\text{ind}} = -N \frac{\Delta\Phi}{\Delta t} = -N \frac{d\Phi}{dt} \quad [\text{Voltios, V}]
3. **Ley de Lenz (el signo negativo en Faraday):**
   "La corriente inducida fluye en un sentido tal que su propio campo magnético inducido se opone estrictamente a la variación del flujo magnético que la origina."
   - Si \Phi aumenta \implies \vec{B}_{\text{ind}} se opone a \vec{B}_{\text{externo}}.
   - Si \Phi disminuye \implies \vec{B}_{\text{ind}} refuerza a \vec{B}_{\text{externo}}.
4. **F.E.M. de Movimiento (Barra Conductora Móvil en Campo Magnético):**
   Para una varilla de longitud L que se desliza perpendicularmente a una velocidad v sobre rieles conductores en presencia de un campo \vec{B} constante:
   \mathcal{E} = B L v
5. **Transformador Ideal:**
   Máquina eléctrica estática basada en inducción mutua que eleva o reduce voltajes alternos sin pérdidas de potencia (P_1 = P_2):
   \frac{V_1}{V_2} = \frac{N_1}{N_2} = \frac{I_2}{I_1}
   - N_1, N_2: Número de espiras en el devanado primario y secundario.

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Trabajo de la Fuerza Magnética):** En cualquier examen tipo admisión, si te preguntan "¿cuánto trabajo realiza el campo magnético sobre un protón en órbita circular?", la respuesta es **siempre CERO JOULES**. La fuerza magnética no acelera linealmente la partícula ni cambia su energía cinética.
- **Trampa 2 (Cargas Negativas en la Mano Derecha):** Al aplicar la regla de la mano derecha a un electrón o ion negativo, recuerda **invertir el sentido del pulgar o de la palma**.
- **Trampa 3 (Ángulo en el Flujo Magnético):** Si el problema dice "el plano de la espira forma un ángulo de 30^\circ con el campo magnético", el ángulo \theta con el vector normal es **60^\circ** (90^\circ - 30^\circ). ¡Error clásico en UNMSM/UNI!
- **Trampa 4 (Corrientes Paralelas):** En electrostática, cargas del mismo signo se repelen; en magnetismo, **corrientes del mismo sentido se ATRAEN**.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fuerza sobre Carga Móvil:**
   > **"F-Q-V-B"** \implies **"Física: Qué Viva Bacán"** (F = q \cdot v \cdot B \cdot \sin\theta).
2. **Fuerza sobre Conductor:**
   > **"F = B-I-L"** \implies **"BILlete"** (F = B \cdot I \cdot L \cdot \sin\theta).
3. **Radio de Giro Ciclotrón:**
   > **"R = M-V / Q-B"** \implies **"Rojo: Mi Vaca Quema Basura"** (R = \frac{mv}{qB}).
4. **Campo del Conductor Rectilíneo:**
   > **"B = μ I / (2 π d)"** \implies *"Dos píos de distancia"*.
5. **Campo de la Espira en el Centro:**
   > **"B = μ I / (2 R)"** \implies *"Dos radios sin pi"*.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Medicina Diagnóstica (Resonancia Magnética Nuclear - RMN):** Utiliza campos magnéticos superconductores intensos (de 1.5 a 3\text{ Tesla}) para alinear el espín nuclear de los protones de hidrógeno corporales; pulsos de radiofrecuencia generan señales detectadas por inducción de Faraday para reconstruir imágenes anatómicas de alta resolución.
- **Geofísica y Paleomagnetismo:** El efecto dínamo en el núcleo externo de hierro líquido fundido de la Tierra produce el campo geomagnético planetario, el cual desvía el viento solar (cinturones de Van Allen) y genera las auroras polares por fuerza de Lorentz.
- **Transporte de Levitación Magnética (Maglev):** Emplea la repulsión electrodinámica entre electroimanes superconductores en el tren y bobinas en la vía para levitar a 15\text{ cm} del suelo y eliminar el rozamiento mecánico, alcanzando velocidades superiores a 600\text{ km/h}.

---

## Flujo magnético e inducción

El flujo magnético a través de una superficie plana en campo uniforme es Φ = BA cos θ, donde θ es el ángulo entre el campo y la normal a la superficie. Su unidad es el weber. Si el campo es paralelo al plano de la superficie, el flujo es cero; si es perpendicular, su módulo es máximo.

La ley de Faraday relaciona la fuerza electromotriz inducida con la variación de flujo: ε = −N ΔΦ/Δt en un intervalo o −N dΦ/dt instantáneamente. El signo expresa la oposición descrita por Lenz. Puede variar B, el área efectiva o la orientación. Un campo constante no significa necesariamente flujo constante si la espira gira.
