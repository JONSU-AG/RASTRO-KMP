"""Repair demographic interpretation and agricultural comparisons in four theories."""
import re,json,hashlib,shutil
from review_logical_maps import ROOT,make_map

demography=[
 ('Leer la fuente',[
  'Identificar población, territorio y año; una forma sin fecha no describe el presente.',
  'El eje vertical agrupa edades; cada lado representa la distribución por sexo indicada en la fuente.',
  'Comprobar si las barras usan personas o porcentajes antes de comparar dos gráficos.']),
 ('Interpretar la forma',[
  'Una base relativamente ancha muestra mayor peso de cohortes jóvenes en esa población.',
  'Entrantes y salientes pueden reflejar nacimientos, supervivencia y migraciones de distintas cohortes.',
  'La silueta no permite calcular por sí sola una tasa exacta de natalidad ni esperanza de vida.']),
 ('Comparar modelos',[
  'Expansiva, estacionaria y constrictiva son descripciones generales, no etiquetas permanentes de países.',
  'La forma nacional puede diferir de la de una ciudad o región del mismo año.',
  'Una base estrecha no demuestra por sí sola que el total ya esté disminuyendo.']),
 ('Relacionar sin confundir indicadores',[
  'Los grupos de edad de una razón demográfica deben definirse antes de calcularla.',
  'No identificar automáticamente el tramo demográfico 15–64 con la PET de las estadísticas laborales peruanas.',
  'Una estructura favorable de edades ofrece posibilidades; el empleo y el bienestar no aparecen automáticamente.'])]

pyramid_table='''### Comparar formas sin convertirlas en diagnósticos

| Modelo general | Qué suele observarse | Qué no prueba por sí solo |
|---|---|---|
| Expansivo | Base relativamente ancha y mayor peso de edades jóvenes | Una tasa exacta o el nivel económico de un país |
| Estacionario | Perfil relativamente equilibrado entre varios grupos | Crecimiento exactamente cero o ausencia de migración |
| Constrictivo o regresivo | Base más estrecha que grupos intermedios | Que el total ya disminuya o que todas las localidades envejezcan igual |

**Importante:** los modelos ayudan a describir. Una pirámide real necesita cifras, escala, año y fuente. No se asigna al Perú una forma «actual» a partir de un dibujo sin datos.
'''

population_details='''### Bono demográfico: oportunidad condicionada

La relación entre grupos de edad puede reducir la proporción de dependientes demográficos respecto del grupo usado como referencia. Para calcularla, declara primero los intervalos de edad; por ejemplo, algunos análisis comparan menores de 15 y personas de 65 o más con el grupo de 15–64. Esa convención no afirma que toda persona de un grupo trabaje o dependa económicamente de otra.

Una estructura favorable puede facilitar mejoras de ahorro, educación o productividad si existen condiciones para aprovecharla. **No garantiza empleo ni un aumento automático del bienestar.** La duración de esa oportunidad requiere datos y proyecciones con fecha, no una fecha de término universal.

### Edad, participación laboral y empleo

- **PET:** es una definición estadística de población en edad de trabajar. En las estadísticas laborales peruanas citadas por el INEI se considera a quienes tienen **14 años o más**; no confundirla con el tramo demográfico 15–64 ni con una autorización individual para trabajar.
- **PEA:** reúne población ocupada y desocupada conforme a los criterios de la encuesta y su periodo de referencia.
- **Ocupación y desocupación:** no basta preguntar si alguien tiene ingresos. Deben aplicarse los criterios de trabajo, búsqueda y disponibilidad de la fuente.
- **No PEA:** no se decide solo por ser estudiante, persona jubilada o por una condición de discapacidad. Una persona de esas categorías puede participar en el mercado laboral; hay que comprobar su situación según la encuesta.

**Importante:** empleo adecuado, subempleo e informalidad son conceptos distintos. Una cifra requiere periodo, ámbito y definición; no se deduce de la forma de la pirámide.
'''

agriculture=[
 ('Costa',[
  'En espacios áridos, el acceso y manejo del agua condicionan los cultivos.',
  'Coexisten agricultura familiar y empresarial; no toda parcela usa riego tecnificado.',
  'Uva, palta o espárrago son ejemplos de cultivos comerciales, no una lista exclusiva de la costa.']),
 ('Andes',[
  'Coexisten secano y riego; no toda la agricultura andina depende solo de las lluvias.',
  'Papa, maíz y quinua permiten estudiar relaciones entre cultivo, clima y altitud.',
  'Comparar manejo local y tecnologías concretas sin calificar toda una región como rudimentaria.']),
 ('Amazonía',[
  'Distinguir laderas, valles y llanuras con condiciones de suelo y drenaje diferentes.',
  'Café, cacao, yuca y plátano son ejemplos; su cultivo exige condiciones que deben precisarse.',
  'No describir toda la producción amazónica como roza y quema ni como monocultivo exportador.']),
 ('Criterios para comparar',[
  'Separar régimen de agua, tecnología, tamaño de unidad y destino de la producción.',
  'Agricultura familiar no es sinónimo de autoconsumo ni de ausencia de tecnología.',
  'La región por sí sola no prueba sostenibilidad, rentabilidad o impacto de una práctica.'])]

agriculture_table='''### Comparar prácticas, no estereotipos regionales

| Criterio | Qué debe identificarse | Precisión |
|---|---|---|
| Agua | Riego, secano, disponibilidad y manejo | Riego no significa necesariamente goteo |
| Organización | Trabajo familiar, empresa, asociación y escala | Una unidad familiar puede vender su producción |
| Producción y destino | Cultivo, mercado y uso local | Un ejemplo regional no es una exclusividad |

**Importante:** una descripción regional resume tendencias; no caracteriza todas las unidades agropecuarias. Para usar porcentajes o rankings, consulta su fecha, población estudiada y fuente.
'''

regional_details='''1. **Agricultura costera:** en muchos valles el riego es decisivo por la aridez. Coexisten unidades familiares, asociaciones y empresas de distinta escala. Hay producción para el mercado interno y para exportación; goteo y aspersión son técnicas, no atributos de toda la costa. Uva, palta, espárrago y caña son ejemplos de cultivos comerciales.
2. **Agricultura andina:** presenta sistemas bajo secano y riego, con prácticas y tecnologías diversas. Papa, maíz y quinua ilustran parte de su producción; también hay cadenas comerciales y valles con infraestructura. Heladas, granizo y sequía son riesgos que dependen de las condiciones del lugar y del cultivo.
3. **Agricultura amazónica:** las condiciones varían entre laderas, valles y llanuras. Café, cacao, yuca y plátano permiten estudiar sistemas diferentes, sin asignar cada producto de forma exclusiva a una subregión. La producción de terrenos próximos a ríos debe considerar crecidas y drenaje. La roza y quema es una práctica que debe analizarse por sus efectos, no la definición de toda la agricultura amazónica.
'''

def build():
 evidence=[];preview=[]
 for week in [11,12]:
  for part in [1,2]:
   rel=f'geografia/semana{week:02d}/{week}.{part}/theory.md';p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');digest=hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()
   backup=ROOT/'build/academic-backup-geography-maps-11-12'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   branches,title,table=(demography,'Leer una pirámide de población',pyramid_table) if week==11 else (agriculture,'Agricultura: sistemas y criterios de comparación',agriculture_table)
   if week==11:
    a=raw.index('### 3.3. Estructura Poblacional: Pirámides de Edades y Bono Demográfico');b=raw.index('\n---',a)
    new=raw[:a]+'''### 3.3. Estructura poblacional: pirámides de edades y bono demográfico

Una pirámide representa la distribución por edad y sexo de una población en una fecha. Se lee como un gráfico de barras enfrentadas, no como una silueta que diagnostica automáticamente al país.

'''+make_map(title,branches)+'\n\n'+table+'\n'+population_details+raw[b:]
   else:
    matches=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if 'AGRICULTURA EN EL PERÚ' in m[0]]
    assert len(matches)==1,rel
    m=matches[0];new=raw[:m.start()]+make_map(title,branches)+'\n\n'+table+raw[m.end():]
    a=new.index('1. **Agricultura Costera:**');b=new.index('\n---',a)
    new=new[:a]+regional_details+new[b:]
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   shutil.copy2(p,fixture);assert hashlib.sha256(p.with_name('questions.json').read_bytes()).hexdigest()==digest
   evidence.append(dict(level=f'{week}.{part}',questionsHash=digest))
   for i,label in enumerate([title]+[x for n,ls in branches for x in [n]+ls]):
    preview.append(dict(id=f'geo{week}_{part}_{i}',subject='geografia',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   preview.append(dict(id=f'geo{week}_{part}_table',subject='geografia',concept=f'{week}.{part}',statement=table,options=[],explanation=''))
 (ROOT/'build/geography-maps-11-12-review.json').write_text(json.dumps(evidence,indent=2),encoding='utf8')
 (ROOT/'build/geography-maps-11-12-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print('4 theories; 4 new maps; 68 nodes; 4 tables')

if __name__=='__main__':build()
