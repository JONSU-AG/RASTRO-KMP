## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
• Electrólisis (sales fundidas y en solución acuosa)    • Pila de Daniell (Zn / Cu)
• Electrodos:                                           • Puente Salino (KCl, KNO_3)
  - Ánodo (+) -> Oxidación                              • Electrodos:
  - Cátodo (-) -> Reducción                               - Ánodo (-) -> Oxidación
         │                                                - Cátodo (+) -> Reducción
         ▼                                                       │
LEYES DE MICHAEL FARADAY                                         ▼
• 1.ª Ley:  m = \frac{PE \cdot I \cdot t}{96\,500}    POTENCIALES ESTÁNDAR (E^\circ)
• 2.ª Ley:  \frac{m_1}{PE_1} = \frac{m_2}{PE_2}       • Fuerza Electromotriz:  E^\circ_{\text{celda}} = E^\circ_{\text{cátodo}} - E^\circ_{\text{ánodo}}
• Constante: 1\text{ Faraday} = 96\,500\text{ C} \approx 1\text{ mol } e^- • Espontaneidad:  \Delta G^\circ = -n F E^\circ_{\text{celda}} < 0 \iff E^\circ_{\text{celda}} > 0
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Clasificación de Celdas Electroquímicas
La Electroquímica estudia la interconversión entre la energía química de las reacciones redox y la energía eléctrica de una corriente de electrones:
1. **Celda Electrolítica:** Sistema no espontáneo (\Delta G > 0) donde una corriente eléctrica continua externa (suministrada por una fuente o batería) induce una reacción química forzada de óxido-reducción.
2. **Celda Galvánica o Voltaica:** Dispositivo espontáneo (\Delta G < 0) que genera corriente eléctrica continua útil a partir de una reacción redox que ocurre de manera natural.

### 3.2. Celdas Electrolíticas y Electrólisis
Consta de una cuba o celda, un electrolito (sales o hidróxidos fundidos o en disolución acuosa) y dos electrodos sumergidos conectados a los polos de una fuente de corriente continua:
* **Ánodo (Polo Positivo, +):** Conectado al polo positivo de la fuente. Atrae a los aniones (A^-). En su superficie ocurre la **OXIDACIÓN** (pérdida de electrones).
* **Cátodo (Polo Negativo, -):** Conectado al polo negativo de la fuente. Atrae a los cationes (C^+). En su superficie ocurre la **REDUCCIÓN** (ganancia de electrones).
* *Regla Mnemotécnica Universal:* **"AN-OX y CAT-RED"**
  - **Án**odo \to **Ox**idación.
  - **Cát**odo \to **Red**ucción.
  *(Válido absolutamente para celdas electrolíticas y para celdas galvánicas)*.

#### A. Electrólisis de Sales Fundidas
Ejemplo clásico: Electrólisis del Cloruro de Sodio fundido (NaCl_{(l)} seco a 801^\circ\text{C}):
* Disociación: NaCl_{(l)} \to Na^+ + Cl^-
* Ánodo (+): 2Cl^- \to Cl_{2(g)}\uparrow + 2e^- (Oxidación, se desprende gas cloro).
* Cátodo (-): 2Na^+ + 2e^- \to 2Na_{(l)} (Reducción, se deposita sodio metálico líquido).
* Ecuación global: 2NaCl_{(l)} \xrightarrow{\text{electrólisis}} 2Na_{(l)} + Cl_{2(g)}\uparrow

#### B. Electrólisis de Soluciones Acuosas (Competencia con el Agua)
En disolución acuosa, las moléculas de agua compiten con los iones del soluto en las semirreacciones:
* **En el Cátodo (Competencia de Reducción):**
  * Si el catión es de metales muy reactivos (Grupos IA, IIA y Al^{3+}), estos iones **NO se reducen** en agua; en su lugar, el agua se reduce liberando **gas hidrógeno (H_2)**:
    2H_2O_{(l)} + 2e^- \to H_{2(g)}\uparrow + 2OH^-_{(ac)}
  * Los cationes de metales menos activos (Cu^{2+}, Ag^+, Au^{3+}, Ni^{2+}, Sn^{2+}, Pb^{2+}) sí se reducen y se depositan como metal puro sobre el cátodo.
* **En el Ánodo (Competencia de Oxidación):**
  * Los aniones oxigenados estables (SO_4^{2-}, NO_3^-, CO_3^{2-}, ClO_4^-) y el fluoruro (F^-) **NO se oxidan**; en su lugar, el agua se oxida liberando **gas oxígeno (O_2)**:
    2H_2O_{(l)} \to O_{2(g)}\uparrow + 4H^+_{(ac)} + 4e^-
  * Los aniones no oxigenados (Cl^-, Br^-, I^-) se oxidan preferentemente frente al agua produciendo Cl_2, Br_2, I_2.

### 3.3. Leyes Cuantitativas de Michael Faraday (1833)

#### A. Primera Ley de Faraday
"La masa de una sustancia que se deposita o libera en un electrodo durante la electrólisis es directamente proporcional a la cantidad total de carga eléctrica (Q) que atraviesa la celda":
m \propto Q \implies m = \frac{PE}{F} \cdot Q = \frac{PE \cdot I \cdot t}{96\,500}
Donde:
* m: Masa depositada o desprendida en gramos (g).
* Q: Carga eléctrica en Culombios (C). Se cumple: Q = I \cdot t.
* I: Intensidad de corriente eléctrica en Amperios (A).

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. SIGNOS DE LOS ELECTRODOS SEGÚN EL TIPO DE CELDA
| Tipo de Celda | Ánodo (Proceso) | Cátodo (Proceso) | Flujo de Electrones |
| :--- | :---: | :---: | :---: |
| **Celda Electrolítica** | **Positivo (+)** (Oxidación) | **Negativo (-)** (Reducción) | Del Ánodo al Cátodo (por la fuente) |
