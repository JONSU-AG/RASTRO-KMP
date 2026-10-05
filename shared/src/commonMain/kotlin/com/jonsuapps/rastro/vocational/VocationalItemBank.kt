package com.jonsuapps.rastro.vocational

/** Unmodified Spanish Mini-IP activities, USDOL/ETA O*NET® Career Exploration Tools.
 * Source: https://onetinterestprofiler.org/es/ (30 items, 5 per RIASEC dimension).
 * License: https://creativecommons.org/licenses/by-nd/4.0/ . Attribution visible in the test.
 */
object VocationalItemBank {
    private var _authorizedQuestions: List<VocationalQuestion> = listOf(
        VocationalQuestion(1, "Construir gabinetes para cocinas", RiasecDimension.REALISTIC, 1),
        VocationalQuestion(2, "Elaborar nueva medicina", RiasecDimension.INVESTIGATIVE, 2),
        VocationalQuestion(3, "Escribir libros u obras de teatro", RiasecDimension.ARTISTIC, 3),
        VocationalQuestion(4, "Ayudar a personas con problemas personales o emocionales", RiasecDimension.SOCIAL, 4),
        VocationalQuestion(5, "Administrar un departamento en una compañía grande", RiasecDimension.ENTERPRISING, 5),
        VocationalQuestion(6, "Instala software en las computadoras en una gran red", RiasecDimension.CONVENTIONAL, 6),
        VocationalQuestion(7, "Reparar electrodomésticos", RiasecDimension.REALISTIC, 7),
        VocationalQuestion(8, "Estudiar maneras para reducir la contaminación del agua", RiasecDimension.INVESTIGATIVE, 8),
        VocationalQuestion(9, "Componer y hacer arreglos musicales", RiasecDimension.ARTISTIC, 9),
        VocationalQuestion(10, "Orientar a las personas sobre carreras", RiasecDimension.SOCIAL, 10),
        VocationalQuestion(11, "Comenzar su propio negocio", RiasecDimension.ENTERPRISING, 11),
        VocationalQuestion(12, "Operar una calculadora", RiasecDimension.CONVENTIONAL, 12),
        VocationalQuestion(13, "Ensamblar partes electrónicas", RiasecDimension.REALISTIC, 13),
        VocationalQuestion(14, "Realizar experimentos químicos", RiasecDimension.INVESTIGATIVE, 14),
        VocationalQuestion(15, "Crear efectos especiales para películas", RiasecDimension.ARTISTIC, 15),
        VocationalQuestion(16, "Realizar terapia de rehabilitación", RiasecDimension.SOCIAL, 16),
        VocationalQuestion(17, "Negociar contratos comerciales", RiasecDimension.ENTERPRISING, 17),
        VocationalQuestion(18, "Mantener registros de envíos y recepción", RiasecDimension.CONVENTIONAL, 18),
        VocationalQuestion(19, "Manejar un camión para entregar paquetes a oficinas y hogares", RiasecDimension.REALISTIC, 19),
        VocationalQuestion(20, "Examinar muestras de sangre con el uso de un microscopio", RiasecDimension.INVESTIGATIVE, 20),
        VocationalQuestion(21, "Pintar escenografías para obras de teatro", RiasecDimension.ARTISTIC, 21),
        VocationalQuestion(22, "Hacer trabajo voluntario en organizaciones sin fines de lucro", RiasecDimension.SOCIAL, 22),
        VocationalQuestion(23, "Comercializar una nueva línea de ropa", RiasecDimension.ENTERPRISING, 23),
        VocationalQuestion(24, "Identificar el inventario de suministros con una computadora de mano", RiasecDimension.CONVENTIONAL, 24),
        VocationalQuestion(25, "Probar la calidad de las partes antes de un envío", RiasecDimension.REALISTIC, 25),
        VocationalQuestion(26, "Desarrollar una mejor manera de predecir el estado del tiempo o clima", RiasecDimension.INVESTIGATIVE, 26),
        VocationalQuestion(27, "Escribir libretos para películas o programas de televisión", RiasecDimension.ARTISTIC, 27),
        VocationalQuestion(28, "Enseñar una clase de high school", RiasecDimension.SOCIAL, 28),
        VocationalQuestion(29, "Vender mercancía en una tienda por departamentos", RiasecDimension.ENTERPRISING, 29),
        VocationalQuestion(30, "Colocar sellos, separar y repartir correo para una organización", RiasecDimension.CONVENTIONAL, 30)
    )
    val isBankLoaded: Boolean get() = validateBankStructure(_authorizedQuestions)
    fun getQuestions(): List<VocationalQuestion> = _authorizedQuestions
    fun setAuthorizedQuestions(questions: List<VocationalQuestion>) {
        require(validateBankStructure(questions)) { "Se requieren 30 o 60 actividades únicas y equilibradas entre las seis dimensiones." }
        _authorizedQuestions = questions
    }
    fun validateBankStructure(questions: List<VocationalQuestion>): Boolean {
        if (questions.size !in listOf(30, 60)) return false
        if (questions.map { it.id }.toSet().size != questions.size ||
            questions.map { it.text.trim() }.toSet().size != questions.size ||
            questions.any { it.text.isBlank() }) return false
        val count = questions.size / 6
        return RiasecDimension.entries.all { area -> questions.count { it.dimension == area } == count }
    }
}
