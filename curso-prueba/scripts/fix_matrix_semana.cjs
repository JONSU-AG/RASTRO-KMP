const fs = require('fs');
let content = fs.readFileSync('SALIDA_KOTLIN/MATRIZ_LESSONNODE.md', 'utf8');

// Replace "Semana 00" by parsing the lesson ID in each row
content = content.replace(/\| (Semana 00) \| `([a-z]+_t(\d+)_s\d+)`/g, (m, sem, id, num) => {
  return `| Semana ${num.padStart(2, '0')} | \`${id}\``;
});

fs.writeFileSync('SALIDA_KOTLIN/MATRIZ_LESSONNODE.md', content, 'utf8');
console.log('Fixed week numbers in MATRIZ_LESSONNODE.md');
