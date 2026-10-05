## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química del Estado Gaseoso
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Ecuación universal, procesos restringidos, presiones parciales y difusión de Graham)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.4 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ESTADO GASEOSO
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
TEORÍA CINÉTICO-MOLECULAR (TCM)                         LEYES DE LOS GASES IDEALES
• Choques perfectamente elásticos                       • Ley de Boyle-Mariotte (T = \text{cte}, Isotérmico)
• Volumen molecular despreciable                        • Ley de Charles (P = \text{cte}, Isobárico)
• Sin fuerzas intermoleculares (F_a = F_r = 0)        • Ley de Gay-Lussac (V = \text{cte}, Isocórico)
• E_k \propto T (Kelvin)                               • Ecuación Combinada: \frac{P_1 V_1}{T_1} = \frac{P_2 V_2}{T_2}
                                                                 │
         ┌───────────────────────────────────────────────────────┘
         ▼
ECUACIÓN UNIVERSAL DE LOS GASES:  P \cdot V = n \cdot R \cdot T
• Densidad de un gas:  P \cdot \overline{M} = \rho \cdot R \cdot T
• Constante Universal (R):
  - R = 0.082\text{ atm}\cdot\text{L}/(\text{mol}\cdot\text{K})
  - R = 62.4\text{ mmHg}\cdot\text{L}/(\text{mol}\cdot\text{K})
  - R = 8.314\text{ J}/(\text{mol}\cdot\text{K})
         │
         ▼
MEZCLAS DE GASES Y DIFUSIÓN
• Ley de las Presiones Parciales de Dalton:  P_{\text{total}} = \sum P_i  ;  P_i = x_i \cdot P_{\text{total}}
• Ley de los Volúmenes Parciales de Amagat:  V_{\text{total}} = \sum V_i  ;  V_i = x_i \cdot V_{\text{total}}
• Masa Molar Aparente de la Mezcla:  \overline{M}_{\text{mezcla}} = \sum (x_i \cdot \overline{M}_i)
• Ley de Efusión y Difusión de Graham:  \frac{v_1}{v_2} = \sqrt{\frac{\overline{M}_2}{\overline{M}_1}}
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Postulados de la Teoría Cinético-Molecular de los Gases Ideales (Clausius, Maxwell, Boltzmann)
Un gas real se aproxima al comportamiento de un **gas ideal** a condiciones de **baja presión (P \to 0)** y **alta temperatura (T \gg 0)**:
1. Los gases están constituidos por partículas puntiformes pequeñísimas (moléculas o átomos) separadas por distancias enormes comparadas con sus diámetros. El volumen propio de las partículas se considera matemáticamente despreciable respecto al volumen total del recipiente (V_{\text{gas}} \approx V_{\text{recipiente}}).
2. Las moléculas se encuentran en movimiento caótico, continuo y rectilíneo al azar en todas las direcciones del espacio.
3. Las fuerzas de atracción y repulsión intermolecular (cohesión y Van der Waals) son totalmente nulas (F_c = F_r = 0).
4. Los choques intermoleculares y contra las paredes del recipiente son **perfectamente elásticos**: no hay pérdida neta de energía cinética total (\Delta E_k = 0).
5. La energía cinética media de traslación de las moléculas es directamente proporcional a la **Temperatura Absoluta** (T en Kelvin):
   \overline{E}_k = \frac{1}{2} m \overline{v}^2 = \frac{3}{2} k_B T
   *(Donde k_B es la constante de Boltzmann k_B = R/N_A = 1.38 \times 10^{-23}\text{ J/K})*.

### 3.2. Variables de Estado de un Gas
* **Presión (P):** Fuerza que ejercen los choques moleculares por unidad de área de superficie:
  1\text{ atm} = 760\text{ mmHg} = 760\text{ Torr} = 101.325\text{ kPa} \approx 10^5\text{ Pa}
* **Volumen (V):** Espacio disponible que ocupa el gas (volumen del recipiente):
  1\text{ m}^3 = 1000\text{ L} = 10^6\text{ mL} = 10^6\text{ cm}^3
* **Temperatura Absoluta (T):** Medida de la agitación cinética media:
  T(\text{K}) = T(^\circ\text{C}) + 273.15 \approx T(^\circ\text{C}) + 273
  *(Jamás operar leyes de gases con grados Celsius)*.
* **Cantidad de sustancia (n):** Número de moles de gas:
  n = \frac{m}{\overline{M}}

### 3.3. Leyes Empíricas de los Gases Ideales (Procesos Restringidos)

#### A. Ley de Boyle - Mariotte (Proceso Isotérmico: T = \text{constante}, n = \text{constante})
"A temperatura y masa constantes, el volumen de una masa gaseosa es inversamente proporcional a la presión absoluta que soporta":
P \cdot V = k \implies P_1 \cdot V_1 = P_2 \cdot V_2
* Gráfica P vs V: Rama de hipérbola equilátera (Isoterma).

#### B. Ley de Charles (Proceso Isobárico: P = \text{constante}, n = \text{constante})
"A presión y masa constantes, el volumen de un gas varía en forma directamente proporcional a su temperatura absoluta":
\frac{V}{T} = k \implies \frac{V_1}{T_1} = \frac{V_2}{T_2}
* Gráfica V vs T: Línea recta que converge al cero absoluto (0\text{ K}) (Isobara).

#### C. Ley de Gay-Lussac (Proceso Isocórico o Isométrico: V = \text{constante}, n = \text{constante})
"A volumen y masa constantes, la presión absoluta de un gas es directamente proporcional a su temperatura absoluta":
\frac{P}{T} = k \implies \frac{P_1}{T_1} = \frac{P_2}{T_2}
* Gráfica P vs T: Línea recta orientada hacia el origen absoluto (Isócora).

#### D. Ecuación Combinada de los Gases
Relaciona dos estados de una misma masa fija de gas (n = \text{constante}):
\frac{P_1 \cdot V_1}{T_1} = \frac{P_2 \cdot V_2}{T_2}

### 3.4. Ecuación de Estado del Gas Ideal (Ecuación Universal)
Unifica todas las variables termodinámicas para cualquier sistema gaseoso ideal:
P \cdot V = n \cdot R \cdot T

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. GASES REALES Y FACTOR DE COMPRESIBILIDAD (Z)
Para gases reales bajo presiones moderadas o altas, las moléculas sí ocupan volumen propio y sí existen fuerzas de atracción intermolecular. Se define el **Factor de Compresibilidad (Z)**:
Z = \frac{P \cdot V}{n \cdot R \cdot T}
* Si Z = 1: El gas se comporta como estrictamente ideal.
* Si Z > 1: Predominan las fuerzas de repulsión volumétrica (gas difícil de comprimir).
* Si Z < 1: Predominan las fuerzas de atracción intermolecular (gas fácilmente licuable).
