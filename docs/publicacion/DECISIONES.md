# Decisiones

La instrucción vigente suspende la generación de APK/AAB y la subida. La versión de Console es 1.0/code 1; 1.0 BETA es el nombre del lanzamiento. Un artefacto local 1.0.3 no define la versión publicada. Completar la SHA-256 del mismo certificado Play existente no crea otra app ni sustituye certificados. Respaldar y probar reglas antes de desplegar, y comparar después con el servidor. Mantener Spark mientras el propietario no habilite facturación; no desplegar Hosting parcial para corregir un único assetlinks.

Auth debe confirmar borrado antes de limpiar datos. Cleanup servidor por propiedad explícita, paginado e idempotente, sin depender de UI. Codebase aislado account-cleanup. No despliegue ni cambio de versión por suposición. Rules requieren correo Admin verificado y propiedad real/inmutable. No confundir pruebas de regresión verdes con aceptación pedagógica global ni compilación con recorrido físico.

Registrar confirmaciones del propietario para el fallo concreto, sin extenderlas a todos los recorridos. Distinguir carga de firma Play; preservar asociación de carga existente al preparar App Links con Play. JSON preparado no equivale a despliegue ni habilita OAuth. No inferir versionCode desde «1.0 BETA».

La tabla viva y el explorador completo sustituyen pendientes basados solo en capturas: no volver a pedir versión máxima ni SHA-1 Play ya recuperadas. Registrar una huella existente no es necesario. La lectura de Data Safety no implica aprobación: separar tipos recopilados, finalidades y excepciones de compartir antes de cualquier guardado externo. Un error de carga de Público/Audiencia no confirma su estado.

Firma de carga reutilizada, no crear otra clave para una app existente. Secretos solo en local.properties ignorado y clave externa. Verificar certificado del artefacto generado, no solo el archivo keystore. AAB firmado preparado no significa producción aprobada; última instrucción es no subir/publicar.

## 05/10/2026 — versión autorizada

La nueva petición autoriza cambiar la versión local a 2.0.1, con código 201 superior al máximo 1 comprobado en Play Console. No autoriza generar o subir un bundle: lo hará el propietario. Reutilizar la clave de carga existente, conservar paquete y Firebase, y comprobar release mediante compilación/R8/lint sin tareas de empaquetado. Producción no se declara lista mientras siga bloqueada en Console o queden pendientes de backend, declaraciones, legal y revisión académica.

## 05/10/2026 — Bundle autorizado y cargado
2.0.1/code 201, firma existente verificada, 121 pruebas Android y lintVitalRelease correctos. Play aceptó el AAB y guardó el lanzamiento Alpha. Estado de distribución actualizado en VERSIONES DE LA APP SUBIDAS A PLAY CONSOLE.md. Sin commit/push ni ejecución de la app.
