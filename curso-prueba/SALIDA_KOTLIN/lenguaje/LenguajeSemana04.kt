package lenguaje

object LenguajeSemana04 {

    val lessons = listOf(
        LessonNode(
            id = "leng_t04_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Morfología: Concepto, Morfema, Alomorfos y Clasificación",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE MORFOLOGÍA

```
                         ESTRUCTURA Y FORMACIÓN DE PALABRAS
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
   CLASES DE MORFEMAS                                              PROCESOS FORMATIVOS
 (Unidades Mínimas de Significado)                                 (Creación de Nuevos Vocablos)
         │                                                               │
 ┌───────┴───────┬───────────────┐                         ┌─────────────┼─────────────┬─────────────┐
 ▼               ▼               ▼                         ▼             ▼             ▼             ▼
LEXEMA          FLEXIVOS        DERIVATIVOS            DERIVACIÓN    COMPOSICIÓN   PARASÍNTESIS  OTROS
(Raíz léxica)   (Accidentes)    (Afijos: crean         (Lexema +     (Lexema +     (Comp. +      • Acronimia
• Significado   • Simple:         palabras nuevas)       afijos)       Lexema)       Derivación) • Siglas
  básico          Género y      • Prefijos             • pan-adero   • Yuxtapuesta • quince-     • Acortamiento
• pan-, mar-,     número        • Sufijos              • in-útil       (corta-uñas)  añ-ero      • Onomatopeya
  libr-         • Amalgama:     • Infijos /            • flor-ero    • Propiamente • a-terr-
                  Verbos          interfijos                           dicha         izar
                  (modo, tiempo,                                       (blanqui-
                  persona)                                             rrojo)
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Concepto de Morfología y Morfema
1. **Morfología**: Disciplina de la lingüística que estudia la **estructura interna de las palabras**, sus reglas de formación, los elementos que las constituyen y las variaciones flexivas que experimentan.
2. **El Morfema**:
   - Es la **unidad mínima significativa** de la lengua (el signo lingüístico elemental con significante y significado). A diferencia del fonema (que es solo distintivo), el morfema **sí posee significado**.
   - *Ejemplo*: En la palabra *gat-o-s*, identificamos tres morfemas:
     - `gat-` (morfema lexical: felino doméstico).
     - `-o` (morfema flexivo: género masculino).
     - `-s` (morfema flexivo: número plural).
3. **El Alomorfo**:
   - Es la variante formal, fonética o gráfica que adopta un mismo morfema en diferentes contextos morfológicos sin alterar su significado:
     - *Alomorfos del plural*: `-s` (en palabras terminadas en vocal: *casa-s*) y `-es` (en palabras terminadas en consonante: *árbol-es*), o el morfo cero `-\emptyset` (*crisis*).
     - *Alomorfos del prefijo negativo*: `in-` (*in-tolerable*), `im-` (*im-posible*) e `i-` (*i-lógico*).

---



### B. Clasificación de los Morfemas

#### 1. Por su Significado o Función Gramatical
- **A. Morfema Lexical (Lexema, Raíz o Base)**:
  - Es el núcleo irreducible portador del **significado conceptual, léxico o semántico** fundamental de la palabra. Pertenece al inventario de léxico abierto.
  - *Ejemplos*: `niñ-` en *niño*, *niñera*, *aniñado*; `sol-` en *sol*, *solar*, *parasol*.
- **B. Morfemas Gramaticales Flexivos (Desinencias)**:
  - No crean palabras nuevas ni alteran la categoría gramatical del lexema; únicamente expresan **accidentes gramaticales** obligatorios:
    - *Flexivos Simples*: Aportan un solo accidente de género o de número:
      - Género: `-o` (masculino), `-a` (femenino).
      - Número: `-s`, `-es`.
    - *Flexivo Amalgama (Exclusivo del Verbo conjugado)*:
      - Es un morfema indivisible que expresa simultáneamente múltiples accidentes gramaticales en una sola desinencia: **tiempo, modo, aspecto, número y persona**.
      - *Ejemplo*: En el verbo *cant-é*, el morfo `-é` expresa en un solo bloque: 1° persona, singular, tiempo pretérito perfecto simple, modo indicativo y aspecto perfectivo.
- **C. Morfemas Gramaticales Derivativos (Afijos)**:
  - Se unen al lexema para **crear nuevas palabras** derivadas o modificar sustancialmente el significado de la base, pudiendo cambiar la categoría gramatical de la palabra:
    - *Prefijos*: Se anteponen al lexema (*des-hacer*, *sub-suelo*, *pre-universitario*).
    - *Sufijos*: Se posponen al lexema (*libr-ero*, *tranquil-amente*, *pan-adería*).
    - *Infijos o Interfijos*: Segmentos átonos sin significado propio que se insertan entre la raíz y el sufijo para facilitar la pronunciación eufónica (*polv-ar-eda*, *pan-ec-illo*, *caf-ec-ito*).

#### 2. Por su Grado de Dependencia o Autonomía
- **Morfemas Libres o Independientes**: Pueden aparecer aislados en el discurso constituyendo por sí mismos una palabra completa autónoma (*sol*, *pan*, *mar*, *árbol*, *hoy*).
- **Morfemas Ligados o Trabados**: No pueden aparecer solos; requieren unirse forzosamente a otros morfemas para tener realización fónica (*-ero*, *des-*, *-ción*, *-s*).

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia del Flexivo Amalgama:
> **"EL AMALGAMA ES EXCLUSIVO DEL VERBO CONJUGADO"**
- Concentra en un solo sufijo: Persona, Número, Tiempo, Modo y Aspecto.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 2: Intermedio / Identificación de Morfemas
**Enunciado**: En la forma verbal conjugada *escribíamos*, el morfema desinencial que aglutina simultáneamente los accidentes gramaticales de primera persona, número plural, tiempo pretérito imperfecto, modo indicativo y aspecto imperfectivo recibe el nombre de:
A) Morfema derivativo apreciativo  
B) Infijo eufónico  
C) Morfema flexivo amalgama  
D) Alomorfo de género  
E) Lexema libre dependiente  

- **Resolución**: En los verbos conjugados, la desinencia que porta en una sola unidad indivisible los accidentes de tiempo, modo, persona y número es el **morfema flexivo amalgama**.
- **Clave Correcta**: **C**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El fenómeno morfofonológico del **alomorfo** da cuenta de la versatilidad de la lengua para manifestar una misma función de significado bajo distintos significantes contextuales. Señale la alternativa que presenta un conjunto de vocablos donde el prefijo negativo se manifiesta a través de sus **alomorfos** complementarios:
A) Deshacer, descoser, desatar  
B) Intolerante, improbable, ilegible  
C) Prefijado, preuniversitario, preescolar  
D) Reabrir, reconstruir, relanzar  
E) Subsuelo, subterráneo, suburbio  

- **Resolución**: El morfema derivativo que expresa negación o privación posee tres alomorfos condicionados por el punto articulatorio de la consonante siguiente:
  - `in-` ante la mayoría de consonantes (*in-tolerante*).
  - `im-` ante consonante bilabial /p/ o /b/ (*im-probable*).
  - `i-` ante consonante líquida /l/ o /r/ (*i-legible*, *i-real*).
  - La alternativa B contiene exactamente los tres alomorfos del prefijo negativo.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Morfema**: Unidad gramatical mínima provista de significado conceptual o funcional.
2. **Alomorfo**: Variante fonética o gráfica de un morfema que cumple la misma función sin alterar el significado.
3. **Lexema**: Raíz o núcleo básico de la palabra portador del significado léxico principal.
4. **Morfema Flexivo**: Afijo que expresa accidentes gramaticales obligatorios (género, número, tiempo).
5. **Morfema Amalgama**: Desinencia verbal que funde de manera indivisible los accidentes de persona, tiempo, modo y número.
6. **Parasíntesis**: Creación léxica por unión simultánea de composición y derivación o por circunfijación indisoluble.
7. **Yuxtaposición**: Proceso de composición donde dos palabras se funden sin sufrir ninguna alteración fónica.
8. **Composición Propia**: Fusión de lexemas donde al menos una de las bases sufre una alteración morfológica.
9. **Acronimia**: Mecanismo que forma palabras fusionando fragmentos silábicos de diferentes términos.
10. **Infijo / Interfijo**: Elemento morfológico átono sin significado que se inserta por eufonía entre el lexema y el sufijo.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Morfema Flexivo y Morfema Derivativo?
  - *Reverso*: El flexivo solo añade accidentes gramaticales (género, número); el derivativo crea nuevas palabras con cambio de significado o categoría.

- **Flashcard 2**:
  - *Anverso*: ¿Cómo se reconoce una palabra formada por Parasíntesis?
  - *Reverso*: Porque reúne dos lexemas y un sufijo (o prefijo y sufijo simultáneos) y al retirarle un elemento la forma resultante NO existe en la lengua (*quinceañero, desalmado*).

- **Flashcard 3**:
  - *Anverso*: ¿Qué es un Morfema Amalgama?
  - *Reverso*: El morfema flexivo exclusivo del verbo conjugado que aglutina simultáneamente persona, número, tiempo y modo en una sola terminación.

- **Flashcard 4**:
  - *Anverso*: ¿Cuál es la diferencia entre Composición Yuxtapuesta y Propiamente Dicha?
  - *Reverso*: En la yuxtapuesta no hay variación fonética (*cortauñas*); en la propiamente dicha el primer elemento cambia de forma (*blanquirrojo, agridulce*).

---



### C. Procesos Formativos de Palabras en el Español

#### 1. La Derivación
Es el procedimiento más productivo del español. Consiste en añadir uno o más morfemas derivativos (prefijos o sufijos) a un lexema base:
\mathbf{Lexema + Sufijo} \quad \text{o} \quad \mathbf{Prefijo + Lexema}
- *Ejemplos*:
  - *libr-ería* (sustantivo derivado de sustantivo).
  - *leal-tad* (sustantivo derivado de adjetivo).
  - *canta-nte* (sustantivo derivado de verbo).
  - *re-hacer*, *in-fiel*, *a-normal* (derivadas por prefijación).

#### 2. La Composición
Consiste en la fusión de **dos o más lexemas independientes** para dar origen a una nueva unidad léxica:
\mathbf{Lexema_1 + Lexema_2}
Se clasifica en dos modalidades:
- **A. Composición por Yuxtaposición (Composición Simple)**:
  - Los lexemas se unen directamente **sin sufrir ninguna alteración fonética ni ortográfica** en sus bases:
  - *Ejemplos*: *corta + uñas = cortauñas*; *saca + corchos = sacacorchos*; *boca + calle = bocacalle*; *guarda + costas = guardacostas*.
- **B. Composición Propiamente Dicha**:
  - Al unirse los lexemas, el primer elemento (o ambos) sufre una **modificación fonética u ortográfica**:
  - *Ejemplos*:
    - *blanco + rojo = blanquirrojo* (la 'o' muta a 'i').
    - *mano + obra = maniobra*.
    - *agrio + dulce = agridulce*.
    - *cien + pies = ciempiés* (la 'n' cambia a 'm' ante 'p').

#### 3. La Parasíntesis
Es un proceso formativo complejo que opera bajo dos modalidades estrictas:
- **Modalidad A: Composición + Derivación Simultánea**:
  - Se unen dos lexemas y un sufijo derivativo, con la condición sine qua non de que **no exista de modo independiente en la lengua ni el primer compuesto ni la forma derivada aislada**:
    \mathbf{Lexema_1 + Lexema_2 + Sufijo Derivativo}
  - *Ejemplos*:
    - *quince-añ-ero* (No existe \*quinceaño ni \*añero de forma aislada).
    - *pica-pedr-ero* (No existe \*picapedra ni \*pedrero en ese sentido).
    - *ropa-vej-ero*.
- **Modalidad B: Parasíntesis por Afijación Simultánea (Circunfijación)**:
  - Unión simultánea e indisoluble de un **prefijo + lexema + sufijo**, de tal modo que si se suprime el prefijo o el sufijo, la palabra resultante **carece de existencia léxica**:
  - *Ejemplos*:
    - *a-terr-izar* (No existe \*aterro ni existe \*terrizar).
    - *des-alm-ado* (No existe \*desalma ni \*almado).
    - *en-vej-ecer* (No existe \*enveje ni \*vejecer).
    - *a-niñ-ado*.
  - *¡Cuidado!*: La palabra *in-alcanz-able* NO es parasintética, es **derivada**, porque si le quitamos el prefijo *in-*, la palabra *alcanzable* sí existe de forma independiente.

#### 4. Otros Mecanismos de Creación Léxica
- **Acronimia**:
  - Formación de palabras mediante la unión de fragmentos, sílabas iniciales o finales de varios vocablos (*Sindicato + Único = SUTEP*; *Petróleos + del Perú = Petroperú*; *Cámara + aparato = camarógrafo*).
  - Incluye términos convertidos en sustantivos comunes leídos de corrido: *ovni* (objeto volador no identificado), *láser*, *sida*, *radar*.
- **Siglación**:
  - Creación léxica uniendo únicamente las **letras iniciales mayúsculas** de un conjunto de palabras, pronunciándose letra por letra: *DNI*, *ONU*, *OEA*, *FMI*, *BCRP*, *RUC*. No llevan puntos intermedios ni plural (*los DNI, no los DNI's*).
- **Acortamiento o Truncamiento**:
  - Reducción fonética de las sílabas finales o iniciales de una palabra por uso coloquial: *foto* (fotografía), *bici* (bicicleta), *profe* (profesor), *tele* (televisión), *cine* (cinematógrafo).
- **Onomatopeya**:
  - Creación de palabras mediante la imitación fonética de ruidos de la naturaleza o sonidos de animales: *miau*, *tictac*, *zas*, *zumbido*, *chasquido*, *cacarear*, *croar*.

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa de la palabra Parasintética vs. Derivada doble**:
   - Palabras como *deslealtad*, *inutilizable*, *submarino* **NO son parasintéticas**, son **derivadas**, porque provienen de bases que ya existían (*lealtad*, *utilizable*, *marino*).
2. **Morfema Cero (\emptyset)**:
   - El plural en palabras como *crisis* o *tórax* no añade `-s`; se marca mediante morfema flexivo cero: `el tórax` / `los tórax-\emptyset`.
3. **Composición Yuxtapuesta vs. Propiamente dicha**:
   - *Picaflor* (pica + flor): No varió nada \rightarrow **Yuxtaposición**.
   - *Pelirrojo* (pelo + rojo): Varió la 'o' por 'i' \rightarrow **Propiamente dicha**.

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Analice las siguientes palabras e identifique la serie que contiene de manera exclusiva vocablos formados mediante el proceso de **parasíntesis**:
A) Despreocupado, submarino, limpiaparabrisas  
B) Aterrizar, quinceañero, desalmado  
C) Bocacalle, agridulce, portamaletas  
D) Pelirrojo, destapar, profesorado  
E) Ciempiés, maniobra, pordiosero  

- **Resolución**:
  - *Aterrizar*: a- + terr- + -izar (afijación simultánea sin formas intermedias: no existe \*aterro ni \*terrizar).
  - *Quinceañero*: quince + añ- + -ero (composición y derivación simultánea: no existe \*quinceaño ni \*añero).
  - *Desalmado*: des- + alm- + -ado (afijación simultánea: no existe \*desalma ni \*almado).
  - Todos los términos de la opción B son **parasintéticos**.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En el fragmento extraído de una crónica periodística: *"El experimentado automovilista arequipeño condujo su coche blanquirrojo sorteando baches con gran destreza"*, las palabras subrayadas *automovilista* y *blanquirrojo* han sido originadas, respectivamente, mediante los mecanismos de:
A) Derivación y composición yuxtapuesta  
B) Parasíntesis y composición propiamente dicha  
C) Acronimia y parasíntesis  
D) Composición propia y derivación  
E) Yuxtaposición y acortamiento  

- **Resolución**:
  - *Automovilista*: Proviene de la unión de *auto + móvil + -ista* (dos raíces y un sufijo en un bloque parasintético indivisible, no existiendo la palabra \*automóvilista sin el sufijo como adjetivo previo independiente).
  - *Blanquirrojo*: Proviene de *blanco + rojo*, donde el primer lexema experimenta la mutación fonética o \rightarrow i y la duplicación de la r \rightarrow rr \rightarrow **Composición propiamente dicha**.
- **Clave Correcta**: **B**

---



## 4. CUADRO COMPARATIVO: PROCESOS FORMATIVOS FUNDAMENTALES

| Proceso Formativo | Estructura Morfológica | Requisito Distintivo | Ejemplos Representativos |
| :--- | :--- | :--- | :--- |
| **Derivación** | Lexema + Afijo derivativo. | Modifica la raíz con prefijos o sufijos. | *pan-adero*, *in-útil*, *mar-ino*. |
| **Composición Yuxtapuesta**| Lexema + Lexema. | Fusión directa **sin cambio fonético**. | *corta-uñas*, *para-aguas*, *cubre-cama*.|
| **Composición Propia** | Lexema + Lexema con mutación. | El primer elemento **cambia fonéticamente**. | *blanqui-rrojo*, *agri-dulce*, *peli-rrojo*.|
| **Parasíntesis** | Lexema + Lexema + Sufijo; o Prefijo + Lexema + Sufijo simultáneo.| La palabra **no existe** si se le quita un elemento. | *quince-añ-ero*, *des-alm-ado*, *en-vej-ecer*.|
| **Acronimia** | Sílabas de diferentes palabras. | Se lee como una palabra ordinaria. | *Sedapal*, *Sunat*, *ovni*, *Mercosur*. |
| **Siglación** | Letras iniciales mayúsculas. | Se deletrea o lee por siglas. | *DNI*, *ONU*, *OEA*, *UNSA*. |

---



# TEMA 04: MORFOLOGÍA Y FORMACIÓN DE PALABRAS

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: El proceso formativo de palabras que consiste en la unión de dos o más raíces o lexemas sin que ninguno de ellos sufra alteración fonética ni gráfica en su estructura se denomina:
A) Parasíntesis  
B) Composición por yuxtaposición  
C) Composición propiamente dicha  
D) Acronimia  
E) Derivación apreciativa  

- **Resolución**: La **composición por yuxtaposición** ocurre cuando dos lexemas se unen manteniendo inalterada su forma fónica y ortográfica original (ej. *corta + plumas = cortaplumas*).
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t04_s01_c01",
                    question = "La unidad mínima del análisis morfológico que posee significado conceptual o gramatical se denomina:",
                    options = listOf(
                        "Sintagma",
                        "Fonema",
                        "Grafema",
                        "Morfema",
                    ),
                    correctIndex = 3,
                    explanation = "El morfema es la unidad mínima con significado de la lengua, a diferencia del fonema que carece de significado propio."
                ),
                Challenge(
                    id = "leng_t04_s01_c02",
                    question = "Las variantes formales que adopta un mismo morfema según el contexto (como in-, im- e i- para la negación) se conocen como:",
                    options = listOf(
                        "Monemas libres",
                        "Alomorfos",
                        "Infijos flexivos",
                        "Alófonos",
                    ),
                    correctIndex = 1,
                    explanation = "Los alomorfos son las distintas manifestaciones formales de un mismo morfema en virtud del entorno fonético."
                ),
                Challenge(
                    id = "leng_t04_s01_c03",
                    question = "En la forma verbal conjugada 'escrib-í', la desinencia final '-í' es un morfema clasificado como:",
                    options = listOf(
                        "Flexivo amalgama",
                        "Derivativo prefijal",
                        "Flexivo simple de número",
                        "Infijo eufónico",
                    ),
                    correctIndex = 0,
                    explanation = "En los verbos, el morfema amalgama expresa simultáneamente y en una sola terminación el tiempo, modo, aspecto, persona y número."
                ),
                Challenge(
                    id = "leng_t04_s01_c04",
                    question = "En la palabra 'panaderías', el morfema lexical o raíz que porta el significado básico es:",
                    options = listOf(
                        "pan-",
                        "-ería",
                        "-s",
                        "panad-",
                    ),
                    correctIndex = 0,
                    explanation = "El lexema base es 'pan-', de donde derivan términos de la misma familia como panadero, panadería, panecillo."
                ),
                Challenge(
                    id = "leng_t04_s01_c05",
                    question = "El elemento morfológico que se inserta entre la raíz y el sufijo únicamente para facilitar la pronunciación eufónica, sin aportar significado, es el:",
                    options = listOf(
                        "Flexivo simple",
                        "Infijo o interfijo",
                        "Morfema libre",
                        "Prefijo",
                    ),
                    correctIndex = 1,
                    explanation = "El infijo o interfijo (como '-ec-' en 'pan-ec-ito') es un elemento de unión carente de significado propio que enlaza la raíz con el sufijo."
                ),
                Challenge(
                    id = "leng_t04_s01_c06",
                    question = "¿Cuál de las siguientes palabras está constituida exclusivamente por un morfema libre o independiente?",
                    options = listOf(
                        "Perrito",
                        "Desleal",
                        "Mares",
                        "Sol",
                    ),
                    correctIndex = 3,
                    explanation = "La palabra 'sol' es un morfema libre porque tiene significado y autonomía léxica plena sin necesidad de sufijos ni prefijos ligados."
                ),
                Challenge(
                    id = "leng_t04_s01_c07",
                    question = "Los morfemas que se adhieren a la raíz para generar una nueva palabra derivada o cambiar su categoría sintáctica son los:",
                    options = listOf(
                        "Morfemas flexivos",
                        "Morfemas libres",
                        "Alomorfos amalgama",
                        "Morfemas derivativos (afijos)",
                    ),
                    correctIndex = 3,
                    explanation = "Los morfemas derivativos (prefijos, sufijos) permiten crear palabras nuevas en el léxico modificando el significado de la base."
                ),
                Challenge(
                    id = "leng_t04_s01_c08",
                    question = "En el vocablo 'alumnas', los morfemas '-a' y '-s' cumplen respectivamente la función de indicar:",
                    options = listOf(
                        "Género femenino y número plural (flexivos simples)",
                        "Derivación apreciativa y aumentativa",
                        "Tiempo presente y aspecto imperfectivo",
                        "Morfemas trabados derivativos",
                    ),
                    correctIndex = 0,
                    explanation = "Los morfemas '-a' y '-s' son flexivos simples que aportan únicamente los accidentes de género femenino y número plural."
                ),
                Challenge(
                    id = "leng_t04_s01_c09",
                    question = "¿Cuál de las siguientes opciones contiene un prefijo derivativo con significado de oposición o privación?",
                    options = listOf(
                        "Rehacer",
                        "Subdirector",
                        "Desarmar",
                        "Anteponer",
                    ),
                    correctIndex = 2,
                    explanation = "El prefijo derivativo 'des-' aporta la idea de privación, reversión o acción contraria en 'desarmar'."
                ),
                Challenge(
                    id = "leng_t04_s01_c10",
                    question = "La disciplina gramatical encargada de estudiar la estructura interna y los componentes significativos de las palabras es la:",
                    options = listOf(
                        "Morfología",
                        "Fonología",
                        "Sintaxis",
                        "Semiótica pura",
                    ),
                    correctIndex = 0,
                    explanation = "La morfología es la rama lingüística dedicada a la estructura interna, composición y variaciones formales de las palabras."
                ),
            )
        ),
        LessonNode(
            id = "leng_t04_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Procesos Formativos de Palabras en el Español",
            theory = LessonTheory(
                content = """# TEMA 04: MORFOLOGÍA Y FORMACIÓN DE PALABRAS

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE MORFOLOGÍA

```
                         ESTRUCTURA Y FORMACIÓN DE PALABRAS
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
   CLASES DE MORFEMAS                                              PROCESOS FORMATIVOS
 (Unidades Mínimas de Significado)                                 (Creación de Nuevos Vocablos)
         │                                                               │
 ┌───────┴───────┬───────────────┐                         ┌─────────────┼─────────────┬─────────────┐
 ▼               ▼               ▼                         ▼             ▼             ▼             ▼
LEXEMA          FLEXIVOS        DERIVATIVOS            DERIVACIÓN    COMPOSICIÓN   PARASÍNTESIS  OTROS
(Raíz léxica)   (Accidentes)    (Afijos: crean         (Lexema +     (Lexema +     (Comp. +      • Acronimia
• Significado   • Simple:         palabras nuevas)       afijos)       Lexema)       Derivación) • Siglas
  básico          Género y      • Prefijos             • pan-adero   • Yuxtapuesta • quince-     • Acortamiento
• pan-, mar-,     número        • Sufijos              • in-útil       (corta-uñas)  añ-ero      • Onomatopeya
  libr-         • Amalgama:     • Infijos /            • flor-ero    • Propiamente • a-terr-
                  Verbos          interfijos                           dicha         izar
                  (modo, tiempo,                                       (blanqui-
                  persona)                                             rrojo)
```

---



### C. Procesos Formativos de Palabras en el Español

#### 1. La Derivación
Es el procedimiento más productivo del español. Consiste en añadir uno o más morfemas derivativos (prefijos o sufijos) a un lexema base:
\mathbf{Lexema + Sufijo} \quad \text{o} \quad \mathbf{Prefijo + Lexema}
- *Ejemplos*:
  - *libr-ería* (sustantivo derivado de sustantivo).
  - *leal-tad* (sustantivo derivado de adjetivo).
  - *canta-nte* (sustantivo derivado de verbo).
  - *re-hacer*, *in-fiel*, *a-normal* (derivadas por prefijación).

#### 2. La Composición
Consiste en la fusión de **dos o más lexemas independientes** para dar origen a una nueva unidad léxica:
\mathbf{Lexema_1 + Lexema_2}
Se clasifica en dos modalidades:
- **A. Composición por Yuxtaposición (Composición Simple)**:
  - Los lexemas se unen directamente **sin sufrir ninguna alteración fonética ni ortográfica** en sus bases:
  - *Ejemplos*: *corta + uñas = cortauñas*; *saca + corchos = sacacorchos*; *boca + calle = bocacalle*; *guarda + costas = guardacostas*.
- **B. Composición Propiamente Dicha**:
  - Al unirse los lexemas, el primer elemento (o ambos) sufre una **modificación fonética u ortográfica**:
  - *Ejemplos*:
    - *blanco + rojo = blanquirrojo* (la 'o' muta a 'i').
    - *mano + obra = maniobra*.
    - *agrio + dulce = agridulce*.
    - *cien + pies = ciempiés* (la 'n' cambia a 'm' ante 'p').

#### 3. La Parasíntesis
Es un proceso formativo complejo que opera bajo dos modalidades estrictas:
- **Modalidad A: Composición + Derivación Simultánea**:
  - Se unen dos lexemas y un sufijo derivativo, con la condición sine qua non de que **no exista de modo independiente en la lengua ni el primer compuesto ni la forma derivada aislada**:
    \mathbf{Lexema_1 + Lexema_2 + Sufijo Derivativo}
  - *Ejemplos*:
    - *quince-añ-ero* (No existe \*quinceaño ni \*añero de forma aislada).
    - *pica-pedr-ero* (No existe \*picapedra ni \*pedrero en ese sentido).
    - *ropa-vej-ero*.
- **Modalidad B: Parasíntesis por Afijación Simultánea (Circunfijación)**:
  - Unión simultánea e indisoluble de un **prefijo + lexema + sufijo**, de tal modo que si se suprime el prefijo o el sufijo, la palabra resultante **carece de existencia léxica**:
  - *Ejemplos*:
    - *a-terr-izar* (No existe \*aterro ni existe \*terrizar).
    - *des-alm-ado* (No existe \*desalma ni \*almado).
    - *en-vej-ecer* (No existe \*enveje ni \*vejecer).
    - *a-niñ-ado*.
  - *¡Cuidado!*: La palabra *in-alcanz-able* NO es parasintética, es **derivada**, porque si le quitamos el prefijo *in-*, la palabra *alcanzable* sí existe de forma independiente.

#### 4. Otros Mecanismos de Creación Léxica
- **Acronimia**:
  - Formación de palabras mediante la unión de fragmentos, sílabas iniciales o finales de varios vocablos (*Sindicato + Único = SUTEP*; *Petróleos + del Perú = Petroperú*; *Cámara + aparato = camarógrafo*).
  - Incluye términos convertidos en sustantivos comunes leídos de corrido: *ovni* (objeto volador no identificado), *láser*, *sida*, *radar*.
- **Siglación**:
  - Creación léxica uniendo únicamente las **letras iniciales mayúsculas** de un conjunto de palabras, pronunciándose letra por letra: *DNI*, *ONU*, *OEA*, *FMI*, *BCRP*, *RUC*. No llevan puntos intermedios ni plural (*los DNI, no los DNI's*).
- **Acortamiento o Truncamiento**:
  - Reducción fonética de las sílabas finales o iniciales de una palabra por uso coloquial: *foto* (fotografía), *bici* (bicicleta), *profe* (profesor), *tele* (televisión), *cine* (cinematógrafo).
- **Onomatopeya**:
  - Creación de palabras mediante la imitación fonética de ruidos de la naturaleza o sonidos de animales: *miau*, *tictac*, *zas*, *zumbido*, *chasquido*, *cacarear*, *croar*.

---



## 4. CUADRO COMPARATIVO: PROCESOS FORMATIVOS FUNDAMENTALES

| Proceso Formativo | Estructura Morfológica | Requisito Distintivo | Ejemplos Representativos |
| :--- | :--- | :--- | :--- |
| **Derivación** | Lexema + Afijo derivativo. | Modifica la raíz con prefijos o sufijos. | *pan-adero*, *in-útil*, *mar-ino*. |
| **Composición Yuxtapuesta**| Lexema + Lexema. | Fusión directa **sin cambio fonético**. | *corta-uñas*, *para-aguas*, *cubre-cama*.|
| **Composición Propia** | Lexema + Lexema con mutación. | El primer elemento **cambia fonéticamente**. | *blanqui-rrojo*, *agri-dulce*, *peli-rrojo*.|
| **Parasíntesis** | Lexema + Lexema + Sufijo; o Prefijo + Lexema + Sufijo simultáneo.| La palabra **no existe** si se le quita un elemento. | *quince-añ-ero*, *des-alm-ado*, *en-vej-ecer*.|
| **Acronimia** | Sílabas de diferentes palabras. | Se lee como una palabra ordinaria. | *Sedapal*, *Sunat*, *ovni*, *Mercosur*. |
| **Siglación** | Letras iniciales mayúsculas. | Se deletrea o lee por siglas. | *DNI*, *ONU*, *OEA*, *UNSA*. |

---



### Nemotecnia de la Parasíntesis Verdadera:
> **"SI QUITAS UN LADO Y NO EXISTE, ES PARASÍNTESIS"**
- *Des-alm-ado*: ¿Existe *desalma*? No. ¿Existe *almado*? No \rightarrow **Parasíntesis**.
- *In-mortal-idad*: ¿Existe *mortalidad*? Sí \rightarrow **Derivación doble**, no parasíntesis.



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa de la palabra Parasintética vs. Derivada doble**:
   - Palabras como *deslealtad*, *inutilizable*, *submarino* **NO son parasintéticas**, son **derivadas**, porque provienen de bases que ya existían (*lealtad*, *utilizable*, *marino*).
2. **Morfema Cero (\emptyset)**:
   - El plural en palabras como *crisis* o *tórax* no añade `-s`; se marca mediante morfema flexivo cero: `el tórax` / `los tórax-\emptyset`.
3. **Composición Yuxtapuesta vs. Propiamente dicha**:
   - *Picaflor* (pica + flor): No varió nada \rightarrow **Yuxtaposición**.
   - *Pelirrojo* (pelo + rojo): Varió la 'o' por 'i' \rightarrow **Propiamente dicha**.

---



### Nivel 1: Básico / Definición Directa
**Enunciado**: El proceso formativo de palabras que consiste en la unión de dos o más raíces o lexemas sin que ninguno de ellos sufra alteración fonética ni gráfica en su estructura se denomina:
A) Parasíntesis  
B) Composición por yuxtaposición  
C) Composición propiamente dicha  
D) Acronimia  
E) Derivación apreciativa  

- **Resolución**: La **composición por yuxtaposición** ocurre cuando dos lexemas se unen manteniendo inalterada su forma fónica y ortográfica original (ej. *corta + plumas = cortaplumas*).
- **Clave Correcta**: **B**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Analice las siguientes palabras e identifique la serie que contiene de manera exclusiva vocablos formados mediante el proceso de **parasíntesis**:
A) Despreocupado, submarino, limpiaparabrisas  
B) Aterrizar, quinceañero, desalmado  
C) Bocacalle, agridulce, portamaletas  
D) Pelirrojo, destapar, profesorado  
E) Ciempiés, maniobra, pordiosero  

- **Resolución**:
  - *Aterrizar*: a- + terr- + -izar (afijación simultánea sin formas intermedias: no existe \*aterro ni \*terrizar).
  - *Quinceañero*: quince + añ- + -ero (composición y derivación simultánea: no existe \*quinceaño ni \*añero).
  - *Desalmado*: des- + alm- + -ado (afijación simultánea: no existe \*desalma ni \*almado).
  - Todos los términos de la opción B son **parasintéticos**.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En el fragmento extraído de una crónica periodística: *"El experimentado automovilista arequipeño condujo su coche blanquirrojo sorteando baches con gran destreza"*, las palabras subrayadas *automovilista* y *blanquirrojo* han sido originadas, respectivamente, mediante los mecanismos de:
A) Derivación y composición yuxtapuesta  
B) Parasíntesis y composición propiamente dicha  
C) Acronimia y parasíntesis  
D) Composición propia y derivación  
E) Yuxtaposición y acortamiento  

- **Resolución**:
  - *Automovilista*: Proviene de la unión de *auto + móvil + -ista* (dos raíces y un sufijo en un bloque parasintético indivisible, no existiendo la palabra \*automóvilista sin el sufijo como adjetivo previo independiente).
  - *Blanquirrojo*: Proviene de *blanco + rojo*, donde el primer lexema experimenta la mutación fonética o \rightarrow i y la duplicación de la r \rightarrow rr \rightarrow **Composición propiamente dicha**.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Morfema**: Unidad gramatical mínima provista de significado conceptual o funcional.
2. **Alomorfo**: Variante fonética o gráfica de un morfema que cumple la misma función sin alterar el significado.
3. **Lexema**: Raíz o núcleo básico de la palabra portador del significado léxico principal.
4. **Morfema Flexivo**: Afijo que expresa accidentes gramaticales obligatorios (género, número, tiempo).
5. **Morfema Amalgama**: Desinencia verbal que funde de manera indivisible los accidentes de persona, tiempo, modo y número.
6. **Parasíntesis**: Creación léxica por unión simultánea de composición y derivación o por circunfijación indisoluble.
7. **Yuxtaposición**: Proceso de composición donde dos palabras se funden sin sufrir ninguna alteración fónica.
8. **Composición Propia**: Fusión de lexemas donde al menos una de las bases sufre una alteración morfológica.
9. **Acronimia**: Mecanismo que forma palabras fusionando fragmentos silábicos de diferentes términos.
10. **Infijo / Interfijo**: Elemento morfológico átono sin significado que se inserta por eufonía entre el lexema y el sufijo.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuál es la diferencia medular entre Morfema Flexivo y Morfema Derivativo?
  - *Reverso*: El flexivo solo añade accidentes gramaticales (género, número); el derivativo crea nuevas palabras con cambio de significado o categoría.

- **Flashcard 2**:
  - *Anverso*: ¿Cómo se reconoce una palabra formada por Parasíntesis?
  - *Reverso*: Porque reúne dos lexemas y un sufijo (o prefijo y sufijo simultáneos) y al retirarle un elemento la forma resultante NO existe en la lengua (*quinceañero, desalmado*).

- **Flashcard 3**:
  - *Anverso*: ¿Qué es un Morfema Amalgama?
  - *Reverso*: El morfema flexivo exclusivo del verbo conjugado que aglutina simultáneamente persona, número, tiempo y modo en una sola terminación.

- **Flashcard 4**:
  - *Anverso*: ¿Cuál es la diferencia entre Composición Yuxtapuesta y Propiamente Dicha?
  - *Reverso*: En la yuxtapuesta no hay variación fonética (*cortauñas*); en la propiamente dicha el primer elemento cambia de forma (*blanquirrojo, agridulce*).

---



### A. Concepto de Morfología y Morfema
1. **Morfología**: Disciplina de la lingüística que estudia la **estructura interna de las palabras**, sus reglas de formación, los elementos que las constituyen y las variaciones flexivas que experimentan.
2. **El Morfema**:
   - Es la **unidad mínima significativa** de la lengua (el signo lingüístico elemental con significante y significado). A diferencia del fonema (que es solo distintivo), el morfema **sí posee significado**.
   - *Ejemplo*: En la palabra *gat-o-s*, identificamos tres morfemas:
     - `gat-` (morfema lexical: felino doméstico).
     - `-o` (morfema flexivo: género masculino).
     - `-s` (morfema flexivo: número plural).
3. **El Alomorfo**:
   - Es la variante formal, fonética o gráfica que adopta un mismo morfema en diferentes contextos morfológicos sin alterar su significado:
     - *Alomorfos del plural*: `-s` (en palabras terminadas en vocal: *casa-s*) y `-es` (en palabras terminadas en consonante: *árbol-es*), o el morfo cero `-\emptyset` (*crisis*).
     - *Alomorfos del prefijo negativo*: `in-` (*in-tolerable*), `im-` (*im-posible*) e `i-` (*i-lógico*).

---



### B. Clasificación de los Morfemas

#### 1. Por su Significado o Función Gramatical
- **A. Morfema Lexical (Lexema, Raíz o Base)**:
  - Es el núcleo irreducible portador del **significado conceptual, léxico o semántico** fundamental de la palabra. Pertenece al inventario de léxico abierto.
  - *Ejemplos*: `niñ-` en *niño*, *niñera*, *aniñado*; `sol-` en *sol*, *solar*, *parasol*.
- **B. Morfemas Gramaticales Flexivos (Desinencias)**:
  - No crean palabras nuevas ni alteran la categoría gramatical del lexema; únicamente expresan **accidentes gramaticales** obligatorios:
    - *Flexivos Simples*: Aportan un solo accidente de género o de número:
      - Género: `-o` (masculino), `-a` (femenino).
      - Número: `-s`, `-es`.
    - *Flexivo Amalgama (Exclusivo del Verbo conjugado)*:
      - Es un morfema indivisible que expresa simultáneamente múltiples accidentes gramaticales en una sola desinencia: **tiempo, modo, aspecto, número y persona**.
      - *Ejemplo*: En el verbo *cant-é*, el morfo `-é` expresa en un solo bloque: 1° persona, singular, tiempo pretérito perfecto simple, modo indicativo y aspecto perfectivo.
- **C. Morfemas Gramaticales Derivativos (Afijos)**:
  - Se unen al lexema para **crear nuevas palabras** derivadas o modificar sustancialmente el significado de la base, pudiendo cambiar la categoría gramatical de la palabra:
    - *Prefijos*: Se anteponen al lexema (*des-hacer*, *sub-suelo*, *pre-universitario*).
    - *Sufijos*: Se posponen al lexema (*libr-ero*, *tranquil-amente*, *pan-adería*).
    - *Infijos o Interfijos*: Segmentos átonos sin significado propio que se insertan entre la raíz y el sufijo para facilitar la pronunciación eufónica (*polv-ar-eda*, *pan-ec-illo*, *caf-ec-ito*).

#### 2. Por su Grado de Dependencia o Autonomía
- **Morfemas Libres o Independientes**: Pueden aparecer aislados en el discurso constituyendo por sí mismos una palabra completa autónoma (*sol*, *pan*, *mar*, *árbol*, *hoy*).
- **Morfemas Ligados o Trabados**: No pueden aparecer solos; requieren unirse forzosamente a otros morfemas para tener realización fónica (*-ero*, *des-*, *-ción*, *-s*).

---



### Nivel 2: Intermedio / Identificación de Morfemas
**Enunciado**: En la forma verbal conjugada *escribíamos*, el morfema desinencial que aglutina simultáneamente los accidentes gramaticales de primera persona, número plural, tiempo pretérito imperfecto, modo indicativo y aspecto imperfectivo recibe el nombre de:
A) Morfema derivativo apreciativo  
B) Infijo eufónico  
C) Morfema flexivo amalgama  
D) Alomorfo de género  
E) Lexema libre dependiente  

- **Resolución**: En los verbos conjugados, la desinencia que porta en una sola unidad indivisible los accidentes de tiempo, modo, persona y número es el **morfema flexivo amalgama**.
- **Clave Correcta**: **C**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El fenómeno morfofonológico del **alomorfo** da cuenta de la versatilidad de la lengua para manifestar una misma función de significado bajo distintos significantes contextuales. Señale la alternativa que presenta un conjunto de vocablos donde el prefijo negativo se manifiesta a través de sus **alomorfos** complementarios:
A) Deshacer, descoser, desatar  
B) Intolerante, improbable, ilegible  
C) Prefijado, preuniversitario, preescolar  
D) Reabrir, reconstruir, relanzar  
E) Subsuelo, subterráneo, suburbio  

- **Resolución**: El morfema derivativo que expresa negación o privación posee tres alomorfos condicionados por el punto articulatorio de la consonante siguiente:
  - `in-` ante la mayoría de consonantes (*in-tolerante*).
  - `im-` ante consonante bilabial /p/ o /b/ (*im-probable*).
  - `i-` ante consonante líquida /l/ o /r/ (*i-legible*, *i-real*).
  - La alternativa B contiene exactamente los tres alomorfos del prefijo negativo.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t04_s02_c01",
                    question = "La palabra 'blanquirrojo' se ha formado mediante el proceso de:",
                    options = listOf(
                        "Composición por yuxtaposición",
                        "Composición propiamente dicha",
                        "Parasíntesis",
                        "Derivación prefijal",
                    ),
                    correctIndex = 1,
                    explanation = "En 'blanquirrojo' se unen dos raíces (blanco + rojo) con modificación fonética de la primera (la 'o' muta a 'i'), configurando una composición propiamente dicha."
                ),
                Challenge(
                    id = "leng_t04_s02_c02",
                    question = "¿Cuál de las siguientes palabras ha sido creada mediante el mecanismo de composición por yuxtaposición?",
                    options = listOf(
                        "Maniobra",
                        "Agridulce",
                        "Desalmado",
                        "Sacapuntas",
                    ),
                    correctIndex = 3,
                    explanation = "En 'sacapuntas' se unen dos palabras completas (saca + puntas) sin alteración ortográfica ni fonética en sus bases."
                ),
                Challenge(
                    id = "leng_t04_s02_c03",
                    question = "La palabra 'quinceañero' es un ejemplo clásico de parasíntesis porque:",
                    options = listOf(
                        "Solo posee prefijos y sufijos",
                        "Proviene de un acortamiento léxico",
                        "Une dos lexemas y un sufijo de forma simultánea sin que existan formas aisladas intermedias",
                        "Se forma por imitación de un sonido natural",
                    ),
                    correctIndex = 2,
                    explanation = "En 'quinceañero' concurren dos raíces (quince + año) y un sufijo (-ero) sin que existan independientemente '*quinceaño' ni '*añero'."
                ),
                Challenge(
                    id = "leng_t04_s02_c04",
                    question = "La palabra 'desalmado' se considera parasintética por circunfijación debido a que:",
                    options = listOf(
                        "Se le puede quitar el prefijo y la palabra sigue existiendo",
                        "Proviene de la fusión de dos raíces griegas",
                        "El prefijo y el sufijo se añadieron de forma simultánea a la raíz (no existe '*desalma' ni '*almado')",
                        "Es una sigla lexicalizada",
                    ),
                    correctIndex = 2,
                    explanation = "En 'des-alm-ado', el prefijo 'des-' y el sufijo '-ado' se aplican simultáneamente a la raíz; al retirar cualquiera de ellos no queda una palabra con existencia léxica."
                ),
                Challenge(
                    id = "leng_t04_s02_c05",
                    question = "La palabra 'Sedapal' (Servicio de Agua Potable y Alcantarillado de Lima) constituye un claro ejemplo de:",
                    options = listOf(
                        "Sigla",
                        "Onomatopeya",
                        "Acrónimo",
                        "Acortamiento",
                    ),
                    correctIndex = 2,
                    explanation = "Un acrónimo se forma uniendo fragmentos o sílabas iniciales y finales de varias palabras formando un vocablo pronunciable de forma natural."
                ),
                Challenge(
                    id = "leng_t04_s02_c06",
                    question = "La reducción de palabras como 'fotografía' a 'foto' y 'bicicleta' a 'bici' corresponde al proceso de:",
                    options = listOf(
                        "Parasíntesis",
                        "Composición propia",
                        "Derivación regresiva",
                        "Acortamiento o truncamiento",
                    ),
                    correctIndex = 3,
                    explanation = "El acortamiento consiste en eliminar sílabas iniciales o finales de una palabra para hacerla más breve y económica sin cambiar su significado."
                ),
                Challenge(
                    id = "leng_t04_s02_c07",
                    question = "Palabras como 'tictac', 'quiquiriquí' y 'chasquido' se han formado mediante:",
                    options = listOf(
                        "Onomatopeya",
                        "Composición",
                        "Acronimia",
                        "Yuxtaposición",
                    ),
                    correctIndex = 0,
                    explanation = "La onomatopeya es la creación de palabras mediante la reproducción fonética aproximada de ruidos, golpes o sonidos de animales."
                ),
                Challenge(
                    id = "leng_t04_s02_c08",
                    question = "¿Cuál de las siguientes palabras se ha formado estrictamente por derivación mediante sufijación?",
                    options = listOf(
                        "Ropavejero",
                        "Bocacalle",
                        "Cocinero",
                        "Ciempiés",
                    ),
                    correctIndex = 2,
                    explanation = "'Cocinero' se forma a partir de la raíz 'cocin-' más el sufijo derivativo de oficio '-ero' (proceso de sufijación pura)."
                ),
                Challenge(
                    id = "leng_t04_s02_c09",
                    question = "En el vocablo 'ciempiés', la unión de 'cien' y 'pies' presenta una mutación ortográfica por la regla que exige escribir 'm' antes de 'p'. Esto constituye una:",
                    options = listOf(
                        "Composición por yuxtaposición",
                        "Composición propiamente dicha",
                        "Parasíntesis circunfija",
                        "Sigla derivada",
                    ),
                    correctIndex = 1,
                    explanation = "Al experimentar una alteración formal en su base (cien $\\rightarrow$ ciem), la unión de raíces constituye una composición propiamente dicha."
                ),
                Challenge(
                    id = "leng_t04_s02_c10",
                    question = "Las siglas como 'DNI', 'ONU' o 'FMI' se caracterizan fundamentalmente porque:",
                    options = listOf(
                        "Se leen como una palabra corrida mediante acronimia",
                        "Se componen de las letras iniciales de los términos y se deletrean habitualmente",
                        "Se crean exclusivamente mediante prefijos latinos",
                        "Son préstamos del quechua",
                    ),
                    correctIndex = 1,
                    explanation = "Las siglas se forman reuniendo las letras iniciales de los vocablos que componen un nombre institucional y suelen pronunciarse deletreándolas."
                ),
            )
        )
    )
}
