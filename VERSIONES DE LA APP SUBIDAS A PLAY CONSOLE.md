# Versiones de la app subidas a Play Console

Última comprobación directa: 05/10/2026. Aplicación: RASTRO Preuniversitario. Paquete: com.jonsuapps.rastro.

| Versión visible | versionCode | Canal | Estado comprobado |
| --- | ---: | --- | --- |
| 1.0 | 1 | Prueba cerrada Alpha | Versión anterior activa; última publicación indicada por Play: 24/09/2026. |
| 2.0.1 | 201 | Prueba cerrada Alpha | Bundle cargado y aceptado; lanzamiento completo Alpha enviado. Play muestra Cambios en la etapa de revisión. |

## Bundle 2.0.1

- Archivo: androidApp/build/outputs/bundle/release/androidApp-release.aab.
- Tamaño exacto: 76 499 223 bytes.
- SHA-256 del archivo: 24430F9DCD2BAA86C09EC3EF7423E006B93477E7EBCF4557E78D5EDF75EB9E0C.
- Firma JAR verificada: jar verified. Clave de carga existente, sin crear otra.
- SHA-1 del certificado de carga: 28:44:98:D3:D5:BA:F3:AC:E5:B9:19:FC:6F:CA:38:BA:B8:27:25:B4.
- targetSdk 36; mínimo Android API 24. Play confirmó 201 (2.0.1).
- Validación local: 121 pruebas Android correctas, lintVitalRelease y bundleRelease correctos. No se ejecutó la aplicación ni se instaló APK.
- Play: cero errores bloqueantes y una recomendación de símbolos de depuración del código nativo. Archivo de mapeo ReTrace incluido.
- Destino del lanzamiento guardado: 100 % de Alpha, 86 instalaciones activas indicadas por Play. No es producción.

## Notas cargadas (es-419)

Pizarra con borrador por trazos y de precisión, selector RGB, grosor ajustable, deshacer y rehacer, y exportación de imágenes.
Nuevo canal privado de errores y sugerencias desde Inicio.
Mejoras en lecciones, temas, widgets, playlists, simulador y presentación del progreso.

## Para la siguiente versión

1. Consultar el máximo versionCode realmente cargado en Todos los paquetes de Play. El 201 ya está utilizado y no se puede reutilizar para otro archivo.
2. Usar un código mayor: 202 es el siguiente disponible si no se ha cargado otro superior. El nombre puede ser 2.0.2 o el que corresponda; no exige versiones intermedias desde 1.0.
3. Conservar com.jonsuapps.rastro y la misma clave de carga. No guardar contraseñas ni claves privadas en este documento o en Git.
4. Revisar cambios, pruebas y lint, generar el bundle release y comprobar su firma y la versión que reconoce Play.
5. Registrar en esta tabla fecha, canal y estado real: cargado, enviado a revisión o disponible. No confundir estos estados.
6. Puede promoverse el mismo bundle 201 a otro canal sin reconstruirlo cuando Play permita acceder a ese canal. Cualquier binario nuevo requiere un código superior.

La generación y carga fueron autorizadas expresamente en esta intervención. No se hizo commit ni push. La prueba táctil del borrador queda pendiente para el propietario.
## Estado final en Console
Play guardó el lanzamiento 2.0.1 en Descripción general de la publicación. No se envió a revisión: el botón agrupa cinco cambios, incluyendo Privacidad y Seguridad de los datos anteriores, cuya aprobación legal sigue pendiente. Los controles para guardar cambios para más adelante estaban deshabilitados mientras Play ejecutaba verificaciones rápidas. No se descartó ni publicó ningún cambio anterior. Evidencia: build/play-console-2.0.1.jpg.

Console: https://play.google.com/console/u/0/developers/5600876977625035057/app/4975234477259186336/publishing


## Envío confirmado — 05/10/2026

Tras autorización expresa del propietario se enviaron los cinco cambios pendientes: 2.0.1/code 201 en Alpha, icono, capturas de teléfono, URL de privacidad y Seguridad de los datos. Play cambió a «Cambios en la etapa de revisión» y ya no muestra cambios sin enviar. Las verificaciones rápidas continúan; Play indica que se enviarán para revisión en cuanto terminen correctamente. Este estado no significa aprobación ni disponibilidad para testers. Evidencia: build/play-console-2.0.1-en-revision.jpg.

Esta actualización supera el apartado anterior que indicaba envío detenido. No se modificó ni publicó el contenido legal alojado en Firebase; se envió la configuración de privacidad que ya estaba pendiente en Play. No se hizo otro bundle, commit ni push.
