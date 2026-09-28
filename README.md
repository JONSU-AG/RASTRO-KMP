# RASTRO · Réplica Nativa en Kotlin Multiplatform (KMP) con Jetpack Compose

> **Estado**: 100% Implementado y Verificado  
> **Arquitectura**: Kotlin Multiplatform (`commonMain` para lógica compartida y futuro iOS) + Android Nativo con Jetpack Compose y Material 3  
> **Paquete**: `com.jonsuapps.rastro`  
> **Proyecto Firebase**: `rumbo-jonsu` (`google-services.json` oficial)

---

## 🏛️ Estructura del Proyecto

```
kotlin multi--rastro- no borrar/
├── settings.gradle.kts          # Módulos :shared y :androidApp
├── build.gradle.kts             # Plugins KMP, Compose, Google Services
├── gradle.properties            # Optimizaciones de compilación y memoria
├── gradle/
│   ├── libs.versions.toml       # Version Catalog (Kotlin 2.1, AGP 8.8, Compose 1.7)
│   └── wrapper/
│       └── gradle-wrapper.properties (Gradle 8.11.1)
├── shared/                      # Lógica compartida en commonMain
│   └── src/commonMain/kotlin/com/jonsuapps/rastro/
│       ├── auth/                # AdminConfig (5 correos de Jonsu Aguilar)
│       ├── model/               # Modelos de dominio (Lecciones, Obras, Simulador, etc.)
│       ├── data/                # Repositorios (Simulador UNSA 4 decimales, Mnemotecnias, etc.)
│       ├── navigation/          # RastroScreen (Catálogo de las 19 rutas oficiales)
│       ├── theme/               # Tokens de diseño, 9 temas y baldosas pastel
│       ├── gamification/        # Racha local America/Lima, Vidas (200) y XP
│       └── pomodoro/            # Estados de Pomodoro (3 modos, PIP magnético)
└── androidApp/                  # Interfaz Android Nativa Jetpack Compose
    ├── google-services.json     # Configuración oficial Firebase rumbo-jonsu
    └── src/main/
        ├── AndroidManifest.xml  # Permisos, App Links (rumbo-jonsu.web.app) y tema
        ├── res/                 # Iconos vectoriales e ic_launcher
        └── kotlin/com/jonsuapps/rastro/android/
            ├── RastroApplication.kt
            ├── MainActivity.kt
            ├── audio/           # SineWaveSynthesizer (432Hz y 528Hz vía AudioTrack)
            ├── notifications/   # LimaStudyReminderWorker (Ventanas hora Lima UTC-5)
            └── ui/
                ├── RastroApp.kt # Scaffold, NavHost 19 rutas, Pomodoro y Diálogos
                ├── components/  # LiquidNavbar, PomodoroFloatingPill, Modales
                └── screens/     # Las 14 pantallas nativas de Compose
```

---

## 📱 Catálogo de Pantallas Implementadas

1. **`HomeScreen`** (`/`): Saludo dinámico, widget de actividad esbelto, 6 baldosas pastel (Menta, Lavanda, Azul Google, Ámbar, Verde, Índigo) y micro-sello legal.
2. **`AprenderScreen`** (`/aprender`): Los 15 mundos preuniversitarios, anillo de progreso estilo Duolingo (`PlanetProgressRing`), filtro de áreas y tip de Orstty.
3. **`AprenderSubjectDetailScreen`** (`/aprender/{subject}`): Ruta de aprendizaje semanal con lecciones bloqueadas, desbloqueadas y estrellas de maestría.
4. **`LessonEngineScreen`** (`/leccion/{lessonId}`): Motor interactivo con Paso 0 (Teoría GoodNotes), Retos de opción múltiple (A-E), Modo Fénix (redención de errores), diálogo "¿Ya te vas?" y pantalla de victoria.
5. **`CursosScreen`** (`/cursos`): Pestañas Oficial / Mías / Compartidas, filtro por materias y reproductor nativo YouTube WebView sin fugas de videos privados.
6. **`AcademyDetailScreen`** (`/cursos/{id}`): Detalle de playlist con lista de clases y reproductor integrado.
7. **`BibliotecaScreen`** (`/biblioteca`): Las 8 obras maestras (Arguedas, Vargas Llosa, Alegría, Kafka, Dostoyevski, Sófocles, Garcilaso, Ollantay) con visor `LiteraturaViewerDialog`.
8. **`FormularioScreen`** (`/formulario`): Cara A (Calculadora Viva interactiva con despejes y unidades S.I.) vs Cara B (Bóveda de Mnemotecnias inolvidables: *Diosito lo ve todo*, *Viva la Reina Isabel*, *Pavo = Ratón*, *Chonps*).
9. **`SimuladorScreen`** (`/simulador`): Examen de admisión de 80 preguntas por áreas, cronómetro regresivo, ponderación oficial UNSA calculada a 4 decimales exactos y comparación con puntajes de corte.
10. **`OrsttyScreen`** (`/orstty`): Tutor académico IA con cabecera de 56px, carrusel de chips sin emojis, aviso permanente de IA y tarjetas de origen.
11. **`ChatsScreen`** (`/chats`): Mensajería privada directa en Cloud Firestore (`mensajes_directos_privados`) con restricción de autenticación obligatoria.
12. **`UserProfileScreen`** (`/perfil` & `/usuario/{uid}`): Marco de rango académico, meta de carrera universitaria, estadísticas de racha/XP y pestañas Mi Muro / Guardados.
13. **`AdminScreen`** (`/admin`): Panel administrativo seguro protegido estrictamente por los 5 correos de `AdminConfig.ADMIN_EMAILS` (escudo de acceso denegado si no es el autor).
14. **`AuthScreen`** (`/auth`): Google Credential Manager, email/contraseña y modo invitado con persistencia y resolución de conflictos.
15. **`LegalScreen`** (`/politicas`, `/privacidad`, `/terminos`, `/eliminar-cuenta`): Cumplimiento de políticas de Google Play y legislación de protección de datos personales.

---

## 🔒 Reglas Críticas Cumplidas

- **Carpeta Original Intocable**: `C:\Users\Usuario\Downloads\rumbo (5)----no borrar apk` se mantuvo 100% protegida y solo de lectura.
- **Racha y Fechas**: Calculadas en hora local de Lima (`America/Lima`), jamás en UTC, blindando la experiencia entre las 7:00 PM y 12:00 AM.
- **Cero Emojis en UI**: En toda la interfaz de Compose se usan únicamente vectores Material Symbols. Los emojis solo están presentes en las notificaciones del sistema.
- **Audio Matemático**: Tonos de 432 Hz y 528 Hz sintetizados en tiempo real mediante `AudioTrack` (0 KB de assets MP3, costo $0).
- **Aislamiento de Videos**: El interruptor de videos privados de Firebase se mantiene desconectado, consumiendo solo playlists públicas de YouTube.

---

## 🧹 Limpieza Final de la Copia Temporal

La carpeta [`copia rastro react`](file:///c:/Users/Usuario/Downloads/kotlin%20multi--rastro-%20no%20borrar/copia%20rastro%20react) fue utilizada para indexar y extraer los temarios, mnemotecnias y ponderaciones. El nuevo código Kotlin Multiplatform es completamente autónomo y no depende de ella. Puedes borrar dicha carpeta cuando desees con un solo clic.
