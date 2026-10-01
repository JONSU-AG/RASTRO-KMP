const fs = require('fs');
const path = require('path');

const theoryS01 = `### 3.1. Concepto y Enfoque de Riesgo Psicosocial
* **Factor de Riesgo:** Toda variable, circunstancia biológica, psicológica, conductual o ambiental cuya presencia incrementa estadísticamente la probabilidad de que un individuo o grupo sufra un daño físico o psicológico, desarrolle un trastorno mental o incurra en conductas autodestructivas o transgresoras de la ley.
* **Vulnerabilidad vs. Riesgo:** La vulnerabilidad es la susceptibilidad intrínseca del sujeto (baja autoestima, impulsividad, predisposición genética); el factor de riesgo es la condición precipitante del entorno (disponibilidad de drogas, violencia doméstica, exclusión social).

### 3.2. Manifestaciones y Tipología de la Violencia
Uso intencional de la fuerza o el poder físico, de hecho o como amenaza, contra uno mismo, otra persona o un grupo, que cause o tenga muchas probabilidades de causar lesiones, muerte, daño psicológico, trastornos del desarrollo o privaciones (OMS).
1. **Tipologías de la Violencia:**
   * **Física:** Toda acción deliberada que causa daño, dolor o lesión corporal (golpes, empujones, quemaduras).
   * **Psicológica o Emocional:** Conductas orientadas a denigrar, humillar, intimidar, amenazar, aislar o controlar a una persona mediante insultos, descalificaciones, silencios punitivos o celopatía.
   * **Sexual:** Todo acto o tentativa sexual no consentida, tocamientos indebidos, acoso, explotación o imposición mediante coacción, amenaza o abuso de poder.
   * **Económica o Patrimonial:** Control abusivo o privación intencional de recursos económicos, retención de documentos de identidad, bienes o manutención básica para someter a la víctima.

2. **Ciclo de la Violencia Intrafamiliar (Leonor Walker):**
   Explica por qué las víctimas permanecen atrapadas en relaciones de pareja abusivas:
   * **Fase 1: Acumulación de Tensión:** Crecimiento gradual de hostilidad, irritabilidad, reproches y microagresiones verbales. La víctima intenta calmar al agresor y se culpa a sí misma.
   * **Fase 2: Explosión o Descarga Agresiva:** Pérdida absoluta de control del agresor; ocurre el episodio de violencia física, verbal o sexual grave.
   * **Fase 3: Luna de Miel o Reconciliación:** El agresor pide perdón con aparente arrepentimiento sincero, jura que nunca volverá a ocurrir, hace regalos y muestra gran afecto, reforzando la dependencia emocional de la víctima. El ciclo se repite con intervalos cada vez más cortos y mayor letalidad.

3. **Acoso Escolar (*Bullying*) y Acoso Cibernético (*Cyberbullying*):**
   * Conducta de persecución física o psicológica deliberada y repetida en el tiempo que un estudiante o grupo ejerce contra otro más débil, mediada por un **desequilibrio de poder**.
   * **Triángulo del Bullying:**
     * *Agresor:* Personalidad dominante, baja empatía, necesidad de control, agresividad reactiva.
     * *Víctima:* Vulnerable, tímida, con baja autoestima o con alguna característica diferencial visible.
     * *Espectadores (*Bystanders*):* Quienes presencian el acoso; su silencio, risa o indiferencia legitima y perpetúa la agresión.
   * *Cyberbullying:* Hostigamiento sistemático mediante redes sociales, mensajería instantánea o videojuegos en línea; se caracteriza por su alcance masivo, permanencia digital (huella digital) y la sensación de impunidad por el anonimato virtual.`;

const theoryS02 = `### 4.1. Conductas Delictivas y Factores Asociados
* **Conducta Antisocial y Delincuencia Juvenil:** Trasgresión deliberada de las normas sociales y las leyes penales vigentes (robos, agresiones armadas, extorsión, homicidios).
* **Determinantes Psicosociales:**
  * Deserción escolar temprana y analfabetismo funcional.
  * Crianza bajo estilos negligentes o violencia parental severa.
  * Ausencia de un proyecto de vida estructurado y vacío existencial.
  * **Presión de Pares en Pandillas:** La pandilla juvenil opera como una "familia sustituta" distorsionada que brinda falso sentido de pertenencia, respeto y protección a cambio de la comisión de delitos.

### 4.2. Sustancias Psicoactivas (Drogas) y Neurobiología de la Adicción
Toda sustancia química de origen natural o sintético que, al ingresar al organismo por cualquier vía, altera el funcionamiento del sistema nervioso central (SNC), modificando la percepción, el estado de ánimo, la cognición y la conducta.

1. **Clasificación Farmacológica según sus Efectos en el SNC:**
* **Depresoras:** Disminuyen, atenúan o frenan la actividad del encéfalo; inducen relajación, sedación y torpeza motora. Ejemplos: **Alcohol etílico**, benzodiacepinas (ansiolíticos), barbitúricos, opiáceos (morfina, heroína).
* **Estimulantes:** Aceleran y sobreexcitan la actividad neuronal; aumentan el estado de vigilia, la energía y la frecuencia cardíaca. Ejemplos: **Cocaína**, pasta básica de cocaína (PBC), anfetaminas, metanfetamina, **nicotina**, cafeína.
* **Alucinógenas (Perturbadoras):** Distorsionan profundamente la percepción sensorial, el pensamiento y el sentido del tiempo y espacio; causan alucinaciones. Ejemplos: **LSD**, psilocibina (hongos), mezcalina (San Pedro/peyote), **marihuana (THC a dosis altas)**, éxtasis (MDMA).

2. **Fases del Proceso Adictivo:**
   Fase Experimental -> Uso Social / Recreativo -> Uso Habitual / Abuso -> Dependencia (Adicción)

3. **Conceptos Clave de la Farmacodependencia:**
* **Tolerancia Neuroquímica:** Necesidad adaptativa del cerebro de consumir dosis progresivamente mayores de la sustancia para experimentar el mismo efecto psicoactivo inicial (debido a la desensibilización o reducción de receptores en el circuito de recompensa dopaminérgico).
* **Dependencia Física:** Adaptación fisiológica del organismo a la presencia continua de la droga, de tal modo que su supresión súbita desencadena graves alteraciones corporales.
* **Dependencia Psicológica:** Compulsión, anhelo obsesivo (*craving*) y necesidad subjetiva irrefrenable de consumir la droga para experimentar placer o aliviar el malestar emocional.
* **Síndrome de Abstinencia:** Conjunto agudo y doloroso de síntomas físicos y psicológicos angustiantes (temblores, sudoración, vómitos, convulsiones, taquicardia, pánico) que se desata cuando un individuo dependiente interrumpe bruscamente el consumo.`;

const challengesS01 = [
  {
    id: "psi_t13_s01_c01",
    question: "En la psicología de la salud y prevención comunitaria, un 'Factor de Riesgo Psicosocial' se define formalmente como:",
    options: [
      "Una manifestación biológica inmutable que predetermina genéticamente el destino social de un sujeto.",
      "Toda variable personal o ambiental cuya presencia incrementa estadísticamente la probabilidad de daño físico o psicológico.",
      "Una técnica psicoterapéutica empleada exclusivamente en el tratamiento hospitalario de urgencia.",
      "El conjunto de normas jurídicas que tipifican los delitos cometidos por menores infractores."
    ],
    correctIndex: 1,
    explanation: "Un factor de riesgo es cualquier condición o variable biopsicosocial que eleva la probabilidad estadística de que una persona o colectivo sufra un daño, trastorno o conducta desadaptativa."
  },
  {
    id: "psi_t13_s01_c02",
    question: "La distinción conceptual entre 'Vulnerabilidad' y 'Factor de Riesgo' radica en que:",
    options: [
      "La vulnerabilidad es la susceptibilidad intrínseca del sujeto, mientras que el factor de riesgo es la condición precipitante del entorno.",
      "La vulnerabilidad atañe únicamente a factores económicos externos y el riesgo a rasgos somáticos hereditarios.",
      "Ambos términos constituyen sinónimos exactos e intercambiables en todos los modelos epidemiológicos.",
      "El factor de riesgo depende de la voluntad consciente y la vulnerabilidad de leyes orgánicas estatales."
    ],
    correctIndex: 0,
    explanation: "La vulnerabilidad refiere a predisposiciones o fragilidades individuales internas (impulsividad, baja autoestima), mientras los factores de riesgo son agentes o contingencias del entorno que facilitan el daño."
  },
  {
    id: "psi_t13_s01_c03",
    question: "Cuando un agresor retiene los documentos de identidad, despoja de sus ingresos laborales o impide deliberadamente el acceso al sustento material de su pareja, incurre en violencia:",
    options: [
      "Psicológica verbal.",
      "Económica o patrimonial.",
      "Física contingente.",
      "Institucional procesal."
    ],
    correctIndex: 1,
    explanation: "La violencia económica o patrimonial implica el menoscabo, control abusivo o privación intencionada de recursos económicos, bienes o documentos personales para someter a la víctima."
  },
  {
    id: "psi_t13_s01_c04",
    question: "En el 'Ciclo de la Violencia' intrafamiliar formulado por Leonor Walker, la fase en que el agresor manifiesta arrepentimiento aparente, entrega obsequios y promete solemnemente no volver a agredir se denomina:",
    options: [
      "Fase de acumulación de tensión.",
      "Fase de explosión agresiva.",
      "Fase de catarsis reactiva.",
      "Fase de luna de miel o reconciliación."
    ],
    correctIndex: 3,
    explanation: "La fase de 'luna de miel' o reconciliación genera una ilusión de cambio en la víctima, fortaleciendo la dependencia afectiva antes de reiniciar la acumulación de tensiones."
  },
  {
    id: "psi_t13_s01_c05",
    question: "Durante la 'Fase de Acumulación de Tensión' del ciclo de Leonor Walker, la dinámica cotidiana de la pareja se caracteriza por:",
    options: [
      "Incremento progresivo de hostilidad, descalificaciones, reproches y actitud apaciguadora y culpable en la víctima.",
      "Estallido súbito de golpes y lesiones corporales de máxima gravedad hospitalaria.",
      "Acuerdos democráticos pacíficos mediante mediación judicial profesional extrajudicial.",
      "Aislamiento absoluto en que ambas partes conviven de manera armoniosa y desinteresada."
    ],
    correctIndex: 0,
    explanation: "En la acumulación de tensión aumentan las microagresiones y fricciones cotidianas; la víctima suele intentar apaciguar al cónyuge asumiendo erróneamente la culpa del malestar."
  },
  {
    id: "psi_t13_s01_c06",
    question: "Para que un acto de agresión entre estudiantes sea tipificado rigurosamente como Acoso Escolar (*Bullying*), deben concurrir de forma obligatoria tres criterios:",
    options: [
      "Violencia accidental, igualdad de fuerzas físicas e intervención docente inmediata.",
      "Intencionalidad de dañar, reiteración a lo largo del tiempo y desequilibrio de poder entre agresor y víctima.",
      "Uso de armas punzocortantes, denuncia penal formal y deserción escolar consumada.",
      "Carácter recreativo, aprobación unánime de los padres y ambiente lúdico supervisado."
    ],
    correctIndex: 1,
    explanation: "El bullying se define por el daño deliberado, la persistencia temporal sistemática y una marcada asimetría de poder que impide a la víctima defenderse por sí misma."
  },
  {
    id: "psi_t13_s01_c07",
    question: "Dentro de la tríada o triángulo del bullying, el papel que cumplen los 'Espectadores' (*bystanders*) resulta decisivo debido a que:",
    options: [
      "Son los encargados de redactar el acta de conciliación y aplicar las sanciones punitivas escolares.",
      "Carecen de toda repercusión emocional o moral frente al sufrimiento presenciado en las aulas.",
      "Su silencio, risas o indiferencia pasiva otorgan legitimidad social y refuerzo continuo al comportamiento del agresor.",
      "Asumen la tutela económica y pedagógica obligatoria de la víctima ante la dirección escolar."
    ],
    correctIndex: 2,
    explanation: "Los espectadores sostienen la dinámica del acoso: al callar, reír o no intervenir, validan implícitamente el poder del hostigador y perpetúan el aislamiento de la víctima."
  },
  {
    id: "psi_t13_s01_c08",
    question: "Una característica distintiva primordial del *Cyberbullying* o acoso cibernético en comparación con el bullying presencial es:",
    options: [
      "La restricción estricta de la agresión al horario diurno dentro de los recintos escolares.",
      "El alcance potencialmente masivo, la permanencia de la huella digital y la sensación de impunidad bajo el anonimato virtual.",
      "La inmediata reparación física espontánea del daño psicológico producido a la víctima.",
      "La imposibilidad técnica de emplear textos, fotografías o videos grabados por dispositivos móviles."
    ],
    correctIndex: 1,
    explanation: "El ciberacoso trasciende los muros escolares (24/7), viraliza contenidos difamatorios que perduran en la red y cobija al agresor tras el anonimato virtual."
  },
  {
    id: "psi_t13_s01_c09",
    question: "¿Cuál de las siguientes conductas parentales o familiares constituye un factor de riesgo psicosocial primario para el desarrollo de conductas violentas en los hijos?",
    options: [
      "El establecimiento de límites claros, afectuosos y coherentes en la convivencia doméstica.",
      "La comunicación empática y la resolución reflexiva y dialógica de los desacuerdos hogareños.",
      "El fomento sistemático del pensamiento crítico, la autonomía y la tolerancia hacia las diferencias.",
      "La exposición habitual a castigos físicos severos, maltrato verbal continuo o estilos de crianza negligentes."
    ],
    correctIndex: 3,
    explanation: "Crecer en hogares violentos o con negligencia parental severa socializa al menor en patrones de coerción y hostilidad, multiplicando el riesgo de replicar la violencia en sus relaciones sociales."
  },
  {
    id: "psi_t13_s01_c10",
    question: "En las relaciones interpersonales, la conducta caracterizada por denigrar, aislar de amistades y familiares, someter a humillaciones sistemáticas y celotipia obsesiva constituye violencia:",
    options: [
      "Psicológica o emocional.",
      "Biológica adaptativa.",
      "Económica indirecta.",
      "Accidental no dolosa."
    ],
    correctIndex: 0,
    explanation: "La violencia psicológica busca anular la autoestima, autodeterminación y seguridad emocional del individuo mediante manipulación, control celoso y descalificación continua."
  }
];

const challengesS02 = [
  {
    id: "psi_t13_s02_c01",
    question: "Una sustancia química natural o sintética se define formalmente como 'Psicoactiva' cuando al ingresar al organismo:",
    options: [
      "Incrementa de forma permanente la capacidad de regeneración celular de los músculos esqueléticos.",
      "Altera el funcionamiento del Sistema Nervioso Central modificando la percepción, el ánimo, la cognición y la conducta.",
      "Cura definitivamente cualquier predisposición genética a enfermedades cardiovasculares crónicas.",
      "Inmuniza de por vida el sistema linfático contra bacterias patógenas de transmisión respiratoria."
    ],
    correctIndex: 1,
    explanation: "Las sustancias psicoactivas o drogas son aquellas que atraviesan la barrera hematoencefálica y perturban las funciones neurocognitivas y afectivas del Sistema Nervioso Central."
  },
  {
    id: "psi_t13_s02_c02",
    question: "Las drogas que disminuyen la actividad neurofisiológica del encéfalo, induciendo sedación, relajación muscular y lentitud de reflejos, se clasifican como:",
    options: [
      "Estimulantes psicomotores.",
      "Alucinógenas o perturbadoras.",
      "Depresoras del SNC.",
      "Anestésicas locales puras."
    ],
    correctIndex: 2,
    explanation: "Las sustancias depresoras atenúan la actividad del SNC, reduciendo el ritmo cardíaco, la coordinación motriz y la vigilia (ej. alcohol etílico, benzodiacepinas, opiáceos)."
  },
  {
    id: "psi_t13_s02_c03",
    question: "Científicamente, el alcohol etílico es catalogado farmacológicamente como una sustancia:",
    options: [
      "Estimulante primaria del sistema dopaminérgico motor estriatal.",
      "Depresora del Sistema Nervioso Central, cuya aparente euforia inicial deriva de la inhibición de la corteza prefrontal.",
      "Alucinógena de alta potencia que suprime el pensamiento abstracto y visual.",
      "Antipsicótica de acción prolongada sin potencial adictivo alguno."
    ],
    correctIndex: 1,
    explanation: "El alcohol es un depresor: desinhibe al principio porque deprime las áreas corticales encargadas del autocontrol y la censura moral, deprimiendo luego centros motores y vitales."
  },
  {
    id: "psi_t13_s02_c04",
    question: "Sustancias como la cocaína, las anfetaminas y la nicotina pertenecen a la categoría de:",
    options: [
      "Depresoras de acción lenta.",
      "Estimulantes del SNC.",
      "Sedantes hipnóticos no narcóticos.",
      "Alucinógenos disociativos mayores."
    ],
    correctIndex: 1,
    explanation: "Los estimulantes aceleran el funcionamiento neuronal, provocando hiperalerta, taquicardia, dilatación pupilar y supresión del cansancio y del apetito."
  },
  {
    id: "psi_t13_s02_c05",
    question: "En el estudio de las drogodependencias, el fenómeno neuroadaptativo de la 'Tolerancia' se constata cuando:",
    options: [
      "El consumidor experimenta asco inmediato ante cualquier contacto visual con la sustancia psicoactiva.",
      "El individuo necesita dosis progresivamente mayores de la droga para conseguir los efectos psicoactivos iniciales.",
      "La persona logra suspender voluntariamente el consumo sin experimentar ningún tipo de malestar somático.",
      "El cuerpo metaboliza la droga destruyéndola al instante sin permitir su absorción plasmática."
    ],
    correctIndex: 1,
    explanation: "La tolerancia es la adaptación fisiológica por la cual el organismo desensibiliza receptores, requiriendo cantidades crecientes para alcanzar la misma intensidad de efecto."
  },
  {
    id: "psi_t13_s02_c06",
    question: "El 'Síndrome de Abstinencia' en un individuo farmacodependiente consiste en:",
    options: [
      "El estado de bienestar y relajación absoluta alcanzado al consumir una dosis letal de sedantes.",
      "La habilidad adquirida para rechazar ofertas sociales de consumo de alcohol en reuniones festivas.",
      "El conjunto agudo de manifestaciones fisiológicas y psicológicas angustiantes desatadas al interrumpir o reducir el consumo brusco de la droga.",
      "La creencia delirante de que todas las leyes prohibitivas del país han quedado derogadas."
    ],
    correctIndex: 2,
    explanation: "La abstinencia manifiesta el sufrimiento del organismo que se acostumbró a la presencia de la sustancia (dependencia física), provocando taquicardia, temblores, ansiedad o convulsiones."
  },
  {
    id: "psi_t13_s02_c07",
    question: "¿Cuál es la secuencia correlativa de las fases del proceso adictivo?",
    options: [
      "Dependencia -> Abstinencia -> Fase Experimental -> Uso Recreativo.",
      "Fase Experimental -> Uso Social/Recreativo -> Uso Habitual/Abuso -> Dependencia.",
      "Abuso -> Dependencia -> Tolerancia Inversa -> Fase Social.",
      "Uso Habitual -> Síndrome Agudo -> Fase Experimental -> Abstinencia."
    ],
    correctIndex: 1,
    explanation: "La adicción es un continuum que transita de la experimentación curiosa al uso social, derivando en el abuso habitual y desembocando en la dependencia psicofísica compulsiva."
  },
  {
    id: "psi_t13_s02_c08",
    question: "En la psicología de la delincuencia juvenil, la pandilla transgresora suele operar en la vida del adolescente como:",
    options: [
      "Una familia sustituta distorsionada que provee falso sentido de pertenencia, lealtad y protección a cambio de la comisión de ilícitos.",
      "Una entidad oficial tutelar que fiscaliza el rendimiento escolar y premia los méritos cívicos.",
      "Una cooperativa de ahorro comunal orientada a la capacitación técnica de jóvenes talentos.",
      "Un grupo de estudio formal que prepara a los estudiantes para los exámenes de admisión universitaria."
    ],
    correctIndex: 0,
    explanation: "Ante la fractura familiar y la exclusión, la pandilla cubre necesidades de pertenencia e identidad, exigiendo en contrapartida fidelidad ciega y conductas delictivas."
  },
  {
    id: "psi_t13_s02_c09",
    question: "La 'Dependencia Psicológica' hacia una sustancia psicoactiva se distingue de la física porque la primera se manifiesta principalmente como:",
    options: [
      "Espasmos musculares involuntarios y sudoración profusa provocados por daño periférico.",
      "Deseo compulsivo obsesivo (*craving*) y necesidad subjetiva irrefrenable de consumir para sentir bienestar o evitar el displacer.",
      "Un reflejo condicionado motor puramente espinal inmune a la voluntad de la corteza cerebral.",
      "Una inflamación hepática diagnosticable mediante análisis de sangre y ecografía abdominal."
    ],
    correctIndex: 1,
    explanation: "La dependencia psicológica reside en el anhelo psíquico obsesivo (*craving*), donde el individuo siente que no puede funcionar o estar tranquilo sin la sustancia."
  },
  {
    id: "psi_t13_s02_c10",
    question: "¿Cuál de los siguientes factores constituye un determinante psicosocial estrechamente asociado a las conductas delictivas juveniles?",
    options: [
      "La posesión de altas habilidades metacognitivas y empatía comunitaria madura.",
      "La deserción escolar temprana, el vacío en el proyecto de vida y la presión de pares en entornos de vulnerabilidad.",
      "La práctica habitual de deportes colectivos bajo el auspicio de ligas infantiles acreditadas.",
      "El aprendizaje temprano de idiomas extranjeros y la afición a la lectura de clásicos universales."
    ],
    correctIndex: 1,
    explanation: "El abandono de los estudios, la carencia de metas de futuro y la presión coercitiva del grupo de pares marginales confluyen como factores criminógenos de primer orden."
  }
];

function buildFile() {
  let out = `package psicologia\n\n`;
  out += `import com.clase.app.data.model.LessonNode\n`;
  out += `import com.clase.app.data.model.LessonTheory\n`;
  out += `import com.clase.app.data.model.Challenge\n\n`;
  out += `object PsicologiaSemana13 {\n`;
  out += `    val lessons: List<LessonNode> = listOf(\n`;

  const lessons = [
    {
      id: "psi_t13_s01",
      title: "3.1. Enfoque de Riesgo, Tipologías de Violencia, Ciclo de Walker y Acoso Escolar",
      theory: {
        title: "Enfoque de Riesgo, Tipologías de Violencia, Ciclo de Walker y Acoso Escolar",
        content: theoryS01
      },
      challenges: challengesS01
    },
    {
      id: "psi_t13_s02",
      title: "4.1. Conductas Delictivas Juveniles, Sustancias Psicoactivas y Farmacodependencia",
      theory: {
        title: "Conductas Delictivas Juveniles, Sustancias Psicoactivas y Farmacodependencia",
        content: theoryS02
      },
      challenges: challengesS02
    }
  ];

  out += lessons.map(l => {
    let lStr = `        LessonNode(\n`;
    lStr += `            id = ${JSON.stringify(l.id)},\n`;
    lStr += `            title = ${JSON.stringify(l.title)},\n`;
    lStr += `            theory = LessonTheory(\n`;
    lStr += `                title = ${JSON.stringify(l.theory.title)},\n`;
    lStr += `                content = ${JSON.stringify(l.theory.content)}\n`;
    lStr += `            ),\n`;
    lStr += `            challenges = listOf(\n`;

    const chStr = l.challenges.map(c => {
      let cStr = `                Challenge(\n`;
      cStr += `                    id = ${JSON.stringify(c.id)},\n`;
      cStr += `                    question = ${JSON.stringify(c.question)},\n`;
      cStr += `                    options = listOf(\n`;
      cStr += c.options.map(opt => `                        ${JSON.stringify(opt)}`).join(',\n') + '\n';
      cStr += `                    ),\n`;
      cStr += `                    correctIndex = ${c.correctIndex},\n`;
      cStr += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      cStr += `                )`;
      return cStr;
    }).join(',\n');

    lStr += chStr + '\n';
    lStr += `            )\n`;
    lStr += `        )`;
    return lStr;
  }).join(',\n');

  out += `\n    )\n`;
  out += `}\n`;

  fs.writeFileSync('SALIDA_KOTLIN/psicologia/PsicologiaSemana13.kt', out, 'utf8');
  console.log("PsicologiaSemana13.kt written successfully!");
}

buildFile();
