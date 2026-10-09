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

