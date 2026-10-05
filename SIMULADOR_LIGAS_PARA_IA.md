# Simulador, Ligas y Examen Ranking — siguiente IA

Leer [documentación del módulo](docs/simulador/README.md), su CHECKLIST/DECISIONES/CAMBIOS y SKILLS_GUIA.md antes de cambiarlo. Usar CodeGraph para revisar conexiones y confirmar en código real.

- UI: `SimuladorScreen.kt` (motor y cinco herramientas), `LeaguesScreen.kt` (podio, páginas reales y posición personal).
- Modelos/configuración: `shared/.../model/CompetitionModels.kt`; `LeagueCatalog`, `RankingExamConfig`, `RankingExamCatalog`, `ExtraAttemptUnlocker`.
- Configuración remota: `oficiales/ranking_<area>`; maxAttempts null = ilimitados, entero positivo = límite; audience EVERYONE/SELECTED_USERS, eligibleUids, minimumLevel, version.
- Persistencia: `LeagueRepository.kt` → `RankingExamRepository.reserve/complete/usage/config`, colección existente ranking_simulacros. Abandonar consume el intento; reenvío del resultado es idempotente.
- Clasificación principal por EXP; RACHA ordena adicionalmente la misma liga. Nunca crear otra liga o saldo. EXP de exámenes = `GamificationManager.EXAM_CORRECT_XP` (5) por acierto, con recibo de intento existente.
- Calcular con pesos de `SimuladorRepository`; no reasignar asignaturas ni inventar preguntas para rellenar Ranking. Puntaje Ranking normalizado, distinto del oficial.
- Extensión vídeo: implementar `ExtraAttemptUnlocker` y concesión verificada en servidor sobre extraAttempts. No mostrar anuncios/controles mientras no exista servicio real.
- Arte: SVG en `androidApp/src/main/assets/competition`; render en VectorDrawable equivalente. Al cambiar SVG actualizar XML. No tocar geometría Classic.
- Índices: firestore.indexes.json, firebase.competition.json. Solo se desplegaron índices; no ampliar reglas al continuar sin revisar requisitos.
- Tests: CompetitionTest, RankingBankTest, LearningRewardsTest y políticas existentes. No ejecutar app/APK bajo AGENTS actual. No marcar validación visual o nube como hecha por compilar.
