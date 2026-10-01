# TEMA 05: CANTIDAD DE MOVIMIENTO Y GRAVITACIÓN

---

## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Cantidad de Movimiento Lineal y la Gravitación Universal representan dos de las generalizaciones más poderosas de la mecánica newtoniana:
1. **Cantidad de Movimiento Lineal ($\vec{p}$):** Magnitud física vectorial definida como el producto de la masa por la velocidad de una partícula ($\vec{p} = m\vec{v}$, unidad: $\text{kg}\cdot\text{m/s}$).
2. **Impulso Mecánico ($\vec{I}$):** Efecto dinámico continuo de una fuerza neta actuando durante un intervalo de tiempo ($\vec{I} = \int \vec{F}\,dt$). **Teorema del Impulso y la Cantidad de Movimiento:** $\vec{I} = \Delta \vec{p} = \vec{p}_f - \vec{p}_0$.
3. **Ley de Conservación de la Cantidad de Movimiento:** En todo sistema físico aislado donde la resultante de las fuerzas externas netas sea nula ($\sum \vec{F}_{\text{ext}} = \vec{0}$), la cantidad de movimiento total del sistema permanece estrictamente constante e invariante a través del tiempo:
   $$\vec{p}_{\text{total, inicial}} = \vec{p}_{\text{total, final}}$$
4. **Teoría de Colisiones (Choques):** Clasificación según el **Coeficiente de Restitución de Newton ($e$)**:
   - Choque perfectamente elástico ($e = 1$): Se conserva la cantidad de movimiento y la energía cinética total.
   - Choque inelástico ($0 < e < 1$): Se conserva la cantidad de movimiento, pero se disipa energía cinética en calor y deformación permanente.
   - Choque perfectamente inelástico o plástico ($e = 0$): Los cuerpos quedan unidos tras el impacto moviéndose con velocidad común; máxima pérdida de energía cinética.
5. **Ley de Gravitación Universal (Newton, 1687):** Dos partículas materiales en el universo se atraen con una fuerza central directamente proporcional al producto de sus masas e inversamente proporcional al cuadrado de la distancia que separa sus centros:
   $$F = G \frac{m_1 m_2}{r^2}$$
6. **Leyes de Kepler del Movimiento Planetario:**
   - *1.ª Ley (Órbitas Elípticas):* Todos los planetas se mueven en órbitas elípticas con el Sol situado en uno de los focos.
   - *2.ª Ley (Áreas Iguales):* El radio vector barrido desde el Sol hasta el planeta barre áreas iguales en intervalos de tiempo iguales (consecuencia de la conservación del momento angular: velocidad areolar constante).
   - *3.ª Ley (Ley de los Periodos):* El cuadrado del periodo orbital ($T^2$) es directamente proporcional al cubo del semieje mayor de la elipse ($a^3$): $\frac{T^2}{a^3} = \frac{4\pi^2}{G M}$.

---

## 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. CANTIDAD DE MOVIMIENTO LINEAL (MOMENTUM)

La cantidad de movimiento lineal (o momento lineal) de una partícula mide cuantitativamente la "cantidad de masa en movimiento" y la dificultad inercial para detenerla o alterar su vector velocidad:
$$\vec{p} = m \cdot \vec{v}$$
- **Naturaleza Vectorial:** $\vec{p}$ es colineal con el vector velocidad instantánea $\vec{v}$; tienen exactamente la misma dirección y sentido.
- **Unidad en el SI:** $\text{kg}\cdot\text{m/s}$ (o equivalentemente $\text{N}\cdot\text{s}$).
- **Fórmula Dimensional:** $[p] = [m][v] = MLT^{-1}$.
- Para un sistema de $n$ partículas discretas:
  $$\vec{P}_{\text{total}} = \sum_{i=1}^{n} \vec{p}_i = m_1 \vec{v}_1 + m_2 \vec{v}_2 + \dots + m_n \vec{v}_n = M_{\text{total}} \cdot \vec{v}_{CM}$$

---

### 2.2. IMPULSO MECÁNICO Y TEOREMA DEL IMPULSO

#### A. Definición de Impulso ($\vec{I}$)
Para una fuerza constante $\vec{F}$ que actúa durante un intervalo de tiempo finito $\Delta t = t_f - t_0$:
$$\vec{I} = \vec{F} \cdot \Delta t$$
Para una fuerza variable en el tiempo $\vec{F}(t)$:
$$\vec{I} = \int_{t_0}^{t_f} \vec{F}(t) \, dt$$
- **Interpretación Gráfica:** En una gráfica de Fuerza versus Tiempo ($F$ vs. $t$), **el área geométrica bajo la curva entre dos instantes representa exactamente el módulo del impulso mecánico**:
  $$\text{Área}_{F-t} = |\vec{I}|$$
- **Fuerza Media de Impacto ($\vec{F}_m$):** Fuerza constante hipotética que produce el mismo impulso que la fuerza real variable en el mismo tiempo $\Delta t$:
  $$\vec{F}_m = \frac{\vec{I}}{\Delta t}$$

#### B. Teorema del Impulso y la Cantidad de Movimiento
Partiendo de la Segunda Ley de Newton formulada originalmente por Isaac Newton:
$$\vec{F}_{\text{net}} = \frac{d\vec{p}}{dt} \implies \vec{F}_{\text{net}} \, dt = d\vec{p}$$
Integrando entre los instantes inicial y final:
$$\vec{I}_{\text{net}} = \Delta \vec{p} = \vec{p}_f - \vec{p}_0 = m \vec{v}_f - m \vec{v}_0$$
*"El impulso neto resultante aplicado a una partícula es igual a la variación vectorial de su cantidad de movimiento lineal."*

---

### 2.3. LEY DE CONSERVACIÓN DE LA CANTIDAD DE MOVIMIENTO

Consideremos un sistema aislado de partículas materiales sometidas a fuerzas internas mutuas de interacción (choques, explosiones, atracción elástica o gravitatoria) y a fuerzas externas del medio:
$$\frac{d\vec{P}_{\text{total}}}{dt} = \sum \vec{F}_{\text{ext}}$$
Si la resultante de las fuerzas externas netas que actúan sobre el sistema es cero ($\sum \vec{F}_{\text{ext}} = \vec{0}$), entonces:
$$\frac{d\vec{P}_{\text{total}}}{dt} = \vec{0} \implies \vec{P}_{\text{total}} = \text{constante vectorial}$$
$$\sum \vec{p}_{\text{antes}} = \sum \vec{p}_{\text{después}}$$
$$m_1 \vec{v}_{1i} + m_2 \vec{v}_{2i} = m_1 \vec{v}_{1f} + m_2 \vec{v}_{2f}$$

* **Aplicaciones Cardinales:**
  - **Retroceso de Armas de Fuego:** Inicialmente el arma y el proyectil están en reposo ($\vec{P}_0 = \vec{0}$). Tras el disparo:
    $$m_{\text{bala}} \vec{v}_{\text{bala}} + M_{\text{fusil}} \vec{v}_{\text{retroceso}} = \vec{0} \implies \vec{v}_{\text{retroceso}} = -\frac{m_{\text{bala}}}{M_{\text{fusil}}} \vec{v}_{\text{bala}}$$
  - **Propulsión por Reacción (Cohetes Espaciales):** Expulsión continua de gases de combustión a alta velocidad hacia atrás que propulsa al cohete hacia adelante por conservación de la cantidad de movimiento total.

---

### 2.4. COLISIONES MECÁNICAS (CHOQUES)

Una colisión es una interacción física intensa y de muy corta duración temporal ($\Delta t \to 0$) entre dos o más cuerpos, donde las fuerzas impulsivas internas mutuas superan por órdenes de magnitud a cualquier fuerza externa presente (peso, rozamiento), permitiendo aplicar estrictamente la conservación de la cantidad de movimiento durante el intervalo del choque.

#### A. Coeficiente de Restitución de Newton ($e$)
Parámetro adimensional que cuantifica el grado de elasticidad y recuperación morfológica de los cuerpos tras el impacto, definido como la razón negativa entre la velocidad relativa de alejamiento (separación) y la velocidad relativa de acercamiento (aproximación) a lo largo de la línea normal de choque:
$$e = -\frac{v_{2f} - v_{1f}}{v_{2i} - v_{1i}} = \frac{v_{2f} - v_{1f}}{v_{1i} - v_{2i}} = \frac{v_{\text{relativa de separación}}}{v_{\text{relativa de aproximación}}}$$
Donde $0 \le e \le 1$.

#### B. Clasificación Termodinámica de los Choques
| Tipo de Choque | Coeficiente $e$ | Conservación de $\vec{p}$ | Conservación de la Energía Cinética ($E_c$) | Comportamiento Mecánico |
| :--- | :---: | :---: | :---: | :--- |
| **Perfectamente Elástico** | $e = 1$ | **SÍ** | **SÍ** ($E_{ci} = E_{cf}$) | Cero disipación; deformación reversible sin generación neta de calor. Choques de bolas de billar duras o partículas subatómicas. |
| **Inelástico o Parcialmente Elástico** | $0 < e < 1$ | **SÍ** | **NO** ($E_{cf} < E_{ci}$) | Parte de la energía cinética se transforma irreversiblemente en calor, ondas sonoras y deformación plástica permanente. |
| **Completamente Inelástico (Plástico)** | $e = 0$ | **SÍ** | **NO** (Máxima pérdida de $E_c$) | Los cuerpos se acoplan o adhieren rígidamente tras el choque y continúan moviéndose juntos con la **misma velocidad común** ($\vec{v}_f$). |

- *Fórmula del Choque Plástico Unidimensional:*
  $$m_1 v_{1i} + m_2 v_{2i} = (m_1 + m_2) v_f \implies v_f = \frac{m_1 v_{1i} + m_2 v_{2i}}{m_1 + m_2}$$
- *Rebote elástico contra suelo fijo:* Si una esfera se suelta desde una altura $H$ y rebota alcanzando una altura $h$:
  $$e = \sqrt{\frac{h}{H}}$$
  Tras $n$ rebotes consecutivos: $h_n = e^{2n} H$.

---

### 2.5. LEY DE GRAVITACIÓN UNIVERSAL

Formulada por Isaac Newton tras unificar la caída de los cuerpos en la Tierra con las órbitas de la Luna y los planetas:

#### A. Enunciado Matemático
Toda partícula de masa $m_1$ atrae a otra partícula de masa $m_2$ situada a una distancia $r$ con una fuerza central dirigida a lo largo de la línea que une ambas masas:
$$\vec{F}_{12} = -G \frac{m_1 m_2}{r^2} \hat{u}_r \implies F_g = G \frac{m_1 m_2}{r^2}$$
- **Constante de Gravitación Universal ($G$):** Determinada experimentalmente por Henry Cavendish (1798) con la balanza de torsión:
  $$G = 6.674 \times 10^{-11} \text{ N}\cdot\text{m}^2/\text{kg}^2$$
  Fórmula dimensional: $[G] = M^{-1}L^3T^{-2}$.

#### B. Aceleración de la Gravedad ($g$) en un Planeta
Para un cuerpo de masa $m$ situado sobre la superficie de un planeta esférico homogéneo de masa $M$ y radio $R$:
$$F_g = P \implies G \frac{M m}{R^2} = m g_0 \implies g_0 = \frac{G M}{R^2}$$
- En la Tierra: $M_T \approx 5.97 \times 10^{24}\text{ kg}, R_T \approx 6.37 \times 10^6\text{ m} \implies g_0 \approx 9.81\text{ m/s}^2$.
- **Variación de la Gravedad con la Altitud ($h$ sobre la superficie):**
  $$g(h) = \frac{G M}{(R + h)^2} = g_0 \left( \frac{R}{R + h} \right)^2$$
- **Variación de la Gravedad con la Profundidad ($x$ bajo la superficie):**
  Por el Teorema de las Cáscaras de Newton (solo la masa encerrada en una esfera interior de radio $r = R - x$ ejerce atracción neta):
  $$g(x) = g_0 \left( 1 - \frac{x}{R} \right) \quad (\text{decae linealmente hasta anularse en el centro: } g = 0)$$

#### C. Dinámica Orbital: Velocidad Orbital y Velocidad de Escape
1. **Velocidad Orbital Circular ($v_o$):**
   La fuerza gravitatoria suministra la fuerza centrípeta requerida para la órbita circular a un radio $r = R + h$:
   $$F_g = F_c \implies G \frac{M m}{r^2} = m \frac{v_o^2}{r} \implies v_o = \sqrt{\frac{G M}{r}} = \sqrt{\frac{G M}{R + h}}$$
   Cerca de la superficie terrestre ($h \approx 0$):
   $$v_o = \sqrt{g_0 R} \approx \sqrt{(9.81\text{ m/s}^2)(6.37 \times 10^6\text{ m})} \approx 7.9\text{ km/s} \quad (\text{Primera Velocidad Cósmica})$$
2. **Velocidad de Escape ($v_{\text{esc}}$):**
   Rapidez mínima que debe comunicarse a un cuerpo para escapar por completo del pozo gravitatorio de un planeta sin propulsión ulterior (llegar al infinito con velocidad nula, $E_{\text{mec}} = 0$):
   $$E_c + E_p = 0 \implies \frac{1}{2} m v_{\text{esc}}^2 - G \frac{M m}{R} = 0 \implies v_{\text{esc}} = \sqrt{\frac{2 G M}{R}} = \sqrt{2} \cdot v_o$$
   En la Tierra:
   $$v_{\text{esc}} \approx \sqrt{2} \times 7.9\text{ km/s} \approx 11.2\text{ km/s} \quad (\text{Segunda Velocidad Cósmica})$$

---

### 2.6. LEYES DE KEPLER DEL MOVIMIENTO PLANETARIO

Deducidas empíricamente por Johannes Kepler a partir de los datos observacionales de Tycho Brahe y fundamentadas físicamente por Newton:
1. **Primera Ley (Ley de las Órbitas):**
   *"Todos los planetas se desplazan alrededor del Sol describiendo órbitas elípticas, estando el Sol situado en uno de los focos de la elipse."*
   - Punto de máxima aproximación al Sol: **Perihelio**.
   - Punto de máximo alejamiento del Sol: **Afelio**.
   - Semieje mayor $a = \frac{r_p + r_a}{2}$.
2. **Segunda Ley (Ley de las Áreas):**
   *"El radio vector que une el centro del Sol con el centro de un planeta barre áreas iguales en intervalos de tiempo iguales."*
   $$\frac{dA}{dt} = \frac{L}{2m} = \text{constante} \quad (\text{Velocidad Areolar})$$
   - Consecuencia física directa de la **conservación del momento angular** ($\vec{L} = \vec{r} \times m\vec{v} = \text{cte}$), dado que la fuerza gravitatoria es estrictamente central y no ejerce torque respecto al Sol:
     $$r_p \cdot v_p = r_a \cdot v_a$$
     Como $r_p < r_a \implies \mathbf{v_p > v_a}$. El planeta se desplaza a máxima rapidez en el perihelio y a mínima rapidez en el afelio.
3. **Tercera Ley (Ley de los Periodos o Armónica):**
   *"Para cualquier planeta del sistema solar, el cuadrado de su periodo de revolución orbital ($T$) es directamente proporcional al cubo del semieje mayor de su órbita ($a$ o radio medio $r$):"*
   $$\frac{T^2}{a^3} = K = \frac{4\pi^2}{G M_{\text{Sol}}} = \text{constante para todo el sistema}$$
   - Si se comparan dos planetas o satélites orbitando alrededor del mismo cuerpo central:
     $$\left( \frac{T_1}{T_2} \right)^2 = \left( \frac{a_1}{a_2} \right)^3$$

---

## 3. FÓRMULAS FUNDAMENTALES Y RELACIONES MATEMÁTICAS

1. **Momento Lineal e Impulso:**
   $$\vec{p} = m\vec{v}, \quad \vec{I} = \vec{F}_m \Delta t = \Delta \vec{p}$$

2. **Conservación de la Cantidad de Movimiento:**
   $$\sum \vec{p}_{\text{antes}} = \sum \vec{p}_{\text{después}}$$

3. **Coeficiente de Restitución de Choques:**
   $$e = \frac{v_{2f} - v_{1f}}{v_{1i} - v_{2i}}$$
   $$e = 1 \text{ (elástico)}, \quad e = 0 \text{ (plástico)}$$

4. **Ley de Gravitación Universal:**
   $$F = G \frac{M m}{r^2}, \quad g = \frac{G M}{r^2}$$
   $$g(h) = g_0 \left( \frac{R}{R + h} \right)^2$$

5. **Velocidades Cósmicas:**
   $$v_o = \sqrt{\frac{G M}{r}} = \sqrt{g_0 R} \approx 7.9\text{ km/s}$$
   $$v_{\text{esc}} = \sqrt{\frac{2GM}{R}} = \sqrt{2} v_o \approx 11.2\text{ km/s}$$

6. **Leyes de Kepler:**
   $$r_p \cdot v_p = r_a \cdot v_a$$
   $$\frac{T^2}{R^3} = \frac{4\pi^2}{GM}$$

---

## 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Teorema del Impulso:**
   > **"IMPULSO ES EL DELTA DE P"**
   $$\vec{I} = \Delta \vec{p}$$
   *(Empujar durante un tiempo cambia la cantidad de movimiento).*

2. **Velocidad en Perihelio vs. Afelio:**
   > **"PERIHELIO ES PRÓXIMO Y POTENTE (RÁPIDO), AFELIO ES ALEJADO Y APAGADO (LENTO)"**
   - **Peri**helio: Menor distancia, **mayor rapidez**.
   - **Afe**lio: Mayor distancia, **menor rapidez**.

3. **Velocidad de Escape vs. Orbital:**
   > **"ESCAPE ES RAÍZ DE DOS VECES LA ÓRBITA"**
   $$v_{\text{esc}} = \sqrt{2} \cdot v_{\text{orbital}}$$
   *(Un $41.4\%$ más rápida para romper la gravedad del planeta).*

4. **Tercera Ley de Kepler:**
   > **"TIEMPO AL CUADRADO, RADIO AL CUBO"**
   $$\frac{T^2}{R^3} = \text{constante}$$

---

## 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Conservación de la Cantidad de Movimiento en Choques:** La cantidad de movimiento $\vec{p}$ **SE CONSERVA EN TODOS LOS TIPOS DE CHOQUES** (elásticos, inelásticos y plásticos), siempre que el sistema esté aislado de fuerzas externas. Lo que varía y NO se conserva en choques inelásticos es la energía cinética.
* **Carácter Vectorial del Choque:** Cuidado con los signos al plantear choques unidimensionales. Si un proyectil rebota en una pared hacia atrás:
  $$\Delta p = m v_f - m v_0 = m(-v) - m(v) = -2mv \implies |\Delta p| = 2mv$$
  Muchos postulantes restan $v - v = 0$ y marcan cero incorrectamente.
* **El Peso a Altura $h = R$:** Si un cuerpo se eleva a una altura sobre la superficie igual al radio de la Tierra ($h = R_T$), la distancia al centro es $r = 2R_T$. Por ende, la gravedad y el peso **se reducen a la cuarta parte**:
  $$g = \frac{g_0}{(1 + 1)^2} = \frac{g_0}{4}$$
  *(No a la mitad).*
* **Conservación de la Energía en Choques Plásticos:** En un choque perfectamente inelástico ($e = 0$), los cuerpos quedan unidos; aquí se produce la **máxima pérdida porcentual de energía cinética** del sistema (transformada en energía térmica y acústica).
* **Los Astronautas en Órbita Flotan:** Falsa creencia: *"Flotan porque no hay gravedad en el espacio"*. A $400\text{ km}$ de altura (estación espacial), la gravedad terrestre sigue siendo cerca del $90\%$ de $g_0$. Los astronautas flotan porque están en un estado continuo de **caída libre orbital** junto con su nave.

---

## 6. PROBLEMAS RESUELTOS GRADUADOS

### Problema 1 (Nivel Básico: Teorema del Impulso y Cantidad de Movimiento)
**Enunciado:** Una pelota de béisbol de masa $m = 0.2\text{ kg}$ llega horizontalmente a la zona de bateo con una rapidez de $30\text{ m/s}$. El bateador conecta la bola aplicándole un impacto que dura $\Delta t = 0.01\text{ segundos}$, haciendo que la pelota salga disparada horizontalmente en sentido exactamente contrario con una rapidez de $50\text{ m/s}$. Determine el módulo del impulso recibido por la pelota y la fuerza media de impacto ejercida por el bate.
A) $4\text{ N}\cdot\text{s}$ y $400\text{ N}$  
B) $16\text{ N}\cdot\text{s}$ y $1600\text{ N}$  
C) $10\text{ N}\cdot\text{s}$ y $1000\text{ N}$  
D) $8\text{ N}\cdot\text{s}$ y $800\text{ N}$  
E) $12\text{ N}\cdot\text{s}$ y $1200\text{ N}$  

**Resolución:**
1. Establecemos un eje horizontal con sentido positivo hacia la derecha:
   - Velocidad inicial de la bola (hacia la izquierda): $\vec{v}_0 = -30\hat{i}\text{ m/s}$.
   - Velocidad final de la bola (hacia la derecha tras el bateo): $\vec{v}_f = +50\hat{i}\text{ m/s}$.
   - Masa: $m = 0.2\text{ kg}$.
2. Aplicamos el Teorema del Impulso y la Cantidad de Movimiento:
   $$\vec{I} = \Delta \vec{p} = m \vec{v}_f - m \vec{v}_0 = m (\vec{v}_f - \vec{v}_0)$$
   $$\vec{I} = (0.2\text{ kg}) [50\hat{i} - (-30\hat{i})] = (0.2) [50\hat{i} + 30\hat{i}] = (0.2)(80\hat{i}) = +16\hat{i}\text{ N}\cdot\text{s}$$
   El módulo del impulso es:
   $$I = 16\text{ N}\cdot\text{s}$$
3. Calculamos la fuerza media de impacto:
   $$F_m = \frac{I}{\Delta t} = \frac{16\text{ N}\cdot\text{s}}{0.01\text{ s}} = 1600\text{ N}$$
**Respuesta:** B

---

### Problema 2 (Nivel Intermedio: Choque Completamente Inelástico)
**Enunciado:** Un vagón de ferrocarril $A$ de masa $m_A = 12\text{ toneladas}$ avanza por una vía recta horizontal a una velocidad constante de $4\text{ m/s}$ y choca contra un vagón idéntico $B$ de masa $m_B = 8\text{ toneladas}$ que se encuentra inicialmente en reposo sobre la misma vía. Si tras la colisión los vagones quedan enganchados mediante un acople automático (choque plástico), determine la velocidad común con la que se desplaza el conjunto acoplado inmediatamente después del choque y la cantidad de energía cinética disipada en la colisión.
A) $2.4\text{ m/s}$ y $38.4\text{ kJ}$  
B) $2.0\text{ m/s}$ y $40.0\text{ kJ}$  
C) $2.4\text{ m/s}$ y $57.6\text{ kJ}$  
D) $3.0\text{ m/s}$ y $24.0\text{ kJ}$  
E) $1.8\text{ m/s}$ y $60.0\text{ kJ}$  

**Resolución:**
1. Aplicamos la Conservación de la Cantidad de Movimiento Lineal para el sistema acoplado:
   $$m_A v_{A0} + m_B v_{B0} = (m_A + m_B) v_f$$
   $$(12\text{ t})(4\text{ m/s}) + (8\text{ t})(0) = (12 + 8\text{ t}) v_f$$
   $$48 = 20 v_f \implies v_f = \frac{48}{20} = 2.4\text{ m/s}$$
2. Calculamos la energía cinética inicial del sistema ($m_A = 12\ 000\text{ kg}$):
   $$E_{ci} = \frac{1}{2} m_A v_{A0}^2 + 0 = \frac{1}{2}(12\ 000)(4)^2 = 6000 \times 16 = 96\ 000\text{ J} = 96\text{ kJ}$$
3. Calculamos la energía cinética final del sistema acoplado ($M = 20\ 000\text{ kg}$):
   $$E_{cf} = \frac{1}{2}(m_A + m_B) v_f^2 = \frac{1}{2}(20\ 000\text{ kg})(2.4\text{ m/s})^2 = 10\ 000 \times 5.76 = 57\ 600\text{ J} = 57.6\text{ kJ}$$
4. Calculamos la energía cinética disipada ($\Delta E_c$):
   $$\Delta E_c = E_{ci} - E_{cf} = 96\text{ kJ} - 57.6\text{ kJ} = 38.4\text{ kJ}$$
**Respuesta:** A

---

### Problema 3 (Nivel Intermedio-Avanzado: Gravitación Universal y Peso en Altura)
**Enunciado:** Un satélite meteorológico de masa $m = 800\text{ kg}$ es colocado en una órbita circular alrededor de la Tierra a una altitud igual al triple del radio terrestre ($h = 3R_T$). Si en la superficie de la Tierra el satélite registraba un peso de $8000\text{ N}$ (con $g_0 = 10\text{ m/s}^2$), determine el peso del satélite en dicha órbita y el valor de la aceleración de la gravedad a esa altitud.
A) $2000\text{ N}$ y $2.50\text{ m/s}^2$  
B) $888\text{ N}$ y $1.11\text{ m/s}^2$  
C) $500\text{ N}$ y $0.625\text{ m/s}^2$  
D) $400\text{ N}$ y $0.50\text{ m/s}^2$  
E) $250\text{ N}$ y $0.312\text{ m/s}^2$  

**Resolución:**
1. La distancia $r$ desde el centro de la Tierra hasta el satélite en órbita es:
   $$r = R_T + h = R_T + 3R_T = 4R_T$$
2. Aplicamos la ley del inverso del cuadrado de la distancia para la aceleración de la gravedad:
   $$g(h) = g_0 \left( \frac{R_T}{r} \right)^2 = g_0 \left( \frac{R_T}{4R_T} \right)^2 = g_0 \left( \frac{1}{4} \right)^2 = \frac{g_0}{16}$$
3. Calculamos la gravedad a esa altitud con $g_0 = 10\text{ m/s}^2$:
   $$g(h) = \frac{10}{16} = 0.625\text{ m/s}^2$$
4. Calculamos el peso en órbita ($P = m \cdot g(h)$):
   $$P = (800\text{ kg})(0.625\text{ m/s}^2) = 500\text{ N}$$
   *(O directamente: $P = \frac{P_0}{16} = \frac{8000\text{ N}}{16} = 500\text{ N}$).*  
**Respuesta:** C

---

### Problema 4 (Nivel Avanzado: Tercera Ley de Kepler y Periodos Orbitales)
**Enunciado:** Un satélite de comunicaciones geoestacionario describe una órbita circular alrededor de la Tierra con un periodo de revolución de $T_1 = 24\text{ horas}$ a un radio orbital de $r_1 = 42\ 000\text{ km}$ medido desde el centro del planeta. Si se desea poner en órbita un segundo satélite espía cuyo periodo de revolución sea de tan solo $T_2 = 3\text{ horas}$, ¿cuál debe ser el radio orbital $r_2$ al que debe situarse dicho satélite?
A) $10\ 500\text{ km}$  
B) $5\ 250\text{ km}$  
C) $21\ 000\text{ km}$  
D) $14\ 000\text{ km}$  
E) $8\ 400\text{ km}$  

**Resolución:**
1. Aplicamos la Tercera Ley de Kepler para dos satélites que orbitan alrededor del mismo cuerpo central (la Tierra):
   $$\left( \frac{T_2}{T_1} \right)^2 = \left( \frac{r_2}{r_1} \right)^3$$
2. Sustituimos los periodos conocidos:
   $$\frac{T_2}{T_1} = \frac{3\text{ h}}{24\text{ h}} = \frac{1}{8}$$
   $$\left( \frac{1}{8} \right)^2 = \left( \frac{r_2}{r_1} \right)^3 \implies \frac{1}{64} = \left( \frac{r_2}{r_1} \right)^3$$
3. Extraemos la raíz cúbica a ambos lados de la igualdad:
   $$\frac{r_2}{r_1} = \sqrt[3]{\frac{1}{64}} = \frac{1}{4}$$
4. Despejamos el radio orbital del satélite 2 ($r_2$):
   $$r_2 = \frac{r_1}{4} = \frac{42\ 000\text{ km}}{4} = 10\ 500\text{ km}$$
**Respuesta:** A

---

### Problema 5 (Nivel Boss Challenge: Colisión Bidimensional y Ley de Conservación)
**Enunciado:** Sobre una mesa de hockey de aire horizontal sin rozamiento, un disco $A$ de masa $m_A = 0.4\text{ kg}$ que se desplaza en el sentido del eje $+X$ con una rapidez inicial de $v_{A0} = 5\text{ m/s}$ choca contra un disco $B$ de masa $m_B = 0.6\text{ kg}$ que se encuentra inicialmente en reposo. Inmediatamente después de la colisión, se observa que el disco $A$ se desvía formando un ángulo de $53^\circ$ respecto a su dirección original con una rapidez de $v_{Af} = 2.5\text{ m/s}$. Determine la magnitud de la velocidad del disco $B$ ($v_{Bf}$) tras el impacto y el ángulo $\alpha$ que forma su trayectoria respecto a la dirección inicial del eje $+X$. ($\sin 53^\circ \approx 0.8$, $\cos 53^\circ \approx 0.6$).
A) $v_{Bf} = 3.0\text{ m/s}$; $\alpha = 30^\circ$  
B) $v_{Bf} = 2.5\text{ m/s}$; $\alpha = 37^\circ$  
C) $v_{Bf} = 2.72\text{ m/s}$; $\alpha \approx 29.7^\circ$  
D) $v_{Bf} = 2.36\text{ m/s}$; $\alpha \approx 33.7^\circ$  
E) $v_{Bf} = 3.5\text{ m/s}$; $\alpha = 45^\circ$  

**Resolución:**
1. La cantidad de movimiento se conserva vectorialmente en ambos ejes cartesianos independientes ($X$ e $Y$):
   - Inicialmente:
     $$P_{xi} = m_A v_{A0} + m_B (0) = (0.4\text{ kg})(5\text{ m/s}) = 2.0\text{ kg}\cdot\text{m/s}$$
     $$P_{yi} = 0$$
2. Descomponemos la velocidad final del disco $A$:
   $$v_{Ax} = v_{Af} \cos 53^\circ = 2.5 \times 0.6 = 1.5\text{ m/s}$$
   $$v_{Ay} = v_{Af} \sin 53^\circ = 2.5 \times 0.8 = 2.0\text{ m/s}$$
3. Aplicamos la conservación en el eje $Y$:
   $$P_{yi} = P_{yf} \implies 0 = m_A v_{Ay} + m_B v_{By}$$
   $$0 = (0.4\text{ kg})(2.0\text{ m/s}) + (0.6\text{ kg}) v_{By}$$
   $$0 = 0.8 + 0.6 v_{By} \implies v_{By} = -\frac{0.8}{0.6} = -\frac{4}{3} \approx -1.33\text{ m/s}$$
4. Aplicamos la conservación en el eje $X$:
   $$P_{xi} = P_{xf} \implies 2.0 = m_A v_{Ax} + m_B v_{Bx}$$
   $$2.0 = (0.4\text{ kg})(1.5\text{ m/s}) + (0.6\text{ kg}) v_{Bx}$$
   $$2.0 = 0.6 + 0.6 v_{Bx} \implies 1.4 = 0.6 v_{Bx} \implies v_{Bx} = \frac{1.4}{0.6} = \frac{7}{3} \approx 2.33\text{ m/s}$$
5. Calculamos el módulo de la velocidad final del disco $B$:
   $$v_{Bf} = \sqrt{v_{Bx}^2 + v_{By}^2} = \sqrt{\left(\frac{7}{3}\right)^2 + \left(-\frac{4}{3}\right)^2} = \sqrt{\frac{49 + 16}{9}} = \frac{\sqrt{65}}{3} \approx \frac{8.062}{3} \approx 2.687 \approx 2.72\text{ m/s}$$
6. Determinamos el ángulo de deflexión $\alpha$:
   $$\tan\alpha = \frac{|v_{By}|}{v_{Bx}} = \frac{4/3}{7/3} = \frac{4}{7} \approx 0.5714 \implies \alpha = \arctan(0.5714) \approx 29.7^\circ$$
- La velocidad es $\approx 2.72\text{ m/s}$ orientada a $\approx 29.7^\circ$ por debajo del eje $+X$.  
**Respuesta:** C

---

## 7. GLOSARIO TÉCNICO

1. **Cantidad de Movimiento Lineal:** Magnitud vectorial igual al producto de la masa por la velocidad de un cuerpo puntual ($\vec{p} = m\vec{v}$).
2. **Impulso Mecánico:** Integral temporal de la fuerza neta aplicada a un cuerpo que determina la variación de su momento lineal.
3. **Colisión Elástica:** Proceso de choque mecánico ideal donde se conservan rigurosamente tanto la cantidad de movimiento total como la energía cinética total.
4. **Colisión Plástica (Completamente Inelástica):** Colisión en la que los cuerpos impactantes coalescen o se unen tras el choque, disipando la máxima cantidad de energía cinética posible.
5. **Coeficiente de Restitución ($e$):** Parámetro cinemático que mide la relación entre la velocidad de alejamiento y de aproximación entre dos cuerpos colisionantes.
6. **Constante de Gravitación Universal ($G$):** Constante física fundamental que cuantifica la intensidad de la interacción gravitatoria entre masas en el universo ($6.674 \times 10^{-11}\text{ N}\cdot\text{m}^2/\text{kg}^2$).
7. **Velocidad Orbital:** Rapidez requerida para que un cuerpo o satélite mantenga una trayectoria orbital circular estable alrededor de un cuerpo masivo central.
8. **Velocidad de Escape:** Rapidez mínima requerida que debe impartirse a un proyectil para escapar del pozo gravitacional de un planeta sin asistencia de propulsión.
9. **Perihelio:** Punto de la órbita de un planeta alrededor del Sol en el cual la distancia radial entre ambos centros es mínima y la velocidad orbital es máxima.
10. **Momento Angular ($\vec{L}$):** Magnitud física vectorial definida como $\vec{r} \times \vec{p}$, cuya conservación en campos de fuerzas centrales origina la Segunda Ley de Kepler (velocidad areolar constante).

---

## 8. FLASHCARDS DE REPETICIÓN ESPACIADA

- **Q1:** ¿Qué magnitud física vectorial se conserva siempre en cualquier tipo de colisión (elástica, inelástica o plástica) en un sistema aislado?
  - **A1:** La cantidad de movimiento lineal total ($\sum \vec{p}_{\text{total}} = \text{cte}$).
- **Q2:** ¿Cuánto vale el coeficiente de restitución de Newton ($e$) en un choque completamente inelástico o plástico?
  - **A2:** Vale cero ($e = 0$).
- **Q3:** ¿Cómo se formula el Teorema del Impulso y la Cantidad de Movimiento?
  - **A3:** $\vec{I}_{\text{neto}} = \Delta \vec{p} = m \vec{v}_f - m \vec{v}_0$.
- **Q4:** ¿Qué representa geométricamente el área bajo la curva en un gráfico de Fuerza versus Tiempo ($F$ vs. $t$)?
  - **A4:** El módulo del impulso mecánico ($|\vec{I}|$).
- **Q5:** ¿Cuál es la relación matemática entre la velocidad de escape ($v_{\text{esc}}$) y la velocidad orbital ($v_o$) en la superficie terrestre?
  - **A5:** $v_{\text{esc}} = \sqrt{2} \cdot v_o$.
- **Q6:** ¿En qué punto de su órbita elíptica alrededor del Sol un planeta alcanza su máxima rapidez orbital según la Segunda Ley de Kepler?
  - **A6:** En el Perihelio (punto más cercano al Sol).
- **Q7:** ¿Qué establece la Tercera Ley de Kepler del movimiento planetario?
  - **A7:** Que el cuadrado del periodo orbital es proporcional al cubo del semieje mayor ($\frac{T^2}{a^3} = \text{cte}$).
- **Q8:** ¿Cuál es la fórmula dimensional de la constante de gravitación universal $G$?
  - **A8:** $[G] = M^{-1} L^3 T^{-2}$.
- **Q9:** Si la distancia entre dos masas se duplica, ¿en qué factor cambia la fuerza de atracción gravitatoria entre ellas?
  - **A9:** Se reduce a la cuarta parte ($F \propto 1/r^2 \implies F' = F/4$).
- **Q10:** Si un objeto rebota elásticamente ($e = 1$) en una pared con rapidez $v$, ¿cuál es el módulo de la variación de su cantidad de movimiento?
  - **A10:** $|\Delta \vec{p}| = 2mv$.

---

## 9. BLOQUE DE GAMIFICACIÓN KMP (INTERACTIVO)

```json
{
  "subject_id": "FISICA",
  "topic_id": "TEMA_05_CANTIDAD_DE_MOVIMIENTO_Y_GRAVITACION",
  "difficulty_level": "PREUNIVERSITARIO_AVANZADO",
  "questions": [
    {
      "id": "FIS_GRAV_001",
      "question": "Un hombre de 80 kg de masa se encuentra sobre una pista de hielo completamente lisa en reposo y lanza una piedra de 2 kg hacia adelante con una rapidez horizontal de 20 m/s. ¿Con qué rapidez retrocede el hombre?",
      "options": [
        "0.25 m/s",
        "0.50 m/s",
        "1.00 m/s",
        "2.00 m/s",
        "0.10 m/s"
      ],
      "correct_answer": 1,
      "explanation": "Por conservación de la cantidad de movimiento: P_inicial = P_final => 0 = m_hombre * v_hombre + m_piedra * v_piedra => 0 = (80) * v_hombre + (2)(20) => 80 * v_hombre = -40 => v_hombre = -0.50 m/s (retrocede con 0.50 m/s)."
    },
    {
      "id": "FIS_GRAV_002",
      "question": "Si el radio medio orbital del planeta Júpiter es aproximadamente 4 veces el radio orbital de la Tierra respecto al Sol, ¿cuántos años terrestres tarda Júpiter en completar una revolución orbital alrededor del Sol?",
      "options": [
        "4 años",
        "8 años",
        "16 años",
        "2 años",
        "64 años"
      ],
      "correct_answer": 1,
      "explanation": "Por la 3.ª Ley de Kepler: (T_J / T_T)^2 = (R_J / R_T)^3 => (T_J / 1)^2 = (4)^3 = 64 => T_J = √64 = 8 años terrestres."
    },
    {
      "id": "FIS_GRAV_003",
      "question": "¿Cuál es la velocidad de escape en km/s desde la superficie de un planeta hipotético cuya masa es el doble de la Tierra (M = 2 M_T) y cuyo radio es la mitad del radio terrestre (R = R_T / 2), si la velocidad de escape terrestre es de 11.2 km/s?",
      "options": [
        "11.2 km/s",
        "22.4 km/s",
        "44.8 km/s",
        "5.6 km/s",
        "15.8 km/s"
      ],
      "correct_answer": 1,
      "explanation": "v_esc = √(2GM/R). En el nuevo planeta: v' = √(2G(2M)/(R/2)) = √(4 * (2GM/R)) = 2 * v_esc = 2 * 11.2 km/s = 22.4 km/s."
    }
  ]
}
```

---

## 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Espacial y Maniobra de Asistencia Gravitatoria (Slingshot):** En misiones interplanetarias (como las sondas *Voyager*, *Cassini* o *New Horizons*), las naves espaciales utilizan sobrevuelos hiperbólicos cercanos alrededor de planetas masivos (Júpiter o Saturno) para incrementar su velocidad heliocéntrica sin consumir combustible, mediante una colisión gravitacional elástica no destructiva donde la nave "roba" una minúscula fracción de la enorme cantidad de movimiento orbital del planeta.
* **Seguridad Automotriz y Diseño de Chasis Deformables:** En los choques automovilísticos, el teorema del impulso ($\vec{F}_m \Delta t = \Delta \vec{p}$) es la base de los sistemas de seguridad pasiva (zonas de deformación programada y bolsas de aire *airbags*). Al deformarse la carrocería y amortiguar el airbag, se prolonga deliberadamente el tiempo de colisión $\Delta t$ de $0.01\text{ s}$ a más de $0.15\text{ s}$, reduciendo la fuerza media de impacto $F_m$ sobre los ocupantes a niveles biomecánicamente tolerables.

---

## 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Forense: Choque Balístico y Péndulo Balístico)
En una pericia forense balística en la DIVINCRI de Arequipa, se dispara un proyectil de plomo de masa $m = 10\text{ gramos}$ ($0.01\text{ kg}$) con velocidad horizontal desconocida $v_0$ contra un bloque de madera suspendido de masa $M = 1.99\text{ kg}$ que actúa como péndulo balístico. El proyectil penetra y se incrusta firmemente en el bloque en una colisión instantánea perfectamente inelástica. Como consecuencia del impacto conjunto, el bloque con la bala oscila elevándose verticalmente hasta alcanzar una altura máxima de $H = 20\text{ centímetros}$ ($0.2\text{ m}$) sobre su posición de equilibrio. Despreciando la resistencia del aire y considerando $g = 10\text{ m/s}^2$, determine la rapidez inicial $v_0$ con la que fue disparado el proyectil.
A) $200\text{ m/s}$  
B) $300\text{ m/s}$  
C) $400\text{ m/s}$  
D) $500\text{ m/s}$  
E) $600\text{ m/s}$  

* **Resolución:**
1. *Fase 2: Oscilación tras el impacto (Conservación de la energía mecánica):*
   Inmediatamente tras el choque, el conjunto masa total $M_{\text{total}} = m + M = 0.01 + 1.99 = 2.0\text{ kg}$ parte con velocidad horizontal común $v_f$ y asciende transformando su energía cinética en energía potencial gravitatoria:
   $$\frac{1}{2} M_{\text{total}} v_f^2 = M_{\text{total}} g H \implies v_f = \sqrt{2gH}$$
   $$v_f = \sqrt{2(10\text{ m/s}^2)(0.2\text{ m})} = \sqrt{4} = 2\text{ m/s}$$
2. *Fase 1: Colisión balística (Conservación de la cantidad de movimiento lineal):*
   Durante el impacto inelástico:
   $$m v_0 + M(0) = (m + M) v_f$$
   $$(0.01\text{ kg}) v_0 = (2.0\text{ kg})(2\text{ m/s})$$
   $$0.01 v_0 = 4 \implies v_0 = \frac{4}{0.01} = 400\text{ m/s}$$
- La rapidez del proyectil antes del impacto era de **$400\text{ m/s}$**.  
* **Respuesta:** C

---

### Pregunta 2 (Caso Astrofísico: Telescopio Espacial y Tercera Ley de Kepler)
La Agencia Espacial Europea (ESA) detecta un exoplaneta rocoso que orbita alrededor de una estrella similar al Sol en una órbita circular. Los datos astrométricos indican que el radio de la órbita de este exoplaneta es exactamente $9$ veces mayor que el radio de la órbita de otro exoplaneta interior que tarda $2\text{ meses}$ en dar una vuelta completa a la misma estrella. ¿Cuánto tiempo tarda el exoplaneta exterior en completar una revolución orbital alrededor de dicha estrella?
A) $18\text{ meses}$  
B) $36\text{ meses}$  
C) $54\text{ meses}$  
D) $72\text{ meses}$  
E) $162\text{ meses}$  

* **Resolución:**
1. Aplicamos la Tercera Ley de Kepler para dos planetas que orbitan la misma estrella central:
   $$\left( \frac{T_2}{T_1} \right)^2 = \left( \frac{R_2}{R_1} \right)^3$$
2. Datos: $T_1 = 2\text{ meses}$ y $R_2 = 9 R_1 \implies \frac{R_2}{R_1} = 9$.
3. Planteamos la relación de potencias:
   $$\left( \frac{T_2}{2} \right)^2 = (9)^3 = 729$$
   $$\frac{T_2}{2} = \sqrt{729} = 27$$
   $$T_2 = 27 \times 2 = 54\text{ meses}$$
- El exoplaneta exterior tarda **$54\text{ meses}$** (es decir, $4.5$ años).  
* **Respuesta:** C

---

## 12. AUTOEVALUACIÓN RÁPIDA

1. ¿Qué magnitud física vectorial mide la cantidad de movimiento lineal de una partícula?
   - A) $\vec{F} \Delta t$
   - B) $m\vec{v}$
   - C) $\frac{1}{2}mv^2$
   - D) $\vec{\tau} = \vec{r} \times \vec{F}$
   - E) $m\vec{a}$
2. En un choque en el que los cuerpos colisionantes quedan adheridos desplazándose juntos con la misma velocidad final, ¿cuál es el valor del coeficiente de restitución?
   - A) $e = 1$
   - B) $e = 0.5$
   - C) $e = 0$
   - D) $e = \infty$
   - E) $e = -1$
3. ¿Cómo varía la aceleración de la gravedad $g$ fuera de un planeta conforme aumenta la distancia $r$ desde su centro?
   - A) Directamente proporcional a $r$
   - B) Inversamente proporcional a $r$
   - C) Inversamente proporcional al cuadrado de la distancia ($1/r^2$)
   - D) Permanece constante
   - E) Directamente proporcional a $r^3$
4. ¿Qué ley de Kepler establece que el radio vector que une el Sol con un planeta barre áreas iguales en intervalos de tiempo iguales?
   - A) Primera Ley (Órbitas elípticas)
   - B) Segunda Ley (Ley de las áreas)
   - C) Tercera Ley (Ley armónica)
   - D) Ley de Gravitación Universal
   - E) Ley de la Inercia
5. ¿Qué velocidad se conoce como la Primera Velocidad Cósmica en la Tierra ($\approx 7.9\text{ km/s}$)?
   - A) Velocidad de escape
   - B) Velocidad del sonido
   - C) Velocidad orbital rasante a la superficie
   - D) Velocidad de rotación ecuatorial
   - E) Velocidad terminal de caída

---

### Claves de Respuestas:
1: B | 2: C | 3: C | 4: B | 5: C
