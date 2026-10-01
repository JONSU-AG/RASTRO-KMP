const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// Seeded pseudo-random generator for reproducible shuffling
function createPRNG(seed) {
  let s = seed % 2147483647;
  if (s <= 0) s += 2147483646;
  return function() {
    s = (s * 16807) % 2147483647;
    return (s - 1) / 2147483646;
  };
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
console.log("Total Kotlin content files to balance:", files.length);

let totalReordered = 0;
let grandDist = { 0: 0, 1: 0, 2: 0, 3: 0 };

for (let fileIdx = 0; fileIdx < files.length; fileIdx++) {
  const filePath = files[fileIdx];
  const parsed = parseKotlinFileRobust(filePath);
  const prng = createPRNG(fileIdx * 1000 + 777);

  // We want to balance targets for the challenges in this file
  let allFileChallenges = [];
  for (const l of parsed.lessons) {
    allFileChallenges.push(...l.challenges);
  }

  const N = allFileChallenges.length;
  if (N === 0) continue;

  let targetSlots = [];
  for (let i = 0; i < N; i++) {
    targetSlots.push(i % 4);
  }
  // Shuffle targetSlots
  for (let i = targetSlots.length - 1; i > 0; i--) {
    const j = Math.floor(prng() * (i + 1));
    const temp = targetSlots[i];
    targetSlots[i] = targetSlots[j];
    targetSlots[j] = temp;
  }

  let slotIdx = 0;

  const newLessons = parsed.lessons.map(lesson => {
    const newChallenges = lesson.challenges.map(ch => {
      const origCorrectIdx = ch.correctIndex;
      const correctOption = ch.options[origCorrectIdx];
      const targetIdx = targetSlots[slotIdx++];

      const distractors = ch.options.filter((_, idx) => idx !== origCorrectIdx);
      for (let i = distractors.length - 1; i > 0; i--) {
        const j = Math.floor(prng() * (i + 1));
        const temp = distractors[i];
        distractors[i] = distractors[j];
        distractors[j] = temp;
      }

      const newOptions = [];
      let distractorIdx = 0;
      for (let pos = 0; pos < 4; pos++) {
        if (pos === targetIdx) {
          newOptions.push(correctOption);
        } else {
          newOptions.push(distractors[distractorIdx++]);
        }
      }

      totalReordered++;
      grandDist[targetIdx]++;

      return {
        ...ch,
        options: newOptions,
        correctIndex: targetIdx
      };
    });

    return {
      ...lesson,
      challenges: newChallenges
    };
  });

  // Read existing file to preserve theory content and headers
  let content = fs.readFileSync(filePath, 'utf8');

  // Replace each Challenge block individually without touching LessonTheory!
  let chGlobalIdx = 0;
  let allFlattened = [];
  newLessons.forEach(l => allFlattened.push(...l.challenges));

  // Regex replace Challenge(...)
  content = content.replace(/Challenge\s*\(\s*id\s*=\s*"([^"]+)"[\s\S]*?explanation\s*=\s*"([^"]+)"\s*\)/g, (match, id) => {
    const ch = allFlattened.find(c => c.id === id);
    if (!ch) return match;

    let cStr = `Challenge(\n`;
    cStr += `                    id = ${JSON.stringify(ch.id)},\n`;
    cStr += `                    question = ${JSON.stringify(ch.question)},\n`;
    cStr += `                    options = listOf(\n`;
    cStr += ch.options.map(opt => `                        ${JSON.stringify(opt)}`).join(',\n') + '\n';
    cStr += `                    ),\n`;
    cStr += `                    correctIndex = ${ch.correctIndex},\n`;
    cStr += `                    explanation = ${JSON.stringify(ch.explanation)}\n`;
    cStr += `                )`;
    return cStr;
  });

  fs.writeFileSync(filePath, content, 'utf8');
}

console.log("\nFinished global correctIndex balancing safely without altering LessonTheory!");
console.log("Total Challenges reordered:", totalReordered);
console.log("Grand Distribution:", grandDist);
