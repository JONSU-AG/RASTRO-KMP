# AGENTS.md — Reglas Generales para Agentes IA en RASTRO KMP

> Este documento establece las reglas inquebrantables para cualquier agente IA que trabaje en este repositorio.

---

## 1. Principio de Ámbito (Scope Rule)

**Una IA NO obtiene permiso para modificar todo RASTRO simplemente porque puede leer todo el repositorio.**

### Obligatorio para cada intervención:
1. Leer `MAPA_PROYECTO_KMP.md` (mapa global)
2. Leer documentación del módulo afectado (`docs/aprender/`, `docs/aprender/biologia/`)
3. Revisar `CHECKLIST.md` del módulo
4. Comprobar código real (`shared/.../data/catalog/`, `androidApp/.../ui/screens/`)
5. Comprobar Git (`git status`, `git diff`, `git log --oneline -5`)
6. **Declarar su ámbito explícitamente** antes de tocar código
6. Tocar **solamente** su ámbito declarado
7. Validar (CatalogValidator, AcademicSanitizer, tests)
6. Actualizar documentación del módulo (`CHECKLIST.md`, `DECISIONES.md`, `CAMBIOS.md`)
7. Detenerse donde indique la tarea

---

## 2. Prohibiciones Absolutas

| Acción | Por qué |
|--------|---------|
| Ejecutar la aplicación (emulador/dispositivo) | Usuario lo prohíbe explícitamente |
| Migrar Semanas 1–7 (legacy) | Deben seguir funcionando sin cambios |
| Crear 8.2, 8.3, 8.4, Semana 9+ | Solo piloto 8.1 en esta intervención |
| Modificar otras materias (Química, Física, etc.) | Aislamiento por materia obligatorio |
| Rediseñar UI (LessonEngineScreen, AprenderScreen, etc.) | Fuera de ámbito |
| Reorganizar navegación / Firebase / Gamificación | Sistemas ajenos |
| Borrar archivos / limpiar `basura/` | Protegido |
| Cambiar temario / inventar títulos | Fidelidad al temario UNSA |
| Introducir arquitectura compleja innecesaria | Solución simple y robusta |

---

## 3. Regla de Aislamiento del Conocimiento

Un agente que trabaja **Biología** necesita cargar únicamente:
- Reglas globales (`AGENTS.md`)
- Arquitectura de Aprender (`docs/aprender/ARQUITECTURA.md`)
- Documentación de Biología (`docs/aprender/biologia/`)

**NO necesita** cargar conocimiento de: Cursos, Biblioteca, Simulador, Pizarra, Perfil, Loki Lab, etc.

---

## 4. Regla de Fallo Local (FAIL LOCAL)

Si `Biología / Semana 8 / 8.1 / questions` está corrupto:
- El sistema **DEBE** fallar claramente dentro del ámbito afectado
- **NO** debe usar preguntas de otra materia
- **NO** debe usar preguntas de otra semana
- **NO** debe usar contenido aleatorio como fallback
- **NO** debe contaminar otro catálogo

> **FAIL LOCAL. NO CONTAMINATE GLOBAL.**

---

## 5. Regla de Validación Obligatoria

Antes de considerar una tarea completada:
1. `CatalogValidator.validateCatalog()` → 0 errores, 0 advertencias
2. `AcademicSanitizer.hasUnrelatedStemContamination()` → false
3. Tests relevantes pasan (`CatalogPilotValidationTest`, etc.)
4. `git diff` revisado — ningún archivo ajeno modificado

---

## 6. Documentación Viva

Cada módulo mantiene su propia documentación viva en `docs/<modulo>/`:
- `README.md` — qué es y cómo funciona
- `ARQUITECTURA.md` — cómo se conectan las piezas
- `CHECKLIST.md` — estado REAL actual (hechos comprobados, no intenciones)
- `DECISIONES.md` — decisiones duraderas (formato, ubicación, por qué)
- `CAMBIOS.md` — historial breve de intervenciones

> **NO** copies ejemplos automáticamente. Marca `[x]` **solo cuando realmente lo comprobaste**.

---

## 5. Flujo de Trabajo Estándar

```
FASE 1 - AUDITORÍA    → leer mapa, docs, Git, código, fuentes
FASE 2 - DISEÑO       → decidir formato, ubicación, loader, granularidad, validación
FASE 3 - DOCUMENTACIÓN → crear/adaptar MDs base + CHECKLIST/DECISIONES/CAMBIOS
FASE 4 - INFRAESTRUCTURA → loader mínimo, modelos, validación
FASE 5 - PILOTO       → crear contenido piloto (solo 8.1)
FASE 6 - VALIDACIÓN   → identidad, aislamiento, CatalogValidator, tests
FASE 7 - DIFF REVIEW  → git diff → ningún archivo ajeno modificado
FASE 7 - DOC FINAL    → actualizar CHECKLIST, DECISIONES, CAMBIOS
```

---

## 7. Compilación

- NO es obligatorio ejecutar la app en esta intervención
- Si compilas: `compilar_app.bat` (solo `assembleDebug`, sin lanzar app)
- NO modifiques archivos fuera del ámbito para forzar build limpio si el error es ajeno

---

## 6. Contacto / Escalación

Si encuentras:
- Error preexistente ajeno → documenta en `CAMBIOS.md` y DETENTE
- Ambigüedad en ámbito → pregunta al usuario antes de continuar
- Bloqueo técnico en ámbito propio → documenta y propone alternativa

---

> **Última actualización:** 2026-09-28 — Primera intervención OpenCode
> **Versión:** 1.0