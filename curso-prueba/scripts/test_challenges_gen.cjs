const fs = require('fs');

function testTopic(filePath) {
  const c = fs.readFileSync(filePath, 'utf8');
  const lines = c.split('\n');

  // Extract Flashcards
  const flashcards = [];
  for (let i = 0; i < lines.length; i++) {
    const l = lines[i];
    const qMatch = l.match(/[*+-]?\s*\*\*Q:?\*\*\s*(.*)/i) || l.match(/[*+-]?\s*\*\*PREGUNTA\s*\d*:?\*\*\s*(.*)/i);
    if (qMatch) {
      let q = qMatch[1].trim();
      let a = '';
      for (let j = i + 1; j < Math.min(i + 6, lines.length); j++) {
        const aMatch = lines[j].match(/\*\*A:?\*\*\s*(.*)/i) || lines[j].match(/\*\*RESPUESTA:?\*\*\s*(.*)/i);
        if (aMatch) {
          a = aMatch[1].trim();
          break;
        }
      }
      if (q && a) flashcards.push({ q, a });
    }
  }

  // Extract Boss Challenge
  let boss = null;
  const jsonMatch = c.match(/```json\s*(\{[\s\S]*?\})\s*```/);
  if (jsonMatch) {
    try {
      const parsed = JSON.parse(jsonMatch[1]);
      if (parsed.boss_challenge) boss = parsed.boss_challenge;
    } catch(e) {}
  }

  console.log(`File: ${filePath.split('/').pop()}`);
  console.log(`Flashcards found: ${flashcards.length}`);
  flashcards.forEach((f, idx) => console.log(`   ${idx+1}. Q: ${f.q.slice(0, 60)}... -> A: ${f.a.slice(0, 40)}...`));
  if (boss) console.log(`Boss Challenge: ${boss.question.slice(0, 60)}...`);
}

testTopic("01_APTITUD_ACADEMICA/RAZONAMIENTO_MATEMATICO/TEMA_01_Razonamiento_Numerico.md");
testTopic("02_MATEMATICA/ARITMETICA/TEMA_01_Relaciones_Logicas_y_Conjuntos.md");
testTopic("04_CIENCIA_Y_TECNOLOGIA/FISICA/TEMA_01_Magnitudes_y_Vectores.md");
