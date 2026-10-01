# TEMA 12: FÍSICA MODERNA

---

## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 12 - FÍSICA MODERNA (CUÁNTICA, RELATIVIDAD Y FÍSICA NUCLEAR)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), POSTULADOS Y MODELOS CUÁNTICO-RELATIVISTAS
========================================================================================
```

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[FÍSICA MODERNA] --> B[Física Cuántica Temprana]
    A --> C[Relatividad Especial de Einstein]
    A --> D[Física Nuclear y Radiactividad]

    B --> B1[Radiación de Cuerpo Negro: Hipótesis de Planck E = hf]
    B --> B2[Efecto Fotoeléctrico: hf = Φ + Ec_max]
    B --> B3[Longitud de Onda de De Broglie: λ = h / p]
    B --> B4[Principio de Incertidumbre de Heisenberg: Δx Δp ≥ ℏ/2]

    C --> C1[Postulados: Invariancia de c y Covarianza de Leyes]
    C --> C2[Factor de Lorentz: γ = 1 / √(1 - v²/c²)]
    C --> C3[Dilatación Temporal t = γ t₀ y Contracción L = L₀/γ]
    C --> C4[Equivalencia Masa-Energía: E = mc²]

    D --> D1[Desintegraciones Radiactivas: α, β⁻, β⁺, γ]
    D --> D2[Ley de Decaimiento: N(t) = N₀ e^(-λt)]
    D --> D3[Periodo de Semidesintegración: t_1/2 = ln 2 / λ]
    D --> D4[Defecto de Masa y Fisión / Fusión Nuclear]
```

---

## 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Crisis de la Física Clásica e Hipótesis de Planck
A finales del siglo XIX, la física clásica (electrodinámica de Maxwell y termodinámica estadística) fracasó al explicar la radiación térmica emitida por un cuerpo negro ideal.
- **La Catástrofe Ultravioleta:** La ley clásica de Rayleigh-Jeans predecía que la densidad de energía radiada tendía a infinito en frecuencias ultravioletas elevadas ($\lambda \to 0$), violando la conservación de energía.
- **Hipótesis Cuántica de Max Planck (1900):** La energía electromagnética no se emite ni se absorbe en forma continua, sino en paquetes discretos llamados *cuantos* (fotones), proporcionales a la frecuencia de oscilación de las cargas:
  $$E = n h f = n \frac{h c}{\lambda} \quad (n = 1, 2, 3, \dots)$$
  - Constante de Planck:
    $$h \approx 6.626 \times 10^{-34}\ \text{J}\cdot\text{s} \approx 4.136 \times 10^{-15}\ \text{eV}\cdot\text{s}$$
  - Constante reducida (Dirac): $\hbar = \frac{h}{2\pi} \approx 1.054 \times 10^{-34}\ \text{J}\cdot\text{s}$.
  - Equivalencia energética común: $h c \approx 1240\ \text{eV}\cdot\text{nm}$.

### 3.2. Efecto Fotoeléctrico de Albert Einstein (Premio Nobel 1921)
Fenómeno mediante el cual la radiación electromagnética incide sobre una superficie metálica y arranca electrones (fotoelectrones).
- **Inconsistencias con la Teoría Ondulatoria Clásica:**
  1. Clásicamente, la energía de los electrones expulsados debía aumentar con la intensidad de la luz incidente; experimentalmente depende exclusivamente de la **frecuencia** ($f$).
  2. Clásicamente, cualquier frecuencia con suficiente intensidad debía arrancar electrones tras un tiempo de acumulación; experimentalmente existe una **frecuencia umbral** ($f_0$) por debajo de la cual no hay emisión fotoeléctrica, independientemente de la intensidad o tiempo de exposición.
  3. La emisión es prácticamente **instantánea** ($\Delta t < 10^{-9}\text{ s}$).
- **Ecuación Fotoeléctrica de Einstein:**
  Cada fotón colisiona individualmente con un electrón del metal, cediéndole toda su energía:
  $$E_{\text{fotón}} = \Phi + E_{c,\max} \iff h f = \Phi + \frac{1}{2} m v_{\max}^2$$
  - $\Phi = h f_0 = \frac{h c}{\lambda_0}$: Función trabajo o función de extracción (energía mínima de ligadura del electrón al metal) $[\text{eV} \text{ o } \text{J}]$.
  - $f_0$: Frecuencia umbral.
  - $\lambda_0$: Longitud de onda de corte máxima para emisión.
- **Potencial de Frenado o de Corte ($V_s$):**
  Diferencia de potencial eléctrico retardador necesario para detener a los fotoelectrones más energéticos:
  $$E_{c,\max} = e V_s \implies e V_s = h f - \Phi \implies V_s = \left(\frac{h}{e}\right) f - \frac{\Phi}{e}$$
  (Gráfica de $V_s$ vs $f$: recta lineal de pendiente universal $h/e$).

### 3.3. Dualidad Onda-Partícula y Principio de Incertidumbre
1. **Hipótesis Ondulatoria de Louis de Broglie (1924):**
   Si la luz (onda clásica) posee propiedades corpusculares (fotones con momento $p = E/c = h/\lambda$), toda partícula material con masa $m$ y velocidad $v$ posee una onda asociada cuya longitud de onda es:
   $$\lambda = \frac{h}{p} = \frac{h}{m v}$$
   Confirmado experimentalmente por la difracción de electrones en cristales de níquel (experimento de Davisson-Germer, 1927).
2. **Principio de Incertidumbre de Werner Heisenberg (1927):**
   Es físicamente imposible determinar simultáneamente y con precisión arbitraria la posición ($x$) y la cantidad de movimiento lineal ($p_x$) de una partícula:
   $$\Delta x \cdot \Delta p_x \ge \frac{\hbar}{2}$$
   Relación análoga tiempo-energía:
   $$\Delta E \cdot \Delta t \ge \frac{\hbar}{2}$$

---

## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Teoría de la Relatividad Especial (Einstein, 1905)
Se fundamenta en dos postulados:
1. **Primer Postulado (Principio de Relatividad):** Las leyes de la física son idénticas en todos los sistemas de referencia inerciales.
2. **Segundo Postulado (Constancia de la Rapidez de la Luz):** La velocidad de la luz en el vacío es una constante universal $c = 3 \times 10^8\text{ m/s}$, independiente del movimiento de la fuente emisora o del observador.

- **Factor de Lorentz ($\gamma$):**
  $$\gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - \frac{v^2}{c^2}}} \quad (\gamma \ge 1)$$
- **Efectos Cinemáticos Relativistas:**
  1. **Dilatación Temporal:** El tiempo medido en un sistema respecto al cual el reloj se mueve ($t$) es mayor que el tiempo propio ($t_0$):
     $$t = \gamma t_0 = \frac{t_0}{\sqrt{1 - v^2/c^2}}$$
  2. **Contracción de la Longitud:** La longitud de un cuerpo en la dirección de su movimiento relativo se contrae respecto a su longitud propia en reposo ($L_0$):
     $$L = \frac{L_0}{\gamma} = L_0 \sqrt{1 - \frac{v^2}{c^2}}$$
- **Dinámica Relativista y Equivalencia Masa-Energía:**
  - Cantidad de movimiento relativista: $\vec{p} = \gamma m_0 \vec{v}$.
  - Energía en reposo: $E_0 = m_0 c^2$.
  - Energía total relativista:
    $$E = \gamma m_0 c^2 = E_k + m_0 c^2$$
  - Relación fundamental energía-momento:
    $$E^2 = (p c)^2 + (m_0 c^2)^2$$
    (Para fotones con $m_0 = 0 \implies E = p c$).

### 4.2. Física Nuclear y Radiactividad
1. **Estructura Nuclear y Defecto de Masa ($\Delta m$):**
   La masa de un núcleo atómico es menor que la suma de las masas de sus nucleones libres constitutivos:
   $$\Delta m = [Z \cdot m_p + (A - Z) \cdot m_n] - m_{\text{núcleo}}$$
   - **Energía de Enlace Nuclear ($E_b$):**
     $$E_b = \Delta m \cdot c^2 \quad (1\text{ u} \cdot c^2 \approx 931.5\text{ MeV})$$
2. **Tipos de Desintegración Radiactiva:**
   - **Alfa ($\alpha$):** Emisión de un núcleo de Helio ($^4_2\text{He}$):
     $$^A_Z X \longrightarrow ^{A-4}_{Z-2} Y + ^4_2\alpha$$
   - **Beta Menos ($\beta^-$):** Emisión de un electrón y un antineutrino electrónico:
     $$^1_0 n \longrightarrow ^1_1 p + ^0_{-1} e^- + \bar{\nu}_e \implies ^A_Z X \longrightarrow ^A_{Z+1} Y + ^0_{-1}\beta^- + \bar{\nu}_e$$
   - **Beta Más ($\beta^+$):** Emisión de un positrón y un neutrino electrónico:
     $$^1_1 p \longrightarrow ^1_0 n + ^0_{+1} e^+ + \nu_e \implies ^A_Z X \longrightarrow ^A_{Z-1} Y + ^0_{+1}\beta^+ + \nu_e$$
   - **Gamma ($\gamma$):** Desexcitación nuclear mediante fotones de altísima energía sin cambio en $A$ ni en $Z$:
     $$^A_Z X^* \longrightarrow ^A_Z X + \gamma$$
3. **Ley de Decaimiento Radiactivo:**
   $$N(t) = N_0 e^{-\lambda t} = N_0 \left(\frac{1}{2}\right)^{t / t_{1/2}}$$
   - $\lambda$: Constante de desintegración radiactiva $[\text{s}^{-1}]$.
   - **Periodo de Semidesintegración o Vida Media ($t_{1/2}$):**
     $$t_{1/2} = \frac{\ln 2}{\lambda} \approx \frac{0.693}{\lambda}$$
   - **Actividad ($A$):** Tasa de desintegración por unidad de tiempo:
     $$A(t) = -\frac{dN}{dt} = \lambda N(t) \quad [\text{Becquerel, Bq} = \text{desint/s}; \quad 1\text{ Curie, Ci} = 3.7 \times 10^{10}\text{ Bq}]$$

---

## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Efecto Fotoeléctrico de Einstein:**
   > **"FOTÓN = TRABAJO + CINÉTICA"** $\implies hf = \Phi + E_{c,\max}$
2. **Longitud de Onda de De Broglie:**
   > **"LAMBDA = HACHE SOBRE PIVO"** $\implies \lambda = \frac{h}{p} = \frac{h}{mv}$
3. **Regla de Soddy-Fajans en Emisión Alfa:**
   > *"El Alfa resta 4 arriba y 2 abajo"* ($A - 4$, $Z - 2$).
4. **Regla de Decaimiento por Periodos:**
   > En cada $t_{1/2}$, la masa remanente se parte a la mitad: $1 \to 1/2 \to 1/4 \to 1/8 \dots \left(\frac{1}{2}\right)^n$.

---

## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Intensidad de la Luz vs. Energía de los Fotoelectrones):** Aumentar la intensidad luminosa (brillo) **NO** incrementa la energía cinética máxima de los electrones ni el potencial de frenado; solo aumenta el número de fotones por segundo y, por tanto, la **corriente fotoeléctrica de saturación**.
- **Trampa 2 (Unidades de Energía en Fotones):** Muy a menudo la función trabajo viene en $\text{eV}$ y la constante $h$ en $\text{J}\cdot\text{s}$. ¡Recuerda convertir siempre con $1\text{ eV} = 1.6 \times 10^{-19}\text{ J}$ o usar $h \approx 4.14 \times 10^{-15}\text{ eV}\cdot\text{s}$!
- **Trampa 3 (Contracción Espacial Transversal):** La contracción de Lorentz ocurre **única y exclusivamente en la dirección paralela a la velocidad**. Las dimensiones perpendiculares al movimiento relativo no se modifican.
- **Trampa 4 (Masa en Relatividad):** La masa propia $m_0$ es un invariante de Lorentz. Cuando una partícula se acelera a velocidades cercanas a $c$, su momento $p = \gamma m_0 v$ y su energía $E = \gamma m_0 c^2$ tienden a infinito, requiriendo un trabajo infinito para alcanzar $c$; de ahí que ninguna partícula con masa propia pueda alcanzar la velocidad de la luz.

---

## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS

### Problema 1: Fotones y Longitud de Onda de De Broglie (Nivel Básico)
**Enunciado:**
a) Calcule la energía en electrón-voltios ($\text{eV}$) de un fotón de luz violeta de longitud de onda $\lambda = 400\text{ nm}$.
b) Calcule la longitud de onda de De Broglie de un electrón ($m = 9.1 \times 10^{-31}\text{ kg}$) que se mueve con una rapidez no relativista de $2 \times 10^6\text{ m/s}$. ($h = 6.63 \times 10^{-34}\text{ J}\cdot\text{s}$, $c = 3 \times 10^8\text{ m/s}$, $1\text{ eV} = 1.6 \times 10^{-19}\text{ J}$).

**Solución paso a paso:**
1. Energía del fotón:
   $$E = \frac{h c}{\lambda} = \frac{(6.63 \times 10^{-34}\text{ J}\cdot\text{s})(3 \times 10^8\text{ m/s})}{400 \times 10^{-9}\text{ m}} = \frac{1.989 \times 10^{-25}}{4 \times 10^{-7}} = 4.9725 \times 10^{-19}\text{ J}$$
   En $\text{eV}$:
   $$E = \frac{4.9725 \times 10^{-19}\text{ J}}{1.6 \times 10^{-19}\text{ J/eV}} \approx 3.11\text{ eV}$$
2. Longitud de onda de De Broglie del electrón:
   $$\lambda = \frac{h}{m v} = \frac{6.63 \times 10^{-34}\text{ J}\cdot\text{s}}{(9.1 \times 10^{-31}\text{ kg})(2 \times 10^6\text{ m/s})} = \frac{6.63 \times 10^{-34}}{1.82 \times 10^{-24}} \approx 3.64 \times 10^{-10}\text{ m} = 0.364\text{ nm}$$

**Respuesta:** a) $E \approx 3.11\text{ eV}$; b) $\lambda_{\text{electrón}} \approx 0.364\text{ nm} = 3.64\text{ \AA}$.

---

### Problema 2: Efecto Fotoeléctrico y Potencial de Frenado (Nivel Intermedio)
**Enunciado:** La función trabajo de una placa metálica de cesio es de $\Phi = 2.14\text{ eV}$. Sobre ella incide una radiación ultravioleta de longitud de onda $\lambda = 300\text{ nm}$. Determine:
a) La energía cinética máxima de los fotoelectrones emitidos.
b) La rapidez máxima de los fotoelectrones.
c) El potencial de frenado requerido para detenerlos. ($h c = 1240\text{ eV}\cdot\text{nm}$, $m_e = 9.1 \times 10^{-31}\text{ kg}$).

**Solución paso a paso:**
1. Energía del fotón incidente:
   $$E_{\text{fotón}} = \frac{h c}{\lambda} = \frac{1240\text{ eV}\cdot\text{nm}}{300\text{ nm}} \approx 4.133\text{ eV}$$
2. Energía cinética máxima (Einstein):
   $$E_{c,\max} = E_{\text{fotón}} - \Phi = 4.133\text{ eV} - 2.14\text{ eV} = 1.993\text{ eV} \approx 2.0\text{ eV}$$
3. Potencial de frenado:
   $$e V_s = E_{c,\max} \implies e V_s = 1.993\text{ eV} \implies V_s = 1.993\text{ V} \approx 2.0\text{ V}$$
4. Rapidez máxima:
   Convertimos la energía cinética a Joules:
   $$E_{c,\max} = 1.993 \times 1.6 \times 10^{-19}\text{ J} \approx 3.19 \times 10^{-19}\text{ J}$$
   $$E_{c,\max} = \frac{1}{2} m_e v_{\max}^2 \implies v_{\max} = \sqrt{\frac{2 E_{c,\max}}{m_e}} = \sqrt{\frac{2(3.19 \times 10^{-19})}{9.1 \times 10^{-31}}} = \sqrt{7.01 \times 10^{11}} \approx 8.37 \times 10^5\text{ m/s}$$

**Respuesta:** a) $E_{c,\max} \approx 2.0\text{ eV}$; b) $v_{\max} \approx 8.37 \times 10^5\text{ m/s}$; c) $V_s \approx 2.0\text{ V}$.

---

### Problema 3: Dilatación Temporal y Contracción Espacial Relativista (Nivel Intermedio-Avanzado)
**Enunciado:** Una nave espacial pasa velozmente frente a una estación espacial a una velocidad de $v = 0.8 c$. Los tripulantes de la nave miden la longitud de su propia nave en $L_0 = 100\text{ m}$ y registran que un experimento dura $\Delta t_0 = 30\text{ minutos}$ en el reloj de abordo. Determine:
a) La longitud de la nave medida por los observadores en la estación espacial.
b) La duración del experimento registrada por los relojes de la estación espacial.

**Solución paso a paso:**
1. Cálculo del factor de Lorentz $\gamma$:
   $$\gamma = \frac{1}{\sqrt{1 - (v/c)^2}} = \frac{1}{\sqrt{1 - (0.8)^2}} = \frac{1}{\sqrt{1 - 0.64}} = \frac{1}{\sqrt{0.36}} = \frac{1}{0.6} = \frac{5}{3} \approx 1.667$$
2. Contracción de longitud observada desde la estación:
   $$L = \frac{L_0}{\gamma} = L_0 \sqrt{1 - 0.8^2} = 100 \times 0.6 = 60\text{ m}$$
3. Dilatación del tiempo observada desde la estación:
   $$\Delta t = \gamma \Delta t_0 = \frac{5}{3} \times (30\text{ min}) = 50\text{ minutos}$$

**Respuesta:** a) La estación mide una longitud de $60\text{ m}$; b) La estación mide un tiempo de $50\text{ minutos}$.

---

### Problema 4: Decaimiento Radiactivo y Datación (Nivel Avanzado)
**Enunciado:** El isótopo radiactivo Fósforo-32 ($^{32}\text{P}$) utilizado en oncología tiene un periodo de semidesintegración de $t_{1/2} = 14.3\text{ días}$. Si un laboratorio recibe una muestra con una actividad inicial de $A_0 = 160\text{ mCi}$, calcule:
a) La constante de desintegración $\lambda$ en $\text{días}^{-1}$.
b) La actividad remanente de la muestra después de $57.2\text{ días}$.
c) El tiempo necesario para que la actividad decaiga al $10\%$ de su valor inicial.

**Solución paso a paso:**
1. Constante de desintegración:
   $$\lambda = \frac{\ln 2}{t_{1/2}} = \frac{0.693}{14.3\text{ días}} \approx 0.04846\text{ días}^{-1}$$
2. Actividad después de $57.2\text{ días}$:
   Calculamos el número de vidas medias transcurridas:
   $$n = \frac{t}{t_{1/2}} = \frac{57.2}{14.3} = 4 \quad (\text{exactamente 4 periodos})$$
   Por la regla de reducción fraccionaria:
   $$A = A_0 \left(\frac{1}{2}\right)^n = 160 \times \left(\frac{1}{2}\right)^4 = \frac{160}{16} = 10\text{ mCi}$$
3. Tiempo para decaer al $10\%$ ($A = 0.10 A_0$):
   $$A = A_0 e^{-\lambda t} \implies 0.10 = e^{-\lambda t} \implies \ln(0.10) = -\lambda t$$
   $$-\ln(10) = -\lambda t \implies t = \frac{\ln 10}{\lambda} = \frac{2.3026}{0.04846} \approx 47.5\text{ días}$$

**Respuesta:** a) $\lambda \approx 0.0485\text{ días}^{-1}$; b) $A = 10\text{ mCi}$; c) $t \approx 47.5\text{ días}$.

---

### Problema 5: Reacción Nuclear y Liberación Energética por Fisión (Boss Challenge)
**Enunciado:** En un reactor nuclear se produce la fisión del Uranio-235 según la ecuación:
$$^1_0 n + ^{235}_{92}\text{U} \longrightarrow ^{141}_{56}\text{Ba} + ^{92}_{36}\text{Kr} + 3\ ^1_0 n + Q$$
Las masas atómicas exactas son:
- $m(^{235}\text{U}) = 235.0439\text{ u}$
- $m(^{141}\text{Ba}) = 140.9144\text{ u}$
- $m(^{92}\text{Kr}) = 91.9261\text{ u}$
- $m(^1_0 n) = 1.00866\text{ u}$
a) Determine el defecto de masa de la reacción en $\text{u}$.
b) Calcule la energía $Q$ liberada por cada núcleo fisionado en $\text{MeV}$.
c) ¿Cuánta energía total en Joules se liberaría por la fisión completa de $1\text{ kg}$ de $^{235}\text{U}$? ($1\text{ u} \cdot c^2 = 931.5\text{ MeV}$, $N_A = 6.022 \times 10^{23}\text{ átomos/mol}$, $1\text{ eV} = 1.6 \times 10^{-19}\text{ J}$).

**Solución paso a paso:**
1. Masa inicial de los reactivos:
   $$m_i = m(^{235}\text{U}) + m(n) = 235.0439 + 1.00866 = 236.05256\text{ u}$$
2. Masa final de los productos:
   $$m_f = m(^{141}\text{Ba}) + m(^{92}\text{Kr}) + 3 m(n)$$
   $$m_f = 140.9144 + 91.9261 + 3(1.00866) = 232.8405 + 3.02598 = 235.86648\text{ u}$$
3. Defecto de masa de la reacción ($\Delta m$):
   $$\Delta m = m_i - m_f = 236.05256 - 235.86648 = 0.18608\text{ u}$$
4. Energía liberada por fisión individual ($Q$):
   $$Q = \Delta m \times 931.5\text{ MeV/u} = 0.18608 \times 931.5 \approx 173.33\text{ MeV}$$
   (Aproximadamente $200\text{ MeV}$ al sumar la radiación gamma y desintegraciones secundarias posteriores).
5. Energía por $1\text{ kg}$ de $^{235}\text{U}$:
   Número de átomos en $1\text{ kg} = 1000\text{ g}$:
   $$N = \frac{1000\text{ g}}{235\text{ g/mol}} \times 6.022 \times 10^{23} = 2.5625 \times 10^{24}\text{ núcleos}$$
   Energía total en $\text{MeV}$:
   $$E_{\text{total}} = (2.5625 \times 10^{24})(173.33\text{ MeV}) \approx 4.44 \times 10^{26}\text{ MeV}$$
   Conversión a Joules:
   $$E_{\text{total}} = (4.44 \times 10^{26} \times 10^6\text{ eV}) \times (1.6 \times 10^{-19}\text{ J/eV}) \approx 7.1 \times 10^{13}\text{ Joules}$$
   *(Equivalente a quemar aproximadamente 2500 toneladas de carbón mineral de alta calidad).*

**Respuesta:** a) $\Delta m = 0.18608\text{ u}$; b) $Q \approx 173.33\text{ MeV}$; c) $E_{\text{total}} \approx 7.1 \times 10^{13}\text{ J}$.

---

## 8. 5 PROBLEMAS PROPUESTOS

1. Si la función trabajo de un metal es $3.0\text{ eV}$, halle la frecuencia umbral por debajo de la cual no se producen fotoelectrones ($h = 4.14 \times 10^{-15}\text{ eV}\cdot\text{s}$).
   - *Pista:* $f_0 = \Phi / h$.
   - *Clave:* $7.25 \times 10^{14}\text{ Hz}$.

2. ¿A qué velocidad debe viajar una partícula para que su masa relativista sea el triple de su masa en reposo?
   - *Pista:* $\gamma = 3 \implies \sqrt{1 - (v/c)^2} = 1/3 \implies 1 - v^2/c^2 = 1/9$.
   - *Clave:* $v = \frac{2\sqrt{2}}{3} c \approx 0.943 c$.

3. Una partícula inestable tiene un tiempo de vida media propio de $2.0\ \mu\text{s}$. Si se desplaza en el laboratorio a $0.99 c$ ($\gamma \approx 7.09$), ¿qué distancia recorrerá en el laboratorio antes de desintegrarse?
   - *Pista:* $d = v \cdot \Delta t_{\text{lab}} = v \cdot (\gamma \Delta t_0)$.
   - *Clave:* $4210\text{ m} \approx 4.21\text{ km}$.

4. Al incidir radiación de $200\text{ nm}$ sobre un metal, el potencial de frenado es de $2.2\text{ V}$. ¿Cuál será el potencial de frenado si incide radiación de $300\text{ nm}$? ($hc = 1240\text{ eV}\cdot\text{nm}$).
   - *Pista:* $E_1 = 6.2\text{ eV} \implies \Phi = 6.2 - 2.2 = 4.0\text{ eV}$. Luego $E_2 = 4.13\text{ eV}$.
   - *Clave:* $0.13\text{ V}$.

5. El periodo de semidesintegración del Radio-226 es de $1600\text{ años}$. ¿Qué fracción de una muestra pura inicial quedará sin desintegrar después de $4800\text{ años}$?
   - *Pista:* $n = 4800 / 1600 = 3$ periodos; fracción $= (1/2)^3$.
   - *Clave:* $1/8$ ($12.5\%$).

---

## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Fotón:** Cuanto elemental indivisible de energía y momento del campo electromagnético, con masa en reposo nula y velocidad $c$ en el vacío.
2. **Función Trabajo ($\Phi$):** Trabajo mínimo requerido para extraer el electrón menos fuertemente ligado de la superficie de un metal sólido.
3. **Frecuencia Umbral ($f_0$):** Frecuencia mínima de la radiación incidente por debajo de la cual el efecto fotoeléctrico es energéticamente imposible.
4. **Potencial de Frenado ($V_s$):** Tensión eléctrica inversa requerida para anular completamente la fotocorriente en un tubo fotoeléctrico.
5. **Longitud de Onda de De Broglie:** Propiedad ondulatoria asociada a cualquier cuerpo material en movimiento proporcional a su cantidad de movimiento lineal ($\lambda = h/p$).
6. **Factor de Lorentz ($\gamma$):** Coeficiente cinemático relativista adimensional que cuantifica la dilatación temporal, la contracción espacial y el incremento de energía relativista.
7. **Tiempo Propio ($t_0$):** Intervalo de tiempo medido por un observador en reposo respecto al reloj que marca los eventos (tiempo mínimo medible).
8. **Defecto de Masa ($\Delta m$):** Diferencia medible entre la suma de las masas individuales de los nucleones aislados y la masa combinada en reposo del núcleo enlazado.
9. **Fisión Nuclear:** Reacción nuclear provocada mediante la cual un núcleo pesado inestable se divide en dos o más fragmentos más ligeros, liberando neutrones y abundante energía.
10. **Fusión Nuclear:** Proceso termonuclear en el cual dos núcleos atómicos ligeros (como deuterio y tritio) colisionan a temperaturas extremas para formar un núcleo más pesado (helio), liberando gigantescas cantidades de energía por gramo.

---

## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿De qué depende la energía cinética máxima de los fotoelectrones en el efecto fotoeléctrico?**
  *R: Exclusivamente de la frecuencia de la luz incidente y de la función trabajo del metal; es independiente de la intensidad de la luz.*
- **P: ¿Qué demostró el experimento de Davisson y Germer?**
  *R: La difracción de electrones en redes cristalinas, confirmando empíricamente la hipótesis ondulatoria de Louis de Broglie.*
- **P: ¿Qué afirma el principio de incertidumbre de Heisenberg?**
  *R: Que es imposible conocer simultáneamente y con precisión absoluta la posición y el momento lineal de una partícula ($\Delta x \cdot \Delta p \ge \hbar/2$).*
- **P: ¿Cómo varía la longitud de una varilla según un observador frente al cual se desplaza a una velocidad relativista $v$?**
  *R: Se contrae en la dirección del movimiento según $L = L_0 \sqrt{1 - v^2/c^2}$.*
- **P: ¿Qué ocurre con el número másico ($A$) y el número atómico ($Z$) tras una emisión alfa ($\alpha$)?**
  *R: El número másico disminuye en 4 ($A - 4$) y el número atómico disminuye en 2 ($Z - 2$).*

---

## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Energía y Transición Energética:** Los reactores nucleares de fisión comercial de cuarta generación y los proyectos de fusión experimental (ITER, National Ignition Facility con confinamiento inercial y magnético Tokamak) buscan recrear la energía de las estrellas para producir electricidad masiva limpia y libre de carbono.
- **Arqueología y Geología:** La datación radiométrica por Carbono-14 ($t_{1/2} = 5730\text{ años}$) y Uranio-Plomo permite determinar con precisión cronológica la edad de fósiles orgánicos, civilizaciones humanas antiguas y la edad de la Tierra ($4540\text{ millones de años}$).
- **Tecnología Cuántica:** Sensores cuánticos de gravedad, criptografía cuántica inmune a espionaje (QKD mediante entrelazamiento de fotones) y transistores cuánticos en computadoras superconductoras operan gracias a los principios de superposición e incertidumbre.

---

## 12. BLOQUE DE GAMIFICACIÓN KMP (JSON)

```json
{
  "curso": "Fisica",
  "tema": "Fisica_Moderna",
  "xp_recompensa": 250,
  "insignia": "Heredero_de_Einstein_y_Planck",
  "desafios": [
    {
      "id": "MOD_01",
      "tipo": "opcion_multiple",
      "pregunta": "¿Qué ocurre si duplicamos la intensidad de la luz que incide sobre una celda fotoeléctrica manteniendo la frecuencia constante?",
      "opciones": [
        "Se duplica el número de electrones emitidos por segundo (fotocorriente)",
        "Se duplica la energía cinética máxima de los fotoelectrones",
        "Se duplica el potencial de frenado",
        "La frecuencia umbral disminuye a la mitad"
      ],
      "respuesta_correcta": 0,
      "explicacion": "Mayor intensidad lumínica implica mayor cantidad de fotones incidentes por unidad de tiempo, duplicando la cantidad de electrones expulsados, pero la energía cinética de cada electrón individual no cambia."
    },
    {
      "id": "MOD_02",
      "tipo": "opcion_multiple",
      "pregunta": "Un fotón en el vacío tiene masa en reposo nula. ¿Cuál es su cantidad de movimiento p en función de su energía E y de c?",
      "opciones": [
        "p = E / c",
        "p = E * c",
        "p = E / c²",
        "p = 0"
      ],
      "respuesta_correcta": 0,
      "explicacion": "De la relación relativista general E² = (pc)² + (m₀c²)² con m₀ = 0, se deduce directamente E = pc -> p = E / c."
    },
    {
      "id": "MOD_03",
      "tipo": "calculo_numerico",
      "pregunta": "Una sustancia radiactiva con periodo de 10 días tiene inicialmente 80 gramos. ¿Cuántos gramos quedarán sin desintegrar después de 30 días?",
      "respuesta_correcta": 10.0,
      "tolerancia": 0.05,
      "explicacion": "Han transcurrido 30/10 = 3 periodos. m = 80 * (1/2)³ = 80 / 8 = 10.0 g."
    }
  ]
}
```
