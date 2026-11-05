# Auditoría AdMob de RASTRO — 18/10/2026

## Conclusión
El bloqueo comprobado es de CUENTA: AdMob muestra «Your account wasn't approved / Meet AdMob program policies». No identifica una infracción concreta de RASTRO. Tanto /v2/apps/list como /v2/policycenter redirigen a /signup?sac=true. Sin el correo de decisión o acceso al detalle no se puede atribuir el rechazo al SDK, consentimiento, contenido o lector QR. No se reenvió ni modificó configuración remota.

## Comprobaciones

| Área | Resultado y evidencia | Acción |
|---|---|---|
| Ficha pública | com.jonsuapps.rastro, JONSUAPPS, disponible para instalar, actualización 10/10. Declara anuncios/compras. | Ninguna corrección demostrada. |
| Dominio en Play | Asistencia enlaza https://rumbo-jonsu.web.app y privacidad /privacidad. | Correcto para descubrir app-ads.txt. |
| app-ads.txt | HTTPS 200 text/plain; HTTP redirige a HTTPS 200. Línea google.com, pub-4563495447517759, DIRECT, f08c47fec0942fa0. | Sin defecto de formato/ID encontrado. Rastreo y verificación internos AdMob NO accesibles. |
| robots.txt | Devuelve 200 text/html con el centro legal por fallback SPA, no un archivo robots real. | Defecto menor de Hosting: servir robots.txt de texto con permiso Google-adstxt o devolver 404 real. No se encontró Disallow ni evidencia de que cause el rechazo. No desplegado. |
| Manifest release | Dump de bundle 206/2.0.4 con App ID ca-app-pub-4563495447517759~3422086209, INTERNET, AD_ID, AdActivity y MobileAdsInitProvider. | No falta el identificador ni la integración básica. |
| Unidades release | Interstitial /3633839193, rewarded /2646217272, publicador 4563495447517759; BuildConfig release DEBUG=false. | No son IDs demo en release normal. Existencia/estado actual de unidades en consola no se pudo comprobar por bloqueo. |
| SDK | Gradle declara Google Mobile Ads 24.9.0 y UMP 4.0.0, versiones oficiales; no se probó un fallo de compatibilidad. | No actualizar SDK solo para intentar eliminar un rechazo no explicado. |
| Consentimiento | attach en MainActivity; requestConsentInfoUpdate, loadAndShowConsentFormIfRequired, canRequestAds antes de inicializar. Entrada a opciones de privacidad en ajustes. | Publicación efectiva del mensaje que el propietario reportó NO verificable hoy por bloqueo de cuenta. |
| Publicidad | Solicita no personalizados, rating G. Admin en modo usuario usa IDs de prueba intencionalmente. Interstitial en fin de lección/examen; rewarded acredita solo onUserEarnedReward. | No confundir pruebas Admin o límites con rechazo. automaticAds=false por defecto; el valor remoto actual no fue consultado. |
| Diagnóstico | onAdFailedToLoad descarta código, dominio, mensaje y ResponseInfo; errores UMP tampoco se registran. | Falta real de observabilidad. En futuro registrar diagnóstico técnico sin datos personales para distinguir cuenta no aprobada/no fill/red/consentimiento. No es causa probada de rechazo. |
| Acceso/contenido | Privacidad pública renderiza sin login; /terminos y /eliminar-cuenta responden 200. Código ofrece Explorar como Invitado, reportar publicaciones/comentarios y bloquear usuarios. | No se ejecutó Android ni se certificó acceso completo del revisor, moderación remota o derechos de cada material. Aviso educativo no acredita licencias por sí mismo. |

Bundle local auditado: androidApp/build/outputs/bundle/release/androidApp-release.aab. SHA256 08C59DCF40B7CAA282FD1EDB8C40F6520599555FFC3ED7A6EA4876E363599C51, coincide con registro de subida 206. No se descargó APK de Play ni se ejecutó la app; no confundir inspección estática con prueba en dispositivo.

## Aplicación antigua Lector QR
Google documenta expresamente el registro de aplicaciones NO publicadas para configurar y probar SDK. Su sola existencia no demuestra infracción ni que impida aprobar RASTRO. Cada app tiene un estado de preparación propio; una infracción real a nivel cuenta sí puede afectar otras apps, pero no se identificó ninguna del QR. Estado actual QR inaccesible por bloqueo. Ocultarla no elimina el registro ni corrige sanciones. No se ocultó ni eliminó.

## Qué debe aportar/revisar el propietario
1. Correo exacto de AdMob («Your application status» o equivalente), incluida fecha y motivo; ocultar datos privados. Es la pieza pendiente para conocer la causa específica. No reenviar sin corregir el motivo.
2. Si el correo menciona duplicación, identificar la cuenta publicadora previa AdSense/AdMob; no crear otra para eludir el rechazo. No se encontró evidencia de duplicados.
3. Si menciona identidad, dirección, teléfono o pagos, verificar personalmente contra documentos; no se modificaron ni se presumieron incorrectos.
4. Al recuperar acceso, revisar Centro de políticas > detalles, estado RASTRO y QR, unidades, rastreo app-ads.txt y mensaje europeo publicado. Si el correo también es genérico, solicitar aclaración a soporte con ambos avisos; sin declarar problemas corregidos que no se conocen.

No hay una causa técnica concreta demostrada que justifique publicar una nueva versión ahora. Únicamente se creó este informe y se actualizaron notas de auditoría. Sin cambios de código, Firebase, Hosting, facturación o consola; sin compilación ni ejecución Android necesarias en esta revisión.

## Fuentes oficiales
- Rechazo de cuenta y correo de decisión: https://support.google.com/admob/answer/9905175
- Registro de apps no publicadas: https://support.google.com/admob/answer/9989980
- Estado de preparación por app: https://support.google.com/admob/answer/10564477
- Rastreo/robots y formato: https://support.google.com/admob/answer/9776740 y https://support.google.com/admob/answer/9679128
- UMP: https://developers.google.com/admob/android/privacy
- SDK oficial: https://developers.google.com/admob/android/rel-notes
- Ocultar no elimina apps: https://support.google.com/admob/answer/6061403

## ACTUALIZACIÓN POSTERIOR — 18/10/2026, acceso recuperado

Esta observación sustituye el bloqueo descrito arriba: el propietario dejó AdMob en /v2/home?sac=true y el panel ahora permite navegar. NO se reenvió ninguna solicitud en esta comprobación.
- AdSense aguilar.jonsu@gmail.com tiene el MISMO pub-4563495447517759. Account information: Account status Open; Active products AdMob. No se mostró un rechazo/suspensión de AdSense. Open NO equivale a aprobación publicitaria AdMob ni a sitio AdSense aprobado.
- AdMob Home: perfil de pagos completo; cuenta en verificación/no aprobada todavía.
- Policy center > Issues: No current issues. Disapproved apps: No disapproved apps.
- RASTRO: Getting ready, Review in progress, Limited ad serving; Google Play com.jonsuapps.rastro, 2 unidades activas. QR: Requires review, sin tienda, 0 unidades; no aparece como app rechazada.
- Notificaciones AdMob observadas son avisos generales de eCPM, Ucrania y privacidad; no señalan duplicación de cuenta.
- No se pueden descartar otras cuentas con otros correos a partir de esta sesión. El propietario debe indicar si abrió AdSense/AdMob con otro correo; NO enviar contraseña ni códigos.
- Evidencia local: build/adsense-cuenta-abierta-2026-10-18.png y build/admob-rastro-en-revision-2026-10-18.png. Sin cambios en cuenta, datos, permisos o versiones.
