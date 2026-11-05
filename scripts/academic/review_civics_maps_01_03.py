"""Tres temas de Cívica: distinciones conceptuales y alcance constitucional explícito."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
1:('Persona, dignidad y convivencia',[
 ('La persona en sociedad',[
  'Distinguir dimensiones biológicas, psicológicas, sociales y éticas sin reducir a la persona a una sola.',
  'La defensa de la persona y el respeto de su dignidad orientan la sociedad y el Estado en el artículo 1.',
  'La dignidad no depende de riqueza, productividad, ciudadanía o aprobación de una mayoría.']),
 ('Derechos y responsabilidad',[
  'El artículo 2 reconoce derechos de la persona; no se limita a derechos de quienes pueden votar.',
  'Sobre el concebido, el inciso 1 reconoce la condición de sujeto de derecho en todo cuanto le favorece; conservar esa precisión.',
  'El ejercicio de derechos y las responsabilidades de convivencia se examinan con sus condiciones, no como permisos ilimitados.']),
 ('Normas',[
  'Distinguir criterios morales, reglas de trato social, normas religiosas y normas jurídicas.',
  'Las normas jurídicas pertenecen al ordenamiento; su coercibilidad no significa que toda infracción produzca cárcel.',
  'Una regla puede tener relevancia moral y jurídica a la vez; las categorías no son compartimentos sin relación.']),
 ('Convivencia',[
  'Respeto, solidaridad, justicia y resolución pacífica orientan la convivencia.',
  'Respetar a una persona no exige aceptar todas sus afirmaciones como verdaderas.',
  'Ante un desacuerdo, identificar hechos, reglas y razones antes de responder con una descalificación.'])]),
2:('Ciudadanía y participación',[
 ('Conceptos diferentes',[
  'Distinguir persona, nacionalidad, ciudadanía y ejercicio de derechos políticos.',
  'El artículo 30 vincula la ciudadanía con la condición de peruano y la mayoría de edad de dieciocho años.',
  'La inscripción electoral se exige para el ejercicio de la ciudadanía; no confundir ese requisito con la definición de persona.']),
 ('Participación y sufragio',[
  'Elegir y ser elegido se ejerce según condiciones y procedimientos establecidos.',
  'La participación pública incluye mecanismos distintos del voto en una elección de representantes.',
  'El artículo 31 distingue voto obligatorio y facultativo; las condiciones de un proceso concreto requieren consultar su información oficial.']),
 ('Ejercicio y suspensión',[
  'El artículo 33 regula suspensión del ejercicio de la ciudadanía; no equivale a borrar identidad ni dignidad.',
  'No deducir automáticamente la habilitación electoral de poseer un DNI: distinguir identificación e inscripción electoral.',
  'No confundir una propuesta de reforma con una disposición ya aprobada y vigente.']),
 ('Identidad y vida común',[
  'Los símbolos nacionales y la diversidad cultural son dimensiones de identidad colectiva.',
  'La identidad no exige uniformidad de lengua, costumbres o convicciones.',
  'Distinguir obligaciones establecidas por normas de actitudes cívicas que requieren justificación y participación.'])]),
3:('Estado, nación y gobierno',[
 ('Distinguir los conceptos',[
  'Estado: organización política y jurídica de una población sobre un territorio.',
  'Nación: comunidad histórica y cultural; su definición no se reduce a una sola lengua o ascendencia.',
  'Gobierno: autoridades y funciones de dirección; no es idéntico al Estado entero.']),
 ('Elementos y ordenamiento',[
  'Población, territorio y poder político son categorías del análisis del Estado.',
  'Examinar el orden jurídico y las instituciones sin confundirlos con una persona gobernante.',
  'Ius soli e ius sanguinis aluden a criterios de nacionalidad; no son elementos de una población ni pruebas de que exista un Estado.']),
 ('El Estado peruano',[
  'El artículo 43 caracteriza la República y la organización de su gobierno; distinguir esas dimensiones.',
  'La unidad estatal no elimina la descentralización ni exige uniformidad cultural.',
  'El poder estatal está sujeto a la Constitución; no es una autorización ilimitada para cualquier autoridad.']),
 ('Deberes y defensa constitucional',[
  'El artículo 44 vincula deberes estatales con soberanía, derechos, seguridad y bienestar general.',
  'El artículo 45 sitúa el origen del poder y los límites de su ejercicio.',
  'La defensa del orden constitucional debe estudiarse bajo sus condiciones, sin presentar cualquier desacuerdo político como usurpación.'])])}

TABLES={
1:'''\n\n### Reconocer la regla y su función

| Tipo de norma, como distinción didáctica | Qué examinar | Qué evitar |
|---|---|---|
| Moral | Razones sobre lo correcto y lo debido | Confundir toda convicción personal con obligación jurídica |
| Trato social | Reglas de cortesía y expectativas del grupo | Suponer que una costumbre sea siempre justa |
| Religiosa | Compromisos de una tradición o comunidad de fe | Suponer que obligan por igual a toda persona |
| Jurídica | Reconocimiento en el ordenamiento y consecuencias previstas | Equiparar cualquier incumplimiento con un delito |

La comparación distingue funciones. Una misma conducta puede ser relevante para más de un tipo de norma.
''',
2:'''\n\n### No confundir las categorías

| Categoría | Pregunta orientativa | Precisión |
|---|---|---|
| Persona | ¿A quién se reconoce dignidad y derechos? | No se limita al grupo que puede votar |
| Nacionalidad | ¿Cuál es el vínculo jurídico con un Estado? | No equivale a residencia o afinidad cultural |
| Ciudadanía | ¿Qué condición política regula el artículo 30? | Distinguir condición de peruano y mayoría de edad |
| Ejercicio | ¿Qué requisitos se exigen para ejercer derechos políticos? | La inscripción electoral pertenece a este plano |

**Importante:** el mapa no determina la situación electoral individual de alguien. Identificación, inscripción y habilitación son cuestiones que no deben confundirse al estudiar las normas.
''',
3:'''\n\n### Comparar sin identificar conceptos distintos

| Concepto | Referencia principal | Confusión que debe evitarse |
|---|---|---|
| Estado | Organización política, jurídica e institucional | Reducirlo al gobernante actual |
| Gobierno | Autoridades y dirección política | Confundir un cambio de autoridades con desaparición del Estado |
| Nación | Comunidad histórica y cultural | Exigir una única lengua o costumbre para toda su población |
| Nacionalidad | Vínculo jurídico de una persona con un Estado | Tratar sus criterios de adquisición como elementos del Estado |

Estos conceptos pueden relacionarse sin ser equivalentes. Identificar primero qué pregunta plantea el ejercicio.
'''}

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  for part in [1,2]:
   rel=f'civica/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
   blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if '│' in m[0]]
   assert len(blocks)==1,rel
   block=blocks[0];new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]
   if part==1:new+=TABLES[week]
   backup=ROOT/'build/academic-backup-civics-maps-01-03'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   evidence.append(dict(level=f'{week}.{part}',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
   for i,label in enumerate([title]+[v for name,leaves in branches for v in [name]+leaves]):
    preview.append(dict(id=f'civica_{week}.{part}_{i}',subject='civica',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   if part==1:preview.append(dict(id=f'civica_{week}.{part}_table',subject='civica',concept=f'{week}.{part}',statement=TABLES[week],options=[],explanation=''))
 (ROOT/'build/civics-maps-01-03-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/civics-maps-01-03-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence),tables=len(TABLES))))

if __name__=='__main__':build()
