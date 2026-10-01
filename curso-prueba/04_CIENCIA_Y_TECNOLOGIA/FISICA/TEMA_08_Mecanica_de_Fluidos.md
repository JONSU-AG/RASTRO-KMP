# TEMA 08: MECÁNICA DE FLUIDOS

---

## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 08 - MECÁNICA DE FLUIDOS (HIDROSTÁTICA E HIDRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 4 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), PRINCIPIOS FÍSICOS Y FLUIDODINÁMICA
========================================================================================
```

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[MECÁNICA DE FLUIDOS] --> B[Hidrostática]
    A --> C[Hidrodinámica]
    A --> D[Fenómenos de Superficie]

    B --> B1[Presión: P = F_perp / A]
    B --> B2[Principio Fundamental: ΔP = ρ g Δh]
    B --> B3[Principio de Pascal: Prensa Hidráulica F1/A1 = F2/A2]
    B --> B4[Principio de Arquímedes: E = ρ_liq g V_sum]

    C --> C1[Flujo Ideal: Incompresible, No Viscoso, Irrotacional]
    C --> C2[Caudal y Continuidad: Q = Av = cte]
    C --> C3[Ecuación de Bernoulli: P + 1/2 ρ v² + ρgh = cte]
    C --> C4[Efecto Venturi y Teorema de Torricelli v = √(2gh)]

    D --> D1[Tensión Superficial: γ = F / L]
    D --> D2[Capilaridad: Ley de Jurin]
```

---

## 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Propiedades Fundamentales de los Fluidos
- **Fluido:** Sustancia que se deforma continuamente bajo la acción de un esfuerzo cortante o tangencial, sin importar cuán pequeño sea. Comprende líquidos y gases.
- **Densidad Absoluta ($\rho$):** Magnitud escalar definida como la masa por unidad de volumen:
  $$\rho = \frac{dm}{dV} \quad \left[\frac{\text{kg}}{\text{m}^3}\right] \quad \left(\rho_{\text{agua}} = 1000\ \frac{\text{kg}}{\text{m}^3} = 1\ \frac{\text{g}}{\text{cm}^3}\right)$$
- **Peso Específico ($\gamma$):**
  $$\gamma = \frac{W}{V} = \rho g \quad \left[\frac{\text{N}}{\text{m}^3}\right]$$
- **Densidad Relativa ($\rho_{\text{rel}}$):**
  $$\rho_{\text{rel}} = \frac{\rho_{\text{sustancia}}}{\rho_{\text{agua a } 4^\circ\text{C}}}$$

### 3.2. Hidrostática: Presión y Principios Fundamentales
1. **Presión ($P$):** Componente normal de la fuerza por unidad de área:
   $$P = \lim_{\Delta A \to 0} \frac{\Delta F_\perp}{\Delta A} \quad \left[\text{Pa} = \frac{\text{N}}{\text{m}^2}\right]$$
   - Equivalencias comunes:
     $$1\text{ atm} = 1.013 \times 10^5\text{ Pa} = 760\text{ mmHg} = 10.33\text{ m H}_2\text{O} \approx 10^5\text{ Pa} = 1\text{ bar}$$
2. **Presión Hidrostática ($P_h$):** Presión ejercida por una columna de líquido en reposo a una profundidad $h$:
   $$P_h = \rho_L g h$$
   - *Isotropía:* La presión hidrostática actúa perpendicularmente a cualquier superficie sumergida y con igual intensidad en todas las direcciones a una misma profundidad.
3. **Presión Total o Absoluta ($P_{\text{abs}}$):**
   $$P_{\text{abs}} = P_{\text{atm}} + P_h = P_{\text{atm}} + \rho_L g h$$
   - **Presión Manométrica ($P_{\text{man}}$):** Presión relativa medida respecto a la presión atmosférica local: $P_{\text{man}} = P_{\text{abs}} - P_{\text{atm}}$.
4. **Vasos Comunicantes y Tubos en U:**
   Para puntos en un mismo líquido conectados continuamente a la misma línea isóbara horizontal:
   $$P_A = P_B \implies P_0 + \rho_1 g h_1 = P_0 + \rho_2 g h_2 \implies \rho_1 h_1 = \rho_2 h_2$$

### 3.3. Principio de Pascal
"Cualquier incremento de presión aplicado a un punto de un líquido incompresible y en reposo se transmite íntegramente y con la misma intensidad a todos los puntos del fluido y a las paredes del recipiente que lo contiene."
- **Prensa Hidráulica:**
  $$P_1 = P_2 \implies \frac{F_1}{A_1} = \frac{F_2}{A_2} \iff F_2 = F_1 \left(\frac{A_2}{A_1}\right) = F_1 \left(\frac{D_2}{D_1}\right)^2$$
  Conservación del trabajo (suponiendo émbolos sin rozamiento e incompresibilidad):
  $$V_1 = V_2 \implies A_1 d_1 = A_2 d_2 \implies W_1 = F_1 d_1 = F_2 d_2 = W_2$$

### 3.4. Principio de Arquímedes
"Todo cuerpo parcial o totalmente sumergido en un fluido en reposo experimenta una fuerza vertical ascendente denominada Empuje hidrostático ($E$), cuya magnitud es exactamente igual al peso del volumen de fluido desalojado por el cuerpo."
$$E = m_{\text{desalojado}} g = \rho_{\text{fluido}} g V_{\text{sumergido}}$$
- **Punto de Aplicación:** El empuje actúa en el *centro de carena* (centroide del volumen sumergido desalojado).
- **Peso Aparente ($W_{\text{ap}}$):**
  $$W_{\text{ap}} = W_{\text{real}} - E = mg - \rho_f g V_{\text{sum}}$$
- **Condiciones de Flotabilidad:**
  - Si $\rho_{\text{cuerpo}} > \rho_{\text{fluido}} \implies W > E \implies$ El cuerpo se hunde al fondo.
  - Si $\rho_{\text{cuerpo}} = \rho_{\text{fluido}} \implies W = E \implies$ Equilibrio indiferente en cualquier posición sumergida.
  - Si $\rho_{\text{cuerpo}} < \rho_{\text{fluido}} \implies$ Emerge parcialmente hasta flotar en equilibrio:
    $$W = E \implies \rho_c g V_{\text{total}} = \rho_f g V_{\text{sum}} \implies \frac{V_{\text{sum}}}{V_{\text{total}}} = \frac{\rho_c}{\rho_f}$$

---

## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Hidrodinámica de Fluidos Ideales
Un fluido ideal cumple cuatro hipótesis:
1. **Incompresible:** Densidad constante ($\rho = \text{cte}$).
2. **No viscoso:** Cero rozamiento interno disipativo entre capas de fluido.
3. **Flujo laminar / estacionario:** La velocidad en cada punto no cambia con el tiempo.
4. **Irrotacional:** Elementos de fluido no poseen momento angular neto sobre su propio centro de masa.

### 4.2. Ecuación de Continuidad
Representa la conservación de la masa a lo largo de un tubo de flujo:
$$\frac{dm}{dt} = \rho A v = \text{cte} \xrightarrow{\rho = \text{cte}} Q = A_1 v_1 = A_2 v_2 = \text{cte}$$
- $Q$: Caudal volumétrico o gasto $\left[\text{m}^3/\text{s} \text{ o } \text{L/s}\right]$.

### 4.3. Ecuación de Bernoulli
Expresión del principio de conservación de la energía mecánica por unidad de volumen a lo largo de una línea de corriente:
$$P_1 + \frac{1}{2} \rho v_1^2 + \rho g h_1 = P_2 + \frac{1}{2} \rho v_2^2 + \rho g h_2 = \text{cte}$$
- **Términos energéticos:**
  - $P$: Presión estática (energía por unidad de volumen por trabajo de flujo).
  - $\frac{1}{2}\rho v^2$: Presión dinámica (energía cinética volumétrica).
  - $\rho g h$: Presión hidrostática gravitacional (energía potencial gravitacional volumétrica).

### 4.4. Casos Especiales de Bernoulli
1. **Efecto Venturi (tubo horizontal $h_1 = h_2$):**
   $$P_1 + \frac{1}{2}\rho v_1^2 = P_2 + \frac{1}{2}\rho v_2^2$$
   Si la sección se estrecha ($A_2 < A_1 \implies v_2 > v_1$), la presión disminuye: $P_2 < P_1$.
2. **Teorema de Torricelli:**
   Velocidad de salida de un líquido por un pequeño orificio a una profundidad $h$ bajo la superficie libre abierta a la atmósfera ($A_{\text{tanque}} \gg A_{\text{orificio}}$):
   $$v = \sqrt{2gh}$$
3. **Tubo de Pitot:**
   Medición de velocidad de corriente aérea o líquida por estancamiento:
   $$v = \sqrt{\frac{2(P_{\text{estancamiento}} - P_{\text{estática}})}{\rho}} = \sqrt{\frac{2\rho_{\text{man}} g \Delta h}{\rho_{\text{fluido}}}}$$

---

## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Empuje de Arquímedes:**
   > **"E-RO-GE-VE"** $\implies E = \rho \cdot g \cdot V_{\text{sum}}$
2. **Prensa Hidráulica:**
   > **"Fuerza chica en Área chica, Fuerza grande en Área grande"** $\implies \frac{F_1}{A_1} = \frac{F_2}{A_2}$
3. **Efecto Venturi:**
   > **"Más rápido corre el fluido, menos aprieta"** ($v \uparrow \implies P \downarrow$).
4. **Flotación Porcentual:**
   > **"El porcentaje que se hunde es la densidad relativa"** $\implies \% V_{\text{sum}} = \frac{\rho_{\text{cuerpo}}}{\rho_{\text{fluido}}} \times 100\%$.

---

## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (El volumen en el empuje):** En la fórmula $E = \rho_L g V_{\text{sum}}$, la densidad es **del líquido**, pero el volumen es **del cuerpo sumergido**, ¡jamás el volumen total del líquido del recipiente!
- **Trampa 2 (Paradoja Hidrostática):** La fuerza ejercida por el fluido sobre el fondo de un recipiente depende únicamente de la presión en el fondo y del área de la base: $F = P_{\text{fondo}} \cdot A_{\text{base}} = \rho g h A_{\text{base}}$. **No depende de la forma de las paredes ni del peso total del líquido en el recipiente.**
- **Trampa 3 (Deshielo de un témpano flotante):** Cuando un bloque de hielo puro flota en agua pura y se derrite por completo, **el nivel del agua no varía**. La masa de hielo derretida ocupa exactamente el mismo volumen que desalojaba cuando flotaba.
- **Trampa 4 (Prensa con diámetros):** Recuerda que el área de un círculo es $A = \frac{\pi}{4} D^2$. Por tanto, la relación de fuerzas varía con el **cuadrado del cociente de diámetros**: $F_2 = F_1 (D_2 / D_1)^2$. Si el diámetro se triplica, la fuerza se multiplica por $9$, no por $3$.

---

## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS

### Problema 1: Prensa Hidráulica (Nivel Básico)
**Enunciado:** En una prensa hidráulica, los émbolos circulares tienen radios de $5\text{ cm}$ y $25\text{ cm}$. Si se aplica una fuerza de $80\text{ N}$ en el émbolo menor, ¿qué masa puede sostener en equilibrio el émbolo mayor? ($g = 10\text{ m/s}^2$).

**Solución paso a paso:**
1. Principio de Pascal:
   $$\frac{F_1}{A_1} = \frac{F_2}{A_2} \implies F_2 = F_1 \left(\frac{r_2}{r_1}\right)^2$$
2. Calculamos la fuerza transmitida al émbolo mayor:
   $$F_2 = 80 \times \left(\frac{25}{5}\right)^2 = 80 \times 5^2 = 80 \times 25 = 2000\text{ N}$$
3. El émbolo mayor sostiene un peso $W_2 = M g$:
   $$M g = 2000 \implies M = \frac{2000}{10} = 200\text{ kg}$$

**Respuesta:** Puede sostener una masa de $200\text{ kg}$.

---

### Problema 2: Tubo en U con Líquidos Inmiscibles (Nivel Intermedio)
**Enunciado:** Un tubo en U contiene mercurio ($\rho_{\text{Hg}} = 13.6\text{ g/cm}^3$). En una de las ramas se vierte una columna de $27.2\text{ cm}$ de agua y en la otra rama una columna de aceite ($\rho_{\text{ac}} = 0.8\text{ g/cm}^3$). Si las superficies de mercurio en ambas ramas quedan al mismo nivel horizontal, determine la altura de la columna de aceite.

**Solución paso a paso:**
1. Como la interfase mercurio-líquido en ambas ramas está a la misma altura horizontal, la línea isóbara en la superficie del mercurio establece:
   $$P_{\text{base rama 1}} = P_{\text{base rama 2}}$$
2. Descartando la presión atmosférica que actúa en ambos extremos abiertos:
   $$P_{h,\text{agua}} = P_{h,\text{aceite}}$$
   $$\rho_{\text{agua}} g h_{\text{agua}} = \rho_{\text{aceite}} g h_{\text{aceite}}$$
3. Despejando la altura de la columna de aceite:
   $$h_{\text{aceite}} = \frac{\rho_{\text{agua}}}{\rho_{\text{aceite}}} h_{\text{agua}} = \frac{1.0}{0.8} \times 27.2 = 1.25 \times 27.2 = 34\text{ cm}$$

**Respuesta:** La columna de aceite mide $34\text{ cm}$.

---

### Problema 3: Flotación con Densidad Desconocida y Peso Aparente (Nivel Intermedio-Avanzado)
**Enunciado:** Una pieza de aleación pesa $50\text{ N}$ en el aire y $32\text{ N}$ cuando se encuentra completamente sumergida en agua pura ($\rho_a = 1000\text{ kg/m}^3$). Determine el volumen de la pieza y la densidad media de la aleación. ($g = 10\text{ m/s}^2$).

**Solución paso a paso:**
1. Determinamos la fuerza de empuje mediante el peso aparente:
   $$E = W_{\text{real}} - W_{\text{ap}} = 50\text{ N} - 32\text{ N} = 18\text{ N}$$
2. Relacionamos el empuje con el volumen sumergido desalojado:
   $$E = \rho_{\text{agua}} g V_{\text{cuerpo}} \implies 18 = 1000 \times 10 \times V_{\text{cuerpo}}$$
   $$V_{\text{cuerpo}} = \frac{18}{10000} = 1.8 \times 10^{-3}\text{ m}^3 = 1.8\text{ litros} = 1800\text{ cm}^3$$
3. Calculamos la masa real de la pieza:
   $$m = \frac{W}{g} = \frac{50}{10} = 5\text{ kg}$$
4. Densidad media de la aleación:
   $$\rho = \frac{m}{V} = \frac{5\text{ kg}}{1.8 \times 10^{-3}\text{ m}^3} \approx 2777.78\text{ kg/m}^3 \approx 2.78\text{ g/cm}^3$$

**Respuesta:** Volumen $= 1.8 \times 10^{-3}\text{ m}^3$; Densidad $\approx 2778\text{ kg/m}^3$ (compatible con aleación de aluminio).

---

### Problema 4: Ecuación de Bernoulli y Continuidad (Nivel Avanzado)
**Enunciado:** Por una tubería horizontal fluye agua ($\rho = 1000\text{ kg/m}^3$). En la sección 1, de diámetro $D_1 = 10\text{ cm}$, la presión manométrica es de $1.5 \times 10^5\text{ Pa}$ y la velocidad del flujo es de $2\text{ m/s}$. La tubería se estrecha a un diámetro $D_2 = 5\text{ cm}$. Calcule:
a) La velocidad del agua en el estrechamiento.
b) La presión manométrica en el estrechamiento.

**Solución paso a paso:**
1. Aplicamos la ecuación de continuidad:
   $$A_1 v_1 = A_2 v_2 \implies \frac{\pi D_1^2}{4} v_1 = \frac{\pi D_2^2}{4} v_2 \implies v_2 = v_1 \left(\frac{D_1}{D_2}\right)^2$$
   $$v_2 = 2 \times \left(\frac{10}{5}\right)^2 = 2 \times 4 = 8\text{ m/s}$$
2. Aplicamos la ecuación de Bernoulli para tubería horizontal ($h_1 = h_2 = 0$):
   $$P_1 + \frac{1}{2} \rho v_1^2 = P_2 + \frac{1}{2} \rho v_2^2$$
3. Despejamos $P_2$:
   $$P_2 = P_1 + \frac{1}{2} \rho (v_1^2 - v_2^2)$$
   $$P_2 = 1.5 \times 10^5 + \frac{1}{2}(1000)(2^2 - 8^2) = 150000 + 500(4 - 64)$$
   $$P_2 = 150000 + 500(-60) = 150000 - 30000 = 1.2 \times 10^5\text{ Pa} = 120\text{ kPa}$$

**Respuesta:** a) $v_2 = 8\text{ m/s}$; b) $P_2 = 1.2 \times 10^5\text{ Pa}$.

---

### Problema 5: Teorema de Torricelli y Alcance Horizontal (Boss Challenge)
**Enunciado:** Un tanque cilíndrico de gran diámetro abierto a la atmósfera está lleno de agua hasta una altura $H = 5\text{ m}$ sobre el suelo. Se perfora un orificio pequeño en la pared lateral a una distancia $h$ por debajo de la superficie libre del agua.
a) Determine la expresión del alcance horizontal $x$ que logra el chorro al golpear el suelo.
b) ¿A qué profundidad $h$ debe perforarse para que el alcance $x$ sea máximo, y cuánto vale dicho alcance?

**Solución paso a paso:**
1. Velocidad de salida del chorro (Torricelli):
   Dado que $A_{\text{tanque}} \gg A_{\text{orificio}}$, la velocidad superficial es despreciable. Por Bernoulli:
   $$v = \sqrt{2gh}$$
   El chorro sale horizontalmente ($v_x = v$, $v_{0y} = 0$).
2. Movimiento parabólico de caída libre del chorro:
   Altura de caída vertical desde el orificio hasta el suelo:
   $$y = H - h$$
   Tiempo de vuelo hasta el suelo:
   $$y = \frac{1}{2} g t^2 \implies H - h = \frac{1}{2} g t^2 \implies t = \sqrt{\frac{2(H - h)}{g}}$$
3. Alcance horizontal $x$:
   $$x = v_x \cdot t = \sqrt{2gh} \cdot \sqrt{\frac{2(H - h)}{g}} = 2\sqrt{h(H - h)}$$
4. Maximización del alcance:
   Para maximizar $x(h)$, maximizamos la función cuadrática bajo la raíz:
   $$f(h) = h(H - h) = Hh - h^2$$
   Derivando e igualando a cero:
   $$f'(h) = H - 2h = 0 \implies h = \frac{H}{2}$$
   Para nuestro caso: $h = \frac{5}{2} = 2.5\text{ m}$.
5. Alcance máximo:
   $$x_{\max} = 2\sqrt{\frac{H}{2}\left(H - \frac{H}{2}\right)} = 2\sqrt{\frac{H^2}{4}} = H = 5\text{ m}$$

**Respuesta:** a) $x = 2\sqrt{h(H - h)}$; b) Se debe perforar a la mitad ($h = 2.5\text{ m}$), alcanzando $x_{\max} = 5\text{ m}$.

---

## 8. 5 PROBLEMAS PROPUESTOS

1. Un bloque de madera de densidad $\rho = 600\text{ kg/m}^3$ flota en un estanque de agua dulce. ¿Qué fracción de su volumen total permanece sobre la superficie del agua?
   - *Pista:* $\% V_{\text{emergido}} = 1 - \frac{\rho_c}{\rho_f}$.
   - *Clave:* $40\%$ (o fracción $0.4$).

2. Una aguja de coser de acero de $3\text{ cm}$ de longitud se coloca cuidadosamente en posición horizontal sobre agua a $20^\circ\text{C}$ ($\gamma = 0.073\text{ N/m}$). Calcule la masa máxima que puede tener la aguja para flotar gracias a la tensión superficial.
   - *Pista:* $F_{\text{tensión}} = 2 \gamma L = mg$ (actúa a ambos lados de la aguja).
   - *Clave:* $0.447\text{ g}$.

3. Se tiene un manómetro en U conectado a un tanque de gas. Si el líquido manométrico es mercurio ($\rho = 13600\text{ kg/m}^3$) y la rama abierta al aire presenta un desnivel de $25\text{ cm}$ por encima de la rama conectada al gas, halle la presión absoluta del gas si $P_{\text{atm}} = 101.3\text{ kPa}$ y $g = 9.8\text{ m/s}^2$.
   - *Pista:* $P_{\text{abs}} = P_{\text{atm}} + \rho g h$.
   - *Clave:* $134.62\text{ kPa}$.

4. Un densímetro cilíndrico de masa $40\text{ g}$ y área de sección transversal $0.5\text{ cm}^2$ se sumerge en un líquido desconocido, quedando una marca de $4\text{ cm}$ fuera del líquido. Si la longitud total del cilindro es de $25\text{ cm}$, halle la densidad del líquido.
   - *Pista:* $V_{\text{sum}} = A \cdot (L - h_{\text{emergida}})$; $m = \rho_f V_{\text{sum}}$.
   - *Clave:* $3.81\text{ g/cm}^3$.

5. Por un tubo horizontal Venturi fluye gasolina ($\rho = 700\text{ kg/m}^3$). La diferencia de presión entre la sección ancha ($A_1 = 100\text{ cm}^2$) y la garganta ($A_2 = 50\text{ cm}^2$) es $\Delta P = 2100\text{ Pa}$. Calcule el caudal volumétrico en litros por segundo.
   - *Pista:* Bernoulli y continuidad: $v_1 = \sqrt{\frac{2\Delta P}{\rho [(A_1/A_2)^2 - 1]}}$.
   - *Clave:* $14.14\text{ L/s}$.

---

## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Fluido Incompresible:** Aquel cuya densidad permanece constante frente a cambios en la presión (aproximación excelente para líquidos).
2. **Presión Manométrica:** Presión medida por encima o por debajo del valor de referencia atmosférico local ($P_{\text{man}} = P_{\text{abs}} - P_{\text{atm}}$).
3. **Línea Isóbara:** Línea o superficie continua en el seno de un fluido estático a lo largo de la cual la presión es idéntica en todos sus puntos.
4. **Centro de Carena:** Centro de gravedad del volumen sumergido desalojado, donde se concentra la línea de acción del empuje hidrostático.
5. **Metacentro:** Punto de intersección entre la línea vertical de flotación en reposo y la nueva línea de acción del empuje al escorar ligeramente una embarcación; determina la estabilidad hidrostática.
6. **Laminar vs. Turbulento:** Régimen de flujo ordenado en capas paralelas sin mezcla transversal (laminar, bajo número de Reynolds $Re < 2000$) frente a régimen caótico con vórtices (turbulento, $Re > 4000$).
7. **Efecto Venturi:** Disminución de la presión estática de un fluido cuando este aumenta su velocidad al fluir por una sección estrangulada.
8. **Tensión Superficial ($\gamma$):** Energía requerida para incrementar el área superficial de un líquido por unidad de área, provocada por fuerzas de cohesión intermoleculares asimétricas en la superficie.
9. **Capilaridad:** Elevación o depresión del menisco de un líquido en tubos delgados producto del balance competitivo entre fuerzas de cohesión y adhesión (Ley de Jurin).
10. **Viscosidad:** Resistencia interna de un fluido a fluir o deformarse por esfuerzos de corte tangenciales, disipando energía mecánica en calor.

---

## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿De qué depende la presión hidrostática en el fondo de un vaso?**
  *R: Exclusivamente de la densidad del fluido ($\rho$), la aceleración de la gravedad ($g$) y la profundidad vertical ($h$). Es independiente del volumen total y de la forma del vaso.*
- **P: ¿Dónde actúa la fuerza de empuje de Arquímedes?**
  *R: En el centroide geométrico del volumen sumergido (centro de carena), con dirección estrictamente vertical hacia arriba.*
- **P: ¿Qué afirma el principio de continuidad en fluidos incompresibles?**
  *R: Que el caudal volumétrico es constante ($Q = A_1 v_1 = A_2 v_2$). Si el área disminuye, la velocidad aumenta proporcionalmente.*
- **P: En la ecuación de Bernoulli, ¿qué ocurre con la presión cuando la velocidad del fluido se incrementa a la misma altura?**
  *R: La presión estática disminuye para conservar la energía mecánica total por unidad de volumen.*
- **P: ¿Cuál es el alcance horizontal máximo de un chorro que sale de un tanque de altura $H$?**
  *R: El alcance máximo es $x_{\max} = H$, y se obtiene perforando exactamente en la mitad de la columna de fluido ($h = H/2$).*

---

## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Medicina y Fisiología Cardiovascular:** La ley de Poiseuille y la ecuación de continuidad rigen el flujo sanguíneo; las estenosis arteriales causan aumento de velocidad y caída de presión (Bernoulli), favoreciendo el colapso vascular o la formación de aneurismas.
- **Aeronáutica e Ingeniería Naval:** La sustentación de perfiles alares de aviones se explica conjuntamente por la circulación vorticial, la ley de conservación del momento lineal (deflexión del flujo hacia abajo) y el gradiente de presiones de Bernoulli entre intradós y extradós.
- **Meteorología:** Los tornados y huracanes exhiben un núcleo de muy baja presión debido a las altísimas velocidades de rotación del aire periférico, lo que provoca la violenta succión ascensional.

---

## 12. BLOQUE DE GAMIFICACIÓN KMP (JSON)

```json
{
  "curso": "Fisica",
  "tema": "Mecanica_de_Fluidos",
  "xp_recompensa": 220,
  "insignia": "Arquimedes_y_Senor_de_las_Corrientes",
  "desafios": [
    {
      "id": "FLUID_01",
      "tipo": "opcion_multiple",
      "pregunta": "Un barco pasa de navegar en agua de mar (ρ = 1030 kg/m³) a navegar en agua de río (ρ = 1000 kg/m³). ¿Qué ocurre con el volumen sumergido y con el empuje?",
      "opciones": [
        "El volumen sumergido aumenta y el empuje permanece constante",
        "El volumen sumergido disminuye y el empuje disminuye",
        "Tanto el volumen sumergido como el empuje aumentan",
        "El volumen sumergido permanece constante y el empuje disminuye"
      ],
      "respuesta_correcta": 0,
      "explicacion": "Al flotar, el empuje iguala siempre al peso del barco (constante). Como E = ρ_liq * g * V_sum, al disminuir la densidad del agua de 1030 a 1000, el volumen sumergido debe aumentar."
    },
    {
      "id": "FLUID_02",
      "tipo": "opcion_multiple",
      "pregunta": "¿Por qué un pulverizador de perfume o atomizador funciona al apretar la perilla de aire?",
      "opciones": [
        "El aire a alta velocidad genera una zona de baja presión que succiona el líquido (Bernoulli)",
        "El aumento de temperatura evapora el líquido instantáneamente",
        "La presión del aire empuja directamente el líquido desde abajo",
        "Por atracción capilar electrostática"
      ],
      "respuesta_correcta": 0,
      "explicacion": "El chorro de aire a alta velocidad crea una depresión estática en la boca del tubo vertical; la mayor presión atmosférica sobre el frasco empuja el líquido hacia arriba."
    },
    {
      "id": "FLUID_03",
      "tipo": "calculo_numerico",
      "pregunta": "Calcule la velocidad de salida en m/s de agua por un orificio situado a 1.25 m por debajo de la superficie de un tanque abierto muy grande (use g = 10 m/s²).",
      "respuesta_correcta": 5.0,
      "tolerancia": 0.05,
      "explicacion": "v = √(2gh) = √(2 * 10 * 1.25) = √25 = 5.0 m/s."
    }
  ]
}
```
