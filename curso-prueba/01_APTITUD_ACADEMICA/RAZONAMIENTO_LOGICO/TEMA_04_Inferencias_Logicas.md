# TEMA 04 · INFERENCIAS LÓGICAS Y REGLAS DE INFERENCIA
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Lógico  
**Código del Tema:** `APT_RL_04`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Enfoque DECO deducción en investigación científica] [UNI: Métodos de demostración directa, indirecta y reglas de inferencia canónicas]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Deducción lógica de conclusiones a partir de premisas, identificación de inferencias válidas (Modus Ponens, Modus Tollens, Silogismo Disyuntivo) y descarte de opiniones. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de validez formal en textos argumentativos, distinción entre verdad fáctica de las premisas y validez estructural de la conclusión. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Deducción natural formal, prueba formal de validez paso a paso citando reglas clásicas (Exportación, Dilemas constructivos/destructivos, Reducción al absurdo). | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Deducir rigurosamente conclusiones válidas a partir de un conjunto de premisas dadas.
2. Reconocer y clasificar inferencias en válidas (tautológicas) e inválidas (falacias formales).
3. Identificar conclusiones que se desprenden **necesaria y forzosamente** de las premisas, descartando conclusiones meramente probables.
4. Distinguir con precisión epistemológica entre una **inferencia lógica formal** y una **opinión o juicio subjetivo**.
5. Aplicar con soltura las reglas canónicas de inferencia: Modus Ponendo Ponens, Modus Tollendo Tollens, Silogismo Hipotético y Silogismo Disyuntivo.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Inferencia Inductiva (De lo particular a lo general: Probable)
        ┌─ 1. Tipos de ────────┼─ Inferencia Deductiva (De lo general a lo particular: Necesaria)
        │      Inferencias     └─ Inferencia Abductiva (La mejor explicación causal disponible)
        │
INFERENCIAS                    ┌─ Premisas (Enunciados que sirven de fundamento lógico)
LÓGICAS ────────┼─ 2. Estructura de ───┼─ Conclusión (Enunciado que se deriva de las premisas)
        │      un Razonamiento └─ Validez Formal vs. Verdad Fáctica (La validez es de la forma)
        │
        │                      ┌─ Modus Ponendo Ponens (MPP: Afirmando el antecedente)
        ├─ 3. Reglas ──────────┼─ Modus Tollendo Tollens (MTT: Negando el consecuente)
        │      Clásicas de     ├─ Silogismo Hipotético Puro (SHP: Transitividad de causas)
        │      Inferencia      ├─ Silogismo Disyuntivo (SD: Modus Tollendo Ponens)
        │                      └─ Dilemas Constructivo y Destructivo
        │
        └─ 4. Falacias ────────┌─ Falacia de Afirmación del Consecuente (Inferencia inválida)
               Formales de     └─ Falacia de Negación del Antecedente (Inferencia inválida)
               Inferencia
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Estructura Epistemológica de una Inferencia
Una inferencia o razonamiento es una **estructura de proposiciones** en la cual, a partir de una o más proposiciones llamadas **premisas** ($P_1, P_2, \dots, P_k$), se deriva y fundamenta otra proposición llamada **conclusión** ($C$):
$$P_1, P_2, P_3, \dots, P_k \models C$$
* En lenguaje condicional formal:
  $$(P_1 \land P_2 \land \dots \land P_k) \to C$$

#### Criterio Fundamental de Validez:
Una inferencia es **VÁLIDA** si y solo si la forma condicional asociada es una **TAUTOLOGÍA**:
$$\text{Validez} \iff \text{Es absolutamente imposible que las premisas sean Verdaderas y la conclusión sea Falsa}$$
*(Si las premisas son verdaderas, la conclusión DEBE ser necesariamente verdadera).*

---

### 3.2 Distinción Crucial: Validez Formal vs. Verdad Fáctica
* **La Verdad:** Es una propiedad de las **proposiciones aisladas** cuando concuerdan con la realidad empírica (ej. "La nieve es blanca").
* **La Validez:** Es una propiedad exclusiva de la **estructura del razonamiento**, no de su contenido fáctico.
  * Un razonamiento puede tener premisas falsas y ser formalmente válido:
    - *Premisa 1:* Todos los peces vuelan. ($F$)
    - *Premisa 2:* El tiburón es un pez. ($V$)
    - *Conclusión:* El tiburón vuela. ($F$)
    👉 **Estructura 100% VÁLIDA** (Silogismo perfecto), aunque la conclusión sea fácticamente falsa.

---

### 3.3 Reglas Canónicas de Inferencia Lógica (Deducción Natural)

#### 1. Modus Ponendo Ponens (MPP - "Afirmando afirmo")
Si se tiene un condicional y se afirma su antecedente, se concluye necesariamente su consecuente:
$$\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
p & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{q} & (\text{Conclusión})
\end{array}$$

#### 2. Modus Tollendo Tollens (MTT - "Negando niego")
Si se tiene un condicional y se niega su consecuente, se concluye necesariamente la negación de su antecedente:
$$\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
\sim q & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{\sim p} & (\text{Conclusión})
\end{array}$$

#### 3. Silogismo Hipotético Puro (SHP - Transitividad)
Si una causa genera un efecto intermedio, y ese efecto intermedio es causa de un resultado final:
$$\begin{array}{rl}
p \to q & (\text{Premisa 1}) \\
q \to r & (\text{Premisa 2}) \\
\hline
\therefore \mathbf{p \to r} & (\text{Conclusión})
\end{array}$$

#### 4. Silogismo Disyuntivo (SD / Modus Tollendo Ponens - "Negando afirmo")
Si se tiene una disyunción y se niega una de las alternativas, se afirma forzosamente la otra:
$$\begin{array}{rl|rl}
p \lor q & & p \lor q & \\
\sim p & & \sim q & \\
\hline
\therefore \mathbf{q} & & \therefore \mathbf{p} &
\end{array}$$

#### 5. Dilema Constructivo (DC)
$$\begin{array}{rl}
(p \to q) \land (r \to s) & (\text{Dos implicaciones}) \\
p \lor r & (\text{Se afirma al menos un antecedente}) \\
\hline
\therefore \mathbf{q \lor s} & (\text{Se concluye la disyunción de sus consecuentes})
\end{array}$$

#### 6. Ley de Simplificación y Conjunción
* **Simplificación:** De $p \land q$ se puede concluir válidamente $p$ (o también $q$).
* **Conjunción:** Si se tiene $p$ demostrado y $q$ demostrado, se concluye válidamente $p \land q$.
* **Adición:** Si se tiene $p$, se puede concluir válidamente $p \lor q$ (para cualquier $q$).

---

### 3.4 Inferencia vs. Opinión (Criterio Prospecto UNSA)
* **Inferencia Lógica:** Derivación forzosa basada en reglas sintácticas y semánticas de deducción objetiva. No depende de las creencias del observador.
* **Opinión o Creencia:** Juicio de valor subjetivo, conjetura verosímil, estimación o extrapolación no demostrada formalmente por las premisas.
  * *Premisa:* "El postulante Juan obtuvo 98 puntos de 100 en el examen CEPREUNSA".
  * *Inferencia lógica:* Juan obtuvo un puntaje aprobatorio y superó los 90 puntos.
  * *Opinión (No deducible lógicamente):* Juan será un excelente médico cirujano en el futuro. (Es un deseo u opinión, no una consecuencia lógica de la premisa).

---

## 4. 📐 FORMULARIO MAESTRO DE VALIDEZ Y FALACIAS FORMALES

| Regla Válida de Inferencia | Falacia Formal Inválida (Distractor Típico) | Estructura de la Falacia |
| :--- | :--- | :---: |
| **Modus Ponens (Válido)** <br> $p \to q, \quad p \implies \mathbf{q}$ | **Falacia de Afirmación del Consecuente** <br> *(Afirmar el consecuente NO permite deducir el antecedente)* | $$\begin{array}{c} p \to q \\ q \\ \hline \therefore p \text{ (¡INVÁLIDO!)} \end{array}$$ |
| **Modus Tollens (Válido)** <br> $p \to q, \quad \sim q \implies \mathbf{\sim p}$ | **Falacia de Negación del Antecedente** <br> *(Negar el antecedente NO permite deducir la negación del consecuente)* | $$\begin{array}{c} p \to q \\ \sim p \\ \hline \therefore \sim q \text{ (¡INVÁLIDO!)} \end{array}$$ |

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL PONENS PONE, EL TOLLENS QUITA"
> * **Ponens (Pone):** Pone (afirma) el antecedente $\implies$ Pone (obtiene) el consecuente ($p \implies q$).
> * **Tollens (Toma/Quita):** Quita (niega) el consecuente $\implies$ Quita (niega) el antecedente ($\sim q \implies \sim p$).

### Mnemotecnia 2: La Trampa de la Lluvia y el Piso Mojado
> "Si llueve, la pista se moja ($p \to q$)".
> 1. *Caso Válido (MPP):* Está lloviendo $\implies$ Conclusión forzosa: La pista está mojada.
> 2. *Caso Válido (MTT):* La pista está seca ($\sim q$) $\implies$ Conclusión forzosa: No ha llovido ($\sim p$).
> 3. *Falacia 1:* La pista está mojada ($q$) $\implies$ ¿Llovió? **¡NO NECESARIAMENTE!** (Pudieron haber regado la pista o roto una tubería).
> 4. *Falacia 2:* No llueve ($\sim p$) $\implies$ ¿La pista no está mojada? **¡NO NECESARIAMENTE!**

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Diagrama de Euler para Inferencias Inmediatas
Cuando un problema de inferencia use cuantificadores ("Todos", "Ningún", "Algunos"):
1. Dibuja círculos de conjuntos (diagramas de Venn-Euler).
2. Superpón las premisas.
3. Lo que quede **sombreado o intersecado obligatoriamente en todos los dibujos posibles** es la **CONCLUSIÓN VÁLIDA**.
4. Cualquier alternativa que no se cumpla en al menos un diagrama posible se descarta inmediatamente como simple opinión o conjetura.

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **La falacia de la inversión condicional:**
   * Premisa: "Todos los ingenieros civiles colegiados estudiaron en la universidad".
   * Pregunta trampa: "¿Qué se concluye válidamente si Pedro estudió en la universidad?"
   * **El error común:** Marcar "Pedro es ingeniero civil".
   * **Lo correcto:** No se puede concluir que sea ingeniero civil; pudo haber estudiado Derecho, Medicina o Filosofía.
2. ⚠️ **El conector disyuntivo y la negación:**
   * Para aplicar el Silogismo Disyuntivo ($p \lor q$), debes **NEGAR** una de las dos partes para quedarte con la otra.
   * Si te dan $p \lor q$ y luego te afirman $p$, **NO puedes deducir $\sim q$** (salvo que el enunciado diga explícitamente que es una disyunción fuerte o exclusiva).

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Diagnóstico Clínico Asistido por Algoritmos (Biomédicas UNSA)
En el departamento de infectología del Hospital Regional de Arequipa, se programa un sistema experto de triaje con la siguiente regla de inferencia médica:
1. *Regla 1:* Si un paciente presenta fiebre alta continua ($p$) y plaquetopenia severa ($q$), y reside en zona endémica ($r$), se concluye sospecha confirmada de Dengue grave ($s$):
   $$(p \land q \land r) \to s$$
2. *Registro de Triaje:* El paciente llega con fiebre alta ($p = V$), plaquetopenia severa ($q = V$), y vive en Camaná (zona endémica, $r = V$).
3. *Ejecución de la Inferencia (Modus Ponens):*
   $$(V \land V \land V) \equiv V \implies \mathbf{s = V}$$
4. El sistema emite la orden de hospitalización inmediata. Una inferencia lógica salva vidas al erradicar dudas humanas subjetivas en emergencias.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Modus Tollendo Tollens)
Dadas las siguientes premisas:
- Premisa 1: Si un postulante alcanza el puntaje reglamentario, obtiene una vacante en la UNSA.
- Premisa 2: Carlos no obtuvo una vacante en la UNSA.
¿Qué conclusión se desprende necesariamente por regla de inferencia lógica?
A) Carlos estudió poco para el examen.  
B) Carlos no alcanzó el puntaje reglamentario.  
C) Carlos postulará en el siguiente proceso Ordinario.  
D) Carlos eligió una carrera con muy pocas vacantes.  
E) La prueba estuvo extremadamente difícil.  

**Solución Paso a Paso:**
1. Formalizamos las premisas:
   - $p$: El postulante alcanza el puntaje reglamentario.
   - $q$: Obtiene una vacante en la UNSA.
   - Premisa 1: $p \to q$
   - Premisa 2: $\sim q$ ("Carlos no obtuvo vacante").
2. Aplicamos la regla lógica del **Modus Tollendo Tollens (MTT)**:
   $$\begin{array}{c} p \to q \\ \sim q \\ \hline \therefore \mathbf{\sim p} \end{array}$$
3. Conclusión formal: $\sim p$, que se traduce en:
   *"Carlos no alcanzó el puntaje reglamentario"*.
4. Las opciones A, C, D y E son opiniones, suposiciones o justificaciones psicológicas que no se deducen de las premisas.  
**Clave: B**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Silogismo Hipotético en Cadena)
Considere el siguiente razonamiento:
1. Si se reactiva el proyecto minero Tía María, se incrementará el canon para Arequipa.
2. Si se incrementa el canon para Arequipa, se mejorará la infraestructura de los colegios públicos.
3. Si se mejora la infraestructura de los colegios públicos, se elevará el rendimiento académico escolar.
Si se sabe que efectivamente se reactivó el proyecto minero Tía María, ¿cuál es la conclusión final necesaria?
A) Todos los escolares arequipeños ingresarán a la universidad.  
B) Se elevará el rendimiento académico escolar.  
C) No habrá conflictos sociales en la región.  
D) El canon minero será el más alto del país.  
E) La educación pública superará a la educación privada.  

**Solución Paso a Paso:**
1. Formalizamos las proposiciones:
   - $p$: Se reactiva el proyecto Tía María.
   - $q$: Se incrementa el canon para Arequipa.
   - $r$: Se mejora la infraestructura de los colegios.
   - $s$: Se eleva el rendimiento académico escolar.
2. Premisas estructuradas:
   - $P_1: p \to q$
   - $P_2: q \to r$
   - $P_3: r \to s$
   - $P_4: p$ (Dato verificado).
3. Aplicamos **Silogismo Hipotético Puro (SHP)** encadenado entre $P_1, P_2$ y $P_3$:
   $$p \to q \land q \to r \land r \to s \implies p \to s$$
4. Como tenemos $P_4: p$, aplicamos **Modus Ponendo Ponens (MPP)** con $(p \to s)$:
   $$\begin{array}{c} p \to s \\ p \\ \hline \therefore \mathbf{s} \end{array}$$
5. La conclusión formal forzosa es $s$: *"Se elevará el rendimiento académico escolar"*.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Detección de Falacia Formal)
Un fiscal presenta el siguiente argumento en un tribunal:  
*"Si el acusado estuvo en la escena del crimen a las 10:00 p.m., el teléfono satelital registró su ubicación en la celda del Cercado. Efectivamente, el peritaje técnico de telecomunicaciones confirma que el teléfono registró su ubicación en la celda del Cercado a las 10:00 p.m. Por lo tanto, queda plenamente demostrado que el acusado estuvo en la escena del crimen."*  
Desde el punto de vista de la lógica formal, el argumento del fiscal es:
A) Válido por Modus Ponens.  
B) Válido por Modus Tollens.  
C) Inválido, incurre en la Falacia de Afirmación del Consecuente.  
D) Inválido, incurre en la Falacia de Negación del Antecedente.  
E) Válido por Silogismo Disyuntivo.  

**Solución Paso a Paso:**
1. Identificamos los componentes:
   - $p$: El acusado estuvo en la escena del crimen.
   - $q$: El teléfono satelital registró su ubicación en la celda del Cercado.
2. Premisa 1: $p \to q$.
3. Premisa 2: Se confirma $q$ ("El teléfono registró la ubicación").
4. Conclusión del fiscal: Por lo tanto, $p$ ("El acusado estuvo allí").
5. Evaluamos la estructura:
   $$\begin{array}{c} p \to q \\ q \\ \hline \therefore p \end{array}$$
6. Esta estructura corresponde exactamente a la **Falacia Formal de Afirmación del Consecuente** (el teléfono pudo haber sido llevado por un cómplice o dejado deliberadamente allí para armar una coartada). No es una inferencia válida.  
**Clave: C**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Dilema Constructivo)
Dadas las premisas formales:
1. $(p \to \sim q) \land (r \to s)$
2. $p \lor r$
3. $q$
¿Cuál es la conclusión formalmente válida que se deduce de este conjunto?
A) $p \land r$  
B) $\sim s$  
C) $s$  
D) $\sim p \land \sim r$  
E) $q \land \sim s$  

**Solución Paso a Paso:**
1. Aplicamos la regla del **Dilema Constructivo (DC)** con las Premisas 1 y 2:
   $$\begin{array}{c} (p \to \sim q) \land (r \to s) \\ p \lor r \\ \hline \therefore \mathbf{\sim q \lor s} \end{array}$$
2. Obtenemos la conclusión intermedia: $\sim q \lor s$.
3. Usamos la Premisa 3: $q$, que es idéntica a $\sim(\sim q)$ (la negación de $\sim q$).
4. Aplicamos el **Silogismo Disyuntivo (SD)** entre $(\sim q \lor s)$ y $q$:
   - En una disyunción, si negamos el primer término ($\sim q$ es falso porque $q$ es verdadero), se concluye necesariamente el segundo término:
     $$\therefore \mathbf{s}$$
5. Por lo tanto, la conclusión lógica necesaria es **$s$**.  
**Clave: C**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Reducción al Absurdo y Demostración)
Se propone demostrar la validez del siguiente argumento con tres premisas:
1. $P_1: \sim p \to (q \land r)$
2. $P_2: q \to \sim r$
3. $P_3: \sim p$
Demuestre formalmente qué valor de verdad adopta el sistema y cuál es la conclusión ineludible sobre la consistencia del conjunto de premisas.
A) Se concluye $q \lor r$ válidamente  
B) Se concluye $\sim q$ de forma consistente  
C) El conjunto de premisas es formalmente inconsistente (conduce a una contradicción $r \land \sim r$)  
D) Se deduce que $p$ debe ser falso  
E) Se concluye que $r$ es independiente de $q$  

**Solución Paso a Paso:**
1. Tomamos $P_1: \sim p \to (q \land r)$ y $P_3: \sim p$.
2. Por **Modus Ponendo Ponens (MPP)** entre $P_1$ y $P_3$:
   $$\begin{array}{c} \sim p \to (q \land r) \\ \sim p \\ \hline \therefore \mathbf{q \land r} \end{array}$$
3. De la conclusión intermedia $q \land r$, aplicamos la **Ley de Simplificación**:
   - Simplificamos $q$: $q \equiv V$.
   - Simplificamos $r$: $r \equiv V$.
4. Tomamos la Premisa 2: $P_2: q \to \sim r$.
5. Como ya demostramos que $q \equiv V$, aplicamos **Modus Ponendo Ponens** en $P_2$:
   $$\begin{array}{c} q \to \sim r \\ q \\ \hline \therefore \mathbf{\sim r} \end{array}$$
6. Observamos los pasos 3 y 5:
   - Por el paso 3: tenemos $r$.
   - Por el paso 5: tenemos $\sim r$.
7. Aplicamos la **Ley de Conjunción**:
   $$r \land \sim r \equiv \mathbf{F} \quad (\text{Contradicción})$$
8. Conclusión epistemológica: Las premisas planteadas son **formalmente inconsistentes e incompatibles**; de ellas se deriva una contradicción por reducción al absurdo.  
**Clave: C**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Inferencia:** Estructura deductiva orientada a derivar una conclusión forzosa a partir de un conjunto inicial de premisas.
2. **Premisa:** Proposición aceptada como punto de partida o evidencia para fundamentar una conclusión.
3. **Validez Formal:** Propiedad tautológica del condicional asociado a un razonamiento deductivo.
4. **Modus Ponendo Ponens:** Regla de inferencia que establece que la afirmación del antecedente impone la afirmación del consecuente.
5. **Modus Tollendo Tollens:** Regla de inferencia que establece que la negación del consecuente exige la negación del antecedente.
6. **Silogismo Hipotético:** Regla de transitividad causal que encadena dos o más proposiciones condicionales.
7. **Silogismo Disyuntivo:** Regla de eliminación que deduce la verdad de una opción disyuntiva al negar la alternativa restante.
8. **Falacia Formal:** Esquema argumentativo inválido que imita la estructura de una regla lógica genuina pero carece de validez tautológica.
9. **Deducción:** Movimiento inferencial necesario donde la información de la conclusión ya está implícitamente contenida en las premisas.
10. **Reducción al Absurdo:** Método de demostración que prueba la verdad de una tesis evidenciando que su negación conduce a una contradicción insoluble.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Cuál es la regla del Modus Ponendo Ponens (MPP)?  
  **A:** Dado $p \to q$, si se afirma $p$, se concluye necesariamente $q$.
* **Q:** ¿Cuál es la regla del Modus Tollendo Tollens (MTT)?  
  **A:** Dado $p \to q$, si se niega $q$ ($\sim q$), se concluye necesariamente $\sim p$.
* **Q:** ¿En qué consiste la Falacia de Afirmación del Consecuente?  
  **A:** En creer erróneamente que a partir de $p \to q$ y sabiendo que ocurrió $q$, se puede concluir $p$ (inválido).
* **Q:** ¿Cuál es la diferencia entre la verdad de una proposición y la validez de una inferencia?  
  **A:** La verdad compara la proposición con la realidad fáctica; la validez es una propiedad formal de la estructura del razonamiento.
* **Q:** Si tienes $p \lor q$ y se confirma que ocurre $\sim p$, ¿qué concluyes por Silogismo Disyuntivo?  
  **A:** Se concluye necesariamente $q$.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RL_04",
  "title": "Inferencias Lógicas y Reglas de Inferencia",
  "required_level": 11,
  "xp_reward": 240,
  "gems_reward": 25,
  "skills": ["Modus Ponens", "Modus Tollens", "Detección de Falacias Formales"],
  "boss_challenge": {
    "boss_name": "El Maestro de la Deducción",
    "question": "Premisas: Si llueve, la pista se moja. La pista no está mojada. ¿Qué conclusión se deriva necesariamente?",
    "options": ["Llovió poco", "No ha llovido", "La pista se secó rápido", "Está nublado"],
    "correct_index": 1,
    "explanation": "Por Modus Tollendo Tollens: p -> q y ~q concluye necesariamente ~p ('No ha llovido')."
  }
}
```
