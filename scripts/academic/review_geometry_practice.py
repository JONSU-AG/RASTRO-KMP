"""Explicit geometry practice; preserves the reviewed triangle/circle pilots."""
from pathlib import Path
import json,shutil,argparse,hashlib
from review_physics_practice import N,C,R,pi,sqrt,s,choices,label,ROOT
BANK={
'1.1':[
 N('B está entre A y C sobre una recta. AB=4 cm y BC=7 cm. ¿Cuánto mide AC?','La adición de segmentos usa el orden indicado.',r'AC=AB+BC=4+7',11,4+7,'cm'),
 N('B está entre A y C. AC=15 cm y AB=6 cm. ¿Cuánto mide BC?','Restamos la parte conocida del segmento completo.',r'BC=AC-AB=15-6',9,15-6,'cm'),
 N('M es punto medio de AB y AB=18 cm. ¿Cuánto mide AM?','El punto medio divide en dos segmentos iguales.',r'AM=AB/2=18/2',9,R(18,2),'cm'),
 N('Dos ángulos son complementarios. Uno mide 35°. ¿Cuánto mide el otro?','Los complementarios suman 90°.',r'\beta=90^\circ-35^\circ',55,90-35,r'^\circ'),
 N('Dos ángulos son suplementarios. Uno mide 128°. ¿Cuánto mide el otro?','Los suplementarios suman 180°.',r'\beta=180^\circ-128^\circ',52,180-128,r'^\circ'),
 N('Una bisectriz divide un ángulo de 74° en dos partes. ¿Cuánto mide cada una?','La bisectriz produce dos ángulos iguales.',r'\alpha=74^\circ/2',37,R(74,2),r'^\circ'),
 N('Alrededor de un punto hay cuatro ángulos consecutivos de 80°, 90°, 100° y x. Sin superposición completan una vuelta. ¿Cuánto vale x?','Una vuelta completa suma 360°.',r'x=360^\circ-80^\circ-90^\circ-100^\circ',90,360-80-90-100,r'^\circ'),
 N('Un ángulo de 60° se divide en tres partes iguales. ¿Cuánto mide cada parte?','La trisección reparte la amplitud en tres.',r'\alpha=60^\circ/3',20,R(60,3),r'^\circ'),
 N('A, B y C están en ese orden. AB=3x cm, BC=2x cm y AC=20 cm. ¿Cuánto vale x?','La suma de las partes iguala al total.',r'3x+2x=20\Rightarrow x=4',4,R(20,5)),
 C('Un ángulo recto mide…',['45°.','90°.','180°.','360°.'],1,['La vuelta completa tiene 360°.','Un ángulo recto es un cuarto de vuelta.','Su medida es 90°.']),
 C('Para sumar AB+BC y obtener AC se necesita que…',['A, B y C sean puntos cualesquiera del plano.','B esté entre A y C sobre la misma recta.','Los tres puntos formen un triángulo.','AB y BC sean perpendiculares.'],1,['La adición de segmentos depende del orden sobre una recta.','B debe separar las dos partes contiguas sin superposición.','En esa configuración AB+BC=AC.']),
],
'1.2':[
 N('Dos rectas se cruzan. Un ángulo mide 68°. ¿Cuánto mide su opuesto por el vértice?','Los opuestos por el vértice tienen igual medida.',r'\beta=68^\circ',68,68,r'^\circ'),
 N('Dos rectas se cruzan. Un ángulo mide 68°. ¿Cuánto mide el adyacente que completa un ángulo llano?','Los adyacentes indicados son suplementarios.',r'\beta=180^\circ-68^\circ',112,180-68,r'^\circ'),
 N('Dos rectas paralelas son cortadas por una secante. Un ángulo interior mide 73°. ¿Cuánto mide su alterno interno?','Los alternos internos son iguales cuando las rectas son paralelas.',r'\beta=73^\circ',73,73,r'^\circ'),
 N('Dos paralelas son cortadas por una secante. Un ángulo interior mide 110°. ¿Cuánto mide el interior del mismo lado de la secante?','Los interiores del mismo lado son suplementarios.',r'\beta=180^\circ-110^\circ',70,180-110,r'^\circ'),
 N('Dos paralelas son cortadas por una secante. Un ángulo mide 42°. ¿Cuánto mide el correspondiente?','Los correspondientes tienen igual medida.',r'\beta=42^\circ',42,42,r'^\circ'),
 N('Dos paralelas son cortadas por una secante. Un par de alternos internos mide 3x y 75°. ¿Cuánto vale x?','La condición de paralelismo permite igualar ambos ángulos.',r'3x=75\Rightarrow x=25',25,R(75,3)),
 N('Los ángulos interiores del mismo lado entre dos paralelas miden 2x y 4x. ¿Cuánto vale x?','Ambos ángulos suman 180°.',r'2x+4x=180\Rightarrow x=30',30,R(180,6)),
 N('Dos rectas perpendiculares forman cuatro ángulos iguales. ¿Cuánto mide cada uno?','La vuelta completa se reparte en cuatro ángulos.',r'\alpha=360^\circ/4',90,R(360,4),r'^\circ'),
 N('Un ángulo obtuso mide 130°. ¿Cuánto mide el ángulo agudo que una secante forma con las mismas paralelas?','Los valores agudo y obtuso asociados son suplementarios.',r'\alpha=180^\circ-130^\circ',50,180-130,r'^\circ'),
 C('La igualdad de ángulos alternos internos permite concluir paralelismo cuando…',['Son los ángulos alternos de una misma secante a las dos rectas.','Son dos ángulos cualesquiera del dibujo.','Uno de ellos mide 0°.','Las rectas ya se cortan en el mismo punto de la secante.'],0,['El criterio compara posiciones específicas respecto de una secante.','La igualdad en esa configuración es el recíproco del teorema de paralelas.','La posición de los ángulos importa tanto como sus medidas.']),
 C('Dos rectas distintas del mismo plano son paralelas si…',['Se cortan en un único punto.','No tienen puntos en común.','Son ambas de longitud finita.','Forman siempre un ángulo recto.'],1,['Una recta euclidiana se prolonga indefinidamente.','Dos rectas coplanares paralelas no se encuentran.','No basta que dos segmentos dibujados parezcan no tocarse.']),
],
'2.1':[
 N('Calcula la pendiente de la recta por (1,2) y (3,6).','La pendiente compara variación vertical y horizontal.',r'm=(6-2)/(3-1)',2,R(6-2,3-1)),
 N(r'En $y=3x-2$, ¿cuál es la pendiente?','La forma y=mx+b muestra el coeficiente de x.',r'm=3',3,3),
 N(r'En $y=3x-2$, ¿cuál es la ordenada al origen?','La ordenada al origen se obtiene cuando x=0.',r'y(0)=3(0)-2',-2,3*0-2),
 N('Una recta tiene pendiente 2 y pasa por (0,3). ¿Qué valor de y tiene en x=4?','Construimos y=2x+3 y evaluamos.',r'y=2(4)+3',11,2*4+3),
 N('Una recta horizontal pasa por (2,5). ¿Qué ordenada tiene en x=10?','Una recta horizontal conserva su coordenada y.',r'y=5',5,5),
 N('Una recta vertical pasa por (−3,2). ¿Qué abscisa tienen todos sus puntos?','Una recta vertical conserva su coordenada x.',r'x=-3',-3,-3),
 N('La recta pasa por (0,1) y (2,5). ¿Cuál es su ordenada en x=3?','La pendiente es 2 y la ordenada inicial es 1.',r'm=(5-1)/2=2;\quad y=2(3)+1',7,R(5-1,2)*3+1),
 N(r'Para $2x+y=8$, calcula y cuando x=3.','Despejamos y y sustituimos.',r'y=8-2(3)',2,8-2*3),
 N('Una recta sube 6 unidades por cada avance de 3 unidades hacia la derecha. ¿Cuál es su pendiente?','La pendiente es subida dividida entre avance.',r'm=6/3',2,R(6,3)),
 C('Una recta vertical tiene pendiente…',['Cero.','Uno.','No definida como número real finito.','Siempre positiva.'],2,['La variación de x entre dos puntos de esa recta es cero.','La fórmula de pendiente requeriría dividir entre cero.','Se representa con x constante, no con una pendiente real finita.']),
 C(r'El punto $(x_0,y_0)$ pertenece a una recta si…',['Solo x0 es positivo.','Sus coordenadas satisfacen la ecuación de la recta.','La pendiente coincide con y0.','Siempre que x0=y0.'],1,['La ecuación expresa la condición que cumplen sus puntos.','Se sustituyen ambas coordenadas.','La igualdad debe verificarse para pertenecer a la recta.']),
],
'2.2':[
 N('¿Qué pendiente tiene una recta perpendicular a otra de pendiente 2?','Para pendientes finitas no nulas, el producto es −1.',r'm_2=-1/2',R(-1,2),R(-1,2)),
 N('Una recta tiene pendiente −3. ¿Qué pendiente tiene otra paralela no vertical?','Rectas paralelas no verticales comparten pendiente.',r'm_2=m_1=-3',-3,-3),
 N('Calcula la distancia entre (1,2) y (4,6).','Usamos la norma de la diferencia de coordenadas.',r'd=\sqrt{(4-1)^2+(6-2)^2}',5,sqrt((4-1)**2+(6-2)**2)),
 N('¿Cuál es la coordenada x del punto medio entre (2,4) y (8,10)?','El punto medio promedia cada coordenada.',r'x_M=(2+8)/2',5,R(2+8,2)),
 N('¿Cuál es la coordenada y del punto medio entre (2,4) y (8,10)?','Promediamos las ordenadas.',r'y_M=(4+10)/2',7,R(4+10,2)),
 N(r'¿Qué distancia hay del punto (0,0) a la recta $3x+4y-10=0$?','La fórmula usa la normal de la recta.',r'd=|3(0)+4(0)-10|/\sqrt{3^2+4^2}',2,abs(-10)/sqrt(9+16)),
 N(r'¿Qué distancia separa las rectas paralelas $y=2$ e $y=7$?','La distancia es la diferencia absoluta de sus ordenadas.',r'd=|7-2|',5,abs(7-2)),
 N(r'Las rectas $y=x+1$ e $y=-x+5$ se cortan. ¿Qué x tiene su intersección?','Igualamos las dos expresiones de y.',r'x+1=-x+5\Rightarrow2x=4',2,R(5-1,2)),
 N('¿Qué ángulo menor forman una recta horizontal y una vertical?','Las direcciones horizontal y vertical son perpendiculares.',r'\theta=90^\circ',90,90,r'^\circ'),
 C('Dos rectas con iguales pendientes y distintas ordenadas al origen son…',['Coincidentes.','Paralelas distintas.','Perpendiculares.','Siempre verticales.'],1,['La pendiente fija la dirección.','Una distinta ordenada desplaza la recta sin cambiar esa dirección.','Por eso son paralelas y no coinciden.']),
 C('La distancia de un punto a una recta se mide…',['Sobre cualquier segmento oblicuo.','Por la perpendicular desde el punto a la recta.','Solo sobre el eje x.','Como suma de las coordenadas del punto.'],1,['Se busca la menor longitud hasta la recta.','La perpendicular realiza esa distancia mínima.','Un segmento oblicuo sería más largo.']),
],
'3.2':[
 N('Dos triángulos semejantes tienen razón de lados grande/pequeño igual a 3. Un lado pequeño mide 4 cm. ¿Cuánto mide el correspondiente grande?','Los lados correspondientes conservan la razón de semejanza.',r'L=3(4)',12,3*4,'cm'),
 N('Dos triángulos semejantes tienen razón de lados grande/pequeño igual a 2. El área pequeña es 7 cm². ¿Cuál es la grande?','Las áreas escalan con el cuadrado de la razón lineal.',r'S_g=2^2(7)',28,2**2*7,r'cm^2'),
 N('Dos triángulos semejantes tienen perímetros 18 y 30 cm. ¿Cuál es la razón del grande al pequeño?','El perímetro escala como cualquier longitud.',r'k=30/18=5/3',R(5,3),R(30,18)),
 N('En un triángulo, el segmento que une puntos medios de dos lados es paralelo al tercero, de 16 cm. ¿Cuánto mide ese segmento medio?','El triángulo menor tiene escala un medio.',r'm=16/2',8,R(16,2),'cm'),
 N('Dos triángulos congruentes tienen lados correspondientes de 5 cm y x cm. ¿Cuánto vale x?','La congruencia conserva cada longitud.',r'x=5',5,5,'cm'),
 N('Un triángulo semejante a otro de área 12 cm² tiene lados tres veces mayores. ¿Qué área tiene?','La razón de áreas es el cuadrado de la razón de lados.',r'S=12(3^2)',108,12*3**2,r'cm^2'),
 N('Dos triángulos semejantes tienen áreas 25 y 100 cm². ¿Cuál es la razón de lados grande/pequeño?','La razón lineal es la raíz positiva de la razón de áreas.',r'k=\sqrt{100/25}',2,sqrt(R(100,25))),
 N('Una vara de 2 m proyecta sombra de 3 m. Al mismo tiempo y en suelo horizontal, un poste proyecta sombra de 12 m. ¿Qué altura tiene el poste?','Los rayos solares paralelos generan triángulos semejantes.',r'h/12=2/3\Rightarrow h=8',8,12*R(2,3),'m'),
 N('Dos triángulos semejantes tienen razón de lados grande/pequeño de 5/2. La altura pequeña correspondiente mide 6 cm. ¿Cuánto mide la grande?','Las alturas correspondientes escalan con la misma razón.',r'h_g=(5/2)6',15,R(5,2)*6,'cm'),
 C('El criterio LAL de congruencia requiere…',['Dos lados y el ángulo comprendido iguales a sus correspondientes.','Dos lados y cualquier ángulo.','Solo tres ángulos iguales.','Solo el mismo perímetro.'],0,['Los dos lados dados deben emparejarse.','El ángulo igual debe quedar entre esos dos lados.','Esa configuración determina la congruencia.']),
 C('Dos triángulos con sus tres ángulos correspondientes iguales son…',['Siempre congruentes.','Semejantes, pero pueden tener tamaños distintos.','Necesariamente equiláteros.','Siempre de igual área.'],1,['Los ángulos determinan la forma.','No fijan la escala de longitud.','Por eso garantizan semejanza y no necesariamente congruencia.']),
],
'4.1':[
 N('Un triángulo rectángulo tiene catetos de 5 y 12 cm. ¿Cuál es su hipotenusa?','Aplicamos Pitágoras.',r'c=\sqrt{5^2+12^2}',13,sqrt(25+144),'cm'),
 N('Un triángulo rectángulo tiene hipotenusa de 10 cm y un cateto de 6 cm. ¿Cuánto mide el otro?','Restamos el cuadrado conocido del de la hipotenusa.',r'b=\sqrt{10^2-6^2}',8,sqrt(100-36),'cm'),
 N('La altura a la hipotenusa de un triángulo rectángulo divide esa hipotenusa en 4 y 9 cm. ¿Cuánto mide la altura?','La altura es media geométrica de las proyecciones.',r'h^2=4(9)\Rightarrow h=6',6,sqrt(4*9),'cm'),
 N('Una hipotenusa mide 25 cm y la proyección de un cateto sobre ella mide 9 cm. ¿Cuánto mide ese cateto?','El cuadrado del cateto equivale a hipotenusa por su proyección.',r'a^2=25(9)\Rightarrow a=15',15,sqrt(25*9),'cm'),
 N('Un triángulo rectángulo tiene catetos de 6 y 8 cm. ¿Cuánto mide la altura a la hipotenusa?','Igualamos dos expresiones del área.',r'c=10;\quad h=6(8)/10',R(24,5),R(6*8,10),'cm'),
 N('Una bisectriz interior divide el lado opuesto en segmentos proporcionales a 6:9. Ese lado mide 10 cm. ¿Cuánto mide la parte menor?','El teorema de bisectriz conserva la razón de los lados adyacentes.',r'm=10\frac6{6+9}',4,10*R(6,15),'cm'),
 N('Dos segmentos son proporcionales: 3/5=x/20. ¿Cuánto vale x?','Multiplicamos ambos miembros por el denominador no nulo.',r'x=20(3/5)',12,20*R(3,5)),
 N('En un triángulo rectángulo de hipotenusa 20 cm, ¿cuánto mide la mediana trazada al ángulo recto?','El punto medio de la hipotenusa equidista de los tres vértices.',r'm=c/2=20/2',10,R(20,2),'cm'),
 N('Una recta paralela a un lado de un triángulo genera un triángulo menor semejante. La razón menor/mayor es 2/3 y el lado mayor correspondiente mide 15 cm. ¿Cuánto mide el menor?','Las paralelas conservan las proporciones de los lados.',r'l=(2/3)15',10,R(2,3)*15,'cm'),
 C('En h²=mn para la altura a la hipotenusa, m y n son…',['Los dos catetos completos.','Las dos proyecciones que la altura determina sobre la hipotenusa.','Dos ángulos interiores.','Los radios de dos círculos.'],1,['La altura divide la hipotenusa en dos segmentos.','Los triángulos resultantes son semejantes al original.','De esa semejanza se obtiene h²=mn.']),
 C('La bisectriz interior divide el lado opuesto…',['Siempre en partes iguales.','En la razón de los lados adyacentes al ángulo bisecado.','En la razón de las áreas de los otros dos lados.','Siempre en razón 1:2.'],1,['La bisectriz divide en dos el ángulo del vértice.','Los subtriángulos comparten la altura al lado opuesto.','Sus bases quedan en la razón de los dos lados adyacentes.']),
],
'4.2':[
 N('Un triángulo tiene dos lados de 5 cm y base de 6 cm. ¿Cuánto mide la mediana trazada a la base?','En el isósceles, esa mediana también es altura.',r'm=\sqrt{5^2-3^2}',4,sqrt(25-9),'cm'),
 N('Un triángulo tiene lados b=5, c=7 y a=6 cm. ¿Cuánto mide la mediana al lado a?','Aplicamos el teorema de Apolonio.',r'm_a=\tfrac12\sqrt{2(5^2)+2(7^2)-6^2}',2*sqrt(7),sqrt(2*25+2*49-36)/2,'cm'),
 N('Dos cuerdas se cortan dentro de una circunferencia. Una queda dividida en 2 y 6 cm, la otra en 3 y x cm. ¿Cuánto vale x?','Los productos de segmentos de cuerdas son iguales.',r'2(6)=3x\Rightarrow x=4',4,R(2*6,3),'cm'),
 N('Desde un punto exterior una secante tiene segmento exterior 3 cm y longitud total 12 cm. ¿Qué longitud tiene una tangente desde el mismo punto?','El cuadrado de la tangente iguala exterior por total.',r't^2=3(12)\Rightarrow t=6',6,sqrt(3*12),'cm'),
 N('Desde un punto exterior salen dos secantes. Una tiene exterior 2 cm y total 18 cm; la otra exterior 4 cm. ¿Cuál es la longitud total de la segunda?','Las dos secantes tienen la misma potencia.',r'2(18)=4L\Rightarrow L=9',9,R(2*18,4),'cm'),
 N('Un punto está a 13 cm del centro de una circunferencia de radio 5 cm. ¿Cuánto mide una tangente desde ese punto?','Radio y tangente forman un triángulo rectángulo en el contacto.',r't=\sqrt{13^2-5^2}',12,sqrt(169-25),'cm'),
 N('Un triángulo de lados 3 y 4 cm tiene ángulo comprendido de 60°. ¿Cuál es el cuadrado del lado opuesto?','Usamos la ley de cosenos.',r'a^2=3^2+4^2-2(3)(4)\cos60^\circ',13,9+16-2*3*4*s.cos(pi/3),r'cm^2'),
 N('Una cuerda de 16 cm pertenece a una circunferencia de radio 10 cm. ¿A qué distancia del centro está?','La perpendicular del centro biseca la cuerda.',r'd=\sqrt{10^2-8^2}',6,sqrt(100-64),'cm'),
 N('Un punto está a 10 cm del centro de una circunferencia de radio 6 cm. ¿Qué potencia tiene respecto de ella?','La potencia es distancia al centro al cuadrado menos radio al cuadrado.',r'\operatorname{Pot}=10^2-6^2',64,100-36,r'cm^2'),
 C('En el producto exterior×total de una secante, la longitud total…',['Incluye el tramo exterior y el interior de la circunferencia.','Es solo la parte interior.','Es siempre el radio.','Es siempre el diámetro.'],0,['La secante sale del punto exterior y atraviesa el círculo.','El tramo total llega hasta la segunda intersección.','Confundirlo con el tramo interior altera la potencia.']),
 C('Dos cuerdas que se cortan dentro de una circunferencia cumplen…',['La suma de segmentos de una iguala siempre al radio.','El producto de los segmentos de una iguala al de la otra.','Todos sus segmentos son iguales.','Ambas deben pasar por el centro.'],1,['La potencia del punto de intersección es la misma para ambas secantes.','Al considerar las longitudes interiores se igualan sus productos.','No se requiere que las cuerdas sean diámetros.']),
],
'5.1':[
 N('Un punto equidista de A y B y se encuentra en la mediatriz de AB. Si PA=7 cm, ¿cuánto mide PB?','La mediatriz es el lugar de puntos equidistantes de los extremos.',r'PB=PA=7',7,7,'cm'),
 N('Un punto interior de un ángulo está en su bisectriz. Si su distancia perpendicular a un lado es 3 cm, ¿cuál es la distancia al otro?','Los puntos de la bisectriz equidistan de los lados.',r'd_2=d_1=3',3,3,'cm'),
 N('En un triángulo, una mediana mide 12 cm. ¿Qué distancia hay del vértice al baricentro sobre ella?','El baricentro divide la mediana en razón 2:1 desde el vértice.',r'VG=\tfrac23(12)',8,R(2,3)*12,'cm'),
 N('Una mediana mide 15 cm. ¿Qué distancia hay del baricentro al punto medio del lado opuesto?','Ese tramo es un tercio de la mediana.',r'GM=15/3',5,R(15,3),'cm'),
 N('Un triángulo rectángulo tiene hipotenusa 14 cm. ¿Cuál es su circunradio?','El circuncentro está en el punto medio de la hipotenusa.',r'R=14/2',7,R(14,2),'cm'),
 N('Un triángulo tiene área 24 cm² y semiperímetro 12 cm. ¿Cuál es su inradio?','El área es inradio por semiperímetro.',r'r=S/s=24/12',2,R(24,12),'cm'),
 N('Un triángulo equilátero tiene lado 6 cm. ¿Qué altura tiene?','La altura forma un triángulo rectángulo con medio lado.',r'h=\sqrt{6^2-3^2}=3\sqrt3',3*sqrt(3),sqrt(36-9),'cm'),
 N('Un triángulo equilátero tiene altura 9 cm. ¿Cuál es su inradio?','El centro común está a un tercio de la altura desde la base.',r'r=h/3=9/3',3,R(9,3),'cm'),
 N('Un triángulo equilátero tiene altura 9 cm. ¿Cuál es su circunradio?','El centro común está a dos tercios de la altura desde el vértice.',r'R=2h/3=2(9)/3',6,R(2*9,3),'cm'),
 C('El incentro es la intersección de…',['Las medianas.','Las bisectrices interiores.','Las alturas.','Las mediatrices.'],1,['La bisectriz reúne puntos equidistantes de dos lados.','La intersección de las bisectrices interiores equidista de los tres lados.','Ese punto es el centro de la circunferencia inscrita.']),
 C('El circuncentro se encuentra en…',['La intersección de mediatrices.','La intersección de medianas obligatoriamente.','Cualquier vértice.','El pie de cualquier altura.'],0,['Cada mediatriz reúne puntos equidistantes de dos vértices.','Su intersección equidista de los tres vértices.','Ese punto es el centro de la circunferencia circunscrita.']),
],
'5.2':[
 N('En un triángulo no equilátero, O y H son circuncentro y ortocentro. Si OG=4 cm, ¿cuánto mide GH, siendo G el baricentro?','El baricentro divide OH en razón 1:2.',r'GH=2OG=2(4)',8,2*4,'cm'),
 N('En la recta de Euler de un triángulo no equilátero, OH=18 cm. ¿Cuánto mide OG?','G está entre O y H y OG es un tercio de OH.',r'OG=18/3',6,R(18,3),'cm'),
 N('Una circunferencia circunscrita tiene radio 10 cm. ¿Qué radio tiene la circunferencia de nueve puntos del triángulo?','Su radio es la mitad del circunradio.',r'R_9=R/2=10/2',5,R(10,2),'cm'),
 N('Un triángulo tiene circunradio 5 cm e inradio 2 cm. ¿Qué distancia OI hay entre sus centros?','La fórmula de Euler relaciona R, r y la distancia entre centros.',r'OI^2=R(R-2r)=5(5-4)',sqrt(5),sqrt(5*(5-2*2)),'cm'),
 N('Un triángulo tiene circunradio 6 cm. ¿Cuál es el mayor inradio que permite la desigualdad de Euler?','La desigualdad exige R≥2r.',r'r\le R/2=6/2',3,R(6,2),'cm'),
 N('En un triángulo no equilátero, GH=10 cm sobre la recta de Euler. ¿Cuánto mide OG?','La razón OG:GH es 1:2.',r'OG=10/2',5,R(10,2),'cm'),
 N('En un triángulo rectángulo, los catetos miden 6 y 8 cm. ¿Qué distancia hay del vértice recto al circuncentro?','El circuncentro es el punto medio de la hipotenusa.',r'c=\sqrt{6^2+8^2}=10;\quad d=c/2',5,sqrt(36+64)/2,'cm'),
 N('En un triángulo, N es el punto medio entre O y H. Si OH=12 cm, ¿cuánto mide ON?','El centro de la circunferencia de nueve puntos está en el punto medio de OH.',r'ON=OH/2=12/2',6,R(12,2),'cm'),
 N('Un triángulo equilátero tiene inradio 4 cm. ¿Cuál es su circunradio?','En el equilátero se alcanza R=2r.',r'R=2(4)',8,2*4,'cm'),
 C('El ortocentro de un triángulo obtusángulo está…',['Siempre en el interior.','Fuera del triángulo.','Siempre en el punto medio de un lado.','Siempre sobre la circunferencia inscrita.'],1,['Las alturas son rectas perpendiculares a los lados opuestos.','En un triángulo obtusángulo se deben prolongar algunas de ellas.','Su intersección queda fuera del triángulo.']),
 C('En un triángulo equilátero, baricentro, incentro, circuncentro y ortocentro…',['Son cuatro puntos distintos.','Coinciden.','Están todos fuera.','Coinciden solo dos de ellos.'],1,['Las líneas notables coinciden por simetría.','Su intersección define el mismo centro.','No se determina una recta de Euler única mediante dos centros distintos en este caso.']),
],
'6.1':[
 N('¿Cuánto suman los ángulos interiores de un pentágono simple?','Un polígono simple de n lados se triangula en n−2 triángulos.',r'S=(5-2)180^\circ',540,(5-2)*180,r'^\circ'),
 N('¿Cuánto mide cada ángulo interior de un hexágono regular?','Dividimos la suma interior entre los seis ángulos iguales.',r'\alpha=(6-2)180^\circ/6',120,R((6-2)*180,6),r'^\circ'),
 N('¿Cuánto mide cada ángulo exterior de un octágono regular convexo?','Los giros exteriores completan una vuelta.',r'\beta=360^\circ/8',45,R(360,8),r'^\circ'),
 N('¿Cuántas diagonales tiene un pentágono?','Cada vértice se une a n−3 no adyacentes y cada diagonal se cuenta dos veces.',r'D=5(5-3)/2',5,R(5*(5-3),2)),
 N('¿Cuántas diagonales salen de un vértice de un heptágono?','Se excluyen el propio vértice y los dos vecinos.',r'd=7-3',4,7-3),
 N('Un polígono regular tiene ángulo exterior de 30°. ¿Cuántos lados tiene?','El giro completo se reparte en ángulos exteriores iguales.',r'n=360/30',12,R(360,30)),
 N('La suma de ángulos interiores de un polígono simple es 720°. ¿Cuántos lados tiene?','Despejamos n en la suma interior.',r'(n-2)180=720\Rightarrow n=6',6,R(720,180)+2),
 N('Un decágono regular tiene lado 3 cm. ¿Qué perímetro tiene?','El perímetro suma diez lados iguales.',r'P=10(3)',30,10*3,'cm'),
 N('¿Cuánto mide el ángulo central entre vértices consecutivos de un polígono regular de nueve lados?','El centro reparte la vuelta en nueve sectores iguales.',r'\theta=360^\circ/9',40,R(360,9),r'^\circ'),
 C('Un polígono regular tiene…',['Solo todos sus lados iguales, sin condición angular.','Todos sus lados y todos sus ángulos interiores iguales.','Siempre cuatro lados.','Solo todos sus ángulos iguales, sin condición sobre lados.'],1,['La regularidad exige dos condiciones simultáneas.','Igualdad de lados e igualdad de ángulos.','Una sola de ellas no basta en un polígono general.']),
 C('La suma de un ángulo exterior de giro por vértice en un polígono convexo recorrido en un sentido es…',['180°.','360°.','Depende solo del tamaño de los lados.','90°.'],1,['Al completar el recorrido se recupera la dirección inicial.','El giro acumulado es una vuelta.','Su medida es 360°.']),
],
}

BANK.update({
'6.2':[
 N('Un rectángulo tiene lados de 3 y 4 cm. ¿Qué longitud tiene su diagonal?','La diagonal forma un triángulo rectángulo.',r'd=\sqrt{3^2+4^2}',5,sqrt(9+16),'cm'),
 N('Un paralelogramo tiene base 8 cm y altura perpendicular 5 cm. ¿Qué área tiene?','El área usa base por altura, no por lado oblicuo.',r'S=bh=8(5)',40,8*5,r'cm^2'),
 N('Un rombo tiene diagonales de 6 y 8 cm. ¿Qué área tiene?','Las diagonales de un rombo son perpendiculares.',r'S=d_1d_2/2=6(8)/2',24,R(6*8,2),r'cm^2'),
 N('Un rombo tiene diagonales de 6 y 8 cm. ¿Cuánto mide cada lado?','Las semidiagonales forman un triángulo rectángulo.',r'l=\sqrt{3^2+4^2}',5,sqrt(9+16),'cm'),
 N('Un trapecio tiene bases paralelas de 6 y 10 cm y altura de 4 cm. ¿Cuál es su área?','Multiplicamos la media de las bases por la altura.',r'S=(6+10)4/2',32,R((6+10)*4,2),r'cm^2'),
 N('Un trapecio tiene bases de 7 y 13 cm. ¿Cuánto mide el segmento que une los puntos medios de los lados no paralelos?','La mediana del trapecio es la semisuma de las bases.',r'm=(7+13)/2',10,R(7+13,2),'cm'),
 N('Un cuadrado tiene diagonal de 6 cm. ¿Qué área tiene?','La diagonal al cuadrado equivale a dos lados al cuadrado.',r'S=d^2/2=6^2/2',18,R(36,2),r'cm^2'),
 N('En un paralelogramo, un ángulo interior mide 70°. ¿Cuánto mide el consecutivo?','Los consecutivos de un paralelogramo son suplementarios.',r'\beta=180^\circ-70^\circ',110,180-70,r'^\circ'),
 N('Un cuadrado tiene lado 5 cm. ¿Qué perímetro tiene?','Tiene cuatro lados iguales.',r'P=4(5)',20,4*5,'cm'),
 C('Todo cuadrado es también…',['Un rectángulo y un rombo.','Un cuadrilátero sin lados paralelos.','Un trapecio con exactamente un par de lados paralelos.','Una figura con diagonales desiguales.'],0,['El cuadrado tiene cuatro ángulos rectos y cuatro lados iguales.','Cumple la definición de rectángulo y de rombo.','Las clasificaciones no tienen que excluirse entre sí.']),
 C('En un paralelogramo, las diagonales…',['Siempre son iguales.','Siempre son perpendiculares.','Se bisecan mutuamente.','Siempre forman cuatro triángulos equiláteros.'],2,['El punto de intersección divide cada diagonal en dos partes iguales.','Esa propiedad es común a todos los paralelogramos.','Igualdad y perpendicularidad corresponden a casos especiales.']),
],
'7.2':[
 N('Un cuadrilátero convexo está inscrito en una circunferencia. Un ángulo mide 70°. ¿Cuánto mide el opuesto?','Los opuestos de un cuadrilátero cíclico suman 180°.',r'\beta=180^\circ-70^\circ',110,180-70,r'^\circ'),
 N('Los cuatro lados de un cuadrilátero convexo son tangentes a una misma circunferencia. Sus lados consecutivos miden 5, 6, 7 y x cm. ¿Cuánto vale x?','Pitot iguala las sumas de lados opuestos en esta figura.',r'5+7=6+x\Rightarrow x=6',6,5+7-6,'cm'),
 N('Un triángulo rectángulo tiene catetos de 3 y 4 cm e hipotenusa de 5 cm. ¿Cuál es su inradio?','La fórmula del triángulo rectángulo relaciona catetos e hipotenusa.',r'r=(3+4-5)/2',1,R(3+4-5,2),'cm'),
 N('Desde un mismo punto exterior se trazan dos tangentes a una circunferencia. Una mide 9 cm. ¿Cuánto mide la otra?','Los segmentos tangentes desde el mismo punto tienen igual longitud.',r't_2=t_1=9',9,9,'cm'),
 N('Dos secantes se cruzan fuera de una circunferencia. Los arcos interceptados por el ángulo exterior y su prolongación miden 140° y 60°. ¿Cuánto mide ese ángulo exterior?','El ángulo exterior es la mitad de la diferencia de arcos.',r'\alpha=(140^\circ-60^\circ)/2',40,R(140-60,2),r'^\circ'),
 N('Dos cuerdas se cortan dentro de una circunferencia. Los arcos opuestos interceptados por un ángulo y su opuesto por el vértice miden 100° y 80°. ¿Cuánto mide ese ángulo?','El ángulo interior es la mitad de la suma de esos arcos.',r'\alpha=(100^\circ+80^\circ)/2',90,R(100+80,2),r'^\circ'),
 N('Un ángulo inscrito intercepta un arco de 120° que no contiene su vértice. ¿Cuánto mide el ángulo?','El ángulo inscrito mide la mitad del arco interceptado.',r'\alpha=120^\circ/2',60,R(120,2),r'^\circ'),
 N('Una tangente y una cuerda forman un ángulo que intercepta un arco de 80°. ¿Cuánto mide ese ángulo semiinscrito?','La medida es la mitad del arco interceptado correspondiente.',r'\alpha=80^\circ/2',40,R(80,2),r'^\circ'),
 N('Desde un punto exterior, una tangente mide 8 cm. Una secante desde ese punto tiene segmento exterior 4 cm. ¿Cuánto mide la secante total?','Igualamos tangente al cuadrado con exterior por total.',r'8^2=4L\Rightarrow L=16',16,R(64,4),'cm'),
 C('Pitot afirma una condición necesaria para un cuadrilátero tangencial:…',['Sus lados opuestos son siempre iguales uno a uno.','Las sumas de los pares de lados opuestos son iguales.','Todas sus diagonales son diámetros.','Sus cuatro ángulos son rectos.'],1,['Los segmentos tangentes desde cada vértice son iguales por pares.','Al sumar lados opuestos se reúnen los mismos cuatro tramos tangentes.','Se igualan las sumas; no se deduce igualdad individual de lados.']),
 C('Si un cuadrilátero convexo está inscrito en una circunferencia, sus ángulos opuestos…',['Son siempre iguales.','Suman 90°.','Suman 180°.','Suman 360°.'],2,['Los arcos que interceptan dos ángulos opuestos completan la circunferencia.','Cada ángulo inscrito es la mitad de su arco.','La suma de ambos es media vuelta.']),
],
'8.1':[
 N('Un triángulo tiene base 12 cm y altura perpendicular 5 cm. ¿Qué área tiene?','El área triangular es la mitad del rectángulo de igual base y altura.',r'S=12(5)/2',30,R(12*5,2),r'cm^2'),
 N('Un triángulo tiene lados de 13, 14 y 15 cm. Calcula su área.','Usamos Herón con semiperímetro 21.',r'S=\sqrt{21(21-13)(21-14)(21-15)}',84,sqrt(21*8*7*6),r'cm^2'),
 N('Un triángulo equilátero tiene lado 4 cm. ¿Cuál es su área?','La altura es lado por √3/2.',r'S=4^2\sqrt3/4',4*sqrt(3),16*sqrt(3)/4,r'cm^2'),
 N('Un triángulo tiene área 40 cm² y base 10 cm. ¿Qué altura corresponde a esa base?','Despejamos la altura de S=bh/2.',r'h=2S/b=2(40)/10',8,R(2*40,10),'cm'),
 N('Dos triángulos comparten la misma altura y tienen bases de 4 y 10 cm. El primero tiene área 12 cm². ¿Qué área tiene el segundo?','Con altura común, las áreas son proporcionales a las bases.',r'S_2=12(10/4)',30,12*R(10,4),r'cm^2'),
 N('Un triángulo de área 36 cm² se divide mediante una mediana. ¿Qué área tiene cada parte?','La mediana produce bases iguales y altura común.',r'S_1=S_2=36/2',18,R(36,2),r'cm^2'),
 N('Las tres medianas de un triángulo de área 30 cm² determinan seis triángulos pequeños. ¿Qué área tiene cada uno?','Las medianas forman seis regiones triangulares de igual área.',r'S_p=30/6',5,R(30,6),r'cm^2'),
 N('Un triángulo tiene semiperímetro 10 cm e inradio 3 cm. ¿Qué área tiene?','El área se suma desde los tres lados usando el inradio como altura.',r'S=sr=10(3)',30,10*3,r'cm^2'),
 N('Un triángulo de lados 5, 6 y 7 cm tiene perímetro P. ¿Cuánto vale P?','El perímetro es suma de las longitudes de sus lados.',r'P=5+6+7',18,5+6+7,'cm'),
 C('La altura de un triángulo correspondiente a una base es…',['Cualquier lado vecino de la base.','La distancia perpendicular del vértice opuesto a la recta que contiene esa base.','Siempre una mediana.','Siempre un segmento interior.'],1,['La altura depende de la base elegida.','Se mide perpendicularmente a la recta de esa base.','En un triángulo obtusángulo puede quedar fuera de la región triangular.']),
 C('Al multiplicar todas las longitudes de una figura plana por k>0, su área se multiplica por…',[r'$k$',r'$k^2$',r'$k^3$','No cambia.'],1,['El área combina dos dimensiones lineales.','Cada una recibe el factor k.','El factor total es k².']),
],
'8.2':[
 N('Un círculo tiene radio 5 cm. ¿Cuál es su área?','El área circular es π por radio al cuadrado.',r'S=\pi5^2',25*pi,pi*25,r'cm^2'),
 N('Un círculo tiene radio 5 cm. ¿Cuál es la longitud de su circunferencia?','La longitud es 2π veces el radio.',r'L=2\pi(5)',10*pi,2*pi*5,'cm'),
 N('Una corona circular tiene radios 5 y 3 cm. ¿Qué área tiene?','Restamos las áreas de los círculos.',r'S=\pi(5^2-3^2)',16*pi,pi*(25-9),r'cm^2'),
 N('Un trapecio tiene bases paralelas de 8 y 14 cm y altura 3 cm. ¿Qué área tiene?','El área usa la semisuma de bases por altura.',r'S=(8+14)3/2',33,R((8+14)*3,2),r'cm^2'),
 N('Un rombo tiene diagonales de 10 y 12 cm. ¿Qué área tiene?','Usamos la mitad del producto de diagonales.',r'S=10(12)/2',60,R(120,2),r'cm^2'),
 N('Un sector circular de radio 4 cm tiene ángulo central 90°. ¿Qué área tiene?','Representa un cuarto del círculo.',r'S=\pi4^2/4',4*pi,pi*16/4,r'cm^2'),
 N('En un círculo de radio 4 cm, una cuerda subtiende un ángulo central de 90°. ¿Qué área tiene el segmento circular menor entre la cuerda y el arco?','Restamos el triángulo central al sector menor.',r'S=4\pi-4(4)/2=4\pi-8',4*pi-8,pi*16/4-R(4*4,2),r'cm^2'),
 N('Un rectángulo de 12×8 cm contiene un agujero circular de radio 2 cm por completo en su interior. ¿Qué área queda?','El área restante resta la región retirada.',r'S=12(8)-\pi2^2',96-4*pi,12*8-pi*4,r'cm^2'),
 N('Un cuadrado tiene área 49 cm². ¿Qué perímetro tiene?','Tomamos la raíz positiva para hallar el lado.',r'l=\sqrt{49}=7;\quad P=4(7)',28,4*sqrt(49),'cm'),
 C('Las unidades de un área son…',['Unidades de longitud simples.','Unidades de longitud al cuadrado.','Unidades de longitud al cubo.','Siempre radianes.'],1,['El área combina dos longitudes.','El producto de sus unidades es una unidad cuadrada.','Por ejemplo, cm por cm da cm².']),
 C('Si se resta el área de un agujero a la de una región exterior, es necesario que…',['El agujero esté contenido en la región que se toma como exterior.','Ambas figuras tengan siempre igual perímetro.','El agujero tenga mayor área.','La región exterior sea siempre circular.'],0,['La resta directa presupone una región retirada sin contar zonas externas.','Debe conocerse la inclusión o la intersección real.','Si el agujero está completamente dentro, se resta su área entera.']),
],
'9.1':[
 N('Un poliedro convexo tiene 8 vértices y 12 aristas. ¿Cuántas caras tiene?','Usamos la relación de Euler para poliedros convexos.',r'V-E+F=2\Rightarrow F=2-8+12',6,2-8+12),
 N('Un poliedro convexo tiene 6 caras y 12 aristas. ¿Cuántos vértices tiene?','Despejamos V en la relación de Euler.',r'V=2+E-F=2+12-6',8,2+12-6),
 N('Un tetraedro tiene 4 vértices y 4 caras. ¿Cuántas aristas tiene?','El tetraedro es convexo y cumple Euler.',r'E=V+F-2=4+4-2',6,4+4-2),
 N('Un prisma pentagonal tiene dos bases de cinco vértices cada una. ¿Cuántos vértices tiene en total?','Cada base aporta cinco vértices distintos.',r'V=2(5)',10,2*5),
 N('Un prisma pentagonal tiene cinco aristas por base y cinco laterales. ¿Cuántas aristas tiene?','Sumamos los dos contornos de base y las aristas laterales.',r'E=5+5+5',15,5+5+5),
 N('Un prisma pentagonal tiene cinco caras laterales. ¿Cuántas caras tiene contando las bases?','Se añaden las dos bases.',r'F=5+2',7,5+2),
 N('Una pirámide de base cuadrada tiene cuatro vértices en la base y una cúspide. ¿Cuántos vértices tiene?','Sumamos la cúspide a los de la base.',r'V=4+1',5,4+1),
 N('Una pirámide de base cuadrada tiene cuatro aristas en la base y cuatro laterales. ¿Cuántas aristas tiene?','Sumamos ambos tipos de arista.',r'E=4+4',8,4+4),
 N('Dos planos se cortan perpendicularmente. ¿Cuánto mide su ángulo diedro menor?','La perpendicularidad entre planos corresponde a un diedro recto.',r'\theta=90^\circ',90,90,r'^\circ'),
 C('Tres puntos determinan un único plano si…',['Son colineales.','No son colineales.','Todos coinciden.','Dos de ellos coinciden.'],1,['Una recta pertenece a infinitos planos.','Un tercer punto fuera de esa recta fija la orientación del plano.','Por eso se exigen tres puntos no colineales.']),
 C('La altura de un prisma o de una pirámide se mide…',['A lo largo de cualquier arista oblicua.','Perpendicularmente al plano de la base.','Como perímetro de la base.','Solo sobre un dibujo horizontal.'],1,['La altura es una distancia a un plano.','Se mide en dirección perpendicular a la base.','Una arista lateral oblicua puede tener otra longitud.']),
],
'9.2':[
 N('Un prisma tiene área de base 18 cm² y altura 5 cm. ¿Qué volumen tiene?','El volumen prismático es base por altura.',r'V=Bh=18(5)',90,18*5,r'cm^3'),
 N('Una pirámide tiene área de base 16 cm² y altura 9 cm. ¿Qué volumen tiene?','La pirámide ocupa un tercio del prisma de igual base y altura.',r'V=Bh/3=16(9)/3',48,R(16*9,3),r'cm^3'),
 N('Un ortoedro tiene aristas de 3, 4 y 12 cm. ¿Qué longitud tiene su diagonal espacial?','Las tres aristas ortogonales se combinan por Pitágoras.',r'd=\sqrt{3^2+4^2+12^2}',13,sqrt(9+16+144),'cm'),
 N('Un cubo tiene arista de 4 cm. ¿Qué área total tiene?','Sumamos seis caras cuadradas.',r'S_T=6a^2=6(4^2)',96,6*16,r'cm^2'),
 N('Un ortoedro tiene aristas de 2, 3 y 4 cm. ¿Qué área total tiene?','Hay dos caras de cada uno de los tres productos de aristas.',r'S_T=2(2\cdot3+2\cdot4+3\cdot4)',52,2*(6+8+12),r'cm^2'),
 N('Un tronco de pirámide tiene bases paralelas de áreas 36 y 9 cm² y altura 3 cm. ¿Qué volumen tiene?','Usamos las áreas de bases semejantes del tronco.',r'V=\frac h3(B+b+\sqrt{Bb})=\frac33(36+9+18)',63,R(3,3)*(36+9+sqrt(36*9)),r'cm^3'),
 N('Un prisma recto tiene perímetro de base 14 cm y altura 6 cm. ¿Qué área lateral tiene?','Las caras laterales desplegadas forman rectángulos de altura común.',r'S_L=P_bh=14(6)',84,14*6,r'cm^2'),
 N('Una pirámide regular de base cuadrada tiene lado de base 6 cm y apotema lateral 5 cm. ¿Qué área lateral tiene?','Sumamos los cuatro triángulos laterales iguales.',r'S_L=\frac{P_b\cdot a_l}{2}=\frac{4(6)(5)}2',60,R(4*6*5,2),r'cm^2'),
 N('Un cubo tiene volumen 125 cm³. ¿Cuánto mide su arista?','El volumen es el cubo de la arista positiva.',r'a=\sqrt[3]{125}',5,s.real_root(125,3),'cm'),
 C('La fórmula V=Bh/3 se usa para una pirámide con h…',['Igual a cualquier arista lateral.','Igual a la distancia perpendicular de la cúspide al plano de la base.','Igual al semiperímetro.','Igual al radio de la base en todos los casos.'],1,['El volumen depende del área de base y del alejamiento perpendicular de la cúspide.','Esa distancia es la altura.','Confundirla con una arista oblicua cambia el volumen.']),
 C('En un prisma recto, las aristas laterales…',['Son perpendiculares a las bases y miden la altura.','Son siempre menores que la altura.','Siempre forman 45° con la base.','Son diagonales de las bases.'],0,['Recto indica perpendicularidad de las aristas laterales a los planos de base.','La distancia entre esos planos se mide en esa dirección.','Por eso las aristas laterales tienen la longitud de la altura.']),
],
'10.1':[
 N('Un cilindro circular recto tiene radio 2 cm y altura 5 cm. ¿Qué volumen tiene?','El volumen es área circular de base por altura.',r'V=\pi r^2h=\pi2^2(5)',20*pi,pi*4*5,r'cm^3'),
 N('Un cilindro circular recto tiene radio 2 cm y altura 5 cm. ¿Qué área lateral tiene?','El desarrollo lateral es un rectángulo de ancho igual a la circunferencia.',r'S_L=2\pi rh=2\pi(2)(5)',20*pi,2*pi*2*5,r'cm^2'),
 N('Un cilindro cerrado de radio 2 cm y altura 5 cm tiene ambas bases. ¿Qué área total tiene?','Se añaden las dos bases al área lateral.',r'S_T=2\pi rh+2\pi r^2=20\pi+8\pi',28*pi,2*pi*2*5+2*pi*4,r'cm^2'),
 N('Un cono circular recto tiene radio 3 cm y altura 4 cm. ¿Cuánto mide su generatriz?','Radio, altura y generatriz forman un triángulo rectángulo.',r'g=\sqrt{3^2+4^2}',5,sqrt(9+16),'cm'),
 N('Un cono circular recto tiene radio 3 cm y altura 4 cm. ¿Qué volumen tiene?','El cono tiene un tercio del volumen del cilindro de igual base y altura.',r'V=\pi3^2(4)/3',12*pi,pi*9*4/3,r'cm^3'),
 N('Un cono circular recto tiene radio 3 cm y generatriz 5 cm. ¿Qué área lateral tiene?','El desarrollo lateral es un sector circular.',r'S_L=\pi rg=\pi(3)(5)',15*pi,pi*3*5,r'cm^2'),
 N('Un cono cerrado tiene radio 3 cm y generatriz 5 cm. ¿Qué área total tiene contando su base?','Se añade el círculo de base al sector lateral.',r'S_T=\pi rg+\pi r^2=15\pi+9\pi',24*pi,pi*3*5+pi*9,r'cm^2'),
 N('Un rectángulo se enrolla como superficie lateral de un cilindro. Su ancho de 10π cm se convierte en la circunferencia y su altura es 4 cm. ¿Qué volumen encierra?','El ancho permite hallar el radio antes del volumen.',r'r=10\pi/(2\pi)=5;\quad V=\pi5^2(4)',100*pi,pi*(10*pi/(2*pi))**2*4,r'cm^3'),
 N('Un cono y un cilindro tienen igual área de base y altura. ¿Cuánto vale Vcono/Vcilindro?','Comparamos las fórmulas con la misma base y altura.',r'\frac{Bh/3}{Bh}=1/3',R(1,3),R(1,3)),
 C('La generatriz de un cono circular recto…',['Siempre coincide con su altura.','Es la distancia inclinada entre la cúspide y un punto de la circunferencia de base.','Es el diámetro de la base.','Se mide perpendicular al plano de base en todo caso.'],1,['La altura es perpendicular al plano de base.','La generatriz recorre la superficie desde la cúspide al borde circular.','Con radio y altura forma el triángulo rectángulo g²=r²+h².']),
 C('El área lateral de un cilindro excluye…',['Toda la superficie curva.','Las dos bases circulares.','La altura.','La circunferencia.'],1,['Lateral se refiere a la superficie curva.','Las bases son regiones planas separadas.','El área total añade ambas bases si el cilindro está cerrado.']),
],
'10.2':[
 N('Una esfera tiene radio 3 cm. ¿Qué área superficial tiene?','El área es cuatro veces el área de un círculo máximo.',r'S=4\pi r^2=4\pi3^2',36*pi,4*pi*9,r'cm^2'),
 N('Una esfera tiene radio 3 cm. ¿Qué volumen tiene?','Usamos el volumen de la esfera.',r'V=4\pi r^3/3=4\pi3^3/3',36*pi,4*pi*27/3,r'cm^3'),
 N('Una semiesfera cerrada tiene radio 2 cm. ¿Qué área total tiene contando el disco plano de base?','Sumamos media superficie esférica y un círculo.',r'S_T=2\pi r^2+\pi r^2=3\pi2^2',12*pi,3*pi*4,r'cm^2'),
 N('Un casquete esférico tiene altura 2 cm en una esfera de radio 5 cm. ¿Qué área curva tiene?','El área del casquete depende de radio esférico y altura.',r'S=2\pi Rh=2\pi(5)(2)',20*pi,2*pi*5*2,r'cm^2'),
 N('Un casquete esférico tiene altura 2 cm en una esfera de radio 5 cm. ¿Qué volumen tiene?','El volumen del casquete usa su altura y el radio de la esfera.',r'V=\pi h^2(R-h/3)=\pi2^2(5-2/3)',52*pi/3,pi*4*(5-R(2,3)),r'cm^3'),
 N('Un disco de radio 1 cm gira alrededor de una recta de su mismo plano a 3 cm de su centro, sin cortarlo. ¿Qué volumen de toro genera?','Pappus multiplica el área por el recorrido del centroide.',r'V=(\pi1^2)(2\pi\cdot3)',6*pi**2,pi*1**2*2*pi*3,r'cm^3'),
 N('Una circunferencia de radio 1 cm gira alrededor de una recta coplanar a 3 cm de su centro, sin cortarla. ¿Qué área de superficie toroidal genera?','Pappus multiplica la longitud de la curva por el recorrido del centroide.',r'S=(2\pi\cdot1)(2\pi\cdot3)',12*pi**2,2*pi*1*2*pi*3,r'cm^2'),
 N('Una esfera tiene diámetro 10 cm. ¿Cuál es el radio de un círculo máximo suyo?','El círculo máximo comparte el radio de la esfera.',r'r=10/2',5,R(10,2),'cm'),
 N('Si el radio de una esfera se duplica, ¿por qué factor cambia su volumen?','El volumen escala con el cubo del radio.',r'V_2/V_1=2^3',8,2**3,'veces'),
 C('Una sección plana que pasa por el centro de una esfera produce…',['Un círculo máximo.','Un punto siempre.','Una elipse no circular.','Un círculo de radio cero.'],0,['La distancia del plano al centro es cero.','La sección alcanza el radio de la esfera.','Es la mayor sección circular posible.']),
 C('Al aplicar directamente el teorema de Pappus para un sólido de revolución se toma un eje…',['Que atraviese siempre el interior de la región.','Coplanar y exterior a la región, para evitar superposiciones en esta forma del teorema.','Que cambie de posición durante el giro.','Que no esté en el plano de la figura.'],1,['La región plana gira alrededor del eje indicado.','La forma usual de Pappus requiere que el eje no corte su interior.','Así el producto por el recorrido del centroide cuenta el volumen sin superposiciones.']),
],
'11.1':[
 N('Calcula la distancia entre (−1,2) y (2,6).','La distancia usa diferencias de coordenadas.',r'd=\sqrt{(2+1)^2+(6-2)^2}',5,sqrt(9+16)),
 N('¿Cuál es la coordenada x del punto medio entre (−2,4) y (6,8)?','Promediamos las abscisas.',r'x_M=(-2+6)/2',2,R(-2+6,2)),
 N(r'La circunferencia $(x-2)^2+(y+1)^2=9$ tiene centro de abscisa…','La forma canónica es (x−h)²+(y−k)²=r².',r'h=2',2,2),
 N(r'¿Cuál es la ordenada del centro de $(x-2)^2+(y+1)^2=9$?','Comparamos y+1 con y−k.',r'k=-1',-1,-1),
 N(r'¿Qué radio tiene $(x-2)^2+(y+1)^2=9$?','El segundo miembro es el radio al cuadrado.',r'r=\sqrt9',3,sqrt(9)),
 N(r'Para la parábola $y^2=8x$, ¿cuánto vale p en $y^2=4px$?','El coeficiente de x es cuatro veces p.',r'4p=8\Rightarrow p=2',2,R(8,4)),
 N(r'Para $y^2=8x$, ¿cuál es la abscisa del foco?','El foco de y²=4px está en (p,0).',r'F=(2,0)\Rightarrow x_F=2',2,R(8,4)),
 N(r'Para $y^2=8x$, la directriz es x=d. ¿Cuánto vale d?','La directriz está en x=−p.',r'd=-p=-2',-2,R(-8,4)),
 N(r'El punto (3,y) está en $x^2+y^2=25$ y tiene y positivo. ¿Cuánto vale y?','Elegimos la raíz positiva por la condición del punto.',r'y=\sqrt{25-3^2}',4,sqrt(25-9)),
 C('La parábola es el lugar geométrico de los puntos que equidistan…',['De dos puntos fijos distintos.','De un punto fijo y una recta fija que no lo contiene.','Del origen y de todos los ejes a la vez.','De todas las rectas del plano.'],1,['El punto fijo es el foco.','La recta fija es la directriz.','La igualdad de ambas distancias caracteriza la parábola.']),
 C(r'En $(x-h)^2+(y-k)^2=r^2$, con r>0, el centro es…',[r'$(h,k)$',r'$(-h,-k)$',r'$(r,r)$',r'$(0,r^2)$'],0,['Los cuadrados se anulan simultáneamente en x=h e y=k.','La ecuación fija la distancia r a ese punto.','Por eso (h,k) es el centro.']),
],
'11.2':[
 N(r'En la elipse $x^2/25+y^2/9=1$, ¿cuánto mide el semieje mayor?','El mayor denominador es el cuadrado del semieje mayor.',r'a=\sqrt{25}',5,sqrt(25)),
 N(r'En la elipse $x^2/25+y^2/9=1$, ¿cuánto mide el semieje menor?','El menor denominador es el cuadrado del semieje menor.',r'b=\sqrt9',3,sqrt(9)),
 N(r'En la elipse $x^2/25+y^2/9=1$, ¿cuánto vale la distancia c del centro a cada foco?','Para una elipse, c²=a²−b².',r'c=\sqrt{25-9}',4,sqrt(25-9)),
 N(r'¿Cuál es la excentricidad de $x^2/25+y^2/9=1$?','La excentricidad es c/a.',r'e=\sqrt{25-9}/5=4/5',R(4,5),sqrt(25-9)/5),
 N(r'En la hipérbola $x^2/9-y^2/16=1$, ¿cuánto mide el semieje transverso a?','El denominador del término positivo es a².',r'a=\sqrt9',3,sqrt(9)),
 N(r'En la hipérbola $x^2/9-y^2/16=1$, ¿cuánto vale c, la distancia del centro a cada foco?','En la hipérbola c²=a²+b².',r'c=\sqrt{9+16}',5,sqrt(9+16)),
 N(r'¿Cuál es la excentricidad de $x^2/9-y^2/16=1$?','Dividimos la distancia focal entre el semieje transverso.',r'e=c/a=5/3',R(5,3),sqrt(9+16)/3),
 N(r'La hipérbola $x^2/9-y^2/16=1$ tiene una asíntota de pendiente positiva. ¿Cuál es esa pendiente?','Para esta orientación, las pendientes son ±b/a.',r'm=b/a=4/3',R(4,3),sqrt(16)/sqrt(9)),
 N(r'En la elipse $x^2/25+y^2/9=1$, ¿cuánto mide el eje mayor completo?','El eje completo mide dos semiejes mayores.',r'2a=2(5)',10,2*sqrt(25)),
 C('La suma de distancias a dos focos es constante en…',['Una elipse.','Una hipérbola, sin valor absoluto.','Cualquier recta.','Toda parábola respecto de dos focos.'],0,['La elipse se define con dos focos y una suma fija mayor que la distancia entre focos.','Los puntos que satisfacen esa condición forman la curva.','En la hipérbola se fija una diferencia absoluta, no una suma.']),
 C('Para una hipérbola real no degenerada, su excentricidad cumple…',[r'$0<e<1$',r'$e=1$',r'$e>1$',r'$e=0$'],2,['En la hipérbola c²=a²+b² con a,b positivos.','Eso implica c>a.','Por tanto e=c/a es mayor que uno.']),
],
})

for level,indices in {'6.1':[4,5,6,7],'9.1':list(range(1,9))}.items():
    for index in indices:BANK[level][index-1]['integerOnly']=True

def authored_math(text):
    for original,tex in {
        'AB=4 cm':r'AB=4\,\mathrm{cm}','BC=7 cm':r'BC=7\,\mathrm{cm}',
        'AC=15 cm':r'AC=15\,\mathrm{cm}','AB=6 cm':r'AB=6\,\mathrm{cm}',
        'AB=3x cm':r'AB=3x\,\mathrm{cm}','BC=2x cm':r'BC=2x\,\mathrm{cm}','AC=20 cm':r'AC=20\,\mathrm{cm}',
        'b=5, c=7 y a=6 cm':r'b=5,\quad c=7,\quad a=6\,\mathrm{cm}',
    }.items():
        pieces=text.split('$')
        for i in range(0,len(pieces),2):pieces[i]=pieces[i].replace(original,'$'+tex+'$')
        text='$'.join(pieces)
    return text

def build(write=False):
    production=ROOT/'shared/src/commonMain/composeResources/files/aprender/geometria'
    fixtures=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/geometria'
    kept=[production/'semana03/3.1/questions.json',production/'semana07/7.1/questions.json']
    hashes={str(p.relative_to(ROOT)):hashlib.sha256(p.read_bytes()).hexdigest()for p in kept}
    preview=[];proofs=[]
    for level,tasks in BANK.items():
        assert len(tasks)==11,(level,len(tasks))
        week,part=map(int,level.split('.'));rel=Path(f'semana{week:02}')/level/'questions.json'
        path=production/rel;old=json.loads(path.read_text(encoding='utf-8-sig'));out=[]
        for i,task in enumerate(tasks):
            qid=f'geom_t{week:02}_s{part:02}_c{i+1:02}'
            if 'answer'in task:
                options,key=choices(task['answer'],task['unit'],i%4,integer_only=task.get('integerOnly',False))
                steps=[task['rule'],'Usamos los datos indicados: $'+task['model']+'$.','El resultado es '+label(task['answer'],task['unit'])+'.']
                proofs.append(dict(id=qid,model=task['model'],answer=str(task['answer']),calculated=str(task['calculated']),unit=task['unit']))
            else:options,key=task['options'],task['key'];steps=task['steps']
            q=dict(id=qid,concept=f'{level}.{i+1}',type='MULTIPLE_CHOICE',subject='geometria',semana=week,
                statement=authored_math(task['stem']),options=options,correctIndex=key,explanation='\n'.join(f'{j+1}. {v}'for j,v in enumerate(steps)),
                fuente='Ejercicio original RASTRO; contraste en docs/aprender/geometria/REVISION_PRACTICA_PENDIENTE.md',pedagogicalTier='aplicación')
            out.append(q)
        assert len({q['statement']for q in out})==11,level
        assert[q['id']for q in old]==[q['id']for q in out[:len(old)]],(level,[q['id']for q in old])
        if write:
            backup=ROOT/'build/academic-backup-geometry-pending'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(json.dumps(out,ensure_ascii=False,indent=2)+'\n',encoding='utf8');assert(fixtures/rel).exists();shutil.copy2(path,fixtures/rel)
        preview.extend(out)
    assert all(hashlib.sha256((ROOT/p).read_bytes()).hexdigest()==digest for p,digest in hashes.items())
    (ROOT/'build/geometry-pending-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    (ROOT/'build/geometry-pending-proofs.json').write_text(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),conceptualQuestions=len(preview)-len(proofs),preservedHashes=hashes,proofs=proofs),ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),written=write)))

if __name__=='__main__':
    parser=argparse.ArgumentParser();parser.add_argument('--write',action='store_true');build(parser.parse_args().write)
