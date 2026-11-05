# Preparación AdMob — 09/10/2026

Ámbito: archivo público de autorización, preparación de publicación web, propuesta legal y comprobaciones. Sin ejecutar Android, alterar cuentas bancarias, vincular una ficha inexistente ni activar publicidad.

## Preparado
- IDs propios en release y demo en debug; Admin en modo usuario usa demo incluso en release. Ver build.gradle.kts y AdMobProvider.
- UMP solicita consentimiento antes de cargar; contenido máximo G, personalización deshabilitada y solicitudes npa=1. Esto no garantiza cada creatividad.
- Archivo preparacion-admob/app-ads.txt obtenido directamente del diálogo oficial de la cuenta AdMob:
  google.com, pub-4563495447517759, DIRECT, f08c47fec0942fa0
- Preparar-AppAds.ps1 incorpora la línea en el directorio web compilado suministrado; conserva otras líneas existentes. No despliega y no cambia páginas.
- Cuenta: perfil de pagos completado según pantalla; no implica verificación bancaria/identidad final.
- Google Play: 205/2.0.3 disponible interna. El bundle 201/2.0.1 no adquiere estas integraciones por publicar una configuración web.
- Propietario reporta compra y reembolso de prueba correctos. No confundir con entrega de anuncios reales.

## Se puede completar ahora
1. Incorporar app-ads.txt a la distribución ACTUAL del sitio que se va a desplegar. No desplegar un dist antiguo ni publicar textos legales sin aprobar.
2. Publicar como archivo estático en https://rumbo-jonsu.web.app/app-ads.txt si ese es el dominio elegido como web del desarrollador. Debe devolver 200 y la línea en texto plano, no el HTML de la SPA.
3. Declarar ese dominio como sitio web del desarrollador en la ficha de Play (no basta URL de privacidad). Una actualización de ficha puede requerir revisión.
4. Revisar y aprobar propuesta legal actualizada ADMOB_TEXTO_LEGAL_PARA_APROBAR.md, mensaje UMP y proveedores; después publicar y comprobar privacidad visible.
5. Revisar Seguridad de los datos y declaración de anuncios según versión 205 y datos tratados por SDK. No copiar automáticamente el ejemplo del skill.
6. Esperar aprobación de la cuenta AdMob; atender solo los avisos realmente exigidos. Propietario introduce identidad/datos fiscales/bancarios si Google los pide.

## Cuando la ficha exista y sea localizable
- AdMob > RASTRO Preuniversitario > agregar tienda: vincular exactamente com.jonsuapps.rastro. No otra app y no crear segunda aplicación AdMob.
- Solicitar/completar verificación app-ads.txt y revisión de disponibilidad. Esperar al menos 24 h para rastreo; no es promesa de aprobación.
- Confirmar cuenta aprobada, app preparada y ausencia de infracciones/limitaciones pendientes.
- Verificar entrega real con usuario gratuito no Admin, consentimiento correcto, anuncio fuera de preguntas y callback de recompensa. No tocar anuncios reales para probar clics.
- Comprobar interruptor de anuncios automáticos existente y activarlo solo tras completar requisitos; no forzar a cuentas Pro.
- Mantener prueba interna para depuración y promover 205 únicamente con autorización de producción.

## Estado observado en consola
09/10/2026: cuenta aún no aprobada; RASTRO Debe revisarse / Publicación limitada / Agregue tienda; dos unidades activas. Mensaje europeo Borrador.
app-ads.txt local preparado, NO publicado ni rastreado. No afirmar que todos los pasos pendientes dependen de producción: legal, web y cuenta se preparan antes.

Fuentes:
- https://support.google.com/admob/answer/14538460
- https://support.google.com/admob/answer/9363762
- https://support.google.com/admob/answer/9989980


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

## 12/10/2026 — Verificación actual sin nueva subida

Play Console, Actividad de envío: envío 3 de producción del 10/10/2026 figura Publicado. No se cargó otro bundle ni se enviaron nuevos cambios.
AdMob con aguilar.jonsu@gmail.com redirige a signup?sac=true: «No se aprobó su cuenta», «Debe corregir algunos problemas para poder usar AdMob». Muestra confirmación de lectura/cumplimiento de Políticas del Programa y botón Reenviar. No se marcó ni reenvió esa declaración. La pantalla no detalla una infracción específica. El propietario debe revisar la declaración antes de autorizar el reenvío. No se pudo acceder a la configuración de la app para vincularla en esta sesión. Evidencia: build/admob-cuenta-no-aprobada-2026-10-12.png.
El estado anterior «en verificación» queda sustituido por esta observación. No afirmar vinculación completada, consentimiento publicado ni anuncios reales habilitados.

## 12/10/2026 — Cuenta reenviada y vinculación completada

Por autorización explícita del propietario, se leyeron las políticas oficiales AdMob/AdSense, se marcó la declaración existente de lectura/cumplimiento y se pulsó Reenviar. Resultado: «Estamos revisando su información»; acceso al panel recuperado. No se aceptaron nuevos contratos ni se cambiaron datos bancarios.
Se vinculó la aplicación AdMob EXISTENTE 3422086209 con Google Play com.jonsuapps.rastro, JONSUAPPS, usando la URL pública exacta. AdMob confirmó «Verificaste RASTRO Preuniversitario (Android) correctamente». Tabla: En preparación / Publicación limitada / Revisión en curso. Dos unidades existentes conservadas; sin nueva aplicación ni bundle. Google indica revisión de app normalmente 2–3 días, no garantizados. Evidencia build/admob-rastro-vinculada-2026-10-12.png.

Comprobación adicional 12/10: app-ads.txt aún no muestra solicitudes ni rastreo en AdMob; aviso de detección de dominio hasta 7 días. El archivo público ya publicado no equivale a rastreo aprobado. Mensaje europeo existente continúa Borrador; al abrir el editor quedó cargando y no se pudo revisar/publicar. No se activaron anuncios automáticos ni se subió otra versión.

12/10/2026: propietario autorizó terminar/publicar consentimiento europeo existente. Ámbito: AdMob y documentación, sin código/app nueva. Se abrió editor en pestaña del propietario, se esperó y se recargó/reabrió una vez. En ambos intentos diálogo permaneció cargando sin vista previa/configuración; no fue posible revisar ni publicar. Mensaje aún Borrador, sin duplicación. Evidencia build/admob-editor-consentimiento-2026-10-12.png. UMP canRequestAds y loadAndShowConsentFormIfRequired existentes comprobados en código; no ejecución de Android.
