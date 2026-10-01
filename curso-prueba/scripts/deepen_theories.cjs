const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');
}

function findLessonTheoryRanges(text) {
  const ranges = [];
  let pos = 0;
  while (true) {
    const start = text.indexOf('LessonTheory(', pos);
    if (start === -1) break;
    const openParen = start + 'LessonTheory'.length;
    let depth = 0;
    let inTriple = false;
    let end = -1;
    for (let i = openParen; i < text.length; i++) {
      if (text.slice(i, i + 3) === '"""') {
        inTriple = !inTriple;
        i += 2;
        continue;
      }
      if (inTriple) continue;
      if (text[i] === '(') depth++;
      else if (text[i] === ')') {
        depth--;
        if (depth === 0) {
          end = i;
          break;
        }
      }
    }
    if (end !== -1) {
      ranges.push({ start, end });
      pos = end + 1;
    } else {
      break;
    }
  }
  return ranges;
}

// Map of targeted lesson depth expansions:
// Each expansion pulls specific high-yield pedagogical sections from CONTENIDO_PEDAGOGICO
const depthAdditions = {
  // PSICOLOGIA 04: EPLERR, Novak, Buzan, Procrastinación, Pomodoro, Matriz Eisenhower, Ley de Parkinson
  'psi_t04_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Metodos_y_Habitos_de_Estudio.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t04_s02': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Metodos_y_Habitos_de_Estudio.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },

  // PSICOLOGIA 07: Inteligencia Emocional, Afectividad, Emociones vs Sentimientos, Ekman, Goleman, James-Lange, Schachter-Singer
  'psi_t07_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional_y_Afectividad.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t07_s02': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional_y_Afectividad.md',
    sections: ['### 4.1.', '## 5.', '## 6.']
  },

  // PSICOLOGIA 08: Personalidad, Temperamento vs Carácter, factores biológicos y ambientales
  'psi_t08_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana08.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_08_Personalidad_Teorias_y_Trastornos.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // PSICOLOGIA 11: Inteligencia, Pensamiento convergente/divergente de Guilford, Heurísticos Kahneman
  'psi_t11_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_11_Inteligencia_y_Medicion.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // PSICOLOGIA 14: Sexualidad humana, Sternberg (Teoría triangular del amor)
  'psi_t14_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana14.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_14_Sexualidad_Humana_y_Genero.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 01: Sinonimia Contextual
  'rv_t01_s01': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana01.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_01_Relaciones_Semanticas_Basicas.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 03: Series Verbales
  'rv_t03_s01': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana03.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_03_Series_y_Clasificaciones_Verbales.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 04: Conectores y Oraciones Incompletas
  'rv_t04_s01': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana04.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_04_Logica_de_Enunciados.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'rv_t04_s02': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana04.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_04_Logica_de_Enunciados.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 05: Reforzamiento y Debilitamiento DECO
  'rv_t05_s02': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana05.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_05_Razonamiento_Argumentativo_Basico.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 06: Principio de Cooperación y Máximas de Grice
  'rv_t06_s02': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana06.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },

  // RAZONAMIENTO VERBAL 08: Adecuación y Plan de Redacción / Cohesión
  'rv_t08_s01': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_08_Resolucion_de_Problemas_Verbales.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'rv_t08_s02': {
    file: 'SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana08.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_08_Resolucion_de_Problemas_Verbales.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },

  // COMPRENSION LECTORA 01 & 02 & 05
  'cl_t01_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana01.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_01_Comprension_Literal.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.', '## 7.']
  },
  'cl_t02_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana02.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_02_Comprension_Inferencial.md',
    sections: ['### 3.3.', '## 4.', '## 5.', '## 6.', '## 7.']
  },
  'cl_t05_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana05.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_05_Evaluacion_de_la_Informacion.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.', '## 7.']
  },

  // COMPRENSION LECTORA 06: Extrapolación (TEMA_02) y Textos Mixtos / Discontinuos (TEMA_08)
  'cl_t06_s01': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana06.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_02_Comprension_Inferencial.md',
    sections: ['#### C. Inferencia por Extrapolación', '## 4.', '## 5.', '## 6.']
  },
  'cl_t06_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana06.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_08_Tipos_de_Texto.md',
    sections: ['### 3.2 Tipología Textual por Formato', '## 4.', '## 5.', '## 6.']
  },

  // COMPRENSION LECTORA 07: Textos Dialécticos (TEMA_08) y Tono del Autor (TEMA_04)
  'cl_t07_s01': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana07.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_08_Tipos_de_Texto.md',
    sections: ['### 3.2 Tipología Textual por Formato', '## 4.', '## 5.']
  },
  'cl_t07_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana07.kt',
    lessonIdx: 1,
    srcFile: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_04_Intencion_y_Proposito_del_Texto.md',
    sections: ['### 3.2 El Tono del Autor', '## 4.', '## 5.', '## 6.']
  },

  // COMPRENSION LECTORA 08: Presuposiciones (RV TEMA_06) y Textos Filosóficos (FILO TEMA_05)
  'cl_t08_s01': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana08.kt',
    lessonIdx: 0,
    srcFile: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md',
    sections: ['### 3.1 Presuposiciones vs. Implicaturas', '## 4.', '## 5.']
  },
  'cl_t08_s02': {
    file: 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana08.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_05_Conocimiento_Ciencia_y_Verdad.md',
    sections: ['## 3.', '## 4.', '## 5.']
  },

  // FILOSOFIA 04: Falacias No Formales
  'filo_t04_s02': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana04.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_04_Logica_y_Teoria_de_la_Argumentacion.md',
    sections: ['### 3.3. Falacias No Formales', '## 4.', '## 5.', '## 6.']
  },

  // FILOSOFIA 11: Axiología y Acto Valorativo
  'filo_t11_s01': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_11_Axiologia_y_Etica.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // FILOSOFIA 13: Antropología Filosófica y Dignidad Humana
  'filo_t13_s02': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana13.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_13_Antropologia_Filosofica.md',
    sections: ['### 3.2. Problemas Antropológicos', '## 4.', '## 5.', '## 6.']
  },

  // GEOGRAFIA 10: Recursos Naturales
  'geo_t10_s01': {
    file: 'SALIDA_KOTLIN/geografia/GeografiaSemana10.kt',
    lessonIdx: 0,
    srcFile: '03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_10_Recursos_Naturales_y_Desarrollo_Sostenible.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // LENGUAJE 07: Redacción y Cohesión
  'leng_t07_s01': {
    file: 'SALIDA_KOTLIN/lenguaje/LenguajeSemana07.kt',
    lessonIdx: 0,
    srcFile: '06_COMUNICACION/LENGUAJE/TEMA_07_Normativa_de_Puntuacion_y_Redaccion.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // LITERATURA 02: Clasicismo Griego
  'lit_t02_s01': {
    file: 'SALIDA_KOTLIN/literatura/LiteraturaSemana02.kt',
    lessonIdx: 0,
    srcFile: '06_COMUNICACION/LITERATURA/TEMA_02_Literatura_Universal.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },

  // LITERATURA 06: Literatura Regional Arequipeña
  'lit_t06_s02': {
    file: 'SALIDA_KOTLIN/literatura/LiteraturaSemana06.kt',
    lessonIdx: 1,
    srcFile: '06_COMUNICACION/LITERATURA/TEMA_06_Literatura_Hispanoamericana_y_Peruana_Contemporanea.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  }
};

let deepenedCount = 0;
let sectionsExpandedCount = 0;

for (const [lessonId, cfg] of Object.entries(depthAdditions)) {
  if (!fs.existsSync(cfg.file)) {
    console.warn(`File not found: ${cfg.file}`);
    continue;
  }
  if (!fs.existsSync(cfg.srcFile)) {
    console.warn(`Source markdown not found: ${cfg.srcFile}`);
    continue;
  }

  let ktText = fs.readFileSync(cfg.file, 'utf8');
  const mdText = fs.readFileSync(cfg.srcFile, 'utf8');
  const ranges = findLessonTheoryRanges(ktText);

  if (ranges.length <= cfg.lessonIdx) {
    console.warn(`Range index out of bounds for ${lessonId} in ${cfg.file}`);
    continue;
  }

  const rng = ranges[cfg.lessonIdx];
  const oldBlock = ktText.slice(rng.start, rng.end + 1);
  const titleMatch = oldBlock.match(/title\s*=\s*"([^"]*)"/);

  // Extract content matching the targeted sections from mdText
  let extractedContent = [];
  for (const secHeader of cfg.sections) {
    const pos = mdText.indexOf(secHeader);
    if (pos !== -1) {
      // Find where next major section starts (or next ##)
      const nextPos = mdText.indexOf('\n## ', pos + secHeader.length);
      const chunk = nextPos !== -1 ? mdText.slice(pos, nextPos) : mdText.slice(pos);
      extractedContent.push(chunk.trim());
      sectionsExpandedCount++;
    }
  }

  if (extractedContent.length === 0) {
    // Fallback: take full markdown body between ## 3. and ## 12.
    const p3 = mdText.indexOf('## 3.');
    const pEnd = mdText.indexOf('## 12.');
    extractedContent.push(p3 !== -1 ? (pEnd !== -1 ? mdText.slice(p3, pEnd) : mdText.slice(p3)) : mdText);
    sectionsExpandedCount++;
  }

  // Combine with existing theory to enrich rather than replace, avoiding duplication
  const oldContentMatch = oldBlock.match(/content\s*=\s*"""([\s\S]*?)"""/);
  const oldContent = oldContentMatch ? oldContentMatch[1] : '';

  let enrichedBody = oldContent;
  for (const chunk of extractedContent) {
    // Only append if not already present in substantial part
    const first50 = chunk.slice(0, 50).trim();
    if (!enrichedBody.includes(first50)) {
      enrichedBody += '\n\n---\n\n' + chunk;
    }
  }

  let newBlock;
  if (titleMatch) {
    newBlock = `LessonTheory(\n                title = ${JSON.stringify(titleMatch[1])},\n                content = """${cleanTripleQuotes(enrichedBody)}"""\n            )`;
  } else {
    newBlock = `LessonTheory(\n                content = """${cleanTripleQuotes(enrichedBody)}"""\n            )`;
  }

  ktText = ktText.slice(0, rng.start) + newBlock + ktText.slice(rng.end + 1);
  fs.writeFileSync(cfg.file, ktText, 'utf8');
  deepenedCount++;
  console.log(`Deepened ${lessonId} in ${cfg.file} (added ${enrichedBody.length - oldContent.length} chars)`);
}

console.log(`Successfully deepened ${deepenedCount} lessons. Total sections expanded: ${sectionsExpandedCount}`);
