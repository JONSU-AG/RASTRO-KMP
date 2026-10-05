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
