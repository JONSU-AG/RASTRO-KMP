"""Authored propositional, categorical and ordering exercises with finite verification."""
import argparse,itertools
from review_reasoning_common import *
from sympy.logic.boolalg import And,Or,Not,Implies,Equivalent,Xor
p,q,r,t=s.symbols('p q r t')
I=Implies;E=Equivalent

def tex(expr):return s.latex(expr)
def rows(exprs):
    variables=sorted(set().union(*(e.free_symbols for e in exprs)),key=str)
    return variables,[dict(zip(variables,vs))for vs in itertools.product((True,False),repeat=len(variables))]
def val(expr,row):return bool(expr.subs(row))
def show(row):return ', '.join(f'{v}={"V"if x else"F"}'for v,x in row.items())
def evaluation(expr,row):
    value=val(expr,row)
    task=C(f'Con {show(row)}, ¿qué valor tiene ${tex(expr)}$?',['Verdadera.','Falsa.','No puede determinarse con esos valores.','La fórmula carece de sintaxis lógica.'],0 if value else 1,
           ['Sustituimos los valores dados de todas las variables.',f'Aplicamos los conectores de la fórmula ${tex(expr)}$.',f'Con la asignación {show(row)}, la fórmula resulta {"verdadera"if value else"falsa"}.'])
    task['proof']=dict(type='evaluation',formula=str(expr),assignment={str(k):v for k,v in row.items()},value=value);return task

def count_true(expr,expected):
    variables,assignments=rows([expr]);n=sum(val(expr,x)for x in assignments);assert n==expected,(expr,n,expected)
    task=N(f'¿En cuántas asignaciones de sus {len(variables)} variables es verdadera ${tex(expr)}$?','La tabla completa incluye cada combinación de V y F una sola vez.',r'n_V='+str(n),expected,n,'filas');task['integerOnly']=True
    return task

def classify(expr):
    _,assignments=rows([expr]);values=[val(expr,x)for x in assignments];key=0 if all(values)else 1 if not any(values)else 2
    names=['Tautología.','Contradicción.','Contingencia.','Expresión sin valor lógico por no estar bien formada.']
    task=C(f'En lógica clásica bivalente, ¿cómo se clasifica ${tex(expr)}$?',names,key,
           ['Se consideran todas las asignaciones de sus variables.',f'La columna final contiene {sum(values)} valores V de {len(values)} filas.',f'La clasificación es {names[key].lower()}'])
    task['proof']=dict(type='classification',formula=str(expr),truthValues=values);return task

def equivalent(expr,options,context=''):
    _,assignments=rows([expr,*options]);matches=[all(val(expr,row)==val(o,row)for row in assignments)for o in options];assert sum(matches)==1,(expr,options,matches)
    key=matches.index(True)
    task=C(context+f'¿Cuál es lógicamente equivalente a ${tex(expr)}$?',['$'+tex(o)+'$'for o in options],key,
           ['La equivalencia exige igual valor en todas las asignaciones.',f'Comparamos las {len(assignments)} filas de las tablas completas.',f'La única alternativa que coincide en todas es ${tex(options[key])}$.'])
    task['proof']=dict(type='equivalence',formula=str(expr),candidates=list(map(str,options)),matches=matches);return task

def inference(premises,options,context=''):
    _,assignments=rows(premises+options);models=[row for row in assignments if all(val(x,row)for x in premises)]
    assert models,'Do not hide inconsistent premises in a basic inference exercise'
    matches=[all(val(o,row)for row in models)for o in options];assert sum(matches)==1,(premises,options,matches)
    key=matches.index(True)
    task=C(context+'Suponiendo verdaderas '+', '.join('$'+tex(x)+'$'for x in premises)+', ¿qué conclusión está garantizada?',['$'+tex(o)+'$'for o in options],key,
           ['Solo conservamos las asignaciones que satisfacen simultáneamente las premisas.','Las asignaciones compatibles son: '+'; '.join(show(x)for x in models)+'.',f'En todas las compatibles se cumple ${tex(options[key])}$; cada alternativa restante tiene un contraejemplo.'])
    task['proof']=dict(type='inference',premises=list(map(str,premises)),models=[{str(k):v for k,v in row.items()}for row in models],candidates=list(map(str,options)),matches=matches);return task

def consistency(premises):
    _,assignments=rows(premises);models=[x for x in assignments if all(val(e,x)for e in premises)]
    yes=bool(models)
    task=C('¿Es conjuntamente satisfacible el conjunto de premisas '+', '.join('$'+tex(e)+'$'for e in premises)+'?',['Sí, existe al menos una asignación que hace verdaderas todas.','No, ninguna asignación hace verdaderas todas.','Sí, porque basta que una sola premisa sea verdadera.','No se puede analizar con tablas de verdad.'],0 if yes else 1,
           ['La consistencia exige satisfacer todas las premisas a la vez.',('Una asignación compatible es '+show(models[0])+'.')if yes else 'La revisión de todas las asignaciones no encuentra un caso compatible.','El conjunto es '+('consistente.'if yes else'inconsistente.')])
    task['proof']=dict(type='consistency',premises=list(map(str,premises)),models=[{str(k):v for k,v in row.items()}for row in models]);return task

BANK={
'1.1':[
 C('¿Cuál es una proposición declarativa con valor de verdad definido?',['El número 8 es par.','Cierra la puerta.','¿Qué hora es?','Ojalá llueva.'],0,['Una proposición afirma algo que puede ser verdadero o falso.','La primera frase afirma una propiedad de un número.','Las otras son una orden, una pregunta y un deseo.']),
 C('¿Por qué «Abre el libro» no es una proposición en lógica declarativa?',['Es una orden y no una afirmación evaluable como V o F.','Porque contiene un verbo.','Porque es una oración corta.','Porque toda frase sobre libros es falsa.'],0,['Identificamos la función de la oración.','No afirma que un hecho se cumpla.','Da una instrucción; por eso no tiene el valor de verdad requerido.']),
 C('La afirmación «9 es primo» es…',['Una proposición falsa.','Una pregunta sin respuesta.','Una orden.','Una proposición verdadera.'],0,['Afirma una propiedad definida del número 9.','9 tiene el divisor 3 además de 1 y 9.','Es una proposición, aunque su valor sea F.']),
 C('Si x no tiene valor asignado ni se cuantifica, «x es mayor que 3» es…',['Un enunciado abierto.','Una tautología demostrada.','Una contradicción obligatoria.','Una orden.'],0,['El valor depende de x.','Por ejemplo, x=4 lo satisface y x=2 no.','Sin asignación ni cuantificador no queda una proposición cerrada.']),
 C('¿Qué forma representa «Estudio y practico», con p: estudio y q: practico?',[r'$p\land q$',r'$p\lor q$',r'$p\to q$',r'$\neg p$'],0,['Se afirman las dos acciones.','El conectivo «y» exige ambas verdaderas.','Se representa por la conjunción.']),
 C('En «Si estudio, entonces practico», el antecedente es…',['Estudio.','Practico.','Ambas frases a la vez.','La palabra entonces.'],0,['El antecedente sigue al «si».','El consecuente se introduce con «entonces».','La condición inicial es estudiar.']),
 C('Si p significa «El foco está encendido», su negación es…',['El foco no está encendido.','El foco está muy encendido.','El foco está encendido o apagado.','Si el foco está encendido, estudio.'],0,['La negación cambia V por F y F por V.','No añade una nueva condición ni una intensidad.','Niega exactamente la afirmación original.']),
 evaluation(And(p,q),{p:True,q:False}),evaluation(Or(p,q),{p:False,q:True}),evaluation(Not(p),{p:False}),
 C('En lógica proposicional clásica bivalente, una proposición cerrada recibe…',['Uno de dos valores: V o F.','Siempre V, por ser proposición.','Siempre F si es compuesta.','Un valor de intensidad emocional.'],0,['La bivalencia establece dos valores posibles.','Una proposición concreta no recibe ambos a la vez en una asignación.','Ser verdadera no es requisito para ser proposición.']),
],
'1.2':[
 C('Con p: Ana lee y q: Ana escribe, ¿cómo se formaliza «Ana lee si y solo si escribe»?',[r'$p\leftrightarrow q$',r'$p\lor q$',r'$p\land\neg q$',r'$\neg p$'],0,['«Si y solo si» impone ambas direcciones.','Se exige que p y q tengan igual valor.','La forma es el bicondicional.']),
 C('«O p o q, pero no ambas» corresponde a…',['Disyunción exclusiva.','Conjunción.','Condicional material.','Negación de q solamente.'],0,['El enunciado exige una alternativa verdadera.','Además excluye que se cumplan ambas.','Eso distingue la exclusiva de la inclusiva.']),
 evaluation(E(p,q),{p:False,q:False}),evaluation(Xor(p,q),{p:True,q:False}),
 C('Si p: estudio y q: trabajo, «No es cierto que estudio y trabajo» niega…',['La conjunción completa.','Solo la palabra estudio por obligación.','Solo la palabra trabajo por obligación.','Que exista cualquier persona.'],0,['La negación tiene alcance sobre toda la expresión.','No afirma por separado que ambas acciones sean falsas.','Basta que falle al menos una para negar la conjunción.']),
 evaluation(I(p,q),{p:True,q:False}),evaluation(I(q,p),{p:False,q:False}),
 C('La oración «p aunque q», tratada por su contenido veritativo básico, afirma…',['p y q.','p y no q.','Solo q.','Ni p ni q.'],0,['«Aunque» aporta un matiz de contraste.','En esta formalización se afirman p y q.','El contenido básico se modela como conjunción.']),
 C('Una oración compuesta puede tener valor F porque…',['El valor depende de sus componentes y de los conectores.','Toda proposición compuesta es falsa.','No puede contener negación.','Solo las preguntas son verdaderas.'],0,['Ser compuesta describe su estructura.','Los conectores fijan cómo se combinan los valores.','La estructura compuesta no fija por sí sola V o F.']),
 C('Al formalizar «si p, entonces q» como condicional material…',['Se representa una relación veritativa, sin demostrar una causa física.','Se demuestra que p causa físicamente q.','Se prohíbe que q ocurra sin p.','Se afirma necesariamente p.'],0,['La tabla del condicional excluye solo V→F.','No incorpora una explicación física del fenómeno.','Causalidad y condicional material no se identifican automáticamente.']),
 evaluation(Not(Or(p,q)),{p:False,q:False}),
],
'2.1':[
 evaluation(And(p,Not(q)),{p:True,q:False}),evaluation(Or(Not(p),q),{p:True,q:False}),
 evaluation(I(p,And(q,r)),{p:True,q:True,r:False}),evaluation(E(p,q),{p:True,q:False}),
 count_true(And(p,q),1),count_true(Or(p,q),3),count_true(I(p,q),3),count_true(E(p,q),2),count_true(Xor(p,q),2),
 classify(Or(p,Not(p),evaluate=False)),classify(And(p,Not(p),evaluate=False)),
],
'2.2':[
 count_true(And(p,Or(q,r)),3),count_true(Or(p,And(q,r)),5),
 classify(And(p,I(p,q))),evaluation(I(Or(p,q),r),{p:True,q:False,r:False}),
 count_true(I(And(p,q),r),7),count_true(E(p,And(q,r)),4),
 classify(I(And(p,q),p)),classify(And(p,Not(p),q,evaluate=False)),
 evaluation(Xor(p,q,r),{p:True,q:True,r:True}),
 C('Una tabla completa de tres variables distintas tiene…',['8 filas.','3 filas.','6 filas.','9 filas.'],0,['Cada variable puede tomar dos valores.','Las elecciones son independientes.','El total es 2³=8 combinaciones.']),
 C('Si una fórmula tiene filas V y también filas F, se clasifica como…',['Contingencia.','Tautología.','Contradicción.','Una pregunta sin valor lógico.'],0,['La tautología no tiene filas F.','La contradicción no tiene filas V.','La presencia de ambos valores define una contingencia.']),
],
'3.1':[
 equivalent(Not(And(p,q)),[Or(Not(p),Not(q)),And(Not(p),Not(q)),And(p,q),Or(p,q)]),
 equivalent(Not(Or(p,q)),[And(Not(p),Not(q)),Or(Not(p),Not(q)),And(p,q),Or(p,q)]),
 equivalent(I(p,q),[Or(Not(p),q),Or(p,Not(q)),And(p,q),E(p,q)]),
 equivalent(Not(I(p,q)),[And(p,Not(q)),And(Not(p),q),Or(p,q),I(p,q)]),
 equivalent(Not(Not(p),evaluate=False),[p,Not(p),And(p,q),Or(p,q)]),
 equivalent(And(p,Or(p,q)),[p,q,And(p,q),Or(p,q)]),
 equivalent(Or(p,And(p,q)),[p,q,And(p,q),Or(p,q)]),
 equivalent(And(p,Or(q,r)),[Or(And(p,q),And(p,r)),And(Or(p,q),r),Or(p,q,r),And(p,q,r)]),
 equivalent(Or(p,And(q,r)),[And(Or(p,q),Or(p,r)),Or(And(p,q),r),And(p,q,r),Or(p,q,r)]),
 equivalent(I(p,q),[I(Not(q),Not(p)),I(q,p),I(Not(p),Not(q)),And(p,q)],'Usa la contraposición. '),
 equivalent(E(p,q),[And(I(p,q),I(q,p)),Or(p,q),And(p,q),Xor(p,q)]),
],
'3.2':[
 equivalent(Not(E(p,q)),[Xor(p,q),E(p,q),I(p,q),And(p,q)]),
 equivalent(Xor(p,q),[And(Or(p,q),Not(And(p,q))),Or(p,q),And(p,q),I(p,q)]),
 equivalent(I(And(p,q),r),[I(p,I(q,r)),And(p,I(q,r)),I(r,And(p,q)),Or(p,q,r)]),
 equivalent(I(p,I(q,r)),[I(And(p,q),r),And(I(p,q),r),I(r,p),And(p,q,r)]),
 equivalent(Not(Or(p,And(q,r))),[And(Not(p),Or(Not(q),Not(r))),Or(Not(p),And(Not(q),Not(r))),And(p,q,r),Or(p,q,r)]),
 equivalent(Or(And(p,q),And(p,Not(q))),[p,q,Not(p),And(p,q)]),
 equivalent(And(Or(p,q),Or(p,Not(q))),[p,q,Not(p),Or(p,q)]),
 equivalent(I(Not(p),Not(q)),[I(q,p),I(p,q),And(p,q),Or(p,q)]),
 equivalent(Not(I(q,p)),[And(q,Not(p)),And(p,Not(q)),I(p,q),E(p,q)]),
 equivalent(E(p,Not(q)),[Xor(p,q),E(p,q),I(p,q),And(p,q)]),
 C('Para refutar una equivalencia lógica entre A y B basta…',['Una asignación donde sus valores sean distintos.','Una asignación donde ambas sean verdaderas.','Que tengan diferente número de símbolos.','Que se escriban con letras distintas.'],0,['La equivalencia exige coincidencia en todas las filas.','Una sola discrepancia incumple esa exigencia.','Que coincidan en algunas filas no demuestra equivalencia.']),
],
}

BANK.update({
'4.1':[
 inference([I(p,q),p],[q,Not(q),And(p,Not(q)),Not(p)]),
 inference([I(p,q),Not(q)],[Not(p),p,q,Xor(p,q)]),
 inference([Or(p,q),Not(p)],[q,p,Not(q),And(p,q)]),
 inference([And(p,q)],[p,Not(p),Not(q),Not(And(p,q))]),
 inference([I(p,q),I(q,r)],[I(p,r),I(r,p),And(p,r),Not(r)]),
 inference([p,q],[And(p,q),Not(p),Not(q),Not(Or(p,q))]),
 inference([Not(Or(p,q))],[Not(p),p,q,Or(p,q)]),
 inference([Not(And(p,q)),p],[Not(q),q,Not(p),E(p,q)]),
 inference([E(p,q),p],[q,Not(q),Not(p),Xor(p,q)]),
 inference([Xor(p,q),p],[Not(q),q,Not(p),E(p,q)]),
 inference([I(p,q),I(q,r),p],[r,Not(r),Not(q),Not(p)]),
],
'4.2':[
 inference([I(p,q),Or(p,r),Not(q)],[r,p,q,Not(r)]),
 inference([I(p,r),I(q,r),Or(p,q)],[r,Not(r),And(p,q),Not(Or(p,q))]),
 inference([And(p,q)],[q,Not(q),Not(p),Not(And(p,q))]),
 inference([Or(p,q),Not(p)],[q,p,Not(q),And(p,q)]),
 inference([I(p,q),I(r,Not(q)),p],[Not(r),r,Not(q),Not(p)]),
 inference([I(p,And(q,r)),p],[And(q,r),Not(q),Not(r),Not(p)]),
 inference([I(Or(p,q),r),q],[r,Not(r),Not(q),And(p,Not(r))]),
 inference([E(p,q),Not(p)],[Not(q),q,p,Xor(p,q)]),
 inference([I(p,q),I(q,r),Not(r)],[Not(p),p,q,r]),
 inference([Or(p,q),I(p,r),Not(r)],[q,p,r,Not(q)]),
 inference([I(p,q),I(q,r),I(r,t),p],[t,Not(t),Not(r),Not(q)]),
],
})

def all_in(a,b):return a<=b
def none_in(a,b):return not(a&b)
def some_in(a,b):return bool(a&b)
def some_not(a,b):return bool(a-b)
AB=('Todos los A son B',lambda a,b,c:all_in(a,b))
BA=('Todos los B son A',lambda a,b,c:all_in(b,a))
BC=('Todos los B son C',lambda a,b,c:all_in(b,c))
AC=('Todos los A son C',lambda a,b,c:all_in(a,c))
CA=('Todos los C son A',lambda a,b,c:all_in(c,a))
CB=('Todos los C son B',lambda a,b,c:all_in(c,b))
NAB=('Ningún A es B',lambda a,b,c:none_in(a,b))
NBC=('Ningún B es C',lambda a,b,c:none_in(b,c))
NAC=('Ningún A es C',lambda a,b,c:none_in(a,c))
SAB=('Algún A es B',lambda a,b,c:some_in(a,b))
SBC=('Algún B es C',lambda a,b,c:some_in(b,c))
SAC=('Algún A es C',lambda a,b,c:some_in(a,c))
SA=('Existe algún A',lambda a,b,c:bool(a))
SB=('Existe algún B',lambda a,b,c:bool(b))
SC=('Existe algún C',lambda a,b,c:bool(c))
XAB=('Algún A no es B',lambda a,b,c:some_not(a,b))
XBA=('Algún B no es A',lambda a,b,c:some_not(b,a))
XAC=('Algún A no es C',lambda a,b,c:some_not(a,c))
XCA=('Algún C no es A',lambda a,b,c:some_not(c,a))
XBC=('Algún B no es C',lambda a,b,c:some_not(b,c))
XCB=('Algún C no es B',lambda a,b,c:some_not(c,b))

def categorical(premises,options):
    # Each of the eight membership regions is either empty or occupied.
    # Multiplicity cannot affect these universal/existential sentences.
    worlds=[]
    for mask in range(1,256):
        domain={i for i in range(8)if mask>>i&1}
        world=tuple({i for i in domain if i>>j&1}for j in range(3))
        if all(f(*world)for _,f in premises):worlds.append(world)
    assert worlds
    matches=[all(f(*world)for world in worlds)for _,f in options];assert sum(matches)==1,([x[0]for x in premises],matches)
    key=matches.index(True)
    task=C('En lógica de clases sin suponer existencia por una premisa universal, se sabe: '+'. '.join(x[0]for x in premises)+'. ¿Qué conclusión es necesaria?',[x[0]+'.'for x in options],key,
           ['Representamos A, B y C como clases; una universal puede ser cierta aunque su sujeto esté vacío.','Revisamos las inclusiones, exclusiones y los testigos cuya existencia afirman las premisas.',options[key][0]+'. Es la única alternativa que se mantiene en todos los casos compatibles.'])
    task['proof']=dict(type='categorical',premises=[x[0]for x in premises],candidates=[x[0]for x in options],compatibleRegionPatterns=len(worlds),matches=matches,
                       counterexamples={str(j):[sorted(z)for z in next(w for w in worlds if not options[j][1](*w))]for j in range(4)if j!=key})
    return task

BANK.update({
'5.1':[
 categorical([AB,BC],[AC,CA,SAC,XAB]),
 categorical([AB,NBC],[NAC,SAC,SA,CA]),
 categorical([SAB,BC],[SAC,AC,NAC,XAC]),
 categorical([SAB,NBC],[XAC,AC,NAB,NAC]),
 categorical([AB,SA],[SAB,NAB,BA,XAB]),
 categorical([NAB],[('Ningún B es A',lambda a,b,c:none_in(b,a)),SAB,BA,SB]),
 categorical([XAB],[SA,AB,BA,NAB]),
 categorical([AC,CA],[('A y C tienen exactamente los mismos miembros',lambda a,b,c:a==c),SA,SAC,XCA]),
 categorical([AB,BA],[('A y B tienen exactamente los mismos miembros',lambda a,b,c:a==b),SA,SAB,XAB]),
 categorical([SA,NAB],[XAB,SAB,AB,BA]),
 categorical([SAC,CB],[SAB,NAB,AB,BA]),
],
'5.2':[
 categorical([AB,BC,XCA],[XCA,CA,SAC,BA]),
 categorical([NAC,SAB],[XBC,BC,AC,SAC]),
 categorical([AB,BC],[AC,SA,SAB,CA]),
 categorical([SAB,BC],[SAC,AC,NAB,NAC]),
 categorical([AB,SAC],[SBC,NBC,CB,BA]),
 categorical([AB,XAC],[XBC,BC,NBC,CA]),
 categorical([AC,XAB],[XCB,CB,BA,NAC]),
 categorical([BC,XBA],[XCA,CA,AB,NBC]),
 categorical([AB,NBC,SC],[('Algún C no es A',lambda a,b,c:some_not(c,a)),SAC,CA,SA]),
 categorical([NAB,SBC],[XCA,CA,SAB,AB]),
 C('De «Todos los A son B», sin afirmar que exista algún A, ¿se sigue «Algún A es B»?',['No; la clase A podría estar vacía.','Sí; toda universal afirma existencia.','Sí; A y B siempre son idénticas.','No; la premisa significa que ningún A es B.'],0,['En la interpretación moderna, la universal expresa inclusión.','La inclusión puede cumplirse con A vacío.','Para concluir la particular hace falta una premisa de existencia apropiada.']),
],
'6.1':[
 consistency([p,Not(p)]),consistency([I(p,q),p,q]),consistency([Or(p,q),Not(p),Not(q)]),
 consistency([I(p,q),p,Not(q)]),consistency([E(p,q),p,Not(q)]),
 consistency([I(p,q),Not(p),q]),consistency([I(p,q),Not(p),Not(q)]),
 consistency([Or(p,q),Not(p)]),consistency([Xor(p,q),p,q]),
 consistency([Not(And(p,q)),p,Not(q)]),consistency([I(p,q),I(q,r),p,Not(r)]),
],
'6.2':[
 consistency([I(p,q),I(q,r),Not(r),Not(p)]),
 consistency([E(p,q),E(q,r),p,Not(r)]),
 consistency([I(p,q),I(q,p),Not(p),Not(q)]),
 consistency([Or(p,q),Or(Not(p),r),Not(q),Not(r)]),
 consistency([I(p,Not(q)),I(q,Not(p)),p]),
 consistency([Or(p,q),Or(p,Not(q)),Not(p)]),
 consistency([I(p,q),I(q,r),I(r,p),p]),
 consistency([E(p,q),Xor(q,r),Not(p),r]),
 C('Que cada premisa aislada sea satisfacible…',['No garantiza que todas sean satisfacibles simultáneamente.','Demuestra consistencia conjunta de cualquier conjunto.','Obliga a que todas sean tautologías.','Demuestra que todas son falsas.'],0,['p puede ser verdadera en una asignación.','No p puede ser verdadera en otra distinta.','El conjunto de ambas no tiene una asignación común; hay que revisar simultaneidad.']),
 C('Una asignación que hace verdaderas todas las premisas demuestra…',['Consistencia del conjunto.','Que todas las premisas son tautologías.','Que cualquier conclusión ajena es verdadera.','Que no puede existir otra asignación.'],0,['La consistencia pide al menos un caso compatible.','Un testigo basta para demostrar existencia.','No se concluye universalidad ni unicidad.']),
 C('Si las premisas admiten varios modelos, una conclusión se sigue de ellas solo cuando…',['Es verdadera en todos los modelos compatibles.','Es verdadera en al menos uno, sin más condiciones.','Tiene menos símbolos que las premisas.','Es falsa en todos esos modelos.'],0,['La consecuencia lógica preserva verdad en cada caso admitido.','Un modelo compatible con conclusión falsa sería un contraejemplo.','Por eso se exige verdad en todos los compatibles.']),
],
'7.1':[
 C('En «p es suficiente para q», la forma lógica es…',[r'$p\to q$',r'$q\to p$',r'$p\land\neg q$',r'$\neg p\land q$'],0,['La condición suficiente garantiza la otra.','Siempre que se cumple p debe cumplirse q.','La flecha parte de p.']),
 C('En «p es necesaria para q», la forma lógica es…',[r'$q\to p$',r'$p\to q$',r'$p\lor q$',r'$p\land\neg q$'],0,['Si q ocurre, p no puede faltar.','La necesidad de p se expresa tomando q como antecedente.','No se afirma por ello que p baste para q.']),
 C('La recíproca de «si p, entonces q» es…',[r'$q\to p$',r'$\neg q\to\neg p$',r'$p\land q$',r'$p\lor q$'],0,['La recíproca intercambia antecedente y consecuente.','No añade negaciones.','No es equivalente al original en general.']),
 C('La contraposición de «si p, entonces q» es…',[r'$\neg q\to\neg p$',r'$q\to p$',r'$\neg p\to\neg q$',r'$p\land q$'],0,['Se intercambian antecedente y consecuente.','Se niegan ambos.','Esta transformación sí conserva el valor del condicional material.']),
 evaluation(I(p,q),{p:False,q:True}),evaluation(I(p,q),{p:False,q:False}),
 inference([I(p,q),p],[q,Not(q),Not(p),Xor(p,q)],'Aplica la condición suficiente. '),
 inference([I(p,q),Not(q)],[Not(p),p,q,Or(p,q)],'Aplica la condición necesaria ausente. '),
 C('De «si estudio, apruebo» y «aprobé», ¿se sigue necesariamente «estudié»?',['No; afirmar el consecuente no justifica el antecedente.','Sí; es modus ponens.','Sí; los condicionales siempre son bicondicionales.','No; se deduce que no estudié.'],0,['El condicional solo impone que estudiar baste para aprobar.','Es compatible aprobar por otra vía en el modelo lógico.','Conocer el consecuente no fija el antecedente.']),
 C('De «si entreno, mejoro» y «no entrené», ¿se deduce necesariamente «no mejoré»?',['No; negar el antecedente no fija el consecuente.','Sí; es modus tollens.','Sí; mejorar exige entrenar por esa sola premisa.','No; se deduce necesariamente que mejoré.'],0,['La primera premisa no dice «solo si entreno».','Con antecedente falso, el condicional no impone un valor al consecuente.','No queda garantizada ni la mejora ni su negación.']),
 C('«Ingreso solo si me inscribo» expresa que inscribirme es…',['Condición necesaria para ingresar.','Condición suficiente para ingresar, sin más requisitos.','La negación de ingresar.','Un hecho ya cumplido obligatoriamente.'],0,['«Solo si» introduce una condición necesaria.','Si ingreso, la inscripción debe haberse cumplido.','No se garantiza ingresar por la sola inscripción.']),
],
'7.2':[
 equivalent(I(p,q),[Or(Not(p),q),And(p,q),Or(p,Not(q)),E(p,q)],'Elimina la flecha. '),
 equivalent(Not(I(p,q)),[And(p,Not(q)),And(Not(p),q),E(p,q),Or(p,q)],'Niega el condicional completo. '),
 equivalent(I(p,Not(q)),[I(q,Not(p)),I(Not(p),q),And(p,q),E(p,q)]),
 equivalent(I(Not(p),q),[Or(p,q),And(p,q),Or(Not(p),Not(q)),E(p,q)]),
 inference([I(p,q),I(q,r)],[I(p,r),I(r,p),And(p,r),Not(q)],'Encadena dos condiciones. '),
 inference([I(p,q),I(q,r),Not(r)],[Not(p),p,q,r],'Usa contraposición en cadena. '),
 inference([I(p,q),I(q,r),Or(p,t),Not(r)],[t,p,q,r]),
 C('Para que p sea necesaria y suficiente para q se requiere…',[r'$p\leftrightarrow q$',r'$p\to q$ solamente.',r'$p\lor q$ solamente.',r'$p\land\neg q$'],0,['Suficiencia de p exige p→q.','Necesidad de p exige q→p.','Las dos direcciones juntas forman el bicondicional.']),
 C('Un contraejemplo a p→q debe tener…',['p verdadera y q falsa.','p falsa y q verdadera.','p falsa y q falsa.','p y q verdaderas.'],0,['La tabla del condicional tiene una única combinación falsa.','La condición se cumple pero la consecuencia no.','Ese caso refuta la garantía expresada.']),
 C('Que p→q y q→p sean ambas verdaderas en una asignación significa…',['Que p y q tienen el mismo valor en esa asignación.','Que ambas son necesariamente verdaderas en toda asignación.','Que p y q tienen valores opuestos.','Que la fórmula completa es una contradicción.'],0,['Las dos direcciones excluyen los valores distintos.','Quedan los casos V,V y F,F.','Se afirma igualdad en esa asignación, no que ambas variables sean tautologías.']),
 count_true(And(I(p,q),I(q,r)),4),
],
})

_class_reasons={
'5.1':[
'La inclusión A⊆B y B⊆C encadena A⊆C, sin exigir que A tenga miembros.',
'Todo A está en B, y B no comparte miembros con C; ningún A puede estar en C.',
'El testigo que está en A y B también está en C por la inclusión B⊆C.',
'El testigo de A∩B no está en C, ya que B y C son disjuntos.',
'La existencia de un A, junto con A⊆B, da un testigo común de ambas clases.',
'Si A∩B es vacío, B∩A también lo es; intercambiar las clases conserva esta exclusión.',
'Un testigo en A que no pertenece a B es, en particular, un miembro de A.',
'Cada clase está incluida en la otra: no puede haber un miembro exclusivo de A o de C.',
'Las inclusiones recíprocas igualan los miembros de A y B; pueden ser ambas vacías.',
'Existe un A y ninguno pertenece a B; ese mismo testigo es un A que no es B.',
'El testigo de A∩C pertenece a B porque C⊆B; por tanto está en A∩B.',
],
'5.2':[
'La premisa particular ya proporciona un C fuera de A. Las inclusiones adicionales no lo eliminan.',
'El testigo común a A y B no pertenece a C, porque A y C son disjuntos; es un B fuera de C.',
'Al encadenar las dos inclusiones, cada A pertenece a C.',
'El testigo común a A y B pertenece también a C por B⊆C.',
'El testigo común a A y C es B por A⊆B; así pertenece a B∩C.',
'El A que no es C pertenece a B; es un testigo de B que no es C.',
'El A que no es B pertenece a C; es un testigo de C que no es B.',
'El B que no es A pertenece a C; es un testigo de C que no es A.',
'A⊆B y B∩C vacío implican A∩C vacío. El C cuya existencia se afirma no es A.',
'El testigo común de B y C no está en A porque A y B son disjuntos; es un C fuera de A.',
]}
for _level,_reasons in _class_reasons.items():
    for _i,_reason in enumerate(_reasons):BANK[_level][_i]['steps'][1]=_reason

def ordering(stem,names,predicate,query,answer,expected=None):
    models=[v for v in itertools.permutations(names)if predicate({n:v.index(n)for n in names})];assert models
    if query=='count':
        assert len(models)==expected,(stem,len(models),expected)
        task=N(stem+' ¿Cuántos órdenes cumplen las condiciones?','Enumeramos cada orden completo una sola vez y descartamos los que incumplen las restricciones.',r'n='+str(expected),expected,len(models),'órdenes');task['integerOnly']=True
    else:
        values={answer(v)for v in models};assert len(values)==1,(stem,values)
        result=next(iter(values));options=[result]+[x for x in names if x!=result][:3];assert len(options)==4
        task=C(stem+' '+query,[x+'.'for x in options],0,['Convertimos cada pista en una restricción de posición.','Un orden compatible es '+' – '.join(models[0])+f'; hay {len(models)} órdenes compatibles en total.',f'En todos ellos, la respuesta a lo preguntado es {result}.'])
    task['proof']=dict(type='ordering',models=[list(x)for x in models],expected=expected);return task

BANK.update({
'8.1':[
 ordering('De izquierda a derecha se ubican A, B, C y D sin empates. A está antes que B, B antes que C y C antes que D.','ABCD',lambda z:z['A']<z['B']<z['C']<z['D'],'¿Quién ocupa el primer lugar?',lambda v:v[0]),
 ordering('En una fila de A, B, C y D, D es primero. A está antes que B y B antes que C.','ABCD',lambda z:z['D']==0 and z['A']<z['B']<z['C'],'¿Quién es tercero?',lambda v:v[2]),
 ordering('A, B, C y D se ordenan del más alto al más bajo, sin empates. A supera a C, C supera a D y D supera a B.','ABCD',lambda z:z['A']<z['C']<z['D']<z['B'],'¿Quién es el más bajo?',lambda v:v[-1]),
 ordering('Cuatro pisos distintos se numeran de abajo hacia arriba. A vive sobre B; B sobre D; D sobre C.','ABCD',lambda z:z['A']>z['B']>z['D']>z['C'],'¿Quién vive en el piso inferior?',lambda v:v[0]),
 ordering('A, B, C y D forman una fila. A debe estar antes que B y C antes que D.','ABCD',lambda z:z['A']<z['B']and z['C']<z['D'],'count',None,6),
 ordering('A, B, C y D forman una fila. A debe ocupar el primer lugar.','ABCD',lambda z:z['A']==0,'count',None,6),
 ordering('A, B, C y D forman una fila. A y B deben ser vecinos, en cualquier orden.','ABCD',lambda z:abs(z['A']-z['B'])==1,'count',None,12),
 ordering('A, B, C y D forman una fila. A no puede ocupar ninguno de los extremos.','ABCD',lambda z:z['A']in(1,2),'count',None,12),
 ordering('A, B, C y D llegan sin empates. C es último, B llega antes que D y D antes que A.','ABCD',lambda z:z['C']==3 and z['B']<z['D']<z['A'],'¿Quién llega segundo?',lambda v:v[1]),
 ordering('A, B, C y D ocupan cuatro lugares. A está inmediatamente antes que B; C está primero.','ABCD',lambda z:z['B']==z['A']+1 and z['C']==0,'count',None,2),
 ordering('A, B, C y D forman una fila. A es primero y B último.','ABCD',lambda z:z['A']==0 and z['B']==3,'count',None,2),
],
'8.2':[
 ordering('Cinco personas A, B, C, D y E forman una fila. A va primero; E último; B antes que C y C antes que D.','ABCDE',lambda z:z['A']==0 and z['E']==4 and z['B']<z['C']<z['D'],'¿Quién ocupa el centro?',lambda v:v[2]),
 ordering('Cinco personas A, B, C, D y E forman una fila. A y E ocupan extremos en cualquier orden.','ABCDE',lambda z:{z['A'],z['E']}=={0,4},'count',None,12),
 ordering('En asientos numerados 1–4 en sentido horario, A ocupa el 1. B está frente a A y C inmediatamente después de B en sentido horario. D ocupa el restante.','ABCD',lambda z:z['A']==0 and z['B']==2 and z['C']==3,'¿Quién ocupa el asiento 2?',lambda v:v[1]),
 ordering('En cuatro asientos numerados en sentido horario, A ocupa el 1 y B el asiento opuesto. C y D ocupan los dos restantes.','ABCD',lambda z:z['A']==0 and z['B']==2,'count',None,2),
 ordering('Cinco personas A, B, C, D y E forman una fila. A está inmediatamente antes que B y B inmediatamente antes que C.','ABCDE',lambda z:z['B']==z['A']+1 and z['C']==z['B']+1,'count',None,6),
 ordering('Cinco personas A, B, C, D y E forman una fila. A está antes que B; B antes que C. D y E no tienen restricciones.','ABCDE',lambda z:z['A']<z['B']<z['C'],'count',None,20),
 ordering('Cuatro personas A, B, C y D reciben, de una en una, las tareas numeradas 1–4. A no recibe 1 ni 2; B recibe 1; C recibe 4.','ABCD',lambda z:z['A']not in(0,1)and z['B']==0 and z['C']==3,'¿Quién recibe la tarea 2?',lambda v:v[1]),
 ordering('A, B, C y D ocupan puestos 1–4 sin repetir. A ocupa un puesto menor que B; B es inmediatamente anterior a C; D ocupa el 1.','ABCD',lambda z:z['A']<z['B']and z['C']==z['B']+1 and z['D']==0,'¿Quién ocupa el puesto 4?',lambda v:v[3]),
 ordering('A, B, C y D forman una fila. A y B no pueden ser vecinos.','ABCD',lambda z:abs(z['A']-z['B'])!=1,'count',None,12),
 ordering('A, B, C, D y E forman una fila. A es primero, B segundo y E último.','ABCDE',lambda z:z['A']==0 and z['B']==1 and z['E']==4,'count',None,2),
 ordering('Cinco procesos A, B, C, D y E ocurren una vez, sin simultaneidad. D precede a A; A precede a E; E precede a B; B precede a C.','ABCDE',lambda z:z['D']<z['A']<z['E']<z['B']<z['C'],'¿Cuál ocurre tercero?',lambda v:v[2]),
],
})

def fallacy(stem,answer,distractors,reason,correction):
    return C(stem,[answer]+distractors,0,['Identificamos las razones realmente ofrecidas para la conclusión.',reason,correction])

BANK.update({
'9.1':[
 fallacy('«Tu propuesta es falsa porque eres antipático». ¿Qué defecto presenta?','Ataque personal en lugar de evaluar la propuesta.',['Modus ponens válido.','Una definición matemática.','Un contraejemplo al contenido de la propuesta.'],'La antipatía no demuestra que la afirmación sea falsa.','Debe examinarse la propuesta y sus pruebas.'),
 fallacy('«Todos lo creen, así que necesariamente es verdadero». ¿Qué se usa indebidamente como prueba?','La popularidad de la creencia.',['Una contradicción formal.','Una medición independiente.','Una deducción a partir de una definición.'],'Que una idea sea compartida no garantiza su verdad.','Hace falta evidencia pertinente al contenido.'),
 fallacy('«Vi dos buses retrasados; todos los buses del país llegan tarde». ¿Cuál es el salto injustificado?','Generalizar desde una muestra insuficiente.',['Aplicar una equivalencia lógica.','Mostrar un censo completo.','Demostrar que ningún bus se retrasa.'],'Dos casos no representan por sí solos a todos los buses del país.','La conclusión necesita información sobre una muestra adecuada y sus límites.'),
 fallacy('«Usé un lápiz nuevo y aprobé; el lápiz fue la causa». ¿Qué falta?','Evidencia que establezca causalidad.',['Que un hecho haya ocurrido después del otro.','La mera existencia del lápiz.','Una repetición literal de la conclusión.'],'La secuencia temporal no prueba que el primer hecho produzca el segundo.','Habría que descartar otras explicaciones y aportar evidencia causal.'),
 fallacy('«O apoyas este plan exacto o no te importa estudiar». ¿Qué recurso defectuoso aparece?','Un falso dilema.',['Una enumeración probada de todas las opciones.','Una conjunción verdadera por definición.','Una ley de equivalencia.'],'Se excluyen otras posturas posibles sin justificarlas.','Puede importar estudiar y preferirse otro plan.'),
 fallacy('«Hay que aceptar la regla porque es correcta; es correcta porque hay que aceptarla». ¿Qué defecto hay?','Razonamiento circular.',['Un contraejemplo válido.','Una prueba experimental independiente.','Una negación por De Morgan.'],'La razón repite lo que debía demostrar con otras palabras.','Se requiere una justificación independiente de la conclusión.'),
 fallacy('«Nadie demostró que la caja tenga una moneda; por tanto está vacía». ¿Qué se confunde?','Ausencia de prueba con prueba de ausencia.',['Una observación directa del interior.','Una disyunción exclusiva demostrada.','Una conclusión basada en un inventario completo.'],'No haber demostrado presencia no demuestra por sí solo ausencia.','Debe revisarse qué evidencia existe sobre el contenido.'),
 fallacy('«Si no aceptas mi argumento, te castigaré». ¿Qué sustituye a la justificación?','Una amenaza.',['Una inferencia válida.','Una definición del argumento.','Un dato que refuta sus premisas.'],'El posible castigo no hace verdaderas las premisas.','La fuerza no reemplaza razones pertinentes.'),
 fallacy('Una persona pide reducir tareas repetidas. Le responden: «Quieres eliminar todo estudio». ¿Qué distorsión ocurre?','Se caricaturiza la postura para atacarla.',['Se cita fielmente la petición.','Se demuestra una contradicción de la petición.','Se aplica modus tollens.'],'Reducir una parte no equivale a eliminar todo.','La respuesta debe evaluar lo que realmente se propuso.'),
 fallacy('«Un actor famoso afirma que esta demostración matemática es correcta; eso basta». ¿Qué falla?','La fama se usa como autoridad suficiente sin revisar la demostración.',['Se comprobaron todos los pasos.','Se aportó un contraejemplo numérico.','La validez depende de cuántos conocen al actor.'],'La celebridad por sí sola no acredita competencia ni corrección del argumento.','La demostración se evalúa por sus pasos y supuestos.'),
 fallacy('«Este banco es de madera; deposita dinero en él», usando primero banco como asiento. ¿Qué ambigüedad se aprovecha?','Cambio de significado de una misma palabra.',['Una equivalencia entre clases demostrada.','Una deducción válida sobre entidades iguales.','Una conjunción sin ambigüedad.'],'«Banco» cambia de asiento a entidad financiera.','La inferencia no conserva el mismo significado.'),
],
'9.2':[
 fallacy('«Si llueve, la pista se moja; la pista está mojada; entonces llovió». ¿Qué forma inválida aparece?','Afirmación del consecuente.',['Modus tollens.','Silogismo disyuntivo.','Simplificación de una conjunción.'],'La pista podría mojarse por otra causa compatible con la premisa.','El condicional no afirma que la lluvia sea la única condición suficiente.'),
 fallacy('«Si practico, mejoro; no practico; entonces no mejoro». ¿Qué forma inválida aparece?','Negación del antecedente.',['Modus ponens.','Contraposición válida.','Silogismo hipotético válido.'],'La premisa no excluye otras formas de mejorar.','No se deduce la negación del consecuente al negar solo el antecedente.'),
 fallacy('«Cada pieza es liviana; el conjunto de diez mil piezas será liviano». ¿Qué inferencia requiere justificación?','Trasladar una propiedad de cada parte al conjunto.',['Aplicar una suma de masas ya calculada.','Negar una conjunción.','Demostrar que ninguna pieza tiene masa.'],'La masa total depende de la suma de las masas de las piezas.','Una propiedad de cada parte no pasa automáticamente al conjunto.'),
 fallacy('«La institución es antigua; cada persona que trabaja allí es anciana». ¿Qué traslado es inválido?','Atribuir a cada miembro una propiedad de la institución.',['Una inferencia sobre una edad individual medida.','Una contraposición válida.','Una definición de mayoría de edad.'],'La antigüedad de la institución no fija la edad de sus miembros.','Se distingue una propiedad del conjunto de las propiedades individuales.'),
 fallacy('«La primera reforma causará inevitablemente otras cien y el desastre», sin justificar esos pasos. ¿Qué falta?','Sustento de la cadena de consecuencias.',['Una mera posibilidad imaginada de consecuencias.','Un nombre para cada reforma.','Una repetición de la palabra inevitable.'],'Se presentan como inevitables pasos que no han sido demostrados.','Una cadena causal necesita evidencia para sus conexiones.'),
 fallacy('«Mi respuesta es válida porque me esforcé mucho». ¿Qué se usa sin demostrar corrección?','Un hecho sobre el esfuerzo, no una prueba de la respuesta.',['Una comprobación de cada paso.','Un ejemplo que verifica la operación.','Una regla lógica aplicable a la conclusión.'],'El esfuerzo puede ser real y merecer reconocimiento, pero no garantiza el resultado.','Debe revisarse la respuesta por su contenido.'),
 fallacy('Se pregunta por el presupuesto y se responde atacando un asunto sin relación. ¿Qué ocurre?','Se desvía la discusión de la cuestión planteada.',['Se responde con datos del presupuesto.','Se formula una equivalencia.','Se aplica una condición suficiente.'],'La respuesta cambia el asunto sin resolver la pregunta.','La pertinencia de las razones se evalúa respecto de la conclusión discutida.'),
 fallacy('«Mi conclusión es verdadera porque no puedes demostrar que sea falsa». ¿Qué defecto hay?','Se usa la falta de refutación como demostración.',['Una prueba directa de la conclusión.','Un contraejemplo a la negación demostrado.','Una tabla de verdad completa.'],'No refutar una afirmación no equivale en general a probarla.','Quien afirma necesita razones suficientes para el alcance de su conclusión.'),
 fallacy('«Dos variables crecen juntas; una necesariamente causa la otra», sin más datos. ¿Qué salto se comete?','Confundir correlación con causalidad demostrada.',['Demostrar un mecanismo causal controlado.','Aplicar una identidad algebraica.','Negar una premisa universal.'],'Puede haber factores comunes u otras explicaciones.','La asociación observada no identifica por sí sola una causa.'),
 C('Al encontrar un defecto en el argumento que defiende una conclusión, ¿qué queda demostrado?',['Que ese argumento no la justifica; la conclusión podría ser verdadera por otras razones.','Que la conclusión es necesariamente falsa.','Que toda premisa es necesariamente falsa.','Que ningún argumento puede defenderla.'],0,['Se evalúa la conexión entre razones y conclusión.','Un argumento malo puede acompañar una conclusión verdadera.','Hay que separar falta de justificación y falsedad demostrada.']),
 C('¿Qué hace pertinente una objeción a un argumento?',['Que cuestione sus premisas, su inferencia o evidencia relacionada con la conclusión.','Que ataque cualquier rasgo personal del autor.','Que provoque más enojo.','Que cambie el tema para evitar responder.'],0,['La objeción debe tratar la justificación ofrecida.','Un dato puede ser verdadero pero irrelevante para esa conclusión.','La pertinencia depende de la relación con el argumento concreto.']),
],
})

def build(write=False):build_bank('raz_logico','rl',BANK,write)
if __name__=='__main__':
    ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
