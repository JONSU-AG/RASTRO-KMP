"""Revisión explícita de los siete esquemas restantes de Química, sin cambiar preguntas."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
9:('Gases: modelo y condiciones',[
 ('Modelo cinético ideal',[
  'Partículas con volumen despreciable frente al recipiente y sin interacciones salvo durante los choques.',
  'Choques elásticos; energía cinética traslacional media proporcional a la temperatura absoluta.',
  'El modelo aproxima mejor gases de baja densidad alejados de la condensación.']),
 ('Relaciones entre variables',[
  r'Boyle: $P_1V_1=P_2V_2$ con temperatura y cantidad de gas constantes.',
  r'Charles: $V_1/T_1=V_2/T_2$ con presión y cantidad constantes.',
  r'Gay-Lussac o Amontons: $P_1/T_1=P_2/T_2$ con volumen y cantidad constantes.',
  r'Ley combinada: $P_1V_1/T_1=P_2V_2/T_2$ con la misma cantidad de gas.']),
 ('Ecuación de estado',[
  r'$PV=nRT$: presión absoluta, temperatura en kelvin y unidades compatibles con R.',
  r'Densidad ideal: $\rho=PM/(RT)$, con masa molar M.',
  r'Valores aproximados de R: $0{,}08206\ \mathrm{L\,atm/(mol\,K)}$ o $8{,}314\ \mathrm{J/(mol\,K)}$.']),
 ('Mezclas y transporte',[
  r'Dalton para mezcla ideal: $P=\sum_i P_i$ y $P_i=x_iP$.',
  r'Amagat: volúmenes parciales ideales a la misma presión y temperatura; $V_i=x_iV$.',
  r'Masa molar media: $M_{\mathrm{mezcla}}=\sum_i x_iM_i$.',
  r'Graham para efusión comparable: $r_1/r_2=\sqrt{M_2/M_1}$. No describe sin condiciones cualquier difusión macroscópica.'])]),
10:('Dispersiones, concentración y dilución',[
 ('Tipos de dispersión',[
  'Solución: mezcla homogénea a escala molecular o iónica.',
  'Coloide: partículas dispersas de tamaño intermedio; puede presentar efecto Tyndall y movimiento browniano.',
  'Suspensión: partículas mayores que pueden sedimentar; los límites de tamaño son una clasificación aproximada.']),
 ('Concentraciones físicas',[
  'Porcentaje m/m: gramos de soluto por 100 gramos de solución.',
  'Porcentaje v/v: volumen de soluto por 100 unidades del volumen final de solución.',
  'Porcentaje m/v: gramos de soluto por 100 mL de solución.',
  'ppm en masa equivale a mg/kg; mg/L solo aproxima ese valor si la densidad de la solución es cercana a 1 kg/L.']),
 ('Concentraciones químicas',[
  'Molaridad: moles de soluto por litro de solución.',
  'Molalidad: moles de soluto por kilogramo de disolvente.',
  r'Fracción molar: $x_i=n_i/n_{\mathrm{total}}$.',
  'Normalidad: equivalentes por litro; el factor de equivalencia depende de la reacción especificada.']),
 ('Operaciones y conservación',[
  r'Dilución sin reacción ni pérdida de soluto: $M_1V_1=M_2V_2$.',
  r'Mezcla del mismo soluto sin reacción: $M_fV_f=M_1V_1+M_2V_2$; usar el volumen final real.',
  'En equivalencia ácido-base coinciden equivalentes reactivos; no necesariamente moles de ácido y base.'])]),
11:('Velocidad y equilibrio químico',[
 ('Cinética',[
  'Colisiones eficaces: energía y orientación apropiadas para el mecanismo considerado.',
  'Energía de activación y estado de transición describen la barrera de una ruta de reacción.',
  r'Ley de velocidad: $v=k[A]^\alpha[B]^\beta$; los órdenes se determinan experimentalmente y no se copian en general de los coeficientes.',
  'Concentración, temperatura, superficie y catalizadores pueden modificar la rapidez según el sistema.']),
 ('Equilibrio dinámico',[
  'Las velocidades directa e inversa son iguales; las concentraciones son constantes, no necesariamente iguales.',
  'K corresponde a una ecuación, temperatura y convención dadas; omitir sólidos y líquidos puros en las expresiones habituales.',
  'Comparar Q con K permite determinar hacia qué sentido debe evolucionar el sistema para alcanzar equilibrio.',
  r'Para gases ideales y las convenciones habituales: $K_p=K_c(RT)^{\Delta n_g}$; contar solo especies gaseosas.']),
 ('Perturbaciones',[
  'Cambios de concentración pueden modificar la composición de equilibrio.',
  'La respuesta a compresión depende de los moles gaseosos; un gas inerte no tiene el mismo efecto a volumen y presión constantes.',
  'Cambiar la temperatura puede cambiar K; considerar el signo de la entalpía de reacción.',
  'Un catalizador acelera ambos sentidos y la llegada al equilibrio; no cambia K ni la composición de equilibrio.'])]),
12:('Ácidos, bases y equilibrio acuoso',[
 ('Modelos ácido-base',[
  'Arrhenius: aumento de hidronio o hidróxido en disolución acuosa.',
  'Brønsted-Lowry: ácido dona un protón y base lo acepta; identificar los pares conjugados.',
  'Lewis: ácido acepta un par electrónico y base lo dona.']),
 ('Agua y escala de pH',[
  r'Autoionización: $2\mathrm{H_2O}\rightleftharpoons\mathrm{H_3O^+}+\mathrm{OH^-}$.',
  r'En disoluciones diluidas, $K_w\approx[\mathrm{H_3O^+}][\mathrm{OH^-}]$; depende de la temperatura.',
  r'$\mathrm{pH}\approx-\log_{10}[\mathrm{H_3O^+}]$ en el tratamiento diluido; rigurosamente se usa actividad.',
  r'$\mathrm{pH+pOH}=pK_w$, aproximadamente 14 a $25\,^{\circ}\mathrm C$; neutral significa igual actividad de ambos iones.']),
 ('Fuerza y cálculo',[
  'Fuerte o débil describe ionización; concentrado o diluido describe cantidad relativa. No son sinónimos.',
  'La concentración de iones de una base fuerte depende también de lo que realmente se disuelve.',
  'Para ácidos polipróticos, resolver las etapas; no multiplicar automáticamente la concentración por todos los hidrógenos.',
  r'Ácido débil monoprótico: $[\mathrm{H_3O^+}]\approx\sqrt{K_aC_0}$ solo si la ionización y la contribución del agua son despreciables frente a las cantidades pertinentes.']),
 ('Amortiguadores y titulación',[
  r'Buffer: ácido débil y base conjugada en cantidades apreciables; $\mathrm{pH}\approx pK_a+\log([A^-]/[HA])$ dentro de sus supuestos.',
  'Hidrólisis de sales: analizar los iones y sus equilibrios; no clasificar solo por el nombre de la sal.',
  'Equivalencia estequiométrica y punto final del indicador son conceptos distintos; el pH de equivalencia no siempre es 7.'])]),
13:('Electroquímica: electrodos y carga',[
 ('Lo que siempre se conserva',[
  'Ánodo: oxidación. Cátodo: reducción, tanto en pilas como en electrólisis.',
  'Los electrones recorren el circuito externo; los iones transportan carga por el electrolito.',
  'El puente salino permite compensar la carga sin convertirse en un cable de electrones.']),
 ('Celda galvánica',[
  'La reacción espontánea en las condiciones dadas puede suministrar trabajo eléctrico.',
  'En una pila en descarga, el ánodo es negativo y el cátodo positivo.',
  r'Con potenciales tabulados de reducción: $E^\circ_{\mathrm{celda}}=E^\circ_{\mathrm{catodo}}-E^\circ_{\mathrm{anodo}}$; no multiplicar potenciales por coeficientes.',
  r'$\Delta G^\circ=-nFE^\circ$ relaciona espontaneidad estándar y potencial estándar.']),
 ('Celda electrolítica',[
  'Una fuente externa impulsa una reacción no espontánea en esas condiciones.',
  'En la celda electrolítica usual, ánodo positivo y cátodo negativo.',
  'En disolución acuosa pueden competir varias semirreacciones; no suponer los productos de una sal fundida.']),
 ('Leyes de Faraday',[
  r'Carga transferida: $Q=It$ para corriente constante; I en amperios y t en segundos.',
  r'Masa ideal depositada: $m=MIt/(zF)$, con z electrones por entidad y eficiencia de corriente del 100 %. ',
  r'$F\approx96485\ \mathrm{C/mol}$ de electrones; si se indica otro redondeo, usarlo consistentemente.',
  'Comparar masas por equivalente exige la misma carga transferida y controlar las eficiencias.'])]),
14:('Carbono e hidrocarburos',[
 ('Estructura del carbono',[
  'Tetravalencia y catenación explican muchas estructuras del carbono en el modelo introductorio.',
  r'Hibridaciones $sp^3$, $sp^2$ y sp: distinguir geometría y enlaces sigma y pi.',
  'Carbono primario, secundario, terciario o cuaternario: contar carbonos directamente enlazados, no hidrógenos.']),
 ('Hidrocarburos alifáticos',[
  r'Alcanos acíclicos saturados: $C_nH_{2n+2}$.',
  r'Alquenos acíclicos con un solo doble enlace: $C_nH_{2n}$.',
  r'Alquinos acíclicos con un solo triple enlace: $C_nH_{2n-2}$.',
  r'Cicloalcanos monocíclicos saturados: $C_nH_{2n}$; esa fórmula por sí sola no demuestra un doble enlace.']),
 ('Aromaticidad e isomería',[
  'Benceno: electrones pi deslocalizados; las formas de resonancia no son moléculas que alternan físicamente.',
  'Regla de Hückel: aplicar a sistemas cíclicos, planos y completamente conjugados que cumplan sus condiciones.',
  'Isomería de cadena, posición o función: misma fórmula molecular y diferente conectividad.',
  'Isomería geométrica: requiere restricción de giro y sustituyentes adecuados; no todo alqueno tiene cis/trans.']),
 ('Nomenclatura',[
  'Elegir la estructura principal según las reglas de la familia, no solo la cadena dibujada más horizontal.',
  'Numerar, localizar insaturaciones y sustituyentes, y comprobar la estructura del nombre obtenido.'])]),
15:('Funciones orgánicas y transformaciones',[
 ('Grupos con oxígeno',[
  'Alcohol: grupo OH unido a carbono saturado; distinguirlo del fenol.',
  'Éter: oxígeno enlazado a dos grupos carbonados.',
  'Aldehído: carbonilo unido al menos a un hidrógeno; cetona: carbonilo unido a dos carbonos.',
  'Ácido carboxílico y éster: reconocer todo el grupo, no solo el carbonilo.']),
 ('Grupos con nitrógeno',[
  'Amina: derivado orgánico del amoníaco; su basicidad depende de estructura y medio.',
  'Amida: nitrógeno unido al carbono de un carbonilo; no confundir con una amina.',
  'Nitrilo: grupo carbono-nitrógeno con triple enlace. Nitroderivado: grupo nitro.']),
 ('Reacciones y condiciones',[
  'Alcohol primario: puede oxidarse a aldehído y después a ácido, según reactivo y condiciones.',
  'Alcohol secundario: oxidación usual a cetona.',
  'Alcohol terciario: resiste oxidantes suaves habituales; no afirmar que nunca reacciona con ningún oxidante.',
  'Esterificación de Fischer: ácido carboxílico y alcohol en equilibrio con éster y agua, bajo catálisis ácida.']),
 ('Biomoléculas y polímeros',[
  'Glúcidos: incluyen monosacáridos como glucosa.',
  'Lípidos: los triglicéridos contienen enlaces éster susceptibles de saponificación.',
  'Proteínas: aminoácidos unidos por enlaces peptídicos, de tipo amida.',
  'Polímeros: distinguir mecanismos de adición y condensación; no todo polímero procede de la misma reacción.'])])}

ADDITIONS={
9:r'''

### Elegir la ley por lo que permanece constante

| Condiciones | Relación | Antes de calcular |
|---|---|---|
| n y T constantes | $P_1V_1=P_2V_2$ | Presiones absolutas |
| n y P constantes | $V_1/T_1=V_2/T_2$ | Temperaturas en kelvin |
| n y V constantes | $P_1/T_1=P_2/T_2$ | Temperaturas en kelvin |
| n constante | $P_1V_1/T_1=P_2V_2/T_2$ | Comprobar las tres variables |

**Ejemplo:** si un gas ideal ocupa 2 L a 1 atm y se comprime a 1 L sin cambiar n ni T, su presión final es 2 atm. Se conserva $PV=2\ \mathrm{L\,atm}$; no se trata de una regla para cualquier calentamiento.
''',
10:r'''

### No confundir solución con disolvente

| Concentración | Numerador | Denominador |
|---|---|---|
| Molaridad | Moles de soluto | Litros de solución |
| Molalidad | Moles de soluto | Kilogramos de disolvente |
| % m/m | Masa de soluto multiplicada por 100 | Masa de solución |
| ppm en masa | Miligramos de soluto | Kilogramos de solución |

**Ejemplo de dilución:** se toman 25 mL de una solución 0,40 mol/L y se lleva a un volumen final de 100 mL. Sin reacción ni pérdida de soluto, $M_f=0{,}40\times25/100=0{,}10\ \mathrm{mol/L}$. Se completa hasta 100 mL; no se añaden 100 mL de agua.

> **Importante:** para sumar volúmenes o sustituir mg/kg por mg/L hace falta una justificación física. La etiqueta «solución acuosa» por sí sola no garantiza esas igualdades exactas.
''',
12:r'''

### Elegir el modelo antes de usar la fórmula

| Situación | Comprobación necesaria |
|---|---|
| Ácido fuerte monoprótico | Concentración y contribución del agua; no confundir fuerza con concentración |
| Ácido débil monoprótico | Verificar si la ionización es pequeña antes de usar la raíz aproximada |
| Ácido con varios protones | Examinar cada etapa de ionización |
| Neutralidad | Igual actividad de hidronio e hidróxido a la temperatura dada |
| Titulación | Separar equivalencia química de cambio de color del indicador |

**Ejemplo:** para HCl 0,0010 mol/L a 25 °C, en la aproximación de solución ideal diluida y contribución despreciable del agua, $[\mathrm{H_3O^+}]\approx10^{-3}\ \mathrm{mol/L}$ y pH aproximadamente 3. No se usa este atajo para una solución extremadamente diluida sin revisar el agua.
''',
14:r'''

### Una fórmula molecular puede admitir familias distintas

| Familia y condición | Fórmula general | Ejemplo |
|---|---|---|
| Alcano acíclico saturado | $C_nH_{2n+2}$ | Etano: $C_2H_6$ |
| Alqueno acíclico con un doble enlace | $C_nH_{2n}$ | Propeno: $C_3H_6$ |
| Alquino acíclico con un triple enlace | $C_nH_{2n-2}$ | Propino: $C_3H_4$ |
| Cicloalcano con un anillo saturado | $C_nH_{2n}$ | Ciclopropano: $C_3H_6$ |

**Comprobación:** propeno y ciclopropano comparten fórmula molecular, pero tienen conectividad y enlaces diferentes. La fórmula sola no permite elegir entre ambos.
''',
15:r'''

### Reconocer el grupo completo

| Familia | Grupo representativo | Ejemplo |
|---|---|---|
| Alcohol | $\mathrm{R{-}OH}$ | Etanol: $\mathrm{CH_3CH_2OH}$ |
| Aldehído | $\mathrm{R{-}CHO}$ | Etanal: $\mathrm{CH_3CHO}$ |
| Cetona | $\mathrm{R{-}CO{-}R'}$ | Propanona: $\mathrm{CH_3COCH_3}$ |
| Ácido carboxílico | $\mathrm{R{-}COOH}$ | Ácido etanoico: $\mathrm{CH_3COOH}$ |
| Éster | $\mathrm{R{-}COO{-}R'}$ | Etanoato de metilo: $\mathrm{CH_3COOCH_3}$ |
| Amida | $\mathrm{R{-}CONH_2}$ | Etanamida: $\mathrm{CH_3CONH_2}$ |

R y R' representan grupos orgánicos en estos ejemplos; para clasificar se revisa la estructura completa. El grupo OH de un ácido carboxílico no convierte ese grupo en un alcohol.
'''}

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  rel=f'quimica/semana{week:02d}/{week}.1/theory.md'
  p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
  raw=p.read_text(encoding='utf8')
  block=next(m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if '│' in m[0])
  backup=ROOT/'build/academic-backup-chemistry-maps'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
  if not backup.exists():shutil.copy2(p,backup)
  q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
  new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]+ADDITIONS.get(week,'')
  p.write_text(new,encoding='utf8')
  fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
  assert fixture.exists();shutil.copy2(p,fixture)
  assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
  evidence.append(dict(level=f'{week}.1',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
  for i,label in enumerate([title]+[x for name,leaves in branches for x in [name]+leaves]):
   preview.append(dict(id=f'quimica_{week}.1_{i}',subject='quimica',concept=f'{week}.1',statement=label,options=[],explanation=''))
  if week in ADDITIONS:
   preview.append(dict(id=f'quimica_{week}.1_table',subject='quimica',concept=f'{week}.1',statement=ADDITIONS[week],options=[],explanation=''))
 assert 1*2/1==2 and .4*25/100==.1
 (ROOT/'build/chemistry-maps-final.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/chemistry-final-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence),tables=len(ADDITIONS))))

if __name__=='__main__':build()
