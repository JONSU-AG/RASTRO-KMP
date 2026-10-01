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

const crossData = JSON.parse(fs.readFileSync('scripts/cross_contaminations_details.json', 'utf8'));
const problemFiles = Array.from(new Set(crossData.map(d => d.rel))).sort();

console.log(`Total problem files: ${problemFiles.length}`);

for (const rel of problemFiles) {
  const [subj, ktFileName] = rel.split('/');
  const ktPath = path.join('SALIDA_KOTLIN', rel);
  const p = parseKotlinFileRobust(ktPath);

  const mdDir = subjectDirs[subj];
  const mdFiles = fs.readdirSync(mdDir).filter(f => f.endsWith('.md')).sort();
  // Find matching md file by week number
  const weekMatch = ktFileName.match(/Semana(\d+)/);
  const weekNum = weekMatch ? parseInt(weekMatch[1], 10) : 1;
  const mdFile = mdFiles[weekNum - 1];

  console.log(`\n======================================================`);
  console.log(`FILE: ${rel} <---> MD: ${mdFile}`);
  console.log(`Lessons in KT: ${p.lessons.length}`);
  p.lessons.forEach((l, idx) => {
    console.log(`  s0${idx+1}: id=${l.id}, title="${l.title}", theoryLen=${l.theory.length}, chCount=${l.challenges.length}`);
  });

  if (mdFile) {
    const md = fs.readFileSync(path.join(mdDir, mdFile), 'utf8');
    const h3s = [...md.matchAll(/^###\s+([^\n]+)/gm)].map(m => m[1]);
    console.log(`  MD ### headings (${h3s.length}):`);
    h3s.forEach(h => console.log(`     - ${h}`));
  }
}
