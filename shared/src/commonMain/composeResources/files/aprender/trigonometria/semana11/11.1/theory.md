## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Detalle |
| :--- | :--- |
| **Eje Temático** | 02. Matemática |
| **Área Disciplinar** | Análisis Matemático y Funciones Trascendentes |
| **Nivel de Complejidad** | Avanzado (Estándar CEPREUNSA, UNMSM-DECO, UNI) |
| **Ponderación UNSA** | Ingenierías: 1.6583 pts \| Biomédicas: 1.2654 pts \| Sociales: 0.8245 pts |
| **Tiempo Estimado de Estudio** | 4.5 a 5.5 horas |
| **Prerrequisitos** | Funciones Inversas, Biyectividad, Funciones Trigonométricas Directas y Radianes |

### Competencias Clave del Prospecto
1. **Comprensión de Dominios y Rangos Restringidos:** Dominar los intervalos de existencia y los rangos principales de las funciones arco seno, arco coseno y arco tangente.
2. **Propiedades de Paridad y Simetría:** Aplicar las identidades para argumentos negativos (\arcsin(-x) = -\arcsin x y \arccos(-x) = \pi - \arccos x).
3. **Manejo de Arcos Complementarios:** Utilizar la suma fundamental \arcsin(x) + \arccos(x) = \frac{\pi}{2} y \arctan(x) + \text{arccot}(x) = \frac{\pi}{2}.
4. **Composición de Funciones y Despeje Triangular:** Resolver composiciones del tipo \arcsin(\sin\theta) cuando \theta excede el rango principal y sumar arcos mediante la fórmula de la tangente compuesta.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A[Funciones Trigonométricas Inversas] --> B[Función Arco Seno: arcsin x]
    A --> C[Función Arco Coseno: arccos x]
    A --> D[Función Arco Tangente: arctan x]
    A --> E[Propiedades Fundamentales]
    A --> F[Adición de Arcos: Teorema de Euler]

    B --> B1[Dom: [-1, 1], Ran: [-π/2, π/2]]
    B --> B2[Impar: arcsin -x = -arcsin x]

    C --> C1[Dom: [-1, 1], Ran: [0, π]]
    C --> C2[Suplementaria: arccos -x = π - arccos x]

    D --> D1[Dom: R, Ran: <-π/2, π/2>]
    D --> D2[Asíntotas Horizontales: y = ± π/2]

    E --> E1[Arcos Complementarios: arcsin x + arccos x = π/2]
    E --> E2[Composición Directa: sen arcsin x = x]
    E --> E3[Composición Inversa: arcsin sen θ = θ solo en el rango]

    F --> F1[arctan x + arctan y = arctan x+y / 1-xy para xy < 1]
    F --> F2[Cambio de Arco mediante Triángulo Auxiliar]
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1. Concepto y Necesidad de Restricción
Dado que las funciones trigonométricas directas son periódicas, **no son inyectivas** en todo su dominio real; por tanto, no admiten función inversa global.
Para construir la función inversa, es matemáticamente obligatorio **restringir el dominio** a un intervalo cerrado donde la función sea estrictamente monótona (creciente o decreciente) y continua, garantizando su **biyectividad**:
y = \text{arc R.T.}(x) \iff \text{R.T.}(y) = x \quad \text{con } y \in \text{Ran}(\text{arc R.T.})

*Interpretación Semántica:* \arcsin(x) se lee literalmente: *"El arco (o ángulo en radianes) cuyo seno es x"*.

---

### 3.2. Las Tres Funciones Inversas Principales

#### 1. Función Arco Seno: y = \arcsin(x) = \sin^{-1}(x)
- **Definición:** y = \arcsin(x) \iff \sin(y) = x.
- **Dominio:** \text{Dom} = [-1, 1].
- **Rango (Intervalo Principal):** \text{Ran} = \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right].
- **Monotonía:** Estrictamente creciente en todo su dominio [-1, 1].
- **Paridad:** Función impar:
  \arcsin(-x) = -\arcsin(x)
- **Valores Notables:**
  \arcsin(0) = 0, \quad \arcsin(1) = \frac{\pi}{2}, \quad \arcsin(-1) = -\frac{\pi}{2}, \quad \arcsin\left(\frac{1}{2}\right) = \frac{\pi}{6}

#### 2. Función Arco Coseno: y = \arccos(x) = \cos^{-1}(x)
- **Definición:** y = \arccos(x) \iff \cos(y) = x.
- **Dominio:** \text{Dom} = [-1, 1].
- **Rango (Intervalo Principal):** \text{Ran} = [0, \pi].
- **Monotonía:** Estrictamente decreciente en todo su dominio.
- **Propiedad para Argumentos Negativos:**
  \arccos(-x) = \pi - \arccos(x)
- **Valores Notables:**
  \arccos(1) = 0, \quad \arccos(0) = \frac{\pi}{2}, \quad \arccos(-1) = \pi, \quad \arccos\left(\frac{1}{2}\right) = \frac{\pi}{3}, \quad \arccos\left(-\frac{1}{2}\right) = \frac{2\pi}{3}

#### 3. Función Arco Tangente: y = \arctan(x) = \tan^{-1}(x)
- **Definición:** y = \arctan(x) \iff \tan(y) = x.
- **Dominio:** \text{Dom} = \mathbb{R} = \langle -\infty, +\infty \rangle.
- **Rango (Intervalo Principal):** \text{Ran} = \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle.
- **Monotonía:** Estrictamente creciente en todo \mathbb{R}.
- **Paridad:** Función impar:
  \arctan(-x) = -\arctan(x)
- **Asíntotas Horizontales:** Rectas y = \dfrac{\pi}{2} (cuando x \to +\infty) e y = -\dfrac{\pi}{2} (cuando x \to -\infty).
- **Valores Notables:**
  \arctan(0) = 0, \quad \arctan(1) = \frac{\pi}{4}, \quad \arctan(-1) = -\frac{\pi}{4}, \quad \arctan(\sqrt{3}) = \frac{\pi}{3}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO (LATEX ESTRICTO)

| Función Inversa | Dominio | Rango | Simetría / Paridad |
| :--- | :--- | :--- | :--- |
| **\arcsin(x)** | [-1, 1] | \left[-\dfrac{\pi}{2}, \dfrac{\pi}{2}\right] | \arcsin(-x) = -\arcsin(x) |
| **\arccos(x)** | [-1, 1] | [0, \pi] | \arccos(-x) = \pi - \arccos(x) |
| **\arctan(x)** | \mathbb{R} | \left\langle -\dfrac{\pi}{2}, \dfrac{\pi}{2} \right\rangle| \arctan(-x) = -\arctan(x) |
| **\text{arccot}(x)**| \mathbb{R} | \langle 0, \pi \rangle | \text{arccot}(-x) = \pi - \text{arccot}(x) |
