import re

target = r"shared/src/commonMain/kotlin/com/jonsuapps/rastro/data/catalog/BiologiaPart2.kt"
with open(target, "r", encoding="utf-8") as f:
    lines = f.readlines()

print(f"Analizando {len(lines)} líneas de BiologiaPart2.kt...")
count = 0
for idx, line in enumerate(lines):
    # En Kotlin, escapes validos: \t, \b, \n, \r, \', \", \\, \$, \uXXXX
    # Cualquier otro backslash genera "Unsupported escape sequence"
    bad_escapes = re.findall(r"\\([^tbnru'\"\\$])", line)
    if bad_escapes:
        count += 1
        print(f"L{idx+1}: {bad_escapes} | {line.strip()[:110]}")

print(f"Total de líneas con escapes inválidos: {count}")
