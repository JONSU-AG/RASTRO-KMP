# Revisión — 01/11/2026

## Evidencia

AdMob Home muestra cuenta en verificación/no aprobada, perfil de pagos completado y aplicación en revisión. Centro de políticas: «No hay problemas actualmente». Aplicaciones rechazadas: «No hay aplicaciones rechazadas». El correo anterior aportado por el propietario es genérico y no identifica la infracción. No se conoce el motivo exacto de la falta de aprobación.

GET https://rumbo-jonsu.web.app/app-ads.txt responde con `google.com, pub-4563495447517759, DIRECT, f08c47fec0942fa0`. /robots.txt devuelve HTML: es una configuración mejorable, no una causa de rechazo demostrada. No se desplegó Hosting.

El adaptador Android usa RewardedAd e InterstitialAd oficiales, IDs separados, UMP/canRequestAds, clasificación G y callback oficial de recompensa. No hay banner ni nativo ni tamaño personalizado en este adaptador. La correspondencia de los IDs con los formatos de consola no se revalidó hoy y no se probó la APK en dispositivo.

## Restricción local

AdServingMode.automaticInterstitialsEnabled=false bloquea naturalEnd, precarga y presentación de intersticiales, incluso en vista usuario Admin y aunque la economía remota los habilite. Permanece el formato recompensado voluntario en Conseguir monedas. Se conservan packs, saldos, consentimiento y opciones de privacidad.

No se crean unidades nuevas ni anuncios especiales para «pasar revisión». Reducir publicidad no garantiza aprobación. No se modificaron Play ni AdMob. La app instalada no cambia hasta distribuir una nueva versión.

## Pendientes

### Revisión AD_ID en Play — mismo día

Corrección posterior autorizada «CORRIGE ESO»: guardado Sí; finalidades Publicidad/marketing, Estadísticas y Seguridad/cumplimiento/prevención de fraude activadas. Funciones de la app y Administración de la cuenta desactivadas, sin uso AAID para autenticación identificado. Comunicaciones y Personalización permanecen desactivadas. Único cambio pendiente comprobado en Publishing Overview: declaración ID de publicidad. Enviado y confirmado «Cambios en la etapa de revisión»; sin AAB ni cambios de versión. Evidencias build/play-ad-id-corregido-2026-11-01.png y build/play-ad-id-en-revision-2026-11-01.png. No equivale a aprobación AdMob.

Manifest final debug/release contiene com.google.android.gms.permission.AD_ID, agregado por play-services-ads-api:24.9.0 (manifest-merger report). No falta el permiso ni es necesario duplicarlo en el manifest fuente.

Play Console > Contenido de la app > ID de publicidad: Sí seleccionado. Publicidad o marketing DESMARCADO; Estadísticas, Funciones de la app, Seguridad/cumplimiento y Administración de cuenta MARCADOS. Es una discrepancia de finalidad a revisar: integrar AdMob justifica publicidad/medición, no implica usar AAID para autenticar cuentas. Solo lectura; no se guardó ni publicó declaración.

Panel de cuenta Play: últimos 28 días, 279 adquisiciones de dispositivos y 290 dispositivos activos por mes. No se interpretan como descargas totales. No se encontró en las fuentes oficiales consultadas un mínimo de instalaciones como requisito de aprobación AdMob ni evidencia de que AdMob revise todo el historial de artefactos para rechazar la cuenta por AD_ID. No diagnosticar un «approval loop» a partir de publicaciones comunitarias.

Fuente AD_ID: https://support.google.com/googleplay/android-developer/answer/6048248 y https://developers.google.com/admob/android/quick-start.

### Comprobación y corrección posterior del mismo día

- robots.txt corregido y publicado en Hosting: HTTP 200, text/plain, `User-agent: *` y `Allow: /`.
- Publicación preparada desde los archivos públicos de la versión vigente; únicamente se subió un archivo nuevo. HTML principal idéntico al anterior, app-ads.txt conservado y assetlinks.json HTTP 200. No se publicaron cambios legales ni una APK.
- Fuente mantenible: docs/publicacion/centro-legal/public/robots.txt. Lint/build del centro legal pasaron; el despliegue usó los archivos vigentes descargados para no sustituir el sitio por un build distinto.
- Play pública: paquete com.jonsuapps.rastro, instalación disponible, sitio de soporte https://rumbo-jonsu.web.app y privacidad en /privacidad. Dominio coincide con el de app-ads.txt.
- AdSense asociado pub-4563495447517759: estado Abierta, productos activos AdMob/Contenido. Pagos indica «Tenemos su información». Verificación solo indica que podría pedir datos al alcanzar el umbral; no mostró solicitud actual de documentos o SMS.
- El enlace request-consult es una consulta comercial; su página remite al Centro de ayuda para cuentas existentes. No se envió formulario ni publicación comunitaria.

Estas comprobaciones no permiten conocer la decisión interna de Google ni garantizan aprobación. No se identificó en las pantallas revisadas una acción pendiente de identidad que el propietario deba completar ahora.

Si persiste el rechazo, solicitar soporte para pub-4563495447517759 aportando el correo y los estados de consola. No atribuir la causa a duplicación: el propietario indica que no tiene cuentas duplicadas. Los datos de identidad/dirección/teléfono deben seguir siendo verídicos; no se cambiaron.

Fuentes: https://support.google.com/admob/answer/9905175?hl=es y https://support.google.com/admob/answer/7313578?hl=es.

## 01/11/2026 — Distribución LATAM y doble verificación de anuncios
Ámbito: configuración de países de producción y revisión de publicidad/consentimiento. Sin modificaciones Kotlin, Firebase, versiones ni nuevo bundle.
Play confirmó 20 países segmentados tras guardar: Argentina, Bolivia, Brasil, Chile, Colombia, Costa Rica, Cuba, Ecuador, El Salvador, Guatemala, Haití, Honduras, México, Nicaragua, Panamá, Paraguay, Perú, República Dominicana, Uruguay y Venezuela. Evidencia: build/play-latam-20-2026-11-01.png. No se activaron territorios incluidos con Estados Unidos/Francia.
AdMob, controles específicos de RASTRO: bloqueadas Citas, Referencias al sexo y Salud sexual y reproductiva. A nivel cuenta no hay categorías estándares bloqueadas; Alcohol y Apuestas están bloqueadas. No se alteró ningún filtro: son controles oficiales, sin evidencia de relación causal con el rechazo.
Revisión estática: attach/detach desde MainActivity, requestConsentInfoUpdate, loadAndShowConsentFormIfRequired, canRequestAds antes de inicializar/servir, opciones de privacidad desde Ajustes cuando REQUIRED, sin geografía de depuración forzada. IDs de producción/debug separados, SDK Ads 24.9.0 y UMP 4.0.0, AD_ID presente en manifests fusionados existentes debug/release. Clasificación G, no personalización y callback oficial de recompensa conservados. Intersticiales automáticos deshabilitados localmente en AdServingMode; no extrapolar a la versión 206 publicada. No se ejecutó Android ni se recompiló: no hubo cambios de código en esta revisión. No demuestra funcionamiento físico ni aprobación de cuenta.
Fuentes oficiales: https://support.google.com/admob/answer/3150176 y https://support.google.com/admob/answer/10477886 y https://developers.google.com/admob/android/privacy. La segmentación comercial no sustituye privacidad según ubicación efectiva.
