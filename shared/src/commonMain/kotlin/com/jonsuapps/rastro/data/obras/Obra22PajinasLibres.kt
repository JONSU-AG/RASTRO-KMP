package com.jonsuapps.rastro.data.obras

import com.jonsuapps.rastro.model.EscenaTrama
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.model.PersonajeLiterario
import com.jonsuapps.rastro.model.PreguntaClaveObra

val Obra22PajinasLibres = ObraLiteraria(
    id = "pajinas-libres",
    titulo = "Pájinas Libres",
    autor = "Manuel González Prada",    anio = "Siglo XIX (1894)",
    pais = "Perú",
    corriente = "Realismo Peruano (Vertiente Crítico-Radical) / Precursor del Indigenismo y Modernismo",
    genero = "Ensayístico / Didáctico",
    especie = "Ensayo político-filosófico y discurso combativo",
    categoria = "Literatura Peruana",    colorHex = "#DC2626",
    sinopsis = """
        Pájinas Libres es la obra cumbre del ensayo político y de combate del Realismo peruano, publicada en París en 1894 por Manuel González Prada ('El Apóstol de la Muerte', 'El Sibarita Rebelde'). Escrita deliberadamente con su célebre ortografía fonética anarquista (empleando la 'j' por la 'g' y la 'i' por la 'y' como insurrección contra la tutela colonial de la Real Academia Española), la obra reúne sus discursos, conferencias y ensayos más incendiarios pronunciados entre 1885 y 1891 durante la Reconstrucción Nacional post-Guerra del Pacífico.

        El libro somete a juicio implacable la bancarrota material, cívica y moral del Perú tras el cataclismo de la guerra con Chile, articulándose en torno a cinco piezas maestras:
        1. Discurso en el Politeama (29 de julio de 1888): Leído ante una multitud por el colegial Gabriel Urbina en una velada cívica para recaudar fondos para Tacna y Arica. Prada refuta que la derrota se debiera a la genialidad del invasor: 'La mano brutal de Chile despedazó nuestra carne i machacó nuestros huesos; pero los verdaderos vencedores fueron nuestra ignorancia i nuestra servidumbre'. Proclama una verdad sociológica revolucionaria que funda el Indigenismo peruano: el verdadero Perú no lo forman los criollos y extranjeros de la faja costera limeña, sino las muchedumbres de indios diseminadas en la cordillera andina, oprimidas durante tres siglos por la 'trinidad maldita' (el juez de paz, el gobernador y el cura). Clausura el discurso con la consigna generacional más célebre de la historia peruana: '¡Los viejos a la tumba, los jóvenes a la obra!'.
        2. Conferencia en el Ateneo de Lima (1886): Proclama la independencia estética y literaria del Perú respecto a España, fustigando la copia servil de los moldes castellanos gastados e instando a los poetas a beber de las vanguardias francesa y alemana (simbolismo y parnasianismo) e introducir metros nuevos (triolets, rondeles), erigiéndose en precursor directo del Modernismo.
        3. Discurso en el teatro Olimpo (1888): Ataca con furia la cobardía moral de la intelectualidad burguesa cortesana que escribe historietas livianas o adula a caudillos mientras la patria sangra; reivindica la pluma como látigo implacable y arma de combate contra los tiranos.
        4. Propaganda i ataque (1888): Demuele el reformismo tibio de los políticos tradicionales; afirma que a una sociedad podrida en sus cimientos no se le pinta la fachada con reformas cosméticas, sino que se le aplica dinamita social e intransigencia moral.
        5. Grau (1885): Elogio fúnebre despojado de retórica vacía en homenaje al Almirante Miguel Grau y a la epopeya del monitor Huáscar, señalando que la inmolación en Angamos fue el único destello de grandeza y dignidad ética en medio de la podredumbre del conflicto.
    """.trimIndent(),
    contextoHistorico = """
        Tras la humillante derrota frente a Chile en la Guerra del Pacífico (1879-1883), la ocupación militar de Lima y la firma del Tratado de Ancón, el Perú quedó devastado física y anímicamente. Manuel González Prada se recluyó voluntariamente en su hogar limeño durante los tres años de ocupación extranjera, jurando no cruzar el umbral mientras un solo soldado invasor pisara suelo patrio.

        El Círculo Literario y la Ruptura con la Tradición Virreinal:
        Al reanudarse la vida civil, la oligarquía pretendió retornar al mismo clientelismo y conformismo frívolo. En 1886 Prada asumió la presidencia del 'Círculo Literario', rompiendo lanzas contra la Academia Peruana de la Lengua y el costumbrismo complaciente de Ricardo Palma. Prada acusó a los tradicionalistas de entretener al país con anécdotas de virreyes y frailes mientras la República se desmoronaba en la ignorancia.

        Positivismo Científico y Ortografía Fonética:
        Influenciado por el positivismo de Auguste Comte y Herbert Spencer, Prada proclamó la fe en la ciencia experimental, la educación laica y el anticlericalismo militante. Su reforma ortográfica ('j' en vez de 'g', 'i' en vez de 'y', eliminación de la 'h' muda) fue un acto deliberado de descolonización cultural: 'Escribamos como se habla, i no rindamos pleitesía a los gramáticos de la corte de Madrid'.
    """.trimIndent(),
    personajes = listOf(
        PersonajeLiterario(
            nombre = "Manuel González Prada",
            rol = "Autor, líder intelectual del Círculo Literario y fiscal moral de la nación",
            descripcion = "Patricio limeño de estirpe aristocrática que renunció a los privilegios de su clase para convertirse en el látigo verbal contra la corrupción oligárquica, el militarismo decadente y el clero obscurantista. Precursor del Indigenismo y maestro ético de generaciones."
        ),
        PersonajeLiterario(
            nombre = "Gabriel Urbina",
            rol = "Colegial de dieciséis años, lector del Discurso en el Politeama",
            descripcion = "Joven estudiante encargado de dar voz ante el auditorio congregado en el Teatro Politeama al célebre texto de González Prada, debido a la conocida aversión y timidez de este último hacia la declamación oratoria en público."
        ),
        PersonajeLiterario(
            nombre = "El Indio Andino",
            rol = "Sujeto histórico del verdadero Perú y víctima de opresión secular",
            descripcion = "Figura central del pensamiento pradino: habitante mayoritario de la cordillera andina que constituye el nervio y corazón de la nación real. Descrito como un ser dotado de dignidad humana aplastado en la ignorancia y el alcoholismo por la servidumbre semifeudal."
        ),
        PersonajeLiterario(
            nombre = "La Trinidad Opresora (El Cura, el Juez y el Gobernador)",
            rol = "Aparato de dominación y explotación del indígena en el Perú andino",
            descripcion = "Triada de poderes locales denunciada por Prada: el sacerdote que adormece con supersticiones católicas, el juez corrupto que arrebata las tierras comunales y el gobernador que impone trabajos forzados."
        ),
        PersonajeLiterario(
            nombre = "La Juventud Republicana",
            rol = "Fuerza moral de choque llamada a la regeneración patria",
            descripcion = "Destinataria del mandato '¡Los jóvenes a la obra!'. Prada la convoca a romper con los prejuicios dogmáticos, educarse en la ciencia experimental y el rigor industrial, y cultivar un odio santo hacia los opresores para redimir el honor patrio."
        ),
        PersonajeLiterario(
            nombre = "La Oligarquía Gobernante ('Los Viejos')",
            rol = "Casta política y militar responsable del desastre bélico",
            descripcion = "Clase política frívola y cobarde condenada con la frase '¡Los viejos a la tumba!': gobernantes que convirtieron la República en una hacienda privada y pactaron la humillación nacional en vez de defender la soberanía."
        ),
        PersonajeLiterario(
            nombre = "Almirante Miguel Grau Seminario",
            rol = "Héroe ético inmortal de Angamos a bordo del monitor Huáscar",
            descripcion = "Paradigma de dignidad militar y nobleza cívica exaltado por Prada en su semblanza de 1885 como la única figura inmaculada que salvó el honor peruano en medio de la hecatombe colectiva."
        ),
        PersonajeLiterario(
            nombre = "El Clero Católico Obscurantista",
            rol = "Fuerza reaccionaria fustigada por el anticlericalismo pradino",
            descripcion = "Institución eclesiástica acusada de paralizar el intelecto crítico de la sociedad mediante la teología escolástica y los rezos resignados en lugar del impulso científico."
        )
    ),
    analisisTrama = listOf(
        EscenaTrama(
            titulo = "Discurso en el Politeama y la Autopsia de la Derrota Bélica",
            detalle = "En el Teatro Politeama de Lima, el colegial Gabriel Urbina lee el texto de González Prada ante un auditorio conmovido. Prada derriba los pretextos conformistas sobre la derrota en la Guerra del Pacífico: sentencia que no venció la ciencia militar enemiga sino nuestra propia ignorancia y servidumbre interna cultivada por gobernantes corruptos que descuidaron la defensa nacional."
        ),
        EscenaTrama(
            titulo = "La Revelación del Verdadero Perú: El Nacimiento del Indigenismo",
            detalle = "Prada proclama un cambio radical en la concepción del país: denuncia que Lima y la costa criolla no representan al verdadero Perú, sino las muchedumbres indígenas que pueblan la cordillera andina. Revela que trescientos años de república y colonia han mantenido al indio en la abyección mediante la trinidad maldita del cura, el gobernador y el juez de paz, exigiendo educarlo y devolverle la tierra para que se alce a la dignidad de hombre."
        ),
        EscenaTrama(
            titulo = "La Sentencia Generacional: ¡Los Viejos a la Tumba, los Jóvenes a la Obra!",
            detalle = "El orador pronuncia el anatema definitivo contra la generación culpable del desastre: '¡Los viejos a la tumba, los jóvenes a la obra!'. Exige a la nueva juventud liberarse de las supersticiones del pasado, armarse con la ciencia positiva y la industria, y mantener encendido un odio redentor hacia el usurpador para rescatar las provincias cautivas de Tacna y Arica."
        ),
        EscenaTrama(
            titulo = "Conferencia en el Ateneo de Lima y la Ruptura con las Letras Españolas",
            detalle = "González Prada embiste contra el servilismo literario hacia Madrid en el Ateneo de Lima. Exige sepultar los moldes anticuados del Siglo de Oro y la retórica castiza peninsular, instando a los poetas peruanos a asimilar la riqueza estrófica y musical de las letras modernas de Francia y Alemania, anticipando las innovaciones métricas del Modernismo hispanoamericano."
        ),
        EscenaTrama(
            titulo = "Grau, Propaganda i Ataque y la Prosa como Dinamita Social",
            detalle = "En sus ensayos de combate, Prada exalta la gloria solitaria de Miguel Grau en Angamos frente a la cobardía cortesana. En 'Propaganda i ataque' y el discurso del 'Olimpo', fustiga el reformismo parlamentario de papel afirmando que a un edificio carcomido no se le maquilla con reformas sino que se le destruye con dinamita, consagrando la pluma literaria como un látigo moral."
        )
    ),
    temaPrincipal = "La denuncia implacable de la corrupción moral e ignorancia de la oligarquía criolla tras la catástrofe de la Guerra del Pacífico; la reivindicación sociológica del indio andino como la nación real del Perú; el positivismo científico frente al dogma religioso y el llamamiento radical a la juventud para refundar la patria.",
    simbolosClave = listOf(
        "La ortografía fonética ('j' e 'i'): Símbolo de insurrección cultural y descolonización lingüística contra el monopolio normativo de la Real Academia Española.",
        "La consigna '¡Los viejos a la tumba, los jóvenes a la obra!': Metáfora del relevo generacional y la sepultura ética de la casta política que hundió al país.",
        "La trinidad maldita (el cura, el juez y el gobernador): Emblema de la estructura semifeudal de explotación y expolio sistemático del indígena en las provincias andinas.",
        "El Teatro Politeama: Espacio cívico donde resonó por primera vez la voz de la autocrítica radical de la Reconstrucción Nacional.",
        "El monitor Huáscar y la figura de Grau: Símbolo del honor puro, la inmolación moral y la dignidad patria frente a la podredumbre política de la retaguardia.",
        "La dinamita frente al edificio podrido: Metáfora de la acción directa revolucionaria frente al reformismo pusilánime de discursos parlamentarios.",
        "La antorcha del positivismo y la ciencia: Emblema del progreso experimental que sustituye a los rezos resignados y al obscurantismo eclesiástico."
    ),
    preguntasClave = listOf(
        PreguntaClaveObra(
            pregunta = "¿Quién pronunció materialmente en el estrado el 'Discurso en el Politeama' y por qué razón?",
            respuesta = "El discurso fue escrito por Manuel González Prada, pero fue leído en el escenario por el colegial Gabriel Urbina (¡NO por el propio González Prada!), debido a la timidez oratoria y aversión del autor a hablar en público."
        ),
        PreguntaClaveObra(
            pregunta = "¿A qué corriente literaria pertenece 'Pájinas Libres' y cuál es su trascendencia ideológica?",
            respuesta = "Pertenece al Realismo Peruano en su vertiente Crítico-Radical. Su trascendencia radica en ser la obra precursora del Indigenismo sociológico moderno y un hito del pensamiento positivista y combativo de la Reconstrucción Nacional."
        ),
        PreguntaClaveObra(
            pregunta = "¿Por qué González Prada escribió el título con 'j' ('Pájinas') y utilizó una ortografía fonética particular?",
            respuesta = "Porque aplicó su propuesta de ortografía fonética anarquista (escribir como se pronuncia, sustituyendo la 'g' suave por 'j' y la 'y' por 'i') como un acto de rebelión cultural e independencia contra el servilismo a la Real Academia Española de la Lengua."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué tesis revolucionaria formula el autor en el Politeama respecto a la definición del 'verdadero Perú'?",
            respuesta = "Sostiene que el verdadero Perú no lo forman los criollos ni los extranjeros que habitan la costa limeña entre el Pacífico y los Andes, sino las muchedumbres indígenas que pueblan la cordillera andina, denunciando su explotación por el cura, el juez y el gobernador."
        ),
        PreguntaClaveObra(
            pregunta = "¿Qué simboliza la célebre frase '¡Los viejos a la tumba, los jóvenes a la obra!'?",
            respuesta = "Simboliza la exigencia de una ruptura radical con la generación política corrompida y derrotista del pasado ('los viejos a la tumba') para encomendar a la nueva juventud la misión histórica de regenerar la patria a través de la ciencia, la industria y la dignidad moral ('los jóvenes a la obra')."
        )
    )
)
