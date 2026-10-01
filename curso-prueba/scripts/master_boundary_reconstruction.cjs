const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const subjectDirs = {
  'civica': '05_PERSONA_Y_FAMILIA/CIVICA',
  'comprension_lectora': '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA',
  'filosofia': '05_PERSONA_Y_FAMILIA/FILOSOFIA',
  'geografia': '03_CIENCIAS_SOCIALES/GEOGRAFIA',
  'historia_peru': '03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU',
  'historia_universal': '03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL',
  'lenguaje': '06_COMUNICACION/LENGUAJE',
  'literatura': '06_COMUNICACION/LITERATURA',
  'psicologia': '05_PERSONA_Y_FAMILIA/PSICOLOGIA',
  'razonamiento_verbal': '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL'
};

const stopwords = new Set([
  'de', 'la', 'el', 'en', 'y', 'a', 'los', 'del', 'las', 'con', 'por', 'un', 'para',
  'una', 'es', 'al', 'lo', 'como', 'más', 'o', 'pero', 'sus', 'le', 'ha', 'me', 'si',
  'sin', 'sobre', 'este', 'ya', 'entre', 'cuando', 'todo', 'esta', 'ser', 'son', 'dos',
  'también', 'fue', 'era', 'muy', 'hasta', 'desde', 'está', 'mi', 'porque', 'qué',
  'solo', 'han', 'yo', 'hay', 'vez', 'puede', 'todos', 'así', 'nos', 'ni', 'parte',
  'tiene', 'él', 'uno', 'donde', 'bien', 'tiempo', 'mismo', 'ese', 'ahora', 'cada',
  'e', 'vida', 'otro', 'después', 'te', 'otros', 'aunque', 'esa', 'eso', 'hace', 'otra'
]);

function extractKeywords(text) {
  if (!text) return [];
  const words = text.toLowerCase()
    .replace(/[«»""''.,;:()\[\]{}!?¿¡\/\-_*#+]/g, ' ')
    .split(/\s+/)
    .filter(w => w.length >= 4 && !stopwords.has(w));
  return Array.from(new Set(words));
}

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

const incidents = [];

for (const [subj, mdDir] of Object.entries(subjectDirs)) {
  const ktDir = path.join('SALIDA_KOTLIN', subj);
  const ktFiles = fs.readdirSync(ktDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();
  const mdFiles = fs.readdirSync(mdDir).filter(f => f.endsWith('.md')).sort();

  for (let w = 0; w < ktFiles.length; w++) {
    const ktFile = ktFiles[w];
    const mdFile = mdFiles[w];
    if (!mdFile) continue;

    const ktPath = path.join(ktDir, ktFile);
    const mdPath = path.join(mdDir, mdFile);

    let ktContent = fs.readFileSync(ktPath, 'utf8');
    const mdContent = fs.readFileSync(mdPath, 'utf8');
    const p = parseKotlinFileRobust(ktPath);
    const ranges = findLessonTheoryRanges(ktContent);

    if (ranges.length !== p.lessons.length) {
      console.warn(`Mismatch in ranges vs lessons in ${ktFile}: ranges=${ranges.length}, lessons=${p.lessons.length}`);
      continue;
    }

    // Split markdown into chunks based on ## or ###
    const rawChunks = mdContent.split(/(?=^###?\s+)/gm);
    const chunks = rawChunks.filter(c => {
      const first = c.trim().split('\n')[0].toLowerCase();
      return !first.includes('gamificación') && !first.includes('json') && !first.includes('ficha técnica') && !first.includes('portada');
    });

    const lessonCount = p.lessons.length;
    const lessonKws = p.lessons.map(l => l.challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`)));

    // Allocate chunks
    const allocatedChunks = Array.from({ length: lessonCount }, () => []);

    for (const ch of chunks) {
      const chNorm = ch.toLowerCase();
      const scores = lessonKws.map(kws => {
        let sc = 0;
        for (const kw of kws) {
          if (chNorm.includes(kw)) sc++;
        }
        return sc;
      });

      const maxScore = Math.max(...scores);
      if (maxScore === 0) {
        // If it's glossary or comparative table, add to all lessons
        if (ch.includes('GLOSARIO') || ch.includes('CUADRO COMPARATIVO') || ch.includes('FORMULARIO')) {
          for (let i = 0; i < lessonCount; i++) allocatedChunks[i].push(ch);
        } else {
          allocatedChunks[0].push(ch);
        }
      } else {
        const bestIdx = scores.indexOf(maxScore);
        allocatedChunks[bestIdx].push(ch);

        // If another lesson also strongly matches (> 70% of maxScore and >= 8 matches), share
        for (let i = 0; i < lessonCount; i++) {
          if (i !== bestIdx && scores[i] >= 8 && (scores[i] / maxScore) >= 0.70) {
            allocatedChunks[i].push(ch);
          }
        }
      }
    }

    // Ensure every lesson's challenges have their keywords in that lesson's theory:
    // If a chunk contains keywords needed by a challenge in lesson i, add that chunk to lesson i!
    for (let i = 0; i < lessonCount; i++) {
      const l = p.lessons[i];
      for (const c of l.challenges) {
        const cKws = extractKeywords(`${c.question} ${c.options[c.correctIndex]}`);
        let currentText = allocatedChunks[i].join('\n\n').toLowerCase();
        let missingCount = 0;
        for (const kw of cKws) {
          if (!currentText.includes(kw)) missingCount++;
        }
        if (missingCount >= 3) {
          // Find if another chunk in mdContent contains the missing keywords
          for (const ch of chunks) {
            if (!allocatedChunks[i].includes(ch)) {
              const chNorm = ch.toLowerCase();
              let matchedMissing = 0;
              for (const kw of cKws) {
                if (chNorm.includes(kw)) matchedMissing++;
              }
              if (matchedMissing >= 2) {
                allocatedChunks[i].push(ch);
                incidents.push({
                  lessonId: l.id,
                  tipo: 'CONTAMINACION_CRUZADA_REPARADA',
                  challenge: c.id,
                  problema: `Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de ${l.id} y ubicados en otra sección de la semana (${c.question.slice(0, 60)}...)`,
                  fuente: `${mdDir}/${mdFile}`,
                  accion: 'Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta',
                  resultado: `El LessonNode ${l.id} ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.`
                });
              }
            }
          }
        }
      }
    }

    // Now replace the ranges from last to first
    for (let i = ranges.length - 1; i >= 0; i--) {
      const rng = ranges[i];
      const theoryBody = allocatedChunks[i].join('\n\n').trim();
      const existingTheoryBlock = ktContent.slice(rng.start, rng.end + 1);
      const titleMatch = existingTheoryBlock.match(/title\s*=\s*"([^"]*)"/);
      
      let newBlock;
      if (titleMatch) {
        newBlock = `LessonTheory(\n                title = ${JSON.stringify(titleMatch[1])},\n                content = """${cleanTripleQuotes(theoryBody)}"""\n            )`;
      } else {
        newBlock = `LessonTheory(\n                content = """${cleanTripleQuotes(theoryBody)}"""\n            )`;
      }
      ktContent = ktContent.slice(0, rng.start) + newBlock + ktContent.slice(rng.end + 1);
    }

    fs.writeFileSync(ktPath, ktContent, 'utf8');
  }
}

console.log(`Master boundary reconstruction finished. Recorded ${incidents.length} boundary repairs.`);
fs.writeFileSync('scripts/master_boundary_incidents.json', JSON.stringify(incidents, null, 2));
