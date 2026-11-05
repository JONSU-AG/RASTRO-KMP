# Checklist
- [x] Herramientas y comunidad coinciden con sus bloques originales de HEAD; comprobación textual realizada. Estrellas de estudio ampliadas y tarjeta acortada; assembleDebug correcto (31 s), home-original-tools-compact-study.log. Diff sin errores de espacios.
- [ ] Revisar en teléfono las proporciones de estudio y estrellas; no se ejecutó Android.
- [x] Corrección de tamaños de estudio/meta e iconos de herramientas: assembleDebug y 11 pruebas pasan; build/home-compact-tools-validation.log. Sin ejecutar Android.
- [ ] Comprobar las nuevas proporciones visualmente en teléfono con el propietario.
- [x] Mapa, Git, código de autenticación/bienvenida/Home/modelo y docs revisados.
- [x] Cabecera AuthScreen con los tres personajes originales; callbacks intactos.
- [x] Propietario elige varias universidades verificadas.
- [x] Catálogo inicial UNSA, UNMSM, UNI, UNT contrastado con fuentes oficiales; fuentes y límites en FUENTES.md.
- [x] Diálogo de universidad/carrera con búsqueda, volver, guardar y decidir después integrado en Inicio.
- [x] Preferencias locales separadas por cuenta/invitado; sin escrituras en Firebase.
- [x] Metas heredadas conservadas; sin transferencia automática entre cuentas ni desde invitado.
- [x] Edición posterior desde tarjeta del Home; elección no altera banco ni ruta académica.
- [x] Al eliminar una cuenta se limpian únicamente sus nuevas preferencias locales de meta, tras la eliminación real.
- [x] assembleDebug y cinco pruebas StudyGoalTest pasaron en primera validación.
- [x] Verificación final tras limpieza local: assembleDebug + StudyGoalTest correctos (14 s). Evidencia build/study-goal-validation.log y XML testDebugUnitTest.
- [ ] Verificación visual/física en teléfono por propietario. El agente no ejecutó Android.
- [ ] Catálogo exhaustivo de todas las universidades/carreras: fuera de esta selección inicial.


## Ampliación regional
- [x] UNAP-Puno, UNSAAC, UNJBG y UNCP añadidas con carreras contrastadas y fuentes.
- [x] IDs y preferencias anteriores conservados; sin cambios en Firebase ni bancos de preguntas.
- [x] Límites de comparación de temarios documentados en FUENTES.md.
- [x] assembleDebug y 6 StudyGoalTest correctos (2 min 22 s); build/study-goal-expanded-validation.log.


## Entrada visual y universidades
- [x] Loki negro confirmado como protagonista; identidad única en portada, contraseña y Home predeterminado.
- [x] Ocho distintivos locales oficiales, sin descargas al abrir app; fuentes y preparación documentadas.
- [x] Google/invitado destacados, correo accesible y autenticación original conservada.
- [x] Banner personal conserva prioridad.
- [x] Validación final: assembleDebug y 6 StudyGoalTest correctos (43 s). Sin STRING_TOO_LARGE en log final. Inspección de distintivos y render vector UNMSM completada; no equivale a validar UI Android.
- [ ] Revisión visual/física de portada y teclado en dispositivo (agente no ejecuta Android).


## Aviso legal al continuar
- [x] Modal automático retirado de RastroApp; enlaces legales conservados.
- [x] Aviso contextual en Google/invitado y formulario de correo; checkbox de registro duplicado retirado.
- [x] Registro local solo al completar acceso o continuar como invitado; UMP sin cambios.
- [x] assembleDebug correcto (50 s); build/terms-access-validation.log. Sin ejecución Android.


## Fondo exclusivo de Loki
- [x] Condición de fondo claro de Loki retirada del render compartido; tarjetas sin cambios.
- [x] assembleDebug correcto (27 s), build/loki-transparent-validation.log. App no ejecutada.


## Referencia visual aprobada aplicada
- [x] Solo Loki en bienvenida, sin rayitas/estrellas decorativas; logo original conservado.
- [x] Panel superior y navegación inferior conservados; no se editaron LiquidNavbar ni callbacks del header.
- [x] Home reordenado con acción principal, meta+examen y racha real compacta.
- [x] Herramientas complementarias y accesos a Obras/Ligas conservados; canal, destacados y feedback presentes.
- [x] Sin fechas, calificaciones, XP ni avances inventados desde la maqueta.
- [x] Tests de límites de semana en America/Lima añadidos.
- [x] assembleDebug y 11 pruebas correctas (6 StudyGoal + 3 HomeTools + 2 HomeWeekDates); build/home-approved-layout-complete.log. Diff revisado sin errores de espacios.
- [ ] Aceptación visual/física en teléfono; no se ejecuta Android por instrucción del repositorio.


Validación final 01/11/2026: assembleDebug y 190 pruebas Android correctas, cero fallos/errores (build/academic-review-complete.log). Física 1.1 cargada desde los archivos de producción con JsonContentLoader: CatalogValidator cero errores/cero advertencias y AcademicSanitizer sin contaminación. Motor aislado en navegador a 360 px: prosa y ocho expresiones inline, énfasis, claro/oscuro/letra grande y sin recursos externos; screenshot academic-theory-inline.png. No se ejecutó Android ni se publicó una versión.

## 03/11/2026 — Modalidad UNSA opcional

- [x] StudyGoal conserva compatibilidad y permite elegir modalidad UNSA opcional. Las demás universidades y el área automática por carrera conservan su comportamiento. No se añadieron ponderaciones académicas no verificadas.
- [x] assembleDebug y 512 pruebas correctas (315 Android + 197 shared), sin fallos/errores/omitidas: `build/material-delivery-validation.log`.
- [ ] Prueba física Android pendiente; no hay dispositivo conectado.

Ver `docs/material/INFORME_2026-11-03.md` para alcance y límites.
