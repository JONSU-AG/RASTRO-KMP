# TEMA 08: Cálculos Químicos y Estequiometría

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Cuantitativa y Leyes Ponderales
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Cálculos de pureza, reactivo limitante y rendimiento de reacción)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (El tema de cálculo numérico por excelencia en admisión)

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         CÁLCULOS QUÍMICOS Y ESTEQUIOMETRÍA
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
UNIDADES QUÍMICAS DE MASA                                        LEYES ESTEQUIOMÉTRICAS
• Masa Atómica Promedio ($\overline{P.A.}$)                      • Leyes Ponderales:
• Masa Molar ($M$ en g/mol)                                        - Conservación de la masa (Lavoisier)
• Concepto de Mol y Número de Avogadro ($N_A = 6.022 \times 10^{23}$) - Proporciones definidas (Proust)
• Átomo-gramo ($at\text{-}g$) y Molécula-gramo ($mol$)              - Proporciones múltiples (Dalton)
• Composición Centesimal ($\%m$)                                   - Proporciones recíprocas (Richter-Wenzel)
• Fórmula Empírica (FE) y Fórmula Molecular (FM)                 • Ley Volumétrica de Gay-Lussac (Gases)
                                                                         │
         ┌───────────────────────────────────────────────────────────────┘
         ▼
CÁLCULOS ESTEQUIOMÉTRICOS EN REACCIONES REALES
• Reactivo Limitante (RL) y Reactivo en Exceso (RE)
• Pureza de Reactivos ($\%P$)
• Rendimiento Porcentual de Reacción ($\%R = \frac{\text{Real}}{\text{Teórico}} \times 100\%$)
• Volumen Molar a Condiciones Normales ($V_{molar} = 22.4\text{ L/mol}$)
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Unidades Químicas de Masa (UQM)
1. **Unidad de Masa Atómica ($u.m.a.$ o $u$ o Dalton $Da$):**
   Patrón internacional de masa definido exactamente como la doceava ($1/12$) parte de la masa de un átomo neutro del isótopo de carbono-12 ($^{12}_6C$):
   $$1\text{ u.m.a.} = \frac{m(^{12}_6C)}{12} \approx 1.6605 \times 10^{-24}\text{ g} = 1.6605 \times 10^{-27}\text{ kg}$$
2. **Concepto de Mol:**
   Unidad fundamental del SI para la cantidad de sustancia. Contiene exactamente tantas entidades elementales (átomos, moléculas, iones, electrones) como átomos hay en $0.012\text{ kg}$ de carbono-12. Dicha constante es el **Número de Avogadro ($N_A$)**:
   $$N_A = 6.02214 \times 10^{23}\text{ entidades/mol} \approx 6.02 \times 10^{23}\text{ mol}^{-1}$$
3. **Masa Molar ($M$ o $\overline{M}$):**
   Masa en gramos de un mol de sustancia. Numéricamente es idéntica a la masa molecular o atómica en $u.m.a.$, pero expresada en $\text{g/mol}$.
   * *Relación fundamental del Mol:*
     $$n = \frac{m}{\overline{M}} = \frac{N^\circ \text{ partículas}}{N_A} = \frac{V_{(CN)}}{22.4\text{ L}}$$
4. **Átomo-gramo ($at\text{-}g$):** Es la masa de un mol de átomos de un elemento químico:
   $$1\text{ at-g}(X) = \overline{P.A.}(X)\text{ gramos} = 6.022 \times 10^{23}\text{ átomos de } X$$
5. **Molécula-gramo ($mol\text{-}g$ o mol):** Es la masa de un mol de moléculas de un compuesto:
   $$1\text{ mol}(H_2O) = 18\text{ g} = 6.022 \times 10^{23}\text{ moléculas de } H_2O$$

### 3.2. Composición Centesimal, Fórmula Empírica y Molecular
1. **Composición Centesimal ($\%m_i$):** Porcentaje en masa que representa cada elemento dentro del compuesto:
   $$\%m_i = \frac{N^\circ \text{ átomos}_i \cdot \overline{P.A.}_i}{\overline{M}_{\text{compuesto}}} \times 100\%$$
2. **Fórmula Empírica (FE) o Mínima:** Expresa la relación de números enteros más simple entre los átomos de una sustancia:
   * *Algoritmo:* Dividir el porcentaje o masa de cada elemento entre su $\overline{P.A.}$; luego dividir cada cociente entre el menor valor obtenido. Si quedan decimales sencillos ($\approx 0.5, 0.33$), multiplicar por un factor entero mínimo (2 o 3).
3. **Fórmula Molecular (FM) o Verdadera:** Indica el número real de átomos de cada elemento en una molécula:
   $$\text{FM} = k \cdot (\text{FE}) \quad \text{donde} \quad k = \frac{\overline{M}_{\text{molecular}}}{\overline{M}_{\text{empírica}}} \quad (k \in \mathbb{Z}^+)$$

### 3.3. Leyes Ponderales de la Química
1. **Ley de Conservación de la Masa (Antoine Lavoisier, 1789):**
   "En toda reacción química ordinaria, la masa total de los reactantes es estrictamente igual a la masa total de los productos obtenidos":
   $$\sum m_{\text{reactantes}} = \sum m_{\text{productos}}$$
2. **Ley de las Proporciones Definidas o Constantes (Joseph Louis Proust, 1799):**
   "Cuando dos o más elementos se combinan químicamente para formar un compuesto determinado, lo hacen siempre en una relación de masas fija, definida e invariable".
   * Si uno de los reactivos se suministra en una proporción mayor a la requerida por la ley estequiométrica, el excedente no reacciona y queda como sobrante.
3. **Ley de las Proporciones Múltiples (John Dalton, 1803):**
   "Cuando dos elementos se combinan entre sí para formar más de un compuesto diferente, si la masa de uno de ellos se mantiene constante, las masas del otro elemento guardan entre sí una relación de números enteros sencillos" (ej. $CO$ y $CO_2$; $12\text{ g } C$ se combinan con $16\text{ g } O$ y $32\text{ g } O$; relación $1:2$).
4. **Ley de las Proporciones Recíprocas o Equivalentes (Jeremias Richter y Carl Wenzel, 1792):**
   "Las masas de dos elementos distintos que se combinan separadamente con una misma masa fija de un tercer elemento, son las mismas masas con las que dichos elementos se combinarán entre sí, o bien múltiplos o submúltiplos de ellas".

### 3.4. Ley Volumétrica de Gay-Lussac (1808)
Para reacciones químicas que involucran reactantes y productos en fase gaseosa, a condiciones constantes de presión y temperatura ($P$ y $T$ fijos):
"Los volúmenes de las sustancias gaseosas que reaccionan o se forman guardan entre sí una relación de números enteros y sencillos, idéntica a la relación de sus coeficientes estequiométricos molares":
$$N_{2(g)} + 3H_{2(g)} \to 2NH_{3(g)} \implies 1\text{ L de } N_2 + 3\text{ L de } H_2 \to 2\text{ L de } NH_3$$
* **Condiciones Normales (C.N. o T.P.N.):**
  $$T = 0^\circ\text{C} = 273.15\text{ K} \quad ; \quad P = 1\text{ atm} = 760\text{ mmHg} \implies V_{\text{molar}} = 22.414\text{ L/mol} \approx 22.4\text{ L/mol}$$

### 3.5. Reactivo Limitante, Pureza y Rendimiento

#### A. Reactivo Limitante (RL) y Reactivo en Exceso (RE)
* **Reactivo Limitante (RL):** Sustancia que se consume completamente en primer lugar en la reacción química. Gobierna y limita estequiométricamente la cantidad teórica máxima de productos que se pueden formar.
* **Reactivo en Exceso (RE):** Sustancia que no reacciona en su totalidad, quedando una porción residual intacta al término del proceso.
* **Criterio Matemático Rápido del Cociente Estequiométrico ($Q$):**
  $$Q = \frac{\text{Moles del reactivo disponibles}}{\text{Coeficiente estequiométrico del reactivo}}$$
  * El reactivo que tenga el **menor cociente $Q$** es el **Reactivo Limitante (RL)**.
  * Todos los cálculos estequiométricos de producto se efectúan **exclusivamente con la masa pura del Reactivo Limitante**.

#### B. Pureza de una Muestra Química ($\%P$)
Los reactivos industriales nunca son $100\%$ químicamente puros (contienen impurezas inertes):
$$\% \text{Pureza} = \frac{m_{\text{sustancia pura}}}{m_{\text{muestra impura}}} \times 100\% \implies m_{\text{pura}} = m_{\text{muestra}} \times \frac{\%P}{100\%}$$

#### C. Rendimiento Porcentual de Reacción ($\%R$ o Eficiencia $\eta$)
En la práctica, debido a pérdidas mecánicas, reacciones secundarias indeseadas o equilibrios químicos incompletos, la cantidad de producto obtenida experimentalmente en el laboratorio (Rendimiento Real) es inferior a la predicha teóricamente por la estequiometría ideal (Rendimiento Teórico):
$$\% \text{Rendimiento} = \frac{\text{Cantidad Real de Producto (obtenida en laboratorio)}}{\text{Cantidad Teórica de Producto (calculada por estequiometría)}} \times 100\%$$

---

## 4. MASAS ATÓMICAS FUNDAMENTALES DE ADMISIÓN
* Hidrógeno ($H$): $1\text{ u.m.a.}$
* Carbono ($C$): $12\text{ u.m.a.}$
* Nitrógeno ($N$): $14\text{ u.m.a.}$
* Oxígeno ($O$): $16\text{ u.m.a.}$
* Sodio ($Na$): $23\text{ u.m.a.}$
* Magnesio ($Mg$): $24\text{ u.m.a.}$
* Aluminio ($Al$): $27\text{ u.m.a.}$
* Fósforo ($P$): $31\text{ u.m.a.}$
* Azufre ($S$): $32\text{ u.m.a.}$
* Cloro ($Cl$): $35.5\text{ u.m.a.}$
* Potasio ($K$): $39\text{ u.m.a.}$
* Calcio ($Ca$): $40\text{ u.m.a.}$
* Hierro ($Fe$): $56\text{ u.m.a.}$
* Cobre ($Cu$): $63.5\text{ u.m.a.}$
* Zinc ($Zn$): $65\text{ u.m.a.}$
* Plata ($Ag$): $108\text{ u.m.a.}$

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Usar la masa total de la muestra impura en la regla estequiométrica.** ERROR FATAL. Antes de armar la regla de tres o factores de conversión, DEBES descontar las impurezas: solo la masa pura participa en la reacción química.
* **Trampa 2: Determinar el reactivo limitante comparando directamente los gramos de reactantes.** FALSO. El reactivo de menor masa en gramos no necesariamente es el limitante; el cálculo depende estrictamente de las relaciones molares divididas entre los coeficientes estequiométricos ($Q = n_i / \text{coef}_i$).
* **Trampa 3: Usar el volumen molar de $22.4\text{ L}$ a condiciones que no son Normales.** El valor de $22.4\text{ L/mol}$ SOLO es válido a Condiciones Normales ($0^\circ\text{C}$ y $1\text{ atm}$). Si te dan otra temperatura o presión, debes utilizar la ecuación universal de los gases ideales ($PV = nRT$).

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **El Método Relámpago del Reactivo Limitante (Hack $Q$):**
  * Para $aA + bB \to cC$:
    $$Q_A = \frac{n_A}{a} \quad ; \quad Q_B = \frac{n_B}{b}$$
  * Si $Q_A < Q_B \implies A$ es el **Reactivo Limitante**.
  * ¿Cuánto producto $C$ se forma? Directamente:
    $$n_C = c \cdot Q_{\text{limitante}}$$
    ¡Ahorras 3 líneas de regla de tres y resuelves en 15 segundos!
* **Mnemotecnia CHON:** Los elementos más abundantes en estequiometría orgánica pesan: $C=12, H=1, O=16, N=14$.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Relación Mol, Masa y Número de Átomos)
Se dispone de una muestra de $98\text{ g}$ de ácido sulfúrico puro ($H_2SO_4$). Calcule:
a) El número de moles de $H_2SO_4$.
b) El número de moléculas de ácido sulfúrico presentes.
c) El número total de moles de átomos de oxígeno presentes.
*(Masas atómicas: $H=1, S=32, O=16$)*.

* **Resolución:**
  1. Cálculo de la masa molar del $H_2SO_4$:
     $$\overline{M} = 2(1) + 1(32) + 4(16) = 2 + 32 + 64 = 98\text{ g/mol}$$
  2. a) Número de moles ($n$):
     $$n = \frac{m}{\overline{M}} = \frac{98\text{ g}}{98\text{ g/mol}} = 1\text{ mol}$$
  3. b) Número de moléculas:
     $$\text{Moléculas} = n \cdot N_A = 1 \times 6.022 \times 10^{23} = 6.022 \times 10^{23}\text{ moléculas}$$
  4. c) Moles de átomos de Oxígeno:
     En $1\text{ mol de } H_2SO_4$ hay 4 átomos de oxígeno por cada molécula, por lo que:
     $$n(\text{átomos de } O) = 1\text{ mol } H_2SO_4 \times 4 = 4\text{ at-g de } O = 4\text{ moles de átomos de } O$$
* **Respuesta:** $1\text{ mol}$, $6.022 \times 10^{23}\text{ moléculas}$ y $4\text{ moles de átomos de Oxígeno}$.

---

### Problema 2 (Nivel Intermedio - Determinación de Fórmula Empírica y Molecular)
Un compuesto orgánico contiene $40.0\%$ de Carbono, $6.67\%$ de Hidrógeno y $53.33\%$ de Oxígeno en masa. Si mediante espectrometría de masas se determina que su peso molecular experimental es de $180\text{ g/mol}$, halle la fórmula empírica y la fórmula molecular de dicho compuesto.

* **Resolución:**
  1. Asumimos una base de cálculo de $100\text{ g}$ de compuesto:
     * Masa de $C = 40.0\text{ g}$
     * Masa de $H = 6.67\text{ g}$
     * Masa de $O = 53.33\text{ g}$
  2. Calculamos los moles de átomos de cada elemento dividiendo entre su peso atómico:
     * $n_C = \frac{40.0}{12} \approx 3.333\text{ mol}$
     * $n_H = \frac{6.67}{1} = 6.670\text{ mol}$
     * $n_O = \frac{53.33}{16} \approx 3.333\text{ mol}$
  3. Dividimos entre el menor valor ($3.333$):
     * $C: \frac{3.333}{3.333} = 1$
     * $H: \frac{6.670}{3.333} \approx 2$
     * $O: \frac{3.333}{3.333} = 1$
     $$\textbf{Fórmula Empírica (FE): } CH_2O$$
  4. Determinación de la Fórmula Molecular:
     * Masa molar de la FE ($CH_2O$):
       $$\overline{M}_{\text{FE}} = 1(12) + 2(1) + 1(16) = 30\text{ g/mol}$$
     * Factor multiplicador $k$:
       $$k = \frac{\overline{M}_{\text{molecular}}}{\overline{M}_{\text{FE}}} = \frac{180}{30} = 6$$
     * Fórmula Molecular:
       $$\text{FM} = (CH_2O)_6 = \mathbf{C_6H_{12}O_6} \text{ (Glucosa)}$$
* **Respuesta:** FE: $CH_2O$; FM: $C_6H_{12}O_6$.

---

### Problema 3 (Nivel Intermedio - Estequiometría con Pureza y Rendimiento)
Se someten a calcinación $200\text{ g}$ de una roca caliza que contiene $80\%$ de carbonato de calcio ($CaCO_3$). La descomposición se produce con un rendimiento de reacción del $75\%$, de acuerdo con:
$$CaCO_{3(s)} \xrightarrow{\Delta} CaO_{(s)} + CO_{2(g)}$$
Calcule la masa de óxido de calcio ($CaO$, cal viva) obtenida y el volumen de $CO_2$ liberado medido a Condiciones Normales.
*(Masas atómicas: $Ca=40, C=12, O=16$)*.

* **Resolución:**
  1. Masa molar de las sustancias:
     * $CaCO_3: 40 + 12 + 3(16) = 100\text{ g/mol}$
     * $CaO: 40 + 16 = 56\text{ g/mol}$
     * $CO_2: 12 + 2(16) = 44\text{ g/mol}$ ($22.4\text{ L/mol}$ a C.N.).
  2. Cálculo de la masa pura de reactante:
     $$m_{\text{pura}}(CaCO_3) = 200\text{ g} \times 80\% = 200 \times 0.80 = 160\text{ g de } CaCO_3$$
  3. Relación estequiométrica teórica ($100\%$ rendimiento):
     $$1\text{ mol } CaCO_3 (100\text{ g}) \to 1\text{ mol } CaO (56\text{ g}) + 1\text{ mol } CO_2 (22.4\text{ L en C.N.})$$
     * Masa teórica de $CaO$:
       $$m_{\text{teor}}(CaO) = 160\text{ g } CaCO_3 \times \frac{56\text{ g } CaO}{100\text{ g } CaCO_3} = 89.6\text{ g de } CaO$$
     * Volumen teórico de $CO_2$ a C.N.:
       $$V_{\text{teor}}(CO_2) = 160\text{ g } CaCO_3 \times \frac{22.4\text{ L } CO_2}{100\text{ g } CaCO_3} = 35.84\text{ L}$$
  4. Aplicación del rendimiento de reacción ($\%R = 75\%$):
     * Masa real de $CaO$:
       $$m_{\text{real}}(CaO) = 89.6\text{ g} \times 75\% = 89.6 \times 0.75 = 67.2\text{ g de } CaO$$
     * Volumen real de $CO_2$ a C.N.:
       $$V_{\text{real}}(CO_2) = 35.84\text{ L} \times 0.75 = 26.88\text{ L de } CO_2$$
* **Respuesta:** $67.2\text{ g de } CaO$ y $26.88\text{ L de } CO_2$ a C.N.

---

### Problema 4 (Nivel Avanzado - Reactivo Limitante y Masa en Exceso)
En un reactor cerrado se mezclan $54\text{ g}$ de polvo de aluminio metálico ($Al$) con $192\text{ g}$ de oxígeno gaseoso ($O_2$) para producir óxido de aluminio según:
$$4Al_{(s)} + 3O_{2(g)} \to 2Al_2O_{3(s)}$$
Determine:
a) Cuál es el reactivo limitante.
b) La masa en gramos de $Al_2O_3$ producido.
c) La masa del reactivo en exceso que queda sin reaccionar.
*(Masas atómicas: $Al=27, O=16$)*.

* **Resolución:**
  1. Masas molares y moles iniciales disponibles:
     * $Al: 27\text{ g/mol} \implies n(Al) = \frac{54\text{ g}}{27\text{ g/mol}} = 2.0\text{ moles}$
     * $O_2: 32\text{ g/mol} \implies n(O_2) = \frac{192\text{ g}}{32\text{ g/mol}} = 6.0\text{ moles}$
  2. Identificación del Reactivo Limitante usando el factor $Q$:
     $$Q_{Al} = \frac{n(Al)}{4} = \frac{2.0}{4} = 0.50$$
     $$Q_{O_2} = \frac{n(O_2)}{3} = \frac{6.0}{3} = 2.00$$
     Como $Q_{Al} (0.50) < Q_{O_2} (2.00) \implies \textbf{El Aluminio (Al) es el Reactivo Limitante (RL)}$.
     El $O_2$ es el Reactivo en Exceso (RE).
  3. Cálculo de la masa de $Al_2O_3$ producido:
     * Masa molar de $Al_2O_3 = 2(27) + 3(16) = 54 + 48 = 102\text{ g/mol}$.
     * Moles de $Al_2O_3$ formadas:
       $$n(Al_2O_3) = 2 \times Q_{\text{limitante}} = 2 \times 0.50 = 1.0\text{ mol}$$
     * Masa de $Al_2O_3$:
       $$m(Al_2O_3) = 1.0\text{ mol} \times 102\text{ g/mol} = 102\text{ g}$$
  4. Cálculo del reactivo en exceso ($O_2$) que reacciona y que sobra:
     * Moles de $O_2$ que reaccionan:
       $$n_{\text{reaccionó}}(O_2) = 3 \times Q_{\text{limitante}} = 3 \times 0.50 = 1.5\text{ moles}$$
     * Moles de $O_2$ que sobran:
       $$n_{\text{sobrante}}(O_2) = n_{\text{inicial}} - n_{\text{reaccionó}} = 6.0 - 1.5 = 4.5\text{ moles}$$
     * Masa sobrante de $O_2$:
       $$m_{\text{sobrante}}(O_2) = 4.5\text{ moles} \times 32\text{ g/mol} = 144\text{ g de } O_2$$
  5. Comprobación de Lavoisier:
     $54\text{ g } Al + 48\text{ g reaccionados de } O_2 = 102\text{ g de } Al_2O_3$. Masa total inicial: $54 + 192 = 246\text{ g}$. Masa final: $102\text{ g } Al_2O_3 + 144\text{ g sobrantes } O_2 = 246\text{ g}$. (Cumple perfectamente).
* **Respuesta:**
  a) Reactivo limitante: $Al$.
  b) Masa producida de $Al_2O_3$: $102\text{ g}$.
  c) Masa de reactivo en exceso sobrante: $144\text{ g de } O_2$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Estequiometría de Mezclas y Desprendimiento Gaseoso)
Se tiene una mezcla sólida de $20\text{ g}$ formada exclusivamente por virutas de magnesio metálico ($Mg$) y zinc ($Zn$). Al hacer reaccionar la totalidad de dicha mezcla con ácido clorhídrico diluido en exceso, se desprende un volumen total de $13.44\text{ L}$ de hidrógeno gaseoso ($H_2$) medido a Condiciones Normales. Determine el porcentaje en masa de magnesio en la mezcla original.
*(Masas atómicas: $Mg=24, Zn=65$)*.

* **Resolución:**
  1. Planteamos las reacciones químicas de cada metal con el ácido clorhídrico:
     * Para el Magnesio:
       $$Mg_{(s)} + 2HCl_{(ac)} \to MgCl_{2(ac)} + H_{2(g)}$$
       Por cada $1\text{ mol de } Mg$ ($24\text{ g}$) se desprende $1\text{ mol de } H_2$ ($22.4\text{ L en C.N.}$).
     * Para el Zinc:
       $$Zn_{(s)} + 2HCl_{(ac)} \to ZnCl_{2(ac)} + H_{2(g)}$$
       Por cada $1\text{ mol de } Zn$ ($65\text{ g}$) se desprende $1\text{ mol de } H_2$ ($22.4\text{ L en C.N.}$).
  2. Moles totales de $H_2$ desprendidas:
     $$n_{\text{total}}(H_2) = \frac{V_{(CN)}}{22.4\text{ L/mol}} = \frac{13.44\text{ L}}{22.4\text{ L/mol}} = 0.60\text{ moles}$$
  3. Definimos variables:
     * Sea $x$: masa de Magnesio ($g$).
     * Sea $y$: masa de Zinc ($g$).
  4. Planteamos el sistema de ecuaciones lineales:
     * Ecuación 1 (Masa total de la mezcla):
       $$x + y = 20 \implies y = 20 - x$$
     * Ecuación 2 (Suma de moles de $H_2$):
       $$\frac{x}{24} + \frac{y}{65} = 0.60$$
  5. Resolvemos el sistema:
     $$\frac{x}{24} + \frac{20 - x}{65} = 0.60$$
     Multiplicamos por el $m.c.m.(24, 65) = 1560$:
     $$65x + 24(20 - x) = 0.60 \times 1560$$
     $$65x + 480 - 24x = 936$$
     $$41x = 936 - 480 = 456$$
     $$x = \frac{456}{41} \approx 11.122\text{ g de } Mg$$
  6. Porcentaje en masa de Magnesio:
     $$\%m(Mg) = \frac{x}{m_{\text{total}}} \times 100\% = \frac{11.122\text{ g}}{20\text{ g}} \times 100\% = 55.61\%$$
* **Respuesta:** La masa de magnesio es aproximadamente $11.12\text{ g}$ y representa el $55.61\%$ de la mezcla.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Estequiometría:** Rama de la química que estudia las relaciones cuantitativas ponderales y volumétricas entre las sustancias participantes en una reacción química.
2. **Mol:** Unidad fundamental del SI para cantidad de materia que contiene exactamente $6.02214 \times 10^{23}$ entidades elementales.
3. **Reactivo Limitante:** Reactante que se agota totalmente primero en una reacción química y determina el rendimiento teórico de los productos.
4. **Reactivo en Exceso:** Reactante presente en una cantidad mayor a la requerida estequiométricamente para reaccionar con el limitante.
5. **Rendimiento Teórico:** Cantidad máxima calculada de producto que se obtendría si el $100\%$ del reactivo limitante reaccionara idealmente.
6. **Pureza:** Porcentaje en masa de la sustancia química activa en una muestra industrial o mineral.
7. **Fórmula Empírica:** Expresión mínima que indica la relación molar entera más simple entre los átomos de un compuesto.
8. **Volumen Molar:** Volumen ocupado por una mol de cualquier gas ideal a condiciones normales de temperatura y presión ($22.414\text{ L}$).
9. **Ley de Lavoisier:** Principio de conservación que establece que la masa total de los reactantes es idéntica a la de los productos generados.
10. **Composición Centesimal:** Proporción porcentual en masa de cada elemento químico dentro de una fórmula molecular dada.

---

## 9. FLASHCARDS
* **Front:** ¿Qué criterio matemático instantáneo permite identificar al reactivo limitante?
  * **Back:** Se calcula el cociente $Q = \frac{\text{moles disponibles}}{\text{coeficiente estequiométrico}}$. El reactivo que presente el menor valor de $Q$ es el reactivo limitante.
* **Front:** ¿A cuánto equivale el volumen ocupado por 1 mol de gas a Condiciones Normales?
  * **Back:** A Condiciones Normales ($0^\circ\text{C}$ y $1\text{ atm}$), $1\text{ mol}$ de cualquier gas ideal ocupa exactamente $22.4\text{ Litros}$.
* **Front:** ¿Por qué la masa impura no debe colocarse directamente en la relación estequiométrica?
  * **Back:** Porque las impurezas no intervienen en la reacción química; se debe calcular primero la masa pura: $m_{\text{pura}} = m_{\text{muestra}} \times (\%P / 100)$.
* **Front:** ¿Cómo se define el rendimiento porcentual de una reacción química?
  * **Back:** $\%R = \frac{\text{Masa Real (obtenida experimentalmente)}}{\text{Masa Teórica (calculada estequiométricamente)}} \times 100\%$.
* **Front:** ¿Cuál es la relación matemática entre la Fórmula Molecular (FM) y la Fórmula Empírica (FE)?
  * **Back:** $\text{FM} = k \cdot (\text{FE})$, donde $k = \frac{\text{Masa Molar Molecular}}{\text{Masa Molar Empírica}}$ ($k$ es un entero positivo).

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_08",
  "titulo": "Cálculos Químicos y Estequiometría",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuántos moles de agua se producen por la combustión completa de 2 moles de propano (C3H8)?",
      "opciones": ["4 moles", "6 moles", "8 moles", "10 moles"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Ecuación: C3H8 + 5 O2 -> 3 CO2 + 4 H2O. Por cada 1 mol de propano se forman 4 moles de agua; para 2 moles se producen 2 x 4 = 8 moles."
    },
    {
      "id": "q2",
      "pregunta": "Si se hacen reaccionar 4 moles de H2 con 3 moles de O2 según 2H2 + O2 -> 2H2O, el reactivo limitante es:",
      "opciones": ["H2", "O2", "Ambos por igual", "El H2O"],
      "respuesta_correcta": 0,
      "retroalimentacion": "Q(H2) = 4/2 = 2. Q(O2) = 3/1 = 3. Como 2 < 3, el hidrógeno (H2) es el reactivo limitante."
    },
    {
      "id": "q3",
      "pregunta": "El volumen ocupado por 44 g de gas CO2 a Condiciones Normales es:",
      "opciones": ["11.2 L", "22.4 L", "44.8 L", "33.6 L"],
      "respuesta_correcta": 1,
      "retroalimentacion": "La masa molar del CO2 es 44 g/mol. Por tanto, 44 g corresponden a exactamente 1 mol, que a C.N. ocupa 22.4 Litros."
    }
  ]
}
```
