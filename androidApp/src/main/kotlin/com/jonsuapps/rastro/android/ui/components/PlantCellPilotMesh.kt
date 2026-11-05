package com.jonsuapps.rastro.android.ui.components

import com.jonsuapps.rastro.model.EducationalVisual
import kotlinx.serialization.json.*
import java.nio.ByteBuffer
import java.nio.ByteOrder

internal fun isPlantCellPilot(resource:EducationalVisual)=resource.id=="cellforge-plant" && resource.subjectId=="biologia" && resource.lessonIds==listOf("bio_t05_s04")

/** Decodes the optimized CellForge asset, keeping UV coordinates and its actual color texture. */
internal fun decodePlantCellMesh(bytes:ByteArray):CardiovascularMesh {
    require(bytes.size in 28..8_000_000)
    val data=ByteBuffer.wrap(bytes).order(ByteOrder.LITTLE_ENDIAN)
    require(data.int==0x46546c67 && data.int==2 && data.int==bytes.size)
    val jsonLength=data.int;require(data.int==0x4e4f534a && jsonLength>0 && jsonLength<=bytes.size-28)
    val jsonBytes=ByteArray(jsonLength);data.get(jsonBytes)
    val root=Json.parseToJsonElement(String(jsonBytes,Charsets.UTF_8)).jsonObject
    val binLength=data.int;require(data.int==0x004e4942 && binLength==data.remaining());val start=data.position()
    val buffers=root.getValue("buffers").jsonArray
    require(buffers.size==1 && "uri" !in buffers.single().jsonObject && "extensionsRequired" !in root)
    require(root.getValue("nodes").jsonArray.all {n->listOf("matrix","rotation","translation","scale").none {it in n.jsonObject}})
    val views=root.getValue("bufferViews").jsonArray
    val accessors=root.getValue("accessors").jsonArray
    fun number(j:JsonObject,k:String,d:Int=0)=j[k]?.jsonPrimitive?.int ?: d
    fun accessor(index:Int)=accessors[index].jsonObject
    fun viewRange(index:Int):Pair<Int,Int> {
        val v=views[index].jsonObject;require(number(v,"buffer")==0)
        val p=number(v,"byteOffset");val length=number(v,"byteLength")
        require(p>=0 && length>=0 && p.toLong()+length<=binLength)
        return start+p to length
    }
    fun offset(a:JsonObject,width:Int):Pair<Int,Int> {
        require("sparse" !in a)
        val (p,length)=viewRange(a.getValue("bufferView").jsonPrimitive.int)
        val view=views[a.getValue("bufferView").jsonPrimitive.int].jsonObject
        val stride=number(view,"byteStride",width);require(stride>=width && stride<=256)
        val local=number(a,"byteOffset");require(local>=0 && local.toLong()+(number(a,"count")-1L)*stride+width<=length)
        return p+local to stride
    }
    val meshes=root.getValue("meshes").jsonArray;require(meshes.size==1)
    val primitives=meshes.single().jsonObject.getValue("primitives").jsonArray;require(primitives.size==1)
    val primitive=primitives.single().jsonObject;require(number(primitive,"mode",4)==4)
    val attrs=primitive.getValue("attributes").jsonObject
    val p=accessor(attrs.getValue("POSITION").jsonPrimitive.int);val n=accessor(attrs.getValue("NORMAL").jsonPrimitive.int)
    val uv=accessor(attrs.getValue("TEXCOORD_0").jsonPrimitive.int);val ix=accessor(primitive.getValue("indices").jsonPrimitive.int)
    require(listOf(p,n,uv).all {number(it,"componentType")==5126})
    require(listOf(p,n).all {it.getValue("type").jsonPrimitive.content=="VEC3"} && uv.getValue("type").jsonPrimitive.content=="VEC2")
    require(number(p,"count")==number(n,"count") && number(p,"count")==number(uv,"count"))
    val count=number(ix,"count");require(count in 3..300_000 && count%3==0)
    val indexWidth=when(number(ix,"componentType")){5125->4;5123->2;else->error("Unsupported indices")}
    val (po,ps)=offset(p,12);val (no,ns)=offset(n,12);val (uo,us)=offset(uv,8);val (io,isz)=offset(ix,indexWidth)
    val min=p.getValue("min").jsonArray.map {it.jsonPrimitive.float};val max=p.getValue("max").jsonArray.map {it.jsonPrimitive.float}
    val center=FloatArray(3){(min[it]+max[it])/2};val span=(0..2).maxOf {max[it]-min[it]};require(span>0 && span.isFinite())
    val output=ByteBuffer.allocateDirect(count*32).order(ByteOrder.nativeOrder());val floats=output.asFloatBuffer()
    repeat(count) {i->
        val index=if(indexWidth==4) data.getInt(io+i*isz) else data.getShort(io+i*isz).toInt() and 0xFFFF
        require(index in 0 until number(p,"count"))
        repeat(3){axis->val value=(data.getFloat(po+index*ps+axis*4)-center[axis])*2f/span;require(value.isFinite());floats.put(value)}
        repeat(3){axis->val value=data.getFloat(no+index*ns+axis*4);require(value.isFinite());floats.put(value)}
        repeat(2){axis->val value=data.getFloat(uo+index*us+axis*4);require(value.isFinite());floats.put(value)}
    }
    val material=root.getValue("materials").jsonArray[primitive.getValue("material").jsonPrimitive.int].jsonObject
    val textureIndex=material.getValue("pbrMetallicRoughness").jsonObject.getValue("baseColorTexture").jsonObject.getValue("index").jsonPrimitive.int
    val imageIndex=root.getValue("textures").jsonArray[textureIndex].jsonObject.getValue("source").jsonPrimitive.int
    val image=root.getValue("images").jsonArray[imageIndex].jsonObject;require("uri" !in image && image.getValue("mimeType").jsonPrimitive.content=="image/jpeg")
    val (imageOffset,imageLength)=viewRange(image.getValue("bufferView").jsonPrimitive.int)
    val texture=bytes.copyOfRange(imageOffset,imageOffset+imageLength)
    return CardiovascularMesh(output,count,1,32,texture)
}
