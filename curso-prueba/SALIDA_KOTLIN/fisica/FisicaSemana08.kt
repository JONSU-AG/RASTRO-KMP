package fisica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object FisicaSemana08 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "fis_t08_s01",
            title = "MECÁNICA DE FLUIDOS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "MECÁNICA DE FLUIDOS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 08 - MECÁNICA DE FLUIDOS (HIDROSTÁTICA E HIDRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 4 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), PRINCIPIOS FÍSICOS Y FLUIDODINÁMICA
========================================================================================
```

---


## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[MECÁNICA DE FLUIDOS] --> B[Hidrostática]
    A --> C[Hidrodinámica]
    A --> D[Fenómenos de Superficie]

    B --> B1[Presión: P = F_perp / A]
    B --> B2[Principio Fundamental: ΔP = ρ g Δh]
    B --> B3[Principio de Pascal: Prensa Hidráulica F1/A1 = F2/A2]
    B --> B4[Principio de Arquímedes: E = ρ_liq g V_sum]

    C --> C1[Flujo Ideal: Incompresible, No Viscoso, Irrotacional]
    C --> C2[Caudal y Continuidad: Q = Av = cte]
    C --> C3[Ecuación de Bernoulli: P + 1/2 ρ v² + ρgh = cte]
    C --> C4[Efecto Venturi y Teorema de Torricelli v = √(2gh)]

    D --> D1[Tensión Superficial: γ = F / L]
    D --> D2[Capilaridad: Ley de Jurin]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Propiedades Fundamentales de los Fluidos
- **Fluido:** Sustancia que se deforma continuamente bajo la acción de un esfuerzo cortante o tangencial, sin importar cuán pequeño sea. Comprende líquidos y gases.
- **Densidad Absoluta (\rho):** Magnitud escalar definida como la masa por unidad de volumen:
  \rho = \frac{dm}{dV} \quad \left[\frac{\text{kg}}{\text{m}^3}\right] \quad \left(\rho_{\text{agua}} = 1000\ \frac{\text{kg}}{\text{m}^3} = 1\ \frac{\text{g}}{\text{cm}^3}\right)
- **Peso Específico (\gamma):**
  \gamma = \frac{W}{V} = \rho g \quad \left[\frac{\text{N}}{\text{m}^3}\right]
- **Densidad Relativa (\rho_{\text{rel}}):**
  \rho_{\text{rel}} = \frac{\rho_{\text{sustancia}}}{\rho_{\text{agua a } 4^\circ\text{C}}}

### 3.2. Hidrostática: Presión y Principios Fundamentales
1. **Presión (P):** Componente normal de la fuerza por unidad de área:
   P = \lim_{\Delta A \to 0} \frac{\Delta F_\perp}{\Delta A} \quad \left[\text{Pa} = \frac{\text{N}}{\text{m}^2}\right]
   - Equivalencias comunes:
     1\text{ atm} = 1.013 \times 10^5\text{ Pa} = 760\text{ mmHg} = 10.33\text{ m H}_2\text{O} \approx 10^5\text{ Pa} = 1\text{ bar}
2. **Presión Hidrostática (P_h):** Presión ejercida por una columna de líquido en reposo a una profundidad h:
   P_h = \rho_L g h
   - *Isotropía:* La presión hidrostática actúa perpendicularmente a cualquier superficie sumergida y con igual intensidad en todas las direcciones a una misma profundidad.
3. **Presión Total o Absoluta (P_{\text{abs}}):**
   P_{\text{abs}} = P_{\text{atm}} + P_h = P_{\text{atm}} + \rho_L g h
   - **Presión Manométrica (P_{\text{man}}):** Presión relativa medida respecto a la presión atmosférica local: P_{\text{man}} = P_{\text{abs}} - P_{\text{atm}}.
4. **Vasos Comunicantes y Tubos en U:**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Hidrodinámica de Fluidos Ideales
Un fluido ideal cumple cuatro hipótesis:
1. **Incompresible:** Densidad constante (\rho = \text{cte}).
2. **No viscoso:** Cero rozamiento interno disipativo entre capas de fluido.
3. **Flujo laminar / estacionario:** La velocidad en cada punto no cambia con el tiempo.
4. **Irrotacional:** Elementos de fluido no poseen momento angular neto sobre su propio centro de masa.

### 4.2. Ecuación de Continuidad
Representa la conservación de la masa a lo largo de un tubo de flujo:
\frac{dm}{dt} = \rho A v = \text{cte} \xrightarrow{\rho = \text{cte}} Q = A_1 v_1 = A_2 v_2 = \text{cte}
- Q: Caudal volumétrico o gasto \left[\text{m}^3/\text{s} \text{ o } \text{L/s}\right].

### 4.3. Ecuación de Bernoulli
Expresión del principio de conservación de la energía mecánica por unidad de volumen a lo largo de una línea de corriente:
P_1 + \frac{1}{2} \rho v_1^2 + \rho g h_1 = P_2 + \frac{1}{2} \rho v_2^2 + \rho g h_2 = \text{cte}

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t08_s01_c01",
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
                    id = "fis_t08_s01_c02",
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
                    id = "fis_t08_s01_c03",
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
                    id = "fis_t08_s01_c04",
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
                    id = "fis_t08_s01_c05",
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
                    id = "fis_t08_s01_c06",
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
                    id = "fis_t08_s01_c07",
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
                    id = "fis_t08_s01_c08",
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
                    id = "fis_t08_s01_c09",
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
                    id = "fis_t08_s01_c10",
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
            id = "fis_t08_s02",
            title = "MECÁNICA DE FLUIDOS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "MECÁNICA DE FLUIDOS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   Para puntos en un mismo líquido conectados continuamente a la misma línea isóbara horizontal:
   P_A = P_B \implies P_0 + \rho_1 g h_1 = P_0 + \rho_2 g h_2 \implies \rho_1 h_1 = \rho_2 h_2

### 3.3. Principio de Pascal
"Cualquier incremento de presión aplicado a un punto de un líquido incompresible y en reposo se transmite íntegramente y con la misma intensidad a todos los puntos del fluido y a las paredes del recipiente que lo contiene."
- **Prensa Hidráulica:**
  P_1 = P_2 \implies \frac{F_1}{A_1} = \frac{F_2}{A_2} \iff F_2 = F_1 \left(\frac{A_2}{A_1}\right) = F_1 \left(\frac{D_2}{D_1}\right)^2
  Conservación del trabajo (suponiendo émbolos sin rozamiento e incompresibilidad):
  V_1 = V_2 \implies A_1 d_1 = A_2 d_2 \implies W_1 = F_1 d_1 = F_2 d_2 = W_2

### 3.4. Principio de Arquímedes
"Todo cuerpo parcial o totalmente sumergido en un fluido en reposo experimenta una fuerza vertical ascendente denominada Empuje hidrostático (E), cuya magnitud es exactamente igual al peso del volumen de fluido desalojado por el cuerpo."
E = m_{\text{desalojado}} g = \rho_{\text{fluido}} g V_{\text{sumergido}}
- **Punto de Aplicación:** El empuje actúa en el *centro de carena* (centroide del volumen sumergido desalojado).
- **Peso Aparente (W_{\text{ap}}):**
  W_{\text{ap}} = W_{\text{real}} - E = mg - \rho_f g V_{\text{sum}}
- **Condiciones de Flotabilidad:**
  - Si \rho_{\text{cuerpo}} > \rho_{\text{fluido}} \implies W > E \implies El cuerpo se hunde al fondo.
  - Si \rho_{\text{cuerpo}} = \rho_{\text{fluido}} \implies W = E \implies Equilibrio indiferente en cualquier posición sumergida.
  - Si \rho_{\text{cuerpo}} < \rho_{\text{fluido}} \implies Emerge parcialmente hasta flotar en equilibrio:
    W = E \implies \rho_c g V_{\text{total}} = \rho_f g V_{\text{sum}} \implies \frac{V_{\text{sum}}}{V_{\text{total}}} = \frac{\rho_c}{\rho_f}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
- **Términos energéticos:**
  - P: Presión estática (energía por unidad de volumen por trabajo de flujo).
  - \frac{1}{2}\rho v^2: Presión dinámica (energía cinética volumétrica).
  - \rho g h: Presión hidrostática gravitacional (energía potencial gravitacional volumétrica).

### 4.4. Casos Especiales de Bernoulli
1. **Efecto Venturi (tubo horizontal h_1 = h_2):**
   P_1 + \frac{1}{2}\rho v_1^2 = P_2 + \frac{1}{2}\rho v_2^2
   Si la sección se estrecha (A_2 < A_1 \implies v_2 > v_1), la presión disminuye: P_2 < P_1.
2. **Teorema de Torricelli:**
   Velocidad de salida de un líquido por un pequeño orificio a una profundidad h bajo la superficie libre abierta a la atmósfera (A_{\text{tanque}} \gg A_{\text{orificio}}):
   v = \sqrt{2gh}
3. **Tubo de Pitot:**
   Medición de velocidad de corriente aérea o líquida por estancamiento:
   v = \sqrt{\frac{2(P_{\text{estancamiento}} - P_{\text{estática}})}{\rho}} = \sqrt{\frac{2\rho_{\text{man}} g \Delta h}{\rho_{\text{fluido}}}}

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (El volumen en el empuje):** En la fórmula E = \rho_L g V_{\text{sum}}, la densidad es **del líquido**, pero el volumen es **del cuerpo sumergido**, ¡jamás el volumen total del líquido del recipiente!
- **Trampa 2 (Paradoja Hidrostática):** La fuerza ejercida por el fluido sobre el fondo de un recipiente depende únicamente de la presión en el fondo y del área de la base: F = P_{\text{fondo}} \cdot A_{\text{base}} = \rho g h A_{\text{base}}. **No depende de la forma de las paredes ni del peso total del líquido en el recipiente.**
- **Trampa 3 (Deshielo de un témpano flotante):** Cuando un bloque de hielo puro flota en agua pura y se derrite por completo, **el nivel del agua no varía**. La masa de hielo derretida ocupa exactamente el mismo volumen que desalojaba cuando flotaba.
- **Trampa 4 (Prensa con diámetros):** Recuerda que el área de un círculo es A = \frac{\pi}{4} D^2. Por tanto, la relación de fuerzas varía con el **cuadrado del cociente de diámetros**: F_2 = F_1 (D_2 / D_1)^2. Si el diámetro se triplica, la fuerza se multiplica por 9, no por 3.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Empuje de Arquímedes:**
   > **"E-RO-GE-VE"** \implies E = \rho \cdot g \cdot V_{\text{sum}}
2. **Prensa Hidráulica:**
   > **"Fuerza chica en Área chica, Fuerza grande en Área grande"** \implies \frac{F_1}{A_1} = \frac{F_2}{A_2}
3. **Efecto Venturi:**
   > **"Más rápido corre el fluido, menos aprieta"** (v \uparrow \implies P \downarrow).
4. **Flotación Porcentual:**
   > **"El porcentaje que se hunde es la densidad relativa"** \implies \% V_{\text{sum}} = \frac{\rho_{\text{cuerpo}}}{\rho_{\text{fluido}}} \times 100\%.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Medicina y Fisiología Cardiovascular:** La ley de Poiseuille y la ecuación de continuidad rigen el flujo sanguíneo; las estenosis arteriales causan aumento de velocidad y caída de presión (Bernoulli), favoreciendo el colapso vascular o la formación de aneurismas.
- **Aeronáutica e Ingeniería Naval:** La sustentación de perfiles alares de aviones se explica conjuntamente por la circulación vorticial, la ley de conservación del momento lineal (deflexión del flujo hacia abajo) y el gradiente de presiones de Bernoulli entre intradós y extradós.
- **Meteorología:** Los tornados y huracanes exhiben un núcleo de muy baja presión debido a las altísimas velocidades de rotación del aire periférico, lo que provoca la violenta succión ascensional.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "fis_t08_s02_c01",
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
                    id = "fis_t08_s02_c02",
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
                    id = "fis_t08_s02_c03",
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
                    id = "fis_t08_s02_c04",
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
                    id = "fis_t08_s02_c05",
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
                    id = "fis_t08_s02_c06",
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
                    id = "fis_t08_s02_c07",
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
                    id = "fis_t08_s02_c08",
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
                    id = "fis_t08_s02_c09",
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
                    id = "fis_t08_s02_c10",
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
