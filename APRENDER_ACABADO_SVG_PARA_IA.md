# Acabado cartoon y símbolos del camino

Se mantiene el camino, navegación, catálogo y recompensas existentes. No rediseñar personajes Classic.

## Componentes

- `shared/.../theme/CartoonFinish.kt`: contorno 2 dp, capa sólida 4 dp (compacta 3 dp), radios 24/18 dp, colores semánticos dorado/coral/verde. `RastroTheme.kt` da superficies marfil al tema claro y cálido; los otros temas conservan sus tokens.
- `androidApp/.../ui/components/AnimationModifiers.kt`: los componentes Sticker existentes usan el contorno común y capas desplazadas, sin añadir sombras difuminadas. Mantener el hundimiento físico existente.
- `LearningProgressHud.kt`: tarjetas compactas (ancho total máximo 720 dp), etiqueta secundaria, barra XP; Vidas abre información usando `recoveryAmount`, `recoveryUnit` y `maxHearts` reales. No crea otra recarga ni otorga vidas.
- `LearningTrail.kt`: cabecera horizontal con icono, chip Tema, título y progreso. No se añadieron controles de expansión que no existían.

## SVG locales y licencia

114 ilustraciones en `androidApp/src/main/assets/trail/*.svg`; las copias nativas Android están en `androidApp/src/main/res/drawable/trail_*.xml`. No se cargan desde Internet ni se incorpora una librería SVG.

Fuente: [Lucide](https://github.com/lucide-icons/lucide), revisión fija `500620a2e8123f8d1db191538886dc0c223f69a9`. ISC y MIT para derivados Feather: texto completo en `assets/trail/LICENSE.txt`, procedencia y grupos en `SOURCE.json`. Conservar esos avisos al distribuir. Adaptación: trazo charcoal de 2.4 unidades, extremos y uniones redondeados, viewport 24. Los nodos conservan sus superficies de color y estado.

## Asignación estable

`shared/.../model/TrailIllustrations.kt` ofrece `candidates`, `resolve`, `resolvePath`. Busca palabras del título/subtema (acentos normalizados), luego la familia de materia; finalmente usa genéricos para materias desconocidas. El ID, materia, semana, subtema y profundidad eligen determinísticamente dentro de esa familia. `resolvePath` evita repetir el símbolo anterior si hay alternativas compatibles. No usa aleatoriedad, estrellas ni disponibilidad. Mantener el orden del catálogo.

`TrailIllustrationResources.kt` relaciona claves SVG con `R.drawable`; `TrailIllustration` es el único renderer. Un nodo actual conserva dibujo y pulso; completado añade estrellas/check; bloqueado atenúa dibujo y muestra candado. No se aplica un candado a nodos simplemente disponibles. Cofres/trofeos mantienen su recurso especial existente.

## Agregar símbolos o asignar un nivel

1. Para una identidad editorial exacta, añadir `"id_real_de_leccion" to "dna"` a `TrailIllustrations.overrides`. Usar una clave existente. No editar preguntas ni inventar niveles. Los overrides explícitos tienen prioridad; evitar overrides consecutivos iguales.
2. Para un tema nuevo, añadir palabras y una familia compatible a `topicPools`; para materia nueva, `subjectPools`. Las palabras más específicas deben ir primero.
3. Para un SVG nuevo de Lucide, añadir su nombre vigente a `tools/trail/generate_assets.py`. El script está fijado a la revisión documentada: requiere Python y red solo durante desarrollo, crea SVG/XML/mapa; valida que exista. No cambia catálogos. Ejecutar `python tools/trail/generate_assets.py` desde el proyecto. Si se cambia la revisión, revisar licencia y compatibilidad de todos los recursos.
4. Si es un SVG propio, guardar original local, convertir sus formas a VectorDrawable con igual trazo/viewport y registrar la clave en el mapa. Mantener ilustraciones simples legibles a 30 dp. Documentar procedencia/licencia.
5. Compilar Kotlin y ejecutar `TrailIllustrationsTest`; comprobar SVG/XML y que todas las claves del resolver existan. No ejecutar dispositivos ni generar APK sin instrucción del usuario.

Validación de esta intervención: compilación Android Kotlin, pruebas del resolver, recuperación de vidas y piloto académico; revisión visual en dispositivos pendiente.

## Corrección responsive/semántica 03/10
El HUD mide texto/ancho/fuente, reserva mínimos y prioriza XP; icono arriba cuando falta espacio, dos filas solo si fuentes grandes no caben. TopicHeading ahora es compacto. Biología utiliza biologyPools priorizados por título, luego subtema, con fallback microscope/circle-dot. No restaurar el fallback con peces/aves para cualquier lección. Prueba con catálogo real de Semana 10 en TrailIllustrationsTest. Detalle en docs/aprender/CAMBIOS.md.

## Ajuste posterior — altura común del HUD
Sustituye la variante anterior con iconos arriba: icono junto al dato, etiqueta/XP debajo, altura común base 48 dp con lineHeight explícito y ajuste uniforme por fuentes grandes. Barra XP ocupa espacio reservado dentro de la misma cara. Nunca volver a tres líneas para compactar ancho. Los accesos del Simulador son FlowRow de botones cortos; ver docs/simulador/CAMBIOS.md.
