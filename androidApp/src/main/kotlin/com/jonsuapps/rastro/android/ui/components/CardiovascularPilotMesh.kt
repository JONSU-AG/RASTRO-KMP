package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.EducationalVisual
import kotlinx.serialization.json.*
import java.nio.ByteBuffer
import java.nio.ByteOrder

internal fun isCardiovascularPilot(resource:EducationalVisual)=resource.id=="human-heart" &&
    resource.subjectId=="biologia" && resource.lessonIds==listOf("bio_t08_s03")

internal data class CardiovascularMesh(val vertices:ByteBuffer,val vertexCount:Int,val componentCount:Int,
    val vertexStride:Int=24,val colorTexture:ByteArray?=null,val parts:List<NativeStudyPart> = emptyList())

/** Only the shipped, normalized BodyParts3D pilot: no transforms, textures or external buffers. */
internal fun decodeCardiovascularMesh(bytes:ByteArray):CardiovascularMesh {
    require(bytes.size in 20..8_000_000)
    val data=ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
    require(data.int==0x46546c67 && data.int==2 && data.int==bytes.size)
    val jsonLength=data.int;require(data.int==0x4e4f534a && jsonLength>0 && jsonLength<=bytes.size-28)
    val jsonBytes=ByteArray(jsonLength);data.get(jsonBytes)
    val root=Json.parseToJsonElement(String(jsonBytes,Charsets.UTF_8)).jsonObject
    val binLength=data.int;require(data.int==0x004e4942 && binLength==data.remaining())
    val binStart=data.position()
    val buffers=root.getValue("buffers").jsonArray
    require(buffers.size==1 && "uri" !in buffers.single().jsonObject)
    require(root.getValue("nodes").jsonArray.all {node->listOf("matrix","translation","rotation","scale").none {it in node.jsonObject}})
    val views=root.getValue("bufferViews").jsonArray
    val accessors=root.getValue("accessors").jsonArray
    fun accessor(index:Int)=accessors[index].jsonObject
    fun number(j:JsonObject,key:String,default:Int=0)=j[key]?.jsonPrimitive?.int ?: default
    fun offset(a:JsonObject,width:Int):Int {
        val v=views[a.getValue("bufferView").jsonPrimitive.int].jsonObject
        require(number(v,"buffer")==0 && "byteStride" !in v && "sparse" !in a)
        val pos=number(v,"byteOffset")+number(a,"byteOffset")
        require(pos>=0 && pos.toLong()+number(a,"count").toLong()*width<=binLength)
        require(number(a,"byteOffset").toLong()+number(a,"count").toLong()*width<=number(v,"byteLength"))
        return binStart+pos
    }
    val meshes=root.getValue("meshes").jsonArray
    require(meshes.size==83)
    val primitives=meshes.flatMap {it.jsonObject.getValue("primitives").jsonArray}.map {it.jsonObject}
    val count=primitives.sumOf {number(accessor(it.getValue("indices").jsonPrimitive.int),"count")}
    require(count in 3..600_000 && count%3==0)
    val output=ByteBuffer.allocateDirect(count*6*4).order(ByteOrder.nativeOrder())
    val floats=output.asFloatBuffer()
    primitives.forEach {primitive ->
        require(number(primitive,"mode",4)==4)
        val attrs=primitive.getValue("attributes").jsonObject
        val p=accessor(attrs.getValue("POSITION").jsonPrimitive.int)
        val n=accessor(attrs.getValue("NORMAL").jsonPrimitive.int)
        require(number(p,"componentType")==5126 && number(n,"componentType")==5126)
        require(p.getValue("type").jsonPrimitive.content=="VEC3" && n.getValue("type").jsonPrimitive.content=="VEC3")
        require(number(p,"count")==number(n,"count"))
        val po=offset(p,12);val no=offset(n,12)
        val indices=accessor(primitive.getValue("indices").jsonPrimitive.int)
        require(number(indices,"componentType")==5125 && indices.getValue("type").jsonPrimitive.content=="SCALAR")
        val io=offset(indices,4)
        repeat(number(indices,"count")) {i->
            val index=data.getInt(io+i*4);require(index in 0 until number(p,"count"))
            repeat(3) {axis->val value=data.getFloat(po+index*12+axis*4);require(value.isFinite() && kotlin.math.abs(value)<=2f);floats.put(value)}
            repeat(3) {axis->val value=data.getFloat(no+index*12+axis*4);require(value.isFinite());floats.put(value)}
        }
    }
    output.position(0)
    return CardiovascularMesh(output,count,meshes.size)
}

internal data class CardiovascularCamera(val yaw:Float=0f,val pitch:Float=10f,val distance:Float=4f) {
    fun rotate(dx:Float,dy:Float)=copy(yaw=(yaw+dx*.45f)%360f,pitch=(pitch+dy*.45f).coerceIn(-80f,80f))
    fun zoom(scale:Float)=if(!scale.isFinite() || scale<=0f) this else copy(distance=(distance/scale).coerceIn(2.6f,7f))
}
