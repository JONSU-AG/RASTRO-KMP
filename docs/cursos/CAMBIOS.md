# Cambios — 04/10/2026
Comunidad inicial, pestañas con botón/selección, solo publicaciones reales, filtro Compartidas, publicar/retirar, almacenes por cuenta y migración conservadora. Carga YouTube completa mediante páginas oficiales/cola IFrame; sin caché RSS parcial. Se consolidaron declaraciones duplicadas de tarjeta/editor en CursosScreen y cierre del viewport, conservando las primeras implementaciones. No se modificó catálogo, otros flujos ni personajes.

## 04/10
Reproductor IFrame conectado a selección/Anterior/Siguiente, pausa por lifecycle, fullscreen compartido y layout móvil/tablet con insets. Conservadas publicación y paginación previas. Verificación automática build/seven-android-tests.log; reproducción remota pendiente, no app ejecutada.

## 04/10 — Playlist más legible
Modal más alto, salida a YouTube debajo del reproductor, títulos originales, búsqueda y lista lazy. Compartir mediante switch junto al engranaje sin abrir la playlist. Detalle y validación: TITULOS_Y_CONTROLES_PLAYLIST.md; build/playlist-flashcard-final.log. Sin ejecución de app, commit ni push.

## 04/10 — Switch y reproductor
Switch Compartir más delgado sin reducir área táctil; fullscreen vertical/horizontal y giro en la ventana; restauración de orientación y reproducción del mismo WebView. Enlaces internos/ventanas nuevas y botón externo comparten apertura preferente en app YouTube. Compilación/pruebas: build/youtube-fullscreen-final.log. Verificación física pendiente, sin ejecutar app/commit/push.
## 04/10 — Mías entre dispositivos y controles

Añadida sincronización de listas propias por UID, recuperación de documentos compartidos antiguos, migración local no destructiva, paginación y errores/reintento. Compartir conserva una única lista remota. Controles fullscreen/giro/cierre sustituidos por vectores; eventos del IFrame ya no cierran el fullscreen independiente. Ver PLAYLISTS_POR_CUENTA.md. Compilación y tests locales; validación física/cloud pendiente, sin ejecutar la app ni desplegar reglas.


## 04/10/2026 — popup y orientación natural
Quitar controles SVG extra tanto bajo el IFrame como en fullscreen; no borrar assets. Adaptar popup al 94% de altura segura y scroll de controles; video conserva 200 dp. ChromeClient solo atiende pantalla completa oficial, usa FULL_USER y restaura orientación al cerrar. Sesión original intacta. Compilación y 112 tests Android pasan; validación física de recorte/giro pendiente, sin ejecutar app/generar APK/AAB.
