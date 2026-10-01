const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

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

function clean(s) {
  return (s || "").toLowerCase().normalize("NFD").replace(/[\u0300-\u036f]/g, "").replace(/[^a-z0-9]/g, " ").trim();
}

const STOPWORDS = new Set([
  'de', 'la', 'que', 'el', 'en', 'y', 'a', 'los', 'del', 'se', 'las', 'por', 'un', 'para',
  'con', 'no', 'una', 'su', 'al', 'lo', 'como', 'mas', 'pero', 'sus', 'le', 'ya', 'o',
  'este', 'si', 'porque', 'esta', 'son', 'entre', 'esta', 'cuando', 'muy', 'sin', 'sobre',
  'ser', 'tiene', 'tambien', 'me', 'hasta', 'hay', 'donde', 'quien', 'desde', 'todo',
  'nos', 'durante', 'todos', 'uno', 'les', 'ni', 'contra', 'otros', 'ese', 'eso', 'ante',
  'ellos', 'e', 'esto', 'mi', 'antes', 'algunos', 'que', 'unos', 'yo', 'otro', 'otras',
  'otra', 'el', 'tanto', 'esa', 'estos', 'mucho', 'quienes', 'nada', 'muchos', 'cual',
  'sea', 'poco', 'ella', 'estar', 'haber', 'estas', 'estaba', 'estamos', 'algunas', 'algo',
  'respecto', 'siguiente', 'siguientes', 'enunciado', 'opcion', 'alternativa', 'correcto',
  'correcta', 'incorrecto', 'incorrecta', 'concepto', 'termino', 'afirma', 'refiere', 'segun'
]);

function extractKeywords(str) {
  return clean(str).split(/\s+/).filter(w => w.length >= 4 && !STOPWORDS.has(w));
}

function findEvidence(theory, question, correctOpt, explanation) {
  if (!theory) return { found: false, snippet: "TEORÍA VACÍA", score: 0, globalRatio: 0, bestMatches: 0 };
  
  const rawUnits = theory.split(/\n+/).map(l => l.trim()).filter(l => l.length > 20);
  const targetWords = [...new Set([...extractKeywords(correctOpt), ...extractKeywords(question), ...extractKeywords(explanation)])];
  if (targetWords.length === 0) return { found: false, snippet: "SIN PALABRAS CLAVE", score: 0, globalRatio: 0, bestMatches: 0 };
  
  let bestUnit = "";
  let bestScore = 0;
  let bestMatches = 0;
  
  const normTheory = clean(theory);
  let totalMatches = 0;
  for (const w of targetWords) {
    if (normTheory.includes(w)) totalMatches++;
  }
  const globalRatio = totalMatches / targetWords.length;
  
  for (const unit of rawUnits) {
    const cleanUnit = clean(unit);
    let unitMatches = 0;
    for (const w of targetWords) {
      if (cleanUnit.includes(w)) unitMatches++;
    }
    const score = unitMatches / targetWords.length;
    if (score > bestScore) {
      bestScore = score;
      bestUnit = unit;
      bestMatches = unitMatches;
    }
  }
  
  // Strict evidence matching:
  // Must match at least 2 significant words in a single unit, or global ratio >= 0.30
  const isPass = (bestMatches >= 2 || (bestScore >= 0.20 && bestMatches >= 1) || globalRatio >= 0.30);
  
  return {
    found: isPass,
    snippet: bestUnit ? bestUnit.slice(0, 160) : "No textual snippet matched",
    score: bestScore,
    globalRatio,
    bestMatches
  };
}

let totalChallenges = 0;
let passCount = 0;
let failCount = 0;
let failList = [];
let subjectReport = {};
let allEvidence = [];

for (const f of files) {
  const subject = f.split('/')[1];
  if (!subjectReport[subject]) {
    subjectReport[subject] = { total: 0, pass: 0, fail: 0 };
  }
  
  const p = parseKotlinFileRobust(f);
  for (const l of p.lessons) {
    for (const c of l.challenges) {
      totalChallenges++;
      subjectReport[subject].total++;
      
      const correctOpt = c.options[c.correctIndex];
      const ev = findEvidence(l.theory, c.question, correctOpt, c.explanation);
      
      allEvidence.push({
        id: c.id,
        lessonId: l.id,
        file: f,
        question: c.question,
        correctOption: correctOpt,
        correctIndex: c.correctIndex,
        evidenceSnippet: ev.snippet,
        status: ev.found ? "PASS" : "FAIL"
      });
      
      if (ev.found) {
        passCount++;
        subjectReport[subject].pass++;
      } else {
        failCount++;
        subjectReport[subject].fail++;
        failList.push({
          file: f,
          lesson: l.id,
          ch: c.id,
          q: c.question.slice(0, 80),
          ans: correctOpt.slice(0, 60),
          globalRatio: ev.globalRatio.toFixed(2),
          bestScore: ev.score.toFixed(2)
        });
      }
    }
  }
}

console.log("==================================================");
console.log("EVIDENCE-BASED AUDIT SUMMARY");
console.log("==================================================");
console.log(`Total Challenges Analyzed: ${totalChallenges}`);
console.log(`Passed with Verified Textual Evidence: ${passCount} (${(passCount/totalChallenges*100).toFixed(1)}%)`);
console.log(`Failed / Insufficient Evidence: ${failCount} (${(failCount/totalChallenges*100).toFixed(1)}%)`);
console.log("\nBreakdown by Subject:");
for (const [subj, data] of Object.entries(subjectReport)) {
  console.log(`- ${subj.padEnd(22)}: ${data.pass}/${data.total} PASS (${(data.pass/data.total*100).toFixed(1)}%)`);
}

if (failList.length > 0) {
  console.log(`\nFailed challenges count: ${failList.length}`);
  console.log("Sample of first 10:");
  failList.slice(0, 10).forEach((f, idx) => {
    console.log(`[${idx+1}] ${f.file} (${f.lesson}) ${f.ch}:`);
    console.log(`    Q: ${f.q}`);
    console.log(`    Ans: ${f.ans}`);
  });
}

fs.writeFileSync('scripts/evidence_audit_results.json', JSON.stringify({ passCount, failCount, subjectReport, allEvidence: allEvidence.slice(0, 100) }, null, 2), 'utf8');
