const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const part1 = require('./repair_cl_part1.cjs');
const part2 = require('./repair_cl_part2.cjs');

const allChallenges = { ...part1, ...part2 };
console.log("Total CL lessons with new challenges:", Object.keys(allChallenges).length);

const clDir = path.resolve('SALIDA_KOTLIN/comprension_lectora');
const files = fs.readdirSync(clDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();

let totalApplied = 0;

for (const f of files) {
  const filePath = path.join(clDir, f);
  const parsed = parseKotlinFileRobust(filePath);
  let updatedAny = false;

  const newLessons = parsed.lessons.map(lesson => {
    if (allChallenges[lesson.id]) {
      const rep = allChallenges[lesson.id];
      totalApplied += rep.length;
      updatedAny = true;
      return {
        ...lesson,
        challenges: rep
      };
    }
    return lesson;
  });

  if (updatedAny) {
    let out = `package ${parsed.packageName}\n\n`;
    out += `import com.clase.app.data.model.LessonNode\n`;
    out += `import com.clase.app.data.model.LessonTheory\n`;
    out += `import com.clase.app.data.model.Challenge\n\n`;
    out += `object ${parsed.objectName} {\n`;
    out += `    val lessons: List<LessonNode> = listOf(\n`;

    const lessonsStr = newLessons.map(l => {
      let lStr = `        LessonNode(\n`;
      lStr += `            id = ${JSON.stringify(l.id)},\n`;
      lStr += `            title = ${JSON.stringify(l.title)},\n`;
      lStr += `            theory = LessonTheory(\n`;
      lStr += `                title = ${JSON.stringify(l.theory.title)},\n`;
      lStr += `                content = ${JSON.stringify(l.theory.content)}\n`;
      lStr += `            ),\n`;
      lStr += `            challenges = listOf(\n`;

      const chStr = l.challenges.map(c => {
        let cStr = `                Challenge(\n`;
        cStr += `                    id = ${JSON.stringify(c.id)},\n`;
        cStr += `                    question = ${JSON.stringify(c.question)},\n`;
        cStr += `                    options = listOf(\n`;
        cStr += c.options.map(opt => `                        ${JSON.stringify(opt)}`).join(',\n') + '\n';
        cStr += `                    ),\n`;
        cStr += `                    correctIndex = ${c.correctIndex},\n`;
        cStr += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
        cStr += `                )`;
        return cStr;
      }).join(',\n');

      lStr += chStr + '\n';
      lStr += `            )\n`;
      lStr += `        )`;
      return lStr;
    }).join(',\n');

    out += lessonsStr + '\n';
    out += `    )\n`;
    out += `}\n`;

    fs.writeFileSync(filePath, out, 'utf8');
    console.log(`Updated ${f}`);
  }
}

console.log("Finished applying Comprension Lectora challenges! Total applied:", totalApplied);
