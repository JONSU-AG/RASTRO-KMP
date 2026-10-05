## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
1. **Visualización y Proyección Espacial:** Dominar las posiciones relativas de rectas y planos en el espacio \mathbb{R}^3, rectas alabeadas y el Teorema de las Tres Perpendiculares.
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


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

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
Sea un plano \mathcal{P}, una recta \mathscr{L}_1 perpendicular al plano en el punto O, y una recta \mathscr{L} contenida en dicho plano:
1. **Primera perpendicular:** \overline{PO} \perp \mathcal{P} (con P exterior y O \in \mathcal{P}).
2. **Segunda perpendicular:** Desde O se traza \overline{OH} \perp \mathscr{L} (H \in \mathscr{L}).
3. **Tesis (Tercera perpendicular):** Al unir P con H, la recta \overline{PH} es **estrictamente perpendicular** a la recta \mathscr{L}.
   \overline{PH} \perp \mathscr{L}
*Importancia:* Permite calcular al instante la distancia de un punto a una recta en el espacio y determinar la medida del ángulo diedro formado entre el plano que contiene a \triangle POH y el plano \mathcal{P}.

---

### 3.3. Ángulos Diedros y Triedros
- **Ángulo Diedro:** Figura geométrica formada por dos semiplanos (caras) que tienen una recta común de origen (arista). Su medida es el ángulo rectilíneo formado por dos rectas perpendiculares a la arista trazadas por un mismo punto de ella, una en cada cara.
- **Ángulo Triedro:** Ángulo poliedro de tres caras (a, b, c) y tres diedros (\alpha, \beta, \gamma).
  - *Propiedad de las caras:* En todo triedro, la suma de las medidas de sus caras es estrictamente mayor que 0^\circ y menor que 360^\circ:
    0^\circ < a + b + c < 360^\circ
  - *Desigualdad triangular de caras:* Cada cara es menor que la suma de las otras dos y mayor que su diferencia:
    |b - c| < a < b + c

---

### 3.4. Poliedros y Teorema de Euler
Un **poliedro** es un sólido geométrico limitado por cuatro o más regiones poligonales planas denominadas caras.
- **Teorema de Euler:** En todo poliedro convexo:
  C + V = A + 2
  Donde C es el número de caras, V el número de vértices y A el número de aristas.
- **Suma de las medidas de los ángulos internos de todas las caras (S_\angle):**
  S_\angle = 360^\circ (V - 2) = 360^\circ (A - C)

#### Los 5 Poliedros Regulares (Sólidos Platónicos):
Son aquellos cuyas caras son regiones poligonales regulares congruentes y en cada vértice concurre el mismo número de aristas.

| Poliedro | Caras (C) | Vértices (V) | Aristas (A) | Forma de la Cara | Área Total (A_T) | Volumen (V) |
| :--- | :---: | :---: | :---: | :--- | :--- | :--- |

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Sólido / Relación | Fórmula Rigurosa | Variables y Condiciones |
| :--- | :--- | :--- |
| **Teorema de Euler** | C + V = A + 2 | Válido para poliedros convexos |
| **Suma de Ángulos de Caras**| S_\angle = 360^\circ(V - 2) | V: número de vértices |
| **Tetraedro Regular (Altura)**| h = \dfrac{a\sqrt{6}}{3} | a: longitud de la arista |
| **Tetraedro Regular (Volumen)**| V = \dfrac{a^3\sqrt{2}}{12} | a: arista |
| **Octaedro Regular (Volumen)**| V = \dfrac{a^3\sqrt{2}}{3} | Formado por dos pirámides cuadrangulares |
