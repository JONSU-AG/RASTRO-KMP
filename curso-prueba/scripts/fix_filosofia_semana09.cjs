const fs = require('fs');
const path = require('path');

const fileContent = `package filosofia

object FilosofiaSemana09 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t09_s01",
            subjectId = "filosofia",
            semana = 9,
            subtema = "9.1",
            title = "A. Naturaleza de la Estética y la Experiencia Estética",
            theory = LessonTheory(
                content = """
### A. Naturaleza de la Estética y la Experiencia Estética

1. **Fundación Disciplinar**:
   - Acuñada como disciplina filosófica autónoma en 1750 por **Alexander Gottlieb Baumgarten** (*Aesthetica*), quien la definió como la *"ciencia del conocimiento sensible"* ($\\alpha\\hat{\\imath}\\sigma\\theta\\eta\\sigma\\iota\\varsigma$, *aísthesis*).

2. **La Experiencia Estética y la Actitud Desinteresada**:
   - Frente a un objeto del mundo podemos adoptar distintas actitudes:
     - *Actitud Pragmática o Utilitaria*: Consideramos el objeto como un medio o instrumento para un fin práctico (ej. una manzana para saciar el hambre).
     - *Actitud Científica*: Analizamos las leyes físico-químicas o biológicas del objeto.
     - *Actitud Estética*: Contemplamos el objeto por sí mismo, por el gozo sensorial, emotivo e intelectual que produce su forma, sin ningún afán de posesión ni utilidad económica.

3. **El Juicio de Gusto según Immanuel Kant** (*Crítica del Juicio*, 1790):
   - **Placer Desinteresado**: Lo bello place sin que medie ningún interés material o sensual egoísta.
   - **Universalidad sin Concepto**: Cuando decimos *"esta puesta de sol es bella"*, exigimos que todos compartan ese juicio, aun cuando no podamos demostrarlo mediante una regla lógica formal abstracta.
   - **Finalidad sin Fin**: El objeto bello parece haber sido diseñado con un propósito armonioso, aunque no sirva para ninguna función pragmática exterior.

### B. Las Categorías Estéticas

Son los distintos matices emocionales y conceptuales con los que la conciencia humana valora sensiblemente la realidad y las obras artísticas:

1. **Lo Bello**:
   - Tradición clásica (Policleto, Platón, Tomás de Aquino): Cualidad que genera agrado armónico. Se funda en la proporción matemática, la simetría, la mesura y la consonancia de las partes con el todo (*pulchrum*).

2. **Lo Sublime**:
   - Teorizado por Edmund Burke y consolidado por Immanuel Kant.
   - Es la experiencia ante lo **inconmensurable, grandioso, infinito o terrorífico de la naturaleza** que desborda nuestra imaginación sensorial (un océano embravecido, una erupción volcánica, el abismo cósmico estrellado).
   - Produce un "terror deleitoso": primero una sensación de pequeñez y asombro, seguida por la elevación moral del espíritu racional humano consciente de su dignidad superior frente a las fuerzas ciegas de la materia.

3. **Lo Trágico**:
   - Desgarramiento existencial en el que un héroe noble se enfrenta a un destino adverso inexorable (*fatum*) o a un conflicto irreconciliable de valores éticos supremos (ej. *Edipo Rey* o *Antígona* de Sófocles).
   - Produce en el espectador la **catarsis** ($\\kappa\\acute{\\alpha}\\theta\\alpha\\rho\\sigma\\iota\\varsigma$): purificación y liberación de las emociones de piedad y terror (Aristóteles, *Poética*).

4. **Lo Cómico y lo Ridículo**:
   - Provoca la risa y el desenfado mediante la ruptura inesperada de las expectativas lógicas, la exageración de defectos o la inadecuación evidente entre la pretensión y la realidad.

5. **Lo Feo y lo Grotesco**:
   - *Lo Feo*: Aquello que niega la simetría y armonía formal, generando repulsión sensible inicial; en el arte contemporáneo, lo feo se convierte en un recurso expresivo para denunciar el horror moral y social (ej. el expresionismo alemán, *Los fusilamientos del 3 de mayo* de Goya o el *Guernica* de Picasso).
   - *Lo Grotesco*: Fusión desconcertante y extravagante de lo trágico y lo cómico, lo humano y lo animal, lo monstruoso y lo cotidiano (vanguardias artísticas).
                """.trimIndent()
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t09_s01_c01",
                    question = "La disciplina filosófica que fue acuñada formalmente en 1750 por Alexander Gottlieb Baumgarten para estudiar el conocimiento sensible y las cualidades estéticas se denomina:",
                    options = listOf(
                        "Axiología moral.",
                        "Estética.",
                        "Epistemología formal.",
                        "Hermenéutica jurídica."
                    ),
                    correctIndex = 1,
                    explanation = "En 1750, Alexander Baumgarten publicó 'Aesthetica', fundando la Estética como disciplina filosófica autónoma centrada en el conocimiento sensible (aísthesis)."
                ),
                Challenge(
                    id = "filo_t09_s01_c02",
                    question = "A diferencia de la actitud pragmática o utilitaria frente a un objeto, la 'Actitud Estética' se caracteriza formalmente por:",
                    options = listOf(
                        "Considerar el objeto exclusivamente como un medio o instrumento para satisfacer una necesidad práctica inmediata.",
                        "Analizar empíricamente las leyes físico-químicas y la composición molecular de la materia.",
                        "Contemplar el objeto por sí mismo, gozando sensorial e intelectualmente de su forma sin afán de posesión ni utilidad económica.",
                        "Aplicar preceptos jurídicos punitivos para clasificar la propiedad del bien."
                    ),
                    correctIndex = 2,
                    explanation = "La teoría define la actitud estética como la contemplación desinteresada del objeto por su propio valor formal y sensible, distinguiéndola de la actitud utilitaria y científica."
                ),
                Challenge(
                    id = "filo_t09_s01_c03",
                    question = "En las formulaciones de Edmund Burke e Immanuel Kant, la categoría estética de 'lo Sublime' se define esencialmente como la experiencia provocada por:",
                    options = listOf(
                        "Lo inconmensurable, grandioso o terrorífico de la naturaleza que desborda la imaginación sensorial y produce un terror deleitoso con elevación espiritual.",
                        "La proporción matemática, simetría mesurada y equilibrio armónico de las figuras clásicas.",
                        "La ruptura inesperada de las leyes de la lógica formal mediante la parodia burlesca.",
                        "La degradación monstruosa de la figura humana mezclada con atributos animales."
                    ),
                    correctIndex = 0,
                    explanation = "Lo sublime surge ante fuerzas naturales desmesuradas o infinitas que sobrepasan la imaginación, provocando asombro reverente y la conciencia de la dignidad del espíritu."
                ),
                Challenge(
                    id = "filo_t09_s01_c04",
                    question = "La categoría estética de 'lo Trágico' se manifiesta de manera eminente cuando la trama dramática presenta:",
                    options = listOf(
                        "La distorsión bufonesca de las costumbres cotidianas para desatar el desenfado del público.",
                        "La consonancia perfecta de las partes con el todo según las reglas de proporción de Policleto.",
                        "El conflicto desgarrador y el destino inexorable de un héroe noble, suscitando en el espectador compasión, pavor y catarsis.",
                        "El análisis neutro y riguroso de una ley de la mecánica clásica."
                    ),
                    correctIndex = 2,
                    explanation = "Lo trágico encarna la lucha y caída inevitable de un protagonista virtuoso ante un destino fatal (fatum), produciendo la purificación emocional o catarsis."
                ),
                Challenge(
                    id = "filo_t09_s01_c05",
                    question = "En la fenomenología de las categorías estéticas, 'lo Cómico y lo Ridículo' surge primariamente a partir de:",
                    options = listOf(
                        "El pavor solemne ante la infinitud del cosmos y el abismo oceánico.",
                        "La ruptura inesperada de las expectativas lógicas y la manifiesta desproporción entre la pretensión y la realidad.",
                        "La contemplación serena de la simetría geométrica en templos de la antigüedad.",
                        "La purga moral de las pasiones angustiosas en el teatro dramático."
                    ),
                    correctIndex = 1,
                    explanation = "Lo cómico se produce cuando se quiebran súbitamente las expectativas racionales mediante el absurdo, la exageración de defectos o el contraste risible."
                ),
                Challenge(
                    id = "filo_t09_s01_c06",
                    question = "En la teoría estética contemporánea, la categoría de 'lo Grotesco' se define conceptualmente como:",
                    options = listOf(
                        "La búsqueda de la armonía inmaculada mediante cánones de proporción anatómica.",
                        "El sentimiento de pequeñez física compensado por la ley moral de la razón pura.",
                        "La fusión extravagante y desconcertante de lo trágico y lo cómico, lo humano y lo monstruoso.",
                        "El interés utilitario por adquirir objetos de decoración residencial."
                    ),
                    correctIndex = 2,
                    explanation = "Lo grotesco combina de modo inquietante elementos opuestos: lo trágico con lo ridículo, lo humano con lo bestial o monstruoso, provocando extrañamiento."
                ),
                Challenge(
                    id = "filo_t09_s01_c07",
                    question = "Immanuel Kant sostuvo en la 'Crítica del Juicio' que el juicio de gusto sobre lo bello se distingue porque descansa en un placer:",
                    options = listOf(
                        "Estrictamente sensorial y corporal, idéntico al apetito fisiológico.",
                        "Desinteresado, libre de inclinación egoísta y exento de todo provecho pragmático exterior.",
                        "Deducido de manera demostrativa mediante un silogismo lógico universal.",
                        "Determinado por el valor mercantil fijado en los tratados de economía."
                    ),
                    correctIndex = 1,
                    explanation = "Para Kant, lo bello place desinteresadamente: no persigue posesión material, saciedad orgánica ni utilidad práctica, diferenciándose del apetito y del provecho."
                ),
                Challenge(
                    id = "filo_t09_s01_c08",
                    question = "Según la formulación kantiana del juicio de gusto, la expresión 'universalidad sin concepto' significa que al afirmar que algo es bello:",
                    options = listOf(
                        "Se exige que todos compartan la complacencia estética sin que medie una regla conceptual abstracta o demostración lógica formal.",
                        "Se impone una ley jurídica coactiva sancionada por los tribunales del Estado.",
                        "Se afirma un teorema geométrico que puede ser refutado con cálculo algebraico.",
                        "Se acepta que cada individuo posee una percepción totalmente incomunicable e indiferente."
                    ),
                    correctIndex = 0,
                    explanation = "Kant explica que cuando juzgamos algo como bello pretendemos que los demás coincidan con nuestra vivencia, aunque no podamos fundamentarlo con una demostración conceptual."
                ),
                Challenge(
                    id = "filo_t09_s01_c09",
                    question = "En la tradición clásica consolidada por pensadores como Policleto y Tomás de Aquino, la categoría de 'lo Bello' se fundamenta en:",
                    options = listOf(
                        "La rebelión caótica de los instintos y la disonancia formal deliberada.",
                        "El asombro sobrecogedor ante el cataclismo de una tormenta marina infinita.",
                        "La proporción matemática, la simetría mesurada y la consonancia armónica de las partes con el todo.",
                        "La denuncia del horror moral mediante figuras desgarradas y monstruosas."
                    ),
                    correctIndex = 2,
                    explanation = "La tradición estética clásica asocia lo bello al orden, la simetría, la proporción numérica y la consonancia formal armoniosa de la totalidad (pulchrum)."
                ),
                Challenge(
                    id = "filo_t09_s01_c10",
                    question = "Cuando en el arte contemporáneo obras como el 'Guernica' o el expresionismo emplean 'lo Feo' como recurso expresivo, su finalidad estética principal radica en:",
                    options = listOf(
                        "Complacer los gustos decorativos superficiales de las clases adineradas.",
                        "Copiar con pasividad técnica las medidas anatómicas de la escultura helenística.",
                        "Garantizar la rentabilidad de las industrias comerciales de entretenimiento.",
                        "Denunciar el sufrimiento existencial, el horror moral y las contradicciones de la sociedad humana.",
                    ),
                    correctIndex = 3,
                    explanation = "En el arte contemporáneo, lo feo rompe los cánones de belleza idílica para convertirse en un medio de denuncia social, crítica política y testimonio del dolor humano."
                )
            )
        ),
        LessonNode(
            id = "filo_t09_s02",
            subjectId = "filosofia",
            semana = 9,
            subtema = "9.2",
            title = "C. Concepciones Filosóficas del Arte a lo Largo de la Historia",
            theory = LessonTheory(
                content = """
### C. Concepciones Filosóficas del Arte a lo Largo de la Historia

1. **El Arte como Mímesis (Imitación de la Naturaleza)**:
   - **Platón**: Condena a los artistas en *La República*. Si el mundo sensible es ya una copia imperfecta de las Ideas, las pinturas y esculturas son **copias de copias** (tres grados alejadas de la Verdad). El arte pictórico engaña los sentidos y estimula las pasiones irracionales del alma, por lo que los poetas deben ser expulsados de la polis ideal.
   - **Aristóteles**: Reivindica el arte en la *Poética*. La mímesis no es un engaño servil, sino una tendencia humana innata de aprendizaje que recrea lo verosímil y universal; a través del drama trágico se produce la **catarsis**, restaurando el equilibrio psíquico del ciudadano.

2. **El Arte como Manifestación Sensible de la Idea (G. W. F. Hegel)**:
   - El arte es una de las tres etapas de manifestación del Espíritu Absoluto (junto a la Religión y la Filosofía).
   - Define lo bello como *"la manifestación sensible de la Idea"*.
   - Plantea la tesis del **fin o muerte del arte**: en la modernidad, el pensamiento reflexivo y la filosofía superan al arte en su capacidad de expresar la verdad suprema; el arte deja de ser la forma más elevada de autoconciencia del Espíritu.

3. **El Arte como Desocultamiento de la Verdad (Martin Heidegger)**:
   - En *El origen de la obra de arte* (1935), rechaza que el arte sea mero adorno estético burgués.
   - Analiza la pintura de los zapatos de campesino de Van Gogh: la obra no representa un calzado cualquiera, sino que abre y desoculta un "mundo" (el sudor, la dureza del surco, la verdad del ser del campesino). El arte es acontecimiento de la verdad como desocultamiento ($\\dot{\\alpha}\\lambda\\acute{\\eta}\\theta\\epsilon\\iota\\alpha$, *aletheia*).

### D. El Arte en la Era Industrial y la Posmodernidad

1. **Walter Benjamin y la Pérdida del Aura** (*La obra de arte en la época de su reproductibilidad técnica*, 1936):
   - **El Aura**: La atmósfera irrepetible de lejanía, originalidad, misterio y autenticidad que posee una obra de arte original ligada a su función ritual o de culto ("aquí y ahora").
   - Con la aparición de la fotografía, la imprenta industrial y el cine, la obra de arte se reproduce masivamente y pierde su aura.
   - Consecuencia ambivalente: se liquida el valor de culto aristocrático, pero se abre la posibilidad de la **democratización y politización del arte** para las masas.

2. **Theodor Adorno y la Industria Cultural**:
   - Crítica radical al capitalismo tardío: el arte auténtico (que debe ser crítico, incómodo y negador de la realidad) ha sido secuestrado por la **industria cultural**, que transforma la música, el cine y la literatura en mercancías estandarizadas para el entretenimiento pasivo y la alienación consumista de las masas.

3. **Arthur Danto y el Fin del Arte** (*La transfiguración del lugar común*, 1981):
   - Analiza las *Brillo Boxes* de Andy Warhol (cajas de jabón idénticas a las del supermercado exhibidas en una galería de arte).
   - Pregunta clave: ¿Por qué dos objetos visualmente idénticos, uno es arte y el otro es mera mercancía?
   - Conclusión: El arte ha dejado de ser una cuestión visual de belleza estética formal; ahora es arte porque está inmerso en una atmósfera de teoría e historia que le otorga significado dentro del "mundo del arte" (*Artworld*). El arte se ha transformado en filosofía.
                """.trimIndent()
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t09_s02_c01",
                    question = "En el diálogo 'La República', Platón condena el arte imitativo y justifica la exclusión de los poetas de la polis ideal porque concibe que la obra artística es:",
                    options = listOf(
                        "Una copia de copias, tres grados alejada de la Verdad inteligible de las Ideas, que falsea lo real y agita las pasiones irracionales del alma.",
                        "El desocultamiento ontológico del ser del campesino y de su instrumentalidad histórica.",
                        "La fase suprema y definitiva en la que el Espíritu Absoluto alcanza su plena autoconciencia racional.",
                        "Una manifestación de la atmósfera irrepetible de lejanía ligada al valor de culto y al aura tradicional."
                    ),
                    correctIndex = 0,
                    explanation = "Platón sostiene que los objetos sensibles son ya copias de las Ideas; el arte, al imitar las cosas sensibles, es una copia de una copia (tercer grado de alejamiento de la verdad)."
                ),
                Challenge(
                    id = "filo_t09_s02_c02",
                    question = "En contraste con la condena platónica, Aristóteles reivindicó la 'Mímesis' en la 'Poética' argumentando fundamentalmente que:",
                    options = listOf(
                        "Es un engaño dañino que pervierte irremediablemente la conducta cívica de los gobernantes.",
                        "Es una inclinación humana innata orientada al aprendizaje que permite recrear lo verosímil y universal, culminando en la catarsis.",
                        "Constituye una técnica mercantil propia de la industria cultural para alienar el juicio crítico de las masas.",
                        "Se reduce a la transfiguración discursiva otorgada por la comunidad de críticos del Artworld."
                    ),
                    correctIndex = 1,
                    explanation = "Aristóteles rescata la mímesis como una capacidad connatural al hombre que facilita el aprendizaje y la contemplación de lo universal a través de la representación verosímil."
                ),
                Challenge(
                    id = "filo_t09_s02_c03",
                    question = "En la concepción dramática aristotélica, el efecto liberador de la 'Catarsis' consiste de modo preciso en:",
                    options = listOf(
                        "La anulación total de la capacidad racional del espectador durante la representación escénica.",
                        "La sustitución de los mitos religiosos clásicos por reglamentos administrativos del Estado.",
                        "La purificación y armonización interior de las emociones de piedad y terror suscitadas por el destino del héroe trágico.",
                        "La reproducción en serie de objetos litúrgicos para el consumo masivo de los ciudadanos."
                    ),
                    correctIndex = 2,
                    explanation = "Para Aristóteles, la tragedia tiene un efecto catártico en el público: purifica y descarga las emociones de compasión y pavor provocadas por el conflicto dramático."
                ),
                Challenge(
                    id = "filo_t09_s02_c04",
                    question = "Martin Heidegger, en 'El origen de la obra de arte' (1935), ilustra la naturaleza ontológica del arte mediante el análisis de los zapatos de Van Gogh, postulando que el arte es:",
                    options = listOf(
                        "Un simple adorno decorativo para embellecer las residencias burguesas de la época industrial.",
                        "Una copia servil de las propiedades químicas de los materiales empleados por los artesanos.",
                        "El acontecimiento de la verdad como desocultamiento (aletheia), donde la obra abre y revela el mundo y el ser de las cosas.",
                        "Una táctica propagandística diseñada para el entretenimiento estandarizado de la sociedad de masas."
                    ),
                    correctIndex = 2,
                    explanation = "Heidegger enseña que la obra de arte no es mero utensilio decorativo, sino acontecimiento de la verdad (aletheia) que desoculta y abre un mundo originario."
                ),
                Challenge(
                    id = "filo_t09_s02_c05",
                    question = "G. W. F. Hegel define la belleza artística en su sistema filosófico como la manifestación sensible de la Idea, formulando además la tesis de que en la época moderna:",
                    options = listOf(
                        "El arte renacerá como la única vía posible para que el Espíritu alcance la salvación religiosa.",
                        "El arte ha llegado a su fin o muerte relativa porque el pensamiento reflexivo y la filosofía lo superan en la captación de la verdad.",
                        "La pintura y la poesía deben subordinarse a la producción técnica masiva para recuperar su autenticidad sagrada.",
                        "Toda creación plástica debe limitarse a la reproducción mimética estricta de las especies biológicas."
                    ),
                    correctIndex = 1,
                    explanation = "Hegel plantea que el arte es superado por la filosofía reflexiva como vehículo más acabado del Espíritu Absoluto, marcando el fin del arte como suprema autoconciencia."
                ),
                Challenge(
                    id = "filo_t09_s02_c06",
                    question = "Al examinar las 'Brillo Boxes' de Andy Warhol, Arthur Danto demostró que un objeto común se convierte formalmente en obra de arte porque:",
                    options = listOf(
                        "Posee propiedades visuales y sensibles de armonía geométrica superiores a cualquier otro producto comercial.",
                        "Ha sido fabricado con maderas exóticas y pigmentos tradicionales extraídos de las canteras clásicas.",
                        "Fue bendecido mediante rituales mágicos de culto religioso en comunidades premodernas.",
                        "Se encuentra inmerso en una atmósfera de teoría e historia que le otorga estatus y significado dentro del 'mundo del arte' (Artworld)."
                    ),
                    correctIndex = 3,
                    explanation = "Danto concluye que lo que diferencia a una obra de arte de un objeto idéntico común no es una cualidad visual perceptible, sino su marco teórico dentro del Artworld."
                ),
                Challenge(
                    id = "filo_t09_s02_c07",
                    question = "La tesis de 'El Fin del Arte' proclamada por Arthur Danto en 'La transfiguración del lugar común' (1981) sostiene esencialmente que:",
                    options = listOf(
                        "El arte ha agotado su narrativa histórica lineal de progreso visual y se ha transformado en autoreflexión filosófica.",
                        "Los creadores plásticos han renunciado voluntariamente a exhibir sus creaciones en centros culturales.",
                        "La belleza platónica de las Ideas eternas ha sido reimplantada obligatoriamente en los museos del mundo.",
                        "La sociedad contemporánea ha proscrito toda manifestación poética para favorecer la economía agraria."
                    ),
                    correctIndex = 0,
                    explanation = "Danto sostiene que el arte ha alcanzado su culminación histórica: al volverse filosófico y conceptual, agota el progreso representacional de los estilos tradicionales."
                ),
                Challenge(
                    id = "filo_t09_s02_c08",
                    question = "En su célebre ensayo de 1936, Walter Benjamin analizó cómo la fotografía y el cine introducen la 'reproductibilidad técnica', originando:",
                    options = listOf(
                        "El afianzamiento del valor de culto ritual y el aumento de la inaccesibilidad aristocrática de las pinturas.",
                        "La pérdida del 'aura' (la atmósfera irrepetible de lejanía y autenticidad del original), posibilitando la democratización y politización del arte.",
                        "La sustitución de la verdad del desocultamiento ontológico por los dogmas escolásticos medievales.",
                        "La prohibición de toda circulación pública de imágenes visuales en las ciudades industriales."
                    ),
                    correctIndex = 1,
                    explanation = "Benjamin expone que la reproducción técnica masiva aniquila el aura tradicional de la obra de arte original, emancipándola del ritual y abriéndola a la política."
                ),
                Challenge(
                    id = "filo_t09_s02_c09",
                    question = "La crítica formulada por Theodor Adorno respecto a la 'Industria Cultural' en las sociedades capitalistas contemporáneas denuncia que:",
                    options = listOf(
                        "El arte mantiene una postura de resistencia inquebrantable que subvierte por completo el mercado comercial.",
                        "La pintura y la literatura han sido consagradas exclusivamente a la veneración teológica del Espíritu Absoluto.",
                        "El arte auténtico ha sido mercantilizado y estandarizado como mero entretenimiento pasivo para la alienación y el consumo de masas.",
                        "La reproducción en serie fortalece la autonomía crítica del espectador frente a la propaganda dominante."
                    ),
                    correctIndex = 2,
                    explanation = "Adorno denuncia que la industria cultural mercantiliza la creación artística, reduciéndola a productos estandarizados de consumo para el entretenimiento alienante."
                ),
                Challenge(
                    id = "filo_t09_s02_c10",
                    question = "De acuerdo con Walter Benjamin, el 'Aura' de una obra de arte se conceptualiza formalmente como:",
                    options = listOf(
                        "La simetría matemática y la armonía proporcional de las esculturas clásicas de Policleto.",
                        "El discurso interpretativo con el que los críticos del Artworld consagran a un objeto común.",
                        "La atmósfera irrepetible de lejanía, originalidad, misterio y autenticidad vinculada a su aquí y ahora y a su función de culto.",
                        "La subordinación servil de la imagen sensible al engaño mimético condenado en la República."
                    ),
                    correctIndex = 2,
                    explanation = "Benjamin define el aura como la 'manifestación irrepetible de una lejanía': la huella de autenticidad y singularidad espacio-temporal del original ligada al culto."
                )
            )
        )
    )
}
`;

fs.writeFileSync('SALIDA_KOTLIN/filosofia/FilosofiaSemana09.kt', fileContent, 'utf8');
console.log("Successfully wrote pristine FilosofiaSemana09.kt!");
