const fs = require('fs');

const ktFile = 'SALIDA_KOTLIN/comprension_lectora/ComprensionLectoraSemana07.kt';
let text = fs.readFileSync(ktFile, 'utf8');

const cl04 = fs.readFileSync('01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_04_Intencion_y_Proposito_del_Texto.md', 'utf8');
const p32 = cl04.indexOf('### 3.2 El Tono del Autor');
const pEnd = cl04.indexOf('## 5. MNEMOTECNIAS');
const sectionText = cl04.slice(p32, pEnd).trim();

// Find s01 LessonTheory
const s01Pos = text.indexOf('id = "cl_t07_s01"');
const theoryPos = text.indexOf('content = """', s01Pos);
const endTriple = text.indexOf('"""', theoryPos + 15);

const oldContent = text.slice(theoryPos + 'content = """'.length, endTriple);
const newContent = oldContent + '\n\n---\n\n' + sectionText.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');

text = text.slice(0, theoryPos + 'content = """'.length) + newContent + text.slice(endTriple);
fs.writeFileSync(ktFile, text, 'utf8');
console.log('Successfully enriched cl_t07_s01 with Tono del Autor!');
