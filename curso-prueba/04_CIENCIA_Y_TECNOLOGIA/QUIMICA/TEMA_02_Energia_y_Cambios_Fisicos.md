# TEMA 02: Energía y Cambios Físicos de la Materia

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química Fundamental y Termodinámica Clásica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas)
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Cálculos de calorimetría y equivalencia masa-energía)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.0 / 10

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         ENERGÍA Y ESTADOS DE LA MATERIA
                                       │
         ┌─────────────────────────────┴─────────────────────────────┐
         ▼                                                           ▼
ESTADOS DE AGREGACIÓN                                   RELACIÓN MASA - ENERGÍA
(Sólido, Líquido, Gaseoso, Plasmático)                  (Teoría Especial de la Relatividad)
         │                                                           │
   CAMBIOS DE FASE                                             $E = mc^2$
(Absorben / Liberan calor)                                     $E = \Delta m \cdot c^2$
         │                                                           │
┌────────┴────────┐                                            Masa Relativista:
▼                 ▼                                      $m_f = \frac{m_0}{\sqrt{1 - (v/c)^2}}$
ENDOTÉRMICOS     EXOTÉRMICOS
• Fusión         • Solidificación
• Vaporización   • Condensación/Licuación
• Sublimación    • Sublimación inversa /
  directa          Deposición
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Los Estados de Agregación de la Materia
El estado físico depende del balance dinámico entre las fuerzas de atracción intermolecular (fuerzas de cohesión, $F_c$) y las fuerzas de repulsión cinética molecular ($F_r$):
1. **Estado Sólido:** $F_c \gg F_r$. Forma y volumen propios y definidos. Incompresibles. Movimiento molecular restringido a vibraciones en posiciones reticulares fijas. Densidad generalmente alta (anomalía del agua: el hielo es menos denso que el agua líquida a $4^\circ\text{C}$).
2. **Estado Líquido:** $F_c \approx F_r$. Volumen constante pero forma variable (adopta la forma del recipiente). Prácticamente incompresibles. Presentan fluidez, viscosidad y tensión superficial.
3. **Estado Gaseoso:** $F_r \gg F_c$. Forma y volumen variables (ocupan todo el volumen disponible). Alta compresibilidad y expansibilidad. Movimiento caótico translacional a altas velocidades (entropía elevada).
4. **Estado Plasmático (Cuarto Estado):** Gas altamente ionizado compuesto por cationes, electrones libres y fotones a temperaturas extraordinariamente altas ($> 10\,000\text{ K}$). Excelente conductor de la electricidad. Es el estado más abundante en el Universo observable (sol, estrellas, nebulosas, reactores Tokamak, auroras boreales).
5. **Condensado de Bose-Einstein (Quinto Estado):** Materia a temperaturas extremadamente cercanas al cero absoluto ($0\text{ K} = -273.15^\circ\text{C}$). Los átomos caen al nivel cuántico más bajo, comportándose como una sola "superonda" o superátomo.

### 3.2. Cambios de Fase (Cambios Físicos de Estado)
Son transformaciones físicas reversibles gobernadas por la adición o remoción de energía térmica (entalpía de cambio de fase) a presión constante:
* **Procesos Endotérmicos (Ganan calor, $\Delta H > 0$):**
  * *Fusión:* Sólido $\to$ Líquido.
  * *Vaporización (Evaporación / Ebullición):* Líquido $\to$ Gas/Vapor.
  * *Sublimación Directa o Volatilización:* Sólido $\to$ Gas (ej. naftalina, hielo seco $CO_{2(s)}$, yodo sólido $I_{2(s)}$).
* **Procesos Exotérmicos (Liberan calor, $\Delta H < 0$):**
  * *Solidificación:* Líquido $\to$ Sólido.
  * *Condensación:* Gas/Vapor $\to$ Líquido (se llama *licuación* cuando un gas real se somete a aumento de presión y enfriamiento simultáneo).
  * *Sublimación Inversa, Deposición o Compensación:* Gas $\to$ Sólido (ej. formación de escarcha, nieve).

### 3.3. Calorimetría Aplicada a Cambios Físicos
1. **Calor Sensible ($Q_s$):** Energía térmica absorbida o cedida que produce variación de temperatura sin cambio de estado:
   $$Q_s = m \cdot c_e \cdot \Delta T = m \cdot c_e \cdot (T_f - T_i)$$
   Donde:
   * $m$: masa en gramos ($g$).
   * $c_e$: calor específico en $\text{cal}/(\text{g}\cdot^\circ\text{C})$ o $\text{J}/(\text{kg}\cdot\text{K})$.
   * Para el agua: $c_e(\text{hielo}) = 0.5\text{ cal/g}^\circ\text{C}$, $c_e(\text{líquida}) = 1.0\text{ cal/g}^\circ\text{C}$, $c_e(\text{vapor}) = 0.5\text{ cal/g}^\circ\text{C}$.
2. **Calor Latente de Cambio de Fase ($Q_L$):** Energía necesaria para que una unidad de masa cambie de estado isotérmicamente (a temperatura constante):
   $$Q_L = m \cdot L$$
   Donde para el agua a $1\text{ atm}$:
   * Calor latente de fusión: $L_f = 80\text{ cal/g}$ ($334\text{ J/g}$).
   * Calor latente de solidificación: $L_s = -80\text{ cal/g}$.
   * Calor latente de vaporización: $L_v = 540\text{ cal/g}$ ($2260\text{ J/g}$).
   * Calor latente de condensación: $L_c = -540\text{ cal/g}$.

### 3.4. Relación Materia - Energía (Albert Einstein, 1905)
La Ley de Conservación Clásica de Lavoisier (materia) y Mayer (energía) se unifican en la Teoría de la Relatividad Especial: la masa y la energía son formas interconvertibles de una misma entidad fundamental.

1. **Ecuación de Equivalencia Masa - Energía:**
   $$E = m \cdot c^2 \quad \text{o} \quad \Delta E = \Delta m \cdot c^2$$
   Donde:
   * $E$: Energía liberada o absorbida en Joules ($J = \text{kg}\cdot\text{m}^2/\text{s}^2$) o Ergios ($1\text{ erg} = 1\text{ g}\cdot\text{cm}^2/\text{s}^2$).
   * $c$: Velocidad de la luz en el vacío:
     $$c \approx 3 \times 10^8\text{ m/s} = 3 \times 10^{10}\text{ cm/s}$$
   * Equivalencia: $1\text{ J} = 10^7\text{ ergios}$.
2. **Masa Relativista en Movimiento:**
   Cuando una partícula subatómica alcanza velocidades comparables a la de la luz ($v \to c$), su masa inercial aparente $m_f$ aumenta según el factor de Lorentz:
   $$m_f = \frac{m_0}{\sqrt{1 - \left(\frac{v}{c}\right)^2}}$$
   Donde $m_0$ es la masa en reposo de la partícula.

---

## 4. SISTEMAS DE UNIDADES Y CONSTANTES UNIVERSALES
* $1\text{ cal} = 4.184\text{ J} \approx 4.18\text{ J}$
* $1\text{ BTU} = 252\text{ cal} = 1055\text{ J}$
* $1\text{ kWh} = 3.6 \times 10^6\text{ J}$
* $1\text{ u.m.a.} = 1.66 \times 10^{-24}\text{ g} \implies 1\text{ u.m.a.} \approx 931.5\text{ MeV}$

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir evaporación con ebullición.** La evaporación ocurre solo en la superficie del líquido y a cualquier temperatura; la ebullición es un fenómeno turbulento de toda la masa líquida que ocurre a una temperatura fija donde la presión de vapor iguala a la presión atmosférica externa.
* **Trampa 2: Aplicar $Q = m \cdot c_e \cdot \Delta T$ durante un cambio de fase.** ERROR GRAVE. Durante el cambio de fase la temperatura no cambia ($\Delta T = 0$); se debe usar $Q = m \cdot L$.
* **Trampa 3: Usar unidades no homogéneas en $E = mc^2$.** Si $m$ está en gramos ($g$), $c$ debe estar en $\text{cm/s}$ ($3 \times 10^{10}\text{ cm/s}$) y la energía resultará en Ergios. Si $m$ está en kilogramos ($kg$), $c$ debe estar en $\text{m/s}$ ($3 \times 10^8\text{ m/s}$) y la energía en Joules ($J$).

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia de Procesos:**
  * **"FU-VA-SUB" son calientes (+Q / Endo):** **Fu**sión, **Va**porización, **Sub**limación absorben calor.
  * **"SO-CON-DE" son frías (-Q / Exo):** **So**lidificación, **Con**densación, **De**posición liberan calor.
* **Hacking Einstein:**
  * $1\text{ gramo de materia}$ convertido íntegramente en energía equivale a:
    $$E = (10^{-3}\text{ kg})(3 \times 10^8\text{ m/s})^2 = 9 \times 10^{13}\text{ Joules} = 9 \times 10^{20}\text{ Ergios}$$
  * Guarda esta constante en la memoria: ¡$1\text{ g} \equiv 9 \times 10^{13}\text{ J}$! Si se desintegra $0.2\text{ g}$, directamente calculas $0.2 \times 9 \times 10^{13} = 1.8 \times 10^{13}\text{ J}$.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Cambios de Fase)
Indique la correspondencia correcta entre el fenómeno y el nombre del cambio de fase:
I. Desaparición paulatina de una pastilla de naftalina en un armario sin dejar residuo líquido.
II. Formación de gotas de rocío sobre las hojas durante la madrugada.
III. Obtención de lingotes de plata a partir del metal fundido vertido en moldes.
IV. Formación de vapor turbulento en agua hirviendo a nivel del mar.

* **Resolución:**
  * I. Sólido a gas directo: Sublimación directa o volatilización.
  * II. Vapor de agua ambiental a gotas líquidas: Condensación.
  * III. Líquido a sólido por enfriamiento: Solidificación.
  * IV. Líquido a vapor a temperatura de ebullición: Ebullición (Vaporización).
* **Respuesta:** Sublimación directa, condensación, solidificación y vaporización.

---

### Problema 2 (Nivel Intermedio - Calorimetría de Cambio de Fase)
Determine la cantidad de calor total en kilocalorías ($kcal$) necesaria para transformar $50\text{ g}$ de hielo a $-10^\circ\text{C}$ en vapor de agua a $100^\circ\text{C}$ bajo una presión de $1\text{ atm}$.
*(Datos: $c_e(\text{hielo}) = 0.5\text{ cal/g}^\circ\text{C}$, $L_f = 80\text{ cal/g}$, $c_e(\text{agua}) = 1.0\text{ cal/g}^\circ\text{C}$, $L_v = 540\text{ cal/g}$)*.

* **Resolución:**
  El proceso ocurre en 4 etapas sucesivas:
  1. Calentamiento del hielo desde $-10^\circ\text{C}$ hasta $0^\circ\text{C}$ ($Q_1$):
     $$Q_1 = m \cdot c_{e(\text{hielo})} \cdot \Delta T = 50 \times 0.5 \times (0 - (-10)) = 50 \times 0.5 \times 10 = 250\text{ cal}$$
  2. Fusión isotérmica del hielo a $0^\circ\text{C}$ ($Q_2$):
     $$Q_2 = m \cdot L_f = 50 \times 80 = 4000\text{ cal}$$
  3. Calentamiento del agua líquida desde $0^\circ\text{C}$ hasta $100^\circ\text{C}$ ($Q_3$):
     $$Q_3 = m \cdot c_{e(\text{agua})} \cdot \Delta T = 50 \times 1.0 \times (100 - 0) = 5000\text{ cal}$$
  4. Vaporización isotérmica a $100^\circ\text{C}$ ($Q_4$):
     $$Q_4 = m \cdot L_v = 50 \times 540 = 27\,000\text{ cal}$$
  5. Calor total absorbido ($Q_T$):
     $$Q_T = Q_1 + Q_2 + Q_3 + Q_4 = 250 + 4000 + 5000 + 27\,000 = 36\,250\text{ cal}$$
     $$Q_T = 36.25\text{ kcal}$$
* **Respuesta:** $36.25\text{ kcal}$.

---

### Problema 3 (Nivel Intermedio - Ecuación de Einstein y Rendimiento Nuclear)
En una detonación nuclear experimental se utiliza una masa de $4\text{ kg}$ de Uranio-235. Si solo el $0.15\%$ de dicha masa logra convertirse efectivamente en energía liberada, calcule la energía desprendida expresada en Joules ($J$) y en Ergios.

* **Resolución:**
  1. Determinación de la masa transmutada en energía ($\Delta m$):
     $$\Delta m = 0.15\% \times 4\text{ kg} = \frac{0.15}{100} \times 4\text{ kg} = 0.006\text{ kg} = 6 \times 10^{-3}\text{ kg}$$
  2. Aplicación de la ecuación de Einstein en el SI:
     $$c = 3 \times 10^8\text{ m/s}$$
     $$E = \Delta m \cdot c^2 = (6 \times 10^{-3}\text{ kg}) \times (3 \times 10^8\text{ m/s})^2$$
     $$E = (6 \times 10^{-3}) \times (9 \times 10^{16}) = 5.4 \times 10^{14}\text{ Joules}$$
  3. Conversión a Ergios:
     $$1\text{ J} = 10^7\text{ ergios} \implies E = 5.4 \times 10^{14} \times 10^7 = 5.4 \times 10^{21}\text{ ergios}$$
* **Respuesta:** $5.4 \times 10^{14}\text{ J}$ ($5.4 \times 10^{21}\text{ ergios}$).

---

### Problema 4 (Nivel Avanzado - Masa Residual en Reacción Nuclear)
En una reacción nuclear controlada en un reactor de investigación, se desprenden $1.8 \times 10^{14}\text{ J}$ de energía térmica. Si la masa inicial del combustible radioactivo antes de la reacción fue de $500\text{ g}$, determine el porcentaje de masa que quedó remanente (sin desintegrar).

* **Resolución:**
  1. Cálculo de la masa consumida / transmutada ($\Delta m$):
     $$E = \Delta m \cdot c^2 \implies \Delta m = \frac{E}{c^2}$$
     $$\Delta m = \frac{1.8 \times 10^{14}\text{ J}}{(3 \times 10^8\text{ m/s})^2} = \frac{1.8 \times 10^{14}}{9 \times 10^{16}} = 0.2 \times 10^{-2}\text{ kg} = 2 \times 10^{-3}\text{ kg} = 2\text{ g}$$
  2. Determinación de la masa remanente ($m_R$):
     $$m_R = m_{\text{inicial}} - \Delta m = 500\text{ g} - 2\text{ g} = 498\text{ g}$$
  3. Porcentaje de masa remanente ($\%m_R$):
     $$\%m_R = \frac{m_R}{m_{\text{inicial}}} \times 100\% = \frac{498}{500} \times 100\% = 99.6\%$$
* **Respuesta:** Quedó el $99.6\%$ de masa remanente ($0.4\%$ se convirtió en energía).

---

### Problema 5 (Nivel Reto UNSA / UNI - Masa Relativista)
Un protón en reposo tiene una masa inercial de $m_0$. Si es acelerado en un sincrotrón hasta alcanzar una velocidad $v = \frac{\sqrt{3}}{2}c$, determine en qué porcentaje se incrementó su masa aparente en movimiento respecto a su masa en reposo, y cuánta energía cinética relativista posee.

* **Resolución:**
  1. Ecuación de masa relativista:
     $$m_f = \frac{m_0}{\sqrt{1 - (v/c)^2}}$$
     Reemplazamos $v/c = \frac{\sqrt{3}}{2}$:
     $$(v/c)^2 = \frac{3}{4} \implies 1 - (v/c)^2 = 1 - \frac{3}{4} = \frac{1}{4}$$
     $$\sqrt{1 - (v/c)^2} = \sqrt{\frac{1}{4}} = \frac{1}{2}$$
  2. Masa final relativista:
     $$m_f = \frac{m_0}{1/2} = 2m_0$$
  3. Incremento de masa:
     $$\Delta m = m_f - m_0 = 2m_0 - m_0 = m_0$$
     El incremento relativo porcentual es:
     $$\% \Delta m = \frac{\Delta m}{m_0} \times 100\% = \frac{m_0}{m_0} \times 100\% = 100\%$$
     (Su masa se duplicó, incrementándose en $100\%$).
  4. Energía Cinética Relativista ($E_c$):
     $$E_c = E_{\text{total}} - E_0 = m_f c^2 - m_0 c^2 = 2m_0 c^2 - m_0 c^2 = m_0 c^2$$
* **Respuesta:** La masa se incrementó en $100\%$ ($m_f = 2m_0$) y su energía cinética es igual a su energía propia en reposo $m_0 c^2$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Calor Sensible:** Cantidad de calor absorbida o liberada que causa variación de temperatura sin alterar el estado de agregación molecular.
2. **Calor Latente:** Calor suministrado o extraído que provoca un cambio de fase isotérmico (a temperatura estrictamente constante).
3. **Sublimación:** Transición de fase directa del estado sólido al gaseoso sin transitar por el estado líquido intermedio.
4. **Licuación:** Proceso físico mediante el cual un gas es forzado al estado líquido mediante enfriamiento y compresión por debajo de su temperatura crítica.
5. **Plasma:** Gas ionizado a altas temperaturas formado por núcleos atómicos desnudos o cationes y electrones libres deslocalizados.
6. **Entalpía de Fusión:** Variación de entalpía que acompaña a la conversión de una mol o unidad de masa de sólido en líquido a presión constante.
7. **Punto Triple:** Condición única de presión y temperatura en el diagrama de fases en la que coexisten en equilibrio termodinámico el sólido, líquido y vapor.
8. **Masa Relativista:** Masa inercial de una partícula que aumenta de acuerdo con el factor de Lorentz a medida que su velocidad se aproxima a la de la luz.
9. **Fuerzas de Cohesión:** Fuerzas atractivas de origen electromagnético que mantienen unidas a las moléculas de una misma sustancia.
10. **Condensado Bose-Einstein:** Estado cuántico macroscópico de bosones enfriados cerca del cero absoluto que comparten la misma función de onda fundamental.

---

## 9. FLASHCARDS
* **Front:** ¿Por qué la temperatura se mantiene constante durante la ebullición del agua en un sistema abierto?
  * **Back:** Porque toda la energía térmica suministrada se utiliza como calor latente para vencer las fuerzas intermoleculares (puentes de hidrógeno) y cambiar de fase, no para elevar la energía cinética media.
* **Front:** ¿Cuál es el valor del calor latente de fusión y vaporización del agua a nivel del mar?
  * **Back:** Fusión: $L_f = 80\text{ cal/g}$. Vaporización: $L_v = 540\text{ cal/g}$.
* **Front:** ¿Qué relación existe entre un Joule y un Ergio?
  * **Back:** $1\text{ Joule} = 10^7\text{ Ergios}$ ($1\text{ J} = 1\text{ kg}\cdot\text{m}^2/\text{s}^2$; $1\text{ erg} = 1\text{ g}\cdot\text{cm}^2/\text{s}^2$).
* **Front:** ¿Cuál es la diferencia entre evaporación y ebullición?
  * **Back:** La evaporación ocurre a cualquier temperatura solo en la superficie; la ebullición ocurre a una temperatura fija en todo el seno del líquido cuando la presión de vapor iguala a la presión atmosférica.
* **Front:** ¿A qué equivale la energía liberada por la desintegración total de $1\text{ gramo}$ de materia?
  * **Back:** $E = mc^2 = 10^{-3}\text{ kg} \times (3 \times 10^8\text{ m/s})^2 = 9 \times 10^{13}\text{ Joules} = 9 \times 10^{20}\text{ Ergios}$.

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_02",
  "titulo": "Energía y Cambios Físicos de la Materia",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál de los siguientes procesos es exotérmico (libera calor)?",
      "opciones": ["Sublimación directa del yodo", "Fusión del cobre", "Condensación de vapor de agua", "Evaporación de alcohol"],
      "respuesta_correcta": 2,
      "retroalimentacion": "La condensación pasa de vapor a líquido liberando calor latente al entorno (proceso exotérmico)."
    },
    {
      "id": "q2",
      "pregunta": "Para fundir 200 g de hielo que ya se encuentra a 0 °C, ¿cuántas kilocalorías se requieren?",
      "opciones": ["16 kcal", "108 kcal", "80 kcal", "20 kcal"],
      "respuesta_correcta": 0,
      "retroalimentacion": "Q = m * Lf = 200 g * 80 cal/g = 16 000 cal = 16 kcal."
    },
    {
      "id": "q3",
      "pregunta": "Si en una reacción nuclear se desintegra una masa de 0.5 g, la energía en Joules generada es:",
      "opciones": ["4.5 x 10^13 J", "9.0 x 10^13 J", "1.5 x 10^10 J", "4.5 x 10^10 J"],
      "respuesta_correcta": 0,
      "retroalimentacion": "E = m * c^2 = (0.5 x 10^-3 kg) * (3 x 10^8 m/s)^2 = 0.5 x 10^-3 * 9 x 10^16 = 4.5 x 10^13 J."
    }
  ]
}
```
