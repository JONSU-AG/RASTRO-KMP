## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
   A_T = A_L + A_{\text{base}} = \pi r g + \pi r^2 = \pi r(g + r)
3. **Volumen (V):**
   V = \frac{1}{3} \pi r^2 h

#### Casos Especiales y Tronco de Cono:
- **Cono Equilátero:** La generatriz mide igual al diámetro de la base (g = 2r). Su sección axial es un triángulo equilátero. El ángulo de desarrollo de su superficie lateral es exactamente:
  \theta = \left(\frac{r}{2r}\right) \cdot 360^\circ = 180^\circ \quad (\text{una semicircunferencia})
- **Tronco de Cono de Revolución (Bases Paralelas):**
  - Generatriz del tronco: g^2 = h^2 + (R - r)^2.
  - Área Lateral: A_L = \pi g (R + r).
  - Volumen: V = \dfrac{\pi h}{3} (R^2 + r^2 + R \cdot r).

---

### 3.4. Esfera y Elementos Esféricos
Generada por la rotación de un semicírculo alrededor de su diámetro:
- **Superficie Esférica:** Conjunto de todos los puntos del espacio que equidistan de un centro O a una distancia fija R.
  A_{\text{superficie}} = 4\pi R^2
- **Volumen de la Esfera:**
  V_{\text{esfera}} = \frac{4}{3}\pi R^3

#### Partes de la Superficie y Sólidos Esféricos:
1. **Zona Esférica:** Porción de superficie esférica comprendida entre dos planos secantes paralelos.
   A_{\text{zona}} = 2\pi R h \quad (h \text{ es la distancia entre planos})
2. **Casquete Esférico:** Zona esférica con una sola base (el plano corta un extremo).
   A_{\text{casquete}} = 2\pi R h = \pi c^2 \quad (c \text{ es la cuerda trazada desde el polo})
3. **Huso Esférico:** Porción de superficie esférica limitada por dos semicircunferencias máximas con el mismo diámetro:
   A_{\text{huso}} = \frac{\pi R^2 \theta^\circ}{90^\circ}
4. **Cuña Esférica:** Sólido delimitado por un huso esférico y dos semicírculos máximos:
   V_{\text{cuña}} = \frac{\pi R^3 \theta^\circ}{270^\circ}
5. **Sector Esférico:** Sólido generado por un sector circular que rota alrededor de un diámetro exterior al sector:
   V_{\text{sector}} = \frac{2}{3}\pi R^2 h

---

### 3.5. Teoremas de Pappus-Guldin

#### Primer Teorema (Área de Superficie de Revolución)
El área de la superficie generada por una línea plana cuando gira 360^\circ alrededor de un eje coplanar no secante es igual a la longitud de la línea multiplicada por la longitud de la circunferencia descrita por su centroide (centro de gravedad \bar{y}):
A = 2\pi \cdot \bar{y} \cdot L

#### Segundo Teorema (Volumen de Sólido de Revolución)
El volumen del sólido generado por una región plana cerrada cuando gira 360^\circ alrededor de un eje coplanar que no corta a la región es igual al área de la región multiplicada por la longitud de la circunferencia que describe su centroide:
V = 2\pi \cdot \bar{y} \cdot A_{\text{región}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Tronco de Cono** | A_L = \pi g (R + r) | V = \dfrac{\pi h}{3}(R^2 + r^2 + Rr) | Bases circulares paralelas |
| **Esfera Completa** | A = 4\pi R^2 | V = \dfrac{4}{3}\pi R^3 | D = 2R |
| **Casquete Esférico** | A = 2\pi R h = \pi c^2 | — | c: cuerda polar |
| **Cuña Esférica** | A_{\text{huso}} = \dfrac{\pi R^2 \theta^\circ}{90^\circ}| V_{\text{cuña}} = \dfrac{\pi R^3 \theta^\circ}{270^\circ} | \theta^\circ: ángulo diedro |
| **Pappus (Superficie)**| A = 2\pi \bar{y} L | — | L: longitud de la curva |
| **Pappus (Volumen)** | — | V = 2\pi \bar{y} A_{\text{región}} | A_{\text{región}}: área generatriz |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Inscripción de Esfera en un Cilindro Equilátero (Teorema de Arquímedes)
Cuando una esfera de radio R se inscribe perfectamente en un cilindro recto (el cilindro es necesariamente equilátero, con r = R y h = 2R):
1. **Razón de Áreas:**
   \frac{A_{\text{esfera}}}{A_{\text{total cilindro}}} = \frac{4\pi R^2}{2\pi R(2R + R)} = \frac{4\pi R^2}{6\pi R^2} = \frac{2}{3}
2. **Razón de Volúmenes:**
   \frac{V_{\text{esfera}}}{V_{\text{cilindro}}} = \frac{\frac{4}{3}\pi R^3}{\pi R^2(2R)} = \frac{\frac{4}{3}}{2} = \frac{2}{3}
- **Conclusión de Arquímedes:** ¡Tanto el área como el volumen de la esfera son exactamente los \frac{2}{3} del cilindro circunscrito! Si sabes uno, el otro sale por simple multiplicación por \frac{2}{3}.

### Hack 2: Ángulo de Desarrollo en Conos Notables
- Si el cono tiene generatriz g y radio r = \frac{g}{2} (30^\circ - 60^\circ, cono equilátero): \theta = 180^\circ.
- Si r = \frac{g}{4}: \theta = 90^\circ (un cuadrante).
- Si r = \frac{g}{3}: \theta = 120^\circ.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de la Esfera: "CUATRO CÍRCULOS MÁXIMOS"
- El área de la superficie esférica es exactamente igual al área de **4 círculos máximos**:
  A = 4 \times (\pi R^2) = 4\pi R^2
- El volumen de la esfera es simplemente esa área multiplicada por el radio y dividida entre 3:
  V = \frac{A \cdot R}{3} = \frac{4\pi R^2 \cdot R}{3} = \frac{4}{3}\pi R^3

### 2. Mnemotecnia del Cono: "PI-R-G (El Pirograbador)"
- Para el área lateral del cono: **P**i - **R**adio - **G**eneratriz:
  A_L = \pi \cdot r \cdot g

### 3. Mnemotecnia de Pappus-Guldin: "DOS-PI-Y-COSA"
- Siempre es 2\pi \bar{y} (la trayectoria del centroide) multiplicada por la "cosa" que gira:
  - Si gira una línea (L) \implies da Área: A = 2\pi \bar{y} L.
  - Si gira un área (A) \implies da Volumen: V = 2\pi \bar{y} A.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Tercio en el Volumen del Cono**
> No olvides dividir entre 3 el volumen del cono (V = \frac{1}{3}\pi r^2 h). Es el error más frecuente cuando los estudiantes resuelven bajo presión de tiempo y calculan el volumen del cilindro por descuido.

> [!CAUTION]
> **Trampa 2: Generatriz vs Altura en el Cono**
> En el área lateral del cono interviene la **GENERATRIZ** (A_L = \pi r g), pero en el volumen interviene la **ALTURA** (V = \frac{1}{3}\pi r^2 h). Nunca pongas la generatriz en el volumen ni la altura en el área lateral.

> [!WARNING]
> **Trampa 3: La Distancia \bar{y} en Pappus-Guldin**
> La variable \bar{y} es la distancia perpendicular desde el centro de gravedad (centroide) de la figura **HASTA EL EJE DE GIRO**, no la coordenada de la figura ni la distancia entre vértices.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Tanques de Almacenamiento de Gas (GLP/GNL):** Los tanques esféricos tipo "Hortonsphere" son comunes en refinerías e industrias químicas porque la esfera ofrece la menor área de contención por unidad de volumen y distribuye la presión de manera homogénea sin concentradores de tensión.
2. **Diseño de Tolvas y Silos Cónicos:** En agroindustria y minería, las tolvas troncocónicas canalizan sólidos a granel regulando la velocidad de descarga terminal.
3. **Pistones y Motores de Combustión:** La cilindrada de un motor automotriz es la suma de los volúmenes de revolución de los cilindros recorridos por los pistones entre el punto muerto superior (PMS) y el punto muerto inferior (PMI): V = \frac{\pi D^2}{4} \cdot S \cdot N.

---

## Tronco de cilindro: corte oblicuo

Un plano oblicuo que corta todas las generatrices de un cilindro circular recto, sin atravesar su base, produce un sólido cuya altura varía sobre la base. No es un tronco de cono: el radio no disminuye con la altura. El área de la sección inclinada tampoco coincide con el área de la base circular.

La altura del plano es una función lineal sobre la base. Por simetría, su altura media equivale a la altura sobre el centro. Si h_min y h_max son las alturas extremas opuestas y la base tiene radio r, V = πr²(h_min + h_max)/2. Con r = 2, h_min = 3 y h_max = 7, resulta V = 20π unidades cúbicas. La fórmula requiere que el plano cubra toda la base por encima de ella; si el corte atraviesa la base, hay que estudiar otra región.
