# Checklist — UI global de Aprender

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
