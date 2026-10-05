# Test vocacional — RASTRO

Ámbito: VocationalTestScreen, shared/vocational; usa navegación/modelos/motor existentes.

Banco activo: 30 actividades originales en español del O*NET® Mini Interest Profiler, USDOL/ETA, 5 por cada área RIASEC. Fuente https://onetinterestprofiler.org/es/ ; licencia de contenido https://www.onetcenter.org/license_tools.html y https://creativecommons.org/licenses/by-nd/4.0/ . Texto/orden/dimensión originales conservados. Fuente/crédito/licencia visibles en introducción y resultados. No hay aval institucional de RASTRO. No reescribir actividades sin revisar licencia y validación; formato también acepta 60 actividades autorizadas, 10 por área.

VocationalItemBank.kt guarda banco local, valida IDs/textos únicos y distribución balanceada. VocationalScoringEngine.kt exige todas las respuestas válidas 1..5, suma seis áreas, detecta empates y deriva código Holland determinista. VocationalResult.itemsPerDimension permite escala real: 5..25 para Mini-IP, 10..50 para 60. UI normaliza barras según esa escala; no compara con percentiles ni declara diagnóstico.

VocationalTestScreen.kt: consentimiento existente → introducción → 30 respuestas → seis puntajes/afinidades → ejemplos de carreras. Selecciones/índice sobreviven recreación con rememberSaveable. SafeDrawing protege barras Android y ancho 620 dp centra lectura. Resultado mantiene privacidad del repositorio existente, sin publicación automática. VocationalCareerExamples.kt ofrece ejemplos educativos RASTRO separados, NO recomendaciones oficiales O*NET ni catálogo de carreras UNSA.

Validación: VocationalTestValidationTest 9 pruebas (banco activo 30 balanceado y máximo25, compatibilidad60, límites, respuestas faltantes, empates y privado). build/seven-shared-tests.log. Compilación build/seven-android-tests.log. Pendiente verificación física; app no ejecutada según AGENTS.md.
