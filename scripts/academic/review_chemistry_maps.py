"""Cinco mapas de Química, con relaciones explícitas y sin cambiar las preguntas."""
from pathlib import Path
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT
MAPS={
1:('Materia: composición y fases',[
 ('Sustancias puras',[
  'Composición definida; propiedades características bajo condiciones dadas.',
  'Elemento: un solo número atómico; puede presentar formas alotrópicas.',
  'Compuesto: elementos unidos químicamente en proporción definida; se descompone por procesos químicos.']),
 ('Mezclas',[
  'Composición variable; sus componentes pueden separarse mediante procesos físicos apropiados.',
  'Homogénea: una fase a la escala considerada; ejemplo, una solución.',
  'Heterogénea: más de una fase; incluye suspensiones y dispersiones coloidales a escala microscópica.']),
 ('Cómo clasificar',[
  'La apariencia uniforme a simple vista no demuestra que sea una sustancia pura.',
  'Una solución contiene soluto y disolvente, aunque se observe una sola fase.',
  'Un coloide puede parecer uniforme y seguir siendo una dispersión de fases distintas.'])
 ]),
2:('Estados de la materia y energía',[
 ('Estados de agregación',[
  'Sólido: forma y volumen definidos en condiciones habituales.',
  'Líquido: volumen definido y forma del recipiente.',
  'Gas: se expande para ocupar el recipiente.',
  'Plasma: estado ionizado con electrones libres e iones; no es simplemente un gas caliente cualquiera.']),
 ('Cambios que absorben calor',[
  'Fusión: sólido a líquido.',
  'Vaporización: líquido a gas.',
  'Sublimación directa: sólido a gas sin pasar por líquido.']),
 ('Cambios que liberan calor',[
  'Solidificación: líquido a sólido.',
  'Condensación o licuación: gas a líquido.',
  'Deposición o sublimación inversa: gas a sólido.']),
 ('Relación masa-energía',[
  r'Energía en reposo: $E_0=mc^2$, con m como masa invariante.',
  r'Variación de energía en reposo: $\Delta E_0=\Delta m c^2$; conservar una convención de signos.',
  r'Energía total de una partícula libre: $E=\gamma mc^2$, $\gamma=1/\sqrt{1-v^2/c^2}$.',
  'Masa relativista es una denominación histórica; no confundirla con la masa invariante.'])
 ]),
3:('Estructura atómica y especies',[
 ('Núcleo',[
  'Protones: carga positiva; su cantidad define el elemento.',
  'Neutrones: sin carga eléctrica neta.',
  'Concentra casi toda la masa del átomo; la proporción exacta depende de la especie.']),
 ('Región electrónica',[
  'Electrones: carga negativa; se describen mediante estados cuánticos.',
  'Un orbital expresa una distribución de probabilidad; no es una órbita planetaria.',
  'La nube electrónica determina la mayor parte del tamaño del átomo.']),
 ('Notación y conteo',[
  r'Notación: ${}^{A}_{Z}X^{q}$. Número atómico: $Z=p$.',
  r'Número de masa: $A=p+n$; por tanto, $n=A-Z$.',
  r'Número de carga: $q=p-e$; la carga física es $q e_0$.',
  'En un átomo neutro, la cantidad de electrones coincide con Z.']),
 ('Comparación entre especies',[
  'Isótopos: mismo Z y diferente número de neutrones.',
  'Isóbaros: igual A y distinto Z.',
  'Isótonos: igual número de neutrones y distinto Z.',
  'Especies atómicas isoelectrónicas: igual número de electrones; esta comparación no es una propiedad del núcleo.'])
 ]),
4:('Estructura electrónica y periodicidad',[
 ('Números cuánticos',[
  'n: número principal; identifica la capa.',
  'l: momento angular orbital; distingue subniveles s, p, d y f.',
  'm_l: proyección del momento angular orbital.',
  r'Spin: propiedad intrínseca; $m_s=+1/2$ o $-1/2$. No es un giro clásico sobre un eje.']),
 ('Configuración electrónica',[
  'Aufbau: ocupar primero los orbitales de menor energía en el modelo utilizado.',
  'Pauli: dos electrones del mismo átomo no comparten los cuatro números cuánticos.',
  'Hund: ocupar orbitales degenerados individualmente y con espines paralelos antes de aparearlos.',
  'Las excepciones se comprueban por especie; no aplicar una regla de traslado universal a cualquier d4 o d9.']),
 ('Tabla periódica',[
  'Ordenada por número atómico creciente; las propiedades varían periódicamente.',
  'Organización actual: 7 períodos y 18 grupos numerados del 1 al 18.',
  'Bloques s y p: elementos representativos; d: transición; f: transición interna.']),
 ('Tendencias con condiciones',[
  'Radio atómico: en general aumenta al bajar en un grupo y al avanzar hacia la izquierda en un período.',
  'Primera energía de ionización: tendencia general a aumentar hacia arriba y a la derecha, con excepciones.',
  'Electronegatividad: tendencia general a aumentar hacia arriba y a la derecha entre elementos comparables.',
  'Afinidad electrónica y radio iónico requieren revisar especie, carga y convención; no siguen una flecha universal sin excepciones.'])
 ]),
5:('Enlaces e interacciones',[
 ('Enlaces químicos',[
  'Iónico: atracción electrostática entre iones de signo opuesto, habitualmente en una red.',
  'Covalente: compartición de densidad electrónica entre átomos.',
  'Metálico: electrones deslocalizados asociados a la estructura metálica.']),
 ('Enlace covalente y polaridad',[
  'Enlace apolar: compartición aproximadamente simétrica.',
  'Enlace polar: distribución desigual de densidad electrónica.',
  'Coordinado o dativo: el par compartido procede inicialmente de un mismo donante.',
  'La polaridad molecular también depende de la geometría; enlaces polares pueden compensarse.']),
 ('Interacciones entre partículas',[
  'Dispersión de London: existe en átomos y moléculas, tanto polares como apolares.',
  'Dipolo-dipolo: interacción entre dipolos permanentes.',
  'Puente de hidrógeno: en los casos introductorios, H unido a N, O o F interactúa con un par libre adecuado.',
  'No todas las sustancias forman moléculas discretas; distinguir interacción intermolecular de red iónica o metálica.'])
 ])}

def build():
 evidence=[]
 for week,(title,branches) in MAPS.items():
  rel=Path(f'quimica/semana{week:02d}/{week}.1/theory.md')
  path=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=path.read_text(encoding='utf8')
  blocks=list(re.finditer(r'```[^\n]*\n.*?```',raw,re.S))
  block=next(m for m in blocks if '│' in m[0] or '├' in m[0])
  backup=ROOT/'build/academic-backup-chemistry-maps'/rel
  backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(path,backup)
  question=path.with_name('questions.json');digest=hashlib.sha256(question.read_bytes()).hexdigest()
  new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]
  path.write_text(new,encoding='utf8')
  fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  assert fixture.exists();shutil.copy2(path,fixture)
  assert hashlib.sha256(question.read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'{week}.1',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
 (ROOT/'build/chemistry-maps-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence))))
if __name__=='__main__':build()
