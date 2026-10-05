# Actualización posterior — 05/10/2026

El usuario autorizó generar y subir el bundle: 2.0.1/code 201 ya está cargado y aceptado en Play, con lanzamiento Alpha guardado. El registro vigente está en VERSIONES DE LA APP SUBIDAS A PLAY CONSOLE.md. La preparación anterior se conserva debajo como historial; sus frases sobre no generar ya no describen el estado actual.

# Preparación de RASTRO 2.0.1 — 05/10/2026

Versión configurada: **2.0.1**, **versionCode 201**, paquete **com.jonsuapps.rastro**. Google Play Console se consultó el 05/10: Todos los paquetes de aplicación contiene exactamente un bundle **1.0/code 1**, activo en Alpha. El código 201 supera ese máximo; 2.0.1 es una nueva versión local, todavía no cargada.

## Configuración release

- targetSdk/compileSdk 36; minSdk 24, conservados.
- Release no depurable y minificación R8 activada.
- Firma existente en local.properties ignorado, keystore fuera del repositorio. No se creó otra clave.
- Configuración de firma completa, contraseña del almacén y acceso a clave privada verificados localmente sin mostrar secretos; certificado SHA-1 coincide con la clave de carga registrada en Play: 28:44:98:D3:D5:BA:F3:AC:E5:B9:19:FC:6F:CA:38:BA:B8:27:25:B4.
- No permisos nuevos ni modificaciones de Firebase/Console/legales en esta intervención.

## Generación por el propietario

No se ejecutó bundleRelease ni assemble. Los APK/AAB que ya existen en build/outputs son anteriores y **no contienen la versión 2.0.1 ni los cambios recientes**. Generar un nuevo Android App Bundle release con la clave de carga existente. Desde la raíz y con Java 21 configurado:

```powershell
.\gradlew.bat :androidApp:bundleRelease
```

Salida esperada: androidApp/build/outputs/bundle/release/androidApp-release.aab. Este documento no confirma la firma del archivo futuro; comprobar que Play identifica 2.0.1/code 201 al cargarlo. No regenerar claves ni usar el certificado de firma de Play como clave de carga.

## Pendientes que impiden afirmar producción lista

1. **Acceso a producción:** comprobado directamente el 05/10 en Console: «Aún no tienes acceso a producción». El proyecto puede preparar/subir para pruebas, pero no lanzar producción mientras ese acceso siga pendiente. Requisito y solicitud: https://support.google.com/googleplay/android-developer/answer/14151465.
2. **Eliminación de cuenta:** implementación local preparada, backend cleanup sin despliegue confirmado; sigue documentado el requisito Blaze y prueba con cuenta descartable. No se cambió facturación ni se borró ninguna cuenta.
3. **Declaraciones y legal:** Seguridad de los datos/anuncios necesitan adecuarse a los flujos reales. Propuesta legal sigue esperando la revisión/aprobación expresa solicitada por el propietario; no publicar por interpretar esta petición como aprobación del texto. App Links publicado todavía requiere revisión contra el JSON preparado.
4. **Calidad académica y pruebas físicas:** incidencias heredadas del banco detalladas en docs/aprender/VALIDACION_CATALOGO_2027.md (182 duplicados y 14 advertencias en aquella validación); no se certifica su corrección con pruebas de compilación. Recorrido de los cambios recientes en celular pendiente.

No confundir configuración release correcta con aprobación de Google Play, backend desplegado o revisión legal completada.

## Validación local — 05/10/2026

Comando ejecutado: verifyRastroReleaseConfiguration (init temporal de verificación), :androidApp:compileReleaseKotlin, :androidApp:minifyReleaseWithR8, :androidApp:lintVitalRelease y :androidApp:testDebugUnitTest. BUILD SUCCESSFUL; 119 pruebas Android, cero fallos. Log: build/release-2.0.1-validation.log.

Verificado que los archivos anteriores de build/outputs/bundle/release y build/outputs/apk/release conservan su fecha 04/10/2026: ninguna tarea de generación APK/AAB ejecutada. No app/emulador Android, instalación, subida, publicación, commit ni push.
