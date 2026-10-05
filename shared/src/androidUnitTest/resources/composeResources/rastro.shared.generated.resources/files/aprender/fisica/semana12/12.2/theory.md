## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  - \Phi = h f_0 = \frac{h c}{\lambda_0}: Función trabajo o función de extracción (energía mínima de ligadura del electrón al metal) [\text{eV} \text{ o } \text{J}].
  - f_0: Frecuencia umbral.
  - \lambda_0: Longitud de onda de corte máxima para emisión.
- **Potencial de Frenado o de Corte (V_s):**
  Diferencia de potencial eléctrico retardador necesario para detener a los fotoelectrones más energéticos:
  E_{c,\max} = e V_s \implies e V_s = h f - \Phi \implies V_s = \left(\frac{h}{e}\right) f - \frac{\Phi}{e}
  (Gráfica de V_s vs f: recta lineal de pendiente universal h/e).

### 3.3. Dualidad Onda-Partícula y Principio de Incertidumbre
1. **Hipótesis Ondulatoria de Louis de Broglie (1924):**
   Si la luz (onda clásica) posee propiedades corpusculares (fotones con momento p = E/c = h/\lambda), toda partícula material con masa m y velocidad v posee una onda asociada cuya longitud de onda es:
   \lambda = \frac{h}{p} = \frac{h}{m v}
   Confirmado experimentalmente por la difracción de electrones en cristales de níquel (experimento de Davisson-Germer, 1927).
2. **Principio de Incertidumbre de Werner Heisenberg (1927):**
   Es físicamente imposible determinar simultáneamente y con precisión arbitraria la posición (x) y la cantidad de movimiento lineal (p_x) de una partícula:
   \Delta x \cdot \Delta p_x \ge \frac{\hbar}{2}
   Relación análoga tiempo-energía:
   \Delta E \cdot \Delta t \ge \frac{\hbar}{2}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
1. **Estructura Nuclear y Defecto de Masa (\Delta m):**
   La masa de un núcleo atómico es menor que la suma de las masas de sus nucleones libres constitutivos:
   \Delta m = [Z \cdot m_p + (A - Z) \cdot m_n] - m_{\text{núcleo}}
   - **Energía de Enlace Nuclear (E_b):**
     E_b = \Delta m \cdot c^2 \quad (1\text{ u} \cdot c^2 \approx 931.5\text{ MeV})
2. **Tipos de Desintegración Radiactiva:**
   - **Alfa (\alpha):** Emisión de un núcleo de Helio (^4_2\text{He}):
     ^A_Z X \longrightarrow ^{A-4}_{Z-2} Y + ^4_2\alpha
   - **Beta Menos (\beta^-):** Emisión de un electrón y un antineutrino electrónico:
     ^1_0 n \longrightarrow ^1_1 p + ^0_{-1} e^- + \bar{\nu}_e \implies ^A_Z X \longrightarrow ^A_{Z+1} Y + ^0_{-1}\beta^- + \bar{\nu}_e
   - **Beta Más (\beta^+):** Emisión de un positrón y un neutrino electrónico:
     ^1_1 p \longrightarrow ^1_0 n + ^0_{+1} e^+ + \nu_e \implies ^A_Z X \longrightarrow ^A_{Z-1} Y + ^0_{+1}\beta^+ + \nu_e
   - **Gamma (\gamma):** Desexcitación nuclear mediante fotones de altísima energía sin cambio en A ni en Z:
     ^A_Z X^* \longrightarrow ^A_Z X + \gamma
3. **Ley de Decaimiento Radiactivo:**
   N(t) = N_0 e^{-\lambda t} = N_0 \left(\frac{1}{2}\right)^{t / t_{1/2}}
   - \lambda: Constante de desintegración radiactiva [\text{s}^{-1}].
   - **Periodo de Semidesintegración o Vida Media (t_{1/2}):**
     t_{1/2} = \frac{\ln 2}{\lambda} \approx \frac{0.693}{\lambda}
   - **Actividad (A):** Tasa de desintegración por unidad de tiempo:
     A(t) = -\frac{dN}{dt} = \lambda N(t) \quad [\text{Becquerel, Bq} = \text{desint/s}; \quad 1\text{ Curie, Ci} = 3.7 \times 10^{10}\text{ Bq}]

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Intensidad de la Luz vs. Energía de los Fotoelectrones):** Aumentar la intensidad luminosa (brillo) **NO** incrementa la energía cinética máxima de los electrones ni el potencial de frenado; solo aumenta el número de fotones por segundo y, por tanto, la **corriente fotoeléctrica de saturación**.
- **Trampa 2 (Unidades de Energía en Fotones):** Muy a menudo la función trabajo viene en \text{eV} y la constante h en \text{J}\cdot\text{s}. ¡Recuerda convertir siempre con 1\text{ eV} = 1.6 \times 10^{-19}\text{ J} o usar h \approx 4.14 \times 10^{-15}\text{ eV}\cdot\text{s}!
- **Trampa 3 (Contracción Espacial Transversal):** La contracción de Lorentz ocurre **única y exclusivamente en la dirección paralela a la velocidad**. Las dimensiones perpendiculares al movimiento relativo no se modifican.
- **Trampa 4 (Masa en Relatividad):** La masa propia m_0 es un invariante de Lorentz. Cuando una partícula se acelera a velocidades cercanas a c, su momento p = \gamma m_0 v y su energía E = \gamma m_0 c^2 tienden a infinito, requiriendo un trabajo infinito para alcanzar c; de ahí que ninguna partícula con masa propia pueda alcanzar la velocidad de la luz.

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Efecto Fotoeléctrico de Einstein:**
   > **"FOTÓN = TRABAJO + CINÉTICA"** \implies hf = \Phi + E_{c,\max}
2. **Longitud de Onda de De Broglie:**
   > **"LAMBDA = HACHE SOBRE PIVO"** \implies \lambda = \frac{h}{p} = \frac{h}{mv}
3. **Regla de Soddy-Fajans en Emisión Alfa:**
   > *"El Alfa resta 4 arriba y 2 abajo"* (A - 4, Z - 2).
4. **Regla de Decaimiento por Periodos:**
   > En cada t_{1/2}, la masa remanente se parte a la mitad: 1 \to 1/2 \to 1/4 \to 1/8 \dots \left(\frac{1}{2}\right)^n.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Energía y Transición Energética:** Los reactores nucleares de fisión comercial de cuarta generación y los proyectos de fusión experimental (ITER, National Ignition Facility con confinamiento inercial y magnético Tokamak) buscan recrear la energía de las estrellas para producir electricidad masiva limpia y libre de carbono.
- **Arqueología y Geología:** La datación radiométrica por Carbono-14 (t_{1/2} = 5730\text{ años}) y Uranio-Plomo permite determinar con precisión cronológica la edad de fósiles orgánicos, civilizaciones humanas antiguas y la edad de la Tierra (4540\text{ millones de años}).
- **Tecnología Cuántica:** Sensores cuánticos de gravedad, criptografía cuántica inmune a espionaje (QKD mediante entrelazamiento de fotones) y transistores cuánticos en computadoras superconductoras operan gracias a los principios de superposición e incertidumbre.

---

## Radiactividad: usos y límites

La radiactividad es una transformación espontánea de núcleos inestables. La emisión alfa cambia masa y número atómico; la beta transforma la composición nuclear; la gamma libera energía sin cambiar por sí sola esos números. Los balances de número másico y carga permiten identificar núcleos resultantes.

La vida media es el tiempo para que se desintegre, en promedio, la mitad de una población de núcleos. Tras dos vidas medias queda aproximadamente un cuarto. Esto describe una población, no el momento exacto en que un átomo particular se desintegrará.

Se emplean radionúclidos como trazadores, en datación de materiales apropiados y en aplicaciones médicas e industriales bajo controles especializados. Las radiaciones ionizantes pueden dañar materia viva; su uso requiere protección y supervisión. No toda radiación electromagnética es radiactividad ni toda aplicación nuclear implica emisión desde un núcleo inestable.
