# Arquitectura

`LessonEngineScreen` conserva el estado y la evaluación de alternativas, completar y relaciones. `ExamActiveView` conserva las respuestas y la navegación de simulacro, examen rápido y ranking; el intento sigue en `SimuladorScreen` y `ExamSessionStore`. No hay un segundo motor de evaluación.

`QuestionActivityHeader` muestra el contexto, acceso a pizarra, vidas cuando corresponden, una barra continua y un contador. En Aprender se monta durante preguntas, no en teoría ni resultados. `QuestionFocusRegistry` registra la composición de una actividad de respuesta y retira la cabecera global y la barra inferior; al desmontarse, libera su registro.

`QuestionScrollArea` reserva un margen lateral para su indicador de lectura. `StudyScrollCue` usa una flecha circular sin cubrir las alternativas y desplaza únicamente al pulsarla.

`StudyNotebookHost` recibe una clave por usuario/contexto/pregunta y el mismo enunciado académico para dibujar. En preguntas abre una ventana de pantalla completa con barra de estado conservada, sin división entre pregunta y lienzo: texto, imágenes y tinta comparten origen y transformación. En horizontal la caja de herramientas pasa a un lateral. Material conserva su presentación previa mediante la rama de consulta del mismo host.

Se reutiliza `PizarraCanvasEngine`, su historial, el borrado por trazo y el de precisión. El raster tiene el tamaño del área visible sujeto al presupuesto existente; el desplazamiento y el zoom transforman coordenadas, sin crear una imagen de tamaño mundial. Los trazos activos y los ya terminados usan la misma transformación.

`QuestionNotebookModel` vive en la actividad. Retiene como máximo 128 documentos y un presupuesto agregado de 500 000 puntos al desalojar documentos inactivos. El documento visible no se desaloja; cada motor mantiene sus límites propios. Al cerrar o cambiar de pregunta se libera el raster y se retiene la geometría. Al destruir la actividad se libera todo. No hay persistencia del dibujo tras terminar el proceso ni nuevas escrituras en Firebase.

El ancho inicial del papel se conserva por pregunta para mantener el ajuste de líneas del enunciado al rotar. La mano y la pinza permiten recorrer y ampliar el papel. Restablecer vista no borra geometría.
