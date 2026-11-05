"""Correcciones puntuales de explicaciones, sin alterar los bancos de preguntas."""
from review_logical_maps import ROOT
import shutil

def clarify(text, week):
    text=text.replace('de manera infalible en el examen de admisión', 'con un criterio explícito y verificable')
    if week==1:
        text=text.replace('erradicando los "verbos comodín" (*hacer, poner, tener, decir*) y vocablos vagos (*cosa, algo*)',
            'reemplazando verbos o palabras generales cuando el contexto necesite mayor precisión; hacer, poner, tener y decir siguen siendo correctos en usos adecuados')
        text=text.replace('Precisión Léxica y Erradicación de Proformas', 'Precisión Léxica y Uso Contextual de Proformas')
    if week==6:
        text=text.replace('asumidas como verdaderas e incuestionables', 'presentadas como información de trasfondo, que el interlocutor puede cuestionar')
        text=text.replace('presuposición inexpugnable', 'información que el enunciado presenta como trasfondo, no una verdad demostrada')
        text=text.replace('presuposición lingüística incuestionable', 'presuposición lingüística presentada por el enunciado')
        text=text.replace('Suposición previa e incuestionable requerida por la estructura sintáctica de un enunciado.',
            'Información presentada como trasfondo de un enunciado; su proyección depende de la estructura y del contexto y puede cuestionarse.')
        text=text.replace('**Resiste la negación.** Si niegas la oración, la presuposición sigue intacta.',
            'Suele proyectarse bajo negación, pero la estructura y el contexto pueden modificar esa proyección.')
        text=text.replace('**No resiste la negación formal.** Desaparece o muta radicalmente.',
            'Depende del contexto; la cancelabilidad y los indicios comunicativos ayudan a reconocerla. La negación aislada no es una prueba universal.')
        text=text.replace('Presupone que Pedro era el menos capacitado o el más reacio a aprobar.',
            'Presenta su aprobación como menos esperable en el contexto; no demuestra que Pedro tenga menor capacidad.')
        text=text.replace('la presuposición obligatoria es que **existe un proceso inflacionario real en curso**',
            'el enunciado presenta **un proceso inflacionario en curso** como información de trasfondo; no demuestra por sí solo ese hecho')
    if week==7:
        text=text.replace('**Erradicación de redundancias y pleonasmos:** Identificar y suprimir términos que repiten innecesariamente un sema ya expresado en el núcleo oracional (*lapso de tiempo, subir arriba*).',
            '**Revisión de repeticiones:** Identificar cuáles no aportan información y cuáles cumplen una función expresiva o aclaratoria antes de suprimirlas.')
        text=text.replace('Si la respuesta es NO, elimina la palabra redundante de inmediato.',
            'Si no aporta información ni una función expresiva pertinente, puede suprimirse; comprobar primero el contexto.')
        text=text.replace('Sin embargo, en el examen de admisión de Aptitud Académica, salvo que te especifiquen que se analiza una figura poética, todo pleonasmo es clasificado como **vicio de redacción y redundancia a eliminar**.',
            'En una tarea de corrección se evalúa el propósito y el registro del texto: no existe una regla que convierta toda repetición en error por aparecer en un examen.')
        text=text.replace('Dequeísmo vicioso en *"se quejaron de que"* (o construcción defectuosa) y pleonasmo redundante vulgar en *"sus casas de ellos"*.',
            'La construcción *"se quejaron de que"* es correcta: quejarse admite un complemento con de. Revisar por separado si *"sus casas de ellos"* aporta contraste o repite innecesariamente al poseedor; no atribuir ambos casos a dequeísmo.')
        text=text.replace('*Incorrecto:* *"La mayoría de estudiantes desaprobaron el examen"*.',
            '*También admisible:* *"La mayoría de estudiantes desaprobaron el examen"*. Con un complemento plural, este tipo de construcción admite concordancia en singular o plural, según la estructura.')
        text=text.replace('"Hacer un plan" recurre al verbo comodín baúl *hacer*.',
            '"Hacer un plan" es una construcción válida; puede preferirse elaborar o diseñar si ese matiz resulta pertinente.')
    return text

if __name__=='__main__':
    for week in [1,3,6,7]:
        for part in [1,2]:
            rel=f'raz_verbal/semana{week:02d}/{week}.{part}/theory.md'
            p=ROOT/'shared/src/commonMain/composeResources/files/aprender'/rel
            text=clarify(p.read_text(encoding='utf8'),week)
            p.write_text(text,encoding='utf8')
            fixture=ROOT/'shared/src/androidUnitTest/resources/composeResources/rastro.shared.generated.resources/files/aprender'/rel
            shutil.copy2(p,fixture)
