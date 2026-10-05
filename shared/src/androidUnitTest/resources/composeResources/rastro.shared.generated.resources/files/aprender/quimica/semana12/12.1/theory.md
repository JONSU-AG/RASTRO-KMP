## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
• Arrhenius: H^+ en agua / OH^- en agua             • 2H_2O \rightleftharpoons H_3O^+ + OH^-
• Brønsted-Lowry: Dona H^+ / Acepta H^+              • K_w = [H^+][OH^-] = 1.0 \times 10^{-14} (a 25 °C)
  (Pares Conjugados Ácido-Base)                                  │
• Lewis: Acepta par e^- / Dona par e^-                       ▼
                                                        ESCALA DE pH Y pOH (Sørensen)
                                                        • pH = -\log[H^+]  ;  pOH = -\log[OH^-]
                                                        • pH + pOH = 14  (a 25 °C)
                                                                 │
         ┌───────────────────────────────────────────────────────┴────────────────────────┐
         ▼                                                                                ▼
ELECTROLITOS FUERTES (100\% disociación)                              ELECTROLITOS DÉBILES (Equilibrio)
• Ácidos Fuertes: HCl, HBr, HI, HNO_3, HClO_4, H_2SO_4                • Ácidos Débiles: CH_3COOH, HF, HCN (K_a)
• Bases Fuertes: Hidróxidos del Grupo IA y IIA                          • Bases Débiles: NH_3, \text{aminas} (K_b)
  [H^+] = M_{\text{ácido}} \cdot \theta                                 [H^+] = \sqrt{K_a \cdot C_0}
  [OH^-] = M_{\text{base}} \cdot \theta                                 [OH^-] = \sqrt{K_b \cdot C_0}
                                                                                          │
         ┌────────────────────────────────────────────────────────────────────────────────┘
         ▼
SISTEMAS BUFFER / AMORTIGUADORES Y TITULACIÓN
• Ecuación de Henderson-Hasselbalch:  pH = pK_a + \log\left(\frac{[\text{Sal Conjugada}]}{[\text{Ácido Débil}]}\right)
• Hidrólisis Salina: Sal ácida, básica o neutra
• Curvas de Titulación y Punto de Equivalencia
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Teorías Modernas Ácido-Base

#### A. Teoría Clásica de Svante Arrhenius (1884)
* **Ácido:** Sustancia hidrogenada neutra que, al disolverse exclusivamente en agua, se disocia produciendo iones hidrógeno o protones (H^+ o H_3O^+):
  HA_{(ac)} \xrightarrow{H_2O} H^+_{(ac)} + A^-_{(ac)}
* **Base:** Sustancia que, al disolverse en agua, se disocia liberando iones hidróxido u oxhidrilo (OH^-):
  B(OH)_{n(ac)} \xrightarrow{H_2O} B^{n+}_{(ac)} + n OH^-_{(ac)}
* *Limitaciones de Arrhenius:* Solo es aplicable a disoluciones acuosas; no explica el carácter fuertemente básico de sustancias como el gas amoníaco (NH_3), que carecen del grupo OH en su fórmula molecular.

#### B. Teoría Protónica de Johannes Brønsted y Thomas Lowry (1923)
* **Ácido:** Toda especie química (molecular o iónica) capaz de **donar o ceder uno o más protones (H^+)** a otra especie.
* **Base:** Toda especie química capaz de **aceptar o recibir uno o más protones (H^+)**.
* **Pares Conjugados Ácido-Base:** Pareja de especies químicas que difieren exactamente en un único protón (H^+):
  \text{Ácido}_1 + \text{Base}_2 \rightleftharpoons \text{Base Conjugada}_1 + \text{Ácido Conjugado}_2
  * *Ejemplo:*
    CH_3COOH + H_2O \rightleftharpoons CH_3COO^- + H_3O^+
    - Par 1: CH_3COOH (ácido) / CH_3COO^- (base conjugada).
    - Par 2: H_2O (base) / H_3O^+ (ácido conjugado).
* **Sustancia Anfótera o Anfolito:** Sustancia que puede actuar como ácido o como base según el reactivo con el que interactúe (el agua H_2O, el ión bicarbonato HCO_3^-, el ión bisulfato HSO_4^-).
  * Regla de Fuerza: "A un ácido más fuerte le corresponde una base conjugada más débil, y viceversa".

#### C. Teoría Electrónica de Gilbert N. Lewis (1923)
* **Ácido de Lewis:** Especie química que posee un orbital atómico vacío y es capaz de **aceptar un par de electrones** formando un enlace covalente coordinado (electrófilo) (ej. cationes metálicos: H^+, Fe^{3+}, Cu^{2+}; compuestos con octeto incompleto: BF_3, AlCl_3, SO_3).
* **Base de Lewis:** Especie química que posee al menos un **par de electrones solitario libre** que puede **donar** para formar un enlace covalente dativo (nucleófilo) (ej. NH_3, H_2O, OH^-, CN^-, Cl^-).
* *Reacción General de Lewis:*
  BF_3 + :NH_3 \to F_3B \leftarrow NH_3 \quad (\text{Aducto o complejo de coordinación})

### 3.2. Autoionización del Agua y Producto Iónico (K_w)
El agua líquida pura es un electrolito extraordinariamente débil que experimenta auto-protólisis en un equilibrio muy desplazado a la izquierda:
H_2O_{(l)} + H_2O_{(l)} \rightleftharpoons H_3O^+_{(ac)} + OH^-_{(ac)}
La constante termodinámica de autoionización del agua a 25^\circ\text{C} (298\text{ K}) es:
K_w = [H^+][OH^-] = 1.0 \times 10^{-14}
* En agua neutra pura a 25^\circ\text{C}:
  [H^+] = [OH^-] = \sqrt{10^{-14}} = 1.0 \times 10^{-7}\text{ M}
* **Influencia de la Temperatura en K_w:** La autoionización del agua es un proceso endotérmico (\Delta H > 0). Si T > 25^\circ\text{C}, K_w > 10^{-14} (a 60^\circ\text{C}, K_w \approx 10^{-13}, por lo que el agua neutra tiene pH \approx 6.5).

### 3.3. Escala Logarítmica de pH y pOH (Søren Peter Lauritz Sørensen, 1909)
Para evitar el uso de exponentes negativos microscópicos se define el operador matemático potencial "p" (pX = -\log_{10} X):
pH = -\log_{10}[H^+] = -\log_{10}[H_3O^+] \iff [H^+] = 10^{-pH}
pOH = -\log_{10}[OH^-] \iff [OH^-] = 10^{-pOH}
Aplicando -\log a la expresión de K_w:
-\log(K_w) = -\log([H^+][OH^-]) = -\log[H^+] + (-\log[OH^-])
pK_w = pH + pOH
* A la temperatura estándar de 25^\circ\text{C}:
  pH + pOH = 14


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. INDICADORES ÁCIDO-BASE Y RANGO DE VIRAJE
| Indicador | Color Ácido | Rango de pH de Viraje | Color Básico |
| :--- | :---: | :---: | :---: |
| **Fenolftaleína** | Incoloro | 8.2 - 10.0 | Rojo grosella / Fucsia |
| **Tornasol** | Rojo | 5.0 - 8.0 | Azul |
