const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const subjectDirs = {
  'civica': '05_PERSONA_Y_FAMILIA/CIVICA',
  'comprension_lectora': '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA',
  'filosofia': '05_PERSONA_Y_FAMILIA/FILOSOFIA',
  'geografia': '03_CIENCIAS_SOCIALES/GEOGRAFIA',
  'historia_peru': '03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU',
  'historia_universal': '03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL',
  'lenguaje': '06_COMUNICACION/LENGUAJE',
  'literatura': '06_COMUNICACION/LITERATURA',
  'psicologia': '05_PERSONA_Y_FAMILIA/PSICOLOGIA',
  'razonamiento_verbal': '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL'
};

const stopwords = new Set([
  'de', 'la', 'el', 'en', 'y', 'a', 'los', 'del', 'las', 'con', 'por', 'un', 'para',
  'una', 'es', 'al', 'lo', 'como', 'más', 'o', 'pero', 'sus', 'le', 'ha', 'me', 'si',
  'sin', 'sobre', 'este', 'ya', 'entre', 'cuando', 'todo', 'esta', 'ser', 'son', 'dos',
  'también', 'fue', 'era', 'muy', 'hasta', 'desde', 'está', 'mi', 'porque', 'qué',
  'solo', 'han', 'yo', 'hay', 'vez', 'puede', 'todos', 'así', 'nos', 'ni', 'parte',
  'tiene', 'él', 'uno', 'donde', 'bien', 'tiempo', 'mismo', 'ese', 'ahora', 'cada',
  'e', 'vida', 'otro', 'después', 'te', 'otros', 'aunque', 'esa', 'eso', 'hace', 'otra'
]);

function extractKeywords(text) {
  if (!text) return [];
  const words = text.toLowerCase()
    .replace(/[«»""''.,;:()\[\]{}!?¿¡\/\-_*#+]/g, ' ')
    .split(/\s+/)
    .filter(w => w.length >= 4 && !stopwords.has(w));
  return Array.from(new Set(words));
}

// Test on Razonamiento Verbal Semana 06
const p = parseKotlinFileRobust('SALIDA_KOTLIN/razonamiento_verbal/RazonamientoVerbalSemana06.kt');
const md = fs.readFileSync('01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md', 'utf8');

// Split md into sections by ###
const sections = md.split(/(?=^###\s+)/gm);
console.log(`Markdown split into ${sections.length} sections.`);

for (let sIdx = 0; sIdx < sections.length; sIdx++) {
  const sec = sections[sIdx];
  const firstLine = sec.split('\n')[0];
  const secNorm = sec.toLowerCase();

  let s01Matches = 0;
  let s02Matches = 0;

  for (const c of p.lessons[0].challenges) {
    const kws = extractKeywords(`${c.question} ${c.options[c.correctIndex]}`);
    for (const kw of kws) {
      if (secNorm.includes(kw)) s01Matches++;
    }
  }

  for (const c of p.lessons[1].challenges) {
    const kws = extractKeywords(`${c.question} ${c.options[c.correctIndex]}`);
    for (const kw of kws) {
      if (secNorm.includes(kw)) s02Matches++;
    }
  }

  console.log(`Sec ${sIdx}: "${firstLine.slice(0, 60)}" -> s01Matches: ${s01Matches}, s02Matches: ${s02Matches}`);
}
