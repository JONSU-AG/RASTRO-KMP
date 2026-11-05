"""Authored algebra practice. --write changes only weeks 02-16 of the new resource catalog.
SymPy is a development verifier installed under build/, never an app dependency.
"""
from pathlib import Path
import sys, json, shutil, argparse, hashlib, re
ROOT=Path(__file__).resolve().parents[2]
sys.path.insert(0,str(ROOT/'build/academic-python-libs'))
import sympy as s
x=s.Symbol('x',real=True); y=s.Symbol('y',real=True)

def L(expr): return s.latex(s.sympify(expr))
def M(expr): return '$'+L(expr)+'$'
def question(stem,rule,model,answer,proof=None):
    answer=s.simplify(answer)
    assert answer.is_real is True and answer.is_finite is True,(stem,answer)
    if proof is not None: assert s.simplify(proof-answer)==0,(stem,proof,answer)
    return dict(statement=stem,rule=rule,model=model,answer=answer,proof=str(s.sympify(proof if proof is not None else answer)))

def make(week,part,f,k):
    a=k+2;b=k+3;n=k+4
    # The formulas below express the original problem; answers are checked independently.
    if week==2:
        if part==1:
            if f==0:return question(rf'Calcula {M(s.Rational(a,3))} + {M(s.Rational(b,6))}.','Sumamos fracciones con denominador común.',rf'{a}/3+{b}/6=({2*a}+{b})/6',s.Rational(2*a+b,6),s.Rational(a,3)+s.Rational(b,6))
            if f==1:return question(rf'¿Cuál es la distancia entre −{a} y {b} en la recta real?','La distancia es el valor absoluto de la diferencia.',rf'|{b}-(-{a})|=|{a+b}|',a+b,abs(b-(-a)))
            if f==2:return question(rf'Calcula |−{a}| − |{b}|.','El valor absoluto mide distancia a cero.',rf'|-{a}|-|{b}|={a}-{b}',a-b,abs(-a)-abs(b))
            if f==3:return question(rf'¿Cuál es el inverso multiplicativo de {M(s.Rational(a,b))}?','Un número no nulo por su inverso da uno.',rf'({a}/{b})({b}/{a})=1',s.Rational(b,a),1/s.Rational(a,b))
            return question(rf'Calcula {M(-a+2*b)} − ({M(-a)}) respetando los signos.','Restar un negativo equivale a sumar su opuesto.',rf'{-a+2*b}-(-{a})={-a+2*b}+{a}',2*b,(-a+2*b)-(-a))
        if f==0:return question(rf'¿Cuál es la mayor solución real de |x − {a}| = {b}?','Una distancia positiva produce dos posibilidades.',rf'x-{a}=±{b};\quad x={a-b}\;o\;{a+b}',a+b,max(s.solve(s.Eq((x-a)**2,b*b),x)))
        if f==1:return question(rf'¿Cuántos enteros cumplen |x − {a}| < {b}?','La desigualdad estricta encierra x entre dos extremos.',rf'{a-b}<x<{a+b};\quad {a-b+1},\ldots,{a+b-1}',2*b-1,len([v for v in range(-30,40) if abs(v-a)<b]))
        if f==2:return question(rf'Si x = −{a}, calcula $\sqrt{{x^2}}$.','La raíz principal de x² es |x|, no siempre x.',rf'√((-{a})²)=|-{a}|',a,s.sqrt((-a)**2))
        if f==3:return question(rf'¿Cuál es el mínimo de |x − {a}| + {b}, para x real?','Un valor absoluto es no negativo y vale cero en su centro.',rf'|x-{a}|≥0;\quad x={a}\Rightarrow 0+{b}',b,s.Abs(a-a)+b)
        return question(rf'¿Cuál es el máximo de {b} − |x − {a}|, para x real?','Restar una cantidad no negativa no aumenta el término constante.',rf'{b}-|x-{a}|≤{b};\quad x={a}',b,b-s.Abs(a-a))
    if week==3:
        if part==1:
            if f==0:return question(rf'Calcula 2^{a} · 2^{b}.','Al multiplicar potencias de la misma base se suman exponentes.',rf'2^{a}·2^{b}=2^{{{a+b}}}',2**(a+b),s.Integer(2)**a*s.Integer(2)**b)
            if f==1:return question(rf'Calcula 3^{b} / 3^{a}.','Con la misma base no nula se restan exponentes.',rf'3^{{{b}-{a}}}=3^1',3,s.Integer(3)**b/s.Integer(3)**a)
            if f==2:return question(rf'Calcula (2^{a})².','Una potencia elevada a otra multiplica exponentes.',rf'(2^{a})²=2^{{{2*a}}}',2**(2*a),(s.Integer(2)**a)**2)
            if f==3:return question(rf'Calcula 2^(-{a}).','Un exponente negativo indica el inverso de la potencia positiva.',rf'2^{{-{a}}}=1/2^{a}',s.Rational(1,2**a),s.Integer(2)**(-a))
            return question(rf'Calcula la raíz cúbica real de {a**3}.','Buscamos el número real cuyo cubo es el radicando.',rf'{a}³={a**3}',a,s.real_root(a**3,3))
        if f==0:return question(rf'Al escribir √{a*a*2} como c√2 con c positivo, ¿cuánto vale c?','Extraemos el factor que es un cuadrado perfecto.',rf'√({a*a}·2)={a}√2',a,s.simplify(s.sqrt(a*a*2)/s.sqrt(2)))
        if f==1:return question(rf'Racionaliza 1/√{a} y escríbelo como √{a}/d. ¿Cuánto vale d?','Multiplicamos numerador y denominador por la misma raíz.',rf'(1/√{a})(√{a}/√{a})=√{a}/{a}',a,s.simplify(s.sqrt(a)/(1/s.sqrt(a))))
        if f==2:return question(rf'Calcula (√{a} + √{b})(√{a} − √{b}).','El producto de conjugados es una diferencia de cuadrados.',rf'(√{a})²-(√{b})²={a}-{b}',a-b,s.expand((s.sqrt(a)+s.sqrt(b))*(s.sqrt(a)-s.sqrt(b))))
        if f==3:return question(rf'Sea r = √({a+b} + 2√{a*b}). Se sabe que r = √{a} + √{b}. Calcula r².','El cuadrado de la suma incluye el doble producto.',rf'(√{a}+√{b})²={a+b}+2√{a*b}',a+b+2*s.sqrt(a*b),(s.sqrt(a)+s.sqrt(b))**2)
        return question(rf'Calcula la raíz cúbica real de −{a**3}.','Una raíz de índice impar conserva el signo del radicando.',rf'(-{a})³=-{a**3}',-a,s.real_root(-a**3,3))
    if week==4:
        if part==1:
            if f==0:return question(rf'¿Cuál es el grado absoluto del monomio 7x^{a}y^{b}?','En un monomio polinómico sumamos los exponentes de las variables.',rf'{a}+{b}',a+b,s.Poly(7*x**a*y**b,x,y).total_degree())
            if f==1:return question(rf'¿Cuál es el grado relativo respecto de x de 4x^{a}y^{b}?','El grado relativo mira solo el exponente de la variable indicada.',rf'x^{a}y^{b}:\quad GR_x={a}',a,s.Poly(4*x**a*y**b,x,y).degree(x))
            if f==2:return question(rf'En {a}x² + {b}x², ¿cuál es el coeficiente al reducir términos semejantes?','Los términos semejantes conservan su parte literal y suman coeficientes.',rf'({a}+{b})x²',a+b,s.expand(a*x*x+b*x*x).coeff(x,2))
            if f==3:return question(rf'Evalúa {a}x²y para x=2 e y=3.','Sustituimos antes de multiplicar y respetamos la potencia.',rf'{a}·2²·3',12*a,(a*x*x*y).subs({x:2,y:3}))
            return question(rf'¿Cuántos términos tiene {a}x³ + {b}x − 1?','Los términos quedan separados por sumas o restas en la expresión reducida.',rf'{a}x³;\quad {b}x;\quad -1',3,len(s.Poly(a*x**3+b*x-1,x).terms()))
        if f==0:return question(rf'El monomio x^m y^{a} tiene grado absoluto {a+b}. ¿Cuánto vale m?','El grado absoluto suma los exponentes.',rf'm+{a}={a+b};\quad m={b}',b,s.solve(s.Eq(x+a,a+b),x)[0])
        if f==1:return question(rf'Un polinomio completo de una variable y grado {a} tiene todos sus coeficientes no nulos. ¿Cuántos términos tiene?','Aparecen las potencias desde cero hasta el grado.',rf'0,1,\ldots,{a}:\quad {a}+1',a+1,len(range(a+1)))
        if f==2:return question(rf'P y Q son polinomios no nulos de grados {a} y {b}. ¿Qué grado tiene su producto?','Los términos principales se multiplican y sus coeficientes no se anulan.',rf'gr(PQ)={a}+{b}',a+b,s.Poly((x**a+1)*(x**b+2),x).degree())
        if f==3:return question(rf'En la identidad mx² + 3 = {a}x² + 3, válida para todo x, ¿cuánto vale m?','En una identidad polinómica coinciden los coeficientes de cada potencia.',rf'm={a}',a,s.solve(s.Eq(x,a),x)[0])
        return question(rf'Para que x^{a}y^m + x^{b} sea homogéneo, ¿cuánto debe valer m?','Todos los términos de un polinomio homogéneo tienen el mismo grado absoluto.',rf'{a}+m={b};\quad m={b-a}',b-a,s.solve(s.Eq(a+x,b),x)[0])
    if week==5:
        if part==1:
            if f==0:return question(rf'¿Cuál es el coeficiente de x al desarrollar (x+{a})²?','El cuadrado de un binomio incluye el doble producto.',rf'x²+2·{a}x+{a*a}',2*a,s.expand((x+a)**2).coeff(x,1))
            if f==1:return question(rf'¿Cuál es el término independiente de (x−{a})²?','El último término es el cuadrado del término constante.',rf'(-{a})²',a*a,s.expand((x-a)**2).coeff(x,0))
            if f==2:return question(rf'¿Cuál es el término independiente del producto (x+{a})(x−{a})?','Usamos suma por diferencia.',rf'x²-{a*a}',-a*a,s.expand((x+a)*(x-a)).coeff(x,0))
            if f==3:return question(rf'¿Cuál es el coeficiente de x² al desarrollar (x+{a})³?','En el cubo, ese término es tres veces x² por el término constante.',rf'3·{a}x²',3*a,s.expand((x+a)**3).coeff(x,2))
            return question(rf'Si P(x)=x²+{a}x+{b}, calcula P(2).','Reemplazamos x por 2 en todos los términos.',rf'2²+{a}·2+{b}',4+2*a+b,(x*x+a*x+b).subs(x,2))
        if f==0:return question(rf'¿Cuál es el resto al dividir P(x)=x²+{a}x+{b} entre x−2?','Por el teorema del resto se evalúa P en 2.',rf'P(2)=4+{2*a}+{b}',4+2*a+b,s.rem(x*x+a*x+b,x-2,x))
        if f==1:return question(rf'¿Cuál es el resto al dividir x²+{a}x+{b} entre x+1?','El divisor x+1 se anula en −1.',rf'P(-1)=1-{a}+{b}',1-a+b,s.rem(x*x+a*x+b,x+1,x))
        if f==2:return question(rf'Al dividir exactamente x^{a+b} entre x^{a}, ¿qué grado tiene el cociente?','Restamos los grados del dividendo y del divisor no nulo.',rf'x^{{{a+b}-{a}}}=x^{b}',b,s.degree(s.cancel(x**(a+b)/x**a),x))
        if f==3:return question(rf'P(x)=x²−{a*a}. ¿Cuál es P({a}), y por tanto el resto al dividir por x−{a}?','Una raíz del polinomio produce resto cero.',rf'{a}²-{a*a}=0',0,s.rem(x*x-a*a,x-a,x))
        return question(rf'Al dividir x²+{a+b}x+{a*b} entre x+{a}, el cociente es x+c. ¿Cuánto vale c?','Factorizamos con dos números de suma y producto conocidos.',rf'(x+{a})(x+{b});\quad c={b}',b,s.div(x*x+(a+b)*x+a*b,x+a,x)[0].subs(x,0))
    if week==6:
        if part==1:
            if f==0:return question(rf'En {a}x²+{a*b}x={a}x(x+c), ¿cuánto vale c?','Extraemos el factor común sin cambiar el polinomio.',rf'{a*b}/{a}={b}',b,s.cancel((a*x*x+a*b*x)/(a*x)).subs(x,0))
            if f==1:return question(rf'Factoriza x²−{a*a} como (x−c)(x+c), con c positivo. ¿Cuánto vale c?','Una diferencia de cuadrados se factoriza en conjugados.',rf'{a*a}={a}²',a,s.sqrt(a*a))
            if f==2:return question(rf'En x²+{a+b}x+{a*b}=(x+{a})(x+c), ¿cuánto vale c?','Buscamos dos números de suma y producto dados.',rf'{a}+{b}={a+b};\quad {a}·{b}={a*b}',b,s.div(x*x+(a+b)*x+a*b,x+a,x)[0].subs(x,0))
            if f==3:return question(rf'¿Qué raíz positiva se obtiene de x²−{a*a}=0?','Factorizamos la diferencia de cuadrados.',rf'(x-{a})(x+{a})=0',a,max(s.solve(x*x-a*a,x)))
            return question(rf'En x³+{a**3}=(x+{a})(x²−{a}x+c), ¿cuánto vale c?','Aplicamos la suma de cubos.',rf'c={a}²',a*a,s.div(x**3+a**3,x+a,x)[0].subs(x,0))
        if f==0:return question(rf'P(x)=x³−{a}x²−x+{a}. ¿Cuál es P({a})?','Agrupamos o evaluamos para comprobar un divisor binómico.',rf'{a}³-{a}·{a}²-{a}+{a}',0,(x**3-a*x*x-x+a).subs(x,a))
        if f==1:return question(rf'En (x−{a})(x−{b}), ¿cuál es el coeficiente de x al desarrollar?','Los productos cruzados suman coeficientes negativos.',rf'-{a}x-{b}x=-{a+b}x',-(a+b),s.expand((x-a)*(x-b)).coeff(x))
        if f==2:return question(rf'¿Cuántas raíces reales distintas tiene x²+{a*a}=0?','Un cuadrado real es no negativo y se le suma una constante positiva.',rf'x²=-{a*a}<0',0,len(s.solveset(x*x+a*a,x,domain=s.S.Reals)))
        if f==3:return question(rf'El polinomio (x−{a})²(x+{b}) tiene la raíz {a}. ¿Cuál es su multiplicidad?','La multiplicidad es el exponente del factor asociado a esa raíz.',rf'(x-{a})²',2,s.Poly((x-a)**2*(x+b),x).ground_roots()[a])
        return question(rf'Si x²−{a+b}x+{a*b}=(x−r)(x−t), ¿cuánto vale r+t?','La suma de raíces de un cuadrático mónico es el opuesto del coeficiente lineal.',rf'r+t={a+b}',a+b,sum(s.solve(x*x-(a+b)*x+a*b,x)))
    if week==7:
        if part==1:
            if f==0:return question(rf'Evalúa (x²−{a*a})/(x−{a}) en x={a+2}.','Se cancela un factor solo donde el denominador original no es cero.',rf'(x-{a})(x+{a})/(x-{a})=x+{a};\quad x={a+2}',2*a+2,((x*x-a*a)/(x-a)).subs(x,a+2))
            if f==1:return question(rf'¿Qué valor debe excluirse del dominio de 1/(x−{a})?','El denominador de una fracción no puede ser cero.',rf'x-{a}=0',a,s.solve(x-a,x)[0])
            if f==2:return question(rf'Si x=2, calcula {a}/x + {b}/x.','Con denominadores iguales se suman numeradores.',rf'({a}+{b})/2',s.Rational(a+b,2),s.Rational(a,2)+s.Rational(b,2))
            if f==3:return question(rf'Evalúa ({a}x/{b})·({b}/x) en x=3.','Los factores no nulos se cancelan en el producto.',rf'({a}·3/{b})({b}/3)',a,s.Rational(a*3,b)*s.Rational(b,3))
            return question(rf'Evalúa 1/(x−{a}) − 1/(x+{a}) en x={a+1}.','Restamos con denominador común y verificamos valores admisibles.',rf'1/1-1/{2*a+1}',1-s.Rational(1,2*a+1),(1/(x-a)-1/(x+a)).subs(x,a+1))
        if f==0:return question(rf'En {a}/[x(x+1)]=A/x+B/(x+1), ¿cuánto vale A?','Multiplicamos por x(x+1) y evaluamos la identidad en x=0.',rf'{a}=A(x+1)+Bx;\quad x=0',a,s.limit(x*(a/(x*(x+1))),x,0))
        if f==1:return question(rf'En {a}/[x(x+1)]=A/x+B/(x+1), ¿cuánto vale B?','Tras eliminar denominadores, evaluamos la identidad en x=−1.',rf'{a}=A·0+B(-1);\quad B=-{a}',-a,s.limit((x+1)*(a/(x*(x+1))),x,-1))
        if f==2:return question(rf'¿Qué grado tiene el MCD mónico de x^{a}(x+1) y x^{b}(x+1)²?','Tomamos los factores comunes con su menor exponente.',rf'x^{a}(x+1);\quad grado={a}+1',a+1,s.degree(s.gcd(x**a*(x+1),x**b*(x+1)**2),x))
        if f==3:return question(rf'¿Qué grado tiene el MCM mónico de x^{a}(x+1) y x^{b}(x+1)²?','Tomamos todos los factores con su mayor exponente.',rf'x^{b}(x+1)²;\quad grado={b}+2',b+2,s.degree(s.lcm(x**a*(x+1),x**b*(x+1)**2),x))
        return question(rf'En {a}/x²=A/x+B/x², como identidad para x≠0, ¿cuánto vale B?','Eliminamos denominadores y comparamos los términos constantes.',rf'{a}=Ax+B',a,a)
    if week==8:
        if part==1:
            if f==0:return question(rf'Resuelve {a}x+{b}={a*n+b}. ¿Cuánto vale x?','Restamos el término constante y dividimos por el coeficiente no nulo.',rf'{a}x={a*n};\quad x={a*n}/{a}',n,s.solve(s.Eq(a*x+b,a*n+b),x)[0])
            if f==1:return question(rf'¿Cuál es la mayor raíz de x²−{a+b}x+{a*b}=0?','Factorizamos usando suma y producto.',rf'(x-{a})(x-{b})=0',b,max(s.solve(x*x-(a+b)*x+a*b,x)))
            if f==2:return question(rf'¿Cuál es la suma de las raíces de x²−{a+b}x+{a*b}=0?','Por Viète, la suma es −coeficiente lineal / coeficiente principal.',rf'-(-{a+b})/1',a+b,sum(s.solve(x*x-(a+b)*x+a*b,x)))
            if f==3:return question(rf'¿Cuál es el producto de las raíces de x²−{a+b}x+{a*b}=0?','Por Viète, el producto es término independiente / coeficiente principal.',rf'{a*b}/1',a*b,s.prod(s.solve(x*x-(a+b)*x+a*b,x)))
            return question(rf'Calcula el discriminante de x²−{2*a}x+{a*a}=0.','El discriminante es b²−4ac.',rf'(-{2*a})²-4·1·{a*a}',0,s.discriminant(x*x-2*a*x+a*a,x))
        if f==0:return question(rf'¿Cuál es la mayor raíz real positiva de x⁴−{a*a+b*b}x²+{a*a*b*b}=0?','Sustituimos u=x² y resolvemos la ecuación cuadrática en u.',rf'(x²-{a*a})(x²-{b*b})=0',b,max(s.solve(x**4-(a*a+b*b)*x*x+a*a*b*b,x)))
        if f==1:return question(rf'¿Cuántas raíces reales distintas tiene (x²−{a*a})(x²−{b*b})=0?','Cada cuadrado igualado a una constante positiva da dos signos.',rf'x=±{a},\quad x=±{b}',4,len(s.solveset((x*x-a*a)*(x*x-b*b),x,domain=s.S.Reals)))
        if f==2:return question(rf'¿Qué valor de c hace que x²−{2*a}x+c=0 tenga raíz doble?','Exigimos discriminante cero.',rf'{4*a*a}-4c=0',a*a,s.solve(s.Eq((2*a)**2-4*y,0),y)[0])
        if f==3:return question(rf'Las raíces no nulas de un cuadrático son {a} y {b}. ¿Cuánto suman sus recíprocos?','Sumamos fracciones con denominador común.',rf'1/{a}+1/{b}=({a}+{b})/({a}·{b})',s.Rational(a+b,a*b),1/s.Integer(a)+1/s.Integer(b))
        return question(rf'¿Cuál es la suma de las cuatro raíces de (x²−{a*a})(x²−{b*b})=0?','Las raíces aparecen en parejas opuestas.',rf'{a}+(-{a})+{b}+(-{b})',0,sum(s.solve((x*x-a*a)*(x*x-b*b),x)))
    raise ValueError((week,part,f,k))

def advanced(week,part,f,k):
    a=k+2;b=k+3;n=k+4
    if week==9:
        if part==1:
            if f==0:return question(rf'¿Cuál es el menor entero que cumple {a}x > {a*b}?','Dividir por un número positivo conserva la desigualdad.',rf'x>{b};\quad entero\;mínimo={b+1}',b+1,min(v for v in range(-30,40) if a*v>a*b))
            if f==1:return question(rf'¿Cuál es el mayor entero que cumple −{a}x > −{a*b}?','Al dividir entre un número negativo se invierte el signo.',rf'x<{b};\quad entero\;máximo={b-1}',b-1,max(v for v in range(-30,40) if -a*v>-a*b))
            if f==2:return question(rf'¿Cuántos enteros cumplen (x−{a})(x−{b+2}) < 0?','Con coeficiente principal positivo, el producto es negativo entre raíces simples.',rf'{a}<x<{b+2};\quad x={a+1},\ldots,{b+1}',b+2-a-1,len([v for v in range(-30,40) if (v-a)*(v-(b+2))<0]))
            if f==3:return question(rf'¿Qué valor debe excluirse al resolver (x+1)/(x−{a}) ≥ 0?','La condición de dominio precede al análisis de signos.',rf'x-{a}≠0',a,s.solve(x-a,x)[0])
            return question(rf'¿Cuántos enteros cumplen −{a} ≤ x ≤ {a}?','Contamos ambos extremos porque la desigualdad no es estricta.',rf'{a}-(-{a})+1',2*a+1,len(range(-a,a+1)))
        if f==0:return question(rf'¿Cuál es el menor entero del dominio real de √(x−{a})?','El radicando de una raíz cuadrada real debe ser no negativo.',rf'x-{a}≥0\Rightarrow x≥{a}',a,min(v for v in range(-30,40) if v-a>=0))
        if f==1:return question(rf'¿Cuántos enteros cumplen |x| ≤ {a}?','El módulo no mayor que a encierra x entre −a y a.',rf'-{a}≤x≤{a}',2*a+1,len([v for v in range(-30,40) if abs(v)<=a]))
        if f==2:return question(rf'¿Cuántos enteros cumplen √(x−{a}) ≤ {b}?','Exigimos radicando no negativo y después elevamos al cuadrado los dos miembros no negativos.',rf'{a}≤x≤{a+b*b}',b*b+1,len([v for v in range(a,a+b*b+1) if s.sqrt(v-a)<=b]))
        if f==3:return question(rf'¿Cuál es el menor entero positivo que cumple |x| > {a}?','En los positivos el valor absoluto coincide con x.',rf'x>{a}',a+1,min(v for v in range(1,40) if abs(v)>a))
        return question(rf'¿Cuál es el mayor entero que cumple (x−{a})² ≤ 0?','Un cuadrado es no negativo: para ser no mayor que cero debe anularse.',rf'(x-{a})²=0\Rightarrow x={a}',a,s.solve((x-a)**2,x)[0])
    if week==10:
        if part==1:
            if f==0:return question(rf'Resuelve x+y={a+b}, x−y={a-b}. ¿Cuánto vale x?','Sumamos las ecuaciones para eliminar y.',rf'2x={2*a}',a,s.solve([x+y-a-b,x-y-a+b],(x,y))[x])
            if f==1:return question(rf'Resuelve x+y={a+b}, x−y={a-b}. ¿Cuánto vale y?','Restamos las ecuaciones para eliminar x.',rf'2y={2*b}',b,s.solve([x+y-a-b,x-y-a+b],(x,y))[y])
            if f==2:return question(rf'Calcula el determinante de la matriz de filas ({a},1) y (1,{b}).','En una matriz 2×2 restamos los productos de las diagonales.',rf'{a}·{b}-1·1',a*b-1,s.det(s.Matrix([[a,1],[1,b]])))
            if f==3:return question(rf'¿Cuántas soluciones reales tiene el sistema x+y={a} y x+y={b}?','La misma suma no puede tomar dos valores distintos.',rf'{a}≠{b}',0,len(s.solve([x+y-a,x+y-b],(x,y))))
            return question(rf'En el sistema x={a}, y={b}, ¿cuánto vale 2x+y?','Sustituimos las dos variables en la expresión pedida.',rf'2·{a}+{b}',2*a+b,(2*x+y).subs({x:a,y:b}))
        if f==0:return question(rf'Resuelve 2x+y={2*a+b}, x−y={a-b}. ¿Cuánto vale x?','La suma de ecuaciones elimina y.',rf'3x={3*a}',a,s.solve([2*x+y-2*a-b,x-y-a+b],(x,y))[x])
        if f==1:return question(rf'Calcula el determinante de la matriz diagonal 3×3 con diagonal {a}, {b}, 2.','El determinante de una matriz diagonal es el producto de su diagonal.',rf'{a}·{b}·2',2*a*b,s.det(s.diag(a,b,2)))
        if f==2:return question(rf'En x+y={a+b}, y+z={b+n}, z+x={n+a}, calcula x+y+z.','Al sumar las tres ecuaciones cada variable aparece dos veces.',rf'2(x+y+z)={2*(a+b+n)}',a+b+n,sum(s.solve([x+y-a-b,y+s.Symbol('z')-b-n,s.Symbol('z')+x-n-a],(x,y,s.Symbol('z'))).values()))
        if f==3:return question(rf'El sistema homogéneo {a}x+y=0, x+{b}y=0 tiene determinante no nulo. ¿Cuánto vale x?','Un sistema homogéneo con determinante no nulo tiene únicamente la solución trivial.',rf'D={a*b-1}≠0;\quad x=y=0',0,s.solve([a*x+y,x+b*y],(x,y))[x])
        return question(rf'Resuelve x+2y={a+2*b} y x−y={a-b}. ¿Cuánto vale y?','Restamos la segunda ecuación de la primera.',rf'3y={3*b}',b,s.solve([x+2*y-a-2*b,x-y-a+b],(x,y))[y])
    if week==11:
        if part==1:
            if f==0:return question(rf'¿Cuál es la parte real de ({a}+2i)+({b}−i)?','Sumamos las partes reales y las imaginarias por separado.',rf'({a}+{b})+(2-1)i',a+b,s.re((a+2*s.I)+(b-s.I)))
            if f==1:return question(rf'¿Cuál es la parte imaginaria de ({a}+2i)+({b}−i)?','La parte imaginaria es el coeficiente real de i.',rf'(2-1)i=i',1,s.im((a+2*s.I)+(b-s.I)))
            if f==2:return question(rf'¿Cuál es la parte imaginaria del conjugado de {a}+{b}i?','El conjugado conserva la parte real y cambia el signo de la imaginaria.',rf'conjugado={a}-{b}i',-b,s.im(s.conjugate(a+b*s.I)))
            if f==3:return question(rf'¿Cuál es la parte real de ({a}+i)({a}−i)?','Los conjugados se multiplican y se usa i²=−1.',rf'{a*a}-i²={a*a}+1',a*a+1,s.re(s.expand((a+s.I)*(a-s.I))))
            return question(rf'¿Cuánto vale la parte real de i^{4*a}?','Las potencias de i se repiten en ciclos de cuatro.',rf'i^{{{4*a}}}=(i⁴)^{a}=1',1,s.re(s.I**(4*a)))
        if f==0:return question(rf'¿Cuál es el módulo del complejo {3*a}+{4*a}i?','El módulo es la raíz de la suma de los cuadrados de las componentes.',rf'√({3*a}²+{4*a}²)',5*a,s.Abs(3*a+4*a*s.I))
        if f==1:return question(rf'¿Cuál es el cuadrado del módulo de {a}+{b}i?','El cuadrado del módulo suma los cuadrados de sus componentes.',rf'{a}²+{b}²',a*a+b*b,s.Abs(a+b*s.I)**2)
        if f==2:return question(rf'Un complejo z tiene módulo {a}. ¿Qué módulo tiene z²?','El módulo de un producto es el producto de módulos.',rf'|z²|=|z|²={a}²',a*a,s.Abs(s.Integer(a)**2))
        if f==3:return question(rf'¿Cuál es el argumento principal, en grados, de {a}+{a}i?','Las dos componentes positivas e iguales sitúan al vector en la bisectriz del primer cuadrante.',rf'tan θ={a}/{a}=1;\quad θ=45°',45,s.arg(a+a*s.I)*180/s.pi)
        return question(rf'¿Cuál es la parte imaginaria de i^{4*a+1}?','Reducimos el exponente por su residuo módulo cuatro.',rf'i^{{{4*a+1}}}=(i⁴)^{a}i=i',1,s.im(s.I**(4*a+1)))
    if week==12:
        if part==1:
            if f==0:return question(rf'Si f(x)={a}x+{b}, calcula f(2).','La función asigna una imagen al argumento indicado.',rf'f(2)={a}·2+{b}',2*a+b,(a*x+b).subs(x,2))
            if f==1:return question(rf'Para f(x)=1/(x−{a}), ¿qué número se excluye del dominio real?','El denominador no puede anularse.',rf'x-{a}=0',a,s.solve(x-a,x)[0])
            if f==2:return question(rf'¿Cuál es el menor entero del dominio real de f(x)=√(x−{a})?','El radicando debe ser no negativo.',rf'x-{a}≥0',a,min(v for v in range(-30,40) if v-a>=0))
            if f==3:return question(rf'La relación contiene los pares (1,{a}), (2,{b}) y (3,{n}). ¿Cuántos elementos tiene su dominio?','El dominio reúne las primeras coordenadas distintas.',rf'dominio=\{{1,2,3\}}',3,len({1,2,3}))
            return question(rf'La relación contiene (1,{a}), (2,{a}) y (3,{b}). ¿Cuántos elementos distintos tiene su rango?','El rango reúne las segundas coordenadas sin repetirlas.',rf'rango=\{{{a},{b}\}}',2,len({a,a,b}))
        if f==0:return question(rf'Si f(x)={a}x+1 y g(x)=x+{b}, calcula f(g(2)).','Primero se aplica la función interior y luego la exterior.',rf'g(2)=2+{b};\quad f(g(2))={a}(2+{b})+1',a*(2+b)+1,(a*x+1).subs(x,2+b))
        if f==1:return question(rf'Si f(x)={a}x+{b}, calcula f⁻¹({a*n+b}).','Invertir la función recupera el argumento a partir de su imagen.',rf'x=({a*n+b}-{b})/{a}',n,s.solve(s.Eq(a*x+b,a*n+b),x)[0])
        if f==2:return question(rf'Si f(x)=x² y g(x)=x+{a}, calcula g(f(2)).','El orden de composición se respeta: primero el cuadrado, luego la suma.',rf'f(2)=4;\quad g(4)=4+{a}',4+a,4+a)
        if f==3:return question(rf'Una función biyectiva entre dos conjuntos finitos tiene dominio de {a} elementos. ¿Cuántos elementos tiene el codominio?','Ser inyectiva evita repeticiones y ser sobreyectiva cubre todo el codominio.',rf'|codominio|=|dominio|={a}',a,len(dict(zip(range(a),range(a)))))
        return question(rf'Si f(x)={a}x y g(x)=x+{b}, calcula (f+g)(1).','La suma de funciones suma sus imágenes en el mismo argumento.',rf'f(1)+g(1)={a}+(1+{b})',a+b+1,(a*x+x+b).subs(x,1))
    if week==13:
        if part==1:
            if f==0:return question(rf'¿Cuál es la pendiente de f(x)={a}x+{b}?','En una función afín la pendiente es el coeficiente de x.',rf'f(x)=mx+c;\quad m={a}',a,s.diff(a*x+b,x))
            if f==1:return question(rf'¿Cuál es la ordenada al origen de f(x)={a}x+{b}?','La intersección con el eje y se obtiene en x=0.',rf'f(0)={b}',b,(a*x+b).subs(x,0))
            if f==2:return question(rf'¿Cuál es la coordenada x del vértice de f(x)=(x−{a})²+{b}?','El cuadrado alcanza su mínimo cuando su base es cero.',rf'x-{a}=0',a,s.solve(s.diff((x-a)**2+b,x),x)[0])
            if f==3:return question(rf'¿Cuál es la coordenada y del vértice de f(x)=(x−{a})²+{b}?','En el vértice el término cuadrático vale cero.',rf'f({a})=0+{b}',b,((x-a)**2+b).subs(x,a))
            return question(rf'Si una función constante vale {a}, ¿cuál es su valor en x={b}?','Una función constante da la misma imagen para cualquier argumento de su dominio.',rf'f({b})={a}',a,s.Integer(a))
        if f==0:return question(rf'¿Cuál es el mínimo de f(x)=|x−{a}|+{b}?','El valor absoluto es no negativo y se anula en x=a.',rf'f({a})=0+{b}',b,s.Abs(a-a)+b)
        if f==1:return question(rf'Para f(x)=√(x−{a}), ¿cuál es el extremo izquierdo de su dominio real?','La raíz cuadrada exige radicando no negativo.',rf'x-{a}≥0\Rightarrow x≥{a}',a,min(v for v in range(-30,40) if v-a>=0))
        if f==2:return question(rf'Para f(x)=1/(x−{a}), ¿en qué valor de x está la asíntota vertical?','Buscamos dónde el denominador se anula y el numerador no.',rf'x-{a}=0',a,s.solve(x-a,x)[0])
        if f==3:return question(rf'Calcula el mayor entero menor o igual que −{a}−0.2.','La función piso toma el entero de la izquierda, también para negativos.',rf'⌊-{a}-0.2⌋=-{a+1}',-(a+1),s.floor(-a-s.Rational(1,5)))
        return question(rf'La función signo vale −1 para números negativos, 0 en cero y 1 para positivos. ¿Cuánto vale signo(−{a})?','Identificamos el signo del argumento.',rf'-{a}<0',-1,s.sign(-a))
    if week==14:
        if part==1:
            if f==0:return question(rf'Calcula log₂({2**a}).','El logaritmo pregunta a qué exponente se eleva la base.',rf'2^{a}={2**a}',a,s.log(2**a,2))
            if f==1:return question(rf'Resuelve 3^x={3**a}. ¿Cuánto vale x?','La exponencial de base positiva distinta de uno es inyectiva.',rf'3^x=3^{a}',a,s.log(3**a,3))
            if f==2:return question(rf'Calcula 2^{a}+1.','Primero calculamos la potencia y después sumamos.',rf'{2**a}+1',2**a+1,s.Integer(2)**a+1)
            if f==3:return question(rf'Calcula log₁₀({10**a}).','La base diez elevada al exponente buscado debe dar el argumento.',rf'10^{a}={10**a}',a,s.log(10**a,10))
            return question(rf'¿Cuál es el menor entero del dominio de log₂(x−{a})?','El argumento de un logaritmo real debe ser estrictamente positivo.',rf'x-{a}>0\Rightarrow x>{a}',a+1,min(v for v in range(-30,40) if v-a>0))
        if f==0:return question(rf'Si antilog₁₀(t)=10^t, calcula antilog₁₀({a}).','La antilogaritmación invierte el logaritmo de base diez.',rf'10^{a}',10**a,s.Integer(10)**a)
        if f==1:return question(rf'Si colog₁₀(t)=−log₁₀(t), calcula colog₁₀({10**a}).','Aplicamos la definición y conservamos el signo menos.',rf'-log₁₀(10^{a})=-{a}',-a,-s.log(10**a,10))
        if f==2:return question(rf'Calcula log₂({2**a}·{2**b}).','El logaritmo de un producto de positivos suma logaritmos.',rf'log₂(2^{a})+log₂(2^{b})={a}+{b}',a+b,s.log(2**a*2**b,2))
        if f==3:return question(rf'Calcula log₃({3**b}/{3**a}).','El logaritmo de un cociente de positivos resta logaritmos.',rf'{b}-{a}',b-a,s.log(s.Rational(3**b,3**a),3))
        return question(rf'Si log₂(x)={a}, ¿cuánto vale x?','Pasamos de forma logarítmica a exponencial.',rf'x=2^{a}',2**a,s.Integer(2)**a)
    if week==15:
        if part==1:
            if f==0:return question(rf'Una progresión aritmética empieza en {a} y tiene diferencia 3. ¿Cuál es el término {n}?','El término n suma n−1 incrementos al primero.',rf'a_n={a}+({n}-1)·3',a+(n-1)*3,[a+3*i for i in range(n)][-1])
            if f==1:return question(rf'Suma los primeros {n} términos de la progresión aritmética {a}, {a+2}, {a+4}, …','Promediamos primero y último y multiplicamos por la cantidad.',rf'S_n={n}·({a}+{a+2*(n-1)})/2',n*(a+(a+2*(n-1)))//2,sum(a+2*i for i in range(n)))
            if f==2:return question(rf'Dos términos consecutivos de una progresión aritmética son {a} y {b}. ¿Cuál es la diferencia común?','La diferencia se obtiene restando el anterior al siguiente.',rf'{b}-{a}',b-a,b-a)
            if f==3:return question(rf'¿Cuántos términos tiene la progresión aritmética {a}, {a+2}, …, {a+2*(n-1)}?','Despejamos n en el término general.',rf'{a+2*(n-1)}={a}+2(n-1)',n,len(range(a,a+2*(n-1)+1,2)))
            return question(rf'Tres números consecutivos en progresión aritmética son {a}, x y {a+6}. ¿Cuánto vale x?','El término central es el promedio de los extremos.',rf'x=({a}+{a+6})/2',a+3,s.Rational(a+a+6,2))
        if f==0:return question(rf'Una progresión geométrica empieza en {a} y tiene razón 2. ¿Cuál es su cuarto término?','Cada avance multiplica una vez por la razón.',rf'a_4={a}·2³',8*a,[a*2**i for i in range(4)][-1])
        if f==1:return question(rf'Suma los cuatro primeros términos de la progresión geométrica {a}, {2*a}, {4*a}, …','Escribimos los cuatro términos y sumamos.',rf'{a}+{2*a}+{4*a}+{8*a}',15*a,sum(a*2**i for i in range(4)))
        if f==2:return question(rf'Dos términos consecutivos no nulos de una progresión geométrica son {a} y {3*a}. ¿Cuál es su razón?','La razón divide un término por el anterior.',rf'{3*a}/{a}',3,s.Rational(3*a,a))
        if f==3:return question(rf'La progresión geométrica infinita empieza en {a} y tiene razón 1/2. ¿Cuál es su suma?','Como |r|<1, la suma convergente es a₁/(1−r).',rf'{a}/(1-1/2)',2*a,s.summation(s.Integer(a)*s.Rational(1,2)**s.Symbol('j',integer=True,nonnegative=True),(s.Symbol('j',integer=True,nonnegative=True),0,s.oo)))
        return question(rf'Los recíprocos de una progresión armónica son {a}, {a+2}, {a+4}, … ¿Cuál es el denominador del tercer término si se escribe como 1/d?','Los recíprocos forman una progresión aritmética.',rf'1/a_3={a+4};\quad a_3=1/{a+4}',a+4,1/s.Rational(1,a+4))
    if week==16:
        if part==1:
            if f==0:return question(rf'En unidades monetarias, el costo fijo es {10*a}, el costo variable por unidad es 2 y el precio de venta es 7. ¿Cuántas unidades vendidas cubren exactamente el costo total?','En el equilibrio el ingreso es igual al costo.',rf'7q={10*a}+2q;\quad 5q={10*a}',2*a,s.solve(s.Eq(7*x,10*a+2*x),x)[0])
            if f==1:return question(rf'El costo total de q unidades es C(q)={a}+2q. ¿Cuánto cuesta producir {b} unidades?','El costo fijo se suma una sola vez al variable.',rf'C({b})={a}+2·{b}',a+2*b,(a+2*x).subs(x,b))
            if f==2:return question(rf'Se venden {a} unidades a {b} cada una y el costo total es {a}. ¿Cuál es la utilidad?','La utilidad resta el costo total al ingreso.',rf'U={a}·{b}-{a}',a*b-a,a*b-a)
            if f==3:return question(rf'Un rectángulo tiene ancho x y largo x+{a}. Su perímetro es {4*b+2*a}. ¿Cuánto vale x?','El perímetro suma dos largos y dos anchos.',rf'2x+2(x+{a})={4*b+2*a}',b,s.solve(s.Eq(2*x+2*(x+a),4*b+2*a),x)[0])
            return question(rf'Un producto cuesta {10*a}. Tras un descuento del 10 %, ¿cuál es su precio?','Descontar 10 % deja el 90 % del precio inicial.',rf'{10*a}·90/100',9*a,s.Rational(90,100)*10*a)
        if f==0:return question(rf'La utilidad está modelada por U(q)=−q²+{2*a}q para 0≤q≤{2*a}. ¿En qué cantidad q se alcanza el máximo?','La parábola abre hacia abajo y alcanza su máximo en el vértice.',rf'q=-b/(2a)=-{2*a}/(-2)',a,s.solve(s.diff(-x*x+2*a*x,x),x)[0])
        if f==1:return question(rf'Un rectángulo tiene perímetro {4*a}. ¿Cuál es el área máxima posible?','Con suma fija de lados, el producto se maximiza cuando son iguales.',rf'largo+ancho={2*a};\quad largo=ancho={a}',a*a,(-x*x+2*a*x).subs(x,a))
        if f==2:return question(rf'Una población inicial de {a} unidades se duplica en cada periodo según el modelo. ¿Cuántas unidades hay tras tres periodos?','Se multiplica por dos una vez por cada periodo completo.',rf'P(3)={a}·2³',8*a,a*2**3)
        if f==3:return question(rf'La masa de una sustancia radiactiva aún sin desintegrar es {8*a} gramos. Se reduce a la mitad cada vida media. ¿Cuántos gramos de esa sustancia quedan sin desintegrar tras tres vidas medias?','Cada vida media multiplica la cantidad de sustancia original aún sin desintegrar por 1/2.',rf'm={8*a}·(1/2)³',a,s.Integer(8*a)*s.Rational(1,2)**3)
        return question(rf'Un viaje de {a*b} km se realiza a velocidad constante de {a} km/h. ¿Cuántas horas dura?','Con rapidez constante, el tiempo es distancia dividida entre rapidez.',rf't={a*b}/{a}',b,s.Rational(a*b,a))
    return make(week,part,f,k)

TITLES={2:'Números reales y valor absoluto',3:'Potencias, raíces y racionalización',4:'Expresiones algebraicas y monomios',5:'Polinomios, productos notables y división',6:'Factorización',7:'Fracciones algebraicas',8:'Ecuaciones lineales, cuadráticas y bicuadradas',9:'Inecuaciones',10:'Sistemas de ecuaciones',11:'Números complejos',12:'Relaciones y funciones',13:'Funciones elementales',14:'Exponentes y logaritmos',15:'Progresiones',16:'Modelación algebraica'}

def tex_model(text):
    text=text.replace('²','^2').replace('³','^3').replace('·',r'\cdot ').replace('±',r'\pm ').replace('≥',r'\ge ').replace('≤',r'\le ').replace('≠',r'\ne ').replace('⇒',r'\Rightarrow ')
    text=text.replace('θ',r'\theta ').replace('°',r'^\circ').replace('⌊',r'\lfloor ').replace('⌋',r'\rfloor ')
    text=re.sub(r'(?<![A-Za-z\\])tan(?![A-Za-z])',r'\\tan ',text)
    for word in ['conjugado','codominio','dominio','entero','mínimo','máximo','grado','rango']:
        text=re.sub(r'(?<![A-Za-z\\])'+word+r'(?![A-Za-z])',lambda m:r'\text{'+m[0]+'}',text)
    for sub in ['₁₀','₂','₃']:
        base=sub.translate(str.maketrans('₀₁₂₃','0123'))
        text=text.replace('colog'+sub,r'\operatorname{colog}_{'+base+'}').replace('antilog'+sub,r'\operatorname{antilog}_{'+base+'}').replace('log'+sub,r'\log_{'+base+'}')
    out='';i=0
    while i<len(text):
        if text[i]!='√':out+=text[i];i+=1;continue
        i+=1
        if i<len(text) and text[i]=='(':
            start=i+1;depth=1;i+=1
            while i<len(text) and depth:
                if text[i]=='(':depth+=1
                if text[i]==')':depth-=1
                i+=1
            assert depth==0,text
            out+=r'\sqrt{'+tex_model(text[start:i-1])+'}'
        else:
            start=i
            while i<len(text) and text[i].isdigit():i+=1
            assert i>start,text
            out+=r'\sqrt{'+text[start:i]+'}'
    return out

def mark_authored_math(text):
    # Authoring-only: explicit delimiters for known powers/roots; never applied to arbitrary app prose.
    pieces=text.split('$')
    for part in range(0,len(pieces),2):
        value=pieces[part];out='';i=0
        while i<len(value):
            if value[i]!='√':out+=value[i];i+=1;continue
            start=i;i+=1
            if i<len(value) and value[i]=='(':
                depth=1;i+=1
                while i<len(value) and depth:
                    if value[i]=='(':depth+=1
                    if value[i]==')':depth-=1
                    i+=1
                assert depth==0,value
            else:
                while i<len(value) and value[i].isdigit():i+=1
            out+='$'+tex_model(value[start:i])+'$'
        # Avoid changing TeX segments just created above.
        chunks=out.split('$')
        for index in range(0,len(chunks),2):
            chunks[index]=re.sub(r'([A-Za-z0-9]+)\^(\(-?\d+\)|-?\d+|[A-Za-z])',
                lambda m:'$'+m[1]+'^{'+m[2].strip('()')+'}$',chunks[index])
        pieces[part]='$'.join(chunks)
    return '$'.join(pieces)

def alternatives(answer,rotation):
    candidates=[answer,answer+1,answer-1,answer*2,answer/2,answer+2,answer-2,-answer,answer+3,answer+4]
    result=[]
    for item in candidates:
        item=s.simplify(item)
        if answer>=0 and item<0:continue
        if answer.is_integer and not item.is_integer:continue
        if item.is_real is not True or item.is_finite is not True:continue
        if any(s.simplify(item-v)==0 for v in result):continue
        result.append(item)
        if len(result)==4:break
    assert len(result)==4,(answer,result)
    result=result[rotation:]+result[:rotation]
    return [M(v) for v in result],next(i for i,v in enumerate(result) if s.simplify(v-answer)==0)

def build(write=False):
    evidence=[];preview=[]
    production=ROOT/'shared/src/commonMain/composeResources/files/aprender/algebra'
    fixtures=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender/algebra'
    for week in range(2,17):
        for part in [1,2]:
            rel=Path(rf'semana{week:02}')/rf'{week}.{part}'
            path=production/rel/'questions.json'
            old=json.loads(path.read_text(encoding='utf-8-sig'))
            assert len(old) in [10,11],path
            output=[]
            for index in range(11):
                family=index%5;k=2+index//5
                task=advanced(week,part,family,k)
                options,key=alternatives(task['answer'],index%4)
                q=old[min(index,len(old)-1)].copy()
                q.update(id=old[0]['id'][:-2]+rf'{index+1:02}',concept=rf'{week}.{part}.{index+1}',type='MULTIPLE_CHOICE',subject='algebra',semana=week,
                    statement=mark_authored_math(task['statement']),options=options,correctIndex=key,
                    explanation=f"1. {task['rule']}\n2. Sustituimos y operamos: ${tex_model(task['model'])}$.\n3. El valor pedido es {M(task['answer'])}.",
                    fuente='Ejercicio original RASTRO; modelos y verificación en docs/aprender/algebra/REVISION_PRACTICA_02_A_16.md',pedagogicalTier='aplicación')
                output.append(q)
                preview.append(q)
                evidence.append({'id':q['id'],'week':week,'part':part,'family':family,'variant':k,'answer':str(task['answer']),'proof':task['proof'],'statement':q['statement'],'rule':task['rule'],'model':tex_model(task['model']),'options':options,'correctIndex':key})
            assert len(set(q['statement'] for q in output))==11,path
            if write:
                backup=ROOT/'build/academic-backup-algebra-02-16'/rel/'questions.json';backup.parent.mkdir(parents=True,exist_ok=True)
                if not backup.exists():shutil.copy2(path,backup)
                path.write_text(json.dumps(output,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
                assert (fixtures/rel/'questions.json').exists()
                shutil.copy2(path,fixtures/rel/'questions.json')
    report=ROOT/'build/algebra-02-16-math-proofs.json'
    report.write_text(json.dumps(evidence,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    (ROOT/'build/algebra-02-16-preview.json').write_text(json.dumps(preview,ensure_ascii=False,indent=2)+'\n',encoding='utf-8')
    print(json.dumps({'questions':len(evidence),'levels':30,'written':write}))

if __name__=='__main__':
    parser=argparse.ArgumentParser();parser.add_argument('--write',action='store_true');args=parser.parse_args();build(args.write)
