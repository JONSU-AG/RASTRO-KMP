"""Ocho esquemas de Filosofía y cuatro tablas; sin cambiar temario ni preguntas."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
2:('Campos de investigación filosófica',[
 ('Ser y realidad',[
  'Metafísica y ontología: examinar qué existe y cómo se estructura lo real.',
  'Preguntar por sustancia, identidad, cambio y relaciones; las respuestas dependen de cada propuesta.']),
 ('Conocimiento y ciencia',[
  'Gnoseología o teoría del conocimiento: posibilidad, fuentes, alcance y justificación del conocer.',
  'Epistemología tiene usos distintos entre tradiciones; puede abarcar teoría del conocimiento o centrarse en el conocimiento científico.',
  'La filosofía de la ciencia examina métodos, explicaciones, evidencia y cambio científico.']),
 ('Acción y vida común',[
  'Ética: examinar razones sobre lo correcto, lo bueno y la responsabilidad.',
  'Filosofía política: justicia, legitimidad, poder y organización de la vida colectiva.']),
 ('Valor y experiencia estética',[
  'Axiología: investigar qué se valora, cómo y con qué fundamentos.',
  'Estética: estudiar experiencia, juicio y arte; no se reduce a definir lo bello.']),
 ('Persona y existencia',[
  'Antropología filosófica: interpretaciones sobre la condición humana.',
  'Preguntas por sentido, libertad, corporalidad y cultura pueden cruzar varias disciplinas.'])]),
3:('Problemas filosóficos y distinciones',[
 ('Ser y realidad',[
  'Monismo, dualismo y pluralismo: distinguir propuestas sobre principios o tipos de realidad.',
  'Materialismo e idealismo son familias de posiciones; no forman una lista idéntica a monismo y pluralismo.',
  'Trascendencia e inmanencia requieren precisar respecto de qué se afirma la relación.']),
 ('Conocimiento',[
  'Preguntar por posibilidad, fuentes y alcance; distinguir las preguntas de las respuestas de cada autor.',
  'Racionalismo y empirismo destacan diferentes papeles de razón y experiencia; no describen una oposición absoluta entre pensar y observar.',
  'Realismo, idealismo y fenomenalismo tienen formulaciones diversas; identificar el sentido usado.']),
 ('Verdad y justificación',[
  'Correspondencia, coherencia y enfoques pragmatistas responden de maneras distintas al problema de la verdad.',
  'Distinguir una teoría de la verdad de un criterio para reconocerla o justificar una creencia.',
  'Un acuerdo o consenso no convierte automáticamente cualquier afirmación en verdadera.']),
 ('Valor',[
  'Subjetivismo y objetivismo discuten la dependencia del valor respecto del sujeto.',
  'Hedonismo y utilitarismo no son por definición subtipos obligatorios de subjetivismo axiológico.',
  'Separar qué se considera valioso de cómo se entiende la existencia de los valores.']),
 ('Libertad',[
  'Determinismo e indeterminismo no equivalen sin más a ausencia o presencia de libertad.',
  'El azar por sí solo no demuestra control sobre las propias acciones.',
  'Compatibilismo e incompatibilismo difieren sobre la posibilidad de libertad bajo determinismo.'])]),
4:('Lógica, argumentos y paradojas',[
 ('Lenguaje y lógica clásica',[
  r'Identidad proposicional: $p\to p$; distinguirla de igualdad entre objetos.',
  r'No contradicción: $\neg(p\land\neg p)$.',
  r'Tercero excluido: $p\lor\neg p$.',
  'La razón suficiente es un principio filosófico discutido, no una tautología obligatoria de la lógica clásica.']),
 ('Evaluar razonamientos',[
  'Deducción válida: no hay una interpretación con todas las premisas verdaderas y conclusión falsa.',
  'Deducir no se limita a ir de lo general a lo particular.',
  'Inducción: apoyo ampliativo que no garantiza la conclusión de la misma manera que una deducción válida.',
  'Distinguir verdad de enunciados, validez del argumento y verdad de sus premisas.']),
 ('Estructura y falacias',[
  'Localizar premisas y conclusión antes de aplicar reglas o etiquetas.',
  'Ataque personal, amenaza, popularidad o autoridad pueden resultar irrelevantes para la conclusión; comprobar el contexto.',
  'Equívoco y otras ambigüedades requieren mostrar cómo cambia el sentido relevante.',
  'Detectar un argumento defectuoso no prueba automáticamente la falsedad de su conclusión.']),
 ('Paradojas',[
  'El mentiroso explora problemas de autorreferencia y verdad; no identificarlo sin matices con cualquier frase de Epiménides.',
  'Aquiles y la tortuga plantea dificultades filosóficas sobre movimiento y división.',
  'Russell muestra un problema de la comprensión irrestricta de conjuntos; no invalida cualquier teoría de conjuntos.'])]),
5:('Ciencia: métodos, evidencia y debate',[
 ('Conocimiento científico',[
  'La investigación puede ser sistemática, pública y revisable; sus procedimientos varían según el campo.',
  'Falible no significa arbitrario: las conclusiones se contrastan y se justifican con criterios pertinentes.',
  'Objetividad no exige que cada investigador carezca de toda perspectiva o supuesto.']),
 ('Métodos de investigación',[
  'Formular problemas, observar, modelar, razonar y contrastar son actividades que pueden combinarse.',
  'No existe una secuencia rígida de pasos que describa por igual toda investigación.',
  'No toda contrastación requiere un experimento de laboratorio; hay observación, simulación y otras estrategias.']),
 ('Productos y funciones',[
  'Hipótesis: propuesta que se examina; especificar qué afirma y qué evidencias la afectarían.',
  'Leyes y modelos expresan relaciones bajo condiciones; las teorías articulan explicaciones y compromisos más amplios.',
  'Una teoría no se transforma automáticamente en ley por acumular confirmaciones.']),
 ('Debates sobre la ciencia',[
  'Neopositivismo: distintos programas sobre significado, confirmación y análisis del lenguaje científico.',
  'Popper: falsabilidad y crítica; evaluar resultados también exige revisar supuestos auxiliares.',
  'Kuhn: ciencia normal, paradigmas y cambios históricos; no reducir su propuesta a que cualquier opinión vale lo mismo.',
  'Bunge: discusión de conocimiento científico y pseudociencia; identificar criterios y argumentos en vez de usar solo una etiqueta.'])])}

TABLES={
2:'''\n\n### Empezar por la pregunta

| Pregunta de ejemplo | Campo pertinente | Alcance |
|---|---|---|
| ¿Qué cuenta como conocimiento? | Teoría del conocimiento | Examinar condiciones y justificación |
| ¿Cuándo es legítima una decisión colectiva? | Filosofía política | No confundir poder de hecho con legitimidad |
| ¿Qué razones justifican una acción? | Ética | Distinguir describir una costumbre de evaluarla |
| ¿Cómo se fundamenta un juicio sobre una obra? | Estética | No reducir toda valoración a gusto privado |

Las fronteras entre campos no son compartimentos cerrados: una misma cuestión puede necesitar más de una perspectiva.
''',
3:'''\n\n### Tres preguntas distintas sobre la libertad

| Pregunta | Qué se está discutiendo | Qué no se deduce automáticamente |
|---|---|---|
| ¿Los acontecimientos están determinados? | Relación entre condiciones, leyes y acontecimientos | Que toda teoría de la libertad sea imposible |
| ¿Hay acontecimientos indeterminados? | Si algunos resultados no quedan fijados del mismo modo | Que el azar otorgue control personal |
| ¿Qué hace libre una acción? | Control, razones, alternativas y responsabilidad | Una respuesta única compartida por todas las corrientes |

> **Importante:** identificar una posición no obliga a aceptarla como un hecho. Comparar argumentos y supuestos sin convertir azar y libertad en sinónimos.
''',
4:r'''

### Comprobar una inferencia

| Premisas | Conclusión | Evaluación |
|---|---|---|
| $p\to q$, $p$ | $q$ | Modus ponens: válido en lógica clásica |
| $p\to q$, $q$ | $p$ | Afirmación del consecuente: inválida |

**Contraejemplo para la segunda fila:** con p falsa y q verdadera, ambas premisas son verdaderas y la conclusión es falsa. Es suficiente una interpretación así para refutar la validez. Una conclusión verdadera en otra situación no arregla esa forma de inferencia.
''',
5:'''\n\n### No tratar los conceptos como una escalera de certeza

| Concepto | Función orientativa | Precaución |
|---|---|---|
| Hipótesis | Proponer una respuesta examinable | Explicitar condiciones y evidencia relevante |
| Modelo | Representar aspectos de un sistema | Reconocer idealizaciones y límites |
| Ley | Expresar una relación bajo condiciones | No confundir ley científica con orden jurídica |
| Teoría | Articular explicaciones y supuestos | No significa una simple ocurrencia sin apoyo |

La terminología varía entre disciplinas. Acumular resultados favorables no convierte mecánicamente una hipótesis en teoría y después en ley.
'''}

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  for part in [1,2]:
   rel=f'filosofia/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
   blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if '│' in m[0]]
   assert len(blocks)==1,rel
   b=blocks[0];new=raw[:b.start()]+make_map(title,branches)+raw[b.end():]
   if part==1:new+=TABLES[week]
   backup=ROOT/'build/academic-backup-philosophy-maps-02-05'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   evidence.append(dict(level=f'{week}.{part}',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
   for i,label in enumerate([title]+[v for name,leaves in branches for v in [name]+leaves]):
    preview.append(dict(id=f'filosofia_{week}.{part}_{i}',subject='filosofia',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   if part==1:preview.append(dict(id=f'filosofia_{week}.{part}_table',subject='filosofia',concept=f'{week}.{part}',statement=TABLES[week],options=[],explanation=''))
 # Verificación independiente del contraejemplo publicado y del modus ponens.
 values=[(p,q) for p in [False,True] for q in [False,True]]
 assert all(not (((not p) or q) and p) or q for p,q in values)
 assert [x for x in values if ((not x[0]) or x[1]) and x[1] and not x[0]]==[(False,True)]
 (ROOT/'build/philosophy-maps-02-05-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/philosophy-maps-02-05-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence),tables=len(TABLES))))

if __name__=='__main__':build()
