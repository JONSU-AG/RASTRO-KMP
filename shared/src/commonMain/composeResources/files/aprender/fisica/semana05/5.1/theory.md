## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. RESUMEN EJECUTIVO (VISIÓN PANORÁMICA)

La Cantidad de Movimiento Lineal y la Gravitación Universal representan dos de las generalizaciones más poderosas de la mecánica newtoniana:
1. **Cantidad de Movimiento Lineal (\vec{p}):** Magnitud física vectorial definida como el producto de la masa por la velocidad de una partícula (\vec{p} = m\vec{v}, unidad: \text{kg}\cdot\text{m/s}).
2. **Impulso Mecánico (\vec{I}):** Efecto dinámico continuo de una fuerza neta actuando durante un intervalo de tiempo (\vec{I} = \int \vec{F}\,dt). **Teorema del Impulso y la Cantidad de Movimiento:** \vec{I} = \Delta \vec{p} = \vec{p}_f - \vec{p}_0.
3. **Ley de Conservación de la Cantidad de Movimiento:** En todo sistema físico aislado donde la resultante de las fuerzas externas netas sea nula (\sum \vec{F}_{\text{ext}} = \vec{0}), la cantidad de movimiento total del sistema permanece estrictamente constante e invariante a través del tiempo:
   \vec{p}_{\text{total, inicial}} = \vec{p}_{\text{total, final}}
4. **Teoría de Colisiones (Choques):** Clasificación según el **Coeficiente de Restitución de Newton (e)**:
   - Choque perfectamente elástico (e = 1): Se conserva la cantidad de movimiento y la energía cinética total.
   - Choque inelástico (0 < e < 1): Se conserva la cantidad de movimiento, pero se disipa energía cinética en calor y deformación permanente.
   - Choque perfectamente inelástico o plástico (e = 0): Los cuerpos quedan unidos tras el impacto moviéndose con velocidad común; máxima pérdida de energía cinética.
5. **Ley de Gravitación Universal (Newton, 1687):** Dos partículas materiales en el universo se atraen con una fuerza central directamente proporcional al producto de sus masas e inversamente proporcional al cuadrado de la distancia que separa sus centros:
   F = G \frac{m_1 m_2}{r^2}
6. **Leyes de Kepler del Movimiento Planetario:**
   - *1.ª Ley (Órbitas Elípticas):* Todos los planetas se mueven en órbitas elípticas con el Sol situado en uno de los focos.
   - *2.ª Ley (Áreas Iguales):* El radio vector barrido desde el Sol hasta el planeta barre áreas iguales en intervalos de tiempo iguales (consecuencia de la conservación del momento angular: velocidad areolar constante).
   - *3.ª Ley (Ley de los Periodos):* El cuadrado del periodo orbital (T^2) es directamente proporcional al cubo del semieje mayor de la elipse (a^3): \frac{T^2}{a^3} = \frac{4\pi^2}{G M}.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 2. BASE TEÓRICA COMPLETA Y RIGUROSA

### 2.1. CANTIDAD DE MOVIMIENTO LINEAL (MOMENTUM)

La cantidad de movimiento lineal (o momento lineal) de una partícula mide cuantitativamente la "cantidad de masa en movimiento" y la dificultad inercial para detenerla o alterar su vector velocidad:
\vec{p} = m \cdot \vec{v}
- **Naturaleza Vectorial:** \vec{p} es colineal con el vector velocidad instantánea \vec{v}; tienen exactamente la misma dirección y sentido.
- **Unidad en el SI:** \text{kg}\cdot\text{m/s} (o equivalentemente \text{N}\cdot\text{s}).
- **Fórmula Dimensional:** [p] = [m][v] = MLT^{-1}.
- Para un sistema de n partículas discretas:
  \vec{P}_{\text{total}} = \sum_{i=1}^{n} \vec{p}_i = m_1 \vec{v}_1 + m_2 \vec{v}_2 + \dots + m_n \vec{v}_n = M_{\text{total}} \cdot \vec{v}_{CM}

---

### 2.2. IMPULSO MECÁNICO Y TEOREMA DEL IMPULSO

#### A. Definición de Impulso (\vec{I})
Para una fuerza constante \vec{F} que actúa durante un intervalo de tiempo finito \Delta t = t_f - t_0:
\vec{I} = \vec{F} \cdot \Delta t
Para una fuerza variable en el tiempo \vec{F}(t):
\vec{I} = \int_{t_0}^{t_f} \vec{F}(t) \, dt
- **Interpretación Gráfica:** En una gráfica de Fuerza versus Tiempo (F vs. t), **el área geométrica bajo la curva entre dos instantes representa exactamente el módulo del impulso mecánico**:
  \text{Área}_{F-t} = |\vec{I}|
- **Fuerza Media de Impacto (\vec{F}_m):** Fuerza constante hipotética que produce el mismo impulso que la fuerza real variable en el mismo tiempo \Delta t:
  \vec{F}_m = \frac{\vec{I}}{\Delta t}

#### B. Teorema del Impulso y la Cantidad de Movimiento
Partiendo de la Segunda Ley de Newton formulada originalmente por Isaac Newton:
\vec{F}_{\text{net}} = \frac{d\vec{p}}{dt} \implies \vec{F}_{\text{net}} \, dt = d\vec{p}
Integrando entre los instantes inicial y final:
\vec{I}_{\text{net}} = \Delta \vec{p} = \vec{p}_f - \vec{p}_0 = m \vec{v}_f - m \vec{v}_0
*"El impulso neto resultante aplicado a una partícula es igual a la variación vectorial de su cantidad de movimiento lineal."*

---

### 2.3. LEY DE CONSERVACIÓN DE LA CANTIDAD DE MOVIMIENTO

Consideremos un sistema aislado de partículas materiales sometidas a fuerzas internas mutuas de interacción (choques, explosiones, atracción elástica o gravitatoria) y a fuerzas externas del medio:
\frac{d\vec{P}_{\text{total}}}{dt} = \sum \vec{F}_{\text{ext}}
Si la resultante de las fuerzas externas netas que actúan sobre el sistema es cero (\sum \vec{F}_{\text{ext}} = \vec{0}), entonces:
\frac{d\vec{P}_{\text{total}}}{dt} = \vec{0} \implies \vec{P}_{\text{total}} = \text{constante vectorial}
\sum \vec{p}_{\text{antes}} = \sum \vec{p}_{\text{después}}
m_1 \vec{v}_{1i} + m_2 \vec{v}_{2i} = m_1 \vec{v}_{1f} + m_2 \vec{v}_{2f}

* **Aplicaciones Cardinales:**
  - **Retroceso de Armas de Fuego:** Inicialmente el arma y el proyectil están en reposo (\vec{P}_0 = \vec{0}). Tras el disparo:
    m_{\text{bala}} \vec{v}_{\text{bala}} + M_{\text{fusil}} \vec{v}_{\text{retroceso}} = \vec{0} \implies \vec{v}_{\text{retroceso}} = -\frac{m_{\text{bala}}}{M_{\text{fusil}}} \vec{v}_{\text{bala}}
  - **Propulsión por Reacción (Cohetes Espaciales):** Expulsión continua de gases de combustión a alta velocidad hacia atrás que propulsa al cohete hacia adelante por conservación de la cantidad de movimiento total.

---

### 2.4. COLISIONES MECÁNICAS (CHOQUES)

Una colisión es una interacción física intensa y de muy corta duración temporal (\Delta t \to 0) entre dos o más cuerpos, donde las fuerzas impulsivas internas mutuas superan por órdenes de magnitud a cualquier fuerza externa presente (peso, rozamiento), permitiendo aplicar estrictamente la conservación de la cantidad de movimiento durante el intervalo del choque.

#### A. Coeficiente de Restitución de Newton (e)
Parámetro adimensional que cuantifica el grado de elasticidad y recuperación morfológica de los cuerpos tras el impacto, definido como la razón negativa entre la velocidad relativa de alejamiento (separación) y la velocidad relativa de acercamiento (aproximación) a lo largo de la línea normal de choque:
e = -\frac{v_{2f} - v_{1f}}{v_{2i} - v_{1i}} = \frac{v_{2f} - v_{1f}}{v_{1i} - v_{2i}} = \frac{v_{\text{relativa de separación}}}{v_{\text{relativa de aproximación}}}
Donde 0 \le e \le 1.

#### B. Clasificación Termodinámica de los Choques
| Tipo de Choque | Coeficiente e | Conservación de \vec{p} | Conservación de la Energía Cinética (E_c) | Comportamiento Mecánico |
| :--- | :---: | :---: | :---: | :--- |
| **Perfectamente Elástico** | e = 1 | **SÍ** | **SÍ** (E_{ci} = E_{cf}) | Cero disipación; deformación reversible sin generación neta de calor. Choques de bolas de billar duras o partículas subatómicas. |
| **Inelástico o Parcialmente Elástico** | 0 < e < 1 | **SÍ** | **NO** (E_{cf} < E_{ci}) | Parte de la energía cinética se transforma irreversiblemente en calor, ondas sonoras y deformación plástica permanente. |
| **Completamente Inelástico (Plástico)** | e = 0 | **SÍ** | **NO** (Máxima pérdida de E_c) | Los cuerpos se acoplan o adhieren rígidamente tras el choque y continúan moviéndose juntos con la **misma velocidad común** (\vec{v}_f). |

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 3. FÓRMULAS FUNDAMENTALES Y RELACIONES MATEMÁTICAS

1. **Momento Lineal e Impulso:**
   \vec{p} = m\vec{v}, \quad \vec{I} = \vec{F}_m \Delta t = \Delta \vec{p}

2. **Conservación de la Cantidad de Movimiento:**
   \sum \vec{p}_{\text{antes}} = \sum \vec{p}_{\text{después}}

3. **Coeficiente de Restitución de Choques:**
   e = \frac{v_{2f} - v_{1f}}{v_{1i} - v_{2i}}
   e = 1 \text{ (elástico)}, \quad e = 0 \text{ (plástico)}

4. **Ley de Gravitación Universal:**
