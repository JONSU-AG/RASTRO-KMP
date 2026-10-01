package lenguaje

object LenguajeSemana08 {

    val lessons = listOf(
        LessonNode(
            id = "leng_t08_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "El Signo Lingüístico y la Distinción Denotación vs. Connotación",
            theory = LessonTheory(
                content = """# TEMA 08: SEMÁNTICA Y LEXICOLOGÍA: EL SIGNO LINGÜÍSTICO, DENOTACIÓN/CONNOTACIÓN Y RELACIONES LÉXICO-SEMÁNTICAS

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Semántica y Significado] --> B[El Signo Lingüístico Ferdinand de Saussure]
    B --> B1[Biplánico: Significado concepto + Significante imagen acústica]
    B --> B2[Principios: Arbitrariedad, Linealidad, Mutabilidad diacrónica, Inmutabilidad sincrónica]

    A --> C[Niveles del Significado]
    C --> C1[Significado Denotativo: Literal, objetivo, universal, de diccionario]
    C --> C2[Significado Connotativo: Figurado, contextual, afectivo, cultural]

    A --> D[Relaciones Léxico-Semánticas]
    D --> D1[Por el Sentido]
    D1 --> D1a[Sinonimia: Total y Parcial]
    D1 --> D1b[Antonimia: Gramatical y Léxica propia, complementaria, recíproca]

    D --> D2[Por la Forma y Origen]
    D2 --> D2a[Polisemia: Mismo origen etimológico, significados afines]
    D2 --> D2b[Homonimia: Distinto origen etimológico; Homófonas y Homógrafas]
    D2 --> D2c[Paronimia: Semejanza fónica, significados inconexos]

    D --> D3[Por Inclusión y Jerarquía]
    D3 --> D3a[Taxonómica: Hiperónimo género vs Hipónimo especie; Cohipónimos]
    D3 --> D3b[Parte-Todo: Holónimo todo vs Merónimo parte]
```

---



## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA



### 3.1. Teoría del Signo Lingüístico (Ferdinand de Saussure)
El **signo lingüístico** es una entidad psíquica de dos caras (biplánica) que asocia indisolublemente dos planos en la mente del hablante:
1. **El Significado (Plano \ del \ Contenido):** Es el concepto abstracto, la representación mental o la idea asociada al signo.
2. **El Significante (Plano \ de \ la \ Expresi\acute{o}n):** Es la imagen acústica, la huella psíquica mental de la cadena de fonemas (no el sonido físico per se, que pertenece al habla).

```
        ┌──────────────────────────────────┐
        │        SIGNO LINGÜÍSTICO         │
        │   ┌──────────────────────────┐   │
        │   │  Significado (Concepto)  │   │
        │   ├──────────────────────────┤   │
        │   │ Significante (Img. Acúst)│   │
        │   └──────────────────────────┘   │
        └──────────────────────────────────┘
```

#### Principios Fundamentales del Signo Lingüístico:
- **Arbitrariedad:** No existe ningún lazo natural, motivado o causal entre el significado y el significante. La unión es fruto de una convención social tácita histórica. Se comprueba por la existencia de diversas lenguas para un mismo concepto (*árbol*, *tree*, *arbre*, *mallki*).
- **Linealidad del Significante:** Al desarrollarse en el tiempo o el espacio fonético, los fonemas del significante se suceden linealmente uno tras otro en una cadena temporal unidimensional; jamás pueden articularse en paralelo simultáneo.
- **Mutabilidad (Diacronía):** A lo largo del tiempo histórico, la lengua cambia; los signos modifican su significante, su significado o ambos (del latín *oculum* al español *ojo*).
- **Inmutabilidad (Sincronía):** En un momento histórico sincrónico dado, ningún hablante individual puede alterar caprichosamente el código lingüístico de su comunidad de habla.
- **Doble Articulación (André Martinet):**
  - *Primera articulación:* Unidades mínimas con significado (**Morfemas**).
  - *Segunda articulación:* Unidades mínimas distintivas sin significado (**Fonemas**).

---



### 3.2. Denotación vs. Connotación
- **Significado Denotativo:** Significado primario, literal, objetivo, institucionalizado en el diccionario y desprovisto de carga afectiva subjetiva. Es común a toda la comunidad hablante al margen de valoraciones personales.
  *Ejemplo:* *"El corazón bombea sangre oxigenada a todo el organismo."*
- **Significado Connotativo:** Significado secundario, figurado, metafórico, subjetivo o cultural que adquiere una palabra según el contexto pragmático y afectivo de los interlocutores.
  *Ejemplo:* *"Ese profesor tiene un corazón de oro al enseñar a sus estudiantes."*

---



## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES



## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL



## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS



## 8. 5 PROBLEMAS RESUELTOS GRADUADOS



### Problema 1 (Nivel Básico: Denotación vs. Connotación)
Identifique la alternativa en la que la palabra *estrella* se utiliza con significado estrictamente denotativo:
- A) Aquel actor es la máxima estrella del cine latinoamericano.
- B) En el examen de cálculo, Juan demostró ser una estrella.
- C) El telescopio espacial captó la radiación emitida por una estrella distante.
- D) Ella nació con estrella y por eso todo le resulta favorable.
- E) Los periodistas persiguieron a la nueva estrella del balompié nacional.

**Resolución:**
- En A, B, D y E, la palabra *estrella* se usa metafóricamente para referirse a fama, talento excepcional o buena fortuna (significado connotativo).
- En C, *estrella* refiere al cuerpo celeste astronómico que brilla con luz propia en el universo (significado objetivo, primario y de diccionario). Es significado **denotativo**.
**Respuesta:** **C**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Antonimia Complementaria:** Oposición semántica binaria y excluyente donde la afirmación de un término anula forzosamente al otro sin grados intermedios.
2. **Antonimia Recíproca:** Oposición semántica donde dos términos se reclaman mutuamente desde perspectivas inversas (*maestro/alumno*).
3. **Arbitrariedad:** Principio saussureano que señala la falta de motivación o vínculo natural intrínseco entre el significado y el significante.
4. **Cohiponimia:** Relación semántica horizontal que vincula a dos o más hipónimos dependientes del mismo hiperónimo.
5. **Connotación:** Significado secundario, asociativo y cultural que adquiere una palabra por factores expresivos, emocionales o estilísticos.
6. **Denotación:** Significado literal, objetivo y estándar de una palabra, registrado como valor de base en los diccionarios.
7. **Holonimia:** Relación semántica que designa el todo respecto a las partes que lo constituyen (*árbol* respecto a *hoja*).
8. **Homonimia:** Coincidencia fónica o gráfica accidental de dos palabras con orígenes etimológicos y significados enteramente distintos.
9. **Meronimia:** Relación semántica que nombra la parte o componente respecto al todo (*teclado* respecto a *computadora*).
10. **Polisemia:** Propiedad de un signo lingüístico de poseer múltiples significados derivados de una misma raíz etimológica y un sema común.

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Qué diferencia a la Polisemia de la Homonimia? | La **polisemia** comparte un sema común y el mismo origen etimológico (un solo lexema); la **homonimia** proviene de raíces etimológicas distintas sin relación conceptual. |
| ¿Cuál es la prueba lógica para la relación Merónimo-Holónimo? | Comprobar la fórmula: **"X forma parte de Y"**. (*El volante forma parte del auto* \rightarrow volante = merónimo; auto = holónimo). |
| ¿Cuál es la diferencia entre antonimia propia y complementaria? | La **propia o gradual** admite matices intermedios (*frío / caliente*); la **complementaria** es excluyente sin término medio (*vivo / muerto*). |
| ¿Cuáles son las dos caras inseparables del Signo Lingüístico según Saussure? | El **Significado** (concepto mental) y el **Significante** (imagen acústica psíquica). |
| ¿Qué son palabras Parónimas? | Palabras de semejante pronunciación y escritura, pero significados totalmente disímiles (*aptitud* y *actitud*). |

---



### 3.3. Relaciones Léxico-Semánticas Fundamentales

#### A. Polisemia vs. Homonimia (La Distinción Reina de Exámenes de Admisión)
- **Polisemia:** Fenómeno por el cual un **único lexema** posee múltiples significados que guardan un **rasgo sémico común** (afinidad semántica) y comparten una **misma raíz etimológica**.
  *Ejemplos:*
  - *Pico:* 1. Parte córnea de la boca de las aves; 2. Herramienta puntiaguda para cavar; 3. Cúspide puntiaguda de una montaña. (Sema común: *forma puntiaguda o terminada en punta*; misma entrada en el diccionario).
- **Homonimia:** Coincidencia fónica o gráfica accidental entre dos palabras de **orígenes etimológicos totalmente distintos**, sin rasgo sémico común (entradas separadas en el diccionario).
  1. **Homónimas Homógrafas:** Misma escritura y misma pronunciación, pero distinto origen y significado:
     - *Lima* (fruta cítrica, del árabe *laymūn*).
     - *Lima* (herramienta de desbaste, del latín *lima*).
     - *Lima* (capital del Perú, del quechua *Rímac*).
  2. **Homónimas Homófonas:** Misma pronunciación, distinta escritura y significado:
     - *Tubo* (sustantivo: cilindro hueco) vs. *Tuvo* (del verbo tener).
     - *Cima* (cumbre más alta) vs. *Sima* (abismo profundo).
     - *Basto* (tosco, grosero) vs. *Vasto* (amplio, extenso).

#### B. Sinonimia y Antonimia
1. **Sinonimia:** Identidad o proximidad semántica entre dos o más significantes distintos.
   - *Total o Absoluta:* Intercambiables en todos los contextos sin alteración semántica (extremadamente rara: *tubérculo / patata* en botánica; *odontólogo / dentista*).
   - *Parcial o Relativa:* Intercambiables solo en determinados contextos: *comprar / adquirir* (*adquirió conocimientos*, no se suele decir *compró conocimientos*).
2. **Antonimia:** Oposición semántica entre dos palabras.
   - *Gramatical (o Morfológica):* Se genera por prefijos de negación (*lógico/ilógico*, *hacer/deshacer*, *fiel/infiel*).
   - *Léxica Propia (Gradual):* Admite grados intermedios (*blanco/negro* \rightarrow gris; *frío/caliente* \rightarrow tibio).
   - *Léxica Complementaria:* La afirmación de uno implica obligatoriamente la negación absoluta del otro, sin grados intermedios (*vivo/muerto*, *soltero/casado*, *par/impar*).
   - *Léxica Recíproca (Inversa):* La existencia de uno presupone necesariamente la existencia correlativa del otro (*comprador/vendedor*, *padre/hijo*, *dar/recibir*).

#### C. Paronimia
Palabras de significado completamente diferente que presentan semejanza fónica y gráfica (fácilmente confundibles):
- *Aptitud* (capacidad o destreza) vs. *Actitud* (disposición de ánimo).
- *Adoptar* (acoger) vs. *Adaptar* (acomodar).
- *Inocuo* (que no hace daño) vs. *Inicuo* (injusto, perverso).

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Examine con extremo rigor las siguientes proposiciones referidas a las relaciones léxico-semánticas:
I. Las palabras *árbol* y *raíz* mantienen una relación semántica de hiperonimia e hiponimia respectivamente.
II. *Comprador* y *vendedor* manifiestan una antonimia léxica recíproca, puesto que la existencia conceptual de uno presupone necesariamente la del otro.
III. En el par *tubo* / *tuvo*, se verifica una homonimia homófona y a su vez paradigmática.
IV. Los vocablos *inicuo* (injusto) e *inocuo* (inofensivo) configuran un caso paradigmático de paronimia léxica.

Determine cuáles son rigurosamente **VERDADERAS**:
- A) I y III
- B) II y IV
- C) II, III y IV
- D) I, II y IV
- E) Solo II

**Resolución Paso a Paso:**
- **Proposición I (FALSA):** La raíz no es una *especie* de árbol (no podemos decir "la raíz es un árbol"). La raíz es una parte anatómica del árbol. La relación es de **Meronimia** (*raíz*) y **Holonimia** (*árbol*), no de hiperonimia/hiponimia.
- **Proposición II (VERDADERA):** No puede haber un acto de compra sin un comprador y un vendedor correlativos. Es el ejemplo canónico de **antonimia léxica recíproca o inversa**.
- **Proposición III (FALSA):** *Tubo* (sustantivo) y *tuvo* (verbo) pertenecen a categorías gramaticales distintas; la homonimia es léxica homófona, pero la homonimia paradigmática sólo ocurre dentro de los paradigmas de un mismo verbo (*yo cantaba* vs. *él cantaba*).
- **Proposición IV (VERDADERA):** *Inicuo* e *inocuo* presentan un significante fónicamente muy semejante con significados conceptuales disímiles. Es un caso típico de **paronimia**.
Por lo tanto, las proposiciones rigurosamente verdaderas son **II y IV**.
**Respuesta:** **B**

---



### Problema 2 (Nivel Intermedio: Homonimia vs. Polisemia)
Analice las siguientes parejas de palabras en contexto:
1. *El **banco** de crédito abrirá a las nueve* / *Se sentó a descansar en el **banco** del parque.*
2. *Remendó la **bota** de cuero* / *El ciudadano **vota** a conciencia en las elecciones.*
3. *Sintió un dolor agudo en el **pecho*** / *Caminó con el **pecho** erguido por el patio.*

Determine la relación léxico-semántica respectiva de cada pareja:
- A) Polisemia - Paronimia - Homonimia homógrafa
- B) Homonimia homógrafa - Homonimia homófona - Polisemia
- C) Polisemia - Homonimia homófona - Polisemia
- D) Homonimia homófona - Polisemia - Homonimia homógrafa
- E) Homonimia homógrafa - Paronimia - Sinonimia

**Resolución:**
1. *banco* (institución financiera) y *banco* (asiento largo): provienen de raíces etimológicas diferentes (germánico *bank* para asiento, e italiano *banca* para la mesa de cambio financiero) \rightarrow **Homonimia homógrafa**.
2. *bota* (calzado) y *vota* (emitir voto): se pronuncian igual y se escriben diferente \rightarrow **Homonimia homófona**.
3. *pecho* (zona anatómica torácica) y *pecho* (frente del torso como postura corporal): comparten la misma raíz latina *pectus* y rasgos sémicos directos \rightarrow **Polisemia**.
Secuencia: Homonimia homógrafa - Homonimia homófona - Polisemia.
**Respuesta:** **B**

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. *"Pagaré la matrícula con la tarjeta del banco"*. En esta frase, la palabra *banco* frente a *banco* (asiento) es un caso de:
   - A) Polisemia
   - B) Homonimia homógrafa
   - C) Homonimia homófona
   - D) Paronimia
   - *Respuesta correcta:* **B** (Misma escritura, significados y orígenes etimológicos enteramente independientes).
2. Es un par de antónimos recíprocos:
   - A) Fiel / Infiel
   - B) Grande / Pequeño
   - C) Tío / Sobrino
   - D) Legal / Ilegal
   - *Respuesta correcta:* **C** (La condición de tío presupone necesariamente la existencia de un sobrino).
3. *"Mesa"* respecto a *"pata"* establece una relación de:
   - A) Hiperónimo a hipónimo
   - B) Holónimo a merónimo
   - C) Cohipónimos
   - D) Antónimos propios
   - *Respuesta correcta:* **B** (*Mesa* es el todo [holónimo] y *pata* es su parte física integrante [merónimo]).

---



### Problema 3 (Nivel Intermedio-Avanzado: Tipos de Antonimia)
En el enunciado: *"El médico forense certificó que el paciente no estaba **vivo**, sino **muerto**"*, la relación de antonimia entre las palabras destacadas se clasifica como:
- A) Léxica propia o gradual
- B) Gramatical o morfológica
- C) Léxica complementaria
- D) Léxica recíproca o inversa
- E) Paronimia semántica

**Resolución:**
Las palabras *vivo* y *muerto* constituyen una oposición binaria excluyente: la negación de uno afirma obligatoriamente al otro sin la existencia de ningún estado biológico intermedio computable. Cumple la condición A \iff \neg B. Por consiguiente, es una **antonimia léxica complementaria**.
**Respuesta:** **C**

---



### 1. El Hack Definitivo: Polisemia vs. Homonimia
- Si los significados tienen algo en común en la forma, uso o función (rasgo sémico afín) \rightarrow **POLISEMIA** (*ojo de aguja*, *ojo humano*).
- Si los significados no tienen nada que ver conceptualmente y provienen de raíces distintas \rightarrow **HOMONIMIA** (*llama* animal / *llama* de fuego / *llama* del verbo llamar)."""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t08_s01_c01",
                    question = "La concepción del signo lingüístico como una entidad biplánica indisoluble formulada por Ferdinand de Saussure postula la unión de:",
                    options = listOf(
                        "Referente y canal",
                        "Fonema y alófono",
                        "Significado (concepto) y Significante (imagen acústica)",
                        "Emisor y receptor",
                    ),
                    correctIndex = 2,
                    explanation = "Ferdinand de Saussure definió el signo lingüístico como una entidad psíquica de dos caras inseparables: el significado y el significante."
                ),
                Challenge(
                    id = "leng_t08_s01_c02",
                    question = "El hecho de que para el concepto de 'perro' el español use /p-e-r-r-o/, el inglés /d-o-g/ y el quechua /a-l-q-o/ demuestra el principio de:",
                    options = listOf(
                        "Arbitrariedad del signo",
                        "Mutabilidad sincrónica",
                        "Doble articulación",
                        "Linealidad del significante",
                    ),
                    correctIndex = 0,
                    explanation = "La arbitrariedad establece que no existe una relación natural ni necesaria entre el concepto y su imagen acústica, dependiendo de la convención de cada lengua."
                ),
                Challenge(
                    id = "leng_t08_s01_c03",
                    question = "El principio según el cual los fonemas de un significante se encadenan temporalmente uno detrás de otro de forma unidimensional se denomina:",
                    options = listOf(
                        "Inmutabilidad",
                        "Arbitrariedad fonológica",
                        "Linealidad del significante",
                        "Doble articulación",
                    ),
                    correctIndex = 2,
                    explanation = "La linealidad del significante implica que los elementos acústicos se extienden sucesivamente en el tiempo sin poder emitirse al unísono."
                ),
                Challenge(
                    id = "leng_t08_s01_c04",
                    question = "La evolución lingüística que transformó la palabra latina 'aurum' en el vocablo castellano 'oro' a lo largo de los siglos ilustra el principio de:",
                    options = listOf(
                        "Inmutabilidad sincrónica",
                        "Linealidad fonética",
                        "Polisemia arbitraria",
                        "Mutabilidad diacrónica",
                    ),
                    correctIndex = 3,
                    explanation = "La mutabilidad diacrónica señala que a través del tiempo histórico los signos de la lengua se transforman en sus planos material o semántico."
                ),
                Challenge(
                    id = "leng_t08_s01_c05",
                    question = "En la oración 'Ese político fue calificado como una rata por los manifestantes', la palabra 'rata' posee un significado:",
                    options = listOf(
                        "Denotativo primario",
                        "Gramatical flexivo",
                        "Literal zoológico",
                        "Connotativo o figurado",
                    ),
                    correctIndex = 3,
                    explanation = "'Rata' no alude al roedor en sentido zoológico literal, sino a un significado connotativo y despectivo de traición o corrupción."
                ),
                Challenge(
                    id = "leng_t08_s01_c06",
                    question = "¿Cuál de las siguientes oraciones presenta exclusivamente un significado denotativo objetivo?",
                    options = listOf(
                        "Mi hermano menor tiene ojos de lince para los negocios.",
                        "Aquel profesor le echó una mano al estudiante en su proyecto.",
                        "El calor del verano derritió el hielo en la cumbre del nevado.",
                        "Tus palabras fueron puñales en mi corazón.",
                    ),
                    correctIndex = 2,
                    explanation = "En la opción sobre el hielo, todas las palabras se emplean con su significado literal, empírico y objetivo del diccionario (denotación)."
                ),
                Challenge(
                    id = "leng_t08_s01_c07",
                    question = "El principio que postula que ningún hablante particular puede cambiar a su antojo las palabras de su idioma en un momento histórico dado es la:",
                    options = listOf(
                        "Mutabilidad diacrónica",
                        "Arbitrariedad absoluta",
                        "Inmutabilidad sincrónica",
                        "Linealidad acústica",
                    ),
                    correctIndex = 2,
                    explanation = "La inmutabilidad sincrónica asegura la estabilidad social del código, impidiendo que un individuo altere caprichosamente la lengua."
                ),
                Challenge(
                    id = "leng_t08_s01_c08",
                    question = "La primera articulación del lenguaje humano postulada por André Martinet tiene como unidades mínimas con significado a los:",
                    options = listOf(
                        "Alófonos",
                        "Grafemas",
                        "Fonemas",
                        "Morfemas",
                    ),
                    correctIndex = 3,
                    explanation = "La primera articulación está formada por unidades significativas (morfemas o monemas), mientras que la segunda está compuesta por fonemas distintivos."
                ),
                Challenge(
                    id = "leng_t08_s01_c09",
                    question = "En la expresión 'El león africano es un mamífero carnívoro de la familia de los félidos', el vocablo 'león' se emplea en sentido:",
                    options = listOf(
                        "Connotativo literario",
                        "Polisémico metafórico",
                        "Antopomórfico",
                        "Denotativo o referencial",
                    ),
                    correctIndex = 3,
                    explanation = "El vocablo 'león' transmite su significado objetivo, científico y primario registrado en el léxico académico (denotación)."
                ),
                Challenge(
                    id = "leng_t08_s01_c10",
                    question = "El plano del signo lingüístico que corresponde a la huella psíquica o imagen acústica en la mente del hablante es el:",
                    options = listOf(
                        "Alomorfo",
                        "Significado",
                        "Significante",
                        "Referente",
                    ),
                    correctIndex = 2,
                    explanation = "El significante es la imagen acústica mental de los sonidos que componen la palabra (plano de la expresión)."
                ),
            )
        ),
        LessonNode(
            id = "leng_t08_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Relaciones Léxico-Semánticas: Polisemia, Homonimia, Antonimia e Inclusión",
            theory = LessonTheory(
                content = """### 3.3. Relaciones Léxico-Semánticas Fundamentales

#### A. Polisemia vs. Homonimia (La Distinción Reina de Exámenes de Admisión)
- **Polisemia:** Fenómeno por el cual un **único lexema** posee múltiples significados que guardan un **rasgo sémico común** (afinidad semántica) y comparten una **misma raíz etimológica**.
  *Ejemplos:*
  - *Pico:* 1. Parte córnea de la boca de las aves; 2. Herramienta puntiaguda para cavar; 3. Cúspide puntiaguda de una montaña. (Sema común: *forma puntiaguda o terminada en punta*; misma entrada en el diccionario).
- **Homonimia:** Coincidencia fónica o gráfica accidental entre dos palabras de **orígenes etimológicos totalmente distintos**, sin rasgo sémico común (entradas separadas en el diccionario).
  1. **Homónimas Homógrafas:** Misma escritura y misma pronunciación, pero distinto origen y significado:
     - *Lima* (fruta cítrica, del árabe *laymūn*).
     - *Lima* (herramienta de desbaste, del latín *lima*).
     - *Lima* (capital del Perú, del quechua *Rímac*).
  2. **Homónimas Homófonas:** Misma pronunciación, distinta escritura y significado:
     - *Tubo* (sustantivo: cilindro hueco) vs. *Tuvo* (del verbo tener).
     - *Cima* (cumbre más alta) vs. *Sima* (abismo profundo).
     - *Basto* (tosco, grosero) vs. *Vasto* (amplio, extenso).

#### B. Sinonimia y Antonimia
1. **Sinonimia:** Identidad o proximidad semántica entre dos o más significantes distintos.
   - *Total o Absoluta:* Intercambiables en todos los contextos sin alteración semántica (extremadamente rara: *tubérculo / patata* en botánica; *odontólogo / dentista*).
   - *Parcial o Relativa:* Intercambiables solo en determinados contextos: *comprar / adquirir* (*adquirió conocimientos*, no se suele decir *compró conocimientos*).
2. **Antonimia:** Oposición semántica entre dos palabras.
   - *Gramatical (o Morfológica):* Se genera por prefijos de negación (*lógico/ilógico*, *hacer/deshacer*, *fiel/infiel*).
   - *Léxica Propia (Gradual):* Admite grados intermedios (*blanco/negro* \rightarrow gris; *frío/caliente* \rightarrow tibio).
   - *Léxica Complementaria:* La afirmación de uno implica obligatoriamente la negación absoluta del otro, sin grados intermedios (*vivo/muerto*, *soltero/casado*, *par/impar*).
   - *Léxica Recíproca (Inversa):* La existencia de uno presupone necesariamente la existencia correlativa del otro (*comprador/vendedor*, *padre/hijo*, *dar/recibir*).

#### C. Paronimia
Palabras de significado completamente diferente que presentan semejanza fónica y gráfica (fácilmente confundibles):
- *Aptitud* (capacidad o destreza) vs. *Actitud* (disposición de ánimo).
- *Adoptar* (acoger) vs. *Adaptar* (acomodar).
- *Inocuo* (que no hace daño) vs. *Inicuo* (injusto, perverso).

---



### 3.4. Relaciones de Inclusión y Jerarquía: Taxonomía y Meronimia

```
          ┌────────────────────────────────────────────────────────┐
          │             RELACIONES DE INCLUSIÓN                    │
          └───────────────────────────┬────────────────────────────┘
                         ┌────────────┴────────────┐
                         ▼                         ▼
              ┌─────────────────────┐   ┌─────────────────────┐
              │     Taxonómica      │   │     Parte-Todo      │
              │  (Género - Especie) │   │  (Meronimia/Holon)  │
              └──────────┬──────────┘   └──────────┬──────────┘
                         ├─ Hiperónimo             ├─ Holónimo
                         │  (Flor)                 │  (Bicicleta)
                         ├─ Hipónimo               ├─ Merónimo
                         │  (Rosa, Clavel)         │  (Pedal, Cadena)
                         └─ Cohipónimos            └─ Partes integrantes
                            (Rosa y Clavel)
```

1. **Hiperonimia e Hiponimia (Género - Especie):**
   - **Hiperónimo:** Término de mayor amplitud semántica que engloba a otros (*Árbol*).
   - **Hipónimo:** Término de menor extensión semántica subordinado a un hiperónimo (*Queñua, sauce, eucalipto*).
   - **Cohipónimos:** Relación de equivalencia entre hipónimos del mismo hiperónimo (*La queñua y el sauce son cohipónimos*).
2. **Holonimia y Meronimia (Todo - Parte):**
   - **Holónimo:** Palabra que nombra a un objeto o entidad completa en su totalidad (*Cuerpo humano*, *Automóvil*).
   - **Merónimo:** Palabra que nombra una parte integrante o componente físico del holónimo (*Brazo*, *mano* son merónimos de *cuerpo humano*; *volante*, *motor* son merónimos de *automóvil*).

---



### 4.1. Cuadro Diferencial de Oposiciones Antónimas

\begin{array}{|l|l|l|}
\hline
\textbf{Tipo de Antonimia} & \textbf{Criterio Semántico} & \textbf{Prueba Lógica} \\ \hline
\text{Propia (Gradual)} & \text{Admite términos intermedios} & A \implies \neg B, \ \text{pero} \ \neg A \not\implies B \ (\text{tibio}) \\ \hline
\text{Complementaria} & \text{Exclusión mutua binaria estricta} & A \iff \neg B \ (\text{vivo} \iff \text{no muerto}) \\ \hline
\text{Recíproca (Inversa)} & \text{Direccionalidad correlativa mutua} & A(x, y) \iff B(y, x) \ (\text{X es padre de Y} \iff \text{Y es hijo de X}) \\ \hline
\end{array}

---



### Caso 1: Resolución de Ambigüedades Semánticas en la Propiedad Intelectual
En una patente biotecnológica se describe:
> *"Se utilizó la **planta** para la extracción de alcaloides purificados."*
- **Análisis Lexicológico:** La palabra *planta* es polisémica:
  1. *Planta:* Organismo vivo del reino vegetal (afinidad con tallo, raíz, fotosíntesis).
  2. *Planta:* Fábrica o instalación industrial de procesamiento químico.
- **Riesgo:** Si el contexto no precisa si la extracción ocurrió dentro de las instalaciones industriales (*planta física*) o a partir del espécimen botánico (*planta vegetal*), la patente es jurídicamente nula por ambigüedad léxica grave.

---



### 1. El Hack Definitivo: Polisemia vs. Homonimia
- Si los significados tienen algo en común en la forma, uso o función (rasgo sémico afín) \rightarrow **POLISEMIA** (*ojo de aguja*, *ojo humano*).
- Si los significados no tienen nada que ver conceptualmente y provienen de raíces distintas \rightarrow **HOMONIMIA** (*llama* animal / *llama* de fuego / *llama* del verbo llamar).



### 2. Mnemotécnia de Taxonomía vs. Parte/Todo
\mathbf{H}\text{ipónimo / Hiperónimo} \longrightarrow \textbf{ES UN} \quad (\text{El clavel \textbf{es una} flor})
\mathbf{M}\text{erónimo / Holónimo} \longrightarrow \textbf{FORMA PARTE DE} \quad (\text{El pedal \textbf{forma parte de} la bicicleta})

---



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **Confundir Meronimia con Hiponimia:**
   - *Pregunta trampa:* *"Dedo es a mano como..."*
   - *Error común:* Pensar que *dedo* es hipónimo de *mano*.
   - *Realidad RAE:* Un dedo NO es una especie de mano; es una **parte anatómica física** de la mano. Por tanto, es una relación de **Meronimia/Holonimia**, no de Hiponimia/Hiperonimia.
2. **Confundir Homónimas Homófonas con Parónimas:**
   - *Cima / Sima:* Suenan exactamente igual \rightarrow **Homófonas** (y a su vez antónimos).
   - *Aptitud / Actitud:* NO suenan igual, sólo parecido \rightarrow **Parónimas**.
3. **Clasificación errónea de Antonimia Complementaria vs. Propia:**
   - *Soltero / Casado:* No existe "medio soltero" en el ámbito del estado civil \rightarrow **Complementaria**.
   - *Gordo / Flaco:* Admite término medio (*de contextura media*) \rightarrow **Propia o gradual**.

---



### Problema 2 (Nivel Intermedio: Homonimia vs. Polisemia)
Analice las siguientes parejas de palabras en contexto:
1. *El **banco** de crédito abrirá a las nueve* / *Se sentó a descansar en el **banco** del parque.*
2. *Remendó la **bota** de cuero* / *El ciudadano **vota** a conciencia en las elecciones.*
3. *Sintió un dolor agudo en el **pecho*** / *Caminó con el **pecho** erguido por el patio.*

Determine la relación léxico-semántica respectiva de cada pareja:
- A) Polisemia - Paronimia - Homonimia homógrafa
- B) Homonimia homógrafa - Homonimia homófona - Polisemia
- C) Polisemia - Homonimia homófona - Polisemia
- D) Homonimia homófona - Polisemia - Homonimia homógrafa
- E) Homonimia homógrafa - Paronimia - Sinonimia

**Resolución:**
1. *banco* (institución financiera) y *banco* (asiento largo): provienen de raíces etimológicas diferentes (germánico *bank* para asiento, e italiano *banca* para la mesa de cambio financiero) \rightarrow **Homonimia homógrafa**.
2. *bota* (calzado) y *vota* (emitir voto): se pronuncian igual y se escriben diferente \rightarrow **Homonimia homófona**.
3. *pecho* (zona anatómica torácica) y *pecho* (frente del torso como postura corporal): comparten la misma raíz latina *pectus* y rasgos sémicos directos \rightarrow **Polisemia**.
Secuencia: Homonimia homógrafa - Homonimia homófona - Polisemia.
**Respuesta:** **B**

---



### Problema 3 (Nivel Intermedio-Avanzado: Tipos de Antonimia)
En el enunciado: *"El médico forense certificó que el paciente no estaba **vivo**, sino **muerto**"*, la relación de antonimia entre las palabras destacadas se clasifica como:
- A) Léxica propia o gradual
- B) Gramatical o morfológica
- C) Léxica complementaria
- D) Léxica recíproca o inversa
- E) Paronimia semántica

**Resolución:**
Las palabras *vivo* y *muerto* constituyen una oposición binaria excluyente: la negación de uno afirma obligatoriamente al otro sin la existencia de ningún estado biológico intermedio computable. Cumple la condición A \iff \neg B. Por consiguiente, es una **antonimia léxica complementaria**.
**Respuesta:** **C**

---



### Problema 4 (Nivel Avanzado: Hiperonimia, Hiponimia y Cohiponimia)
En el fragmento: *"Entre los **cetáceos**, el **delfín** y la **ballena** son considerados los mamíferos acuáticos con mayores habilidades cognitivas"*, los términos subrayados establecen respectivamente las relaciones de:
- A) Hiperónimo, merónimo y holónimo
- B) Holónimo, hipónimo e hiperónimo
- C) Hiperónimo, hipónimo y cohipónimo
- D) Cohipónimo, hiperónimo e hipónimo
- E) Merónimo, holónimo y cohipónimo

**Resolución:**
- *cetáceos* es la categoría zoológica superior o de género \rightarrow **Hiperónimo**.
- *delfín* es una especie perteneciente al orden de los cetáceos \rightarrow **Hipónimo** de cetáceo.
- *ballena* es otra especie del mismo orden \rightarrow Es **cohipónimo** respecto al delfín (e hipónimo de cetáceo).
Por ende, la relación respectiva es Hiperónimo, hipónimo y cohipónimo.
**Respuesta:** **C**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Examine con extremo rigor las siguientes proposiciones referidas a las relaciones léxico-semánticas:
I. Las palabras *árbol* y *raíz* mantienen una relación semántica de hiperonimia e hiponimia respectivamente.
II. *Comprador* y *vendedor* manifiestan una antonimia léxica recíproca, puesto que la existencia conceptual de uno presupone necesariamente la del otro.
III. En el par *tubo* / *tuvo*, se verifica una homonimia homófona y a su vez paradigmática.
IV. Los vocablos *inicuo* (injusto) e *inocuo* (inofensivo) configuran un caso paradigmático de paronimia léxica.

Determine cuáles son rigurosamente **VERDADERAS**:
- A) I y III
- B) II y IV
- C) II, III y IV
- D) I, II y IV
- E) Solo II

**Resolución Paso a Paso:**
- **Proposición I (FALSA):** La raíz no es una *especie* de árbol (no podemos decir "la raíz es un árbol"). La raíz es una parte anatómica del árbol. La relación es de **Meronimia** (*raíz*) y **Holonimia** (*árbol*), no de hiperonimia/hiponimia.
- **Proposición II (VERDADERA):** No puede haber un acto de compra sin un comprador y un vendedor correlativos. Es el ejemplo canónico de **antonimia léxica recíproca o inversa**.
- **Proposición III (FALSA):** *Tubo* (sustantivo) y *tuvo* (verbo) pertenecen a categorías gramaticales distintas; la homonimia es léxica homófona, pero la homonimia paradigmática sólo ocurre dentro de los paradigmas de un mismo verbo (*yo cantaba* vs. *él cantaba*).
- **Proposición IV (VERDADERA):** *Inicuo* e *inocuo* presentan un significante fónicamente muy semejante con significados conceptuales disímiles. Es un caso típico de **paronimia**.
Por lo tanto, las proposiciones rigurosamente verdaderas son **II y IV**.
**Respuesta:** **B**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Antonimia Complementaria:** Oposición semántica binaria y excluyente donde la afirmación de un término anula forzosamente al otro sin grados intermedios.
2. **Antonimia Recíproca:** Oposición semántica donde dos términos se reclaman mutuamente desde perspectivas inversas (*maestro/alumno*).
3. **Arbitrariedad:** Principio saussureano que señala la falta de motivación o vínculo natural intrínseco entre el significado y el significante.
4. **Cohiponimia:** Relación semántica horizontal que vincula a dos o más hipónimos dependientes del mismo hiperónimo.
5. **Connotación:** Significado secundario, asociativo y cultural que adquiere una palabra por factores expresivos, emocionales o estilísticos.
6. **Denotación:** Significado literal, objetivo y estándar de una palabra, registrado como valor de base en los diccionarios.
7. **Holonimia:** Relación semántica que designa el todo respecto a las partes que lo constituyen (*árbol* respecto a *hoja*).
8. **Homonimia:** Coincidencia fónica o gráfica accidental de dos palabras con orígenes etimológicos y significados enteramente distintos.
9. **Meronimia:** Relación semántica que nombra la parte o componente respecto al todo (*teclado* respecto a *computadora*).
10. **Polisemia:** Propiedad de un signo lingüístico de poseer múltiples significados derivados de una misma raíz etimológica y un sema común.

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Qué diferencia a la Polisemia de la Homonimia? | La **polisemia** comparte un sema común y el mismo origen etimológico (un solo lexema); la **homonimia** proviene de raíces etimológicas distintas sin relación conceptual. |
| ¿Cuál es la prueba lógica para la relación Merónimo-Holónimo? | Comprobar la fórmula: **"X forma parte de Y"**. (*El volante forma parte del auto* \rightarrow volante = merónimo; auto = holónimo). |
| ¿Cuál es la diferencia entre antonimia propia y complementaria? | La **propia o gradual** admite matices intermedios (*frío / caliente*); la **complementaria** es excluyente sin término medio (*vivo / muerto*). |
| ¿Cuáles son las dos caras inseparables del Signo Lingüístico según Saussure? | El **Significado** (concepto mental) y el **Significante** (imagen acústica psíquica). |
| ¿Qué son palabras Parónimas? | Palabras de semejante pronunciación y escritura, pero significados totalmente disímiles (*aptitud* y *actitud*). |

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. *"Pagaré la matrícula con la tarjeta del banco"*. En esta frase, la palabra *banco* frente a *banco* (asiento) es un caso de:
   - A) Polisemia
   - B) Homonimia homógrafa
   - C) Homonimia homófona
   - D) Paronimia
   - *Respuesta correcta:* **B** (Misma escritura, significados y orígenes etimológicos enteramente independientes).
2. Es un par de antónimos recíprocos:
   - A) Fiel / Infiel
   - B) Grande / Pequeño
   - C) Tío / Sobrino
   - D) Legal / Ilegal
   - *Respuesta correcta:* **C** (La condición de tío presupone necesariamente la existencia de un sobrino).
3. *"Mesa"* respecto a *"pata"* establece una relación de:
   - A) Hiperónimo a hipónimo
   - B) Holónimo a merónimo
   - C) Cohipónimos
   - D) Antónimos propios
   - *Respuesta correcta:* **B** (*Mesa* es el todo [holónimo] y *pata* es su parte física integrante [merónimo]).

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Semántica y Significado] --> B[El Signo Lingüístico Ferdinand de Saussure]
    B --> B1[Biplánico: Significado concepto + Significante imagen acústica]
    B --> B2[Principios: Arbitrariedad, Linealidad, Mutabilidad diacrónica, Inmutabilidad sincrónica]

    A --> C[Niveles del Significado]
    C --> C1[Significado Denotativo: Literal, objetivo, universal, de diccionario]
    C --> C2[Significado Connotativo: Figurado, contextual, afectivo, cultural]

    A --> D[Relaciones Léxico-Semánticas]
    D --> D1[Por el Sentido]
    D1 --> D1a[Sinonimia: Total y Parcial]
    D1 --> D1b[Antonimia: Gramatical y Léxica propia, complementaria, recíproca]

    D --> D2[Por la Forma y Origen]
    D2 --> D2a[Polisemia: Mismo origen etimológico, significados afines]
    D2 --> D2b[Homonimia: Distinto origen etimológico; Homófonas y Homógrafas]
    D2 --> D2c[Paronimia: Semejanza fónica, significados inconexos]

    D --> D3[Por Inclusión y Jerarquía]
    D3 --> D3a[Taxonómica: Hiperónimo género vs Hipónimo especie; Cohipónimos]
    D3 --> D3b[Parte-Todo: Holónimo todo vs Merónimo parte]
```

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t08_s02_c01",
                    question = "La diferencia conceptual crucial entre la polisemia y la homonimia radica en que las palabras polisémicas:",
                    options = listOf(
                        "Se escriben de forma idéntica pero significan siempre lo opuesto",
                        "Son préstamos léxicos de lenguas amerindias",
                        "Poseen diferente etimología y no comparten ningún sema",
                        "Tienen la misma raíz etimológica y comparten un rasgo sémico común",
                    ),
                    correctIndex = 3,
                    explanation = "La polisemia se origina en una misma palabra (misma etimología) cuyas acepciones comparten un rasgo sémico común (ej. pico de ave y pico de montaña)."
                ),
                Challenge(
                    id = "leng_t08_s02_c02",
                    question = "Los vocablos 'tubo' (pieza hueca) y 'tuvo' (del verbo tener) constituyen un ejemplo preciso de:",
                    options = listOf(
                        "Palabras polisémicas",
                        "Homónimas homófonas",
                        "Antónimos recíprocos",
                        "Homónimas homógrafas",
                    ),
                    correctIndex = 1,
                    explanation = "Las palabras homófonas tienen idéntica pronunciación pero se diferencian en su escritura y provienen de orígenes etimológicos distintos."
                ),
                Challenge(
                    id = "leng_t08_s02_c03",
                    question = "La oposición entre los términos 'vivo' y 'muerto' se clasifica rigurosamente como antonimia:",
                    options = listOf(
                        "Complementaria",
                        "Gradual o propia",
                        "Recíproca o inversa",
                        "Morfológica prefijal",
                    ),
                    correctIndex = 0,
                    explanation = "Es una antonimia complementaria porque la afirmación de uno implica obligatoriamente la exclusión del otro, sin grados intermedios."
                ),
                Challenge(
                    id = "leng_t08_s02_c04",
                    question = "Los términos 'comprador' y 'vendedor' ilustran un tipo de antonimia léxica:",
                    options = listOf(
                        "Recíproca o inversa",
                        "Complementaria binaria",
                        "Gradual con término medio",
                        "Gramatical por prefijación",
                    ),
                    correctIndex = 0,
                    explanation = "Los antónimos recíprocos o inversos implican que la existencia de uno exige necesariamente la existencia del otro en la relación comercial."
                ),
                Challenge(
                    id = "leng_t08_s02_c05",
                    question = "En la relación semántica entre 'flor' y 'orquídea', el vocablo 'flor' funciona como:",
                    options = listOf(
                        "Hiperónimo",
                        "Hipónimo",
                        "Merónimo",
                        "Cohipónimo",
                    ),
                    correctIndex = 0,
                    explanation = "El hiperónimo es el término genérico de mayor amplitud semántica que engloba a especies subordinadas como la orquídea."
                ),
                Challenge(
                    id = "leng_t08_s02_c06",
                    question = "Las palabras 'guitarra' y 'cuerda' guardan una relación semántica estricta de:",
                    options = listOf(
                        "Hiperónimo e hipónimo",
                        "Holónimo y merónimo (todo - parte)",
                        "Polisemia funcional",
                        "Antonimia inversa",
                    ),
                    correctIndex = 1,
                    explanation = "'Guitarra' es el todo integrado (holónimo) y 'cuerda' es una parte o elemento constitutivo indispensable (merónimo)."
                ),
                Challenge(
                    id = "leng_t08_s02_c07",
                    question = "Los términos 'aptitud' (capacidad intelectiva) y 'actitud' (disposición de ánimo) constituyen un par de vocablos:",
                    options = listOf(
                        "Homófonos",
                        "Parónimos",
                        "Homógrafos",
                        "Antónimos graduales",
                    ),
                    correctIndex = 1,
                    explanation = "Los parónimos son palabras que presentan semejanzas fonéticas y gráficas muy cercanas, pero significados totalmente distintos."
                ),
                Challenge(
                    id = "leng_t08_s02_c08",
                    question = "Las palabras 'lima' (fruta), 'lima' (herramienta) y 'Lima' (capital) son ejemplos indiscutibles de:",
                    options = listOf(
                        "Homonimia homógrafa",
                        "Polisemia léxica",
                        "Sinonimia relativa",
                        "Paronimia contextual",
                    ),
                    correctIndex = 0,
                    explanation = "Tienen exactamente la misma grafía y sonido pero orígenes etimológicos totalmente independientes y sin ningún sema común (homografía)."
                ),
                Challenge(
                    id = "leng_t08_s02_c09",
                    question = "Los vocablos 'clavel' y 'jazmín' respecto del término 'flor' mantienen entre sí una relación de:",
                    options = listOf(
                        "Hiperonimia",
                        "Cohiponimia",
                        "Meronimia",
                        "Antonimia propia",
                    ),
                    correctIndex = 1,
                    explanation = "Dos hipónimos que pertenecen a la misma categoría o género común (hiperónimo) son cohipónimos entre sí."
                ),
                Challenge(
                    id = "leng_t08_s02_c10",
                    question = "La oposición semántica entre 'leal' y 'desleal' o entre 'posible' e 'imposible' corresponde al tipo de:",
                    options = listOf(
                        "Antonimia léxica gradual",
                        "Antonimia gramatical o morfológica",
                        "Antonimia recíproca",
                        "Homonimia fónica",
                    ),
                    correctIndex = 1,
                    explanation = "La antonimia gramatical o morfológica se forma añadiendo prefijos de oposición o privación (des-, in-, im-, i-, a-) a la misma raíz."
                ),
            )
        )
    )
}
