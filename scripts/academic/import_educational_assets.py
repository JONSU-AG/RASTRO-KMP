"""Import a deliberately small, licensed selection. No runtime network downloads."""
from pathlib import Path
import urllib.request,json,hashlib,math,re,xml.etree.ElementTree as ET
ROOT=Path(__file__).resolve().parents[2]
OUT=ROOT/'androidApp/src/main/assets/educational-visuals'

def get(url):
 return urllib.request.urlopen(urllib.request.Request(url,headers={'User-Agent':'RASTRO-resource-audit'}),timeout=60).read()
def sha(b):return hashlib.sha256(b).hexdigest()

def build():
 OUT.mkdir(parents=True,exist_ok=True);(OUT/'licenses').mkdir(exist_ok=True)
 commit=json.loads(get('https://api.github.com/repos/duerrsimon/bioicons/commits/HEAD'))['sha']
 base='https://raw.githubusercontent.com/duerrsimon/bioicons/'+commit+'/'
 (OUT/'licenses/bioicons-CC0.txt').write_bytes(get(base+'static/icons/cc-0/LICENSE'))
 entries=[]
 for id,title,path,author,lessons,description in [
  ('mitochondria','Mitocondria','static/icons/cc-0/Intracellular_components/jaiganesh/mitochondria.svg','jaiganesh',['bio_t05_s03'],'Esquema de una mitocondria. Es una ilustración, no una micrografía ni una representación a escala.'),
  ('human-heart','Corazón humano','static/icons/cc-0/Tissues/Mariana_RuizVillareal/Human_heart.svg','Mariana Ruiz Villareal (LadyofHats)',['bio_t08_s03'],'Ilustración anatómica del corazón humano. La vista y los colores sirven para estudiar; no es diagnóstico médico.'),
  ('prokaryote','Célula procariota','static/icons/cc-0/Intracellular_components/Mariana_RuizVillareal/Average_prokaryote_cell-_unlabled.svg','Mariana Ruiz Villareal (LadyofHats)',['bio_t05_s01'],'Esquema de célula procariota sin rótulos. No representa todas las variantes de bacterias ni una célula eucariota.')]:
  url=base+urllib.parse.quote(path,safe='/');data=get(url)
  root=ET.fromstring(data)
  assert root.tag.endswith('svg')
  for node in root.iter():
   assert node.tag.split('}')[-1] not in ['script','foreignObject']
   for k,v in node.attrib.items():
    assert not re.match(r'^on[a-z]+$',k.lower())
    if k.split('}')[-1] in ['href','src']:assert v.startswith('#') or v.startswith('data:image/')
  name=id+'.svg';(OUT/name).write_bytes(data)
  entries.append(dict(id=id,title=title,subjectId='biologia',lessonIds=lessons,poster=name,source=url,
   license='CC0-1.0',licenseUrl='https://creativecommons.org/publicdomain/zero/1.0/',attribution=author+' · Bioicons',
   description=description,bytes=len(data),sha256=sha(data),version=commit,changes='SVG original sin cambios gráficos.'))
 commitNE=json.loads(get('https://api.github.com/repos/nvkelso/natural-earth-vector/commits/HEAD'))['sha']
 neurl=f'https://raw.githubusercontent.com/nvkelso/natural-earth-vector/{commitNE}/geojson/ne_50m_admin_0_countries.geojson'
 raw=get(neurl);doc=json.loads(raw)
 peru=[x for x in doc['features'] if x['properties'].get('ADM0_A3')=='PER' or x['properties'].get('SOV_A3')=='PER' or x['properties'].get('ADMIN')=='Peru']
 assert len(peru)==1
 geo=peru[0]['geometry'];polygons=geo['coordinates'] if geo['type']=='MultiPolygon' else [geo['coordinates']]
 coords=[p for polygon in polygons for ring in polygon for p in ring]
 c=math.cos(math.radians(-10));xs=[p[0]*c for p in coords];ys=[-p[1] for p in coords]
 xmin,xmax,ymin,ymax=min(xs),max(xs),min(ys),max(ys)
 paths=[]
 for polygon in polygons:
  for ring in polygon:
   pts=[((p[0]*c-xmin)*20+8,(-p[1]-ymin)*20+8) for p in ring]
   paths.append('M'+'L'.join(f'{x:.2f},{y:.2f}' for x,y in pts)+'Z')
 w=(xmax-xmin)*20+16;h=(ymax-ymin)*20+16
 svg=f'<svg xmlns="http://www.w3.org/2000/svg" viewBox="0 0 {w:.2f} {h:.2f}"><title>Perú: contorno general</title><desc>Made with Natural Earth. Escala de origen 1:50m. Proyección equirectangular ajustada; no es mapa oficial de límites ni de relieve.</desc><path d="{" ".join(paths)}" fill="#D1FAE5" stroke="#14532D" stroke-width="1.2" fill-rule="evenodd"/></svg>'.encode()
 (OUT/'peru-outline.svg').write_bytes(svg)
 (OUT/'licenses/natural-earth-terms.html').write_bytes(get('https://www.naturalearthdata.com/about/terms-of-use/'))
 entries.append(dict(id='peru-outline',title='Perú: contorno general',subjectId='geografia',lessonIds=['geo_t13_s01','geo_t13_s02'],poster='peru-outline.svg',source=neurl,
  license='Public domain',licenseUrl='https://www.naturalearthdata.com/about/terms-of-use/',attribution='Made with Natural Earth · Tom Patterson, Nathaniel Vaughn Kelso y colaboradores',
  description='Contorno cartográfico general a partir de Natural Earth 1:50m. No muestra departamentos, cordilleras o cuencas; no es delimitación oficial ni mapa de navegación.',
  bytes=len(svg),sha256=sha(svg),version=commitNE,changes='Filtrado de Perú y conversión a SVG con proyección equirectangular ajustada a latitud central.'))
 (OUT/'catalog.json').write_text(json.dumps(dict(schemaVersion=1,resources=entries),ensure_ascii=False,indent=2),encoding='utf8')
 print([(e['id'],e['bytes'],e['license']) for e in entries])

if __name__=='__main__':build()
