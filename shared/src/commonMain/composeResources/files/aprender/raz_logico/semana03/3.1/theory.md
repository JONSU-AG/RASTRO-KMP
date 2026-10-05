## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Relaciones de causa-efecto, condición suficiente vs. necesaria, contradicción formal, equivalencia y compatibilidad de proposiciones. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de consistencia en testimonios judiciales, hipótesis científicas contrapuestas y coherencia discursiva. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Relaciones metalógicas de implicación tautológica (A \models B), equivalencia lógica formal (A \equiv B) e incompatibilidad analítica. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar y discriminar rigurosamente relaciones lógicas de causa-efecto, condición, consecuencia, contradicción y equivalencia.
2. Reconocer la compatibilidad o incompatibilidad lógica simultánea entre dos o más afirmaciones.
3. Evaluar la coherencia lógica interna y externa de conjuntos de enunciados.
4. Diferenciar con precisión una **condición suficiente** de una **condición necesaria**.
5. Determinar equivalencias lógicas directas mediante leyes de transformación sintáctica.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Causa - Efecto (Antecedente -> Consecuente)
        ┌─ 1. Relaciones de ───┼─ Condición Suficiente (Si ocurre A, necesariamente ocurre B)
        │      Condición       ├─ Condición Necesaria (B es indispensable para que ocurra A)
        │                      └─ Condición Necesaria y Suficiente (Bicondicional: A <-> B)
        │
RELACIONES                     ┌─ Relación de Equivalencia (Mismo valor de verdad en toda circunstancia)
LÓGICAS ENTRE ──┼─ 2. Relaciones de ───┼─ Relación de Implicación (A -> B es una Tautología)
PROPOSICIONES   │      Verdad Formal   └─ Subimplicación y Relaciones Subcontrarias
        │
        │                      ┌─ Contradicción (Tienen valores de verdad estrictamente opuestos)
        ├─ 3. Oposición e ─────┼─ Incompatibilidad (No pueden ser ambas verdaderas a la vez)
        │      Incompatibilidad└─ Contrariedad (Pueden ser ambas falsas, pero no ambas verdaderas)
        │
        └─ 4. Coherencia y ────┌─ Compatibilidad Lógica (Existe al menos una asignación donde ambas son V)
               Consistencia    └─ Inconsistencia / Contradicción Global (Conjunto insatisfacible)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Relaciones de Causalidad y Condición

#### A. Condición Suficiente (p \to q)
Decimos que p es **condición suficiente** para q cuando la sola presencia o verdad de p garantiza de manera infalible la ocurrencia de q.
* *Ejemplo:* "Nacer en la provincia de Arequipa (p)" es **suficiente** para "ser peruano de nacimiento (q)".
* **Fórmula:** p \to q.

#### B. Condición Necesaria (q \leftarrow p \equiv p \to q)
Decimos que q es **condición necesaria** para p cuando la ausencia o falsedad de q hace absolutamente imposible la ocurrencia de p. Es un requisito indispensable, aunque por sí solo no garantiza el resultado.
* *Ejemplo:* "Tener DNI o documento de identidad (q)" es **necesario** para "votar en las elecciones de la UNSA (p)". (Sin DNI no puedes votar; pero tener DNI no significa obligatoriamente que vayas a votar).
* **Fórmula canónica:** El término "necesario" **siempre es el CONSECUENTE**:
  p \to q \quad (q \text{ es condición necesaria para } p)

#### C. Condición Necesaria y Suficiente (p \leftrightarrow q)
Ocurre cuando la relación es bidireccional y de equivalencia estricta. Una ocurre si y solo si ocurre la otra.
* *Ejemplo:* "Un polígono tiene tres lados si y solo si es un triángulo".

---

### 3.2 Relaciones de Compatibilidad e Incompatibilidad Lógica

1. **Compatibilidad Lógica:**
   Dos proposiciones A y B son **compatibles** si y solo si existe **al menos una interpretación o combinación de valores** donde ambas proposiciones son simultáneamente **VERDADERAS**:

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE RELACIONES Y EQUIVALENCIAS

### 4.1 Diccionario Rápido de Condicionales Preuniversitarios

| Frase del Enunciado | Identificación del Consecuente | Formalización |
| :--- | :--- | :---: |
| "A es condición suficiente para B" | B es el consecuente | A \to B |
