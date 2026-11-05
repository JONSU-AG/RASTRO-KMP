"""Explicit trigonometry exercises for the 23 pending resource levels."""
from pathlib import Path
import json,shutil,argparse,hashlib,re
from review_physics_practice import N,C,R,pi,sqrt,s,choices,ROOT
sin=s.sin;cos=s.cos;tan=s.tan
x=s.Symbol('x',real=True)
def roots(expression,closed=False):
    result=s.solveset(expression,x,domain=s.Interval(0,2*pi,right_open=not closed))
    assert isinstance(result,s.FiniteSet),(expression,result)
    return sorted(result,key=lambda v:float(v))
BANK={
'1.2':[
 N('Convierte 50 grados centesimales a grados sexagesimales.','Una vuelta tiene 400 grados centesimales y 360 sexagesimales.',r'S=50\frac{360}{400}',45,50*R(360,400),r'^\circ'),
 N(r'Convierte $\pi/3$ radianes a grados sexagesimales.','Media vuelta equivale a π radianes o 180 grados.',r'S=\frac\pi3\frac{180}{\pi}',60,pi/3*180/pi,r'^\circ'),
 N('Convierte 72 grados sexagesimales a grados centesimales.','Multiplicamos por la razón entre ambas unidades.',r'C=72\frac{400}{360}',80,72*R(400,360),'g'),
 N(r'Para el mismo ángulo, S y C son sus medidas sexagesimal y centesimal. Si $C-S=8$, calcula S.','Las medidas del mismo ángulo cumplen S/9=C/10.',r'S=9k,\ C=10k;\quad k=8\Rightarrow S=72',72,9*8,r'^\circ'),
 N('¿Cuántos minutos sexagesimales hay en 2.5 grados sexagesimales?','Cada grado sexagesimal contiene sesenta minutos.',r'M=2.5(60)',150,R(5,2)*60,'minutos'),
 N('¿Cuántos segundos sexagesimales hay en 0.5 minutos sexagesimales?','Cada minuto sexagesimal contiene sesenta segundos.',r's=0.5(60)',30,R(1,2)*60,'segundos'),
 N(r'S y C son medidas positivas del mismo ángulo en grados sexagesimales y centesimales. Calcula $(C+S)/(C-S)$.','Usamos la proporción fija entre medidas del mismo ángulo.',r'\frac{C+S}{C-S}=\frac{10k+9k}{10k-9k}=19',19,R(10+9,10-9)),
 N('¿Qué ángulo entre 0° y 360° es coterminal con −30°?','Sumar una vuelta no cambia el lado terminal.',r'-30^\circ+360^\circ=330^\circ',330,-30+360,r'^\circ'),
 N('¿Cuántos grados sexagesimales representa una rotación de 1.5 vueltas?','Una vuelta completa corresponde a 360 grados.',r'S=1.5(360)',540,R(3,2)*360,r'^\circ'),
 C('Para convertir unidades de un mismo ángulo se debe…',['Cambiar la amplitud geométrica del ángulo.','Multiplicar por un factor que represente una equivalencia entre unidades.','Sumar siempre 90 al número inicial.','Usar la misma cantidad numérica en todas las unidades.'],1,['La amplitud del ángulo se conserva.','Cambian la unidad y la cantidad de unidades que la mide.','El factor de conversión expresa la misma medida en dos sistemas.']),
 C('Un ángulo trigonométrico negativo representa, en la convención usual…',['Un giro horario desde el lado inicial.','Un giro antihorario obligatorio.','Una amplitud que no puede dibujarse.','Un ángulo con seno necesariamente negativo.'],0,['El signo indica sentido de giro.','La convención toma positivo el giro antihorario.','El giro horario se representa con signo negativo; el signo del seno depende del lado terminal.']),
],
'2.1':[
 N(r'Un arco de radio 3 m abarca $\theta=2$ rad. ¿Qué longitud tiene?','La fórmula de arco usa el ángulo en radianes.',r'L=r\theta=3(2)',6,3*2,'m'),
 N(r'Un sector de radio 4 m tiene ángulo $\pi/2$ rad. ¿Cuál es su área?','El área sectorial es la fracción angular del círculo.',r'A=r^2\theta/2=4^2(\pi/2)/2',4*pi,4**2*(pi/2)/2,r'm^2'),
 N('Un arco mide 10 cm y su radio 5 cm. ¿Qué ángulo central abarca en radianes?','Despejamos el ángulo del arco.',r'\theta=L/r=10/5',2,R(10,5),'rad'),
 N('Un sector tiene radio 6 cm y arco 4 cm. ¿Qué área tiene?','Combinamos A=r²θ/2 y L=rθ.',r'A=rL/2=6(4)/2',12,R(6*4,2),r'cm^2'),
 N('Un sector de 90° pertenece a un círculo de radio 2 cm. ¿Qué longitud tiene su arco?','Convertimos grados a radianes antes de multiplicar.',r'\theta=\pi/2;\quad L=2(\pi/2)',pi,2*(pi/2),'cm'),
 N(r'Un sector tiene área 18 cm² y ángulo 1 rad. ¿Cuál es su radio positivo?','Despejamos el cuadrado del radio.',r'r=\sqrt{2A/\theta}=\sqrt{36}',6,sqrt(2*18),r'cm'),
 N(r'Dos sectores comparten $\theta=1$ rad y tienen radios 3 cm y 5 cm. ¿Qué área tiene la región entre sus arcos?','Restamos las áreas de los sectores concéntricos.',r'A=(5^2-3^2)(1)/2',8,R(25-9,2),r'cm^2'),
 N(r'Un semicírculo tiene radio 5 cm. ¿Qué longitud tiene su arco curvo, sin incluir el diámetro?','Un semicírculo abarca π radianes.',r'L=5\pi',5*pi,5*pi,'cm'),
 N('Se duplica el radio de un sector manteniendo su ángulo. ¿Por qué factor cambia el área?','A ángulo fijo, el área es proporcional al radio al cuadrado.',r'A_2/A_1=(2r)^2/r^2',4,2**2,'veces'),
 C(r'Para usar directamente $L=r\theta$, θ debe expresarse en…',['Grados sexagesimales.','Grados centesimales.','Radianes.','Minutos sexagesimales.'],2,['El radián se define como razón entre arco y radio.','Así θ=L/r.','La relación L=rθ usa θ en radianes.']),
 C('En un mismo círculo, si se duplica el ángulo central positivo, la longitud de arco…',['Se duplica.','Se cuadruplica.','Se reduce a la mitad.','No cambia.'],0,['El radio permanece constante.','La longitud de arco es proporcional al ángulo en radianes.','Duplicar el ángulo duplica el arco recorrido.']),
],
'2.2':[
 N('Una rueda gira a 2 vueltas por segundo. ¿Cuál es su rapidez angular en rad/s?','Cada vuelta aporta 2π radianes.',r'\omega=2(2\pi)',4*pi,2*2*pi,r'rad/s'),
 N('Una rueda de radio 0.5 m gira a 4 rad/s. ¿Cuál es la rapidez de un punto del borde?','La rapidez tangencial es radio por rapidez angular.',r'v=r\omega=0.5(4)',2,R(1,2)*4,'m/s'),
 N('Una rueda de radio 0.2 m da diez vueltas al rodar sin deslizar. ¿Qué distancia avanza su centro?','Sin deslizamiento, cada vuelta avanza una circunferencia.',r'd=10(2\pi\cdot0.2)',4*pi,10*2*pi*R(1,5),'m'),
 N('Una rueda gira a 60 revoluciones por minuto. ¿Cuántas vueltas da por segundo?','Un minuto contiene sesenta segundos.',r'f=60/60',1,R(60,60),'vueltas/s'),
 N('Una rueda gira a 3 rad/s constantes durante 4 s. ¿Qué ángulo recorre?','El desplazamiento angular uniforme es rapidez por tiempo.',r'\theta=\omega t=3(4)',12,3*4,'rad'),
 N(r'Una rueda completa 3 vueltas. ¿Cuál es su desplazamiento angular positivo en radianes?','Cada vuelta completa suma 2π.',r'\theta=3(2\pi)',6*pi,3*2*pi,'rad'),
 N('Dos poleas de radios 2 cm y 6 cm están unidas por una correa ideal sin deslizamiento. La pequeña gira a 9 rad/s. ¿A qué rapidez angular gira la grande?','La correa impone igual rapidez tangencial en los bordes.',r'r_1\omega_1=r_2\omega_2\Rightarrow\omega_2=2(9)/6',3,R(2*9,6),r'rad/s'),
 N('Una rueda tarda 0.5 s en completar una vuelta uniforme. ¿Cuál es su rapidez angular?','Dividimos el ángulo de una vuelta entre el periodo.',r'\omega=2\pi/0.5',4*pi,2*pi/R(1,2),r'rad/s'),
 N('Un sector tiene radio 4 cm y área 8 cm². ¿Qué longitud de arco tiene?','Usamos A=rL/2 sin calcular antes el ángulo.',r'L=2A/r=2(8)/4',4,R(2*8,4),'cm'),
 C('Rodar sin deslizar sobre una superficie plana implica…',['Que el centro no avanza.','Que la distancia recorrida por el centro equivale a r por el ángulo girado en radianes.','Que toda rueda gira siempre a 1 rad/s.','Que el radio cambia en cada vuelta.'],1,['En rodadura ideal no hay deslizamiento relativo en el contacto.','La longitud desenrollada coincide con el avance.','Por eso d=rθ para el centro sobre el plano.']),
 C('En dos poleas unidas por correa sin deslizamiento, se iguala…',['La rapidez angular aunque los radios difieran.','La rapidez tangencial de los bordes en contacto con la correa.','El radio de las poleas.','El número total de vueltas en todo intervalo.'],1,['La correa tiene una única rapidez lineal ideal.','Cada borde en contacto se mueve con esa rapidez.','Las velocidades angulares se ajustan a v=rω.']),
],
'3.1':[
 N('Un triángulo rectángulo tiene cateto opuesto 3 e hipotenusa 5 respecto de α. Calcula sin(α).','El seno divide cateto opuesto entre hipotenusa.',r'\sin\alpha=3/5',R(3,5),R(3,5)),
 N('Un triángulo rectángulo tiene catetos 3 y 4. Para el ángulo opuesto al cateto 3, calcula cos(α).','La hipotenusa se obtiene por Pitágoras.',r'h=\sqrt{3^2+4^2}=5;\quad\cos\alpha=4/5',R(4,5),4/sqrt(3**2+4**2)),
 N('Un triángulo rectángulo tiene cateto opuesto 5 y adyacente 12 respecto de α. Calcula tan(α).','La tangente compara ambos catetos.',r'\tan\alpha=5/12',R(5,12),R(5,12)),
 N(r'α es agudo y $\sin\alpha=5/13$. Calcula cos(α).','El coseno es positivo para un ángulo agudo.',r'\cos\alpha=\sqrt{1-(5/13)^2}',R(12,13),sqrt(1-R(5,13)**2)),
 N(r'α es agudo y $\tan\alpha=3/4$. Calcula sec(α).','Usamos una terna proporcional 3–4–5.',r'\sec\alpha=\sqrt{1+(3/4)^2}',R(5,4),sqrt(1+R(3,4)**2)),
 N('Calcula sin(30°).','En un triángulo 30°–60°–90°, el cateto menor es media hipotenusa.',r'\sin30^\circ=1/2',R(1,2),sin(pi/6)),
 N('Calcula cos(60°).','El ángulo de 60° es complementario de 30°.',r'\cos60^\circ=\sin30^\circ=1/2',R(1,2),cos(pi/3)),
 N('Calcula tan(45°).','En un triángulo rectángulo isósceles los catetos son iguales.',r'\tan45^\circ=1',1,tan(pi/4)),
 N(r'α es agudo y $\cos\alpha=4/5$. Calcula cosec(α).','Primero hallamos el seno positivo y luego su recíproco.',r'\sin\alpha=3/5;\quad\csc\alpha=5/3',R(5,3),1/sqrt(1-R(4,5)**2)),
 C('La hipotenusa de un triángulo rectángulo se identifica porque…',['Es cualquier lado vertical del dibujo.','Está opuesta al ángulo recto.','Es siempre el cateto adyacente.','Depende del ángulo agudo elegido.'],1,['El ángulo recto es único.','El lado opuesto es la hipotenusa.','Elegir otro ángulo agudo intercambia catetos opuesto y adyacente, pero no la hipotenusa.']),
 C('Para ángulos agudos complementarios α y β, se cumple…',[r'$\sin\alpha=\cos\beta$',r'$\sin\alpha=\sin\beta$ siempre.',r'$\tan\alpha=\tan\beta$ siempre.',r'$\cos\alpha=-\cos\beta$'],0,['Los dos ángulos agudos de un triángulo rectángulo suman 90°.','El cateto opuesto a uno es adyacente al otro.','Por eso seno de uno equivale a coseno de su complemento.']),
],
'3.2':[
 N('Una escalera de 10 m forma 30° con el suelo horizontal. ¿Qué altura alcanza en una pared vertical?','La altura es el cateto opuesto al ángulo del suelo.',r'h=10\sin30^\circ',5,10*sin(pi/6),'m'),
 N('Un triángulo rectángulo isósceles tiene hipotenusa 6 cm. ¿Cuánto mide cada cateto?','En 45°–45°–90°, el cateto es hipotenusa dividida entre raíz de dos.',r'c=6/\sqrt2=3\sqrt2',3*sqrt(2),6/sqrt(2),'cm'),
 N('Un triángulo 30°–60°–90° tiene cateto menor 4 cm. ¿Cuál es su hipotenusa?','El cateto opuesto a 30° es media hipotenusa.',r'h=2(4)',8,2*4,'cm'),
 N('Un triángulo 30°–60°–90° tiene cateto menor 3 cm. ¿Cuánto mide el cateto mayor?','Los lados guardan razón 1:√3:2.',r'c_{mayor}=3\sqrt3',3*sqrt(3),3*tan(pi/3),'cm'),
 N(r'α es agudo y $\cos\alpha=3/5$. Calcula tan(α/2).','Usamos la identidad de medio ángulo con seno positivo.',r'\tan(\alpha/2)=\frac{\sin\alpha}{1+\cos\alpha}=\frac{4/5}{1+3/5}',R(1,2),sqrt(1-R(3,5)**2)/(1+R(3,5))),
 N('Dos lados de un triángulo miden 6 y 8 cm y forman 30°. ¿Qué área tiene?','El área es medio producto de lados por el seno del ángulo comprendido.',r'A=6(8)\sin30^\circ/2',12,6*8*sin(pi/6)/2,r'cm^2'),
 N(r'α es agudo y $\cot\alpha=2$. Calcula tan(α).','Cotangente y tangente son recíprocas en su dominio.',r'\tan\alpha=1/\cot\alpha=1/2',R(1,2),R(1,2)),
 N('Una rampa recta mide 8 m y forma 60° con la horizontal. ¿Qué proyección horizontal tiene?','La proyección horizontal usa el coseno.',r'd=8\cos60^\circ',4,8*cos(pi/3),'m'),
 N(r'En un triángulo rectángulo, α es agudo y $\tan\alpha=1/\sqrt3$. ¿Cuánto vale α en grados?','Identificamos la razón del triángulo 30°–60°–90°.',r'\alpha=\arctan(1/\sqrt3)=30^\circ',30,s.atan(1/sqrt(3))*180/pi,r'^\circ'),
 C('En la fórmula de área A=ab sin(C)/2, C es…',['Cualquier ángulo externo.','El ángulo comprendido entre los lados a y b.','El ángulo opuesto a a, obligatoriamente.','Siempre el ángulo recto.'],1,['La altura correspondiente se obtiene con el seno del ángulo entre los lados dados.','Esa altura permite formar base por altura sobre dos.','El ángulo debe ser el comprendido entre a y b.']),
 C('Afirmar sin(37°)=3/5 exactamente es…',['Siempre correcto en la trigonometría real.','Una aproximación escolar que debe declararse, no una igualdad exacta.','La definición de radián.','Una propiedad de todos los ángulos agudos.'],1,['La terna 3–4–5 determina un ángulo cuyo seno exacto es 3/5.','Ese ángulo es cercano a 37°, pero no idéntico.','Si se usa la aproximación, debe indicarse expresamente.']),
],
'4.1':[
 N('Calcula sin(150°).','El segundo cuadrante conserva positivo el seno.',r'\sin150^\circ=\sin30^\circ',R(1,2),sin(5*pi/6)),
 N('Calcula cos(120°).','En el segundo cuadrante el coseno es negativo.',r'\cos120^\circ=-\cos60^\circ',R(-1,2),cos(2*pi/3)),
 N('Calcula tan(225°).','La tangente tiene periodo 180°.',r'\tan225^\circ=\tan45^\circ',1,tan(5*pi/4)),
 N('Calcula sin(270°).','La coordenada vertical del extremo en el círculo unitario es −1.',r'\sin270^\circ=-1',-1,sin(3*pi/2)),
 N('Calcula cos(360°).','Una vuelta vuelve al punto (1,0).',r'\cos360^\circ=1',1,cos(2*pi)),
 N('Calcula sin(−30°).','El seno es una función impar.',r'\sin(-30^\circ)=-\sin30^\circ',R(-1,2),sin(-pi/6)),
 N('Calcula cos(−60°).','El coseno es una función par.',r'\cos(-60^\circ)=\cos60^\circ',R(1,2),cos(-pi/3)),
 N('¿Qué ángulo de [0°,360°) es coterminal con 750°?','Restamos vueltas completas.',r'750^\circ-2(360^\circ)=30^\circ',30,750-720,r'^\circ'),
 N('El lado terminal de α pasa por (−3,4). Calcula sin(α).','Usamos y/r con radio positivo.',r'r=\sqrt{(-3)^2+4^2}=5;\quad\sin\alpha=4/5',R(4,5),4/sqrt(9+16)),
 C('La tangente no está definida en…',['0°.','45°.','90°.','180°.'],2,['La tangente es seno dividido entre coseno.','En 90° el coseno es cero.','La división por cero no define una tangente real finita.']),
 C('En el tercer cuadrante, seno y coseno son…',['Ambos positivos.','Seno positivo y coseno negativo.','Ambos negativos.','Seno negativo y coseno positivo.'],2,['En el tercer cuadrante x e y son negativos.','El radio es positivo.','Seno=y/r y coseno=x/r son negativos.']),
],
'4.2':[
 N('Calcula sin(390°).','Reducimos una vuelta completa.',r'\sin390^\circ=\sin30^\circ',R(1,2),sin(13*pi/6)),
 N('Calcula cos(240°).','El tercer cuadrante cambia el signo del coseno respecto del ángulo de referencia.',r'\cos240^\circ=-\cos60^\circ',R(-1,2),cos(4*pi/3)),
 N('Calcula tan(−135°).','Añadir 180° no cambia la tangente.',r'\tan(-135^\circ)=\tan45^\circ',1,tan(-3*pi/4)),
 N(r'Calcula $\sin(7\pi/6)$.','El ángulo está en el tercer cuadrante.',r'\sin(7\pi/6)=-\sin(\pi/6)',R(-1,2),sin(7*pi/6)),
 N(r'Calcula $\cos(5\pi/3)$.','El coseno es positivo en el cuarto cuadrante.',r'\cos(5\pi/3)=\cos(\pi/3)',R(1,2),cos(5*pi/3)),
 N(r'Calcula $\tan(9\pi/4)$.','Reducimos dos pi radianes.',r'\tan(9\pi/4)=\tan(\pi/4)',1,tan(9*pi/4)),
 N('Calcula sec(300°).','La secante es el recíproco del coseno no nulo.',r'\sec300^\circ=1/\cos300^\circ=2',2,1/cos(5*pi/3)),
 N('Calcula cosec(210°).','La cosecante es el recíproco del seno no nulo.',r'\csc210^\circ=1/\sin210^\circ=-2',-2,1/sin(7*pi/6)),
 N('Calcula cot(135°).','Cotangente es coseno entre seno.',r'\cot135^\circ=\cos135^\circ/\sin135^\circ',-1,cos(3*pi/4)/sin(3*pi/4)),
 C(r'La igualdad $\sin(\pi-x)=\sin x$ se explica porque…',['El seno tiene periodo π.','Los ángulos suplementarios tienen la misma coordenada vertical en la circunferencia unitaria.','Todos los suplementarios tienen el mismo coseno.','El coseno de todo ángulo es cero.'],1,['Los puntos de x y π−x se reflejan respecto del eje vertical.','Conservan la coordenada y y cambian la x.','Por eso se conserva el seno, pero cambia el signo del coseno.']),
 C(r'Para reducir $\cos(\pi/2+x)$, el resultado correcto es…',[r'$\cos x$',r'$\sin x$',r'$-\sin x$',r'$-\cos x$'],2,['Aplicamos el coseno de una suma.','Cos(π/2)=0 y sin(π/2)=1.','Queda −sin(x).']),
],
'5.1':[
 N(r'Calcula $\sin^2(20^\circ)+\cos^2(20^\circ)$.','La identidad pitagórica vale para todo ángulo real.',r'\sin^2x+\cos^2x=1',1,s.trigsimp(sin(pi/9)**2+cos(pi/9)**2)),
 N(r'α es agudo y $\tan\alpha=3/4$. Calcula sec²(α).','La identidad relaciona secante y tangente.',r'\sec^2\alpha=1+\tan^2\alpha=1+9/16',R(25,16),1+R(3,4)**2),
 N(r'α es agudo y $\cot\alpha=2$. Calcula cosec²(α).','La identidad relaciona cosecante y cotangente.',r'\csc^2\alpha=1+\cot^2\alpha=1+4',5,1+2**2),
 N(r'Si $\sin x\ne0$, calcula $(1-\cos^2x)/\sin^2x$.','Sustituimos el numerador con la identidad pitagórica.',r'\frac{1-\cos^2x}{\sin^2x}=\frac{\sin^2x}{\sin^2x}=1',1,s.trigsimp((1-cos(s.Symbol('x'))**2)/sin(s.Symbol('x'))**2)),
 N(r'Si $\cos x\ne0$, calcula $\sin x/(\cos x\tan x)$ para valores donde también $\sin x\ne0$.','Sustituimos tangente y respetamos el denominador original.',r'\frac{\sin x}{\cos x(\sin x/\cos x)}=1',1,1),
 N(r'α es agudo, $\sin\alpha=3/5$ y $\cos\alpha=4/5$. Calcula tan(α)+cot(α).','Sumamos el cociente y su recíproco.',r'3/4+4/3=25/12',R(25,12),R(3,4)+R(4,3)),
 N(r'Si $\sin x\ne0$, calcula $\sin x\,\csc x$.','Seno y cosecante son recíprocos en su dominio.',r'\sin x\frac1{\sin x}=1',1,1),
 N(r'Si $\cos x\ne0$, calcula $\cos x\,\sec x$.','Coseno y secante son recíprocos en su dominio.',r'\cos x\frac1{\cos x}=1',1,1),
 N(r'α es agudo y $\sin\alpha=1/2$. Calcula $1-\cos^2\alpha$.','La identidad permite sustituir por seno al cuadrado.',r'1-\cos^2\alpha=\sin^2\alpha=(1/2)^2',R(1,4),R(1,2)**2),
 C('Una identidad trigonométrica es una igualdad que…',['Solo se cumple para un ángulo elegido.','Se cumple para todos los valores del dominio común de las expresiones.','Permite dividir por cualquier expresión, aunque sea cero.','Siempre cambia el dominio original.'],1,['La igualdad debe sostenerse en todos los valores admisibles.','Si aparecen denominadores, sus ceros quedan excluidos.','Una identidad no autoriza operaciones fuera de su dominio.']),
 C(r'Al simplificar $\tan x\cos x$ a $\sin x$, se debe recordar que…',['La expresión original exige cos(x) distinto de cero.','La expresión original está definida para todo real.','La simplificación permite fijar cos(x)=0 en la expresión original.','Seno es siempre cero.'],0,['Tangente requiere coseno no nulo.','La cancelación produce una fórmula que puede tener dominio mayor.','Para equivalencia con el original se conserva su restricción.']),
],
'5.2':[
 N(r'Si $\sin x+\cos x=\sqrt2$, calcula $\sin x\cos x$.','Elevamos al cuadrado la suma y usamos la identidad pitagórica.',r'2=1+2\sin x\cos x',R(1,2),R(2-1,2)),
 N(r'Si $\sin x\cos x=1/4$, calcula $\sin^4x+\cos^4x$.','El cuadrado de la suma de cuadrados contiene el doble producto.',r'\sin^4x+\cos^4x=1-2(1/4)^2',R(7,8),1-2*R(1,4)**2),
 N(r'Si $\sin x+\cos x=1$, calcula $\sin^3x+\cos^3x$.','Hallamos primero el producto a partir del cuadrado de la suma.',r'\sin x\cos x=0;\quad a^3+b^3=(a+b)^3-3ab(a+b)=1',1,1),
 N(r'Si $\tan x=2$, calcula $\tan^2x+\cot^2x$.','La cotangente es el recíproco de la tangente no nula.',r'2^2+(1/2)^2',R(17,4),2**2+R(1,2)**2),
 N(r'Si $\sin x=3/5$ y x es agudo, calcula $(1-\cos x)/(1+\cos x)$.','El coseno agudo es la raíz positiva.',r'\cos x=4/5;\quad\frac{1-4/5}{1+4/5}=1/9',R(1,9),(1-R(4,5))/(1+R(4,5))),
 N(r'Si $\cos x=1/2$, calcula $\sin^2x\cos^2x$.','La identidad fija el cuadrado del seno sin necesitar su signo.',r'\sin^2x=3/4;\quad\sin^2x\cos^2x=(3/4)(1/4)',R(3,16),(1-R(1,2)**2)*R(1,2)**2),
 N(r'Si $\sin x\cos x=1/3$, calcula $(\sin x-\cos x)^2$.','Desarrollamos el cuadrado de una diferencia.',r'(\sin x-\cos x)^2=1-2/3',R(1,3),1-2*R(1,3)),
 N(r'Para x agudo con $\tan x=1$, calcula $\sec x\,\csc x$.','Seno y coseno son iguales y positivos.',r'\sec x\csc x=1/(\sin x\cos x)=2',2,1/(sin(pi/4)*cos(pi/4))),
 N(r'Calcula $\sin^6(45^\circ)+\cos^6(45^\circ)$.','Cada cuadrado vale un medio.',r'(1/2)^3+(1/2)^3',R(1,4),sin(pi/4)**6+cos(pi/4)**6),
 C('Probar una igualdad en un único ángulo…',['Demuestra automáticamente una identidad.','Puede descartar una identidad si falla, pero no la demuestra si se cumple.','Autoriza dividir por cero.','Elimina todas las restricciones de dominio.'],1,['Una identidad exige validez en todo el dominio común.','Un contraejemplo basta para rechazarla.','Un único ejemplo favorable no controla los demás valores.']),
 C(r'Si $\sin^2x=1/4$, entonces $\sin x$…',['Es necesariamente 1/2.','Es necesariamente −1/2.','Puede ser 1/2 o −1/2, según el ángulo.','Es 1/4.'],2,['Al deshacer un cuadrado aparecen dos signos posibles.','El cuadrante u otra condición determina el signo.','Sin esa información se conservan ambas posibilidades.']),
],
}

BANK.update({
'6.1':[
 N('Calcula sin(75°).','Usamos el seno de una suma tras descomponer 75° como 45°+30°.',r'\begin{aligned}\sin75^\circ&=\sin(45^\circ+30^\circ)\\&=\frac{\sqrt6}{4}+\frac{\sqrt2}{4}\end{aligned}',(sqrt(6)+sqrt(2))/4,sin(5*pi/12)),
 N('Calcula cos(15°).','Usamos el coseno de una diferencia tras escribir 15°=45°−30°.',r'\begin{aligned}\cos15^\circ&=\cos(45^\circ-30^\circ)\\&=\frac{\sqrt6}{4}+\frac{\sqrt2}{4}\end{aligned}',(sqrt(6)+sqrt(2))/4,cos(pi/12)),
 N('Calcula tan(75°).','Aplicamos la tangente de una suma con denominador no nulo.',r'\begin{aligned}\tan75^\circ&=\frac{1+1/\sqrt3}{1-1/\sqrt3}\\&=2+\sqrt3\end{aligned}',2+sqrt(3),tan(5*pi/12)),
 N('Calcula sin(15°).','Aplicamos el seno de la diferencia 45°−30°.',r'\begin{aligned}\sin15^\circ&=\sin(45^\circ-30^\circ)\\&=\frac{\sqrt6}{4}-\frac{\sqrt2}{4}\end{aligned}',(sqrt(6)-sqrt(2))/4,sin(pi/12)),
 N(r'α es agudo y $\sin\alpha=3/5$. Calcula sin(2α).','El doble ángulo usa seno y coseno; el coseno es positivo.',r'\sin2\alpha=2(3/5)(4/5)',R(24,25),2*R(3,5)*sqrt(1-R(3,5)**2)),
 N(r'α es agudo y $\cos\alpha=4/5$. Calcula cos(2α).','Usamos el coseno doble en función del coseno.',r'\cos2\alpha=2(4/5)^2-1',R(7,25),2*R(4,5)**2-1),
 N(r'α es agudo y $\tan\alpha=1/2$. Calcula tan(2α).','Comprobamos que 1−tan²(α) no sea cero.',r'\tan2\alpha=\frac{2(1/2)}{1-(1/2)^2}',R(4,3),2*R(1,2)/(1-R(1,2)**2)),
 N(r'α y β son agudos, $\sin\alpha=3/5$ y $\cos\beta=12/13$. Calcula sin(α+β).','Reconstruimos los cosenos y senos positivos antes de sumar.',r'\sin(\alpha+\beta)=(3/5)(12/13)+(4/5)(5/13)',R(56,65),R(3,5)*R(12,13)+sqrt(1-R(3,5)**2)*sqrt(1-R(12,13)**2)),
 N(r'Calcula $\cos^2(30^\circ)-\sin^2(30^\circ)$.','La diferencia de cuadrados es el coseno del doble ángulo.',r'\cos60^\circ=1/2',R(1,2),cos(pi/6)**2-sin(pi/6)**2),
 C(r'En $\cos(a+b)$, el signo entre los dos productos es…',['Positivo.','Negativo.','Siempre cero.','Depende de que a sea agudo.'],1,['Se usa cos(a)cos(b)−sin(a)sin(b).','La identidad vale para todos los ángulos reales.','El signo menos pertenece a la fórmula, no se elige según el cuadrante.']),
 C(r'La fórmula $\tan(a+b)=(\tan a+\tan b)/(1-\tan a\tan b)$ exige…',['Que a y b sean enteros.','Que ambas tangentes estén definidas y el denominador del cociente no sea cero.','Que ambos ángulos sean iguales.','Que el denominador sea positivo.'],1,['Cada tangente del lado derecho requiere su dominio.','El cociente exige además denominador no nulo.','No se necesita que el denominador sea positivo.']),
],
'6.2':[
 N('Calcula sin(22.5°).','El ángulo mitad está en el primer cuadrante.',r'\sin22.5^\circ=\sqrt{(1-\cos45^\circ)/2}',sqrt(2-sqrt(2))/2,sqrt((1-cos(pi/4))/2)),
 N('Calcula cos(22.5°).','Elegimos la raíz positiva por el cuadrante.',r'\cos22.5^\circ=\sqrt{(1+\cos45^\circ)/2}',sqrt(2+sqrt(2))/2,sqrt((1+cos(pi/4))/2)),
 N('Calcula tan(22.5°).','Usamos la forma racional del medio ángulo.',r'\tan22.5^\circ=\sin45^\circ/(1+\cos45^\circ)=\sqrt2-1',sqrt(2)-1,sin(pi/4)/(1+cos(pi/4))),
 N(r'α es agudo y $\sin\alpha=1/3$. Calcula sin(3α).','La fórmula triple depende solo del seno.',r'\sin3\alpha=3(1/3)-4(1/3)^3',R(23,27),3*R(1,3)-4*R(1,3)**3),
 N(r'α es agudo y $\cos\alpha=2/3$. Calcula cos(3α).','Aplicamos la fórmula triple del coseno.',r'\cos3\alpha=4(2/3)^3-3(2/3)',R(-22,27),4*R(2,3)**3-3*R(2,3)),
 N(r'α es agudo y $\cos\alpha=7/25$. Calcula sin(α/2).','El medio ángulo agudo tiene seno positivo.',r'\sin(\alpha/2)=\sqrt{(1-7/25)/2}',R(3,5),sqrt((1-R(7,25))/2)),
 N(r'α es agudo y $\cos\alpha=7/25$. Calcula cos(α/2).','El medio ángulo agudo tiene coseno positivo.',r'\cos(\alpha/2)=\sqrt{(1+7/25)/2}',R(4,5),sqrt((1+R(7,25))/2)),
 N(r'¿Cuál es el máximo de $3\sin x+4\cos x$ para x real?','Una combinación seno–coseno tiene amplitud raíz de la suma de cuadrados.',r'R=\sqrt{3^2+4^2}=5',5,sqrt(3**2+4**2)),
 N(r'Calcula $2\sin(15^\circ)\cos(15^\circ)$.','El doble producto es seno del ángulo doble.',r'2\sin15^\circ\cos15^\circ=\sin30^\circ',R(1,2),2*sin(pi/12)*cos(pi/12)),
 C('En una fórmula de medio ángulo con raíz cuadrada, el signo se decide…',['Siempre positivo.','Por el cuadrante del medio ángulo.','Por el tamaño del radio de la circunferencia.','Siempre negativo.'],1,['El cuadrado no determina el signo de la función.','La raíz principal es no negativa.','El cuadrante del ángulo que se está evaluando determina el signo necesario.']),
 C(r'Para $A\sin x+B\cos x$, con A y B no ambos nulos, la amplitud es…',[r'$A+B$',r'$A-B$',r'$\sqrt{A^2+B^2}$',r'$AB$'],2,['Se representa la combinación como R sin(x+φ).','Al comparar coeficientes se obtiene R²=A²+B².','La amplitud es la raíz positiva.']),
],
'7.1':[
 N(r'¿Cuántas soluciones tiene $\sin x=0$ en $[0,2\pi)$?','Identificamos los ceros e inspeccionamos los extremos.',r'x=0,\pi;\quad 2\pi\notin[0,2\pi)',2,len(roots(sin(x)))),
 N(r'¿Cuántas soluciones tiene $\cos x=0$ en $[0,2\pi)$?','El coseno se anula sobre el eje vertical.',r'x=\pi/2,3\pi/2',2,len(roots(cos(x)))),
 N(r'¿Cuántas soluciones tiene $\sin x=1/2$ en $[0,2\pi)$?','El seno positivo aparece en dos cuadrantes.',r'x=\pi/6,5\pi/6',2,len(roots(sin(x)-R(1,2)))),
 N(r'¿Cuál es la menor solución de $\cos x=1/2$ en $[0,2\pi)$?','Tomamos la menor de las dos soluciones admisibles.',r'x=\pi/3,5\pi/3\Rightarrow x_{min}=\pi/3',pi/3,min(roots(cos(x)-R(1,2))),'rad'),
 N(r'¿Cuál es la mayor solución de $\tan x=1$ en $[0,2\pi)$?','La tangente repite su valor cada π radianes.',r'x=\pi/4,5\pi/4\Rightarrow x_{max}=5\pi/4',5*pi/4,max(roots(tan(x)-1)),'rad'),
 N(r'Suma las soluciones de $\sin x=1/2$ en $[0,2\pi)$.','Las dos soluciones son suplementarias.',r'\pi/6+5\pi/6=\pi',pi,sum(roots(sin(x)-R(1,2))),'rad'),
 N(r'¿Cuántas soluciones reales tiene $\sin x=2$?','El rango real del seno es el intervalo de −1 a 1.',r'2\notin[-1,1]',0,len(s.solveset(sin(x)-2,x,domain=s.S.Reals))),
 N(r'¿Cuántas soluciones tiene $\cos x=1$ en $[0,2\pi]$?','Este intervalo incluye ambos extremos.',r'x=0,2\pi',2,len(roots(cos(x)-1,True))),
 N(r'¿Cuál es la menor solución de $\sin x=-1$ en $[0,2\pi)$?','El seno vale −1 en el extremo inferior de la circunferencia.',r'x=3\pi/2',3*pi/2,min(roots(sin(x)+1)),'rad'),
 C('Al resolver una ecuación trigonométrica, indicar un intervalo sirve para…',['Cambiar el valor de π.','Determinar cuáles soluciones periódicas se admiten y si se incluyen los extremos.','Hacer que todas las funciones sean crecientes.','Evitar comprobar el dominio.'],1,['Las funciones trigonométricas suelen repetir valores.','Una solución general puede producir infinitas soluciones.','El intervalo selecciona las admisibles y exige revisar sus extremos.']),
 C(r'Para $\sin x=a$, con $-1<a<1$, las soluciones generales se obtienen…',['Solo con x=arcsin(a).','Con las ramas x=arcsin(a)+2kπ y x=π−arcsin(a)+2kπ, k entero.','Sumando cualquier número real al valor principal.','Cambiando a por su recíproco.'],1,['El valor principal da una solución.','La simetría del seno aporta la segunda rama.','La periodicidad de 2π completa las soluciones.']),
],
'7.2':[
 N(r'¿Cuántas soluciones tiene $\sin^2x=1/4$ en $[0,2\pi)$?','Deshacer el cuadrado exige ambos signos.',r'\sin x=\pm1/2\Rightarrow x=\pi/6,5\pi/6,7\pi/6,11\pi/6',4,len(roots(sin(x)**2-R(1,4)))),
 N(r'¿Cuántas soluciones tiene $2\sin^2x-\sin x=0$ en $[0,2\pi)$?','Factorizamos sin dividir por seno.',r'\sin x(2\sin x-1)=0',4,len(roots(2*sin(x)**2-sin(x)))),
 N(r'¿Cuántas soluciones tiene $\sin x\cos x=\sin x$ en $[0,2\pi)$?','Llevamos todo a un lado y conservamos ambos factores.',r'\sin x(\cos x-1)=0\Rightarrow x=0,\pi',2,len(roots(sin(x)*cos(x)-sin(x)))),
 N(r'¿Cuántas soluciones tiene $\cos(2x)=1$ en $[0,2\pi]$?','El argumento doble recorre dos vueltas y ambos extremos se incluyen.',r'2x=0,2\pi,4\pi\Rightarrow x=0,\pi,2\pi',3,len(roots(cos(2*x)-1,True))),
 N(r'¿Cuántas soluciones tiene $\tan^2x=1$ en $[0,2\pi)$?','Las dos tangentes posibles son 1 y −1, evitando los polos.',r'\tan x=\pm1',4,len(roots(tan(x)**2-1))),
 N(r'¿Cuántas soluciones tiene $\sin x+\cos x=\sqrt2$ en $[0,2\pi)$?','El máximo de la suma se alcanza cuando ambas componentes son iguales y positivas.',r'\sqrt2\sin(x+\pi/4)=\sqrt2\Rightarrow x=\pi/4',1,len(roots(sin(x)+cos(x)-sqrt(2)))),
 N(r'Suma las soluciones de $\cos x=-1/2$ en $[0,2\pi)$.','El coseno negativo fija dos posiciones simétricas.',r'x=2\pi/3,4\pi/3;\quad\Sigma=2\pi',2*pi,sum(roots(cos(x)+R(1,2))),'rad'),
 N(r'¿Cuántas soluciones tiene $\sin(2x)=0$ en $[0,2\pi)$?','El argumento doble genera cuatro ceros en el intervalo semiabierto.',r'x=0,\pi/2,\pi,3\pi/2',4,len(roots(sin(2*x)))),
 N(r'¿Cuál es la menor solución positiva de $\cos(2x)=0$?','El primer argumento positivo con coseno cero es π/2.',r'2x=\pi/2\Rightarrow x=\pi/4',pi/4,min(roots(cos(2*x))),'rad'),
 C(r'Al resolver $\sin x\cos x=\sin x$, dividir de inmediato entre sin(x)…',['Es siempre correcto sin restricciones.','Puede perder las soluciones donde sin(x)=0.','Añade todas las soluciones posibles.','Hace que cos(x) siempre valga cero.'],1,['El factor por el que se divide podría ser cero.','Esos casos pueden satisfacer la ecuación original.','Factorizar y estudiar cada factor conserva las soluciones.']),
 C('Después de elevar al cuadrado una ecuación, se debe…',['Aceptar todas las raíces obtenidas sin revisar.','Comprobar las candidatas en la ecuación original.','Eliminar todas las raíces negativas aunque sean admisibles.','Ignorar el dominio inicial.'],1,['Elevar al cuadrado puede borrar información de signo.','La ecuación transformada puede admitir soluciones adicionales.','La sustitución en el original y sus restricciones descarta las extrañas.']),
],
'8.1':[
 N('Un triángulo tiene A=30°, lado opuesto a=5 cm y B=90°. ¿Cuánto mide el lado opuesto b?','Aplicamos la ley de senos a lados y ángulos opuestos.',r'b=a\sin B/\sin A=5(1)/(1/2)',10,5*sin(pi/2)/sin(pi/6),'cm'),
 N('Dos lados de un triángulo miden 3 y 4 cm y forman 90°. ¿Cuánto mide el tercer lado?','La ley de cosenos incluye el caso rectángulo.',r'c=\sqrt{3^2+4^2-2(3)(4)\cos90^\circ}',5,sqrt(3**2+4**2-2*3*4*cos(pi/2)),'cm'),
 N('Dos lados de un triángulo miden 5 cm cada uno y forman 60°. ¿Cuánto mide el lado opuesto?','Usamos el ángulo comprendido en la ley de cosenos.',r'c^2=25+25-50\cos60^\circ=25',5,sqrt(25+25-50*cos(pi/3)),'cm'),
 N('Un triángulo tiene ángulos 40° y 65°. ¿Cuánto mide el tercero?','Los ángulos interiores suman 180°.',r'C=180^\circ-40^\circ-65^\circ',75,180-40-65,r'^\circ'),
 N('Un triángulo tiene a=6 cm opuesto a A=30°. ¿Cuál es su circunradio R?','La ley de senos ampliada relaciona lado, seno y diámetro.',r'a/\sin A=2R\Rightarrow R=6/[2\sin30^\circ]',6,6/(2*sin(pi/6)),'cm'),
 N('Dos lados de un triángulo miden 4 y 6 cm y forman 30°. ¿Qué área tiene?','Usamos los lados y el ángulo comprendido.',r'S=4(6)\sin30^\circ/2',6,4*6*sin(pi/6)/2,r'cm^2'),
 N('Un triángulo tiene lados a=5, b=5 y c=6. Calcula cos(C), siendo C opuesto a c.','Despejamos el coseno del ángulo comprendido.',r'\cos C=(5^2+5^2-6^2)/(2\cdot5\cdot5)',R(7,25),R(25+25-36,50)),
 N('Un triángulo tiene A=45°, B=45° y a=8 cm. ¿Cuánto mide b?','Ángulos iguales tienen lados opuestos iguales.',r'b=8\sin45^\circ/\sin45^\circ',8,8*sin(pi/4)/sin(pi/4),'cm'),
 N('Dos lados miden 2 y 3 cm y forman 120°. ¿Cuánto mide el lado opuesto?','El coseno negativo aumenta el cuadrado del lado opuesto.',r'c^2=2^2+3^2-2(2)(3)\cos120^\circ=19',sqrt(19),sqrt(4+9-12*cos(2*pi/3)),'cm'),
 C('En la notación usual de un triángulo, el lado a está…',['Opuesto al ángulo A.','Siempre horizontal.','Siempre junto al ángulo A como hipotenusa.','Opuesto al ángulo B.'],0,['Se empareja cada lado con el ángulo de enfrente.','Esa correspondencia determina qué seno acompaña a cada lado.','El lado a es opuesto a A.']),
 C('La ley de cosenos es especialmente directa cuando se conocen…',['Dos lados y el ángulo comprendido.','Solo un ángulo.','Solo el perímetro sin otros datos.','Dos ángulos sin ningún lado.'],0,['El cuadrado del tercer lado depende de los dos lados dados.','El término cruzado usa su ángulo comprendido.','Esos tres datos permiten calcular directamente el lado restante.']),
],
'8.2':[
 N('Un triángulo tiene lados 7, 8 y 9 cm. ¿Cuánto vale su semiperímetro?','El semiperímetro es la mitad de la suma de lados.',r's=(7+8+9)/2',12,R(7+8+9,2),'cm'),
 N('Un triángulo tiene lados 3, 4 y 5 cm. ¿Qué área da la fórmula de Herón?','La fórmula usa los lados y su semiperímetro.',r's=6;\quad S=\sqrt{6(6-3)(6-4)(6-5)}',6,sqrt(6*3*2*1),r'cm^2'),
 N('Un triángulo tiene a=5 cm, A=30° y b=8 cm, con lados opuestos a sus ángulos. ¿Cuántos triángulos distintos admiten esos datos?','La ley de senos puede dar dos ángulos B y ambos deben dejar C positivo.',r'\sin B=8\sin30^\circ/5=0.8;\quad B,\pi-B<150^\circ',2,sum(1 for B in [s.asin(R(4,5)),pi-s.asin(R(4,5))]if B+pi/6<pi)),
 N('Un triángulo tiene a=3 cm, A=30° y b=8 cm. ¿Cuántos triángulos admiten esos datos?','El seno de un ángulo real no puede superar uno.',r'\sin B=8\sin30^\circ/3=4/3>1',0,0),
 N('Dos lados de un triángulo miden 4 y 7 cm. ¿Cuál es el mayor valor entero posible del tercer lado en cm?','La desigualdad triangular es estricta.',r'|7-4|<c<7+4\Rightarrow3<c<11',10,max(v for v in range(1,12)if abs(7-4)<v<7+4),'cm'),
 N('Un triángulo de lados 5, 5 y 6 cm tiene área 12 cm². ¿Cuál es su inradio?','El área equivale a semiperímetro por inradio.',r's=8;\quad r=S/s=12/8',R(3,2),R(12,8),'cm'),
 N('Un triángulo tiene lados 3, 4, 5 cm y área 6 cm². Calcula su circunradio.','Relacionamos área, tres lados y circunradio.',r'R=abc/(4S)=3(4)(5)/(4\cdot6)',R(5,2),R(3*4*5,4*6),'cm'),
 N('Dos lados de 6 cm y 10 cm forman 60°. ¿Cuál es la proyección del lado de 6 cm sobre la dirección del de 10 cm?','Una proyección dirigida usa el coseno del ángulo entre lados.',r'p=6\cos60^\circ',3,6*cos(pi/3),'cm'),
 N('Un triángulo tiene lados de 4 y 7 cm y ángulo comprendido de 90°. ¿Cuál es su área?','El seno del ángulo comprendido vale uno.',r'S=4(7)\sin90^\circ/2',14,4*7*sin(pi/2)/2,r'cm^2'),
 C('Conocer dos lados y un ángulo opuesto a uno de ellos…',['Siempre determina un único triángulo.','Puede dar cero, uno o dos triángulos y exige comprobar el caso.','Nunca permite ningún triángulo.','Obliga a que el triángulo sea equilátero.'],1,['La ley de senos puede dar dos valores suplementarios de un ángulo.','Cada candidato debe tener suma angular menor que 180° con el ángulo conocido.','Según los datos pueden quedar cero, uno o dos triángulos.']),
 C('Si el mayor lado de un triángulo cumple c²>a²+b², el ángulo opuesto a c es…',['Agudo.','Recto.','Obtuso.','Nulo.'],2,['La ley de cosenos da cos(C)=(a²+b²−c²)/(2ab).','El numerador es negativo y el denominador positivo.','Cos(C)<0 implica un ángulo interior obtuso.']),
],
'9.1':[
 N('Desde el suelo horizontal, una torre se observa a 45° de elevación y su base está a 20 m. La altura del ojo se desprecia. ¿Qué altura tiene la torre?','La tangente relaciona altura y distancia horizontal.',r'h=20\tan45^\circ',20,20*tan(pi/4),'m'),
 N('Un observador con ojos a 1.5 m del suelo está a 10 m de una torre. La elevación a su cima es 45°. ¿Cuál es la altura total?','Se suma la altura del ojo al desnivel observado.',r'H=1.5+10\tan45^\circ',R(23,2),R(3,2)+10*tan(pi/4),'m'),
 N('Un poste vertical mide 6 m y su sombra horizontal 6 m. ¿Qué ángulo de elevación solar resulta?','La razón altura/sombra determina la tangente.',r'\theta=\arctan(6/6)=45^\circ',45,s.atan(1)*180/pi,r'^\circ'),
 N('Desde una altura de 10 m se observa un punto del suelo con depresión de 45°. ¿Qué distancia horizontal lo separa del pie vertical del observador?','El ángulo de depresión usa la horizontal.',r'd=10/\tan45^\circ',10,10/tan(pi/4),'m'),
 N('Una torre se observa desde el suelo a 30°; al avanzar 20 m en línea recta hacia su base, la elevación es 60°. Ojos a nivel del suelo. ¿Cuál es la altura?','Relacionamos ambas distancias con la misma altura.',r'20=h(\cot30^\circ-\cot60^\circ)\Rightarrow h=10\sqrt3',10*sqrt(3),20/(1/tan(pi/6)-1/tan(pi/3)),'m'),
 N('Una escalera de 8 m forma 30° con el suelo. ¿Qué altura vertical alcanza?','La escalera es la hipotenusa.',r'h=8\sin30^\circ',4,8*sin(pi/6),'m'),
 N('Un cable de 10 m une el suelo con la cima de un poste y forma 60° con el suelo. ¿Qué distancia horizontal hay entre sus extremos?','La proyección horizontal usa el coseno.',r'd=10\cos60^\circ',5,10*cos(pi/3),'m'),
 N('Desde el suelo, una cima está a 10 m de distancia horizontal y tiene elevación de 30°. Se desprecia altura del ojo. ¿Qué altura relativa tiene?','Usamos el cateto opuesto y el adyacente.',r'h=10\tan30^\circ',10*sqrt(3)/3,10*tan(pi/6),'m'),
 N('La elevación a un punto es 60°. ¿Qué ángulo forma la misma visual con la vertical ascendente?','Horizontal y vertical son perpendiculares.',r'\phi=90^\circ-60^\circ',30,90-60,r'^\circ'),
 C('El ángulo de elevación se mide desde…',['La vertical hacia abajo.','La horizontal del observador hacia una visual ascendente.','La dirección norte en todo caso.','La base del objeto sin mirar al observador.'],1,['La referencia es la horizontal que pasa por el ojo.','Se compara con la visual al objeto elevado.','No se mide desde la vertical.']),
 C('Para hallar la altura total de un objeto observado desde ojos a cierta altura…',['Siempre se resta la altura del ojo.','Se añade la altura del ojo al desnivel de la cima sobre la horizontal del observador.','Se ignora siempre la altura del ojo.','Se multiplica por dos la distancia horizontal.'],1,['La tangente da el desnivel respecto del ojo.','La altura total se mide desde el suelo de referencia.','Si ambos apoyos están al mismo nivel, se suma la altura del ojo.']),
],
'9.2':[
 N('Un recorrido de 10 km tiene rumbo N 30° E. ¿Qué componente norte tiene?','El rumbo se mide desde el norte hacia el este.',r'N=10\cos30^\circ',5*sqrt(3),10*cos(pi/6),'km'),
 N('Un recorrido de 10 km tiene rumbo N 30° E. ¿Qué componente este tiene?','La componente perpendicular al norte usa el seno.',r'E=10\sin30^\circ',5,10*sin(pi/6),'km'),
 N('Un viajero avanza 3 km al norte y 4 km al este. ¿Qué distancia directa lo separa del inicio?','Las componentes cardinales son perpendiculares.',r'd=\sqrt{3^2+4^2}',5,sqrt(9+16),'km'),
 N('Un recorrido tiene rumbo N 45° E. ¿Cuál es su azimut en grados, medido desde el norte en sentido horario?','El rumbo ya está en el cuadrante noreste.',r'Az=45^\circ',45,45,r'^\circ'),
 N('Un recorrido tiene rumbo S 30° E. ¿Cuál es su azimut, desde el norte y en sentido horario?','Desde el norte hasta el sur hay 180°; se retroceden 30° hacia el este.',r'Az=180^\circ-30^\circ',150,180-30,r'^\circ'),
 N('Un recorrido tiene rumbo S 40° W. ¿Cuál es su azimut, desde el norte y en sentido horario?','Se añaden 40° después del sur hacia el oeste.',r'Az=180^\circ+40^\circ',220,180+40,r'^\circ'),
 N('Un barco viaja 6 km al este y luego 6 km al oeste. ¿Qué módulo tiene su desplazamiento neto?','Las componentes opuestas se suman con signos.',r'\Delta x=6-6=0',0,6-6,'km'),
 N('Un trayecto de 8 km tiene rumbo N 60° W. ¿Qué módulo tiene su componente oeste?','La componente oeste es perpendicular al norte.',r'W=8\sin60^\circ',4*sqrt(3),8*sin(pi/3),'km'),
 N('Un trayecto de 12 km tiene rumbo S 60° E. ¿Qué módulo tiene su componente sur?','La componente sobre el eje de referencia usa coseno.',r'S=12\cos60^\circ',6,12*cos(pi/3),'km'),
 C('El rumbo recíproco de N 30° E es…',['N 30° W.','S 30° W.','S 60° E.','N 60° E.'],1,['El rumbo recíproco apunta en la dirección opuesta.','Se invierten norte por sur y este por oeste conservando el ángulo del rumbo.','Así resulta S 30° W.']),
 C('Un azimut, con la convención usada aquí, se mide…',['Desde el norte, en sentido horario, dentro de una vuelta.','Desde el sur, siempre en sentido antihorario.','Solo entre 0° y 90°.','Desde la vertical del observador.'],0,['La referencia inicial es el norte.','El sentido positivo de azimut es horario.','Permite representar direcciones de los cuatro cuadrantes.']),
],
})

BANK.update({
'10.1':[
 N(r'¿Cuál es el máximo de $\sin x$ para x real?','La coordenada vertical del círculo unitario no supera uno.',r'-1\le\sin x\le1;\quad\sin(\pi/2)=1',1,sin(pi/2)),
 N(r'¿Cuál es el mínimo de $\cos x$ para x real?','La coordenada horizontal llega a −1.',r'-1\le\cos x\le1;\quad\cos\pi=-1',-1,cos(pi)),
 N(r'¿Cuál es la amplitud de $f(x)=-3\cos(2x)$?','La amplitud usa el valor absoluto del coeficiente exterior.',r'A=|-3|',3,abs(-3)),
 N(r'¿Cuál es el periodo positivo fundamental de $\sin(3x)$, con x en radianes?','El factor interior divide el periodo básico.',r'T=2\pi/3',2*pi/3,2*pi/3,'rad'),
 N(r'¿Cuál es el periodo positivo fundamental de $\tan(2x)$, con x en radianes?','La tangente básica tiene periodo π.',r'T=\pi/2',pi/2,pi/2,'rad'),
 N(r'Calcula $\sin(\pi/2)$.','Evaluamos la coordenada vertical del círculo unitario.',r'\sin(\pi/2)=1',1,sin(pi/2)),
 N(r'Calcula $\cos0$.','El punto inicial del círculo unitario es (1,0).',r'\cos0=1',1,cos(0)),
 N(r'Calcula $\sec0$.','La secante es recíproca del coseno no nulo.',r'\sec0=1/\cos0=1',1,1/cos(0)),
 N(r'Calcula $\cot(\pi/4)$.','Usamos coseno sobre seno.',r'\cot(\pi/4)=\frac{\sqrt2/2}{\sqrt2/2}=1',1,cos(pi/4)/sin(pi/4)),
 C('El dominio real del seno y del coseno es…',[r'$\mathbb R$',r'$[-1,1]$ solamente.',r'$[0,\pi]$ solamente.','Solo los enteros.'],0,['Los puntos del círculo pueden recorrerse para cualquier ángulo real.','No aparecen divisiones ni raíces que restrinjan el argumento.','Seno y coseno están definidos en todos los reales.']),
 C(r'La tangente tiene discontinuidades en…',[r'$x=k\pi$',r'$x=\pi/2+k\pi$',r'$x=\pi/4+2k\pi$','Todos los reales.'],1,['Tangente es seno dividido entre coseno.','El coseno se anula en π/2+kπ, con k entero.','Esos puntos se excluyen de su dominio y son asíntotas verticales.']),
],
'10.2':[
 N(r'¿Cuál es el máximo de $4+3\sin x$ para x real?','El seno puede valer uno.',r'f_{max}=4+3(1)',7,4+3),
 N(r'¿Cuál es el mínimo de $4+3\sin x$ para x real?','El seno puede valer menos uno.',r'f_{min}=4+3(-1)',1,4-3),
 N(r'¿Cuál es la amplitud de $2-4\cos x$?','La traslación vertical no cambia la amplitud.',r'A=|-4|',4,abs(-4)),
 N(r'¿Cuál es el periodo fundamental de $\sin(x/2)$, con x en radianes?','Dividimos el periodo básico entre el módulo del factor interior.',r'T=2\pi/(1/2)=4\pi',4*pi,2*pi/R(1,2),'rad'),
 N(r'¿Cuánto se desplaza a la derecha la gráfica de $\sin(x-\pi/3)$ respecto de sin(x)?','La forma x−h desplaza la gráfica h hacia la derecha.',r'h=\pi/3',pi/3,pi/3,'rad'),
 N(r'¿Cuál es el desplazamiento horizontal con signo de $\cos(x+\pi/4)$ respecto de cos(x), tomando derecha como positiva?','Escribimos x+π/4 como x−(−π/4).',r'h=-\pi/4',-pi/4,-pi/4,'rad'),
 N(r'¿Cuál es el máximo de $\sin^2x$ para x real?','El cuadrado de un número entre −1 y 1 llega a uno.',r'0\le\sin^2x\le1',1,sin(pi/2)**2),
 N(r'¿Cuál es el máximo de $\sin x\cos x$ para x real?','El doble producto equivale al seno doble.',r'\sin x\cos x=\tfrac12\sin2x\le1/2',R(1,2),sin(pi/4)*cos(pi/4)),
 N(r'¿Cuál es el máximo de $(2\sin x-1)^2$ para x real?','Primero hallamos el intervalo de la expresión interior.',r'-3\le2\sin x-1\le1\Rightarrow\max y^2=9',9,(2*(-1)-1)**2),
 C(r'El signo negativo en $-\sin x$ produce…',['Una reflexión respecto del eje horizontal.','Una duplicación del periodo.','Una traslación vertical de una unidad.','Un cambio del dominio a los positivos.'],0,['Se cambia el signo de cada salida y.','Cada punto (x,y) pasa a (x,−y).','Eso refleja la gráfica respecto del eje horizontal.']),
 C(r'En $A\sin(B(x-h))+D$, con A y B no nulos, D determina…',['El desplazamiento vertical o línea media.','El periodo fundamental.','El dominio de los números complejos.','La amplitud por sí sola.'],0,['El seno oscila alrededor de cero.','Sumar D mueve todas sus salidas en la misma cantidad.','La línea media queda en y=D.']),
],
'11.1':[
 N(r'Calcula $\arcsin(1/2)$ en su rama principal.','El arco seno devuelve valores de [−π/2,π/2].',r'\arcsin(1/2)=\pi/6',pi/6,s.asin(R(1,2)),'rad'),
 N(r'Calcula $\arccos(1/2)$ en su rama principal.','El arco coseno devuelve valores de [0,π].',r'\arccos(1/2)=\pi/3',pi/3,s.acos(R(1,2)),'rad'),
 N(r'Calcula $\arctan1$ en su rama principal.','El arco tangente devuelve valores de (−π/2,π/2).',r'\arctan1=\pi/4',pi/4,s.atan(1),'rad'),
 N(r'Calcula $\arcsin(-1)$ en su rama principal.','El extremo inferior del rango principal sí está incluido.',r'\arcsin(-1)=-\pi/2',-pi/2,s.asin(-1),'rad'),
 N(r'Calcula $\arccos(-1)$ en su rama principal.','El extremo superior del rango principal sí está incluido.',r'\arccos(-1)=\pi',pi,s.acos(-1),'rad'),
 N(r'Calcula $\arctan(-\sqrt3)$ en su rama principal.','El ángulo negativo admisible con esa tangente es −π/3.',r'\arctan(-\sqrt3)=-\pi/3',-pi/3,s.atan(-sqrt(3)),'rad'),
 N(r'Calcula $\arcsin0$.','El ángulo principal de seno cero es cero.',r'\arcsin0=0',0,s.asin(0),'rad'),
 N(r'Calcula $\arccos0$.','El coseno se anula en π/2 dentro del rango principal.',r'\arccos0=\pi/2',pi/2,s.acos(0),'rad'),
 N(r'Calcula $\arccos(-\sqrt2/2)$ en su rama principal.','El rango principal selecciona el segundo cuadrante.',r'\arccos(-\sqrt2/2)=3\pi/4',3*pi/4,s.acos(-sqrt(2)/2),'rad'),
 C('El dominio real de arcsin y arccos es…',[r'$[-1,1]$',r'$\mathbb R$ sin restricción.',r'$[0,\pi]$','Solo los números positivos.'],0,['Seno y coseno solo producen valores entre −1 y 1.','La inversa recibe esos valores como entradas.','Por eso el dominio real de ambas inversas es [−1,1].']),
 C('El rango principal de arctan es…',[r'$[0,\pi]$',r'$[-\pi/2,\pi/2]$',r'$(-\pi/2,\pi/2)$',r'$\mathbb R$'],2,['La tangente es biyectiva al restringirla al intervalo entre sus dos polos más cercanos a cero.','Los extremos se excluyen porque la tangente no existe allí.','La inversa devuelve valores de (−π/2,π/2).']),
],
'11.2':[
 N(r'Calcula $\arcsin(\sin(5\pi/6))$.','El resultado debe caer en el rango principal del arco seno.',r'\sin(5\pi/6)=1/2\Rightarrow\arcsin(1/2)=\pi/6',pi/6,s.asin(sin(5*pi/6)),'rad'),
 N(r'Calcula $\arcsin(\sin(4\pi/3))$.','El seno es negativo y la rama principal selecciona un ángulo entre −π/2 y π/2.',r'\sin(4\pi/3)=-\sqrt3/2\Rightarrow\arcsin=-\pi/3',-pi/3,s.asin(sin(4*pi/3)),'rad'),
 N(r'Calcula $\arccos(\cos(7\pi/6))$.','El arco coseno debe devolver un ángulo de [0,π].',r'\cos(7\pi/6)=-\sqrt3/2\Rightarrow\arccos=5\pi/6',5*pi/6,s.acos(cos(7*pi/6)),'rad'),
 N(r'Calcula $\arctan(\tan(3\pi/4))$.','Reducimos al rango principal del arco tangente.',r'\tan(3\pi/4)=-1\Rightarrow\arctan=-\pi/4',-pi/4,s.atan(tan(3*pi/4)),'rad'),
 N(r'Calcula $\sin(\arccos(3/5))$.','El arco coseno de 3/5 está en el primer cuadrante.',r'\sin\alpha=\sqrt{1-(3/5)^2}',R(4,5),sin(s.acos(R(3,5)))),
 N(r'Calcula $\cos(\arcsin(-3/5))$.','En el rango principal de arco seno, el coseno es no negativo.',r'\cos\alpha=\sqrt{1-(-3/5)^2}',R(4,5),cos(s.asin(R(-3,5)))),
 N(r'Calcula $\tan(\arcsin(3/5))$.','Reconstruimos el coseno positivo y dividimos.',r'\tan\alpha=(3/5)/(4/5)=3/4',R(3,4),tan(s.asin(R(3,5)))),
 N(r'Calcula $\sin(2\arcsin(3/5))$.','Combinamos rama principal y doble ángulo.',r'\sin2\alpha=2(3/5)(4/5)',R(24,25),sin(2*s.asin(R(3,5)))),
 N(r'Calcula $\arccos0+\arcsin0$.','Evaluamos cada valor principal antes de sumar.',r'\pi/2+0=\pi/2',pi/2,s.acos(0)+s.asin(0),'rad'),
 C(r'La igualdad $\arcsin(\sin x)=x$ se garantiza cuando…',[r'$x\in[-\pi/2,\pi/2]$',r'$x\in\mathbb R$ siempre.',r'$x\in[\pi,2\pi]$ siempre.','x es cualquier entero positivo.'],0,['El arco seno solo devuelve valores de su rango principal.','Dentro de ese intervalo el seno es inyectivo.','Fuera de él la composición devuelve otro ángulo principal equivalente en seno.']),
 C('Arcsin(x) y 1/sin(x)…',['Representan siempre la misma función.','Son respectivamente una función inversa y una función recíproca, con dominios distintos.','Son iguales para cualquier x positivo.','Tienen ambas rango [−1,1].'],1,['La inversa busca un ángulo a partir de un valor de seno.','La recíproca divide uno entre el seno de un ángulo.','Son operaciones diferentes y no deben confundirse.']),
],
'12.1':[
 N(r'La posición es $x(t)=3\cos(2t)$ m, con t en segundos. ¿Cuál es la amplitud?','La amplitud es el módulo del coeficiente exterior.',r'A=|3|=3',3,abs(3),'m'),
 N(r'La posición es $x(t)=3\cos(2t)$ m, con t en segundos. ¿Cuál es su periodo?','La frecuencia angular es 2 rad/s.',r'T=2\pi/\omega=2\pi/2',pi,2*pi/2,'s'),
 N(r'La posición es $x(t)=3\cos(2t)$ m. ¿Cuál es x(0)?','Sustituimos t=0 en la función dada.',r'x(0)=3\cos0',3,3*cos(0),'m'),
 N(r'La posición es $x(t)=3\cos(2t)$ m, con t en segundos. ¿Cuál es x(π/4)?','El argumento en ese instante es π/2.',r'x(\pi/4)=3\cos(\pi/2)',0,3*cos(2*pi/4),'m'),
 N(r'En MAS, $x(t)=3\cos(2t)$ m y t está en segundos. ¿Cuál es la rapidez máxima?','En el modelo armónico, vmax=Aω.',r'v_{max}=3(2)',6,3*2,'m/s'),
 N(r'En MAS, $x(t)=3\cos(2t)$ m y t está en segundos. ¿Cuál es el módulo máximo de aceleración?','En el modelo armónico, amax=Aω².',r'a_{max}=3(2^2)',12,3*2**2,r'm/s^2'),
 N(r'Una señal tiene periodo $\pi$ segundos. ¿Cuál es su frecuencia?','La frecuencia es el recíproco del periodo.',r'f=1/T=1/\pi',1/pi,1/pi,'Hz'),
 N(r'Una altura se modela por $h(t)=2+3\sin t$ m para t real. ¿Qué altura máxima predice el modelo?','El seno alcanza uno.',r'h_{max}=2+3=5',5,2+3,'m'),
 N(r'Una posición se modela por $x(t)=2+3\sin t$ m. ¿Cuál es su valor inicial?','El valor inicial se evalúa en t=0.',r'x(0)=2+3\sin0',2,2+3*sin(0),'m'),
 C('En un modelo sinusoidal de una magnitud física, las unidades deben…',['Ser coherentes con la magnitud representada y con el tiempo usado.','Eliminarse siempre del resultado.','Ser grados Celsius para cualquier variable.','Depender solo del color de la gráfica.'],0,['El modelo describe cantidades medibles.','La amplitud y la traslación vertical comparten la unidad de la salida.','La escala temporal debe ser coherente con el argumento angular.']),
 C('Un modelo sinusoidal aproximado de un fenómeno real…',['Prueba que la realidad será idéntica para siempre.','Debe contrastarse con datos y se usa bajo sus condiciones y alcance.','No necesita especificar ninguna unidad.','Permite omitir todos los cambios del sistema.'],1,['El modelo idealiza un comportamiento.','Sus parámetros y límites deben comprobarse con observaciones.','Una fórmula no garantiza predicciones exactas fuera de las condiciones que representa.']),
],
'12.2':[
 N(r'La marea se modela por $h(t)=5+2\cos(\pi t/6)$ m, con t en horas. ¿Qué periodo predice?','El factor angular es π/6 radianes por hora.',r'T=2\pi/(\pi/6)',12,2*pi/(pi/6),'h'),
 N(r'La marea se modela por $h(t)=5+2\cos(\pi t/6)$ m. ¿Cuál es su altura máxima?','El coseno alcanza uno.',r'h_{max}=5+2=7',7,5+2,'m'),
 N(r'La marea se modela por $h(t)=5+2\cos(\pi t/6)$ m. ¿Cuál es su altura mínima?','El coseno alcanza menos uno.',r'h_{min}=5-2=3',3,5-2,'m'),
 N(r'La marea se modela por $h(t)=5+2\cos(\pi t/6)$ m, con t en horas. ¿Qué altura predice en t=3 h?','Sustituimos el tiempo en el argumento.',r'h(3)=5+2\cos(\pi/2)',5,5+2*cos(pi*3/6),'m'),
 N(r'La marea sigue $h(t)=5+2\cos(\pi t/6)$ m, con t≥0 en horas. ¿Cuándo llega por primera vez a su mínimo?','El primer coseno mínimo tiene argumento π.',r'\pi t/6=\pi\Rightarrow t=6',6,pi/(pi/6),'h'),
 N(r'Una cabina tiene altura $h(t)=10+8\sin(\pi t/10)$ m. ¿Qué altura máxima alcanza en el modelo?','El máximo suma amplitud y altura central.',r'h_{max}=10+8=18',18,10+8,'m'),
 N(r'Una cabina tiene altura $h(t)=10+8\sin(\pi t/10)$ m. ¿Qué altura mínima alcanza en el modelo?','El mínimo resta la amplitud de la altura central.',r'h_{min}=10-8=2',2,10-8,'m'),
 N(r'Una cabina sigue $h(t)=10+8\sin(\pi t/10)$ m, con t en segundos. ¿Cuál es su periodo?','Un ciclo completo del seno requiere 2π en el argumento.',r'T=2\pi/(\pi/10)',20,2*pi/(pi/10),'s'),
 N('Un rectángulo está inscrito bajo una semicircunferencia de radio 5 cm, con su base sobre el diámetro y sus vértices superiores sobre el arco. ¿Cuál es su área máxima?','Parametrizamos semibase y altura por un ángulo agudo.',r'b=10\cos\theta;\ h=5\sin\theta;\ A=25\sin2\theta\le25',25,10*cos(pi/4)*5*sin(pi/4),r'cm^2'),
 C('En un modelo de marea h=D+A cos(ωt+φ), con A positivo, D representa…',['La altura central entre máximo y mínimo del modelo.','El número de periodos en un segundo.','La dirección del viento por definición.','Siempre la altura mínima.'],0,['El coseno oscila entre −1 y 1.','Las alturas extrema son D−A y D+A.','El promedio de ambos extremos es D.']),
 C('Si una magnitud periódica tiene periodo T, el modelo ideal predice…',['Que se repite después de T, mientras se mantengan sus condiciones.','Que crece sin límite en cada periodo.','Que siempre vale cero al pasar T.','Que pierde la amplitud después del primer ciclo.'],0,['La periodicidad expresa f(t+T)=f(t).','Se repite el patrón de valores.','En un fenómeno real se debe mantener el alcance y las condiciones del modelo.']),
],
})

def authored_math(text):
    # Explicit fragments from the authored statements; keep Spanish conjunctions outside math.
    snippets={
        'A=30°':r'A=30^\circ','A=45°':r'A=45^\circ','B=45°':r'B=45^\circ','B=90°':r'B=90^\circ',
        'a=5 cm':r'a=5\,\mathrm{cm}','a=6 cm':r'a=6\,\mathrm{cm}','a=8 cm':r'a=8\,\mathrm{cm}',
        'a=3 cm':r'a=3\,\mathrm{cm}','b=8 cm':r'b=8\,\mathrm{cm}',
        'a=5, b=5 y c=6':r'a=b=5,\quad c=6',
    }
    for original,tex in sorted(snippets.items(),key=lambda pair:-len(pair[0])):
        pieces=text.split('$')
        for i in range(0,len(pieces),2):pieces[i]=pieces[i].replace(original,'$'+tex+'$')
        text='$'.join(pieces)
    pieces=text.split('$')
    for i in range(0,len(pieces),2):
        def function_markup(match):
            name='csc'if match[1]=='cosec'else match[1]
            arg=match[2].replace('°',r'^\circ').replace('α',r'\alpha ').replace('β',r'\beta ')
            return '$\\'+name+'('+arg+')$'
        pieces[i]=re.sub(r'\b(sin|cos|tan|cot|sec|cosec)\(([0-9.αβx/−-]+°?)\)',function_markup,pieces[i])
    text='$'.join(pieces)
    return text

def build(write=False):
    production=ROOT/'shared/src/commonMain/composeResources/files/aprender/trigonometria'
    fixtures=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/trigonometria'
    preserved=production/'semana01/1.1/questions.json';digest=hashlib.sha256(preserved.read_bytes()).hexdigest()
    preview=[];proofs=[]
    for level,tasks in BANK.items():
        assert len(tasks)==11,(level,len(tasks))
        week,part=map(int,level.split('.'));rel=Path(f'semana{week:02}')/level/'questions.json'
        path=production/rel;old=json.loads(path.read_text(encoding='utf-8-sig'));out=[]
        for i,task in enumerate(tasks):
            qid=f'trig_t{week:02}_s{part:02}_c{i+1:02}'
            if 'answer'in task:
                options,key=choices(task['answer'],task['unit'],i%4)
                from review_physics_practice import label
                steps=[task['rule'],'Aplicamos la relación: $'+task['model']+'$.','El valor pedido es '+label(task['answer'],task['unit'])+'.']
                proofs.append(dict(id=qid,model=task['model'],answer=str(task['answer']),calculated=str(task['calculated']),unit=task['unit']))
            else:options,key=task['options'],task['key'];steps=task['steps']
            q=dict(id=qid,concept=f'{level}.{i+1}',type='MULTIPLE_CHOICE',subject='trigonometria',semana=week,
                statement=authored_math(task['stem']),options=options,correctIndex=key,explanation='\n'.join(f'{j+1}. {v}'for j,v in enumerate(steps)),
                fuente='Ejercicio original RASTRO; contraste en docs/aprender/trigonometria/REVISION_PRACTICA_PENDIENTE.md',pedagogicalTier='aplicación')
            out.append(q)
        assert len({q['statement']for q in out})==11,level
        assert[q['id']for q in old]==[q['id']for q in out[:len(old)]],level
        if write:
            backup=ROOT/'build/academic-backup-trigonometry-pending'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(json.dumps(out,ensure_ascii=False,indent=2)+'\n',encoding='utf8');assert(fixtures/rel).exists();shutil.copy2(path,fixtures/rel)
        preview.extend(out)
    assert hashlib.sha256(preserved.read_bytes()).hexdigest()==digest
    (ROOT/'build/trigonometry-pending-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    (ROOT/'build/trigonometry-pending-proofs.json').write_text(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),conceptualQuestions=len(preview)-len(proofs),preservedHash=digest,proofs=proofs),ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(levels=len(BANK),questions=len(preview),numericChecks=len(proofs),written=write)))

if __name__=='__main__':
    parser=argparse.ArgumentParser();parser.add_argument('--write',action='store_true');build(parser.parse_args().write)
