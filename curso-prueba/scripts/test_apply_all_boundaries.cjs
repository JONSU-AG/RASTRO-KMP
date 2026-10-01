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

const boundaries = JSON.parse(fs.readFileSync('scripts/optimal_boundaries.json', 'utf8'));

console.log(`Boundaries loaded: ${boundaries.length}`);

// Let's test on 5 files first
const testSubjs = ['civica', 'historia_universal', 'razonamiento_verbal'];
const sample = boundaries.filter(b => testSubjs.includes(b.subj));
console.log(`Testing on ${sample.length} weeks.`);

for (const b of sample) {
  const ktPath = path.join('SALIDA_KOTLIN', b.subj, b.ktFile);
  const mdPath = path.join(subjectDirs[b.subj], b.mdFile);
  const mdContent = fs.readFileSync(mdPath, 'utf8');

  const th1 = mdContent.slice(b.sec3Start, b.splitPos).trim();
  const th2 = mdContent.slice(b.splitPos, b.sec3End).trim();

  const p = parseKotlinFileRobust(ktPath);
  console.log(`\nWeek: ${b.subj}/${b.ktFile}`);
  console.log(`  s01 oldLen=${p.lessons[0].theory.length} -> newLen=${th1.length}`);
  console.log(`  s02 oldLen=${p.lessons[1].theory.length} -> newLen=${th2.length}`);
  console.log(`  Split H3: "${b.splitH3Title}"`);
}
