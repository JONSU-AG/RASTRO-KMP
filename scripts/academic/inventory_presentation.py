"""Inventario de presencia en fuentes; no certifica renderizado ni precisión académica."""
import collections
import csv
import json
import re
from pathlib import Path

ROOT = Path(__file__).resolve().parents[2]
CONTENT = ROOT / 'shared/src/commonMain/composeResources/files/aprender'
ASSETS = ROOT / 'androidApp/src/main/assets/educational-visuals'
OUT = ROOT / 'docs/aprender/estado'


def inventory():
    resources = json.loads((ASSETS / 'catalog.json').read_text(encoding='utf-8-sig'))['resources']
    rows = []
    referenced = set()
    for file in sorted(CONTENT.rglob('lesson.json')):
        meta = json.loads(file.read_text(encoding='utf-8-sig'))
        text = (file.parent / 'theory.md').read_text(encoding='utf-8-sig')
        questions = json.loads((file.parent / 'questions.json').read_text(encoding='utf-8-sig'))
        maps = len(re.findall(r'^```mermaid\s*$', text, re.M))
        # Count Markdown table separator rows, excluding fenced code.
        prose = re.sub(r'```[^\n]*\n.*?```', '', text, flags=re.S)
        tables = len(re.findall(r'^\s*\|?\s*:?-{3,}:?\s*\|(?:\s*:?-{3,}:?\s*\|?)+\s*$', prose, re.M))
        linked = [v for v in resources if v['subjectId'] == meta['subjectId'] and meta['id'] in v['lessonIds']]
        referenced.update(v['id'] for v in linked)
        posters = [v['poster'] for v in linked]
        models = [v['model'] for v in linked if v.get('model')]
        missing = [p for p in posters + models if not (ASSETS / p).is_file()]
        rows.append(dict(nivel=file.parent.relative_to(CONTENT).as_posix(), titulo=meta['title'],
                         preguntas=len(questions), mapas_en_fuente=maps, tablas_en_fuente=tables,
                         recursos_catalogo=';'.join(v['id'] for v in linked),
                         modelos_catalogo=';'.join(models), archivos_faltantes=';'.join(missing)))
    return rows, resources, referenced


def main():
    rows, resources, referenced = inventory()
    OUT.mkdir(parents=True, exist_ok=True)
    target = OUT / 'INVENTARIO_PRESENTACION_POR_NIVEL.csv'
    with target.open('w', encoding='utf-8-sig', newline='') as stream:
        writer = csv.DictWriter(stream, fieldnames=list(rows[0]))
        writer.writeheader()
        writer.writerows(rows)
    grouped = collections.defaultdict(list)
    for row in rows:
        grouped[row['nivel'].split('/')[0]].append(row)
    md = ['# Presencia de recursos por nivel — 04/11/2026', '',
          'Inventario reproducible de los archivos actuales. No marca ningún tema como aprobado académicamente. '
          'Un mapa o tabla detectado en el texto no prueba que se vea bien en el teléfono.', '',
          '| Materia | Niveles | Preguntas | Con mapa en fuente | Con tabla en fuente | Con recurso del catálogo | Con modelo del catálogo |',
          '|---|---:|---:|---:|---:|---:|---:|']
    for subject, group in sorted(grouped.items()):
        md.append(f"| {subject} | {len(group)} | {sum(r['preguntas'] for r in group)} | "
                  f"{sum(r['mapas_en_fuente'] > 0 for r in group)} | {sum(r['tablas_en_fuente'] > 0 for r in group)} | "
                  f"{sum(bool(r['recursos_catalogo']) for r in group)} | {sum(bool(r['modelos_catalogo']) for r in group)} |")
    md += ['', f"Total: {len(rows)} niveles y {sum(r['preguntas'] for r in rows)} preguntas.", '',
           '[Detalle por nivel](INVENTARIO_PRESENTACION_POR_NIVEL.csv).', '',
           '## Cómo interpretar los datos', '',
           '- Mapas: bloques Mermaid declarados en la teoría. Su sintaxis y relaciones deben validarse con el parser de la aplicación y revisarse académicamente.',
           '- Tablas: separadores Markdown detectados fuera de bloques de código. No se infiere legibilidad ni adaptación al ancho de pantalla.',
           '- Recursos y modelos: vínculos explícitos por materia e ID en educational-visuals/catalog.json. Se comprueba existencia del archivo, no su licencia, contenido, anclaje visible o renderizado.',
           '- Las gráficas programadas en componentes de Kotlin, ilustraciones automáticas y pilotos nativos no se cuentan como archivos del catálogo. Un cero no demuestra ausencia de cualquier gráfico.',
           '- No se modifica una lección solo para llenar una columna: se incorpora un recurso cuando aporta una relación o representación pertinente.', '',
           '## Incidencias mecánicas', '']
    missing = [r for r in rows if r['archivos_faltantes']]
    md += [f"- {r['nivel']}: {r['archivos_faltantes']}" for r in missing] or ['Sin archivos de cartel/modelo faltantes entre los vínculos inventariados.']
    unused = [v['id'] for v in resources if v['id'] not in referenced]
    if unused:
        md += ['', 'Recursos del catálogo sin coincidencia por materia e ID de nivel: ' + ', '.join(unused) + '. Revisar antes de considerarlos disponibles.']
    md += ['', 'Generación: python scripts/academic/inventory_presentation.py. '
           'La revisión académica y visual pendiente se mantiene separada de este inventario.', '']
    (OUT / 'INVENTARIO_PRESENTACION.md').write_text('\n'.join(md), encoding='utf-8')
    print(json.dumps(dict(niveles=len(rows), preguntas=sum(r['preguntas'] for r in rows),
                          con_mapa=sum(r['mapas_en_fuente'] > 0 for r in rows),
                          con_tabla=sum(r['tablas_en_fuente'] > 0 for r in rows),
                          con_recurso_catalogo=sum(bool(r['recursos_catalogo']) for r in rows),
                          niveles_con_archivos_faltantes=len(missing)), ensure_ascii=False))


if __name__ == '__main__':
    main()
