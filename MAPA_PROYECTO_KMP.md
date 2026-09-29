# MAPA DEL PROYECTO KMP — qué hace cada parte y qué tocar
> Réplica nativa RASTRO · Kotlin Multiplatform (`shared/` + `androidApp/`) · paquete `com.jonsuapps.rastro`
> Repo: `JONSU-AG/RASTRO-KMP` · rama `main` · Firebase `rumbo-jonsu`
> ESTE MD es el paso 1 para conocer el proyecto. Nada aquí se borró: lo sin uso está en `basura/` (§8).

## 0. Estado al escribir esto
- Último commit subido: `1d01b6b` ("chore: sync", 18 archivos: 3 componentes lección + validación catálogos + test piloto).
- Cambios SIN subir (otra IA trabajando Aprender): `AprenderScreen.kt`, `AprenderSubjectDetailScreen.kt`,
  `LearningTrail.kt`, `LessonEngineScreen.kt`, `AprenderRepository.kt`, `LearningPathCatalog.kt`,
  `Filosofia/Geografia/PsicologiaCatalog.kt` → no tocarlos sin coordinar.
- Compila con: `compilar_app.bat` (`assembleDebug`). Verifica con `verify_project.bat`.

## 1. Arranque (cómo nace la app)
1. `AndroidManifest.xml` → `application .android.RastroApplication` + `MainActivity` (LAUNCHER, `singleTask`, App Links `https://rumbo-jonsu.web.app`).
2. `RastroApplication.onCreate()`: init `FirebaseApp`, Firestore caché 100MB, `FavoritesRepository.init()`,
   `LimaStudyReminderWorker.enqueuePeriodicWork()`, `StudyPresenceTracker` vía `ActivityLifecycleCallbacks`.
3. `MainActivity`: edge-to-edge + MaterialYou dinámico + `MaterialTheme` → `RastroApp()`.
4. `ui/RastroApp.kt` (747 lín.): `NavHost` + `LiquidNavbar` + `TopHeaderActions` + modales globales
   (notificaciones, ⋯, temas, perfil, términos, Pomodoro, LokiLab solo-admin, vocacional, bienvenida,
   widgets, tabla periódica, anuncio entrada, anti-abandono racha). Resuelve `FirebaseAuth`,
   `UserManager`, `GamificationManager.checkStreak()`, `NotificationRepository.observe()`.
- Navegación real (`RastroScreen.kt`, 19 rutas): home, aprender, aprender/{subject}, leccion/{lessonId},
  cursos, cursos/{id}, biblioteca, formulario, flashcards (=Formulario cara 3), simulador, pizarra,
  perfil, usuario/{uid}, auth, admin, legal×5. **Archivadas** (ruta existe, sin `composable`):
  `orstty`, `chats` — la barra las reemplazó por Pizarra. No borrar: se pueden reactivar.

## 2. `shared/` — lógica común (commonMain)
| Carpeta | Qué hace | Qué tocar cuando… |
|---|---|---|
| `auth/` (`AdminConfig`, `UserManager`) | 5 correos autor + `isAuthorOfFirebase()`; sesión en memoria (`StateFlow`), guardados mnemotecnias/obras | Cambiar admin o sesión |
| `community/` | Modelos y muro en memoria (`createPost`, reacciones, comentarios, reputación) | Muro/biblioteca social |
| `data/` (`Aprender/Cursos/Mnemotecnias/Literatura/Simulador/OrsttyService`, `LearningPathCatalog`) | Fachadas de contenido. `OrsttyService` es MOCK sin red. Catálogos 15 materias en `data/catalog/` (~40k lín., `BiologiaCatalog` y `QuimicaCatalog` son wrappers de Part1+Part2) | Contenido Aprender (coordinar: otra IA lo está editando) |
| `gamification/` | `GamificationState` (xp/racha/vidas=200/nodos) + `GamificationManager` (racha/XP hora Lima) | Racha, XP, recompensas |
| `model/` | `UserData`, `AprenderModels`, `SimuladorModels`, `ChatModels`, `LiteraturaModels`, `MnemotecniaModels`, `AuthResult` | Nuevos datos = nuevo `data class` aquí |
| `navigation/` | `RastroScreen` sellada (19 rutas + `createRoute`) | Nueva pantalla = nueva ruta aquí + `composable` en `RastroApp` |
| `pomodoro/` | `PomodoroState` (modos, sonidos, `ViewState`, `DockSide`) | Temporizador |
| `theme/` | 9 temas + `RastroPalette`, `RastroShapes` (Squircle/Pill), `ThemeManager` | Colores, temas, radios |
| `utils/` | `AcademicSanitizer` (áreas/anti-contaminación), `VideoValidation` (solo YouTube público) | Validaciones |
| `validation/` | **Nuevo** `CatalogValidator.kt` (reglas pedagógicas: aprendizaje previo, explicaciones, opciones plausibles, sin huerfanos); `CatalogPilotValidationTest.kt` (test piloto contra catálogos reales) | Validación catálogos |
| `commonTest/` | `RastroCoreTest`, `LearningRewardsTest`, **nuevo** `CatalogPilotValidationTest` | Tests shared |

## 3. `androidApp/` — Android nativo
| Carpeta | Qué hace | Qué tocar cuando… |
|---|---|---|
| `data/` (12 repos `object`) | Firestore/SharedPrefs: Chat, ExamQuestion (lee `assets/bancoPreguntasCepreunsa.json` 6.5MB), Flashcard, Favorites (local: `getByType/BySubject/ByArea/Mix`), Formulas (423 lín.), Gamification (local+nube), Notification, OfficialMaterial, UserPlaylists, UserProfile (follows, rachas duales), UserUpload (muro/biblioteca, 529 lín.), ErrorBank | Cualquier dato con red o guardado |
| `ui/screens/` (27) | Pantallas §1: `Home`, `Aprender*`, `LessonEngineScreen` (1266 lín., teoría+quiz+victoria), `LearningTrail`+`LearningRewards`+`LessonEmblems`, `Cursos` (WebView YouTube), `Biblioteca` (1695 lín., la mayor: muro+literatura), `Formulario`, `CourseFlashcardsDialog`, `Simulador` (1935 lín., UNSA 80 + ponderado), diálogos crear/reportar pregunta, `Chats`, `Orstty` (mock), `Pizarra` (canvas), `UserProfile` (2204 lín., el mayor: perfil+muro+errores), `Auth` (CredentialManager+haptics), `Admin` (1049 lín.), `Legal`, `PeriodicTableDialog`+`PeriodicElementCatalog`, `BookEditorDialog`, `CommunityWallComposer`, `UserUploadPreview` | UI de cada sección |
| `ui/components/` (25) | `LiquidNavbar`+header, `Mascots` (ORSTTY/ARTYON por `MascotMood`), `CartoonAvatar`+`CachedRemoteImage`, `AnimationModifiers` (motion/sticker 3D, 858 lín.), `BannersAndModals` (temas, vocacional, stickers), `LucideAnimatedIcons`, `MathFormulaRenderer`, `GoodNotesTheoryView`, `DuolingoHaptics`, `PomodoroModal`+`PomodoroFloatingPill`, `NotificationsDialog`, `MoreActionsDialog` (`MoreAction`: FORMULAS/POMODORO/WIDGETS/…/LOKI_LAB), `ProfileSettingsDialog`, `UploadMaterialDialog`+`EditUploadDialog`, `ReportPostDialog`, `TermsAndPrivacyDialog`, `EntryAnnouncementDialog`, `ExitStreakPromptDialog`, `WelcomeOnboardingDialog` (permiso POST_NOTIFICATIONS), `WidgetsAndShortcutsDialog`, **nuevos**: `AcademicIllustration` (ilustraciones curso), `LessonContentRenderer` (render teoría/quiz), `LessonPresentationPopup` (modal teoría) | Piezas reusables |
| `ui/previews/` | `RastroGalleryPreviews` (13 `@Preview`) — solo diseño, cero runtime | Previsualizar |
| `ui/mascots/loki/` (20 kt + README/RETOMAR) | **Loki Lab**: editor de personajes vectoriales + recompensas. Solo admin (`MoreAction.LOKI_LAB`, `AdminConfig.isAdmin`). Experimento, no flujo principal | Solo si se trabaja Loki |
| `widgets/` | `RastroWidgetManager` + 4 providers (racha, semanal, examen, motivación) + layouts `res/layout/widget_*` | Widgets launcher |
| `notifications/` | `LimaStudyReminderWorker` (WorkManager cada 3h, hora Lima UTC-5) | Avisos fondo |
| `gamification/` | `StudyPresenceTracker` (cuenta presencia, lo llama Application) | Tiempo de estudio |
| `audio/` | Vacía tras limpieza (ver §8) | — |
| `util/` | `ImageCacheManager` (caché SHA256 memoria+disco) | Imágenes remotas |

## 4. Recursos (`androidApp/src/main/res/` + `assets/`)
- `drawable/`: PNG mascotas usadas (`orstty_feliz/contento/guinando/pensativo/sorprendido/timido/triste/enojado`, `artyon_feliz/emocionado/pensativo/sorprendido/guinando/timido/triste/enojado`), `app_logo.png` (icono Manifest), `astro_logo.png` (navbar), `ic_course_*` XML (14, los usa `LearningTrail`), `ic_nav_*` filled/outline (7×2), `ic_reaction_fire/heart`, `ic_tiktok/whatsapp`, `ic_launcher.xml`, `widget_card_background.xml`, `avatar_maneki_neko.xml` (fallback avatares).
- `layout/` (4, solo widgets), `values/` (`strings` solo app_name, `colors` accent+fondos+mascotas, `themes` NoActionBar), `xml/` (4 infos de widget declarados en Manifest). Sin `mipmap`, sin `values-night`.
- `assets/`: `bancoPreguntasCepreunsa.json` (6.5MB, lo carga `ExamQuestionRepository`) — no duplicar ni mover.
- Regla: PNG foto → `drawable/`, icono simple → XML vectorial, datos grandes → `assets/`.

## 5. Raíz: docs, scripts y datos de trabajo
- Docs: `README.md` (arquitectura), `PLAN_MIGRACION_KOTLIN.md`, `PLAN_UI_UX_KMP.md`, `TEMARIO_OFICIAL_UNSA.md`,
  `SKILLS_GUIA.md`, `ESTILO_QUE_AMA_EL_PROGRAMADOR.md`, `.agents/skills/*` (Compose, Firebase, Play policy).
- Scripts que SÍ se usan: `compilar_app.bat`, `verify_project.bat` (+`test.bat`), `subir_a_github.bat`,
  `clasificar/reparar_banco*.bat`, `copy_mascots.*` (regenera drawables desde `copia rastro react/`).
- Datos de trabajo (NO son basura, los usa Antigravity): `CONTENIDO_PEDAGOGICO/`, `TRANSCRITO/`,
  `CHECKLIST_*.md`, `copia rastro react/` (web anterior, fuente de `copy_mascots`), `tools/*.py` (banco).
- `firestore.rules` (autor por 5 emails), `google-services.json` (`rumbo-jonsu`), `gradle.properties`,
  `libs.versions.toml` (Kotlin 2.1, AGP 8.8, Compose 1.7).

## 6. Qué tocar según la tarea (atajos)
| Quiero… | Toco… |
|---|---|
| Nueva pantalla | `RastroScreen.kt` + `composable` en `RastroApp.kt` + archivo en `ui/screens/` |
| Cambiar Inicio/Aprender/Cursos/… | Su `*Screen.kt` (no los de §0 sin coordinar) |
| Nuevo dato local | `shared/.../model/` + repo en `androidApp/.../data/` |
| Contenido lecciones/banco | `shared/.../data/catalog/` + `assets/*.json` (con la IA de contenido) |
| Racha/XP/notifs/pomodoro | `gamification/`, `LimaStudyReminderWorker`, `Pomodoro*` |
| Widget launcher | `widgets/` + `res/layout/` + `res/xml/` + Manifest |
| Permisos/firma/versión | `AndroidManifest.xml`, `androidApp/build.gradle.kts` (`v1.0.3(3)`, SDK 36/24) |
| Reglas nube | `firestore.rules` (deploy manual con permiso) |

## 7. Convivencia (3 IAs a la vez)
Ramas por IA, nadie toca archivos ajenos; `build.gradle`/`libs.versions` con dueño único;
commits pequeños listando archivos; paridad contra este mapa; merge a `main` y rebase diario.
Archivos en edición activa (§0): prohibido tocarlos sin coordinar.

## 8. `basura/` — movido SIN borrar (verificado sin referencias el 2026-09-28)
| Elemento | Por qué salió |
|---|---|
| `androidApp/.../assets/course-icons/*.svg` (15) | Duplican a `ic_course_*` XML que sí usa `LearningTrail`; ningún loader SVG en la app |
| `res/drawable/banner_coraje.xml`, `artyon_banner.png`, `orstty_artyon.png`, `orstty_artyon2.png` | Cero refs en código; los 3 PNG se regeneran solos con `copy_mascots`/`build.gradle` |
| `res/drawable/artyon_asustado(2).png`, `artyon_confundido.png`, `artyon_contento.png`, `orstty_asustado(2).png` | Emociones que `Mascots.kt` nunca mapea (verificado `getOrsttyDrawable/getArtyonDrawable`) |
| `res/drawable/ic_launcher_round.xml`, `ic_reaction_star.xml` | Manifest usa `app_logo`; reacciones usan fire+heart |
| `audio/SineWaveSynthesizer.kt` | Solo se referencia a sí mismo (mencionado en README); el audio real es LokiRewardAudio |
| `LOKI` (raíz, 1MB) | En raíz no lo alcanza la app en runtime; sin referencias |
| `tools/test.js`, `test.ps1` | Triviales (`console.log`/eco), sin referencias |
| `basura/LEEME.md` | Este inventario de basura |
- NO se movió (aunque parecía): `OrsttyScreen`/`ChatsScreen` (rutas archivadas, reactivables),
  Loki Lab (lo usa admin), previews, `avatar_maneki_neko`/`astro_logo`/`ic_course_*` (en uso),
  `widget_card_background` (lo usan los 4 layouts), datos de trabajo §5. Restaurar = `git mv` inverso.
