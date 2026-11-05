# Validación 04/10

- [x] Debug y release con R8/lintVital correctos.
- [x] 285 tests Kotlin y 7 tests cleanup/reglas correctos.
- [x] Centro legal HTTP 200 y rutas presentes en bundle.
- [x] Reglas Firestore desplegadas y contenido activo verificado; cuatro pruebas de reglas pasan.
- [ ] Functions de cleanup (requiere Blaze) y prueba de cuenta descartable.
- [ ] Firma final/versión Console/OAuth/Drive/Data Safety.
- [ ] Recorrido físico del APK.
- [ ] Banco académico global limpio (errores heredados documentados).

## Confirmaciones del propietario — 04/10

- [x] GP-01: confirma que los niveles ya no cierran la app.
- [x] Capturas: Google/email/anónimo, Drive API y drive.file habilitados.
- [x] Firmas de carga y Play identificadas; JSON local de App Links preparado y validado.
- [x] SHA-1 de firma Play recuperada: 29:C5…:27:D9; registrada en Firebase y asociada al cliente Android del JSON local.
- [x] SHA-256 de firma Play registrada en la app Firebase existente; JSON oficial descargado e idéntico semánticamente al local.
- [ ] Publicar assetlinks corregido (solo preparado; sitio actual omite firma Play).
- [x] Play Console: único bundle activo con nombre 1.0 y versionCode 1; lanzamiento 1.0 BETA. No existe 1.0.3 en Console.
- [x] Formulario Data Safety leído sin cambios: cinco tipos actuales; fotos, documentos y otro UGC sin seleccionar. URLs legales registradas.
- [ ] Corregir/revisar Data Safety según flujos reales y excepciones oficiales, antes de guardar/enviar.
- [x] Audiencia OAuth externa y en producción; email/profile/openid/drive.file no sensibles. Drive API habilitada.
- [x] Dos índices de ligas existentes coinciden con los preparados; no fue necesario modificarlos.
- [ ] Acceso a producción: Console muestra 12 verificadores durante 10 días; todavía pendiente requisito de 14 días y solicitud.

## Preparación de release — 04/10

Última instrucción: no generar APK/AAB ni subir. Las comprobaciones de empaquetado siguientes son históricas; no describen un nuevo paquete autorizado ni la versión publicada.

- [x] AAB 1.0.3/code 3 generado, firmado y verificado con certificado de carga correcto.
- [x] Firma en local.properties ignorado; clave conservada fuera del repositorio.
- [x] No se subió ni publicó, conforme a la última instrucción.
- [ ] Pendientes globales de publicación/academia siguen abiertos; detalle en RELEASE_PREPARADO.md.


## 04/10/2026 — revisión solicitada
- [x] Ficha es-419 leída directamente en Play Console; propuesta DESCRIPCION_PLAY_REVISADA.md preparada, sin guardar ficha.
- [x] Términos/Privacidad de Downloads/TERMINOS revisados y propuesta local tipada correctamente (`tsc --noEmit`). Texto íntegro: REVISION_LEGAL_2026-10-04.md.
- [ ] Aprobación expresa del usuario antes de publicar cambios legales. No se desplegó Hosting ni se cambió el resumen legal de la APK.
- [ ] Corregir declaración real de anuncios si procede: Console indica Sí; futuros planes no bastan para declarar publicidad existente.
- [ ] Bloqueantes anteriores de publicación siguen vigentes: backend de borrado de cuenta requiere Blaze, Data Safety/banco académico y recorrido físico pendiente. Esta intervención no certifica preparación completa para producción.
- [x] No se generó APK/AAB, no se subió versión, no se cambió versionCode/versionName en esta intervención.

## 05/10/2026 — preparación 2.0.1
- [x] versionName 2.0.1 / versionCode 201 autorizados y configurados.
- [x] Máximo vivo en Todos los paquetes de Play: code 1, nombre 1.0.
- [x] Clave privada de carga accesible, configuración completa y certificado esperado comprobado sin exponer secretos.
- [x] Release no depurable; compileReleaseKotlin, R8, lintVitalRelease y 119 pruebas Android correctos.
- [x] No generación de APK/AAB; archivos anteriores conservados e identificados como históricos.
- [ ] Producción disponible: Console dice que aún no hay acceso (05/10).
- [ ] Backend de limpieza, revisión Data Safety/anuncios, aprobación legal y recorridos físicos pendientes; no se cierran por el versionado.

Estado detallado: RELEASE_2.0.1.md.

## 05/10/2026 — Bundle autorizado y cargado
2.0.1/code 201, firma existente verificada, 121 pruebas Android y lintVitalRelease correctos. Play aceptó el AAB y guardó el lanzamiento Alpha. Estado de distribución actualizado en VERSIONES DE LA APP SUBIDAS A PLAY CONSOLE.md. Sin commit/push ni ejecución de la app.

- [x] Tras autorización expresa, cinco cambios enviados; Console muestra Cambios en la etapa de revisión (05/10/2026).
- [ ] Aprobación de Google y disponibilidad para testers: pendientes.

## 09/10/2026 — Eliminación sin dependencia de Blaze
- [x] assembleDebug y 169 pruebas Android aprobadas, cero fallos/errores; build/account-deletion-build.log. App no ejecutada.
- [x] Causa Auth sin limpieza identificada; repositorio limpia datos antes de borrar Auth.
- [x] Reglas antiresurrección y limpieza por propiedad: 20 pruebas sin fallos y desplegadas en rumbo-jonsu.
- [x] Limpieza de grupos conserva miembros/progreso restantes; fotos generadas delimitadas por UID/propiedad Drive.
- [ ] Cuenta descartable eliminada y reingreso en dispositivo; agente no ejecuta Android.
- [ ] Inventario/limpieza confirmada de perfiles huérfanos históricos. No borrar por coincidencia de correo/nombre.
- [ ] Nueva AAB con código superior a 205, distribución de esta corrección y validación del propietario.

## 10/10/2026 — preparación de producción 206
- [x] Acceso a producción confirmado en Console; al comenzar estaba inactiva. Máximo real 205.
- [x] 2.0.4/206, bundleRelease y 361 pruebas sin fallos/errores; firma, bundletool y BILLING comprobados.
- [x] Texto legal final aprobado expresamente; integrado en app y publicado en centro legal. Fuentes reproducibles en centro-legal/.
- [x] app-ads.txt público en texto plano y Asset Links con ambos certificados comprobados mediante HTTP.
- [x] Seguridad de datos actualizada y guardada para revisión; declaración de anuncios existente Sí comprobada.
- [x] Sitio web del desarrollador rumbo-jonsu.web.app guardado y publicado en Play.
- [x] Auditoría de perfiles solo lectura: 218 cuentas Auth, 214 perfiles, 6 candidatos con UID ausente en Auth. Inventario privado fuera de Git; no borrados.
- [ ] Confirmar envío/aprobación del lanzamiento 206 y disponibilidad pública.
- [ ] Consentimiento europeo AdMob publicado: editor falla con «No se puede cargar la página».
- [ ] Cuenta AdMob aprobada y ficha pública vinculada; entrega real no comprobada.
- [ ] Revisión de candidatos históricos y validación académica heredada pendientes.

## Actualización comprobada — 10/10/2026

- [x] Texto legal aprobado por el propietario, integrado en Android 206 y publicado en web.
- [x] app-ads.txt público con línea oficial y Asset Links conservados.
- [x] 2.0.4 / 206 aceptada y enviada a producción. Console: «Cambios en la etapa de revisión»; verificaciones rápidas pendientes. Seguridad de datos y disponibilidad enviadas juntas. Evidencia build/play-production-206-enviada.png.
- [x] 361 pruebas sin fallos; bundle, manifest BILLING y firma verificados. No se ejecutó Android.
- [ ] Aprobación de Google y ficha pública. No confundir envío con publicación.
- [ ] AdMob: cuenta en verificación; editor del mensaje europeo falla «No se puede cargar la página». Mensaje sigue en borrador. Vincular ficha pública cuando exista y comprobar anuncios reales.
- [ ] Seis candidatos de perfiles sin UID en Auth: inventario privado, no borrados. Auditados 218 cuentas Auth y 214 perfiles. Revisión individual pendiente.
- [ ] Validación académica heredada pendiente.

Firebase continúa Spark. No se eligieron cuentas de pago ni datos bancarios/fiscales. Las listas de tareas anteriores son históricas; este apartado sustituye su estado. Detalle actual: docs/publicacion/RELEASE_2.0.4_206.md. Próximo código mínimo 207, verificar Console antes de cargar.
