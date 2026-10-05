## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     \text{Área}(ABG) = \text{Área}(BCG) = \text{Área}(CAG) = \frac{A_{\text{total}}}{3}
4. **Triángulos Semejantes:** La razón entre las áreas de dos triángulos semejantes es igual al cuadrado de su razón de semejanza lineal:
   \text{Si } \triangle ABC \sim \triangle A'B'C' \text{ con razón } k \implies \frac{\text{Área}(\triangle ABC)}{\text{Área}(\triangle A'B'C')} = k^2 = \left(\frac{a}{a'}\right)^2 = \left(\frac{h}{h'}\right)^2 = \left(\frac{r}{r'}\right)^2

---

### 3.4. Áreas de Regiones Cuadrangulares

1. **Cuadrilátero Convexo General:**
   A = \frac{1}{2} d_1 \cdot d_2 \cdot \sin(\theta)
   Donde d_1, d_2 son las longitudes de las diagonales y \theta es el ángulo entre ellas.
2. **Trapecio:**
   A = \left(\frac{B + b}{2}\right) h = M \cdot h
   Donde M = \frac{B+b}{2} es la longitud de la base media y h es la altura.
   - *Propiedades en el Trapecio:* Al trazar las diagonales de un trapecio con bases BC y AD, las áreas de los triángulos laterales son iguales: S_{\triangle ABM} = S_{\triangle CDM} = S. Además, S^2 = S_{\text{base1}} \cdot S_{\text{base2}} \implies S = \sqrt{S_1 \cdot S_2}.
   - El área total del trapecio es: A_{\text{total}} = (\sqrt{S_1} + \sqrt{S_2})^2.
3. **Paralelogramo / Romboide:**
   A = b \cdot h = a \cdot b \cdot \sin(\alpha)
4. **Rombo:**
   A = \frac{D \cdot d}{2}
   Donde D y d son las diagonales mayor y menor (perpendiculares entre sí).
5. **Cuadrado y Rectángulo:**
   - Rectángulo: A = b \cdot h.
   - Cuadrado: A = L^2 = \frac{d^2}{2}.
6. **Cuadrilátero Circunscrito (Tangencial):**
   A = p \cdot r
7. **Cuadrilátero Inscriptible (Fórmula de Brahmagupta):**
   Para un cuadrilátero inscriptible de lados a, b, c, d y semiperímetro p:
   A = \sqrt{(p - a)(p - b)(p - c)(p - d)}

---

### 3.5. Áreas de Regiones Circulares

1. **Círculo:**
   A = \pi R^2
2. **Sector Circular:**
   A_{\text{sector}} = \frac{\pi R^2 \theta^\circ}{360^\circ} = \frac{1}{2} \theta_{\text{rad}} R^2 = \frac{L \cdot R}{2}
3. **Corona Circular:** Región entre dos circunferencias concéntricas de radios R y r:
   A_{\text{corona}} = \pi(R^2 - r^2)
   *Artificio de la cuerda tangente:* Si \overline{AB} es una cuerda de la circunferencia mayor tangente a la menor, su longitud es 2\sqrt{R^2 - r^2}, por lo que:
   A_{\text{corona}} = \frac{\pi}{4} AB^2
4. **Trapecio Circular:**
   A_{\text{trap}} = \frac{\pi (R^2 - r^2) \theta^\circ}{360^\circ} = \left(\frac{L_1 + L_2}{2}\right) h \quad (h = R - r)
5. **Segmento Circular:**
   A_{\text{seg}} = A_{\text{sector}} - A_{\triangle} = \frac{\pi R^2 \theta^\circ}{360^\circ} - \frac{1}{2} R^2 \sin(\theta)
6. **Lúnulas de Hipócrates:**
   En un triángulo rectángulo, las áreas de las lúnulas construidas sobre los catetos como diámetros suman exactamente el área del triángulo rectángulo interior:
   S_1 + S_2 = \text{Área}(\triangle ABC)

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Trapecio** | A = \left(\dfrac{B+b}{2}\right)h | B, b: bases, h: altura perpendicular |
| **Brahmagupta** | A = \sqrt{(p-a)(p-b)(p-c)(p-d)} | Cuadrilátero inscriptible |
| **Círculo** | A = \pi R^2 | R: radio |
| **Sector Circular** | A = \dfrac{\pi R^2 \theta^\circ}{360^\circ} = \dfrac{L R}{2} | \theta^\circ: ángulo central en grados |
| **Corona Circular** | A = \pi(R^2 - r^2) = \dfrac{\pi AB^2}{4} | AB: cuerda mayor tangente a menor |
| **Segmento Circular** | A = \dfrac{R^2}{2}\left(\dfrac{\pi \theta^\circ}{180^\circ} - \sin(\theta)\right) | \theta: ángulo central |
| **Lúnulas de Hipócrates**| S_1 + S_2 = S_{\triangle \text{rectángulo}} | Construidas sobre catetos |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Método del Complemento o Sustracción de Áreas
Nunca intentes integrar o aplicar fórmulas exóticas a regiones sombreadas irregulares. Descompón siempre:
A_{\text{sombreada}} = A_{\text{figura contenedora total}} - \sum A_{\text{regiones en blanco}}
Por ejemplo, una región entre un cuadrado y un cuadrante es simplemente: A = L^2 - \frac{\pi L^2}{4}.

### Hack 2: Traslación de Regiones Simétricas
En problemas con figuras sombreadas compuestas por semicircunferencias o cuadrantes repetidos (hojas, pétalos, aspas de molino):
1. Traza los ejes de simetría o diagonales.
2. Corta mentalmente las piezas y trasládalas a los espacios en blanco complementarios.
3. El 80% de las veces, las regiones sombreadas encajan perfectamente formando un triángulo, un cuadrado interior o medio semicírculo.

### Hack 3: Proporcionalidad de Áreas en Trapecios
Si te dan las áreas de las bases de un trapecio S_1 y S_2 formadas por las diagonales:
- El área total es directamente el binomio al cuadrado:
  A_{\text{total}} = (\sqrt{S_1} + \sqrt{S_2})^2
- Las áreas laterales que no son las bases valen exactamente \sqrt{S_1 \cdot S_2}. ¡Ahorra 5 minutos de ecuaciones!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de Radios en Triángulos: "P-IRATA y CUATRO-RICOS"
- **P-IRATA:** A = p \cdot r (Área = semi**P**erímetro por **r**adio).
- **CUATRO-RICOS:** A = \frac{abc}{4R} (El producto de los lados abc entre **4 R**adiazos).

### 2. Mnemotecnia del Sector Circular: "ÁREA COMO TRIÁNGULO"
- Piensa en el sector circular como si fuera un triángulo curvo:
  \text{Área} = \frac{\text{Base} \times \text{Altura}}{2} = \frac{L \cdot R}{2}
  ¡Base es el arco L, altura es el radio R!

### 3. Mnemotecnia del Baricentro: "EL PASTEL DE 6 PORCIONES"
- Todo baricentro divide el pastel del triángulo en exactamente **6 porciones iguales** si trazas las 3 medianas, o en **3 porciones iguales** si lo unes a los 3 vértices.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Perímetro (2p) con Semiperímetro (p)**
> En las fórmulas de Herón (A = \sqrt{p(p-a)(p-b)(p-c)}), en A = pr y en Brahmagupta, la variable p es el **SEMIPERÍMETRO** (la suma de lados entre 2).
> Si el examen te dice "el perímetro de una figura es 24", 2p = 24 \implies p = 12. ¡Usar 24 arruina todo el cálculo!

> [!CAUTION]
> **Trampa 2: Unidades al Cuadrado en Semejanza**
> Si los lados de dos triángulos semejantes están en razón 2 : 3, ¡sus áreas NO están en razón 2 : 3! Están en razón (2/3)^2 = 4 : 9.
> En volumen espacial, estará al cubo: 8 : 27.

> [!WARNING]
> **Trampa 3: Ángulo en Radianes vs Grados Sexagesimales**
> En la fórmula del sector circular A = \frac{1}{2}\theta R^2, el ángulo \theta **DEBE ESTAR OBLIGATORIAMENTE EN RADIANES**. Si tienes el ángulo en grados sexagesimales, debes usar A = \frac{\pi R^2 \theta^\circ}{360^\circ}.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Agrimensura y Catastro Territorial:** El cálculo de linderos irregulares de parcelas agrícolas y terrenos urbanos se realiza por triangulación y aplicación de la fórmula de Herón a partir de mediciones perimétricas con estaciones totales.
2. **Ingeniería Hidráulica y Canales de Riego:** La sección transversal de flujo de canales trapezoidales optimiza el "radio hidráulico" (R_h = \frac{A}{P_m}), donde maximizar el área A con el mínimo perímetro mojado P_m minimiza pérdidas por fricción.
3. **Diseño de Coberturas y Techos:** El cálculo del material de policarbonato o teja requerido para techos curvos (bóvedas cilíndricas) utiliza el desarrollo del área lateral y arcos de círculo.

---
