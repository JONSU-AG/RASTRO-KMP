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

const recordedIncidents = [];

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

    const p = parseKotlinFileRobust(ktPath);
    const mdContent = fs.readFileSync(mdPath, 'utf8');

    // Split markdown into chunks based on ### or ##
    const rawChunks = mdContent.split(/(?=^###?\s+)/gm);
    // Filter out metadata and gamification chunks
    const chunks = rawChunks.filter(c => {
      const first = c.trim().split('\n')[0].toLowerCase();
      return !first.includes('gamificación') && !first.includes('json') && !first.includes('ficha técnica') && !first.includes('portada');
    });

    const lessonCount = p.lessons.length;
    const lessonKws = p.lessons.map(l => l.challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`)));

    // Allocate chunks to lessons based on concept affinity
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
        // General chunk (e.g. introductory overview or glossary)
        // If it's a glossary or comparative table, add to all lessons so every lesson has its terminology
        if (ch.includes('GLOSARIO') || ch.includes('CUADRO COMPARATIVO') || ch.includes('FORMULARIO')) {
          for (let i = 0; i < lessonCount; i++) allocatedChunks[i].push(ch);
        } else {
          allocatedChunks[0].push(ch);
        }
      } else {
        // Find which lesson has the highest affinity
        const bestIdx = scores.indexOf(maxScore);
        allocatedChunks[bestIdx].push(ch);

        // Check if another lesson also had significant matches (> 60% of maxScore)
        for (let i = 0; i < lessonCount; i++) {
          if (i !== bestIdx && scores[i] >= 8 && (scores[i] / maxScore) >= 0.75) {
            // Shared reference section (e.g. comparative table or transition)
            allocatedChunks[i].push(ch);
          }
        }
      }
    }

    // Build new theories for each lesson
    const newTheories = allocatedChunks.map((chList, idx) => {
      let combined = chList.join('\n\n').trim();
      // Ensure combined has some content
      if (combined.length < 500) {
        combined = mdContent.slice(mdContent.indexOf('## 3.'), mdContent.indexOf('## 4.') !== -1 ? mdContent.indexOf('## 4.') : undefined).trim();
      }
      return combined;
    });

    // Check if updating is needed
    let fileModified = false;
    let ktCode = fs.readFileSync(ktPath, 'utf8');

    // Replace LessonTheory in Kotlin file cleanly
    let lessonIdx = 0;
    const updatedKt = ktCode.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, (match) => {
      const currIdx = lessonIdx;
      lessonIdx++;
      if (currIdx < newTheories.length) {
        const titleMatch = match.match(/title\s*=\s*"([^"]*)"/);
        const title = titleMatch ? titleMatch[1] : p.lessons[currIdx].title;
        return `LessonTheory(\n                title = ${JSON.stringify(title)},\n                content = """${cleanTripleQuotes(newTheories[currIdx])}"""\n            )`;
      }
      return match;
    });

    if (updatedKt !== ktCode) {
      fs.writeFileSync(ktPath, updatedKt, 'utf8');
      fileModified = true;
    }

    // Check for incidents in this file
    for (let i = 0; i < p.lessons.length; i++) {
      const l = p.lessons[i];
      const oldTh = l.theory.toLowerCase();
      const newTh = newTheories[i].toLowerCase();

      for (const c of l.challenges) {
        const kws = extractKeywords(`${c.question} ${c.options[c.correctIndex]}`);
        let inOld = 0;
        let inNew = 0;
        for (const kw of kws) {
          if (oldTh.includes(kw)) inOld++;
          if (newTh.includes(kw)) inNew++;
        }
        const oldRatio = kws.length > 0 ? (inOld / kws.length) : 1;
        const newRatio = kws.length > 0 ? (inNew / kws.length) : 1;

        if (oldRatio < 0.35 && newRatio >= 0.5) {
          recordedIncidents.push({
            lessonId: l.id,
            tipo: 'FRONTERA_DEFECTUOSA_O_TEORIA_INSUFICIENTE',
            challenge: c.id,
            problema: `El challenge evaluaba conceptos ausentes en la teoría original del LessonNode (${c.question.slice(0, 60)}...)`,
            fuente: `${mdDir}/${mdFile}`,
            accion: 'Reestructuración de fronteras teóricas y asignación de la subsección curricular correspondiente desde CONTENIDO_PEDAGOGICO',
            resultado: `Cobertura restaurada de ${(oldRatio*100).toFixed(0)}% a ${(newRatio*100).toFixed(0)}% dentro de la cápsula autosuficiente.`
          });
        }
      }
    }
  }
}

console.log(`Repaired boundaries across all 10 subjects. Recorded ${recordedIncidents.length} boundary incidents.`);
fs.writeFileSync('scripts/recorded_boundary_incidents.json', JSON.stringify(recordedIncidents, null, 2));
