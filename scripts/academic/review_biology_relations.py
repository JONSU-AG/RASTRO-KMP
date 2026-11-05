"""Repair ten ambiguous relationship questions; retain IDs and the existing engine."""
from pathlib import Path
import argparse,json,shutil
ROOT=Path(__file__).resolve().parents[2]
PAIRS={
'9.2':('bio_t09_s02_c12','Relaciona cada estructura nerviosa con la función descrita.',[
 ('Tálamo','Relevo hacia la corteza de gran parte de la información sensorial.'),
 ('Hipotálamo','Integración de funciones homeostáticas y regulación neuroendocrina.'),
 ('Cerebelo','Coordinación de movimientos y participación en el equilibrio.'),
 ('Bulbo raquídeo','Incluye centros de control cardiorrespiratorio.')]),
'9.3':('bio_t09_s03_c11','Relaciona la vía autonómica con su señalización característica en el caso indicado.',[
 ('Sinapsis en un ganglio autonómico','Acetilcolina sobre receptores nicotínicos.'),
 ('Terminal parasimpática posganglionar en el órgano efector','Acetilcolina sobre receptores muscarínicos.'),
 ('Terminal simpática posganglionar en el corazón','Noradrenalina sobre receptores adrenérgicos.'),
 ('Médula suprarrenal activada','Liberación de adrenalina y noradrenalina a la sangre.')]),
'9.4':('bio_t09_s04_c11','Relaciona cada hormona con el efecto regulador indicado, en el modelo fisiológico general.',[
 ('Insulina','Favorece la disminución de la glucemia.'),
 ('Glucagón','Favorece el aumento de la glucemia.'),
 ('Calcitonina','Puede contribuir a disminuir el calcio sanguíneo al limitar la resorción ósea.'),
 ('Hormona paratiroidea (PTH)','Favorece el aumento del calcio sanguíneo.')]),
'10.1':('bio_t10_s01_c12','Relaciona cada etapa del ciclo celular con su proceso característico.',[
 ('G1','Crecimiento y actividad celular anteriores a la fase S.'),
 ('S','Replicación del ADN nuclear.'),
 ('G2','Preparación y controles previos a la fase mitótica, después de S.'),
 ('G0','Estado fuera del ciclo proliferativo activo; no equivale necesariamente a muerte celular.')]),
'11.4':('bio_t11_s04_c12','Relaciona cada condición con un cariotipo de ejemplo. Se muestran formas completas no mosaico; no se afirma que sean sus únicas variantes.',[
 ('Síndrome de Down','47,XX,+21'),('Síndrome de Edwards','47,XY,+18'),
 ('Síndrome de Patau','47,XX,+13'),('Síndrome de Turner','45,X')]),
'12.3':('bio_t12_s03_c12','Relaciona cada concepto de evidencia evolutiva con su descripción.',[
 ('Estructuras homólogas','Comparten origen evolutivo aunque sus funciones puedan diferir.'),
 ('Estructuras análogas','Funciones semejantes desarrolladas independientemente en el rasgo comparado.'),
 ('Estructura vestigial','Rasgo reducido respecto de su condición ancestral; puede conservar alguna función.'),
 ('Fósil','Resto o evidencia de actividad de organismos del pasado conservado en un contexto geológico.')]),
'13.1':('bio_t13_s01_c12','Relaciona cada función trófica con la descripción correspondiente.',[
 ('Productor fotoautótrofo','Utiliza luz y fija carbono inorgánico para formar materia orgánica.'),
 ('Consumidor primario','Se alimenta directamente de productores.'),
 ('Consumidor secundario','Se alimenta de consumidores primarios.'),
 ('Descomponedor','Degrada materia orgánica y participa en el reciclaje de nutrientes.')]),
'13.2':('bio_t13_s02_c12','Relaciona cada participante del ciclo del nitrógeno con el proceso indicado.',[
 ('Rhizobium en simbiosis con leguminosas','Fijación de nitrógeno atmosférico.'),
 ('Nitrobacter en la nitrificación','Oxidación de nitrito a nitrato.'),
 ('Bacterias desnitrificantes','Reducción de nitratos que puede devolver nitrógeno gaseoso a la atmósfera.'),
 ('Microorganismos amonificadores','Conversión de nitrógeno orgánico en amonio.')]),
'13.3':('bio_t13_s03_c12','Relaciona cada interacción ecológica con el efecto descrito.',[
 ('Mutualismo','Ambas especies se benefician en la interacción considerada.'),
 ('Comensalismo','Una se beneficia y la otra no presenta un efecto apreciable en el modelo descrito.'),
 ('Parasitismo','El parásito se beneficia y el hospedador resulta perjudicado.'),
 ('Competencia interespecífica','Especies diferentes disputan un recurso limitante y ambas soportan un costo.')]),
'13.4':('bio_t13_s04_c12','Relaciona cada grupo de sustancias con el proceso ambiental al que contribuye.',[
 ('CFC que alcanzan la estratosfera','Agotamiento del ozono estratosférico mediante especies halogenadas reactivas.'),
 ('Aporte excesivo de nitratos y fosfatos al agua','Enriquecimiento de nutrientes que puede favorecer eutrofización.'),
 ('Dióxido de azufre y óxidos de nitrógeno en la atmósfera','Formación de especies que contribuyen a la deposición ácida.'),
 ('Dióxido de carbono y metano atmosféricos','Interacción con radiación infrarroja vinculada al efecto invernadero.')]),
}

def build(write=False):
 source=ROOT/'shared/src/commonMain/composeResources/files/aprender/biologia'
 fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/biologia'
 preview=[]
 for level,(qid,statement,pairs)in PAIRS.items():
  week=int(level.split('.')[0]);rel=Path(f'semana{week:02}')/level/'questions.json';path=source/rel
  bank=json.loads(path.read_text(encoding='utf-8-sig'));oldids=[q['id']for q in bank]
  q=next(q for q in bank if q['id']==qid)
  q.update(type='MATCH_PAIRS',statement=statement,options=[],correctIndex=0,
   instruction='Selecciona un elemento de cada columna para formar los cuatro pares.',
   pairs=[dict(id=f'p{i+1}',left=a,right=b)for i,(a,b)in enumerate(pairs)],
   rightOptions=[dict(id=f'p{i+1}',text=pairs[i][1])for i in(2,0,3,1)],
   explanation='\n'.join(f'{i+1}. {a}: {b}'for i,(a,b)in enumerate(pairs)),
   fuente='Revisión RASTRO: docs/aprender/biologia/REVISION_RELACIONES_2026-11-02.md')
  assert len(set(a for a,b in pairs))==4 and len(set(b for a,b in pairs))==4
  assert[q['id']for q in bank]==oldids
  if write:
   backup=ROOT/'build/academic-backup-biology-relations'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(path,backup)
   path.write_text(json.dumps(bank,ensure_ascii=False,indent=2)+'\n',encoding='utf8');shutil.copy2(path,fixture/rel)
  preview.append(q)
 rel=Path('semana08/8.1/questions.json');path=source/rel;bank=json.loads(path.read_text(encoding='utf-8-sig'))
 q=next(q for q in bank if q['id']=='bio_t08_s01_c1')
 q['statement']='¿Qué glicoproteína producida por las células parietales del estómago participa en la absorción de vitamina B12 en el íleon terminal?'
 q['explanation']='1. Las células parietales secretan ácido clorhídrico y factor intrínseco.\n2. El factor intrínseco participa en el mecanismo de absorción intestinal de la vitamina B12.\n3. La glicoproteína solicitada es el factor intrínseco de Castle; el ejercicio no prescribe un tratamiento.'
 q['fuente']='OpenStax Anatomy and Physiology 2e, 23.4 The Stomach; revisión local de fisiología.'
 assert q['options'][q['correctIndex']]=='Factor intrínseco de Castle'
 if write:
  backup=ROOT/'build/academic-backup-biology-relations'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(path,backup)
  path.write_text(json.dumps(bank,ensure_ascii=False,indent=2)+'\n',encoding='utf8');shutil.copy2(path,fixture/rel)
 preview.append(q)
 (ROOT/'build/biology-relations-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
 print(json.dumps(dict(questions=len(preview),matching=10,pairs=40,written=write)))

if __name__=='__main__':
 ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
