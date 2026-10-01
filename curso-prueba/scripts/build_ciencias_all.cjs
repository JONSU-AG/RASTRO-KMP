const fs = require('fs');
const path = require('path');

const STEM_SUBJECTS = [
  {
    id: 'razonamiento_matematico',
    pkg: 'razonamiento_matematico',
    classNamePrefix: 'RazonamientoMatematico',
    prefix: 'rm',
    srcDir: '01_APTITUD_ACADEMICA/RAZONAMIENTO_MATEMATICO'
  },
  {
    id: 'razonamiento_logico',
    pkg: 'razonamiento_logico',
    classNamePrefix: 'RazonamientoLogico',
    prefix: 'rl',
    srcDir: '01_APTITUD_ACADEMICA/RAZONAMIENTO_LOGICO'
  },
  {
    id: 'aritmetica',
    pkg: 'aritmetica',
    classNamePrefix: 'Aritmetica',
    prefix: 'arit',
    srcDir: '02_MATEMATICA/ARITMETICA'
  },
  {
    id: 'algebra',
    pkg: 'algebra',
    classNamePrefix: 'Algebra',
    prefix: 'alg',
    srcDir: '02_MATEMATICA/ALGEBRA'
  },
  {
    id: 'geometria',
    pkg: 'geometria',
    classNamePrefix: 'Geometria',
    prefix: 'geom',
    srcDir: '02_MATEMATICA/GEOMETRIA'
  },
  {
    id: 'trigonometria',
    pkg: 'trigonometria',
    classNamePrefix: 'Trigonometria',
    prefix: 'trig',
    srcDir: '02_MATEMATICA/TRIGONOMETRIA'
  },
  {
    id: 'fisica',
    pkg: 'fisica',
    classNamePrefix: 'Fisica',
    prefix: 'fis',
    srcDir: '04_CIENCIA_Y_TECNOLOGIA/FISICA'
  },
  {
    id: 'quimica',
    pkg: 'quimica',
    classNamePrefix: 'Quimica',
    prefix: 'quim',
    srcDir: '04_CIENCIA_Y_TECNOLOGIA/QUIMICA'
  }
];

function sanitizeForKotlin(str) {
  if (!str) return '';
  return str
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\$/g, '')
    .replace(/\r/g, '')
    .replace(/\n/g, ' ')
    .trim();
}

function sanitizeTripleQuotes(str) {
  if (!str) return '';
  return str
    .replace(/"""/g, '\"\"\"')
    .replace(/\$/g, '')
    .replace(/\r/g, '');
}

function parseTopicFile(filePath) {
  const content = fs.readFileSync(filePath, 'utf8');
  const lines = content.split('\n');

  // Title extraction
  let rawTitle = 'Tema General';
  for (const l of lines) {
    if (l.startsWith('# ')) {
      rawTitle = l.replace(/^#\s+/, '').trim();
      break;
    }
  }
  const cleanTitle = rawTitle
    .replace(/^TEMA\s+[0-9IVXLCDM]+[:·\s-]*/i, '')
    .trim();

  // Split into H2 sections
  const sections = [];
  let curSec = null;
  for (let i = 0; i < lines.length; i++) {
    const l = lines[i];
    if (l.startsWith('## ')) {
      if (curSec) sections.push(curSec);
      curSec = { header: l.replace(/^##\s+/, '').trim(), lines: [] };
    } else if (curSec) {
      curSec.lines.push(l);
    }
  }
  if (curSec) sections.push(curSec);

  // Categorize sections
  const categorized = {
    overview: [],
    theory: [],
    formulas: [],
    mnemo: [],
    hacking: [],
    traps: [],
    real_world: [],
    exercises: [],
    glossary: [],
    flashcards: [],
    gamification: []
  };

  for (const sec of sections) {
    const norm = sec.header.toUpperCase();
    if (norm.includes('FICHA') || norm.includes('MAPA') || norm.includes('RESUMEN EJECUTIVO')) {
      categorized.overview.push(sec);
    } else if (norm.includes('TEÓRICO') || norm.includes('TEORICO') || norm.includes('BASE TEÓRICA') || norm.includes('MARCO')) {
      categorized.theory.push(sec);
    } else if (norm.includes('FORMULARIO') || norm.includes('FÓRMULAS') || norm.includes('FORMULAS') || norm.includes('LEYES') || norm.includes('SISTEMA DE UNIDADES') || norm.includes('RADIACTIVIDAD') || norm.includes('TABLA PERIODICA') || norm.includes('VARIACIÓN PERIÓDICA') || norm.includes('FUERZA DE ENLACES') || norm.includes('RADICALES') || norm.includes('AGENTES REDOX') || norm.includes('MASAS ATÓMICAS') || norm.includes('GASES REALES') || norm.includes('DENSIDAD') || norm.includes('CONSTANTE K') || norm.includes('INDICADORES') || norm.includes('ELECTRODOS') || norm.includes('PROPIEDADES FÍSICAS') || norm.includes('REACTIVOS')) {
      categorized.formulas.push(sec);
    } else if (norm.includes('MNEMOTECNIA') || norm.includes('NEMOTECNIA')) {
      categorized.mnemo.push(sec);
    } else if (norm.includes('TÉCNICA') || norm.includes('TECNICA') || norm.includes('ARTIFICIO') || norm.includes('HACKING')) {
      categorized.hacking.push(sec);
    } else if (norm.includes('TRAMPA') || norm.includes('ERROR') || norm.includes('DISTRACTOR')) {
      categorized.traps.push(sec);
    } else if (norm.includes('MUNDO REAL') || norm.includes('DECO') || norm.includes('CONEXIÓN') || norm.includes('APLICACIÓN') || norm.includes('MULTIDISCIPLINARIA')) {
      categorized.real_world.push(sec);
    } else if (norm.includes('EJERCICIO') || norm.includes('PROBLEMA') || norm.includes('PREGUNTA') || norm.includes('AUTOEVALUACIÓN')) {
      categorized.exercises.push(sec);
    } else if (norm.includes('GLOSARIO')) {
      categorized.glossary.push(sec);
    } else if (norm.includes('FLASHCARD')) {
      categorized.flashcards.push(sec);
    } else if (norm.includes('GAMIFICA')) {
      categorized.gamification.push(sec);
    } else {
      // Default to theory if contains substantial text
      categorized.theory.push(sec);
    }
  }

  // Parse Solved Problems from exercises
  const problems = [];
  let curP = null;
  for (const exSec of categorized.exercises) {
    for (let i = 0; i < exSec.lines.length; i++) {
      const l = exSec.lines[i];
      if (/^###\s+(?:Ejercicio|Problema|Nivel|Pregunta)/i.test(l)) {
        if (curP && curP.question && curP.options.length >= 2) problems.push(curP);
        curP = {
          title: l.replace(/^#+\s+/, '').trim(),
          question: '',
          options: [],
          key: '',
          exp: ''
        };
        continue;
      }
      if (curP) {
        if (/\*\*Enunciado.*?\*\*:\s*(.*)/i.test(l)) {
          curP.question = l.replace(/.*?\*\*Enunciado.*?\*\*:\s*/i, '').trim();
        } else if (!curP.question && l.trim() && !l.startsWith('#') && !/^[-*]?\s*[A-E]\)/.test(l.trim())) {
          curP.question = l.trim();
        }
        const optMatch = l.trim().match(/^[-*]?\s*([A-E])\)\s*(.+)/);
        if (optMatch) {
          curP.options.push({ letter: optMatch[1], text: optMatch[2].trim() });
        }
        const keyMatch = l.match(/\*\*(?:Respuesta|Clave|Clave Correcta)\*\*:\s*\*?\*?([A-E])\*?\*?/i);
        if (keyMatch) {
          curP.key = keyMatch[1];
        }
        if (/\*\*(?:Resolución|Sustento|Explicación)/i.test(l)) {
          curP.exp = l.replace(/.*?\*\*(?:Resolución|Sustento|Explicación)[^:]*\*\*:\s*/i, '').trim();
        } else if (curP.exp && l.trim() && !l.startsWith('#') && !/^[-*]?\s*[A-E]\)/.test(l.trim())) {
          curP.exp += ' ' + l.trim();
        }
      }
    }
  }
  if (curP && curP.question && curP.options.length >= 2) problems.push(curP);

  // Parse Flashcards
  const flashcards = [];
  for (const fSec of categorized.flashcards) {
    for (let i = 0; i < fSec.lines.length; i++) {
      const l = fSec.lines[i];
      const qMatch = l.match(/[*+-]?\s*\*\*Q\d*:?\*\*\s*(.*)/i) || l.match(/[*+-]?\s*\*\*PREGUNTA\s*\d*:?\*\*\s*(.*)/i);
      if (qMatch) {
        let q = qMatch[1].trim();
        let a = '';
        for (let j = i + 1; j < Math.min(i + 8, fSec.lines.length); j++) {
          const aMatch = fSec.lines[j].match(/\*\*A\d*:?\*\*\s*(.*)/i) || fSec.lines[j].match(/\*\*RESPUESTA:?\*\*\s*(.*)/i);
          if (aMatch) {
            a = aMatch[1].trim();
            break;
          }
        }
        if (q && a) flashcards.push({ q, a });
      }
    }
  }

  // Parse Gamification JSON
  let gamiQuestions = [];
  for (const gSec of categorized.gamification) {
    const raw = gSec.lines.join('\n');
    const jsonMatch = raw.match(/```json\s*(\{[\s\S]*?\})\s*```/);
    if (jsonMatch) {
      try {
        const parsed = JSON.parse(jsonMatch[1]);
        if (Array.isArray(parsed.preguntas)) {
          for (const p of parsed.preguntas) {
            if (p.enunciado && Array.isArray(p.opciones)) {
              gamiQuestions.push({
                question: p.enunciado,
                options: p.opciones.slice(0, 4),
                correctIndex: typeof p.respuesta_correcta === 'number' ? p.respuesta_correcta % 4 : 0,
                exp: p.explicacion || p.justificacion || 'Respuesta justificada por el marco teórico del tema.'
              });
            }
          }
        } else if (parsed.boss_challenge && parsed.boss_challenge.question && Array.isArray(parsed.boss_challenge.options)) {
          gamiQuestions.push({
            question: parsed.boss_challenge.question,
            options: parsed.boss_challenge.options.slice(0, 4),
            correctIndex: typeof parsed.boss_challenge.correct_index === 'number' ? parsed.boss_challenge.correct_index % 4 : 0,
            exp: parsed.boss_challenge.explanation || 'Demostración de alto nivel preuniversitario.'
          });
        }
      } catch (e) {}
    }
  }

  // Parse Glossary
  const glossaryItems = [];
  for (const gSec of categorized.glossary) {
    for (const l of gSec.lines) {
      const m = l.match(/^\d+\.\s+\*\*([^*]+)\*\*:\s*(.*)/) || l.match(/^-\s+\*\*([^*]+)\*\*:\s*(.*)/);
      if (m) {
        glossaryItems.push({ term: m[1].trim(), definition: m[2].trim() });
      }
    }
  }

  // Parse Traps
  const trapItems = [];
  for (const tSec of categorized.traps) {
    let curTrap = '';
    for (const l of tSec.lines) {
      if (l.startsWith('### ') || l.startsWith('* ') || l.startsWith('- ')) {
        if (curTrap.length > 20) trapItems.push(curTrap.trim());
        curTrap = l.replace(/^#+\s+/, '').replace(/^[-*]\s+/, '').trim();
      } else if (curTrap) {
        curTrap += ' ' + l.trim();
      }
    }
    if (curTrap.length > 20) trapItems.push(curTrap.trim());
  }

  return {
    cleanTitle,
    rawTitle,
    categorized,
    problems,
    flashcards,
    gamiQuestions,
    glossaryItems,
    trapItems
  };
}

console.log('Parser functions defined.');

function createChallengeFromProblem(p, id) {
  let opts = p.options.map(o => o.text);
  if (opts.length < 4) {
    opts = ['Opción A válida', 'Opción B válida', 'Opción C válida', 'Opción D válida'];
  } else {
    opts = opts.slice(0, 4);
  }
  let correctIndex = 0;
  if (p.key) {
    const idx = 'ABCD'.indexOf(p.key.toUpperCase());
    if (idx !== -1) correctIndex = idx;
  }
  return {
    id,
    question: p.question || 'Calcule el valor solicitado según el enunciado.',
    options: opts,
    correctIndex,
    explanation: p.exp || 'Resolución conforme a las leyes y métodos expuestos en la teoría de la lección.'
  };
}

function createChallengeFromFlashcard(fc, id, altAnswers, targetIndex) {
  const correct = fc.a.replace(/^A\d*:\s*/i, '').trim();
  const distractors = altAnswers.filter(a => a !== correct).slice(0, 3);
  while (distractors.length < 3) {
    distractors.push(`Valor o condición no aplicable al caso planteado`);
  }
  
  const options = [];
  let dIdx = 0;
  for (let i = 0; i < 4; i++) {
    if (i === targetIndex) {
      options.push(correct);
    } else {
      options.push(distractors[dIdx++] || 'Opción alternativa');
    }
  }

  return {
    id,
    question: fc.q.replace(/^Q\d*:\s*/i, '').trim(),
    options,
    correctIndex: targetIndex,
    explanation: `Conforme a la fundamentación teórica de la lección: ${correct}`
  };
}

function createChallengeFromGlossary(item, id, otherTerms, targetIndex) {
  const options = [];
  const distractors = otherTerms.filter(t => t !== item.term).slice(0, 3);
  while (distractors.length < 3) {
    distractors.push(`Concepto complementario de orden secundario`);
  }
  let dIdx = 0;
  for (let i = 0; i < 4; i++) {
    if (i === targetIndex) {
      options.push(item.term);
    } else {
      options.push(distractors[dIdx++] || 'Concepto afín');
    }
  }
  return {
    id,
    question: `La siguiente definición: "${item.definition}", corresponde formalmente al concepto de:`,
    options,
    correctIndex: targetIndex,
    explanation: `En el marco teórico de la lección se define estrictamente "${item.term}" como: ${item.definition}`
  };
}

function createChallengeFromTrap(trapText, id, targetIndex) {
  const cleanTrap = trapText.replace(/\*\*/g, '').slice(0, 180);
  const correctStatement = `Identificar la restricción teórica formal y evitar asumir propiedades no universales.`;
  const distractors = [
    `Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.`,
    `Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.`,
    `Ignorar las condiciones de contorno e igualar variables arbitrariamente.`
  ];
  const options = [];
  let dIdx = 0;
  for (let i = 0; i < 4; i++) {
    if (i === targetIndex) {
      options.push(correctStatement);
    } else {
      options.push(distractors[dIdx++] || 'Error común');
    }
  }
  return {
    id,
    question: `Frente al distractor frecuente de examen: "${cleanTrap}", el procedimiento analítico riguroso exige:`,
    options,
    correctIndex: targetIndex,
    explanation: `La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta.`
  };
}

function buildLessonNodeChallenges(prefix, weekStr, subNum, rawItems, lessonTheoryText) {
  const challenges = [];
  const targetIndices = [0, 1, 2, 3, 0, 1, 2, 3, 0, 1]; // Balanced distribution

  const { problems, flashcards, gamiQuestions, glossaryItems, trapItems } = rawItems;
  const allFcAnswers = flashcards.map(f => f.a);
  const allGlossaryTerms = glossaryItems.map(g => g.term);

  let pIdx = 0;
  let fIdx = 0;
  let gIdx = 0;
  let glIdx = 0;
  let tIdx = 0;

  for (let c = 1; c <= 10; c++) {
    const chId = `${prefix}_t${weekStr}_s0${subNum}_c${c.toString().padStart(2, '0')}`;
    const targetIdx = targetIndices[c - 1];

    if (c <= 3 && pIdx < problems.length) {
      challenges.push(createChallengeFromProblem(problems[pIdx++], chId));
    } else if (fIdx < flashcards.length) {
      challenges.push(createChallengeFromFlashcard(flashcards[fIdx++], chId, allFcAnswers, targetIdx));
    } else if (gIdx < gamiQuestions.length) {
      const g = gamiQuestions[gIdx++];
      challenges.push({
        id: chId,
        question: g.question,
        options: g.options.length >= 4 ? g.options.slice(0, 4) : [...g.options, 'Ninguna de las anteriores'],
        correctIndex: g.correctIndex,
        explanation: g.exp
      });
    } else if (glIdx < glossaryItems.length) {
      challenges.push(createChallengeFromGlossary(glossaryItems[glIdx++], chId, allGlossaryTerms, targetIdx));
    } else if (tIdx < trapItems.length) {
      challenges.push(createChallengeFromTrap(trapItems[tIdx++], chId, targetIdx));
    } else {
      // Fallback: conceptual challenge from theory
      const correctText = `Principio formal deducido a partir de las leyes y definiciones de la presente lección.`;
      const dist = [
        `Suposición que contradice las definiciones de la lección`,
        `Fórmula con signos invertidos o exponentes incompatibles`,
        `Relación empírica sin sustento en el marco conceptual`
      ];
      const opts = [];
      let dCount = 0;
      for (let i = 0; i < 4; i++) {
        if (i === targetIdx) opts.push(correctText);
        else opts.push(dist[dCount++] || 'Distractor conceptual');
      }
      challenges.push({
        id: chId,
        question: `En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?`,
        options: opts,
        correctIndex: targetIdx,
        explanation: `Se deduce directamente del desarrollo teórico formal y los axiomas de la lección.`
      });
    }
  }

  return challenges;
}

console.log('Challenge building functions ready.');

function formatChallengeKotlin(c) {
  let out = `                Challenge(\n`;
  out += `                    id = "${c.id}",\n`;
  out += `                    question = "${sanitizeForKotlin(c.question)}",\n`;
  out += `                    options = listOf(\n`;
  c.options.forEach((opt, idx) => {
    out += `                        "${sanitizeForKotlin(opt)}"${idx < c.options.length - 1 ? ',' : ''}\n`;
  });
  out += `                    ),\n`;
  out += `                    correctIndex = ${c.correctIndex},\n`;
  out += `                    explanation = "${sanitizeForKotlin(c.explanation)}"\n`;
  out += `                )`;
  return out;
}

function processSubject(subj) {
  console.log(`\n========================================`);
  console.log(`Processing Subject: ${subj.id} (${subj.srcDir})`);
  console.log(`========================================`);

  const outDir = path.join('SALIDA_KOTLIN', subj.pkg);
  if (!fs.existsSync(outDir)) {
    fs.mkdirSync(outDir, { recursive: true });
  }

  const files = fs.readdirSync(subj.srcDir).filter(f => f.endsWith('.md')).sort();
  console.log(`Found ${files.length} markdown topics.`);

  const weekClassNames = [];

  for (let idx = 0; idx < files.length; idx++) {
    const f = files[idx];
    const weekNum = idx + 1;
    const weekStr = weekNum.toString().padStart(2, '0');
    const className = `${subj.classNamePrefix}Semana${weekStr}`;
    weekClassNames.push(className);

    const fPath = path.join(subj.srcDir, f);
    const parsed = parseTopicFile(fPath);

    // Theory splitting
    const overviewText = parsed.categorized.overview.map(s => `## ${s.header}\n` + s.lines.join('\n')).join('\n\n');
    
    // Theory lines splitting
    const allTheoryLines = [];
    for (const sec of parsed.categorized.theory) {
      allTheoryLines.push(`### ${sec.header}`);
      allTheoryLines.push(...sec.lines);
    }
    const midT = Math.floor(allTheoryLines.length / 2);
    const theoryPart1 = allTheoryLines.slice(0, midT).join('\n');
    const theoryPart2 = allTheoryLines.slice(midT).join('\n');

    // Formulas splitting
    const allFormulaLines = [];
    for (const sec of parsed.categorized.formulas) {
      allFormulaLines.push(`### ${sec.header}`);
      allFormulaLines.push(...sec.lines);
    }
    const midF = Math.floor(allFormulaLines.length / 2);
    const formulasPart1 = allFormulaLines.slice(0, midF).join('\n');
    const formulasPart2 = allFormulaLines.slice(midF).join('\n');

    // Hacking & Mnemo
    const mnemoText = parsed.categorized.mnemo.map(s => `### ${s.header}\n` + s.lines.join('\n')).join('\n\n');
    const hackingText = parsed.categorized.hacking.map(s => `### ${s.header}\n` + s.lines.join('\n')).join('\n\n');
    const trapsText = parsed.categorized.traps.map(s => `### ${s.header}\n` + s.lines.join('\n')).join('\n\n');
    const realWorldText = parsed.categorized.real_world.map(s => `### ${s.header}\n` + s.lines.join('\n')).join('\n\n');

    // Glossary split
    const midG = Math.floor(parsed.glossaryItems.length / 2);
    const glossaryPart1 = parsed.glossaryItems.slice(0, midG).map(g => `- **${g.term}:** ${g.definition}`).join('\n');
    const glossaryPart2 = parsed.glossaryItems.slice(midG).map(g => `- **${g.term}:** ${g.definition}`).join('\n');

    // Build Theory 1
    let t1 = `## 1. MARCO CONCEPTUAL Y ONTOLOGÍA\n${overviewText}\n\n`;
    t1 += `## 2. DESARROLLO TEÓRICO FORMAL - PARTE I\n${theoryPart1}\n\n`;
    if (formulasPart1) t1 += `## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE\n${formulasPart1}\n\n`;
    if (glossaryPart1) t1 += `## 4. GLOSARIO DE CONCEPTOS PRIMARIOS\n${glossaryPart1}\n\n`;

    // Build Theory 2
    let t2 = `## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II\n${theoryPart2}\n\n`;
    if (formulasPart2 || hackingText || mnemoText) {
      t2 += `## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO\n${formulasPart2}\n\n${hackingText}\n\n${mnemoText}\n\n`;
    }
    if (trapsText) t2 += `## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN\n${trapsText}\n\n`;
    if (realWorldText) t2 += `## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO\n${realWorldText}\n\n`;
    if (glossaryPart2) t2 += `## 5. GLOSARIO DE CONCEPTOS AVANZADOS\n${glossaryPart2}\n\n`;

    // Split challenges items
    const midProb = Math.ceil(parsed.problems.length / 2);
    const problems1 = parsed.problems.slice(0, midProb);
    const problems2 = parsed.problems.slice(midProb);

    const midFc = Math.ceil(parsed.flashcards.length / 2);
    const flashcards1 = parsed.flashcards.slice(0, midFc);
    const flashcards2 = parsed.flashcards.slice(midFc);

    const midGami = Math.ceil(parsed.gamiQuestions.length / 2);
    const gami1 = parsed.gamiQuestions.slice(0, midGami);
    const gami2 = parsed.gamiQuestions.slice(midGami);

    const midTrap = Math.ceil(parsed.trapItems.length / 2);
    const traps1 = parsed.trapItems.slice(0, midTrap);
    const traps2 = parsed.trapItems.slice(midTrap);

    const items1 = {
      problems: problems1,
      flashcards: flashcards1,
      gamiQuestions: gami1,
      glossaryItems: parsed.glossaryItems.slice(0, midG),
      trapItems: traps1
    };

    const items2 = {
      problems: problems2,
      flashcards: flashcards2,
      gamiQuestions: gami2,
      glossaryItems: parsed.glossaryItems.slice(midG),
      trapItems: traps2
    };

    const challenges1 = buildLessonNodeChallenges(subj.prefix, weekStr, '1', items1, t1);
    const challenges2 = buildLessonNodeChallenges(subj.prefix, weekStr, '2', items2, t2);

    const title1 = `${parsed.cleanTitle} - Fundamentos y Leyes Principales`;
    const title2 = `${parsed.cleanTitle} - Propiedades Avanzadas, Artificios y Aplicaciones`;

    let kt = `package ${subj.pkg}\n\n`;
    kt += `import com.clase.app.data.model.LessonNode\n`;
    kt += `import com.clase.app.data.model.LessonTheory\n`;
    kt += `import com.clase.app.data.model.Challenge\n\n`;
    kt += `object ${className} {\n`;
    kt += `    val lessons: List<LessonNode> = listOf(\n`;
    kt += `        LessonNode(\n`;
    kt += `            id = "${subj.prefix}_t${weekStr}_s01",\n`;
    kt += `            title = "${sanitizeForKotlin(title1)}",\n`;
    kt += `            theory = LessonTheory(\n`;
    kt += `                title = "${sanitizeForKotlin(title1)}",\n`;
    kt += `                content = """${sanitizeTripleQuotes(t1)}"""\n`;
    kt += `            ),\n`;
    kt += `            challenges = listOf(\n`;
    challenges1.forEach((ch, cIdx) => {
      kt += formatChallengeKotlin(ch) + (cIdx < challenges1.length - 1 ? ',\n' : '\n');
    });
    kt += `            )\n`;
    kt += `        ),\n`;
    kt += `        LessonNode(\n`;
    kt += `            id = "${subj.prefix}_t${weekStr}_s02",\n`;
    kt += `            title = "${sanitizeForKotlin(title2)}",\n`;
    kt += `            theory = LessonTheory(\n`;
    kt += `                title = "${sanitizeForKotlin(title2)}",\n`;
    kt += `                content = """${sanitizeTripleQuotes(t2)}"""\n`;
    kt += `            ),\n`;
    kt += `            challenges = listOf(\n`;
    challenges2.forEach((ch, cIdx) => {
      kt += formatChallengeKotlin(ch) + (cIdx < challenges2.length - 1 ? ',\n' : '\n');
    });
    kt += `            )\n`;
    kt += `        )\n`;
    kt += `    )\n`;
    kt += `}\n`;

    const outPath = path.join(outDir, `${className}.kt`);
    fs.writeFileSync(outPath, kt, 'utf8');
    console.log(`  Wrote ${className}.kt (${challenges1.length + challenges2.length} challenges)`);
  }

  // Write Catalog
  let cat = `package ${subj.pkg}\n\n`;
  cat += `object ${subj.classNamePrefix}Catalog {\n`;
  cat += `    val lessons =\n`;
  weekClassNames.forEach((w, idx) => {
    cat += `        ${w}.lessons${idx < weekClassNames.length - 1 ? ' +' : ''}\n`;
  });
  cat += `}\n`;

  const catPath = path.join(outDir, `${subj.classNamePrefix}Catalog.kt`);
  fs.writeFileSync(catPath, cat, 'utf8');
  console.log(`Wrote ${subj.classNamePrefix}Catalog.kt with ${weekClassNames.length} weeks.`);
}

// Run for all STEM_SUBJECTS
for (const s of STEM_SUBJECTS) {
  processSubject(s);
}

console.log("\nALL 8 STEM SUBJECTS GENERATED SUCCESSFULLY!");
