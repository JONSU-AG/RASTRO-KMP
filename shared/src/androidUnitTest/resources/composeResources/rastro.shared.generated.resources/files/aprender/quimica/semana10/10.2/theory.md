## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Fórmula Comercial Directa de Molaridad (cuando dan \%m/m y densidad \rho):**
  M = \frac{10 \cdot \rho_{\text{sol}}(\text{g/mL}) \cdot (\%m/m)}{\overline{M}_{\text{sto}}}

#### B. Normalidad (N)
Número de equivalentes-gramo (\#Eq\text{-}g) de soluto por cada litro de solución:
N = \frac{\#Eq\text{-}g_{\text{sto}}}{V_{\text{sol}}(\text{L})} = \frac{m_{\text{sto}}}{PE_{\text{sto}} \cdot V_{\text{sol}}(\text{L})}
Donde el **Peso Equivalente (PE)** es:
PE = \frac{\overline{M}}{\theta}
* **Relación Fundamental entre Normalidad y Molaridad ("N = M · \theta"):**
  N = M \cdot \theta

* **Cálculo del Parámetro \theta (Parámetro de Carga):**
  * Para un **Ácido:** \theta = \text{número de hidrógenos } (H^+) \text{ sustituibles} (ej. HCl \to \theta=1; H_2SO_4 \to \theta=2; H_3PO_4 \to \theta=3).
  * Para un **Hidróxido:** \theta = \text{número de iones hidróxido } (OH^-) (ej. NaOH \to \theta=1; Ca(OH)_2 \to \theta=2; Al(OH)_3 \to \theta=3).
  * Para una **Sal:** \theta = \text{carga total positiva neta del catión metálico} (ej. NaCl \to \theta=1; CaCO_3 \to \theta=2; Al_2(SO_4)_3 \to 2 \times (+3) = 6).
  * Para un **Agente Redox:** \theta = \text{número de electrones transferidos por fórmula en el proceso}.

#### C. Molalidad (m)
Número de moles de soluto disueltas por cada kilogramo de **solvente puro** (es independiente de la temperatura porque no usa volúmenes):
m = \frac{n_{\text{sto}}}{m_{\text{ste}}(\text{kg})} = \frac{m_{\text{sto}}(\text{g})}{\overline{M}_{\text{sto}} \cdot m_{\text{ste}}(\text{kg})}

#### D. Fracción Molar (x_{\text{sto}}, x_{\text{ste}})
x_{\text{sto}} = \frac{n_{\text{sto}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{ste}} = \frac{n_{\text{ste}}}{n_{\text{sto}} + n_{\text{ste}}} \quad ; \quad x_{\text{sto}} + x_{\text{ste}} = 1

### 3.5. Operaciones con Soluciones

#### A. Dilución de Soluciones
Proceso que consiste en añadir solvente puro (generalmente agua) a una solución concentrada. La cantidad de soluto permanece estrictamente invariable (n_1 = n_2):
C_1 \cdot V_1 = C_2 \cdot V_2 \implies M_1 \cdot V_1 = M_2 \cdot V_2 \implies N_1 \cdot V_1 = N_2 \cdot V_2

#### B. Mezcla de Soluciones del Mismo Soluto
Al mezclar dos o más soluciones de distinta concentración del mismo soluto, los moles de soluto son aditivos:
C_1 \cdot V_1 + C_2 \cdot V_2 = C_F \cdot V_F \quad \text{donde } V_F = V_1 + V_2

#### C. Neutralización y Titulación Ácido-Base
En el punto de equivalencia estequiométrica, el número de equivalentes-gramo del ácido neutraliza exactamente al número de equivalentes-gramo de la base:
\#Eq\text{-}g(\text{Ácido}) = \#Eq\text{-}g(\text{Base})
N_{\text{ácido}} \cdot V_{\text{ácido}} = N_{\text{base}} \cdot V_{\text{base}}
M_A \cdot \theta_A \cdot V_A = M_B \cdot \theta_B \cdot V_B

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia de la Molaridad Comercial:**
  M = \frac{10 \cdot D \cdot \%P}{\overline{M}} \quad \text{("10 De Pasadita sobre Masa Molar")}
* **Mnemotecnia Normalidad - Molaridad:** **"NEMO"**
  N = M \cdot \theta \quad (N = E \cdot M \cdot O \to N = M \cdot \theta)
* **Hacking de Dilución Rápida:**
  Si duplicas el volumen agregando agua (V_2 = 2V_1), la concentración se reduce automáticamente a la mitad (C_2 = C_1 / 2). Si el volumen se multiplica por 5, la concentración se divide entre 5.

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Confundir masa de la solución con masa del solvente en la Molalidad (m).** En la molalidad el denominador es EXCLUSIVAMENTE los kilogramos del solvente puro (ste), jamás la masa de la solución (sol).
* **Trampa 2: Sumar volúmenes asumiendo aditividad cuando se da la densidad final.** Si el problema proporciona la densidad de la solución final resultante, la masa total es siempre aditiva (m_F = m_1 + m_2), pero el volumen final DEBE despejarse como V_F = m_F / \rho_F, pues por contracción de volumen intermolecular V_F \ne V_1 + V_2.
* **Trampa 3: Usar Molaridad en lugar de Normalidad en la neutralización.** En M_A V_A = M_B V_B, esta fórmula solo es válida si \theta_A = \theta_B = 1 (ej. HCl y NaOH). Si usas H_2SO_4 (\theta=2), DEBES multiplicar la molaridad por \theta: 2 M_A V_A = M_B V_B.

---

## Importancia de las soluciones

Una solución es una mezcla homogénea a la escala de observación considerada. El soluto y el solvente no tienen que ser siempre sólido y agua: pueden existir otras combinaciones. La disolución depende de las interacciones entre partículas y de las condiciones; la agitación puede acelerar el proceso sin aumentar necesariamente la solubilidad de equilibrio.

Las soluciones permiten transportar sustancias, dosificar concentraciones y realizar procesos industriales o de laboratorio. Para comparar concentraciones, revisa su base: molaridad expresa moles por litro de solución; porcentaje en masa relaciona masa de soluto y masa total. En una dilución sin pérdida ni reacción del soluto, su cantidad permanece constante; por ello C₁V₁ = C₂V₂ cuando se usan concentraciones compatibles y el volumen correspondiente de solución.
