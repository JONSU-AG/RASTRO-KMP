package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana11 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t11_s01",
            title = "OSCILACIONES Y ONDAS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "OSCILACIONES Y ONDAS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t11_s01_c01",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c02",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "fis_t11_s02",
            title = "OSCILACIONES Y ONDAS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "OSCILACIONES Y ONDAS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.2. Ondas Mecánicas y Acústica
1. **Onda:** Propagación de una perturbación que transporta energía y cantidad de movimiento a través del espacio **sin transporte neto de materia**.
   - **Transversales:** Las partículas del medio oscilan perpendicularmente a la dirección de propagación (ej. cuerda tensa, ondas electromagnéticas).
   - **Longitudinales:** Las partículas oscilan paralelamente a la dirección de propagación (ej. sonido en fluidos, ondas de compresión en resortes).
2. **Ecuación de Onda Unidimensional Armónica:**
   y(x, t) = A \sin(k x \mp \omega t + \phi)
   - Signo (-): se propaga hacia la derecha (+x).
   - Signo (+): se propaga hacia la izquierda (-x).
   - Número de onda: k = \frac{2\pi}{\lambda} [\text{rad/m}].
   - Rapidez de onda:
     v = \frac{\lambda}{T} = \lambda f = \frac{\omega}{k}
   - En una cuerda tensa (Fórmula de Taylor): v = \sqrt{\frac{T_{\text{tensión}}}{\mu}}, donde \mu = m/L es la densidad lineal de masa.
3. **Ondas Sonoras y Nivel Sonoro (\beta):**
   - Rapidez del sonido en el aire seco a 20^\circ\text{C}: v_s \approx 343\text{ m/s} (v \approx 331 + 0.6 T_C\text{ m/s}).
   - **Intensidad Sonora (I):** Potencia por unidad de área normal:
     I = \frac{P}{A} = \frac{P}{4\pi r^2} \quad \left[\frac{\text{W}}{\text{m}^2}\right]
   - **Nivel de Intensidad Sonora (\beta en Decibelios, \text{dB}):**
     \beta = 10 \log_{10}\left(\frac{I}{I_0}\right)
     donde I_0 = 10^{-12}\ \text{W/m}^2 es el umbral de audición humana a 1000\text{ Hz}.
4. **Efecto Doppler:**
   Cambio aparente en la frecuencia percibida por un observador debido al movimiento relativo entre la fuente emisora y el receptor:
   f_{\text{obs}} = f_{\text{fte}} \left(\frac{v \pm v_{\text{obs}}}{v \mp v_{\text{fte}}}\right)
   - **Regla de signos:** El observador suma (+) si se acerca a la fuente; la fuente resta (-) en el denominador si se acerca al observador.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   \frac{1}{f} = \frac{1}{s} + \frac{1}{s'}
   - f: distancia focal (f = R/2 en espejos esféricos paraxiales).
   - s: distancia del objeto al vértice o centro óptico (siempre +s para objeto real).
   - s': distancia de la imagen (positivo para imagen real; negativo para imagen virtual).
2. **Convenio de Signos Universal:**
   - **Espejo Cóncavo / Lente Convergente:** f > 0.
   - **Espejo Convexo / Lente Divergente:** f < 0.
   - **Imagen Real:** s' > 0 (delante del espejo / detrás de la lente; siempre invertida).
   - **Imagen Virtual:** s' < 0 (detrás del espejo / delante de la lente; siempre derecha).
3. **Aumento Lateral (m):**
   m = \frac{y'}{y} = -\frac{s'}{s}
   - Si m > 0: imagen derecha. Si m < 0: imagen invertida.
   - Si |m| > 1: imagen aumentada. Si |m| < 1: imagen disminuida.
4. **Potencia de una Lente (P):**
   P = \frac{1}{f(\text{en metros})} \quad [\text{Dioptrías, D} = \text{m}^{-1}]

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Péndulo en Ascensor con Aceleración):** En un ascensor con aceleración vertical \vec{a}, la gravedad efectiva cambia:
  - Si acelera hacia arriba: g_{\text{ef}} = g + a \implies T disminuye (oscila más rápido).
  - Si acelera hacia abajo: g_{\text{ef}} = g - a \implies T aumenta (oscila más lento).
- **Trampa 2 (Ángulos en Snell):** El ángulo de incidencia y refracción **se mide siempre respecto a la normal**, nunca respecto a la superficie o interfaz.
- **Trampa 3 (Espejo Convexo y Lente Divergente):** Para un objeto real, tanto el espejo convexo como la lente divergente forman **SIEMPRE, sin excepción**, una imagen:
  \text{VIRTUAL, DERECHA Y DE MENOR TAMAÑO}
- **Trampa 4 (Duplicar el número de fuentes sonoras):** Si una fuente emite 60\text{ dB}, dos fuentes idénticas emiten 2I, lo que equivale a:
  \beta = 60 + 10 \log_{10}(2) \approx 60 + 3 = 63\text{ dB} \quad (\text{¡NO } 120\text{ dB!})

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Velocidad máxima en el MAS:**
   > **"V-M-A"** \implies v_{\max} = \omega \cdot A.
2. **Aceleración máxima en el MAS:**
   > **"A-O-C-A"** \implies a_{\max} = \omega^2 \cdot A.
3. **Periodo del Péndulo Simple:**
   > **"T = 2π √(L/g)"** \implies **"Tengo Dos Pies Largos y Gordos"**.
4. **Fórmula de Descartes de Espejos y Lentes:**
   > **"FIO":** \frac{1}{f} = \frac{1}{i} + \frac{1}{o} \implies **"Foco = Imagen + Objeto"**.
5. **Decibelios:**
   > Cada aumento de 10\text{ dB} multiplica la intensidad por 10. +20\text{ dB} \to \times 100; +30\text{ dB} \to \times 1000.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Telecomunicaciones y Fibra Óptica:** Las autopistas de datos de internet global operan mediante pulsos láser de infrarrojo guiados a través de fibras de sílice ultra puras mediante confinamiento por reflexión total interna, alcanzando anchos de banda de terabits por segundo.
- **Sismología y Geofísica:** Los terremotos generan ondas primarias (P, longitudinales, más rápidas) y secundarias (S, transversales, que no se transmiten en líquidos). El análisis del tiempo de llegada de ambas permite triangular el epicentro y reveló que el núcleo externo de la Tierra es líquido.
- **Medicina Oftalmológica:** La miopía (globo ocular alargado) se corrige con lentes divergentes (potencia negativa en dioptrías) para desplazar el foco hacia atrás sobre la retina; la hipermetropía se corrige con lentes convergentes (potencia positiva).

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t11_s02_c01",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c02",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "fis_t11_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
