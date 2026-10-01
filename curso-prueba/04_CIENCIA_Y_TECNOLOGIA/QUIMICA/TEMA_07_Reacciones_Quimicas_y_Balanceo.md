# TEMA 07: Reacciones Químicas y Balanceo de Ecuaciones

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química y Procesos de Transformación
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Balance redox por ión-electrón en medio ácido/básico)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.7 / 10

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         REACCIONES QUÍMICAS
                                  │
         ┌────────────────────────┴────────────────────────┐
         ▼                                                 ▼
CLASIFICACIÓN GENERAL                             REACCIONES REDOX (ÓXIDO-REDUCCIÓN)
• Por el mecanismo o reagrupamiento:               • Transferencia de electrones
  - Síntesis / Adición                             • Oxidación: Pérdida de e- (Aumenta E.O.)
  - Descomposición                                   -> Agente Reductor / Forma Oxidada
  - Desplazamiento Simple                           • Reducción: Ganancia de e- (Disminuye E.O.)
  - Doble Desplazamiento (Metátesis)                 -> Agente Oxidante / Forma Reducida
• Por la energía térmica:                         • Dismutación / Desproporción
  - Exotérmicas ($\Delta H < 0$)                           │
  - Endotérmicas ($\Delta H > 0$)                          ▼
• Por la reversibilidad:                          MÉTODOS DE BALANCEO
  - Irreversibles ($\to$)                          • Método del Tanteo / Simple Inspección
  - Reversibles ($\rightleftharpoons$)            • Método Algebraico
                                                   • Método del Estado de Oxidación (Redox simple)
                                                   • Método del Ión-Electrón:
                                                     - Medio Ácido (balance con $H^+$ y $H_2O$)
                                                     - Medio Básico (balance con $OH^-$ y $H_2O$)
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Definición y Evidencias de una Reacción Química
Una reacción química es un proceso termodinámico en el cual una o más sustancias (reactivos o reactantes) rompen sus enlaces intramoleculares y reorganizan sus átomos mediante colisiones efectivas para constituir nuevas sustancias (productos) con propiedades físicas y químicas totalmente distintas.
* **Evidencias Experimentales Macroscópicas:**
  1. Desprendimiento de gas (burbujeo persistente).
  2. Liberación o absorción espontánea de energía térmica (cambio de temperatura).
  3. Formación de un precipitado insoluble en solución acuosa.
  4. Cambio perceptible e irreversible de color, olor o sabor.
  5. Emisión de luz o energía electromagnética (quimioluminiscencia / combustión).

### 3.2. Clasificación Sistemática de las Reacciones Químicas

#### A. Por la Forma de Reagrupamiento Atómico
1. **Reacción de Síntesis, Combinación o Adición:** Dos o más reactantes forman un único producto:
   $$A + B \to AB \quad \text{Ejemplo: } N_{2(g)} + 3H_{2(g)} \to 2NH_{3(g)} \text{ (Proceso Haber-Bosch)}$$
2. **Reacción de Descomposición:** Un único reactante se fragmenta en dos o más sustancias más simples mediante el suministro de energía externa (calor, electricidad o luz):
   * *Pirólisis (por calor, $\Delta$):* $2KClO_{3(s)} \xrightarrow{\Delta, MnO_2} 2KCl_{(s)} + 3O_{2(g)}$
   * *Electrólisis (por corriente eléctrica):* $2H_2O_{(l)} \xrightarrow{\text{electricidad}} 2H_{2(g)} + O_{2(g)}$
   * *Fotólisis (por luz, $h\nu$):* $2H_2O_2 \xrightarrow{h\nu} 2H_2O + O_2$
3. **Reacción de Desplazamiento Simple o Sustitución:** Un elemento químico libre más activo desplaza a otro menos activo en un compuesto, liberándolo:
   $$A + BC \to AC + B \quad \text{Ejemplo: } Zn_{(s)} + 2HCl_{(ac)} \to ZnCl_{2(ac)} + H_{2(g)}\uparrow$$
   * Se rige por la **Serie Electroquímica de Actividad Metálica**:
     $$Li > K > Ba > Ca > Na > Mg > Al > Zn > Fe > Ni > Sn > Pb > \mathbf{H} > Cu > Hg > Ag > Pt > Au$$
     *(Los metales a la izquierda del $H$ desplazan al hidrógeno de los ácidos diluidos; los metales nobles a la derecha no reaccionan con ácidos hidrácidos ordinarios)*.
4. **Reacción de Doble Desplazamiento o Metátesis:** Dos compuestos en solución acuosa intercambian iones sin alterar sus estados de oxidación:
   $$AB + CD \to AD + CB$$
   * *Precipitación:* $AgNO_{3(ac)} + NaCl_{(ac)} \to AgCl_{(s)}\downarrow (\text{blanco}) + NaNO_{3(ac)}$
   * *Neutralización Ácido-Base:* $HCl_{(ac)} + NaOH_{(ac)} \to NaCl_{(ac)} + H_2O_{(l)}$

#### B. Por la Variación de Entalpía ($\Delta H$)
1. **Reacción Exotérmica ($\Delta H < 0$):** Libera calor al entorno. La entalpía de los productos es menor que la de los reactantes ($H_{\text{productos}} < H_{\text{reactantes}}$):
   $$A + B \to C + D + \text{Calor} \quad (\Delta H = -)$$
   * Todas las reacciones de combustión, neutralización y respiración celular son exotérmicas.
2. **Reacción Endotérmica ($\Delta H > 0$):** Absorbe calor del entorno. La entalpía de los productos es mayor que la de los reactantes ($H_{\text{productos}} > H_{\text{reactantes}}$):
   $$A + B + \text{Calor} \to C + D \quad (\Delta H = +)$$
   * Fotosíntesis, descomposición térmica de carbonatos ($CaCO_3 \xrightarrow{\Delta} CaO + CO_2$).

#### C. Reacciones de Combustión
Reacción redox exotérmica violenta entre un hidrocarburo (combustible) y el oxígeno gaseoso (comburente):
1. **Combustión Completa (Exceso de $O_2$):** Llama azulada pálida no luminosa y caliente. Produce únicamente dióxido de carbono y vapor de agua:
   $$C_xH_y + \left(x + \frac{y}{4}\right)O_2 \to x CO_2 + \frac{y}{2} H_2O + \text{Calor}$$
2. **Combustión Incompleta (Deficiencia de $O_2$):** Llama amarilla luminosa con emisión de hollín (carbono sólido particulado, $C$) y monóxido de carbono tóxico ($CO$):
   $$C_xH_y + O_2 \to CO + C + H_2O$$

### 3.3. Procesos de Óxido-Reducción (Redox)
Se basan en la transferencia simultánea de electrones:
1. **Oxidación:** Proceso en el cual una especie química **pierde electrones**, manifestando un **aumento algebraico en su estado de oxidación**:
   $$A^0 \to A^{n+} + n e^-$$
   * La sustancia que se oxida actúa como **Agente Reductor** (provoca la reducción de la otra) y tras la reacción se convierte en la **Forma Oxidada**.
2. **Reducción:** Proceso en el cual una especie química **gana electrones**, manifestando una **disminución algebraica en su estado de oxidación**:
   $$B^{m+} + m e^- \to B^0$$
   * La sustancia que se reduce actúa como **Agente Oxidante** (provoca la oxidación de la otra) y se convierte en la **Forma Reducida**.
3. **Reacción de Dismutación o Desproporción (Autoredox):** Un mismo elemento en un mismo estado de oxidación inicial se oxida y se reduce simultáneamente en la misma reacción:
   $$Cl_2^0 + 2NaOH \to NaCl^{-1} + NaCl^{+1}O + H_2O$$

### 3.4. Métodos de Balanceo de Ecuaciones Químicas
El balanceo asegura el cumplimiento estricto de la **Ley de Conservación de la Masa de Lavoisier** y la **Ley de Conservación de la Carga Eléctrica**.

#### A. Método de Estados de Oxidación (Redox Clásico)
1. Asignar los E.O. de todos los elementos.
2. Identificar el elemento que se oxida y el que se reduce.
3. Plantear las semirreacciones y calcular los electrones perdidos y ganados por átomo (multiplicando por los subíndices de la molécula).
4. Multiplicar las semirreacciones por factores mínimos para igualar electrones ganados y perdidos:
   $$\sum e^- \text{ ganados} = \sum e^- \text{ perdidos}$$
5. Trasladar los coeficientes a la ecuación principal y terminar el balance de metales, no metales, hidrógenos y oxígenos por tanteo simple.

#### B. Método del Ión-Electrón (Para Reacciones Iónicas en Solución Acuosa)
1. **En Medio Ácido:**
   * Separar en semirreacciones iónicas (solo se disocian electrolitos fuertes: ácidos, bases fuertes y sales solubles; no se disocian óxidos, gases ni agua).
   * Balancear átomos distintos de $H$ y $O$.
   * Balancear oxígenos: por cada átomo de oxígeno que falte en un lado, agregar una molécula de agua ($H_2O$) en ese lado.
   * Balancear hidrógenos: agregar iones hidrógeno ($H^+$) en el lado deficitario.
   * Balancear carga neta agregando electrones ($e^-$).
   * Igualar electrones, sumar y simplificar.
2. **En Medio Básico:**
   * Seguir los pasos de medio ácido hasta obtener la ecuación neta final.
   * Por cada ión $H^+$ presente en la ecuación balanceada, sumar en **ambos miembros** la misma cantidad de iones hidróxido ($OH^-$).
   * En el miembro donde coinciden $H^+$ y $OH^-$, combinarlos para formar moléculas de agua ($H^+ + OH^- \to H_2O$).
   * Cancelar las moléculas de agua repetidas a ambos lados.

---

## 4. AGENTES REDOX TÍPICOS DE ADMISIÓN
* **Agentes Oxidantes Fuertes:** Permanganato de potasio ($KMnO_4$), Dicromato de potasio ($K_2Cr_2O_7$), Ácido nítrico concentrado ($HNO_3$), Peróxido de hidrógeno ($H_2O_2$), Halógenos libres ($Cl_2, Br_2$).
* **Agentes Reductores Típicos:** Metales activos ($Zn, Fe, Na$), Ácido sulfhídrico ($H_2S$), Monóxido de carbono ($CO$), Ión yoduro ($I^-$), Dióxido de azufre ($SO_2$).

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir Agente Oxidante con Forma Oxidada.** El **Agente Oxidante** siempre se encuentra en los **reactantes** (sustancia completa antes de reaccionar). La **Forma Oxidada** es el producto resultante de la oxidación en el lado derecho.
* **Trampa 2: Disociar especies insolubles o covalentes en ión-electrón.** No se deben disociar óxidos ($MnO_2$), precipitados ($AgCl, BaSO_4$), gases ($CO_2, H_2$) ni agua ($H_2O$). Solo se disocian especies en fase acuosa iónica ($ac$).
* **Trampa 3: "Toda reacción de doble desplazamiento es redox".** FALSO CRÍTICO. Las reacciones de metátesis (precipitación y neutralización ácido-base) **NUNCA** son redox; los estados de oxidación de todos los elementos permanecen invariables.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Redox:** **"LEO dice GER"**
  * **L**oss of **E**lectrons is **O**xidation (**LEO** = Pierde electrones $\to$ Oxidación $\to$ Agente Reductor).
  * **G**ain of **E**lectrons is **R**eduction (**GER** = Gana electrones $\to$ Reducción $\to$ Agente Oxidante).
* **Mnemotecnia de Orden de Tanteo:** **"M - NM - H - O"**
  * Primero balancea los **M**etales.
  * Segundo balancea los **N**o **M**etales.
  * Tercero balancea los **H**idrógenos.
  * Por último, el **O**xígeno se balancea solo y sirve como comprobador infalible.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Identificación de Tipos de Reacción)
Clasifique cada una de las siguientes reacciones químicas:
I. $2Na_{(s)} + 2H_2O_{(l)} \to 2NaOH_{(ac)} + H_{2(g)}$
II. $CaCO_{3(s)} \xrightarrow{\Delta} CaO_{(s)} + CO_{2(g)}$
III. $BaCl_{2(ac)} + Na_2SO_{4(ac)} \to BaSO_{4(s)}\downarrow + 2NaCl_{(ac)}$
IV. $C_3H_{8(g)} + 5O_{2(g)} \to 3CO_{2(g)} + 4H_2O_{(v)} + \text{Calor}$

* **Resolución:**
  * I. El sodio elemental desplaza a un hidrógeno del agua liberando $H_2 \implies$ Desplazamiento simple (y además es redox).
  * II. Un solo reactante se fragmenta por acción del calor $\implies$ Descomposición térmica (pirólisis).
  * III. Dos sales solubles intercambian iones produciendo un precipitado de sulfato de bario $\implies$ Doble desplazamiento (metátesis / precipitación, no redox).
  * IV. Hidrocarburo reacciona con oxígeno produciendo dióxido de carbono, agua y energía $\implies$ Combustión completa (exotérmica y redox).
* **Respuesta:** Desplazamiento simple, descomposición, doble desplazamiento y combustión completa.

---

### Problema 2 (Nivel Intermedio - Balance por Tanteo de Combustión)
Balancee la ecuación química de la combustión completa del gas butano ($C_4H_{10}$) e indique la suma total de todos los coeficientes estequiométricos enteros y mínimos:
$$C_4H_{10} + O_2 \to CO_2 + H_2O$$

* **Resolución:**
  1. Aplicamos la regla general para alcanos: $C_n H_{2n+2} + \frac{3n+1}{2} O_2 \to n CO_2 + (n+1) H_2O$.
     Para $n = 4$:
     * Carbonos: 4 a la izquierda $\implies 4 CO_2$.
     * Hidrógenos: 10 a la izquierda $\implies 5 H_2O$.
     * Oxígenos: $4(2) + 5(1) = 8 + 5 = 13$ oxígenos a la derecha $\implies \frac{13}{2} O_2$.
  2. Ecuación fraccionaria:
     $$1 C_4H_{10} + \frac{13}{2} O_2 \to 4 CO_2 + 5 H_2O$$
  3. Multiplicamos toda la ecuación por 2 para obtener coeficientes enteros mínimos:
     $$2 C_4H_{10} + 13 O_2 \to 8 CO_2 + 10 H_2O$$
  4. Suma total de coeficientes estequiométricos:
     $$\sum \text{coeficientes} = 2 + 13 + 8 + 10 = 33$$
* **Respuesta:** Coeficientes: $2, 13, 8, 10$. La suma total es 33.

---

### Problema 3 (Nivel Intermedio - Balance Redox y Agentes)
Dada la siguiente reacción redox:
$$HNO_3 + I_2 \to HIO_3 + NO_2 + H_2O$$
Balancee por el método del estado de oxidación y determine la relación molar entre el agente reductor y el agente oxidante ($\frac{\text{coeficiente Ag. Reductor}}{\text{coeficiente Ag. Oxidante}}$).

* **Resolución:**
  1. Asignamos estados de oxidación a los elementos que cambian:
     * En $HNO_3$: $N = +5$.
     * En $I_2$: $I = 0$ (molécula diatómica elemental).
     * En $HIO_3$: $I = +5$.
     * En $NO_2$: $N = +4$.
  2. Identificación de procesos:
     * El Yodo pasa de $I_2^0$ a $2I^{+5}$: Pierde $2 \times 5 = 10 e^-$ $\implies$ **Oxidación** (Agente Reductor: $I_2$).
     * El Nitrógeno pasa de $N^{+5}$ a $N^{+4}$: Gana $1 e^-$ $\implies$ **Reducción** (Agente Oxidante: $HNO_3$).
  3. Semirreacciones y balance electrónico:
     * Oxidación: $I_2^0 \to 2 I^{+5} + 10 e^-$ ($\times 1$)
     * Reducción: $N^{+5} + 1 e^- \to N^{+4}$ ($\times 10$)
     Electrones transferidos: $10 e^-$.
  4. Sumamos semirreacciones y trasladamos coeficientes:
     $$10 HNO_3 + 1 I_2 \to 2 HIO_3 + 10 NO_2 + x H_2O$$
  5. Balance de hidrógenos y oxígenos por tanteo:
     * Hidrógenos: En reactantes hay 10 ($10 HNO_3$). En productos hay 2 en $2 HIO_3$, faltan 8 $\implies 4 H_2O$.
     * Verificación de oxígenos:
       Reactantes: $10 \times 3 = 30$ oxígenos.
       Productos: $2(3) + 10(2) + 4(1) = 6 + 20 + 4 = 30$ oxígenos (¡balance perfecto!).
     $$10 HNO_3 + I_2 \to 2 HIO_3 + 10 NO_2 + 4 H_2O$$
  6. Relación molar:
     * Agente Reductor: $I_2$ (coeficiente = 1).
     * Agente Oxidante: $HNO_3$ (coeficiente = 10).
     $$\frac{\text{coef. Ag. Reductor}}{\text{coef. Ag. Oxidante}} = \frac{1}{10}$$
* **Respuesta:** Coeficientes: $10, 1, 2, 10, 4$. La relación molar es $1/10$.

---

### Problema 4 (Nivel Avanzado - Dismutación o Autoredox)
Balancee la siguiente reacción de dismutación del bromo en medio acuoso alcalino por el método redox:
$$Br_2 + KOH \to KBr + KBrO_3 + H_2O$$
Indique la suma de los coeficientes de los productos y la cantidad total de moles de electrones transferidos por cada mol de bromato de potasio producido.

* **Resolución:**
  1. Estados de oxidación del bromo:
     * En $Br_2$: $Br = 0$.
     * En $KBr$: $Br = -1$ (se redujo).
     * En $KBrO_3$: $Br = +5$ (se oxidó).
  2. Semirreacciones (balanceando átomos de bromo):
     * Reducción: $Br_2^0 + 2e^- \to 2 Br^{-1}$
     * Oxidación: $Br_2^0 \to 2 Br^{+5} + 10e^-$
  3. Igualamos electrones transferidos:
     * Multiplicamos la reducción por 5:
       $$5 Br_2^0 + 10e^- \to 10 Br^{-1}$$
     * La oxidación se multiplica por 1:
       $$1 Br_2^0 \to 2 Br^{+5} + 10e^-$$
     * Suma total de bromo elemental: $5 Br_2 + 1 Br_2 = 6 Br_2$.
     * Suma de productos: $10 KBr + 2 KBrO_3$.
  4. Trasladamos a la ecuación molecular:
     $$6 Br_2 + x KOH \to 10 KBr + 2 KBrO_3 + y H_2O$$
  5. Balance de potasio ($K$):
     * En productos: $10 + 2 = 12 K \implies 12 KOH$.
  6. Balance de hidrógenos:
     * En reactantes: $12 H \implies 6 H_2O$.
  7. Ecuación entera preliminar:
     $$6 Br_2 + 12 KOH \to 10 KBr + 2 KBrO_3 + 6 H_2O$$
     Como todos los coeficientes son pares, simplificamos dividiendo entre 2:
     $$3 Br_2 + 6 KOH \to 5 KBr + 1 KBrO_3 + 3 H_2O$$
  8. Suma de coeficientes de productos:
     $$\sum \text{productos} = 5 (KBr) + 1 (KBrO_3) + 3 (H_2O) = 9$$
  9. Moles de electrones transferidos:
     Para la ecuación simplificada, al producir $1\text{ mol de } KBrO_3$ (que contiene $1\text{ átomo-gramo}$ de $Br^{+5}$ a partir de $Br^0$), se transfieren exactamente $5\text{ moles de electrones}$ (pasa de 0 a $+5$).
* **Respuesta:** Ecuación balanceada: $3Br_2 + 6KOH \to 5KBr + KBrO_3 + 3H_2O$. La suma de productos es 9 y se transfieren $5\text{ moles de } e^-$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Método del Ión-Electrón en Medio Básico)
Balancee la siguiente ecuación iónica que ocurre en medio fuertemente básico:
$$Cr(OH)_4^- + ClO^- \to CrO_4^{2-} + Cl^- \quad (\text{Medio Básico})$$
Determine el coeficiente del ión hidróxido ($OH^-$) y señale en qué miembro de la ecuación balanceada se localiza.

* **Resolución:**
  1. **Semirreacción de oxidación:** $Cr(OH)_4^- \to CrO_4^{2-}$
     * Átomos de Cromo ya están balanceados (1 a 1).
     * Oxígenos: hay 4 en la izquierda y 4 en la derecha (balanceados).
     * Hidrógenos: hay 4 a la izquierda, agregamos $4H^+$ a la derecha:
       $$Cr(OH)_4^- \to CrO_4^{2-} + 4H^+$$
     * Balance de carga eléctrica:
       Izquierda: $-1$. Derecha: $-2 + 4(+1) = +2$.
       Para igualar cargas, agregamos $3e^-$ a la derecha:
       $$Cr(OH)_4^- \to CrO_4^{2-} + 4H^+ + 3e^-$$
  2. **Semirreacción de reducción:** $ClO^- \to Cl^-$
     * Cloro balanceado (1 a 1).
     * Oxígenos: falta 1 en la derecha $\implies$ agregamos $1H_2O$ a la derecha:
       $$ClO^- \to Cl^- + H_2O$$
     * Hidrógenos: faltan 2 a la izquierda $\implies$ agregamos $2H^+$ a la izquierda:
       $$ClO^- + 2H^+ \to Cl^- + H_2O$$
     * Balance de carga eléctrica:
       Izquierda: $-1 + 2 = +1$. Derecha: $-1$.
       Agregamos $2e^-$ a la izquierda:
       $$ClO^- + 2H^+ + 2e^- \to Cl^- + H_2O$$
  3. **Igualamos electrones transferidos ($m.c.m.(3, 2) = 6e^-$):**
     * Multiplicamos oxidación por 2:
       $$2 Cr(OH)_4^- \to 2 CrO_4^{2-} + 8H^+ + 6e^-$$
     * Multiplicamos reducción por 3:
       $$3 ClO^- + 6H^+ + 6e^- \to 3 Cl^- + 3 H_2O$$
  4. **Sumamos las semirreacciones y cancelamos electrones y $H^+$:**
     $$2 Cr(OH)_4^- + 3 ClO^- + 6H^+ \to 2 CrO_4^{2-} + 3 Cl^- + 3 H_2O + 8H^+$$
     Cancelamos $6H^+$ a ambos lados:
     $$2 Cr(OH)_4^- + 3 ClO^- \to 2 CrO_4^{2-} + 3 Cl^- + 3 H_2O + 2H^+$$
  5. **Conversión a Medio Básico:**
     * Como quedan $2H^+$ a la derecha, sumamos $2OH^-$ a ambos miembros:
       $$2 Cr(OH)_4^- + 3 ClO^- + 2OH^- \to 2 CrO_4^{2-} + 3 Cl^- + 3 H_2O + (2H^+ + 2OH^-)$$
     * Como $2H^+ + 2OH^- = 2H_2O$:
       $$2 Cr(OH)_4^- + 3 ClO^- + 2OH^- \to 2 CrO_4^{2-} + 3 Cl^- + 3 H_2O + 2H_2O$$
       $$2 Cr(OH)_4^- + 3 ClO^- + 2OH^- \to 2 CrO_4^{2-} + 3 Cl^- + 5 H_2O$$
  6. **Comprobación de cargas:**
     * Reactantes: $2(-1) + 3(-1) + 2(-1) = -2 - 3 - 2 = -7$.
     * Productos: $2(-2) + 3(-1) + 0 = -4 - 3 = -7$.
     (¡La ecuación iónica está rigurosamente balanceada!).
* **Respuesta:** El coeficiente del ión hidróxido ($OH^-$) es **2** y se ubica en los **reactantes** (miembro izquierdo).

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Reacción Química:** Transformación de la materia en la que se alteran los enlaces químicos para dar lugar a nuevas sustancias.
2. **Agente Oxidante:** Sustancia que gana electrones y se reduce, provocando la oxidación de otra especie.
3. **Agente Reductor:** Sustancia que cede electrones y se oxida, provocando la reducción de otra especie.
4. **Metátesis:** Reacción de doble descomposición o intercambio iónico sin cambio en los estados de oxidación.
5. **Dismutación:** Reacción redox intramolecular en la cual el mismo elemento actúa simultáneamente como oxidante y reductor.
6. **Entalpía de Reacción ($\Delta H$):** Calor absorbido o desprendido durante una reacción química a presión constante.
7. **Combustión Completa:** Oxidación rápida de un combustible con exceso de oxígeno que produce exclusivamente $CO_2$ y $H_2O$.
8. **Precipitado:** Sólido insoluble que se separa de una disolución como resultado de una reacción química.
9. **Serie Electroquímica:** Ordenamiento de los metales según su potencial estándar de reducción y su facilidad para oxidarse.
10. **Forma Reducida:** Especie química que resulta en los productos tras haber ganado electrones en el proceso redox.

---

## 9. FLASHCARDS
* **Front:** ¿Qué diferencia conceptual existe entre el Agente Reductor y la Forma Oxidada?
  * **Back:** El Agente Reductor es el reactante que pierde electrones; la Forma Oxidada es el producto resultante luego de que dicho agente se ha oxidado.
* **Front:** ¿Por qué una reacción de neutralización ácido-base no es un proceso redox?
  * **Back:** Porque no hay transferencia neta de electrones; los estados de oxidación de los átomos ($H=+1, O=-2$, cationes y aniones) permanecen estrictamente constantes.
* **Front:** ¿Qué reactivo genera la llama luminosa y amarilla en una combustión incompleta?
  * **Back:** Las partículas incandescentes de carbono sólido no quemado (hollín particulado, $C_{(s)}$).
* **Front:** En el método ión-electrón en medio ácido, ¿cómo se balancea un déficit de oxígenos?
  * **Back:** Agregando moléculas de agua ($H_2O$) en el lado que carece de oxígenos, y compensando los hidrógenos con iones $H^+$ en el lado opuesto.
* **Front:** ¿Cuál es la ley ponderal que sustenta el balanceo de toda ecuación química?
  * **Back:** La Ley de Conservación de la Masa formulada por Antoine Lavoisier: "La masa no se crea ni se destruye, solo se transforma".

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_07",
  "titulo": "Reacciones Químicas y Balanceo de Ecuaciones",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál de las siguientes reacciones corresponde a una metátesis (doble desplazamiento)?",
      "opciones": [
        "Zn + 2 HCl -> ZnCl2 + H2",
        "2 H2 + O2 -> 2 H2O",
        "AgNO3 + NaCl -> AgCl + NaNO3",
        "2 KClO3 -> 2 KCl + 3 O2"
      ],
      "respuesta_correcta": 2,
      "retroalimentacion": "AgNO3 + NaCl -> AgCl + NaNO3 es una reacción de precipitación por doble intercambio iónico sin cambio de E.O."
    },
    {
      "id": "q2",
      "pregunta": "En la reacción de oxidación del hierro: Fe -> Fe3+ + 3e-, el hierro actúa como:",
      "opciones": ["Agente Oxidante", "Agente Reductor", "Forma Reducida", "Catalizador"],
      "respuesta_correcta": 1,
      "retroalimentacion": "La sustancia que se oxida (pierde electrones) es el Agente Reductor."
    },
    {
      "id": "q3",
      "pregunta": "Al balancear por tanteo: C3H8 + O2 -> CO2 + H2O, la suma total de coeficientes enteros mínimos es:",
      "opciones": ["10", "12", "13", "15"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Ecuación balanceada: 1 C3H8 + 5 O2 -> 3 CO2 + 4 H2O. Suma = 1 + 5 + 3 + 4 = 13."
    }
  ]
}
```
