"""Mapas 6.1–8.1 y tablas de apoyo; conserva preguntas y fixtures."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
6:('Funciones químicas inorgánicas',[
 ('Óxidos',[
  'Compuestos binarios de oxígeno con otro elemento; distinguir peróxidos y otras especies especiales.',
  'Óxidos básicos: reaccionan con ácidos; muchos son óxidos metálicos.',
  'Óxidos ácidos: reaccionan con bases; muchos son óxidos no metálicos.',
  'También existen óxidos anfóteros y neutros; metal o no metal no basta como regla universal.']),
 ('Hidróxidos y ácidos',[
  r'Hidróxidos: contienen el grupo $\mathrm{OH^-}$; un álcali es una base soluble en agua.',
  'Oxoácidos: contienen hidrógeno, oxígeno y un elemento central.',
  'Hidrácidos: ácidos sin oxígeno en disolución acuosa; distinguir la especie gaseosa de su disolución ácida.',
  'No todo óxido reacciona con agua para formar automáticamente un ácido o un hidróxido.']),
 ('Hidruros',[
  'Compuestos binarios de hidrógeno con otro elemento.',
  'En hidruros salinos de metales electropositivos, el hidrógeno tiene estado de oxidación -1.',
  r'Hidruros covalentes: ejemplos $\mathrm{NH_3}$, $\mathrm{PH_3}$ y $\mathrm{CH_4}$; no todos son ácidos.']),
 ('Sales y neutralización',[
  'Oxisales: contienen un oxoanión; distinguir catión y anión para formular.',
  'Sales binarias: contienen aniones sin oxígeno en la clasificación introductoria.',
  'En la reacción usual ácido-hidróxido se forman sal y agua; otras reacciones ácido-base no producen necesariamente agua.',
  'Stock indica el estado de oxidación cuando corresponde; la fórmula debe conservar la neutralidad eléctrica.'])]),
7:('Reacciones químicas y balanceo',[
 ('Patrones de reacción',[
  'Síntesis: varios reactivos forman un producto principal.',
  'Descomposición: un reactivo origina varios productos.',
  'Desplazamiento simple: una especie sustituye a otra; comprobar si la reacción es posible.',
  'Doble desplazamiento: intercambio de especies; revisar precipitado, gas o formación de un electrolito débil.']),
 ('Energía y reversibilidad',[
  r'Exotérmica: $\Delta H<0$; endotérmica: $\Delta H>0$, para la reacción y condiciones indicadas.',
  'Reversible: puede avanzar en ambos sentidos según las condiciones; no significa velocidades iguales en todo momento.',
  'La clasificación por patrón no sustituye la comprobación del cambio de estado de oxidación.']),
 ('Oxidación y reducción',[
  'Oxidación: pérdida formal de electrones y aumento del estado de oxidación.',
  'Reducción: ganancia formal de electrones y disminución del estado de oxidación.',
  'El agente reductor se oxida; el agente oxidante se reduce.',
  'En una desproporción, una misma especie se oxida y se reduce.']),
 ('Conservar átomos y carga',[
  'Tanteo y método algebraico: ajustar coeficientes; nunca modificar subíndices para balancear.',
  'Método del estado de oxidación: igualar los cambios electrónicos totales.',
  r'Ión-electrón en medio ácido: balancear O con $\mathrm{H_2O}$ y H con $\mathrm{H^+}$; ajustar carga con electrones.',
  r'Medio básico: eliminar $\mathrm{H^+}$ añadiendo $\mathrm{OH^-}$ a ambos lados, simplificar agua y verificar carga.'])]),
8:('Cantidades químicas y estequiometría',[
 ('Masa y cantidad de sustancia',[
  'Masa atómica promedio: promedio ponderado según abundancias isotópicas; no es el número de masa A.',
  r'Masa molar M: masa por mol; $n=m/M$ con unidades compatibles.',
  r'Número de entidades: $N=nN_A$; indicar si se cuentan átomos, moléculas, iones u otras entidades.',
  'Átomo-gramo y molécula-gramo son denominaciones históricas; expresar la cantidad de sustancia en mol.']),
 ('Composición y fórmulas',[
  r'Porcentaje en masa: $100m_{\mathrm{componente}}/m_{\mathrm{total}}$.',
  'Fórmula empírica: proporción entera más simple de átomos.',
  'Fórmula molecular: múltiplo entero de la empírica; requiere información adicional como la masa molar.']),
 ('Relaciones estequiométricas',[
  'Conservar átomos por elemento y carga eléctrica al balancear una reacción química.',
  'Proporciones definidas: composición fija de un compuesto; proporciones múltiples: distintos compuestos de los mismos elementos.',
  'Proporciones recíprocas: comparar las masas que se combinan con una masa fija de un tercer elemento.',
  'Los coeficientes relacionan moles de las especies; no son directamente una razón de masas en gramos.',
  'La relación entre volúmenes gaseosos requiere la misma temperatura y presión y un modelo adecuado.']),
 ('Reacciones con datos reales',[
  'Reactivo limitante: comparar cantidad disponible dividida por su coeficiente; el menor cociente determina el avance máximo.',
  'Pureza: usar solo la masa reactiva de la muestra.',
  r'Rendimiento: $100m_{\mathrm{real}}/m_{\mathrm{teorica}}$, para el mismo producto y unidad.',
  r'Gas ideal: $V_m=RT/P$; $22{,}4\ \mathrm{L/mol}$ es aproximado a $273{,}15\ \mathrm{K}$ y $1\ \mathrm{atm}$, no para cualquier condición.'])])}

ADDITIONS={
6:r'''

### Comparar la fórmula antes de nombrar

| Fórmula | Familia | Nombre |
|---|---|---|
| $\mathrm{CaO}$ | Óxido | Óxido de calcio |
| $\mathrm{Ca(OH)_2}$ | Hidróxido | Hidróxido de calcio |
| $\mathrm{HCl(aq)}$ | Hidrácido | Ácido clorhídrico |
| $\mathrm{HNO_3}$ | Oxoácido | Ácido nítrico |
| $\mathrm{NaCl}$ | Sal binaria | Cloruro de sodio |
| $\mathrm{Na_2SO_4}$ | Oxisal | Sulfato de sodio |

> **Importante:** la clasificación por familia no demuestra que una sustancia se obtenga simplemente añadiendo agua a cualquier óxido. La reacción concreta debe comprobarse.
''',
7:r'''

### Seguir los electrones sin confundir los agentes

Para $\mathrm{Zn+Cu^{2+}\rightarrow Zn^{2+}+Cu}$:

| Especie inicial | Cambio de estado de oxidación | Proceso | Función |
|---|---|---|---|
| $\mathrm{Zn}$ | $0\rightarrow +2$ | Pierde dos electrones: oxidación | Agente reductor |
| $\mathrm{Cu^{2+}}$ | $+2\rightarrow 0$ | Gana dos electrones: reducción | Agente oxidante |

**Comprobación:** hay un átomo de cada elemento a ambos lados y la carga total es $+2$ en cada miembro. Los electrones perdidos y ganados coinciden; no se cambia la fórmula de las especies para ajustar la ecuación.
''',
8:r'''

### Resolver con una tabla de cantidades

Se dispone de $6\ \mathrm{mol}$ de $\mathrm{H_2}$ y $2\ \mathrm{mol}$ de $\mathrm{O_2}$. Para la reacción completa idealizada:

$$\mathrm{2H_2+O_2\rightarrow 2H_2O}$$

| Especie | Cantidad inicial | Coeficiente | Inicial dividida por coeficiente |
|---|---|---|---|
| $\mathrm{H_2}$ | $6\ \mathrm{mol}$ | 2 | $3\ \mathrm{mol}$ |
| $\mathrm{O_2}$ | $2\ \mathrm{mol}$ | 1 | $2\ \mathrm{mol}$ |

**Primero, comparar:** el menor cociente es 2; el oxígeno es el limitante.

**Después, aplicar la proporción:** se consumen $4\ \mathrm{mol}$ de hidrógeno y $2\ \mathrm{mol}$ de oxígeno para formar $4\ \mathrm{mol}$ de agua.

**Por último, comprobar:** sobran $2\ \mathrm{mol}$ de hidrógeno. Se conservan los átomos: ocho moles de átomos de H y cuatro de O pasan al producto. Este resultado es teórico; un rendimiento menor modificaría la cantidad recuperada.
'''}

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  rel=f'quimica/semana{week:02d}/{week}.1/theory.md'
  p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=p.read_text(encoding='utf8');block=next(m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if '│' in m[0])
  backup=ROOT/'build/academic-backup-chemistry-maps'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(p,backup)
  q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
  new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]+ADDITIONS[week]
  p.write_text(new,encoding='utf8')
  fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  assert fixture.exists();shutil.copy2(p,fixture)
  assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'{week}.1',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
  for i,label in enumerate([title]+[x for name,leaves in branches for x in [name]+leaves]):
   preview.append(dict(id=f'quimica_{week}.1_{i}',subject='quimica',concept=f'{week}.1',statement=label,options=[],explanation=''))
  preview.append(dict(id=f'quimica_{week}.1_table',subject='quimica',concept=f'{week}.1',statement=ADDITIONS[week],options=[],explanation=''))
 assert min(6/2,2/1)==2 and 6-2*2==2 and 2*2==4
 (ROOT/'build/chemistry-maps-continuation.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/chemistry-continuation-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence),tables=len(ADDITIONS))))

if __name__=='__main__':build()
