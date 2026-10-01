const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// Stopwords in Spanish
const STOPWORDS = new Set([
  'de', 'la', 'que', 'el', 'en', 'y', 'a', 'los', 'del', 'se', 'las', 'por', 'un', 'para',
  'con', 'no', 'una', 'su', 'al', 'lo', 'como', 'más', 'pero', 'sus', 'le', 'ya', 'o',
  'este', 'sí', 'porque', 'esta', 'son', 'entre', 'está', 'cuando', 'muy', 'sin', 'sobre',
  'ser', 'tiene', 'también', 'me', 'hasta', 'hay', 'donde', 'quien', 'desde', 'todo',
  'nos', 'durante', 'todos', 'uno', 'les', 'ni', 'contra', 'otros', 'ese', 'eso', 'ante',
  'ellos', 'e', 'esto', 'mí', 'antes', 'algunos', 'qué', 'unos', 'yo', 'otro', 'otras',
  'otra', 'él', 'tanto', 'esa', 'estos', 'mucho', 'quienes', 'nada', 'muchos', 'cual',
  'sea', 'poco', 'ella', 'estar', 'haber', 'estas', 'estaba', 'estamos', 'algunas', 'algo',
  'nosotros', 'mi', 'mis', 'tú', 'te', 'ti', 'tu', 'tus', 'ellas', 'nosotras', 'vosotros',
  'vosotras', 'os', 'mío', 'mía', 'míos', 'mías', 'tuyo', 'tuya', 'tuyos', 'tuyas', 'suyo',
  'suya', 'suyos', 'suyas', 'nuestro', 'nuestra', 'nuestros', 'nuestras', 'vuestro', 'vuestra',
  'vuestros', 'vuestras', 'esos', 'esas', 'aquel', 'aquella', 'aquellos', 'aquellas', 'sido',
  'siendo', 'cuál', 'cuáles', 'cómo', 'según', 'cuyo', 'cuya', 'cuyos', 'cuyas', 'cada',
  'donde', 'cualquier', 'cualesquiera', 'respecto', 'siguiente', 'siguientes', 'enunciado',
  'enunciados', 'alternativa', 'opción', 'opciones', 'pregunta', 'texto', 'forma', 'término',
  'concepto', 'característica', 'características', 'correcto', 'correcta', 'incorrecto', 'incorrecta'
]);

function extractKeywords(str) {
  if (!str) return [];
  // normalize accents and lowercase
  return str.toLowerCase()
    .replace(/[.,\/#!$%\^&\*;:{}=\-_`~()?"'«»[\]]/g, ' ')
    .split(/\s+/)
    .filter(w => w.length >= 4 && !STOPWORDS.has(w));
}

function computeOverlap(tokensA, textB) {
  if (!tokensA.length || !textB) return 0;
  const lowerB = textB.toLowerCase();
  let matches = 0;
  for (const t of tokensA) {
    if (lowerB.includes(t)) matches++;
  }
  return matches / tokensA.length;
}

function walk(dir) {
  let res = [];
  for (const f of fs.readdirSync(dir)) {
    const full = path.join(dir, f);
    if (fs.statSync(full).isDirectory()) res = res.concat(walk(full));
    else if (f.endsWith(".kt") && !f.includes("Catalog")) res.push(full);
  }
  return res;
}

const files = walk("SALIDA_KOTLIN").sort();

let totalLessons = 0;
let totalChallenges = 0;
let titleMismatchCount = 0;
let crossContaminationCount = 0;
let unsupportedChallenges = 0;

let issues = [];
let auditedLessons = [];

for (const f of files) {
  const parsed = parseKotlinFileRobust(f);
  const lessons = parsed.lessons;
  totalLessons += lessons.length;

  for (let lIdx = 0; lIdx < lessons.length; lIdx++) {
    const currentLesson = lessons[lIdx];
    const otherLesson = lessons.length > 1 ? lessons[1 - lIdx] : null;

    const lTheory = currentLesson.theory || '';
    const otherTheory = otherLesson ? (otherLesson.theory || '') : '';

    // Title ↔ Theory check
    const titleTokens = extractKeywords(currentLesson.title);
    const titleOverlap = computeOverlap(titleTokens, lTheory);
    let titleMismatch = false;
    if (titleTokens.length >= 3 && titleOverlap < 0.25) {
      titleMismatch = true;
      titleMismatchCount++;
      issues.push({
        type: 'TITLE_THEORY_MISMATCH',
        file: f,
        lessonId: currentLesson.id,
        title: currentLesson.title,
        overlap: titleOverlap.toFixed(2),
        theoryLength: lTheory.length
      });
    }

    let lessonCrossCount = 0;
    let lessonUnsupportedCount = 0;

    for (const ch of currentLesson.challenges) {
      totalChallenges++;
      // Question + Correct Option tokens
      const correctOpt = ch.options[ch.correctIndex] || '';
      const chTokens = extractKeywords(ch.question + ' ' + correctOpt);

      const overlapCurrent = computeOverlap(chTokens, lTheory);
      const overlapOther = otherTheory ? computeOverlap(chTokens, otherTheory) : 0;

      // Cross lesson contamination: when it matches other lesson much better than current
      if (otherTheory && overlapOther >= 0.40 && overlapCurrent < 0.20) {
        crossContaminationCount++;
        lessonCrossCount++;
        issues.push({
          type: 'CROSS_LESSON_CONTAMINATION',
          file: f,
          lessonId: currentLesson.id,
          challengeId: ch.id,
          question: ch.question.slice(0, 70),
          overlapCurrent: overlapCurrent.toFixed(2),
          overlapOther: overlapOther.toFixed(2)
        });
      } else if (chTokens.length >= 4 && overlapCurrent < 0.15) {
        unsupportedChallenges++;
        lessonUnsupportedCount++;
        issues.push({
          type: 'UNSUPPORTED_CHALLENGE',
          file: f,
          lessonId: currentLesson.id,
          challengeId: ch.id,
          question: ch.question.slice(0, 70),
          overlapCurrent: overlapCurrent.toFixed(2)
        });
      }
    }

    auditedLessons.push({
      file: f,
      subject: f.split('/')[1],
      lessonId: currentLesson.id,
      title: currentLesson.title,
      challengeCount: currentLesson.challenges.length,
      theoryLength: lTheory.length,
      titleMismatch,
      crossContaminations: lessonCrossCount,
      unsupported: lessonUnsupportedCount,
      status: (titleMismatch || lessonCrossCount > 0 || lessonUnsupportedCount > 0) ? 'FAIL' : 'PASS'
    });
  }
}

console.log("=== STRICT ISOLATION AUDIT RESULTS ===");
console.log("Total Lessons Analyzed:", totalLessons);
console.log("Total Challenges Analyzed:", totalChallenges);
console.log("TITLE_THEORY_MISMATCH detected:", titleMismatchCount);
console.log("CROSS_LESSON_CONTAMINATION detected:", crossContaminationCount);
console.log("UNSUPPORTED_CHALLENGES detected:", unsupportedChallenges);
console.log("Total Issues:", issues.length);

if (issues.length > 0) {
  console.log("\nTop issues found:");
  issues.slice(0, 15).forEach((iss, i) => {
    console.log(`[${i+1}] ${iss.type} in ${iss.file} (${iss.lessonId || ''}):`);
    console.log(`    Detail: ${iss.title || iss.question || ''}`);
    if (iss.overlapCurrent !== undefined) console.log(`    overlapCurrent: ${iss.overlapCurrent} | overlapOther: ${iss.overlapOther || 'N/A'}`);
  });
}

fs.writeFileSync('scripts/audit_strict_issues.json', JSON.stringify({ issues, auditedLessons }, null, 2), 'utf8');
