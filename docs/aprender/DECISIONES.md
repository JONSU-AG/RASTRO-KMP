# Decisiones — UI global de Aprender

## 04/10/2026 — Fuente documental 2027 separada

`TEMARIO 2027 UNSA ADMISION.md` conserva una versión organizada y compacta del PDF entregado, con referencias por páginas y diferencias respecto al MD anterior. Mantener separadas las enumeraciones oficiales, ampliaciones pedagógicas y marcas de cobertura de la app. No reemplazar silenciosamente TEMARIO_OFICIAL_UNSA.md ni usar esta revisión como certificación de cobertura de los catálogos.

## 02/10/2026

- Reutilizar el código nativo del Laboratorio Loki para personajes, emociones,
  secuencia de explosión, estrellas y tarjetas de score. La aclaración del usuario
  prevalece sobre la interpretación inicial de usar los GIF exportados.
- Empaquetar JSON Lottie y MP3 de LOGO mediante Sync en build; mantener las fuentes
  y copias seguras fuera de modificaciones y no cargar imágenes de personajes.
- Una capa pequeña de resolución/reproducción/audio, sin gestores paralelos de XP,
  progreso o calendario. Reutilizar `GamificationManager` y persistencia existente.
- Acortar solo la lectura mediante mapeo temporal en el adaptador de Aprender;
  no cambiar la geometría ni el clip original del laboratorio.
- Superficies de UI adaptables, personajes con sus colores originales. El renderer
  existente de recompensas recibe tema opcional; sus valores por defecto no cambian.
- Contenido de Geografía, otros catálogos y cambios concurrentes fuera del ámbito.

## 03/10/2026 — Inicio y racha

- Un fallo de audio complementario no debe interrumpir el callback de navegación. SoundPool carga OPCIONES y MediaPlayer prepara los demás sonidos de forma asíncrona, con errores locales registrados.
- Idea nueva → Artyon se aplica solo a la teoría inicial, sin convertirlo en una regla del banner.
- La última instrucción del usuario prevalece: los siete indicadores semanales son bolitas. R-MINI se conserva únicamente en las celdas activas del mensual dentro de este ámbito.
- El título y selector mensual usan wrap natural para evitar competencia por ancho.

## 03/10 — Recompensas y pantallas principales

Sorteo uniforme reemplaza la preferencia por Loki. HUD pertenece al Scaffold y se conserva al hacer scroll; animaciones solo reciben XP efectivamente otorgada. Simulacro comparte saldo y persiste los intentos cobrados. Ver [decisiones de UI principal](../ui-principal/DECISIONES.md) para los umbrales iniciales de ligas y XP ajustable.

## 03/10 — Interacción genérica y resultado Classic

- Reutilizar `MATCH_PAIRS` y `FILL_BLANK` existentes. `ChallengeBlank` y `textTemplate` amplían el modelo sin romper el formato de un hueco anterior. No añadir preguntas ni un motor paralelo.
- Relacionar valida por ID y bloquea inmediatamente las parejas correctas. Conserva los errores del intento para la comprobación final/Fénix; cada actividad sigue contando como un único reto y no otorga XP por pareja.
- Colores distintos por pareja con número y check como señales adicionales; opciones/huecos adaptan superficies y contraste al tema.
- Tres estrellas Feliz/Enamorado; dos explosión completa; cero/una Triste/Enojado. Personajes y emociones se sortean al comenzar la aparición y no cambian por ticks o recomposición.
- Variedad local a la sesión: máximo dos repeticiones cuando existen alternativas. El usuario confirmó que explosión es excepción y debe mantenerse para dos estrellas incluso tres veces seguidas.
- La instrucción posterior de ningún personaje fijo sustituye la regla histórica de Artyon para idea nueva. Usar el mismo rig Classic sin modificar cuerpos/caras.
- Datos inválidos fallan localmente: mapper rechaza estructura corrupta; UI deshabilita comprobar y ofrece el reporte existente. No toma preguntas de otro catálogo.

## 03/10 — Identidad visual de nodos
SVG Lucide adaptados a trazo 2.4 y convertidos a vectores Android locales, sin dependencia runtime. Resolver por título/subtema/materia y hash estable de ID/profundidad; estados no alteran identidad. El dibujo anterior solo desambigua alternativas semánticamente compatibles. Overrides editoriales explícitos por ID fuera del catálogo académico. Cofres conservados. Guía: ../../APRENDER_ACABADO_SVG_PARA_IA.md.

## 03/10 — Corrección local
Medir texto y ancho Compose antes de distribuir HUD; no encoger todas las fuentes. Cabeceras compactas sin altura rígida. Biología resuelve concepto principal del título antes del subtema; fallback neutro, nunca colección de organismos distintos. Repetir un símbolo pertinente es preferible a un dibujo ajeno.

## 03/10 — Densidad móvil
HUD: altura común derivada de dos líneas, nunca apilar icono/dato/etiqueta en tres filas. Definir lineHeight explícito; barra XP superpuesta dentro del espacio reservado. Fuentes grandes pueden aumentar altura uniformemente, sin truncar verticalmente.

## 03/10 — Banners
LOGO/BANNER-CURSOS es la fuente única mediante assets.srcDir; el build empaqueta automáticamente. Mantener nombres originales y CourseBanners por ID. No duplicar PNG manualmente. Decodificación IO sin biblioteca adicional; fallback degradado. Las mascotas embebidas sustituyen solo las dos llamadas ClassicArtwork de este banner.

## 03/10 — Protección de lectura sobre PNG
CourseBannerBackground.kt centraliza bannerContrast/bannerProtection/CourseBannerProgress. Tinta casi negra con matiz del acento activo; opacidad mínima calculada para contraste 4.8:1 del texto blanco sobre el límite conservador de RGB de la zona. Decodificación y escaneo en IO, no en recomposición; se recalcula por materia/tamaño efectivo, siguiendo el recorte Crop + CenterEnd. No se alteran recursos PNG.
Overlay superior mantiene protección hasta 68% del ancho y se desvanece hacia la derecha; máscara vertical conserva la zona superior y reduce la cobertura inferior. Una segunda transición inferior más ligera protege controles sin cubrir toda la imagen uniformemente. Las píldoras incorporan tinta translúcida al 62% y borde blanco al 65%: el texto mantiene contraste incluso sobre blanco puro, independientemente de la imagen.
Barra del banner conserva 6 dp, valor real y ancho existente; track opaco oscuro tintado, progreso del acento ajustado solo cuando requiere contraste >=3:1 frente al track y contorno ligero. No modificar CourseProgressBar usado fuera del banner.

## 03/10 — Ancho del camino
Usar RastroAdaptiveViewport(reader=true) del sistema compartido de UI principal. No separar el camino en columnas ni modificar contenido académico/selección de materias. Máximo 640 dp, nodos/etiquetas mantienen medidas actuales; se recalculan con el ancho real. El mínimo por proporción del banner queda acotado a 180 dp, sin imponer un máximo que recorte texto o controles.
El banner se centra con el límite hero común de 520 dp; ruta/selectores conservan 640 dp. No usar una imagen de 640 dp recortada para forzar la altura de 180 dp: se acota primero su ancho.

## 03/10 — Lección sin indicadores globales
El HUD de EXP/racha/vidas/truquitos queda limitado a Aprender y AprenderSubject. LessonEngine no lo presenta, ni recibe el destino visual del overlay de entrega de XP. Solo cambia la visibilidad; la entrega y persistencia de recompensas no se alteran. No se modifica el contenido ni LessonEngineScreen.

## 03/10 — Navegación y feedback
Las flechas usan callback actualizado sin reiniciar gestos ni alterar el selector existente. El test LiveClickRegressionTest verifica ocho cambios consecutivos conservando handler. Háptica central DuolingoHaptics: selección EFFECT_TICK (fallback 10 ms); éxito 14/18 ms a amplitudes 45/60; error 16/16 ms a amplitud 50. Respeta vibrations_enabled. Matching/Completar teoría usan la misma selección; hardware puede variar, no se afirma intensidad física comprobada.

## 03/10 — Captura para banco de errores
Guardar opción múltiple fallada en el punto real de comprobación, no durante selección. Origen Aprender e ID lesson:challenge evita cruces de retos entre lecciones. Noqueado/redención/progreso mantienen su implementación; marcar repasado en Perfil no cambia XP ni domina automáticamente el nivel.

## 03/10 — Combo aislado
Modelo puro compartido porque el engine actual mantiene el estado de sesión en Compose, sin ViewModel de lección. Solo consume su veredicto, con deduplicación por fase/paso/reto. Guardar contador e intentos, nunca eventos visuales. Resolver MAX_COMBO a Loki Enamorado únicamente en UI, reutilizando ClassicArtwork; efecto temporal y cancelable al avanzar. Sin recompensas nuevas. Detalles y sustitución del placeholder en COMBO.md.

## 04/10 — Monedas y resultado
Un saldo coins en GamificationState existente. Regla explícita del usuario: 10 por estrella de la primera finalización real (0/10/20/30). Mejorar estrellas después no recompensa; acceso skipped puede cobrar su primera finalización. Snapshots antiguos parten de 0, no se inventan monedas retroactivas. earnedCoins en LessonCompletion permite auditar el premio; persistencia local y Firestore existentes.
Resultado conserva personajes/secuencias Classic, sin modificar sus archivos. LessonVictoryView reparte altura disponible y usa fila en horizontal; LearningResultsArtwork compact=true reutiliza estrellas nativas del laboratorio, con contadores animados menores debajo. Sin scroll, sin nuevo sistema XP.

## 04/10 — Recompensas y matriz UNSA
EXP y monedas independientes; replay 20% EXP y 2 monedas/estrella; earnedCoins registra el premio base para migración incremental idempotente.
Detalle vigente: [RECOMPENSAS_MONEDAS_EXP.md](RECOMPENSAS_MONEDAS_EXP.md). Sustituye políticas anteriores incompatibles.

## 04/10 — Curva y práctica local
XpProgression centraliza el costo creciente sin reescribir saldos; LeagueCatalog usa la misma curva. LessonSpecialActivities prepara retos del mismo nivel en memoria y respeta datos especiales explícitos. No modificar fuentes ni crear otro sistema; excluir cálculo y fuentes rechazadas por el sanitizador. Datos insuficientes no autorizan inventar preguntas. Detalle: ACTIVIDADES_ESPECIALES_Y_PROGRESION.md.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## Auditoría 04/10: límites y carga

Un parser escapado único para Completar; no fallback de materia. La pantalla carga/valida en IO y dispone de estado local de error/reintento. El catálogo se cachea por materia. Restore separa preparación IO y aplicación a estado UI. Complementar teoría y separar obras no autoriza borrar legacy ni reescribir bancos enteros para ocultar duplicados. Se conservan IDs, progreso y niveles. Referencias: COMPLEMENTOS_TEMARIO_2027.md y VALIDACION_CATALOGO_2027.md.


## 04/10/2026 — resultados y ejercicios
Reutilizar `rewardProgress`/`rewardCount` del resultado: XP obtenida y monedas reales tienen tarjetas propias dentro de las dimensiones compactas existentes. No modificar animaciones de Loki. Relaciones: completar de 4 a 6 asociaciones locales verificables; no rellenar con otra materia ni inventar datos. Si no hay asociaciones suficientes, el generador usa otras actividades locales, sin crear una relación de dos pares. El icono Play se decide mediante `isCurrent && !isCompleted`, sin modificar el recurso original.


## 04/10/2026 — háptica de resultados
El resultado compacto de Aprender usa LessonResultTiming sobre el reloj existente: cada contador dura 0,9 s, separados 0,15 s. Se conserva orden Aciertos, XP, Monedas y caída de estrellas. No se modifican archivos Loki ni su laboratorio. Haptics existente recibe dos eventos específicos: conteo 10 ms/amplitud 24, estrella 22 ms/amplitud 90 cuando hay control de amplitud; en otros motores usa tick/click nativos o pulsos breves. Evitar una vibración por punto/frame; máximo cinco marcas por contador y una por estrella ganada. Se respeta preferencia y ciclo de vida, sin repetición de eventos al restaurar.


## 04/10/2026 — velocidad y tipografía del resultado
Asignar speed=1.3 únicamente al playback compacto de LearningResultsArtwork; los conteos y vibraciones siguen usando la misma fase, sin cambiar las animaciones fuente de Loki ni el orden Aciertos→XP→Monedas. Reutilizar el asset local welcome_lilita_one para la nueva solicitud de tipografía de resultados, sin modificar el banner ni descargar fuentes. FontWeight.Black en etiquetas/valores; conservar 10 sp de etiqueta y tamaño heredado del valor. Color de texto derivado con contrastingText(surfaceAccent), borde CartoonFinish.ink, grosor interior 2,5 dp y bisel con 28% del acento. Mantener radio12, padding6, bisel2 y espacio6 dp para no añadir altura/scroll.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro duplica XP/monedas de estudio y evita consumir vidas, sin alterar estrellas o racha. Máximo inicial 15 y regeneración 30 min; comprar vidas desde Monedas. Eliminada recarga al terminar lección; entrada bloqueada solo a cero y sin Pro, no interrupción del nivel en curso.
Detalle y estado real: docs/monetizacion/README.md.

## 08/10/2026

Separar respaldo personal de operaciones sociales; no depender de Blaze para estudiar. Cuenta RevenueCat y conexión de compras pendientes, sin doble sistema Pro. Detalles en ../sincronizacion/DECISIONES.md.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

CourseIcon incorpora opción sticker solo solicitada desde selector/banner/encabezado. El camino de lecciones conserva el mapeo original por defecto. No cambiar catálogos, semanas, progreso, motor de preguntas o recompensas por una intervención visual.


## 08/10/2026 — Refinamiento solicitado

Solo Historia Universal, Biología y Física cambian su icono de banner/selector por vectores rellenos opacos. Catálogos, preguntas y SVG del camino no se modificaron.
