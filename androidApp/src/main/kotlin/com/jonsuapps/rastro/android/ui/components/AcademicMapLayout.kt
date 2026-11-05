package com.jonsuapps.rastro.android.ui.components

/** A spanning forest supplies geometry only; all authored edges remain in the diagram. */
internal data class AcademicMapBox(val left:Float,val top:Float,val width:Float,val height:Float) {
    val right get()=left+width
    val bottom get()=top+height
    val centerY get()=top+height/2
}
internal data class AcademicMapLayout(val boxes:Map<String,AcademicMapBox>,val width:Float,val height:Float,
    val treeEdges:Set<Pair<String,String>>)

internal fun layoutAcademicMap(diagram:AcademicSourceDiagram,heights:Map<String,Float>):AcademicMapLayout {
    val ids=diagram.nodes.map {it.id}.distinct()
    if(ids.isEmpty())return AcademicMapLayout(emptyMap(),1f,1f,emptySet())
    val incoming=diagram.edges.map {it.to}.toSet()
    val adjacency=diagram.edges.filter {it.from in ids && it.to in ids}.groupBy {it.from}
    val children=mutableMapOf<String,MutableList<String>>()
    val visited=mutableSetOf<String>();val roots=mutableListOf<String>()
    val tree=mutableSetOf<Pair<String,String>>()
    fun visit(id:String) {
        if(!visited.add(id))return
        adjacency[id].orEmpty().forEach {edge -> if(edge.to !in visited) {
            children.getOrPut(id){mutableListOf()}.add(edge.to)
            tree.add(id to edge.to);visit(edge.to)
        } }
    }
    (ids.filter {it !in incoming}+ids).forEach {if(it !in visited){roots.add(it);visit(it)}}
    val spans=mutableMapOf<String,Float>()
    fun span(id:String):Float {
        val descendants=children[id].orEmpty()
        val childSpan=descendants.sumOf {span(it).toDouble()}.toFloat()+maxOf(0,descendants.size-1)*28f
        return maxOf(heights[id]?:100f,childSpan).also {spans[id]=it}
    }
    roots.forEach {span(it)}
    val boxes=linkedMapOf<String,AcademicMapBox>()
    fun place(id:String,depth:Int,top:Float) {
        val height=heights[id]?:100f
        boxes[id]=AcademicMapBox(24f+depth*390f,top+(spans.getValue(id)-height)/2,320f,height)
        var next=top
        children[id].orEmpty().forEach {child ->place(child,depth+1,next);next+=spans.getValue(child)+28f}
    }
    var next=24f
    roots.forEach {place(it,0,next);next+=spans.getValue(it)+64f}
    return AcademicMapLayout(boxes,boxes.values.maxOf {it.right}+24f,next-40f,tree)
}
