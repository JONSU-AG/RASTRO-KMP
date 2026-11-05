# Decisiones

## 03/11/2026

- Reutilizar los dos componentes de respuesta existentes: Aprender y examen activo. No crear modalidades nuevas.
- Mostrar progreso de preguntas únicamente durante la resolución; no contar la teoría como una pregunta contestada.
- Conservar todas las alternativas del origen, los tipos completar/relacionar y los renderizadores académicos.
- Mantener los botones propios de cada modalidad: Comprobar/Continuar en Aprender y Anterior/Siguiente/Calificar en exámenes. No convertir un examen en una corrección pregunta a pregunta.
- Reservar Auto al administrador real verificado con la comprobación existente `GamificationRepository.isVerifiedAdmin`, respetando el modo usuario. No modificar permisos remotos.
- Corrección tras las capturas del usuario: la pizarra de preguntas debe ocupar una pantalla completa y permitir dibujar sobre el enunciado. La distribución partida inicial queda sustituida en preguntas. Colores, grosor y borrador son controles visibles, no funciones escondidas en un menú.
- Mantener dibujos locales y acotados durante la actividad, separados por cuenta y pregunta; en exámenes, también por intento.
- No crear un temporizador que el modo actual no tiene. Abrir la pizarra no invoca ninguna reserva, reinicio, calificación ni operación de ranking.


## 03/11/2026 — Ajustes de margen inferior, flecha y teoría

La pizarra calcula el margen seguro del diálogo a partir de los insets completos de su ventana, sin descontar los ya consumidos por el Scaffold de la app. Evita que el control de grosor termine bajo la navegación de Android.

La flecha de lectura se integra en el margen lateral de QuestionScrollArea y deja de ser una fila que resta altura al área desplazable. Solo aparece si quedan más de dos píxeles por recorrer; no ocupa altura adicional ni modifica el criterio al aparecer. Se retiraron los dos avisos externos en Aprender y examen activo.

La cabecera general se oculta durante toda la ruta del nivel, incluida la teoría inicial. No cambian preguntas, respuestas, recompensas ni dibujos.

Validación: assembleDebug y 545 pruebas unitarias (348 Android + 197 shared), sin fallos, errores ni omitidas. Dos pruebas nuevas cubren la indicación al caber todo el contenido, el margen de redondeo y el final del recorrido. Log: build/question-insets-scroll-validation.log. No se ejecutó Android; queda pendiente confirmar los márgenes y el resultado visual en el celular del usuario.


## 03/11/2026 — Grosor estable y exportación en preguntas

Ámbito: StudyNotebookHost, QuestionNotebookState y el nuevo QuestionNotebookExport; no se modifica Pizarra libre ni la evaluación de preguntas.

El grosor se coloca antes de la paleta. La fila de modos de borrado permanece en la misma posición con lápiz, mano y borrador; sus botones también permiten activar directamente el borrador. Se elimina el cambio de altura causado por mostrar esa fila solo con borrador. Esto complementa el margen seguro del diálogo: la captura del usuario mostró que el margen por sí solo no resolvía el recorte.

El botón superior de ajustes se sustituye por un menú Guardar imagen / Compartir imagen. Los ajustes siguen en la barra inferior. La captura incluye el área visible del papel, texto y tinta según la posición/zoom actuales, y excluye cabecera/herramientas. No exporta todo el plano virtual fuera de pantalla.

La captura usa GraphicsLayer de Compose; PNG, selector de destino y FileProvider reutilizan los mecanismos y la carpeta pizarra_exports existentes. No se agregan permisos, proveedores ni dependencias. La copia pendiente de guardar pertenece al ViewModel de la actividad y se libera al cancelar, completar o destruirlo. Los errores de memoria/exportación se muestran sin simular una descarga exitosa.

Validación: assembleDebug y 545 pruebas (348 Android + 197 shared), sin fallos/errores/omitidas. Log build/question-export-validation.log. No se ejecutó Android: quedan pendientes la disposición física y probar guardar/compartir, especialmente contenido matemático alojado en vistas Android.

Referencia técnica de captura: https://developer.android.com/develop/ui/compose/graphics/draw/modifiers#write-contents-of-composable-to-bitmap
