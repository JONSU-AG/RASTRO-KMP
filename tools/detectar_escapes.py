import os
import re
import glob

catalog_dir = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\shared\src\commonMain\kotlin\com\jonsuapps\rastro\data\catalog"
kt_files = glob.glob(os.path.join(catalog_dir, "*.kt"))

invalid_escapes = []

for f in kt_files:
    fname = os.path.basename(f)
    with open(f, "r", encoding="utf-8") as fp:
        lines = fp.readlines()
    for idx, line in enumerate(lines, 1):
        # find backslashes that are not followed by valid escape: t, b, n, r, ', ", \, $, or uXXXX
        matches = list(re.finditer(r'\\(?![tbnrf\'\"\\$]|u[0-9a-fA-F]{4})', line))
        if matches:
            invalid_escapes.append((fname, idx, line.strip()))

print(f"Total lineas con secuencias de escape invalidas: {len(invalid_escapes)}")
for fn, lno, ltxt in invalid_escapes[:30]:
    print(f"{fn}:{lno} -> {ltxt[:110]}")
