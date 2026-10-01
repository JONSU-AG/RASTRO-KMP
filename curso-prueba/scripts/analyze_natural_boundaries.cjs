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

const analysis = [];

for (const [subj, dir] of Object.entries(subjectDirs)) {
  const ktDir = path.join('SALIDA_KOTLIN', subj);
  const ktFiles = fs.readdirSync(ktDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();
  const mdFiles = fs.readdirSync(dir).filter(f => f.endsWith('.md')).sort();

  for (let i = 0; i < ktFiles.length; i++) {
    const ktFile = ktFiles[i];
    const mdFile = mdFiles[i];
    if (!mdFile) continue;

    const p = parseKotlinFileRobust(path.join(ktDir, ktFile));
    const mdContent = fs.readFileSync(path.join(dir, mdFile), 'utf8');

    // Split markdown into chunks by ## or ### headings
    // Let's identify the headings under Section 3
    const sec3Pos = mdContent.search(/##\s+3\./);
    const sec4Pos = mdContent.search(/##\s+[45]\./);
    const sec3Text = sec3Pos !== -1 ? (sec4Pos !== -1 ? mdContent.slice(sec3Pos, sec4Pos) : mdContent.slice(sec3Pos)) : mdContent;

    const subheadings = [...sec3Text.matchAll(/###\s+([^\n]+)/g)];
    
    // For each lesson, check which subheadings it matches
    const lessonSubheadMatches = p.lessons.map(l => {
      const allChKws = l.challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`));
      return subheadings.map((sh, idx) => {
        const nextPos = idx + 1 < subheadings.length ? subheadings[idx + 1].index : sec3Text.length;
        const block = sec3Text.slice(sh.index, nextPos).toLowerCase();
        let matches = 0;
        for (const kw of allChKws) {
          if (block.includes(kw)) matches++;
        }
        return { title: sh[1], matches };
      });
    });

    analysis.push({
      subj,
      ktFile,
      mdFile,
      lessonCount: p.lessons.length,
      lessonTitles: p.lessons.map(l => l.title),
      subheadingCount: subheadings.length,
      subheadings: subheadings.map(s => s[1]),
      lessonSubheadMatches
    });
  }
}

console.log(`Analyzed ${analysis.length} weeks.`);
fs.writeFileSync('scripts/boundary_analysis.json', JSON.stringify(analysis, null, 2));

// Print an example: RV Semana 06
const rv06 = analysis.find(a => a.ktFile === 'RazonamientoVerbalSemana06.kt');
if (rv06) {
  console.log('\n=== RV SEMANA 06 ===');
  console.log('Subheadings in Sec 3:', rv06.subheadings);
  rv06.lessonSubheadMatches.forEach((lm, idx) => {
    console.log(`Lesson ${idx} (${rv06.lessonTitles[idx]}):`);
    lm.forEach(m => console.log(`   - "${m.title.slice(0, 40)}" -> ${m.matches} matches`));
  });
}
