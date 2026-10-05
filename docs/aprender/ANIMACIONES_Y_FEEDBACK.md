# Aprender, Racha y Flashcards — integración de animaciones

## Fuente de verdad

Los personajes son **el código del Laboratorio Loki**, no imágenes ni exportaciones.
`LearningArtwork.kt` llama a `LokiTemplate.base(...).withArtStyle(CLASSIC)`, `drawLoki`,
`sampleLoki`, `sampleLokiSequence` y `rememberLokiPlayback`. No duplica rig, caras,
mechones o geometría. Los originales y los archivos de `LOGO/PERSONAJES` se conservan.

Las estrellas y los contadores son `drawLokiReward`, escena `RESULTS`, del laboratorio.
Reciben aciertos, XP de la lección, XP acumulada y estrellas reales; nunca los valores
de demostración de `RewardSettings`. Su adaptación opcional de superficies al tema
deja intacto el aspecto predeterminado del laboratorio.

## Evento → recurso

| Contexto | Implementación |
|---|---|
| Pregunta | Classic Dudoso con movimientos Pensar / Encoger hombros existentes |
| ¿Ya te vas? | Classic `PLEADING`, reloj nativo |
| Ayuda / acierto | Secuencia nativa `ACHIEVEMENT` |
| Resultado de lección | 3 estrellas: Feliz/Enamorado; 2: leer → lanzar → explosión; 0–1: Triste/Enojado. Siempre `RESULTS` con valores reales |
| Racha principal | Classic `STREAK`, con su fuego y expresión originales |
| Cofre | `LOGO/ANIMACION/COFRE.json`, una apertura en popup |
| Tema completo | `LOGO/ANIMACION/TROFEO.json`, una reproducción |
| Fuego principal Racha | `LOGO/ANIMACION/R-MEDIO.json`, loop visible |
| Actividad diaria | Semanal: bolitas existentes en los siete días. Mensual: `LOGO/ANIMACION/R-MINI.json` animado junto al número |
| Audio | Los siete MP3 originales de `LOGO/SONIDOS` |

Gradle sincroniza exclusivamente JSON y MP3 hacia sus assets generados. No empaqueta
personajes PNG/GIF ni copias `.kt.txt`. Los archivos fuente de LOGO no se modifican.
Lottie reproduce los cuatro JSON sin tint ni fondo añadido. Documentación de la librería:
[Lottie Android](https://lottie.airbnb.tech/).

## Reloj y eventos

- Selección recordada por pregunta/modal. Loki, Orstty y Artyon tienen las mismas
  oportunidades; ninguno tiene preferencia. Personaje y emoción se mantienen durante
  la aparición. Máximo dos repeticiones consecutivas cuando existen alternativas.
  Dos estrellas siempre usa explosión: excepción expresamente confirmada por el usuario.
- Lectura: 0,25–1,55 s (1,3 s). Se mapea únicamente ese intervalo al clip original.
  Lanzamiento: 1,55–2,10 s. Explosión nativa: desde 2,08 s, cuando `paperGag.blast`
  supera el umbral visible. El audio se dispara una vez con ese mismo estado visual.
  Duración total: 5,1 s. El rig y la secuencia original de 6,8 s del laboratorio no cambian.
- Los estados de personaje repiten; explosión, logro y resultados son finitos.
  El reloj del laboratorio respeta el ciclo de vida; Lottie pausa fuera de pantalla.
- Un único dueño de MediaPlayer activo evita audio superpuesto entre componentes.
  Eventos específicos tienen prioridad sobre OPCIONES; identificadores de evento
  evitan repeticiones por recomposición. Los sonidos finitos terminan al navegar y
  liberan su reproductor; el segundo plano detiene el dueño activo.
- LEVELUP depende de una comparación real de niveles. Si coincide con tema completo,
  se escucha después de la celebración, al continuar.
- Cofre llama a `claimTopicReward` y muestra el XP retornado. No hay otro gestor de XP.
  Las partículas aparecen una sola vez al avanzar la apertura, y la recompensa queda
  reclamada aunque se cierre pronto. La misma recompensa no se puede cobrar dos veces.
- Trofeo solo aparece al pasar de tema incompleto a todas sus lecciones jugables
  completadas. No se dispara por cada lección ni por repetir una ya completada.

## Temas y tamaño

Las superficies usan la paleta RASTRO. Loki sobre oscuro usa `surfaceAccent` detrás;
sus colores, ojos y partes no cambian. Teoría estructurada/dinámica y popup previo
usan texto principal/secundario, acento y bordes semánticos. Acierto/error mantienen
contenedores verdes/rojos con texto contrastado; botones escogen negro o blanco según
luminancia. Las tarjetas de resultado del laboratorio aceptan la paleta real.

Nodos +15 % aproximadamente, trazo proporcional, pulso 1–1,07 solo en nodo actual.
Las tarjetas laterales no se amplían.

Flashcards: sin chip REPASO, cada cara usa su contenido actual, tamaño natural con
scroll interno sobre 320 dp, explicación con scroll sobre 90 dp y scroll exterior
para conservar Anterior/Aprendida/Siguiente/Favorito/Reportar/Nueva. El diálogo tiene
altura máxima, no altura mínima fija que obligue a reservar una tarjeta gigante.

## Límites de validación

La primera intervención se validó mediante compilación y pruebas JVM. En la
corrección posterior se generó e instaló un APK de depuración para el recorrido
en dispositivo solicitado expresamente por el usuario. Resultados y límites:
[CORRECCIONES_OBRAS_RACHA_LECCIONES.md](CORRECCIONES_OBRAS_RACHA_LECCIONES.md).
En estas correcciones no se editaron teoría, preguntas, catálogos,
`AprenderRepository`, Geografía ni Firebase.
