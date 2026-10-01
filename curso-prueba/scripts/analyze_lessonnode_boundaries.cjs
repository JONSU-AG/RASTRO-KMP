const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

function walk(dir) {
  let res = [];
  for (const f of fs.readdirSync(dir)) {
    const full = path.join(dir, f);
    if (fs.statSync(full).isDirectory()) res.push(...walk(full));
    else if (f.endsWith('.kt') && !f.includes('Catalog')) res.push(full);
  }
  return res;
}

const files = walk('SALIDA_KOTLIN').sort();

const stopwords = new Set([
  'de', 'la', 'el', 'en', 'y', 'a', 'los', 'del', 'las', 'con', 'por', 'un', 'para',
  'una', 'es', 'al', 'lo', 'como', 'más', 'o', 'pero', 'sus', 'le', 'ha', 'me', 'si',
  'sin', 'sobre', 'este', 'ya', 'entre', 'cuando', 'todo', 'esta', 'ser', 'son', 'dos',
  'también', 'fue', 'era', 'muy', 'hasta', 'desde', 'está', 'mi', 'porque', 'qué',
  'solo', 'han', 'yo', 'hay', 'vez', 'puede', 'todos', 'así', 'nos', 'ni', 'parte',
  'tiene', 'él', 'uno', 'donde', 'bien', 'tiempo', 'mismo', 'ese', 'ahora', 'cada',
  'e', 'vida', 'otro', 'después', 'te', 'otros', 'aunque', 'esa', 'eso', 'hace', 'otra',
  'gobierno', 'tan', 'durante', 'siempre', 'día', 'tanto', 'ella', 'tres', 'sí', 'dijo',
  'cual', 'según', 'menos', 'año', 'caso', 'nada', 'cualquier', 'cuál', 'siguiente',
  'siguientes', 'afirma', 'afirmación', 'respecto', 'característica', 'caracteriza'
]);

function extractKeywords(text) {
  if (!text) return [];
  const words = text.toLowerCase()
    .replace(/[«»""''.,;:()\[\]{}!?¿¡\/\-_*#+]/g, ' ')
    .split(/\s+/)
    .filter(w => w.length >= 4 && !stopwords.has(w));
  return Array.from(new Set(words));
}

let totalLessons = 0;
let totalChallenges = 0;
const crossContaminations = [];
const lowCoverageChallenges = [];

for (const file of files) {
  const p = parseKotlinFileRobust(file);
  const lessons = p.lessons;
  totalLessons += lessons.length;

  for (let i = 0; i < lessons.length; i++) {
    const currentLesson = lessons[i];
    const otherLessons = lessons.filter((_, idx) => idx !== i);
    const currentTheoryNorm = currentLesson.theory.toLowerCase();
    const otherTheoriesNorm = otherLessons.map(l => l.theory.toLowerCase()).join(' ');

    for (const c of currentLesson.challenges) {
      totalChallenges++;
      const correctOpt = c.options[c.correctIndex] || '';
      const targetText = `${c.question} ${correctOpt}`;
      const kws = extractKeywords(targetText);

      // Check how many keywords appear in current theory vs other theory
      let inCurrent = 0;
      let inOtherOnly = 0;
      const missingKws = [];

      for (const kw of kws) {
        const hasCurr = currentTheoryNorm.includes(kw);
        const hasOther = otherTheoriesNorm.includes(kw);
        if (hasCurr) {
          inCurrent++;
        } else {
          missingKws.push(kw);
          if (hasOther) {
            inOtherOnly++;
          }
        }
      }

      const ratioCurrent = kws.length > 0 ? (inCurrent / kws.length) : 1;

      // If significant keywords are in other lesson and missing in current
      if (inOtherOnly >= 3 && ratioCurrent < 0.5) {
        crossContaminations.push({
          file: path.relative('SALIDA_KOTLIN', file),
          lessonId: currentLesson.id,
          challengeId: c.id,
          question: c.question.slice(0, 70),
          ratioCurrent: ratioCurrent.toFixed(2),
          inOtherOnly,
          missingKws: missingKws.slice(0, 5)
        });
      } else if (ratioCurrent < 0.25 && kws.length >= 4) {
        lowCoverageChallenges.push({
          file: path.relative('SALIDA_KOTLIN', file),
          lessonId: currentLesson.id,
          challengeId: c.id,
          question: c.question.slice(0, 70),
          ratioCurrent: ratioCurrent.toFixed(2),
          missingKws: missingKws.slice(0, 5)
        });
      }
    }
  }
}

console.log(`Analyzed ${files.length} files, ${totalLessons} lessons, ${totalChallenges} challenges.`);
console.log(`Potential Cross-Contaminations: ${crossContaminations.length}`);
crossContaminations.forEach(cc => {
  console.log(`[CROSS] ${cc.lessonId} -> ${cc.challengeId} (ratioCurr=${cc.ratioCurrent}, inOtherOnly=${cc.inOtherOnly}): ${cc.question} (missing: ${cc.missingKws.join(', ')})`);
});

console.log(`\nPotential Low Coverage (<25%): ${lowCoverageChallenges.length}`);
lowCoverageChallenges.slice(0, 20).forEach(lc => {
  console.log(`[LOW] ${lc.lessonId} -> ${lc.challengeId} (ratioCurr=${lc.ratioCurrent}): ${lc.question} (missing: ${lc.missingKws.join(', ')})`);
});
