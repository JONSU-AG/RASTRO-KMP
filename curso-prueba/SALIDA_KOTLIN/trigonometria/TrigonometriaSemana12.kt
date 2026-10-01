package trigonometria

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object TrigonometriaSemana12 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "trig_t12_s01",
            title = "APLICACIONES DE LAS FUNCIONES TRIGONOMÉTRICAS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "APLICACIONES DE LAS FUNCIONES TRIGONOMÉTRICAS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial UNSA / UNMSM / UNI |
| :--- | :--- |
| **Eje Curricular** | Eje 02: Matemática / Trigonometría |
| **Nivel de Dificultad** | Nivel Avanzado - Interdisciplinario (Trigonometría, Física, Modelado Matemático) |
| **Ponderación UNSA** | Ingenierías: 1.658337400 pts \| Biomédicas: 1.265447400 pts \| Sociales: 0.824574000 pts |
| **Tiempo Estándar de Respuesta** | 2.5 a 3.0 minutos por reactivo de modelado periódico |
| **Prerrequisitos Cognitivos** | Funciones trigonométricas directas (A \operatorname{sen}(Bx + C) + D), transformada gráfica, identidades compuestas, derivada/tasa de cambio intuitiva, Movimiento Armónico Simple (M.A.S.). |
| **Competencia Cardinal** | Modela fenómenos cíclicos de la naturaleza, ondas mecánicas y acústicas, mareas, corrientes alternas y optimización geométrica mediante modelos sinusoidales y = A \operatorname{sen}(\omega t + \phi) + k. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["Aplicaciones de Funciones Trigonométricas"] --> B["Fenómenos Periódicos Naturales y Físicos"]
    A --> C["Movimiento Armónico Simple M.A.S."]
    A --> D["Ondas Mecánicas y Electromagnéticas"]
    A --> E["Circuitos de Corriente Alterna C.A."]
    A --> F["Optimización Trigonométrica Máx/Mín"]

    B --> B1["Mareas oceánicas: h(t) = A\cos(\omega t) + D"]
    B --> B2["Ciclos de temperatura y luz diurna"]
    B --> B3["Biorritmos y oscilaciones poblacionales"]

    C --> C1["Posición: x(t) = A\operatorname{sen}(\omega t + \phi)"]
    C --> C2["Velocidad: v(t) = A\omega\cos(\omega t + \phi)"]
    C --> C3["Aceleración: a(t) = -\omega^2 x(t)"]

    D --> D1["Ecuación de onda: y(x,t) = A\operatorname{sen}(kx - \omega t)"]
    D --> D2["Interferencia y batimiento acústico"]

    E --> E1["Voltaje y corriente senoidal: v(t) = V_0\operatorname{sen}(\omega t)"]
    E --> E2["Potencia instantánea y media"]

    F --> F1["Máxima área bajo restricciones angulares"]
    F --> F2["Distancia y trayectoria óptima"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Parámetros del Modelo Sinusoidal General
Cualquier fenómeno periódico armónico fundamental se describe por la función general:
y(t) = A \operatorname{sen}(\omega t + \phi) + k \quad \text{o} \quad y(t) = A \cos(\omega t + \phi) + k

1. **Amplitud (|A|):** Semidiferencia entre el valor máximo (y_{\max}) y el valor mínimo (y_{\min}):
   |A| = \frac{y_{\max} - y_{\min}}{2}
2. **Eje Central de Oscilación o Nivel Medio (k):**
   k = \frac{y_{\max} + y_{\min}}{2}
3. **Frecuencia Angular (\omega):** Tasa de cambio de la fase con respecto al tiempo:
   \omega = \frac{2\pi}{T} = 2\pi f \quad (\text{rad/s})
   donde T es el período fundamental y f = \frac{1}{T} es la frecuencia ordinaria en hercios (\text{Hz}).
4. **Desfase o Ángulo de Fase Inicial (\phi):** Determina el estado de la oscilación en t = 0.
5. **Corrimiento Temporal o Desplazamiento de Fase (t_0):**
   y(t) = A \operatorname{sen}\left[\omega(t - t_0)\right] + k \implies \phi = -\omega t_0 \iff t_0 = -\frac{\phi}{\omega}

---

### 3.2. Modelado de Movimiento Armónico Simple (M.A.S.)
En cinemática armónica (resortes ideales, péndulos para pequeños ángulos):
- **Ecuación de Posición:**
  x(t) = A \operatorname{sen}(\omega t + \phi)
- **Ecuación de Velocidad:**
  v(t) = \frac{dx}{dt} = A\omega \cos(\omega t + \phi) \implies v_{\max} = \omega A
- **Ecuación de Aceleración:**
  a(t) = \frac{dv}{dt} = -A\omega^2 \operatorname{sen}(\omega t + \phi) = -\omega^2 x(t) \implies a_{\max} = \omega^2 A
- **Conservación de la Energía Mecánica:**
  E_M = \frac{1}{2} k_{el} A^2 = \frac{1}{2} m v^2 + \frac{1}{2} k_{el} x^2

---


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE APLICACIONES

\begin{array}{|l|l|l|}
\hline
\textbf{Fenómeno / Magnitud} & \textbf{Ecuación / Fórmula} & \textbf{Condición / Rango} \\ \hline
\text{Modelo Senoidal Clásico} & y(t) = A\operatorname{sen}\left(\frac{2\pi}{T}(t - t_0)\right) + k & A = \frac{M - m}{2},\; k = \frac{M + m}{2} \\ \hline
\text{Velocidad máxima M.A.S.} & v_{\max} = \omega A = \frac{2\pi}{T} A & \text{Ocurre al pasar por el punto de equilibrio } (x = 0) \\ \hline
\text{Aceleración máxima M.A.S.} & a_{\max} = \omega^2 A & \text{Ocurre en los extremos de máxima elongación } (|x| = A) \\ \hline
\text{Longitud de onda y velocidad} & v = \lambda f = \frac{\lambda}{T} = \frac{\omega}{k} & k = \frac{2\pi}{\lambda},\; \omega = 2\pi f \\ \hline

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t12_s01_c01",
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
                    id = "trig_t12_s01_c02",
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
                    id = "trig_t12_s01_c03",
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
                    id = "trig_t12_s01_c04",
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
                    id = "trig_t12_s01_c05",
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
                    id = "trig_t12_s01_c06",
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
                    id = "trig_t12_s01_c07",
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
                    id = "trig_t12_s01_c08",
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
                    id = "trig_t12_s01_c09",
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
                    id = "trig_t12_s01_c10",
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
            id = "trig_t12_s02",
            title = "APLICACIONES DE LAS FUNCIONES TRIGONOMÉTRICAS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "APLICACIONES DE LAS FUNCIONES TRIGONOMÉTRICAS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3. Ondas Senoidales Progresivas y Superposición
Una perturbación ondulatoria unidimensional que se propaga a velocidad v:
y(x,t) = A \operatorname{sen}(kx \mp \omega t + \phi)
- Signo (-): Onda que viaja hacia la derecha (+x).
- Signo (+): Onda que viaja hacia la izquierda (-x).
- **Número de onda (k):** k = \frac{2\pi}{\lambda}, donde \lambda es la longitud de onda.
- **Velocidad de propagación:** v = \frac{\omega}{k} = \lambda f.

**Batimiento (Beats):** Superposición de dos ondas sonoras de frecuencias muy cercanas f_1 \approx f_2:
y_1 + y_2 = A \operatorname{sen}(2\pi f_1 t) + A \operatorname{sen}(2\pi f_2 t) = \left[ 2A \cos\left(2\pi \frac{f_1 - f_2}{2} t\right) \right] \operatorname{sen}\left(2\pi \frac{f_1 + f_2}{2} t\right)
La frecuencia del pulso de batimiento percibido es f_{\text{bat}} = |f_1 - f_2|.

---

### 3.4. Corriente Alterna y Fasores
- Voltaje alterno senoidal: v(t) = V_{\text{pico}} \operatorname{sen}(\omega t)
- Voltaje Eficaz o RMS (Root Mean Square):
  V_{\text{rms}} = \frac{V_{\text{pico}}}{\sqrt{2}}
- En la red eléctrica peruana doméstica: V_{\text{rms}} = 220\text{ V}, f = 60\text{ Hz} \implies \omega = 120\pi\text{ rad/s} \approx 377\text{ rad/s}.
  V_{\text{pico}} = 220\sqrt{2}\text{ V} \approx 311.13\text{ V}

---

### 3.5. Optimización Trigonométrica Sin Derivadas
En problemas de máximos y mínimos de figuras geométricas con variables angulares \theta:
1. **Forma A\operatorname{sen}\theta + B\cos\theta:**
   -\sqrt{A^2+B^2} \le A\operatorname{sen}\theta + B\cos\theta \le \sqrt{A^2+B^2}
2. **Propiedad de Medias (MA \ge MG):** Para términos como a\tan\theta + b\cot\theta con \theta \in \langle 0, \pi/2\rangle:
   a\tan\theta + b\cot\theta \ge 2\sqrt{ab}
   El valor mínimo 2\sqrt{ab} se alcanza cuando a\tan\theta = b\cot\theta \implies \tan\theta = \sqrt{b/a}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
\text{Frecuencia de Batimiento} & f_{\text{bat}} = |f_1 - f_2| & \text{Sonoridad oscila entre 0 y } 2A \\ \hline
\text{Voltaje Eficaz (RMS)} & V_{\text{rms}} = \frac{V_{\text{pico}}}{\sqrt{2}} & \text{Onda puramente senoidal} \\ \hline
\text{Máx/Mín de } A\operatorname{sen} x + B\cos x & \text{Máx} = +\sqrt{A^2+B^2},\; \text{Mín} = -\sqrt{A^2+B^2} & \text{Ángulo idéntico } x \\ \hline
\text{Mínimo de } a\operatorname{sen}^2 x + b\csc^2 x & \text{Mínimo} = 2\sqrt{ab} & \text{Para } a, b > 0 \\ \hline
\hline
\end{array}

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Conversión Directa de Horas a Fase Angular
En problemas DECO de mareas o temperaturas que ocurren a lo largo de un día (T = 24\text{ h} o T = 12\text{ h}):
- Si T = 24\text{ h} \implies \omega = \frac{2\pi}{24} = \frac{\pi}{12}\text{ rad/h}. Cada hora equivale a un giro de fase de 15^\circ (\frac{\pi}{12}\text{ rad}).
- Si T = 12\text{ h} \implies \omega = \frac{2\pi}{12} = \frac{\pi}{6}\text{ rad/h}. Cada hora equivale a 30^\circ (\frac{\pi}{6}\text{ rad}).
*Truco:* Para saber la altura a las 4 horas después del pico máximo, evalúa simplemente \cos(4 \times 30^\circ) = \cos(120^\circ) = -0.5.

### Hack 2: Búsqueda del Máximo Rectángulo Inscrito en una Semicircunferencia
Dado un semicírculo de radio R, el rectángulo inscrito con base en el diámetro tiene vértices en (R\cos\theta, R\operatorname{sen}\theta).
- Área: S(\theta) = (2R\cos\theta)(R\operatorname{sen}\theta) = R^2 (2\operatorname{sen}\theta\cos\theta) = R^2 \operatorname{sen}(2\theta).
- Como el valor máximo de \operatorname{sen}(2\theta) es 1 (cuando 2\theta = 90^\circ \implies \theta = 45^\circ):
S_{\max} = R^2
¡No se necesita cálculo diferencial! Se resuelve en 5 segundos con el ángulo doble.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "A-K-T-O" para Modelado de Mareas y Clima
Para extraer al instante los parámetros de cualquier problema verbal (temperatura o nivel de agua):
- **A**mplitud: \frac{\text{Máx} - \text{Mín}}{2}
- **K** (Eje central): \frac{\text{Máx} + \text{Mín}}{2}
- **T**iempo de período: T = 2 \times (\text{tiempo entre un mínimo y el siguiente máximo consecutivo})
- **O**mega (\omega): \omega = \frac{2\pi}{T}

### Mnemotecnia 2: "El Columpio Energético"
- En el centro (x=0): **V**elocidad es **V**oluminosa (máxima), **A**celeración es **A**usente (0).
- En los extremos (|x|=A): **V**elocidad es **V**acía (0), **A**celeración es **A**rrrolladora (máxima).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Frecuencia Ordinaria con Frecuencia Angular**
> En enunciados que dicen "un pistón vibra a 30 revoluciones por segundo (Hz)", muchos colocan \omega = 30. ¡Falso! La frecuencia ordinaria es f = 30\text{ Hz}, por lo que \omega = 2\pi(30) = 60\pi\text{ rad/s}.

> [!CAUTION]
> **Trampa 2: Elección Equivocada entre Seno y Coseno al Modelar**
> Si el fenómeno inicia en t = 0 en su **valor máximo** (ej. solsticio de verano, marea alta), usa directamente el **coseno sin desfase**:
> y(t) = A\cos(\omega t) + k
> Si inicia en el punto de equilibrio ascendiendo, usa el **seno**:
> y(t) = A\operatorname{sen}(\omega t) + k
> Usar seno cuando arranca en el máximo te obligará a arrastrar un desfase de +\frac{\pi}{2}, donde los postulantes cometen errores de signo.

> [!WARNING]
> **Trampa 3: Unidades de los Parámetros Temporales**
> Si el tiempo t se mide en horas y la velocidad angular en rad/min, debes homogenizar de inmediato antes de operar.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Caso 1: Navegación Portuaria en el Puerto de Matarani (Arequipa)
Un buque de gran calado necesita al menos 6.5\text{ m} de profundidad en el canal de acceso para maniobrar sin encallar. Si la marea baja mide 4\text{ m} y la marea alta 8\text{ m}, modelar el intervalo de horas en que el buque puede atracar con seguridad es un problema de inecuaciones trigonométricas contextualizadas típico de los exámenes UNSA y UNMSM.

### Caso 2: Acústica Médica y Tomografía por Ultrasonido
En ecografías, se emiten ondas ultrasónicas de frecuencia f \approx 3.5\text{ MHz}. Conociendo la velocidad del sonido en los tejidos blandos (v \approx 1540\text{ m/s}), la longitud de onda viene dada por \lambda = \frac{v}{f} \approx 0.44\text{ mm}, que delimita la resolución espacial mínima del diagnóstico por imagen.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "trig_t12_s02_c01",
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
                    id = "trig_t12_s02_c02",
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
                    id = "trig_t12_s02_c03",
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
                    id = "trig_t12_s02_c04",
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
                    id = "trig_t12_s02_c05",
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
                    id = "trig_t12_s02_c06",
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
                    id = "trig_t12_s02_c07",
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
                    id = "trig_t12_s02_c08",
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
                    id = "trig_t12_s02_c09",
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
                    id = "trig_t12_s02_c10",
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
