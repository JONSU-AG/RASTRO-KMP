const fs = require('fs');
const path = require('path');

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');
}

const SUBJECT_CONFIGS = [
  { id: 'civica', pkg: 'civica', prefix: 'civ', classNamePrefix: 'Civica', srcDir: '05_PERSONA_Y_FAMILIA/CIVICA' },
  { id: 'lenguaje', pkg: 'lenguaje', prefix: 'leng', classNamePrefix: 'Lenguaje', srcDir: '06_COMUNICACION/LENGUAJE' },
  { id: 'literatura', pkg: 'literatura', prefix: 'lit', classNamePrefix: 'Literatura', srcDir: '06_COMUNICACION/LITERATURA' },
  { id: 'historia_peru', pkg: 'historia_peru', prefix: 'hper', classNamePrefix: 'HistoriaPeru', srcDir: '03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU' },
  { id: 'historia_universal', pkg: 'historia_universal', prefix: 'huni', classNamePrefix: 'HistoriaUniversal', srcDir: '03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL' },
  { id: 'geografia', pkg: 'geografia', prefix: 'geo', classNamePrefix: 'Geografia', srcDir: '03_CIENCIAS_SOCIALES/GEOGRAFIA' },
  { id: 'psicologia', pkg: 'psicologia', prefix: 'psi', classNamePrefix: 'Psicologia', srcDir: '05_PERSONA_Y_FAMILIA/PSICOLOGIA' },
  { id: 'filosofia', pkg: 'filosofia', prefix: 'filo', classNamePrefix: 'Filosofia', srcDir: '05_PERSONA_Y_FAMILIA/FILOSOFIA' },
  { id: 'razonamiento_verbal', pkg: 'razonamiento_verbal', prefix: 'rv', classNamePrefix: 'RazonamientoVerbal', srcDir: '01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL' },
  { id: 'comprension_lectora', pkg: 'comprension_lectora', prefix: 'cl', classNamePrefix: 'ComprensionLectora', srcDir: '01_APTITUD_ACADEMICA/COMPRENSION_LECTORA' }
];

// Special partition rules for topics where simple 3.2 split was inappropriate
const SPECIAL_SPLITS = {
  // Civica Semana 06: Rights (A, B, C) in s01; Warranties (D) in s02
  'civica_06': (md) => {
    const pD = md.indexOf('### D. Las Seis Garantías Constitucionales');
    const p3 = md.indexOf('## 3.');
    const p5 = md.indexOf('## 5.');
    const th1 = md.slice(p3, pD).trim();
    const th2 = md.slice(pD, p5 !== -1 ? p5 : undefined).trim();
    return {
      title1: 'Derechos Humanos: Fundamentos, Características y Generaciones',
      th1,
      title2: 'Las Seis Garantías Constitucionales del Perú (Artículo 200°)',
      th2
    };
  },
  // Lenguaje Semana 06: Simple sentence in s01; Compound in s02
  'lenguaje_06': (md) => {
    const p31 = md.indexOf('### 3.1.');
    const p34 = md.indexOf('### 3.4.');
    const p40 = md.indexOf('## 4.');
    return {
      title1: 'La Oración Gramatical: Bimembre vs. Unimembre y Actitud del Hablante',
      th1: md.slice(p31, p34).trim(),
      title2: 'Oraciones Compuestas: Coordinadas y Subordinadas',
      th2: md.slice(p34, p40).trim()
    };
  },
  // Geografia Semana 08
  'geografia_08': (md) => {
    const p31 = md.indexOf('### 3.1.');
    const pReg5 = md.indexOf('#### 5. Región Puna');
    const p40 = md.indexOf('## 4.');
    return {
      title1: 'Origen, Criterios y Pisos Ecológicos Occidentales (Chala a Suni)',
      th1: md.slice(p31, pReg5).trim(),
      title2: 'Pisos de Alta Montaña y Vertiente Amazónica (Puna, Janca, Rupa Rupa y Omagua)',
      th2: md.slice(pReg5, p40).trim()
    };
  },
  // Psicologia Semana 13
  'psicologia_13': (md) => {
    const p31 = md.indexOf('### 3.1.');
    const p41 = md.indexOf('### 4.1.');
    const p50 = md.indexOf('## 5.');
    return {
      title1: 'Enfoque de Riesgo, Tipologías de Violencia, Ciclo de Walker y Acoso Escolar',
      th1: md.slice(p31, p41).trim(),
      title2: 'Conductas Delictivas Juveniles, Sustancias Psicoactivas y Farmacodependencia',
      th2: md.slice(p41, p50).trim()
    };
  }
};

for (const cfg of SUBJECT_CONFIGS) {
  const srcFiles = fs.readdirSync(cfg.srcDir).filter(f => f.startsWith('TEMA_') && f.endsWith('.md')).sort();

  srcFiles.forEach((file, idx) => {
    const weekNum = idx + 1;
    const weekStr = weekNum.toString().padStart(2, '0');
    const ktFile = path.resolve(`SALIDA_KOTLIN/${cfg.id}/${cfg.classNamePrefix}Semana${weekStr}.kt`);
    if (!fs.existsSync(ktFile)) return;

    const md = fs.readFileSync(path.join(cfg.srcDir, file), 'utf8');
    const key = `${cfg.id}_${weekStr}`;

    let splitRes;
    if (SPECIAL_SPLITS[key]) {
      splitRes = SPECIAL_SPLITS[key](md);
    } else {
      // General partition logic:
      // Identify sections under ## 3.
      const sec3Idx = md.search(/##\s+3\./);
      const sec4Idx = md.search(/##\s+[45]\./);
      const theoryBlock = sec3Idx !== -1 ? (sec4Idx !== -1 ? md.slice(sec3Idx, sec4Idx) : md.slice(sec3Idx)) : md;

      // Find major subheadings (###)
      const h3Matches = [...theoryBlock.matchAll(/###\s+([^\n]+)/g)];
      if (h3Matches.length >= 2) {
        // Divide h3 subheadings evenly
        const midH3 = Math.floor(h3Matches.length / 2);
        const splitPos = h3Matches[midH3].index;
        const th1 = theoryBlock.slice(0, splitPos).trim();
        const th2 = theoryBlock.slice(splitPos).trim();
        const title1 = h3Matches[0][1].replace(/^\d+\.\d+\.?\s*/, '').trim();
        const title2 = h3Matches[midH3][1].replace(/^\d+\.\d+\.?\s*/, '').trim();
        splitRes = { title1, th1, title2, th2 };
      } else {
        // Fallback split in half
        const paras = theoryBlock.split('\n\n');
        const mid = Math.floor(paras.length / 2);
        splitRes = {
          title1: 'Parte 1',
          th1: paras.slice(0, mid).join('\n\n'),
          title2: 'Parte 2',
          th2: paras.slice(mid).join('\n\n')
        };
      }
    }

    // Update in Kotlin file
    let kt = fs.readFileSync(ktFile, 'utf8');

    // Replace s01 LessonTheory and s02 LessonTheory
    let lessonCount = 0;
    kt = kt.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, (match) => {
      lessonCount++;
      if (lessonCount === 1) {
        return `LessonTheory(\n                title = ${JSON.stringify(splitRes.title1)},\n                content = """${cleanTripleQuotes(splitRes.th1)}"""\n            )`;
      } else {
        return `LessonTheory(\n                title = ${JSON.stringify(splitRes.title2)},\n                content = """${cleanTripleQuotes(splitRes.th2)}"""\n            )`;
      }
    });

    fs.writeFileSync(ktFile, kt, 'utf8');
  });
  console.log(`Re-partitioned theories for subject: ${cfg.id}`);
}
