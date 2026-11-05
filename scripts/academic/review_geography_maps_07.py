"""Replace six fixed-width relief sketches and their misleading captions."""
import re,json,hashlib,shutil
from review_logical_maps import ROOT,make_map

andes=[
 ('Sectores como esquema de estudio',[
  'Norte, centro y sur permiten organizar referencias regionales; no son bloques idénticos.',
  'Los nudos de Pasco y Vilcanota se usan como referencias del esquema escolar.',
  'No representar cada cordillera como si terminara en un único cruce geométrico.']),
 ('Cadenas y ejemplos',[
  'Cordilleras Blanca y Negra: referencias para situar el Callejón de Huaylas.',
  'La Viuda: ejemplo de cordillera del sector central.',
  'En el sur, distinguir el arco volcánico occidental y cordilleras orientales como Carabaya.']),
 ('Formas del relieve',[
  'Un valle es una depresión alargada; una meseta es una superficie relativamente elevada y extensa.',
  'Un abra es un paso entre elevaciones; un cañón es un valle profundamente encajado.',
  'El Collao y el Titicaca sirven de referencias del altiplano meridional.']),
 ('Cómo leer el mapa',[
  'El mapa clasifica conceptos; no dibuja posiciones ni distancias reales.',
  'Usar cartografía para localizar un nevado, una cadena o un paso específico.',
  'La altura de una cumbre y la profundidad de un cañón son medidas diferentes.'])]

amazon=[
 ('Relieve y agua',[
  'Comparar la posición relativa del terreno respecto del río y su régimen de crecidas.',
  'Las formas amazónicas no se definen por una única cota universal sobre el nivel del mar.',
  'La inundación depende del nivel del agua, el drenaje y las condiciones locales.']),
 ('Ambientes que deben distinguirse',[
  'Tahuampa: ambiente de bosque inundable; no equivale automáticamente a un palmeral.',
  'Aguajal: humedal con presencia dominante o característica del aguaje.',
  'Restinga: terreno aluvial cuya inundabilidad cambia con la altura relativa y el lugar.']),
 ('Formas y dinámica fluvial',[
  'Barrizales y playones quedan expuestos durante la vaciante y pueden volver a inundarse.',
  'Muchas cochas se relacionan con antiguos meandros; no toda laguna comparte un único origen.',
  'Altos y filos no son sinónimos: distinguir superficies elevadas de crestas o divisorias.']),
 ('Aplicación cuidadosa',[
  'Tierra firme no significa inmunidad ante cualquier inundación o deslizamiento.',
  'No deducir que una ciudad entera está a salvo por nombrar una geoforma.',
  'Para evaluar un lugar concreto, consultar sus condiciones y mapas de peligro.'])]

ocean='''### Comparar formas del fondo marino

| Forma | Rasgo para reconocerla | Qué no debe deducirse |
|---|---|---|
| Plataforma continental | Prolongación sumergida del continente, de pendiente relativamente suave | Su borde no tiene una profundidad universal exacta |
| Talud continental | Aumento de pendiente hacia el océano profundo | No constituye una pared vertical idéntica en toda costa |
| Fosa oceánica | Depresión alargada asociada a convergencia de placas | No confundir profundidad bajo el mar con altura de una montaña |
| Llanura abisal | Superficie extensa y relativamente llana del fondo profundo | No ocupa siempre la misma posición respecto de una dorsal |
| Dorsal de Nazca | Elevación submarina del contexto peruano | El nombre dorsal no la convierte en una dorsal mediooceánica de expansión |

**Importante:** esta comparación no es un perfil batimétrico a escala. La plataforma y la zona fótica se definen con criterios distintos: relieve y luz disponible. La penetración de luz cambia con las condiciones del agua.
'''

flood='''### Distinguir ambiente, forma y exposición al agua

| Término | Qué describe | Precisión |
|---|---|---|
| Tahuampa | Ambiente de bosque inundable | No es sinónimo obligatorio de aguajal |
| Aguajal | Humedal asociado al aguaje | Su vegetación y drenaje son parte de la definición |
| Restinga | Terreno aluvial relativamente elevado | Comparar restingas bajas y altas, sin una regla única de inundación |
| Alto | Terreno relativamente elevado | No garantiza ausencia de peligro en cualquier evento |
| Filo | Cresta estrecha o divisoria | No es una cota fija de 300 metros |
| Cocha | Cuerpo de agua de la llanura amazónica | Examinar su origen y conexión con el río |

**Importante:** las denominaciones locales y las clasificaciones ecológicas no siempre coinciden exactamente. No convertir una secuencia para memorizar en una escala altitudinal universal.
'''

descriptions='''1. **Tahuampas y aguajales:** deben distinguirse. La tahuampa se asocia a bosque inundable; el aguajal se reconoce por su humedal y el aguaje (*Mauritia flexuosa*). No todo bosque inundable es un aguajal.
2. **Barrizales y playones:** superficies de sedimentos expuestas durante la vaciante. Su exposición cambia con el nivel del río.
3. **Restingas:** terrenos aluviales de altura relativa diversa. El comportamiento frente a crecidas depende del nivel del terreno y de la dinámica local; no se limita siempre a crecientes extraordinarias.
4. **Altos:** terrenos elevados respecto de áreas vecinas. Esta denominación no prueba por sí sola que un asentamiento completo sea seguro frente a todos los eventos.
5. **Filos:** crestas estrechas que pueden actuar como divisorias. No se definen por una cota universal.
6. **Cochas:** lagunas o cuerpos de agua amazónicos; muchas proceden de meandros abandonados, pero debe examinarse el caso antes de atribuirles un único origen.
'''

def build():
 evidence=[];preview=[]
 for part in [1,2]:
  rel=f'geografia/semana07/7.{part}/theory.md';p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=p.read_text(encoding='utf8');digest=hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()
  backup=ROOT/'build/academic-backup-geography-maps-07'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(p,backup)
  counts={'ocean':0,'andes':0,'amazon':0}
  def replace(m):
   s=m[0]
   if 'Nivel del mar (0 m)' in s:counts['ocean']+=1;return ocean
   if '[SECTOR NORTE]' in s:counts['andes']+=1;return make_map('Relieve andino: referencias y formas',andes)
   if '[TAHUAMPAS / AGUAJALES]' in s:counts['amazon']+=1;return make_map('Relieve amazónico e inundación',amazon)+'\n\n'+flood
   return s
  new=re.sub(r'```[^\n]*\n.*?```',replace,raw,flags=re.S)
  assert counts==dict(ocean=1,andes=1,amazon=1),counts
  a=new.index('1. **Tahuampas o Aguajales:**');b=new.index('\n---',a)
  new=new[:a]+descriptions+new[b:]
  new=new.replace('Terraza aluvial intermedia en la selva baja que solo se inunda durante las crecientes fluviales estacionales extraordinarias.','Terreno aluvial de altura relativa variable; su inundabilidad depende de la posición y la dinámica local.')
  new=new.replace('Zócalo Continental (0 a -200 m, fótico, pesca, petróleo)','Plataforma continental: relieve sumergido; no equivale exactamente a la zona fótica')
  new=new.replace('Valles Transversales (53 ríos, conos aluviales, ciudades)','Valles transversales: drenaje, depósitos aluviales y asentamientos')
  new=new.replace('Al ser poco profunda, es plenamente iluminada por la luz solar (**zona fótica**), lo que permite la proliferación masiva del fitoplancton.','La luz y los nutrientes favorecen la producción de fitoplancton, pero la zona fótica depende de la penetración de luz y no coincide necesariamente con toda la plataforma.')
  new=new.replace('### Mnemotecnia 1: Los 4 Pisos de la Selva Baja (de Abajo hacia Arriba)','### Mnemotecnia: cinco términos para distinguir, no cinco cotas fijas')
  new=new.replace('**TA**huampa (siempre bajo agua, pantano con aguaje)','**TA**huampa (bosque inundable; distinguir del aguajal)')
  new=new.replace('**RES**tinga (se inunda solo en crecientes extremas)','**RES**tinga (altura relativa e inundabilidad variables)')
  new=new.replace('**AL**to (nunca se inunda, ciudades)','**AL**to (terreno relativamente elevado; evaluar condiciones locales)')
  new=new.replace('¿Qué son las Tahuampas o Aguajales en la llanura amazónica?','¿Por qué no deben confundirse tahuampas y aguajales?')
  new=new.replace('Zonas bajas y pantanosas permanentemente inundadas donde predomina la palmera del aguaje.','La tahuampa se asocia a bosque inundable; el aguajal es un humedal caracterizado por el aguaje. Son distinciones ecológicas, no sinónimos universales.')
  new=new.replace('¿En qué nivel morfológico de la Selva Baja se fundan las ciudades como Iquitos y Pucallpa para no inundarse?','¿Qué significa alto al describir el relieve amazónico?')
  new=new.replace('* **RESPUESTA:** En los Altos.','* **RESPUESTA:** Terreno relativamente elevado; el término no garantiza por sí solo seguridad de toda una ciudad frente a inundaciones.')
  p.write_text(new,encoding='utf8')
  f=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  shutil.copy2(p,f);assert hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'7.{part}',questionsHash=digest))
  for key,title,branches in [('andes','Relieve andino: referencias y formas',andes),('amazon','Relieve amazónico e inundación',amazon)]:
   for i,label in enumerate([title]+[x for n,ls in branches for x in [n]+ls]):
    preview.append(dict(id=f'geo7_{part}_{key}_{i}',subject='geografia',concept=f'7.{part}',statement=label,options=[],explanation=''))
  for key,table in [('ocean',ocean),('flood',flood)]:
   preview.append(dict(id=f'geo7_{part}_{key}',subject='geografia',concept=f'7.{part}',statement=table,options=[],explanation=''))
 (ROOT/'build/geography-maps-07-review.json').write_text(json.dumps(evidence,indent=2),encoding='utf8')
 (ROOT/'build/geography-maps-07-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print('2 theories; 4 new maps; 68 nodes; 4 tables')

if __name__=='__main__':build()
