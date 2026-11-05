"""Repair three authored English lessons; preserve every question byte."""
import re,json,hashlib,shutil
from review_logical_maps import ROOT,make_map

branches=[
 ('Pronombres y posesión',[
  'Sujeto: I, you, he, she, it, we, they. Ejemplo: She studies.',
  'Objeto: me, you, him, her, it, us, them. Ejemplo: I called her.',
  'Posesivo ante un sustantivo: my book. Posesivo independiente: This book is mine.',
  'Reflexivo: el objeto remite al sujeto; también puede dar énfasis. She introduced herself.']),
 ('Tiempo y lugar',[
  'Tiempo: at para horas; on para días y fechas; in para meses, años y algunas partes del día.',
  'Lugar: at presenta un punto o actividad; on una superficie; in un interior o área.',
  'Son patrones de uso, no una ley de tamaño. Aprender también expresiones como at home y at night.']),
 ('Movimiento',[
  'To indica destino; towards indica dirección, sin afirmar llegada.',
  'Into y out of indican entrada y salida; across y through describen recorridos distintos.']),
 ('Orden y contexto',[
  'En una afirmación transitiva neutra suele aparecer sujeto, verbo y objeto. No toda oración lleva objeto.',
  'Lugar y tiempo pueden cambiar de posición: Yesterday, John bought a book es una oración válida.',
  'Los adjetivos antepuestos siguen tendencias de orden; no toda descripción exige una secuencia de ocho adjetivos.'])]

time_table='''### Elegir una preposición de tiempo

| Uso habitual | Forma | Ejemplo |
|---|---|---|
| Hora o momento puntual | at | at 8:30; at noon |
| Día o fecha | on | on Monday; on 15 May |
| Mes, año o estación | in | in July; in 2027; in winter |
| Partes habituales del día | in the | in the morning; in the evening |
| Noche, en sentido general | at | at night |

**Importante:** estas asociaciones son una guía, no una regla basada únicamente en el tamaño del intervalo. *On Monday morning* incluye un día concreto. Con *next Monday*, *last year* y *every morning* normalmente no añadimos at, on o in. *In the night* también existe cuando se habla de un momento durante una noche determinada.
'''

part_two='''# Preposiciones y orden de la oración: aplicación

## Tiempo: leer la expresión completa

No elijas una preposición solo por la última palabra. Compara **in the morning** con **on Monday morning**: la segunda expresión concreta un día.

'''+time_table+'''
## Lugar y movimiento

| Forma | Relación que expresa | Ejemplo |
|---|---|---|
| at | Punto de encuentro o actividad | at the bus stop; at school |
| on | Contacto con una superficie | on the table |
| in | Interior o área | in the classroom; in Peru |
| to | Destino | She walked to the library. |
| towards | Dirección, sin asegurar llegada | She walked towards the library. |
| into | Entrada | He went into the laboratory. |
| out of | Salida | They came out of the lecture hall. |
| across | Paso de un lado a otro | We walked across the street. |
| through | Recorrido por el interior | We walked through the tunnel. |

**Importante:** *at the library* puede presentar la biblioteca como lugar de una actividad; *in the library* destaca el interior. El significado y la expresión habitual importan más que una supuesta escala de tamaños.

### Transportes: aprender combinaciones

Usamos habitualmente **on a bus**, **on a train**, **on a plane**, **on a ship**, **on a bicycle** y **on a motorcycle**; también **in a car**, **in a taxi** e **in a helicopter**. Al indicar el medio sin artículo, aparece **by bus**, **by train** o **by car**.

Poder ponerse de pie no es una regla gramatical: una bicicleta ya muestra el límite de esa comparación. Aprende la combinación y distingue viajar en un transporte de describir físicamente su interior.

## Orden de la oración

En una afirmación transitiva neutra, la base frecuente es **sujeto + verbo + objeto**. Los complementos de modo, lugar y tiempo amplían la información; no son obligatorios en toda oración.

| Elemento | En el ejemplo | Función |
|---|---|---|
| Sujeto | John | Quién realiza la acción |
| Verbo | bought | Acción expresada en pasado |
| Objeto | a new computer | Qué compró |
| Lugar | in Arequipa | Dónde |
| Tiempo | yesterday | Cuándo |

**John bought a new computer in Arequipa yesterday.**

También es correcto: **Yesterday, John bought a new computer in Arequipa.** Mover un complemento temporal al inicio no equivale a colocar el verbo antes del sujeto. En cambio, *Yesterday bought John a computer* no representa el orden neutro de este ejemplo.

### Adjetivos: tendencia de orden y función

**A beautiful small wooden table** combina opinión, tamaño y material. **The table is beautiful** coloca un adjetivo después de un verbo copulativo. No son usos contradictorios: el primero modifica al sustantivo dentro de su grupo; el segundo atribuye una cualidad mediante el verbo.

| Pista de descripción | Ejemplo | Qué observar |
|---|---|---|
| Opinión y descripción | a lovely red dress | La opinión suele preceder a la descripción |
| Tamaño y material | a small wooden table | No es necesario llenar todas las categorías |
| Color y origen | a blue Peruvian bag | La combinación debe tener sentido |
| Cualidad tras verbo copulativo | The student is brilliant. | El adjetivo no tiene que preceder siempre a un sustantivo |

La mnemotecnia **OSASCOMP** recuerda opinión, tamaño, edad, forma, color, origen, material y propósito. Es una orientación para adjetivos antepuestos, no una obligación de usar todas las categorías ni una prohibición de otros órdenes justificados por el contexto.

## Contrastes útiles

1. **my / mine:** *my laboratory skills* lleva un posesivo dependiente del grupo nominal. *These skills are mine* usa uno independiente.
2. **I / me tras una preposición:** en inglés estándar escrito, *She sat between John and me*. Quitar *John and* permite comprobar la forma: *between me*, no *between I*.
3. **at night / in the night:** la primera expresión es general; la segunda puede situar algo durante una noche concreta.
4. **last year / in the last year:** *Last year* nombra el año pasado. *In the last year* puede referirse al periodo de doce meses anterior al momento de referencia; no es incorrecto por sí mismo.

## Resolver una corrección paso a paso

Texto de práctica ficticio:

> I write this letter for to explain you my situation. In the last year, I worked very hard with my professors for improve mine laboratory skills. Yesterday arrived the notification from the university.

1. Para expresar finalidad en este caso, usa **to explain**, no *for to explain*. La persona destinataria aparece con *to*: **explain my situation to you**.
2. Si se quiere nombrar el año calendario anterior, usa **Last year**. No elimines *in* automáticamente cuando el significado sea un periodo de doce meses.
3. Para la finalidad de trabajar, usa **to improve**. Tras una preposición que admite una forma verbal, suele usarse la terminación *-ing*; eso no convierte el infinitivo de finalidad en una preposición.
4. Antes de *laboratory skills*, corresponde **my**, no *mine*.
5. En esta afirmación neutra, escribe **The notification arrived yesterday**. El complemento temporal también puede ir primero: **Yesterday, the notification arrived**.

Versión con el significado de año calendario anterior:

> I am writing this letter to explain my situation to you. Last year, I worked very hard with my professors to improve my laboratory skills. The notification arrived yesterday.
'''

def build():
 evidence=[];preview=[]
 for week,part in [(5,1),(5,2),(6,2)]:
  rel=f'ingles/semana{week:02d}/{week}.{part}/theory.md'
  p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=p.read_text(encoding='utf-8');digest=hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()
  backup=ROOT/'build/academic-backup-english-theory-layout'/rel
  backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(p,backup)
  if (week,part)==(5,1):
   new=re.sub(r'```mermaid\n.*?```',make_map('Pronombres, preposiciones y orden',branches),raw,count=1,flags=re.S)
   new=new[:new.index('### 3.2.')]+'''### 3.2. Preposiciones: usos y contexto

''' +time_table+'''
Para el lugar, compara **at the bus stop**, **on the table** e **in the classroom**. Son relaciones de punto, superficie e interior; la continuación desarrolla sus usos y el movimiento con ejemplos.
'''
   new=new.replace('aplicar con exactitud matemática','aplicar según el contexto')
   new=new.replace('y **NUNCA** va seguido de un nombre','y no funciona como determinante ante el sustantivo poseído')
   new=new.replace('Reglas de Oro Pronominales','Contrastes pronominales')
  elif week==5:new=part_two
  else:
   new=re.sub(r'```\n┌.*?```','''> **UNIVERSITY LIBRARY**
>
> SILENCE MUST BE OBSERVED AT ALL TIMES
>
> No food or sugary drinks allowed inside study rooms.
>
> Books may be borrowed for a maximum of 14 days.
>
> Fines apply for late returns: 1.50 per day.

**Ejemplo ficticio para practicar lectura.** La cifra 1.50 no indica una moneda: no se debe inventar cuál es.
''',raw,count=1,flags=re.S)
   a=new.index('## 2. PRE-UNIVERSITY HACKS');b=new.index('\n---',a)
   new=new[:a]+'''## Estrategias de lectura

| Pregunta | Qué buscar | Cómo verificar |
|---|---|---|
| Main idea / purpose | Propósito global | Leer apertura, cuerpo y cierre; no quedarse con una palabra |
| Specific detail | Dato concreto | Localizarlo y comprobar su relación con la pregunta |
| Vocabulary in context | Sentido de la expresión | Sustituirla sin alterar el significado del pasaje |
| NOT true | Afirmación que no es verdadera según el texto | Distinguir contradicción de ausencia de información según la consigna |

''' +new[b:]
   new=new.replace('## 6. PRE-UNIVERSITY HACKS Y MNEMOTÉCNIAS','## Pistas de búsqueda y vocabulario')
   new=new.replace('### 1. El Hack de los "Wh- Words" para Scanning Inmediato','### Preguntas que orientan la búsqueda')
   new=new.replace('## 3. COMMON PITFALLS & ADMISSION EXAM TRAPS\n## 7. ERRORES FRECUENTES Y TRAMPAS DE EXAMEN','## Errores frecuentes de lectura')
   new=new.replace('   - *Realidad en UNSA/Admisión:* Con frecuencia, los distractores copian palabras literales del texto pero alteran el sentido o la negación. La respuesta correcta suele presentarse formulada con **paráfrasis o sinónimos**.','   - Comprueba el significado completo. Una opción puede repetir palabras o usar una paráfrasis; ninguna de esas formas garantiza por sí sola que sea correcta.')
   new=new.replace('   - Una afirmación es **False** si el texto dice explícitamente lo contrario.','   - Una afirmación es **False** si contradice lo expresado por el texto, de forma directa o mediante una consecuencia necesaria.')
   new=new.replace('Palabras como *always, never, all, only, completely* en las alternativas suelen ser indicio de trampas. El texto en inglés suele usar matices (*often, some, generally, mostly*).','Compara el alcance de *always, never, all, only, completely* con el del pasaje. No descartes una opción solo por contenerlas: puede ser correcta si el texto la respalda.')
   new=new.replace('`<exchange@unsa.edu.pe>`','`<exchange@example.org>`')
   new=new.replace('### Caso 1: Lectura de un Correo de Intercambio Universitario','### Caso 1: Lectura de un correo ficticio de intercambio universitario')
   new=new.replace('significa **darse cuenta**.','puede significar **darse cuenta**; en otros contextos también expresa concretar o hacer realidad, como *realize a dream*.')
   new=new.replace('NO significa *atender*; significa **asistir / estar presente**.','en *attend a class* significa **asistir**; otras construcciones, como *attend to a request*, tienen otro sentido. Lee la expresión completa.')
  assert new.count('```')%2==0
  assert '\\end{array}' not in new and '│' not in new
  p.write_text(new,encoding='utf-8')
  f=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  shutil.copy2(p,f)
  assert hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'{week}.{part}',questionsHash=digest))
  preview.append(dict(id=f'english_{week}_{part}',subject='ingles',concept=f'{week}.{part}',statement=new,options=[],explanation=''))
 (ROOT/'build/english-theory-layout-review.json').write_text(json.dumps(evidence,indent=2),encoding='utf-8')
 (ROOT/'build/english-theory-layout-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf-8')

if __name__=='__main__':build()
