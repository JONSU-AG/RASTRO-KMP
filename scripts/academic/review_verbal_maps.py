"""Mapas y procedimientos de Razonamiento Verbal; no modifica preguntas."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT
from clarify_verbal_passages import clarify

MAPS={
1:('Relaciones semánticas en contexto',[
 ('Semejanza y oposición',[
  'Sinonimia contextual: comprobar que la sustitución conserve el sentido y encaje en la oración.',
  'Antonimia: identificar la dimensión de contraste; una oposición gradual no equivale a exclusión absoluta.',
  'El registro y las connotaciones pueden impedir una sustitución aunque dos palabras sean próximas.']),
 ('Pluralidad de significados',[
  'Polisemia: distintos sentidos relacionados de una unidad léxica.',
  'Homonimia: coincidencia formal de unidades distintas; consultar el diccionario y la historia cuando sea necesario.',
  'Homófonos: coinciden en pronunciación; homógrafos: coinciden en escritura.']),
 ('Inclusión y precisión',[
  'Un hiperónimo expresa una categoría más amplia; un hipónimo designa una clase más específica.',
  'No confundir pertenencia a una categoría con ser una parte de un objeto.',
  'Hacer, tener y decir no son palabras prohibidas; sustituirlas cuando el contexto exija mayor precisión.'])]),
2:('Analogías: relación y dirección',[
 ('Formular el vínculo',[
  'Expresar la relación del par base en una oración breve antes de comparar opciones.',
  'Mantener el orden: parte a todo no equivale a todo a parte.',
  'Una asociación temática vaga no basta para demostrar analogía.']),
 ('Relaciones entre entidades',[
  'Parte y todo: relación estructural entre un componente y el objeto al que pertenece.',
  'Elemento y conjunto: pertenencia a una agrupación.',
  'Especie y género: inclusión semántica entre una clase específica y una más general.']),
 ('Función y proceso',[
  'Agente e instrumento; objeto y función; especialista y objeto de estudio.',
  'Materia prima y producto; causa y efecto; etapas de una secuencia.',
  'Grado e intensidad: la escala debe ser pertinente para ambos pares.']),
 ('Comparación consistente',[
  'En A : B :: C : D se contrasta habitualmente A-B con C-D.',
  'Si la consigna propone comparar columnas, formular también el vínculo A-C y B-D; no intercambiar criterios a mitad de la solución.',
  'Comprobar significado, dirección y grado de especificidad; reconocer si faltan datos para una respuesta única.'])]),
3:('Series y clasificación verbal',[
 ('Series con regla explícita',[
  'Continuas: aplicar la misma relación a los términos pertinentes.',
  'Alternadas o por parejas: separar las posiciones antes de buscar la regla.',
  'Pertenecer a un mismo campo no impone por sí solo un orden ni una continuación única.']),
 ('Término excluido',[
  'Precisar el rasgo común que comparten los términos admitidos.',
  'Distinguir pertenencia semántica, relación funcional y categoría gramatical.',
  'La exclusión debe apoyarse en el criterio de la consigna y no en una diferencia accidental.']),
 ('Verificar la clasificación',[
  'Leer todas las opciones bajo el mismo criterio.',
  'Comprobar intensidad y connotación solo cuando sean pertinentes.',
  'Si dos criterios razonables dan respuestas distintas, el ejercicio necesita contexto adicional.'])]),
4:('Conectores, completamiento y orden',[
 ('Relaciones entre enunciados',[
  'Causa y consecuencia: distinguir la razón del resultado.',
  'Contraste y concesión: no son intercambiables sin comprobar la construcción.',
  'Conectores y puntuación deben conservar la relación realmente expresada por el texto.']),
 ('Oraciones incompletas',[
  'Leer el conjunto y reconocer las pistas que restringen el sentido.',
  'Comprobar concordancia y construcción sintáctica, además del vocabulario.',
  'Una palabra difícil no mejora una respuesta incoherente con el contexto.']),
 ('Plan de redacción',[
  'El orden puede ser cronológico, de lo general a lo particular o de problema a solución, según el texto.',
  'Resolver referencias: identificar a qué remiten pronombres, demostrativos y expresiones anafóricas.',
  'No imponer un único esquema de ordenación a cualquier grupo de enunciados.'])]),
5:('Tesis, razones y evaluación',[
 ('Identificar la postura',[
  'Tesis o conclusión: afirmación que el discurso pretende sostener.',
  'Puede estar explícita o reconstruirse a partir de indicios suficientes.',
  'No confundir la postura del autor con una opinión citada para discutirla.']),
 ('Reconstruir el apoyo',[
  'Distinguir premisas, ejemplos y datos; no todo apoyo es un dato empírico.',
  'Identificar el supuesto o regla que conecta las razones con la conclusión.',
  'Un ejemplo aislado no prueba automáticamente una afirmación universal.']),
 ('Debilitar y reforzar',[
  'Una objeción puede cuestionar una premisa, la conexión inferencial o el alcance de la conclusión.',
  'Reforzar exige aportar apoyo pertinente; repetir la tesis no la demuestra.',
  'Debilitar el argumento no demuestra necesariamente que su conclusión sea falsa.']),
 ('Leer el grado de certeza',[
  'Distinguir conclusión necesaria, probable y posible.',
  'Una asociación o secuencia temporal no establece por sí sola causalidad.',
  'Evaluar lo que el texto sostiene, sin atribuirle afirmaciones más fuertes.'])]),
6:('Pragmática y sentido contextual',[
 ('Actos de habla',[
  'Locutivo: el enunciado producido y su significado.',
  'Ilocutivo: la acción comunicativa realizada, como pedir, afirmar o prometer.',
  'Perlocutivo: el efecto provocado en el interlocutor; puede diferir de la intención.']),
 ('Información implícita',[
  'Presuposición: información tratada como trasfondo; puede cuestionarse, no es un hecho innegociable.',
  'Implicatura conversacional: inferencia contextual que puede cancelarse mediante información adicional.',
  'No confundir una inferencia contextual con una consecuencia lógica necesaria.']),
 ('Interpretación figurada',[
  'Metáfora: interpretar la relación contextual, sin imponer una lectura literal.',
  'Ironía: valorar tono, situación y discrepancia relevante; no equivale siempre a decir cualquier opuesto.',
  'Sentido literal y figurado no son sinónimos exactos de denotación y connotación.'])]),
7:('Claridad, ambigüedad y precisión',[
 ('Revisar el sentido',[
  'Contradicción: incompatibilidad bajo la misma interpretación y condiciones.',
  'Ambigüedad: dos o más interpretaciones posibles; no es siempre una contradicción.',
  'Una expresión figurada puede ser deliberada; comprobar el género y la intención antes de corregirla.']),
 ('Repetición y función',[
  'La redundancia puede ser innecesaria o cumplir una función enfática y aclaratoria.',
  'No eliminar automáticamente una repetición si se pierde información, referencia o intención.',
  'Preferir concisión cuando la repetición no aporta nada al propósito del texto.']),
 ('Elegir vocabulario',[
  'Reemplazar términos vagos cuando sea posible precisar sin cambiar el significado.',
  'Conservar hacer, tener o cosa cuando sean adecuados y claros en su contexto.',
  'Una revisión debe preservar la voz y el registro del autor.'])]),
8:('Resolver situaciones comunicativas',[
 ('Reconstruir el escenario',[
  'Identificar participantes, propósito, canal y circunstancias.',
  'Distinguir lo que el texto dice de lo que el lector supone.',
  'Evaluar el registro según la situación; coloquial no significa incorrecto en cualquier contexto.']),
 ('Relacionar indicios',[
  'Explicitar las relaciones léxicas de cada par sin cambiar de criterio.',
  'Separar hechos, hipótesis y consecuencias necesarias.',
  'En problemas con varias condiciones, comprobar la respuesta contra todas ellas.']),
 ('Comparar respuestas',[
  'Valorar pertinencia y coherencia con el objetivo, no solo elegancia o longitud.',
  'La cortesía puede ser relevante, pero una respuesta cortés que no resuelve el problema no basta.',
  'Si el contexto no permite una única interpretación, reconocer la ambigüedad.'])])}

PROCEDURES={
2:('Ruta para comprobar una analogía',[
 'Leer el significado del par base en su contexto.',
 'Escribir una relación breve y mantener su dirección.',
 'Aplicar exactamente esa relación a cada alternativa.',
 'Comprobar especificidad y descartar criterios añadidos solo para salvar una opción.']),
3:('Ruta para clasificar y excluir',[
 'Precisar los sentidos de los términos y la consigna.',
 'Formular el rasgo común de la clasificación.',
 'Evaluar todas las opciones con el mismo criterio.',
 'Comprobar si otra clasificación también es razonable; pedir contexto si la respuesta no es única.']),
4:('Ruta para completar una oración',[
 'Leer toda la oración para reconstruir el contexto.',
 'Identificar conectores, referencias y restricciones gramaticales.',
 'Proponer una expresión y comprobarla dentro del enunciado completo.',
 'Revisar sintaxis, sentido y precisión; no elegir solo por una palabra aislada.']),
5:('Comprobar el paso de las razones a la tesis',[
 'Localizar los datos, premisas o ejemplos realmente aportados.',
 'Reconstruir la regla o supuesto que los conecta con la tesis.',
 'Comprobar si ese apoyo justifica el alcance de la conclusión.',
 'Evaluar una objeción pertinente sin asumir de antemano que la tesis es verdadera o falsa.']),
8:('Ruta para una situación comunicativa',[
 'Reconstruir participantes, circunstancias y objetivo.',
 'Localizar el conflicto, la duda o la información necesaria.',
 'Comparar opciones por pertinencia, registro y coherencia con el objetivo.',
 'Verificar la respuesta con todos los indicios y reconocer lo que no puede inferirse.'])}

TABLES={
1:'''\n\n### Diferenciar relaciones antes de elegir\n\n| Relación | Ejemplo | Qué comprobar |\n|---|---|---|\n| Sinonimia contextual | Iniciar y comenzar una tarea | Si la sustitución encaja en la oración |\n| Oposición gradual | Frío y caliente | La dimensión y los grados intermedios |\n| Inclusión | Rosa y flor | Una rosa es una flor; no toda flor es una rosa |\n| Parte y todo | Página y libro | La página es parte del objeto, no una especie de libro |\n\n> **Importante:** hacer y tener son verbos correctos. La precisión consiste en elegir la palabra adecuada al propósito, no en prohibir verbos frecuentes.\n''',
2:'''\n\n### Escribir la relación completa\n\n| Par | Relación explícita | Orden |\n|---|---|---|\n| Página : libro | La página forma parte del libro | Parte a todo |\n| Rueda : bicicleta | La rueda forma parte de la bicicleta | Parte a todo |\n| Libro : página | El libro contiene páginas | Todo a parte |\n\nLos dos primeros pares pueden compararse por la relación indicada. El tercero invierte la dirección: compartir vocabulario no conserva el nexo.\n''',
6:'''\n\n### Separar enunciado, intención y efecto\n\nEn una sala fría, alguien dice: «¿Podrías cerrar la puerta?».\n\n| Dimensión | Lectura en este contexto |\n|---|---|\n| Enunciado | Una pregunta sobre la posibilidad de cerrar la puerta |\n| Acción comunicativa | Una petición indirecta |\n| Efecto | El destinatario puede cerrar la puerta, negarse o no responder |\n\nLa intención de pedir no garantiza el efecto. La interpretación necesita contexto: una pregunta semejante también podría ser una consulta real sobre una capacidad.\n''',
7:'''\n\n### Revisar sin cambiar lo que se quiere decir\n\n| Caso | Problema o función | Cómo comprobarlo |\n|---|---|---|\n| Vi a Elena con los prismáticos | Dos lecturas sobre quién tenía el instrumento | Precisar la relación si el contexto no la aclara |\n| Lo vi con mis propios ojos | Puede enfatizar el testimonio directo | Valorar propósito y registro antes de recortar |\n| Hizo una propuesta | Construcción adecuada | No cambiarla solo porque contiene hacer |\n| Puso el informe en la mesa | Acción clara en el contexto | Sustituir solo si se necesita mayor precisión |\n'''}

def procedure_map(title,steps):
 nodes=[('PROOT',title)]+[(f'P{i}',step) for i,step in enumerate(steps,1)]
 edges=[('PROOT','P1')]+[(f'P{i}',f'P{i+1}') for i in range(1,len(steps))]
 return '```mermaid\ngraph TD\n'+'\n'.join(f' {k}["{v}"]' for k,v in nodes)+'\n'+'\n'.join(f' {a} --> {b}' for a,b in edges)+'\n```'

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  for part in [1,2]:
   rel=f'raz_verbal/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json')
   digest=hashlib.sha256(q.read_bytes()).hexdigest()
   backup=ROOT/'build/academic-backup-verbal-maps'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   main=0;procedures=0;duplicates=0;procedure_source=None
   def replace(m):
    nonlocal main,procedures,duplicates,procedure_source
    source=m[0]
    if not any(t in source for t in ['│','├','───']):return source
    if any(t in source for t in ['[PASO','[FASE','[1. RELACIÓN]','[TESIS DEL AUTOR]']):
     assert week in PROCEDURES
     if procedures:
      assert source==procedure_source,(rel,'Procedimientos distintos: no deduplicar')
      duplicates+=1
      return '**Procedimiento:** consulta el mapa «'+PROCEDURES[week][0]+'», presentado en esta lección.'
     procedures+=1
     procedure_source=source
     return procedure_map(*PROCEDURES[week])
    main+=1;return make_map(title,branches)
   new=re.sub(r'```[^\n]*\n.*?```',replace,raw,flags=re.S)
   assert main==1,(rel,main)
   assert procedures==(1 if week in PROCEDURES else 0),(rel,procedures)
   if part==1:new+=TABLES.get(week,'')
   new=clarify(new,week)
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   count=1+sum(1+len(leaves) for _,leaves in branches)+(1+len(PROCEDURES[week][1]) if procedures else 0)
   evidence.append(dict(level=f'{week}.{part}',nodes=count,maps=main+procedures,duplicatesRemoved=duplicates,questionsHash=digest))
   for i,label in enumerate([title]+[v for name,leaves in branches for v in [name]+leaves]+([PROCEDURES[week][0]]+PROCEDURES[week][1] if procedures else [])):
    preview.append(dict(id=f'raz_verbal_{week}.{part}_{i}',subject='raz_verbal',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   if part==1 and week in TABLES:preview.append(dict(id=f'raz_verbal_{week}.{part}_table',subject='raz_verbal',concept=f'{week}.{part}',statement=TABLES[week],options=[],explanation=''))
 (ROOT/'build/verbal-maps-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/verbal-maps-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(levels=len(evidence),maps=sum(x['maps'] for x in evidence),nodes=sum(x['nodes'] for x in evidence),duplicates=sum(x['duplicatesRemoved'] for x in evidence),tables=len(TABLES))))

if __name__=='__main__':build()
