package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

/**
 * OBRA 08: La metamorfosis (Franz Kafka)
 * Fuente oficial: CONTENIDO_PEDAGOGICO/06_COMUNICACION/LITERATURA/OBRAS/OBRA_08_La_Metamorfosis_Kafka.md
 * Integración modular para RASTRO KMP - Biblioteca -> Obras
 */
val Obra08LaMetamorfosis = ObraLiteraria(
    id = "la-metamorfosis",
    titulo = "La metamorfosis",
    autor = "Franz Kafka",    anio = "Siglo XX (1915)",
    pais = "Imperio Austrohungaro (Praga)",
    colorHex = "#4B5563",
    corriente = "Vanguardismo europeo / Expresionismo y literatura del absurdo",
    genero = "Narrativo",
    especie = "Novela corta (Nouvelle)",
    categoria = "Literatura Universal",    sinopsis = """
        Una mañana lluviosa, tras un sueño intranquilo, el joven viajante de comercio de telas Gregorio Samsa amanece en su cama transformado en un monstruoso insecto (ungeheures Ungeziefer). Su espalda se ha endurecido como un caparazón córneo, su vientre oscuro y abombado está dividido en arcos segmentados y sus innumerables patitas tiemblan desvalidas. Lejos de horrorizarse por un milagro metafísico, su angustia inmediata es de orden puramente laboral: mira el despertador, comprueba que son las seis y media y constata aterrado que ha perdido el tren de las cinco. Gregorio es el único sostén económico de su familia (padre, madre y hermana menor) y trabaja exhausto para saldar la pesada deuda contraída por su padre tras la quiebra de su negocio cinco años atrás.
        
        A las siete en punto llega al domicilio el procurador de la empresa para fiscalizar su tardanza e interrogarlo a través de la puerta con amenazas de despido. En un esfuerzo agónico, Gregorio consigue girar la llave de la cerradura con sus mandíbulas desdentadas, manando un líquido marrón viscoso. Al abrirse la puerta, la revelación es espantosa: el procurador huye despavorido escaleras abajo, la madre asmática se desploma desmayada y el padre, enfurecido y armado con el bastón del empleado y un periódico, lo acorrala a golpes haciéndolo retroceder hasta que Gregorio queda atascado sangrando en el estrecho marco, siendo devuelto a su cuarto de una patada brutal que sella su confinamiento.
        
        En la segunda etapa, Gregorio se adapta a su condición biológica animal: rechaza la leche dulce con pan blanco y devora con placer sobras putrefactas de verduras, queso mohoso y huesos rancios provistos por su hermana Grete, quien actúa como su cuidadora inicial. Gregorio aprende a trepar por las paredes y el techo, y por delicadeza se oculta bajo el canapé con una sábana para evitar que su hermana lo vea. Se entera de que su padre ocultó ahorros secretos tras la quiebra, lo que le provoca alivio y amarga decepción al comprender que pudo haber renunciado mucho antes a su odioso empleo. Cuando Grete y la madre intentan vaciar su habitación de muebles para darle espacio, Gregorio se aferra desesperadamente al cuadro de la dama vestida de pieles para salvar un vestigio de su identidad humana; la madre lo contempla pegado al cristal y cae desvanecida. En ese instante regresa el padre enfundado en un impecable uniforme azul de ordenanza bancaria: furioso, bombardea a Gregorio con manzanas del frutero. Una manzana golpea con puntería implacable su espalda, incrustándose en su carne viva hasta pudrirse, causándole una infección y parálisis permanente.
        
        Durante su larga convalecencia, la familia alquila un cuarto a tres meticulosos huéspedes barbados para compensar la falta de ingresos, y la habitación del insecto se convierte en el vertedero de los trastos y cenizas que los inquilinos no quieren ver. Una noche, atraído por las notas melancólicas del violín tocado por su hermana Grete en el comedor, Gregorio experimenta una sublime conmoción espiritual ('¿Acaso era él un animal si la música le conmovía tanto?') y avanza cubierto de polvo hacia la sala. Descubierto por los huéspedes, estos anuncian escandalizados que rescinden el alquiler sin pagar un centavo. Grete, rota por la fatiga y el asco, pronuncia la condena de muerte: '¡Tenemos que intentar quitárnoslo de encima!... tenéis que desechar la idea de que eso es Gregorio'. Comprendiendo el dictamen familiar, Gregorio regresa arrastrándose a su cuarto con dolor infinito; en la oscuridad, recuerda a su familia con amor y gratitud profunda, y expira al despuntar el alba. Por la mañana, la vieja asistenta barre y arroja su cuerpo reseco a la basura. Aliviados y dando gracias a Dios, los padres echan a los huéspedes y abordan un tranvía al campo bajo el sol primaveral, contemplando con orgullo el cuerpo lozano y floreciente de Grete, listos para buscarle un buen marido.
    """.trimIndent(),
    contextoHistorico = """
        • Marco vanguardista y expresionista: Escrita en 1912 y publicada en 1915, la obra cumbre de Franz Kafka es el manifiesto fundacional de la literatura del absurdo y la alienación del siglo XX. Refleja la deshumanización del sujeto atrapado en el engranaje burocrático y mercantil capitalista.
        • Base biográfica de Kafka: Marcada por la conflictiva y aplastante relación con su padre Hermann Kafka (comerciante autoritario que castraba su vocación literaria, retratado en 'Carta al padre'), su trabajo alienante en una compañía de seguros laborales de Praga y su condición de judío germanoparlante aislado en una sociedad checa.
        • Técnica narrativa: Estilo kafkiano de 'naturalización de lo insólito', donde el suceso más absurdo y espeluznante se narra con una prosa notarial, fría, neutra y burocrática, intensificando el patetismo de la pesadilla cotidiana.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Gregorio Samsa (Gregor Samsa)",
            rol = "Protagonista / Viajante de comercio de telas",
            descripcion = "Joven abnegado y alienado que sostiene económicamente a toda su familia para pagar la deuda de su padre. Al despertar transformado en un monstruoso insecto (ungeheures Ungeziefer), pasa de ser el sostén del hogar a un parásito inservible y marginado. Paradójicamente, conserva una profunda sensibilidad humana y artística hasta su muerte mansa."
        ),
        PersonajeLiterario(
            nombre = "El Señor Samsa (El Padre)",
            rol = "Patriarca autoritario / Antagonista represor",
            descripcion = "Padre severo y pragmático que permanecía postrado en bata tras su quiebra. Tras la metamorfosis del hijo, experimenta un rejuvenecimiento agresivo: viste uniforme de ordenanza bancaria y ejecuta los dos ataques contra Gregorio: primero con bastón y periódico, y luego hiriéndolo de muerte al bombardearlo con manzanas."
        ),
        PersonajeLiterario(
            nombre = "Grete Samsa",
            rol = "Hermana menor / De protectora a verdugo moral",
            descripcion = "Muchacha de 17 años que toca el violín. Inicialmente es la única que cuida y alimenta a Gregorio con sobras podridas. Al empezar a trabajar como dependienta y ver frustrada la convivencia, sufre una metamorfosis moral y pronuncia el repudio definitivo ('tenemos que deshacernos de él'). Al final florece en una joven hermosa y casadera."
        ),
        PersonajeLiterario(
            nombre = "La Señora Samsa (La Madre)",
            rol = "Madre asmática y frágil",
            descripcion = "Mujer débil dividida entre el amor maternal primario y el asco fóbico incontrolable ante la monstruosidad animal de su hijo, sufriendo desmayos y crisis de asma cada vez que lo contempla."
        ),
        PersonajeLiterario(
            nombre = "El Procurador (El Jefe de Oficina)",
            rol = "Representante del sistema patronal",
            descripcion = "Funcionario arrogante y desconfiado que acude a primera hora para fiscalizar la ausencia de Gregorio y amenazarlo con el despido; huye despavorido escaleras abajo al ver la figura del insecto."
        ),
        PersonajeLiterario(
            nombre = "Los Tres Huéspedes Barbados",
            rol = "Inquilinos burgueses / La exigencia de pulcritud",
            descripcion = "Caballeros serios y maniáticos del orden que alquilan un cuarto. Desprecian la música de Grete y se escandalizan al ver al insecto en la sala, rescindiendo el contrato de arrendamiento y precipitando el desenlace."
        ),
        PersonajeLiterario(
            nombre = "La Asistenta Vieja",
            rol = "Criada por horas / La voz desmitificadora",
            descripcion = "Mujer ruda y desdentada que no teme al insecto, lo llama 'viejo escarabajo pelotero', descubre su cadáver frío y lo desecha en la basura."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Parte I: El despertar como insecto y la primera expulsión",
            detalle = "Gregorio amanece transformado en un bicho monstruoso sobre su espalda dura. Se angustia por haber perdido el tren de las cinco para su empleo de viajante de comercio. Llega el procurador a exigir cuentas; Gregorio gira la llave con sus mandíbulas y se muestra en el umbral. El procurador huye, la madre se desmaya y el padre lo hace retroceder a golpes de bastón y periódico, dejándolo atascado y sangrando en la puerta."
        ),
        EscenaTrama(
            titulo = "Parte II: La animalidad, el cuadro de la dama y las manzanas",
            detalle = "Gregorio rechaza la leche dulce y come sobras descompuestas provistas por Grete. Se acostumbra a trepar por las paredes y se oculta bajo el canapé con una sábana. Cuando la madre y Grete vacían su cuarto de muebles, Gregorio se pega al cuadro de la dama de pieles para salvarlo. El padre regresa uniformado como ordenanza bancaria y lo bombardea furioso con manzanas: una de ellas se pudre incrustada en su espalda, paralizándolo."
        ),
        EscenaTrama(
            titulo = "Parte III: La música de Grete, el rechazo y la muerte al alba",
            detalle = "La familia aloja a tres huéspedes barbados y el cuarto de Gregorio se vuelve vertedero de trastos viejos. Una noche, Gregorio escucha a Grete tocar el violín en la sala y avanza conmovido por el arte. Los huéspedes se indignan y cancelan el alquiler. Grete exige a sus padres deshacerse del monstruo. Gregorio regresa exhausto a su cuarto, recuerda a su familia con amor y muere en la madrugada; su cuerpo reseco es arrojado a la basura por la asistenta."
        ),
        EscenaTrama(
            titulo = "Epílogo: La catarsis primaveral y el paseo en tranvía",
            detalle = "El padre echa con autoridad a los tres huéspedes y despide a la asistenta. Los padres y Grete se toman el día libre y abordan un tranvía bañado por el sol hacia el campo. Constatan con alivio que sus perspectivas laborales son excelentes y admiran el florecimiento juvenil de Grete, pensando en concertarle un buen matrimonio."
        )
    ),
    temaPrincipal = "La deshumanización y alienación del individuo en el sistema laboral capitalista, la fragilidad e hipocresía del afecto familiar burgués condicionado por la productividad económica, y el autoritarismo patriarcal.",
    simbolosClave = listOf(
        "El insecto monstruoso (ungeheures Ungeziefer): Metáfora de la degradación laboral, la exclusión del diferente y la inutilidad económica del trabajador que pierde su capacidad productiva.",
        "La manzana podrida en el caparazón: Símbolo bíblico de la culpa inoculada y el castigo patriarcal implacable del padre sobre el hijo que ha dejado de ser obediente y lucrativo.",
        "El uniforme azul de ordenanza del padre: Resurrección autoritaria del padre burgués, recuperando el poder represor frente a la decadencia del hijo.",
        "El cuadro de la dama con manguito de pieles: Último vestigio de erotismo, belleza civilizada e identidad humana al que Gregorio se aferra físicamente.",
        "El violín de Grete ('el alimento desconocido'): Representación del arte puro y la trascendencia espiritual que conmueve al insecto frente a la insensibilidad de los hombres burgueses.",
        "El canapé y la sábana: Espacio de ocultamiento y vergüenza que prefigura el sarcófago y la tumba solitaria dentro del propio hogar."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿A qué se dedicaba Gregorio Samsa antes de su transformación y cuál era su meta?",
            respuesta = "Era viajante de comercio de telas. Trabajaba incansablemente para saldar una abultada deuda que su padre había contraído con su jefe tras la quiebra de su negocio cinco años atrás, proyectando renunciar una vez pagada."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué proyectil arrojado por el padre causa la herida infecciosa y la parálisis de Gregorio?",
            respuesta = "Manzanas del frutero del comedor. Una de ellas penetra y se incrusta profundamente en su caparazón blando, donde se pudre provocándole una grave infección y dejándolo semiinválido hasta su muerte."
        ),
        PreguntaClaveObra(
            pregunta = "¿Quién es el miembro de la familia que pronuncia la sentencia de muerte contra Gregorio?",
            respuesta = "Su hermana Grete. A pesar de haber sido su cuidadora inicial, tras el incidente del violín con los tres huéspedes declara rotundamente que deben quitárselo de encima y que deben desechar la idea de que esa criatura sea su hermano."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué dilema filosófico y artístico plantea Gregorio al escuchar a su hermana tocar el violín?",
            respuesta = "Se pregunta conmovido: '¿Acaso era él un animal si la música le conmovía de semejante modo?'. Demuestra que el marginado degradado a bicho es el único que conserva la auténtica sensibilidad humana y el anhelo del alma, mientras la sociedad burguesa vive embotada en el cálculo mercantil."
        ),
        PreguntaClaveObra(
            pregunta = "¡Trampa de Examen!: ¿Cómo reacciona la familia Samsa tras la muerte de Gregorio?",
            respuesta = "¡No guardan luto ni caen en la desesperación! Sienten un alivio infinito, dan gracias a Dios, echan a los huéspedes y abordan un tranvía rumbo al campo bajo el sol primaveral, celebrando sus ahorros y admirando la lozanía de Grete para buscarle un pretendiente."
        )
    )
)
