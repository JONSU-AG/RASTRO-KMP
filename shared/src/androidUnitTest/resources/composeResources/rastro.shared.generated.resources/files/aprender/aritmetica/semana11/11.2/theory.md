## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  F_i \ge \frac{n}{2}
* **Paso 2:** Aplicar la fórmula de interpolación lineal:
  Me = L_i + w \cdot \left( \frac{\frac{n}{2} - F_{i-1}}{f_i} \right)
  - L_i: Límite inferior de la clase mediana.
  - w: Ancho de clase.
  - F_{i-1}: Frecuencia absoluta acumulada de la clase anterior.
  - f_i: Frecuencia absoluta simple de la clase mediana.

#### 3. Moda (Mo)
Es el valor alrededor del cual se concentra la mayor densidad de observaciones:
* **Paso 1:** Ubicar la clase modal (el intervalo con la mayor frecuencia absoluta simple f_i).
* **Paso 2:** Aplicar la fórmula modal de Czuber:
  Mo = L_i + w \cdot \left( \frac{d_1}{d_1 + d_2} \right)
  donde:
  d_1 = f_i - f_{i-1} \quad (\text{exceso modal anterior})
  d_2 = f_i - f_{i+1} \quad (\text{exceso modal posterior})

---

### 3.4 Medidas de Posición (Cuartiles y Percentiles)
* **Cuartiles (Q_1, Q_2, Q_3):** Tres valores que dividen la muestra ordenada en cuatro partes de 25\% cada una. (Q_2 = Me).
* **Percentil k (P_k para k = 1, 2, \dots, 99):** Valor por debajo del cual se encuentra el k\% de las observaciones:
  P_k = L_i + w \cdot \left( \frac{\frac{k \cdot n}{100} - F_{i-1}}{f_i} \right)

---

### 3.5 Medidas de Dispersión o Variabilidad
Cuantifican el grado de alejamiento o concentración de los datos respecto a la media aritmética.

#### 1. Varianza (s^2 o \sigma^2)
Promedio de los desvíos cuadráticos respecto a la media:
s^2 = \frac{\sum_{i=1}^k f_i (x_i - \bar{x})^2}{n} = \frac{\sum_{i=1}^k f_i x_i^2}{n} - \bar{x}^2

#### 2. Desviación Estándar (s)
Raíz cuadrada positiva de la varianza (posee las mismas unidades físicas que la variable original):
s = \sqrt{s^2}

#### 3. Coeficiente de Variación (CV)
Medida adimensional de dispersión relativa que evalúa la representatividad de la media y la homogeneidad de la muestra:
CV = \left( \frac{s}{\bar{x}} \right) \times 100\%
* **Criterio de Homogeneidad:**
  - CV \le 10\%: Datos **muy homogéneos** (media altamente confiable).
  - 10\% < CV \le 30\%: Variabilidad moderada.
  - CV > 30\%: Datos **heterogéneos** (alta dispersión, media poco representativa).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Percentil k** | P_k = L_i + w \left( \frac{\frac{kn}{100} - F_{i-1}}{f_i} \right) |
| **Varianza Simplificada** | s^2 = \frac{\sum x_i^2 f_i}{n} - \bar{x}^2 |
| **Desviación Estándar** | s = \sqrt{s^2} |
| **Coeficiente de Variación** | CV = \frac{s}{\bar{x}} \times 100\% |
| **Transformación Lineal (y = ax + b)** | \bar{y} = a\bar{x} + b, \quad s_y^2 = a^2 s_x^2, \quad s_y = |a| s_x |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Reconstrucción Relámpago de Tablas mediante la Relación h_i y f_i
En la UNSA abundan tablas con casilleros vacíos:
* Recuerda siempre que las razones son idénticas:
  \frac{f_1}{h_1} = \frac{f_2}{h_2} = \dots = \frac{f_k}{h_k} = n \quad (\text{Muestra total})
* Si tienes f_3 = 18 y h_3 = 0.15:
  n = \frac{18}{0.15} = \frac{1800}{15} = 120
* ¡Con el valor de n, completas inmediatamente toda la columna de f_i multiplicando 120 \times h_i, y la columna de h_i dividiendo f_i / 120!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. La Fórmula de la Mediana: "La Mitad Menos lo que Acumulé"
* Me = L_i + w \cdot \frac{\frac{n}{2} - F_{i-1}}{f_i}
* **Mnemotecnia:** *"Empiezas en el piso (L_i), sumas el ancho (w), y multiplicas por la fracción: la mitad del pueblo (\frac{n}{2}) menos los que ya pasaron (F_{i-1}), dividido entre los que están adentro (f_i)"*.

### 2. Transformaciones Lineales: "La Varianza Ignora la Suma y Eleva la Escala al Cuadrado"
* Si a todos los datos se les suma una constante (x + c): la varianza **no cambia**.
* Si se les multiplica por una constante (c \cdot x): la varianza queda multiplicada por **c^2**, y la desviación estándar por **|c|**.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: Confundir Frecuencia Absoluta Acumulada (F_i) con Simple (f_i)
> Al aplicar la fórmula de la mediana o de percentiles, en el denominador va la frecuencia **SIMPLE** de la clase (f_i), mientras que en el numerador se resta la **ACUMULADA ANTERIOR** (F_{i-1}).
> Colocar la frecuencia acumulada en el denominador es el error más recurrente que conduce a alternativas trampa.

> [!WARNING]
> ### Trampa 2: La Media de un Gráfico Circular no es el Promedio de Ángulos
> En un gráfico de sectores circulares (gráfico de torta), el ángulo \theta_i es proporcional a la frecuencia relativa: \theta_i = 360^\circ \cdot h_i.
> Si el examen pregunta por el porcentaje que representa un sector de 54^\circ:
> \% = \frac{54^\circ}{360^\circ} \times 100\% = 15\%
> No intentes dividir entre 100 grados.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Control de Calidad Metalúrgica en Fundición de Cobre en Southern Perú
En los laboratorios de control químico de Moquegua y Arequipa, se evalúa la pureza del concentrado de cobre en lotes de exportación. Si dos procesos de flotación tienen la misma ley media (\bar{x} = 28.5\% de Cu), la empresa elegirá el proceso con el menor **Coeficiente de Variación (CV)**:
- Proceso A: s = 0.5\% \implies CV_A = \frac{0.5}{28.5} \times 100\% = 1.75\% (Altamente confiable y homogéneo).
- Proceso B: s = 2.1\% \implies CV_B = \frac{2.1}{28.5} \times 100\% = 7.37\%.
El análisis de dispersión previene penalizaciones internacionales por variabilidad en embarques marítimos.

---
