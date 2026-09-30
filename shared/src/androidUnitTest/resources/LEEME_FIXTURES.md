# Fixtures de tests (NO contenido de la app)

Espejo exacto de `src/commonMain/composeResources/files/aprender/biologia/semana08/`
(8.1–8.4) para que el classloader los resuelva en unit tests JVM, donde `Res`
no funciona (sin Context Android).

REGLA: si cambia el contenido real de Semana 8, copiar los archivos aquí también.
`MapaBiologiaRegressionTest` valida contra estas copias.
