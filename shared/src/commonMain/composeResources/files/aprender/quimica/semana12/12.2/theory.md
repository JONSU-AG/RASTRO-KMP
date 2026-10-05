## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Criterio de Acidez a 25^\circ\text{C}:**
  * **Medio Ácido:** [H^+] > 10^{-7}\text{ M} \implies pH < 7 \quad (pOH > 7)
  * **Medio Neutro:** [H^+] = [OH^-] = 10^{-7}\text{ M} \implies pH = 7 \quad (pOH = 7)
  * **Medio Básico o Alcalino:** [H^+] < 10^{-7}\text{ M} \implies pH > 7 \quad (pOH < 7)

### 3.4. Cálculo del pH en Ácidos y Bases Fuertes
Los electrolitos fuertes se ionizan o disocian cuantitativamente al 100\% en agua (\alpha = 1):
* **Ácidos Fuertes Monopróticos:** HCl, HBr, HI, HNO_3, HClO_4, HClO_3.
  [H^+] = C_{\text{ácido}} \implies pH = -\log(C_{\text{ácido}})
* **Ácidos Fuertes Dipróticos:** H_2SO_4 (primera ionización completa).
  [H^+] \approx 2 \cdot C_{\text{ácido}}
* **Bases Fuertes:** Hidróxidos de metales alcalinos (LiOH, NaOH, KOH) y alcalinotérreos solubles (Ca(OH)_2, Sr(OH)_2, Ba(OH)_2).
  [OH^-] = n \cdot C_{\text{base}} \implies pOH = -\log([OH^-]) \implies pH = 14 - pOH

### 3.5. Cálculo del pH en Ácidos y Bases Débiles
Los electrolitos débiles se ionizan solo parcialmente en agua (\alpha \ll 1), estableciendo un equilibrio de disociación gobernado por su **Constante de Acidez (K_a)** o **Constante de Basicidad (K_b)**:

1. **Ácido Débil Monoprótico (HA):**
   HA_{(ac)} + H_2O \rightleftharpoons H_3O^+ + A^- \quad ; \quad K_a = \frac{[H^+][A^-]}{[HA]}
   Si la concentración inicial C_0 satisface \frac{C_0}{K_a} > 1000 (disociación menor al 5\%), la aproximación C_0 - x \approx C_0 es válida:
   K_a = \frac{x^2}{C_0} \implies x = [H^+] = \sqrt{K_a \cdot C_0}
   pH = -\log\left(\sqrt{K_a \cdot C_0}\right) = \frac{1}{2}(pK_a - \log C_0)
   * Grado de ionización: \alpha = \frac{[H^+]}{C_0} = \sqrt{\frac{K_a}{C_0}}.
2. **Base Débil (B o NH_3):**
   NH_3 + H_2O \rightleftharpoons NH_4^+ + OH^- \quad ; \quad K_b = \frac{[NH_4^+][OH^-]}{[NH_3]}
   [OH^-] = \sqrt{K_b \cdot C_0} \implies pOH = -\log\left(\sqrt{K_b \cdot C_0}\right) \implies pH = 14 - pOH
3. **Relación entre Pares Conjugados:**
   K_a \cdot K_b = K_w = 10^{-14} \iff pK_a + pK_b = 14

### 3.6. Soluciones Reguladoras, Tampón o Buffer
Sistemas acuosos capaces de resistir y amortiguar variaciones drásticas de pH ante el agregado de pequeñas cantidades de ácidos o bases fuertes.
* **Composición:**
  * Ácido débil + Sal de su base conjugada (ej. CH_3COOH + CH_3COONa).
  * Base débil + Sal de su ácido conjugado (ej. NH_3 + NH_4Cl).
* **Ecuación de Henderson - Hasselbalch:**
  pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)
  pOH = pK_b + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Base Débil}]}\right)
  * Si [\text{Sal}] = [\text{Ácido}] \implies pH = pK_a (Máxima capacidad amortiguadora).

### 3.7. Hidrólisis de Sales
Reacción de los iones de una sal disuelta con el agua:
1. **Sal de Ácido Fuerte y Base Fuerte (NaCl, KNO_3):** Ningún ión se hidroliza \implies Solución **Neutra (pH = 7)**.
2. **Sal de Ácido Fuerte y Base Débil (NH_4Cl):** El catión NH_4^+ se hidroliza cediendo H^+ \implies Solución **Ácida (pH < 7)**.
3. **Sal de Ácido Débil y Base Fuerte (CH_3COONa, NaCN):** El anión CH_3COO^- se hidroliza aceptando H^+ y liberando OH^- \implies Solución **Básica (pH > 7)**.
4. **Sal de Ácido Débil y Base Débil (NH_4CN):** Ambos se hidrolizan; el carácter del pH depende de la comparación entre K_a y K_b.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Naranja de Metilo** | Rojo / Naranja | 3.1 - 4.4 | Amarillo |
| **Azul de Bromotimol** | Amarillo | 6.0 - 7.6 | Azul |

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Hacking Logarítmico para pH sin Calculadora:**
  Si [H^+] = a \times 10^{-b}\text{ M} (con 1 \le a \le 10):
  pH = b - \log_{10}(a)
  * *Valores memorizados para admisión:*
    - \log 2 \approx 0.30
    - \log 3 \approx 0.48
    - \log 5 \approx 0.70
    - \log 7 \approx 0.85
  * *Ejemplo:* Si [H^+] = 2 \times 10^{-5}\text{ M} \implies pH = 5 - \log 2 = 5 - 0.30 = 4.70. ¡Cálculo en 3 segundos!

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Calcular pH de una solución de HCl \ 10^{-8}\text{ M} como 8.** ERROR FATAL DE ADMISIÓN. ¡Un ácido jamás puede tener un pH básico (> 7)! A concentraciones ultra diluidas (< 10^{-6}\text{ M}), se DEBE sumar la autoionización del agua: [H^+]_{\text{total}} = 10^{-8} + 10^{-7} = 1.1 \times 10^{-7}\text{ M} \implies pH = -\log(1.1 \times 10^{-7}) \approx 6.96 (ligeramente ácido).
* **Trampa 2: Olvidar el factor de disociación para bases dipróticas como Ca(OH)_2.** Si tienes Ca(OH)_2 \ 0.05\text{ M}, cada mol libera 2\text{ moles} de OH^-, por lo que [OH^-] = 2 \times 0.05 = 0.10\text{ M} = 10^{-1}\text{ M} \implies pOH = 1 \implies pH = 13.
* **Trampa 3: Creer que el agua a 60^\circ\text{C} con pH = 6.5 es ácida.** FALSO. Como K_w aumenta con la temperatura, a 60^\circ\text{C} la neutralidad ocurre cuando [H^+] = [OH^-] \implies pH = pOH = 6.5. El agua sigue siendo neutra aunque su pH sea 6.5.

---
