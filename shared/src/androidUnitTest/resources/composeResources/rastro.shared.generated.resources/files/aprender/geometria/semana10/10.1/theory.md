## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Geometría del Espacio y Cuerpos Redondos |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.0 a 5.0 horas |
| **Prerrequisitos** | Circunferencia, Áreas Planas, Triángulos Rectángulos y Geometría del Espacio |

### Competencias Clave del Prospecto
1. **Generación por Rotación:** Comprender y aplicar la generación de sólidos redondos mediante la rotación de figuras planas 360^\circ alrededor de un eje coplanar.
2. **Métrica del Cilindro y Tronco:** Calcular generatrices, áreas laterales, totales y volúmenes de cilindros rectos, equiláteros y troncos de cilindro.
3. **Métrica del Cono y Desarrollo Lateral:** Dominar la relación pitagórica g^2 = h^2 + r^2, el ángulo de desarrollo \theta = \frac{r}{g} \cdot 360^\circ, volúmenes de conos y troncos de cono.
4. **Esfera y Partes Esféricas:** Resolver problemas métricos en casquetes, zonas, husos, cuñas, sectores y segmentos esféricos.
5. **Teoremas de Pappus-Guldin:** Calcular áreas superficiales y volúmenes de sólidos de revolución generados por curvas y regiones planas arbitrarias conociendo su centroide.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Cuerpos de Revolución] --> B[Cilindro Circular Recto]
    A --> C[Cono Circular Recto]
    A --> D[Esfera y Zonas Esféricas]
    A --> E[Teoremas de Pappus-Guldin]

    B --> B1[Generatriz y Radio: h = g]
    B --> B2[Área: AL = 2πrg, AT = 2πr(g+r)]
    B --> B3[Volumen: V = πr²h]
    B --> B4[Cilindro Equilátero y Tronco de Cilindro]

    C --> C1[Pitagórica: g² = h² + r²]
    C --> C2[Desarrollo: θ = 360° · r/g]
    C --> C3[Área y Volumen: V = 1/3 πr²h]
    C --> C4[Tronco de Cono de Revolución]

    D --> D1[Superficie: A = 4πR²]
    D --> D2[Volumen: V = 4/3 πR³]
    D --> D3[Zona y Casquete: A = 2πRh]
    D --> D4[Huso y Cuña Esférica]

    E --> E1[1er Teorema: Área = 2π · ȳ · L]
    E --> E2[2do Teorema: Volumen = 2π · ȳ · A]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Definición y Generación de Cuerpos de Revolución
Un **sólido o cuerpo de revolución** es aquel generado por la rotación completa (360^\circ o 2\pi\text{ rad}) de una región plana alrededor de una recta coplanar denominada **eje de giro** o revolución.

---

### 3.2. Cilindro Circular Recto (Cilindro de Revolución)
Generado por la rotación de una región rectangular alrededor de uno de sus lados:
- **Radio de la base (r):** Radio del círculo base.
- **Altura (h) y Generatriz (g):** En el cilindro recto, g = h.
- **Desarrollo de la Superficie Lateral:** Es una región rectangular cuyos lados miden 2\pi r (longitud de la circunferencia base) y g (altura).

#### Fórmulas Métricas del Cilindro Recto:
1. **Área Lateral (A_L):**
   A_L = 2\pi r g = 2\pi r h
2. **Área Total (A_T):**
   A_T = A_L + 2A_{\text{base}} = 2\pi r g + 2\pi r^2 = 2\pi r(g + r)
3. **Volumen (V):**
   V = A_{\text{base}} \cdot h = \pi r^2 h

#### Casos Especiales:
- **Cilindro Equilátero:** Su generatriz es igual al diámetro de la base (g = 2r). Su sección axial es un cuadrado de lado 2r.
- **Tronco de Cilindro Recto:** Resulta de cortar un cilindro recto con un plano oblicuo no paralelo a las bases:
  - Generatriz del eje: g_{\text{eje}} = \dfrac{g_{\text{máx}} + g_{\text{mín}}}{2}.
  - Volumen: V = \pi r^2 \cdot g_{\text{eje}} = \pi r^2 \left( \dfrac{g_{\text{máx}} + g_{\text{mín}}}{2} \right).
  - Área Lateral: A_L = 2\pi r \cdot g_{\text{eje}}.

---

### 3.3. Cono Circular Recto (Cono de Revolución)
Generado por la rotación de una región triangular rectangular alrededor de uno de sus catetos:
- **Eje:** Cateto sobre el cual gira (h).
- **Radio de la base (r):** Cateto que barre el círculo de la base.
- **Generatriz (g):** Hipotenusa del triángulo rectángulo generador.
- **Relación Pitagórica Fundamental:**
  g^2 = h^2 + r^2

#### Desarrollo de la Superficie Lateral:
Al abrir y extender la superficie lateral del cono sobre un plano, se obtiene un **sector circular** cuyo radio es la generatriz g y cuya longitud de arco es el perímetro de la base 2\pi r.
- **Ángulo de Desarrollo (\theta^\circ):**
  \frac{\theta^\circ}{360^\circ} = \frac{r}{g} \implies \theta^\circ = \left(\frac{r}{g}\right) \cdot 360^\circ

#### Fórmulas Métricas del Cono Recto:
1. **Área Lateral (A_L):**
   A_L = \pi r g
2. **Área Total (A_T):**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Sólido / Elemento | Área Lateral / Superficie | Volumen | Relación Particular |
| :--- | :--- | :--- | :--- |
| **Cilindro Recto** | A_L = 2\pi r h | V = \pi r^2 h | A_T = 2\pi r(h + r) |
| **Cilindro Equilátero** | A_L = 4\pi r^2 | V = 2\pi r^3 | g = 2r |
| **Tronco de Cilindro**| A_L = 2\pi r \left(\dfrac{g_1 + g_2}{2}\right) | V = \pi r^2 \left(\dfrac{g_1 + g_2}{2}\right) | Eje central promedio |
| **Cono Recto** | A_L = \pi r g | V = \dfrac{1}{3}\pi r^2 h | g^2 = h^2 + r^2 |
| **Desarrollo Cono** | \theta^\circ = \left(\dfrac{r}{g}\right) 360^\circ | — | Sector circular plano |
