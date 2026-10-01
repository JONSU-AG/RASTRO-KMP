package algebra

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AlgebraSemana16 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "alg_t16_s01",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle Institucional |
| :--- | :--- |
| **Resolución Oficial** | Resolución de Consejo Universitario N° 0028-2026 (Admisión UNSA 2027) |
| **Eje Curricular** | Eje 02: Matemática / Modelación Matemática, Optimización y Contexto DECO |
| **Peso Ponderado UNSA** | **Ingenierías:** 1.658337400 pts/preg (4 preg. = 6.63 pts) \| **Biomédicas:** 1.265447400 pts \| **Sociales:** 0.824574000 pts |
| **Frecuencia en Exámenes** | **Máxima (100% en DECO):** Integra todas las áreas del álgebra (lineal, cuadrática, exponencial y logarítmica) en problemas contextualizados de la vida real, economía, física y biología. |
| **Modelos de Examen** | UNSA (Ordinario, CEPREUNSA), UNMSM (Preguntas DECO transversales), UNI (Optimización de sistemas mecánicos y funciones compuestas multivariables). |
| **Competencia Cardinal** | Traducir situaciones problemáticas del entorno social, productivo y científico a modelos algebraicos explícitos, resolviendo mediante optimización cuadrática, puntos de equilibrio y leyes de decaimiento/crecimiento exponencial. |

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA DE CONCEPTOS

```mermaid
graph TD
    MOD["Modelación Algebraica"] --> LINMOD["Modelos Lineales: Costos, Ingresos y Punto de Equilibrio"]
    MOD --> CUADMOD["Modelos Cuadráticos: Optimización de Utilidades y Áreas"]
    MOD --> EXPMOD["Modelos Exponenciales: Bacterias, Radiactividad y Enfriamiento"]
    MOD --> LOGMOD["Modelos Logarítmicos: pH, Escala Richter y Decibeles"]
    
    LINMOD --> PE["Punto de Equilibrio: Ingreso = Costo Total (Utilidad = 0)"]
    CUADMOD --> VERT["Vértice de la Parábola: V(h, k)  |  h = -b/(2a)"]
    EXPMOD --> CREC["Crecimiento: P(t) = P₀ eᵏᵗ  |  Decaimiento: N(t) = N₀ e⁻ᵏᵗ"]
    LOGMOD --> DECIB["Acústica: β = 10 log(I/I₀)  |  Química: pH = -log[H⁺]"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### EJE 02: MATEMÁTICA — ÁLGEBRA
### TEMA XVI: APLICACIONES Y MODELACIÓN ALGEBRAICA EN CONTEXTOS REALES Y DECO

---

### 3. DESARROLLO TEÓRICO FORMAL (ESTÁNDAR LUMBRERAS / CUZCANO / UNI)

### 3.1. Metodología de la Modelación Algebraica
La **modelación matemática** es el proceso cognitivo formal que transforma una situación de la realidad empírica en un lenguaje simbólico algebraico riguroso:

\text{Problema Real} \xrightarrow{\text{Abstracción}} \text{Modelo Algebraico} \xrightarrow{\text{Resolución}} \text{Solución Matemática} \xrightarrow{\text{Validación}} \text{Decisión en la Realidad}

---

### 3.2. Modelos Económicos Lineales y Punto de Equilibrio
Sean q las unidades producidas y vendidas:

1. **Costo Total (C(q)):**
   C(q) = C_f + C_v \cdot q
   - C_f: Costos Fijos independientes de la producción (alquileres, seguros, salarios administrativos).
   - C_v: Costo Variable unitario por fabricar un artículo (materia prima, mano de obra directa).
2. **Ingreso Total (I(q)):**
   I(q) = p \cdot q
   - p: Precio de venta unitario.
3. **Utilidad Neta (U(q)):**
   U(q) = I(q) - C(q) = (p - C_v)q - C_f
4. **Punto de Equilibrio Financiero (q_e):**
   Es el nivel de producción donde los ingresos cubren con exactitud los costos, sin generar ganancia ni pérdida (U(q_e) = 0):
   I(q_e) = C(q_e) \implies p \cdot q_e = C_f + C_v \cdot q_e \implies \mathbf{q_e = \frac{C_f}{p - C_v}}
   El denominador (p - C_v) se denomina **Margen de Contribución Unitario**.

---

### 3.3. Modelos Cuadráticos y Optimización de la Demanda
En mercados competitivos, el precio no es constante sino que varía en función de la demanda según una ecuación de demanda lineal p(q) = a - bq, con a, b > 0:

1. **Función de Ingreso Cuadrático:**
   I(q) = p(q) \cdot q = (a - bq)q = -b q^2 + a q
2. **Optimización (Ingreso Máximo):**
   Como el coeficiente principal es -b < 0, la gráfica es una parábola con concavidad hacia abajo:
   - Nivel de producción para el máximo ingreso:
     q^* = -\frac{a}{2(-b)} = \frac{a}{2b}
   - Ingreso máximo alcanzable:
     I_{\max} = I(q^*) = \frac{a^2}{4b}


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Fenómeno Modelado | Formulación Matemática | Variables Clave |
| :--- | :--- | :--- |
| **Punto de Equilibrio** | q_e = \frac{C_f}{p - C_v} | C_f: costo fijo, p: precio, C_v: costo var. |
| **Ingreso Cuadrático Máx.** | I_{\max} = \frac{a^2}{4b} \quad \text{en } q^* = \frac{a}{2b} | p(q) = a - bq (Demanda lineal) |
| **Crecimiento Exponencial** | P(t) = P_0 e^{kt} | t_d = \frac{\ln 2}{k} (Tiempo de duplicación) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t16_s01_c01",
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
                    id = "alg_t16_s01_c02",
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
                    id = "alg_t16_s01_c03",
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
                    id = "alg_t16_s01_c04",
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
                    id = "alg_t16_s01_c05",
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
                    id = "alg_t16_s01_c06",
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
                    id = "alg_t16_s01_c07",
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
                    id = "alg_t16_s01_c08",
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
                    id = "alg_t16_s01_c09",
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
                    id = "alg_t16_s01_c10",
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
            id = "alg_t16_s02",
            title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ÁLGEBRA PREUNIVERSITARIA: CURSO COMPLETO Y SISTEMATIZADO - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### Optimización Geométrica de Áreas:
Para cercar una región rectangular con un perímetro fijo de alambre 2p:
2x + 2y = 2p \implies y = p - x
\text{Área}(x) = x(p - x) = -x^2 + px
El área máxima se logra siempre cuando el rectángulo es un **cuadrado**: x = y = \frac{p}{2} \implies \text{Área}_{\max} = \left(\frac{p}{2}\right)^2.

---

### 3.4. Modelos Exponenciales Continuos

#### 1. Crecimiento Poblacional (Ley de Thomas Malthus):
P(t) = P_0 \cdot e^{kt}, \quad k > 0
- P_0: Población inicial en t = 0.
- k: Tasa intrínseca de crecimiento continuo.
- **Tiempo de Duplicación (t_d):**
  P_0 e^{k t_d} = 2P_0 \implies e^{k t_d} = 2 \implies \mathbf{t_d = \frac{\ln 2}{k}}

#### 2. Desintegración Radiactiva y Vida Media:
N(t) = N_0 \cdot e^{-\lambda t}, \quad \lambda > 0
- N_0: Masa inicial del isótopo inestable.
- \lambda: Constante de desintegración.
- **Vida Media o Periodo de Semidesintegración (T_{1/2}):** Tiempo necesario para que la mitad de los núcleos radiactivos decaiga:
  \mathbf{T_{1/2} = \frac{\ln 2}{\lambda}}

#### 3. Ley de Enfriamiento de Isaac Newton:
La rapidez de cambio térmico de un cuerpo es proporcional a la diferencia entre su temperatura T(t) y la del medio ambiente T_m:
T(t) = T_m + (T_0 - T_m) e^{-kt}, \quad k > 0

---

### 3.5. Modelos Logarítmicos en las Ciencias

#### 1. Química: Potencial de Hidrógeno (pH)
Medida de acidez o alcalinidad en soluciones acuosas basada en la concentración molar de iones hidronio [H^+]:
\mathbf{\text{pH} = -\log_{10}[H^+] = \text{colog}[H^+]}
- \text{pH} < 7: Solución ácida.
- \text{pH} = 7: Solución neutra (agua pura a 25^\circ\text{C}).
- \text{pH} > 7: Solución básica o alcalina.

#### 2. Acústica: Nivel de Intensidad Sonora (\beta en Decibeles)
\mathbf{\beta = 10 \cdot \log_{10}\left(\frac{I}{I_0}\right)}
- I: Intensidad de la onda sonora en \text{W/m}^2.
- I_0 = 10^{-12} \text{ W/m}^2: Umbral de audición humana estándar.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Decaimiento Radiactivo** | N(t) = N_0 e^{-\lambda t} | T_{1/2} = \frac{\ln 2}{\lambda} (Vida media) |
| **Enfriamiento Newton** | T(t) = T_m + (T_0 - T_m)e^{-kt} | T_m: temperatura ambiental |
| **pH Químico** | \text{pH} = -\log[H^+] | [H^+] = 10^{-\text{pH}} |
| **Nivel Sonoro (dB)** | \beta = 10 \log\left(\frac{I}{10^{-12}}\right) | \beta en decibeles |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Duplicación de Potencia Sonora en Decibeles
Si una turbina emite 80\text{ dB}, ¿cuántos decibeles emiten dos turbinas idénticas funcionando juntas?
**¡Jamás sumes 80 + 80 = 160\text{ dB}!** Eso destruiría el tímpano humano al instante.
**Hack:** Al duplicar la potencia o intensidad sonora (2I), se suma exactamente:
10 \log 2 \approx 10(0.30103) \approx +3\text{ dB}
Por tanto, dos turbinas emiten: 80 + 3 = \mathbf{83\text{ dB}}.
Diez turbinas (10I) suman exactamente 10 \log 10 = +10\text{ dB} \implies 90\text{ dB}.

### Artificio 2: Concentración de Hidronio desde el pH
Si te dicen que el agua del río Chili tiene \text{pH} = 6 y tras un vertido minero pasa a \text{pH} = 4:
**Hack:** Cada unidad de descenso en la escala de pH multiplica la concentración de acidez [H^+] por **10**:
\text{Descenso de 2 unidades} \implies 10^2 = 100 \text{ veces más ácida}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Trío Económico: "Ingreso es lo que entra, Costo lo que gasta, Utilidad lo que queda"
\text{Utilidad} = \text{Ingreso} - \text{Costo}
- Si \text{Utilidad} = 0 \implies \text{PUNTO DE EQUILIBRIO} (ni ganas ni pierdes).
- Si \text{Utilidad} > 0 \implies \text{GANANCIA}.
- Si \text{Utilidad} < 0 \implies \text{PÉRDIDA}.

### 2. Duplicación y Vida Media: "El 0.693 Mágico"
Como \ln 2 \approx 0.693:
\text{Tiempo} = \frac{0.693}{k}
Sirve tanto para saber cuándo se duplica una inversión o bacteria (k positivo), como para saber cuándo se reduce a la mitad un fármaco en el torrente sanguíneo (\lambda de eliminación).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Producción Óptima con Utilidad Máxima**
> Si el problema pide: *"Halle la utilidad máxima"*, muchos postulantes calculan q^* = -b/(2a) y marcan esa alternativa.
> **¡CUIDADO!** q^* es la **cantidad de artículos** que se deben producir; la **utilidad máxima** es el valor evaluado de la función en ese punto (U(q^*)). Lee siempre con lupa la pregunta final.

> [!CAUTION]
> **Trampa 2: Homogeneizar Unidades de Tiempo en Exponenciales**
> Si la tasa k está dada en horas (k = 0.5 \text{ h}^{-1}) y te preguntan la población a los 90 minutos:
> Si reemplazas t = 90, el cálculo colapsará con números gigantescos.
> **Debes convertir 90 minutos a horas:** t = 1.5 horas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Tratamiento de Aguas Residuales y Monitoreo del Río Chili (Arequipa)
En la planta de tratamiento de aguas residuales La Enlozada (Arequipa), los ingenieros químicos modelan la neutralización de efluentes industriales mediante la función de pH: \text{pH} = -\log[H^+]. Asimismo, la degradación bacteriana de la Demanda Bioquímica de Oxígeno (DBO) en los reactores biológicos sigue una función exponencial decreciente: \text{DBO}(t) = \text{DBO}_0 e^{-0.15 t}. El dominio de la modelación algebraica permite a los especialistas de la UNSA y SEDAPAR certificar que el agua devuelta al cauce del río Chili cumpla con los Estándares de Calidad Ambiental (ECA) para riego agrícola en la campiña arequipeña.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "alg_t16_s02_c01",
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
                    id = "alg_t16_s02_c02",
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
                    id = "alg_t16_s02_c03",
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
                    id = "alg_t16_s02_c04",
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
                    id = "alg_t16_s02_c05",
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
                    id = "alg_t16_s02_c06",
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
                    id = "alg_t16_s02_c07",
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
                    id = "alg_t16_s02_c08",
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
                    id = "alg_t16_s02_c09",
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
                    id = "alg_t16_s02_c10",
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
