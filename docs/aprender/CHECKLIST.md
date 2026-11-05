# Checklist — UI global de Aprender

04/11/2026: Lenguaje 3.1 y 3.2, veinte preguntas y dos teorías corregidas. Dos árboles de ejemplos y seis tablas. Identidad, claves y complemento del 3.1 conservados; fixtures equivalentes. assembleDebug y 636 pruebas correctas. Sin errores críticos del validador; una advertencia previa de cantidad por nivel. Revisión visual pendiente. Informes: lenguaje/FONOLOGIA_2026-11-04.md y lenguaje/SECUENCIAS_VOCALICAS_2026-11-04.md. Siete niveles de Lenguaje con revisión textual/técnica documentada; los otros doce siguen pendientes.

04/11/2026: Lenguaje 2.2, doce preguntas y teoría revisadas, árbol de familias y tres tablas. Identidad y claves numéricas conservadas; fixtures equivalentes. assembleDebug y 628 pruebas correctas. Validador sin errores ni advertencias, sanitizador sin contaminación ajena. Revisión visual pendiente. Ver lenguaje/REALIDAD_LINGUISTICA_2026-11-04.md. Registro por nivel actualizado para las cinco revisiones documentadas de Lenguaje; no se marcan los otros catorce niveles.

04/11/2026: Lenguaje 1.3 y 2.1, veintidós preguntas y dos teorías revisadas. Dos mapas y seis tablas. Conservados identidad, títulos, claves y complemento del 2.1; fixtures equivalentes. assembleDebug y 624 pruebas correctas. Validador sin errores críticos; advertencia previa de cantidad solo en 2.1. Revisión visual pendiente. Informes en lenguaje/FUNCIONES_LENGUAJE_2026-11-04.md y lenguaje/VARIACION_LINGUISTICA_2026-11-04.md.

Inventario de presencia en los 418 niveles: estado/INVENTARIO_PRESENTACION.md y CSV asociado. Distingue bloques de teoría y vínculos del catálogo de recursos de los gráficos nativos; no acredita cobertura académica ni renderizado.

04/11/2026: Lenguaje 1.2 revisado: diez preguntas, teoría y metadatos pedagógicos. Corregida clasificación del texto braille y delimitados los intercambios. Un mapa y dos tablas. Identidad y claves numéricas conservadas; fixtures equivalentes. assembleDebug y 616 pruebas correctas. Cero errores críticos y una advertencia previa de cantidad. Revisión visual pendiente. Ver lenguaje/TIPOLOGIA_COMUNICACION_2026-11-04.md.

04/11/2026: Lenguaje 1.1 revisado: diez preguntas, teoría y conceptos internos. Un mapa y tres tablas, sin cambios de pantallas. Identidad y claves conservadas; tres fixtures equivalentes. assembleDebug y 612 pruebas correctas. Cero errores críticos y una advertencia previa de cantidad. Revisión visual pendiente. Ver lenguaje/CIRCUITO_COMUNICATIVO_2026-11-04.md.

04/11/2026: revisión académica de RV 1.2, diez preguntas y teoría. Identidad, claves y mapa conservados; fixtures equivalentes. assembleDebug y 608 pruebas correctas. Auditoría estructural: veinte materias, 418 niveles, 4554 preguntas, cero alertas; esto no certifica precisión académica global. Revisión visual pendiente. Detalle en raz_verbal/RELACIONES_SEMANTICAS_2026-11-04.md.

01/11/2026: presentación matemática y siete gráficos en diez lecciones de Física. Alcance, arquitectura y pruebas en ../formulas/. Catálogos, preguntas, progreso y rutas conservados. Suite Android y assembleDebug correctos; revisión física pendiente.

## 04/10/2026 — Revisión documental del temario

- [x] PDF RCU 0028-2026 revisado: 45 páginas, siete ejes y veinte componentes.
- [x] Creado `TEMARIO 2027 UNSA ADMISION.md` en la raíz con temas/subtemas, páginas y comparación por materia.
- [x] Hashes de TEMARIO_OFICIAL_UNSA.md y MATRIZ_2027_Y_REFERENCIAS.md conservados; sin cambios de código o catálogos en esta revisión.
- [ ] Auditar cobertura de las lecciones contra el nuevo MD: no solicitado en esta intervención.

- [x] Proyecto Android/KMP confirmado; ámbito separado de contenido académico.
- [x] Personajes y recompensas llaman al código real del Laboratorio Loki.
- [x] No PNG/GIF, tint ni rig alternativo para personajes.
- [x] Recursos JSON/MP3 reales inventariados en LOGO.
- [x] Selección estable por aparición; 03/10: sorteo uniforme entre los tres, sin preferencia por Loki.
- [x] Lectura acortada 1,7 s; prueba de lanzamiento anterior a explosión.
- [x] Sonido de explosión ligado al estado visual nativo, una sola vez.
- [x] Cofre con popup, XP real, partículas y salida; recompensa existente idempotente.
- [x] Trofeo separado de lección superada, condicionado a completar todo el tema.
- [x] Contenedores de respuesta y botones: contraste >=4,5:1 en los temas disponibles.
- [x] Flashcards con tamaño natural por cara, scroll y controles conservados.
- [x] Semanal: siete bolitas sin R-MINI, por última instrucción del usuario.
  R-MEDIO principal animado; mensual: número seguido de R-MINI animado.
- [x] Compilación Kotlin Android y pruebas de integración/políticas ejecutadas.
- [x] Regresión del Laboratorio: 62 pruebas; políticas/recompensas/piloto: 15 pruebas, sin fallos.
- [x] 03/10: recorrido real desde Comenzar lección hasta la primera pregunta sin cierre.
- [x] Obras en teléfono: Cálido/Oscuro, textos largos y fuente ampliada a 17 sp.
- [x] Seguir alineado; toque en las bolitas semanales abre el calendario mensual.
- [ ] Matriz completa de tamaños de teléfono/tablet, fuentes y todas las obras.

Detalles y alcance: [ANIMACIONES_Y_FEEDBACK.md](ANIMACIONES_Y_FEEDBACK.md).

## 03/10 — HUD, entrega y emociones

- [x] HUD fijo, ligas y recibos de XP integrados y compilados.
- [x] Simulacro usa el saldo compartido con historial de cobros persistido.
- [x] Resultados (política actual): tres estrellas Feliz/Enamorado; dos explosión; cero/una Triste/Enojado. Fénix noqueado y estrellas ampliadas.
- [x] Explicación de ancho completo y morada; envío real de reporte con error visible.
- [ ] Comprobación visual y envío a Firestore en dispositivo (app no ejecutada en esta intervención).

Ver [documentación de UI principal](../ui-principal/README.md).

## 03/10 — Ejercicios genéricos y variedad Classic

- [x] Relacionar: parejas por ID, colores distintos, bloqueo inmediato de extremos correctos y mezcla estable de la columna derecha.
- [x] Completar teoría: varios espacios, opciones integradas en texto y cambios antes de comprobar; formato anterior compatible.
- [x] Ambos tipos conectados al mismo Lesson Engine, vidas, Fénix, XP y progreso. Un reto fallado consume el coste existente una vez, no por pareja.
- [x] Validación local de datos en mapper/catálogo; pruebas de esquemas, interacción, JSON y compatibilidad.
- [x] Sin preguntas académicas añadidas ni cambios de geometría Classic.
- [x] Sorteo sin personaje fijo, máximo dos repeticiones consecutivas; excepción de explosión confirmada.
- [x] Compilación Kotlin Android y 47 pruebas JVM relevantes pasan; piloto con cero errores/advertencias y prueba de contaminación negativa.
- [x] Guía junto a SKILLS: [APRENDER_EJERCICIOS_PARA_IA.md](../../APRENDER_EJERCICIOS_PARA_IA.md).
- [ ] Verificación visual interactiva de estos ejercicios en claro/oscuro/AMOLED y distintos tamaños. App no ejecutada ni APK generado en esta intervención.

## 03/10 — Acabado y variedad del camino
- [x] 114 pares SVG/VectorDrawable locales parseados; todas las claves del resolver existen.
- [x] Asignación por tema/materia estable, estados independientes y no repetición adyacente compatible probados.
- [x] Kotlin Android compila; resolver, vidas y CatalogPilotValidationTest pasan.
- [x] Vidas muestra la configuración real sin modificar recuperación.
- [ ] Comprobación visual teléfono/tablet y escalado de fuente en dispositivos (app no ejecutada).

## 03/10 — Corrección puntual
- [x] HUD distribuye ancho desde texto medido y escala de fuente; Truquitos no se envuelve.
- [x] Cabecera compactada sin altura rígida ni contador duplicado.
- [x] Semana 10 real con iconos relacionados; gametogénesis circle-dot, nunca pez.
- [x] Siete pruebas semánticas y cuatro de piloto pasan; Kotlin compila.
- [ ] Confirmación visual en móvil estrecho/normal/grande y tablet (sin ejecutar app).

## 03/10 — Compactación móvil
- [x] Los cuatro indicadores comparten altura y tipografía con lineHeight explícito; la barra XP no cambia altura.
- [x] Compilación Kotlin correcta y cuatro pruebas de piloto pasan.
- [ ] Comprobación visual física móvil/tablet y fuente ampliada (app no ejecutada).

## 03/10 — Banners locales
- [x] 20 materias con ID estable y PNG real; SHA-256 idéntico entre fuente y merge de assets.
- [x] Fuente única registrada en Gradle; sin copia manual ni modificación de imágenes.
- [x] Solo se retiraron mascotas superpuestas del banner grande; controles/datos conservados.
- [x] mergeDebugAssets y compileDebugKotlin correctos.
- [ ] Revisión física de recorte/legibilidad en móvil y tablet (app no ejecutada).

## 03/10 — Contraste localizado de banners
- [x] Overlay entre PNG y contenido, adaptativo a imagen/tema y recorte Crop + CenterEnd; transición horizontal hacia personajes y vertical hacia controles.
- [x] Sin cambio de imágenes, tamaño, distribución, datos, callbacks ni mascotas.
- [x] Barra exclusiva del banner con track independiente del PNG, progreso derivado del tema y borde perceptible; CourseProgressBar de otras secciones intacto.
- [x] Fichas/Temas/Guía conservan transparencia, dimensiones y acciones; superficie oscura tintada, borde e icono/texto claros.
- [x] Pruebas sobre 20 PNG reales en claro/oscuro, incluidos Raz. Lógico, Raz. Matemático (el más luminoso por promedio muestreado) y Física (el más oscuro).
- [x] Textos de controles comprobados >=4.5:1 y progreso/track >=3:1 en los once temas, con fondos extremos claros/oscuros/coloridos.
- [x] Kotlin Android y seis pruebas JVM correctas: dos CourseBannerContrastTest y cuatro CatalogPilotValidationTest.
- [ ] Comprobación física/renderizada tras el cambio: app no ejecutada.

## 03/10 — Adaptación de ventana compartida
- [x] Viewport común: Aprender conserva camino/lista con ancho máximo 640 dp y paddings existentes.
- [x] Selectores, tema, nodos y tarjetas reciben el ancho acotado; banner con mínimo automático <=180 dp, manteniendo altura natural del contenido.
- [x] Compilación/pruebas de política y regresión de contraste correctas.
- [ ] Revisión física en teléfono/foldable/tablet: pendiente, app no ejecutada.
- [x] Banner centrado hasta 520 dp mediante el mismo límite hero de Home, conservando proporción y altura natural necesaria.

## 03/10 — HUD durante lecciones
- [x] RastroApp muestra el HUD solo en Aprender y AprenderSubject; LessonEngine no lo muestra.
- [x] Se conservan recompensas, saldos y progresión; Kotlin Android y cuatro tests del piloto pasan.
- [ ] Comprobación visual física (app no ejecutada).

## 03/10 — Flechas y háptica
- [x] Callback vigente en CircleButton sin parches por materia.
- [x] Tick compartido en Matching/FillTheory y pulsos correct/error suaves.
- [x] Kotlin y regresión del handler/catalogo pasan.
- [ ] Recorrer todas las materias ida/vuelta y sentir vibración en dispositivo.

## 03/10 — Banco de errores
- [x] Fallo MC real enviado al banco privado sin tocar evaluación/contenido.
- [x] Kotlin compila y CatalogPilotValidationTest pasa.
- [ ] Captura y persistencia verificadas físicamente; Relacionar/Completar teoría no incorporados a este formato de alternativas.

## 03/10 — Combo de respuestas
- [x] Contador 0..5, hitos 2..5, fallo/rearme y deduplicación comprobados por pruebas.
- [x] Saver conserva contador e intentos; el placeholder Classic se resuelve fuera del modelo.
- [x] Compilación Kotlin y 10 pruebas de combo/UI/piloto pasan.
- [x] Evaluación, vidas y recompensas conservadas; integración revisada.
- [ ] Validación visual y de ciclo de vida en dispositivo (no ejecutar según AGENTS.md).

## 04/10
- [x] 10 monedas por estrella, primer premio único; cero balance inventado para progreso antiguo.
- [x] Saldo único en gamificación, local/Firestore y HUD; earnedCoins por lección.
- [x] LessonCoinsTest 3 + CatalogPilotValidationTest 4 sin fallos.
- [x] Resultado final usa espacio disponible sin scroll y conserva personajes Classic.
- [ ] Verificación física de resultado móvil/horizontal/tablet y tamaño de fuente (no app ejecutada).

## 04/10 — Recompensas y matriz UNSA
- [x] Implementación, compilación y 25 pruebas correctas; rewards-matrix-final.log.
- [x] Diff check sin errores; contenido académico y personajes intactos.
- [ ] Recorrido físico/sincronización real: app no ejecutada por AGENTS.md.
Detalle vigente: [RECOMPENSAS_MONEDAS_EXP.md](RECOMPENSAS_MONEDAS_EXP.md). Sustituye políticas anteriores incompatibles.

## 04/10 — EXP y actividades especiales
- [x] Curva creciente única para niveles/ligas y HUD; saldos intactos.
- [x] Completar/Relacionar derivados del propio nivel y repartidos; actividades explícitas conservadas.
- [x] Exclusión de cálculo, sanitizador académico e idempotencia cubiertos por pruebas.
- [x] Banner ligeramente más visible, contorno fino y semántica única del texto.
- [ ] Revisión física/pedagógica por usuario; app no ejecutada.
Detalle: ACTIVIDADES_ESPECIALES_Y_PROGRESION.md.

Validación final: Kotlin Android y 25 pruebas aprobadas (home-progression-special-final.log). Piloto preparado: CatalogValidator 0 errores/0 advertencias. Cobertura: 315 niveles con cuatro actividades; sanitizador sin contaminación en actividades derivadas. Revisión visual/táctil pendiente sin ejecutar app.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.

## 04/10 — Confirmación física del propietario

- [x] GP-01: «ya no se cierra la app en los niveles». Cerrado el crash de Completar; otros recorridos físicos y aceptación académica siguen pendientes. El agente no ejecutó la app.


## Intervención del 04/10/2026 — resultados, relaciones y nivel actual
- [x] XP y monedas en contenedores independientes; conteo desde cero con la línea de tiempo existente, sin aumentar la altura del resultado compacto.
- [x] Relaciones preparadas con 4–6 pares; asociaciones tomadas únicamente de la lección y su teoría. Prueba de todos los catálogos reales y aislamiento académico correcta.
- [x] Rojo reservado al error en los pares; contenedores pequeños y enlaces correctos con colores distintos del rojo.
- [x] Play temporal depende del nivel actual incompleto del progreso; conserva el SVG de cada nivel.
- [x] Compilación Kotlin y tests: 107 Android + 185 shared, cero fallos, `build/request-improvements-verified.log`.
- [ ] Comprobar presentación y conteo en pantallas físicas pequeñas/grandes; no se ejecutó la app.


## 04/10/2026 — conteo y vibración del resultado
- [x] Aciertos → XP → monedas: intervalos sin solapamiento, iniciando en cero; valores reales y altura sin cambios.
- [x] Cinco marcas táctiles suaves por contador con valor positivo; una marca mayor por estrella ganada, sincronizada con la animación existente.
- [x] Respeta vibrations_enabled; no vibra en segundo plano ni reproduce impactos anteriores al restaurar/saltar la línea de tiempo.
- [x] compileDebugKotlin + 110 pruebas Android correctas; tres pruebas nuevas de secuencia/estrellas/restauración. Log build/lesson-result-haptics-validation.log.
- [ ] Ajuste de sensación táctil en dispositivos físicos: intensidad efectiva depende del motor de cada teléfono. App no ejecutada.


## 04/10/2026 — resultado a 1,3× y estilo de score
- [x] Reloj del resultado compacto a 1,3×; estrellas, conteos e impactos hápticos mantienen sincronía y secuencia.
- [x] Tipografía Lilita One existente, peso Black, para etiquetas y valores; tamaño de fuente y padding originales.
- [x] Contenedores mismos radio, bisel, dimensiones y separación: superficie del tema, trazo 2,5 dp interior y bisel tintado.
- [x] compileDebugKotlin + 112 tests Android correctos; build/lesson-result-style-speed-validation.log.
- [ ] Verificación visual/táctil en dispositivo; app no ejecutada.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro duplica XP/monedas de estudio y evita consumir vidas, sin alterar estrellas o racha. Máximo inicial 15 y regeneración 30 min; comprar vidas desde Monedas. Eliminada recarga al terminar lección; entrada bloqueada solo a cero y sin Pro, no interrupción del nivel en curso.
Detalle y estado real: docs/monetizacion/README.md.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## 08/10/2026 — local y consumo

Estado y validación específica en ../sincronizacion/CHECKLIST.md. Prueba física y ahorro real pendientes; no confundir compilación con validación entre dispositivos.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

- [x] Implementación existente reutilizada; cambios limitados al ámbito visual y accesos solicitados.
- [x] Pruebas Android (153, cero fallos) y lintVitalRelease.
- [ ] Revisión visual en teléfono/tablet, modo claro/oscuro y fuentes grandes: app no ejecutada.


## 08/10/2026 — Refinamiento solicitado

- [x] Cambios implementados y compilación de Kotlin incluida en tests.
- [x] 155 tests Android; cero fallos/errores. Vectores XML válidos.
- [ ] Revisión física en temas claro/oscuro, pantallas pequeñas y gestos: no se ejecutó la app.
- [x] lintVitalRelease y compilar_app.bat (assembleDebug) correctos. App no instalada ni ejecutada.

01/11/2026: muestreo de 60 niveles/20 materias y búsqueda estructural de rellenos. Ver AUDITORIA_MUESTRA_2026-11-01.md. Física 1.1 corregida con fuentes, mismos diez IDs más c11, y fixtures equivalentes. Validador: cero errores/cero advertencias; sanitizador sin contaminación. Presentación matemática extendida a prosa y otras superficies académicas. Los problemas del resto del banco no se declaran resueltos.

Validación final 01/11/2026: assembleDebug y 190 pruebas Android correctas, cero fallos/errores (build/academic-review-complete.log). Física 1.1 cargada desde los archivos de producción con JsonContentLoader: CatalogValidator cero errores/cero advertencias y AcademicSanitizer sin contaminación. Motor aislado en navegador a 360 px: prosa y ocho expresiones inline, énfasis, claro/oscuro/letra grande y sin recursos externos; screenshot academic-theory-inline.png. No se ejecutó Android ni se publicó una versión.

- [x] 01/11/2026: assembleDebug y 198 pruebas Android correctas, cero fallos/errores (build/academic-presentation-final.log). Probada conservación de símbolos científicos y explicaciones, normalización de rótulos y rechazo de tablas incompletas. La suite incluye validación local de Física 1.1 con CatalogValidator/AcademicSanitizer.
- [ ] Inspección visual en teléfono de estas nuevas tarjetas y tablas: pendiente; no se ejecutó Android. Esto no certifica todo el banco académico.

- [x] Formato enriquecido de teoría: énfasis explícito y definiciones con paletas claro/oscuro, fórmulas preservadas, colores de preguntas sin cambios. assembleDebug y 200 tests correctos; motor aislado inspeccionado a 360 px.
- [ ] Revisión física de las nuevas paletas en teléfono y temas personalizados; Android no ejecutado.

- [x] 01/11/2026: assembleDebug y 205 pruebas Android correctas, cero fallos/errores (build/learning-playback-final.log). Integridad de explicaciones comprobada en una muestra de cada materia con recursos; geometría comprobada contra secciones reales de 3.1 y 7.1; sin fallback a otras materias ni a polígonos genéricos. Suite mantiene CatalogValidator sin errores/advertencias y sanitizador sin contaminación en el piloto de Física 1.1.
- [ ] Comprobar dibujos Canvas, controles, reproducción, pausa en segundo plano, scroll y accesibilidad en teléfono. No se ejecutó Android.

- [x] 01/11/2026: assembleDebug y 205 pruebas Android sin fallos/errores (build/lesson-streak-layout.log). Cambios limitados a presentación de lección, visibilidad de barra inferior y distribución de racha; lógica de actividad intacta.
- [ ] Verificar en teléfono: opciones accesibles tras feedback, regreso de navbar al salir, racha completa en meses de seis filas y letra ampliada. No se ejecutó Android.

- [x] 01/11/2026: assembleDebug y 209 pruebas Android correctas, cero fallos/errores (build/academic-block01-final.log). Los tres niveles revisados pasan CatalogValidator con cero errores/cero advertencias y sanitizador sin contaminación. 64 fragmentos matemáticos aceptados por KaTeX; tres fixtures idénticos a producción. Giro opcional cargado desde preguntas, compatible con recursos antiguos. Regresión para numeración de pasos corregida.
- [ ] Validación física de las 33 preguntas y siete giros; Android no ejecutado. El resto de la revisión académica sigue pendiente.

- [x] Bloque 02: assembleDebug y 214 pruebas Android sin fallos/errores (build/academic-block02-final.log). Álgebra 1.1/1.2 pasa CatalogValidator con cero errores/advertencias y sanitizador sin contaminación. Revisión estructural de todas las preguntas MC: sin alternativas textualmente duplicadas, IDs repetidos por nivel ni índices fuera de rango. 124 fragmentos matemáticos del bloque aceptados por KaTeX. Catorce fixtures coinciden con producción.
- [ ] Verificar el Venn, los controles y las preguntas en teléfono; Android no ejecutado.
- [ ] Cerrar las 1.453 alertas ampliadas y revisar académicamente los demás ejercicios; no se marca el banco como terminado.

- [x] Bloque 03: assembleDebug y 219 pruebas Android correctas (build/academic-block03-validation.log), cero fallos/errores. Seis niveles pasan CatalogValidator sin errores/advertencias y sanitizador sin contaminación. Motor local: 96 fragmentos y bloque completo de casos de Aritmética aceptados; nueve fuentes/fixtures equivalentes. Regresión global de índices, IDs y alternativas sin fallos.
- [ ] Revisión física de preguntas, controles y gráfico de densidad. Android no ejecutado ni publicado.
- [ ] Revisar las 1.419 preguntas con alertas ampliadas restantes y el contenido aún no validado académicamente.

- [x] Claridad: assembleDebug y 227 pruebas Android correctas, cero fallos/errores (build/theory-clarity-final.log). Pruebas sobre todos los recursos: 112 esquemas gráficos, incluidos los 111 Mermaid, cero Mermaid sin soporte actual; 202 bloques ASCII/código conservados, no todos vectorizados. Paréntesis y matrices preservados; metadata administrativa filtrada sin borrar problemas legítimos. Teoría/fixtures de Física 1.1/1.2 equivalentes; preguntas sin cambios y piloto 1.1 conserva validador/sanitizador correctos.
- [x] Notación de vectores inspeccionada en motor aislado a 360 px: cinco expresiones, cero fallbacks/errores JS/peticiones externas; prosa «en +x» legible. Muestra build/vector-clarity-preview.png.
- [ ] Inspección física de mapas, tipos de letra, TalkBack, temas y notación. Android no ejecutado ni publicado. Física 1.2 no se declara completamente validada: sus preguntas siguen pendientes.

- [x] Validación final 02/11/2026: assembleDebug correcto (build/algebra-practice-final.log) y 229 pruebas Android, cero fallos/errores/omitidas. Suite repetida expresamente tras los últimos cambios de recursos (build/algebra-practice-tests-rerun.log). Los 30 niveles pasan CatalogValidator con cero errores/advertencias y AcademicSanitizer sin contaminación. No se ejecutó Android ni se publicó una versión.

- [x] 02/11/2026: assembleDebug correcto y 233 pruebas Android repetidas, cero fallos, errores u omitidas (build/physics-practice-final.log). Los 24 niveles de Física cargan con once preguntas y pasan CatalogValidator sin errores/advertencias; sanitizador sin contaminación. Los 21 niveles nuevos tienen tres pasos por resolución y fixtures equivalentes.
- [x] Motor aislado: 1.240 fragmentos matemáticos aceptados; 63 vistas (21 niveles en claro, oscuro y letra grande) a 360 px, sin errores, fallbacks ni desbordamiento del documento.
- [ ] Revisión física en teléfono y revisión completa de la teoría. No se ejecutó Android.

- [x] 02/11/2026: assembleDebug correcto y 236 pruebas Android repetidas, cero fallos, errores u omitidas (build/trigonometry-practice-final.log). Los 24 niveles de Trigonometría cargan con once preguntas y pasan CatalogValidator con cero errores/advertencias; sanitizador sin contaminación.
- [x] 23 fuentes y fixtures equivalentes, 230 IDs anteriores conservados y 23 c11 añadidos. Enunciados independientes y al menos tres segmentos de resolución.
- [x] Motor aislado: 1.514 fragmentos matemáticos aceptados; 69 vistas en claro, oscuro y letra grande a 360 px, cero errores, fallbacks o desbordamiento del documento. Las fórmulas largas conservan scroll horizontal interno.
- [ ] Revisión física en teléfono, teoría completa y gráficos individuales; Android no ejecutado ni publicado.

- [x] 02/11/2026: assembleDebug y 239 pruebas Android repetidas correctas, cero fallos, errores u omitidas (build/geometry-practice-final.log). Los 22 niveles de Geometría cargan con once preguntas y pasan CatalogValidator sin errores/advertencias; sanitizador sin contaminación. Los 20 bancos nuevos tienen fixtures equivalentes y tres partes por resolución.
- [x] 1.149 fragmentos matemáticos, 60 vistas de los 20 niveles en claro/oscuro/letra grande a 360 px, cero errores o fallbacks. Los conteos usan enteros y se conservan unidades de área/volumen.
- [ ] Revisión completa de teoría, dificultad avanzada y gráficos individuales; comprobación física en teléfono. Android no ejecutado ni publicado.

- [x] 02/11/2026: assembleDebug y 242 pruebas Android repetidas correctas, cero fallos, errores u omitidas (build/arithmetic-practice-final.log). Los 26 niveles de Aritmética cargan con once preguntas y pasan CatalogValidator sin errores/advertencias; sanitizador sin contaminación. Los 24 bancos nuevos tienen fixtures equivalentes, IDs conservados y tres segmentos de resolución.
- [x] 1.410 fragmentos matemáticos y 72 vistas de los 24 niveles en claro/oscuro/letra grande a 360 px, cero errores o fallbacks. Fracciones exactas, convenciones estadísticas y probabilidades verificadas.
- [ ] Teoría completa, profundidad avanzada y gráficos individuales; prueba física en teléfono. Android no ejecutado ni publicado.

- [x] 02/11/2026: Química, 334 preguntas en 30 bancos pendientes; 245 pruebas repetidas y assembleDebug correctos. Los 32 niveles pasan CatalogValidator 0/0 y sanitizador, fixtures equivalentes. Render aislado: 1.164 fragmentos, 90 vistas sin fallbacks.
- [ ] Auditoría global: 220 preguntas con alertas en los razonamientos; la ausencia de alertas no valida toda la teoría ni las demás materias. Android no ejecutado.

## Cierre técnico del 02/11/2026

- [x] 4.538 preguntas de 418 niveles cargadas mediante el loader real, IDs íntegros, sin errores de catálogo. Persisten 164 advertencias por cantidad, documentadas sin ocultarlas.
- [x] Auditoría ampliada: plantillas inglesas y relaciones genéricas detectables; cero coincidencias actuales. No certifica todas las claves.
- [x] Lotes de Química, ambos razonamientos, Inglés y once reparaciones de Biología documentados; fuentes y fixtures equivalentes.
- [x] 130 mapas gráficos (18 nuevos), 184 bloques de texto conservados; ninguno de los Mermaid actuales queda sin soporte.
- [x] AssembleDebug, 260 pruebas de androidApp y 192 de shared sin fallos, errores ni omitidas. Log: build/academic-maps-final-validation.log.
- [ ] Revisión académica integral, 164 advertencias por cantidad, teoría restante, gráficos propios por ejercicio y teléfono. Android no ejecutado ni publicado.

Detalle: REVISION_PRACTICA_TOTAL_2026-11-02.md y MAPAS_REVISADOS_2026-11-02.md. Los conteos anteriores son instantáneas históricas.

## Comprensión Lectora — cierre posterior

- [x] 16 bancos, 176 preguntas con pasaje original y evidencia; 160 IDs conservados y 16 añadidos. Fixtures equivalentes; CatalogValidator 0/0 y sanitizador sin contaminación.
- [x] Citas completas en el reproductor, con regresiones de comillas anidadas y conservación de todo el texto.
- [x] AssembleDebug, 263 pruebas androidApp y 192 shared sin fallos, errores u omitidas (build/reading-practice-final-validation.log).
- [ ] Banco global actual: 4.554 preguntas, 418 niveles, sin errores de catálogo; 148 advertencias por cantidad en otras materias. Revisión académica integral y teléfono pendientes.

Los 130 mapas y sus 184 bloques conservados no cambian durante el lote de lectura. Ver comprension_lectora/REVISION_PRACTICA_PENDIENTE.md.

- [x] 02/11/2026: cinco esquemas de Química convertidos/revisados con 86 nodos; preguntas intactas. Cobertura real: 134 mapas, 180 bloques de texto conservados y ningún Mermaid sin soporte. AssembleDebug y 462 pruebas correctas. Ver docs/aprender/quimica/MAPAS_REVISADOS_2026-11-02.md.
- [ ] Revisión física y gráficos propios en los temas todavía pendientes.

02/11/2026, continuación de Química 6.1–8.1: tres mapas, 61 conceptos y tres tablas; preguntas intactas. Cobertura actual: 137 mapas, 177 bloques conservados y ningún Mermaid sin soporte. assembleDebug y 463 pruebas repetidas correctas (266 Android y 197 shared), sin fallos, errores u omitidas. Log: build/chemistry-maps-continuation-validation.log. Ver docs/aprender/quimica/MAPAS_6_A_8_2026-11-02.md. La revisión completa de teoría y la comprobación en teléfono siguen pendientes.

- [x] Mapas de Química 9.1–15.1 y cinco tablas comprobados; preguntas intactas. Quedan 144 mapas globales y 170 bloques conservados. Corrección de subíndices con regresión en 4.554 preguntas y 465 pruebas correctas. Ver docs/aprender/quimica/MAPAS_9_A_15_2026-11-02.md.

02/11/2026: Razonamiento Verbal, 26 mapas con 274 conceptos, cuatro tablas y tres procedimientos duplicados sustituidos por referencias. Preguntas intactas y fixtures equivalentes; correcciones gramaticales puntuales documentadas en docs/aprender/raz_verbal/MAPAS_Y_CLARIDAD_2026-11-02.md. Cobertura actual: 170 mapas y 141 bloques conservados, ninguno Mermaid sin soporte. assembleDebug y 468 pruebas repetidas correctas (271 Android y 197 shared), sin fallos, errores u omitidas. Log: build/verbal-maps-validation.log. Revisión completa y teléfono pendientes.

02/11/2026: Comprensión Lectora, 22 mapas con 256 nodos y seis tablas; preguntas intactas. Cobertura global actual: 192 mapas y 118 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 471 pruebas repetidas correctas (274 Android y 197 shared), sin fallos, errores u omitidas. Log: build/reading-maps-validation.log. Detalle: docs/aprender/comprension_lectora/MAPAS_Y_CLARIDAD_2026-11-02.md. La teoría completa y el teléfono siguen pendientes.

03/11/2026: Filosofía, semanas 02–05, ocho mapas con 152 nodos y cuatro tablas; preguntas intactas. Cobertura global: 200 mapas y 110 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 474 pruebas repetidas correctas (277 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-02-05-validation.log. Ver docs/aprender/filosofia/MAPAS_02_A_05_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Filosofía 06–08, cuatro mapas con 68 nodos y cuatro tablas; seis bancos intactos. Cobertura global: 204 mapas y 104 bloques conservados, ninguno Mermaid sin soporte. assembleDebug y 477 pruebas repetidas correctas (280 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-06-08-validation.log. Detalle: docs/aprender/filosofia/MAPAS_06_A_08_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Filosofía 09–13, diez mapas y cinco tablas; 174 nodos y diez bancos intactos. Cobertura global actual: 214 mapas y 94 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 480 pruebas repetidas correctas (283 Android y 197 shared), sin fallos, errores u omitidas. Log: build/philosophy-maps-09-13-validation.log. Los 24 esquemas de Filosofía identificados en 02–13 ya se adaptaron, pero la teoría completa, preguntas de esta materia y el teléfono siguen pendientes. Ver docs/aprender/filosofia/MAPAS_09_A_13_2026-11-03.md.

03/11/2026: Cívica 01–03, seis mapas con 102 nodos y tres tablas; seis bancos intactos. Cobertura global actual: 220 mapas y 88 bloques conservados, ningún Mermaid sin soporte. assembleDebug y 483 pruebas repetidas correctas (286 Android y 197 shared), sin fallos, errores u omitidas. Log: build/civics-maps-01-03-validation.log. Ver docs/aprender/civica/MAPAS_01_A_03_2026-11-03.md. Revisión normativa integral y teléfono pendientes.

03/11/2026: reparado Inglés 5.1, 5.2 y 6.2: pirámide y tablas partidas reconstruidas, mapa de 17 nodos compatible, aviso adaptable y correcciones de reglas absolutas. Tres bancos intactos por SHA-256. Cobertura global: 220 mapas y 85 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 486 pruebas repetidas correctas (289 Android y 197 shared), cero fallos, errores u omitidas. Log: build/english-theory-layout-validation.log. Detalle: docs/aprender/ingles/TEORIA_05_Y_06_2026-11-03.md. Resto de teoría y teléfono pendientes.

03/11/2026: Geografía 05–06, cuatro teorías revisadas en sus esquemas: dos mapas nuevos con 34 nodos y cuatro tablas. Preguntas intactas por SHA-256 y fixtures equivalentes. Cobertura global: 222 mapas y 81 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 489 pruebas repetidas correctas (292 Android y 197 shared), sin fallos, errores u omitidas. Log: build/geography-maps-05-06-validation.log. Detalle: docs/aprender/geografia/MAPAS_05_Y_06_2026-11-03.md. Resto académico y teléfono pendientes.

03/11/2026: Geografía 07, seis dibujos de ancho fijo sustituidos en dos teorías: cuatro mapas nuevos (68 nodos, 64 conexiones) y cuatro tablas. Bancos intactos por SHA-256 y fixtures equivalentes. Correcciones asociadas a zona fótica, relieve e inundabilidad; resto académico pendiente. Cobertura global: 226 mapas y 75 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 492 pruebas repetidas correctas (295 Android y 197 shared), cero fallos, errores u omitidas. Log: build/geography-maps-07-validation.log. Informe: docs/aprender/geografia/MAPAS_07_2026-11-03.md. Android no ejecutado ni publicado.

03/11/2026: Geografía 08, dos perfiles ASCII sustituidos por dos mapas (34 nodos y 32 conexiones) y dos tablas. Los ocho nodos regionales previos se conservan; Yunga marítima/fluvial diferenciadas y rangos contextualizados. Bancos intactos por SHA-256 y fixtures equivalentes. Cobertura global: 228 mapas y 73 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 495 pruebas repetidas correctas (298 Android y 197 shared), sin fallos, errores u omitidas. Log: build/geography-maps-08-validation.log. Informe: docs/aprender/geografia/MAPAS_08_2026-11-03.md. Resto académico y revisión física pendientes; sin publicación.

- [x] 03/11/2026: acompañantes de teoría corregidos globalmente. Eliminado el fallback de ADN para categorías sin dibujo. Selección por materia y contexto; 22 claves con representación explícita, máximo una por sección y tres distintas por lección, separadas por al menos una sección. Autor y Fundamento no generan imagen por sí solos. Comprobación de las 20 materias y recorrido de las 418 teorías. assembleDebug y 499 pruebas repetidas correctas (302 Android y 197 shared), cero fallos, errores u omitidas. Log: build/academic-companions-validation.log. Informe: docs/formulas/ACOMPANANTES_POR_TEMA_2026-11-03.md. Inspección visual física pendiente; Android no ejecutado ni publicado. Bancos, recursos académicos y progreso sin cambios en este lote.

03/11/2026: Geografía 11–12, cuatro esquemas sustituidos por cuatro mapas (68 nodos, 64 conexiones) y cuatro tablas. Interpretación de pirámides sin diagnósticos automáticos, PET distinta del intervalo demográfico y agricultura comparada sin estereotipos regionales. Cuatro bancos intactos por SHA-256 y fixtures equivalentes. Cobertura global: 232 mapas y 69 bloques conservados; ningún Mermaid sin soporte. assembleDebug y 502 pruebas repetidas correctas (305 Android y 197 shared), cero fallos, errores u omitidas. Log: build/geography-maps-11-12-validation.log. Informe: docs/aprender/geografia/MAPAS_11_Y_12_2026-11-03.md. Revisión integral y teléfono pendientes; sin publicación.

## 03/11/2026 — Material y revisión local

- [x] Material sustituye Guía; consulta las lecciones y preguntas existentes con filtros, índice y lectura continua. Incorpora cuatro SVG y un corazón 3D opcional con licencias por archivo. No modifica contenido académico, respuestas ni gamificación.
- [x] assembleDebug y 512 pruebas correctas (315 Android + 197 shared), sin fallos/errores/omitidas: `build/material-delivery-validation.log`.
- [ ] Prueba física Android pendiente; no hay dispositivo conectado.

Ver `docs/material/INFORME_2026-11-03.md` para alcance y límites.


## 03/11/2026 — Preguntas y pizarra de pantalla completa

Cabecera y progreso únicamente durante las preguntas. Pizarra compartida de preguntas con enunciado integrado en el papel, colores/grosor visibles y conservación acotada por pregunta. No se modifican los bancos, reglas, Firebase ni recompensas. Compilación debug y 543 pruebas unitarias correctas; revisión visual/táctil pendiente, sin ejecutar la app. Detalles y límites en `../preguntas/INFORME_2026-11-03.md`. Esta descripción sustituye la distribución partida inicial en preguntas; Material mantiene su rama de consulta.


## 03/11/2026 — Ajustes de margen inferior, flecha y teoría

La pizarra calcula el margen seguro del diálogo a partir de los insets completos de su ventana, sin descontar los ya consumidos por el Scaffold de la app. Evita que el control de grosor termine bajo la navegación de Android.

La flecha de lectura se integra en el margen lateral de QuestionScrollArea y deja de ser una fila que resta altura al área desplazable. Solo aparece si quedan más de dos píxeles por recorrer; no ocupa altura adicional ni modifica el criterio al aparecer. Se retiraron los dos avisos externos en Aprender y examen activo.

La cabecera general se oculta durante toda la ruta del nivel, incluida la teoría inicial. No cambian preguntas, respuestas, recompensas ni dibujos.

Validación: assembleDebug y 545 pruebas unitarias (348 Android + 197 shared), sin fallos, errores ni omitidas. Dos pruebas nuevas cubren la indicación al caber todo el contenido, el margen de redondeo y el final del recorrido. Log: build/question-insets-scroll-validation.log. No se ejecutó Android; queda pendiente confirmar los márgenes y el resultado visual en el celular del usuario.


## 03/11/2026 — Historia: ilustraciones relacionadas y fotografías ligeras

Cuatro SVG originales, CC0, para cerámica, tejido, templo andino y quipu. Android usa sus equivalentes VectorDrawable, con relleno opaco y contorno. La selección depende del tema, respeta el presupuesto anterior (máximo tres acompañantes distintos por lección, separados entre secciones) y no asigna arquitectura andina a Roma o Egipto. Son símbolos, no reproducciones de piezas arqueológicas.

Se integraron dos fotografías Open Access del Met: botella geométrica Moche (objeto 309442) y vasija de maíz Nasca (316270), cada una de unos 12 KB en WebP. Se verificó el dominio público individual y la política CC0 del museo; las fichas de procedencia están en assets/educational-visuals/licenses. El inventario completo está en ../material/INVENTARIO_HISTORIA_2026-11-03.md. Fotos, SVG y XML nativos suman 31 657 bytes; esa cifra excluye documentación y metadatos.

Las imágenes se colocan después de su sección en Historia del Perú, semana 2, nivel 2.1, usando los títulos reales de Cultura Moche y Cultura Nasca. La misma asociación se utiliza en Material. El campo opcional sectionKeywords conserva el comportamiento de los recursos anteriores. Si un recurso exige una sección inexistente, no se muestra en otra como sustituto. Los identificadores de revisión de imágenes antiguas conservan su huella anterior: el nuevo metadato de ubicación no invalida una revisión sin cambiar la imagen.

Validación: assembleDebug y 551 pruebas (354 Android + 197 shared), sin fallos, errores ni omitidas. Seis pruebas nuevas cubren relevancia, SVG/XML sin recursos externos, licencias individuales, peso, asociación exacta al contenido real, ausencia en modo solo preguntas y estabilidad de la huella. Log build/history-visual-validation.log. Fotografías locales inspeccionadas; SVG/XML validados estructuralmente. No se ejecutó Android; revisión visual/táctil y rendimiento físico pendientes. No se publicaron cambios ni se modificaron bancos, Firebase o recompensas. Esto no constituye cobertura gráfica completa de todas las materias.


03/11/2026: cuatro teorías y diez preguntas revisadas por contexto y coherencia. Compilación y 556 pruebas correctas; dos advertencias preexistentes de cantidad de retos en RV. No equivale a certificación de todo el catálogo. Ver REVISION_CONTEXTO_2026-11-03.md.


03/11/2026: segunda revisión de contexto, treinta preguntas y dos teorías de Razonamiento Verbal. Compilación y 562 pruebas correctas. Cantidades y progreso conservados; advertencias previas de diez retos registradas. Ver raz_verbal/SERIES_Y_ANALOGIAS_2026-11-03.md. La revisión integral sigue pendiente.


03/11/2026: argumentación, veinte preguntas y dos teorías de RV 5.1/5.2 revisadas. Compilación y 568 pruebas correctas; dos advertencias previas de cantidad de retos conservadas. Ver raz_verbal/ARGUMENTACION_2026-11-03.md. La revisión integral y visual sigue pendiente.


03/11/2026: revisión de diez preguntas y teoría de RV 6.1. Contexto, presuposiciones e inferencias corregidos; identidad y mapa conservados. Compilación y 572 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/PRAGMATICA_2026-11-03.md. Revisión integral y visual pendientes.


03/11/2026: diez preguntas y teoría RV 7.1 corregidas, con contexto y precisión léxica. Compilación y 576 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/CLARIDAD_LEXICA_2026-11-03.md. Revisión integral y visual pendientes.


03/11/2026: RV 7.2, diez preguntas y teoría alineadas con los contenidos evaluados. Compilación y 580 pruebas correctas. Cero errores críticos y una advertencia previa de cantidad. Ver raz_verbal/CONCORDANCIA_2026-11-03.md. Revisión integral y visual pendientes.


03/11/2026: RV 8.1, diez preguntas y teoría revisadas por adecuación y sustento de inferencias. Compilación y 584 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/ADECUACION_2026-11-03.md. Revisión integral y visual pendientes.


03/11/2026: RV 8.2, diez preguntas y teoría alineadas por inferencias, cohesión y organización. Compilación y 588 pruebas correctas. Una advertencia previa de cantidad. Ver raz_verbal/INFERENCIAS_Y_COHESION_2026-11-03.md. Revisión integral y visual pendientes.


03/11/2026: RV 6.2, diez preguntas y teoría revisadas por cooperación, implicaturas y actos de habla. Compilación y 592 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/COOPERACION_2026-11-03.md. Revisión integral y visual pendientes.


04/11/2026: RV 4.1, diez preguntas y teoría corregidas por relación, construcción y alcance. Compilación y 596 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/CONECTORES_2026-11-04.md. Revisión integral y visual pendientes.

04/11/2026: RV 4.2, diez preguntas y teoría revisadas por completamiento y orden. Compilación y 600 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/COMPLETAMIENTO_Y_ORDEN_2026-11-04.md. Revisión integral y visual pendientes.

04/11/2026: RV 1.1, diez preguntas y teoría revisadas por matices y relaciones en contexto. Compilación y 604 pruebas correctas; una advertencia previa de cantidad. Ver raz_verbal/PALABRAS_EN_CONTEXTO_2026-11-04.md. Revisión integral y visual pendientes.


04/11/2026 — corrección de presentación:
- [x] Resolución textual completa, sin reproductor artificial.
- [x] Altura completa y cancelación del gesto vertical interno del bloque tabular; recorrido horizontal conservado.
- [x] Confirmación de mapa dibujado y alternativa nativa ante fallo, con ampliación.
- [x] Compilación y 664 pruebas correctas; 246 mapas y 386 tablas comprobados en navegador local.
- [ ] Confirmación de los tres fallos en teléfono. No se lanzó la app.
