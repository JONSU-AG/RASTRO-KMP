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

const map = {};
const details = [];

for (const file of files) {
  const p = parseKotlinFileRobust(file);
  const lessons = p.lessons;
  const rel = path.relative('SALIDA_KOTLIN', file);

  for (let i = 0; i < lessons.length; i++) {
    const currentLesson = lessons[i];
    const otherLessons = lessons.filter((_, idx) => idx !== i);
    const currentTheoryNorm = currentLesson.theory.toLowerCase();
    const otherTheoriesNorm = otherLessons.map(l => l.theory.toLowerCase()).join(' ');

    for (const c of currentLesson.challenges) {
      const correctOpt = c.options[c.correctIndex] || '';
      const targetText = `${c.question} ${correctOpt}`;
      const kws = extractKeywords(targetText);

      let inCurrent = 0;
      let inOtherOnly = 0;
      const missing = [];

      for (const kw of kws) {
        if (currentTheoryNorm.includes(kw)) {
          inCurrent++;
        } else if (otherTheoriesNorm.includes(kw)) {
          inOtherOnly++;
          missing.push(kw);
        }
      }

      const ratioCurrent = kws.length > 0 ? (inCurrent / kws.length) : 1;

      if (inOtherOnly >= 3 && ratioCurrent < 0.35) {
        if (!map[rel]) map[rel] = 0;
        map[rel]++;
        details.push({
          rel,
          lessonId: currentLesson.id,
          chId: c.id,
          q: c.question.slice(0, 60),
          ratioCurrent: ratioCurrent.toFixed(2),
          inOtherOnly,
          missing: missing.slice(0, 5)
        });
      }
    }
  }
}

console.log("Files with serious cross-contamination count:", Object.keys(map).length);
for (const [k, v] of Object.entries(map)) {
  console.log(`${k.padEnd(60)}: ${v} challenges`);
}

fs.writeFileSync('scripts/cross_contaminations_details.json', JSON.stringify(details, null, 2));
