## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE I: Aptitud Académica |
| **Componente / Asignatura** | Razonamiento Lógico |
| **Tema Oficial N.°** | Tema VI: Consistencia y coherencia lógica |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 6-7, 44-45) |
| **Ponderación por Pregunta** | **1.124150000 pts** (Áreas: Ingenierías, Biomédicas, Sociales) |
| **Preguntas por Examen** | 4 preguntas en componente Lógico (Total: 4.4966000 pts de 20.00 pts de Aptitud) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis, Evaluación y Metacognición Lógica |
| **Conexión Interuniversitaria** | **UNSA:** Consistencia de premisas y paradojas de veracidad.<br>**UNMSM (DECO):** Situaciones lógicas de verdades y mentiras, culpables e inocentes.<br>**UNI:** Lógica matemática formal, tablas de consistencia y árboles semánticos. |

### Matriz de Indicadores de Logro Evaluados
1. **Detección de contradicciones internas:** Descubrir proposiciones del tipo p \land \neg p explícitas o deducibles en declaraciones testimoniales.
2. **Evaluación de coherencia:** Determinar si un cuerpo de enunciados mantiene una línea libre de fisuras inferenciales.
3. **Identificación de enunciados incompatibles:** Identificar parejas o ternas de asertos que no pueden coexistir bajo el principio de no contradicción.
4. **Satisfacibilidad simultánea:** Resolver si existe al menos una interpretación de verdad en la que todas las premisas sean verdaderas a la vez (\exists \, v \text{ tal que } v(P_i) = V \quad \forall i).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                            SISTEMAS DE PROPOSICIONES
                                        │
                 ┌──────────────────────┴──────────────────────┐
                 ▼                                             ▼
       SISTEMAS CONSISTENTES                         SISTEMAS INCONSISTENTES
      (Satisfacibles / Coherentes)                  (Insatisfacibles / Absurdos)
                 │                                             │
      ┌──────────┴──────────┐                       ┌──────────┴──────────┐
      ▼                     ▼                       ▼                     ▼
Tautológicos          Contingentes            Contradicción         Incompatibilidad
(Siempre V)        (Al menos un caso V)        Formal Directa       Contextual Cruzada
                                                (p \land \neg p)   (Relaciones mutuamente
                                                                      excluyentes)
```

### Ontología de Conceptos Fundamentales
- **Conjunto de Premisas (\Gamma):** Colección finita de asertos \{P_1, P_2, \dots, P_n\}.
- **Consistencia Sintáctica:** No es posible derivar formalmente tanto una proposición Q como su negación \neg Q a partir de \Gamma (\Gamma \nvdash \bot).
- **Consistencia Semántica (Satisfacibilidad):** Existe al menos una asignación de valores de verdad que hace verdaderas simultáneamente a todas las proposiciones del conjunto (\text{Mod}(\Gamma) \neq \emptyset).
- **Incompatibilidad Lógica:** Dos proposiciones P y Q son incompatibles si P \land Q \equiv \mathbf{F} (no pueden ser ambas verdaderas al mismo tiempo).

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Definición Rigurosa de Consistencia y Satisfacibilidad
Sea \Gamma = \{P_1, P_2, \dots, P_n\} un conjunto finito de fórmulas bien formadas (fbf) en el cálculo proposicional.
- Decimos que \Gamma es **semánticamente consistente** (o satisfacible) si y solo si:
  \exists v : \mathcal{P} \to \{V, F\} \quad \text{tal que} \quad v(P_1) = v(P_2) = \dots = v(P_n) = V
  Equivalentemente, la gran conjunción de sus elementos no es una contradicción:
  P_1 \land P_2 \land \dots \land P_n \not\equiv \mathbf{F}
- Decimos que \Gamma es **inconsistente** si para toda valoración v, existe al menos un P_i \in \Gamma tal que v(P_i) = F. En tal caso:
  P_1 \land P_2 \land \dots \land P_n \equiv \mathbf{F}

### 3.2 El Principio de Explosión (*Ex Contradictione Quodlibet*)
En la lógica clásica deductiva, si un sistema es inconsistente, se puede deducir cualquier proposición arbitraria Q.
\{P, \neg P\} \vdash Q
**Demostración formal:**
1. P (Premisa)

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE CONSISTENCIA

| Condición Lógica | Expresión Formal en Álgebra Booleana | Interpretación en Admisión |
| :--- | :--- | :--- |
| **Satisfacibilidad de \Gamma** | \bigwedge_{i=1}^n P_i \not\equiv \mathbf{F} | Existe al menos un escenario donde todos dicen la verdad. |
| **Incompatibilidad Binaria** | P \land Q \equiv \mathbf{F} \iff P \implies \neg Q | Si uno es verdadero, el otro obligatoriamente es falso. |
