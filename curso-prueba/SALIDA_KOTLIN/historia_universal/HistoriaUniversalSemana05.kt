package historia_universal

import com.educandoperu.model.LessonNode
import com.educandoperu.model.LessonTheory
import com.educandoperu.model.QuizChallenge

object HistoriaUniversalSemana05 {

    val lessons = listOf(
        LessonNode(
            id = "huni_t05_s01",
            subjectId = "historia_universal",
            semana = 5,
            subtema = 1,
            title = "El Humanismo, el Renacimiento y los Grandes Descubrimientos Geográficos",
            theory = LessonTheory(
                title = "El Humanismo, el Renacimiento Artístico y los Grandes Descubrimientos Geográficos",
                content = """## 3. DESARROLLO TEÓRICO FORMAL

### 3.1. El Humanismo: Revolución Filosófica Antropocéntrica
Movimiento intelectual surgido en las ricas ciudades mercantiles de Italia (Florencia, Venecia, Roma) entre los siglos XIV y XV.
- **Ruptura Epistemológica:** Reemplazó el **teocentrismo** dogmático medieval por el **antropocentrismo** ("el ser humano es el centro, artífice y medida de todas las cosas").
- **Revaloración de la Antigüedad Clásica:** Estudio filológico directo del griego y latín clásicos, rescatando a Platón y Cicerón tras la llegada de sabios bizantinos exiliados tras la caída de Constantinopla (1453).
- **Vehículo Material:** La invención de la **imprenta de tipos móviles metálicos** perfeccionada por **Johannes Gutenberg** en Maguncia (\sim 1450, la *Biblia de 42 líneas*), que permitió la multiplicación y abaratamiento masivo de los libros.

#### Precursores y Representantes Cumbres del Humanismo:
1. **Precursores Italianos (Trecento, siglo XIV):**
   - *Dante Alighieri (1265 - 1321):* *La Divina Comedia* (redactada en toscano vernáculo, puente entre el medievo y la modernidad).
   - *Francesco Petrarca (1304 - 1374):* Considerado el **Padre del Humanismo**. Autor de *Cancionero*, revalorizó la lírica clásica y el individualismo interior.
   - *Giovanni Boccaccio (1313 - 1375):* *Decamerón* (crítica satírica mordaz a la hipocresía eclesiástica y celebración terrenal de la vida).
2. **Representantes Universales (Siglo XVI):**
   - *Desiderio Erasmo de Rotterdam (1466 - 1536):* El **"Príncipe del Humanismo"**. En *Elogio de la locura* censuró con ironía la corrupción papal y la ignorancia teológica, promoviendo una religiosidad pura e intimista basada en los Evangelios.
   - *Tomás Moro (1478 - 1535):* Canciller de Inglaterra y autor de *Utopía*, donde diseñó una sociedad ideal comunitaria sin propiedad privada ni guerras; fue decapitado por Enrique VIII al negarse a avalar el cisma anglicano.
   - *Nicolás Maquiavelo (1469 - 1527):* Padre de la **Ciencia Política moderna**. En *El Príncipe* secularizó la política separándola de la moral religiosa (*"el fin justifica los medios"* o realismo político del Estado).

---

### 3.2. El Renacimiento: Renovación Plástica y Científica
Movimiento artístico y cultural que tradujo los ideales humanistas en las artes plásticas (pintura, escultura, arquitectura), caracterizado por el uso de la perspectiva lineal, el claroscuro, el estudio de la anatomía humana y el naturalismo.
- **Los Mecenas:** Banqueros y aristócratas que financiaron a los artistas (los **Médici** en Florencia, y los Papas **Julio II** y **León X** en Roma).

```
+---------------------------------------------------------------------------------------------------+
|                              LAS DOS ETAPAS DEL RENACIMIENTO ITALIANO                             |
+-------------------+-------------------+-----------------------------------------------------------+
| FASE              | FOCO Y MECENAS    | ARTISTAS Y OBRAS EMBLEMÁTICAS                             |
+-------------------+-------------------+-----------------------------------------------------------+
| QUATTROCENTO      | Florencia         | - Filippo Brunelleschi: Cúpula de Santa María del Fiore.  |
| (Siglo XV)        | (Familia Médici:  | - Donatello: Escultura del *David* en bronce juvenil.    |
|                   | Cosme y Lorenzo)  | - Sandro Botticelli: *El nacimiento de Venus*, *La        |
|                   |                   |   Primavera* (mitología clásica, figuras vaporosas).      |
+-------------------+-------------------+-----------------------------------------------------------+
| CINQUECENTO       | Roma              | - Leonardo da Vinci: *La Gioconda*, *La Última Cena*.     |
| (Siglo XVI)       | (El Papado:       | - Miguel Ángel Buonarroti: Frescos de la Capilla Sixtina, |
|                   | Julio II, León X) |   esculturas del *David*, *Moisés* y *La Piedad*.         |
|                   |                   | - Rafael Sanzio: *La escuela de Atenas*, Madonnas.        |
+-------------------+-------------------+-----------------------------------------------------------+
```

---

### 3.3. Los Grandes Descubrimientos Geográficos
1. **Causas Fundamentales:** La toma de Constantinopla por los turcos otomanos (1453) clausuró las rutas de las especias hacia las Indias (la Ruta de la Seda). Surgió la imperiosa necesidad económica de hallar una vía marítima directa alternativa.
2. **Avances Científico-Técnicos:** La brújula, el astrolabio, el cuadrante, los mapas portulanos y la invención de la **carabela** (embarcación ligera con velas cuadradas y triangulares latinas para navegar contra el viento mediante bolina).
3. **Las Rutas de Exploración:**
   - **Proyecto Portugués (Circunnavegación Africana):** Impulsado por la Escuela Náutica de Sagres de Enrique el Navegante.
     - *Bartolomé Díaz (1488):* Dobla el Cabo de las Tormentas (Cabo de Buena Esperanza).
     - *Vasco da Gama (1498):* Llega a Calicut (India), abriendo la ruta marítima a Oriente.
     - *Pedro Álvares Cabral (1500):* Toca las costas de Brasil.
   - **Proyecto Español (Ruta Occidental Transatlántica):** Cristóbal Colón (respaldado por los Reyes Católicos en la Capitulación de Santa Fe) llega a la isla de Guanahaní (San Salvador) el **12 de octubre de 1492**.
4. **Tratados de Reparto Colonial:**
   - **Bula Inter Caetera (1493):** Emitida por el papa Alejandro VI (Borgia); concedía a España las tierras a 100 leguas al oeste de las islas Azores.
   - **Tratado de Tordesillas (1494):** Suscrito directamente entre España y Portugal; desplazó la línea divisoria a **370 leguas al oeste de Cabo Verde**, permitiendo a Portugal reclamar formalmente Brasil.
5. **Primera Vuelta al Mundo (1519 - 1522):** Iniciada por **Hernando de Magallanes** (quien cruzó el estrecho austral y murió en Filipinas) y culminada por **Juan Sebastián Elcano** a bordo de la nao *Victoria*, demostrando empíricamente la esfericidad terrestre.

---"""
            ),
            challenges = listOf(
                QuizChallenge(
                    id = "huni_t05_s01_c01",
                    question = "El Humanismo, movimiento intelectual y filosófico nacido en las ricas ciudades italianas en el siglo XIV, se caracterizó primordialmente por:",
                    options = listOf(
                        "Subordinar completamente el conocimiento empírico a los dogmas teológicos medievales.",
                        "Reemplazar el teocentrismo medieval por el antropocentrismo y revalorizar los modelos éticos, literarios y artísticos de la Antigüedad grecolatina.",
                        "Restringir la producción cultural y académica exclusivamente a la orden monástica benedictina.",
                        "Rechazar el uso de las lenguas vernáculas imponiendo el latín eclesiástico como única lengua admisible."
                    ),
                    correctIndex = 1,
                    explanation = "El Humanismo desplazó el teocentrismo escolástico medieval para situar al ser humano como centro y medida del cosmos (antropocentrismo), rescatando los modelos clásicos de Grecia y Roma mediante el estudio filológico directo de las fuentes."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c02",
                    question = "El ilustre poeta y filólogo florentino Francesco Petrarca es reconocido unánimemente en la historia de la cultura europea como:",
                    options = listOf(
                        "El último gran teólogo escolástico del Sacro Imperio.",
                        "El creador del método dialéctico en la Universidad de París.",
                        "El Padre del Humanismo, célebre por su 'Cancionero' dedicado a Laura y su rescate apasionado de Cicerón y los clásicos latinos.",
                        "El principal inquisidor papal contra las tesis protestantes."
                    ),
                    correctIndex = 2,
                    explanation = "Francesco Petrarca (1304 - 1374) es considerado el Padre del Humanismo por inaugurar la búsqueda y restauración crítica de manuscritos grecorromanos y articular una lírica sublime profundamente introspectiva y antropocéntrica."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c03",
                    question = "La obra maestra de Erasmo de Rotterdam, Elogio de la locura (Moriae Encomium, 1511), dedicada a su amigo Tomás Moro, destacó por:",
                    options = listOf(
                        "Una sátira cáustica y mordaz contra la corrupción moral, la hipocresía, el formalismo ritual y la superstición del clero y la sociedad de su época.",
                        "Una apología incondicional del absolutismo monárquico pontificio.",
                        "La formulación del primer tratado militar de infantería moderna.",
                        "Un manual de astrología y geomancia aplicada a la política europea."
                    ),
                    correctIndex = 0,
                    explanation = "Erasmo de Rotterdam, 'Príncipe del Humanismo', fustigó a través de la ironía satírica la degradación moral y las pretensiones escolásticas vacías de la jerarquía católica, abogando por un cristianismo interiorizado y humanista."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c04",
                    question = "En el tratado político El Príncipe (1513), el florentino Nicolás Maquiavelo fundó la ciencia política moderna al postular que:",
                    options = listOf(
                        "Los reyes deben someter todas sus decisiones de Estado al dictamen moral de los obispos.",
                        "La política es un ámbito autónomo regido por la correlación de fuerzas y la eficacia práctica del poder, disociada de la moral religiosa tradicional ('el fin justifica los medios').",
                        "La mejor forma de gobierno es una teocracia gobernada por profetas desarmados.",
                        "La guerra debe ser abolida en favor del arbitraje universal de las guildas gremiales."
                    ),
                    correctIndex = 1,
                    explanation = "Maquiavelo secularizó y autonomizó la política respecto a la moral teológica, analizando la conquista y conservación del poder estatal mediante la 'virtù' y la 'fortuna' con crudo realismo empírico."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c05",
                    question = "La cuna del Renacimiento artístico del Quattrocento (siglo XV) fue la próspera ciudad italiana de Florencia, cuyo florecimiento cultural fue posible gracias al generoso mecenazgo de:",
                    options = listOf(
                        "La dinastía Borbón.",
                        "La familia Médici (notablemente Cosme y Lorenzo 'el Magnífico').",
                        "Los reyes plantagenet de Inglaterra.",
                        "La Liga Hanseática del mar Báltico."
                    ),
                    correctIndex = 1,
                    explanation = "La opulenta familia bancaria de los Médici convirtió a Florencia en el epicentro artístico e intelectual del Quattrocento al financiar y cobijar a grandes genios como Donatello, Botticelli y Brunelleschi."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c06",
                    question = "La invención técnica decisiva atribuida a Johannes Gutenberg en Maguncia (Alemania) hacia 1440, que revolucionó la difusión de las ideas humanistas y las ciencias, fue:",
                    options = listOf(
                        "El telescopio astronómico reflector.",
                        "La imprenta moderna de tipos móviles metálicos intercambiables.",
                        "El telégrafo de señales ópticas.",
                        "El astrolabio náutico de bronce."
                    ),
                    correctIndex = 1,
                    explanation = "Gutenberg perfeccionó la imprenta con caracteres móviles metálicos, tinta oleosa y prensa de tornillo (publicando la célebre Biblia de 42 líneas), lo que abarató exponencialmente los libros y aceleró la transmisión del saber humanista."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c07",
                    question = "El arquetipo universal del 'hombre renacentista' (*Homo Universalis*), quien dominó con maestría la pintura (La Gioconda, La Última Cena), la escultura, la anatomía, la hidráulica y la ingeniería militar, fue:",
                    options = listOf(
                        "Leonardo da Vinci.",
                        "Sandro Botticelli.",
                        "Tiziano Vecellio.",
                        "Tintoretto."
                    ),
                    correctIndex = 0,
                    explanation = "Leonardo da Vinci (1452 - 1519) encarnó el ideal del Homo Universalis del Renacimiento: polímata infatigable que integró el rigor del dibujo anatómico y técnico con una técnica pictórica prodigiosa como el sfumato."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c08",
                    question = "El colosal artista florentino que esculpió el David de mármol de Carrara, la Piedad del Vaticano y pintó los frescos monumentales de la bóveda de la Capilla Sixtina y el Juicio Final fue:",
                    options = listOf(
                        "Donatello.",
                        "Filippo Brunelleschi.",
                        "Miguel Ángel Buonarroti.",
                        "Masaccio."
                    ),
                    correctIndex = 2,
                    explanation = "Miguel Ángel Buonarroti (1475 - 1564) personificó la grandeza monumental del Cinquecento italiano con su 'terribilità' expresiva plasmada en la escultura anatómica heroica y en los frescos de la Capilla Sixtina."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c09",
                    question = "¿Cuál de las siguientes obras cumbre de la pintura renacentista del Cinquecento, plasmada en los frescos monumentales de las estancias vaticanas para el pontificado romano, fue realizada por Rafael Sanzio?",
                    options = listOf(
                        "La Gioconda.",
                        "El nacimiento de Venus.",
                        "La escuela de Atenas.",
                        "La creación de Adán."
                    ),
                    correctIndex = 2,
                    explanation = "Rafael Sanzio (1483 - 1520), maestro supremo de la armonía, la proporción y el equilibrio compositivo del Cinquecento romano, pintó 'La escuela de Atenas' en la Stanza della Segnatura del Vaticano por encargo del papa Julio II."
                ),
                QuizChallenge(
                    id = "huni_t05_s01_c10",
                    question = "¿Qué trascendental tratado internacional de reparto colonial suscribieron las coronas de España y Portugal en 1494, fijando la línea divisoria a 370 leguas al oeste de las islas de Cabo Verde?",
                    options = listOf(
                        "La Capitulación de Santa Fe.",
                        "El Tratado de Tordesillas.",
                        "La Bula Inter Caetera.",
                        "El Tratado de Utrecht."
                    ),
                    correctIndex = 1,
                    explanation = "El Tratado de Tordesillas (1494) fue suscrito directamente entre los Reyes Católicos y Juan II de Portugal, trasladando el meridiano divisorio papal a 370 leguas al oeste de Cabo Verde, lo que otorgó a la corona portuguesa la costa de Brasil."
                )
            )
        ),
        LessonNode(
            id = "huni_t05_s02",
            subjectId = "historia_universal",
            semana = 5,
            subtema = 2,
            title = "La Reforma Protestante, la Contrarreforma Católica y la Ilustración",
            theory = LessonTheory(
                title = "La Reforma Protestante, la Contrarreforma Católica y el Siglo de las Luces",
                content = """### 3.4. La Reforma Protestante y la Contrarreforma Católica

#### A. Causas de la Reforma Protestante:
- Corrupción moral generalizada de la jerarquía católica: **simonía** (compraventa de cargos eclesiásticos), **nicolaísmo** (ruptura del celibato sacerdotal) y **nepotismo**.
- El detonante inmediato: La **Venta de Indulgencias** promulgada por el Papa **León X** en 1515 para costear la edificación de la Basílica de San Pedro en Roma, administrada en Alemania por los frailes dominicos (Johann Tetzel).

#### B. Las Vertientes Protestantes:
1. **Luteranismo (Alemania):**
   - El monje agustino **Martín Lutero** clavó sus **95 Tesis** contra las indulgencias en la puerta de la iglesia del castillo de Wittenberg (31 de octubre de 1517).
   - *Pilares Doctrinales:* **Sola Fide** (la justificación y salvación se alcanza exclusivamente por la fe, no por las buenas obras ni compra de bulas), **Sola Scriptura** (la Biblia es la única fuente de verdad dogmática y debe interpretarse por libre examen), reducción a **dos sacramentos** (Bautismo y Eucaristía) y abolición del celibato y culto a los santos y a la Virgen.
   - *Hitos Políticos:* Dieta de Worms (1521, Carlos V condena a Lutero), Dieta de Spira (1529, los príncipes protestan formalmente contra el emperador), y la **Paz de Augsburgo (1555)**, que reconoció la libertad religiosa a los príncipes alemanes (*Cuius regio, eius religio*: la religión del príncipe es la religión de sus súbditos).
2. **Calvinismo (Suiza y Francia):**
   - Impulsado por **Juan Calvino** desde Ginebra.
   - *Doctrina de la Predestinación Absoluta:* Desde el inicio de la Creación, Dios ya determinó quiénes se salvan y quiénes se condenan eternamente; el éxito material, la disciplina laboral austera y la prosperidad económica son signos terrenales de la gracia divina (tesis analizada por Max Weber en *La ética protestante y el espíritu del capitalismo*).
   - Difusión: En Francia se llamaron **Hugonotes**; en Inglaterra, **Puritanos**; y en Escocia, **Presbiterianos** (John Knox).
3. **Anglicanismo (Inglaterra):**
   - Cisma de origen dinástico-político encabezado por el rey **Enrique VIII**.
   - Ante la negativa del Papa Clemente VII a concederle el divorcio de Catalina de Aragón para desposar a Ana Bolena, el monarca promulgó el **Acta de Supremacía (1534)**, convirtiéndose en el Jefe Supremo indiscutible de la Iglesia de Inglaterra.

#### C. La Contrarreforma o Reforma Católica:
Reacción defensiva y modernizadora de la Iglesia Católica para frenar el avance del protestantismo.
1. **El Concilio de Trento (1545 - 1563):** Convocado por el Papa **Paulo III**.
   - *Ratificación Dogmática:* Reafirmó los siete sacramentos, la autoridad suprema del Papa, el libre albedrío humano complementado con las buenas obras para la salvación, la veneración de la Virgen y santos, y el valor normativo de la tradición eclesiástica junto a la Biblia Vulgata.
   - *Medidas Disciplinarias:* Supresión de la venta de indulgencias, mantenimiento estricto del celibato eclesiástico y creación obligatoria de seminarios diocesanos para la rigurosa instrucción moral del clero.
2. **La Compañía de Jesús (1534):** Orden religiosa de corte militar fundada por **San Ignacio de Loyola**. Se rigió por el voto de obediencia absoluta y directa al Papa (*perinde ac cadaver*), destacando por sus misiones evangelizadoras globales (Asia y América) y su sólida red de colegios humanistas.
3. **El Tribunal del Santo Oficio de la Inquisición y el Index:** Reorganización del tribunal inquisitorial para reprimir la herejía y publicación del *Index Librorum Prohibitorum* (catálogo oficial de libros prohibidos para los católicos).

---

### 3.5. El Absolutismo Monárquico y el Nacimiento del Estado Moderno
Sistema de gobierno imperante en los siglos XVII y XVIII donde el monarca concentraba todos los poderes del Estado sin contrapeso institucional.
- **Teóricos del Absolutismo:**
  - *Jacques Bossuet:* Teoría del **Derecho Divino de los Reyes** (*Política deducida de las Sagradas Escrituras*): el poder emana directamente de Dios hacia el rey, rindiendo cuentas solo ante el Creador.
  - *Jean Bodin:* Teoría de la soberanía indivisible e incondicional del monarca.
  - *Thomas Hobbes:* En *Leviatán*, sostiene que el hombre es un ser egoísta (*"homo homini lupus"*) que para escapar de la anarquía salvaje debe ceder voluntariamente su libertad absoluta a un gobernante supremo autoritario.
- **Máximo Exponente:** **Luis XIV de Francia**, el "Rey Sol" (*"L'État, c'est moi"* / *"El Estado soy yo"*), quien construyó el opulento Palacio de Versalles para domesticar a la nobleza cortesana y aplicó el mercantilismo estatal bajo su ministro Jean-Baptiste Colbert.
- **La Excepción Inglesa (Monarquía Parlamentaria):**
  - Tras la Guerra Civil y la dictadura puritana de Oliver Cromwell, estalla la **Revolución Gloriosa de 1688**, derrocando al absolutista católico Jacobo II.
  - Los nuevos monarcas Guillermo de Orange y María Stuart juraron la **Declaración de Derechos (*Bill of Rights*, 1689)**, naciendo la primera monarquía parlamentaria constitucional del mundo (*"el rey reina, pero no gobierna"*).
- **La Paz de Westfalia (1648):** Puso fin a la sangrienta **Guerra de los Treinta Años**. Consagró el principio de **soberanía estatal territorial**, el equilibrio de poder en Europa y el fin definitivo de las pretensiones de hegemonía católica universal de los Habsburgo.

---

### 3.6. La Ilustración: "El Siglo de las Luces" (Siglo XVIII)
Movimiento intelectual y filosófico burgués que propugnó el uso de la **Razón crítica** como el instrumento soberano para disipar las tinieblas de la ignorancia, la superstición religiosa y el absolutismo tiránico del Antiguo Régimen.

#### A. Filósofos Políticos Clave:
1. **John Locke (1632 - 1704):** Precursor de la Ilustración y padre del liberalismo político. Sostuvo que todo ser humano posee por naturaleza derechos inalienables fundamentales: **vida, libertad y propiedad privada**. El Estado surge de un contrato social para proteger dichos derechos; si el gobernante los vulnera, el pueblo tiene el legítimo **derecho a la rebelión**.
2. **Montesquieu (1689 - 1755):** En *El espíritu de las leyes*, formuló el principio de la **separación de poderes** del Estado en **Ejecutivo, Legislativo y Judicial**, garantizando un sistema de frenos y contrapesos que impida la tiranía absolutista.
3. **Voltaire (1694 - 1778):** En *Cartas filosóficas*, defendió de forma intransigente la **libertad de pensamiento y expresión** y la tolerancia religiosa, combatiendo agriamente el fanatismo del clero católico.
4. **Jean-Jacques Rousseau (1712 - 1778):** En *El contrato social*, formuló el principio de la **soberanía popular** y la voluntad general. Postuló que el hombre nace libre y bondadoso por naturaleza, pero la sociedad y la propiedad privada lo corrompen (*"El hombre nace bueno, la sociedad lo corrompe"*).

#### B. La Enciclopedia (*L'Encyclopédie*, 1751 - 1772):
Empresa intelectual monumental dirigida por **Denis Diderot** y el matemático **Jean d'Alembert** (compuesta por 28 volúmenes). Reunió los conocimientos científicos, técnicos, económicos y filosóficos de la época bajo un prisma racionalista, convirtiéndose en el ariete ideológico de la burguesía contra la monarquía absoluta y la Iglesia.

#### C. El Despotismo Ilustrado:
Fórmula política asumida por varios monarcas absolutos del siglo XVIII para modernizar la economía, la ciencia y la administración de sus reinos adoptando reformas ilustradas, pero manteniendo incólume el monopolio autoritario del poder:
\text{"Todo para el pueblo, pero sin el pueblo"}
- **Principales Déspotas Ilustrados:**
  - *Federico II el Grande de Prusia:* Amigo de Voltaire, abolió la tortura e implantó la educación primaria obligatoria.
  - *Catalina II la Grande de Rusia:* Fomentó las artes y la colonización territorial.
  - *Carlos III de España:* Expulsó a los jesuitas (1767) y aplicó las Reformas Borbónicas comerciales y fiscales en América.
  - *José II de Austria:* Abolió la servidumbre de la gleba y decretó la tolerancia religiosa.

---"""
            ),
            challenges = listOf(
                QuizChallenge(
                    id = "huni_t05_s02_c01",
                    question = "El acontecimiento histórico que detonó formalmente el estallido de la Reforma Protestante tuvo lugar el 31 de octubre de 1517, cuando el monje agustino Martín Lutero:",
                    options = listOf(
                        "Promulgó la Bula Exsurge Domine condenando al clero de Roma.",
                        "Clavó sus 95 Tesis en las puertas de la iglesia del castillo de Wittenberg contra la venta de indulgencias.",
                        "Coronó emperador a Carlos V en la ciudad de Augsburgo.",
                        "Tradujo el Nuevo Testamento al francés en la corte de Ginebra."
                    ),
                    correctIndex = 1,
                    explanation = "Martín Lutero fijó sus 95 Tesis en la puerta del templo de Wittenberg el 31 de octubre de 1517, denunciando teológicamente el tráfico lucrativo de las indulgencias promovido por el papa León X y predicado por Johann Tetzel."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c02",
                    question = "El principio teológico medular de la doctrina luterana que destruyó la necesidad de la intermediación sacerdotal y el monopolio sacramental de la Iglesia romana es:",
                    options = listOf(
                        "La infalibilidad del Sumo Pontífice en materia litúrgica.",
                        "La justificación por la sola fe (Sola Fide) y el libre examen de las Sagradas Escrituras (Sola Scriptura).",
                        "La salvación alcanzada prioritariamente mediante limosnas y compra de bulas.",
                        "El celibato obligatorio para todos los creyentes reformados."
                    ),
                    correctIndex = 1,
                    explanation = "Para Lutero, la gracia salvadora emana exclusivamente de la fe personal ('Sola Fide') concedida por Dios, invalidando las obras mercenarias y los sacramentos no instituidos directamente por Cristo en los Evangelios ('Sola Scriptura')."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c03",
                    question = "En la asamblea imperial de la Dieta de Worms (1521), presidida por el joven emperador Carlos V del Sacro Imperio Romano Germánico, Martín Lutero:",
                    options = listOf(
                        "Aceptó retractarse de sus escritos ante los legados pontificios a cambio del obispado de Maguncia.",
                        "Se negó rotundamente a abjurar de sus doctrinas afirmando que su conciencia estaba cautiva de la Palabra de Dios, siendo proscrito del Imperio.",
                        "Firmó la Paz de Augsburgo reconociendo el principio 'cuius regio, eius religio'.",
                        "Encabezó militarmente la insurrección de los campesinos anabaptistas de Thomas Müntzer."
                    ),
                    correctIndex = 1,
                    explanation = "En Worms (1521), Lutero rehusó capitular ante Carlos V y la Iglesia si no era convencido por testimonios de la Escritura o por razones evidentes, tras lo cual Federico el Sabio de Sajonia le brindó refugio en el castillo de Wartburg."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c04",
                    question = "La doctrina reformadora fundada por el teólogo francés Juan Calvino en la ciudad suiza de Ginebra se distinguió por su extremo rigor moral y su dogma teológico central consistente en:",
                    options = listOf(
                        "La doctrina de la doble predestinación divina (Dios ya eligió desde la eternidad quiénes se salvan y quiénes se condenan).",
                        "La permisión absoluta de las indulgencias y la devoción irrestricta a las reliquias santas.",
                        "La primacía jerárquica del rey sobre las asambleas de ancianos y consistorios.",
                        "La negación de la existencia de la Biblia como fuente dogmática."
                    ),
                    correctIndex = 0,
                    explanation = "El calvinismo erigió la doctrina de la predestinación absoluta: Dios escoge soberanamente a sus elegidos sin importar los méritos humanos, siendo el éxito laboral honesto y la sobriedad puritana signos terrenales de elección divina."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c05",
                    question = "La Reforma en Inglaterra adquirió un carácter político y dinástico singular cuando el rey Enrique VIII rompió definitivamente con el papa Clemente VII en 1534 mediante la promulgación de:",
                    options = listOf(
                        "El Edicto de Nantes.",
                        "El Acta de Supremacía, declarándose cabeza suprema y única de la Iglesia de Inglaterra (Iglesia Anglicana).",
                        "La Bula Regimini Militantis Ecclesiae.",
                        "El Tratado de Westfalia."
                    ),
                    correctIndex = 1,
                    explanation = "Mediante el Acta de Supremacía (1534), Enrique VIII consumó el cisma anglicano tras la negativa papal de anular su matrimonio con Catalina de Aragón, confiscando los cuantiosos feudos monásticos católicos para la corona."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c06",
                    question = "La respuesta institucional y dogmática de la Iglesia Católica para contener el avance del protestantismo se estructuró en el Concilio de Trento (1545 - 1563), donde se reafirmaron principios como:",
                    options = listOf(
                        "La adopción del libre examen bíblico y la abolición del Tribunal de la Santa Inquisición.",
                        "El valor vinculante de la Sagrada Tradición junto a las Escrituras, los 7 sacramentos, el celibato clerical y la autoridad absoluta del Papa.",
                        "La supresión definitiva de la Vulgata latina de San Jerónimo.",
                        "La conversión de la misa católica a lenguas vulgares sin consagración eucarística."
                    ),
                    correctIndex = 1,
                    explanation = "Trento clausuró cualquier concesión teológica al protestantismo: ratificó la Vulgata latina como texto oficial, confirmó los siete sacramentos, la transustanciación eucarística, el culto a la Virgen y santos, e instituyó seminarios sacerdotales."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c07",
                    question = "La orden religiosa de combate espiritual fundada en 1534 por el militar español Íñigo de Loyola (San Ignacio de Loyola), consagrada con un cuarto voto de obediencia ciega y directa al Sumo Pontífice, fue:",
                    options = listOf(
                        "La Orden de Frailes Menores Franciscanos.",
                        "La Compañía de Jesús (orden jesuita).",
                        "Los Caballeros Templarios.",
                        "La Orden de los Hermanos Predicadores Dominicos."
                    ),
                    correctIndex = 1,
                    explanation = "Aprobada por el papa Paulo III en 1540 (Regimini Militantis Ecclesiae), la Compañía de Jesús fue el brazo intelectual y misionero más combativo de la Contrarreforma mediante colegios de élite y misiones evangelizadoras mundiales."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c08",
                    question = "El movimiento filosófico, científico y cultural del siglo XVIII denominado 'La Ilustración' (el Siglo de las Luces) tuvo como postulado fundacional supremo:",
                    options = listOf(
                        "La subordinación ciega del entendimiento a la tradición teológica y el absolutismo monárquico.",
                        "La confianza plena e ilimitada en la Razón humana como instrumento soberano para disipar las tinieblas de la ignorancia, la tiranía y la superstición.",
                        "La prohibición de la investigación física y el rechazo del método empírico experimental.",
                        "La concentración teocrática de todos los poderes públicos en manos del clero secular."
                    ),
                    correctIndex = 1,
                    explanation = "La Ilustración proclamó la primacía de la razón crítica, el progreso científico y los derechos naturales del hombre, cuestionando frontalmente el Antiguo Régimen y sentando las bases doctrinarias del republicanismo contemporáneo."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c09",
                    question = "En su célebre tratado El espíritu de las leyes (1748), el filósofo ilustrado francés Barón de Montesquieu formuló un principio político fundamental que sustenta las democracias republicanas contemporáneas consistente en:",
                    options = listOf(
                        "La justificación del origen divino del poder despótico de los monarcas.",
                        "La división y equilibrio del poder del Estado en tres ramas autónomas e independientes: Ejecutivo, Legislativo y Judicial.",
                        "La disolución de los parlamentos en beneficio de un consejo militar vitalicio.",
                        "La supresión del derecho al voto para toda persona que no posea títulos nobiliarios."
                    ),
                    correctIndex = 1,
                    explanation = "Montesquieu teorizó la separación y balance de poderes (frenos y contrapesos) para evitar la tiranía y asegurar la libertad política del ciudadano, postulando que 'el poder debe frenar al poder'."
                ),
                QuizChallenge(
                    id = "huni_t05_s02_c10",
                    question = "En El contrato social (1762), Jean-Jacques Rousseau expuso una tesis revolucionaria que sirvió de base a la democracia moderna y a la Revolución Francesa afirmando que:",
                    options = listOf(
                        "La soberanía reside inalienable e indivisiblemente en el Pueblo a través de la Voluntad General, y que los gobernantes son meros mandatarios temporales de la comunidad.",
                        "El poder político debe concentrarse indivisiblemente en un monarca hereditario de derecho divino para evitar la anarquía.",
                        "La soberanía reside únicamente en los terratenientes y propietarios de bienes inmuebles.",
                        "Los ciudadanos deben someter su voluntad particular al dictamen teológico inapelable del papa de Roma."
                    ),
                    correctIndex = 0,
                    explanation = "Rousseau afirmó que el pacto social legítimo funda la soberanía popular: el pueblo soberano expresa la Voluntad General orientada al bien común, constituyendo a los gobernantes en servidores subordinados a dicha voluntad."
                )
            )
        )
    )
}
