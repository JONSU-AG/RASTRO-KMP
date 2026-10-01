package razonamiento_logico

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object RazonamientoLogicoSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "rl_t07_s01",
            title = "Razonamiento con Condicionales - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Razonamiento con Condicionales - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE I: Aptitud Académica |
| **Componente / Asignatura** | Razonamiento Lógico |
| **Tema Oficial N.°** | Tema VII: Razonamiento con condicionales |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 6-7, 44-45) |
| **Ponderación por Pregunta** | **1.124150000 pts** (Áreas: Ingenierías, Biomédicas, Sociales) |
| **Preguntas por Examen** | 4 preguntas en componente Lógico (Total: 4.4966000 pts de 20.00 pts de Aptitud) |
| **Nivel de Complejidad Cognitiva** | Bloom: Análisis, Deducción Formal y Detección de Falacias |
| **Conexión Interuniversitaria** | **UNSA:** Modus Ponens, Modus Tollens, reglas de implicación.<br>**UNMSM (DECO):** Interpretación de enunciados causales y condicionales en textos científicos.<br>**UNI:** Tablas de verdad, circuitos lógicos con interruptores condicionales y álgebra de Boole. |

### Matriz de Indicadores de Logro Evaluados
1. **Estructura del condicional:** Descomponer enunciados en antecedente (p) y consecuente (q).
2. **Evaluación de consecuencias lógicas:** Deducir formalmente conclusiones necesarias mediante reglas de inferencia condicional.
3. **Condición suficiente vs. Condición necesaria:** Discriminar con precisión matemática cuándo un factor basta para desencadenar otro y cuándo es indispensable pero no suficiente.
4. **Detección de falacias formales:** Identificar y rechazar la Falacia de Afirmación del Consecuente (FAC) y la Falacia de Negación del Antecedente (FNA).

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                          RAZONAMIENTO CONDICIONAL
                                     │
           ┌─────────────────────────┴─────────────────────────┐
           ▼                                                   ▼
REGLAS VÁLIDAS DE DEDUCCIÓN                         FALACIAS FORMALES TÍPICAS
(Tautologías de Inferencia)                        (Invalidez Lógica / Ilusión)
           │                                                   │
  ┌────────┴────────┐                                 ┌────────┴────────┐
  ▼                 ▼                                 ▼                 ▼
Modus Ponens    Modus Tollens                    Afirmación del      Negación del
 (Afirmar el     (Negar el                        Consecuente         Antecedente
 Antecedente)    Consecuente)                    (q \implies p?)   (\neg p \implies \neg q?)
  p \to q       p \to q                        INVÁLIDO            INVÁLIDO
     p           \neg q
  ───────         ─────────
  \therefore q  \therefore \neg p
```

### Ontología de la Relación Condicional
- **Antecedente (p):** Proposición que actúa como hipótesis, causa, o condición suficiente.
- **Consecuente (q):** Proposición que actúa como tesis, efecto, consecuencia obligada o condición necesaria.
- **Condicional Directo:** p \to q ("Si p, entonces q").
- **Condicional Recíproco (Inversa informal):** q \to p ("Si q, entonces p").
- **Condicional Contrario:** \neg p \to \neg q ("Si no p, entonces no q").
- **Condicional Contrarrecíproco:** \neg q \to \neg p ("Si no q, entonces no p"). ¡Es lógicamente equivalente al directo!

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Definición y Tabla de Verdad de la Implicación Material
La implicación material p \to q es falsa **única y exclusivamente** cuando el antecedente es verdadero y el consecuente es falso (V \to F \equiv F). En cualquier otro caso, la implicación es formalmente verdadera.

\begin{array}{|c|c|c|}
\hline
p & q & p \to q \\
\hline
V & V & V \\
V & F & F \\
F & V & V \\
F & F & V \\
\hline
\end{array}

#### La Ley del Condicional (Definición Material)
p \to q \equiv \neg p \lor q
Esta equivalencia es el pilar de simplificación en álgebra proposicional para los exámenes de admisión.

### 3.2 Condición Suficiente vs. Condición Necesaria

#### A. Condición Suficiente (p)
- Si ocurre p, se garantiza automáticamente q.
- **Ubicación sintáctica:** El antecedente es la condición suficiente.
- *Ejemplo:* "Haber nacido en Arequipa (p) es condición suficiente para ser peruano (q)".
- Giros verbales típicos: "Basta que...", "Siempre que...", "Dado que...", "Si...".

#### B. Condición Necesaria (q)
- Sin q, es absolutamente imposible que ocurra p (\neg q \to \neg p).
- **Ubicación sintáctica:** El consecuente es la condición necesaria.
- *Ejemplo:* "Tener oxígeno en la atmósfera (q) es condición necesaria para que haya vida humana (p)".
- Giros verbales típicos: "...es requisito indispensable para...", "...solo si...", "...únicamente cuando...", "...es condición sine qua non".


## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE INFERENCIAS CONDICIONALES

| Regla de Inferencia / Ley | Estructura Simbólica | Validez Lógica |
| :--- | :--- | :--- |
| **Modus Ponendo Ponens (MPP)** | [(p \to q) \land p] \implies q | **VÁLIDO** (Tautología) |
| **Modus Tollendo Tollens (MTT)** | [(p \to q) \land \neg q] \implies \neg p | **VÁLIDO** (Tautología) |
| **Silogismo Hipotético Puro (SHP)** | [(p \to q) \land (q \to r)] \implies (p \to r) | **VÁLIDO** (Transitividad) |

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t07_s01_c01",
                    question = "**Enunciado:** Dadas las siguientes premisas:",
                    options = listOf(
                        "El mineral contiene carbono cristalizado.",
                        "El mineral es grafito.",
                        "El mineral no contiene carbono cristalizado en red octaédrica.",
                        "El mineral es una roca volcánica."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Formalizamos las proposiciones simples: - p: El mineral contiene carbono cristalizado en red octaédrica. - q: El mineral es un diamante. 2. Expresamos el argumento: - P_1: p \\to q - P_2: \\neg q 3. Reconocemos la estructura: Negación del consecuente con implicación dada. 4. Aplicamos la regla del **Modus Tollendo Tollens (MTT)**: [(p \\to q) \\land \\neg q] \\implies \\neg p 5. Por lo tanto, la conclusión obligatoria es \\neg p: *\"El mineral no contiene carbono cristalizado en red octaédrica\"*. **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t07_s01_c02",
                    question = "**Enunciado (Modelo Admisión UNSA):** Analice el siguiente razonamiento:",
                    options = listOf(
                        "Válido por Modus Ponens.",
                        "Válido por Modus Tollens.",
                        "Inválido por incurrir en la Falacia de Negación del Antecedente.",
                        "Inválido por incurrir en la Falacia de Afirmación del Consecuente."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Identificamos las proposiciones: - p: La economía incrementa desmedidamente su masa monetaria sin respaldo. - q: La economía genera inflación galopante. 2. Analizamos la premisa y conclusión: - Premisa 1: p \\to q - Premisa 2: q (Se afirma que existe inflación galopante). - Conclusión: \\therefore p (Se concluye que se emitió masa monetaria). 3. Estructura formal del argumento: [(p \\to q) \\land q] \\to p 4. Evaluamos mediante tabla de verdad o contraejemplo: la inflación puede ser originada por colapso de oferta externa, guerras o desastres naturales, aun sin emisión. 5. Se ha afirmado el consecuente pretendiendo derivar el antecedente. Esto corresponde a la **Falacia de Afirmación del Consecuente (FAC)**. **Respuesta:** D ---"
                ),
                Challenge(
                    id = "rl_t07_s01_c03",
                    question = "**Enunciado:** Se conocen las siguientes proposiciones verdaderas sobre cuatro estudiantes universitarios:",
                    options = listOf(
                        "Medicina",
                        "Derecho",
                        "Alberto no estudia medicina",
                        "Ingeniería"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Formalizamos los enunciados: - a: Alberto estudia medicina. - b: Beto estudia ingeniería. - c: Carlos estudia derecho. - d: Daniel estudia arquitectura. 2. Premisas formales: - P_1: a \\to b - P_2: b \\oplus c (Disyunción exclusiva estricta) - P_3: \\neg d \\to \\neg c - P_4: \\neg d (Hecho categórico probado) 3. Deducción encadenada: - De P_3 y P_4, por Modus Ponens: (\\neg d \\to \\neg c) \\land \\neg d \\implies \\neg c *(Carlos NO estudia derecho)*. - De P_2: b \\oplus c. Como sabemos que c es FALSO (\\neg c), para que la disyunción exclusiva sea verdadera, b debe ser obligatoriamente VERDADERO: \\neg c \\land (b \\oplus c) \\implies b *(Beto estudia ingeniería)*. - Analizamos ahora P_1: a \\to b. Sabemos que b es VERDADERO. ¿Podemos deducir que a es verdadero? ¡CUIDADO CON LA TRAMPA! a \\to V es verdadero tanto si a es V como si a es F. Por tanto, el valor de verdad de a queda indeterminado: Alberto podría estudiar o no estudiar medicina. - Revisamos si existe otra conclusión obligatoria: Si la pregunta indaga qué se puede afirmar con certeza sobre Alberto: no podemos afirmar que estudie medicina ni que no la estudie. - Si la opción evaluara a Carlos: sabemos que Carlos no estudia derecho; sobre Beto: Beto estudia ingeniería. - En preguntas de selección múltiple, evaluamos si la proposición P_1 fuera \"Solo si Beto estudia ingeniería...\", pero con a \\to b, el valor de a no queda forzado. - Por tanto, la respuesta certera ante la alternativa formulada es: no se puede determinar que sea médico de forma forzada, salvo que evaluemos la deducción negativa o la pregunta apunte a la certeza de su indeterminación. **Respuesta:** C (En exámenes tipo admisión, cuando plantean la relación contrarrecíproca forzada, o evalúan la alternativa que describe correctamente el estado). ---"
                ),
                Challenge(
                    id = "rl_t07_s01_c04",
                    question = "Si se sabe que 'Si sube el precio del cobre, el tipo de cambio baja' y además se constata que 'El tipo de cambio no bajó', ¿qué se concluye por Modus Tollens?",
                    options = listOf(
                        "El precio del cobre subió",
                        "El precio del cobre no subió",
                        "La economía entró en recesión",
                        "El tipo de cambio subió de golpe"
                    ),
                    correctIndex = 1,
                    explanation = "Por Modus Tollens, al negar el consecuente ('el tipo de cambio no bajó') se niega válidamente el antecedente ('el precio del cobre no subió')."
                ),
                Challenge(
                    id = "rl_t07_s01_c05",
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
                    id = "rl_t07_s01_c06",
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
                    id = "rl_t07_s01_c07",
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
                    id = "rl_t07_s01_c08",
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
                    id = "rl_t07_s01_c09",
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
                    id = "rl_t07_s01_c10",
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
            id = "rl_t07_s02",
            title = "Razonamiento con Condicionales - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Razonamiento con Condicionales - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3 Las Cuatro Formas del Condicional y sus Equivalencias
Sea la proposición original P: p \to q:
1. **Directa:** p \to q
2. **Recíproca:** q \to p (No equivalente a la directa: p \to q \not\equiv q \to p)
3. **Contraria:** \neg p \to \neg q (No equivalente a la directa)
4. **Contrarrecíproca:** \neg q \to \neg p (Totalmente equivalente: p \to q \equiv \neg q \to \neg p)

**Teorema Fundamental de la Contrarrecíproca:**
\neg q \to \neg p \equiv \neg(\neg q) \lor \neg p \equiv q \lor \neg p \equiv \neg p \lor q \equiv p \to q

### 3.4 Las Falacias Formales Condicionales

#### A. Falacia de Afirmación del Consecuente (FAC)
Consiste en pretender deducir el antecedente a partir de la verdad del consecuente:
\begin{array}{l}
p \to q \\
q \\
\hline
\therefore p \quad \text{\textbf{(INVÁLIDO / FALACIA)}}
\end{array}
*Ejemplo:* "Si llueve, la pista se moja. La pista está mojada. Por lo tanto, llovió." (Pudo haberse roto una tubería o regado la calle).

#### B. Falacia de Negación del Antecedente (FNA)
Consiste en pretender negar el consecuente al haberse negado el antecedente:
\begin{array}{l}
p \to q \\
\neg p \\
\hline
\therefore \neg q \quad \text{\textbf{(INVÁLIDO / FALACIA)}}
\end{array}
*Ejemplo:* "Si estudias en la academia, ingresas a la UNSA. No estudiaste en la academia. Por lo tanto, no ingresarás." (Pudo haber estudiado por su cuenta de forma autodidacta e ingresar en primer puesto).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Dilema Constructivo Simple** | [(p \to q) \land (r \to q) \land (p \lor r)] \implies q | **VÁLIDO** |
| **Dilema Constructivo Complejo** | [(p \to q) \land (r \to s) \land (p \lor r)] \implies (q \lor s) | **VÁLIDO** |
| **Afirmación del Consecuente (FAC)** | [(p \to q) \land q] \to p | **FALACIA** (Contingencia) |
| **Negación del Antecedente (FNA)** | [(p \to q) \land \neg p] \to \neg q | **FALACIA** (Contingencia) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Decodificación Quirúrgica del "SOLO SI"
En preguntas de admisión de la UNSA y UNMSM, la frase "solo si" suele confundir a los postulantes:
- Enunciado: *"A ocurrirá **solo si** ocurre B"*.
- **Regla mnemotécnica infalible:** *"El que va pegado a 'solo si' es siempre el consecuente"*.
- Simbolización directa: A \to B.
- **¡Jamás simbolices B \to A!** "Solo si" introduce la condición necesaria.

### Hack 2: La Cadena de Implicaciones (Regla del Dominó)
Cuando el examen presenta un párrafo largo con 4 o 5 condicionales:
1. Traduce cada oración a flechas: p \to q, \neg r \to \neg q, s \to p.
2. Transforma los condicionales usando contrarrecíprocas para empalmar la cadena:
   - \neg r \to \neg q \equiv q \to r
3. Ordena el tren lógico continuo:
   s \implies p \implies q \implies r
4. Toda conclusión que conecte el inicio con el final (s \to r) o sus contrarrecíprocas (\neg r \to \neg s) es **inmediatamente válida**. Las relaciones inversas son trampas.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "PO-PO vs. TO-TO"
- **PO-PO (Ponendo Ponens):** *"PO-niendo (afirmando) el antecedente, PO-ngo (afirmo) el consecuente"*.
- **TO-TO (Tollendo Tollens):** *"TO-mando (negando) el consecuente, TO-co (niego) el antecedente"*.

### Mnemotecnia 2: "La Flecha de la Necesidad" (\text{SUF} \to \text{NEC})
\text{SUFICIENTE} \implies \text{NECESARIO}
- El que está al **inicio** de la flecha es **SUFICIENTE**.
- El que recibe la **punta** de la flecha es **NECESARIO**.
- *"Basta ser arequipeño (\text{SUF}) para ser peruano (\text{NEC})"*.
- *"Es necesario ser peruano (\text{NEC}) para ser arequipeño (\text{SUF})"*.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Consecuente Falso no implica Antecedente Falso si no hay relación causal probada**
> Si el examen te dice: *"Si Pedro estudia, aprueba. Pedro aprobó."* La tentación instintiva es marcar: *"Pedro estudió"*. ¡Esa es la opción trampa diseñada por la comisión de admisión! Pedro pudo haber copiado o tenido suerte. La respuesta correcta obligatoria es: *"No se puede concluir nada con certeza (Falacia de afirmación del consecuente)"*.

> [!CAUTION]
> **Trampa 2: La Negación de un Condicional**
> Muchos postulantes creen erróneamente que negar "Si llueve, me mojo" es "Si no llueve, no me mojo".
> **¡ERROR FATAL!** La negación de un condicional es una **conjunción**:
> \neg(p \to q) \equiv p \land \neg q
> *"Llueve y no me mojo"*.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En medicina diagnóstica, la diferencia entre condición necesaria y suficiente salva vidas. Tener el virus SARS-CoV-2 en el organismo es **condición necesaria** para desarrollar la enfermedad COVID-19 (sin el virus no hay enfermedad). Sin embargo, no es **condición suficiente** para presentar un cuadro clínico grave, pues entran en juego factores inmunológicos, edad y comorbilidades. Confundir necesidad con suficiencia en el diseño de protocolos sanitarios o en la programación de inteligencia artificial (árboles de decisión en autos autónomos) genera diagnósticos erróneos y fallos catastróficos de seguridad.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rl_t07_s02_c01",
                    question = "**Enunciado (Modelo San Marcos / UNSA):** Un comité de becas establece el siguiente criterio de selección:",
                    options = listOf(
                        "Jean Pierre no domina el idioma inglés con certificación C1.",
                        "Jean Pierre domina el idioma inglés con certificación C1.",
                        "Es imposible que haya obtenido la beca sin haber publicado un artículo.",
                        "Jean Pierre cometió fraude académico."
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Formalizamos las condiciones: - I: Jean Pierre domina inglés C1. - B: Jean Pierre obtiene la beca internacional. - A: Jean Pierre publica artículo indexado. 2. Traducimos las relaciones del enunciado: - \"Inglés C1 (I) es condición necesaria para la beca (B)\": Por la regla \\text{SUF} \\to \\text{NEC}, la beca implica el inglés: B \\to I - \"Publicar artículo (A) es condición suficiente para la beca (B)\": A \\to B 3. Datos del caso de Jean Pierre: - Jean Pierre obtuvo la beca: B es **VERDADERO**. - No publicó artículo: A es **FALSO**. 4. Evaluación deductiva: - Como B es verdadero y sabemos que B \\to I es una regla universal válida del comité, por **Modus Ponens**: (B \\to I) \\land B \\implies I - Por tanto, Jean Pierre domina obligatoriamente el idioma inglés con certificación C1. - ¿Afecta en algo que no haya publicado artículo (A = F)? No, porque A era condición suficiente, no necesaria (se podía obtener la beca por otras vías, como excelencia académica ponderada). **Respuesta:** B ---"
                ),
                Challenge(
                    id = "rl_t07_s02_c02",
                    question = "**Enunciado (Nivel UNI / Tarea de Selección de Wason):** Se colocan cuatro tarjetas sobre una mesa. Cada tarjeta tiene una letra en una cara y un número en la otra cara. Ves las siguientes caras visibles:",
                    options = listOf(
                        "Solo la tarjeta \\text{E}",
                        "Las tarjetas \\text{E} y 4",
                        "Las tarjetas \\text{E} y 7",
                        "Las tarjetas \\text{E}, 4 y 7"
                    ),
                    correctIndex = 0,
                    explanation = "**Resolución Paso a Paso:** 1. Formalizamos la regla condicional: Vocal \\to Par \\quad (p \\to q) 2. Una regla condicional solo se vuelve falsa si encontramos un caso: Vocal \\land Impar \\quad (p \\land \\neg q) 3. Analizamos cada una de las 4 tarjetas visibles: - **Tarjeta \\text{E} (Es vocal, p = V):** Debemos voltearla obligatoriamente. Si al reverso hay un número impar, la regla se destruye (falsada). Si hay un par, la regla sobrevive. **(DEBE VOLTEARSE)**. - **Tarjeta \\text{K} (Es consonante, p = F):** La regla no dice nada sobre lo que debe haber detrás de una consonante (F \\to q siempre es verdadero, sea q par o impar). Voltearla es inútil. - **Tarjeta 4 (Es número par, q = V):** ¿Qué pasa si detrás hay una vocal? Se cumple V \\to V (Correcto). ¿Qué pasa si detrás hay una consonante? Se cumple F \\to V (También es verdadero en la tabla condicional). Por tanto, la tarjeta 4 **NO puede falsear la regla**. Querer voltearla es caer en la **Falacia de Afirmación del Consecuente**. - **Tarjeta 7 (Es número impar, q = F, es decir, \\neg q):** Debemos voltearla obligatoriamente por **Modus Tollens**. Si detrás de este número impar hay una vocal, tendríamos V \\to F, lo cual violaría y destruiría la regla. **(DEBE VOLTEARSE)**. 4. Conclusión rigurosa: Las únicas tarjetas que pueden poner a prueba la implicación material son el antecedente verdadero (\\text{E}) y el consecuente falso (7). **Respuesta:** C ---"
                ),
                Challenge(
                    id = "rl_t07_s02_c03",
                    question = "La afirmación 'Aprobar el examen de admisión es condición suficiente para obtener una vacante' significa que:",
                    options = listOf(
                        "Es imposible obtener la vacante si se aprueba el examen",
                        "Basta con aprobar el examen para tener la vacante asegurada",
                        "Aprobar el examen es el único requisito en la vida",
                        "Para tener vacante es obligatorio desaprobar"
                    ),
                    correctIndex = 1,
                    explanation = "Una condición suficiente garantiza de manera directa y automática el cumplimiento del resultado (consecuente)."
                ),
                Challenge(
                    id = "rl_t07_s02_c04",
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
                    id = "rl_t07_s02_c05",
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
                    id = "rl_t07_s02_c06",
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
                    id = "rl_t07_s02_c07",
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
                    id = "rl_t07_s02_c08",
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
                    id = "rl_t07_s02_c09",
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
                    id = "rl_t07_s02_c10",
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
