import os
import glob
import re

base_dir = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\CONTENIDO_PEDAGOGICO"

# Find all md files
files = glob.glob(os.path.join(base_dir, "**", "*.md"), recursive=True)
md_files = [f for f in files if not f.endswith("CHECKLIST_PROGRESO.md") and not "OBRAS" in f]
obras_files = [f for f in files if "OBRAS" in f and not f.endswith("CHECKLIST_OBRAS.md")]

print(f"Total pedagogical topic files: {len(md_files)}")
print(f"Total literature work files: {len(obras_files)}")

# Group by directory
groups = {}
for f in md_files:
    rel = os.path.relpath(f, base_dir)
    parts = rel.split(os.sep)
    if len(parts) >= 2:
        cat = parts[0] + " / " + parts[1]
    else:
        cat = parts[0]
    groups[cat] = groups.get(cat, 0) + 1

for cat, count in sorted(groups.items()):
    print(f"{cat}: {count} files")
