"""Read-only structural audit; an unflagged lesson is NOT academically certified."""
import argparse, collections, json, re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
CONTENT = ROOT / 'shared/src/commonMain/composeResources/files/aprender'
PATTERNS = {
    'enunciado_generico': ('marco conceptual desarrollado', 'analytically and grammatically correct regarding the lesson theory'),
    'alternativa_generica': ('principio formal deducido', 'grammatical structure strictly follows standard pre-university english syntax', 'la correspondencia directa descrita'),
    'resolucion_generica': ('se deduce directamente del desarrollo teórico formal',
        'resolución conforme a las leyes y métodos expuestos',
        'respuesta justificada por el marco teórico', 'directly deduced from the theoretical foundations'),
}

def audit():
    subjects = collections.defaultdict(collections.Counter)
    lessons = []
    for path in sorted(CONTENT.rglob('questions.json')):
        relative = path.relative_to(CONTENT)
        subject = relative.parts[0]
        stats = subjects[subject]
        stats['niveles'] += 1
        issues = []
        try:
            questions = json.loads(path.read_text(encoding='utf-8-sig'))
        except (ValueError, OSError) as error:
            lessons.append({'nivel': str(relative.parent), 'error_lectura': str(error)})
            stats['errores_lectura'] += 1
            continue
        seen = set()
        for q in questions:
            stats['preguntas'] += 1
            flags = []
            fields = {'enunciado_generico': q.get('statement', ''),
                'alternativa_generica': ' '.join(q.get('options', [])),
                'resolucion_generica': q.get('explanation', '')}
            for flag, needles in PATTERNS.items():
                if any(n in fields[flag].lower() for n in needles):
                    flags.append(flag)
            opts = q.get('options', [])
            if q.get('statement','').strip().lower()in('complete the sentence correctly:', 'complete the following sentence:', 'identify the correct option:'):
                flags.append('consigna_sin_contexto')
            if q.get('type', 'MULTIPLE_CHOICE') == 'MULTIPLE_CHOICE':
                if not isinstance(q.get('correctIndex'), int) or not 0 <= q.get('correctIndex', -1) < len(opts):
                    flags.append('indice_fuera_de_rango')
                if len(set(x.strip() for x in opts)) != len(opts):
                    flags.append('alternativas_duplicadas')
            if q.get('id') in seen:
                flags.append('id_duplicado')
            seen.add(q.get('id'))
            if not q.get('explanation', '').strip():
                flags.append('sin_explicacion')
            if flags:
                stats['preguntas_con_alerta'] += 1
                issues.append({'id': q.get('id'), 'alertas': flags,
                    'enunciado': q.get('statement', ''), 'explicacion': q.get('explanation', '')})
                stats.update(flags)
        if issues:
            stats['niveles_con_alerta'] += 1
        lessons.append({'nivel': relative.parent.as_posix(), 'preguntas': len(questions),
            'estado': 'requiere_revision' if issues else 'sin_alertas_estructurales_no_certificado',
            'incidencias': issues})
    return {'alcance': 'Solo recursos nuevos; no ejecuta ni modifica Android/Firebase. No certifica hechos o claves.',
        'materias': {key:dict(value) for key,value in sorted(subjects.items())}, 'niveles':lessons}

if __name__ == '__main__':
    parser = argparse.ArgumentParser()
    parser.add_argument('--output', default='docs/aprender/estado/AUDITORIA_ESTRUCTURAL_TOTAL.json')
    args = parser.parse_args()
    report = audit()
    target = ROOT / args.output
    target.parent.mkdir(parents=True, exist_ok=True)
    target.write_text(json.dumps(report, ensure_ascii=False, indent=2)+'\n', encoding='utf-8')
    header = ['# Estado estructural de todos los recursos de Aprender', '',
        'Este informe se regenera con `python scripts/academic/audit_readiness.py`. Una ausencia de alertas automáticas no valida el contenido ni la respuesta. No incluye los catálogos Kotlin legacy.', '',
        '| Materia | Niveles | Preguntas | Preguntas con alerta | Resolución genérica |',
        '|---|---:|---:|---:|---:|']
    for subject, row in report['materias'].items():
        header.append(f"| {subject} | {row['niveles']} | {row['preguntas']} | {row.get('preguntas_con_alerta',0)} | {row.get('resolucion_generica',0)} |")
    header += ['', 'Las incidencias incluyen enunciado y explicación en el JSON contiguo para revisión por nivel. No se sustituyen preguntas automáticamente ni se ocultan los errores al usuario.']
    target.with_suffix('.md').write_text('\n'.join(header)+'\n',encoding='utf-8')
    print(json.dumps({'materias':len(report['materias']), 'niveles':len(report['niveles']),
        'preguntas':sum(r['preguntas'] for r in report['materias'].values()),
        'con_alerta':sum(r.get('preguntas_con_alerta',0) for r in report['materias'].values())}))
