package lenguaje

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object LenguajeSemana07 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "leng_t07_s01",
            title = "El Discurso Escrito: Adecuación, Coherencia y Mecanismos de Cohesión",
            theory = LessonTheory(
                title = "Propiedades Fundamentales del Texto",
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Discurso Escrito y Normativa RAE] --> B[Propiedades del Texto]
    B --> B1[Adecuación: Registro y contexto comunicativo]
    B --> B2[Coherencia: Unidad temática, no contradicción, progresión temática]
    B --> B3[Cohesión: Mecanismos gramaticales y léxicos]

    B3 --> C[Mecanismos de Cohesión]
    C --> C1[Referencia Endofórica: Anáfora y Catáfora]
    C --> C2[Elipsis: Omisión de elementos consabidos]
    C --> C3[Conectores Lógicos Interoracionales]
    C --> C4[Sustitución Léxica: Sinónimos, Hiperónimos, Perífrasis]

    A --> D[Signos de Puntuación]
    D --> D1[La Coma: Vocativa, Elíptica, Hiperbática, Enumerativa, Explicativa, Conjuntiva]
    D --> D2[Punto y Coma: Proposiciones yuxtapuestas extensas, Ante conectores adversativos/ilativos]
    D --> D3[Dos Puntos: Cita textual, Enumeración anunciada, Consecuencia o causa sintética]

    A --> E[Normativa de Mayúsculas RAE 2010]
    E --> E1[Cargos públicos eclesiásticos y títulos en MINÚSCULA: rey, papa, presidente, decano]
    E --> E2[Días, meses, estaciones, monedas, gentilicios e idiomas en MINÚSCULA]
    E --> E3[Nombres propios, topónimos e instituciones en MAYÚSCULA]
```

---



## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA



### 3.1. Propiedades Fundamentales del Texto
Un texto es una unidad comunicativa máxima emitida por un hablante en una situación concreta con intención comunicativa. Posee tres propiedades constitutivas indispensables:

1. **Adecuación:** Adaptación del texto al contexto comunicativo, al perfil del destinatario y al canal. Exige elegir el registro lingüístico pertinente (formal, académico, coloquial) y respetar las convenciones de género discursivo.
2. **Coherencia:** Dimensión semántica y lógica del texto. Garantiza que el mensaje sea percibido como una unidad con sentido global.
   - *Principio de no contradicción:* Las ideas no deben entrar en colisión lógica.
   - *Principio de relación temática:* Todo enunciado debe guardar relación con el tema central (*tópico*).
   - *Principio de progresión temática:* El texto debe balancear la información conocida (*tema*) con información nueva aportada progresivamente (*rema*).
3. **Cohesión:** Dimensión sintáctica y léxica del texto. Es la red de conexiones explícitas que ligan las oraciones y párrafos entre sí.

---



### 3.2. Mecanismos de Cohesión Textual

#### A. Referencia Endofórica (Anáfora y Catáfora)
- **Anáfora:** Mecanismo en el que un pronombre, adverbio o determinante asume el significado de una palabra mencionada *previamente* en el texto:
  \text{Antecedente} \longrightarrow \mathbf{Elemento \ Anaf\acute{o}rico}
  *Ejemplo:* *Mario Vargas Llosa escribió La ciudad y los perros; **este** [anáfora] le valió reconocimiento mundial.*
- **Catáfora:** Mecanismo en el que un elemento anticipa a una palabra o frase que será explicada *posteriormente*:
  \mathbf{Elemento \ Cataf\acute{o}rico} \longrightarrow \text{Término Consecuente}
  *Ejemplo:* *Solo necesitas **tres cosas** para triunfar: disciplina, perseverancia y método.*

#### B. Elipsis y Sustitución Léxica
- **Elipsis:** Supresión intencionada de un elemento verbal o nominal fácilmente recuperable por el contexto para evitar redundancias fatigosas:
  *Mariano Melgar escribió yaravíes; Carlos Augusto Salaverry, poemas románticos.* (Elipsis del verbo *escribió* representada por la coma elíptica).
- **Sustitución Léxica:** Reemplazo de un término por un sinónimo (*médico* por *galeno*), un hiperónimo (*perro* por *animal*), o una perífrasis designativa (*Arequipa* por *la Ciudad Blanca*).

---



## 4. FÓRMULAS, TAXONOMÍAS Y LEYES FUNDAMENTALES



## 5. CASOS PRÁCTICOS Y MODELIZACIONES DEL MUNDO REAL



## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS



### Problema 2 (Nivel Intermedio: Cohesión y Referencia Endofórica)
En el siguiente fragmento: *"El volcán Misti domina la campiña arequipeña; este coloso andino cautiva a los visitantes, quienes contemplan su silueta al atardecer"*, las palabras subrayadas *este coloso andino* y *su* cumplen respectivamente la función de:
- A) Catáfora y elipsis
- B) Anáfora y anáfora
- C) Catáfora y anáfora
- D) Hiperónimo y catáfora
- E) Elipsis y pleonasmo

**Resolución:**
1. *este coloso andino* retoma y refiere a un término mencionado con anterioridad: *El volcán Misti*. Es una referencia **anafórica** (mediante sustitución sinonímica/perifrástica).
2. El determinante posesivo *su* (en *su silueta*) refiere igualmente al *Misti* ya citado con anterioridad. Por tanto, es también un elemento **anafórico**.
Ambos mecanismos operan como anáforas de cohesión discursiva.
**Respuesta:** **B**

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Adecuación:** Propiedad textual que evalúa la congruencia del enunciado con la situación comunicativa, el canal y el registro social del auditorio.
2. **Anáfora:** Mecanismo cohesivo de referencia endofórica en el cual un elemento lingüístico remite a una unidad expresada con anterioridad en el texto.
3. **Catáfora:** Fenómeno de anticipación semántica en el discurso donde una palabra anuncia a un elemento que se explicitará con posterioridad.
4. **Coherencia:** Cualidad semántica estructural que dota a un texto de sentido unitario, no contradicción y progresión lógica de la información.
5. **Cohesión:** Red formal de mecanismos léxicos y gramaticales (conectores, signos de puntuación, deixis) que entrelazan los constituyentes de un texto.
6. **Coma Criminal:** Incorrección ortográfica consistente en intercalar una coma entre el sujeto y el verbo principal, o entre el verbo y su objeto directo.
7. **Coma Elíptica:** Signo de puntuación que señala gráficamente la omisión voluntaria de un verbo sobreentendido o previamente enunciado.
8. **Coma Hiperbática:** Marca gráfica que señala el desorden del orden sintáctico canónico oracional al anteponerse un complemento circunstancial extenso.
9. **Elipsis:** Supresión elocutiva de una palabra o frase dentro del texto que el receptor puede reconstruir contextualmente sin pérdida de inteligibilidad.
10. **Progresión Temática:** Articulación dinámica de un texto en el cual la información conocida (*tema*) se vincula secuencialmente con aportes de información nueva (*rema*).

---



### 3.3. Normativa de Signos de Puntuación (Ortografía RAE)

#### A. La Coma (,) y sus Clases Canónicas

| Tipo de Coma | Función y Regla Ortográfica | Ejemplo Ilustrativo |
| :--- | :--- | :--- |
| **Coma Enumerativa** | Separa elementos análogos de una serie sintáctica, salvo los precedidos por *y, e, ni, o, u*. | *Compró cuadernos, lápices, borradores y reglas.* |
| **Coma Vocativa** | Aísla al interlocutor (vocativo) al que se dirige el emisor, sin importar su posición (inicio, medio o final). | ***Jóvenes**, luchen por sus sueños.* / *Luchen, **jóvenes**, por sus sueños.* |
| **Coma Elíptica** | Reemplaza a un verbo omitido que ya fue mencionado con anterioridad. | *Ella postula a Medicina; él, a Derecho.* |
| **Coma Explicativa / Incidental** | Encierra aclaraciones, aposiciones explicativas o precisiones accesorias. | *Arequipa, **tierra de volcanes**, fue fundada en 1540.* |
| **Coma Hiperbática** | Marca la alteración del orden lógico oracional cuando el Complemento Circunstancial se antepone al sujeto. | *Con mucho entusiasmo y dedicación, los alumnos repasaron la lección.* |
| **Coma Conjuntiva / Nexo** | Antecede a conjunciones adversativas breves (*pero, mas, sino*) o ilativas (*conque, luego*), o encierra locuciones adverbiales (*sin embargo, es decir, por ende*). | *Estudió con ahínco, **pero** no alcanzó el puntaje.* / *Rindió el examen; **por ende**, esperará los resultados.* |

> **PROHIBICIÓN ABSOLUTA RAE (Coma Criminal):** Está terminantemente prohibido colocar coma entre el **Sujeto** y el **Verbo Principal**, o entre el **Verbo** y su **Objeto Directo**:
> - *Incorrecto:* \times *Los alumnos de la facultad de medicina, salieron temprano.*
> - *Correcto:* \checkmark *Los alumnos de la facultad de medicina salieron temprano.*

#### B. El Punto y Coma (;)
1. **Separación de proposiciones yuxtapuestas complejas:** Cuando entre las oraciones ya existen comas internas:
   *Cada grupo presentó su proyecto: el primero, sobre biotecnología; el segundo, sobre física nuclear.*
2. **Ante conectores adversativos, concesivos o ilativos extensos:** Ante conectores como *sin embargo*, *no obstante*, *por consiguiente*, *en consecuencia*, cuando la oración anterior posee cierta extensión:
   *Los postulantes prepararon la prueba durante más de diez meses consecutivos**; sin embargo,** el nivel de exigencia superó toda expectativa previa.*

#### C. Los Dos Puntos (:)
1. **Tras anunciar una enumeración:** *Compró tres materiales indispensables: cemento, yeso y arena fina.* (No deben emplearse si la enumeración no tiene elemento anticipador: *Incorrecto:* \times *Compró: cemento, yeso y arena*).
2. **Precediendo a citas textuales literales:** *Sócrates sentenció: «Solo sé que nada sé».*
3. **Causa, efecto o conclusión sintética entre proposiciones:**
   *No entrenó adecuadamente durante las semanas previas: perdió la competencia por amplia ventaja.*

---



### 3.4. Normativa Académica de Letras Mayúsculas y Minúsculas (RAE 2010)

#### A. Minúscula Obligatoria en Casos Comúnmente Erróneos
1. **Cargos públicos, políticos, eclesiásticos o militares:** Van siempre en **minúscula**, vayan o no acompañados del nombre propio:
   *el presidente del Perú*, *el papa Francisco*, *el rey Felipe VI*, *el ministro de Economía*, *el arzobispo de Arequipa*, *el decano de la facultad*.
2. **Gentilicios, idiomas, días de la semana, meses y estaciones del año:**
   *peruano, arequipeño, inglés, castellano, lunes, diciembre, primavera, verano*.
3. **Puntos cardinales cuando designan la dirección o posición:**
   *rumbo al norte*, *viento del sur*, *el este de la ciudad* (Solo en mayúscula si forman parte de un nombre propio o entidad geopolítica: *América del Norte*, *Corea del Sur*).
4. **Tratamientos de cortesía en forma desarrollada:**
   *usted, señor, don, excelencia, reverendo* (En mayúscula solo sus abreviaturas: *Ud., Sr., D., Excma.*).

#### B. Mayúscula Inicial Obligatoria
1. **Nombres propios de personas, animales, topónimos y accidentes geográficos:**
   *Mariano Melgar*, *Arequipa*, *el río Chili* (nótese: *río* en minúscula, *Chili* en mayúscula), *el volcán Misti*, *el océano Pacífico*, *la cordillera de los Andes*.
2. **Nombres de asignaturas y carreras universitarias en contextos formales/académicos:**
   *Ingeniería Civil*, *Derecho Constitucional*, *Química Orgánica*.
3. **Títulos de obras de creación (libros, películas, canciones, pinturas):**
   Solo lleva mayúscula la **primera palabra** y los nombres propios contenidos en el título:
   *Cien años de soledad*, *La ciudad y los perros*, *Crimen y castigo*, *El mundo es ancho y ajeno*. (Salvo publicaciones periódicas: *El Comercio*, *La República*).
4. **Nombres de épocas históricas, movimientos cívico-militares y acontecimientos relevantes:**
   *el Renacimiento*, *la Edad Media*, *la Revolución Francesa*, *la Guerra del Pacífico*.

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. En la expresión: *"Solo compraré dos cosas: el libro y el cuaderno"*, la palabra subrayada *"dos cosas"* constituye un mecanismo de cohesión denominado:
   - A) Anáfora
   - B) Catáfora
   - C) Elipsis verbal
   - D) Coma hiperbática
   - *Respuesta correcta:* **B** (Anticipa a los elementos consecuentes que serán explicitados tras los dos puntos).
2. ¿Cuál de las siguientes palabras debe escribirse siempre en minúscula según la norma académica?
   - A) Renacimiento
   - B) Revolución Francesa
   - C) Papa (autoridad eclesiástica)
   - D) Arequipa
   - *Respuesta correcta:* **C** (Todos los cargos públicos y religiosos se escriben con minúscula).
3. En la oración *"Ayer, María aprobó el examen"*, la coma empleada es:
   - A) Vocativa
   - B) Elíptica
   - C) Hiperbática
   - D) Apositiva
   - *Respuesta correcta:* **C** (Marca la anteposición del complemento circunstancial de tiempo *Ayer*).

---



### Problema 1 (Nivel Básico: Uso de la Coma Vocativa)
Identifique la oración que presenta un uso correcto de la coma vocativa:
- A) Estimados alumnos, ingresarán al aula puntualmente.
- B) Entreguen inmediatamente, sus exámenes a los profesores.
- C) Por favor, jóvenes, guarden absoluto silencio durante la prueba.
- D) El profesor de química, explicó detalladamente la reacción redox.
- E) Todos los postulantes que vinieron temprano, ocuparon las primeras filas.

**Resolución:**
- En A: *Estimados alumnos* es el sujeto, no vocativo; se ha puesto coma criminal entre sujeto y verbo.
- En B: Se ha colocado coma entre el verbo (*Entreguen*) y su OD (*sus exámenes*).
- En D: Coma criminal entre sujeto y verbo.
- En E: Coma criminal tras proposición adjetiva que conforma el sujeto.
- En C: La palabra *jóvenes* es el vocativo (interlocutor al que se exhorta) y se encuentra correctamente aislada entre dos comas en posición medial.
**Respuesta:** **C**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Analice con rigor el siguiente texto y determine el número de errores normativos de puntuación y mayúsculas que contiene:
> *"El Rey de España, y el Presidente francés llegaron a Arequipa, la ciudad blanca; para inaugurar el congreso internacional de la lengua española en Primavera."*

- A) 4 errores
- B) 5 errores
- C) 6 errores
- D) 7 errores
- E) 8 errores

**Resolución Paso a Paso:**
Examinemos minuciosamente cada elemento según la RAE:
1. *"El **Rey**..."* \rightarrow **Error 1:** Los cargos y títulos de nobleza van en minúscula (*el rey*).
2. *"...de España**, y** el..."* \rightarrow **Error 2:** No debe colocarse coma antes de la conjunción copulativa *y* cuando une dos elementos análogos que forman parte del mismo sujeto compuesto.
3. *"...el **Presidente**..."* \rightarrow **Error 3:** Los cargos públicos de estado van en minúscula (*el presidente*).
4. *"...la **ciudad blanca**..."* \rightarrow **Error 4:** Es un antonomástico/epíteto geográfico consagrado de Arequipa; debe escribirse con mayúsculas iniciales: *la Ciudad Blanca*.
5. *"...la Ciudad Blanca**; para** inaugurar..."* \rightarrow **Error 5:** Es impropio el uso del punto y coma para conectar una oración principal con una proposición subordinada adverbial de finalidad; debe ir coma o enlace directo sin puntuación (*la Ciudad Blanca para inaugurar...*).
6. *"...el **congreso internacional de la lengua española**..."* \rightarrow **Error 6:** Al ser el nombre formal de un certamen internacional oficial, los sustantivos y adjetivos que lo componen deben llevar mayúscula inicial: *Congreso Internacional de la Lengua Española*.
7. *"...en **Primavera**."* \rightarrow **Error 7:** Los nombres de las cuatro estaciones del año se escriben preceptivamente con minúscula (*primavera*).
Total exacto de incorrecciones normativas: **7 errores**.
**Respuesta:** **D**

---



# TEMA 07: DISCURSO ESCRITO Y NORMATIVA: PROPIEDADES TEXTUALES, SIGNOS DE PUNTUACIÓN Y USO DE MAYÚSCULAS Y MINÚSCULAS

---

---

## 3. FUNDAMENTACIÓN TEÓRICA RIGUROSA

### 3.1. Propiedades Fundamentales del Texto
Un texto es una unidad comunicativa máxima emitida por un hablante en una situación concreta con intención comunicativa. Posee tres propiedades constitutivas indispensables:

1. **Adecuación:** Adaptación del texto al contexto comunicativo, al perfil del destinatario y al canal. Exige elegir el registro lingüístico pertinente (formal, académico, coloquial) y respetar las convenciones de género discursivo.
2. **Coherencia:** Dimensión semántica y lógica del texto. Garantiza que el mensaje sea percibido como una unidad con sentido global.
   - *Principio de no contradicción:* Las ideas no deben entrar en colisión lógica.
   - *Principio de relación temática:* Todo enunciado debe guardar relación con el tema central (*tópico*).
   - *Principio de progresión temática:* El texto debe balancear la información conocida (*tema*) con información nueva aportada progresivamente (*rema*).
3. **Cohesión:** Dimensión sintáctica y léxica del texto. Es la red de conexiones explícitas que ligan las oraciones y párrafos entre sí.

---

### 3.2. Mecanismos de Cohesión Textual

#### A. Referencia Endofórica (Anáfora y Catáfora)
- **Anáfora:** Mecanismo en el que un pronombre, adverbio o determinante asume el significado de una palabra mencionada *previamente* en el texto:
  \text{Antecedente} \longrightarrow \mathbf{Elemento \ Anaf\acute{o}rico}
  *Ejemplo:* *Mario Vargas Llosa escribió La ciudad y los perros; **este** [anáfora] le valió reconocimiento mundial.*
- **Catáfora:** Mecanismo en el que un elemento anticipa a una palabra o frase que será explicada *posteriormente*:
  \mathbf{Elemento \ Cataf\acute{o}rico} \longrightarrow \text{Término Consecuente}
  *Ejemplo:* *Solo necesitas **tres cosas** para triunfar: disciplina, perseverancia y método.*

#### B. Elipsis y Sustitución Léxica
- **Elipsis:** Supresión intencionada de un elemento verbal o nominal fácilmente recuperable por el contexto para evitar redundancias fatigosas:
  *Mariano Melgar escribió yaravíes; Carlos Augusto Salaverry, poemas románticos.* (Elipsis del verbo *escribió* representada por la coma elíptica).
- **Sustitución Léxica:** Reemplazo de un término por un sinónimo (*médico* por *galeno*), un hiperónimo (*perro* por *animal*), o una perífrasis designativa (*Arequipa* por *la Ciudad Blanca*).

---

### 3.3. Normativa de Signos de Puntuación (Ortografía RAE)

#### A. La Coma (,) y sus Clases Canónicas

| Tipo de Coma | Función y Regla Ortográfica | Ejemplo Ilustrativo |
| :--- | :--- | :--- |
| **Coma Enumerativa** | Separa elementos análogos de una serie sintáctica, salvo los precedidos por *y, e, ni, o, u*. | *Compró cuadernos, lápices, borradores y reglas.* |
| **Coma Vocativa** | Aísla al interlocutor (vocativo) al que se dirige el emisor, sin importar su posición (inicio, medio o final). | ***Jóvenes**, luchen por sus sueños.* / *Luchen, **jóvenes**, por sus sueños.* |
| **Coma Elíptica** | Reemplaza a un verbo omitido que ya fue mencionado con anterioridad. | *Ella postula a Medicina; él, a Derecho.* |
| **Coma Explicativa / Incidental** | Encierra aclaraciones, aposiciones explicativas o precisiones accesorias. | *Arequipa, **tierra de volcanes**, fue fundada en 1540.* |
| **Coma Hiperbática** | Marca la alteración del orden lógico oracional cuando el Complemento Circunstancial se antepone al sujeto. | *Con mucho entusiasmo y dedicación, los alumnos repasaron la lección.* |
| **Coma Conjuntiva / Nexo** | Antecede a conjunciones adversativas breves (*pero, mas, sino*) o ilativas (*conque, luego*), o encierra locuciones adverbiales (*sin embargo, es decir, por ende*). | *Estudió con ahínco, **pero** no alcanzó el puntaje.* / *Rindió el examen; **por ende**, esperará los resultados.* |

> **PROHIBICIÓN ABSOLUTA RAE (Coma Criminal):** Está terminantemente prohibido colocar coma entre el **Sujeto** y el **Verbo Principal**, o entre el **Verbo** y su **Objeto Directo**:
> - *Incorrecto:* \times *Los alumnos de la facultad de medicina, salieron temprano.*
> - *Correcto:* \checkmark *Los alumnos de la facultad de medicina salieron temprano.*

#### B. El Punto y Coma (;)
1. **Separación de proposiciones yuxtapuestas complejas:** Cuando entre las oraciones ya existen comas internas:
   *Cada grupo presentó su proyecto: el primero, sobre biotecnología; el segundo, sobre física nuclear.*
2. **Ante conectores adversativos, concesivos o ilativos extensos:** Ante conectores como *sin embargo*, *no obstante*, *por consiguiente*, *en consecuencia*, cuando la oración anterior posee cierta extensión:
   *Los postulantes prepararon la prueba durante más de diez meses consecutivos**; sin embargo,** el nivel de exigencia superó toda expectativa previa.*

#### C. Los Dos Puntos (:)
1. **Tras anunciar una enumeración:** *Compró tres materiales indispensables: cemento, yeso y arena fina.* (No deben emplearse si la enumeración no tiene elemento anticipador: *Incorrecto:* \times *Compró: cemento, yeso y arena*).
2. **Precediendo a citas textuales literales:** *Sócrates sentenció: «Solo sé que nada sé».*
3. **Causa, efecto o conclusión sintética entre proposiciones:**
   *No entrenó adecuadamente durante las semanas previas: perdió la competencia por amplia ventaja.*

---

### 3.4. Normativa Académica de Letras Mayúsculas y Minúsculas (RAE 2010)

#### A. Minúscula Obligatoria en Casos Comúnmente Erróneos
1. **Cargos públicos, políticos, eclesiásticos o militares:** Van siempre en **minúscula**, vayan o no acompañados del nombre propio:
   *el presidente del Perú*, *el papa Francisco*, *el rey Felipe VI*, *el ministro de Economía*, *el arzobispo de Arequipa*, *el decano de la facultad*.
2. **Gentilicios, idiomas, días de la semana, meses y estaciones del año:**
   *peruano, arequipeño, inglés, castellano, lunes, diciembre, primavera, verano*.
3. **Puntos cardinales cuando designan la dirección o posición:**
   *rumbo al norte*, *viento del sur*, *el este de la ciudad* (Solo en mayúscula si forman parte de un nombre propio o entidad geopolítica: *América del Norte*, *Corea del Sur*).
4. **Tratamientos de cortesía en forma desarrollada:**
   *usted, señor, don, excelencia, reverendo* (En mayúscula solo sus abreviaturas: *Ud., Sr., D., Excma.*).

#### B. Mayúscula Inicial Obligatoria
1. **Nombres propios de personas, animales, topónimos y accidentes geográficos:**
   *Mariano Melgar*, *Arequipa*, *el río Chili* (nótese: *río* en minúscula, *Chili* en mayúscula), *el volcán Misti*, *el océano Pacífico*, *la cordillera de los Andes*.
2. **Nombres de asignaturas y carreras universitarias en contextos formales/académicos:**
   *Ingeniería Civil*, *Derecho Constitucional*, *Química Orgánica*.
3. **Títulos de obras de creación (libros, películas, canciones, pinturas):**
   Solo lleva mayúscula la **primera palabra** y los nombres propios contenidos en el título:
   *Cien años de soledad*, *La ciudad y los perros*, *Crimen y castigo*, *El mundo es ancho y ajeno*. (Salvo publicaciones periódicas: *El Comercio*, *La República*).
4. **Nombres de épocas históricas, movimientos cívico-militares y acontecimientos relevantes:**
   *el Renacimiento*, *la Edad Media*, *la Revolución Francesa*, *la Guerra del Pacífico*.

---

---

## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS

### 1. El Hack de los Cargos RAE: "Nadie es más que la minúscula"
Sin importar la jerarquía social, política, monárquica o religiosa:
\mathbf{p}\text{residente}, \ \mathbf{p}\text{apa}, \ \mathbf{r}\text{ey}, \ \mathbf{a}\text{lcalde}, \ \mathbf{m}\text{inistro} \longrightarrow \mathbf{Siempre \ en \ min\acute{u}scula}

### 2. Mnemotécnia de las Comas Clave: "V-E-H-I"
- **V**ocativa: Aísla al oyente (*Atiende, alumno*).
- **E**líptica: Reemplaza al verbo omitido (*Yo estudio; él, duerme*).
- **H**iperbática: Marca el desorden oracional del CC (*Ayer por la tarde, llovió*).
- **I**ncidental / Explicativa: Aclara entre pausas (*Arequipa, cuna de juristas, celebró*).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t07_s01_c01",
                    question = "La propiedad del texto que asegura la unidad temática y la ausencia de contradicciones lógicas entre sus enunciados se denomina:",
                    options = listOf(
                        "Coherencia",
                        "Elipsis",
                        "Cohesión",
                        "Adecuación"
                    ),
                    correctIndex = 0,
                    explanation = "La coherencia es la propiedad semántica que dota al texto de sentido global y lógico, asegurando que las ideas no se contradigan."
                ),
                Challenge(
                    id = "leng_t07_s01_c02",
                    question = "En la frase 'Ella solo trajo esto: su mochila y sus libros de estudio', el pronombre 'esto' cumple una función cohesiva de:",
                    options = listOf(
                        "Catáfora",
                        "Hiperonimia",
                        "Anáfora",
                        "Elipsis verbal"
                    ),
                    correctIndex = 0,
                    explanation = "'Esto' anticipa catafóricamente los elementos que serán explicitados a continuación ('su mochila y sus libros de estudio')."
                ),
                Challenge(
                    id = "leng_t07_s01_c03",
                    question = "En 'César Vallejo nació en Santiago de Chuco. El ilustre vate liberteño escribió Los heraldos negros', la expresión destacada constituye un caso de:",
                    options = listOf(
                        "Catáfora pronominal",
                        "Elipsis nominal",
                        "Conjunción adversativa",
                        "Sustitución léxica por perífrasis sinonímica"
                    ),
                    correctIndex = 3,
                    explanation = "Se sustituye el nombre propio 'César Vallejo' por la frase equivalente 'el ilustre vate liberteño' para evitar la repetición léxica."
                ),
                Challenge(
                    id = "leng_t07_s01_c04",
                    question = "En 'Los estudiantes llegaron temprano a la academia; luego, ingresaron a sus respectivas aulas', la omisión del sujeto en la segunda proposición es un mecanismo de:",
                    options = listOf(
                        "Diglosia",
                        "Catáfora",
                        "Elipsis",
                        "Anáfora adverbial"
                    ),
                    correctIndex = 2,
                    explanation = "La elipsis consiste en suprimir un elemento oracional (en este caso el sujeto 'los estudiantes') que se sobreentiende por el contexto anterior."
                ),
                Challenge(
                    id = "leng_t07_s01_c05",
                    question = "En 'Visitó Arequipa en agosto. Allí disfrutó de la arquitectura de sillar', el adverbio 'allí' funciona como un mecanismo de:",
                    options = listOf(
                        "Elipsis verbal",
                        "Sinonimia estricta",
                        "Anáfora locativa",
                        "Catáfora temporal"
                    ),
                    correctIndex = 2,
                    explanation = "El adverbio 'allí' remite anafóricamente a un lugar mencionado con anterioridad en el texto ('Arequipa')."
                ),
                Challenge(
                    id = "leng_t07_s01_c06",
                    question = "¿Qué propiedad del texto exige que un médico adapte su léxico si se dirige a una junta científica o a un paciente sin formación médica?",
                    options = listOf(
                        "Cohesión sintáctica",
                        "Elipsis",
                        "Coherencia interna",
                        "Adecuación textual"
                    ),
                    correctIndex = 3,
                    explanation = "La adecuación es la propiedad pragmática que exige adaptar el registro y tono lingüístico al destinatario y a la situación comunicativa."
                ),
                Challenge(
                    id = "leng_t07_s01_c07",
                    question = "El balance continuo entre la información conocida o previa (tema) y la información nueva que se añade (rema) corresponde al principio de:",
                    options = listOf(
                        "Progresión temática (coherencia)",
                        "Elipsis gramatical",
                        "Concordancia nominal",
                        "Catáfora absoluta"
                    ),
                    correctIndex = 0,
                    explanation = "La progresión temática asegura que el texto avance articulando datos conocidos (tema) con aportes informativos nuevos (rema)."
                ),
                Challenge(
                    id = "leng_t07_s01_c08",
                    question = "En la oración 'Compré flores para mi madre: ella siempre las aprecia', los términos 'ella' y 'las' son elementos:",
                    options = listOf(
                        "Exofóricos puros",
                        "Anafóricos",
                        "Catafóricos",
                        "Elípticos"
                    ),
                    correctIndex = 1,
                    explanation = "'Ella' remite anafóricamente a 'mi madre' y 'las' refiere anafóricamente a 'flores', recuperando antecedentes previos."
                ),
                Challenge(
                    id = "leng_t07_s01_c09",
                    question = "La contradicción explícita entre párrafos de un mismo ensayo vulnera de forma directa la propiedad de la:",
                    options = listOf(
                        "Coherencia",
                        "Cohesión",
                        "Puntuación",
                        "Adecuación"
                    ),
                    correctIndex = 0,
                    explanation = "La coherencia se rige por el principio de no contradicción lógica; sostener ideas contradictorias destruye la coherencia del texto."
                ),
                Challenge(
                    id = "leng_t07_s01_c10",
                    question = "En la frase 'Todos esperaban lo mismo: la publicación del padrón de ingresantes', el elemento catafórico es:",
                    options = listOf(
                        "Lo mismo",
                        "Todos",
                        "Padrón",
                        "Ingresantes"
                    ),
                    correctIndex = 0,
                    explanation = "La frase pronominal 'lo mismo' anticipa catafóricamente el concepto que se precisará a continuación tras los dos puntos."
                )
            )
        ),
        LessonNode(
            id = "leng_t07_s02",
            title = "Normativa de Signos de Puntuación: La Coma, el Punto y Coma y los Dos Puntos",
            theory = LessonTheory(
                title = "A. La Coma ($,$) y sus Clases Canónicas",
                content = """### 3.3. Normativa de Signos de Puntuación (Ortografía RAE)

#### A. La Coma (,) y sus Clases Canónicas

| Tipo de Coma | Función y Regla Ortográfica | Ejemplo Ilustrativo |
| :--- | :--- | :--- |
| **Coma Enumerativa** | Separa elementos análogos de una serie sintáctica, salvo los precedidos por *y, e, ni, o, u*. | *Compró cuadernos, lápices, borradores y reglas.* |
| **Coma Vocativa** | Aísla al interlocutor (vocativo) al que se dirige el emisor, sin importar su posición (inicio, medio o final). | ***Jóvenes**, luchen por sus sueños.* / *Luchen, **jóvenes**, por sus sueños.* |
| **Coma Elíptica** | Reemplaza a un verbo omitido que ya fue mencionado con anterioridad. | *Ella postula a Medicina; él, a Derecho.* |
| **Coma Explicativa / Incidental** | Encierra aclaraciones, aposiciones explicativas o precisiones accesorias. | *Arequipa, **tierra de volcanes**, fue fundada en 1540.* |
| **Coma Hiperbática** | Marca la alteración del orden lógico oracional cuando el Complemento Circunstancial se antepone al sujeto. | *Con mucho entusiasmo y dedicación, los alumnos repasaron la lección.* |
| **Coma Conjuntiva / Nexo** | Antecede a conjunciones adversativas breves (*pero, mas, sino*) o ilativas (*conque, luego*), o encierra locuciones adverbiales (*sin embargo, es decir, por ende*). | *Estudió con ahínco, **pero** no alcanzó el puntaje.* / *Rindió el examen; **por ende**, esperará los resultados.* |

> **PROHIBICIÓN ABSOLUTA RAE (Coma Criminal):** Está terminantemente prohibido colocar coma entre el **Sujeto** y el **Verbo Principal**, o entre el **Verbo** y su **Objeto Directo**:
> - *Incorrecto:* \times *Los alumnos de la facultad de medicina, salieron temprano.*
> - *Correcto:* \checkmark *Los alumnos de la facultad de medicina salieron temprano.*

#### B. El Punto y Coma (;)
1. **Separación de proposiciones yuxtapuestas complejas:** Cuando entre las oraciones ya existen comas internas:
   *Cada grupo presentó su proyecto: el primero, sobre biotecnología; el segundo, sobre física nuclear.*
2. **Ante conectores adversativos, concesivos o ilativos extensos:** Ante conectores como *sin embargo*, *no obstante*, *por consiguiente*, *en consecuencia*, cuando la oración anterior posee cierta extensión:
   *Los postulantes prepararon la prueba durante más de diez meses consecutivos**; sin embargo,** el nivel de exigencia superó toda expectativa previa.*

#### C. Los Dos Puntos (:)
1. **Tras anunciar una enumeración:** *Compró tres materiales indispensables: cemento, yeso y arena fina.* (No deben emplearse si la enumeración no tiene elemento anticipador: *Incorrecto:* \times *Compró: cemento, yeso y arena*).
2. **Precediendo a citas textuales literales:** *Sócrates sentenció: «Solo sé que nada sé».*
3. **Causa, efecto o conclusión sintética entre proposiciones:**
   *No entrenó adecuadamente durante las semanas previas: perdió la competencia por amplia ventaja.*

---



### 4.1. Regla de Oro del Orden Sintáctico Canónico y la Coma Hiperbática

\text{Orden Natural:} \quad \mathbf{Sujeto} + \mathbf{Verbo} + \mathbf{OD/OI} + \mathbf{CC} \quad (\text{Sin Comas})

\text{Orden Invertido:} \quad \mathbf{CC \ Extenso} \ , \quad \mathbf{Sujeto} + \mathbf{Verbo} + \mathbf{OD/OI} \quad (\mathbf{Coma \ Hiperb\acute{a}tica \ Obligatoria})

---



### Caso 1: La "Coma Asesina" en Veredictos Judiciales
Un juez redactó en su minuta original de sentencia:
> *"Perdón imposible, que cumpla la condena."*
Si por un error de tipeo un secretario judicial hubiera colocado la coma tras la primera palabra:
> *"Perdón, imposible que cumpla la condena."*
- **Análisis Pragmático-Sintáctico:** La primera formulación rechaza el indulto y ordena la prisión inmediata; la segunda concede el indulto y declara imposible la condena carcelaria. Una coma cambia el sentido polar del fallo judicial y la libertad de un ser humano.

---



### 2. Mnemotécnia de las Comas Clave: "V-E-H-I"
- **V**ocativa: Aísla al oyente (*Atiende, alumno*).
- **E**líptica: Reemplaza al verbo omitido (*Yo estudio; él, duerme*).
- **H**iperbática: Marca el desorden oracional del CC (*Ayer por la tarde, llovió*).
- **I**ncidental / Explicativa: Aclara entre pausas (*Arequipa, cuna de juristas, celebró*).

---



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **La Coma Criminal (Sujeto y Verbo):**
   - *Error:* *"Los postulantes con los puntajes más altos del examen de admisión, recibirán becas integrales."*
   - *Explicación RAE:* Jamás se interrumpe la unión de sujeto y verbo con coma simple, por más extenso que sea el sujeto.
2. **Mayúsculas en Títulos de Libros (Influencia Anglosajona):**
   - *Error (Calco del inglés):* \times *La Ciudad Y Los Perros*, \times *Cien Años De Soledad*.
   - *Norma Española RAE:* \checkmark *La ciudad y los perros*, \checkmark *Cien años de soledad* (solo la primera letra en mayúscula).
3. **Puntuación con comillas y puntos:**
   - *Norma Académica del Español:* El punto va siempre **fuera** de las comillas de cierre:
     *El decano exclamó: «Bienvenidos a la universidad».* (Nunca: *«...universidad.»*).

---



## 8. 5 PROBLEMAS RESUELTOS GRADUADOS



### Problema 1 (Nivel Básico: Uso de la Coma Vocativa)
Identifique la oración que presenta un uso correcto de la coma vocativa:
- A) Estimados alumnos, ingresarán al aula puntualmente.
- B) Entreguen inmediatamente, sus exámenes a los profesores.
- C) Por favor, jóvenes, guarden absoluto silencio durante la prueba.
- D) El profesor de química, explicó detalladamente la reacción redox.
- E) Todos los postulantes que vinieron temprano, ocuparon las primeras filas.

**Resolución:**
- En A: *Estimados alumnos* es el sujeto, no vocativo; se ha puesto coma criminal entre sujeto y verbo.
- En B: Se ha colocado coma entre el verbo (*Entreguen*) y su OD (*sus exámenes*).
- En D: Coma criminal entre sujeto y verbo.
- En E: Coma criminal tras proposición adjetiva que conforma el sujeto.
- En C: La palabra *jóvenes* es el vocativo (interlocutor al que se exhorta) y se encuentra correctamente aislada entre dos comas en posición medial.
**Respuesta:** **C**

---



### Problema 4 (Nivel Avanzado: Puntuación Integral y Dos Puntos)
Determine cuál de los siguientes enunciados presenta un uso ortográficamente intachable de los dos puntos:
- A) Los requisitos solicitados para la matrícula son: certificado de estudios y partida de nacimiento.
- B) Mi padre siempre repetía el célebre adagio: «Al que madruga, Dios lo ayuda».
- C) Todos los postulantes deben traer: lápiz, borrador, tajador y documento de identidad.
- D) Se compraron: cuadernos, carpetas y plumones para la nueva aula.
- E) El conferencista disertó sobre: la historia y evolución de la literatura universal.

**Resolución:**
Según la Ortografía de la RAE (2010), está prohibido colocar dos puntos entre el verbo y sus complementos si no hay un elemento anticipador o sintetizador previo (A, C, D y E cometen este error al romper el nexo directo del verbo con su OD o régimen preposicional).
En cambio, en **B**, los dos puntos introducen una cita textual directa entrecomillada precedida por un verbo de dicción y un sustantivo anunciador (*adagio:*). Su uso es plenamente canónico.
**Respuesta:** **B**

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. En la expresión: *"Solo compraré dos cosas: el libro y el cuaderno"*, la palabra subrayada *"dos cosas"* constituye un mecanismo de cohesión denominado:
   - A) Anáfora
   - B) Catáfora
   - C) Elipsis verbal
   - D) Coma hiperbática
   - *Respuesta correcta:* **B** (Anticipa a los elementos consecuentes que serán explicitados tras los dos puntos).
2. ¿Cuál de las siguientes palabras debe escribirse siempre en minúscula según la norma académica?
   - A) Renacimiento
   - B) Revolución Francesa
   - C) Papa (autoridad eclesiástica)
   - D) Arequipa
   - *Respuesta correcta:* **C** (Todos los cargos públicos y religiosos se escriben con minúscula).
3. En la oración *"Ayer, María aprobó el examen"*, la coma empleada es:
   - A) Vocativa
   - B) Elíptica
   - C) Hiperbática
   - D) Apositiva
   - *Respuesta correcta:* **C** (Marca la anteposición del complemento circunstancial de tiempo *Ayer*).

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Discurso Escrito y Normativa RAE] --> B[Propiedades del Texto]
    B --> B1[Adecuación: Registro y contexto comunicativo]
    B --> B2[Coherencia: Unidad temática, no contradicción, progresión temática]
    B --> B3[Cohesión: Mecanismos gramaticales y léxicos]

    B3 --> C[Mecanismos de Cohesión]
    C --> C1[Referencia Endofórica: Anáfora y Catáfora]
    C --> C2[Elipsis: Omisión de elementos consabidos]
    C --> C3[Conectores Lógicos Interoracionales]
    C --> C4[Sustitución Léxica: Sinónimos, Hiperónimos, Perífrasis]

    A --> D[Signos de Puntuación]
    D --> D1[La Coma: Vocativa, Elíptica, Hiperbática, Enumerativa, Explicativa, Conjuntiva]
    D --> D2[Punto y Coma: Proposiciones yuxtapuestas extensas, Ante conectores adversativos/ilativos]
    D --> D3[Dos Puntos: Cita textual, Enumeración anunciada, Consecuencia o causa sintética]

    A --> E[Normativa de Mayúsculas RAE 2010]
    E --> E1[Cargos públicos eclesiásticos y títulos en MINÚSCULA: rey, papa, presidente, decano]
    E --> E2[Días, meses, estaciones, monedas, gentilicios e idiomas en MINÚSCULA]
    E --> E3[Nombres propios, topónimos e instituciones en MAYÚSCULA]
```

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Analice con rigor el siguiente texto y determine el número de errores normativos de puntuación y mayúsculas que contiene:
> *"El Rey de España, y el Presidente francés llegaron a Arequipa, la ciudad blanca; para inaugurar el congreso internacional de la lengua española en Primavera."*

- A) 4 errores
- B) 5 errores
- C) 6 errores
- D) 7 errores
- E) 8 errores

**Resolución Paso a Paso:**
Examinemos minuciosamente cada elemento según la RAE:
1. *"El **Rey**..."* \rightarrow **Error 1:** Los cargos y títulos de nobleza van en minúscula (*el rey*).
2. *"...de España**, y** el..."* \rightarrow **Error 2:** No debe colocarse coma antes de la conjunción copulativa *y* cuando une dos elementos análogos que forman parte del mismo sujeto compuesto.
3. *"...el **Presidente**..."* \rightarrow **Error 3:** Los cargos públicos de estado van en minúscula (*el presidente*).
4. *"...la **ciudad blanca**..."* \rightarrow **Error 4:** Es un antonomástico/epíteto geográfico consagrado de Arequipa; debe escribirse con mayúsculas iniciales: *la Ciudad Blanca*.
5. *"...la Ciudad Blanca**; para** inaugurar..."* \rightarrow **Error 5:** Es impropio el uso del punto y coma para conectar una oración principal con una proposición subordinada adverbial de finalidad; debe ir coma o enlace directo sin puntuación (*la Ciudad Blanca para inaugurar...*).
6. *"...el **congreso internacional de la lengua española**..."* \rightarrow **Error 6:** Al ser el nombre formal de un certamen internacional oficial, los sustantivos y adjetivos que lo componen deben llevar mayúscula inicial: *Congreso Internacional de la Lengua Española*.
7. *"...en **Primavera**."* \rightarrow **Error 7:** Los nombres de las cuatro estaciones del año se escriben preceptivamente con minúscula (*primavera*).
Total exacto de incorrecciones normativas: **7 errores**.
**Respuesta:** **D**

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Cómo deben escribirse los cargos de presidente, rey, papa o ministro según la RAE 2010? | Obligatoriamente en **minúscula**, vayan o no acompañados por el nombre propio. |
| ¿Qué es la "Coma Criminal" y por qué está prohibida? | Es la coma puesta entre **Sujeto y Verbo** o entre **Verbo y Objeto Directo**. Destruye la cohesión sintáctica básica del núcleo oracional. |
| ¿Cómo se puntúan las citas textuales introducidas por dos puntos? | Los dos puntos van antes de abrir comillas y el punto final de la oración se coloca **después** de cerrar las comillas (*Dijo: «Hola».*). |
| ¿Cuál es la diferencia entre Anáfora y Catáfora? | La **anáfora** señala hacia **atrás** (recuerda un antecedente); la **catáfora** apunta hacia **adelante** (anticipa un consecuente). |
| ¿Los nombres de días, meses y estaciones del año llevan mayúscula en español? | **No**, se escriben preceptivamente con **minúscula** (*lunes, marzo, primavera*). |

---



### 3.2. Mecanismos de Cohesión Textual

#### A. Referencia Endofórica (Anáfora y Catáfora)
- **Anáfora:** Mecanismo en el que un pronombre, adverbio o determinante asume el significado de una palabra mencionada *previamente* en el texto:
  \text{Antecedente} \longrightarrow \mathbf{Elemento \ Anaf\acute{o}rico}
  *Ejemplo:* *Mario Vargas Llosa escribió La ciudad y los perros; **este** [anáfora] le valió reconocimiento mundial.*
- **Catáfora:** Mecanismo en el que un elemento anticipa a una palabra o frase que será explicada *posteriormente*:
  \mathbf{Elemento \ Cataf\acute{o}rico} \longrightarrow \text{Término Consecuente}
  *Ejemplo:* *Solo necesitas **tres cosas** para triunfar: disciplina, perseverancia y método.*

#### B. Elipsis y Sustitución Léxica
- **Elipsis:** Supresión intencionada de un elemento verbal o nominal fácilmente recuperable por el contexto para evitar redundancias fatigosas:
  *Mariano Melgar escribió yaravíes; Carlos Augusto Salaverry, poemas románticos.* (Elipsis del verbo *escribió* representada por la coma elíptica).
- **Sustitución Léxica:** Reemplazo de un término por un sinónimo (*médico* por *galeno*), un hiperónimo (*perro* por *animal*), o una perífrasis designativa (*Arequipa* por *la Ciudad Blanca*).

---



### 3.4. Normativa Académica de Letras Mayúsculas y Minúsculas (RAE 2010)

#### A. Minúscula Obligatoria en Casos Comúnmente Erróneos
1. **Cargos públicos, políticos, eclesiásticos o militares:** Van siempre en **minúscula**, vayan o no acompañados del nombre propio:
   *el presidente del Perú*, *el papa Francisco*, *el rey Felipe VI*, *el ministro de Economía*, *el arzobispo de Arequipa*, *el decano de la facultad*.
2. **Gentilicios, idiomas, días de la semana, meses y estaciones del año:**
   *peruano, arequipeño, inglés, castellano, lunes, diciembre, primavera, verano*.
3. **Puntos cardinales cuando designan la dirección o posición:**
   *rumbo al norte*, *viento del sur*, *el este de la ciudad* (Solo en mayúscula si forman parte de un nombre propio o entidad geopolítica: *América del Norte*, *Corea del Sur*).
4. **Tratamientos de cortesía en forma desarrollada:**
   *usted, señor, don, excelencia, reverendo* (En mayúscula solo sus abreviaturas: *Ud., Sr., D., Excma.*).

#### B. Mayúscula Inicial Obligatoria
1. **Nombres propios de personas, animales, topónimos y accidentes geográficos:**
   *Mariano Melgar*, *Arequipa*, *el río Chili* (nótese: *río* en minúscula, *Chili* en mayúscula), *el volcán Misti*, *el océano Pacífico*, *la cordillera de los Andes*.
2. **Nombres de asignaturas y carreras universitarias en contextos formales/académicos:**
   *Ingeniería Civil*, *Derecho Constitucional*, *Química Orgánica*.
3. **Títulos de obras de creación (libros, películas, canciones, pinturas):**
   Solo lleva mayúscula la **primera palabra** y los nombres propios contenidos en el título:
   *Cien años de soledad*, *La ciudad y los perros*, *Crimen y castigo*, *El mundo es ancho y ajeno*. (Salvo publicaciones periódicas: *El Comercio*, *La República*).
4. **Nombres de épocas históricas, movimientos cívico-militares y acontecimientos relevantes:**
   *el Renacimiento*, *la Edad Media*, *la Revolución Francesa*, *la Guerra del Pacífico*.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Adecuación:** Propiedad textual que evalúa la congruencia del enunciado con la situación comunicativa, el canal y el registro social del auditorio.
2. **Anáfora:** Mecanismo cohesivo de referencia endofórica en el cual un elemento lingüístico remite a una unidad expresada con anterioridad en el texto.
3. **Catáfora:** Fenómeno de anticipación semántica en el discurso donde una palabra anuncia a un elemento que se explicitará con posterioridad.
4. **Coherencia:** Cualidad semántica estructural que dota a un texto de sentido unitario, no contradicción y progresión lógica de la información.
5. **Cohesión:** Red formal de mecanismos léxicos y gramaticales (conectores, signos de puntuación, deixis) que entrelazan los constituyentes de un texto.
6. **Coma Criminal:** Incorrección ortográfica consistente en intercalar una coma entre el sujeto y el verbo principal, o entre el verbo y su objeto directo.
7. **Coma Elíptica:** Signo de puntuación que señala gráficamente la omisión voluntaria de un verbo sobreentendido o previamente enunciado.
8. **Coma Hiperbática:** Marca gráfica que señala el desorden del orden sintáctico canónico oracional al anteponerse un complemento circunstancial extenso.
9. **Elipsis:** Supresión elocutiva de una palabra o frase dentro del texto que el receptor puede reconstruir contextualmente sin pérdida de inteligibilidad.
10. **Progresión Temática:** Articulación dinámica de un texto en el cual la información conocida (*tema*) se vincula secuencialmente con aportes de información nueva (*rema*).

---



# TEMA 07: DISCURSO ESCRITO Y NORMATIVA: PROPIEDADES TEXTUALES, SIGNOS DE PUNTUACIÓN Y USO DE MAYÚSCULAS Y MINÚSCULAS

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t07_s02_c01",
                    question = "En la oración 'Estimados postulantes, presten atención a las indicaciones del docente', la coma empleada es de tipo:",
                    options = listOf(
                        "Coma elíptica",
                        "Coma vocativa",
                        "Coma enumerativa",
                        "Coma hiperbática"
                    ),
                    correctIndex = 1,
                    explanation = "'Estimados postulantes' es el vocativo al que se dirige el emisor; la coma que lo aísla se denomina coma vocativa."
                ),
                Challenge(
                    id = "leng_t07_s02_c02",
                    question = "En la frase 'Juan postuló a Ingeniería de Sistemas; Luis, a Ingeniería Electrónica', la coma colocada tras 'Luis' es:",
                    options = listOf(
                        "Coma elíptica",
                        "Coma explicativa",
                        "Coma hiperbática",
                        "Coma criminal"
                    ),
                    correctIndex = 0,
                    explanation = "La coma elíptica reemplaza al verbo 'postuló' para evitar su reiteración innecesaria en la segunda proposición."
                ),
                Challenge(
                    id = "leng_t07_s02_c03",
                    question = "¿Cuál de las siguientes oraciones incurre en el grave error ortográfico conocido como 'coma criminal' o censurada?",
                    options = listOf(
                        "Arequipa, la Ciudad Blanca, celebra su aniversario.",
                        "Por las mañanas, ellos estudian con ahínco.",
                        "Amigos míos, luchemos con valor.",
                        "Los jóvenes más disciplinados de la academia, obtuvieron altos puntajes."
                    ),
                    correctIndex = 3,
                    explanation = "La RAE prohíbe taxativamente colocar coma entre el sujeto ('Los jóvenes más disciplinados de la academia') y el verbo principal ('obtuvieron')."
                ),
                Challenge(
                    id = "leng_t07_s02_c04",
                    question = "En la oración 'Desde las primeras horas de la madrugada, los ciudadanos acudieron a sufragar', la coma utilizada es:",
                    options = listOf(
                        "Coma vocativa",
                        "Coma elíptica",
                        "Coma hiperbática",
                        "Coma conjuntiva"
                    ),
                    correctIndex = 2,
                    explanation = "Es coma hiperbática porque señala la alteración del orden sintáctico habitual al anteponerse un Complemento Circunstancial de tiempo."
                ),
                Challenge(
                    id = "leng_t07_s02_c05",
                    question = "El signo de puntuación adecuado para separar proposiciones yuxtapuestas que ya contienen comas en su interior es:",
                    options = listOf(
                        "Los puntos suspensivos",
                        "El punto y coma",
                        "El guion largo",
                        "La coma simple"
                    ),
                    correctIndex = 1,
                    explanation = "El punto y coma se emplea por norma para separar proposiciones complejas que ya presentan comas internas."
                ),
                Challenge(
                    id = "leng_t07_s02_c06",
                    question = "En la oración 'Estudió con dedicación durante todo el ciclo; sin embargo, los nervios le jugaron una mala pasada', el punto y coma se justifica porque:",
                    options = listOf(
                        "Reemplaza a un vocativo inicial",
                        "Encierra una aposición especificativa",
                        "Es una cita textual directa",
                        "Antecede a una locución conectiva adversativa extensa en una oración de cierta longitud"
                    ),
                    correctIndex = 3,
                    explanation = "Se escribe punto y coma antes de conectores como 'sin embargo', 'por consiguiente' o 'no obstante' cuando la proposición previa tiene cierta extensión."
                ),
                Challenge(
                    id = "leng_t07_s02_c07",
                    question = "¿En cuál de los siguientes casos es preceptivo el uso de los dos puntos (:)?",
                    options = listOf(
                        "Para separar elementos de una enumeración simple sin anunciador",
                        "Precediendo a la reproducción de una cita textual literal",
                        "Tras un sujeto extenso antes del verbo",
                        "Entre el verbo copulativo y su atributo"
                    ),
                    correctIndex = 1,
                    explanation = "Los dos puntos se escriben preceptivamente antes de citas textuales encomilladas ('Sócrates sentenció: «Solo sé que nada sé»')."
                ),
                Challenge(
                    id = "leng_t07_s02_c08",
                    question = "En 'César, el profesor de física, explicó el problema', las comas que encierran a 'el profesor de física' son:",
                    options = listOf(
                        "Comas vocativas dobles",
                        "Comas explicativas o apositivas",
                        "Comas hiperbáticas",
                        "Comas elípticas"
                    ),
                    correctIndex = 1,
                    explanation = "Encierran una aposición explicativa que aclara quién es César y que puede suprimirse sin romper la estructura de la oración."
                ),
                Challenge(
                    id = "leng_t07_s02_c09",
                    question = "La oración 'Compró: lápices, borradores y reglas' contiene un uso incorrecto de los dos puntos porque:",
                    options = listOf(
                        "La enumeración tiene menos de diez elementos",
                        "Debió utilizarse punto y coma",
                        "Los sustantivos son concretos",
                        "No deben usarse antes de una enumeración si no hay un elemento anticipador o anunciador expreso"
                    ),
                    correctIndex = 3,
                    explanation = "La RAE indica que los dos puntos no deben intercalarse entre el verbo y su complemento directo en una enumeración no anunciada."
                ),
                Challenge(
                    id = "leng_t07_s02_c10",
                    question = "En 'No logró el puntaje mínimo requerido: tendrá que postular nuevamente en la siguiente convocatoria', los dos puntos expresan una relación de:",
                    options = listOf(
                        "Cita de autoridad",
                        "Vocativo implícito",
                        "Causa - efecto o deducción consecuente",
                        "Duda o vacilación"
                    ),
                    correctIndex = 2,
                    explanation = "Los dos puntos conectan dos proposiciones en relación de causa a efecto o conclusión sin necesidad de conector explícito."
                )
            )
        ),
        LessonNode(
            id = "leng_t07_s03",
            title = "Normativa del Uso de Mayúsculas y Minúsculas (Ortografía RAE)",
            theory = LessonTheory(
                title = "A. La Coma ($,$) y sus Clases Canónicas",
                content = """# TEMA 07: DISCURSO ESCRITO Y NORMATIVA: PROPIEDADES TEXTUALES, SIGNOS DE PUNTUACIÓN Y USO DE MAYÚSCULAS Y MINÚSCULAS

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[Discurso Escrito y Normativa RAE] --> B[Propiedades del Texto]
    B --> B1[Adecuación: Registro y contexto comunicativo]
    B --> B2[Coherencia: Unidad temática, no contradicción, progresión temática]
    B --> B3[Cohesión: Mecanismos gramaticales y léxicos]

    B3 --> C[Mecanismos de Cohesión]
    C --> C1[Referencia Endofórica: Anáfora y Catáfora]
    C --> C2[Elipsis: Omisión de elementos consabidos]
    C --> C3[Conectores Lógicos Interoracionales]
    C --> C4[Sustitución Léxica: Sinónimos, Hiperónimos, Perífrasis]

    A --> D[Signos de Puntuación]
    D --> D1[La Coma: Vocativa, Elíptica, Hiperbática, Enumerativa, Explicativa, Conjuntiva]
    D --> D2[Punto y Coma: Proposiciones yuxtapuestas extensas, Ante conectores adversativos/ilativos]
    D --> D3[Dos Puntos: Cita textual, Enumeración anunciada, Consecuencia o causa sintética]

    A --> E[Normativa de Mayúsculas RAE 2010]
    E --> E1[Cargos públicos eclesiásticos y títulos en MINÚSCULA: rey, papa, presidente, decano]
    E --> E2[Días, meses, estaciones, monedas, gentilicios e idiomas en MINÚSCULA]
    E --> E3[Nombres propios, topónimos e instituciones en MAYÚSCULA]
```

---



### 3.4. Normativa Académica de Letras Mayúsculas y Minúsculas (RAE 2010)

#### A. Minúscula Obligatoria en Casos Comúnmente Erróneos
1. **Cargos públicos, políticos, eclesiásticos o militares:** Van siempre en **minúscula**, vayan o no acompañados del nombre propio:
   *el presidente del Perú*, *el papa Francisco*, *el rey Felipe VI*, *el ministro de Economía*, *el arzobispo de Arequipa*, *el decano de la facultad*.
2. **Gentilicios, idiomas, días de la semana, meses y estaciones del año:**
   *peruano, arequipeño, inglés, castellano, lunes, diciembre, primavera, verano*.
3. **Puntos cardinales cuando designan la dirección o posición:**
   *rumbo al norte*, *viento del sur*, *el este de la ciudad* (Solo en mayúscula si forman parte de un nombre propio o entidad geopolítica: *América del Norte*, *Corea del Sur*).
4. **Tratamientos de cortesía en forma desarrollada:**
   *usted, señor, don, excelencia, reverendo* (En mayúscula solo sus abreviaturas: *Ud., Sr., D., Excma.*).

#### B. Mayúscula Inicial Obligatoria
1. **Nombres propios de personas, animales, topónimos y accidentes geográficos:**
   *Mariano Melgar*, *Arequipa*, *el río Chili* (nótese: *río* en minúscula, *Chili* en mayúscula), *el volcán Misti*, *el océano Pacífico*, *la cordillera de los Andes*.
2. **Nombres de asignaturas y carreras universitarias en contextos formales/académicos:**
   *Ingeniería Civil*, *Derecho Constitucional*, *Química Orgánica*.
3. **Títulos de obras de creación (libros, películas, canciones, pinturas):**
   Solo lleva mayúscula la **primera palabra** y los nombres propios contenidos en el título:
   *Cien años de soledad*, *La ciudad y los perros*, *Crimen y castigo*, *El mundo es ancho y ajeno*. (Salvo publicaciones periódicas: *El Comercio*, *La República*).
4. **Nombres de épocas históricas, movimientos cívico-militares y acontecimientos relevantes:**
   *el Renacimiento*, *la Edad Media*, *la Revolución Francesa*, *la Guerra del Pacífico*.

---



### 1. El Hack de los Cargos RAE: "Nadie es más que la minúscula"
Sin importar la jerarquía social, política, monárquica o religiosa:
\mathbf{p}\text{residente}, \ \mathbf{p}\text{apa}, \ \mathbf{r}\text{ey}, \ \mathbf{a}\text{lcalde}, \ \mathbf{m}\text{inistro} \longrightarrow \mathbf{Siempre \ en \ min\acute{u}scula}



## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN

1. **La Coma Criminal (Sujeto y Verbo):**
   - *Error:* *"Los postulantes con los puntajes más altos del examen de admisión, recibirán becas integrales."*
   - *Explicación RAE:* Jamás se interrumpe la unión de sujeto y verbo con coma simple, por más extenso que sea el sujeto.
2. **Mayúsculas en Títulos de Libros (Influencia Anglosajona):**
   - *Error (Calco del inglés):* \times *La Ciudad Y Los Perros*, \times *Cien Años De Soledad*.
   - *Norma Española RAE:* \checkmark *La ciudad y los perros*, \checkmark *Cien años de soledad* (solo la primera letra en mayúscula).
3. **Puntuación con comillas y puntos:**
   - *Norma Académica del Español:* El punto va siempre **fuera** de las comillas de cierre:
     *El decano exclamó: «Bienvenidos a la universidad».* (Nunca: *«...universidad.»*).

---



### Problema 3 (Nivel Intermedio-Avanzado: Uso de Mayúsculas RAE 2010)
Señale la alternativa que exhibe un empleo estrictamente riguroso de las letras mayúsculas y minúsculas:
- A) El Papa Francisco visitará el Perú el próximo Verano.
- B) En la Facultad de Medicina, el Decano felicitó a los ingresantes.
- C) El presidente de la república promulgó la ley en el Palacio de Gobierno.
- D) El Río Amazonas desemboca con caudal imponente en el Océano Atlántico.
- E) Leí con fascinación la obra Tradiciones Peruanas de Ricardo Palma.

**Resolución:**
- En A: *Papa* y *Verano* deben escribirse con minúscula obligatoria (*el papa Francisco*, *verano*).
- En B: *Decano* es cargo, debe ir en minúscula (*el decano*).
- En D: El sustantivo genérico *río* debe ir en minúscula (*el río Amazonas*).
- En E: En los títulos de libros en español solo lleva mayúscula la primera palabra (*Tradiciones peruanas*).
- En C: *presidente* va en minúscula (cargo), *Palacio de Gobierno* en mayúscula (sede institucional histórica). Está perfectamente redactada según RAE.
**Respuesta:** **C**

---



### Problema 4 (Nivel Avanzado: Puntuación Integral y Dos Puntos)
Determine cuál de los siguientes enunciados presenta un uso ortográficamente intachable de los dos puntos:
- A) Los requisitos solicitados para la matrícula son: certificado de estudios y partida de nacimiento.
- B) Mi padre siempre repetía el célebre adagio: «Al que madruga, Dios lo ayuda».
- C) Todos los postulantes deben traer: lápiz, borrador, tajador y documento de identidad.
- D) Se compraron: cuadernos, carpetas y plumones para la nueva aula.
- E) El conferencista disertó sobre: la historia y evolución de la literatura universal.

**Resolución:**
Según la Ortografía de la RAE (2010), está prohibido colocar dos puntos entre el verbo y sus complementos si no hay un elemento anticipador o sintetizador previo (A, C, D y E cometen este error al romper el nexo directo del verbo con su OD o régimen preposicional).
En cambio, en **B**, los dos puntos introducen una cita textual directa entrecomillada precedida por un verbo de dicción y un sustantivo anunciador (*adagio:*). Su uso es plenamente canónico.
**Respuesta:** **B**

---



### Problema 5 (Nivel 5: Reto Titán / Jefe Final de Admisión - UNSA / UNMSM)
Analice con rigor el siguiente texto y determine el número de errores normativos de puntuación y mayúsculas que contiene:
> *"El Rey de España, y el Presidente francés llegaron a Arequipa, la ciudad blanca; para inaugurar el congreso internacional de la lengua española en Primavera."*

- A) 4 errores
- B) 5 errores
- C) 6 errores
- D) 7 errores
- E) 8 errores

**Resolución Paso a Paso:**
Examinemos minuciosamente cada elemento según la RAE:
1. *"El **Rey**..."* \rightarrow **Error 1:** Los cargos y títulos de nobleza van en minúscula (*el rey*).
2. *"...de España**, y** el..."* \rightarrow **Error 2:** No debe colocarse coma antes de la conjunción copulativa *y* cuando une dos elementos análogos que forman parte del mismo sujeto compuesto.
3. *"...el **Presidente**..."* \rightarrow **Error 3:** Los cargos públicos de estado van en minúscula (*el presidente*).
4. *"...la **ciudad blanca**..."* \rightarrow **Error 4:** Es un antonomástico/epíteto geográfico consagrado de Arequipa; debe escribirse con mayúsculas iniciales: *la Ciudad Blanca*.
5. *"...la Ciudad Blanca**; para** inaugurar..."* \rightarrow **Error 5:** Es impropio el uso del punto y coma para conectar una oración principal con una proposición subordinada adverbial de finalidad; debe ir coma o enlace directo sin puntuación (*la Ciudad Blanca para inaugurar...*).
6. *"...el **congreso internacional de la lengua española**..."* \rightarrow **Error 6:** Al ser el nombre formal de un certamen internacional oficial, los sustantivos y adjetivos que lo componen deben llevar mayúscula inicial: *Congreso Internacional de la Lengua Española*.
7. *"...en **Primavera**."* \rightarrow **Error 7:** Los nombres de las cuatro estaciones del año se escriben preceptivamente con minúscula (*primavera*).
Total exacto de incorrecciones normativas: **7 errores**.
**Respuesta:** **D**

---



## 10. FLASHCARDS DE REPASO ACTIVO

| Front (Pregunta / Disparador) | Back (Respuesta Nemotécnica / Precisa) |
| :--- | :--- |
| ¿Cómo deben escribirse los cargos de presidente, rey, papa o ministro según la RAE 2010? | Obligatoriamente en **minúscula**, vayan o no acompañados por el nombre propio. |
| ¿Qué es la "Coma Criminal" y por qué está prohibida? | Es la coma puesta entre **Sujeto y Verbo** o entre **Verbo y Objeto Directo**. Destruye la cohesión sintáctica básica del núcleo oracional. |
| ¿Cómo se puntúan las citas textuales introducidas por dos puntos? | Los dos puntos van antes de abrir comillas y el punto final de la oración se coloca **después** de cerrar las comillas (*Dijo: «Hola».*). |
| ¿Cuál es la diferencia entre Anáfora y Catáfora? | La **anáfora** señala hacia **atrás** (recuerda un antecedente); la **catáfora** apunta hacia **adelante** (anticipa un consecuente). |
| ¿Los nombres de días, meses y estaciones del año llevan mayúscula en español? | **No**, se escriben preceptivamente con **minúscula** (*lunes, marzo, primavera*). |

---



## 11. PREGUNTAS DE AUTOEVALUACIÓN RÁPIDA

1. En la expresión: *"Solo compraré dos cosas: el libro y el cuaderno"*, la palabra subrayada *"dos cosas"* constituye un mecanismo de cohesión denominado:
   - A) Anáfora
   - B) Catáfora
   - C) Elipsis verbal
   - D) Coma hiperbática
   - *Respuesta correcta:* **B** (Anticipa a los elementos consecuentes que serán explicitados tras los dos puntos).
2. ¿Cuál de las siguientes palabras debe escribirse siempre en minúscula según la norma académica?
   - A) Renacimiento
   - B) Revolución Francesa
   - C) Papa (autoridad eclesiástica)
   - D) Arequipa
   - *Respuesta correcta:* **C** (Todos los cargos públicos y religiosos se escriben con minúscula).
3. En la oración *"Ayer, María aprobó el examen"*, la coma empleada es:
   - A) Vocativa
   - B) Elíptica
   - C) Hiperbática
   - D) Apositiva
   - *Respuesta correcta:* **C** (Marca la anteposición del complemento circunstancial de tiempo *Ayer*).

---



### 3.2. Mecanismos de Cohesión Textual

#### A. Referencia Endofórica (Anáfora y Catáfora)
- **Anáfora:** Mecanismo en el que un pronombre, adverbio o determinante asume el significado de una palabra mencionada *previamente* en el texto:
  \text{Antecedente} \longrightarrow \mathbf{Elemento \ Anaf\acute{o}rico}
  *Ejemplo:* *Mario Vargas Llosa escribió La ciudad y los perros; **este** [anáfora] le valió reconocimiento mundial.*
- **Catáfora:** Mecanismo en el que un elemento anticipa a una palabra o frase que será explicada *posteriormente*:
  \mathbf{Elemento \ Cataf\acute{o}rico} \longrightarrow \text{Término Consecuente}
  *Ejemplo:* *Solo necesitas **tres cosas** para triunfar: disciplina, perseverancia y método.*

#### B. Elipsis y Sustitución Léxica
- **Elipsis:** Supresión intencionada de un elemento verbal o nominal fácilmente recuperable por el contexto para evitar redundancias fatigosas:
  *Mariano Melgar escribió yaravíes; Carlos Augusto Salaverry, poemas románticos.* (Elipsis del verbo *escribió* representada por la coma elíptica).
- **Sustitución Léxica:** Reemplazo de un término por un sinónimo (*médico* por *galeno*), un hiperónimo (*perro* por *animal*), o una perífrasis designativa (*Arequipa* por *la Ciudad Blanca*).

---



### 3.3. Normativa de Signos de Puntuación (Ortografía RAE)

#### A. La Coma (,) y sus Clases Canónicas

| Tipo de Coma | Función y Regla Ortográfica | Ejemplo Ilustrativo |
| :--- | :--- | :--- |
| **Coma Enumerativa** | Separa elementos análogos de una serie sintáctica, salvo los precedidos por *y, e, ni, o, u*. | *Compró cuadernos, lápices, borradores y reglas.* |
| **Coma Vocativa** | Aísla al interlocutor (vocativo) al que se dirige el emisor, sin importar su posición (inicio, medio o final). | ***Jóvenes**, luchen por sus sueños.* / *Luchen, **jóvenes**, por sus sueños.* |
| **Coma Elíptica** | Reemplaza a un verbo omitido que ya fue mencionado con anterioridad. | *Ella postula a Medicina; él, a Derecho.* |
| **Coma Explicativa / Incidental** | Encierra aclaraciones, aposiciones explicativas o precisiones accesorias. | *Arequipa, **tierra de volcanes**, fue fundada en 1540.* |
| **Coma Hiperbática** | Marca la alteración del orden lógico oracional cuando el Complemento Circunstancial se antepone al sujeto. | *Con mucho entusiasmo y dedicación, los alumnos repasaron la lección.* |
| **Coma Conjuntiva / Nexo** | Antecede a conjunciones adversativas breves (*pero, mas, sino*) o ilativas (*conque, luego*), o encierra locuciones adverbiales (*sin embargo, es decir, por ende*). | *Estudió con ahínco, **pero** no alcanzó el puntaje.* / *Rindió el examen; **por ende**, esperará los resultados.* |

> **PROHIBICIÓN ABSOLUTA RAE (Coma Criminal):** Está terminantemente prohibido colocar coma entre el **Sujeto** y el **Verbo Principal**, o entre el **Verbo** y su **Objeto Directo**:
> - *Incorrecto:* \times *Los alumnos de la facultad de medicina, salieron temprano.*
> - *Correcto:* \checkmark *Los alumnos de la facultad de medicina salieron temprano.*

#### B. El Punto y Coma (;)
1. **Separación de proposiciones yuxtapuestas complejas:** Cuando entre las oraciones ya existen comas internas:
   *Cada grupo presentó su proyecto: el primero, sobre biotecnología; el segundo, sobre física nuclear.*
2. **Ante conectores adversativos, concesivos o ilativos extensos:** Ante conectores como *sin embargo*, *no obstante*, *por consiguiente*, *en consecuencia*, cuando la oración anterior posee cierta extensión:
   *Los postulantes prepararon la prueba durante más de diez meses consecutivos**; sin embargo,** el nivel de exigencia superó toda expectativa previa.*

#### C. Los Dos Puntos (:)
1. **Tras anunciar una enumeración:** *Compró tres materiales indispensables: cemento, yeso y arena fina.* (No deben emplearse si la enumeración no tiene elemento anticipador: *Incorrecto:* \times *Compró: cemento, yeso y arena*).
2. **Precediendo a citas textuales literales:** *Sócrates sentenció: «Solo sé que nada sé».*
3. **Causa, efecto o conclusión sintética entre proposiciones:**
   *No entrenó adecuadamente durante las semanas previas: perdió la competencia por amplia ventaja.*

---



### Problema 1 (Nivel Básico: Uso de la Coma Vocativa)
Identifique la oración que presenta un uso correcto de la coma vocativa:
- A) Estimados alumnos, ingresarán al aula puntualmente.
- B) Entreguen inmediatamente, sus exámenes a los profesores.
- C) Por favor, jóvenes, guarden absoluto silencio durante la prueba.
- D) El profesor de química, explicó detalladamente la reacción redox.
- E) Todos los postulantes que vinieron temprano, ocuparon las primeras filas.

**Resolución:**
- En A: *Estimados alumnos* es el sujeto, no vocativo; se ha puesto coma criminal entre sujeto y verbo.
- En B: Se ha colocado coma entre el verbo (*Entreguen*) y su OD (*sus exámenes*).
- En D: Coma criminal entre sujeto y verbo.
- En E: Coma criminal tras proposición adjetiva que conforma el sujeto.
- En C: La palabra *jóvenes* es el vocativo (interlocutor al que se exhorta) y se encuentra correctamente aislada entre dos comas en posición medial.
**Respuesta:** **C**

---



### Caso 1: La "Coma Asesina" en Veredictos Judiciales
Un juez redactó en su minuta original de sentencia:
> *"Perdón imposible, que cumpla la condena."*
Si por un error de tipeo un secretario judicial hubiera colocado la coma tras la primera palabra:
> *"Perdón, imposible que cumpla la condena."*
- **Análisis Pragmático-Sintáctico:** La primera formulación rechaza el indulto y ordena la prisión inmediata; la segunda concede el indulto y declara imposible la condena carcelaria. Una coma cambia el sentido polar del fallo judicial y la libertad de un ser humano.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "leng_t07_s03_c01",
                    question = "Según la Ortografía de la Real Academia Española (2010), los cargos públicos e institucionales (como presidente, ministro, papa o rey) se escriben:",
                    options = listOf(
                        "Siempre con mayúscula inicial por respeto institucional",
                        "Siempre con minúscula inicial, acompañen o no al nombre propio",
                        "Con mayúscula solo si no aparece el nombre de la persona",
                        "Con mayúscula si pertenecen al poder ejecutivo"
                    ),
                    correctIndex = 1,
                    explanation = "La RAE determinó en su reforma del 2010 que todos los cargos (presidente, papa, rey, ministro, decano) son nombres comunes y van siempre en minúscula."
                ),
                Challenge(
                    id = "leng_t07_s03_c02",
                    question = "¿Cuál de las siguientes oraciones presenta un uso totalmente correcto de mayúsculas y minúsculas?",
                    options = listOf(
                        "El presidente de la república visitará Arequipa el próximo lunes.",
                        "El Presidente de la república visitará Arequipa el próximo lunes.",
                        "El presidente de la República visitará Arequipa el próximo Lunes.",
                        "El Presidente de la República visitará Arequipa el próximo Lunes."
                    ),
                    correctIndex = 0,
                    explanation = "'presidente' va en minúscula por ser cargo; 'república' en este contexto referencial genérico va en minúscula y los días de la semana ('lunes') van siempre en minúscula."
                ),
                Challenge(
                    id = "leng_t07_s03_c03",
                    question = "Al escribir nombres de accidentes geográficos como 'el río Chili' o 'el lago Titicaca', el sustantivo genérico (río, lago, volcán) debe escribirse con:",
                    options = listOf(
                        "Mayúscula obligatoria",
                        "Mayúscula solo en mapas",
                        "Minúscula obligatoria",
                        "Cursiva sin mayúscula"
                    ),
                    correctIndex = 2,
                    explanation = "Los sustantivos genéricos (río, lago, cordillera, volcán, océano) son nombres comunes y se escriben en minúscula; solo el nombre propio (Chili, Titicaca) lleva mayúscula."
                ),
                Challenge(
                    id = "leng_t07_s03_c04",
                    question = "¿Cuál es la norma de mayúsculas para los títulos de obras de creación literaria como novelas o ensayos?",
                    options = listOf(
                        "Todas las palabras del título deben llevar mayúscula inicial",
                        "No llevan mayúscula bajo ninguna circunstancia",
                        "Llevan mayúscula los sustantivos y adjetivos pero no los verbos",
                        "Solo lleva mayúscula la primera palabra del título y los nombres propios contenidos en él"
                    ),
                    correctIndex = 3,
                    explanation = "En los títulos de libros en español solo lleva mayúscula la palabra inicial y los nombres propios ('Cien años de soledad', 'La ciudad y los perros')."
                ),
                Challenge(
                    id = "leng_t07_s03_c05",
                    question = "En nombres de publicaciones periódicas como periódicos o revistas consagradas, la regla académica señala que:",
                    options = listOf(
                        "Se escriben con mayúscula inicial todas las palabras significativas (sustantivos, adjetivos, verbos)",
                        "Solo se escribe con mayúscula la primera palabra",
                        "Van totalmente en minúsculas",
                        "Depende del país de edición"
                    ),
                    correctIndex = 0,
                    explanation = "En diarios y revistas llevan mayúscula inicial todas las palabras sustantivas y adjetivas constitutivas: 'El Comercio', 'La República', 'El País'."
                ),
                Challenge(
                    id = "leng_t07_s03_c06",
                    question = "¿Cuál de las siguientes opciones presenta una mayúscula incorrecta según la normativa RAE?",
                    options = listOf(
                        "Estudia Derecho Constitucional en la universidad.",
                        "Los vientos provienen del Norte de la provincia.",
                        "El Renacimiento transformó el arte europeo.",
                        "El Ministerio de Salud emitió una alerta sanitaria."
                    ),
                    correctIndex = 1,
                    explanation = "Los puntos cardinales (norte, sur, este, oeste) cuando designan orientaciones geográficas van obligatoriamente con minúscula ('del norte de la provincia')."
                ),
                Challenge(
                    id = "leng_t07_s03_c07",
                    question = "Los nombres de los meses del año y de las estaciones climáticas se escriben con minúscula, salvo cuando:",
                    options = listOf(
                        "Se refieren a meses de verano",
                        "Aparecen en documentos notariales",
                        "Forman parte de fechas históricas o festividades oficiales (ej. el 28 de Julio)",
                        "Aparecen al final de una oración"
                    ),
                    correctIndex = 2,
                    explanation = "Los meses van en minúscula salvo en conmemoraciones cívicas o festividades nacionales consolidadas como 'el 28 de Julio' o 'el Primero de Mayo'."
                ),
                Challenge(
                    id = "leng_t07_s03_c08",
                    question = "En la expresión 'el papa Francisco celebró una misa en Roma', la palabra 'papa' se escribe con minúscula porque:",
                    options = listOf(
                        "No es una autoridad política",
                        "Es un nombre común de dignidad eclesiástica según la RAE 2010",
                        "Acompaña a un topónimo",
                        "Debe escribirse en latín"
                    ),
                    correctIndex = 1,
                    explanation = "Los títulos de dignidades civiles, nobiliarias o religiosas (papa, rey, obispo) son sustantivos comunes y se escriben en minúscula."
                ),
                Challenge(
                    id = "leng_t07_s03_c09",
                    question = "¿Cuál de los siguientes acontecimientos históricos está correctamente escrito con mayúsculas institucionales?",
                    options = listOf(
                        "La guerra del pacífico",
                        "La Guerra Del Pacífico",
                        "la guerra Del pacífico",
                        "La Guerra del Pacífico"
                    ),
                    correctIndex = 3,
                    explanation = "Los grandes acontecimientos y guerras históricas llevan mayúscula en los sustantivos y adjetivos que los integran: 'la Guerra del Pacífico'."
                ),
                Challenge(
                    id = "leng_t07_s03_c10",
                    question = "El nombre oficial de asignaturas o cursos académicos dentro de planes curriculares oficiales se escribe con:",
                    options = listOf(
                        "Minúscula obligatoria",
                        "Mayúscula solo en la primera letra del año",
                        "Mayúscula inicial en los sustantivos y adjetivos que las componen (ej. Álgebra Lineal)",
                        "Cursiva sin mayúsculas"
                    ),
                    correctIndex = 2,
                    explanation = "En contextos formales y académicos, los nombres de asignaturas y carreras llevan mayúscula inicial ('Química General', 'Ingeniería Civil')."
                )
            )
        )
    )
}
