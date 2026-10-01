const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const part1 = require('./repair_rv_part1.cjs');
const part2 = require('./repair_rv_part2.cjs');

const allChallenges = {
  ...part1,
  ...part2
};

console.log("Total lessons loaded for Razonamiento Verbal:", Object.keys(allChallenges).length);

let totalCh = 0;
for (const k in allChallenges) {
  totalCh += allChallenges[k].length;
  if (allChallenges[k].length !== 10) {
    console.error(`ERROR: Lesson ${k} has ${allChallenges[k].length} challenges instead of 10!`);
    process.exit(1);
  }
}
console.log("Total challenges loaded:", totalCh);

const baseDir = 'SALIDA_KOTLIN/razonamiento_verbal';

for (let i = 1; i <= 8; i++) {
  const pad = String(i).padStart(2, '0');
  const filePath = path.join(baseDir, `RazonamientoVerbalSemana${pad}.kt`);
  const parsed = parseKotlinFileRobust(filePath);

  let newFileContent = `package razonamiento_verbal\n\nobject RazonamientoVerbalSemana${pad} {\n\n    val lessons = listOf(\n`;

  for (let lIdx = 0; lIdx < parsed.lessons.length; lIdx++) {
    const l = parsed.lessons[lIdx];
    const chList = allChallenges[l.id];

    if (!chList || chList.length !== 10) {
      console.error(`Error: Missing or invalid challenges for lesson ${l.id} in ${filePath}`);
      process.exit(1);
    }

    newFileContent += `        LessonNode(\n`;
    newFileContent += `            id = "${l.id}",\n`;
    newFileContent += `            subjectId = "${l.subjectId}",\n`;
    newFileContent += `            semana = ${l.semana},\n`;
    newFileContent += `            subtema = "${l.subtema}",\n`;
    newFileContent += `            title = "${l.title}",\n`;
    newFileContent += `            theory = LessonTheory(\n`;
    newFileContent += `                content = """${l.theory}""".trimIndent()\n`;
    newFileContent += `            ),\n`;
    newFileContent += `            challenges = listOf(\n`;

    for (let cIdx = 0; cIdx < chList.length; cIdx++) {
      const c = chList[cIdx];
      newFileContent += `                Challenge(\n`;
      newFileContent += `                    id = "${c.id}",\n`;
      newFileContent += `                    question = ${JSON.stringify(c.question)},\n`;
      newFileContent += `                    options = listOf(\n`;
      for (let oIdx = 0; oIdx < c.options.length; oIdx++) {
        const comma = oIdx < c.options.length - 1 ? ',' : '';
        newFileContent += `                        ${JSON.stringify(c.options[oIdx])}${comma}\n`;
      }
      newFileContent += `                    ),\n`;
      newFileContent += `                    correctIndex = ${c.correctIndex},\n`;
      newFileContent += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      const chComma = cIdx < chList.length - 1 ? ',' : '';
      newFileContent += `                )${chComma}\n`;
    }

    const lComma = lIdx < parsed.lessons.length - 1 ? ',' : '';
    newFileContent += `            )\n`;
    newFileContent += `        )${lComma}\n`;
  }

  newFileContent += `    )\n}\n`;

  fs.writeFileSync(filePath, newFileContent, 'utf8');
  console.log(`Updated ${filePath} successfully.`);
}

console.log("All 8 Razonamiento Verbal files updated successfully!");
