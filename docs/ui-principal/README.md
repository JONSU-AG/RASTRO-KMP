# Pantallas principales, recompensas y enlaces

Ámbito del pedido del 03/10/2026: interfaz principal de Android, entrega de XP de Aprender/Simulacro, reportes de preguntas y recepción de enlaces. Conserva el rig Classic, los catálogos y las ponderaciones académicas.

## Implementación

- `RastroApp`: cabecera existente y HUD fuera del scroll únicamente en Aprender/AprenderSubject; oculto en lecciones y Simulacro. Navegación al mensual, ligas y fichas.
- `LearningProgressHud`: cuatro controles persistentes, ligas y recepción visual de XP. `XpDelivery` transporta recibos; nunca concede XP.
- `GamificationManager`: saldo compartido, cofre idempotente y recompensa de simulacro identificada por intento. El guardado local/Firestore conserva `claimedExamRewards` con compatibilidad con estados anteriores.
- `LearningArtwork`: llama al rig nativo Classic. Tres estrellas: Feliz/Enamorado; dos: leer/lanzar/explosión; cero/una: Triste/Enojado. Personaje aleatorio sin preferencia, elección estable y máximo dos repeticiones cuando hay alternativas (explosión es excepción confirmada). Fénix usa noqueado. Footer de bienvenida y racha usan velocidad 2x, sin cambiar geometría.
- `MainPageEnd`: solo rutas principales mediante `LocalMainPage`; no aparece en lecciones, perfiles ajenos ni detalles.
- Inicio, Biblioteca, Cursos y publicaciones de Perfil usan columnas adaptativas según ancho de ventana; libros tienen vista detallada y portadas. Las imágenes se dimensionan por su proporción sin franjas añadidas por una altura fija.
- `AcademicReportRepository`: envía preguntas a `reportes_ugc`, la bandeja que ya observa Admin; muestra error si falla. Las acciones de borrar/ocultar publicaciones están deshabilitadas para reportes académicos.
- `RastroAppLinks`: comparte enlaces HTTPS de perfil/publicación y recibe intents iniciales y nuevos. Admite enlaces antiguos con hash y restringe el dominio y la ruta.

## Skills usadas

CodeGraph local 1.6.2, Compose Vector Animations, Bouncy Microinteractions, Playful Cartoon UI, Material3 Google y Firebase Scalability and Performance. Ver `SKILLS_GUIA.md` y `.agents/skills/codegraph/SKILL.md`. CodeGraph se instaló localmente, con índice local y telemetría desactivada, sin iniciar daemon/watcher ni modificar la configuración MCP.

## Límites de verificación

No se lanzó la app ni se generó APK en esta intervención, conforme al AGENTS.md adjuntado. Las pruebas JVM no sustituyen la comprobación visual en teléfono/tablet, una entrega real con Firestore ni la selección del manejador de enlaces por Android. Tampoco se implementó detección física de bisagra; el diseño responde al ancho disponible de la ventana.

## Adaptación global por ancho — 03/10
RastroAdaptiveLayout.kt es la política común de presentación para Home, Cursos, Aprender, Perfil y Biblioteca/aportes. No decide rutas ni consulta datos. RastroAdaptiveViewport mide el ancho REAL disponible, proporciona LocalRastroLayout y limita el contenedor antes de fillMaxSize. RastroBoundedBlock limita contenido de items con span completo manteniendo sus índices, claves y comportamiento de scroll.
COMPACT <600 dp: una columna y distribución móvil existente. MEDIUM 600–839 dp: una columna centrada de hasta 680 dp. EXPANDED >=840 dp: feed de hasta 1200 dp, dos o tres columnas solo cuando cada celda conserva mínimo 360 dp incluyendo gutters/gaps. Aprender usa reader=true (máximo 640 dp) y mantiene el camino único. Bloques completos hasta 720 dp y hero de Home hasta 520 dp. El grid de portadas 120 dp conserva su sistema independiente.
RastroMediaFrame conserva la proporción de imágenes/PDF y ContentScale.Fit. En Medium/Expanded reduce ancho proporcionalmente para limitar previews verticales a 360 dp de alto; el visor completo sigue existente. En Compact conserva el dimensionado anterior. CourseBannerSurface limita su altura mínima automática a 180 dp: el contenido puede requerir altura natural adicional sin recortarlo.
Usar el mismo viewport/política al añadir nuevas secciones principales; no volver a usar fillMaxSize antes de widthIn ni medir el ancho total del dispositivo cuando la ventana está dividida. Responde al ancho de foldables abiertos; no implementa detección física de bisagra.

## Piloto temporal Fondo académico (solo Admin)
Ver [FONDO_ACADEMICO_PILOTO.md](FONDO_ACADEMICO_PILOTO.md): activación en selector existente, autorización/UID, renderer cacheado, scope, evidencia, checklist visual/rendimiento y retirada sin revertir trabajo previo.

## Tema adaptable y contraste
Ver [TEMAS_INTENSIDAD_Y_CONTRASTE.md](TEMAS_INTENSIDAD_Y_CONTRASTE.md): tres intensidades guardadas, roles legibles y alcance de validación.
