"""Historia en tablas; mapas explícitos de pensamiento latinoamericano y contemporáneo."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

HISTORY='''| Recorrido orientativo | Problemas y autores | Precaución histórica |
|---|---|---|
| Antigüedad griega y helenística | Presocráticos; Sócrates y sofistas; Platón y Aristóteles; estoicos, epicúreos y cínicos | Son propuestas diferentes, no una doctrina única ni una sucesión sin solapamientos |
| Antigüedad tardía y tradiciones medievales | Agustín, escolástica, Tomás de Aquino y Ockham; intercambios entre tradiciones latinas, griegas, árabes y judías | Los límites cronológicos son convencionales; no se reduce todo el período a una sola tradición |
| Modernidad temprana, siglos XVII–XVIII como referencia | Descartes y Spinoza; Locke y Hume; Kant | Las clasificaciones racionalismo, empirismo y criticismo necesitan matices por autor |
| Idealismo alemán y siglo XIX | Hegel, 1770–1831; Comte, Marx y Nietzsche en debates distintos | La actividad de Hegel se extiende al siglo XIX; no encerrarlo en un período terminado en el XVIII |
| Siglos XX–XXI | Husserl; Heidegger y Sartre; Lyotard, Foucault y Bauman, entre otros | Fenomenología, existencialismo y diagnósticos de la modernidad no son sinónimos |

**Importante:** esta tabla organiza el recorrido seleccionado en la lección. No es una historia mundial exhaustiva ni supone que una tradición desaparezca cuando surge otra.
'''

MAPS={
7:('Filosofía en Perú y América Latina',[
 ('Autenticidad y dependencia',[
  'Salazar Bondy: relacionar la pregunta por autenticidad con las condiciones de dependencia y dominación.',
  'Leopoldo Zea: atender a la historicidad y a la apropiación de ideas desde circunstancias latinoamericanas.',
  'Filosofía de la liberación: proyectos diversos; no reducirlos a una sola respuesta ni confundirlos con cualquier uso del término liberación.']),
 ('Contextos coloniales e ilustrados',[
  'El debate de Valladolid forma parte del contexto transatlántico sobre conquista y dominación; no tuvo lugar en Perú.',
  'La escolástica colonial incluye debates y prácticas intelectuales que deben situarse históricamente.',
  'Mercurio Peruano, Rodríguez de Mendoza e Hipólito Unanue: reconocer proyectos ilustrados y diferencias entre sus actividades.']),
 ('Debates peruanos del siglo XIX',[
  'Laso, Gálvez y Herrera intervienen en controversias sobre representación, soberanía y educación.',
  'Liberal y conservador son clasificaciones que requieren precisar el problema y el momento.',
  'González Prada y Manuel Vicente Villarán: no tratar sus posiciones como idénticas por relacionarlas con el positivismo.']),
 ('Diversidad del siglo XX',[
  'Alejandro Deustua: reconocer la orientación espiritualista y su contexto.',
  'Mariátegui y Haya de la Torre: distinguir sus proyectos y sus desacuerdos, no una doctrina conjunta.',
  'Francisco Miró Quesada: trabajo filosófico sobre lógica, razón y humanismo.'])]),
8:('Problemas contemporáneos y autores',[
 ('Ética e interpretación',[
  'Levinas: la alteridad y la responsabilidad ante el otro ocupan un lugar central en su propuesta ética.',
  'Gadamer: comprender implica tradición, interpretación y relación de horizontes.',
  'Son proyectos distintos; la hermenéutica de Gadamer no es una subdivisión de la ética de Levinas.']),
 ('Poder y subjetivación',[
  'Foucault: examinar relaciones de poder, saber e instituciones.',
  'Disciplina, dispositivo y biopolítica requieren situarse en problemas y obras concretos.',
  'El panóptico funciona como modelo de una tecnología de poder; no como descripción literal de toda institución.']),
 ('Diagnósticos de la modernidad',[
  'Lyotard: discutir la legitimación del saber y los grandes relatos.',
  'Bauman: modernidad líquida como diagnóstico de transformaciones de vínculos e instituciones.',
  'La etiqueta posmodernidad no implica que todos estos autores formen una escuela homogénea.']),
 ('Contrastes y debates',[
  'Byung-Chul Han: examinar sus argumentos sobre rendimiento, autoexplotación y transparencia.',
  'Habermas: acción comunicativa, racionalidad y crítica social; no presentarlo como defensor de cualquier posición posmoderna.',
  'Comparar el problema, los conceptos y las razones de cada propuesta antes de afirmar acuerdos o incompatibilidades.'])])}

TABLES={
7:'''\n\n### Comparar sin convertir el debate en dos eslóganes

| Cuestión | Salazar Bondy | Leopoldo Zea |
|---|---|---|
| Contexto | Dependencia y dominación afectan el filosofar | La circunstancia histórica forma parte del filosofar |
| Autenticidad | Examinar sus condiciones sociales y culturales | Examinar apropiación y respuesta a problemas propios |
| Precaución | No resumir su propuesta como incapacidad natural de los pueblos | No resumirla como aceptación indiscriminada de cualquier imitación |

La tabla orienta una comparación; las tesis deben leerse mediante sus argumentos y no como juicios sobre superioridad de personas o culturas.
''',
8:'''\n\n### Distinguir el concepto y la pregunta

| Autor | Concepto de orientación | Pregunta de lectura |
|---|---|---|
| Levinas | Responsabilidad ante el otro | ¿Cómo se fundamenta la exigencia ética? |
| Gadamer | Horizontes e interpretación | ¿Qué papel tiene la tradición al comprender? |
| Foucault | Relaciones de poder y saber | ¿Cómo intervienen prácticas e instituciones? |
| Lyotard | Legitimación del saber | ¿Qué se cuestiona en los grandes relatos? |
| Habermas | Acción comunicativa | ¿Qué condiciones tiene el entendimiento entre participantes? |

Estas preguntas ayudan a estudiar; no sustituyen las obras ni convierten cada concepto en una explicación completa de su autor.
'''}

def build():
 evidence=[];preview=[]
 for week in [6,7,8]:
  for part in [1,2]:
   rel=f'filosofia/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
   blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if any(c in m[0] for c in ['│','┌'])]
   assert len(blocks)==1,rel
   block=blocks[0];replacement=HISTORY if week==6 else make_map(*MAPS[week])
   new=raw[:block.start()]+replacement+raw[block.end():]
   if week!=6 and part==1:new+=TABLES[week]
   backup=ROOT/'build/academic-backup-philosophy-maps-06-08'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   nodes=0 if week==6 else 1+sum(1+len(x) for _,x in MAPS[week][1])
   evidence.append(dict(level=f'{week}.{part}',maps=int(week!=6),nodes=nodes,tables=int(week==6 or part==1),questionsHash=digest))
   labels=[HISTORY] if week==6 else [MAPS[week][0]]+[x for name,leaves in MAPS[week][1] for x in [name]+leaves]
   if week!=6 and part==1:labels+=[TABLES[week]]
   for i,label in enumerate(labels):preview.append(dict(id=f'philosophy_{week}.{part}_{i}',subject='filosofia',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
 (ROOT/'build/philosophy-maps-06-08-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/philosophy-maps-06-08-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=sum(x['maps'] for x in evidence),nodes=sum(x['nodes'] for x in evidence),tables=sum(x['tables'] for x in evidence))))

if __name__=='__main__':build()
