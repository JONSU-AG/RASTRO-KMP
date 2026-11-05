"""Nine explicitly reviewed maps, using the existing Mermaid subset and viewer."""
from pathlib import Path
import re,json,shutil,argparse
ROOT=Path(__file__).resolve().parents[2]
MAPS={
1:('Proposiciones y enunciados lógicos',[
 ('Tipos de enunciados',[
  'Órdenes, preguntas y deseos: no afirman por sí solos un hecho con valor V o F.',
  'Enunciado abierto: su valor depende de una variable sin asignar o cuantificar.',
  'Enunciado sin interpretación definida: aclarar el significado antes de evaluarlo.',
  'Proposición cerrada: afirma algo evaluable como verdadero o falso.']),
 ('Proposiciones simples',[
  'Predicativa: atribuye una propiedad a un sujeto.',
  'Relacional: afirma un vínculo entre entidades.']),
 ('Proposiciones compuestas',[
  r'Conjunción: $p\land q$; afirma ambas componentes.',
  r'Disyunción inclusiva: $p\lor q$; admite ambas verdaderas.',
  r'Disyunción exclusiva: exige exactamente una componente verdadera.',
  r'Condicional: $p\to q$; solo es falso con p verdadera y q falsa.',
  r'Bicondicional: $p\leftrightarrow q$; exige valores iguales.',
  r'Negación: $\neg p$; invierte el valor.']),
 ('Lógica clásica bivalente',[
  'Bivalencia: cada proposición recibe uno de dos valores, V o F.',
  r'Tercero excluido: $p\lor\neg p$.',
  r'No contradicción: $\neg(p\land\neg p)$.']),
 ]),
2:('Conectores y tablas de verdad',[
 ('Número de componentes',[
  'Negación: opera sobre una proposición o bloque.',
  'Conectores binarios: combinan dos proposiciones o bloques.']),
 ('Conectores frecuentes',[
  r'Conjunción: $p\land q$.',r'Disyunción inclusiva: $p\lor q$.',
  r'Disyunción exclusiva: $(p\lor q)\land\neg(p\land q)$.',
  r'Condicional: $p\to q$, también escrito $q\leftarrow p$.',
  r'Bicondicional: $p\leftrightarrow q$.',
  r'NAND o Sheffer: $\neg(p\land q)$.',r'NOR o Peirce: $\neg(p\lor q)$.']),
 ('Evaluación de fórmulas',[
  r'Con n variables distintas: $2^n$ asignaciones.',
  'Tautología: todas las asignaciones dan V.',
  'Contradicción: todas las asignaciones dan F.',
  'Contingencia: hay al menos una asignación V y otra F.']),
 ('Equivalencias para simplificar',[
  r'De Morgan: $\neg(p\land q)\equiv\neg p\lor\neg q$.',
  r'Condicional: $p\to q\equiv\neg p\lor q$.',
  r'Absorción: $p\land(p\lor q)\equiv p$.']),
 ]),
3:('Relaciones entre proposiciones',[
 ('Condiciones',[
  r'Suficiente: si A basta para B, $A\to B$.',
  r'Necesaria: si B es necesaria para A, $A\to B$.',
  r'Necesaria y suficiente: $A\leftrightarrow B$.',
  'Condicional material: no demuestra por sí solo una causa física.']),
 ('Equivalencia e implicación',[
  'Equivalencia: valores iguales en todas las asignaciones.',
  'Implicación lógica: no hay caso con premisa V y conclusión F.',
  'Subcontrariedad: no pueden ser ambas falsas; se debe precisar el marco interpretativo.']),
 ('Oposición',[
  'Contradicción entre proposiciones: valores opuestos en todas las asignaciones.',
  'Incompatibilidad: no pueden ser ambas verdaderas.',
  'Contrariedad: incompatibles que pueden ser ambas falsas.']),
 ('Consistencia conjunta',[
  'Compatibilidad: existe al menos una asignación donde todas las premisas son V.',
  'Inconsistencia: ninguna asignación hace verdaderas todas las premisas.']),
 ]),
4:('Inferencias y argumentos',[
 ('Tipos de razonamiento',[
  'Deductivo: una inferencia válida preserva la verdad de las premisas.',
  'Inductivo: apoya una conclusión que no queda garantizada por la forma.',
  'Abductivo: propone una explicación para los datos; no demuestra su unicidad.']),
 ('Estructura de un argumento',[
  'Premisas: razones ofrecidas como fundamento.',
  'Conclusión: afirmación que se intenta justificar.',
  'Verdad: propiedad de proposiciones en una interpretación.',
  'Validez: ausencia de un caso con premisas V y conclusión F.']),
 ('Reglas deductivas',[
  r'Modus ponens: $p\to q$, $p$; se concluye $q$.',
  r'Modus tollens: $p\to q$, $\neg q$; se concluye $\neg p$.',
  r'Silogismo hipotético: $p\to q$, $q\to r$; se concluye $p\to r$.',
  r'Silogismo disyuntivo: $p\lor q$, $\neg p$; se concluye $q$.',
  'Dilemas: combinar disyunciones y condiciones justificadas; revisar sus premisas.']),
 ('Formas inválidas frecuentes',[
  'Afirmar el consecuente no autoriza afirmar el antecedente.',
  'Negar el antecedente no autoriza negar el consecuente.']),
 ]),
5:('Silogismos y lógica de clases',[
 ('Proposiciones categóricas',[
  r'Universal afirmativa: todo S es P; $S\cap P^c=\varnothing$.',
  r'Universal negativa: ningún S es P; $S\cap P=\varnothing$.',
  r'Particular afirmativa: algún S es P; $S\cap P\ne\varnothing$.',
  r'Particular negativa: algún S no es P; $S\cap P^c\ne\varnothing$.']),
 ('Términos y premisas',[
  'Mayor P: predicado de la conclusión.',
  'Menor S: sujeto de la conclusión.',
  'Medio M: conecta las premisas y no aparece en la conclusión.',
  'Premisa mayor: contiene P; premisa menor: contiene S.']),
 ('Revisión de validez',[
  'El término medio debe estar distribuido al menos una vez en el silogismo categórico válido.',
  'Revisar las reglas de cantidad y cualidad dentro del esquema categórico.',
  'No concluir existencia de S únicamente desde una universal en la interpretación moderna.']),
 ('Métodos de comprobación',[
  'Diagramas de Venn de tres clases: S, P y M.',
  'Figuras: posición del término medio en las dos premisas.',
  'Contraejemplo: premisas verdaderas y conclusión falsa.']),
 ]),
6:('Sistemas de proposiciones',[
 ('Sistemas consistentes',[
  'Existe al menos una asignación que satisface todas las premisas.',
  'Una fórmula tautológica es satisfacible en todas las asignaciones.',
  'Una fórmula contingente es satisfacible, pero también tiene asignaciones falsas.']),
 ('Sistemas inconsistentes',[
  'Ninguna asignación satisface simultáneamente todas las premisas.',
  r'Contradicción explícita: $p\land\neg p$.',
  'Las restricciones pueden ser incompatibles aun sin una negación literal inmediata.']),
 ('Cómo comprobarlo',[
  'Fijar todas las variables y considerar las combinaciones posibles.',
  'Conservar solo las filas donde todas las premisas sean verdaderas.',
  'Una fila compatible demuestra consistencia; no convierte cada premisa en tautología.']),
 ]),
7:('Razonamiento condicional',[
 ('Deducciones válidas',[
  r'Modus ponens: de $p\to q$ y $p$, se obtiene $q$.',
  r'Modus tollens: de $p\to q$ y $\neg q$, se obtiene $\neg p$.',
  r'Contraposición: $p\to q\equiv\neg q\to\neg p$.']),
 ('Falacias formales',[
  r'Afirmación del consecuente: de $p\to q$ y $q$ no se deduce necesariamente $p$.',
  r'Negación del antecedente: de $p\to q$ y $\neg p$ no se deduce necesariamente $\neg q$.']),
 ('Contraejemplos',[
  'Afirmación del consecuente: p=F y q=V hacen verdaderas las premisas y falsa la conclusión p.',
  'Negación del antecedente: p=F y q=V hacen verdaderas las premisas y falsa la conclusión no q.']),
 ]),
8:('Ordenamiento lógico',[
 ('Orden lineal',[
  'Horizontal: izquierda/derecha u oeste/este, según el eje indicado.',
  'Vertical: arriba/abajo, pisos o valores ordenados, sin confundir criterios.',
  'Distinguir antes de inmediatamente antes; declarar si se admiten empates.']),
 ('Orden circular',[
  'Precisar si las posiciones se leen en sentido horario o antihorario.',
  'Opuestos diametrales: requieren posiciones compatibles, como un número par de asientos equidistantes.',
  'Distinguir izquierda/derecha de quien mira al centro y de quien mira hacia fuera.']),
 ('Cuadro de decisiones',[
  'Tabla simple: cruzar categorías y marcar posibilidades o exclusiones.',
  'Listado categorizado: registrar atributos sin perder la correspondencia.',
  'Una correspondencia biunívoca requiere que cada elemento tenga una pareja única.']),
 ]),
9:('Detección de falacias',[
 ('Falacias formales',[
  'Afirmación del consecuente.',
  'Negación del antecedente.',
  'Se refutan con una asignación de premisas V y conclusión F.']),
 ('Problemas de apoyo y pertinencia',[
  'Generalización precipitada: conclusión más amplia que la evidencia.',
  'Falsa causa: secuencia temporal o asociación sin causalidad demostrada.',
  'Ataque personal: sustituir la crítica del argumento por la del autor.',
  'Apelación a la popularidad: tratar aceptación social como prueba suficiente.']),
 ('Ambigüedad',[
  'Equívoco: una expresión cambia de sentido durante la inferencia.',
  'Anfibología: una construcción admite lecturas sintácticas distintas.']),
 ('Evaluación del argumento',[
  'Identificar la conclusión y las razones concretas.',
  'Un argumento defectuoso no demuestra que su conclusión sea falsa.',
  'Revisar el contexto antes de aplicar una etiqueta de falacia.']),
 ]),
}

def make_map(title,branches):
    # Every edge is authored explicitly; no relation is guessed from indentation.
    nodes=[('ROOT',title)];edges=[]
    for i,(branch,leaves)in enumerate(branches):
        bid=f'B{i+1}';nodes.append((bid,branch));edges.append(('ROOT',bid))
        for j,leaf in enumerate(leaves):
            nid=f'{bid}N{j+1}';nodes.append((nid,leaf));edges.append((bid,nid))
    assert all('"'not in label for _,label in nodes)
    return '```mermaid\ngraph TD\n'+'\n'.join(f' {nid}["{label}"]'for nid,label in nodes)+'\n'+'\n'.join(f' {a} --> {b}'for a,b in edges)+'\n```'

def build(write=False):
    evidence=[]
    for week,(title,branches)in MAPS.items():
        rel=Path(f'raz_logico/semana{week:02}/{week}.1/theory.md')
        path=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
        raw=path.read_text(encoding='utf8');matches=list(re.finditer(r'```[^\n]*\n.*?```',raw,re.S))
        block=next(m for m in matches if '│'in m[0]or'├'in m[0])
        new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]
        if week==2:
            new=new.replace('Estructura de Causa-Efecto, Antecedente \\implies Consecuente.','Relación veritativa entre antecedente y consecuente; no demuestra una causa física.')
        if week==3:
            new=new.replace('### 3.1 Relaciones de Causalidad y Condición','### 3.1 Condiciones necesarias y suficientes')
            new=new.replace('* *Ejemplo:* "Nacer en la provincia de Arequipa (p)" es **suficiente** para "ser peruano de nacimiento (q)".','* *Ejemplo:* Para un entero, ser divisible por 6 (p) es suficiente para ser divisible por 3 (q). No se usa una condición legal como si fuera una ley lógica universal.')
            new=new.replace('* *Ejemplo:* "Tener DNI o documento de identidad (q)" es **necesario** para "votar en las elecciones de la UNSA (p)". (Sin DNI no puedes votar; pero tener DNI no significa obligatoriamente que vayas a votar).','* *Ejemplo:* Ser divisible por 3 (q) es necesario para ser divisible por 6 (p). No basta: el número 3 satisface q y no p.')
            new+='\n\n### Cómo distinguir las dos lecturas\n\nSi sabemos $p\\to q$, p es suficiente para q y q es necesaria para p. Son dos maneras de leer la misma flecha, no dos flechas opuestas. Por ejemplo, todo múltiplo entero de 6 es múltiplo de 3. En cambio, ser múltiplo de 3 no garantiza ser múltiplo de 6: el entero 9 es un contraejemplo.\n\nUna implicación lógica debe cumplirse en todas las interpretaciones admitidas. Un condicional material puede resultar verdadero en una asignación concreta, incluso si su antecedente es falso. Tampoco demuestra una relación causal: una tabla de verdad no explica cómo un fenómeno produce otro. Para comprobar una equivalencia se comparan todas las filas, y basta una discrepancia para refutarla.\n'
        if week==4:
            new=new.replace('Transitividad de causas','Encadenamiento de condicionales')
        if week==5:
            new+='\n\n### Existencia y diagramas de clases\n\nEn la interpretación moderna, «todos los S son P» expresa inclusión, pero no asegura que exista algún S. Para obtener «algún S es P» hace falta un testigo o una premisa de existencia. En un diagrama de Venn, sombrear una región vacía no equivale a colocar una marca de existencia. Esta distinción evita trasladar reglas del cuadro tradicional sin aclarar sus supuestos.\n'
        assert len(new)>=4000,(week,len(new))
        if write:
            backup=ROOT/'build/academic-backup-logical-maps'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
            if not backup.exists():shutil.copy2(path,backup)
            path.write_text(new,encoding='utf8')
            fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
            assert fixture.exists();shutil.copy2(path,fixture)
        evidence.append(dict(level=f'{week}.1',root=title,branches=len(branches),nodes=1+sum(1+len(leaves)for _,leaves in branches),before=len(raw),after=len(new)))
    (ROOT/'build/logical-maps-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2)+'\n',encoding='utf8')
    print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes']for x in evidence),written=write)))

if __name__=='__main__':
    ap=argparse.ArgumentParser();ap.add_argument('--write',action='store_true');build(ap.parse_args().write)
