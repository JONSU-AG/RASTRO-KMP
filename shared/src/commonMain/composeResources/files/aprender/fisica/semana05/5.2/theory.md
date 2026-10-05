## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

- *Fórmula del Choque Plástico Unidimensional:*
  m_1 v_{1i} + m_2 v_{2i} = (m_1 + m_2) v_f \implies v_f = \frac{m_1 v_{1i} + m_2 v_{2i}}{m_1 + m_2}
- *Rebote elástico contra suelo fijo:* Si una esfera se suelta desde una altura H y rebota alcanzando una altura h:
  e = \sqrt{\frac{h}{H}}
  Tras n rebotes consecutivos: h_n = e^{2n} H.

---

### 2.5. LEY DE GRAVITACIÓN UNIVERSAL

Formulada por Isaac Newton tras unificar la caída de los cuerpos en la Tierra con las órbitas de la Luna y los planetas:

#### A. Enunciado Matemático
Toda partícula de masa m_1 atrae a otra partícula de masa m_2 situada a una distancia r con una fuerza central dirigida a lo largo de la línea que une ambas masas:
\vec{F}_{12} = -G \frac{m_1 m_2}{r^2} \hat{u}_r \implies F_g = G \frac{m_1 m_2}{r^2}
- **Constante de Gravitación Universal (G):** Determinada experimentalmente por Henry Cavendish (1798) con la balanza de torsión:
  G = 6.674 \times 10^{-11} \text{ N}\cdot\text{m}^2/\text{kg}^2
  Fórmula dimensional: [G] = M^{-1}L^3T^{-2}.

#### B. Aceleración de la Gravedad (g) en un Planeta
Para un cuerpo de masa m situado sobre la superficie de un planeta esférico homogéneo de masa M y radio R:
F_g = P \implies G \frac{M m}{R^2} = m g_0 \implies g_0 = \frac{G M}{R^2}
- En la Tierra: M_T \approx 5.97 \times 10^{24}\text{ kg}, R_T \approx 6.37 \times 10^6\text{ m} \implies g_0 \approx 9.81\text{ m/s}^2.
- **Variación de la Gravedad con la Altitud (h sobre la superficie):**
  g(h) = \frac{G M}{(R + h)^2} = g_0 \left( \frac{R}{R + h} \right)^2
- **Variación de la Gravedad con la Profundidad (x bajo la superficie):**
  Por el Teorema de las Cáscaras de Newton (solo la masa encerrada en una esfera interior de radio r = R - x ejerce atracción neta):
  g(x) = g_0 \left( 1 - \frac{x}{R} \right) \quad (\text{decae linealmente hasta anularse en el centro: } g = 0)

#### C. Dinámica Orbital: Velocidad Orbital y Velocidad de Escape
1. **Velocidad Orbital Circular (v_o):**
   La fuerza gravitatoria suministra la fuerza centrípeta requerida para la órbita circular a un radio r = R + h:
   F_g = F_c \implies G \frac{M m}{r^2} = m \frac{v_o^2}{r} \implies v_o = \sqrt{\frac{G M}{r}} = \sqrt{\frac{G M}{R + h}}
   Cerca de la superficie terrestre (h \approx 0):
   v_o = \sqrt{g_0 R} \approx \sqrt{(9.81\text{ m/s}^2)(6.37 \times 10^6\text{ m})} \approx 7.9\text{ km/s} \quad (\text{Primera Velocidad Cósmica})
2. **Velocidad de Escape (v_{\text{esc}}):**
   Rapidez mínima que debe comunicarse a un cuerpo para escapar por completo del pozo gravitatorio de un planeta sin propulsión ulterior (llegar al infinito con velocidad nula, E_{\text{mec}} = 0):
   E_c + E_p = 0 \implies \frac{1}{2} m v_{\text{esc}}^2 - G \frac{M m}{R} = 0 \implies v_{\text{esc}} = \sqrt{\frac{2 G M}{R}} = \sqrt{2} \cdot v_o
   En la Tierra:
   v_{\text{esc}} \approx \sqrt{2} \times 7.9\text{ km/s} \approx 11.2\text{ km/s} \quad (\text{Segunda Velocidad Cósmica})

---

### 2.6. LEYES DE KEPLER DEL MOVIMIENTO PLANETARIO

Deducidas empíricamente por Johannes Kepler a partir de los datos observacionales de Tycho Brahe y fundamentadas físicamente por Newton:
1. **Primera Ley (Ley de las Órbitas):**
   *"Todos los planetas se desplazan alrededor del Sol describiendo órbitas elípticas, estando el Sol situado en uno de los focos de la elipse."*
   - Punto de máxima aproximación al Sol: **Perihelio**.
   - Punto de máximo alejamiento del Sol: **Afelio**.
   - Semieje mayor a = \frac{r_p + r_a}{2}.
2. **Segunda Ley (Ley de las Áreas):**
   *"El radio vector que une el centro del Sol con el centro de un planeta barre áreas iguales en intervalos de tiempo iguales."*
   \frac{dA}{dt} = \frac{L}{2m} = \text{constante} \quad (\text{Velocidad Areolar})
   - Consecuencia física directa de la **conservación del momento angular** (\vec{L} = \vec{r} \times m\vec{v} = \text{cte}), dado que la fuerza gravitatoria es estrictamente central y no ejerce torque respecto al Sol:
     r_p \cdot v_p = r_a \cdot v_a
     Como r_p < r_a \implies \mathbf{v_p > v_a}. El planeta se desplaza a máxima rapidez en el perihelio y a mínima rapidez en el afelio.
3. **Tercera Ley (Ley de los Periodos o Armónica):**
   *"Para cualquier planeta del sistema solar, el cuadrado de su periodo de revolución orbital (T) es directamente proporcional al cubo del semieje mayor de su órbita (a o radio medio r):"*
   \frac{T^2}{a^3} = K = \frac{4\pi^2}{G M_{\text{Sol}}} = \text{constante para todo el sistema}
   - Si se comparan dos planetas o satélites orbitando alrededor del mismo cuerpo central:
     \left( \frac{T_1}{T_2} \right)^2 = \left( \frac{a_1}{a_2} \right)^3

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   F = G \frac{M m}{r^2}, \quad g = \frac{G M}{r^2}
   g(h) = g_0 \left( \frac{R}{R + h} \right)^2

5. **Velocidades Cósmicas:**
   v_o = \sqrt{\frac{G M}{r}} = \sqrt{g_0 R} \approx 7.9\text{ km/s}
   v_{\text{esc}} = \sqrt{\frac{2GM}{R}} = \sqrt{2} v_o \approx 11.2\text{ km/s}

6. **Leyes de Kepler:**
   r_p \cdot v_p = r_a \cdot v_a
   \frac{T^2}{R^3} = \frac{4\pi^2}{GM}

---


### 5. HACKING DE EXAMEN DE ADMISIÓN Y ERRORES COMUNES

* **Conservación de la Cantidad de Movimiento en Choques:** La cantidad de movimiento \vec{p} **SE CONSERVA EN TODOS LOS TIPOS DE CHOQUES** (elásticos, inelásticos y plásticos), siempre que el sistema esté aislado de fuerzas externas. Lo que varía y NO se conserva en choques inelásticos es la energía cinética.
* **Carácter Vectorial del Choque:** Cuidado con los signos al plantear choques unidimensionales. Si un proyectil rebota en una pared hacia atrás:
  \Delta p = m v_f - m v_0 = m(-v) - m(v) = -2mv \implies |\Delta p| = 2mv
  Muchos postulantes restan v - v = 0 y marcan cero incorrectamente.
* **El Peso a Altura h = R:** Si un cuerpo se eleva a una altura sobre la superficie igual al radio de la Tierra (h = R_T), la distancia al centro es r = 2R_T. Por ende, la gravedad y el peso **se reducen a la cuarta parte**:
  g = \frac{g_0}{(1 + 1)^2} = \frac{g_0}{4}
  *(No a la mitad).*
* **Conservación de la Energía en Choques Plásticos:** En un choque perfectamente inelástico (e = 0), los cuerpos quedan unidos; aquí se produce la **máxima pérdida porcentual de energía cinética** del sistema (transformada en energía térmica y acústica).
* **Los Astronautas en Órbita Flotan:** Falsa creencia: *"Flotan porque no hay gravedad en el espacio"*. A 400\text{ km} de altura (estación espacial), la gravedad terrestre sigue siendo cerca del 90\% de g_0. Los astronautas flotan porque están en un estado continuo de **caída libre orbital** junto con su nave.

---


### 4. MNEMOTECNIAS PREUNIVERSITARIAS

1. **Teorema del Impulso:**
   > **"IMPULSO ES EL DELTA DE P"**
   \vec{I} = \Delta \vec{p}
   *(Empujar durante un tiempo cambia la cantidad de movimiento).*

2. **Velocidad en Perihelio vs. Afelio:**
   > **"PERIHELIO ES PRÓXIMO Y POTENTE (RÁPIDO), AFELIO ES ALEJADO Y APAGADO (LENTO)"**
   - **Peri**helio: Menor distancia, **mayor rapidez**.
   - **Afe**lio: Mayor distancia, **menor rapidez**.

3. **Velocidad de Escape vs. Orbital:**
   > **"ESCAPE ES RAÍZ DE DOS VECES LA ÓRBITA"**
   v_{\text{esc}} = \sqrt{2} \cdot v_{\text{orbital}}
   *(Un 41.4\% más rápida para romper la gravedad del planeta).*

4. **Tercera Ley de Kepler:**
   > **"TIEMPO AL CUADRADO, RADIO AL CUBO"**
   \frac{T^2}{R^3} = \text{constante}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 10. CONEXIÓN MULTIDISCIPLINARIA

* **Ingeniería Espacial y Maniobra de Asistencia Gravitatoria (Slingshot):** En misiones interplanetarias (como las sondas *Voyager*, *Cassini* o *New Horizons*), las naves espaciales utilizan sobrevuelos hiperbólicos cercanos alrededor de planetas masivos (Júpiter o Saturno) para incrementar su velocidad heliocéntrica sin consumir combustible, mediante una colisión gravitacional elástica no destructiva donde la nave "roba" una minúscula fracción de la enorme cantidad de movimiento orbital del planeta.
* **Seguridad Automotriz y Diseño de Chasis Deformables:** En los choques automovilísticos, el teorema del impulso (\vec{F}_m \Delta t = \Delta \vec{p}) es la base de los sistemas de seguridad pasiva (zonas de deformación programada y bolsas de aire *airbags*). Al deformarse la carrocería y amortiguar el airbag, se prolonga deliberadamente el tiempo de colisión \Delta t de 0.01\text{ s} a más de 0.15\text{ s}, reduciendo la fuerza media de impacto F_m sobre los ocupantes a niveles biomecánicamente tolerables.

---


### 11. PREGUNTAS TIPO DECO / CASO SITUACIONAL

### Pregunta 1 (Caso Forense: Choque Balístico y Péndulo Balístico)
En una pericia forense balística en la DIVINCRI de Arequipa, se dispara un proyectil de plomo de masa m = 10\text{ gramos} (0.01\text{ kg}) con velocidad horizontal desconocida v_0 contra un bloque de madera suspendido de masa M = 1.99\text{ kg} que actúa como péndulo balístico. El proyectil penetra y se incrusta firmemente en el bloque en una colisión instantánea perfectamente inelástica. Como consecuencia del impacto conjunto, el bloque con la bala oscila elevándose verticalmente hasta alcanzar una altura máxima de H = 20\text{ centímetros} (0.2\text{ m}) sobre su posición de equilibrio. Despreciando la resistencia del aire y considerando g = 10\text{ m/s}^2, determine la rapidez inicial v_0 con la que fue disparado el proyectil.
A) 200\text{ m/s}  
B) 300\text{ m/s}  
C) 400\text{ m/s}  
D) 500\text{ m/s}  
E) 600\text{ m/s}  

* **Resolución:**
1. *Fase 2: Oscilación tras el impacto (Conservación de la energía mecánica):*
   Inmediatamente tras el choque, el conjunto masa total M_{\text{total}} = m + M = 0.01 + 1.99 = 2.0\text{ kg} parte con velocidad horizontal común v_f y asciende transformando su energía cinética en energía potencial gravitatoria:
   \frac{1}{2} M_{\text{total}} v_f^2 = M_{\text{total}} g H \implies v_f = \sqrt{2gH}
   v_f = \sqrt{2(10\text{ m/s}^2)(0.2\text{ m})} = \sqrt{4} = 2\text{ m/s}
2. *Fase 1: Colisión balística (Conservación de la cantidad de movimiento lineal):*
   Durante el impacto inelástico:
   m v_0 + M(0) = (m + M) v_f
   (0.01\text{ kg}) v_0 = (2.0\text{ kg})(2\text{ m/s})
   0.01 v_0 = 4 \implies v_0 = \frac{4}{0.01} = 400\text{ m/s}
- La rapidez del proyectil antes del impacto era de **400\text{ m/s}**.  
* **Respuesta:** C

---

### Pregunta 2 (Caso Astrofísico: Telescopio Espacial y Tercera Ley de Kepler)
La Agencia Espacial Europea (ESA) detecta un exoplaneta rocoso que orbita alrededor de una estrella similar al Sol en una órbita circular. Los datos astrométricos indican que el radio de la órbita de este exoplaneta es exactamente 9 veces mayor que el radio de la órbita de otro exoplaneta interior que tarda 2\text{ meses} en dar una vuelta completa a la misma estrella. ¿Cuánto tiempo tarda el exoplaneta exterior en completar una revolución orbital alrededor de dicha estrella?
A) 18\text{ meses}  
B) 36\text{ meses}  
C) 54\text{ meses}  
D) 72\text{ meses}  
E) 162\text{ meses}  

* **Resolución:**
1. Aplicamos la Tercera Ley de Kepler para dos planetas que orbitan la misma estrella central:
   \left( \frac{T_2}{T_1} \right)^2 = \left( \frac{R_2}{R_1} \right)^3
2. Datos: T_1 = 2\text{ meses} y R_2 = 9 R_1 \implies \frac{R_2}{R_1} = 9.
3. Planteamos la relación de potencias:
   \left( \frac{T_2}{2} \right)^2 = (9)^3 = 729
   \frac{T_2}{2} = \sqrt{729} = 27
   T_2 = 27 \times 2 = 54\text{ meses}
- El exoplaneta exterior tarda **54\text{ meses}** (es decir, 4.5 años).  
* **Respuesta:** C

---

## Impulso, conservación y campo gravitatorio

El impulso de la fuerza neta es el cambio de cantidad de movimiento: J = Δp. Con fuerza constante, J = F_neta Δt; con fuerza variable corresponde al área bajo su gráfica respecto del tiempo. Se expresa en N·s, equivalente a kg·m/s. Aumentar el tiempo de detención puede reducir la fuerza media para un mismo cambio de momento.

La cantidad de movimiento total de un sistema se conserva si el impulso externo neto es nulo o despreciable durante el intervalo. Las fuerzas internas no cambian ese total, aunque transfieran momento entre cuerpos. La energía cinética se conserva adicionalmente en una colisión elástica; conservar momento no convierte toda colisión en elástica.

El campo gravitatorio es fuerza gravitatoria por unidad de masa de prueba. Para una masa puntual o esfera con simetría apropiada, g = GM/r² fuera del cuerpo y se dirige hacia él. La aceleración de caída ideal no depende de la masa del objeto, aunque su fuerza gravitatoria sí.
