// Pre-typeset the existing TeX map labels. Runtime maps need no WebView or network.
// KaTeX and fonts retain their existing MIT licenses in scientific-math/.
const fs=require('fs'),path=require('path'),http=require('http'),crypto=require('crypto');
process.chdir(path.resolve(__dirname,'../..'));
const assets=path.resolve('androidApp/src/main/assets/scientific-math');
const maps=JSON.parse(fs.readFileSync('build/native-map-layout-proof.json','utf8'));
const labels=[...new Set(maps.flatMap(m=>m.nodes.map(n=>n.label)).filter(t=>/[\\$_^]/.test(t)))];
const out=path.join(assets,'map-labels');fs.mkdirSync(out,{recursive:true});
const {chromium}=require('C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright');
const server=http.createServer((req,res)=>{
 const file=path.resolve(assets,'.'+req.url);
 if(!file.startsWith(assets+path.sep)||!fs.existsSync(file)){res.writeHead(404);res.end();return;}
 res.setHeader('Content-Type',({'.html':'text/html','.js':'application/javascript','.css':'text/css','.woff2':'font/woff2'})[path.extname(file)]||'text/plain');res.end(fs.readFileSync(file));
});
(async()=>{
 await new Promise(r=>server.listen(0,'127.0.0.1',r));let browser;
 const report=[];
 try {
  browser=await chromium.launch({executablePath:'C:/Program Files/Google/Chrome/Application/chrome.exe',headless:true});
  const page=await browser.newPage({viewport:{width:280,height:1600},deviceScaleFactor:2});
  const errors=[];page.on('pageerror',e=>errors.push(e.message));
  const origin=`http://127.0.0.1:${server.address().port}`;
  await page.route('**/*',r=>r.request().url().startsWith(origin)?r.continue():r.abort());
  await page.goto(origin+'/render.html');
  await page.addStyleTag({content:'.prose{font-size:26px!important;line-height:1.2!important}#math{padding:0!important}.math-inline{overflow:visible!important}'});
  for(const text of labels){
   await page.evaluate(text=>window.renderMath({richText:text,expressions:[],fontSize:26,color:'#000000'}),text);
   await page.evaluate(()=>document.fonts.ready);
   if(await page.locator('.fallback').count())throw Error('Unrendered formula: '+text);
   await page.evaluate(()=>{
    document.querySelectorAll('.math-inline').forEach(el=>{
     if(el.scrollWidth>280)el.style.fontSize=(26*280/el.scrollWidth)+'px';
    });
   });
   const overflow=await page.evaluate(()=>document.querySelector('#math').scrollWidth>281);
   if(overflow)throw Error('Clipped label: '+text);
   const hash=crypto.createHash('sha256').update(text).digest('hex');
   const file=path.join(out,hash+'.png');
   await page.locator('#math').screenshot({path:file,omitBackground:true});
   report.push({hash,text,bytes:fs.statSync(file).size});
  }
  if(errors.length)throw Error(errors.join('\n'));
  fs.writeFileSync(path.join(out,'catalog.json'),JSON.stringify(report,null,2));
  console.log(JSON.stringify({labels:report.length,bytes:report.reduce((n,x)=>n+x.bytes,0),errors}));
 }finally{if(browser)await browser.close();await new Promise(r=>server.close(r));}
})().catch(e=>{console.error(e);process.exitCode=1});
