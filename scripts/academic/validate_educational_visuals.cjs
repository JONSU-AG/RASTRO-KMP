// Actual exported Android viewer documents and distributed assets, not a replacement mock viewer.
const fs=require('fs'),path=require('path'),http=require('http');
const root=path.resolve(__dirname,'../..'),assets=path.join(root,'androidApp/src/main/assets/educational-visuals'),previews=path.join(root,'build/educational-visuals-preview');
const {chromium}=require('C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright');
const report={views:[],externalRequests:[],errors:[]};
const server=http.createServer((req,res)=>{
 const name=decodeURIComponent(new URL(req.url,'http://local').pathname).replace(/^\//,'');
 const base=name.endsWith('.html')?previews:assets,file=path.resolve(base,name);
 if(!file.startsWith(base+path.sep)||!fs.existsSync(file)){res.writeHead(404);res.end();return}
 res.setHeader('Content-Type',({'.html':'text/html','.js':'text/javascript','.svg':'image/svg+xml','.glb':'model/gltf-binary'})[path.extname(file)]||'application/octet-stream');
 fs.createReadStream(file).pipe(res);
});
(async()=>{
 await new Promise(r=>server.listen(0,'127.0.0.1',r));
 const base=`http://127.0.0.1:${server.address().port}`;
 const browser=await chromium.launch({channel:'chrome',headless:true,args:['--enable-webgl','--enable-unsafe-swiftshader','--ignore-gpu-blocklist','--use-angle=swiftshader']});
 try {
  for(const file of fs.readdirSync(previews).filter(f=>f.endsWith('.html')).sort()) {
   const page=await browser.newPage({viewport:{width:360,height:640}}),requests=[];
   await page.route('**/*',route=>{
    if(!route.request().url().startsWith(base)){report.externalRequests.push(route.request().url());return route.abort()}
    requests.push(route.request().url());return route.continue();
   });
   page.on('pageerror',e=>report.errors.push({file,error:e.message}));
   const started=Date.now();await page.goto(`${base}/${file}`,{waitUntil:'networkidle'});
   const view={file,loadMs:0,localRequests:0};
   if(file.includes('-3d')) {
    await page.waitForFunction(()=>document.body.dataset.loaded==='true'||document.body.dataset.failed==='true',null,{timeout:60000});
    if(await page.getAttribute('body','data-failed')==='true')throw Error('Model failed to load');
    view.loadMs=Date.now()-started;
    const before=await page.evaluate(()=>{const v=document.getElementById('viewer');const o=v.getCameraOrbit();return {theta:o.theta,radius:o.radius}});
    await page.mouse.move(100,300);await page.mouse.down();await page.mouse.move(260,300,{steps:15});await page.mouse.up();
    await page.waitForFunction(theta=>Math.abs(document.getElementById('viewer').getCameraOrbit().theta-theta)>0.05,before.theta,{timeout:5000});
    await page.mouse.wheel(0,-220);
    await page.waitForFunction(radius=>Math.abs(document.getElementById('viewer').getCameraOrbit().radius-radius)>0.01,before.radius,{timeout:5000});
    view.cameraAfter=await page.evaluate(()=>{const o=document.getElementById('viewer').getCameraOrbit();return {theta:o.theta,radius:o.radius}});
    view.rotationVerified=true;view.zoomVerified=true;
    await page.screenshot({path:path.join(root,'build/educational-heart-3d.png')});
    await page.evaluate(()=>document.getElementById('viewer').remove());
    view.removed=await page.locator('model-viewer').count()===0;
   } else {
    await page.locator('img').evaluate(img=>img.decode());
    view.image=await page.locator('img').evaluate(img=>({width:img.naturalWidth,height:img.naturalHeight}));
    if(!view.image.width||!view.image.height)throw Error('SVG is empty');
    if(requests.some(x=>x.endsWith('.glb')||x.includes('model-viewer.min.js')))throw Error('2D view eagerly downloaded 3D');
    await page.screenshot({path:path.join(root,'build',file.replace('.html','.png'))});
    view.loadMs=Date.now()-started;
   }
   view.localRequests=requests.length;report.views.push(view);await page.close();
  }
 } catch(e) {report.errors.push({error:e.message})}
 finally {await browser.close();server.close()}
 fs.writeFileSync(path.join(root,'build/educational-visuals-browser-report.json'),JSON.stringify(report,null,2));
 console.log(JSON.stringify(report));if(report.errors.length||report.externalRequests.length)process.exitCode=1;
})();
