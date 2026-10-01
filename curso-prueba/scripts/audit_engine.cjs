const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

function auditSubject(subjectDir) {
  const files = fs.readdirSync(subjectDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog'));
  const allLessons = [];
  const issues = [];
  let totalChallenges = 0;
  let defectiveChallenges = 0;
  let preservedChallenges = 0;

  for (const f of files) {
    const fullPath = path.join(subjectDir, f);
    const parsed = parseKotlinFileRobust(fullPath);
    for (const l of parsed.lessons) {
      allLessons.push({ ...l, file: f });
    }
  }

  const lessonIds = new Set();
  const challengeIds = new Set();

  for (const lesson of allLessons) {
    if (lessonIds.has(lesson.id)) {
      issues.push({ type: 'DUPLICATE_LESSON_ID', lessonId: lesson.id, file: lesson.file });
    }
    lessonIds.add(lesson.id);

    const theoryLower = lesson.theory.toLowerCase();

    for (const ch of lesson.challenges) {
      totalChallenges++;
      let isDefective = false;
      const chIssues = [];

      // 1. ID uniqueness
      if (challengeIds.has(ch.id)) {
        chIssues.push(`Duplicate challenge ID: ${ch.id}`);
        isDefective = true;
      }
      challengeIds.add(ch.id);

      // 2. Question empty
      if (!ch.question || ch.question.trim().length === 0) {
        chIssues.push('Empty question');
        isDefective = true;
      }

      // 3. Options validation
      if (ch.options.length !== 4) {
        chIssues.push(`Options count is ${ch.options.length} (expected 4)`);
        isDefective = true;
      }
      for (let i = 0; i < ch.options.length; i++) {
        if (!ch.options[i] || ch.options[i].trim().length === 0) {
          chIssues.push(`Empty option at index ${i}`);
          isDefective = true;
        }
      }
      // Exact duplicates (case-sensitive)
      const uniqueOpts = new Set(ch.options.map(o => o.trim()));
      if (uniqueOpts.size < ch.options.length) {
        chIssues.push('Duplicate exact options within challenge');
        isDefective = true;
      }

      // 4. Correct index
      if (ch.correctIndex < 0 || ch.correctIndex >= ch.options.length) {
        chIssues.push(`correctIndex ${ch.correctIndex} out of bounds`);
        isDefective = true;
      }

      // 5. Explanation validation
      if (!ch.explanation || ch.explanation.trim().length === 0) {
        chIssues.push('Empty explanation');
        isDefective = true;
      } else if (/^[-*•\s]*(\*\*)?Clave\s+Correcta(\*\*)?:\s*(\*\*)?[A-D](\*\*)?\s*$/i.test(ch.explanation.trim()) ||
                 /^[-*•\s]*(\*\*)?Respuesta(\*\*)?:\s*(\*\*)?[A-D](\*\*)?\s*$/i.test(ch.explanation.trim()) ||
                 /^[-*•\s]*(\*\*)?Resolución(\*\*)?:?\s*$/i.test(ch.explanation.trim()) ||
                 /^[-*•\s]*(\*\*)?Resolución\s+Paso\s+a\s+Paso(\*\*)?:?\s*$/i.test(ch.explanation.trim())) {
        chIssues.push('Explanation is empty / only "Clave Correcta X" or empty header without rationale');
        isDefective = true;
      }

      // 6. Mechanical repetition patterns
      if (/Respecto a los contenidos curriculares/i.test(ch.question) ||
          /el concepto definido como:?\s*"/i.test(ch.question) ||
          /corresponde formalmente a:/i.test(ch.question) ||
          /De conformidad con el marco teórico curricular/i.test(ch.explanation) ||
          ch.options.some(o => /Postulado complementario de análisis/i.test(o)) ||
          ch.options.some(o => /^Concepto Clave de /i.test(o))) {
        chIssues.push('Mechanically generated template question / explanation / option');
        isDefective = true;
      }

      // 7. Mnemonic garbage options
      const mnemonicWords = ['hombres', 'bastones', 'ven', 'ignorantes', 'populares', 'peticiones', 'inoterra'];
      for (const opt of ch.options) {
        if (mnemonicWords.includes(opt.trim().toLowerCase())) {
          chIssues.push(`Option uses mnemonic keyword as academic answer: "${opt}"`);
          isDefective = true;
        }
      }

      // 8. Truncations
      if (ch.question.trim().endsWith(':') && !ch.question.includes('\n') && ch.question.length < 80 &&
          (ch.question.toLowerCase().includes('diálogo') ||
           ch.question.toLowerCase().includes('estrofa') ||
           ch.question.toLowerCase().includes('fragmento') ||
           ch.question.toLowerCase().includes('siguiente texto') ||
           ch.question.toLowerCase().includes('siguiente estructura'))) {
        chIssues.push('Suspiciously truncated question missing quoted text/dialogue');
        isDefective = true;
      }
      if (/(\.\.\.\.|\.\.\."|\.\.\.\*)/.test(ch.question) && !ch.question.includes('complete la oración')) {
        chIssues.push('Question contains truncation ellipses (.... or trailing ...)');
        isDefective = true;
      }
      if (/(\.\.\.\.|\.\.\."|\.\.\.\*)/.test(ch.explanation)) {
        chIssues.push('Explanation contains truncation ellipses');
        isDefective = true;
      }

      // 9. Lesson 4.1 Filosofía regression check (Falacias in lesson without Falacias in theory)
      if (lesson.id === 'filo_t04_s01' && /ad hominem|ad baculum|ad verecundiam|falacia/i.test(ch.question)) {
        chIssues.push('filo_t04_s01 Regression: Falacias asked in Principios Lógicos lesson without theory backing');
        isDefective = true;
      }

      if (isDefective) {
        defectiveChallenges++;
        issues.push({
          file: lesson.file,
          lessonId: lesson.id,
          challengeId: ch.id,
          reasons: chIssues,
          questionPreview: ch.question.slice(0, 80)
        });
      } else {
        preservedChallenges++;
      }
    }
  }

  return {
    subjectDir,
    totalLessons: allLessons.length,
    totalChallenges,
    preservedChallenges,
    defectiveChallenges,
    issues
  };
}

module.exports = { parseKotlinFileRobust, auditSubject };

if (require.main === module) {
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

  console.log('=== AUDITORÍA COMPLETA ROBUSTA DE SALIDA_KOTLIN ===\n');
  let globalTotal = 0;
  let globalPreserved = 0;
  let globalDefective = 0;

  for (const s of subjects) {
    const res = auditSubject(path.join('SALIDA_KOTLIN', s));
    globalTotal += res.totalChallenges;
    globalPreserved += res.preservedChallenges;
    globalDefective += res.defectiveChallenges;

    console.log(`[${s.toUpperCase()}]`);
    console.log(`  Lecciones: ${res.totalLessons}`);
    console.log(`  Challenges Totales: ${res.totalChallenges}`);
    console.log(`  Conservados (Válidos): ${res.preservedChallenges}`);
    console.log(`  Defectuosos: ${res.defectiveChallenges}`);
    if (res.defectiveChallenges > 0) {
      console.log(`  Muestra de problemas:`);
      for (let i = 0; i < Math.min(3, res.issues.length); i++) {
        console.log(`    - [${res.issues[i].challengeId || res.issues[i].lessonId}] in ${res.issues[i].file}: ${res.issues[i].reasons ? res.issues[i].reasons.join('; ') : res.issues[i].type}`);
      }
    }
    console.log('');
  }

  console.log(`=== TOTALES GLOBALES ===`);
  console.log(`Total Challenges en SALIDA_KOTLIN: ${globalTotal}`);
  console.log(`Total Conservados Válidos: ${globalPreserved}`);
  console.log(`Total Defectuosos a Reparar/Reemplazar: ${globalDefective}`);
}
