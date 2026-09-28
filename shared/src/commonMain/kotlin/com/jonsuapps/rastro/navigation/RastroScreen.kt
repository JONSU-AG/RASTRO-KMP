package com.jonsuapps.rastro.navigation

/**
 * Catálogo exhaustivo de las rutas de RASTRO (paridad exacta con HashRouter en §1 del mapa).
 */
sealed class RastroScreen(val route: String) {
    // 1. Inicio Libre
    data object Home : RastroScreen("home")

    // 2. Aprender (15 mundos por niveles) y Motor de Lecciones
    data object Aprender : RastroScreen("aprender")
    data object AprenderSubject : RastroScreen("aprender/{subject}") {
        fun createRoute(subject: String) = "aprender/$subject"
    }
    data object LessonEngine : RastroScreen("leccion/{lessonId}") {
        fun createRoute(lessonId: String) = "leccion/$lessonId"
    }

    // 3. Cursos (Playlists YouTube y rutas)
    data object Cursos : RastroScreen("cursos")
    data object AcademyDetail : RastroScreen("cursos/{id}") {
        fun createRoute(id: String) = "cursos/$id"
    }

    // 4. Biblioteca (Obras y Compendios)
    data object Biblioteca : RastroScreen("biblioteca")

    // 5. Formulario & Mnemotecnias (Cara A y B)
    data object Formulario : RastroScreen("formulario")
    data object Flashcards : RastroScreen("flashcards")

    // 6. Simulador (Cronómetro y Ranking)
    data object Simulador : RastroScreen("simulador")

    // 7. Pizarra de Dibujo / Relajo (Doodle Canvas)
    data object Pizarra : RastroScreen("pizarra")

    // Rutas heredadas / archivadas
    data object Orstty : RastroScreen("orstty")
    data object Chats : RastroScreen("chats")

    // 9. Perfil Propio (Exige cuenta) y Perfil Público
    data object Perfil : RastroScreen("perfil")
    data object UsuarioDetail : RastroScreen("usuario/{uid}") {
        fun createRoute(uid: String) = "usuario/$uid"
    }

    // 10. Autenticación (Google, Email, Invitado)
    data object Auth : RastroScreen("auth")

    // 11. Panel de Administración (Exclusivo correos autor)
    data object Admin : RastroScreen("admin")

    // 12. Páginas Legales
    data object Legal : RastroScreen("legal")
    data object Politicas : RastroScreen("politicas")
    data object Privacidad : RastroScreen("privacidad")
    data object Terminos : RastroScreen("terminos")
    data object EliminarCuenta : RastroScreen("eliminar_cuenta")
}
