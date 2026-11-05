package com.jonsuapps.rastro.android.ui.components

import android.content.Context
import android.opengl.GLES20
import android.opengl.GLSurfaceView
import android.opengl.Matrix
import android.view.MotionEvent
import android.view.ScaleGestureDetector
import java.nio.ByteBuffer
import javax.microedition.khronos.egl.EGLConfig
import javax.microedition.khronos.opengles.GL10

internal const val CARDIO_VERTEX_SHADER="""
attribute vec3 position;
attribute vec3 normal;
uniform mat4 mvp;
uniform mat4 model;
varying vec3 surfaceNormal;
void main(){gl_Position=mvp*vec4(position,1.0);surfaceNormal=mat3(model)*normal;}
"""
internal const val CARDIO_FRAGMENT_SHADER="""
precision mediump float;
varying vec3 surfaceNormal;
void main(){
    vec3 n=normalize(surfaceNormal);
    float light=0.30+0.48*abs(dot(n,normalize(vec3(0.6,0.8,1.0))))+0.18*abs(dot(n,normalize(vec3(-0.8,0.2,0.4))));
    gl_FragColor=vec4(vec3(0.70,0.16,0.22)*light,1.0);
}
"""

internal const val PLANT_VERTEX_SHADER="""
attribute vec3 position;
attribute vec3 normal;
attribute vec2 uv;
uniform mat4 mvp;
uniform mat4 model;
varying vec3 surfaceNormal;
varying vec2 textureUv;
void main(){gl_Position=mvp*vec4(position,1.0);surfaceNormal=mat3(model)*normal;textureUv=uv;}
"""
internal const val PLANT_FRAGMENT_SHADER="""
precision mediump float;
varying vec3 surfaceNormal;
varying vec2 textureUv;
uniform sampler2D colorTexture;
uniform float emphasis;
void main(){
    vec3 n=normalize(surfaceNormal);
    float light=0.65+0.35*abs(dot(n,normalize(vec3(0.4,0.6,1.0))));
    gl_FragColor=vec4(mix(vec3(0.87),texture2D(colorTexture,textureUv).rgb*light,emphasis),1.0);
}
"""

/** Pilot-only native renderer. No WebView, JavaScript, CDN or runtime model converter. */
internal class CardiovascularPilotSurface(context:Context,mesh:CardiovascularMesh,onFrame:()->Unit,onFailure:()->Unit,
    private val initialCamera:CardiovascularCamera=CardiovascularCamera(),description:String="Modelo anatómico del corazón. Arrastra para girar y pellizca para ampliar.",
    private val onPartSelected:((String)->Unit)?=null):GLSurfaceView(context) {
    private val renderer=HeartRenderer(mesh,{post(onFrame)},{post(onFailure)}).apply {camera=initialCamera}
    private var x=0f;private var y=0f
    private var downX=0f;private var downY=0f;private var moved=false;private var multiple=false
    private val slop=android.view.ViewConfiguration.get(context).scaledTouchSlop
    private val scale=ScaleGestureDetector(context,object:ScaleGestureDetector.SimpleOnScaleGestureListener(){
        override fun onScale(detector:ScaleGestureDetector):Boolean {renderer.camera=renderer.camera.zoom(detector.scaleFactor);requestRender();return true}
    })
    init {
        setEGLContextClientVersion(2)
        setEGLConfigChooser(8,8,8,8,16,0)
        setRenderer(renderer)
        renderMode=RENDERMODE_WHEN_DIRTY
        contentDescription=description
    }
    fun resetCamera(){renderer.camera=initialCamera;requestRender()}
    fun releaseSource(){renderer.releaseSource()}
    fun setPartView(selected:String?,isolated:Boolean,separated:Float){renderer.partView=NativePartView(selected,isolated,separated);requestRender()}
    override fun onTouchEvent(event:MotionEvent):Boolean {
        scale.onTouchEvent(event)
        when(event.actionMasked){
            MotionEvent.ACTION_DOWN->{x=event.x;y=event.y;downX=x;downY=y;moved=false;multiple=false;parent?.requestDisallowInterceptTouchEvent(true)}
            MotionEvent.ACTION_POINTER_DOWN->{multiple=true}
            MotionEvent.ACTION_MOVE->{
                if(kotlin.math.abs(event.x-downX)>slop || kotlin.math.abs(event.y-downY)>slop)moved=true
                if(event.pointerCount==1 && !scale.isInProgress){renderer.camera=renderer.camera.rotate(event.x-x,event.y-y);requestRender()}
                x=event.x;y=event.y
            }
            MotionEvent.ACTION_UP->{
                if(!moved && !multiple && onPartSelected!=null){val px=event.x;val py=event.y;queueEvent {renderer.pick(px,py)?.let {part->post {onPartSelected.invoke(part)}}}}
                parent?.requestDisallowInterceptTouchEvent(false);performClick()
            }
            MotionEvent.ACTION_CANCEL->parent?.requestDisallowInterceptTouchEvent(false)
            MotionEvent.ACTION_POINTER_UP->{x=event.x;y=event.y}
        }
        return true
    }
    override fun performClick():Boolean {super.performClick();return true}
}

private data class NativePartView(val selected:String?=null,val isolated:Boolean=false,val separated:Float=0f)

private class HeartRenderer(mesh:CardiovascularMesh,private val onFrame:()->Unit,private val onFailure:()->Unit):GLSurfaceView.Renderer {
    @Volatile var camera=CardiovascularCamera()
    @Volatile var partView=NativePartView()
    @Volatile private var source:CardiovascularMesh?=mesh
    private var program=0;private var buffer=0;private var count=0;private var ready=false;private var failed=false
    private var position=0;private var normal=0;private var mvpLocation=0;private var modelLocation=0
    private var uv=-1;private var texture=0;private var stride=24
    private var emphasisLocation=-1;private var width=1;private var height=1
    private val scene=FloatArray(16)
    private val projection=FloatArray(16);private val view=FloatArray(16);private val model=FloatArray(16)
    private val mv=FloatArray(16);private val mvp=FloatArray(16)
    fun releaseSource(){source=null}
    private fun shader(type:Int,text:String):Int {
        val s=GLES20.glCreateShader(type);GLES20.glShaderSource(s,text);GLES20.glCompileShader(s)
        val status=IntArray(1);GLES20.glGetShaderiv(s,GLES20.GL_COMPILE_STATUS,status,0)
        if(status[0]==0){GLES20.glDeleteShader(s);error("Shader not supported")}
        return s
    }
    override fun onSurfaceCreated(gl:GL10?,config:EGLConfig?) {
        ready=false;failed=false
        try {
            val data=source ?: return
            val textured=data.colorTexture!=null
            val vertex=shader(GLES20.GL_VERTEX_SHADER,if(textured) PLANT_VERTEX_SHADER else CARDIO_VERTEX_SHADER)
            val fragment=shader(GLES20.GL_FRAGMENT_SHADER,if(textured) PLANT_FRAGMENT_SHADER else CARDIO_FRAGMENT_SHADER)
            program=GLES20.glCreateProgram();GLES20.glAttachShader(program,vertex);GLES20.glAttachShader(program,fragment);GLES20.glLinkProgram(program)
            GLES20.glDeleteShader(vertex);GLES20.glDeleteShader(fragment)
            val status=IntArray(1);GLES20.glGetProgramiv(program,GLES20.GL_LINK_STATUS,status,0);check(status[0]!=0)
            position=GLES20.glGetAttribLocation(program,"position");normal=GLES20.glGetAttribLocation(program,"normal")
            mvpLocation=GLES20.glGetUniformLocation(program,"mvp");modelLocation=GLES20.glGetUniformLocation(program,"model")
            emphasisLocation=GLES20.glGetUniformLocation(program,"emphasis")
            stride=data.vertexStride
            uv=if(textured) GLES20.glGetAttribLocation(program,"uv") else -1
            data.colorTexture?.let {bytes->
                val bitmap=android.graphics.BitmapFactory.decodeByteArray(bytes,0,bytes.size) ?: error("Texture unavailable")
                try {
                    check(bitmap.width<=2048 && bitmap.height<=2048)
                    val ids=IntArray(1);GLES20.glGenTextures(1,ids,0);texture=ids[0]
                    GLES20.glBindTexture(GLES20.GL_TEXTURE_2D,texture)
                    GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,GLES20.GL_TEXTURE_MIN_FILTER,GLES20.GL_LINEAR)
                    GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,GLES20.GL_TEXTURE_MAG_FILTER,GLES20.GL_LINEAR)
                    GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,GLES20.GL_TEXTURE_WRAP_S,GLES20.GL_CLAMP_TO_EDGE)
                    GLES20.glTexParameteri(GLES20.GL_TEXTURE_2D,GLES20.GL_TEXTURE_WRAP_T,GLES20.GL_CLAMP_TO_EDGE)
                    android.opengl.GLUtils.texImage2D(GLES20.GL_TEXTURE_2D,0,bitmap,0)
                }finally {bitmap.recycle()}
            }
            val ids=IntArray(1);GLES20.glGenBuffers(1,ids,0);buffer=ids[0]
            GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER,buffer)
            data.vertices.position(0)
            GLES20.glBufferData(GLES20.GL_ARRAY_BUFFER,data.vertexCount*stride,data.vertices,GLES20.GL_STATIC_DRAW)
            count=data.vertexCount
            GLES20.glEnable(GLES20.GL_DEPTH_TEST)
            GLES20.glDisable(GLES20.GL_CULL_FACE)
            check(GLES20.glGetError()==GLES20.GL_NO_ERROR)
        }catch(error:Exception){android.util.Log.e("RastroCardio83","No se pudo preparar el visor nativo",error);failed=true;onFailure()}
    }
    override fun onSurfaceChanged(gl:GL10?,width:Int,height:Int) {
        this.width=width;this.height=height
        GLES20.glViewport(0,0,width,height)
        Matrix.perspectiveM(projection,0,45f,width.toFloat()/height.coerceAtLeast(1),.1f,20f)
    }
    private fun prepareScene(data:CardiovascularMesh,state:NativePartView) {
        val c=camera
        Matrix.setLookAtM(view,0,0f,0f,c.distance+if(state.isolated)0f else state.separated,0f,0f,0f,0f,1f,0f)
        Matrix.setIdentityM(scene,0);Matrix.rotateM(scene,0,c.pitch,1f,0f,0f);Matrix.rotateM(scene,0,c.yaw,0f,1f,0f)
        if(state.isolated && state.selected!=null) {
            val parts=visibleStudyParts(data.parts,state.selected,true)
            if(parts.isNotEmpty()) {
                val min=FloatArray(3){a->parts.minOf {it.min[a]}};val max=FloatArray(3){a->parts.maxOf {it.max[a]}}
                val scale=(1.6f/(0..2).maxOf {max[it]-min[it]}.coerceAtLeast(.1f)).coerceAtMost(10f)
                Matrix.scaleM(scene,0,scale,scale,scale)
                Matrix.translateM(scene,0,-(min[0]+max[0])/2,-(min[1]+max[1])/2,-(min[2]+max[2])/2)
            }
        }
    }
    fun pick(x:Float,y:Float):String? {
        val data=source ?: return null
        if(data.parts.isEmpty() || width<1 || height<1)return null
        val state=partView;prepareScene(data,state)
        val pv=FloatArray(16);val transform=FloatArray(16);val inverse=FloatArray(16)
        Matrix.multiplyMM(pv,0,projection,0,view,0);Matrix.multiplyMM(transform,0,pv,0,scene,0)
        if(!Matrix.invertM(inverse,0,transform,0))return null
        fun unproject(z:Float):FloatArray {
            val output=FloatArray(4);Matrix.multiplyMV(output,0,inverse,0,floatArrayOf(2*x/width-1,1-2*y/height,z,1f),0)
            return FloatArray(3){output[it]/output[3]}
        }
        val origin=unproject(-1f);val far=unproject(1f);val direction=FloatArray(3){far[it]-origin[it]}
        return pickPlantPart(data,origin,direction,state.selected,state.isolated,state.separated)
    }
    override fun onDrawFrame(gl:GL10?) {
        GLES20.glClearColor(1f,1f,1f,1f);GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT or GLES20.GL_DEPTH_BUFFER_BIT)
        if(failed || source==null || program==0 || count==0)return
        try {
            val state=partView;prepareScene(source!!,state)
            GLES20.glUseProgram(program)
            GLES20.glBindBuffer(GLES20.GL_ARRAY_BUFFER,buffer)
            GLES20.glEnableVertexAttribArray(position);GLES20.glEnableVertexAttribArray(normal)
            GLES20.glVertexAttribPointer(position,3,GLES20.GL_FLOAT,false,stride,0)
            GLES20.glVertexAttribPointer(normal,3,GLES20.GL_FLOAT,false,stride,12)
            if(uv>=0){
                GLES20.glEnableVertexAttribArray(uv);GLES20.glVertexAttribPointer(uv,2,GLES20.GL_FLOAT,false,stride,24)
                GLES20.glActiveTexture(GLES20.GL_TEXTURE0);GLES20.glBindTexture(GLES20.GL_TEXTURE_2D,texture)
                GLES20.glUniform1i(GLES20.glGetUniformLocation(program,"colorTexture"),0)
            }
            val data=source ?: return
            val parts=visibleStudyParts(data.parts,state.selected,state.isolated)
            fun draw(first:Int,vertices:Int,part:NativeStudyPart?) {
                System.arraycopy(scene,0,model,0,16)
                if(part!=null && !state.isolated)Matrix.translateM(model,0,part.offset[0]*state.separated,part.offset[1]*state.separated,part.offset[2]*state.separated)
                Matrix.multiplyMM(mv,0,view,0,model,0);Matrix.multiplyMM(mvp,0,projection,0,mv,0)
                GLES20.glUniformMatrix4fv(mvpLocation,1,false,mvp,0);GLES20.glUniformMatrix4fv(modelLocation,1,false,model,0)
                GLES20.glUniform1f(emphasisLocation,if(state.selected==null || part?.id==state.selected || part?.parentId==state.selected)1f else .16f)
                GLES20.glDrawArrays(GLES20.GL_TRIANGLES,first,vertices)
            }
            if(data.parts.isEmpty())draw(0,count,null) else parts.forEach {draw(it.firstVertex,it.vertexCount,it)}
            check(GLES20.glGetError()==GLES20.GL_NO_ERROR)
            if(!ready){ready=true;onFrame()}
        }catch(error:Exception){android.util.Log.e("RastroCardio83","No se pudo dibujar el modelo nativo",error);failed=true;onFailure()}
    }
}
