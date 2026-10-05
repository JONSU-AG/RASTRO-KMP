# Decisiones de UI de Obras

## 03/10/2026

- Conservar íntegros los textos académicos; resolver el espacio desde el layout.
- Avatar estable y bloque textual con ancho restante. Nombre y rol en líneas separadas evitan compresión horizontal incluso cuando aumenta la fuente.
- Cabecera con wrap y tarjetas de altura natural; interlineado proporcional al tamaño elegido por el lector.
- Usar el acento del tema oscuro para los encabezados de lectura; mantener el color de la obra en los otros temas.
- Seguir compone icono y texto en una única Row centrada, sin alterar su acción.

## 03/10 — Catálogo adaptativo

La lista existente se conserva junto a una vista de portada y título. Ambas llaman al mismo detalle y respetan los filtros. Columnas dependen del ancho de ventana; no cambia contenido académico.

## Portadas — 03/10/2026
Reducir el mínimo a 120 dp en el grid existente: dos o tres portadas en celular según ancho y más columnas en tablet. Reutilizar ObraCoverGraphic y el mismo detalle, sin crear contenido ni portadas nuevas.

## 03/10 — Pastel para orientar la lectura
ObraReadingStyle.kt centraliza los colores de lectura: mezcla leve de surface/accent y ajuste de contraste sobre fondo, superficie y marcador. Esto sustituye los colores fijos de indicadores de lectura y el acento por obra en el contenido; el banner conserva su color y comportamiento.
ObraReadingText conserva cada cadena original. Solo coincide con nombres de personajes y etiquetas cortas de símbolos realmente presentes, por palabras completas; destaca la primera aparición y limita la densidad. No intenta deducir acontecimientos ni generar conclusiones. El marcador redondeado se dibuja detrás del texto según sus líneas medidas; no es un botón ni una tarjeta por párrafo.
ObraReadingNote reutiliza temaPrincipal e icono vectorial local. Los bloques de personajes, trama, símbolos y preguntas mantienen su distribución y adoptan superficies/bordes suaves. Para añadir conceptos, pasar términos semánticos reales a ObraReadingText; nunca modificar el texto académico para insertar formato.

## 03/10 — Altura consistente del listado
La normalización se aplica únicamente a ObraCoverTile/ObraLiterariaCard en BibliotecaScreen.kt: minLines=maxLines para reservar título, ellipsis y metadata de una línea. No truncar las cadenas del modelo ni alterar la vista completa de Obras.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## Auditoría 04/10: obras individuales

LiteraturaRepository activa 48 fichas. ObrasIndividuales2027.kt reutiliza autores/modelo y separa colecciones, sin alterar IDs guardados de la primera obra. Nuevos títulos individualizados en COMPLEMENTOS_TEMARIO_2027.md, con fuentes BNP/UNMSM/Casa de la Literatura. Archivos antiguos conservados, no desplegados como fichas agrupadas. No se inventaron portadas/assets. Solo el banner queda fijo: título, ficha, tabs y lectura comparten scroll. Clave se retira de etiquetas visibles, sin renombrar campos persistidos del modelo. Selector Listado/Portadas muestra check y color activo.

AddObraDialog elige archivos localmente y sube después de Guardar, evitando subir al abrir/cancelar selección; lee bytes en IO, respeta MIME real y limita resolución de preview local. Reintentar un fallo de escritura conserva URLs ya obtenidas. Drive externo no se elimina por cancelar la publicación tras haber guardado/subido; no se promete limpieza remota no implementada.
