import json
import os

BASE_DIR = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar"
INPUT_FILE = os.path.join(BASE_DIR, "copia rastro react", "src", "data", "bancoPreguntasCepreunsa.json")

def main():
    with open(INPUT_FILE, "r", encoding="utf-8") as f:
        preguntas = json.load(f)

    # 1. Extraer las 14 preguntas aisladas
    aisladas = [p for p in preguntas if p.get("estadoGrafico") == "REQUIERE_GRAFICO_FALTANTE"]
    print(f"Total aisladas con grafico faltante: {len(aisladas)}\n")

    for idx, p in enumerate(aisladas, 1):
        print(f"--- CASO {idx} [{p['id']}] ---")
        print(f"Materia: {p.get('asignatura')} | Semana: {p.get('semana')} | Subtema: {p.get('subtema')}")
        print(f"Pregunta: {p.get('q')}")
        print(f"Opciones: {p.get('options')}")
        print(f"Respuesta correcta: {p.get('answer')}")
        print(f"Explicacion: {p.get('explanation')}")
        print("=" * 60)

    # 2. Resumen de subtemas por asignatura
    subtemas_por_materia = {}
    for p in preguntas:
        asig = p.get("asignatura", "Desconocido")
        sub = p.get("subtema", "General")
        if asig not in subtemas_por_materia:
            subtemas_por_materia[asig] = set()
        subtemas_por_materia[asig].add(sub)

    print("\n--- RESUMEN DE COBERTURA DE SUBTEMAS EN EL BANCO ---")
    for asig, subs in sorted(subtemas_por_materia.items()):
        print(f"* {asig}: {len(subs)} subtemas clasificados ({sum(1 for p in preguntas if p.get('asignatura') == asig)} preguntas)")

if __name__ == "__main__":
    main()
