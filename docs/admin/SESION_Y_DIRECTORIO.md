# Sesión y directorio de Admin — 08/10/2026

Ámbito: inicio/cierre/cambio de sesión Android, consulta de perfiles de Admin y concesión Pro manual existente. Sin cambios académicos, reglas remotas, compras, versión ni publicación de bundles.

## Evidencia y correcciones

Se leyó el buffer de fallos del teléfono conectado, sin iniciar ni instalar la aplicación. El registro muestra dos cierres de RASTRO en MainActivity.onCreate: acceso nulo a android.R.id.content y «Couldn't find content container view» al preparar la ventana. El registro de tareas confirma terminación de MainActivityBase/MainActivityTriste y reinicio del proceso. No prueba por sí solo que cada fallo ocurra exactamente al pulsar Cerrar sesión.

MainActivity instala un ComposeView mediante setContentView antes de adjuntar UMP. El gestor del icono pospone las mutaciones de alias mientras MainActivity está visible o creándose; mantiene solo el último estado solicitado y lo aplica en onStop, sin aplicarlo durante rotación. La imagen dentro de la app conserva sus actualizaciones. Esto evita deshabilitar el componente que sostiene la pantalla durante un cambio de cuenta.

Ambos accesos de logout cierran Firebase antes de reemplazar la identidad local, limpian el modo de vista del Admin y navegan a un único Inicio eliminando las rutas anteriores. Los callbacks de perfil y Pro ignoran resultados de una cuenta que ya no está activa.

## Usuarios y Pro

AdminUserDirectory reutiliza usuarios/{uid}, páginas de 100 ordenadas por ID y Source.SERVER. Ya no hay corte silencioso de 100 perfiles. Moderación y Pro comparten una caché de 5 minutos por cuenta Admin. Solo se consulta al entrar en la sección o al pulsar Actualizar; escribir en el buscador filtra localmente. No se incorporan listeners permanentes adicionales.

Busca por correo, nombre, UID y carrera; normaliza espacios, mayúsculas y tildes. Recupera nombres/correos históricos de displayName/username/name/nombre y email/correo. Datos de tipos inesperados no provocan conversiones inseguras.

Al entrar con una cuenta real se completa únicamente el correo o nombre que falta en su perfil mediante una transacción. Se preserva el nombre elegido y no se escriben carreras, descripciones o identidades para invitados. Si la identidad ya está completa no se vuelve a escribir.

Pro utiliza el mismo directorio: buscar, elegir la cuenta, elegir plan y Asignar Pro. «Elegirme a mí» selecciona la cuenta Admin actual. El estudiante no recibe una solicitud de aceptación ni realiza un pago. La concesión sigue en rastro_pro/{uid}, con la autoridad y las reglas existentes; no se crea otro sistema Pro. La asignación muestra éxito solo cuando Firestore confirma la escritura.

Límite: Firebase Authentication no permite que una APK cliente enumere todas las cuentas Auth. El directorio cubre todos los perfiles registrados en usuarios, incluidos perfiles históricos; una cuenta que solo exista en Auth y nunca haya creado perfil aparecerá después de ingresar con esta corrección. No se inventa un UID a partir de un correo. La escritura Pro efectiva depende de las reglas ya publicadas; no se desplegaron reglas ni se probó una concesión real durante esta intervención.

## Validación

Pruebas específicas: búsqueda más allá del perfil 100, nombres con tildes/alias históricos, identidad ausente y preservación del nombre, icono pendiente durante cambio de cuenta/rotación. Registro final de compilación y pruebas en CHECKLIST.md. Recorrido físico pendiente por prohibición de ejecutar la app.

Estas correcciones son posteriores al bundle 204 publicado. No se ha generado ni subido otro bundle; recompilar en Android Studio utiliza el código corregido. Una nueva subida requerirá versionCode superior al máximo real de Play.
