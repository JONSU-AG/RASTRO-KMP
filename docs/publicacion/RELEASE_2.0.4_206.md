# Producción — 2.0.4 / código 206

Preparación del 10/10/2026. Este documento distingue preparación, subida y publicación.

## Comprobado

- Play Console concede acceso a producción. Producción inactiva al iniciar; máximo real 205/2.0.3 en prueba interna, 201/2.0.1 en Alpha.
- Fuente Android 2.0.4/206. Paquete com.jonsuapps.rastro, targetSdk 36, firma de carga existente.
- Incluye la eliminación de cuenta corregida y el texto legal aprobado expresamente por el propietario el 10/10.
- Bundle release y pruebas: BUILD SUCCESSFUL; 361 pruebas Android/shared, cero fallos y errores en XML. Build final: build/production-206-final-build.log.
- bundletool validate correcto; manifest con BILLING y versión 206/2.0.4; jarsigner: jar verified. Sin ejecución de Android.
- AAB: androidApp/build/outputs/bundle/release/androidApp-release.aab.
- SHA256: 08C59DCF40B7CAA282FD1EDB8C40F6520599555FFC3ED7A6EA4876E363599C51.
- Certificado SHA256: 4D:20:01:27:28:E4:FF:BC:F7:4F:32:1C:A2:02:75:3F:C4:2C:F9:52:D3:D7:0C:A2:EE:05:B8:62:86:48:BE:A2.
- Centro legal web compilado, tipado y publicado. Fuentes reproducibles en centro-legal/. No se desplegó la antigua app React ni la copia Compose web. Configuración anterior preservada en build/hosting-before-206.json para recuperación.
- app-ads.txt público: HTTP 200, text/plain, línea oficial pub-4563495447517759. Asset Links incluye firmas de carga y distribución Play.
- Seguridad de datos guardada en Play para revisión: cuenta opcional para invitados, compras, mensajes, fotos, documentos y UGC; datos de AdMob compartidos para publicidad/estadísticas/prevención de fraude. Compartir contenido por solicitud del usuario y proveedores de servicio se trataron según las excepciones de Play.
- Declaración existente «Sí, mi app contiene anuncios» comprobada; no hacía falta cambiarla.

## Novedades públicas

Corrección de errores. Mejoras de estabilidad y rendimiento. Ajustes para una mejor experiencia de estudio.

No mencionar funciones de administración.

## Estado externo pendiente de actualizar

- AAB 206/2.0.4 aceptada y enviada a producción el 10/10/2026. Console muestra «Cambios en la etapa de revisión», con verificaciones rápidas pendientes de Google. Lanzamiento completo solicitado para 177 países/regiones y resto del mundo. Publicación administrada desactivada: se publicará tras aprobación. Siete cambios enviados, incluyendo Seguridad de datos y disponibilidad; los cambios de disponibilidad también afectan al canal abierto según Console. Sin versión nueva en ese canal. Evidencia: build/play-production-206-enviada.png. Única advertencia: faltan símbolos nativos de depuración; ReTrace incluido, cero errores bloqueantes.
- AdMob: cuenta en verificación, app sin ficha pública vinculada. Mensaje europeo sigue en borrador; su editor responde «No se puede cargar la página». No declarar consentimiento publicado ni anuncios reales comprobados.
- La revisión/aprobación de Google y el rastreo AdMob no se completan solo por subir un bundle.
- Perfiles huérfanos históricos: requieren identificar UID y comprobar propiedad/estado Auth; no borrar por correo/nombre.
- Banco académico heredado: la compilación no certifica respuestas académicas. Sigue pendiente su validación específica.
- El propietario confirmó compras/reembolso y eliminación en dispositivo; el agente no ejecuta Android.
- No se modificó Blaze, información bancaria, fiscal o identidad.


## 12/10/2026 — Verificación actual sin nueva subida

Play Console, Actividad de envío: envío 3 de producción del 10/10/2026 figura Publicado. No se cargó otro bundle ni se enviaron nuevos cambios.
AdMob con aguilar.jonsu@gmail.com redirige a signup?sac=true: «No se aprobó su cuenta», «Debe corregir algunos problemas para poder usar AdMob». Muestra confirmación de lectura/cumplimiento de Políticas del Programa y botón Reenviar. No se marcó ni reenvió esa declaración. La pantalla no detalla una infracción específica. El propietario debe revisar la declaración antes de autorizar el reenvío. No se pudo acceder a la configuración de la app para vincularla en esta sesión. Evidencia: build/admob-cuenta-no-aprobada-2026-10-12.png.
El estado anterior «en verificación» queda sustituido por esta observación. No afirmar vinculación completada, consentimiento publicado ni anuncios reales habilitados.
