"""Esquemas de semanas 09–13 y tablas de contraste; sin alterar preguntas."""
import re,json,shutil,hashlib
from review_logical_maps import make_map,ROOT

MAPS={
9:('Estética, experiencia y arte',[
 ('Experiencia y juicio',[
  'Distinguir experiencia estética, juicio sobre una obra y uso práctico de un objeto.',
  'En Kant, el desinterés no significa apatía ni ausencia de placer.',
  'La pretensión de universalidad del juicio de gusto no equivale a una encuesta donde todos coinciden.']),
 ('Categorías estéticas',[
  'Bello y sublime reciben interpretaciones distintas según el autor; no reducir toda belleza a una sola proporción.',
  'Lo trágico, lo cómico, lo feo y lo grotesco permiten describir experiencias y formas diferentes.',
  'Reconocer una categoría exige examinar la obra y el contexto, no solo una reacción agradable o desagradable.']),
 ('Concepciones del arte',[
  'Platón y Aristóteles no atribuyen exactamente el mismo sentido y valoración a la mímesis.',
  'Kant, Hegel y Heidegger plantean problemas diferentes; no convertir sus conceptos en una definición única.',
  'Una teoría del arte debe distinguirse de una preferencia individual por una obra.']),
 ('Arte y transformaciones históricas',[
  'Benjamin: analizar cómo la reproducción técnica modifica condiciones de experiencia y recepción.',
  'Adorno: examinar la crítica de la industria cultural sin reducirla a que toda obra popular carece de valor.',
  'Danto: el fin del arte no significa que dejen de producirse obras; se refiere a una determinada narrativa histórica.'])]),
10:('Ética, acción y responsabilidad',[
 ('Moral y reflexión ética',[
  'Moral puede referirse a normas, prácticas y valoraciones; ética también tiene usos diversos entre autores.',
  'Distinguir describir una costumbre de justificarla moralmente.',
  'No definir toda moral como particular y toda ética como un sistema universal ya aceptado.']),
 ('Analizar una acción',[
  'Examinar intención, medios, contexto, consecuencias y alternativas.',
  'Distinguir capacidad de decidir, conocimiento de la situación y responsabilidad.',
  'Una buena intención no resuelve por sí sola toda evaluación de los medios o resultados.']),
 ('Enfoques éticos',[
  'Aristóteles: virtud, deliberación práctica y vida lograda; no reducirlo al cálculo de consecuencias de cada acto.',
  'Epicuro: placer y ausencia de perturbación; no confundir su propuesta con cualquier exceso.',
  'Utilitarismo: valorar consecuencias mediante una concepción del bienestar; no equivale simplemente a satisfacer a una mayoría.',
  'Kant: deber, máximas y respeto por las personas; no tratar a alguien meramente como medio.']),
 ('Dilemas y bioética',[
  'Un dilema exige explicitar el conflicto y los supuestos, no memorizar una respuesta universal.',
  'Autonomía, beneficencia, no maleficencia y justicia orientan un marco de análisis, no un algoritmo que resuelva cualquier caso.',
  'Comparar razones y límites de cada enfoque sin convertir un ejemplo hipotético en una indicación clínica.'])]),
11:('Valoración y teorías del valor',[
 ('El acto de valorar',[
  'Distinguir sujeto que valora, objeto o situación valorados y criterio de valoración.',
  'Una valoración puede integrar conocimiento, afecto y voluntad sin ser idéntica a un dato descriptivo.',
  'Examinar cómo se justifican y discuten los juicios de valor.']),
 ('Problemas axiológicos',[
  'Polaridad, grados y jerarquía son categorías de análisis; su interpretación depende de la teoría.',
  'No presentar infinitud u objetividad como propiedades indiscutidas de todo valor.',
  'Separar qué se considera bueno de la pregunta por la existencia y fundamento de los valores.']),
 ('Posiciones',[
  'Subjetivismo: investigar el papel de deseos, afectos o actitudes del sujeto.',
  'Objetivismo: investigar la independencia del valor respecto de esas actitudes.',
  'Frondizi: considerar la relación entre sujeto, objeto y situación, sin reducirla a una preferencia aislada.']),
 ('La propuesta de Scheler',[
  'La jerarquía de Scheler distingue lo agradable, valores vitales, espirituales y religiosos.',
  'El orden pertenece a su propuesta filosófica; no se presenta como una escala universal demostrada.',
  'Reconocer una teoría y sus argumentos no obliga al estudiante a adoptar sus compromisos.'])]),
12:('Poder, legitimidad y justicia',[
 ('Preguntas políticas',[
  'Distinguir origen histórico, funcionamiento del poder y justificación de la autoridad.',
  'Las explicaciones naturalistas, teológicas y contractualistas no son versiones idénticas de una misma tesis.',
  'Un contrato social puede ser un recurso normativo o hipotético; no supone que todos hayan firmado un documento histórico.']),
 ('Contratos y proyectos',[
  'Hobbes: examinar seguridad, autoridad y condiciones de la paz.',
  'Locke: examinar derechos, consentimiento y límites del gobierno.',
  'Rousseau: distinguir voluntad general de la simple suma de intereses privados; evitar reducirlo al eslogan del buen salvaje.']),
 ('Justicia y comunidad',[
  'Rawls: posición original y velo de ignorancia como recursos de justificación, no amnesia real de los participantes.',
  'El principio de diferencia se interpreta dentro de una propuesta con libertades básicas e igualdad equitativa de oportunidades.',
  'Sandel y Taylor: situar las críticas al individualismo y las cuestiones comunitarias sin afirmar que coinciden en todo.']),
 ('Crítica y acción',[
  'Arendt: totalitarismo, acción y espacio público; banalidad del mal no significa daño insignificante ni exención de responsabilidad.',
  'Maquiavelo: examinar las relaciones entre acción política, virtù y fortuna, sin atribuirle cualquier justificación del engaño.',
  'Comparar posiciones exige sus argumentos y contexto; una etiqueta política no sustituye la explicación.'])]),
13:('Condición humana: preguntas y perspectivas',[
 ('Origen y tipos de explicación',[
  'La evolución humana se investiga mediante evidencia biológica, fósil y genética.',
  'Las explicaciones religiosas de creación no equivalen siempre a fijismo; distinguir sus compromisos de las hipótesis científicas.',
  'Compartir ascendencia con otros primates no significa descender de los chimpancés que viven hoy.']),
 ('Interpretaciones filosóficas',[
  'Aristóteles: la racionalidad ocupa un papel central en su comprensión de lo humano.',
  'Scheler: atender a su interpretación del espíritu y apertura al mundo sin confundirla con una conclusión de biología experimental.',
  'Cassirer: las formas simbólicas orientan su interpretación; no afirma solo que las personas dibujen signos.',
  'Marx: situar trabajo y praxis en relaciones sociales e históricas.']),
 ('Historia y existencia',[
  'Dilthey y Ortega y Gasset: reconocer diferencias entre sus propuestas sobre vida e historia.',
  'Sartre: la existencia precede a la esencia en su propuesta; no atribuir esta tesis a toda filosofía.',
  'Comparar perspectivas sin convertir una caracterización parcial en definición definitiva de cada persona.']),
 ('Dignidad y relaciones',[
  'Kant: respetar a la persona como fin y no meramente como medio.',
  'No identificar dignidad con precio, utilidad económica o capacidad de producir.',
  'Distinguir explicación del origen, descripción de capacidades y justificación del trato debido a las personas.'])])}

TABLES={
9:'''\n\n### Identificar qué se está afirmando sobre el arte

| Referencia | Idea orientativa | Interpretación que debe evitarse |
|---|---|---|
| Kant | Desinterés y juicio de gusto | Desinterés como indiferencia o ausencia de placer |
| Benjamin | Reproducción técnica y experiencia | Toda reproducción carece automáticamente de interés artístico |
| Adorno | Crítica de la industria cultural | Un criterio mecánico para despreciar cualquier gusto popular |
| Danto | Transformación de una narrativa histórica del arte | Después de cierta fecha ya no se producen obras |

Los conceptos se estudian dentro de la propuesta de cada autor; la tabla no ofrece una definición universal de arte.
''',
10:'''\n\n### Comparar razones morales

| Enfoque | Pregunta orientativa | Precaución |
|---|---|---|
| Virtud | ¿Qué carácter y deliberación expresa la acción? | No reducir toda la propuesta a un resultado aislado |
| Deber | ¿La máxima y el trato a las personas son justificables? | Una buena consecuencia no resuelve cualquier objeción |
| Consecuencias | ¿Qué resultados cuentan y para quién? | No confundir bienestar agregado con simple mayoría |
| Análisis de dilemas | ¿Qué obligaciones o valores entran en conflicto? | Explicitar alternativas y supuestos antes de decidir |

Estos enfoques pueden considerar intenciones, reglas y resultados. Lo que cambia es su papel en la justificación, no que cada corriente ignore todo lo demás.
''',
11:'''\n\n### Leer la jerarquía como propuesta de Scheler

| Nivel, de menor a mayor en su propuesta | Orientación |
|---|---|
| Agradable y desagradable | Valores sensibles |
| Vitales | Valores de la vida |
| Espirituales | Entre ellos, valores estéticos, jurídicos y del conocimiento |
| Religiosos | Lo sagrado y lo profano |

**Importante:** se describe una jerarquía filosófica concreta. No es una clasificación impuesta al estudiante ni una medición experimental de superioridad entre creencias.
''',
12:'''\n\n### No confundir poder, legitimidad y justicia

| Pregunta | Qué se examina | Qué no basta |
|---|---|---|
| ¿Quién puede imponer una decisión? | Poder efectivo | Que exista fuerza no demuestra legitimidad |
| ¿Por qué debería obedecerse? | Justificación de la autoridad | Una descripción histórica no es por sí sola una razón normativa |
| ¿Cómo distribuir derechos y oportunidades? | Justicia de instituciones | Una ventaja agregada no resuelve toda desigualdad |
| ¿Qué significa participar políticamente? | Acción, deliberación y espacio común | Reducir toda política a obedecer o mandar |
''',
13:'''\n\n### Separar niveles de una pregunta sobre lo humano

| Pregunta | Tipo de investigación | Precaución |
|---|---|---|
| ¿Cómo evolucionó nuestra especie? | Evidencia biológica e histórica | No convertir una intuición filosófica en prueba fósil |
| ¿Qué papel tienen lenguaje y símbolos? | Interpretación de capacidades y cultura | No reducir a Cassirer a un simple listado de signos |
| ¿Cómo intervienen trabajo e historia? | Análisis social y filosófico | Identificar la propuesta de cada autor |
| ¿Por qué respetar a una persona? | Justificación ética | No deducir dignidad del precio o productividad |

Una explicación sobre el origen no decide por sí sola cómo debemos tratar a otras personas.
'''}

def build():
 evidence=[];preview=[]
 for week,(title,branches) in MAPS.items():
  for part in [1,2]:
   rel=f'filosofia/semana{week:02d}/{week}.{part}/theory.md'
   p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
   raw=p.read_text(encoding='utf8');q=p.with_name('questions.json');digest=hashlib.sha256(q.read_bytes()).hexdigest()
   blocks=[m for m in re.finditer(r'```[^\n]*\n.*?```',raw,re.S) if '│' in m[0]]
   assert len(blocks)==1,rel
   block=blocks[0];new=raw[:block.start()]+make_map(title,branches)+raw[block.end():]
   if part==1:new+=TABLES[week]
   backup=ROOT/'build/academic-backup-philosophy-maps-09-13'/rel;backup.parent.mkdir(parents=True,exist_ok=True)
   if not backup.exists():shutil.copy2(p,backup)
   p.write_text(new,encoding='utf8')
   fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
   assert fixture.exists();shutil.copy2(p,fixture)
   assert hashlib.sha256(q.read_bytes()).hexdigest()==digest
   evidence.append(dict(level=f'{week}.{part}',nodes=1+sum(1+len(x) for _,x in branches),questionsHash=digest))
   for i,label in enumerate([title]+[v for name,leaves in branches for v in [name]+leaves]):
    preview.append(dict(id=f'filosofia_{week}.{part}_{i}',subject='filosofia',concept=f'{week}.{part}',statement=label,options=[],explanation=''))
   if part==1:preview.append(dict(id=f'filosofia_{week}.{part}_table',subject='filosofia',concept=f'{week}.{part}',statement=TABLES[week],options=[],explanation=''))
 (ROOT/'build/philosophy-maps-09-13-review.json').write_text(json.dumps(evidence,ensure_ascii=False,indent=2),encoding='utf8')
 (ROOT/'build/philosophy-maps-09-13-preview.json').write_text(json.dumps(preview,ensure_ascii=False),encoding='utf8')
 print(json.dumps(dict(maps=len(evidence),nodes=sum(x['nodes'] for x in evidence),tables=len(TABLES))))

if __name__=='__main__':build()
