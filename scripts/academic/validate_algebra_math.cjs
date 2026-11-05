// Validate the authored preview with the exact offline renderer shipped in Android.
const fs=require('fs'),path=require('path'),http=require('http');
const root=path.resolve(__dirname,'../..');process.chdir(root);
const assets=path.resolve('androidApp/src/main/assets/scientific-math');
const katex=require(path.join(assets,'katex.min.js'));
const {scientificRuns}=require(path.join(assets,'rich-text.js'));
const questions=JSON.parse(fs.readFileSync('build/algebra-02-16-preview.json','utf8'));
const report={questions:questions.length,mathFragments:0,errors:[],browser:[]};
for(const q of questions)for(const text of [q.statement,...q.options,q.explanation])for(const run of scientificRuns(text))if(run.math){
 report.mathFragments++;try{katex.renderToString(run.text,{throwOnError:true,trust:false,strict:'ignore'});}
 catch(e){report.errors.push({id:q.id,tex:run.text,error:e.message});}
}
async function browserCheck(){
 const runtime=process.env.RASTRO_PLAYWRIGHT_MODULE||'C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright';
 const {chromium}=require(runtime);
 const server=http.createServer((req,res)=>{
  const file=path.resolve(assets,'.'+req.url);
  if(!file.startsWith(assets+path.sep)||!fs.existsSync(file)){res.writeHead(404);res.end();return;}
  res.setHeader('Content-Type',({'.html':'text/html','.js':'application/javascript','.css':'text/css','.woff2':'font/woff2'})[path.extname(file)]||'text/plain');
  res.end(fs.readFileSync(file));
 });
 await new Promise(resolve=>server.listen(0,'127.0.0.1',resolve));
 const origin=`http://127.0.0.1:${server.address().port}`;
 let browser;
 try{
  browser=await chromium.launch({executablePath:process.env.RASTRO_CHROME||'C:/Program Files/Google/Chrome/Application/chrome.exe',headless:true});
  const page=await browser.newPage({viewport:{width:360,height:740}});
  page.on('pageerror',e=>report.errors.push({browserError:e.message}));
  await page.route('**/*',route=>route.request().url().startsWith(origin)?route.continue():(report.errors.push({externalRequest:route.request().url()}),route.abort()));
  await page.goto(origin+'/render.html');
  // One complete example of each authored family; every numeric variant is checked above.
  for(let week=2;week<=16;week++)for(const part of [1,2]){
   const sample=questions.filter(q=>q.semana===week&&q.concept.startsWith(`${week}.${part}.`)).slice(0,5);
   const richText=sample.map(q=>`**${q.id}**\n${q.statement}\n\n${q.explanation}`).join('\n\n');
   await page.evaluate(richText=>{
    document.body.style.background='#fffaf2';
    window.renderMath({expressions:[],richText,color:'#17263c',fontSize:18});
   },richText);
   await page.evaluate(()=>document.fonts.ready);
   const result=await page.evaluate(()=>({fallback:document.querySelectorAll('.fallback').length,math:document.querySelectorAll('math').length,width:document.documentElement.scrollWidth}));
   report.browser.push({week,part,...result});
   if(result.fallback||result.width>360||!result.math)report.errors.push({week,part,...result});
   if([[3,2],[9,2],[11,2],[16,2]].some(([w,p])=>w===week&&p===part))await page.screenshot({path:`build/algebra-preview-${week}-${part}.png`,fullPage:true});
  }
 }finally{if(browser)await browser.close();await new Promise(resolve=>server.close(resolve));}
}
(async()=>{
 if(process.argv.includes('--browser'))await browserCheck();
 fs.writeFileSync('build/algebra-02-16-render-report.json',JSON.stringify(report,null,2));
 console.log(JSON.stringify(report));if(report.errors.length)process.exitCode=1;
})().catch(e=>{console.error(e);process.exitCode=1;});
