const fs = require('fs');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const source = fs.readFileSync('05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_01_Nociones_Preliminares_de_Filosofia.md', 'utf8');
const p = parseKotlinFileRobust('SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt');

// Lesson 1 should have: 3.1 + Section 4 (Características) + Section 5 + Section 6
const sec31 = source.indexOf('### 3.1. Etimología');
const sec32 = source.indexOf('### 3.2. El Origen Histórico');
const sec4 = source.indexOf('## 4. LEYES');
const sec7 = source.indexOf('## 7. 5 PROBLEMAS');

const theory1 = source.slice(sec31, sec32).trim() + "\n\n" + source.slice(sec4, sec7).trim();
const theory2 = source.slice(sec32, sec4).trim();

p.lessons[0].theory = theory1;
p.lessons[1].theory = theory2;

function cleanTripleQuotes(s) {
  return (s || "").replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '\\$');
}

let out = `package filosofia\n\nobject FilosofiaSemana01 {\n\n    val lessons = listOf(\n`;
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

fs.writeFileSync('SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt', out, 'utf8');
console.log("Successfully enriched FilosofiaSemana01.kt!");
