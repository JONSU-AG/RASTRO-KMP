const fs = require('fs');
const file = 'SALIDA_KOTLIN/psicologia/PsicologiaSemana10.kt';
let text = fs.readFileSync(file, 'utf8');

const targetStr = `                    options = listOf(
                        "Memoria procedimental, memoria semántica y memoria episódica según el modelo de Tulving.",
                        "Memoria Sensorial (MS), Memoria a Corto Plazo (MCP / de trabajo) y Memoria a Largo Plazo (MLP).",
                        "Memoria fotográfica, memoria verbal y memoria afectiva involuntaria.",
                        "Memoria declarativa explícita, memoria implícita no asociativa y memoria refleja."
                    ),`;

const chIdx = text.indexOf('psi_t10_s02_c04');
const optStart = text.indexOf('options = listOf(', chIdx);
const correctIdx = text.indexOf('correctIndex =', chIdx);

if (optStart !== -1 && correctIdx !== -1) {
  text = text.slice(0, optStart) + targetStr + '\n                    ' + text.slice(correctIdx);
  fs.writeFileSync(file, text, 'utf8');
  console.log('Successfully cleaned psi_t10_s02_c04!');
} else {
  console.error('Could not find indices!');
}
