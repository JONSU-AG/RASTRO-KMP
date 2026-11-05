# Cambios 04/10

## 10/10/2026 — producción 206 y centro legal
Ámbito: versionado Android, texto legal existente, centro legal web y configuración de publicación/AdMob. 2.0.4/206 compilada, firmada y validada; 361 pruebas sin fallos. Privacidad/términos aprobados e integrados, Hosting publicado con app-ads.txt y Asset Links. Data Safety guardada; URL de desarrollador publicada. Consulta Auth/perfiles detecta seis candidatos huérfanos, sin borrarlos. Consentimiento AdMob bloqueado por fallo del editor; cuenta aún en verificación. Detalle y estado del envío: RELEASE_2.0.4_206.md. App Android no ejecutada; copia web y Firebase de datos/reglas no modificados en esta intervención.

### Configuración Firebase y versión real de Play — revisión posterior

Ámbito: configuración Firebase y documentación de publicación; sin cambios de Kotlin, versión local, APK/AAB, subida, ejecución Android, commit ni push. Console confirma un único bundle 1.0/code 1 y lanzamiento 1.0 BETA en Alpha. Registrada SHA-256 Play en la app Android existente; seis huellas en total, sin retirar las anteriores. JSON oficial semánticamente idéntico al local: no se reemplazó. OAuth externo/en producción y cuatro scopes no sensibles comprobados; Drive habilitada. Dos índices de ligas ya correctos.

Reglas activas respaldadas, diferencias revisadas y cuatro tests del emulador aprobados antes del deploy exclusivo firestore:rules. Verificación posterior del contenido activo idéntico, normalizando BOM y LF/CRLF. Evidencias build/firebase-rules-before-config.log, firebase-rules-deploy.log y firestore-rules-active-{before,after}.rules; captura build/firebase-sha-play-confirmado.jpg. No se borraron datos. Functions requiere Blaze; proyecto sigue Spark. App Links sigue preparado sin desplegar: no hay configuración/fuente Hosting del sitio existente en este checkout y no se publicó un sitio parcial.

Consolidación de auditorías existentes, crash Android ICU corregido; R8/recursos Gradle, navegación/carga IO/estado asíncrono, Obras/temas/Pizarra. Eliminación de cuenta unificada y limpieza backend con 7 tests aislados. Centro legal comprobado, falsos positivos API36/Crashlytics descartados. Bloqueantes externos y banco heredado descritos en checklist raíz.

### Confirmaciones del propietario — 04/10

GP-01 cerrado por confirmación física del propietario. Capturas confirman proveedores/Drive/scopes y distinguen carga de firma Play. HTTP detecta que App Links publica solo carga; preparado assetlinks.json con ambas SHA-256, sin desplegar. OAuth web/local coherente con captura. Sin cambiar google-services.json, versión, firma ni código. Próximo paso: copiar SHA-1 de firma Play del bloque superior.

### Inspección autenticada de consolas — 04/10

Solo lectura. Console confirma máximo versionCode 1 (local 3), SHA-1 Play 29:C5…:27:D9 ya en Firebase/JSON OAuth y SHA-256 Play ausente. Formulario Data Safety leído completo: cinco tipos actuales, omite fotos/documentos/otro UGC respecto a flujos reales; propuesta documentada sin guardar. Audiencia Cloud devuelve error de carga; producción pendiente con 12 verificadores/10 días. Sin ejecutar app, alterar configuración, borrar datos, deploy, commit ni push.

### AAB firmado preparado — 04/10

Clave de KEYSTORE_BACKUP comprobada contra certificado de carga Play. Gradle obtiene firma desde local.properties ignorado, sin rutas ni secretos de firma en código versionado. bundleRelease correcto; jarsigner y certificado verifican AAB 1.0.3/code 3. Evidencia build/release-preparation-verification.json. Usuario revocó la subida inmediata: no se subió/publicó ni modificó Console/Firebase. Pendientes académicos/backend/consola conservados.


## 04/10/2026 — legal y descripción
Propuesta legal local incorpora actividad aproximada e historia insuficiente, XP/monedas virtuales, racha por lección/15 minutos y condiciones para pagos/anuncios futuros. Publicación bloqueada hasta aprobación solicitada por el usuario. Descripción actual de Console revisada: sustituir garantía de vacante, gemas y cobertura no comprobada. Nombre y breve actuales conservables. Sin guardar Console, publicar Hosting o generar paquetes. Reglas de amistad desplegadas tras 6 pruebas y respaldo, sin alterar el resto de reglas activas.

## 05/10/2026 — versión 2.0.1

Petición expresa: configurar 2.0.1 para que el propietario genere el bundle. androidApp/build.gradle.kts pasa a versionName 2.0.1 y versionCode 201, release explícitamente no depurable; conserva firma y R8. Console viva confirma máximo code 1/versión 1.0 y falta de acceso a producción. Material de firma existente validado sin revelar secretos ni generar paquetes. Estado vigente: RELEASE_2.0.1.md; pendientes previos no cerrados por este cambio.

## 05/10/2026 — Bundle autorizado y cargado
2.0.1/code 201, firma existente verificada, 121 pruebas Android y lintVitalRelease correctos. Play aceptó el AAB y guardó el lanzamiento Alpha. Estado de distribución actualizado en VERSIONES DE LA APP SUBIDAS A PLAY CONSOLE.md. Sin commit/push ni ejecución de la app.

## Envío confirmado — 05/10/2026

Tras autorización expresa del propietario se enviaron los cinco cambios pendientes: 2.0.1/code 201 en Alpha, icono, capturas de teléfono, URL de privacidad y Seguridad de los datos. Play cambió a «Cambios en la etapa de revisión» y ya no muestra cambios sin enviar. Las verificaciones rápidas continúan; Play indica que se enviarán para revisión en cuanto terminen correctamente. Este estado no significa aprobación ni disponibilidad para testers. Evidencia: build/play-console-2.0.1-en-revision.jpg.

Esta actualización supera el apartado anterior que indicaba envío detenido. No se modificó ni publicó el contenido legal alojado en Firebase; se envió la configuración de privacidad que ya estaba pendiente en Play. No se hizo otro bundle, commit ni push.

## 05/10/2026 — Respaldo en GitHub autorizado
Subida del estado actual 2.0.1/code 201 a JONSU-AG/RASTRO-KMP, incluyendo código, recursos, backend, documentación y scripts de mantenimiento. Excluidos secretos, firmas privadas, configuración local y productos generados. Validación de esta versión: 121 pruebas Android, lintVitalRelease y bundleRelease correctos. Sin ejecución de la app.


## 09/10/2026 — Corrección de eliminación de cuenta
Ámbito: AccountDeletionRepository/Plan, ambos llamadores de confirmación, DriveUploadRepository solo limpieza de imágenes generadas, reglas de cuenta y pruebas/documentación. Auth deja de borrarse antes de la limpieza; marcador privado evita recreación tardía. Sin activar Blaze ni borrar usuarios reales. 20 pruebas de permisos y regresión aprobadas, reglas desplegadas. Flujo y límites: ELIMINACION_CUENTA_2026-10-09.md. Compilación y prueba final móvil se registran por separado.

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
