# Playlists por cuenta y controles — 04/10/2026

`UserPlaylistsRepository` mantiene la caché local por UID y sincroniza las listas propias en la colección existente `rastro_yt_playlists`. Documento `${uid}_${localId}`; consulta `ownerUid == uid`, `isHidden == false`, páginas acumulativas de 100 documentos. Mías ofrece Cargar más. No hay nueva colección ni nuevas reglas.

Cada documento contiene los datos de CoursePlaylist, ownerUid, localId, isCustomList, videos, updatedAt, isDeleted y los flags de visibilidad. Solo colecciones manuales guardan videos; la cola de una playlist oficial continúa siendo obtenida de YouTube. `PlaylistAccountPayload.kt` separa la serialización y los campos editables: editar no altera isShared.

Los documentos compartidos antiguos de la misma cuenta se recuperan también en Mías. Las listas locales antiguas se migran mediante transacciones que crean solo documentos inexistentes, sin sobrescribir ediciones remotas ni revivir eliminaciones. Invitados conservan el guardado local. Los listeners se retiran al salir de Cursos/cambiar de cuenta; callbacks comprueban UID. Los fallos se muestran con una acción de reintento, sin borrar la caché.

Compartir activa isShared explícitamente. Retirar de Comunidad ahora cambia isShared a false; conserva el documento privado. Eliminar escribe isDeleted=true e isShared=false: el tombstone impide que otra instalación vuelva a importar su copia antigua. No borrar esos tombstones durante esta migración.

Los controles del reproductor son vectores Android en `androidApp/src/main/res/drawable/ic_player_{fullscreen,rotate,close}.xml`, con zonas táctiles de 48 dp y etiquetas accesibles. Se reutiliza el mismo WebView para fullscreen vertical/horizontal, restaurando el contenedor y orientación al cerrar. Los eventos onHideCustomView del IFrame solo cierran el fullscreen gestionado por su CustomViewCallback, evitando cerrar el modo abierto desde RASTRO.

Validación local: compileDebugKotlin, PlaylistAccountPayloadTest y tests YouTube; CatalogPilotValidationTest. No se ejecutó la app ni se probó la sincronización real en dos dispositivos. La producción debe tener desplegadas las reglas existentes de rastro_yt_playlists en firestore.rules; no se desplegaron reglas en esta intervención. Si aparece PERMISSION_DENIED, comprobar ese despliegue antes de atribuirlo al guardado local.

Prueba pendiente: misma cuenta en dos dispositivos → crear/editar en A y observar Mías en B; compartir/retirar conservando Mías en ambos; eliminar y reabrir A/B sin resurrección; otra cuenta no debe acceder a listas privadas. Probar fullscreen/giro/cerrar varias veces en vertical y horizontal, preservando reproducción y controles oficiales.
