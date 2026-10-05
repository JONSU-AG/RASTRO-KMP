# Estado vigente — 05/10/2026

Versión local actual: **2.0.1/code 201**. Preparación y pendientes: [RELEASE_2.0.1.md](RELEASE_2.0.1.md). No se generó un paquete nuevo. Todo artefacto 1.0.3 descrito debajo es evidencia histórica y no corresponde al código actual.

# Release preparado — 04/10/2026

**Instrucción vigente: no generar APK ni AAB, ni subir ni publicar.** Este documento conserva evidencia de un artefacto anterior, no autorizado para distribución ahora. La versión real consultada en Play Console es **1.0 / versionCode 1**, lanzamiento **1.0 BETA**, prueba cerrada Alpha. No hay 1.0.3 subida.

## Paquete

- Archivo: androidApp/build/outputs/bundle/release/androidApp-release.aab
- Paquete: com.jonsuapps.rastro
- Versión: 1.0.3; versionCode: 3 (máximo observado en Play: 1).
- Tamaño: 76402616 bytes.
- SHA-256 del archivo: 54292BBB2C373939434A3213A58734CD806EA6639DDB56FB516C781C0DB2606D
- SHA-1 del certificado de carga: 28:44:98:D3:D5:BA:F3:AC:E5:B9:19:FC:6F:CA:38:BA:B8:27:25:B4
- Clave encontrada en la carpeta de respaldo indicada por el propietario; coincide con el certificado de carga registrado en Play.

## Comprobaciones realizadas

- [x] :androidApp:bundleRelease termina BUILD SUCCESSFUL con minificación R8.
- [x] jarsigner -verify confirma jar verified; certificado del AAB coincide con carga de Play.
- [x] Estructura de Android App Bundle y bloque de firma presentes.
- [x] local.properties está ignorado por Git; contiene configuración local de firma. No se copió la clave al repositorio ni se mostraron contraseñas.
- [x] No subida, publicación, ejecución de Android, commit ni push.

## Regenerar (solo tras nueva instrucción del propietario)

Con la clave de respaldo disponible y la configuración local existente:

```powershell
.\gradlew.bat :androidApp:bundleRelease
```

La configuración usa rastro.signing.storeFile, storePassword, keyAlias y keyPassword del local.properties ignorado. Si se establece algún campo y falta otro o el archivo no existe, falla claramente. Sin configuración de firma, otros checkouts conservan su comportamiento anterior; deben verificar la firma antes de distribuir. No compartir local.properties ni CREDENCIALES-RASTRO.txt.

## Estado de publicación

**Preparación global para producción todavía pendiente; no generar paquetes ahora.** No confundir compilación/firma anteriores con aprobación de Play o validación académica. Siguen abiertos GP-20 (182 duplicados y 14 advertencias heredadas), Functions de GP-16 (Spark debe pasar a Blaze) y prueba de eliminación, publicación de App Links, ajuste de Data Safety y recorridos físicos. SHA-256 Play registrada, audiencia OAuth comprobada y reglas Firestore desplegadas en la revisión posterior.

Para reutilizar la misma versión posteriormente, Play permite añadir un bundle ya cargado desde la biblioteca a otra versión/canal. Si las pruebas requieren cambiar el binario después de su carga, se necesita otro versionCode. Fuente: https://support.google.com/googleplay/android-developer/answer/9859348?hl=en-EN .

