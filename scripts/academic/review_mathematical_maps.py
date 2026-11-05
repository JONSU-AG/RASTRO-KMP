"""Reviewed mathematical outlines and one English connector map; existing viewer only."""
from pathlib import Path
import re,json,shutil,argparse,hashlib
from review_logical_maps import make_map,ROOT
MAPS={
'raz_matematico/semana01/1.1':('Razonamiento numérico',[
 ('Sucesiones con regla explícita',[
  'Aritmética: diferencia constante entre términos sucesivos.',
  'Cuadrática: segunda diferencia constante para índices consecutivos.',
  'Geométrica: cociente constante cuando los términos anteriores son no nulos.',
  'Polinomiales de mayor grado: precisar la familia antes de extrapolar.',
  'Recurrencias: Fibonacci, Lucas o Tribonacci con valores iniciales dados.',
  'Alternadas: distinguir las reglas de las posiciones que se intercalan.']),
 ('Arreglos numéricos',[
  'Filas y columnas: escribir la regla que relaciona sus datos.',
  'Distribuciones figurativas: conservar los datos y posiciones del dibujo.',
  'Una lista finita no determina por sí sola una continuación única.']),
 ('Series y sumas',[
  'Sumas de enteros, pares, impares y cuadrados con cantidad de términos indicada.',
  'Suma aritmética finita: primer término, diferencia y número de términos.',
  r'Serie geométrica infinita: $|q|<1$ para aplicar la suma usual.',
  'Estimación: justificar las cotas y comprobar el orden de magnitud.']),
 ]),
'raz_matematico/semana02/2.1':('Magnitudes y proporcionalidad',[
 ('Razones y proporciones',[
  r'Diferencia o razón aritmética: $a-b$.',
  r'Cociente o razón geométrica: $a/b$, con b no nulo.',
  'Proporción discreta: términos medios distintos en la clasificación utilizada.',
  'Proporción continua: los términos medios coinciden.']),
 ('Modelos proporcionales',[
  r'Directa: $y/x=k$, con denominador admisible.',
  r'Inversa: $xy=k$ bajo las condiciones del modelo.',
  'Engranajes sin deslizamiento: comprobar dientes, radios y sentido de giro.',
  'Reparto: indicar si los pesos son directos, inversos o compuestos.']),
 ('Métodos',[
  'Regla de tres simple: identificar qué se mantiene constante.',
  'Regla compuesta: separar el efecto de cada magnitud y declarar productividad.',
  'Escala: convertir unidades antes de comparar plano y terreno.']),
 ('Porcentajes',[
  'Especificar la base de cada porcentaje.',
  'Cambios sucesivos: multiplicar factores, no sumar porcentajes sin revisar.',
  'Costo, venta, ganancia y pérdida: identificar cuál es la cantidad de referencia.']),
 ]),
'raz_matematico/semana03/3.1':('Ecuaciones y edades',[
 ('Traducción a ecuaciones',[
  'Definir la incógnita y sus unidades.',
  'Precisar el alcance de doble, triple, excede y tanto como.',
  'Fracciones de una cantidad: identificar el todo.',
  'Soluciones enteras: comprobar restricciones del problema, no solo la ecuación.']),
 ('Edades',[
  'Una persona: organizar pasado, presente y futuro en una línea temporal.',
  'Varias personas: sumar o restar el mismo tiempo a todas.',
  r'Diferencia constante: $(a+t)-(b+t)=a-b$.',
  'Año de nacimiento: considerar si ya ocurrió el cumpleaños; no asumir una igualdad entera sin ese dato.']),
 ('Equivalencias y balanzas',[
  'Equilibrio: aplicar operaciones equivalentes a ambos lados.',
  'Reducción en cadena: sustituir igualdades sin cambiar las unidades.',
  'Falsa suposición: comparar con un caso base y justificar cada ajuste.',
  'Comprobar el resultado en el enunciado original.']),
 ]),
'raz_matematico/semana04/4.1':('Razonamiento geométrico',[
 ('Áreas',[
  'Trasladar o descomponer regiones sin deformarlas conserva el área.',
  'Diferencia de áreas: identificar la región total y la que se retira.',
  'Triángulos: usar bases y alturas correspondientes; revisar medianas y baricentro.',
  'Paralelogramos y trapecios: distinguir altura perpendicular y lado oblicuo.']),
 ('Perímetros y fronteras',[
  'Sumar las longitudes de la frontera solicitada, incluidos huecos si el enunciado los cuenta.',
  'Arcos: usar el ángulo correspondiente y sumar también los segmentos rectos que pertenecen al borde.',
  'Una proyección no conserva cualquier longitud; justificar las condiciones de un atajo rectilíneo.']),
 ('Conteo de figuras',[
  'Segmentos sobre una recta: elegir sus dos extremos entre puntos distintos.',
  'Triángulos y cuadriláteros: clasificar tamaños y evitar contar la misma figura dos veces.',
  'Bloques: distinguir volumen total, cubos visibles y caras expuestas.']),
 ('Visualización espacial',[
  'Simetría axial: reflexión respecto de una recta.',
  'Simetría central: correspondencia respecto de un punto.',
  'Doblado y perforación: reflejar cada pliegue en orden inverso.',
  'Vistas: frontal, superior y perfil, con orientación indicada.']),
 ]),
'raz_matematico/semana05/5.1':('Conteo y agrupaciones',[
 ('Principios de conteo',[
  'Suma: alternativas disjuntas; si se solapan, corregir las intersecciones.',
  'Producto: contar las opciones de cada etapa bajo las restricciones dadas.']),
 ('Rutas y caminos',[
  'Árbol: una rama por elección admitida.',
  'Red vial: distinguir recorridos sucesivos de alternativas.',
  'Cuadrícula: precisar direcciones permitidas y puntos de paso.',
  'Bloqueos: excluir solo las rutas que usan la zona prohibida.']),
 ('Importa el orden',[
  r'Permutación lineal de n objetos distintos: $n!$.',
  r'Circular: $(n-1)!$ para objetos distintos si se identifican giros, pero no reflejos.',
  'Repeticiones: dividir por las multiplicidades de los objetos indistinguibles.',
  'Variación: elegir y ordenar un subconjunto, con o sin repetición según se indique.']),
 ('No importa el orden',[
  r'Combinación simple: $\binom{n}{k}$ para elegir k objetos entre n distintos.',
  'Equipos y comisiones: aplicar restricciones sin asignar cargos inexistentes.']),
 ]),
'raz_matematico/semana05/5.2':('Elegir un método de conteo',[
 ('El orden distingue resultados',[
  r'Se usan todos los objetos distintos en fila: $n!$.',
  r'Se eligen k objetos distintos y se ordenan sin repetir: $n!/(n-k)!$.',
  'Si hay repeticiones o simetrías, revisar el modelo antes de usar una fórmula.']),
 ('El orden no distingue resultados',[
  r'Grupo de k entre n objetos distintos sin repetir: $\binom{n}{k}=n!/[k!(n-k)!]$.',
  'Un equipo sin cargos se identifica por sus integrantes.',
  'No confundir elegir ingredientes con contar cantidades de una mezcla.']),
 ('Comprobación',[
  'Definir cuándo dos resultados son iguales.',
  'Enumerar un caso pequeño y verificar que no haya repeticiones.',
  'Mantener las mismas reglas de conteo desde el inicio hasta la conclusión.']),
 ]),
'raz_matematico/semana06/6.1':('Probabilidad y eventos',[
 ('Conceptos',[
  'Experimento aleatorio: resultado no fijado por el modelo antes de realizarlo.',
  r'Espacio muestral $\Omega$: resultados posibles.',
  r'Evento A: subconjunto de $\Omega$.',
  'Seguro e imposible: todo el espacio o el conjunto vacío, respectivamente.']),
 ('Cálculo',[
  'Laplace: favorables entre posibles, solo con resultados elementales equiprobables.',
  r'Acotación: $0\le P(A)\le1$.',
  r'Complemento: $P(A^c)=1-P(A)$.']),
 ('Relaciones entre eventos',[
  r'Unión: $P(A\cup B)=P(A)+P(B)-P(A\cap B)$.',
  'Incompatibles: intersección vacía; no equivalen a independientes.',
  r'Independencia: $P(A\cap B)=P(A)P(B)$.']),
 ('Condicionamiento',[
  r'$P(A\mid B)=P(A\cap B)/P(B)$, con $P(B)>0$.',
  'Extracciones: precisar reemplazo y cómo se selecciona cada objeto.',
  'Probabilidad total: combinar una partición y sus pesos.',
  'Bayes: actualizar el peso de una causa al conocer un resultado.']),
 ]),
'raz_matematico/semana07/7.1':('Estadística y análisis de datos',[
 ('Organización',[
  'Frecuencia absoluta: número de observaciones de un valor o categoría.',
  'Frecuencia relativa: proporción respecto del total.',
  'Acumuladas: ordenar la variable antes de sumar frecuencias.',
  'Clases: precisar límites y ancho; no confundir marca de clase con un dato exacto.']),
 ('Gráficos',[
  'Barras: comparar categorías o valores discretos.',
  'Histograma: intervalos; revisar área frente a altura si los anchos difieren.',
  r'Sectores: ángulo $\theta=360^\circ h_i$ cuando las proporciones forman el total.']),
 ('Tendencia central',[
  'Media: suma de valores dividida entre su cantidad; con pesos, dividir entre la suma de pesos.',
  'Mediana: centro del orden; con cantidad par, promedio de los dos centrales en datos numéricos.',
  'Moda: valor de máxima frecuencia; puede haber más de una.']),
 ('Dispersión y posición',[
  'Rango: máximo menos mínimo.',
  'Varianza: distinguir denominador N de población y n menos uno de muestra corregida.',
  'Desviación estándar: raíz de la varianza; vuelve a las unidades originales.',
  'Cuartiles: indicar el método cuando las convenciones cambian el resultado.']),
 ]),
'ingles/semana04/4.2':('Conectores en inglés',[
 ('Contrast: contraste',[
  'But une elementos o cláusulas coordinadas.',
  'However enlaza ideas contrastantes; revisar la puntuación.',
  'Although introduce una cláusula con sujeto y verbo.',
  'Despite precede un grupo nominal o una forma -ing; no lleva of.']),
 ('Cause and result: causa y resultado',[
  'Because introduce una cláusula de causa.',
  'Because of precede un grupo nominal o una forma -ing.',
  'So presenta un resultado en la estructura adecuada.',
  'Therefore y as a result presentan una consecuencia; revisar la puntuación.']),
 ('Purpose: finalidad',[
  'To más verbo base puede expresar para qué se hace algo.',
  'In order to más verbo base expresa propósito; negativo: in order not to.',
  'So that e in order that introducen cláusulas; no se mezclan automáticamente con to más infinitivo.']),
 ]),
}

def build(write=False):
    evidence=[]
    for rel,(title,branches)in MAPS.items():
        path=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel/'theory.md'
        raw=path.read_text(encoding='utf8');blocks=list(re.finditer(r'```[^\n]*\n.*?```',raw,re.S))
        block=next(m for m in blocks if '│'in m[0]or'├'in m[0])
        question=path.with_name('questions.json');digest=hashlib.sha256(question.read_bytes()).hexdigest()
        new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]
        if rel.endswith('raz_matematico/semana01/1.1'):
            new=new.replace('cuya razón se vuelve constante recién en el **segundo nivel de diferencias sucesivas**','cuya **segunda diferencia** entre términos de índices consecutivos es constante')
        if rel.endswith('raz_matematico/semana04/4.1'):
            new=new.replace('la **longitud total de su frontera o contorno exterior**','la **longitud de la frontera solicitada**; si se pide toda la frontera de una región con huecos, también se cuentan sus bordes interiores')
        assert len(new)>=3500,(rel,len(new))
        if write:
            backup=ROOT/'build/academic-backup-mathematical-maps'/rel/'theory.md';backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(new,encoding='utf8')
            fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel/'theory.md';assert fixture.exists();shutil.copy2(path,fixture)
        assert hashlib.sha256(question.read_bytes()).hexdigest()==digest
        evidence.append(dict(level=rel,root=title,nodes=1+sum(1+len(leaves)for _,leaves in branches),before=len(raw),after=len(new),questionsHash=digest))
    (ROOT/'build/mathematical-maps-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes']for x in evidence),written=write)))

if __name__=='__main__':
    ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
