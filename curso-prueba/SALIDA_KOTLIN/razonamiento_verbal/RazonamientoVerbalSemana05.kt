package razonamiento_verbal

object RazonamientoVerbalSemana05 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t05_s01",
            subjectId = "razonamiento_verbal",
            semana = 5,
            subtema = "5.1",
            title = "3.1 Anatomía de un Texto Argumentativo",
            theory = LessonTheory(
                content = """# TEMA V: Razonamiento Argumentativo Básico

---



### Matriz de Indicadores de Logro Evaluados
1. **Identificación de la tesis central:** Deslindar la postura axiológica u opinión que defiende el autor respecto a los hechos informativos neutros.
2. **Reconocimiento de argumentos primarios y secundarios:** Identificar las razones directas que sostienen la tesis frente a las meras ilustraciones complementarias.
3. **Evaluación de validez y solidez argumentativa:** Juzgar si la relación entre las premisas y la conclusión es causal, necesaria y empíricamente verificable.
4. **Mecanismos de debilitamiento y reforzamiento:** Seleccionar la información nueva que demuele o apuntala la línea argumental propuesta.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        ESTRUCTURA DEL ARGUMENTO
                                   │
         ┌─────────────────────────┴─────────────────────────┐
         ▼                                                   ▼
     LA TESIS                                         LOS ARGUMENTOS
 (Postura / Conclusión)                            (Razones de Soporte)
         │                                                   │
  ┌──────┴──────┐                                     ┌──────┴──────┐
  ▼             ▼                                     ▼             ▼
Explícita    Implícita                            Argumento      Argumentos
(Literal)   (Deducible)                           Principal     Secundarios
                                                  (Pilar base)  (Evidencias,
                                                                 ejemplos)
         │                                                   │
         └─────────────────────────┬─────────────────────────┘
                                   ▼
                      EVALUACIÓN DIALÉCTICA (DECO)
                                   │
                    ┌──────────────┴──────────────┐
                    ▼                             ▼
               DEBILITAMIENTO                REFORZAMIENTO
             (Atacar el puente             (Respaldar la regla
             causal / Supuesto)             o aportar datos)
```



### Ontología del Modelo Argumentativo de Stephen Toulmin
- **Tesis (Aserción / Pretensión):** La proposición controvertible que el emisor busca validar y defender ante su auditorio.
- **Datos (Bases / Evidencias):** Hechos empíricos, estadísticas o evidencias concretas en las que se apoya la postura.
- **Garantía (Puente Argumentativo):** Principio general, ley física o lógica compartida que autoriza el paso inferencial desde los datos hacia la tesis.
- **Respaldo:** Cuerpo de conocimientos, doctrina científica o jurisprudencia que valida la garantía.
- **Punto de Discrepancia:** Asunto específico, controvertido y no negociable sobre el cual dos expositores mantienen posturas antagónicas.

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 Anatomía de un Texto Argumentativo

#### A. La Tesis
- No es el tema. El tema es el asunto general del texto (ejemplo: *"La energía nuclear"*), mientras que la tesis es una **oración con verbo conjugado** que expresa un juicio de valor o postura (ejemplo: *"La energía nuclear debe ser sustituida por energías renovables por su alto riesgo ecológico"*).
- **Fórmula de Detección:**
  \text{Tesis} = \text{Tema} + \text{Juicio Crítico del Autor (Postura)}

#### B. Los Argumentos
- Son las razones lógicas que responden a la pregunta: *¿Por qué el autor sostiene esa tesis?*
- **Argumento Principal:** La razón medular y necesaria sin la cual la tesis colapsa por completo.
- **Argumentos Secundarios:** Apoyos colaterales, datos estadísticos, testimonios autorizados o analogías que ilustran el argumento principal.



### 3.2 La Prueba del Debilitamiento y Reforzamiento (Estándar DECO)

```
[TESIS DEL AUTOR]  ◀─── [PUENTE DE GARANTÍA] ───▶ [EVIDENCIA APORTADA]
        ▲                         ▲                        ▲
        │                         │                        │
    (Aceptada)           (PUNTO VULNERABLE:         (Dato empírico)
                          Supuesto implícito)
```

#### A. Cómo DEBILITAR un argumento
Para debilitar un argumento no se niega la tesis por capricho; se debe:
1. **Atacar la garantía implícita:** Demostrar que el vínculo entre el dato y la tesis es falso o casual.
2. **Presentar una causa alternativa más verosímil:** Mostrar que el fenómeno observado no se debió a la causa que el autor alega, sino a otro factor ajeno.
3. **Aportar un contraejemplo contundente:** Mostrar un caso idéntico donde las premisas se cumplieron pero el resultado fue opuesto.

#### B. Cómo REFORZAR un argumento
1. **Eliminar variables causales alternativas:** Demostrar que en ausencia del factor defendido por el autor, el efecto jamás se produce.
2. **Validar la muestra estadística o científica:** Aportar nuevos estudios independientes que confirmen la solidez de la evidencia primaria.
3. **Cerrar una debilidad de la garantía:** Reforzar el puente lógico mediante datos de laboratorio o evidencia histórica.



### 3.3 El Punto de Discrepancia en Textos Dialécticos
Cuando el examen presenta un texto con dos interlocutores en debate (Diálogo A vs. Diálogo B):
- **Discrepancia Central:** Aquello en lo que A y B se oponen diametralmente.
- **Puntos de Coincidencia (Trampa frecuente):** Datos o hechos de la realidad que ambos aceptan pero interpretan de forma divergente.
- *Ejemplo:* Si A dice: *"Debemos prohibir las corridas de toros por ser un acto cruel"*, y B responde: *"No debemos prohibirlas porque son una tradición cultural milenaria"*:
  - Punto de coincidencia: Ambos aceptan que las corridas de toros existen y forman parte de una tradición viva.
  - Punto de discrepancia: **Si la crueldad animal debe ser motivo suficiente para prohibir legalmente las corridas de toros**.

---



## 4. FORMULARIO MAESTRO DE EVALUACIÓN ARGUMENTATIVA

| Desafío en Admisión | Pregunta Clave de Interrogación | Criterio de Resolución |
| :--- | :--- | :--- |
| **Hallar la Tesis** | *¿Qué afirmación defiende con vehemencia el autor contra viento y marea?* | La tesis es siempre una oración enunciativa afirmativa o negativa, nunca una pregunta ni un sintagma nominal suelto. |
| **Hallar el Argumento Central** | *¿Cuál es el "PORQUE" nuclear que sostiene su tesis?* | El argumento debe ser la causa directa de la postura, no un mero ejemplo secundario. |
| **Debilitar Argumento** | *¿Qué información nueva vuelve insostenible o absurdo el puente causal del autor?* | El mejor debilitador ataca la conexión directa entre la premisa y la conclusión. |
| **Reforzar Argumento** | *¿Qué dato adicional descarta las dudas razonables del opositor?* | El mejor reforzador confirma la exclusividad de la relación causa-efecto planteada. |
| **Supuesto Subyacente** | *¿Qué premisa no dicha necesita el autor para que su argumento tenga sentido?* | Si el supuesto es falso, todo el argumento se derrumba de inmediato. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "La Mesa de Tres Patas"
- El **tablero** superior es la **TESIS** (lo que se quiere mantener en pie).
- Las **patas** son los **ARGUMENTOS** (lo que sostiene al tablero).
- Si en una pregunta de examen te piden debilitar el argumento: **¡NO cortes el tablero, serrucha una de las patas!** Quien ataca los fundamentos empíricos derriba el texto completo.



### Mnemotecnia 2: "El Duelo de Vaqueros" (Discrepancia)
- Identifica el arma de Vaquero 1 (Tesis 1).
- Identifica el arma de Vaquero 2 (Tesis 2).
- El punto de choque donde se cruzan las balas es la **Discrepancia**. Si hablan de temas paralelos que no se tocan, todavía no has encontrado el núcleo del conflicto.

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 1: La Pregunta de Oro: "¿Y QUÉ?" (Prueba de Inatingencia)
Cuando te presenten una alternativa en una pregunta de debilitar/reforzar:
- Aplica la prueba del "¿Y qué?":
  - Si la alternativa dice algo verdadero pero que no afecta directamente a la tesis del autor, pregúntate: *¿Y qué tiene que ver eso con su argumento central?*
  - Si la respuesta es "nada relevante", es un **distractor fuera de foco**. Táchala de inmediato.



### Hack 2: La Prueba de la Negación para Encontrar el Supuesto
Para hallar el **supuesto de un argumento**:
1. Toma la alternativa que crees que es el supuesto.
2. Niégala categóricamente en tu mente (ponle un "NO").
3. Si al negarla el argumento del autor se vuelve completamente absurdo e inviable, **¡esa alternativa es el supuesto obligatorio!**

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir un Ejemplo con un Argumento Central**
> Si el autor afirma: *"La educación pública en el Perú requiere una reforma urgente; por ejemplo, la escuela rural de Paucarpata no tiene conexión a internet"*.
> - Tesis: La educación pública requiere reforma urgente.
> - Argumento central: La deficiencia estructural y pedagógica generalizada.
> - Ejemplo particular: La escuela de Paucarpata.
> El distractor típico te pondrá como argumento central: *"La falta de internet en Paucarpata"*. ¡No caigas en la trampa del caso anecdótico!

> [!CAUTION]
> **Trampa 2: Fortalecer la Tesis con el Mismo Hecho (Petición de Principio)**
> Una opción que simplemente repite la tesis con palabras distintas o que dice: *"El autor tiene razón porque es un sabio"* no refuerza el argumento. Reforzar exige aportar **evidencia empírica nueva e independiente**.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En el campo del Derecho Procesal Penal (juicios orales bajo el Código Procesal Penal del Perú), los fiscales y defensores no se limitan a relatar hechos: construyen una **teoría del caso** fundamentada en el razonamiento argumentativo. La defensa técnica busca debilitar la teoría fiscal atacando la cadena de custodia de las pruebas o demostrando la existencia de dudas razonables. De igual modo, en los comités de bioética médica, evaluar la solidez de argumentos determina si se autoriza o no la terapia génica experimental o la desconexión de soporte vital en pacientes terminales.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Identificación de la Tesis Central)
**Enunciado:** Lea el siguiente texto y señale la tesis del autor:
*"A menudo se elogia la masificación de los teléfonos inteligentes como la mayor democratización del conocimiento en la historia humana. Sin embargo, diversos estudios neurobiológicos demuestran que el consumo incesante de contenidos en pantallas fragmenta la atención profunda, inhibe la memoria de trabajo a largo plazo y deteriora las habilidades de lectura analítica en los jóvenes. Por ende, lejos de hacernos más sabios, el uso compulsivo de dispositivos móviles está mermando las capacidades cognitivas estructurales de las nuevas generaciones."*
¿Cuál es la tesis central que defiende el autor?
A) Los teléfonos inteligentes son la mayor herramienta democratizadora de la historia.  
B) Diversos estudios neurobiológicos analizan la memoria de trabajo de los jóvenes.  
C) El uso compulsivo de dispositivos móviles deteriora las capacidades cognitivas estructurales de los jóvenes.  
D) Las pantallas fragmentan la atención profunda únicamente en las escuelas rurales.  
E) La lectura analítica es una habilidad prescindible en el siglo XXI.  

**Resolución Paso a Paso:**
1. Analizamos la estructura del texto:
   - Primer enunciado: Presenta la postura contraria común (alabanza de los celulares) como punto de partida dialéctico.
   - Conector *"Sin embargo"*: Introduce la objeción basada en estudios neurobiológicos (argumentos de soporte empírico).
   - Conector conclusivo *"Por ende"*: Anuncia formalmente la conclusión axiológica definitiva del autor.
2. La tesis del autor es la aserción final: el uso compulsivo de dispositivos móviles está mermando de forma estructural las capacidades cognitivas de las nuevas generaciones.
3. La alternativa C expresa de forma literal y completa dicha tesis.
**Respuesta:** C

---



### Ejercicio 2 (Nivel Intermedio: Identificación del Argumento Central)
**Enunciado (Modelo Admisión UNSA):** Respecto al texto del Ejercicio 1:
¿Cuál es el **argumento central** que esgrime el autor para sustentar su postura?
A) Que los teléfonos inteligentes son sumamente costosos para las familias de bajos recursos.  
B) Que el consumo incesante de pantallas deteriora la atención profunda y la memoria de trabajo a largo plazo.  
C) Que las aplicaciones móviles fueron creadas por ingenieros sin escrúpulos.  
D) Que la sabiduría se adquiere únicamente leyendo libros impresos en pergamino.  
E) Que la democratización de la información es un ideal inalcanzable.  

**Resolución Paso a Paso:**
1. Pregunta clave: *¿Por qué el autor afirma que los celulares merman las capacidades cognitivas?*
2. Buscamos en el texto la causa biológica y psicológica directa: El autor sostiene que las pantallas provocan la fragmentación de la atención, la inhibición de la memoria de trabajo y la pérdida de lectura analítica.
3. Este mecanismo neurocognitivo constituye el pilar probatorio indispensable (el argumento central).
4. La opción B reproduce con exactitud este fundamento.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Debilitamiento de un Argumento)
**Enunciado:** Analice el siguiente razonamiento:
*"La ciudad de Arequipa debe prohibir totalmente el ingreso de automóviles particulares al Centro Histórico para salvar los monumentos de sillar del deterioro. Las mediciones ambientales demuestran que el dióxido de azufre (SO_2) y los gases emitidos por los tubos de escape reaccionan químicamente con la humedad atmosférica, formando microácidos que corroen y disuelven la roca volcánica de los monumentos coloniales."*
¿Cuál de las siguientes informaciones, de ser verdadera, **debilitaría con mayor fuerza** el argumento del autor?
A) La mayoría de ciudadanos arequipeños apoya la peatonalización del centro histórico.  
B) Existen pinturas protectoras sintéticas transparentes de reciente invención que son muy caras.  
C) Los estudios geológicos del INGEMMET demuestran que más del 90% de la corrosión del sillar en el Centro Histórico es causada por la humedad salitrosa del subsuelo y la radiación solar extrema, siendo el impacto vehicular inferior al 2%.  
D) Las municipalidades distritales aledañas no han comprado suficientes autobuses ecológicos.  
E) El sillar proviene de las canteras de Añashuayco y no de erupciones recientes del volcán Misti.  

**Resolución Paso a Paso:**
1. Tesis del autor: Debe prohibirse el ingreso vehicular al centro histórico para salvar los monumentos.
2. Argumento del autor: El humo y gases de los autos son la causa determinante que disuelve y corroe el sillar.
3. Para demoler este argumento, debemos demostrar que **los autos NO son la causa relevante del deterioro** del sillar.
4. Evaluamos la alternativa C: Si un estudio científico prueba que el 90% del daño se debe a la humedad freática y radiación solar, y que el tráfico vehicular solo incide en un insignificante 2%, prohibir los autos no salvará los monumentos en absoluto. La premisa causal del autor queda pulverizada.
**Respuesta:** C

---



### Ejercicio 4 (Nivel Avanzado DECO: Determinación del Punto de Discrepancia)
**Enunciado (Tipo San Marcos DECO / UNSA):**
- **MARIELA:** *"El Estado debe aplicar la eutanasia activa legal a aquellos pacientes terminales con dolores insoportables que lo soliciten lúcidamente. Obligar a un ser humano a padecer una agonía atroz y prolongada sin esperanza de curación atenta contra el principio constitucional de la dignidad humana. Cada individuo es dueño absoluto de su propia existencia."*
- **FERNANDO:** *"La vida humana es un derecho supremo e inalienable protegido por la Constitución desde la concepción; el Estado no puede autorizar su supresión bajo ninguna circunstancia. La función de la medicina moderna y del Estado no es quitar la vida para eliminar el sufrimiento, sino proporcionar cuidados paliativos integrales y sedación médica avanzada que garanticen una muerte natural libre de dolor."*
¿Cuál es el **punto central de discrepancia** entre Mariela y Fernando?
A) Si la medicina moderna cuenta con suficientes fármacos paliativos en los hospitales públicos.  
B) Si el sufrimiento físico terminal resulta una experiencia dolorosa para el ser humano.  
C) Si la Constitución Política protege formalmente el derecho a la vida desde la concepción.  
D) Si el Estado debe legalizar y aplicar la eutanasia activa en pacientes terminales que sufren dolores insoportables.  
E) Si los pacientes en coma deben ser desconectados por decisión unilateral de los médicos.  

**Resolución Paso a Paso:**
1. Analizamos la tesis de Mariela: El Estado **debe legalizar y aplicar la eutanasia activa** a pacientes terminales que lo soliciten para evitar sufrimiento.
2. Analizamos la tesis de Fernando: El Estado **no puede autorizar la eutanasia bajo ninguna circunstancia**, debiendo optar exclusivamente por cuidados paliativos.
3. Ambos coinciden en que los pacientes terminales sufren y que el dolor debe mitigarse.
4. El choque frontal ineludible radica en: **Si el Estado debe o no autorizar legalmente la eutanasia activa como solución al sufrimiento terminal**.
5. La opción D formula con exactitud matemática y dialéctica la controversia.
**Respuesta:** D

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Reforzamiento de Argumento y Supuesto Implícito)
**Enunciado (Nivel UNI / Excelencia Dialéctica):** Lea atentamente la siguiente columna de opinión:
*"El Ministerio de Educación del Perú debe reemplazar la enseñanza tradicional de contenidos enciclopédicos por la enseñanza obligatoria de programación informática y pensamiento computacional desde la educación primaria. La historia económica demuestra que los países que lideran el PIB mundial son aquellos que forman creadores de software y no meros consumidores de tecnología. Si no capacitamos a los niños en algoritmos, el Perú quedará irremediablemente condenado a la dependencia tecnológica y al subdesarrollo en la economía digital."*
¿Cuál de las siguientes afirmaciones constituye el **supuesto fundamental no expresado** del cual depende la validez lógica de todo el argumento del autor?
A) Los profesores de educación primaria del Perú cuentan con computadoras de última generación en sus aulas.  
B) La economía digital mundial demandará millones de empleos de programadores en los próximos diez años.  
C) Las capacidades de razonamiento abstracto y resolución de problemas algorítmicos adquiridas en la niñez son transferibles eficazmente a la productividad de la matriz económica de un país.  
D) El estudio de la historia y la geografía peruana carece de toda utilidad cívica y formativa.  
E) Todos los niños peruanos prefieren crear videojuegos antes que leer obras de literatura clásica.  

**Resolución Paso a Paso:**
1. Identificamos el salto inferencial (la garantía oculta de Toulmin):
   - El autor vincula: Enseñar programación a niños en primaria \to Transformar al Perú en un país líder económico libre del subdesarrollo digital.
   - ¿Qué supuesto implícito es indispensable para que esta relación sea lógica y no una fantasía retórica?
2. Aplicamos el Hack 2 (La Prueba de la Negación):
   - Neguemos la alternativa C: *"Las capacidades algorítmicas adquiridas en la niñez **NO** son transferibles eficazmente a la productividad económica del país"*.
   - Si no son transferibles y los niños programadores no generan productividad en la economía real, entonces enseñar programación en primaria **no sacará al Perú del subdesarrollo**. ¡Todo el argumento del autor se desmorona de inmediato!
3. Por tanto, el supuesto indispensable sobre el cual descansa toda la propuesta es que la formación algorítmica temprana se transfiere con éxito al desarrollo socioeconómico nacional.
**Respuesta:** C

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Tesis:** Postura, aserción o juicio valorativo que un autor defiende frente a un tema controvertido.
2. **Argumento:** Enunciado fáctico o racional estructurado para respaldar y demostrar la verdad de la tesis.
3. **Punto de Discrepancia:** Núcleo específico de contradicción irreductible entre dos posturas dialécticas.
4. **Debilitamiento:** Aporte de nueva evidencia o demostración lógica que destruye o fisura la solidez de un argumento.
5. **Reforzamiento:** Aporte de nuevos datos empíricos que consolidan la validez de la garantía argumental.
6. **Supuesto:** Premisa tácita o no formulada explícitamente cuya verdad es indispensable para que el argumento funcione.
7. **Petición de Principio:** Vicio argumentativo donde la conclusión se asume encubiertamente en una de las premisas.
8. **Contraargumento:** Razón formulada para anticipar, desbaratar y anular las objeciones del adversario.
9. **Garantía (Toulmin):** Norma o principio general que justifica inferir la conclusión a partir de las evidencias.
10. **Lectura Crítica:** Nivel superior de comprensión lectora que evalúa la ideología, solidez y sesgos del discurso.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la diferencia fundamental entre el tema de un texto y la tesis?**  
  **A:** El tema es el asunto neutro sin verbo conjugado ("La clonación humana"); la tesis es una postura crítica oracional ("La clonación humana es éticamente inaceptable").
- **Q: ¿Cómo se refuta eficazmente un argumento de causa-efecto?**  
  **A:** Demostrando que el efecto se produce incluso sin la causa alegada, o que una tercera variable oculta es la verdadera causa del fenómeno.
- **Q: ¿Qué ocurre cuando niegas mentalmente el supuesto de un texto argumentativo?**  
  **A:** La tesis y el argumento central del autor colapsan inmediatamente, demostrando que dependían de dicha premisa oculta.
- **Q: Si dos personas discuten sobre si la pena de muerte disuade a los asesinos, ¿cuál es su punto de discrepancia?**  
  **A:** La eficacia disuasoria de la pena de muerte frente al delito de homicidio calificado.
- **Q: ¿Por qué aportar un simple ejemplo aislado no basta para reforzar un argumento general?**  
  **A:** Porque un caso particular puede ser una anécdota fortuita; reforzar exige datos sistemáticos o validación de la garantía causal.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t05_s01_c01",
                    question = "En el análisis de textos argumentativos bajo el modelo DECO, la 'Tesis' se define formalmente como:",
                    options = listOf(
                        "Un dato estadístico numérico presentado en una tabla comparativa.",
                        "El resumen cronológico de los hechos históricos narrados en una crónica.",
                        "El listado bibliográfico de fuentes consultadas por el autor.",
                        "La postura, opinión o juicio valorativo fundamental que el autor asume y se propone defender o demostrar mediante razones a lo largo del texto.",
                    ),
                    correctIndex = 3,
                    explanation = "La tesis es la médula del texto argumentativo: es la afirmación o toma de postura crítica del autor ante un tema controversial, respaldada por un entramado de argumentos."
                ),
                Challenge(
                    id = "rv_t05_s01_c02",
                    question = "¿Cuál es la función específica de un 'Argumento' en la estructura del texto argumentativo?",
                    options = listOf(
                        "Decorar estilísticamente la narración mediante figuras poéticas y rimas.",
                        "Enumerar los nombres de los personajes de una novela de aventuras.",
                        "Proveer razones, pruebas empíricas, datos objetivos o principios lógicos que sustentan, justifican y dan validez a la tesis defendida.",
                        "Repetir de manera idéntica la introducción sin aportar nada nuevo.",
                    ),
                    correctIndex = 2,
                    explanation = "El argumento es la proposición de respaldo: aporta la justificación racional o probatoria que demuestra por qué la tesis es válida y convincente."
                ),
                Challenge(
                    id = "rv_t05_s01_c03",
                    question = "En un texto argumentativo dialéctico, un 'Contraargumento' cumple el propósito estratégico de:",
                    options = listOf(
                        "Anticipar una objeción o postura contraria para refutarla, debilitarla y así consolidar la solidez de la propia tesis.",
                        "Distraer al lector para que olvide el tema principal del debate.",
                        "Demostrar que el autor carece de convicciones personales.",
                        "Copiar las opiniones del adversario sin formular ningún juicio crítico.",
                    ),
                    correctIndex = 0,
                    explanation = "El contraargumento examina las objeciones potenciales del oponente para neutralizarlas y desmontarlas mediante razones lógicas superiores."
                ),
                Challenge(
                    id = "rv_t05_s01_c04",
                    question = "Lea el siguiente texto breve: 'El consumo excesivo de bebidas ultraprocesadas con alto contenido de azúcares añadidos no solo detona obesidad mórbida, sino que altera la resistencia a la insulina a edades cada vez más tempranas. En consecuencia, el Estado debe prohibir su comercialización en los quioscos escolares'. ¿Cuál es la tesis central del autor?",
                    options = listOf(
                        "La obesidad mórbida es el único problema de salud pública de la infancia.",
                        "El Estado debe prohibir la comercialización de bebidas ultraprocesadas azucaradas en los quioscos escolares.",
                        "La insulina es una hormona segregada por el páncreas humano.",
                        "Las cafeterías escolares ofrecen productos de diversa procedencia comercial.",
                    ),
                    correctIndex = 1,
                    explanation = "La tesis es la conclusión normativa y propositiva que el autor defiende ('el Estado debe prohibir su comercialización en quioscos escolares'), siendo las patologías médicas los argumentos que la fundamentan."
                ),
                Challenge(
                    id = "rv_t05_s01_c05",
                    question = "Al diferenciar entre el 'Tema' y la 'Tesis' de un texto, se establece con rigor metodológico que:",
                    options = listOf(
                        "El tema y la tesis son conceptos idénticos que no guardan ninguna diferencia.",
                        "El tema es el asunto general del que trata el texto expresado en una frase nominal sintética, mientras que la tesis es una oración que toma partido y afirma o niega algo sobre ese tema.",
                        "El tema expresa una postura a favor o en contra y la tesis es una frase neutra.",
                        "El tema solo se formula en textos poéticos y la tesis en recetas culinarias.",
                    ),
                    correctIndex = 1,
                    explanation = "El tema responde a '¿de qué trata el texto?' (frase nominal, ej. 'La inteligencia artificial en la educación'); la tesis responde a '¿qué opina el autor sobre el tema?' (oración asertiva, ej. 'La IA precariza el pensamiento crítico si no se regula')."
                ),
                Challenge(
                    id = "rv_t05_s01_c06",
                    question = "El 'Argumento de Autoridad' (cuando se emplea legítimamente en el discurso argumentativo) consiste en:",
                    options = listOf(
                        "Citar a una persona famosa de la farándula para opinar de física nuclear.",
                        "Amenazar al lector con sanciones penales si no acepta la tesis.",
                        "Votar democráticamente en una plaza para decidir si la Tierra es plana.",
                        "Fundamentar una afirmación invocando el juicio, peritaje o conclusiones de un especialista o institución científica de reconocido prestigio en la materia tratada.",
                    ),
                    correctIndex = 3,
                    explanation = "El argumento de autoridad legítimo se apoya en el consenso o dictamen fundado de expertos reconocidos en el campo del conocimiento en discusión."
                ),
                Challenge(
                    id = "rv_t05_s01_c07",
                    question = "Un 'Argumento por Causa' demuestra la tesis mediante:",
                    options = listOf(
                        "El señalamiento del nexo de causalidad objetivo entre un factor determinante y el efecto producido que valida la conclusión.",
                        "La burla sarcástica del aspecto físico del contrincante.",
                        "La comparación poética entre dos animales fantásticos.",
                        "La transcripción de proverbios anónimos populares.",
                    ),
                    correctIndex = 0,
                    explanation = "El argumento causal explica cómo y por qué ciertas causas o antecedentes generan de forma necesaria o probable la consecuencia defendida en la tesis."
                ),
                Challenge(
                    id = "rv_t05_s01_c08",
                    question = "En un ensayo argumentativo, la 'Conclusión' o síntesis cumple la función de:",
                    options = listOf(
                        "Reiterar la tesis a la luz de los argumentos demostrados, extrayendo implicancias prácticas, recomendaciones o reflexiones finales.",
                        "Introducir un tema totalmente nuevo que contradiga todo lo anterior.",
                        "Pedir disculpas al lector por haber escrito el ensayo.",
                        "Enumerar los signos de puntuación utilizados en el manuscrito.",
                    ),
                    correctIndex = 0,
                    explanation = "La conclusión recapitula el núcleo del debate, reafirmando la validez de la tesis consolidada tras el despliegue argumentativo."
                ),
                Challenge(
                    id = "rv_t05_s01_c09",
                    question = "Cuando un autor introduce en su texto la fórmula 'Muchos sostienen erróneamente que...; sin embargo, las investigaciones recientes demuestran que...', está empleando la técnica retórica de:",
                    options = listOf(
                        "Contraargumentación o refutación dialéctica.",
                        "Tautología viciosa.",
                        "Concesión irreflexiva.",
                        "Paradoja semántica.",
                    ),
                    correctIndex = 0,
                    explanation = "La fórmula presenta la tesis adversaria para inmediatamente desestimarla y refutarla mediante evidencia actualizada, reforzando la postura propia."
                ),
                Challenge(
                    id = "rv_t05_s01_c10",
                    question = "La 'Premisa Implícita' o entimema en un razonamiento argumentativo es:",
                    options = listOf(
                        "Un dato falso introducido con dolo para engañar al tribunal.",
                        "Una palabra extranjera que no figura en los diccionarios de la lengua.",
                        "Un supuesto o presupuesto no expresado textualmente que resulta lógicamente indispensable para que la conclusión se derive con validez de las premisas explícitas.",
                        "El epígrafe poético que encabeza un libro de historia.",
                    ),
                    correctIndex = 2,
                    explanation = "La premisa implícita es el eslabón tácito que el receptor debe inferir para conectar coherentemente el argumento explícito con la tesis defendida."
                ),
            )
        ),
        LessonNode(
            id = "rv_t05_s02",
            subjectId = "razonamiento_verbal",
            semana = 5,
            subtema = "5.2",
            title = "3.2 La Prueba del Debilitamiento y Reforzamiento (Estándar DECO)",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Identificación de la tesis central:** Deslindar la postura axiológica u opinión que defiende el autor respecto a los hechos informativos neutros.
2. **Reconocimiento de argumentos primarios y secundarios:** Identificar las razones directas que sostienen la tesis frente a las meras ilustraciones complementarias.
3. **Evaluación de validez y solidez argumentativa:** Juzgar si la relación entre las premisas y la conclusión es causal, necesaria y empíricamente verificable.
4. **Mecanismos de debilitamiento y reforzamiento:** Seleccionar la información nueva que demuele o apuntala la línea argumental propuesta.

---



### 3.2 La Prueba del Debilitamiento y Reforzamiento (Estándar DECO)

```
[TESIS DEL AUTOR]  ◀─── [PUENTE DE GARANTÍA] ───▶ [EVIDENCIA APORTADA]
        ▲                         ▲                        ▲
        │                         │                        │
    (Aceptada)           (PUNTO VULNERABLE:         (Dato empírico)
                          Supuesto implícito)
```

#### A. Cómo DEBILITAR un argumento
Para debilitar un argumento no se niega la tesis por capricho; se debe:
1. **Atacar la garantía implícita:** Demostrar que el vínculo entre el dato y la tesis es falso o casual.
2. **Presentar una causa alternativa más verosímil:** Mostrar que el fenómeno observado no se debió a la causa que el autor alega, sino a otro factor ajeno.
3. **Aportar un contraejemplo contundente:** Mostrar un caso idéntico donde las premisas se cumplieron pero el resultado fue opuesto.

#### B. Cómo REFORZAR un argumento
1. **Eliminar variables causales alternativas:** Demostrar que en ausencia del factor defendido por el autor, el efecto jamás se produce.
2. **Validar la muestra estadística o científica:** Aportar nuevos estudios independientes que confirmen la solidez de la evidencia primaria.
3. **Cerrar una debilidad de la garantía:** Reforzar el puente lógico mediante datos de laboratorio o evidencia histórica.



## 4. FORMULARIO MAESTRO DE EVALUACIÓN ARGUMENTATIVA

| Desafío en Admisión | Pregunta Clave de Interrogación | Criterio de Resolución |
| :--- | :--- | :--- |
| **Hallar la Tesis** | *¿Qué afirmación defiende con vehemencia el autor contra viento y marea?* | La tesis es siempre una oración enunciativa afirmativa o negativa, nunca una pregunta ni un sintagma nominal suelto. |
| **Hallar el Argumento Central** | *¿Cuál es el "PORQUE" nuclear que sostiene su tesis?* | El argumento debe ser la causa directa de la postura, no un mero ejemplo secundario. |
| **Debilitar Argumento** | *¿Qué información nueva vuelve insostenible o absurdo el puente causal del autor?* | El mejor debilitador ataca la conexión directa entre la premisa y la conclusión. |
| **Reforzar Argumento** | *¿Qué dato adicional descarta las dudas razonables del opositor?* | El mejor reforzador confirma la exclusividad de la relación causa-efecto planteada. |
| **Supuesto Subyacente** | *¿Qué premisa no dicha necesita el autor para que su argumento tenga sentido?* | Si el supuesto es falso, todo el argumento se derrumba de inmediato. |

---



### Mnemotecnia 1: "La Mesa de Tres Patas"
- El **tablero** superior es la **TESIS** (lo que se quiere mantener en pie).
- Las **patas** son los **ARGUMENTOS** (lo que sostiene al tablero).
- Si en una pregunta de examen te piden debilitar el argumento: **¡NO cortes el tablero, serrucha una de las patas!** Quien ataca los fundamentos empíricos derriba el texto completo.



### Hack 1: La Pregunta de Oro: "¿Y QUÉ?" (Prueba de Inatingencia)
Cuando te presenten una alternativa en una pregunta de debilitar/reforzar:
- Aplica la prueba del "¿Y qué?":
  - Si la alternativa dice algo verdadero pero que no afecta directamente a la tesis del autor, pregúntate: *¿Y qué tiene que ver eso con su argumento central?*
  - Si la respuesta es "nada relevante", es un **distractor fuera de foco**. Táchala de inmediato.



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir un Ejemplo con un Argumento Central**
> Si el autor afirma: *"La educación pública en el Perú requiere una reforma urgente; por ejemplo, la escuela rural de Paucarpata no tiene conexión a internet"*.
> - Tesis: La educación pública requiere reforma urgente.
> - Argumento central: La deficiencia estructural y pedagógica generalizada.
> - Ejemplo particular: La escuela de Paucarpata.
> El distractor típico te pondrá como argumento central: *"La falta de internet en Paucarpata"*. ¡No caigas en la trampa del caso anecdótico!

> [!CAUTION]
> **Trampa 2: Fortalecer la Tesis con el Mismo Hecho (Petición de Principio)**
> Una opción que simplemente repite la tesis con palabras distintas o que dice: *"El autor tiene razón porque es un sabio"* no refuerza el argumento. Reforzar exige aportar **evidencia empírica nueva e independiente**.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En el campo del Derecho Procesal Penal (juicios orales bajo el Código Procesal Penal del Perú), los fiscales y defensores no se limitan a relatar hechos: construyen una **teoría del caso** fundamentada en el razonamiento argumentativo. La defensa técnica busca debilitar la teoría fiscal atacando la cadena de custodia de las pruebas o demostrando la existencia de dudas razonables. De igual modo, en los comités de bioética médica, evaluar la solidez de argumentos determina si se autoriza o no la terapia génica experimental o la desconexión de soporte vital en pacientes terminales.

---



### Ejercicio 2 (Nivel Intermedio: Identificación del Argumento Central)
**Enunciado (Modelo Admisión UNSA):** Respecto al texto del Ejercicio 1:
¿Cuál es el **argumento central** que esgrime el autor para sustentar su postura?
A) Que los teléfonos inteligentes son sumamente costosos para las familias de bajos recursos.  
B) Que el consumo incesante de pantallas deteriora la atención profunda y la memoria de trabajo a largo plazo.  
C) Que las aplicaciones móviles fueron creadas por ingenieros sin escrúpulos.  
D) Que la sabiduría se adquiere únicamente leyendo libros impresos en pergamino.  
E) Que la democratización de la información es un ideal inalcanzable.  

**Resolución Paso a Paso:**
1. Pregunta clave: *¿Por qué el autor afirma que los celulares merman las capacidades cognitivas?*
2. Buscamos en el texto la causa biológica y psicológica directa: El autor sostiene que las pantallas provocan la fragmentación de la atención, la inhibición de la memoria de trabajo y la pérdida de lectura analítica.
3. Este mecanismo neurocognitivo constituye el pilar probatorio indispensable (el argumento central).
4. La opción B reproduce con exactitud este fundamento.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Debilitamiento de un Argumento)
**Enunciado:** Analice el siguiente razonamiento:
*"La ciudad de Arequipa debe prohibir totalmente el ingreso de automóviles particulares al Centro Histórico para salvar los monumentos de sillar del deterioro. Las mediciones ambientales demuestran que el dióxido de azufre (SO_2) y los gases emitidos por los tubos de escape reaccionan químicamente con la humedad atmosférica, formando microácidos que corroen y disuelven la roca volcánica de los monumentos coloniales."*
¿Cuál de las siguientes informaciones, de ser verdadera, **debilitaría con mayor fuerza** el argumento del autor?
A) La mayoría de ciudadanos arequipeños apoya la peatonalización del centro histórico.  
B) Existen pinturas protectoras sintéticas transparentes de reciente invención que son muy caras.  
C) Los estudios geológicos del INGEMMET demuestran que más del 90% de la corrosión del sillar en el Centro Histórico es causada por la humedad salitrosa del subsuelo y la radiación solar extrema, siendo el impacto vehicular inferior al 2%.  
D) Las municipalidades distritales aledañas no han comprado suficientes autobuses ecológicos.  
E) El sillar proviene de las canteras de Añashuayco y no de erupciones recientes del volcán Misti.  

**Resolución Paso a Paso:**
1. Tesis del autor: Debe prohibirse el ingreso vehicular al centro histórico para salvar los monumentos.
2. Argumento del autor: El humo y gases de los autos son la causa determinante que disuelve y corroe el sillar.
3. Para demoler este argumento, debemos demostrar que **los autos NO son la causa relevante del deterioro** del sillar.
4. Evaluamos la alternativa C: Si un estudio científico prueba que el 90% del daño se debe a la humedad freática y radiación solar, y que el tráfico vehicular solo incide en un insignificante 2%, prohibir los autos no salvará los monumentos en absoluto. La premisa causal del autor queda pulverizada.
**Respuesta:** C

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Reforzamiento de Argumento y Supuesto Implícito)
**Enunciado (Nivel UNI / Excelencia Dialéctica):** Lea atentamente la siguiente columna de opinión:
*"El Ministerio de Educación del Perú debe reemplazar la enseñanza tradicional de contenidos enciclopédicos por la enseñanza obligatoria de programación informática y pensamiento computacional desde la educación primaria. La historia económica demuestra que los países que lideran el PIB mundial son aquellos que forman creadores de software y no meros consumidores de tecnología. Si no capacitamos a los niños en algoritmos, el Perú quedará irremediablemente condenado a la dependencia tecnológica y al subdesarrollo en la economía digital."*
¿Cuál de las siguientes afirmaciones constituye el **supuesto fundamental no expresado** del cual depende la validez lógica de todo el argumento del autor?
A) Los profesores de educación primaria del Perú cuentan con computadoras de última generación en sus aulas.  
B) La economía digital mundial demandará millones de empleos de programadores en los próximos diez años.  
C) Las capacidades de razonamiento abstracto y resolución de problemas algorítmicos adquiridas en la niñez son transferibles eficazmente a la productividad de la matriz económica de un país.  
D) El estudio de la historia y la geografía peruana carece de toda utilidad cívica y formativa.  
E) Todos los niños peruanos prefieren crear videojuegos antes que leer obras de literatura clásica.  

**Resolución Paso a Paso:**
1. Identificamos el salto inferencial (la garantía oculta de Toulmin):
   - El autor vincula: Enseñar programación a niños en primaria \to Transformar al Perú en un país líder económico libre del subdesarrollo digital.
   - ¿Qué supuesto implícito es indispensable para que esta relación sea lógica y no una fantasía retórica?
2. Aplicamos el Hack 2 (La Prueba de la Negación):
   - Neguemos la alternativa C: *"Las capacidades algorítmicas adquiridas en la niñez **NO** son transferibles eficazmente a la productividad económica del país"*.
   - Si no son transferibles y los niños programadores no generan productividad en la economía real, entonces enseñar programación en primaria **no sacará al Perú del subdesarrollo**. ¡Todo el argumento del autor se desmorona de inmediato!
3. Por tanto, el supuesto indispensable sobre el cual descansa toda la propuesta es que la formación algorítmica temprana se transfiere con éxito al desarrollo socioeconómico nacional.
**Respuesta:** C

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        ESTRUCTURA DEL ARGUMENTO
                                   │
         ┌─────────────────────────┴─────────────────────────┐
         ▼                                                   ▼
     LA TESIS                                         LOS ARGUMENTOS
 (Postura / Conclusión)                            (Razones de Soporte)
         │                                                   │
  ┌──────┴──────┐                                     ┌──────┴──────┐
  ▼             ▼                                     ▼             ▼
Explícita    Implícita                            Argumento      Argumentos
(Literal)   (Deducible)                           Principal     Secundarios
                                                  (Pilar base)  (Evidencias,
                                                                 ejemplos)
         │                                                   │
         └─────────────────────────┬─────────────────────────┘
                                   ▼
                      EVALUACIÓN DIALÉCTICA (DECO)
                                   │
                    ┌──────────────┴──────────────┐
                    ▼                             ▼
               DEBILITAMIENTO                REFORZAMIENTO
             (Atacar el puente             (Respaldar la regla
             causal / Supuesto)             o aportar datos)
```



### Ontología del Modelo Argumentativo de Stephen Toulmin
- **Tesis (Aserción / Pretensión):** La proposición controvertible que el emisor busca validar y defender ante su auditorio.
- **Datos (Bases / Evidencias):** Hechos empíricos, estadísticas o evidencias concretas en las que se apoya la postura.
- **Garantía (Puente Argumentativo):** Principio general, ley física o lógica compartida que autoriza el paso inferencial desde los datos hacia la tesis.
- **Respaldo:** Cuerpo de conocimientos, doctrina científica o jurisprudencia que valida la garantía.
- **Punto de Discrepancia:** Asunto específico, controvertido y no negociable sobre el cual dos expositores mantienen posturas antagónicas.

---



### 3.1 Anatomía de un Texto Argumentativo

#### A. La Tesis
- No es el tema. El tema es el asunto general del texto (ejemplo: *"La energía nuclear"*), mientras que la tesis es una **oración con verbo conjugado** que expresa un juicio de valor o postura (ejemplo: *"La energía nuclear debe ser sustituida por energías renovables por su alto riesgo ecológico"*).
- **Fórmula de Detección:**
  \text{Tesis} = \text{Tema} + \text{Juicio Crítico del Autor (Postura)}

#### B. Los Argumentos
- Son las razones lógicas que responden a la pregunta: *¿Por qué el autor sostiene esa tesis?*
- **Argumento Principal:** La razón medular y necesaria sin la cual la tesis colapsa por completo.
- **Argumentos Secundarios:** Apoyos colaterales, datos estadísticos, testimonios autorizados o analogías que ilustran el argumento principal.



### Hack 2: La Prueba de la Negación para Encontrar el Supuesto
Para hallar el **supuesto de un argumento**:
1. Toma la alternativa que crees que es el supuesto.
2. Niégala categóricamente en tu mente (ponle un "NO").
3. Si al negarla el argumento del autor se vuelve completamente absurdo e inviable, **¡esa alternativa es el supuesto obligatorio!**

---



### Ejercicio 1 (Nivel Básico: Identificación de la Tesis Central)
**Enunciado:** Lea el siguiente texto y señale la tesis del autor:
*"A menudo se elogia la masificación de los teléfonos inteligentes como la mayor democratización del conocimiento en la historia humana. Sin embargo, diversos estudios neurobiológicos demuestran que el consumo incesante de contenidos en pantallas fragmenta la atención profunda, inhibe la memoria de trabajo a largo plazo y deteriora las habilidades de lectura analítica en los jóvenes. Por ende, lejos de hacernos más sabios, el uso compulsivo de dispositivos móviles está mermando las capacidades cognitivas estructurales de las nuevas generaciones."*
¿Cuál es la tesis central que defiende el autor?
A) Los teléfonos inteligentes son la mayor herramienta democratizadora de la historia.  
B) Diversos estudios neurobiológicos analizan la memoria de trabajo de los jóvenes.  
C) El uso compulsivo de dispositivos móviles deteriora las capacidades cognitivas estructurales de los jóvenes.  
D) Las pantallas fragmentan la atención profunda únicamente en las escuelas rurales.  
E) La lectura analítica es una habilidad prescindible en el siglo XXI.  

**Resolución Paso a Paso:**
1. Analizamos la estructura del texto:
   - Primer enunciado: Presenta la postura contraria común (alabanza de los celulares) como punto de partida dialéctico.
   - Conector *"Sin embargo"*: Introduce la objeción basada en estudios neurobiológicos (argumentos de soporte empírico).
   - Conector conclusivo *"Por ende"*: Anuncia formalmente la conclusión axiológica definitiva del autor.
2. La tesis del autor es la aserción final: el uso compulsivo de dispositivos móviles está mermando de forma estructural las capacidades cognitivas de las nuevas generaciones.
3. La alternativa C expresa de forma literal y completa dicha tesis.
**Respuesta:** C

---



### Ejercicio 4 (Nivel Avanzado DECO: Determinación del Punto de Discrepancia)
**Enunciado (Tipo San Marcos DECO / UNSA):**
- **MARIELA:** *"El Estado debe aplicar la eutanasia activa legal a aquellos pacientes terminales con dolores insoportables que lo soliciten lúcidamente. Obligar a un ser humano a padecer una agonía atroz y prolongada sin esperanza de curación atenta contra el principio constitucional de la dignidad humana. Cada individuo es dueño absoluto de su propia existencia."*
- **FERNANDO:** *"La vida humana es un derecho supremo e inalienable protegido por la Constitución desde la concepción; el Estado no puede autorizar su supresión bajo ninguna circunstancia. La función de la medicina moderna y del Estado no es quitar la vida para eliminar el sufrimiento, sino proporcionar cuidados paliativos integrales y sedación médica avanzada que garanticen una muerte natural libre de dolor."*
¿Cuál es el **punto central de discrepancia** entre Mariela y Fernando?
A) Si la medicina moderna cuenta con suficientes fármacos paliativos en los hospitales públicos.  
B) Si el sufrimiento físico terminal resulta una experiencia dolorosa para el ser humano.  
C) Si la Constitución Política protege formalmente el derecho a la vida desde la concepción.  
D) Si el Estado debe legalizar y aplicar la eutanasia activa en pacientes terminales que sufren dolores insoportables.  
E) Si los pacientes en coma deben ser desconectados por decisión unilateral de los médicos.  

**Resolución Paso a Paso:**
1. Analizamos la tesis de Mariela: El Estado **debe legalizar y aplicar la eutanasia activa** a pacientes terminales que lo soliciten para evitar sufrimiento.
2. Analizamos la tesis de Fernando: El Estado **no puede autorizar la eutanasia bajo ninguna circunstancia**, debiendo optar exclusivamente por cuidados paliativos.
3. Ambos coinciden en que los pacientes terminales sufren y que el dolor debe mitigarse.
4. El choque frontal ineludible radica en: **Si el Estado debe o no autorizar legalmente la eutanasia activa como solución al sufrimiento terminal**.
5. La opción D formula con exactitud matemática y dialéctica la controversia.
**Respuesta:** D

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Tesis:** Postura, aserción o juicio valorativo que un autor defiende frente a un tema controvertido.
2. **Argumento:** Enunciado fáctico o racional estructurado para respaldar y demostrar la verdad de la tesis.
3. **Punto de Discrepancia:** Núcleo específico de contradicción irreductible entre dos posturas dialécticas.
4. **Debilitamiento:** Aporte de nueva evidencia o demostración lógica que destruye o fisura la solidez de un argumento.
5. **Reforzamiento:** Aporte de nuevos datos empíricos que consolidan la validez de la garantía argumental.
6. **Supuesto:** Premisa tácita o no formulada explícitamente cuya verdad es indispensable para que el argumento funcione.
7. **Petición de Principio:** Vicio argumentativo donde la conclusión se asume encubiertamente en una de las premisas.
8. **Contraargumento:** Razón formulada para anticipar, desbaratar y anular las objeciones del adversario.
9. **Garantía (Toulmin):** Norma o principio general que justifica inferir la conclusión a partir de las evidencias.
10. **Lectura Crítica:** Nivel superior de comprensión lectora que evalúa la ideología, solidez y sesgos del discurso.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Cuál es la diferencia fundamental entre el tema de un texto y la tesis?**  
  **A:** El tema es el asunto neutro sin verbo conjugado ("La clonación humana"); la tesis es una postura crítica oracional ("La clonación humana es éticamente inaceptable").
- **Q: ¿Cómo se refuta eficazmente un argumento de causa-efecto?**  
  **A:** Demostrando que el efecto se produce incluso sin la causa alegada, o que una tercera variable oculta es la verdadera causa del fenómeno.
- **Q: ¿Qué ocurre cuando niegas mentalmente el supuesto de un texto argumentativo?**  
  **A:** La tesis y el argumento central del autor colapsan inmediatamente, demostrando que dependían de dicha premisa oculta.
- **Q: Si dos personas discuten sobre si la pena de muerte disuade a los asesinos, ¿cuál es su punto de discrepancia?**  
  **A:** La eficacia disuasoria de la pena de muerte frente al delito de homicidio calificado.
- **Q: ¿Por qué aportar un simple ejemplo aislado no basta para reforzar un argumento general?**  
  **A:** Porque un caso particular puede ser una anécdota fortuita; reforzar exige datos sistemáticos o validación de la garantía causal.

---



### 3.3 El Punto de Discrepancia en Textos Dialécticos
Cuando el examen presenta un texto con dos interlocutores en debate (Diálogo A vs. Diálogo B):
- **Discrepancia Central:** Aquello en lo que A y B se oponen diametralmente.
- **Puntos de Coincidencia (Trampa frecuente):** Datos o hechos de la realidad que ambos aceptan pero interpretan de forma divergente.
- *Ejemplo:* Si A dice: *"Debemos prohibir las corridas de toros por ser un acto cruel"*, y B responde: *"No debemos prohibirlas porque son una tradición cultural milenaria"*:
  - Punto de coincidencia: Ambos aceptan que las corridas de toros existen y forman parte de una tradición viva.
  - Punto de discrepancia: **Si la crueldad animal debe ser motivo suficiente para prohibir legalmente las corridas de toros**.

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "La Mesa de Tres Patas"
- El **tablero** superior es la **TESIS** (lo que se quiere mantener en pie).
- Las **patas** son los **ARGUMENTOS** (lo que sostiene al tablero).
- Si en una pregunta de examen te piden debilitar el argumento: **¡NO cortes el tablero, serrucha una de las patas!** Quien ataca los fundamentos empíricos derriba el texto completo.

### Mnemotecnia 2: "El Duelo de Vaqueros" (Discrepancia)
- Identifica el arma de Vaquero 1 (Tesis 1).
- Identifica el arma de Vaquero 2 (Tesis 2).
- El punto de choque donde se cruzan las balas es la **Discrepancia**. Si hablan de temas paralelos que no se tocan, todavía no has encontrado el núcleo del conflicto.

---

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: La Pregunta de Oro: "¿Y QUÉ?" (Prueba de Inatingencia)
Cuando te presenten una alternativa en una pregunta de debilitar/reforzar:
- Aplica la prueba del "¿Y qué?":
  - Si la alternativa dice algo verdadero pero que no afecta directamente a la tesis del autor, pregúntate: *¿Y qué tiene que ver eso con su argumento central?*
  - Si la respuesta es "nada relevante", es un **distractor fuera de foco**. Táchala de inmediato.

### Hack 2: La Prueba de la Negación para Encontrar el Supuesto
Para hallar el **supuesto de un argumento**:
1. Toma la alternativa que crees que es el supuesto.
2. Niégala categóricamente en tu mente (ponle un "NO").
3. Si al negarla el argumento del autor se vuelve completamente absurdo e inviable, **¡esa alternativa es el supuesto obligatorio!**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t05_s02_c01",
                    question = "En las preguntas de lectura crítica y estándar DECO, la tarea de 'Debilitar' un argumento consiste en:",
                    options = listOf(
                        "Corregir los errores ortográficos de las oraciones del texto.",
                        "Resumir el texto reduciendo el número total de palabras a la mitad.",
                        "Identificar la proposición o información que, de ser cierta, socava, resta credibilidad o anula la fuerza lógica probatoria de la tesis del autor.",
                        "Demostrar que el autor del texto es una persona de avanzada edad.",
                    ),
                    correctIndex = 2,
                    explanation = "Debilitar implica encontrar un enunciado que ataque las premisas, plantee explicaciones alternativas convincentes o rompa el nexo causal entre el argumento y la tesis."
                ),
                Challenge(
                    id = "rv_t05_s02_c02",
                    question = "Por el contrario, la tarea de 'Reforzar' un argumento consiste en:",
                    options = listOf(
                        "Aumentar el tamaño de la letra del texto para facilitar su lectura.",
                        "Repetir textualmente las mismas oraciones del texto en mayúsculas.",
                        "Aportar nueva evidencia fáctica, confirmar supuestos esenciales o neutralizar objeciones críticas, incrementando la solidez y probabilidad de la tesis.",
                        "Obligar a los lectores a memorizar los argumentos bajo juramento.",
                    ),
                    correctIndex = 2,
                    explanation = "Reforzar una argumentación significa incorporar datos congruentes, estudios científicos o corroboraciones empíricas que consoliden el puente lógico entre argumentos y conclusión."
                ),
                Challenge(
                    id = "rv_t05_s02_c03",
                    question = "Considere el siguiente argumento: 'La implementación de cámaras de videovigilancia en el distrito redujo la delincuencia en un 40 % durante el último año; por lo tanto, instalar más cámaras erradicará el crimen en la ciudad'. ¿Cuál de las siguientes afirmaciones DEBILITARÍA más seriamente este razonamiento?",
                    options = listOf(
                        "El costo de las cámaras de seguridad ha subido un 5 % en el mercado internacional.",
                        "Durante el mismo año se triplicó el patrullaje policial en el distrito y la delincuencia solo se desplazó a los distritos vecinos desprovistos de vigilancia.",
                        "Los vecinos del distrito afirmaron sentirse más seguros al salir a caminar de noche.",
                        "Algunas cámaras de videovigilancia graban en alta definición a color.",
                    ),
                    correctIndex = 1,
                    explanation = "Si el patrullaje se triplicó y el crimen solo se desplazó de zona, la reducción no se debió a las cámaras (causa alternativa) y el crimen no se erradicará (efecto globo), demoliendo el nexo causal de la tesis."
                ),
                Challenge(
                    id = "rv_t05_s02_c04",
                    question = "Frente a la tesis: 'El consumo regular de arándanos previene el envejecimiento prematuro celular debido a su alta concentración de antioxidantes', ¿qué enunciado REFORZARÍA con mayor contundencia la afirmación?",
                    options = listOf(
                        "El precio del kilogramo de arándanos es accesible en los mercados mayoristas.",
                        "Muchos agricultores peruanos cultivan arándanos en los valles costeros para exportación.",
                        "Existen postres tradicionales que utilizan mermelada de arándanos como endulzante.",
                        "Ensayos clínicos controlados a doble ciego demostraron que los polifenoles del arándano neutralizan eficazmente los radicales libres y retardan el estrés oxidativo tisular en humanos.",
                    ),
                    correctIndex = 3,
                    explanation = "Aportar ensayos clínicos rigurosos que confirman el mecanismo biológico específico (neutralización de radicales libres) otorga respaldo científico directo a la tesis médica."
                ),
                Challenge(
                    id = "rv_t05_s02_c05",
                    question = "Para debilitar una hipótesis que postula una relación de causa-efecto (A causó B), una de las estrategias lógicas más eficaces es:",
                    options = listOf(
                        "Elogiar el talento literario del autor de la hipótesis.",
                        "Afirmar que A y B se escriben con la misma letra inicial.",
                        "Demostrar que la hipótesis fue redactada en idioma extranjero.",
                        "Demostrar que un tercer factor C es la verdadera causa simultánea tanto de A como de B (correlación espuria).",
                    ),
                    correctIndex = 3,
                    explanation = "Evidenciar una causa común subyacente (C) demuestra que la correlación observada entre A y B era espuria y no una relación causal directa, desvirtuando el argumento."
                ),
                Challenge(
                    id = "rv_t05_s02_c06",
                    question = "Considere la afirmación: 'Todos los estudiantes que asistieron a las asesorías sabatinas aprobaron el examen final; en consecuencia, las asesorías garantizan el éxito académico'. ¿Qué dato debilita este razonamiento?",
                    options = listOf(
                        "A las asesorías sabatinas solo asistieron los estudiantes con las notas más altas y hábitos de estudio disciplinados desde el inicio del ciclo.",
                        "Las asesorías sabatinas se impartieron en aulas con buena iluminación.",
                        "Los exámenes fueron corregidos por dos docentes distintos.",
                        "El profesor de asesoría tiene diez años de experiencia pedagógica.",
                    ),
                    correctIndex = 0,
                    explanation = "Se produce un sesgo de selección: quienes asistieron ya eran de por sí los estudiantes más destacados y aplicados, por lo que el éxito no puede atribuirse exclusivamente a las asesorías."
                ),
                Challenge(
                    id = "rv_t05_s02_c07",
                    question = "¿Qué afirmación debilitaría de modo categórico la propuesta de un alcalde de 'eliminar los semáforos peatonales para agilizar el tránsito vehicular en las avenidas principales'?",
                    options = listOf(
                        "En algunas ciudades del mundo se utilizan semáforos solares.",
                        "Los semáforos consumen electricidad suministrada por la red pública.",
                        "La pintura de los pasos de cebra se desgasta con el paso de los meses.",
                        "Estudios viales demuestran que la supresión de semáforos peatonales incrementa los atropellos fatales en un 70 % y colapsa los cruces por invasión caótica de peatones.",
                    ),
                    correctIndex = 3,
                    explanation = "Demuestra que la medida no solo produce una tragedia humanitaria severa, sino que genera el efecto contraproducente exacto al pretendido (colapso vial caótico)."
                ),
                Challenge(
                    id = "rv_t05_s02_c08",
                    question = "Al evaluar la solidez de una generalización inductiva ('todos los cisnes son blancos'), el hallazgo de un único contraejemplo comprobado (un cisne negro vivo) produce lógicamente:",
                    options = listOf(
                        "Un problema puramente gramatical sin relevancia epistémica.",
                        "La refutación y demolición definitiva de la validez universal de la generalización.",
                        "La duplicación de la certeza matemática de la inducción.",
                        "El reforzamiento de la regla general como excepción confirmatoria.",
                    ),
                    correctIndex = 1,
                    explanation = "Por regla de asimetría lógica, un solo contraejemplo empírico genuino basta para falsar y anular una proposición universal categórica."
                ),
                Challenge(
                    id = "rv_t05_s02_c09",
                    question = "Frente al argumento: 'La educación virtual es superior a la presencial porque ahorra tiempos de transporte a los alumnos', ¿cuál es el argumento que lo debilita más integralmente?",
                    options = listOf(
                        "Algunos estudiantes prefieren usar audífonos para escuchar las clases.",
                        "El ahorro de tiempo no compensa el deterioro en la socialización formativa, el incremento del sedentarismo y la pérdida de interacción pedagógica directa demostradas en el rendimiento final.",
                        "Las computadoras portátiles requieren cargarse con energía eléctrica.",
                        "El transporte público en las ciudades grandes suele ser congestionado.",
                    ),
                    correctIndex = 1,
                    explanation = "Pone en evidencia que un beneficio colateral mínimo (ahorro de transporte) no compensa los perjuicios sustanciales y multidimensionales en el aprendizaje y desarrollo humano."
                ),
                Challenge(
                    id = "rv_t05_s02_c10",
                    question = "En las pruebas DECO, cuando se pide identificar qué alternativa 'no debilita ni refuerza' el texto, se debe buscar una opción que:",
                    options = listOf(
                        "Sea falsa en la realidad fáctica.",
                        "Esté escrita en un registro literario arcaico.",
                        "Contenga información irrelevante, neutra o no vinculada con la línea causal de la controversia del texto.",
                        "Tenga el doble de renglones que el texto original.",
                    ),
                    correctIndex = 2,
                    explanation = "Un enunciado es neutro cuando, siendo verdadero o plausible, aborda aspectos colaterales que no alteran la probabilidad lógica de la tesis central debatida."
                ),
            )
        )
    )
}
