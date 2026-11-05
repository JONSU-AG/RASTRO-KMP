"""Mapas y tablas de lectura; conserva los 16 bancos de práctica ya revisados."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
1:('Leer información explícita',[
 ('Localizar datos',[
  'Identificar quién realiza cada acción y a qué momento se refiere.',
  'Conservar cifras, fechas, condiciones y referencias que delimitan una afirmación.',
  'Distinguir las palabras del narrador de las de un personaje o una fuente citada.']),
 ('Parafrasear con fidelidad',[
  'Reformular sin añadir causas, intenciones o consecuencias no expresadas.',
  'Comprobar que un cambio de voz verbal conserve participantes y relaciones.',
  'La sustitución por un sinónimo depende del contexto, no solo del diccionario.']),
 ('Verificar el alcance',[
  'Mantener negaciones y cuantificadores: algunos no equivale a todos.',
  'Una posibilidad no se convierte en certeza al resumirla.',
  'La información explícita también puede estar repartida en varias oraciones.'])]),
2:('Inferir con apoyo textual',[
 ('Tipo de conclusión',[
  'Deducción: si las premisas y la inferencia son válidas, la conclusión es necesaria.',
  'Inducción o hipótesis explicativa: apoyo probable que puede revisarse con nuevos datos.']),
 ('Alcance de los indicios',[
  'Local: conectar pistas de un pasaje.',
  'Global: integrar información relevante del conjunto; no equivale automáticamente a deducir.']),
 ('Relación temporal',[
  'Prospectiva: proponer una continuación plausible con los indicios disponibles.',
  'Retrospectiva: reconstruir antecedentes; no convierte cualquier explicación posible en un hecho.']),
 ('Control de la inferencia',[
  'Distinguir lo necesario de lo probable y de lo meramente posible.',
  'Revisar alternativas y no rellenar vacíos con creencias personales.'])]),
3:('Tema, idea central y organización',[
 ('Preguntas diferentes',[
  'Tema: de qué trata el texto.',
  'Idea principal: qué sostiene o comunica centralmente sobre ese tema.',
  'Título: presenta o sugiere un enfoque; no está prohibido que contenga un verbo conjugado.']),
 ('Jerarquizar ideas',[
  'Distinguir tesis, explicaciones, ejemplos y detalles según su función real.',
  'La idea central puede estar formulada o necesitar una síntesis del lector.',
  'Una afirmación verdadera del fragmento puede ser secundaria.']),
 ('Reconocer la estructura',[
  'Comprobar dónde se desarrolla la idea central: inicio, cierre, ambos o zona intermedia.',
  'Un desarrollo paralelo puede requerir integrar varias ideas del mismo rango.',
  'La posición de una oración no demuestra por sí sola que una inferencia sea deductiva o inductiva.'])]),
4:('Propósito y tono textual',[
 ('Propósito comunicativo',[
  'Informar, explicar, persuadir, narrar u orientar pueden combinarse en un texto.',
  'Identificar el propósito dominante mediante contenido, organización y destinatario.',
  'Distinguir la acción comunicativa del tema tratado.']),
 ('Tono',[
  'Inferir la actitud expresada a partir de valoraciones, elecciones léxicas y contexto.',
  'Crítico no significa necesariamente neutral; un texto puede razonar y valorar a la vez.',
  'El tono textual no demuestra por sí solo el estado emocional real del autor.']),
 ('Pruebas y matices',[
  'No decidir por una palabra aislada ni por la forma interrogativa o exclamativa solamente.',
  'Ironía y sarcasmo pueden relacionarse, pero no son etiquetas idénticas para toda burla.',
  'Justificar la interpretación con indicios y reconocer lecturas alternativas cuando proceda.'])]),
5:('Información, respaldo y contradicción',[
 ('Naturaleza del enunciado',[
  'Distinguir afirmación verificable, valoración y combinación de ambas.',
  'Que una frase sea verificable no garantiza que sea verdadera.',
  'Una opinión también puede apoyarse en razones y datos.']),
 ('Relación con el fragmento',[
  'Respaldado: se afirma o se sigue de las premisas bajo la interpretación pertinente.',
  'Contradicho: entra en conflicto con lo que el texto sostiene.',
  'No determinado: el fragmento no basta para afirmarlo ni negarlo; ausencia de información no significa falsedad.']),
 ('Leer la consigna',[
  'Distinguir pide una contradicción de pide lo que no puede inferirse.',
  'Compatible en sentido lógico no equivale necesariamente a demostrado por el texto.',
  'Conservar restricciones, grados de certeza y cuantificadores al comparar alternativas.'])]),
6:('Interpretar palabras en contexto',[
 ('Seleccionar el sentido',[
  'Leer la oración y el pasaje antes de elegir una acepción.',
  'Comprobar el registro y los indicios temáticos; la primera entrada de diccionario no resuelve todos los casos.',
  'Si el pasaje admite dos sentidos, reconocer la ambigüedad.']),
 ('Literalidad y asociaciones',[
  'Denotación y connotación no equivalen exactamente a literal y figurado.',
  'Metáfora: interpretar la relación pertinente al contexto.',
  'Metonimia y sinécdoque: distinguir relaciones de contigüidad y parte-todo según el uso.']),
 ('Sustitución contextual',[
  'Elegir una expresión que encaje en la construcción y conserve el sentido relevante.',
  'Revisar los matices y las connotaciones; no prometer equivalencia matemática absoluta.',
  'No añadir una explicación técnica que el fragmento no permite sostener.'])]),
7:('Coherencia, cohesión y revisión',[
 ('Sentido global',[
  'Coherencia: interpretar las relaciones y la organización que dan unidad al texto.',
  'La unidad temática admite cambios de aspecto si están relacionados con el propósito.',
  'Distinguir contradicciones de voces citadas, hipótesis o cambios de perspectiva.']),
 ('Vínculos textuales',[
  'Cohesión: referencias, repeticiones léxicas, elipsis y conectores, también entre párrafos.',
  'Resolver el antecedente de pronombres y expresiones antes de eliminar una oración.',
  'La presencia de un conector no garantiza por sí sola una relación coherente.']),
 ('Supresión con criterio',[
  'Revisar pertinencia y enfoque; un detalle relacionado puede cumplir una función necesaria.',
  'Distinguir repetición inútil de reiteración explicativa, enfática o referencial.',
  'Releer el texto resultante y comprobar que no pierda información ni conexiones necesarias.'])]),
8:('Finalidad y formato de los textos',[
 ('Secuencias y propósito',[
  'Narración, descripción, exposición, explicación, argumentación e instrucción pueden combinarse.',
  'Identificar la función dominante sin suponer que cada texto pertenece a una categoría pura.',
  'Narrativo y literario no son sinónimos: también se narran hechos en textos no literarios.']),
 ('Organización de la información',[
  'Continuo: oraciones organizadas principalmente en párrafos.',
  'Discontinuo: tablas, gráficos, formularios u otras disposiciones que exigen reconocer su organización.',
  'Mixto: integra prosa y componentes discontinuos; leer las relaciones entre ambos.']),
 ('Estrategia de lectura',[
  'En prosa, seguir referencias, desarrollo y propósito.',
  'En gráficos y tablas, revisar títulos, ejes, unidades y notas antes de interpretar.',
  'Contrastar información de distintos componentes sin inventar datos ausentes.'])])}

STRUCTURE='''| Organización habitual | Dónde buscar la idea central | Precaución |
|---|---|---|
| Analizante | Se presenta al inicio y se desarrolla después | La posición inicial no garantiza importancia |
| Sintetizante | Se construye hacia una conclusión final | Comprobar que el cierre integra el desarrollo |
| Encuadrada | Apertura y cierre retoman el núcleo central | No exigir una repetición literal |
| Paralela | Varias ideas se desarrollan con rango semejante | Formular una síntesis que las abarque |
| Centrada | La idea central aparece en una zona intermedia | Reconocer su función, no contar oraciones |'''

SECONDARY={
4:('Indicios para describir el tono',[
 ('Interpretaciones que requieren contexto',[
  'Crítico: examina, cuestiona o valora con razones; no siempre es neutral.',
  'Cauto o escéptico: expresa reserva o solicita apoyo para una afirmación.',
  'Irónico: la interpretación contextual puede contrastar con lo literalmente dicho.',
  'Solemne: expresión formal y grave, sin que eso demuestre veracidad.',
  'Laudatorio: elogia; el grado de exageración debe comprobarse.',
  'Elegíaco o nostálgico: puede expresar pérdida o evocación del pasado.',
  'Confrontativo: se opone de manera marcada; no basta para decidir si su argumento es válido.',
  'Asertivo: afirma con claridad; firmeza no equivale por sí sola a objetividad.'])]),
5:('Comprobar una afirmación',[
 ('Respaldada', ['Localizar la frase o el razonamiento que la sostiene.']),
 ('Contradicha', ['Mostrar qué afirmación o condición del texto entra en conflicto con ella.']),
 ('No determinada', ['Indicar qué dato falta; no presentarla como falsa solo por no estar mencionada.'])]),
7:('Revisar antes de suprimir',[
 ('Pertinencia', ['Comprobar relación con el tema y función del detalle.']),
 ('Redundancia', ['Comprobar si repite sin añadir explicación, énfasis o referencia necesaria.']),
 ('Resultado', ['Releer sin la oración y verificar que no se rompa la información ni la cohesión.'])])}

TABLES={
1:'''\n\n### Conservar el alcance al parafrasear

| Texto de partida | Reformulación | Evaluación |
|---|---|---|
| Algunos talleres abren los sábados | Hay talleres que abren los sábados | Conserva el alcance básico |
| Algunos talleres abren los sábados | Todos los talleres abren los sábados | Añade una generalización |
| La visita puede aplazarse | La visita se aplazará | Convierte posibilidad en certeza |
''',
2:'''\n\n### Distinguir indicio de certeza

Lucía dejó un paraguas abierto en la entrada y el suelo estaba mojado.

| Lectura | Apoyo disponible |
|---|---|
| Había un paraguas abierto | Dato explícito |
| Podría haber entrado mojado por la lluvia | Hipótesis posible, no conclusión necesaria |
| Llovió exactamente a las diez | El fragmento no ofrece esa hora ni demuestra esa causa |

**Importante:** una explicación plausible no se convierte en un hecho solo porque resulte familiar.
''',
5:'''\n\n### Respaldado, contradicho y no determinado

Texto original de ejemplo: «Desde el martes, la biblioteca abre a las ocho. El horario de cierre no cambia».

| Afirmación | Relación con el fragmento | Motivo |
|---|---|---|
| El martes abre a las ocho | Respaldada | Se indica el nuevo horario de apertura |
| El martes abre a las nueve | Contradicha | Se opone a la hora indicada |
| La biblioteca cierra a las seis de la tarde | No determinada | No se proporciona la hora de cierre |

La última afirmación podría ser verdadera o falsa; este fragmento no lo resuelve. Leer «no se infiere» y «contradice» como consignas distintas.
''',
8:'''\n\n### Relacionar el formato con la tarea

| Formato | Qué revisar | Qué evitar |
|---|---|---|
| Continuo | Párrafos, referencias y desarrollo | Elegir una frase aislada sin leer su alcance |
| Discontinuo | Títulos, categorías, escalas, unidades y notas | Comparar cifras con unidades incompatibles |
| Mixto | Cómo se relacionan prosa y componente gráfico | Inventar una relación que los datos no muestran |

El formato no determina por sí solo la finalidad: una tabla también puede apoyar una argumentación o una explicación.
'''}

def clarify(text,week):
 if week==3:
  text=re.sub(r'> Recuerda la regla morfosintáctica inquebrantable[^\n]*',
   '> **Importante:** en ejercicios de síntesis suele ser útil formular un título breve y preciso. No existe una prohibición general de usar un verbo conjugado en un título; evaluar el enfoque y el alcance, no solo su forma gramatical.',text)
 if week==5:
  text=re.sub(r'> En exámenes rigurosos de la UNSA y UNMSM[^\n]*',
   '> **Importante:** no mencionado, no inferible y contradictorio no son equivalentes. Sin evidencia no debe atribuirse a universidades una regla general que convierta toda afirmación no determinada en falsa.',text)
 if week==6:
  text=text.replace('con fidelidad matemática a la palabra interrogada sin alterar un solo matiz del pensamiento del autor',
   'a la palabra interrogada conservando el sentido pertinente y comprobando los matices del contexto')
  text=text.replace('El valor de verdad y la intención del autor permanezcan 100% inalterables.',
   'La sustitución conserve la información y la intención interpretables en ese contexto; revisar los matices antes de aceptar la equivalencia.')
  text=re.sub(r'> La comisión de admisión elige a propósito palabras[^\n]*',
   '> **Importante:** el contexto orienta la acepción pertinente. No debe suponerse una intención universal de las comisiones de admisión ni que la primera acepción sea siempre incorrecta.',text)
 if week==4:
  text=text.replace('Empieza siempre con *ar, er, ir*', 'Termina en *-ar, -er o -ir*')
  text=text.replace('¿Con qué tipo de verbo debe formularse siempre el propósito central de un texto?',
   '¿Qué forma verbal puede ayudar a formular brevemente el propósito central de un texto?')
 if week==7:
  text=text.replace('Si una oración habla de otro aspecto, esa es la eliminada sin dudar.',
   'Comprobar si ese aspecto cumple una función dentro del conjunto antes de eliminarlo.')
  text=text.replace('Si la ilación del texto mejora y no se pierde nada vital, la respuesta es 100% segura.',
   'Comprobar también referencias, información necesaria y alternativas; una impresión de fluidez no garantiza por sí sola la respuesta.')
 return text

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  for part in [1,2]:
   rel=f'comprension_lectora/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
   backup=ROOT/'build/academic-backup-reading-maps'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   main=0;secondary=0;removed=0;tables=0
   def replace(m):
    nonlocal main,secondary,removed,tables
    source=m[0]
    if not any(t in source for t in ['│','──▶','───▶']):return source
    if '1. ANALIZANTE' in source:
     tables+=1;return STRUCTURE
    if '[TONO' in source:
     if week==7:
      removed+=1;return '**Revisión del conjunto:** comprueba pertinencia, referencias y contenido antes de suprimir una oración.'
     assert week==4
     secondary+=1;return make_map(*SECONDARY[week])
    if '[ENUNCIADO PROPUESTO]' in source or 'CRITERIOS DE SUPRESIÓN' in source:
     assert week in [5,7]
     secondary+=1;return make_map(*SECONDARY[week])
    main+=1;return make_map(title,branches)
   new=re.sub(r'```[^\n]*\n.*?```',replace,raw,flags=re.S)
   assert main<=1 and secondary<=1,(rel,main,secondary)
   inserted=not main
   if inserted:
    addition='## Mapa del tema\n\n'+make_map(title,branches)+'\n\n'
    marker=re.search(r'(?m)^## 3\.',new)
    new=new[:marker.start()]+addition+new[marker.start():] if marker else new+'\n\n'+addition
   if part==1 and week in TABLES:new+=TABLES[week];tables+=1
   new=clarify(new,week);p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   nodes=1+sum(1+len(leaves) for _,leaves in branches)
   if secondary:nodes+=1+sum(1+len(leaves) for _,leaves in SECONDARY[week][1])
   evidence.append(dict(level=f'{week}.{part}',maps=1+secondary,nodes=nodes,insertedMain=inserted,unrelatedRemoved=removed,tables=tables,questionsHash=digest))
   maps=[(title,branches)]+([SECONDARY[week]] if secondary else [])
   for n,(maptitle,mapbranches) in enumerate(maps):
    for i,label in enumerate([maptitle]+[v for name,leaves in mapbranches for v in [name]+leaves]):
     preview.append(dict(id=f'reading_{week}.{part}_{n}_{i}',subject='comprension_lectora',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   content=(STRUCTURE if week==3 else '')+(TABLES.get(week,'') if part==1 else '')
   if content:preview.append(dict(id=f'reading_{week}.{part}_table',subject='comprension_lectora',concept=f'{week}.{part}',statement=content,options=[],explanation=''))
 (ROOT/'build/reading-maps-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/reading-maps-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(levels=len(evidence),maps=sum(x['maps'] for x in evidence),nodes=sum(x['nodes'] for x in evidence),removed=sum(x['unrelatedRemoved'] for x in evidence),tables=sum(x['tables'] for x in evidence))))

if __name__=='__main__':build()
