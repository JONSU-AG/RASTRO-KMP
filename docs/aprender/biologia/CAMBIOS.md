# CAMBIOS.md — Historial de Intervenciones (Biología)

> Registro breve de intervenciones. Formato: **Fecha | Agente/Modelo | Objetivo | Archivos creados/modificados | Validación | Estado | Siguiente paso**.

---

## 2026-09-28 | OpenCode (Primera Intervención)

### Objetivo
Establecer arquitectura modular para contenido académico reparable por piezas, comenzando con piloto **Biología 8.1**.

### Archivos Creados
| Archivo | Tipo | Descripción |
|---------|------|-------------|
| `AGENTS.md` | Raíz | Reglas generales para agentes IA (ámbito, prohibiciones, validación) |
| `docs/aprender/README.md` | Doc | Qué es Aprender, arquitectura, modelos, catálogos, validación |
| `docs/aprender/ARQUITECTURA.md` | Doc | Diseño loader, granularidad, identidad, convivencia legacy/nuevo, validación |
| `docs/aprender/biologia/README.md` | Doc | Estado Biología (semanas 1–13), piloto 8.1, fuente canónica |
| `docs/aprender/biologia/CHECKLIST.md` | Doc | Estado granular por lección (semanas 1–13, detalle 8.1) |
| `docs/aprender/biologia/DECISIONES.md` | Doc | Decisiones: formato, ubicación, granularidad, IDs, legacy/nuevo, aislamiento, source lock 8.1 |
| `docs/aprender/biologia/CAMBIOS.md` | Doc | **Este archivo** |

### Archivos Modificados (Existentes)
| Archivo | Cambio |
|---------|--------|
| `MAPA_PROYECTO_KMP.md` | Actualizado §0 (commit 1d01b6b), §2 (nuevo paquete validation + 25 components), §3 (validation package) |

### Validación
| Check | Resultado |
|-------|-----------|
| `git status` limpio (solo docs nuevos + MAPA) | ✅ |
| Sin cambios en código funcional | ✅ (solo docs + MAPA) |
| Sin tocar código de otras IAs (AprenderScreen, etc.) | ✅ |
| Sin tocar UI, Firebase, Gamificación, otras materias | ✅ |
| Compilación teórica (`compilar_app.bat`) | ⏳ Pendiente (no ejecutado por instrucción) |

### Estado
**Documentación base creada** — Listo para Fase 4 (Infraestructura mínima) y Fase 5 (Piloto 8.1).

### Siguiente Paso
**Fase 4**: Crear infraestructura mínima (`ContentLoader`, `JsonContentLoader`, `ContentIdentityValidator`, modelos) en `shared/.../data/content/`.

---

## Próximas Entradas (Plantilla)

```markdown
## YYYY-MM-DD | Agente/Modelo

### Objetivo
...

### Archivos Creados
| Archivo | Tipo | Descripción |
|---------|------|-------------|
| ... | ... | ... |

### Archivos Modificados
| Archivo | Cambio |
|---------|--------|
| ... | ... |

### Validación
| Check | Resultado |
|-------|-----------|
| ... | ... |

### Estado
...

### Siguiente Paso
...
```