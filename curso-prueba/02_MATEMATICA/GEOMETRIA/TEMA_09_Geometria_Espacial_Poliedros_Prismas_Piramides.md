# TEMA 09: GEOMETRÍA ESPACIAL, POLIEDROS, PRISMAS Y PIRÁMIDES

---

## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría del Espacio y Estereometría |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Geometría Plana, Polígonos, Áreas de Regiones Planas y Trigonometría Básica |

### Competencias Clave del Prospecto
1. **Visualización y Proyección Espacial:** Dominar las posiciones relativas de rectas y planos en el espacio $\mathbb{R}^3$, rectas alabeadas y el Teorema de las Tres Perpendiculares.
2. **Aplicación del Teorema de Euler y Poliedros Regulares:** Analizar y calcular elementos, áreas y volúmenes de los 5 sólidos platónicos (tetraedro, hexaedro, octaedro, dodecaedro e icosaedro).
3. **Métrica de Prismas y Paralelepípedos:** Calcular áreas laterales, totales y volúmenes de prismas rectos, oblicuos (usando sección recta) y ortoedros.
4. **Métrica de Pirámides y Troncos:** Manejar relaciones métricas, apotemas, volúmenes de pirámides y troncos de pirámide mediante semejanza tridimensional.

---

## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Geometría del Espacio] --> B[Fundamentos y Posiciones Relativas]
    A --> C[Ángulos Diedros y Triedros]
    A --> D[Poliedros Regulares / Platónicos]
    A --> E[Prismas y Paralelepípedos]
    A --> F[Pirámides y Troncos de Pirámide]

    B --> B1[Determinación del Plano]
    B --> B2[Rectas Alabeadas / Cruzadas]
    B --> B3[Teorema de las Tres Perpendiculares]

    C --> C1[Ángulo Diedro y Planos Perpendiculares]
    C --> C2[Triedro: Suma de Caras < 360°]

    D --> D1[Teorema de Euler: C + V = A + 2]
    D --> D2[Tetraedro y Octaedro Regular]
    D --> D3[Hexaedro Regular / Cubo]
    D --> D4[Dodecaedro e Icosaedro Regular]

    E --> E1[Prisma Recto: AL = 2p · h]
    E --> E2[Prisma Oblicuo: V = A_SR · a_L]
    E --> E3[Ortoedro: D² = a² + b² + c²]

    F --> F1[Pirámide Regular: V = 1/3 A_base · h]
    F --> F2[Relación de Semejanza Cúbica: V1/V2 = k³]
    F --> F3[Tronco de Pirámide: V = h/3 B1 + B2 + √(B1·B2)]
```

---

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Fundamentos del Espacio y Determinación de un Plano
Un plano geométrico queda determinado de manera única por:
1. Tres puntos no colineales.
2. Una recta y un punto exterior a ella.
3. Dos rectas secantes.
4. Dos rectas paralelas no coincidentes.

#### Posiciones Relativas en el Espacio:
- **Dos Rectas:**
  - *Coplanares:* Paralelas (no se cortan) o Secantes (se cortan en un punto).
  - *No Coplanares (Alabeadas o Cruzadas):* No se intersecan ni son paralelas; pertenecen a planos distintos.
- **Recta y Plano:**
  - Recta paralela al plano (intersección vacía).
  - Recta secante al plano (se intersecan en un único punto).
  - Recta contenida en el plano (todos sus puntos pertenecen al plano).
- **Dos Planos:** Paralelos (distancia constante) o Secantes (se cortan en una línea recta llamada arista).

---

### 3.2. Teorema de las Tres Perpendiculares (Pilar de la Estereometría)
Sea un plano $\mathcal{P}$, una recta $\mathscr{L}_1$ perpendicular al plano en el punto $O$, y una recta $\mathscr{L}$ contenida en dicho plano:
1. **Primera perpendicular:** $\overline{PO} \perp \mathcal{P}$ (con $P$ exterior y $O \in \mathcal{P}$).
2. **Segunda perpendicular:** Desde $O$ se traza $\overline{OH} \perp \mathscr{L}$ ($H \in \mathscr{L}$).
3. **Tesis (Tercera perpendicular):** Al unir $P$ con $H$, la recta $\overline{PH}$ es **estrictamente perpendicular** a la recta $\mathscr{L}$.
   $$\overline{PH} \perp \mathscr{L}$$
*Importancia:* Permite calcular al instante la distancia de un punto a una recta en el espacio y determinar la medida del ángulo diedro formado entre el plano que contiene a $\triangle POH$ y el plano $\mathcal{P}$.

---

### 3.3. Ángulos Diedros y Triedros
- **Ángulo Diedro:** Figura geométrica formada por dos semiplanos (caras) que tienen una recta común de origen (arista). Su medida es el ángulo rectilíneo formado por dos rectas perpendiculares a la arista trazadas por un mismo punto de ella, una en cada cara.
- **Ángulo Triedro:** Ángulo poliedro de tres caras ($a, b, c$) y tres diedros ($\alpha, \beta, \gamma$).
  - *Propiedad de las caras:* En todo triedro, la suma de las medidas de sus caras es estrictamente mayor que $0^\circ$ y menor que $360^\circ$:
    $$0^\circ < a + b + c < 360^\circ$$
  - *Desigualdad triangular de caras:* Cada cara es menor que la suma de las otras dos y mayor que su diferencia:
    $$|b - c| < a < b + c$$

---

### 3.4. Poliedros y Teorema de Euler
Un **poliedro** es un sólido geométrico limitado por cuatro o más regiones poligonales planas denominadas caras.
- **Teorema de Euler:** En todo poliedro convexo:
  $$C + V = A + 2$$
  Donde $C$ es el número de caras, $V$ el número de vértices y $A$ el número de aristas.
- **Suma de las medidas de los ángulos internos de todas las caras ($S_\angle$):**
  $$S_\angle = 360^\circ (V - 2) = 360^\circ (A - C)$$

#### Los 5 Poliedros Regulares (Sólidos Platónicos):
Son aquellos cuyas caras son regiones poligonales regulares congruentes y en cada vértice concurre el mismo número de aristas.

| Poliedro | Caras ($C$) | Vértices ($V$) | Aristas ($A$) | Forma de la Cara | Área Total ($A_T$) | Volumen ($V$) |
| :--- | :---: | :---: | :---: | :--- | :--- | :--- |
| **Tetraedro Regular** | 4 | 4 | 6 | $\triangle$ Equilátero | $a^2\sqrt{3}$ | $\dfrac{a^3\sqrt{2}}{12}$ |
| **Hexaedro (Cubo)** | 6 | 8 | 12 | Cuadrado | $6a^2$ | $a^3$ |
| **Octaedro Regular** | 8 | 6 | 12 | $\triangle$ Equilátero | $2a^2\sqrt{3}$ | $\dfrac{a^3\sqrt{2}}{3}$ |
| **Dodecaedro Regular**| 12 | 20 | 30 | Pentágono Reg. | $15a^2\sqrt{\frac{5+2\sqrt{5}}{5}}$ | $\dfrac{a^3}{4}(15+7\sqrt{5})$ |
| **Icosaedro Regular** | 20 | 12 | 30 | $\triangle$ Equilátero | $5a^2\sqrt{3}$ | $\dfrac{5a^3}{12}(3+\sqrt{5})$ |

*Relaciones Clave en Poliedros Regulares:*
- Altura del Tetraedro Regular: $h = \dfrac{a\sqrt{6}}{3}$.
- Diagonal del Cubo: $D = a\sqrt{3}$.
- Diagonal del Octaedro Regular: $D = a\sqrt{2}$.

---

### 3.5. Prismas y Paralelepípedos
Un **prisma** es un poliedro limitado por dos bases poligonales congruentes y paralelas, y cuyas caras laterales son paralelogramos.
1. **Prisma Recto:** Las aristas laterales son perpendiculares a las bases (la arista lateral coincide con la altura: $a_L = h$).
   - Área Lateral: $A_L = 2p_{\text{base}} \cdot h$ ($2p_{\text{base}}$ es el perímetro de la base).
   - Área Total: $A_T = A_L + 2A_{\text{base}}$.
   - Volumen: $V = A_{\text{base}} \cdot h$.
2. **Prisma Oblicuo:** Las aristas laterales no son perpendiculares a las bases.
   - **Sección Recta ($\mathcal{S}_R$):** Sección plana determinada por un plano perpendicular a todas las aristas laterales.
   - Área Lateral: $A_L = 2p_{\mathcal{S}_R} \cdot a_L$.
   - Volumen: $V = A_{\text{base}} \cdot h = A_{\mathcal{S}_R} \cdot a_L$.
3. **Paralelepípedo Rectangular, Ortoedro o Rectoedro:** Prisma recto cuyas seis caras son regiones rectangulares de dimensiones $a, b, c$:
   - Diagonal espacial: $D = \sqrt{a^2 + b^2 + c^2}$.
   - Área Total: $A_T = 2(ab + bc + ac)$.
   - Volumen: $V = a \cdot b \cdot c$.
   - Relación algebraica notable: $(a + b + c)^2 = D^2 + A_T$.

---

### 3.6. Pirámides y Troncos de Pirámide
Una **pirámide** es un poliedro determinado por una base poligonal cualquiera y caras laterales triangulares que concurren en un punto común llamado **cúspide** o **vértice**.

1. **Pirámide Regular:** Su base es un polígono regular y el pie de su altura coincide con el centro de la base.
   - **Apotema de la pirámide ($Ap$):** Altura de cualquiera de sus caras laterales triangulares isósceles.
   - **Apotema de la base ($ap$):** Distancia del centro de la base al punto medio de un lado de la base.
   - Relación pitagórica fundamental:
     $$Ap^2 = h^2 + ap^2$$
   - Área Lateral: $A_L = p_{\text{base}} \cdot Ap$ ($p_{\text{base}}$ es el semiperímetro de la base).
   - Área Total: $A_T = A_L + A_{\text{base}}$.
   - Volumen: $V = \dfrac{1}{3} A_{\text{base}} \cdot h$.

2. **Semejanza de Pirámides:**
   Si un plano paralelo a la base corta a una pirámide a una distancia $h'$ del vértice:
   $$\frac{A_{\text{base}'}}{A_{\text{base}}} = \left(\frac{h'}{h}\right)^2 \quad \text{y} \quad \frac{V_{\text{deficiente}}}{V_{\text{total}}} = \left(\frac{h'}{h}\right)^3$$

3. **Tronco de Pirámide Regular (Bases Paralelas):**
   - Volumen:
     $$V = \frac{h}{3} \left( B_1 + B_2 + \sqrt{B_1 \cdot B_2} \right)$$
     Donde $B_1$ y $B_2$ son las áreas de las bases paralelas y $h$ es la distancia entre ellas.

---

## 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Sólido / Relación | Fórmula Rigurosa | Variables y Condiciones |
| :--- | :--- | :--- |
| **Teorema de Euler** | $C + V = A + 2$ | Válido para poliedros convexos |
| **Suma de Ángulos de Caras**| $S_\angle = 360^\circ(V - 2)$ | $V$: número de vértices |
| **Tetraedro Regular (Altura)**| $h = \dfrac{a\sqrt{6}}{3}$ | $a$: longitud de la arista |
| **Tetraedro Regular (Volumen)**| $V = \dfrac{a^3\sqrt{2}}{12}$ | $a$: arista |
| **Octaedro Regular (Volumen)**| $V = \dfrac{a^3\sqrt{2}}{3}$ | Formado por dos pirámides cuadrangulares |
| **Diagonal del Ortoedro** | $D^2 = a^2 + b^2 + c^2$ | $a, b, c$: dimensiones de las 3 aristas concurrentes |
| **Área Total del Ortoedro**| $A_T = 2(ab + bc + ca)$ | Superficie de las 6 caras rectangulares |
| **Volumen del Prisma Oblicuo**| $V = A_{\mathcal{S}_R} \cdot a_L$ | $A_{\mathcal{S}_R}$: área sección recta, $a_L$: arista lateral |
| **Pirámide (Volumen)** | $V = \dfrac{1}{3} A_{\text{base}} \cdot h$ | $h$: altura perpendicular a la base |
| **Pirámide Regular ($A_L$)** | $A_L = p_{\text{base}} \cdot Ap$ | $p_{\text{base}}$: semiperímetro, $Ap$: apotema piramidal |
| **Tronco de Pirámide ($V$)** | $V = \dfrac{h}{3}(B_1 + B_2 + \sqrt{B_1 B_2})$ | $B_1, B_2$: áreas de bases paralelas |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Teorema de Euler: "CARLOS VIVE A DOS CUADRAS"
- **C**ARLOS + **V**IVE = **A** + **2**
  $$C + V = A + 2$$
  ¡Nunca olvidarás si el $+2$ va con la $A$ o con la $C$!

### 2. Mnemotecnia de los Sólidos Platónicos: "T-H-O-D-I (Te Huelo O Debería Irme)"
- Orden por número de caras:
  - **T**etraedro ($4$)
  - **H**exaedro ($6$)
  - **O**ctaedro ($8$)
  - **D**odecaedro ($12$)
  - **I**cosaedro ($20$)
- Vértices y Caras se invierten en los poliedros duales: Hexaedro ($C=6, V=8$) y Octaedro ($C=8, V=6$); Dodecaedro ($C=12, V=20$) e Icosaedro ($C=20, V=12$).

### 3. Mnemotecnia de las Tres Perpendiculares: "BAJA - CRUZA - UNE"
1. **Baja:** La perpendicular del punto al plano ($\overline{PO}$).
2. **Cruza:** La perpendicular desde el pie hacia la recta contenida ($\overline{OH}$).
3. **Une:** El punto original con el pie en la recta ($\overline{PH}$). ¡Esa unión es perpendicular obligatoria!

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Identidad Algebraica en el Ortoedro (Problema Clásico de Examen)
En exámenes de admisión (UNSA y UNMSM), frecuentemente dan como datos:
- "La suma de las tres dimensiones es $S = a + b + c$".
- "La diagonal espacial es $D$".
- Preguntan: "¿Cuánto mide el área total $A_T$?".
- **Hack:** No calcules $a, b, c$ individualmente. Aplica directamente el trinomio al cuadrado:
  $$(a + b + c)^2 = a^2 + b^2 + c^2 + 2(ab + bc + ca) \implies S^2 = D^2 + A_T$$
  $$A_T = S^2 - D^2$$
  ¡Se resuelve en 5 segundos sin resolver ningún sistema de ecuaciones!

### Hack 2: La Pirámide Deficiente y la Razón Cúbica
Si te dicen que se corta una pirámide por un plano a la mitad de su altura ($h' = \frac{h}{2}$):
- La razón lineal es $k = \frac{1}{2}$.
- La pirámide pequeña superior tiene volumen:
  $$V_{\text{pequeña}} = \left(\frac{1}{2}\right)^3 V_{\text{total}} = \frac{1}{8} V_{\text{total}}$$
- El tronco inferior restante tiene volumen:
  $$V_{\text{tronco}} = V_{\text{total}} - \frac{1}{8}V_{\text{total}} = \frac{7}{8} V_{\text{total}}$$
- ¡La relación de volúmenes pirámide menor a tronco es siempre $1 : 7$!

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Apotema de la Pirámide con Altura**
> - La **altura ($h$)** cae verticalmente en el centro del polígono de la base.
> - La **apotema ($Ap$)** es la altura inclinada de una cara lateral triangular.
> - La hipotenusa es SIEMPRE la apotema: $Ap^2 = h^2 + ap^2$. Nunca asumas $Ap = h$.

> [!CAUTION]
> **Trampa 2: Rectas Cruzadas vs Rectas Paralelas**
> Dos rectas que no se intersecan en el espacio **NO necesariamente son paralelas**. Si no son coplanares, son **alabeadas o cruzadas**. Esta es la trampa favorita en las preguntas de Verdadero/Falso de la UNSA.

> [!WARNING]
> **Trampa 3: Área Lateral de Prisma Oblicuo**
> En un prisma oblicuo, el área lateral **NO es el perímetro de la base por la arista lateral**. Es el **perímetro de la SECCIÓN RECTA** por la arista lateral:
> $$A_L = 2p_{\mathcal{S}_R} \cdot a_L$$

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Arquitectura y Minería (Tolvas y Excavaciones):** Las tolvas de recepción de mineral en la industria minera de Arequipa (Cerro Verde) se diseñan con geometría de troncos de pirámide invertidos para garantizar el flujo gravitacional continuo de agregados.
2. **Cristalografía y Nanotecnología:** La estructura cristalina de los minerales (como la pirita de hierro o el diamante) adopta configuraciones poliédricas exactas (cubos, octaedros regulares) debido a la minimización de la energía libre en los enlaces atómicos.
3. **Cúpulas Geodésicas:** Estructuras como el domo de Epcot o invernaderos modernos se basan en la triangulación del icosaedro regular para maximizar la resistencia estructural con el menor peso de material.

---

## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel 1 - Básico / Admisión Directa)
**Enunciado:** Un poliedro convexo tiene 12 caras y 20 vértices. Calcule el número de aristas de dicho poliedro.

- A) 28
- B) 30
- C) 32
- D) 34
- E) 26

**Solución Paso a Paso:**
1. Identificamos los datos proporcionados:
   - Caras: $C = 12$ (dodecaedro).
   - Vértices: $V = 20$.
2. Aplicamos el **Teorema de Euler**:
   $$C + V = A + 2$$
3. Sustituimos los valores conocidos:
   $$12 + 20 = A + 2 \implies 32 = A + 2 \implies A = 30$$
- **Respuesta Correcta:** B) 30

---

### Ejercicio 2 (Nivel 2 - Intermedio / CEPREUNSA)
**Enunciado:** La suma de las tres dimensiones de un paralelepípedo rectangular (rectoedro) es $17\text{ cm}$ y su diagonal espacial mide $13\text{ cm}$. Calcule el área total del paralelepípedo.

- A) $120\text{ cm}^2$
- B) $144\text{ cm}^2$
- C) $169\text{ cm}^2$
- D) $289\text{ cm}^2$
- E) $156\text{ cm}^2$

**Solución Paso a Paso:**
1. Sean $a, b, c$ las tres dimensiones del paralelepípedo rectangular.
   - Suma de dimensiones: $a + b + c = 17\text{ cm}$.
   - Diagonal espacial: $D = \sqrt{a^2 + b^2 + c^2} = 13\text{ cm} \implies a^2 + b^2 + c^2 = 13^2 = 169\text{ cm}^2$.
2. El área total está dada por:
   $$A_T = 2(ab + bc + ca)$$
3. Elevamos al cuadrado la suma de las tres dimensiones:
   $$(a + b + c)^2 = (a^2 + b^2 + c^2) + 2(ab + bc + ca)$$
4. Sustituimos los valores conocidos:
   $$17^2 = 169 + A_T$$
   $$289 = 169 + A_T \implies A_T = 289 - 169 = 120\text{ cm}^2$$
- **Respuesta Correcta:** A) $120\text{ cm}^2$

---

### Ejercicio 3 (Nivel 3 - Intermedio-Avanzado / UNSA Ordinario)
**Enunciado:** En una pirámide cuadrangular regular, la arista de la base mide $12\text{ cm}$ y la altura de la pirámide mide $8\text{ cm}$. Calcule el área lateral de la pirámide.

- A) $192\text{ cm}^2$
- B) $240\text{ cm}^2$
- C) $288\text{ cm}^2$
- D) $384\text{ cm}^2$
- E) $144\text{ cm}^2$

**Solución Paso a Paso:**
1. La base es un cuadrado de lado $L = 12\text{ cm}$.
   - El semiperímetro de la base es:
     $$p_{\text{base}} = \frac{4 \times 12}{2} = 24\text{ cm}$$
   - La apotema de la base ($ap$) es la distancia del centro al punto medio de un lado:
     $$ap = \frac{L}{2} = \frac{12}{2} = 6\text{ cm}$$
2. Calculamos la apotema de la pirámide ($Ap$) usando el triángulo rectángulo formado por la altura ($h = 8\text{ cm}$), la apotema de la base ($ap = 6\text{ cm}$) y la apotema de la pirámide:
   $$Ap = \sqrt{h^2 + ap^2} = \sqrt{8^2 + 6^2} = \sqrt{64 + 36} = \sqrt{100} = 10\text{ cm}$$
3. Calculamos el área lateral:
   $$A_L = p_{\text{base}} \cdot Ap = 24 \cdot 10 = 240\text{ cm}^2$$
- **Respuesta Correcta:** B) $240\text{ cm}^2$

---

### Ejercicio 4 (Nivel 4 - Avanzado / UNMSM DECO)
**Enunciado:** Una empresa de silos para granos diseña un depósito en forma de pirámide hexagonal regular cuya altura total es de $18\text{ m}$. Por cuestiones operativas de descarga, se coloca una compuerta horizontal que corta la pirámide a $6\text{ m}$ de la base (formando un tronco de pirámide inferior y una pirámide menor superior). Si el volumen total de almacenamiento de la pirámide original es de $540\text{ m}^3$, determine el volumen de grano que puede almacenar la sección superior (pirámide deficiente).

- A) $120\text{ m}^3$
- B) $160\text{ m}^3$
- C) $180\text{ m}^3$
- D) $240\text{ m}^3$
- E) $270\text{ m}^3$

**Solución Paso a Paso:**
1. La altura total de la pirámide es $H = 18\text{ m}$.
2. El corte se realiza a $6\text{ m}$ de la base, por tanto, la altura de la pirámide menor superior es:
   $$h' = H - 6 = 18 - 6 = 12\text{ m}$$
3. Determinamos la razón de semejanza lineal $k$ entre la pirámide menor y la pirámide original:
   $$k = \frac{h'}{H} = \frac{12}{18} = \frac{2}{3}$$
4. Por el teorema de semejanza de volúmenes en poliedros semejantes, la razón de sus volúmenes es el cubo de la razón de semejanza:
   $$\frac{V'}{V_{\text{total}}} = k^3 = \left(\frac{2}{3}\right)^3 = \frac{8}{27}$$
5. Calculamos el volumen de la pirámide superior $V'$ sabiendo que $V_{\text{total}} = 540\text{ m}^3$:
   $$V' = \frac{8}{27} \times 540 = 8 \times 20 = 160\text{ m}^3$$
- **Respuesta Correcta:** B) $160\text{ m}^3$

---

### Ejercicio 5 (Nivel 5 - Boss Challenge / UNI)
**Enunciado:** En un tetraedro regular $ABCD$ de arista $a = 6\sqrt{2}\text{ cm}$, se ubica el punto medio $M$ de la arista $\overline{CD}$. Calcule la distancia mínima entre las rectas alabeadas que contienen a la arista $\overline{AB}$ y a la arista opuesta $\overline{CD}$, y determine el volumen del tetraedro regular.

- A) $6\text{ cm}$ y $72\text{ cm}^3$
- B) $6\text{ cm}$ y $144\text{ cm}^3$
- C) $4\sqrt{3}\text{ cm}$ y $72\text{ cm}^3$
- D) $6\sqrt{2}\text{ cm}$ y $108\text{ cm}^3$
- E) $8\text{ cm}$ y $96\text{ cm}^3$

**Solución Paso a Paso:**
1. **Distancia entre Aristas Opuestas en un Tetraedro Regular:**
   - En un tetraedro regular, las aristas opuestas son ortogonales (perpendiculares entre sí).
   - El segmento que une los puntos medios de dos aristas opuestas es la perpendicular común a ambas y representa la mínima distancia $d$ entre ellas.
   - Sean $N$ punto medio de $\overline{AB}$ y $M$ punto medio de $\overline{CD}$.
   - En la cara $BCD$, la mediana $\overline{BM}$ es altura del triángulo equilátero de lado $a$:
     $$BM = \frac{a\sqrt{3}}{2}$$
   - Análogamente, en la cara $ACD$, la mediana $\overline{AM} = \frac{a\sqrt{3}}{2}$.
   - El triángulo $AMB$ es isósceles con base $AB = a$ y lados iguales $AM = BM = \frac{a\sqrt{3}}{2}$.
   - Como $N$ es el punto medio de $\overline{AB}$, el segmento $\overline{MN}$ es la altura de este triángulo isósceles:
     $$d^2 = MN^2 = BM^2 - BN^2 = \left(\frac{a\sqrt{3}}{2}\right)^2 - \left(\frac{a}{2}\right)^2 = \frac{3a^2}{4} - \frac{a^2}{4} = \frac{2a^2}{4} = \frac{a^2}{2}$$
     $$d = \frac{a}{\sqrt{2}} = \frac{a\sqrt{2}}{2}$$
2. **Cálculo Numérico de la Distancia:**
   - Dado $a = 6\sqrt{2}\text{ cm}$:
     $$d = \frac{(6\sqrt{2})\sqrt{2}}{2} = \frac{6 \times 2}{2} = 6\text{ cm}$$
3. **Cálculo del Volumen del Tetraedro Regular:**
   - Aplicamos la fórmula del volumen del tetraedro regular:
     $$V = \frac{a^3\sqrt{2}}{12}$$
   - Sustituimos $a = 6\sqrt{2}$:
     $$a^3 = (6\sqrt{2})^3 = 216 \times 2\sqrt{2} = 432\sqrt{2}$$
     $$V = \frac{(432\sqrt{2})\sqrt{2}}{12} = \frac{432 \times 2}{12} = \frac{864}{12} = 72\text{ cm}^3$$
- **Respuesta Correcta:** A) $6\text{ cm}$ y $72\text{ cm}^3$

---

## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Rectas Alabeadas:** Dos rectas en el espacio tridimensional que no se intersecan ni son paralelas por no ser coplanares.
2. **Teorema de las Tres Perpendiculares:** Principio que garantiza que si una recta es perpendicular a un plano y desde su pie se traza una perpendicular a una recta contenida, la recta que une el extremo superior con dicho pie es perpendicular a la recta del plano.
3. **Ángulo Diedro:** Región espacial delimitada por dos semiplanos secantes que comparten una recta común llamada arista.
4. **Ángulo Triedro:** Esquina tridimensional formada por la intersección de tres planos en un vértice común.
5. **Teorema de Euler:** Relación topológica fundamental en poliedros convexos: $C + V = A + 2$.
6. **Sólidos Platónicos:** Los cinco únicos poliedros regulares convexos: tetraedro, hexaedro, octaedro, dodecaedro e icosaedro.
7. **Prisma Recto:** Poliedro cuyas aristas laterales son perpendiculares a las bases.
8. **Sección Recta:** Intersección de un prisma con un plano secante perpendicular a todas sus aristas laterales.
9. **Apotema de Pirámide:** Altura del triángulo isósceles que conforma una cara lateral de una pirámide regular.
10. **Ortoedro:** Paralelepípedo rectangular recto cuyas seis caras son rectángulos.

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la ecuación del Teorema de Euler en poliedros convexos?**
  - **A:** $C + V = A + 2$.
- **Q: ¿Cuál es el volumen de un tetraedro regular de arista $a$?**
  - **A:** $V = \dfrac{a^3\sqrt{2}}{12}$.
- **Q: ¿Cuál es la fórmula de la diagonal $D$ de un ortoedro de dimensiones $a, b, c$?**
  - **A:** $D = \sqrt{a^2 + b^2 + c^2}$.
- **Q: En una pirámide regular, ¿cuál es la relación pitagórica entre la altura $h$, la apotema de la base $ap$ y la apotema de la pirámide $Ap$?**
  - **A:** $Ap^2 = h^2 + ap^2$.
- **Q: Si se corta una pirámide a la mitad de su altura con un plano paralelo a la base, ¿en qué razón queda el volumen de la pirámide menor respecto a la original?**
  - **A:** $\left(\frac{1}{2}\right)^3 = \frac{1}{8}$.
- **Q: ¿Cómo se calcula el volumen de un prisma oblicuo usando la sección recta?**
  - **A:** $V = A_{\mathcal{S}_R} \cdot a_L$ (Área de la sección recta por la longitud de la arista lateral).

---

## 12. MOTOR DE GAMIFICACIÓN (JSON NATIVO PARA KOTLIN MULTIPLATFORM)

```json
{
  "temaId": "GEO_09_ESPACIO_POLIEDROS_PIRAMIDES",
  "titulo": "Estereometría: Poliedros Platónicos, Teorema de Euler, Prismas y Pirámides",
  "dificultad": "Avanzado",
  "xpTotal": 580,
  "skills": [
    "Teorema de las Tres Perpendiculares",
    "Teorema de Euler y Sólidos Platónicos",
    "Métrica de Ortoedros y Prismas",
    "Pirámides y Semejanza Espacial"
  ],
  "retos": [
    {
      "id": "reto_1",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuántos vértices tiene un icosaedro regular (poliedro de 20 caras triangulares)?",
      "opciones": ["12", "20", "30", "24"],
      "respuestaCorrecta": "12",
      "puntos": 70,
      "explicacion": "El icosaedro tiene C = 20 caras triangulares -> A = (20 * 3) / 2 = 30 aristas. Por Euler: 20 + V = 30 + 2 -> V = 12."
    },
    {
      "id": "reto_2",
      "tipo": "opcion_multiple",
      "pregunta": "Un ortoedro tiene aristas 3, 4 y 12. ¿Cuánto mide su diagonal espacial?",
      "opciones": ["13", "15", "17", "14"],
      "respuestaCorrecta": "13",
      "puntos": 80,
      "explicacion": "D = √(3² + 4² + 12²) = √(9 + 16 + 144) = √169 = 13."
    },
    {
      "id": "reto_3",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cuál es la altura de un tetraedro regular cuya arista mide 3 cm?",
      "opciones": ["√6 cm", "2√6 cm", "√3 cm", "3√2 cm"],
      "respuestaCorrecta": "√6 cm",
      "puntos": 90,
      "explicacion": "h = a√6 / 3. Con a = 3: h = (3√6) / 3 = √6 cm."
    },
    {
      "id": "reto_4",
      "tipo": "opcion_multiple",
      "pregunta": "Si las aristas de un cubo se duplican, ¿por cuánto se multiplica su volumen?",
      "opciones": ["2", "4", "8", "16"],
      "respuestaCorrecta": "8",
      "puntos": 70,
      "explicacion": "El volumen escala al cubo de la dimensión lineal: 2³ = 8."
    },
    {
      "id": "reto_boss",
      "tipo": "boss_challenge",
      "pregunta": "En una pirámide de volumen 648 m³, un plano paralelo a la base divide su altura en razón 1:2 desde el vértice (h' = H/3). ¿Cuál es el volumen del tronco de pirámide resultante?",
      "opciones": ["624 m³", "24 m³", "576 m³", "432 m³"],
      "respuestaCorrecta": "624 m³",
      "puntos": 270,
      "explicacion": "La pirámide menor tiene k = 1/3 -> V' = (1/3)³ * 648 = 648 / 27 = 24 m³. El tronco de pirámide tiene V_tronco = 648 - 24 = 624 m³."
    }
  ]
}
```
