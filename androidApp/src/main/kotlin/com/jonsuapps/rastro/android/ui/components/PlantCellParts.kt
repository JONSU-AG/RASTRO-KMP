package com.jonsuapps.rastro.android.ui.components

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import java.nio.ByteBuffer
import java.nio.ByteOrder
import java.security.MessageDigest

internal data class NativeStudyPart(val id:String,val name:String,val description:String,val firstVertex:Int,val vertexCount:Int,
    val min:FloatArray,val max:FloatArray,val offset:FloatArray,val parentId:String?=null) {
    val center get()=FloatArray(3){(min[it]+max[it])/2}
}
@Serializable private data class PartDefinition(val id:String,val name:String,val description:String,val offset:List<Float>)
@Serializable private data class PartDocument(val version:Int,val modelSha256:String,val triangleCount:Int,val assignmentSha256:String,val parts:List<PartDefinition>)

internal fun plantHash(bytes:ByteArray)=MessageDigest.getInstance("SHA-256").digest(bytes).joinToString(""){"%02x".format(it)}

/** Partition the exact original triangles into disjoint ranges; no triangle is invented or lost. */
internal fun attachPlantCellParts(mesh:CardiovascularMesh,json:String,assignment:ByteArray,modelBytes:ByteArray):CardiovascularMesh {
    val document=Json {ignoreUnknownKeys=true}.decodeFromString<PartDocument>(json)
    require(document.version==1 && mesh.vertexStride==32 && mesh.vertexCount%3==0)
    require(document.triangleCount==mesh.vertexCount/3 && assignment.size==document.triangleCount)
    require(document.modelSha256==plantHash(modelBytes) && document.assignmentSha256==plantHash(assignment))
    require(document.parts.size in 2..16 && document.parts.map {it.id}.distinct().size==document.parts.size)
    require(document.parts.all {it.name.isNotBlank() && it.description.isNotBlank() && it.offset.size==3 && it.offset.all {v->v.isFinite() && kotlin.math.abs(v)<=2}})
    require(assignment.all {(it.toInt() and 255) in document.parts.indices})
    val output=ByteBuffer.allocateDirect(mesh.vertices.capacity()).order(ByteOrder.nativeOrder())
    val original=mesh.vertices.duplicate().order(ByteOrder.nativeOrder())
    val triangle=ByteArray(96)
    val parts=document.parts.mapIndexed {index,part->
        val first=output.position()/32;val min=FloatArray(3){Float.POSITIVE_INFINITY};val max=FloatArray(3){Float.NEGATIVE_INFINITY}
        assignment.forEachIndexed {t,group->if((group.toInt() and 255)==index){
            repeat(3){v->repeat(3){axis->val value=original.getFloat(t*96+v*32+axis*4);min[axis]=minOf(min[axis],value);max[axis]=maxOf(max[axis],value)}}
            original.position(t*96);original.get(triangle);output.put(triangle)
        }}
        val count=output.position()/32-first;require(count>0)
        NativeStudyPart(part.id,part.name,part.description,first,count,min,max,part.offset.toFloatArray(),if(part.id=="nucleolus") "nucleus" else null)
    }
    require(output.position()==mesh.vertices.capacity());output.position(0)
    return mesh.copy(vertices=output,parts=parts)
}

internal fun visibleStudyParts(parts:List<NativeStudyPart>,selected:String?,isolated:Boolean):List<NativeStudyPart> =
    if(!isolated || selected==null) parts else parts.filter {it.id==selected || it.parentId==selected}

/** Möller–Trumbore ray/triangle intersection, used after native screen-to-model unprojection. */
internal fun plantRayTriangle(origin:FloatArray,direction:FloatArray,a:FloatArray,b:FloatArray,c:FloatArray):Float? {
    val ax=b[0]-a[0];val ay=b[1]-a[1];val az=b[2]-a[2]
    val bx=c[0]-a[0];val by=c[1]-a[1];val bz=c[2]-a[2]
    val px=direction[1]*bz-direction[2]*by;val py=direction[2]*bx-direction[0]*bz;val pz=direction[0]*by-direction[1]*bx
    val determinant=ax*px+ay*py+az*pz
    if(kotlin.math.abs(determinant)<.0000001f)return null
    val tx=origin[0]-a[0];val ty=origin[1]-a[1];val tz=origin[2]-a[2]
    val u=(tx*px+ty*py+tz*pz)/determinant
    if(u<0 || u>1)return null
    val qx=ty*az-tz*ay;val qy=tz*ax-tx*az;val qz=tx*ay-ty*ax
    val v=(direction[0]*qx+direction[1]*qy+direction[2]*qz)/determinant
    if(v<0 || u+v>1)return null
    return ((bx*qx+by*qy+bz*qz)/determinant).takeIf {it>=0 && it.isFinite()}
}

internal fun pickPlantPart(mesh:CardiovascularMesh,origin:FloatArray,direction:FloatArray,selected:String?,isolated:Boolean,exploded:Float):String? {
    val vertices=mesh.vertices.duplicate().order(ByteOrder.nativeOrder());var distance=Float.POSITIVE_INFINITY;var hit:String?=null
    visibleStudyParts(mesh.parts,selected,isolated).forEach {part->
        val ray=FloatArray(3){origin[it]-if(isolated) 0f else part.offset[it]*exploded}
        var near=0f;var far=Float.POSITIVE_INFINITY
        repeat(3){axis->
            if(kotlin.math.abs(direction[axis])<.0000001f){if(ray[axis]<part.min[axis] || ray[axis]>part.max[axis])far=-1f}
            else {val a=(part.min[axis]-ray[axis])/direction[axis];val b=(part.max[axis]-ray[axis])/direction[axis];near=maxOf(near,minOf(a,b));far=minOf(far,maxOf(a,b))}
        }
        if(near<=far && far>=0 && near<distance) {
            val a=FloatArray(3);val b=FloatArray(3);val c=FloatArray(3)
            for(vertex in part.firstVertex until part.firstVertex+part.vertexCount step 3){
                repeat(3){axis->a[axis]=vertices.getFloat(vertex*32+axis*4);b[axis]=vertices.getFloat((vertex+1)*32+axis*4);c[axis]=vertices.getFloat((vertex+2)*32+axis*4)}
                plantRayTriangle(ray,direction,a,b,c)?.let {d->if(d<distance){distance=d;hit=part.id}}
            }
        }
    }
    return hit
}
