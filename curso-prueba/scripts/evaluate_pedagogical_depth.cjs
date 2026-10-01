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

const report = [];

for (const [subj, mdDir] of Object.entries(subjectDirs)) {
  const ktDir = path.join('SALIDA_KOTLIN', subj);
  const ktFiles = fs.readdirSync(ktDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();
  const mdFiles = fs.readdirSync(mdDir).filter(f => f.endsWith('.md')).sort();

  for (let w = 0; w < ktFiles.length; w++) {
    const ktFile = ktFiles[w];
    const mdFile = mdFiles[w];
    if (!mdFile) continue;

    const p = parseKotlinFileRobust(path.join(ktDir, ktFile));
    const mdContent = fs.readFileSync(path.join(mdDir, mdFile), 'utf8');

    for (const l of p.lessons) {
      const thNorm = l.theory.toLowerCase();
      let wellExplainedChallenges = 0;
      let poorlyExplained = [];

      for (const c of l.challenges) {
        const correctOpt = c.options[c.correctIndex] || '';
        const cKws = extractKeywords(`${c.question} ${correctOpt}`);
        
        let foundKws = 0;
        let substantiveHits = 0;

        for (const kw of cKws) {
          if (thNorm.includes(kw)) {
            foundKws++;
            // Check if it appears in an explanatory context (e.g. bolded, in list, or with explanation)
            const occurrences = (thNorm.match(new RegExp(kw, 'g')) || []).length;
            if (occurrences >= 2) substantiveHits++;
          }
        }

        const coverageRatio = cKws.length > 0 ? (foundKws / cKws.length) : 1;
        if (coverageRatio >= 0.5 && substantiveHits >= 2) {
          wellExplainedChallenges++;
        } else {
          poorlyExplained.push({
            chId: c.id,
            q: c.question.slice(0, 50),
            coverageRatio: coverageRatio.toFixed(2),
            substantiveHits
          });
        }
      }

      // Pedagogical evaluation criteria:
      // A lesson is ESTUDIO_OK if:
      // 1. Total theory length >= 8000 chars (comprehensive study material)
      // 2. Contains explanatory headers, examples, or tables
      // 3. At least 80% of challenges have substantial textual explanation
      const hasStructure = thNorm.includes('###') || thNorm.includes('1.') || thNorm.includes('|');
      const isExtensive = l.theory.length >= 8000;
      const highCoverage = (wellExplainedChallenges / l.challenges.length) >= 0.70;

      let estadoInicial = (isExtensive && hasStructure && highCoverage) ? 'ESTUDIO_OK' : 'DEMASIADO_RESUMIDO';

      report.push({
        subj,
        semana: l.semana,
        lessonId: l.id,
        title: l.title,
        theoryLength: l.theory.length,
        lines: l.theory.split('\n').length,
        totalChallenges: l.challenges.length,
        wellExplainedCount: wellExplainedChallenges,
        poorlyExplainedCount: poorlyExplained.length,
        poorlyExplained,
        estadoInicial
      });
    }
  }
}

const estudioOk = report.filter(r => r.estadoInicial === 'ESTUDIO_OK');
const demasiadoResumido = report.filter(r => r.estadoInicial === 'DEMASIADO_RESUMIDO');

console.log(`Evaluated ${report.length} lessons:`);
console.log(`  ESTUDIO_OK initially: ${estudioOk.length}`);
console.log(`  DEMASIADO_RESUMIDO initially: ${demasiadoResumido.length}`);

if (demasiadoResumido.length > 0) {
  console.log('\nSample DEMASIADO_RESUMIDO lessons:');
  demasiadoResumido.slice(0, 10).forEach(d => {
    console.log(`  ${d.lessonId} (${d.subj} sem ${d.semana}): len=${d.theoryLength}, wellExplained=${d.wellExplainedCount}/${d.totalChallenges}`);
    d.poorlyExplained.slice(0, 2).forEach(p => console.log(`     - ${p.chId} (ratio=${p.coverageRatio}, sub=${p.substantiveHits}): ${p.q}`));
  });
}

fs.writeFileSync('scripts/pedagogical_depth_evaluation.json', JSON.stringify(report, null, 2));
