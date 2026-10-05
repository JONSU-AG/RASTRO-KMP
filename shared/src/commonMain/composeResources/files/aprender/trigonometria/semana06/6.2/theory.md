## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### Triángulo Rectángulo del Ángulo Doble (en función de \tan x):
Cateto opuesto = 2\tan x, cateto adyacente = 1 - \tan^2 x, hipotenusa = 1 + \tan^2 x:
\sin(2x) = \frac{2\tan(x)}{1 + \tan^2(x)}, \quad \cos(2x) = \frac{1 - \tan^2(x)}{1 + \tan^2(x)}

#### Identidades Auxiliares del Ángulo Doble:
\cot(x) + \tan(x) = 2\csc(2x)
\cot(x) - \tan(x) = 2\cot(2x)
\sec(2x) + 1 = \frac{\tan(2x)}{\tan(x)}

---

### 3.3. Razones Trigonométricas del Ángulo Mitad (\frac{x}{2})

Despejando de las fórmulas de degradación:
1. **Seno del Ángulo Mitad:**
   \sin\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 - \cos(x)}{2}}
2. **Coseno del Ángulo Mitad:**
   \cos\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 + \cos(x)}{2}}
3. **Tangente del Ángulo Mitad:**
   \tan\left(\frac{x}{2}\right) = \pm \sqrt{\frac{1 - \cos(x)}{1 + \cos(x)}}

*Regla del Signo (\pm):* El signo (+) o (-) depende **exclusivamente del cuadrante en el que se ubique el ángulo mitad \frac{x}{2}** y de la razón trigonométrica evaluada.

#### Formas Racionales Libres de Radicales (Las Fórmulas Doradas):
\tan\left(\frac{x}{2}\right) = \csc(x) - \cot(x) = \frac{\sin(x)}{1 + \cos(x)} = \frac{1 - \cos(x)}{\sin(x)}
\cot\left(\frac{x}{2}\right) = \csc(x) + \cot(x) = \frac{\sin(x)}{1 - \cos(x)} = \frac{1 + \cos(x)}{\sin(x)}

---

### 3.4. Razones Trigonométricas del Ángulo Triple (3x)

1. **Seno del Ángulo Triple:**
   \sin(3x) = 3\sin(x) - 4\sin^3(x) = \sin(x)(2\cos 2x + 1)
2. **Coseno del Ángulo Triple:**
   \cos(3x) = 4\cos^3(x) - 3\cos(x) = \cos(x)(2\cos 2x - 1)
3. **Tangente del Ángulo Triple:**
   \tan(3x) = \frac{3\tan(x) - \tan^3(x)}{1 - 3\tan^2(x)} = \tan(x)\left(\frac{2\cos 2x - 1}{2\cos 2x + 1}\right)

#### Degradación Cúbica:
4\sin^3(x) = 3\sin(x) - \sin(3x)
4\cos^3(x) = 3\cos(x) + \cos(3x)

#### Productos Notables de Ángulo Triple (Identidades de Morrie / Euler):
\sin(x) \cdot \sin(60^\circ - x) \cdot \sin(60^\circ + x) = \frac{1}{4}\sin(3x)
\cos(x) \cdot \cos(60^\circ - x) \cdot \cos(60^\circ + x) = \frac{1}{4}\cos(3x)
\tan(x) \cdot \tan(60^\circ - x) \cdot \tan(60^\circ + x) = \tan(3x)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Auxiliar Csc Doble** | \cot(x) + \tan(x) = 2\csc(2x) | Suma a cosecante |
| **Auxiliar Cot Doble** | \cot(x) - \tan(x) = 2\cot(2x) | Resta a cotangente |
| **Tangente del Mitad** | \tan\left(\dfrac{x}{2}\right) = \csc(x) - \cot(x) | Sin radical |
| **Cotangente del Mitad**| \cot\left(\dfrac{x}{2}\right) = \csc(x) + \cot(x) | Sin radical |
| **Seno del Triple** | \sin(3x) = 3\sin(x) - 4\sin^3(x) | "Tres sen menos cuatro sen cubo" |
| **Coseno del Triple** | \cos(3x) = 4\cos^3(x) - 3\cos(x) | "Cuatro cos cubo menos tres cos" |
| **Producto 60^\circ \pm x** | \tan(x)\tan(60^\circ - x)\tan(60^\circ + x) = \tan(3x) | Identidad de triplicación |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Expresión A\sin(x) + B\cos(x) (Método del Ángulo Auxiliar)
Cualquier combinación lineal de seno y coseno con el mismo argumento se colapsa en una sola función senoidal:
A\sin(x) + B\cos(x) = \sqrt{A^2 + B^2} \cdot \sin(x + \phi)
Donde \tan(\phi) = \frac{B}{A}.
- **Valores Extremos Instantáneos:**
  - Valor Máximo: +\sqrt{A^2 + B^2}
  - Valor Mínimo: -\sqrt{A^2 + B^2}
  - Ejemplo: El máximo de 3\sin(x) + 4\cos(x) es \sqrt{3^2 + 4^2} = 5. ¡Sale en 1 segundo sin derivar!

### Hack 2: Descomposición de 75^\circ y 15^\circ
- 75^\circ = 45^\circ + 30^\circ \implies \sin(75^\circ) = \frac{\sqrt{6} + \sqrt{2}}{4}, \quad \cos(75^\circ) = \frac{\sqrt{6} - \sqrt{2}}{4}.
- 15^\circ = 45^\circ - 30^\circ \implies \sin(15^\circ) = \frac{\sqrt{6} - \sqrt{2}}{4}, \quad \cos(15^\circ) = \frac{\sqrt{6} + \sqrt{2}}{4}.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Seno y Coseno Compuesto: "SEN-COS-COS-SEN y COS-COS-SEN-SEN"
- **Seno es amable:** Comparte con el coseno y mantiene el signo:
  \sin(A + B) = \textbf{sen } A \textbf{ cos } B + \textbf{cos } A \textbf{ sen } B
- **Coseno es egoísta:** Se junta consigo mismo y te cambia el signo:
  \cos(A + B) = \textbf{cos } A \textbf{ cos } B - \textbf{sen } A \textbf{ sen } B

### 2. Mnemotecnia del Ángulo Triple: "34 Y 43"
- **Seno de 3x:** El número es **34** (3 seno menos 4 seno cubo):
  \sin(3x) = \mathbf{3}\sin x - \mathbf{4}\sin^3 x
- **Coseno de 3x:** El número es **43** (4 coseno cubo menos 3 coseno):
  \cos(3x) = \mathbf{4}\cos^3 x - \mathbf{3}\cos x

### 3. Mnemotecnia de la Degradación: "MENOS ES SENO, MÁS ES COSENO"
- 1 \mathbf{-} \cos(2x) = 2\mathbf{\sin}^2(x) (El signo menos genera seno).
- 1 \mathbf{+} \cos(2x) = 2\mathbf{\cos}^2(x) (El signo más genera coseno).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo del Coseno de la Suma**
> Recordar siempre:
> \cos(x + y) = \cos(x)\cos(y) \mathbf{-} \sin(x)\sin(y)
> Poner un signo + en \cos(x+y) es el error más recurrente de los postulantes bajo estrés de tiempo.

> [!CAUTION]
> **Trampa 2: La Elección del Signo en el Ángulo Mitad**
> En \sin\left(\frac{x}{2}\right) = \pm\sqrt{\frac{1-\cos x}{2}}, el signo **NO depende del cuadrante de x**, sino del cuadrante donde cae \frac{x}{2}.
> Si x \in \text{III C} (180^\circ < x < 270^\circ), entonces 90^\circ < \frac{x}{2} < 135^\circ (\text{II C}).
> En el II C, el seno es POSITIVO (+), pero el coseno es NEGATIVO (-).

> [!WARNING]
> **Trampa 3: Confundir \sin(2x) con 2\sin(x)**
> La función trigonométrica no es distributiva con respecto a los escalares:
> \sin(2x) \ne 2\sin(x) \quad \text{y} \quad \cos(2x) \ne 2\cos(x)
> \sin(2x) es 2\sin(x)\cos(x).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Telecomunicaciones y Modulación de Señales (AM / FM):** La modulación de amplitud mezcla la portadora de alta frecuencia \cos(\omega_c t) con la señal de audio \cos(\omega_m t). Por identidades de productos y compuestos, genera las bandas laterales: \frac{1}{2}[\cos(\omega_c + \omega_m)t + \cos(\omega_c - \omega_m)t].
2. **Generación Eléctrica Trifásica:** Tres bobinados desfasados 120^\circ generan voltajes V_A = V\sin(\omega t), V_B = V\sin(\omega t - 120^\circ) y V_C = V\sin(\omega t + 120^\circ). La suma instantánea de las tres fases es exactamente cero gracias a las identidades condicionales compuestas.
3. **Mecánica Cuántica y Óptica Ondulatoria:** La interferencia de dos rayos de luz con desfase \delta sigue la intensidad I = 4I_0 \cos^2(\frac{\delta}{2}), expresión directa del ángulo mitad.

---

## Transformaciones de suma y diferencia a producto

Las identidades permiten cambiar la forma de una expresión sin cambiar su valor. Son útiles para factorizar sumas trigonométricas:

- sin A + sin B = 2 sin((A + B)/2) cos((A − B)/2).
- sin A − sin B = 2 cos((A + B)/2) sin((A − B)/2).
- cos A + cos B = 2 cos((A + B)/2) cos((A − B)/2).
- cos A − cos B = −2 sin((A + B)/2) sin((A − B)/2).

Por ejemplo, sin 3x + sin x = 2 sin 2x cos x. Si el objetivo es resolver una ecuación igualada a cero, el producto revela alternativas para sus factores. Antes de dividir por sin x o cos x, comprueba si pueden valer cero: dividir sin esa revisión elimina soluciones válidas.
