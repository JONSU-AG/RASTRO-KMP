## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.4. Ley de Tangentes (Teorema de Neper)
En todo triángulo, la diferencia de dos lados es a su suma como la tangente de la semidiferencia de sus ángulos opuestos es a la tangente de la semisuma de dichos ángulos:
\frac{a - b}{a + b} = \frac{\tan\left(\frac{A - B}{2}\right)}{\tan\left(\frac{A + B}{2}\right)}
\frac{b - c}{b + c} = \frac{\tan\left(\frac{B - C}{2}\right)}{\tan\left(\frac{B + C}{2}\right)}
\frac{a - c}{a + c} = \frac{\tan\left(\frac{A - C}{2}\right)}{\tan\left(\frac{A + C}{2}\right)}

*Artificio Útil:* Dado que \frac{A + B}{2} = 90^\circ - \frac{C}{2}, el denominador se convierte en:
\tan\left(\frac{A + B}{2}\right) = \cot\left(\frac{C}{2}\right)

---

### 3.5. Ley de Proyecciones
En todo triángulo, cualquier lado es numéricamente igual a la suma de las proyecciones ortogonales de los otros dos lados sobre él:
a = b\cos(C) + c\cos(B)
b = a\cos(C) + c\cos(A)
c = a\cos(B) + b\cos(A)

---

### 3.6. Fórmulas de Briggs (Razones del Ángulo Mitad)
Permiten calcular el seno, coseno y tangente de la mitad de los ángulos interiores a partir del semiperímetro p = \frac{a+b+c}{2}:
1. **Seno del Ángulo Mitad:**
   \sin\left(\frac{A}{2}\right) = \sqrt{\frac{(p - b)(p - c)}{bc}}
2. **Coseno del Ángulo Mitad:**
   \cos\left(\frac{A}{2}\right) = \sqrt{\frac{p(p - a)}{bc}}
3. **Tangente del Ángulo Mitad:**
   \tan\left(\frac{A}{2}\right) = \sqrt{\frac{(p - b)(p - c)}{p(p - a)}} = \frac{r}{p - a}

---

### 3.7. Fórmulas del Área de la Región Triangular (S)

1. **Fórmula Trigonométrica Básica:**
   S = \frac{1}{2}ab\sin(C) = \frac{1}{2}bc\sin(A) = \frac{1}{2}ac\sin(B)
2. **En Función del Circunradio (R):**
   S = \frac{abc}{4R} = 2R^2\sin(A)\sin(B)\sin(C)
3. **En Función del Inradio (r):**
   S = p \cdot r
4. **Fórmula de Herón:**
   S = \sqrt{p(p - a)(p - b)(p - c)}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Ley de Tangentes**| \dfrac{a - b}{a + b} = \dfrac{\tan\left(\frac{A-B}{2}\right)}{\cot\left(\frac{C}{2}\right)} | Relaciona diferencias angulares |
| **Ley de Proyecciones**| a = b\cos C + c\cos B | Suma de sombras ortogonales |
| **Briggs (Seno Mitad)**| \sin\left(\frac{A}{2}\right) = \sqrt{\dfrac{(p-b)(p-c)}{bc}} | p = \frac{a+b+c}{2} |
| **Briggs (Coseno Mitad)**| \cos\left(\frac{A}{2}\right) = \sqrt{\dfrac{p(p-a)}{bc}} | p = \frac{a+b+c}{2} |
| **Área con Circunradio**| S = \dfrac{abc}{4R} = 2R^2\sin A\sin B\sin C | Geometría y trigonometría mixta|
| **Área con Inradio** | S = p \cdot r | Relación con semiperímetro |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Eliminación Rápida de Lados en Fracciones Homogéneas
En preguntas teóricas donde aparezcan expresiones como \frac{a\sin B - b\sin A}{c}:
- Sustituye de inmediato los lados por la Ley de Senos: a = 2R\sin A y b = 2R\sin B.
- La expresión se convierte en:
  \frac{(2R\sin A)\sin B - (2R\sin B)\sin A}{c} = \frac{2R\sin A\sin B - 2R\sin A\sin B}{c} = \frac{0}{c} = 0
- ¡Se resuelve en 3 segundos sin dibujar ningún triángulo!

### Hack 2: Cálculo Directo de Ángulos Notables con Ley de Cosenos
- Si a^2 = b^2 + c^2 - bc \implies 2bc\cos A = bc \implies \cos A = \frac{1}{2} \implies A = 60^\circ.
- Si a^2 = b^2 + c^2 + bc \implies -2bc\cos A = bc \implies \cos A = -\frac{1}{2} \implies A = 120^\circ.
- Si a^2 = b^2 + c^2 - \sqrt{2}bc \implies \cos A = \frac{\sqrt{2}}{2} \implies A = 45^\circ.
- Si a^2 = b^2 + c^2 + \sqrt{2}bc \implies \cos A = -\frac{\sqrt{2}}{2} \implies A = 135^\circ.
- Si a^2 = b^2 + c^2 - \sqrt{3}bc \implies \cos A = \frac{\sqrt{3}}{2} \implies A = 30^\circ.
- ¡Aprende a reconocer estos patrones visuales para marcar la respuesta al instante!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Ley de Senos: "LADO ARRIBA, SENO ABAJO, DIÁMETRO AL FINAL"
- Cada lado tiene a su seno debajo:
  \frac{\text{Lado } a}{\sin A} = \frac{\text{Lado } b}{\sin B} = \frac{\text{Lado } c}{\sin C} = 2R
  ¡Recuerda siempre que al final es 2R (el diámetro), no R!

### 2. Mnemotecnia de la Ley de Cosenos: "PITÁGORAS CON DESCUENTO"
- El lado al cuadrado es Pitágoras (b^2 + c^2) **menos el descuento** del doble producto por el coseno:
  a^2 = b^2 + c^2 \mathbf{- 2bc\cos A}

### 3. Mnemotecnia de Proyecciones: "EL LADO ES LA SUMA CRUZADA"
- Para hallar el lado a, tomas los otros dos lados (b y c) y los cruzas con los cosenos de los ángulos opuestos:
  a = b \cdot \cos(C) + c \cdot \cos(B)

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Signo Negativo del Coseno en Ángulos Obtusos**
> Si el triángulo es obtusángulo con A = 120^\circ:
> En la ley de cosenos, \cos(120^\circ) = -\frac{1}{2}.
> Al sustituir:
> a^2 = b^2 + c^2 - 2bc\left(-\frac{1}{2}\right) = b^2 + c^2 + bc
> Muchos postulantes olvidan que menos por menos da más y restan el término, obteniendo un lado menor que los otros dos en lugar del lado mayor.

> [!CAUTION]
> **Trampa 2: Circunradio vs Radio**
> La constante de la ley de senos es **2R (dos veces el circunradio)**.
> Si te dicen "la circunferencia circunscrita tiene radio 5", la constante de la ley de senos es 2(5) = 10, no 5.

> [!WARNING]
> **Trampa 3: El Caso Ambiguo L-L-A**
> Cuando conoces dos lados a, b y el ángulo A opuesto al lado menor (a < b):
> Al aplicar \sin B = \frac{b\sin A}{a}, si \sin B < 1, existen **DOS ÁNGULOS POSIBLES**:
> Uno agudo B_1 y otro obtuso B_2 = 180^\circ - B_1. ¡Debes verificar si ambos ángulos permiten que la suma interior no supere 180^\circ!

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Triangulación Geodésica y Cartografía:** El Instituto Geográfico Nacional (IGN) traza las cartas topográficas del Perú midiendo líneas de base geodésicas y aplicando la ley de senos para calcular distancias a vértices en picos de cordilleras sin necesidad de ascender a ellos.
2. **Navegación Marítima y Aérea (Cálculo de Distancia entre Barcos):** Dos embarcaciones que parten del puerto de Matarani con rumbos divergentes que forman un ángulo \theta calculan su distancia de separación en alta mar tras cierto tiempo mediante la ley de cosenos (conociendo las distancias recorridas d_1 = v_1 t y d_2 = v_2 t).
3. **Ingeniería Estructural y Cálculo de Cerchas:** En puentes y techumbres reticuladas, los esfuerzos axiales de tracción y compresión en barras diagonales no ortogonales se resuelven planteando el equilibrio de nudos con leyes de senos y cosenos.

---
