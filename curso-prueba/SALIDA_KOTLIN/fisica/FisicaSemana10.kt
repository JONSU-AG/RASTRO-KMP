package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t10_s01",
            title = "MAGNETISMO Y ELECTROMAGNETISMO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "MAGNETISMO Y ELECTROMAGNETISMO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 10 - MAGNETISMO Y ELECTROMAGNETISMO
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), REGLA DE LA MANO DERECHA E INDUCCIÓN
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[MAGNETISMO Y ELECTROMAGNETISMO] --> B[Fuerza Magnética]
    A --> C[Fuentes de Campo Magnético]
    A --> D[Inducción Electromagnética]

    B --> B1[Fuerza de Lorentz: F = q v B sen θ]
    B --> B2[Movimiento Circular en Campo B: R = mv / qB]
    B --> B3[Fuerza sobre Conductor: F = I L B sen θ]
    B --> B4[Fuerza entre Conductores Paralelos]

    C --> C1[Experiencia de Oersted]
    C --> C2[Conductor Rectilíneo Infinito: B = μ₀ I / 2πd]
    C --> C3[Centro de Espira Circular: B = μ₀ I / 2R]
    C --> C4[Interior de Solenoide: B = μ₀ n I]

    D --> D1[Flujo Magnético: Φ = B A cos θ]
    D --> D2[Ley de Faraday: ε = -N ΔΦ / Δt]
    D --> D3[Ley de Lenz: Oposición al cambio de flujo]
    D --> D4[Transformador Ideal: V1/V2 = N1/N2 = I2/I1]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Naturaleza del Magnetismo e Interacción Magnética
- **Polos Magnéticos:** Los imanes presentan dos polos inseparables (Norte y Sur). No existen monopolos magnéticos aislados en la naturaleza clásica (\nabla \cdot \vec{B} = 0). Polos del mismo nombre se repelen; de nombres opuestos se atraen.
- **Campo Magnético (\vec{B}):** Campo vectorial generado por cargas eléctricas en movimiento o corrientes. Unidad SI: Tesla (\text{T} = \frac{\text{N}}{\text{A}\cdot\text{m}}). En el sistema CGS: Gauss (1\text{ T} = 10^4\text{ G}). Las líneas de inducción magnética son continuas y cerradas sobre sí mismas (salen del polo norte y entran por el sur en el exterior del imán).

### 3.2. Fuerza Magnética sobre Cargas en Movimiento (Fuerza de Lorentz)
Una partícula cargada con velocidad \vec{v} inmersa en un campo magnético \vec{B} experimenta una fuerza magnética dada por:
\vec{F}_B = q (\vec{v} \times \vec{B})
- **Módulo:**
  F_B = |q| v B \sin\theta
  (\theta es el ángulo entre \vec{v} y \vec{B}).
- **Dirección y Sentido:** Determinada por la *Regla de la Mano Derecha* (o regla de la palma). Si la carga es negativa (q < 0), el sentido resultante se invierte 180^\circ.
- **Trabajo Nulo de la Fuerza Magnética:**
  Como \vec{F}_B \perp \vec{v} en todo instante:
  P_B = \vec{F}_B \cdot \vec{v} = 0 \implies W_B = \int \vec{F}_B \cdot d\vec{r} = 0
  La fuerza magnética pura **no realiza trabajo**, no modifica la rapidez ni la energía cinética de la partícula, solo altera la dirección de su velocidad.
- **Trayectoria en Campo Magnético Uniforme (\vec{v} \perp \vec{B}):**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Generación de Campo Magnético (Ley de Biot-Savart y Ampère)
Constante de permeabilidad magnética del vacío:
\mu_0 = 4\pi \times 10^{-7}\ \frac{\text{T}\cdot\text{m}}{\text{A}} \approx 1.2566 \times 10^{-6}\ \frac{\text{T}\cdot\text{m}}{\text{A}}

1. **Conductor Rectilíneo Muy Largo (Infinito):**
   A una distancia perpendicular d del conductor:
   B = \frac{\mu_0 I}{2\pi d}
   (Las líneas de campo son circunferencias concéntricas orientadas según la regla del pulgar derecho).
2. **Espira Circular Plana de Radio R:**
   En el centro geométrico de la espira:
   B = \frac{\mu_0 I}{2 R}
   Para una bobina plana corta de N espiras: B = \frac{\mu_0 N I}{2R}.
3. **Solenoide Ideal (Bobina Larga de Longitud L con N vueltas):**
   En el interior del solenoide (L \gg R):
   B = \mu_0 \left(\frac{N}{L}\right) I = \mu_0 n I
   (n = N/L es la densidad de espiras por metro).
4. **Toroide:**
   B = \frac{\mu_0 N I}{2\pi r}

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t10_s01_c01",
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
                    id = "fis_t10_s01_c02",
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
                    id = "fis_t10_s01_c03",
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
                    id = "fis_t10_s01_c04",
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
                    id = "fis_t10_s01_c05",
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
                    id = "fis_t10_s01_c06",
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
                    id = "fis_t10_s01_c07",
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
                    id = "fis_t10_s01_c08",
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
                    id = "fis_t10_s01_c09",
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
                    id = "fis_t10_s01_c10",
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
            id = "fis_t10_s02",
            title = "MAGNETISMO Y ELECTROMAGNETISMO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "MAGNETISMO Y ELECTROMAGNETISMO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t10_s02_c01",
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
                    id = "fis_t10_s02_c02",
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
                    id = "fis_t10_s02_c03",
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
                    id = "fis_t10_s02_c04",
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
                    id = "fis_t10_s02_c05",
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
                    id = "fis_t10_s02_c06",
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
                    id = "fis_t10_s02_c07",
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
                    id = "fis_t10_s02_c08",
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
                    id = "fis_t10_s02_c09",
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
                    id = "fis_t10_s02_c10",
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
