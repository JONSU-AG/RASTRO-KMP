# TEMA 02 · MAGNITUDES Y PROPORCIONALIDAD
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Matemático  
**Código del Tema:** `APT_RM_02`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Enfoque DECO comercial/productivo] [UNI: Modelación con magnitudes compuestas y engranajes]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Razones aritméticas/geométricas, porcentajes, descuentos/aumentos sucesivos, reparto proporcional y regla de tres simple/compuesta. | Intermedio | ⭐⭐⭐⭐⭐ (Infaltable) |
| **UNMSM** (San Marcos) | Enfoque DECO: problemas de rendimiento laboral, mezclas comerciales, inflación, escalas de mapas y rendimientos de combustible. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Ruedas dentadas (engranajes), magnitudes proporcionales combinadas con funciones $f(x)$, análisis dimensional y sistemas de tuberías. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

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

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Magnitud y Cantidad
* **Magnitud:** Todo aquello susceptible de ser medido, comparado y que experimenta variación de intensidad (ej. longitud, tiempo, masa, rapidez, número de obreros).
* **Cantidad:** Medida temporal o estado particular de una magnitud en un instante dado, expresada con un valor numérico y una unidad de medida (ej. $15 \text{ m}$, $4 \text{ horas}$, $8 \text{ obreros}$).

---

### 3.2 Razones y Proporciones
1. **Razón Aritmética ($r$):** Comparación por sustracción.
   $$a - b = r \quad (a: \text{antecedente}, \quad b: \text{consecuente})$$
2. **Razón Geométrica ($k$):** Comparación por división.
   $$\frac{a}{b} = k \quad (b \neq 0)$$
3. **Proporción Geométrica:** Igualdad de dos razones geométricas.
   $$\frac{a}{b} = \frac{c}{d}$$
   * **Discreta:** Todos los términos son diferentes ($b \neq c$). El término $d$ se llama **cuarta proporcional**.
   * **Continua:** Los términos medios son iguales ($\frac{a}{b} = \frac{b}{c}$).
     * $b = \sqrt{a \cdot c}$ es la **media geométrica** o **media proporcional**.
     * $c$ es la **tercera proporcional**.

---

### 3.3 Magnitudes Directa e Inversamente Proporcionales

#### A. Magnitudes Directamente Proporcionales ($A \text{ D.P. } B$)
Dos magnitudes son directamente proporcionales cuando al multiplicar o dividir a una de ellas por un número real positivo, la otra queda multiplicada o dividida por el mismo número. Su cociente permanece constante:
$$\frac{A}{B} = k \quad (\text{Constante})$$
* **Gráfica:** Línea recta que pasa por el origen de coordenadas $(0,0)$.

#### B. Magnitudes Inversamente Proporcionales ($A \text{ I.P. } B$)
Dos magnitudes son inversamente proporcionales cuando al multiplicar una de ellas por un número real positivo, la otra queda dividida por ese mismo número. Su producto permanece constante:
$$A \cdot B = k \quad (\text{Constante})$$
* **Gráfica:** Rama de una hipérbola equilátera en el primer cuadrante.

#### C. Teorema de Proporcionalidad Compuesta
Si una magnitud $A$ depende de varias magnitudes $B$, $C$ y $D$:
* Si $A \text{ D.P. } B$ (manteniendo fijas $C$ y $D$).
* Si $A \text{ I.P. } C$ (manteniendo fijas $B$ y $D$).
* Si $A \text{ D.P. } D$ (manteniendo fijas $B$ y $C$).
Entonces se cumple la ecuación general:
$$\frac{A \cdot C}{B \cdot D} = \text{Constante}$$

---

### 3.4 Sistema de Engranajes y Ruedas Dentadas (Alta Frecuencia UNI/UNSA)
1. **Ruedas en Contacto o Engranadas:**
   Giran en sentidos opuestos. El producto del número de dientes ($D$) por el número de vueltas ($V$) es constante:
   $$D_A \cdot V_A = D_B \cdot V_B \quad \implies \quad \text{Dientes} \text{ I.P. } \text{Vueltas}$$
2. **Ruedas Unidas por un Mismo Eje (Concéntricas):**
   Giran en el mismo sentido y dan exactamente el mismo número de vueltas:
   $$V_A = V_B$$

---

## 4. 📐 FORMULARIO MAESTRO DE APLICACIONES

### 4.1 Método Preuniversitario Causa - Circunstancia - Efecto (Regla de Tres Compuesta)
En lugar de multiplicar signos confusos ($+$ y $-$), se divide el problema en tres columnas fijas:

| 1. CAUSA (Los que realizan el trabajo) | 2. CIRCUNSTANCIA (Condiciones de tiempo) | 3. EFECTO (La obra y su resistencia) |
| :---: | :---: | :---: |
| Obreros, Máquinas, Animales, Habilidad, Rendimiento | Días, Horas diarias, Raciones, Eficiencia | Obra ($m^3$, $m^2$, volumen), Dificultad |

$$\frac{\text{(Causa)} \cdot \text{(Circunstancia)}}{\text{Efecto}} = \text{Constante}$$
$$\frac{\text{Obreros} \cdot \text{Rendimiento} \cdot \text{Días} \cdot \text{Horas/día}}{\text{Obra} \cdot \text{Dificultad}} = k$$

---

### 4.2 Fórmulas de Aplicaciones Comerciales (Porcentajes)
1. **Precio de Venta con Ganancia:**
   $$P_v = P_c + G$$
   *(Si el problema no dice lo contrario, la ganancia siempre se calcula respecto al precio de costo: $G = x\% P_c$).*
2. **Precio de Venta con Pérdida:**
   $$P_v = P_c - P$$
3. **Precio Fijado (o Precio de Lista):**
   $$P_f = P_v + D \quad (D: \text{Descuento})$$
   *(El descuento siempre se calcula respecto al precio fijado: $D = d\% P_f$).*
4. **Descuento Único ($D_u$) equivalente a dos descuentos sucesivos ($d_1\%$ y $d_2\%$):**
   $$D_u = \left( d_1 + d_2 - \frac{d_1 \cdot d_2}{100} \right)\%$$
5. **Aumento Único ($A_u$) equivalente a dos aumentos sucesivos ($a_1\%$ y $a_2\%$):**
   $$A_u = \left( a_1 + a_2 + \frac{a_1 \cdot a_2}{100} \right)\%$$

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: Para Magnitudes Proporcionales
> **"D.P. se DIVIDE, I.P. se IMPLICA (MULTIPLICA)"**  
> * **D.P.** $\implies$ **D**ivisión ($\frac{A}{B} = k$).  
> * **I.P.** $\implies$ **P**roducto ($A \cdot B = k$).

### Mnemotecnia 2: Regla de Tres Compuesta
> **"TODO SE MULTIPLICA ARRIBA, EXCEPTO LA OBRA Y SU DIFICULTAD"**  
> Arriba pones: (Obreros) × (Días) × (Horas/día) × (Rendimiento).  
> Abajo divides únicamente entre: (Medida de la Obra) × (Dificultad).

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del "100 Ficticio" en Problemas de Variación Porcentual
Cuando un problema pregunta en qué porcentaje varía el área de una figura geométrica y no te dan datos numéricos:
* **Nunca uses variables $x$ ni $y$.** Asume que las dimensiones originales valen $10$ o $100$.
* *Ejemplo:* La base de un rectángulo aumenta en $20\%$ y la altura disminuye en $10\%$.
  1. Área inicial imaginaria: $10 \times 10 = \mathbf{100}$.
  2. Base nueva: $10 + 2 = 12$.
  3. Altura nueva: $10 - 1 = 9$.
  4. Área nueva: $12 \times 9 = \mathbf{108}$.
  5. Conclusión inmediata: Como pasó de $100$ a $108$, **aumentó en $8\%$**. (Tiempo de resolución: 6 segundos).

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **"Disminuye en $20\%$" vs. "Disminuye al $20\%$":**
   * *Disminuye en $20\%$:* Queda el $80\%$ de la cantidad original ($100\% - 20\%$).
   * *Disminuye al $20\%$:* Queda únicamente el $20\%$ de la cantidad original.
2. ⚠️ **El descuento se aplica sobre el Precio de Lista, NO sobre el Costo:**
   * Muchos alumnos calculan el descuento sobre el costo $P_c$ y fallan automáticamente. El descuento solo afecta al $P_f$ que ve el cliente en vitrina.
3. ⚠️ **Obreros que se retiran o rinden distinto a mitad de obra:**
   * La obra debe partirse en dos etapas cronológicas y sumarse:
     $$\text{Obra Total} = \text{Obra parte 1} + \text{Obra parte 2}$$

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Distribución de Caudales en la Irrigación de Majes (Arequipa)
En el proyecto Majes-Siguas, se derivan aguas del río Colca para abastecer 3 secciones agrícolas cuyas áreas de cultivo son $120 \text{ ha}$, $180 \text{ ha}$ y $300 \text{ ha}$. El volumen total de agua disponible por turno de riego es de $18,000 \text{ m}^3$.
* El reparto de caudal debe ser directamente proporcional al área de cultivo.
* Constante: $120k + 180k + 300k = 18,000 \implies 600k = 18,000 \implies k = 30 \text{ m}^3/\text{ha}$.
* Asignación:
  - Parcela 1: $120 \times 30 = \mathbf{3,600 \text{ m}^3}$.
  - Parcela 2: $180 \times 30 = \mathbf{5,400 \text{ m}^3}$.
  - Parcela 3: $300 \times 30 = \mathbf{9,000 \text{ m}^3}$.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Razones Proporcionales)
Las edades de dos hermanos están en la relación de $5$ a $3$. Si dentro de $8$ años la suma de sus edades será de $48$ años, ¿cuál es la edad actual del hermano menor?
A) 12 años  
B) 15 años  
C) 18 años  
D) 20 años  
E) 10 años  

**Solución Paso a Paso:**
1. Definimos las edades actuales en función de una constante $k$:
   - Hermano mayor: $5k$
   - Hermano menor: $3k$
2. Dentro de 8 años, cada uno tendrá: $(5k + 8)$ y $(3k + 8)$.
3. Planteamos la ecuación de la suma:
   $$(5k + 8) + (3k + 8) = 48$$
   $$8k + 16 = 48 \implies 8k = 32 \implies \mathbf{k = 4}$$
4. La edad actual del hermano menor es:
   $$\text{Edad menor} = 3k = 3(4) = \mathbf{12 \text{ años}}$$.  
**Clave: A**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Descuentos Sucesivos)
En una tienda de Arequipa se ofrece un descuento del $20\%$ por liquidación de temporada, y si el pago es en efectivo, se aplica un descuento adicional del $10\%$ sobre lo que queda por pagar. Si un cliente compra una casaca cuyo precio original era de $S/.\, 250$, ¿cuánto pagó en efectivo?
A) $S/.\, 175$  
B) $S/.\, 180$  
C) $S/.\, 190$  
D) $S/.\, 160$  
E) $S/.\, 170$  

**Solución Paso a Paso:**
1. Calculamos el descuento único equivalente:
   $$D_u = \left( 20 + 10 - \frac{20 \times 10}{100} \right)\% = (30 - 2)\% = 28\%$$
2. Si el descuento total es de $28\%$, el cliente paga el $100\% - 28\% = 72\%$ del precio:
   $$\text{Pago Final} = 72\% \text{ de } 250 = \frac{72}{100} \times 250 = \frac{72 \times 5}{2} = 36 \times 5 = \mathbf{S/.\, 180}$$.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Rendimiento y Regla de Tres)
Una cuadrilla de 15 obreros, trabajando 8 horas diarias durante 12 días, puede asfaltar una avenida de 600 metros con una dificultad de grado 2. ¿Cuántos días necesitarán 20 obreros, que son $50\%$ más eficientes que los anteriores, trabajando 6 horas diarias para asfaltar una avenida de 900 metros con una dificultad de grado 3?
A) 8 días  
B) 9 días  
C) 12 días  
D) 15 días  
E) 18 días  

**Solución Paso a Paso:**
1. Aplicamos la fórmula Causa-Circunstancia-Efecto:
   $$\frac{\text{Obreros} \cdot \text{Eficiencia} \cdot \text{Días} \cdot \text{Horas/día}}{\text{Obra} \cdot \text{Dificultad}} = \text{Constante}$$
2. Datos Caso 1:
   - Obreros = $15$, Eficiencia = $100$ (o base $2$), Días = $12$, Horas/día = $8$.
   - Obra = $600$, Dificultad = $2$.
3. Datos Caso 2:
   - Obreros = $20$, Eficiencia = $150$ (o base $3$), Días = $x$, Horas/día = $6$.
   - Obra = $900$, Dificultad = $3$.
4. Igualamos:
   $$\frac{15 \cdot 2 \cdot 12 \cdot 8}{600 \cdot 2} = \frac{20 \cdot 3 \cdot x \cdot 6}{900 \cdot 3}$$
   $$\frac{2880}{1200} = \frac{360 \cdot x}{2700}$$
   $$\frac{12}{5} = \frac{2 \cdot x}{15}$$
5. Despejamos $x$:
   $$2x = \frac{12 \cdot 15}{5} = 12 \cdot 3 = 36 \implies x = \mathbf{18 \text{ días}}$$.  
**Clave: E**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Engranajes)
Un sistema mecánico está compuesto por tres engranajes $A$, $B$ y $C$. La rueda $A$ tiene 24 dientes y está engranada con la rueda $B$ de 36 dientes. A su vez, la rueda $B$ comparte el mismo eje de rotación con la rueda $C$ de 15 dientes. Si la rueda $A$ da 90 vueltas en un minuto, ¿cuántas vueltas dará la rueda $C$ en ese mismo tiempo?
A) 45 vueltas  
B) 60 vueltas  
C) 75 vueltas  
D) 90 vueltas  
E) 120 vueltas  

**Solución Paso a Paso:**
1. Como la rueda $A$ está engranada con $B$, se cumple:
   $$D_A \cdot V_A = D_B \cdot V_B$$
   $$24 \cdot 90 = 36 \cdot V_B \implies 2160 = 36 \cdot V_B \implies V_B = \mathbf{60 \text{ vueltas}}$$
2. La rueda $B$ y la rueda $C$ están montadas sobre el **mismo eje**, por lo tanto giran a la misma velocidad angular:
   $$V_C = V_B = \mathbf{60 \text{ vueltas}}$$.  
*(Nota trampa: El número de dientes de $C$ no altera las vueltas cuando están en el mismo eje).*  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Magnitudes en Funciones)
Se sabe que el valor de una joya es directamente proporcional al cuadrado de su masa. Un diamante que costaba $S/.\, 32,000$ se parte accidentalmente en dos pedazos cuyas masas están en la relación de $3$ a $5$. ¿Cuánto dinero se perdió debido a este accidente?
A) $S/.\, 12,000$  
B) $S/.\, 15,000$  
C) $S/.\, 17,000$  
D) $S/.\, 18,000$  
E) $S/.\, 20,000$  

**Solución Paso a Paso:**
1. Relación fundamental:
   $$\frac{\text{Precio}}{(\text{Masa})^2} = k \implies \text{Precio} = k \cdot M^2$$
2. Sea la masa total $M = 3m + 5m = 8m$.
   - Precio inicial del diamante entero:
     $$P_{\text{total}} = k \cdot (8m)^2 = 64 k m^2 = 32,000$$
     $$k m^2 = \frac{32,000}{64} = \mathbf{500}$$
3. Calculamos el valor de los dos fragmentos por separado:
   - Pedazo 1 ($M_1 = 3m$):
     $$P_1 = k \cdot (3m)^2 = 9 k m^2 = 9(500) = S/.\, 4,500$$
   - Pedazo 2 ($M_2 = 5m$):
     $$P_2 = k \cdot (5m)^2 = 25 k m^2 = 25(500) = S/.\, 12,500$$
4. Valor total de los pedazos reunidos:
   $$P_{\text{restante}} = 4,500 + 12,500 = S/.\, 17,000$$
5. Pérdida económica sufrida:
   $$\text{Pérdida} = 32,000 - 17,000 = \mathbf{S/.\, 15,000}$$.  
**Clave: B**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Magnitud:** Propiedad física o conceptual medible que admite variación cuantitativa.
2. **Proporcionalidad Directa:** Relación entre dos magnitudes cuyo cociente es constante.
3. **Proporcionalidad Inversa:** Relación entre dos magnitudes cuyo producto algebraico es constante.
4. **Media Proporcional:** En una proporción geométrica continua $\frac{a}{b} = \frac{b}{c}$, es el valor medio $b = \sqrt{ac}$.
5. **Cuarta Proporcional:** Cuarto término $d$ en una proporción discreta $\frac{a}{b} = \frac{c}{d}$.
6. **Descuento Sucesivo:** Aplicación escalonada de rebajas donde cada porcentaje posterior se calcula sobre el saldo remanente.
7. **Precio de Lista (Fijado):** Valor nominal exhibido al público antes de la aplicación de cualquier rebaja o beneficio.
8. **Margen de Ganancia:** Beneficio económico obtenido, habitualmente expresado como fracción o porcentaje del costo.
9. **Ruedas Dentadas:** Componentes mecánicos donde la velocidad de giro es inversamente proporcional al número de dientes.
10. **Escala Numérica:** Relación matemática de reducción o ampliación entre la longitud en un plano y la longitud real en el terreno.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** Si $A$ es D.P. a $B$, ¿qué operación permanece matemáticamente constante?  
  **A:** La división: $\frac{A}{B} = k$.
* **Q:** Si dos ruedas dentadas están engranadas, ¿qué relación existe entre sus vueltas y sus dientes?  
  **A:** Son inversamente proporcionales: $\text{Dientes}_A \cdot \text{Vueltas}_A = \text{Dientes}_B \cdot \text{Vueltas}_B$.
* **Q:** ¿Cuál es la fórmula para el descuento único de dos descuentos del $20\%$ y $10\%$?  
  **A:** $D_u = (20 + 10 - \frac{20 \cdot 10}{100})\% = 28\%$.
* **Q:** En la regla de tres compuesta, ¿qué elementos van en el denominador (efecto)?  
  **A:** Exclusivamente la medida de la obra realizada y su dificultad intrínseca.
* **Q:** Si dos ruedas giran sobre el mismo eje, ¿qué ocurre con sus números de vueltas?  
  **A:** Son exactamente iguales ($V_A = V_B$), sin importar cuántos dientes tenga cada una.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RM_02",
  "title": "Magnitudes y Proporcionalidad",
  "required_level": 2,
  "xp_reward": 160,
  "gems_reward": 18,
  "skills": ["Regla de Tres Compuesta", "Engranajes Mecánicos", "Porcentajes Comerciales"],
  "boss_challenge": {
    "boss_name": "El Tasador de Joyas",
    "question": "Un diamante de S/. 32,000 se rompe en pedazos de masas en relación 3 a 5. Si el precio es D.P. al cuadrado de la masa, ¿cuánto dinero se perdió?",
    "options": ["S/. 12,000", "S/. 15,000", "S/. 17,000", "S/. 20,000"],
    "correct_index": 1,
    "explanation": "La masa inicial es 8m (precio 64km^2 = 32000 => km^2 = 500). Los pedazos valen 9(500) y 25(500), sumando S/. 17,000. Pérdida: 32000 - 17000 = S/. 15,000."
  }
}
```
