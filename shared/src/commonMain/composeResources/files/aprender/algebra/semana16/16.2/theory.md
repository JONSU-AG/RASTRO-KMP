## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
#### Optimización Geométrica de Áreas:
Para cercar una región rectangular con un perímetro fijo de alambre 2p:
2x + 2y = 2p \implies y = p - x
\text{Área}(x) = x(p - x) = -x^2 + px
El área máxima se logra siempre cuando el rectángulo es un **cuadrado**: x = y = \frac{p}{2} \implies \text{Área}_{\max} = \left(\frac{p}{2}\right)^2.

---

### 3.4. Modelos Exponenciales Continuos

#### 1. Crecimiento Poblacional (Ley de Thomas Malthus):
P(t) = P_0 \cdot e^{kt}, \quad k > 0
- P_0: Población inicial en t = 0.
- k: Tasa intrínseca de crecimiento continuo.
- **Tiempo de Duplicación (t_d):**
  P_0 e^{k t_d} = 2P_0 \implies e^{k t_d} = 2 \implies \mathbf{t_d = \frac{\ln 2}{k}}

#### 2. Desintegración Radiactiva y Vida Media:
N(t) = N_0 \cdot e^{-\lambda t}, \quad \lambda > 0
- N_0: Masa inicial del isótopo inestable.
- \lambda: Constante de desintegración.
- **Vida Media o Periodo de Semidesintegración (T_{1/2}):** Tiempo necesario para que la mitad de los núcleos radiactivos decaiga:
  \mathbf{T_{1/2} = \frac{\ln 2}{\lambda}}

#### 3. Ley de Enfriamiento de Isaac Newton:
La rapidez de cambio térmico de un cuerpo es proporcional a la diferencia entre su temperatura T(t) y la del medio ambiente T_m:
T(t) = T_m + (T_0 - T_m) e^{-kt}, \quad k > 0

---

### 3.5. Modelos Logarítmicos en las Ciencias

#### 1. Química: Potencial de Hidrógeno (pH)
Medida de acidez o alcalinidad en soluciones acuosas basada en la concentración molar de iones hidronio [H^+]:
\mathbf{\text{pH} = -\log_{10}[H^+] = \text{colog}[H^+]}
- \text{pH} < 7: Solución ácida.
- \text{pH} = 7: Solución neutra (agua pura a 25^\circ\text{C}).
- \text{pH} > 7: Solución básica o alcalina.

#### 2. Acústica: Nivel de Intensidad Sonora (\beta en Decibeles)
\mathbf{\beta = 10 \cdot \log_{10}\left(\frac{I}{I_0}\right)}
- I: Intensidad de la onda sonora en \text{W/m}^2.
- I_0 = 10^{-12} \text{ W/m}^2: Umbral de audición humana estándar.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Decaimiento Radiactivo** | N(t) = N_0 e^{-\lambda t} | T_{1/2} = \frac{\ln 2}{\lambda} (Vida media) |
| **Enfriamiento Newton** | T(t) = T_m + (T_0 - T_m)e^{-kt} | T_m: temperatura ambiental |
| **pH Químico** | \text{pH} = -\log[H^+] | [H^+] = 10^{-\text{pH}} |
| **Nivel Sonoro (dB)** | \beta = 10 \log\left(\frac{I}{10^{-12}}\right) | \beta en decibeles |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Artificio 1: Duplicación de Potencia Sonora en Decibeles
Si una turbina emite 80\text{ dB}, ¿cuántos decibeles emiten dos turbinas idénticas funcionando juntas?
**¡Jamás sumes 80 + 80 = 160\text{ dB}!** Eso destruiría el tímpano humano al instante.
**Hack:** Al duplicar la potencia o intensidad sonora (2I), se suma exactamente:
10 \log 2 \approx 10(0.30103) \approx +3\text{ dB}
Por tanto, dos turbinas emiten: 80 + 3 = \mathbf{83\text{ dB}}.
Diez turbinas (10I) suman exactamente 10 \log 10 = +10\text{ dB} \implies 90\text{ dB}.

### Artificio 2: Concentración de Hidronio desde el pH
Si te dicen que el agua del río Chili tiene \text{pH} = 6 y tras un vertido minero pasa a \text{pH} = 4:
**Hack:** Cada unidad de descenso en la escala de pH multiplica la concentración de acidez [H^+] por **10**:
\text{Descenso de 2 unidades} \implies 10^2 = 100 \text{ veces más ácida}

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. El Trío Económico: "Ingreso es lo que entra, Costo lo que gasta, Utilidad lo que queda"
\text{Utilidad} = \text{Ingreso} - \text{Costo}
- Si \text{Utilidad} = 0 \implies \text{PUNTO DE EQUILIBRIO} (ni ganas ni pierdes).
- Si \text{Utilidad} > 0 \implies \text{GANANCIA}.
- Si \text{Utilidad} < 0 \implies \text{PÉRDIDA}.

### 2. Duplicación y Vida Media: "El 0.693 Mágico"
Como \ln 2 \approx 0.693:
\text{Tiempo} = \frac{0.693}{k}
Sirve tanto para saber cuándo se duplica una inversión o bacteria (k positivo), como para saber cuándo se reduce a la mitad un fármaco en el torrente sanguíneo (\lambda de eliminación).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Producción Óptima con Utilidad Máxima**
> Si el problema pide: *"Halle la utilidad máxima"*, muchos postulantes calculan q^* = -b/(2a) y marcan esa alternativa.
> **¡CUIDADO!** q^* es la **cantidad de artículos** que se deben producir; la **utilidad máxima** es el valor evaluado de la función en ese punto (U(q^*)). Lee siempre con lupa la pregunta final.

> [!CAUTION]
> **Trampa 2: Homogeneizar Unidades de Tiempo en Exponenciales**
> Si la tasa k está dada en horas (k = 0.5 \text{ h}^{-1}) y te preguntan la población a los 90 minutos:
> Si reemplazas t = 90, el cálculo colapsará con números gigantescos.
> **Debes convertir 90 minutos a horas:** t = 1.5 horas.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Tratamiento de Aguas Residuales y Monitoreo del Río Chili (Arequipa)
En la planta de tratamiento de aguas residuales La Enlozada (Arequipa), los ingenieros químicos modelan la neutralización de efluentes industriales mediante la función de pH: \text{pH} = -\log[H^+]. Asimismo, la degradación bacteriana de la Demanda Bioquímica de Oxígeno (DBO) en los reactores biológicos sigue una función exponencial decreciente: \text{DBO}(t) = \text{DBO}_0 e^{-0.15 t}. El dominio de la modelación algebraica permite a los especialistas de la UNSA y SEDAPAR certificar que el agua devuelta al cauce del río Chili cumpla con los Estándares de Calidad Ambiental (ECA) para riego agrícola en la campiña arequipeña.

---

## Interpretación de gráficos algebraicos

En una gráfica y = f(x), cada punto relaciona una entrada x con una salida y. Leerla exige identificar escalas, dominio, cortes con los ejes e intervalos de crecimiento; la altura de un punto no debe confundirse con la pendiente de la curva. El corte con el eje horizontal satisface f(x) = 0; el corte con el vertical, si existe, corresponde a x = 0.

En f(x) = ax² + bx + c, a ≠ 0 garantiza una función cuadrática. Puede ser a = 1: una condición de a ≠ 1 en un caso específico del temario no reemplaza la condición general. Si a > 0, la parábola tiene un mínimo; si a < 0, un máximo. Su eje de simetría es x = −b/(2a). Por ejemplo, y = x² − 4 corta el eje x en −2 y 2 y el eje y en −4. El gráfico permite relacionar ceros, signo de la función y solución de desigualdades.
