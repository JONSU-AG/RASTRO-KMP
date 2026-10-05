## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 11 - OSCILACIONES, ONDAS MECÁNICAS, ACÚSTICA Y ÓPTICA GEOMÉTRICA
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), ÓPTICA DE RAYOS Y DINÁMICA ONDULATORIA
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[OSCILACIONES Y ONDAS] --> B[Movimiento Armónico Simple - MAS]
    A --> C[Ondas Mecánicas y Acústica]
    A --> D[Óptica Geométrica]

    B --> B1[Cinemática: x, v, a con funciones sinusoidales]
    B --> B2[Dinámica: Masa-Resorte T = 2π√(m/k)]
    B --> B3[Péndulo Simple: T = 2π√(L/g)]
    B --> B4[Conservación de Energía: E = 1/2 k A²]

    C --> C1[Onda Armónica: y = A sen(kx ± ωt)]
    C --> C2[Velocidad de Propagación: v = λ f]
    C --> C3[Sonido y Nivel de Intensidad: β = 10 log(I / I₀)]
    C --> C4[Efecto Doppler: f_obs = f_fte (v ± v_o)/(v ∓ v_f)]

    D --> D1[Reflexión y Refracción: Ley de Snell n1 sen θ1 = n2 sen θ2]
    D --> D2[Reflexión Total Interna y Ángulo Crítico]
    D --> D3[Espejos Esféricos y Lentes: 1/f = 1/s + 1/s']
    D --> D4[Aumento Lateral y Potencia en Dioptrías P = 1/f]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Movimiento Armónico Simple (MAS)
- **Definición Dinámica:** Movimiento oscilatorio periódico rectilíneo en torno a una posición de equilibrio (x = 0), originado por una fuerza recuperadora elástica lineal (Ley de Hooke):
  \vec{F} = -k x \implies m \frac{d^2 x}{dt^2} + k x = 0 \iff \frac{d^2 x}{dt^2} + \omega^2 x = 0
  donde \omega = \sqrt{\frac{k}{m}} es la frecuencia angular natural [\text{rad/s}].
- **Ecuaciones Cinemáticas del MAS:**
  1. **Posición:**
     x(t) = A \sin(\omega t + \phi)
     - A: Amplitud máxima de oscilación [\text{m}].
     - \phi: Fase inicial en t = 0 [\text{rad}].
  2. **Velocidad:**
     v(t) = \frac{dx}{dt} = \omega A \cos(\omega t + \phi) = \pm \omega \sqrt{A^2 - x^2}
     - v_{\max} = \omega A (en la posición de equilibrio x = 0).
     - v = 0 en los extremos (x = \pm A).
  3. **Aceleración:**
     a(t) = \frac{dv}{dt} = -\omega^2 A \sin(\omega t + \phi) = -\omega^2 x
     - a_{\max} = \omega^2 A (en los extremos x = \pm A, dirigida siempre hacia el centro).
     - a = 0 en el centro (x = 0).
- **Sistemas Oscilatorios Clásicos:**
  - **Sistema Masa-Resorte:**
    T = 2\pi \sqrt{\frac{m}{k}}, \quad f = \frac{1}{2\pi} \sqrt{\frac{k}{m}}
  - **Péndulo Simple (para pequeñas oscilaciones \theta \le 10^\circ \approx 0.17\text{ rad}):**
    T = 2\pi \sqrt{\frac{L}{g}}, \quad \omega = \sqrt{\frac{g}{L}}
- **Conservación de la Energía Mecánica en el MAS:**
  E = E_k + E_p = \frac{1}{2} m v^2 + \frac{1}{2} k x^2 = \frac{1}{2} k A^2 = \frac{1}{2} m (\omega A)^2 = \text{cte}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Óptica Geométrica
Se basa en la aproximación de rayos luminosos rectilíneos (\lambda \to 0).

1. **Índice de Refracción Absoluto (n):**
   n = \frac{c}{v} \ge 1 \quad (c \approx 3 \times 10^8\text{ m/s})
   (Para el vacío n = 1; aire n \approx 1.0003 \approx 1; agua n = 4/3; vidrio n = 3/2).
2. **Leyes de la Refracción (Ley de Snell-Descartes):**
   n_1 \sin\theta_1 = n_2 \sin\theta_2
   - \theta_1, \theta_2: ángulos medidos **respecto a la recta normal** en la superficie de separación.
3. **Reflexión Total Interna y Ángulo Crítico (\theta_c):**
   Ocurre exclusivamente cuando la luz viaja desde un medio más denso hacia uno menos denso (n_1 > n_2):
   \sin\theta_c = \frac{n_2}{n_1} \implies \theta_c = \arcsin\left(\frac{n_2}{n_1}\right)
   Para \theta_1 > \theta_c, la luz no se refracta y se refleja totalmente (base de la fibra óptica).

### 4.2. Espejos Esféricos y Lentes Delgadas
1. **Ecuación Fundamental de Descartes (Fórmula de Gauss):**
