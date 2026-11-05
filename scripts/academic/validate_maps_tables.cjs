// Isolated local renderer check. Does not install or launch the Android app.
'use strict';
const fs=require('fs'),path=require('path'),http=require('http'),assert=require('assert/strict');
process.chdir(path.resolve(__dirname,'../..'));
const {chromium}=require(process.env.RASTRO_PLAYWRIGHT_MODULE||'C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright');
const assets=path.resolve('androidApp/src/main/assets/scientific-math');
const maps=JSON.parse(fs.readFileSync('build/map-render-input.json','utf8'));
const captures=process.argv.filter(a=>a.startsWith('--capture=')).map(a=>a.slice('--capture='.length));
const report={maps:0,nodes:0,edges:0,tableViews:0,checks:[],errors:[]};
const colors={surface:'#fffaf2',accent:'#efe9dc',ink:'#172033',border:'#332d28',concept:'#24658e'};
const server=http.createServer((req,res)=>{
 const file=path.resolve(assets,'.'+decodeURIComponent(req.url.split('?')[0]));
 if(!file.startsWith(assets+path.sep)||!fs.existsSync(file)){res.writeHead(404);res.end();return;}
 res.setHeader('Content-Type',({'.html':'text/html','.css':'text/css','.js':'application/javascript','.woff2':'font/woff2'})[path.extname(file)]||'text/plain');res.end(fs.readFileSync(file));
});
async function run(){
 await new Promise(resolve=>server.listen(0,'127.0.0.1',resolve));
 let browser;
 try {
  const origin=`http://127.0.0.1:${server.address().port}`;
  browser=await chromium.launch({executablePath:process.env.RASTRO_CHROME||'C:/Program Files/Google/Chrome/Application/chrome.exe',headless:true});
  const page=await browser.newPage({viewport:{width:336,height:270}});
  page.on('pageerror',e=>report.errors.push(e.message));
  await page.route('**/*',r=>r.request().url().startsWith(origin)?r.continue():(report.errors.push('External URL '+r.request().url()),r.abort()));
  await page.addInitScript(()=>{
   window.mapAcknowledgements=0;window.mapFailures=0;
   window.RastroMapStatus={ready:()=>window.mapAcknowledgements++,failed:()=>window.mapFailures++};
  });
  await page.goto(origin+'/map.html');
  for(const m of maps) {
   await page.evaluate(p=>window.renderAcademicMap(p),{...m,colors,expanded:false});
   const result=await page.evaluate(()=>{
    const viewport=document.getElementById('viewport').getBoundingClientRect();
    const rects=[...document.querySelectorAll('.node')].map(n=>n.getBoundingClientRect());
    return {nodes:rects.length,edges:document.querySelectorAll('path[data-edge-index]').length,
     clipped:rects.some(r=>r.left<-.5||r.top<-.5||r.right>viewport.right+.5||r.bottom>viewport.bottom+.5),
     fallback:document.querySelectorAll('.fallback').length,width:document.documentElement.scrollWidth};
   });
   assert.equal(result.nodes,m.nodes.length,m.name+' missing nodes');
   assert.equal(result.edges,m.edges.length,m.name+' missing edges');
   assert.equal(result.clipped,false,m.name+' cropped preview');assert.equal(result.width,336);
   assert.equal(result.fallback,0,m.name+' unreadable math');
   if(captures.some(prefix=>m.name.startsWith(prefix))||process.argv.includes('--capture-reviewed-language')&&['lenguaje/semana03/3.3/theory.md#0','lenguaje/semana04/4.1/theory.md#0','lenguaje/semana04/4.2/theory.md#0'].includes(m.name))
    await page.screenshot({path:'build/'+m.name.split('/').slice(0,3).join('-')+'-map.png'});
   report.maps++;report.nodes+=result.nodes;report.edges+=result.edges;
  }
  assert(await page.evaluate(()=>window.mapAcknowledgements)>=maps.length,'Every visible map must confirm rendering');
  assert.equal(await page.evaluate(()=>window.mapFailures),0,'No map runtime failures');
  // A WebView can report page-finished while Compose has not measured it yet.
  await page.evaluate(()=>document.getElementById('viewport').style.height='0px');
  await page.evaluate(p=>window.renderAcademicMap(p),{...maps[0],colors,expanded:false});
  const beforeResize=await page.evaluate(()=>window.mapAcknowledgements);
  await page.evaluate(()=>document.getElementById('viewport').style.height='100%');
  await page.waitForFunction(previous=>window.mapAcknowledgements>previous,beforeResize);
  const sample=maps.find(m=>m.name==='fisica/semana11/11.1/theory.md#0');assert(sample);
  await page.evaluate(p=>window.renderAcademicMap(p),{...sample,colors,expanded:false});
  await page.screenshot({path:'build/map-preview-light.png'});
  const initial=await page.locator('#world').evaluate(n=>n.style.transform);
  await page.mouse.move(168,135);await page.mouse.wheel(0,-500);
  assert.equal(await page.locator('#world').evaluate(n=>n.style.transform),initial,'Thumbnail must not capture zoom');
  await page.setViewportSize({width:360,height:640});
  await page.evaluate(p=>window.renderAcademicMap(p),{...sample,colors,expanded:true});
  const fitted=await page.locator('#world').evaluate(n=>n.style.transform);
  await page.mouse.move(180,320);await page.mouse.wheel(0,-550);
  await page.waitForTimeout(100);
  const zoomed=await page.locator('#world').evaluate(n=>n.style.transform);assert.notEqual(zoomed,fitted,'Zoom must move camera');
  await page.mouse.move(200,320);await page.mouse.down();await page.mouse.move(70,230,{steps:8});await page.mouse.up();
  assert.notEqual(await page.locator('#world').evaluate(n=>n.style.transform),zoomed,'Pan must move camera');
  await page.screenshot({path:'build/map-expanded-zoom.png'});
  await page.evaluate(()=>window.fitAcademicMap());assert.equal(await page.locator('#world').evaluate(n=>n.style.transform),fitted,'Reset must restore real full map');
  const touch=await page.context().newCDPSession(page);
  await touch.send('Input.dispatchTouchEvent',{type:'touchStart',touchPoints:[{x:110,y:280},{x:250,y:360}]});
  await touch.send('Input.dispatchTouchEvent',{type:'touchMove',touchPoints:[{x:65,y:245},{x:295,y:395}]});
  await touch.send('Input.dispatchTouchEvent',{type:'touchEnd',touchPoints:[]});
  assert.notEqual(await page.locator('#world').evaluate(n=>n.style.transform),fitted,'Two-finger pinch must zoom');
  await page.evaluate(()=>window.fitAcademicMap());
  await page.evaluate(p=>window.renderAcademicMap(p),{...sample,expanded:true,colors:{surface:'#21252b',accent:'#344757',ink:'#f5f0e6',border:'#9da8b4',concept:'#63c8f0'}});
  await page.screenshot({path:'build/map-expanded-dark.png'});
  // Original graphs can contain shared children, disconnected nodes and cycles.
  const special={nodes:[{id:'a',label:'Inicio'},{id:'b',label:'Proceso'},{id:'c',label:'Resultado'},{id:'d',label:'Otro concepto'}],edges:[{from:'a',to:'b'},{from:'b',to:'c'},{from:'c',to:'a'},{from:'a',to:'c'}]};
  await page.evaluate(p=>window.renderAcademicMap(p),{...special,colors,expanded:true});
  assert.deepEqual(await page.evaluate(()=>[academicMapReady.nodes,academicMapReady.edges]),[4,4]);
  await page.evaluate(p=>window.renderAcademicMap(p),{nodes:[{id:'x',label:'<img src=x onerror="window.injection=true">'}],edges:[],colors,expanded:true});
  assert.equal(await page.evaluate(()=>!!window.injection||!!document.querySelector('img')),false);
  report.checks.push('Full real graph, wheel zoom, touch pinch, pan, fit, dark theme, cycles, disconnected nodes and escaped source checked');
  await page.evaluate(()=>window.dispatchEvent(new Event('unhandledrejection')));
  assert.equal(await page.evaluate(()=>window.mapFailures),1,'Runtime rejection must notify native fallback');
  report.checks.push('Native acknowledgement, delayed measured bounds and runtime failure notification');
  await page.goto(origin+'/render.html');
  await page.evaluate(()=>window.renderMath({expressions:[],fontSize:20,color:'#172033',tables:[{headers:['Magnitud','Definición completa','Relación matemática','Unidad'],rows:[['Rapidez','Distancia recorrida por unidad de tiempo','$v = d/t$','m/s'],['Aceleración','Variación de velocidad por unidad de tiempo','$a = \\Delta v/\\Delta t$','m/s²']]}]}));
  await page.evaluate(()=>document.fonts.ready);
  const table=await page.locator('.table-scroll').evaluate(n=>{n.scrollLeft=200;return{width:n.clientWidth,content:n.scrollWidth,scroll:n.scrollLeft,overflowY:getComputedStyle(n).overflowY,touch:getComputedStyle(n).touchAction,body:document.documentElement.scrollWidth};});
  assert(table.content>table.width);assert(table.scroll>0);assert.equal(table.overflowY,'hidden');assert.equal(table.touch,'pan-x');assert.equal(table.body,360);
  await page.screenshot({path:'build/table-horizontal-scroll.png'});report.checks.push({table});
  for(const source of JSON.parse(fs.readFileSync('build/table-render-input.json','utf8')))for(const mode of ['light','dark','large']){
   await page.evaluate(({source,mode})=>window.renderMath({expressions:[],fontSize:mode==='large'?26:19,color:mode==='dark'?'#f5f0e6':'#172033',tables:[source]}),{source,mode});
   const actual=await page.evaluate(()=>{const n=document.querySelector('.table-scroll');n.scrollLeft=100000;return {rows:document.querySelectorAll('tbody tr').length,cells:document.querySelectorAll('tbody td').length,width:document.documentElement.scrollWidth,scroll:n.scrollLeft,overflow:n.scrollWidth>n.clientWidth,fallback:[...document.querySelectorAll('.fallback')].map(n=>n.textContent)};});
   assert.equal(actual.rows,source.rows.length,source.name+' rows');assert.equal(actual.cells,source.rows.flat().length,source.name+' cells');assert.equal(actual.width,360,source.name+' overflow');
   if(actual.overflow)assert(actual.scroll>0,source.name+' blocked scroll');
   assert.equal(actual.fallback.length,0,source.name+' unreadable math: '+actual.fallback.join(', '));
   report.tableViews++;
  }
  assert.equal(report.errors.length,0,report.errors.join('\n'));
 } finally {if(browser)await browser.close();await new Promise(resolve=>server.close(resolve));}
}
run().catch(e=>{report.errors.push(e.stack);process.exitCode=1;}).finally(()=>{fs.writeFileSync('build/maps-tables-browser-report.json',JSON.stringify(report,null,2));console.log(JSON.stringify(report));});
