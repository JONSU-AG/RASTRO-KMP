const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// 1. Civica Semana 05
const civ05Source = fs.readFileSync('05_PERSONA_Y_FAMILIA/CIVICA/TEMA_05_Democracia_y_Sistema_Politico.md', 'utf8');
const p5 = parseKotlinFileRobust('SALIDA_KOTLIN/civica/CivicaSemana05.kt');

// Extract from "### E. Mecanismos Electorales" up to "## 7. PROBLEMAS RESUELTOS"
const startCiv5 = civ05Source.indexOf('### E. Mecanismos Electorales');
const endCiv5 = civ05Source.indexOf('## 7. PROBLEMAS RESUELTOS');
if (startCiv5 !== -1 && endCiv5 !== -1) {
  const fullCiv5Theory = civ05Source.slice(startCiv5, endCiv5).trim();
  p5.lessons[1].theory = fullCiv5Theory;
}

// 2. Civica Semana 06
const civ06Source = fs.readFileSync('05_PERSONA_Y_FAMILIA/CIVICA/TEMA_06_Derechos_Humanos_y_Garantias_Constitucionales.md', 'utf8');
const p6 = parseKotlinFileRobust('SALIDA_KOTLIN/civica/CivicaSemana06.kt');

// Extract from "### D. Las Seis Garantías Constitucionales" up to "## 7. PROBLEMAS RESUELTOS"
const startCiv6 = civ06Source.indexOf('### D. Las Seis Garantías Constitucionales');
const endCiv6 = civ06Source.indexOf('## 7. PROBLEMAS RESUELTOS');
if (startCiv6 !== -1 && endCiv6 !== -1) {
  const fullCiv6Theory = civ06Source.slice(startCiv6, endCiv6).trim();
  p6.lessons[1].theory = fullCiv6Theory;
}

function writeKotlin(filePath, objName, lessons) {
  let out = `package civica\n\nobject ${objName} {\n\n    val lessons = listOf(\n`;
  lessons.forEach((l, lIdx) => {
    out += `        LessonNode(\n`;
    out += `            id = "${l.id}",\n`;
    out += `            subjectId = "${l.subjectId}",\n`;
    out += `            semana = ${l.semana},\n`;
    out += `            subtema = "${l.subtema}",\n`;
    out += `            title = "${l.title}",\n`;
    out += `            theory = LessonTheory(\n`;
    out += `                content = """\n${l.theory.replace(/\\"/g, '"').replace(/\$/g, '\\$')}\n                """.trimIndent()\n`;
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
    out += `        )${lIdx < lessons.length - 1 ? ',' : ''}\n`;
  });
  out += `    )\n}\n`;
  fs.writeFileSync(filePath, out, 'utf8');
}

writeKotlin('SALIDA_KOTLIN/civica/CivicaSemana05.kt', 'CivicaSemana05', p5.lessons);
writeKotlin('SALIDA_KOTLIN/civica/CivicaSemana06.kt', 'CivicaSemana06', p6.lessons);

console.log("Successfully restored Civica 05 and 06 theories!");
