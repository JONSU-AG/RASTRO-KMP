const fs = require('fs');
const path = require('path');

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');
}

function processSubject(config) {
  console.log(`Processing subject: ${config.id}`);
  const srcFiles = fs.readdirSync(config.srcDir).filter(f => f.startsWith('TEMA_') && f.endsWith('.md')).sort();

  srcFiles.forEach((file, idx) => {
    const weekNum = idx + 1;
    const weekStr = weekNum.toString().padStart(2, '0');
    const ktFile = path.resolve(`SALIDA_KOTLIN/${config.id}/${config.classNamePrefix}Semana${weekStr}.kt`);

    if (!fs.existsSync(ktFile)) {
      console.log(`Missing file: ${ktFile}`);
      return;
    }

    const mdContent = fs.readFileSync(path.join(config.srcDir, file), 'utf8');

    // Extract clean markdown title
    const titleMatch = mdContent.match(/^#\s+(.+)$/m);
    const cleanTitle = titleMatch ? titleMatch[1].replace(/TEMA\s+\d+:\s*/i, '').trim() : `Tema ${weekStr}`;

    // Split markdown theory
    // Look for ## 3. DESARROLLO TEÓRICO or ## 3. MARCO TEÓRICO
    let theoryText = mdContent;
    const sec3Idx = mdContent.search(/##\s+3\./);
    if (sec3Idx !== -1) {
      const sec4Idx = mdContent.search(/##\s+4\./);
      if (sec4Idx !== -1 && sec4Idx > sec3Idx) {
        theoryText = mdContent.slice(sec3Idx, sec4Idx);
      } else {
        theoryText = mdContent.slice(sec3Idx);
      }
    }

    // Split theory roughly into 2 lessons if possible
    const sub32Idx = theoryText.search(/###\s+3\.2/);
    let th1 = theoryText;
    let th2 = theoryText;
    let title1 = `${cleanTitle} - Parte 1`;
    let title2 = `${cleanTitle} - Parte 2`;

    if (sub32Idx !== -1) {
      th1 = theoryText.slice(0, sub32Idx).trim();
      th2 = theoryText.slice(sub32Idx).trim();
      const m1 = th1.match(/###\s+3\.1\.\s+([^\n]+)/);
      if (m1) title1 = m1[1].trim();
      const m2 = th2.match(/###\s+3\.2\.\s+([^\n]+)/);
      if (m2) title2 = m2[1].trim();
    } else {
      // split in half by paragraphs
      const paras = theoryText.split('\n\n');
      const mid = Math.floor(paras.length / 2);
      th1 = paras.slice(0, mid).join('\n\n');
      th2 = paras.slice(mid).join('\n\n');
    }

    // Read current Kotlin file
    let ktContent = fs.readFileSync(ktFile, 'utf8');

    // Fix package and object name if undefined
    ktContent = ktContent.replace('package undefined', `package ${config.pkg}`);
    ktContent = ktContent.replace('object undefined', `object ${config.classNamePrefix}Semana${weekStr}`);

    // If theory is undefined, replace with extracted theory
    // Match lesson 1 LessonTheory
    // We can regex replace the two LessonTheory blocks
    let count = 0;
    ktContent = ktContent.replace(/LessonTheory\(\s*title\s*=\s*(?:undefined|null|"[^"]*")\s*,\s*content\s*=\s*(?:undefined|null|"""[\s\S]*?""")\s*\)/g, (match) => {
      count++;
      if (count === 1) {
        return `LessonTheory(\n                title = ${JSON.stringify(title1)},\n                content = """${cleanTripleQuotes(th1)}"""\n            )`;
      } else {
        return `LessonTheory(\n                title = ${JSON.stringify(title2)},\n                content = """${cleanTripleQuotes(th2)}"""\n            )`;
      }
    });

    fs.writeFileSync(ktFile, ktContent, 'utf8');
    console.log(`Updated ${config.classNamePrefix}Semana${weekStr}.kt with real theory`);
  });
}

// Civica
processSubject({
  id: 'civica',
  pkg: 'civica',
  classNamePrefix: 'Civica',
  srcDir: '05_PERSONA_Y_FAMILIA/CIVICA'
});

// Lenguaje
processSubject({
  id: 'lenguaje',
  pkg: 'lenguaje',
  classNamePrefix: 'Lenguaje',
  srcDir: '06_COMUNICACION/LENGUAJE'
});

// Comprension Lectora
processSubject({
  id: 'comprension_lectora',
  pkg: 'comprension_lectora',
  classNamePrefix: 'ComprensionLectora',
  srcDir: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA'
});
