const fs = require('fs');
const path = require('path');

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');
}

const SMART_CONFIGS = [
  // Lenguaje 01: Elements & Types of communication in s01; Language planes & 6 Functions in s02
  {
    file: 'SALIDA_KOTLIN/lenguaje/LenguajeSemana01.kt',
    src: '06_COMUNICACION/LENGUAJE/TEMA_01_Comunicacion_y_Lenguaje.md',
    split: (md) => {
      const pC = md.indexOf('### C. Lenguaje, Lengua y Habla');
      const p3 = md.indexOf('## 3.');
      const p5 = md.indexOf('## 5.');
      return {
        title1: 'La Comunicación: Concepto, Elementos, Fases y Tipología',
        th1: md.slice(p3, pC).trim(),
        title2: 'Lenguaje, Lengua, Habla y las Seis Funciones del Lenguaje',
        th2: md.slice(pC, p5 !== -1 ? p5 : undefined).trim()
      };
    }
  },
  // Lenguaje 05: Sustantivo y Adjetivo (s01: Sustantivo; s02: Adjetivo)
  {
    file: 'SALIDA_KOTLIN/lenguaje/LenguajeSemana05.kt',
    src: '06_COMUNICACION/LENGUAJE/TEMA_05_Sintaxis_Categorias_y_Frases.md',
    split: (md) => {
      const p32 = md.indexOf('### 3.2.') !== -1 ? md.indexOf('### 3.2.') : md.indexOf('### B.');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4.');
      if (p32 !== -1) {
        return {
          title1: 'Sintaxis: Categorías Gramaticales y Estructura de la Frase Nominal',
          th1: md.slice(p3, p32).trim(),
          title2: 'La Frase Verbal y Funciones Sintácticas Fundamentales',
          th2: md.slice(p32, p4 !== -1 ? p4 : undefined).trim()
        };
      }
      return null;
    }
  },
  // Civica 02: Ciudadanía y Derechos políticos in s01; Deberes cívicos y Voto in s02
  {
    file: 'SALIDA_KOTLIN/civica/CivicaSemana02.kt',
    src: '05_PERSONA_Y_FAMILIA/CIVICA/TEMA_02_Ciudadania_Derechos_y_Deberes.md',
    split: (md) => {
      const pB = md.indexOf('### B.');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4.');
      if (pB !== -1) {
        return {
          title1: 'La Ciudadanía y los Derechos de Participación Política',
          th1: md.slice(p3, pB).trim(),
          title2: 'Los Deberes Ciudadanos, el Voto y la Convivencia Democrática',
          th2: md.slice(pB, p4 !== -1 ? p4 : undefined).trim()
        };
      }
      return null;
    }
  },
  // Civica 08: Participación in s01; Control Ciudadano in s02
  {
    file: 'SALIDA_KOTLIN/civica/CivicaSemana08.kt',
    src: '05_PERSONA_Y_FAMILIA/CIVICA/TEMA_08_Participacion_y_Control_Ciudadano.md',
    split: (md) => {
      const pC = md.indexOf('### C. Derechos de Control Ciudadano');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4. CUADRO COMPARATIVO');
      return {
        title1: 'Derechos de Participación Ciudadana: Iniciativa y Referéndum (Ley 26300)',
        th1: md.slice(p3, pC).trim(),
        title2: 'Derechos de Control Ciudadano: Revocatoria, Remoción y Rendición de Cuentas',
        th2: md.slice(pC, p4 !== -1 ? p4 : undefined).trim()
      };
    }
  },
  // Psicologia 01: La Psicología como Ciencia in s01; Escuelas Psicológicas in s02
  {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana01.kt',
    src: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_01_La_Psicologia_como_Ciencia.md',
    split: (md) => {
      const pEsc = md.indexOf('### 3.2. Escuelas y Corrientes') !== -1 ? md.indexOf('### 3.2. Escuelas y Corrientes') : md.indexOf('### 3.2.');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4.');
      if (pEsc !== -1) {
        return {
          title1: 'La Psicología como Ciencia: Objeto de Estudio, Ramas y Métodos',
          th1: md.slice(p3, pEsc).trim(),
          title2: 'Escuelas Psicológicas Clásicas y Perspectivas Contemporáneas',
          th2: md.slice(pEsc, p4 !== -1 ? p4 : undefined).trim()
        };
      }
      return null;
    }
  },
  // Psicologia 02: Proyecto de Vida in s01; Autoestima y Metas in s02
  {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana02.kt',
    src: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_02_Proyecto_de_Vida.md',
    split: (md) => {
      const p32 = md.indexOf('### 3.2.');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4.');
      if (p32 !== -1) {
        return {
          title1: 'El Proyecto de Vida: Diagnóstico FODA y Visión de Futuro',
          th1: md.slice(p3, p32).trim(),
          title2: 'Valores, Metas Estratégicas y Resiliencia en el Plan Personal',
          th2: md.slice(p32, p4 !== -1 ? p4 : undefined).trim()
        };
      }
      return null;
    }
  },
  // Psicologia 06: Motivación in s01; Afectividad in s02
  {
    file: 'SALIDA_KOTLIN/psicologia/PsicologiaSemana06.kt',
    src: '05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_06_Motivacion_y_Afectividad_Humana.md',
    split: (md) => {
      const pAfec = md.indexOf('### 3.3. Afectividad') !== -1 ? md.indexOf('### 3.3. Afectividad') : md.indexOf('### 3.2.');
      const p3 = md.indexOf('## 3.');
      const p4 = md.indexOf('## 4.');
      return {
        title1: 'Naturaleza, Ciclo y Tipos de la Motivación Humana',
        th1: md.slice(p3, pAfec).trim(),
        title2: 'La Afectividad Humana: Emociones, Sentimientos y Pasiones',
        th2: md.slice(pAfec, p4 !== -1 ? p4 : undefined).trim()
      };
    }
  }
];

for (const cfg of SMART_CONFIGS) {
  if (!fs.existsSync(cfg.file) || !fs.existsSync(cfg.src)) continue;
  const md = fs.readFileSync(cfg.src, 'utf8');
  const res = cfg.split(md);
  if (!res) continue;

  let kt = fs.readFileSync(cfg.file, 'utf8');
  let lessonCount = 0;
  kt = kt.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, () => {
    lessonCount++;
    if (lessonCount === 1) {
      return `LessonTheory(\n                title = ${JSON.stringify(res.title1)},\n                content = """${cleanTripleQuotes(res.th1)}"""\n            )`;
    } else {
      return `LessonTheory(\n                title = ${JSON.stringify(res.title2)},\n                content = """${cleanTripleQuotes(res.th2)}"""\n            )`;
    }
  });

  fs.writeFileSync(cfg.file, kt, 'utf8');
  console.log(`Applied smart partition to ${cfg.file}`);
}
