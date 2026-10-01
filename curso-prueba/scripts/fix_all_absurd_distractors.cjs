const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// Define exact challenge replacements for the absurd distractor cases
const distractorFixes = {
  // FILOSOFIA
  'filo_t05_s02_c08': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana05.kt',
    bad: 'La ciencia debe regirse por los preceptos de la astrología caldea.',
    good: 'La ciencia inductiva debe formular leyes matemáticas a priori sin necesidad de experimentos.'
  },
  'filo_t06_s01_c09': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana06.kt',
    bad: 'Son sustancias divinas creadas por los ángeles antes del sol.',
    good: 'Son percepciones sensibles originadas en la experiencia empírica inmediata.'
  },
  'filo_t06_s02_c05': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana06.kt',
    bad: 'La filosofía debe transformarse en una rama de la astrología sideral.',
    good: 'La filosofía debe subordinarse plenamente a los dogmas teológicos de la fe.'
  },
  'filo_t06_s02_c10': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana06.kt',
    bad: 'Hay diez sustancias celestiales gobernadas por el patriarca de Roma.',
    good: 'Existen múltiples sustancias independientes que no interactúan entre sí.'
  },
  'filo_t13_s01_c08': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana13.kt',
    bad: 'Los hombres fueron creados por un arquitecto celestial con un molde inmodificable.',
    good: 'El ser humano posee una esencia fija y predeterminada por la naturaleza cósmica.'
  },
  'filo_t13_s02_c02': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana13.kt',
    replaceOptions: [
      "Un largo proceso biológico de hominización y evolución natural a través de mutaciones aleatorias y selección natural a partir de ancestros comunes de primates.",
      "Un acto de creación instantánea e independiente para cada especie animal según la doctrina fijista.",
      "La transmisión hereditaria de caracteres adquiridos por el uso y desuso de órganos según la tesis lamarckiana pura.",
      "Un diseño teleológico estático preestablecido en la naturaleza biológica sin transformación de linajes."
    ]
  },

  // PSICOLOGIA
  'psi_t02_s01_c07': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana02.kt',
    bad: 'Secretas, Mágicas, Automáticas, Rutinarias y Tranquilas.',
    good: 'Subjetivas, Motivacionales, Abstractas, Racionales y Teóricas.'
  },
  'psi_t02_s02_c02': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana02.kt',
    bad: 'El horóscopo semanal de compatibilidad de signos.',
    good: 'La opinión subjetiva e intuitiva de amigos de la infancia.'
  },
  'psi_t03_s01_c04': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana03.kt',
    bad: 'El azar ciego determinado por el horóscopo.',
    good: 'La imposición arbitraria de tradiciones familiares sin vocación.'
  },
  'psi_t07_s01_c09': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt',
    replaceOptions: [
      "Resolver exclusivamente problemas lógico-formales y de cálculo matemático abstracto.",
      "Reprimir e inhibir por completo toda manifestación afectiva ante cualquier estímulo ambiental.",
      "Demostrar una capacidad excepcional de memoria mecánica para datos no contextualizados.",
      "Reconocer los propios sentimientos y los ajenos, motivarnos a nosotros mismos y manejar adecuadamente las relaciones interpersonales y la autorregulación emocional."
    ]
  },
  'psi_t09_s02_c04': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana09.kt',
    bad: 'Premia al sujeto con dulces y chocolates.',
    good: 'Presenta un estímulo reforzador apetitivo inmediatamente después de la respuesta.'
  },
  'psi_t09_s02_c08': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana09.kt',
    replaceOptions: [
      "Se memoriza mecánicamente un conjunto de datos aislados por simple repetición asociativa sin conexión conceptual.",
      "La nueva información se relaciona y conecta de manera sustantiva y no arbitraria con los conocimientos y esquemas previos que ya posee el estudiante en su estructura cognitiva.",
      "Se aplican programas de reforzamiento continuo mediante fichas canjeables de conducta.",
      "El estudiante reproduce miméticamente las pautas conductuales observadas en un modelo vicario."
    ]
  },
  'psi_t09_s02_c10': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana09.kt',
    bad: 'Imita a un robot mecánico programado.',
    good: 'Aprende mediante ensayo y error ciego por reforzamiento gradual.'
  },
  'psi_t10_s02_c04': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana10.kt',
    replaceOptions: [
      "Memoria procedimental, memoria semántica y memoria episódica según el modelo de Tulving.",
      "Memoria Sensorial (MS), Memoria a Corto Plazo (MCP / de trabajo) y Memoria a Largo Plazo (MLP).",
      "Memoria fotográfica, memoria verbal y memoria afectiva involuntaria.",
      "Memoria declarativa explícita, memoria implícita no asociativa y memoria refleja."
    ]
  },
  'psi_t11_s01_c05': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt',
    bad: 'Reflejos condicionados del tracto digestivo.',
    good: 'Respuestas fisiológicas involuntarias autónomas no asociadas al razonamiento.'
  },
  'psi_t11_s01_c06': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt',
    bad: 'Suposiciones mágicas sin ninguna evidencia empírica.',
    good: 'Intuiciones subjetivas no contrastadas experimentalmente.'
  },
  'psi_t15_s01_c07': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt',
    bad: 'Ver fantasmas transparentes en las paredes del colegio.',
    good: 'Experimentar pareidolias visuales en sombras de iluminación tenue.'
  },
  'psi_t15_s02_c07': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt',
    bad: 'Fantasía mágica de los cuentos de hadas.',
    good: 'Simbolismo intuitivo prelógico y juego de roles espontáneo.'
  },
  'psi_t15_s02_c09': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt',
    bad: 'Retorno al pensamiento mágico de los bebés lactantes.',
    good: 'Regresión a operaciones concretas elementales sin reversibilidad formal.'
  },

  // COMPRENSION LECTORA & RV
  'cl_t02_s01_c09': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana02.kt',
    bad: 'Qué acontecimientos ocurrirán en el año 3000 de forma mágica.',
    good: 'Especulaciones predictivas que sobrepasan las premisas epistemológicas del texto.'
  },
  'cl_t06_s01_c05': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana06.kt',
    bad: 'Introducir premisas mágicas o sobrenaturales para resolver cualquier incoherencia argumentativa del escenario.',
    good: 'Alterar arbitrariamente las reglas de inferencia lógica o las premisas fundamentales del texto.'
  },
  'rv_t05_s01_c04': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana05.kt',
    bad: 'Los quioscos escolares obtienen grandes ganancias comerciales vendiendo dulces.',
    good: 'Las cafeterías escolares ofrecen productos de diversa procedencia comercial.'
  },

  // LITERATURA
  'lit_t03_s01_c10': {
    file: 'SALIDA_KOTLIN/literatura/LiteraturaSemana03.kt',
    bad: 'Mágico y empleo de pócimas de invisibilidad.',
    good: 'Alegórico y empleo de visiones oníricas idealizadas.'
  },
  'lit_t04_s02_c06': {
    file: 'SALIDA_KOTLIN/literatura/LiteraturaSemana04.kt',
    bad: 'Un espejo mágico que muestra cómo morirá cada ser humano.',
    good: 'Un diario íntimo que revela la hipocresía de la élite provinciana.'
  }
};

let fixesApplied = 0;

for (const [chId, fix] of Object.entries(distractorFixes)) {
  if (!fs.existsSync(fix.file)) {
    console.warn(`File not found: ${fix.file}`);
    continue;
  }
  let content = fs.readFileSync(fix.file, 'utf8');
  if (fix.replaceOptions) {
    // Find the challenge block and replace its options
    const chIdx = content.indexOf(chId);
    if (chIdx !== -1) {
      const optStart = content.indexOf('options = listOf(', chIdx);
      const optEnd = content.indexOf('),', optStart);
      if (optStart !== -1 && optEnd !== -1) {
        const newOptionsBlock = `options = listOf(\n                        ${fix.replaceOptions.map(o => JSON.stringify(o)).join(',\n                        ')}\n                    )`;
        content = content.slice(0, optStart) + newOptionsBlock + content.slice(optEnd + 1);
        fs.writeFileSync(fix.file, content, 'utf8');
        fixesApplied++;
        console.log(`Replaced options in ${chId} (${fix.file})`);
      }
    }
  } else if (fix.bad && fix.good) {
    if (content.includes(fix.bad)) {
      content = content.replace(fix.bad, fix.good);
      fs.writeFileSync(fix.file, content, 'utf8');
      fixesApplied++;
      console.log(`Replaced bad distractor in ${chId} (${fix.file})`);
    } else {
      console.log(`Pattern "${fix.bad.slice(0, 30)}..." not found in ${fix.file} (might already be fixed)`);
    }
  }
}

console.log(`Total distractor fixes applied: ${fixesApplied}`);
