## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   Giran solidariamente, por lo que dan el **mismo número de vueltas**:
   V_A = V_B

---

### 3.5 Reparto Proporcional
Consiste en descomponer una cantidad total C en partes c_1, c_2, \dots, c_n proporcionales a ciertos números índices dados i_1, i_2, \dots, i_n.

1. **Reparto Simple Directo:**
   \frac{c_1}{i_1} = \frac{c_2}{i_2} = \dots = \frac{c_n}{i_n} = \frac{\sum c_k}{\sum i_k} = \frac{C}{i_1 + i_2 + \dots + i_n} = k
   c_j = k \cdot i_j
2. **Reparto Simple Inverso:**
   Repartir C en partes IP a i_1, i_2, \dots, i_n equivale exactamente a repartir C en partes **DP a sus inversas**:
   \text{Partes DP a: } \frac{1}{i_1}, \frac{1}{i_2}, \dots, \frac{1}{i_n}
   *Artificio:* Se multiplican todas las fracciones por el \text{MCM}(i_1, \dots, i_n) para trabajar con enteros mínimos.
3. **Reparto Compuesto:**
   Repartir una cantidad DP a varios grupos de índices simultáneamente equivale a repartir DP al **producto de dichos índices**:
   \text{Índice resultante } I_j = i_{1j} \cdot i_{2j} \dots i_{mj}

---

### 3.6 Regla de Compañía
Es una aplicación directa del reparto proporcional compuesto al ámbito comercial y financiero. En una sociedad mercantil:
* La ganancia o pérdida (G) es **DP al capital aportado** (C).
* La ganancia o pérdida (G) es **DP al tiempo de permanencia** (t).
\frac{\text{Ganancia}}{\text{Capital} \cdot \text{Tiempo}} = \text{constante} \implies \frac{G_1}{C_1 \cdot t_1} = \frac{G_2}{C_2 \cdot t_2} = \dots = \frac{G_n}{C_n \cdot t_n} = \frac{\sum G_i}{\sum (C_i \cdot t_i)}

---

### 3.7 Regla de Tres Compuesta: El Método Estructural Causa-Circunstancia-Efecto
Toda situación problemática de rendimiento laboral en obras se organiza en tres bloques:
1. **Causa:** Quienes realizan la acción (obreros, máquinas, animales) y sus condiciones inherentes (rendimiento, eficiencia, habilidad).
2. **Circunstancia:** El tiempo y condiciones del trabajo (días, horas por día, raciones).
3. **Efecto:** El resultado de la acción (obra realizada, volumen, metros lineales, zanjas, dificultad del terreno).

#### Ley Universal de Correspondencia:
\frac{(\text{Causa}) \cdot (\text{Circunstancia})}{\text{Efecto}} = \text{constante}
\frac{(\text{Obreros} \cdot \text{Eficiencia}) \cdot (\text{Días} \cdot \text{Horas/Día})}{(\text{Obra} \cdot \text{Dificultad})} = \text{constante}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Engranajes Unidos** | D_A \cdot V_A = D_B \cdot V_B |
| **Engranajes en Mismo Eje** | V_A = V_B |
| **Reparto Simple Directo** | c_j = C \cdot \frac{i_j}{\sum_{k=1}^n i_k} |
| **Regla de Compañía** | \frac{G_1}{C_1 t_1} = \frac{G_2}{C_2 t_2} = \dots = \frac{G_{\text{total}}}{\sum C_i t_i} |
| **Ecuación Maestra de Obra** | \frac{\text{Obreros} \cdot \text{Rendimiento} \cdot \text{Días} \cdot \text{Horas/Día}}{\text{Longitud} \cdot \text{Ancho} \cdot \text{Profundidad} \cdot \text{Dificultad}} = \text{constante} |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Lectura de Gráficas Mixtas (Recta + Hipérbola)
En exámenes de la UNSA suele aparecer un gráfico donde un tramo es recta (DP) y otro tramo es hipérbola (IP):
* **Identifica el Punto de Empalme:** El punto (x_0, y_0) donde ambas curvas se tocan pertenece a ambas ecuaciones.
* **Para el tramo recto (de 0 a x_0):** Aplica \frac{y_1}{x_1} = \frac{y_0}{x_0}.
* **Para el tramo hiperbólico (de x_0 en adelante):** Aplica x_0 \cdot y_0 = x_2 \cdot y_2.
* ¡Nunca mezcles las ecuaciones fuera de sus dominios respectivos!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Esquema Universal: "Quién - Cuándo - Qué"
* **Quién (Causa):** Obreros \times Rendimiento \times Fuerza.
* **Cuándo (Circunstancia):** Días \times Horas/día.
* **Qué (Efecto - ¡Abajo en el denominador!):** Obra \times Dificultad.
* **Mnemotecnia:** *"Todo va arriba multiplicándose, salvo lo que se construye y su dificultad, que van abajo sosteniendo el peso de la obra"*.

### 2. Conversión de IP a DP: "Invertir y Homogeneizar con MCM"
* Para repartir IP a 4, 6 y 8:
  - Inviertes: \frac{1}{4}, \frac{1}{6}, \frac{1}{8}.
  - Multiplicas por el \text{MCM}(4, 6, 8) = 24:
    \frac{24}{4} = 6, \quad \frac{24}{6} = 4, \quad \frac{24}{8} = 3
  - ¡Repartes DP directamente a 6k, 4k y 3k!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!CAUTION]
> ### Trampa 1: El Volumen de la Obra frente a Dimensiones Lineales
> Si un grupo de obreros cava un pozo cilíndrico de radio r y profundidad h, la obra no es r \cdot h, sino su **volumen**:
> \text{Obra} = \pi r^2 h
> Si en el segundo caso el radio se duplica, el volumen se cuadruplica (2^2 = 4). Olvidar elevar al cuadrado las dimensiones transversales es el error clásico en preguntas de admisión.

> [!WARNING]
> ### Trampa 2: Retiro o Ingreso de Socios en la Regla de Compañía
> Si un socio aporta capital durante 4 meses, luego retira la mitad y continúa 6 meses más:
> **NO** promedies los tiempos. Debes desglosar el aporte en dos fases equivalentes:
> \text{Aporte total equivalente} = C \times 4 + \left(\frac{C}{2}\right) \times 6 = 4C + 3C = 7C
> Trátalo como si hubiese aportado un capital único durante el periodo consolidado.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Canon Minero y Regalías en Gobiernos Locales
El Ministerio de Economía y Finanzas (MEF) del Perú distribuye el canon minero generado en Arequipa entre las provincias y distritos mediante un modelo de **reparto proporcional compuesto**:
\text{Fondos Asignados} \text{ DP a: } (\text{Población Vulnerable}) \times (\text{Índice de Necesidades Básicas Insatisfechas})
\text{Fondos Asignados} \text{ IP a: } (\text{Ingreso Per Cápita Municipal})
Este modelo garantiza equidad distributiva mediante la fórmula canónica de magnitudes compuestas.

---
