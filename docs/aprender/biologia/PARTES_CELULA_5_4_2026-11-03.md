# Partes interactivas de la célula vegetal

Ámbito: únicamente el recurso de 3DCellForge en Biología 5.4, tanto en Material como en la teoría del nivel. Se conserva la apariencia del modelo completo y no se modifican preguntas, progreso, Firebase u otras lecciones.

## Funciones incorporadas

- Tocar una superficie identifica la parte; también puede elegirse desde el desplegable Parte.
- Nombre y función en español de núcleo, nucléolo, vacuola central, cloroplastos, mitocondrias, aparato de Golgi y pared celular. Las superficies no clasificadas se conservan como Resto de la célula.
- Resaltado de la selección manteniendo el resto atenuado.
- Separar partes / Unir partes, con transición de 350 ms y ajuste de distancia para conservarlas dentro de la vista inicial.
- Aislar parte / Ver todas. Al aislar el núcleo se incluye el nucléolo. La cámara centra y ajusta el tamaño de la selección.
- Giro, zoom y Centrar conservados. El selector y las acciones usan los controles adaptables existentes.

## Cómo se separa

El archivo original de 3DCellForge contiene una malla unida. Se hizo una segmentación visual de su superficie mediante regiones revisadas sobre la vista frontal del modelo. Las caras se agrupan conservando sus posiciones, normales y textura originales: no se crean ni eliminan triángulos. Son superficies extraídas del modelo ilustrativo, con bordes abiertos; no son órganos celulares reconstruidos como volúmenes cerrados independientes. Los cinco cloroplastos visibles se seleccionan como grupo, al igual que las tres mitocondrias visibles.

`cellforge-plant-parts.json` guarda nombres, funciones, regiones y desplazamientos. `cellforge-plant-parts.bin` asigna las 58 868 caras a ocho grupos sin solapamientos. Los hashes enlazan la asignación con el modelo exacto, evitando aplicar nombres sobre otro archivo accidentalmente. El script de preparación está en `scripts/academic/segment_cellforge_parts.cjs`.

`PlantCellParts.kt` reagrupa los vértices y resuelve la selección por intersección real de rayo/triángulo, con descarte previo por límites. El visor reutilizado dibuja los rangos correspondientes a cada parte; las funciones nuevas solo se activan cuando la malla contiene estos grupos. El modelo cardiovascular conserva su ruta sin partes nuevas y su imagen de referencia.

## Evidencia

`build/plant-cell-parts-final.log`: assembleDebug y 17 pruebas pertinentes correctas, sin fallos ni errores. Las tres pruebas nuevas comprueban la partición byte a byte de todos los triángulos, continuidad de rangos, nombres, aislamiento del núcleo con nucléolo, rechazo de asignaciones corruptas y selección sobre rayos que tocan regiones reales de núcleo/vacuola/mitocondria; los rayos fuera del modelo no seleccionan nada.

`build/plant-cell-parts-report.json`: ocho vistas gráficas distintas, no vacías, para conjunto, resaltado, separación e aislamiento. Usa los buffers y shaders exactos exportados por las pruebas. La vista ensamblada conserva la huella de píxeles anterior (`2882816183`) y 75 330 píxeles coloreados a 400 × 600. Se inspeccionaron las capturas de separación, núcleo y vacuola resaltada. La referencia gráfica del corazón también se conserva.

Capturas: `build/plant-parts-separated.png`, `build/plant-parts-nucleus.png`, `build/plant-parts-highlight.png` y las demás vistas del informe.

Esta prueba gráfica usa Chrome/WebGL, no ejecuta la aplicación Android. Falta comprobar físicamente los controles, toque, animación y tamaños en el teléfono. El usuario ya había confirmado que veía bien el modelo base; las nuevas funciones requieren su siguiente prueba. No se publica una versión.
