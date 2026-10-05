import os
import re

catalog_dir = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\shared\src\commonMain\kotlin\com\jonsuapps\rastro\data\catalog"

files_modified = 0

for filename in os.listdir(catalog_dir):
    if not filename.endswith(".kt"):
        continue
    filepath = os.path.join(catalog_dir, filename)
    with open(filepath, "r", encoding="utf-8") as f:
        content = f.read()

    # Pattern: options = [ ... ] -> options = listOf( ... )
    # Note: might be single line or multiline
    # We want to replace "options = [" with "options = listOf(" and the matching closing "]" with ")"
    # Let's inspect how options = [ is formatted.
    
    # Let's check if there is options = [
    if "options = [" in content:
        print(f"Fixing {filename}...")
        
        # Regex replacement for options = [ ... ]
        # Carefully match options = [ (anything non greedy) ] followed by , or newline
        def repl(match):
            inner = match.group(1)
            return f"options = listOf({inner})"

        new_content = re.sub(r'options\s*=\s*\[([\s\S]*?)\]\s*,', r'options = listOf(\1),', content)
        if new_content != content:
            with open(filepath, "w", encoding="utf-8") as f:
                f.write(new_content)
            print(f"Updated {filename}")
            files_modified += 1

print(f"Total files updated: {files_modified}")
