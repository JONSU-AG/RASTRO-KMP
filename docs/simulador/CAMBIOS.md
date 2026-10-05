# Cambios

## 03/10/2026

Añadidas Ligas y entrada Examen Ranking al motor actual. `CompetitionModels.kt`, `LeagueRepository.kt`, `LeaguesScreen.kt`, rutas y resumen público de gamificación. Configuración editorial de examen, intentos/resultado transaccionales y contrato futuro `ExtraAttemptUnlocker`.

Simulador: menú adaptable visible con exámenes primero, calculadora exacta por asignatura, tarjetas/botones físicos, flashcards con cara posterior temática, resultados Classic y puntaje competitivo diferenciado. Perfil abre Ligas/calendario existentes; portadas con GridCells.Adaptive(120.dp), barra centrada/cápsula y icono de examen.

SVG y VectorDrawable nativos añadidos en competition/drawable. Dos índices remotos desplegados con configuración aislada; sin reglas nuevas ni edición de usuarios/contenido académico. Guía junto a SKILLS: SIMULADOR_LIGAS_PARA_IA.md.

Compilación y pruebas: evidencia en build/ligas-simulador-tests.log y XML de Android/shared. Pendientes visuales y recorridos autenticados en CHECKLIST. No app ni APK en esta intervención.

Resultados JVM: 5 de CompetitionTest, 1 RankingBankTest con banco real en las tres áreas, 9 LearningRewardsTest, 4 RastroCoreTest, 4 CatalogPilotValidationTest y 5 LearningArtworkPolicyTest: 28 pruebas sin fallos/errores. La única dependencia añadida es serialization-json ya usada en shared, exclusivamente para leer el banco real en tests de Android; ninguna librería nueva de producción.

## 03/10 — Accesos compactos del Simulador
Reemplazado menú de grandes tarjetas (mínimo 76 dp, icono encima) por FlowRow de botones compactos de mínimo 44 dp, icono 16 dp junto al texto y capa inferior 3 dp. Etiquetas Simulacro/Ranking/Rápido/Flashcards/Puntaje; nombres completos conservados para accesibilidad. Ancho según contenido; nuevas filas según el espacio real, sin columnas fijas ni expansión forzada. Compactados título, margen superior y descripción; eliminado texto duplicado debajo del menú. Mismos índices, callbacks, paneles, exámenes, calculadora y filtros.

CodeGraph y skill compose-playful-cartoon-ui aplicados. Kotlin Android compila y cuatro pruebas CatalogPilotValidationTest pasan (cero errores/advertencias y contaminación negativa). App no ejecutada, sin APK/commit/push. Verificación visual física pendiente. Log: build/compact-mobile-final.log.

## 03/10 — Réplica de composición aprobada
Ámbito: presentación de ExamSetupView, nuevo SimulatorMenu y una condición de visibilidad de HUD en RastroApp. Nuevos tests de contraste. No se modificaron lógica de exámenes, ponderaciones, contenido, navegación, barras, Loki ni otros módulos. Se preservó el trabajo previo sin reset/restore/clean.
Comparación explícita estática: referencia con márgenes laterales próximos al 4%, encabezado alineado a izquierda, tres columnas iguales, dos tarjetas secundarias en fila y bloque oficial sin separador innecesario. Implementación: 16 dp laterales, gap 6–8 dp, radios 16/18/22 dp, contornos 1.5–2 dp, relieve sólido 2–4 dp. Ilustraciones principales ocupan aproximadamente 36% del ancho de su tarjeta (32–64 dp). Título/subtítulo seguidos por menú y bloque oficial con gap 12 dp. Áreas en fila y selector conservados; información de ponderación e inicio de examen siguen debajo del área visible de referencia.
Diferencias deliberadas: Loki Nueva Idea reemplaza hoja/lápiz del bloque grande; no se copian navbars. Los SVG reutilizados son más simples que las ilustraciones de referencia y no reproducen todos sus doodles/texturas; colores dependen del tema. No se afirma equivalencia visual exacta: faltan render/captura y recorrido físico, prohibidos por la instrucción actual de no ejecutar app.
Mini editor admin integrado con preview y guardado editorial; usuario normal no recibe el control. Sin nuevas reglas Firebase ni cambios en DriveUploadRepository.
Validación: Kotlin Android y pruebas de contraste/RankingBankTest/CompetitionTest/CatalogPilotValidationTest correctas (build/simulator-reference-final.log). Sin APK, ejecución de app, commit ni push. Comprobación física de responsive, animación y permisos remotos pendiente.

## 03/10 — Bloqueo de respuestas y Siguiente
Ámbito: callback de Sticker3dButton, instantánea de respuestas en SimuladorScreen, test JVM y documentación. Causa: pointerInput(enabled) retenía el callback con el índice inicial cuando enabled no cambiaba; Siguiente podía quedarse en la segunda pregunta. Ahora invoca la acción vigente tras recomposición y la selección se publica como instantánea observable.
Validación: compileDebugKotlin correcto; LiveClickRegressionTest (ocho avances), RankingBankTest y CatalogPilotValidationTest: seis pruebas sin errores/fallos. Log build/exam-click-regression.log. Revisión de diff conservando cambios anteriores; sin app/APK/commit/push. Recorrido táctil pendiente.

## 03/10 — Tick de selección
Simulacro normal, rápido y Ranking comparten onSelectAnswer: ahora emiten DuolingoHaptics.playOptionSelected al cambiar alternativa, sin duplicarlo al pulsar la ya elegida. Resultados correct/error del helper común son breves de baja amplitud. Sin corrección inmediata añadida, sin tocar puntajes/banco/XP. Kotlin y RankingBankTest/LiveClickRegressionTest correctos; comprobación táctil pendiente.

## 03/10 — Revisión y errores reales
Al confirmar finalización se usa frozenQuestions y userAnswers para capturar fallos/en blanco en ErrorBankRepository: Simulacro, Examen Rápido y Ranking diferenciados. Sin cambiar calculateScore, intentos, ponderaciones o XP. ExamResultView permite abrir/cerrar revisión de result.details solo Normal/Ranking y añade gráfica del snapshot cuando existe. Todas las respuestas (acierto/error/blanco), alternativa elegida y correcta se presentan; errores también disponibles en Perfil. Kotlin y 12 tests relevantes pasan; físico pendiente.

## 04/10 — Recompensas y matriz UNSA
Pesos completos matriz 2027, redondeo final; rangos históricos oficiales de 2025 con fuente y proceso visibles, sin renombrar carreras. Compilación y 25 pruebas correctas; sin app ejecutada ni commit/push.
Detalle vigente: [MATRIZ_2027_Y_REFERENCIAS.md](MATRIZ_2027_Y_REFERENCIAS.md). Sustituye políticas anteriores incompatibles.

## 04/10 — Flashcards sin salto de altura
FlashcardsQuickDeck conserva filtros/acciones. Marco responsive estable, giro sin rebote, jerarquía de respuesta/fundamento y vectores existentes. No se resumió ni cambió el banco. Pruebas y límites: ../cursos/TITULOS_Y_CONTROLES_PLAYLIST.md; build/playlist-flashcard-final.log.


## 04/10 — Simulador y Amigos/Rachas
Estructura de preguntas ordenada, estudio de flashcards aislado en Dialog y calculadora compacta. Callback vigente en contador compartido; sin cambiar pesos/banco. Kotlin y 11 tests JVM correctos; app no ejecutada.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.
