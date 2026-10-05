## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Estática es la rama de la mecánica clásica que estudia las condiciones físicas y matemáticas necesarias que deben satisfacer los sistemas de fuerzas que actúan sobre cuerpos materiales o estructuras mecánicas para mantenerlos en estado de **equilibrio mecánico** (ausencia de aceleración lineal y angular):
1. **Concepto de Equilibrio Mecánico:** Estado en el cual una partícula o cuerpo rígido no acelera. Se clasifica en equilibrio estático (reposo absoluto: \vec{v} = \vec{0}, \vec{a} = \vec{0}) y equilibrio cinético (traslación rectilínea uniforme: \vec{v} = \text{cte} \ne \vec{0}, \vec{a} = \vec{0}).
2. **Primera Condición de Equilibrio (Equilibrio de Traslación):** La suma vectorial de todas las fuerzas externas concurrentes o no concurrentes que actúan sobre el sistema debe ser rigurosamente igual al vector nulo:
   \sum \vec{F}_{\text{ext}} = \vec{0} \iff \sum F_x = 0, \quad \sum F_y = 0, \quad \sum F_z = 0
   - En el plano, se traduce geométricamente en el método del polígono cerrado de fuerzas y analíticamente en el **Teorema de Lamy** para tres fuerzas concurrentes y coplanares.
3. **Momento de una Fuerza o Torque (\vec{\tau} o \vec{M}_O^{\vec{F}}):** Magnitud física vectorial que cuantifica la capacidad o tendencia de una fuerza para producir una rotación de un cuerpo rígido alrededor de un eje o punto de giro:
   \vec{\tau}_O = \vec{r} \times \vec{F} \implies |\tau_O| = F \cdot d
   Donde d es el brazo de palanca (distancia perpendicular desde el centro de momentos a la línea de acción de la fuerza). Convención de signos: antihorario positivo (+) y horario negativo (-).
4. **Segunda Condición de Equilibrio (Equilibrio de Rotación):** La suma vectorial de los momentos de todas las fuerzas externas respecto a cualquier punto arbitrario del espacio debe ser igual al vector nulo:
   \sum \vec{\tau}_O = \vec{0} \iff \sum \tau_{(\text{antihorario})} = \sum \tau_{(\text{horario})}
5. **Centro de Gravedad (CG) y Centro de Masa (CM):** Punto geométrico donde se considera concentrado el peso total de un cuerpo o sistema de partículas. En campos gravitatorios uniformes, el CG coincide estrictamente con el CM.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. CONDICIONES DE EQUILIBRIO Y DIAGRAMA DE CUERPO LIBRE

Un cuerpo se encuentra en equilibrio mecánico cuando su estado cinemático de movimiento no experimenta aceleración alguna respecto a un sistema de referencia inercial:
\vec{a}_{\text{lineal}} = \vec{0}, \quad \vec{\alpha}_{\text{angular}} = \vec{0}

#### A. Fuerzas Interiores vs. Fuerzas Exteriores
- **Fuerzas Interiores:** Fuerzas de cohesión mutua entre las partículas que componen el cuerpo. Por la Tercera Ley de Newton, se presentan por pares de acción y reacción opuestos y su suma vectorial total es idénticamente nula (\sum \vec{F}_{\text{int}} = \vec{0}). **No alteran el estado de equilibrio global del cuerpo.**
- **Fuerzas Exteriores:** Fuerzas ejercidas por agentes externos sobre el sistema analizado (peso, normales, tensiones externas, fricción de apoyo). Solo las fuerzas exteriores intervienen en las condiciones de equilibrio.

#### B. Primera Condición de Equilibrio (Equilibrio de Traslación)
Garantiza que el centro de masa del cuerpo no experimente aceleración lineal (d\vec{v}_{CM}/dt = \vec{0}):
\vec{F}_R = \sum_{i=1}^{n} \vec{F}_i = \vec{0}
En el plano cartesiano XY, equivale a dos ecuaciones escalares independientes:
\sum F_x = 0 \iff \sum F_{(\to)} = \sum F_{(\leftarrow)}
\sum F_y = 0 \iff \sum F_{(\uparrow)} = \sum F_{(\downarrow)}

#### C. Métodos para Tres Fuerzas Coplanares Concurrentes
Cuando un cuerpo en equilibrio está sometido a la acción de solo tres fuerzas coplanares no paralelas, sus líneas de acción **deben ser obligatoriamente concurrentes** (concurren en un único punto común O) o paralelas:
1. **Triángulo de Fuerzas (Polígono Cerrado):**
   Las tres fuerzas forman un triángulo vectorial cerrado con orientación continua:
   \vec{F}_1 + \vec{F}_2 + \vec{F}_3 = \vec{0}
2. **Teorema de Lamy:**
   Si tres fuerzas coplanares y concurrentes mantienen a una partícula en equilibrio estático, el módulo de cada fuerza es directamente proporcional al seno del ángulo opuesto comprendido entre las otras dos:
   \frac{F_1}{\sin\alpha} = \frac{F_2}{\sin\beta} = \frac{F_3}{\sin\gamma}
   Donde \alpha es el ángulo opuesto a \vec{F}_1, \beta a \vec{F}_2 y \gamma a \vec{F}_3 (\alpha + \beta + \gamma = 360^\circ).

---

### 2.2. MOMENTO DE UNA FUERZA (TORQUE)

El **momento de una fuerza** respecto a un punto O (centro de momentos o pivote) mide la eficacia o tendencia de dicha fuerza para provocar un giro o rotación del cuerpo alrededor de un eje perpendicular al plano que pasa por O:

#### A. Definición Vectorial
\vec{\tau}_O = \vec{r} \times \vec{F}
Donde \vec{r} es el vector de posición que va desde el centro de momentos O hasta el punto de aplicación de la fuerza \vec{F}.
- Es un vector ortogonal al plano formado por \vec{r} y \vec{F}, cuyo sentido sigue la **regla de la mano derecha**.
- Unidad en el SI: **newton-metro (\text{N}\cdot\text{m})**. *(¡Atención! Aunque dimensionalmente coincide con el joule (ML^2T^{-2}), el torque jamás se expresa en joules para distinguirlo del trabajo mecánico o energía).*

#### B. Módulo y Regla del Brazo de Palanca
|\vec{\tau}_O| = r \cdot F \sin\theta = F \cdot d
Donde:
- \theta es el ángulo entre el vector posición \vec{r} y la fuerza \vec{F}.
- d = r \sin\theta es el **brazo de palanca**: la distancia perpendicular trazada desde el centro de momentos O hasta la línea de acción de la fuerza \vec{F}.

#### C. Casos Notables
- Si la línea de acción de la fuerza pasa por el centro de momentos O (d = 0):
  \tau_O = 0 \quad (\text{La fuerza no produce rotación})
- Si la fuerza es perpendicular al vector posición (\theta = 90^\circ):

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES Y LEYES DE LA ESTÁTICA

1. **Primera Condición de Equilibrio (Traslación):**
   \sum \vec{F} = \vec{0} \implies \begin{cases} \sum F_x = 0 \\ \sum F_y = 0 \end{cases}

2. **Segunda Condición de Equilibrio (Rotación):**
   \sum \vec{\tau}_O = \vec{0} \implies \sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}

3. **Módulo del Torque:**
   \tau_O = F \cdot d = F \cdot r \sin\theta
