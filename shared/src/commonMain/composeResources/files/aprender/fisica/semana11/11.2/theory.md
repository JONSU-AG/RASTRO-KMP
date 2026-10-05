## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II

### 3.2. Ondas Mecánicas y Acústica
1. **Onda:** Propagación de una perturbación que transporta energía y cantidad de movimiento a través del espacio **sin transporte neto de materia**.
   - **Transversales:** Las partículas del medio oscilan perpendicularmente a la dirección de propagación (ej. cuerda tensa, ondas electromagnéticas).
   - **Longitudinales:** Las partículas oscilan paralelamente a la dirección de propagación (ej. sonido en fluidos, ondas de compresión en resortes).
2. **Ecuación de Onda Unidimensional Armónica:**
   y(x, t) = A \sin(k x \mp \omega t + \phi)
   - Signo (-): se propaga hacia la derecha (+x).
   - Signo (+): se propaga hacia la izquierda (-x).
   - Número de onda: k = \frac{2\pi}{\lambda} [\text{rad/m}].
   - Rapidez de onda:
     v = \frac{\lambda}{T} = \lambda f = \frac{\omega}{k}
   - En una cuerda tensa (Fórmula de Taylor): v = \sqrt{\frac{T_{\text{tensión}}}{\mu}}, donde \mu = m/L es la densidad lineal de masa.
3. **Ondas Sonoras y Nivel Sonoro (\beta):**
   - Rapidez del sonido en el aire seco a 20^\circ\text{C}: v_s \approx 343\text{ m/s} (v \approx 331 + 0.6 T_C\text{ m/s}).
   - **Intensidad Sonora (I):** Potencia por unidad de área normal:
     I = \frac{P}{A} = \frac{P}{4\pi r^2} \quad \left[\frac{\text{W}}{\text{m}^2}\right]
   - **Nivel de Intensidad Sonora (\beta en Decibelios, \text{dB}):**
     \beta = 10 \log_{10}\left(\frac{I}{I_0}\right)
     donde I_0 = 10^{-12}\ \text{W/m}^2 es el umbral de audición humana a 1000\text{ Hz}.
4. **Efecto Doppler:**
   Cambio aparente en la frecuencia percibida por un observador debido al movimiento relativo entre la fuente emisora y el receptor:
   f_{\text{obs}} = f_{\text{fte}} \left(\frac{v \pm v_{\text{obs}}}{v \mp v_{\text{fte}}}\right)
   - **Regla de signos:** El observador suma (+) si se acerca a la fuente; la fuente resta (-) en el denominador si se acerca al observador.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
   \frac{1}{f} = \frac{1}{s} + \frac{1}{s'}
   - f: distancia focal (f = R/2 en espejos esféricos paraxiales).
   - s: distancia del objeto al vértice o centro óptico (siempre +s para objeto real).
   - s': distancia de la imagen (positivo para imagen real; negativo para imagen virtual).
2. **Convenio de Signos Universal:**
   - **Espejo Cóncavo / Lente Convergente:** f > 0.
   - **Espejo Convexo / Lente Divergente:** f < 0.
   - **Imagen Real:** s' > 0 (delante del espejo / detrás de la lente; siempre invertida).
   - **Imagen Virtual:** s' < 0 (detrás del espejo / delante de la lente; siempre derecha).
3. **Aumento Lateral (m):**
   m = \frac{y'}{y} = -\frac{s'}{s}
   - Si m > 0: imagen derecha. Si m < 0: imagen invertida.
   - Si |m| > 1: imagen aumentada. Si |m| < 1: imagen disminuida.
4. **Potencia de una Lente (P):**
   P = \frac{1}{f(\text{en metros})} \quad [\text{Dioptrías, D} = \text{m}^{-1}]

---


### 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Péndulo en Ascensor con Aceleración):** En un ascensor con aceleración vertical \vec{a}, la gravedad efectiva cambia:
  - Si acelera hacia arriba: g_{\text{ef}} = g + a \implies T disminuye (oscila más rápido).
  - Si acelera hacia abajo: g_{\text{ef}} = g - a \implies T aumenta (oscila más lento).
- **Trampa 2 (Ángulos en Snell):** El ángulo de incidencia y refracción **se mide siempre respecto a la normal**, nunca respecto a la superficie o interfaz.
- **Trampa 3 (Espejo Convexo y Lente Divergente):** Para un objeto real, tanto el espejo convexo como la lente divergente forman **SIEMPRE, sin excepción**, una imagen:
  \text{VIRTUAL, DERECHA Y DE MENOR TAMAÑO}
- **Trampa 4 (Duplicar el número de fuentes sonoras):** Si una fuente emite 60\text{ dB}, dos fuentes idénticas emiten 2I, lo que equivale a:
  \beta = 60 + 10 \log_{10}(2) \approx 60 + 3 = 63\text{ dB} \quad (\text{¡NO } 120\text{ dB!})

---


### 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Velocidad máxima en el MAS:**
   > **"V-M-A"** \implies v_{\max} = \omega \cdot A.
2. **Aceleración máxima en el MAS:**
   > **"A-O-C-A"** \implies a_{\max} = \omega^2 \cdot A.
3. **Periodo del Péndulo Simple:**
   > **"T = 2π √(L/g)"** \implies **"Tengo Dos Pies Largos y Gordos"**.
4. **Fórmula de Descartes de Espejos y Lentes:**
   > **"FIO":** \frac{1}{f} = \frac{1}{i} + \frac{1}{o} \implies **"Foco = Imagen + Objeto"**.
5. **Decibelios:**
   > Cada aumento de 10\text{ dB} multiplica la intensidad por 10. +20\text{ dB} \to \times 100; +30\text{ dB} \to \times 1000.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Telecomunicaciones y Fibra Óptica:** Las autopistas de datos de internet global operan mediante pulsos láser de infrarrojo guiados a través de fibras de sílice ultra puras mediante confinamiento por reflexión total interna, alcanzando anchos de banda de terabits por segundo.
- **Sismología y Geofísica:** Los terremotos generan ondas primarias (P, longitudinales, más rápidas) y secundarias (S, transversales, que no se transmiten en líquidos). El análisis del tiempo de llegada de ambas permite triangular el epicentro y reveló que el núcleo externo de la Tierra es líquido.
- **Medicina Oftalmológica:** La miopía (globo ocular alargado) se corrige con lentes divergentes (potencia negativa en dioptrías) para desplazar el foco hacia atrás sobre la retina; la hipermetropía se corrige con lentes convergentes (potencia positiva).

---

## Propagación de la luz

En un medio homogéneo y en la aproximación de óptica geométrica, la luz se representa mediante rayos rectilíneos. Esa aproximación no elimina su naturaleza ondulatoria: difracción e interferencia requieren otro nivel de descripción. La velocidad cambia con el medio y el índice de refracción es n = c/v.

En reflexión, el ángulo incidente y el reflejado se miden desde la normal y son iguales. En refracción, n₁ sin θ₁ = n₂ sin θ₂. Al cambiar de medio, la frecuencia se conserva mientras pueden cambiar velocidad y longitud de onda. El color asociado a una frecuencia no se deduce únicamente de que la longitud de onda disminuya en un medio.
