'use strict';
(function(){
 const viewport=document.getElementById('viewport'),world=document.getElementById('world');
 let bounds={width:1,height:1},camera={scale:1,x:0,y:0},fitScale=1,expanded=false,active=new Map(),lastTap=0,revision=0,moved=false;
 const svgNS='http://www.w3.org/2000/svg';
 function reportFailure(){if(window.RastroMapStatus)window.RastroMapStatus.failed();}
 window.addEventListener('error',reportFailure);
 window.addEventListener('unhandledrejection',reportFailure);
 function apply(){world.style.transform=`translate(${camera.x}px,${camera.y}px) scale(${camera.scale})`;}
 function clamp(){
  const w=bounds.width*camera.scale,h=bounds.height*camera.scale;
  camera.x=w<=viewport.clientWidth?(viewport.clientWidth-w)/2:Math.max(viewport.clientWidth-w-24,Math.min(24,camera.x));
  camera.y=h<=viewport.clientHeight?(viewport.clientHeight-h)/2:Math.max(viewport.clientHeight-h-24,Math.min(24,camera.y));apply();
 }
 function fit(){fitScale=Math.min(viewport.clientWidth/bounds.width,viewport.clientHeight/bounds.height,1);camera={scale:fitScale,x:0,y:0};clamp();}
 function zoom(factor,x,y){
  const scale=Math.max(fitScale,Math.min(6,camera.scale*factor));
  camera.x=x-(x-camera.x)*scale/camera.scale;camera.y=y-(y-camera.y)*scale/camera.scale;camera.scale=scale;clamp();
 }
 function rich(target,text){
  // Only authored text and a tiny formatting vocabulary; never insert source HTML.
  String(text).split(/(\*\*[^*]+\*\*|\*[^*]+\*|<u>[^<>]+<\/u>)/g).forEach(piece=>{
   let tag=null,value=piece;
   if(piece.startsWith('**')&&piece.endsWith('**')){tag='strong';value=piece.slice(2,-2);}
   else if(piece.startsWith('*')&&piece.endsWith('*')){tag='em';value=piece.slice(1,-1);}
   else if(piece.startsWith('<u>')&&piece.endsWith('</u>')){tag='u';value=piece.slice(3,-4);}
   const parent=tag?document.createElement(tag):target;if(tag)target.appendChild(parent);
   scientificRuns(value).forEach(run=>{
    if(!run.math){parent.appendChild(document.createTextNode(run.text));return;}
    const span=document.createElement('span');span.className='math-inline';parent.appendChild(span);
    try{katex.render(run.text,span,{displayMode:false,output:'htmlAndMathml',throwOnError:true,trust:false,strict:'ignore',maxExpand:200,maxSize:20});}
    catch(_){span.classList.add('fallback');span.textContent=run.text;}
   });
  });
 }
 window.renderAcademicMap=async function(payload){
  const token=++revision;active.clear();expanded=!!payload.expanded;document.body.classList.toggle('expanded',expanded);
  for(const [k,v]of Object.entries(payload.colors))world.style.setProperty('--'+k,v);
  world.style.setProperty('--node-font',(payload.fontSize||16)+'px');
  const nodes=document.getElementById('nodes'),svg=document.getElementById('edges');nodes.replaceChildren();svg.replaceChildren();
  const byId=new Map(payload.nodes.map(n=>[n.id,n]));
  const valid=payload.edges.filter(e=>byId.has(e.from)&&byId.has(e.to));
  const incoming=new Set(valid.map(e=>e.to)),levels=new Map(),queue=payload.nodes.filter(n=>!incoming.has(n.id)).map(n=>n.id);
  if(!queue.length&&payload.nodes.length)queue.push(payload.nodes[0].id);
  queue.forEach(id=>levels.set(id,0));
  // Breadth-first placement terminates on cycles; every original edge is retained below.
  for(let i=0;i<queue.length;i++)for(const e of valid.filter(e=>e.from===queue[i]))if(!levels.has(e.to)){levels.set(e.to,levels.get(e.from)+1);queue.push(e.to);}
  for(const n of payload.nodes)if(!levels.has(n.id)){levels.set(n.id,0);queue.push(n.id);}
  const elements=new Map();
  for(const n of payload.nodes){const el=document.createElement('div');el.className='node'+(levels.get(n.id)===0?' root':'');el.dataset.nodeId=n.id;rich(el,n.label);nodes.appendChild(el);elements.set(n.id,el);}
  // Android WebView may finish loading before receiving its first measured bounds.
  if(document.fonts)await document.fonts.ready;
  await new Promise(resolve=>requestAnimationFrame(resolve));if(token!==revision)return;
  // Compact branch columns: all descendants are visible, without a single very wide leaf row.
  const roots=payload.nodes.filter(n=>!incoming.has(n.id)).map(n=>n.id);
  const head=roots.length===1?roots[0]:null,visited=new Set(head?[head]:[]),groups=[];
  function collect(id,depth,out){
   if(visited.has(id))return;visited.add(id);out.push({id,depth});
   for(const e of valid)if(e.from===id)collect(e.to,depth+1,out);
  }
  const seeds=head?valid.filter(e=>e.from===head).map(e=>e.to):roots;
  for(const id of [...seeds,...payload.nodes.map(n=>n.id)]){
   if(visited.has(id))continue;const group=[];collect(id,0,group);groups.push(group);
  }
  const columns=Math.min(3,Math.max(1,groups.length)),laneWidth=372,width=columns*laneWidth+48,positions=new Map();
  function place(id,x,y,group){const el=elements.get(id);el.style.left=x+'px';el.style.top=y+'px';positions.set(id,{x,y,width:260,height:el.offsetHeight,group});}
  let y=24;
  if(head){place(head,(width-260)/2,y,-1);y+=elements.get(head).offsetHeight+78;}
  for(let start=0;start<groups.length;start+=columns){
   let bottom=y;
   groups.slice(start,start+columns).forEach((group,col)=>{
    let rowY=y;
    for(const n of group){place(n.id,40+col*laneWidth+Math.min(3,n.depth)*24,rowY,start+col);rowY+=elements.get(n.id).offsetHeight+30;}
    bottom=Math.max(bottom,rowY);
   });y=bottom+48;
  }
  bounds={width,height:y+8};world.style.width=width+'px';world.style.height=bounds.height+'px';svg.setAttribute('width',width);svg.setAttribute('height',bounds.height);
  const defs=document.createElementNS(svgNS,'defs'),marker=document.createElementNS(svgNS,'marker');
  marker.id='arrow';marker.setAttribute('viewBox','0 0 10 10');marker.setAttribute('refX','9');marker.setAttribute('refY','5');marker.setAttribute('markerWidth','7');marker.setAttribute('markerHeight','7');marker.setAttribute('orient','auto-start-reverse');
  const tip=document.createElementNS(svgNS,'path');tip.setAttribute('d','M 0 0 L 10 5 L 0 10 z');tip.setAttribute('fill',payload.colors.concept);marker.appendChild(tip);defs.appendChild(marker);svg.appendChild(defs);
  for(const [i,e]of valid.entries()){
   const a=positions.get(e.from),b=positions.get(e.to),down=b.y>a.y;
   const x1=a.x+a.width/2,y1=down?a.y+a.height+4:a.y,x2=b.x+b.width/2,y2=down?b.y-3:b.y+b.height+7;
   const path=document.createElementNS(svgNS,'path');path.dataset.edgeIndex=i;
   // Within a branch, connectors run beside the boxes rather than through sibling concepts.
   let route,labelX=(x1+x2)/2,labelY=(y1+y2)/2-8;
   if(a.group===b.group && b.y>a.y && b.x>=a.x){
    const side=Math.min(a.x+12,b.x-14),targetY=b.y+b.height/2;
    route=`M ${side} ${a.y+a.height+4} V ${targetY} H ${b.x-4}`;
    labelX=side+8;labelY=targetY-10;
   }else{
    const bend=down?(y1+y2)/2:Math.max(a.y+a.height,b.y+b.height)+35;
    route=`M ${x1} ${y1} C ${x1} ${bend}, ${x2} ${bend}, ${x2} ${y2}`;
   }
   path.setAttribute('d',route);path.setAttribute('fill','none');path.setAttribute('stroke',payload.colors.concept);path.setAttribute('stroke-width','2.5');path.setAttribute('marker-end','url(#arrow)');svg.appendChild(path);
   if(e.label){const text=document.createElementNS(svgNS,'text');text.classList.add('edge-label');text.setAttribute('x',labelX);text.setAttribute('y',labelY);text.setAttribute('text-anchor','middle');text.textContent=e.label;svg.appendChild(text);}
  }
  // Include even unusually long edge labels in the fitted overview.
  const graphic=svg.getBBox(),left=Math.min(0,graphic.x-8),top=Math.min(0,graphic.y-8);
  if(left<0||top<0){
   for(const el of elements.values()){el.style.left=(parseFloat(el.style.left)-left)+'px';el.style.top=(parseFloat(el.style.top)-top)+'px';}
   const group=document.createElementNS(svgNS,'g');for(const child of [...svg.children])if(child.tagName!=='defs')group.appendChild(child);group.setAttribute('transform',`translate(${-left} ${-top})`);svg.appendChild(group);
  }
  bounds={width:Math.max(width,graphic.x+graphic.width+16)-left,height:Math.max(bounds.height,graphic.y+graphic.height+16)-top};
  world.style.width=bounds.width+'px';world.style.height=bounds.height+'px';svg.setAttribute('width',bounds.width);svg.setAttribute('height',bounds.height);

  fit();window.academicMapReady={nodes:byId.size,edges:valid.length,width:bounds.width,height:bounds.height};
  if(viewport.clientWidth>0 && viewport.clientHeight>0 && byId.size>0 && window.RastroMapStatus)window.RastroMapStatus.ready();
 };
 window.fitAcademicMap=fit;
 viewport.addEventListener('pointerdown',e=>{if(!expanded)return;if(!active.size)moved=false;else {moved=true;lastTap=0;}viewport.setPointerCapture(e.pointerId);active.set(e.pointerId,{x:e.clientX,y:e.clientY,startX:e.clientX,startY:e.clientY});});
 viewport.addEventListener('pointermove',e=>{
  if(!expanded||!active.has(e.pointerId))return;
  const old=[...active.values()],previous=active.get(e.pointerId);if(Math.hypot(e.clientX-previous.startX,e.clientY-previous.startY)>8){moved=true;lastTap=0;}active.set(e.pointerId,{...previous,x:e.clientX,y:e.clientY});const points=[...active.values()];
  if(points.length===1){camera.x+=e.clientX-previous.x;camera.y+=e.clientY-previous.y;clamp();}
  else if(points.length===2){const before=Math.hypot(old[0].x-old[1].x,old[0].y-old[1].y),after=Math.hypot(points[0].x-points[1].x,points[0].y-points[1].y);const rect=viewport.getBoundingClientRect();if(before>0)zoom(after/before,(points[0].x+points[1].x)/2-rect.left,(points[0].y+points[1].y)/2-rect.top);}
 });
 viewport.addEventListener('pointerup',e=>{if(!active.has(e.pointerId))return;active.delete(e.pointerId);if(moved)return;const now=Date.now();if(now-lastTap<280){const rect=viewport.getBoundingClientRect();if(camera.scale>fitScale*1.5)fit();else zoom(Math.max(2,1/camera.scale),e.clientX-rect.left,e.clientY-rect.top);lastTap=0;}else lastTap=now;});
 viewport.addEventListener('pointercancel',e=>active.delete(e.pointerId));
 viewport.addEventListener('wheel',e=>{if(!expanded)return;e.preventDefault();const rect=viewport.getBoundingClientRect();zoom(Math.exp(-e.deltaY*.002),e.clientX-rect.left,e.clientY-rect.top);},{passive:false});
 new ResizeObserver(()=>{if(window.academicMapReady){fit();if(viewport.clientWidth>0 && viewport.clientHeight>0 && window.RastroMapStatus)window.RastroMapStatus.ready();}}).observe(viewport);
})();
