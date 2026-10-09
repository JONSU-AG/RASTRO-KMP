# Eliminación de cuenta — corrección 09/10/2026

## Causa comprobada
AccountDeletionRepository solo ejecutaba FirebaseAuth.currentUser.delete(). Su comentario suponía que cleanupDeletedAccount depuraba después, pero ese backend requiere Blaze y su despliegue no estaba comprobado. Por tanto se liberaba el correo aunque usuarios/UID y contenido siguieran presentes. El siguiente registro obtenía otro UID: no son dos identidades Auth activas con el mismo correo, sino perfiles Firestore huérfanos.

## Flujo actual
1. Exige conexión y token con autenticación de los últimos cuatro minutos; obtener otro token no sustituye reautenticación.
2. Si hay fotos/portada Drive, mueve a papelera solo archivos de esta cuenta creados con nombres UID_profile_TIMESTAMP.jpg o UID_cover_TIMESTAMP.jpg, visibles bajo drive.file y ownedByMe. OAuth se limita al correo actual. No elimina la carpeta RASTRO ni material personal enlazado. Fotos Google externas y formatos legacy no gestionados permanecen bajo control del propietario.
3. Crea account_deletions/UID con requestedAt (sin nombre, email ni imagen). Este marcador mínimo impide resurrección por writes tardíos y se conserva sin acceso público.
4. Limpia por páginas de 100 documentos y con lecturas SERVER: contenido propio, comentarios asociados a publicaciones propias, notificaciones, mensajes, seguidos, rankings, playlists, reportes propios, solicitudes y relaciones.
5. En grupos con al menos dos personas restantes elimina solo al miembro, aceptación y actividad de ese UID; conserva el progreso de los demás. Parejas/grupos que no cumplen mínimo se eliminan.
6. Retira referencias del UID en guardados/reacciones y listas de perfil; reglas de limpieza solo admiten quitar ese UID, no modificar otras identidades.
7. Borra gamificacion y coin_rewards, concesión manual rastro_pro y perfil; después elimina Auth. Si falla, informa el error y mantiene el acceso para reautenticar/reintentar. El trabajo parcial no se revierte; es idempotente.
8. Los dos botones existentes de eliminación reutilizan este repositorio. No es un sistema paralelo ni una tarea cloud pagada.

## Límites reales
- Marcador antiresurrección privado conservado. No contiene correo/nombre; no equivale a borrado físico de backups de Firebase ni registros de tiendas/proveedores.
- La limpieza depende de que el usuario mantenga/reabra la app. Interrumpida, se reintenta con sesión reciente; Auth no se elimina hasta terminar.
- Las colecciones privadas actuales son gamificacion y coin_rewards. Si se añade otra subcolección, debe incorporarse al plan y a las reglas.
- No cancela automáticamente Google Play ni borra recibos de RevenueCat/Google sujetos a conservación del proveedor.
- Originales de Drive y archivos legacy de Storage no se borran indiscriminadamente; las URLs públicas de RASTRO se retiran con sus documentos.
- Perfiles huérfanos de eliminaciones pasadas NO fueron borrados en esta intervención. Requieren inventario de UID y cotejo con Auth; no deduplicar automáticamente por nombre/correo.
- 2.0.1 y 2.0.3/205 ya distribuidas no contienen este cambio. Próximo bundle debe usar código >205 (consultar Console), probar cuenta descartable y luego publicar.
- No se ejecutó Android ni se borró ninguna cuenta real.

## Validación
20 pruebas de reglas en emulador Firestore aprobadas; propiedad, sesión reciente, lectura limitada, imposibilidad de resucitar perfil, grupo conservado y regresiones amigos/promos/feedback/Pro.
Reglas desplegadas en rumbo-jonsu solo firestore:rules; build/account-deletion-rules-deploy.log.
Compilación assembleDebug correcta y 169 pruebas Android sin fallos/errores, confirmadas en XML; build/account-deletion-build.log. App no ejecutada.
API cuenta explícita Drive: https://developers.google.com/android/reference/com/google/android/gms/auth/api/identity/AuthorizationRequest.Builder
