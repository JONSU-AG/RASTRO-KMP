const fs = require('fs');
const path = require('path');

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

const remainingAdditions = {
  'psi_t04_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Habitos_de_Estudio.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t04_s02': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Habitos_de_Estudio.md',
    sections: ['### 3.2.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t07_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t07_s02': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana07.kt',
    lessonIdx: 1,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional.md',
    sections: ['### 4.1.', '## 5.', '## 6.']
  },
  'psi_t08_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana08.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_08_Personalidad_Temperamento_Caracter.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t11_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana11.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_11_Inteligencia_y_Teorias_Multiples.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'psi_t14_s01': {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana14.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_14_Salud_Sexual_y_Reproductiva.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'filo_t11_s01': {
    file: 'SALIDA_KOTLIN/filosofia/FilosofiaSemana11.kt',
    lessonIdx: 0,
    srcFile: '05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_11_Axiologia_y_Teoria_del_Valor.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'geo_t10_s01': {
    file: 'SALIDA_KOTLIN/geografia/GeografiaSemana10.kt',
    lessonIdx: 0,
    srcFile: '03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_10_Recursos_Naturales_ANP_y_Desarrollo_Sostenible.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'leng_t07_s01': {
    file: 'SALIDA_KOTLIN/lenguaje/LenguajeSemana07.kt',
    lessonIdx: 0,
    srcFile: '06_COMUNICACION/LENGUAJE/TEMA_07_Discurso_Escrito_y_Normativa.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  },
  'lit_t06_s02': {
    file: 'SALIDA_KOTLIN/literatura/LiteraturaSemana06.kt',
    lessonIdx: 1,
    srcFile: '06_COMUNICACION/LITERATURA/TEMA_06_Literatura_Regional_Sur_Andino_y_Arequipa.md',
    sections: ['## 3.', '## 4.', '## 5.', '## 6.']
  }
};

let count = 0;
let sectionsCount = 0;

for (const [lessonId, cfg] of Object.entries(remainingAdditions)) {
  if (!fs.existsSync(cfg.file) || !fs.existsSync(cfg.srcFile)) {
    console.warn(`File check failed: kt=${fs.existsSync(cfg.file)}, md=${fs.existsSync(cfg.srcFile)} for ${lessonId}`);
    continue;
  }

  let ktText = fs.readFileSync(cfg.file, 'utf8');
  const mdText = fs.readFileSync(cfg.srcFile, 'utf8');
  const ranges = findLessonTheoryRanges(ktText);

  if (ranges.length <= cfg.lessonIdx) continue;

  const rng = ranges[cfg.lessonIdx];
  const oldBlock = ktText.slice(rng.start, rng.end + 1);
  const titleMatch = oldBlock.match(/title\s*=\s*"([^"]*)"/);

  let extractedContent = [];
  for (const secHeader of cfg.sections) {
    const pos = mdText.indexOf(secHeader);
    if (pos !== -1) {
      const nextPos = mdText.indexOf('\n## ', pos + secHeader.length);
      const chunk = nextPos !== -1 ? mdText.slice(pos, nextPos) : mdText.slice(pos);
      extractedContent.push(chunk.trim());
      sectionsCount++;
    }
  }

  const oldContentMatch = oldBlock.match(/content\s*=\s*"""([\s\S]*?)"""/);
  const oldContent = oldContentMatch ? oldContentMatch[1] : '';

  let enrichedBody = oldContent;
  for (const chunk of extractedContent) {
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
  count++;
  console.log(`Deepened ${lessonId} in ${cfg.file} (added ${enrichedBody.length - oldContent.length} chars)`);
}

console.log(`Successfully completed pass 2: ${count} lessons deepened, ${sectionsCount} sections added.`);
