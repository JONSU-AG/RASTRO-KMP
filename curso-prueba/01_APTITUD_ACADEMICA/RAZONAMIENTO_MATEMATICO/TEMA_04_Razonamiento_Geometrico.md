# TEMA 04 · RAZONAMIENTO GEOMÉTRICO, ÁREAS Y PERÍMETROS
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_04`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Enfoque DECO traslación de áreas y simetrías] [UNI: Geometría combinatoria y perímetros con tangencias]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Áreas sombreadas por traslación de regiones, perímetros con semicircunferencias, conteo de figuras (segmentos, triángulos, cuadriláteros) y simetría. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: áreas de terrenos irregulares, optimización de cercos perimétricos, doblado y corte de papel, vistas ortogonales. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Relaciones de áreas en triángulos mediante razones métricas, geometría fractal elemental, rotaciones espaciales y sólidos de revolución intuitivos. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Desarrollar la visualización espacial para el análisis de figuras bidimensionales y tridimensionales.
2. Identificar y relacionar elementos angulares y de paralelismo en configuraciones geométricas.
3. Analizar perímetros y áreas sombreadas en contextos no directos mediante traslación y compensación.
4. Descomponer y reconfigurar figuras complejas como estrategia sistemática de resolución.
5. Reconocer simetrías (axiales y centrales) y transformaciones rígidas (rotación, traslación).
6. Inferir resultados mediante algoritmos analíticos de conteo de segmentos, regiones y figuras convexas.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Método de Traslación de Regiones Sombreadas
        ┌─ 1. Cálculo de ──────┼─ Método de Diferencia de Áreas (Área Total - Área No Sombreada)
        │      Áreas           ├─ Relaciones de Áreas en Triángulos (Medianas y Baricentro)
        │                      └─ Propiedades en Paralelogramos y Trapecios
        │
RAZONAMIENTO                   ┌─ Definición Rigurosa de Perímetro (Contorno exterior continuo)
GEOMÉTRICO ─────┼─ 2. Perímetros ──────┼─ Perímetros de Curvas y Semicircunferencias Compuestas
        │      y Contornos     └─ Principio de Conservación de Perímetro por Proyección Ortogonal
        │
        │                      ┌─ Conteo por Inducción: Fórmulas n(n+1)/2 (Segmentos, Ángulos)
        ├─ 3. Conteo de ───────┼─ Conteo de Triángulos y Cuadriláteros en Redes
        │      Figuras         └─ Conteo de Cubos y Bloques en Sólidos 3D
        │
        └─ 4. Visualización ───┌─ Simetría Axial (Reflexión respecto a una recta) y Central
               Espacial y      ├─ Doblado, Desdoblado y Perforación de Papel
               Simetría        └─ Vistas Principales (Frontal, Horizontal, Perfil)
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Métodos Maestros para el Cálculo de Áreas Sombreadas

#### A. Método de Traslación de Regiones
Consiste en trasladar una o más regiones sombreadas congruentes hacia zonas en blanco, completando figuras geométricas elementales y conocidas (cuadrados, sectores circulares, triángulos).
* **Condición de validez:** Las regiones deben ser rigurosamente simétricas o congruentes.

#### B. Método por Diferencia de Áreas
Cuando la región sombreada tiene forma irregular o no reconocible:
$$A_{\text{sombreada}} = A_{\text{figura total}} - \sum A_{\text{regiones no sombreadas}}$$

#### C. Propiedades Clave de Relaciones de Áreas en Triángulos
1. **Propiedad de la Mediana:** La mediana divide al triángulo en dos regiones de **igual área**:
   $$A_{\triangle ABM} = A_{\triangle MBC} = \frac{A_{\triangle ABC}}{2}$$
2. **Propiedad del Baricentro ($G$):** Las 3 medianas dividen al triángulo en **6 triángulos de igual área**:
   $$S_1 = S_2 = S_3 = S_4 = S_5 = S_6 = \frac{A_{\text{total}}}{6}$$
   Al unir el baricentro con los tres vértices, se forman 3 triángulos de igual área: $\frac{A_{\text{total}}}{3}$.
3. **Puntos Medios de los 3 Lados:**
   El triángulo central formado por la unión de los tres puntos medios tiene un área igual a la cuarta parte del total:
   $$A_{\text{central}} = \frac{A_{\text{total}}}{4}$$

---

### 3.2 Perímetros: Definición y Propiedades de Proyección

* **Definición Rigurosa:** El perímetro ($2p$) de una región es la **longitud total de su frontera o contorno exterior**.
* **Principio de Proyección Ortogonal de Escaleras:**
  Si una figura poligonal tiene forma de escalera con ángulos de $90^\circ$:
  $$\text{Suma de tramos horizontales} = \text{Base total}$$
  $$\text{Suma de tramos verticales} = \text{Altura total}$$
  $$2p_{\text{escalera}} = 2(\text{Base}) + 2(\text{Altura})$$
  *(El perímetro es exactamente idéntico al del rectángulo envolvente que lo contiene).*

---

### 3.3 Conteo Analítico de Figuras Geométricas

1. **Conteo de Segmentos:**
   Para una recta con $n$ espacios consecutivos alineados:
   $$\text{N.° de Segmentos} = \frac{n(n + 1)}{2}$$
2. **Conteo de Triángulos Alineados desde un Vértice Común:**
   Con $n$ espacios en la base:
   $$\text{N.° de Triángulos} = \frac{n(n + 1)}{2}$$
   Si tiene $h$ líneas horizontales o secantes que cortan los lados:
   $$\text{N.° de Triángulos} = \frac{n(n + 1)}{2} \cdot h$$
3. **Conteo de Cuadriláteros en una Cuadrícula ($m \times n$ espacios):**
   $$\text{N.° de Cuadriláteros} = \left[ \frac{m(m + 1)}{2} \right] \cdot \left[ \frac{n(n + 1)}{2} \right]$$
4. **Conteo de Cuadrados en una Cuadrícula ($m \times n$):**
   $$\text{N.° de Cuadrados} = m \cdot n + (m - 1)(n - 1) + (m - 2)(n - 2) + \dots$$
   *(Hasta que uno de los factores se convierta en 1).*

---

## 4. 📐 FORMULARIO MAESTRO DE REGIONES SOMBREADAS CLÁSICAS

### Cuadrado de Lado $L$ y sus Configuraciones Típicas de Examen

| Configuración Clásica | Representación Visual | Área Sombreada ($A_s$) |
| :--- | :--- | :---: |
| **Pétalo Simple (Hojita)** | Cuadrante con dos arcos de radio $L$ trazados desde vértices opuestos | $$A_s = \frac{L^2}{2} (\pi - 2)$$ |
| **Cuatro Pétalos (Flor de 4 hojas)** | Cuatro semicircunferencias inscritas en los lados del cuadrado | $$A_s = \frac{L^2}{2} (\pi - 2)$$ |
| **Círculo Inscrito en Cuadrado** | Círculo de radio $r = \frac{L}{2}$ | $$A_s = \pi r^2 = \frac{\pi L^2}{4}$$ |
| **Esquinas Remanentes** | Área del cuadrado menos el círculo inscrito | $$A_s = L^2 \left(1 - \frac{\pi}{4}\right) = \frac{L^2}{4}(4 - \pi)$$ |
| **Lúnulas de Hipócrates** | Triángulo rectángulo de catetos $a, b$ con semicírculos sobre sus lados | $$A_{\text{lúnulas}} = A_{\triangle} = \frac{a \cdot b}{2}$$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL TEOREMA DE LA HOJITA"
> **"Pi menos dos, lado al cuadrado sobre dos"**  
> Para el área de una hojita formada por dos cuadrantes en un cuadrado de lado $L$:
> $$A_{\text{hoja}} = \frac{L^2}{2}(\pi - 2)$$
> Si te dan $L = 6 \implies A = \frac{36}{2}(\pi - 2) = 18(\pi - 2)$. ¡Sale en 3 segundos!

### Mnemotecnia 2: Las Lúnulas Mágicas de Hipócrates
> **"La suma de las dos lúnulas es simplemente el triángulo del medio"**  
> No necesitas calcular áreas circulares con $\pi$; el término $\pi$ se cancela matemáticamente por el Teorema de Pitágoras.

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Rompecabezas (Corte y Traslación Mental)
En problemas de figuras inscritas donde aparecen diagonales y medianas:
1. Divide el cuadrado en 8 triángulos rectángulos idénticos trazando sus dos diagonales y sus dos ejes de simetría horizontal y vertical.
2. Cuenta cuántos de esos 8 triángulos están sombreados.
3. Si están sombreados 3 triángulos de 8:  
   👉 $A_s = \frac{3}{8} L^2$. (Evita el cálculo de integrales o trigonometría).

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Perímetro de una Región Sombreada NO es solo el contorno exterior si tiene hueco:**
   * Si una región sombreada tiene una perforación circular en el medio, su perímetro total es:
     $$2p_{\text{total}} = \text{Perímetro Exterior} + \text{Perímetro Interior}$$
   * *Trampa UNSA:* Muchos postulantes solo calculan el borde exterior y olvidan sumar el contorno del hueco.
2. ⚠️ **Confundir "Conteo de Cuadriláteros" con "Conteo de Cuadrados":**
   * Todo cuadrado es cuadrilátero, pero no todo cuadrilátero es cuadrado.
   * La fórmula $\frac{m(m+1)}{2} \cdot \frac{n(n+1)}{2}$ cuenta **todos los rectángulos y cuadriláteros**.
   * Para contar **cuadrados estrictos**, se debe aplicar el producto decreciente $m\cdot n + (m-1)(n-1) + \dots$.

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diseño de Fachadas con Baldosas en el Centro Histórico de Arequipa
Un arquitecto diseña losetas decorativas cuadradas de $40 \text{ cm} \times 40 \text{ cm}$ de piedra sillar para un hotel colonial en Yanahuara. Cada loseta contiene una figura de cuatro pétalos sombreados con resina oscura.
* Lado de la loseta: $L = 40 \text{ cm}$.
* Área sombreada de resina por loseta:
  $$A_s = \frac{L^2}{2}(\pi - 2) = \frac{40^2}{2}(3.1416 - 2) = \frac{1600}{2}(1.1416) = 800 \times 1.1416 \approx \mathbf{913.28 \text{ cm}^2}$$
* Esto permite cotizar con exactitud milimétrica la cantidad de resina requerida por metro cuadrado de fachada.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Conteo de Figuras)
¿Cuántos triángulos hay en total en la siguiente figura?
*(Un triángulo principal dividido por 5 líneas que parten desde el vértice superior hacia la base, generando 6 divisiones en la base).*
A) 15  
B) 18  
C) 21  
D) 24  
E) 28  

**Solución Paso a Paso:**
1. Identificamos el número de espacios simples generados sobre la base:
   $$n = 6 \text{ espacios}$$
2. Aplicamos la fórmula directa de conteo de triángulos con vértice común:
   $$\text{N.° de triángulos} = \frac{n(n + 1)}{2}$$
3. Sustituimos $n = 6$:
   $$\text{N.° de triángulos} = \frac{6(6 + 1)}{2} = \frac{6 \times 7}{2} = \frac{42}{2} = \mathbf{21}$$.  
**Clave: C**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Áreas por Traslación)
En un cuadrado $ABCD$ de $8 \text{ cm}$ de lado, se trazan sus dos diagonales y sobre cada lado se toma el punto medio, uniéndolos para formar un nuevo cuadrado interior. Si se sombrean las regiones correspondientes a los dos triángulos superiores del cuadrado interior, calcule el área sombreada.
A) $8 \text{ cm}^2$  
B) $12 \text{ cm}^2$  
C) $16 \text{ cm}^2$  
D) $20 \text{ cm}^2$  
E) $32 \text{ cm}^2$  

**Solución Paso a Paso:**
1. Calculamos el área total del cuadrado exterior:
   $$A_{\text{total}} = L^2 = 8^2 = 64 \text{ cm}^2$$
2. El cuadrado inscrito que une los puntos medios tiene un área igual a la mitad del área total:
   $$A_{\text{inscrito}} = \frac{64}{2} = 32 \text{ cm}^2$$
3. Las dos diagonales del cuadrado inscrito lo dividen en 4 triángulos congruentes de igual área:
   $$A_{\text{triángulo}} = \frac{32}{4} = 8 \text{ cm}^2$$
4. Como la región sombreada abarca exactamente dos de estos triángulos:
   $$A_s = 2 \times 8 = \mathbf{16 \text{ cm}^2}$$.  
**Clave: C**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Perímetro de Región Compuesta)
Un parque ecológico tiene la forma de un rectángulo de $60 \text{ m}$ de largo por $40 \text{ m}$ de ancho. En cada uno de sus vértices se ha construido un jardín en forma de cuadrante circular de $10 \text{ m}$ de radio. Si se desea colocar una cerca protectora únicamente alrededor de la zona recreativa central (la región remanente del rectángulo que excluye los cuatro jardines), ¿cuántos metros lineales de cerco se necesitarán?
A) $120 + 10\pi$  
B) $120 + 20\pi$  
C) $140 + 20\pi$  
D) $160 + 20\pi$  
E) $140 + 10\pi$  

**Solución Paso a Paso:**
1. Analizamos los lados rectos del rectángulo que forman el contorno central:
   - Los 2 lados largos ($60 \text{ m}$) pierden $10 \text{ m}$ en cada extremo:
     $$2 \times (60 - 2 \cdot 10) = 2 \times 40 = 80 \text{ m}$$
   - Los 2 lados anchos ($40 \text{ m}$) pierden $10 \text{ m}$ en cada extremo:
     $$2 \times (40 - 2 \cdot 10) = 2 \times 20 = 40 \text{ m}$$
   - Suma de tramos rectos: $80 + 40 = 120 \text{ m}$.
2. Analizamos los tramos curvos:
   - Hay 4 arcos de cuadrante, cada uno de radio $R = 10 \text{ m}$.
   - Los 4 cuadrantes juntos forman una **circunferencia completa** de radio $10 \text{ m}$:
     $$\text{Longitud curva} = 2\pi R = 2\pi(10) = 20\pi \text{ m}$$
3. El perímetro total del cerco será la suma de los tramos rectos más los tramos curvos:
   $$2p = \mathbf{120 + 20\pi \text{ metros}}$$.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Relaciones de Áreas)
En un triángulo $ABC$ de área $72 \text{ cm}^2$, se traza la mediana $AM$. Sobre $AM$ se ubica el punto $P$ tal que $AP = 2(PM)$. Luego se traza el segmento $CP$ y se prolonga hasta cortar al lado $AB$ en el punto $Q$. Halle el área de la región triangular $APQ$.
A) $6 \text{ cm}^2$  
B) $8 \text{ cm}^2$  
C) $12 \text{ cm}^2$  
D) $15 \text{ cm}^2$  
E) $18 \text{ cm}^2$  

**Solución Paso a Paso:**
1. Dado que $M$ es punto medio de $BC$ y $AP = 2(PM)$, el punto $P$ es el **BARICENTRO** del triángulo $ABC$ (el baricentro divide a la mediana en relación $2:1$).
2. Como $P$ es el baricentro, la recta que pasa por $C$ y $P$ prolongada hasta $AB$ es la **mediana relativa al lado $AB$**. Por lo tanto, $Q$ es el **punto medio de $AB$**.
3. Las tres medianas concurrentes en el baricentro dividen a todo triángulo en 6 regiones triangulares de áreas exactamente iguales.
4. El triángulo $APQ$ es una de esas 6 regiones fundamentales:
   $$A_{\triangle APQ} = \frac{A_{\triangle ABC}}{6} = \frac{72}{6} = \mathbf{12 \text{ cm}^2}$$.  
**Clave: C**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Lúnulas Generalizadas)
Sobre los tres lados de un triángulo rectángulo de catetos $a$ y $b$ e hipotenusa $c$, se construyen semicírculos exteriores. Luego, el semicírculo construido sobre la hipotenusa $c$ se pliega hacia adentro del triángulo cubriendo parte de él. Demuestre analíticamente y calcule el área total encerrada por las dos lúnulas resultantes en función de los catetos $a$ y $b$.
A) $\frac{a^2 + b^2}{2}$  
B) $\frac{a \cdot b}{2}$  
C) $\frac{\pi(a^2 + b^2)}{8}$  
D) $\frac{\pi \cdot a \cdot b}{4}$  
E) $\frac{(a + b)^2}{2}$  

**Solución Paso a Paso:**
1. Expresemos el área de los tres semicírculos construidos sobre los lados:
   $$S_a = \frac{1}{2} \pi \left(\frac{a}{2}\right)^2 = \frac{\pi a^2}{8}$$
   $$S_b = \frac{1}{2} \pi \left(\frac{b}{2}\right)^2 = \frac{\pi b^2}{8}$$
   $$S_c = \frac{1}{2} \pi \left(\frac{c}{2}\right)^2 = \frac{\pi c^2}{8}$$
2. Por el Teorema de Pitágoras: $a^2 + b^2 = c^2$. Multiplicando por $\frac{\pi}{8}$:
   $$\frac{\pi a^2}{8} + \frac{\pi b^2}{8} = \frac{\pi c^2}{8} \implies S_a + S_b = S_c$$
3. El área total de la figura compuesta (los dos semicírculos de los catetos más el triángulo rectángulo) es:
   $$A_{\text{figura}} = S_a + S_b + A_{\triangle}$$
4. El área de las dos lúnulas se obtiene restando el semicírculo mayor $S_c$:
   $$A_{\text{lúnulas}} = (S_a + S_b + A_{\triangle}) - S_c$$
5. Como $S_a + S_b = S_c$, estos términos se cancelan de manera exacta:
   $$A_{\text{lúnulas}} = A_{\triangle} = \frac{a \cdot b}{2}$$.  
**Clave: B**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Perímetro ($2p$):** Medida lineal continua de la frontera cerrada que delimita una región plana.
2. **Semiperímetro ($p$):** Mitad del perímetro total de una figura geométrica.
3. **Baricentro ($G$):** Punto de concurrencia de las tres medianas de un triángulo, centro de gravedad de la región planar.
4. **Lúnula:** Región geométrica plana cóncava delimitada por dos arcos circulares de radios distintos.
5. **Traslación de Regiones:** Método geométrico consistente en reubicar piezas de áreas equivalentes para completar figuras regulares.
6. **Convexidad:** Propiedad de una región plana donde cualquier segmento que une dos de sus puntos pertenece íntegramente a dicha región.
7. **Simetría Axial:** Transformación geométrica isométrica respecto a un eje recto donde cada punto y su imagen equidistan del eje.
8. **Proyección Ortogonal:** Trazado de perpendiculares desde los puntos de una figura sobre una recta o plano de referencia.
9. **Sector Circular:** Porción del círculo delimitada por dos radios y el arco correspondiente.
10. **Congruencia Geométrica:** Relación de igualdad formal entre dos figuras que tienen idéntica forma y dimensiones.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuál es la fórmula para calcular el número de segmentos en una línea con $n$ espacios consecutivos?  
  **A:** $\text{N.° de Segmentos} = \frac{n(n + 1)}{2}$.
* **Q:** ¿En cuántas partes de áreas iguales dividen las tres medianas a un triángulo?  
  **A:** Dividen al triángulo en 6 partes de áreas exactamente iguales a $\frac{A_{\text{total}}}{6}$.
* **Q:** ¿A qué equivale el área de las dos Lúnulas de Hipócrates formadas sobre los catetos de un triángulo rectángulo?  
  **A:** Equivale exactamente al área del triángulo rectángulo interior ($A_{\triangle} = \frac{a \cdot b}{2}$).
* **Q:** ¿Cuál es la fórmula para el área de una hojita (pétalo) formada por dos cuadrantes en un cuadrado de lado $L$?  
  **A:** $A_s = \frac{L^2}{2}(\pi - 2)$.
* **Q:** Si una región sombreada tiene una perforación o hueco interior, ¿cómo se calcula su perímetro?  
  **A:** Sumando el perímetro del contorno exterior MÁS el perímetro del contorno interior del hueco.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_04",
  "title": "Razonamiento Geométrico, Áreas y Perímetros",
  "required_level": 4,
  "xp_reward": 180,
  "gems_reward": 22,
  "skills": ["Traslación de Áreas", "Conteo Inductivo", "Perímetros Compuestos"],
  "boss_challenge": {
    "boss_name": "El Arquitecto del Laberinto",
    "question": "En un triángulo de área 72 cm^2, las 3 medianas concurren en el baricentro G. ¿Cuál es el área del triángulo formado por un vértice, el punto medio de un lado adyacente y el baricentro?",
    "options": ["6 cm^2", "8 cm^2", "12 cm^2", "18 cm^2"],
    "correct_index": 2,
    "explanation": "Las 3 medianas dividen al triángulo en 6 regiones de áreas idénticas. El área de cada región elemental es 72 / 6 = 12 cm^2."
  }
}
```
