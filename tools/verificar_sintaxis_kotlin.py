import os

BASE_DIR = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar"

def check_parentheses(file_path):
    with open(file_path, "r", encoding="utf-8") as f:
        text = f.read()

    stack = []
    in_string = False
    in_triple_string = False
    in_char = False
    in_single_line_comment = False
    in_multi_line_comment = False
    
    i = 0
    line_no = 1
    col_no = 1
    errors = []

    while i < len(text):
        c = text[i]

        if c == '\n':
            line_no += 1
            col_no = 1
            in_single_line_comment = False
            i += 1
            continue
        
        # Comentarios
        if not in_string and not in_triple_string and not in_char:
            if not in_multi_line_comment and not in_single_line_comment:
                if text[i:i+2] == '//':
                    in_single_line_comment = True
                    i += 2
                    col_no += 2
                    continue
                elif text[i:i+2] == '/*':
                    in_multi_line_comment = True
                    i += 2
                    col_no += 2
                    continue
            elif in_multi_line_comment:
                if text[i:i+2] == '*/':
                    in_multi_line_comment = False
                    i += 2
                    col_no += 2
                    continue
                i += 1
                col_no += 1
                continue

        if in_single_line_comment or in_multi_line_comment:
            i += 1
            col_no += 1
            continue

        # Strings triples
        if text[i:i+3] == '"""':
            in_triple_string = not in_triple_string
            i += 3
            col_no += 3
            continue

        if in_triple_string:
            i += 1
            col_no += 1
            continue

        # Strings normales
        if c == '"' and not in_char:
            if i > 0 and text[i-1] == '\\':
                pass # escaped
            else:
                in_string = not in_string

        if in_string:
            i += 1
            col_no += 1
            continue

        # Paréntesis y llaves
        if c in '({[':
            stack.append((c, line_no, col_no))
        elif c in ')}]':
            if not stack:
                errors.append(f"Cierre inesperado '{c}' en linea {line_no}:{col_no}")
            else:
                top, t_line, t_col = stack.pop()
                expected = {')': '(', '}': '{', ']': '['}[c]
                if top != expected:
                    errors.append(f"Mapeo erroneo '{top}' (de linea {t_line}) con '{c}' en linea {line_no}:{col_no}")

        i += 1
        col_no += 1

    if in_string:
        errors.append("String sin cerrar al final del archivo")
    if in_triple_string:
        errors.append("String triple sin cerrar al final del archivo")
    if stack:
        for top, l, c in stack[-5:]:
            errors.append(f"Simbolo '{top}' sin cerrar abierto en linea {l}:{c}")

    # Chequeo de secuencias de escape inválidas en strings normales ("...")
    import re
    with open(file_path, "r", encoding="utf-8") as f:
        file_lines = f.readlines()
    for l_idx, l_str in enumerate(file_lines):
        # Ignorar comentarios puros
        stripped = l_str.strip()
        if stripped.startswith("//") or stripped.startswith("/*") or stripped.startswith("*"):
            continue
        # Buscar secuencias como \c, \text, \approx, etc. en strings
        bad_escapes = re.findall(r'\\([^tbnru\'"\\$])', l_str)
        if bad_escapes:
            errors.append(f"Secuencia de escape invalida {bad_escapes} en linea {l_idx+1}")

    return errors

catalog_dir = os.path.join(BASE_DIR, "shared", "src", "commonMain", "kotlin", "com", "jonsuapps", "rastro", "data", "catalog")

print("Validando todos los archivos de catalog/...")
all_ok = True
for fname in sorted(os.listdir(catalog_dir)):
    if fname.endswith(".kt"):
        fpath = os.path.join(catalog_dir, fname)
        errs = check_parentheses(fpath)
        if errs:
            all_ok = False
            print(f"[FAIL] {fname}: {len(errs)} errores:")
            for e in errs[:3]:
                print(f"   -> {e}")
        else:
            print(f"[OK] {fname}")

if all_ok:
    print("\nTODOS LOS CATALOGOS KOTLIN ESTAN 100% VALIDOS, BALANCEADOS Y LIBRES DE ESCAPES INVALIDOS.")

