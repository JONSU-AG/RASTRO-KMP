import json
import os
import re

json_path = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar\copia rastro react\src\data\bancoPreguntasCepreunsa.json"

if not os.path.exists(json_path):
    print("No se encontró el archivo:", json_path)
    exit(1)

with open(json_path, "r", encoding="utf-8", errors="replace") as f:
    preguntas = json.load(f)

print(f"Total de preguntas en el banco maestro: {len(preguntas)}")

# Patrones de detección
patron_grafico = re.compile(r"(gr[aá]fic[oa]|figur[a]|diagram[a]|imagen|esquem[a]|mostrad[oa]|adjunt[oa]|tabla\s+adjunt)", re.IGNORECASE)
patron_vf = re.compile(r"(\b[VF]\s*[VF]\s*[VF]\b|verdadero|falso)", re.IGNORECASE)
patron_relacionar = re.compile(r"(\bI\s*[-–]\s*|1[a-d]\s*,\s*2[a-d]|relacion[ae]|ordene|columnas)", re.IGNORECASE)

stats = {
    "total": len(preguntas),
    "por_asignatura": {},
    "con_referencia_a_grafico": 0,
    "verdadero_falso": 0,
    "relacionar_ordenar": 0,
    "teoricas_conceptuales": 0,
    "calculo_examen": 0
}

muestras_grafico = []
muestras_vf = []

for idx, p in enumerate(preguntas):
    asig = p.get("asignatura", "Desconocida")
    stats["por_asignatura"][asig] = stats["por_asignatura"].get(asig, 0) + 1
    
    texto = p.get("q", "")
    opciones = " ".join(p.get("options", []))
    
    tiene_grafico = bool(patron_grafico.search(texto))
    es_vf = bool(patron_vf.search(texto) or patron_vf.search(opciones))
    es_relac = bool(patron_relacionar.search(texto) or patron_relacionar.search(opciones))
    
    if tiene_grafico:
        stats["con_referencia_a_grafico"] += 1
        if len(muestras_grafico) < 5:
            muestras_grafico.append({"id": p.get("id"), "asig": asig, "q": texto[:120]})
            
    if es_vf:
        stats["verdadero_falso"] += 1
        if len(muestras_vf) < 3:
            muestras_vf.append({"id": p.get("id"), "asig": asig, "q": texto[:120]})
            
    if es_relac:
        stats["relacionar_ordenar"] += 1

print("\n--- DISTRIBUCIÓN POR ASIGNATURA ---")
for k, v in sorted(stats["por_asignatura"].items(), key=lambda x: -x[1]):
    print(f"  {k}: {v}")

print("\n--- DETECCIÓN DE PATRONES ---")
print(f"  Total con mención a Gráfico / Figura: {stats['con_referencia_a_grafico']}")
print(f"  Total Verdadero / Falso: {stats['verdadero_falso']}")
print(f"  Total Relacionar / Ordenar: {stats['relacionar_ordenar']}")

print("\n--- MUESTRAS CON REFERENCIA A GRÁFICO ---")
for m in muestras_grafico:
    print(f"  [{m['asig']}] {m['id']}: {m['q']}...")

print("\n--- MUESTRAS DE VERDADERO/FALSO ---")
for m in muestras_vf:
    print(f"  [{m['asig']}] {m['id']}: {m['q']}...")
