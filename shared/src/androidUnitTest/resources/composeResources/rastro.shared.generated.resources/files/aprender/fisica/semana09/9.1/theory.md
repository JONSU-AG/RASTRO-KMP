## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 09 - ELECTRICIDAD (ELECTROSTÁTICA Y ELECTRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), CIRCUITOS Y CAMPOS VECTORIALES
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[ELECTRICIDAD] --> B[Electrostática]
    A --> C[Capacitancia y Condensadores]
    A --> D[Electrodinámica]

    B --> B1[Carga Eléctrica: Cuantización Q = ±ne]
    B --> B2[Ley de Coulomb: F = k|q1 q2| / r²]
    B --> B3[Campo Eléctrico: E = F/q = k|Q|/r²]
    B --> B4[Potencial y Trabajo: V = kQ/r ; W = -qΔV]

    C --> C1[Capacidad: C = Q / V = ε₀ A / d]
    C --> C2[Asociación: Serie 1/C_eq ; Paralelo ΣC_i]
    C --> C3[Energía Almacenada: U = 1/2 CV²]

    D --> D1[Corriente e Intensidad: I = Δq / Δt]
    D --> D2[Leyes de Resistencia: Pouillet R = ρL/A y Ohm V = IR]
    D --> D3[Leyes de Kirchhoff: Mallas y Nudos]
    D --> D4[Efecto Joule y Potencia: P = VI = I²R = V²/R]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Electrostática: Principios Fundamentales
- **Carga Eléctrica (q, Q):** Propiedad intrínseca de la materia asociada con interacciones electromagnéticas. Unidad SI: Coulomb (\text{C}).
  - **Cuantización de la carga:** Toda carga observable es un múltiplo entero de la carga elemental (e = 1.602 \times 10^{-19}\text{ C}):
    Q = \pm n e \quad (n \in \mathbb{Z}^+)
  - **Principio de Conservación de la Carga:** En un sistema eléctricamente aislado, la suma algebraica de las cargas se conserva en todo proceso físico: \sum Q_{\text{inicial}} = \sum Q_{\text{final}}.
  - **Formas de Electrización:** Por fricción (arrastre electrónico por afinidad), contacto (redistribución superficial) e inducción electrostática (polarización sin contacto y puesta a tierra).

### 3.2. Ley de Coulomb
La fuerza electrostática mutua entre dos cargas puntuales en reposo en el vacío es directamente proporcional al producto de sus valores absolutos e inversamente proporcional al cuadrado de la distancia que las separa:
\vec{F}_{12} = \frac{1}{4\pi\varepsilon_0} \frac{q_1 q_2}{r^2} \hat{r}_{12} = k_e \frac{|q_1 q_2|}{r^2} \hat{u}_r
- Constante electrostática en el vacío:
  k_e = \frac{1}{4\pi\varepsilon_0} \approx 8.98755 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2} \approx 9 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2}
  donde \varepsilon_0 = 8.854 \times 10^{-12}\ \text{C}^2/(\text{N}\cdot\text{m}^2) es la permitividad eléctrica del vacío.

### 3.3. Campo Eléctrico (\vec{E}) y Potencial Eléctrico (V)
1. **Intensidad de Campo Eléctrico (\vec{E}):** Modificación vectorial del espacio provocada por una distribución de carga; fuerza por unidad de carga testigo positiva:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Condensadores y Capacidad Eléctrica
1. **Capacidad Eléctrica (C):**
   C = \frac{Q}{V} \quad [\text{Faradio, } \text{F} = \text{C/V}]
2. **Condensador de Placas Planas Paralelas:**
   C = \kappa \frac{\varepsilon_0 A}{d}
   (\kappa \ge 1: constante dieléctrica del material interposed).
3. **Asociación de Condensadores:**
   - **En Serie (igual carga Q):**
     \frac{1}{C_{\text{eq}}} = \frac{1}{C_1} + \frac{1}{C_2} + \dots + \frac{1}{C_n}, \quad V_{\text{total}} = V_1 + V_2 + \dots
   - **En Paralelo (igual tensión V):**
     C_{\text{eq}} = C_1 + C_2 + \dots + C_n, \quad Q_{\text{total}} = Q_1 + Q_2 + \dots
4. **Energía Almacenada en un Condensador (U):**
   U = \frac{1}{2} Q V = \frac{1}{2} C V^2 = \frac{Q^2}{2C}

### 4.2. Electrodinámica: Corriente y Resistencia
1. **Intensidad de Corriente (I):**
   I = \frac{dq}{dt} \approx \frac{\Delta q}{\Delta t} \quad [\text{Amperio, } \text{A} = \text{C/s}]
   A nivel microscópico: I = n q A v_d (v_d: velocidad de arrastre o deriva de los portadores).
2. **Ley de Pouillet (Resistencia geométrica):**
   R = \rho \frac{L}{A}
   - \rho: resistividad del material [\Omega\cdot\text{m}]. Dependencia térmica: \rho(T) = \rho_0(1 + \alpha \Delta T).
   - L: longitud del conductor [\text{m}]; A: área transversal [\text{m}^2].
3. **Ley de Ohm:**
