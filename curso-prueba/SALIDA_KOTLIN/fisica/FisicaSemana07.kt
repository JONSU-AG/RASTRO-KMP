package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t07_s01",
            title = "FENÓMENOS TÉRMICOS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "FENÓMENOS TÉRMICOS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 07 - FENÓMENOS TÉRMICOS (CALORIMETRÍA, TERMOMETRÍA Y DILATACIÓN)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 4 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), DEMOSTRACIONES Y CÁLCULO
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[FENÓMENOS TÉRMICOS] --> B[Termometría y Dilatación]
    A --> C[Calorimetría y Transferencia]
    A --> D[Cambios de Fase]

    B --> B1[Escalas Termométricas: C, F, K, R]
    B --> B2[Dilatación Lineal: ΔL = L₀ α ΔT]
    B --> B3[Dilatación Superficial: ΔA = A₀ β ΔT]
    B --> B4[Dilatación Volumétrica: ΔV = V₀ γ ΔT]

    C --> C1[Calor Sensible: Q = m c ΔT]
    C --> C2[Capacidad Calorífica: C = mc]
    C --> C3[Equivalente en Agua del Calorímetro]
    C --> C4[Ley Cero y Conservación: ΣQ_ganado + ΣQ_perdido = 0]

    D --> D1[Calor Latente: Q = m L]
    D --> D2[Fusión y Solidificación del Agua: L_f = 80 cal/g]
    D --> D3[Vaporización y Condensación: L_v = 540 cal/g]
    D --> D4[Curva de Calentamiento P-T / V-T]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Naturaleza Microscópica de la Temperatura y el Calor
- **Temperatura (T):** Magnitud física escalar fundamental del SI (medida en Kelvin, \text{K}) que cuantifica la energía cinética media de traslación por molécula de un sistema en equilibrio térmico:
  \langle E_k \rangle = \frac{3}{2} k_B T
  donde k_B = 1.380649 \times 10^{-23} \text{ J/K} es la constante de Boltzmann. La temperatura no representa la energía total del cuerpo, sino el nivel de agitación molecular promedio.
- **Calor (Q):** Energía térmica transitoria en tránsito a través del límite de un sistema termodinámico como consecuencia exclusiva de una diferencia de temperatura. No se "posee" calor; los cuerpos poseen *energía interna* (U).

### 3.2. Escalas Termométricas
Para relacionar dos escalas lineales arbitrarias X e Y con puntos de referencia fijos (fusión y ebullición del agua a 1 \text{ atm}):
\frac{T_X - T_{\text{fusión}, X}}{T_{\text{ebullición}, X} - T_{\text{fusión}, X}} = \frac{T_Y - T_{\text{fusión}, Y}}{T_{\text{ebullición}, Y} - T_{\text{fusión}, Y}}

Para las escalas convencionales:
- **Celsius (^\circ\text{C}):** 0^\circ\text{C} a 100^\circ\text{C} (100 divisiones).
- **Fahrenheit (^\circ\text{F}):** 32^\circ\text{F} a 212^\circ\text{F} (180 divisiones).
- **Kelvin (\text{K}):** 273.15 \text{ K} a 373.15 \text{ K} (escala absoluta, cero absoluto 0 \text{ K}).
- **Rankine (\text{R}):** 491.67 \text{ R} a 671.67 \text{ R} (escala absoluta inglesa).

Relación matemática fundamental:
\frac{C}{5} = \frac{F - 32}{9} = \frac{K - 273}{5} = \frac{R - 492}{9}

Variaciones térmicas relativas (\Delta T):

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Calorimetría
1. **Calor Sensible (Q_s):** Transferencia de calor que produce exclusivamente variación de temperatura sin cambio de estado:
   Q_s = m c_e \Delta T = C \Delta T
   - m: masa del cuerpo [\text{g} \text{ o } \text{kg}].
   - c_e: calor específico \left[\frac{\text{cal}}{\text{g}^\circ\text{C}} \text{ o } \frac{\text{J}}{\text{kg}\cdot\text{K}}\right]. Para agua líquida: c_{\text{agua}} = 1.00 \frac{\text{cal}}{\text{g}^\circ\text{C}} = 4186 \frac{\text{J}}{\text{kg}\cdot\text{K}}.
   - Para hielo: c_{\text{hielo}} \approx 0.50 \frac{\text{cal}}{\text{g}^\circ\text{C}}. Para vapor: c_{\text{vapor}} \approx 0.50 \frac{\text{cal}}{\text{g}^\circ\text{C}}.
   - C = m c_e: capacidad calorífica del sistema [\text{cal}/^\circ\text{C} \text{ o } \text{J/K}].

2. **Equivalente Mecánico del Calor (Experimento de Joule):**
   1 \text{ cal} = 4.186 \text{ J}

3. **Equivalente en Agua de un Calorímetro (M_{\text{eq}}):**
   Masa ficticia de agua pura que absorbería o cedería la misma cantidad de calor que el recipiente y sus accesorios ante una misma variación de temperatura:

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t07_s01_c01",
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
                    id = "fis_t07_s01_c02",
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
                    id = "fis_t07_s01_c03",
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
                    id = "fis_t07_s01_c04",
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
                    id = "fis_t07_s01_c05",
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
                    id = "fis_t07_s01_c06",
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
                    id = "fis_t07_s01_c07",
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
                    id = "fis_t07_s01_c08",
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
                    id = "fis_t07_s01_c09",
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
                    id = "fis_t07_s01_c10",
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
            id = "fis_t07_s02",
            title = "FENÓMENOS TÉRMICOS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "FENÓMENOS TÉRMICOS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
\Delta C = \Delta K, \quad \Delta F = \Delta R, \quad \frac{\Delta C}{5} = \frac{\Delta F}{9} \implies \Delta F = 1.8 \Delta C

### 3.3. Dilatación Térmica
El aumento de agitación molecular distorsiona el pozo de potencial intermolecular asimétrico (potencial de Lennard-Jones), incrementando la distancia media interatómica con el aumento de temperatura.

1. **Dilatación Lineal:**
   \Delta L = L_0 \alpha \Delta T \implies L_f = L_0 (1 + \alpha \Delta T)
   Donde \alpha es el coeficiente de dilatación lineal [^\circ\text{C}^{-1} \text{ o } \text{K}^{-1}].
2. **Dilatación Superficial:**
   \Delta A = A_0 \beta \Delta T \implies A_f = A_0 (1 + \beta \Delta T)
   Para sólidos isotrópicos: \beta \approx 2\alpha.
3. **Dilatación Volumétrica:**
   \Delta V = V_0 \gamma \Delta T \implies V_f = V_0 (1 + \gamma \Delta T)
   Para sólidos isotrópicos: \gamma \approx 3\alpha.
4. **Variación de la Densidad con la Temperatura:**
   Dado que la masa se conserva (m = \rho_0 V_0 = \rho_f V_f):
   \rho_f = \frac{\rho_0}{1 + \gamma \Delta T} \approx \rho_0 (1 - \gamma \Delta T)
5. **Comportamiento Anómalo del Agua:**
   Entre 0^\circ\text{C} y 4^\circ\text{C}, el agua disminuye su volumen al calentarse (\gamma < 0), alcanzando su máxima densidad a 3.98^\circ\text{C} \approx 4^\circ\text{C} (\rho_{\max} \approx 1000 \text{ kg/m}^3). Esto permite la vida acuática en lagos congelados en la superficie.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   C_{\text{cal}} = M_{\text{eq}} \cdot c_{\text{agua}} \implies M_{\text{eq}} = \frac{m_{\text{cal}} c_{\text{cal}}}{c_{\text{agua}}}

4. **Principio de Conservación de la Energía Térmica (Ley Cero):**
   En un sistema adiabáticamente aislado:
   \sum Q_{\text{ganados}} + \sum Q_{\text{perdidos}} = 0 \iff \sum Q_{\text{ganados}} = \sum |Q_{\text{perdidos}}|

### 4.2. Cambio de Fase y Calor Latente
Durante un cambio de fase de una sustancia pura a presión constante, la temperatura permanece estrictamente invariante:
Q_L = \pm m L
- L_f (calor latente de fusión del hielo a 1\text{ atm}, 0^\circ\text{C}):
  L_f = 80 \text{ cal/g} = 3.34 \times 10^5 \text{ J/kg}
- L_v (calor latente de vaporización del agua a 1\text{ atm}, 100^\circ\text{C}):
  L_v = 540 \text{ cal/g} = 2.26 \times 10^6 \text{ J/kg}

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Mezclas con Hielo y Agua):** Nunca asumas a priori que todo el hielo se derrite o que la temperatura de equilibrio es > 0^\circ\text{C}. Primero calcula el calor necesario para llevar todo el hielo a 0^\circ\text{C} y fundirlo:
  Q_{\text{req}} = m_h c_h (0 - T_h) + m_h L_f
  Calcula el calor máximo que el agua caliente puede ceder enfriándose hasta 0^\circ\text{C}:
  Q_{\text{disp}} = m_a c_a (T_a - 0)
  Si Q_{\text{disp}} < Q_{\text{req}}, la temperatura final es **obligatoriamente 0^\circ\text{C}** y solo se funde una fracción de hielo.
- **Trampa 2 (Orificios en Placas Metálicas):** Cuando una placa metálica con un orificio central se calienta, **el orificio se expande exactamente con el mismo coeficiente de dilatación que si estuviera lleno del mismo material**. ¡Jamás se encoge!
- **Trampa 3 (Confundir \Delta T con T):** Una elevación de 20^\circ\text{C} equivale a una elevación de 20 \text{ K}, pero una temperatura de 20^\circ\text{C} equivale a 293 \text{ K}.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fórmula del Calor Sensible:**
   > **"QUÉ MA-CE-TA"** \implies Q = m \cdot c_e \cdot \Delta T
2. **Fórmula del Calor Latente:**
   > **"QUÉ MA-LA"** \implies Q = m \cdot L
3. **Escalas Termométricas:**
   > **"Cinco Fríos Restan Nueve"** \implies \frac{C}{5} = \frac{F-32}{9}
4. **Relación entre coeficientes de dilatación:**
   > **\alpha : \beta : \gamma = 1 : 2 : 3** (Lineal \to 1D, Superficie \to 2D, Volumen \to 3D).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Geología y Meteorología:** La elevada capacidad calorífica del agua (c = 1.0\ \text{cal/g}^\circ\text{C}) actúa como un amortiguador térmico planetario, regulando el clima costero e impidiendo oscilaciones térmicas extremas como las observadas en la Luna o en Marte.
- **Ingeniería Civil e Industrial:** Juntas de dilatación en puentes, rieles de ferrocarril y pavimentos de concreto evitan esfuerzos mecánicos catastróficos causados por la expansión térmica estacional.
- **Biología Marina:** La máxima densidad del agua a 4^\circ\text{C} asegura que los lagos se congelen de arriba hacia abajo, formando una capa superficial aislante de hielo que preserva el agua líquida en el fondo y sostiene la vida acuática durante el invierno.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t07_s02_c01",
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
                    id = "fis_t07_s02_c02",
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
                    id = "fis_t07_s02_c03",
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
                    id = "fis_t07_s02_c04",
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
                    id = "fis_t07_s02_c05",
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
                    id = "fis_t07_s02_c06",
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
                    id = "fis_t07_s02_c07",
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
                    id = "fis_t07_s02_c08",
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
                    id = "fis_t07_s02_c09",
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
                    id = "fis_t07_s02_c10",
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
