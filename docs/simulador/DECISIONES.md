# Decisiones

- Reutilizar motor de Simulador, banco, ponderaciones y `claimExamReward`; no crear otra EXP ni modificar contenido académico.
- La instrucción posterior de remodelar Simulador prevalece sobre la frase inicial de no tocarlo: se conserva su ruta y funciones, cambiando únicamente el botón Ranking de Perfil a Ligas.
- EXP determina la liga y la clasificación principal. Racha es adicional y no divide la membresía. Umbrales heredados del HUD.
- Intento consumido al inicio mediante transacción y UUID; resultado idempotente. Configuración editorial remota opcional, valores iniciales ilimitados. Fallos no permiten comenzar sin control de intentos.
- Puntaje Ranking normalizado por los pesos reales del papel, separado del puntaje oficial de práctica; identidad de asignatura intacta incluso si no existe banco para una sección.
- SVG con XML equivalente para render nativo. Se aplicaron CodeGraph, Cartoon UI, Vector Animations, Bouncy, Material3 y Firebase Performance, conservando la paleta RASTRO.
- Se desplegaron solo índices necesarios. No migración masiva de perfiles ni backend antitrampas/anuncios; validar esos futuros recibos en servidor.

## 03/10 — Densidad móvil
Accesos: FlowRow con tamaño natural y etiquetas compactas accesibles; preservar índices y callbacks. Usar icono lateral, altura táctil mínima 44 dp y evitar tarjetas expandidas de navegación.

## 03/10 — Tarjetas ilustradas según referencia
La composición de referencia sustituye el FlowRow compacto previo: índices 0/4/3 en una fila y 1/2 en la fila secundaria. Conserva destinos, motor, filtros, pesos, orden, examen y resultados. No altera las barras; RastroApp solo deja de incluir Simulador/Examen Ranking en hasLearningHud.
SimulatorMenu.kt reutiliza los SVG/VectorDrawable actuales de examen, trofeo, capas, cerebro, libro, rayo y gráfica. Capas de relleno/contorno y lápiz existente forman las ilustraciones sin redibujar mascotas. Las superficies mezclan los tokens activos; texto ajustado a contraste >=4.5:1; las variantes oscuras no usan pasteles blancos.
Edición: AdminConfig.isEffectiveAdmin y AuthStateListener; permisos definitivos en las reglas editoriales existentes, sin modificar ni desplegar reglas. Documento opcional oficiales/simulator_visuals con card_0/card_4/card_3: {vector: exam|trophy|cards|brain|book, image: URL o cadena vacía, tint: 0 original, 1 tinta, 2 acento}. Cambiar visual no modifica índice/destino. Firestore se escucha mientras el menú está montado y se libera al salir; ausencia de configuración conserva vectores locales. Imágenes usan el selector y DriveUploadRepository existentes; se suben para preview y Guardar persiste su URL. Cancelar no cambia configuración editorial; una imagen subida puede permanecer en Drive. No se elimina ningún archivo.
ClassicArtwork(NEW_IDEA, character=LOKI) llama al rig y secuencia existentes. No se clona, renombra ni altera la animación. El ancho limitado evita que cubra el texto.

## 03/10 — Acción vigente durante gestos
Sticker3dButton usa rememberLiveClick (rememberUpdatedState y un handler estable): la coroutine de pointerInput no conserva el índice de la primera pregunta. Se mantiene la física existente. ExamActiveView recibe userAnswers.toMap() para observar cambios de selección. Sin cambios en bancos, ponderaciones, EXP ni navegación. El test JVM usa un shim de android.os.Trace exclusivamente en src/test/java, sin dependencias de producción.

## 03/10 — Háptica sin revelar respuestas
Feedback de selección en el callback común de respuestas, solo si cambia el índice elegido. No comparar la alternativa con la respuesta correcta ni revelar aciertos durante Simulacro.

## 03/10 — Mis errores y revisión
Capturar al finalizar, nunca al seleccionar: evita registrar opciones que el usuario aún puede corregir. Origen Ranking se toma de activeRankingConfig, Rápido de activeSimulatorTab==1. Clave estable origin:questionId mantiene modalidades separadas. Review toma result.details existentes, no vuelve a calcular ni da XP; allowReview=false para Rápido. QuestionReviewCard en ErrorBankDialog.kt comparte render con Perfil.

## 04/10 — Recompensas y matriz UNSA
Pesos completos matriz 2027, redondeo final; rangos históricos oficiales de 2025 con fuente y proceso visibles, sin renombrar carreras.
Detalle vigente: [MATRIZ_2027_Y_REFERENCIAS.md](MATRIZ_2027_Y_REFERENCIAS.md). Sustituye políticas anteriores incompatibles.

## 04/10 — Presentación de flashcards
Mantener contenido completo en un marco estable y separar solo encabezados académicos existentes. Respuesta centrada, explicación alineada al inicio y de menor peso; scroll interno solo cuando falta espacio. Reutilizar vectores locales y paleta activa. Detalle: ../cursos/TITULOS_Y_CONTROLES_PLAYLIST.md.


## 04/10 — Simulador y Amigos/Rachas
Reutilizar componentes, repositorios y datos existentes. Detalle y límites de validación: [POPUP_Y_CALCULADORA.md](POPUP_Y_CALCULADORA.md).

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## Auditoría 04/10: reserva y red

Guardia de doble reserva antes de mutar estado; resultado válido solo mientras pantalla y UID sigan activos. Efecto de carga sin rankingConfig como propia key y con Reintentar; cancelar descarta respuestas obsoletas. Funciones actuales y la matriz de puntaje conservadas; el peso de Física Ingeniería se corrigió a 1.524826850 conforme al PDF oficial. Enlaces externos controlan ActivityNotFound/SecurityException sin crash.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Primer Simulacro gratuito; tres intentos por concesión Pro; intentos con monedas e ID único. Sesión guardada por cuenta/dispositivo en IO, retomada sin cobrar de nuevo. Ajuste de ancho del desplegable y cierre natural Terminar en la última Flashcard.
Detalle y estado real: docs/monetizacion/README.md.

## 08/10 — Ligas
La geometría de Ligas depende del ancho del contenedor, no de la longitud del título. Mantener orden del catálogo y orden real del ranking.


## 08/10/2026 — Cierre al iniciar examen y anuncios

Corregido guardado de SavedExamSession activando el plugin Kotlin existente y usando serializador generado. Checkpoint con error no termina el proceso. Ver `docs/simulador/CIERRE_Y_ANUNCIOS_2026-10-08.md` para evidencia y límites.


## 08/10/2026 — Iconos, revisión y regalos

Revisión de resultados en popup con LazyColumn, X y filtros, en lugar de 80 tarjetas compuestas. Back permanece en Simulador; coste/confirmación de monedas y fin de actividad publicitario conectados. OOM en medición de texto documentado; prueba física pendiente.

Reutilizar saldo, repositorios, Pro y avisos existentes. No crear una economía paralela ni activar cobros. Catálogos de lecciones y recurso original de fuego conservados.
