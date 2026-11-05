# Revisión de la práctica pendiente de Trigonometría

02/11/2026. Ámbito: 1.2 y ambos niveles de las semanas 02–12, 23 bancos del catálogo nuevo y sus fixtures Android. Se sustituyeron 230 preguntas incompletas o de plantilla por 253 ejercicios explícitos, once diferentes por nivel. Se conservan los 230 IDs y se añade c11. El nivel 1.1 conserva sus once preguntas, datos angulares y revisión previa; su hash se comprueba antes y después de la autoría.

La materia tiene ahora 264 preguntas en 24 niveles. Esto cierra la sustitución de los bancos de práctica pendientes de este lote, no una revisión completa de la teoría, la dificultad avanzada ni los dibujos individuales. No se modifican títulos, temario, catálogo Kotlin legacy, navegación, recompensas ni Firebase.

## Conceptos y condiciones

| Semana | Práctica revisada |
|---|---|
| 01, parte 2 | Conversión entre grados, grados centesimales y radianes; subdivisiones y coterminalidad |
| 02 | Arcos, sectores, regiones concéntricas, rotación uniforme, rodadura sin deslizamiento y poleas |
| 03 | Razones del triángulo rectángulo, notables exactos, complementarios y medio ángulo agudo |
| 04 | Cuadrantes, coordenadas, signos, paridad y reducción de vueltas |
| 05 | Identidades y simplificaciones conservando el dominio original; condiciones y signos |
| 06 | Suma/diferencia, doble, triple y medio ángulo; máximo de una combinación sinusoidal |
| 07 | Ecuaciones en intervalos explícitos, extremos incluidos/excluidos, factores nulos y comprobación de candidatas |
| 08 | Leyes de senos/cosenos, áreas y radios; desigualdad triangular y ambigüedad de dos lados con un ángulo opuesto |
| 09 | Elevación, depresión, altura del ojo, doble observación y rumbos con referencia cardinal explícita |
| 10 | Dominio, rango, periodo, amplitud, traslación, reflexión y valores extremos |
| 11 | Ramas principales de inversas, dominios y composiciones sin confundir inversa con recíproca |
| 12 | Posición armónica, modelos periódicos de altura, unidades, condiciones de uso y optimización geométrica |

Ningún enunciado necesita datos de la pregunta anterior. Los intervalos de ecuaciones indican sus extremos; el número de soluciones se cuenta después de aplicar esa restricción. Un cuadrado no elimina signos posibles. Una cancelación no amplía el dominio original. Las ramas principales de arcsin, arccos y arctan se conservan en las composiciones. Los rumbos y azimuts especifican la referencia y el sentido usados.

Se distinguen ángulos notables exactos de aproximaciones como sin(37°)≈3/5. Los problemas son originales de RASTRO; no se presentan como preguntas oficiales ni certifican correspondencia con un examen universitario concreto.

## Verificación matemática y presentación

`scripts/academic/review_trigonometry_practice.py` contiene los 253 problemas explícitos. Se contrastan 207 resultados con operaciones exactas de SymPy: razones, radicales, funciones trigonométricas, inversas y conjuntos de soluciones restringidos. Las otras 46 preguntas conceptuales tienen argumentos escritos en tres pasos; la comprobación algebraica no sustituye el análisis conceptual.

Las alternativas numéricas comparten unidad, se rotan sin cambiar la clave y se comprueba que no sean matemáticamente equivalentes entre sí. El generador usa la utilidad de autoría/verificación local del lote de Física; no es un nuevo motor de contenido ni una dependencia de Android. Los JSON quedan estáticos y el loader existente los carga igual que antes.

Los fragmentos de notación se delimitan explícitamente para evitar que «y» entre datos de lados se convierta en variable. Las cuatro resoluciones de 75° y 15° usan alineación en dos líneas para que la sustitución se lea mejor en anchos pequeños. Las expresiones extensas mantienen el desplazamiento horizontal interno que ya ofrece el renderizador; no se afirma que todas quepan de una vez con letra grande.

Evidencia local: `build/trigonometry-pending-proofs.json`, `build/trigonometry-pending-preview.json` y copia anterior en `build/academic-backup-trigonometry-pending/`. No constituyen respaldo remoto. SymPy sigue limitado al directorio de desarrollo de build.

## Fuentes de contraste

- [OpenStax, Algebra and Trigonometry 2e, índice](https://openstax.org/books/algebra-and-trigonometry-2e/pages/index), para la organización de conceptos y aplicaciones.
- [Circunferencia unitaria, sección 7.3](https://openstax.org/books/algebra-and-trigonometry-2e/pages/7-3-unit-circle): coordenadas, valores notables, signos y rangos.
- [Identidades de suma y diferencia, sección 9.2](https://openstax.org/books/algebra-and-trigonometry-2e/pages/9-2-sum-and-difference-identities): fórmulas y condiciones de uso.
- [Funciones inversas, sección 8.3](https://openstax.org/books/algebra-and-trigonometry-2e/pages/8-3-inverse-trigonometric-functions): dominios, rangos principales y diferencia entre inversa y recíproca.

Se contrastan reglas y condiciones; no se copian ejercicios de estas fuentes.

## Evidencia de validación y límites

El motor matemático local acepta 1.514 fragmentos. Los enunciados, alternativas y resoluciones de todos los niveles nuevos se renderizan en 69 vistas: 23 niveles con tema claro, oscuro y letra ampliada a 360 px. Cero errores de carga, peticiones externas, fallbacks o desbordamiento horizontal del documento. Se inspeccionan capturas de ángulos compuestos y composiciones inversas. Reporte: `build/trigonometry-pending-render.json`. Esto no equivale a ejecutar Android.

La auditoría global queda en 4.422 preguntas en 418 niveles, 770 preguntas con alertas automáticas. La ausencia de alertas de Trigonometría no certifica toda su teoría ni equivale a revisión humana de todas las demás materias. Siguen pendientes los bancos de otras materias, las preguntas sin alertas aún no contrastadas, la teoría completa y los gráficos individuales.

No se ejecutó ni publicó Android. El resultado final de compilación y pruebas se registra en el checklist de la materia y en `build/trigonometry-practice-final.log`.

Validación final: assembleDebug y 236 pruebas Android repetidas, sin fallos, errores ni omitidas. TrigonometryPracticeReviewTest carga los 24 niveles; CatalogValidator: cero errores y cero advertencias. Comprueba además claves de raíces, intervalos, ramas inversas, triángulos ambiguos, optimización y equivalencia de fixtures.
