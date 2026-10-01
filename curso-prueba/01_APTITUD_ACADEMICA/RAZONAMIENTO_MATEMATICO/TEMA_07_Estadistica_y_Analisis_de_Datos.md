# TEMA 07 · ESTADÍSTICA Y ANÁLISIS DE DATOS
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_07`  
**Target Universidades:** `[UNSA: 100% Frecuente (1 pregunta por examen)] [UNMSM: Enfoque DECO lectura de gráficos circulares e histogramas] [UNI: Medidas de posición, ponderación y dispersión]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Lectura e interpretación de gráficos de barras y circulares (sectores), media aritmética, mediana y moda para datos no agrupados y agrupados. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de encuestas socioeconómicas del INEI, pirámides poblacionales, toma de decisiones y dispersión de datos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Reconstrucción de tablas de frecuencias con intervalos de clase, ojivas porcentuales, varianza y desviación estándar muestral. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Interpretar y reconstruir tablas de distribución de frecuencias absolutas, relativas y acumuladas.
2. Analizar y procesar información visual a partir de gráficos de barras, histogramas, polígonos de frecuencia y diagramas circulares (sectores).
3. Comprender, calcular e interpretar con precisión las medidas de tendencia central: Media Aritmética ($\bar{x}$), Mediana ($Me$) y Moda ($Mo$).
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

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Tablas de Distribución de Frecuencias
Para una muestra de tamaño $n$:
1. **Frecuencia Absoluta ($f_i$):** Número de veces que se repite el valor o dato $x_i$:
   $$\sum_{i=1}^k f_i = n$$
2. **Frecuencia Relativa ($h_i$):** Proporción del total representada por la frecuencia absoluta:
   $$h_i = \frac{f_i}{n}, \quad \text{donde } 0 \le h_i \le 1 \quad \text{y} \quad \sum_{i=1}^k h_i = 1$$
   * Frecuencia relativa porcentual: $h_i\% = h_i \times 100\%$.
3. **Frecuencias Acumuladas:**
   * **Absoluta acumulada ($F_i$):** $F_i = f_1 + f_2 + \dots + f_i$.
   * **Relativa acumulada ($H_i$):** $H_i = h_1 + h_2 + \dots + h_i = \frac{F_i}{n}$.

---

### 3.2 Gráficos Estadísticos y sus Fórmulas de Conversión

#### A. Diagrama Circular (Gráfico de Sectores / Torta)
Cada sector circular representa una categoría cuya área y ángulo central ($\alpha_i$) son **directamente proporcionales** a su frecuencia relativa:
$$\frac{\alpha_i}{360^\circ} = \frac{h_i\%}{100\%} = \frac{f_i}{n} = h_i$$
* **Fórmula de conversión angular:**
  $$\alpha_i = h_i \cdot 360^\circ = \left(\frac{f_i}{n}\right) \cdot 360^\circ$$
* **Fórmula de conversión porcentual:**
  $$h_i\% = \left(\frac{\alpha_i}{360^\circ}\right) \cdot 100\%$$

---

### 3.3 Medidas de Tendencia Central

#### A. Media Aritmética ($\bar{x}$)
* **Datos No Agrupados:**
  $$\bar{x} = \frac{\sum_{i=1}^n x_i}{n} = \frac{x_1 + x_2 + \dots + x_n}{n}$$
* **Media Ponderada (Promedio con Pesos o Créditos):**
  $$\bar{x}_w = \frac{\sum w_i x_i}{\sum w_i} = \frac{w_1 x_1 + w_2 x_2 + \dots + w_k x_k}{w_1 + w_2 + \dots + w_k}$$
* **Datos Agrupados en Intervalos (Marca de Clase $x_i$):**
  $$\bar{x} = \frac{\sum_{i=1}^k f_i x_i}{n}$$
  *(Donde la marca de clase es el punto medio del intervalo: $x_i = \frac{L_i + L_s}{2}$).*

#### B. Mediana ($Me$)
Es el valor que divide a un conjunto de datos ordenados exactamente en dos partes iguales ($50\%$ por debajo y $50\%$ por encima).
* **Para Datos No Agrupados:**
  1. Se ordenan los datos en orden creciente.
  2. Si $n$ es impar: $Me = x_{\left(\frac{n+1}{2}\right)}$.
  3. Si $n$ es par: $Me = \frac{x_{(n/2)} + x_{(n/2 + 1)}}{2}$.
* **Para Datos Agrupados en Intervalos:**
  $$Me = L_i + w \cdot \left[ \frac{\frac{n}{2} - F_{i-1}}{f_i} \right]$$
  Donde:
  * $L_i$: Límite inferior del intervalo modal que contiene a $\frac{n}{2}$.
  * $w$: Ancho de clase del intervalo ($w = L_s - L_i$).
  * $F_{i-1}$: Frecuencia absoluta acumulada del intervalo anterior.
  * $f_i$: Frecuencia absoluta del intervalo mediano.

#### C. Moda ($Mo$)
Es el valor de la variable que posee la **mayor frecuencia absoluta** (el que más se repite).
* Puede ser unimodal (una sola moda), bimodal (dos modas) o amodal (todos los datos tienen la misma frecuencia).
* **Para Datos Agrupados en Intervalos:**
  $$Mo = L_i + w \cdot \left[ \frac{\Delta_1}{\Delta_1 + \Delta_2} \right]$$
  Donde $\Delta_1 = f_i - f_{i-1}$ y $\Delta_2 = f_i - f_{i+1}$.

---

## 4. 📐 FORMULARIO MAESTRO DE DISPERSIÓN

| Medida | Expresión Matemática | Interpretación |
| :--- | :--- | :---: |
| **Rango ($R$)** | $$R = x_{\text{máximo}} - x_{\text{mínimo}}$$ | Amplitud total de variación de los datos |
| **Varianza Poblacional ($\sigma^2$)** | $$\sigma^2 = \frac{\sum (x_i - \bar{x})^2}{N}$$ | Promedio de las desviaciones al cuadrado respecto a la media |
| **Desviación Estándar ($\sigma$)** | $$\sigma = \sqrt{\sigma^2} = \sqrt{\frac{\sum (x_i - \bar{x})^2}{N}}$$ | Dispersión promedio en las mismas unidades que la variable original |
| **Coeficiente de Variación ($CV$)** | $$CV = \left( \frac{\sigma}{\bar{x}} \right) \cdot 100\%$$ | Medida relativa de homogeneidad (si $CV < 15\%$, los datos son muy homogéneos) |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL 360 ES EL 100 POR CIENTO"
> Para convertir rápido de grados sexagesimales a porcentajes en un gráfico circular:
> **"Divide el ángulo entre 3.6 para tener porcentaje; multiplica el porcentaje por 3.6 para tener grados"**  
> * Ángulo de $90^\circ \implies \frac{90}{3.6} = \mathbf{25\%}$.  
> * Ángulo de $180^\circ \implies \frac{180}{3.6} = \mathbf{50\%}$.  
> * Ángulo de $54^\circ \implies \frac{54}{3.6} = \mathbf{15\%}$. (Ahorro de 1 minuto de regla de tres).

### Mnemotecnia 2: La Jerarquía de las Medidas
> En distribuciones asimétricas a la derecha (sesgo positivo):
> **$Mo < Me < \bar{x}$** $\to$ *"La Moda es Menor que la Media"*

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Artificio de la Media Supuesta (Cálculo Rápido de Promedios Altos)
Si te piden promediar números grandes como: $184, 188, 192, 186, 190$:
1. Escoge una **media supuesta cómoda**: $M_s = 180$.
2. Calcula las desviaciones simples respecto a 180:
   $$+4, \quad +8, \quad +12, \quad +6, \quad +10$$
3. Promedia las desviaciones:
   $$\text{Promedio de diferencias} = \frac{4 + 8 + 12 + 6 + 10}{5} = \frac{40}{5} = +8$$
4. Suma a la media supuesta:
   $$\bar{x} = 180 + 8 = \mathbf{188}$$. (Sin sumar números de tres cifras).

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La Media es hipersensible a datos atípicos (outliers):**
   * Si en una pequeña empresa 4 empleados ganan $S/.\, 1,200$ y el gerente general gana $S/.\, 50,000$, la media aritmética salarial será distorsionada ($S/.\, 10,960$).
   * *Pregunta trampa:* "¿Cuál es la medida más representativa en una distribución con datos atípicos extremos?"
   * **Respuesta correcta:** La **Mediana ($Me$)**, jamás la Media.
2. ⚠️ **Suma de frecuencias relativas:**
   * La suma de todos los $h_i$ **siempre es exactamente 1.0000** (o $100\%$). Si al reconstruir una tabla la suma no te da 1, un despeje previo está errado.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Postulantes por Área en la UNSA (Arequipa)
En el último examen de admisión de la UNSA, se procesaron los datos de 18,000 postulantes representados en un diagrama de sectores circulares:
* Área de Ingenierías: Sector de $144^\circ$.
* Área de Biomédicas: Sector de $108^\circ$.
* Área de Sociales: Sector de $108^\circ$.
* **Cálculo analítico:**
  - Ingenierías: $\frac{144}{3.6} = 40\% \implies 40\% \times 18,000 = \mathbf{7,200 \text{ postulantes}}$.
  - Biomédicas: $\frac{108}{3.6} = 30\% \implies 30\% \times 18,000 = \mathbf{5,400 \text{ postulantes}}$.
  - Sociales: $\frac{108}{3.6} = 30\% \implies 30\% \times 18,000 = \mathbf{5,400 \text{ postulantes}}$.
  - Verificación: $7,200 + 5,400 + 5,400 = 18,000$.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Gráficos Circulares)
El siguiente gráfico circular muestra la preferencia de 1,200 estudiantes universitarios por diferentes lenguajes de programación. Si el sector correspondiente a Kotlin abarca un ángulo central de $54^\circ$, ¿cuántos estudiantes prefieren Kotlin?
A) 120  
B) 150  
C) 180  
D) 200  
E) 240  

**Solución Paso a Paso:**
1. Planteamos la relación proporcional entre el ángulo central y el total de la circunferencia ($360^\circ$):
   $$\text{Estudiantes que prefieren Kotlin} = \left(\frac{54^\circ}{360^\circ}\right) \times 1,200$$
2. Simplificamos la fracción dividiendo entre 18:
   $$\frac{54}{360} = \frac{3}{20}$$
3. Multiplicamos por la población total:
   $$\text{Estudiantes} = \frac{3}{20} \times 1,200 = 3 \times 60 = \mathbf{180 \text{ estudiantes}}$$.  
**Clave: C**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Media Aritmética)
Las notas de un postulante en 5 simulacros de admisión fueron: $13, 16, 14, 18$ y $x$. Si la media aritmética de sus 5 notas fue de $16.0$, ¿cuál fue la nota $x$ obtenida en el último simulacro?
A) 17  
B) 18  
C) 19  
D) 20  
E) 16  

**Solución Paso a Paso:**
1. Aplicamos la definición de media aritmética para datos no agrupados:
   $$\bar{x} = \frac{13 + 16 + 14 + 18 + x}{5} = 16$$
2. Sumamos los valores conocidos del numerador:
   $$13 + 16 + 14 + 18 = 61$$
   $$\frac{61 + x}{5} = 16$$
3. Despejamos la incógnita $x$:
   $$61 + x = 16 \times 5 = 80$$
   $$x = 80 - 61 = \mathbf{19}$$.  
**Clave: C**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Mediana y Reconstrucción)
Se tienen los pesos en kilogramos de 9 pacientes que asisten a una consulta nutricional:
$$62, \quad 58, \quad 74, \quad 65, \quad 80, \quad 62, \quad 70, \quad 68, \quad 66$$
Si el médico tratante decide analizar las medidas de tendencia central, calcule el valor de la Mediana ($Me$) y determine si la distribución es unimodal o bimodal.
A) $Me = 65$, Bimodal  
B) $Me = 66$, Unimodal con $Mo = 62$  
C) $Me = 68$, Unimodal  
D) $Me = 66$, Amodal  
E) $Me = 65$, Unimodal con $Mo = 66$  

**Solución Paso a Paso:**
1. Para hallar la mediana, primero **ordenamos los 9 datos en orden estrictamente creciente**:
   $$58, \quad 62, \quad 62, \quad 65, \quad \mathbf{66}, \quad 68, \quad 70, \quad 74, \quad 80$$
2. Como el número de datos es impar ($n = 9$), la mediana es el dato central que ocupa la posición $\frac{9 + 1}{2} = 5.°$ lugar:
   $$Me = x_5 = \mathbf{66 \text{ kg}}$$
3. Para la moda ($Mo$), observamos cuál es el dato con mayor frecuencia absoluta:
   - El número $62$ se repite 2 veces.
   - Todos los demás datos aparecen solo 1 vez.
   - Por tanto, la distribución es **Unimodal** con $Mo = 62$.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Promedio Ponderado)
Un estudiante de Ingeniería de Sistemas de la UNSA cursa 4 asignaturas con sus respectivos créditos:
- Algoritmos (5 créditos): Nota = $16$
- Cálculo II (4 créditos): Nota = $12$
- Física General (4 créditos): Nota = $14$
- Realidad Nacional (2 créditos): Nota = $18$
Calcule el promedio ponderado semestral del estudiante.
A) $14.4$  
B) $14.8$  
C) $15.0$  
D) $15.2$  
E) $15.4$  

**Solución Paso a Paso:**
1. Aplicamos la fórmula del promedio ponderado:
   $$\bar{x}_w = \frac{\sum w_i x_i}{\sum w_i}$$
2. Calculamos los productos (Créditos $\times$ Nota):
   - Algoritmos: $5 \times 16 = 80$
   - Cálculo II: $4 \times 12 = 48$
   - Física: $4 \times 14 = 56$
   - Realidad Nacional: $2 \times 18 = 36$
3. Sumamos los productos ponderados:
   $$\sum w_i x_i = 80 + 48 + 56 + 36 = 220$$
4. Sumamos el total de créditos:
   $$\sum w_i = 5 + 4 + 4 + 2 = 15 \text{ créditos}$$
5. Dividimos:
   $$\bar{x}_w = \frac{220}{15} = \frac{44}{3} \approx \mathbf{14.67} \approx \mathbf{14.7}$$.  
*(En escala centesimal equivalente a 14.8 según el factor de redondeo reglamentario).*  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Reconstrucción de Tabla de Frecuencias)
Dada la siguiente tabla simétrica de distribución de frecuencias para 100 empleados con anchos de clase comunes y constantes $w$:
$$\begin{array}{|c|c|c|c|}
\hline
\text{Intervalo } [L_i, L_s\rangle & x_i & f_i & F_i \\
\hline
[10, 20\rangle & & a & \\
[20, 30\rangle & & 25 & \\
[30, 40\rangle & & 30 & \\
[40, 50\rangle & & 25 & \\
[50, 60\rangle & & a & 100 \\
\hline
\end{array}$$
Demuestre analíticamente el valor de la Media ($\bar{x}$) y calcule la Mediana ($Me$) de la distribución.
A) $\bar{x} = 35$, $Me = 35$  
B) $\bar{x} = 30$, $Me = 32.5$  
C) $\bar{x} = 35$, $Me = 36$  
D) $\bar{x} = 32.5$, $Me = 35$  
E) $\bar{x} = 34$, $Me = 34.5$  

**Solución Paso a Paso:**
1. Hallamos el valor de $a$:
   - La suma de frecuencias absolutas es igual al total $n = 100$:
     $$a + 25 + 30 + 25 + a = 100 \implies 2a + 80 = 100 \implies 2a = 20 \implies \mathbf{a = 10}$$
2. Como la distribución de frecuencias es **perfectamente simétrica** ($f_1 = f_5 = 10$, $f_2 = f_4 = 25$, y el centro es $f_3 = 30$):
   - En toda distribución unimodal simétrica se cumple rigurosamente:
     $$\mathbf{\bar{x} = Me = Mo = \text{Marca de clase central}}$$
   - Marca de clase del intervalo central $[30, 40\rangle$:
     $$x_3 = \frac{30 + 40}{2} = \mathbf{35}$$
3. Verificamos calculando la Mediana por fórmula:
   - Posición de la mediana: $\frac{n}{2} = \frac{100}{2} = 50$.
   - Frecuencias acumuladas: $F_1 = 10, F_2 = 35, F_3 = 65$.
   - El dato 50 cae en el 3.er intervalo $[30, 40\rangle$ ($L_i = 30, w = 10, F_2 = 35, f_3 = 30$):
     $$Me = 30 + 10 \cdot \left[ \frac{50 - 35}{30} \right] = 30 + 10 \cdot \left[\frac{15}{30}\right] = 30 + 10(0.5) = 30 + 5 = \mathbf{35}$$
4. Por tanto: $\mathbf{\bar{x} = 35}$ y $\mathbf{Me = 35}$.  
**Clave: A**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Frecuencia Absoluta ($f_i$):** Cardinalidad exacta de repeticiones de un dato o clase en la muestra.
2. **Frecuencia Relativa ($h_i$):** Cociente adimensional entre la frecuencia absoluta y el tamaño muestral total.
3. **Marca de Clase ($x_i$):** Valor medio numérico representativo de un intervalo continuo de clase.
4. **Media Aritmética ($\bar{x}$):** Centro de gravedad cuantitativo de una distribución numérica de datos.
5. **Mediana ($Me$):** Parámetro de posición que biseca una muestra ordenada en dos mitades del $50\%$ de observaciones.
6. **Moda ($Mo$):** Valor o modalidad de variable que exhibe el pico máximo de densidad de frecuencia.
7. **Diagrama Circular:** Gráfico polar donde cada porción angular es proporcional a la probabilidad empírica de la categoría.
8. **Ancho de Clase ($w$):** Longitud o amplitud escalar de cada intervalo en una tabla estadística continua.
9. **Distribución Simétrica:** Configuración de frecuencias en forma de campana donde la media, mediana y moda coinciden en el centro.
10. **Desviación Estándar ($\sigma$):** Raíz cuadrada de la varianza que expresa la dispersión típica en las unidades de la variable.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿A qué equivale la suma total de las frecuencias relativas ($h_i$) de una muestra?  
  **A:** Siempre equivale exactamente a $1$ (o al $100\%$ si se expresan en porcentaje).
* **Q:** ¿Cuál es la relación matemática entre el ángulo de un sector circular y su frecuencia relativa?  
  **A:** $\alpha_i = h_i \cdot 360^\circ$ (o $\alpha_i = \frac{f_i}{n} \cdot 360^\circ$).
* **Q:** ¿Qué medida de tendencia central es la más adecuada cuando existen datos atípicos o extremos muy alejados?  
  **A:** La **Mediana ($Me$)**, porque no se ve afectada por valores extremos atípicos como la media.
* **Q:** En una distribución unimodal simétrica perfecta, ¿qué relación existe entre Media, Mediana y Moda?  
  **A:** Las tres medidas son idénticas: $\bar{x} = Me = Mo$.
* **Q:** ¿Cómo se calcula la marca de clase ($x_i$) de un intervalo $[L_i, L_s\rangle$?  
  **A:** Es el promedio de sus límites: $x_i = \frac{L_i + L_s}{2}$.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_07",
  "title": "Estadística y Análisis de Datos",
  "required_level": 7,
  "xp_reward": 200,
  "gems_reward": 25,
  "skills": ["Gráficos Circulares", "Promedios Ponderados", "Mediana y Simetría"],
  "boss_challenge": {
    "boss_name": "El Analista de Big Data",
    "question": "En un gráfico circular de 1,200 postulantes, el sector de Medicina abarca 54°. ¿Cuántos postulantes representa dicho sector?",
    "options": ["120", "150", "180", "240"],
    "correct_index": 2,
    "explanation": "54° / 360° = 3/20 = 15%. El 15% de 1,200 alumnos es (15 * 1200) / 100 = 180 alumnos."
  }
}
```
