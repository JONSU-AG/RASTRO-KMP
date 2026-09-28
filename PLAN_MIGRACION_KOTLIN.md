# 🗺️ PLAN DE MIGRACIÓN DETALLADO: React/Vite → Kotlin Multiplatform (KMP)

> **Fecha:** 2026-09 | **Prioridad:** Funciones primero. UI secundaria.

> **Actualización 26/09/2026:** La tabla siguiente es el diagnóstico inicial; no refleja por sí sola el estado actual. Esta migración debe reutilizar los datos, servicios y comportamientos de React, no reemplazarlos con pantallas estáticas.

### Paridad de funciones restaurada desde las referencias

- **Perfil y Aportes:** foto de Google como avatar por defecto con reserva visual si no carga, herramientas del perfil con destinos reales, publicación de fotos/enlaces, vista previa y acciones de comunidad con iconos vectoriales; las acciones de cuenta piden iniciar sesión.
- **Acceso y Más:** inicio de sesión real con Google/Credential Manager, acceso a fórmulas, Pomodoro, configuración y privacidad. La solicitud de notificaciones solo aparece con sesión iniciada y usa un texto genérico.
- **Biblioteca:** Material Oficial, Aportes y Obras; vista previa de portada de PDF o imagen, control global de vistas previas y acciones comunitarias de guardar, fijar, destacar, compartir, comentar, reaccionar y reportar.
- **Aprender:** las fichas abiertas desde el banner del curso usan su propio mazo y filtros por semana/subtema, construido desde las fórmulas y claves del temario; se distinguen de las flashcards generales del Simulador. Incluye voltear, anterior/siguiente, aleatorio, aprendida, reportar y crear ficha. Las lecciones conservan inicio, teoría, opción múltiple, emparejar conceptos, completar frases, explicación y revancha Fénix.
- **Cursos:** mascotas separadas y tabla periódica interactiva con búsqueda, categorías y detalle de elemento.
- **Simulador:** banco CEPREUNSA migrado, simulacro ponderado de 80 preguntas por área, examen rápido con filtros por asignatura/semana/autor/búsqueda, reordenar, crear y reportar preguntas, navegación numerada, calculadora ponderada y flashcards comunitarias con búsqueda, filtros y creación.
- **Pomodoro y notificaciones:** el temporizador empieza únicamente al iniciar; duración editable por minuto para estudio y ambos descansos, sonido configurable por bloque, silencio global y preferencias persistidas. El permiso de notificaciones se pide después de autenticar al usuario.
- **Identidad de marca:** el icono de la APK usa `app_logo.png` y la barra superior muestra el wordmark RASTRO.

Quedan como trabajo de migración independiente las funciones grandes que las capturas no cubren (por ejemplo, ranking e historial de errores/resultados, progreso persistente de Aprender y chats), además de verificar en dispositivo los flujos visuales y de Firebase.

---

## Estado actual vs React original

| Sección | React | KMP estado | Prioridad |
|---|---|---|---|
| Auth Firebase (email, Google, anon) | ✅ completo | ⚠️ parcial (falta Google OAuth) | 🔴 Alta |
| Pomodoro (timer, ciclos, presets) | ✅ completo | ✅ ARREGLADO (Sprint 1) | ✅ |
| Pastilla flotante arrastrable XY | ✅ completo | ✅ ARREGLADO (Sprint 1) | ✅ |
| Navegación tabs sin bug | ✅ completo | ✅ ARREGLADO (Sprint 1) | ✅ |
| Muro/Perfil (posts, subir material) | ✅ completo | ⚠️ CommunityManager existe, Firebase no conectado | 🔴 Alta |
| Reacciones multi-emoji en posts | ✅ completo | ❌ no implementado | 🔴 Alta |
| Comentarios en posts | ✅ completo | ❌ no implementado | 🔴 Alta |
| Biblioteca (libros, fichas, viewer) | ✅ completo | ⚠️ listado existe, viewer no | 🟡 Media |
| Simulador (examen, ranking, errores) | ✅ completo | ⚠️ básico, sin Firebase | 🔴 Alta |
| Aprender (materias, lecciones) | ✅ completo | ⚠️ básico, sin progreso guardado | 🟡 Media |
| Cursos / Academia | ✅ completo | ⚠️ listado sin detalle real | 🟡 Media |
| Formulario de Fórmulas | ✅ completo | ⚠️ estático, sin favoritos | 🟡 Media |
| ORSTTY / Gemini IA | ✅ completo | ⚠️ básico, sin historial | 🟡 Media |
| Chats directos (Firestore real-time) | ✅ completo | ❌ solo pantalla vacía | 🔴 Alta |
| Gamificación (racha, XP, logros) | ✅ completo | ❌ no implementado | 🟡 Media |
| Notificaciones push | ✅ completo | ❌ no implementado | 🟢 Baja |
| Admin Panel | ✅ completo | ⚠️ básico sin funciones reales | 🟢 Baja |

---

## Arquitectura KMP objetivo

```
kotlin multi--rastro-/
├── shared/commonMain/.../rastro/
│   ├── auth/UserManager.kt              ✅ existe — AMPLIAR (Google OAuth)
│   ├── community/
│   │   ├── CommunityManager.kt         ✅ existe — CONECTAR a Firestore real
│   │   ├── CommunityModels.kt          ✅ existe
│   │   └── CommunityRepository.kt      ❌ CREAR — Firestore CRUD
│   ├── pomodoro/PomodoroState.kt        ✅ existe
│   ├── gamification/
│   │   ├── GamificationManager.kt      ❌ CREAR
│   │   └── GamificationModels.kt       ❌ CREAR
│   ├── chats/
│   │   ├── ChatManager.kt              ❌ CREAR
│   │   └── ChatModels.kt               ❌ CREAR
│   └── data/
│       ├── LiteraturaRepository.kt     ✅ existe
│       └── SimuladorRepository.kt      ✅ existe
│
└── androidApp/ui/
    ├── RastroApp.kt                    ✅ ARREGLADO (timer Pomodoro + nav)
    ├── screens/
    │   ├── AuthScreen.kt               ✅ existe (falta Google)
    │   ├── UserProfileScreen.kt        ⚠️ AMPLIAR (reacciones, comentarios)
    │   ├── BibliotecaScreen.kt         ⚠️ AMPLIAR (viewer libro)
    │   ├── SimuladorScreen.kt          ⚠️ AMPLIAR (Firebase ranking)
    │   ├── ChatsScreen.kt              ❌ REIMPLEMENTAR
    │   └── AprenderScreen.kt           ⚠️ AMPLIAR (progreso)
    └── components/
        ├── PomodoroFloatingPill.kt     ✅ ARREGLADO (XY drag + snap)
        ├── CommentsSection.kt          ❌ CREAR
        ├── ReactionsBar.kt             ❌ CREAR
        └── GamificationWidgets.kt      ❌ CREAR
```

---

## SPRINT 1 — COMPLETADO ✅

### Pomodoro timer real
**Archivo:** `RastroApp.kt`

Agregado `LaunchedEffect(pomodoroState.isRunning, pomodoroState.timeLeftSeconds)` que:
- Hace delay(1000ms) y resta 1 segundo cuando `isRunning = true`
- Al llegar a 0 con `autoCycle = true`, pasa al siguiente modo automáticamente
- Ciclo: Estudio(25m) → Descanso Corto(5m) → ... → cada 4 ciclos → Descanso Largo(15m)

### Pastilla arrastrable XY
**Archivo:** `PomodoroFloatingPill.kt`

Cambiado de `detectVerticalDragGestures` a `detectDragGestures` con:
- Movimiento libre en X e Y
- `onDragEnd` → snap magnético al borde más cercano (izq/der)
- Límites: X entre 0 y (ancho-180), Y entre 80 y 1800

### Navegación tabs arreglada
**Archivo:** `RastroApp.kt`

Cambiado `popUpTo(RastroScreen.Home.route)` por `popUpTo(navController.graph.startDestinationId)` con `inclusive = false` para no destruir el backstack al cambiar tabs.

---

## SPRINT 2 — PRÓXIMO (Firebase Posts + Reacciones + Comentarios)

### Módulo: Muro Comunitario

**React original:** `UserProfile.jsx`, `UploadModal.jsx`, `CommunityUploadCard.jsx`, `ReactionsBar.jsx`, `CommentsSection.jsx`

**Firestore schema:**
```
/posts/{postId}
  - authorId, authorName, authorPhoto: String
  - content: String
  - mediaUrl: String? (Firebase Storage URL)
  - category: String
  - createdAt: Timestamp
  - reactions: Map<String, List<String>>  // emoji → [uids]
  - commentsCount: Int

/posts/{postId}/comments/{commentId}
  - authorId, authorName, text: String
  - createdAt: Timestamp
  - likes: List<String> (uids)

/users/{uid}/following/{followedUid}
/users/{uid}/followers/{followerUid}
```

**Archivos a crear:**
1. `shared/community/CommunityRepository.kt` — Firestore CRUD real
2. `androidApp/ui/components/ReactionsBar.kt` — 6 emojis toggle
3. `androidApp/ui/components/CommentsSection.kt` — lista + input
4. Actualizar `UploadMaterialDialog.kt` — upload a Firebase Storage

**ReactionsBar (esquema):**
```kotlin
@Composable
fun ReactionsBar(
    postId: String,
    reactions: Map<String, List<String>>,
    currentUserId: String,
    onReact: (emoji: String) -> Unit
) {
    val emojis = listOf("🔥", "❤️", "😂", "😮", "😢", "👏")
    Row(horizontalArrangement = Arrangement.spacedBy(4.dp)) {
        emojis.forEach { emoji ->
            val count = reactions[emoji]?.size ?: 0
            val isMyReaction = reactions[emoji]?.contains(currentUserId) == true
            FilterChip(
                selected = isMyReaction,
                onClick = { onReact(emoji) },
                label = { Text(if (count > 0) "$emoji $count" else emoji) }
            )
        }
    }
}
```

---

## SPRINT 3 — Chats + Simulador + Gamificación

### Módulo: Chats Directos

**React original:** `Chats.jsx`, `UserDirectChat.jsx`

**Firestore schema:**
```
/chats/{chatId}
  - participants: [uid1, uid2]
  - lastMessage: String
  - lastMessageAt: Timestamp
  - unreadCount: Map<String, Int>

/chats/{chatId}/messages/{msgId}
  - senderId, text: String
  - sentAt: Timestamp
  - seen: Boolean
```

**Crear:**
- `shared/chats/ChatManager.kt` — getOrCreateChat, sendMessage, markAsSeen, getUserChats
- `androidApp/screens/ChatsScreen.kt` — reimplementar completo
- `androidApp/screens/DirectChatScreen.kt` — chat 1:1 con onSnapshot

### Módulo: Simulador con Firebase

**Funciones faltantes:**
- Timer global del examen (LaunchedEffect countdown)
- Guardar resultado en Firestore: `/simulacro_results/{uid}_{id}_{ts}`
- Ranking: query ordenada por score DESC
- "Mis Errores": banco de preguntas falladas

### Módulo: Gamificación

**Crear:**
```kotlin
// shared/gamification/GamificationModels.kt
data class GamificationData(
    val xp: Int = 0,
    val level: Int = 1,       // level = xp / 100
    val streak: Int = 0,
    val lastStudyDate: String = "",
    val achievements: List<String> = emptyList()
)

// shared/gamification/GamificationManager.kt
object GamificationManager {
    private val _state = MutableStateFlow(GamificationData())
    val state: StateFlow<GamificationData> = _state.asStateFlow()

    fun addXP(amount: Int) { /* +XP, recalcular nivel, guardar Firestore */ }
    fun checkAndUpdateStreak() { /* comparar lastStudyDate con hoy */ }
    fun unlockAchievement(id: String) { /* agregar a lista, mostrar animación */ }
}
```

---

## SPRINT 4 — Completar

| Función | Archivo destino | Descripción |
|---|---|---|
| Progreso lecciones | `LessonEngineScreen.kt` | Guardar en Firestore al completar |
| Viewer biblioteca | `LiteraturaViewerModal.kt` | Dialog fullscreen con scroll de texto |
| Favoritos fórmulas | `FormularioScreen.kt` | Toggle guardado en Firestore |
| Historial ORSTTY | `OrsttyScreen.kt` | Lista acumulada de mensajes |
| Google Sign-In | `AuthScreen.kt` | GoogleSignInOptions + Credential |
| Notificaciones FCM | `MainActivity.kt` | Registrar token + guardar en Firestore |
| Admin CRUD | `AdminScreen.kt` | Operaciones reales en Firestore |

---

## Mapa completo React → Kotlin

| Archivo React | Archivo Kotlin | Estado |
|---|---|---|
| `Auth.jsx` + `AuthContext.jsx` | `AuthScreen.kt` + `UserManager.kt` | ⚠️ Falta Google OAuth |
| `PomodoroContext.jsx` | `RastroApp.kt` (LaunchedEffect) | ✅ ARREGLADO |
| `PomodoroFloatingPill.jsx` | `PomodoroFloatingPill.kt` | ✅ ARREGLADO (XY drag) |
| `PomodoroModal.jsx` | `PomodoroModal.kt` | ✅ OK |
| `UserProfile.jsx` | `UserProfileScreen.kt` | ⚠️ Sin reacciones/comments |
| `UploadModal.jsx` | `UploadMaterialDialog.kt` | ⚠️ Sin Storage upload |
| `ReactionsBar.jsx` | `ReactionsBar.kt` | ❌ No existe |
| `CommentsSection.jsx` | `CommentsSection.kt` | ❌ No existe |
| `Biblioteca.jsx` | `BibliotecaScreen.kt` | ⚠️ Sin viewer |
| `LiteraturaViewerModal.jsx` | `LiteraturaViewerModal.kt` | ❌ No existe |
| `Simulador.jsx` | `SimuladorScreen.kt` | ⚠️ Sin Firebase |
| `RankingSimulacroModal.jsx` | `RankingModal.kt` | ❌ No existe |
| `MisErroresModal.jsx` | `MisErroresModal.kt` | ❌ No existe |
| `Aprender.jsx` | `AprenderScreen.kt` | ⚠️ Sin progreso |
| `Cursos.jsx` | `CursosScreen.kt` | ⚠️ Sin filtros |
| `AcademyDetail.jsx` | `AcademyDetailScreen.kt` | ⚠️ Sin reseñas |
| `FormularioPage.jsx` | `FormularioScreen.kt` | ⚠️ Sin LaTeX real |
| `OrsttyPage.jsx` | `OrsttyScreen.kt` | ⚠️ Sin historial |
| `Chats.jsx` + `UserDirectChat.jsx` | `ChatsScreen.kt` + `DirectChatScreen.kt` | ❌ Vacío |
| `GamificationContext.jsx` | `GamificationManager.kt` | ❌ No existe |
| `MiRachaModal.jsx` | `RachaModal.kt` | ❌ No existe |
| `LiquidNavbar.jsx` | `LiquidNavbar.kt` | ✅ ARREGLADO |
| `NotificationsModal.jsx` | `NotificationsScreen.kt` | ❌ No existe |
| `Admin.jsx` | `AdminScreen.kt` | ⚠️ Básico |
| `VocationalTestModal.jsx` | `VocationalTestDialog.kt` | ✅ Existe |
| `ChooseUsernameModal.jsx` | `WelcomeOnboardingDialog.kt` | ✅ Existe |

---

## Notas de Firestore (colecciones ya existentes en el React)

- `users/{uid}` — perfil de usuario
- `posts/{postId}` — publicaciones del muro (reacciones como Map en el doc)
- `simulacro_results/{id}` — resultados de simulacros
- `chats/{chatId}` — conversaciones
- `literatura/{obraId}` — obras literarias
- `cursos/{cursoId}` — academias/cursos

**Reglas de seguridad:** Ya escritas y probadas en `copia rastro react/firestore.rules`

---

*Documento generado: 2026-09 | Proyecto: Rastro KMP Android*
