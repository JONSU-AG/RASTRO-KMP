const fs = require('fs');
const path = require('path');

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str.replace(/"""/g, '\\"\\"\\"').replace(/\$/g, '');
}

// 1. Psicologia 04
const psi04Md = fs.readFileSync('05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Habitos_de_Estudio.md', 'utf8');
const p3_psi04 = psi04Md.indexOf('## 3.');
const p4_psi04 = psi04Md.indexOf('## 4.');
const p5_psi04 = psi04Md.indexOf('## 5.');

let ktPsi04 = fs.readFileSync('SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt', 'utf8');
// s01: Naturaleza del hábito, gestión del tiempo y técnicas cognitivas (incluyendo Novak, Buzan, Feynman)
// s02: Higiene del aprendizaje, sueño, metacognición y problemas resueltos
const th1_psi04 = psi04Md.slice(p3_psi04, psi04Md.indexOf('### 4.2.')).trim();
const th2_psi04 = psi04Md.slice(psi04Md.indexOf('### 4.2.'), p5_psi04).trim();

let c04 = 0;
ktPsi04 = ktPsi04.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, () => {
  c04++;
  if (c04 === 1) {
    return `LessonTheory(
                title = "Hábitos de Estudio, Gestión del Tiempo y Técnicas Cognitivas (Novak, Buzan)",
                content = """${cleanTripleQuotes(th1_psi04)}"""
            )`;
  } else {
    return `LessonTheory(
                title = "Higiene del Aprendizaje, Factores Fisiológicos y Metacognición",
                content = """${cleanTripleQuotes(th2_psi04)}"""
            )`;
  }
});
fs.writeFileSync('SALIDA_KOTLIN/psicologia/PsicologiaSemana04.kt', ktPsi04, 'utf8');
console.log("PsicologiaSemana04.kt updated!");

// 2. Psicologia 15
const psi15Md = fs.readFileSync('05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_15_Desarrollo_Humano_y_Etapas.md', 'utf8');
const p3_psi15 = psi15Md.indexOf('## 3.');
const p43_psi15 = psi15Md.indexOf('### 4.3.');
const p5_psi15 = psi15Md.indexOf('## 5.');

let ktPsi15 = fs.readFileSync('SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt', 'utf8');
// s01: Principios del desarrollo, Piaget y Erikson (incluyendo Elkind)
// s02: Kohlberg y ciclo vital completo
const th1_psi15 = psi15Md.slice(p3_psi15, p43_psi15).trim();
const th2_psi15 = psi15Md.slice(p43_psi15, p5_psi15 !== -1 ? p5_psi15 : undefined).trim();

let c15 = 0;
ktPsi15 = ktPsi15.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, () => {
  c15++;
  if (c15 === 1) {
    return `LessonTheory(
                title = "Principios del Desarrollo Humano, Estadios de Piaget y Teoría de Erikson",
                content = """${cleanTripleQuotes(th1_psi15)}"""
            )`;
  } else {
    return `LessonTheory(
                title = "Desarrollo Moral de Kohlberg y Etapas del Ciclo Vital Humano",
                content = """${cleanTripleQuotes(th2_psi15)}"""
            )`;
  }
});
fs.writeFileSync('SALIDA_KOTLIN/psicologia/PsicologiaSemana15.kt', ktPsi15, 'utf8');
console.log("PsicologiaSemana15.kt updated!");

// 3. Filosofia 01
const filo01Md = fs.readFileSync('05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_01_Nociones_Preliminares_de_Filosofia.md', 'utf8');
const p31_f01 = filo01Md.indexOf('### 3.1.');
const p33_f01 = filo01Md.indexOf('### 3.3.');
const p4_f01 = filo01Md.indexOf('## 4.');

let ktFilo01 = fs.readFileSync('SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt', 'utf8');
const th1_f01 = filo01Md.slice(p31_f01, p33_f01).trim();
const th2_f01 = filo01Md.slice(p33_f01, p4_f01).trim();

let cf01 = 0;
ktFilo01 = ktFilo01.replace(/LessonTheory\(\s*title\s*=\s*"[^"]*"\s*,\s*content\s*=\s*"""[\s\S]*?"""\s*\)/g, () => {
  cf01++;
  if (cf01 === 1) {
    return `LessonTheory(
                title = "Etimología, Definición, Origen Histórico y Actitud Filosófica",
                content = """${cleanTripleQuotes(th1_f01)}"""
            )`;
  } else {
    return `LessonTheory(
                title = "Disciplinas Filosóficas Fundamentales y Problemas Cardinales",
                content = """${cleanTripleQuotes(th2_f01)}"""
            )`;
  }
});
fs.writeFileSync('SALIDA_KOTLIN/filosofia/FilosofiaSemana01.kt', ktFilo01, 'utf8');
console.log("FilosofiaSemana01.kt updated!");
