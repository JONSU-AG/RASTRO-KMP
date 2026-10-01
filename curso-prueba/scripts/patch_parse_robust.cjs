const fs = require('fs');
let code = fs.readFileSync('scripts/parse_kotlin_robust.cjs', 'utf8');

const oldLogic = `    // Theory
    let theoryContent = '';
    const theoryIdx = nodeText.indexOf('content = """');
    if (theoryIdx !== -1) {
      const startContent = theoryIdx + 'content = """'.length;
      const endContent = nodeText.indexOf('"""', startContent);
      if (endContent !== -1) {
        theoryContent = nodeText.slice(startContent, endContent);
      }
    }`;

const newLogic = `    // Theory
    let theoryContent = '';
    const tripleIdx = nodeText.indexOf('content = """');
    if (tripleIdx !== -1) {
      const startContent = tripleIdx + 'content = """'.length;
      const endContent = nodeText.indexOf('"""', startContent);
      if (endContent !== -1) {
        theoryContent = nodeText.slice(startContent, endContent);
      }
    } else {
      const singleMatch = nodeText.match(/content\\s*=\\s*"([\\s\\S]*?)"\\s*\\n\\s*\\)/);
      if (singleMatch) {
        theoryContent = singleMatch[1].replace(/\\\\n/g, '\\n').replace(/\\\\"/g, '"');
      }
    }`;

if (code.includes(oldLogic)) {
  code = code.replace(oldLogic, newLogic);
  fs.writeFileSync('scripts/parse_kotlin_robust.cjs', code, 'utf8');
  console.log("Successfully patched parse_kotlin_robust.cjs!");
} else {
  console.error("Could not find old logic in parse_kotlin_robust.cjs");
}
