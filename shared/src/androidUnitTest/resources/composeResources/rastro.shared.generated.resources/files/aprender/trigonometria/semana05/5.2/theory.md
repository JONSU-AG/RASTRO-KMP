## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
1. **Suma de Tangente y Cotangente:**
   \tan(x) + \cot(x) = \sec(x) \cdot \csc(x)
   *(Demostración: \frac{\sin x}{\cos x} + \frac{\cos x}{\sin x} = \frac{\sin^2 x + \cos^2 x}{\sin x \cos x} = \frac{1}{\sin x \cos x} = \csc x \sec x).*
2. **Suma de Cuadrados de Secante y Cosecante:**
   \sec^2(x) + \csc^2(x) = \sec^2(x) \cdot \csc^2(x)
3. **Suma de Cuartas Potencias:**
   \sin^4(x) + \cos^4(x) = 1 - 2\sin^2(x)\cos^2(x)
4. **Suma de Sextas Potencias:**
   \sin^6(x) + \cos^6(x) = 1 - 3\sin^2(x)\cos^2(x)
5. **Trinomio Notable de Seno y Coseno al Cuadrado:**
   (1 \pm \sin x \pm \cos x)^2 = 2(1 \pm \sin x)(1 \pm \cos x)
6. **Binomios de Seno y Coseno al Cuadrado:**
   (\sin x \pm \cos x)^2 = 1 \pm 2\sin(x)\cos(x)
7. **Fracciones con Denominador Conjugado:**
   \frac{1}{1 \pm \sin x} = \sec^2(x) \mp \sec(x)\tan(x)
   \frac{1}{1 \pm \cos x} = \csc^2(x) \mp \csc(x)\cot(x)
8. **Identidad de Hermite / Cocientes Especiales:**
   \frac{\sin(x)}{1 \pm \cos(x)} = \frac{1 \mp \cos(x)}{\sin(x)} = \csc(x) \mp \cot(x)
   \frac{\cos(x)}{1 \pm \sin(x)} = \frac{1 \mp \sin(x)}{\cos(x)} = \sec(x) \mp \tan(x)

---

### 3.4. Técnicas Preuniversitarias para Tipos de Problemas

#### 1. Problemas de Simplificación o Demostración:
- **Estrategia Universal:** Cuando no se visualice un camino algebraico obvio, convierte todas las funciones a **senos y cosenos** (\tan \to \frac{\sin}{\cos}, \sec \to \frac{1}{\cos}, etc.).
- **Artificio del Conjugado:** Si aparece en el denominador (1 \pm \sin x) o (1 \pm \cos x), multiplica numerador y denominador por su conjugado para generar \cos^2 x o \sin^2 x en el denominador.

#### 2. Problemas Condicionales:
Si te dan como dato una relación como \sin x + \cos x = n:
- Eleva al cuadrado: (\sin x + \cos x)^2 = n^2 \implies 1 + 2\sin x \cos x = n^2 \implies \sin x \cos x = \frac{n^2 - 1}{2}.
- A partir de este producto, puedes calcular cualquier potencia (\sin^4 x + \cos^4 x, \tan x + \cot x, etc.).

#### 3. Eliminación de la Variable Angular (\theta):
El objetivo es encontrar una relación matemática entre las constantes y parámetros que sea totalmente independiente de \theta.
- Despeja las funciones trigonométricas directas (\sin\theta, \cos\theta o \tan\theta, \sec\theta).
- Aplica una identidad pitagórica (\sin^2\theta + \cos^2\theta = 1 o \sec^2\theta - \tan^2\theta = 1) para hacer desaparecer la variable angular.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Suma Cuadrática Sec/Csc**| \sec^2(x) + \csc^2(x) = \sec^2(x)\csc^2(x) | Convierte suma en producto |
| **Cuartas Potencias** | \sin^4(x) + \cos^4(x) = 1 - 2\sin^2(x)\cos^2(x) | Problemas condicionales |
| **Sextas Potencias** | \sin^6(x) + \cos^6(x) = 1 - 3\sin^2(x)\cos^2(x) | Problemas condicionales |
| **Binomio al Cuadrado** | (\sin x \pm \cos x)^2 = 1 \pm 2\sin(x)\cos(x) | Cálculo de productos |
| **Propiedad Inversa Sec**| \sec(x) + \tan(x) = p \iff \sec(x) - \tan(x) = \dfrac{1}{p}| Sistemas de ecuaciones |
| **Propiedad Inversa Csc**| \csc(x) + \cot(x) = q \iff \csc(x) - \cot(x) = \dfrac{1}{q}| Sistemas de ecuaciones |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Asignación de Valores Angulares Notables (Tabulación Rápida)
En preguntas de opción múltiple donde se pida simplificar una expresión E que es independiente del ángulo:
- Asigna un ángulo notable conveniente donde ninguna función se indetermine (generalmente x = 45^\circ, ya que \sin 45^\circ = \cos 45^\circ = \frac{\sqrt{2}}{2} y \tan 45^\circ = \cot 45^\circ = 1).
- Evalúa el valor numérico de la expresión con x = 45^\circ.
- Compara con las opciones numéricas. ¡El 80% de los problemas de simplificación se resuelven en 30 segundos sin manipular álgebra!
- *Precaución:* No uses x = 0^\circ o x = 90^\circ si la expresión contiene tangentes, cotangentes, secantes o cosecantes en denominadores.

### Hack 2: El Artificio del Cuadrado en la Suma de Seno y Coseno
Siempre que veas la suma o resta \sin x \pm \cos x:
- Ponle una letra auxiliar: S = \sin x + \cos x.
- Al elevar al cuadrado: S^2 = 1 + 2\sin x \cos x.
- El término 2\sin x \cos x es exactamente igual a S^2 - 1.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Suma que se Vuelve Producto: "TAN-COT = SEC-CSC"
- "La **TAN**queta y el **COT**xe se multiplican en **SEC**undaria con **CSC**":
  \tan(x) + \cot(x) = \sec(x) \cdot \csc(x)
  ¡Una suma de dos términos se convierte milagrosamente en un solo producto de factores!

### 2. Mnemotecnia de las Potencias Pares: "EL COEFICIENTE ES LA MITAD MENOS UNO"
- En \sin^{\mathbf{4}} x + \cos^{\mathbf{4}} x \implies 1 - \mathbf{2}\sin^2 x \cos^2 x (el 2 es \frac{4}{2}).
- En \sin^{\mathbf{6}} x + \cos^{\mathbf{6}} x \implies 1 - \mathbf{3}\sin^2 x \cos^2 x (el 3 es \frac{6}{2}).
- ¡Nunca dudarás entre si el coeficiente que resta es 2 o es 3!

### 3. Mnemotecnia de los Pares Conjugados: "SI UNO SUBE, EL OTRO INVIERTE"
- Si \sec x + \tan x = 5 \implies \sec x - \tan x = \frac{1}{5} = 0.2.
- Si sumas ambas ecuaciones: 2\sec x = 5.2 \implies \sec x = 2.6. ¡Hallas cualquier razón en 10 segundos!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo en las Diferencias Pitagóricas**
> - \sec^2(x) - \tan^2(x) = 1 (La secante va primero).
> - Si el examen pone \tan^2(x) - \sec^2(x), el resultado es **-1**.
> - Análogamente: \cot^2(x) - \csc^2(x) = -1. ¡Cuidado con el orden de sustracción!

> [!CAUTION]
> **Trampa 2: La Raíz Cuadrada de un Cuadrado Perfecto**
> \sqrt{\sin^2(x)} = |\sin(x)|, \quad \sqrt{(\sin x - \cos x)^2} = |\sin x - \cos x|
> No elimines la raíz y el cuadrado directamente sin verificar el signo en el cuadrante indicado. Si \cos x > \sin x, |\sin x - \cos x| = \cos x - \sin x.

> [!WARNING]
> **Trampa 3: Cancelación Indebida de Denominadores**
> En ecuaciones condicionales, nunca simplifiques un factor \sin x o \cos x dividiendo a ambos miembros sin antes asegurar que no sea una solución cero (x = 0 o x = \pi), pues eliminarías soluciones legítimas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Compresión de Audio y Transformada Rápida de Fourier (FFT):** Los algoritmos de codificación MP3 y streaming de audio colapsan superposiciones de ondas armónicas utilizando identidades de productos y sumas para reducir la tasa de bits sin degradar la fidelidad acústica.
2. **Gráficos por Computadora y Motores de Videojuegos:** La simplificación de identidades trigonométricas en shaders de tarjetas gráficas (GPU) ahorra millones de ciclos de coma flotante por fotograma al calcular la iluminación especular y reflexiones en tiempo real.
3. **Ingeniería Eléctrica y Factor de Potencia:** En circuitos de corriente alterna, la relación entre potencia activa (P = VI\cos\phi), reactiva (Q = VI\sin\phi) y aparente (S = VI) verifica la relación pitagórica S^2 = P^2 + Q^2.

---
