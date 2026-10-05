## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
     x = 90^\circ + \frac{\theta}{2}
   - Ángulo formado por dos bisectrices exteriores:
     x = 90^\circ - \frac{\theta}{2}
   - Ángulo formado por una bisectriz interior y una exterior:
     x = \frac{\theta}{2}
5. **Mediatriz:** Recta coplanar perpendicular a un lado en su punto medio (no necesariamente pasa por el vértice opuesto).

---

### 3.4. Congruencia de Triángulos (\cong)
Dos triángulos son **congruentes** si sus tres lados correspondientes y sus tres ángulos correspondientes son respectivamente congruentes (tienen igual forma e igual tamaño):

\triangle ABC \cong \triangle DEF \iff \begin{cases} AB = DE, \ BC = EF, \ CA = FD \\ \angle A \cong \angle D, \ \angle B \cong \angle E, \ \angle C \cong \angle F \end{cases}

#### Criterios de Congruencia (Casos Fundamentales):
1. **Caso LAL (Lado - Ángulo - Lado):** Dos lados y el ángulo comprendido entre ellos respectivamente congruentes.
2. **Caso ALA (Ángulo - Lado - Ángulo):** Un lado y los dos ángulos adyacentes a él respectivamente congruentes.
3. **Caso LLL (Lado - Lado - Lado):** Los tres lados respectivamente congruentes.
4. **Caso LLA (Lado - Lado - Ángulo Mayor):** Dos lados y el ángulo opuesto al mayor de ellos respectivamente congruentes.

#### Teoremas Clásicos Derivados de la Congruencia:

#### 1. Teorema de la Bisectriz:
Todo punto de la bisectriz de un ángulo equidista de los lados de dicho ángulo:
P \in \text{Bisectriz} \implies PA = PB \quad \land \quad OA = OB

#### 2. Teorema de la Mediatriz:
Todo punto de la mediatriz de un segmento equidista de los extremos de dicho segmento:
P \in \text{Mediatriz}(\overline{AB}) \implies PA = PB \quad (\triangle APB \text{ es isósceles})

#### 3. Teorema de los Puntos Medios y la Base Media:
El segmento que une los puntos medios de dos lados de un triángulo es paralelo al tercer lado y su longitud es la mitad de dicho lado:
MN \parallel AC \quad \land \quad \mathbf{MN = \frac{AC}{2}}

#### 4. Teorema de la Mediana Relativa a la Hipotenusa:
En todo triángulo rectángulo, la longitud de la mediana relativa a la hipotenusa es igual a la mitad de la longitud de la hipotenusa:
\mathbf{BM = \frac{AC}{2} = AM = MC}
*(Determina dos triángulos isósceles interiores: \triangle ABM y \triangle CBM).*

---

### 3.5. Semejanza de Triángulos (\sim)
Dos triángulos son **semejantes** si tienen sus tres ángulos correspondientes de igual medida y sus lados homólogos (los que se oponen a ángulos iguales) son proporcionales:

\triangle ABC \sim \triangle A'B'C' \iff \frac{a}{a'} = \frac{b}{b'} = \frac{c}{c'} = \frac{h}{h'} = \frac{2p}{2p'} = k
Donde k es la **razón de semejanza**.

#### Criterios de Semejanza:
1. **Primer Criterio (Ángulo - Ángulo, AA):** Si dos triángulos tienen dos pares de ángulos interiores de igual medida, entonces son semejantes.
2. **Segundo Criterio (LAL):** Si tienen un ángulo congruente comprendido entre lados homólogos proporcionales.
3. **Tercer Criterio (LLL):** Si sus tres pares de lados homólogos son proporcionales.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Interior y Exterior** | x = \frac{\theta}{2} | Bisectriz interior y exterior cruzadas |
| **Base Media** | MN = \frac{AC}{2} \quad \land \quad MN \parallel AC | M, N puntos medios |
| **Mediana a la Hipotenusa** | BM = \frac{AC}{2} | Exclusivo de triángulos rectángulos |
| **Semejanza Básica** | \frac{a}{a'} = \frac{b}{b'} = \frac{h}{h'} = k | Triángulos con ángulos congruentes |
| **Teorema del Boomerang** | x = \alpha + \beta + \theta | Cuadrilátero cóncavo |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: El Trazo Auxiliar de la Mediana en el Triángulo Rectángulo
Cuando veas un triángulo rectángulo con un ángulo notable de 15^\circ o 75^\circ, o cuando conozcas el doble de un ángulo (\alpha y 2\alpha):
**¡No uses trigonometría engorrosa de ángulos compuestos!**
**Hack:** Traza la mediana relativa a la hipotenusa. Como BM = MC, el triángulo \triangle BMC es isósceles con ángulo en la base \alpha.
Por ángulo exterior, el ángulo \angle AMB mide exactamente **2\alpha**, transformando el problema en un triángulo isósceles o notable directo.

### Artificio 2: Identificación Relámpago de Semejanza por Ángulos Complementarios
En triángulos rectángulos donde se traza la altura relativa a la hipotenusa:
**Hack:** Nombra los ángulos agudos como \alpha y \beta (con \alpha + \beta = 90^\circ).
Al rotar por los vértices, los tres triángulos rectángulos formados (el total y los dos parciales) tienen exactamente los mismos ángulos \alpha y \beta.
Aplica semejanza de inmediato: \frac{\text{cateto opuesto a } \alpha}{\text{hipotenusa}}.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Triángulo Rectángulo y su Mediana: "La Triple M"
> **"Mediana a la hipotenusa \to Mide la Mitad."**
- Al trazar la mediana desde el ángulo recto: los tres segmentos resultantes son gemelos exactos:
  AM = MC = BM
- ¡Aparecen dos triángulos isósceles de inmediato!

### 2. Ángulos entre Bisectrices: "Interior Suma, Exterior Resta"
- Entre dos bisectrices **interiores**: vas hacia adentro \to **90^\circ + \frac{\theta}{2}**.
- Entre dos bisectrices **exteriores**: vas hacia afuera \to **90^\circ - \frac{\theta}{2}**.
- Una interior y una exterior: la mitad exacta: **\frac{\theta}{2}**.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Olvidar la Existencia Triangular al Calcular Valores Enteros**
> En un triángulo isósceles con lados 4\text{ cm} y 9\text{ cm}, ¿cuánto mide el tercer lado?
> El postulante dice: *"Puede ser 4 o 9"*.
> **¡ERROR!** Si el tercer lado fuera 4:
> Suma de lados menores: 4 + 4 = 8 < 9. ¡El triángulo no se cierra, viola la existencia triangular!
> El tercer lado debe ser obligatoriamente 9\text{ cm} (9 - 4 < 9 < 9 + 4).

> [!CAUTION]
> **Trampa 2: Lados Homólogos Desalineados en Semejanza**
> En \triangle ABC \sim \triangle PQR, muchos alumnos dividen lado izquierdo entre lado izquierdo.
> **Regla de oro:** Los lados homólogos no se eligen por su posición visual, sino **por el ángulo al cual se oponen**. El lado que se opone a \alpha en el primer triángulo se divide estrictamente entre el lado que se opone a \alpha en el segundo triángulo.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Estructuras de Techumbre y Tijerales Reticulares en Arquitectura Arequipeña
En las naves industriales y hangares del Parque Industrial de Arequipa, las estructuras de soporte de techos utilizan cerchas metálicas triangulares (armaduras tipo Pratt o Howe). La rigidez mecánica indeformable del triángulo (propiedad que no poseen los cuadriláteros) garantiza que la estructura soporte cargas de nieve y sismos sin colapsar. Los ingenieros estructurales de la UNSA aplican el criterio de congruencia LLL y el teorema de la base media para calcular la longitud exacta de las barras de arriostramiento diagonal y minimizar el peso total de acero empleado.

---
