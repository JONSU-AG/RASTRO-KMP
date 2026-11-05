# Arquitectura

Se reutilizan JsonContentLoader y el motor de opción múltiple existentes. Los ejercicios se guardan como JSON estáticos dentro de cada nivel. Las lecturas originales se incluyen en el enunciado de cada pregunta para que no dependan del orden del cuestionario. No se crea otro sistema de lectura ni se modifica Firebase.

Mapas de teoría: AcademicTheoryDocument y AcademicSourceMap existentes, sin cambiar el motor. Las tablas comparativas usan extractAcademicTables y el renderizado local. Fuentes Markdown y fixtures equivalentes.
