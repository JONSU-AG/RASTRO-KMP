## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
| **Ex-inscrito** | En la circunferencia | Una secante y una cuerda | \alpha = \dfrac{m\widehat{ABC}}{2} = 180^\circ - \text{inscrito} |
| **Interior** | Interior a la circ. | Dos cuerdas secantes | \alpha = \dfrac{m\widehat{AB} + m\widehat{CD}}{2} |
| **Exterior (Secantes)** | Exterior | Dos secantes | \alpha = \dfrac{m\widehat{AB} - m\widehat{CD}}{2} |
| **Exterior (Sec.-Tang.)** | Exterior | Una tangente y una secante | \alpha = \dfrac{m\widehat{TB} - m\widehat{TC}}{2} |
| **Exterior (Tangentes)** | Exterior | Dos tangentes | \alpha = \dfrac{m\widehat{AMB} - m\widehat{AB}}{2} = 180^\circ - m\widehat{AB} |

*Corolario Fundamental:* En el ángulo exterior formado por dos tangentes, la suma de su medida con la del arco menor correspondiente es siempre 180^\circ:
\alpha + m\widehat{AB} = 180^\circ

---

### 3.5. Teoremas de Poncelet, Pitot y Steiner

#### Teorema de Poncelet
En todo triángulo rectángulo, la suma de las longitudes de los catetos es igual a la longitud de la hipotenusa más el doble del inradio (diámetro de la circunferencia inscrita).
a + b = c + 2r
*Demostración resumida:* Se basa en la descomposición de los catetos en segmentos tangentes desde los vértices: cateto a = r + (a-r), cateto b = r + (b-r). La hipotenusa c = (a-r) + (b-r) = a + b - 2r \implies a + b = c + 2r.

#### Teorema de Pitot
En todo cuadrilátero circunscrito a una circunferencia (o cuadrilátero tangencial), la suma de las longitudes de dos lados opuestos es igual a la suma de los otros dos lados opuestos.
AB + CD = BC + AD
*Condición necesaria y suficiente:* Un cuadrilátero convexo admite circunferencia inscrita si y solo si cumple el Teorema de Pitot.

#### Teorema de Steiner
En todo cuadrilátero exinscrito a una circunferencia, la diferencia de las longitudes de los lados opuestos es igual.
|AB - CD| = |AD - BC|

---

### 3.6. Cuadriláteros Inscritos e Inscriptibles

Un cuadrilátero es **inscrito** si sus cuatro vértices pertenecen a una misma circunferencia.  
Es **inscriptible** si por sus cuatro vértices es posible hacer pasar una circunferencia.

#### Condiciones de Inscriptibilidad (Criterios Sí y Solo Sí):
1. **Ángulos Opuestos Suplementarios:** Un cuadrilátero convexo es inscriptible si y solo si sus ángulos opuestos suman 180^\circ.
   \alpha + \theta = 180^\circ
2. **Ángulo Exterior igual al Interior Opuesto:** Un cuadrilátero es inscriptible si un ángulo exterior es congruente con el ángulo interior opuesto.
3. **Propiedad de las Diagonales ("Efecto Mariposa" o "Rebote"):** El ángulo formado por una diagonal y un lado es congruente con el ángulo formado por la otra diagonal y el lado opuesto.
   \angle BAC \cong \angle BDC
4. **Cuadriláteros Inscriptibles Notables:**
   - Todo rectángulo es inscriptible.
   - Todo trapecio isósceles es inscriptible.
   - Todo cuadrado es inscriptible.
   - Todo cuadrilátero con dos ángulos opuestos rectos (90^\circ + 90^\circ = 180^\circ) es inscriptible.

---

### 3.7. Relaciones Métricas en la Circunferencia
1. **Teorema de las Cuerdas:** Si dos cuerdas \overline{AB} y \overline{CD} se intersecan en un punto interior P:
   PA \cdot PB = PC \cdot PD
2. **Teorema de las Secantes:** Si desde un punto exterior P se trazan dos secantes P-A-B y P-C-D:
   PA \cdot PB = PC \cdot PD \quad (\text{parte externa} \times \text{total})
3. **Teorema de la Tangente:** Si desde un punto exterior P se traza la tangente \overline{PT} (T punto de contacto) y una secante P-A-B:
   PT^2 = PA \cdot PB

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Poncelet Generalizado** | a + b = c + 2(r + r_e) | Válido en configuraciones mixtas |
| **Teorema de Pitot** | a + c = b + d | Cuadrilátero circunscrito convexo |
| **Teorema de Steiner** | a - c = b - d | Cuadrilátero exinscrito |
| **Teorema de Cuerdas** | x \cdot y = u \cdot v | Segmentos determinados en el punto de cruce |
| **Teorema de Secantes** | e_1 \cdot T_1 = e_2 \cdot T_2 | e_i: parte exterior, T_i: secante total |
| **Teorema de la Tangente**| x^2 = e \cdot T | x: segmento tangente, e: externo, T: total |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Trazar el Radio al Punto de Tangencia (El Trazo Obligado)
En el 90% de los problemas de examen donde aparezca una recta tangente o una circunferencia inscrita/tangente a una recta, **el trazo auxiliar automático e inexcusable** es trazar el radio desde el centro hacia el punto de tangencia.
- Esto genera un ángulo de 90^\circ.
- Transforma de inmediato el problema en un triángulo rectángulo donde se aplican razones trigonométricas, semejanza o Teorema de Pitágoras.

### Hack 2: Unión de Centros en Circunferencias Tangentes
Cuando dos circunferencias son tangentes (exteriores o interiores), el segmento que une sus centros **pasa obligatoriamente por el punto de tangencia**.
- La distancia entre centros es R + r (tangentes exteriores) o R - r (tangentes interiores).
- Al unir los centros, se forma una línea recta continua de longitud conocida, ideal para trazar alturas y formar triángulos rectángulos.

### Hack 3: Ángulo Inscrito en una Semicircunferencia
Siempre que veas un diámetro AB y un punto P en la semicircunferencia, traza \overline{AP} y \overline{BP}. El ángulo \angle APB es **siempre de 90^\circ** porque subtiende un arco de 180^\circ. ¡Es una fábrica instantánea de triángulos rectángulos y alturas!

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia de los Teoremas de Contacto: "PON-CATO y PI-TOPO"
- **PON-CATO (Poncelet):**  
  **PON**celet = **CAT**etos suman **O**tra cosa: \text{Cateto}_1 + \text{Cateto}_2 = \text{Hipotenusa} + 2r.
- **PI-TOPO (Pitot):**  
  **PI**tot = **OP**uestos suman igual (**TO**dos los **OP**uestos: arriba + abajo = izquierda + derecha).

### 2. Mnemotecnia para Ángulos Circulares: "IN-MITAD, INT-PROMEDIO, EXT-DIFERENCIA"
- **IN**scrito \to la **MITAD** del arco (\frac{\text{arco}}{2}).
- **INT**erior \to la **SEMISUMA** o promedio de los arcos (\frac{\text{arco}_1 + \text{arco}_2}{2}).
- **EXT**erior \to la **SEMIDIFERENCIA** (\frac{\text{arco Mayor} - \text{arco Menor}}{2}).

### 3. Mnemotecnia de Inscriptibilidad: "BOING-BOING (El Rebote)"
- Si ves una cruz de diagonales dentro de un cuadrilátero, el ángulo de la base "rebota" en la pared superior y cae en la base opuesta: si \angle 1 = \angle 2, ¡el cuadrilátero es inscriptible al instante!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Cuadrilátero Inscrito con Circunscrito**
> - **Inscrito (Inscriptible):** Los vértices tocan la circunferencia. Cumple ángulos opuestos suplementarios (180^\circ) y rebote de diagonales. **NO cumple Pitot**.
> - **Circunscrito:** Los lados son tangentes a la circunferencia. Cumple el **Teorema de Pitot** (a+c = b+d). **NO necesariamente tiene ángulos opuestos suplementarios** a menos que sea bicéntrico.

> [!CAUTION]
> **Trampa 2: La Sagita y el Radio**
> La sagita (flecha) h es solo el pedacito entre la cuerda y el arco. El radio completo es R. El segmento del centro a la cuerda mide R - h. Muchos postulantes confunden la sagita con la distancia del centro a la cuerda y erran en Pitágoras:
> (R - h)^2 + \left(\frac{L_{\text{cuerda}}}{2}\right)^2 = R^2

> [!WARNING]
> **Trampa 3: Signo en el Teorema de la Secante**
> En el teorema de las secantes, es **parte externa por TOTAL**, NO parte externa por parte interna:
> \text{CORRECTO: } PA \cdot PB \quad (PB = PA + AB)
> \text{ERROR FATAL: } PA \cdot AB

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Ingeniería Mecánica y Engranajes:** La relación entre poleas, correas de transmisión y engranajes planetarios depende del radio y los puntos de contacto tangenciales, garantizando relaciones de transmisión constantes sin deslizamiento angular.
2. **Arquitectura y Bóvedas:** Los arcos góticos, de medio punto y peraltados son combinaciones de arcos de circunferencias secantes y tangentes cuyos centros determinan la distribución de cargas de empuje hacia las columnas.
3. **Sistemas de Posicionamiento Global (GPS y Triangulación):** La localización de un teléfono móvil se basa en la intersección de circunferencias generadas por la distancia (tiempo de viaje de la señal por la velocidad de la luz) a tres antenas transmisoras base.

---

## Circunferencia inscrita y circunscrita

La circunferencia inscrita en un triángulo es tangente a sus tres lados. Su centro es el incentro, intersección de bisectrices, y su radio r es la distancia perpendicular del centro a cada lado. Si A es el área y s el semiperímetro, A = rs.

La circunferencia circunscrita pasa por los tres vértices. Su centro es el circuncentro, intersección de mediatrices; su radio R cumple A = abc/(4R). El circuncentro puede quedar dentro, sobre un lado o fuera del triángulo; el incentro siempre es interior. En un triángulo rectángulo, el circuncentro es el punto medio de la hipotenusa y R es la mitad de ella.
