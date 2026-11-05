// Visual segmentation of the existing CellForge surface. No replacement geometry is generated.
const fs=require('fs'),path=require('path'),crypto=require('crypto');
const root=path.resolve(__dirname,'../..'),src=path.join(root,'build/plant-cell-pilot/vertices.bin'),out=path.join(root,'androidApp/src/main/assets/educational-visuals');
const bytes=fs.readFileSync(src),vertices=new Float32Array(bytes.buffer,bytes.byteOffset,bytes.length/4),count=vertices.length/24;
function ellipse(x,y,rx,ry){return Array.from({length:24},(_,i)=>{const a=i*Math.PI/12;return [x+Math.cos(a)*rx,y+Math.sin(a)*ry]})}
const regions=[
 {id:'nucleolus',name:'Nucléolo',description:'Participa en la formación de los ribosomas dentro del núcleo.',polygon:ellipse(265,254,15,17),offset:[.65,.40,-.10]},
 {id:'nucleus',name:'Núcleo',description:'Contiene la mayor parte del ADN y participa en el control de la actividad celular.',polygon:[[239,201],[276,196],[309,212],[328,237],[331,272],[312,300],[280,317],[247,306],[223,283],[213,248],[218,222]],offset:[.30,.26,-.20]},
 {id:'vacuole',name:'Vacuola central',description:'Almacena agua y sustancias; ayuda a mantener la turgencia de la célula vegetal.',polygon:[[119,198],[175,199],[212,205],[221,223],[205,258],[207,302],[224,345],[225,373],[207,389],[171,398],[137,381],[112,348],[107,314],[113,275],[118,248],[112,225]],offset:[.28,-.10,.40]},
 {id:'chloroplasts',name:'Cloroplastos',description:'Realizan la fotosíntesis: captan energía luminosa para producir materia orgánica.',polygons:[ellipse(90,251,14,28),ellipse(190,171,31,15),ellipse(314,330,17,30),ellipse(243,396,33,16),[[95,389],[113,379],[135,391],[155,413],[149,431],[125,431],[106,413]]],offset:[.28,.12,-.48]},
 {id:'mitochondria',name:'Mitocondrias',description:'Participan en la respiración celular y en la producción de ATP.',polygons:[ellipse(82,318,12,24),ellipse(247,180,22,13),ellipse(288,381,15,22)],offset:[.42,-.40,-.10]},
 {id:'golgi',name:'Aparato de Golgi',description:'Modifica y empaqueta sustancias para transportarlas dentro o fuera de la célula.',polygon:[[215,288],[226,293],[236,307],[260,316],[271,326],[266,341],[249,347],[230,336],[215,319],[207,301]],offset:[.46,-.22,.04]},
 {id:'cell-wall',name:'Pared celular',description:'Envoltura externa que aporta protección y ayuda a mantener la forma de la célula vegetal.',polygon:[[80,157],[120,151],[236,120],[248,147],[331,200],[371,214],[353,245],[334,379],[352,410],[323,417],[270,442],[250,487],[219,457],[115,437],[92,405],[57,369],[20,356],[46,333],[64,240],[70,179]],excludes:[[[100,179],[137,164],[226,148],[250,166],[318,213],[340,232],[324,349],[316,383],[287,410],[249,437],[207,440],[140,418],[104,376],[74,346],[84,289],[92,247]]],offset:[-.10,0,.12]},
 {id:'cell-body',name:'Resto de la célula',description:'Conserva la envoltura, el citoplasma y las estructuras que rodean a los orgánulos seleccionados.',offset:[-.18,0,0]}
];
function inside(x,y,poly){let hit=false;for(let i=0,j=poly.length-1;i<poly.length;j=i++){const a=poly[i],b=poly[j];if((a[1]>y)!==(b[1]>y)&&x<(b[0]-a[0])*(y-a[1])/(b[1]-a[1])+a[0])hit=!hit}return hit}
const groups=Buffer.alloc(count),sizes=regions.map(()=>0);
for(let t=0;t<count;t++){
 let x=0,y=0,z=0,nx=0;for(let v=0;v<3;v++){const i=t*24+v*8;x+=vertices[i]/3;y+=vertices[i+1]/3;z+=vertices[i+2]/3;nx+=vertices[i+3]/3}
 const px=200-z*724.264/(4-x),py=300-y*724.264/(4-x);
 let group=regions.length-1;
 if(x>-.025 && nx>-.65){const match=regions.findIndex(r=>(r.polygons||[r.polygon]).filter(Boolean).some(p=>inside(px,py,p)) && !(r.excludes||[]).some(p=>inside(px,py,p)));if(match>=0)group=match}
 groups[t]=group;sizes[group]++;
}
const sha=f=>crypto.createHash('sha256').update(fs.readFileSync(f)).digest('hex');
fs.writeFileSync(path.join(out,'cellforge-plant-parts.bin'),groups);
const record={version:1,modelSha256:sha(path.join(out,'cellforge-plant.glb')),triangleCount:count,assignmentSha256:sha(path.join(out,'cellforge-plant-parts.bin')),method:'Regiones visuales del modelo ilustrativo; segmentaciÃ³n de su superficie original, no volÃºmenes anatÃ³micos independientes.',parts:regions.map((r,i)=>({...r,triangles:sizes[i]}))};
fs.writeFileSync(path.join(out,'cellforge-plant-parts.json'),JSON.stringify(record,null,2));
const preview=Buffer.alloc(bytes.length);let cursor=0;
const ranges=regions.map((part,g)=>{const start=cursor/32;for(let t=0;t<count;t++)if(groups[t]===g){bytes.copy(preview,cursor,t*96,t*96+96);cursor+=96}return {...part,firstVertex:start,vertexCount:cursor/32-start}});
fs.writeFileSync(path.join(root,'build/plant-cell-pilot/parts-vertices.bin'),preview);
fs.writeFileSync(path.join(root,'build/plant-cell-pilot/parts-preview.json'),JSON.stringify(ranges));
console.log(JSON.stringify(sizes.map((n,i)=>[regions[i].name,n])));
