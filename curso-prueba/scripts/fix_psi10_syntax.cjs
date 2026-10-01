const fs = require('fs');
const file = 'SALIDA_KOTLIN/psicologia/PsicologiaSemana10.kt';
let text = fs.readFileSync(file, 'utf8');

const badSnippet = `options = listOf(                        "Memoria procedimental, memoria semántica y memoria episódica según el modelo de Tulving.",                        "Memoria Sensorial (MS), Memoria a Corto Plazo (MCP / de trabajo) y Memoria a Largo Plazo (MLP).",                        "Memoria fotográfica, memoria verbal y memoria afectiva involuntaria.",                        "Memoria declarativa explícita, memoria implícita no asociativa y memoria refleja."                    ), Memoria a Corto Plazo (MCP / de trabajo) y Memoria a Largo Plazo (MLP).",                        "Memoria visual, memoria táctil y memoria digestiva.",                        "Memoria infantil, memoria adolescente y memoria senil.",                    ),`;

const goodSnippet = `options = listOf(
                        "Memoria procedimental, memoria semántica y memoria episódica según el modelo de Tulving.",
                        "Memoria Sensorial (MS), Memoria a Corto Plazo (MCP / de trabajo) y Memoria a Largo Plazo (MLP).",
                        "Memoria fotográfica, memoria verbal y memoria afectiva involuntaria.",
                        "Memoria declarativa explícita, memoria implícita no asociativa y memoria refleja."
                    ),`;

text = text.replace(badSnippet, goodSnippet);
fs.writeFileSync(file, text, 'utf8');
console.log('Fixed Psi 10 syntax error!');
