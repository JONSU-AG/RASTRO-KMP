const fs = require('fs');
const path = require('path');

const replacements = [
  // FILOSOFIA
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt",
    target: `"Construir un telescopio para cartografiar la superficie de la luna."`,
    replacement: `"Formular por primera vez la teoría silogística de la lógica formal."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt",
    target: `"Fundar la primera academia universitaria con títulos de doctorado en leyes."`,
    replacement: `"Defender el relativismo gnoseológico del hombre como medida de todas las cosas."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt",
    target: `"Escribir una enciclopedia exhaustiva sobre los ritos funerarios griegos."`,
    replacement: `"Sistematizar la física atómica basada en el vacío y las partículas indivisibles."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana02.kt",
    target: `"La Epistemología rechaza la ciencia mientras que la Gnoseología acepta únicamente la física cuántica."`,
    replacement: `"La Gnoseología se limita a la lingüística empírica mientras que la Epistemología estudia la teología revelada."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana03.kt",
    target: `"La energía cuántica y el éter universal."`,
    replacement: `"El ser en acto y el ser en potencia de la metafísica."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana06.kt",
    target: `"El conocimiento sensible es enteramente innecesario para la física cuántica."`,
    replacement: `"La razón pura humana puede conocer las cosas en sí mismas (el noúmeno) sin auxilio de la experiencia sensible."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Un rayo electromagnético disparado desde satélites orbitales."`,
    replacement: `"Una propiedad jurídica concentrada exclusivamente en la figura del soberano estatal."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Una fuerza benevolente que busca únicamente hacer felices a los gobernados."`,
    replacement: `"Un consenso voluntario y universal establecido mediante un contrato social originario."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Una ilusión óptica que desaparece al cerrar los ojos."`,
    replacement: `"Un instrumento derivado mecánicamente de la propiedad privada de los medios de producción."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"El retorno a la teología inquisitorial para castigar a los infieles."`,
    replacement: `"La reafirmación de verdades absolutas e inmutables mediante el dogmatismo metafísico."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"La prohibición de estudiar matemáticas y física en las academias superiores."`,
    replacement: `"La sustitución de la filosofía por la lógica matemática formal del positivismo."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"La convicción de que los débiles biológicos deben ser eliminados de la sociedad."`,
    replacement: `"La subordinación de las decisiones éticas a la autoridad absoluta del Estado totalitario."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Un telescopio de largo alcance para contemplar las lunas de Júpiter."`,
    replacement: `"Un templo ceremonial destinado al culto religioso de la comunidad."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Un anfiteatro romano para combates deportivos entre gladiadores."`,
    replacement: `"Un mercado público diseñado para el libre intercambio mercantil de mercancías."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt",
    target: `"Un hospital moderno donde no existen médicos ni enfermeros."`,
    replacement: `"Una asamblea democrática orientada a la deliberación pública de los ciudadanos."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt",
    target: `"Son teoremas matemáticos que pueden resolverse con computadoras cuánticas."`,
    replacement: `"Son deducciones racionales a priori que expresan verdades ontológicas necesarias."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt",
    target: `"Son revelaciones teológicas de ángeles celestiales."`,
    replacement: `"Son prescripciones jurídicas respaldadas por el poder coactivo del ordenamiento positivo."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt",
    target: `"Las normas morales fueron redactadas por extraterrestres en la luna."`,
    replacement: `"Los valores son ficciones lingüísticas creadas por la costumbre de cada comunidad."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt",
    target: `"Los seres humanos del pasado no pertenecían a la especie biológica humana."`,
    replacement: `"La verdad de los juicios axiológicos depende enteramente del interés económico de la clase dominante."`
  },
  {
    file: "SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt",
    target: `"Todos los historiadores falsifican los testimonios del pasado."`,
    replacement: `"El valor es producto de las reacciones neurofisiológicas y biológicas del organismo."`
  },

  // HISTORIA PERU
  {
    file: "SALIDA_KOTLIN/historia_peru/HistoriaPeruSemana02.kt",
    target: `"Campos de aterrizaje para dioses extraterrestres."`,
    replacement: `"Caminos ceremoniales y ceques sagrados de carácter ritual vinculados al culto acuático."`
  },

  // HISTORIA UNIVERSAL
  {
    file: "SALIDA_KOTLIN/historia_universal/HistoriaUniversalSemana06.kt",
    target: `"Prohibió a los alemanes beber cerveza y cultivar trigo."`,
    replacement: `"Obligó a Alemania a integrarse formalmente en la Unión de Repúblicas Socialistas Soviéticas."`
  },
  {
    file: "SALIDA_KOTLIN/historia_universal/HistoriaUniversalSemana06.kt",
    target: `"Obligó al káiser a trasladar la capital a Moscú."`,
    replacement: `"Exigió la cesión inmediata de Berlín al Imperio austrohúngaro."`
  },
  {
    file: "SALIDA_KOTLIN/historia_universal/HistoriaUniversalSemana06.kt",
    target: `"Dividió a Alemania en cuatro zonas controladas por Turquía."`,
    replacement: `"Estableció una monarquía parlamentaria tutelada directamente por el Reino Unido."`
  },
  {
    file: "SALIDA_KOTLIN/historia_universal/HistoriaUniversalSemana06.kt",
    target: `"El auge inmediato de la producción de automóviles."`,
    replacement: `"El fortalecimiento inmediato del patrón oro en todas las economías europeas."`
  },

  // GEOGRAFIA
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana10.kt",
    target: `"Son exclusivamente minerales radiactivos de alto valor en el mercado internacional."`,
    replacement: `"Son elementos inorgánicos inmóviles cuya estructura química no puede alterarse por acción humana."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"Intensiva con satélites agrícolas autónomos."`,
    replacement: `"Altamente tecnificada con riego computarizado y destinada exclusivamente a la agroexportación."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"Totalmente hidropónica en invernaderos climatizados."`,
    replacement: `"Mecanizada mediante maquinaria pesada en latifundios empresariales de la cuenca amazónica."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"La construcción de reactores nucleares de potencia y satélites espaciales."`,
    replacement: `"La producción pesada de bienes de capital y maquinaria industrial de alta precisión."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"La robótica cibernética de alta escala."`,
    replacement: `"La industria química de base especializada en la síntesis de polímeros sintéticos."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"La fundición pesada de acero para portaaviones militares."`,
    replacement: `"La fabricación aeroespacial y de material rodante ferroviario."`
  },
  {
    file: "SALIDA_KOTLIN/geografia/GeografiaSemana12.kt",
    target: `"Automóviles eléctricos ensamblados en el país."`,
    replacement: `"Bienes manufacturados no tradicionales con alto contenido tecnológico y diseño de marca."`
  },

  // PSICOLOGIA
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt",
    target: `"Esperar cinco minutos antes de pedir comida rápida."`,
    replacement: `"Programar pausas de cinco minutos cada hora para evitar la sobrecarga cognitiva."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt",
    target: `"Repetir un mantra relajante durante cinco minutos sin abrir el libro."`,
    replacement: `"Dividir el tiempo de estudio en bloques rígidos de cinco minutos de memoria mecánica."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt",
    target: `"Estudiar solo cinco minutos por semana."`,
    replacement: `"Esperar cinco minutos después de un estímulo distractor antes de retomar la lectura."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt",
    target: `"Cálculo rápido de logaritmos neperianos"`,
    replacement: `"Capacidad de razonamiento lógico inductivo y abstracto"`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt",
    target: `"Dominio del lenguaje computacional"`,
    replacement: `"Habilidad motriz y de coordinación visoespacial"`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt",
    target: `"Control del tipo de cambio financiero"`,
    replacement: `"Velocidad perceptiva en tareas numéricas simples"`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana08.kt",
    target: `"Se manifiesta solo de vez en cuando en situaciones muy específicas (como el gusto por un helado)."`,
    replacement: `"Constituye una disposición actitudinal secundaria que se activa solo ante estímulos o contextos muy específicos (rasgo secundario)."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana08.kt",
    target: `"Se olvida fácilmente al despertar."`,
    replacement: `"Describe características generales que permiten identificar a una persona en la mayoría de situaciones cotidianas (rasgo central)."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana08.kt",
    target: `"Aparece únicamente en los sueños nocturnos."`,
    replacement: `"Representa una pulsión inconsciente reprimida ligada a la fijación psicosexual en la infancia."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt",
    target: `"Escribir sonetos renacentistas en endecasílabos."`,
    replacement: `"Analizar y descomponer problemas abstractos para evaluar hipótesis lógicas formales (inteligencia analítica)."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt",
    target: `"Aprobar exámenes de física cuántica con nota 20."`,
    replacement: `"Generar ideas novedosas y sintetizar soluciones originales frente a situaciones desconocidas (inteligencia creativa)."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt",
    target: `"Memorizar el número pi con mil decimales."`,
    replacement: `"Memorizar extensas listas léxicas sin procesar el significado contextual de las palabras."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana12.kt",
    target: `"Vigilar el tránsito peatonal de la comunidad."`,
    replacement: `"Ejercer el control político coactivo y promulgar leyes vinculantes para toda la ciudadanía."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana12.kt",
    target: `"Elegir el club de fútbol al que pertenecerá el barrio."`,
    replacement: `"Administrar la justicia penal y sentenciar los conflictos patrimoniales entre particulares."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana12.kt",
    target: `"Cobrar impuestos tributarios a sus integrantes."`,
    replacement: `"Emitir títulos profesionales y certificar las competencias laborales en el mercado."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt",
    target: `"Razonamiento abstracto computacional perfecto."`,
    replacement: `"Pensamiento hipotético-deductivo y formulación sistemática de hipótesis abstractas."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt",
    target: `"Dominio de la física cuántica experimental."`,
    replacement: `"Dominio pleno de las operaciones formales y de la conservación de la masa y el volumen."`
  },
  {
    file: "SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt",
    target: `"Manejo de silogismos aristotélicos complejos."`,
    replacement: `"Capacidad de pensamiento reversible y razonamiento inductivo sobre objetos concretos."`
  },

  // COMPRENSION LECTORA
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"Contiene una afirmación falsa que contradice a la física cuántica."`,
    replacement: `"Invierte deliberadamente el sentido causal entre la premisa y la conclusión del texto."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"Carece por completo de palabras del idioma castellano."`,
    replacement: `"Generaliza de manera desmedida y abarca temas abstractos ajenos al marco del pasaje."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"Fue escrita en un dialecto amazónico prehispánico."`,
    replacement: `"Sustituye la postura explícita del autor por una interpretación subjetiva o axiológica del lector."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"Dos automóviles que compiten en una pista de carreras."`,
    replacement: `"Dos premisas independientes que compiten entre sí en una antinomia irresoluble."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"El color de una pintura y el marco de madera de la pared."`,
    replacement: `"Un epígrafe decorativo y el número de página de una edición."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana03.kt",
    target: `"Un boleto de cine y el asiento de la sala de proyección."`,
    replacement: `"Dos glosas marginales escritas por copistas diferentes sin relación temática."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana04.kt",
    target: `"El festejo bullicioso y alegre por la victoria de un equipo de fútbol."`,
    replacement: `"La celebración satírica e irónica orientada a ridiculizar los vicios morales de una época (tono festivo-burlesco)."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana04.kt",
    target: `"La discusión técnica sobre cómo reparar el motor de un tractor agrícola."`,
    replacement: `"La exposición neutral, descriptiva y desapasionada de un proceso experimental en laboratorio (tono objetivo)."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana04.kt",
    target: `"El dictado de órdenes militares de ataque en el campo de batalla."`,
    replacement: `"La exhortación apasionada y vehemente que incita a la movilización cívica inmediata (tono panfletario)."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana05.kt",
    target: `"La descripción matemática y neutra de una constante de la física cuántica experimental."`,
    replacement: `"La enunciación de una premisa fáctica puramente descriptiva sin carga valorativa."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana05.kt",
    target: `"La transcripción neutral de una fórmula química balanceada estequiométricamente."`,
    replacement: `"La deducción estrictamente lógica de un teorema dentro de un sistema axiomático formal."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana05.kt",
    target: `"La reproducción literal de un censo demográfico oficial de un organismo internacional."`,
    replacement: `"La cita textual literal empleada como testimonio de autoridad histórica verificable."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana07.kt",
    target: `"La cantidad de procesadores de silicio necesarios para construir un supercomputador cuántico."`,
    replacement: `"La viabilidad de implementar algoritmos de compresión de datos en redes neuronales profundas."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana08.kt",
    target: `"La física cuántica ha demostrado que en la naturaleza no existe ningún tipo de orden ni regularidad comprobable."`,
    replacement: `"Toda correlación matemática presupone siempre una relación causal invariable entre los fenómenos."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana08.kt",
    target: `"Los números porcentuales son puramente subjetivos y carecen de cualquier valor en la investigación experimental."`,
    replacement: `"El cálculo estadístico se restringe a modelos teóricos sin ninguna aplicación a las ciencias fácticas."`
  },
  {
    file: "SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana08.kt",
    target: `"Las correlaciones se aplican únicamente a la literatura fantástica y las causas a los análisis matemáticos puros."`,
    replacement: `"Las hipótesis causales solo pueden formularse en estudios cualitativos de corte descriptivo."`
  },

  // RAZONAMIENTO VERBAL
  {
    file: "SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt",
    target: `"El idioma que se habla en un satélite espacial."`,
    replacement: `"Las variantes lingüísticas determinadas exclusivamente por la procedencia geográfica (dialecto)."`
  },
  {
    file: "SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt",
    target: `"El código morse utilizado por los telegrafistas marítimos."`,
    replacement: `"Las modalidades expresivas individuales y el estilo particular de cada hablante (idiolecto)."`
  },
  {
    file: "SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt",
    target: `"Las modificaciones que sufren las palabras al traducirse a lenguas asiáticas."`,
    replacement: `"El repertorio técnico o jerga especializada compartida por una comunidad profesional."`
  },
  {
    file: "SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt",
    target: `"Solo puede aplicarse a textos de física cuántica."`,
    replacement: `"Depende exclusivamente de los juicios de valor o prejuicios subjetivos de quien realiza la lectura."`
  }
];

let applied = 0;
for (const r of replacements) {
  if (!fs.existsSync(r.file)) {
    console.error("File not found:", r.file);
    continue;
  }
  let content = fs.readFileSync(r.file, 'utf8');
  if (content.includes(r.target)) {
    content = content.replace(r.target, r.replacement);
    fs.writeFileSync(r.file, content, 'utf8');
    applied++;
  } else {
    console.warn("Target not found in", r.file, "=>", r.target.slice(0, 40));
  }
}

console.log(`Applied ${applied} out of ${replacements.length} clean distractor replacements.`);
