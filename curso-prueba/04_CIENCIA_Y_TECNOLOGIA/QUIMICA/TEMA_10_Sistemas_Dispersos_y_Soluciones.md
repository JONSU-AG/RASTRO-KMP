# TEMA 10: Sistemas Dispersos y Soluciones

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Físico-Química de Disoluciones
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Molaridad, Normalidad, Molalidad, Dilución y Mezcla de soluciones)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.9 / 10 (Fijo en los exámenes de Ciencias Biomédicas e Ingenierías)

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              SISTEMAS DISPERSOS
                                      │
         ┌────────────────────────────┼────────────────────────────┐
         ▼                            ▼                            ▼
   SUSPENSIONES                   COLOIDES                    SOLUCIONES
(Diámetro > 1000 nm,          (1 nm a 1000 nm,            (Diámetro < 1 nm,
 sedimentan, opacas)          Efecto Tyndall, Browniano)   monofásica, homogénea)
                                                                   │
         ┌─────────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                  ▼
UNIDADES FÍSICAS DE CONCENTRACIÓN                                  UNIDADES QUÍMICAS DE CONCENTRACIÓN
• Porcentaje en masa: $\%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100$     • Molaridad: $M = \frac{n_{\text{sto}}}{V_{\text{sol(L)}}} = \frac{m_{\text{sto}}}{\overline{M} \cdot V}$
• Porcentaje en volumen: $\%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100$ • Normalidad: $N = \frac{\#Eq\text{-}g}{V_{\text{sol(L)}}} = M \cdot \theta$
• Porcentaje masa-volumen: $\%m/v = \frac{m_{\text{sto}}}{V_{\text{sol}}} \times 100$ • Molalidad: $m = \frac{n_{\text{sto}}}{m_{\text{ste(kg)}}}$
• Partes por millón: $ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} = \frac{mg_{\text{sto}}}{L_{\text{sol}}}$ • Fracción Molar: $x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{total}}}$
                                                                                            │
         ┌──────────────────────────────────────────────────────────────────────────────────┘
         ▼
OPERACIONES CON SOLUCIONES
• Dilución:  $C_1 \cdot V_1 = C_2 \cdot V_2$  ($M_1 V_1 = M_2 V_2$)
• Mezcla de Soluciones del mismo soluto:  $C_1 V_1 + C_2 V_2 = C_F V_F$
• Neutralización Estequiométrica:  $\#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base}) \implies N_A \cdot V_A = N_B \cdot V_B$
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Clasificación Comparativa de los Sistemas Dispersos
Un sistema disperso consta de una **Fase Dispersa** (análoga al soluto) distribuida en el seno de una **Fase Dispersante** (medio continuo, análogo al solvente):

| Propiedad | Suspensión | Coloide | Solución Verdadera |
| :--- | :--- | :--- | :--- |
| **Tamaño de partícula** | $> 1000\text{ nm}$ ($> 10\,000\text{ Å}$) | $1\text{ nm} - 1000\text{ nm}$ | $< 1\text{ nm}$ ($< 10\text{ Å}$) |
| **Homogeneidad** | Heterogéneo (2 fases visibles) | Heterogéneo (microscópicamente) | Homogéneo (monofásico) |
| **Sedimentación** | Sedimentan por gravedad | No sedimentan espontáneamente | No sedimentan jamás |
| **Filtrabilidad** | Retenidas por papel de filtro común | Atraviesan filtro común, retenidas por ultrafiltros | No se separan por membranas |
| **Efecto Tyndall** | No aplica (opacas o traslúcidas) | **Presente** (dispersan el haz de luz) | **Ausente** (ópticamente transparentes) |
| **Ejemplos** | Jugo de papaya, leche de magnesia | Mayonesa, gelatina, niebla, humo, sangre | Salmuera, vinagre, aire filtrado, alcohol 70° |

### 3.2. Componentes y Clasificación de las Soluciones
1. **Componentes:**
   * **Soluto (sto):** Sustancia que se disuelve y se halla generalmente en menor proporción molar. Determina el nombre y la reactividad química de la solución. Puede ser uno o más.
   * **Solvente o Disolvente (ste):** Medio dispersante que disuelve al soluto. El agua ($H_2O$) es el solvente universal por su elevada constante dieléctrica ($\epsilon \approx 80$) y momento dipolar.
   * **Masa de la solución:**
     $$m_{\text{solución}} = m_{\text{soluto}} + m_{\text{solvente}}$$
2. **Clasificación por la Capacidad de Solubilidad ($S$ a una temperatura dada):**
   * *Solubilidad ($S$):* Cantidad máxima de soluto en gramos que puede disolverse en $100\text{ g}$ de solvente a una temperatura fija.
   * *Solución Diluida / Concentrada:* Clasificación cualitativa según la proporción relativa de soluto.
   * *Solución Insaturada:* Contiene menos soluto que la máxima cantidad permitida por la curva de solubilidad ($m_{\text{sto}} < S$).
   * *Solución Saturada:* Contiene exactamente la máxima cantidad disuelta en equilibrio termodinámico dinámico ($m_{\text{sto}} = S$).
   * *Solución Sobresaturada:* Sistema termodinámicamente inestable que contiene más soluto disuelto que el permitido por la saturación a esa temperatura. Precipita inmediatamente ante una perturbación mecánica o adición de un cristal de siembra.

### 3.3. Unidades Físicas de Concentración
1. **Porcentaje en Masa ($\%m/m$ o $\%P/P$):**
   $$\%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100\% = \frac{m_{\text{sto}}}{m_{\text{sto}} + m_{\text{ste}}} \times 100\%$$
2. **Porcentaje en Volumen ($\%v/v$ o Grado Alcohólico $^\circ\text{GL}$):**
   $$\%v/v = \frac{V_{\text{sto}}}{V_{\text{sol}}} \times 100\%$$
3. **Porcentaje Masa en Volumen ($\%m/v$):**
   $$\%m/v = \frac{m_{\text{sto}}(\text{g})}{V_{\text{sol}}(\text{mL})} \times 100\%$$
4. **Partes por Millón ($ppm$):** Usada para soluciones extremadamente diluidas (contaminación, trazas de metales pesados en agua):
   $$ppm = \frac{mg_{\text{sto}}}{kg_{\text{sol}}} \approx \frac{mg_{\text{sto}}}{L_{\text{solución acuosa}}}$$

### 3.4. Unidades Químicas de Concentración

#### A. Molaridad ($M$)
Número de moles de soluto disueltas por cada litro de solución:
$$M = \frac{n_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}}(\text{g/mol}) \cdot V_{\text{sol}}(\text{L})}$$
* **Fórmula Comercial Directa de Molaridad (cuando dan $\%m/m$ y densidad $\rho$):**
  $$M = \frac{10 \cdot \rho_{\text{sol}}(\text{g/mL}) \cdot (\%m/m)}{\overline{M}_{\text{sto}}}$$

#### B. Normalidad ($N$)
Número de equivalentes-gramo ($\#Eq\text{-}g$) de soluto por cada litro de solución:
$$N = \frac{\#Eq\text{-}g_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}}{PE_{\text{sto}} \cdot V_{\text{sol}}(\text{L})}$$
Donde el **Peso Equivalente ($PE$)** es:
$$PE = \frac{\overline{M}}{\theta}$$
* **Relación Fundamental entre Normalidad y Molaridad ("N = M · $\theta$"):**
  $$N = M \cdot \theta$$

* **Cálculo del Parámetro $\theta$ (Parámetro de Carga):**
  * Para un **Ácido:** $\theta = \text{número de hidrógenos } (H^+) \text{ sustituibles}$ (ej. $HCl \to \theta=1$; $H_2SO_4 \to \theta=2$; $H_3PO_4 \to \theta=3$).
  * Para un **Hidróxido:** $\theta = \text{número de iones hidróxido } (OH^-)$ (ej. $NaOH \to \theta=1$; $Ca(OH)_2 \to \theta=2$; $Al(OH)_3 \to \theta=3$).
  * Para una **Sal:** $\theta = \text{carga total positiva neta del catión metálico}$ (ej. $NaCl \to \theta=1$; $CaCO_3 \to \theta=2$; $Al_2(SO_4)_3 \to 2 \times (+3) = 6$).
  * Para un **Agente Redox:** $\theta = \text{número de electrones transferidos por fórmula en el proceso}$.

#### C. Molalidad ($m$)
Número de moles de soluto disueltas por cada kilogramo de **solvente puro** (es independiente de la temperatura porque no usa volúmenes):
$$m = \frac{n_{\text{sto}}}{m_{\text{ste}}(\text{kg})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}} \cdot m_{\text{ste}}(\text{kg})}$$

#### D. Fracción Molar ($x_{\text{sto}}, x_{\text{ste}}$)
$$x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{ste}} = \frac{n_{\text{ste}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{sto}} + x_{\text{ste}} = 1$$

### 3.5. Operaciones con Soluciones

#### A. Dilución de Soluciones
Proceso que consiste en añadir solvente puro (generalmente agua) a una solución concentrada. La cantidad de soluto permanece estrictamente invariable ($n_1 = n_2$):
$$C_1 \cdot V_1 = C_2 \cdot V_2 \implies M_1 \cdot V_1 = M_2 \cdot V_2 \implies N_1 \cdot V_1 = N_2 \cdot V_2$$

#### B. Mezcla de Soluciones del Mismo Soluto
Al mezclar dos o más soluciones de distinta concentración del mismo soluto, los moles de soluto son aditivos:
$$C_1 \cdot V_1 + C_2 \cdot V_2 = C_F \cdot V_F \quad \text{donde } V_F = V_1 + V_2$$

#### C. Neutralización y Titulación Ácido-Base
En el punto de equivalencia estequiométrica, el número de equivalentes-gramo del ácido neutraliza exactamente al número de equivalentes-gramo de la base:
$$\#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base})$$
$$N_{\text{ácido}} \cdot V_{\text{ácido}} = N_{\text{base}} \cdot V_{\text{base}}$$
$$M_A \cdot \theta_A \cdot V_A = M_B \cdot \theta_B \cdot V_B$$

---

## 4. DENSIDAD Y FACTORES DE CONVERSIÓN
$$\rho_{\text{solución}} = \frac{m_{\text{solución}}}{V_{\text{solución}}}$$
* La densidad del agua líquida se asume habitualmente como $\rho_{H_2O} \approx 1.0\text{ g/mL} = 1.0\text{ g/cm}^3 = 1000\text{ kg/m}^3$.

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir masa de la solución con masa del solvente en la Molalidad ($m$).** En la molalidad el denominador es EXCLUSIVAMENTE los kilogramos del solvente puro ($ste$), jamás la masa de la solución ($sol$).
* **Trampa 2: Sumar volúmenes asumiendo aditividad cuando se da la densidad final.** Si el problema proporciona la densidad de la solución final resultante, la masa total es siempre aditiva ($m_F = m_1 + m_2$), pero el volumen final DEBE despejarse como $V_F = m_F / \rho_F$, pues por contracción de volumen intermolecular $V_F \ne V_1 + V_2$.
* **Trampa 3: Usar Molaridad en lugar de Normalidad en la neutralización.** En $M_A V_A = M_B V_B$, esta fórmula solo es válida si $\theta_A = \theta_B = 1$ (ej. $HCl$ y $NaOH$). Si usas $H_2SO_4$ ($\theta=2$), DEBES multiplicar la molaridad por $\theta$: $2 M_A V_A = M_B V_B$.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia de la Molaridad Comercial:**
  $$M = \frac{10 \cdot D \cdot \%P}{\overline{M}} \quad \text{("10 De Pasadita sobre Masa Molar")}$$
* **Mnemotecnia Normalidad - Molaridad:** **"NEMO"**
  $$N = M \cdot \theta \quad (N = E \cdot M \cdot O \to N = M \cdot \theta)$$
* **Hacking de Dilución Rápida:**
  Si duplicas el volumen agregando agua ($V_2 = 2V_1$), la concentración se reduce automáticamente a la mitad ($C_2 = C_1 / 2$). Si el volumen se multiplica por 5, la concentración se divide entre 5.

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Porcentaje en Masa y Volumen)
Se disuelven $40\text{ g}$ de hidróxido de sodio ($NaOH$) en $160\text{ g}$ de agua destilada, obteniéndose una solución con una densidad experimental de $1.25\text{ g/mL}$. Calcule:
a) El porcentaje en masa ($\%m/m$) del soluto.
b) La concentración en porcentaje masa-volumen ($\%m/v$).

* **Resolución:**
  1. Masa total de la solución:
     $$m_{\text{sol}} = m_{\text{sto}} + m_{\text{ste}} = 40\text{ g} + 160\text{ g} = 200\text{ g}$$
  2. a) Porcentaje en masa ($\%m/m$):
     $$\%m/m = \frac{m_{\text{sto}}}{m_{\text{sol}}} \times 100\% = \frac{40\text{ g}}{200\text{ g}} \times 100\% = 20\%$$
  3. b) Volumen de la solución a partir de la densidad:
     $$V_{\text{sol}} = \frac{m_{\text{sol}}}{\rho_{\text{sol}}} = \frac{200\text{ g}}{1.25\text{ g/mL}} = 160\text{ mL}$$
  4. Porcentaje masa-volumen ($\%m/v$):
     $$\%m/v = \frac{m_{\text{sto}}}{V_{\text{sol}}(\text{mL})} \times 100\% = \frac{40\text{ g}}{160\text{ mL}} \times 100\% = 25\%$$
* **Respuesta:** $\%m/m = 20\%$ y $\%m/v = 25\%$.

---

### Problema 2 (Nivel Intermedio - Molaridad y Normalidad Comercial)
Un frasco de ácido nítrico concentrado ($HNO_3$) tiene en su etiqueta una pureza del $63\%$ en masa y una densidad de $1.4\text{ g/mL}$. Calcule la Molaridad y la Normalidad de dicho ácido.
*(Masas atómicas: $H=1, N=14, O=16$)*.

* **Resolución:**
  1. Masa molar del $HNO_3$:
     $$\overline{M} = 1 + 14 + 3(16) = 63\text{ g/mol}$$
  2. Aplicamos la fórmula comercial directa:
     $$M = \frac{10 \cdot \rho \cdot (\%m/m)}{\overline{M}}$$
     $$M = \frac{10 \times 1.4 \times 63}{63} = 14\text{ M}$$
  3. Cálculo de la Normalidad ($N = M \cdot \theta$):
     El $HNO_3$ es un ácido monoprótico $\implies \theta = 1$ ($1\text{ ión } H^+$).
     $$N = 14\text{ M} \times 1 = 14\text{ N}$$
* **Respuesta:** Molaridad = $14\text{ M}$ y Normalidad = $14\text{ N}$.

---

### Problema 3 (Nivel Intermedio - Dilución de una Solución)
Se tienen $250\text{ mL}$ de una solución acuosa de ácido sulfúrico ($H_2SO_4$) $4.0\text{ M}$. ¿Qué volumen de agua destilada se debe agregar para diluirla hasta una concentración $0.5\text{ M}$?

* **Resolución:**
  1. Identificamos los datos de dilución:
     * Estado 1 (Concentrado): $M_1 = 4.0\text{ M}$, $V_1 = 250\text{ mL}$.
     * Estado 2 (Diluido): $M_2 = 0.5\text{ M}$, $V_2 = ?$
  2. Aplicamos la ecuación de dilución:
     $$M_1 \cdot V_1 = M_2 \cdot V_2$$
     $$4.0 \times 250 = 0.5 \times V_2$$
     $$1000 = 0.5 \times V_2 \implies V_2 = \frac{1000}{0.5} = 2000\text{ mL}$$
  3. Volumen de agua añadido ($\Delta V_{H_2O}$):
     $$V_2 = V_1 + V_{H_2O} \implies V_{H_2O} = V_2 - V_1 = 2000\text{ mL} - 250\text{ mL} = 1750\text{ mL} = 1.75\text{ L}$$
* **Respuesta:** Se deben agregar $1750\text{ mL}$ de agua destilada.

---

### Problema 4 (Nivel Avanzado - Molalidad y Fracción Molar)
Se prepara una solución disolviendo $180\text{ g}$ de glucosa ($C_6H_{12}O_6$) en $500\text{ g}$ de agua pura ($H_2O$). Determine:
a) La molalidad ($m$) de la solución.
b) La fracción molar del soluto ($x_{\text{sto}}$) y del solvente ($x_{\text{ste}}$).
*(Masas atómicas: $C=12, H=1, O=16$)*.

* **Resolución:**
  1. Masas molares:
     * Glucosa ($C_6H_{12}O_6$): $6(12) + 12(1) + 6(16) = 180\text{ g/mol}$.
     * Agua ($H_2O$): $18\text{ g/mol}$.
  2. Número de moles de cada componente:
     * Moles de glucosa ($n_{\text{sto}}$):
       $$n_{\text{sto}} = \frac{180\text{ g}}{180\text{ g/mol}} = 1.0\text{ mol}$$
     * Moles de agua ($n_{\text{ste}}$):
       $$n_{\text{ste}} = \frac{500\text{ g}}{18\text{ g/mol}} \approx 27.78\text{ moles}$$
     * Moles totales: $n_{\text{total}} = 1.0 + 27.78 = 28.78\text{ moles}$.
  3. a) Cálculo de la Molalidad ($m$):
     Masa del solvente en kilogramos: $m_{\text{ste}} = 500\text{ g} = 0.5\text{ kg}$.
     $$m = \frac{n_{\text{sto}}}{m_{\text{ste}}(\text{kg})} = \frac{1.0\text{ mol}}{0.5\text{ kg}} = 2.0\text{ mol/kg} = 2.0\text{ m}$$
  4. b) Cálculo de las Fracciones Molares:
     * Fracción molar del soluto (glucosa):
       $$x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{total}}} = \frac{1.0}{28.78} \approx 0.0347$$
     * Fracción molar del solvente (agua):
       $$x_{\text{ste}} = 1 - x_{\text{sto}} = 1 - 0.0347 = 0.9653$$
* **Respuesta:** Molalidad = $2.0\text{ m}$; $x_{\text{glucosa}} \approx 0.0347$ y $x_{\text{agua}} \approx 0.9653$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Titulación y Neutralización de Mezclas de Ácidos)
Para neutralizar completamente una muestra de $50\text{ mL}$ de una disolución acuosa que contiene una mezcla equimolar de ácido clorhídrico ($HCl$) y ácido sulfúrico ($H_2SO_4$), se requieren exactamente $60\text{ mL}$ de una solución de hidróxido de sodio ($NaOH$) $0.5\text{ M}$. Determine la molaridad inicial de cada uno de los ácidos en la muestra original.

* **Resolución:**
  1. Datos de la base neutralizante ($NaOH$):
     * $M_{\text{base}} = 0.5\text{ M}$
     * Para el $NaOH$: $\theta = 1 \implies N_{\text{base}} = M \cdot \theta = 0.5\text{ N}$
     * $V_{\text{base}} = 60\text{ mL} = 0.060\text{ L}$
     * Número de equivalentes-gramo de base:
       $$\#Eq\text{-}g(\text{base}) = N_{\text{base}} \cdot V_{\text{base}} = 0.5\text{ N} \times 0.060\text{ L} = 0.030\text{ Eq-g}$$
  2. Ley del Equivalente Químico en la neutralización:
     $$\#Eq\text{-}g(\text{ácidos totales}) = \#Eq\text{-}g(\text{base}) = 0.030\text{ Eq-g}$$
  3. Relación de equivalentes de la mezcla de ácidos:
     La muestra contiene una mezcla **equimolar**, es decir, el número de moles de $HCl$ es igual al de $H_2SO_4$:
     $$n(HCl) = n(H_2SO_4) = n_x$$
     * Para el $HCl$: $\theta_1 = 1 \implies \#Eq\text{-}g(HCl) = n(HCl) \cdot \theta_1 = n_x \cdot 1 = n_x$.
     * Para el $H_2SO_4$: $\theta_2 = 2 \implies \#Eq\text{-}g(H_2SO_4) = n(H_2SO_4) \cdot \theta_2 = n_x \cdot 2 = 2n_x$.
  4. Suma de equivalentes-gramo:
     $$\#Eq\text{-}g(HCl) + \#Eq\text{-}g(H_2SO_4) = 0.030$$
     $$n_x + 2n_x = 0.030 \implies 3n_x = 0.030 \implies n_x = 0.010\text{ moles}$$
  5. Molaridad de cada ácido en la mezcla de $50\text{ mL}$ ($0.050\text{ L}$):
     $$M(HCl) = \frac{n(HCl)}{V} = \frac{0.010\text{ mol}}{0.050\text{ L}} = 0.20\text{ M}$$
     $$M(H_2SO_4) = \frac{n(H_2SO_4)}{V} = \frac{0.010\text{ mol}}{0.050\text{ L}} = 0.20\text{ M}$$
* **Respuesta:** La molaridad inicial de ambos ácidos en la solución es $0.20\text{ M}$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Solución:** Mezcla homogénea monofásica a escala atómica o molecular de dos o más sustancias puras.
2. **Soluto:** Componente disuelto en una solución que determina sus características y reactividad química.
3. **Solvente:** Medio dispersante que se encuentra en la misma fase física que la solución resultante.
4. **Molaridad ($M$):** Unidad de concentración química que expresa el número de moles de soluto por litro de solución.
5. **Normalidad ($N$):** Concentración equivalente expresada en número de equivalentes-gramo de soluto por litro de solución.
6. **Molalidad ($m$):** Relación cuantitativa entre las moles de soluto y la masa en kilogramos del solvente puro.
7. **Solubilidad:** Concentración máxima de soluto que puede disolverse en una cantidad fija de solvente a una temperatura dada.
8. **Efecto Tyndall:** Dispersión lateral de un haz de luz provocado por las partículas coloidales en suspensión.
9. **Dilución:** Procedimiento de laboratorio mediante el cual se disminuye la concentración de una solución agregando solvente.
10. **Peso Equivalente:** Masa de una sustancia que cede o acepta un mol de protones, electrones o equivalente electrostático unitario.

---

## 9. FLASHCARDS
* **Front:** ¿Por qué la molalidad ($m$) no cambia con la temperatura, a diferencia de la molaridad ($M$)?
  * **Back:** Porque la molalidad depende exclusivamente de las masas del soluto y solvente ($kg$), las cuales son invariables con la temperatura; mientras que la molaridad depende del volumen de la solución ($L$), el cual se dilata con el calor.
* **Front:** ¿Cuál es la fórmula rápida para calcular la Molaridad si se conoce la densidad y el porcentaje en masa?
  * **Back:** $M = \frac{10 \cdot \rho_{\text{sol}} \cdot (\%m/m)}{\overline{M}_{\text{soluto}}}$ ("10 De Pasadita sobre Masa Molar").
* **Front:** ¿Cómo se relacionan la Normalidad y la Molaridad?
  * **Back:** $N = M \cdot \theta$, donde $\theta$ es el parámetro de valencia ($H^+$ en ácidos, $OH^-$ en bases, carga del catión en sales).
* **Front:** ¿Qué ocurre con la cantidad total de soluto durante una dilución con agua pura?
  * **Back:** El número de moles o equivalentes de soluto permanece estrictamente constante: $C_1 \cdot V_1 = C_2 \cdot V_2$.
* **Front:** ¿Cuál es la condición estequiométrica en el punto de equivalencia de una neutralización?
  * **Back:** El número de equivalentes-gramo de ácido iguala exactamente al número de equivalentes-gramo de la base: $N_A \cdot V_A = N_B \cdot V_B$.

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_10",
  "titulo": "Sistemas Dispersos y Soluciones",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál es la molaridad de una solución preparada disolviendo 20 g de NaOH (M = 40 g/mol) en agua hasta completar 500 mL?",
      "opciones": ["0.5 M", "1.0 M", "2.0 M", "0.25 M"],
      "respuesta_correcta": 1,
      "retroalimentacion": "n = 20 g / 40 g/mol = 0.5 mol. V = 500 mL = 0.5 L. M = n / V = 0.5 mol / 0.5 L = 1.0 M."
    },
    {
      "id": "q2",
      "pregunta": "Para el ácido sulfúrico (H2SO4, M = 98 g/mol), si su concentración es 1.5 M, su Normalidad es:",
      "opciones": ["0.75 N", "1.5 N", "3.0 N", "4.5 N"],
      "respuesta_correcta": 2,
      "retroalimentacion": "El H2SO4 tiene θ = 2 (dos H+). N = M * θ = 1.5 M * 2 = 3.0 N."
    },
    {
      "id": "q3",
      "pregunta": "Si a 100 mL de HCl 2 M se le agregan 300 mL de agua pura, la molaridad final es:",
      "opciones": ["0.5 M", "1.0 M", "0.67 M", "0.25 M"],
      "respuesta_correcta": 0,
      "retroalimentacion": "V2 = 100 + 300 = 400 mL. C1 * V1 = C2 * V2 => 2 M * 100 mL = C2 * 400 mL => C2 = 200 / 400 = 0.5 M."
    }
  ]
}
```
