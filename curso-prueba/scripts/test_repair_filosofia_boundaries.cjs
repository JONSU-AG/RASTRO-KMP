const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const mdDir = '05_PERSONA_Y_FAMILIA/FILOSOFIA';
const ktDir = 'SALIDA_KOTLIN/filosofia';

const mdFiles = fs.readdirSync(mdDir).filter(f => f.endsWith('.md')).sort();
const ktFiles = fs.readdirSync(ktDir).filter(f => f.endsWith('.kt') && !f.includes('Catalog')).sort();

console.log(`Found ${ktFiles.length} files in Filosofia.`);

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

for (let w = 0; w < ktFiles.length; w++) {
  const ktFile = ktFiles[w];
  const mdFile = mdFiles[w];
  const p = parseKotlinFileRobust(path.join(ktDir, ktFile));
  const md = fs.readFileSync(path.join(mdDir, mdFile), 'utf8');

  // Let's inspect week 1 as a test
  if (w === 0) {
    console.log(`=== Testing ${ktFile} <---> ${mdFile} ===`);
    // Find sections in md
    const chunks = md.split(/(?=^###?\s+)/gm);
    console.log(`Split into ${chunks.length} chunks.`);

    const s01Chunks = [];
    const s02Chunks = [];

    const s01Kws = p.lessons[0].challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`));
    const s02Kws = p.lessons[1].challenges.flatMap(c => extractKeywords(`${c.question} ${c.options[c.correctIndex]}`));

    for (const ch of chunks) {
      const firstLine = ch.trim().split('\n')[0];
      const chNorm = ch.toLowerCase();

      let m1 = 0;
      let m2 = 0;
      for (const kw of s01Kws) if (chNorm.includes(kw)) m1++;
      for (const kw of s02Kws) if (chNorm.includes(kw)) m2++;

      // Ignore game JSON block
      if (firstLine.includes('GAMIFICACIÓN') || firstLine.includes('JSON')) continue;

      if (m1 > m2) {
        s01Chunks.push(ch);
      } else if (m2 > m1) {
        s02Chunks.push(ch);
      } else if (m1 > 0 && m1 === m2) {
        // Both match equally: assign based on primary theme
        s01Chunks.push(ch);
      }
    }

    console.log(`s01 chunks: ${s01Chunks.length}, s02 chunks: ${s02Chunks.length}`);
    s01Chunks.forEach(c => console.log('  s01 chunk:', c.trim().split('\n')[0]));
    s02Chunks.forEach(c => console.log('  s02 chunk:', c.trim().split('\n')[0]));
  }
}
