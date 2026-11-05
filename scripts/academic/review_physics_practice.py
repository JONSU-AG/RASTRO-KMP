"""Explicit authored physics practice; no generation from arbitrary theory prose.
Only the 21 still-unreviewed resource levels. --write backs up and updates fixtures.
SymPy is a local development check, never an Android dependency.
"""
from pathlib import Path
import sys,json,argparse,shutil,hashlib,re
from decimal import Decimal,localcontext
ROOT=Path(__file__).resolve().parents[2]
sys.path.insert(0,str(ROOT/'build/academic-python-libs'))
import sympy as s
R=s.Rational;pi=s.pi;sqrt=s.sqrt

def numeric(stem,rule,model,expected,calculated,unit=''):
    expected=s.sympify(expected);calculated=s.simplify(calculated)
    assert s.simplify(expected-calculated)==0,(stem,expected,calculated)
    assert expected.is_real and expected.is_finite,(stem,expected)
    return dict(stem=stem,rule=rule,model=model,answer=expected,calculated=calculated,unit=unit)

def concept(stem,options,key,steps):
    assert len(options)==4 and len(set(options))==4 and len(steps)==3
    return dict(stem=stem,options=options,key=key,steps=steps)

N=numeric;C=concept
BANK={
'1.2':[
 N('Un vector tiene componentes (3, 4) m. ¿Cuál es su módulo?','El módulo combina las componentes perpendiculares.',r'|\vec A|=\sqrt{3^2+4^2}=\sqrt{25}',5,sqrt(3**2+4**2),'m'),
 N('Si A=(2, −1, 3) y B=(1, 2, −2), calcula A·B.','El producto escalar suma los productos de componentes.',r'\vec A\cdot\vec B=2(1)+(-1)(2)+3(-2)',-6,s.Matrix([2,-1,3]).dot(s.Matrix([1,2,-2]))),
 N('Si A=(2, −1, 3) y B=(1, 2, −2), ¿cuál es el área del triángulo que forman desde el origen? Las componentes están en metros.','El área triangular es la mitad del módulo del producto vectorial.',r'\vec A\times\vec B=(-4,7,5);\quad S=\frac{\sqrt{16+49+25}}2',3*sqrt(10)/2,s.Matrix([2,-1,3]).cross(s.Matrix([1,2,-2])).norm()/2,r'm^2'),
 N('Dos vectores de módulos 6 y 8 unidades son perpendiculares. ¿Qué módulo tiene su suma?','Para vectores perpendiculares se aplica Pitágoras.',r'R=\sqrt{6^2+8^2}',10,sqrt(6**2+8**2),'unidades'),
 N('Un vector tiene módulo 10 m y forma 60° con +x. ¿Cuál es su componente x?','La proyección horizontal es módulo por coseno.',r'A_x=10\cos60^\circ=10/2',5,10*s.cos(pi/3),'m'),
 N('A=(5, 2) m y B=(1, −3) m. ¿Cuál es la componente y de A−B?','Restamos componente a componente.',r'(A-B)_y=2-(-3)',5,2-(-3),'m'),
 N('Para A=(3, 4), ¿cuál es la componente x de su vector unitario?','Dividimos cada componente entre el módulo no nulo.',r'u_x=3/\sqrt{3^2+4^2}',R(3,5),3/sqrt(3**2+4**2)),
 N('El producto escalar de dos vectores no nulos es cero. ¿Qué ángulo menor forman?','El producto escalar incluye el coseno del ángulo.',r'AB\cos\theta=0\Rightarrow\cos\theta=0',90,s.acos(0)*180/pi,r'^\circ'),
 N('Un vector tiene módulo 2 m. ¿Qué módulo tiene el vector −3A?','El módulo de un múltiplo usa el valor absoluto del escalar.',r'|-3\vec A|=|-3|\,|\vec A|=3(2)',6,abs(-3)*2,'m'),
 C('¿Cuándo existe el vector unitario A/|A|?', ['Para cualquier vector, incluido el nulo.','Solo si A es distinto de cero.','Solo si todas sus componentes son positivas.','Solo si A tiene tres componentes.'],1,['Normalizar significa dividir entre el módulo.','El vector nulo tiene módulo cero y esa división no está definida.','Todo vector no nulo puede normalizarse.']),
 C('Dos vectores no nulos son paralelos. ¿Qué ocurre con su producto vectorial?', ['Su módulo es el producto de sus módulos.','Es siempre paralelo a ambos.','Es el vector nulo.','Es siempre un vector unitario.'],2,['El módulo del producto vectorial contiene el seno del ángulo.','Vectores paralelos forman 0° o 180° y ambos senos son cero.','El producto vectorial es nulo.']),
],
'3.1':[
 N('Un bloque de 8 kg recibe 50 N a la derecha y 18 N a la izquierda sobre piso liso. ¿Cuál es su aceleración hacia la derecha?','La aceleración depende de la fuerza neta.',r'a=(50-18)/8',4,R(50-18,8),r'm/s^2'),
 N('Una masa de 6 kg acelera a 3 m/s². ¿Cuál es el módulo de la fuerza neta?','Aplicamos la segunda ley de Newton.',r'F=ma=6(3)',18,6*3,'N'),
 N('Sobre un bloque en reposo de 5 kg solo actúan peso y normal verticales. Usa g=10 m/s². ¿Cuánto vale la normal?','El equilibrio vertical exige fuerza neta cero.',r'N-mg=0\Rightarrow N=5(10)',50,5*10,'N'),
 N('Un bloque desliza sobre piso horizontal con normal 40 N y coeficiente cinético 0.2. ¿Qué módulo tiene el rozamiento?','El rozamiento cinético es coeficiente por normal.',r'f_k=\mu_kN=0.2(40)',8,R(1,5)*40,'N'),
 N('Un cuerpo de 2 kg acelera a 5 m/s² por una fuerza horizontal F, mientras una resistencia opuesta vale 4 N. ¿Cuánto vale F?','Sumamos fuerzas con signo en el eje del movimiento.',r'F-4=2(5)\Rightarrow F=10+4',14,2*5+4,'N'),
 N('Una masa de 3 kg desciende por un plano liso de 30°. Usa g=10 m/s². ¿Qué aceleración tiene a lo largo del plano?','La componente del peso paralela al plano produce la aceleración.',r'a=g\sin30^\circ=10/2',5,10*s.sin(pi/6),r'm/s^2'),
 N('Un ascensor sube con aceleración 2 m/s². Una persona tiene masa 60 kg; g=10 m/s². ¿Qué normal ejerce el piso?','Tomamos hacia arriba como positivo.',r'N-mg=ma\Rightarrow N=60(10+2)',720,60*(10+2),'N'),
 N('Un bloque parte del reposo con fuerza neta constante 12 N y masa 3 kg. ¿Qué rapidez alcanza en 2 s?','Primero obtenemos aceleración y luego cambio de velocidad.',r'a=12/3=4;\quad v=0+4(2)',8,R(12,3)*2,'m/s'),
 N('La resultante sobre un cuerpo de 4 kg es cero. ¿Cuánto vale su aceleración?','La masa es positiva y la segunda ley relaciona fuerza neta y aceleración.',r'a=F_{net}/m=0/4',0,R(0,4),r'm/s^2'),
 C('Según la tercera ley de Newton, las fuerzas de acción y reacción actúan…',['Sobre el mismo cuerpo y se anulan.','Sobre cuerpos diferentes, con igual módulo y sentidos opuestos.','Solo cuando ambos cuerpos se mueven.','Con el mismo sentido y sobre cuerpos diferentes.'],1,['Cada fuerza representa una interacción entre dos cuerpos.','El par tiene igual módulo y sentidos opuestos.','Al actuar sobre cuerpos diferentes, no se cancela en el diagrama de un solo cuerpo.']),
 C('Un cuerpo se mueve en línea recta con velocidad constante en un sistema inercial. ¿Qué exige eso?',['Que no exista ninguna fuerza.','Que la fuerza neta sea cero.','Que su masa sea cero.','Que la fuerza neta sea paralela a la velocidad y no nula.'],1,['Velocidad constante implica aceleración cero.','La segunda ley exige fuerza neta cero.','Pueden existir fuerzas individuales que se equilibren.']),
],
'3.2':[
 N('Un móvil describe una circunferencia de radio 5 m con rapidez constante 10 m/s. ¿Cuál es su aceleración centrípeta?','El cambio de dirección produce aceleración hacia el centro.',r'a_c=v^2/r=10^2/5',20,R(10**2,5),r'm/s^2'),
 N('Una masa de 2 kg recorre una circunferencia de radio 4 m a 6 m/s. ¿Qué fuerza neta radial necesita?','La fuerza radial neta proporciona la aceleración centrípeta.',r'F_r=mv^2/r=2(6^2)/4',18,R(2*6**2,4),'N'),
 N('Una curva sin rozamiento tiene radio 200 m y se diseña para v=20 m/s. Usa g=10 m/s². ¿Cuánto vale tan(θ) del peralte?','Las componentes de la normal sostienen el peso y proporcionan la fuerza radial.',r'\tan\theta=v^2/(rg)=20^2/(200\cdot10)',R(1,5),R(20**2,200*10)),
 N('Dos bloques de 2 kg y 3 kg están unidos por cuerda ideal sobre piso liso. Una fuerza de 20 N tira del bloque de 3 kg. ¿Cuál es la aceleración común?','Para el sistema completo la tensión es interna.',r'a=20/(2+3)',4,R(20,2+3),r'm/s^2'),
 N('Dos bloques de 3 kg y 2 kg están unidos por una cuerda ideal sobre piso liso. Una fuerza horizontal de 20 N tira del bloque de 3 kg. ¿Qué tensión acelera al bloque de 2 kg?','Aislamos el bloque que solo recibe tensión horizontal.',r'a=20/5=4;\quad T=2(4)',8,2*R(20,5),'N'),
 N('Una máquina de Atwood ideal tiene masas de 3 kg y 5 kg; g=10 m/s². ¿Cuál es el módulo de la aceleración?','Restamos los pesos y dividimos entre la masa total.',r'a=(5-3)10/(5+3)',R(5,2),R((5-3)*10,5+3),r'm/s^2'),
 N('En una máquina de Atwood ideal de masas 3 kg y 5 kg, g=10 m/s², la masa menor sube con 2.5 m/s². ¿Cuál es la tensión?','Aplicamos Newton a la masa que sube.',r'T-3(10)=3(2.5)\Rightarrow T=37.5',R(75,2),3*(10+R(5,2)),'N'),
 N('Un cuerpo describe un círculo a rapidez v. Si la rapidez se duplica y el radio permanece fijo, ¿por qué factor cambia la fuerza radial neta?','La fuerza radial es proporcional al cuadrado de la rapidez.',r'F_2/F_1=(2v)^2/v^2',4,2**2,'veces'),
 N('Un vehículo de 500 kg toma una curva horizontal de radio 25 m a 10 m/s. ¿Qué módulo de fuerza horizontal neta requiere?','La resultante horizontal es centrípeta.',r'F=500(10^2)/25',2000,R(500*100,25),'N'),
 C('En movimiento circular uniforme, ¿cuál afirmación es correcta?',['La velocidad vectorial es constante.','La aceleración es cero.','La rapidez es constante y la velocidad cambia de dirección.','La fuerza neta apunta en el sentido tangencial.'],2,['La trayectoria circular cambia la dirección del movimiento.','La rapidez se mantiene, pero la velocidad vectorial no.','La aceleración apunta al centro.']),
 C('La llamada fuerza centrípeta es…',['Una fuerza adicional que siempre se suma a todas las demás.','La resultante radial de las fuerzas que ya actúan.','Una fuerza que apunta siempre hacia afuera.','Una fuerza que solo existe con rozamiento.'],1,['Se descomponen las fuerzas reales en direcciones radial y tangencial.','La suma radial debe cumplir la segunda ley.','Centrípeta describe esa resultante, no una interacción nueva.']),
],
'4.1':[
 N('Dos fuerzas horizontales de 10 N y 6 N apuntan a la derecha. ¿Qué módulo debe tener una tercera hacia la izquierda para el equilibrio?','La suma de fuerzas debe ser cero.',r'F=10+6',16,10+6,'N'),
 N('Una fuerza de 20 N actúa perpendicular a una llave a 0.3 m del eje. ¿Qué módulo tiene su momento?','El brazo es la distancia perpendicular al eje.',r'\tau=Fd=20(0.3)',6,20*R(3,10),r'N\,m'),
 N('Una fuerza de 30 N tiene línea de acción que pasa por el eje de giro. ¿Qué momento produce respecto de ese eje?','Si el brazo perpendicular es cero, el momento es cero.',r'\tau=30(0)',0,30*0,r'N\,m'),
 N('Una barra ligera tiene cargas de 40 N a 0.5 m a la izquierda y F a 0.2 m a la derecha del apoyo. ¿Qué F la equilibra?','Los momentos opuestos deben tener igual módulo.',r'40(0.5)=F(0.2)\Rightarrow F=100',100,40*R(1,2)/R(1,5),'N'),
 N('Una barra uniforme de 4 m pesa 60 N y está articulada en un extremo. ¿Qué momento produce su peso cuando la barra está horizontal?','El peso actúa en el centro de una barra uniforme.',r'|\tau|=60(4/2)',120,60*R(4,2),r'N\,m'),
 N('Una viga uniforme de 6 m y peso 100 N se apoya simétricamente en ambos extremos. ¿Qué reacción vertical ejerce cada apoyo?','La simetría y el equilibrio reparten la carga.',r'R_1=R_2;\quad R_1+R_2=100',50,R(100,2),'N'),
 N('Una masa de 8 kg cuelga de una cuerda vertical ideal y está en reposo. Usa g=10 m/s². ¿Cuál es la tensión?','El equilibrio vertical iguala tensión y peso.',r'T=mg=8(10)',80,8*10,'N'),
 N('Una fuerza horizontal de 15 N actúa 2 m por encima de un eje. ¿Qué módulo tiene su momento respecto del eje perpendicular al plano?','La distancia perpendicular es 2 m.',r'|\tau|=15(2)',30,15*2,r'N\,m'),
 N('Una carga de 90 N cuelga de dos cuerdas verticales idénticas y simétricas. ¿Cuál es la tensión en cada una?','Las dos tensiones verticales equilibran la carga.',r'2T=90',45,R(90,2),'N'),
 C('Para equilibrio estático de un cuerpo rígido en un plano se exige…',['Solo suma de fuerzas igual a cero.','Solo suma de momentos igual a cero.','Suma de fuerzas y suma de momentos iguales a cero.','Que todas las fuerzas pasen por el centro de masa.'],2,['No trasladarse requiere resultante de fuerzas cero.','No adquirir aceleración angular requiere momento neto cero.','Deben cumplirse ambas condiciones.']),
 C('La normal de una superficie lisa sobre un cuerpo apunta…',['Siempre hacia arriba.','Perpendicular a la superficie.','Siempre paralela al peso.','Tangente a la superficie.'],1,['La fuerza normal es una fuerza de contacto.','Su dirección es perpendicular a la superficie local.','Solo en ciertas geometrías coincide con la vertical.']),
],
'4.2':[
 N('Una escalera uniforme de peso 100 N forma 45° con el piso. La pared es lisa y el piso rugoso; hay equilibrio. ¿Cuál es la reacción horizontal de la pared?','Tomamos momentos respecto del pie de la escalera.',r'N_pL\sin45^\circ=100(L/2)\cos45^\circ',50,100*R(1,2)/s.tan(pi/4),'N'),
 N('Una escalera está en equilibrio bajo su peso y las reacciones del piso y de una pared lisa. La pared ejerce 50 N horizontales. ¿Qué módulo de rozamiento estático ejerce el piso?','El equilibrio horizontal exige fuerzas opuestas iguales.',r'f_s-N_p=0\Rightarrow f_s=50',50,50,'N'),
 N('Un bloque de peso 100 N tiene normal 100 N y coeficiente estático 0.4. ¿Cuál es el máximo rozamiento estático posible?','El máximo es coeficiente estático por normal.',r'f_{s,max}=0.4(100)',40,R(2,5)*100,'N'),
 N('Un bloque sobre piso horizontal recibe una fuerza aplicada de 20 N y permanece en reposo. Su límite de rozamiento es 40 N y no hay otras fuerzas horizontales. ¿Qué módulo tiene el rozamiento real?','Mientras no desliza, el rozamiento se ajusta al equilibrio.',r'f_s=20\le40',20,20,'N'),
 N('Dos fuerzas paralelas de 10 N y 30 N apuntan hacia abajo en x=0 m y x=4 m. ¿En qué x actúa su resultante?','Igualamos el momento de la resultante al momento total.',r'40x=10(0)+30(4)',3,R(30*4,40),'m'),
 N('Dos masas puntuales de 2 kg y 6 kg están en x=0 m y x=4 m. ¿Dónde está su centro de masa?','La posición se pondera por las masas.',r'x_{CM}=(2\cdot0+6\cdot4)/(2+6)',3,R(2*0+6*4,2+6),'m'),
 N('Una fuerza de 12 N equilibra un momento de 36 N·m. ¿Qué brazo perpendicular necesita?','Despejamos el brazo del momento.',r'd=\tau/F=36/12',3,R(36,12),'m'),
 N('Un par de fuerzas de 8 N, opuestas y paralelas, tiene líneas de acción separadas 0.5 m. ¿Qué momento neto produce?','El momento de un par es fuerza por separación perpendicular.',r'\tau=8(0.5)',4,8*R(1,2),r'N\,m'),
 N('Un bloque sobre un plano está al borde de deslizar. Se da tan(θ)=0.3. ¿Cuál es el coeficiente estático mínimo?','En el límite, el peso paralelo iguala al rozamiento máximo.',r'mg\sin\theta=\mu_smg\cos\theta\Rightarrow\mu_s=\tan\theta',R(3,10),R(3,10)),
 C('El rozamiento estático antes del deslizamiento cumple…',['Siempre f=μsN.','0≤f≤μsN, con el valor necesario para el equilibrio.','Siempre f=0.','Siempre f>μsN.'],1,['El límite superior es μsN.','Antes del límite, la fuerza se ajusta a la tendencia de deslizamiento.','Igualar siempre al máximo daría resultados incorrectos.']),
 C('Para hallar el momento de una fuerza respecto de un punto se necesita…',['Solo el módulo de la fuerza.','La distancia recorrida por el cuerpo.','La distancia perpendicular desde el punto a la línea de acción.','Solo la masa del cuerpo.'],2,['El momento mide la tendencia de giro respecto del punto.','Depende de fuerza y brazo perpendicular.','La longitud hasta el punto de aplicación no basta si no es perpendicular.']),
],
'5.1':[
 N('Una masa de 2 kg se mueve a +3 m/s. ¿Cuál es su cantidad de movimiento en ese eje?','La cantidad de movimiento es masa por velocidad.',r'p=mv=2(3)',6,2*3,r'kg\,m/s'),
 N('Una pelota de 0.2 kg cambia de −30 m/s a +50 m/s. ¿Qué impulso recibe en ese eje?','El impulso es el cambio de cantidad de movimiento.',r'J=0.2[50-(-30)]',16,R(1,5)*(50+30),r'N\,s'),
 N('Una fuerza neta constante de 10 N actúa durante 0.3 s. ¿Qué impulso entrega?','Para fuerza constante, impulso es fuerza por tiempo.',r'J=F\Delta t=10(0.3)',3,10*R(3,10),r'N\,s'),
 N('Un móvil de 2 kg a 6 m/s choca con otro de 4 kg en reposo y quedan unidos. El impulso externo es despreciable. ¿Qué velocidad común tienen?','Se conserva el momento lineal del sistema.',r'2(6)+4(0)=(2+4)v',2,R(2*6,6),'m/s'),
 N('Un cuerpo de 5 kg cambia de 2 a 8 m/s en el mismo sentido. ¿Qué cambio de momento tiene?','Restamos momento final e inicial.',r'\Delta p=5(8-2)',30,5*(8-2),r'kg\,m/s'),
 N('Un impulso de 12 N·s actúa sobre una masa de 3 kg. ¿Qué cambio de velocidad produce en la dirección del impulso?','La masa constante permite escribir J=mΔv.',r'\Delta v=12/3',4,R(12,3),'m/s'),
 N('Una masa de 1 kg a +4 m/s choca y se une a otra de 1 kg a −2 m/s. Sin impulso externo, ¿cuál es la velocidad común?','Conservamos el momento con signos.',r'1(4)+1(-2)=2v',1,R(4-2,2),'m/s'),
 N('Una pelota recibe 8 N·s en 0.02 s. ¿Qué fuerza neta media actúa?','La fuerza media divide impulso entre intervalo.',r'F_{med}=8/0.02',400,8/R(1,50),'N'),
 N('Una masa de 4 kg en reposo recibe un impulso de −12 N·s. ¿Qué velocidad final tiene en ese eje?','El impulso con signo fija el cambio de momento.',r'-12=4v-0',-3,R(-12,4),'m/s'),
 C('En un choque perfectamente inelástico, los cuerpos…',['Se separan con la misma rapidez inicial.','Quedan unidos después del choque.','Conservan siempre la energía cinética.','Pierden necesariamente todo su momento lineal.'],1,['La condición distintiva es que quedan unidos.','El momento se conserva si el impulso externo es despreciable.','La energía cinética no tiene por qué conservarse.']),
 C('El momento lineal total se conserva cuando…',['La energía cinética aumenta.','Los cuerpos tienen masas iguales.','El impulso externo neto es cero.','Toda fuerza interna es cero.'],2,['El cambio de momento total iguala al impulso externo.','Los intercambios internos no cambian el momento total del sistema aislado.','Un impulso externo neto cero garantiza su conservación.']),
],
'5.2':[
 N('La fuerza gravitatoria entre dos masas es 80 N a distancia r. ¿Cuánto vale a distancia 2r, con las mismas masas?','La gravitación sigue una ley inversa al cuadrado de la distancia.',r'F_2=80/2^2',20,R(80,4),'N'),
 N('Dos cuerpos se atraen con 6 N. Si solo una masa se triplica y la distancia no cambia, ¿qué fuerza resulta?','La fuerza es proporcional a cada una de las masas.',r'F_2=3F_1=3(6)',18,3*6,'N'),
 N('A radio R de un planeta, g=12 m/s². ¿Qué valor tiene g a radio 2R desde su centro?','Fuera de un planeta esférico usamos g=GM/r².',r'g_2=12/2^2',3,R(12,4),r'm/s^2'),
 N('Dos satélites tienen radios orbitales r y 4r alrededor del mismo planeta. El primero tarda 2 h. ¿Cuánto tarda el segundo?','Para órbitas circulares del mismo centro, T² es proporcional a r³.',r'T_2=2\sqrt{4^3}',16,2*sqrt(4**3),'h'),
 N('Un satélite tiene T1=24 h y radio r1. Otro alrededor del mismo planeta tiene T2=3 h. ¿Cuánto vale r2/r1?','Aplicamos la tercera ley de Kepler.',r'r_2/r_1=(3/24)^{2/3}',R(1,4),R(3,24)**R(2,3)),
 N('En un punto orbital se tiene GM/r=36 m²/s². ¿Qué rapidez circular corresponde?','La gravedad aporta la aceleración centrípeta.',r'v=\sqrt{GM/r}=\sqrt{36}',6,sqrt(36),'m/s'),
 N('En un punto se da GM/r=50 m²/s². ¿Qué rapidez de escape clásica se obtiene sin resistencia?','La energía total mínima para escapar es cero.',r'v_e=\sqrt{2GM/r}=\sqrt{100}',10,sqrt(2*50),'m/s'),
 N('Una masa de 5 kg está donde g=4 m/s². ¿Cuál es el módulo de su peso?','El peso es la fuerza gravitatoria local.',r'P=mg=5(4)',20,5*4,'N'),
 N('Si el radio de una órbita circular se multiplica por 4, ¿por qué factor cambia la rapidez orbital alrededor del mismo centro?','La rapidez orbital es inversamente proporcional a la raíz del radio.',r'v_2/v_1=1/\sqrt4',R(1,2),1/sqrt(4),'veces'),
 C('En una órbita circular ideal, la fuerza gravitatoria sobre el satélite apunta…',['Hacia el centro de la órbita.','En el sentido de su velocidad.','Hacia afuera de la órbita.','En una dirección fija del espacio.'],0,['La gravedad es una fuerza atractiva central.','En la órbita circular suministra la aceleración radial.','Por eso apunta al centro y es perpendicular a la velocidad instantánea.']),
 C('Para aplicar directamente la tercera ley de Kepler comparando dos satélites se requiere…',['Que tengan la misma masa.','Que orbiten el mismo cuerpo central bajo el modelo gravitatorio.','Que tengan el mismo periodo.','Que estén a igual altura.'],1,['La constante de proporcionalidad depende de la masa central.','Comparar el mismo centro permite cancelarla.','La masa del satélite se considera despreciable frente a la del centro en este modelo.']),
],
'6.1':[
 N('Una fuerza de 40 N forma 60° con un desplazamiento de 10 m. ¿Qué trabajo realiza?','El trabajo usa la componente paralela al desplazamiento.',r'W=Fd\cos\theta=40(10)\cos60^\circ',200,40*10*s.cos(pi/3),'J'),
 N('Un rozamiento de 15 N se opone a un desplazamiento de 4 m. ¿Qué trabajo realiza?','Una fuerza opuesta al desplazamiento hace trabajo negativo.',r'W=-fd=-15(4)',-60,-15*4,'J'),
 N('Una masa de 2 kg tiene rapidez 3 m/s. ¿Cuál es su energía cinética clásica?','La energía cinética depende del cuadrado de la rapidez.',r'K=mv^2/2=2(3^2)/2',9,R(2*3**2,2),'J'),
 N('Una masa de 4 kg está 5 m sobre el nivel de referencia. Usa g=10 m/s². ¿Cuál es su energía potencial gravitatoria cercana a la superficie?','La energía potencial depende de la altura respecto de la referencia.',r'U=mgh=4(10)(5)',200,4*10*5,'J'),
 N('Un motor entrega 600 J en 3 s. ¿Qué potencia media desarrolla?','La potencia media es energía transferida por tiempo.',r'P=W/t=600/3',200,R(600,3),'W'),
 N('Un resorte ideal de constante 200 N/m se comprime 0.1 m. ¿Qué energía elástica almacena?','La energía elástica es cuadrática en la deformación.',r'U_e=kx^2/2=200(0.1)^2/2',1,200*R(1,10)**2/2,'J'),
 N('El trabajo neto sobre un cuerpo es 30 J y su energía cinética inicial 10 J. ¿Cuál es la final?','El trabajo neto equivale al cambio de energía cinética.',r'K_f=K_i+W_{net}=10+30',40,10+30,'J'),
 N('Un dispositivo recibe 500 J y entrega 300 J útiles. ¿Cuál es su rendimiento porcentual?','El rendimiento compara energía útil con energía de entrada.',r'\eta=100(300/500)',60,100*R(300,500),r'\%'),
 N('Una fuerza de 5 N es perpendicular al desplazamiento de 8 m. ¿Qué trabajo realiza?','La componente paralela de la fuerza es cero.',r'W=5(8)\cos90^\circ',0,5*8*s.cos(pi/2),'J'),
 C('Un cuerpo puede tener trabajo neto cero y seguir moviéndose porque…',['Su energía cinética no cambia, aunque puede ser distinta de cero.','El trabajo neto cero exige velocidad cero.','Ninguna fuerza puede actuar sobre él.','La masa se convierte automáticamente en energía.'],0,['El teorema trabajo–energía relaciona trabajo neto y cambio de energía cinética.','Si el cambio es cero, la energía cinética se mantiene.','Mantener energía cinética no significa estar en reposo.']),
 C('La energía mecánica K+U se conserva cuando…',['Existe siempre rozamiento.','Solo actúan fuerzas conservativas, o el trabajo de las no conservativas es nulo.','La rapidez es siempre constante.','La altura siempre es cero.'],1,['Las fuerzas conservativas permiten definir energía potencial.','El trabajo no conservativo cambia K+U.','Si ese trabajo es cero, la energía mecánica permanece constante.']),
],
'6.2':[
 N('Un cuerpo cae desde el reposo por una altura de 5 m, sin resistencia. Usa g=10 m/s². ¿Con qué rapidez llega abajo?','La energía potencial se transforma en cinética.',r'v=\sqrt{2gh}=\sqrt{2(10)(5)}',10,sqrt(2*10*5),'m/s'),
 N('Una masa de 4 kg inicia con 12 m/s. El rozamiento disipa 88 J antes de subir por una rampa lisa. Usa g=10 m/s². ¿Qué altura máxima alcanza?','Restamos la disipación antes de convertir la energía restante en potencial.',r'K_i=4(12^2)/2=288;\quad h=(288-88)/(4\cdot10)',5,(R(4*12**2,2)-88)/(4*10),'m'),
 N('Una masa de 2 kg baja 3 m sin rozamiento desde el reposo. Usa g=10 m/s². ¿Qué energía cinética gana?','La pérdida de energía potencial iguala al aumento de cinética.',r'\Delta K=mg\Delta h=2(10)(3)',60,2*10*3,'J'),
 N('Un cuerpo tiene K=80 J y recibe trabajo neto de −30 J. ¿Cuál es su energía cinética final?','El trabajo negativo reduce la energía cinética.',r'K_f=80-30',50,80-30,'J'),
 N('Un resorte ideal de 100 N/m libera la energía de una compresión de 0.2 m a una masa de 1 kg sobre piso liso. ¿Qué rapidez adquiere?','Igualamos energía elástica y cinética.',r'100(0.2)^2/2=1v^2/2\Rightarrow v=2',2,sqrt(100*R(1,5)**2),'m/s'),
 N('Un motor de potencia útil constante 100 W eleva una masa de 5 kg a rapidez constante. Usa g=10 m/s². ¿Qué rapidez de ascenso permite?','En ascenso uniforme la fuerza útil iguala al peso.',r'P=mgv\Rightarrow v=100/[5(10)]',2,R(100,5*10),'m/s'),
 N('Un cuerpo de 2 kg se detiene desde 6 m/s por rozamiento constante de 6 N en horizontal. ¿Qué distancia recorre?','El trabajo del rozamiento elimina la energía cinética inicial.',r'6d=2(6^2)/2\Rightarrow d=6',6,R(2*6**2,2*6),'m'),
 N('Una máquina eleva 200 N una altura de 3 m en 4 s. ¿Qué potencia útil media desarrolla?','El trabajo útil de elevación es peso por altura.',r'P=200(3)/4',150,R(200*3,4),'W'),
 N('Una masa de 1 kg cae desde 10 m y llega con K=80 J. Usa g=10 m/s² y toma U=0 abajo. ¿Cuánta energía mecánica se disipó?','Comparamos energía mecánica inicial y final.',r'E_{dis}=1(10)(10)-80',20,1*10*10-80,'J'),
 C('Duplicar la rapidez de una masa constante multiplica su energía cinética por…',['Dos.','Cuatro.','Ocho.','Un medio.'],1,['La energía cinética es proporcional a v².','Al sustituir 2v aparece el factor 2².','El factor es cuatro.']),
 C('En un resorte ideal, la fuerza recuperadora…',['Tiene siempre el mismo sentido que la deformación.','Se opone a la deformación respecto del equilibrio.','Es independiente de la deformación.','Es siempre igual al peso.'],1,['La ley de Hooke se escribe con signo recuperador.','Una deformación positiva produce fuerza hacia el equilibrio.','El signo expresa oposición al desplazamiento desde el equilibrio.']),
],
'7.1':[
 N('Convierte 25 °C a kelvin usando T(K)=t(°C)+273.15.','La escala kelvin tiene un desplazamiento fijo respecto de Celsius.',r'T=25+273.15',R(5963,20),25+R(27315,100),'K'),
 N('Convierte 20 °C a grados Fahrenheit.','Usamos la relación entre los dos intervalos y el origen.',r't_F=9(20)/5+32',68,R(9,5)*20+32,r'^\circ F'),
 N('Una temperatura sube de 10 °C a 35 °C. ¿Cuánto aumenta en kelvin?','Los intervalos Celsius y kelvin tienen el mismo tamaño.',r'\Delta T=35-10',25,35-10,'K'),
 N('Una masa de 2 kg, con calor específico 100 J/(kg·K), aumenta 5 K sin cambiar de fase. ¿Cuánto calor recibe?','Sin cambio de fase se usa calor sensible.',r'Q=mc\Delta T=2(100)(5)',1000,2*100*5,'J'),
 N('Un cuerpo recibe 600 J y su temperatura sube 3 K. ¿Cuál es su capacidad calorífica en ese intervalo?','La capacidad calorífica divide calor entre cambio de temperatura.',r'C=Q/\Delta T=600/3',200,R(600,3),r'J/K'),
 N('Una masa de 0.5 kg recibe 1000 J y aumenta 4 K sin cambio de fase. ¿Cuál es su calor específico?','Despejamos c en la ecuación del calor sensible.',r'c=Q/(m\Delta T)=1000/(0.5\cdot4)',500,1000/(R(1,2)*4),r'J/(kg\,K)'),
 N('Un cuerpo de capacidad calorífica 50 J/K pierde 200 J. ¿Cuál es su cambio de temperatura con signo?','El calor perdido se representa con Q negativo.',r'\Delta T=Q/C=-200/50',-4,R(-200,50),'K'),
 N('¿A cuántos grados Celsius corresponden 300 K usando 273.15 como desplazamiento?','Invertimos la conversión a kelvin.',r't=300-273.15',R(537,20),300-R(27315,100),r'^\circ C'),
 N('Una diferencia de temperatura es 18 °F. ¿A cuántos kelvin equivale ese intervalo?','Para intervalos no se suma ni resta el 32 de los orígenes.',r'\Delta T_K=5(18)/9',10,R(5,9)*18,'K'),
 C('Calor y temperatura se distinguen porque…',['El calor es energía transferida por diferencia de temperatura; la temperatura caracteriza el estado térmico.','Son siempre la misma magnitud.','El calor se mide en kelvin y la temperatura en joule.','La temperatura depende únicamente de la masa.'],0,['La temperatura describe el estado térmico.','El calor es energía que cruza una frontera por diferencia de temperatura.','Por eso sus significados y unidades son diferentes.']),
 C('Dos cuerpos aislados del exterior están en equilibrio térmico cuando…',['Tienen igual masa.','Tienen la misma temperatura y no hay transferencia neta de calor entre ellos.','Contienen la misma cantidad de materia.','Ambos están a 0 °C.'],1,['El contacto térmico permite intercambio de energía.','La transferencia neta cesa al igualarse las temperaturas.','No se exige igualdad de masas ni una temperatura particular.']),
],
'7.2':[
 N('Una barra de 2 m tiene α=10⁻⁵ K⁻¹ y se calienta 50 K. Con dilatación lineal, ¿cuánto aumenta su longitud en milímetros?','Aplicamos el modelo lineal de dilatación.',r'\Delta L=\alpha L_0\Delta T=10^{-5}(2)(50)=0.001\,m',1,R(1,10**5)*2*50*1000,'mm'),
 N('Una pieza de 1 m se alarga 0.002 m. ¿Cuál es su longitud final?','La longitud final suma la variación a la inicial.',r'L_f=L_0+\Delta L=1+0.002',R(501,500),1+R(2,1000),'m'),
 N('Se funden 0.5 kg de una sustancia ya en su punto de fusión. Usa Lf=200000 J/kg. ¿Qué calor se necesita?','Durante el cambio de fase se usa calor latente.',r'Q=mL_f=0.5(200000)',100000,R(1,2)*200000,'J'),
 N('Una masa de 0.2 kg se vaporiza a su temperatura de ebullición. Usa Lv=1000000 J/kg. ¿Qué calor recibe?','La energía del cambio de fase es proporcional a la masa.',r'Q=mL_v=0.2(1000000)',200000,R(1,5)*1000000,'J'),
 N('Dos masas iguales de la misma sustancia, a 20 °C y 60 °C, se mezclan sin pérdidas ni cambio de fase. ¿Cuál es la temperatura final?','Con iguales capacidades caloríficas, los cambios opuestos tienen igual módulo.',r'mc(T_f-20)=mc(60-T_f)\Rightarrow 2T_f=80',40,R(20+60,2),r'^\circ C'),
 N('Una placa de área 2 m² tiene coeficiente superficial β=2×10⁻⁵ K⁻¹. Se calienta 50 K. En el modelo lineal, ¿cuánto aumenta su área?','La dilatación superficial usa el área inicial.',r'\Delta A=A_0\beta\Delta T=2(2\cdot10^{-5})(50)',R(1,500),2*2*R(1,10**5)*50,r'm^2'),
 N('Un sólido isotrópico tiene α=10⁻⁵ K⁻¹. En la aproximación γ=3α, ¿cuál es su coeficiente de dilatación volumétrica?','La relación aproximada combina las tres direcciones espaciales.',r'\gamma\approx3\alpha=3\cdot10^{-5}',R(3,10**5),3*R(1,10**5),r'K^{-1}'),
 N('Una sustancia libera 800 J al solidificarse. Si su calor latente es 4000 J/kg, ¿qué masa cambia de fase?','Usamos el módulo del calor latente liberado.',r'm=|Q|/L_f=800/4000',R(1,5),R(800,4000),'kg'),
 N('Dos cuerpos de capacidades caloríficas constantes 100 J/K y 200 J/K están a 20 °C y 50 °C. Se ponen en contacto sin pérdidas ni cambio de fase. ¿Qué temperatura final alcanzan?','Igualamos el calor ganado y el perdido.',r'100(T_f-20)=200(50-T_f)\Rightarrow T_f=12000/300',40,R(100*20+200*50,100+200),r'^\circ C'),
 C('Mientras una sustancia pura se funde a presión fija en equilibrio…',['Su temperatura aumenta necesariamente todo el tiempo.','El calor puede cambiar la fase sin elevar la temperatura.','No absorbe energía.','El calor específico se vuelve cero.'],1,['En la coexistencia de fases la temperatura se mantiene bajo esas condiciones.','La energía se emplea en el cambio de fase.','Se calcula con calor latente, no con un incremento de temperatura.']),
 C('Una placa homogénea e isotrópica con un agujero se calienta uniformemente y tiene coeficiente de dilatación positivo. El agujero…',['Se reduce siempre.','Se dilata como si estuviera ocupado por el mismo material.','Conserva exactamente su tamaño para toda temperatura.','Desaparece al dilatarse la placa.'],1,['La dilatación uniforme escala las distancias de toda la placa.','El borde del agujero se desplaza con el material que lo rodea.','El agujero aumenta sus dimensiones bajo las condiciones indicadas.']),
],
'8.1':[
 N('Un cuerpo de masa 2 kg ocupa 0.001 m³. ¿Cuál es su densidad media?','La densidad relaciona masa y volumen.',r'\rho=m/V=2/0.001',2000,2/R(1,1000),r'kg/m^3'),
 N('Una fuerza normal de 100 N se distribuye uniformemente sobre 0.02 m². ¿Qué presión ejerce?','La presión es fuerza normal por unidad de área.',r'p=F/A=100/0.02',5000,100/R(2,100),'Pa'),
 N('En agua de densidad 1000 kg/m³, ¿qué presión manométrica hay a 2 m? Usa g=10 m/s².','La presión hidrostática manométrica depende de profundidad.',r'p=\rho gh=1000(10)(2)',20000,1000*10*2,'Pa'),
 N('La presión atmosférica es 100000 Pa y la manométrica 20000 Pa. ¿Qué presión absoluta hay?','La presión absoluta suma la referencia atmosférica.',r'p_{abs}=p_{atm}+p_{man}=100000+20000',120000,100000+20000,'Pa'),
 N('Un fluido ideal incompresible pasa de un área 6 cm² a 2 cm². Si v1=2 m/s, ¿cuánto vale v2?','La continuidad conserva el caudal.',r'A_1v_1=A_2v_2\Rightarrow v_2=6(2)/2',6,R(6*2,2),'m/s'),
 N('Agua atraviesa una sección de 0.01 m² a 3 m/s. ¿Cuál es el caudal volumétrico?','El caudal es área por velocidad media normal.',r'Q=Av=0.01(3)',R(3,100),R(1,100)*3,r'm^3/s'),
 N('Un caudal constante de 0.02 m³/s circula durante 5 s. ¿Qué volumen transporta?','Para caudal constante, volumen es caudal por tiempo.',r'V=Qt=0.02(5)',R(1,10),R(2,100)*5,r'm^3'),
 N('En un líquido de densidad 800 kg/m³, ¿qué diferencia de presión hay entre dos puntos separados verticalmente 3 m? Usa g=10 m/s².','El incremento de presión con profundidad es ρgΔh.',r'\Delta p=800(10)(3)',24000,800*10*3,'Pa'),
 N('Un tubo tiene caudal 0.12 m³/s y sección 0.04 m². ¿Qué velocidad media corresponde?','Despejamos la velocidad en el caudal.',r'v=Q/A=0.12/0.04',3,R(12,100)/R(4,100),'m/s'),
 C('En un líquido homogéneo en reposo, dos puntos a la misma profundidad tienen…',['Igual presión, bajo la misma superficie libre y presión exterior.','Presiones determinadas solo por el ancho del recipiente.','Presión cero.','Presión proporcional al volumen total del recipiente.'],0,['La presión hidrostática depende de la densidad y de la profundidad.','La forma del recipiente no aparece en esa relación.','A igual profundidad y referencia exterior, las presiones son iguales.']),
 C('La ecuación de Bernoulli en su forma ideal simple supone…',['Flujo estacionario, incompresible y sin viscosidad, a lo largo de una línea de corriente.','Cualquier flujo turbulento con pérdidas arbitrarias.','Que la velocidad sea siempre cero.','Que la presión sea igual en todos los puntos.'],0,['Bernoulli ideal expresa conservación de energía mecánica del fluido.','Las pérdidas viscosas requieren términos adicionales.','La forma simple se aplica bajo las hipótesis indicadas.']),
],
'8.2':[
 N('Una prensa hidráulica ideal tiene áreas 2 cm² y 20 cm². Se aplican 50 N al pistón pequeño. ¿Qué fuerza entrega el grande?','El incremento de presión se transmite por el fluido.',r'F_2=F_1A_2/A_1=50(20)/2',500,R(50*20,2),'N'),
 N('Un cuerpo desplaza 0.003 m³ de agua de densidad 1000 kg/m³. Usa g=10 m/s². ¿Qué empuje recibe?','El empuje iguala al peso del fluido desplazado.',r'E=\rho gV=1000(10)(0.003)',30,1000*10*R(3,1000),'N'),
 N('Un cuerpo pesa 50 N en aire y recibe empuje de 20 N. ¿Qué peso aparente marca una balanza que lo sostiene en reposo dentro del líquido?','El soporte aporta la diferencia entre peso y empuje.',r'T=P-E=50-20',30,50-20,'N'),
 N('Un cuerpo homogéneo de densidad 600 kg/m³ flota en agua de 1000 kg/m³. ¿Qué fracción de su volumen queda sumergida?','En flotación libre, el empuje iguala al peso.',r'V_s/V=\rho_c/\rho_l=600/1000',R(3,5),R(600,1000)),
 N('Un depósito grande tiene un orificio 5 m bajo su superficie. Sin pérdidas y con igual presión exterior, usa g=10 m/s². ¿Qué rapidez de salida predice Torricelli?','La diferencia de altura se convierte en energía cinética.',r'v=\sqrt{2gh}=\sqrt{2(10)(5)}',10,sqrt(2*10*5),'m/s'),
 N('En un conducto horizontal ideal con agua de 1000 kg/m³, v pasa de 2 a 4 m/s. ¿Cuánto disminuye la presión?','A igual altura, Bernoulli intercambia presión y término cinético.',r'p_1-p_2=\rho(v_2^2-v_1^2)/2=1000(16-4)/2',6000,R(1000*(16-4),2),'Pa'),
 N('Un cuerpo flota libremente en un líquido y pesa 24 N. ¿Cuánto vale el empuje?','La flotación en reposo exige equilibrio vertical.',r'E-P=0\Rightarrow E=24',24,24,'N'),
 N('En una prensa ideal, el pistón grande tiene diez veces el área del pequeño. Si el pequeño baja 20 cm, ¿cuánto sube el grande?','Se conserva el volumen de fluido desplazado.',r'A_1(20)=10A_1h_2\Rightarrow h_2=2',2,R(20,10),'cm'),
 N('Un objeto de volumen 0.002 m³ está totalmente sumergido en líquido de densidad 800 kg/m³. Usa g=10 m/s². ¿Qué empuje recibe?','El volumen desplazado coincide con el volumen sumergido.',r'E=800(10)(0.002)',16,800*10*R(2,1000),'N'),
 C('Si un cuerpo flota en reposo sin apoyo externo…',['El empuje es mayor que su peso.','El empuje es menor que su peso.','El empuje iguala a su peso.','El empuje es siempre cero.'],2,['Solo consideramos peso y empuje como fuerzas verticales.','La aceleración vertical es cero.','La resultante nula exige igualdad de módulos.']),
 C('El principio de Pascal se refiere a…',['La desaparición de la presión al aumentar el área.','La transmisión de un cambio de presión a un fluido confinado en equilibrio.','La conservación de velocidad en cualquier tubería.','La igualdad de densidades entre líquidos distintos.'],1,['Se aplica un incremento de presión al fluido confinado.','Ese incremento se transmite por el fluido en equilibrio.','No elimina la variación hidrostática debida a la altura.']),
],
'9.1':[
 N('Dos cargas puntuales de 1 μC y 2 μC están separadas 0.3 m en vacío. Usa k=9×10⁹ N·m²/C². ¿Qué módulo de fuerza se ejercen?','La ley de Coulomb usa las cargas en coulomb.',r'F=k|q_1q_2|/r^2=9\cdot10^9(10^{-6})(2\cdot10^{-6})/0.3^2',R(1,5),9*10**9*R(1,10**6)*R(2,10**6)/R(3,10)**2,'N'),
 N('Una carga positiva de 2 C recibe una fuerza de 10 N. ¿Qué módulo tiene el campo eléctrico en su posición?','El campo es fuerza por unidad de carga de prueba positiva.',r'E=F/q=10/2',5,R(10,2),r'N/C'),
 N('Una carga de 3 μC está en un campo uniforme de 2000 N/C. ¿Qué módulo de fuerza recibe?','Usamos el módulo de la relación F=qE.',r'F=|q|E=3\cdot10^{-6}(2000)',R(3,500),R(3,10**6)*2000,'N'),
 N('Un condensador ideal almacena 12 μC con 4 V entre sus placas. ¿Qué capacidad tiene en μF?','La capacidad es carga almacenada dividida entre voltaje.',r'C=Q/V=12/4',3,R(12,4),r'\mu F'),
 N('Una carga de 2 C tiene energía potencial eléctrica de 10 J. ¿Cuál es el potencial en esa referencia?','El potencial es energía potencial por unidad de carga.',r'V=U/q=10/2',5,R(10,2),'V'),
 N('Una corriente constante transporta 6 C en 2 s. ¿Qué intensidad tiene?','La corriente media es carga por tiempo.',r'I=Q/t=6/2',3,R(6,2),'A'),
 N('Una resistencia óhmica de 4 Ω tiene 12 V entre sus extremos. ¿Qué corriente circula?','Aplicamos la ley de Ohm para una resistencia óhmica.',r'I=V/R=12/4',3,R(12,4),'A'),
 N('Un resistor conduce 2 A al aplicarle 10 V. ¿Qué resistencia presenta?','Despejamos la resistencia.',r'R=V/I=10/2',5,R(10,2),r'\Omega'),
 N('Una resistencia de 3 Ω conduce 2 A. ¿Qué potencia disipa?','La potencia de Joule es I²R.',r'P=I^2R=2^2(3)',12,2**2*3,'W'),
 C('Las líneas de campo eléctrico de una carga puntual positiva aislada apuntan…',['Hacia la carga.','Radialmente hacia afuera.','En círculos cerrados alrededor de ella.','En una única dirección paralela.'],1,['El campo se define por la fuerza sobre una carga de prueba positiva.','Una carga positiva repele a esa carga de prueba.','La dirección es radial hacia afuera.']),
 C('Una carga negativa en un campo eléctrico uniforme recibe una fuerza…',['Con el mismo sentido del campo.','Perpendicular al campo en todo caso.','En sentido opuesto al campo.','Siempre nula.'],2,['La fuerza eléctrica es q por el campo vectorial.','Una carga negativa cambia el sentido del vector.','La fuerza apunta en sentido contrario al campo.']),
],
'9.2':[
 N('Dos resistencias de 3 Ω y 5 Ω están en serie. ¿Cuál es su resistencia equivalente?','En serie pasa la misma corriente y las caídas de voltaje se suman.',r'R_{eq}=3+5',8,3+5,r'\Omega'),
 N('Dos resistencias de 6 Ω están en paralelo. ¿Cuál es su resistencia equivalente?','En paralelo sumamos las conductancias.',r'1/R_{eq}=1/6+1/6\Rightarrow R_{eq}=3',3,1/(R(1,6)+R(1,6)),r'\Omega'),
 N('Una fuente ideal de 12 V alimenta resistencias en serie de 2 Ω y 4 Ω. ¿Qué corriente circula?','Sumamos las resistencias antes de aplicar Ohm.',r'I=12/(2+4)',2,R(12,2+4),'A'),
 N('Una fuente ideal de 12 V alimenta únicamente resistencias de 2 Ω y 4 Ω en serie. ¿Qué voltaje cae en la resistencia de 4 Ω?','La caída es corriente común por resistencia.',r'I=12/6=2;\quad V_4=2(4)',8,R(12,6)*4,'V'),
 N('A un nodo llegan 5 A y 2 A; por una rama salen 3 A. ¿Qué corriente debe salir por la otra rama en régimen estacionario?','La ley de nodos conserva carga.',r'I=5+2-3',4,5+2-3,'A'),
 N('Una carga de +2 C va de potencial 10 V a 4 V. ¿Qué trabajo realiza la fuerza eléctrica?','El trabajo eléctrico es el opuesto del cambio de energía potencial.',r'W=q(V_i-V_f)=2(10-4)',12,2*(10-4),'J'),
 N('Una resistencia consume 20 W durante 5 s. ¿Qué energía eléctrica transforma?','Para potencia constante, energía es potencia por tiempo.',r'E=Pt=20(5)',100,20*5,'J'),
 N('Una batería tiene fem 12 V, resistencia interna 1 Ω y corriente de descarga 2 A. ¿Qué voltaje hay en sus bornes?','Al entregar corriente, la resistencia interna reduce el voltaje terminal.',r'V=\mathcal E-Ir=12-2(1)',10,12-2*1,'V'),
 N('Un condensador de 2 F se carga a 3 V. ¿Qué energía almacena?','La energía del condensador es CV²/2.',r'U=CV^2/2=2(3^2)/2',9,R(2*3**2,2),'J'),
 C('En dos resistencias conectadas en paralelo ideal…',['Circula necesariamente la misma corriente por ambas.','El voltaje entre extremos es el mismo.','La resistencia equivalente es la suma directa.','Una debe tener corriente cero.'],1,['Ambas ramas comparten el mismo par de nodos.','La diferencia de potencial entre esos nodos es única.','La corriente de cada rama depende de su resistencia.']),
 C('La ley de mallas de Kirchhoff en un circuito de corriente continua sin inducción expresa…',['La conservación de la carga de cada electrón.','Que todas las resistencias son iguales.','Que la suma algebraica de cambios de potencial en una vuelta es cero.','Que toda batería entrega siempre su corriente máxima.'],2,['Al volver al punto inicial, el potencial recupera su valor.','Se suman subidas y caídas con signos coherentes.','La suma algebraica es cero bajo las condiciones del circuito indicadas.']),
],
'10.1':[
 N('Una carga de 2 C se mueve a 3 m/s perpendicular a un campo de 4 T. ¿Qué módulo tiene la fuerza magnética?','La fuerza magnética usa la componente perpendicular de la velocidad.',r'F=|q|vB\sin90^\circ=2(3)(4)',24,2*3*4,'N'),
 N('Una carga se mueve paralela a un campo magnético uniforme. ¿Qué módulo de fuerza magnética recibe?','El seno del ángulo paralelo es cero.',r'F=|q|vB\sin0^\circ=0',0,0,'N'),
 N('Una partícula de masa 2 kg y carga 1 C entra perpendicularmente a B=4 T con v=6 m/s. ¿Qué radio describe en el modelo clásico?','La fuerza magnética proporciona la fuerza radial.',r'r=mv/(|q|B)=2(6)/(1\cdot4)',3,R(2*6,4),'m'),
 N('Un conductor recto largo lleva 10 A. A 0.1 m, usa μ0=4π×10⁻⁷ T·m/A. ¿Qué campo produce en microtesla?','El campo de un conductor largo disminuye como 1/r.',r'B=\mu_0I/(2\pi r)=2\cdot10^{-5}\,T',20,(4*pi*R(1,10**7)*10/(2*pi*R(1,10)))*10**6,r'\mu T'),
 N('Un solenoide largo ideal tiene n=1000 vueltas/m e I=2 A. Usa μ0=4π×10⁻⁷ T·m/A. ¿Cuál es B/π en tesla?','Dentro del solenoide largo ideal, B=μ0nI.',r'B/\pi=4\cdot10^{-7}(1000)(2)',R(1,1250),4*R(1,10**7)*1000*2,'T'),
 N('Para un alambre largo, el campo a distancia r es 12 μT. ¿Cuánto vale a 3r con la misma corriente?','La dependencia radial es inversa.',r'B_2=B_1/3=12/3',4,R(12,3),r'\mu T'),
 N('En una órbita magnética, una partícula mantiene masa, rapidez y campo. Si se duplica |q|, ¿por qué factor cambia el radio?','El radio es inversamente proporcional al módulo de carga.',r'r_2/r_1=|q_1|/|q_2|=1/2',R(1,2),R(1,2),'veces'),
 N('Una partícula con v perpendicular a B tiene m=1 kg, |q|=2 C y B=5 T. ¿Cuánto vale su frecuencia angular clásica?','La frecuencia angular es |q|B/m.',r'\omega=|q|B/m=2(5)/1',10,R(2*5,1),r'rad/s'),
 N('Una carga positiva de 1 C tiene velocidad 2 m/s hacia +x y campo 3 T hacia +y. ¿Cuál es la componente z de la fuerza?','Usamos el producto vectorial y la orientación de los ejes.',r'\vec F=q\vec v\times\vec B=1(2)(3)\hat k',6,1*2*3,'N'),
 C('Una fuerza magnética que es siempre perpendicular a la velocidad…',['Aumenta necesariamente la rapidez.','No realiza trabajo sobre la partícula.','Reduce necesariamente la energía cinética.','No puede cambiar la dirección de movimiento.'],1,['El trabajo instantáneo depende del producto escalar fuerza–velocidad.','Dos vectores perpendiculares tienen producto escalar cero.','La fuerza puede cambiar la dirección sin cambiar la rapidez.']),
 C('Al cambiar el signo de una carga manteniendo v y B, la fuerza magnética…',['No cambia.','Se duplica.','Invierte su sentido.','Se vuelve paralela al campo.'],2,['La fuerza contiene la carga con su signo.','Velocidad y campo permanecen iguales.','Multiplicar por la carga opuesta invierte el vector fuerza.']),
],
'10.2':[
 N('Un alambre de 0.5 m conduce 4 A perpendicularmente a B=2 T. ¿Qué módulo de fuerza recibe?','La fuerza sobre el tramo recto usa I, longitud y campo.',r'F=ILB\sin90^\circ=4(0.5)(2)',4,4*R(1,2)*2,'N'),
 N('Un campo uniforme de 3 T es perpendicular a una superficie plana de 2 m². ¿Qué flujo la atraviesa?','El ángulo se mide entre el campo y la normal de la superficie.',r'\Phi=BA\cos0^\circ=3(2)',6,3*2,'Wb'),
 N('Un campo de 4 T forma 60° con la normal de una superficie de 3 m². ¿Qué flujo la atraviesa?','Usamos el coseno del ángulo con la normal.',r'\Phi=4(3)\cos60^\circ',6,4*3*s.cos(pi/3),'Wb'),
 N('El flujo por vuelta cambia de 0.2 Wb a 0.8 Wb en 0.3 s en una espira. ¿Qué módulo de fem media se induce?','La ley de Faraday usa el cambio de flujo por tiempo.',r'|\mathcal E|=|0.8-0.2|/0.3',2,(R(8,10)-R(2,10))/R(3,10),'V'),
 N('Una bobina de 10 vueltas tiene cambio de flujo por vuelta de 0.04 Wb en 0.2 s. ¿Qué módulo de fem media se induce?','Cada vuelta aporta la misma variación de flujo.',r'|\mathcal E|=N|\Delta\Phi|/\Delta t=10(0.04)/0.2',2,10*R(4,100)/R(2,10),'V'),
 N('Una barra de 0.5 m se mueve a 4 m/s sobre rieles dentro de B=3 T. Barra, velocidad y campo son perpendiculares entre sí. ¿Qué fem motriz se produce?','Para la geometría indicada se usa BLv.',r'\mathcal E=BLv=3(0.5)(4)',6,3*R(1,2)*4,'V'),
 N('Un transformador ideal tiene 100 vueltas primarias y 50 secundarias. Recibe 20 V alternos eficaces. ¿Qué voltaje eficaz entrega?','La razón de voltajes sigue la razón de vueltas.',r'V_s=V_p\frac{N_s}{N_p}=20\frac{50}{100}',10,R(20*50,100),'V'),
 N('Una fem inducida de 12 V alimenta una resistencia total de 3 Ω. ¿Qué corriente circula en el modelo resistivo?','Aplicamos Ohm a la fem y la resistencia total.',r'I=12/3',4,R(12,3),'A'),
 N('Una bobina rígida permanece inmóvil en un campo uniforme y constante. Su orientación no cambia. ¿Qué fem se induce por variación de flujo?','La fem de Faraday requiere flujo variable.',r'\Delta\Phi=0\Rightarrow\mathcal E=0',0,0,'V'),
 C('La ley de Lenz establece que la corriente inducida…',['Refuerza siempre el aumento del flujo que la produce.','Se opone al cambio de flujo que la origina.','Tiene siempre sentido horario.','Existe únicamente si la bobina gira.'],1,['El sentido de la inducción se determina por el cambio de flujo.','La respuesta magnética se opone a ese cambio.','No hay un sentido horario universal: depende de la geometría y de la variación.']),
 C('Para calcular Φ=BA cos(θ), el ángulo θ se mide entre…',['El campo y el plano de la superficie.','La corriente y el eje de giro.','El campo y la normal a la superficie.','Dos líneas cualesquiera del campo.'],2,['El flujo cuenta la componente de B perpendicular al área.','Esa componente es B cos(θ) si θ se mide desde la normal.','Usar el ángulo con el plano requiere cambiar a seno.']),
],
'11.1':[
 N('Un oscilador ideal tiene periodo 0.5 s. ¿Cuál es su frecuencia?','Frecuencia y periodo son recíprocos.',r'f=1/T=1/0.5',2,1/R(1,2),'Hz'),
 N('Un resorte ideal de k=100 N/m sostiene una masa de 1 kg en un oscilador horizontal sin rozamiento. ¿Cuál es su frecuencia angular?','La frecuencia angular del sistema masa–resorte es raíz de k/m.',r'\omega=\sqrt{k/m}=\sqrt{100/1}',10,sqrt(R(100,1)),r'rad/s'),
 N('En MAS, A=0.2 m y ω=5 rad/s. ¿Cuál es la rapidez máxima?','La rapidez máxima se alcanza en el equilibrio.',r'v_{max}=\omega A=5(0.2)',1,5*R(1,5),'m/s'),
 N('En MAS, A=0.1 m y ω=4 rad/s. ¿Qué módulo máximo de aceleración hay?','La aceleración es proporcional al desplazamiento respecto del equilibrio.',r'a_{max}=\omega^2A=4^2(0.1)',R(8,5),16*R(1,10),r'm/s^2'),
 N('Un oscilador masa–resorte tiene k=50 N/m y A=0.2 m. ¿Qué energía mecánica conserva?','En los extremos toda la energía es elástica.',r'E=kA^2/2=50(0.2)^2/2',1,50*R(1,5)**2/2,'J'),
 N('Un péndulo simple tiene L=1 m y g=10 m/s². Para oscilaciones pequeñas, ¿cuánto vale T/π?','El periodo aproximado depende de L y g.',r'T/\pi=2\sqrt{L/g}=2\sqrt{1/10}',sqrt(10)/5,2*sqrt(R(1,10)),'s'),
 N('Un espejo cóncavo tiene distancia focal 10 cm. ¿Qué radio de curvatura tiene en el modelo paraxial?','La distancia focal es la mitad del radio.',r'R=2f=2(10)',20,2*10,'cm'),
 N('Una lente convergente delgada tiene f=10 cm y objeto real a 30 cm. Con 1/f=1/do+1/di, ¿a qué distancia positiva se forma la imagen?','Despejamos la distancia imagen de la ecuación de lente.',r'1/d_i=1/10-1/30\Rightarrow d_i=15',15,1/(R(1,10)-R(1,30)),'cm'),
 N('Una lente forma imagen real a 20 cm de un objeto situado a 40 cm. ¿Cuál es el aumento transversal con signo m=−di/do?','El signo negativo representa inversión en esta convención.',r'm=-20/40',R(-1,2),R(-20,40)),
 C('En MAS ideal, la fuerza recuperadora es…',['Proporcional al desplazamiento y dirigida hacia el equilibrio.','Constante en todo el recorrido.','Nula en los extremos.','Siempre paralela a la velocidad y con su sentido.'],0,['La fuerza del MAS se opone al desplazamiento desde el equilibrio.','Su módulo aumenta proporcionalmente con la separación.','Por eso la aceleración también apunta al equilibrio.']),
 C('Un espejo plano forma, para un objeto real frente a él, una imagen…',['Real e invertida y del doble de tamaño.','Virtual, derecha y del mismo tamaño.','Real, derecha y reducida.','Siempre sobre la superficie del espejo.'],1,['Los rayos reflejados divergen como si procedieran de detrás del espejo.','La imagen es virtual y conserva orientación vertical y tamaño.','Su distancia aparente al espejo iguala la del objeto.']),
],
'11.2':[
 N('Una onda tiene frecuencia 5 Hz y longitud de onda 2 m. ¿Qué rapidez de propagación tiene?','La rapidez es producto de frecuencia y longitud de onda.',r'v=f\lambda=5(2)',10,5*2,'m/s'),
 N('Una onda se propaga a 300 m/s con frecuencia 100 Hz. ¿Qué longitud de onda tiene?','Despejamos λ en v=fλ.',r'\lambda=v/f=300/100',3,R(300,100),'m'),
 N('Un eco regresa en 2 s. Usa rapidez del sonido 340 m/s. ¿A qué distancia está la pared?','El sonido recorre ida y vuelta.',r'd=vt/2=340(2)/2',340,R(340*2,2),'m'),
 N('Una onda tiene periodo 0.02 s. ¿Cuál es su frecuencia?','La frecuencia es el inverso del periodo.',r'f=1/0.02',50,1/R(2,100),'Hz'),
 N('Un rayo en vacío viaja a 3×10⁸ m/s. En un medio con n=1.5, ¿cuál es su rapidez?','El índice de refracción es c dividido entre rapidez en el medio.',r'v=c/n=3\cdot10^8/1.5',200000000,3*10**8/R(3,2),'m/s'),
 N('Una cuerda ideal tiene tensión 100 N y densidad lineal 1 kg/m. ¿Qué rapidez tienen sus ondas transversales?','La rapidez en la cuerda depende de tensión y masa por longitud.',r'v=\sqrt{F_T/\mu}=\sqrt{100/1}',10,sqrt(100),'m/s'),
 N('Una cuerda de 2 m fija en ambos extremos vibra en su modo fundamental. ¿Qué longitud de onda tiene?','En el modo fundamental cabe media longitud de onda.',r'L=\lambda/2\Rightarrow\lambda=2(2)',4,2*2,'m'),
 N('Una onda en una cuerda viaja a 20 m/s. La cuerda mide 2 m y está fija en ambos extremos. ¿Qué frecuencia fundamental tiene?','Combinamos la condición de extremos fijos y la rapidez.',r'f_1=v/(2L)=20/(2\cdot2)',5,R(20,2*2),'Hz'),
 N('La luz tiene longitud de onda 6×10⁻⁷ m en vacío. Usa c=3×10⁸ m/s. ¿Cuál es su frecuencia?','Para la luz también se cumple c=fλ.',r'f=c/\lambda=(3\cdot10^8)/(6\cdot10^{-7})',500000000000000,3*10**8/(6*R(1,10**7)),'Hz'),
 C('En una onda transversal, la perturbación oscila…',['Paralela a la propagación.','Perpendicular a la propagación.','Siempre hacia el centro de la fuente.','Sin transportar energía.'],1,['Se distinguen dirección de propagación y dirección de oscilación.','Transversal significa que son perpendiculares.','La onda puede transportar energía sin transportar materia de forma neta.']),
 C('Cuando una onda cambia de medio en una frontera estacionaria, su frecuencia…',['La fija la fuente y se conserva al atravesar la frontera.','Siempre se duplica.','Se vuelve cero.','Es necesariamente igual a su rapidez numérica.'],0,['Las oscilaciones deben mantener continuidad temporal en la frontera.','La frecuencia procede de la fuente.','Pueden cambiar rapidez y longitud de onda, manteniendo la frecuencia.']),
],
'12.1':[
 N('Un fotón tiene frecuencia 10¹⁵ Hz. Para este cálculo usa h=4×10⁻¹⁵ eV·s. ¿Qué energía tiene?','La energía del fotón es proporcional a su frecuencia.',r'E=hf=(4\cdot10^{-15})(10^{15})',4,4*R(1,10**15)*10**15,'eV'),
 N('Un fotón de 5 eV incide sobre un metal de función de trabajo 2 eV. ¿Qué energía cinética máxima puede tener el fotoelectrón?','La energía primero debe cubrir la función de trabajo.',r'K_{max}=E-\phi=5-2',3,5-2,'eV'),
 N('Un metal tiene función de trabajo 3 eV. Usa h=4×10⁻¹⁵ eV·s. ¿Cuál es su frecuencia umbral?','En el umbral la energía cinética máxima es cero.',r'f_0=\phi/h=3/(4\cdot10^{-15})',750000000000000,3/(4*R(1,10**15)),'Hz'),
 N('Una partícula viaja a 0.6c. ¿Cuál es su factor relativista γ?','El factor relativista depende del cociente v/c.',r'\gamma=1/\sqrt{1-(0.6)^2}',R(5,4),1/sqrt(1-R(3,5)**2)),
 N('Un reloj móvil tiene intervalo propio de 4 s y γ=1.25. ¿Qué intervalo mide el observador respecto del cual se mueve?','La dilatación temporal multiplica el tiempo propio por γ.',r'\Delta t=\gamma\Delta\tau=1.25(4)',5,R(5,4)*4,'s'),
 N('Una barra tiene longitud propia 10 m y se mueve paralela a ella con γ=1.25. ¿Qué longitud mide el observador del laboratorio?','Solo la longitud paralela al movimiento se contrae en este caso.',r'L=L_0/\gamma=10/1.25',8,10/R(5,4),'m'),
 N('Una muestra radiactiva tiene 80 núcleos iniciales en un modelo de valor esperado. ¿Cuántos quedan sin desintegrar en promedio tras dos vidas medias?','Cada vida media reduce el valor esperado a la mitad.',r'N=80(1/2)^2',20,80*R(1,2)**2,'núcleos'),
 N('Una transición atómica va de −2 eV a −5 eV. ¿Qué energía tiene el fotón emitido?','La energía emitida es la diferencia positiva entre niveles.',r'E_\gamma=E_i-E_f=-2-(-5)',3,-2-(-5),'eV'),
 N('Un fotón de 2 eV incide sobre un metal cuya función de trabajo es 3 eV. ¿Cuántos electrones puede emitir ese fotón por el modelo fotoeléctrico de un fotón?','La energía del fotón no alcanza el umbral de extracción.',r'E_\gamma=2\,eV<\phi=3\,eV',0,0,'electrones'),
 C('En el efecto fotoeléctrico de un fotón, aumentar la intensidad con frecuencia menor al umbral…',['Garantiza electrones más rápidos.','No produce emisión en ese modelo, aunque lleguen más fotones.','Reduce automáticamente la función de trabajo a cero.','Convierte todos los fotones en electrones.'],1,['Cada fotón aporta energía hf.','Si hf es menor que la función de trabajo, no puede extraer el electrón por ese mecanismo.','Más fotones insuficientes no cambian la energía individual en el modelo indicado.']),
 C('La vida media radiactiva significa que…',['Todo núcleo se desintegra exactamente al llegar a ese tiempo.','La mitad exacta de cualquier muestra de dos núcleos debe desintegrarse.','El número esperado de núcleos sin desintegrar se reduce a la mitad.','La radiación desaparece por completo después de una vida media.'],2,['La desintegración de cada núcleo es probabilística.','La ley describe valores esperados y el comportamiento de poblaciones grandes.','No fija un instante idéntico de desintegración para cada núcleo.']),
],
'12.2':[
 N('Una partícula tiene momento p=2×10⁻²⁴ kg·m/s. Para el cálculo usa h=6×10⁻³⁴ J·s. ¿Qué longitud de onda de de Broglie tiene?','La longitud de onda asociada se obtiene de h/p.',r'\lambda=h/p=(6\cdot10^{-34})/(2\cdot10^{-24})',3*R(1,10**10),(6*R(1,10**34))/(2*R(1,10**24)),'m'),
 N('Si el momento de una partícula se triplica, ¿por qué factor cambia su longitud de onda de de Broglie?','La longitud de onda es inversamente proporcional al momento.',r'\lambda_2/\lambda_1=p_1/p_2=1/3',R(1,3),R(1,3),'veces'),
 N('Un proceso tiene energía umbral de 4 eV. Usa hc=1200 eV·nm. ¿Qué longitud de onda de fotón corresponde a esa energía?','Combinamos E=hc/λ y despejamos.',r'\lambda=hc/E=1200/4',300,R(1200,4),'nm'),
 N('En un proceso de incertidumbre se da ℏ=2×10⁻³⁴ J·s y Δx=10⁻¹⁰ m. ¿Cuál es la cota inferior de Δp según ΔxΔp≥ℏ/2?','La relación establece una cota, no una igualdad obligatoria.',r'\Delta p\ge\hbar/(2\Delta x)=(2\cdot10^{-34})/(2\cdot10^{-10})',R(1,10**24),(2*R(1,10**34))/(2*R(1,10**10)),r'kg\,m/s'),
 N('Una muestra tiene actividad inicial 1200 Bq. ¿Qué actividad esperada queda tras tres vidas medias del mismo radionúclido, sin producción adicional?','La actividad es proporcional al número de núcleos sin desintegrar.',r'A=1200(1/2)^3',150,1200*R(1,2)**3,'Bq'),
 N('Un núcleo tiene número másico A=40 y emite una partícula alfa. ¿Cuál es el número másico del núcleo hijo?','La partícula alfa lleva cuatro nucleones.',r'A_f=40-4',36,40-4),
 N('Un núcleo con Z=8 sufre desintegración beta menos. ¿Cuál es el Z del núcleo hijo?','En beta menos un neutrón se convierte en protón.',r'Z_f=8+1',9,8+1),
 N('Un núcleo con A=20 emite radiación gamma sin otra transformación. ¿Qué número másico conserva?','La emisión gamma cambia la energía nuclear, no la cuenta de nucleones.',r'A_f=A_i=20',20,20),
 N('Una masa en reposo tiene mc²=8 J y se mueve con γ=1.5. ¿Cuál es su energía cinética relativista?','La energía cinética resta la energía de reposo de la total.',r'K=(\gamma-1)mc^2=(1.5-1)8',4,(R(3,2)-1)*8,'J'),
 C('La dualidad onda–partícula indica que…',['Un electrón debe ser una onda de agua.','Los fenómenos cuánticos pueden mostrar propiedades ondulatorias y detecciones localizadas.','La materia pierde toda masa cuando interfiere.','Cada experimento elimina permanentemente la otra descripción.'],1,['La interferencia exige una descripción ondulatoria de las amplitudes.','Las detecciones se registran como eventos localizados.','La teoría cuántica integra ambos comportamientos sin identificarlos con objetos clásicos simples.']),
 C('La emisión alfa modifica un núcleo porque la partícula emitida contiene…',['Dos protones y dos neutrones.','Un electrón y un neutrón.','Solo un fotón.','Cuatro electrones.'],0,['Una partícula alfa es un núcleo de helio con dos protones y dos neutrones.','El núcleo hijo pierde cuatro nucleones y dos unidades de carga nuclear.','Por eso disminuyen A en cuatro y Z en dos.']),
],
}

def number_tex(value):
    # Exact terminating decimals; scientific notation instead of 20-digit denominators.
    if value.is_Rational:
        denominator=int(value.q)
        for factor in [2,5]:
            while denominator%factor==0:denominator//=factor
        if denominator==1:
            with localcontext()as context:
                context.prec=160
                number=(Decimal(int(value.p))/Decimal(int(value.q))).normalize()
                if number and (abs(number)<Decimal('0.0001')or abs(number)>=Decimal('10000000')):
                    coefficient,exponent=format(number,'E').split('E')
                    return coefficient+r'\times10^{'+str(int(exponent))+'}'
                return format(number,'f')
    return s.latex(value)

def label(value,unit,fractional=False):
    tex=s.latex(value)if fractional else number_tex(value)
    if not unit:return '$'+tex+'$'
    suffix=r'\text{'+unit+'}' if not unit.isascii()or unit in ['electrones','veces','unidades'] else r'\mathrm{'+unit+'}'
    return '$'+tex+r'\,'+suffix+'$'

def choices(answer,unit,rotation,integer_only=False,fractional=False,bounds=None):
    values=[]
    for v in [answer,answer*2,answer/2,answer*3,answer/3,answer+1,answer-1,answer+2,answer-2,answer+3,R(1,2),R(1,4),R(3,4)]:
        v=s.simplify(v)
        if answer>=0 and v<0:continue
        if bounds is not None and not(bounds[0]<=v<=bounds[1]):continue
        if (integer_only or unit in ['núcleos','electrones'])and not v.is_integer:continue
        if any(s.simplify(v-w)==0 for w in values):continue
        values.append(v)
        if len(values)==4:break
    assert len(values)==4
    values=values[rotation:]+values[:rotation]
    return [label(v,unit,fractional=fractional)for v in values],next(i for i,v in enumerate(values)if s.simplify(v-answer)==0)

def authored_math(text):
    # Known authored fragments only. Avoid treating Spanish "y" or "a" as a variable.
    snippets={
        'A=(2, −1, 3)':r'\vec A=(2,-1,3)','B=(1, 2, −2)':r'\vec B=(1,2,-2)',
        'A=(5, 2) m':r'\vec A=(5,2)\,\mathrm m','B=(1, −3) m':r'\vec B=(1,-3)\,\mathrm m',
        'A=(3, 4)':r'\vec A=(3,4)','A·B':r'\vec A\cdot\vec B','A−B':r'\vec A-\vec B',
        'x=0 m':r'x=0\,\mathrm m','x=4 m':r'x=4\,\mathrm m',
        'GM/r=36 m²/s²':r'GM/r=36\,\mathrm{m^2/s^2}','GM/r=50 m²/s²':r'GM/r=50\,\mathrm{m^2/s^2}',
        'g=10 m/s²':r'g=10\,\mathrm{m/s^2}','g=12 m/s²':r'g=12\,\mathrm{m/s^2}','g=4 m/s²':r'g=4\,\mathrm{m/s^2}',
        'α=10⁻⁵ K⁻¹':r'\alpha=10^{-5}\,\mathrm{K^{-1}}','β=2×10⁻⁵ K⁻¹':r'\beta=2\times10^{-5}\,\mathrm{K^{-1}}',
        'γ=3α':r'\gamma=3\alpha','k=9×10⁹ N·m²/C²':r'k=9\times10^9\,\mathrm{N\,m^2/C^2}',
        'μ0=4π×10⁻⁷ T·m/A':r'\mu_0=4\pi\times10^{-7}\,\mathrm{T\,m/A}',
        'm=1 kg':r'm=1\,\mathrm{kg}','|q|=2 C':r'|q|=2\,\mathrm C','B=5 T':r'B=5\,\mathrm T',
        'A=0.2 m':r'A=0.2\,\mathrm m','A=0.1 m':r'A=0.1\,\mathrm m',
        'ω=5 rad/s':r'\omega=5\,\mathrm{rad/s}','ω=4 rad/s':r'\omega=4\,\mathrm{rad/s}',
        'k=50 N/m':r'k=50\,\mathrm{N/m}','L=1 m':r'L=1\,\mathrm m',
        '1/f=1/do+1/di':r'\frac1f=\frac1{d_o}+\frac1{d_i}','m=−di/do':r'm=-d_i/d_o',
        'h=4×10⁻¹⁵ eV·s':r'h=4\times10^{-15}\,\mathrm{eV\,s}',
        'p=2×10⁻²⁴ kg·m/s':r'p=2\times10^{-24}\,\mathrm{kg\,m/s}',
        'h=6×10⁻³⁴ J·s':r'h=6\times10^{-34}\,\mathrm{J\,s}',
        'ℏ=2×10⁻³⁴ J·s':r'\hbar=2\times10^{-34}\,\mathrm{J\,s}',
        'Δx=10⁻¹⁰ m':r'\Delta x=10^{-10}\,\mathrm m','ΔxΔp≥ℏ/2':r'\Delta x\Delta p\ge\hbar/2',
        'c=3×10⁸ m/s':r'c=3\times10^8\,\mathrm{m/s}',
    }
    for original,tex in sorted(snippets.items(),key=lambda pair:-len(pair[0])):
        parts=text.split('$')
        for index in range(0,len(parts),2):parts[index]=parts[index].replace(original,'$'+tex+'$')
        text='$'.join(parts)
    parts=text.split('$');translation=str.maketrans('⁰¹²³⁴⁵⁶⁷⁸⁹⁻⁺','0123456789-+')
    for index in range(0,len(parts),2):
        parts[index]=re.sub(r'(\d+(?:\.\d+)?×)?10([⁰¹²³⁴⁵⁶⁷⁸⁹⁻⁺]+)',lambda m:'$'+(m[1][:-1]+r'\times'if m[1]else'')+'10^{'+m[2].translate(translation)+'}$',parts[index])
        parts[index]=re.sub(r'(?<![\w])([+−]\d+) m/s',lambda m:'$'+m[1].replace('−','-')+r'\,\mathrm{m/s}$',parts[index])
    return '$'.join(parts)

def build(write=False):
    production=ROOT/'shared/src/commonMain/composeResources/files/aprender/fisica'
    fixtures=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/fisica'
    preserved=[production/'semana01/1.1/questions.json',production/'semana02/2.1/questions.json',production/'semana02/2.2/questions.json']
    hashes={str(p.relative_to(ROOT)):hashlib.sha256(p.read_bytes()).hexdigest()for p in preserved}
    preview=[];proofs=[]
    for level,tasks in BANK.items():
        assert len(tasks)==11,(level,len(tasks))
        week,part=map(int,level.split('.'));rel=Path(f'semana{week:02}')/level/'questions.json'
        path=production/rel;old=json.loads(path.read_text(encoding='utf-8-sig'));out=[]
        assert len(old)==10 or len(old)==11
        for i,task in enumerate(tasks):
            qid=f'fis_t{week:02}_s{part:02}_c{i+1:02}'
            if 'answer'in task:
                options,key=choices(task['answer'],task['unit'],i%4)
                steps=[task['rule'],'Sustituimos los datos: $'+task['model']+'$.','El resultado pedido es '+label(task['answer'],task['unit'])+'.']
                proofs.append(dict(id=qid,model=task['model'],answer=str(task['answer']),calculated=str(task['calculated']),unit=task['unit']))
            else:
                options,key=task['options'],task['key'];steps=task['steps']
            q=dict(id=qid,concept=f'{level}.{i+1}',type='MULTIPLE_CHOICE',subject='fisica',semana=week,
                   statement=authored_math(task['stem']),options=options,correctIndex=key,
                   explanation='\n'.join(f'{j+1}. {step}'for j,step in enumerate(steps)),
                   fuente='Ejercicio original RASTRO; contraste en docs/aprender/fisica/REVISION_PRACTICA_PENDIENTE.md',pedagogicalTier='aplicación')
            out.append(q)
        assert len({q['statement']for q in out})==11,level
        assert [q['id']for q in old]==[q['id']for q in out[:len(old)]],level
        if write:
            backup=ROOT/'build/academic-backup-physics-pending'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(json.dumps(out,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
            assert(fixtures/rel).exists();shutil.copy2(path,fixtures/rel)
        preview.extend(out)
    assert all(hashlib.sha256((ROOT/p).read_bytes()).hexdigest()==v for p,v in hashes.items())
    report=dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),conceptualQuestions=len(preview)-len(proofs),preservedHashes=hashes,proofs=proofs)
    (ROOT/'build/physics-pending-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    (ROOT/'build/physics-pending-proofs.json').write_text(json.dumps(report,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps({k:v for k,v in report.items()if k not in ['proofs','preservedHashes']}|{'written':write}))

if __name__=='__main__':
    parser=argparse.ArgumentParser();parser.add_argument('--write',action='store_true');build(parser.parse_args().write)
