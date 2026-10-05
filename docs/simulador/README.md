# Simulador y Ligas

## Flujo y ámbito

`RastroApp` conserva `simulador`; añade `ligas` y `examen-ranking` (este último reutiliza `SimuladorScreen(initialTab = 4)`, no otro motor). Perfil → Ligas abre Ligas; Perfil → Racha abre el calendario existente. La barra conserva sus siete accesos; Simulador tiene un documento de examen como icono, distinto del trofeo de ranking.

`SimuladorScreen` abre por defecto Simulacro normal. Los cinco accesos visibles son Simulacro normal, Examen Ranking, Examen rápido, Flashcards y Calculadora. Se distribuyen según el ancho; una única lista vertical contiene configuración/calculadora/flashcards. Examen y resultado tienen su propio desplazamiento, no un scroll vertical anidado dentro del menú. Se conservan filtros, favoritos, reportes, creación de preguntas/tarjetas, orden de examen y comparativa de cortes del simulacro normal.

La calculadora usa `SimuladorRepository.projectedScore`, límites y valores reales de `getPonderaciones(area)` por asignatura. La distribución informativa también deriva de esos mismos datos, sin tablas de pesos inventadas.

## Una sola progresión

`shared/.../model/CompetitionModels.kt`: `LeagueCatalog` conserva Wawita (nivel 1), Kinder (5), Prefósil (10), Fósil (20), Futuro Cachimbo (30). Los umbrales de EXP son 0, 400, 900, 1900 y 2900. HUD y Ligas utilizan el mismo catálogo. `movement` reconoce ascenso/descenso por cambio del saldo; no se inventa descenso semanal ni se descuenta EXP por perder racha.

La clasificación principal ordena EXP. RACHA es una vista adicional de **la misma liga**, sin cambiar membresía. `LeagueRepository` consulta perfiles reales de `usuarios`, filtra `leagueId`, ordena por `leagueXp` o `leagueStreak` y desempata por ID. Páginas de 25 con cursor; podio 1–3 y lista desde 4. `personal` usa `endBefore(documento).count()` para una posición exacta incluso fuera de la página cargada. Errores de red y liga vacía son explícitos; no se añaden competidores ficticios.

`GamificationRepository.save` guarda el progreso privado existente y un resumen público (leagueId/leagueXp/leagueStreak) en un batch. Los perfiles antiguos entran a la clasificación al sincronizarse; no se realizó una migración masiva ni se leyó toda la colección. Invitados pueden consultar pero no publicar ni participar en Examen Ranking.

## Examen Ranking

Modelo: `RankingExamConfig`; valores iniciales: `RankingExamCatalog.forArea`. Configuración remota editorial opcional en `oficiales/ranking_biomedicas`, `oficiales/ranking_ingenierias` o `oficiales/ranking_sociales`. Se usan las reglas existentes de lectura pública y escritura del autor, sin cambiar/desplegar reglas.

Campos del documento:

```json
{"title":"Examen Ranking","maxAttempts":null,"audience":"EVERYONE","eligibleUids":[],"minimumLevel":1,"version":1}
```

`maxAttempts`: null/ausente = ilimitados; entero positivo = 1, 2, 3, N. `audience`: EVERYONE o SELECTED_USERS; en el segundo caso `eligibleUids` es la lista permitida. `minimumLevel` restringe por el nivel actual. La versión forma parte de la clave del examen; subirla inicia un contador separado y debe corresponder a una nueva edición. Configuración corrupta/error de carga impide empezar; no se convierte en un límite ilimitado silenciosamente.

`RankingExamRepository.reserve` lee esa configuración de nuevo dentro de la transacción y consume un intento **antes** de comenzar. Guardado en `ranking_simulacros`: resumen `${uid}_${config.key}` con attemptsUsed/extraAttempts/bestScore, e intento UUID con uid/examKey/STARTED. Abandonar cuenta como intento usado. `complete` verifica propietario/edición, marca COMPLETED y guarda resultado y mejor puntaje una sola vez. Reintentar envío no consume otro intento ni duplica el resultado. Sin conexión no se permite empezar una competición que necesita transacción.

El papel Ranking contiene 80 preguntas reales del banco existente, solo asignaturas con peso conocido. Si faltan asignaturas del reparto oficial, usa más preguntas de asignaturas realmente disponibles **sin cambiarles su identidad**. `rankingScore` normaliza los pesos del papel a 0–100; no es el puntaje oficial UNSA y no se compara con cortes de carreras. El simulacro normal y su cálculo oficial no cambian. No se modificó el banco académico.

**EXP:** la aclaración final del usuario mantiene clasificación por EXP. Tanto exámenes como lecciones alimentan `GamificationManager`; exámenes usan `claimExamReward(attemptId, correctCount)` y `EXAM_CORRECT_XP = 5`. 0 aciertos → 0 EXP; 80 → 400 EXP, sin premio fijo por terminar y sin otro saldo. El puntaje competitivo se guarda como dato adicional, no reemplaza la EXP de ligas. Para ajustar el premio, cambiar la política existente y sus tests; nunca añadir un segundo gestor.

## Extensión de vídeos e insignias

`ExtraAttemptUnlocker` es el contrato suspendido para un futuro desbloqueo verificado. `extraAttempts` amplía el límite en el resumen de intentos y ya participa en la comprobación. No hay SDK, botones ni llamadas de anuncios. Cuando se conecte, la concesión debe validarse e identificarse en servidor para evitar repetir el mismo recibo. El flujo actual valida en cliente/transacciones con las reglas existentes; no añade un backend antitrampas.

SVG editables: `androidApp/src/main/assets/competition/`. Insignias Wawita/brote, Kinder/libro, Prefósil/huevo, Fósil/hueso y Cachimbo/birrete; documento de examen y trofeo distintos. La app dibuja sus pares XML de `res/drawable` sin librería pesada de SVG. Al reemplazar un SVG, actualizar su VectorDrawable y el mapeo `LeagueBadge` si cambia el nombre. No sustituir el rig Classic por imágenes.

## Validación e infraestructura

Índices definidos en `firestore.indexes.json`; configuración aislada `firebase.competition.json`. El despliegue realizado fue **solo** `firestore:indexes` en rumbo-jonsu, sin modificar reglas/datos de usuarios. Evidencia en `build/ligas-indexes-deploy.log`. Consultas/cursor/conteo se apoyan en [Firestore](https://firebase.google.com/docs/firestore/query-data/query-cursors); distribución adaptable nativa [Compose](https://developer.android.com/develop/ui/compose/lists).

Pruebas: `CompetitionTest`, `RankingBankTest`, `LearningRewardsTest`, `RastroCoreTest`, `CatalogPilotValidationTest`, `LearningArtworkPolicyTest`. Compilar/tests sin ejecutar app ni generar APK. Ver CHECKLIST para límites reales de comprobación visual y nube.

## 04/10 — Recompensas y matriz UNSA
Detalle vigente: [MATRIZ_2027_Y_REFERENCIAS.md](MATRIZ_2027_Y_REFERENCIAS.md). Sustituye políticas anteriores incompatibles.
