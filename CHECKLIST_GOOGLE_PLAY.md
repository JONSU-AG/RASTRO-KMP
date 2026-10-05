# Estado vigente — 05/10/2026

Configuración local **2.0.1 / code 201**, release/firma/R8/lintVital y 119 pruebas comprobados. No se generó APK/AAB. Console todavía no habilita Producción; los pendientes de publicación no se consideran resueltos. Detalle: [RELEASE_2.0.1.md](docs/publicacion/RELEASE_2.0.1.md). La auditoría del 04/10 que sigue es histórica.

# RASTRO — Checklist de auditoría y publicación

Fuente de verdad de esta intervención (04/10/2026). Se contrastaron informes adjuntos con código real, sin reiniciar megaauditorías. Se conservó el trabajo previo. No se ejecutó/instaló RASTRO, no commit/push, no cambio de versión y ningún despliegue ni borrado de cuenta real.

## Prioridad inmediata

- [x] GP-01 CORREGIDO Y VALIDADO: cierre por PatternSyntaxException de Android ICU en Completar corregido con parser compartido y llaves escapadas; regresión y Kotlin debug/release pasan. Propietario confirma el 04/10: «ya no se cierra la app en los niveles». Se cierra este fallo concreto, sin extender la confirmación a todos los recorridos físicos.
- [ ] GP-02 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: lección y camino cargan en IO con fallo local/reintento, catálogo cacheado por materia; restauración preparada en IO y aplicada al estado UI; widgets fuera de Main. Sin fallback de Biología. Catálogos reales y regresiones pasan; falta medir fluidez física.
- [ ] GP-03 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: Pizarra con presupuesto de buffers/undo, asignación/copia controladas y ViewModel que conserva el dibujo al rotar. Tests de memoria extremos pasan; faltan trazos/rotación reales.
- [ ] GP-04 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: doble reserva Ranking bloqueada, callbacks descartados al salir/cambiar UID, efecto sin key autocambiante y reintento visible tras fallo. Compila; falta verificar transacciones/red real.
- [ ] GP-05 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: lectura de foto/portada de Perfil en IO y guardia de doble guardado. Compila; falta probar archivos grandes.
- [ ] GP-06 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: Auth limpia backstack; navegación de lección singleTop; BackHandler incluye diálogos y confirma salida de lección. Falta recorrido Android.
- [ ] GP-07 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: intents de Simulador/Vocacional/Legal capturan ActivityNotFound/SecurityException y muestran aviso. Falta comprobar dispositivo sin manejador compatible.

## Cambios solicitados

- [x] GP-08 CORREGIDO Y VALIDADO (AMPLIACIONES): 50 complementos de teoría en niveles existentes, MD oficial desglosado y fixtures sincronizados. Catálogo de Obras ampliado a 48 fichas individuales y obras requeridas ausentes incorporadas; IDs previos preservados. Tests de fichas/matriz/carga/sanitizador pasan. **No equivale a catálogo académico global limpio: GP-20 es bloqueante.**
- [ ] GP-09 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: ficha de Obras desplaza título/ficha/tabs/lectura con solo banner fijo; etiquetas sin Clave, selector Listado/Portadas inequívoco. Compila, revisión visual pendiente.
- [ ] GP-10 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: acceso cartoon, Google destacado, Loki Clásico META CUMPLIDA real, texto preuniversitario sin UNSA, contraseña sin trim, operaciones Auth cancelables con timeout de red/estado restituido. Paletas legibles; falta Google firmado y visual.
- [ ] GP-11 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: Material You MEDIUM por defecto solo sin preferencia; fondo académico para todos, OFF inicial, paths estáticos 2× con mayor grosor/densidad. Pruebas de tema/contraste/background pasan; faltan temas y tablet reales.
- [x] GP-12 CORREGIDO Y VALIDADO: Pizarra sin marcas ajenas/GoodNotes ni reclamos de 0 ms; código revisado, debug/release pasan.

## Consolidación de auditorías

- [ ] GP-13 CONFIRMADO PARCIALMENTE: Play Console contiene un único bundle 1.0/code 1; lanzamiento 1.0 BETA en Alpha. No hay 1.0.3 subida. SHA-1 y SHA-256 Play registradas en Firebase; JSON oficial idéntico al local. Última instrucción: no generar APK/AAB, subir ni cambiar versión local. Artefacto anterior solo como evidencia histórica. Pendiente prueba física de distribución firmada por Play.
- [x] GP-14 DESCARTADO — FALSO POSITIVO: API 36 estable y exigida por Google Play desde agosto de 2026. No se aplicó el downgrade 35 del informe. Fuentes oficiales en VERIFICACIONES_PROPIETARIO.md/nota inferior.
- [x] GP-15 CORREGIDO Y VALIDADO: R8 activado y assembleRelease/lintVital pasan. Gradle ya no copia/modifica assets de copia rastro react. Lista de videos con keys de ID+posición original (admite videos repetidos y búsquedas). Recursos PNG locales conservados; no se borraron archivos archivados. Adaptive Icon era recomendación opcional de apariencia, no fallo confirmado de publicación: se conservan logos existentes y aliases.
- [ ] GP-16 REQUIERE INTERVENCIÓN DEL PROPIETARIO: Auth-first y cleanup idempotente implementados; 3 tests cleanup y 4 tests de reglas pasan. Reglas respaldadas, desplegadas y contenido activo verificado. Functions account-cleanup requiere Blaze; proyecto sigue Spark, sin cambio de facturación. Pendiente Functions y cuenta descartable. Data Safety pendiente; no se eliminaron cuentas ni datos.
- [ ] GP-17 CONFIRMADO PARCIALMENTE: Google/email/anónimo habilitados; Cloud confirma Drive API habilitada, OAuth externo/en producción y cuatro scopes no sensibles email/profile/openid/drive.file. SHA-1 y SHA-256 Play registradas; JSON oficial idéntico al local. Índices de ligas correctos. Pendiente Data Safety y publicar App Links con Play; no hay fuente/configuración Hosting del sitio en checkout, no publicar sitio parcial. Acceso a producción pendiente del periodo de prueba. Detalle en docs/publicacion/VERIFICACIONES_PROPIETARIO.md.
- [ ] GP-18 REQUIERE PRUEBA FÍSICA: propietario confirma que Aprender ya no se cierra (GP-01). Quedan Pizarra, Ranking/red, Auth/Drive, temas, Obras, navegación y aislamiento entre cuentas. APK preparado; agente no lo instaló/ejecutó, conforme AGENTS.md.
- [ ] GP-19 IMPLEMENTADO — REQUIERE PRUEBA FÍSICA: WidgetDates sin !!; doble publicación/guardado impedida; AddObra selecciona localmente y sube al guardar, lectura IO, preview reducido/MIME correcto. Auth Google/email/guest/recuperación liberan loading por error/cancelación/timeout. Tests/Kotlin pasan; falta subida/cancelación real.
- [ ] GP-20 REQUIERE INTERVENCIÓN DEL PROPIETARIO — BLOQUEANTE ACADÉMICO HEREDADO: CatalogValidator encuentra 182 DUPLICATE_QUESTION_STATEMENT y 14 DEPTH_CHALLENGE_SHORTFALL en los 50 niveles revisados, antes y después de complementar. Álgebra, Geometría, Trigonometría, Química, Física e Inglés contienen preguntas genéricas/repetidas. No se alteró el validador ni se fabricó contenido para ocultarlo. Conforme AGENTS.md se detuvo la ampliación de corrección de bancos ajenos; falta banco/solucionario verificable o nueva intervención académica explícita. Detalle: docs/aprender/VALIDACION_CATALOGO_2027.md.

## Evidencias comprobadas

- `build/aprender-crash-actual.log`: fallo físico original; refuta la conclusión previa «ejercicios 100% sin fallos».
- `build/audit-codegraph-lesson.log`: localización/impacto con CodeGraph, contrastado con código.
- `build/audit-complete-tests.log`: 185 shared + 100 Android, 0 fallos. Incluye piloto de Biología 0 errores/advertencias, matriz, actividades especiales, temas, Obras, memoria y regresiones por materia. La prueba de complementos conserva visibles los errores heredados del banco.
- `build/audit-final-release.log`: assembleRelease + lintVital + R8 correctos; AAB release firmado verificado posteriormente; ver docs/publicacion/RELEASE_PREPARADO.md. Captura Play aporta firma SHA-256 3D:8B…; assetlinks público (HTTP 200, revisado 04/10) contiene solo carga 4D:20… y omite Play. JSON corregido preparado en docs/publicacion/assetlinks.json, sin desplegar.
- `build/audit-final-apk.log`: compilar_app.bat / assembleDebug correcto. APK: androidApp/build/outputs/apk/debug/androidApp-debug.apk.
- `build/audit-account-cleanup-tests.log`: 3 casos, 0 fallos, base de datos simulada.
- `build/audit-firestore-rules-tests.log`: 4 casos, 0 fallos; compilación/evaluación de reglas reales en Firebase demo aislado, sin producción ni ejecución de Android. PermissionDenied del log son pruebas negativas esperadas.
- `build/complement-catalog-validation.txt`: validación completa de 50 complementos, 182/14 incidencias heredadas; no se presenta como 0/0 global.
- `build/audit-final-diff-check.log`: sin errores de whitespace (avisos LF/CRLF del checkout).

## Hallazgos descartados / límites

Los adjuntos c8d31475/f4449b37 y la auditoría de archivos muertos eran duplicados; revisados una vez. No se eliminaron LokiLab, recursos, contenido legacy ni curso-prueba por sugerencias de limpieza. Fénix descontar otra vida ante otro fallo es comportamiento existente solicitado; no se reescribió. No hay dependencia Crashlytics (la auditoría la daba por confirmada); Analytics sí está presente. No se certifica TLS 1.3 en todos los enlaces, ausencia total de ANR ni seguridad antifraude de progreso calculado en cliente. Las comprobaciones locales no sustituyen pruebas firmadas/de backend.

Fuentes API 36: https://support.google.com/googleplay/android-developer/answer/11926878?hl=en-EN y https://android-developers.googleblog.com/2025/06/android-16-is-here.html.

**Estado: 🔴 RASTRO NO ESTÁ LISTA PARA GOOGLE PLAY.** Pendientes concretos: GP-20 banco académico; GP-16 despliegue y borrado real; GP-13/17 firma/versionado/OAuth/Drive/Data Safety; GP-18/19 confirmación física. Trabajo autónomo de la intervención implementado y comprobado, sin ocultar defectos heredados.

APK debug final SHA256: 7CFBC1E861FF337B0CDFB4AAFA25C27B8D04EE32F0AA4A0E9DBFD353DAE7E2A3 (04/10/2026, 92 MB). No instalado ni ejecutado.

