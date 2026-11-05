# Estado de la revisión de preguntas — 02/11/2026

La corrección avanzó por bancos concretos, conservando IDs, títulos y orden de niveles. No se certifica toda la app ni se confunde el resultado de un análisis automático con exactitud académica.

## Práctica revisada por lotes

| Materia | Niveles con práctica revisada por los lotes documentados | Preguntas actuales |
|---|---:|---:|
| Álgebra | 32 | 352 |
| Aritmética | 26 | 286 |
| Física | 24 | 264 |
| Geometría | 22 | 242 |
| Trigonometría | 24 | 264 |
| Química | 32 | 356 |
| Razonamiento Lógico | 18 | 198 |
| Razonamiento Matemático | 14 | 154 |
| Inglés | 14 | 154 |
| Comprensión Lectora | 16 | 176 |

Cada materia tiene su informe `REVISION_PRACTICA_PENDIENTE.md` con alcance, fuentes y límites. La tabla reúne los lotes anteriores y los de esta intervención: no afirma que todas sus preguntas se hayan escrito de nuevo hoy ni que todos los niveles avanzados tengan ya suficiente profundidad.

En Biología se reparan once preguntas adicionales: diez relaciones pasan a cuatro pares reales en el motor existente, y una pregunta evalúa factor intrínseco sin prescribir tratamiento. Total de Biología: 296 preguntas. [Detalle](biologia/REVISION_RELACIONES_2026-11-02.md). No se certifica el resto de esa materia.

## Correcciones que no detectaba el primer análisis

- Claves ambientales: «solo clorar el río» no demuestra potabilidad; deposición ácida no exclusiva de zonas mineras.
- Inglés: consignas sin oración, clave que contradice la explicación y 49 preguntas de plantilla genérica en inglés. Se amplía la auditoría para detectarlas, sin relajar sus criterios.
- Relaciones de Biología: «la correspondencia directa descrita» no constituye un ejercicio de relación. Se amplía también ese patrón de detección.
- CatalogValidator: comparar alternativas en minúsculas confundía AA/Aa/aa y ejercicios ortográficos. Se conserva la distinción de mayúsculas, pero sigue rechazándose la duplicación exacta con espacios externos. Dos regresiones comprueban ambos comportamientos. No se eliminan validaciones para hacer pasar el banco.

## Evidencia técnica actual

- 20 materias, 418 niveles, 4.554 preguntas de los recursos JSON. El loader de producción lee los 418 niveles y conserva la lista completa de IDs de cada archivo.
- Auditoría de plantillas/estructura: cero preguntas con los patrones de alerta vigentes. Esto no demuestra la verdad de todas las claves.
- CatalogValidator sobre los recursos cargados: cero errores y **148 advertencias por cantidad**. Son bancos de diez preguntas frente al mínimo de once del nivel NORMAL: Psicología 29, Filosofía 26, Geografía 26, Cívica 22, Lenguaje 17, Razonamiento Verbal 16 y Literatura 12. Se mantienen visibles; no se rebaja la profundidad ni se añaden preguntas de relleno para borrar el aviso.
- Los niveles de los lotes nuevos pasan sus validaciones sin errores ni advertencias, además del sanitizador. Las pruebas incluyen cálculos concretos, claves, dominios, conservación de IDs, fixtures, conceptos y relaciones.
- assembleDebug, **257 pruebas de androidApp y 192 de shared**, sin fallos, errores u omitidas. Log: `build/academic-final-validation.log`. Las 27 regresiones antiguas que esperaban diez preguntas se actualizan a los conteos revisados; permanecen las comprobaciones de identidad, teoría, aislamiento y respaldo legacy. La evidencia anterior al ajuste queda en `build/academic-shared-counts-before.log`.
- Motor científico aislado: 10.478 fragmentos, 1.254 vistas de texto (418 niveles en claro, oscuro y letra grande, 360 px), cero errores, fallbacks, peticiones externas o desbordamiento horizontal del documento. Incluye textos de opciones, resoluciones, pares y campos de interacción. Las fórmulas largas pueden desplazarse dentro de su propio contenedor. No es una ejecución visual de la app Android.

Informes locales: `build/academic-resource-loading-audit.json`, `build/all-question-render.json` y [auditoría estructural actual](estado/AUDITORIA_ESTRUCTURAL_TOTAL.md). Los respaldos de los bancos anteriores están bajo `build/academic-backup-*`; no se ha hecho un respaldo remoto ni una publicación.

## Pendiente real

1. Revisión académica completa de las materias que no están certificadas por los lotes anteriores, incluido el resto de Biología. Revisar también afirmaciones históricas, jurídicas y geográficas dependientes de una fecha, comparaciones sin fuente y ejercicios demasiado evidentes.
2. Atender las 148 advertencias con contenido pertinente y revisado, no con ajustes de conteo. El cero de plantillas genéricas no las elimina ni certifica esas materias.
3. Teoría completa, mejor profundidad avanzada y coherencia entre teoría y cada práctica. Algunas teorías conservan información administrativa o redacción heredada; los cambios de este lote se concentran en preguntas.
4. Gráficos propios por tema y por resolución. Tener un desarrollo de tres o cuatro segmentos permite reproducirlo por pasos, pero no equivale a una animación gráfica específica para cada pregunta.
5. Verificación física en teléfono de texto, fórmulas, gráficos, controles y relaciones. No se ha ejecutado Android, instalado APK, generado AAB ni publicado nada. Firebase, anuncios, compras y gamificación quedan fuera de esta intervención.

Las casillas del [cierre por nivel](CIERRE_POR_NIVEL.md) conservan pendiente la teoría cuando solo se revisó la práctica. No debe presentarse esta revisión como «todas las teorías y preguntas corregidas».

## Actualización posterior: mapas

Se adaptan 18 mapas de las teorías de Lógico, Matemático e Inglés, con correcciones de contenido asociadas. La cobertura pasa a 130 gráficos y 184 bloques conservados. [Detalle](MAPAS_REVISADOS_2026-11-02.md). Validación posterior: assembleDebug y 452 pruebas correctas (260 androidApp + 192 shared), en build/academic-maps-final-validation.log. Esto amplía el alcance de teoría de este cierre, pero no certifica toda la teoría de la app.

## Cierre posterior: comprensión lectora

16 bancos y 176 ejercicios con textos originales, conservando 160 IDs y añadiendo 16. Se corrige también la segmentación de citas en el reproductor. [Detalle](comprension_lectora/REVISION_PRACTICA_PENDIENTE.md). Estado técnico posterior: 263 pruebas de androidApp y 192 de shared, 455 en total, sin fallos; assembleDebug correcto. Log: build/reading-practice-final-validation.log. Las 148 advertencias por cantidad restantes no corresponden a estos niveles. Los conteos de pruebas de apartados anteriores documentan las etapas previas.
