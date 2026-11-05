# Conexión del contenido de Lenguaje

La producción usa `shared/src/commonMain/composeResources/files/aprender/lenguaje`. Cada nivel conserva `lesson.json` para metadatos, `theory.md` para teoría y `questions.json` para retos. JsonContentLoader incorpora la teoría al nivel; AprenderRepository y el mapa de aprendizaje consumen ese contenido mediante la infraestructura común. No se añade un loader de Lenguaje.

Los tests de shared leen copias en `shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/lenguaje`. Una reparación debe conservar la equivalencia de esos archivos. Las pruebas Android pueden usar JsonContentLoader con lectura local de los archivos de producción.

El nivel 1.1 añade un mapa de clasificación y tres tablas en el formato del renderer académico existente. No cambia la lógica de las pantallas, los recursos remotos ni la navegación. Un mapa analizado correctamente en una prueba no confirma su presentación física en el teléfono.

El README conserva el registro histórico de importación; sus afirmaciones de validación inicial no equivalen a una certificación académica de todos los niveles actuales.
