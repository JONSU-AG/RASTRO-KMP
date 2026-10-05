## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### 1. Función Inyectiva (Univalente o "Uno a Uno")
Una función es inyectiva si a elementos distintos del dominio les corresponden imágenes distintas:
f(x_1) = f(x_2) \implies x_1 = x_2 \quad (\forall x_1, x_2 \in \text{Dom}(f))
- **Criterio de la Recta Horizontal:** Toda recta horizontal y = k debe cortar a la gráfica de la función en **a lo más un punto**.
- Toda función estrictamente creciente o estrictamente decreciente es **inyectiva**.

#### 2. Función Sobreyectiva (Suryectiva o Epiyectiva)
Una función f: A \to B es sobreyectiva si todo elemento del conjunto de llegada B (codominio) es imagen de al menos un elemento del dominio:
\text{Ran}(f) = B

#### 3. Función Biyectiva
Una función es **biyectiva** si y solo si es **inyectiva y sobreyectiva simultáneamente**.
- Solo las funciones biyectivas admiten **función inversa**.

---

### 3.5. Álgebra y Composición de Funciones

#### Operaciones con Funciones:
Sean f y g dos funciones reales:
- **Dominio Común:** \text{Dom}(f \pm g) = \text{Dom}(f \cdot g) = \text{Dom}(f) \cap \text{Dom}(g).
- **Cociente:** \text{Dom}\left(\frac{f}{g}\right) = [\text{Dom}(f) \cap \text{Dom}(g)] \setminus \{x \mid g(x) = 0\}.

#### Composición de Funciones ((f \circ g)):
Se define la función compuesta como:
(f \circ g)(x) = f(g(x))
- **Dominio Formal de la Composición:**
  \text{Dom}(f \circ g) = \{x \in \mathbb{R} \mid x \in \text{Dom}(g) \quad \land \quad g(x) \in \text{Dom}(f)\}
- **Propiedad Fundamental:** La composición **NO es conmutativa**:
  f \circ g \not\equiv g \circ f \quad (\text{en el caso general})

---

### 3.6. Función Inversa (f^{-1} o f^*)
Sea f: A \to B una función **biyectiva**. La función inversa f^{-1}: B \to A es aquella que invierte la correspondencia:
y = f(x) \iff x = f^{-1}(y)

#### Propiedades Cardinales:
1. \text{Dom}(f^{-1}) = \text{Ran}(f)
2. \text{Ran}(f^{-1}) = \text{Dom}(f)
3. (f \circ f^{-1})(y) = y \quad \land \quad (f^{-1} \circ f)(x) = x
4. **Simetría Espejo:** La gráfica de f^{-1} es el reflejo simétrico de la gráfica de f respecto a la recta identidad:
   y = x

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Sobreyectividad** | \text{Ran}(f) = \text{Codominio} | Todo el conjunto de llegada cubierto |
| **Biyectividad** | Inyectiva \land Sobreyectiva | Condición para que exista inversa |
| **Dominio Composición** | \text{Dom}(f \circ g) = \{x \in \text{Dom}(g) \mid g(x) \in \text{Dom}(f)\} | Intersección restringida |
| **Función Inversa** | f(f^{-1}(x)) = x | Simétrica respecto a y = x |
| **Dominio e Inversa** | \text{Dom}(f^{-1}) = \text{Ran}(f) \quad \land \quad \text{Ran}(f^{-1}) = \text{Dom}(f) | Cruce de dominios y rangos |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Rango Instantáneo en Funciones Homográficas
Dada una función racional lineal (homográfica):
f(x) = \frac{ax + b}{cx + d}, \quad \text{con } c \neq 0
**¡No despejes x en función de y para analizar el denominador!**
**Hack:**
- Dominio: \text{Dom}(f) = \mathbb{R} \setminus \left\{-\frac{d}{c}\right\} (Asíntota vertical).
- Rango: \text{Ran}(f) = \mathbb{R} \setminus \left\{\frac{a}{c}\right\} (Cociente de coeficientes principales: Asíntota horizontal).
*Ejemplo:* Para f(x) = \frac{4x - 7}{2x + 6} \implies \text{Ran}(f) = \mathbb{R} \setminus \{4/2\} = \mathbb{R} \setminus \{2\}. ¡En 3 segundos!

### Artificio 2: Inversa Rápida de la Función Homográfica
Para f(x) = \frac{ax + b}{cx + d}:
**Hack:** Intercambia las posiciones de a y d cambiándoles de signo a ambos simultáneamente:
f^{-1}(x) = \frac{-dx + b}{cx - a}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Las Dos Rectas Inquisidoras: "Vertical para Función, Horizontal para Inyectiva"
- **Recta VERTICAL (\mathbf{V}):** ¿Es función o no? \to Si corta dos veces, ¡NO es función!
- **Recta HORIZONTAL (\mathbf{H}):** ¿Tiene inversa o no? \to Si corta dos veces, ¡NO es inyectiva, NO tiene inversa!

### 2. Regla para Inversa: "Despeja x, Bautiza con y"
Para hallar la regla de correspondencia de f^{-1}(x):
1. Escribe y = f(x).
2. Despeja algebraicamente la variable x en términos de y.
3. Intercambia las letras: donde dice x pon f^{-1}(x), y donde dice y pon x.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Dominio de la Composición**
> Si f(x) = x^2 y g(x) = \sqrt{x - 3}.
> Al hacer (f \circ g)(x) = (\sqrt{x - 3})^2 = x - 3.
> Muchos postulantes dicen: *"Como es una recta x - 3, su dominio son todos los reales \mathbb{R}"*. **¡CERO ABSOLUTO!**
> La regla exige que x \in \text{Dom}(g) \implies x \geq 3.
> El dominio real es \text{Dom}(f \circ g) = [3, \ +\infty\rangle.

> [!CAUTION]
> **Trampa 2: La Parábola Completa NO Tiene Inversa**
> Si te dan f(x) = x^2 - 4x + 7 en todo \mathbb{R}, no tiene función inversa porque es una parábola simétrica (la recta horizontal la corta en dos puntos).
> Para que tenga inversa, su dominio debe estar restringido a una de sus dos ramas: x \geq 2 o x \leq 2.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Calibración de Sensores Sísmicos en el Instituto Geofísico de la UNSA
En el monitoreo sismológico de la falla geológica de Tamburco y el volcán Sabancaya, los transductores piezoeléctricos transforman la aceleración del terreno a(t) en una señal de microvoltaje V = f(a). Para reconstruir con exactitud absoluta el desplazamiento real del sismo a partir de la señal eléctrica registrada en el sismograma digital, la función de transducción f debe ser estrictamente **biyectiva**. La aplicación de la función inversa a = f^{-1}(V) permite a los geofísicos arequipeños emitir alertas de tsunami o colapso estructural sin distorsiones matemáticas en tiempo real.

---
