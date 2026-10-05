package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.data.obras.Obra01Iliada
import com.jonsuapps.rastro.data.obras.Obra02Odisea
import com.jonsuapps.rastro.data.obras.Obra03EdipoRey
import com.jonsuapps.rastro.data.obras.Obra04RomeoYJulieta
import com.jonsuapps.rastro.data.obras.Obra05Hamlet
import com.jonsuapps.rastro.data.obras.Obra06Werther
import com.jonsuapps.rastro.data.obras.Obra07CrimenYCastigo
import com.jonsuapps.rastro.data.obras.Obra08LaMetamorfosis
import com.jonsuapps.rastro.data.obras.Obra09MioCid
import com.jonsuapps.rastro.data.obras.Obra10DonQuijote
import com.jonsuapps.rastro.data.obras.Obra11LaVidaEsSueno
import com.jonsuapps.rastro.data.obras.Obra12RimasYLeyendas
import com.jonsuapps.rastro.data.obras.Obra13Azul
import com.jonsuapps.rastro.data.obras.Obra14VeintePoemas
import com.jonsuapps.rastro.data.obras.Obra15ElReinoDeEsteMundo
import com.jonsuapps.rastro.data.obras.Obra16BorgesFiccionesAleph
import com.jonsuapps.rastro.data.obras.Obra17PedroParamo
import com.jonsuapps.rastro.data.obras.Obra18CienAnosDeSoledad
import com.jonsuapps.rastro.data.obras.Obra19ComentariosReales
import com.jonsuapps.rastro.data.obras.Obra20NaCatita
import com.jonsuapps.rastro.data.obras.Obra21TradicionesPeruanas
import com.jonsuapps.rastro.data.obras.Obra22PajinasLibres
import com.jonsuapps.rastro.data.obras.Obra23TrilceYPoemasHumanos
import com.jonsuapps.rastro.data.obras.Obra24ElCaballeroCarmelo
import com.jonsuapps.rastro.data.obras.Obra25ElMundoEsAnchoYAjeno
import com.jonsuapps.rastro.data.obras.Obra26LosRiosProfundos
import com.jonsuapps.rastro.data.obras.Obra27LaPalabraDelMudo
import com.jonsuapps.rastro.data.obras.Obra28LaCiudadYLosPerros
import com.jonsuapps.rastro.data.obras.Obra29YaraviesYFabulas
import com.jonsuapps.rastro.data.obras.Obra30ElPuebloDelSol
import com.jonsuapps.rastro.data.obras.Obra31LosInocentes
import com.jonsuapps.rastro.data.obras.Obra32ElPezDeOro
import com.jonsuapps.rastro.data.obras.Obra33AvesSinNido
import com.jonsuapps.rastro.data.obras.Obra34ConversacionEnLaCatedral
import com.jonsuapps.rastro.data.obras.Obra35Simbolicas
import com.jonsuapps.rastro.data.obras.Obra36CantoVillano
import com.jonsuapps.rastro.data.obras.Obra37PercyGibson
import com.jonsuapps.rastro.data.obras.Obra38KilkuWaraka
import com.jonsuapps.rastro.data.obras.Obra39JoseLuisAyala
import com.jonsuapps.rastro.data.obras.Obra40Ollantay
import com.jonsuapps.rastro.model.ObraLiteraria
import com.jonsuapps.rastro.data.obras.ObraRimas
import com.jonsuapps.rastro.data.obras.ObraLeyendas
import com.jonsuapps.rastro.data.obras.ObraFicciones
import com.jonsuapps.rastro.data.obras.ObraElAleph
import com.jonsuapps.rastro.data.obras.ObraTrilce
import com.jonsuapps.rastro.data.obras.ObraPoemasHumanos
import com.jonsuapps.rastro.data.obras.ObraLosHeraldosNegros
import com.jonsuapps.rastro.data.obras.ObraYaravies
import com.jonsuapps.rastro.data.obras.ObraFabulasMelgar
import com.jonsuapps.rastro.data.obras.ObraJornadaHeroica
import com.jonsuapps.rastro.data.obras.ObraJakeAru
import com.jonsuapps.rastro.data.obras.ObraDiscursoPoliteama
import com.jonsuapps.rastro.data.obras.ObraGallinazosSinPlumas
import com.jonsuapps.rastro.data.obras.ObraEspanaCaliz

object LiteraturaRepository {

    val obrasUNSA: List<ObraLiteraria> get() = obras

    val obras = listOf(
        Obra01Iliada,
        Obra02Odisea,
        Obra03EdipoRey,
        Obra04RomeoYJulieta,
        Obra05Hamlet,
        Obra06Werther,
        Obra07CrimenYCastigo,
        Obra08LaMetamorfosis,
        Obra09MioCid,
        Obra10DonQuijote,
        Obra11LaVidaEsSueno,
        ObraRimas,
        ObraLeyendas,
        Obra13Azul,
        Obra14VeintePoemas,
        Obra15ElReinoDeEsteMundo,
        ObraFicciones,
        ObraElAleph,
        Obra17PedroParamo,
        Obra18CienAnosDeSoledad,
        Obra19ComentariosReales,
        Obra20NaCatita,
        Obra21TradicionesPeruanas,
        Obra22PajinasLibres,
        ObraDiscursoPoliteama,
        ObraLosHeraldosNegros,
        ObraTrilce,
        ObraPoemasHumanos,
        ObraEspanaCaliz,
        Obra24ElCaballeroCarmelo,
        Obra25ElMundoEsAnchoYAjeno,
        Obra26LosRiosProfundos,
        Obra27LaPalabraDelMudo,
        ObraGallinazosSinPlumas,
        Obra28LaCiudadYLosPerros,
        ObraYaravies,
        ObraFabulasMelgar,
        Obra30ElPuebloDelSol,
        Obra31LosInocentes,
        Obra32ElPezDeOro,
        Obra33AvesSinNido,
        Obra34ConversacionEnLaCatedral,
        Obra35Simbolicas,
        Obra36CantoVillano,
        ObraJornadaHeroica,
        Obra38KilkuWaraka,
        ObraJakeAru,
        Obra40Ollantay
    )

    fun getById(id: String): ObraLiteraria? {
        return obras.firstOrNull { it.id == id }
    }

    fun getByCategoria(cat: String): List<ObraLiteraria> {
        if (cat.isBlank() || cat.equals("Todas", ignoreCase = true)) return obras
        return obras.filter { it.categoria.equals(cat, ignoreCase = true) }
    }
}
