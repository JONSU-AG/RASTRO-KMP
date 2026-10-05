## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  \tau_O = F \cdot r \quad (\text{Eficacia de giro máxima})

#### D. Convención de Signos Escalar en el Plano
- **Sentido Antihorario (levógiro):** Signo positivo (+), vector saliendo del plano (\odot).
- **Sentido Horario (dextrógiro):** Signo negativo (-), vector entrando al plano (\otimes).

#### E. Teorema de Varignon
*"El momento resultante respecto a un punto O producido por un sistema de fuerzas concurrentes es igual a la suma algebraica de los momentos producidos individualmente por cada una de las fuerzas componentes respecto al mismo punto O."*
\vec{\tau}_O^{\vec{F}_R} = \sum_{i=1}^{n} \vec{\tau}_O^{\vec{F}_i} = \vec{\tau}_O^{\vec{F}_1} + \vec{\tau}_O^{\vec{F}_2} + \dots + \vec{\tau}_O^{\vec{F}_n}

---

### 2.3. SEGUNDA CONDICIÓN DE EQUILIBRIO (EQUILIBRIO DE ROTACIÓN)

Para que un cuerpo rígido extenso no experimente aceleración angular (\vec{\alpha} = \vec{0}) y se encuentre en equilibrio de rotación, la suma vectorial de los momentos de todas las fuerzas externas respecto a cualquier punto arbitrario O debe ser cero:
\sum \vec{\tau}_O = \vec{0}
En términos escalares coplanares:
\sum \tau_O = 0 \iff \sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}
*Estrategia fundamental preuniversitaria:* Conviene ubicar el centro de momentos O en el punto de aplicación de una o más fuerzas incógnitas desconocidas (como reacciones en articulaciones o apoyos) para que su brazo de palanca sea nulo (d = 0) y se anulen sus momentos, simplificando la ecuación a una sola incógnita.

---

### 2.4. CUPLA O PAR DE FUERZAS

Sistema formado por dos fuerzas \vec{F} y -\vec{F} de igual módulo, paralelas, de sentidos contrarios y con líneas de acción separadas por una distancia perpendicular d:
- Resultante de traslación nula: \vec{F}_R = \vec{F} + (-\vec{F}) = \vec{0}.
- **Momento del Par (M_{\text{cupla}}):**
  M_{\text{cupla}} = F \cdot d
  *Propiedad cardinal:* El momento de un par de fuerzas es un vector libre; **es constante e independiente del punto del espacio que se elija como centro de momentos**. Un par de fuerzas produce rotación pura sin traslación.

---

### 2.5. CENTRO DE MASA (CM) Y CENTRO DE GRAVEDAD (CG)

1. **Centro de Masa (CM):**
   Punto geométrico ponderado por las masas de las partículas de un sistema:
   \vec{r}_{CM} = \frac{\sum m_i \vec{r}_i}{\sum m_i} = \frac{m_1 \vec{r}_1 + m_2 \vec{r}_2 + \dots + m_n \vec{r}_n}{M_{\text{total}}}
   Coordenadas en el plano:
   x_{CM} = \frac{\sum m_i x_i}{\sum m_i}, \quad y_{CM} = \frac{\sum m_i y_i}{\sum m_i}
2. **Centro de Gravedad (CG):**
   Punto donde se considera aplicada la resultante de las fuerzas de atracción gravitatoria (peso total) que actúan sobre todos los elementos materiales de un cuerpo extenso.
   - En un campo gravitatorio constante y uniforme (\vec{g} = \text{cte}), el Centro de Gravedad coincide exactamente con el Centro de Masa (CG \equiv CM).
   - Para cuerpos homogéneos simétricos (varilla, cilindro, esfera, disco, cubo), el CG se ubica en su centro geométrico o centroide de simetría.
3. **Tipos de Equilibrio Estático de un Cuerpo Apoyado:**
   - **Estable:** Si ante una pequeña perturbación o inclinación angular, el torque del peso restituye al cuerpo a su posición original de reposo (el CG se eleva al perturbarlo).
   - **Inestable:** Si ante una mínima perturbación, el torque del peso tiende a apartarlo aún más de su posición de equilibrio provocando el vuelco (el CG desciende al perturbarlo).
   - **Indiferente o Neutro:** Si ante cualquier desplazamiento, el cuerpo permanece en equilibrio en su nueva posición (la altura del CG no varía; ej. una esfera sobre un plano horizontal).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

4. **Teorema de Lamy:**
   \frac{F_1}{\sin\alpha} = \frac{F_2}{\sin\beta} = \frac{F_3}{\sin\gamma}

5. **Coordenadas del Centro de Masa:**
   x_{CM} = \frac{m_1 x_1 + m_2 x_2 + \dots + m_n x_n}{m_1 + m_2 + \dots + m_n}
   y_{CM} = \frac{m_1 y_1 + m_2 y_2 + \dots + m_n y_n}{m_1 + m_2 + \dots + m_n}

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Fuerza en una Articulación o Bisagra Fija:** Jamás asumir a priori que la reacción en un apoyo articulado es perpendicular a la barra. Una articulación lisa ejerce una fuerza de dirección desconocida que siempre debe representarse mediante sus dos componentes rectangulares independientes: R_x y R_y.
* **Barra Homogénea:** Si el problema dice *"barra homogénea y uniforme de longitud L"*, su peso propio P = mg se ubica y dibuja estrictamente en su **punto medio geométrico (L/2)**. Si no es homogénea, el enunciado debe especificar la ubicación del centro de gravedad.
* **Elección Óptima del Pivote (O):** El error más común que consume tiempo es tomar momentos en un punto cualquiera. La regla de oro en admisión es: **tomar centro de momentos en el punto donde concurre el mayor número de fuerzas incógnitas que no nos interesa calcular** (habitualmente la articulación de apoyo), eliminándolas de la ecuación.
* **Unidades del Torque vs. Trabajo:** Pregunta recurrente: *"¿Se puede medir el torque en Joules?"* **¡NO!** El torque se mide en \text{N}\cdot\text{m}, jamás en joules, porque no es una transferencia escalar de energía sino un vector de rotación.
* **Cuerpo Apoyado a punto de Volcar:** En problemas donde un bloque o vehículo está a punto de volcarse alrededor de una arista, la fuerza normal y el rozamiento del piso se concentran **íntegramente en la arista de vuelco**, anulándose la normal en el resto de la base.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Condiciones de Equilibrio:**
   > **"PRIMERA PARALIZA TRASLACIÓN, SEGUNDA FRENA ROTACIÓN"**
   - 1.ª Condición: \sum \vec{F} = 0 \implies Cero aceleración lineal.
   - 2.ª Condición: \sum \vec{\tau} = 0 \implies Cero aceleración angular.

2. **Brazo de Palanca:**
   > **"DISTANCIA PERPENDICULAR AL TIRO"**
   - El brazo de palanca d no es la longitud de la barra, sino la distancia trazada **perpendicularmente** desde el pivote hasta la línea de acción de la fuerza.

3. **Teorema de Lamy:**
   > **"FUERZA SOBRE SENO DE SU FRENTE"**
   \frac{F}{\sin(\text{ángulo entre las otras dos})} = \text{cte}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Civil y Arquitectura (Cálculo de Armaduras y Puentes):** El dimensionamiento de vigas, puentes reticulados (método de los nudos y método de las secciones de Ritter) y rascacielos se fundamenta en la estática de cuerpos rígidos. Para que una estructura no colapse ante cargas vivas, cargas muertas o ráfagas de viento, las fuerzas de compresión y tracción en cada barra deben satisfacer simultáneamente las condiciones de equilibrio de traslación y rotación con factores de seguridad normativos.
* **Ortopedia y Biomecánica Musculoesquelética:** En el cuerpo humano, los músculos esqueléticos operan como palancas mecánicas de tercer género (desventaja mecánica de fuerza pero ventaja de amplitud y velocidad de movimiento). Para sostener un peso en la mano con el codo a 90^\circ, el músculo bíceps braquial debe ejercer una fuerza de tracción hacia arriba cerca de 6 a 8 veces superior al peso sostenido, debido a que su brazo de palanca respecto al eje articular del codo es de apenas 3-5\text{ cm}.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Ingenieril: Grúa Pluma y Tensión de Cable)
En las obras de ampliación del puente Chilina en Arequipa, se utiliza una grúa de pluma compuesta por una viga uniforme de acero de 4000\text{ N} de peso y 10\text{ metros} de longitud, articulada en su base inferior a un pivote fijo en el suelo. La pluma forma un ángulo de 45^\circ con el suelo horizontal. Un cable de acero horizontal sujeto al extremo superior de la pluma la sostiene en esa posición para evitar su caída. Si en dicho extremo superior cuelga verticalmente un bloque de hormigón de 6000\text{ N} de peso, determine la tensión horizontal que soporta el cable de acero.
A) 4000\text{ N}  
B) 6000\text{ N}  
C) 7000\text{ N}  
D) 8000\text{ N}  
E) 10\ 000\text{ N}  

* **Resolución:**
1. Identificamos las fuerzas actuantes sobre la viga:
   - Peso de la pluma: P_{\text{viga}} = 4000\text{ N} vertical hacia abajo en el punto medio (L/2 = 5\text{ m}).
   - Carga de hormigón: P_{\text{carga}} = 6000\text{ N} vertical hacia abajo en el extremo superior (L = 10\text{ m}).
   - Tensión horizontal del cable: \vec{T} hacia la izquierda en el extremo superior (L = 10\text{ m}).
   - Reacción en la articulación de la base (O).
2. Tomamos centro de momentos en el pivote de la base O (\sum \tau_O = 0):
   \sum \tau_{(\text{antihorarios})} = \sum \tau_{(\text{horarios})}
3. Calculamos los brazos de palanca:
   - Brazo de palanca de la tensión horizontal T: es la distancia vertical desde la base hasta la línea de acción horizontal superior:
     d_T = L \sin 45^\circ
     \tau_T = T \cdot (L \sin 45^\circ)
   - Brazos de palanca de los pesos verticales: son las distancias horizontales desde el pivote:
     d_{\text{viga}} = \frac{L}{2} \cos 45^\circ
     d_{\text{carga}} = L \cos 45^\circ
     \tau_{\text{horarios}} = P_{\text{viga}} \left(\frac{L}{2} \cos 45^\circ\right) + P_{\text{carga}} (L \cos 45^\circ)
4. Igualamos ambos miembros:
   T \cdot L \sin 45^\circ = (4000) \left(\frac{L}{2}\right) \cos 45^\circ + (6000) L \cos 45^\circ
   Como \sin 45^\circ = \cos 45^\circ y simplificando la longitud L:
   T = \frac{4000}{2} + 6000 = 2000 + 6000 = 8000\text{ N}
- La tensión en el cable es de **8000\text{ N}**.  
* **Respuesta:** D

---

### Pregunta 2 (Caso Ergonómico: Palanca de Primer Género en la Cabeza Humana)
En la cabeza humana, el peso de la cabeza (P = 50\text{ N}) actúa hacia abajo a lo largo de una línea de acción vertical ubicada a una distancia de d_1 = 4\text{ cm} hacia adelante del punto de articulación atlanto-occipital (la vértebra atlas actúa como pivote de apoyo). Para mantener la cabeza erguida en equilibrio estático horizontal sin que caiga hacia el pecho, los músculos extensores de la nuca (esplenio y trapecio) deben ejercer una fuerza de tracción vertical hacia abajo situada a d_2 = 2.5\text{ cm} por detrás de la articulación. ¿Cuál es el módulo de la fuerza muscular de tracción requerida y la fuerza de compresión total que soporta la primera vértebra cervical (atlas)?
A) F_{\text{músculo}} = 80\text{ N}; R_{\text{atlas}} = 130\text{ N}  
B) F_{\text{músculo}} = 50\text{ N}; R_{\text{atlas}} = 100\text{ N}  
C) F_{\text{músculo}} = 40\text{ N}; R_{\text{atlas}} = 90\text{ N}  
D) F_{\text{músculo}} = 100\text{ N}; R_{\text{atlas}} = 150\text{ N}  
E) F_{\text{músculo}} = 60\text{ N}; R_{\text{atlas}} = 110\text{ N}  

* **Resolución:**
1. Planteamos la Segunda Condición de Equilibrio (torque respecto a la articulación atlanto-occipital O):
   - El peso de la cabeza ejerce un momento horario:
     \tau_{\text{peso}} = P \times d_1 = (50\text{ N}) \times (4\text{ cm}) = 200\text{ N}\cdot\text{cm}
   - El músculo ejerce un momento antihorario:
     \tau_{\text{músculo}} = F_m \times d_2 = F_m \times (2.5\text{ cm})
   \tau_{\text{músculo}} = \tau_{\text{peso}} \implies 2.5 F_m = 200 \implies F_m = \frac{200}{2.5} = 80\text{ N}
2. Planteamos la Primera Condición de Equilibrio (eje vertical) para hallar la fuerza de compresión en el atlas (R):
   - Hacia abajo actúan el peso (50\text{ N}) y la fuerza muscular (80\text{ N}).
   - Hacia arriba actúa la reacción normal de soporte de la vértebra atlas (R):
     \sum F_y = 0 \implies R = P + F_m = 50\text{ N} + 80\text{ N} = 130\text{ N}
- La fuerza muscular es de 80\text{ N} y la compresión en la vértebra es de 130\text{ N}.  
* **Respuesta:** A

---
