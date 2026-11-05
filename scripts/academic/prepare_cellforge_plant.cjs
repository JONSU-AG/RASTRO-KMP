// Development-only tools live under build/cellforge-tools, never in the Android dependency graph.
const fs=require('fs'),path=require('path'),{createRequire}=require('module'),{pathToFileURL}=require('url'),crypto=require('crypto');
const root=path.resolve(__dirname,'../..'),req=createRequire(path.join(root,'build/cellforge-tools/package.json'));
(async()=>{
 const {NodeIO}=req('@gltf-transform/core'),{weld,simplify,prune,textureCompress}=req('@gltf-transform/functions'),sharp=req('sharp');
 const {MeshoptSimplifier}=await import(pathToFileURL(req.resolve('meshoptimizer')).href);await MeshoptSimplifier.ready;
 const src=path.join(root,'build/cellforge-review'),out=path.join(root,'androidApp/src/main/assets/educational-visuals');
 const io=new NodeIO(),doc=await io.read(path.join(src,'plant-source.glb'));
 doc.getRoot().listMaterials().forEach(m=>m.setNormalTexture(null).setMetallicRoughnessTexture(null).setMetallicFactor(0).setRoughnessFactor(.9));
 await doc.transform(prune(),weld(),simplify({simplifier:MeshoptSimplifier,ratio:.03,error:.03,lockBorder:false}),textureCompress({encoder:sharp,targetFormat:'jpeg',resize:[1024,1024],quality:84}),prune());
 await io.write(path.join(out,'cellforge-plant.glb'),doc);
 await sharp(path.join(src,'plant-reference.png')).resize({width:1024,withoutEnlargement:true}).jpeg({quality:86}).toFile(path.join(out,'cellforge-plant-poster.jpg'));
 const folder=path.join(out,'licenses');fs.copyFileSync(path.join(src,'LICENSE'),path.join(folder,'cellforge-MIT.txt'));
 const commit=fs.readFileSync(path.join(src,'commit.txt'),'utf8').trim(),sha=f=>crypto.createHash('sha256').update(fs.readFileSync(f)).digest('hex');
 const model=path.join(out,'cellforge-plant.glb'),poster=path.join(out,'cellforge-plant-poster.jpg');
 const faces=doc.getRoot().listMeshes().flatMap(m=>m.listPrimitives()).reduce((n,p)=>n+(p.getIndices()?.getCount()||0)/3,0);
 const record={commit,source:'https://raw.githubusercontent.com/huangserva/3DCellForge/'+commit+'/public/generated-models/tripo-plant-cell-test.glb',sourceSha256:sha(path.join(src,'plant-source.glb')),sourceBytes:fs.statSync(path.join(src,'plant-source.glb')).size,sourceTriangles:1962326,triangles:faces,modelBytes:fs.statSync(model).size,modelSha256:sha(model),posterBytes:fs.statSync(poster).size,posterSha256:sha(poster),license:'MIT',attribution:'huangserva / 3DCellForge. Modelo generado con Tripo y compartido en el repositorio.',changes:'Reducción geométrica conservando UV y textura de color a 1024 px; se omiten mapas de normal/rugosidad; poster JPEG del recurso original. No se regenera el modelo.'};
 fs.writeFileSync(path.join(folder,'cellforge-plant-source.json'),JSON.stringify(record,null,2));console.log(JSON.stringify(record));
})().catch(e=>{console.error(e);process.exitCode=1});
