const fs = require('fs');
const path = require('path');

const srcMd = fs.readFileSync('03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md', 'utf8');

// Pedagogical boundary:
// s01: 3.1, 3.2, 3.3
// s02: 3.4, 3.5, 3.6

const p3 = srcMd.indexOf('## 3. DESARROLLO TEÓRICO FORMAL');
const p34 = srcMd.indexOf('### 3.4. La Reforma Protestante y la Contrarreforma Católica');
const p4 = srcMd.indexOf('## 4. CUADRO COMPARATIVO DEL PENSAMIENTO MODERNO');
const p5 = srcMd.indexOf('## 5. MNEMOTECNIAS');

const th1 = srcMd.slice(p3, p34).trim();
const th2 = srcMd.slice(p34, p4 !== -1 ? p4 : p5).trim();

const targetFile = 'SALIDA_KOTLIN/historia_universal/HistoriaUniversalSemana05.kt';

const newContent = `package historia_universal

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
                content = """${th1.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '')}"""
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
                content = """${th2.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '')}"""
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
`;

fs.writeFileSync(targetFile, newContent, 'utf8');
console.log('HistoriaUniversalSemana05.kt successfully repaired with strict boundaries!');
