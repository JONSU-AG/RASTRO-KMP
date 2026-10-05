## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3. Ondas Senoidales Progresivas y Superposición
Una perturbación ondulatoria unidimensional que se propaga a velocidad v:
y(x,t) = A \operatorname{sen}(kx \mp \omega t + \phi)
- Signo (-): Onda que viaja hacia la derecha (+x).
- Signo (+): Onda que viaja hacia la izquierda (-x).
- **Número de onda (k):** k = \frac{2\pi}{\lambda}, donde \lambda es la longitud de onda.
- **Velocidad de propagación:** v = \frac{\omega}{k} = \lambda f.

**Batimiento (Beats):** Superposición de dos ondas sonoras de frecuencias muy cercanas f_1 \approx f_2:
y_1 + y_2 = A \operatorname{sen}(2\pi f_1 t) + A \operatorname{sen}(2\pi f_2 t) = \left[ 2A \cos\left(2\pi \frac{f_1 - f_2}{2} t\right) \right] \operatorname{sen}\left(2\pi \frac{f_1 + f_2}{2} t\right)
La frecuencia del pulso de batimiento percibido es f_{\text{bat}} = |f_1 - f_2|.

---

### 3.4. Corriente Alterna y Fasores
- Voltaje alterno senoidal: v(t) = V_{\text{pico}} \operatorname{sen}(\omega t)
- Voltaje Eficaz o RMS (Root Mean Square):
  V_{\text{rms}} = \frac{V_{\text{pico}}}{\sqrt{2}}
- En la red eléctrica peruana doméstica: V_{\text{rms}} = 220\text{ V}, f = 60\text{ Hz} \implies \omega = 120\pi\text{ rad/s} \approx 377\text{ rad/s}.
  V_{\text{pico}} = 220\sqrt{2}\text{ V} \approx 311.13\text{ V}

---

### 3.5. Optimización Trigonométrica Sin Derivadas
En problemas de máximos y mínimos de figuras geométricas con variables angulares \theta:
1. **Forma A\operatorname{sen}\theta + B\cos\theta:**
   -\sqrt{A^2+B^2} \le A\operatorname{sen}\theta + B\cos\theta \le \sqrt{A^2+B^2}
2. **Propiedad de Medias (MA \ge MG):** Para términos como a\tan\theta + b\cot\theta con \theta \in \langle 0, \pi/2\rangle:
   a\tan\theta + b\cot\theta \ge 2\sqrt{ab}
   El valor mínimo 2\sqrt{ab} se alcanza cuando a\tan\theta = b\cot\theta \implies \tan\theta = \sqrt{b/a}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
\text{Frecuencia de Batimiento} & f_{\text{bat}} = |f_1 - f_2| & \text{Sonoridad oscila entre 0 y } 2A \\ \hline
\text{Voltaje Eficaz (RMS)} & V_{\text{rms}} = \frac{V_{\text{pico}}}{\sqrt{2}} & \text{Onda puramente senoidal} \\ \hline
\text{Máx/Mín de } A\operatorname{sen} x + B\cos x & \text{Máx} = +\sqrt{A^2+B^2},\; \text{Mín} = -\sqrt{A^2+B^2} & \text{Ángulo idéntico } x \\ \hline
\text{Mínimo de } a\operatorname{sen}^2 x + b\csc^2 x & \text{Mínimo} = 2\sqrt{ab} & \text{Para } a, b > 0 \\ \hline
\hline
\end{array}

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Conversión Directa de Horas a Fase Angular
En problemas DECO de mareas o temperaturas que ocurren a lo largo de un día (T = 24\text{ h} o T = 12\text{ h}):
- Si T = 24\text{ h} \implies \omega = \frac{2\pi}{24} = \frac{\pi}{12}\text{ rad/h}. Cada hora equivale a un giro de fase de 15^\circ (\frac{\pi}{12}\text{ rad}).
- Si T = 12\text{ h} \implies \omega = \frac{2\pi}{12} = \frac{\pi}{6}\text{ rad/h}. Cada hora equivale a 30^\circ (\frac{\pi}{6}\text{ rad}).
*Truco:* Para saber la altura a las 4 horas después del pico máximo, evalúa simplemente \cos(4 \times 30^\circ) = \cos(120^\circ) = -0.5.

### Hack 2: Búsqueda del Máximo Rectángulo Inscrito en una Semicircunferencia
Dado un semicírculo de radio R, el rectángulo inscrito con base en el diámetro tiene vértices en (R\cos\theta, R\operatorname{sen}\theta).
- Área: S(\theta) = (2R\cos\theta)(R\operatorname{sen}\theta) = R^2 (2\operatorname{sen}\theta\cos\theta) = R^2 \operatorname{sen}(2\theta).
- Como el valor máximo de \operatorname{sen}(2\theta) es 1 (cuando 2\theta = 90^\circ \implies \theta = 45^\circ):
S_{\max} = R^2
¡No se necesita cálculo diferencial! Se resuelve en 5 segundos con el ángulo doble.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "A-K-T-O" para Modelado de Mareas y Clima
Para extraer al instante los parámetros de cualquier problema verbal (temperatura o nivel de agua):
- **A**mplitud: \frac{\text{Máx} - \text{Mín}}{2}
- **K** (Eje central): \frac{\text{Máx} + \text{Mín}}{2}
- **T**iempo de período: T = 2 \times (\text{tiempo entre un mínimo y el siguiente máximo consecutivo})
- **O**mega (\omega): \omega = \frac{2\pi}{T}

### Mnemotecnia 2: "El Columpio Energético"
- En el centro (x=0): **V**elocidad es **V**oluminosa (máxima), **A**celeración es **A**usente (0).
- En los extremos (|x|=A): **V**elocidad es **V**acía (0), **A**celeración es **A**rrrolladora (máxima).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Frecuencia Ordinaria con Frecuencia Angular**
> En enunciados que dicen "un pistón vibra a 30 revoluciones por segundo (Hz)", muchos colocan \omega = 30. ¡Falso! La frecuencia ordinaria es f = 30\text{ Hz}, por lo que \omega = 2\pi(30) = 60\pi\text{ rad/s}.

> [!CAUTION]
> **Trampa 2: Elección Equivocada entre Seno y Coseno al Modelar**
> Si el fenómeno inicia en t = 0 en su **valor máximo** (ej. solsticio de verano, marea alta), usa directamente el **coseno sin desfase**:
> y(t) = A\cos(\omega t) + k
> Si inicia en el punto de equilibrio ascendiendo, usa el **seno**:
> y(t) = A\operatorname{sen}(\omega t) + k
> Usar seno cuando arranca en el máximo te obligará a arrastrar un desfase de +\frac{\pi}{2}, donde los postulantes cometen errores de signo.

> [!WARNING]
> **Trampa 3: Unidades de los Parámetros Temporales**
> Si el tiempo t se mide en horas y la velocidad angular en rad/min, debes homogenizar de inmediato antes de operar.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Caso 1: Navegación Portuaria en el Puerto de Matarani (Arequipa)
Un buque de gran calado necesita al menos 6.5\text{ m} de profundidad en el canal de acceso para maniobrar sin encallar. Si la marea baja mide 4\text{ m} y la marea alta 8\text{ m}, modelar el intervalo de horas en que el buque puede atracar con seguridad es un problema de inecuaciones trigonométricas contextualizadas típico de los exámenes UNSA y UNMSM.

### Caso 2: Acústica Médica y Tomografía por Ultrasonido
En ecografías, se emiten ondas ultrasónicas de frecuencia f \approx 3.5\text{ MHz}. Conociendo la velocidad del sonido en los tejidos blandos (v \approx 1540\text{ m/s}), la longitud de onda viene dada por \lambda = \frac{v}{f} \approx 0.44\text{ mm}, que delimita la resolución espacial mínima del diagnóstico por imagen.

---
