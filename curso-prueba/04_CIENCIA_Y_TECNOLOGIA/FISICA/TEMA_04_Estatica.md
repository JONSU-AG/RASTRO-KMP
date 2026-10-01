# TEMA 04: ESTÁTICA

---

## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Estática es la rama de la mecánica clásica que estudia las condiciones físicas y matemáticas necesarias que deben satisfacer los sistemas de fuerzas que actúan sobre cuerpos materiales o estructuras mecánicas para mantenerlos en estado de **equilibrio mecánico** (ausencia de aceleración lineal y angular):
1. **Concepto de Equilibrio Mecánico:** Estado en el cual una partícula o cuerpo rígido no acelera. Se clasifica en equilibrio estático (reposo absoluto: $\vec{v} = \vec{0}, \vec{a} = \vec{0}$) y equilibrio cinético (traslación rectilínea uniforme: $\vec{v} = \text{cte} \ne \vec{0}, \vec{a} = \vec{0}$).
2. **Primera Condición de Equilibrio (Equilibrio de Traslación):** La suma vectorial de todas las fuerzas externas concurrentes o no concurrentes que actúan sobre el sistema debe ser rigurosamente igual al vector nulo:
   $$\sum \vec{F}_{\text{ext}} = \vec{0} \iff \sum F_x = 0, \quad \sum F_y = 0, \quad \sum F_z = 0$$
   - En el plano, se traduce geométricamente en el método del polígono cerrado de fuerzas y analíticamente en el **Teorema de Lamy** para tres fuerzas concurrentes y coplanares.
3. **Momento de una Fuerza o Torque ($\vec{\tau}$ o $\vec{M}_O^{\vec{F}}$):** Magnitud física vectorial que cuantifica la capacidad o tendencia de una fuerza para producir una rotación de un cuerpo rígido alrededor de un eje o punto de giro:
   $$\vec{\tau}_O = \vec{r} \times \vec{F} \implies |\tau_O| = F \cdot d$$
   Donde $d$ es el brazo de palanca (distancia perpendicular desde el centro de momentos a la línea de acción de la fuerza). Convención de signos: antihorario positivo ($+$) y horario negativo ($-$).
4. **Segunda Condición de Equilibrio (Equilibrio de Rotación):** La suma vectorial de los momentos de todas las fuerzas externas respecto a cualquier punto arbitrario del espacio debe ser igual al vector nulo:
   $$\sum \vec{\tau}_O = \vec{0} \iff \sum \tau_{(\text{antihorario})} = \sum \tau_{(\text{horario})}$$
5. **Centro de Gravedad ($CG$) y Centro de Masa ($CM$):** Punto geométrico donde se considera concentrado el peso total de un cuerpo o sistema de partículas. En campos gravitatorios uniformes, el $CG$ coincide estrictamente con el $CM$.

---

## 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. CONDICIONES DE EQUILIBRIO Y DIAGRAMA DE CUERPO LIBRE

Un cuerpo se encuentra en equilibrio mecánico cuando su estado cinemático de movimiento no experimenta aceleración alguna respecto a un sistema de referencia inercial:
$$\vec{a}_{\text{lineal}} = \vec{0}, \quad \vec{\alpha}_{\text{angular}} = \vec{0}$$

#### A. Fuerzas Interiores vs. Fuerzas Exteriores
- **Fuerzas Interiores:** Fuerzas de cohesión mutua entre las partículas que componen el cuerpo. Por la Tercera Ley de Newton, se presentan por pares de acción y reacción opuestos y su suma vectorial total es idénticamente nula ($\sum \vec{F}_{\text{int}} = \vec{0}$). **No alteran el estado de equilibrio global del cuerpo.**
- **Fuerzas Exteriores:** Fuerzas ejercidas por agentes externos sobre el sistema analizado (peso, normales, tensiones externas, fricción de apoyo). Solo las fuerzas exteriores intervienen en las condiciones de equilibrio.

#### B. Primera Condición de Equilibrio (Equilibrio de Traslación)
Garantiza que el centro de masa del cuerpo no experimente aceleración lineal ($d\vec{v}_{CM}/dt = \vec{0}$):
$$\vec{F}_R = \sum_{i=1}^{n} \vec{F}_i = \vec{0}$$
En el plano cartesiano $XY$, equivale a dos ecuaciones escalares independientes:
$$\sum F_x = 0 \iff \sum F_{(\to)} = \sum F_{(\leftarrow)}$$
$$\sum F_y = 0 \iff \sum F_{(\uparrow)} = \sum F_{(\downarrow)}$$

#### C. Métodos para Tres Fuerzas Coplanares Concurrentes
Cuando un cuerpo en equilibrio está sometido a la acción de solo tres fuerzas coplanares no paralelas, sus líneas de acción **deben ser obligatoriamente concurrentes** (concurren en un único punto común $O$) o paralelas:
1. **Triángulo de Fuerzas (Polígono Cerrado):**
   Las tres fuerzas forman un triángulo vectorial cerrado con orientación continua:
   $$\vec{F}_1 + \vec{F}_2 + \vec{F}_3 = \vec{0}$$
2. **Teorema de Lamy:**
   Si tres fuerzas coplanares y concurrentes mantienen a una partícula en equilibrio estático, el módulo de cada fuerza es directamente proporcional al seno del ángulo opuesto comprendido entre las otras dos:
   $$\frac{F_1}{\sin\alpha} = \frac{F_2}{\sin\beta} = \frac{F_3}{\sin\gamma}$$
   Donde $\alpha$ es el ángulo opuesto a $\vec{F}_1$, $\beta$ a $\vec{F}_2$ y $\gamma$ a $\vec{F}_3$ ($\alpha + \beta + \gamma = 360^\circ$).

---

### 2.2. MOMENTO DE UNA FUERZA (TORQUE)

El **momento de una fuerza** respecto a un punto $O$ (centro de momentos o pivote) mide la eficacia o tendencia de dicha fuerza para provocar un giro o rotación del cuerpo alrededor de un eje perpendicular al plano que pasa por $O$:

#### A. Definición Vectorial
$$\vec{\tau}_O = \vec{r} \times \vec{F}$$
Donde $\vec{r}$ es el vector de posición que va desde el centro de momentos $O$ hasta el punto de aplicación de la fuerza $\vec{F}$.
- Es un vector ortogonal al plano formado por $\vec{r}$ y $\vec{F}$, cuyo sentido sigue la **regla de la mano derecha**.
- Unidad en el SI: **newton-metro ($\text{N}\cdot\text{m}$)**. *(¡Atención! Aunque dimensionalmente coincide con el joule ($ML^2T^{-2}$), el torque jamás se expresa en joules para distinguirlo del trabajo mecánico o energía).*

#### B. Módulo y Regla del Brazo de Palanca
$$|\vec{\tau}_O| = r \cdot F \sin\theta = F \cdot d$$
Donde:
- $\theta$ es el ángulo entre el vector posición $\vec{r}$ y la fuerza $\vec{F}$.
- $d = r \sin\theta$ es el **brazo de palanca**: la distancia perpendicular trazada desde el centro de momentos $O$ hasta la línea de acción de la fuerza $\vec{F}$.

#### C. Casos Notables
- Si la línea de acción de la fuerza pasa por el centro de momentos $O$ ($d = 0$):
  $$\tau_O = 0 \quad (\text{La fuerza no produce rotación})$$
- Si la fuerza es perpendicular al vector posición ($\theta = 90^\circ$):
  $$\tau_O = F \cdot r \quad (\text{Eficacia de giro máxima})$$

#### D. Convención de Signos Escalar en el Plano
- **Sentido Antihorario (levógiro):** Signo positivo ($+$), vector saliendo del plano ($\odot$).
- **Sentido Horario (dextrógiro):** Signo negativo ($-$), vector entrando al plano ($\otimes$).

#### E. Teorema de Varignon
*"El momento resultante respecto a un punto $O$ producido por un sistema de fuerzas concurrentes es igual a la suma algebraica de los momentos producidos individualmente por cada una de las fuerzas componentes respecto al mismo punto $O$."*
$$\vec{\tau}_O^{\vec{F}_R} = \sum_{i=1}^{n} \vec{\tau}_O^{\vec{F}_i} = \vec{\tau}_O^{\vec{F}_1} + \vec{\tau}_O^{\vec{F}_2} + \dots + \vec{\tau}_O^{\vec{F}_n}$$

---

### 2.3. SEGUNDA CONDICIÓN DE EQUILIBRIO (EQUILIBRIO DE ROTACIÓN)

Para que un cuerpo rígido extenso no experimente aceleración angular ($\vec{\alpha} = \vec{0}$) y se encuentre en equilibrio de rotación, la suma vectorial de los momentos de todas las fuerzas externas respecto a cualquier punto arbitrario $O$ debe ser cero:
$$\sum \vec{\tau}_O = \vec{0}$$
En términos escalares coplanares:
$$\sum \tau_O = 0 \iff \sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}$$
*Estrategia fundamental preuniversitaria:* Conviene ubicar el centro de momentos $O$ en el punto de aplicación de una o más fuerzas incógnitas desconocidas (como reacciones en articulaciones o apoyos) para que su brazo de palanca sea nulo ($d = 0$) y se anulen sus momentos, simplificando la ecuación a una sola incógnita.

---

### 2.4. CUPLA O PAR DE FUERZAS

Sistema formado por dos fuerzas $\vec{F}$ y $-\vec{F}$ de igual módulo, paralelas, de sentidos contrarios y con líneas de acción separadas por una distancia perpendicular $d$:
- Resultante de traslación nula: $\vec{F}_R = \vec{F} + (-\vec{F}) = \vec{0}$.
- **Momento del Par ($M_{\text{cupla}}$):**
  $$M_{\text{cupla}} = F \cdot d$$
  *Propiedad cardinal:* El momento de un par de fuerzas es un vector libre; **es constante e independiente del punto del espacio que se elija como centro de momentos**. Un par de fuerzas produce rotación pura sin traslación.

---

### 2.5. CENTRO DE MASA ($CM$) Y CENTRO DE GRAVEDAD ($CG$)

1. **Centro de Masa ($CM$):**
   Punto geométrico ponderado por las masas de las partículas de un sistema:
   $$\vec{r}_{CM} = \frac{\sum m_i \vec{r}_i}{\sum m_i} = \frac{m_1 \vec{r}_1 + m_2 \vec{r}_2 + \dots + m_n \vec{r}_n}{M_{\text{total}}}$$
   Coordenadas en el plano:
   $$x_{CM} = \frac{\sum m_i x_i}{\sum m_i}, \quad y_{CM} = \frac{\sum m_i y_i}{\sum m_i}$$
2. **Centro de Gravedad ($CG$):**
   Punto donde se considera aplicada la resultante de las fuerzas de atracción gravitatoria (peso total) que actúan sobre todos los elementos materiales de un cuerpo extenso.
   - En un campo gravitatorio constante y uniforme ($\vec{g} = \text{cte}$), el Centro de Gravedad coincide exactamente con el Centro de Masa ($CG \equiv CM$).
   - Para cuerpos homogéneos simétricos (varilla, cilindro, esfera, disco, cubo), el $CG$ se ubica en su centro geométrico o centroide de simetría.
3. **Tipos de Equilibrio Estático de un Cuerpo Apoyado:**
   - **Estable:** Si ante una pequeña perturbación o inclinación angular, el torque del peso restituye al cuerpo a su posición original de reposo (el $CG$ se eleva al perturbarlo).
   - **Inestable:** Si ante una mínima perturbación, el torque del peso tiende a apartarlo aún más de su posición de equilibrio provocando el vuelco (el $CG$ desciende al perturbarlo).
   - **Indiferente o Neutro:** Si ante cualquier desplazamiento, el cuerpo permanece en equilibrio en su nueva posición (la altura del $CG$ no varía; ej. una esfera sobre un plano horizontal).

---

## 3. FÓRMULAS FUNDAMENTALES Y LEYES DE LA ESTÁTICA

1. **Primera Condición de Equilibrio (Traslación):**
   $$\sum \vec{F} = \vec{0} \implies \begin{cases} \sum F_x = 0 \\ \sum F_y = 0 \end{cases}$$

2. **Segunda Condición de Equilibrio (Rotación):**
   $$\sum \vec{\tau}_O = \vec{0} \implies \sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}$$

3. **Módulo del Torque:**
   $$\tau_O = F \cdot d = F \cdot r \sin\theta$$

4. **Teorema de Lamy:**
   $$\frac{F_1}{\sin\alpha} = \frac{F_2}{\sin\beta} = \frac{F_3}{\sin\gamma}$$

5. **Coordenadas del Centro de Masa:**
   $$x_{CM} = \frac{m_1 x_1 + m_2 x_2 + \dots + m_n x_n}{m_1 + m_2 + \dots + m_n}$$
   $$y_{CM} = \frac{m_1 y_1 + m_2 y_2 + \dots + m_n y_n}{m_1 + m_2 + \dots + m_n}$$

---

## 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Condiciones de Equilibrio:**
   > **"PRIMERA PARALIZA TRASLACIÓN, SEGUNDA FRENA ROTACIÓN"**
   - 1.ª Condición: $\sum \vec{F} = 0 \implies$ Cero aceleración lineal.
   - 2.ª Condición: $\sum \vec{\tau} = 0 \implies$ Cero aceleración angular.

2. **Brazo de Palanca:**
   > **"DISTANCIA PERPENDICULAR AL TIRO"**
   - El brazo de palanca $d$ no es la longitud de la barra, sino la distancia trazada **perpendicularmente** desde el pivote hasta la línea de acción de la fuerza.

3. **Teorema de Lamy:**
   > **"FUERZA SOBRE SENO DE SU FRENTE"**
   $$\frac{F}{\sin(\text{ángulo entre las otras dos})} = \text{cte}$$

---

## 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Fuerza en una Articulación o Bisagra Fija:** Jamás asumir a priori que la reacción en un apoyo articulado es perpendicular a la barra. Una articulación lisa ejerce una fuerza de dirección desconocida que siempre debe representarse mediante sus dos componentes rectangulares independientes: $R_x$ y $R_y$.
* **Barra Homogénea:** Si el problema dice *"barra homogénea y uniforme de longitud $L$"*, su peso propio $P = mg$ se ubica y dibuja estrictamente en su **punto medio geométrico ($L/2$)**. Si no es homogénea, el enunciado debe especificar la ubicación del centro de gravedad.
* **Elección Óptima del Pivote ($O$):** El error más común que consume tiempo es tomar momentos en un punto cualquiera. La regla de oro en admisión es: **tomar centro de momentos en el punto donde concurre el mayor número de fuerzas incógnitas que no nos interesa calcular** (habitualmente la articulación de apoyo), eliminándolas de la ecuación.
* **Unidades del Torque vs. Trabajo:** Pregunta recurrente: *"¿Se puede medir el torque en Joules?"* **¡NO!** El torque se mide en $\text{N}\cdot\text{m}$, jamás en joules, porque no es una transferencia escalar de energía sino un vector de rotación.
* **Cuerpo Apoyado a punto de Volcar:** En problemas donde un bloque o vehículo está a punto de volcarse alrededor de una arista, la fuerza normal y el rozamiento del piso se concentran **íntegramente en la arista de vuelco**, anulándose la normal en el resto de la base.

---

## 6. PROBLEMAS RESUELTOS GRADUADOS

### Problema 1 (Nivel Básico: Primera Condición de Equilibrio y Cuerdas)
**Enunciado:** Un semáforo de $120\text{ N}$ de peso cuelga del punto de unión de dos cables ligeros e inextensibles fijados al techo. El cable 1 forma un ángulo de $37^\circ$ con la horizontal y el cable 2 forma un ángulo de $53^\circ$ con la horizontal. Determine las tensiones $T_1$ y $T_2$ en dichos cables para mantener el sistema en equilibrio estático. ($\sin 37^\circ = 0.6, \cos 37^\circ = 0.8$).
A) $T_1 = 72\text{ N}$; $T_2 = 96\text{ N}$  
B) $T_1 = 60\text{ N}$; $T_2 = 80\text{ N}$  
C) $T_1 = 96\text{ N}$; $T_2 = 72\text{ N}$  
D) $T_1 = 80\text{ N}$; $T_2 = 100\text{ N}$  
E) $T_1 = 100\text{ N}$; $T_2 = 100\text{ N}$  

**Resolución:**
1. Realizamos el DCL en el nudo de unión de los cables:
   - Tensión $\vec{T}_1$ formando $37^\circ$ con la horizontal (hacia arriba y a la izquierda).
   - Tensión $\vec{T}_2$ formando $53^\circ$ con la horizontal (hacia arriba y a la derecha).
   - Peso vertical hacia abajo: $P = 120\text{ N}$.
2. Dado que el ángulo entre ambos cables es $37^\circ + 53^\circ = 90^\circ$, las tres fuerzas forman un triángulo rectángulo cerrado:
   - La hipotenusa es el peso $P = 120\text{ N}$ vertical.
   - El cateto opuesto a $37^\circ$ es $T_1$:
     $$T_1 = P \cos 53^\circ = P \sin 37^\circ = (120\text{ N})(0.6) = 72\text{ N}$$
   - El cateto opuesto a $53^\circ$ es $T_2$:
     $$T_2 = P \cos 37^\circ = P \sin 53^\circ = (120\text{ N})(0.8) = 96\text{ N}$$
- Las tensiones son $T_1 = 72\text{ N}$ y $T_2 = 96\text{ N}$.  
**Respuesta:** A

---

### Problema 2 (Nivel Intermedio: Teorema de Lamy con Tres Fuerzas)
**Enunciado:** Una esfera lisa y homogénea de peso $P = 40\text{ N}$ descansa apoyada entre una pared vertical lisa y un plano inclinado liso que forma un ángulo de $30^\circ$ con la vertical. Determine el módulo de la fuerza de reacción que ejerce el plano inclinado sobre la esfera.
A) $40\text{ N}$  
B) $20\sqrt{3}\text{ N}$  
C) $\frac{80\sqrt{3}}{3}\text{ N}$  
D) $80\text{ N}$  
E) $40\sqrt{3}\text{ N}$  

**Resolución:**
1. Realizamos el DCL de la esfera en equilibrio:
   - Peso $\vec{P} = 40\text{ N}$ vertical hacia abajo.
   - Reacción de la pared vertical lisa $\vec{R}_1$: horizontal hacia la derecha ($\theta = 0^\circ$).
   - Reacción del plano inclinado liso $\vec{R}_2$: perpendicular al plano inclinado (forma un ángulo de $30^\circ$ con la horizontal, apuntando hacia arriba y hacia la izquierda).
2. Analizamos los ángulos comprendidos entre las líneas de acción de las tres fuerzas:
   - Entre $\vec{R}_1$ (horizontal derecha) y $\vec{P}$ (vertical abajo): ángulo de $90^\circ$.
   - Entre $\vec{R}_1$ y $\vec{R}_2$: como $\vec{R}_2$ tiene elevación de $30^\circ$ hacia la izquierda, el ángulo entre $\vec{R}_1$ y $\vec{R}_2$ es $180^\circ - 30^\circ = 150^\circ$.
   - Entre $\vec{P}$ y $\vec{R}_2$: ángulo de $90^\circ + 30^\circ = 120^\circ$.
3. Aplicamos el Teorema de Lamy:
   $$\frac{P}{\sin 150^\circ} = \frac{R_2}{\sin 90^\circ}$$
   Sabiendo que $\sin 150^\circ = \sin(180^\circ - 30^\circ) = \sin 30^\circ = \frac{1}{2}$ y $\sin 90^\circ = 1$:
   $$\frac{40}{1/2} = \frac{R_2}{1} \implies R_2 = 40 \times 2 = 80\text{ N}$$
**Respuesta:** D

---

### Problema 3 (Nivel Intermedio-Avanzado: Segunda Condición de Equilibrio en Palancas)
**Enunciado:** Una viga homogénea y uniforme de masa $M = 20\text{ kg}$ y longitud $L = 6\text{ m}$ está articulada en su extremo izquierdo $A$ a una pared vertical. La viga se mantiene en posición horizontal mediante un cable tensor fijado a su extremo derecho $B$, el cual forma un ángulo de $30^\circ$ con la viga. Si a una distancia de $4\text{ m}$ del punto $A$ se cuelga una carga puntual de masa $m = 10\text{ kg}$, determine la tensión en el cable tensor. ($g = 10\text{ m/s}^2$).
A) $200\text{ N}$  
B) $300\text{ N}$  
C) $\frac{1000}{3}\text{ N}$  
D) $400\text{ N}$  
E) $500\text{ N}$  

**Resolución:**
1. Identificamos las fuerzas que actúan sobre la viga:
   - Peso propio de la viga homogénea: $P_{\text{viga}} = Mg = (20)(10) = 200\text{ N}$, aplicado en su punto medio ($d_1 = 3\text{ m}$ desde $A$).
   - Peso de la carga colgada: $P_{\text{carga}} = mg = (10)(10) = 100\text{ N}$, aplicado a $d_2 = 4\text{ m}$ desde $A$.
   - Tensión $\vec{T}$ en el extremo $B$ ($d_3 = 6\text{ m}$ desde $A$), formando un ángulo de $30^\circ$ con la viga.
   - Reacción en la articulación $A$ ($\vec{R}_A$), cuyas componentes no conocemos.
2. Aplicamos la Segunda Condición de Equilibrio tomando centro de momentos en la articulación $A$ ($\sum \tau_A = 0$):
   $$\sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}$$
   - El momento antihorario es producido por la componente vertical de la tensión:
     $$\tau_T = T \sin(30^\circ) \times L = T (0.5) \times (6\text{ m}) = 3T$$
   - Los momentos horarios son producidos por los dos pesos verticales hacia abajo:
     $$\tau_{\text{pesos}} = P_{\text{viga}} \times (3\text{ m}) + P_{\text{carga}} \times (4\text{ m})$$
     $$\tau_{\text{pesos}} = (200\text{ N})(3\text{ m}) + (100\text{ N})(4\text{ m}) = 600 + 400 = 1000\text{ N}\cdot\text{m}$$
3. Igualamos ambos torques:
   $$3T = 1000 \implies T = \frac{1000}{3}\text{ N} \approx 333.3\text{ N}$$
**Respuesta:** C

---

### Problema 4 (Nivel Avanzado: Barra Apoyada con Rozamiento en el Suelo)
**Enunciado:** Una escalera homogénea y uniforme de longitud $L$ y peso $P = 100\text{ N}$ descansa apoyada contra una pared vertical perfectamente lisa y sobre un piso horizontal rugoso. La escalera forma un ángulo de $53^\circ$ con el piso horizontal. Si la escalera se encuentra a punto de resbalar (movimiento inminente), determine el coeficiente de rozamiento estático $\mu_s$ entre la escalera y el piso. ($\sin 53^\circ \approx 4/5$, $\cos 53^\circ \approx 3/5$).
A) $0.250$  
B) $0.375$  
C) $0.500$  
D) $0.625$  
E) $0.750$  

**Resolución:**
1. Realizamos el DCL de la escalera:
   - Extremo inferior en el piso ($A$):
     - Fuerza normal vertical hacia arriba: $N_A$.
     - Fuerza de rozamiento estático máxima horizontal hacia la derecha (evita el deslizamiento): $f_s = \mu_s N_A$.
   - Extremo superior en la pared lisa ($B$):
     - Reacción normal horizontal hacia la izquierda: $N_B$ (pared lisa $\implies$ no hay rozamiento vertical).
   - Centro de gravedad en el punto medio ($L/2$):
     - Peso vertical hacia abajo: $P = 100\text{ N}$.
2. Aplicamos la Primera Condición de Equilibrio:
   - Eje vertical:
     $$\sum F_y = 0 \implies N_A = P = 100\text{ N}$$
   - Eje horizontal:
     $$\sum F_x = 0 \implies N_B = f_s = \mu_s N_A = 100 \mu_s \quad \text{--- (Ecuación 1)}$$
3. Aplicamos la Segunda Condición de Equilibrio tomando momentos en el punto de contacto con el suelo $A$ ($\sum \tau_A = 0$):
   $$\sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}$$
   - Momento antihorario producido por $N_B$:
     $$\tau_{N_B} = N_B \times (L \sin 53^\circ) = N_B \times L \left(\frac{4}{5}\right)$$
   - Momento horario producido por el peso $P$:
     $$\tau_P = P \times \left(\frac{L}{2} \cos 53^\circ\right) = 100 \times \frac{L}{2} \left(\frac{3}{5}\right) = 30L$$
4. Igualamos los momentos:
   $$N_B \times L \left(\frac{4}{5}\right) = 30L \implies \frac{4}{5} N_B = 30 \implies N_B = \frac{150}{4} = 37.5\text{ N}$$
5. Igualamos con la Ecuación 1:
   $$100 \mu_s = 37.5 \implies \mu_s = \frac{37.5}{100} = 0.375$$
   *(Nota: de forma general, para una barra apoyada en pared lisa a punto de deslizar: $\mu_s = \frac{1}{2\tan\theta} = \frac{1}{2 \times (4/3)} = \frac{3}{8} = 0.375$).*  
**Respuesta:** B

---

### Problema 5 (Nivel Boss Challenge: Centro de Masa de Cuerpos Compuestos con Vaciado)
**Enunciado:** A partir de un disco circular plano y homogéneo de radio $R = 12\text{ cm}$ y masa $M$, se perfora y retira una placa circular más pequeña de radio $r = 4\text{ cm}$, cuyo centro dista $d = 6\text{ cm}$ del centro del disco original. Determine la posición del nuevo centro de masa del disco perforado remanente respecto al centro geométrico del disco original.
A) Se desplaza $0.50\text{ cm}$ en sentido opuesto al orificio.  
B) Se desplaza $0.75\text{ cm}$ en sentido opuesto al orificio.  
C) Se desplaza $1.00\text{ cm}$ hacia el orificio.  
D) Se desplaza $1.25\text{ cm}$ en sentido opuesto al orificio.  
E) Permanece en el centro original.  

**Resolución:**
1. Establecemos un sistema de coordenadas cartesianas con el origen $(0, 0)$ en el centro geométrico del disco completo original.
2. Ubicamos el orificio circular sobre el semieje positivo de las abscisas ($+X$), por lo que su centro de masa se encuentra en $(x_1, y_1) = (6\text{ cm}, 0)$.
3. Para placas planas homogéneas, la masa es directamente proporcional al área superficial:
   - Área del disco completo original:
     $$A_{\text{total}} = \pi R^2 = \pi (12)^2 = 144\pi\text{ cm}^2$$
   - Área de la porción retirada (masa negativa ficticia):
     $$A_{\text{hueco}} = \pi r^2 = \pi (4)^2 = 16\pi\text{ cm}^2$$
   - Área del cuerpo remanente:
     $$A_{\text{remanente}} = A_{\text{total}} - A_{\text{hueco}} = 144\pi - 16\pi = 128\pi\text{ cm}^2$$
4. Aplicamos el principio de superposición para centros de masa (tratando a la porción retirada como un área con masa negativa):
   $$x_{CM} = \frac{A_{\text{total}} x_0 - A_{\text{hueco}} x_1}{A_{\text{total}} - A_{\text{hueco}}}$$
   Como $x_0 = 0$ (centro del disco original):
   $$x_{CM} = \frac{(144\pi)(0) - (16\pi)(6\text{ cm})}{128\pi\text{ cm}^2}$$
   $$x_{CM} = \frac{-96\pi}{128\pi} = -\frac{96}{128} = -\frac{3}{4} = -0.75\text{ cm}$$
5. El signo negativo indica que el nuevo centro de masa se desplaza a lo largo del eje $X$ en **sentido opuesto al orificio**, exactamente a una distancia de **$0.75\text{ cm}$** del centro original.  
**Respuesta:** B

---

## 7. GLOSARIO TÉCNICO

1. **Equilibrio Estático:** Estado mecánico en el que un cuerpo rígido permanece en reposo relativo continuo sin aceleración de traslación ni de rotación.
2. **Torque (Momento de Fuerza):** Magnitud vectorial definida por el producto vectorial entre el vector de posición y la fuerza aplicada, que representa la capacidad de una fuerza para generar giro.
3. **Brazo de Palanca:** Longitud del segmento perpendicular trazado desde el eje o punto de giro hasta la línea de acción de la fuerza considerada.
4. **Teorema de Lamy:** Relación trigonométrica para tres fuerzas coplanares y concurrentes en equilibrio estático, análoga a la ley de senos.
5. **Teorema de Varignon:** Principio según el cual el momento de la resultante de un sistema de fuerzas concurrentes es igual a la suma algebraica de los momentos individuales de cada fuerza respecto al mismo punto.
6. **Cupla (Par de Fuerzas):** Conjunto de dos fuerzas de igual magnitud, direcciones paralelas y sentidos opuestos, que produce un momento neto constante no nulo sin fuerza resultante.
7. **Centro de Gravedad:** Punto material ideal donde se considera aplicada la fuerza de gravedad resultante (peso total) de un cuerpo extenso.
8. **Centro de Masa:** Punto geométrico que se desplaza como si toda la masa del sistema estuviera concentrada en él y todas las fuerzas externas estuvieran aplicadas allí.
9. **Fuerza Concurrente:** Conjunto de fuerzas cuyas líneas de acción se cruzan en un único punto del espacio tridimensional o plano.
10. **Línea de Acción:** Recta geométrica infinita colineal al vector fuerza que indica la dirección en la que esta ejerce su efecto mecánico.

---

## 8. FLASHCARDS DE REPETICIÓN ESPACIADA

- **Q1:** ¿Cuáles son las dos condiciones necesarias y suficientes para el equilibrio mecánico de un cuerpo rígido?
  - **A1:** 1.ª Condición (Equilibrio de traslación): $\sum \vec{F} = \vec{0}$; 2.ª Condición (Equilibrio de rotación): $\sum \vec{\tau} = \vec{0}$.
- **Q2:** ¿Qué unidad tiene el torque o momento de una fuerza en el Sistema Internacional?
  - **A2:** Newton-metro ($\text{N}\cdot\text{m}$), ¡nunca Joules!
- **Q3:** ¿Qué establece el Teorema de Lamy para tres fuerzas concurrentes en equilibrio?
  - **A3:** Que el módulo de cada fuerza es directamente proporcional al seno del ángulo opuesto: $\frac{F_1}{\sin\alpha} = \frac{F_2}{\sin\beta} = \frac{F_3}{\sin\gamma}$.
- **Q4:** ¿Cuánto vale el momento de una fuerza cuya línea de acción pasa exactamente por el centro de momentos?
  - **A4:** Cero ($\tau = 0$), porque el brazo de palanca es nulo ($d = 0$).
- **Q5:** ¿Qué movimiento produce un par de fuerzas (cupla) sobre un cuerpo rígido libre?
  - **A5:** Rotación pura sin traslación (la fuerza resultante es cero, pero el torque neto no es nulo).
- **Q6:** ¿En qué condición física el Centro de Gravedad de un cuerpo coincide exactamente con su Centro de Masa?
  - **A6:** En presencia de un campo gravitatorio constante y uniforme ($\vec{g} = \text{cte}$).
- **Q7:** ¿Qué convención de signo escalar se utiliza habitualmente para el momento que produce un giro en sentido antihorario?
  - **A7:** Signo positivo ($+$).
- **Q8:** ¿Dónde se ubica el centro de gravedad de una barra cilíndrica homogénea y uniforme de longitud $L$?
  - **A8:** En su punto medio geométrico ($L/2$).
- **Q9:** Si una escalera de peso $P$ apoyada en pared lisa forma un ángulo $\theta$ con el piso horizontal rugoso, ¿cuánto vale el coeficiente de fricción estático mínimo para no resbalar?
  - **A9:** $\mu_s = \frac{1}{2\tan\theta}$.
- **Q10:** ¿Cómo se define el brazo de palanca de una fuerza?
  - **A10:** Es la distancia perpendicular desde el centro de momentos hasta la línea de acción de la fuerza.

---

## 9. BLOQUE DE GAMIFICACIÓN KMP (INTERACTIVO)

```json
{
  "subject_id": "FISICA",
  "topic_id": "TEMA_04_ESTATICA",
  "difficulty_level": "PREUNIVERSITARIO_AVANZADO",
  "questions": [
    {
      "id": "FIS_EST_001",
      "question": "Una barra homogénea de 4 m de longitud y 60 N de peso está apoyada horizontalmente sobre dos soportes en sus extremos A y B. Si se coloca una carga de 40 N a 1 m del extremo A, ¿cuál es la fuerza de reacción en el soporte B?",
      "options": [
        "30 N",
        "40 N",
        "50 N",
        "60 N",
        "70 N"
      ],
      "correct_answer": 1,
      "explanation": "Tomando momentos en A (∑τ_A = 0): R_B * (4 m) = P_barra * (2 m) + P_carga * (1 m) => R_B * 4 = 60 * 2 + 40 * 1 = 120 + 40 = 160 => R_B = 160 / 4 = 40 N."
    },
    {
      "id": "FIS_EST_002",
      "question": "Se aplica una fuerza F = 50 N perpendicularmente en el extremo de una llave inglesa de 30 cm de longitud. El módulo del momento de fuerza aplicado respecto a la tuerca central es:",
      "options": [
        "1.5 N·m",
        "15 N·m",
        "150 N·m",
        "1500 N·m",
        "0.15 N·m"
      ],
      "correct_answer": 1,
      "explanation": "τ = F * d = (50 N) * (0.30 m) = 15 N·m."
    },
    {
      "id": "FIS_EST_003",
      "question": "Un sistema de dos masas puntuales m1 = 2 kg en x1 = 1 m y m2 = 6 kg en x2 = 5 m se encuentra sobre el eje X. La posición del centro de masa del sistema es:",
      "options": [
        "2.5 m",
        "3.0 m",
        "3.5 m",
        "4.0 m",
        "4.5 m"
      ],
      "correct_answer": 3,
      "explanation": "x_CM = (m1*x1 + m2*x2)/(m1 + m2) = (2*1 + 6*5)/(2 + 6) = (2 + 30)/8 = 32 / 8 = 4.0 m."
    }
  ]
}
```

---

## 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Civil y Arquitectura (Cálculo de Armaduras y Puentes):** El dimensionamiento de vigas, puentes reticulados (método de los nudos y método de las secciones de Ritter) y rascacielos se fundamenta en la estática de cuerpos rígidos. Para que una estructura no colapse ante cargas vivas, cargas muertas o ráfagas de viento, las fuerzas de compresión y tracción en cada barra deben satisfacer simultáneamente las condiciones de equilibrio de traslación y rotación con factores de seguridad normativos.
* **Ortopedia y Biomecánica Musculoesquelética:** En el cuerpo humano, los músculos esqueléticos operan como palancas mecánicas de tercer género (desventaja mecánica de fuerza pero ventaja de amplitud y velocidad de movimiento). Para sostener un peso en la mano con el codo a $90^\circ$, el músculo bíceps braquial debe ejercer una fuerza de tracción hacia arriba cerca de 6 a 8 veces superior al peso sostenido, debido a que su brazo de palanca respecto al eje articular del codo es de apenas $3-5\text{ cm}$.

---

## 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Ingenieril: Grúa Pluma y Tensión de Cable)
En las obras de ampliación del puente Chilina en Arequipa, se utiliza una grúa de pluma compuesta por una viga uniforme de acero de $4000\text{ N}$ de peso y $10\text{ metros}$ de longitud, articulada en su base inferior a un pivote fijo en el suelo. La pluma forma un ángulo de $45^\circ$ con el suelo horizontal. Un cable de acero horizontal sujeto al extremo superior de la pluma la sostiene en esa posición para evitar su caída. Si en dicho extremo superior cuelga verticalmente un bloque de hormigón de $6000\text{ N}$ de peso, determine la tensión horizontal que soporta el cable de acero.
A) $4000\text{ N}$  
B) $6000\text{ N}$  
C) $7000\text{ N}$  
D) $8000\text{ N}$  
E) $10\ 000\text{ N}$  

* **Resolución:**
1. Identificamos las fuerzas actuantes sobre la viga:
   - Peso de la pluma: $P_{\text{viga}} = 4000\text{ N}$ vertical hacia abajo en el punto medio ($L/2 = 5\text{ m}$).
   - Carga de hormigón: $P_{\text{carga}} = 6000\text{ N}$ vertical hacia abajo en el extremo superior ($L = 10\text{ m}$).
   - Tensión horizontal del cable: $\vec{T}$ hacia la izquierda en el extremo superior ($L = 10\text{ m}$).
   - Reacción en la articulación de la base ($O$).
2. Tomamos centro de momentos en el pivote de la base $O$ ($\sum \tau_O = 0$):
   $$\sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}$$
3. Calculamos los brazos de palanca:
   - Brazo de palanca de la tensión horizontal $T$: es la distancia vertical desde la base hasta la línea de acción horizontal superior:
     $$d_T = L \sin 45^\circ$$
     $$\tau_T = T \cdot (L \sin 45^\circ)$$
   - Brazos de palanca de los pesos verticales: son las distancias horizontales desde el pivote:
     $$d_{\text{viga}} = \frac{L}{2} \cos 45^\circ$$
     $$d_{\text{carga}} = L \cos 45^\circ$$
     $$\tau_{\text{horarios}} = P_{\text{viga}} \left(\frac{L}{2} \cos 45^\circ\right) + P_{\text{carga}} (L \cos 45^\circ)$$
4. Igualamos ambos miembros:
   $$T \cdot L \sin 45^\circ = (4000) \left(\frac{L}{2}\right) \cos 45^\circ + (6000) L \cos 45^\circ$$
   Como $\sin 45^\circ = \cos 45^\circ$ y simplificando la longitud $L$:
   $$T = \frac{4000}{2} + 6000 = 2000 + 6000 = 8000\text{ N}$$
- La tensión en el cable es de **$8000\text{ N}$**.  
* **Respuesta:** D

---

### Pregunta 2 (Caso Ergonómico: Palanca de Primer Género en la Cabeza Humana)
En la cabeza humana, el peso de la cabeza ($P = 50\text{ N}$) actúa hacia abajo a lo largo de una línea de acción vertical ubicada a una distancia de $d_1 = 4\text{ cm}$ hacia adelante del punto de articulación atlanto-occipital (la vértebra atlas actúa como pivote de apoyo). Para mantener la cabeza erguida en equilibrio estático horizontal sin que caiga hacia el pecho, los músculos extensores de la nuca (esplenio y trapecio) deben ejercer una fuerza de tracción vertical hacia abajo situada a $d_2 = 2.5\text{ cm}$ por detrás de la articulación. ¿Cuál es el módulo de la fuerza muscular de tracción requerida y la fuerza de compresión total que soporta la primera vértebra cervical (atlas)?
A) $F_{\text{músculo}} = 80\text{ N}$; $R_{\text{atlas}} = 130\text{ N}$  
B) $F_{\text{músculo}} = 50\text{ N}$; $R_{\text{atlas}} = 100\text{ N}$  
C) $F_{\text{músculo}} = 40\text{ N}$; $R_{\text{atlas}} = 90\text{ N}$  
D) $F_{\text{músculo}} = 100\text{ N}$; $R_{\text{atlas}} = 150\text{ N}$  
E) $F_{\text{músculo}} = 60\text{ N}$; $R_{\text{atlas}} = 110\text{ N}$  

* **Resolución:**
1. Planteamos la Segunda Condición de Equilibrio (torque respecto a la articulación atlanto-occipital $O$):
   - El peso de la cabeza ejerce un momento horario:
     $$\tau_{\text{peso}} = P \times d_1 = (50\text{ N}) \times (4\text{ cm}) = 200\text{ N}\cdot\text{cm}$$
   - El músculo ejerce un momento antihorario:
     $$\tau_{\text{músculo}} = F_m \times d_2 = F_m \times (2.5\text{ cm})$$
   $$\tau_{\text{músculo}} = \tau_{\text{peso}} \implies 2.5 F_m = 200 \implies F_m = \frac{200}{2.5} = 80\text{ N}$$
2. Planteamos la Primera Condición de Equilibrio (eje vertical) para hallar la fuerza de compresión en el atlas ($R$):
   - Hacia abajo actúan el peso ($50\text{ N}$) y la fuerza muscular ($80\text{ N}$).
   - Hacia arriba actúa la reacción normal de soporte de la vértebra atlas ($R$):
     $$\sum F_y = 0 \implies R = P + F_m = 50\text{ N} + 80\text{ N} = 130\text{ N}$$
- La fuerza muscular es de $80\text{ N}$ y la compresión en la vértebra es de $130\text{ N}$.  
* **Respuesta:** A

---

## 12. AUTOEVALUACIÓN RÁPIDA

1. ¿Qué magnitud física vectorial mide la tendencia de una fuerza a producir rotación alrededor de un punto pivote?
   - A) Cantidad de movimiento
   - B) Torque o momento de fuerza
   - C) Potencia instantánea
   - D) Impulso mecánico
   - E) Presión estática
2. Para que un cuerpo esté en equilibrio de traslación, ¿qué condición vectorial matemática debe cumplirse necesariamente?
   - A) $\sum \vec{F} = \vec{0}$
   - B) $\sum \vec{\tau} = \vec{0}$
   - C) $\sum \vec{p} = \text{cte} \ne 0$
   - D) $\vec{v} = \vec{0}$ en todo instante
   - E) $a_c = 0$
3. ¿Cuánto vale el momento de una fuerza de $80\text{ N}$ cuya línea de acción pasa exactamente por el punto respecto al cual se calcula el momento?
   - A) $80\text{ N}\cdot\text{m}$
   - B) $40\text{ N}\cdot\text{m}$
   - C) $0\text{ N}\cdot\text{m}$
   - D) $160\text{ N}\cdot\text{m}$
   - E) Indeterminado
4. ¿Qué nombre recibe un sistema formado por dos fuerzas paralelas de igual magnitud pero de sentidos opuestos que no comparten la misma línea de acción?
   - A) Fuerzas concurrentes
   - B) Par de fuerzas o cupla
   - C) Fuerzas reactivas
   - D) Sistema colineal
   - E) Fuerzas inerciales
5. En un campo gravitatorio terrestre homogéneo, ¿con qué punto físico coincide exactamente el centro de gravedad de un cuerpo?
   - A) Con el foco elíptico
   - B) Con el centro de masa
   - C) Con el punto de aplicación de la fuerza elástica
   - D) Con el vértice de apoyo
   - E) Con el centro instantáneo de rotación

---

### Claves de Respuestas:
1: B | 2: A | 3: C | 4: B | 5: B
