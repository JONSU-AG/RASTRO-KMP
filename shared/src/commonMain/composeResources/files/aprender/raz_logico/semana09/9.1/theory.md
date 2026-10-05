## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE I: Aptitud Académica |
| **Componente / Asignatura** | Razonamiento Lógico |
| **Tema Oficial N.°** | Tema IX: Detección de falacias simples |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 6-7, 44-45) |
| **Ponderación por Pregunta** | **1.124150000 pts** (Áreas: Ingenierías, Biomédicas, Sociales) |
| **Preguntas por Examen** | 4 preguntas en componente Lógico (Total: 4.4966000 pts de 20.00 pts de Aptitud) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis Crítico, Evaluación Argumentativa y Metacognición |
| **Conexión Interuniversitaria** | **UNSA:** Falacias no formales de atingencia y ambigüedad en discursos.<br>**UNMSM (DECO):** Preguntas de lectura crítica, debilitamiento/reforzamiento de argumentos.<br>**UNI:** Lógica dialéctica, inconsistencia pragmática y sofismas en debates. |

### Matriz de Indicadores de Logro Evaluados
1. **Identificación de falacias no formales:** Reconocer argumentos engañosos que psicológicamente persuaden pero que carecen de soporte lógico formal.
2. **Generalización indebida (*Secundum Quid*):** Detectar extrapolaciones abusivas a partir de muestras reducidas o casos aislados.
3. **Falsa causa (*Post hoc ergo propter hoc* / *Non causa pro causa*):** Discriminar entre mera correlación cronológica y una genuina relación de causalidad física o matemática.
4. **Falacias de ambigüedad lógica:** Detectar equívocos léxicos, anfibologías sintácticas y desplazamientos de significado a mitad de un razonamiento.
5. **Evaluación de la solidez argumentativa:** Juzgar si una conclusión se sostiene por premisas pertinentes y suficientes o mediante trucos retóricos.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                            TEORÍA DE LAS FALACIAS
                                      │
           ┌──────────────────────────┴──────────────────────────┐
           ▼                                                     ▼
   FALACIAS FORMALES                                    FALACIAS NO FORMALES
 (Violan leyes de cálculo)                            (Defectos de contenido/contexto)
           │                                                     │
     ┌─────┴─────┐                               ┌───────────────┴───────────────┐
     ▼           ▼                               ▼                               ▼
Afirmación    Negación del             FALACIAS DE ATINGENCIA              FALACIAS DE AMBIGÜEDAD
del Consec.   Antecedente              (Falta de conexión lógica)           (Lenguaje confuso)
                                                 │                               │
                      ┌──────────────────────────┼───────────────┐        ┌──────┴──────┐
                      ▼                          ▼               ▼        ▼             ▼
                 Generalización                Falsa           Otras   Equívoco    Anfibología
                    Indebida                   Causa          (Ad hominem,
                 (Muestra sesgada)         (Post hoc...)      Ad populum...)
```

### Ontología de la Falacia
- **Falacia:** Argumento que parece válido pero que resulta lógicamente incorrecto tras un escrutinio riguroso.
- **Paralogismo:** Razonamiento falaz cometido de buena fe o por ignorancia, sin intención de engañar.
- **Sofisma:** Razonamiento falaz construido deliberadamente con la intención maliciosa de manipular o engañar al receptor.
- **Premisa Irrelevante (Inatingencia):** Proposición que no aporta evidencia pertinente para fundar la conclusión pretendida.

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Falacias de Atingencia Prioritarias en el Temario UNSA

#### A. Generalización Indebida (*Secundum Quid* / Muestra Insuficiente)
- **Mecanismo:** Se infiere una conclusión universal o atributiva sobre toda una población a partir del análisis de un número minúsculo, no representativo o sesgado de casos particulares.
- **Estructura lógica defectuosa:**
  X_1 \in A \land X_1 \text{ es } B, \quad X_2 \in A \land X_2 \text{ es } B \implies \forall x (x \in A \to x \text{ es } B)
- *Ejemplo típico:* "Ayer vi a dos conductores de transporte público cruzar la luz roja en la Av. Ejército. Por tanto, todos los choferes de transporte público de Arequipa son irresponsables".

#### B. Falsa Causa (*Non Causa Pro Causa* y *Post Hoc Ergo Propter Hoc*)
- **Mecanismo:** Consiste en atribuir a un fenómeno antecedente la condición de causa determinante de un fenómeno consecuente basándose únicamente en la coincidencia temporal de ambos.
- **Axioma científico violado:** *"Correlación no implica causalidad"* (\text{Corr}(X, Y) \neq X \implies Y).
- *Ejemplo típico:* "Desde que el nuevo presidente asumió el cargo, no ha llovido en la cuenca del Chili. Por lo tanto, el mandatario es el culpable de la sequía regional".

#### C. Falacia de Contradicción Interna (Inconsistencia Discursiva)
- **Mecanismo:** Un mismo emisor sostiene dos proposiciones que no pueden coexistir bajo el principio de no contradicción, anulando por completo la validez de su tesis principal.
- *Ejemplo:* "El Estado debe garantizar la libertad absoluta de todos los ciudadanos sin ninguna restricción, y al mismo tiempo prohibir y sancionar severamente todo contenido que ofenda la moral pública".

### 3.2 Falacias de Ambigüedad Lógica


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE DETECCIÓN DE FALACIAS

| Tipo de Falacia | Error Lógico Específico | Pregunta de Detección Inmediata |
| :--- | :--- | :--- |
| **Generalización Indebida** | Muestra no representativa ni estadísticamente significativa. | *¿Se analizó una muestra representativa o solo 2 o 3 casos anecdóticos?* |
| **Falsa Causa** | Confundir orden temporal con causalidad biológica o física. | *¿El suceso B ocurriría igualmente sin el suceso A? ¿Hay un tercer factor oculto?* |
