const fs = require('fs');

const content = `package filosofia

object FilosofiaSemana08 {

    val lessons = listOf(
        LessonNode(
            id = "filo_t08_s01",
            subjectId = "filosofia",
            semana = 8,
            subtema = "8.1",
            title = "A. La Crisis de la Subjetividad Moderna y la Razón Ilustrada",
            theory = LessonTheory(
                content = """
### A. La Crisis de la Subjetividad Moderna y la Razón Ilustrada

- El proyecto de la Ilustración (Kant, Descartes, Hegel) concibió al sujeto humano como un ente plenamente autónomo, transparente a sí mismo, guiado por una razón universal capaz de emancipar a la humanidad mediante la ciencia y la técnica.
- **La Fractura del Siglo XX**: Las dos Guerras Mundiales, los totalitarismos, el Holocausto (Auschwitz) y la amenaza nuclear quebraron el optimismo racionalista.
- **La Escuela de Frankfurt** (Theodor Adorno y Max Horkheimer en *Dialéctica de la Ilustración*, 1944):
  - La razón ilustrada se degradó en **razón instrumental** (mero cálculo técnico de medios para fines de dominación de la naturaleza y del hombre).
  - Tesis célebre de Adorno: *"Escribir poesía después de Auschwitz es un acto de barbarie"*. Se exige un nuevo imperativo categórico: organizar el pensamiento y la praxis para que Auschwitz no se repita.

### B. Emmanuel Levinas y la Ética de la Alteridad

- **Crítica a la Ontología Occidental**: Levinas sostiene que toda la tradición filosófica occidental (desde Parménides hasta Heidegger) ha sido un pensamiento de la "Totalidad", una egología donde el "Mismo" fagocita o subordina al "Otro", reduciéndolo a un objeto cognoscible o dominable.
- **La Primacía de la Ética sobre la Ontología**: La filosofía primera no es la ontología (el estudio del ser), sino la **Ética** (la relación viva con el Otro).
- **La Epifanía del Rostro**:
  - El Otro se me presenta no como un concepto abstracto, sino a través de su **Rostro** (*Visage*).
  - El Rostro del Otro es indefenso, vulnerable y desnudo; al mirarme, formula una exigencia ética originaria que antecede a cualquier ley escrita: *"¡No matarás!"*.
- **Responsabilidad Infinita y Asimétrica**: Yo soy responsable del Otro antes de elegirlo libremente. Es una responsabilidad asimétrica: no le exijo reciprocidad, estoy al servicio incondicional de su vulnerabilidad (el huérfano, la viuda, el extranjero).
                """.trimIndent()
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t08_s01_c01",
                    question = "En 'Dialéctica de la Ilustración' (1944), Theodor Adorno y Max Horkheimer denunciaron que la razón ilustrada emancipatória se degradó históricamente en:",
                    options = listOf(
                        "Una ontología de la contemplación pura desprovista de interés científico.",
                        "Razón instrumental, concebida como un mero cálculo técnico de medios para la dominación de la naturaleza y la explotación humana.",
                        "Un saber dogmático escolástico subordinado a las leyes eclesiásticas medievales.",
                        "Una ética del desinterés formal idéntica al imperativo moral kantiano."
                    ),
                    correctIndex = 1,
                    explanation = "La Escuela de Frankfurt demostró que la razón ilustrada perdió su horizonte ético emancipador y devino en razón instrumental de cálculo, control técnico y dominación."
                ),
                Challenge(
                    id = "filo_t08_s01_c02",
                    question = "La célebre sentencia de Theodor Adorno 'Escribir poesía después de Auschwitz es un acto de barbarie' formula en el pensamiento contemporáneo la exigencia de:",
                    options = listOf(
                        "Clausurar irreversiblemente todas las instituciones de enseñanza artística y literaria.",
                        "Subordinar la filosofía al cálculo algebraico y a las ciencias naturales experimentales.",
                        "Un nuevo imperativo ético categórico: pensar y actuar de modo tal que la catástrofe de Auschwitz jamás vuelva a repetirse.",
                        "Restaurar la metafísica clásica de la Totalidad para justificar el orden estatal."
                    ),
                    correctIndex = 2,
                    explanation = "Tras la barbarie del Holocausto, Adorno postula la urgencia de reorientar el pensamiento para evitar cualquier normalización estética o ideológica que permita la repetición del horror genocida."
                ),
                Challenge(
                    id = "filo_t08_s01_c03",
                    question = "Emmanuel Levinas critica a toda la tradición ontológica occidental (desde Parménides hasta Heidegger) al acusarla de haber constituido una 'Egología' y una filosofía de la Totalidad porque:",
                    options = listOf(
                        "Somete, asimila y subordina al 'Otro' bajo las categorías cognoscitivas del 'Mismo', anulando su alteridad irreductible.",
                        "Rechaza el empleo del método dialéctico en las ciencias humanas y jurídicas.",
                        "Sitúa la relación ética intersubjetiva como el fundamento supremo del conocimiento.",
                        "Abandona la lógica formal aristotélica en favor de relatos míticos prefilosóficos."
                    ),
                    correctIndex = 0,
                    explanation = "Levinas acusa a la ontología occidental de totalitaria porque subsume lo diferente (el Otro) en lo idéntico (el Mismo o el Ser), convirtiendo la alteridad en objeto de posesión teórica o dominio práctico."
                ),
                Challenge(
                    id = "filo_t08_s01_c04",
                    question = "A diferencia de la tradición filosófica clásica que consideraba a la metafísica como filosofía primera, Emmanuel Levinas establece que la 'Filosofía Primera' es la:",
                    options = listOf(
                        "Epistemología empírica.",
                        "Ética, entendida como la relación de responsabilidad originaria e ineludible frente al Otro.",
                        "Lógica matemática proposicional.",
                        "Axiología formal estética."
                    ),
                    correctIndex = 1,
                    explanation = "Para Levinas, la relación con el Otro antecede a cualquier comprensión teórica del ser; por consiguiente, la Ética es la Filosofía Primera que funda todo sentido humano."
                ),
                Challenge(
                    id = "filo_t08_s01_c05",
                    question = "En la fenomenología ética de Levinas, el Otro no se me manifiesta como una representación cognoscitiva abstracta, sino a través de la 'Epifanía del Rostro', el cual se caracteriza por ser:",
                    options = listOf(
                        "Una estructura matemática cognoscible mediante fórmulas deductivas.",
                        "Una máscara formal regulada por los códigos disciplinarios de la sociedad.",
                        "Vulnerable, indefenso y desnudo, emitiendo una interpelación moral primordial que ordena: '¡No matarás!'.",
                        "Una mercancía sujeta a la oferta y demanda en el mercado mercantil."
                    ),
                    correctIndex = 2,
                    explanation = "El Rostro en Levinas expresa la indefensión radical del prójimo; su sola presencia vulnerable interpela la libertad del sujeto con el mandato moral fundante de no asesinar."
                ),
                Challenge(
                    id = "filo_t08_s01_c06",
                    question = "La responsabilidad ética formulada por Emmanuel Levinas es denominada 'Asimétrica' debido a que:",
                    options = listOf(
                        "Exige un contrato legal bilateral firmado ante un tribunal estatal.",
                        "El sujeto es responsable del Otro de forma incondicional sin tener derecho a exigirle correspondencia o reciprocidad moral.",
                        "Depende exclusivamente de los lazos consanguíneos y familiares del individuo.",
                        "Se restringe únicamente a aquellos congéneres que comparten la misma nacionalidad."
                    ),
                    correctIndex = 1,
                    explanation = "La asimetría levinasiana radica en que mi deber hacia el Otro no es un canje ni una transacción: estoy al servicio de su vulnerabilidad sin esperar nada a cambio."
                ),
                Challenge(
                    id = "filo_t08_s01_c07",
                    question = "La 'Fractura del Siglo XX' que derribó la fe ilustrada en el progreso indefinido de la humanidad estuvo originada centralmente por:",
                    options = listOf(
                        "La hecatombe de dos Guerras Mundiales, los regímenes totalitarios, los campos de exterminio y la amenaza nuclear.",
                        "El descubrimiento científico de las leyes de la termodinámica clásica.",
                        "La consolidación de los tratados de libre comercio entre potencias occidentales.",
                        "La creación de academias universitarias laicas en Europa central."
                    ),
                    correctIndex = 0,
                    explanation = "La violencia atroz y masiva del siglo XX demostró empíricamente que el desarrollo técnico y científico no garantizaba la emancipación ni el progreso moral de la especie humana."
                ),
                Challenge(
                    id = "filo_t08_s01_c08",
                    question = "En la obra de Levinas, figuras bíblicas como 'el huérfano, la viuda y el extranjero' son convocadas como arquetipos éticos de:",
                    options = listOf(
                        "Actores económicos que demandan subsidios tributarios del Estado moderno.",
                        "Sujetos desprovistos de razón que deben someterse a la tutela del soberano.",
                        "Especialistas en la hermenéutica lingüística de los textos canónicos.",
                        "La vulnerabilidad y desamparo extremos del Otro que exigen acogida, amparo y responsabilidad infinita."
                    ),
                    correctIndex = 3,
                    explanation = "El huérfano, la viuda y el extranjero encarnan al desposeído sin poder ni defensa jurídica, cuya vulnerabilidad pura interpela de manera inexcusable la conciencia ética del hombre."
                ),
                Challenge(
                    id = "filo_t08_s01_c09",
                    question = "La Escuela de Frankfurt opone la 'razón crítica' a la 'razón instrumental' enfatizando que la razón crítica se aboca a:",
                    options = listOf(
                        "Perfeccionar las máquinas y el rendimiento contable de las empresas.",
                        "Cuestionar las formas de dominación social, examinar los fines humanos y preservar la dignidad ética del individuo.",
                        "Aceptar pasivamente las jerarquías institucionales de la administración burocrática.",
                        "Reducir todos los dilemas éticos a estadísticas probabilísticas de mercado."
                    ),
                    correctIndex = 1,
                    explanation = "Mientras la razón instrumental calcula la eficiencia de los medios sin cuestionar los fines, la teoría crítica somete a examen las estructuras opresivas y defiende la autonomía humana."
                ),
                Challenge(
                    id = "filo_t08_s01_c10",
                    question = "La pretensión moderna de considerar al sujeto como un ente plenamente autónomo y transparente es desmentida por la filosofía contemporánea al comprobarse que:",
                    options = listOf(
                        "El entendimiento humano carece por completo de facultades cognitivas o memoria.",
                        "El sujeto está atravesado por condicionamientos inconscientes, estructuras de poder y determinaciones sociohistóricas.",
                        "Las leyes de la lógica formal son meras invenciones carentes de utilidad práctica.",
                        "La moral es un atributo biológico exclusivo de los organismos unicelulares."
                    ),
                    correctIndex = 1,
                    explanation = "La crisis de la subjetividad moderna despojó al 'yo' de su trono absoluto, evidenciando que el sujeto está mediado por fuerzas inconscientes, discursivas y materiales que no domina plenamente."
                )
            )
        ),
        LessonNode(
            id = "filo_t08_s02",
            subjectId = "filosofia",
            semana = 8,
            subtema = "8.2",
            title = "D. La Condición Posmoderna: Jean-François Lyotard",
            theory = LessonTheory(
                content = """
### C. Michel Foucault: Saber, Poder y Biopolítica

1. **La Microfísica del Poder**:
   - El poder no es una sustancia que posee un rey o una clase social en la cima del Estado, sino una **red difusa y omnipresente de relaciones de fuerza** que atraviesa toda la sociedad (la familia, la escuela, el cuartel, la fábrica, el hospital).
   - *"Donde hay poder, hay resistencia"*. Saber y poder son indisociables: cada régimen de verdad produce sus propios mecanismos de dominación.

2. **La Sociedad Disciplinaria y el Panóptico** (*Vigilar y castigar*, 1975):
   - Metáfora del **Panóptico** (diseñado por Jeremy Bentham): Arquitectura carcelaria con una torre central donde un solo guardia puede observar a todos los presos sin que estos sepan cuándo son vigilados.
   - El individuo interioriza la mirada vigilante, convirtiéndose en el principio de su propio sometimiento (cuerpos dóciles y útiles).

3. **La Biopolítica**:
   - En la época clásica, el soberano tenía el derecho de *"hacer morir y dejar vivir"*.
   - En la modernidad capitalista, el poder adopta la forma de **Biopolítica**: técnicas de gestión, control demográfico, sanitario y reproductivo orientadas a *"hacer vivir y dejar morir"* (gestión estadística de la vida de las poblaciones).

### D. La Condición Posmoderna: Jean-François Lyotard

- Obra clave: *La condición posmoderna* (1979).
- **Definición de Posmodernidad**: *"Incredulidad respecto a los metarrelatos"* (o grandes narrativas legitimadoras).
- **Los Metarrelatos en Quiebra**:
  1. El relato iluminista de la emancipación universal por el saber científico.
  2. El relato hegeliano de la realización progresiva del Espíritu de la Libertad.
  3. El relato marxista de la redención comunista del proletariado tras la revolución mundial.
- **Consecuencia**: Vivimos en una fragmentación de pequeños relatos locales y **juegos del lenguaje** (Wittgenstein), sin pretensiones de verdades absolutas o universales. La legitimidad del saber se rige ahora por el criterio pragmático de la **performatividad** (eficiencia técnica y rentabilidad).

### E. Zygmunt Bauman y la Modernidad Líquida

- Diagnostica el paso de una **Modernidad Sólida** (instituciones estables, empleos de por vida, proyectos colectivos de largo plazo, matrimonios indisolubles) a una **Modernidad Líquida**:
  - Los lazos humanos, las lealtades y las identidades se han vuelto fluidos, transitorios, volátiles y fácilmente descartables.
  - El ciudadano comprometido ha sido sustituido por el **consumidor compulsivo**.
  - Obras de diagnóstico: *Amor líquido* (la fragilidad de los afectos en la era del clic), *Miedo líquido* y *Vidas desperdiciadas*.

### F. Byung-Chul Han y la Crítica a la Sociedad Hiperconectada

- **La Sociedad del Cansancio** (2010):
  - Tránsito de la sociedad disciplinaria de Foucault (sociedad del "deber" y la prohibición: "no puedes") a la sociedad del rendimiento (sociedad del "poder": *"Yes, we can"*).
  - El sujeto se cree libre, pero vive inmerso en una **autoexplotación voluntaria**: es a la vez amo y esclavo, verdugo y víctima.
  - Consecuencia psíquica: epidemia de depresión, síndrome de desgaste ocupacional (*burnout*) y trastorno por déficit de atención.
- **La Sociedad de la Transparencia**:
  - Crítica a la hipervisibilidad digital donde el individuo expone voluntariamente su intimidad en las redes sociales, transformándose en mercancía y objeto de autoexhibición porosa sin secreto ni misterio.
                """.trimIndent()
            ),
            challenges = listOf(
                Challenge(
                    id = "filo_t08_s02_c01",
                    question = "Michel Foucault formula la tesis de la 'Microfísica del Poder' para argumentar que el poder no se localiza exclusivamente en el gobierno central del Estado, sino que opera como:",
                    options = listOf(
                        "Una red capilar, difusa y omnipresente de relaciones de fuerza que atraviesa las instituciones cotidianas como escuelas, fábricas, hospitales y familias.",
                        "Un contrato social voluntario acordado pacíficamente en una asamblea de ciudadanos libres.",
                        "Una ilusión subjetiva provocada por el temor a las sanciones sobrenaturales de la religión.",
                        "Una propiedad química intrínseca ligada a las hormonas biológicas de los individuos dominantes."
                    ),
                    correctIndex = 0,
                    explanation = "Foucault demuestra que el poder circula capilarmente en la vida social cotidiana, moldeando conductas y saberes en múltiples instituciones disciplinarias."
                ),
                Challenge(
                    id = "filo_t08_s02_c02",
                    question = "En el análisis foucaultiano de 'Vigilar y castigar', el dispositivo arquitectónico del 'Panóptico' simboliza de modo ejemplar cómo la vigilancia moderna logra:",
                    options = listOf(
                        "Fomentar la recreación comunitaria de los reclusos mediante asambleas abiertas.",
                        "Que los vigilados interioricen la mirada del observador y se conviertan en principio de su propio sometimiento, produciendo 'cuerpos dóciles'.",
                        "Abolir de raíz todas las penas corporales en beneficio de la libertad individual irrestricta.",
                        "Establecer la igualdad económica mediante la distribución colectiva de bienes fabriles."
                    ),
                    correctIndex = 1,
                    explanation = "El panóptico automatiza el poder: al saberse potencialmente observado sin confirmarlo visualmente, el individuo interioriza el control y adopta una disciplina dócil."
                ),
                Challenge(
                    id = "filo_t08_s02_c03",
                    question = "La mutación histórica hacia la 'Biopolítica' descrita por Foucault se distingue de la soberanía clásica en que el poder soberano tradicional operaba sobre el 'hacer morir', mientras que el biopoder opera:",
                    options = listOf(
                        "Obligando a todos los ciudadanos a redactar tratados de metafísica.",
                        "Suprimiendo las fronteras jurídicas de todos los continentes del mundo.",
                        "Administrando, gestionando y regulando estadísticamente la vida, la salud y la reproducción de la población bajo la lógica de 'hacer vivir y dejar morir'.",
                        "Restringiendo la natalidad exclusivamente a los estratos de la aristocracia militar."
                    ),
                    correctIndex = 2,
                    explanation = "La biopolítica administra la vida de la especie: natalidad, morbilidad, longevidad y salubridad pública orientadas a maximizar la utilidad poblacional."
                ),
                Challenge(
                    id = "filo_t08_s02_c04",
                    question = "En 'La condición posmoderna' (1979), Jean-François Lyotard define la posmodernidad de manera canónica como:",
                    options = listOf(
                        "La subordinación obligatoria de las artes a las doctrinas de la escolástica colonial.",
                        "El triunfo definitivo de las narrativas universalistas de la dialéctica hegeliana.",
                        "La incredulidad radical respecto a los grandes metarrelatos legitimadores de la emancipación universal.",
                        "El retorno a los métodos empíricos de la ciencia newtoniana pura."
                    ),
                    correctIndex = 2,
                    explanation = "Lyotard formula que el signo del tiempo posmoderno es la crisis de confianza en las grandes narrativas universales (Ilustración, Hegel, comunismo) que pretendían explicar y emancipar la historia."
                ),
                Challenge(
                    id = "filo_t08_s02_c05",
                    question = "Tras la caída de los metarrelatos emancipatorios, Lyotard advierte que la legitimación del conocimiento contemporáneo se rige por el criterio de la 'performatividad', lo que significa que el saber se evalúa por:",
                    options = listOf(
                        "Su verdad moral intrínseca y su armonía espiritual con la naturaleza divina.",
                        "Su eficiencia técnica operativa, optimización funcional de insumos y rentabilidad mercantil.",
                        "Su capacidad de suscitar la catarsis dramática en el teatro popular.",
                        "Su correspondencia exacta con las revelaciones místicas de la antigüedad."
                    ),
                    correctIndex = 1,
                    explanation = "La performatividad mercantiliza el saber: la investigación ya no se evalúa por si es 'verdadera o justa', sino por si es eficiente, productiva y rentable para el sistema."
                ),
                Challenge(
                    id = "filo_t08_s02_c06",
                    question = "Zygmunt Bauman contrapone la 'Modernidad Sólida' a la 'Modernidad Líquida' señalando que en esta última los lazos humanos y las instituciones sociales se tornan:",
                    options = listOf(
                        "Inmutables, sagrados y respaldados por juramentos colectivos perpetuos.",
                        "Regulados de forma férrea por contratos gremiales vitalicios e indisolubles.",
                        "Fluidos, precarios, volátiles y fácilmente descartables al ritmo de la satisfacción inmediata.",
                        "Idénticos a las jerarquías estamentales fijas de la sociedad feudal europea."
                    ),
                    correctIndex = 2,
                    explanation = "La modernidad líquida desintegra la solidez duradera de los vínculos: amistades, matrimonios, lealtades laborales y proyectos compartidos se vuelven efímeros y reemplazables."
                ),
                Challenge(
                    id = "filo_t08_s02_c07",
                    question = "En la sociedad líquida analizada por Zygmunt Bauman, la figura cívica del 'ciudadano comprometido' con el bien público ha sido desplazada principalmente por:",
                    options = listOf(
                        "El consumidor compulsivo guiado por el deseo de gratificación instantánea y obsolescencia programada.",
                        "El sabio contemplativo retirado en el ascetismo filosófico.",
                        "El soldado obediente a los cánones monárquicos medievales.",
                        "El campesino comunal dedicado a la agricultura de subsistencia solidaria."
                    ),
                    correctIndex = 0,
                    explanation = "Bauman explica que en la sociedad de consumo los individuos se relacionan con el entorno y con los demás como consumidores que compran y desechan bienes y afectos."
                ),
                Challenge(
                    id = "filo_t08_s02_c08",
                    question = "En 'La sociedad del cansancio' (2010), Byung-Chul Han sostiene que el paradigma de dominación contemporáneo ya no se basa en el 'no puedes' de la prohibición, sino en el 'tú puedes', dando origen a:",
                    options = listOf(
                        "La liberación absoluta de toda fatiga física y mental en el trabajo.",
                        "El retorno masivo a las doctrinas teológicas del castigo inquisitorial.",
                        "La autoexplotación voluntaria donde el individuo es amo y esclavo de su propio rendimiento personal.",
                        "La disolución de los mercados comerciales en favor del comunismo primitivo."
                    ),
                    correctIndex = 2,
                    explanation = "Byung-Chul Han sostiene que el sujeto de rendimiento no es oprimido externamente por un amo ajeno, sino que se autoexplota en nombre de su supuesta libertad ('Yes we can')."
                ),
                Challenge(
                    id = "filo_t08_s02_c09",
                    question = "Como consecuencia psíquica primordial de la autoexplotación en la sociedad del rendimiento, Byung-Chul Han identifica la proliferación de patologías como:",
                    options = listOf(
                        "El síndrome del desgaste ocupacional (burnout), la depresión y el colapso emocional por agotamiento.",
                        "La amnesia total producida por la ingestión forzada de fármacos sintéticos.",
                        "La alucinación colectiva provocada por el contacto con ondas de radio terrestres.",
                        "La catalepsia fisiológica originada por la abstinencia de alimentos azucarados."
                    ),
                    correctIndex = 0,
                    explanation = "Han diagnostica que la exigencia autoimpuesta de rendimiento infinito colapsa las defensas anímicas del ser humano, desembocando en agotamiento psíquico (burnout) y depresión."
                ),
                Challenge(
                    id = "filo_t08_s02_c10",
                    question = "En 'La sociedad de la transparencia', Byung-Chul Han denuncia que la hipervisibilidad digital y la exposición continua en redes sociales generan:",
                    options = listOf(
                        "El fortalecimiento de la privacidad y el repliegue reflexivo de la conciencia moral.",
                        "La conversión de la propia intimidad en mercancía y la pérdida de la distancia, del misterio y de la libertad auténtica.",
                        "La restauración de las ceremonias secretas de iniciación de los cultos órficos.",
                        "La prohibición de circular textos de filosofía en plataformas electrónicas."
                    ),
                    correctIndex = 1,
                    explanation = "La transparencia digital somete la vida íntima a la exhibición y al control comercial, convirtiendo a las personas en datos y objetos consumibles en un régimen poroso sin intimidad."
                )
            )
        )
    )
}
`;

fs.writeFileSync('SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt', content, 'utf8');
console.log("Successfully fixed FilosofiaSemana08.kt!");
