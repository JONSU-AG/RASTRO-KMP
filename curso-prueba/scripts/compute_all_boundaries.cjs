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

const weeksToPartition = [];

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

    // If file has 2 lessons (the vast majority)
    if (p.lessons.length === 2) {
      // Find where Section 3 starts
      const sec3Match = mdContent.match(/^##\s+3\./m);
      if (!sec3Match) continue;
      const sec3Start = sec3Match.index;
      
      // Find where Section 4 or 5 starts (or end of file)
      const sec4Match = mdContent.match(/^##\s+[45]\./m);
      const sec3End = sec4Match ? sec4Match.index : mdContent.length;
      const sec3Body = mdContent.slice(sec3Start, sec3End);

      // Find all ### subheadings inside Section 3
      const h3Regex = /^###\s+([^\n]+)/gm;
      const h3s = [];
      let m;
      while ((m = h3Regex.exec(sec3Body)) !== null) {
        h3s.push({
          title: m[1],
          relPos: m.index,
          absPos: sec3Start + m.index
        });
      }

      if (h3s.length >= 2) {
        // Evaluate each possible split index k (1 <= k < h3s.length)
        // h3s[0...k-1] goes to s01, h3s[k...end] goes to s02
        let bestK = 1;
        let bestScore = -Infinity;

        const s01Kws = p.lessons[0].challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`));
        const s02Kws = p.lessons[1].challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`));

        for (let k = 1; k < h3s.length; k++) {
          const splitPos = h3s[k].absPos;
          const th1 = mdContent.slice(sec3Start, splitPos).toLowerCase();
          const th2 = mdContent.slice(splitPos, sec3End).toLowerCase();

          // How well does th1 cover s01 challenges?
          let s01InTh1 = 0;
          for (const kw of s01Kws) {
            if (th1.includes(kw)) s01InTh1++;
          }
          // How well does th2 cover s02 challenges?
          let s02InTh2 = 0;
          for (const kw of s02Kws) {
            if (th2.includes(kw)) s02InTh2++;
          }

          // Penalize if s01 concepts are in th2 or s02 concepts in th1
          let s01InTh2 = 0;
          for (const kw of s01Kws) {
            if (th2.includes(kw)) s01InTh2++;
          }
          let s02InTh1 = 0;
          for (const kw of s02Kws) {
            if (th1.includes(kw)) s02InTh1++;
          }

          // Score: maximize correct coverage, minimize cross contamination
          const score = (s01InTh1 * 2 + s02InTh2 * 2) - (s01InTh2 + s02InTh1);

          if (score > bestScore) {
            bestScore = score;
            bestK = k;
          }
        }

        weeksToPartition.push({
          subj,
          ktFile,
          mdFile,
          splitH3Index: bestK,
          splitH3Title: h3s[bestK].title,
          splitPos: h3s[bestK].absPos,
          sec3Start,
          sec3End,
          totalH3s: h3s.length
        });
      }
    }
  }
}

console.log(`Computed optimal pedagogical boundaries for ${weeksToPartition.length} weeks.`);
fs.writeFileSync('scripts/optimal_boundaries.json', JSON.stringify(weeksToPartition, null, 2));

weeksToPartition.slice(0, 15).forEach(w => {
  console.log(`${w.subj}/${w.ktFile}: split at H3[${w.splitH3Index}/${w.totalH3s}] "${w.splitH3Title.slice(0, 45)}"`);
});
