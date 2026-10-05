## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3. Funciones Especiales con Discontinuidades o Esquinas

#### 1. Función Valor Absoluto:
f(x) = |x| = \begin{cases} x, & \text{si } x \geq 0 \\ -x, & \text{si } x < 0 \end{cases}
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = [0, \ +\infty\rangle
- Su gráfica es una "V" con vértice en el origen (0, 0).
- Forma trasladada: f(x) = a|x - h| + k, con vértice en V(h, k).

#### 2. Función Raíz Cuadrada:
f(x) = \sqrt{x}
- \text{Dom}(f) = [0, \ +\infty\rangle, \quad \text{Ran}(f) = [0, \ +\infty\rangle
- Gráfica: semiparábola horizontal que parte desde el origen (0, 0).

#### 3. Función Inverso Proporcional:
f(x) = \frac{1}{x}
- \text{Dom}(f) = \mathbb{R} \setminus \{0\}, \quad \text{Ran}(f) = \mathbb{R} \setminus \{0\}
- Gráfica: hipérbola equilátera con asíntota vertical en x = 0 y horizontal en y = 0.

#### 4. Función Signo (\text{sgn}(x)):
\text{sgn}(x) = \begin{cases} 1, & \text{si } x > 0 \\ 0, & \text{si } x = 0 \\ -1, & \text{si } x < 0 \end{cases}
- \text{Dom}(\text{sgn}) = \mathbb{R}, \quad \text{Ran}(\text{sgn}) = \{-1, 0, 1\}.

#### 5. Función Máximo Entero (\llbracket x \rrbracket o \lfloor x \rfloor):
Asigna a cada número real el mayor entero menor o igual que él:
\llbracket x \rrbracket = k \iff k \leq x < k + 1, \quad k \in \mathbb{Z}
- \text{Dom}(f) = \mathbb{R}, \quad \text{Ran}(f) = \mathbb{Z}
- Gráfica: función escalonada con escalones semiabiertos [k, k+1\rangle de longitud 1.
- *Propiedad de traslación entera:* \llbracket x + m \rrbracket = \llbracket x \rrbracket + m \iff m \in \mathbb{Z}.

---

### 3.4. Álgebra de Transformaciones Geométricas de Gráficas

Sea y = f(x) una gráfica conocida en el plano cartesiano y c > 0:

| Transformación | Ecuación | Efecto Geométrico en el Plano |
| :--- | :--- | :--- |
| **Desplazamiento Vertical** | y = f(x) + c | Se desplaza c unidades hacia **arriba**. |
| **Desplazamiento Vertical** | y = f(x) - c | Se desplaza c unidades hacia **abajo**. |
| **Desplazamiento Horizontal** | y = f(x - c) | Se desplaza c unidades hacia la **derecha** (X). |
| **Desplazamiento Horizontal** | y = f(x + c) | Se desplaza c unidades hacia la **izquierda** (X). |
| **Reflexión sobre el eje X** | y = -f(x) | Voltea la gráfica de arriba a abajo (espejo horizontal). |
| **Reflexión sobre el eje Y** | y = f(-x) | Voltea la gráfica de izquierda a derecha (espejo vertical). |
| **Valor Absoluto Global** | y = |f(x)| | Toda la porción que está debajo del eje X se refleja hacia arriba. |
| **Valor Absoluto Local** | y = f(|x|) | Se borra la parte izquierda (x < 0) y se refleja la derecha como espejo simétrico par. |

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Máximo Entero** | \llbracket x \rrbracket = k \iff k \leq x < k + 1 | k \in \mathbb{Z}, \ \text{Ran} = \mathbb{Z} |
| **Propiedad Entera** | \llbracket x + n \rrbracket = \llbracket x \rrbracket + n | n \in \mathbb{Z} |
| **Valor Absoluto Vértice** | f(x) = a\|x - h\| + k | Vértice en (h, k) |
| **Traslación Rígida** | g(x) = f(x - h) + k | Centro trasladado a (h, k) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Optimización Cuadrática Instantánea sin Derivadas
Si te dan un problema DECO de ganancias: G(x) = -2x^2 + 80x - 300:
**¡No derives ni completes cuadrados con tres líneas de fracciones!**
**Hack:** El óptimo ocurre exactamente en el punto medio del vértice:
x_{\text{óptimo}} = -\frac{b}{2a} = -\frac{80}{2(-2)} = \frac{80}{4} = 20
La ganancia máxima es simplemente evaluar en 20:
G(20) = -2(20)^2 + 80(20) - 300 = -800 + 1600 - 300 = 500 \text{ soles}
¡Resuelto en 10 segundos!

### Artificio 2: Graficación Rápida de Módulo Global y = |f(x)|
Cuando tengas que graficar y = |x^2 - 4|:
1. Grafica la parábola normal y = x^2 - 4 (vértice en (0, -4), pasa por -2 y 2).
2. Todo lo que está por debajo del eje X (el arco entre -2 y 2 con vértice en -4) **lo volteas como un espejo hacia arriba**: el vértice salta a (0, +4).
3. La forma final es una "W" apoyada sobre el eje X.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Signo del Desplazamiento Horizontal: "Al revés del mundo"
- En f(x \mathbf{-} 3), el postulante cree que se va a la izquierda por el menos.
> **"Lo que está DENTRO del paréntesis va AL REVÉS: si dice MENOS, camina a la DERECHA (+); si dice MÁS, camina a la IZQUIERDA (-)."**
- En cambio, lo que está FUERA (f(x) \pm k) va directo al grano: si suma sube, si resta baja.

### 2. Concavidad de la Parábola: "La Sonrisa Cuadrática"
- Si a > 0 (positivo, alegre) \implies Parábola sonriente (\bigcup, abre arriba \to tiene un fondo/mínimo).
- Si a < 0 (negativo, triste) \implies Parábola fruncida (\bigcap, abre abajo \to tiene una cima/máximo).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Máximo Entero de Números Negativos**
> ¿Cuánto vale \llbracket -3.2 \rrbracket?
> El estudiante novato responde -3. **¡ERROR GARRAFAL!**
> Recuerda la definición: es el entero **MENOR O IGUAL**. En la recta numérica, a la izquierda de -3.2 está -4:
> \llbracket -3.2 \rrbracket = -4
> ¡Solo para números positivos se trunca la parte decimal!

> [!CAUTION]
> **Trampa 2: La Raíz Cuadrada NO Produce Gráfica Arriba y Abajo**
> Si te piden graficar y = \sqrt{x}, muchos dibujan la parábola horizontal completa (con rama superior e inferior).
> **Eso viola el principio de función:** una recta vertical la cortaría dos veces. El radical con signo positivo implícito \sqrt{x} solo abarca la rama **superior no negativa** (y \geq 0).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Optimización del Rendimiento Fotovoltaico en las Plantas Solares de La Joya
En los parques solares fotovoltaicos del desierto de La Joya (Arequipa), la potencia eléctrica neta suministrada a la red P(\theta) varía en función del ángulo cenital de incidencia solar \theta según una función cuadrática de pérdidas térmicas:
P(\theta) = -1.5\theta^2 + 180\theta - 2400 \quad (\text{en kilowatts})
La determinación analítica del vértice de la parábola mediante h = -b/(2a) permite a los controladores electrónicos de los seguidores solares orientar los paneles con precisión de fracciones de grado a la hora del cénit solar para alcanzar la máxima transferencia de potencia sin sobrecalentar los inversores trifásicos.

---
