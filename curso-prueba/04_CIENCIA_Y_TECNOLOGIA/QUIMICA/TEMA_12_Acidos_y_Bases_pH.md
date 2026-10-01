# TEMA 12: Ácidos, Bases y Escala de pH

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Analítica y Equilibrio Iónico en Solución Acuosa
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Alto (Cálculo logarítmico de pH/pOH, ácidos/bases fuertes y débiles, hidrólisis de sales y soluciones buffer)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (Tema estrella indispensable en el examen de Biomédicas)

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                              ÁCIDOS Y BASES
                                     │
         ┌───────────────────────────┴───────────────────────────┐
         ▼                                                       ▼
TEORÍAS ÁCIDO-BASE                                      AUTOIONIZACIÓN DEL AGUA
• Arrhenius: $H^+$ en agua / $OH^-$ en agua             • $2H_2O \rightleftharpoons H_3O^+ + OH^-$
• Brønsted-Lowry: Dona $H^+$ / Acepta $H^+$              • $K_w = [H^+][OH^-] = 1.0 \times 10^{-14}$ (a 25 °C)
  (Pares Conjugados Ácido-Base)                                  │
• Lewis: Acepta par $e^-$ / Dona par $e^-$                       ▼
                                                        ESCALA DE pH Y pOH (Sørensen)
                                                        • $pH = -\log[H^+]$  ;  $pOH = -\log[OH^-]$
                                                        • $pH + pOH = 14$  (a 25 °C)
                                                                 │
         ┌───────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                ▼
ELECTROLITOS FUERTES ($100\%$ disociación)                              ELECTROLITOS DÉBILES (Equilibrio)
• Ácidos Fuertes: $HCl, HBr, HI, HNO_3, HClO_4, H_2SO_4$                • Ácidos Débiles: $CH_3COOH, HF, HCN$ ($K_a$)
• Bases Fuertes: Hidróxidos del Grupo IA y IIA                          • Bases Débiles: $NH_3, \text{aminas}$ ($K_b$)
  $[H^+] = M_{\text{ácido}} \cdot \theta$                                 $[H^+] = \sqrt{K_a \cdot C_0}$
  $[OH^-] = M_{\text{base}} \cdot \theta$                                 $[OH^-] = \sqrt{K_b \cdot C_0}$
                                                                                          │
         ┌────────────────────────────────────────────────────────────────────────────────┘
         ▼
SISTEMAS BUFFER / AMORTIGUADORES Y TITULACIÓN
• Ecuación de Henderson-Hasselbalch:  $pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)$
• Hidrólisis Salina: Sal ácida, básica o neutra
• Curvas de Titulación y Punto de Equivalencia
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Teorías Modernas Ácido-Base

#### A. Teoría Clásica de Svante Arrhenius (1884)
* **Ácido:** Sustancia hidrogenada neutra que, al disolverse exclusivamente en agua, se disocia produciendo iones hidrógeno o protones ($H^+$ o $H_3O^+$):
  $$HA_{(ac)} \xrightarrow{H_2O} H^+_{(ac)} + A^-_{(ac)}$$
* **Base:** Sustancia que, al disolverse en agua, se disocia liberando iones hidróxido u oxhidrilo ($OH^-$):
  $$B(OH)_{n(ac)} \xrightarrow{H_2O} B^{n+}_{(ac)} + n OH^-_{(ac)}$$
* *Limitaciones de Arrhenius:* Solo es aplicable a disoluciones acuosas; no explica el carácter fuertemente básico de sustancias como el gas amoníaco ($NH_3$), que carecen del grupo $OH$ en su fórmula molecular.

#### B. Teoría Protónica de Johannes Brønsted y Thomas Lowry (1923)
* **Ácido:** Toda especie química (molecular o iónica) capaz de **donar o ceder uno o más protones ($H^+$)** a otra especie.
* **Base:** Toda especie química capaz de **aceptar o recibir uno o más protones ($H^+$)**.
* **Pares Conjugados Ácido-Base:** Pareja de especies químicas que difieren exactamente en un único protón ($H^+$):
  $$\text{Ácido}_1 + \text{Base}_2 \rightleftharpoons \text{Base Conjugada}_1 + \text{Ácido Conjugado}_2$$
  * *Ejemplo:*
    $$CH_3COOH + H_2O \rightleftharpoons CH_3COO^- + H_3O^+$$
    - Par 1: $CH_3COOH$ (ácido) / $CH_3COO^-$ (base conjugada).
    - Par 2: $H_2O$ (base) / $H_3O^+$ (ácido conjugado).
* **Sustancia Anfótera o Anfolito:** Sustancia que puede actuar como ácido o como base según el reactivo con el que interactúe (el agua $H_2O$, el ión bicarbonato $HCO_3^-$, el ión bisulfato $HSO_4^-$).
  * Regla de Fuerza: "A un ácido más fuerte le corresponde una base conjugada más débil, y viceversa".

#### C. Teoría Electrónica de Gilbert N. Lewis (1923)
* **Ácido de Lewis:** Especie química que posee un orbital atómico vacío y es capaz de **aceptar un par de electrones** formando un enlace covalente coordinado (electrófilo) (ej. cationes metálicos: $H^+, Fe^{3+}, Cu^{2+}$; compuestos con octeto incompleto: $BF_3, AlCl_3, SO_3$).
* **Base de Lewis:** Especie química que posee al menos un **par de electrones solitario libre** que puede **donar** para formar un enlace covalente dativo (nucleófilo) (ej. $NH_3, H_2O, OH^-, CN^-, Cl^-$).
* *Reacción General de Lewis:*
  $$BF_3 + :NH_3 \to F_3B \leftarrow NH_3 \quad (\text{Aducto o complejo de coordinación})$$

### 3.2. Autoionización del Agua y Producto Iónico ($K_w$)
El agua líquida pura es un electrolito extraordinariamente débil que experimenta auto-protólisis en un equilibrio muy desplazado a la izquierda:
$$H_2O_{(l)} + H_2O_{(l)} \rightleftharpoons H_3O^+_{(ac)} + OH^-_{(ac)}$$
La constante termodinámica de autoionización del agua a $25^\circ\text{C}$ ($298\text{ K}$) es:
$$K_w = [H^+][OH^-] = 1.0 \times 10^{-14}$$
* En agua neutra pura a $25^\circ\text{C}$:
  $$[H^+] = [OH^-] = \sqrt{10^{-14}} = 1.0 \times 10^{-7}\text{ M}$$
* **Influencia de la Temperatura en $K_w$:** La autoionización del agua es un proceso endotérmico ($\Delta H > 0$). Si $T > 25^\circ\text{C}$, $K_w > 10^{-14}$ (a $60^\circ\text{C}$, $K_w \approx 10^{-13}$, por lo que el agua neutra tiene $pH \approx 6.5$).

### 3.3. Escala Logarítmica de pH y pOH (Søren Peter Lauritz Sørensen, 1909)
Para evitar el uso de exponentes negativos microscópicos se define el operador matemático potencial "$p$" ($pX = -\log_{10} X$):
$$pH = -\log_{10}[H^+] = -\log_{10}[H_3O^+] \iff [H^+] = 10^{-pH}$$
$$pOH = -\log_{10}[OH^-] \iff [OH^-] = 10^{-pOH}$$
Aplicando $-\log$ a la expresión de $K_w$:
$$-\log(K_w) = -\log([H^+][OH^-]) = -\log[H^+] + (-\log[OH^-])$$
$$pK_w = pH + pOH$$
* A la temperatura estándar de $25^\circ\text{C}$:
  $$pH + pOH = 14$$

* **Criterio de Acidez a $25^\circ\text{C}$:**
  * **Medio Ácido:** $[H^+] > 10^{-7}\text{ M} \implies pH < 7 \quad (pOH > 7)$
  * **Medio Neutro:** $[H^+] = [OH^-] = 10^{-7}\text{ M} \implies pH = 7 \quad (pOH = 7)$
  * **Medio Básico o Alcalino:** $[H^+] < 10^{-7}\text{ M} \implies pH > 7 \quad (pOH < 7)$

### 3.4. Cálculo del pH en Ácidos y Bases Fuertes
Los electrolitos fuertes se ionizan o disocian cuantitativamente al $100\%$ en agua ($\alpha = 1$):
* **Ácidos Fuertes Monopróticos:** $HCl, HBr, HI, HNO_3, HClO_4, HClO_3$.
  $$[H^+] = C_{\text{ácido}} \implies pH = -\log(C_{\text{ácido}})$$
* **Ácidos Fuertes Dipróticos:** $H_2SO_4$ (primera ionización completa).
  $$[H^+] \approx 2 \cdot C_{\text{ácido}}$$
* **Bases Fuertes:** Hidróxidos de metales alcalinos ($LiOH, NaOH, KOH$) y alcalinotérreos solubles ($Ca(OH)_2, Sr(OH)_2, Ba(OH)_2$).
  $$[OH^-] = n \cdot C_{\text{base}} \implies pOH = -\log([OH^-]) \implies pH = 14 - pOH$$

### 3.5. Cálculo del pH en Ácidos y Bases Débiles
Los electrolitos débiles se ionizan solo parcialmente en agua ($\alpha \ll 1$), estableciendo un equilibrio de disociación gobernado por su **Constante de Acidez ($K_a$)** o **Constante de Basicidad ($K_b$)**:

1. **Ácido Débil Monoprótico ($HA$):**
   $$HA_{(ac)} + H_2O \rightleftharpoons H_3O^+ + A^- \quad ; \quad K_a = \frac{[H^+][A^-]}{[HA]}$$
   Si la concentración inicial $C_0$ satisface $\frac{C_0}{K_a} > 1000$ (disociación menor al $5\%$), la aproximación $C_0 - x \approx C_0$ es válida:
   $$K_a = \frac{x^2}{C_0} \implies x = [H^+] = \sqrt{K_a \cdot C_0}$$
   $$pH = -\log\left(\sqrt{K_a \cdot C_0}\right) = \frac{1}{2}(pK_a - \log C_0)$$
   * Grado de ionización: $\alpha = \frac{[H^+]}{C_0} = \sqrt{\frac{K_a}{C_0}}$.
2. **Base Débil ($B$ o $NH_3$):**
   $$NH_3 + H_2O \rightleftharpoons NH_4^+ + OH^- \quad ; \quad K_b = \frac{[NH_4^+][OH^-]}{[NH_3]}$$
   $$[OH^-] = \sqrt{K_b \cdot C_0} \implies pOH = -\log\left(\sqrt{K_b \cdot C_0}\right) \implies pH = 14 - pOH$$
3. **Relación entre Pares Conjugados:**
   $$K_a \cdot K_b = K_w = 10^{-14} \iff pK_a + pK_b = 14$$

### 3.6. Soluciones Reguladoras, Tampón o Buffer
Sistemas acuosos capaces de resistir y amortiguar variaciones drásticas de pH ante el agregado de pequeñas cantidades de ácidos o bases fuertes.
* **Composición:**
  * Ácido débil $+$ Sal de su base conjugada (ej. $CH_3COOH + CH_3COONa$).
  * Base débil $+$ Sal de su ácido conjugado (ej. $NH_3 + NH_4Cl$).
* **Ecuación de Henderson - Hasselbalch:**
  $$pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)$$
  $$pOH = pK_b + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Base Débil}]}\right)$$
  * Si $[\text{Sal}] = [\text{Ácido}] \implies pH = pK_a$ (Máxima capacidad amortiguadora).

### 3.7. Hidrólisis de Sales
Reacción de los iones de una sal disuelta con el agua:
1. **Sal de Ácido Fuerte y Base Fuerte ($NaCl, KNO_3$):** Ningún ión se hidroliza $\implies$ Solución **Neutra ($pH = 7$)**.
2. **Sal de Ácido Fuerte y Base Débil ($NH_4Cl$):** El catión $NH_4^+$ se hidroliza cediendo $H^+$ $\implies$ Solución **Ácida ($pH < 7$)**.
3. **Sal de Ácido Débil y Base Fuerte ($CH_3COONa, NaCN$):** El anión $CH_3COO^-$ se hidroliza aceptando $H^+$ y liberando $OH^-$ $\implies$ Solución **Básica ($pH > 7$)**.
4. **Sal de Ácido Débil y Base Débil ($NH_4CN$):** Ambos se hidrolizan; el carácter del pH depende de la comparación entre $K_a$ y $K_b$.

---

## 4. INDICADORES ÁCIDO-BASE Y RANGO DE VIRAJE
| Indicador | Color Ácido | Rango de pH de Viraje | Color Básico |
| :--- | :---: | :---: | :---: |
| **Fenolftaleína** | Incoloro | $8.2 - 10.0$ | Rojo grosella / Fucsia |
| **Tornasol** | Rojo | $5.0 - 8.0$ | Azul |
| **Naranja de Metilo** | Rojo / Naranja | $3.1 - 4.4$ | Amarillo |
| **Azul de Bromotimol** | Amarillo | $6.0 - 7.6$ | Azul |

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Calcular $pH$ de una solución de $HCl \ 10^{-8}\text{ M}$ como 8.** ERROR FATAL DE ADMISIÓN. ¡Un ácido jamás puede tener un $pH$ básico ($> 7$)! A concentraciones ultra diluidas ($< 10^{-6}\text{ M}$), se DEBE sumar la autoionización del agua: $[H^+]_{\text{total}} = 10^{-8} + 10^{-7} = 1.1 \times 10^{-7}\text{ M} \implies pH = -\log(1.1 \times 10^{-7}) \approx 6.96$ (ligeramente ácido).
* **Trampa 2: Olvidar el factor de disociación para bases dipróticas como $Ca(OH)_2$.** Si tienes $Ca(OH)_2 \ 0.05\text{ M}$, cada mol libera $2\text{ moles}$ de $OH^-$, por lo que $[OH^-] = 2 \times 0.05 = 0.10\text{ M} = 10^{-1}\text{ M} \implies pOH = 1 \implies pH = 13$.
* **Trampa 3: Creer que el agua a $60^\circ\text{C}$ con $pH = 6.5$ es ácida.** FALSO. Como $K_w$ aumenta con la temperatura, a $60^\circ\text{C}$ la neutralidad ocurre cuando $[H^+] = [OH^-] \implies pH = pOH = 6.5$. El agua sigue siendo neutra aunque su pH sea $6.5$.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Hacking Logarítmico para pH sin Calculadora:**
  Si $[H^+] = a \times 10^{-b}\text{ M}$ (con $1 \le a \le 10$):
  $$pH = b - \log_{10}(a)$$
  * *Valores memorizados para admisión:*
    - $\log 2 \approx 0.30$
    - $\log 3 \approx 0.48$
    - $\log 5 \approx 0.70$
    - $\log 7 \approx 0.85$
  * *Ejemplo:* Si $[H^+] = 2 \times 10^{-5}\text{ M} \implies pH = 5 - \log 2 = 5 - 0.30 = 4.70$. ¡Cálculo en 3 segundos!

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - pH de Ácido Fuerte y Base Fuerte)
Calcule el pH de las siguientes soluciones acuosas a $25^\circ\text{C}$:
a) Solución de ácido clorhídrico ($HCl$) $0.001\text{ M}$.
b) Solución de hidróxido de bario ($Ba(OH)_2$) $0.005\text{ M}$.

* **Resolución:**
  * a) Ácido Clorhídrico ($HCl$): Electrolito fuerte monoprótico.
    $$HCl \to H^+ + Cl^- \implies [H^+] = 0.001\text{ M} = 10^{-3}\text{ M}$$
    $$pH = -\log(10^{-3}) = 3$$
  * b) Hidróxido de Bario ($Ba(OH)_2$): Base fuerte divalente.
    $$Ba(OH)_2 \to Ba^{2+} + 2OH^-$$
    $$[OH^-] = 2 \times [Ba(OH)_2] = 2 \times 0.005\text{ M} = 0.010\text{ M} = 10^{-2}\text{ M}$$
    $$pOH = -\log(10^{-2}) = 2$$
    $$pH = 14 - pOH = 14 - 2 = 12$$
* **Respuesta:** a) $pH = 3$; b) $pH = 12$.

---

### Problema 2 (Nivel Intermedio - pH de un Ácido Débil)
Se tiene una disolución acuosa $0.1\text{ M}$ de ácido acético ($CH_3COOH$). Si la constante de acidez del ácido acético a $25^\circ\text{C}$ es $K_a = 1.8 \times 10^{-5}$, determine:
a) La concentración de iones hidronio $[H^+]$ en el equilibrio.
b) El pH de la solución.
c) El porcentaje de ionización ($\% \alpha$).
*(Dato: $\log 1.34 \approx 0.13$)*.

* **Resolución:**
  1. Equilibrio de disociación:
     $$CH_3COOH + H_2O \rightleftharpoons CH_3COO^- + H_3O^+$$
     $$K_a = \frac{x^2}{C_0 - x} \approx \frac{x^2}{C_0}$$
  2. Como $C_0 / K_a = 0.1 / 1.8 \times 10^{-5} \approx 5555 > 1000$, la simplificación es válida:
     $$x = [H^+] = \sqrt{K_a \cdot C_0} = \sqrt{(1.8 \times 10^{-5})(0.1)} = \sqrt{1.8 \times 10^{-6}} = \sqrt{1.8} \times 10^{-3}$$
     $$\sqrt{1.8} \approx 1.34 \implies [H^+] = 1.34 \times 10^{-3}\text{ M}$$
  3. Cálculo del pH:
     $$pH = -\log(1.34 \times 10^{-3}) = 3 - \log(1.34) = 3 - 0.13 = 2.87$$
  4. Porcentaje de ionización ($\% \alpha$):
     $$\% \alpha = \frac{[H^+]}{C_0} \times 100\% = \frac{1.34 \times 10^{-3}}{0.1} \times 100\% = 1.34\%$$
     (Comprobado: $1.34\% < 5\%$, la simplificación fue rigurosamente correcta).
* **Respuesta:** $[H^+] = 1.34 \times 10^{-3}\text{ M}$, $pH = 2.87$ y $\% \alpha = 1.34\%$.

---

### Problema 3 (Nivel Intermedio - Mezcla de Ácido Fuerte y Base Fuerte)
Se mezclan $400\text{ mL}$ de una solución de ácido nítrico ($HNO_3$) $0.15\text{ M}$ con $600\text{ mL}$ de una solución de hidróxido de sodio ($NaOH$) $0.05\text{ M}$. Determine el pH de la disolución resultante a $25^\circ\text{C}$, asumiendo volúmenes aditivos.

* **Resolución:**
  1. Cálculo de moles de protones aportados por el ácido ($H^+$):
     $$n(H^+) = M_A \cdot V_A = 0.15\text{ M} \times 0.400\text{ L} = 0.060\text{ moles de } H^+$$
  2. Cálculo de moles de hidróxidos aportados por la base ($OH^-$):
     $$n(OH^-) = M_B \cdot V_B = 0.05\text{ M} \times 0.600\text{ L} = 0.030\text{ moles de } OH^-$$
  3. Reacción de neutralización ($H^+ + OH^- \to H_2O$):
     Como $n(H^+) > n(OH^-)$, el ácido se encuentra en exceso.
     $$n_{\text{exceso}}(H^+) = 0.060 - 0.030 = 0.030\text{ moles de } H^+$$
  4. Volumen total de la mezcla:
     $$V_{\text{total}} = 400\text{ mL} + 600\text{ mL} = 1000\text{ mL} = 1.0\text{ L}$$
  5. Concentración de protones en la solución final:
     $$[H^+]_{\text{final}} = \frac{n_{\text{exceso}}}{V_{\text{total}}} = \frac{0.030\text{ moles}}{1.0\text{ L}} = 0.030\text{ M} = 3.0 \times 10^{-2}\text{ M}$$
  6. Cálculo del pH:
     $$pH = -\log(3.0 \times 10^{-2}) = 2 - \log 3 = 2 - 0.48 = 1.52$$
* **Respuesta:** $pH = 1.52$ (solución ácida).

---

### Problema 4 (Nivel Avanzado - Solución Amortiguadora / Buffer)
Un químico prepara un tampón biológico disolviendo $0.20\text{ moles}$ de amoníaco ($NH_3$) y $0.30\text{ moles}$ de cloruro de amonio ($NH_4Cl$) en agua destilada hasta completar un volumen de $1.0\text{ L}$. Sabiendo que la constante de basicidad del amoníaco es $K_b = 1.8 \times 10^{-5}$ ($pK_b = 4.74$), determine el pH del amortiguador resultante.

* **Resolución:**
  1. Identificación de componentes del buffer básico:
     * Base débil: $NH_3 \implies [NH_3] = 0.20\text{ M}$
     * Ácido conjugado (sal): $NH_4^+ \implies [NH_4^+] = 0.30\text{ M}$
  2. Aplicamos la ecuación de Henderson-Hasselbalch para amortiguadores básicos:
     $$pOH = pK_b + \log\left(\frac{[\text{Sal}]}{[\text{Base}]}\right)$$
     $$pOH = 4.74 + \log\left(\frac{0.30}{0.20}\right) = 4.74 + \log(1.5)$$
  3. Como $\log(1.5) = \log(3/2) = \log 3 - \log 2 \approx 0.48 - 0.30 = 0.18$:
     $$pOH = 4.74 + 0.18 = 4.92$$
  4. Cálculo del pH a $25^\circ\text{C}$:
     $$pH = 14 - pOH = 14 - 4.92 = 9.08$$
* **Respuesta:** $pH = 9.08$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Titulación Ácido Débil - Base Fuerte en el Punto de Equivalencia)
Se titulan $50.0\text{ mL}$ de ácido benzoico ($C_6H_5COOH$, monoprótico débil con $K_a = 6.4 \times 10^{-5}$) $0.10\text{ M}$ con una solución de hidróxido de sodio ($NaOH$) $0.10\text{ M}$. Calcule el pH de la disolución en el punto de equivalencia exacto a $25^\circ\text{C}$.
*(Dato: $\log 2 \approx 0.30$; $\log 8 \approx 0.90$)*.

* **Resolución:**
  1. Determinación del volumen de $NaOH$ necesario para el punto de equivalencia:
     $$M_A \cdot V_A = M_B \cdot V_B \implies 0.10 \times 50.0 = 0.10 \times V_B \implies V_B = 50.0\text{ mL}$$
  2. Volumen total en el punto de equivalencia:
     $$V_{\text{total}} = 50.0\text{ mL} + 50.0\text{ mL} = 100.0\text{ mL} = 0.10\text{ L}$$
  3. Moles de sal formada (benzoato de sodio, $C_6H_5COONa$):
     $$n(\text{sal}) = M_A \cdot V_A = 0.10\text{ M} \times 0.050\text{ L} = 0.0050\text{ moles}$$
  4. Concentración molar de la sal formada:
     $$C_s = \frac{0.0050\text{ moles}}{0.10\text{ L}} = 0.050\text{ M}$$
  5. Hidrólisis del anión benzoato ($A^-$):
     $$C_6H_5COO^- + H_2O \rightleftharpoons C_6H_5COOH + OH^-$$
     La constante de hidrólisis es:
     $$K_h = K_b = \frac{K_w}{K_a} = \frac{1.0 \times 10^{-14}}{6.4 \times 10^{-5}} = 1.5625 \times 10^{-10}$$
  6. Cálculo de $[OH^-]$ liberado por hidrólisis:
     $$[OH^-] = \sqrt{K_h \cdot C_s} = \sqrt{(1.5625 \times 10^{-10})(0.050)}$$
     $$[OH^-] = \sqrt{7.8125 \times 10^{-12}} \approx 2.80 \times 10^{-6}\text{ M}$$
  7. Cálculo de pOH y pH:
     $$pOH = -\log(2.80 \times 10^{-6}) = 6 - \log(2.80) \approx 6 - 0.45 = 5.55$$
     $$pH = 14 - pOH = 14 - 5.55 = 8.45$$
  *(Nótese que en la titulación de un ácido débil con una base fuerte, el pH en el punto de equivalencia es netamente BÁSICO, $pH = 8.45 > 7$ por la hidrólisis del anión conjugado)*.
* **Respuesta:** $pH = 8.45$.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **pH:** Potencial de hidrógeno; medida cuantitativa de la acidez o basicidad de una solución acuosa definida como $-\log[H^+]$.
2. **Autoionización del Agua:** Reacción de equilibrio dinámico endotérmica en la que el agua líquida genera iones hidronio e hidróxido.
3. **Par Conjugado:** Dos especies químicas relacionadas entre sí mediante la ganancia o pérdida de un único protón ($H^+$).
4. **Ácido de Lewis:** Especie química que actúa como receptora de un par de electrones no enlazantes.
5. **Base de Lewis:** Especie química que posee un par de electrones no compartidos que puede ceder para formar un aducto coordinado.
6. **Constante de Acidez ($K_a$):** Medida termodinámica cuantitativa de la fuerza de disociación de un ácido débil en agua.
7. **Solución Amortiguadora (Buffer):** Mezcla en equilibrio de un ácido/base débil con su par conjugado que estabiliza el pH.
8. **Anfolito:** Sustancia con comportamiento anfiprótico capaz de donar o aceptar protones según el medio químico.
9. **Hidrólisis Salina:** Reacción química entre los iones constituyentes de una sal y las moléculas de agua que modifica el pH neutro.
10. **Punto de Equivalencia:** Momento estequiométrico en una valoración en el cual la cantidad de ácido neutraliza exactamente a la base.

---

## 9. FLASHCARDS
* **Front:** ¿Qué valor tiene el producto iónico del agua ($K_w$) a $25^\circ\text{C}$ y cuál es su relación con el pH y pOH?
  * **Back:** $K_w = [H^+][OH^-] = 1.0 \times 10^{-14}$. Aplicando logaritmos: $pH + pOH = 14$.
* **Front:** ¿Por qué la especie $BF_3$ es considerada un ácido según la teoría de Lewis?
  * **Back:** Porque el boro central tiene solo 6 electrones de valencia (octeto incompleto) y posee un orbital $2p$ vacío capaz de aceptar un par libre de electrones.
* **Front:** ¿Cómo se formula la ecuación de Henderson-Hasselbalch para un buffer ácido?
  * **Back:** $pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)$.
* **Front:** ¿Qué pH adquiere una solución acuosa de cloruro de amonio ($NH_4Cl$)?
  * **Back:** Posee un $pH < 7$ (ácido), debido a que el catión $NH_4^+$ proviene de una base débil ($NH_3$) y se hidroliza liberando iones $H_3O^+$.
* **Front:** ¿Cuál es el pH de una solución de $NaOH \ 0.01\text{ M}$ a $25^\circ\text{C}$?
  * **Back:** $[OH^-] = 0.01\text{ M} = 10^{-2}\text{ M} \implies pOH = 2 \implies pH = 14 - 2 = 12$.

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_12",
  "titulo": "Ácidos, Bases y Escala de pH",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál es el pH de una solución de ácido clorhídrico (HCl) 0.0001 M a 25 °C?",
      "opciones": ["1", "3", "4", "10"],
      "respuesta_correcta": 2,
      "retroalimentacion": "[H+] = 0.0001 M = 10^-4 M. pH = -log(10^-4) = 4."
    },
    {
      "id": "q2",
      "pregunta": "En la teoría de Brønsted-Lowry, la base conjugada del ión bicarbonato (HCO3)- es:",
      "opciones": ["H2CO3", "(CO3)2-", "H3O+", "OH-"],
      "respuesta_correcta": 1,
      "retroalimentacion": "La base conjugada resulta tras ceder un protón (H+): (HCO3)- - H+ -> (CO3)2- (ión carbonato)."
    },
    {
      "id": "q3",
      "pregunta": "Una solución con pH = 3 es cuántas veces más ácida en concentración de [H+] que una con pH = 5:",
      "opciones": ["2 veces", "20 veces", "100 veces", "1000 veces"],
      "respuesta_correcta": 2,
      "retroalimentacion": "pH = 3 => [H+] = 10^-3 M; pH = 5 => [H+] = 10^-5 M. Relación = 10^-3 / 10^-5 = 10^2 = 100 veces."
    }
  ]
}
```
