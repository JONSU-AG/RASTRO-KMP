# Cambios — web

## 09/10/2026 — proyecto inicial aislado

Configuración web independiente, fuentes comunes leídas directamente, Inicio preliminar y ejercicio de Filosofía con resultado animado. EarnedStars reutilizada directamente de LearningRewards.kt de Android sin editar ese archivo. Controles con bisel y respuesta spring. Manifest PWA, caché de recursos públicos y aviso Android cerrable. Android/shared/settings/versions no editados.

Validación de compilación y navegador: registrar resultado real en CHECKLIST. No se ejecutó Android.

Primera distribución Wasm generada correctamente: BUILD SUCCESSFUL, 26 tareas, build/web-compose-pilot.log. Advertencias de tamaño webpack: Skiko ~8 MiB, aplicación Wasm ~2 MiB, JS ~570 KiB. No equivalen a tiempos de carga medidos. Ajuste posterior de semántica de botones todavía requiere recompilación. No se comprobó en navegador ni iPhone. El propietario pidió priorizar una copia fiel de Kotlin; prompt de traspaso detallado preparado en la raíz, sin usar React ni editar el original.
