# Versiones de la app subidas a Play Console

Última comprobación directa: 09/10/2026. Aplicación: RASTRO Preuniversitario. Paquete: com.jonsuapps.rastro. Última interna confirmada: 205 / 2.0.3; disponible para verificadores internos.

| Versión visible | versionCode | Canal | Estado comprobado |
| --- | ---: | --- | --- |
| 1.0 | 1 | Prueba cerrada Alpha | Versión anterior inactiva; publicación histórica: 24/09/2026. |
| 2.0.1 | 201 | Prueba cerrada Alpha | Disponible; sin cambios durante la integración Billing del 07/10/2026. |

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
2. Usar un código mayor: 202, 203 y 204 ya están utilizados; 205 es el siguiente disponible si no se ha cargado otro superior. El nombre puede ser 2.0.2 o el que corresponda; no exige versiones intermedias desde 1.0.
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


## Billing / prueba interna — 07/10/2026

| Versión visible | versionCode | Canal | Estado comprobado |
| --- | ---: | --- | --- |
| 2.0.2 | 202 | Prueba interna | Lanzada 15:15 para desbloquear productos Billing; reemplazada por 203 en interna. |
| 2.0.2 | 203 | Prueba interna | Lanzada 15:31; sin verificadores. Cerrada 201 intacta; sin promoción a producción. |

AAB 203: androidApp/build/outputs/bundle/release/androidApp-release.aab; 80 478 888 bytes.
SHA-256: F953B8A9C48C1A5B4893D6F5202B186E3DA6225B822076F3522D175CB67F4623.
134 pruebas Android sin fallos; lintVitalRelease, bundleRelease, bundletool validate y jarsigner correctos. BILLING/9.1.0 y código 203 confirmados en manifest del bundle. Misma clave de carga; no nuevos secretos. Compras deshabilitadas hasta productos, servidor y pruebas reales. Ver docs/monetizacion/PLAY_BILLING.md.


Comprobación final en «Versiones y paquetes más recientes»: interna 203 activa, Alpha 201 conserva lanzamiento del 05/10/2026; 202 inactiva. Screenshot: build/play-internal-203-alpha-201.jpg. Próximo código mínimo disponible: 204, sujeto a verificar nuevamente Play antes de compilar.

## Prueba interna — 08/10/2026

| Versión visible | versionCode | Canal | Estado comprobado |
| --- | ---: | --- | --- |
| 2.0.2 | 204 | Prueba interna | Disponible para verificadores internos; fecha de lanzamiento indicada por Play: 8 oct, 2:00 p.m. |

- Máximo anterior 203 comprobado en Console antes de generar el nuevo binario.
- Bundle: androidApp/build/outputs/bundle/release/androidApp-release.aab; 80 511 418 bytes.
- SHA-256: 40A1357AB83EB5B8C376E93A923AF6A128DEE540F3F28F0447CA53655DBD9052.
- 325 pruebas sin fallos (140 Android y 185 shared), lintVitalRelease y bundleRelease correctos.
- bundletool valida el bundle; firma verificada con la misma clave de carga. Manifest final: BILLING, código 204, nombre 2.0.2, target 36 y mínimo 24.
- Play aceptó 204, cero errores bloqueantes y una recomendación de símbolos de depuración del código nativo. Archivo ReTrace incluido. Ningún dispositivo dejó de ser compatible respecto de 203.
- Solo se lanzó interna. No se promovió el bundle a cerrada ni producción. No se ejecutó la aplicación.
- Evidencia: build/play-internal-204.jpg.
- Compras continúan desactivadas. Configuración RevenueCat, productos, consentimiento y pruebas reales pendientes: docs/monetizacion/ESTADO_PRODUCCION_204.md.
- Próximo código mínimo: 205, sujeto a consultar Play antes de cualquier nueva carga.

Notas es-419: guardado local y respaldo opcional, playlists/fotos con menos consultas, vidas y misiones de monedas, actualización explícita de actividad en Admin y aviso de que las compras Pro no están disponibles en esta prueba.

Comprobación final: interna 204 activa, 203/202 inactivas, cerrada Alpha 201 disponible y sin cambios. La lista existente «pruebas internas» está seleccionada con 2 usuarios; «TESTER RASTRO» no está seleccionada para interna. No se editó ninguna lista. Enlace de adhesión: https://play.google.com/apps/internaltest/4701199787677789376 (requiere cuenta autorizada en la lista).

## Candidata local — 08/10/2026, NO subida

| Versión | versionCode | Estado |
| --- | ---: | --- |
| 2.0.3 | 205 | Generada y firmada localmente; NO subida a ningún canal |

Última interna real comprobada directamente en Play: 204 / 2.0.2. AAB candidata: androidApp/build/outputs/bundle/release/androidApp-release.aab, 81 927 559 bytes.
SHA256: C3951529622E57A7AFE4E8D93E44C0052EF8CBC0AD6011F25285C2EDAF9DCDE0.
354 pruebas sin fallos, lintVitalRelease, bundleRelease, compilar_app.bat/assembleDebug, firma y bundletool correctos. BILLING, 205 y 2.0.3 confirmados en manifest del propio bundle. RevenueCat/productos reales integrados; pruebas reales de compra desde Play pendientes. No se instaló/ejecutó app ni se publicó ninguna versión en este paso. Consultar docs/monetizacion/REVENUECAT_ESTADO_CONFIGURACION.md.
Próximo código si 205 se sube: 206; antes de cualquier carga volver a consultar Play.

## 08/10/2026 — Cambios posteriores al bundle 205

Código actualizado con popup Admin Pro/promociones, códigos hasta un millón, reparación de rachas, canal oficial y gestión de mensajes. El bundle 205 anterior conserva su hash y NO contiene estos cambios: regenerar antes de cargarlo a Play. Código local continúa 205/2.0.3 porque esa candidata no fue subida. No se publicó otra versión en este paso; no reutilizar este registro como prueba de subida. Guía docs/admin/PRO_PROMOS_RACHAS_PRUEBAS.md.

## Prueba interna — 09/10/2026

- Play Console confirma 205 / 2.0.3: Disponible para verificadores internos. Lanzamiento indicado: 9 oct 7:55 a.m.
- AAB actual: androidApp/build/outputs/bundle/release/androidApp-release.aab; 81 962 633 bytes.
- SHA256: 0AD4D61C22A0992C8B414069C20EB493CFC22345834053E7506AD2E493145D63.
- 359 pruebas Android/shared sin fallos; lintVitalRelease y bundleRelease correctos. Bundle validado y firma de carga verificada. Manifest del bundle: com.android.vending.BILLING, versionCode 205, versionName 2.0.3, target 36, mínimo 24.
- Play: cero errores bloqueantes; recomendación de símbolos nativos de depuración. ReTrace incluido; sin pérdida de dispositivos compatibles.
- Solo canal interno. Producción y prueba cerrada sin cambios. No se instaló ni ejecutó la app desde el agente.
- Listas internas guardadas: pruebas internas (2 cuentas) y RASTRO compras de prueba (1 cuenta autorizada); TESTER RASTRO no seleccionada.
- Instalación: https://play.google.com/apps/internaltest/4701199787677789376 con aguilar.jonsu@gmail.com.
- Evidencia: build/play-internal-205.png; comprobaciones: build/internal-release-205-final.log, build/internal-release-205-bundle-validation.log, build/internal-release-205-signature.log y build/internal-release-205-manifest.xml.
- Compra y restauración físicas pendientes: usar tarjeta de prueba de Google Play. Esta subida no prueba una compra completada.
- Este bundle regenerado sustituye la candidata anterior y contiene los cambios posteriores documentados. Próximo versionCode mínimo: 206; comprobar Play antes de otra subida.

Novedades públicas es-419, sin referencias al Admin:
Corrección de errores.
Mejoras de estabilidad y rendimiento.
Ajustes visuales para una mejor experiencia de estudio.

## Producción — 10/10/2026 — 2.0.4 / 206

AAB aceptada y envío confirmado: «Cambios en la etapa de revisión», verificaciones rápidas de Google pendientes. Lanzamiento completo solicitado, 177 países/regiones y resto del mundo. Publicación administrada desactivada; todavía no equivale a disponibilidad pública.
Incluye eliminación de cuentas corregida y texto legal aprobado, publicado también en web. Seguridad de datos enviada junto con la versión. Sin referencias al Admin en las novedades públicas.
SHA256 AAB: 08C59DCF40B7CAA282FD1EDB8C40F6520599555FFC3ED7A6EA4876E363599C51. 81 967 487 bytes. 361 pruebas sin fallos; bundle y firma validados. Única recomendación Play: símbolos nativos de depuración. Detalle: docs/publicacion/RELEASE_2.0.4_206.md.
Próximo versionCode mínimo: 207. Consultar Console antes de una nueva carga.
