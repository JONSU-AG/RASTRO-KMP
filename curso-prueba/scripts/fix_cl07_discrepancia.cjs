const fs = require('fs');

const ktFile = 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana07.kt';
let text = fs.readFileSync(ktFile, 'utf8');

const rv05 = fs.readFileSync('01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_05_Razonamiento_Argumentativo_Basico.md', 'utf8');
const p33 = rv05.indexOf('### 3.3 El Punto de Discrepancia en Textos Dialécticos');
const pEnd = rv05.indexOf('## 7. ZONA DE TRAMPAS');
const sectionText = rv05.slice(p33, pEnd).trim();

// Find s01 LessonTheory
const s01Pos = text.indexOf('id = "cl_t07_s01"');
const theoryPos = text.indexOf('content = """', s01Pos);
const endTriple = text.indexOf('"""', theoryPos + 15);

const oldContent = text.slice(theoryPos + 'content = """'.length, endTriple);
const newContent = oldContent + '\n\n---\n\n' + sectionText.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');

text = text.slice(0, theoryPos + 'content = """'.length) + newContent + text.slice(endTriple);
fs.writeFileSync(ktFile, text, 'utf8');
console.log('Successfully enriched cl_t07_s01 with Punto de Discrepancia en Textos Dialécticos!');
