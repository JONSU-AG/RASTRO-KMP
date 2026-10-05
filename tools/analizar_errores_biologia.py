import re
import os

BASE_DIR = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar"
BIO1 = os.path.join(BASE_DIR, "shared", "src", "commonMain", "kotlin", "com", "jonsuapps", "rastro", "data", "catalog", "BiologiaPart1.kt")
BIO2 = os.path.join(BASE_DIR, "shared", "src", "commonMain", "kotlin", "com", "jonsuapps", "rastro", "data", "catalog", "BiologiaPart2.kt")

def check_file(path, name):
    with open(path, "r", encoding="utf-8") as f:
        lines = f.readlines()
    print(f"\n=== ANALIZANDO {name} ({len(lines)} lineas) ===")
    
    # Buscar patrones sospechosos
    for idx, line in enumerate(lines, 1):
        if "admissionTip = null" in line:
            print(f"Linea {idx}: admissionTip = null")
        if "challenges = emptyList()" in line:
            print(f"Linea {idx}: challenges = emptyList()")

check_file(BIO1, "BiologiaPart1.kt")
check_file(BIO2, "BiologiaPart2.kt")
