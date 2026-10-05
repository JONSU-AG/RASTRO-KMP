import re
import os

BASE_DIR = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar"
BIO1_PATH = os.path.join(BASE_DIR, "shared", "src", "commonMain", "kotlin", "com", "jonsuapps", "rastro", "data", "catalog", "BiologiaPart1.kt")
BIO2_PATH = os.path.join(BASE_DIR, "shared", "src", "commonMain", "kotlin", "com", "jonsuapps", "rastro", "data", "catalog", "BiologiaPart2.kt")

def fix_file_conceptos(file_path, file_name):
    with open(file_path, "r", encoding="utf-8") as f:
        lines = f.readlines()

    fixed_lines = []
    i = 0
    fixed_count = 0

    while i < len(lines):
        line = lines[i]
        
        # Si la línea siguiente es admissionTip = ...
        if i + 1 < len(lines) and lines[i+1].strip().startswith("admissionTip ="):
            stripped = line.strip()
            # Si la línea actual es un string dentro de conceptosClave sin cerrar
            if stripped.startswith('"') and (not stripped.endswith('",') and not stripped.endswith('"')):
                # Limpiar trailing comma si hubiera
                s = stripped
                if s.endswith(','):
                    s = s[:-1]
                s += '"'
                indent = line[:len(line) - len(line.lstrip())]
                fixed_lines.append(f"{indent}{s}\n")
                fixed_lines.append("                ),\n")
                fixed_count += 1
                i += 1
                continue
            # O si la línea actual termina en coma o string pero falta cerrar el listOf
            elif stripped.startswith('"') and stripped.endswith('",'):
                s = stripped[:-1] # quitar coma
                indent = line[:len(line) - len(line.lstrip())]
                fixed_lines.append(f"{indent}{s}\n")
                fixed_lines.append("                ),\n")
                fixed_count += 1
                i += 1
                continue

        fixed_lines.append(line)
        i += 1

    with open(file_path, "w", encoding="utf-8") as f:
        f.writelines(fixed_lines)
    print(f"[OK] {file_name}: {fixed_count} cierres de conceptosClave reparados.")

if __name__ == "__main__":
    fix_file_conceptos(BIO1_PATH, "BiologiaPart1.kt")
    fix_file_conceptos(BIO2_PATH, "BiologiaPart2.kt")
