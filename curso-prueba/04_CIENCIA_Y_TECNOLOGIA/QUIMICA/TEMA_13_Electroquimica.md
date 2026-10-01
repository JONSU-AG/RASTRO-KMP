# TEMA 13: Electroquímica

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química / Conversión de Energía Química y Eléctrica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Leyes cuantitativas de Faraday, Celdas Galvánicas, Potenciales Estándar y Espontaneidad)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.3 / 10

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ELECTROQUÍMICA
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
   CELDAS ELECTROLÍTICAS                                  CELDAS GALVÁNICAS O VOLTAICAS
(Energía Eléctrica -> Química / No espontánea)         (Energía Química -> Eléctrica / Espontánea)
         │                                                       │
• Electrólisis (sales fundidas y en solución acuosa)    • Pila de Daniell ($Zn / Cu$)
• Electrodos:                                           • Puente Salino ($KCl, KNO_3$)
  - Ánodo (+) -> Oxidación                              • Electrodos:
  - Cátodo (-) -> Reducción                               - Ánodo (-) -> Oxidación
         │                                                - Cátodo (+) -> Reducción
         ▼                                                       │
LEYES DE MICHAEL FARADAY                                         ▼
• 1.ª Ley:  $m = \frac{PE \cdot I \cdot t}{96\,500}$    POTENCIALES ESTÁNDAR ($E^\circ$)
• 2.ª Ley:  $\frac{m_1}{PE_1} = \frac{m_2}{PE_2}$       • Fuerza Electromotriz:  $E^\circ_{\text{celda}} = E^\circ_{\text{cátodo}} - E^\circ_{\text{ánodo}}$
• Constante: $1\text{ Faraday} = 96\,500\text{ C} \approx 1\text{ mol } e^-$ • Espontaneidad:  $\Delta G^\circ = -n F E^\circ_{\text{celda}} < 0 \iff E^\circ_{\text{celda}} > 0$
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Clasificación de Celdas Electroquímicas
La Electroquímica estudia la interconversión entre la energía química de las reacciones redox y la energía eléctrica de una corriente de electrones:
1. **Celda Electrolítica:** Sistema no espontáneo ($\Delta G > 0$) donde una corriente eléctrica continua externa (suministrada por una fuente o batería) induce una reacción química forzada de óxido-reducción.
2. **Celda Galvánica o Voltaica:** Dispositivo espontáneo ($\Delta G < 0$) que genera corriente eléctrica continua útil a partir de una reacción redox que ocurre de manera natural.

### 3.2. Celdas Electrolíticas y Electrólisis
Consta de una cuba o celda, un electrolito (sales o hidróxidos fundidos o en disolución acuosa) y dos electrodos sumergidos conectados a los polos de una fuente de corriente continua:
* **Ánodo (Polo Positivo, $+$):** Conectado al polo positivo de la fuente. Atrae a los aniones ($A^-$). En su superficie ocurre la **OXIDACIÓN** (pérdida de electrones).
* **Cátodo (Polo Negativo, $-$):** Conectado al polo negativo de la fuente. Atrae a los cationes ($C^+$). En su superficie ocurre la **REDUCCIÓN** (ganancia de electrones).
* *Regla Mnemotécnica Universal:* **"AN-OX y CAT-RED"**
  - **Án**odo $\to$ **Ox**idación.
  - **Cát**odo $\to$ **Red**ucción.
  *(Válido absolutamente para celdas electrolíticas y para celdas galvánicas)*.

#### A. Electrólisis de Sales Fundidas
Ejemplo clásico: Electrólisis del Cloruro de Sodio fundido ($NaCl_{(l)}$ seco a $801^\circ\text{C}$):
* Disociación: $NaCl_{(l)} \to Na^+ + Cl^-$
* Ánodo ($+$): $2Cl^- \to Cl_{2(g)}\uparrow + 2e^-$ (Oxidación, se desprende gas cloro).
* Cátodo ($-$): $2Na^+ + 2e^- \to 2Na_{(l)}$ (Reducción, se deposita sodio metálico líquido).
* Ecuación global: $2NaCl_{(l)} \xrightarrow{\text{electrólisis}} 2Na_{(l)} + Cl_{2(g)}\uparrow$

#### B. Electrólisis de Soluciones Acuosas (Competencia con el Agua)
En disolución acuosa, las moléculas de agua compiten con los iones del soluto en las semirreacciones:
* **En el Cátodo (Competencia de Reducción):**
  * Si el catión es de metales muy reactivos (Grupos IA, IIA y $Al^{3+}$), estos iones **NO se reducen** en agua; en su lugar, el agua se reduce liberando **gas hidrógeno ($H_2$)**:
    $$2H_2O_{(l)} + 2e^- \to H_{2(g)}\uparrow + 2OH^-_{(ac)}$$
  * Los cationes de metales menos activos ($Cu^{2+}, Ag^+, Au^{3+}, Ni^{2+}, Sn^{2+}, Pb^{2+}$) sí se reducen y se depositan como metal puro sobre el cátodo.
* **En el Ánodo (Competencia de Oxidación):**
  * Los aniones oxigenados estables ($SO_4^{2-}, NO_3^-, CO_3^{2-}, ClO_4^-$) y el fluoruro ($F^-$) **NO se oxidan**; en su lugar, el agua se oxida liberando **gas oxígeno ($O_2$)**:
    $$2H_2O_{(l)} \to O_{2(g)}\uparrow + 4H^+_{(ac)} + 4e^-$$
  * Los aniones no oxigenados ($Cl^-, Br^-, I^-$) se oxidan preferentemente frente al agua produciendo $Cl_2, Br_2, I_2$.

### 3.3. Leyes Cuantitativas de Michael Faraday (1833)

#### A. Primera Ley de Faraday
"La masa de una sustancia que se deposita o libera en un electrodo durante la electrólisis es directamente proporcional a la cantidad total de carga eléctrica ($Q$) que atraviesa la celda":
$$m \propto Q \implies m = \frac{PE}{F} \cdot Q = \frac{PE \cdot I \cdot t}{96\,500}$$
Donde:
* $m$: Masa depositada o desprendida en gramos ($g$).
* $Q$: Carga eléctrica en Culombios ($C$). Se cumple: $Q = I \cdot t$.
* $I$: Intensidad de corriente eléctrica en Amperios ($A$).
* $t$: Tiempo transcurrido en segundos ($s$).
* $PE$: Peso Equivalente de la sustancia liberada:
  $$PE = \frac{\overline{P.A.}}{\theta} \quad (\theta = \text{valencia o electrones transferidos por átomo})$$
* $F$: Constante de Faraday:
  $$1\text{ Faraday } (1\text{ F}) = 96\,485\text{ C/mol } e^- \approx 96\,500\text{ C} \equiv 1\text{ mol de electrones}$$

#### B. Segunda Ley de Faraday
"Cuando la misma cantidad de carga eléctrica atraviesa varias celdas electrolíticas conectadas en serie, las masas de las diferentes sustancias depositadas o liberadas en los electrodos son directamente proporcionales a sus respectivos pesos equivalentes":
$$\frac{m_1}{PE_1} = \frac{m_2}{PE_2} = \frac{m_3}{PE_3} = \dots = \#Eq\text{-}g = \frac{Q}{96\,500}$$

### 3.4. Celdas Galvánicas o Voltaicas (Pilas)
Transforman una reacción redox espontánea en energía eléctrica continua. El prototipo es la **Pila de Daniell (1836)**:
* **Semicelda Anódica (Oxidación):** Electrodo de Zinc sumergido en $ZnSO_4 \ 1\text{ M}$.
  $$Zn_{(s)} \to Zn^{2+}_{(ac)} + 2e^- \quad (\text{Ánodo, Polo Negativo, }-)$$
  *(La barra de zinc pierde masa al disolverse)*.
* **Semicelda Catódica (Reducción):** Electrodo de Cobre sumergido en $CuSO_4 \ 1\text{ M}$.
  $$Cu^{2+}_{(ac)} + 2e^- \to Cu_{(s)} \quad (\text{Cátodo, Polo Positivo, }+)$$
  *(La barra de cobre gana masa al depositarse el metal)*.
* **Circuito Externo:** Los electrones fluyen espontáneamente por el cable metálico desde el **Ánodo ($-$ hacia el Cátodo ($+)$)**.
* **Puente Salino (Tubo en U con gel agar-agar y $KCl$ o $KNO_3$):**
  1. Cierra el circuito eléctrico permitiendo la migración iónica.
  2. Mantiene la neutralidad eléctrica en ambas soluciones (los aniones $Cl^-$ viajan al ánodo para neutralizar el exceso de $Zn^{2+}$; los cationes $K^+$ viajan al cátodo para compensar el consumo de $Cu^{2+}$).
* **Notación Convencional de la Pila (Diagrama de Celda IUPAC):**
  $$\text{Ánodo} \mid \text{Electrolito Anódico} \parallel \text{Electrolito Catódico} \mid \text{Cátodo}$$
  $$Zn_{(s)} \mid Zn^{2+}_{(ac)} (1\text{ M}) \parallel Cu^{2+}_{(ac)} (1\text{ M}) \mid Cu_{(s)}$$

### 3.5. Potencial Estándar de Celda ($E^\circ_{\text{celda}}$) y Espontaneidad
El potencial estándar de reducción ($E^\circ$) se mide a condiciones estándar ($25^\circ\text{C}, 1\text{ atm}, 1\text{ M}$) frente al **Electrodo Estándar de Hidrógeno (EEH)**, al cual se le asigna arbitrariamente:
$$2H^+_{(ac)} (1\text{ M}) + 2e^- \rightleftharpoons H_{2(g)} (1\text{ atm}) \quad ; \quad E^\circ = 0.00\text{ V}$$

* **Fuerza Electromotriz de la Celda ($FEM = E^\circ_{\text{celda}}$):**
  $$E^\circ_{\text{celda}} = E^\circ_{\text{reducción}}(\text{Cátodo}) - E^\circ_{\text{reducción}}(\text{Ánodo})$$
  *(Ambos potenciales tomados estrictamente como potenciales estándar de reducción de tablas)*.
* **Criterio de Espontaneidad:**
  Una reacción redox es espontánea si el potencial de celda es estrictamente positivo:
  $$\Delta G^\circ = -n \cdot F \cdot E^\circ_{\text{celda}}$$
  * Si $E^\circ_{\text{celda}} > 0 \implies \Delta G^\circ < 0 \implies$ Proceso **Espontáneo** (Celda Galvánica).
  * Si $E^\circ_{\text{celda}} = 0 \implies \Delta G^\circ = 0 \implies$ Sistema en **Equilibrio** (Pila agotada).
  * Si $E^\circ_{\text{celda}} < 0 \implies \Delta G^\circ > 0 \implies$ Proceso **No Espontáneo** (Requiere electrólisis).

* **Regla de Predicción:** La especie química con el potencial estándar de reducción más positivo ($E^\circ_{\text{red}}$ mayor) tiene mayor avidez por electrones, por lo que **se reduce obligatoriamente en el cátodo** y actúa como mejor agente oxidante. La especie con menor $E^\circ_{\text{red}}$ se invierte y **se oxida en el ánodo**.

---

## 4. SIGNOS DE LOS ELECTRODOS SEGÚN EL TIPO DE CELDA
| Tipo de Celda | Ánodo (Proceso) | Cátodo (Proceso) | Flujo de Electrones |
| :--- | :---: | :---: | :---: |
| **Celda Electrolítica** | **Positivo ($+$)** (Oxidación) | **Negativo ($-$)** (Reducción) | Del Ánodo al Cátodo (por la fuente) |
| **Celda Galvánica (Pila)** | **Negativo ($-$)** (Oxidación) | **Positivo ($+$)** (Reducción) | Del Ánodo al Cátodo (espontáneo) |

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Multiplicar el valor del potencial $E^\circ$ por el coeficiente estequiométrico.** ERROR CLÁSICO GRAVE. El potencial eléctrico $E^\circ$ es una **propiedad intensiva**; si multiplicas una semirreacción por 2 o 3 para balancear electrones, el valor de $E^\circ$ NO se multiplica (permanece idéntico).
* **Trampa 2: Usar minutos u horas en las leyes de Faraday.** En $m = \frac{PE \cdot I \cdot t}{96\,500}$, el tiempo $t$ DEBE convertirse obligatoriamente a **segundos ($s$)**.
* **Trampa 3: Creer que el sodio se deposita al electrolizar salmuera ($NaCl_{(ac)}$).** En solución acuosa, el agua se reduce con mucha mayor facilidad que el $Na^+$ ($E^\circ_{H_2O/H_2} = -0.83\text{ V} > E^\circ_{Na^+/Na} = -2.71\text{ V}$), desprendiéndose gas hidrógeno ($H_2$) en el cátodo y formándose $NaOH$.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Universal de Electrodos:**
  * **"AN-OX y CAT-RED"**:
    * **Án**odo $\to$ **Ox**idación.
    * **Cát**odo $\to$ **Red**ucción.
* **Mnemotecnia Signos en Pilas:**
  * En una Pila Galvánica: **"Ánodo es Negativo (P-A-N: Pila Ánodo Negativo)"**.
* **Hacking de Carga Eléctrica:**
  * $1\text{ mol de electrones} = 1\text{ Faraday} = 96\,500\text{ Culombios} = 1\text{ Equivalente-gramo}$.
  * Con esta igualdad resuelves cualquier problema de electrólisis por regla de tres directa sin memorizar fórmulas complejas.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Primera Ley de Faraday)
Durante la galvanoplastia de una pieza metálica, se hace circular una corriente continua constante de $9.65\text{ Amperios}$ a través de una disolución acuosa de sulfato de cobre (II) ($CuSO_4$) durante $1000\text{ segundos}$. Calcule la masa en gramos de cobre metálico purificado depositada en el cátodo.
*(Masa atómica del Cobre: $Cu = 63.5$; $1\text{ F} = 96\,500\text{ C}$)*.

* **Resolución:**
  1. Identificamos la semirreacción catódica del cobre:
     $$Cu^{2+}_{(ac)} + 2e^- \to Cu_{(s)}$$
     El parámetro de valencia es $\theta = 2$ electrones transferidos.
  2. Cálculo del Peso Equivalente ($PE$) del cobre:
     $$PE = \frac{\overline{P.A.}}{\theta} = \frac{63.5}{2} = 31.75\text{ g/Eq-g}$$
  3. Cálculo de la carga eléctrica ($Q$):
     $$Q = I \cdot t = 9.65\text{ A} \times 1000\text{ s} = 9650\text{ Culombios}$$
  4. Aplicación de la 1.ª Ley de Faraday:
     $$m = \frac{PE \cdot Q}{96\,500} = \frac{31.75 \times 9650}{96\,500} = \frac{31.75}{10} = 3.175\text{ g}$$
* **Respuesta:** Se depositan $3.175\text{ g}$ de cobre metálico.

---

### Problema 2 (Nivel Intermedio - Volumen de Gas Desprendido en Electrólisis)
Se realiza la electrólisis de agua acidulada con ácido sulfúrico diluido. Si se hace pasar una carga de $19\,300\text{ Culombios}$, determine el volumen total de gas oxígeno ($O_2$) desprendido en el ánodo medido a Condiciones Normales.
*(Masa atómica: $O = 16$; $1\text{ F} = 96\,500\text{ C}$)*.

* **Resolución:**
  1. Semirreacción anódica de oxidación del agua:
     $$2H_2O_{(l)} \to O_{2(g)}\uparrow + 4H^+_{(ac)} + 4e^-$$
     Por cada $1\text{ mol de } O_2$ producido se transfieren $4\text{ moles de electrones}$ ($\theta = 4$).
  2. A Condiciones Normales: $1\text{ mol de } O_2 = 22.4\text{ Litros}$.
     Por tanto, $4\text{ Faradays}$ ($4 \times 96\,500\text{ C}$) desprenden $22.4\text{ L de } O_2$ en C.N.
  3. Planteamos una regla de tres directa:
     $$4 \times 96\,500\text{ C} \longrightarrow 22.4\text{ L de } O_2$$
     $$19\,300\text{ C} \longrightarrow V(O_2)$$
  4. Despejamos el volumen:
     $$V(O_2) = \frac{19\,300 \times 22.4}{4 \times 96\,500} = \frac{1 \times 22.4}{4 \times 5} = \frac{22.4}{20} = 1.12\text{ Litros}$$
* **Respuesta:** Se desprenden $1.12\text{ Litros}$ de gas $O_2$ a Condiciones Normales.

---

### Problema 3 (Nivel Intermedio - Celdas en Serie y Segunda Ley de Faraday)
Dos celdas electrolíticas se conectan en serie. La primera celda contiene una solución acuosa de nitrato de plata ($AgNO_3$) y la segunda celda contiene una solución de cloruro de níquel (II) ($NiCl_2$). Si al cabo de un tiempo se depositan $21.6\text{ g}$ de plata metálica en el cátodo de la primera celda, determine la masa de níquel depositada en la segunda celda.
*(Masas atómicas: $Ag = 108, Ni = 58.7$)*.

* **Resolución:**
  1. Al estar conectadas en serie, la carga eléctrica que atraviesa ambas celdas es exactamente la misma ($Q_1 = Q_2$).
  2. Según la 2.ª Ley de Faraday, el número de equivalentes-gramo de plata y níquel son idénticos:
     $$\#Eq\text{-}g(Ag) = \#Eq\text{-}g(Ni) \implies \frac{m(Ag)}{PE(Ag)} = \frac{m(Ni)}{PE(Ni)}$$
  3. Cálculo de los Pesos Equivalentes:
     * Para la plata ($Ag^+ + 1e^- \to Ag$): $\theta = 1 \implies PE(Ag) = \frac{108}{1} = 108\text{ g/Eq-g}$.
     * Para el níquel ($Ni^{2+} + 2e^- \to Ni$): $\theta = 2 \implies PE(Ni) = \frac{58.7}{2} = 29.35\text{ g/Eq-g}$.
  4. Sustituimos valores y despejamos la masa de níquel:
     $$\frac{21.6\text{ g}}{108\text{ g/Eq-g}} = \frac{m(Ni)}{29.35\text{ g/Eq-g}}$$
     $$0.20 = \frac{m(Ni)}{29.35} \implies m(Ni) = 0.20 \times 29.35 = 5.87\text{ g}$$
* **Respuesta:** Se depositan $5.87\text{ g}$ de níquel metálico.

---

### Problema 4 (Nivel Avanzado - Potencial Estándar y Espontaneidad de una Pila)
Se construye una celda galvánica estándar a $25^\circ\text{C}$ con electrodos de plomo y cromo sumergidos en disoluciones de sus respectivos cationes. Se conocen los siguientes potenciales estándar de reducción:
* $Pb^{2+}_{(ac)} + 2e^- \to Pb_{(s)} \quad ; \quad E^\circ = -0.13\text{ V}$
* $Cr^{3+}_{(ac)} + 3e^- \to Cr_{(s)} \quad ; \quad E^\circ = -0.74\text{ V}$
a) Identifique el ánodo y el cátodo de la celda galvánica.
b) Escriba la ecuación redox global balanceada.
c) Calcule el potencial estándar de la celda ($E^\circ_{\text{celda}}$) e indique si el proceso es espontáneo.

* **Resolución:**
  1. a) Comparación de potenciales estándar de reducción:
     Como $-0.13\text{ V} > -0.74\text{ V}$, el ión plomo ($Pb^{2+}$) tiene mayor tendencia a reducirse.
     * **Cátodo (Reducción):** $Pb^{2+}_{(ac)} + 2e^- \to Pb_{(s)}$ ($E^\circ = -0.13\text{ V}$).
     * **Ánodo (Oxidación):** El cromo se oxida invirtiendo su semirreacción:
       $$Cr_{(s)} \to Cr^{3+}_{(ac)} + 3e^-$$
  2. b) Balance electrónico de la ecuación global:
     Multiplicamos la reducción por 3 y la oxidación por 2 para transferir $6e^-$:
     * Reducción: $3Pb^{2+}_{(ac)} + 6e^- \to 3Pb_{(s)}$
     * Oxidación: $2Cr_{(s)} \to 2Cr^{3+}_{(ac)} + 6e^-$
     * **Ecuación Global:**
       $$2Cr_{(s)} + 3Pb^{2+}_{(ac)} \to 2Cr^{3+}_{(ac)} + 3Pb_{(s)}$$
  3. c) Cálculo de la fuerza electromotriz estándar ($E^\circ_{\text{celda}}$):
     $$E^\circ_{\text{celda}} = E^\circ_{\text{cátodo}} - E^\circ_{\text{ánodo}} = (-0.13\text{ V}) - (-0.74\text{ V})$$
     $$E^\circ_{\text{celda}} = -0.13 + 0.74 = +0.61\text{ Voltios}$$
     Como $E^\circ_{\text{celda}} = +0.61\text{ V} > 0$, el proceso es termodinámicamente **espontáneo** ($\Delta G^\circ < 0$).
* **Respuesta:** Ánodo: Cromo; Cátodo: Plomo; $E^\circ_{\text{celda}} = +0.61\text{ V}$ (proceso espontáneo).

---

### Problema 5 (Nivel Reto UNSA / UNI - Eficiencia de Corriente y Ley de Faraday de Gases)
Para refinar cobre impuro se opera una celda electrolítica industrial durante 5 horas con una corriente eléctrica de $53.6\text{ Amperios}$. Si se determina experimentalmente que la masa de cobre puro depositada en el cátodo fue de $285.75\text{ g}$, determine la eficiencia de corriente (rendimiento faradaico, $\% \eta$) de la planta electrolítica.
*(Masa atómica del Cobre: $Cu = 63.5$; $1\text{ F} = 96\,500\text{ C}$)*.

* **Resolución:**
  1. Conversión del tiempo a segundos:
     $$t = 5\text{ horas} \times 3600\text{ s/h} = 18\,000\text{ segundos}$$
  2. Cálculo de la carga eléctrica teórica suministrada ($Q_{\text{total}}$):
     $$Q = I \cdot t = 53.6\text{ A} \times 18\,000\text{ s} = 964\,800\text{ Culombios}$$
  3. Conversión a número de Faradays:
     $$\text{Faradays} = \frac{964\,800\text{ C}}{96\,500\text{ C/F}} \approx 10.0\text{ Faradays}$$
  4. Cálculo de la masa teórica de cobre que debió depositarse con el $100\%$ de rendimiento:
     Para el $Cu^{2+}$ ($\theta = 2$):
     $$PE(Cu) = \frac{63.5}{2} = 31.75\text{ g/Eq-g}$$
     $$m_{\text{teórica}} = \text{Faradays} \times PE = 10.0 \times 31.75 = 317.5\text{ g de } Cu$$
  5. Cálculo de la eficiencia de corriente ($\% \eta$):
     $$\% \eta = \frac{m_{\text{real}}}{m_{\text{teórica}}} \times 100\%$$
     $$\% \eta = \frac{285.75\text{ g}}{317.5\text{ g}} \times 100\% = 0.90 \times 100\% = 90.0\%$$
* **Respuesta:** La eficiencia de corriente del proceso electrolítico es del $90.0\%$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Electrólisis:** Fenómeno químico no espontáneo inducido por una corriente eléctrica continua que descompone electrolitos fundidos o disueltos.
2. **Celda Galvánica:** Sistema electroquímico espontáneo que genera una diferencia de potencial eléctrico a partir de reacciones redox.
3. **Ánodo:** Electrodo en cuya superficie se produce la semirreacción de oxidación (pérdida de electrones).
4. **Cátodo:** Electrodo en cuya superficie ocurre la semirreacción de reducción (ganancia de electrones).
5. **Constante de Faraday:** Magnitud de la carga eléctrica contenida en un mol de electrones ($96\,485\text{ C} \approx 96\,500\text{ C}$).
6. **Puente Salino:** Conductor electrolítico que conecta dos semiceldas galvánicas evitando la acumulación de cargas y cerrando el circuito.
7. **Potencial Estándar de Reducción ($E^\circ$):** Medida en voltios de la tendencia de una sustancia a reducirse a $25^\circ\text{C}, 1\text{ atm}$ y concentración $1\text{ M}$.
8. **Fuerza Electromotriz (FEM):** Máxima diferencia de potencial eléctrico medible entre los electrodos de una celda galvánica.
9. **Galvanoplastia:** Técnica electroquímica utilizada para recubrir un objeto con una capa delgada de metal protector o decorativo.
10. **Eficiencia Faradaica:** Porcentaje de corriente eléctrica que se aprovecha efectivamente en la semirreacción deseada sin pérdidas colaterales.

---

## 9. FLASHCARDS
* **Front:** ¿Qué fenómeno redox ocurre siempre en el ánodo y en el cátodo sin importar el tipo de celda?
  * **Back:** En el **Ánodo** ocurre siempre la **Oxidación** (AN-OX); en el **Cátodo** ocurre siempre la **Reducción** (CAT-RED).
* **Front:** ¿Cuál es la equivalencia fundamental entre Faradays, Culombios y moles de electrones?
  * **Back:** $1\text{ Faraday } (1\text{ F}) = 96\,500\text{ Culombios} = 1\text{ mol de electrones} = 1\text{ Equivalente-gramo}$.
* **Front:** ¿Cómo se calcula la fuerza electromotriz estándar ($E^\circ_{\text{celda}}$) de una pila galvánica?
  * **Back:** $E^\circ_{\text{celda}} = E^\circ_{\text{cátodo}} - E^\circ_{\text{ánodo}}$ (utilizando potenciales estándar de reducción).
* **Front:** ¿Qué signos adoptan el ánodo y el cátodo en una celda galvánica y en una celda electrolítica?
  * **Back:** En Celda Galvánica: Ánodo ($-$), Cátodo ($+$). En Celda Electrolítica: Ánodo ($+$), Cátodo ($-$).
* **Front:** ¿Qué gas se desprende en el cátodo al electrolizar una solución acuosa de $NaCl$ (salmuera)?
  * **Back:** Se desprende **gas hidrógeno ($H_2$)**, porque el agua se reduce con mayor facilidad que los cationes $Na^+$.

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_13",
  "titulo": "Electroquímica",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuántos Faradays se requieren para depositar 1 mol de aluminio metálico (Al) a partir de Al3+?",
      "opciones": ["1 Faraday", "2 Faradays", "3 Faradays", "6 Faradays"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Al3+ + 3e- -> Al(s). Cada mol de Al requiere 3 moles de electrones, lo que equivale a 3 Faradays."
    },
    {
      "id": "q2",
      "pregunta": "En una celda galvánica (pila), el electrodo donde ocurre la oxidación es:",
      "opciones": ["El cátodo positivo", "El cátodo negativo", "El ánodo negativo", "El ánodo positivo"],
      "respuesta_correcta": 2,
      "retroalimentacion": "En las celdas galvánicas, la oxidación ocurre en el ánodo, el cual posee polaridad negativa."
    },
    {
      "id": "q3",
      "pregunta": "Si una celda galvánica tiene E°(cátodo) = +0.80 V y E°(ánodo) = -0.76 V, el potencial de celda es:",
      "opciones": ["+0.04 V", "+1.56 V", "-1.56 V", "+0.78 V"],
      "respuesta_correcta": 1,
      "retroalimentacion": "E°celda = E°cátodo - E°ánodo = 0.80 V - (-0.76 V) = 0.80 + 0.76 = +1.56 V."
    }
  ]
}
```
