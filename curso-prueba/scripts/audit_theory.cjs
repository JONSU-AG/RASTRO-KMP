const fs = require('fs');
const path = require('path');
const { parseKotlinFile } = require('./audit_engine.cjs');

const subjects = [
  'lenguaje',
  'civica',
  'literatura',
  'historia_peru',
  'historia_universal',
  'geografia',
  'psicologia',
  'filosofia',
  'razonamiento_verbal',
  'comprension_lectora'
];

let totalLessons = 0;
let suspiciousTheory = 0;

for (const s of subjects) {
  const dir = path.join('SALIDA_KOTLIN', s);
  const files = fs.readdirSync(dir).filter(f => f.endsWith('.kt') && !f.includes('Catalog'));
  for (const f of files) {
    const full = path.join(dir, f);
    const parsed = parseKotlinFile(full);
    for (const l of parsed.lessons) {
      totalLessons++;
      const t = l.theory;
      if (!t || t.trim().length < 200) {
        console.log(`[SUSPICIOUS SHORT THEORY] ${l.id} in ${f}: length ${t ? t.length : 0}`);
        suspiciousTheory++;
      }
      if (t.includes('TODO') || t.includes('Lorem ipsum') || t.endsWith('...')) {
        console.log(`[SUSPICIOUS ENDING OR PLACEHOLDER] ${l.id} in ${f}`);
        suspiciousTheory++;
      }
      // Check unclosed code blocks or broken tables
      const codeTicks = (t.match(/```/g) || []).length;
      if (codeTicks % 2 !== 0) {
        console.log(`[UNCLOSED CODE BLOCK] ${l.id} in ${f}: ${codeTicks} occurrences of ` + "```");
        suspiciousTheory++;
      }
    }
  }
}

console.log(`Audited ${totalLessons} lessons. Suspicious theory findings: ${suspiciousTheory}`);
