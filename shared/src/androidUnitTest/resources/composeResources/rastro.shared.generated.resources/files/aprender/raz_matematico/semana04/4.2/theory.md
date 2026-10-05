## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Principio de Proyección Ortogonal de Escaleras:**
  Si una figura poligonal tiene forma de escalera con ángulos de 90^\circ:
  \text{Suma de tramos horizontales} = \text{Base total}
  \text{Suma de tramos verticales} = \text{Altura total}
  2p_{\text{escalera}} = 2(\text{Base}) + 2(\text{Altura})
  *(El perímetro es exactamente idéntico al del rectángulo envolvente que lo contiene).*

---

### 3.3 Conteo Analítico de Figuras Geométricas

1. **Conteo de Segmentos:**
   Para una recta con n espacios consecutivos alineados:
   \text{N.° de Segmentos} = \frac{n(n + 1)}{2}
2. **Conteo de Triángulos Alineados desde un Vértice Común:**
   Con n espacios en la base:
   \text{N.° de Triángulos} = \frac{n(n + 1)}{2}
   Si tiene h líneas horizontales o secantes que cortan los lados:
   \text{N.° de Triángulos} = \frac{n(n + 1)}{2} \cdot h
3. **Conteo de Cuadriláteros en una Cuadrícula (m \times n espacios):**
   \text{N.° de Cuadriláteros} = \left[ \frac{m(m + 1)}{2} \right] \cdot \left[ \frac{n(n + 1)}{2} \right]
4. **Conteo de Cuadrados en una Cuadrícula (m \times n):**
   \text{N.° de Cuadrados} = m \cdot n + (m - 1)(n - 1) + (m - 2)(n - 2) + \dots
   *(Hasta que uno de los factores se convierta en 1).*

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Cuatro Pétalos (Flor de 4 hojas)** | Cuatro semicircunferencias inscritas en los lados del cuadrado | A_s = \frac{L^2}{2} (\pi - 2) |
| **Círculo Inscrito en Cuadrado** | Círculo de radio r = \frac{L}{2} | A_s = \pi r^2 = \frac{\pi L^2}{4} |
| **Esquinas Remanentes** | Área del cuadrado menos el círculo inscrito | A_s = L^2 \left(1 - \frac{\pi}{4}\right) = \frac{L^2}{4}(4 - \pi) |
| **Lúnulas de Hipócrates** | Triángulo rectángulo de catetos a, b con semicírculos sobre sus lados | A_{\text{lúnulas}} = A_{\triangle} = \frac{a \cdot b}{2} |

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Rompecabezas (Corte y Traslación Mental)
En problemas de figuras inscritas donde aparecen diagonales y medianas:
1. Divide el cuadrado en 8 triángulos rectángulos idénticos trazando sus dos diagonales y sus dos ejes de simetría horizontal y vertical.
2. Cuenta cuántos de esos 8 triángulos están sombreados.
3. Si están sombreados 3 triángulos de 8:  
   👉 A_s = \frac{3}{8} L^2. (Evita el cálculo de integrales o trigonometría).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL TEOREMA DE LA HOJITA"
> **"Pi menos dos, lado al cuadrado sobre dos"**  
> Para el área de una hojita formada por dos cuadrantes en un cuadrado de lado L:
> A_{\text{hoja}} = \frac{L^2}{2}(\pi - 2)
> Si te dan L = 6 \implies A = \frac{36}{2}(\pi - 2) = 18(\pi - 2). ¡Sale en 3 segundos!

### Mnemotecnia 2: Las Lúnulas Mágicas de Hipócrates
> **"La suma de las dos lúnulas es simplemente el triángulo del medio"**  
> No necesitas calcular áreas circulares con \pi; el término \pi se cancela matemáticamente por el Teorema de Pitágoras.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Perímetro de una Región Sombreada NO es solo el contorno exterior si tiene hueco:**
   * Si una región sombreada tiene una perforación circular en el medio, su perímetro total es:
     2p_{\text{total}} = \text{Perímetro Exterior} + \text{Perímetro Interior}
   * *Trampa UNSA:* Muchos postulantes solo calculan el borde exterior y olvidan sumar el contorno del hueco.
2. ⚠️ **Confundir "Conteo de Cuadriláteros" con "Conteo de Cuadrados":**
   * Todo cuadrado es cuadrilátero, pero no todo cuadrilátero es cuadrado.
   * La fórmula \frac{m(m+1)}{2} \cdot \frac{n(n+1)}{2} cuenta **todos los rectángulos y cuadriláteros**.
   * Para contar **cuadrados estrictos**, se debe aplicar el producto decreciente m\cdot n + (m-1)(n-1) + \dots.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diseño de Fachadas con Baldosas en el Centro Histórico de Arequipa
Un arquitecto diseña losetas decorativas cuadradas de 40 \text{ cm} \times 40 \text{ cm} de piedra sillar para un hotel colonial en Yanahuara. Cada loseta contiene una figura de cuatro pétalos sombreados con resina oscura.
* Lado de la loseta: L = 40 \text{ cm}.
* Área sombreada de resina por loseta:
  A_s = \frac{L^2}{2}(\pi - 2) = \frac{40^2}{2}(3.1416 - 2) = \frac{1600}{2}(1.1416) = 800 \times 1.1416 \approx \mathbf{913.28 \text{ cm}^2}
* Esto permite cotizar con exactitud milimétrica la cantidad de resina requerida por metro cuadrado de fachada.

---
