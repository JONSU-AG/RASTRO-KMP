// Offline render validation of an explicitly authored preview, not an Android launch.
const fs=require('fs'),path=require('path'),http=require('http');
process.chdir(path.resolve(__dirname,'../..'));
const [previewFile,reportPrefix,...flags]=process.argv.slice(2);
if(!previewFile||!reportPrefix)throw Error('Usage: node validate_academic_preview.cjs preview.json report-prefix [--browser]');
const assets=path.resolve('androidApp/src/main/assets/scientific-math');
const katex=require(path.join(assets,'katex.min.js'));
const {scientificRuns}=require(path.join(assets,'rich-text.js'));
const questions=JSON.parse(fs.readFileSync(previewFile,'utf8'));
const report={questions:questions.length,mathFragments:0,errors:[],browser:[]};
function questionTexts(q){
 return [q.statement,...(q.options||[]),q.explanation,q.instruction,q.correctText,q.sentenceBefore,q.sentenceAfter,
  ...(q.chips||[]).map(x=>typeof x==='string'?x:x.text),
  ...(q.pairs||[]).flatMap(x=>[x.left,x.right]),...(q.rightOptions||[]).map(x=>x.text),q.formula]
  .filter(x=>typeof x==='string'&&x.length);
}
const groups=new Map();
for(const q of questions){
 const key=q.subject+'/'+q.concept.split('.').slice(0,2).join('.');
 if(!groups.has(key))groups.set(key,[]);groups.get(key).push(q);
 for(const text of questionTexts(q))for(const run of scientificRuns(text))if(run.math){
  report.mathFragments++;
  try{katex.renderToString(run.text,{throwOnError:true,trust:false,strict:'ignore'});}catch(e){report.errors.push({id:q.id,tex:run.text,error:e.message});}
 }
}
async function inspectBrowser(){
 const runtime=process.env.RASTRO_PLAYWRIGHT_MODULE||'C:/Users/Usuario/.cache/codex-runtimes/codex-primary-runtime/dependencies/node/node_modules/playwright';
 const {chromium}=require(runtime);
 const server=http.createServer((req,res)=>{
  const file=path.resolve(assets,'.'+req.url);
  if(!file.startsWith(assets+path.sep)||!fs.existsSync(file)){res.writeHead(404);res.end();return;}
  res.setHeader('Content-Type',({'.html':'text/html','.js':'application/javascript','.css':'text/css','.woff2':'font/woff2'})[path.extname(file)]||'text/plain');res.end(fs.readFileSync(file));
 });
 await new Promise(resolve=>server.listen(0,'127.0.0.1',resolve));
 let browser;
 try{
  const origin=`http://127.0.0.1:${server.address().port}`;
  browser=await chromium.launch({executablePath:process.env.RASTRO_CHROME||'C:/Program Files/Google/Chrome/Application/chrome.exe',headless:true});
  const page=await browser.newPage({viewport:{width:360,height:740}});
  page.on('pageerror',e=>report.errors.push({browserError:e.message}));
  page.on('response',r=>{if(r.status()>=400)report.errors.push({status:r.status(),url:r.url()});});
  await page.route('**/*',route=>route.request().url().startsWith(origin)?route.continue():(report.errors.push({externalRequest:route.request().url()}),route.abort()));
  await page.goto(origin+'/render.html');
  for(const mode of ['light','dark','large'])for(const [level,bank]of groups){
   const richText=bank.map(q=>`**${q.id}**\n${questionTexts(q).join('\n\n')}`).join('\n\n');
   await page.evaluate(({richText,mode})=>{
    const dark=mode==='dark';document.body.style.background=dark?'#101722':'#fffaf2';
    window.renderMath({expressions:[],richText,color:dark?'#f8fafc':'#17263c',fontSize:mode==='large'?26:18});
   },{richText,mode});
   await page.evaluate(()=>document.fonts.ready);
   const view=await page.evaluate(()=>({fallback:document.querySelectorAll('.fallback').length,fallbackText:[...document.querySelectorAll('.fallback')].map(x=>x.textContent),math:document.querySelectorAll('math').length,width:document.documentElement.scrollWidth,fontsReady:document.fonts.check('18px KaTeX_Main')}));
   report.browser.push({mode,level,...view});
   // A text-only bank does not request KaTeX fonts. Require them when math exists.
   if(view.fallback||view.width>360||(view.math>0&&!view.fontsReady))report.errors.push({mode,level,...view});
   if(mode==='light'&&['fisica/1.2','fisica/7.2','fisica/9.1','fisica/12.2','trigonometria/6.1','trigonometria/7.2','trigonometria/11.2','geometria/1.1','geometria/4.2','geometria/9.2','geometria/11.2','aritmetica/5.2','aritmetica/11.2','aritmetica/13.2','quimica/6.1','quimica/7.2','quimica/12.2','quimica/16.2','raz_logico/4.2','raz_logico/8.2','raz_matematico/5.2','raz_matematico/6.2','ingles/1.1','ingles/6.2'].includes(level)){
    await page.screenshot({path:`${reportPrefix}-${level.replace('/','-')}.png`,fullPage:true});
    await page.screenshot({path:`${reportPrefix}-${level.replace('/','-')}-top.png`,fullPage:false});
   }
  }
 }finally{if(browser)await browser.close();await new Promise(resolve=>server.close(resolve));}
}
(async()=>{
 if(flags.includes('--browser'))await inspectBrowser();
 fs.writeFileSync(reportPrefix+'.json',JSON.stringify(report,null,2));
 console.log(JSON.stringify({questions:report.questions,mathFragments:report.mathFragments,browserViews:report.browser.length,errors:report.errors}));
 if(report.errors.length)process.exitCode=1;
})().catch(e=>{console.error(e);process.exitCode=1;});
