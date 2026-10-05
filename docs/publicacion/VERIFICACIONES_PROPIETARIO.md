# Verificaciones externas concretas — 04/10/2026

**Instrucción vigente: no generar APK/AAB y no subir.** Ámbito de esta revisión: Firebase y versión real consultada en Play Console. Los artefactos locales anteriores no identifican la versión publicada. Sin ejecución de Android, cambios de versión, commit ni push.

## GP-13/17: versión, firma y acceso Google/Drive

1. **Comprobado en Console:** Explorador completo contiene un único paquete, versionCode **1**, nombre **1.0**, activo en prueba cerrada Alpha, lanzamiento **1.0 BETA**. El borrador de Alpha no tiene paquete asignado. No existe 1.0.3 subida. El siguiente código deberá superar 1; no se decidió ni modificó ahora la versión futura.
2. **SHA-1 de firma Play comprobada:** `29:C5:E8:91:44:3C:10:19:A3:C2:C0:85:A1:AD:BD:24:0D:AB:27:D9`. Recuperada del botón SHA-1 del bloque superior «Clave de firma de la app — En uso», pegándola en un campo temporal de búsqueda y limpiándolo después. Ya figura en la tabla SHA de Firebase y corresponde al cliente Android `432336496806-e8gsr946v0uqaamht6gr2j44bqk9kn8e.apps.googleusercontent.com` del JSON local. No falta registrar esta SHA-1.
3. **Configurado y verificado:** registrada SHA-256 Play `3D:8B:62:8D:E6:AF:84:1F:FC:1A:53:AD:84:56:09:51:86:7D:97:2C:77:7D:75:28:94:88:E1:99:FD:1E:5A:0E` en la app Firebase existente. Se conservaron las cinco huellas previas; ahora hay seis. Tras error de guardado en UI, la CLI oficial completó el alta, comprobada con listado y tabla viva. Captura build/firebase-sha-play-confirmado.jpg. JSON oficial descargado a build/google-services-firebase-actual.json, semánticamente idéntico al local: no se reemplazó. No sustituye prueba física de Google/Drive.
4. **Comprobado en Cloud:** audiencia externa y en producción; email/profile/openid/**drive.file** son los cuatro scopes no sensibles, sin scopes sensibles/restringidos. Drive API habilitada. No fue necesario cambiar audiencia, permisos ni API. Cuatro clientes Android y uno web coinciden con el JSON, incluida SHA-1 Play.
5. HTTP 200 verificado 04/10: https://rumbo-jonsu.web.app/.well-known/assetlinks.json contiene solo SHA-256 de carga 4D:20…; JSON de Play muestra firma 3D:8B… diferente. Preparado [assetlinks.json](assetlinks.json) con ambas huellas, conservando la asociación actual y añadiendo Play. **No desplegado**; ubicación final /.well-known/assetlinks.json del dominio existente.

Console, Firebase y Cloud ya verificaron versión, certificados, audiencia y Drive; no volver a solicitarlos al propietario. **Nunca contraseñas, keystore, claves privadas ni tokens**. Pendientes funcionales y externos documentados en RELEASE_PREPARADO.md. No se generaron paquetes durante esta revisión.

### Evidencias recibidas del propietario — 04/10

| Dato | Valor / alcance confirmado |
| --- | --- |
| Aprender | «Ya no se cierra la app en los niveles»: GP-01 cerrado. |
| SHA-1 de carga | 28:44:98:D3:D5:BA:F3:AC:E5:B9:19:FC:6F:CA:38:BA:B8:27:25:B4 |
| SHA-256 de carga | 4D:20:01:27:28:E4:FF:BC:F7:4F:32:1C:A2:02:75:3F:C4:2C:F9:52:D3:D7:0C:A2:EE:05:B8:62:86:48:BE:A2 |
| SHA-256 de firma Play, JSON generado por Console | 3D:8B:62:8D:E6:AF:84:1F:FC:1A:53:AD:84:56:09:51:86:7D:97:2C:77:7D:75:28:94:88:E1:99:FD:1E:5A:0E |
| SHA-1 de firma Play | 29:C5:E8:91:44:3C:10:19:A3:C2:C0:85:A1:AD:BD:24:0D:AB:27:D9; registrada en Firebase y cliente OAuth local. |
| Firebase | Paquete com.jonsuapps.rastro, proyecto rumbo-jonsu; SHA-1 y SHA-256 Play y carga registradas. |
| Auth/Drive | Google/email/anónimo, Drive API y drive.file habilitados. |
| OAuth local | Web 432336496806-7ctjor26otm03pcrm3tbg6qv0kve5ina.apps.googleusercontent.com; cuatro Android corresponden a SHA-1 mostradas en Firebase. |
| Versión | Explorador completo: un paquete 1.0/code 1; prueba cerrada activa «1.0 BETA». |
| Acceso a producción | Panel muestra 12 verificadores durante 10 días consecutivos y requisito de 14 días; solicitud de producción aún deshabilitada. No garantiza elegibilidad futura ni aprobación. |
| Firebase / facturación | Spark conservado; reglas Firestore desplegadas. Functions pendientes por requisito Blaze. |

El MD5 recibido identifica carga; no se usa en estos pasos. JSON de App Links no configura por sí mismo Google/Drive. Fuentes: [App Links y firma Play](https://developer.android.com/training/app-links/configure-assetlinks), [Google en Firebase](https://firebase.google.com/docs/auth/android/google-signin).

## GP-16: limpieza de cuenta y reglas

Reglas Firestore respaldadas, cuatro pruebas aprobadas, desplegadas y comprobadas contra servidor. Dos índices de ligas ya coinciden con los preparados; sin cambios. Seguir ELIMINACION_CUENTA.md para Functions account-cleanup tras habilitar Blaze y después prueba de cuenta descartable. No se cambió facturación ni se ejecutó ninguna eliminación real.

## GP-18/19: dispositivo

Propietario ya confirma que los niveles no cierran la app; no se repite esa solicitud. Quedan back del sistema, Pizarra con 15+ trazos y rotación, doble toque en lección/Ranking, salida durante reserva, red fallida+Reintentar, cancelación Google y subida con doble toque. Verificar Obras, Auth, temas claro/oscuro/Material You medio, fondo académico OFF inicial y dos cuentas para privacidad/sincronización. Agente no ejecuta la app conforme AGENTS.md.

Enviar: resultados por recorrido y, si falla, hora exacta/dispositivo/pasos. Se puede leer Logcat sin relanzar la app. No se instaló ni ejecutó app en esta intervención por AGENTS.md.

## GP-16/17: Data Safety y páginas públicas

Las rutas /privacidad, /terminos, /eliminar-cuenta y assetlinks respondieron HTTP 200. Se comprobó el bundle del centro legal: rutas distintas, servicios Google/Firebase, Analytics, conservación/eliminación y archivos de Drive personal. No se inventa una URL faltante. Esto no equivale a aprobación jurídica. El formulario de Play sí se leyó completo en esta revisión, sin modificar respuestas.

Play Console → Política y programas → Contenido de la aplicación → Seguridad de los datos: contrastar declaración con correo/nombre/UID, avatar/portada, contenido y archivos UGC, mensajes, progreso/rachas/ranking, actividad y Firebase Analytics. **Crashlytics no está instalado**: el informe adjunto lo afirmaba sin respaldo. Las conexiones de proveedores son HTTPS; no se certifica TLS 1.3 en todos los casos ni que compartir UGC sea «No se comparte» automáticamente. Determinar las respuestas según finalidad/destinatarios y excepciones oficiales.

No pedir nuevamente capturas del formulario ya revisado. Sigue pendiente confirmar que se atiende el correo público de solicitudes de eliminación. Perfil/documento usuarios es públicamente legible según la arquitectura vigente; revisar campos publicados antes de declarar privacidad. Errores privados permanecen en subcolección; proyección pública solo por elección explícita.

## GP-20: banco académico heredado

Las ampliaciones del temario ya están en la app, pero 50 niveles revisados contienen 182 enunciados duplicados y 14 advertencias heredadas. La lista exacta está en docs/aprender/VALIDACION_CATALOGO_2027.md y build/complement-catalog-validation.txt. Hace falta un banco aprobado/solucionario verificable para Álgebra, Geometría, Trigonometría, Química, Física e Inglés, o una nueva intervención académica explícita que use esas fuentes. No renombrar frases genéricas ni disminuir el validador para simular cumplimiento.


### Lectura de Seguridad de datos en Console — 04/10

Se recorrieron los cinco pasos con Siguiente sin cambiar ninguna selección. En Vista previa, Guardar, Guardar como borrador y Descartar estaban deshabilitados. No se guardó ni envió declaración.

Declaración actual: nombre, email, ID de usuario, interacciones en la app y dispositivo/otros IDs. Fotos/vídeos, archivos/documentos y otro contenido generado por usuarios no están seleccionados. La vista previa afirma «No se comparten datos con terceros», cifrado en tránsito y registra las URLs existentes /privacidad y /eliminar-cuenta. Estado de Seguridad de datos/Privacidad: «Lista para enviar a revisión»; no equivale a aprobado.

Contraste con código real:

- UserProfileScreen.kt sube avatar/portada mediante DriveUploadRepository.uploadUserFile.
- UploadMaterialDialog.kt acepta archivos/PDF y sube bytes a Drive con makePublic=true; DriveUploadRepository.kt realiza POST multipart a files y permisos anyone/reader cuando procede.
- UserUploadRepository.kt guarda comentarios con texto/UID/nombre en Firestore (publicacion_comentarios); publicaciones/materiales contienen contenido aportado por usuarios.

**Propuesta pendiente de revisión y guardado autorizado:** añadir los tipos recopilados que correspondan a fotos, archivos/documentos y contenido generado por usuarios; declarar su carácter opcional y finalidad según cada flujo. Revisar también mensajes/SDKs antes de cerrar la declaración. Que Drive sea del usuario no convierte una transmisión fuera del dispositivo en procesamiento exclusivamente local. No cambiar automáticamente «No se comparte»: Google contempla excepciones para proveedores de servicios y transferencias iniciadas por el usuario; comprobar finalidad, consentimiento y destinatarios por flujo.

Fuente oficial: https://support.google.com/googleplay/android-developer/answer/10787469?hl=es-419.

Enlaces de revisión autenticada: Firebase https://console.firebase.google.com/project/rumbo-jonsu/settings/general/android:com.jonsuapps.rastro ; Firma Play https://play.google.com/console/u/0/developers/5600876977625035057/app/4975234477259186336/keymanagement ; Seguridad de datos https://play.google.com/console/u/0/developers/5600876977625035057/app/4975234477259186336/app-content/data-privacy-security .
