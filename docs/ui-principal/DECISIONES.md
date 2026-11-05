# Decisiones

- Reutilizar `GamificationManager`; no crear otro saldo para ligas o simulacros. La animación es posterior al cambio real de saldo y no produce escrituras por frame.
- Cofre: se conservan sus 30 XP y requisitos existentes. Al cerrar se entrega el recibo hacia el nivel fijo; si termina un tema, la entrega de lección espera a cerrar su popup para permanecer visible.
- Preparación de ligas: Wawita desde nivel 1, Kinder 5, Prefósil 10, Fósil 20, Futuro Cachimbo 30. Son umbrales iniciales elegidos para dejar el flujo listo; el usuario todavía no definió los definitivos. Se mantiene el nivel existente de 100 XP.
- Simulacro: base inicial ajustable de 5 XP por respuesta correcta, identificador UUID por intento y registro persistente de intentos cobrados. No cambia el cálculo ponderado UNSA ni da XP por respuestas omitidas/incorrectas.
- El resultado elige personaje entre los tres y emoción según estrellas: 3 Feliz/Enamorado, 2 explosión completa, 0–1 Triste/Enojado. La elección permanece estable durante recomposiciones. Máximo dos repeticiones por personaje/emoción cuando existen alternativas; explosión es excepción aprobada por el usuario.
- Las velocidades x2 se aplican únicamente al footer y racha solicitados; el clip canónico y su geometría siguen intactos.
- La adaptación utiliza el ancho disponible de Compose, no identifica fabricantes ni obliga una orientación. Publicaciones/materiales aproximadamente 340–360 dp mínimos; portadas 120 dp (dos o tres en celular según ancho, más en tablet); límite principal 1440 dp.
- Se preserva el detalle original de obras; las portadas solo muestran portada y título, y abren el mismo detalle.
- Los reportes académicos usan la bandeja administrativa existente y `postId` vacío. Se incluyen ID, enunciado, opciones, respuesta y contexto para revisar; no se borran preguntas desde controles de UGC.
- Enlaces HTTPS del dominio ya declarado en el manifest. El dominio respondió 200 con `assetlinks.json` para `com.jonsuapps.rastro`; cada firma instalada debe estar autorizada por el servidor. No se desplegó hosting ni se cambiaron certificados.

## 03/10 — Acabado
Reutilizar Sticker3d y CartoonFinish; no crear otra estructura de pantallas. Calentar solo las paletas clara/cálida; oscuro/AMOLED y temas personalizados conservan superficies y acentos. Vidas informa mediante el diálogo Sticker existente y StateFlows de GamificationManager; no añade temporizador independiente.

## 03/10 — Una política responsive común
Límites y columnas resueltos centralmente desde el ancho de ventana (600/840 dp), no desde orientación/tipo de dispositivo. Cambios de presentación solamente, sin Firebase ni datos ni temas. El contenedor mide ancho primero; las grids reciben número de columnas seguro, mientras Aprender conserva su lista/camino.
Las cabeceras y paneles completos permanecen en sus items originales y se centran con ancho máximo. Perfil no se divide en nuevos paneles ni mueve acciones: portada/info contenidas, publicaciones usan grid existente. Guardados complejos conservan la composición de su bloque con ancho máximo, en vez de forzar columnas. Home y Cursos mantienen funciones/orden; SVG, personajes y estética intactos.
Previews verticales en grandes pantallas se reducen proporcionalmente, sin recorte/deformación. La ampliación completa se conserva. El banner de curso cambia solamente el límite de altura mínima automática, no su contenido ni imagen; mantiene recorte y protección de contraste existente.
El banner de Aprender usa también RastroBoundedBlock(hero=true), máximo 520 dp compartido con Home, centrado dentro del camino. Evita crecer/cortar la ilustración verticalmente al limitar altura; los textos/control conservan altura natural si la necesitan.

## 03/10 — Visor y configuración editorial de avisos
ResourcePreviewDialog.kt conserva proporción y limita la altura al espacio disponible; ancho previo estimado del diálogo Android multiplicado por 1.12, limitado al 96% de la ventana. Zoom 1–5x, arrastre limitado, controles +/−/Restablecer. UserUploadPreview y ProfileUploadCard comparten el visor; no se amplía el recurso remoto ni se modifica su archivo. RastroMediaFrame reduce únicamente ratios <0.9 un 20%, sin cambiar horizontal ni grids.
Racha semanal/Ruta de Preparación en Home son items full-span, centrados hasta 720 dp por la política existente. Navbar mide constraints disponibles y presenta nombres en móvil también; recursos ic_nav_exam_outline/filled conservan nombres y rutas, con dibujo de hoja de respuestas.
Avisos: Admin > Notificaciones > Avisos automáticos por actividad. StudyReminderEditor.kt edita oficiales/study_reminders, campo templates; reutiliza permisos existentes de contenido editorial (lectura pública/escritura del autor), sin cambiar reglas. Cada fila: id, activity (LESSON_DONE/STILL_TIME/STREAK_LOST), title (100), body (500), startHour/endHour (0–23 Lima, inicio<=fin), enabled. Máximo 32 filas; agregar/quitar/activar/editar y guardar explícito. Se puede dejar vacío para desactivar todo. No es una difusión inmediata. Defaults en notifications/StudyReminderTemplates.kt; configuración inválida no se sobrescribe desde Admin. Worker reutiliza WorkManager periódico actual, lectura remota con caché Firestore/fallback local y timeout 8s; un aviso/día/actividad/usuario evita repeticiones cada tres horas.
Actividad calculada desde GamificationRepository.loadLocal del usuario actual, sin escribir progreso: completedLessons no skipped con completedAt hoy; racha perdida solo si lastStudyDate tiene más de un día y no hay congeladores; resto aún a tiempo. No se confunde entrar a la app con completar una lección. Sin contenido privado en documento editorial. La detección usa datos locales sincronizados disponibles, no una consulta de progreso remoto por cada ejecución.

## 03/10 — Persistencia y visibilidad de Mis errores
ErrorBankRepository.errors contiene solo la cuenta Firebase activa (o guest cuando no hay cuenta). SharedPreferences rastro_errors_by_account usa clave UID; remoto usuarios/{uid}/gamificacion/failed_{SHA256(origin:questionId)}, recordType=failed_question. Reutiliza regla privada existente de gamificacion; sin reglas nuevas ni deploy. Listener whereEqualTo recordType separado del documento de progreso rastro_progress. Fallos repetidos actualizan respuesta y reabren el pendiente, sin duplicar por origen/ID; marcar repasado persiste. La lista completa permanece privada y no tiene el límite de la copia pública.
Datos: FailedQuestion conserva statement/options/answer/explanation del banco, selectedAnswerIndex nullable e imageUrl, origin Aprender/Simulacro/Examen Rápido/Ranking. Null significa sin responder. Sin guardar aciertos en el banco ni fabricar explicación. Exámenes guardan en batch una vez al confirmar finalización; captura no altera evaluación. Aprender MC captura al fallar; tipos Relacionar/Completar teoría aún no se serializan como alternativas en este banco (no inventar una respuesta para ellos).
Compartir: perfil público usuarios/{uid} con errorsPublic=true y sharedErrorBank como proyección limitada a 30 recientes, explícitamente descrita junto al switch de Mis errores. Registrar/Revisar no publica por defecto. Desactivar pone false y FieldValue.delete del campo público. Actualizaciones posteriores de la proyección usan transacción que comprueba errorsPublic, evitando repoblar datos después de revocar. No modificar privKeys ni otras reglas. Una cuenta anónima debe iniciar sesión para publicar. Guardado y fallo se comunican en el modal. Los visitantes reciben exclusivamente publicQuestions(otherUserData), nunca errors de la sesión activa; onSolve y onShareChange nulos. No prometer revocar capturas/cachés de terceros que ya vieron contenido público.
La habilidad Firebase guía el almacenamiento por documentos y captura en batch; CodeGraph y Cartoon UI delimitan conexiones y presentación. No se conectó un segundo sistema de XP/progreso.

## 03/10 — Widgets ilustrados
Reutilizar recursos exactos de LOGO/WITGET. RastroWidgetViews es la única construcción de RemoteViews para providers, preview en app y anclado; evita vistas Compose que difieran del widget real. Picker: datos actuales API 35, mismo layout con ejemplos API 31 y fallback ilustrado anterior; no prometer datos personales en todos los launchers. Mantener los aliases y navegación existentes: dos acciones explícitas recibidas por MainActivity, whitelist en RastroAppLinks. El menú Desinstalar pertenece al sistema. Solo los mensajes de esos atajos usan emojis. Detalles en WIDGETS.md.

## 03/10 — Fecha de admisión personal
La fecha siempre la elige el usuario; el calendario UNSA es un preset editable en UnsaExamDates con datos suministrados, no una fecha impuesta ni un feed oficial. Diferenciar evaluación principal y previa con selector, no cambiar automáticamente la fecha según carrera. El día civil se interpreta en Lima: el último día cuenta horas hasta medianoche, después Hoy durante toda la fecha. No inventar hora de examen. Una alarma no exacta para refrescar sin nuevos permisos; Android puede retrasarla. Preservar navbar y acercar elementos solo mediante gap y métricas tipográficas.

## 04/10
- Componer datos e ilustración juntos evita desalineaciones al redimensionar widgets. PNG fuente intacto, RemoteViews real compartido con preview.
- Reutilizar WorkManager y aliases existentes para icono instalado; riesgo usa ENOJO porque no hay un quinto logo autorizado.

## 04/10 — Piloto doodle
Usar opción temporal en ThemeManager, no segundo sistema de temas. UID + mismo guard Admin del app shell evita propagación entre cuentas. Sin persistencia remota/local. Modifier drawWithCache en fondo de seis páginas principales; Path agregado y dimensión dp fija. No overlay sobre tarjetas ni fondo global invasivo. Mezcla mínima con textPrimary permite claridad/oscuro sin colores fijos. Remoción descrita por puntos, nunca revertir archivos completos con trabajo previo.

## 04/10 — Intensidad de Material You
Una preferencia dentro de ThemeManager existente; no otro tema/sistema. Suave conserva la fuente, Medio/Fuerte refuerzan detalles con fondo máximo 8% tintado. Normalizar texto en la paleta resuelta y separar accent (relleno), accentText (texto neutral), onAccent (sobre relleno) evita trazos alrededor de letras y blanco fijo ilegible. Tokens cacheados por paleta, sin cálculo por frame. Conservar semántica/marca/arte; ver TEMAS_INTENSIDAD_Y_CONTRASTE.md.

## 04/10 — Orden y medidas consistentes
Mantener listener existente de publicaciones destacadas y seleccionar recientes después de ordenar, evitando un subconjunto limitado arbitrario sin exigir despliegue de índice. Tarjetas Explora con altura común de 64 dp adaptada a escala de fuente. HUD sin constantes de 100 EXP: usa XpProgression. Detalle: ../aprender/ACTIVIDADES_ESPECIALES_Y_PROGRESION.md.


## 04/10 — Simulador y Amigos/Rachas
Reutilizar componentes, repositorios y datos existentes. Detalle y límites de validación: [AMIGOS_Y_RACHAS.md](AMIGOS_Y_RACHAS.md).


## 04/10 — Fuente del banner
Reservar WelcomeBannerFont/Lilita One para HomeHeroBanner. No aplicar al Theme ni a otras pantallas; conservar colores y tamaños. Fuente/licencia en CAMBIOS.md.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## Auditoría 04/10: temas y acceso

Material You MEDIUM solo como valor inicial cuando no hay preferencia guardada. Fondo académico opt-in para todos, OFF por defecto, paths estáticos cacheados y escala visual 2× en dp; no segundo tema. Auth usa Loki Clásico ACHIEVEMENT con Google destacado y paleta actual; credential picker no lleva timeout arbitrario, las operaciones Auth de red sí (30 s) y respetan cancelación. Los mensajes derivan contraste de sus superficies. No se alteran contraseñas mediante trim. Propietario verifica acceso Google firmado y apariencia real.


## 04/10/2026 — autenticación y continuidad
El spinner de correo compartía isLoading con Google y parecía enviar el formulario; además el botón dedicado usaba la opción genérica de credenciales. Se usa la opción específica Google y estado de carga separado. Esto corrige el mecanismo observable en código; el síntoma físico de segundo toque queda pendiente de prueba.
Amigos/grupos reutilizan racha_dual y notificaciones existentes. Grupos 2–10 con aceptación de todos; actividad propia únicamente. Contador nuevo basado en fechas comprobadas por todos. `streakDays` antiguo se conserva como historial separado si no contiene fechas para reconstruirlo. No inventar protección por escudos.
La migración de racha personal es versionada/idempotente y recupera únicamente continuidad acreditada por segundos antiguos de días anteriores. El tiempo nuevo requerido es 15 minutos visibles o una lección. Se evita sobrescribir progreso remoto durante restauración; fallo de red deja sincronización suspendida hasta restauración correcta posterior. El tiempo no se transfiere de cuenta ni atribuye a hoy la parte anterior a medianoche.


## 04/10/2026 — historial y valor por defecto
Limpiar se limita a failed_question; errorsClearedAt sincroniza el corte y evita resurrección de datos cacheados. Transacciones revalidan fecha/tipo antes de eliminar para no borrar fallos nuevos concurrentes. Pausa en el mismo repositorio, errorSavingPaused y preferencias por UID. Solo dueño accede a controles. Fondo académico activo si aún no hay preferencia; no sobrescribir una elección explícita de desactivarlo.

## 08/10/2026 — Inicio, invitados y herramientas

Ámbito: acceso invitado a Perfil, Home, logo general/notificación, contador existente, tabla periódica, vista usuario Admin para probar anuncios y caducidad de Mis errores. No catálogos de lecciones, temario, firmas/versionado, publicaciones ni despliegues.

- Perfil propio: la ruta completa deriva a Auth para invitado/anónimo sin componer UserProfileScreen; el botón superior ya lo hacía. No se crea cuenta/perfil de invitado.
- Logo general de aplicación (incluidos diálogos Android que leen application.icon) y recordatorios grandes usan rastro_logo_base. Estado inicial/fallback del gestor de logo usa el mismo recurso. Iconos launcher emocionales conservados. Cachés de Android/branding remoto Google no son comprobación visual automática.
- Inicio: pista discreta y pulsable para personalizar colores, contador amplio antes de ruta de preparación; accesos parejos Tabla periódica y Ligas (liga real de progress.level). Reutiliza modal global de tabla, Ligas y preferencias del widget.
- Contador sin fecha elegida: próximo examen de Conocimientos, incluyendo hoy; excluye Previa y Aptitudes. Una fecha personalizada nunca se reemplaza. Refresco local cada minuto mientras Home está compuesto; sin red. Si se agota el cronograma, pide configurar.
- Tabla: 118 números únicos, nombres en español, propiedades de snapshot PubChem; se conservan tips existentes. Vista tradicional por grupos/períodos con dos ejes de desplazamiento y filas f separadas; lista buscable alternativa. Campos no disponibles quedan vacíos/indicados, sin inventar valencias. Detalle acotado con scroll interno para conservar espacio de tabla.

Fuentes: https://admision.unsa.edu.pe/cronograma-de-admision-2027/ y https://pubchem.ncbi.nlm.nih.gov/rest/pug/periodictable/CSV (consultadas 08/10/2026). PubChem AtomicMass no equivale necesariamente a peso atómico estándar: para elementos sin isótopos estables puede representar masa de referencia. Valores transuránicos pueden ser estimados; no presentarlos como mediciones experimentales garantizadas.

Validación: 149 pruebas Android, cero fallos/errores/omitidas; lintVitalRelease correcto. compilar_app.bat/assembleDebug correcto. Sin ejecutar APK ni cambiar versión/crear AAB/publicar. Matriz visual física pendiente.

## 08/10 — Acabado y apertura inmediata
Diálogos independientes nunca dentro de un item lazy: su apertura depende del estado, no de la visibilidad del elemento. Tema de tres controles sobre la arquitectura existente; cuarto campo persistido conserva compatibilidad. Contraste automático para textos, pigmentos opacos de vectores para ilustraciones Home. Zoom cambia geometría real de tabla con límites 60–225%, sin modificar datos. No reorganizar progreso por cambios visuales.


## 08/10/2026 — Iconos, herramientas y tarjetas compactas

Reutilizar FavoritesRepository para fórmulas y UserManager.savedMnemotecniaIds para mnemotecnias; no crear otra persistencia ni nuevas escrituras Firestore. La antigua ruta Flashcards muestra Simulador en su pestaña 3; Formulario contiene solo Fórmulas y Mnemotecnias, sin cargar otra vez el banco oficial. El banco del Simulador es un superconjunto del anterior: oficiales, predeterminadas y comunidad; ningún contenido borrado.


## 08/10/2026 — Refinamiento solicitado

Iconos sólidos y nueva carpeta de Biblioteca; insignias del perfil mantienen el fuego existente. Días pasados sin actividad: guion y borde continuo; futuros: borde discontinuo. Contador compacto con número y unidad en línea. Portada opcional en Inicio con switch; editor arrastrable, zoom y controles de posición. Modelo de cuenta existente extendido, sin nueva colección ni observadores. Misma proporción de Inicio en la vista previa. Guardar confirma imagen/encuadre; cancelar no publica el borrador.


## 08/10/2026 — Iconos, revisión y regalos

Aportar/Aportes separados; Fórmulas con Σ, Ligas con copa y fuego original en Racha. Aprender/Cursos distintos; carpeta Biblioteca opaca. Formulario ampliado a 32 fórmulas/37 mnemotecnias con enlaces explícitos y notación serif/fracciones. Ver AJUSTES_2026-10-08_ICONOS_FORMULAS_Y_SIMULADOR.md.

Reutilizar saldo, repositorios, Pro y avisos existentes. No crear una economía paralela ni activar cobros. Catálogos de lecciones y recurso original de fuego conservados.


## 08/10/2026 — Aviso opcional de actualización

Aviso temático con bisel RASTRO situado encima de LiquidNavbar; entra desde abajo y sale al cerrar. X y Cerrar descartan el aviso; Actualizar abre directamente market://details de este paquete en Google Play, con enlace HTTPS de respaldo si no está instalada la tienda. No fuerza instalación, descarga ni reinicio.

Disponibilidad consultada con Google Play AppUpdateManager, biblioteca oficial app-update 2.1.0. Solo muestra UPDATE_AVAILABLE con versionCode superior al instalado; nunca compara textos de versión ni usa un número supuesto de Play. Error/sin conexión/instalación no reconocida: aviso omitido. Consultas al crear RastroApp, caché de seis horas en proceso; sin Firebase, listeners ni tareas periódicas. Cerrar recuerda la versión por 24 horas; una versión posterior no hereda el cierre.

Se muestra en Inicio, Aprender (selector), Cursos, Biblioteca y Perfil. No se muestra en lecciones, examen, login ni Admin. No añade rutas ni altera autenticación, pagos, gamificación o catálogos.

Referencia oficial: https://developer.android.com/guide/playcore/in-app-updates/kotlin-java
Prueba de disponibilidad real requiere una instalación y cuenta elegibles en Google Play, con una versión superior publicada en su canal. Una compilación local no demuestra que exista tal actualización.

## 08/10/2026 — Comunidad fija

Canal oficial común: https://whatsapp.com/channel/0029VbDFAEu7YScyVZBNul0X . Inicio no utiliza redes personales del usuario; esas se conservan en Perfil. Entrada Pro reutiliza el modal existente.

Práctica: el pie de comprobar/continuar ocupa espacio real, fuera del scroll, y no debe superponerse a las opciones. La navegación inferior se oculta en la ruta de lección completa y vuelve al salir. Racha: una pantalla en tamaños habituales, con desplazamiento de respaldo para accesibilidad y pantallas pequeñas; no reducir el calendario eliminando fechas ni alterar las marcas de actividad.
