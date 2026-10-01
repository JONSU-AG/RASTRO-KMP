const fs = require('fs');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

function balanceFile(filePath, targetCounts) {
  const p = parseKotlinFileRobust(filePath);
  
  // We want exactly 5 of 0, 5 of 1, 5 of 2, 5 of 3 across the 20 challenges
  // Target pattern for 20 challenges: [0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3, 0, 1, 2, 3]
  let idxPattern = [
    // Lesson 1 (10 challenges): 0, 1, 2, 3, 0, 1, 2, 3, 0, 1
    0, 1, 2, 3, 0, 1, 2, 3, 0, 1,
    // Lesson 2 (10 challenges): 2, 3, 0, 1, 2, 3, 0, 1, 2, 3 (wait: sum: zeros=5, ones=5, twos=5, threes=5)
    2, 3, 2, 3, 0, 1, 2, 3, 0, 1
  ];
  
  // Verify sum of idxPattern
  const testCounts = {0:0, 1:0, 2:0, 3:0};
  idxPattern.forEach(i => testCounts[i]++);
  
  let chGlobalIdx = 0;
  for (const l of p.lessons) {
    for (const c of l.challenges) {
      const desiredIdx = idxPattern[chGlobalIdx++];
      const currentIdx = c.correctIndex;
      if (desiredIdx !== currentIdx) {
        // Swap options so correct option moves to desiredIdx
        const correctOpt = c.options[currentIdx];
        c.options.splice(currentIdx, 1);
        c.options.splice(desiredIdx, 0, correctOpt);
        c.correctIndex = desiredIdx;
      }
    }
  }

  function cleanTripleQuotes(s) {
    return (s || "").replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '\\$');
  }

  const objName = filePath.split('/').pop().replace('.kt', '');
  let out = `package filosofia\n\nobject ${objName} {\n\n    val lessons = listOf(\n`;
  p.lessons.forEach((l, lIdx) => {
    out += `        LessonNode(\n`;
    out += `            id = "${l.id}",\n`;
    out += `            subjectId = "${l.subjectId}",\n`;
    out += `            semana = ${l.semana},\n`;
    out += `            subtema = "${l.subtema}",\n`;
    out += `            title = "${l.title}",\n`;
    out += `            theory = LessonTheory(\n`;
    out += `                content = """\n${cleanTripleQuotes(l.theory)}\n                """.trimIndent()\n`;
    out += `            ),\n`;
    out += `            challenges = listOf(\n`;
    l.challenges.forEach(c => {
      out += `                Challenge(\n`;
      out += `                    id = "${c.id}",\n`;
      out += `                    question = ${JSON.stringify(c.question)},\n`;
      out += `                    options = listOf(\n`;
      c.options.forEach(opt => {
        out += `                        ${JSON.stringify(opt)},\n`;
      });
      out += `                    ),\n`;
      out += `                    correctIndex = ${c.correctIndex},\n`;
      out += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      out += `                ),\n`;
    });
    out += `            )\n`;
    out += `        )${lIdx < p.lessons.length - 1 ? ',' : ''}\n`;
  });
  out += `    )\n}\n`;

  fs.writeFileSync(filePath, out, 'utf8');
}

balanceFile('SALIDA_KOTLIN/filosofia/FilosofiaSemana08.kt');
balanceFile('SALIDA_KOTLIN/filosofia/FilosofiaSemana09.kt');
console.log("Successfully balanced FilosofiaSemana08 and 09!");
