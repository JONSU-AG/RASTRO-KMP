# Historial de Cambios — Biblioteca → Obras

## Intervención Reparación de Compilación (2026-09-28)
- **Causa raíz identificada**:
  1. Los archivos `Obra05Hamlet.kt` a `Obra17PedroParamo.kt` tenían importaciones hacia el paquete incorrecto `com.jonsuapps.rastro.data.*` en lugar de `com.jonsuapps.rastro.model.*`.
  2. Todos los archivos generados de la `Obra05Hamlet.kt` a la `Obra40Ollantay.kt` utilizaban el parámetro `siglo` e incluían `lecturaMinutos`, los cuales no pertenecen a la data class `ObraLiteraria` en `LiteraturaModels.kt`.
  3. Faltaban los campos requeridos `anio` y `pais` (y en `Obra05` a `Obra17` faltaba `colorHex`).
- **Acción ejecutada**:
  - Se corrigieron los imports a `com.jonsuapps.rastro.model.*`.
  - Se mapeó `siglo` a `anio`, conservando los rangos cronológicos.
  - Se eliminó la propiedad extra `lecturaMinutos`.
  - Se asignaron los países correspondientes (`pais`) y esquemas de color (`colorHex`).
- **Resultado**:
  - Los 40 archivos de `shared/src/commonMain/kotlin/com/jonsuapps/rastro/data/obras/` y `LiteraturaRepository.kt` compilan limpios sin ningún error.
  - Las 40 obras están verificadas e integradas.

## 03/10/2026 — UI responsive de Obras y Aportes

- Cambios locales en ObraDetailView.kt y botón Seguir de BibliotecaScreen.kt; ningún contenido académico modificado.
- Avatar estable y bloque de texto con ancho restante: nombre, rol y descripción en líneas naturales. Tema completo, cabecera con wrap, títulos de sección y preguntas con peso de ancho; interlineado acompaña la fuente y acentos respetan el tema oscuro.
- Seguir: icono y texto en Row centrada con separación única.
- Comprobado en teléfono: Aquiles/Odiseo, roles largos, Trama; Cálido/Oscuro y lectura ampliada a 17 sp. Seguir observado sin activar seguimiento.
- Build final y tres pruebas de políticas pasaron. No se verificaron individualmente las 40 obras ni todos los tamaños de dispositivo.

## 03/10 — Lista y portadas

Biblioteca permite alternar lista detallada / portadas. Materiales, publicaciones y obras usan columnas según ancho; previews conservan proporción sin alto fijo. Build/pruebas JVM comprobados; revisión visual de los cambios nueva pendiente.

## 03/10 — Portadas compactas

Grid de portadas con mínimo 120 dp para dos o tres columnas en celular según ancho y más en tablet/horizontal. No modifica títulos, imágenes, resúmenes ni detalle de obras. Compilación comprobada; revisión visual pendiente, sin ejecutar app.

## 03/10 — Lectura con jerarquía pastel ligera
Ámbito: renderizado de contenido de ObraDetailView y estilos reutilizables ObraReadingStyle. Sin cambios en banner, editor, navegación, pestañas, fuentes académicas ni catálogos. Se conserva la estructura encontrada al iniciar esta intervención y las modificaciones previas.
Añadidos énfasis semibold y marcador puntual, nota de Tema principal con vector local y superficies/bordes de lectura derivados del tema. Contraste calculado para texto normal y acentos; temas oscuros mantienen superficies oscuras tintadas.
Validación: compileDebugKotlin y cuatro ObraReadingStyleTest correctos; CatalogPilotValidationTest correcto (validación de catálogo y contaminación existentes). Registros build/obra-reading-tests.log y reportes JVM. Sin ejecutar la app ni generar APK; comprobación visual pendiente.

## 03/10 — Simetría de previews
ObraCoverTile reserva exactamente tres líneas de título con ellipsis y mantiene misma zona de portada/espacios. ObraLiterariaCard reserva dos líneas de título y una de categoría, autor y ficha. Así los títulos extensos no aumentan la altura del listado/grid. No cambia contenido real ni detalle de lectura. Kotlin compila; revisión visual física pendiente. Cambios adicionales del visor Perfil/Aportes documentados en docs/ui-principal.

## 04/10 — Auditoría de estabilidad y cambios solicitados
Correcciones en curso: crash del parser de Completar comprobado por Logcat, carga IO y fallo local, caché de catálogo, restauración preparada fuera de Main, navegación/back y respuestas Ranking obsoletas. Obras tiene una única zona de scroll debajo del banner y selector de vistas con estado contrastado. Temas conserva preferencias existentes, Material You medio pasa a default y fondo académico es opcional para todos. Pizarra limita memoria/undo, conserva buffer antes de asignar y mediante ViewModel al rotar.
Estado y evidencias vigentes: ../../../CHECKLIST_GOOGLE_PLAY.md (desde Obras), ../../CHECKLIST_GOOGLE_PLAY.md (desde módulos generales). Validación física pendiente; app no ejecutada.

## 04/10 — Cierre local de auditoría

Kotlin debug/release y R8 compilan; 185 pruebas shared y 100 Android pasan. No se ejecutó la app. Crash Completar identificado en Logcat y parser compartido corregido; IO/caché, navegación, Ranking y Pizarra corregidos en su ámbito. Estado físico/externo separado en CHECKLIST_GOOGLE_PLAY.md; no se equipara compilación a prueba en dispositivo. Los complementos académicos conservan incidencias **heredadas** del banco: detalle en docs/aprender/VALIDACION_CATALOGO_2027.md. No commit/push/cambio de versión.
