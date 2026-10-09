# Decisiones — 04/10/2026
- Reutilizar modelos CoursePlaylist y UI cartoon existentes; ninguna segunda sección de cursos.
- Privacidad por cuenta y publicación explícita mediante proyección Firestore; no publicar listas heredadas.
- Evitar falsas listas completas de 15: API oficial paginada, alternativa IFrame oficial sin dependencia nueva.
- Sin despliegue de Firebase ni ejecución de app. Guía de uso y límites reales en README.md.

## 04/10
Usar reproductor oficial visible y API de cue para evitar autoplay no solicitado; sin dependencias pesadas ni extracción de videos. Mantener referencia/branding y salida YouTube. Fuente de datos existente, sin segundo repositorio de playlists.

## 04/10 — Metadatos y publicación
Los títulos de la Data API tienen prioridad; oEmbed público completa únicamente marcadores heredados o títulos vacíos, con caché y concurrencia limitada. Nunca fabricar Clase N. Compartir es un switch independiente; solo Ver Lista de Clases abre el reproductor. Detalle: TITULOS_Y_CONTROLES_PLAYLIST.md.

## 04/10 — Fullscreen sin segunda reproducción
RastroYouTubeChromeClient mueve el mismo WebView a una ventana fullscreen y lo devuelve a su contenedor; no cargar otro reproductor ni reiniciar el video. Dos accesos debajo del IFrame: Pantalla completa (vertical) y Girar video (horizontal); dentro se puede girar/cerrar. Curso usa movableContentOf para conservar identidad al adaptar columnas. YouTubeExternalLinks permite destinos públicos YouTube y evita interceptar embed/API/hosts falsos. Mantener controles oficiales visibles; consultas externas priorizan paquete com.google.android.youtube con fallback web, incluyendo target=_blank gestual. Sin JavaScriptInterface ni nueva dependencia.
## 04/10 — Una lista por cuenta, visibilidad independiente

Reutilizar rastro_yt_playlists para listas privadas y compartidas, sin crear otro almacén remoto. Compartir/retirar cambia isShared; borrar marca isDeleted. Migrar caché local solo cuando el documento no exista. Detalles y pruebas pendientes en PLAYLISTS_POR_CUENTA.md.


## 04/10/2026 — YouTube gestiona fullscreen
Sustituye la decisión anterior de controles Girar/Pantalla completa propios. Mantener controles oficiales del IFrame y responder a onShowCustomView/onHideCustomView. FULL_USER sigue bloqueo/auto-rotación del teléfono, en lugar de SENSOR_LANDSCAPE/SENSOR_PORTRAIT. Root FrameLayout negro sin toolbar sobre el video. Mantener movableContent y layout estable mientras fullscreen para conservar WebView/sesión. Reducir espacio del popup/padding y permitir scroll del panel corto, sin reducir viewport del IFrame de 200 dp por debajo del mínimo oficial. No se cambia cola/títulos ni carga de videos.
Fuentes: https://developers.google.com/youtube/iframe_api_reference#Requirements y https://developer.android.com/reference/android/content/pm/ActivityInfo#SCREEN_ORIENTATION_FULL_USER.

## 08/10/2026

Separar respaldo personal de operaciones sociales; no depender de Blaze para estudiar. Cuenta RevenueCat y conexión de compras pendientes, sin doble sistema Pro. Detalles en ../sincronizacion/DECISIONES.md.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

No ocultar fallos de sincronización junto con el texto informativo eliminado. Consultas, cuenta propietaria, visibilidad y publicación de listas quedan intactas.
