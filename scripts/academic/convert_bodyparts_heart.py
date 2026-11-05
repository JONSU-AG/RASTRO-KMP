"""Convert only official FMA7088 components to a compact GLB. No invented anatomy."""
from pathlib import Path
import zipfile,json,struct,math,hashlib
ROOT=Path(__file__).resolve().parents[2]
OUT=ROOT/'androidApp/src/main/assets/educational-visuals'
def build():
 ids=[l.split('\t')[2] for l in (ROOT/'build/partof_element_parts.txt').read_text().splitlines() if l.startswith('FMA7088\t')]
 assert len(ids)==len(set(ids))==83
 data=[];headers=[]
 with zipfile.ZipFile(ROOT/'build/partof_BP3D_4.0_obj_99.zip') as z:
  files={Path(n).stem:n for n in z.namelist() if n.endswith('.obj')}
  assert set(ids)<=files.keys()
  for id in ids:
   raw=z.read(files[id]).decode();assert 'Share Alike 2.1 Japan' in raw[:3000]
   header='\n'.join(l for l in raw.splitlines() if l.startswith('#'))
   assert 'NonCommercial' not in header and 'Non-Commercial' not in header
   headers.append(id+'\n'+header)
   vs=[];ns=[];faces=[]
   for line in raw.splitlines():
    f=line.split()
    if not f:continue
    if f[0]=='v':vs.append(tuple(map(float,f[1:4])))
    elif f[0]=='vn':ns.append(tuple(map(float,f[1:4])))
    elif f[0]=='f':
     parsed=[]
     for s in f[1:]:
      bits=s.split('/');vi=int(bits[0]);ni=int(bits[2]) if len(bits)>2 and bits[2] else 0
      parsed.append((vi-1 if vi>0 else len(vs)+vi,ni-1 if ni>0 else None))
     for i in range(1,len(parsed)-1):faces.append((parsed[0],parsed[i],parsed[i+1]))
   assert vs and faces
   data.append((id,vs,ns,faces))
 points=[p for _,vs,_,_ in data for p in vs]
 lo=[min(p[i] for p in points) for i in range(3)];hi=[max(p[i] for p in points) for i in range(3)]
 center=[(a+b)/2 for a,b in zip(lo,hi)];scale=2/max(b-a for a,b in zip(lo,hi))
 binary=bytearray();views=[];accessors=[];meshes=[]
 def buffer(values,kind,count,components):
  while len(binary)%4:binary.append(0)
  offset=len(binary);binary.extend(struct.pack('<'+('f' if kind==5126 else 'I')*len(values),*values))
  views.append(dict(buffer=0,byteOffset=offset,byteLength=len(binary)-offset))
  a=dict(bufferView=len(views)-1,componentType=kind,count=count,type=components)
  if components=='VEC3':a.update(min=[min(values[i::3]) for i in range(3)],max=[max(values[i::3]) for i in range(3)])
  accessors.append(a);return len(accessors)-1
 for id,vs,ns,faces in data:
  vertices=[];normals=[];indices=[];lookup={}
  for face in faces:
   pts=[vs[v] for v,n in face];u=[pts[1][i]-pts[0][i] for i in range(3)];v=[pts[2][i]-pts[0][i] for i in range(3)]
   norm=(u[1]*v[2]-u[2]*v[1],u[2]*v[0]-u[0]*v[2],u[0]*v[1]-u[1]*v[0]);length=math.sqrt(sum(x*x for x in norm)) or 1
   for vi,ni in face:
    key=(vi,ni) if ni is not None else (vi,tuple(norm))
    if key not in lookup:
     lookup[key]=len(vertices)//3
     p=[(vs[vi][i]-center[i])*scale for i in range(3)]
     vertices.extend([p[0],p[2],-p[1]])
     n=ns[ni] if ni is not None else tuple(x/length for x in norm)
     normals.extend([n[0],n[2],-n[1]])
    indices.append(lookup[key])
  pa=buffer(vertices,5126,len(vertices)//3,'VEC3');na=buffer(normals,5126,len(normals)//3,'VEC3');ia=buffer(indices,5125,len(indices),'SCALAR')
  meshes.append(dict(name=id,primitives=[dict(attributes=dict(POSITION=pa,NORMAL=na),indices=ia,material=0)]))
 gltf=dict(asset=dict(version='2.0',generator='RASTRO: BodyParts3D OBJ to GLB; geometry preserved; centered and normalized',copyright='BodyParts3D, © The Database Center for Life Science. CC BY-SA 2.1 Japan (license in source OBJ).'),
  scene=0,scenes=[dict(nodes=list(range(len(meshes))))],nodes=[dict(mesh=i,name=m['name']) for i,m in enumerate(meshes)],meshes=meshes,
  materials=[dict(name='Illustrative myocardium color',pbrMetallicRoughness=dict(baseColorFactor=[0.67,0.10,0.15,1],metallicFactor=0,roughnessFactor=0.8),doubleSided=True)],
  buffers=[dict(byteLength=len(binary))],bufferViews=views,accessors=accessors)
 raw=json.dumps(gltf,separators=(',',':')).encode()
 while len(raw)%4:raw+=b' '
 while len(binary)%4:binary.append(0)
 glb=struct.pack('<III',0x46546c67,2,12+8+len(raw)+8+len(binary))+struct.pack('<II',len(raw),0x4e4f534a)+raw+struct.pack('<II',len(binary),0x004e4942)+binary
 (OUT/'heart-bodyparts.glb').write_bytes(glb)
 (OUT/'licenses/bodyparts-source-headers.txt').write_text('\n\n'.join(headers),encoding='utf8')
 (OUT/'licenses/bodyparts-heart-components.json').write_text(json.dumps(dict(concept='FMA7088',components=ids,source='https://dbarchive.biosciencedbc.jp/data/bodyparts3d/LATEST/partof_BP3D_4.0_obj_99.zip',archiveSha256=hashlib.sha256((ROOT/'build/partof_BP3D_4.0_obj_99.zip').read_bytes()).hexdigest(),changes='Conversion to GLB, centered, rotated Z-up to Y-up, normalized, illustrative uniform material; source-reduced topology retained.'),indent=2),encoding='utf8')
 catalog=json.loads((OUT/'catalog.json').read_text(encoding='utf8'))
 resource=next(x for x in catalog['resources'] if x['id']=='human-heart')
 resource.update(model='heart-bodyparts.glb',modelBytes=len(glb),modelSha256=hashlib.sha256(glb).hexdigest(),modelSource='https://dbarchive.biosciencedbc.jp/en/bodyparts3d/download.html',modelLicense='CC-BY-SA-2.1-JP',modelLicenseUrl='https://creativecommons.org/licenses/by-sa/2.1/jp/',
  modelAttribution='BodyParts3D, © The Database Center for Life Science · CC BY-SA 2.1 Japan. Conversión GLB por RASTRO; modelo fuente 4.0 con reducción geométrica del archivo original.',
  modelDescription='Corazón humano FMA7088: 83 componentes de BodyParts3D. Superficies simplificadas para estudio, no diagnóstico. El color es ilustrativo. No representa el bombeo ni el flujo sanguíneo.')
 (OUT/'catalog.json').write_text(json.dumps(catalog,ensure_ascii=False,indent=2),encoding='utf8')
 print(dict(parts=len(meshes),triangles=sum(len(faces) for _,_,_,faces in data),glbBytes=len(glb)))
if __name__=='__main__':build()
