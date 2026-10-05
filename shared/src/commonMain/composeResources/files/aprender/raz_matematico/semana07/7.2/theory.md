## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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
