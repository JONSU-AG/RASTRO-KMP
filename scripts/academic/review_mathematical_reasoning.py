"""Explicit mathematical reasoning exercises; preserved previously reviewed questions."""
import argparse,itertools,math
from review_reasoning_common import *
from review_physics_practice import pi,sqrt
x=s.symbols('x',real=True)
def recurrence(a,b,n):
    terms=[a,b]
    while len(terms)<n:terms.append(terms[-1]+terms[-2])
    return terms[n-1]
BANK={
'1.1':[
 N('Una sucesión aritmética empieza en 4 y aumenta 5 por paso. ¿Cuál es su sexto término?','Desde el primero hasta el sexto hay cinco incrementos.',r'a_6=4+(6-1)5',29,4+5*5),
 N('Una sucesión geométrica empieza en 3 y duplica cada término. ¿Cuál es el quinto?','Aplicamos cuatro multiplicaciones por la razón.',r'a_5=3(2)^{4}',48,3*2**4),
 N(r'La sucesión se define por $a_n=n^2+2n$, para n≥1. ¿Cuánto vale el cuarto término?','La regla está dada, por lo que sustituimos n=4.',r'a_4=4^2+2(4)',24,4**2+2*4),
 N(r'Se define $a_1=2$, $a_2=3$ y $a_{n+2}=a_{n+1}+a_n$. ¿Cuál es el sexto término?','Construimos cada término con los dos anteriores.',r'2,3,5,8,13,21',21,recurrence(2,3,6)),
 N('En la sucesión de cuadrados positivos 1, 4, 9, 16,…, definida por el cuadrado del índice, ¿cuál es el décimo término?','Usamos la regla explícita de cuadrados.',r'a_{10}=10^2',100,10**2),
 N('Se numeran doce casilleros del 1 al 12. ¿Cuántos dígitos se escriben en total?','Separamos nueve números de una cifra y tres de dos.',r'D=9+3(2)',15,sum(len(str(i))for i in range(1,13))),
 N('Un operador se define por a★b=2a+3b. ¿Cuánto vale 4★5?','El símbolo tiene la definición indicada, no la multiplicación usual.',r'4\star5=2(4)+3(5)',23,2*4+3*5),
 N('En una progresión aritmética, el tercer término es 11 y la diferencia es 4. ¿Cuál es el primero?','Retrocedemos dos incrementos.',r'a_1=11-2(4)',3,11-2*4),
 N('Las diferencias sucesivas de una sucesión se fijan en 3, 5, 7, 9,… . Si el primer término es 2, ¿cuál es el quinto?','Para llegar al quinto sumamos las cuatro primeras diferencias.',r'a_5=2+3+5+7+9',26,2+sum([3,5,7,9])),
 C('Conocer solo unos primeros términos, sin regla adicional,…',['No determina una única continuación entre todas las sucesiones posibles.','Demuestra siempre una única ley infinita.','Obliga a que la sucesión sea aritmética.','Obliga a que todos los términos siguientes sean cero.'],0,['Una lista finita admite distintas reglas compatibles.','Una conclusión única requiere restringir la familia o dar una recurrencia.','No se confunde un patrón plausible con una demostración de unicidad.']),
 C('En una progresión geométrica con primer término no nulo, la razón se obtiene…',['Dividiendo un término por su anterior, cuando este no es cero.','Restando siempre dos términos sucesivos.','Sumando los dos primeros.','Dividiendo el índice entre el término.'],0,['Cada término es el anterior multiplicado por la razón.','Si el anterior no es cero, despejamos mediante división.','La diferencia constante corresponde a otra familia: la aritmética.']),
],
'1.2':[
 N('¿Cuánto suman los enteros del 1 al 30 inclusive?','Emparejamos extremos y dividimos entre dos.',r'S=30(31)/2',465,sum(range(1,31))),
 N('Suma cinco términos de una progresión geométrica de primer término 2 y razón 3.','La suma es finita y contiene las potencias desde cero hasta cuatro.',r'S=2(1+3+9+27+81)',242,sum(2*3**i for i in range(5))),
 None,None,
 N('¿Cuál es la suma de los primeros ocho números impares positivos?','La suma de los primeros n impares es n².',r'S=8^2',64,sum(range(1,16,2))),
 N('¿Cuánto vale la suma de los cuadrados del 1 al 5?','Sumamos cada cuadrado, no elevamos la suma al cuadrado.',r'S=1+4+9+16+25',55,sum(i*i for i in range(1,6))),
 N(r'Se define $a_n=3n^2-n$. ¿Cuál es $a_5-a_4$?','Calculamos los dos términos antes de restarlos.',r'(3(5)^2-5)-(3(4)^2-4)=70-44',26,(3*25-5)-(3*16-4)),
 N('Un ahorro puramente matemático comienza en 7 unidades y aumenta 2 cada día, incluido un primer aporte de 7. ¿Cuánto se aporta en diez días?','La suma tiene diez términos aritméticos.',r'S=10[2(7)+9(2)]/2',160,sum(7+2*i for i in range(10))),
 N('Una progresión geométrica infinita tiene primer término 6 y razón 1/3. ¿Cuál es su suma?','La serie converge porque el valor absoluto de la razón es menor que uno.',r'S=6/(1-1/3)',9,R(6)/(1-R(1,3))),
 N('En la progresión aritmética 5, 8, 11,… de diferencia 3, ¿qué posición ocupa 50?','Igualamos el término general al valor indicado.',r'5+3(n-1)=50\Rightarrow n=16',16,R(50-5,3)+1),
 C('Para usar una suma geométrica infinita con razón real q se exige…',[r'$|q|<1$.',r'$q=2$ siempre.',r'$q>1$ siempre.',r'Que todos los índices sean negativos.'],0,['La expresión infinita necesita convergencia.','Las potencias de q tienden a cero cuando su valor absoluto es menor que uno.','La fórmula finita no necesita esa misma condición.']),
],
'2.1':[
 N('A precio unitario constante, 3 cuadernos cuestan 12 unidades monetarias. ¿Cuánto cuestan 7?','Primero calculamos el costo por cuaderno.',r'C=(12/3)7',28,R(12,3)*7,'unidades monetarias'),
 N('Seis trabajadores terminan una tarea en 10 días. Con igual rendimiento individual constante, ¿cuántos días necesitan 15 trabajadores?','Para la misma obra conservamos trabajadores por días.',r'd=6(10)/15',4,R(6*10,15),'días'),
 N('Un vehículo recorre 180 km en 3 h a rapidez constante. ¿Qué distancia recorre en 5 h con esa rapidez?','Hallamos la rapidez y multiplicamos por el nuevo tiempo.',r'd=(180/3)5',300,R(180,3)*5,'km'),
 N('Una tubería llena sola un depósito en 6 h y otra en 3 h. Ambas trabajan juntas con caudales constantes, sin pérdidas. ¿Cuánto tardan?','Se suman fracciones de depósito por hora.',r't=1/(1/6+1/3)',2,1/(R(1,6)+R(1,3)),'h'),
 N('Un mapa usa escala 1:50000. ¿A cuántos km corresponden 4 cm del mapa?','Convertimos la longitud real de cm a km.',r'd=4(50000)/100000',2,R(4*50000,100000),'km'),
 N('Una rueda de 20 dientes engrana externamente con otra de 40. Si la pequeña da 6 vueltas, ¿cuántas da la grande, en valor absoluto?','Los dientes que pasan por el contacto deben coincidir.',r'n=6(20)/40',3,R(6*20,40),'vueltas'),
 N('Una receta usa 300 g para 4 porciones iguales. Manteniendo proporciones, ¿cuántos gramos necesita para 10?','La masa es directamente proporcional al número de porciones.',r'm=300(10)/4',750,R(300*10,4),'g'),
 N('Para recorrer 240 km, un vehículo aumenta su rapidez constante de 60 a 80 km/h. ¿Cuántas horas tarda a 80 km/h?','Para la distancia fija dividimos entre la nueva rapidez.',r't=240/80',3,R(240,80),'h'),
 N('Dos figuras semejantes tienen razón de longitudes 3:1. ¿Cuál es la razón numérica de sus áreas en ese mismo orden?','Las áreas escalan con el cuadrado de la razón lineal.',r'k_A=3^2',9,3**2),
 C('Dos magnitudes positivas son inversamente proporcionales cuando…',['Su producto permanece constante.','Su suma es siempre cero.','Su cociente permanece constante.','Ambas crecen siempre con el mismo factor.'],0,['Si una se multiplica por k, la otra se divide por k.','La compensación conserva el producto.','Cociente constante corresponde a proporcionalidad directa.']),
 C('Para usar un modelo de trabajadores y días inversamente proporcionales debe suponerse…',['La misma obra y rendimiento constante por trabajador, sin interferencias adicionales.','Cualquier tarea sin importar su tamaño.','Que añadir personas siempre acelera sin límite cualquier proceso real.','Que el tiempo no depende del trabajo.'],0,['El producto trabajadores×días representa trabajo bajo el modelo.','Si cambia la tarea o la productividad, cambia esa relación.','Las hipótesis no se omiten al aplicar la regla.']),
],
'2.2':[
 N('Cuatro personas trabajando 6 h/día completan una obra en 5 días. Seis personas de igual rendimiento trabajan 4 h/día. ¿Cuántos días necesitan para la misma obra?','Conservamos personas×horas diarias×días.',r'd=4(6)(5)/[6(4)]',5,R(4*6*5,6*4),'días'),
 N('Un viaje recorre 60 km a 30 km/h y luego otros 60 km a 60 km/h. ¿Cuál es la rapidez media del recorrido completo?','La rapidez media divide distancia total entre tiempo total.',r'v=120/(60/30+60/60)',40,R(120)/(R(60,30)+R(60,60)),'km/h'),
 None,None,
 N('Una magnitud varía directamente con el cuadrado de x. Si vale 12 para x=2, ¿cuánto vale para x=5?','Primero obtenemos la constante de proporcionalidad.',r'y=(12/2^2)5^2',75,R(12,4)*25),
 N('Una bomba llena un tanque en 4 h y un desagüe lo vacía en 12 h con caudales constantes. Partiendo vacío y operando ambos, ¿cuánto tarda en llenarse?','Restamos el caudal de salida al de entrada.',r't=1/(1/4-1/12)',6,1/(R(1,4)-R(1,12)),'h'),
 N('Se reparten 90 unidades en razón 2:3:4. ¿Cuánto recibe la parte mayor?','Cada unidad de razón representa 90/9.',r'M=90(4)/(2+3+4)',40,R(90*4,9)),
 N('Se reparten 60 unidades de forma inversamente proporcional a 2 y 3. ¿Cuánto recibe la parte asociada a 2?','Las razones inversas 1/2:1/3 equivalen a 3:2.',r'A=60(3)/(3+2)',36,R(60*3,5)),
 N('Dos máquinas de igual rendimiento producen 80 piezas en 4 h. ¿Cuántas piezas producen tres máquinas en 5 h bajo el mismo modelo?','Calculamos producción por máquina y hora.',r'P=80(3)(5)/[2(4)]',150,R(80*3*5,2*4),'piezas'),
 N('En una ampliación semejante, una longitud se multiplica por 2. ¿Por cuánto se multiplica el volumen?','El volumen escala con el cubo del factor lineal.',r'k_V=2^3',8,2**3),
 C('Promediar aritméticamente dos rapideces da la rapidez media del viaje cuando…',['Se mantienen durante intervalos de tiempo iguales.','Se recorren siempre distancias iguales, cualquiera sea el tiempo.','Nunca se conocen los tiempos.','Hay una parada no contabilizada.'],0,['La rapidez media es distancia total sobre tiempo total.','Con tiempos iguales t, resulta (v₁t+v₂t)/(2t).','La media aritmética no vale en general para distancias iguales.']),
],
'3.1':[
 N('La suma de las edades actuales de Ana y Beto es 34 años. Ana tiene 6 años más. ¿Cuántos años tiene Beto?','La menor edad x cumple x+(x+6)=34.',r'2x+6=34\Rightarrow x=14',14,s.solve(2*x+6-34,x)[0],'años'),
 N('Una persona tiene hoy 18 años. ¿Cuántos tendrá dentro de 7 años?','El transcurso de siete años se suma a la edad actual.',r'E=18+7',25,18+7,'años'),
 N('Hoy una madre tiene 40 años y su hija 10. ¿Dentro de cuántos años la madre tendrá el doble que su hija?','Ambas edades aumentan el mismo número de años.',r'40+x=2(10+x)\Rightarrow x=20',20,s.solve(40+x-2*(10+x),x)[0],'años'),
 N('Un número más su doble suma 45. ¿Cuál es el número?','Representamos el número por x.',r'x+2x=45\Rightarrow x=15',15,s.solve(3*x-45,x)[0]),
 N('En un corral hay 12 animales, todos gallinas de dos patas o conejos de cuatro. Se cuentan 34 patas. ¿Cuántos conejos hay?','Cada conejo aporta dos patas más que una gallina.',r'c=(34-2(12))/2',5,R(34-2*12,2),'conejos'),
 N('Un número de dos cifras tiene decena 4 y unidad x. Su valor es 47. ¿Qué cifra es x?','La decena aporta 40.',r'40+x=47\Rightarrow x=7',7,47-40),
 N('A un número se le resta 5 y luego se duplica el resultado, obteniendo 26. ¿Cuál era el número?','Deshacemos las operaciones en orden inverso.',r'x=26/2+5',18,R(26,2)+5),
 N('En un aula, el triple de asistentes menos 8 es 43. ¿Cuántos asistentes hay?','Formamos y despejamos una ecuación lineal.',r'3x-8=43\Rightarrow x=17',17,s.solve(3*x-8-43,x)[0],'personas'),
 N('Dos enteros consecutivos suman 51. ¿Cuál es el menor?','El segundo entero es x+1.',r'x+(x+1)=51\Rightarrow x=25',25,s.solve(2*x+1-51,x)[0]),
 C('La diferencia entre las edades de dos personas, medida con el mismo criterio,…',['Se mantiene al sumarles el mismo tiempo transcurrido.','Siempre aumenta cada año.','Siempre se reduce a cero.','Es igual al cociente de edades.'],0,[r'Se comparan $a+t$ y $b+t$.','Al restar, los dos términos t se cancelan.','La razón entre las edades sí puede cambiar.']),
 C('Al traducir «el doble de un número aumentado en tres», una redacción ambigua debe…',['Precisarse antes de decidir entre 2x+3 y 2(x+3).','Interpretarse siempre como la expresión más larga.','Convertirse automáticamente en x².','Ignorarse porque ambas expresiones son iguales.'],0,['El alcance de «aumentado» puede cambiar la operación.','Los paréntesis distinguen las dos lecturas.','El enunciado debe indicar qué cantidad aumenta.']),
],
'3.2':[
 N('Hoy Carla tiene 12 años y Diego 36. ¿Dentro de cuántos años Diego tendrá el doble de la edad de Carla?','Aumentamos ambas edades por el mismo tiempo.',r'36+x=2(12+x)\Rightarrow x=12',12,s.solve(36+x-2*(12+x),x)[0],'años'),
 N('Hoy Elena tiene 30 años y Fabio 18. ¿Hace cuántos años Elena tenía el doble de la edad de Fabio?','Para retroceder t años, restamos t a ambas edades.',r'30-t=2(18-t)\Rightarrow t=6',6,s.solve(30-x-2*(18-x),x)[0],'años'),
 None,None,
 N('Tres personas tienen hoy 15, 20 y 25 años. ¿Cuál será la suma de sus edades dentro de 4 años?','Cada una de las tres edades aumenta cuatro.',r'S=15+20+25+3(4)',72,15+20+25+12,'años'),
 N('Un número de dos cifras tiene suma de cifras 9. Su decena supera a su unidad en 3. ¿Cuál es el número?','Resolvemos decena más unidad y su diferencia.',r'd=(9+3)/2=6;\quad u=3;\quad N=10d+u',63,10*R(9+3,2)+R(9-3,2)),
 N('Un número de dos cifras tiene decena 7 y unidad 2. ¿Cuánto disminuye al invertir sus cifras?','Calculamos el número inicial y el invertido.',r'72-27',45,72-27),
 N('Se compran 10 entradas: unas de 3 unidades monetarias y otras de 5. Se pagan 42 en total. ¿Cuántas entradas de 5 se compraron?','Cada entrada cara añade dos al costo mínimo de diez baratas.',r'n=(42-10(3))/(5-3)',6,R(42-30,2),'entradas'),
 N('La suma de dos números es 50 y su diferencia, mayor menos menor, es 14. ¿Cuál es el mayor?','Al sumar ambas ecuaciones se duplica el mayor.',r'M=(50+14)/2',32,R(50+14,2)),
 N(r'Para $x=3$, calcula la diferencia $5(x+2)-(5x+2)$.','Desarrollamos el paréntesis antes de restar la segunda expresión.',r'5(3+2)-(5(3)+2)=25-17',8,5*(3+2)-(5*3+2)),
 C('Una solución algebraica de un problema de edades debe comprobar…',['La ecuación y que las edades del momento descrito sean admisibles.','Solo que aparezca un número entero, ignorando el contexto.','Que todas las edades sean iguales.','Que el tiempo sea siempre negativo.'],0,['Una ecuación puede haberse planteado con un supuesto incorrecto.','Además, no se admiten edades negativas en el momento descrito.','Se sustituye el resultado en los datos originales.']),
],
}

BANK.update({
'4.1':[
 N('Un rectángulo mide 9 cm por 4 cm. ¿Cuál es su perímetro?','Sumamos dos lados de cada longitud.',r'P=2(9+4)',26,2*(9+4),'cm'),
 N('Un rectángulo mide 9 cm por 4 cm. ¿Cuál es su área?','Multiplicamos base por altura.',r'A=9(4)',36,9*4,r'cm^2'),
 N('Un triángulo tiene base 10 cm y altura perpendicular correspondiente de 7 cm. ¿Cuál es su área?','El área triangular es la mitad del rectángulo de igual base y altura.',r'A=10(7)/2',35,R(10*7,2),r'cm^2'),
 N('Un cuadrado tiene perímetro 28 cm. ¿Cuál es su área?','Primero dividimos el perímetro entre cuatro para obtener el lado.',r'l=28/4=7;\quad A=7^2',49,(R(28,4))**2,r'cm^2'),
 N('Un círculo tiene radio 3 cm. ¿Cuál es su área exacta?','Se usa el cuadrado del radio, no el diámetro.',r'A=\pi(3)^2',9*pi,pi*3**2,r'cm^2'),
 N('Dos cuadrados de lado 2 cm se unen por un lado completo sin superponerse. ¿Cuál es el perímetro exterior de la figura?','Los dos lados pegados dejan de formar parte de la frontera exterior.',r'P=2(8)-2(2)',12,2*8-4,'cm'),
 N('Un rectángulo de 12 cm por 8 cm se corta por una diagonal. ¿Qué área tiene cada uno de los dos triángulos?','La diagonal divide el rectángulo en dos regiones de igual área.',r'A=12(8)/2',48,R(12*8,2),r'cm^2'),
 N('Un cubo tiene arista 4 cm. ¿Cuál es su volumen?','El volumen multiplica las tres aristas perpendiculares.',r'V=4^3',64,4**3,r'cm^3'),
 N('Un cuadrado se divide en una cuadrícula de 2 filas y 3 columnas de celdas rectangulares. ¿Cuántos rectángulos alineados con la cuadrícula hay, de todos los tamaños?','Elegimos dos de las tres líneas horizontales y dos de las cuatro verticales.',r'N=\binom{3}{2}\binom{4}{2}',18,s.binomial(3,2)*s.binomial(4,2),'rectángulos'),
 C('Para usar la fórmula del área de un triángulo, la altura correspondiente debe…',['Ser perpendicular a la recta que contiene la base.','Ser cualquier lado inclinado.','Medir lo mismo que la base obligatoriamente.','Trazarse siempre dentro del triángulo.'],0,['La distancia a una recta se mide perpendicularmente.','Esa distancia es la altura relativa a la base.','En un triángulo obtuso puede quedar fuera de la región.']),
 C('Dos figuras con igual perímetro…',['Pueden tener áreas diferentes.','Tienen siempre la misma área.','Deben ser congruentes.','Deben ser círculos.'],0,['El perímetro mide frontera y el área mide superficie.','Un rectángulo 1×5 y otro 2×4 tienen perímetro 12.','Sus áreas son 5 y 8, lo que da un contraejemplo.']),
],
'4.2':[
 N('A la misma hora y sobre terreno horizontal, un poste vertical de 2 m proyecta sombra de 3 m. Otro poste vertical proyecta 12 m; los rayos solares se modelan paralelos. ¿Qué altura tiene el segundo?','Los triángulos formados son semejantes bajo las hipótesis dadas.',r'h/12=2/3\Rightarrow h=8',8,R(12*2,3),'m'),
 N('Una corona circular tiene radio exterior 6 cm e interior 4 cm. ¿Cuál es su área exacta?','Restamos áreas de los dos discos concéntricos.',r'A=\pi(6^2-4^2)',20*pi,pi*(36-16),r'cm^2'),
 None,None,
 N('Un semicírculo tiene radio 5 cm. ¿Cuánto mide su frontera completa, incluido el diámetro?','Sumamos el arco semicircular y el segmento diametral.',r'P=5\pi+2(5)',5*pi+10,pi*5+10,'cm'),
 N('Un triángulo tiene área 54 cm². Una mediana lo divide en dos triángulos. ¿Qué área tiene cada uno?','Ambos tienen la mitad de la base original y la misma altura.',r'A=54/2',27,R(54,2),r'cm^2'),
 N('Se pinta todo el exterior de un cubo y se divide en 27 cubitos iguales mediante una cuadrícula 3×3×3. ¿Cuántos cubitos tienen exactamente dos caras pintadas?','Son los interiores de las doce aristas, excluyendo vértices.',r'N=12(3-2)',12,12*(3-2),'cubitos'),
 N('Un prisma rectangular de 8 cm por 5 cm por 3 cm se llena hasta la mitad de su capacidad. ¿Qué volumen contiene?','Calculamos la mitad del volumen total.',r'V=8(5)(3)/2',60,R(8*5*3,2),r'cm^3'),
 N('Una cuadrícula de 3 filas y 3 columnas de celdas tiene cuatro líneas horizontales y cuatro verticales. ¿Cuántos rectángulos alineados hay en total?','Cada rectángulo queda determinado por dos líneas de cada dirección.',r'N=\binom{4}{2}^2',36,s.binomial(4,2)**2,'rectángulos'),
 N('Dos figuras semejantes tienen áreas 16 y 100 cm². ¿Cuál es la razón entre sus longitudes correspondientes, mayor entre menor?','La razón de áreas es el cuadrado de la razón lineal.',r'k=\sqrt{100/16}=5/2',R(5,2),sqrt(R(100,16))),
 C('Para sumar áreas de varias partes y obtener el área de su unión se necesita…',['Que no se superpongan, o descontar las intersecciones apropiadamente.','Que todas tengan igual perímetro.','Que ninguna tenga lados rectos.','Que las figuras usen colores distintos.'],0,['Un punto de superposición se contaría más de una vez en la suma.','Si las partes no se superponen, sus áreas se suman directamente.','En caso contrario se corrige el conteo de intersecciones.']),
],
'5.1':[
 N('Hay 4 camisas y 3 pantalones distintos. Se elige una camisa y un pantalón. ¿Cuántos conjuntos diferentes hay?','Las elecciones se combinan mediante el principio del producto.',r'N=4(3)',12,4*3,'conjuntos'),
 N('¿Cuántas filas distintas pueden formar cuatro personas diferentes?','Se asignan sucesivamente cuatro, tres, dos y una opciones.',r'N=4!=4(3)(2)(1)',24,math.factorial(4),'filas'),
 N('De cinco personas se elige un equipo de dos sin cargos distintos. ¿Cuántos equipos hay?','El orden dentro del equipo no cambia la selección.',r'N=\binom{5}{2}',10,s.binomial(5,2),'equipos'),
 N('De cinco personas se eligen presidente y secretario, sin repetir persona. ¿Cuántas asignaciones hay?','Los cargos son distintos, así que importa quién ocupa cada uno.',r'N=5(4)',20,5*4,'asignaciones'),
 N('Un código tiene dos letras: primero A, B o C y luego A, B o C. Se permite repetir. ¿Cuántos códigos hay?','Cada posición conserva tres posibilidades.',r'N=3^2',9,len(list(itertools.product('ABC',repeat=2))),'códigos'),
 N('Con las cifras 1, 2 y 3, sin repetir, ¿cuántos números de tres cifras se forman?','Todas las primeras cifras son no nulas.',r'N=3!',6,len(list(itertools.permutations('123'))),'números'),
 N('Con las cifras 0, 1 y 2, sin repetir, ¿cuántos números de tres cifras se forman?','La primera cifra no puede ser cero.',r'N=2(2)(1)',4,sum(v[0]!='0'for v in itertools.permutations('012')),'números'),
 N('Tres rutas conectan A con B y dos rutas conectan B con C. Para ir de A a C pasando por B, ¿cuántas combinaciones de rutas hay?','Cada ruta del primer tramo puede acompañarse con cada ruta del segundo.',r'N=3(2)',6,3*2,'recorridos'),
 N('Una biblioteca tiene 7 libros de historia y 5 de geografía, todos distintos y sin coincidencias entre grupos. Se elige un solo libro de cualquiera de los grupos. ¿Cuántas opciones hay?','Las alternativas pertenecen a conjuntos disjuntos.',r'N=7+5',12,7+5,'opciones'),
 C('Al elegir un comité sin cargos, intercambiar el orden de las mismas personas…',['No crea un comité nuevo.','Siempre duplica el comité.','Hace que desaparezca un miembro.','Cambia el tamaño del comité.'],0,['Un comité se identifica por sus integrantes.','La posición en una lista no asigna un cargo.','Por eso se usan combinaciones, no ordenaciones.']),
 C('El principio de suma se aplica directamente a dos conjuntos de alternativas cuando…',['Son disjuntos.','Siempre tienen todos sus elementos en común.','Cada uno contiene infinitas opciones por obligación.','El orden interno es circular.'],0,['Si una opción está en ambos conjuntos, se contaría dos veces.','La disjunción evita ese doble conteo.','Para conjuntos que se solapan se resta la intersección.']),
],
'5.2':[
 N('Cinco libros distintos se ordenan en fila. Dos libros específicos deben estar separados, no vecinos. ¿Cuántos órdenes hay?','Restamos al total los órdenes donde forman un bloque vecino.',r'N=5!-2(4!)',72,math.factorial(5)-2*math.factorial(4),'órdenes'),
 N('¿Cuántas ordenaciones distintas tienen las letras de MAMA?','Se divide por las repeticiones de cada letra.',r'N=4!/(2!2!)',6,len(set(itertools.permutations('MAMA'))),'ordenaciones'),
 None,None,
 N('Seis personas diferentes se sientan alrededor de una mesa redonda. Se consideran iguales los giros, pero no los reflejos. ¿Cuántos órdenes circulares hay?','Fijamos una persona para eliminar los giros equivalentes.',r'N=(6-1)!',120,math.factorial(5),'órdenes'),
 N('De ocho personas se elige un equipo de tres que debe incluir a Ana. ¿Cuántos equipos hay?','Ana ya ocupa un lugar; elegimos dos de las siete restantes.',r'N=\binom{7}{2}',21,s.binomial(7,2),'equipos'),
 N('Un grupo de 20 estudia inglés o francés: 12 inglés, 11 francés, todos estudian al menos uno. ¿Cuántos estudian ambos?','La unión cuenta una sola vez a quienes están en ambos grupos.',r'I=12+11-20',3,12+11-20,'personas'),
 N('Con las cifras 1, 2, 3 y 4, sin repetir, ¿cuántos números pares de tres cifras hay?','Hay dos opciones para la unidad par y luego tres y dos para las otras posiciones.',r'N=2(3)(2)',12,sum(int(''.join(v))%2==0 for v in itertools.permutations('1234',3)),'números'),
 N('Se colocan tres objetos distintos en tres cajas distintas, sin restricción de capacidad. ¿Cuántas distribuciones hay?','Cada objeto elige una de las tres cajas.',r'N=3^3',27,len(list(itertools.product(range(3),repeat=3))),'distribuciones'),
 N('Una contraseña binaria tiene cuatro posiciones. ¿Cuántas tienen exactamente dos unos?','Elegimos las dos posiciones de los unos.',r'N=\binom{4}{2}',6,sum(sum(v)==2 for v in itertools.product((0,1),repeat=4)),'contraseñas'),
 C('Si se identificaran también los reflejos en un problema circular, ¿podría usarse sin revisar el mismo conteo que solo identifica giros?',['No; la relación de equivalencia cambió y hay que revisar las simetrías.','Sí; reflejos y giros siempre son lo mismo.','Sí; el número de objetos deja de importar.','No; todo conteo circular pasa a cero.'],0,['El conteo depende de cuándo dos colocaciones se consideran iguales.','Identificar reflejos puede unir órdenes antes distintos.','Se revisan las simetrías, especialmente si hay repeticiones.']),
],
'6.1':[
 N('Se lanza un dado equilibrado de seis caras numeradas del 1 al 6. ¿Cuál es la probabilidad de obtener un número par?','Hay tres pares entre seis resultados equiprobables.',r'P=3/6',R(1,2),R(3,6)),
 N('Se lanza un dado equilibrado del 1 al 6. ¿Cuál es la probabilidad de obtener más de 4?','Los favorables son 5 y 6.',r'P=2/6',R(1,3),R(2,6)),
 N('Se lanzan dos monedas equilibradas e independientes. ¿Cuál es la probabilidad de dos caras?','Multiplicamos las probabilidades por independencia.',r'P=(1/2)(1/2)',R(1,4),R(1,2)**2),
 N('Una bolsa tiene 4 bolas rojas y 6 azules, distinguibles y elegidas uniformemente. ¿Cuál es la probabilidad de roja en una extracción?','Dividimos las cuatro favorables entre las diez bolas.',r'P=4/10',R(2,5),R(4,10)),
 N('Un evento tiene probabilidad 0.35. ¿Cuál es la probabilidad de su complemento?','El evento y su complemento suman uno.',r'P(A^c)=1-0.35',R(13,20),1-R(35,100)),
 N('Se elige uniformemente un entero del 1 al 12 inclusive. ¿Cuál es la probabilidad de que sea múltiplo de 3?','Los favorables son 3, 6, 9 y 12.',r'P=4/12',R(1,3),R(sum(i%3==0 for i in range(1,13)),12)),
 N('En un dado equilibrado del 1 al 6, ¿cuál es la probabilidad de obtener 1 o 6?','Los dos resultados son distintos e incompatibles en un lanzamiento.',r'P=1/6+1/6',R(1,3),R(1,6)+R(1,6)),
 N('Una ruleta ideal tiene ocho sectores iguales, tres verdes y cinco blancos. ¿Cuál es la probabilidad de no obtener verde?','Los cinco sectores blancos componen el complemento.',r'P=5/8',R(5,8),R(5,8)),
 N('Se lanzan dos dados equilibrados e independientes. ¿Cuál es la probabilidad de sumar 7?','Los pares ordenados favorables son seis entre treinta y seis.',r'P=6/36',R(1,6),R(sum(a+b==7 for a,b in itertools.product(range(1,7),repeat=2)),36)),
 C('Contar favorables y dividir entre posibles es válido directamente cuando…',['Los resultados elementales contados son equiprobables.','Todos los eventos tienen la misma cantidad de letras.','Los resultados nunca pueden repetirse.','No se conoce el espacio de resultados.'],0,['El cociente simple asigna el mismo peso a cada resultado contado.','Si los pesos difieren, se suman sus probabilidades específicas.','Por eso la equiprobabilidad debe estar justificada.']),
 C('Dos eventos incompatibles con probabilidad positiva…',['No son independientes.','Siempre son independientes.','Deben ocurrir juntos.','Tienen intersección de probabilidad uno.'],0,['Su intersección tiene probabilidad cero.','Si fueran independientes, sería el producto de dos números positivos.','Ese producto no es cero: las condiciones no coinciden.']),
],
'6.2':[
 N('Una bolsa contiene 3 bolas rojas y 2 azules. Se extraen dos sin reemplazo, de forma uniforme. ¿Cuál es la probabilidad de dos rojas?','La segunda extracción se realiza con una bola roja menos.',r'P=(3/5)(2/4)',R(3,10),R(3,5)*R(2,4)),
 N('Una bolsa contiene 3 bolas rojas y 2 azules. Se extraen dos con reemplazo y mezcla uniforme tras cada extracción. ¿Cuál es la probabilidad de dos rojas?','El reemplazo conserva la proporción para la segunda extracción.',r'P=(3/5)^2',R(9,25),R(3,5)**2),
 None,None,
 N('Se lanza un dado equilibrado del 1 al 6. Sabiendo que el resultado es par, ¿cuál es la probabilidad de obtener 6?','El espacio condicionado contiene 2, 4 y 6, equiprobables.',r'P(6\mid par)=1/3',R(1,3),R(1,3)),
 N('En un grupo de 30, 18 estudian inglés, 12 francés y 5 ambos. Elegida una persona uniformemente, ¿cuál es la probabilidad de que estudie al menos uno de esos idiomas?','La unión resta la intersección contada dos veces.',r'P=(18+12-5)/30',R(5,6),R(18+12-5,30)),
 N('Un evento B tiene probabilidad 0.5 y la intersección A con B tiene probabilidad 0.2. ¿Cuál es la probabilidad de A dado B?','Dividimos la intersección por la probabilidad positiva de B.',r'P(A\mid B)=0.2/0.5',R(2,5),R(2,10)/R(5,10)),
 N('Los eventos A y B son independientes con probabilidades 1/3 y 3/4. ¿Cuál es la probabilidad de su intersección?','La independencia permite multiplicar.',r'P(A\cap B)=(1/3)(3/4)',R(1,4),R(1,3)*R(3,4)),
 N('Dos urnas se eligen con igual probabilidad. La primera tiene 3 rojas y 1 azul; la segunda 1 roja y 3 azules. Se extrae uniformemente una bola y resulta roja. ¿Cuál es la probabilidad de haber elegido la primera urna?','Comparamos la contribución roja de la primera urna con la roja total.',r'P(U_1\mid R)=\frac{(1/2)(3/4)}{(1/2)(3/4)+(1/2)(1/4)}',R(3,4),(R(1,2)*R(3,4))/(R(1,2)*R(3,4)+R(1,2)*R(1,4))),
 N('Se lanzan cuatro monedas equilibradas e independientes. ¿Cuál es la probabilidad de exactamente una cara?','Elegimos una de cuatro posiciones para la cara.',r'P=\binom{4}{1}(1/2)^4',R(1,4),s.binomial(4,1)*R(1,2)**4),
 C('En la fórmula elemental P(A dado B)=P(A∩B)/P(B), se necesita…',['Que P(B) sea positiva.','Que P(B) sea cero.','Que A y B sean necesariamente independientes.','Que A y B sean necesariamente incompatibles.'],0,['Se divide entre la probabilidad del evento condicionante.','La división no está definida si ese denominador es cero.','La fórmula no exige independencia.']),
],
'7.1':[
 N('Para los datos 3, 5, 7 y 9, ¿cuál es la media aritmética?','Sumamos todos y dividimos entre el número de datos.',r'\bar x=(3+5+7+9)/4',6,R(3+5+7+9,4)),
 N('Para los datos ordenados 2, 4, 8, 10 y 13, ¿cuál es la mediana?','Con cinco datos, el central es el tercero.',r'Me=x_{(3)}=8',8,sorted([2,4,8,10,13])[2]),
 N('Para 1, 3, 3, 4 y 7, ¿cuál es la moda?','Buscamos el valor de mayor frecuencia.',r'f(3)=2>f(1)=f(4)=f(7)=1',3,max(set([1,3,3,4,7]),key=[1,3,3,4,7].count)),
 N('Para los datos 4, 6, 11 y 15, ¿cuál es el rango?','Restamos el mínimo al máximo.',r'R=15-4',11,max([4,6,11,15])-min([4,6,11,15])),
 N('Cuatro datos tienen media 7. ¿Cuál es su suma?','Despejamos suma a partir de la definición de media.',r'S=4(7)',28,4*7),
 N('En un grupo de 40, 10 eligen la opción A. ¿Cuál es la frecuencia relativa de A como fracción?','La frecuencia relativa divide casos de la categoría entre total.',r'h_A=10/40',R(1,4),R(10,40)),
 N('Una nota 12 pesa 1 y otra 18 pesa 2. ¿Cuál es la media ponderada?','Se divide la suma ponderada entre la suma de pesos.',r'\bar x=(12+2(18))/(1+2)',16,R(12+2*18,3)),
 N('Para los datos ordenados 2, 4, 8 y 14, ¿cuál es la mediana?','Con cuatro datos promediamos los dos centrales.',r'Me=(4+8)/2',6,R(4+8,2)),
 N('Una tabla registra los valores 1, 2 y 3 con frecuencias 2, 3 y 5. ¿Cuántos datos registra?','El total es la suma de frecuencias absolutas.',r'N=2+3+5',10,2+3+5),
 C('Una media de un conjunto numérico finito no vacío siempre está…',['Entre el mínimo y el máximo, incluidos.','Por encima de todo dato.','Por debajo de todo dato.','Exactamente en uno de los datos por obligación.'],0,['Cada dato está entre los extremos.','Sumar y dividir entre la cantidad positiva conserva ese intervalo.','La media puede no coincidir con ningún dato.']),
 C('Si un conjunto tiene dos valores con la misma frecuencia máxima, se describe como…',['Bimodal.','Sin datos.','De varianza obligatoriamente cero.','De media necesariamente cero.'],0,['La moda corresponde a la frecuencia máxima.','Dos valores comparten esa frecuencia.','La cantidad de modas no fija media ni dispersión.']),
],
'7.2':[
 N('Los datos 2, 4 y 6 se tratan como población completa. ¿Cuál es su varianza poblacional?','Dividimos la suma de desviaciones cuadradas entre N=3.',r'\mu=4;\quad \sigma^2=[(2-4)^2+(4-4)^2+(6-4)^2]/3',R(8,3),sum((v-4)**2 for v in [2,4,6])/s.Integer(3)),
 N('Los datos 2, 4 y 6 se tratan como muestra. ¿Cuál es la varianza muestral corregida?','La corrección usa el denominador n−1=2.',r's^2=[(2-4)^2+(4-4)^2+(6-4)^2]/(3-1)',4,R(8,2)),
 None,None,
 N('En una población, todos los valores aumentan 5 unidades. ¿En cuánto aumenta su media?','El mismo desplazamiento se suma al promedio.',r'\mu_{nuevo}=\mu+5',5,5),
 N('Una población tiene varianza 3. Todos sus datos se multiplican por 2. ¿Cuál es la nueva varianza?','La varianza se multiplica por el cuadrado del factor.',r'\sigma_{nuevo}^2=2^2(3)',12,2**2*3),
 N('Una tabla agrupada tiene marcas de clase 5 y 15, con frecuencias 2 y 6. ¿Cuál es la media estimada mediante esas marcas?','Usamos una media ponderada de los puntos medios; es una estimación.',r'\bar x_{est}=[5(2)+15(6)]/(2+6)',R(25,2),R(5*2+15*6,8)),
 N('Para los datos ordenados 1, 3, 5, 7, 9 y 11, define Q1 como la mediana de la mitad inferior de tres datos. ¿Cuánto vale Q1?','La convención indicada toma la mediana de 1, 3 y 5.',r'Q_1=3',3,sorted([1,3,5])[1]),
 N('Una categoría tiene frecuencia 9 en una muestra de 30. ¿Qué porcentaje representa?','Multiplicamos la frecuencia relativa por cien.',r'p=(9/30)100',30,R(9,30)*100,r'\%'),
 N('El promedio de 6 datos es 10. Se añade el dato 17. ¿Cuál es la nueva media?','Reconstruimos la suma anterior y actualizamos suma y cantidad.',r'\bar x=(6(10)+17)/7',11,R(60+17,7)),
 C('La correlación entre dos variables observadas…',['No demuestra por sí sola una relación causal.','Prueba siempre que una causa la otra.','Obliga a que sus medias sean iguales.','Impide la existencia de otras variables relacionadas.'],0,['La correlación describe una asociación según el modelo.','Podría haber variables comunes u otras explicaciones.','La causalidad exige información adicional.']),
],
})

for _level,_tasks in BANK.items():
    for _task in _tasks:
        if _task is None or 'answer'not in _task:continue
        if int(_level.split('.')[0])==6:
            _task['bounds']=(0,1);_task['fractional']=True
        elif s.sympify(_task['answer']).is_integer and _task['unit']not in('cm','cm^2','cm^3','m','km','h','g','km/h'):
            _task['integerOnly']=True
        if (_level=='7.1'and 'como fracción'in _task['stem'])or(_level=='7.2'and 'varianza poblacional'in _task['stem']):
            _task['fractional']=True

def build(write=False):build_bank('raz_matematico','rm',BANK,write)
if __name__=='__main__':
    ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
