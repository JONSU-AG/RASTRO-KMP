## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
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
