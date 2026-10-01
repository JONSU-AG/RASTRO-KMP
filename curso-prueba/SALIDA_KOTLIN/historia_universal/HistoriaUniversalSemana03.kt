package historia_universal

object HistoriaUniversalSemana03 {

    val lessons = listOf(
        LessonNode(
            id = "huni_t03_s01",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.1",
            title = "3.1. Grecia Antigua: La Matriz Democrática y Cultural de Occidente",
            theory = LessonTheory(
                content = """## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["Antigüedad Clásica Grecorromana"] --> B["Mundo Griego (Hélade)"]
    A --> C["Mundo Romano (De la Aldea al Imperio)"]

    B --> B1["Etapas: Civilización Egea, Oscura, Arcaica, Clásica, Helenística"]
    B --> B2["Modelos Sociopolíticos: Esparta (Oligarquía) vs. Atenas (Democracia)"]
    B --> B3["Conflictos Bélicos: Guerras Médicas y Guerra del Peloponeso"]
    B --> B4["Legado: Filosofía, Democracia, Teatro, Historia, Cánones Estéticos"]

    C --> C1["Monarquía (753 - 509 a.C.): Dinastías Latina y Etrusca"]
    C --> C2["República (509 - 27 a.C.): Magistraturas, Luchas Sociales, Expansión Mediterránea, Crisis"]
    C --> C3["Imperio (27 a.C. - 476 d.C.): Principado (Pax Romana) y Dominado (Tetrarquía, Cristianismo)"]
    C --> C4["Legado: Derecho Romano (Ius Civile / Gentium), Ingeniería, Lenguas Romances"]
```

---



## 3. DESARROLLO TEÓRICO FORMAL



### 3.1. Grecia Antigua: La Matriz Democrática y Cultural de Occidente
El espacio geográfico griego (la Hélade) abarcó el sur de la península Balcánica, las islas del mar Egeo y las costas de Asia Menor (Jonia). Su relieve montuoso y fragmentado impidió la formación de un Estado unificado centralizado, propiciando el desarrollo de ciudades-estado independientes (**Polis**).

#### A. Periodización Histórica de Grecia:
1. **Civilización Egea (3000 - 1150 a.C.):**
   - *Minoica o Cretense:* Capital Cnosos. **Talasocracia** (dominio marítimo pacífico). Escritura Lineal A (no descifrada). El mito del Minotauro y el palacio laberíntico.
   - *Micénica:* Fundada por los aqueos en el Peloponeso. Ciudades fortificadas (Micenas, Tirinto). Guerra de Troya. Escritura **Lineal B** (forma arcaica de griego, descifrada por Michael Ventris).
2. **Época Oscura (1150 - 800 a.C.):** Invasión de pueblos indoeuropeos (dorios con armas de hierro, jonios y eolios). Colapso del mundo micénico y retroceso cultural.
3. **Época Arcaica (800 - 500 a.C.):** Consolidación de la Polis. Sobrepoblación y escasez de tierras que motivaron la **gran colonización griega** por el mar Mediterráneo y el mar Negro (fundación de colonias o *apoikias*, como Bizancio, Siracusa, Massalia). Reaparición de la escritura con el alfabeto fenicio adaptado.
4. **Época Clásica (500 - 323 a.C.):** Apogeo de Atenas y Esparta.
   - **Guerras Médicas (492 - 449 a.C.):** Enfrentamiento entre las polis griegas y el Imperio Persa (Aqueménida). Victorias atenienses en Maratón (Milcíades) y Salamina (Temístocles), y coaligada en Platea. Culmina con la **Paz de Calias** (los persas reconocen la autonomía griega en el Egeo).
   - **Siglo de Pericles:** Época dorada de Atenas. Reconstrucción de la Acrópolis (el Partenón, bajo supervisión de Fidias). Instauración de la **mistoforia** (pago a los ciudadanos por ejercer cargos públicos, garantizando el acceso real de las clases humildes al poder).
   - **Guerra del Peloponeso (431 - 404 a.C.):** Enfrentamiento civil hegemónico entre la **Liga de Delos** (Atenas, marítima y democrática) y la **Liga del Peloponeso** (Esparta, terrestre y oligárquica). Culmina con la victoria espartana, la instauración de la tiranía de los Treinta Tiranos y la decadencia general de las polis.
5. **Época Helenística (323 - 30 a.C.):** Filipo II de Macedonia somete a las polis (Batalla de Queronea, 338 a.C.). Su hijo **Alejandro Magno** forja un imperio colosal desde Grecia hasta el río Indo en la India. Tras su muerte, surge el **helenismo**: fusión sincretista de la cultura clásica griega con las tradiciones de Oriente Próximo.

---



### 3.2. Esparta y Atenas: Modelos Sociopolíticos Antagónicos

```
+---------------------------------------------------------------------------------------------------+
|                            COMPARATIVA INSTITUCIONAL: ESPARTA VS. ATENAS                           |
+-----------------------------+-----------------------------+---------------------------------------+
| CRITERIO                    | ESPARTA (Lacedemonia)       | ATENAS (Ática)                        |
+-----------------------------+-----------------------------+---------------------------------------+
| Origen Étnico               | Dorios invasores            | Jonios autóctonos                     |
| Vocación Geopolítica        | Militarista continental     | Marítima, mercantil y cosmopolita     |
| Legislador Fundamental      | Licurgo (La Gran Retra)     | Dracón, Solón, Clístenes, Pericles    |
+-----------------------------+-----------------------------+---------------------------------------+
| Estructura Social           | 1. Espartiatas u Homoioi    | 1. Ciudadanos (varones atenienses)    |
|                             |    (ciudadanos guerreros)   | 2. Metecos (extranjeros libres)       |
|                             | 2. Periecos (libres sin     | 3. Esclavos (mercancías humanas sin   |
|                             |    derechos políticos)      |    derecho civil)                     |
|                             | 3. Ilotas (siervos del      |                                       |
|                             |    Estado, atados a tierra) |                                       |
+-----------------------------+-----------------------------+---------------------------------------+
| Órganos de Gobierno         | - Diarquía (dos reyes)      | - Ekklesía (asamblea soberana de      |
|                             | - Éforos (5 magistrados)    |   todos los ciudadanos)               |
|                             | - Gerusía (consejo de 28    | - Bulé (consejo de los 500)           |
|                             |   ancianos de +60 años)     | - Heliea (tribunal popular)           |
|                             | - Apella (asamblea popular) | - Estrategas (10 jefes militares)     |
+-----------------------------+-----------------------------+---------------------------------------+
| Régimen Político            | Oligarquía aristocrática    | Democracia directa (isegoría e        |
|                             | y totalitaria               | isonomía)                             |
+-----------------------------+-----------------------------+---------------------------------------+
```

#### Evolución Histórica de la Democracia Ateniense:
1. **Dracón (621 a.C.):** Primer código de leyes escritas, caracterizado por su severidad implacable ("leyes draconianas"), buscando frenar la venganza privada entre clanes nobles (eupátridas).
2. **Solón (594 a.C.):** Abolió la esclavitud por deudas (*seisajtheia*), liberó a los siervos de la tierra (*hectemoroi*) e instauró una **timocracia** o plutocracia (división censitaria en 4 clases según la renta anual agrícola: pentacosiomedimnos, hippeis, zeugitas y thetes). Creó el Consejo de la Bulé de los 400 y el Tribunal de la Heliea.
3. **Pisístrato (561 - 527 a.C.):** Tirano que impulsó la agricultura campesina con créditos estatales, fomentó las obras públicas y fijó por escrito las epopeyas homéricas (*Ilíada* y *Odisea*).
4. **Clístenes (508 a.C.):** Considerado el **Padre de la Democracia**. Desarticuló el poder de los clanes aristocráticos al reorganizar el Ática en **10 tribus territoriales** (combinando demos de la costa, el interior y la ciudad). Creó la Bulé de los 500 y el **ostracismo** (destierro político por 10 años mediante votación popular en trozos de cerámica u *ostraka* para neutralizar a quienes conspiraban contra la democracia).
5. **Pericles (461 - 429 a.C.):** Consolidó el sistema democrático al implementar la **mistoforia** (estipendio o sueldo para los jurados y magistrados populares), garantizando que la pobreza no fuera obstáculo para gobernar.

---



## 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO



### Mnemotecnia 1: "DRA-SO-CLI-PE" para la Evolución Ateniense
- **DRA**: **Dra**cón (Leyes sangrientas escritas).
- **SO**: **So**lón (Abolió esclavitud por deudas y timocracia).
- **CLI**: **Clí**stenes (Padre de la democracia y ostracismo).
- **PE**: **Pe**ricles (Mistoforia y siglo de oro cultural).



## 6. TÉCNICAS Y ARTIFICIOS DE RESOLUCIÓN (HACKING PREUNIVERSITARIO)



### Hack 1: Distinción entre Guerras Médicas y Guerra del Peloponeso
- Si el choque es **Griegos vs. Persas** (bárbaros orientales) \implies **Guerras Médicas** (Victoria griega, salva la democracia naciente).
- Si el choque es **Griegos vs. Griegos** (Atenas vs. Esparta) \implies **Guerra del Peloponeso** (Hegemonía espartana, suicidio militar de las polis).



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El significado del Ostracismo**
> El ostracismo ateniense **NO era una pena penal por cometer delitos comunes** (asesinato o robo), sino una **medida preventiva puramente política**. Al desterrado no se le confiscaban sus bienes ni perdía sus derechos de propiedad; simplemente se le alejaba del Ática durante 10 años para neutralizar su excesiva popularidad o ambición de tiranía.

> [!CAUTION]
> **Trampa 2: La "Democracia" ateniense no incluía a la mayoría**
> En la Atenas de Pericles solo participaban en el gobierno los **ciudadanos varones mayores de edad**. Quedaban totalmente excluidos de los derechos políticos: las **mujeres**, los **metecos** (extranjeros) y los **esclavos** (que constituían cerca del 60\% de la población total).

> [!WARNING]
> **Trampa 3: Edicto de Milán vs. Edicto de Tesalónica**
> Gran distractor recurrente: Constantino decretó la **tolerancia religiosa** (Edicto de Milán, 313 d.C.), permitiendo al cristianismo existir sin persecución. Quien convirtió al cristianismo en la **religión oficial única y obligatoria** persiguiendo el paganismo fue **Teodosio** (Edicto de Tesalónica, 380 d.C.).

---



### Caso 2: El Juicio por Jurados y la Participación Ciudadana
El tribunal ateniense de la **Heliea**, integrado por 6000 ciudadanos sorteados anualmente que deliberaban y votaban en masa de forma secreta mediante fichas de bronce sobre la culpabilidad o inocencia de sus pares, es el antecedente histórico directo del sistema anglosajón y penal acusatorio de juicio por jurados populares vigente en el mundo democrático.

---



## 9. BANCO DE 5 EJERCICIOS RESUELTOS GRADUADOS



### Ejercicio 1 (Nivel 1 - Acceso Inmediato): Legislación de Solón
**Enunciado (UNSA):** En la antigua Atenas, las agudas contradicciones sociales entre la aristocracia eupátrida y los campesinos endeudados amenazaban con una sangrienta guerra civil. Para solucionar esta crisis, el arconte Solón implementó la llamada *seisajtheia*, consistente fundamentalmente en:
A) La ejecución sumaria de todos los terratenientes nobles.  
B) La abolición de las deudas campesinas y la supresión de la esclavitud por deudas.  
C) La prohibición de las naves comerciales en el puerto del Pireo.  
D) El reparto obligatorio de las riquezas de los metecos extranjeros.  
E) La instauración de la monarquía vitalicia hereditaria.

**Solución paso a paso:**
1. Solón fue nombrado árbitro y legislador en el 594 a.C.
2. Su medida social cumbre fue la *seisajtheia* o "descarga de fardos", mediante la cual canceló las deudas hipotecarias agrarias.
3. Prohibió de forma perpetua que una persona libre pudiera empeñar su propio cuerpo o el de sus familiares como garantía de pago financiero.
**Respuesta:** **B) La abolición de las deudas campesinas y la supresión de la esclavitud por deudas.**

---



### Ejercicio 5 (Nivel 5 - Reto Titán / Examen de Excelencia): Epigrafía Constitucional Clásica
**Enunciado (Reto Historiográfico Élite):** Determine la veracidad (V) o falsedad (F) de las siguientes proposiciones sobre la civilización clásica:
I. El ostracismo ateniense era dictaminado por los jueces del Areópago con confiscación irrevocable de bienes para el ciudadano condenado.  
II. La Ley de las Doce Tablas significó la consagración de la igualdad formal ante la ley civil escrita para patricios y plebeyos, aunque aún prohibía el matrimonio mixto entre ambos estamentos.  
III. La Paz de Calias puso fin a la Guerra del Peloponeso reconociendo la victoria marítima de Esparta sobre los atenienses.  
IV. La batalla de Actium (31 a.C.) consolidó el ascenso político de Octavio y significó el inicio formal de la transición hacia el régimen imperial romano.

A) F - V - F - V  
B) V - V - F - F  
C) F - F - V - V  
D) V - F - V - F  
E) F - V - V - F  

**Solución paso a paso:**
- **Afirmación I (FALSA):** El ostracismo era votado democráticamente por la **Ekklesía** en la plaza pública sobre trozos de barro (*ostrakon*), y **no** conllevaba la confiscación de tierras ni pérdida de patrimonio, sino únicamente el alejamiento geográfico por diez años.
- **Afirmación II (VERDADERA):** La Ley de las XII Tablas (450 a.C.) fijó el derecho por escrito garantizando certeza procesal, pero la Tabla XI ratificaba expresamente la prohibición del matrimonio mixto entre patricios y plebeyos (dicha prohibición recién cayó 5 años después con la Ley Canuleya).
- **Afirmación III (FALSA):** La Paz de Calias (449 a.C.) puso fin a las **Guerras Médicas** entre griegos y persas, no a la Guerra del Peloponeso (esta terminó con la toma de Atenas por Lisandro en 404 a.C.).
- **Afirmación IV (VERDADERA):** La victoria naval de Octavio y Agripa en Actium frente a Marco Antonio y Cleopatra liquidó el último vestigio de la República e inauguró el Principado de Augusto.
- Secuencia: F - V - F - V.
**Respuesta:** **A) F - V - F - V**.

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Polis:** Ciudad-estado independiente de la antigua Grecia compuesta por un núcleo urbano (*asty*) y su territorio agrícola circundante (*chora*).
2. **Ostracismo:** Mecanismo institucional ateniense consistente en el destierro político preventivo por diez años para conjurar el peligro de una tiranía.
3. **Mistoforia:** Remuneración económica o dieta diaria creada por Pericles para compensar a los ciudadanos atenienses por el ejercicio de funciones públicas.
4. **Homoioi:** Denominación dada a los espartiatas o ciudadanos de pleno derecho ("los iguales"), dedicados con exclusividad a la instrucción militar y la guerra.
5. **Ilotas:** Población autóctona de Laconia y Mesenia reducida a servidumbre estatal por los dorios en Esparta, obligada a cultivar la tierra ajena.
6. **Patricios:** Miembros de las familias fundadoras de Roma descendientes de los primeros *patres* senatoriales que monopolizaron la tierra y el poder político.
7. **Plebeyos:** Masa popular libre de Roma (campesinos, artesanos, comerciantes) que inicialmente carecía de derechos políticos y acceso al sacerdocio.
8. **Ius Civile:** Conjunto de leyes consuetudinarias y escritas privativas y exclusivas que regían para los ciudadanos romanos en sus relaciones jurídicas.
9. **Pax Romana:** Periodo de estabilidad política, prosperidad mercantil y florecimiento urbano que experimentó el Imperio bajo el Principado (siglos I y II d.C.).
10. **Tetrarquía:** Sistema de gobierno ideado por Diocleciano en el 293 d.C., basado en el mando simultáneo de dos Augustos y dos Césares para administrar las cuatro prefecturas del Imperio.

---



### 3.4. El Imperio Romano (27 a.C. - 476 d.C.)

#### A. El Alto Imperio o Principado (27 a.C. - 284 d.C.):
- **Octavio Augusto (27 a.C. - 14 d.C.):** Primer emperador (*Princeps*, *Imperator*, *Augustus*). Inauguró la **Pax Romana**, pacificación interna y florecimiento cultural (Siglo de Augusto: Virgilio, Horacio, Tito Livio; mecenazgo cultural promovido por Cayo Mecenas).
- **Dinastías Principales:**
  - *Julio-Claudia:* Tiberio (muerte de Jesús), Calígula (demencia cortesana), Claudio (conquista de Britania) y Nerón (incendio de Roma y primera persecución a cristianos).
  - *Flavia:* Vespasiano, Tito (erupción del Vesubio que destruyó Pompeya y toma de Jerusalén con la Diáspora judía en el 70 d.C.) y edificación del **Coliseo Romano**.
  - *Antoninos (Siglo de Oro de Roma):* Trajano (llevó al Imperio a su **máxima extensión territorial**, desde Escocia hasta Mesopotamia), Adriano (Muro de Adriano en Britania y codificación jurídica por Salvio Juliano) y Marco Aurelio (emperador filósofo estoico).
  - *Severos:* Caracalla promulgó en 212 d.C. el **Edicto de Caracalla** (o *Constitutio Antoniniana*), concediendo la **ciudadanía romana a todos los hombres libres del Imperio** con fines recaudatorios fiscales y de reclutamiento.

#### B. El Bajo Imperio o Dominado (284 - 476 d.C.):
- **Diocleciano (284 - 305 d.C.):** Superó la crisis del siglo III y el anarquismo militar instaurando la **Tetrarquía** (división del gobierno entre dos emperadores mayores o *Augustos* y dos menores o *Césares*). Desató la más sanguinaria persecución sistemática contra los cristianos.
- **Constantino I el Grande (306 - 337 d.C.):**
  - Promulgó el **Edicto de Milán (313 d.C.)**, decretando la **tolerancia religiosa y libertad de culto** para el cristianismo.
  - Convocó el Concilio de Nicea (325 d.C.) para combatir la herejía arriana.
  - Fundó una nueva capital imperial estratégica: **Constantinopla** (antigua Bizancio) en el año 330 d.C.
- **Teodosio I el Grande (379 - 395 d.C.):**
  - Promulgó el **Edicto de Tesalónica (380 d.C.)**, proclamando al cristianismo niceno como la **religión oficial y obligatoria del Imperio Romano**.
  - A su muerte en 395 d.C., dividió formal e irrevocablemente el Imperio entre sus dos hijos:
    - **Imperio Romano de Occidente:** Capital en Milán/Rávena, entregado a **Honorio**.
    - **Imperio Romano de Oriente:** Capital en Constantinopla, entregado a **Arcadio**.

#### C. La Caída del Imperio Romano de Occidente (476 d.C.):
Las incursiones masivas de los pueblos bárbaros germanos (visigodos saquean Roma en 410 con Alarico; vándalos la saquean en 455 con Genserico) colapsaron la precaria economía occidental. En el año **476 d.C.**, el caudillo de los hérulos, **Odoacro**, derroca al último emperador títere de Occidente, el infante **Rómulo Augústulo**, enviando las insignias imperiales a Constantinopla. Este hito marca el fin de la Edad Antigua y el inicio de la Edad Media.

---



### 3.3. Roma Antigua: Monarquía, República e Imperio

#### A. La Monarquía Romana (753 - 509 a.C.)
Fundada legendariamente por Rómulo y Remo a orillas del río Tíber. Dividida en dos periodos dinásticos:
- **Dinastía Latina (Agrícola y Religiosa):** Rómulo (creador del Senado), Numa Pompilio (organizador de la religión y el calendario de 12 meses), Tulio Hostilio (conquista de Alba Longa) y Anco Marcio (fundación del puerto de Ostia).
- **Dinastía Etrusca (Comercial y Urbana):** Tarquino el Antiguo (construcción de la Cloaca Máxima y el Circo Máximo), Servio Tulio (reforma censitaria militar y muralla serviana) y Tarquino el Soberbio (tirano despótico derrocado en 509 a.C. tras el ultraje y suicidio de Lucrecia).

#### B. La República Romana (509 - 27 a.C.)
Régimen oligárquico aristocrático donde el poder ejecutivo fue depositado en magistraturas colegiadas y electivas.

```
+---------------------------------------------------------------------------------------+
|                         ESTRUCTURA INSTITUCIONAL DE LA REPÚBLICA                      |
+-------------------+-------------------------------------------------------------------+
| ÓRGANO            | FUNCIONES Y CARACTERÍSTICAS                                       |
+-------------------+-------------------------------------------------------------------+
| 1. El Senado      | Órgano supremo tutelar de patricios vitalicios (300 senadores).   |
|                   | Dirigía la política exterior, el tesoro y aprobaba las leyes.     |
| 2. Magistraturas  | Colegiadas, temporales (1 año), electivas y gratuitas (ad honorem)|
|    - Cónsules     | Dos magistrados supremos con poder militar (*imperium*) y civil.  |
|    - Pretores     | Administraban justicia civil y militar.                           |
|    - Censores     | Elaboraban el censo cada 5 años y velaban por la moral pública.   |
|    - Ediles       | Seguridad ciudadana, abasto de granos y juegos públicos.          |
|    - Cuestores    | Recaudación fiscal, contabilidad pública y administración aduanera|
|    - Tribunos de  | Defensores de la plebe; portaban el derecho a veto (*veto/        |
|      la Plebe     | intercessio*) y gozaban de inmunidad sacrosanta inviolable.       |
| 3. Asambleas o    | Curiados (asuntos religiosos), Centuriados (militares, eligen     |
|    Comicios       | cónsules), Tributos (eligen ediles y tribunos de la plebe).       |
+-------------------+-------------------------------------------------------------------+
```

#### Las Conquistas Plebeyas (Lucha Patricio-Plebeya):
1. **Secesión del Monte Sacro (494 a.C.):** Huelga militar plebeya que forzó la creación del **Tribunado de la Plebe** y los Comicios de la Plebe.
2. **Ley de las Doce Tablas (450 a.C.):** Primer código legislativo escrito romano redactado por los decenviros; consagró la igualdad procesal civil.
3. **Ley Canuleya (445 a.C.):** Autorizó el matrimonio mixto legal entre patricios y plebeyos (*conubium*).
4. **Leyes Licinias-Sextias (367 a.C.):** Estableció que uno de los dos cónsules anuales debía ser obligatoriamente plebeyo y reguló la tenencia máxima de tierras públicas (*ager publicus*).
5. **Ley Ogulnia (300 a.C.):** Acceso plebeyo a los colegios sacerdotales (pontífices y augures).
6. **Ley Hortensia (287 a.C.):** Otorgó a los **Plebiscitos** (acuerdos de los comicios populares plebeyos) fuerza de ley general vinculante para toda Roma.

#### La Expansión Mediterránea y las Guerras Púnicas (264 - 146 a.C.):
- Enfrentamiento entre Roma y **Cartago** por el control económico y marítimo del Mediterráneo occidental:
  - *Primera Guerra Púnica:* Roma arrebata a Cartago el dominio de Sicilia, Córcega y Cerdeña.
  - *Segunda Guerra Púnica:* Gran campaña militar de **Aníbal Barca**, quien cruzó los Alpes con elefantes e infligió a Roma la humillante masacre de **Cannas** (216 a.C.). Roma reacciona bajo el mando de **Publio Cornelio Escipión "el Africano"**, derrotando a Aníbal en la **Batalla de Zama** (202 a.C.).
  - *Tercera Guerra Púnica:* Destrucción total y siembra de sal en Cartago por Escipión Emiliano (146 a.C.).
- Consecuencias: Roma se convierte en dueña absoluta del Mediterráneo (*Mare Nostrum*), pero el influjo masivo de prisioneros esclavos arruinó a los campesinos plebeyos, concentrando la propiedad en **latifundios** aristocráticos.

#### Crisis y Colapso de la República:
- **Reformas agrarias de los Hermanos Graco (133 - 121 a.C.):** Tiberio Graco (ley de reparto de tierras públicas a los desposeídos) y Cayo Graco (ley frumentaria de subsidio del trigo) fueron violentamente asesinados por la oligarquía senatorial.
- **Guerras Civiles:** Enfrentamiento fratricida entre facciones políticas:
  - *Mario (populares, reforma militar y profesionalización del ejército) vs. Sila (optimates / aristocráticos; dictadura y proscripciones).*
- **Primer Triunvirato (60 a.C.):** Alianza privada extralegal entre **Julio César, Pompeyo Magno y Marco Licinio Craso**. Tras la muerte de Craso en Carras contra los partos, César cruza el río Rubicón (*Alea iacta est*), derrota a Pompeyo en Farsalia y asume la dictadura perpetua, hasta ser asesinado en los Idus de Marzo (44 a.C.) por Bruto y Casio.
- **Segundo Triunvirato (43 a.C.):** Magistratura legal ratificada por el Senado entre **Octavio, Marco Antonio y Lépido**. Tras vencer a los asesinos de César en Filipos, Octavio derrota a la flota de Marco Antonio y Cleopatra VII en la **Batalla de Actium** (31 a.C.), proclamando el fin de la República.

---



## 4. CUADRO COMPARATIVO DEL DERECHO Y LAS INSTITUCIONES

\begin{array}{|l|l|l|l|}
\hline
\textbf{Norma / Hito} & \textbf{Cronología} & \textbf{Autor / Impulsor} & \textbf{Efecto Sociopolítico Trascendental} \\ \hline
\text{Reforma de Clístenes} & 508\text{ a.C.} & \text{Clístenes (Atenas)} & \text{Democracia: 10 tribus y ostracismo protector} \\ \hline
\text{Mistoforia de Pericles} & 450\text{ a.C.} & \text{Pericles (Atenas)} & \text{Sueldo público para la participación política del pobre} \\ \hline
\text{Ley de las XII Tablas} & 450\text{ a.C.} & \text{Decenviros (Roma)} & \text{Fin del monopolio judicial patricio consuetudinario} \\ \hline
\text{Ley Canuleya} & 445\text{ a.C.} & \text{Cayo Canuleyo (Roma)} & \text{Matrimonio civil mixto patricio-plebeyo} \\ \hline
\text{Ley Hortensia} & 287\text{ a.C.} & \text{Quinto Hortensio (Roma)} & \text{Plebiscitos tienen valor de ley vinculante general} \\ \hline
\text{Edicto de Caracalla} & 212\text{ d.C.} & \text{Caracalla (Roma)} & \text{Ciudadanía universal a todos los hombres libres del imperio} \\ \hline
\text{Edicto de Milán} & 313\text{ d.C.} & \text{Constantino (Roma)} & \text{Libertad de cultos y cese de persecución cristiana} \\ \hline
\text{Edicto de Tesalónica} & 380\text{ d.C.} & \text{Teodosio (Roma)} & \text{Cristianismo como religión oficial única del Estado} \\ \hline
\end{array}

---



### Ejercicio 2 (Nivel 2 - Intermedio Operativo): Instituciones Políticas Romanas
**Enunciado (UNMSM DECO):** Durante la República Romana, las tensiones entre patricios y plebeyos desembocaron en la creación de magistraturas específicas para garantizar la defensa de las libertades populares. Aquella magistratura cuyos titulares gozaban de sacrosantidad inviolable y poseían el derecho de oponerse mediante el veto a las resoluciones del Senado se denominaba:
A) Cuestura  
B) Tribunado de la Plebe  
C) Censura  
D) Consulado  
E) Pretura

**Solución paso a paso:**
1. Tras la rebelión del Monte Sacro (494 a.C.), los plebeyos conquistaron el derecho a elegir a sus propios representantes protectores.
2. Estos eran los **Tribunos de la Plebe**, cuya persona era sagrada e inviolable (*sacrosanctitas*).
3. Disponían del poder del *veto* para frenar mandatos dictatoriales o leyes aristocráticas contrarias a los intereses de la masa plebeya.
**Respuesta:** **B) Tribunado de la Plebe.**

---



### Ejercicio 3 (Nivel 3 - Contexto DECO Avanzado): Guerras Púnicas y Transformación Agraria
**Enunciado (UNMSM DECO / UNSA):** La victoria de Roma sobre Cartago en las Guerras Púnicas otorgó a la República el dominio indiscutible del Mediterráneo (*Mare Nostrum*). Sin embargo, al interior de la sociedad romana, este triunfo desencadenó una profunda crisis socioeconómica que se manifestó en:
A) La liquidación total de la esclavitud en todo el territorio itálico.  
B) La ruina masiva del campesinado plebeyo y la concentración de tierras en latifundios trabajados por prisioneros de guerra esclavizados.  
C) El retorno inmediato a la monarquía teocrática etrusca.  
D) La desmilitarización absoluta del ejército romano y el abandono de las calzadas.  
E) La pérdida definitiva de los derechos políticos conquistados por los plebeyos.

**Solución paso a paso:**
1. Los campesinos romanos debieron servir en legiones ultramarinas durante años, abandonando sus parcelas agrícolas.
2. Al retornar, sus campos estaban devastados y no podían competir contra la producción de grano barato y mano de obra esclava masiva traída de las conquistas.
3. Los senadores y patricios acapararon las tierras formando gigantescos **latifundios**, forzando al campesinado arruinado a migrar como proletariado urbano desocupado hacia Roma.
**Respuesta:** **B) La ruina masiva del campesinado plebeyo y la concentración de tierras en latifundios trabajados por prisioneros de guerra esclavizados.**

---



### Ejercicio 4 (Nivel 4 - Análisis Crítico / UNI CEPRE): El Cristianismo y el Estado Romano
**Enunciado (UNI):** Durante el Bajo Imperio Romano, la relación entre el poder estatal imperial y la creciente comunidad cristiana experimentó un cambio radical a lo largo del siglo IV d.C. Identifique la alternativa que describe correctamente la secuencia y contenido jurídico de dicho proceso:
A) Constantino decretó el cristianismo como religión oficial única en Tesalónica y Teodosio proclamó la libertad de culto en Milán.  
B) Diocleciano adoptó el cristianismo como ideología de la Tetrarquía y Constantino restauró el culto a Júpiter.  
C) Constantino garantizó la tolerancia y el cese de persecuciones mediante el Edicto de Milán (313 d.C.), mientras que Teodosio lo consagró como la religión oficial exclusiva a través del Edicto de Tesalónica (380 d.C.).  
D) Trajano persiguió el culto en Nicea y Caracalla concedió el sacerdocio a todos los cristianos bautizados.  
E) Rómulo Augústulo abolió el cristianismo antes de entregar el poder al caudillo Odoacro.

**Solución paso a paso:**
1. En el 313 d.C., Constantino promulgó el **Edicto de Milán**, concediendo la libertad de culto en todo el imperio.
2. Décadas más tarde, en el 380 d.C., el emperador hispano Teodosio I promulgó el **Edicto de Tesalónica**, clausurando los cultos paganos y convirtiendo formalmente al cristianismo católico niceno en la fe oficial del Imperio.
**Respuesta:** **C) Constantino garantizó la tolerancia y el cese de persecuciones mediante el Edicto de Milán (313 d.C.), mientras que Teodosio lo consagró como la religión oficial exclusiva a través del Edicto de Tesalónica (380 d.C.).**

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **P:** ¿Quién es considerado el Padre de la Democracia ateniense por crear las diez tribus territoriales y el ostracismo?
  - **R:** Clístenes (508 a.C.).
- **P:** ¿Qué conflicto bélico enfrentó a las polis griegas de la Liga de Delos contra la Liga del Peloponeso?
  - **R:** La Guerra del Peloponeso (431 - 404 a.C.).
- **P:** ¿Cómo se denominó la ley romana que legalizó los matrimonios mixtos entre patricios y plebeyos?
  - **R:** Ley Canuleya (445 a.C.).
- **P:** ¿En qué célebre batalla de la Segunda Guerra Púnica el general romano Escipión el Africano derrotó a Aníbal Barca?
  - **R:** Batalla de Zama (202 a.C.).
- **P:** ¿Qué emperador romano otorgó la ciudadanía a todos los hombres libres del Imperio mediante una famosa constitución en el 212 d.C.?
  - **R:** El emperador Caracalla (*Constitutio Antoniniana*).
- **P:** ¿Qué emperador legalizó el cristianismo y decretó la libertad de culto a través del Edicto de Milán?
  - **R:** Constantino I el Grande (313 d.C.).
- **P:** ¿Quién dividió definitivamente el Imperio Romano en el año 395 d.C. entre sus hijos Arcadio y Honorio?
  - **R:** El emperador Teodosio I el Grande.
- **P:** ¿En qué año y por obra de quién cayó el Imperio Romano de Occidente?
  - **R:** En el año 476 d.C., cuando el líder germano Odoacro derrocó a Rómulo Augústulo.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "huni_t03_s01_c01",
                    question = "La civilización cretense o minoica (florecida en la isla de Creta durante el III y II milenio a.C.) desarrolló una economía y poderío naval sobre el mar Egeo que los historiadores denominan:",
                    options = listOf(
                        "Autarquía continental cerrada",
                        "Feudalismo señorial marítimo",
                        "Protectorado colonial persa",
                        "Talasocracia",
                    ),
                    correctIndex = 3,
                    explanation = "La talasocracia minoica (del griego thalassa, mar, y kratos, poder) consistió en el control y pacificación comercial de las rutas marítimas del Mediterráneo oriental desde el fastuoso palacio laberíntico de Cnosos gobernado por el rey Minos."
                ),
                Challenge(
                    id = "huni_t03_s01_c02",
                    question = "En la organización sociopolítica de la polis de Esparta, las leyes fundamentales y el régimen militarista implacable fueron atribuidos tradicionalmente al legislador mítico:",
                    options = listOf(
                        "Solón",
                        "Dracón",
                        "Clístenes",
                        "Licurgo",
                    ),
                    correctIndex = 3,
                    explanation = "Licurgo redactó la 'Gran Retra', constitución espartana que instauró la diarquía (dos reyes), la gerusía (consejo de ancianos), los éforos (fiscalizadores del Estado) y el sistema educativo estatal obligatorio y militarizado (agogé)."
                ),
                Challenge(
                    id = "huni_t03_s01_c03",
                    question = "En la estructura social espartana, la población autóctona sometida despojada de libertad que pertenecía al Estado, carecía de derechos políticos y cultivaba las tierras de los espartiatas en régimen de servidumbre forzosa eran los:",
                    options = listOf(
                        "Metecos",
                        "Ilotas",
                        "Homoioi",
                        "Periecos",
                    ),
                    correctIndex = 1,
                    explanation = "Los ilotas eran siervos comunitarios del Estado espartano obligados a entregar la mitad de sus cosechas a los guerreros espartanos (homoioi); para mantenerlos intimidados, los jóvenes guerreros practicaban cacerías rituales nocturnas de ilotas (las cripteias)."
                ),
                Challenge(
                    id = "huni_t03_s01_c04",
                    question = "En el proceso evolutivo de las instituciones políticas de Atenas, el legislador Clístenes (508 a.C.) es considerado el 'Padre de la Democracia' porque:",
                    options = listOf(
                        "Restableció la monarquía hereditaria y la esclavitud por deudas.",
                        "Dividió a los ciudadanos en 10 tribus territoriales igualitarias rompiendo los privilegios aristocráticos de sangre, e instauró el ostracismo para desterrar a posibles tiranos.",
                        "Suprimió el ejército y la marina de guerra.",
                        "Permitió el voto de las mujeres y de los esclavos en el tribunal de la Heliea.",
                    ),
                    correctIndex = 1,
                    explanation = "Clístenes reorganizó el Ática mezclando ciudadanos de la costa, el llano y la montaña en diez tribus que elegían a 50 miembros cada una para la Bulé (Consejo de los 500) y creó el ostracismo (votación en pedazos de cerámica u óstrakon) para expulsar por diez años a ciudadanos peligrosos para la democracia."
                ),
                Challenge(
                    id = "huni_t03_s01_c05",
                    question = "El periodo de máximo florecimiento político, artístico y cultural de la democracia ateniense en el siglo V a.C., caracterizado por la retribución económica a los ciudadanos por ejercer cargos públicos (mistoforia) y la construcción del Partenón, se conoce como:",
                    options = listOf(
                        "La Tiranía de Pisístrato",
                        "La Época Helenística",
                        "El Arcontado de Solón",
                        "El Siglo de Pericles",
                    ),
                    correctIndex = 3,
                    explanation = "Bajo el liderazgo del estratega Pericles, Atenas consolidó la democracia directa: se pagó una dieta pública a los ciudadanos pobres para que pudieran asistir a la Asamblea del Pueblo (Ekklesía) y al tribunal popular, transformando la Acrópolis en la joya de la Hélade con obras de Fidias."
                ),
                Challenge(
                    id = "huni_t03_s01_c06",
                    question = "En la Primera Guerra Médica (490 a.C.), el ejército hoplita ateniense comandado por Milcíades infligió una histórica y aplastante derrota a las fuerzas del rey persa Darío I en la llanura costera de:",
                    options = listOf(
                        "Termópilas",
                        "Maratón",
                        "Salamina",
                        "Plateas",
                    ),
                    correctIndex = 1,
                    explanation = "En Maratón, la falange ateniense cargó a la carrera contra el ejército expedicionario persa venciéndolo decisivamente; el soldado Filípides corrió 42 kilómetros hasta Atenas para anunciar la victoria antes de caer muerto de agotamiento."
                ),
                Challenge(
                    id = "huni_t03_s01_c07",
                    question = "En la Segunda Guerra Médica (480 a.C.), la batalla naval decisiva donde la flota de trirremes atenienses ideada por Temístocles destruyó a la armada del emperador persa Jerjes I tuvo lugar en el estrecho de:",
                    options = listOf(
                        "Salamina",
                        "Mícale",
                        "Queronea",
                        "El Helesponto",
                    ),
                    correctIndex = 0,
                    explanation = "Tras el heroico sacrificio del rey espartano Leónidas y sus 300 guerreros en las Termópilas, Temístocles atrajo a los pesados barcos persas al estrecho canal de Salamina, donde los ágiles trirremes griegos los embistieron y hundieron."
                ),
                Challenge(
                    id = "huni_t03_s01_c08",
                    question = "La Guerra del Peloponeso (431 - 404 a.C.), narrada magistralmente por el historiador Tucídides, fue un cruento conflicto bélico fratricida que enfrentó a:",
                    options = listOf(
                        "Tebas contra los piratas ilirios del Adriático.",
                        "Las ciudades griegas unidas contra el Imperio Cartaginés.",
                        "La Liga de Delos (encabezada por Atenas imperialista y democrática) contra la Liga del Peloponeso (liderada por Esparta oligárquica y terrestre).",
                        "Macedonia contra las tribus tracias del norte.",
                    ),
                    correctIndex = 2,
                    explanation = "El recelo y temor de Esparta ante el desmedido crecimiento del poderío marítimo e imperial de Atenas desató la guerra civil griega, concluyendo con la rendición incondicional de Atenas en el 404 a.C. y el inicio de la breve hegemonía espartana."
                ),
                Challenge(
                    id = "huni_t03_s01_c09",
                    question = "El rey de Macedonia que modernizó la falange macedonia con largas picas (sarissas) y sometió militarmente a todas las polis griegas en la batalla de Queronea (338 a.C.) fue:",
                    options = listOf(
                        "Alejandro Magno",
                        "Antígono",
                        "Seleuco",
                        "Filipo II de Macedonia",
                    ),
                    correctIndex = 3,
                    explanation = "Filipo II unificó a la Hélade bajo la hegemonía macedonia creando la Liga de Corinto con el objetivo de emprender la invasión panhelénica contra el Imperio Persa, proyecto que ejecutó su genial hijo Alejandro Magno."
                ),
                Challenge(
                    id = "huni_t03_s01_c10",
                    question = "La cultura helenística surgida tras las fulgurantes conquistas de Alejandro Magno desde Egipto hasta la India se caracterizó esencialmente por:",
                    options = listOf(
                        "El aislamiento dogmático de la filosofía clásica de Platón.",
                        "La destrucción de todas las academias y museos científicos.",
                        "La fructífera fusión sincrética de la civilización y lengua griega (koiné) con las tradiciones, ciencias y religiones del Próximo Oriente milenario.",
                        "La prohibición absoluta de los matrimonios mixtos.",
                    ),
                    correctIndex = 2,
                    explanation = "El helenismo universalizó la cultura helénica en grandes metrópolis cosmopolitas como Alejandría de Egipto (con sabios como Euclides, Arquímedes y Eratóstenes), amalgamando el racionalismo griego con la mística y saber oriental."
                ),
            )
        ),
        LessonNode(
            id = "huni_t03_s02",
            subjectId = "historia_universal",
            semana = 3,
            subtema = "3.2",
            title = "3.4. La República y el Imperio Romano",
            theory = LessonTheory(
                content = """# TEMA 03: ANTIGÜEDAD CLÁSICA (GRECIA Y ROMA)

---



## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```mermaid
graph TD
    A["Antigüedad Clásica Grecorromana"] --> B["Mundo Griego (Hélade)"]
    A --> C["Mundo Romano (De la Aldea al Imperio)"]

    B --> B1["Etapas: Civilización Egea, Oscura, Arcaica, Clásica, Helenística"]
    B --> B2["Modelos Sociopolíticos: Esparta (Oligarquía) vs. Atenas (Democracia)"]
    B --> B3["Conflictos Bélicos: Guerras Médicas y Guerra del Peloponeso"]
    B --> B4["Legado: Filosofía, Democracia, Teatro, Historia, Cánones Estéticos"]

    C --> C1["Monarquía (753 - 509 a.C.): Dinastías Latina y Etrusca"]
    C --> C2["República (509 - 27 a.C.): Magistraturas, Luchas Sociales, Expansión Mediterránea, Crisis"]
    C --> C3["Imperio (27 a.C. - 476 d.C.): Principado (Pax Romana) y Dominado (Tetrarquía, Cristianismo)"]
    C --> C4["Legado: Derecho Romano (Ius Civile / Gentium), Ingeniería, Lenguas Romances"]
```

---



### 3.3. Roma Antigua: Monarquía, República e Imperio

#### A. La Monarquía Romana (753 - 509 a.C.)
Fundada legendariamente por Rómulo y Remo a orillas del río Tíber. Dividida en dos periodos dinásticos:
- **Dinastía Latina (Agrícola y Religiosa):** Rómulo (creador del Senado), Numa Pompilio (organizador de la religión y el calendario de 12 meses), Tulio Hostilio (conquista de Alba Longa) y Anco Marcio (fundación del puerto de Ostia).
- **Dinastía Etrusca (Comercial y Urbana):** Tarquino el Antiguo (construcción de la Cloaca Máxima y el Circo Máximo), Servio Tulio (reforma censitaria militar y muralla serviana) y Tarquino el Soberbio (tirano despótico derrocado en 509 a.C. tras el ultraje y suicidio de Lucrecia).

#### B. La República Romana (509 - 27 a.C.)
Régimen oligárquico aristocrático donde el poder ejecutivo fue depositado en magistraturas colegiadas y electivas.

```
+---------------------------------------------------------------------------------------+
|                         ESTRUCTURA INSTITUCIONAL DE LA REPÚBLICA                      |
+-------------------+-------------------------------------------------------------------+
| ÓRGANO            | FUNCIONES Y CARACTERÍSTICAS                                       |
+-------------------+-------------------------------------------------------------------+
| 1. El Senado      | Órgano supremo tutelar de patricios vitalicios (300 senadores).   |
|                   | Dirigía la política exterior, el tesoro y aprobaba las leyes.     |
| 2. Magistraturas  | Colegiadas, temporales (1 año), electivas y gratuitas (ad honorem)|
|    - Cónsules     | Dos magistrados supremos con poder militar (*imperium*) y civil.  |
|    - Pretores     | Administraban justicia civil y militar.                           |
|    - Censores     | Elaboraban el censo cada 5 años y velaban por la moral pública.   |
|    - Ediles       | Seguridad ciudadana, abasto de granos y juegos públicos.          |
|    - Cuestores    | Recaudación fiscal, contabilidad pública y administración aduanera|
|    - Tribunos de  | Defensores de la plebe; portaban el derecho a veto (*veto/        |
|      la Plebe     | intercessio*) y gozaban de inmunidad sacrosanta inviolable.       |
| 3. Asambleas o    | Curiados (asuntos religiosos), Centuriados (militares, eligen     |
|    Comicios       | cónsules), Tributos (eligen ediles y tribunos de la plebe).       |
+-------------------+-------------------------------------------------------------------+
```

#### Las Conquistas Plebeyas (Lucha Patricio-Plebeya):
1. **Secesión del Monte Sacro (494 a.C.):** Huelga militar plebeya que forzó la creación del **Tribunado de la Plebe** y los Comicios de la Plebe.
2. **Ley de las Doce Tablas (450 a.C.):** Primer código legislativo escrito romano redactado por los decenviros; consagró la igualdad procesal civil.
3. **Ley Canuleya (445 a.C.):** Autorizó el matrimonio mixto legal entre patricios y plebeyos (*conubium*).
4. **Leyes Licinias-Sextias (367 a.C.):** Estableció que uno de los dos cónsules anuales debía ser obligatoriamente plebeyo y reguló la tenencia máxima de tierras públicas (*ager publicus*).
5. **Ley Ogulnia (300 a.C.):** Acceso plebeyo a los colegios sacerdotales (pontífices y augures).
6. **Ley Hortensia (287 a.C.):** Otorgó a los **Plebiscitos** (acuerdos de los comicios populares plebeyos) fuerza de ley general vinculante para toda Roma.

#### La Expansión Mediterránea y las Guerras Púnicas (264 - 146 a.C.):
- Enfrentamiento entre Roma y **Cartago** por el control económico y marítimo del Mediterráneo occidental:
  - *Primera Guerra Púnica:* Roma arrebata a Cartago el dominio de Sicilia, Córcega y Cerdeña.
  - *Segunda Guerra Púnica:* Gran campaña militar de **Aníbal Barca**, quien cruzó los Alpes con elefantes e infligió a Roma la humillante masacre de **Cannas** (216 a.C.). Roma reacciona bajo el mando de **Publio Cornelio Escipión "el Africano"**, derrotando a Aníbal en la **Batalla de Zama** (202 a.C.).
  - *Tercera Guerra Púnica:* Destrucción total y siembra de sal en Cartago por Escipión Emiliano (146 a.C.).
- Consecuencias: Roma se convierte en dueña absoluta del Mediterráneo (*Mare Nostrum*), pero el influjo masivo de prisioneros esclavos arruinó a los campesinos plebeyos, concentrando la propiedad en **latifundios** aristocráticos.

#### Crisis y Colapso de la República:
- **Reformas agrarias de los Hermanos Graco (133 - 121 a.C.):** Tiberio Graco (ley de reparto de tierras públicas a los desposeídos) y Cayo Graco (ley frumentaria de subsidio del trigo) fueron violentamente asesinados por la oligarquía senatorial.
- **Guerras Civiles:** Enfrentamiento fratricida entre facciones políticas:
  - *Mario (populares, reforma militar y profesionalización del ejército) vs. Sila (optimates / aristocráticos; dictadura y proscripciones).*
- **Primer Triunvirato (60 a.C.):** Alianza privada extralegal entre **Julio César, Pompeyo Magno y Marco Licinio Craso**. Tras la muerte de Craso en Carras contra los partos, César cruza el río Rubicón (*Alea iacta est*), derrota a Pompeyo en Farsalia y asume la dictadura perpetua, hasta ser asesinado en los Idus de Marzo (44 a.C.) por Bruto y Casio.
- **Segundo Triunvirato (43 a.C.):** Magistratura legal ratificada por el Senado entre **Octavio, Marco Antonio y Lépido**. Tras vencer a los asesinos de César en Filipos, Octavio derrota a la flota de Marco Antonio y Cleopatra VII en la **Batalla de Actium** (31 a.C.), proclamando el fin de la República.

---



### 3.4. El Imperio Romano (27 a.C. - 476 d.C.)

#### A. El Alto Imperio o Principado (27 a.C. - 284 d.C.):
- **Octavio Augusto (27 a.C. - 14 d.C.):** Primer emperador (*Princeps*, *Imperator*, *Augustus*). Inauguró la **Pax Romana**, pacificación interna y florecimiento cultural (Siglo de Augusto: Virgilio, Horacio, Tito Livio; mecenazgo cultural promovido por Cayo Mecenas).
- **Dinastías Principales:**
  - *Julio-Claudia:* Tiberio (muerte de Jesús), Calígula (demencia cortesana), Claudio (conquista de Britania) y Nerón (incendio de Roma y primera persecución a cristianos).
  - *Flavia:* Vespasiano, Tito (erupción del Vesubio que destruyó Pompeya y toma de Jerusalén con la Diáspora judía en el 70 d.C.) y edificación del **Coliseo Romano**.
  - *Antoninos (Siglo de Oro de Roma):* Trajano (llevó al Imperio a su **máxima extensión territorial**, desde Escocia hasta Mesopotamia), Adriano (Muro de Adriano en Britania y codificación jurídica por Salvio Juliano) y Marco Aurelio (emperador filósofo estoico).
  - *Severos:* Caracalla promulgó en 212 d.C. el **Edicto de Caracalla** (o *Constitutio Antoniniana*), concediendo la **ciudadanía romana a todos los hombres libres del Imperio** con fines recaudatorios fiscales y de reclutamiento.

#### B. El Bajo Imperio o Dominado (284 - 476 d.C.):
- **Diocleciano (284 - 305 d.C.):** Superó la crisis del siglo III y el anarquismo militar instaurando la **Tetrarquía** (división del gobierno entre dos emperadores mayores o *Augustos* y dos menores o *Césares*). Desató la más sanguinaria persecución sistemática contra los cristianos.
- **Constantino I el Grande (306 - 337 d.C.):**
  - Promulgó el **Edicto de Milán (313 d.C.)**, decretando la **tolerancia religiosa y libertad de culto** para el cristianismo.
  - Convocó el Concilio de Nicea (325 d.C.) para combatir la herejía arriana.
  - Fundó una nueva capital imperial estratégica: **Constantinopla** (antigua Bizancio) en el año 330 d.C.
- **Teodosio I el Grande (379 - 395 d.C.):**
  - Promulgó el **Edicto de Tesalónica (380 d.C.)**, proclamando al cristianismo niceno como la **religión oficial y obligatoria del Imperio Romano**.
  - A su muerte en 395 d.C., dividió formal e irrevocablemente el Imperio entre sus dos hijos:
    - **Imperio Romano de Occidente:** Capital en Milán/Rávena, entregado a **Honorio**.
    - **Imperio Romano de Oriente:** Capital en Constantinopla, entregado a **Arcadio**.

#### C. La Caída del Imperio Romano de Occidente (476 d.C.):
Las incursiones masivas de los pueblos bárbaros germanos (visigodos saquean Roma en 410 con Alarico; vándalos la saquean en 455 con Genserico) colapsaron la precaria economía occidental. En el año **476 d.C.**, el caudillo de los hérulos, **Odoacro**, derroca al último emperador títere de Occidente, el infante **Rómulo Augústulo**, enviando las insignias imperiales a Constantinopla. Este hito marca el fin de la Edad Antigua y el inicio de la Edad Media.

---



## 4. CUADRO COMPARATIVO DEL DERECHO Y LAS INSTITUCIONES

\begin{array}{|l|l|l|l|}
\hline
\textbf{Norma / Hito} & \textbf{Cronología} & \textbf{Autor / Impulsor} & \textbf{Efecto Sociopolítico Trascendental} \\ \hline
\text{Reforma de Clístenes} & 508\text{ a.C.} & \text{Clístenes (Atenas)} & \text{Democracia: 10 tribus y ostracismo protector} \\ \hline
\text{Mistoforia de Pericles} & 450\text{ a.C.} & \text{Pericles (Atenas)} & \text{Sueldo público para la participación política del pobre} \\ \hline
\text{Ley de las XII Tablas} & 450\text{ a.C.} & \text{Decenviros (Roma)} & \text{Fin del monopolio judicial patricio consuetudinario} \\ \hline
\text{Ley Canuleya} & 445\text{ a.C.} & \text{Cayo Canuleyo (Roma)} & \text{Matrimonio civil mixto patricio-plebeyo} \\ \hline
\text{Ley Hortensia} & 287\text{ a.C.} & \text{Quinto Hortensio (Roma)} & \text{Plebiscitos tienen valor de ley vinculante general} \\ \hline
\text{Edicto de Caracalla} & 212\text{ d.C.} & \text{Caracalla (Roma)} & \text{Ciudadanía universal a todos los hombres libres del imperio} \\ \hline
\text{Edicto de Milán} & 313\text{ d.C.} & \text{Constantino (Roma)} & \text{Libertad de cultos y cese de persecución cristiana} \\ \hline
\text{Edicto de Tesalónica} & 380\text{ d.C.} & \text{Teodosio (Roma)} & \text{Cristianismo como religión oficial única del Estado} \\ \hline
\end{array}

---



### Mnemotecnia 2: "CA-VE-TE" para los Tres Edictos Religiosos de Roma
- **CA**: **Ca**racalla (Edicto del 212: **C**iudadanía para todos).
- **MI**: **Mi**lán (Edicto del 313: **M**itigación y libertad de culto cristiano).
- **TE**: **Te**salónica (Edicto del 380: **T**odos al cristianismo oficial).

---



### Hack 2: La Causa Real del Edicto de Caracalla
Si te preguntan por qué Caracalla otorgó la ciudadanía romana en el 212 d.C., descarta inmediatamente las opciones moralistas o filantrópicas ("amor a la igualdad humana"). La motivación real de Caracalla fue **fiscal y militar**: los ciudadanos romanos pagaban impuestos especiales sobre herencias y manumisiones y podían ser reclutados directamente en las legiones.

---



## 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO



### Caso 1: Los Pilares del Constitucionalismo y el Veto Presidencial
La figura moderna del **veto presidencial** consagrado en las constituciones republicanas contemporáneas deriva del poder de *intercessio* de los Tribunos de la Plebe romanos, quienes al pronunciar la palabra latina *"Veto"* ("prohíbo") paralizaban instantáneamente la ejecución de una ley senatorial lesiva para los derechos del pueblo llano.



### Ejercicio 1 (Nivel 1 - Acceso Inmediato): Legislación de Solón
**Enunciado (UNSA):** En la antigua Atenas, las agudas contradicciones sociales entre la aristocracia eupátrida y los campesinos endeudados amenazaban con una sangrienta guerra civil. Para solucionar esta crisis, el arconte Solón implementó la llamada *seisajtheia*, consistente fundamentalmente en:
A) La ejecución sumaria de todos los terratenientes nobles.  
B) La abolición de las deudas campesinas y la supresión de la esclavitud por deudas.  
C) La prohibición de las naves comerciales en el puerto del Pireo.  
D) El reparto obligatorio de las riquezas de los metecos extranjeros.  
E) La instauración de la monarquía vitalicia hereditaria.

**Solución paso a paso:**
1. Solón fue nombrado árbitro y legislador en el 594 a.C.
2. Su medida social cumbre fue la *seisajtheia* o "descarga de fardos", mediante la cual canceló las deudas hipotecarias agrarias.
3. Prohibió de forma perpetua que una persona libre pudiera empeñar su propio cuerpo o el de sus familiares como garantía de pago financiero.
**Respuesta:** **B) La abolición de las deudas campesinas y la supresión de la esclavitud por deudas.**

---



### Ejercicio 2 (Nivel 2 - Intermedio Operativo): Instituciones Políticas Romanas
**Enunciado (UNMSM DECO):** Durante la República Romana, las tensiones entre patricios y plebeyos desembocaron en la creación de magistraturas específicas para garantizar la defensa de las libertades populares. Aquella magistratura cuyos titulares gozaban de sacrosantidad inviolable y poseían el derecho de oponerse mediante el veto a las resoluciones del Senado se denominaba:
A) Cuestura  
B) Tribunado de la Plebe  
C) Censura  
D) Consulado  
E) Pretura

**Solución paso a paso:**
1. Tras la rebelión del Monte Sacro (494 a.C.), los plebeyos conquistaron el derecho a elegir a sus propios representantes protectores.
2. Estos eran los **Tribunos de la Plebe**, cuya persona era sagrada e inviolable (*sacrosanctitas*).
3. Disponían del poder del *veto* para frenar mandatos dictatoriales o leyes aristocráticas contrarias a los intereses de la masa plebeya.
**Respuesta:** **B) Tribunado de la Plebe.**

---



### Ejercicio 3 (Nivel 3 - Contexto DECO Avanzado): Guerras Púnicas y Transformación Agraria
**Enunciado (UNMSM DECO / UNSA):** La victoria de Roma sobre Cartago en las Guerras Púnicas otorgó a la República el dominio indiscutible del Mediterráneo (*Mare Nostrum*). Sin embargo, al interior de la sociedad romana, este triunfo desencadenó una profunda crisis socioeconómica que se manifestó en:
A) La liquidación total de la esclavitud en todo el territorio itálico.  
B) La ruina masiva del campesinado plebeyo y la concentración de tierras en latifundios trabajados por prisioneros de guerra esclavizados.  
C) El retorno inmediato a la monarquía teocrática etrusca.  
D) La desmilitarización absoluta del ejército romano y el abandono de las calzadas.  
E) La pérdida definitiva de los derechos políticos conquistados por los plebeyos.

**Solución paso a paso:**
1. Los campesinos romanos debieron servir en legiones ultramarinas durante años, abandonando sus parcelas agrícolas.
2. Al retornar, sus campos estaban devastados y no podían competir contra la producción de grano barato y mano de obra esclava masiva traída de las conquistas.
3. Los senadores y patricios acapararon las tierras formando gigantescos **latifundios**, forzando al campesinado arruinado a migrar como proletariado urbano desocupado hacia Roma.
**Respuesta:** **B) La ruina masiva del campesinado plebeyo y la concentración de tierras en latifundios trabajados por prisioneros de guerra esclavizados.**

---



### Ejercicio 4 (Nivel 4 - Análisis Crítico / UNI CEPRE): El Cristianismo y el Estado Romano
**Enunciado (UNI):** Durante el Bajo Imperio Romano, la relación entre el poder estatal imperial y la creciente comunidad cristiana experimentó un cambio radical a lo largo del siglo IV d.C. Identifique la alternativa que describe correctamente la secuencia y contenido jurídico de dicho proceso:
A) Constantino decretó el cristianismo como religión oficial única en Tesalónica y Teodosio proclamó la libertad de culto en Milán.  
B) Diocleciano adoptó el cristianismo como ideología de la Tetrarquía y Constantino restauró el culto a Júpiter.  
C) Constantino garantizó la tolerancia y el cese de persecuciones mediante el Edicto de Milán (313 d.C.), mientras que Teodosio lo consagró como la religión oficial exclusiva a través del Edicto de Tesalónica (380 d.C.).  
D) Trajano persiguió el culto en Nicea y Caracalla concedió el sacerdocio a todos los cristianos bautizados.  
E) Rómulo Augústulo abolió el cristianismo antes de entregar el poder al caudillo Odoacro.

**Solución paso a paso:**
1. En el 313 d.C., Constantino promulgó el **Edicto de Milán**, concediendo la libertad de culto en todo el imperio.
2. Décadas más tarde, en el 380 d.C., el emperador hispano Teodosio I promulgó el **Edicto de Tesalónica**, clausurando los cultos paganos y convirtiendo formalmente al cristianismo católico niceno en la fe oficial del Imperio.
**Respuesta:** **C) Constantino garantizó la tolerancia y el cese de persecuciones mediante el Edicto de Milán (313 d.C.), mientras que Teodosio lo consagró como la religión oficial exclusiva a través del Edicto de Tesalónica (380 d.C.).**

---



### Ejercicio 5 (Nivel 5 - Reto Titán / Examen de Excelencia): Epigrafía Constitucional Clásica
**Enunciado (Reto Historiográfico Élite):** Determine la veracidad (V) o falsedad (F) de las siguientes proposiciones sobre la civilización clásica:
I. El ostracismo ateniense era dictaminado por los jueces del Areópago con confiscación irrevocable de bienes para el ciudadano condenado.  
II. La Ley de las Doce Tablas significó la consagración de la igualdad formal ante la ley civil escrita para patricios y plebeyos, aunque aún prohibía el matrimonio mixto entre ambos estamentos.  
III. La Paz de Calias puso fin a la Guerra del Peloponeso reconociendo la victoria marítima de Esparta sobre los atenienses.  
IV. La batalla de Actium (31 a.C.) consolidó el ascenso político de Octavio y significó el inicio formal de la transición hacia el régimen imperial romano.

A) F - V - F - V  
B) V - V - F - F  
C) F - F - V - V  
D) V - F - V - F  
E) F - V - V - F  

**Solución paso a paso:**
- **Afirmación I (FALSA):** El ostracismo era votado democráticamente por la **Ekklesía** en la plaza pública sobre trozos de barro (*ostrakon*), y **no** conllevaba la confiscación de tierras ni pérdida de patrimonio, sino únicamente el alejamiento geográfico por diez años.
- **Afirmación II (VERDADERA):** La Ley de las XII Tablas (450 a.C.) fijó el derecho por escrito garantizando certeza procesal, pero la Tabla XI ratificaba expresamente la prohibición del matrimonio mixto entre patricios y plebeyos (dicha prohibición recién cayó 5 años después con la Ley Canuleya).
- **Afirmación III (FALSA):** La Paz de Calias (449 a.C.) puso fin a las **Guerras Médicas** entre griegos y persas, no a la Guerra del Peloponeso (esta terminó con la toma de Atenas por Lisandro en 404 a.C.).
- **Afirmación IV (VERDADERA):** La victoria naval de Octavio y Agripa en Actium frente a Marco Antonio y Cleopatra liquidó el último vestigio de la República e inauguró el Principado de Augusto.
- Secuencia: F - V - F - V.
**Respuesta:** **A) F - V - F - V**.

---



## 10. GLOSARIO DE 10 TÉRMINOS CLAVE

1. **Polis:** Ciudad-estado independiente de la antigua Grecia compuesta por un núcleo urbano (*asty*) y su territorio agrícola circundante (*chora*).
2. **Ostracismo:** Mecanismo institucional ateniense consistente en el destierro político preventivo por diez años para conjurar el peligro de una tiranía.
3. **Mistoforia:** Remuneración económica o dieta diaria creada por Pericles para compensar a los ciudadanos atenienses por el ejercicio de funciones públicas.
4. **Homoioi:** Denominación dada a los espartiatas o ciudadanos de pleno derecho ("los iguales"), dedicados con exclusividad a la instrucción militar y la guerra.
5. **Ilotas:** Población autóctona de Laconia y Mesenia reducida a servidumbre estatal por los dorios en Esparta, obligada a cultivar la tierra ajena.
6. **Patricios:** Miembros de las familias fundadoras de Roma descendientes de los primeros *patres* senatoriales que monopolizaron la tierra y el poder político.
7. **Plebeyos:** Masa popular libre de Roma (campesinos, artesanos, comerciantes) que inicialmente carecía de derechos políticos y acceso al sacerdocio.
8. **Ius Civile:** Conjunto de leyes consuetudinarias y escritas privativas y exclusivas que regían para los ciudadanos romanos en sus relaciones jurídicas.
9. **Pax Romana:** Periodo de estabilidad política, prosperidad mercantil y florecimiento urbano que experimentó el Imperio bajo el Principado (siglos I y II d.C.).
10. **Tetrarquía:** Sistema de gobierno ideado por Diocleciano en el 293 d.C., basado en el mando simultáneo de dos Augustos y dos Césares para administrar las cuatro prefecturas del Imperio.

---



## 11. BANCO DE FLASHCARDS (Q/A)

- **P:** ¿Quién es considerado el Padre de la Democracia ateniense por crear las diez tribus territoriales y el ostracismo?
  - **R:** Clístenes (508 a.C.).
- **P:** ¿Qué conflicto bélico enfrentó a las polis griegas de la Liga de Delos contra la Liga del Peloponeso?
  - **R:** La Guerra del Peloponeso (431 - 404 a.C.).
- **P:** ¿Cómo se denominó la ley romana que legalizó los matrimonios mixtos entre patricios y plebeyos?
  - **R:** Ley Canuleya (445 a.C.).
- **P:** ¿En qué célebre batalla de la Segunda Guerra Púnica el general romano Escipión el Africano derrotó a Aníbal Barca?
  - **R:** Batalla de Zama (202 a.C.).
- **P:** ¿Qué emperador romano otorgó la ciudadanía a todos los hombres libres del Imperio mediante una famosa constitución en el 212 d.C.?
  - **R:** El emperador Caracalla (*Constitutio Antoniniana*).
- **P:** ¿Qué emperador legalizó el cristianismo y decretó la libertad de culto a través del Edicto de Milán?
  - **R:** Constantino I el Grande (313 d.C.).
- **P:** ¿Quién dividió definitivamente el Imperio Romano en el año 395 d.C. entre sus hijos Arcadio y Honorio?
  - **R:** El emperador Teodosio I el Grande.
- **P:** ¿En qué año y por obra de quién cayó el Imperio Romano de Occidente?
  - **R:** En el año 476 d.C., cuando el líder germano Odoacro derrocó a Rómulo Augústulo.

---



### 3.2. Esparta y Atenas: Modelos Sociopolíticos Antagónicos

```
+---------------------------------------------------------------------------------------------------+
|                            COMPARATIVA INSTITUCIONAL: ESPARTA VS. ATENAS                           |
+-----------------------------+-----------------------------+---------------------------------------+
| CRITERIO                    | ESPARTA (Lacedemonia)       | ATENAS (Ática)                        |
+-----------------------------+-----------------------------+---------------------------------------+
| Origen Étnico               | Dorios invasores            | Jonios autóctonos                     |
| Vocación Geopolítica        | Militarista continental     | Marítima, mercantil y cosmopolita     |
| Legislador Fundamental      | Licurgo (La Gran Retra)     | Dracón, Solón, Clístenes, Pericles    |
+-----------------------------+-----------------------------+---------------------------------------+
| Estructura Social           | 1. Espartiatas u Homoioi    | 1. Ciudadanos (varones atenienses)    |
|                             |    (ciudadanos guerreros)   | 2. Metecos (extranjeros libres)       |
|                             | 2. Periecos (libres sin     | 3. Esclavos (mercancías humanas sin   |
|                             |    derechos políticos)      |    derecho civil)                     |
|                             | 3. Ilotas (siervos del      |                                       |
|                             |    Estado, atados a tierra) |                                       |
+-----------------------------+-----------------------------+---------------------------------------+
| Órganos de Gobierno         | - Diarquía (dos reyes)      | - Ekklesía (asamblea soberana de      |
|                             | - Éforos (5 magistrados)    |   todos los ciudadanos)               |
|                             | - Gerusía (consejo de 28    | - Bulé (consejo de los 500)           |
|                             |   ancianos de +60 años)     | - Heliea (tribunal popular)           |
|                             | - Apella (asamblea popular) | - Estrategas (10 jefes militares)     |
+-----------------------------+-----------------------------+---------------------------------------+
| Régimen Político            | Oligarquía aristocrática    | Democracia directa (isegoría e        |
|                             | y totalitaria               | isonomía)                             |
+-----------------------------+-----------------------------+---------------------------------------+
```

#### Evolución Histórica de la Democracia Ateniense:
1. **Dracón (621 a.C.):** Primer código de leyes escritas, caracterizado por su severidad implacable ("leyes draconianas"), buscando frenar la venganza privada entre clanes nobles (eupátridas).
2. **Solón (594 a.C.):** Abolió la esclavitud por deudas (*seisajtheia*), liberó a los siervos de la tierra (*hectemoroi*) e instauró una **timocracia** o plutocracia (división censitaria en 4 clases según la renta anual agrícola: pentacosiomedimnos, hippeis, zeugitas y thetes). Creó el Consejo de la Bulé de los 400 y el Tribunal de la Heliea.
3. **Pisístrato (561 - 527 a.C.):** Tirano que impulsó la agricultura campesina con créditos estatales, fomentó las obras públicas y fijó por escrito las epopeyas homéricas (*Ilíada* y *Odisea*).
4. **Clístenes (508 a.C.):** Considerado el **Padre de la Democracia**. Desarticuló el poder de los clanes aristocráticos al reorganizar el Ática en **10 tribus territoriales** (combinando demos de la costa, el interior y la ciudad). Creó la Bulé de los 500 y el **ostracismo** (destierro político por 10 años mediante votación popular en trozos de cerámica u *ostraka* para neutralizar a quienes conspiraban contra la democracia).
5. **Pericles (461 - 429 a.C.):** Consolidó el sistema democrático al implementar la **mistoforia** (estipendio o sueldo para los jurados y magistrados populares), garantizando que la pobreza no fuera obstáculo para gobernar.

---



## 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El significado del Ostracismo**
> El ostracismo ateniense **NO era una pena penal por cometer delitos comunes** (asesinato o robo), sino una **medida preventiva puramente política**. Al desterrado no se le confiscaban sus bienes ni perdía sus derechos de propiedad; simplemente se le alejaba del Ática durante 10 años para neutralizar su excesiva popularidad o ambición de tiranía.

> [!CAUTION]
> **Trampa 2: La "Democracia" ateniense no incluía a la mayoría**
> En la Atenas de Pericles solo participaban en el gobierno los **ciudadanos varones mayores de edad**. Quedaban totalmente excluidos de los derechos políticos: las **mujeres**, los **metecos** (extranjeros) y los **esclavos** (que constituían cerca del 60\% de la población total).

> [!WARNING]
> **Trampa 3: Edicto de Milán vs. Edicto de Tesalónica**
> Gran distractor recurrente: Constantino decretó la **tolerancia religiosa** (Edicto de Milán, 313 d.C.), permitiendo al cristianismo existir sin persecución. Quien convirtió al cristianismo en la **religión oficial única y obligatoria** persiguiendo el paganismo fue **Teodosio** (Edicto de Tesalónica, 380 d.C.).

---



### 3.1. Grecia Antigua: La Matriz Democrática y Cultural de Occidente
El espacio geográfico griego (la Hélade) abarcó el sur de la península Balcánica, las islas del mar Egeo y las costas de Asia Menor (Jonia). Su relieve montuoso y fragmentado impidió la formación de un Estado unificado centralizado, propiciando el desarrollo de ciudades-estado independientes (**Polis**).

#### A. Periodización Histórica de Grecia:
1. **Civilización Egea (3000 - 1150 a.C.):**
   - *Minoica o Cretense:* Capital Cnosos. **Talasocracia** (dominio marítimo pacífico). Escritura Lineal A (no descifrada). El mito del Minotauro y el palacio laberíntico.
   - *Micénica:* Fundada por los aqueos en el Peloponeso. Ciudades fortificadas (Micenas, Tirinto). Guerra de Troya. Escritura **Lineal B** (forma arcaica de griego, descifrada por Michael Ventris).
2. **Época Oscura (1150 - 800 a.C.):** Invasión de pueblos indoeuropeos (dorios con armas de hierro, jonios y eolios). Colapso del mundo micénico y retroceso cultural.
3. **Época Arcaica (800 - 500 a.C.):** Consolidación de la Polis. Sobrepoblación y escasez de tierras que motivaron la **gran colonización griega** por el mar Mediterráneo y el mar Negro (fundación de colonias o *apoikias*, como Bizancio, Siracusa, Massalia). Reaparición de la escritura con el alfabeto fenicio adaptado.
4. **Época Clásica (500 - 323 a.C.):** Apogeo de Atenas y Esparta.
   - **Guerras Médicas (492 - 449 a.C.):** Enfrentamiento entre las polis griegas y el Imperio Persa (Aqueménida). Victorias atenienses en Maratón (Milcíades) y Salamina (Temístocles), y coaligada en Platea. Culmina con la **Paz de Calias** (los persas reconocen la autonomía griega en el Egeo).
   - **Siglo de Pericles:** Época dorada de Atenas. Reconstrucción de la Acrópolis (el Partenón, bajo supervisión de Fidias). Instauración de la **mistoforia** (pago a los ciudadanos por ejercer cargos públicos, garantizando el acceso real de las clases humildes al poder).
   - **Guerra del Peloponeso (431 - 404 a.C.):** Enfrentamiento civil hegemónico entre la **Liga de Delos** (Atenas, marítima y democrática) y la **Liga del Peloponeso** (Esparta, terrestre y oligárquica). Culmina con la victoria espartana, la instauración de la tiranía de los Treinta Tiranos y la decadencia general de las polis.
5. **Época Helenística (323 - 30 a.C.):** Filipo II de Macedonia somete a las polis (Batalla de Queronea, 338 a.C.). Su hijo **Alejandro Magno** forja un imperio colosal desde Grecia hasta el río Indo en la India. Tras su muerte, surge el **helenismo**: fusión sincretista de la cultura clásica griega con las tradiciones de Oriente Próximo.

---



### Hack 1: Distinción entre Guerras Médicas y Guerra del Peloponeso
- Si el choque es **Griegos vs. Persas** (bárbaros orientales) \implies **Guerras Médicas** (Victoria griega, salva la democracia naciente).
- Si el choque es **Griegos vs. Griegos** (Atenas vs. Esparta) \implies **Guerra del Peloponeso** (Hegemonía espartana, suicidio militar de las polis)."""
            ),
            challenges = listOf(
                Challenge(
                    id = "huni_t03_s02_c01",
                    question = "En la República Romana (509 - 27 a.C.), el órgano político colegiado más poderoso que representaba a la aristocracia patricia, controlaba la política exterior, el tesoro público y asesoraba a los magistrados era:",
                    options = listOf(
                        "El Senado romano (Senatus)",
                        "Los Comicios Centuriados",
                        "El Tribunal del Pueblo",
                        "El Colegio de los Augures",
                    ),
                    correctIndex = 0,
                    explanation = "El Senado (integrado inicialmente por 300 patricios vitalicios y exmagistrados) fue el eje rector y permanente de la política romana, emitiendo decretos (senadoconsultos) y dirigiendo las guerras y finanzas del Estado."
                ),
                Challenge(
                    id = "huni_t03_s02_c02",
                    question = "La magistratura romana extraordinaria creada tras la retirada plebeya al Monte Sacro (494 a.C.) para proteger a los plebeyos contra los abusos y vejaciones de los patricios, dotada de la inviolabilidad personal (sacrosantidad) y el derecho de veto (ius intercedendi), fue el:",
                    options = listOf(
                        "Censor",
                        "Cuestor",
                        "Tribuno de la Plebe",
                        "Pretor urbano",
                    ),
                    correctIndex = 2,
                    explanation = "Los tribunos de la plebe podían anular las resoluciones de los cónsules y del senado pronunciando la palabra 'Veto' («me opongo»), y cualquier persona que los agrediera físicamente era declarada homo sacer y podía ser ejecutada legalmente."
                ),
                Challenge(
                    id = "huni_t03_s02_c03",
                    question = "El primer código legal escrito de la historia romana, redactado por una comisión de diez decenviros y expuesto en el Foro en el 450 a.C. para garantizar la igualdad jurídica frente a las costumbres orales patricias, fue:",
                    options = listOf(
                        "El Corpus Iuris Civilis",
                        "La Ley de las XII Tablas",
                        "La Ley Canuleya",
                        "La Ley Hortensia",
                    ),
                    correctIndex = 1,
                    explanation = "La Ley de las XII Tablas consagró por escrito normas civiles, procesales y penales para patricios y plebeyos, constituyendo la fuente originaria y manantial de todo el Derecho Romano público y privado."
                ),
                Challenge(
                    id = "huni_t03_s02_c04",
                    question = "Las Guerras Púnicas (264 - 146 a.C.) enfrentaron a la República Romana contra la rica potencia marítima de Cartago por el control absoluto del mar Mediterráneo occidental, culminando militarmente en la Segunda Guerra Púnica con la victoria de Escipión el Africano sobre Aníbal Barca en la batalla de:",
                    options = listOf(
                        "Zama (202 a.C.)",
                        "Cannas",
                        "Trasimeno",
                        "Farsalia",
                    ),
                    correctIndex = 0,
                    explanation = "Tras las catastróficas derrotas romanas en Cannas infligidas por el genio táctico de Aníbal, Publio Cornelio Escipión trasladó la guerra al norte de África y venció decisivamente a las tropas cartaginesas en la batalla de Zama."
                ),
                Challenge(
                    id = "huni_t03_s02_c05",
                    question = "En el siglo II a.C., los hermanos tribunos de la plebe Tiberio y Cayo Graco intentaron frenar la ruina del campesinado itálico y la voracidad de los latifundistas promoviendo una reforma social radical basada en:",
                    options = listOf(
                        "Una Ley Agraria para limitar la concentración del ager publicus y redistribuir parcelas de tierra fértil a los ciudadanos desposeídos, además de una Ley Frumentaria para subsidiar el grano.",
                        "La supresión total de los impuestos aduaneros.",
                        "La concesión del voto a los esclavos mineros de Sicilia.",
                        "El traslado de la capital a Siracusa.",
                    ),
                    correctIndex = 0,
                    explanation = "Los Graco intentaron rescatar al ciudadano-soldado romano de la miseria urbana obligando al senado aristocrático a ceder tierras públicas; la oligarquía senatorial respondió asesinando violentamente a Tiberio en el Capitolio y empujando a Cayo al suicidio."
                ),
                Challenge(
                    id = "huni_t03_s02_c06",
                    question = "En el 60 a.C., tres poderosos líderes romanos sellaron un pacto secreto de ayuda mutua para sortear la oposición del senado y repartirse el control político de la República, conocido como el Primer Triunvirato, integrado por:",
                    options = listOf(
                        "Mario, Sila y Cicerón",
                        "Julio César, Pompeyo Magno y Marco Licinio Craso",
                        "Rómulo, Remo y Numa Pompilio",
                        "Octavio, Marco Antonio y Lépido",
                    ),
                    correctIndex = 1,
                    explanation = "Julio César aportó el genio político y apoyo popular, Craso su inmensa fortuna financiera y Pompeyo el respaldo de sus legiones veteranas, hegemonizando el poder republicano en crisis."
                ),
                Challenge(
                    id = "huni_t03_s02_c07",
                    question = "Julio César consolidó su poder personal supremo tras conquistar las Galias y cruzar el río Rubicón en el 49 a.C. desafiando al Senado bajo la célebre frase «Alea iacta est» («La suerte está echada»), siendo finalmente asesinado en los Idus de Marzo del 44 a.C. debido a que:",
                    options = listOf(
                        "Fue envenenado por emisarios de Cleopatra en Egipto.",
                        "Quiso vender Roma al rey de los partos.",
                        "Un grupo de senadores conspiradores liderados por Bruto y Casio temieron que instaurara una monarquía autocrática y destruyera definitivamente la República tras ser nombrado dictador perpetuo.",
                        "Perdió la guerra civil frente a Pompeyo en Grecia.",
                    ),
                    correctIndex = 2,
                    explanation = "En las escalinatas de la Curia de Pompeyo, César fue apuñalado por más de sesenta senadores tradicionalistas que justificaron el magnicidio como un acto patriótico de tiranicidio para restaurar las libertades senatoriales."
                ),
                Challenge(
                    id = "huni_t03_s02_c08",
                    question = "En el 27 a.C., Octavio recibió del Senado los títulos de Augustus y Princeps, transformando a Roma en el Imperio Romano e inaugurando dos siglos de estabilidad territorial conocidos como:",
                    options = listOf(
                        "El Siglo de Hierro",
                        "La Anarquía Militar",
                        "La Pax Romana (o Paz Augusta)",
                        "La Tetrarquía imperial",
                    ),
                    correctIndex = 2,
                    explanation = "Augusto centralizó el poder político, militar y religioso gobernando con prudencia institucional; la Pax Romana floreció asegurando las fronteras, fomentando el comercio, el derecho y el embellecimiento monumental de mármol de Roma."
                ),
                Challenge(
                    id = "huni_t03_s02_c09",
                    question = "En el año 313 d.C., el emperador Constantino el Grande transformó la historia religiosa del mundo occidental al promulgar el Edicto de Milán, el cual estipulaba:",
                    options = listOf(
                        "La crucifixión de todos los obispos cristianos en el Coliseo.",
                        "La prohibición de los templos paganos en Grecia.",
                        "La creación del tribunal de la Inquisición papal.",
                        "La libertad de cultos en todo el Imperio Romano, cesando formalmente las sangrientas persecuciones imperiales contra los cristianos.",
                    ),
                    correctIndex = 3,
                    explanation = "El Edicto de Milán concedió a los cristianos plena libertad para practicar su religión y les restituyó sus templos confiscados; décadas más tarde (380 d.C.), el emperador Teodosio promulgó el Edicto de Tesalónica convirtiendo al cristianismo en la religión oficial y obligatoria del Imperio."
                ),
                Challenge(
                    id = "huni_t03_s02_c10",
                    question = "En el año 395 d.C., el emperador Teodosio dividió administrativamente el inmenso Imperio Romano entre sus dos hijos con el fin de mejorar su defensa militar, dando origen a:",
                    options = listOf(
                        "El Imperio Romano de Occidente (capital Milán/Rávena, concedido a Honorio) y el Imperio Romano de Oriente o Bizantino (capital Constantinopla, asignado a Arcadio).",
                        "El Califato de Córdoba y el Reino de Granada.",
                        "La República de Venecia y los Estados Pontificios.",
                        "El Reino Franco y el Sacro Imperio Germánico.",
                    ),
                    correctIndex = 0,
                    explanation = "La partición de Teodosio separó dos destinos históricos: Occidente colapsó en el 476 d.C. ante las invasiones bárbaras germánicas, mientras que Oriente (Bizancio) pervivió mil años más hasta la caída de Constantinopla ante los turcos otomanos en 1453."
                ),
            )
        )
    )
}
