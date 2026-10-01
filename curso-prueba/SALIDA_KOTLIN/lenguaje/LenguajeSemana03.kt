package lenguaje

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object LenguajeSemana03 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "leng_t03_s01",
            title = "Fonología, Fonética, Sistema Fonológico y Estructura Silábica",
            theory = LessonTheory(
                title = "A. Fonología, Fonética y el Sistema Fonológico del Español",
                content = """# TEMA 03: FONOLOGÍA Y ORTOGRAFÍA

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. Fonología, Fonética y el Sistema Fonológico del Español
1. **Diferenciación Conceptual**:
   - **Fonología**: Estudia los **fonemas**, unidades mínimas distintivas, abstractas y psíquicas de la lengua. Se representan entre barras oblicuas: `/b/`, `/s/`, `/p/`. No tienen significado por sí mismos, pero permiten diferenciar significados en pares mínimos (*pala* vs. *bala*).
   - **Fonética**: Estudia los **alófonos y sonidos articulados**, unidades materiales, acústicas y fisiológicas del habla. Se representan entre corchetes: `[b]`, `[s]`.
2. **El Sistema Fonológico del Español**:
   - Posee **24 fonemas segmentales**:
     - **5 Fonemas Vocálicos**: `/a/`, `/e/`, `/i/`, `/o/`, `/u/`. Tienen salida libre del aire sin obstáculos en el tracto vocal y constituyen siempre el núcleo de la sílaba.
     - **19 Fonemas Consonánticos**: Se producen con obstrucción total o parcial de la columna de aire en la cavidad bucal.
3. **Clasificación de los Fonemas Vocálicos**:
   - *Por la Posición de la Lengua (Punto de articulación)*:
     - Anteriores: `/e/`, `/i/`
     - Central: `/a/`
     - Posteriores: `/o/`, `/u/`
   - *Por la Abertura de la Cavidad Bucal (Modo de articulación)*:
     - Abiertas / Bajas: `/a/`
     - Semiabiertas / Medias: `/e/`, `/o/`
     - Cerradas / Altas: `/i/`, `/u/`
4. **La Asimetría Fonema-Grafema (Desajuste entre Sonido y Escritura)**:
   - El alfabeto español consta de **27 letras o grafías** y **5 dígrafos** (*ch, ll, rr, gu, qu*).
   - *Polifonía*: Una misma grafía representa varios fonemas (ej. la letra *c* representa `/k/` en *casa* y `/s/` o `/\theta/` en *cena*).
   - *Poligrafía*: Un mismo fonema se escribe con diferentes grafías (ej. el fonema `/k/` se escribe con *c*, *k* o *qu*: *cama, kilo, queso*).
   - *Letra Muda*: La grafía *h* no representa ningún fonema en el español contemporáneo; la *u* en las combinaciones *gue, gui, que, qui* tampoco se pronuncia.

---



### B. La Sílaba y su Estructura Interna
La **sílaba** es la unidad fonológica mínima emitida en un solo golpe de voz:
- **Estructura de la Sílaba**:
  - **Cima (Vocal)**: Elemento obligatorio central. Contiene el **Núcleo silábico** (la vocal de mayor intensidad) y posibles vocales marginales.
  - **Ataque o Cabeza**: Consonante(s) que antecede(n) a la cima (posición prenuclear).
  - **Coda**: Consonante(s) que sigue(n) a la cima (posición posnuclear).
  - *Tipos de sílaba*:
    - **Sílaba Libre o Abierta**: Termina en vocal (carece de coda; ej. *pa-so*).
    - **Sílaba Trabada o Cerrada**: Termina en consonante (tiene coda; ej. *trans-por-tar*).

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Analice las siguientes proposiciones relativas al plano fonológico y fonético del español peruano:
I. El español cuenta con 24 fonemas segmentales y 27 grafías oficiales.
II. En la palabra *ahijado*, la presencia de la grafía muda *h* genera obligatoriamente un hiato acentual entre la vocal abierta y la cerrada.
III. Los fonemas son unidades mínimas abstractas provistas de significado léxico directo.
IV. En el vocablo *construíais*, se registra la coexistencia sucesiva de un diptongo homogéneo seguido inmediatamente de un hiato acentual y un diptongo creciente en la sílaba final.

Son formalmente **verdaderas**:
A) I y IV  
B) II y III  
C) I, II y IV  
D) Solo I  
E) Solo IV  

- **Resolución**:
  - I es Verdadera: El sistema fonológico del español estándar tiene exactamente 24 fonemas segmentales (5 vocálicos y 19 consonánticos) y 27 letras oficiales en el abecedario.
  - II es Falsa: En *ahi-ja-do*, la *h* no rompe el diptongo decreciente *ai*.
  - III es Falsa: Los fonemas son unidades distintivas pero **carentes de significado** propio (los que tienen significado son los monemas o morfemas).
  - IV es Falsa: *cons-tru-í-ais* contiene un hiato acentual (*u-í*) seguido de otro hiato (*í-ais*), no la secuencia descrita.
  - La única proposición estrictamente verdadera es la I.
- **Clave Correcta**: **D**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Fonema**: Unidad fonológica mínima abstracta y distintiva que permite diferenciar significados entre palabras.
2. **Grafema (Letra)**: Representación gráfica convencional y escrita de un fonema en el alfabeto.
3. **Alófono**: Variante acústica o de pronunciación contextual que adopta un fonema en el habla real.
4. **Diptongo**: Grupo homosilábico constituido por la unión de dos vocales pronunciadas en una misma sílaba.
5. **Hiato Acentual**: Separación silábica obligatoria provocada por la tilde robúrica sobre una vocal cerrada tónica contigua a una abierta.
6. **Triptongo**: Secuencia de tres vocales contiguas pronunciadas en una sola sílaba con la estructura cerrada-abierta-cerrada.
7. **Oxítona**: Palabra aguda cuya sílaba tónica se sitúa en la última posición silábica.
8. **Paroxítona**: Palabra grave o llana cuya sílaba tónica recae en la penúltima sílaba.
9. **Proparoxítona**: Palabra esdrújula cuya fuerza articulatoria reside en la antepenúltima sílaba.
10. **Tilde Diacrítica**: Tilde que permite discriminar la función gramatical y significado de palabras homófonas.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuántos fonemas y cuántas grafías oficiales tiene el idioma español?
  - *Reverso*: Tiene 24 fonemas segmentales (5 vocálicos y 19 consonánticos) y 27 grafías o letras en su alfabeto.

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la regla de oro del Hiato Acentual (tilde robúrica)?
  - *Reverso*: Si la vocal cerrada contigua a una abierta lleva la mayor fuerza de voz, SE TILDA SIEMPRE, sin importar las reglas de agudas o graves.

- **Flashcard 3**:
  - *Anverso*: ¿Cuáles son los únicos 8 monosílabos que pueden llevar tilde diacrítica?
  - *Reverso*: Él, Tú, Mí, Sí, Té, Dé, Sé, Más (monosílabos como *ti, vi, dio, fe, fue* no se tildan jamás).

- **Flashcard 4**:
  - *Anverso*: ¿Llevan tilde las palabras graves terminadas en doble consonante como 'bíceps'?
  - *Reverso*: Sí, las palabras graves terminadas en grupo consonántico se tildan obligatoriamente (*bíceps, cómics, tríceps*).

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE FONOLOGÍA Y ACENTUACIÓN

```
                              FONOLOGÍA Y ORTOGRAFÍA
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
   PLANO FÓNICO Y SILÁBICO                                         NORMATIVA DE ACENTUACIÓN
 (Fonemas, Grafías y Secuencias)                                     (Reglas Oficiales RAE)
         │                                                               │
 ┌───────┴───────┬───────────────┐                         ┌─────────────┴─────────────┐
 ▼               ▼               ▼                         ▼                           ▼
FONEMA / GRAFÍA SECUENCIAS      SÍLABA Y              TILDE GENERAL               TILDE ESPECIAL
• 24 Fonemas     VOCÁLICAS       ESTRUCTURA           • Agudas (Oxítonas):        • Diacrítica (8 monosílabos):
  (5 vocales,    • Diptongos:    • Ataque / Cabeza      Terminan en n, s, vocal     Él, Tú, Mí, Sí, Té,
   19 conson.)     Creciente,    • Cima (Núcleo)      • Graves (Paroxítonas):       Dé, Sé, Más
• 27 Grafemas      Decreciente,  • Coda                 NO terminan en n, s, vocal• Enfática:
• Asimetría        Homogéneo     • Sílaba abierta     • Esdrújulas y                Qué, Quién, Cuál, etc.
  Fonema-Letra   • Hiatos:         vs. trabada          Sobresdrújulas:           • Robúrica (Hiato acentual):
                   Simple y                             ¡Siempre se tildan!         VC tónica + VA átona
                   Acentual
```

---



### C. Secuencias Vocálicas: Diptongo, Triptongo y Hiato

#### 1. El Diptongo (Grupo Vocálico Homosilábico)
Es la unión de dos vocales que se pronuncian dentro de una **misma sílaba**. Se clasifican en:
- **Diptongo Creciente**: Vocal cerrada átona (VC) + Vocal abierta (VA):
  - Combinaciones: *ia, ie, io, ua, ue, uo*.
  - *Ejemplos*: *via-je*, *hie-rro*, *pio-jo*, *gua-nte*, *fue-go*, *cuo-ta*.
- **Diptongo Decreciente**: Vocal abierta (VA) + Vocal cerrada átona (VC):
  - Combinaciones: *ai, ei, oi, au, eu, ou*.
  - *Ejemplos*: *pai-sa-je*, *pei-ne*, *boi-na*, *cau-sa*, *deu-da*, *sou-fflé*.
- **Diptongo Homogéneo**: Vocal cerrada + Vocal cerrada distinta (iu, ui):
  - *Ejemplos*: *ciu-dad*, *cui-da-do*, *cons-trui-do*, *diur-no*.

#### 2. El Triptongo (Grupo Vocálico de Tres Vocales)
Unión de tres vocales en una misma sílaba bajo la estructura fija e inviolable:
\mathbf{VC \text{ (átona)} + VA \text{ (tónica o abierta)} + VC \text{ (átona)}}
- Si el acento cae sobre una de las vocales cerradas, se rompe el triptongo.
- La grafía *y* al final de sílaba tiene valor fónico de vocal `/i/` (*Uruguay, buey, huayno*).
- *Ejemplos*: *lim-piáis*, *a-ve-ri-güéis*, *huay-co*, *Pa-ra-guay*.

#### 3. El Hiato (Grupo Vocálico Heterosilábico)
Es la separación de dos vocales contiguas en **sílabas distintas**. Se divide en:
- **Hiato Simple o Formal**:
  - Separación de dos vocales abiertas contiguas (VA - VA): *po-e-ta*, *ca-os*, *te-a-tro*, *a-é-re-o*.
  - Separación de dos vocales cerradas idénticas (VC - VC): *ti-i-ta*, *chi-i-ta*, *du-un-vi-ra-to*, *o-dri-is-ta*.
- **Hiato Acentual, Acentuativo o Adiptongo (Ley de Tilde Robúrica o Disolvente)**:
  - Ocurre cuando concurren una vocal abierta y una vocal cerrada, y la **vocal cerrada lleva la mayor fuerza de voz (es tónica)**:
    \mathbf{V\acute{C} \text{ (tónica con tilde obligatoria)} - VA} \quad \text{o} \quad \mathbf{VA - V\acute{C} \text{ (tónica con tilde obligatoria)}}
  - **Regla de Oro**: La vocal cerrada tónica **SE TILDA SIEMPRE**, sin importar las reglas generales de agudas, graves o esdrújulas (rompe el diptongo).
  - *Ejemplos*: *sa-bí-a*, *ba-úl*, *ra-íz*, *o-í-do*, *grú-a*, *tí-o*, *con-ti-nú-o*, *bú-ho*.
- *Regla de la 'h' intermedia*: La presencia de una letra *h* intercalada entre dos vocales **no impide la formación de diptongos ni de hiatos** (*ahi-ja-do* tiene diptongo; *bú-ho*, *pro-hí-be*, *al-co-hol* tienen hiato).

---



### D. Acentuación General (Clasificación por la Posición del Acento)
- **Acento**: Rasgo prosódico que destaca una sílaba (tónica) frente a las demás (átonas).
- **Tilde**: Signo gráfico oblicuo (´) que se escribe sobre la vocal de la sílaba tónica según las normas de la RAE.

| Clase de Palabra | Posición de la Sílaba Tónica | Regla de Tildación General | Ejemplos Con Tilde | Ejemplos Sin Tilde |
| :--- | :--- | :--- | :--- | :--- |
| **Agudas (Oxítonas)** | **Última sílaba** | Se tildan cuando terminan en consonante **N**, **S** o **Vocal**. | *can-ción*, *com-pás*, *ru-bí*, *pa-pá*. | *re-loj*, *pa-pel*, *ver-dad*, *ro-bot*. |
| **Graves / Llanas (Paroxítonas)**| **Penúltima sílaba** | Se tildan cuando terminan en cualquier consonante que **NO sea N, S ni Vocal**. | *ár-bol*, *fé-lix*, *cás-ter*, *tó-rax*. | *can-to*, *jo-ven*, *cri-sis*, *me-sa*. |
| **Esdrújulas (Proparoxítonas)**| **Antepenúltima sílaba** | **¡SE TILDAN TODAS SIN EXCEPCIÓN!** | *plá-ta-no*, *brú-ju-la*, *mé-di-co*. | *(No existen esdrújulas sin tilde).* |
| **Sobresdrújulas (Preproparoxítonas)**| **Antes de la antepenúltima**| **¡SE TILDAN TODAS SIN EXCEPCIÓN!** (verbos + enclíticos)| *en-tré-ga-se-lo*, *dí-ga-me-lo*. | *(No existen sobresdrújulas sin tilde).* |

- *Casos Especiales de Graves*: Las palabras graves terminadas en doble consonante se tildan, aunque la última sea *s*: *bí-ceps*, *trí-ceps*, *fór-ceps*, *có-mics*.

---



## 4. CUADRO COMPARATIVO: DIPTONGO VS. HIATO

| Rasgo Distintivo | Diptongo | Hiato Simple | Hiato Acentual (Robúrico) |
| :--- | :--- | :--- | :--- |
| **Estructura vocálica**| VA + VC átona / VC + VA / VC + VC dist.| VA + VA / VC + VC iguales. | VA + V\acute{C} tónica / V\acute{C} tónica + VA.|
| **Comportamiento silábico**| Permanecen **en la misma sílaba**.| Se separan **en sílabas distintas**.| Se separan **en sílabas distintas**. |
| **Regla de tildación** | Sigue reglas generales de agudas/graves.| Sigue reglas generales de agudas/graves.| **Se tilda siempre la cerrada**, rompiendo la regla general. |
| **Ejemplos clave** | *cau-ce*, *pien-sa*, *triun-fo*. | *le-er*, *po-e-ma*, *a-or-ta*. | *ra-íz*, *ha-bí-a*, *bú-ho*, *pa-ís*. |

---



### Nemotecnia del Hiato Acentual:
> **"LA CERRADA CON FUERZA ROMPE LA SÍLABA Y LLEVA TILDE"**
- Si la débil (*i, u*) suena más fuerte que la fuerte (*a, e, o*), se corona con tilde disolvente: *Ma-rí-a*, *ba-úl*.

---



### E. Acentuación Especial

#### 1. La Tildación Diacrítica en Monosílabos
Sirve para diferenciar palabras que tienen la misma forma gramatical pero pertenecen a distintas categorías sintácticas. Según la RAE, **por regla general ningún monosílabo se tilda**, salvo únicamente **ocho (8) casos excepcionales**:

| Monosílabo Con Tilde (´) | Categoría y Ejemplo | Monosílabo Sin Tilde | Categoría y Ejemplo |
| :--- | :--- | :--- | :--- |
| **Él** | Pronombre personal: *"Él llegó tarde".* | **El** | Artículo definido: *"El libro azul".* |
| **Tú** | Pronombre personal: *"Tú tienes la razón".*| **Tu** | Adjetivo posesivo: *"Tu casa es amplia".* |
| **Mí** | Pronombre personal: *"Todo es para mí".* | **Mi** | Posesivo o nota: *"Mi cuaderno"*, *"Nota mi".* |
| **Sí** | Pronombre / Afirmación: *"Sí, volvió en sí".*| **Si** | Conjunción condicional o nota: *"Si estudias..."* |
| **Té** | Sustantivo (infusión): *"Sírveme un té caliente".*| **Te** | Pronombre personal: *"Te lo advertí ayer".* |
| **Dé** | Verbo dar: *"Ojalá me dé permiso".* | **De** | Preposición: *"Vaso de vidrio".* |
| **Sé** | Verbo ser o saber: *"Sé valiente; no lo sé".*| **Se** | Pronombre personal: *"Se marchó temprano".* |
| **Más** | Adverbio de cantidad: *"Quiero más café".* | **Mas** | Conjunción adversativa (= pero): *"Llegó, mas tarde".* |

- *Aclaraciones Cruciales de la RAE*:
  - La palabra **aún** lleva tilde cuando equivale al adverbio *"todavía"*; no se tilda (**aun**) cuando equivale a *"incluso, hasta o siquiera"*.
  - Las palabras **ti, vi, dio, fe, fue, fui, pan, bien, fin, ya** **NUNCA llevan tilde** bajo ninguna circunstancia.
  - La palabra **solo** y los pronombres demostrativos (**este, ese, aquel**) **NO llevan tilde**, incluso en casos de ambigüedad (reforma ortográfica RAE 2010).

#### 2. Tildación Enfática
Se aplica a los pronombres y adverbios interrogativos y exclamativos (**qué, quién, quiénes, cuál, cuáles, cómo, dónde, cuándo, cuánto**) cuando tienen sentido inquisitivo o de asombro directo o indirecto:
- *Interrogación directa*: *"¿Qué deseas almorzar?"*, *"¿Dónde vives?"*.
- *Interrogación indirecta*: *"Dime qué estás pensando"*, *"No sé cuándo volverá"*.
- *Forma relativa átona (sin tilde)*: *"El chico que vino"*, *"La casa donde nací"*, *"Comió cuanto pudo"*.

#### 3. Tildación de Palabras Compuestas
- **Palabras fusionadas en un solo vocablo**: El primer elemento pierde su tilde si la tenía, y el segundo se somete a las reglas generales (*décimo + séptimo = decimoséptimo*; *balón + pie = balompié*).
- **Palabras unidas por guion**: Cada término conserva su tilde independiente original según las reglas (*físico-químico*, *teórico-práctico*).
- **Adverbios terminados en -mente**: Conservan la tilde del adjetivo base original (*fácil + mente = fácilmente*; *suave + mente = suavemente*).

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En el verso del poeta canteño: *"El ciempiés huía velozmente por el césped sintético"*, se advierte la presencia de palabras compuestas y derivadas. Respecto a la acentuación gráfica de dichas palabras, se infiere con rigor normativo que:
A) *Ciempiés* no debe tildarse por ser una palabra monosilábica pura.  
B) *Huía* constituye un triptongo que carece de acento prosódico.  
C) *Velozmente* conserva la regla diacrítica de los adjetivos esdrújulos.  
D) *Velozmente* no lleva tilde porque el adjetivo base *veloz* es una palabra aguda que termina en *z*, manteniendo intacto su acento original.  
E) *Césped* lleva tilde robúrica disolvente de hiato.  

- **Resolución**: Las palabras compuestas con el sufijo *-mente* son ditónicas y conservan ortográficamente la tilde si y solo si el adjetivo base ya la llevaba de forma independiente (*fácil* \rightarrow *fácilmente*). Como el adjetivo *veloz* es una palabra aguda que termina en consonante *z*, no lleva tilde; por tanto, el adverbio derivado *velozmente* no debe tildarse.
- **Clave Correcta**: **D**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t03_s01_c01",
                    question = "La unidad mínima abstracta, mental y con función distintiva estudiada por la fonología se denomina:",
                    options = listOf(
                        "Morfema",
                        "Alófono",
                        "Grafema",
                        "Fonema"
                    ),
                    correctIndex = 3,
                    explanation = "El fonema es la unidad abstracta y mínima de la fonología capaz de distinguir significados entre pares de palabras."
                ),
                Challenge(
                    id = "leng_t03_s01_c02",
                    question = "El sistema fonológico del idioma castellano estándar está compuesto en total por:",
                    options = listOf(
                        "24 fonemas (5 vocálicos y 19 consonánticos)",
                        "27 fonemas y 5 dígrafos",
                        "29 fonemas segmentales",
                        "22 fonemas orales y 2 nasales"
                    ),
                    correctIndex = 0,
                    explanation = "El español cuenta con exactamente 24 fonemas segmentales: 5 vocálicos (/a, e, i, o, u/) y 19 consonánticos."
                ),
                Challenge(
                    id = "leng_t03_s01_c03",
                    question = "Por el modo de articulación (abertura de la cavidad bucal), las vocales /i/ y /u/ se clasifican como:",
                    options = listOf(
                        "Abiertas o bajas",
                        "Semiabiertas o medias",
                        "Cerradas o altas",
                        "Anteriores y planas"
                    ),
                    correctIndex = 2,
                    explanation = "Las vocales /i/ y /u/ exigen una mínima abertura de la cavidad bucal y elevación máxima de la lengua; por eso son vocales cerradas o altas."
                ),
                Challenge(
                    id = "leng_t03_s01_c04",
                    question = "En la palabra 'trans-porte', la primera sílaba 'trans' se clasifica estructuralmente como sílaba:",
                    options = listOf(
                        "Trabada o cerrada",
                        "Libre o abierta",
                        "Átona sin núcleo",
                        "Monofonemática"
                    ),
                    correctIndex = 0,
                    explanation = "La sílaba 'trans' termina en consonantes que ocupan la coda silábica (-ns); por terminar en consonante es una sílaba trabada o cerrada."
                ),
                Challenge(
                    id = "leng_t03_s01_c05",
                    question = "El hecho de que el fonema /k/ pueda representarse en la escritura mediante las letras 'c', 'k' y 'qu' es un fenómeno de:",
                    options = listOf(
                        "Poligrafía",
                        "Diftongación",
                        "Polifonía",
                        "Alomorfia"
                    ),
                    correctIndex = 0,
                    explanation = "La poligrafía ocurre cuando un único fonema se escribe con diferentes grafemas o letras según el contexto ortográfico."
                ),
                Challenge(
                    id = "leng_t03_s01_c06",
                    question = "En la estructura interna de una sílaba, el elemento obligatorio e imprescindible que constituye el núcleo es:",
                    options = listOf(
                        "El ataque complejo",
                        "La vocal de la cima",
                        "La cabeza compuesta",
                        "La coda consonántica"
                    ),
                    correctIndex = 1,
                    explanation = "En el idioma español, toda sílaba requiere obligatoriamente una vocal que ejerce el papel de núcleo en la cima silábica."
                ),
                Challenge(
                    id = "leng_t03_s01_c07",
                    question = "¿Cuál de las siguientes letras del alfabeto español carece por completo de correlato fonológico (es muda) en palabras como 'hoja' o 'humo'?",
                    options = listOf(
                        "La letra x",
                        "La letra h",
                        "La letra y",
                        "La letra z"
                    ),
                    correctIndex = 1,
                    explanation = "La grafía 'h' no representa ningún fonema segmental en la pronunciación del castellano contemporáneo."
                ),
                Challenge(
                    id = "leng_t03_s01_c08",
                    question = "Las vocales clasificadas como posteriores por la posición de la lengua en el tracto vocal son:",
                    options = listOf(
                        "/e/ y /i/",
                        "/a/ y /e/",
                        "/o/ y /u/",
                        "/i/ y /a/"
                    ),
                    correctIndex = 2,
                    explanation = "Las vocales /o/ y /u/ se articulan retrayendo el dorso de la lengua hacia la región posterior o velar de la cavidad bucal."
                ),
                Challenge(
                    id = "leng_t03_s01_c09",
                    question = "En la palabra 'pan', la consonante inicial 'p' y la consonante final 'n' cumplen respectivamente las funciones de:",
                    options = listOf(
                        "Cima y núcleo",
                        "Coda y ataque",
                        "Núcleo y margen",
                        "Ataque (cabeza) y coda"
                    ),
                    correctIndex = 3,
                    explanation = "La consonante prenuclear 'p' es el ataque o cabeza silábica, mientras que la consonante posnuclear 'n' actúa como coda."
                ),
                Challenge(
                    id = "leng_t03_s01_c10",
                    question = "La oposición de significado entre las palabras 'masa' y 'mesa' gracias al cambio de /a/ por /e/ demuestra que los fonemas poseen:",
                    options = listOf(
                        "Independencia sintáctica",
                        "Significado léxico intrínseco",
                        "Naturaleza fónica acústica",
                        "Función distintiva"
                    ),
                    correctIndex = 3,
                    explanation = "Los fonemas no tienen significado por sí mismos, pero cumplen función distintiva al permitir diferenciar significados en pares mínimos."
                )
            )
        ),
        LessonNode(
            id = "leng_t03_s02",
            title = "Secuencias Vocálicas: Diptongo, Triptongo y Hiato (Acentual y Simple)",
            theory = LessonTheory(
                title = "3. El Hiato (Grupo Vocálico Heterosilábico)",
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE FONOLOGÍA Y ACENTUACIÓN

```
                              FONOLOGÍA Y ORTOGRAFÍA
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
   PLANO FÓNICO Y SILÁBICO                                         NORMATIVA DE ACENTUACIÓN
 (Fonemas, Grafías y Secuencias)                                     (Reglas Oficiales RAE)
         │                                                               │
 ┌───────┴───────┬───────────────┐                         ┌─────────────┴─────────────┐
 ▼               ▼               ▼                         ▼                           ▼
FONEMA / GRAFÍA SECUENCIAS      SÍLABA Y              TILDE GENERAL               TILDE ESPECIAL
• 24 Fonemas     VOCÁLICAS       ESTRUCTURA           • Agudas (Oxítonas):        • Diacrítica (8 monosílabos):
  (5 vocales,    • Diptongos:    • Ataque / Cabeza      Terminan en n, s, vocal     Él, Tú, Mí, Sí, Té,
   19 conson.)     Creciente,    • Cima (Núcleo)      • Graves (Paroxítonas):       Dé, Sé, Más
• 27 Grafemas      Decreciente,  • Coda                 NO terminan en n, s, vocal• Enfática:
• Asimetría        Homogéneo     • Sílaba abierta     • Esdrújulas y                Qué, Quién, Cuál, etc.
  Fonema-Letra   • Hiatos:         vs. trabada          Sobresdrújulas:           • Robúrica (Hiato acentual):
                   Simple y                             ¡Siempre se tildan!         VC tónica + VA átona
                   Acentual
```

---



### C. Secuencias Vocálicas: Diptongo, Triptongo y Hiato

#### 1. El Diptongo (Grupo Vocálico Homosilábico)
Es la unión de dos vocales que se pronuncian dentro de una **misma sílaba**. Se clasifican en:
- **Diptongo Creciente**: Vocal cerrada átona (VC) + Vocal abierta (VA):
  - Combinaciones: *ia, ie, io, ua, ue, uo*.
  - *Ejemplos*: *via-je*, *hie-rro*, *pio-jo*, *gua-nte*, *fue-go*, *cuo-ta*.
- **Diptongo Decreciente**: Vocal abierta (VA) + Vocal cerrada átona (VC):
  - Combinaciones: *ai, ei, oi, au, eu, ou*.
  - *Ejemplos*: *pai-sa-je*, *pei-ne*, *boi-na*, *cau-sa*, *deu-da*, *sou-fflé*.
- **Diptongo Homogéneo**: Vocal cerrada + Vocal cerrada distinta (iu, ui):
  - *Ejemplos*: *ciu-dad*, *cui-da-do*, *cons-trui-do*, *diur-no*.

#### 2. El Triptongo (Grupo Vocálico de Tres Vocales)
Unión de tres vocales en una misma sílaba bajo la estructura fija e inviolable:
\mathbf{VC \text{ (átona)} + VA \text{ (tónica o abierta)} + VC \text{ (átona)}}
- Si el acento cae sobre una de las vocales cerradas, se rompe el triptongo.
- La grafía *y* al final de sílaba tiene valor fónico de vocal `/i/` (*Uruguay, buey, huayno*).
- *Ejemplos*: *lim-piáis*, *a-ve-ri-güéis*, *huay-co*, *Pa-ra-guay*.

#### 3. El Hiato (Grupo Vocálico Heterosilábico)
Es la separación de dos vocales contiguas en **sílabas distintas**. Se divide en:
- **Hiato Simple o Formal**:
  - Separación de dos vocales abiertas contiguas (VA - VA): *po-e-ta*, *ca-os*, *te-a-tro*, *a-é-re-o*.
  - Separación de dos vocales cerradas idénticas (VC - VC): *ti-i-ta*, *chi-i-ta*, *du-un-vi-ra-to*, *o-dri-is-ta*.
- **Hiato Acentual, Acentuativo o Adiptongo (Ley de Tilde Robúrica o Disolvente)**:
  - Ocurre cuando concurren una vocal abierta y una vocal cerrada, y la **vocal cerrada lleva la mayor fuerza de voz (es tónica)**:
    \mathbf{V\acute{C} \text{ (tónica con tilde obligatoria)} - VA} \quad \text{o} \quad \mathbf{VA - V\acute{C} \text{ (tónica con tilde obligatoria)}}
  - **Regla de Oro**: La vocal cerrada tónica **SE TILDA SIEMPRE**, sin importar las reglas generales de agudas, graves o esdrújulas (rompe el diptongo).
  - *Ejemplos*: *sa-bí-a*, *ba-úl*, *ra-íz*, *o-í-do*, *grú-a*, *tí-o*, *con-ti-nú-o*, *bú-ho*.
- *Regla de la 'h' intermedia*: La presencia de una letra *h* intercalada entre dos vocales **no impide la formación de diptongos ni de hiatos** (*ahi-ja-do* tiene diptongo; *bú-ho*, *pro-hí-be*, *al-co-hol* tienen hiato).

---



## 4. CUADRO COMPARATIVO: DIPTONGO VS. HIATO

| Rasgo Distintivo | Diptongo | Hiato Simple | Hiato Acentual (Robúrico) |
| :--- | :--- | :--- | :--- |
| **Estructura vocálica**| VA + VC átona / VC + VA / VC + VC dist.| VA + VA / VC + VC iguales. | VA + V\acute{C} tónica / V\acute{C} tónica + VA.|
| **Comportamiento silábico**| Permanecen **en la misma sílaba**.| Se separan **en sílabas distintas**.| Se separan **en sílabas distintas**. |
| **Regla de tildación** | Sigue reglas generales de agudas/graves.| Sigue reglas generales de agudas/graves.| **Se tilda siempre la cerrada**, rompiendo la regla general. |
| **Ejemplos clave** | *cau-ce*, *pien-sa*, *triun-fo*. | *le-er*, *po-e-ma*, *a-or-ta*. | *ra-íz*, *ha-bí-a*, *bú-ho*, *pa-ís*. |

---



### Nemotecnia del Hiato Acentual:
> **"LA CERRADA CON FUERZA ROMPE LA SÍLABA Y LLEVA TILDE"**
- Si la débil (*i, u*) suena más fuerte que la fuerte (*a, e, o*), se corona con tilde disolvente: *Ma-rí-a*, *ba-úl*.

---



### Nivel 1: Básico / Conteo de Secuencias Vocálicas
**Enunciado**: En la siguiente oración: *"El antiguo navío transportaba petróleo hacia la bahía"*, ¿cuántos diptongos y cuántos hiatos encontramos, respectivamente?
A) 2 diptongos y 3 hiatos  
B) 3 diptongos y 2 hiatos  
C) 4 diptongos y 2 hiatos  
D) 3 diptongos y 3 hiatos  
E) 2 diptongos y 2 hiatos  

- **Resolución**:
  - Silabeo: *El an-ti-**guo** (dip.) na-**ví-o** (hiato acent.) trans-por-ta-ba pe-**tró-le-o** (hiato simple) **ha-cia** (dip.) la ba-**hí-a** (hiato acent.)*.
  - Diptongos: *an-ti-guo* (*uo*), *ha-cia* (*ia*) \rightarrow **2 diptongos**.
  - Hiatos: *na-ví-o* (*í-o*), *pe-tró-le-o* (*e-o*), *ba-hí-a* (*í-a*) \rightarrow **3 hiatos**.
- **Clave Correcta**: **A**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Identifique la cantidad total de tildes omitidas en el siguiente párrafo:
> *"Aun no comprendo por que Raul se nego a entregarle el cuaderno a su tio Hector, mas confio en que el recapacitara pronto"*.

A) 5  
B) 6  
C) 7  
D) 8  
E) 9  

- **Resolución**:
  - *Aún* (todavía: 1)
  - *por qué* (interrogativa indirecta: 2)
  - *Raúl* (hiato acentual: 3)
  - *negó* (aguda terminada en vocal: 4)
  - *tío* (hiato acentual: 5)
  - *Héctor* (grave terminada en r: 6)
  - *mas* (sin tilde porque equivale a pero)
  - *él* (pronombre personal: 7)
  - *recapacitará* (aguda terminada en vocal: 8)
  - Total de tildes omitidas: **8**.
- **Clave Correcta**: **D**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: Analice las siguientes proposiciones relativas al plano fonológico y fonético del español peruano:
I. El español cuenta con 24 fonemas segmentales y 27 grafías oficiales.
II. En la palabra *ahijado*, la presencia de la grafía muda *h* genera obligatoriamente un hiato acentual entre la vocal abierta y la cerrada.
III. Los fonemas son unidades mínimas abstractas provistas de significado léxico directo.
IV. En el vocablo *construíais*, se registra la coexistencia sucesiva de un diptongo homogéneo seguido inmediatamente de un hiato acentual y un diptongo creciente en la sílaba final.

Son formalmente **verdaderas**:
A) I y IV  
B) II y III  
C) I, II y IV  
D) Solo I  
E) Solo IV  

- **Resolución**:
  - I es Verdadera: El sistema fonológico del español estándar tiene exactamente 24 fonemas segmentales (5 vocálicos y 19 consonánticos) y 27 letras oficiales en el abecedario.
  - II es Falsa: En *ahi-ja-do*, la *h* no rompe el diptongo decreciente *ai*.
  - III es Falsa: Los fonemas son unidades distintivas pero **carentes de significado** propio (los que tienen significado son los monemas o morfemas).
  - IV es Falsa: *cons-tru-í-ais* contiene un hiato acentual (*u-í*) seguido de otro hiato (*í-ais*), no la secuencia descrita.
  - La única proposición estrictamente verdadera es la I.
- **Clave Correcta**: **D**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Fonema**: Unidad fonológica mínima abstracta y distintiva que permite diferenciar significados entre palabras.
2. **Grafema (Letra)**: Representación gráfica convencional y escrita de un fonema en el alfabeto.
3. **Alófono**: Variante acústica o de pronunciación contextual que adopta un fonema en el habla real.
4. **Diptongo**: Grupo homosilábico constituido por la unión de dos vocales pronunciadas en una misma sílaba.
5. **Hiato Acentual**: Separación silábica obligatoria provocada por la tilde robúrica sobre una vocal cerrada tónica contigua a una abierta.
6. **Triptongo**: Secuencia de tres vocales contiguas pronunciadas en una sola sílaba con la estructura cerrada-abierta-cerrada.
7. **Oxítona**: Palabra aguda cuya sílaba tónica se sitúa en la última posición silábica.
8. **Paroxítona**: Palabra grave o llana cuya sílaba tónica recae en la penúltima sílaba.
9. **Proparoxítona**: Palabra esdrújula cuya fuerza articulatoria reside en la antepenúltima sílaba.
10. **Tilde Diacrítica**: Tilde que permite discriminar la función gramatical y significado de palabras homófonas.

---



### A. Fonología, Fonética y el Sistema Fonológico del Español
1. **Diferenciación Conceptual**:
   - **Fonología**: Estudia los **fonemas**, unidades mínimas distintivas, abstractas y psíquicas de la lengua. Se representan entre barras oblicuas: `/b/`, `/s/`, `/p/`. No tienen significado por sí mismos, pero permiten diferenciar significados en pares mínimos (*pala* vs. *bala*).
   - **Fonética**: Estudia los **alófonos y sonidos articulados**, unidades materiales, acústicas y fisiológicas del habla. Se representan entre corchetes: `[b]`, `[s]`.
2. **El Sistema Fonológico del Español**:
   - Posee **24 fonemas segmentales**:
     - **5 Fonemas Vocálicos**: `/a/`, `/e/`, `/i/`, `/o/`, `/u/`. Tienen salida libre del aire sin obstáculos en el tracto vocal y constituyen siempre el núcleo de la sílaba.
     - **19 Fonemas Consonánticos**: Se producen con obstrucción total o parcial de la columna de aire en la cavidad bucal.
3. **Clasificación de los Fonemas Vocálicos**:
   - *Por la Posición de la Lengua (Punto de articulación)*:
     - Anteriores: `/e/`, `/i/`
     - Central: `/a/`
     - Posteriores: `/o/`, `/u/`
   - *Por la Abertura de la Cavidad Bucal (Modo de articulación)*:
     - Abiertas / Bajas: `/a/`
     - Semiabiertas / Medias: `/e/`, `/o/`
     - Cerradas / Altas: `/i/`, `/u/`
4. **La Asimetría Fonema-Grafema (Desajuste entre Sonido y Escritura)**:
   - El alfabeto español consta de **27 letras o grafías** y **5 dígrafos** (*ch, ll, rr, gu, qu*).
   - *Polifonía*: Una misma grafía representa varios fonemas (ej. la letra *c* representa `/k/` en *casa* y `/s/` o `/\theta/` en *cena*).
   - *Poligrafía*: Un mismo fonema se escribe con diferentes grafías (ej. el fonema `/k/` se escribe con *c*, *k* o *qu*: *cama, kilo, queso*).
   - *Letra Muda*: La grafía *h* no representa ningún fonema en el español contemporáneo; la *u* en las combinaciones *gue, gui, que, qui* tampoco se pronuncia.

---



### B. La Sílaba y su Estructura Interna
La **sílaba** es la unidad fonológica mínima emitida en un solo golpe de voz:
- **Estructura de la Sílaba**:
  - **Cima (Vocal)**: Elemento obligatorio central. Contiene el **Núcleo silábico** (la vocal de mayor intensidad) y posibles vocales marginales.
  - **Ataque o Cabeza**: Consonante(s) que antecede(n) a la cima (posición prenuclear).
  - **Coda**: Consonante(s) que sigue(n) a la cima (posición posnuclear).
  - *Tipos de sílaba*:
    - **Sílaba Libre o Abierta**: Termina en vocal (carece de coda; ej. *pa-so*).
    - **Sílaba Trabada o Cerrada**: Termina en consonante (tiene coda; ej. *trans-por-tar*).

---



### D. Acentuación General (Clasificación por la Posición del Acento)
- **Acento**: Rasgo prosódico que destaca una sílaba (tónica) frente a las demás (átonas).
- **Tilde**: Signo gráfico oblicuo (´) que se escribe sobre la vocal de la sílaba tónica según las normas de la RAE.

| Clase de Palabra | Posición de la Sílaba Tónica | Regla de Tildación General | Ejemplos Con Tilde | Ejemplos Sin Tilde |
| :--- | :--- | :--- | :--- | :--- |
| **Agudas (Oxítonas)** | **Última sílaba** | Se tildan cuando terminan en consonante **N**, **S** o **Vocal**. | *can-ción*, *com-pás*, *ru-bí*, *pa-pá*. | *re-loj*, *pa-pel*, *ver-dad*, *ro-bot*. |
| **Graves / Llanas (Paroxítonas)**| **Penúltima sílaba** | Se tildan cuando terminan en cualquier consonante que **NO sea N, S ni Vocal**. | *ár-bol*, *fé-lix*, *cás-ter*, *tó-rax*. | *can-to*, *jo-ven*, *cri-sis*, *me-sa*. |
| **Esdrújulas (Proparoxítonas)**| **Antepenúltima sílaba** | **¡SE TILDAN TODAS SIN EXCEPCIÓN!** | *plá-ta-no*, *brú-ju-la*, *mé-di-co*. | *(No existen esdrújulas sin tilde).* |
| **Sobresdrújulas (Preproparoxítonas)**| **Antes de la antepenúltima**| **¡SE TILDAN TODAS SIN EXCEPCIÓN!** (verbos + enclíticos)| *en-tré-ga-se-lo*, *dí-ga-me-lo*. | *(No existen sobresdrújulas sin tilde).* |

- *Casos Especiales de Graves*: Las palabras graves terminadas en doble consonante se tildan, aunque la última sea *s*: *bí-ceps*, *trí-ceps*, *fór-ceps*, *có-mics*.

---



### E. Acentuación Especial

#### 1. La Tildación Diacrítica en Monosílabos
Sirve para diferenciar palabras que tienen la misma forma gramatical pero pertenecen a distintas categorías sintácticas. Según la RAE, **por regla general ningún monosílabo se tilda**, salvo únicamente **ocho (8) casos excepcionales**:

| Monosílabo Con Tilde (´) | Categoría y Ejemplo | Monosílabo Sin Tilde | Categoría y Ejemplo |
| :--- | :--- | :--- | :--- |
| **Él** | Pronombre personal: *"Él llegó tarde".* | **El** | Artículo definido: *"El libro azul".* |
| **Tú** | Pronombre personal: *"Tú tienes la razón".*| **Tu** | Adjetivo posesivo: *"Tu casa es amplia".* |
| **Mí** | Pronombre personal: *"Todo es para mí".* | **Mi** | Posesivo o nota: *"Mi cuaderno"*, *"Nota mi".* |
| **Sí** | Pronombre / Afirmación: *"Sí, volvió en sí".*| **Si** | Conjunción condicional o nota: *"Si estudias..."* |
| **Té** | Sustantivo (infusión): *"Sírveme un té caliente".*| **Te** | Pronombre personal: *"Te lo advertí ayer".* |
| **Dé** | Verbo dar: *"Ojalá me dé permiso".* | **De** | Preposición: *"Vaso de vidrio".* |
| **Sé** | Verbo ser o saber: *"Sé valiente; no lo sé".*| **Se** | Pronombre personal: *"Se marchó temprano".* |
| **Más** | Adverbio de cantidad: *"Quiero más café".* | **Mas** | Conjunción adversativa (= pero): *"Llegó, mas tarde".* |

- *Aclaraciones Cruciales de la RAE*:
  - La palabra **aún** lleva tilde cuando equivale al adverbio *"todavía"*; no se tilda (**aun**) cuando equivale a *"incluso, hasta o siquiera"*.
  - Las palabras **ti, vi, dio, fe, fue, fui, pan, bien, fin, ya** **NUNCA llevan tilde** bajo ninguna circunstancia.
  - La palabra **solo** y los pronombres demostrativos (**este, ese, aquel**) **NO llevan tilde**, incluso en casos de ambigüedad (reforma ortográfica RAE 2010).

#### 2. Tildación Enfática
Se aplica a los pronombres y adverbios interrogativos y exclamativos (**qué, quién, quiénes, cuál, cuáles, cómo, dónde, cuándo, cuánto**) cuando tienen sentido inquisitivo o de asombro directo o indirecto:
- *Interrogación directa*: *"¿Qué deseas almorzar?"*, *"¿Dónde vives?"*.
- *Interrogación indirecta*: *"Dime qué estás pensando"*, *"No sé cuándo volverá"*.
- *Forma relativa átona (sin tilde)*: *"El chico que vino"*, *"La casa donde nací"*, *"Comió cuanto pudo"*.

#### 3. Tildación de Palabras Compuestas
- **Palabras fusionadas en un solo vocablo**: El primer elemento pierde su tilde si la tenía, y el segundo se somete a las reglas generales (*décimo + séptimo = decimoséptimo*; *balón + pie = balompié*).
- **Palabras unidas por guion**: Cada término conserva su tilde independiente original según las reglas (*físico-químico*, *teórico-práctico*).
- **Adverbios terminados en -mente**: Conservan la tilde del adjetivo base original (*fácil + mente = fácilmente*; *suave + mente = suavemente*).

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa del pronombre 'Ti' y el verbo 'Fue'**:
   - *"Ti"* nunca jamás lleva tilde porque no existe un "ti" sin tilde con el cual confundirse.
   - *"Fue", "dio", "vio", "fe"* son monosílabos puros sin gemelo y **nunca llevan tilde**.
2. **Palabras con 'h' intercalada**:
   - La *h* no rompe diptongos (*prohi-bi-ción*) ni evita hiatos (*a-hín-co*).
3. **El diptongo homogéneo 'ui'**:
   - *Construido, jesuita, fluido, circuito* son diptongos graves terminados en vocal; por tanto, **NO llevan tilde**. Muchos alumnos tildan erróneamente *"construído"*.

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En el verso del poeta canteño: *"El ciempiés huía velozmente por el césped sintético"*, se advierte la presencia de palabras compuestas y derivadas. Respecto a la acentuación gráfica de dichas palabras, se infiere con rigor normativo que:
A) *Ciempiés* no debe tildarse por ser una palabra monosilábica pura.  
B) *Huía* constituye un triptongo que carece de acento prosódico.  
C) *Velozmente* conserva la regla diacrítica de los adjetivos esdrújulos.  
D) *Velozmente* no lleva tilde porque el adjetivo base *veloz* es una palabra aguda que termina en *z*, manteniendo intacto su acento original.  
E) *Césped* lleva tilde robúrica disolvente de hiato.  

- **Resolución**: Las palabras compuestas con el sufijo *-mente* son ditónicas y conservan ortográficamente la tilde si y solo si el adjetivo base ya la llevaba de forma independiente (*fácil* \rightarrow *fácilmente*). Como el adjetivo *veloz* es una palabra aguda que termina en consonante *z*, no lleva tilde; por tanto, el adverbio derivado *velozmente* no debe tildarse.
- **Clave Correcta**: **D**

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuántos fonemas y cuántas grafías oficiales tiene el idioma español?
  - *Reverso*: Tiene 24 fonemas segmentales (5 vocálicos y 19 consonánticos) y 27 grafías o letras en su alfabeto.

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la regla de oro del Hiato Acentual (tilde robúrica)?
  - *Reverso*: Si la vocal cerrada contigua a una abierta lleva la mayor fuerza de voz, SE TILDA SIEMPRE, sin importar las reglas de agudas o graves.

- **Flashcard 3**:
  - *Anverso*: ¿Cuáles son los únicos 8 monosílabos que pueden llevar tilde diacrítica?
  - *Reverso*: Él, Tú, Mí, Sí, Té, Dé, Sé, Más (monosílabos como *ti, vi, dio, fe, fue* no se tildan jamás).

- **Flashcard 4**:
  - *Anverso*: ¿Llevan tilde las palabras graves terminadas en doble consonante como 'bíceps'?
  - *Reverso*: Sí, las palabras graves terminadas en grupo consonántico se tildan obligatoriamente (*bíceps, cómics, tríceps*).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t03_s02_c01",
                    question = "La separación silábica de dos vocales contiguas en sílabas distintas se denomina formalmente:",
                    options = listOf(
                        "Hiato",
                        "Diptongo",
                        "Triptongo",
                        "Sinalefa"
                    ),
                    correctIndex = 0,
                    explanation = "El hiato es el fenómeno heterosilábico por el cual dos vocales consecutivas se pronuncian en sílabas diferentes."
                ),
                Challenge(
                    id = "leng_t03_s02_c02",
                    question = "En la palabra 'bú-ho', la presencia de la 'h' intercalada produce:",
                    options = listOf(
                        "La ruptura de la sílaba en hiato acentual",
                        "Un diptongo decreciente",
                        "Un triptongo irregular",
                        "Una sílaba trabada"
                    ),
                    correctIndex = 0,
                    explanation = "La 'h' no impide el hiato; al recaer la mayor fuerza de voz en la vocal cerrada 'ú', se produce hiato acentual con tilde robúrica."
                ),
                Challenge(
                    id = "leng_t03_s02_c03",
                    question = "¿Cuál de las siguientes palabras presenta exclusivamente un diptongo creciente?",
                    options = listOf(
                        "Pai-sa-je",
                        "Ciu-dad",
                        "Via-je",
                        "Pei-ne"
                    ),
                    correctIndex = 2,
                    explanation = "En 'via-je', la sílaba 'via' une una vocal cerrada átona (/i/) con una vocal abierta (/a/), formando un diptongo creciente."
                ),
                Challenge(
                    id = "leng_t03_s02_c04",
                    question = "La regla que exige colocar tilde sobre la vocal cerrada tónica cuando está junto a una vocal abierta recibe el nombre de:",
                    options = listOf(
                        "Tilde diacrítica",
                        "Tilde enfática",
                        "Tilde robúrica o disolvente",
                        "Tilde paroxítona"
                    ),
                    correctIndex = 2,
                    explanation = "La tilde robúrica o disolvente se coloca de manera obligatoria sobre la vocal cerrada que destruye el diptongo para formar hiato acentual."
                ),
                Challenge(
                    id = "leng_t03_s02_c05",
                    question = "La palabra 'Paraguay' contiene un triptongo porque cumple la estructura vocálica:",
                    options = listOf(
                        "VC átona + VA tónica + VC átona (representada por 'y')",
                        "VA + VC + VA",
                        "VC + VC + VA",
                        "Tres vocales abiertas en la misma sílaba"
                    ),
                    correctIndex = 0,
                    explanation = "En 'Pa-ra-guay', la sílaba final 'guay' une /u/ (VC) + /a/ (VA tónica) + /i/ (VC representada por la grafía 'y')."
                ),
                Challenge(
                    id = "leng_t03_s02_c06",
                    question = "¿Cuál de las siguientes palabras presenta un hiato simple por concurrencia de dos vocales abiertas?",
                    options = listOf(
                        "Tí-o",
                        "Rui-do",
                        "Fue-go",
                        "Ca-os"
                    ),
                    correctIndex = 3,
                    explanation = "En 'ca-os', las vocales /a/ y /o/ son abiertas; dos vocales abiertas contiguas se separan siempre en hiato simple."
                ),
                Challenge(
                    id = "leng_t03_s02_c07",
                    question = "En la palabra 'cui-da-do', la secuencia vocálica 'ui' forma un:",
                    options = listOf(
                        "Hiato simple",
                        "Diptongo homogéneo",
                        "Hiato acentual",
                        "Diptongo decreciente"
                    ),
                    correctIndex = 1,
                    explanation = "La combinación de dos vocales cerradas distintas (/i/ y /u/) constituye un diptongo homogéneo."
                ),
                Challenge(
                    id = "leng_t03_s02_c08",
                    question = "En la palabra 'ahijado' (ahi-ja-do), la concurrencia vocálica corresponde a un:",
                    options = listOf(
                        "Hiato acentual con tilde",
                        "Diptongo decreciente",
                        "Triptongo",
                        "Hiato simple de vocales abiertas"
                    ),
                    correctIndex = 1,
                    explanation = "En 'ahi-ja-do', la vocal abierta 'a' y la vocal cerrada átona 'i' forman un diptongo decreciente a pesar de la 'h' intermedia."
                ),
                Challenge(
                    id = "leng_t03_s02_c09",
                    question = "¿Cuántos hiatos acentuales contiene la oración 'Raúl tenía un baúl de recuerdos en su habitación'?",
                    options = listOf(
                        "4",
                        "3",
                        "1",
                        "2"
                    ),
                    correctIndex = 1,
                    explanation = "Los hiatos acentuales son tres: Ra-úl, te-ní-a y ba-úl. ('habitación' tiene diptongo creciente ión)."
                ),
                Challenge(
                    id = "leng_t03_s02_c10",
                    question = "La separación de dos vocales cerradas idénticas en palabras como 'chi-i-ta' o 'o-dri-is-ta' constituye un:",
                    options = listOf(
                        "Diptongo homogéneo",
                        "Hiato acentual obligatorio",
                        "Hiato simple",
                        "Triptongo duplicado"
                    ),
                    correctIndex = 2,
                    explanation = "Dos vocales cerradas exactamente idénticas contiguas (ii, uu) se pronuncian en sílabas distintas formando un hiato simple."
                )
            )
        ),
        LessonNode(
            id = "leng_t03_s03",
            title = "Normativa de Acentuación General, Diacrítica y Enfática",
            theory = LessonTheory(
                title = "3. El Hiato (Grupo Vocálico Heterosilábico)",
                content = """## 2. MAPA CONCEPTUAL Y ÁRBOL DE FONOLOGÍA Y ACENTUACIÓN

```
                              FONOLOGÍA Y ORTOGRAFÍA
                                         │
         ┌───────────────────────────────┴───────────────────────────────┐
         ▼                                                               ▼
   PLANO FÓNICO Y SILÁBICO                                         NORMATIVA DE ACENTUACIÓN
 (Fonemas, Grafías y Secuencias)                                     (Reglas Oficiales RAE)
         │                                                               │
 ┌───────┴───────┬───────────────┐                         ┌─────────────┴─────────────┐
 ▼               ▼               ▼                         ▼                           ▼
FONEMA / GRAFÍA SECUENCIAS      SÍLABA Y              TILDE GENERAL               TILDE ESPECIAL
• 24 Fonemas     VOCÁLICAS       ESTRUCTURA           • Agudas (Oxítonas):        • Diacrítica (8 monosílabos):
  (5 vocales,    • Diptongos:    • Ataque / Cabeza      Terminan en n, s, vocal     Él, Tú, Mí, Sí, Té,
   19 conson.)     Creciente,    • Cima (Núcleo)      • Graves (Paroxítonas):       Dé, Sé, Más
• 27 Grafemas      Decreciente,  • Coda                 NO terminan en n, s, vocal• Enfática:
• Asimetría        Homogéneo     • Sílaba abierta     • Esdrújulas y                Qué, Quién, Cuál, etc.
  Fonema-Letra   • Hiatos:         vs. trabada          Sobresdrújulas:           • Robúrica (Hiato acentual):
                   Simple y                             ¡Siempre se tildan!         VC tónica + VA átona
                   Acentual
```

---



### D. Acentuación General (Clasificación por la Posición del Acento)
- **Acento**: Rasgo prosódico que destaca una sílaba (tónica) frente a las demás (átonas).
- **Tilde**: Signo gráfico oblicuo (´) que se escribe sobre la vocal de la sílaba tónica según las normas de la RAE.

| Clase de Palabra | Posición de la Sílaba Tónica | Regla de Tildación General | Ejemplos Con Tilde | Ejemplos Sin Tilde |
| :--- | :--- | :--- | :--- | :--- |
| **Agudas (Oxítonas)** | **Última sílaba** | Se tildan cuando terminan en consonante **N**, **S** o **Vocal**. | *can-ción*, *com-pás*, *ru-bí*, *pa-pá*. | *re-loj*, *pa-pel*, *ver-dad*, *ro-bot*. |
| **Graves / Llanas (Paroxítonas)**| **Penúltima sílaba** | Se tildan cuando terminan en cualquier consonante que **NO sea N, S ni Vocal**. | *ár-bol*, *fé-lix*, *cás-ter*, *tó-rax*. | *can-to*, *jo-ven*, *cri-sis*, *me-sa*. |
| **Esdrújulas (Proparoxítonas)**| **Antepenúltima sílaba** | **¡SE TILDAN TODAS SIN EXCEPCIÓN!** | *plá-ta-no*, *brú-ju-la*, *mé-di-co*. | *(No existen esdrújulas sin tilde).* |
| **Sobresdrújulas (Preproparoxítonas)**| **Antes de la antepenúltima**| **¡SE TILDAN TODAS SIN EXCEPCIÓN!** (verbos + enclíticos)| *en-tré-ga-se-lo*, *dí-ga-me-lo*. | *(No existen sobresdrújulas sin tilde).* |

- *Casos Especiales de Graves*: Las palabras graves terminadas en doble consonante se tildan, aunque la última sea *s*: *bí-ceps*, *trí-ceps*, *fór-ceps*, *có-mics*.

---



### E. Acentuación Especial

#### 1. La Tildación Diacrítica en Monosílabos
Sirve para diferenciar palabras que tienen la misma forma gramatical pero pertenecen a distintas categorías sintácticas. Según la RAE, **por regla general ningún monosílabo se tilda**, salvo únicamente **ocho (8) casos excepcionales**:

| Monosílabo Con Tilde (´) | Categoría y Ejemplo | Monosílabo Sin Tilde | Categoría y Ejemplo |
| :--- | :--- | :--- | :--- |
| **Él** | Pronombre personal: *"Él llegó tarde".* | **El** | Artículo definido: *"El libro azul".* |
| **Tú** | Pronombre personal: *"Tú tienes la razón".*| **Tu** | Adjetivo posesivo: *"Tu casa es amplia".* |
| **Mí** | Pronombre personal: *"Todo es para mí".* | **Mi** | Posesivo o nota: *"Mi cuaderno"*, *"Nota mi".* |
| **Sí** | Pronombre / Afirmación: *"Sí, volvió en sí".*| **Si** | Conjunción condicional o nota: *"Si estudias..."* |
| **Té** | Sustantivo (infusión): *"Sírveme un té caliente".*| **Te** | Pronombre personal: *"Te lo advertí ayer".* |
| **Dé** | Verbo dar: *"Ojalá me dé permiso".* | **De** | Preposición: *"Vaso de vidrio".* |
| **Sé** | Verbo ser o saber: *"Sé valiente; no lo sé".*| **Se** | Pronombre personal: *"Se marchó temprano".* |
| **Más** | Adverbio de cantidad: *"Quiero más café".* | **Mas** | Conjunción adversativa (= pero): *"Llegó, mas tarde".* |

- *Aclaraciones Cruciales de la RAE*:
  - La palabra **aún** lleva tilde cuando equivale al adverbio *"todavía"*; no se tilda (**aun**) cuando equivale a *"incluso, hasta o siquiera"*.
  - Las palabras **ti, vi, dio, fe, fue, fui, pan, bien, fin, ya** **NUNCA llevan tilde** bajo ninguna circunstancia.
  - La palabra **solo** y los pronombres demostrativos (**este, ese, aquel**) **NO llevan tilde**, incluso en casos de ambigüedad (reforma ortográfica RAE 2010).

#### 2. Tildación Enfática
Se aplica a los pronombres y adverbios interrogativos y exclamativos (**qué, quién, quiénes, cuál, cuáles, cómo, dónde, cuándo, cuánto**) cuando tienen sentido inquisitivo o de asombro directo o indirecto:
- *Interrogación directa*: *"¿Qué deseas almorzar?"*, *"¿Dónde vives?"*.
- *Interrogación indirecta*: *"Dime qué estás pensando"*, *"No sé cuándo volverá"*.
- *Forma relativa átona (sin tilde)*: *"El chico que vino"*, *"La casa donde nací"*, *"Comió cuanto pudo"*.

#### 3. Tildación de Palabras Compuestas
- **Palabras fusionadas en un solo vocablo**: El primer elemento pierde su tilde si la tenía, y el segundo se somete a las reglas generales (*décimo + séptimo = decimoséptimo*; *balón + pie = balompié*).
- **Palabras unidas por guion**: Cada término conserva su tilde independiente original según las reglas (*físico-químico*, *teórico-práctico*).
- **Adverbios terminados en -mente**: Conservan la tilde del adjetivo base original (*fácil + mente = fácilmente*; *suave + mente = suavemente*).

---



### Nemotecnia de los 8 Monosílabos Diacríticos:
> **"ÉL TÚ MÍ SÍ TÉ DÉ SÉ MÁS"**
- *El pronombre:* **Él** vino por **mí** y por **ti** (*¡ojo, ti no se tilda jamás!*).
- *El ruego:* **Tú** **sé** bueno y **dé** **más** **té**, **sí**.



### Nemotecnia del Hiato Acentual:
> **"LA CERRADA CON FUERZA ROMPE LA SÍLABA Y LLEVA TILDE"**
- Si la débil (*i, u*) suena más fuerte que la fuerte (*a, e, o*), se corona con tilde disolvente: *Ma-rí-a*, *ba-úl*.

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **La trampa del pronombre 'Ti' y el verbo 'Fue'**:
   - *"Ti"* nunca jamás lleva tilde porque no existe un "ti" sin tilde con el cual confundirse.
   - *"Fue", "dio", "vio", "fe"* son monosílabos puros sin gemelo y **nunca llevan tilde**.
2. **Palabras con 'h' intercalada**:
   - La *h* no rompe diptongos (*prohi-bi-ción*) ni evita hiatos (*a-hín-co*).
3. **El diptongo homogéneo 'ui'**:
   - *Construido, jesuita, fluido, circuito* son diptongos graves terminados en vocal; por tanto, **NO llevan tilde**. Muchos alumnos tildan erróneamente *"construído"*.

---



### Nivel 2: Intermedio / Tildación Diacrítica
**Enunciado**: Señale la alternativa que presenta un uso ortográficamente **correcto** de la tilde diacrítica según la normativa de la RAE:
A) A mí no me dió ninguna explicación de su renuncia.  
B) Sé prudente y dile que te dé más tiempo para responder.  
C) Si vienes temprano, te invitaré una taza de té de menta para tí.  
D) Aquél alumno sólo trajo fé y esperanza a la prueba.  
E) Tú hermano me dijo qué vendría más tarde con el doctor.  

- **Resolución**:
  - En B: *Sé* (verbo ser), *dé* (verbo dar) y *más* (adverbio de cantidad) están correctamente tildados.
  - En A: *dió* no se tilda jamás.
  - En C: *tí* no se tilda jamás.
  - En D: *Aquél* y *sólo* no llevan tilde según la RAE 2010; *fé* nunca se tildó.
  - En E: *Tú* debió ser posesivo (*Tu*) y *qué* es relativo átono (*que*).
- **Clave Correcta**: **B**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Identifique la cantidad total de tildes omitidas en el siguiente párrafo:
> *"Aun no comprendo por que Raul se nego a entregarle el cuaderno a su tio Hector, mas confio en que el recapacitara pronto"*.

A) 5  
B) 6  
C) 7  
D) 8  
E) 9  

- **Resolución**:
  - *Aún* (todavía: 1)
  - *por qué* (interrogativa indirecta: 2)
  - *Raúl* (hiato acentual: 3)
  - *negó* (aguda terminada en vocal: 4)
  - *tío* (hiato acentual: 5)
  - *Héctor* (grave terminada en r: 6)
  - *mas* (sin tilde porque equivale a pero)
  - *él* (pronombre personal: 7)
  - *recapacitará* (aguda terminada en vocal: 8)
  - Total de tildes omitidas: **8**.
- **Clave Correcta**: **D**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En el verso del poeta canteño: *"El ciempiés huía velozmente por el césped sintético"*, se advierte la presencia de palabras compuestas y derivadas. Respecto a la acentuación gráfica de dichas palabras, se infiere con rigor normativo que:
A) *Ciempiés* no debe tildarse por ser una palabra monosilábica pura.  
B) *Huía* constituye un triptongo que carece de acento prosódico.  
C) *Velozmente* conserva la regla diacrítica de los adjetivos esdrújulos.  
D) *Velozmente* no lleva tilde porque el adjetivo base *veloz* es una palabra aguda que termina en *z*, manteniendo intacto su acento original.  
E) *Césped* lleva tilde robúrica disolvente de hiato.  

- **Resolución**: Las palabras compuestas con el sufijo *-mente* son ditónicas y conservan ortográficamente la tilde si y solo si el adjetivo base ya la llevaba de forma independiente (*fácil* \rightarrow *fácilmente*). Como el adjetivo *veloz* es una palabra aguda que termina en consonante *z*, no lleva tilde; por tanto, el adverbio derivado *velozmente* no debe tildarse.
- **Clave Correcta**: **D**

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuántos fonemas y cuántas grafías oficiales tiene el idioma español?
  - *Reverso*: Tiene 24 fonemas segmentales (5 vocálicos y 19 consonánticos) y 27 grafías o letras en su alfabeto.

- **Flashcard 2**:
  - *Anverso*: ¿Cuál es la regla de oro del Hiato Acentual (tilde robúrica)?
  - *Reverso*: Si la vocal cerrada contigua a una abierta lleva la mayor fuerza de voz, SE TILDA SIEMPRE, sin importar las reglas de agudas o graves.

- **Flashcard 3**:
  - *Anverso*: ¿Cuáles son los únicos 8 monosílabos que pueden llevar tilde diacrítica?
  - *Reverso*: Él, Tú, Mí, Sí, Té, Dé, Sé, Más (monosílabos como *ti, vi, dio, fe, fue* no se tildan jamás).

- **Flashcard 4**:
  - *Anverso*: ¿Llevan tilde las palabras graves terminadas en doble consonante como 'bíceps'?
  - *Reverso*: Sí, las palabras graves terminadas en grupo consonántico se tildan obligatoriamente (*bíceps, cómics, tríceps*).

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS LINGÜÍSTICOS
1. **Fonema**: Unidad fonológica mínima abstracta y distintiva que permite diferenciar significados entre palabras.
2. **Grafema (Letra)**: Representación gráfica convencional y escrita de un fonema en el alfabeto.
3. **Alófono**: Variante acústica o de pronunciación contextual que adopta un fonema en el habla real.
4. **Diptongo**: Grupo homosilábico constituido por la unión de dos vocales pronunciadas en una misma sílaba.
5. **Hiato Acentual**: Separación silábica obligatoria provocada por la tilde robúrica sobre una vocal cerrada tónica contigua a una abierta.
6. **Triptongo**: Secuencia de tres vocales contiguas pronunciadas en una sola sílaba con la estructura cerrada-abierta-cerrada.
7. **Oxítona**: Palabra aguda cuya sílaba tónica se sitúa en la última posición silábica.
8. **Paroxítona**: Palabra grave o llana cuya sílaba tónica recae en la penúltima sílaba.
9. **Proparoxítona**: Palabra esdrújula cuya fuerza articulatoria reside en la antepenúltima sílaba.
10. **Tilde Diacrítica**: Tilde que permite discriminar la función gramatical y significado de palabras homófonas.

---



### C. Secuencias Vocálicas: Diptongo, Triptongo y Hiato

#### 1. El Diptongo (Grupo Vocálico Homosilábico)
Es la unión de dos vocales que se pronuncian dentro de una **misma sílaba**. Se clasifican en:
- **Diptongo Creciente**: Vocal cerrada átona (VC) + Vocal abierta (VA):
  - Combinaciones: *ia, ie, io, ua, ue, uo*.
  - *Ejemplos*: *via-je*, *hie-rro*, *pio-jo*, *gua-nte*, *fue-go*, *cuo-ta*.
- **Diptongo Decreciente**: Vocal abierta (VA) + Vocal cerrada átona (VC):
  - Combinaciones: *ai, ei, oi, au, eu, ou*.
  - *Ejemplos*: *pai-sa-je*, *pei-ne*, *boi-na*, *cau-sa*, *deu-da*, *sou-fflé*.
- **Diptongo Homogéneo**: Vocal cerrada + Vocal cerrada distinta (iu, ui):
  - *Ejemplos*: *ciu-dad*, *cui-da-do*, *cons-trui-do*, *diur-no*.

#### 2. El Triptongo (Grupo Vocálico de Tres Vocales)
Unión de tres vocales en una misma sílaba bajo la estructura fija e inviolable:
\mathbf{VC \text{ (átona)} + VA \text{ (tónica o abierta)} + VC \text{ (átona)}}
- Si el acento cae sobre una de las vocales cerradas, se rompe el triptongo.
- La grafía *y* al final de sílaba tiene valor fónico de vocal `/i/` (*Uruguay, buey, huayno*).
- *Ejemplos*: *lim-piáis*, *a-ve-ri-güéis*, *huay-co*, *Pa-ra-guay*.

#### 3. El Hiato (Grupo Vocálico Heterosilábico)
Es la separación de dos vocales contiguas en **sílabas distintas**. Se divide en:
- **Hiato Simple o Formal**:
  - Separación de dos vocales abiertas contiguas (VA - VA): *po-e-ta*, *ca-os*, *te-a-tro*, *a-é-re-o*.
  - Separación de dos vocales cerradas idénticas (VC - VC): *ti-i-ta*, *chi-i-ta*, *du-un-vi-ra-to*, *o-dri-is-ta*.
- **Hiato Acentual, Acentuativo o Adiptongo (Ley de Tilde Robúrica o Disolvente)**:
  - Ocurre cuando concurren una vocal abierta y una vocal cerrada, y la **vocal cerrada lleva la mayor fuerza de voz (es tónica)**:
    \mathbf{V\acute{C} \text{ (tónica con tilde obligatoria)} - VA} \quad \text{o} \quad \mathbf{VA - V\acute{C} \text{ (tónica con tilde obligatoria)}}
  - **Regla de Oro**: La vocal cerrada tónica **SE TILDA SIEMPRE**, sin importar las reglas generales de agudas, graves o esdrújulas (rompe el diptongo).
  - *Ejemplos*: *sa-bí-a*, *ba-úl*, *ra-íz*, *o-í-do*, *grú-a*, *tí-o*, *con-ti-nú-o*, *bú-ho*.
- *Regla de la 'h' intermedia*: La presencia de una letra *h* intercalada entre dos vocales **no impide la formación de diptongos ni de hiatos** (*ahi-ja-do* tiene diptongo; *bú-ho*, *pro-hí-be*, *al-co-hol* tienen hiato).

---



## 4. CUADRO COMPARATIVO: DIPTONGO VS. HIATO

| Rasgo Distintivo | Diptongo | Hiato Simple | Hiato Acentual (Robúrico) |
| :--- | :--- | :--- | :--- |
| **Estructura vocálica**| VA + VC átona / VC + VA / VC + VC dist.| VA + VA / VC + VC iguales. | VA + V\acute{C} tónica / V\acute{C} tónica + VA.|
| **Comportamiento silábico**| Permanecen **en la misma sílaba**.| Se separan **en sílabas distintas**.| Se separan **en sílabas distintas**. |
| **Regla de tildación** | Sigue reglas generales de agudas/graves.| Sigue reglas generales de agudas/graves.| **Se tilda siempre la cerrada**, rompiendo la regla general. |
| **Ejemplos clave** | *cau-ce*, *pien-sa*, *triun-fo*. | *le-er*, *po-e-ma*, *a-or-ta*. | *ra-íz*, *ha-bí-a*, *bú-ho*, *pa-ís*. |

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t03_s03_c01",
                    question = "¿En cuál de las siguientes opciones el monosílabo 'si' debe llevar tilde diacrítica?",
                    options = listOf(
                        "Si vienes temprano, almorzaremos juntos.",
                        "Él dio el si definitivo ante el altar.",
                        "La sonata está compuesta en si menor.",
                        "Pregúntale si vendrá a la reunión de estudio."
                    ),
                    correctIndex = 1,
                    explanation = "En 'Él dio el sí definitivo', la palabra 'sí' funciona como sustantivo de afirmación o consentimiento; por tanto, lleva tilde diacrítica obligatoria."
                ),
                Challenge(
                    id = "leng_t03_s03_c02",
                    question = "La palabra 'bíceps' es grave pero lleva tilde gráfica obligatoria porque:",
                    options = listOf(
                        "Es una excepción RAE para palabras graves terminadas en grupo consonántico",
                        "Termina en vocal acentuada",
                        "Posee hiato acentual disolvente",
                        "Es un monosílabo con tilde diacrítica"
                    ),
                    correctIndex = 0,
                    explanation = "Las palabras graves terminadas en doble consonante se tildan por norma RAE, aunque la última letra sea 's' (bíceps, fórceps, cómics)."
                ),
                Challenge(
                    id = "leng_t03_s03_c03",
                    question = "El monosílabo 'de' lleva tilde diacrítica cuando funciona gramaticalmente como:",
                    options = listOf(
                        "Preposición que indica posesión",
                        "Conjunción adversativa subordinada",
                        "Forma conjugada del verbo dar",
                        "Pronombre personal átono"
                    ),
                    correctIndex = 2,
                    explanation = "El monosílabo 'dé' lleva tilde diacrítica cuando corresponde a una forma conjugada del verbo dar ('Ojalá me dé permiso')."
                ),
                Challenge(
                    id = "leng_t03_s03_c04",
                    question = "¿Cuál de las siguientes palabras jamás debe tildarse bajo ninguna circunstancia según la RAE?",
                    options = listOf(
                        "Té",
                        "Dé",
                        "Sé",
                        "Ti"
                    ),
                    correctIndex = 3,
                    explanation = "El pronombre 'ti' es siempre tónico y nunca se confunde con otra categoría gramatical; la RAE prohíbe tildarlo en cualquier caso."
                ),
                Challenge(
                    id = "leng_t03_s03_c05",
                    question = "En la oración 'Estudió con gran dedicación, mas no logró la vacante', la palabra 'mas' no lleva tilde porque:",
                    options = listOf(
                        "Es un adverbio de cantidad",
                        "Es una preposición de enlace",
                        "Funciona como pronombre relativo",
                        "Es una conjunción adversativa equivalente a 'pero'"
                    ),
                    correctIndex = 3,
                    explanation = "El monosílabo 'mas' se escribe sin tilde cuando funciona como conjunción adversativa equivalente a 'pero'."
                ),
                Challenge(
                    id = "leng_t03_s03_c06",
                    question = "La palabra 'aún' debe tildarse obligatoriamente cuando puede sustituirse por el adverbio:",
                    options = listOf(
                        "Todavía",
                        "Incluso",
                        "Hasta",
                        "Siquiera"
                    ),
                    correctIndex = 0,
                    explanation = "'Aún' lleva tilde cuando es palabra bisílaba tónica equivalente al adverbio 'todavía' ('Aún no ha llegado el docente')."
                ),
                Challenge(
                    id = "leng_t03_s03_c07",
                    question = "¿Cuál es la regla ortográfica que rige a las palabras esdrújulas y sobresdrújulas en el idioma español?",
                    options = listOf(
                        "Solo se tildan cuando terminan en N, S o vocal",
                        "Nunca llevan tilde gráfica",
                        "Se tildan todas obligatoriamente sin excepción alguna",
                        "Solo se tildan si no contienen hiato"
                    ),
                    correctIndex = 2,
                    explanation = "Todas las palabras esdrújulas y sobresdrújulas se tildan obligatoriamente en el idioma castellano sin ninguna excepción."
                ),
                Challenge(
                    id = "leng_t03_s03_c08",
                    question = "En la frase interrogativa indirecta 'Dime con quién andas y te diré quién eres', los vocablos 'quién' se tildan por:",
                    options = listOf(
                        "Tildación diacrítica",
                        "Tildación enfática",
                        "Tildación robúrica",
                        "Regla general de palabras agudas"
                    ),
                    correctIndex = 1,
                    explanation = "La tilde enfática se coloca sobre pronombres interrogativos en oraciones interrogativas indirectas para preservar su fuerza expresiva."
                ),
                Challenge(
                    id = "leng_t03_s03_c09",
                    question = "¿Cuál de los siguientes grupos de monosílabos carece por completo de tilde según la normativa vigente de la RAE?",
                    options = listOf(
                        "Él, tú, mí, sí",
                        "Té, dé, sé, más",
                        "Qué, cuál, quién, cómo",
                        "Fe, fue, dio, vio"
                    ),
                    correctIndex = 3,
                    explanation = "Los monosílabos 'fe', 'fue', 'dio', 'vio', 'fui' no tienen pareja átona formalmente ambigua y jamás llevan tilde."
                ),
                Challenge(
                    id = "leng_t03_s03_c10",
                    question = "La palabra 'examen' no lleva tilde por ser grave terminada en n, pero su plural 'exámenes' sí se tilda porque:",
                    options = listOf(
                        "Lleva tilde diacrítica obligatoria",
                        "Se convierte en palabra esdrújula",
                        "Se convierte en palabra aguda",
                        "Sufre hiato acentual"
                    ),
                    correctIndex = 1,
                    explanation = "Al pluralizarse, el acento se mantiene en la misma sílaba y la palabra pasa a ser esdrújula (exá-me-nes), tildándose sin excepción."
                )
            )
        )
    )
}
