const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// Mapping from SALIDA_KOTLIN subject folder to source markdown directory:
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

const report = [];

for (const [subj, dir] of Object.entries(subjectDirs)) {
  const ktDir = path.join('SALIDA_KOTLIN', subj);
  const ktFiles = fs.readdirSync(ktDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();
  const mdFiles = fs.readdirSync(dir).filter(f => f.endsWith('.md')).sort();

  for (let i = 0; i < ktFiles.length; i++) {
    const ktFile = ktFiles[i];
    const mdFile = mdFiles[i]; // usually 1-to-1 correspondence
    if (!mdFile) {
      console.warn(`No mdFile for ${subj}/${ktFile}`);
      continue;
    }

    const p = parseKotlinFileRobust(path.join(ktDir, ktFile));
    const mdContent = fs.readFileSync(path.join(dir, mdFile), 'utf8');

    // Extract all ### 3.x headings from mdContent
    const headings = mdContent.match(/^###\s+3\.\d+.*$/gm) || [];

    report.push({
      subj,
      ktFile,
      mdFile,
      lessonCount: p.lessons.length,
      lessonTitles: p.lessons.map(l => ({ id: l.id, title: l.title })),
      mdHeadings: headings
    });
  }
}

console.log(`Mapped ${report.length} weeks.`);
let mismatches = 0;
for (const r of report) {
  if (r.lessonCount === 2 && r.mdHeadings.length >= 2) {
    // Check if lesson titles align with mdHeadings
    const l1 = r.lessonTitles[0].title;
    const l2 = r.lessonTitles[1].title;
    // console.log(`${r.subj}/${r.ktFile}:`);
    // console.log(`   L1: ${l1}`);
    // console.log(`   L2: ${l2}`);
    // console.log(`   MD: ${r.mdHeadings.join(' | ')}`);
  }
}
console.log("Analysis ready.");
