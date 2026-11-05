"""Make the eight-region profile readable without imposing a symmetric geography."""
import re,json,hashlib,shutil
from review_logical_maps import ROOT,make_map

branches=[
 ('Clasificación de Pulgar Vidal',[
  'Relaciona altitud, clima, relieve, seres vivos, nombres regionales y actividades humanas.',
  'Sus ocho regiones no son departamentos ni fronteras administrativas.',
  'No confundir este sistema con las once ecorregiones de Brack.']),
 ('Referencias occidentales y andinas',[
  'Chala y Yunga marítima sirven para estudiar el ascenso desde la costa.',
  'Quechua, Suni, Puna y Janca organizan pisos andinos; no son exclusivos de una sola ladera.',
  'Janca designa el piso más alto del esquema, no una medición actual de cada cumbre.']),
 ('Referencias orientales',[
  'Yunga fluvial: distinguir su intervalo de la Yunga marítima.',
  'Rupa Rupa enlaza el estudio del flanco oriental con Omagua en tierras más bajas.',
  'No suponer que un descenso desde la cumbre salta todos los pisos intermedios hasta la selva.']),
 ('Aplicar los rangos con cuidado',[
  'Los intervalos son referencias de una clasificación; no paredes físicas en el paisaje.',
  'Una ciudad o región administrativa puede abarcar lugares situados a distintas altitudes.',
  'Una especie usada como ejemplo no es necesariamente exclusiva de un piso.'])]

table='''### Leer los pisos sin dibujar franjas simétricas

| Región | Intervalo de referencia en metros sobre el nivel del mar | Precisión para interpretar |
|---|---|---|
| Chala | 0–500 | Referencia costera del esquema |
| Yunga | Marítima: 500–2300; fluvial: 1000–2300 | No aplicar el mismo inicio a ambas vertientes |
| Quechua | 2300–3500 | Piso andino; no equivale a un departamento entero |
| Suni | 3500–4000 | Comparar sus condiciones con los pisos vecinos |
| Puna | 4000–4800 | Referencia altoandina, con variación local |
| Janca | Desde 4800 hacia las cumbres | El techo de una montaña no es una frontera de altitud universal |
| Rupa Rupa | 400–1000 | Referencia de selva alta en esta clasificación |
| Omagua | Aproximadamente 80–400 | Referencia de selva baja en esta clasificación |

**Importante:** los rangos se presentan como convenciones de estudio de las ocho regiones de Pulgar Vidal. No son un pronóstico del tiempo, un mapa de peligro ni una garantía de que toda la flora o población se ajuste a una franja exacta.

### Resolver una ubicación paso a paso

1. Identifica qué sistema de clasificación pide el ejercicio.
2. Comprueba la altitud y, en Yunga, la vertiente o modalidad indicada.
3. Compara el intervalo sin convertir el nombre de una ciudad en la altitud de todos sus distritos.
4. Si el dato está justo en un límite, conserva la convención de la fuente y consulta los demás rasgos; no inventes una asignación exclusiva.
'''

def build():
 evidence=[];preview=[]
 for part in [1,2]:
  rel=f'geografia/semana08/8.{part}/theory.md';p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=p.read_text(encoding='utf8');digest=hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()
  backup=ROOT/'build/academic-backup-geography-maps-08'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(p,backup)
  blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if 'Altitud (m)' in m[0]]
  assert len(blocks)==1,rel
  m=blocks[0];new=raw[:m.start()]+make_map('Ocho regiones: cómo interpretar su distribución',branches)+'\n\n'+table+raw[m.end():]
  new=new.replace('Vertiente Occidental y Cumbres','Referencias costeras y andinas; no exclusivas de una vertiente')
  new=new.replace('Vertiente Oriental y Llanura Amazónica','Referencias amazónicas; considerar también la Yunga fluvial')
  new=new.replace("2. Yunga (500 a 2 300 m)<br/>'Valle cálido' (Marítima y Fluvial)","2. Yunga: marítima 500–2300 m; fluvial 1000–2300 m")
  new=new.replace("6. Janca o Cordillera (4 800 a 6 768 m)<br/>'Blanco / Nieve'","6. Janca o Cordillera: desde 4800 m hacia las cumbres")
  new=new.replace('| **Yunga** | 500 - 2\\,300 |','| **Yunga** | Marítima: 500–2300; fluvial: 1000–2300 |')
  new=new.replace('Desértico cálido (sol permanente)','Marítima y fluvial con condiciones diferentes')
  new=new.replace('Glaciar (bajo 0^\\circ\\text{C} siempre)','Alta montaña; frío intenso y variación local')
  new=new.replace('### Mnemotecnia 1: Las 8 Regiones en Orden de Ascenso y Descenso','### Mnemotecnia: recordar nombres, no un perfil idéntico en todo el Perú')
  new=new.replace('* *(Bajando por el flanco oriental hacia la Amazonía:)*','* *(Otros dos nombres del esquema amazónico; la lista abreviada no dibuja todos los pisos del descenso:)*')
  new=new.replace('* **YU** \\rightarrow **YU**nga (500 - 2\\,300)','* **YU** \\rightarrow **YU**nga (marítima: 500–2300; fluvial: 1000–2300)')
  p.write_text(new,encoding='utf8')
  f=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  shutil.copy2(p,f);assert hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'8.{part}',questionsHash=digest))
  for i,label in enumerate(['Ocho regiones: cómo interpretar su distribución']+[x for n,ls in branches for x in [n]+ls]):
   preview.append(dict(id=f'geo8_{part}_{i}',subject='geografia',concept=f'8.{part}',statement=label,options=[],explanation=''))
  preview.append(dict(id=f'geo8_{part}_table',subject='geografia',concept=f'8.{part}',statement=table,options=[],explanation=''))
 (ROOT/'build/geography-maps-08-review.json').write_text(json.dumps(evidence,indent=2),encoding='utf8')
 (ROOT/'build/geography-maps-08-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print('2 theories; 2 new maps; 34 nodes; 2 tables')

if __name__=='__main__':build()
