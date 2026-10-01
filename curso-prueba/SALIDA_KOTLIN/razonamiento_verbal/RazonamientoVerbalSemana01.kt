package razonamiento_verbal

object RazonamientoVerbalSemana01 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t01_s01",
            subjectId = "razonamiento_verbal",
            semana = 1,
            subtema = "1.1",
            title = "3.1 La Sinonimia Contextual (Superación del Diccionario)",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Sinonimia Contextual:** Determinar el reemplazo léxico exacto de un término en función del campo semántico y el tono del discurso, superando la sinonimia de diccionario abstracto.
2. **Antonimia Contextual:** Identificar la palabra o locución que expresa la polaridad semántica opuesta requerida por el contexto oracional.
3. **Polisemia en Uso:** Discriminar los diferentes sememas actualizados de una misma unidad léxica según su entorno oracional.
4. **Adecuación y Precisión Semántica:** Seleccionar el vocablo más exacto y riguroso, erradicando los "verbos comodín" (*hacer, poner, tener, decir*) y vocablos vagos (*cosa, algo*).
5. **Detección de Ambigüedades Léxicas:** Identificar vacíos de significado provocados por homonimia no aclarada o doble sentido involuntario.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                          RELACIONES SEMÁNTICAS
                                    │
          ┌─────────────────────────┼─────────────────────────┐
          ▼                         ▼                         ▼
   IDENTIDAD / OPOSICIÓN       PLURALIDAD DE SENTIDO       JERARQUÍA Y PRECISIÓN
          │                         │                         │
    ┌─────┴─────┐             ┌─────┴─────┐             ┌─────┴─────┐
    ▼           ▼             ▼           ▼             ▼           ▼
Sinonimia    Antonimia     Polisemia   Homonimia    Hiperonimia/  Precisión
Contextual   Contextual    (Misma      (Etimologías  Hiponimia    Léxica
(Semejanza   (Oposición    raíz, semas  distintas:   (Género/     (Cero verbos
de semas)    incompat.)    comunes)    homófonos/    Especie)     comodín)
                                       homógrafos)
```



### Ontología del Signo Lingüístico (Saussure / Coseriu)
- **Significante:** Imagen acústica o representación gráfica de la palabra (ejemplo: `/k-á-s-a/`).
- **Significado:** Concepto o imagen mental abstracta conformada por un haz de rasgos distintivos mínimos llamados **semas**.
- **Semema:** Conjunto de semas constitutivos de un lexema.
- **Sema Denotativo:** Rasgo semántico objetivo, universal, estable y socializado (definición de la RAE).
- **Sema Connotativo:** Rasgo semántico subjetivo, figurado, contextual o valorativo (añadido cultural o emocional).
- **Campo Semántico:** Red de palabras de la misma categoría gramatical que comparten un sema genérico común (archisemema).

---



### 3.1 La Sinonimia Contextual (Superación del Diccionario)
En los exámenes de admisión de la UNSA y UNMSM, **la sinonimia absoluta no existe**; dos palabras casi nunca son intercambiables en el 100% de los contextos discursivos.
- **Sinonimia Parcial o Contextual:** Fenómeno por el cual dos términos comparten semas denotativos fundamentales únicamente en determinados contextos específicos:
  - *Contexto 1:* "El juez dictó una sentencia **severa**" \to Sinónimo contextual: **rigurosa / estricta**.
  - *Contexto 2:* "El paciente sufre una infección **severa**" \to Sinónimo contextual: **grave / aguda**.
  - *Contexto 3:* "El clima de la puna es **severo**" \to Sinónimo contextual: **inhóspito / crudo**.



### 3.2 La Antonimia Contextual y sus Clases
La antonimia no es un mero contraste mecánico; requiere compartir el mismo campo semántico pero ubicarse en extremos opuestos del rasgo dimensional:
1. **Antonimia Gradual:** Entre los dos polos existen términos intermedios:
   - *Gélido / Frío / Tibio / Cálido / Tórrido*.
2. **Antonimia Complementaria (Excluyente):** La afirmación de un término implica necesariamente la negación del otro; no hay término medio:
   - *Vivo / Muerto*, *Soltero / Casado*, *Legal / Ilegal*.
3. **Antonimia Recíproca (Inversa):** La existencia de un concepto exige la existencia simultánea del opuesto desde otra perspectiva:
   - *Comprar / Vender*, *Profesor / Alumno*, *Pagar / Cobrar*.



### 3.4 Precisión Léxica y Erradicación de Proformas
La **precisión léxica** evalúa la capacidad del estudiante para desterrar términos baúl o hiperónimos comodines, sustituyéndolos por verbos y sustantivos que posean el semema exacto de la acción:

| Expresión Vulgar o Comodín | Corrección con Precisión Léxica Universitaria | Justificación Semántica del Semema |
| :--- | :--- | :--- |
| *Hacer* una carta / un informe | **Redactar** una carta / un informe | Operación de poner por escrito pensamientos ordenados. |
| *Hacer* una estatua / escultura | **Esculpir** / **Cincelar** una escultura | Labrado de material sólido mediante cincel o molde. |
| *Tener* una enfermedad | **Padecer** / **Afligirse de** una enfermedad | Experiencia pasiva y dolorosa de un estado patológico. |
| *Poner* dinero en el banco | **Depositar** / **Consignar** fondos | Operación financiera reglada de custodia monetaria. |
| *Decir* un poema | **Recitar** / **Declamar** un poema | Emisión vocal modulada con arte e impostación poética. |
| La *cosa* que se descubrió | El **hallazgo** / El **vestigio** | Sustantivo exacto para restos arqueológicos o científicos. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "El Filtro C-C-T" (Para Sinonimia Contextual)
Antes de marcar tu clave en una pregunta de contexto:
- **C**ategoría Gramatical: Si la palabra base es adjetivo, su sinónimo DEBE ser adjetivo; si es sustantivo, sustantivo; si es verboide, verboide.
- **C**ampo Semántico: El término sustituto debe pertenecer a la misma disciplina o ámbito vivencial.
- **T**ono o Registro: Si el texto es científico o formal, no marques un término coloquial aunque signifique lo mismo.



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 1: Técnica de la "Sustitución en Blanco" (Cloze Test Mental)
Cuando te pidan el sinónimo o antónimo de una palabra subrayada:
1. Lee la oración tachando mentalmente la palabra subrayada y dejando un espacio vacío [ \quad ].
2. Piensa con tus propias palabras qué concepto natural encaja en ese hueco para que la idea conserve plenamente su sentido lógico.
3. Ahora ve a las 5 alternativas y busca cuál coincide con la idea que formulaste.
4. Este método neutraliza de golpe los distractores con palabras rebuscadas que solo buscan deslumbrarte.



### Hack 2: Rastreo del Rastro Semántico (Semántica Semiótica)
En oraciones con ambigüedad léxica:
- Busca en la oración las palabras "escolta" o "adjetivos satélites":
  - *"El ministro presentó su renuncia irrevocable ante el **despacho** presidencial"*.
  - Las palabras *ministro*, *renuncia* y *presidencial* fijan que *despacho* significa oficina de gobierno y no el acto comercial de enviar encomiendas.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la redacción de contratos jurídicos internacionales, leyes constitucionales y patentes biomédicas, una imprecisión semántica o un vocablo anfibológico puede derivar en litigios millonarios o anulación de tratados de libre comercio. De igual manera, en los modelos de lenguaje masivo (LLM) y la inteligencia artificial (IA), los algoritmos de *Word Sense Disambiguation* (Desambiguación del Sentido de las Palabras) utilizan el análisis de relaciones semánticas contextuales y redes neuronales de grafos de conocimiento para saber si la palabra inglesa *apple* hace referencia a la fruta o a la corporación de Cupertino.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Precisión Léxica con Verbos Comodín)
**Enunciado:** Elija la alternativa que sustituye con mayor precisión léxica a la palabra en mayúsculas:
*"El fiscal provincial logró PONER evidencias contundentes en el expediente judicial para acusar formalmente al exalcalde."*
A) Colocar  
B) Incrustar  
C) Consignar  
D) Meter  
E) Depositar  

**Resolución Paso a Paso:**
1. Analizamos el contexto oracional: Se trata de un procedimiento formal de derecho procesal penal en el ámbito de un expediente judicial.
2. Evaluamos las alternativas:
   - *Colocar* y *meter* son vocablos coloquiales e imprecisos.
   - *Incrustar* denota fijación física de un cuerpo sólido dentro de otro.
   - *Depositar* se orienta preferentemente a sumas de dinero o bienes muebles en custodia.
   - *Consignar* es el término jurídico técnico y semánticamente preciso definido por la RAE como: "Hacer constar por escrito en un documento, auto o expediente judicial una mención o dato determinado".
3. Por tanto, *consignar* otorga rigor universitario y adecuación contextual máxima.
**Respuesta:** C

---



### Ejercicio 2 (Nivel Intermedio: Sinonimia Contextual)
**Enunciado (Modelo Admisión UNSA):** En el siguiente fragmento:
*"A pesar de las severas advertencias de los vulcanólogos del IGP sobre el incremento de la actividad sísmica del volcán Misti, la población mostró una actitud displicente frente a las medidas de evacuación."*
El sinónimo contextual de **DISPLICENTE** es:
A) Rebelde  
B) Indolente  
C) Temerosa  
D) Beligerante  
E) Ingenua  

**Resolución Paso a Paso:**
1. Desarmamos el contexto: Hay una amenaza real documentada (volcán Misti), pero la gente no actúa con la seriedad debida ante las advertencias.
2. Definición semántica de *displicente*: Que denota falta de interés, desdén, desidia o apatía ante una situación.
3. Analizamos las opciones:
   - *Rebelde / Beligerante:* Implica oposición activa o confrontación armada/verbal (no apatía).
   - *Temerosa:* Indica miedo (lo contrario a ignorar la alerta).
   - *Ingenua:* Falta de malicia.
   - *Indolente:* Que no se conmueve, flojo o desidioso, que no presta atención al peligro.
4. El término *indolente* refleja con absoluta fidelidad los semas de desinterés y negligencia del contexto.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Antonimia Contextual en Contexto Filosófico)
**Enunciado:** Determine el antónimo contextual de la palabra subrayada en el siguiente enunciado:
*"El filósofo existencialista defendía una concepción **abigarrada** de la condición humana, en la cual coexistían impulsos contradictorios y una caótica multiplicidad de deseos."*
A) Simple  
B) Homogénea  
C) Luminosa  
D) Clara  
E) Reducida  

**Resolución Paso a Paso:**
1. Analizamos el semema de *abigarrado* en el texto: El autor aclara que significa "coexistencia de impulsos contradictorios y caótica multiplicidad".
2. Su significado contextual denota heterogeneidad desordenada, mezcolanza confusa de elementos de naturalezas diversas.
3. Para hallar el antónimo contextual, buscamos una condición donde no haya mezcla disímil ni multiplicidad caótica, sino unidad uniforme de una sola naturaleza.
4. Evaluamos:
   - *Simple:* Antónimo de complejo.
   - *Clara:* Antónimo de oscuro o confuso.
   - *Homogénea:* Propiedad de aquello cuyos elementos son todos de la misma naturaleza o condición, presentando estructura uniforme.
5. El antónimo contextual más riguroso y exacto de una mezcla abigarrada y múltiple es una composición **homogénea**.
**Respuesta:** B

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Ambigüedad Estructural y Ambigüedad Léxica)
**Enunciado (Nivel UNI / Excelencia Lingüística):** En el siguiente texto:
*"El decano de la facultad observó el cuadro de la profesora en la sala de juntas."*
Se produce una anfibología clásica que genera al menos tres interpretaciones lógicas distintas. ¿Cuáles son esas tres lecturas posibles del enunciado?
A) 1. El cuadro pertenece a la profesora; 2. El cuadro retrata a la profesora; 3. El cuadro fue pintado por la profesora.  
B) 1. La profesora está enferma; 2. El cuadro es una pintura; 3. La profesora es médica.  
C) 1. El decano es profesor; 2. La profesora es decana; 3. La junta es docente.  
D) 1. El cuadro es de madera; 2. El cuadro es una tabla de notas; 3. El decano renunció.  
E) 1. La sala es de juntas; 2. La junta se reunió; 3. No hay decano.  

**Resolución Paso a Paso:**
1. Analizamos la estructura sintáctica y léxica:
   - La frase nominal *"el cuadro de la profesora"* presenta el modificador indirecto encabezado por la preposición "de", la cual tiene múltiples valores semánticos en español:
     - **Valor de pertenencia o posesión:** El cuadro es propiedad material de la profesora (ella lo compró o lo tiene).
     - **Valor de paciente / representación temática:** El cuadro contiene el retrato o figura de la profesora (la profesora es la persona pintada en el lienzo).
     - **Valor de agente / autoría:** El cuadro es una obra artística producida y pintada por la profesora (ella es la pintora).
2. Adicionalmente, el circunstancial de lugar *"en la sala de juntas"* puede modificar tanto al verbo *observó* (el decano estaba en la sala cuando lo vio) como al sustantivo *profesora* (la profesora estaba en la sala).
3. De entre las alternativas formuladas, la opción A desglosa de manera perfecta y rigurosa la triple ambigüedad semántico-sintáctica del sintagma "el cuadro de la profesora".
**Respuesta:** A

---



## 4. FORMULARIO MAESTRO Y MATRIZ DE RELACIONES SEMÁNTICAS

| Relación Semántica | Fórmula de Componentes | Criterio de Resolución en Examen |
| :--- | :--- | :--- |
| **Sinonimia Contextual** | S_1 \approx S_2 \iff \text{Semas}(S_1) \cap \text{Contexto} = \text{Semas}(S_2) | Verificar que conserve la categoría gramatical y el registro formal. |
| **Antonimia Contextual** | A_1 \leftrightarrow \neg A_2 \iff \text{Eje Semántico Idéntico} \land \text{Polaridad Inversa} | Detectar si la oposición es absoluta o gradual según la oración. |
| **Hiperonimia** | H_{iper} \supset H_{ipo} | El hiperónimo nombra al género o clase mayor (*Cánido \supset Perro*). |
| **Hiponimia** | H_{ipo} \subset H_{iper} | El hipónimo nombra a la especie o elemento particular (*Loro \subset Ave*). |
| **Cohiponimia** | H_{ipo1} \sim H_{ipo2} \subset H_{iper} | Dos elementos hermanos que comparten el mismo género (*León y Tigre*). |
| **Holonimia / Meronimia** | \text{Holo} \supset \text{Mero} (Todo/Parte) | El merónimo es una parte física constitutiva (*Rueda \subset Bicicleta*). |

---



### Ejercicio 4 (Nivel Avanzado DECO: Polisemia vs. Homonimia y Discriminación Semántica)
**Enunciado (Tipo San Marcos DECO / UNSA):** Analice los siguientes enunciados:
I. *"El campesino afiló la **hoz** antes de iniciar la cosecha de trigo."*
II. *"El caudaloso río atravesó una profunda **hoz** en la cordillera andina."*
III. *"La cantante de ópera deslumbró con una **voz** potente y melodiosa."*
Respecto a las palabras en negrita de los enunciados I y II, es correcto afirmar que:
A) Son palabras polisémicas, pues ambas se refieren a objetos de corte.  
B) Son homógrafas puras con etimologías completamente disjuntas.  
C) Son términos cohipónimos de la categoría accidentes geográficos.  
D) Son parónimas respecto a la palabra del enunciado III.  
E) Constituyen un caso de antonimia complementaria.  

**Resolución Paso a Paso:**
1. Analizamos el vocablo del enunciado I:
   - *Hoz* (herramienta de labranza): Proviene del latín *falx, falcis* (instrumento curvo de hierro).
2. Analizamos el vocablo del enunciado II:
   - *Hoz* (accidente geográfico: garganta profunda o cañón estrecho producido por un río): Proviene del latín *fauces* (garganta, fauces).
3. Ambos términos coinciden de manera idéntica en su grafía y fonología (`/o-z/`), pero provienen de dos raíces etimológicas latinas totalmente distintas (*falx* vs. *fauces*) y no comparten semas comunes originales.
4. Por definición lingüística, se trata de un caso paradigmático de **homonimia homógrafa**.
5. Por lo tanto, la proposición correcta es que son **homógrafas puras con etimologías completamente disjuntas**.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Semema:** Conjunto estructurado de semas que configura el significado total de una palabra en un estado de lengua.
2. **Sema:** Unidad mínima de significado distintivo no divisible (átomo semántico).
3. **Sinonimia Contextual:** Equivalencia semántica que solo se activa y valida dentro de un determinado marco discursivo.
4. **Antonimia Excluyente:** Oposición binaria radical donde la afirmación de un término impone la negación categórica del otro.
5. **Polisemia:** Propiedad de un signo lingüístico de poseer múltiples acepciones emanadas de una raíz etimológica común.
6. **Homonimia:** Coincidencia fónica o gráfica accidental entre dos vocablos con orígenes históricos y significados totalmente ajenos.
7. **Homofonía:** Identidad acústica entre palabras que presentan grafías diferenciadas (*echo / hecho*).
8. **Homografía:** Identidad gráfica total entre palabras de significado y etimología distinta (*vino* sustantivo / *vino* verbo).
9. **Hiperónimo:** Término genérico cuyo campo semántico engloba a otros términos más específicos (hipónimos).
10. **Catacresis:** Metáfora incorporada al léxico común para designar una realidad que carece de nombre propio (*pie de lámpara*, *ojo de aguja*).

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Por qué en un examen de admisión nunca debes buscar la sinonimia en un diccionario aislado?**  
  **A:** Porque las palabras se resignifican en el texto; el contexto determina qué semas específicos se activan y cuáles se suprimen.
- **Q: ¿Cómo se demuestra formalmente que dos palabras son homógrafas y no polisémicas?**  
  **A:** Revisando su etimología: si provienen de raíces distintas y tienen entradas independientes en el diccionario de la RAE, son homónimas.
- **Q: ¿Qué relación semántica existe entre "cedro" y "caoba"?**  
  **A:** Son cohipónimos, pues ambos son especies que comparten el mismo hiperónimo ("árbol" o "madera").
- **Q: ¿Qué es una proforma o vocablo comodín?**  
  **A:** Una palabra de significado genérico y vago (*cosa, hacer, tener*) cuyo uso excesivo empobrece la precisión léxica.
- **Q: En la frase "comprar y vender", ¿qué tipo de antonimia se manifiesta?**  
  **A:** Antonimia recíproca o inversa, pues un polo no puede existir sin la concurrencia simultánea del otro.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Amigo Etimológico o Parónimo Traicionero**
> Distinguir rigurosamente vocablos de sonido o grafía semejante pero significado abismalmente dispar:
> - *Afecto* (cariño) vs. *Efecto* (consecuencia).
> - *Incipiente* (que recién empieza) vs. *Insipiente* (ignorante, falto de sabiduría).
> - *Aptitud* (capacidad o destreza) vs. *Actitud* (disposición de ánimo o postura).
> - *Flagrante* (evidente en el acto) vs. *Fragante* (oloroso, aromático).

> [!CAUTION]
> **Trampa 2: La Metáfora Fosilizada tomada como Homonimia**
> En preguntas de polisemia vs. homonimia, muchos postulantes marcan erróneamente que *pata de una mesa* y *pata de un perro* son homónimos. **¡FALSO!** Es un caso puro de **polisemia por catacresis** (metáfora estructural donde se extiende el nombre de la extremidad animal a un objeto inanimado por analogía de soporte).

---



### 3.3 Polisemia vs. Homonimia (Distinción Rigurosa)

| Criterio Distintivo | Polisemia | Homonimia |
| :--- | :--- | :--- |
| **Origen Etimológico** | **Único** (Una sola raíz histórica que se diversificó). | **Múltiple** (Dos raíces históricas distintas que convergieron fonéticamente por evolución casual). |
| **Vínculo Semántico** | Existe al menos un **sema común** (metáfora o metonimia). | **Cero relación semántica** (coincidencia formal pura). |
| **Entrada en Diccionario** | Una **única entrada** lexicográfica con múltiples acepciones numeradas (1, 2, 3\dots). | **Múltiples entradas** independientes señaladas con superíndice (banco^1, banco^2). |
| **Ejemplo** | *Pico* (de ave, de montaña, herramienta: forma puntiaguda). | *Vela* (vela^1: tela de barco, del latín *vela*; vela^2: cilindro de cera, del latín *vigilare*). |

#### Tipos de Homonimia
- **Homófonas:** Igual pronunciación, diferente escritura y significado (*tuvo* del verbo tener / *tubo* cilindro hueco).
- **Homógrafas:** Idéntica pronunciación y grafía, pero significado y etimología totalmente disjuntos (*lima* fruta cítrica / *lima* herramienta de acero).

---

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1 La Sinonimia Contextual (Superación del Diccionario)
En los exámenes de admisión de la UNSA y UNMSM, **la sinonimia absoluta no existe**; dos palabras casi nunca son intercambiables en el 100% de los contextos discursivos.
- **Sinonimia Parcial o Contextual:** Fenómeno por el cual dos términos comparten semas denotativos fundamentales únicamente en determinados contextos específicos:
  - *Contexto 1:* "El juez dictó una sentencia **severa**" \to Sinónimo contextual: **rigurosa / estricta**.
  - *Contexto 2:* "El paciente sufre una infección **severa**" \to Sinónimo contextual: **grave / aguda**.
  - *Contexto 3:* "El clima de la puna es **severo**" \to Sinónimo contextual: **inhóspito / crudo**.

### 3.2 La Antonimia Contextual y sus Clases
La antonimia no es un mero contraste mecánico; requiere compartir el mismo campo semántico pero ubicarse en extremos opuestos del rasgo dimensional:
1. **Antonimia Gradual:** Entre los dos polos existen términos intermedios:
   - *Gélido / Frío / Tibio / Cálido / Tórrido*.
2. **Antonimia Complementaria (Excluyente):** La afirmación de un término implica necesariamente la negación del otro; no hay término medio:
   - *Vivo / Muerto*, *Soltero / Casado*, *Legal / Ilegal*.
3. **Antonimia Recíproca (Inversa):** La existencia de un concepto exige la existencia simultánea del opuesto desde otra perspectiva:
   - *Comprar / Vender*, *Profesor / Alumno*, *Pagar / Cobrar*.

### 3.3 Polisemia vs. Homonimia (Distinción Rigurosa)

| Criterio Distintivo | Polisemia | Homonimia |
| :--- | :--- | :--- |
| **Origen Etimológico** | **Único** (Una sola raíz histórica que se diversificó). | **Múltiple** (Dos raíces históricas distintas que convergieron fonéticamente por evolución casual). |
| **Vínculo Semántico** | Existe al menos un **sema común** (metáfora o metonimia). | **Cero relación semántica** (coincidencia formal pura). |
| **Entrada en Diccionario** | Una **única entrada** lexicográfica con múltiples acepciones numeradas (1, 2, 3\dots). | **Múltiples entradas** independientes señaladas con superíndice (banco^1, banco^2). |
| **Ejemplo** | *Pico* (de ave, de montaña, herramienta: forma puntiaguda). | *Vela* (vela^1: tela de barco, del latín *vela*; vela^2: cilindro de cera, del latín *vigilare*). |

#### Tipos de Homonimia
- **Homófonas:** Igual pronunciación, diferente escritura y significado (*tuvo* del verbo tener / *tubo* cilindro hueco).
- **Homógrafas:** Idéntica pronunciación y grafía, pero significado y etimología totalmente disjuntos (*lima* fruta cítrica / *lima* herramienta de acero).

### 3.4 Precisión Léxica y Erradicación de Proformas
La **precisión léxica** evalúa la capacidad del estudiante para desterrar términos baúl o hiperónimos comodines, sustituyéndolos por verbos y sustantivos que posean el semema exacto de la acción:

| Expresión Vulgar o Comodín | Corrección con Precisión Léxica Universitaria | Justificación Semántica del Semema |
| :--- | :--- | :--- |
| *Hacer* una carta / un informe | **Redactar** una carta / un informe | Operación de poner por escrito pensamientos ordenados. |
| *Hacer* una estatua / escultura | **Esculpir** / **Cincelar** una escultura | Labrado de material sólido mediante cincel o molde. |
| *Tener* una enfermedad | **Padecer** / **Afligirse de** una enfermedad | Experiencia pasiva y dolorosa de un estado patológico. |
| *Poner* dinero en el banco | **Depositar** / **Consignar** fondos | Operación financiera reglada de custodia monetaria. |
| *Decir* un poema | **Recitar** / **Declamar** un poema | Emisión vocal modulada con arte e impostación poética. |
| La *cosa* que se descubrió | El **hallazgo** / El **vestigio** | Sustantivo exacto para restos arqueológicos o científicos. |

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Filtro C-C-T" (Para Sinonimia Contextual)
Antes de marcar tu clave en una pregunta de contexto:
- **C**ategoría Gramatical: Si la palabra base es adjetivo, su sinónimo DEBE ser adjetivo; si es sustantivo, sustantivo; si es verboide, verboide.
- **C**ampo Semántico: El término sustituto debe pertenecer a la misma disciplina o ámbito vivencial.
- **T**ono o Registro: Si el texto es científico o formal, no marques un término coloquial aunque signifique lo mismo.

### Mnemotecnia 2: "HI-PO va a la Especie, HI-PER abre el Universo"
- **HI-PO** (Pequeño, específico): Hipónimo = la especie (*Girasol*).
- **HI-PER** (Grande, amplio): Hiperónimo = el género abarcador (*Flor*).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t01_s01_c01",
                    question = "En el enfoque moderno de las pruebas de admisión (estándar DECO), la 'Sinonimia Contextual' se define formalmente como:",
                    options = listOf(
                        "La equivalencia semántica precisa que adquiere un término en función del sentido global del enunciado y la intención comunicativa del emisor.",
                        "La memorización estricta de la primera acepción que figura en el diccionario de la Real Academia.",
                        "La sustitución de un verbo en infinitivo por un adjetivo calificativo.",
                        "La búsqueda de dos palabras que compartan la misma etimología griega o latina.",
                    ),
                    correctIndex = 0,
                    explanation = "La sinonimia contextual trasciende el significado lexicográfico aislado: exige identificar el término que reemplaza con mayor exactitud y propiedad el sentido contextualizado del vocablo en el enunciado."
                ),
                Challenge(
                    id = "rv_t01_s01_c02",
                    question = "En el enunciado: 'El científico presentó una teoría bastante *audaz* para explicar el origen de la materia oscura', el sinónimo contextual más preciso del término resaltado es:",
                    options = listOf(
                        "Descarada.",
                        "Temeraria.",
                        "Insolente.",
                        "Novedosa.",
                    ),
                    correctIndex = 3,
                    explanation = "En un contexto científico y epistemológico, una hipótesis 'audaz' connota originalidad, vanguardia y osadía intelectual ('novedosa'), a diferencia de los matices peyorativos de 'insolente' o 'descarada'."
                ),
                Challenge(
                    id = "rv_t01_s01_c03",
                    question = "En la oración: 'El testimonio del testigo ocular resultó *capital* para resolver el homicidio', ¿cuál es el sustituto contextual idóneo de la palabra subrayada?",
                    options = listOf(
                        "Primario.",
                        "Urbano.",
                        "Crucial.",
                        "Monetario.",
                    ),
                    correctIndex = 2,
                    explanation = "En este contexto judicial y probatorio, 'capital' opera como adjetivo que significa de máxima trascendencia, decisivo o 'crucial', alejándose de su significado financiero o geográfico."
                ),
                Challenge(
                    id = "rv_t01_s01_c04",
                    question = "Identifique el término que funciona como antónimo contextual de la palabra destacada: 'A pesar de las severas acusaciones en su contra, el funcionario se mostró *imperturbable* durante la sesión parlamentaria'.",
                    options = listOf(
                        "Sereno.",
                        "Inconmovible.",
                        "Solemne.",
                        "Angustiado.",
                    ),
                    correctIndex = 3,
                    explanation = "'Imperturbable' connota serenidad y frialdad de ánimo; por ende, su antónimo contextual exacto en una situación de confrontación es 'angustiado' o alterado emocionalmente."
                ),
                Challenge(
                    id = "rv_t01_s01_c05",
                    question = "En la frase: 'El diplomático logró *zanjar* las diferencias limítrofes entre ambos países tras tres días de negociaciones', el sinónimo contextual más riguroso es:",
                    options = listOf(
                        "Excavar.",
                        "Postergar.",
                        "Agravar.",
                        "Resolver.",
                    ),
                    correctIndex = 3,
                    explanation = "En el lenguaje político-diplomático, 'zanjar' una disputa significa dirimirla, solucionarla o 'resolverla' de forma concluyente."
                ),
                Challenge(
                    id = "rv_t01_s01_c06",
                    question = "En el enunciado: 'Las declaraciones del portavoz resultaron sumamente *ambiguas*, generando desconcierto en la opinión pública', el antónimo contextual es:",
                    options = listOf(
                        "Confusas.",
                        "Equívocas.",
                        "Dudosas.",
                        "Categóricas.",
                    ),
                    correctIndex = 3,
                    explanation = "Lo 'ambiguo' admite múltiples interpretaciones o incertidumbre; lo opuesto en el discurso público es una afirmación clara, indudable y 'categórica'."
                ),
                Challenge(
                    id = "rv_t01_s01_c07",
                    question = "En la expresión: 'El fiscal detectó una versión *espuria* del contrato de concesión minera', el término 'espurio' significa contextualmente:",
                    options = listOf(
                        "Legítimo.",
                        "Antiguo.",
                        "Extenso.",
                        "Adulterado.",
                    ),
                    correctIndex = 3,
                    explanation = "'Espurio' en el marco documental y jurídico alude a lo falso, fraudulento, apócrifo o 'adulterado'."
                ),
                Challenge(
                    id = "rv_t01_s01_c08",
                    question = "'El director felicitó al equipo por el *fructífero* debate académico sostenido'. ¿Qué opción reemplaza con mayor propiedad semántica al adjetivo resaltado?",
                    options = listOf(
                        "Agreste.",
                        "Provechoso.",
                        "Complicado.",
                        "Vegetal.",
                    ),
                    correctIndex = 1,
                    explanation = "En el plano intelectual, un debate 'fructífero' es aquel que produce resultados enriquecedores, provechosos o fecundos."
                ),
                Challenge(
                    id = "rv_t01_s01_c09",
                    question = "En el enunciado: 'Su postura ante la crisis fue calificada de *pusilánime* por la junta directiva', el antónimo contextual es:",
                    options = listOf(
                        "Denodada.",
                        "Temerosa.",
                        "Cobarde.",
                        "Indiferente.",
                    ),
                    correctIndex = 0,
                    explanation = "'Pusilánime' califica la falta de ánimo, timidez o cobardía moral; su antónimo contextual es 'denodada' (valiente, audaz y decidida)."
                ),
                Challenge(
                    id = "rv_t01_s01_c10",
                    question = "Al resolver un ejercicio de sinonimia contextual en una prueba tipo admisión, el factor metodológico determinante para elegir la respuesta correcta es:",
                    options = listOf(
                        "Elegir siempre la palabra más técnica o arcaica de las alternativas.",
                        "Contar el número de letras que coinciden entre las dos palabras.",
                        "Verificar la concordancia gramatical y la pertinencia del campo semántico dentro del contexto situacional del texto.",
                        "Escoger la opción que tenga el significado más general y abstracto posible.",
                    ),
                    correctIndex = 2,
                    explanation = "La resolución adecuada de la sinonimia contextual exige respetar la categoría gramatical (sustantivo por sustantivo, adjetivo por adjetivo) y la coherencia del tono y sentido situacional del enunciado."
                ),
            )
        ),
        LessonNode(
            id = "rv_t01_s02",
            subjectId = "razonamiento_verbal",
            semana = 1,
            subtema = "1.2",
            title = "3.3 Polisemia vs. Homonimia (Distinción Rigurosa)",
            theory = LessonTheory(
                content = """# TEMA I: Relaciones Semánticas Básicas

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                          RELACIONES SEMÁNTICAS
                                    │
          ┌─────────────────────────┼─────────────────────────┐
          ▼                         ▼                         ▼
   IDENTIDAD / OPOSICIÓN       PLURALIDAD DE SENTIDO       JERARQUÍA Y PRECISIÓN
          │                         │                         │
    ┌─────┴─────┐             ┌─────┴─────┐             ┌─────┴─────┐
    ▼           ▼             ▼           ▼             ▼           ▼
Sinonimia    Antonimia     Polisemia   Homonimia    Hiperonimia/  Precisión
Contextual   Contextual    (Misma      (Etimologías  Hiponimia    Léxica
(Semejanza   (Oposición    raíz, semas  distintas:   (Género/     (Cero verbos
de semas)    incompat.)    comunes)    homófonos/    Especie)     comodín)
                                       homógrafos)
```



### Ontología del Signo Lingüístico (Saussure / Coseriu)
- **Significante:** Imagen acústica o representación gráfica de la palabra (ejemplo: `/k-á-s-a/`).
- **Significado:** Concepto o imagen mental abstracta conformada por un haz de rasgos distintivos mínimos llamados **semas**.
- **Semema:** Conjunto de semas constitutivos de un lexema.
- **Sema Denotativo:** Rasgo semántico objetivo, universal, estable y socializado (definición de la RAE).
- **Sema Connotativo:** Rasgo semántico subjetivo, figurado, contextual o valorativo (añadido cultural o emocional).
- **Campo Semántico:** Red de palabras de la misma categoría gramatical que comparten un sema genérico común (archisemema).

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.2 La Antonimia Contextual y sus Clases
La antonimia no es un mero contraste mecánico; requiere compartir el mismo campo semántico pero ubicarse en extremos opuestos del rasgo dimensional:
1. **Antonimia Gradual:** Entre los dos polos existen términos intermedios:
   - *Gélido / Frío / Tibio / Cálido / Tórrido*.
2. **Antonimia Complementaria (Excluyente):** La afirmación de un término implica necesariamente la negación del otro; no hay término medio:
   - *Vivo / Muerto*, *Soltero / Casado*, *Legal / Ilegal*.
3. **Antonimia Recíproca (Inversa):** La existencia de un concepto exige la existencia simultánea del opuesto desde otra perspectiva:
   - *Comprar / Vender*, *Profesor / Alumno*, *Pagar / Cobrar*.



### 3.3 Polisemia vs. Homonimia (Distinción Rigurosa)

| Criterio Distintivo | Polisemia | Homonimia |
| :--- | :--- | :--- |
| **Origen Etimológico** | **Único** (Una sola raíz histórica que se diversificó). | **Múltiple** (Dos raíces históricas distintas que convergieron fonéticamente por evolución casual). |
| **Vínculo Semántico** | Existe al menos un **sema común** (metáfora o metonimia). | **Cero relación semántica** (coincidencia formal pura). |
| **Entrada en Diccionario** | Una **única entrada** lexicográfica con múltiples acepciones numeradas (1, 2, 3\dots). | **Múltiples entradas** independientes señaladas con superíndice (banco^1, banco^2). |
| **Ejemplo** | *Pico* (de ave, de montaña, herramienta: forma puntiaguda). | *Vela* (vela^1: tela de barco, del latín *vela*; vela^2: cilindro de cera, del latín *vigilare*). |

#### Tipos de Homonimia
- **Homófonas:** Igual pronunciación, diferente escritura y significado (*tuvo* del verbo tener / *tubo* cilindro hueco).
- **Homógrafas:** Idéntica pronunciación y grafía, pero significado y etimología totalmente disjuntos (*lima* fruta cítrica / *lima* herramienta de acero).



### 3.4 Precisión Léxica y Erradicación de Proformas
La **precisión léxica** evalúa la capacidad del estudiante para desterrar términos baúl o hiperónimos comodines, sustituyéndolos por verbos y sustantivos que posean el semema exacto de la acción:

| Expresión Vulgar o Comodín | Corrección con Precisión Léxica Universitaria | Justificación Semántica del Semema |
| :--- | :--- | :--- |
| *Hacer* una carta / un informe | **Redactar** una carta / un informe | Operación de poner por escrito pensamientos ordenados. |
| *Hacer* una estatua / escultura | **Esculpir** / **Cincelar** una escultura | Labrado de material sólido mediante cincel o molde. |
| *Tener* una enfermedad | **Padecer** / **Afligirse de** una enfermedad | Experiencia pasiva y dolorosa de un estado patológico. |
| *Poner* dinero en el banco | **Depositar** / **Consignar** fondos | Operación financiera reglada de custodia monetaria. |
| *Decir* un poema | **Recitar** / **Declamar** un poema | Emisión vocal modulada con arte e impostación poética. |
| La *cosa* que se descubrió | El **hallazgo** / El **vestigio** | Sustantivo exacto para restos arqueológicos o científicos. |

---



## 4. FORMULARIO MAESTRO Y MATRIZ DE RELACIONES SEMÁNTICAS

| Relación Semántica | Fórmula de Componentes | Criterio de Resolución en Examen |
| :--- | :--- | :--- |
| **Sinonimia Contextual** | S_1 \approx S_2 \iff \text{Semas}(S_1) \cap \text{Contexto} = \text{Semas}(S_2) | Verificar que conserve la categoría gramatical y el registro formal. |
| **Antonimia Contextual** | A_1 \leftrightarrow \neg A_2 \iff \text{Eje Semántico Idéntico} \land \text{Polaridad Inversa} | Detectar si la oposición es absoluta o gradual según la oración. |
| **Hiperonimia** | H_{iper} \supset H_{ipo} | El hiperónimo nombra al género o clase mayor (*Cánido \supset Perro*). |
| **Hiponimia** | H_{ipo} \subset H_{iper} | El hipónimo nombra a la especie o elemento particular (*Loro \subset Ave*). |
| **Cohiponimia** | H_{ipo1} \sim H_{ipo2} \subset H_{iper} | Dos elementos hermanos que comparten el mismo género (*León y Tigre*). |
| **Holonimia / Meronimia** | \text{Holo} \supset \text{Mero} (Todo/Parte) | El merónimo es una parte física constitutiva (*Rueda \subset Bicicleta*). |

---



### Mnemotecnia 2: "HI-PO va a la Especie, HI-PER abre el Universo"
- **HI-PO** (Pequeño, específico): Hipónimo = la especie (*Girasol*).
- **HI-PER** (Grande, amplio): Hiperónimo = el género abarcador (*Flor*).

---



### Hack 2: Rastreo del Rastro Semántico (Semántica Semiótica)
En oraciones con ambigüedad léxica:
- Busca en la oración las palabras "escolta" o "adjetivos satélites":
  - *"El ministro presentó su renuncia irrevocable ante el **despacho** presidencial"*.
  - Las palabras *ministro*, *renuncia* y *presidencial* fijan que *despacho* significa oficina de gobierno y no el acto comercial de enviar encomiendas.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Falso Amigo Etimológico o Parónimo Traicionero**
> Distinguir rigurosamente vocablos de sonido o grafía semejante pero significado abismalmente dispar:
> - *Afecto* (cariño) vs. *Efecto* (consecuencia).
> - *Incipiente* (que recién empieza) vs. *Insipiente* (ignorante, falto de sabiduría).
> - *Aptitud* (capacidad o destreza) vs. *Actitud* (disposición de ánimo o postura).
> - *Flagrante* (evidente en el acto) vs. *Fragante* (oloroso, aromático).

> [!CAUTION]
> **Trampa 2: La Metáfora Fosilizada tomada como Homonimia**
> En preguntas de polisemia vs. homonimia, muchos postulantes marcan erróneamente que *pata de una mesa* y *pata de un perro* son homónimos. **¡FALSO!** Es un caso puro de **polisemia por catacresis** (metáfora estructural donde se extiende el nombre de la extremidad animal a un objeto inanimado por analogía de soporte).

---



### Ejercicio 4 (Nivel Avanzado DECO: Polisemia vs. Homonimia y Discriminación Semántica)
**Enunciado (Tipo San Marcos DECO / UNSA):** Analice los siguientes enunciados:
I. *"El campesino afiló la **hoz** antes de iniciar la cosecha de trigo."*
II. *"El caudaloso río atravesó una profunda **hoz** en la cordillera andina."*
III. *"La cantante de ópera deslumbró con una **voz** potente y melodiosa."*
Respecto a las palabras en negrita de los enunciados I y II, es correcto afirmar que:
A) Son palabras polisémicas, pues ambas se refieren a objetos de corte.  
B) Son homógrafas puras con etimologías completamente disjuntas.  
C) Son términos cohipónimos de la categoría accidentes geográficos.  
D) Son parónimas respecto a la palabra del enunciado III.  
E) Constituyen un caso de antonimia complementaria.  

**Resolución Paso a Paso:**
1. Analizamos el vocablo del enunciado I:
   - *Hoz* (herramienta de labranza): Proviene del latín *falx, falcis* (instrumento curvo de hierro).
2. Analizamos el vocablo del enunciado II:
   - *Hoz* (accidente geográfico: garganta profunda o cañón estrecho producido por un río): Proviene del latín *fauces* (garganta, fauces).
3. Ambos términos coinciden de manera idéntica en su grafía y fonología (`/o-z/`), pero provienen de dos raíces etimológicas latinas totalmente distintas (*falx* vs. *fauces*) y no comparten semas comunes originales.
4. Por definición lingüística, se trata de un caso paradigmático de **homonimia homógrafa**.
5. Por lo tanto, la proposición correcta es que son **homógrafas puras con etimologías completamente disjuntas**.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Semema:** Conjunto estructurado de semas que configura el significado total de una palabra en un estado de lengua.
2. **Sema:** Unidad mínima de significado distintivo no divisible (átomo semántico).
3. **Sinonimia Contextual:** Equivalencia semántica que solo se activa y valida dentro de un determinado marco discursivo.
4. **Antonimia Excluyente:** Oposición binaria radical donde la afirmación de un término impone la negación categórica del otro.
5. **Polisemia:** Propiedad de un signo lingüístico de poseer múltiples acepciones emanadas de una raíz etimológica común.
6. **Homonimia:** Coincidencia fónica o gráfica accidental entre dos vocablos con orígenes históricos y significados totalmente ajenos.
7. **Homofonía:** Identidad acústica entre palabras que presentan grafías diferenciadas (*echo / hecho*).
8. **Homografía:** Identidad gráfica total entre palabras de significado y etimología distinta (*vino* sustantivo / *vino* verbo).
9. **Hiperónimo:** Término genérico cuyo campo semántico engloba a otros términos más específicos (hipónimos).
10. **Catacresis:** Metáfora incorporada al léxico común para designar una realidad que carece de nombre propio (*pie de lámpara*, *ojo de aguja*).

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Por qué en un examen de admisión nunca debes buscar la sinonimia en un diccionario aislado?**  
  **A:** Porque las palabras se resignifican en el texto; el contexto determina qué semas específicos se activan y cuáles se suprimen.
- **Q: ¿Cómo se demuestra formalmente que dos palabras son homógrafas y no polisémicas?**  
  **A:** Revisando su etimología: si provienen de raíces distintas y tienen entradas independientes en el diccionario de la RAE, son homónimas.
- **Q: ¿Qué relación semántica existe entre "cedro" y "caoba"?**  
  **A:** Son cohipónimos, pues ambos son especies que comparten el mismo hiperónimo ("árbol" o "madera").
- **Q: ¿Qué es una proforma o vocablo comodín?**  
  **A:** Una palabra de significado genérico y vago (*cosa, hacer, tener*) cuyo uso excesivo empobrece la precisión léxica.
- **Q: En la frase "comprar y vender", ¿qué tipo de antonimia se manifiesta?**  
  **A:** Antonimia recíproca o inversa, pues un polo no puede existir sin la concurrencia simultánea del otro.

---



### Matriz de Indicadores de Logro Evaluados
1. **Sinonimia Contextual:** Determinar el reemplazo léxico exacto de un término en función del campo semántico y el tono del discurso, superando la sinonimia de diccionario abstracto.
2. **Antonimia Contextual:** Identificar la palabra o locución que expresa la polaridad semántica opuesta requerida por el contexto oracional.
3. **Polisemia en Uso:** Discriminar los diferentes sememas actualizados de una misma unidad léxica según su entorno oracional.
4. **Adecuación y Precisión Semántica:** Seleccionar el vocablo más exacto y riguroso, erradicando los "verbos comodín" (*hacer, poner, tener, decir*) y vocablos vagos (*cosa, algo*).
5. **Detección de Ambigüedades Léxicas:** Identificar vacíos de significado provocados por homonimia no aclarada o doble sentido involuntario.

---



### 3.1 La Sinonimia Contextual (Superación del Diccionario)
En los exámenes de admisión de la UNSA y UNMSM, **la sinonimia absoluta no existe**; dos palabras casi nunca son intercambiables en el 100% de los contextos discursivos.
- **Sinonimia Parcial o Contextual:** Fenómeno por el cual dos términos comparten semas denotativos fundamentales únicamente en determinados contextos específicos:
  - *Contexto 1:* "El juez dictó una sentencia **severa**" \to Sinónimo contextual: **rigurosa / estricta**.
  - *Contexto 2:* "El paciente sufre una infección **severa**" \to Sinónimo contextual: **grave / aguda**.
  - *Contexto 3:* "El clima de la puna es **severo**" \to Sinónimo contextual: **inhóspito / crudo**.



### Mnemotecnia 1: "El Filtro C-C-T" (Para Sinonimia Contextual)
Antes de marcar tu clave en una pregunta de contexto:
- **C**ategoría Gramatical: Si la palabra base es adjetivo, su sinónimo DEBE ser adjetivo; si es sustantivo, sustantivo; si es verboide, verboide.
- **C**ampo Semántico: El término sustituto debe pertenecer a la misma disciplina o ámbito vivencial.
- **T**ono o Registro: Si el texto es científico o formal, no marques un término coloquial aunque signifique lo mismo.



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la redacción de contratos jurídicos internacionales, leyes constitucionales y patentes biomédicas, una imprecisión semántica o un vocablo anfibológico puede derivar en litigios millonarios o anulación de tratados de libre comercio. De igual manera, en los modelos de lenguaje masivo (LLM) y la inteligencia artificial (IA), los algoritmos de *Word Sense Disambiguation* (Desambiguación del Sentido de las Palabras) utilizan el análisis de relaciones semánticas contextuales y redes neuronales de grafos de conocimiento para saber si la palabra inglesa *apple* hace referencia a la fruta o a la corporación de Cupertino.

---



### Ejercicio 1 (Nivel Básico: Precisión Léxica con Verbos Comodín)
**Enunciado:** Elija la alternativa que sustituye con mayor precisión léxica a la palabra en mayúsculas:
*"El fiscal provincial logró PONER evidencias contundentes en el expediente judicial para acusar formalmente al exalcalde."*
A) Colocar  
B) Incrustar  
C) Consignar  
D) Meter  
E) Depositar  

**Resolución Paso a Paso:**
1. Analizamos el contexto oracional: Se trata de un procedimiento formal de derecho procesal penal en el ámbito de un expediente judicial.
2. Evaluamos las alternativas:
   - *Colocar* y *meter* son vocablos coloquiales e imprecisos.
   - *Incrustar* denota fijación física de un cuerpo sólido dentro de otro.
   - *Depositar* se orienta preferentemente a sumas de dinero o bienes muebles en custodia.
   - *Consignar* es el término jurídico técnico y semánticamente preciso definido por la RAE como: "Hacer constar por escrito en un documento, auto o expediente judicial una mención o dato determinado".
3. Por tanto, *consignar* otorga rigor universitario y adecuación contextual máxima.
**Respuesta:** C

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Ambigüedad Estructural y Ambigüedad Léxica)
**Enunciado (Nivel UNI / Excelencia Lingüística):** En el siguiente texto:
*"El decano de la facultad observó el cuadro de la profesora en la sala de juntas."*
Se produce una anfibología clásica que genera al menos tres interpretaciones lógicas distintas. ¿Cuáles son esas tres lecturas posibles del enunciado?
A) 1. El cuadro pertenece a la profesora; 2. El cuadro retrata a la profesora; 3. El cuadro fue pintado por la profesora.  
B) 1. La profesora está enferma; 2. El cuadro es una pintura; 3. La profesora es médica.  
C) 1. El decano es profesor; 2. La profesora es decana; 3. La junta es docente.  
D) 1. El cuadro es de madera; 2. El cuadro es una tabla de notas; 3. El decano renunció.  
E) 1. La sala es de juntas; 2. La junta se reunió; 3. No hay decano.  

**Resolución Paso a Paso:**
1. Analizamos la estructura sintáctica y léxica:
   - La frase nominal *"el cuadro de la profesora"* presenta el modificador indirecto encabezado por la preposición "de", la cual tiene múltiples valores semánticos en español:
     - **Valor de pertenencia o posesión:** El cuadro es propiedad material de la profesora (ella lo compró o lo tiene).
     - **Valor de paciente / representación temática:** El cuadro contiene el retrato o figura de la profesora (la profesora es la persona pintada en el lienzo).
     - **Valor de agente / autoría:** El cuadro es una obra artística producida y pintada por la profesora (ella es la pintora).
2. Adicionalmente, el circunstancial de lugar *"en la sala de juntas"* puede modificar tanto al verbo *observó* (el decano estaba en la sala cuando lo vio) como al sustantivo *profesora* (la profesora estaba en la sala).
3. De entre las alternativas formuladas, la opción A desglosa de manera perfecta y rigurosa la triple ambigüedad semántico-sintáctica del sintagma "el cuadro de la profesora".
**Respuesta:** A

---



### Ejercicio 2 (Nivel Intermedio: Sinonimia Contextual)
**Enunciado (Modelo Admisión UNSA):** En el siguiente fragmento:
*"A pesar de las severas advertencias de los vulcanólogos del IGP sobre el incremento de la actividad sísmica del volcán Misti, la población mostró una actitud displicente frente a las medidas de evacuación."*
El sinónimo contextual de **DISPLICENTE** es:
A) Rebelde  
B) Indolente  
C) Temerosa  
D) Beligerante  
E) Ingenua  

**Resolución Paso a Paso:**
1. Desarmamos el contexto: Hay una amenaza real documentada (volcán Misti), pero la gente no actúa con la seriedad debida ante las advertencias.
2. Definición semántica de *displicente*: Que denota falta de interés, desdén, desidia o apatía ante una situación.
3. Analizamos las opciones:
   - *Rebelde / Beligerante:* Implica oposición activa o confrontación armada/verbal (no apatía).
   - *Temerosa:* Indica miedo (lo contrario a ignorar la alerta).
   - *Ingenua:* Falta de malicia.
   - *Indolente:* Que no se conmueve, flojo o desidioso, que no presta atención al peligro.
4. El término *indolente* refleja con absoluta fidelidad los semas de desinterés y negligencia del contexto.
**Respuesta:** B

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t01_s02_c01",
                    question = "La distinción rigurosa entre 'Polisemia' y 'Homonimia' en la semántica lingüística radica fundamentalmente en que:",
                    options = listOf(
                        "La polisemia ocurre en verbos y la homonimia exclusivamente en adjetivos.",
                        "En la polisemia un único significante posee múltiples significados vinculados por un rasgo semántico común (etimología compartida), mientras que en la homonimia dos palabras de orígenes etimológicos distintos coinciden fortuitamente en su forma fonética o gráfica.",
                        "La homonimia es un error gramatical sancionado por la RAE.",
                        "La polisemia se da solo en idiomas anglosajones y nunca en el español.",
                    ),
                    correctIndex = 1,
                    explanation = "La polisemia proviene de una misma raíz histórica que divergió semánticamente guardando un nexo analógico (ej. 'pico' de ave / de montaña); la homonimia surge de raíces etimológicas diferentes que convergieron por evolución fonética (ej. 'vino' del verbo venir y 'vino' bebida fermentada)."
                ),
                Challenge(
                    id = "rv_t01_s02_c02",
                    question = "Los términos 'Copa' (vaso con pie para beber) y 'Copa' (parte superior frondosa de un árbol) constituyen un caso paradigmático de:",
                    options = listOf(
                        "Polisemia.",
                        "Antonimia recíproca.",
                        "Paronimia estricta.",
                        "Homonimia homófona.",
                    ),
                    correctIndex = 0,
                    explanation = "Es un caso de polisemia: ambos sentidos derivan de la misma raíz y comparten el sema de forma cóncava y remate superior ensanchado."
                ),
                Challenge(
                    id = "rv_t01_s02_c03",
                    question = "Las palabras 'Baya' (fruto carnoso) y 'Valla' (cercado o barrera de madera) representan un caso lingüístico de:",
                    options = listOf(
                        "Homonimia homófona.",
                        "Homonimia homógrafa.",
                        "Polisemia metafórica.",
                        "Sinonimia directa.",
                    ),
                    correctIndex = 0,
                    explanation = "Son homófonas porque suenan idénticamente en la pronunciación estándar, pero poseen distinta grafía (ortografía) y significados totalmente independientes."
                ),
                Challenge(
                    id = "rv_t01_s02_c04",
                    question = "Dos vocablos que coinciden exactamente tanto en su pronunciación como en su escritura gráfica, pero proceden de étimos distintos y figuran en entradas separadas del diccionario (por ejemplo, 'Gato' animal felino y 'Gato' herramienta mecánica para elevar autos) son clasificados como:",
                    options = listOf(
                        "Homógrafos (o homónimos totales/parciales).",
                        "Homófonos imperfectos.",
                        "Parónimos tónicos.",
                        "Hiperónimos taxonómicos.",
                    ),
                    correctIndex = 0,
                    explanation = "Son palabras homógrafas (se escriben igual y suenan igual), pero etimológicamente distintas, constituyendo lemas lexicográficos independientes."
                ),
                Challenge(
                    id = "rv_t01_s02_c05",
                    question = "La 'Paronimia' se define en el razonamiento verbal como la relación entre dos vocablos que:",
                    options = listOf(
                        "Tienen exactamente el mismo significado en todos los contextos.",
                        "Presentan pronunciación y escritura sumamente semejantes, pero significados totalmente distintos que pueden inducir a error (ej. 'inminente' y 'eminente').",
                        "Poseen significados opuestos de forma complementaria.",
                        "Pertenecen necesariamente a familias léxicas de lenguas indígenas.",
                    ),
                    correctIndex = 1,
                    explanation = "La paronimia se caracteriza por la similitud formal fonética y ortográfica entre dos palabras con semánticas disímiles (ej. 'absolver' / 'absorber', 'expedir' / 'expeler')."
                ),
                Challenge(
                    id = "rv_t01_s02_c06",
                    question = "En la pareja de términos: 'Actitud' (disposición anímica o corporal) y 'Aptitud' (capacidad o idoneidad para un oficio), la relación semántica existente es de:",
                    options = listOf(
                        "Sinonimia perifrástica.",
                        "Polisemia contextual.",
                        "Paronimia.",
                        "Homonimia homógrafa.",
                    ),
                    correctIndex = 2,
                    explanation = "'Actitud' y 'Aptitud' son términos parónimos: difieren en un único fonema (/k/ frente a /p/), pero sus conceptos son radicalmente distintos."
                ),
                Challenge(
                    id = "rv_t01_s02_c07",
                    question = "La relación semántica entre 'Flor' y 'Orquídea', donde 'Flor' designa una clase general incluyente y 'Orquídea' una especie particular incluida, se conoce respectivamente como relación de:",
                    options = listOf(
                        "Sinonimia contextual.",
                        "Antonimia gradual.",
                        "Hiperonimia e Hiponimia.",
                        "Homonimia sintáctica.",
                    ),
                    correctIndex = 2,
                    explanation = "El hiperónimo es el término genérico de mayor extensión semántica ('flor'), mientras que el hipónimo es el vocablo específico de menor extensión incluido en él ('orquídea')."
                ),
                Challenge(
                    id = "rv_t01_s02_c08",
                    question = "Los términos 'Cobre', 'Plata' y 'Oro', en tanto comparten el mismo hiperónimo ('Metal'), mantienen entre sí una relación semántica de:",
                    options = listOf(
                        "Homonimia léxica.",
                        "Paronimia dialectal.",
                        "Cohiponimia.",
                        "Polisemia morfológica.",
                    ),
                    correctIndex = 2,
                    explanation = "Los hipónimos que pertenecen al mismo nivel jerárquico dentro de un campo semántico común bajo un mismo hiperónimo se denominan cohipónimos entre sí."
                ),
                Challenge(
                    id = "rv_t01_s02_c09",
                    question = "¿Cuál de los siguientes pares de palabras ejemplifica una relación de 'Antonimia Complementaria' o excluyente?",
                    options = listOf(
                        "Frío - Caliente (admite tibio).",
                        "Vivo - Muerto (la negación de uno afirma necesariamente el otro).",
                        "Alto - Bajo (admite estatura media).",
                        "Grande - Pequeño (admite mediano).",
                    ),
                    correctIndex = 1,
                    explanation = "En la antonimia complementaria, la afirmación de un término implica la negación categórica del otro sin admitir grados intermedios: no se puede estar a la vez vivo y muerto."
                ),
                Challenge(
                    id = "rv_t01_s02_c10",
                    question = "La relación semántica de 'Meronimia' y 'Holonimia' se diferencia de la hiperonimia e hiponimia porque expresa:",
                    options = listOf(
                        "Una relación puramente etimológica entre palabras de origen griego.",
                        "La relación física o conceptual de parte a todo ('dedo' es merónimo de 'mano', y 'mano' es holónimo de 'dedo').",
                        "Una coincidencia fonética casual sin nexo gramatical.",
                        "La sustitución de un adjetivo por un adverbio de modo.",
                    ),
                    correctIndex = 1,
                    explanation = "La relación meronimia-holonimia es de parte-todo constitutivo físico/material, a diferencia de la hiponimia-hiperonimia que es una relación taxonómica de género-especie."
                ),
            )
        )
    )
}
