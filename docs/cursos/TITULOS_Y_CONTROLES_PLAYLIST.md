# Títulos y controles de playlists — 04/10/2026

Ámbito: CursosScreen, YouTubePlaylistQueue, YouTubeVideoTitles, pruebas y documentación de Cursos; FlashcardsQuickDeck/FlashcardPresentation y documentación de Simulador. androidApp/build.gradle.kts expone la misma kotlinx.serialization.json que ya usa el proyecto para leer y probar metadatos. No se modificó contenido académico, personajes, navegación, progreso ni publicación remota.

## Cursos
- CoursePlaylistCard no abre el reproductor al pulsar el contenedor. El botón Ver Lista de Clases lo abre; el switch Compartir junto al engranaje usa el callback existente y queda deshabilitado mientras guarda.
- Modal más alto según espacio seguro disponible (máximo 1000 dp), dos paneles desde 620 dp. Acceso externo a YouTube debajo del reproductor, título y navegación.
- Data API conserva sus títulos. Si faltan, YouTubeVideoTitles obtiene el título original mediante oEmbed público, cuatro solicitudes simultáneas, timeout de cinco segundos, caché en memoria de 24 horas limitada a 500 títulos. Sin descargar medios ni extraer páginas. No cambiar los títulos manuales de listas personalizadas.
- La cola IFrame mantiene todos los IDs; no fabrica nombres Clase N. Metadatos inaccesibles se muestran como Título no disponible. Búsqueda por título y LazyColumn para no componer toda una playlist larga.
- El reproductor oficial y sus controles/branding permanecen. La acción de compartir mantiene las reglas/persistencia anteriores; no se desplegó Firebase.

## Flashcards
FlashcardsQuickDeck conserva filtros, autor, reportes y edición. Ambas caras usan un marco de 260–380 dp según altura de pantalla; el cuerpo puede desplazarse y se reinicia al cambiar tarjeta/cara. Respuesta corta centrada y semibold; fundamento existente alineado al inicio con fuente menor y peso normal. FlashcardPresentation separa únicamente encabezados Fundamento/Explicación ya presentes, sin resumir ni modificar el contenido. Vectores locales trail_book_open, trail_lightbulb y trail_notebook_pen; colores de texto/superficie derivados del tema.

## Comprobación
Registro: build/playlist-flashcard-final.log. Pruebas: YouTubePlaylistPagesTest, YouTubeVideoTitlesTest, FlashcardPresentationTest y CatalogPilotValidationTest. No se ejecutó la app: revisión visual/táctil en dispositivo pendiente, conforme a AGENTS.md. Sin commit ni push.
