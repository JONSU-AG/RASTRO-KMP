"""Original English sentences and passages, with explicit Spanish explanations."""
import argparse
from review_reasoning_common import C,build_bank

def G(sentence,answer,distractors,rule,application,instruction='Completa la oración en inglés estándar'):
    assert '___'in sentence and len(distractors)==3
    full=sentence
    answers=answer.split(' / ')if sentence.count('___')>1 else [answer]
    assert len(answers)==sentence.count('___')
    for item in answers:full=full.replace('___',item,1)
    assert '___'not in full
    return C(instruction+':\n'+sentence,[answer]+distractors,0,[rule,application,'La oración completa es: '+full])

def Q(stem,answer,distractors,rule,application):
    return C(stem,[answer]+distractors,0,[rule,application,'La respuesta es: '+answer])

BANK={
'1.1':[
 G('My brother ___ the plants every morning.','waters',['water','are watering','watering'],'Una rutina se expresa aquí con present simple.','My brother es tercera persona singular; el verbo lleva -s.'),
 G('Listen! The children ___ in the next room.','are singing',['is singing','sings','singing'],'La acción está ocurriendo en este momento.','El sujeto plural requiere are seguido de la forma -ing.'),
 G('I ___ to school on weekdays.','walk',['walks','am walk','walking'],'El present simple describe la rutina indicada por on weekdays.','Con I se usa la forma base walk.'),
 G('She ___ coffee. Use the negative present simple.','does not drink',['do not drink','does not drinks','not drinks'],'La negación con she usa does not y verbo base.','El auxiliar lleva la marca de tercera persona; drink no añade -s.'),
 G('___ your father work here?','Does',['Do','Is','Are'],'La pregunta en present simple utiliza un auxiliar.','Your father es singular y work queda en forma base.'),
 G('We ___ a lesson right now.','are having',['is having','has','having'],'La actividad está en curso ahora.','We concuerda con are; having forma el participio presente.'),
 G('Marta ___ two languages. Use the present simple.','speaks',['speak','is speak','speaking'],'La instrucción pide present simple.','Marta es tercera persona singular: speaks.'),
 G('The train ___ at seven according to the timetable. Use the present simple.','leaves',['leave','is leave','leaving'],'Los horarios pueden expresarse con present simple.','The train es singular y requiere leaves.'),
 G('They ___ the answer. Use know to describe their current state.','know',['knows','are know','knowing'],'Know en este sentido expresa un estado de conocimiento.','El sujeto they usa know; no se omite el verbo ni se añade -s.'),
 Q('¿Cuál es la forma negativa de «He is reading»?','He is not reading.',['He does not reading.','He not is reading.','He is not read.'],'En el continuo, la negación se añade al auxiliar be.','Se conserva reading y se coloca not después de is.'),
 Q('¿Qué oración describe una rutina con present simple?','Eva reads every evening.',['Eva is read every evening.','Eva reading every evening.','Eva readed every evening.'],'El sujeto Eva exige una forma personal del verbo.','Reads tiene la marca de tercera persona; las demás formas no completan esta estructura.'),
],
'1.2':[
 G('I ___ what you mean. Use understand as a state verb.','understand',['am understand','understands','understanding'],'Understand suele usarse en forma simple cuando expresa comprensión.','Con I se selecciona understand.'),
 G('Nora ___ her lunch at the moment.','is eating',['are eating','eat','eating'],'At the moment sitúa la actividad en curso.','Nora es singular y necesita is eating.'),
 G('The soup ___ salty. Use taste to describe its flavour.','tastes',['is taste','taste','tasting'],'Taste describe aquí una propiedad percibida.','The soup es singular y la forma simple es tastes.'),
 G('The cook ___ the soup now to check the salt.','is tasting',['are tasting','is taste','tasting'],'Taste expresa aquí la acción deliberada de probar.','La acción en curso se forma con is tasting; el sentido del verbo importa.'),
 G('She ___ a new bicycle. Use own to express possession.','owns',['own','is own','owning'],'Own expresa posesión en este contexto.','La tercera persona singular requiere owns.'),
 G('Why ___ you laughing?','are',['is','do','does'],'Laughing exige el auxiliar del continuo en esta estructura.','You concuerda con are y la pregunta invierte auxiliar y sujeto.'),
 G('My parents ___ not working today.','are',['is','does','do'],'La frase usa un continuo negativo.','Parents es plural; se necesita are antes de not working.'),
 G('Leo usually cycles, but today he ___ the bus. Use the present continuous.','is taking',['take','are taking','taking'],'Se contrasta una rutina con la acción temporal de hoy.','El sujeto he necesita is taking.'),
 G('This bag ___ to Ana. Use belong in the present simple.','belongs',['belong','is belong','belonging'],'Belong to expresa pertenencia.','El sujeto this bag es singular: belongs.'),
 Q('¿Cuál es la pregunta correspondiente a «They are studying»?','Are they studying?',['Do they studying?','They are studying? solamente, como pregunta neutral con inversión.','Is they studying?'],'Una pregunta neutral de sí/no con be invierte auxiliar y sujeto.','Are pasa delante de they y studying se mantiene.'),
 Q('En «I think this answer is correct», think significa…','Creo u opino.',['Estoy realizando necesariamente una acción física.','Poseo un objeto.','Tengo una obligación externa.'],'Think puede describir una opinión o un proceso activo, según el contexto.','Aquí introduce una creencia sobre la respuesta, no una acción en progreso obligatoria.'),
],
'2.1':[
 G('Yesterday, Paula ___ her grandmother.','visited',['visit','visits','visiting'],'Yesterday ubica el hecho en un pasado terminado.','El pasado regular de visit añade -ed.'),
 G('Last night, we ___ to the theatre.','went',['goed','go','going'],'El contexto pide pasado simple.','Go es irregular: su pasado es went.'),
 G('He did not ___ the message.','read',['reads','reading','readed'],'Después de did not se usa la forma base.','Read es la forma escrita base; el pasado ya lo marca did.'),
 G('___ you finish the task yesterday?','Did',['Do','Does','Were'],'Una pregunta sobre la acción pasada usa did.','El verbo principal finish permanece en su forma base.'),
 G('They ___ at home yesterday evening.','were',['was','are','be'],'El pasado de be cambia según el sujeto.','They requiere were.'),
 G('I ___ tired after the trip yesterday.','was',['were','am','being'],'El estado se sitúa en el pasado.','I concuerda con was en esta afirmación.'),
 G('Sara ___ a letter last week.','wrote',['write','written','writing'],'La acción terminada pide pasado simple.','El pasado de write es wrote; written es participio.'),
 G('We ___ the museum two days ago.','saw',['see','seen','seeing'],'Ago señala un momento pasado terminado.','See tiene pasado irregular saw.'),
 G('She ___ not buy the book yesterday.','did',['does','is','was'],'La negación de buy en pasado usa did not.','Buy permanece en base después del auxiliar.'),
 Q('¿Cuál es el pasado simple de study?','studied',['studyed','studying','studies'],'En una consonante seguida de y se cambia y por i antes de -ed.','Study termina en consonante más y; se escribe studied.'),
 Q('¿Qué pregunta corresponde a «Luis lived in Lima last year»?','Where did Luis live last year?',['Where did Luis lived last year?','Where does Luis lived last year?','Where was Luis live last year?'],'La pregunta usa did más verbo base.','Se pregunta el lugar y se conserva la referencia temporal pasada.'),
],
'2.2':[
 G('I ___ help you tomorrow. Use will.','will',['am','did','was'],'Will precede la forma base del verbo.','Help ya está en base y no se añade to.'),
 G('She ___ going to study tonight.','is',['are','does','will'],'La construcción es be going to más verbo base.','She requiere is.'),
 G('They are going to ___ a new course.','start',['starts','started','starting'],'Después de going to se utiliza el infinitivo sin otra marca.','La forma base es start.'),
 G('I will not ___ late.','be',['am','was','being'],'Después de will not se usa la forma base.','La forma base de be no es am ni was.'),
 G('___ you going to join us?','Are',['Do','Does','Will'],'La pregunta de be going to se forma con be delante del sujeto.','You necesita are.'),
 Q('¿Qué estructura expresa correctamente un plan usando be going to?','We are going to visit Cusco.',['We going visit Cusco.','We are going visit Cusco.','We are go to visiting Cusco.'],'La estructura requiere be, going to y verbo base.','Are concuerda con we y visit va después de to.'),
 Q('En «I will carry that bag for you», will puede expresar…','Un ofrecimiento.',['Una negación del pasado.','Una comparación de adjetivos.','Un hábito que solo ocurrió ayer.'],'Will puede usarse para ofrecer ayuda.','El hablante se ofrece a llevar la bolsa.'),
 Q('¿Qué oración tiene la estructura correcta con will?','She will call later.',['She will calls later.','She wills call later.','She will to call later.'],'Los modales no añaden -s y toman verbo base sin to.','Will call conserva esas dos condiciones.'),
 G('He bought a ticket yesterday. He ___ travel next week. Use be going to.','is going to',['are going to','is going','going to'],'Se pide la estructura be going to para un plan.','El auxiliar singular is y el to son necesarios antes de travel.'),
 Q('¿Es una regla absoluta que will nunca pueda expresar una predicción con evidencia?','No; las formas de futuro pueden solaparse según el sentido y el contexto.',['Sí; will solo sirve para hablar del pasado.','Sí; toda evidencia prohíbe will en inglés.','No; will y going to son siempre intercambiables sin matiz.'],'Las distinciones didácticas de futuro no son prohibiciones universales.','El contexto permite distintas perspectivas; no se presenta una única palabra temporal como prueba absoluta.'),
 G('We ___ not going to cancel the lesson.','are',['is','do','will'],'La negación de be going to coloca not después de be.','We concuerda con are.'),
],
'3.1':[
 G('Mia can ___ very well.','swim',['swims','to swim','swimming'],'Can es un modal seguido de verbo base sin to.','La forma requerida es swim.'),
 G('Students must ___ their names on the form.','write',['writes','to write','writing'],'Must se combina con el verbo base.','No se añade -s ni to a write.'),
 G('You should ___ the instructions first.','read',['reads','to read','reading'],'Should precede la forma base.','La oración usa read sin otra terminación.'),
 G('There ___ one notebook on the desk.','is',['are','be','do'],'La construcción existencial concuerda aquí con one notebook.','Ese grupo nominal es singular.'),
 G('There ___ three windows in the room.','are',['is','be','does'],'Three windows es plural.','La construcción existencial estándar usa there are.'),
 G('This bag is ___ than that one. Use heavy.','heavier',['heavy','heaviest','more heavier'],'Than introduce la comparación entre dos.','Heavy forma heavier; no se duplica la marca comparativa con more.'),
 G('Of these three roads, this is the ___. Use short.','shortest',['shorter','short','more short'],'Se compara un elemento con todo el grupo.','Short forma el superlativo shortest después de the.'),
 G('This answer is ___ than the first one. Use good.','better',['gooder','best','more better'],'Good tiene un comparativo irregular.','Ese comparativo es better.'),
 Q('¿Qué significa «You must not enter»?','Se prohíbe entrar.',['No es necesario entrar, pero está permitido.','Entraste ayer.','Puedes entrar sin condiciones.'],'Must not expresa prohibición.','No equivale a lack of necessity, que puede expresarse con do not have to.'),
 Q('¿Qué significa «You do not have to attend»?','No tienes obligación de asistir.',['Tienes prohibido asistir.','Asististe obligatoriamente.','Debes asistir sin excepción.'],'Do not have to niega necesidad u obligación.','No impone por sí solo una prohibición.'),
 G('___ I ask a question? Use can.','Can',['Do can','Am can','Does can'],'La pregunta con can coloca el modal antes del sujeto.','No necesita do, does ni be como auxiliar adicional.'),
],
'3.2':[
 G('Ana is as ___ as Beto. Use tall.','tall',['taller','tallest','more tall'],'As…as encierra el adjetivo en grado positivo.','La forma es tall, sin marca comparativa.'),
 G('This exercise is ___ difficult than the previous one.','more',['most','muchest','many'],'La comparación de difficult se forma con more.','Than completa la comparación.'),
 G('That is the ___ interesting book of the three.','most',['more','much','many'],'La comparación abarca el grupo completo.','El superlativo de interesting se forma con most.'),
 G('There ___ any chairs in this room. Use a plural negative present form.','are not',['is not','does not','not are'],'El nombre chairs es plural.','La negación existencial usa are not.'),
 G('___ there a library near here?','Is',['Are','Do','Does'],'La pregunta existencial singular invierte is y there.','A library es singular.'),
 G('She cannot ___ today.','come',['comes','to come','coming'],'Cannot sigue siendo un modal.','El verbo posterior conserva la forma base come.'),
 Q('¿Qué oración expresa una recomendación con should?','You should rest before the trip.',['You should to rest before the trip.','You should rests before the trip.','You are should resting before the trip.'],'Should puede presentar una recomendación.','La estructura correcta es modal más verbo base.'),
 Q('En «He can speak French», can expresa principalmente…','Capacidad.',['Una comparación de tamaño.','Un pasado terminado.','Una estructura existencial.'],'El modal tiene distintos usos según el contexto.','Aquí se afirma la capacidad de hablar un idioma.'),
 G('The second route is ___ than the first. Use bad.','worse',['badder','worst','more worse'],'Bad tiene formas comparativa y superlativa irregulares.','Than requiere aquí el comparativo worse.'),
 G('This is the ___ result in the set. Use good.','best',['better','goodest','more good'],'The y la comparación dentro del conjunto indican superlativo.','El superlativo irregular de good es best.'),
 Q('¿Cuál es una pregunta existencial plural correcta?','Are there any tables?',['Is there any tables?','Do there any tables?','There are any tables? como pregunta neutral con inversión.'],'La pregunta estándar coloca are delante de there.','Tables es plural y necesita are.'),
],
}

BANK.update({
'4.1':[
 G('I would like ___ the course.','to join',['joining','join','joined'],'Would like puede ir seguido de un infinitivo con to.','La forma que completa esta construcción es to join.'),
 G('She enjoys ___ stories.','reading',['to reading','read','reads'],'Enjoy exige aquí una forma -ing como complemento.','Reading completa el patrón enjoy doing.'),
 G('Would you mind ___ the window?','closing',['to close','close','closed'],'Would you mind toma una forma -ing.','La solicitud correcta utiliza closing.'),
 G('I prefer tea ___ coffee.','to',['than','that','as'],'La comparación nominal con prefer usa to.','Tea y coffee son los dos términos comparados.'),
 G('It was raining, ___ we stayed inside.','so',['because of','although of','despite of'],'La segunda cláusula presenta un resultado.','So enlaza la lluvia con la decisión consecuente.'),
 G('We stayed inside ___ it was raining.','because',['because of','despite','in spite'],'Después del espacio aparece una cláusula completa con sujeto y verbo.','Because introduce esa causa; because of requeriría un grupo nominal.'),
 G('___ the rain, the match continued.','Despite',['Although','Because','In spite'],'The rain es un grupo nominal.','Despite puede precederlo directamente; in spite requeriría of.'),
 G('___ it was raining, the match continued.','Although',['Despite','Because of','In spite of'],'El contraste introduce una cláusula con sujeto y verbo.','Although puede ir seguido de it was raining.'),
 G('Could you ___ me, please?','help',['to help','helping','helps'],'Could como modal va seguido de verbo base.','La solicitud usa help sin to ni -s.'),
 Q('¿Qué respuesta acepta cortésmente «Would you like some water?»?','Yes, please.',['I am water.','Water are yes.','I like to yes.'],'La pregunta ofrece algo.','Yes, please acepta la oferta de manera cortés.'),
 Q('En «I like reading», reading funciona como…','Complemento en forma -ing de like.',['Una marca de pasado simple regular.','Un pronombre de objeto.','Un comparativo.'],'La forma -ing puede actuar como complemento verbal.','Aquí nombra la actividad que le gusta al hablante.'),
],
'4.2':[
 G('She arrived early in order ___ a seat.','to get',['getting','gets','for get'],'In order to introduce finalidad y va seguido de verbo base.','To get completa la estructura.'),
 G('He spoke quietly so that the baby ___ wake up.','would not',['not would','did not to','would not to'],'So that introduce una cláusula de finalidad.','Would not precede la forma base wake.'),
 G('She wrote the address down in order not ___ it.','to forget',['forgetting','forgets','for forgetting'],'La finalidad negativa usa in order not to.','Después de not aparece to forget.'),
 G('The room was small; ___, it was comfortable.','however',['because of','despite of','although of'],'Las dos afirmaciones se contrastan entre cláusulas independientes.','However funciona como conector de contraste con la puntuación dada.'),
 G('He missed the bus ___ leaving home late.','because of',['because','although','so that'],'Leaving home late funciona aquí como grupo -ing.','Because of puede preceder ese grupo; because requeriría una cláusula distinta.'),
 G('In spite ___ the noise, she concentrated.','of',['to','than','for'],'La locución completa es in spite of.','Of enlaza la locución con the noise.'),
 G('She studied ___ she could understand the topic.','so that',['in order to','despite','because of'],'Después del espacio aparece she could understand, una cláusula finita.','So that introduce el propósito en esa estructura.'),
 Q('¿Cuál expresa finalidad con una estructura correcta?','They practised to improve their timing.',['They practised for improve their timing.','They practised in order improving their timing.','They practised so that to improve their timing.'],'Un infinitivo con to puede expresar propósito.','Las otras opciones mezclan patrones que no completan estas estructuras.'),
 Q('En «Although she was tired, she finished», although introduce…','Una concesión o contraste.',['Una equivalencia matemática.','Un lugar de destino.','Una posesión.'],'La cláusula reconoce una circunstancia que podría dificultar el resultado.','Aun así, la segunda afirma que terminó.'),
 Q('¿Es correcto afirmar que in order that exige siempre un modal explícito?','No; no debe presentarse esa exigencia como una regla universal.',['Sí; cualquier cláusula sin modal después de in order that es imposible.','Sí; in order that solo puede ir con un sustantivo.','No; in order that siempre debe seguirse de to más verbo.'],'In order that introduce una cláusula, no un infinitivo con to.','Puede aparecer con presente simple para referirse al futuro; que un modal sea frecuente no lo vuelve obligatorio en todos los casos.'),
 G('I would rather ___ at home tonight.','stay',['to stay','staying','stays'],'Would rather con el mismo sujeto toma verbo base sin to.','Stay completa el patrón de preferencia.'),
],
'5.1':[
 G('Ana is here. ___ is my classmate.','She',['Her','Hers','Herself'],'La segunda oración necesita un pronombre sujeto.','Ana se retoma con she en esta frase.'),
 G('I called Luis and spoke to ___.','him',['he','his','himself'],'Después de la preposición to se usa pronombre de objeto.','Him es la forma de objeto correspondiente en este contexto.'),
 G('This notebook belongs to me. It is ___.','mine',['my','me','I'],'Después de is se usa aquí un pronombre posesivo independiente.','Mine no necesita un sustantivo posterior; my sí.'),
 G('This is ___ notebook. It belongs to me.','my',['mine','I','me'],'Antes de notebook se necesita un determinante posesivo.','My acompaña al nombre.'),
 G('We meet ___ Monday.','on',['in','at','to'],'Los días de la semana llevan on en esta expresión.','Monday especifica el día de la reunión.'),
 G('The lesson starts ___ nine o’clock.','at',['on','in','to'],'Una hora puntual suele introducirse con at.','Nine o’clock es una hora concreta.'),
 G('Her birthday is ___ July.','in',['on','at','to'],'Los meses sin una fecha específica usan in.','July es el mes mencionado.'),
 G('The keys are ___ the box, completely inside it.','in',['onto','from','towards'],'El contexto indica interior, no movimiento hacia una superficie.','In representa la ubicación dentro de la caja.'),
 G('He walked ___ the room from the corridor. Use a preposition that explicitly expresses entering.','into',['out of','away from','under'],'La instrucción pide entrada al interior.','Into expresa ese movimiento; las otras opciones indican salida, alejamiento o posición inferior.'),
 Q('¿Cuál mantiene el orden neutral sujeto–verbo–objeto?','The student reads the book.',['Reads the student book the.','The book the reads student.','Student the book reads the.'],'Una afirmación transitiva neutral sitúa el sujeto antes del verbo y el objeto después.','The student es sujeto, reads verbo y the book objeto.'),
 G('Please give the papers to Ana and ___.','me',['I','my','mine'],'Ambos elementos coordinados complementan la preposición to.','La forma de objeto es me; coordinarla con Ana no la convierte en sujeto.'),
],
'5.2':[
 G('Carlos repaired the chair by ___.','himself',['he','him','his'],'By más reflexivo puede expresar que alguien actuó sin ayuda.','Carlos se retoma aquí con himself.'),
 G('The students finished ___ project.','their',['theirs','them','they'],'Antes del nombre project se necesita determinante posesivo.','Their acompaña al sustantivo; theirs se usa sin él.'),
 G('These bags belong to us. They are ___.','ours',['our','we','us'],'La posesión aparece sin sustantivo posterior.','Se necesita el pronombre posesivo ours.'),
 G('The picture is hanging ___ the wall.','on',['into','towards','from inside'],'La ubicación se describe sobre la superficie de la pared.','On es la preposición que completa esa relación.'),
 G('The class begins ___ 8:30 ___ Tuesday. Choose the pair in order.','at / on',['on / in','in / at','to / in'],'La hora usa at y el día usa on.','Los espacios se completan en el mismo orden que aparecen.'),
 G('The bridge connects the two banks. The bus goes ___ the bridge from one bank to the other.','across',['into','inside','below inside'],'Se describe un recorrido de un lado al otro por el puente.','Across expresa ese cruce.'),
 G('I have a meeting ___ the morning.','in',['on','at','to'],'La expresión general the morning usa in.','No se está dando una fecha como on Monday morning.'),
 Q('¿Qué pronombre puede usarse para una persona cuyo género no se especifica?','They, en su uso singular.',['It como única forma obligatoria.','We como única forma obligatoria.','Themself como sujeto personal en lugar de cualquier nombre.'],'El inglés admite singular they para una persona sin género especificado.','No se limita they a referentes plurales en todos sus usos.'),
 Q('¿Cuál es una pregunta neutral bien formada?','Where does Eva study?',['Where Eva does study? como pregunta neutral con inversión.','Where does Eva studies?','Where is Eva study?'],'La pregunta en present simple usa does antes del sujeto singular.','El verbo study queda en su forma base.'),
 G('My friends and I are ready. Please wait for ___.','us',['we','our','ours'],'Después de for va un pronombre de objeto.','El grupo que incluye al hablante se retoma con us.'),
 G('This is the student ___ won the prize. Use a relative pronoun for a person.','who',['which','where','when'],'La cláusula relativa describe a una persona.','Who funciona como sujeto de won en esa cláusula.'),
],
})

def reading(passage,question,answer,distractors,evidence,reason):
    return C('Lee el texto original de práctica:\n“'+passage+'”\n\n'+question,[answer]+distractors,0,['La evidencia pertinente es: “'+evidence+'”.',reason,'La respuesta respaldada por el texto es: '+answer])

P1='Nina studies in the morning. On Fridays she works at a library from two to five. The library is closed on Sundays. She walks there because it is near her home.'
P2='The school garden opened in April. Students water it on Tuesdays and Thursdays. A teacher checks the soil before they add water. The project aims to help students learn about plants, not to sell vegetables.'
P3='Library notice: The reading room opens at nine. Bring your student card to borrow a book. Each visitor may borrow two books for seven days. Food is not allowed in the reading room, but sealed water bottles are permitted.'
BANK.update({
'6.1':[
 reading(P1,'When does Nina work at the library?','On Fridays.',['On Sundays.','Every morning.','Only in April.'],'On Fridays she works at a library from two to five.','La frase identifica explícitamente el día; no se necesita una inferencia externa.'),
 reading(P1,'How long is her Friday shift?','Three hours.',['Two hours.','Five hours.','Seven hours.'],'from two to five','La duración entre las dos y las cinco es de tres horas.'),
 reading(P1,'Why does she walk to the library?','It is near her home.',['The library sells bicycles.','She works every Sunday.','Her school is closed in April.'],'because it is near her home','Because introduce la razón explícita.'),
 reading(P1,'What does there refer to in the last sentence?','The library.',['A garden.','A classroom.','A shop.'],'She walks there because it is near her home.','El lugar al que acaba de referirse el texto es la biblioteca donde trabaja.'),
 reading(P1,'Which statement contradicts the text?','The library opens on Sundays.',['Nina studies in the morning.','Nina works on Fridays.','The library is near her home.'],'The library is closed on Sundays.','Afirmar que abre los domingos contradice directamente closed on Sundays.'),
 reading(P2,'What is the main purpose of the garden project?','To help students learn about plants.',['To sell vegetables.','To close the school.','To replace every classroom.'],'The project aims to help students learn about plants, not to sell vegetables.','El propósito se expresa mediante aims to y se descarta explícitamente vender verduras.'),
 reading(P2,'When did the garden open?','In April.',['In August.','Every Thursday.','At five o’clock.'],'The school garden opened in April.','La primera oración da el mes de apertura.'),
 reading(P2,'What happens before students add water?','A teacher checks the soil.',['They sell vegetables.','The library closes.','They replace the garden.'],'A teacher checks the soil before they add water.','Before establece el orden entre las acciones.'),
 Q('Para encontrar rápidamente una hora específica en un aviso, ¿qué estrategia se ajusta mejor?','Scanning: buscar el dato concreto.',['Skimming como búsqueda exclusiva de todos los detalles.','Inventar la hora por el título.','Leer solo la primera letra de cada palabra.'],'Scanning busca información específica.','Una hora puede localizarse revisando cifras o expresiones temporales pertinentes.'),
 Q('Para obtener primero la idea general de un texto, ¿qué estrategia se ajusta mejor?','Skimming.',['Copiar cada palabra sin atender al sentido.','Buscar únicamente una fecha aislada.','Traducir una sola preposición.'],'Skimming busca una comprensión global inicial.','No sustituye la lectura detallada cuando la pregunta requiere un dato o inferencia concreta.'),
 reading(P3,'What kind of text is this?','A notice giving library rules and information.',['A personal diary about a trip.','A recipe for soup.','A fictional dialogue between two doctors.'],'Library notice','El encabezado y las instrucciones presentan un aviso institucional, no una narración personal.'),
],
'6.2':[
 reading(P3,'What must a visitor bring to borrow a book?','A student card.',['A water bottle.','A plant.','A photograph of a garden.'],'Bring your student card to borrow a book.','La tarjeta se menciona como requisito para el préstamo.'),
 reading(P3,'How many books may each visitor borrow?','Two.',['One.','Seven.','Nine.'],'Each visitor may borrow two books for seven days.','Two indica cantidad; seven days indica duración.'),
 reading(P3,'How long is the borrowing period?','Seven days.',['Two days.','Nine hours.','One month.'],'for seven days','For introduce aquí la duración permitida del préstamo.'),
 reading(P3,'Which item is explicitly permitted in the reading room?','A sealed water bottle.',['A hot meal.','Any food.','An open bowl of soup.'],'sealed water bottles are permitted','El aviso diferencia entre comida prohibida y botellas selladas permitidas.'),
 reading(P3,'What does but signal in the last sentence?','A contrast between a restriction and an exception.',['A date in the past.','A change of speaker.','A causal explanation of the opening time.'],'Food is not allowed in the reading room, but sealed water bottles are permitted.','But conecta dos disposiciones contrastantes; no indica una fecha ni una causa.'),
 reading(P2,'Which activity is not a stated goal of the garden project?','Selling vegetables.',['Learning about plants.','Checking the soil before watering.','Watering on specified days.'],'not to sell vegetables','La negación afecta explícitamente al objetivo de vender verduras.'),
 reading(P2,'Who does they refer to in “before they add water”?','The students.',['The plants.','The vegetables.','The bottles.'],'Students water it on Tuesdays and Thursdays. A teacher checks the soil before they add water.','Los estudiantes son quienes riegan; el pronombre retoma ese sujeto plural.'),
 reading(P1,'Can we conclude that Nina never uses any transport other than walking?','No; the text only states how she gets to the library.',['Yes; it describes every journey she takes.','Yes; she lives inside the library.','No; the text says she always drives.'],'She walks there because it is near her home.','La información sobre ese trayecto no justifica una afirmación universal sobre todos sus viajes.'),
 reading(P3,'Does the notice state the library’s closing time?','No.',['Yes, at two.','Yes, at five.','Yes, at seven.'],'The reading room opens at nine.','Solo aparece la hora de apertura; no se inventa una de cierre.'),
 reading(P2,'What does aims to introduce?','The intended purpose of the project.',['Its sale price.','A student’s surname.','The exact depth of the soil.'],'The project aims to help students learn about plants','Aims to presenta una finalidad; no garantiza un resultado medido.'),
 reading(P3,'Which summary is best supported?','The notice explains access, borrowing limits and reading-room rules.',['The library only sells food.','Visitors must borrow exactly seven books.','The room opens only on Sundays.'],'Bring your student card to borrow a book. Each visitor may borrow two books for seven days.','El resumen reúne los asuntos tratados sin alterar cantidades ni añadir días no indicados.'),
],
})

P4='Leo is a first-year student. He lives with his aunt and takes the bus to class. On weekdays he reviews his notes for twenty minutes after dinner. On Saturdays he meets a study group at the library. He wants to study engineering, but he has not chosen a university yet.'
P5='For a classroom diary, Mara wrote: “I packed rice, beans and fruit for lunch. I brought water in a reusable bottle. My friend bought a sandwich. We ate after our morning classes.” The diary describes one school day; it does not give medical advice.'
P6='After a school sports session, the coach asked students to report any discomfort to the responsible adult. Dani said his ankle hurt and sat down while the teacher called his family. The text does not describe a diagnosis or a treatment.'
P7='The study club used to meet on Fridays. This term it meets on Wednesdays because the library room is free then. Members may also join online. The new schedule was announced on Monday, and the first Wednesday meeting starts at four.'
BANK.update({
'7.1':[
 reading(P4,'Who does Leo live with?','His aunt.',['His coach.','His sister alone.','All his classmates.'],'He lives with his aunt','El parentesco y la convivencia aparecen explícitamente.'),
 reading(P4,'How does Leo travel to class?','By bus.',['By train.','On foot only.','By bicycle.'],'takes the bus to class','La expresión indica el medio de transporte.'),
 reading(P4,'When does he review his notes on weekdays?','After dinner.',['Before breakfast.','Only on Saturdays.','At midnight exactly.'],'after dinner','Se indica una relación temporal, no una hora exacta.'),
 reading(P4,'How long does he review his notes?','Twenty minutes.',['Two hours.','Ten seconds.','Forty minutes.'],'for twenty minutes','For indica la duración de esa actividad.'),
 reading(P4,'Where does the Saturday study group meet?','At the library.',['At the sports field.','At his aunt’s workplace.','At a restaurant.'],'On Saturdays he meets a study group at the library.','La oración fija el lugar de reunión.'),
 reading(P4,'Has Leo chosen a university?','Not yet.',['Yes, two universities.','Yes, his aunt’s university.','The text gives its exact name.'],'he has not chosen a university yet','La negación y yet indican que la decisión sigue pendiente.'),
 reading(P5,'What did Mara pack for lunch?','Rice, beans and fruit.',['Only soup.','A sandwich bought by her friend.','Only water, with no food.'],'I packed rice, beans and fruit for lunch.','La lista pertenece al almuerzo de Mara, no al de su amiga.'),
 reading(P5,'Who bought a sandwich?','Mara’s friend.',['Mara’s aunt.','The coach.','Leo.'],'My friend bought a sandwich.','El sujeto de bought es my friend.'),
 reading(P5,'When did they eat?','After their morning classes.',['Before all their classes.','During a midnight trip.','Only on Sunday.'],'We ate after our morning classes.','After indica que las clases de la mañana ocurrieron primero.'),
 reading(P5,'Does the text prescribe the same lunch for every person?','No; it describes one school day.',['Yes; it gives a universal medical prescription.','Yes; it says every person must eat rice.','No; it says nobody may eat beans.'],'The diary describes one school day; it does not give medical advice.','No se convierte un ejemplo narrativo en una recomendación clínica universal.'),
 reading(P4,'What field does Leo want to study?','Engineering.',['Medicine.','Law.','Literature.'],'He wants to study engineering','El deseo de estudiar ingeniería está expreso, aunque la universidad no esté elegida.'),
],
'7.2':[
 reading(P7,'On which day does the club meet this term?','Wednesday.',['Friday.','Monday.','Sunday.'],'This term it meets on Wednesdays','La pregunta pide el horario actual, no el anterior.'),
 reading(P7,'Why was Wednesday chosen?','The library room is free then.',['The club stopped studying.','Every member moved away.','The library closes every Wednesday.'],'because the library room is free then','Because introduce la razón mencionada.'),
 reading(P7,'What alternative is offered to members?','Joining online.',['Buying the library.','Meeting only at midnight.','Skipping every meeting.'],'Members may also join online.','Also añade una modalidad de participación.'),
 reading(P7,'When was the schedule announced?','On Monday.',['On Friday.','On Sunday.','In April, according to the text.'],'The new schedule was announced on Monday','El anuncio y la reunión son eventos diferentes.'),
 reading(P7,'What time does the first Wednesday meeting start?','At four.',['At nine.','At two.','At seven.'],'the first Wednesday meeting starts at four','La pregunta requiere scanning para esa hora concreta.'),
 reading(P7,'In this context, used to meet refers to…','A past routine that differs from the current schedule.',['A command to buy equipment.','A meeting that is happening at this second.','A future medical treatment.'],'used to meet on Fridays. This term it meets on Wednesdays.','El contraste entre el hábito anterior y el horario actual aclara el sentido.'),
 reading(P6,'What did Dani report?','Pain in his ankle.',['A lost book.','An exact medical diagnosis.','A timetable change.'],'Dani said his ankle hurt','El texto describe una molestia, sin identificar su causa médica.'),
 reading(P6,'What did Dani do while the teacher called his family?','He sat down.',['He ran another race.','He prescribed medicine.','He left alone immediately.'],'sat down while the teacher called his family','While relaciona las dos acciones que ocurren en ese intervalo.'),
 reading(P6,'What information is explicitly not supplied?','A diagnosis or treatment.',['That the session was at school.','That a teacher called the family.','That Dani mentioned discomfort.'],'The text does not describe a diagnosis or a treatment.','La ausencia se declara; no se inventa una lesión específica.'),
 reading(P6,'Who called Dani’s family?','The teacher.',['The librarian.','His aunt in the text.','Every club member.'],'the teacher called his family','El sujeto de called es the teacher.'),
 reading(P7,'Which statement is unsupported by the text?','Every member prefers Wednesday to Friday.',['The club previously met on Fridays.','Online participation is possible.','The room is free on Wednesdays.'],'This term it meets on Wednesdays because the library room is free then.','La disponibilidad del lugar no informa la preferencia de cada integrante.'),
],
})

def build(write=False):build_bank('ingles','ing',BANK,write)
if __name__=='__main__':
    ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
