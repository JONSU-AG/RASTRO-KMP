"""Review four geography theory resources without changing question banks."""
import re,json,hashlib,shutil
from review_logical_maps import ROOT,make_map

layers='''### Capas atmosféricas: leer de abajo hacia arriba

| Capa | Extensión orientativa | Comportamiento térmico y rasgo principal |
|---|---|---|
| Tropósfera | Desde la superficie hasta una tropopausa variable | La temperatura suele disminuir con la altura; concentra la mayor parte del tiempo meteorológico |
| Estratósfera | Desde la tropopausa hasta unos 50 km | La absorción de radiación ultravioleta por el ozono contribuye al aumento de temperatura |
| Mesósfera | Aproximadamente 50–85 km | La temperatura vuelve a disminuir; muchos meteoroides se desintegran en esta región |
| Termósfera | Desde unos 85 km hasta varios cientos de kilómetros | Aumenta la temperatura cinética del gas, que es muy poco denso |
| Exósfera | Transición exterior por encima de la termósfera | Partículas muy separadas; no es una frontera rígida con el espacio |

**Importante:** las alturas son aproximadas. La tropopausa varía con la latitud y las condiciones atmosféricas; no está siempre a 12 km. La tabla representa un perfil general, no una medición meteorológica del día.

La **ionósfera** se define por la presencia de partículas ionizadas, no por el mismo criterio térmico de la tabla. Se superpone a partes de distintas capas; no es otro nombre de la termósfera. Su interacción con ondas de radio depende de la frecuencia y del estado de ionización: no todas las señales se reflejan igual.

La **magnetósfera** se relaciona con el campo magnético terrestre y las partículas cargadas. No se usa como sinónimo de exósfera ni como una sexta capa térmica.

### Aplicar el modelo sin confundirlo con una observación

En ejercicios que lo indiquen, puede suponerse un descenso medio de **6,5 °C por kilómetro**. Ese supuesto permite estimar una variación térmica; no significa que toda columna real de aire tenga siempre ese gradiente. Una inversión térmica es un caso en que la temperatura aumenta con la altura en cierto intervalo.

1. Identifica la diferencia de altura y sus unidades.
2. Aplica el gradiente que proporciona el problema.
3. Explica que el resultado corresponde al modelo adoptado, no a un pronóstico local.
'''

branches=[
 ('Pacífico',[
  'La red de drenaje conduce sus aguas hacia el océano Pacífico.',
  'En muchos ríos costeros hay marcada estacionalidad; no todos tienen idéntico régimen.',
  'Una región hidrográfica reúne varias cuencas; no equivale a un único río.']),
 ('Amazonas',[
  'Sus aguas se integran en la red amazónica que alcanza el océano Atlántico.',
  'La cuenca incluye cabeceras andinas y llanuras; no todos sus tramos son navegables.',
  'Caudal abundante no significa ausencia de variaciones estacionales.']),
 ('Titicaca',[
  'El drenaje forma parte de un sistema interior sin salida al océano.',
  'Endorreico no significa que cada lago carezca de un río de salida.',
  'El Desaguadero es el efluente del Titicaca y continúa dentro del sistema interior.']),
 ('Cómo interpretar el esquema',[
  'Una divisoria separa áreas de drenaje; una cuenca reúne aguas hacia una salida común.',
  'La cordillera influye en las divisorias, pero este mapa es conceptual y no está a escala.',
  'Distinguir el conteo de ríos del conteo de cuencas o unidades hidrográficas.'])]

comparison='''### Comparar el destino del drenaje

| Región hidrográfica | Destino de la red | Precisión necesaria |
|---|---|---|
| Pacífico | Océano Pacífico | El régimen varía entre ríos y estaciones |
| Amazonas | Atlántico, a través de la red amazónica | La navegabilidad depende del tramo y las condiciones |
| Titicaca | Sistema interior | La salida por el Desaguadero no es una salida al océano |

**Importante:** un inventario de cuencas no cuenta lo mismo que una lista de ríos principales. Antes de usar una cifra, identifica la unidad y la clasificación de la fuente. Este esquema no establece un número universal de ríos.
'''

def build():
 evidence=[];preview=[]
 for week in [5,6]:
  for part in [1,2]:
   rel=f'geografia/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');digest=hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()
   backup=ROOT/'build/academic-backup-geography-maps-05-06'/rel
   backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   if week==5:
    # Replace the fixed-width profile and its adjacent descriptions together.
    a=raw.index('### 3.2. Estructura Vertical Térmica de la Atmósfera')
    b=raw.index('\n---',a)
    new=raw[:a]+'### 3.2. Estructura vertical de la atmósfera\n\n'+layers+raw[b:]
    new=new.replace('Termósfera (Ionósfera)','Termósfera; ionósfera superpuesta a varias capas')
    new=new.replace('La Termósfera o Ionósfera (capas de Kennelly-Heaviside y Appleton).','La ionósfera, región ionizada superpuesta a varias capas térmicas; el comportamiento de la señal depende de su frecuencia.')
    # Preserve the original calculation and numbers, explicitly framed as a model above.
   else:
    blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if 'CORDILLERA DE LOS ANDES' in m[0]]
    assert len(blocks)==1,rel
    m=blocks[0]
    new=raw[:m.start()]+make_map('Vertientes hidrográficas: destino de las aguas',branches)+'\n\n'+comparison+raw[m.end():]
    new=new.replace('Exorreica, 53 ríos, régimen irregular, torrentosos, hidroeléctricas e irrigaciones','Drenaje al Pacífico, estacionalidad variable, usos hidroeléctricos e irrigación')
    new=new.replace('Exorreica, caudalosa, régimen regular, navegable, pongos, origen del río Amazonas','Drenaje amazónico al Atlántico, variación estacional y navegabilidad según el tramo')
    new=new.replace('Compuesta por **53 ríos principales** que nacen en la vertiente occidental andina y desembocan en el Océano Pacífico.','Comprende varias cuencas con drenaje hacia el océano Pacífico. Una lista de ríos principales no equivale a un inventario de unidades hidrográficas.')
    new=new.replace('Regular (abundante todo el año)','Caudal abundante en muchos ríos, con variación estacional')
   p.write_text(new,encoding='utf8')
   f=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert f.exists();shutil.copy2(p,f)
   assert hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()==digest
   evidence.append(dict(level=f'{week}.{part}',questionsHash=digest))
   preview.append(dict(id=f'geo_{week}_{part}_table',subject='geografia',concept=f'{week}.{part}',statement=layers if week==5 else comparison,options=[],explanation=''))
   if week==6:
    for i,label in enumerate(['Vertientes hidrográficas: destino de las aguas']+[v for title,leaves in branches for v in [title]+leaves]):
     preview.append(dict(id=f'geo_{week}_{part}_{i}',subject='geografia',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
 (ROOT/'build/geography-maps-05-06-review.json').write_text(json.dumps(evidence,indent=2),encoding='utf8')
 (ROOT/'build/geography-maps-05-06-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print('4 theories; 2 new maps; 34 nodes; 4 tables')

if __name__=='__main__':build()
