# Cursos: playlists privadas y compartidas

Ámbito: CursosScreen, UserPlaylistsRepository, SharedPlaylistsRepository, YouTubePlaylistQueue, YouTubePlaylistPages y regla rastro_yt_playlists. Sin tocar catálogo académico, navegación, personajes ni otras pantallas.

## Vistas
- Comunidad es la pestaña inicial: exclusivamente proyecciones públicas de playlists de usuarios; no cursos precargados ni videos sueltos del catálogo.
- Mías: listas locales de la cuenta actual, privadas por defecto.
- Compartidas: filtro de Mías por publicaciones propias; botón Dejar de compartir. Borrar una lista compartida retira primero la publicación; si falla, no se borra la local.
- Botones físicos existentes (Sticker3dButton), color seleccionado, semántica selected y paleta activa.

## Persistencia y publicación
Listas privadas en SharedPreferences rastro_user_playlists_<uid>. Migración única del almacén antiguo: se conserva intacto; un marcador impide importarlo automáticamente a otras cuentas. Invitado tiene su propio almacén. Ninguna migración publica datos.

SharedPlaylistsRepository escucha rastro_yt_playlists: Comunidad exige isShared=true/isHidden=false; propias consulta ownerUid/isHidden=false. Consultas limitadas a 100, con Cargar más en bloques de 100; listeners se retiran al salir o cambiar sesión. IDs públicos se prefijan con uid para evitar colisiones; las listas del dueño mantienen su ID local. Solo sesión no anónima y lista local pueden publicar. Colecciones personalizadas admiten hasta 200 referencias; playlists oficiales guardan solo su ID, nunca copian 50 videos en Firestore.

Publicar crea primero documento privado, después actualiza isShared tras confirmación. Retirar borra la proyección pública; la lista privada permanece. Ediciones locales de una lista ya publicada no se republican automáticamente: retirar y volver a compartir para actualizar la copia pública.

La regla existente se endureció para impedir transferir ownerUid o cambiar isCurated/isHidden desde el propietario. **No se desplegaron reglas ni se verificó Firebase remoto.** Si producción aún no permite esta colección, compartir fallará con mensaje y requiere desplegar firestore.rules. No ampliar reglas globales para resolver permisos.

## YouTube
La API oficial pagina maxResults=50 y sigue todos los nextPageToken mediante YouTubePlaylistPages. Un fallo de página no se presenta como listado completo. Configuración existente: YOUTUBE_DATA_API_KEY en local.properties/propiedad Gradle; nunca imprimir esa clave. Actualmente local.properties no contiene la clave.

Sin API disponible: reproductor oficial visible (200px) y IFrame API cuePlaylist/getPlaylist. Sin scraping, sin interfaz JavaScript privilegiada, sin reproducción automática. Se espera hasta 20s y se muestra error/continuar en YouTube si no se obtiene la cola. Los IDs completos conservan su orden; los títulos reales proceden de Data API u oEmbed público. Si no están disponibles, no se inventan nombres de clases. No se promete acceso a videos privados, eliminados o no integrables. El antiguo feed RSS de 15 entradas ya no se utiliza como lista completa. Se ignora la antigua caché parcial al abrir listas oficiales.

Fuentes: [IFrame API oficial](https://developers.google.com/youtube/iframe_api_reference), [playlistItems.list](https://developers.google.com/youtube/v3/docs/playlistItems/list).

Validar físicamente una playlist pública de 50+ videos, reproducción/privacidad, retirar desde Compartidas, dos cuentas, temas y tablet. Prohibido ejecutar app en esta intervención; no se realizó esa validación.

## 04/10 — Reproductor integrado
YouTubePlaylistPlayer (YouTubePlaylistQueue.kt) presenta el IFrame oficial siempre visible, reproducción manual y controles nativos. Selección de fila o Anterior/Siguiente usa cuePlaylist(index) / cueVideoById: prepara el video y el usuario pulsa reproducir. La metadata paginada existente conserva títulos; fallback IFrame conserva todos los IDs devueltos por YouTube, no inventa títulos. Sin descarga, extracción audiovisual, ocultación de anuncios/branding ni JavaScriptInterface. Identidad HTTPS basada en packageName con loadDataWithBaseURL + strict-origin-when-cross-origin; viewport de 200 dp/200 CSS px de altura. Lifecycle pausa al pasar a background, onRelease destruye WebView. YouTubeFullscreenClient reutiliza el mismo WebView en ventana propia vertical u horizontal, permite Girar/Cerrar, restaura orientación y cierra al retirar el reproductor. Enlaces internos a YouTube prefieren la aplicación instalada; las URLs de embed/API no se interceptan.

Modal: dos paneles a partir de 620 dp (player + cola), columna en móvil. SafeDrawing evita barras del sistema. Listado desplazable independiente del player, miniaturas 120×72, salida a YouTube conservada. Referencia: https://developers.google.com/youtube/terms/required-minimum-functionality. No garantiza aprobación Google; falta prueba física de reproducción y listas 50+ sin clave API.
# Playlists por cuenta

La sincronización privada, migración y controles vectoriales están descritos en [PLAYLISTS_POR_CUENTA.md](PLAYLISTS_POR_CUENTA.md).
