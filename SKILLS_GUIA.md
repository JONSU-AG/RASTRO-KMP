# 🧭 GUÍA DE SKILLS DEL PROYECTO RASTRO KMP

> **Ubicación local:** Todas estas habilidades residen directamente dentro de la carpeta del proyecto en `.agents/skills/`. Cualquier editor o entorno con soporte para agentes de IA (Antigravity, Cursor, Claude Code, etc.) las detectará y cargará automáticamente.

## CodeGraph — análisis local de dependencias

- **Herramienta oficial:** [colbymchenry/codegraph](https://github.com/colbymchenry/codegraph).
- **Skill del proyecto:** [.agents/skills/codegraph/SKILL.md](.agents/skills/codegraph/SKILL.md). Adaptación local; el repositorio upstream distribuye una CLI/MCP, no una skill de uso independiente.
- **CLI instalada:** `.agents/tools/codegraph/node_modules/.bin/codegraph.cmd` (versión 1.6.2, lockfile local).
- **Uso:** `explore` para localizar implementaciones y llamadas, `impact` para comprobar dependencias; `status`/`sync` para revisar el índice de `.codegraph/`.
- La CLI puede usarse inmediatamente. La skill queda disponible para descubrimiento en el siguiente turno; no hace falta esperar para leerla y aplicarla directamente.

## Simulador, Ligas y Examen Ranking

[SIMULADOR_LIGAS_PARA_IA.md](SIMULADOR_LIGAS_PARA_IA.md) conecta modelos/configuración, motor reutilizado, intentos/elegibilidad, ranking real, arte SVG y futura extensión de vídeos. Detalles y comprobaciones en [docs/simulador](docs/simulador/README.md). Skills aplicadas: CodeGraph (obligatoria), Cartoon UI y Bouncy (contornos/biseles), Vector Animations (vectores nativos y Classic), Material3 (contraste/adaptación con paleta RASTRO) y Firebase Performance (páginas de 25, conteo y transacciones). No dependencias pesadas de producción.

## Contenido de ejercicios interactivos

[APRENDER_EJERCICIOS_PARA_IA.md](APRENDER_EJERCICIOS_PARA_IA.md): modelos, JSON y conexión existente para Relacionar (`MATCH_PAIRS`) y Completar teoría (`FILL_BLANK`). No crear un motor alternativo ni introducir preguntas sin validar sus fuentes. En esta intervención se aplican CodeGraph, Cartoon UI, Vector Animations y contraste/adaptación Material3; los botones físicos existentes conservan sus microinteracciones.

## Skills para recompensas y adaptación de las pantallas principales

| Skill | Aplicación en el pedido del 03/10/2026 |
|---|---|
| `codegraph` | Reutilizar XP, cofres, reportes, navegación y renderer Classic existentes; comprobar impactos. |
| `compose-playful-cartoon-ui` | Mantener biseles, contornos y estilo de los botones, ligas y recompensas. |
| `compose-bouncy-microinteractions` | Respuesta física al toque y recepción visible de XP. |
| `compose-vector-animations` | XP viajando al nivel, estrellas y personajes animados, velocidades por contexto. |
| `compose-material3-google` | Contraste, tipografía, controles y composición según el ancho disponible. |
| `firebase-scalability-and-performance` | Listeners con ciclo de vida, consultas limitadas y reutilización del guardado de XP/reportes. |

Las guías se aplican según su ámbito. Para este pedido se conserva el estilo Cartoon actual; no se introduce Glassmorphism ni una auditoría de seguridad general. Las animaciones de personajes siguen siendo el rig Classic de código, no imágenes nuevas.

---

## 🛡️ 1. `security-audit` (Oficial de Cloudflare)
- **Repositorio:** [cloudflare/security-audit-skill](https://github.com/cloudflare/security-audit-skill)
- **Ubicación:** `.agents/skills/security-audit/`
- **¿Para qué sirve?**
  Realiza auditorías de seguridad defensivas y revisiones profundas de vulnerabilidades en el código fuente, APIs, bases de datos (Firebase/Firestore) y endpoints. 
- **Flujo de 6 Fases:**
  1. *Reconocimiento (Reconnaissance):* Mapeo de arquitectura y límites de confianza.
  2. *Caza guiada por cobertura (Coverage-led Hunting):* Búsqueda metódica con registro de cobertura.
  3. *Validación adversaria (Candidate Validation):* Un sub-agente independiente intenta refutar cada candidato a vulnerabilidad.
  4. *Salida estructurada (Structured Output):* Generación de hallazgos verificables (`findings.json`).
  5. *Verificación independiente (Record Verification):* Doble chequeo riguroso de evidencia.
  6. *Informe Neutral (Target-Neutral Reporting):* Reporte con severidad calibrada (Critical, High, Medium, Low) y la solución más pequeña y efectiva en el código.
- **¿Cómo usarla?**
  Pídele al agente: *"Ejecuta una auditoría de seguridad en la autenticación y las reglas de Firestore usando security-audit"*.

---

## 🎨 2. `compose-material3-google`
- **Ubicación:** `.agents/skills/compose-material3-google/`
- **¿Para qué sirve?**
  Implementa las directrices oficiales de **Material Design 3 (M3)** de Google en Jetpack Compose y Compose Multiplatform.
- **Puntos clave:**
  - Roles estrictos de color con contraste WCAG garantizado (evita textos claros sobre fondos amarillos o claros).
  - Elevación tonal (sombras modernas mediante tinte de color en vez de sombras oscuras pesadas).
  - Escalas tipográficas adaptativas.

---

## 🍎 3. `compose-glassmorphism-ios`
- **Ubicación:** `.agents/skills/compose-glassmorphism-ios/`
- **¿Para qué sirve?**
  Recrea el efecto **Glassmorphism / Frosted Glass** de Apple iOS en Compose.
- **Componentes que genera:**
  - Fondos translúcidos con gradiente vertical (`alpha = 0.70 - 0.85`).
  - Borde especular (línea de 1.dp con degradado luminoso para simular el reflejo de la luz en el cristal).
  - Esquinas suaves continuas (`RoundedCornerShape(24.dp)` a `32.dp`).

---

## 🐥 4. `compose-bouncy-microinteractions` (Estilo Duolingo & Apple)
- **Ubicación:** `.agents/skills/compose-bouncy-microinteractions/`
- **¿Para qué sirve?**
  Sustituye el clásico "ripple" plano de Android por físicas reales de resorte (`spring()`).
- **Comportamiento:**
  - El botón o tarjeta se **hunde físicamente** al ser presionado (`scale = 0.90f - 0.94f`).
  - Al soltarlo, rebota elásticamente a su posición original.
  - Se activa retroalimentación háptica instantánea (`LocalHapticFeedback`) al tocar.

---

## ⚡ 5. `compose-vector-animations`
- **Ubicación:** `.agents/skills/compose-vector-animations/`
- **¿Para qué sirve?**
  Agrega micro-animaciones continuas e interactivas a iconos vectoriales SVG (`.xml` / `ImageVector`) sin necesidad de librerías pesadas como Lottie.
- **Ejemplos:**
  - `rememberBreathingPulse`: Pulso suave y constante para badges, rachas o puntos de estado activo.
  - Sacudida o balanceo (*wiggle*) para mascotas y avatares al interactuar.

---

## 🎨 6. `compose-playful-cartoon-ui` (Estilo Sticker 3D & Neubrutalismo Lúdico)
- **Ubicación:** `.agents/skills/compose-playful-cartoon-ui/`
- **¿Para qué sirve?**
  Rige la estética de dibujo/sticker no-plano utilizada en apps educativas de alta interacción:
  - **Cero botones planos**: Botones con **bisel inferior sólido 3D de 4.dp** (`Sticker3dButton`) que se hunden físicamente al tocarlos.
  - **Trazo contorneado (Sticker Stroke)**: Bordes definidos de `1.5.dp` a `2.dp` en negro o colores oscuros de alto contraste.
  - **Sombras duras y limpias**: Sin sombras difuminadas borrosas, logrando un aspecto de calcomanía física o viñeta de cómic.
  - **Tarjetas y Diálogos con Squircle**: Superficies amigables con bordes nítidos y sin popups genéricos de sistema.

## Acabado cartoon y SVG del camino
CodeGraph y las skills compose-playful-cartoon-ui/compose-vector-animations se aplicaron al acabado reutilizable y los recursos nativos. Guía de extensión: [APRENDER_ACABADO_SVG_PARA_IA.md](APRENDER_ACABADO_SVG_PARA_IA.md).

## Cursos y playlists — 04/10/2026
[docs/cursos/README.md](docs/cursos/README.md): vistas, publicación opt-in, aislamiento por cuenta, API YouTube paginada y alternativa IFrame oficial, configuración/límites y verificaciones pendientes. Skills: CodeGraph, Compose Playful Cartoon UI y Firebase Scalability. Sin despliegue ni ejecución de app.

## 04/10 — Widgets, monedas, reproductor y test vocacional
CodeGraph + Compose Playful Cartoon UI + Playstore Policy (revisión puntual YouTube). Continuación: docs/ui-principal/WIDGETS.md (ilustración/launcher real), docs/cursos/README.md (IFrame y requisitos), docs/aprender/DECISIONES.md (10 monedas/estrella única y resultado sin scroll), docs/vocacional/README.md (Mini-IP original30, licencia, modelos/escala/carreras). No cambiar fuentes PNG/personajes ni catálogos académicos. No usar app/device para validar en esta intervención.

## Auditoría y complementos 04/10/2026

CodeGraph usado para delimitar símbolos/carga (build/audit-codegraph-lesson.log), confirmado con código real. También Compose Cartoon/Material3, Firebase, seguridad enfocada y Play Store. No se aplicó un rediseño global ni se inventaron assets.

- docs/aprender/COMPLEMENTOS_TEMARIO_2027.md: 50 ampliaciones de teoría y 48 obras individuales.
- docs/aprender/VALIDACION_CATALOGO_2027.md: errores heredados, sin ocultarlos.
- docs/publicacion/ELIMINACION_CUENTA.md: dos rutas UI, limpieza Auth en servidor y pruebas/despliegue pendiente.
- docs/publicacion/VERIFICACIONES_PROPIETARIO.md: firma/OAuth/Drive, Data Safety, dispositivo y fuente académica.
- docs/pizarra/: presupuesto de memoria, límites y ciclo de vida.
- CHECKLIST_GOOGLE_PLAY.md: estado real; app no ejecutada, no commit/push.
