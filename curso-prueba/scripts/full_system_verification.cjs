const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const ALL_20_SUBJECTS = [
  // Idiomas
  "ingles",
  // Biologia
  "biologia",
  // Letras / Humanidades / Sociales
  'civica',
  'comprension_lectora',
  'filosofia',
  'geografia',
  'historia_peru',
  'historia_universal',
  'lenguaje',
  'literatura',
  'psicologia',
  'razonamiento_verbal',
  // Ciencias / Matematica
  'razonamiento_matematico',
  'razonamiento_logico',
  'aritmetica',
  'algebra',
  'geometria',
  'trigonometria',
  'fisica',
  'quimica'
];

console.log("=== STARTING FULL SYSTEM VERIFICATION ===");

let stats = {
  subjectsCount: 0,
  catalogsCount: 0,
  weekFilesCount: 0,
  lessonNodesCount: 0,
  challengesCount: 0,
  shortTheories: [],
  wrongChallengeCounts: [],
  wrongOptionCounts: [],
  invalidCorrectIndexes: [],
  emptyExplanations: [],
  absurdDistractors: [],
  crossContaminationSuspects: []
};

// Absurd patterns from earlier audits
const absurdRegex = /\b(ángeles|magia|pociones|espejo mágico|mágica|cósmic[ao]s?|alienígenas|extraterrestres|fantasmas|monstruos|hadas|duendes|hechizos|superpoderes|brujos)\b/i;

for (const subj of ALL_20_SUBJECTS) {
  const dir = path.join('SALIDA_KOTLIN', subj);
  if (!fs.existsSync(dir)) {
    console.error(`ERROR: Missing subject directory: ${dir}`);
    continue;
  }
  stats.subjectsCount++;

  // Check catalog
  const catalogFiles = fs.readdirSync(dir).filter(f => f.includes('Catalog.kt'));
  if (catalogFiles.length === 0) {
    console.error(`ERROR: Missing Catalog in: ${dir}`);
  } else {
    stats.catalogsCount += catalogFiles.length;
  }

  // Week files
  const weekFiles = fs.readdirSync(dir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();
  stats.weekFilesCount += weekFiles.length;

  for (const wf of weekFiles) {
    const filePath = path.join(dir, wf);
    const parsed = parseKotlinFileRobust(filePath);

    for (const lesson of parsed.lessons) {
      stats.lessonNodesCount++;

      // Check theory depth (must be substantial study material, > 500 chars)
      if (!lesson.theory || lesson.theory.length < 500) {
        stats.shortTheories.push({ file: wf, lessonId: lesson.id, len: (lesson.theory || '').length });
      }

      // Check challenge count (strictly 10 or 12 in rare cases)
      if (lesson.challenges.length < 10) {
        stats.wrongChallengeCounts.push({ file: wf, lessonId: lesson.id, count: lesson.challenges.length });
      }

      const theoryLower = lesson.theory.toLowerCase();

      for (const ch of lesson.challenges) {
        stats.challengesCount++;

        // Options check
        if (ch.options.length !== 4) {
          stats.wrongOptionCounts.push({ chId: ch.id, count: ch.options.length });
        }

        // Correct index check
        if (typeof ch.correctIndex !== 'number' || ch.correctIndex < 0 || ch.correctIndex >= ch.options.length) {
          stats.invalidCorrectIndexes.push({ chId: ch.id, correctIndex: ch.correctIndex, optLen: ch.options.length });
        }

        // Explanation check
        if (!ch.explanation || ch.explanation.trim().length < 15) {
          stats.emptyExplanations.push({ chId: ch.id });
        }

        // Absurd distractor check (excluding philosophy/literature where mythology/angels can be valid topics)
        if (subj !== 'filosofia' && subj !== 'literatura') {
          for (const opt of ch.options) {
            if (absurdRegex.test(opt)) {
              stats.absurdDistractors.push({ chId: ch.id, option: opt });
            }
          }
        }
      }
    }
  }
}

console.log("\n========================================");
console.log("VERIFICATION METRICS SUMMARY");
console.log("========================================");
console.log(`Total Subjects: ${stats.subjectsCount} / 20`);
console.log(`Total Catalogs: ${stats.catalogsCount} / 20`);
console.log(`Total Week Files: ${stats.weekFilesCount}`);
console.log(`Total LessonNodes: ${stats.lessonNodesCount}`);
console.log(`Total Challenges: ${stats.challengesCount}`);
console.log(`Short Theories (<500 chars): ${stats.shortTheories.length}`);
console.log(`Lessons with <10 challenges: ${stats.wrongChallengeCounts.length}`);
console.log(`Challenges with != 4 options: ${stats.wrongOptionCounts.length}`);
console.log(`Invalid correctIndex: ${stats.invalidCorrectIndexes.length}`);
console.log(`Insufficient explanations (<15 chars): ${stats.emptyExplanations.length}`);
console.log(`Absurd distractors flagged: ${stats.absurdDistractors.length}`);

if (stats.shortTheories.length > 0) console.log("Short theories:", stats.shortTheories);
if (stats.wrongChallengeCounts.length > 0) console.log("Wrong challenge counts:", stats.wrongChallengeCounts);
if (stats.wrongOptionCounts.length > 0) console.log("Wrong option counts:", stats.wrongOptionCounts.slice(0, 5));
if (stats.invalidCorrectIndexes.length > 0) console.log("Invalid correct indexes:", stats.invalidCorrectIndexes);
if (stats.emptyExplanations.length > 0) console.log("Empty explanations:", stats.emptyExplanations.slice(0, 5));
if (stats.absurdDistractors.length > 0) console.log("Absurd distractors:", stats.absurdDistractors);

console.log("\nFULL SYSTEM VERIFICATION COMPLETE.");
