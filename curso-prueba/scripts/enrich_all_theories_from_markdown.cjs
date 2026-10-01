const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

const SUBJECT_MAP = {
  civica: '05_PERSONA_Y_FAMILIA/CIVICA',
  comprension_lectora: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA',
  filosofia: '05_PERSONA_Y_FAMILIA/FILOSOFIA',
  geografia: '03_CIENCIAS_SOCIALES/GEOGRAFIA',
  historia_peru: '03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU',
  historia_universal: '03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL',
  lenguaje: '06_COMUNICACION/LENGUAJE',
  literatura: '06_COMUNICACION/LITERATURA',
  psicologia: '05_PERSONA_Y_FAMILIA/PSICOLOGIA',
  razonamiento_verbal: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL'
};

function cleanTripleQuotes(s) {
  return (s || "").replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '\\$');
}

function writeKotlin(filePath, objName, pkgName, lessons) {
  let out = `package ${pkgName}\n\nobject ${objName} {\n\n    val lessons = listOf(\n`;
  lessons.forEach((l, lIdx) => {
    out += `        LessonNode(\n`;
    out += `            id = "${l.id}",\n`;
    out += `            subjectId = "${l.subjectId}",\n`;
    out += `            semana = ${l.semana},\n`;
    out += `            subtema = "${l.subtema}",\n`;
    out += `            title = "${l.title}",\n`;
    out += `            theory = LessonTheory(\n`;
    out += `                content = """\n${cleanTripleQuotes(l.theory)}\n                """.trimIndent()\n`;
    out += `            ),\n`;
    out += `            challenges = listOf(\n`;
    l.challenges.forEach(c => {
      out += `                Challenge(\n`;
      out += `                    id = "${c.id}",\n`;
      out += `                    question = ${JSON.stringify(c.question)},\n`;
      out += `                    options = listOf(\n`;
      c.options.forEach(opt => {
        out += `                        ${JSON.stringify(opt)},\n`;
      });
      out += `                    ),\n`;
      out += `                    correctIndex = ${c.correctIndex},\n`;
      out += `                    explanation = ${JSON.stringify(c.explanation)}\n`;
      out += `                ),\n`;
    });
    out += `            )\n`;
    out += `        )${lIdx < lessons.length - 1 ? ',' : ''}\n`;
  });
  out += `    )\n}\n`;
  fs.writeFileSync(filePath, out, 'utf8');
}

let totalProcessed = 0;

for (const [subj, srcDir] of Object.entries(SUBJECT_MAP)) {
  if (!fs.existsSync(srcDir)) continue;
  const ktFiles = fs.readdirSync('SALIDA_KOTLIN/' + subj)
    .filter(f => f.endsWith('.kt') && !f.includes('Catalog'))
    .sort();
  const mdFiles = fs.readdirSync(srcDir)
    .filter(f => f.startsWith('TEMA_') && f.endsWith('.md'))
    .sort();

  console.log(`Processing subject ${subj}: ${ktFiles.length} files...`);

  for (let idx = 0; idx < ktFiles.length; idx++) {
    const ktFile = ktFiles[idx];
    const mdFile = mdFiles[idx];
    if (!mdFile) continue;

    // Do NOT overwrite already perfected regression cases unless needed:
    // GeografiaSemana08, PsicologiaSemana13, FilosofiaSemana09, FilosofiaSemana08
    if (ktFile === 'GeografiaSemana08.kt' || ktFile === 'PsicologiaSemana13.kt' || ktFile === 'FilosofiaSemana09.kt' || ktFile === 'FilosofiaSemana08.kt') {
      console.log(`  Skipping manual regression file: ${ktFile}`);
      continue;
    }

    const ktPath = path.join('SALIDA_KOTLIN', subj, ktFile);
    const mdPath = path.join(srcDir, mdFile);

    const parsed = parseKotlinFileRobust(ktPath);
    const mdContent = fs.readFileSync(mdPath, 'utf8');

    // Find theory boundaries in markdown
    // Starts around "## 3. " or "### 3.1" or "## DESARROLLO TEÓRICO"
    let theoryStart = -1;
    const startMatches = [
      mdContent.indexOf('## 3.'),
      mdContent.indexOf('### 3.1'),
      mdContent.indexOf('## DESARROLLO TEÓRICO'),
      mdContent.indexOf('### A.')
    ];
    for (const m of startMatches) {
      if (m !== -1 && (theoryStart === -1 || m < theoryStart)) theoryStart = m;
    }
    if (theoryStart === -1) theoryStart = 0;

    // Ends around "## 7. PROBLEMAS" or "## 7." or "## 5 PROBLEMAS"
    let theoryEnd = -1;
    const endMatches = [
      mdContent.indexOf('## 7. PROBLEMAS'),
      mdContent.indexOf('## 7. '),
      mdContent.indexOf('## 7.\n'),
      mdContent.indexOf('## 5 PROBLEMAS'),
      mdContent.indexOf('## 8. GLOSARIO')
    ];
    for (const m of endMatches) {
      if (m !== -1 && (theoryEnd === -1 || m < theoryEnd)) theoryEnd = m;
    }
    if (theoryEnd === -1) theoryEnd = mdContent.length;

    const fullTheory = mdContent.slice(theoryStart, theoryEnd).trim();

    if (parsed.lessons.length === 2) {
      // Find midpoint split
      // Look for second major section like "### 3.2", "### 3.3", "### C.", "### D.", "## 4."
      const halfLen = Math.floor(fullTheory.length * 0.45);
      const searchWindow = fullTheory.slice(halfLen);
      const splitMatch = searchWindow.match(/(?:###\s+(?:3\.[2345]|C\.|D\.|E\.)|##\s+4\.)/);
      
      let splitIdx = -1;
      if (splitMatch) {
        splitIdx = halfLen + splitMatch.index;
      } else {
        // Fallback to closest paragraph break
        const paraMatch = searchWindow.match(/\n\n/);
        splitIdx = paraMatch ? halfLen + paraMatch.index : Math.floor(fullTheory.length / 2);
      }

      const t1 = fullTheory.slice(0, splitIdx).trim();
      const t2 = fullTheory.slice(splitIdx).trim();

      // Only update if extracted theory is substantial (>1000 chars)
      if (t1.length >= 1000 && t2.length >= 1000) {
        parsed.lessons[0].theory = t1;
        parsed.lessons[1].theory = t2;

        const objName = ktFile.replace('.kt', '');
        writeKotlin(ktPath, objName, subj, parsed.lessons);
        totalProcessed++;
      }
    } else if (parsed.lessons.length === 1) {
      if (fullTheory.length >= 1000) {
        parsed.lessons[0].theory = fullTheory;
        const objName = ktFile.replace('.kt', '');
        writeKotlin(ktPath, objName, subj, parsed.lessons);
        totalProcessed++;
      }
    }
  }
}

console.log(`Enrichment complete! Total files updated: ${totalProcessed}`);
