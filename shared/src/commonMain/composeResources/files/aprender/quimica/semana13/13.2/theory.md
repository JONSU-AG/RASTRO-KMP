## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* t: Tiempo transcurrido en segundos (s).
* PE: Peso Equivalente de la sustancia liberada:
  PE = \frac{\overline{P.A.}}{\theta} \quad (\theta = \text{valencia o electrones transferidos por átomo})
* F: Constante de Faraday:
  1\text{ Faraday } (1\text{ F}) = 96\,485\text{ C/mol } e^- \approx 96\,500\text{ C} \equiv 1\text{ mol de electrones}

#### B. Segunda Ley de Faraday
"Cuando la misma cantidad de carga eléctrica atraviesa varias celdas electrolíticas conectadas en serie, las masas de las diferentes sustancias depositadas o liberadas en los electrodos son directamente proporcionales a sus respectivos pesos equivalentes":
\frac{m_1}{PE_1} = \frac{m_2}{PE_2} = \frac{m_3}{PE_3} = \dots = \#Eq\text{-}g = \frac{Q}{96\,500}

### 3.4. Celdas Galvánicas o Voltaicas (Pilas)
Transforman una reacción redox espontánea en energía eléctrica continua. El prototipo es la **Pila de Daniell (1836)**:
* **Semicelda Anódica (Oxidación):** Electrodo de Zinc sumergido en ZnSO_4 \ 1\text{ M}.
  Zn_{(s)} \to Zn^{2+}_{(ac)} + 2e^- \quad (\text{Ánodo, Polo Negativo, }-)
  *(La barra de zinc pierde masa al disolverse)*.
* **Semicelda Catódica (Reducción):** Electrodo de Cobre sumergido en CuSO_4 \ 1\text{ M}.
  Cu^{2+}_{(ac)} + 2e^- \to Cu_{(s)} \quad (\text{Cátodo, Polo Positivo, }+)
  *(La barra de cobre gana masa al depositarse el metal)*.
* **Circuito Externo:** Los electrones fluyen espontáneamente por el cable metálico desde el **Ánodo (- hacia el Cátodo (+))**.
* **Puente Salino (Tubo en U con gel agar-agar y KCl o KNO_3):**
  1. Cierra el circuito eléctrico permitiendo la migración iónica.
  2. Mantiene la neutralidad eléctrica en ambas soluciones (los aniones Cl^- viajan al ánodo para neutralizar el exceso de Zn^{2+}; los cationes K^+ viajan al cátodo para compensar el consumo de Cu^{2+}).
* **Notación Convencional de la Pila (Diagrama de Celda IUPAC):**
  \text{Ánodo} \mid \text{Electrolito Anódico} \parallel \text{Electrolito Catódico} \mid \text{Cátodo}
  Zn_{(s)} \mid Zn^{2+}_{(ac)} (1\text{ M}) \parallel Cu^{2+}_{(ac)} (1\text{ M}) \mid Cu_{(s)}

### 3.5. Potencial Estándar de Celda (E^\circ_{\text{celda}}) y Espontaneidad
El potencial estándar de reducción (E^\circ) se mide a condiciones estándar (25^\circ\text{C}, 1\text{ atm}, 1\text{ M}) frente al **Electrodo Estándar de Hidrógeno (EEH)**, al cual se le asigna arbitrariamente:
2H^+_{(ac)} (1\text{ M}) + 2e^- \rightleftharpoons H_{2(g)} (1\text{ atm}) \quad ; \quad E^\circ = 0.00\text{ V}

* **Fuerza Electromotriz de la Celda (FEM = E^\circ_{\text{celda}}):**
  E^\circ_{\text{celda}} = E^\circ_{\text{reducción}}(\text{Cátodo}) - E^\circ_{\text{reducción}}(\text{Ánodo})
  *(Ambos potenciales tomados estrictamente como potenciales estándar de reducción de tablas)*.
* **Criterio de Espontaneidad:**
  Una reacción redox es espontánea si el potencial de celda es estrictamente positivo:
  \Delta G^\circ = -n \cdot F \cdot E^\circ_{\text{celda}}
  * Si E^\circ_{\text{celda}} > 0 \implies \Delta G^\circ < 0 \implies Proceso **Espontáneo** (Celda Galvánica).
  * Si E^\circ_{\text{celda}} = 0 \implies \Delta G^\circ = 0 \implies Sistema en **Equilibrio** (Pila agotada).
  * Si E^\circ_{\text{celda}} < 0 \implies \Delta G^\circ > 0 \implies Proceso **No Espontáneo** (Requiere electrólisis).

* **Regla de Predicción:** La especie química con el potencial estándar de reducción más positivo (E^\circ_{\text{red}} mayor) tiene mayor avidez por electrones, por lo que **se reduce obligatoriamente en el cátodo** y actúa como mejor agente oxidante. La especie con menor E^\circ_{\text{red}} se invierte y **se oxida en el ánodo**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Celda Galvánica (Pila)** | **Negativo (-)** (Oxidación) | **Positivo (+)** (Reducción) | Del Ánodo al Cátodo (espontáneo) |

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Universal de Electrodos:**
  * **"AN-OX y CAT-RED"**:
    * **Án**odo \to **Ox**idación.
    * **Cát**odo \to **Red**ucción.
* **Mnemotecnia Signos en Pilas:**
  * En una Pila Galvánica: **"Ánodo es Negativo (P-A-N: Pila Ánodo Negativo)"**.
* **Hacking de Carga Eléctrica:**
  * 1\text{ mol de electrones} = 1\text{ Faraday} = 96\,500\text{ Culombios} = 1\text{ Equivalente-gramo}.
  * Con esta igualdad resuelves cualquier problema de electrólisis por regla de tres directa sin memorizar fórmulas complejas.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Multiplicar el valor del potencial E^\circ por el coeficiente estequiométrico.** ERROR CLÁSICO GRAVE. El potencial eléctrico E^\circ es una **propiedad intensiva**; si multiplicas una semirreacción por 2 o 3 para balancear electrones, el valor de E^\circ NO se multiplica (permanece idéntico).
* **Trampa 2: Usar minutos u horas en las leyes de Faraday.** En m = \frac{PE \cdot I \cdot t}{96\,500}, el tiempo t DEBE convertirse obligatoriamente a **segundos (s)**.
* **Trampa 3: Creer que el sodio se deposita al electrolizar salmuera (NaCl_{(ac)}).** En solución acuosa, el agua se reduce con mucha mayor facilidad que el Na^+ (E^\circ_{H_2O/H_2} = -0.83\text{ V} > E^\circ_{Na^+/Na} = -2.71\text{ V}), desprendiéndose gas hidrógeno (H_2) en el cátodo y formándose NaOH.

---
