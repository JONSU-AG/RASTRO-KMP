package com.jonsuapps.rastro.android.ui.screens

import androidx.compose.runtime.*
import androidx.compose.ui.geometry.Offset
import androidx.lifecycle.ViewModel
import java.util.LinkedHashMap

internal data class InkViewport(val zoom:Float=1f,val panX:Float=0f,val panY:Float=0f) {
    fun world(screen:Offset)=Offset((screen.x-panX)/zoom,(screen.y-panY)/zoom)
    fun screen(world:Offset)=Offset(world.x*zoom+panX,world.y*zoom+panY)
    fun gesture(centroid:Offset,pan:Offset,factor:Float):InkViewport {
        if(!centroid.x.isFinite() || !centroid.y.isFinite() || !factor.isFinite() || factor<=0 || !pan.x.isFinite() || !pan.y.isFinite())return this
        val next=(zoom*factor).coerceIn(.25f,6f);val ratio=next/zoom
        return InkViewport(next,centroid.x+pan.x-(centroid.x-panX)*ratio,centroid.y+pan.y-(centroid.y-panY)*ratio)
    }
}

/** Inactive entries retain geometry, never their raster buffer. Activity-scoped and bounded. */
internal class QuestionDocumentCache<T>(private val create:()->T,private val release:(T)->Unit,
    private val weight:(T)->Int,private val limit:Int=128,private val pointLimit:Int=500_000) {
    private val entries=LinkedHashMap<String,T>(16,.75f,true)
    private val active=mutableSetOf<String>()
    fun document(key:String):T=entries.getOrPut(key,create).also {trim(key)}
    fun activate(key:String){active.add(key)}
    fun deactivate(key:String){active.remove(key);trim(null)}
    private fun trim(keep:String?) {
        while(entries.size>limit || entries.values.sumOf(weight)>pointLimit) {
            val old=entries.keys.firstOrNull {it!=keep && it !in active} ?: break
            entries.remove(old)?.let(release)
        }
    }
    fun clear(){entries.values.forEach(release);entries.clear();active.clear()}
    val size get()=entries.size
}

internal class QuestionInkDocument {
    val paper=PizarraCanvasEngine(android.graphics.Color.TRANSPARENT,virtualViewport=true)
    val marks=PizarraCanvasEngine(android.graphics.Color.TRANSPARENT,virtualViewport=true)
    var pageWidthDp by mutableFloatStateOf(0f)
    var viewport by mutableStateOf(InkViewport())
    var marksViewport by mutableStateOf(InkViewport())
    var argb by mutableIntStateOf(0xFF172033.toInt())
    var thickness by mutableFloatStateOf(9f)
    var hand by mutableStateOf(false)
    var eraser by mutableStateOf(false)
    var precise by mutableStateOf(false)
    var annotate by mutableStateOf(false)
    fun releaseRaster(){paper.releaseRaster();marks.releaseRaster()}
    fun release(){paper.release();marks.release()}
    val retainedPoints get()=paper.retainedPoints+marks.retainedPoints
}
internal class QuestionNotebookModel:ViewModel() {
    val documents=QuestionDocumentCache(::QuestionInkDocument,{it.release()},{it.retainedPoints})
    private var pendingExport:android.graphics.Bitmap?=null
    fun holdExport(bitmap:android.graphics.Bitmap){pendingExport?.recycle();pendingExport=bitmap}
    fun takeExport():android.graphics.Bitmap?=pendingExport.also {pendingExport=null}
    override fun onCleared(){pendingExport?.recycle();documents.clear()}
}

internal class StudyNotebookController(val open:Boolean,val toggle:()->Unit)
internal val LocalStudyNotebook=staticCompositionLocalOf<StudyNotebookController?> {null}
internal val LocalQuestionDrawing=staticCompositionLocalOf {false}
