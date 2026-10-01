package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t07_s01",
            title = "ESTADÍSTICA Y ANÁLISIS DE DATOS - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "ESTADÍSTICA Y ANÁLISIS DE DATOS - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Lectura e interpretación de gráficos de barras y circulares (sectores), media aritmética, mediana y moda para datos no agrupados y agrupados. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de encuestas socioeconómicas del INEI, pirámides poblacionales, toma de decisiones y dispersión de datos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Reconstrucción de tablas de frecuencias con intervalos de clase, ojivas porcentuales, varianza y desviación estándar muestral. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Interpretar y reconstruir tablas de distribución de frecuencias absolutas, relativas y acumuladas.
2. Analizar y procesar información visual a partir de gráficos de barras, histogramas, polígonos de frecuencia y diagramas circulares (sectores).
3. Comprender, calcular e interpretar con precisión las medidas de tendencia central: Media Aritmética (\bar{x}), Mediana (Me) y Moda (Mo).
4. Evaluar críticamente información numérica y estadística detectando sesgos, dispersión o interpretaciones erróneas en medios de comunicación.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Frecuencia Absoluta (f_i) y Frecuencia Relativa (h_i)
        ┌─ 1. Organización ────┼─ Frecuencias Acumuladas (F_i, H_i)
        │      de Datos        ├─ Tablas para Datos No Agrupados
        │                      └─ Tablas con Intervalos de Clase (Límite inferior, superior, Ancho w)
        │
ESTADÍSTICA                    ┌─ Diagrama de Barras (Variables cualitativas o cuantitativas discretas)
Y ANÁLISIS ─────┼─ 2. Representación ──┼─ Histograma y Polígono de Frecuencias (Variables continuas)
DE DATOS        │      Gráfica         └─ Diagrama Circular o de Sectores (Ángulos: theta = h_i * 360°)
        │
        │                      ┌─ Media Aritmética Simple y Ponderada (Promedio ponderado)
        ├─ 3. Medidas de ──────┼─ Mediana (Me: El 50% central que divide la distribución)
        │      Tendencia       └─ Moda (Mo: El valor o intervalo de máxima frecuencia)
        │      Central
        │
        └─ 4. Medidas de ──────┌─ Rango o Recorrido (R = X_max - X_min)
               Dispersión      ├─ Varianza (sigma^2 o s^2)
               y Posición      └─ Desviación Estándar (sigma = sqrt(Varianza)) y Cuartiles
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Tablas de Distribución de Frecuencias
Para una muestra de tamaño n:
1. **Frecuencia Absoluta (f_i):** Número de veces que se repite el valor o dato x_i:
   \sum_{i=1}^k f_i = n
2. **Frecuencia Relativa (h_i):** Proporción del total representada por la frecuencia absoluta:
   h_i = \frac{f_i}{n}, \quad \text{donde } 0 \le h_i \le 1 \quad \text{y} \quad \sum_{i=1}^k h_i = 1
   * Frecuencia relativa porcentual: h_i\% = h_i \times 100\%.
3. **Frecuencias Acumuladas:**
   * **Absoluta acumulada (F_i):** F_i = f_1 + f_2 + \dots + f_i.
   * **Relativa acumulada (H_i):** H_i = h_1 + h_2 + \dots + h_i = \frac{F_i}{n}.

---

### 3.2 Gráficos Estadísticos y sus Fórmulas de Conversión

#### A. Diagrama Circular (Gráfico de Sectores / Torta)
Cada sector circular representa una categoría cuya área y ángulo central (\alpha_i) son **directamente proporcionales** a su frecuencia relativa:
\frac{\alpha_i}{360^\circ} = \frac{h_i\%}{100\%} = \frac{f_i}{n} = h_i
* **Fórmula de conversión angular:**
  \alpha_i = h_i \cdot 360^\circ = \left(\frac{f_i}{n}\right) \cdot 360^\circ
* **Fórmula de conversión porcentual:**
  h_i\% = \left(\frac{\alpha_i}{360^\circ}\right) \cdot 100\%

---

### 3.3 Medidas de Tendencia Central

#### A. Media Aritmética (\bar{x})

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE DISPERSIÓN

| Medida | Expresión Matemática | Interpretación |
| :--- | :--- | :---: |
| **Rango (R)** | R = x_{\text{máximo}} - x_{\text{mínimo}} | Amplitud total de variación de los datos |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t07_s01_c01",
                    question = "El siguiente gráfico circular muestra la preferencia de 1,200 estudiantes universitarios por diferentes lenguajes de programación. Si el sector correspondiente a Kotlin abarca un ángulo central de 54^\\circ, ¿cuántos estudiantes prefieren Kotlin?",
                    options = listOf(
                        "120",
                        "150",
                        "180",
                        "200"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t07_s01_c02",
                    question = "Las notas de un postulante en 5 simulacros de admisión fueron: 13, 16, 14, 18 y x. Si la media aritmética de sus 5 notas fue de 16.0, ¿cuál fue la nota x obtenida en el último simulacro?",
                    options = listOf(
                        "17",
                        "18",
                        "19",
                        "20"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t07_s01_c03",
                    question = "Se tienen los pesos en kilogramos de 9 pacientes que asisten a una consulta nutricional:",
                    options = listOf(
                        "Me = 65, Bimodal",
                        "Me = 66, Unimodal con Mo = 62",
                        "Me = 68, Unimodal",
                        "Me = 66, Amodal"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t07_s01_c04",
                    question = "¿A qué equivale la suma total de las frecuencias relativas (h_i) de una muestra?",
                    options = listOf(
                        "\\alpha_i = h_i \\cdot 360^\\circ (o \\alpha_i = \\frac{f_i}{n} \\cdot 360^\\circ).",
                        "La **Mediana (Me)**, porque no se ve afectada por valores extremos atípicos como la media.",
                        "Valor o condición no aplicable al caso planteado",
                        "Siempre equivale exactamente a 1 (o al 100\\% si se expresan en porcentaje)."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Siempre equivale exactamente a 1 (o al 100\\% si se expresan en porcentaje)."
                ),
                Challenge(
                    id = "rm_t07_s01_c05",
                    question = "¿Cuál es la relación matemática entre el ángulo de un sector circular y su frecuencia relativa?",
                    options = listOf(
                        "\\alpha_i = h_i \\cdot 360^\\circ (o \\alpha_i = \\frac{f_i}{n} \\cdot 360^\\circ).",
                        "Siempre equivale exactamente a 1 (o al 100\\% si se expresan en porcentaje).",
                        "La **Mediana (Me)**, porque no se ve afectada por valores extremos atípicos como la media.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: \\alpha_i = h_i \\cdot 360^\\circ (o \\alpha_i = \\frac{f_i}{n} \\cdot 360^\\circ)."
                ),
                Challenge(
                    id = "rm_t07_s01_c06",
                    question = "¿Qué medida de tendencia central es la más adecuada cuando existen datos atípicos o extremos muy alejados?",
                    options = listOf(
                        "Siempre equivale exactamente a 1 (o al 100\\% si se expresan en porcentaje).",
                        "La **Mediana (Me)**, porque no se ve afectada por valores extremos atípicos como la media.",
                        "\\alpha_i = h_i \\cdot 360^\\circ (o \\alpha_i = \\frac{f_i}{n} \\cdot 360^\\circ).",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: La **Mediana (Me)**, porque no se ve afectada por valores extremos atípicos como la media."
                ),
                Challenge(
                    id = "rm_t07_s01_c07",
                    question = "En un gráfico circular de 1,200 postulantes, el sector de Medicina abarca 54°. ¿Cuántos postulantes representa dicho sector?",
                    options = listOf(
                        "120",
                        "150",
                        "180",
                        "240"
                    ),
                    correctIndex = 2,
                    explanation = "54° / 360° = 3/20 = 15%. El 15% de 1,200 alumnos es (15 * 1200) / 100 = 180 alumnos."
                ),
                Challenge(
                    id = "rm_t07_s01_c08",
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
                    id = "rm_t07_s01_c09",
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
                    id = "rm_t07_s01_c10",
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
            id = "rm_t07_s02",
            title = "ESTADÍSTICA Y ANÁLISIS DE DATOS - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "ESTADÍSTICA Y ANÁLISIS DE DATOS - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Datos No Agrupados:**
  \bar{x} = \frac{\sum_{i=1}^n x_i}{n} = \frac{x_1 + x_2 + \dots + x_n}{n}
* **Media Ponderada (Promedio con Pesos o Créditos):**
  \bar{x}_w = \frac{\sum w_i x_i}{\sum w_i} = \frac{w_1 x_1 + w_2 x_2 + \dots + w_k x_k}{w_1 + w_2 + \dots + w_k}
* **Datos Agrupados en Intervalos (Marca de Clase x_i):**
  \bar{x} = \frac{\sum_{i=1}^k f_i x_i}{n}
  *(Donde la marca de clase es el punto medio del intervalo: x_i = \frac{L_i + L_s}{2}).*

#### B. Mediana (Me)
Es el valor que divide a un conjunto de datos ordenados exactamente en dos partes iguales (50\% por debajo y 50\% por encima).
* **Para Datos No Agrupados:**
  1. Se ordenan los datos en orden creciente.
  2. Si n es impar: Me = x_{\left(\frac{n+1}{2}\right)}.
  3. Si n es par: Me = \frac{x_{(n/2)} + x_{(n/2 + 1)}}{2}.
* **Para Datos Agrupados en Intervalos:**
  Me = L_i + w \cdot \left[ \frac{\frac{n}{2} - F_{i-1}}{f_i} \right]
  Donde:
  * L_i: Límite inferior del intervalo modal que contiene a \frac{n}{2}.
  * w: Ancho de clase del intervalo (w = L_s - L_i).
  * F_{i-1}: Frecuencia absoluta acumulada del intervalo anterior.
  * f_i: Frecuencia absoluta del intervalo mediano.

#### C. Moda (Mo)
Es el valor de la variable que posee la **mayor frecuencia absoluta** (el que más se repite).
* Puede ser unimodal (una sola moda), bimodal (dos modas) o amodal (todos los datos tienen la misma frecuencia).
* **Para Datos Agrupados en Intervalos:**
  Mo = L_i + w \cdot \left[ \frac{\Delta_1}{\Delta_1 + \Delta_2} \right]
  Donde \Delta_1 = f_i - f_{i-1} y \Delta_2 = f_i - f_{i+1}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Varianza Poblacional (\sigma^2)** | \sigma^2 = \frac{\sum (x_i - \bar{x})^2}{N} | Promedio de las desviaciones al cuadrado respecto a la media |
| **Desviación Estándar (\sigma)** | \sigma = \sqrt{\sigma^2} = \sqrt{\frac{\sum (x_i - \bar{x})^2}{N}} | Dispersión promedio en las mismas unidades que la variable original |
| **Coeficiente de Variación (CV)** | CV = \left( \frac{\sigma}{\bar{x}} \right) \cdot 100\% | Medida relativa de homogeneidad (si CV < 15\%, los datos son muy homogéneos) |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Artificio de la Media Supuesta (Cálculo Rápido de Promedios Altos)
Si te piden promediar números grandes como: 184, 188, 192, 186, 190:
1. Escoge una **media supuesta cómoda**: M_s = 180.
2. Calcula las desviaciones simples respecto a 180:
   +4, \quad +8, \quad +12, \quad +6, \quad +10
3. Promedia las desviaciones:
   \text{Promedio de diferencias} = \frac{4 + 8 + 12 + 6 + 10}{5} = \frac{40}{5} = +8
4. Suma a la media supuesta:
   \bar{x} = 180 + 8 = \mathbf{188}. (Sin sumar números de tres cifras).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL 360 ES EL 100 POR CIENTO"
> Para convertir rápido de grados sexagesimales a porcentajes en un gráfico circular:
> **"Divide el ángulo entre 3.6 para tener porcentaje; multiplica el porcentaje por 3.6 para tener grados"**  
> * Ángulo de 90^\circ \implies \frac{90}{3.6} = \mathbf{25\%}.  
> * Ángulo de 180^\circ \implies \frac{180}{3.6} = \mathbf{50\%}.  
> * Ángulo de 54^\circ \implies \frac{54}{3.6} = \mathbf{15\%}. (Ahorro de 1 minuto de regla de tres).

### Mnemotecnia 2: La Jerarquía de las Medidas
> En distribuciones asimétricas a la derecha (sesgo positivo):
> **Mo < Me < \bar{x}** \to *"La Moda es Menor que la Media"*

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La Media es hipersensible a datos atípicos (outliers):**
   * Si en una pequeña empresa 4 empleados ganan S/.\, 1,200 y el gerente general gana S/.\, 50,000, la media aritmética salarial será distorsionada (S/.\, 10,960).
   * *Pregunta trampa:* "¿Cuál es la medida más representativa en una distribución con datos atípicos extremos?"
   * **Respuesta correcta:** La **Mediana (Me)**, jamás la Media.
2. ⚠️ **Suma de frecuencias relativas:**
   * La suma de todos los h_i **siempre es exactamente 1.0000** (o 100\%). Si al reconstruir una tabla la suma no te da 1, un despeje previo está errado.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Postulantes por Área en la UNSA (Arequipa)
En el último examen de admisión de la UNSA, se procesaron los datos de 18,000 postulantes representados en un diagrama de sectores circulares:
* Área de Ingenierías: Sector de 144^\circ.
* Área de Biomédicas: Sector de 108^\circ.
* Área de Sociales: Sector de 108^\circ.
* **Cálculo analítico:**
  - Ingenierías: \frac{144}{3.6} = 40\% \implies 40\% \times 18,000 = \mathbf{7,200 \text{ postulantes}}.
  - Biomédicas: \frac{108}{3.6} = 30\% \implies 30\% \times 18,000 = \mathbf{5,400 \text{ postulantes}}.
  - Sociales: \frac{108}{3.6} = 30\% \implies 30\% \times 18,000 = \mathbf{5,400 \text{ postulantes}}.
  - Verificación: 7,200 + 5,400 + 5,400 = 18,000.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t07_s02_c01",
                    question = "Un estudiante de Ingeniería de Sistemas de la UNSA cursa 4 asignaturas con sus respectivos créditos:",
                    options = listOf(
                        "14.4",
                        "14.8",
                        "15.0",
                        "15.2"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t07_s02_c02",
                    question = "Dada la siguiente tabla simétrica de distribución de frecuencias para 100 empleados con anchos de clase comunes y constantes w:",
                    options = listOf(
                        "\\bar{x} = 35, Me = 35",
                        "\\bar{x} = 30, Me = 32.5",
                        "\\bar{x} = 35, Me = 36",
                        "\\bar{x} = 32.5, Me = 35"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t07_s02_c03",
                    question = "En una distribución unimodal simétrica perfecta, ¿qué relación existe entre Media, Mediana y Moda?",
                    options = listOf(
                        "Es el promedio de sus límites: x_i = \\frac{L_i + L_s}{2}.",
                        "Valor o condición no aplicable al caso planteado",
                        "Las tres medidas son idénticas: \\bar{x} = Me = Mo.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Las tres medidas son idénticas: \\bar{x} = Me = Mo."
                ),
                Challenge(
                    id = "rm_t07_s02_c04",
                    question = "¿Cómo se calcula la marca de clase (x_i) de un intervalo [L_i, L_s\\rangle?",
                    options = listOf(
                        "Las tres medidas son idénticas: \\bar{x} = Me = Mo.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Es el promedio de sus límites: x_i = \\frac{L_i + L_s}{2}."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Es el promedio de sus límites: x_i = \\frac{L_i + L_s}{2}."
                ),
                Challenge(
                    id = "rm_t07_s02_c05",
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
                    id = "rm_t07_s02_c06",
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
                    id = "rm_t07_s02_c07",
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
                    id = "rm_t07_s02_c08",
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
                    id = "rm_t07_s02_c09",
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
                    id = "rm_t07_s02_c10",
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
