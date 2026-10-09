# Checklist — Simulador / Ligas

- [x] CodeGraph explore/impact/sync aplicado; cambios delimitados y trabajo previo conservado.
- [x] Accesos visibles adaptables; filtros/favoritos/reportes/creación conservados.
- [x] Calculadora y distribución usan ponderaciones existentes, comprobadas por asignatura.
- [x] Modelo único de liga y EXP compartida; selector EXP/RACHA mantiene liga.
- [x] Consultas paginadas reales, podio, posición personal por conteo, estados de error/vacío.
- [x] Examen Ranking comparte motor, guarda intento/resultado transaccional y usa configuración por examen.
- [x] Elegibilidad, límites, ilimitados, bonus futuro y versiones probados.
- [x] Compilación Kotlin Android y 28 pruebas JVM: cero fallos/errores. RankingBankTest verifica 80 preguntas únicas con pesos conocidos por cada área del banco real, sin reasignar materias.
- [x] CatalogPilotValidationTest con cero errores/advertencias; git diff --check sin errores de whitespace.
- [x] SVG distintos y VectorDrawable nativos sin dependencia SVG de producción.
- [x] Perfil → Ligas y calendario de Racha existentes; navbar cápsula centrada con icono de examen.
- [x] Dos índices Firestore desplegados; no se desplegaron reglas ni datos académicos.
- [ ] Matriz visual teléfono/tablet/horizontal/fuentes grandes (app no ejecutada).
- [ ] Recorrido real autenticado: reservar/finalizar/sincronizar, paginar, exactitud del puesto y errores de red. Tests JVM no sustituyen ese recorrido.

## 03/10 — Compactación móvil
- [x] Los cinco accesos mantienen acciones existentes y ahora fluyen con tamaño compacto según ancho.
- [x] Compilación Kotlin correcta y cuatro pruebas de piloto pasan.
- [ ] Comprobación visual física móvil/tablet y fuente ampliada (app no ejecutada).

## 03/10 — Composición de referencia del Simulador
- [x] Encabezado izquierdo con subrayado; tres tarjetas Simulacro/Ranking/Flashcards y segunda fila Rápido/Puntaje.
- [x] Contenido limitado a 760 dp; ilustraciones limitadas a 32–64 dp y Loki a 72–126 dp, sin escalar tarjetas sin límite en tablet.
- [x] Loki Classic NEW_IDEA reutilizado en el slot derecho del bloque oficial; no se modificó su rig/secuencia.
- [x] HUD excluido únicamente de rutas Simulador/Examen Ranking; barras y rutas conservadas.
- [x] Mini edición exclusiva para admin efectivo, selección de vectores SVG locales, tintes, imagen mediante DriveUploadRepository y preview antes de guardar configuración.
- [x] Kotlin compila; test de contraste de las tres tarjetas en once temas y tests RankingBankTest, CompetitionTest y CatalogPilotValidationTest correctos.
- [x] Comparación estática contra referencia documentada en CAMBIOS.md.
- [ ] Comparación renderizada y prueba física móvil/tablet/fuentes grandes: app no ejecutada.
- [ ] Guardado/lectura remota real como admin y vista de usuario normal: pendiente de prueba física con sesión.

## 03/10 — Selección y avance de preguntas
- [x] Sticker3dButton ejecuta el callback actual aunque pointerInput continúe activo entre preguntas.
- [x] ExamActiveView recibe una instantánea de respuestas para actualizar la selección visible.
- [x] LiveClickRegressionTest avanza ocho preguntas con el mismo handler; RankingBankTest y cuatro pruebas CatalogPilotValidationTest pasan.
- [x] Kotlin Android compila. App no ejecutada; comprobación táctil física pendiente.

## 03/10 — Háptica
- [x] Normal/Rápido/Ranking emiten tick suave al cambiar respuesta; ninguna evaluación adelantada.
- [x] Kotlin y tests del banco y callback correctos.
- [ ] Verificar sensación física con vibración habilitada/deshabilitada.

## 03/10 — Errores y resultados
- [x] Tres modalidades conectadas a captura real al finalizar; blancas diferenciadas por null.
- [x] Revisar mis respuestas en Normal/Ranking, oculto en Rápido.
- [x] Se conserva banco/evaluación/intentos/XP; Kotlin y tests de captura/banco/callback correctos.
- [ ] Terminar exámenes reales, revisar gráficos y confirmar almacenamiento privado remoto.

## 04/10 — Recompensas y matriz UNSA
- [x] Implementación, compilación y 25 pruebas correctas; rewards-matrix-final.log.
- [x] Diff check sin errores; contenido académico y personajes intactos.
- [ ] Recorrido físico/sincronización real: app no ejecutada por AGENTS.md.
Detalle vigente: [MATRIZ_2027_Y_REFERENCIAS.md](MATRIZ_2027_Y_REFERENCIAS.md). Sustituye políticas anteriores incompatibles.

## 04/10 — Flashcards
- [x] Marco estable al girar y cuerpo desplazable para contenido largo.
- [x] Respuesta y fundamento separados sin modificar texto académico; vectores locales.
- [ ] Verificación física de centrado y giro (app no ejecutada).
- Detalle: ../cursos/TITULOS_Y_CONTROLES_PLAYLIST.md.


## 04/10 — Simulador y Amigos/Rachas
- [x] Implementación y compilación Kotlin; 11 pruebas JVM sin fallos.
- [x] Diff check sin errores; contenido académico intacto.
- [ ] Verificación física móvil/tablet/horizontal (app no ejecutada).
Detalle: [POPUP_Y_CALCULADORA.md](POPUP_Y_CALCULADORA.md).

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Primer Simulacro gratuito; tres intentos por concesión Pro; intentos con monedas e ID único. Sesión guardada por cuenta/dispositivo en IO, retomada sin cobrar de nuevo. Ajuste de ancho del desplegable y cierre natural Terminar en la última Flashcard.
Detalle y estado real: docs/monetizacion/README.md.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## 08/10 — Ligas
- [x] Camino con tarjetas uniformes/centradas y podio uniforme; compila.
- [ ] Matriz física de ancho/fuentes grandes pendiente.


## 08/10/2026 — Sesiones y publicidad

- [x] Causa del cierre comprobada en logs: falta serializador SavedExamSession.
- [x] Plugin existente activado y serializador explícito generado en debug/release.
- [x] 159 tests, cero fallos; cuatro pruebas nuevas de sesiones de los tres exámenes.
- [x] lintVitalRelease y assembleDebug correctos.
- [x] Introducción previa eliminada; agradecimiento/Pro solo tras anuncio mostrado y cerrado.
- [x] Revisados puntos de anuncios: preguntas/inicio de examen sin publicidad; Flashcards y rewarded conservados.
- [ ] Prueba física posterior de iniciar/responder/restaurar los tres modos y cierre de anuncio. No se ejecutó app.


## 08/10/2026 — Iconos, revisión y regalos

Revisión de resultados en popup con LazyColumn, X y filtros, en lugar de 80 tarjetas compuestas. Back permanece en Simulador; coste/confirmación de monedas y fin de actividad publicitario conectados. OOM en medición de texto documentado; prueba física pendiente.

- [x] Compilación, 348 pruebas Android/shared y lintVitalRelease sin errores.
- [x] Ocho pruebas de reglas Firestore sin fallos; reglas remotas coinciden.
- [ ] Recorrido físico y verificación visual en teléfono: app no ejecutada.
- [x] compilar_app.bat / assembleDebug final correcto; no se lanzó ni instaló la app.
