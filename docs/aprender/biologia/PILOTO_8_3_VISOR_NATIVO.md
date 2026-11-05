# Piloto visual: Biología 8.3 — 03/11/2026

Ámbito solicitado: únicamente Sistema cardiovascular, `bio_t08_s03`. El usuario confirmó pantalla blanca tanto en la teoría como al abrir 3D y pidió esperar su prueba antes de extender la solución. No se cambian otras lecciones, preguntas, navegación, Pizarra, Firebase ni recompensas.

## Implementación

La ruta de `EducationalVisualCard` delega exclusivamente el recurso `human-heart`, materia `biologia`, asociado exactamente a `bio_t08_s03`, al componente `CardiovascularPilotCard`. El resto conserva su implementación. Material y la teoría del nivel usan este mismo punto de entrada.

La ilustración se muestra con `Image` nativo, sin HTML ni WebView. Se rasterizó el SVG científico original de Bioicons a PNG de 1380 × 936, 349 385 bytes. Se conservan el SVG, su hash, autoría CC0 y la procedencia del derivado en `assets/educational-visuals/pilots/cardiovascular83/source.json`. Es la ilustración original; no se generó otra anatomía. La imagen original contiene rótulos en inglés. La interfaz del piloto usa español.

El modelo se abre en `GLSurfaceView` y OpenGL ES 2 de Android, sin JavaScript, model-viewer, CDN ni dependencias nuevas. El decodificador usa las posiciones, normales e índices del GLB original de BodyParts3D. Conserva sus 83 componentes y 102 802 triángulos; no crea un corazón sustituto, no simplifica nuevamente la geometría ni simula el latido. El color es ilustrativo. Se mantiene su atribución y licencia CC BY-SA 2.1 Japón en Fuente.

El modelo se carga solo al solicitar 3D. Arrastrar gira; pellizcar amplía; Centrar modelo restaura la cámara. Se dibuja al cargar o interactuar, sin animación continua. La representación queda acotada, el giro vertical y la distancia de cámara tienen límites, y los buffers se liberan con el ciclo de vida del visor. La memoria de vértices es de 7 401 744 bytes más la copia de GPU, sin texturas. El motor de Android conserva su gestión de contexto al pausar/reanudar.

Hay un indicador nativo al cargar, tiempo de espera de 15 segundos y un error visible con reintento y acceso a la imagen si no arranca. El título y Cerrar permanecen fuera del área gráfica. Los errores de preparación/dibujo se registran localmente con etiqueta `RastroCardio83`; no se envían datos a un servidor.

## Comprobaciones

- [x] `assembleDebug` y las 16 pruebas pertinentes: cinco del piloto, seis de catálogo visual y cinco del lector Material, sin fallos ni errores. Log: `build/cardio83-pilot-validation.log`.
- [x] PNG derivado y SVG original verificados por firma/hash y procedencia.
- [x] El decodificador conserva 83 componentes y 308 406 vértices expandidos, equivalentes a 102 802 triángulos; datos finitos y límites verificados.
- [x] Datos corruptos fallan localmente; el piloto no se activa en otra materia/lección.
- [x] Pipeline gráfico: shaders GLES2 y buffer exactos exportados por las pruebas y dibujados con WebGL en Chrome. Fotograma inicial con 95 310 píxeles coloreados; giro y zoom producen imágenes diferentes. No es una pantalla blanca. Evidencia: `build/cardio83-native-shader-report.json` y `build/cardio83-native-3d.png`.
- [ ] Ejecución y aceptación física en Android: pendiente. La prueba WebGL comprueba geometría/shaders, pero no ejecuta GLSurfaceView, Compose, gestos ni el ciclo de vida del teléfono.

No se afirma que una compilación o captura de Chrome confirme el funcionamiento en el dispositivo. Se detiene la ampliación del piloto hasta recibir la prueba del usuario. No se publicó una versión.

## Bioicons y 3DCellForge

[Bioicons](https://github.com/duerrsimon/bioicons/blob/main/README.md) es una fuente reutilizable de ilustraciones científicas; exige revisar y citar la licencia de cada archivo. El corazón de este piloto ya procede de esa biblioteca.

Se revisaron el [README de 3DCellForge](https://github.com/huangserva/3DCellForge/blob/main/README.md) y su [licencia MIT](https://github.com/huangserva/3DCellForge/blob/main/LICENSE). El código puede reutilizarse conservando el aviso. Es un estudio React/Three.js para importar/visualizar y generar modelos con proveedores opcionales y claves API. Su licencia de software no certifica exactitud científica, licencia de cada modelo ni gratuidad de los servicios de generación. No se incorporó al piloto cardiovascular ni se activaron proveedores. No se confirmó la afirmación de que lo haya creado GPT 5.6.
