// Exercises the exact native pilot mesh buffer and GLES2 shaders exported by JUnit.
// Chrome WebGL validates the shader/data pipeline; it does not execute Android GLSurfaceView.
const fs=require('fs'),path=require('path'),http=require('http');
const {chromium}=require('C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright');
const root=path.resolve(__dirname,'../..'),dir=path.join(root,'build/plant-cell-pilot');
const html=`<html><style>body{margin:0;background:white}canvas{display:block;width:400px;height:600px}</style><canvas width="400" height="600"></canvas></html>`;
const server=http.createServer((req,res)=>{
 if(req.url==='/'){res.setHeader('Content-Type','text/html');res.end(html);return}
 const name=req.url.slice(1);if(!['vertices.bin','vertex.glsl','fragment.glsl','mesh.json','texture.jpg'].includes(name)){res.writeHead(404);res.end();return}
 res.end(fs.readFileSync(path.join(dir,name)));
});
(async()=>{
 await new Promise(r=>server.listen(0,'127.0.0.1',r));
 const browser=await chromium.launch({channel:'chrome',headless:true,args:['--enable-webgl','--enable-unsafe-swiftshader','--use-angle=swiftshader']});
 try {
  const page=await browser.newPage({viewport:{width:400,height:600}});
  await page.goto('http://127.0.0.1:'+server.address().port+'/');
  const result=await page.evaluate(async()=>{
   const [bin,vs,fs,info]=await Promise.all([fetch('vertices.bin').then(r=>r.arrayBuffer()),fetch('vertex.glsl').then(r=>r.text()),fetch('fragment.glsl').then(r=>r.text()),fetch('mesh.json').then(r=>r.json())]);
   const gl=document.querySelector('canvas').getContext('webgl',{preserveDrawingBuffer:true});if(!gl)throw Error('WebGL unavailable');
   function shader(type,text){const s=gl.createShader(type);gl.shaderSource(s,text);gl.compileShader(s);if(!gl.getShaderParameter(s,gl.COMPILE_STATUS))throw Error(gl.getShaderInfoLog(s));return s}
   const program=gl.createProgram(),v=shader(gl.VERTEX_SHADER,vs),f=shader(gl.FRAGMENT_SHADER,fs);gl.attachShader(program,v);gl.attachShader(program,f);gl.linkProgram(program);if(!gl.getProgramParameter(program,gl.LINK_STATUS))throw Error(gl.getProgramInfoLog(program));gl.useProgram(program);gl.uniform1f(gl.getUniformLocation(program,"emphasis"),1);
   const buffer=gl.createBuffer();gl.bindBuffer(gl.ARRAY_BUFFER,buffer);gl.bufferData(gl.ARRAY_BUFFER,new Float32Array(bin),gl.STATIC_DRAW);
   for(const [name,offset] of [['position',0],['normal',12],['uv',24]]){const a=gl.getAttribLocation(program,name);gl.enableVertexAttribArray(a);gl.vertexAttribPointer(a,name==='uv'?2:3,gl.FLOAT,false,32,offset)}
   const image=await createImageBitmap(await (await fetch('texture.jpg')).blob());const tex=gl.createTexture();gl.activeTexture(gl.TEXTURE0);gl.bindTexture(gl.TEXTURE_2D,tex);gl.texImage2D(gl.TEXTURE_2D,0,gl.RGB,gl.RGB,gl.UNSIGNED_BYTE,image);gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_MIN_FILTER,gl.LINEAR);gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_MAG_FILTER,gl.LINEAR);gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_S,gl.CLAMP_TO_EDGE);gl.texParameteri(gl.TEXTURE_2D,gl.TEXTURE_WRAP_T,gl.CLAMP_TO_EDGE);gl.uniform1i(gl.getUniformLocation(program,'colorTexture'),0);gl.enable(gl.DEPTH_TEST);gl.disable(gl.CULL_FACE);gl.viewport(0,0,400,600);
   function mul(a,b){const o=new Float32Array(16);for(let c=0;c<4;c++)for(let r=0;r<4;r++)for(let k=0;k<4;k++)o[c*4+r]+=a[k*4+r]*b[c*4+k];return o}
   const fov=1/Math.tan(Math.PI/8),near=.1,far=20,projection=new Float32Array([fov/(400/600),0,0,0,0,fov,0,0,0,0,(far+near)/(near-far),-1,0,0,2*far*near/(near-far),0]);
   function render(yaw,distance){
    const a=0*Math.PI/180,c=Math.cos(a),s=Math.sin(a),y=yaw*Math.PI/180,cy=Math.cos(y),sy=Math.sin(y);
    const x=new Float32Array([1,0,0,0,0,c,s,0,0,-s,c,0,0,0,0,1]),rotation=new Float32Array([cy,0,-sy,0,0,1,0,0,sy,0,cy,0,0,0,0,1]),model=mul(x,rotation),view=new Float32Array([1,0,0,0,0,1,0,0,0,0,1,0,0,0,-distance,1]);
    gl.uniformMatrix4fv(gl.getUniformLocation(program,'model'),false,model);gl.uniformMatrix4fv(gl.getUniformLocation(program,'mvp'),false,mul(projection,mul(view,model)));
    gl.clearColor(1,1,1,1);gl.clear(gl.COLOR_BUFFER_BIT|gl.DEPTH_BUFFER_BIT);gl.drawArrays(gl.TRIANGLES,0,info.vertices);gl.finish();
    const pixels=new Uint8Array(400*600*4);gl.readPixels(0,0,400,600,gl.RGBA,gl.UNSIGNED_BYTE,pixels);let colored=0,hash=2166136261;
    for(let i=0;i<pixels.length;i+=4){if(pixels[i+1]<240)colored++;hash=Math.imul(hash^pixels[i],16777619)>>>0}
    if(gl.getError()!==gl.NO_ERROR || colored<1000)throw Error('Blank frame or GL error');return {colored,hash};
   }
   const first=render(-90,4),rotated=render(-45,4),zoomed=render(-45,3.2);if(first.hash===rotated.hash || rotated.hash===zoomed.hash)throw Error('Rotation/zoom did not change the image');
   render(-90,4);window.plantRender=render;window.cardioDispose=()=>{gl.deleteTexture(tex);gl.deleteBuffer(buffer);gl.deleteProgram(program);gl.deleteShader(v);gl.deleteShader(f)};
   return {vertices:info.vertices,components:info.components,first,rotated,zoomed,shaderCompiled:true,nonBlank:true};
  });
  await page.screenshot({path:path.join(root,'build/plant-cell-native-3d.png')});
  await page.evaluate(()=>window.plantRender(90,4));await page.screenshot({path:path.join(root,'build/plant-cell-native-back.png')});await page.evaluate(()=>window.cardioDispose());result.disposed=true;
  fs.writeFileSync(path.join(root,'build/plant-cell-native-shader-report.json'),JSON.stringify(result,null,2));console.log(JSON.stringify(result));
 }finally{await browser.close();server.close()}
})().catch(e=>{console.error(e.message);server.close();process.exitCode=1});
