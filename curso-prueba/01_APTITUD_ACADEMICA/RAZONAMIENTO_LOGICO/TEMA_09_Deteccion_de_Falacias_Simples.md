# TEMA IX: Detección de Falacias Simples

---

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

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Falacias de Atingencia Prioritarias en el Temario UNSA

#### A. Generalización Indebida (*Secundum Quid* / Muestra Insuficiente)
- **Mecanismo:** Se infiere una conclusión universal o atributiva sobre toda una población a partir del análisis de un número minúsculo, no representativo o sesgado de casos particulares.
- **Estructura lógica defectuosa:**
  $$X_1 \in A \land X_1 \text{ es } B, \quad X_2 \in A \land X_2 \text{ es } B \implies \forall x (x \in A \to x \text{ es } B)$$
- *Ejemplo típico:* "Ayer vi a dos conductores de transporte público cruzar la luz roja en la Av. Ejército. Por tanto, todos los choferes de transporte público de Arequipa son irresponsables".

#### B. Falsa Causa (*Non Causa Pro Causa* y *Post Hoc Ergo Propter Hoc*)
- **Mecanismo:** Consiste en atribuir a un fenómeno antecedente la condición de causa determinante de un fenómeno consecuente basándose únicamente en la coincidencia temporal de ambos.
- **Axioma científico violado:** *"Correlación no implica causalidad"* ($\text{Corr}(X, Y) \neq X \implies Y$).
- *Ejemplo típico:* "Desde que el nuevo presidente asumió el cargo, no ha llovido en la cuenca del Chili. Por lo tanto, el mandatario es el culpable de la sequía regional".

#### C. Falacia de Contradicción Interna (Inconsistencia Discursiva)
- **Mecanismo:** Un mismo emisor sostiene dos proposiciones que no pueden coexistir bajo el principio de no contradicción, anulando por completo la validez de su tesis principal.
- *Ejemplo:* "El Estado debe garantizar la libertad absoluta de todos los ciudadanos sin ninguna restricción, y al mismo tiempo prohibir y sancionar severamente todo contenido que ofenda la moral pública".

### 3.2 Falacias de Ambigüedad Lógica

#### A. El Equívoco (Ambigüedad Semántica / Cuatro Términos)
- **Mecanismo:** Se utiliza una palabra polisémica con dos o más acepciones distintas a lo largo de las premisas de un mismo silogismo.
- *Ejemplo clásico:*
  - Premisa 1: El fin de las cosas es su perfección.
  - Premisa 2: La muerte es el fin de la vida.
  - Conclusión: Por tanto, la muerte es la perfección de la vida.
  *(El término "fin" mutó de objetivo teleológico a terminación cronológica).*

#### B. La Anfibología (Ambigüedad Sintáctica)
- **Mecanismo:** El razonamiento descansa sobre enunciados cuya estructura gramatical deficiente o puntuación ambigua permite interpretaciones discordantes.
- *Ejemplo:* "Un perro mordió a un niño y la policía lo persiguió" *(¿A quién persiguió la policía: al perro o al niño?)*.

### 3.3 Falacias Tradicionales de Alta Frecuencia en Exámenes de Admisión

1. **Argumentum Ad Hominem (Ataque al Hombre):** Descalificar un argumento atacando los defectos morales, el origen social, la religión o el pasado del interlocutor en lugar de refutar sus premisas lógicas.
2. **Argumentum Ad Populum (Apelación a la Masa):** Sostener que una afirmación es verdadera únicamente porque la gran mayoría de personas cree en ella o la practica.
3. **Argumentum Ad Verecundiam (Apelación a la Falsa Autoridad):** Defender una tesis citando la opinión de una persona famosa o experta en un campo totalmente ajeno al tema debatido.
4. **Argumentum Ad Ignorantiam (Apelación a la Ignorancia):** Afirmar que algo es verdadero simplemente porque no se ha demostrado que sea falso (o viceversa).
5. **Argumentum Ad Baculum (Apelación a la Fuerza o Amenaza):** Imponer una conclusión recurriendo al miedo, la intimidación o la coacción física/laboral.

---

## 4. FORMULARIO MAESTRO DE DETECCIÓN DE FALACIAS

| Tipo de Falacia | Error Lógico Específico | Pregunta de Detección Inmediata |
| :--- | :--- | :--- |
| **Generalización Indebida** | Muestra no representativa ni estadísticamente significativa. | *¿Se analizó una muestra representativa o solo 2 o 3 casos anecdóticos?* |
| **Falsa Causa** | Confundir orden temporal con causalidad biológica o física. | *¿El suceso B ocurriría igualmente sin el suceso A? ¿Hay un tercer factor oculto?* |
| **Equívoco** | Cambio subrepticio del sentido de una palabra clave. | *¿La palabra X significa exactamente lo mismo en la Premisa 1 y en la Premisa 2?* |
| **Ad Hominem** | Sustituir el debate de ideas por el insulto personal. | *¿Se está rebatiendo el dato o se está descalificando al individuo?* |
| **Ad Populum** | Confundir popularidad de una idea con su verdad empírica. | *¿Que millones de personas lo crean hace que sea una ley científica comprobada?* |

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "Las 4 Falsas Alarmas" ($\text{G-C-C-A}$)
Para escanear textos argumentativos en el examen:
- **G**eneralización apresurada: *"Uno es así $\to$ Todos son así"*.
- **C**ausa ilusoria: *"Sucedió después $\to$ Sucedió a causa de eso"*.
- **C**ontradicción interna: *"Afirmo A en la línea 2 y niego A en la línea 6"*.
- **A**mbigüedad / Equívoco: *"La misma palabra cambia de disfraz léxico"*.

### Mnemotecnia 2: "El Escudo contra el Sofisma"
Frente a un texto manipulador, haz tres preguntas de filtro:
1. ¿Quién lo dice? $\to$ Si importa más que el argumento = Posible *Ad Hominem* o *Ad Verecundiam*.
2. ¿A cuántos convenció? $\to$ Si se usa como prueba = Posible *Ad Populum*.
3. ¿Cómo se probó? $\to$ Si no hay datos causales directos = Posible *Falsa Causa*.

---

## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: La Prueba de la Sustitución Léxica (Desactivar el Equívoco)
Si sospechas que un silogismo es falaz por equívoco:
1. Toma el término sospechoso (ejemplo: "banco").
2. Reemplázalo en cada premisa por su definición exacta:
   - "Me senté en el banco (asiento de madera)".
   - "Fui al banco a pedir un préstamo (institución financiera)".
3. Reescribe el silogismo con las definiciones explícitas: notarás de inmediato que hay **4 términos distintos** y que el puente deductivo está completamente roto.

### Hack 2: La Búsqueda de la Variable Confundente (Contra la Falsa Causa)
Cuando un enunciado sostenga que el factor $X$ causó $Y$:
- Pregúntate de inmediato: *¿Existe una tercera variable $Z$ que esté provocando tanto a $X$ como a $Y$?*
- *Ejemplo de examen:* "El aumento en el consumo de helados causa que aumente la tasa de ahogamientos en las piscinas".
  - Variable $Z$ oculta: El verano (las altas temperaturas aumentan el consumo de helados y simultáneamente hacen que más gente vaya a nadar). La causalidad directa es una falacia.

---

## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Ataque Pertinente NO es Ad Hominem**
> Si un testigo en un juicio por falsificación de documentos tiene tres condenas judiciales previas por perjurio y falsificación probada, señalar ese hecho para cuestionar su credibilidad testimonial **NO es una falacia Ad Hominem**, sino una objeción de pertinencia probatoria plenamente válida en la epistemología jurídica. Solo es falaz cuando el ataque personal es irrelevante para el fondo del argumento (ejemplo: descalificar la teoría de la relatividad de Einstein por su vestimenta o vida matrimonial).

> [!CAUTION]
> **Trampa 2: La Conclusión Verdadera en un Argumento Falaz**
> Que un argumento sea falaz **no significa automáticamente que su conclusión sea fácticamente falsa**. Solo significa que el camino argumentativo no la sostiene lógicamente. Afirmar que una conclusión es falsa simplemente porque fue defendida con una falacia es incurrir en la *Falacia de la Falacia* (*Argumentum ad logicam*).

---

## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la era de las redes sociales, los algoritmos de recomendación y las campañas electorales, las falacias de generalización indebida y falsa causa son el combustible de la desinformación masiva (*fake news*) y el terraplanismo. Del mismo modo, en el desarrollo de fármacos e investigaciones epidemiológicas (ensayos clínicos de vacunas), los científicos emplean grupos de control con doble ciego para evitar caer en la falacia *post hoc*: demostrar matemáticamente que la recuperación del paciente se debe al principio activo del medicamento y no al mero efecto placebo o al curso natural de la enfermedad.

---

## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS

### Ejercicio 1 (Nivel Básico: Identificación de Generalización Indebida)
**Enunciado:** Identifique la falacia presente en el siguiente texto:
*"El lunes pasado compré un teléfono móvil de la marca X y la batería se recalentó a las pocas horas. Mi prima también compró un dispositivo de la misma marca y se le apagó de repente. Es evidente que todos los productos de esa marca son de pésima calidad e inservibles."*
A) Falacia de apelación a la autoridad  
B) Generalización indebida (*Secundum quid*)  
C) Falacia de falsa causa  
D) Argumento Ad Ignorantiam  
E) Anfibología sintáctica  

**Resolución Paso a Paso:**
1. Analizamos la premisa y la conclusión:
   - Premisa: Dos teléfonos particulares de la marca X presentaron fallas mecánicas.
   - Conclusión: La totalidad universal de los productos elaborados por dicha marca carece de calidad.
2. La muestra observada consta de solo dos unidades frente a una producción masiva de miles o millones de terminales tecnológicos.
3. Se extrapola una propiedad observada en una muestra minúscula y no representativa hacia el universo completo de la población.
4. Esta estructura corresponde formalmente a la falacia de **Generalización Indebida**.
**Respuesta:** B

---

### Ejercicio 2 (Nivel Intermedio: Detección de Falsa Causa)
**Enunciado (Modelo UNSA Ordinario):** Lea atentamente el siguiente fragmento:
*"Los antiguos sacerdotes de una tribu tocaban ruidosamente los tambores cada vez que se producía un eclipse solar y, minutos después de iniciar el ritual, el Sol siempre volvía a brillar en el cielo. Por lo tanto, el toque de tambores es la causa directa del retorno de la luz solar."*
¿En qué error de razonamiento incurre el argumento anterior?
A) Falacia del equívoco  
B) Falacia de apelación a la masa (*Ad populum*)  
C) Falacia de falsa causa (*Post hoc ergo propter hoc*)  
D) Falacia de afirmación del consecuente  
E) Falacia de la pista falsa  

**Resolución Paso a Paso:**
1. Analizamos los hechos expuestos:
   - Evento A: Tocar los tambores durante el eclipse.
   - Evento B: Retorno de la luz solar.
2. Relación temporal: El evento B ocurre cronológicamente después del evento A.
3. El emisor infiere una relación causa-efecto exclusivamente a partir de la sucesión cronológica.
4. El eclipse culmina debido a la mecánica celeste orbital entre la Luna, la Tierra y el Sol, con absoluta independencia de las ondas sonoras generadas por los tambores terrestres.
5. Incurre de manera paradigmática en la falacia de **Falsa Causa** (*Post hoc ergo propter hoc*).
**Respuesta:** C

---

### Ejercicio 3 (Nivel Intermedio-Avanzado: Detección de Equívoco Semántico)
**Enunciado:** Analice el siguiente silogismo:
- Premisa 1: La justicia es una virtud moral cardinal del ser humano.
- Premisa 2: El tribunal de justicia condenó al acusado a diez años de prisión.
- Conclusión: Por tanto, una virtud moral cardinal condenó al reo a diez años de prisión.
El razonamiento precedente resulta inválido porque:
A) Contradice el principio de transitividad.  
B) Comete la falacia de negación del antecedente.  
C) Comete la falacia de ambigüedad denominada equívoco.  
D) Presenta un término medio universalmente distribuido.  
E) Incurre en apelación a la fuerza (*Ad baculum*).  

**Resolución Paso a Paso:**
1. Examinamos los términos que intervienen en el silogismo:
   - Término 1: "Justicia" en la Premisa 1 designa el concepto abstracto ético-filosófico de dar a cada quien lo que le corresponde.
   - Término 2: "Justicia" en la Premisa 2 designa a la institución burocrática del Poder Judicial (jueces y magistrados).
2. El término puente ("justicia") cambia de significado radicalmente entre la premisa 1 y la premisa 2.
3. Aparenta tener 3 términos cuando en realidad posee 4 términos conceptuales disjuntos.
4. Este desplazamiento de significado dentro de una misma cadena deductiva constituye la falacia de **Equívoco** (ambigüedad semántica).
**Respuesta:** C

---

### Ejercicio 4 (Nivel Avanzado DECO: Evaluación de Solidez Argumentativa)
**Enunciado (Tipo San Marcos DECO / UNSA):** En un debate sobre la reforma del transporte urbano en Arequipa, un expositor afirma:
*"No debemos implementar el carril exclusivo para autobuses ni escuchar las propuestas técnicas del ingeniero Gómez, porque es un profesional que hace cinco años fue despedido de una empresa constructora y su vida privada es un desastre moral."*
Al evaluar la solidez del argumento anterior, se concluye que:
A) Es un argumento sólido porque los antecedentes éticos de un expositor determinan la exactitud de sus cálculos matemáticos.  
B) Es débil e inválido, pues recurre a la falacia *Ad Hominem* ofensiva para eludir el análisis técnico de la propuesta de transporte.  
C) Es un razonamiento inductivo válido por analogía de comportamiento.  
D) Presenta una falacia de falsa analogía entre la vida privada y los autobuses.  
E) Es consistente mediante el uso del Modus Tollens.  

**Resolución Paso a Paso:**
1. Descomponemos el argumento:
   - Tesis a refutar: La viabilidad técnica del carril exclusivo para autobuses propuesta por el ingeniero Gómez.
   - Evidencia aportada: Su despido laboral pasado y su vida privada personal.
2. Evaluamos la pertinencia: Las dimensiones morales privadas o el historial contractual de un proyectista no invalidan *per se* la física del tráfico, el flujo vehicular ni la ingeniería del transporte.
3. El hablante desplaza el foco de discusión: en lugar de atacar la propuesta técnica, ataca a la persona que la formula con la intención de desacreditarla ante el público.
4. Esto constituye formalmente una falacia **Ad Hominem Ofensiva**, destruyendo la solidez lógica de la argumentación.
**Respuesta:** B

---

### Ejercicio 5 (Nivel 5: Boss Challenge - Detección Múltiple y Sofisma Cruzado)
**Enunciado (Nivel UNI / Máxima Exigencia):** Durante un congreso académico, se pronuncia el siguiente discurso:
*"La teoría de la relatividad especial afirma que todo movimiento es relativo al marco de referencia del observador. Por consiguiente, la moral y la verdad son enteramente relativas a cada individuo, de modo que no existen normas éticas objetivas. Y quien no acepte esto se opone al consenso de la ciencia moderna y debería ser destituido de la docencia universitaria."*
¿Qué combinación precisa de falacias se manifiesta correlativamente en el fragmento citado?
A) Falsa causa y Argumento Ad Populum  
B) Equívoco (extrapolación indebida de concepto físico a ético) y Argumento Ad Baculum  
C) Generalización indebida y Modus Ponens  
D) Argumento Ad Ignorantiam y Petitio Principii  
E) Anfibología y Afirmación del Consecuente  

**Resolución Paso a Paso:**
1. Analizamos la primera inferencia:
   - Premisa: La teoría física de Einstein demuestra la relatividad espaciotemporal de las mediciones inerciales.
   - Conclusión: La ética y la moral humana son relativas y no existen principios objetivos.
   - Análisis crítico: El término "relatividad" en física denota la invariancia de las leyes físicas en sistemas de referencia inerciales; extrapolar ese término al campo de los valores humanos y axiológicos es una manipulación léxica que constituye una falacia de **Equívoco** (o falsa analogía categorial profunda).
2. Analizamos la segunda inferencia / cláusula final:
   - *"Y quien no acepte esto [...] debería ser destituido de la docencia universitaria"*.
   - Análisis crítico: Se intenta forzar la aceptación de la conclusión mediante la amenaza explícita de pérdida de empleo y coacción laboral.
   - Esto corresponde formalmente al **Argumentum Ad Baculum** (apelación al miedo o a la fuerza).
3. La combinación exacta, rigurosa y correlativa es: Equívoco / extrapolación ilegítima seguida de apelación al miedo o la fuerza (*Ad Baculum*).
**Respuesta:** B

---

## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Falacia:** Argumento inválido o inconsistente que posee la apariencia persuasiva de ser correcto.
2. **Sofisma:** Argumento falaz elaborado conscientemente con dolo argumentativo para inducir a error.
3. **Paralogismo:** Razonamiento falaz emitido de forma involuntaria por descuido lógico del emisor.
4. **Generalización Indebida:** Extrapolación de propiedades a un conjunto total a partir de una muestra reducida o atípica.
5. **Falsa Causa (*Post Hoc*):** Inferencia errónea que toma como causa necesaria un antecedente puramente cronológico.
6. **Equívoco:** Falacia de ambigüedad en la que un vocablo se utiliza con múltiples sentidos dentro del mismo argumento.
7. **Anfibología:** Falacia de ambigüedad provocada por una construcción sintáctica defectuosa que admite dos interpretaciones.
8. **Argumentum Ad Hominem:** Ataque a la persona del oponente en lugar de rebatir sus pruebas racionales.
9. **Argumentum Ad Baculum:** Imposición de un punto de vista mediante la amenaza, el chantaje o la coerción.
10. **Solidez Argumentativa:** Propiedad de un argumento válido cuyas premisas son además fácticamente verdaderas.

---

## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué diferencia medular existe entre un sofisma y un paralogismo?**  
  **A:** El sofisma se realiza con la intención deliberada de engañar (dolo), mientras que el paralogismo ocurre por error o desconocimiento involuntario.
- **Q: ¿Por qué la correlación estadística entre dos variables no basta para probar causalidad?**  
  **A:** Porque puede deberse a una coincidencia temporal fortuita o a la acción de una tercera variable oculta (variable confundente).
- **Q: ¿En qué consiste la falacia de ambigüedad por equívoco?**  
  **A:** En emplear la misma palabra pero con dos significados conceptuales diferentes dentro de las premisas de un mismo razonamiento.
- **Q: ¿Qué principio del método científico se transgrede en la generalización indebida?**  
  **A:** El principio de representatividad estadística y tamaño suficiente de la muestra para inferencia inductiva.
- **Q: Si un argumento contiene una falacia, ¿su conclusión es obligatoriamente falsa?**  
  **A:** No necesariamente; la conclusión podría ser verdadera por casualidad, pero el argumento carece de validez lógica para demostrarla.

---

## 12. MOTOR DE GAMIFICACIÓN (JSON PARA KOTLIN MULTIPLATFORM)

```json
{
  "tema_id": "RL_09",
  "titulo": "Detección de Falacias Simples",
  "eje": "Aptitud Académica",
  "subcomponente": "Razonamiento Lógico",
  "dificultad": "Intermedio",
  "xp_recompensa": 140,
  "monedas_recompensa": 30,
  "preguntas": [
    {
      "id": "RL_09_Q1",
      "tipo": "single_choice",
      "enunciado": "Un candidato afirma: 'Mi rival propone reducir impuestos, pero no le crean porque él jamás ha administrado una empresa privada'. Esta intervención constituye una falacia de:",
      "opciones": [
        "Falsa causa",
        "Argumentum Ad Hominem",
        "Generalización indebida",
        "Anfibología",
        "Argumentum Ad Baculum"
      ],
      "respuesta_correcta": 1,
      "explicacion": "Se descalifica la propuesta atacando directamente la condición personal del emisor en lugar de evaluar el impacto macroeconómico de la medida tributaria.",
      "distractor_trampa": "Creer que es falsa causa por hablar de impuestos"
    },
    {
      "id": "RL_09_Q2",
      "tipo": "single_choice",
      "enunciado": "Afirmar que 'Millones de personas en todo el mundo creen en la astrología, por lo tanto los horóscopos tienen fundamento científico' corresponde a la falacia:",
      "opciones": [
        "Ad Populum",
        "Ad Verecundiam",
        "Secundum Quid",
        "Equívoco",
        "Ad Ignorantiam"
      ],
      "respuesta_correcta": 0,
      "explicacion": "La falacia Ad Populum apela erróneamente a la popularidad masiva o al consenso popular como si fuera prueba de validez científica.",
      "distractor_trampa": "Marcar ad verecundiam confundiendo a la masa con una autoridad"
    }
  ]
}
```
