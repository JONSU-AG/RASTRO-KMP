# Arquitectura

ScientificMathSource preserva TeX y adapta solo la representación: exponentes/subíndices Unicode y campos numerator/denominator/prefix/suffix existentes. No evalúa ni despeja expresiones.

ScientificMath crea un WebView por bloque con JS/CSS/WOFF2 locales. Origen HTTPS appassets.androidplatform.net interceptado hacia assets; acceso a archivos/contenido y cargas de red bloqueados, navegación cancelada. JSON hacia función fija, sin HTML remoto. trust=false y límites de expansión/tamaño; MathML para accesibilidad. Los errores conservan fuente y aviso. Puente limitado a altura, conservado por R8. Altura según contenido, scroll horizontal y destrucción al salir de composición.

LessonContentRenderer agrupa formulaLatex/formulas, omitiendo duplicados exactos solo visualmente. MathFormulaDisplayBox y despejes comparten componente. FormularioScreen lo usa para mnemotecnias matemáticas; otras conservan texto.

PhysicsLearningDiagram decide por ID; PhysicsDiagramMath calcula y PhysicsDiagramCard dibuja Canvas. Animatable se cancela al salir; no reproduce automáticamente. Ramas de Física dejan de mostrar átomo genérico. Ningún catálogo modificado.

Ampliación 01/11: AcademicText reconoce notación dentro de prosa, conserva el texto y usa rich-text.js para segmentos TeX, exponentes, subíndices y entornos completos. La prosa no se convierte íntegramente en matemática; énfasis mediante nodos DOM, no HTML de la fuente. Usado en teoría, retos/opciones, explicaciones compartidas, Simulador, flashcards y revisión de errores. Las opciones matemáticas reenvían el toque al mismo callback existente; arrastrar horizontalmente no selecciona. Los errores de fuente conservan original.

Los gráficos ahora se seleccionan por materia y título real además de identidad; recursos y legacy reutilizan IDs con temas distintos. Análisis Dimensional incorpora esquema de fuerza/presión. MathLearningDiagram ofrece circunferencia unitaria y parábola para temas explícitos y reutiliza Pitágoras donde corresponde. No se añade un dibujo a cada materia por obligación, ni se usa un gráfico de otro tema como fallback.

AcademicTable almacena encabezados/filas rectangulares. extractAcademicTables separa tablas de prosa por sección; AcademicSection.tables y AcademicContent.tables conservan su estructura. ScientificMath renderiza cada tabla en un único WebView local con DOM seguro y semántica th/td. La versión antigua expandMarkdownTables queda sin llamadas en el flujo. Tabla irregular conserva el texto original.

AcademicCompanionPolicy resuelve familias de materias y claves AcademicArtwork. withAcademicCompanions asigna ilustraciones a las ramas ya analizadas, con presupuesto por lección y claves distintas. AcademicIllustration despacha cada clave explícitamente a un dibujo dedicado o AcademicContextDoodle. LessonPresentationPopup usa materia y tema separados. Las 418 teorías utilizan el mismo parser; no se añade configuración por archivo.
