# Piloto temporal — Fondo académico (04/10/2026)

## Activar
Con sesión Admin autenticada y no anónima, abrir el selector de temas de la barra superior y activar **Fondo académico**. Apagar el mismo switch devuelve inmediatamente el fondo habitual. Solo memoria de la sesión/proceso, desactivado tras reinicio; no se escribe en preferencias/Firebase. El estado guarda el UID Admin: otra cuenta no hereda la activación. Los usuarios normales no ven opción ni patrón aunque exista una activación anterior. Reutiliza ThemeManager y el mismo criterio AdminConfig de los controles Admin existentes; no agrega tema/color scheme ni roles.

## Ámbito
Piloto únicamente en fondos base de Inicio, Aprender (principal), Cursos, Biblioteca (incluidas sus pestañas), Simulador y Perfil. Sin cambios a lecciones, detalles de obras, navbar, tarjetas, personajes o catálogos. El contenido se dibuja encima y el fondo permanece fijo al desplazar las listas. La variante se añade mediante rastroAcademicBackground; cuando está apagada ejecuta el mismo background existente (en Inicio, que heredaba el fondo, devuelve el Modifier sin añadirlo).

## Implementación
- shared/.../theme/RastroTheme.kt: ThemeManager.setAcademicBackgroundPilot / isAcademicBackgroundPilotEnabledFor.
- androidApp/.../ui/RastroApp.kt: misma autorización autenticada/no-anónima + AdminConfig.isAdmin; CompositionLocalProvider y callback del selector.
- ui/components/BannersAndModals.kt: switch únicamente si showAcademicBackgroundPilot=true; selector normal idéntico.
- ui/components/AcademicBackground.kt: LocalAcademicBackgroundPilot por defecto false; distribución determinista en dp (símbolos ~24 dp, separación86 dp, filas alternadas y pequeñas variaciones). 14 dibujos lineales propios: libro, lápiz, regla, escuadra, foco, átomo, matraz, estrella, hoja, birrete, radical, sigma, x² y trazos matemáticos. Sin assets externos/personajes.
- Modifier recordado con remember por los colores relevantes; recomponer contadores/contenido no recrea su bloque. drawWithCache crea un único Path agregado solo al cambiar tamaño/densidad/paleta. Draw: fondo + Path; trazo redondeado .9 dp. No posiciones aleatorias por recomposición ni trabajo animado por frame, bitmaps, blur, sombras o cientos de composables. El contenido puede volver a invalidar dibujo, pero no obliga a reconstruir la geometría cacheada.
- Tinta lerp(background,textPrimary,.075 claro/.085 oscuro): mezcla de contraste muy bajo, también temas personalizados/dinámicos. No depende de un negro/blanco fijo. Las tarjetas opacas y textos permanecen por encima.

## Evidencia automática y límites
AcademicBackgroundTest: 5 pruebas (no filtrar a no-admin/otras cuentas, activación sin cambiar tema, distribución determinista y límites, móvil/tablet/orientaciones/densidades, tinta de todas las paletas). compileDebugKotlin y tests correctos: build/academic-background-tests.log. Regresión de catálogo: build/academic-background-catalog.log.

Esto NO mide FPS, GPU, memoria real del dispositivo ni verifica capturas. AGENTS.md prohíbe ejecutar app/emulador/dispositivo; no se realizó ese paso. No afirmar coste cero o ausencia de recomposiciones sin perfilar. No dependencias nuevas, commit/push ni datos académicos editados.

## Validación manual posterior (Admin)
Comparar OFF/ON en la misma pantalla, datos y scroll:
- [ ] Móvil pequeño/grande, tablet; vertical/horizontal: doodles siempre pequeños, cantidad según espacio y sin cortes notorios.
- [ ] Claro, oscuro/AMOLED y colorido/personalizado: legibilidad de tarjetas, texto y controles; textura casi invisible a primera vista.
- [ ] Cambiar tamaño/orientación recalcula solo la geometría necesaria; mover scroll no mueve la textura.
- [ ] Layout Inspector: comparar contadores de recomposición al dejar pantalla quieta y al hacer scroll; switch/tema/tamaño sí deben invalidar.
- [ ] Profiler CPU/memoria + frame timing: mismos recorridos OFF/ON, dispositivo y build; observar jank, allocations y GC; no confundir coste de otros contenidos/mascotas con el patrón.
- [ ] Salir de Admin/cambiar a usuario normal: opción oculta y fondo previo, sin persistencia de variante.
- [ ] Activar/desactivar varias veces: retorno inmediato, sin vistas/cachés acumulándose.

## Retirar fácilmente
Eliminar el switch/parámetros del selector, provider de LocalAcademicBackgroundPilot, miembros de ThemeManager y AcademicBackground.kt/test. Restaurar .background(theme.background) en los cinco fondos que ya lo tenían y quitar el modifier extra de Inicio. No borrar otros cambios de esos archivos ni revertir archivos completos: contienen trabajo previo. No necesita migración, limpieza de base de datos ni borrar assets.
