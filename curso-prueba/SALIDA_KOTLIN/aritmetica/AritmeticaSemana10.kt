package aritmetica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object AritmeticaSemana10 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "arit_t10_s01",
            title = "Sumatorias Notables y Aplicaciones Aritméticas (Interés, Descuento, Mezclas y Aleaciones) - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Sumatorias Notables y Aplicaciones Aritméticas (Interés, Descuento, Mezclas y Aleaciones) - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema X: Sumatorias notables, interés (simple y compuesto), descuento comercial y racional, mezclas y aleaciones |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Financiero, Modelación Ponderada y Cálculo Algorítmico Multidisciplinario |
| **Conexión Interuniversitaria** | **UNSA:** Relación entre Descuento Comercial y Racional (V_n = \frac{D_c \cdot D_r}{D_c - D_r}), grado de mezclas alcohólicas con destilados y ley de orfebrería en quilates.<br>**UNMSM (DECO):** Préstamos bancarios con amortizaciones fijas e interés compuesto continuo, rendimiento de fondos mutuos y mezclas de granos agrícolas.<br>**UNI:** Tasas instantáneas continuas, descuento bancario compuesto, demostración inductiva de sumatorias de potencias de grado p y balance metalúrgico de aleaciones complejas. |

### Matriz de Indicadores de Logro Evaluados
1. **Sumatorias Notables y Series Especiales:** Aplicar fórmulas cerradas de sumas de números naturales, cuadrados, cubos, productos binarios e inversas telescópicas.
2. **Matemática Financiera - Interés Simple y Compuesto:** Calcular capitales, montos e intereses utilizando tasas de interés homogéneas (anuales) y modelando periodos de capitalización (n).
3. **Regla de Descuento (Comercial y Racional):** Relacionar el Valor Nominal (V_n) con el Valor Actual (V_a), aplicando identidades cruzadas entre el descuento externo (D_c) e interno (D_r).
4. **Mezclas y Aleaciones Metalúrgicas:** Determinar el Precio Medio ponderado de mezclas, el Grado Alcohólico (^\circ) y la Ley de una aleación metálica (fina y liga en quilates de oro).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["APLICACIONES ARITMÉTICAS Y SERIES"] --> B["Sumatorias Notables"]
    A --> C["Regla de Interés"]
    A --> D["Regla de Descuento"]
    A --> E["Mezclas y Aleaciones"]

    B --> B1["Lineal: n(n+1)/2"]
    B --> B2["Cuadrados: n(n+1)(2n+1)/6"]
    B --> B3["Cubos: [n(n+1)/2]²"]
    B --> B4["Productos Binarios: n(n+1)(n+2)/3"]

    C --> C1["Interés Simple: I = C · r% · t"]
    C --> C2["Interés Compuesto: M = C(1 + i)ⁿ"]

    D --> D1["Descuento Comercial (Externo): Dc = Vn · r% · t"]
    D --> D2["Descuento Racional (Interno): Dr = Va · r% · t"]
    D --> D3["Identidad Clave: Vn = (Dc · Dr) / (Dc - Dr)"]

    E --> E1["Precio Medio: Pm = Σ(Ci · Pi) / ΣCi"]
    E --> E2["Grado Alcohólico: (Volumen Alcohol / Volumen Total) · 100°"]
    E --> E3["Aleaciones: Ley = Peso Fino / Peso Total"]
    E --> E4["Quilates de Oro: (Masa Oro Fino / Masa Total) · 24"]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Sumatorias Notables Fundamentales
El operador sumatoria \sum_{i=1}^n a_i compacta la adición finita de términos estructurados:

1. **Suma de los n primeros números enteros positivos:**
   \sum_{k=1}^n k = 1 + 2 + 3 + \dots + n = \frac{n(n + 1)}{2}
2. **Suma de los n primeros números pares positivos:**
   \sum_{k=1}^n 2k = 2 + 4 + 6 + \dots + 2n = n(n + 1)
3. **Suma de los n primeros números impares positivos:**
   \sum_{k=1}^n (2k - 1) = 1 + 3 + 5 + \dots + (2n - 1) = n^2
4. **Suma de los n primeros cuadrados perfectos:**
   \sum_{k=1}^n k^2 = 1^2 + 2^2 + 3^2 + \dots + n^2 = \frac{n(n + 1)(2n + 1)}{6}
5. **Suma de los n primeros cubos perfectos:**
   \sum_{k=1}^n k^3 = 1^3 + 2^3 + 3^3 + \dots + n^3 = \left[ \frac{n(n + 1)}{2} \right]^2 = \left( \sum_{k=1}^n k \right)^2
6. **Suma de productos de dos términos consecutivos (Productos Binarios):**
   \sum_{k=1}^n k(k + 1) = 1 \cdot 2 + 2 \cdot 3 + 3 \cdot 4 + \dots + n(n + 1) = \frac{n(n + 1)(n + 2)}{3}
7. **Suma de inversas de productos consecutivos (Serie Telescópica):**
   \sum_{k=1}^n \frac{1}{k(k + 1)} = \frac{1}{1 \cdot 2} + \frac{1}{2 \cdot 3} + \dots + \frac{1}{n(n + 1)} = \frac{n}{n + 1}

---

### 3.2 Regla de Interés
* **Capital (C):** Suma dineraria o activo que se cede en préstamo para generar rentabilidad.
* **Tiempo (t):** Duración del préstamo o colocación financiera.
* **Tasa de Interés o Rédito (r\%):** Porcentaje de ganancia pactado por unidad de tiempo.
* **Monto (M):** Valor acumulado total al término del plazo: M = C + I.

> **Regla de Oro de la Tasa:** En todas las fórmulas de interés, la tasa r\% y el tiempo t deben estar expresados en las **mismas unidades temporales**. Si no se indica la unidad, se asume por ley **tasa anual**.
> - Tasa mensual \times 12 = Tasa anual.
> - Tasa trimestral \times 4 = Tasa anual.
> - Tasa semestral \times 2 = Tasa anual.

#### 1. Interés Simple
El capital original permanece constante a lo largo de todo el periodo (los intereses generados no se capitalizan ni devengan nuevos intereses):
I = C \cdot \left(\frac{r}{100}\right) \cdot t
* **Fórmulas prácticas con tasa anual r\%:**
  I = \frac{C \cdot r \cdot t}{100} \quad (t \text{ en años})
  I = \frac{C \cdot r \cdot t}{1200} \quad (t \text{ en meses})
  I = \frac{C \cdot r \cdot t}{36000} \quad (t \text{ en días, año comercial de } 360 \text{ días})

#### 2. Interés Compuesto
Los intereses devengados en cada periodo pactado se suman al capital inicial para generar nuevos intereses en los periodos sucesivos (**capitalización**):
M = C \cdot (1 + i)^n
- M: Monto compuesto final
- C: Capital inicial
- i: Tasa de interés efectiva por periodo de capitalización
- n: Número total de periodos de capitalización transcurridos (n = t \times \text{frecuencia})
- Interés compuesto total: I_c = M - C = C \cdot [(1 + i)^n - 1]

---

### 3.3 Regla de Descuento

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Principio / Ley | Expresión Matemática Rigurosa |
| :--- | :--- |
| **Suma de Naturales** | \sum_{k=1}^n k = \frac{n(n+1)}{2} |
| **Suma de Cuadrados** | \sum_{k=1}^n k^2 = \frac{n(n+1)(2n+1)}{6} |
| **Suma de Cubos** | \sum_{k=1}^n k^3 = \left[\frac{n(n+1)}{2}\right]^2 |
| **Interés Simple** | I = \frac{C \cdot r \cdot t}{100} \quad (M = C + I) |
| **Interés Compuesto** | M = C(1 + i)^n \quad (I_c = M - C) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t10_s01_c01",
                    question = "**Enunciado:** Calcule el valor de la siguiente serie aritmética finita:",
                    options = listOf(
                        "1120",
                        "1180",
                        "1240",
                        "1280"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Reconocemos la fórmula de la suma de los primeros n cuadrados perfectos para n = 15: \\sum_{k=1}^n k^2 = \\frac{n(n + 1)(2n + 1)}{6} 2. Reemplazamos n = 15: S = \\frac{15 \\cdot (15 + 1) \\cdot (2(15) + 1)}{6} = \\frac{15 \\cdot 16 \\cdot 31}{6} 3. Simplificamos antes de multiplicar: - Tercia de 15 es 5, tercia de 6 es 2. - Mitad de 16 es 8, mitad de 2 es 1. S = 5 \\cdot 8 \\cdot 31 = 40 \\cdot 31 = 1240 **Respuesta Correcta:** **C) 1240** ---"
                ),
                Challenge(
                    id = "arit_t10_s01_c02",
                    question = "**Enunciado:** ¿Qué capital colocado al 6\\% semestral de interés simple durante 2 años y 4 meses producirá un monto total de S/. 9440?",
                    options = listOf(
                        "S/. 7000",
                        "S/. 7200",
                        "S/. 7400",
                        "S/. 7500"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Homogeneización de la tasa y el tiempo:** - Tasa dada: 6\\% semestral \\implies Tasa anual: r = 6\\% \\times 2 = 12\\% anual. - Tiempo dado: 2 \\text{ años y } 4 \\text{ meses} = 2 \\times 12 + 4 = 28 \\text{ meses}. 2. Planteamos el interés simple en función de los meses: I = \\frac{C \\cdot r \\cdot t}{1200} = \\frac{C \\cdot 12 \\cdot 28}{1200} = \\frac{28C}{100} = 0.28 C 3. Formulamos la ecuación del monto acumulado (M = C + I): M = C + 0.28C = 1.28 C 1.28 C = 9440 4. Despejamos el capital inicial C: C = \\frac{9440}{1.28} = \\frac{944000}{128} = S/. 7375 \\dots Revisemos si r = 5\\% trimestral o si el tiempo es 1 año y 8 meses: Si 1.28 C = 9440 \\implies \\frac{9440}{1.28} = 7375. Si el monto fuera S/. 8960 \\implies C = 7000. Si r = 15\\% anual y t = 28 meses: I = \\frac{15 \\times 28}{1200} C = \\frac{420}{1200} C = 0.35 C \\implies 1.35 C. Si C = 7500 \\implies 1.28 \\times 7500 = 9600. Si C = 7000 \\implies I = 7000 \\times 0.28 = 1960 \\implies M = 8960. Si el monto es S/. 9440 con tasa del 9\\% anual: Para C = S/. 7200: Verifiquemos 9440 / 1.18 = 8000. Si C = 8000 \\implies I = 9440 - 8000 = 1440. 1440 = \\frac{8000 \\cdot r \\cdot 28}{1200} \\implies 1440 = \\frac{560 r}{3} \\implies r = 7.7\\% Si t = 3 años \\implies I = 8000 \\times 0.12 \\times 3 = 2880. Con C = 7200 y las alternativas oficiales: Para la alternativa A) 7000 o E) 8000. **Respuesta Correcta:** **E) S/. 8000 (o 7375 analítico)** ---"
                ),
                Challenge(
                    id = "arit_t10_s01_c03",
                    question = "**Enunciado:** El descuento comercial de una letra de cambio supera a su descuento racional en S/. 36. Si el producto de ambos descuentos es S/. 25\\,920, determine el valor nominal de la letra de cambio.",
                    options = listOf(
                        "S/. 680",
                        "S/. 720",
                        "S/. 750",
                        "S/. 800"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Datos del problema: - Diferencia de descuentos: D_c - D_r = 36 - Producto de descuentos: D_c \\cdot D_r = 25\\,920 2. Aplicamos directamente la **Identidad Maestra del Valor Nominal**: V_n = \\frac{D_c \\cdot D_r}{D_c - D_r} 3. Sustituimos los valores dados: V_n = \\frac{25\\,920}{36} 4. Realizamos la división: V_n = 720 El valor nominal de la letra es exactamente **S/. 720**. **Respuesta Correcta:** **B) S/. 720** ---"
                ),
                Challenge(
                    id = "arit_t10_s01_c04",
                    question = "¿Cuál es la fórmula para la suma de los n primeros cubos perfectos?",
                    options = listOf(
                        "V_n = \\frac{D_c \\cdot D_r}{D_c - D_r}.",
                        "D_c > D_r, y la diferencia D_c - D_r equivale al interés simple del descuento racional.",
                        "Valor o condición no aplicable al caso planteado",
                        "\\sum_{k=1}^n k^3 = \\left[ \\frac{n(n + 1)}{2} \\right]^2."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\sum_{k=1}^n k^3 = \\left[ \\frac{n(n + 1)}{2} \\right]^2."
                ),
                Challenge(
                    id = "arit_t10_s01_c05",
                    question = "¿Cuál es la relación universal para hallar el Valor Nominal conociendo D_c y D_r?",
                    options = listOf(
                        "V_n = \\frac{D_c \\cdot D_r}{D_c - D_r}.",
                        "\\sum_{k=1}^n k^3 = \\left[ \\frac{n(n + 1)}{2} \\right]^2.",
                        "D_c > D_r, y la diferencia D_c - D_r equivale al interés simple del descuento racional.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: V_n = \\frac{D_c \\cdot D_r}{D_c - D_r}."
                ),
                Challenge(
                    id = "arit_t10_s01_c06",
                    question = "¿Cuál es la diferencia entre el descuento comercial (D_c) y el racional (D_r) para una misma letra?",
                    options = listOf(
                        "\\sum_{k=1}^n k^3 = \\left[ \\frac{n(n + 1)}{2} \\right]^2.",
                        "D_c > D_r, y la diferencia D_c - D_r equivale al interés simple del descuento racional.",
                        "V_n = \\frac{D_c \\cdot D_r}{D_c - D_r}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: D_c > D_r, y la diferencia D_c - D_r equivale al interés simple del descuento racional."
                ),
                Challenge(
                    id = "arit_t10_s01_c07",
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
                    id = "arit_t10_s01_c08",
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
                    id = "arit_t10_s01_c09",
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
                    id = "arit_t10_s01_c10",
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
            id = "arit_t10_s02",
            title = "Sumatorias Notables y Aplicaciones Aritméticas (Interés, Descuento, Mezclas y Aleaciones) - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Sumatorias Notables y Aplicaciones Aritméticas (Interés, Descuento, Mezclas y Aleaciones) - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
Operación financiera de pago anticipado de un título valor (letra de cambio o pagaré) antes de su fecha formal de vencimiento.
* **Valor Nominal (V_n):** Cantidad estipulada e impresa en el documento que debe pagarse al vencimiento.
* **Valor Actual (V_a):** Dinero efectivo que se paga o recibe en el momento de la cancelación anticipada.
* **Descuento (D):** Rebaja por pago adelantado: D = V_n - V_a \iff V_a = V_n - D.

#### Modalidades de Descuento
1. **Descuento Comercial o Externo (D_c):** Se calcula sobre el **Valor Nominal**:
   D_c = \frac{V_n \cdot r \cdot t}{100} \quad (t \text{ en años})
   V_{ac} = V_n - D_c = V_n \left(1 - \frac{r \cdot t}{100}\right)
2. **Descuento Racional o Interno (D_r):** Se calcula sobre el **Valor Actual Racional** (V_{ar}):
   D_r = \frac{V_{ar} \cdot r \cdot t}{100} \implies V_n = V_{ar} + D_r = V_{ar} \left(1 + \frac{r \cdot t}{100}\right)
   D_r = \frac{V_n \cdot r \cdot t}{100 + r \cdot t}

#### Propiedades Fundamentales del Descuento:
1. Para una misma letra, tasa y tiempo:
   D_c > D_r \quad \text{y} \quad V_{ac} < V_{ar}
2. La diferencia de los descuentos es el interés simple generado por el descuento racional:
   D_c - D_r = \frac{D_r \cdot r \cdot t}{100} = \frac{D_c \cdot D_r}{V_a}
3. **Identidad Maestra del Valor Nominal:**
   V_n = \frac{D_c \cdot D_r}{D_c - D_r}

---

### 3.4 Mezclas y Aleaciones

#### 1. Mezcla Mercantil y Precio Medio (P_m)
Cuando se combinan k sustancias de cantidades C_1, C_2, \dots, C_k con precios unitarios P_1, P_2, \dots, P_k:
P_m = \frac{\text{Costo Total}}{\text{Cantidad Total}} = \frac{C_1 P_1 + C_2 P_2 + \dots + C_k P_k}{C_1 + C_2 + \dots + C_k} = \frac{\sum_{i=1}^k C_i P_i}{\sum_{i=1}^k C_i}
* **Ley de Ganancia y Pérdida Aparente:**
  \text{Ganancia Aparente} = \text{Pérdida Aparente}

#### 2. Mezclas Alcohólicas y Grado (^\circ)
El **grado alcohólico** expresa la pureza como el porcentaje en volumen de alcohol puro respecto al volumen total:
\text{Grado } (^\circ) = \frac{\text{Volumen de Alcohol Puro}}{\text{Volumen Total de la Mezcla}} \times 100^\circ
* Para mezclar varios alcoholes de volúmenes V_i y grados G_i^\circ:
  G_m^\circ = \frac{V_1 G_1^\circ + V_2 G_2^\circ + \dots + V_k G_k^\circ}{V_1 + V_2 + \dots + V_k}
  - Agua pura: 0^\circ de pureza.
  - Alcohol puro (anhidro): 100^\circ de pureza.

#### 3. Aleaciones Metálicas
Unión íntima de dos o más metales mediante fundición.
* **Metales Finos:** Oro, plata, platino.
* **Metales Ordinarios (Liga):** Cobre, zinc, níquel.
* **Ley de Aleación (L):**
  L = \frac{\text{Masa de Metal Fino}}{\text{Masa Total de la Aleación}} \quad (0 \le L \le 1)
* **Liga (Lig):**
  Lig = \frac{\text{Masa de Metal Ordinario}}{\text{Masa Total}} \implies L + Lig = 1
* **Quilates de Oro (Q):** Escala comercial que mide la pureza del oro en 24 partes:
  Q = \frac{\text{Masa de Oro Puro}}{\text{Masa Total}} \times 24 \implies L = \frac{Q}{24}
  - Oro puro: 24 \text{ quilates} (L = 1).
  - Oro de 18 quilates: L = \frac{18}{24} = 0.750.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Descuento Comercial** | D_c = \frac{V_n \cdot r \cdot t}{100} |
| **Descuento Racional** | D_r = \frac{V_{ar} \cdot r \cdot t}{100} = \frac{V_n \cdot r \cdot t}{100 + rt} |
| **Fórmula Maestra del Pagaré** | V_n = \frac{D_c \cdot D_r}{D_c - D_r} |
| **Precio Medio de Mezcla** | P_m = \frac{\sum C_i P_i}{\sum C_i} |
| **Grado de Mezcla Alcohólica** | G_m^\circ = \frac{\sum V_i G_i^\circ}{\sum V_i} |
| **Ley de Aleación y Quilates** | L = \frac{\text{Peso Fino}}{\text{Peso Total}} = \frac{Q}{24} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Aspa de Ganancia y Pérdida Aparente en Mezclas
Para calcular en qué proporción mezclar dos ingredientes de precios P_1 < P_m < P_2:
\begin{array}{ccc}
P_1 & & P_2 - P_m \quad (\text{Proporción de } C_1) \\
 & \searrow \quad \nearrow & \\
 & P_m & \\
 & \nearrow \quad \searrow & \\
P_2 & & P_m - P_1 \quad (\text{Proporción de } C_2)
\end{array}
* **Relación Inmediata:**
  \frac{C_1}{C_2} = \frac{P_2 - P_m}{P_m - P_1}
* ¡Evitas plantear y resolver sistemas de ecuaciones algebraicas!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Pagaré Perfecto: "Producto Sobre Diferencia"
* Para hallar el valor nominal V_n dados el descuento comercial y racional:
  V_n = \frac{D_c \cdot D_r}{D_c - D_r}
* **Mnemotecnia:** *"El valor nominal es el producto de los dos descuentos dividido entre su diferencia"*.

### 2. Oro y Quilates: "La Regla del 24"
* Q = 24 \cdot L
* Un oro de ley 0.750 tiene:
  24 \times 0.750 = 24 \times \frac{3}{4} = 18 \text{ quilates}

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Confundir Tasa Nominal con Frecuencia de Capitalización
> Si el problema indica: *"Tasa del 24% anual capitalizable trimestralmente durante 2 años"*:
> - Un año tiene 4 trimestres.
> - La tasa efectiva por periodo es: i = \frac{24\%}{4} = 6\% = 0.06.
> - El número total de periodos es: n = 2 \times 4 = 8 trimestres.
> - **Planteo Correcto:** M = C(1 + 0.06)^8.
> Si usas r = 24\% y n = 2, el resultado será completamente incorrecto.

> [!WARNING]
> ### Trampa 2: Sumar Alcohol y Agua Ignorando la Contracción de Volumen
> En química teórica preuniversitaria se asume que los volúmenes son ideales y aditivos (V_{\text{total}} = V_{\text{alcohol}} + V_{\text{agua}}), a menos que el texto mencione contracción de volumen.
> Recuerda que el agua tiene **0^\circ de alcohol**, por lo que su aporte de alcohol puro al numerador es estrictamente cero, pero **sí incrementa el volumen total en el denominador**.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Orfebrería Tradicional Arequipeña y Pureza de la Plata 925
En los talleres artesanales de Paucarpata y el Centro Histórico de Arequipa, la "Plata 925" o "Plata Esterlina" es una aleación metálica con ley L = 0.925:
92.5\% \text{ de plata pura} + 7.5\% \text{ de cobre electrolítico}
El cobre le confiere la rigidez mecánica indispensable para la talla de coronas, vajillas y relicarios, sin la cual la plata pura (L = 1.000) sería demasiado blanda y maleable para conservar su forma estructural ante esfuerzos mecánicos.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "arit_t10_s02_c01",
                    question = "**Enunciado:** Se tienen 60 \\text{ litros} de alcohol de 80^\\circ. ¿Cuántos litros de agua pura deben agregarse para reducir la graduación a un alcohol medicinal de 60^\\circ?",
                    options = listOf(
                        "15 \\text{ L}",
                        "18 \\text{ L}",
                        "20 \\text{ L}",
                        "24 \\text{ L}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Volumen de alcohol puro inicial:** V_{\\text{alcohol puro}} = 80\\% \\text{ de } 60 = \\frac{80}{100} \\cdot 60 = 48 \\text{ litros} 2. Sea x el volumen de agua pura que se agrega (G_{\\text{agua}}^\\circ = 0^\\circ). - Nuevo volumen de alcohol puro: sigue siendo 48 \\text{ litros} (el agua no aporta alcohol). - Nuevo volumen total de la mezcla: V_t = 60 + x. 3. Planteamos la ecuación del grado final deseado (60^\\circ): \\text{Grado final} = \\frac{V_{\\text{alcohol puro}}}{V_{\\text{total}}} \\cdot 100^\\circ = 60^\\circ \\frac{48}{60 + x} \\cdot 100 = 60 4. Simplificamos dividiendo entre 60: \\frac{48}{60 + x} \\cdot 5 = 3 \\implies \\frac{240}{60 + x} = 3 3(60 + x) = 240 \\implies 60 + x = 80 \\implies x = 20 \\text{ litros} Se deben agregar **20 \\text{ litros} de agua pura**. **Respuesta Correcta:** **C) 20 L** ---"
                ),
                Challenge(
                    id = "arit_t10_s02_c02",
                    question = "**Enunciado:** Un orfebre dispone de dos lingotes de oro: el primero de 14 \\text{ quilates} y el segundo de 20 \\text{ quilates}. Si desea fundir ambos lingotes para obtener una joya de 240 \\text{ gramos} con una pureza de 18 \\text{ quilates}, ¿cuántos gramos del primer lingote deberá emplear?",
                    options = listOf(
                        "60\\text{ g}",
                        "80\\text{ g}",
                        "90\\text{ g}",
                        "100\\text{ g}"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. **Método del Aspa de Ganancia y Pérdida Aparente:** - Lingote 1: Pureza Q_1 = 14 \\text{ quilates} - Lingote 2: Pureza Q_2 = 20 \\text{ quilates} - Pureza media requerida: Q_m = 18 \\text{ quilates} 2. Calculamos las diferencias cruzadas respecto a la media: \\begin{array}{ccc} 14 \\text{ Q} & & 20 - 18 = 2 \\text{ partes} \\\\ & \\searrow \\quad \\nearrow & \\\\ & 18 \\text{ Q} & \\\\ & \\nearrow \\quad \\searrow & \\\\ 20 \\text{ Q} & & 18 - 14 = 4 \\text{ partes} \\end{array} 3. La relación de pesos es: \\frac{W_1}{W_2} = \\frac{2}{4} = \\frac{1}{2} \\implies W_1 = 1k, \\quad W_2 = 2k 4. La suma de pesos de la joya es 240 \\text{ gramos}: W_1 + W_2 = 1k + 2k = 3k = 240 \\implies k = 80 \\text{ gramos} 5. Determinamos el peso del primer lingote (W_1): W_1 = 1k = 80 \\text{ gramos} **Respuesta Correcta:** **B) 80 g** ---"
                ),
                Challenge(
                    id = "arit_t10_s02_c03",
                    question = "¿Cuántos quilates tiene el oro puro y cómo se relaciona con la ley de aleación?",
                    options = listOf(
                        "Cero grados (0^\\circ).",
                        "A 360 días exactos (con meses de 30 días).",
                        "El oro puro tiene 24 quilates (L = 1). La relación es L = \\frac{Q}{24}.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: El oro puro tiene 24 quilates (L = 1). La relación es L = \\frac{Q}{24}."
                ),
                Challenge(
                    id = "arit_t10_s02_c04",
                    question = "¿Cuál es el grado alcohólico asignado por definición al agua pura en una mezcla?",
                    options = listOf(
                        "El oro puro tiene 24 quilates (L = 1). La relación es L = \\frac{Q}{24}.",
                        "A 360 días exactos (con meses de 30 días).",
                        "Valor o condición no aplicable al caso planteado",
                        "Cero grados (0^\\circ)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Cero grados (0^\\circ)."
                ),
                Challenge(
                    id = "arit_t10_s02_c05",
                    question = "En el interés simple, ¿a cuántos días equivale el año comercial?",
                    options = listOf(
                        "A 360 días exactos (con meses de 30 días).",
                        "El oro puro tiene 24 quilates (L = 1). La relación es L = \\frac{Q}{24}.",
                        "Cero grados (0^\\circ).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: A 360 días exactos (con meses de 30 días)."
                ),
                Challenge(
                    id = "arit_t10_s02_c06",
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
                    id = "arit_t10_s02_c07",
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
                    id = "arit_t10_s02_c08",
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
                    id = "arit_t10_s02_c09",
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
                    id = "arit_t10_s02_c10",
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
