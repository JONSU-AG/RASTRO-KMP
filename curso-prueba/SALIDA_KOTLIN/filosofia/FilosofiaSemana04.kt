package filosofia

object FilosofiaSemana04 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t04_s01",
            subjectId = "filosofia",
            semana = 4,
            subtema = "4.1",
            title = "A. Los Principios Lógicos Supremos",
            theory = LessonTheory(
                content = """# TEMA 04: LÓGICA Y TEORÍA DE LA ARGUMENTACIÓN

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE LA ARGUMENTACIÓN

```
                            LÓGICA Y TEORÍA DE LA ARGUMENTACIÓN
                                             │
         ┌──────────────────┬────────────────┼─────────────────┬──────────────────┐
         ▼                  ▼                ▼                 ▼                  ▼
    PRINCIPIOS          TIPOS DE         ESTRUCTURA DE     FALACIAS NO        PARADOJAS
      LÓGICOS         RAZONAMIENTO        ARGUMENTOS         FORMALES          CLÁSICAS
         │                  │                │                 │                  │
• Identidad          • Deductivo:       • Premisas        • De Inatingencia: • El mentiroso
  (A = A)            (De lo general     (Fundamentos)     - Ad hominem       (Epiménides)
• No contradicción     a lo particular) • Conclusión        - Ad baculum     • Aquiles y la
  (\sim(A \land \sim A)) • Inductivo:   (Inferencia)      - Ad verecundiam   tortuga (Zenón)
• Tercio excluso       (De casos        • Conectores        - Ad ignorantiam • Paradoja de
  (A \lor \sim A)      particulares     lógicos           - Ad populum       Russell (Teoría
• Razón suficiente     a la ley)                            - Causa falsa      de conjuntos)
  (Leibniz)                                               • De Ambigüedad:
                                                            - Equívoco, Énfasis
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Los Principios Lógicos Supremos
Son leyes ontológicas y gnoseológicas autoevidentes que rigen todo pensamiento coherente:
1. **Principio de Identidad** (Aristóteles / Parménides):
   - Formulación ontológica: Todo ente es idéntico a sí mismo (A \text{ es } A).
   - Formulación lógica: Si una proposición es verdadera, entonces es verdadera (p \rightarrow p).
2. **Principio de No Contradicción** (Aristóteles):
   - Formulación ontológica: Es imposible que una cosa sea y no sea al mismo tiempo y bajo el mismo respecto.
   - Formulación lógica: Dos proposiciones contradictorias no pueden ser ambas verdaderas a la vez: \sim (p \land \sim p).
3. **Principio del Tercio Excluso / Tercero Excluido** (Aristóteles):
   - Formulación ontológica: Una cosa o bien tiene una propiedad o no la tiene; no existe un tercer término intermedio.
   - Formulación lógica: Toda proposición es necesariamente verdadera o falsa; no hay una tercera opción: p \lor \sim p.
4. **Principio de Razón Suficiente** (Gottfried Wilhelm Leibniz):
   - Formulación: Nada ocurre o existe sin que haya una razón suficiente para que sea así y no de otro modo (*"Nihil est sine ratione"*). Ningún enunciado puede considerarse verdadero a menos que se aporten razones concluyentes que lo sustenten.



### B. Razonamiento: Deducción vs. Inducción
1. **Razonamiento Deductivo**:
   - Parte de premisas generales para derivar una conclusión necesaria y particular.
   - Si las premisas son verdaderas y la estructura es válida, la conclusión es **infaliblemente verdadera**.
   - No añade información nueva en sentido fáctico; hace explícito lo implícito.
   - *Ejemplo*: 
     - Todos los metales son conductores de electricidad. (Premisa general)
     - El cobre es un metal. (Premisa particular)
     - Por lo tanto, el cobre es conductor de electricidad. (Conclusión necesaria)
2. **Razonamiento Inductivo**:
   - Parte de la observación de casos particulares para colegir una conclusión o generalización probable.
   - La conclusión tiene carácter **probable**; no garantiza la verdad absoluta aun cuando las premisas sean verdaderas.
   - Es el motor del descubrimiento empírico y la ciencia fáctica.
   - *Ejemplo*: El cuervo 1 es negro, el cuervo 2 es negro... El cuervo n es negro \rightarrow Probablemente todos los cuervos son negros.



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia de los Principios Lógicos:
> **"I - NO - TER - RA"**
- **I**dentidad (A = A)
- **NO** contradicción (\sim(A \land \sim A))
- **TER**cio excluso (A \lor \sim A)
- **RA**zón suficiente (Leibniz: todo tiene un porqué fundamentado)



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 1: Básico / Identificación Directa
**Enunciado**: El principio lógico formulado por Gottfried Leibniz que sostiene que ningún hecho o enunciado puede ser considerado verdadero o existente sin que haya una fundamentación o razón que explique por qué es así y no de otra manera, se denomina:
A) Principio de identidad  
B) Principio de razón suficiente  
C) Principio del tercio excluso  
D) Principio de no contradicción  
E) Principio de transitividad  

- **Resolución**: Gottfried Leibniz formuló explícitamente en su *Monadología* el **Principio de Razón Suficiente**, según el cual nada acaece sin que haya una razón por la cual sea así y no de otro modo.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Considere la siguiente estructura argumentativa formulada por un escéptico:
> *"Para fundamentar una proposición P, requerimos aportar una prueba Q. A su vez, para validar la certeza de Q, necesitamos demostrar una proposición R, y así sucesivamente hasta el infinito. Si en algún momento detenemos la cadena sin justificación, incurrimos en un dogma arbitrario; si introducimos P para justificar una premisa previa, caemos en un círculo vicioso. Por tanto, ninguna verdad puede ser fundada justificadamente"*.

Este dilema de fundamentación epistemológica se conoce en la filosofía clásica como:
A) La paradoja de Epiménides el cretense.  
B) El trilema de Münchhausen (o trilema de Agripa).  
C) La antinomia de la razón pura según Leibniz.  
D) El principio de tercio excluso en la lógica paraconsistente.  
E) La falacia de falsa analogía deductiva.  

- **Resolución**: El enunciado reproduce textualmente el **Trilema de Münchhausen** (formulado clásicamente por el escéptico Agripa y reactualizado por Hans Albert en la epistemología moderna), el cual demuestra que cualquier intento de fundamentación última choca contra tres alternativas insolubles:
  1. Regresión infinita.
  2. Círculo vicioso (petición de principio).
  3. Ruptura dogmática arbitraria.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Inferencia**: Proceso lógico mediante el cual se deriva una conclusión a partir de un conjunto de premisas aceptadas.
2. **Validez Formal**: Propiedad exclusiva de los argumentos deductivos cuando su estructura lógica garantiza que no es posible que las premisas sean verdaderas y la conclusión sea falsa.
3. **Verdad Material**: Concordancia empírica o fáctica de una proposición aislada con los hechos observables de la realidad.
4. **Premisa**: Proposición que sirve de base, apoyo o fundamento para inferir una conclusión.
5. **Falacia**: Razonamiento no válido o incorrecto, pero que presenta apariencia de razonamiento correcto y persuasivo.
6. **Entimema**: Silogismo en el cual una de las premisas (o la conclusión) se omite por considerarse obvia o sobreentendida.
7. **Ad Hominem Tu Quoque**: Modalidad de falacia que busca descalificar a un interlocutor acusándolo de incurrir en la misma falta que condena.
8. **Tautología**: Proposición compuesta que es formalmente verdadera para todas las combinaciones posibles de valores de verdad de sus variables.
9. **Contradicción**: Proposición compuesta que resulta falsa para todas las asignaciones posibles de verdad de sus variables componentes.
10. **Paradoja**: Enunciado o conjunto de premisas aparentemente verdaderas que, mediante razonamientos formalmente válidos, conducen a una contradicción lógica o antinomia irresoluble.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Qué dice el principio de no contradicción?
  - *Reverso*: Es imposible que una proposición sea verdadera y falsa al mismo tiempo y bajo el mismo respecto: \sim(p \land \sim p).

- **Flashcard 2**:
  - *Anverso*: ¿En qué consiste la falacia de petición de principio (*petitio principii*)?
  - *Reverso*: En asumir encubiertamente en las premisas aquello mismo que se pretende demostrar en la conclusión (círculo vicioso).

- **Flashcard 3**:
  - *Anverso*: ¿Cuál es la diferencia fundamental entre validez y verdad?
  - *Reverso*: La **validez** se predica de la estructura de las inferencias (lógica formal); la **verdad** se predica del contenido de las proposiciones (adecuación a los hechos).

- **Flashcard 4**:
  - *Anverso*: ¿Qué falacia se comete cuando alguien dice: "Nadie ha probado que la homeopatía no funcione, por tanto es un tratamiento médico eficaz"?
  - *Reverso*: Falacia *Argumentum ad ignorantiam* (apelar a la falta de prueba como prueba de verdad).

---



### C. Falacias No Formales
Una **falacia** es un argumento que parece válido o persuasivo pero que adolece de un error en su razonamiento lógico interno. Se dividen en falacias de atingencia y de ambigüedad.

#### 1. Falacias de Atingencia (Las premisas carecen de conexión lógica con la conclusión)
- **Argumentum ad Hominem (Contra la persona)**:
  - *Ofensivo*: Se ataca el carácter, origen o condición moral de quien emite el argumento en lugar de refutar sus premisas (*"Tu tesis económica es falsa porque eres un burgués corrupto"*).
  - *Circunstancial (Tu quoque)*: Se descalifica el argumento señalando que la persona no actúa según lo que predica (*"¿Cómo me dices que deje de fumar si tú fumas dos cajetillas al día?"*).
- **Argumentum ad Baculum (Apelación a la fuerza o al temor)**:
  - Se recurre a la amenaza explícita o velada del uso del poder para imponer una conclusión (*"Usted debe aceptar esta cláusula laboral; recuerde que hay cientos de desempleados esperando su puesto"*).
- **Argumentum ad Verecundiam (Apelación a la falsa autoridad)**:
  - Se fundamenta la verdad de una proposición invocando la opinión de una figura célebre en un campo que no le compete (*"El champú X es el mejor del mercado porque lo recomienda Lionel Messi"*).
- **Argumentum ad Populum (Apelación a las masas o sentimientos colectivos)**:
  - Se intenta validar una tesis alegando que "la mayoría" o "todo el pueblo" lo cree (*"Esta película es una obra maestra del cine universal porque millones de personas llenaron las salas"*).
- **Argumentum ad Ignorantiam (Apelación a la ignorancia)**:
  - Se sostiene que una afirmación es verdadera porque no se ha podido demostrar que es falsa, o viceversa (*"Los extraterrestres existen, pues nadie ha demostrado de manera concluyente que estemos solos en el universo"*).
- **Argumentum ad Misericordiam (Apelación a la piedad)**:
  - Se apela a la conmiseración o lástima para obtener una decisión favorable eludiendo los hechos (*"Profesor, no me desapruebe el curso, mi abuelita enfermó y no pude estudiar"*).
- **Non Causa Pro Causa / Post Hoc Ergo Propter Hoc (Causa Falsa)**:
  - Se asume que porque el evento B ocurrió después del evento A, A es la causa necesaria de B (*"Ayer me persiguió un gato negro y hoy reprobé el examen; el gato me trajo mala suerte"*).
- **Petitio Principii (Petición de Principio / Círculo Vicioso)**:
  - Se toma como premisa no demostrada la misma conclusión que se pretende probar (*"La Biblia es la palabra revelada de Dios porque Dios mismo lo dice en la Biblia"*).
- **Pregunta Compleja**: Formular una pregunta que presupone una afirmación previa no admitida (*"¿Sigue usted golpeando a su esposa en las noches?"*).

#### 2. Falacias de Ambigüedad
- **Equívoco (Anfibología o polisemia)**: Emplear un mismo término con sentidos distintos a lo largo de un argumento (*"El fin de una cosa es su perfección; la muerte es el fin de la vida; por tanto, la muerte es la perfección de la vida"*).
- **Énfasis o Acento**: Alterar el significado de un enunciado resaltando arbitrariamente una palabra.



### D. Paradojas Clásicas
1. **Paradoja del Mentiroso (Epiménides de Creta)**:
   - *"Epiménides el cretense dice: Todos los cretenses son unos mentirosos"*. Si es verdad, Epiménides miente, luego es falsa. Si es falsa, dice la verdad. Lleva a una antinomia autorreferencial.
2. **Paradojas de Zenón de Elea (Aquiles y la tortuga)**:
   - Para refutar el movimiento y defender la inmutabilidad del Ser de Parménides: Aquiles nunca puede alcanzar a la tortuga porque primero debe recorrer la mitad de la distancia infinita entre ambos.
3. **Paradoja de Russell (El Barbero)**:
   - En un pueblo, el barbero afeita a todos y solo a aquellos hombres que no se afeitan a sí mismos. ¿Se afeita el barbero a sí mismo? Rompió la teoría intuitiva de conjuntos de Frege y dio origen a la teoría de tipos.

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Ad Hominem vs. Testimonio Judicial**: En un juicio, desestimar el testimonio de un testigo porque se demostró pericialmente que padece alucinaciones o cometió perjurio comprobado NO siempre es falacia si la credibilidad del testigo es el objeto fáctico de la prueba legal. Pero en un debate científico o teórico sobre una proposición abstracta, atacar al sujeto sí es siempre falacia *ad hominem*.
2. **La trampa Ad Verecundiam vs. Argumento de Autoridad Legítimo**: Citar a Albert Einstein sobre relatividad especial o a Isaac Newton sobre mecánica clásica es un **argumento legítimo de autoridad científica**. Solo se comete falacia *ad verecundiam* cuando la autoridad citada opina fuera de su ámbito de competencia especializada (ej. citar a Einstein sobre nutrición vegetariana obligatoria).
3. **Petición de principio encubierta**: En muchos enunciados, la premisa y la conclusión dicen lo mismo pero con sinónimos refinados: *"El alma es inmortal porque no puede morir nunca"*.

---



### Nivel 2: Intermedio / Identificación de Falacia
**Enunciado**: En una asamblea municipal, un regidor toma la palabra y exclama: *"El plan de pavimentación presentado por el ingeniero Quispe no debe ser aprobado por este consejo, pues todos sabemos que el ingeniero Quispe es un individuo procesado penalmente y un mal vecino en su barrio"*. El regidor ha incurrido en la falacia no formal denominada:
A) Argumentum ad baculum  
B) Argumentum ad verecundiam  
C) Argumentum ad hominem ofensivo  
D) Argumentum ad populum  
E) Petición de principio  

- **Resolución**: El regidor no analiza la viabilidad técnica ni presupuestal del plan de pavimentación; descalifica la propuesta atacando directamente la conducta personal, antecedentes y moral del autor. Se trata de un **Argumentum ad Hominem** (ofensivo).
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística Compleja
**Enunciado**: En un laboratorio farmacéutico, un investigador declara: *"Durante seis meses de ensayos clínicos no hemos encontrado evidencia concluyente de que el fármaco beta provoque arritmias cardíacas en los voluntarios; por lo tanto, queda plenamente demostrado que el fármaco es 100% seguro para el corazón de todos los pacientes"*. Este razonamiento comete la falacia de:
A) Argumentum ad misericordiam  
B) Argumentum ad ignorantiam  
C) Equívoco  
D) Argumentum ad baculum  
E) División  

- **Resolución**: La ausencia temporal de evidencia o la incapacidad de probar un efecto adverso en un ensayo no equivale lógicamente a una demostración concluyente de inocuidad absoluta. Apelar a la falta de prueba como prueba concluyente de lo contrario es la definición clásica de la falacia **Ad Ignorantiam**.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea el siguiente diálogo entre dos congresistas:
- *Congresista A*: *"Debemos aprobar inmediatamente el incremento de penas con prisión perpetua para delitos patrimoniales leves, porque más del 80% de las encuestas populares así lo exige a gritos en las calles; el pueblo nunca se equivoca en sus clamores de justicia"*.
- *Congresista B*: *"Estimado colega, si no vota a favor de esta bancada en el dictamen, evaluaremos expulsarlo de la comisión investigadora que usted preside y retirarle sus asesores"*.

En el diálogo anterior, el Congresista A y el Congresista B apelan, respectivamente, a las falacias:
A) Ad populum y ad baculum  
B) Ad verecundiam y ad hominem  
C) Causa falsa y petición de principio  
D) Ad misericordiam y ad baculum  
E) Ad populum y causa falsa  

- **Resolución**:
  - Congresista A apela al sentimiento de las masas y la mayoría (*"80% de encuestas populares", "el clamor del pueblo"*) \rightarrow **Ad Populum**.
  - Congresista B profiere una amenaza directa de perjuicio y sanción institucional si no vota a favor \rightarrow **Ad Baculum** (apelación a la fuerza o temor).
- **Clave Correcta**: **A**

---



## 4. CUADRO COMPARATIVO: LAS 6 FALACIAS MÁS PREGUNTADAS EN ADMISIÓN

| Falacia | Núcleo de la Falacia | Ejemplo Típico de Examen | Clave para Identificarla |
| :--- | :--- | :--- | :--- |
| **Ad Hominem** | Atacar a la persona, no al argumento. | *"Ese informe médico carece de rigor porque el doctor es un borracho".* | Se descalifica al emisor por su vida personal o ideología. |
| **Ad Verecundiam** | Apelar a autoridad no experta en el tema. | *"El premio Nobel de Literatura dice que las vacunas son dañinas".* | La autoridad es famosa, pero no es experta en la materia en debate. |
| **Ad Baculum** | Amenaza o uso implícito de la fuerza. | *"Si no votan por nuestra propuesta sindical, aténganse a las consecuencias".* | Hay coacción, amenaza de sanción o chantaje. |
| **Ad Ignorantiam** | Ignorancia como prueba de verdad/falsedad. | *"No hay vida en otros planetas porque la ciencia no lo ha verificado".* | Afirma algo como cierto porque "nadie ha probado lo opuesto". |
| **Ad Populum** | Apelar al fervor del pueblo o la mayoría. | *"Consuma esta bebida energizante, la preferida por todos los peruanos".* | Emplea la masa, la tradición popular o la encuesta de consumo. |
| **Causa Falsa** | Confundir sucesión temporal con causalidad. | *"Desde que cambié de amuleto, mi equipo no ha perdido un solo partido".* | Conecta dos hechos fortuitos como causa-efecto (*Post hoc ergo propter hoc*). |

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t04_s01_c01",
                    question = "El Principio Lógico Supremo formulado inicialmente por Parménides y formalizado por la lógica clásica que expresa que 'todo objeto es idéntico a sí mismo' (A es A / si p, entonces p) se denomina:",
                    options = listOf(
                        "Principio de No Contradicción.",
                        "Principio del Tercio Excluido.",
                        "Principio de Identidad.",
                        "Principio de Razón Suficiente.",
                    ),
                    correctIndex = 2,
                    explanation = "El Principio de Identidad establece la autoequivalencia y consistencia fundamental de todo ente consigo mismo y de toda proposición consigo misma (A = A)."
                ),
                Challenge(
                    id = "filo_t04_s01_c02",
                    question = "Aristóteles formuló en la 'Metafísica' el Principio de No Contradicción estableciendo ontológicamente que:",
                    options = listOf(
                        "Una proposición es verdadera o falsa, admitiendo infinitas posibilidades intermedias.",
                        "Es imposible que un mismo atributo pertenezca y no pertenezca a un mismo sujeto al mismo tiempo y bajo el mismo aspecto.",
                        "Nada existe sin que haya una causa previa que determine su acaecimiento histórico.",
                        "Todo razonamiento inductivo conduce forzosamente a una verdad matemática universal.",
                    ),
                    correctIndex = 1,
                    explanation = "El Principio de No Contradicción [~(p ∧ ~p)] prohíbe afirmar y negar simultáneamente una misma cualidad de un mismo sujeto bajo idénticas circunstancias de tiempo y respecto."
                ),
                Challenge(
                    id = "filo_t04_s01_c03",
                    question = "Frente al enunciado 'Un número entero es par o no es par; no cabe un estado intermedio', ¿qué principio lógico supremo se está aplicando de manera estricta?",
                    options = listOf(
                        "Principio de Identidad.",
                        "Principio del Tercio Excluido (Tertium non datur).",
                        "Principio de Razón Suficiente.",
                        "Principio de Causalidad Teleológica.",
                    ),
                    correctIndex = 1,
                    explanation = "El Principio del Tercio Excluido (p ∨ ~p) establece que entre dos proposiciones contradictorias no hay un término medio: una es verdadera y la otra es forzosamente falsa."
                ),
                Challenge(
                    id = "filo_t04_s01_c04",
                    question = "El filósofo y matemático moderno Gottfried Leibniz incorporó como principio lógico supremo el 'Principio de Razón Suficiente', el cual sostiene que:",
                    options = listOf(
                        "Nada acontece o existe sin que haya una razón suficiente para que sea así y no de otra manera, aunque dicha razón no siempre nos sea conocida.",
                        "Los hombres deben obedecer ciegamente la razón del soberano político.",
                        "Las matemáticas carecen de fundamentos lógicos comprobables.",
                        "Dos enunciados contradictorios son verdaderos si benefician a la mayoría.",
                    ),
                    correctIndex = 0,
                    explanation = "Leibniz postuló que ningún hecho puede ser verdadero o existente sin que haya una razón suficiente por la cual deba ser así y no de otro modo ('nihil est sine ratione')."
                ),
                Challenge(
                    id = "filo_t04_s01_c05",
                    question = "Si alguien afirma: 'Este mineral es completamente de oro puro, pero al mismo tiempo carece en absoluto de toda traza de oro', su enunciado quiebra de forma flagrante el principio de:",
                    options = listOf(
                        "Razón suficiente.",
                        "Tercio excluido.",
                        "No contradicción.",
                        "Identidad tautológica.",
                    ),
                    correctIndex = 2,
                    explanation = "Afirmar simultáneamente que algo es oro puro y que carece de oro viola de manera directa el principio ontológico y lógico de No Contradicción."
                ),
                Challenge(
                    id = "filo_t04_s01_c06",
                    question = "En la lógica aristotélica, un silogismo categórico se define esencialmente como:",
                    options = listOf(
                        "Una inferencia deductiva mediata compuesta por dos premisas y una conclusión vinculadas por un término medio.",
                        "Una inducción probabilística basada en encuestas de opinión popular.",
                        "Una figura poética destinada a emocionar al auditorio sin rigor argumental.",
                        "Una adivinanza dialéctica empleada para confundir a los jueces de Atenas.",
                    ),
                    correctIndex = 0,
                    explanation = "El silogismo aristotélico es un razonamiento deductivo mediato donde a partir de dos proposiciones (premisa mayor y menor) que comparten un término medio se deriva necesariamente una conclusión."
                ),
                Challenge(
                    id = "filo_t04_s01_c07",
                    question = "En la estructura clásica del silogismo categórico, el 'término medio' cumple la función indispensable de:",
                    options = listOf(
                        "Aparecer obligatoriamente en la conclusión final del argumento.",
                        "Contradecir a la premisa mayor para generar una paradoja.",
                        "Servir de enlace lógico entre los términos mayor y menor en las premisas, debiendo desaparecer en la conclusión.",
                        "Determinar si el silogismo es moralmente bueno o malo.",
                    ),
                    correctIndex = 2,
                    explanation = "El término medio une conceptualmente a los extremos en las premisas, pero por regla formal rigurosa jamás debe figurar en la conclusión."
                ),
                Challenge(
                    id = "filo_t04_s01_c08",
                    question = "Considere el siguiente razonamiento: 'Todos los seres humanos son mortales. Sócrates es un ser humano. Por lo tanto, Sócrates es mortal'. ¿Qué tipo de inferencia se ejemplifica?",
                    options = listOf(
                        "Falacia de ambigüedad léxica.",
                        "Razonamiento por analogía imperfecta.",
                        "Inferencia inductiva incompleta.",
                        "Inferencia deductiva válida (Silogismo Barbara).",
                    ),
                    correctIndex = 3,
                    explanation = "Es el ejemplo paradigmático del silogismo deductivo categórico en modo Barbara (AAA-1), donde la conclusión se sigue necesariamente de las premisas universales y particulares."
                ),
                Challenge(
                    id = "filo_t04_s01_c09",
                    question = "¿Cuál es la diferencia fundamental entre la 'verdad' de una proposición y la 'validez' de un argumento en la lógica formal?",
                    options = listOf(
                        "La verdad es una propiedad semántica de las proposiciones respecto a la realidad fáctica, mientras que la validez es una propiedad formal de la estructura de las inferencias deductivas.",
                        "La validez se aplica únicamente a oraciones interrogativas y la verdad a metáforas.",
                        "La verdad y la validez son conceptos sinónimos intercambiables en todo contexto científico.",
                        "La verdad concierne a la estructura sintáctica abstracta y la validez a los hechos biológicos.",
                    ),
                    correctIndex = 0,
                    explanation = "Las proposiciones son verdaderas o falsas según coincidan o no con la realidad; las inferencias o argumentos son válidos o inválidos según su estructura lógica respete las leyes de deducción."
                ),
                Challenge(
                    id = "filo_t04_s01_c10",
                    question = "Un razonamiento deductivo puede poseer premisas fácticamente falsas y, sin embargo, ser formalmente válido si:",
                    options = listOf(
                        "El orador utiliza un tono de voz persuasivo y autoritario.",
                        "La mayoría de los oyentes acepta la conclusión por compasión.",
                        "Su conclusión se deriva necesariamente de las premisas de acuerdo con las reglas lógicas de derivación formal.",
                        "Se demuestra que contradice al principio de identidad.",
                    ),
                    correctIndex = 2,
                    explanation = "La validez es exclusivamente estructural: si de premisas falsas la conclusión se deduce rigurosamente respetando la ley formal de inferencia, el argumento sigue siendo formalmente válido."
                ),
            )
        ),
        LessonNode(
            id = "filo_t04_s02",
            subjectId = "filosofia",
            semana = 4,
            subtema = "4.2",
            title = "C. Falacias No Formales",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE LA ARGUMENTACIÓN

```
                            LÓGICA Y TEORÍA DE LA ARGUMENTACIÓN
                                             │
         ┌──────────────────┬────────────────┼─────────────────┬──────────────────┐
         ▼                  ▼                ▼                 ▼                  ▼
    PRINCIPIOS          TIPOS DE         ESTRUCTURA DE     FALACIAS NO        PARADOJAS
      LÓGICOS         RAZONAMIENTO        ARGUMENTOS         FORMALES          CLÁSICAS
         │                  │                │                 │                  │
• Identidad          • Deductivo:       • Premisas        • De Inatingencia: • El mentiroso
  (A = A)            (De lo general     (Fundamentos)     - Ad hominem       (Epiménides)
• No contradicción     a lo particular) • Conclusión        - Ad baculum     • Aquiles y la
  (\sim(A \land \sim A)) • Inductivo:   (Inferencia)      - Ad verecundiam   tortuga (Zenón)
• Tercio excluso       (De casos        • Conectores        - Ad ignorantiam • Paradoja de
  (A \lor \sim A)      particulares     lógicos           - Ad populum       Russell (Teoría
• Razón suficiente     a la ley)                            - Causa falsa      de conjuntos)
  (Leibniz)                                               • De Ambigüedad:
                                                            - Equívoco, Énfasis
```

---



### C. Falacias No Formales
Una **falacia** es un argumento que parece válido o persuasivo pero que adolece de un error en su razonamiento lógico interno. Se dividen en falacias de atingencia y de ambigüedad.

#### 1. Falacias de Atingencia (Las premisas carecen de conexión lógica con la conclusión)
- **Argumentum ad Hominem (Contra la persona)**:
  - *Ofensivo*: Se ataca el carácter, origen o condición moral de quien emite el argumento en lugar de refutar sus premisas (*"Tu tesis económica es falsa porque eres un burgués corrupto"*).
  - *Circunstancial (Tu quoque)*: Se descalifica el argumento señalando que la persona no actúa según lo que predica (*"¿Cómo me dices que deje de fumar si tú fumas dos cajetillas al día?"*).
- **Argumentum ad Baculum (Apelación a la fuerza o al temor)**:
  - Se recurre a la amenaza explícita o velada del uso del poder para imponer una conclusión (*"Usted debe aceptar esta cláusula laboral; recuerde que hay cientos de desempleados esperando su puesto"*).
- **Argumentum ad Verecundiam (Apelación a la falsa autoridad)**:
  - Se fundamenta la verdad de una proposición invocando la opinión de una figura célebre en un campo que no le compete (*"El champú X es el mejor del mercado porque lo recomienda Lionel Messi"*).
- **Argumentum ad Populum (Apelación a las masas o sentimientos colectivos)**:
  - Se intenta validar una tesis alegando que "la mayoría" o "todo el pueblo" lo cree (*"Esta película es una obra maestra del cine universal porque millones de personas llenaron las salas"*).
- **Argumentum ad Ignorantiam (Apelación a la ignorancia)**:
  - Se sostiene que una afirmación es verdadera porque no se ha podido demostrar que es falsa, o viceversa (*"Los extraterrestres existen, pues nadie ha demostrado de manera concluyente que estemos solos en el universo"*).
- **Argumentum ad Misericordiam (Apelación a la piedad)**:
  - Se apela a la conmiseración o lástima para obtener una decisión favorable eludiendo los hechos (*"Profesor, no me desapruebe el curso, mi abuelita enfermó y no pude estudiar"*).
- **Non Causa Pro Causa / Post Hoc Ergo Propter Hoc (Causa Falsa)**:
  - Se asume que porque el evento B ocurrió después del evento A, A es la causa necesaria de B (*"Ayer me persiguió un gato negro y hoy reprobé el examen; el gato me trajo mala suerte"*).
- **Petitio Principii (Petición de Principio / Círculo Vicioso)**:
  - Se toma como premisa no demostrada la misma conclusión que se pretende probar (*"La Biblia es la palabra revelada de Dios porque Dios mismo lo dice en la Biblia"*).
- **Pregunta Compleja**: Formular una pregunta que presupone una afirmación previa no admitida (*"¿Sigue usted golpeando a su esposa en las noches?"*).

#### 2. Falacias de Ambigüedad
- **Equívoco (Anfibología o polisemia)**: Emplear un mismo término con sentidos distintos a lo largo de un argumento (*"El fin de una cosa es su perfección; la muerte es el fin de la vida; por tanto, la muerte es la perfección de la vida"*).
- **Énfasis o Acento**: Alterar el significado de un enunciado resaltando arbitrariamente una palabra.



### D. Paradojas Clásicas
1. **Paradoja del Mentiroso (Epiménides de Creta)**:
   - *"Epiménides el cretense dice: Todos los cretenses son unos mentirosos"*. Si es verdad, Epiménides miente, luego es falsa. Si es falsa, dice la verdad. Lleva a una antinomia autorreferencial.
2. **Paradojas de Zenón de Elea (Aquiles y la tortuga)**:
   - Para refutar el movimiento y defender la inmutabilidad del Ser de Parménides: Aquiles nunca puede alcanzar a la tortuga porque primero debe recorrer la mitad de la distancia infinita entre ambos.
3. **Paradoja de Russell (El Barbero)**:
   - En un pueblo, el barbero afeita a todos y solo a aquellos hombres que no se afeitan a sí mismos. ¿Se afeita el barbero a sí mismo? Rompió la teoría intuitiva de conjuntos de Frege y dio origen a la teoría de tipos.

---



## 4. CUADRO COMPARATIVO: LAS 6 FALACIAS MÁS PREGUNTADAS EN ADMISIÓN

| Falacia | Núcleo de la Falacia | Ejemplo Típico de Examen | Clave para Identificarla |
| :--- | :--- | :--- | :--- |
| **Ad Hominem** | Atacar a la persona, no al argumento. | *"Ese informe médico carece de rigor porque el doctor es un borracho".* | Se descalifica al emisor por su vida personal o ideología. |
| **Ad Verecundiam** | Apelar a autoridad no experta en el tema. | *"El premio Nobel de Literatura dice que las vacunas son dañinas".* | La autoridad es famosa, pero no es experta en la materia en debate. |
| **Ad Baculum** | Amenaza o uso implícito de la fuerza. | *"Si no votan por nuestra propuesta sindical, aténganse a las consecuencias".* | Hay coacción, amenaza de sanción o chantaje. |
| **Ad Ignorantiam** | Ignorancia como prueba de verdad/falsedad. | *"No hay vida en otros planetas porque la ciencia no lo ha verificado".* | Afirma algo como cierto porque "nadie ha probado lo opuesto". |
| **Ad Populum** | Apelar al fervor del pueblo o la mayoría. | *"Consuma esta bebida energizante, la preferida por todos los peruanos".* | Emplea la masa, la tradición popular o la encuesta de consumo. |
| **Causa Falsa** | Confundir sucesión temporal con causalidad. | *"Desde que cambié de amuleto, mi equipo no ha perdido un solo partido".* | Conecta dos hechos fortuitos como causa-efecto (*Post hoc ergo propter hoc*). |

---



### Nemotecnia para las Falacias Centrales:
> **"HOMBRES CON BASTONES VEN IGNORANTES POPULARES CAUSANDO PETICIONES"**
- **Hombres**: Ad *Hominem* (ataque al hombre)
- **Bastones**: Ad *Baculum* (el bastón = la fuerza)
- **Ven**: Ad *Verecundiam* (venerar a una falsa autoridad)
- **Ignorantes**: Ad *Ignorantiam* (falta de prueba)
- **Populares**: Ad *Populum* (la masa)
- **Causando**: *Causa Falsa*
- **Peticiones**: *Petición de Principio* (círculo vicioso)

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa Ad Hominem vs. Testimonio Judicial**: En un juicio, desestimar el testimonio de un testigo porque se demostró pericialmente que padece alucinaciones o cometió perjurio comprobado NO siempre es falacia si la credibilidad del testigo es el objeto fáctico de la prueba legal. Pero en un debate científico o teórico sobre una proposición abstracta, atacar al sujeto sí es siempre falacia *ad hominem*.
2. **La trampa Ad Verecundiam vs. Argumento de Autoridad Legítimo**: Citar a Albert Einstein sobre relatividad especial o a Isaac Newton sobre mecánica clásica es un **argumento legítimo de autoridad científica**. Solo se comete falacia *ad verecundiam* cuando la autoridad citada opina fuera de su ámbito de competencia especializada (ej. citar a Einstein sobre nutrición vegetariana obligatoria).
3. **Petición de principio encubierta**: En muchos enunciados, la premisa y la conclusión dicen lo mismo pero con sinónimos refinados: *"El alma es inmortal porque no puede morir nunca"*.

---



### Nivel 2: Intermedio / Identificación de Falacia
**Enunciado**: En una asamblea municipal, un regidor toma la palabra y exclama: *"El plan de pavimentación presentado por el ingeniero Quispe no debe ser aprobado por este consejo, pues todos sabemos que el ingeniero Quispe es un individuo procesado penalmente y un mal vecino en su barrio"*. El regidor ha incurrido en la falacia no formal denominada:
A) Argumentum ad baculum  
B) Argumentum ad verecundiam  
C) Argumentum ad hominem ofensivo  
D) Argumentum ad populum  
E) Petición de principio  

- **Resolución**: El regidor no analiza la viabilidad técnica ni presupuestal del plan de pavimentación; descalifica la propuesta atacando directamente la conducta personal, antecedentes y moral del autor. Se trata de un **Argumentum ad Hominem** (ofensivo).
- **Clave Correcta**: **C**

---



### Nivel 3: Aplicación / Casuística Compleja
**Enunciado**: En un laboratorio farmacéutico, un investigador declara: *"Durante seis meses de ensayos clínicos no hemos encontrado evidencia concluyente de que el fármaco beta provoque arritmias cardíacas en los voluntarios; por lo tanto, queda plenamente demostrado que el fármaco es 100% seguro para el corazón de todos los pacientes"*. Este razonamiento comete la falacia de:
A) Argumentum ad misericordiam  
B) Argumentum ad ignorantiam  
C) Equívoco  
D) Argumentum ad baculum  
E) División  

- **Resolución**: La ausencia temporal de evidencia o la incapacidad de probar un efecto adverso en un ensayo no equivale lógicamente a una demostración concluyente de inocuidad absoluta. Apelar a la falta de prueba como prueba concluyente de lo contrario es la definición clásica de la falacia **Ad Ignorantiam**.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: Lea el siguiente diálogo entre dos congresistas:
- *Congresista A*: *"Debemos aprobar inmediatamente el incremento de penas con prisión perpetua para delitos patrimoniales leves, porque más del 80% de las encuestas populares así lo exige a gritos en las calles; el pueblo nunca se equivoca en sus clamores de justicia"*.
- *Congresista B*: *"Estimado colega, si no vota a favor de esta bancada en el dictamen, evaluaremos expulsarlo de la comisión investigadora que usted preside y retirarle sus asesores"*.

En el diálogo anterior, el Congresista A y el Congresista B apelan, respectivamente, a las falacias:
A) Ad populum y ad baculum  
B) Ad verecundiam y ad hominem  
C) Causa falsa y petición de principio  
D) Ad misericordiam y ad baculum  
E) Ad populum y causa falsa  

- **Resolución**:
  - Congresista A apela al sentimiento de las masas y la mayoría (*"80% de encuestas populares", "el clamor del pueblo"*) \rightarrow **Ad Populum**.
  - Congresista B profiere una amenaza directa de perjuicio y sanción institucional si no vota a favor \rightarrow **Ad Baculum** (apelación a la fuerza o temor).
- **Clave Correcta**: **A**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Considere la siguiente estructura argumentativa formulada por un escéptico:
> *"Para fundamentar una proposición P, requerimos aportar una prueba Q. A su vez, para validar la certeza de Q, necesitamos demostrar una proposición R, y así sucesivamente hasta el infinito. Si en algún momento detenemos la cadena sin justificación, incurrimos en un dogma arbitrario; si introducimos P para justificar una premisa previa, caemos en un círculo vicioso. Por tanto, ninguna verdad puede ser fundada justificadamente"*.

Este dilema de fundamentación epistemológica se conoce en la filosofía clásica como:
A) La paradoja de Epiménides el cretense.  
B) El trilema de Münchhausen (o trilema de Agripa).  
C) La antinomia de la razón pura según Leibniz.  
D) El principio de tercio excluso en la lógica paraconsistente.  
E) La falacia de falsa analogía deductiva.  

- **Resolución**: El enunciado reproduce textualmente el **Trilema de Münchhausen** (formulado clásicamente por el escéptico Agripa y reactualizado por Hans Albert en la epistemología moderna), el cual demuestra que cualquier intento de fundamentación última choca contra tres alternativas insolubles:
  1. Regresión infinita.
  2. Círculo vicioso (petición de principio).
  3. Ruptura dogmática arbitraria.
- **Clave Correcta**: **B**

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Qué dice el principio de no contradicción?
  - *Reverso*: Es imposible que una proposición sea verdadera y falsa al mismo tiempo y bajo el mismo respecto: \sim(p \land \sim p).

- **Flashcard 2**:
  - *Anverso*: ¿En qué consiste la falacia de petición de principio (*petitio principii*)?
  - *Reverso*: En asumir encubiertamente en las premisas aquello mismo que se pretende demostrar en la conclusión (círculo vicioso).

- **Flashcard 3**:
  - *Anverso*: ¿Cuál es la diferencia fundamental entre validez y verdad?
  - *Reverso*: La **validez** se predica de la estructura de las inferencias (lógica formal); la **verdad** se predica del contenido de las proposiciones (adecuación a los hechos).

- **Flashcard 4**:
  - *Anverso*: ¿Qué falacia se comete cuando alguien dice: "Nadie ha probado que la homeopatía no funcione, por tanto es un tratamiento médico eficaz"?
  - *Reverso*: Falacia *Argumentum ad ignorantiam* (apelar a la falta de prueba como prueba de verdad).

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS FILOSÓFICOS
1. **Inferencia**: Proceso lógico mediante el cual se deriva una conclusión a partir de un conjunto de premisas aceptadas.
2. **Validez Formal**: Propiedad exclusiva de los argumentos deductivos cuando su estructura lógica garantiza que no es posible que las premisas sean verdaderas y la conclusión sea falsa.
3. **Verdad Material**: Concordancia empírica o fáctica de una proposición aislada con los hechos observables de la realidad.
4. **Premisa**: Proposición que sirve de base, apoyo o fundamento para inferir una conclusión.
5. **Falacia**: Razonamiento no válido o incorrecto, pero que presenta apariencia de razonamiento correcto y persuasivo.
6. **Entimema**: Silogismo en el cual una de las premisas (o la conclusión) se omite por considerarse obvia o sobreentendida.
7. **Ad Hominem Tu Quoque**: Modalidad de falacia que busca descalificar a un interlocutor acusándolo de incurrir en la misma falta que condena.
8. **Tautología**: Proposición compuesta que es formalmente verdadera para todas las combinaciones posibles de valores de verdad de sus variables.
9. **Contradicción**: Proposición compuesta que resulta falsa para todas las asignaciones posibles de verdad de sus variables componentes.
10. **Paradoja**: Enunciado o conjunto de premisas aparentemente verdaderas que, mediante razonamientos formalmente válidos, conducen a una contradicción lógica o antinomia irresoluble.

---



### B. Razonamiento: Deducción vs. Inducción
1. **Razonamiento Deductivo**:
   - Parte de premisas generales para derivar una conclusión necesaria y particular.
   - Si las premisas son verdaderas y la estructura es válida, la conclusión es **infaliblemente verdadera**.
   - No añade información nueva en sentido fáctico; hace explícito lo implícito.
   - *Ejemplo*: 
     - Todos los metales son conductores de electricidad. (Premisa general)
     - El cobre es un metal. (Premisa particular)
     - Por lo tanto, el cobre es conductor de electricidad. (Conclusión necesaria)
2. **Razonamiento Inductivo**:
   - Parte de la observación de casos particulares para colegir una conclusión o generalización probable.
   - La conclusión tiene carácter **probable**; no garantiza la verdad absoluta aun cuando las premisas sean verdaderas.
   - Es el motor del descubrimiento empírico y la ciencia fáctica.
   - *Ejemplo*: El cuervo 1 es negro, el cuervo 2 es negro... El cuervo n es negro \rightarrow Probablemente todos los cuervos son negros.



### A. Los Principios Lógicos Supremos
Son leyes ontológicas y gnoseológicas autoevidentes que rigen todo pensamiento coherente:
1. **Principio de Identidad** (Aristóteles / Parménides):
   - Formulación ontológica: Todo ente es idéntico a sí mismo (A \text{ es } A).
   - Formulación lógica: Si una proposición es verdadera, entonces es verdadera (p \rightarrow p).
2. **Principio de No Contradicción** (Aristóteles):
   - Formulación ontológica: Es imposible que una cosa sea y no sea al mismo tiempo y bajo el mismo respecto.
   - Formulación lógica: Dos proposiciones contradictorias no pueden ser ambas verdaderas a la vez: \sim (p \land \sim p).
3. **Principio del Tercio Excluso / Tercero Excluido** (Aristóteles):
   - Formulación ontológica: Una cosa o bien tiene una propiedad o no la tiene; no existe un tercer término intermedio.
   - Formulación lógica: Toda proposición es necesariamente verdadera o falsa; no hay una tercera opción: p \lor \sim p.
4. **Principio de Razón Suficiente** (Gottfried Wilhelm Leibniz):
   - Formulación: Nada ocurre o existe sin que haya una razón suficiente para que sea así y no de otro modo (*"Nihil est sine ratione"*). Ningún enunciado puede considerarse verdadero a menos que se aporten razones concluyentes que lo sustenten.

---

## 5. MNEMOTECNIAS PREUNIVERSITARIAS

### Nemotecnia de los Principios Lógicos:
> **"I - NO - TER - RA"**
- **I**dentidad (A = A)
- **NO** contradicción (\sim(A \land \sim A))
- **TER**cio excluso (A \lor \sim A)
- **RA**zón suficiente (Leibniz: todo tiene un porqué fundamentado)

### Nemotecnia para las Falacias Centrales:
> **"HOMBRES CON BASTONES VEN IGNORANTES POPULARES CAUSANDO PETICIONES"**
- **Hombres**: Ad *Hominem* (ataque al hombre)
- **Bastones**: Ad *Baculum* (el bastón = la fuerza)
- **Ven**: Ad *Verecundiam* (venerar a una falsa autoridad)
- **Ignorantes**: Ad *Ignorantiam* (falta de prueba)
- **Populares**: Ad *Populum* (la masa)
- **Causando**: *Causa Falsa*
- **Peticiones**: *Petición de Principio* (círculo vicioso)

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t04_s02_c01",
                    question = "En un debate público, un candidato cuestiona la propuesta tributaria de un economista diciendo: 'No debemos prestar atención al plan económico del señor Pérez, pues todos sabemos que fue procesado penalmente por estafa y es un individuo inmoral'. ¿En qué falacia no formal incurre el candidato?",
                    options = listOf(
                        "Argumentum ad Populum.",
                        "Argumentum ad Hominem (ofensivo).",
                        "Argumentum ad Verecundiam.",
                        "Argumentum ad Baculum.",
                    ),
                    correctIndex = 1,
                    explanation = "Incurre en falacia Ad Hominem ofensivo porque ataca el carácter moral y personal del individuo para desestimar su propuesta técnica, eludiendo la refutación de las premisas económicas."
                ),
                Challenge(
                    id = "filo_t04_s02_c02",
                    question = "Un empleador advierte a sus trabajadores reunidos en asamblea: 'Les recomiendo encarecidamente rechazar la propuesta del sindicato; recuerden que la empresa tiene facultades para despedir personal y las listas de despidos están sobre mi escritorio'. Este argumento constituye una falacia de:",
                    options = listOf(
                        "Argumentum ad Baculum (apelación a la fuerza o temor).",
                        "Argumentum ad Misericordiam.",
                        "Argumentum ad Ignorantiam.",
                        "Petición de principio.",
                    ),
                    correctIndex = 0,
                    explanation = "El Argumentum ad Baculum apela a la amenaza explícita o encubierta de la fuerza, coerción o uso del poder para imponer una conclusión en lugar de brindar razones lógicas pertinentes."
                ),
                Challenge(
                    id = "filo_t04_s02_c03",
                    question = "Un anuncio publicitario proclama: 'Consuma la marca de suplementos vitamínicos VitalMax, pues el renombrado cantante de reguetón Alex Boy asegura que es la fórmula perfecta para la salud celular'. ¿Qué tipo de falacia de atingencia se comete?",
                    options = listOf(
                        "Causa falsa (post hoc ergo propter hoc).",
                        "Argumentum ad Hominem circunstancial.",
                        "Argumentum ad Verecundiam (apelación a la falsa autoridad).",
                        "Argumentum ad Populum.",
                    ),
                    correctIndex = 2,
                    explanation = "La falacia Ad Verecundiam apela a la opinión o imagen de una figura célebre en un campo ajeno al tema en debate (un cantante opinando como autoridad médica y biológica)."
                ),
                Challenge(
                    id = "filo_t04_s02_c04",
                    question = "'Es absolutamente seguro que la astrología es una ciencia rigurosa y certera, puesto que hasta el día de hoy ningún astrónomo ha podido demostrar de forma indiscutible que los signos zodiacales no influyen en el carácter'. Este razonamiento ejemplifica la falacia:",
                    options = listOf(
                        "Pregunta compleja.",
                        "Argumentum ad Ignorantiam (apelación a la ignorancia).",
                        "Anfibología sintáctica.",
                        "Equívoco semántico.",
                    ),
                    correctIndex = 1,
                    explanation = "La falacia Ad Ignorantiam sostiene que una afirmación es verdadera únicamente porque no se ha demostrado su falsedad, o viceversa, trasladando indebidamente la carga de la prueba."
                ),
                Challenge(
                    id = "filo_t04_s02_c05",
                    question = "Un político pronuncia ante una multitud: 'Debemos apoyar esta reforma constitucional porque todo el pueblo soberano en las plazas y millones de ciudadanos patriotas así lo aclaman a viva voz'. ¿En qué falacia de atingencia se apoya su discurso?",
                    options = listOf(
                        "Argumentum ad Baculum.",
                        "Argumentum ad Hominem tu quoque.",
                        "División.",
                        "Argumentum ad Populum (apelación a la multitud o emociones colectivas).",
                    ),
                    correctIndex = 3,
                    explanation = "El Argumentum ad Populum apela a las emociones masivas, al fervor patriótico o al número de seguidores ('la mayoría') para validar una tesis sin fundamentación lógica objetiva."
                ),
                Challenge(
                    id = "filo_t04_s02_c06",
                    question = "Un estudiante le dice a su catedrático: 'Profesor, por favor apruébeme con nota doce en el examen final, pues si desapruebo mi madre caerá gravemente enferma del corazón y mi familia sufrirá una profunda tristeza'. Este estudiante recurre a la falacia:",
                    options = listOf(
                        "Argumentum ad Verecundiam.",
                        "Argumentum ad Misericordiam (apelación a la piedad).",
                        "Argumentum ad Baculum.",
                        "Non causa pro causa.",
                    ),
                    correctIndex = 1,
                    explanation = "La falacia Ad Misericordiam busca conmover sentimentalmente al interlocutor invocando piedad, lástima o compasión para conseguir la aprobación de una conclusión al margen del mérito objetivo."
                ),
                Challenge(
                    id = "filo_t04_s02_c07",
                    question = "'Ayer salí a la calle y se me cruzó un gato negro; dos horas después me robaron la billetera y perdí mis documentos. Es evidente que el gato negro atrajo la desgracia sobre mi vida'. ¿Qué falacia de atingencia se comete en este razonamiento?",
                    options = listOf(
                        "Falacia de composición.",
                        "Pregunta compleja.",
                        "Petición de principio (petitio principii).",
                        "Causa Falsa (Non causa pro causa / Post hoc ergo propter hoc).",
                    ),
                    correctIndex = 3,
                    explanation = "La falacia de Causa Falsa (Post hoc ergo propter hoc) atribuye erróneamente un nexo causal entre dos acontecimientos simplemente porque uno antecedió temporalmente al otro en el tiempo."
                ),
                Challenge(
                    id = "filo_t04_s02_c08",
                    question = "Cuando un fiscal le pregunta a un testigo en el juicio: '¿Ha dejado usted de golpear a su cónyuge por las noches?', obligándolo a responder con un 'sí' o un 'no', incurre en la falacia denominada:",
                    options = listOf(
                        "Argumentum ad Hominem ofensivo.",
                        "Falacia de anfibología.",
                        "Argumentum ad Baculum.",
                        "Pregunta Compleja.",
                    ),
                    correctIndex = 3,
                    explanation = "La Pregunta Compleja presupone una afirmación previa implícita y no probada (que el sujeto golpeaba a su cónyuge), de tal modo que cualquier respuesta directa ratifica la acusación oculta."
                ),
                Challenge(
                    id = "filo_t04_s02_c09",
                    question = "El razonamiento circular en el cual se asume de antemano en las premisas aquello mismo que se pretende demostrar en la conclusión (por ejemplo: 'El alma es inmortal porque no puede morir nunca') se denomina:",
                    options = listOf(
                        "Petición de Principio (Petitio principii o círculo vicioso).",
                        "Argumentum ad Ignorantiam.",
                        "Énfasis o acento.",
                        "Falacia de división.",
                    ),
                    correctIndex = 0,
                    explanation = "La Petición de Principio presupone en las premisas la verdad de la conclusión que se intenta justificar, incurriendo en una circularidad lógica vacía de fundamentación real."
                ),
                Challenge(
                    id = "filo_t04_s02_c10",
                    question = "'El fin de una cosa es su perfección; la muerte es el fin de la vida; por lo tanto, la muerte es la perfección de la vida'. ¿En qué falacia de ambigüedad incurre este silogismo?",
                    options = listOf(
                        "Composición mereológica.",
                        "Anfibología sintáctica.",
                        "Argumentum ad Verecundiam.",
                        "Equívoco (uso polisémico de un mismo término con sentidos distintos).",
                    ),
                    correctIndex = 3,
                    explanation = "La falacia del Equívoco se produce cuando una misma palabra se utiliza con distintos significados en el razonamiento: aquí 'fin' se usa primero como meta u objetivo (telos) y luego como término o extinción temporal."
                ),
            )
        )
    )
}
