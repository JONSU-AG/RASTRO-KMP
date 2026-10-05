## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
