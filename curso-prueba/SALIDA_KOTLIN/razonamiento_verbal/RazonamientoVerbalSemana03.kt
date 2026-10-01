package razonamiento_verbal

object RazonamientoVerbalSemana03 {

    val lessons = listOf(
        LessonNode(
            id = "rv_t03_s01",
            subjectId = "razonamiento_verbal",
            semana = 3,
            subtema = "3.1",
            title = "3.1 Tipología y Patrones en Series Verbales",
            theory = LessonTheory(
                content = """# TEMA III: Series y Clasificaciones Verbales

---



### Matriz de Indicadores de Logro Evaluados
1. **Completamiento de series verbales:** Deducir el patrón de sucesión semántica lineal, alternada o por parejas compuestas para prolongar la secuencia.
2. **Discriminación de término excluido:** Identificar y expulsar el vocablo discordante que no comparte el sema común esencial del conjunto.
3. **Clasificación por criterio implícito:** Descubrir el principio rector no declarado (intensidad, función, origen etimológico, ámbito geográfico) que agrupa a un elenco de palabras.
4. **Relaciones jerárquicas:** Reorganizar términos siguiendo cadenas de hiperonimia, hiponimia y meronimia.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                       SERIES Y CLASIFICACIONES VERBALES
                                       │
            ┌──────────────────────────┴──────────────────────────┐
            ▼                                                     ▼
     SERIES VERBALES                                      TÉRMINO EXCLUIDO
  (Continuidad de la Regla)                             (Detección del Intruso)
            │                                                     │
  ┌─────────┴─────────┐                                 ┌─────────┴─────────┐
  ▼                   ▼                                 ▼                   ▼
Lineales /        Alternadas /                      Por Campo           Por Grado /
Continuas         Por Parejas                       Semántico           Categoría
(A, B, C \dots) (A_1, B_1, A_2, B_2 \dots)       (No comparte        (Gramatical o
                                                     el archisemema)     intensidad dispar)
```



### Ontología de la Clasificación Léxica
- **Campo Semántico:** Conjunto de palabras que comparten un rasgo semántico nuclear común denominado **archisemema**.
- **Serie Verbal:** Secuencia ordenada de términos cuyos eslabones están vinculados por una ley de formación semántica explícita o implícita.
- **Término Excluido:** Elemento anómalo que, a pesar de presentar afinidad aparente o asociativa con el grupo, carece del sema definitorio indispensable que aglutina a los demás.
- **Cohipónimos:** Elementos que pertenecen a la misma especie o subclase dentro de un género rector compartido.

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1 Tipología y Patrones en Series Verbales

#### A. Series Continuas (Lineales Simples)
Todos los términos de la serie comparten exactamente el mismo vínculo semántico directo de forma ininterrumpida:
- *Ejemplo:* *Gato, tigre, leopardo, jaguar, ...*
  - Regla: Todos son félidos (cohipónimos de la familia *Felidae*).
  - Continuación obligatoria: *Puma* o *Guepardo* (no lobo ni hiena).

#### B. Series Alternadas (Bimembres o Intercaladas)
La serie presenta dos leyes de formación entrelazadas en posiciones impares (1, 3, 5\dots) y pares (2, 4, 6\dots):
- *Ejemplo:* *Prólogo, epílogo; inicio, fin; génesis, ...*
  - Términos 1, 3 y 5 representan el principio; términos 2, 4 y 6 representan el desenlace.
  - Continuación en posición 6: *Apocalipsis* o *Consumación*.

#### C. Series por Parejas Analógicas (Compuestas)
Los términos se agrupan de dos en dos guardando una relación interna que se repite:
- *Ejemplo:* *Médico, bisturí; carpintero, serrucho; pintor, ...*
  - Estructura: [Sujeto_1 : Herramienta_1], [Sujeto_2 : Herramienta_2], [Sujeto_3 : ?]
  - Continuación: *Pincel* (no lienzo ni cuadro).



## 4. FORMULARIO MAESTRO DE SERIES Y CLASIFICACIONES

| Estructura del Ejercicio | Ecuación de Sucesión Semántica | Regla Operativa en Admisión |
| :--- | :--- | :--- |
| **Serie Lineal Homogénea** | X_{n+1} \in \text{Clase}(X_n) | Mantener el mismo nivel de jerarquía (especie con especie). |
| **Serie de Progresión Escalar** | I_1 < I_2 < I_3 < \dots < I_{n+1} | Si la serie crece en intensidad, la clave debe ser el grado máximo. |
| **Serie Analógica Doble** | (A : B) \sim (C : D) \sim (E : ?) | Identificar primero la relación intrapareja antes de buscar la clave. |
| **Término Excluido Polar** | \text{Semas}(T_i) \cap \text{Archisemema} = \emptyset | Buscar el término que viola la definición común del conjunto. |

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 2: "El Semáforo de Series"
- **Verde (Continua):** Sigue la misma línea recta sin doblar (*Lunes, martes, miércoles...*).
- **Amarillo (Alternada):** Salta un casillero para encontrar a tu hermano (*A, 1, B, 2, C...*).
- **Rojo (Compuesta):** Deténte a mirar la pareja completa antes de avanzar (*Perro : ladra ; gato : maúlla...*).

---



## 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)



### Hack 2: Descarte por Grado de Especialización Científica
Si una serie verbal incluye términos técnicos universitarios:
- *Troposfera, estratosfera, mesosfera, ...*
- Si en las opciones tienes *atmósfera* e *ionosfera*:
  - *Atmósfera* es el **hiperónimo** (el todo).
  - *Ionosfera* es otro **merónimo/cohipónimo** (una capa más del mismo nivel).
  - **HACK:** En series de admisión se completa con el **mismo nivel jerárquico**. Marca *ionosfera*.

---



### Ejercicio 1 (Nivel Básico: Serie Verbal Continua)
**Enunciado:** Identifique la palabra que completa correctamente la siguiente serie verbal:
*Quechua, aimara, shipibo, asháninka, ...*
A) Castellano  
B) Awajún  
C) Latín  
D) Guaraní  
E) Náhuatl  

**Resolución Paso a Paso:**
1. Analizamos el campo semántico de los términos dados:
   - Quechua y aimara: lenguas originarias amerindias andinas del Perú.
   - Shipibo y asháninka: lenguas originarias amazónicas del Perú.
   - Archisemema general: **Lenguas originarias e indígenas vivas habladas en el territorio nacional del Perú**.
2. Evaluamos las alternativas:
   - *Castellano:* Lengua romance de origen indoeuropeo traída en la conquista (no originaria prehispánica).
   - *Latín:* Lengua clásica itálica extinta.
   - *Guaraní:* Lengua indígena oficial de Paraguay.
   - *Náhuatl:* Lengua indígena de México.
   - *Awajún:* Lengua originaria viva de la familia jíbara hablada por las comunidades nativas de la selva peruana (Amazonas, San Martín, Loreto).
3. Awajún es el cohipónimo exacto que prolonga la serie de lenguas originarias del Perú.
**Respuesta:** B

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Serie Verbal Compuesta por Intensidad)
**Enunciado:** Complete la serie verbal con el término que corresponda según la lógica de intensidad creciente:
*Susurro, murmullo, voz, grito, ...*
A) Diálogo  
B) Bramido  
C) Canto  
D) Eco  
E) Sonido  

**Resolución Paso a Paso:**
1. Analizamos los términos de la serie:
   - *Susurro:* Emisión de voz con sonido imperceptible y suave (I_1).
   - *Murmullo:* Ruido confuso y suave de voces (I_2).
   - *Voz:* Emisión vocal con intensidad regular y normal (I_3).
   - *Grito:* Emisión de la voz en tono muy alto y con gran volumen (I_4).
2. Ley de formación: Escala de emisión acústica humana en progresión de **intensidad sonora estrictamente creciente** (I_1 < I_2 < I_3 < I_4 < I_5).
3. Buscamos el grado extremo superior (I_5):
   - *Diálogo / Canto / Eco / Sonido* no representan un nivel de volumen superior al grito.
   - *Bramido:* Voz muy potente y ensordecedora, grito desgarrador de furia o estrépito acústico emitido con fuerza descomunal.
4. *Bramido* culmina la escala de intensidad creciente.
**Respuesta:** B

---



### Ejercicio 4 (Nivel Avanzado DECO: Serie Alternada Mixta)
**Enunciado (Tipo San Marcos DECO / UNSA):** Determine los dos vocablos que continúan congruentemente la siguiente serie verbal:
*Iliada, Homero; Eneida, Virgilio; Divina Comedia, Dante; ... , ...*
A) Metamorfosis, Sófocles  
B) Jerusalén libertada, Torquato Tasso  
C) Edipo Rey, Ovidio  
D) Fausto, Shakespeare  
E) Decamerón, Petrarca  

**Resolución Paso a Paso:**
1. Descomponemos la estructura de la serie:
   - Par 1: *Iliada* (Epopeya clásica griega) \to *Homero* (su autor).
   - Par 2: *Eneida* (Epopeya clásica latina) \to *Virgilio* (su autor).
   - Par 3: *Divina Comedia* (Epopeya religiosa medieval/renacentista italiana) \to *Dante Alighieri* (su autor).
2. Ley de formación estructural:
   - **Obra maestra del género épico monumental en verso : Autor fundamental consagrado**.
3. Analizamos las alternativas:
   - *A) Metamorfosis, Sófocles:* La obra *Metamorfosis* es de Ovidio; Sófocles escribió tragedia. Asociación errónea.
   - *C) Edipo Rey, Ovidio:* *Edipo Rey* es tragedia de Sófocles. Asociación errónea.
   - *D) Fausto, Shakespeare:* *Fausto* es el drama poético de Goethe; Shakespeare no escribió Fausto. Asociación errónea.
   - *E) Decamerón, Petrarca:* El *Decamerón* es de Giovanni Boccaccio; Petrarca escribió el *Cancionero*. Asociación errónea.
   - *B) Jerusalén libertada, Torquato Tasso:* *Jerusalén libertada* es la gran epopeya del Renacimiento tardío italiano escrita por el poeta Torquato Tasso. Coincidencia exacta de obra épica y autor verídico.
**Respuesta:** B

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Archisemema:** Conjunto de semas comunes que define la pertenencia a un campo semántico determinado.
2. **Serie Verbal:** Secuencia lógica de términos regida por un criterio semántico recurrente.
3. **Término Excluido:** Ejercicio psicotécnico verbal que consiste en detectar el vocablo que no comparte la esencia del grupo.
4. **Cohiponimia:** Relación de paridad entre dos o más palabras que comparten el mismo hiperónimo directo.
5. **Heterogeneidad Categorial:** Disparidad en la función morfosintáctica (sustantivo, adjetivo, verbo) entre términos de una lista.
6. **Serie Alternada:** Secuencia donde los términos impares responden a un patrón y los pares a otro diferente.
7. **Holónimo:** Palabra que nombra una totalidad orgánica compuesta por partes integrantes.
8. **Merónimo:** Palabra que designa una parte componente de un todo mayor.
9. **Gradación:** Disposición de términos en orden creciente o decreciente de fuerza, tamaño o intensidad.
10. **Taxonomía:** Clasificación jerárquica y ordenada de elementos en clases, órdenes, familias y géneros.

---



### 3.2 El Método Formal para Resolver Término Excluido
Para expulsar al término intruso de manera infalible en el examen de admisión, se debe seguir el siguiente protocolo analítico:

```
[PASO 1] Definir con precisión el significado de la palabra premisa o de los términos base.
   │
   ▼
[PASO 2] Delimitar el ARCHISEMEMA (el rasgo común esencial que comparten casi todos).
   │
   ▼
[PASO 3] Evaluar las opciones verificando cuál NO encaja en el archisemema delimitado.
   │
   ▼
[PASO 4] Si todas comparten el campo, aplicar filtros secundarios:
         - ¿Tienen la misma categoría gramatical?
         - ¿Tienen la misma intensidad o grado?
         - ¿Tienen la misma connotación (positiva/peyorativa)?
```



### Mnemotecnia 1: "El Triángulo del Intruso" (\text{S-C-G})
Para resolver Término Excluido:
- **S**ema: ¿Qué rasgo mínimo comparten 4 de las palabras?
- **C**ampo: ¿En qué cajón temático caben juntas?
- **G**ramática: ¿Tienen la misma forma morfológica (todas sustantivos, todas verbos)?
- Si una palabra falla en **S**, **C** o **G**, ¡esa es la que se va!



### Hack 1: La Regla del "4 contra 1" (Aislamiento de la Premisa Ficticia)
En preguntas de término excluido donde no te den premisa en el encabezado (solo 5 alternativas):
1. No busques qué palabra te gusta menos.
2. Agrupa mentalmente **cuatro palabras** bajo un título común concreto.
3. La palabra solitaria que quede afuera sin poder entrar al título es automáticamente la clave de respuesta.



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Hiperónimo o Todo colado en el Término Excluido**
> En el grupo: *Húmero, fémur, tibia, peroné, esqueleto*. Muchos alumnos excluyen *fémur* porque es del muslo y los otros de la pierna o brazo. **¡ERROR GRAVÍSIMO!** El término excluido es **esqueleto**, porque los cuatro primeros son nombres de huesos específicos (cohipónimos), mientras que el esqueleto es el conjunto total (holónimo).

> [!CAUTION]
> **Trampa 2: La Falsa Asociación Afectiva o Subjetiva**
> Al buscar el término excluido de *Navidad*: *Pavo, panetón, pesebre, villancico, tristeza*. No excluyas una palabra porque "en tu casa no comen pavo". El campo semántico se fundamenta en rasgos denotativos objetivos de la tradición cultural compartida, no en vivencias personales.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la inteligencia artificial moderna, los sistemas de recomendación (Netflix, Spotify, Amazon) y los motores de búsqueda semántica (Google Vertex AI) utilizan la teoría de **espacios vectoriales de palabras** (*Word Embeddings* como Word2Vec). En estos espacios matemáticos multidimensionales, las palabras que pertenecen a una misma clasificación semántica o serie se agrupan en cúmulos densos (*clusters*). La detección de un término excluido equivale a identificar un valor atípico (*outlier*) en la nube de datos, lo que permite a los sistemas de ciberseguridad detectar fraudes informáticos y transacciones bancarias anómalas.

---



### Ejercicio 2 (Nivel Intermedio: Término Excluido por Archisemema)
**Enunciado (Modelo Admisión UNSA):** Elija la palabra que no guarda relación semántica con las demás:
**ABYECTO**
A) Vil  
B) Infame  
C) Ruin  
D) Indigente  
E) Despreciable  

**Resolución Paso a Paso:**
1. Definimos la palabra premisa:
   - *Abyecto:* Persona despreciable, vil en extremo, con una conducta moral baja y degradada.
2. Analizamos los términos propuestos:
   - *Vil:* Bajo, despreciable moralmente.
   - *Infame:* Que carece de honra, vil y perverso.
   - *Ruin:* Mezquino, desleal, de malas intenciones.
   - *Despreciable:* Digno de desprecio por sus bajas acciones.
   - *Indigente:* Persona que carece de recursos económicos suficientes para satisfacer sus necesidades básicas materiales (pobreza material, no bajeza moral).
3. El archisemema compartido por las opciones A, B, C y E es la **degradación moral o vileza ética**. *Indigente* describe una condición socioeconómica.
4. Por ende, *indigente* queda excluida del campo semántico.
**Respuesta:** D

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación Jerárquica y Falsos Cohipónimos)
**Enunciado (Nivel UNI / Máxima Exigencia):** Identifique el término que debe ser excluido del siguiente conjunto de vocablos botánicos:
A) Sequoia  
B) Ciprés  
C) Pino  
D) Alerce  
E) Roble  

**Resolución Paso a Paso:**
1. Analizamos la naturaleza biológico-taxonómica de cada planta leñosa:
   - *Sequoia (Secuoya):* Árbol perteneciente a la división de las **Gimnospermas** (coníferas).
   - *Ciprés:* Árbol del género *Cupressus*, perteneciente a las **Gimnospermas** (coníferas con hojas perennes y semillas en conos o piñas).
   - *Pino:* Árbol del género *Pinus*, perteneciente a las **Gimnospermas** (coníferas).
   - *Alerce:* Árbol del género *Larix*, perteneciente a las **Gimnospermas** (coníferas).
   - *Roble:* Árbol del género *Quercus*, perteneciente a la división de las **Angiospermas** (plantas con flores verdaderas y semillas protegidas dentro de un fruto carnoso o seco, como la bellota).
2. El archisemema que agrupa a cuatro de las alternativas es la condición taxonómica de ser **Gimnospermas / Coníferas**.
3. El *roble* es una planta **angiosperma dicotiledónea**, rompiendo el criterio biológico fundamental de clasificación.
4. Por tanto, el término excluido es **Roble**.
**Respuesta:** E

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué es el archisemema en una pregunta de término excluido?**  
  **A:** Es el núcleo de significado común que comparten cuatro de las alternativas y del cual carece la palabra intrusa.
- **Q: Si una serie verbal es "Prado, dehesa, estepa, sabana, ...", ¿qué tipo de serie es?**  
  **A:** Es una serie de cohipónimos de biomas o llanuras cubiertas de vegetación herbácea.
- **Q: ¿Por qué en un grupo de sustantivos abstractos se debe expulsar a un adjetivo aunque signifique lo mismo?**  
  **A:** Por el principio de uniformidad gramatical: los componentes de una serie o campo deben compartir la misma categoría morfológica.
- **Q: ¿Cómo se distingue una serie lineal de una alternada?**  
  **A:** Si el segundo término no guarda relación directa con el primero pero sí con el cuarto, la serie es alternada (salta posiciones).
- **Q: En una lista de instrumentos musicales: guitarra, violín, arpa, piano, flauta, ¿cuál es el término excluido?**  
  **A:** Flauta, porque es un instrumento de viento, mientras que todos los demás son instrumentos de cuerda (cordófonos).

---



### 3.3 Principales Criterios de Exclusión

1. **Por Falta de Sema Común (Ajenidad Categorial):** El vocablo no pertenece al género o familia semántica de los demás.
   - *Ejemplo:* *Oftalmología, Cardiología, Neurología, Astrología, Pediatría*.
   - Excluido: **Astrología** (es una pseudociencia adivinatoria, no una especialidad médica científica).
2. **Por Diferencia de Intensidad:** Todos los términos expresan un grado extremo salvo uno que es moderado o leve.
   - *Ejemplo:* *Pavor, Terror, Espanto, Desasosiego, Pánico*.
   - Excluido: **Desasosiego** (inquietud o desazón leve, mientras que los otros son estados de miedo paralizante extremo).
3. **Por Incongruencia de Categoría Gramatical:** Cuatro términos son sustantivos y uno es adjetivo, o cuatro son verbos y uno es sustantivo.
   - *Ejemplo:* *Generosidad, Altruismo, Filantropía, Bondadoso, Solidaridad*.
   - Excluido: **Bondadoso** (es un adjetivo calificativo; todos los demás son sustantivos abstractos de virtud).
4. **Por Relación Parte-Todo Distinta:** Cuatro son partes estructurales y uno es un accesorio externo.

---

---

## 3. DESARROLLO TEÓRICO FORMAL

### 3.1 Tipología y Patrones en Series Verbales

#### A. Series Continuas (Lineales Simples)
Todos los términos de la serie comparten exactamente el mismo vínculo semántico directo de forma ininterrumpida:
- *Ejemplo:* *Gato, tigre, leopardo, jaguar, ...*
  - Regla: Todos son félidos (cohipónimos de la familia *Felidae*).
  - Continuación obligatoria: *Puma* o *Guepardo* (no lobo ni hiena).

#### B. Series Alternadas (Bimembres o Intercaladas)
La serie presenta dos leyes de formación entrelazadas en posiciones impares (1, 3, 5\dots) y pares (2, 4, 6\dots):
- *Ejemplo:* *Prólogo, epílogo; inicio, fin; génesis, ...*
  - Términos 1, 3 y 5 representan el principio; términos 2, 4 y 6 representan el desenlace.
  - Continuación en posición 6: *Apocalipsis* o *Consumación*.

#### C. Series por Parejas Analógicas (Compuestas)
Los términos se agrupan de dos en dos guardando una relación interna que se repite:
- *Ejemplo:* *Médico, bisturí; carpintero, serrucho; pintor, ...*
  - Estructura: [Sujeto_1 : Herramienta_1], [Sujeto_2 : Herramienta_2], [Sujeto_3 : ?]
  - Continuación: *Pincel* (no lienzo ni cuadro).

### 3.2 El Método Formal para Resolver Término Excluido
Para expulsar al término intruso de manera infalible en el examen de admisión, se debe seguir el siguiente protocolo analítico:

```
[PASO 1] Definir con precisión el significado de la palabra premisa o de los términos base.
   │
   ▼
[PASO 2] Delimitar el ARCHISEMEMA (el rasgo común esencial que comparten casi todos).
   │
   ▼
[PASO 3] Evaluar las opciones verificando cuál NO encaja en el archisemema delimitado.
   │
   ▼
[PASO 4] Si todas comparten el campo, aplicar filtros secundarios:
         - ¿Tienen la misma categoría gramatical?
         - ¿Tienen la misma intensidad o grado?
         - ¿Tienen la misma connotación (positiva/peyorativa)?
```

### 3.3 Principales Criterios de Exclusión

1. **Por Falta de Sema Común (Ajenidad Categorial):** El vocablo no pertenece al género o familia semántica de los demás.
   - *Ejemplo:* *Oftalmología, Cardiología, Neurología, Astrología, Pediatría*.
   - Excluido: **Astrología** (es una pseudociencia adivinatoria, no una especialidad médica científica).
2. **Por Diferencia de Intensidad:** Todos los términos expresan un grado extremo salvo uno que es moderado o leve.
   - *Ejemplo:* *Pavor, Terror, Espanto, Desasosiego, Pánico*.
   - Excluido: **Desasosiego** (inquietud o desazón leve, mientras que los otros son estados de miedo paralizante extremo).
3. **Por Incongruencia de Categoría Gramatical:** Cuatro términos son sustantivos y uno es adjetivo, o cuatro son verbos y uno es sustantivo.
   - *Ejemplo:* *Generosidad, Altruismo, Filantropía, Bondadoso, Solidaridad*.
   - Excluido: **Bondadoso** (es un adjetivo calificativo; todos los demás son sustantivos abstractos de virtud).
4. **Por Relación Parte-Todo Distinta:** Cuatro son partes estructurales y uno es un accesorio externo.

---

---

## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Triángulo del Intruso" (\text{S-C-G})
Para resolver Término Excluido:
- **S**ema: ¿Qué rasgo mínimo comparten 4 de las palabras?
- **C**ampo: ¿En qué cajón temático caben juntas?
- **G**ramática: ¿Tienen la misma forma morfológica (todas sustantivos, todas verbos)?
- Si una palabra falla en **S**, **C** o **G**, ¡esa es la que se va!

### Mnemotecnia 2: "El Semáforo de Series"
- **Verde (Continua):** Sigue la misma línea recta sin doblar (*Lunes, martes, miércoles...*).
- **Amarillo (Alternada):** Salta un casillero para encontrar a tu hermano (*A, 1, B, 2, C...*).
- **Rojo (Compuesta):** Deténte a mirar la pareja completa antes de avanzar (*Perro : ladra ; gato : maúlla...*).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t03_s01_c01",
                    question = "En el razonamiento verbal, una 'Serie Verbal' se define formalmente como:",
                    options = listOf(
                        "Un poema lírico estructurado en versos alejandrinos.",
                        "Una lista de números enteros ordenados de forma descendente.",
                        "Un párrafo argumentativo que carece de signos de puntuación.",
                        "Una secuencia o conjunto ordenado de palabras que comparten un campo semántico común, regido por un patrón lógico o ley de formación discernible.",
                    ),
                    correctIndex = 3,
                    explanation = "La serie verbal evalúa la capacidad de descubrir la regla lógica o rasgo sémico compartido que vincula a un conjunto ordenado de vocablos para determinar qué término debe continuarla."
                ),
                Challenge(
                    id = "rv_t03_s01_c02",
                    question = "Dada la serie verbal: 'Cítrico, mandarina; legumbre, lenteja; cereal, ______', el término que completa correctamente la analogía interna de hiperónimo a hipónimo es:",
                    options = listOf(
                        "Trigo.",
                        "Manzana.",
                        "Zanahoria.",
                        "Tubérculo.",
                    ),
                    correctIndex = 0,
                    explanation = "La serie opera mediante pares de 'hiperónimo : hipónimo'. El trigo es el hipónimo específico correspondiente a la clase de los cereales."
                ),
                Challenge(
                    id = "rv_t03_s01_c03",
                    question = "Determine el término que completa lógicamente la serie verbal por sinonimia: 'Taciturno, silencioso, callado, ______'",
                    options = listOf(
                        "Locuaz.",
                        "Hablador.",
                        "Reservado.",
                        "Gárrulo.",
                    ),
                    correctIndex = 2,
                    explanation = "Todos los términos de la serie son sinónimos que aluden a la persona parca en el hablar; 'reservado' continúa coherentemente la serie, mientras que las otras son antónimos."
                ),
                Challenge(
                    id = "rv_t03_s01_c04",
                    question = "En la serie verbal alterna: 'Atenas, Grecia; Roma, Italia; París, Francia; ______', la alternativa que sigue el patrón de capital a país es:",
                    options = listOf(
                        "Berlín, Europa.",
                        "Madrid, España.",
                        "Londres, Támesis.",
                        "Lisboa, Océano.",
                    ),
                    correctIndex = 1,
                    explanation = "La regla de formación es constante: ciudad capital seguida de su respectivo Estado nacional. 'Madrid, España' satisface exactamente dicha relación."
                ),
                Challenge(
                    id = "rv_t03_s01_c05",
                    question = "Complete la serie de cohiponimia de mamíferos marinos: 'Ballena, delfín, orca, ______'",
                    options = listOf(
                        "Tiburón.",
                        "Atún.",
                        "Cachalote.",
                        "Mantarraya.",
                    ),
                    correctIndex = 2,
                    explanation = "La serie agrupa mamíferos cetáceos marinos; el cachalote es un cetáceo mamífero, a diferencia del tiburón, el atún o la mantarraya que son peces."
                ),
                Challenge(
                    id = "rv_t03_s01_c06",
                    question = "Analice la serie verbal de intensidad creciente: 'Brisa, viento, vendaval, ______'",
                    options = listOf(
                        "Huracán.",
                        "Neblina.",
                        "Rocío.",
                        "Calma.",
                    ),
                    correctIndex = 0,
                    explanation = "La serie describe fenómenos eólicos ordenados de menor a mayor fuerza destructiva, culminando coherentemente en el grado supremo: 'huracán'."
                ),
                Challenge(
                    id = "rv_t03_s01_c07",
                    question = "Dada la serie por parejas de antónimos: 'Elogio, censura; verdad, falsedad; soberbia, ______', el término que completa la relación de antonimia es:",
                    options = listOf(
                        "Humildad.",
                        "Altivez.",
                        "Arrogancia.",
                        "Orgullo.",
                    ),
                    correctIndex = 0,
                    explanation = "Cada par contiene dos términos opuestos; el antónimo exacto de soberbia es humildad."
                ),
                Challenge(
                    id = "rv_t03_s01_c08",
                    question = "Complete la serie de disciplinas de las ciencias formales: 'Aritmética, geometría, álgebra, ______'",
                    options = listOf(
                        "Biología.",
                        "Sociología.",
                        "Trigonometría.",
                        "Geología.",
                    ),
                    correctIndex = 2,
                    explanation = "La serie reúne ramas específicas de la matemática (ciencia formal); la trigonometría pertenece a este mismo campo formal."
                ),
                Challenge(
                    id = "rv_t03_s01_c09",
                    question = "Identifique el término que completa la serie de actitudes morales reprochables: 'Avaricia, crueldad, felonía, ______'",
                    options = listOf(
                        "Pérfida.",
                        "Filantropía.",
                        "Probidad.",
                        "Lealtad.",
                    ),
                    correctIndex = 0,
                    explanation = "La serie agrupa sustantivos que designan vicios o conductas inmorales graves (la felonía es traición); 'pérfida' (o perfidia) comparte la misma condición sémica negativa."
                ),
                Challenge(
                    id = "rv_t03_s01_c10",
                    question = "¿Cuál es el método idóneo para resolver series verbales complejas en un examen de admisión?",
                    options = listOf(
                        "Elegir al azar el término más corto de las alternativas.",
                        "Determinar el campo semántico preciso, analizar la relación entre pares adyacentes o alternos y contrastar la categoría gramatical de los vocablos.",
                        "Sumar el número de consonantes de cada palabra.",
                        "Buscar en un diccionario durante la rendición del examen.",
                    ),
                    correctIndex = 1,
                    explanation = "El método científico exige descubrir el nexo semántico estructurador, identificar si la secuencia es lineal o alternada y asegurar la concordancia categorial gramatical."
                ),
            )
        ),
        LessonNode(
            id = "rv_t03_s02",
            subjectId = "razonamiento_verbal",
            semana = 3,
            subtema = "3.2",
            title = "3.2 El Método Formal para Resolver Término Excluido",
            theory = LessonTheory(
                content = """### Matriz de Indicadores de Logro Evaluados
1. **Completamiento de series verbales:** Deducir el patrón de sucesión semántica lineal, alternada o por parejas compuestas para prolongar la secuencia.
2. **Discriminación de término excluido:** Identificar y expulsar el vocablo discordante que no comparte el sema común esencial del conjunto.
3. **Clasificación por criterio implícito:** Descubrir el principio rector no declarado (intensidad, función, origen etimológico, ámbito geográfico) que agrupa a un elenco de palabras.
4. **Relaciones jerárquicas:** Reorganizar términos siguiendo cadenas de hiperonimia, hiponimia y meronimia.

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                       SERIES Y CLASIFICACIONES VERBALES
                                       │
            ┌──────────────────────────┴──────────────────────────┐
            ▼                                                     ▼
     SERIES VERBALES                                      TÉRMINO EXCLUIDO
  (Continuidad de la Regla)                             (Detección del Intruso)
            │                                                     │
  ┌─────────┴─────────┐                                 ┌─────────┴─────────┐
  ▼                   ▼                                 ▼                   ▼
Lineales /        Alternadas /                      Por Campo           Por Grado /
Continuas         Por Parejas                       Semántico           Categoría
(A, B, C \dots) (A_1, B_1, A_2, B_2 \dots)       (No comparte        (Gramatical o
                                                     el archisemema)     intensidad dispar)
```



### Ontología de la Clasificación Léxica
- **Campo Semántico:** Conjunto de palabras que comparten un rasgo semántico nuclear común denominado **archisemema**.
- **Serie Verbal:** Secuencia ordenada de términos cuyos eslabones están vinculados por una ley de formación semántica explícita o implícita.
- **Término Excluido:** Elemento anómalo que, a pesar de presentar afinidad aparente o asociativa con el grupo, carece del sema definitorio indispensable que aglutina a los demás.
- **Cohipónimos:** Elementos que pertenecen a la misma especie o subclase dentro de un género rector compartido.

---



### 3.1 Tipología y Patrones en Series Verbales

#### A. Series Continuas (Lineales Simples)
Todos los términos de la serie comparten exactamente el mismo vínculo semántico directo de forma ininterrumpida:
- *Ejemplo:* *Gato, tigre, leopardo, jaguar, ...*
  - Regla: Todos son félidos (cohipónimos de la familia *Felidae*).
  - Continuación obligatoria: *Puma* o *Guepardo* (no lobo ni hiena).

#### B. Series Alternadas (Bimembres o Intercaladas)
La serie presenta dos leyes de formación entrelazadas en posiciones impares (1, 3, 5\dots) y pares (2, 4, 6\dots):
- *Ejemplo:* *Prólogo, epílogo; inicio, fin; génesis, ...*
  - Términos 1, 3 y 5 representan el principio; términos 2, 4 y 6 representan el desenlace.
  - Continuación en posición 6: *Apocalipsis* o *Consumación*.

#### C. Series por Parejas Analógicas (Compuestas)
Los términos se agrupan de dos en dos guardando una relación interna que se repite:
- *Ejemplo:* *Médico, bisturí; carpintero, serrucho; pintor, ...*
  - Estructura: [Sujeto_1 : Herramienta_1], [Sujeto_2 : Herramienta_2], [Sujeto_3 : ?]
  - Continuación: *Pincel* (no lienzo ni cuadro).



### 3.2 El Método Formal para Resolver Término Excluido
Para expulsar al término intruso de manera infalible en el examen de admisión, se debe seguir el siguiente protocolo analítico:

```
[PASO 1] Definir con precisión el significado de la palabra premisa o de los términos base.
   │
   ▼
[PASO 2] Delimitar el ARCHISEMEMA (el rasgo común esencial que comparten casi todos).
   │
   ▼
[PASO 3] Evaluar las opciones verificando cuál NO encaja en el archisemema delimitado.
   │
   ▼
[PASO 4] Si todas comparten el campo, aplicar filtros secundarios:
         - ¿Tienen la misma categoría gramatical?
         - ¿Tienen la misma intensidad o grado?
         - ¿Tienen la misma connotación (positiva/peyorativa)?
```



### 3.3 Principales Criterios de Exclusión

1. **Por Falta de Sema Común (Ajenidad Categorial):** El vocablo no pertenece al género o familia semántica de los demás.
   - *Ejemplo:* *Oftalmología, Cardiología, Neurología, Astrología, Pediatría*.
   - Excluido: **Astrología** (es una pseudociencia adivinatoria, no una especialidad médica científica).
2. **Por Diferencia de Intensidad:** Todos los términos expresan un grado extremo salvo uno que es moderado o leve.
   - *Ejemplo:* *Pavor, Terror, Espanto, Desasosiego, Pánico*.
   - Excluido: **Desasosiego** (inquietud o desazón leve, mientras que los otros son estados de miedo paralizante extremo).
3. **Por Incongruencia de Categoría Gramatical:** Cuatro términos son sustantivos y uno es adjetivo, o cuatro son verbos y uno es sustantivo.
   - *Ejemplo:* *Generosidad, Altruismo, Filantropía, Bondadoso, Solidaridad*.
   - Excluido: **Bondadoso** (es un adjetivo calificativo; todos los demás son sustantivos abstractos de virtud).
4. **Por Relación Parte-Todo Distinta:** Cuatro son partes estructurales y uno es un accesorio externo.

---



## 4. FORMULARIO MAESTRO DE SERIES Y CLASIFICACIONES

| Estructura del Ejercicio | Ecuación de Sucesión Semántica | Regla Operativa en Admisión |
| :--- | :--- | :--- |
| **Serie Lineal Homogénea** | X_{n+1} \in \text{Clase}(X_n) | Mantener el mismo nivel de jerarquía (especie con especie). |
| **Serie de Progresión Escalar** | I_1 < I_2 < I_3 < \dots < I_{n+1} | Si la serie crece en intensidad, la clave debe ser el grado máximo. |
| **Serie Analógica Doble** | (A : B) \sim (C : D) \sim (E : ?) | Identificar primero la relación intrapareja antes de buscar la clave. |
| **Término Excluido Polar** | \text{Semas}(T_i) \cap \text{Archisemema} = \emptyset | Buscar el término que viola la definición común del conjunto. |

---



### Mnemotecnia 1: "El Triángulo del Intruso" (\text{S-C-G})
Para resolver Término Excluido:
- **S**ema: ¿Qué rasgo mínimo comparten 4 de las palabras?
- **C**ampo: ¿En qué cajón temático caben juntas?
- **G**ramática: ¿Tienen la misma forma morfológica (todas sustantivos, todas verbos)?
- Si una palabra falla en **S**, **C** o **G**, ¡esa es la que se va!



### Hack 1: La Regla del "4 contra 1" (Aislamiento de la Premisa Ficticia)
En preguntas de término excluido donde no te den premisa en el encabezado (solo 5 alternativas):
1. No busques qué palabra te gusta menos.
2. Agrupa mentalmente **cuatro palabras** bajo un título común concreto.
3. La palabra solitaria que quede afuera sin poder entrar al título es automáticamente la clave de respuesta.



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Hiperónimo o Todo colado en el Término Excluido**
> En el grupo: *Húmero, fémur, tibia, peroné, esqueleto*. Muchos alumnos excluyen *fémur* porque es del muslo y los otros de la pierna o brazo. **¡ERROR GRAVÍSIMO!** El término excluido es **esqueleto**, porque los cuatro primeros son nombres de huesos específicos (cohipónimos), mientras que el esqueleto es el conjunto total (holónimo).

> [!CAUTION]
> **Trampa 2: La Falsa Asociación Afectiva o Subjetiva**
> Al buscar el término excluido de *Navidad*: *Pavo, panetón, pesebre, villancico, tristeza*. No excluyas una palabra porque "en tu casa no comen pavo". El campo semántico se fundamenta en rasgos denotativos objetivos de la tradición cultural compartida, no en vivencias personales.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En la inteligencia artificial moderna, los sistemas de recomendación (Netflix, Spotify, Amazon) y los motores de búsqueda semántica (Google Vertex AI) utilizan la teoría de **espacios vectoriales de palabras** (*Word Embeddings* como Word2Vec). En estos espacios matemáticos multidimensionales, las palabras que pertenecen a una misma clasificación semántica o serie se agrupan en cúmulos densos (*clusters*). La detección de un término excluido equivale a identificar un valor atípico (*outlier*) en la nube de datos, lo que permite a los sistemas de ciberseguridad detectar fraudes informáticos y transacciones bancarias anómalas.

---



## 9. BANCO DE EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel Básico: Serie Verbal Continua)
**Enunciado:** Identifique la palabra que completa correctamente la siguiente serie verbal:
*Quechua, aimara, shipibo, asháninka, ...*
A) Castellano  
B) Awajún  
C) Latín  
D) Guaraní  
E) Náhuatl  

**Resolución Paso a Paso:**
1. Analizamos el campo semántico de los términos dados:
   - Quechua y aimara: lenguas originarias amerindias andinas del Perú.
   - Shipibo y asháninka: lenguas originarias amazónicas del Perú.
   - Archisemema general: **Lenguas originarias e indígenas vivas habladas en el territorio nacional del Perú**.
2. Evaluamos las alternativas:
   - *Castellano:* Lengua romance de origen indoeuropeo traída en la conquista (no originaria prehispánica).
   - *Latín:* Lengua clásica itálica extinta.
   - *Guaraní:* Lengua indígena oficial de Paraguay.
   - *Náhuatl:* Lengua indígena de México.
   - *Awajún:* Lengua originaria viva de la familia jíbara hablada por las comunidades nativas de la selva peruana (Amazonas, San Martín, Loreto).
3. Awajún es el cohipónimo exacto que prolonga la serie de lenguas originarias del Perú.
**Respuesta:** B

---



### Ejercicio 2 (Nivel Intermedio: Término Excluido por Archisemema)
**Enunciado (Modelo Admisión UNSA):** Elija la palabra que no guarda relación semántica con las demás:
**ABYECTO**
A) Vil  
B) Infame  
C) Ruin  
D) Indigente  
E) Despreciable  

**Resolución Paso a Paso:**
1. Definimos la palabra premisa:
   - *Abyecto:* Persona despreciable, vil en extremo, con una conducta moral baja y degradada.
2. Analizamos los términos propuestos:
   - *Vil:* Bajo, despreciable moralmente.
   - *Infame:* Que carece de honra, vil y perverso.
   - *Ruin:* Mezquino, desleal, de malas intenciones.
   - *Despreciable:* Digno de desprecio por sus bajas acciones.
   - *Indigente:* Persona que carece de recursos económicos suficientes para satisfacer sus necesidades básicas materiales (pobreza material, no bajeza moral).
3. El archisemema compartido por las opciones A, B, C y E es la **degradación moral o vileza ética**. *Indigente* describe una condición socioeconómica.
4. Por ende, *indigente* queda excluida del campo semántico.
**Respuesta:** D

---



### Ejercicio 5 (Nivel 5: Boss Challenge - Discriminación Jerárquica y Falsos Cohipónimos)
**Enunciado (Nivel UNI / Máxima Exigencia):** Identifique el término que debe ser excluido del siguiente conjunto de vocablos botánicos:
A) Sequoia  
B) Ciprés  
C) Pino  
D) Alerce  
E) Roble  

**Resolución Paso a Paso:**
1. Analizamos la naturaleza biológico-taxonómica de cada planta leñosa:
   - *Sequoia (Secuoya):* Árbol perteneciente a la división de las **Gimnospermas** (coníferas).
   - *Ciprés:* Árbol del género *Cupressus*, perteneciente a las **Gimnospermas** (coníferas con hojas perennes y semillas en conos o piñas).
   - *Pino:* Árbol del género *Pinus*, perteneciente a las **Gimnospermas** (coníferas).
   - *Alerce:* Árbol del género *Larix*, perteneciente a las **Gimnospermas** (coníferas).
   - *Roble:* Árbol del género *Quercus*, perteneciente a la división de las **Angiospermas** (plantas con flores verdaderas y semillas protegidas dentro de un fruto carnoso o seco, como la bellota).
2. El archisemema que agrupa a cuatro de las alternativas es la condición taxonómica de ser **Gimnospermas / Coníferas**.
3. El *roble* es una planta **angiosperma dicotiledónea**, rompiendo el criterio biológico fundamental de clasificación.
4. Por tanto, el término excluido es **Roble**.
**Respuesta:** E

---



## 10. GLOSARIO DE TÉRMINOS CLAVE

1. **Archisemema:** Conjunto de semas comunes que define la pertenencia a un campo semántico determinado.
2. **Serie Verbal:** Secuencia lógica de términos regida por un criterio semántico recurrente.
3. **Término Excluido:** Ejercicio psicotécnico verbal que consiste en detectar el vocablo que no comparte la esencia del grupo.
4. **Cohiponimia:** Relación de paridad entre dos o más palabras que comparten el mismo hiperónimo directo.
5. **Heterogeneidad Categorial:** Disparidad en la función morfosintáctica (sustantivo, adjetivo, verbo) entre términos de una lista.
6. **Serie Alternada:** Secuencia donde los términos impares responden a un patrón y los pares a otro diferente.
7. **Holónimo:** Palabra que nombra una totalidad orgánica compuesta por partes integrantes.
8. **Merónimo:** Palabra que designa una parte componente de un todo mayor.
9. **Gradación:** Disposición de términos en orden creciente o decreciente de fuerza, tamaño o intensidad.
10. **Taxonomía:** Clasificación jerárquica y ordenada de elementos en clases, órdenes, familias y géneros.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **Q: ¿Qué es el archisemema en una pregunta de término excluido?**  
  **A:** Es el núcleo de significado común que comparten cuatro de las alternativas y del cual carece la palabra intrusa.
- **Q: Si una serie verbal es "Prado, dehesa, estepa, sabana, ...", ¿qué tipo de serie es?**  
  **A:** Es una serie de cohipónimos de biomas o llanuras cubiertas de vegetación herbácea.
- **Q: ¿Por qué en un grupo de sustantivos abstractos se debe expulsar a un adjetivo aunque signifique lo mismo?**  
  **A:** Por el principio de uniformidad gramatical: los componentes de una serie o campo deben compartir la misma categoría morfológica.
- **Q: ¿Cómo se distingue una serie lineal de una alternada?**  
  **A:** Si el segundo término no guarda relación directa con el primero pero sí con el cuarto, la serie es alternada (salta posiciones).
- **Q: En una lista de instrumentos musicales: guitarra, violín, arpa, piano, flauta, ¿cuál es el término excluido?**  
  **A:** Flauta, porque es un instrumento de viento, mientras que todos los demás son instrumentos de cuerda (cordófonos).

---



### Hack 2: Descarte por Grado de Especialización Científica
Si una serie verbal incluye términos técnicos universitarios:
- *Troposfera, estratosfera, mesosfera, ...*
- Si en las opciones tienes *atmósfera* e *ionosfera*:
  - *Atmósfera* es el **hiperónimo** (el todo).
  - *Ionosfera* es otro **merónimo/cohipónimo** (una capa más del mismo nivel).
  - **HACK:** En series de admisión se completa con el **mismo nivel jerárquico**. Marca *ionosfera*.

---



### Ejercicio 3 (Nivel Intermedio-Avanzado: Serie Verbal Compuesta por Intensidad)
**Enunciado:** Complete la serie verbal con el término que corresponda según la lógica de intensidad creciente:
*Susurro, murmullo, voz, grito, ...*
A) Diálogo  
B) Bramido  
C) Canto  
D) Eco  
E) Sonido  

**Resolución Paso a Paso:**
1. Analizamos los términos de la serie:
   - *Susurro:* Emisión de voz con sonido imperceptible y suave (I_1).
   - *Murmullo:* Ruido confuso y suave de voces (I_2).
   - *Voz:* Emisión vocal con intensidad regular y normal (I_3).
   - *Grito:* Emisión de la voz en tono muy alto y con gran volumen (I_4).
2. Ley de formación: Escala de emisión acústica humana en progresión de **intensidad sonora estrictamente creciente** (I_1 < I_2 < I_3 < I_4 < I_5).
3. Buscamos el grado extremo superior (I_5):
   - *Diálogo / Canto / Eco / Sonido* no representan un nivel de volumen superior al grito.
   - *Bramido:* Voz muy potente y ensordecedora, grito desgarrador de furia o estrépito acústico emitido con fuerza descomunal.
4. *Bramido* culmina la escala de intensidad creciente.
**Respuesta:** B

---



### Ejercicio 4 (Nivel Avanzado DECO: Serie Alternada Mixta)
**Enunciado (Tipo San Marcos DECO / UNSA):** Determine los dos vocablos que continúan congruentemente la siguiente serie verbal:
*Iliada, Homero; Eneida, Virgilio; Divina Comedia, Dante; ... , ...*
A) Metamorfosis, Sófocles  
B) Jerusalén libertada, Torquato Tasso  
C) Edipo Rey, Ovidio  
D) Fausto, Shakespeare  
E) Decamerón, Petrarca  

**Resolución Paso a Paso:**
1. Descomponemos la estructura de la serie:
   - Par 1: *Iliada* (Epopeya clásica griega) \to *Homero* (su autor).
   - Par 2: *Eneida* (Epopeya clásica latina) \to *Virgilio* (su autor).
   - Par 3: *Divina Comedia* (Epopeya religiosa medieval/renacentista italiana) \to *Dante Alighieri* (su autor).
2. Ley de formación estructural:
   - **Obra maestra del género épico monumental en verso : Autor fundamental consagrado**.
3. Analizamos las alternativas:
   - *A) Metamorfosis, Sófocles:* La obra *Metamorfosis* es de Ovidio; Sófocles escribió tragedia. Asociación errónea.
   - *C) Edipo Rey, Ovidio:* *Edipo Rey* es tragedia de Sófocles. Asociación errónea.
   - *D) Fausto, Shakespeare:* *Fausto* es el drama poético de Goethe; Shakespeare no escribió Fausto. Asociación errónea.
   - *E) Decamerón, Petrarca:* El *Decamerón* es de Giovanni Boccaccio; Petrarca escribió el *Cancionero*. Asociación errónea.
   - *B) Jerusalén libertada, Torquato Tasso:* *Jerusalén libertada* es la gran epopeya del Renacimiento tardío italiano escrita por el poeta Torquato Tasso. Coincidencia exacta de obra épica y autor verídico.
**Respuesta:** B

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "rv_t03_s02_c01",
                    question = "En el examen de razonamiento verbal, el ejercicio de 'Término Excluido' evalúa fundamentalmente la habilidad para:",
                    options = listOf(
                        "Identificar qué palabra presenta una falta de tildación diacrítica.",
                        "Discriminar y apartar el vocablo que no comparte el campo semántico común o el principio de asociación lógica que agrupa a los demás miembros del grupo.",
                        "Contar los sinónimos arcaicos de una palabra.",
                        "Traducir un vocablo al quechua o aimara.",
                    ),
                    correctIndex = 1,
                    explanation = "El término excluido mide la capacidad de abstracción y delimitación semántica: se debe aislar el término que carece del sema común indispensable que une a la premisa con las otras opciones."
                ),
                Challenge(
                    id = "rv_t03_s02_c02",
                    question = "Identifique el TÉRMINO EXCLUIDO en el siguiente campo semántico: NOVELA",
                    options = listOf(
                        "Mito.",
                        "Fábula.",
                        "Cuento.",
                        "Ensayo.",
                    ),
                    correctIndex = 3,
                    explanation = "Novela, cuento, fábula y mito pertenecen al género narrativo de ficción ficcional; el ensayo pertenece al género argumentativo expositivo y reflexivo."
                ),
                Challenge(
                    id = "rv_t03_s02_c03",
                    question = "Identifique el TÉRMINO EXCLUIDO en el grupo de instrumentos musicales de cuerda: GUITARRA",
                    options = listOf(
                        "Violín.",
                        "Trompeta.",
                        "Arpa.",
                        "Laúd.",
                    ),
                    correctIndex = 1,
                    explanation = "La guitarra, el violín, el arpa y el laúd son instrumentos de cuerda (cordófonos); la trompeta es un instrumento de viento metal (aerófono)."
                ),
                Challenge(
                    id = "rv_t03_s02_c04",
                    question = "Determine el TÉRMINO EXCLUIDO en el campo semántico de los planetas del Sistema Solar: JÚPITER",
                    options = listOf(
                        "Marte.",
                        "Saturno.",
                        "Luna.",
                        "Venus.",
                    ),
                    correctIndex = 2,
                    explanation = "Júpiter, Marte, Saturno y Venus son planetas del sistema solar; la Luna es un satélite natural que orbita la Tierra."
                ),
                Challenge(
                    id = "rv_t03_s02_c05",
                    question = "Identifique el TÉRMINO EXCLUIDO por sinonimia: INDIGENCIA",
                    options = listOf(
                        "Opulencia.",
                        "Pobreza.",
                        "Miseria.",
                        "Penuria.",
                    ),
                    correctIndex = 0,
                    explanation = "Indigencia, pobreza, miseria y penuria son vocablos sinónimos que aluden a la carencia de bienes materiales; opulencia es su antónimo exacto (riqueza o abundancia)."
                ),
                Challenge(
                    id = "rv_t03_s02_c06",
                    question = "Identifique el TÉRMINO EXCLUIDO en la serie de órganos del aparato digestivo: ESTÓMAGO",
                    options = listOf(
                        "Esófago.",
                        "Intestino.",
                        "Hígado.",
                        "Tráquea.",
                    ),
                    correctIndex = 3,
                    explanation = "El estómago, esófago, intestino e hígado forman parte integral del aparato digestivo; la tráquea es un conducto tubular perteneciente al aparato respiratorio."
                ),
                Challenge(
                    id = "rv_t03_s02_c07",
                    question = "Determine el TÉRMINO EXCLUIDO en el siguiente grupo: PINCEL",
                    options = listOf(
                        "Óleo.",
                        "Lienzo.",
                        "Caballete.",
                        "Bisturí.",
                    ),
                    correctIndex = 3,
                    explanation = "Pincel, lienzo, óleo y caballete son útiles y elementos del campo de la pintura artística; el bisturí es un instrumento quirúrgico de la medicina."
                ),
                Challenge(
                    id = "rv_t03_s02_c08",
                    question = "Identifique el TÉRMINO EXCLUIDO por categoría gramatical en el siguiente grupo: VELOZ",
                    options = listOf(
                        "Feroz.",
                        "Sagaz.",
                        "Audaz.",
                        "Rapidez.",
                    ),
                    correctIndex = 3,
                    explanation = "Veloz, feroz, sagaz y audaz son adjetivos calificativos; 'rapidez' es un sustantivo abstracto, por lo que queda excluida por discordancia de categoría gramatical."
                ),
                Challenge(
                    id = "rv_t03_s02_c09",
                    question = "Identifique el TÉRMINO EXCLUIDO en el campo de virtudes morales: VERACIDAD",
                    options = listOf(
                        "Honestidad.",
                        "Lealtad.",
                        "Egoísmo.",
                        "Justicia.",
                    ),
                    correctIndex = 2,
                    explanation = "Veracidad, honestidad, lealtad y justicia son valores o virtudes morales positivas; el egoísmo es un disvalor moral negativo."
                ),
                Challenge(
                    id = "rv_t03_s02_c10",
                    question = "¿Cuál es el primer paso metodológico obligatorio que debe realizarse al resolver un ejercicio de término excluido?",
                    options = listOf(
                        "Marcar la palabra que tenga el significado más complejo.",
                        "Definir con precisión el significado de la palabra premisa e identificar el campo semántico estricto que agrupa a la mayoría de opciones.",
                        "Buscar palabras que rimen entre sí.",
                        "Eliminar la primera alternativa de la lista sin leer las demás.",
                    ),
                    correctIndex = 1,
                    explanation = "El primer paso consiste en determinar el significado de la palabra base y abstraer el campo semántico rector para confrontar qué opción se aleja o contradice los semas nucleares compartidos."
                ),
            )
        )
    )
}
