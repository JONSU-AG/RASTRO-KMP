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

const allLessons = [];

for (const file of files) {
  const p = parseKotlinFileRobust(file);
  const rel = path.relative('SALIDA_KOTLIN', file);
  p.lessons.forEach((l, idx) => {
    allLessons.push({
      file: rel,
      subj: p.lessons[0].subjectId,
      semana: l.semana,
      lessonId: l.id,
      title: l.title,
      theoryTitle: l.theory ? l.theory.title : '',
      theoryLen: l.theory ? l.theory.length : 0,
      challengesCount: l.challenges.length,
      sampleQ: l.challenges.slice(0, 3).map(c => c.question.slice(0, 60))
    });
  });
}

console.log(`Extracted ${allLessons.length} lessons from ${files.length} files.`);
fs.writeFileSync('scripts/all_lessons_summary.json', JSON.stringify(allLessons, null, 2));
