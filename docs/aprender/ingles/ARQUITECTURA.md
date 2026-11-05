# Carga de Inglés

Se usa el JsonContentLoader existente. Cada nivel contiene `lesson.json`, `theory.md` y `questions.json`; no hay un motor alternativo. Los datos de prueba equivalentes se mantienen en los recursos androidUnitTest de shared. No se modifican rutas, Firebase, monetización ni el catálogo Kotlin legacy.

Los scripts de autoría generan recursos estáticos solo durante el desarrollo. No se ejecutan en el teléfono. Las preguntas de lectura incluyen su texto completo en el propio enunciado para no depender de otras preguntas.
