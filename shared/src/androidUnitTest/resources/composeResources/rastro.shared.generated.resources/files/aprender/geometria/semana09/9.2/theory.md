## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
| **Tetraedro Regular** | 4 | 4 | 6 | \triangle Equilátero | a^2\sqrt{3} | \dfrac{a^3\sqrt{2}}{12} |
| **Hexaedro (Cubo)** | 6 | 8 | 12 | Cuadrado | 6a^2 | a^3 |
| **Octaedro Regular** | 8 | 6 | 12 | \triangle Equilátero | 2a^2\sqrt{3} | \dfrac{a^3\sqrt{2}}{3} |
| **Dodecaedro Regular**| 12 | 20 | 30 | Pentágono Reg. | 15a^2\sqrt{\frac{5+2\sqrt{5}}{5}} | \dfrac{a^3}{4}(15+7\sqrt{5}) |
| **Icosaedro Regular** | 20 | 12 | 30 | \triangle Equilátero | 5a^2\sqrt{3} | \dfrac{5a^3}{12}(3+\sqrt{5}) |

*Relaciones Clave en Poliedros Regulares:*
- Altura del Tetraedro Regular: h = \dfrac{a\sqrt{6}}{3}.
- Diagonal del Cubo: D = a\sqrt{3}.
- Diagonal del Octaedro Regular: D = a\sqrt{2}.

---

### 3.5. Prismas y Paralelepípedos
Un **prisma** es un poliedro limitado por dos bases poligonales congruentes y paralelas, y cuyas caras laterales son paralelogramos.
1. **Prisma Recto:** Las aristas laterales son perpendiculares a las bases (la arista lateral coincide con la altura: a_L = h).
   - Área Lateral: A_L = 2p_{\text{base}} \cdot h (2p_{\text{base}} es el perímetro de la base).
   - Área Total: A_T = A_L + 2A_{\text{base}}.
   - Volumen: V = A_{\text{base}} \cdot h.
2. **Prisma Oblicuo:** Las aristas laterales no son perpendiculares a las bases.
   - **Sección Recta (\mathcal{S}_R):** Sección plana determinada por un plano perpendicular a todas las aristas laterales.
   - Área Lateral: A_L = 2p_{\mathcal{S}_R} \cdot a_L.
   - Volumen: V = A_{\text{base}} \cdot h = A_{\mathcal{S}_R} \cdot a_L.
3. **Paralelepípedo Rectangular, Ortoedro o Rectoedro:** Prisma recto cuyas seis caras son regiones rectangulares de dimensiones a, b, c:
   - Diagonal espacial: D = \sqrt{a^2 + b^2 + c^2}.
   - Área Total: A_T = 2(ab + bc + ac).
   - Volumen: V = a \cdot b \cdot c.
   - Relación algebraica notable: (a + b + c)^2 = D^2 + A_T.

---

### 3.6. Pirámides y Troncos de Pirámide
Una **pirámide** es un poliedro determinado por una base poligonal cualquiera y caras laterales triangulares que concurren en un punto común llamado **cúspide** o **vértice**.

1. **Pirámide Regular:** Su base es un polígono regular y el pie de su altura coincide con el centro de la base.
   - **Apotema de la pirámide (Ap):** Altura de cualquiera de sus caras laterales triangulares isósceles.
   - **Apotema de la base (ap):** Distancia del centro de la base al punto medio de un lado de la base.
   - Relación pitagórica fundamental:
     Ap^2 = h^2 + ap^2
   - Área Lateral: A_L = p_{\text{base}} \cdot Ap (p_{\text{base}} es el semiperímetro de la base).
   - Área Total: A_T = A_L + A_{\text{base}}.
   - Volumen: V = \dfrac{1}{3} A_{\text{base}} \cdot h.

2. **Semejanza de Pirámides:**
   Si un plano paralelo a la base corta a una pirámide a una distancia h' del vértice:
   \frac{A_{\text{base}'}}{A_{\text{base}}} = \left(\frac{h'}{h}\right)^2 \quad \text{y} \quad \frac{V_{\text{deficiente}}}{V_{\text{total}}} = \left(\frac{h'}{h}\right)^3

3. **Tronco de Pirámide Regular (Bases Paralelas):**
   - Volumen:
     V = \frac{h}{3} \left( B_1 + B_2 + \sqrt{B_1 \cdot B_2} \right)
     Donde B_1 y B_2 son las áreas de las bases paralelas y h es la distancia entre ellas.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Diagonal del Ortoedro** | D^2 = a^2 + b^2 + c^2 | a, b, c: dimensiones de las 3 aristas concurrentes |
| **Área Total del Ortoedro**| A_T = 2(ab + bc + ca) | Superficie de las 6 caras rectangulares |
| **Volumen del Prisma Oblicuo**| V = A_{\mathcal{S}_R} \cdot a_L | A_{\mathcal{S}_R}: área sección recta, a_L: arista lateral |
| **Pirámide (Volumen)** | V = \dfrac{1}{3} A_{\text{base}} \cdot h | h: altura perpendicular a la base |
| **Pirámide Regular (A_L)** | A_L = p_{\text{base}} \cdot Ap | p_{\text{base}}: semiperímetro, Ap: apotema piramidal |
| **Tronco de Pirámide (V)** | V = \dfrac{h}{3}(B_1 + B_2 + \sqrt{B_1 B_2}) | B_1, B_2: áreas de bases paralelas |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Identidad Algebraica en el Ortoedro (Problema Clásico de Examen)
En exámenes de admisión (UNSA y UNMSM), frecuentemente dan como datos:
- "La suma de las tres dimensiones es S = a + b + c".
- "La diagonal espacial es D".
- Preguntan: "¿Cuánto mide el área total A_T?".
- **Hack:** No calcules a, b, c individualmente. Aplica directamente el trinomio al cuadrado:
  (a + b + c)^2 = a^2 + b^2 + c^2 + 2(ab + bc + ca) \implies S^2 = D^2 + A_T
  A_T = S^2 - D^2
  ¡Se resuelve en 5 segundos sin resolver ningún sistema de ecuaciones!

### Hack 2: La Pirámide Deficiente y la Razón Cúbica
Si te dicen que se corta una pirámide por un plano a la mitad de su altura (h' = \frac{h}{2}):
- La razón lineal es k = \frac{1}{2}.
- La pirámide pequeña superior tiene volumen:
  V_{\text{pequeña}} = \left(\frac{1}{2}\right)^3 V_{\text{total}} = \frac{1}{8} V_{\text{total}}
- El tronco inferior restante tiene volumen:
  V_{\text{tronco}} = V_{\text{total}} - \frac{1}{8}V_{\text{total}} = \frac{7}{8} V_{\text{total}}
- ¡La relación de volúmenes pirámide menor a tronco es siempre 1 : 7!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Teorema de Euler: "CARLOS VIVE A DOS CUADRAS"
- **C**ARLOS + **V**IVE = **A** + **2**
  C + V = A + 2
  ¡Nunca olvidarás si el +2 va con la A o con la C!

### 2. Mnemotecnia de los Sólidos Platónicos: "T-H-O-D-I (Te Huelo O Debería Irme)"
- Orden por número de caras:
  - **T**etraedro (4)
  - **H**exaedro (6)
  - **O**ctaedro (8)
  - **D**odecaedro (12)
  - **I**cosaedro (20)
- Vértices y Caras se invierten en los poliedros duales: Hexaedro (C=6, V=8) y Octaedro (C=8, V=6); Dodecaedro (C=12, V=20) e Icosaedro (C=20, V=12).

### 3. Mnemotecnia de las Tres Perpendiculares: "BAJA - CRUZA - UNE"
1. **Baja:** La perpendicular del punto al plano (\overline{PO}).
2. **Cruza:** La perpendicular desde el pie hacia la recta contenida (\overline{OH}).
3. **Une:** El punto original con el pie en la recta (\overline{PH}). ¡Esa unión es perpendicular obligatoria!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Apotema de la Pirámide con Altura**
> - La **altura (h)** cae verticalmente en el centro del polígono de la base.
> - La **apotema (Ap)** es la altura inclinada de una cara lateral triangular.
> - La hipotenusa es SIEMPRE la apotema: Ap^2 = h^2 + ap^2. Nunca asumas Ap = h.

> [!CAUTION]
> **Trampa 2: Rectas Cruzadas vs Rectas Paralelas**
> Dos rectas que no se intersecan en el espacio **NO necesariamente son paralelas**. Si no son coplanares, son **alabeadas o cruzadas**. Esta es la trampa favorita en las preguntas de Verdadero/Falso de la UNSA.

> [!WARNING]
> **Trampa 3: Área Lateral de Prisma Oblicuo**
> En un prisma oblicuo, el área lateral **NO es el perímetro de la base por la arista lateral**. Es el **perímetro de la SECCIÓN RECTA** por la arista lateral:
> A_L = 2p_{\mathcal{S}_R} \cdot a_L

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Arquitectura y Minería (Tolvas y Excavaciones):** Las tolvas de recepción de mineral en la industria minera de Arequipa (Cerro Verde) se diseñan con geometría de troncos de pirámide invertidos para garantizar el flujo gravitacional continuo de agregados.
2. **Cristalografía y Nanotecnología:** La estructura cristalina de los minerales (como la pirita de hierro o el diamante) adopta configuraciones poliédricas exactas (cubos, octaedros regulares) debido a la minimización de la energía libre en los enlaces atómicos.
3. **Cúpulas Geodésicas:** Estructuras como el domo de Epcot o invernaderos modernos se basan en la triangulación del icosaedro regular para maximizar la resistencia estructural con el menor peso de material.

---
