// Native buffers and shaders are exported by PlantCellPartsTest/PlantCellPilotTest.
const fs=require('fs'),path=require('path'),http=require('http');
const {chromium}=require('C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright');
const root=path.resolve(__dirname,'../..'),dir=path.join(root,'build/plant-cell-pilot');
const server=http.createServer((req,res)=>{
 if(req.url==='/'){res.end('<html><style>body{margin:0;background:white}canvas{display:block}</style><canvas width="400" height="600"></canvas></html>');return}
 const name=req.url.slice(1);if(!['parts-vertices.bin','parts-preview.json','vertex.glsl','fragment.glsl','texture.jpg'].includes(name)){res.writeHead(404);res.end();return}
 res.end(fs.readFileSync(path.join(dir,name)));
});
(async()=>{
 await new Promise(r=>server.listen(0,'127.0.0.1',r));const browser=await chromium.launch({channel:'chrome',headless:true,args:['--enable-webgl','--enable-unsafe-swiftshader','--use-angle=swiftshader']});
 try {
  const page=await browser.newPage({viewport:{width:400,height:600}});await page.goto('http://127.0.0.1:'+server.address().port);
  await page.evaluate(async()=>{
   const [bin,vs,fs,parts]=await Promise.all([fetch('parts-vertices.bin').then(r=>r.arrayBuffer()),fetch('vertex.glsl').then(r=>r.text()),fetch('fragment.glsl').then(r=>r.text()),fetch('parts-preview.json').then(r=>r.json())]);
   const gl=document.querySelector('canvas').getContext('webgl',{preserveDrawingBuffer:true});if(!gl)throw Error('WebGL unavailable');
   function shader(type,text){const s=gl.createShader(type);gl.shaderSource(s,text);gl.compileShader(s);if(!gl.getShaderParameter(s,gl.COMPILE_STATUS))throw Error(gl.getShaderInfoLog(s));return s}
   const program=gl.createProgram(),v=shader(gl.VERTEX_SHADER,vs),f=shader(gl.FRAGMENT_SHADER,fs);gl.attachShader(program,v);gl.attachShader(program,f);gl.linkProgram(program);if(!gl.getProgramParameter(program,gl.LINK_STATUS))throw Error(gl.getProgramInfoLog(program));gl.useProgram(program);
   const buffer=gl.createBuffer();gl.bindBuffer(gl.ARRAY_BUFFER,buffer);gl.bufferData(gl.ARRAY_BUFFER,new Float32Array(bin),gl.STATIC_DRAW);
   for(const [name,offset] of [['position',0],['normal',12],['uv',24]]){const a=gl.getAttribLocation(program,name);gl.enableVertexAttribArray(a);gl.vertexAttribPointer(a,name==='uv'?2:3,gl.FLOAT,false,32,offset)}
   const image=await createImageBitmap(await (await fetch('texture.jpg')).blob()),tex=gl.createTexture();gl.bindTexture(gl.TEXTURE_2D,tex);gl.texImage2D(gl.TEXTURE_2D,0,gl.RGB,gl.RGB,gl.UNSIGNED_BYTE,image);
   for(const p of [gl.TEXTURE_MIN_FILTER,gl.TEXTURE_MAG_FILTER])gl.texParameteri(gl.TEXTURE_2D,p,gl.LINEAR);
   for(const p of [gl.TEXTURE_WRAP_S,gl.TEXTURE_WRAP_T])gl.texParameteri(gl.TEXTURE_2D,p,gl.CLAMP_TO_EDGE);
   gl.uniform1i(gl.getUniformLocation(program,'colorTexture'),0);gl.enable(gl.DEPTH_TEST);gl.disable(gl.CULL_FACE);gl.viewport(0,0,400,600);
   function mul(a,b){const o=new Float32Array(16);for(let c=0;c<4;c++)for(let r=0;r<4;r++)for(let k=0;k<4;k++)o[c*4+r]+=a[k*4+r]*b[c*4+k];return o}
   const identity=()=>new Float32Array([1,0,0,0,0,1,0,0,0,0,1,0,0,0,0,1]);
   function translation(x,y,z){const a=identity();a[12]=x;a[13]=y;a[14]=z;return a}
   function scale(k){const a=identity();a[0]=a[5]=a[10]=k;return a}
   const fov=1/Math.tan(Math.PI/8),projection=new Float32Array([fov/(400/600),0,0,0,0,fov,0,0,0,0,(20+.1)/(.1-20),-1,0,0,2*20*.1/(.1-20),0]);
   window.parts=parts;
   window.renderParts=(selected=null,isolated=false,separated=0)=>{
    const visible=isolated?parts.filter(p=>p.id===selected||p.parentId===selected):parts;
    let scene=new Float32Array([0,0,1,0,0,1,0,0,-1,0,0,0,0,0,0,1]);
    if(isolated){const min=[0,1,2].map(a=>Math.min(...visible.map(p=>p.min[a]))),max=[0,1,2].map(a=>Math.max(...visible.map(p=>p.max[a]))),center=min.map((x,a)=>(x+max[a])/2),k=Math.min(10,1.6/Math.max(.1,...max.map((x,a)=>x-min[a])));scene=mul(scene,mul(scale(k),translation(...center.map(x=>-x))))}
    const view=translation(0,0,-(4+(isolated?0:separated)));
    gl.clearColor(1,1,1,1);gl.clear(gl.COLOR_BUFFER_BIT|gl.DEPTH_BUFFER_BIT);
    for(const p of visible){
     const model=isolated?scene:mul(scene,translation(...p.offset.map(x=>x*separated)));
     gl.uniformMatrix4fv(gl.getUniformLocation(program,'model'),false,model);gl.uniformMatrix4fv(gl.getUniformLocation(program,'mvp'),false,mul(projection,mul(view,model)));
     gl.uniform1f(gl.getUniformLocation(program,'emphasis'),selected===null||p.id===selected||p.parentId===selected?1:.16);
     gl.drawArrays(gl.TRIANGLES,p.firstVertex,p.vertexCount);
    }
    gl.finish();if(gl.getError()!==gl.NO_ERROR)throw Error('GL error');
    const pixels=new Uint8Array(400*600*4);gl.readPixels(0,0,400,600,gl.RGBA,gl.UNSIGNED_BYTE,pixels);let colored=0,hash=2166136261;
    for(let i=0;i<pixels.length;i+=4){if(pixels[i+1]<240)colored++;hash=Math.imul(hash^pixels[i],16777619)>>>0}
    if(colored<100)throw Error('Empty part');return {selected,isolated,separated,colored,hash,drawn:visible.map(p=>p.id)};
   };
   window.releaseParts=()=>{gl.deleteTexture(tex);gl.deleteBuffer(buffer);gl.deleteProgram(program);gl.deleteShader(v);gl.deleteShader(f)};
  });
  const report=[];
  for(const [name,id,isolated,separated] of [['assembled',null,false,0],['highlight','vacuole',false,0],['separated',null,false,1],['nucleus','nucleus',true,0],['nucleolus','nucleolus',true,0],['cell-wall','cell-wall',true,0],['mitochondria','mitochondria',true,0],['chloroplasts','chloroplasts',true,0]]){
   report.push(await page.evaluate(([id,isolated,separated])=>window.renderParts(id,isolated,separated),[id,isolated,separated]));
   await page.screenshot({path:path.join(root,`build/plant-parts-${name}.png`)});
  }
  if(new Set(report.map(r=>r.hash)).size!==report.length)throw Error('Modes did not change the rendered image');
  if(!report.find(r=>r.selected==='nucleus'&&r.isolated).drawn.includes('nucleolus'))throw Error('Nucleus lost its nucleolus');
  await page.evaluate(()=>window.releaseParts());fs.writeFileSync(path.join(root,'build/plant-cell-parts-report.json'),JSON.stringify(report,null,2));console.log(JSON.stringify(report));
 }finally{await browser.close();server.close()}
})().catch(e=>{console.error(e);server.close();process.exitCode=1});
