package razonamiento_matematico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoMatematicoSemana02 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rm_t02_s01",
            title = "MAGNITUDES Y PROPORCIONALIDAD - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "MAGNITUDES Y PROPORCIONALIDAD - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Razones aritméticas/geométricas, porcentajes, descuentos/aumentos sucesivos, reparto proporcional y regla de tres simple/compuesta. | Intermedio | ⭐⭐⭐⭐⭐ (Infaltable) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas de rendimiento laboral, mezclas comerciales, inflación, escalas de mapas y rendimientos de combustible. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Ruedas dentadas (engranajes), magnitudes proporcionales combinadas con funciones f(x), análisis dimensional y sistemas de tuberías. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar situaciones problemáticas que involucren razones aritméticas y geométricas.
2. Comparar y relacionar magnitudes continuas y discretas en diversos contextos técnicos y cotidianos.
3. Interpretar y aplicar el cálculo de porcentajes, variaciones porcentuales y aplicaciones comerciales.
4. Establecer relaciones geométricas mediante escalas y proporcionalidad directa e inversa.
5. Deducir situaciones de variación directa e inversa resolviendo problemas mediante métodos analíticos y sintéticos.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Razón Aritmética (Diferencia: a - b = r)
        ┌─ 1. Razones y ───────┼─ Razón Geométrica (Cociente: a / b = k)
        │      Proporciones    ├─ Proporción Discreta (Cuatro términos distintos)
        │                      └─ Proporción Continua (Términos medios iguales)
        │
MAGNITUDES                     ┌─ Magnitud Directamente Proporcional (D.P. -> Cociente constante)
Y PROPORCIONALIDAD ─┼─ 2. Magnitudes ──┼─ Magnitud Inversamente Proporcional (I.P. -> Producto constante)
        │      Relacionadas    ├─ Propiedades Fundamentales y Engranajes
        │                      └─ Reparto Proporcional (Simple y Compuesto)
        │
        │                      ┌─ Regla de Tres Simple (Directa e Inversa)
        ├─ 3. Métodos de ──────┼─ Regla de Tres Compuesta (Método Causa-Circunstancia-Efecto)
        │      Resolución      └─ Escalas Cartográficas (Plano vs. Terreno)
        │
        └─ 4. Tanto por ───────┌─ Variaciones Porcentuales y Operaciones Básicas
               Ciento          ├─ Aumentos y Descuentos Sucesivos
               Comercial       └─ Aplicaciones Comerciales (Pv, Pc, Ganancia, Pérdida)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Magnitud y Cantidad
* **Magnitud:** Todo aquello susceptible de ser medido, comparado y que experimenta variación de intensidad (ej. longitud, tiempo, masa, rapidez, número de obreros).
* **Cantidad:** Medida temporal o estado particular de una magnitud en un instante dado, expresada con un valor numérico y una unidad de medida (ej. 15 \text{ m}, 4 \text{ horas}, 8 \text{ obreros}).

---

### 3.2 Razones y Proporciones
1. **Razón Aritmética (r):** Comparación por sustracción.
   a - b = r \quad (a: \text{antecedente}, \quad b: \text{consecuente})
2. **Razón Geométrica (k):** Comparación por división.
   \frac{a}{b} = k \quad (b \neq 0)
3. **Proporción Geométrica:** Igualdad de dos razones geométricas.
   \frac{a}{b} = \frac{c}{d}
   * **Discreta:** Todos los términos son diferentes (b \neq c). El término d se llama **cuarta proporcional**.
   * **Continua:** Los términos medios son iguales (\frac{a}{b} = \frac{b}{c}).
     * b = \sqrt{a \cdot c} es la **media geométrica** o **media proporcional**.
     * c es la **tercera proporcional**.

---

### 3.3 Magnitudes Directa e Inversamente Proporcionales

#### A. Magnitudes Directamente Proporcionales (A \text{ D.P. } B)
Dos magnitudes son directamente proporcionales cuando al multiplicar o dividir a una de ellas por un número real positivo, la otra queda multiplicada o dividida por el mismo número. Su cociente permanece constante:
\frac{A}{B} = k \quad (\text{Constante})

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE APLICACIONES

### 4.1 Método Preuniversitario Causa - Circunstancia - Efecto (Regla de Tres Compuesta)
En lugar de multiplicar signos confusos (+ y -), se divide el problema en tres columnas fijas:

| 1. CAUSA (Los que realizan el trabajo) | 2. CIRCUNSTANCIA (Condiciones de tiempo) | 3. EFECTO (La obra y su resistencia) |
| :---: | :---: | :---: |
| Obreros, Máquinas, Animales, Habilidad, Rendimiento | Días, Horas diarias, Raciones, Eficiencia | Obra (m^3, m^2, volumen), Dificultad |

\frac{\text{(Causa)} \cdot \text{(Circunstancia)}}{\text{Efecto}} = \text{Constante}
\frac{\text{Obreros} \cdot \text{Rendimiento} \cdot \text{Días} \cdot \text{Horas/día}}{\text{Obra} \cdot \text{Dificultad}} = k

---

### 4.2 Fórmulas de Aplicaciones Comerciales (Porcentajes)

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t02_s01_c01",
                    question = "Las edades de dos hermanos están en la relación de 5 a 3. Si dentro de 8 años la suma de sus edades será de 48 años, ¿cuál es la edad actual del hermano menor?",
                    options = listOf(
                        "12 años",
                        "15 años",
                        "18 años",
                        "20 años"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t02_s01_c02",
                    question = "En una tienda de Arequipa se ofrece un descuento del 20\\% por liquidación de temporada, y si el pago es en efectivo, se aplica un descuento adicional del 10\\% sobre lo que queda por pagar. Si un cliente compra una casaca cuyo precio original era de S/.\\, 250, ¿cuánto pagó en efectivo?",
                    options = listOf(
                        "S/.\\, 175",
                        "S/.\\, 180",
                        "S/.\\, 190",
                        "S/.\\, 160"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t02_s01_c03",
                    question = "Una cuadrilla de 15 obreros, trabajando 8 horas diarias durante 12 días, puede asfaltar una avenida de 600 metros con una dificultad de grado 2. ¿Cuántos días necesitarán 20 obreros, que son 50\\% más eficientes que los anteriores, trabajando 6 horas diarias para asfaltar una avenida de 900 metros con una dificultad de grado 3?",
                    options = listOf(
                        "8 días",
                        "9 días",
                        "12 días",
                        "15 días"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t02_s01_c04",
                    question = "Si A es D.P. a B, ¿qué operación permanece matemáticamente constante?",
                    options = listOf(
                        "Son inversamente proporcionales: \\text{Dientes}_A \\cdot \\text{Vueltas}_A = \\text{Dientes}_B \\cdot \\text{Vueltas}_B.",
                        "D_u = (20 + 10 - \\frac{20 \\cdot 10}{100})\\% = 28\\%.",
                        "Valor o condición no aplicable al caso planteado",
                        "La división: \\frac{A}{B} = k."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: La división: \\frac{A}{B} = k."
                ),
                Challenge(
                    id = "rm_t02_s01_c05",
                    question = "Si dos ruedas dentadas están engranadas, ¿qué relación existe entre sus vueltas y sus dientes?",
                    options = listOf(
                        "Son inversamente proporcionales: \\text{Dientes}_A \\cdot \\text{Vueltas}_A = \\text{Dientes}_B \\cdot \\text{Vueltas}_B.",
                        "La división: \\frac{A}{B} = k.",
                        "D_u = (20 + 10 - \\frac{20 \\cdot 10}{100})\\% = 28\\%.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 0,
                    explanation = "Conforme a la fundamentación teórica de la lección: Son inversamente proporcionales: \\text{Dientes}_A \\cdot \\text{Vueltas}_A = \\text{Dientes}_B \\cdot \\text{Vueltas}_B."
                ),
                Challenge(
                    id = "rm_t02_s01_c06",
                    question = "¿Cuál es la fórmula para el descuento único de dos descuentos del 20\\% y 10\\%?",
                    options = listOf(
                        "La división: \\frac{A}{B} = k.",
                        "D_u = (20 + 10 - \\frac{20 \\cdot 10}{100})\\% = 28\\%.",
                        "Son inversamente proporcionales: \\text{Dientes}_A \\cdot \\text{Vueltas}_A = \\text{Dientes}_B \\cdot \\text{Vueltas}_B.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 1,
                    explanation = "Conforme a la fundamentación teórica de la lección: D_u = (20 + 10 - \\frac{20 \\cdot 10}{100})\\% = 28\\%."
                ),
                Challenge(
                    id = "rm_t02_s01_c07",
                    question = "Un diamante de S/. 32,000 se rompe en pedazos de masas en relación 3 a 5. Si el precio es D.P. al cuadrado de la masa, ¿cuánto dinero se perdió?",
                    options = listOf(
                        "S/. 12,000",
                        "S/. 15,000",
                        "S/. 17,000",
                        "S/. 20,000"
                    ),
                    correctIndex = 1,
                    explanation = "La masa inicial es 8m (precio 64km^2 = 32000 => km^2 = 500). Los pedazos valen 9(500) y 25(500), sumando S/. 17,000. Pérdida: 32000 - 17000 = S/. 15,000."
                ),
                Challenge(
                    id = "rm_t02_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "rm_t02_s02",
            title = "MAGNITUDES Y PROPORCIONALIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "MAGNITUDES Y PROPORCIONALIDAD - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* **Gráfica:** Línea recta que pasa por el origen de coordenadas (0,0).

#### B. Magnitudes Inversamente Proporcionales (A \text{ I.P. } B)
Dos magnitudes son inversamente proporcionales cuando al multiplicar una de ellas por un número real positivo, la otra queda dividida por ese mismo número. Su producto permanece constante:
A \cdot B = k \quad (\text{Constante})
* **Gráfica:** Rama de una hipérbola equilátera en el primer cuadrante.

#### C. Teorema de Proporcionalidad Compuesta
Si una magnitud A depende de varias magnitudes B, C y D:
* Si A \text{ D.P. } B (manteniendo fijas C y D).
* Si A \text{ I.P. } C (manteniendo fijas B y D).
* Si A \text{ D.P. } D (manteniendo fijas B y C).
Entonces se cumple la ecuación general:
\frac{A \cdot C}{B \cdot D} = \text{Constante}

---

### 3.4 Sistema de Engranajes y Ruedas Dentadas (Alta Frecuencia UNI/UNSA)
1. **Ruedas en Contacto o Engranadas:**
   Giran en sentidos opuestos. El producto del número de dientes (D) por el número de vueltas (V) es constante:
   D_A \cdot V_A = D_B \cdot V_B \quad \implies \quad \text{Dientes} \text{ I.P. } \text{Vueltas}
2. **Ruedas Unidas por un Mismo Eje (Concéntricas):**
   Giran en el mismo sentido y dan exactamente el mismo número de vueltas:
   V_A = V_B

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
1. **Precio de Venta con Ganancia:**
   P_v = P_c + G
   *(Si el problema no dice lo contrario, la ganancia siempre se calcula respecto al precio de costo: G = x\% P_c).*
2. **Precio de Venta con Pérdida:**
   P_v = P_c - P
3. **Precio Fijado (o Precio de Lista):**
   P_f = P_v + D \quad (D: \text{Descuento})
   *(El descuento siempre se calcula respecto al precio fijado: D = d\% P_f).*
4. **Descuento Único (D_u) equivalente a dos descuentos sucesivos (d_1\% y d_2\%):**
   D_u = \left( d_1 + d_2 - \frac{d_1 \cdot d_2}{100} \right)\%
5. **Aumento Único (A_u) equivalente a dos aumentos sucesivos (a_1\% y a_2\%):**
   A_u = \left( a_1 + a_2 + \frac{a_1 \cdot a_2}{100} \right)\%

---


### 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del "100 Ficticio" en Problemas de Variación Porcentual
Cuando un problema pregunta en qué porcentaje varía el área de una figura geométrica y no te dan datos numéricos:
* **Nunca uses variables x ni y.** Asume que las dimensiones originales valen 10 o 100.
* *Ejemplo:* La base de un rectángulo aumenta en 20\% y la altura disminuye en 10\%.
  1. Área inicial imaginaria: 10 \times 10 = \mathbf{100}.
  2. Base nueva: 10 + 2 = 12.
  3. Altura nueva: 10 - 1 = 9.
  4. Área nueva: 12 \times 9 = \mathbf{108}.
  5. Conclusión inmediata: Como pasó de 100 a 108, **aumentó en 8\%**. (Tiempo de resolución: 6 segundos).

---


### 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para Magnitudes Proporcionales
> **"D.P. se DIVIDE, I.P. se IMPLICA (MULTIPLICA)"**  
> * **D.P.** \implies **D**ivisión (\frac{A}{B} = k).  
> * **I.P.** \implies **P**roducto (A \cdot B = k).

### Mnemotecnia 2: Regla de Tres Compuesta
> **"TODO SE MULTIPLICA ARRIBA, EXCEPTO LA OBRA Y SU DIFICULTAD"**  
> Arriba pones: (Obreros) × (Días) × (Horas/día) × (Rendimiento).  
> Abajo divides únicamente entre: (Medida de la Obra) × (Dificultad).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **"Disminuye en 20\%" vs. "Disminuye al 20\%":**
   * *Disminuye en 20\%:* Queda el 80\% de la cantidad original (100\% - 20\%).
   * *Disminuye al 20\%:* Queda únicamente el 20\% de la cantidad original.
2. ⚠️ **El descuento se aplica sobre el Precio de Lista, NO sobre el Costo:**
   * Muchos alumnos calculan el descuento sobre el costo P_c y fallan automáticamente. El descuento solo afecta al P_f que ve el cliente en vitrina.
3. ⚠️ **Obreros que se retiran o rinden distinto a mitad de obra:**
   * La obra debe partirse en dos etapas cronológicas y sumarse:
     \text{Obra Total} = \text{Obra parte 1} + \text{Obra parte 2}

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Caudales en la Irrigación de Majes (Arequipa)
En el proyecto Majes-Siguas, se derivan aguas del río Colca para abastecer 3 secciones agrícolas cuyas áreas de cultivo son 120 \text{ ha}, 180 \text{ ha} y 300 \text{ ha}. El volumen total de agua disponible por turno de riego es de 18,000 \text{ m}^3.
* El reparto de caudal debe ser directamente proporcional al área de cultivo.
* Constante: 120k + 180k + 300k = 18,000 \implies 600k = 18,000 \implies k = 30 \text{ m}^3/\text{ha}.
* Asignación:
  - Parcela 1: 120 \times 30 = \mathbf{3,600 \text{ m}^3}.
  - Parcela 2: 180 \times 30 = \mathbf{5,400 \text{ m}^3}.
  - Parcela 3: 300 \times 30 = \mathbf{9,000 \text{ m}^3}.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rm_t02_s02_c01",
                    question = "Un sistema mecánico está compuesto por tres engranajes A, B y C. La rueda A tiene 24 dientes y está engranada con la rueda B de 36 dientes. A su vez, la rueda B comparte el mismo eje de rotación con la rueda C de 15 dientes. Si la rueda A da 90 vueltas en un minuto, ¿cuántas vueltas dará la rueda C en ese mismo tiempo?",
                    options = listOf(
                        "45 vueltas",
                        "60 vueltas",
                        "75 vueltas",
                        "90 vueltas"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c02",
                    question = "Se sabe que el valor de una joya es directamente proporcional al cuadrado de su masa. Un diamante que costaba S/.\\, 32,000 se parte accidentalmente en dos pedazos cuyas masas están en la relación de 3 a 5. ¿Cuánto dinero se perdió debido a este accidente?",
                    options = listOf(
                        "S/.\\, 12,000",
                        "S/.\\, 15,000",
                        "S/.\\, 17,000",
                        "S/.\\, 18,000"
                    ),
                    correctIndex = 0,
                    explanation = "Resolución conforme a las leyes y métodos expuestos en la teoría de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c03",
                    question = "En la regla de tres compuesta, ¿qué elementos van en el denominador (efecto)?",
                    options = listOf(
                        "Son exactamente iguales (V_A = V_B), sin importar cuántos dientes tenga cada una.",
                        "Valor o condición no aplicable al caso planteado",
                        "Exclusivamente la medida de la obra realizada y su dificultad intrínseca.",
                        "Valor o condición no aplicable al caso planteado"
                    ),
                    correctIndex = 2,
                    explanation = "Conforme a la fundamentación teórica de la lección: Exclusivamente la medida de la obra realizada y su dificultad intrínseca."
                ),
                Challenge(
                    id = "rm_t02_s02_c04",
                    question = "Si dos ruedas giran sobre el mismo eje, ¿qué ocurre con sus números de vueltas?",
                    options = listOf(
                        "Exclusivamente la medida de la obra realizada y su dificultad intrínseca.",
                        "Valor o condición no aplicable al caso planteado",
                        "Valor o condición no aplicable al caso planteado",
                        "Son exactamente iguales (V_A = V_B), sin importar cuántos dientes tenga cada una."
                    ),
                    correctIndex = 3,
                    explanation = "Conforme a la fundamentación teórica de la lección: Son exactamente iguales (V_A = V_B), sin importar cuántos dientes tenga cada una."
                ),
                Challenge(
                    id = "rm_t02_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "rm_t02_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
