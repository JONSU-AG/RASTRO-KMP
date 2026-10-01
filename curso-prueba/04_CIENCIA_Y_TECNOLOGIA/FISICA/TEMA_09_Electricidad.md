# TEMA 09: ELECTRICIDAD

---

## 1. PORTADA Y FICHA TÉCNICA

```
========================================================================================
CURSO: FÍSICA PREUNIVERSITARIA
EJE: 04 - CIENCIA Y TECNOLOGÍA
TEMA: 09 - ELECTRICIDAD (ELECTROSTÁTICA Y ELECTRODINÁMICA)
NIVEL: PREUNIVERSITARIO AVANZADO (UNSA - UNMSM - UNI)
DURACIÓN ESTIMADA: 5 HORAS ACADÉMICAS
SISTEMA DE EVALUACIÓN: DESTREZAS COGNITIVAS (DECO), CIRCUITOS Y CAMPOS VECTORIALES
========================================================================================
```

---

## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[ELECTRICIDAD] --> B[Electrostática]
    A --> C[Capacitancia y Condensadores]
    A --> D[Electrodinámica]

    B --> B1[Carga Eléctrica: Cuantización Q = ±ne]
    B --> B2[Ley de Coulomb: F = k|q1 q2| / r²]
    B --> B3[Campo Eléctrico: E = F/q = k|Q|/r²]
    B --> B4[Potencial y Trabajo: V = kQ/r ; W = -qΔV]

    C --> C1[Capacidad: C = Q / V = ε₀ A / d]
    C --> C2[Asociación: Serie 1/C_eq ; Paralelo ΣC_i]
    C --> C3[Energía Almacenada: U = 1/2 CV²]

    D --> D1[Corriente e Intensidad: I = Δq / Δt]
    D --> D2[Leyes de Resistencia: Pouillet R = ρL/A y Ohm V = IR]
    D --> D3[Leyes de Kirchhoff: Mallas y Nudos]
    D --> D4[Efecto Joule y Potencia: P = VI = I²R = V²/R]
```

---

## 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Electrostática: Principios Fundamentales
- **Carga Eléctrica ($q, Q$):** Propiedad intrínseca de la materia asociada con interacciones electromagnéticas. Unidad SI: Coulomb ($\text{C}$).
  - **Cuantización de la carga:** Toda carga observable es un múltiplo entero de la carga elemental ($e = 1.602 \times 10^{-19}\text{ C}$):
    $$Q = \pm n e \quad (n \in \mathbb{Z}^+)$$
  - **Principio de Conservación de la Carga:** En un sistema eléctricamente aislado, la suma algebraica de las cargas se conserva en todo proceso físico: $\sum Q_{\text{inicial}} = \sum Q_{\text{final}}$.
  - **Formas de Electrización:** Por fricción (arrastre electrónico por afinidad), contacto (redistribución superficial) e inducción electrostática (polarización sin contacto y puesta a tierra).

### 3.2. Ley de Coulomb
La fuerza electrostática mutua entre dos cargas puntuales en reposo en el vacío es directamente proporcional al producto de sus valores absolutos e inversamente proporcional al cuadrado de la distancia que las separa:
$$\vec{F}_{12} = \frac{1}{4\pi\varepsilon_0} \frac{q_1 q_2}{r^2} \hat{r}_{12} = k_e \frac{|q_1 q_2|}{r^2} \hat{u}_r$$
- Constante electrostática en el vacío:
  $$k_e = \frac{1}{4\pi\varepsilon_0} \approx 8.98755 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2} \approx 9 \times 10^9\ \frac{\text{N}\cdot\text{m}^2}{\text{C}^2}$$
  donde $\varepsilon_0 = 8.854 \times 10^{-12}\ \text{C}^2/(\text{N}\cdot\text{m}^2)$ es la permitividad eléctrica del vacío.

### 3.3. Campo Eléctrico ($\vec{E}$) y Potencial Eléctrico ($V$)
1. **Intensidad de Campo Eléctrico ($\vec{E}$):** Modificación vectorial del espacio provocada por una distribución de carga; fuerza por unidad de carga testigo positiva:
   $$\vec{E} = \lim_{q_0 \to 0} \frac{\vec{F}}{q_0} \quad \left[\frac{\text{N}}{\text{C}} = \frac{\text{V}}{\text{m}}\right]$$
   Para una carga puntual $Q$:
   $$\vec{E} = k_e \frac{Q}{r^2} \hat{r} \quad (\text{Radial saliente si } Q > 0, \text{ radial entrante si } Q < 0)$$
   Principio de superposición: $\vec{E}_{\text{neto}} = \sum \vec{E}_i$.
2. **Potencial Eléctrico ($V$):** Magnitud escalar que mide la energía potencial electrostática por unidad de carga testigo:
   $$V = \frac{U_e}{q_0} \quad [\text{Voltio, } \text{V} = \text{J/C}]$$
   Para una carga puntual $Q$ (con referencia $V_\infty = 0$):
   $$V = k_e \frac{Q}{r}$$
   Superposición escalar: $V_{\text{total}} = \sum V_i$ (considerando signos algebraicos).
3. **Trabajo del Campo Eléctrico y Diferencia de Potencial ($\Delta V$):**
   Dado que el campo electrostático es conservativo:
   $$W_{A \to B}^{\text{campo}} = -\Delta U_e = q (V_A - V_B)$$
   $$W_{A \to B}^{\text{agente externo (sin acel.)}} = \Delta U_e = q (V_B - V_A) = q \Delta V$$
4. **Campo Uniforme entre Placas Paralelas:**
   $$E = \frac{\Delta V}{d} \iff V_A - V_B = E \cdot d$$
   (Las líneas de campo apuntan hacia donde el potencial disminuye).

---

## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Condensadores y Capacidad Eléctrica
1. **Capacidad Eléctrica ($C$):**
   $$C = \frac{Q}{V} \quad [\text{Faradio, } \text{F} = \text{C/V}]$$
2. **Condensador de Placas Planas Paralelas:**
   $$C = \kappa \frac{\varepsilon_0 A}{d}$$
   ($\kappa \ge 1$: constante dieléctrica del material interposed).
3. **Asociación de Condensadores:**
   - **En Serie (igual carga $Q$):**
     $$\frac{1}{C_{\text{eq}}} = \frac{1}{C_1} + \frac{1}{C_2} + \dots + \frac{1}{C_n}, \quad V_{\text{total}} = V_1 + V_2 + \dots$$
   - **En Paralelo (igual tensión $V$):**
     $$C_{\text{eq}} = C_1 + C_2 + \dots + C_n, \quad Q_{\text{total}} = Q_1 + Q_2 + \dots$$
4. **Energía Almacenada en un Condensador ($U$):**
   $$U = \frac{1}{2} Q V = \frac{1}{2} C V^2 = \frac{Q^2}{2C}$$

### 4.2. Electrodinámica: Corriente y Resistencia
1. **Intensidad de Corriente ($I$):**
   $$I = \frac{dq}{dt} \approx \frac{\Delta q}{\Delta t} \quad [\text{Amperio, } \text{A} = \text{C/s}]$$
   A nivel microscópico: $I = n q A v_d$ ($v_d$: velocidad de arrastre o deriva de los portadores).
2. **Ley de Pouillet (Resistencia geométrica):**
   $$R = \rho \frac{L}{A}$$
   - $\rho$: resistividad del material $[\Omega\cdot\text{m}]$. Dependencia térmica: $\rho(T) = \rho_0(1 + \alpha \Delta T)$.
   - $L$: longitud del conductor $[\text{m}]$; $A$: área transversal $[\text{m}^2]$.
3. **Ley de Ohm:**
   $$V = I \cdot R \iff I = \frac{V}{R} \quad \left(R = \text{cte para conductores óhmicos}\right)$$
4. **Asociación de Resistencias:**
   - **En Serie (igual corriente $I$):**
     $$R_{\text{eq}} = R_1 + R_2 + \dots + R_n$$
   - **En Paralelo (igual voltaje $V$):**
     $$\frac{1}{R_{\text{eq}}} = \frac{1}{R_1} + \frac{1}{R_2} + \dots + \frac{1}{R_n} \implies (\text{para dos}): R_{\text{eq}} = \frac{R_1 R_2}{R_1 + R_2}$$

### 4.3. Circuitos de Corriente Continua y Leyes de Kirchhoff
1. **Fuerza Electromotriz ($\mathcal{E}$) y Resistencia Interna ($r$):**
   Tensión en bornes de una fuente real:
   $$V_{\text{ab}} = \mathcal{E} - I r \quad (\text{en descarga/generador})$$
   $$V_{\text{ab}} = \mathcal{E} + I r \quad (\text{en carga/receptor})$$
2. **Primera Ley de Kirchhoff (Ley de Nudos - Conservación de Carga):**
   $$\sum I_{\text{entrantes}} = \sum I_{\text{salientes}} \iff \sum I_{\text{nudo}} = 0$$
3. **Segunda Ley de Kirchhoff (Ley de Mallas - Conservación de Energía):**
   $$\sum_{\text{malla cerrada}} \Delta V = 0 \iff \sum \mathcal{E} = \sum I R$$
4. **Potencia Eléctrica y Efecto Joule:**
   $$P = V \cdot I = I^2 R = \frac{V^2}{R} \quad [\text{Watt, W}]$$
   Energía disipada en forma de calor (Ley de Joule):
   $$Q = P \cdot \Delta t = I^2 R \Delta t \quad [\text{Joule}] \approx 0.24\, I^2 R \Delta t \quad [\text{calorías}]$$
5. **Instrumentos de Medida Ideales:**
   - **Amperímetro:** Se conecta estrictamente en **serie**; resistencia interna ideal $R_A \to 0$.
   - **Voltímetro:** Se conecta estrictamente en **paralelo**; resistencia interna ideal $R_V \to \infty$.

---

## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Ley de Ohm:**
   > **"VICTORIA = REINA DE INGLATERRA"** $\implies V = R \cdot I$
2. **Potencia Eléctrica:**
   > **"P-V-I"** $\implies P = V \cdot I$; y **"P = I²R"** ("Puro Indio al Cuadrado con Resistencia").
3. **Ley de Pouillet:**
   > **"RE-PO-L-A"** $\implies R = \rho \cdot \frac{L}{A}$
4. **Regla de los signos en Mallas (Kirchhoff):**
   > *"Al cruzar una resistencia a favor de la corriente: resta potencial ($-IR$). Al salir por la placa larga de la pila: suma f.e.m. ($+\mathcal{E}$)."*

---

## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Asociaciones Inversas de R y C):** Los condensadores se asocian de forma **inversa** a las resistencias:
  - Condensadores en paralelo: **se suman directamente** ($C_{\text{eq}} = C_1 + C_2$).
  - Resistencias en paralelo: **se suman las inversas** ($1/R_{\text{eq}} = 1/R_1 + 1/R_2$).
- **Trampa 2 (Estiramiento de un Conductor Metálico):** Si un alambre de resistencia $R$ se estira hasta duplicar su longitud sin perder masa, **su volumen se conserva** ($V = A \cdot L = \text{cte}$). Por lo tanto, si la longitud se duplica ($L' = 2L$), el área se reduce a la mitad ($A' = A/2$). La nueva resistencia se cuadruplica:
  $$R' = \rho \frac{2L}{A/2} = 4 \left(\rho \frac{L}{A}\right) = 4R$$
  *(Fórmula hack: $R' = n^2 R$, donde $n$ es el factor de elongación).*
- **Trampa 3 (Condensador en Corriente Continua Estable):** En régimen estacionario de corriente continua, una rama que contiene un condensador cargado actúa como un **circuito abierto** ($I = 0$ por esa rama).
- **Trampa 4 (Puente de Wheatstone):** Si en un cuadrilátero de resistencias se cumple el producto cruzado $R_1 R_4 = R_2 R_3$, el potencial entre los nodos intermedios es igual ($\Delta V = 0$) y la resistencia conectada en ese puente **puede eliminarse del circuito**.

---

## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS

### Problema 1: Fuerza Coulombiana y Carga Cuantizada (Nivel Básico)
**Enunciado:** Dos pequeñas esferas conductoras idénticas con cargas $q_1 = +8\ \mu\text{C}$ y $q_2 = -4\ \mu\text{C}$ se encuentran separadas una distancia de $30\text{ cm}$.
a) Calcule la fuerza electrostática mutua.
b) Si se ponen en contacto y luego se devuelven a su posición original, determine la nueva fuerza mutua. ($k_e = 9 \times 10^9\ \text{N}\cdot\text{m}^2/\text{C}^2$).

**Solución paso a paso:**
1. Fuerza inicial (atractiva por signos contrarios):
   $$F_1 = k_e \frac{|q_1 q_2|}{r^2} = 9 \times 10^9 \frac{(8 \times 10^{-6})(4 \times 10^{-6})}{(0.3)^2} = 9 \times 10^9 \frac{32 \times 10^{-12}}{0.09} = 10^{11} \times 32 \times 10^{-12} = 3.2\text{ N}$$
2. Puesta en contacto y redistribución de carga:
   Por conservación de carga y por ser esferas idénticas:
   $$Q_{\text{total}} = +8\ \mu\text{C} + (-4\ \mu\text{C}) = +4\ \mu\text{C}$$
   $$q'_1 = q'_2 = \frac{Q_{\text{total}}}{2} = +2\ \mu\text{C}$$
3. Nueva fuerza (repulsiva):
   $$F_2 = 9 \times 10^9 \frac{(2 \times 10^{-6})(2 \times 10^{-6})}{(0.3)^2} = 9 \times 10^9 \frac{4 \times 10^{-12}}{0.09} = 0.4\text{ N}$$

**Respuesta:** a) $3.2\text{ N}$ (atracción); b) $0.4\text{ N}$ (repulsión).

---

### Problema 2: Campo Eléctrico Nulo (Nivel Intermedio)
**Enunciado:** Dos cargas puntuales $q_1 = +16\ \mu\text{C}$ y $q_2 = +9\ \mu\text{C}$ están fijas en el eje $x$ en las posiciones $x = 0$ y $x = 70\text{ cm}$, respectivamente. Halle la coordenada $x$ del punto entre ambas cargas donde la intensidad del campo eléctrico resultante es nula.

**Solución paso a paso:**
1. Ambas cargas son positivas, por lo que en un punto intermedio $P$ a distancia $x$ de $q_1$:
   - $\vec{E}_1$ apunta hacia la derecha ($+x$).
   - $\vec{E}_2$ apunta hacia la izquierda ($-x$).
2. Para que $\vec{E}_{\text{res}} = 0 \implies E_1 = E_2$:
   $$k_e \frac{q_1}{x^2} = k_e \frac{q_2}{(d - x)^2}$$
3. Eliminamos $k_e$ y sustituimos valores ($d = 70\text{ cm}$):
   $$\frac{16}{x^2} = \frac{9}{(70 - x)^2}$$
4. Extrayendo raíz cuadrada en ambos miembros:
   $$\frac{4}{x} = \frac{3}{70 - x} \implies 4(70 - x) = 3x \implies 280 - 4x = 3x \implies 7x = 280 \implies x = 40\text{ cm}$$

**Respuesta:** El campo se anula en $x = 40\text{ cm}$.

---

### Problema 3: Circuito con Ley de Ohm y Reducción Serie-Paralelo (Nivel Intermedio-Avanzado)
**Enunciado:** En el circuito mostrado, una fuente ideal de $\mathcal{E} = 60\text{ V}$ alimenta una resistencia $R_1 = 4\ \Omega$ en serie con una combinación paralelo de dos ramas: una con $R_2 = 12\ \Omega$ y otra con $R_3 = 6\ \Omega$. Determine:
a) La corriente suministrada por la fuente.
b) La corriente que circula por la resistencia de $6\ \Omega$.
c) La potencia disipada en la resistencia de $4\ \Omega$.

**Solución paso a paso:**
1. Resistencia equivalente del paralelo ($R_2 \parallel R_3$):
   $$R_p = \frac{R_2 R_3}{R_2 + R_3} = \frac{12 \times 6}{12 + 6} = \frac{72}{18} = 4\ \Omega$$
2. Resistencia total equivalente del circuito:
   $$R_{\text{total}} = R_1 + R_p = 4 + 4 = 8\ \Omega$$
3. Corriente total suministrada por la fuente:
   $$I_{\text{total}} = \frac{\mathcal{E}}{R_{\text{total}}} = \frac{60\text{ V}}{8\ \Omega} = 7.5\text{ A}$$
4. Corriente por la resistencia de $6\ \Omega$:
   Voltaje en el bloque paralelo:
   $$V_p = I_{\text{total}} \cdot R_p = 7.5 \times 4 = 30\text{ V}$$
   Corriente por $R_3$:
   $$I_3 = \frac{V_p}{R_3} = \frac{30\text{ V}}{6\ \Omega} = 5\text{ A}$$
5. Potencia disipada en $R_1$:
   $$P_1 = I_{\text{total}}^2 \cdot R_1 = (7.5)^2 \times 4 = 56.25 \times 4 = 225\text{ W}$$

**Respuesta:** a) $I_{\text{total}} = 7.5\text{ A}$; b) $I_3 = 5\text{ A}$; c) $P_1 = 225\text{ W}$.

---

### Problema 4: Leyes de Kirchhoff en Circuito de Dos Mallas (Nivel Avanzado)
**Enunciado:** Un circuito consta de dos mallas adyacentes.
- Malla 1 (izquierda): Fuente $\mathcal{E}_1 = 24\text{ V}$, resistencia $R_1 = 2\ \Omega$ en la rama izquierda, y resistencia compartida en la rama central $R_3 = 4\ \Omega$.
- Malla 2 (derecha): Resistencia compartida $R_3 = 4\ \Omega$, resistencia en rama derecha $R_2 = 6\ \Omega$ y fuente $\mathcal{E}_2 = 12\text{ V}$ con polo positivo hacia arriba.
Determine la corriente que fluye por la resistencia central de $4\ \Omega$.

**Solución paso a paso:**
1. Definimos las corrientes de rama:
   - $I_1$: hacia abajo en la rama izquierda.
   - $I_2$: hacia abajo en la rama derecha.
   - Corriente en la rama central hacia abajo: $I_3 = I_1 + I_2$ (por nodo superior).
2. Ecuación de la Malla 1 (sentido horario):
   $$\mathcal{E}_1 - I_1 R_1 - I_3 R_3 = 0 \implies 24 - 2 I_1 - 4(I_1 + I_2) = 0$$
   $$24 - 6 I_1 - 4 I_2 = 0 \implies 3 I_1 + 2 I_2 = 12 \quad \text{--- (Ecuación 1)}$$
3. Ecuación de la Malla 2 (sentido antihorario desde nodo inferior):
   $$\mathcal{E}_2 - I_2 R_2 - I_3 R_3 = 0 \implies 12 - 6 I_2 - 4(I_1 + I_2) = 0$$
   $$12 - 4 I_1 - 10 I_2 = 0 \implies 2 I_1 + 5 I_2 = 6 \quad \text{--- (Ecuación 2)}$$
4. Resolvemos el sistema de ecuaciones:
   Multiplicamos (1) por 2 y (2) por 3:
   $$6 I_1 + 4 I_2 = 24$$
   $$6 I_1 + 15 I_2 = 18$$
   Restando miembro a miembro:
   $$-11 I_2 = 6 \implies I_2 = -\frac{6}{11}\text{ A}$$
   Sustituyendo en (1):
   $$3 I_1 + 2\left(-\frac{6}{11}\right) = 12 \implies 3 I_1 - \frac{12}{11} = 12 \implies 3 I_1 = \frac{144}{11} \implies I_1 = \frac{48}{11}\text{ A}$$
5. Corriente central $I_3$:
   $$I_3 = I_1 + I_2 = \frac{48}{11} - \frac{6}{11} = \frac{42}{11}\text{ A} \approx 3.82\text{ A}$$

**Respuesta:** La corriente por la resistencia central es $\frac{42}{11}\text{ A} \approx 3.82\text{ A}$ (hacia abajo).

---

### Problema 5: Red Mixta con Condensador en Régimen Permanente (Boss Challenge)
**Enunciado:** En el circuito mostrado en la figura, una batería ideal de $\mathcal{E} = 36\text{ V}$ se conecta a una red formada por $R_1 = 3\ \Omega$, $R_2 = 6\ \Omega$, $R_3 = 4\ \Omega$, $R_4 = 8\ \Omega$ dispuestos en puente, y entre los nodos intermedios $A$ y $B$ hay conectado un condensador de $C = 5\ \mu\text{F}$ en serie con una resistencia $R_5 = 10\ \Omega$.
a) Halle la diferencia de potencial entre los bornes del condensador en régimen permanente.
b) Calcule la carga acumulada y la energía electrostática almacenada en el condensador.

**Solución paso a paso:**
1. Análisis en régimen estacionario (continua):
   El condensador $C$ se encuentra totalmente cargado; por lo tanto, no circula corriente a través de la rama central ($I_{\text{rama central}} = 0$).
   Al no circular corriente por $R_5$, no hay caída de tensión en ella: $V_C = |V_A - V_B|$.
2. La red principal se reduce a dos ramas independientes en paralelo conectadas a la fuente de $36\text{ V}$:
   - Rama izquierda: formada por $R_1 = 3\ \Omega$ y $R_2 = 6\ \Omega$ en serie.
     $$I_{\text{izq}} = \frac{\mathcal{E}}{R_1 + R_2} = \frac{36}{3 + 6} = \frac{36}{9} = 4\text{ A}$$
     Potencial del nodo $A$ (tomando tierra en el polo negativo de la batería):
     $$V_A = \mathcal{E} - I_{\text{izq}} R_1 = 36 - (4 \times 3) = 36 - 12 = 24\text{ V}$$
   - Rama derecha: formada por $R_3 = 4\ \Omega$ y $R_4 = 8\ \Omega$ en serie.
     $$I_{\text{der}} = \frac{\mathcal{E}}{R_3 + R_4} = \frac{36}{4 + 8} = \frac{36}{12} = 3\text{ A}$$
     Potencial del nodo $B$:
     $$V_B = \mathcal{E} - I_{\text{der}} R_3 = 36 - (3 \times 4) = 36 - 12 = 24\text{ V}$$
3. Determinación de la diferencia de potencial $V_A - V_B$:
   $$V_A - V_B = 24\text{ V} - 24\text{ V} = 0\text{ V}$$
   *(Observación: Los productos cruzados dan $R_1 R_4 = 3 \times 8 = 24$ y $R_2 R_3 = 6 \times 4 = 24$. Se trata de un Puente de Wheatstone en equilibrio estricto).*
4. Si ahora cambiamos $R_4 = 2\ \Omega$ (puente desbalanceado):
   $$I_{\text{der}} = \frac{36}{4 + 2} = \frac{36}{6} = 6\text{ A} \implies V_B = 36 - (6 \times 4) = 12\text{ V}$$
   $$\Delta V_{AB} = V_A - V_B = 24\text{ V} - 12\text{ V} = 12\text{ V}$$
   - Carga del condensador:
     $$Q = C \cdot \Delta V = (5\ \mu\text{F})(12\text{ V}) = 60\ \mu\text{C}$$
   - Energía almacenada:
     $$U = \frac{1}{2} C (\Delta V)^2 = \frac{1}{2}(5 \times 10^{-6})(12)^2 = \frac{1}{2}(5 \times 10^{-6})(144) = 360\ \mu\text{J}$$

**Respuesta:** Con $R_4 = 8\ \Omega$, el puente está en equilibrio ($V_C = 0\text{ V}$, $Q = 0$); en la variante desbalanceada ($R_4 = 2\ \Omega$), $V_C = 12\text{ V}$, $Q = 60\ \mu\text{C}$ y $U = 360\ \mu\text{J}$.

---

## 8. 5 PROBLEMAS PROPUESTOS

1. Tres condensadores de capacitancias $2\ \mu\text{F}$, $3\ \mu\text{F}$ y $6\ \mu\text{F}$ se conectan en serie a una diferencia de potencial de $120\text{ V}$. Calcule la carga de cada condensador y la energía total del conjunto.
   - *Pista:* $\frac{1}{C_{\text{eq}}} = \frac{1}{2} + \frac{1}{3} + \frac{1}{6} = 1\ \mu\text{F}^{-1}$.
   - *Clave:* $Q = 120\ \mu\text{C}$ en cada uno; $U_{\text{total}} = 7.2\text{ mJ}$.

2. Un hilo conductor de cobre tiene una resistencia de $8\ \Omega$. Se estira uniformemente hasta triplicar su longitud original sin variar su volumen. Determine su nueva resistencia eléctrica.
   - *Pista:* $R' = n^2 R = 3^2 \times 8$.
   - *Clave:* $72\ \Omega$.

3. Dos cargas de $+2\ \mu\text{C}$ y $-8\ \mu\text{C}$ distan entre sí $12\text{ cm}$. Halle la distancia desde la carga menor sobre la recta que las une donde el potencial eléctrico se anula.
   - *Pista:* Hay dos soluciones: una interna ($k\frac{2}{x} = k\frac{8}{12-x}$) y una externa ($k\frac{2}{x} = k\frac{8}{12+x}$).
   - *Clave:* $x_{\text{int}} = 2.4\text{ cm}$; $x_{\text{ext}} = 4\text{ cm}$.

4. Una terma eléctrica de $2000\text{ W}$ calienta $50\text{ litros}$ de agua desde $15^\circ\text{C}$ hasta $45^\circ\text{C}$. Despreciando pérdidas al entorno, halle el tiempo requerido en minutos ($1\text{ cal} = 4.186\text{ J}$).
   - *Pista:* $P \cdot t = m c \Delta T \times 4186$.
   - *Clave:* $52.3\text{ minutos}$.

5. En un circuito cerrado se conecta una batería de $\mathcal{E} = 12\text{ V}$ y resistencia interna $r = 1\ \Omega$ a una resistencia de carga externa $R$. ¿Para qué valor de $R$ la potencia transferida a la carga es máxima, y cuánto vale dicha potencia máxima?
   - *Pista:* Teorema de máxima transferencia de potencia: $R = r$.
   - *Clave:* $R = 1\ \Omega$; $P_{\max} = 36\text{ W}$.

---

## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Coulomb:** Unidad de carga en el SI, equivalente al flujo de un amperio de corriente durante un segundo ($1\text{ C} = 1\text{ A}\cdot\text{s}$).
2. **Superficie Equipotencial:** Lugar geométrico tridimensional de puntos con igual potencial eléctrico; las líneas de campo eléctrico son ortogonales a ella en todo punto.
3. **Jaula de Faraday:** Efecto por el cual el campo eléctrico en el interior de un conductor en equilibrio electrostático es nulo ($\vec{E} = 0$), blindando su interior de campos externos.
4. **Constante Dieléctrica ($\kappa$):** Factor adimensional por el cual un material aislante reduce el campo eléctrico e incrementa la capacitancia de un condensador.
5. **Rigidez Dieléctrica:** Magnitud máxima del campo eléctrico que puede soportar un material aislante sin ionizarse y volverse conductor (para el aire: $\approx 3 \times 10^6\text{ V/m}$).
6. **Velocidad de Deriva ($v_d$):** Velocidad media microscópica de avance neto de los electrones libres a lo largo de un conductor bajo la influencia de un campo eléctrico (típicamente del orden de $10^{-4}\text{ m/s}$).
7. **Fuerza Electromotriz ($\mathcal{E}$):** Trabajo no electrostático realizado por unidad de carga por un generador para impulsar las cargas desde el borne negativo al positivo.
8. **Efecto Joule:** Fenómeno irreversible por el cual la energía cinética de los portadores de carga se transforma en calor debido a colisiones microscópicas con la red cristalina del conductor.
9. **Puente de Wheatstone:** Disposición circuital de cuatro resistencias diseñada para medir con altísima precisión el valor de una resistencia desconocida por equilibrio nulo.
10. **Resistividad ($\rho$):** Propiedad microscópica intrínseca de un material que cuantifica su oposición al flujo de portadores de carga eléctrica, medida en $\Omega\cdot\text{m}$.

---

## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Hacia dónde se mueven espontáneamente las cargas libres positivas y negativas en un campo eléctrico?**
  *R: Las cargas positivas se mueven hacia zonas de menor potencial; las cargas negativas hacia zonas de mayor potencial.*
- **P: ¿Cuál es el valor del campo eléctrico en el interior de un conductor cargado en equilibrio electrostático?**
  *R: Es idénticamente cero ($\vec{E} = 0$), y todo el exceso de carga reside en la superficie exterior.*
- **P: ¿Cómo varía la capacitancia de un condensador de placas planas al introducir un dieléctrico de constante $\kappa$?**
  *R: Aumenta $\kappa$ veces ($C = \kappa C_0$).*
- **P: ¿Qué establece la 1ra y 2da Ley de Kirchhoff?**
  *R: La 1ra Ley (nudos) es la conservación de la carga ($\sum I = 0$); la 2da Ley (mallas) es la conservación de la energía ($\sum \Delta V = 0$).*
- **P: Si un conductor de resistencia $R$ se estira hasta triplicar su longitud ($L' = 3L$), ¿cuánto vale su nueva resistencia?**
  *R: Vale $9R$ ($R' = n^2 R$).*

---

## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neurobiología y Fisiología:** Las neuronas transmiten impulsos nerviosos a través de potenciales de acción generados por gradientes electroquímicos de iones $\text{Na}^+$ y $\text{K}^+$, modelados mediante la ecuación de Nernst y circuitos equivalentes RC de membrana celular.
- **Microelectrónica:** Los transistores MOSFET, base de la computación moderna y los procesadores, modulan canales conductores mediante campos eléctricos en la puerta aislada por dióxido de silicio (óxido-semiconductor).
- **Seguridad Eléctrica Industrial:** Los interruptores diferenciales miden la Primera Ley de Kirchhoff en tiempo real: si la corriente entrante por la fase difiere de la corriente de retorno por el neutro ($\Delta I > 30\text{ mA}$), desconectan el circuito en milisegundos para evitar electrocuciones por fuga a tierra.

---

## 12. BLOQUE DE GAMIFICACIÓN KMP (JSON)

```json
{
  "curso": "Fisica",
  "tema": "Electricidad",
  "xp_recompensa": 230,
  "insignia": "Gran_Arquitecto_de_Kirchhoff_y_Coulomb",
  "desafios": [
    {
      "id": "ELEC_01",
      "tipo": "opcion_multiple",
      "pregunta": "¿Qué sucede con la energía almacenada en un condensador desconectado de la batería si se duplica la separación entre sus placas?",
      "opciones": [
        "Se duplica (U = Q² / 2C con C a la mitad)",
        "Se reduce a la mitad",
        "Permanece constante",
        "Se cuadruplica"
      ],
      "respuesta_correcta": 0,
      "explicacion": "Al estar desconectado, Q es constante. Como C = ε₀ A / d, duplicar d reduce C a la mitad. Luego U = Q² / (2C) se duplica gracias al trabajo mecánico externo realizado al separar las placas."
    },
    {
      "id": "ELEC_02",
      "tipo": "opcion_multiple",
      "pregunta": "¿Cómo deben conectarse idealmente un voltímetro y un amperímetro en un circuito para medir en una resistencia R?",
      "opciones": [
        "Voltímetro en paralelo y amperímetro en serie",
        "Ambos en paralelo",
        "Ambos en serie",
        "Voltímetro en serie y amperímetro en paralelo"
      ],
      "respuesta_correcta": 0,
      "explicacion": "El voltímetro mide diferencia de potencial en paralelo (R_v -> ∞ para no derivar corriente); el amperímetro mide corriente en serie (R_a -> 0 para no alterar la resistencia total)."
    },
    {
      "id": "ELEC_03",
      "tipo": "calculo_numerico",
      "pregunta": "Calcule la resistencia equivalente en ohmios de tres resistencias idénticas de 12 Ω conectadas en paralelo.",
      "respuesta_correcta": 4.0,
      "tolerancia": 0.05,
      "explicacion": "1/R_eq = 1/12 + 1/12 + 1/12 = 3/12 = 1/4 -> R_eq = 4 Ω."
    }
  ]
}
```
