const fs = require('fs');
const path = require('path');

const ENGLISH_TOPICS = [
  {
    weekNum: 1,
    file: '07_IDIOMA_EXTRANJERO/GRAMATICA/TEMA_01_Tiempos_Verbales_Presente_y_Continuo.md',
    title: 'Tiempos Verbales de Presente: Present Simple vs. Present Continuous y Stative Verbs'
  },
  {
    weekNum: 2,
    file: '07_IDIOMA_EXTRANJERO/GRAMATICA/TEMA_02_Pasado_Simple_y_Formas_de_Futuro.md',
    title: 'Pasado Simple (Regulares e Irregulares) y Formas de Futuro (Be going to vs. Will)'
  },
  {
    weekNum: 3,
    file: '07_IDIOMA_EXTRANJERO/GRAMATICA/TEMA_03_Modales_Existenciales_Comparativos_Superlativos.md',
    title: 'Verbos Modales (Can, Must, Should), Estructuras Existenciales y Grados del Adjetivo'
  },
  {
    weekNum: 4,
    file: '07_IDIOMA_EXTRANJERO/GRAMATICA/TEMA_04_Funciones_Comunicativas_y_Conectores.md',
    title: 'Funciones Comunicativas (Gustos, Preferencias, Solicitudes) y Conectores Lógicos Discursivos'
  },
  {
    weekNum: 5,
    file: '07_IDIOMA_EXTRANJERO/GRAMATICA/TEMA_05_Pronombres_Preposiciones_y_Sintaxis_Inglesa.md',
    title: 'Sistema Pronominal, Preposiciones (Tiempo, Lugar, Movimiento) y Sintaxis de la Oración'
  },
  {
    weekNum: 6,
    file: '07_IDIOMA_EXTRANJERO/LECTURA/TEMA_01_Comprension_Lectora_Tipologias_Textuales.md',
    title: 'Reading Comprehension: Estrategias (Skimming & Scanning) y Tipologías Textuales Breves'
  },
  {
    weekNum: 7,
    file: '07_IDIOMA_EXTRANJERO/LECTURA/TEMA_02_Lectura_Tematica_Rutinas_Estudios_Salud.md',
    title: 'Lectura Temática: Información Personal, Rutinas Diarias, Estudios, Nutrición y Salud'
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

function parseEnglishTopic(fPath) {
  const content = fs.readFileSync(fPath, 'utf8');
  const lines = content.split('\n');

  // Title
  let rawTitle = '';
  for (const l of lines) {
    if (l.startsWith('# ')) {
      rawTitle = l.replace(/^#\s+/, '').replace(/^TEMA\s+[0-9IVXLCDM]+[:·\s-]*/i, '').trim();
      break;
    }
  }

  // Sections
  const sections = [];
  let curSec = null;
  for (const l of lines) {
    if (l.startsWith('## ')) {
      if (curSec) sections.push(curSec);
      curSec = { header: l.replace(/^##\s+/, '').trim(), lines: [] };
    } else if (curSec) {
      curSec.lines.push(l);
    }
  }
  if (curSec) sections.push(curSec);

  // Group sections
  let overviewLines = [];
  let theoryLines = [];
  let formulaLines = [];
  let realWorldLines = [];
  let hacksLines = [];
  let trapsLines = [];
  let exerciseLines = [];
  let glossaryLines = [];
  let flashcardLines = [];
  let autoLines = [];
  let gamiLines = [];

  for (const s of sections) {
    const h = s.header.toUpperCase();
    if (h.includes('PORTADA') || h.includes('MAPA CONCEPTUAL')) {
      overviewLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('FUNDAMENTACIÓN') || h.includes('TEÓRICA')) {
      theoryLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('FÓRMULAS') || h.includes('TAXONOMÍAS') || h.includes('LEYES')) {
      formulaLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('CASOS PRÁCTICOS') || h.includes('MUNDO REAL')) {
      realWorldLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('HACKS') || h.includes('MNEMOTÉCNIAS')) {
      hacksLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('ERRORES FRECUENTES') || h.includes('TRAMPAS')) {
      trapsLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('PROBLEMAS RESUELTOS')) {
      exerciseLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('GLOSARIO')) {
      glossaryLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('FLASHCARDS')) {
      flashcardLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('AUTOEVALUACIÓN')) {
      autoLines.push(`## ${s.header}`, ...s.lines);
    } else if (h.includes('GAMIFICACIÓN') || h.includes('KMP')) {
      gamiLines.push(`## ${s.header}`, ...s.lines);
    } else {
      theoryLines.push(`## ${s.header}`, ...s.lines);
    }
  }

  // Parse Solved Problems
  const problems = [];
  let curP = null;
  for (let i = 0; i < exerciseLines.length; i++) {
    const l = exerciseLines[i];
    if (/^###\s+(?:Problema|Pregunta)/i.test(l)) {
      if (curP && curP.question && curP.options.length >= 2) problems.push(curP);
      curP = { title: l.replace(/^#+\s+/, '').trim(), question: '', options: [], key: '', exp: '' };
      continue;
    }
    if (curP) {
      if (/^\*\*(?:Enunciado|Question).*?\*\*:\s*(.*)/i.test(l)) {
        curP.question = l.replace(/.*?\*\*(?:Enunciado|Question).*?\*\*:\s*/i, '').trim();
      } else if (!curP.question && l.trim() && !l.startsWith('#') && !/^[-*]?\s*[A-E]\)/.test(l.trim())) {
        curP.question = l.trim();
      }
      const optMatch = l.trim().match(/^[-*]?\s*([A-E])\)\s*(.+)/);
      if (optMatch) {
        curP.options.push({ letter: optMatch[1], text: optMatch[2].trim() });
      }
      const keyMatch = l.match(/\*\*(?:Respuesta|Clave|Correct Answer)\*\*:\s*\*?\*?([A-E])\*?\*?/i);
      if (keyMatch) {
        curP.key = keyMatch[1];
      }
      if (/^\*\*(?:Resolución|Explanation|Sustento)/i.test(l)) {
        curP.exp = l.replace(/.*?\*\*(?:Resolución|Explanation|Sustento)[^:]*\*\*:\s*/i, '').trim();
      } else if (curP.exp && l.trim() && !l.startsWith('#') && !/^[-*]?\s*[A-E]\)/.test(l.trim())) {
        curP.exp += ' ' + l.trim();
      }
    }
  }
  if (curP && curP.question && curP.options.length >= 2) problems.push(curP);

  // Parse Flashcards
  const flashcards = [];
  for (const l of flashcardLines) {
    if (l.startsWith('|') && l.includes('?') && !l.includes('Front')) {
      const parts = l.split('|').map(p => p.trim()).filter(Boolean);
      if (parts.length >= 2) {
        flashcards.push({ q: parts[0], a: parts[1] });
      }
    }
  }

  // Parse Autoevaluación items
  const autoItems = [];
  let curAuto = null;
  for (let i = 0; i < autoLines.length; i++) {
    const l = autoLines[i];
    if (/^\d+\.\s+/.test(l.trim())) {
      if (curAuto && curAuto.options.length >= 2) autoItems.push(curAuto);
      curAuto = {
        question: l.trim().replace(/^\d+\.\s+/, ''),
        options: [],
        correctKey: 'A',
        explanation: 'Enunciado verificado según las reglas de la lección.'
      };
      continue;
    }
    if (curAuto) {
      const optMatch = l.trim().match(/^[-*]?\s*([A-D])\)\s*(.+)/);
      if (optMatch) {
        curAuto.options.push(optMatch[2].trim());
      }
      const keyMatch = l.match(/\*Respuesta correcta:\*\s*\*?\*?([A-D])\*?\*?/i);
      if (keyMatch) {
        curAuto.correctKey = keyMatch[1];
        curAuto.explanation = l.replace(/.*?\*Respuesta correcta:\*[^(]*/i, '').trim() || curAuto.explanation;
      }
    }
  }
  if (curAuto && curAuto.options.length >= 2) autoItems.push(curAuto);

  // Parse Glossary
  const glossary = [];
  for (const l of glossaryLines) {
    const m = l.match(/^\d+\.\s+\*\*([^*]+)\*\*:\s*(.*)/) || l.match(/^-\s+\*\*([^*]+)\*\*:\s*(.*)/);
    if (m) {
      glossary.push({ term: m[1].trim(), definition: m[2].trim() });
    }
  }

  // Parse Gamification JSON
  let gamiQ = [];
  const gamiRaw = gamiLines.join('\n');
  const gMatch = gamiRaw.match(/```json\s*(\{[\s\S]*?\})\s*```/);
  if (gMatch) {
    try {
      const parsed = JSON.parse(gMatch[1]);
      if (Array.isArray(parsed.preguntas)) {
        for (const p of parsed.preguntas) {
          if (p.enunciado && Array.isArray(p.opciones)) {
            gamiQ.push({
              question: p.enunciado,
              options: p.opciones.slice(0, 4),
              correctIndex: typeof p.respuesta_correcta === 'number' ? p.respuesta_correcta % 4 : 0,
              exp: p.explicacion || 'Grammar rule verified.'
            });
          }
        }
      } else if (parsed.boss_challenge) {
        gamiQ.push({
          question: parsed.boss_challenge.question,
          options: parsed.boss_challenge.options.slice(0, 4),
          correctIndex: parsed.boss_challenge.correct_index % 4,
          exp: parsed.boss_challenge.explanation || 'Advanced English reading comprehension.'
        });
      }
    } catch(e) {}
  }

  return {
    rawTitle,
    overviewLines,
    theoryLines,
    formulaLines,
    realWorldLines,
    hacksLines,
    trapsLines,
    problems,
    flashcards,
    autoItems,
    glossary,
    gamiQ
  };
}

console.log('Parser defined for English topics.');

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

function buildEnglishChallenges(prefix, weekStr, subNum, rawItems, lessonTheory) {
  const challenges = [];
  const targetIndices = [0, 1, 2, 3, 0, 1, 2, 3, 0, 1]; // Balanced distribution

  const { problems, flashcards, autoItems, gamiQ, glossary } = rawItems;

  let pIdx = 0;
  let fIdx = 0;
  let aIdx = 0;
  let gIdx = 0;
  let glIdx = 0;

  for (let c = 1; c <= 10; c++) {
    const chId = `${prefix}_t${weekStr}_s0${subNum}_c${c.toString().padStart(2, '0')}`;
    const targetIdx = targetIndices[c - 1];

    if (pIdx < problems.length && (c <= 3 || (fIdx >= flashcards.length && glIdx >= glossary.length))) {
      const p = problems[pIdx++];
      let opts = p.options.map(o => o.text);
      while (opts.length < 4) {
        opts.push('None of the above');
      }
      opts = opts.slice(0, 4);
      let correctIdx = 0;
      if (p.key) {
        const idx = 'ABCD'.indexOf(p.key.toUpperCase());
        if (idx !== -1) correctIdx = idx;
      }
      challenges.push({
        id: chId,
        question: p.question || 'Choose the grammatically correct option:',
        options: opts,
        correctIndex: correctIdx,
        explanation: p.exp || 'Correct answer verified by the grammatical principles in the lesson theory.'
      });
    } else if (fIdx < flashcards.length) {
      const fc = flashcards[fIdx++];
      const correctAns = fc.a.trim();
      const distractors = [
        'It requires an irregular past participle form without auxiliary verbs.',
        'It is only used in colloquial informal contexts with plural nouns.',
        'It follows an inverted word order with obligatory double negation.'
      ];
      const opts = [];
      let dCount = 0;
      for (let i = 0; i < 4; i++) {
        if (i === targetIdx) opts.push(correctAns);
        else opts.push(distractors[dCount++] || 'Alternative grammatical option');
      }
      challenges.push({
        id: chId,
        question: fc.q,
        options: opts,
        correctIndex: targetIdx,
        explanation: `According to the lesson theory: ${correctAns}`
      });
    } else if (aIdx < autoItems.length) {
      const a = autoItems[aIdx++];
      let opts = a.options.slice(0, 4);
      while (opts.length < 4) opts.push('Option not applicable');
      const idx = 'ABCD'.indexOf(a.correctKey.toUpperCase());
      challenges.push({
        id: chId,
        question: a.question,
        options: opts,
        correctIndex: idx !== -1 ? idx : targetIdx,
        explanation: a.explanation
      });
    } else if (gIdx < gamiQ.length) {
      const g = gamiQ[gIdx++];
      let opts = g.options.slice(0, 4);
      while (opts.length < 4) opts.push('Alternative answer');
      challenges.push({
        id: chId,
        question: g.question,
        options: opts,
        correctIndex: g.correctIndex,
        explanation: g.exp
      });
    } else if (glIdx < glossary.length) {
      const item = glossary[glIdx++];
      const opts = [];
      const dist = [
        'A structural connector indicating chronological concession in narrative texts',
        'A morphological inflection restricted to subjunctive conditional clauses',
        'A phonological reduction typical of rapid speech in spoken dialogues'
      ];
      let dCount = 0;
      for (let i = 0; i < 4; i++) {
        if (i === targetIdx) opts.push(item.definition);
        else opts.push(dist[dCount++] || 'Alternative linguistic definition');
      }
      challenges.push({
        id: chId,
        question: `In English linguistics and grammar, what is the formal definition of "${item.term}"?`,
        options: opts,
        correctIndex: targetIdx,
        explanation: `The lesson defines "${item.term}" as: ${item.definition}`
      });
    } else {
      // Fallback: rule confirmation
      const opts = [];
      const correctAns = 'The grammatical structure strictly follows standard pre-university English syntax rules explained in this lesson.';
      const dist = [
        'The sentence violates subject-verb agreement in standard English.',
        'The tense used is incompatible with the stated adverbial time marker.',
        'The word order incorrectly positions the modifier after the direct object.'
      ];
      let dCount = 0;
      for (let i = 0; i < 4; i++) {
        if (i === targetIdx) opts.push(correctAns);
        else opts.push(dist[dCount++] || 'Distractor rule');
      }
      challenges.push({
        id: chId,
        question: 'Which of the following statements is analytically and grammatically correct regarding the lesson theory?',
        options: opts,
        correctIndex: targetIdx,
        explanation: 'Directly deduced from the theoretical foundations and rules presented in this lesson.'
      });
    }
  }

  return challenges;
}

const outDir = 'SALIDA_KOTLIN/ingles';
if (!fs.existsSync(outDir)) {
  fs.mkdirSync(outDir, { recursive: true });
}

const weekClassNames = [];

for (const t of ENGLISH_TOPICS) {
  const weekStr = t.weekNum.toString().padStart(2, '0');
  const className = `InglesSemana${weekStr}`;
  weekClassNames.push(className);

  console.log(`Processing Week ${weekStr}: ${t.title}`);
  const parsed = parseEnglishTopic(t.file);

  // Divide theory lines
  const midT = Math.floor(parsed.theoryLines.length / 2);
  const theoryPart1 = parsed.theoryLines.slice(0, midT).join('\n');
  const theoryPart2 = parsed.theoryLines.slice(midT).join('\n');

  // Divide formulas
  const midF = Math.floor(parsed.formulaLines.length / 2);
  const formulaPart1 = parsed.formulaLines.slice(0, midF).join('\n');
  const formulaPart2 = parsed.formulaLines.slice(midF).join('\n');

  // Overview, hacks, traps, real world
  const overviewText = parsed.overviewLines.join('\n');
  const hacksText = parsed.hacksLines.join('\n');
  const trapsText = parsed.trapsLines.join('\n');
  const realWorldText = parsed.realWorldLines.join('\n');

  // Glossary
  const midG = Math.floor(parsed.glossary.length / 2);
  const glossaryPart1 = parsed.glossary.slice(0, midG).map(g => `- **${g.term}:** ${g.definition}`).join('\n');
  const glossaryPart2 = parsed.glossary.slice(midG).map(g => `- **${g.term}:** ${g.definition}`).join('\n');

  // Build Theory 1
  let t1 = `## 1. COURSE OVERVIEW & CONCEPTUAL FRAMEWORK\n${overviewText}\n\n`;
  t1 += `## 2. FORMAL THEORETICAL FOUNDATIONS - PART I\n${theoryPart1}\n\n`;
  if (formulaPart1) t1 += `## 3. GRAMMAR PATTERNS & STRUCTURE TAXONOMY\n${formulaPart1}\n\n`;
  if (glossaryPart1) t1 += `## 4. KEY VOCABULARY & LINGUISTIC TERMS\n${glossaryPart1}\n\n`;

  // Build Theory 2
  let t2 = `## 1. APPLIED GRAMMAR & ADVANCED STRUCTURES - PART II\n${theoryPart2}\n\n`;
  if (formulaPart2 || hacksText) {
    t2 += `## 2. PRE-UNIVERSITY HACKS & MNEMOTECHNICS\n${formulaPart2}\n\n${hacksText}\n\n`;
  }
  if (trapsText) t2 += `## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS\n${trapsText}\n\n`;
  if (realWorldText) t2 += `## 4. REAL-WORLD CONTEXT & READING PASSAGES\n${realWorldText}\n\n`;
  if (glossaryPart2) t2 += `## 5. ADVANCED VOCABULARY & IDIOMS\n${glossaryPart2}\n\n`;

  // Divide problem items
  const midProb = Math.ceil(parsed.problems.length / 2);
  const problems1 = parsed.problems.slice(0, midProb);
  const problems2 = parsed.problems.slice(midProb);

  const midFc = Math.ceil(parsed.flashcards.length / 2);
  const flashcards1 = parsed.flashcards.slice(0, midFc);
  const flashcards2 = parsed.flashcards.slice(midFc);

  const midAuto = Math.ceil(parsed.autoItems.length / 2);
  const auto1 = parsed.autoItems.slice(0, midAuto);
  const auto2 = parsed.autoItems.slice(midAuto);

  const items1 = {
    problems: problems1,
    flashcards: flashcards1,
    autoItems: auto1,
    gamiQ: parsed.gamiQ.slice(0, 1),
    glossary: parsed.glossary.slice(0, midG)
  };

  const items2 = {
    problems: problems2,
    flashcards: flashcards2,
    autoItems: auto2,
    gamiQ: parsed.gamiQ.slice(1),
    glossary: parsed.glossary.slice(midG)
  };

  const challenges1 = buildEnglishChallenges('ing', weekStr, '1', items1, t1);
  const challenges2 = buildEnglishChallenges('ing', weekStr, '2', items2, t2);

  const title1 = `${t.title} - Core Rules & Foundations`;
  const title2 = `${t.title} - Applied Skills, Hacks & Reading Practice`;

  let kt = `package ingles\n\n`;
  kt += `import com.clase.app.data.model.LessonNode\n`;
  kt += `import com.clase.app.data.model.LessonTheory\n`;
  kt += `import com.clase.app.data.model.Challenge\n\n`;
  kt += `object ${className} {\n`;
  kt += `    val lessons: List<LessonNode> = listOf(\n`;
  kt += `        LessonNode(\n`;
  kt += `            id = "ing_t${weekStr}_s01",\n`;
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
  kt += `            id = "ing_t${weekStr}_s02",\n`;
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
  console.log(`  -> Wrote ${className}.kt (${challenges1.length + challenges2.length} challenges)`);
}

// Write Catalog
let cat = `package ingles\n\n`;
cat += `object InglesCatalog {\n`;
cat += `    val lessons =\n`;
weekClassNames.forEach((w, idx) => {
  cat += `        ${w}.lessons${idx < weekClassNames.length - 1 ? ' +' : ''}\n`;
});
cat += `}\n`;

const catPath = path.join(outDir, 'InglesCatalog.kt');
fs.writeFileSync(catPath, cat, 'utf8');
console.log(`Wrote InglesCatalog.kt with ${weekClassNames.length} weeks.`);
console.log("INGLES BUILD COMPLETED SUCCESSFULLY!");
