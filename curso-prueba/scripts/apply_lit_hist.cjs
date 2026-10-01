const fs = require('fs');
const path = require('path');

function applyRepair(scriptName, subjectDir) {
  const challenges = require(scriptName);
  const dir = path.resolve("SALIDA_KOTLIN/" + subjectDir);
  const files = fs.readdirSync(dir).filter(f => f.endsWith(".kt") && !f.includes("Catalog")).sort();

  for (const f of files) {
    const full = path.join(dir, f);
    let content = fs.readFileSync(full, "utf8");

    // Replace challenges for each lesson
    for (const [lessonId, chList] of Object.entries(challenges)) {
      if (content.includes(`id = "${lessonId}"`)) {
        const lIdx = content.indexOf(`id = "${lessonId}"`);
        const chStart = content.indexOf("challenges = listOf(", lIdx);
        if (chStart === -1) continue;

        let depth = 0;
        let endIdx = -1;
        for (let i = chStart + "challenges = listOf".length; i < content.length; i++) {
          if (content[i] === "(") depth++;
          else if (content[i] === ")") {
            depth--;
            if (depth === 0) {
              endIdx = i;
              break;
            }
          }
        }

        if (endIdx !== -1) {
          const chStr = "challenges = listOf(\n" + chList.map(c => {
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
          }).join(',\n') + "\n            )";

          content = content.slice(0, chStart) + chStr + content.slice(endIdx + 1);
        }
      }
    }

    fs.writeFileSync(full, content, "utf8");
    console.log(`Applied repairs to ${f}`);
  }
}

applyRepair(path.resolve("scripts/repair_literatura.cjs"), "literatura");
applyRepair(path.resolve("scripts/repair_historia_peru.cjs"), "historia_peru");
applyRepair(path.resolve("scripts/repair_historia_universal.cjs"), "historia_universal");
