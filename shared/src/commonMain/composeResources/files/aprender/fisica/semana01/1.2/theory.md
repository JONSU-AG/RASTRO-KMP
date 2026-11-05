## Vectores: cómo leer sus componentes

Un **vector** representa una cantidad que tiene tamaño y orientación. Se dibuja con una flecha: su longitud representa el módulo y la punta indica hacia dónde apunta.

### Primero, entiende los símbolos

| Símbolo | Cómo se lee | Qué significa |
|---|---|---|
| $\vec A$ | Vector A | La flecha completa, con sus componentes. |
| $|\vec A|$ | Módulo de A | Su tamaño; es un número no negativo. |
| $\hat i$ | Vector unitario del eje x | Avanza una unidad hacia el sentido positivo horizontal. |
| $\hat j$ | Vector unitario del eje y | Avanza una unidad hacia el sentido positivo vertical. |
| $\hat k$ | Vector unitario del eje z | Se usa cuando el problema tiene tres dimensiones. |

Los vectores unitarios anteriores también se llaman **canónicos**: son las referencias de los ejes, no magnitudes nuevas. En el plano, $\mathbb{R}^2$ significa «dos componentes reales, x e y»; en el espacio, $\mathbb{R}^3$ añade la componente z.

### Un ejemplo antes de las fórmulas generales

Si $\vec A=(3,2)$ m, el desplazamiento tiene una componente de 3 m hacia +x y otra de 2 m hacia +y. También se escribe $\vec A=3\hat i+2\hat j$ m. Las componentes describen el mismo vector; no son dos desplazamientos adicionales que deban sumarse a su módulo.

Su módulo es $|\vec A|=\sqrt{3^2+2^2}=\sqrt{13}$ m. No se obtiene sumando 3+2: las componentes son perpendiculares.

### Elementos y operaciones

#### A. Elementos de un Vector
- **Módulo o Magnitud (A o |\vec{A}|):** Longitud escalar no negativa del segmento, proporcional al valor medido: |\vec{A}| \ge 0.
- **Dirección:** Orientación de la recta directriz o línea de acción en el espacio, definida por el ángulo \theta medido en sentido antihorario respecto al eje positivo de las abscisas (+X) en el plano, o por los **cosenos directores** en \mathbb{R}^3.
- **Sentido:** Orientación indicada por la punta de flecha.
- **Punto de aplicación:** En una fuerza aplicada a un cuerpo importa dónde actúa. Un vector libre, en cambio, puede trasladarse sin cambiar sus componentes, módulo, dirección ni sentido.

#### B. Operaciones Geométricas con Vectores
1. **Método del Paralelogramo (Resultante de dos vectores coplanares y concurrentes):**
   Sean \vec{A} y \vec{B} dos vectores que forman un ángulo \theta entre sí:
   R = |\vec{A} + \vec{B}| = \sqrt{A^2 + B^2 + 2AB \cos\theta}
   - *Resultante Máxima (\theta = 0^\circ \implies \cos 0^\circ = 1):*
     R_{\max} = A + B
   - *Resultante Mínima (\theta = 180^\circ \implies \cos 180^\circ = -1):*
     R_{\min} = |A - B|
   - *Vectores Perpendiculares u Ortogonales (\theta = 90^\circ \implies \cos 90^\circ = 0):*
     R = \sqrt{A^2 + B^2}
2. **Diferencia de Vectores (\vec{D} = \vec{A} - \vec{B}):**
   Geométricamente es el vector que une el extremo de \vec{B} con el extremo de \vec{A}:
   D = |\vec{A} - \vec{B}| = \sqrt{A^2 + B^2 - 2AB \cos\theta}
3. **Método del Polígono:**
   Se colocan los vectores consecutivamente uno a continuación de otro (origen de uno en el extremo del precedente). El vector resultante \vec{R} va desde el origen del primer vector hasta el extremo del último.
   - *Polígono Cerrado:* Si el extremo del último vector coincide con el origen del primero, la resultante es nula:
     \vec{A} + \vec{B} + \vec{C} + \vec{D} = \vec{0}

#### C. Representación Cartesiana y Operaciones Analíticas
1. **En el Plano (\mathbb{R}^2):**
   \vec{A} = A_x \hat{i} + A_y \hat{j} = (A_x, A_y)
   A_x = A \cos\theta, \quad A_y = A \sin\theta
   A = |\vec{A}| = \sqrt{A_x^2 + A_y^2}, \quad \tan\theta = \frac{A_y}{A_x}
2. **En el Espacio Tridimensional (\mathbb{R}^3):**
   \vec{A} = A_x \hat{i} + A_y \hat{j} + A_z \hat{k}
   |\vec{A}| = \sqrt{A_x^2 + A_y^2 + A_z^2}
   - **Cosenos Directores (\alpha, \beta, \gamma con los ejes X, Y, Z):**
     \cos\alpha = \frac{A_x}{|\vec{A}|}, \quad \cos\beta = \frac{A_y}{|\vec{A}|}, \quad \cos\gamma = \frac{A_z}{|\vec{A}|}
     \cos^2\alpha + \cos^2\beta + \cos^2\gamma = 1
3. **Vector Unitario (\hat{u}_A):**
   Para un vector A no nulo, es el vector de módulo uno que conserva su dirección y sentido:
   \hat{u}_A = \frac{\vec{A}}{|\vec{A}|} \implies |\hat{u}_A| = 1

   El vector nulo no se puede normalizar: su módulo es cero y no tiene dirección definida. Para hallar un ángulo con la tangente, comprueba antes los signos de las componentes y el cuadrante; si la componente x es cero, no se puede dividir entre ella.

#### D. Productos de Vectores
1. **Producto Escalar o Producto Punto (\vec{A} \cdot \vec{B}):**
   Operación binaria cuyo resultado es un número escalar:
   \vec{A} \cdot \vec{B} = |\vec{A}| |\vec{B}| \cos\theta = A_x B_x + A_y B_y + A_z B_z
   - *Propiedades:*
     - Conmutativa: \vec{A} \cdot \vec{B} = \vec{B} \cdot \vec{A}
     - Condición de Ortogonalidad: \vec{A} \perp \vec{B} \iff \vec{A} \cdot \vec{B} = 0 (para vectores no nulos).
     - Módulo al cuadrado: \vec{A} \cdot \vec{A} = |\vec{A}|^2 = A^2
     - Vectores canónicos: \hat{i} \cdot \hat{i} = \hat{j} \cdot \hat{j} = \hat{k} \cdot \hat{k} = 1; \hat{i} \cdot \hat{j} = \hat{j} \cdot \hat{k} = \hat{k} \cdot \hat{i} = 0.
2. **Producto Vectorial o Producto Cruz (\vec{A} \times \vec{B}):**
   Operación binaria cuyo resultado es un **vector** perpendicular al plano formado por \vec{A} y \vec{B}, cuyo sentido sigue la **regla de la mano derecha**:
   \vec{A} \times \vec{B} = (|\vec{A}| |\vec{B}| \sin\theta) \, \hat{u}_n
   |\vec{A} \times \vec{B}| = \text{Área del paralelogramo sustentado por } \vec{A} \text{ y } \vec{B}
   - *Cálculo analítico por determinante:*
     \vec{A} \times \vec{B} = \begin{vmatrix} \hat{i} & \hat{j} & \hat{k} \\ A_x & A_y & A_z \\ B_x & B_y & B_z \end{vmatrix} = (A_y B_z - A_z B_y)\hat{i} - (A_x B_z - A_z B_x)\hat{j} + (A_x B_y - A_y B_x)\hat{k}
   - *Propiedades:*
     - Anticonmutativa: \vec{A} \times \vec{B} = -(\vec{B} \times \vec{A})
     - Condición de Paralelismo: \vec{A} \parallel \vec{B} \iff \vec{A} \times \vec{B} = \vec{0}
     - Vectores canónicos: \hat{i} \times \hat{i} = \hat{j} \times \hat{j} = \hat{k} \times \hat{k} = \vec{0}; \hat{i} \times \hat{j} = \hat{k}, \hat{j} \times \hat{k} = \hat{i}, \hat{k} \times \hat{i} = \hat{j}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   \text{Comp}_{\vec{B}} \vec{A} = \frac{\vec{A} \cdot \vec{B}}{|\vec{B}|}

5. **Área del Triángulo formado por dos vectores:**
   \text{Área}_{\triangle} = \frac{1}{2} |\vec{A} \times \vec{B}|

6. **Dimensiones de Magnitudes Físicas Derivadas Notables:**
   - Fuerza: [F] = MLT^{-2}
   - Trabajo / Energía / Calor: [W] = [E] = [Q] = ML^2T^{-2}
   - Presión: [p] = ML^{-1}T^{-2}
   - Potencia: [P] = ML^2T^{-3}
   - Carga Eléctrica: [q] = IT
   - Iluminación: [E_v] = JL^{-2}

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Error en Suma de Vectores:** Muchos postulantes suman directamente los módulos: 3 + 4 = 7. **Solo se pueden sumar algebraicamente los módulos si los vectores son colineales y del mismo sentido (\theta = 0^\circ)**. Si están a 90^\circ, la resultante es \sqrt{3^2 + 4^2} = 5.
* **Dimensiones de Exponentes y Argumentos:** En expresiones como y = A e^{-kt} o y = A \cos(Bx), recuerda que **todo exponente y todo argumento trigonométrico es ADIMENSIONAL ([1])**. Por ende, [-kt] = 1 \implies [k] = T^{-1}.
* **La Constante de Gravitación Universal (G):**
  F = G \frac{m_1 m_2}{d^2} \implies G = \frac{F d^2}{m_1 m_2} \implies [G] = \frac{(MLT^{-2})(L^2)}{M^2} = M^{-1}L^3T^{-2}
  Pregunta fijada en exámenes de admisión UNI y UNSA.
* **Módulo de la Diferencia Vectorial:** El módulo del vector diferencia |\vec{A} - \vec{B}| representa la distancia geométrica entre los extremos de los vectores concurrentes. Si |\vec{A} + \vec{B}| = |\vec{A} - \vec{B}|, entonces los vectores son **perpendiculares entre sí (\vec{A} \perp \vec{B})**.
* **Ángulos Notables en Resultante de Vectores de Igual Módulo (|\vec{A}| = |\vec{B}| = x):**
  - Si \theta = 60^\circ \implies R = x\sqrt{3}
  - Si \theta = 90^\circ \implies R = x\sqrt{2}
  - Si \theta = 120^\circ \implies R = x *(¡La resultante tiene el mismo módulo que los vectores componentes!)*

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Magnitudes Fundamentales del SI:**
   > **"LO-MA-TI-TE-IN-CAN-MOL"**
   - **LO**ngitud (\text{m})
   - **MA**sa (\text{kg})
   - **TI**empo (\text{s})
   - **TE**mperatura (\text{K})
   - **IN**tensidad de corriente (\text{A})
   - **CAN**dela (\text{cd})
   - **MOL** (\text{mol})

2. **Signo en la Ley de Cosenos (Suma vs. Diferencia de Vectores):**
   > **"SUMA lleva MÁS, DIFERENCIA lleva MENOS"**
   - Resultante (Suma): R = \sqrt{A^2 + B^2 \mathbf{+} 2AB\cos\theta}
   - Diferencia: D = \sqrt{A^2 + B^2 \mathbf{-} 2AB\cos\theta}
   *(¡Cuidado! En trigonometría del triángulo oblicuángulo, el lado opuesto lleva signo menos; en física vectorial, la resultante de la suma de vectores concurrentes lleva signo positivo).*

3. **Ciclo Positivo del Producto Vectorial de Canónicos:**
   > **"i \to j \to k \to i (Sentido horario positivo)"**
   - \hat{i} \times \hat{j} = +\hat{k}
   - \hat{j} \times \hat{k} = +\hat{i}
   - \hat{k} \times \hat{i} = +\hat{j}
   - Si vas contra el sentido: \hat{j} \times \hat{i} = -\hat{k}.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Geodesia y Navegación por Satélite (GPS):** El posicionamiento tridimensional preciso de un receptor GPS en la Tierra requiere el cálculo algebraico de vectores de posición relativos a cuatro satélites simultáneos mediante la resolución de ecuaciones vectoriales de tiempo y distancia (|\vec{r}_{\text{receptor}} - \vec{r}_{\text{satélite}}| = c \cdot \Delta t).
* **Fisiología Médica (Vectorcardiograma):** La actividad eléctrica cardíaca originada por la despolarización sincrónica del miocardio ventricular se modela como un dipolo vectorial resultante dinámico (\vec{P}). El electrocardiograma convencional (ECG) mide la proyección ortogonal escalar de dicho vector cardíaco sobre las líneas de derivación bipolares del triángulo de Einthoven.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Físico-Ingenieril: Estructuras y Vectores de Tensión)
En la construcción de un puente peatonal sobre la torrentera de San Lázaro en Arequipa, un anillo de acero central es sostenido horizontalmente por tres cables tensores coplanares en equilibrio estático. El cable 1 ejerce una tensión \vec{T}_1 de módulo 500\text{ N} en la dirección del eje +X (\theta_1 = 0^\circ). El cable 2 ejerce una tensión \vec{T}_2 de módulo 500\text{ N} formando un ángulo de 120^\circ con el eje +X. Para que el anillo se mantenga en perfecto reposo estático (\sum \vec{T} = \vec{0}), ¿qué módulo y qué orientación angular debe tener la tensión \vec{T}_3 que ejerce el tercer cable tensor?
A) 500\text{ N} formando un ángulo de 240^\circ con el eje +X.  
B) 500\sqrt{3}\text{ N} formando un ángulo de 270^\circ.  
C) 250\text{ N} formando un ángulo de 180^\circ.  
D) 1000\text{ N} formando un ángulo de 300^\circ.  
E) 500\text{ N} formando un ángulo de 90^\circ.  

* **Resolución:**
1. Los cables 1 y 2 tienen módulos iguales (T_1 = T_2 = 500\text{ N}) y forman un ángulo de 120^\circ entre sí.
2. La resultante vectorial de \vec{T}_1 y \vec{T}_2 tiene un módulo conocido por propiedad de vectores iguales a 120^\circ:
   R_{12} = \sqrt{T_1^2 + T_2^2 + 2T_1 T_2 \cos 120^\circ} = \sqrt{500^2 + 500^2 + 2(500)(500)(-1/2)} = 500\text{ N}
3. La dirección de \vec{R}_{12} biseca simétricamente el ángulo entre 0^\circ y 120^\circ; por tanto, se ubica a \theta = 60^\circ sobre el eje +X.
4. Para que el anillo esté en equilibrio estático:
   \vec{T}_1 + \vec{T}_2 + \vec{T}_3 = \vec{0} \implies \vec{T}_3 = -\vec{R}_{12}
5. Por ende, \vec{T}_3 debe tener el **mismo módulo (500\text{ N})** y sentido opuesto:
   \theta_3 = 60^\circ + 180^\circ = 240^\circ
* **Respuesta:** A

---

### Pregunta 2 (Caso Metrológico y Aerodinámica)
Un túnel de viento experimental en la Facultad de Ingeniería de la UNSA analiza la fuerza de arrastre hidrodinámico F_D que experimenta un dron de vigilancia al desplazarse en el aire. La teoría física postula que dicha fuerza depende de la densidad del aire \rho, de la velocidad de traslación v, del área frontal transversal del dron A y de un coeficiente de arrastre adimensional C_D, según la relación:
F_D = \frac{1}{2} C_D \cdot \rho^\alpha \cdot v^\beta \cdot A^\gamma
Sabiendo que [F_D] = MLT^{-2}, [\rho] = ML^{-3}, [v] = LT^{-1}, [A] = L^2 y [C_D] = 1, determine la ecuación dimensionalmente correcta para la fuerza de arrastre.
A) F_D = \frac{1}{2} C_D \frac{\rho v}{A}  
B) F_D = \frac{1}{2} C_D \rho v^2 A  
C) F_D = \frac{1}{2} C_D \rho^2 v A^2  
D) F_D = \frac{1}{2} C_D \frac{\rho^2 v^2}{A}  
E) F_D = \frac{1}{2} C_D \sqrt{\rho v A}  

* **Resolución:**
1. Planteamos la ecuación dimensional homogénea:
   [F_D] = [C_D] [\rho]^\alpha [v]^\beta [A]^\gamma
   MLT^{-2} = 1 \cdot (ML^{-3})^\alpha (LT^{-1})^\beta (L^2)^\gamma
   M^1 L^1 T^{-2} = M^\alpha L^{-3\alpha + \beta + 2\gamma} T^{-\beta}
2. Igualando exponentes:
   - Para la masa (M): \alpha = 1.
   - Para el tiempo (T): -\beta = -2 \implies \beta = 2.
   - Para la longitud (L): -3\alpha + \beta + 2\gamma = 1 \implies -3(1) + 2 + 2\gamma = 1 \implies -1 + 2\gamma = 1 \implies 2\gamma = 2 \implies \gamma = 1.
3. Los exponentes son \alpha = 1, \beta = 2, \gamma = 1, lo que conduce a la conocida ecuación de arrastre de fluidos de Rayleigh:
   F_D = \frac{1}{2} C_D \rho v^2 A
* **Respuesta:** B

---
