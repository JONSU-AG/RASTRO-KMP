"""Explicit arithmetic practice; only pending resource levels, no runtime generator."""
from pathlib import Path
import json,shutil,argparse,hashlib,itertools
from review_physics_practice import N,C,R,pi,sqrt,s,choices,label,ROOT
BANK={
'2.1':[
 N('En la división euclidiana de 47 entre 6, ¿cuál es el cociente por defecto?','El cociente entero deja un resto no negativo menor que el divisor.',r'47=6(7)+5',7,47//6),
 N('En la división euclidiana de 47 entre 6, ¿cuál es el resto?','Restamos divisor por cociente.',r'r=47-6(7)',5,47%6),
 N('Un dividendo tiene divisor 8, cociente 5 y resto 3. ¿Cuál es el dividendo?','Reconstruimos D=dq+r.',r'D=8(5)+3',43,8*5+3),
 N('¿Cuál es el mayor resto posible al dividir un natural entre 9?','El resto es menor que el divisor positivo.',r'0\le r<9\Rightarrow r_{max}=8',8,9-1),
 N('¿Cuál es el complemento aritmético de 347 respecto de 1000?','Restamos el número de la potencia de diez indicada.',r'CA=1000-347',653,1000-347),
 N('Un numeral de tres cifras en base 5 tiene todas sus cifras máximas. ¿Cuál es su valor decimal?','La mayor cifra de base 5 es 4.',r'444_5=4(25)+4(5)+4=5^3-1',124,int('444',5)),
 N('En una sustracción, el minuendo es 90 y el sustraendo 37. ¿Cuál es la diferencia?','La diferencia resta sustraendo al minuendo.',r'D=90-37',53,90-37),
 N('La suma de tres naturales consecutivos es 36. ¿Cuál es el central?','La suma es tres veces el número central.',r'(n-1)+n+(n+1)=3n=36',12,R(36,3)),
 N('¿Cuántos naturales de 10 a 20 inclusive hay?','Se incluyen ambos extremos.',r'n=20-10+1',11,len(range(10,21))),
 C('En D=dq+r, con divisor d positivo, el resto por defecto cumple…',[r'$0\le r<d$',r'$0<r\le d$',r'$r>d$ siempre.',r'$r<0$ siempre.'],0,['El cociente por defecto no puede sobrepasar el dividendo.','El resto queda no negativo.','Si alcanzara el divisor, podría aumentarse el cociente; por eso es menor que d.']),
 C('En numeración posicional de base b≥2, una cifra válida es…',['Cualquier entero positivo.','Un entero entre 0 y b−1.','Siempre mayor que b.','Siempre igual a b.'],1,['La base fija cuántas cifras distintas se usan.','Las cifras recorren de cero hasta una menos que la base.','Al alcanzar la base se realiza un acarreo a la siguiente posición.']),
],
'2.2':[
 N(r'Convierte $1011_2$ a base decimal.','Cada posición representa una potencia de dos.',r'1(8)+0(4)+1(2)+1',11,int('1011',2)),
 N(r'Convierte $23_5$ a decimal.','La posición izquierda representa unidades de cinco.',r'2(5)+3',13,int('23',5)),
 N(r'En $132_4$, ¿cuál es el valor decimal del numeral?','Sumamos cada cifra por la potencia de su posición.',r'1(4^2)+3(4)+2',30,int('132',4)),
 N('¿Cuántos números positivos de exactamente tres cifras hay en base 4?','La primera cifra tiene tres opciones y las otras cuatro cada una.',r'n=(4-1)4^2',48,(4-1)*4**2),
 N('¿Cuántos números decimales de dos cifras hay?','Se cuentan de 10 a 99 inclusive.',r'n=99-10+1',90,len(range(10,100))),
 N('¿Cuántas cifras decimales se escriben para numerar las páginas de 1 a 12?','Separar páginas de una y de dos cifras evita contar todas igual.',r'C=9(1)+3(2)',15,sum(len(str(i))for i in range(1,13))),
 N('¿Cuántas cifras se escriben al listar del 10 al 25 inclusive en decimal?','Todos tienen dos cifras y hay dieciséis números.',r'C=(25-10+1)2',32,sum(len(str(i))for i in range(10,26))),
 N('¿Cuántas cifras binarias tiene la representación de 16?','La potencia 2⁴ se escribe como uno seguido de cuatro ceros.',r'16=10000_2',5,len(bin(16)[2:])),
 N(r'El numeral $2a_5$ tiene valor decimal 13. ¿Qué cifra es a?','El 2 de la izquierda representa diez unidades decimales.',r'2(5)+a=13\Rightarrow a=3',3,13-2*5),
 C('La primera cifra de un numeral positivo de exactamente n cifras…',['Puede ser cero sin afectar la cantidad de cifras.','Debe ser distinta de cero.','Debe ser igual a la base.','Siempre es nueve.'],1,['Un cero inicial no aporta una nueva posición efectiva al numeral.','Se exige primera cifra no nula para contar exactamente n cifras.','Las demás posiciones sí pueden contener cero.']),
 C('El valor de una cifra en un sistema posicional depende de…',['Solo su forma, nunca de su posición.','Su valor numérico, la base y la posición que ocupa.','El color con que se escriba.','La cantidad de letras del nombre del número.'],1,['Cada posición tiene un peso dado por una potencia de la base.','La cifra multiplica ese peso.','La suma de todos esos aportes determina el numeral.']),
],
'3.1':[
 N('¿Cuántos divisores positivos tiene 12?','Factorizamos y contamos las elecciones de exponentes.',r'12=2^2\cdot3;\quad d(12)=(2+1)(1+1)',6,len(s.divisors(12))),
 N('¿Cuál es la suma de divisores positivos de 12?','Enumeramos todos los divisores positivos sin repetir.',r'1+2+3+4+6+12',28,sum(s.divisors(12))),
 N('¿Cuántos números primos hay entre 1 y 10 inclusive?','Un primo tiene exactamente dos divisores positivos.',r'2,3,5,7',4,len(list(s.primerange(1,11)))),
 N('¿Cuál es el menor primo mayor que 20?','Probamos los enteros siguientes hasta el primer primo.',r'21=3\cdot7;\ 22=2\cdot11;\ 23\text{ es primo}',23,s.nextprime(20)),
 N('El número decimal 4x2 debe ser divisible entre 3. ¿Cuál es la menor cifra x que lo permite?','La suma de cifras debe ser múltiplo de tres.',r'4+x+2=6+x\Rightarrow x_{min}=0',0,min(d for d in range(10)if (400+10*d+2)%3==0)),
 N('¿Cuál es el resto de 125 entre 9?','El resto coincide con el de su suma de cifras.',r'1+2+5=8',8,125%9),
 N('¿Cuántos múltiplos positivos de 5 no mayores que 40 hay?','Son los primeros ocho múltiplos positivos.',r'n=40/5',8,len([v for v in range(1,41)if v%5==0])),
 N('¿Cuánto vale el exponente de 2 en la factorización prima de 72?','Dividimos por dos hasta que quede un impar.',r'72=2^3\cdot3^2',3,s.factorint(72)[2]),
 N('¿Cuál es el producto de los primos distintos que dividen 60?','La factorización es 2²·3·5.',r'2\cdot3\cdot5',30,s.prod(s.factorint(60))),
 C('El número 1 es…',['Primo.','Compuesto.','Ni primo ni compuesto.','Un primo par.'],2,['Tiene un solo divisor positivo.','Un primo debe tener exactamente dos y un compuesto más de dos.','Por eso 1 no pertenece a ninguna de esas dos clases.']),
 C('Un número decimal es divisible entre 4 cuando…',['Su última cifra es par, sin más condiciones.','El número formado por sus dos últimas cifras es divisible entre 4.','La suma de sus cifras es cuatro.','Termina siempre en cuatro.'],1,['Las centenas y posiciones superiores son múltiplos de 4.','El resto depende solo de las dos últimas cifras.','Ese número de dos cifras debe ser divisible entre cuatro.']),
],
'3.2':[
 N('Calcula el MCD de 18 y 24.','Elegimos los factores primos comunes con menor exponente.',r'18=2\cdot3^2;\ 24=2^3\cdot3;\ MCD=2\cdot3',6,s.gcd(18,24)),
 N('Calcula el MCM de 18 y 24.','Usamos todos los factores primos con mayor exponente.',r'MCM=2^3\cdot3^2',72,s.ilcm(18,24)),
 N('Dos números positivos tienen producto 180 y MCD 3. ¿Cuál es su MCM?','Para dos enteros positivos, producto=MCD·MCM.',r'MCM=180/3',60,R(180,3)),
 N('¿Cuántos divisores positivos comunes tienen 24 y 36?','Los divisores comunes son los divisores de su MCD.',r'MCD=12;\quad d(12)=6',6,len(s.divisors(s.gcd(24,36)))),
 N('Dos luces destellan cada 6 y 8 segundos. Coinciden en t=0. ¿Cuántos segundos después coinciden por primera vez?','El primer tiempo positivo común es el MCM.',r't=MCM(6,8)',24,s.ilcm(6,8),'s'),
 N('Se cortan cintas de 36 y 48 cm en trozos iguales de máxima longitud, sin sobrantes. ¿Cuánto mide cada trozo?','La máxima medida común es el MCD.',r'l=MCD(36,48)',12,s.gcd(36,48),'cm'),
 N('¿Cuál es el MCD de 8 y 15?','No comparten factores primos.',r'MCD(2^3,3\cdot5)=1',1,s.gcd(8,15)),
 N('¿Cuál es el MCM de 8 y 15?','Al ser coprimos, el MCM es su producto.',r'MCM=8(15)',120,s.ilcm(8,15)),
 N('¿Cuántos divisores positivos tiene 36?','Su factorización es 2²·3².',r'd(36)=(2+1)(2+1)',9,len(s.divisors(36))),
 C('Dos enteros positivos son coprimos si…',['Ambos son necesariamente primos.','Su MCD es uno.','Su MCM es uno.','Su suma es siempre prima.'],1,['Coprimos significa que no comparten divisor positivo mayor que uno.','Eso equivale a MCD=1.','Pueden ser compuestos, como 8 y 15.']),
 C('Para buscar el menor tiempo positivo en que coinciden ciclos enteros periódicos se usa…',['El MCD, siempre.','El MCM de los periodos, cuando empiezan sincronizados.','La suma de los periodos.','La diferencia de los periodos, siempre.'],1,['Un tiempo de coincidencia debe ser múltiplo de cada periodo.','Se busca el menor múltiplo positivo común.','La sincronización inicial indicada permite aplicar directamente el MCM.']),
],
'4.1':[
 N(r'Calcula $-7+12$.','Sumamos cantidades de signos opuestos por diferencia de módulos.',r'-7+12=12-7',5,-7+12),
 N(r'Calcula $-4(-6)$.','El producto de dos negativos es positivo.',r'(-4)(-6)=24',24,(-4)*(-6)),
 N(r'Calcula $18/(-3)$.','El cociente de signos opuestos es negativo.',r'18/(-3)=-6',-6,R(18,-3)),
 N(r'Calcula $(-3)^2$.','Los paréntesis incluyen el signo en la base.',r'(-3)^2=(-3)(-3)',9,(-3)**2),
 N(r'Calcula $-3^2$.','La potencia se calcula antes del signo menos exterior.',r'-3^2=-(3^2)',-9,-3**2),
 N('¿Qué entero está tres unidades a la derecha de −5 en la recta numérica?','Moverse a la derecha suma unidades.',r'-5+3',-2,-5+3),
 N('Una temperatura pasa de −4 °C a 3 °C. ¿Cuál es su aumento?','El cambio resta valor final menos inicial.',r'\Delta T=3-(-4)',7,3-(-4),r'^\circ C'),
 N('¿Cuántos enteros hay desde −3 hasta 4 inclusive?','Contamos ambos extremos.',r'n=4-(-3)+1',8,len(range(-3,5))),
 N(r'Calcula $5-(-8)$.','Restar un negativo equivale a sumar su opuesto.',r'5-(-8)=5+8',13,5-(-8)),
 C('El orden correcto es…',[r'$-5<-2<0$',r'$0<-2<-5$',r'$-2<-5<0$',r'$-5=5$'],0,['Los números más a la izquierda son menores.','−5 está a la izquierda de −2 y ambos están a la izquierda de cero.','Así queda −5<−2<0.']),
 C('La suma de un entero y su opuesto es…',['Uno.','Cero.','Su cuadrado.','Siempre negativa.'],1,['El opuesto de a es −a.','Ambos están a igual distancia de cero en sentidos contrarios.','La suma a+(−a) vale cero.']),
],
'4.2':[
 N(r'Calcula $|-12|$.','El valor absoluto es distancia a cero.',r'|-12|=12',12,abs(-12)),
 N('¿Cuál es la distancia entre −7 y 5 en la recta real?','Usamos el valor absoluto de la diferencia.',r'd=|5-(-7)|',12,abs(5-(-7))),
 N(r'¿Cuántas soluciones enteras tiene $|x|=4$?','El módulo positivo puede provenir de dos signos.',r'x=4\text{ o }x=-4',2,len({v for v in range(-10,11)if abs(v)==4})),
 N(r'¿Cuántas soluciones enteras no negativas tiene $2x+3y=6$?','Se restringen los dos valores a enteros no negativos.',r'(x,y)=(3,0),(0,2)',2,len([(a,b)for a in range(4)for b in range(3)if 2*a+3*b==6])),
 N(r'¿Cuántas soluciones enteras no negativas tiene $3x+5y=15$?','Enumeramos y desde cero hasta tres y comprobamos x.',r'(x,y)=(5,0),(0,3)',2,len([(a,b)for a in range(6)for b in range(4)if 3*a+5*b==15])),
 N(r'Si $4x+6y=8$, x=2 e y es entero, ¿cuánto vale y?','Sustituimos x antes de despejar.',r'4(2)+6y=8\Rightarrow y=0',0,R(8-4*2,6)),
 N(r'¿Cuántas soluciones enteras tiene $6x+10y=7$?','El MCD de los coeficientes debe dividir al término independiente.',r'MCD(6,10)=2;\quad2\nmid7',0,0),
 N(r'¿Cuál es el menor entero que cumple $|x|<3$?','La desigualdad equivale a −3<x<3.',r'x=-2,-1,0,1,2\Rightarrow x_{min}=-2',-2,min(v for v in range(-10,11)if abs(v)<3)),
 N(r'¿Cuántos enteros cumplen $|x-2|\le2$?','El intervalo resultante incluye ambos extremos.',r'0\le x\le4',5,len([v for v in range(-10,11)if abs(v-2)<=2])),
 C(r'Para que $ax+by=c$ tenga soluciones enteras, con a y b enteros no ambos cero, se requiere y basta que…',['a+b=c.','MCD(a,b) divida a c.','a y b sean positivos.','c sea primo.'],1,['Toda combinación entera de a y b es múltiplo de su MCD.','El teorema de Bézout permite alcanzar cualquier múltiplo de ese MCD.','Por tanto esa divisibilidad caracteriza la existencia.']),
 C('Una ecuación diofántica busca soluciones…',['Solo decimales aproximadas.','Enteras, según las restricciones que se indiquen.','Siempre entre cero y uno.','Exclusivamente irracionales.'],1,['La restricción entera es parte del problema.','Puede añadirse no negatividad u otras condiciones.','Resolver en los reales no basta para responder una pregunta diofántica.']),
],
'5.1':[
 N(r'Calcula $1/3+1/6$.','Sumamos con denominador común.',r'1/3+1/6=2/6+1/6',R(1,2),R(1,3)+R(1,6)),
 N(r'Calcula $3/4-1/2$.','Llevamos un medio a dos cuartos.',r'3/4-2/4=1/4',R(1,4),R(3,4)-R(1,2)),
 N(r'Calcula $(2/3)(9/4)$.','Multiplicamos y reducimos factores comunes.',r'18/12=3/2',R(3,2),R(2,3)*R(9,4)),
 N(r'Calcula $(3/5)/(9/10)$.','Dividir por una fracción no nula equivale a multiplicar por su inversa.',r'(3/5)(10/9)=2/3',R(2,3),R(3,5)/R(9,10)),
 N(r'¿Cuál es el recíproco de $-2/3$?','Invertimos numerador y denominador conservando el signo.',r'1/(-2/3)=-3/2',R(-3,2),1/R(-2,3)),
 N(r'Calcula $3/5$ de 40.','Multiplicamos la cantidad por la fracción.',r'40(3/5)',24,40*R(3,5)),
 N('Una cantidad tiene dos tercios iguales a 18. ¿Cuál es la cantidad?','Despejamos multiplicando por el recíproco.',r'(2/3)x=18\Rightarrow x=27',27,18/R(2,3)),
 N(r'¿Qué fracción irreducible equivale a $12/18$?','Dividimos ambos términos entre su MCD.',r'12/18=(12/6)/(18/6)=2/3',R(2,3),R(12,18)),
 N(r'Calcula el promedio de $1/4$ y $3/4$.','El promedio divide la suma entre dos.',r'[(1/4)+(3/4)]/2',R(1,2),(R(1,4)+R(3,4))/2),
 C('Una fracción tiene valor racional definido si su denominador…',['Es cero.','Es distinto de cero.','Es siempre primo.','Es necesariamente positivo.'],1,['La división por cero no está definida.','Un denominador negativo sí es admisible.','La condición esencial es que no sea cero.']),
 C('Entre dos racionales distintos…',['No existe ningún otro racional.','Existe otro racional, por ejemplo su promedio.','Solo puede haber un irracional.','Siempre hay exactamente dos racionales.'],1,['Si a<b, entonces a<(a+b)/2<b.','El promedio de racionales vuelve a ser racional.','Esto muestra la densidad del conjunto racional.']),
],
'5.2':[
 N('Expresa 0.125 como número racional exacto.','Usamos el valor posicional de las tres cifras decimales.',r'0.125=125/1000=1/8',R(1,8),R(125,1000)),
 N(r'Expresa $0.\overline3$ como fracción.','Multiplicamos por diez y restamos el decimal original.',r'10x-x=3\Rightarrow x=1/3',R(1,3),R(3,9)),
 N(r'Expresa $0.\overline{12}$ como fracción.','Un periodo de dos cifras se elimina al multiplicar por cien.',r'100x-x=12\Rightarrow x=12/99=4/33',R(4,33),R(12,99)),
 N(r'Expresa $0.1\overline6$ como fracción.','Alineamos las partes periódicas antes de restar.',r'100x-10x=16-1\Rightarrow90x=15',R(1,6),R(16-1,90)),
 N('¿Cuántas cifras decimales tiene la escritura finita mínima de 3/8?','Completamos el denominador a una potencia de diez.',r'3/8=375/1000=0.375',3,3),
 N(r'Calcula $0.2+0.35$ exactamente.','Alineamos las posiciones decimales.',r'20/100+35/100=55/100',R(11,20),R(2,10)+R(35,100)),
 N(r'Calcula $0.5\cdot0.4$.','Multiplicamos los valores racionales exactos.',r'(1/2)(2/5)=1/5',R(1,5),R(1,2)*R(2,5)),
 N('¿Cuál es el periodo mínimo de la fracción 1/3 en escritura decimal, medido en cifras?','Su única cifra repetida es el tres.',r'1/3=0.\overline3',1,1),
 N(r'¿Cuánto vale $0.\overline9$ exactamente?','La ecuación decimal periódica determina el valor exacto.',r'10x-x=9\Rightarrow x=1',1,R(9,9)),
 C('Una fracción irreducible tiene decimal finito si su denominador positivo…',['Solo contiene factores primos 2 y/o 5.','Es cualquier primo impar.','Siempre contiene el factor 3.','Es mayor que el numerador.'],0,['Una escritura finita tiene denominador potencia de diez.','Las potencias de diez solo contienen los primos 2 y 5.','La fracción reducida debe tener solo esos factores en el denominador.']),
 C('Un decimal periódico infinito representa…',['Siempre un irracional.','Un número racional.','Una división por cero.','Un número sin valor exacto.'],1,['La repetición permite eliminar la parte infinita mediante una resta.','Se obtiene una ecuación con coeficientes enteros.','Su solución es una fracción de enteros con denominador no nulo.']),
],
'6.1':[
 N('La razón geométrica de 8 a 12 es…','Una razón geométrica es un cociente con denominador no nulo.',r'8/12=2/3',R(2,3),R(8,12)),
 N('En 3/5=x/20, ¿cuánto vale x?','Igualamos productos cruzados.',r'5x=3(20)\Rightarrow x=12',12,R(3*20,5)),
 N('Dos cantidades están en razón 2:3 y suman 25. ¿Cuál es la menor?','Representamos las cantidades como 2k y 3k.',r'5k=25\Rightarrow2k=10',10,25*R(2,5)),
 N('Dos cantidades están en razón 4:7 y difieren en 18. ¿Cuál es la mayor?','La diferencia corresponde a tres partes.',r'3k=18\Rightarrow7k=42',42,R(18,3)*7),
 N('En una proporción, los extremos son 3 y 8. Un medio es 4. ¿Cuánto vale el otro?','El producto de medios equivale al de extremos.',r'4x=3(8)\Rightarrow x=6',6,R(3*8,4)),
 N('La media geométrica positiva entre 4 y 9 es…','La media geométrica es la raíz del producto.',r'g=\sqrt{4(9)}',6,sqrt(4*9)),
 N('La media aritmética entre 4 y 10 es…','La media aritmética divide la suma entre dos.',r'a=(4+10)/2',7,R(4+10,2)),
 N('En una proporción continua 2/x=x/8, con x positivo, ¿cuánto vale x?','El medio proporcional cumple x²=2·8.',r'x=\sqrt{16}',4,sqrt(2*8)),
 N('Una razón a/b es 3/4. Si a=15, ¿cuánto vale b?','El antecedente corresponde a tres partes.',r'15/b=3/4\Rightarrow b=20',20,15/R(3,4)),
 C('En una proporción a/b=c/d con denominadores no nulos…',['Se cumple ad=bc.','Se cumple a+b=c+d necesariamente.','Cada término debe ser uno.','Los numeradores deben ser iguales.'],0,['La igualdad de cocientes puede multiplicarse por bd.','Queda ad=bc.','La equivalencia requiere conservar los denominadores no nulos.']),
 C('La media geométrica positiva de dos positivos a y b es…',[r'$(a+b)/2$',r'$\sqrt{ab}$',r'$a-b$',r'$a+b$'],1,['El medio proporcional g satisface a/g=g/b.','De ahí g²=ab.','Se toma la raíz positiva porque se pide la media positiva.']),
],
'6.2':[
 N('a/2=b/3=c/5=4. ¿Cuánto vale a+b+c?','Cada numerador es denominador por la razón común.',r'a+b+c=4(2+3+5)',40,4*(2+3+5)),
 N('a/2=b/3=c/5 y a+b+c=50. ¿Cuál es la razón común?','La suma de numeradores es la razón por la suma de denominadores.',r'k=50/(2+3+5)',5,R(50,2+3+5)),
 N('a/3=b/4 y a+b=35. ¿Cuánto vale b?','Representamos con una misma constante.',r'a=3k,\ b=4k;\quad7k=35\Rightarrow b=20',20,35*R(4,7)),
 N('a/2=b/5=3. ¿Cuánto vale b−a?','Ambas cantidades se expresan con la razón común.',r'b-a=3(5)-3(2)',9,3*5-3*2),
 N('a:b:c=1:2:4 y c=20. ¿Cuánto vale a?','La cuarta parte de c corresponde a una parte.',r'4k=20\Rightarrow a=k=5',5,R(20,4)),
 N('a/2=b/3=c/4 y a=6. ¿Cuánto vale c?','Hallamos la razón a partir del dato conocido.',r'k=6/2=3;\quad c=4(3)',12,R(6,2)*4),
 N('Tres cantidades están en razón 2:3:5 y suman 80. ¿Cuál es la intermedia?','La suma representa diez partes.',r'b=80(3/10)',24,80*R(3,10)),
 N('En una proporción continua a/b=b/c=2 y c=3, ¿cuánto vale a?','La razón se aplica sucesivamente, no sumando un valor fijo.',r'b=2(3)=6;\quad a=2(6)',12,2*2*3),
 N('a/4=b/6=2. ¿Cuánto vale a·b?','Primero reconstruimos cada cantidad.',r'a=8,\ b=12\Rightarrow ab=96',96,(4*2)*(6*2)),
 C('En una serie de razones equivalentes, sumar numeradores y denominadores…',['Conserva la razón común si la suma de denominadores es no nula.','Siempre produce uno.','Solo funciona con dos razones.','Exige que los numeradores sean iguales.'],0,['Escribimos cada numerador como k por su denominador.','La suma de numeradores factoriza k.','Al dividir por la suma no nula de denominadores se recupera k.']),
 C('Una razón común negativa es…',['Imposible en cualquier proporción.','Admisible si los signos y denominadores de los cocientes lo permiten.','Siempre una división por cero.','Igual a una media geométrica positiva.'],1,['Una razón es un cociente de números.','El cociente puede ser negativo con signos opuestos.','La restricción básica es que los denominadores no sean cero.']),
],
'7.1':[
 N('Tres cuadernos cuestan 12 unidades monetarias a precio unitario fijo. ¿Cuánto cuestan cinco?','Costo y cantidad son directamente proporcionales con precio fijo.',r'C=12(5/3)',20,12*R(5,3)),
 N('Cuatro trabajadores igualmente productivos terminan una tarea en 6 días. Sin interferencias, ¿cuántos días requieren ocho para la misma tarea?','Con trabajo fijo, tiempo y número de trabajadores son inversamente proporcionales.',r't=4(6)/8',3,R(4*6,8),'días'),
 N('Un vehículo mantiene 60 km/h durante 2 h. ¿Qué distancia recorre?','A rapidez constante, distancia y tiempo son directamente proporcionales.',r'd=vt=60(2)',120,60*2,'km'),
 N('Para un mismo viaje de 120 km, la rapidez pasa a 40 km/h. ¿Cuántas horas dura?','Despejamos tiempo del viaje fijo.',r't=d/v=120/40',3,R(120,40),'h'),
 N('Dos engranajes de 20 y 40 dientes están acoplados sin deslizamiento. El de 20 da 6 vueltas. ¿Cuántas da el de 40?','El número de vueltas es inversamente proporcional a los dientes.',r'n_2=20(6)/40',3,R(20*6,40),'vueltas'),
 N('Si y es directamente proporcional a x y vale 15 cuando x=3, ¿qué y corresponde a x=8?','La razón y/x se mantiene constante.',r'k=15/3=5;\quad y=5(8)',40,R(15,3)*8),
 N('Si y es inversamente proporcional a x y vale 12 cuando x=2, ¿qué y corresponde a x=6?','El producto xy es constante.',r'k=2(12)=24;\quad y=24/6',4,R(2*12,6)),
 N('Una receta usa 300 g de harina para 4 porciones. Manteniendo proporciones, ¿cuántos gramos usa para 10?','La cantidad de harina escala con el número de porciones.',r'm=300(10/4)',750,300*R(10,4),'g'),
 N('Si y es directamente proporcional a x² y vale 8 cuando x=2, ¿qué vale cuando x=3?','La constante se calcula respecto del cuadrado.',r'k=8/2^2=2;\quad y=2(3^2)',18,R(8,4)*9),
 C('Dos magnitudes directamente proporcionales mantienen constante…',['Su cociente correspondiente.','Su producto necesariamente.','Su diferencia necesariamente.','Su suma necesariamente.'],0,['La relación se escribe y=kx.','Para x no nulo, y/x=k.','Ese cociente expresa la constante de proporcionalidad.']),
 C('Una regla de tres inversa sobre trabajadores y tiempo requiere…',['Suponer el mismo trabajo y productividad individual constante.','Que todos trabajen una cantidad desconocida de horas distinta.','Que el trabajo total crezca sin especificarlo.','Que el tiempo sea siempre una hora.'],0,['El modelo relaciona trabajo con trabajadores y tiempo.','Para mantener fija la tarea se conservan las demás condiciones.','Sin esas hipótesis no puede afirmarse proporcionalidad inversa directa.']),
],
'7.2':[
 N('Se reparten 60 unidades directamente en razón 2:3. ¿Cuánto recibe la menor parte?','La suma de razones representa cinco partes.',r'a=60(2/5)',24,60*R(2,5)),
 N('Se reparten 120 unidades directamente en razón 1:2:3. ¿Cuánto recibe la mayor parte?','La mayor corresponde a tres de las seis partes.',r'c=120(3/6)',60,120*R(3,6)),
 N('Se reparten 60 unidades inversamente a 2 y 3. ¿Qué cantidad corresponde a 2?','Las razones de reparto son 1/2 y 1/3.',r'a=60\frac{1/2}{1/2+1/3}',36,60*R(1,2)/(R(1,2)+R(1,3))),
 N('Dos socios aportan 100 y 200 durante el mismo tiempo. Según un acuerdo de reparto proporcional al capital, ¿cuánto recibe el segundo de una utilidad de 90?','Con igual tiempo la proporción acordada sigue los capitales.',r'G_2=90\frac{200}{100+200}',60,90*R(200,300)),
 N('Dos socios aportan el mismo capital por 2 y 4 meses. Según reparto proporcional a capital×tiempo, ¿cuánto recibe el primero de 120 de utilidad?','Con capital igual, el peso del reparto sigue el tiempo.',r'G_1=120\frac2{2+4}',40,120*R(2,6)),
 N('Cinco máquinas idénticas producen 100 piezas en 2 h. Con productividad constante, ¿cuántas producen diez máquinas en 3 h?','La producción es proporcional a máquinas y tiempo.',r'P=100(10/5)(3/2)',300,100*R(10,5)*R(3,2),'piezas'),
 N('Seis trabajadores hacen una tarea en 8 días a 4 h diarias. Con productividad constante, ¿cuántos días necesitan cuatro trabajadores a 6 h diarias?','El trabajo fijo conserva trabajadores×días×horas.',r'd=6(8)(4)/(4\cdot6)',8,R(6*8*4,4*6),'días'),
 N('Se distribuyen 90 unidades en razón 2:3:4. ¿Qué diferencia hay entre la mayor y la menor parte?','Cada parte vale diez.',r'd=90\frac{4-2}{2+3+4}',20,90*R(4-2,9)),
 N('Se reparten 84 unidades inversamente a 2 y 5. ¿Cuánto corresponde a 5?','La razón inversa de 2 y 5 es 5:2.',r'b=84\frac2{5+2}',24,84*R(2,7)),
 C('En un reparto proporcional directo, cada parte se calcula…',['Total por su peso dividido entre la suma de pesos.','Total dividido solo entre su propio peso.','Restando siempre el peso al total.','Multiplicando todos los pesos sin normalizar.'],0,['Las cantidades deben conservar la razón de sus pesos.','Se usa una constante común.','La suma de las partes debe recuperar el total distribuido.']),
 C('En un reparto inversamente proporcional a positivos a y b se usan pesos…',[r'$a,b$',r'$1/a,1/b$',r'$a+b,a-b$','Siempre 1 y 1.'],1,['Una mayor referencia recibe una menor parte bajo el reparto inverso.','Los recíprocos representan esa relación.','Después se normalizan para que las partes sumen el total.']),
],
}

BANK.update({
'8.1':[
 N('Calcula el 10 % de 200.','El porcentaje divide la tasa entre cien.',r'200(10/100)',20,200*R(10,100)),
 N('20 es el 25 % de una cantidad. ¿Cuál es la cantidad?','Despejamos la base del porcentaje.',r'0.25x=20\Rightarrow x=80',80,20/R(25,100)),
 N('Un precio de 100 recibe descuentos sucesivos de 10 % y 20 %. ¿Cuál es el precio final?','Cada descuento actúa sobre el precio que queda.',r'P_f=100(0.9)(0.8)',72,100*R(9,10)*R(4,5)),
 N('Una cantidad de 100 aumenta 10 % dos veces seguidas. ¿Cuál es el valor final?','Los factores de aumento se multiplican.',r'V_f=100(1.1)^2',121,100*R(11,10)**2),
 N('Una cantidad de 100 aumenta 20 % y luego disminuye 20 %. ¿Cuál es el resultado?','Los dos porcentajes usan bases distintas.',r'V_f=100(1.2)(0.8)',96,100*R(6,5)*R(4,5)),
 N('Una cantidad pasa de 80 a 100. ¿Cuál es el aumento porcentual respecto de 80?','El cambio se divide entre el valor inicial.',r'p=100(100-80)/80',25,100*R(100-80,80),r'\%'),
 N('Una cantidad pasa de 50 a 40. ¿Cuál es la disminución porcentual respecto de 50?','El descenso se compara con la base inicial.',r'p=100(50-40)/50',20,100*R(50-40,50),r'\%'),
 N('¿Qué porcentaje representa 15 de un total de 60?','Calculamos parte sobre total por cien.',r'p=100(15/60)',25,100*R(15,60),r'\%'),
 N('Un precio de 120 incluye un aumento del 20 % sobre el precio original. ¿Cuál era ese precio original?','Se divide entre el factor de aumento, no se resta 20 % del final.',r'P_0=120/1.2',100,120/R(6,5)),
 C('Dos descuentos sucesivos del 10 % y 20 % equivalen a…',['Un descuento del 30 %.','Un descuento del 28 %.','Un descuento del 32 %.','Un aumento del 2 %.'],1,['El precio conserva 0.9 y luego 0.8 de lo anterior.','El factor final es 0.72.','Se conserva 72 % del inicial y se descuenta 28 %.']),
 C('Un porcentaje de cambio se calcula usando como base…',['Siempre el valor final.','El valor de referencia indicado, normalmente el inicial al hablar de aumento o disminución.','Siempre el número 1000.','La suma de todos los valores.'],1,['La tasa compara una variación con una referencia.','Cambiar la referencia cambia el porcentaje.','El enunciado debe indicar qué cantidad sirve de base.']),
],
'8.2':[
 N('El lado de un cuadrado aumenta 20 %. ¿En qué porcentaje aumenta su área?','El área cambia con el cuadrado del factor lineal.',r'p=100[(1.2)^2-1]',44,100*(R(6,5)**2-1),r'\%'),
 N('La arista de un cubo aumenta 10 %. ¿En qué porcentaje aumenta su volumen?','El volumen cambia con el cubo del factor lineal.',r'p=100[(1.1)^3-1]',R(331,10),100*(R(11,10)**3-1),r'\%'),
 N('Un objeto cuesta 80 y se vende a 100. ¿Qué ganancia porcentual hay sobre el costo?','La ganancia es 20 y la base es el costo.',r'p=100(100-80)/80',25,100*R(100-80,80),r'\%'),
 N('Un objeto cuesta 80 y se vende a 100. ¿Qué porcentaje del precio de venta representa la ganancia?','Ahora la base del porcentaje es el precio de venta.',r'p=100(100-80)/100',20,100*R(100-80,100),r'\%'),
 N('Un precio de lista de 150 recibe descuento de 20 %. ¿Cuál es el precio de venta?','Se conserva el 80 % del precio listado.',r'P_v=150(0.8)',120,150*R(4,5)),
 N('Un producto cuesta 100 y se desea ganar 20 % sobre ese costo. ¿A qué precio se vende en este cálculo?','Sumamos al costo el porcentaje del costo.',r'P_v=100(1.2)',120,100*R(6,5)),
 N('Un producto cuesta 50 y se desea que la ganancia sea 20 % del precio de venta. ¿Qué precio satisface esa condición?','El costo representa 80 % del precio de venta.',r'0.8P_v=50\Rightarrow P_v=62.5',R(125,2),50/R(4,5)),
 N('Un rectángulo aumenta su base 10 % y su altura 20 %. ¿En qué porcentaje aumenta el área?','Se multiplican los dos factores lineales.',r'p=100[(1.1)(1.2)-1]',32,100*(R(11,10)*R(6,5)-1),r'\%'),
 N('Un precio baja de 80 a 60. ¿Qué porcentaje de descuento se aplicó sobre 80?','Se divide el descenso entre el precio inicial.',r'p=100(80-60)/80',25,100*R(80-60,80),r'\%'),
 C('Ganar 20 % sobre el costo y ganar 20 % sobre el precio de venta…',['Son siempre lo mismo.','Usan bases diferentes y en general dan precios distintos.','Exigen vender siempre a pérdida.','Son imposibles para costos positivos.'],1,['El primer porcentaje divide la ganancia entre costo.','El segundo divide entre precio de venta.','Con bases distintas, no se puede usar el mismo factor de forma automática.']),
 C('Al aumentar cada longitud de una figura plana semejante por un factor k, su perímetro y su área cambian por…',[r'$k$ y $k^2$, respectivamente.',r'$k^2$ y $k$, respectivamente.',r'$k$ y $k$, siempre.',r'$k^3$ y $k^2$, respectivamente.'],0,['El perímetro suma longitudes y recibe un solo factor.','El área combina dos dimensiones lineales.','Por eso los factores son k y k².']),
],
'9.1':[
 N('La progresión aritmética 2,5,8,… tiene primer término 2 y diferencia 3. ¿Cuál es el décimo término?','El término n suma n−1 diferencias al primero.',r'a_{10}=2+9(3)',29,2+9*3),
 N('¿Cuál es la diferencia común de 10,7,4,1,…?','Restamos el término anterior al siguiente.',r'd=7-10',-3,7-10),
 N('¿Cuántos términos tiene 10,20,30,…,100?','Los extremos y la diferencia determinan el número de términos.',r'n=(100-10)/10+1',10,len(range(10,101,10))),
 N('Suma los primeros 20 enteros positivos.','Emparejamos primero y último.',r'S=20(1+20)/2',210,sum(range(1,21))),
 N('¿Cuántas cifras decimales se usan para numerar del 1 al 100 inclusive?','Separamos números de una, dos y tres cifras.',r'C=9+90(2)+3',192,sum(len(str(i))for i in range(1,101))),
 N('¿Cuántas cifras decimales se usan para numerar del 1 al 120 inclusive?','Hay 21 números de tres cifras desde 100 hasta 120.',r'C=9+90(2)+21(3)',252,sum(len(str(i))for i in range(1,121))),
 N('¿Cuál es el octavo número impar positivo?','Los impares positivos siguen a_n=2n−1.',r'a_8=2(8)-1',15,2*8-1),
 N('Una progresión aritmética tiene a1=5 y diferencia −2. ¿Cuál es su sexto término?','La diferencia negativa se suma con su signo.',r'a_6=5+5(-2)',-5,5+5*(-2)),
 N('Una progresión aritmética tiene a1=3 y a5=15. ¿Cuál es su diferencia?','Entre el primero y el quinto hay cuatro incrementos.',r'd=(15-3)/4',3,R(15-3,4)),
 C('Dar solo los primeros términos de una sucesión sin indicar una regla…',['Garantiza siempre un único término siguiente.','Puede admitir varias continuaciones; se necesita especificar la regla.','Obliga a que sea una progresión aritmética.','Impide que sus términos sean enteros.'],1,['Un conjunto finito de términos puede ajustarse a diferentes reglas.','El patrón aparente no es una prueba de unicidad.','Los ejercicios aquí declaran el tipo de progresión o una fórmula.']),
 C('En una progresión aritmética, lo constante entre términos consecutivos es…',['Su diferencia.','Su producto.','Siempre su razón.','Su suma acumulada.'],0,['Cada término se obtiene sumando la misma diferencia al anterior.','Esa diferencia puede ser positiva, negativa o cero.','No se exige una razón constante.']),
],
'9.2':[
 N('La progresión geométrica 2,6,18,… tiene razón 3. ¿Cuál es el quinto término?','El término n multiplica el primero por r elevado a n−1.',r'a_5=2(3^4)',162,2*3**4),
 N('Suma los cuatro primeros términos de la progresión geométrica de primer término 2 y razón 2.','Escribimos los cuatro términos antes de sumar.',r'S_4=2+4+8+16',30,sum(2*2**i for i in range(4))),
 N('¿Cuál es la razón común de la progresión geométrica 3,−6,12,−24,…?','Dividimos un término entre el anterior no nulo.',r'r=-6/3',-2,R(-6,3)),
 N('¿Cuántos términos hay en la progresión geométrica 1,2,4,…,32?','Los términos son potencias de dos desde exponente cero.',r'1=2^0;\quad32=2^5\Rightarrow n=6',6,len([2**i for i in range(6)])),
 N('Una progresión geométrica infinita empieza en 3 y tiene razón 1/2. ¿Cuál es su suma?','El módulo de la razón es menor que uno.',r'S=3/(1-1/2)',6,s.summation(3*R(1,2)**s.Symbol('j',integer=True,nonnegative=True),(s.Symbol('j',integer=True,nonnegative=True),0,s.oo))),
 N('Una progresión geométrica tiene primer término 5 y razón 1/5. ¿Cuál es su tercer término?','Aplicamos dos multiplicaciones por la razón.',r'a_3=5(1/5)^2',R(1,5),5*R(1,5)**2),
 N('Una progresión geométrica tiene primer término 3, tercer término 27 y razón positiva. ¿Cuál es la razón?','El signo positivo selecciona la raíz indicada.',r'3r^2=27\Rightarrow r=3',3,sqrt(R(27,3))),
 N('Una progresión geométrica tiene primer término 4 y razón 1/2. ¿Cuál es su cuarto término?','Del primero al cuarto se multiplica tres veces por la razón.',r'a_4=4(1/2)^3',R(1,2),4*R(1,2)**3),
 N('Suma los cinco primeros términos de 1,3,9,27,…, una progresión geométrica de razón 3.','La suma finita acumula los cinco términos indicados.',r'S_5=1+3+9+27+81',121,sum(3**i for i in range(5))),
 C('La suma infinita de una progresión geométrica con primer término no nulo converge si…',[r'$|r|<1$',r'$r>1$ siempre.',r'$r=1$ siempre.',r'$|r|>1$'],0,['La suma parcial contiene una potencia r^n.','Esa potencia tiende a cero cuando |r|<1.','Entonces se obtiene la suma a1/(1−r).']),
 C('En una progresión geométrica de razón negativa y primer término no nulo, los signos…',['Son siempre positivos.','Alternan entre términos consecutivos.','Son siempre cero.','Solo cambian en el primer término.'],1,['Cada término se multiplica por un número negativo.','Cada multiplicación invierte el signo.','Por eso los signos alternan mientras los términos sean no nulos.']),
],
'10.1':[
 N('Suma los enteros de 1 a 10.','Usamos la suma de los primeros n naturales.',r'S=10(11)/2',55,sum(range(1,11))),
 N('Calcula 1²+2²+3².','Elevamos cada término antes de sumar.',r'1+4+9',14,sum(i*i for i in range(1,4))),
 N('Suma los cinco primeros impares positivos.','La suma de los primeros n impares es n².',r'1+3+5+7+9=5^2',25,sum(2*i-1 for i in range(1,6))),
 N('Calcula 1³+2³+3³.','La suma de cubos equivale al cuadrado de la suma de naturales.',r'1+8+27=(1+2+3)^2',36,sum(i**3 for i in range(1,4))),
 N('En un ejercicio de interés simple, un capital de 1000 genera 5 % anual durante 2 años. ¿Cuál es el interés, sin otros cargos?','El interés simple se calcula sobre el capital inicial.',r'I=Crt=1000(0.05)(2)',100,1000*R(5,100)*2),
 N('Un capital de 1000 crece con interés compuesto de 10 % anual durante dos años, capitalizado al final de cada año. ¿Cuál es el monto final?','Cada año se aplica el factor al monto acumulado.',r'M=1000(1.1)^2',1210,1000*R(11,10)**2),
 N('Un documento de valor nominal 1000 recibe descuento comercial simple de 10 % anual por medio año. ¿Qué descuento resulta según D=Ndt?','Se usa el valor nominal como base del descuento comercial.',r'D=1000(0.1)(0.5)',50,1000*R(1,10)*R(1,2)),
 N('Un documento de nominal 1000 recibe un descuento de 50. ¿Cuál es su valor efectivo en este cálculo?','El efectivo resta el descuento al nominal.',r'E=1000-50',950,1000-50),
 N('Un nominal de 1100 se descuenta racionalmente por un año al 10 % simple: E=N/(1+it). ¿Qué descuento racional N−E se obtiene?','Primero calculamos el efectivo por la fórmula dada.',r'E=1100/1.1=1000;\quad D=1100-1000',100,1100-1100/R(11,10)),
 C('En interés simple y compuesto, la diferencia central es…',['El interés simple siempre es cero.','El compuesto incorpora al capital los intereses según la capitalización; el simple mantiene la base inicial.','El compuesto nunca depende del tiempo.','Ambos usan siempre fórmulas idénticas para varios periodos.'],1,['El interés simple no capitaliza los intereses de cada periodo.','El compuesto sí los incorpora según el esquema pactado en el problema.','Deben conocerse tasa, unidad temporal y periodo de capitalización.']),
 C('Una tasa anual y un tiempo expresado en meses se combinan en una fórmula simple…',['Sin convertir nunca las unidades.','Después de expresar el tiempo en años o usar una tasa temporal coherente.','Sumando la tasa al número de meses.','Multiplicando siempre por cien meses.'],1,['La tasa tiene una referencia temporal.','El tiempo debe medirse en esa misma unidad dentro del modelo.','Por ejemplo, seis meses se expresan como medio año.']),
],
'10.2':[
 N('Se mezclan 2 kg de una solución con 20 % de sal en masa y 3 kg con 10 %. Sin pérdidas, ¿qué porcentaje de sal en masa tiene la mezcla?','Se conserva la masa de sal y se divide entre la masa total.',r'p=100\frac{2(0.2)+3(0.1)}{2+3}',14,100*(2*R(1,5)+3*R(1,10))/5,r'\%'),
 N('Una aleación de 120 g tiene ley en masa 0.75. ¿Cuántos gramos de metal puro contiene?','La ley es la fracción de masa del metal puro.',r'm_p=120(0.75)',90,120*R(3,4),'g'),
 N('Se mezclan 2 kg a 10 unidades monetarias/kg y 3 kg a 20 unidades/kg. Sin otros costos, ¿cuál es el costo medio por kg?','El promedio se pondera por las masas.',r'c=\frac{2(10)+3(20)}{2+3}',16,R(2*10+3*20,5)),
 N('Una solución de 2 kg contiene 30 % de soluto en masa. Se agrega 1 kg de agua sin pérdida de soluto. ¿Qué porcentaje en masa resulta?','La masa de soluto permanece y aumenta la masa total.',r'p=100\frac{2(0.3)}{2+1}',20,100*2*R(3,10)/3,r'\%'),
 N('Se mezclan 3 kg de una aleación con 80 % de metal puro y 2 kg con 50 %. ¿Cuántos kg de metal puro contiene la mezcla?','Sumamos las masas del componente puro.',r'm_p=3(0.8)+2(0.5)',R(17,5),3*R(4,5)+2*R(1,2),'kg'),
 N('Se mezclan 3 kg de una aleación con 80 % de metal puro y 2 kg con 50 %. ¿Cuál es el porcentaje puro en masa?','Dividimos la masa pura entre toda la masa.',r'p=100\frac{3(0.8)+2(0.5)}{5}',68,100*(3*R(4,5)+2*R(1,2))/5,r'\%'),
 N('Una solución de 10 kg tiene 10 % de sal no volátil. Se evaporan 2 kg de agua y no se pierde sal. ¿Cuál es la concentración final en masa?','La sal conserva un kg mientras el total baja a ocho.',r'p=100\frac{10(0.1)}{10-2}',R(25,2),100*10*R(1,10)/8,r'\%'),
 N('Se tienen 4 kg de solución al 25 % de soluto en masa. ¿Cuántos kg de agua deben añadirse para llegar al 10 %, sin perder soluto?','La masa pura queda fija y determina la masa final.',r'm_p=4(0.25)=1;\quad m_f=1/0.1=10;\quad m_a=10-4',6,4*R(1,4)/R(1,10)-4,'kg'),
 N('Se mezclan 4 kg de solución al 20 % con x kg al 50 %. Para obtener 30 % en masa sin pérdidas, ¿cuánto vale x?','Igualamos la masa de soluto antes y después.',r'4(0.2)+0.5x=0.3(4+x)\Rightarrow x=2',2,(4*R(3,10)-4*R(1,5))/(R(1,2)-R(3,10)),'kg'),
 C('Un promedio de concentraciones de dos masas distintas se calcula…',['Siempre sumando porcentajes y dividiendo entre dos.','Ponderando por las masas y conservando la cantidad de soluto.','Restando el menor porcentaje al mayor.','Ignorando la masa total.'],1,['Cada concentración describe una fracción de su propia masa.','Se suman las masas de soluto de cada componente.','La concentración final divide ese total entre toda la masa.']),
 C('En un problema de evaporación de agua con sal no volátil, sin arrastre ni pérdidas de sal…',['La masa de sal permanece constante.','La masa de sal se duplica siempre.','La concentración permanece necesariamente igual.','El total de agua aumenta.'],0,['Solo se retira agua bajo las condiciones indicadas.','La masa de sal no cambia.','Al disminuir la masa total, su fracción en masa aumenta.']),
],
'11.1':[
 N('Calcula la media de 2,4,6.','La media aritmética divide la suma entre la cantidad de datos.',r'\bar x=(2+4+6)/3',4,R(2+4+6,3)),
 N('Calcula la mediana de 1,3,9.','Con tres datos ordenados se toma el central.',r'Me=3',3,sorted([1,3,9])[1]),
 N('Calcula la mediana de 1,3,5,9.','Con cantidad par promediamos los dos centrales.',r'Me=(3+5)/2',4,R(3+5,2)),
 N('¿Cuál es la moda de 1,2,2,3?','La moda es el valor de mayor frecuencia.',r'f(2)=2>f(1)=f(3)=1',2,2),
 N('Una tabla registra el valor 2 una vez y el valor 4 tres veces. ¿Cuál es la media exacta de los cuatro datos?','Se pondera cada valor por su frecuencia.',r'\bar x=(2\cdot1+4\cdot3)/(1+3)',R(7,2),R(2+12,4)),
 N('Una tabla de frecuencias tiene tres categorías con frecuencias 3,5,2. ¿Cuántos datos registra?','La frecuencia total es la suma de frecuencias absolutas.',r'n=3+5+2',10,3+5+2),
 N('Una categoría aparece 5 veces en una muestra de 20 datos. ¿Cuál es su frecuencia relativa?','La frecuencia relativa divide casos de la categoría entre total.',r'h=5/20',R(1,4),R(5,20)),
 N('¿Cuál es la marca de clase del intervalo [10,20)?','La marca es el punto medio de los límites.',r'x_i=(10+20)/2',15,R(10+20,2)),
 N('Dos clases tienen marcas 15 y 25 y frecuencias 2 y 2. ¿Cuál es la media estimada mediante marcas de clase?','La agrupación permite una estimación, no reconstruye cada dato original.',r'\bar x_{est}=(15\cdot2+25\cdot2)/4',20,R(30+50,4)),
 C('La media calculada solo con marcas y frecuencias de intervalos…',['Siempre es exactamente la media de los datos originales.','Es una estimación basada en representar cada clase por su marca.','Es siempre la moda.','No usa frecuencias.'],1,['La tabla agrupada no conserva cada observación individual.','La marca representa los valores de la clase.','El cálculo es estimado salvo condiciones adicionales.']),
 C('La mediana se obtiene…',['A partir de los datos ordenados.','Siempre tomando el dato que más se repite.','Sin atender al orden ni a la cantidad.','Siempre como el valor mayor.'],0,['La mediana depende de la posición central.','Se necesita ordenar las observaciones.','Según la cantidad par o impar se promedian dos centrales o se toma uno.']),
],
'11.2':[
 N('Calcula el rango de 1,4,9.','El rango resta mínimo al máximo.',r'R=9-1',8,9-1),
 N('Los datos 2,4,6 constituyen toda la población considerada. ¿Cuál es su varianza poblacional?','Usamos el promedio de cuadrados de desvíos, dividiendo entre N.',r'\mu=4;\quad\sigma^2=[(-2)^2+0^2+2^2]/3',R(8,3),R(sum((i-4)**2 for i in [2,4,6]),3)),
 N('Los datos 2,4,6 son una muestra y se pide la varianza muestral corregida. ¿Cuánto vale?','La corrección divide entre n−1.',r'\bar x=4;\quad s^2=[4+0+4]/(3-1)',4,R(8,3-1)),
 N('La población de datos es 2,2,2. ¿Cuál es su desviación estándar poblacional?','Todos los desvíos respecto de la media son cero.',r'\sigma=\sqrt{(0+0+0)/3}',0,sqrt(R(0,3))),
 N('La población consta de 0 y 2. ¿Cuál es su desviación estándar?','La media es uno y cada desvío al cuadrado vale uno.',r'\sigma=\sqrt{[(-1)^2+1^2]/2}',1,sqrt(R(1+1,2))),
 N('Una variable positiva tiene media 10 y desviación estándar 2. ¿Cuál es su coeficiente de variación porcentual?','Dividimos desviación entre media positiva y multiplicamos por cien.',r'CV=100(2/10)',20,100*R(2,10),r'\%'),
 N('Datos ordenados: 1,3,5,7,9,11. Usando Q1 como mediana de la mitad inferior, ¿cuánto vale Q1?','La mitad inferior es 1,3,5 según el método indicado.',r'Q_1=Me(1,3,5)=3',3,3),
 N('Datos ordenados: 1,3,5,7,9,11. Usando Q3 como mediana de la mitad superior, ¿cuánto vale Q3?','La mitad superior es 7,9,11 según el método indicado.',r'Q_3=Me(7,9,11)=9',9,9),
 N('Datos ordenados: 2,4,6,8,10,12,14,16. Define P75 por el dato de posición techo(0.75n), contando desde 1. ¿Cuánto vale?','Se aplica la convención de percentil declarada.',r'j=\lceil0.75(8)\rceil=6;\quad x_6=12',12,[2,4,6,8,10,12,14,16][int(s.ceiling(R(3,4)*8))-1]),
 C('Si se suma una misma constante a todos los datos, su varianza…',['No cambia.','Siempre se duplica.','Se vuelve cero necesariamente.','Se suma con esa constante.'],0,['La media se traslada en esa misma constante.','Las diferencias de cada dato respecto de la media permanecen.','Por eso no cambia la suma de cuadrados de desvíos.']),
 C('La varianza y la desviación estándar se distinguen porque…',['Siempre son iguales.','La desviación estándar es la raíz no negativa de la varianza.','La varianza puede ser negativa.','La desviación estándar usa siempre otra muestra.'],1,['La varianza promedia o estima cuadrados de desvíos.','Es no negativa.','Su raíz no negativa devuelve la medida de dispersión en la escala original.']),
],
'12.1':[
 N('Hay 3 camisas y 2 pantalones distintos. ¿Cuántos conjuntos de una camisa y un pantalón pueden formarse?','Las elecciones independientes se multiplican.',r'n=3(2)',6,3*2),
 N('Una ruta tiene 4 opciones de autobús o 3 opciones de tren, excluyentes. ¿Cuántas opciones de transporte único hay?','Sumamos alternativas de clases disjuntas.',r'n=4+3',7,4+3),
 N('¿De cuántas formas se ordenan 4 libros distintos en una fila?','El orden de cuatro elementos distintos se cuenta con factorial.',r'n=4!=24',24,s.factorial(4)),
 N('¿Cuántos grupos de 2 personas se eligen de 5 distintas sin cargos ni orden?','Usamos combinaciones porque el orden no importa.',r'n=\binom52=10',10,s.binomial(5,2)),
 N('Se eligen presidente y secretario distintos entre 5 personas. ¿Cuántas asignaciones hay?','Los cargos distinguen el orden y una persona no ocupa ambos.',r'n=5(4)',20,5*4),
 N('Un código de 3 cifras permite repetir cualquiera de los diez dígitos e iniciar con cero. ¿Cuántos códigos hay?','Cada posición tiene diez elecciones.',r'n=10^3',1000,10**3),
 N('¿Cuántas cadenas de longitud 3 se forman con A y B, permitiendo repetición?','Cada una de tres posiciones tiene dos elecciones.',r'n=2^3',8,2**3),
 N('Calcula 0!.','La definición factorial asigna al producto vacío el valor uno.',r'0!=1',1,s.factorial(0)),
 N('¿Cuántos subconjuntos tiene un conjunto de 4 elementos?','Cada elemento se incluye o no se incluye.',r'n=2^4',16,2**4),
 C('Se usan combinaciones cuando…',['Importa distinguir todos los órdenes posibles.','Se elige un grupo y el orden no distingue resultados.','Se permite dividir por cero.','Siempre hay exactamente dos elementos.'],1,['Un mismo grupo puede listarse de varias maneras.','Si esas listas representan el mismo resultado, no deben contarse por separado.','Las combinaciones eliminan esa repetición de órdenes.']),
 C('El principio multiplicativo exige contar…',['Las alternativas sucesivas de cada etapa bajo sus condiciones.','Solo los resultados de la primera etapa.','Siempre la suma de alternativas.','Una sola opción aunque existan más.'],0,['Un resultado completo reúne una elección por etapa.','Se cuentan las posibilidades admisibles de cada paso.','Si esas cantidades son las indicadas, se multiplican para obtener el total.']),
],
'12.2':[
 N('Seis personas distintas se ordenan en fila. A y B deben quedar juntas. ¿Cuántos órdenes hay?','Tratamos A y B como bloque con dos órdenes internos.',r'n=2(5!)',240,2*s.factorial(5)),
 N('Seis personas distintas se ordenan en fila. A y B no pueden quedar juntas. ¿Cuántos órdenes hay?','Restamos al total los casos contiguos.',r'n=6!-2(5!)',480,s.factorial(6)-2*s.factorial(5)),
 N('Cinco personas distintas se sientan alrededor de una mesa circular. Se identifican rotaciones pero no reflexiones. ¿Cuántos órdenes hay?','Fijamos una persona para eliminar rotaciones.',r'n=(5-1)!',24,s.factorial(4)),
 N('¿Cuántas ordenaciones distintas de letras tiene MAMA?','Dividimos por los factoriales de las repeticiones.',r'n=4!/(2!2!)',6,s.factorial(4)/(s.factorial(2)*s.factorial(2))),
 N('¿Cuántos números decimales de tres cifras se forman con 0,1,2 usando cada cifra exactamente una vez?','El primer dígito no puede ser cero.',r'n=2(2!)',4,len([v for v in itertools.permutations('012')if v[0]!='0'])),
 N('Se eligen 3 personas de 6 distintas y A debe estar incluida. ¿Cuántos grupos hay?','Solo falta elegir dos de las otras cinco.',r'n=\binom52',10,s.binomial(5,2)),
 N('Se eligen 2 hombres de 3 y 1 mujer de 4, todos distintos. ¿Cuántos grupos hay?','Multiplicamos las dos elecciones de grupos.',r'n=\binom32\binom41',12,s.binomial(3,2)*s.binomial(4,1)),
 N('Tres mujeres y tres hombres, todos distintos, se sientan en fila alternando los dos grupos. ¿Cuántos órdenes hay?','Hay dos patrones de grupos y factoriales dentro de cada uno.',r'n=2(3!)(3!)',72,2*s.factorial(3)*s.factorial(3)),
 N('¿Cuántos subconjuntos no vacíos tiene un conjunto de 5 elementos?','Al total de subconjuntos se resta el vacío.',r'n=2^5-1',31,2**5-1),
 C('En una mesa circular, identificar rotaciones significa…',['Contar como diferentes todas las posiciones del mismo giro conjunto.','Considerar el mismo orden relativo tras girar a todos los participantes.','Identificar obligatoriamente también los reflejos.','Permitir que dos personas ocupen la misma silla.'],1,['Se conserva el orden relativo alrededor del círculo.','Un giro conjunto no cambia ese orden.','Las reflexiones solo se identifican si el enunciado lo dice.']),
 C('Para contar ordenaciones con letras repetidas, dividir por factoriales de las repeticiones…',['Compensa los intercambios entre letras idénticas que no generan una ordenación nueva.','Hace que todas las palabras tengan una sola ordenación.','Solo funciona si todas las letras son distintas.','Permite sumar órdenes sin considerar ninguna repetición.'],0,['Un conteo como si todas fueran distintas repite resultados.','Intercambiar copias de una misma letra no cambia la cadena visible.','Los factoriales corrigen esa sobrecuenta.']),
],
'13.1':[
 N('Se lanza un dado justo de seis caras numeradas 1 a 6. ¿Cuál es la probabilidad de obtener un par?','Las seis caras son equiprobables.',r'P=3/6',R(1,2),R(len([i for i in range(1,7)if i%2==0]),6)),
 N('Se lanzan dos monedas justas e independientes. ¿Cuál es la probabilidad de exactamente una cara?','Los cuatro pares ordenados son equiprobables.',r'P=2/4',R(1,2),R(2,4)),
 N('Se lanzan dos dados justos independientes de seis caras. ¿Cuál es la probabilidad de suma 7?','Los pares ordenados tienen 36 posibilidades.',r'P=6/36',R(1,6),R(len([(a,b)for a in range(1,7)for b in range(1,7)if a+b==7]),36)),
 N('Una bolsa tiene 3 bolas rojas y 2 azules, y se extrae una uniformemente. ¿Cuál es la probabilidad de roja?','Contamos casos favorables sobre total equiprobable.',r'P(R)=3/(3+2)',R(3,5),R(3,5)),
 N('Un evento tiene probabilidad 0.3. ¿Cuál es la probabilidad de su complemento?','Evento y complemento particionan el espacio muestral.',r'P(A^c)=1-0.3',R(7,10),1-R(3,10)),
 N('P(A)=2/5, P(B)=1/3 y P(A∩B)=1/5. ¿Cuánto vale P(A∪B)?','Restamos la intersección que se contaría dos veces.',r'P(A\cup B)=2/5+1/3-1/5',R(8,15),R(2,5)+R(1,3)-R(1,5)),
 N('A y B son mutuamente excluyentes, con probabilidades 3/10 y 1/5. ¿Cuál es la probabilidad de su unión?','La intersección de eventos excluyentes es vacía.',r'P(A\cup B)=3/10+1/5',R(1,2),R(3,10)+R(1,5)),
 N('Se lanzan dos monedas justas independientes. ¿Cuál es la probabilidad de al menos una cara?','Restamos el caso de ninguna cara al total.',r'P=1-(1/2)^2',R(3,4),1-R(1,2)**2),
 N('En un experimento, el evento coincide con todo el espacio muestral. ¿Qué probabilidad tiene?','El evento seguro tiene probabilidad uno.',r'P(\Omega)=1',1,1),
 C('La regla clásica favorables/posibles se aplica directamente si…',['Todos los resultados elementales contados son equiprobables.','Los resultados tienen cualquier probabilidad sin conocerla.','Solo se conoce el nombre del evento.','Siempre hay dos resultados.'],0,['La división por el número de casos asigna el mismo peso a cada uno.','Eso requiere equiprobabilidad.','Si los pesos difieren, deben sumarse las probabilidades correspondientes.']),
 C('Toda probabilidad real de un evento cumple…',[r'$0\le P\le1$',r'$P>1$ siempre.',r'$P<0$ siempre.',r'$P=1/2$ siempre.'],0,['Los axiomas exigen no negatividad.','El evento está contenido en el espacio muestral de probabilidad uno.','Su probabilidad no puede superar uno.']),
],
'13.2':[
 N('Una bolsa tiene 3 bolas rojas y 2 azules. Se extraen dos uniformemente sin reemplazo. ¿Cuál es la probabilidad de que ambas sean rojas?','La composición cambia después de la primera extracción.',r'P=3/5\cdot2/4',R(3,10),R(3,5)*R(2,4)),
 N('Una bolsa tiene 3 bolas rojas y 2 azules. Se hacen dos extracciones uniformes con reemplazo y mezcla. ¿Cuál es la probabilidad de dos rojas?','La segunda extracción conserva la probabilidad original.',r'P=(3/5)^2',R(9,25),R(3,5)**2),
 N('Una bolsa contiene 3 rojas y 2 azules. Tras extraer una roja sin reemplazarla, ¿qué probabilidad de roja tiene la segunda extracción uniforme?','Quedan dos rojas entre cuatro bolas.',r'P(R_2\mid R_1)=2/4',R(1,2),R(2,4)),
 N('P(A∩B)=1/5 y P(B)=1/2. ¿Cuál es P(A|B)?','La probabilidad condicionada divide la intersección entre la condición positiva.',r'P(A\mid B)=(1/5)/(1/2)',R(2,5),R(1,5)/R(1,2)),
 N('A y B son independientes, con P(A)=1/2 y P(B)=1/3. ¿Cuánto vale P(A∩B)?','La independencia permite multiplicar probabilidades marginales.',r'P(A\cap B)=(1/2)(1/3)',R(1,6),R(1,2)*R(1,3)),
 N('Una fábrica recibe 60 % de piezas de A y 40 % de B. A tiene 2 % defectuosas y B 5 %. Se elige una pieza al azar. ¿Qué probabilidad de defecto hay?','Los dos proveedores forman una partición de la producción.',r'P(D)=0.6(0.02)+0.4(0.05)',R(4,125),R(3,5)*R(1,50)+R(2,5)*R(1,20)),
 N('Una fábrica recibe 60 % de piezas de A y 40 % de B; las tasas de defecto son 2 % y 5 %. Una pieza elegida al azar es defectuosa. ¿Qué probabilidad hay de que venga de A?','Bayes pondera el origen por su contribución al evento observado.',r'P(A\mid D)=\frac{0.6(0.02)}{0.6(0.02)+0.4(0.05)}',R(3,8),(R(3,5)*R(1,50))/(R(3,5)*R(1,50)+R(2,5)*R(1,20))),
 N('Se lanza un dado justo. Sabiendo que salió par, ¿qué probabilidad hay de que sea mayor que 3?','La condición reduce el espacio a 2,4,6.',r'P=|\{4,6\}|/|\{2,4,6\}|=2/3',R(2,3),R(2,3)),
 N('A y B son mutuamente excluyentes y P(B)>0. ¿Cuál es P(A|B)?','La condición B no puede coincidir con A.',r'P(A\mid B)=0/P(B)=0',0,0),
 C('Independencia y exclusión mutua con probabilidades positivas…',['Son exactamente lo mismo.','Son diferentes: eventos excluyentes positivos no son independientes.','Exigen siempre probabilidad cero para todo.','Se deciden solo por el orden de sus nombres.'],1,['La exclusión mutua da intersección de probabilidad cero.','La independencia exigiría el producto de dos probabilidades positivas.','Ese producto no es cero, por lo que ambas condiciones no coinciden.']),
 C('Para usar P(A|B)=P(A∩B)/P(B) se exige…',['P(B)>0.','P(B)=0.','Que A y B sean iguales.','Que A y B sean siempre independientes.'],0,['La condición restringe la medida a B.','Se normaliza dividiendo entre su probabilidad.','La fórmula requiere denominador positivo.']),
],
})

for level,tasks in BANK.items():
    for task in tasks:
        if 'answer'in task and task['unit']=='' and task['answer'].is_Rational and task['answer'].q!=1:task['fractional']=True
        if 'answer'in task and int(level.split('.')[0])<13 and task['unit']=='' and task['answer'].is_integer:task['integerOnly']=True
        if level.startswith('13.')and 'answer'in task:task['bounds']=(s.Integer(0),s.Integer(1));task['fractional']=True

def authored_math(text):
    snippets={
        'x=2':r'x=2','a/2=b/3=c/5=4':r'a/2=b/3=c/5=4','a/2=b/3=c/5':r'a/2=b/3=c/5',
        'a/3=b/4':r'a/3=b/4','a/2=b/5=3':r'a/2=b/5=3','a:b:c=1:2:4':r'a:b:c=1:2:4',
        'a/2=b/3=c/4':r'a/2=b/3=c/4','a/b=b/c=2':r'a/b=b/c=2','c=3':r'c=3','a/4=b/6=2':r'a/4=b/6=2',
        'P(A)=2/5':r'P(A)=2/5','P(B)=1/3':r'P(B)=1/3','P(A∩B)=1/5':r'P(A\cap B)=1/5',
        'P(B)=1/2':r'P(B)=1/2','P(A)=1/2':r'P(A)=1/2','P(B)>0':r'P(B)>0',
    }
    for original,tex in sorted(snippets.items(),key=lambda item:-len(item[0])):
        pieces=text.split('$')
        for i in range(0,len(pieces),2):pieces[i]=pieces[i].replace(original,'$'+tex+'$')
        text='$'.join(pieces)
    return text

def build(write=False):
    production=ROOT/'shared/src/commonMain/composeResources/files/aprender/aritmetica'
    fixtures=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/aritmetica'
    kept=[production/'semana01/1.1/questions.json',production/'semana01/1.2/questions.json']
    hashes={str(p.relative_to(ROOT)):hashlib.sha256(p.read_bytes()).hexdigest()for p in kept}
    preview=[];proofs=[]
    for level,tasks in BANK.items():
        assert len(tasks)==11,(level,len(tasks))
        week,part=map(int,level.split('.'));rel=Path(f'semana{week:02}')/level/'questions.json'
        path=production/rel;old=json.loads(path.read_text(encoding='utf-8-sig'));out=[]
        for i,task in enumerate(tasks):
            qid=f'arit_t{week:02}_s{part:02}_c{i+1:02}'
            if 'answer'in task:
                options,key=choices(task['answer'],task['unit'],i%4,integer_only=task.get('integerOnly',False),fractional=task.get('fractional',False),bounds=task.get('bounds'))
                steps=[task['rule'],'Desarrollamos con los datos: $'+task['model']+'$.','El resultado es '+label(task['answer'],task['unit'],fractional=task.get('fractional',False))+'.']
                proofs.append(dict(id=qid,model=task['model'],answer=str(task['answer']),calculated=str(task['calculated']),unit=task['unit']))
            else:options,key=task['options'],task['key'];steps=task['steps']
            q=dict(id=qid,concept=f'{level}.{i+1}',type='MULTIPLE_CHOICE',subject='aritmetica',semana=week,
                statement=authored_math(task['stem']),options=options,correctIndex=key,explanation='\n'.join(f'{j+1}. {v}'for j,v in enumerate(steps)),
                fuente='Ejercicio original RASTRO; contraste en docs/aprender/aritmetica/REVISION_PRACTICA_PENDIENTE.md',pedagogicalTier='aplicación')
            out.append(q)
        assert len({q['statement']for q in out})==11,level
        assert[q['id']for q in old]==[q['id']for q in out[:len(old)]],level
        if write:
            backup=ROOT/'build/academic-backup-arithmetic-pending'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(json.dumps(out,ensure_ascii=False,indent=2)+'\n',encoding='utf8');assert(fixtures/rel).exists();shutil.copy2(path,fixtures/rel)
        preview.extend(out)
    assert all(hashlib.sha256((ROOT/p).read_bytes()).hexdigest()==digest for p,digest in hashes.items())
    (ROOT/'build/arithmetic-pending-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    (ROOT/'build/arithmetic-pending-proofs.json').write_text(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),conceptualQuestions=len(preview)-len(proofs),preservedHashes=hashes,proofs=proofs),ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),written=write)))

if __name__=='__main__':
    parser=argparse.ArgumentParser();parser.add_argument('--write',action='store_true');build(parser.parse_args().write)
