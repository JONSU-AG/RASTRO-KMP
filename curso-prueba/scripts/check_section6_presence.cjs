const fs = require('fs');
const path = require('path');
const { parseKotlinFileRobust } = require('./parse_kotlin_robust.cjs');

// Let us inspect civica 05 and 06
const civ5 = parseKotlinFileRobust('SALIDA_KOTLIN/civica/CivicaSemana05.kt');
console.log("Civica 05 s02 theory has 'reelección'?", civ5.lessons[1].theory.includes('reelección') || civ5.lessons[1].theory.includes('Reelección'));
console.log("Civica 05 s02 theory has 'Voto Preferencial'?", civ5.lessons[1].theory.includes('Voto Preferencial'));

const civ6 = parseKotlinFileRobust('SALIDA_KOTLIN/civica/CivicaSemana06.kt');
console.log("Civica 06 s02 theory has 'Inconstitucionalidad'?", civ6.lessons[1].theory.includes('Inconstitucionalidad'));
console.log("Civica 06 s02 theory has 'Acción Popular'?", civ6.lessons[1].theory.includes('Acción Popular'));
