package lenguaje

object LenguajeSemana05 {

    val lessons = listOf(
        LessonNode(
            id = "leng_t05_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "La Sintaxis y las Categorías Gramaticales: Variables e Invariables",
            theory = LessonTheory(
                content = """# TEMA 05: SINTAXIS: CATEGORÍAS GRAMATICALES, FRASES Y ESTRUCTURA FUNCIONAL

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Sintaxis del Español] --> B[Unidades de Análisis]
    B --> B1[Palabra / Categoría]
    B --> B2[Sintagma o Frase]
    B --> B3[Proposición / Oración]

    A --> C[Frases o Sintagmas]
    C --> C1[Frase Nominal - FN]
    C --> C2[Frase Verbal - FV]
    C --> C3[Frase Preposicional - FPrep]
    C --> C4[Frase Adjetival - FAdj / Adverbial - FAdv]

    C1 --> C1a[Núcleo: Sustantivo o Pronombre]
    C1 --> C1b[Modificador Directo: Det, Adj]
    C1 --> C1c[Modificador Indirecto: FPrep, Aposición]

    C2 --> C2a[Núcleo: Verbo simple, compuesto o perífrasis]
    C2 --> C2b[Complementos: OD, OI, C.Agente, C.Atributo, C.Predicativo, C.Circunstanciales]

    A --> D[Categorías Gramaticales]
    D --> D1[Variables: Sustantivo, Adjetivo, Determinante, Pronombre, Verbo]
    D --> D2[Invariables: Adverbio, Preposición, Conjunción]
```

---



## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA



### 3.2. Las Categorías Gramaticales en Perspectiva Morfosintáctica

#### A. El Sustantivo (Nombre)
- **Criterio Semántico:** Designa entidades materiales o inmateriales (seres, objetos, conceptos, sensaciones).
- **Criterio Morfológico:** Categoría variable con accidentes de género (masculino/femenino) y número (singular/plural). Posee lexema independiente.
- **Criterio Sintáctico:** Funciona por excelencia como núcleo de la Frase Nominal (FN), núcleo del Sujeto, núcleo de un Objeto Directo (OD), Término de Preposición, o Núcleo de Aposición.

#### B. El Adjetivo Calificativo y Determinativo
- **Adjetivo Calificativo:** Señala cualidades, estados o propiedades del sustantivo. Sintácticamente opera como **Modificador Directo (MD)** del sustantivo dentro de la FN, o como **Atributo** / **Predicativo** dentro de la Frase Verbal.
- **Determinantes:** Artículos (*el, la, los, las, lo*), demostrativos (*este, ese, aquel*), posesivos (*mi, tu, su, nuestro*), numerales (cardinales, ordinales, múltiplos, partitivos) e indefinidos (*algún, ningún, varios*). Actualizan y delimitan la extensión referencial del sustantivo. Funcionan exclusivamente como Modificadores Directos (MD).
  > **Diferencia Clave con el Pronombre:** El determinante acompaña a un sustantivo expreso (Det + N), mientras que el pronombre lo sustituye (Pron = Núcleo).

#### C. El Verbo: Estructura, Clasificación y Perífrasis
- **Definición:** Núcleo de la Frase Verbal (FV). Es la categoría con mayor inventario de morfemas flexivos amalgama: tiempo, modo, aspecto, número y persona.
- **Formas No Personales (Verboides):**
  1. *Infinitivo* (-ar, -er, -ir): función sustantiva nominal.
  2. *Gerundio* (-ando, -iendo): función adverbial modal o temporal.
  3. *Participio* (-ado, -ido, -to, -so, -cho): función adjetival pasiva.
- **Perífrasis Verbales:** Estructura conformada por un verbo auxiliar (conjugado, aporta morfemas flexivos) + (nexo opcional: *que, de, a*) + verboide principal (invariable, aporta el significado léxico):
  \text{Perífrasis} = \text{Verbo Auxiliar} + (\text{Nexo}) + \text{Verboide (Infinitivo/Gerundio/Participio)}
  *Ejemplos:* *Tiene que estudiar*, *Iba cantando*, *Fue derrotado*, *Suele almorzar*.

#### D. Categorías Invariables: Adverbio, Preposición y Conjunción
1. **Adverbio:** Modifica a tres categorías: a un **verbo** (*corre velozmente*), a un **adjetivo** (*muy perspicaz*) o a **otro adverbio** (*tan cerca*). Es invariable (carece de género y número). Sintácticamente funciona como Complemento Circunstancial (CC) o intensificador.
2. **Preposición:** Nexo subordinante por excelencia. Conecta un elemento regente con un elemento regido (llamado término). Inventario oficial RAE (23): *a, ante, bajo, cabe, con, contra, de, desde, durante, en, entre, hacia, hasta, mediante, para, por, según, sin, so, sobre, tras, versus, vía*.
3. **Conjunción:** Nexo coordinante (une elementos de igual jerarquía sintáctica: copulativas, disyuntivas, adversativas, distributivas, explicativas) o subordinante (introduce proposiciones dependientes: causales, consecutivas, condicionales, concesivas, finales, comparativas, ilativas).

---



### 3.4. Estructura de la Frase Verbal (FV) y sus Complementos
La Frase Verbal tiene como núcleo al verbo simple, compuesto o perífrasis verbal, y puede admitir los siguientes complementos funcionales:

| Complemento | Definición y Criterio de Reconocimiento | Prueba de Sustitución Sintáctica |
| :--- | :--- | :--- |
| **Objeto Directo (OD)** | Entidad que recibe directamente la acción transitiva. Si es persona o ser animado, lleva la preposición *a*. | Se sustituye por *lo, la, los, las*. En voz pasiva se convierte en **Sujeto Paciente**. |
| **Objeto Indirecto (OI)** | Destinatario, beneficiario o perjudicado de la acción verbal. Siempre encabezado por *a* o *para*. | Se sustituye por *le, les* (o *se* anteclítico a *lo/la*). Nunca pasa a sujeto en voz pasiva. |
| **Atributo** | Modifica al sujeto a través de un **verbo copulativo** (*ser, estar, parecer, yacer, permanecer*). | Es obligatorio. Se sustituye por el pronombre neutro **lo** invariable. Concuerda en género y número con el sujeto. |
| **Predicativo (C.Pred)** | Modifica simultáneamente al verbo no copulativo (predicativo) y al núcleo del sujeto (C.Pred Subjetivo) o al OD (C.Pred Objetivo). | No se sustituye por *lo*. Concuerda con el sustantivo al que califica (*Los atletas llegaron **exhaustos***). |
| **Complemento Agente** | Realiza la acción en la voz pasiva. Encabezado por *por* (raramente *de*). | En voz activa se transforma en el **Sujeto Agente**. |
| **Circunstancial (CC)** | Expresa circunstancias de tiempo, lugar, modo, causa, finalidad, instrumento, compañía, cantidad, etc. | Encabezado por FPrep o constituido por FAdv. Son prescindibles estructuralmente. |

---



## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES



### 4.1. Reglas Estrictas de Concordancia Gramatical
1. **Concordancia Nominal:**
   - Entre Sustantivo y Adjetivo/Determinante:
     \text{Género}(\text{Det/Adj}) = \text{Género}(\text{Sustantivo}) \quad \land \quad \text{Número}(\text{Det/Adj}) = \text{Número}(\text{Sustantivo})
   - Varios sustantivos de distinto género coordinados en singular: el adjetivo pospuesto concierta en **masculino plural**.
     *Ejemplo:* *El reloj y la pulsera **antiguos***.
   - Adjetivo antepuesto a varios sustantivos coordinados: concierta comúnmente con el **más próximo**.
     *Ejemplo:* *Con **extraordinaria** rapidez y valor*.
2. **Concordancia Verbal:**
   - Sujeto compuesto con nexo copulativo (*y, e*): verbo en **plural**.
     *Ejemplo:* *El rector y el decano **firmaron** el convenio*.
   - Sujeto colectivo en singular: verbo en **singular**.
     *Ejemplo:* *La multitud **aplaudió** al expositor* (la concordancia ad sensum *La multitud aplaudieron* es incorrecta según norma culta).

---



## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL



### Caso 1: Detección Forense de la Ambigüedad Sintáctica en Documentos Legales
En la redacción jurídica de un contrato de compraventa:
> *"Se indemnizará a los trabajadores y directivos despedidos injustamente."*
- **Análisis Sintáctico:** ¿El adjetivo calificativo *despedidos injustamente* modifica sólo a *directivos* (concordancia por proximidad) o al sintagma coordinado *trabajadores y directivos*?
- **Resolución Gramatical:** Al estar en masculino plural pospuesto a dos sustantivos masculinos, la interpretación canónica abarca a ambos, pero genera litigios interpretativos. La redacción inequívoca exige: *"A los directivos y a los trabajadores, ambos despedidos injustamente..."*.

---



## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS



### 2. Mnemotécnia de Pronombres Clíticos Átonos
- **Solo OD:** *lo, la, los, las*.
- **Solo OI:** *le, les*.
- **OD u OI según contexto:** *me, te, se, nos, os*.
  \text{OD} = \text{L-A-O} \quad | \quad \text{OI} = \text{L-E}

---



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Confundir Predicativo con Circunstancial de Modo:**
   - *Trampa:* *"Las niñas caminaban tranquilas."* El estudiante novato piensa: *¿Cómo caminaban? Tranquilas \rightarrow CCModo*.
   - *Realidad RAE:* *Tranquilas* es un **adjetivo variable** que concuerda en género y número con el sujeto (*Las niñas*). Los adverbios (CC) son invariables. Por tanto, es un **Complemento Predicativo Subjetivo**.
2. **El "Leísmo" y "Laísmo":**
   - *Error:* *"A María le vi en la biblioteca"* (Leísmo de persona femenina: vulgarismo).
   - *Corrección:* *"A María **la** vi en la biblioteca"* (Función OD).
3. **El Falso Queísmo y Dequeísmo:**
   - *Dequeísmo:* Insertar *de* indebidamente: *"Pienso de que vendrá"* (Prueba: *Pienso eso*, no *Pienso de eso* \rightarrow *"Pienso que vendrá"*).
   - *Queísmo:* Omitir *de* cuando el verbo lo rige: *"Me alegro que estés aquí"* (Prueba: *Me alegro de eso* \rightarrow *"Me alegro de que estés aquí"*).

---



## 8. 5 PROBLEMAS RESUELTOS GRADUADOS



### Problema 1 (Nivel Básico: Determinantes vs. Pronombres)
En el enunciado: *"Aquellos postulantes alcanzaron sus metas, pero estos no lograron las suyas"*, identifique la cantidad de determinantes y pronombres respectivamente.
- A) 2 determinantes y 2 pronombres
- B) 3 determinantes y 1 pronombre
- C) 2 determinantes y 3 pronombres
- D) 4 determinantes y 0 pronombres
- E) 1 determinante y 3 pronombres

**Resolución:**
1. *Aquellos* acompaña al sustantivo *postulantes* \rightarrow Determinante demostrativo.
2. *sus* acompaña a *metas* \rightarrow Determinante posesivo.
3. *estos* no acompaña a sustantivo (núcleo) \rightarrow Pronombre demostrativo.
4. *las suyas* \rightarrow *suyas* es pronombre posesivo sustantivado por el artículo *las*.
Total: 2 determinantes (*Aquellos, sus*) y 2 pronombres (*estos, las suyas*).
**Respuesta:** **A**

---



### Problema 2 (Nivel Intermedio: Perífrasis Verbal)
¿En cuál de las siguientes opciones encontramos una auténtica perífrasis verbal?
- A) Deseo postular a Medicina Humana este año.
- B) El estudiante suele repasar sus apuntes por la noche.
- C) Prometió entregar el informe a tiempo.
- D) Necesita comprar nuevos libros de álgebra.
- E) Espera rendir un examen extraordinario el domingo.

**Resolución:**
En una perífrasis verbal, el verbo auxiliar pierde parcial o totalmente su significado léxico original y funciona como operador gramatical de tiempo/aspecto/modo, no pudiendo sustituirse el infinitivo por un pronombre neutro (*eso*).
- En A, C, D, E: *Deseo eso*, *Prometió eso*, *Necesita eso*, *Espera eso* (son verbos transitivos plenos con proposición subordinada sustantiva en función de OD).
- En B: *suele repasar* indica aspecto frecuentativo o habitual; no se puede decir *El estudiante suele eso*. Constituye una perífrasis verbal modal/aspectual (Auxiliar + Infinitivo).
**Respuesta:** **B**

---



### Problema 4 (Nivel Avanzado: Estructura de la Frase Nominal)
Analice la siguiente Frase Nominal: *"La fascinante novela de misterio que leí ayer"* y determine la secuencia correcta de sus constituyentes sintácticos:
- A) MD + MD + Núcleo + MI + MI
- B) MD + Núcleo + MD + MI + CC
- C) MD + MD + Núcleo + MI + MD
- D) Núcleo + MD + MI + Aposición + MI
- E) MD + MD + Núcleo + Aposición + MI

**Resolución:**
- *La* \rightarrow Determinante artículo = **MD**.
- *fascinante* \rightarrow Adjetivo calificativo = **MD**.
- *novela* \rightarrow Sustantivo común = **Núcleo (N)**.
- *de misterio* \rightarrow Frase preposicional subordinada al núcleo = **MI**.
- *que leí ayer* \rightarrow Proposición subordinada adjetiva encabezada por pronombre relativo *que*, funcionando como modificador con preposición nula = actúa como **MI** o **MD oracional** según la escuela, pero en la taxonomía UNSA/UNMSM toda subordinada adjetiva especificativa es clasificada funcionalmente como **MI** (o modificador adjetival dependiente). No obstante, en la taxonomía canónica: *La* (MD) + *fascinante* (MD) + *novela* (N) + *de misterio* (MI) + *que leí ayer* (MI/adjetiva explicativa o especificativa). La opción que modela los dos modificadores preposicional/oracional dependientes es A (MD + MD + Núcleo + MI + MI).
**Respuesta:** **A**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Amalgama (Morfema flexivo):** Morfema acumulativo que expresa simultáneamente varios valores gramaticales (tiempo, modo, aspecto, número y persona en la desinencia verbal española).
2. **Aposición:** Modificador nominal de la FN que especifica o explica al núcleo sin enlace preposicional obligatorio.
3. **Atributo:** Función sintáctica oracional propia de predicados copulativos que atribuye una cualidad al sujeto y conmuta por *lo*.
4. **Catáfora:** Mecanismo cohesivo en el cual un elemento lingüístico anticipa el significado de una palabra que aparecerá posteriormente en el discurso.
5. **Clítico:** Pronombre personal átono que se apoya prosódicamente en el verbo anterior (enclítico: *dímelo*) o posterior (proclítico: *te vi*).
6. **Complemento Agente:** Sintagma preposicional (encabezado por *por*) que realiza la acción en oraciones en voz pasiva.
7. **Complemento Predicativo:** Adjetivo o sintagma que califica al sujeto o al OD pero dentro del marco de un verbo predicativo (no copulativo).
8. **Perífrasis Verbal:** Unión sintáctica de dos o más formas verbales que funcionan unitariamente como un solo núcleo del predicado.
9. **Sintagma (Frase):** Unidad lingüística intermedia constituida por una palabra o un grupo de palabras articuladas en torno a un núcleo jerárquico.
10. **Verboide:** Forma no flexiva ni personal del verbo (infinitivo, gerundio, participio) carente de desinencias temporo-personales independientes.

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Qué diferencia a un Atributo de un Complemento Predicativo Subjetivo? | El Atributo aparece únicamente con **verbos copulativos** (*ser, estar, parecer*) y conmuta por *lo*. El Predicativo aparece con **verbos plenos/predicativos** y no conmuta por *lo*. Ambos concuerdan con el sujeto. |
| ¿Cómo se verifica infaliblemente que un sintagma es Objeto Directo? | 1. Conmuta por *lo, la, los, las*. 2. Al transformar la oración a **voz pasiva**, pasa a ser el **Sujeto Paciente**. |
| ¿Cuáles son las 3 categorías a las que puede modificar un Adverbio? | Modifica a: 1. Un **Verbo** (*lee bien*), 2. Un **Adjetivo** (*muy perspicaz*), 3. **Otro Adverbio** (*bastante lejos*). |
| ¿Qué ocurre con la concordancia adjetival pospuesta a sustantivos de distinto género? | El adjetivo pospuesto concierta obligatoriamente en **masculino plural** (*La manzana y el plátano deliciosos*). |
| ¿Cuál es la estructura interna de una Frase Nominal canónica? | \text{FN} = (\text{MD}) + \text{Núcleo (Sustantivo)} + (\text{MD}) + (\text{MI}) + (\text{Aposición}). |

---



### 3.3. Estructura de la Frase Nominal (FN)
La Frase Nominal posee la siguiente estructura nuclear y modificadora:

\text{FN} = (\text{MD})^* + \text{Núcleo (Sustantivo/Pronombre)} + (\text{MD})^* + (\text{MI})^* + (\text{Aposición})^*

- **Núcleo (N):** Sustantivo, pronombre o elemento sustantivado.
- **Modificador Directo (MD):** Artículos, determinantes demostrativos/posesivos/numerales y adjetivos sin preposición de por medio.
- **Modificador Indirecto (MI):**
  1. Frase preposicional encabezada por preposición: *El libro **de gramática***.
  2. Construcción comparativa encabezada por *como*, *cual*: *Mujeres **como tú***.
- **Aposición (Apos):** Explicativa (entre comas, intercambiable con el núcleo: *Arequipa, **la Ciudad Blanca**, resistió*) o Especificativa (sin comas, delimita: *El volcán **Misti** despertó*).

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. En la frase: *"Compró flores para su madre ayer"*, el sintagma *"para su madre"* funciona como:
   - A) Objeto Directo
   - B) Objeto Indirecto
   - C) Circunstancial de Finalidad
   - D) Complemento Atributo
   - *Respuesta correcta:* **B** (Destinataria de la acción que conmuta por *le* \rightarrow *Le compró flores*).
2. Es una categoría gramatical invariable:
   - A) Pronombre
   - B) Adjetivo determinativo
   - C) Preposición
   - D) Verboide participio
   - *Respuesta correcta:* **C** (Carece de género, número, tiempo o persona).
3. En la oración *"Los atletas corrieron cansados"*, la palabra *cansados* es:
   - A) Circunstancial de Modo
   - B) Atributo
   - C) Complemento Predicativo Subjetivo
   - D) Objeto Directo
   - *Respuesta correcta:* **C** (Adjetivo concordante con el sujeto dentro de un verbo predicativo).

---



### Problema 3 (Nivel Intermedio-Avanzado: Complemento Predicativo)
En la oración: *"Los jueces declararon culpable al acusado durante la última sesión"*, el elemento subrayado *culpable* cumple la función sintáctica de:
- A) Complemento Circunstancial de Modo
- B) Modificador Directo del núcleo del predicado
- C) Atributo
- D) Complemento Predicativo Objetivo
- E) Objeto Directo

**Resolución:**
1. El verbo es *declararon* (verbo predicativo, no copulativo; por lo tanto, no puede llevar Atributo).
2. El elemento *al acusado* es el Objeto Directo (*Los jueces lo declararon culpable*).
3. La palabra *culpable* es un adjetivo que califica y concuerda con el OD (*al acusado* \rightarrow singular; si fueran acusados, sería *culpables*).
4. Al modificar simultáneamente al verbo y al Objeto Directo dentro de un predicado no copulativo, funciona como **Complemento Predicativo Objetivo**.
**Respuesta:** **D**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Examine minuciosamente el siguiente texto:
> *"A los más destacados alumnos del curso, el profesor de física les entregó entusiasmado las medallas de honor en el auditorio central."*

Determine el valor de verdad (V o F) de las siguientes afirmaciones:
I. El sintagma *"A los más destacados alumnos del curso"* cumple la función de Objeto Indirecto duplicado por el clítico *"les"*.
II. La palabra *"entusiasmado"* funciona como Complemento Circunstancial de Modo al responder a la pregunta *¿cómo?*.
III. El núcleo del sujeto posee como Modificador Indirecto a la frase preposicional *"de física"*.
IV. *"las medallas de honor"* constituye el Objeto Directo, cuyo núcleo posee a su vez un Modificador Indirecto.

- A) V - F - V - V
- B) V - V - V - V
- C) F - F - V - V
- D) V - F - F - V
- E) F - V - F - F

**Resolución Paso a Paso:**
1. **Identificación del Sujeto:** ¿Quién entregó las medallas? *"el profesor de física"*.
   - *el* = MD.
   - *profesor* = Núcleo del Sujeto.
   - *de física* = Frase preposicional = MI.
   \rightarrow La afirmación **III es VERDADERA**.
2. **Análisis del Verbo y sus Complementos:**
   - Verbo principal: *entregó*.
   - ¿Qué entregó?: *"las medallas de honor"*. Se sustituye por *las*: *se las entregó*. En voz pasiva: *Las medallas de honor fueron entregadas por el profesor*. Es **Objeto Directo**. Su núcleo *medallas* tiene como MI a *de honor*.
   \rightarrow La afirmación **IV es VERDADERA**.
   - ¿A quiénes entregó?: *"A los más destacados alumnos del curso"*. Se sustituye por *les* y se halla correferencialmente duplicado por el clítico *les*. Es **Objeto Indirecto**.
   \rightarrow La afirmación **I es VERDADERA**.
   - *entusiasmado*: Es un adjetivo calificativo masculino singular. Concuerda con el núcleo del sujeto (*profesor*). Si fueran dos profesoras, sería *entusiasmadas*. Por ende, NO es adverbio ni Circunstancial de Modo; es un **Complemento Predicativo Subjetivo**.
   \rightarrow La afirmación **II es FALSA**.
Secuencia obtenida: **V - F - V - V**.
**Respuesta:** **A**

---



### 3.1. Definición y Objeto de la Sintaxis
La **sintaxis** es el componente de la gramática que estudia las reglas y principios que gobiernan la combinación de los constituyentes sintácticos y la formación de unidades superiores como sintagmas (frases), proposiciones y oraciones. Determina el orden jerárquico y las funciones sintácticas (sujeto, predicado, complementos)."""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t05_s01_c01",
                    question = "La categoría gramatical que tiene como rasgo exclusivo modificar a un verbo, a un adjetivo o a otro adverbio es el:",
                    options = listOf(
                        "Adverbio",
                        "Determinante",
                        "Pronombre relativo",
                        "Participio activo",
                    ),
                    correctIndex = 0,
                    explanation = "El adverbio es la categoría invariable modificadora por excelencia capaz de calificar o graduar a un verbo, a un adjetivo o a otro adverbio."
                ),
                Challenge(
                    id = "leng_t05_s01_c02",
                    question = "En la frase 'Esos jóvenes ingresaron a la universidad, pero aquellos aún esperan sus resultados', las palabras 'esos' y 'aquellos' funcionan respectivamente como:",
                    options = listOf(
                        "Pronombre y determinante",
                        "Determinante demostrativo y pronombre demostrativo",
                        "Adjetivos calificativos ambos",
                        "Adverbios de lugar",
                    ),
                    correctIndex = 1,
                    explanation = "'Esos' acompaña directamente al sustantivo 'jóvenes' (determinante); 'aquellos' reemplaza al sustantivo y asume el rol de núcleo (pronombre)."
                ),
                Challenge(
                    id = "leng_t05_s01_c03",
                    question = "¿Cuál de las siguientes formas verbales contiene una auténtica perífrasis verbal?",
                    options = listOf(
                        "Vio a los niños jugar en el parque",
                        "Prometió estudiar para el examen",
                        "Desea comer una fruta fresca",
                        "Tiene que entregar el informe hoy",
                    ),
                    correctIndex = 3,
                    explanation = "En 'tiene que entregar', el verbo auxiliar 'tiene' se fusiona con el nexo 'que' y el infinitivo 'entregar' formando una sola unidad predicativa perifrástica."
                ),
                Challenge(
                    id = "leng_t05_s01_c04",
                    question = "Los verboides infinitivo, gerundio y participio se caracterizan formalmente en el plano morfológico porque:",
                    options = listOf(
                        "Funcionan siempre como núcleos exclusivos de predicado sin auxiliar",
                        "Son invariables como las preposiciones",
                        "Carecen de desinencias flexivas de persona, número y tiempo (formas no personales)",
                        "Expresan modo subjuntivo y persona gramatical",
                    ),
                    correctIndex = 2,
                    explanation = "Los verboides son formas no personales del verbo porque no poseen morfemas amalgama de persona, número, tiempo ni modo."
                ),
                Challenge(
                    id = "leng_t05_s01_c05",
                    question = "¿Cuál de los siguientes grupos está compuesto únicamente por categorías gramaticales invariables?",
                    options = listOf(
                        "Pronombre, determinante, adverbio",
                        "Verbo, adverbio, preposición",
                        "Adverbio, preposición, conjunción",
                        "Sustantivo, adjetivo, verbo",
                    ),
                    correctIndex = 2,
                    explanation = "El adverbio, la preposición y la conjunción no admiten morfemas flexivos de género ni número; son categorías totalmente invariables."
                ),
                Challenge(
                    id = "leng_t05_s01_c06",
                    question = "En la expresión 'Con extraordinaria rapidez y valor resolvió el enigma', la concordancia del adjetivo 'extraordinaria' antepuesto a dos sustantivos es correcta porque:",
                    options = listOf(
                        "Concierta por proximidad con el primer sustantivo femenino singular",
                        "Debe ir obligatoriamente en masculino plural",
                        "El adjetivo antepuesto es neutro",
                        "No se aplica concordancia a sustantivos abstractos",
                    ),
                    correctIndex = 0,
                    explanation = "Cuando un adjetivo califica a varios sustantivos coordinados y se antepone a ellos, la norma culta prescribe concordar en género y número con el más próximo."
                ),
                Challenge(
                    id = "leng_t05_s01_c07",
                    question = "En la oración 'La jauría huyó despavorida por el valle', la concordancia entre el sujeto colectivo 'la jauría' y el verbo 'huyó' es correcta porque:",
                    options = listOf(
                        "Los colectivos no concuerdan en persona",
                        "Depende del número de animales de la jauría",
                        "El verbo debe estar en singular concertando con la forma gramatical del núcleo singular",
                        "Debe escribirse obligatoriamente en plural: 'huyeron'",
                    ),
                    correctIndex = 2,
                    explanation = "Los sustantivos colectivos en número singular exigen la concordancia del verbo en tercera persona del singular según la norma estándar."
                ),
                Challenge(
                    id = "leng_t05_s01_c08",
                    question = "¿Cuántas preposiciones contiene la oración 'Bajo la sombra del árbol conversó con sus amigos sobre el examen hasta el anochecer'?",
                    options = listOf(
                        "5",
                        "3",
                        "4",
                        "6",
                    ),
                    correctIndex = 0,
                    explanation = "Las preposiciones son 5: 'bajo', 'de' (en la contracción del = de + el), 'con', 'sobre' y 'hasta'."
                ),
                Challenge(
                    id = "leng_t05_s01_c09",
                    question = "En 'Llegaron muy temprano a la ceremonia', la palabra 'muy' funciona morfosintácticamente como:",
                    options = listOf(
                        "Adjetivo determinativo cuantitativo",
                        "Adverbio de cantidad que intensifica a otro adverbio ('temprano')",
                        "Conjunción subordinante",
                        "Pronombre enfático",
                    ),
                    correctIndex = 1,
                    explanation = "'Muy' es un adverbio de cantidad e intensidad que modifica directamente a otro adverbio ('temprano')."
                ),
                Challenge(
                    id = "leng_t05_s01_c10",
                    question = "La conjunción 'pero' en 'Estudió con gran empeño, pero no alcanzó el puntaje' se clasifica sintácticamente como:",
                    options = listOf(
                        "Nexo subordinante concesivo",
                        "Conjunción coordinante adversativa",
                        "Conjunción subordinante causal",
                        "Preposición ilativa",
                    ),
                    correctIndex = 1,
                    explanation = "'Pero' es una conjunción coordinante adversativa que expresa oposición, objeción o restricción entre dos proposiciones."
                ),
            )
        ),
        LessonNode(
            id = "leng_t05_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Estructura de la Frase Nominal (FN), Frase Verbal (FV) y sus Complementos",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Sintaxis del Español] --> B[Unidades de Análisis]
    B --> B1[Palabra / Categoría]
    B --> B2[Sintagma o Frase]
    B --> B3[Proposición / Oración]

    A --> C[Frases o Sintagmas]
    C --> C1[Frase Nominal - FN]
    C --> C2[Frase Verbal - FV]
    C --> C3[Frase Preposicional - FPrep]
    C --> C4[Frase Adjetival - FAdj / Adverbial - FAdv]

    C1 --> C1a[Núcleo: Sustantivo o Pronombre]
    C1 --> C1b[Modificador Directo: Det, Adj]
    C1 --> C1c[Modificador Indirecto: FPrep, Aposición]

    C2 --> C2a[Núcleo: Verbo simple, compuesto o perífrasis]
    C2 --> C2b[Complementos: OD, OI, C.Agente, C.Atributo, C.Predicativo, C.Circunstanciales]

    A --> D[Categorías Gramaticales]
    D --> D1[Variables: Sustantivo, Adjetivo, Determinante, Pronombre, Verbo]
    D --> D2[Invariables: Adverbio, Preposición, Conjunción]
```

---



### 3.1. Definición y Objeto de la Sintaxis
La **sintaxis** es el componente de la gramática que estudia las reglas y principios que gobiernan la combinación de los constituyentes sintácticos y la formación de unidades superiores como sintagmas (frases), proposiciones y oraciones. Determina el orden jerárquico y las funciones sintácticas (sujeto, predicado, complementos).



### 3.2. Las Categorías Gramaticales en Perspectiva Morfosintáctica

#### A. El Sustantivo (Nombre)
- **Criterio Semántico:** Designa entidades materiales o inmateriales (seres, objetos, conceptos, sensaciones).
- **Criterio Morfológico:** Categoría variable con accidentes de género (masculino/femenino) y número (singular/plural). Posee lexema independiente.
- **Criterio Sintáctico:** Funciona por excelencia como núcleo de la Frase Nominal (FN), núcleo del Sujeto, núcleo de un Objeto Directo (OD), Término de Preposición, o Núcleo de Aposición.

#### B. El Adjetivo Calificativo y Determinativo
- **Adjetivo Calificativo:** Señala cualidades, estados o propiedades del sustantivo. Sintácticamente opera como **Modificador Directo (MD)** del sustantivo dentro de la FN, o como **Atributo** / **Predicativo** dentro de la Frase Verbal.
- **Determinantes:** Artículos (*el, la, los, las, lo*), demostrativos (*este, ese, aquel*), posesivos (*mi, tu, su, nuestro*), numerales (cardinales, ordinales, múltiplos, partitivos) e indefinidos (*algún, ningún, varios*). Actualizan y delimitan la extensión referencial del sustantivo. Funcionan exclusivamente como Modificadores Directos (MD).
  > **Diferencia Clave con el Pronombre:** El determinante acompaña a un sustantivo expreso (Det + N), mientras que el pronombre lo sustituye (Pron = Núcleo).

#### C. El Verbo: Estructura, Clasificación y Perífrasis
- **Definición:** Núcleo de la Frase Verbal (FV). Es la categoría con mayor inventario de morfemas flexivos amalgama: tiempo, modo, aspecto, número y persona.
- **Formas No Personales (Verboides):**
  1. *Infinitivo* (-ar, -er, -ir): función sustantiva nominal.
  2. *Gerundio* (-ando, -iendo): función adverbial modal o temporal.
  3. *Participio* (-ado, -ido, -to, -so, -cho): función adjetival pasiva.
- **Perífrasis Verbales:** Estructura conformada por un verbo auxiliar (conjugado, aporta morfemas flexivos) + (nexo opcional: *que, de, a*) + verboide principal (invariable, aporta el significado léxico):
  \text{Perífrasis} = \text{Verbo Auxiliar} + (\text{Nexo}) + \text{Verboide (Infinitivo/Gerundio/Participio)}
  *Ejemplos:* *Tiene que estudiar*, *Iba cantando*, *Fue derrotado*, *Suele almorzar*.

#### D. Categorías Invariables: Adverbio, Preposición y Conjunción
1. **Adverbio:** Modifica a tres categorías: a un **verbo** (*corre velozmente*), a un **adjetivo** (*muy perspicaz*) o a **otro adverbio** (*tan cerca*). Es invariable (carece de género y número). Sintácticamente funciona como Complemento Circunstancial (CC) o intensificador.
2. **Preposición:** Nexo subordinante por excelencia. Conecta un elemento regente con un elemento regido (llamado término). Inventario oficial RAE (23): *a, ante, bajo, cabe, con, contra, de, desde, durante, en, entre, hacia, hasta, mediante, para, por, según, sin, so, sobre, tras, versus, vía*.
3. **Conjunción:** Nexo coordinante (une elementos de igual jerarquía sintáctica: copulativas, disyuntivas, adversativas, distributivas, explicativas) o subordinante (introduce proposiciones dependientes: causales, consecutivas, condicionales, concesivas, finales, comparativas, ilativas).

---



### 3.3. Estructura de la Frase Nominal (FN)
La Frase Nominal posee la siguiente estructura nuclear y modificadora:

\text{FN} = (\text{MD})^* + \text{Núcleo (Sustantivo/Pronombre)} + (\text{MD})^* + (\text{MI})^* + (\text{Aposición})^*

- **Núcleo (N):** Sustantivo, pronombre o elemento sustantivado.
- **Modificador Directo (MD):** Artículos, determinantes demostrativos/posesivos/numerales y adjetivos sin preposición de por medio.
- **Modificador Indirecto (MI):**
  1. Frase preposicional encabezada por preposición: *El libro **de gramática***.
  2. Construcción comparativa encabezada por *como*, *cual*: *Mujeres **como tú***.
- **Aposición (Apos):** Explicativa (entre comas, intercambiable con el núcleo: *Arequipa, **la Ciudad Blanca**, resistió*) o Especificativa (sin comas, delimita: *El volcán **Misti** despertó*).

---



### 3.4. Estructura de la Frase Verbal (FV) y sus Complementos
La Frase Verbal tiene como núcleo al verbo simple, compuesto o perífrasis verbal, y puede admitir los siguientes complementos funcionales:

| Complemento | Definición y Criterio de Reconocimiento | Prueba de Sustitución Sintáctica |
| :--- | :--- | :--- |
| **Objeto Directo (OD)** | Entidad que recibe directamente la acción transitiva. Si es persona o ser animado, lleva la preposición *a*. | Se sustituye por *lo, la, los, las*. En voz pasiva se convierte en **Sujeto Paciente**. |
| **Objeto Indirecto (OI)** | Destinatario, beneficiario o perjudicado de la acción verbal. Siempre encabezado por *a* o *para*. | Se sustituye por *le, les* (o *se* anteclítico a *lo/la*). Nunca pasa a sujeto en voz pasiva. |
| **Atributo** | Modifica al sujeto a través de un **verbo copulativo** (*ser, estar, parecer, yacer, permanecer*). | Es obligatorio. Se sustituye por el pronombre neutro **lo** invariable. Concuerda en género y número con el sujeto. |
| **Predicativo (C.Pred)** | Modifica simultáneamente al verbo no copulativo (predicativo) y al núcleo del sujeto (C.Pred Subjetivo) o al OD (C.Pred Objetivo). | No se sustituye por *lo*. Concuerda con el sustantivo al que califica (*Los atletas llegaron **exhaustos***). |
| **Complemento Agente** | Realiza la acción en la voz pasiva. Encabezado por *por* (raramente *de*). | En voz activa se transforma en el **Sujeto Agente**. |
| **Circunstancial (CC)** | Expresa circunstancias de tiempo, lugar, modo, causa, finalidad, instrumento, compañía, cantidad, etc. | Encabezado por FPrep o constituido por FAdv. Son prescindibles estructuralmente. |

---



### 1. Hack de Oro: Reconocimiento Infalible de OD vs. OI
- Para comprobar un **Objeto Directo**:
  1. Sustituir por *lo, la, los, las*.
  2. Pasar a **Voz Pasiva**: si el supuesto OD pasa a ser Sujeto Paciente, es **100% OD**.
     *Ejemplo:* *"El jurado premió a la científica."* \rightarrow *"La científica fue premiada por el jurado."* (Comprobado: *a la científica* es OD, no OI).
- Si al pasar a pasiva la frase preposicional no puede actuar como sujeto, se trata de un **OI**:
  *Ejemplo:* *"Escribió a su madre."* \rightarrow Incapaz de: *"Su madre fue escrita por él"*. Por tanto, *a su madre* es OI (*Le escribió*).



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Confundir Predicativo con Circunstancial de Modo:**
   - *Trampa:* *"Las niñas caminaban tranquilas."* El estudiante novato piensa: *¿Cómo caminaban? Tranquilas \rightarrow CCModo*.
   - *Realidad RAE:* *Tranquilas* es un **adjetivo variable** que concuerda en género y número con el sujeto (*Las niñas*). Los adverbios (CC) son invariables. Por tanto, es un **Complemento Predicativo Subjetivo**.
2. **El "Leísmo" y "Laísmo":**
   - *Error:* *"A María le vi en la biblioteca"* (Leísmo de persona femenina: vulgarismo).
   - *Corrección:* *"A María **la** vi en la biblioteca"* (Función OD).
3. **El Falso Queísmo y Dequeísmo:**
   - *Dequeísmo:* Insertar *de* indebidamente: *"Pienso de que vendrá"* (Prueba: *Pienso eso*, no *Pienso de eso* \rightarrow *"Pienso que vendrá"*).
   - *Queísmo:* Omitir *de* cuando el verbo lo rige: *"Me alegro que estés aquí"* (Prueba: *Me alegro de eso* \rightarrow *"Me alegro de que estés aquí"*).

---



### Problema 3 (Nivel Intermedio-Avanzado: Complemento Predicativo)
En la oración: *"Los jueces declararon culpable al acusado durante la última sesión"*, el elemento subrayado *culpable* cumple la función sintáctica de:
- A) Complemento Circunstancial de Modo
- B) Modificador Directo del núcleo del predicado
- C) Atributo
- D) Complemento Predicativo Objetivo
- E) Objeto Directo

**Resolución:**
1. El verbo es *declararon* (verbo predicativo, no copulativo; por lo tanto, no puede llevar Atributo).
2. El elemento *al acusado* es el Objeto Directo (*Los jueces lo declararon culpable*).
3. La palabra *culpable* es un adjetivo que califica y concuerda con el OD (*al acusado* \rightarrow singular; si fueran acusados, sería *culpables*).
4. Al modificar simultáneamente al verbo y al Objeto Directo dentro de un predicado no copulativo, funciona como **Complemento Predicativo Objetivo**.
**Respuesta:** **D**

---



### Problema 4 (Nivel Avanzado: Estructura de la Frase Nominal)
Analice la siguiente Frase Nominal: *"La fascinante novela de misterio que leí ayer"* y determine la secuencia correcta de sus constituyentes sintácticos:
- A) MD + MD + Núcleo + MI + MI
- B) MD + Núcleo + MD + MI + CC
- C) MD + MD + Núcleo + MI + MD
- D) Núcleo + MD + MI + Aposición + MI
- E) MD + MD + Núcleo + Aposición + MI

**Resolución:**
- *La* \rightarrow Determinante artículo = **MD**.
- *fascinante* \rightarrow Adjetivo calificativo = **MD**.
- *novela* \rightarrow Sustantivo común = **Núcleo (N)**.
- *de misterio* \rightarrow Frase preposicional subordinada al núcleo = **MI**.
- *que leí ayer* \rightarrow Proposición subordinada adjetiva encabezada por pronombre relativo *que*, funcionando como modificador con preposición nula = actúa como **MI** o **MD oracional** según la escuela, pero en la taxonomía UNSA/UNMSM toda subordinada adjetiva especificativa es clasificada funcionalmente como **MI** (o modificador adjetival dependiente). No obstante, en la taxonomía canónica: *La* (MD) + *fascinante* (MD) + *novela* (N) + *de misterio* (MI) + *que leí ayer* (MI/adjetiva explicativa o especificativa). La opción que modela los dos modificadores preposicional/oracional dependientes es A (MD + MD + Núcleo + MI + MI).
**Respuesta:** **A**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Examine minuciosamente el siguiente texto:
> *"A los más destacados alumnos del curso, el profesor de física les entregó entusiasmado las medallas de honor en el auditorio central."*

Determine el valor de verdad (V o F) de las siguientes afirmaciones:
I. El sintagma *"A los más destacados alumnos del curso"* cumple la función de Objeto Indirecto duplicado por el clítico *"les"*.
II. La palabra *"entusiasmado"* funciona como Complemento Circunstancial de Modo al responder a la pregunta *¿cómo?*.
III. El núcleo del sujeto posee como Modificador Indirecto a la frase preposicional *"de física"*.
IV. *"las medallas de honor"* constituye el Objeto Directo, cuyo núcleo posee a su vez un Modificador Indirecto.

- A) V - F - V - V
- B) V - V - V - V
- C) F - F - V - V
- D) V - F - F - V
- E) F - V - F - F

**Resolución Paso a Paso:**
1. **Identificación del Sujeto:** ¿Quién entregó las medallas? *"el profesor de física"*.
   - *el* = MD.
   - *profesor* = Núcleo del Sujeto.
   - *de física* = Frase preposicional = MI.
   \rightarrow La afirmación **III es VERDADERA**.
2. **Análisis del Verbo y sus Complementos:**
   - Verbo principal: *entregó*.
   - ¿Qué entregó?: *"las medallas de honor"*. Se sustituye por *las*: *se las entregó*. En voz pasiva: *Las medallas de honor fueron entregadas por el profesor*. Es **Objeto Directo**. Su núcleo *medallas* tiene como MI a *de honor*.
   \rightarrow La afirmación **IV es VERDADERA**.
   - ¿A quiénes entregó?: *"A los más destacados alumnos del curso"*. Se sustituye por *les* y se halla correferencialmente duplicado por el clítico *les*. Es **Objeto Indirecto**.
   \rightarrow La afirmación **I es VERDADERA**.
   - *entusiasmado*: Es un adjetivo calificativo masculino singular. Concuerda con el núcleo del sujeto (*profesor*). Si fueran dos profesoras, sería *entusiasmadas*. Por ende, NO es adverbio ni Circunstancial de Modo; es un **Complemento Predicativo Subjetivo**.
   \rightarrow La afirmación **II es FALSA**.
Secuencia obtenida: **V - F - V - V**.
**Respuesta:** **A**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Amalgama (Morfema flexivo):** Morfema acumulativo que expresa simultáneamente varios valores gramaticales (tiempo, modo, aspecto, número y persona en la desinencia verbal española).
2. **Aposición:** Modificador nominal de la FN que especifica o explica al núcleo sin enlace preposicional obligatorio.
3. **Atributo:** Función sintáctica oracional propia de predicados copulativos que atribuye una cualidad al sujeto y conmuta por *lo*.
4. **Catáfora:** Mecanismo cohesivo en el cual un elemento lingüístico anticipa el significado de una palabra que aparecerá posteriormente en el discurso.
5. **Clítico:** Pronombre personal átono que se apoya prosódicamente en el verbo anterior (enclítico: *dímelo*) o posterior (proclítico: *te vi*).
6. **Complemento Agente:** Sintagma preposicional (encabezado por *por*) que realiza la acción en oraciones en voz pasiva.
7. **Complemento Predicativo:** Adjetivo o sintagma que califica al sujeto o al OD pero dentro del marco de un verbo predicativo (no copulativo).
8. **Perífrasis Verbal:** Unión sintáctica de dos o más formas verbales que funcionan unitariamente como un solo núcleo del predicado.
9. **Sintagma (Frase):** Unidad lingüística intermedia constituida por una palabra o un grupo de palabras articuladas en torno a un núcleo jerárquico.
10. **Verboide:** Forma no flexiva ni personal del verbo (infinitivo, gerundio, participio) carente de desinencias temporo-personales independientes.

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Qué diferencia a un Atributo de un Complemento Predicativo Subjetivo? | El Atributo aparece únicamente con **verbos copulativos** (*ser, estar, parecer*) y conmuta por *lo*. El Predicativo aparece con **verbos plenos/predicativos** y no conmuta por *lo*. Ambos concuerdan con el sujeto. |
| ¿Cómo se verifica infaliblemente que un sintagma es Objeto Directo? | 1. Conmuta por *lo, la, los, las*. 2. Al transformar la oración a **voz pasiva**, pasa a ser el **Sujeto Paciente**. |
| ¿Cuáles son las 3 categorías a las que puede modificar un Adverbio? | Modifica a: 1. Un **Verbo** (*lee bien*), 2. Un **Adjetivo** (*muy perspicaz*), 3. **Otro Adverbio** (*bastante lejos*). |
| ¿Qué ocurre con la concordancia adjetival pospuesta a sustantivos de distinto género? | El adjetivo pospuesto concierta obligatoriamente en **masculino plural** (*La manzana y el plátano deliciosos*). |
| ¿Cuál es la estructura interna de una Frase Nominal canónica? | \text{FN} = (\text{MD}) + \text{Núcleo (Sustantivo)} + (\text{MD}) + (\text{MI}) + (\text{Aposición}). |

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. En la frase: *"Compró flores para su madre ayer"*, el sintagma *"para su madre"* funciona como:
   - A) Objeto Directo
   - B) Objeto Indirecto
   - C) Circunstancial de Finalidad
   - D) Complemento Atributo
   - *Respuesta correcta:* **B** (Destinataria de la acción que conmuta por *le* \rightarrow *Le compró flores*).
2. Es una categoría gramatical invariable:
   - A) Pronombre
   - B) Adjetivo determinativo
   - C) Preposición
   - D) Verboide participio
   - *Respuesta correcta:* **C** (Carece de género, número, tiempo o persona).
3. En la oración *"Los atletas corrieron cansados"*, la palabra *cansados* es:
   - A) Circunstancial de Modo
   - B) Atributo
   - C) Complemento Predicativo Subjetivo
   - D) Objeto Directo
   - *Respuesta correcta:* **C** (Adjetivo concordante con el sujeto dentro de un verbo predicativo).

---



### Caso 1: Detección Forense de la Ambigüedad Sintáctica en Documentos Legales
En la redacción jurídica de un contrato de compraventa:
> *"Se indemnizará a los trabajadores y directivos despedidos injustamente."*
- **Análisis Sintáctico:** ¿El adjetivo calificativo *despedidos injustamente* modifica sólo a *directivos* (concordancia por proximidad) o al sintagma coordinado *trabajadores y directivos*?
- **Resolución Gramatical:** Al estar en masculino plural pospuesto a dos sustantivos masculinos, la interpretación canónica abarca a ambos, pero genera litigios interpretativos. La redacción inequívoca exige: *"A los directivos y a los trabajadores, ambos despedidos injustamente..."*.

---



### 4.1. Reglas Estrictas de Concordancia Gramatical
1. **Concordancia Nominal:**
   - Entre Sustantivo y Adjetivo/Determinante:
     \text{Género}(\text{Det/Adj}) = \text{Género}(\text{Sustantivo}) \quad \land \quad \text{Número}(\text{Det/Adj}) = \text{Número}(\text{Sustantivo})
   - Varios sustantivos de distinto género coordinados en singular: el adjetivo pospuesto concierta en **masculino plural**.
     *Ejemplo:* *El reloj y la pulsera **antiguos***.
   - Adjetivo antepuesto a varios sustantivos coordinados: concierta comúnmente con el **más próximo**.
     *Ejemplo:* *Con **extraordinaria** rapidez y valor*.
2. **Concordancia Verbal:**
   - Sujeto compuesto con nexo copulativo (*y, e*): verbo en **plural**.
     *Ejemplo:* *El rector y el decano **firmaron** el convenio*.
   - Sujeto colectivo en singular: verbo en **singular**.
     *Ejemplo:* *La multitud **aplaudió** al expositor* (la concordancia ad sensum *La multitud aplaudieron* es incorrecta según norma culta).

---



### Problema 2 (Nivel Intermedio: Perífrasis Verbal)
¿En cuál de las siguientes opciones encontramos una auténtica perífrasis verbal?
- A) Deseo postular a Medicina Humana este año.
- B) El estudiante suele repasar sus apuntes por la noche.
- C) Prometió entregar el informe a tiempo.
- D) Necesita comprar nuevos libros de álgebra.
- E) Espera rendir un examen extraordinario el domingo.

**Resolución:**
En una perífrasis verbal, el verbo auxiliar pierde parcial o totalmente su significado léxico original y funciona como operador gramatical de tiempo/aspecto/modo, no pudiendo sustituirse el infinitivo por un pronombre neutro (*eso*).
- En A, C, D, E: *Deseo eso*, *Prometió eso*, *Necesita eso*, *Espera eso* (son verbos transitivos plenos con proposición subordinada sustantiva en función de OD).
- En B: *suele repasar* indica aspecto frecuentativo o habitual; no se puede decir *El estudiante suele eso*. Constituye una perífrasis verbal modal/aspectual (Auxiliar + Infinitivo).
**Respuesta:** **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t05_s02_c01",
                    question = "En la oración 'El jurado calificador declaró ganadora a la delegación arequipeña', el término 'ganadora' cumple la función sintáctica de:",
                    options = listOf(
                        "Objeto directo",
                        "Modificador indirecto",
                        "Atributo",
                        "Complemento predicativo objetivo",
                    ),
                    correctIndex = 3,
                    explanation = "'Ganadora' califica al Objeto Directo ('a la delegación arequipeña') a través del verbo transitivo 'declaró', actuando como complemento predicativo objetivo."
                ),
                Challenge(
                    id = "leng_t05_s02_c02",
                    question = "Para comprobar con rigor sintáctico si un sintagma desempeña la función de Objeto Directo (OD), se aplica la doble prueba de:",
                    options = listOf(
                        "Conmutación por un adverbio de modo",
                        "Sustitución por 'lo, la, los, las' y conversión a sujeto en voz pasiva",
                        "Sustitución por 'le/les' y eliminación del verbo",
                        "Sustitución obligatoria por 'se' impersonal",
                    ),
                    correctIndex = 1,
                    explanation = "El OD se sustituye unívocamente por los clíticos acusativos 'lo, la, los, las' y se transforma en Sujeto Paciente al pasar a la voz pasiva."
                ),
                Challenge(
                    id = "leng_t05_s02_c03",
                    question = "En 'César Vallejo, el poeta del dolor humano, nació en Santiago de Chuco', el elemento entre comas funciona sintácticamente como:",
                    options = listOf(
                        "Aposición explicativa",
                        "Modificador indirecto preposicional",
                        "Complemento predicativo subjetivo",
                        "Atributo copulativo",
                    ),
                    correctIndex = 0,
                    explanation = "La frase 'el poeta del dolor humano' va entre comas aclarando y equivaliendo al núcleo 'César Vallejo', constituyendo una aposición explicativa."
                ),
                Challenge(
                    id = "leng_t05_s02_c04",
                    question = "En la oración 'Aquellos médicos cirujanos son sumamente competentes', el sintagma 'sumamente competentes' funciona como:",
                    options = listOf(
                        "Complemento predicativo",
                        "Objeto directo",
                        "Complemento circunstancial de modo",
                        "Atributo",
                    ),
                    correctIndex = 3,
                    explanation = "Al acompañar al verbo copulativo 'son' y calificar al sujeto ('Aquellos médicos cirujanos lo son'), funciona como Atributo."
                ),
                Challenge(
                    id = "leng_t05_s02_c05",
                    question = "En 'El arqueólogo entregó las piezas cerámicas al director del museo', el sintagma 'al director del museo' cumple la función de:",
                    options = listOf(
                        "Objeto Directo",
                        "Complemento Agente",
                        "Objeto Indirecto",
                        "Circunstancial de lugar",
                    ),
                    correctIndex = 2,
                    explanation = "'Al director del museo' es el destinatario de la acción de entrega y se sustituye por 'le' ('El arqueólogo le entregó las piezas'), siendo Objeto Indirecto."
                ),
                Challenge(
                    id = "leng_t05_s02_c06",
                    question = "En la oración en voz pasiva 'El tratado de paz fue suscrito por los cancilleres', el sintagma 'por los cancilleres' cumple la función de:",
                    options = listOf(
                        "Objeto Indirecto",
                        "Complemento Circunstancial de causa",
                        "Atributo pasivo",
                        "Complemento Agente",
                    ),
                    correctIndex = 3,
                    explanation = "En la voz pasiva, el elemento introducido por la preposición 'por' que realiza la acción verbal es el Complemento Agente."
                ),
                Challenge(
                    id = "leng_t05_s02_c07",
                    question = "En la frase nominal 'El reloj de oro de mi abuelo', los elementos 'de oro' y 'de mi abuelo' funcionan respectivamente como:",
                    options = listOf(
                        "Aposiciones especificativas",
                        "Objetos directos del sustantivo",
                        "Modificadores indirectos preposicionales",
                        "Modificadores directos",
                    ),
                    correctIndex = 2,
                    explanation = "Ambos sintagmas están encabezados por la preposición subordinante 'de' y modifican de forma mediata al núcleo 'reloj', siendo modificadores indirectos."
                ),
                Challenge(
                    id = "leng_t05_s02_c08",
                    question = "En la oración 'Los niños caminaban contentos hacia la escuela', la palabra 'contentos' se clasifica sintácticamente como:",
                    options = listOf(
                        "Circunstancial de modo adverbial",
                        "Modificador directo del predicado",
                        "Atributo",
                        "Complemento Predicativo Subjetivo",
                    ),
                    correctIndex = 3,
                    explanation = "'Contentos' es un adjetivo que califica al sujeto 'los niños' concertando con él, pero acompaña a un verbo predicativo no copulativo ('caminaban')."
                ),
                Challenge(
                    id = "leng_t05_s02_c09",
                    question = "En 'El río Chili baña el fértil valle arequipeño', la estructura interna del Sujeto ('El río Chili') está compuesta por:",
                    options = listOf(
                        "MD (El) + Núcleo (río) + Aposición especificativa (Chili)",
                        "Núcleo (El río) + Modificador indirecto (Chili)",
                        "MD (El) + MD (río) + Núcleo (Chili)",
                        "Sujeto tácito compuesto",
                    ),
                    correctIndex = 0,
                    explanation = "'El' es determinante artículo (MD), 'río' es sustantivo común (Núcleo) y 'Chili' es nombre propio que especifica sin comas al río (Aposición especificativa)."
                ),
                Challenge(
                    id = "leng_t05_s02_c10",
                    question = "En la oración 'El vicerrector les otorgó diplomas de honor a los mejores ingresantes', el pronombre 'les' cumple la función de:",
                    options = listOf(
                        "Objeto directo enclítico",
                        "Objeto indirecto reiterativo (coordinado con 'a los mejores ingresantes')",
                        "Modificador directo del verbo",
                        "Complemento agente",
                    ),
                    correctIndex = 1,
                    explanation = "El pronombre átono 'les' reduplica y reitera al Objeto Indirecto 'a los mejores ingresantes', fenómeno común de concordancia en el español."
                ),
            )
        )
    )
}
