## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Crisis de la Física Clásica e Hipótesis de Planck
A finales del siglo XIX, la física clásica (electrodinámica de Maxwell y termodinámica estadística) fracasó al explicar la radiación térmica emitida por un cuerpo negro ideal.
- **La Catástrofe Ultravioleta:** La ley clásica de Rayleigh-Jeans predecía que la densidad de energía radiada tendía a infinito en frecuencias ultravioletas elevadas (\lambda \to 0), violando la conservación de energía.
- **Hipótesis Cuántica de Max Planck (1900):** La energía electromagnética no se emite ni se absorbe en forma continua, sino en paquetes discretos llamados *cuantos* (fotones), proporcionales a la frecuencia de oscilación de las cargas:
  E = n h f = n \frac{h c}{\lambda} \quad (n = 1, 2, 3, \dots)
  - Constante de Planck:
    h \approx 6.626 \times 10^{-34}\ \text{J}\cdot\text{s} \approx 4.136 \times 10^{-15}\ \text{eV}\cdot\text{s}
  - Constante reducida (Dirac): \hbar = \frac{h}{2\pi} \approx 1.054 \times 10^{-34}\ \text{J}\cdot\text{s}.
  - Equivalencia energética común: h c \approx 1240\ \text{eV}\cdot\text{nm}.

### 3.2. Efecto Fotoeléctrico de Albert Einstein (Premio Nobel 1921)
Fenómeno mediante el cual la radiación electromagnética incide sobre una superficie metálica y arranca electrones (fotoelectrones).
- **Inconsistencias con la Teoría Ondulatoria Clásica:**
  1. Clásicamente, la energía de los electrones expulsados debía aumentar con la intensidad de la luz incidente; experimentalmente depende exclusivamente de la **frecuencia** (f).
  2. Clásicamente, cualquier frecuencia con suficiente intensidad debía arrancar electrones tras un tiempo de acumulación; experimentalmente existe una **frecuencia umbral** (f_0) por debajo de la cual no hay emisión fotoeléctrica, independientemente de la intensidad o tiempo de exposición.
  3. La emisión es prácticamente **instantánea** (\Delta t < 10^{-9}\text{ s}).
- **Ecuación Fotoeléctrica de Einstein:**
  Cada fotón colisiona individualmente con un electrón del metal, cediéndole toda su energía:
  E_{\text{fotón}} = \Phi + E_{c,\max} \iff h f = \Phi + \frac{1}{2} m v_{\max}^2

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Teoría de la Relatividad Especial (Einstein, 1905)
Se fundamenta en dos postulados:
1. **Primer Postulado (Principio de Relatividad):** Las leyes de la física son idénticas en todos los sistemas de referencia inerciales.
2. **Segundo Postulado (Constancia de la Rapidez de la Luz):** La velocidad de la luz en el vacío es una constante universal c = 3 \times 10^8\text{ m/s}, independiente del movimiento de la fuente emisora o del observador.

- **Factor de Lorentz (\gamma):**
  \gamma = \frac{1}{\sqrt{1 - \beta^2}} = \frac{1}{\sqrt{1 - \frac{v^2}{c^2}}} \quad (\gamma \ge 1)
- **Efectos Cinemáticos Relativistas:**
  1. **Dilatación Temporal:** El tiempo medido en un sistema respecto al cual el reloj se mueve (t) es mayor que el tiempo propio (t_0):
     t = \gamma t_0 = \frac{t_0}{\sqrt{1 - v^2/c^2}}
  2. **Contracción de la Longitud:** La longitud de un cuerpo en la dirección de su movimiento relativo se contrae respecto a su longitud propia en reposo (L_0):
     L = \frac{L_0}{\gamma} = L_0 \sqrt{1 - \frac{v^2}{c^2}}
- **Dinámica Relativista y Equivalencia Masa-Energía:**
  - Cantidad de movimiento relativista: \vec{p} = \gamma m_0 \vec{v}.
  - Energía en reposo: E_0 = m_0 c^2.
  - Energía total relativista:
    E = \gamma m_0 c^2 = E_k + m_0 c^2
  - Relación fundamental energía-momento:
    E^2 = (p c)^2 + (m_0 c^2)^2
    (Para fotones con m_0 = 0 \implies E = p c).

### 4.2. Física Nuclear y Radiactividad
