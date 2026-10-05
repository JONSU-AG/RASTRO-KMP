import json
import os
import re
import shutil

BASE_DIR = r"c:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar"
INPUT_FILE = os.path.join(BASE_DIR, "copia rastro react", "src", "data", "bancoPreguntasCepreunsa.json")
BACKUP_FILE = os.path.join(BASE_DIR, "copia rastro react", "src", "data", "bancoPreguntasCepreunsa_backup.json")
CHECKLIST_FILE = os.path.join(BASE_DIR, "CHECKLIST_CLASIFICACION_BANCO_4600.md")
ANDROID_ASSETS_FILE = os.path.join(BASE_DIR, "androidApp", "src", "main", "assets", "bancoPreguntasCepreunsa.json")

from collections import Counter

def normalize_text(text):
    if not text:
        return ""
    t = str(text)
    
    # 1. Limpieza universal de artefactos intercalados por OCR/PDF (ej. 'óEónó óuónó' -> 'En uno')
    # Si un caracter no alfanumérico/puntuación estándar se repite más de 6% del texto total, es un delimitador falso
    counts = Counter(t)
    for char, count in counts.most_common(5):
        if char not in " abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789.,:;()[]{}/*-+_?¿!¡\n\r\t\"'":
            if count > max(3, len(t) * 0.05):
                double_char = char + char
                t = t.replace(double_char, "___DOUBLE_ACCENT___")
                t = t.replace(char, "")
                t = t.replace("___DOUBLE_ACCENT___", char)
    
    # 2. Arreglar errores comunes de encoding (mojibake)
    replacements = {
        "?o": '"', "??": '"', "?": '"',
        "Ǹ": "é", "ǭ": "á",
        "ñ": "ñ", "Ñ": "Ñ"
    }
    for k, v in replacements.items():
        t = t.replace(k, v)
    
    # Limpiar dobles espacios accidentales
    t = re.sub(r"[ \t]+", " ", t)
    return t.strip()


# Patrones de detección de gráficos rotos / dependientes (Unicode seguro)
RE_GRAFICO_ROTO = re.compile(
    r"(del\s+gr[a\u00e1]fico\s+(mostrado|adjunto|siguiente)|"
    r"en\s+el\s+gr[a\u00e1]fico\s+(mostrado|adjunto|siguiente)|"
    r"de\s+la\s+figura\s+(mostrada|adjunta|siguiente)|"
    r"en\s+la\s+figura\s+(mostrada|adjunta|siguiente)|"
    r"seg[u\u00fa]n\s+(la\s+figura|el\s+gr[a\u00e1]fico|el\s+esquema)|"
    r"calcule\s+el\s+[a\u00e1]rea\s+sombreada|"
    r"de\s+la\s+siguiente\s+ecuaci[o\u00f3]n\s*:\s*$|"
    r"mostrad[oa]s?\s+en\s+la\s+figura|"
    r"en\s+el\s+diagrama\s+(mostrado|adjunto))",
    re.IGNORECASE
)

# Patrones para gráficos autoconstruibles por el estudiante
RE_AUTOCONSTRUIBLE = re.compile(
    r"(en\s+un\s+tri[a\u00e1]ngulo|"
    r"sobre\s+una\s+(l[i\u00ed]nea\s+)?recta\s+se\s+toman|"
    r"se\s+tiene\s+un\s+pol[i\u00ed]gono|"
    r"en\s+un\s+trapecio|"
    r"un\s+bloque\s+de\s+\d+.*plano\s+inclinado|"
    r"se\s+lanza\s+un\s+proyectil\s+con\s+un\s+[a\u00e1]ngulo|"
    r"un\s+m[o\u00f3]vil\s+parte\s+del\s+reposo)",
    re.IGNORECASE
)

# Patrón de Verdadero / Falso
RE_VF = re.compile(
    r"(\b[VF]{3,5}\b|"
    r"verdadero\s*\([vV]\)\s*o\s*falso\s*\([fF]\)|"
    r"secuencia\s+correcta\s+de\s+verdad|"
    r"se[n\u00f1]ale\s+(la\s+verdad|lo\s+verdadero|lo\s+falso)|"
    r"indique\s+la\s+secuencia\s+de\s+verdad|"
    r"es\s+verdadera\s+o\s+falsa)",
    re.IGNORECASE
)

# Patrón de Relacionar o Ordenar
RE_RELACIONAR = re.compile(
    r"(\b1[a-e]\s*,\s*2[a-e]|"
    r"\bI[a-e]\s*,\s*II[a-e]|"
    r"relacione\s+ambas\s+columnas|"
    r"empareje\s+correctamente|"
    r"ordene\s+cronol[o\u00f3]gicamente|"
    r"son\s+correctas\s*:\s*[I|V])",
    re.IGNORECASE
)

# Patrón de Fórmula / Teorema
RE_FORMULARIO = re.compile(
    r"(cu[a\u00e1]l\s+es\s+la\s+f[o\u00f3]rmula|"
    r"expresi[o\u00f3]n\s+matem[a\u00e1]tica\s+de|"
    r"enunciado\s+de\s+la\s+ley\s+de|"
    r"teorema\s+de\s+(descartes|newton|pit[a\u00e1]goras|tales|cardano)|"
    r"ecuaci[o\u00f3]n\s+(dimensional|universal|qu[i\u00ed]mica)\s+de)",
    re.IGNORECASE
)

# Patrón de cálculo numérico
RE_CALCULO = re.compile(
    r"(\bcalcule\b|\bdetermine\s+el\s+valor\b|\bcu[a\u00e1]ntos\s+gramos\b|"
    r"\bhallar\s+x\b|\bhalle\s+el\s+m[o\u00f3]dulo\b|\bvelocidad\s+final\b|"
    r"\bcu[a\u00e1]ntos\s+moles\b|\bhalle\s+la\s+suma\b|\bcalcule\s+la\s+fuerza\b|"
    r"\d+\s*(m/s|m/s²|kg|cm|km|N|J|mol|atm|L|mL|%))",
    re.IGNORECASE
)


def inferir_subtema(asignatura, semana, q_text, expl_text):
    asig_clean = asignatura.lower()
    full_text = (q_text + " " + expl_text).lower()
    
    # 1. FÍSICA
    if "f[ií]sic" in asig_clean:
        if semana == 1:
            if any(w in full_text for w in ["dimensi", "[m]", "[l]", "[t]", "homogene"]):
                return "Análisis Dimensional"
            return "Análisis Vectorial (Vectores)"
        elif semana == 2:
            if "gr[aá]fic" in full_text:
                return "Gráficas del Movimiento"
            return "Cinemática 1D (MRU, MRUV)"
        elif semana == 3:
            if any(w in full_text for w in ["parab[oó]l", "proyectil", "alcance", "[aá]ngulo de tiro"]):
                return "Movimiento Parabólico (MPCL)"
            return "Caída Libre (MVCL)"
        elif semana == 4:
            if any(w in full_text for w in ["polea", "engranaje", "faja", "transmisi"]):
                return "Transmisión de Giro"
            return "Movimiento Circular (MCU, MCUV)"
        elif semana == 5:
            if any(w in full_text for w in ["momento", "torque", "giro", "brazo de palanca"]):
                return "Estática II (Momentos y Torques)"
            return "Estática I (Fuerzas y Equilibrio)"
        elif semana == 6:
            if any(w in full_text for w in ["centr[ií]peta", "curv", "peralte", "radio"]):
                return "Dinámica Curvilínea / Circular"
            return "Dinámica Lineal (Leyes de Newton)"
        elif semana == 7:
            if any(w in full_text for w in ["potencia", "eficiencia", "rendimiento", "watt"]):
                return "Potencia y Eficiencia"
            return "Trabajo Mecánico"
        elif semana == 8:
            return "Energía Mecánica y Conservación"
        elif semana == 9:
            if any(w in full_text for w in ["kepler", "gravitaci", "planeta", "sat[eé]lite"]):
                return "Gravitación Universal y Kepler"
            return "Impulso y Cantidad de Movimiento"
        elif semana == 10:
            if any(w in full_text for w in ["calor", "termodin[aá]m", "isob[aá]r", "adiab[aá]t"]):
                return "Calorimetría y Termodinámica"
            return "Termometría y Dilatación"
        elif semana == 11:
            return "Mecánica de Fluidos (Hidrostática / Bernoulli)"
        elif semana == 12:
            if any(w in full_text for w in ["circuito", "resistencia", "ohm", "kirchhoff"]):
                return "Circuitos Eléctricos y Ley de Ohm"
            elif any(w in full_text for w in ["campo", "coulomb", "carga"]):
                return "Electrostática"
            return "Electromagnetismo y Física Moderna"
        return f"Física Semana {semana}"

    # 2. QUÍMICA
    elif "qu[ií]mic" in asig_clean:
        if semana in [1, 2]:
            if any(w in full_text for w in ["fase", "s[oó]lido", "l[ií]quido", "ebullici", "fusi"]):
                return "Estados de Agregación y Cambios de Fase"
            return "Materia y Fenómenos Físico-Químicos"
        elif semana == 3:
            return "Estructura Atómica y Núclidos"
        elif semana == 4:
            return "Números Cuánticos y Configuración Electrónica"
        elif semana == 5:
            return "Tabla Periódica y Propiedades Periódicas"
        elif semana in [6, 7]:
            if any(w in full_text for w in ["intermolecular", "london", "dipolo", "puente de hidr"]):
                return "Fuerzas Intermoleculares"
            return "Enlace Químico (Iónico y Covalente)"
        elif semana in [8, 9]:
            if any(w in full_text for w in ["sal", "sulfato", "cloruro", "nitrato"]):
                return "Nomenclatura Inorgánica: Sales"
            elif any(w in full_text for w in ["[aá]cido"]):
                return "Nomenclatura Inorgánica: Ácidos"
            return "Nomenclatura Inorgánica: Óxidos e Hidróxidos"
        elif semana == 10:
            return "Unidades Químicas de Masa y Composición"
        elif semana == 11:
            return "Estado Gaseoso y Leyes de Gases"
        elif semana == 12:
            return "Reacciones Químicas y Balance Redox"
        elif semana == 13:
            return "Estequiometría y Reactivo Limitante"
        elif semana == 14:
            return "Soluciones Químicas (Molaridad / Normalidad)"
        elif semana == 15:
            return "Cinética y Equilibrio Químico (Le Châtelier)"
        elif semana == 16:
            if any(w in full_text for w in ["ph", "poh", "[aá]cido", "base", "alcalin"]):
                return "Ácidos, Bases, pH y pOH"
            elif any(w in full_text for w in ["pila", "celda", "galv[aá]n", "electr[oó]lisis"]):
                return "Electroquímica"
            return "Química Orgánica y del Carbono"
        return f"Química Semana {semana}"

    # 3. BIOLOGÍA
    elif "biolog" in asig_clean:
        if semana == 1:
            return "La Biología como Ciencia y Método Científico"
        elif semana == 2:
            return "Seres Vivos, Características y Niveles de Organización"
        elif semana == 3:
            if any(w in full_text for w in ["agua", "puente de hidr", "calor espec"]):
                return "Base Química: El Agua y Sales Minerales"
            return "Bioelementos y Biomoléculas Inorgánicas"
        elif semana == 4:
            if any(w in full_text for w in ["prote[ií]n", "amino[aá]cido", "enzima"]):
                return "Biomoléculas Orgánicas: Proteínas y Enzimas"
            elif any(w in full_text for w in ["adn", "arn", "nucle[oó]tido", "chargaff"]):
                return "Biomoléculas Orgánicas: Ácidos Nucleicos"
            elif any(w in full_text for w in ["l[ií]pido", "grasa", "fosfol[ií]p", "colesterol"]):
                return "Biomoléculas Orgánicas: Lípidos"
            return "Biomoléculas Orgánicas: Glúcidos"
        elif semana == 5:
            if any(w in full_text for w in ["membrana", "transporte", "bomba", "mosaico"]):
                return "Membrana Plasmática y Transporte Celular"
            elif any(w in full_text for w in ["bacteria", "procariota", "peptidogl"]):
                return "Célula Procariota y Bacterias"
            return "Célula Eucariota y Organelos"
        elif semana == 6:
            if any(w in full_text for w in ["fotos[ií]ntesis", "tilacoide", "rubisco", "calvin"]):
                return "Fotosíntesis (Fase Luminosa y Oscura)"
            return "Respiración Celular y Fermentación"
        elif semana == 7:
            if any(w in full_text for w in ["vegetal", "xilema", "floema", "estoma", "par[eé]nquima"]):
                return "Histología Vegetal"
            return "Histología Animal"
        elif semana == 8:
            if any(w in full_text for w in ["coraz[oó]n", "sangre", "circulaci", "aur[ií]cula"]):
                return "Fisiología Humana: Sistema Circulatorio"
            elif any(w in full_text for w in ["pulm[oó]n", "alv[eé]olo", "respiraci", "hematosis"]):
                return "Fisiología Humana: Sistema Respiratorio"
            return "Fisiología Humana: Sistema Digestivo"
        elif semana == 9:
            if any(w in full_text for w in ["ri[nñ][oó]n", "nefrona", "orina", "excreci"]):
                return "Fisiología Humana: Sistema Excretor"
            elif any(w in full_text for w in ["hormona", "tiroides", "hip[oó]fisis", "insulina"]):
                return "Fisiología Humana: Sistema Endocrino"
            return "Fisiología Humana: Sistema Nervioso"
        elif semana == 10:
            if any(w in full_text for w in ["meiosis", "paquiteno", "crossing"]):
                return "Meiosis y Recombinación Genética"
            elif any(w in full_text for w in ["mitosis", "metafase", "anafase"]):
                return "Mitosis y Ciclo Celular"
            return "Gametogénesis y Ciclo Menstrual"
        elif semana == 11:
            if any(w in full_text for w in ["down", "turner", "klinefelter", "mutaci"]):
                return "Mutaciones y Anomalías Cromosómicas"
            elif any(w in full_text for w in ["sexo", "hemofilia", "daltonismo"]):
                return "Herencia Ligada al Sexo"
            elif any(w in full_text for w in ["abo", "rh", "grupo sangu[ií]neo"]):
                return "Grupos Sanguíneos ABO y Rh"
            return "Leyes de Mendel Clásicas"
        elif semana == 12:
            if any(w in full_text for w in ["darwin", "lamarck", "selecci[oó]n natural"]):
                return "Teorías de la Evolución"
            elif any(w in full_text for w in ["oparin", "miller", "pasteur", "origen"]):
                return "Origen de la Vida"
            return "Taxonomía y Dominios Biológicos"
        elif semana == 13:
            if any(w in full_text for w in ["contaminaci", "efecto invernadero", "ozono", "anp"]):
                return "Contaminación y Áreas Protegidas"
            elif any(w in full_text for w in ["mutualismo", "parasitismo", "comensalismo"]):
                return "Relaciones Biológicas Interespecíficas"
            return "Ecología y Ecosistemas"
        return f"Biología Semana {semana}"

    # 4. ÁLGEBRA
    elif "[aá]lgebra" in asig_clean:
        if any(w in full_text for w in ["exponente", "radical", "potencia"]):
            return "Leyes de Exponentes y Radicales"
        elif any(w in full_text for w in ["polinomio", "grado", "coeficiente"]):
            return "Polinomios y Valor Numérico"
        elif any(w in full_text for w in ["producto notable", "trinomio", "binomio"]):
            return "Productos Notables"
        elif any(w in full_text for w in ["horner", "ruffini", "resto", "divisi[oó]n"]):
            return "División de Polinomios y Teorema del Resto"
        elif any(w in full_text for w in ["factoriz", "factor com[uú]n"]):
            return "Factorización de Polinomios"
        elif any(w in full_text for w in ["segundo grado", "cuadr[aá]tic", "cardano", "discriminante"]):
            return "Ecuaciones de Segundo Grado"
        elif any(w in full_text for w in ["primer grado", "lineal"]):
            return "Ecuaciones de Primer Grado"
        elif any(w in full_text for w in ["inecuaci", "intervalo", "desigualdad"]):
            return "Inecuaciones y Desigualdades"
        elif any(w in full_text for w in ["valor absoluto"]):
            return "Valor Absoluto"
        elif any(w in full_text for w in ["funci[oó]n", "dominio", "rango"]):
            return "Funciones: Dominio, Rango y Gráficas"
        return f"Álgebra Semana {semana}"

    # 5. GEOMETRÍA
    elif "geometr[ií]a" in asig_clean:
        if any(w in full_text for w in ["[aá]rea", "superficie", "sombre"]):
            return "Áreas de Regiones Planas"
        elif any(w in full_text for w in ["circunferencia", "c[ií]rculo", "cuerda", "arco"]):
            return "La Circunferencia"
        elif any(w in full_text for w in ["semejanza", "tales", "proporcionalidad"]):
            return "Semejanza y Proporcionalidad"
        elif any(w in full_text for w in ["congruencia", "caso l-a-l"]):
            return "Congruencia de Triángulos"
        elif any(w in full_text for w in ["pol[ií]gono", "cuadril[aá]tero", "paralelogramo"]):
            return "Polígonos y Cuadriláteros"
        elif any(w in full_text for w in ["tri[aá]ngulo", "pit[aá]goras", "hipotenusa"]):
            return "Triángulos y Relaciones Métricas"
        elif any(w in full_text for w in ["prisma", "cilindro", "cono", "esfera", "volumen"]):
            return "Geometría del Espacio y Sólidos"
        elif any(w in full_text for w in ["recta", "[aá]ngulo", "paralela", "secante"]):
            return "Segmentos y Ángulos"
        return f"Geometría Semana {semana}"

    # 6. TRIGONOMETRÍA
    elif "trigonometr" in asig_clean:
        if any(w in full_text for w in ["sector", "longitud de arco", "radi[aá]n"]):
            return "Sistemas Angulares y Longitud de Arco"
        elif any(w in full_text for w in ["notable", "37", "53", "45", "30", "60"]):
            return "Triángulos Notables y Razones en Triángulo Rectángulo"
        elif any(w in full_text for w in ["reducci[oó]n", "cuadrante", "signo"]):
            return "Reducción al Primer Cuadrante"
        elif any(w in full_text for w in ["identidad", "pitag[oó]rica", "rec[ií]proca"]):
            return "Identidades Trigonométricas Fundamentales"
        elif any(w in full_text for w in ["doble", "triple", "mitad"]):
            return "Ángulos Múltiples (Doble, Mitad)"
        elif any(w in full_text for w in ["elevaci[oó]n", "depresi[oó]n", "vertical"]):
            return "Ángulos Verticales y Horizontales"
        elif any(w in full_text for w in ["ley de senos", "ley de cosenos", "oblicu[aá]ngulo"]):
            return "Resolución de Triángulos Oblicuángulos"
        return f"Trigonometría Semana {semana}"

    # 7. ARITMÉTICA / RAZ. MATEMÁTICO
    elif any(w in asig_clean for w in ["aritm[eé]tica", "raz. matem"]):
        if any(w in full_text for w in ["conjunto", "cardinal", "venn", "subconjunto"]):
            return "Teoría de Conjuntos"
        elif any(w in full_text for w in ["divisor", "primo", "mcd", "mcm", "divisib"]):
            return "Divisibilidad, Números Primos, MCD y MCM"
        elif any(w in full_text for w in ["fracci", "decimal", "generatriz", "racional"]):
            return "Números Racionales y Fracciones"
        elif any(w in full_text for w in ["porcent", "tanto por ciento", "descuento"]):
            return "Tanto por Ciento y Aplicaciones Comerciales"
        elif any(w in full_text for w in ["proporci", "raz[oó]n", "directa", "inversa", "reparto"]):
            return "Razones, Proporciones y Magnitudes"
        elif any(w in full_text for w in ["combinat", "permut", "cu[aá]ntas maneras"]):
            return "Análisis Combinatorio"
        elif any(w in full_text for w in ["probabil", "espacio muestral", "dado", "urna"]):
            return "Probabilidades"
        elif any(w in full_text for w in ["edades", "a[nñ]o de nac"]):
            return "Problemas sobre Edades"
        return f"Aritmética / RM Semana {semana}"

    # Genérico por defecto
    return f"{asignatura} Semana {semana}"

def clasificar_pregunta(p):
    q_raw = p.get("q", "")
    expl_raw = p.get("explanation", "")
    options_raw = p.get("options", [])
    
    q_norm = normalize_text(q_raw)
    expl_norm = normalize_text(expl_raw)
    options_norm = [normalize_text(opt) for opt in options_raw]
    options_concat = " ".join(options_norm)
    
    asig = p.get("asignatura", "General")
    sem = p.get("semana", 1)
    
    # 1. Inferir Subtema Curricular
    subtema = inferir_subtema(asig, sem, q_norm, expl_norm)
    
    # 2. Diagnosticar Estado de Gráfico
    tiene_grafico_roto = bool(RE_GRAFICO_ROTO.search(q_norm))
    es_autoconstruible = bool(RE_AUTOCONSTRUIBLE.search(q_norm))
    
    if tiene_grafico_roto:
        estado_grafico = "REQUIERE_GRAFICO_FALTANTE"
        observacion = "Depende de gráfico, figura o ecuación faltante en el texto escaneado"
    elif es_autoconstruible:
        estado_grafico = "GRAFICO_AUTOCONSTRUIBLE"
        observacion = "Enunciado descriptivo autosuficiente; el alumno debe graficarlo en papel"
    else:
        estado_grafico = "SIN_GRAFICO_TEXTUAL"
        observacion = "Texto completo y autosuficiente"
        
    # 3. Diagnosticar Tipo de Formato
    es_vf = bool(RE_VF.search(q_norm) or RE_VF.search(options_concat))
    es_relac = bool(RE_RELACIONAR.search(q_norm) or RE_RELACIONAR.search(options_concat))
    es_form = bool(RE_FORMULARIO.search(q_norm))
    es_calc = bool(RE_CALCULO.search(q_norm))
    
    if es_vf:
        tipo_formato = "VERDADERO_FALSO"
    elif es_relac:
        tipo_formato = "RELACIONAR_COLUMNAS"
    elif es_form:
        tipo_formato = "FORMULA_TEOREMA"
    elif es_calc:
        tipo_formato = "PROBLEMA_CALCULO"
    else:
        tipo_formato = "TEORICO_DIRECTO"

    # 4. Diagnosticar Nivel de Dificultad (BASICO, INTERMEDIO, AVANZADO)
    len_q = len(q_norm)
    has_context_deco = any(w in q_norm.lower() for w in [
        "laboratorio", "investigador", "experimento", "en el siguiente caso",
        "se deduce", "se infiere", "situaci", "contexto", "paciente", "muestra", "hip"
    ])
    
    if es_vf or es_relac or (es_calc and len_q > 140) or (has_context_deco and len_q > 180):
        nivel_dificultad = "AVANZADO"
        apto_examen_repaso = True
    elif es_calc or len_q > 110 or any(w in q_norm.lower() for w in ["debido a", "por qu", "consecuencia", "funci", "diferencia", "caracter", "mecanismo"]):
        nivel_dificultad = "INTERMEDIO"
        apto_examen_repaso = True
    else:
        nivel_dificultad = "BASICO"
        apto_examen_repaso = False
        
    # 5. Asignar Destino de Uso
    if es_vf or es_relac or es_calc or estado_grafico == "GRAFICO_AUTOCONSTRUIBLE":
        destino_uso = "SOLO_EXAMEN"
    elif es_form:
        destino_uso = "FORMULARIO"
    elif apto_examen_repaso:
        destino_uso = "FLASHCARD_Y_REPASO"
    else:
        destino_uso = "SOLO_FLASHCARD"
        
    # Retornar objeto enriquecido
    enriquecido = dict(p)
    enriquecido["q"] = q_norm
    enriquecido["explanation"] = expl_norm
    enriquecido["options"] = options_norm
    enriquecido["subtema"] = subtema
    enriquecido["destinoUso"] = destino_uso
    enriquecido["nivelDificultad"] = nivel_dificultad
    enriquecido["aptoExamenRepaso"] = apto_examen_repaso
    enriquecido["estadoGrafico"] = estado_grafico
    enriquecido["tipoFormato"] = tipo_formato
    enriquecido["observacion"] = observacion
    
    return enriquecido


def main():
    print("Iniciando clasificación y saneamiento del Banco Maestro...")
    if not os.path.exists(INPUT_FILE):
        print(f"Error: no existe {INPUT_FILE}")
        return

    # 1. Copia de respaldo
    if not os.path.exists(BACKUP_FILE):
        shutil.copy2(INPUT_FILE, BACKUP_FILE)
        print(f"Respaldo creado en: {BACKUP_FILE}")

    # 2. Carga del banco (desde el respaldo original si existe)
    source_file = BACKUP_FILE if os.path.exists(BACKUP_FILE) else INPUT_FILE
    with open(source_file, "r", encoding="utf-8", errors="replace") as f:
        preguntas = json.load(f)


    total = len(preguntas)
    print(f"Total de preguntas leídas: {total}")

    clasificadas = []
    conteo_destino = {"SOLO_FLASHCARD": 0, "FLASHCARD_Y_REPASO": 0, "FORMULARIO": 0, "SOLO_EXAMEN": 0}
    conteo_nivel = {"BASICO": 0, "INTERMEDIO": 0, "AVANZADO": 0}
    conteo_grafico = {"SIN_GRAFICO_TEXTUAL": 0, "GRAFICO_AUTOCONSTRUIBLE": 0, "REQUIERE_GRAFICO_FALTANTE": 0}
    conteo_formato = {"TEORICO_DIRECTO": 0, "VERDADERO_FALSO": 0, "RELACIONAR_COLUMNAS": 0, "PROBLEMA_CALCULO": 0, "FORMULA_TEOREMA": 0}
    subtemas_set = set()

    for idx, p in enumerate(preguntas, 1):
        p_c = clasificar_pregunta(p)
        clasificadas.append(p_c)
        conteo_destino[p_c["destinoUso"]] += 1
        conteo_nivel[p_c["nivelDificultad"]] += 1
        conteo_grafico[p_c["estadoGrafico"]] += 1
        conteo_formato[p_c["tipoFormato"]] += 1
        subtemas_set.add(p_c["subtema"])
        
        if idx % 500 == 0 or idx == total:
            print(f"  -> Progreso: [{idx}/{total}] preguntas analizadas...")

    # 3. Guardado en el mismo archivo maestro
    with open(INPUT_FILE, "w", encoding="utf-8") as f:
        json.dump(clasificadas, f, ensure_ascii=False, indent=2)

    print(f"\n[OK] Guardado exitoso en {INPUT_FILE}")

    # Sincronizar con los assets de la app Android
    if os.path.exists(os.path.dirname(ANDROID_ASSETS_FILE)):
        shutil.copy2(INPUT_FILE, ANDROID_ASSETS_FILE)
        print(f"[OK] Sincronizado con assets de Android: {ANDROID_ASSETS_FILE}")

    print("\n--- EJEMPLOS DE PREGUNTAS CLASIFICADAS ---")
    for sample in clasificadas[:3]:
        print(f"ID: {sample['id']}")
        print(f"Texto limpio: {sample['q'][:80]}...")
        print(f"Subtema: {sample['subtema']} | Destino: {sample['destinoUso']} | Nivel: {sample['nivelDificultad']} | Apto Repaso: {sample['aptoExamenRepaso']}")
        print("-" * 50)

    print("\n--- RESUMEN DE CLASIFICACIÓN ---")
    print(f"Destino de Uso: {conteo_destino}")
    print(f"Nivel de Dificultad: {conteo_nivel}")
    print(f"Estado de Gráfico: {conteo_grafico}")
    print(f"Tipo de Formato: {conteo_formato}")
    print(f"Total de Subtemas inferidos y clasificados: {len(subtemas_set)}")

    asig_counts = Counter([p.get("asignatura", "Desconocido") for p in clasificadas])
    print("\n--- DISTRIBUCIÓN POR ASIGNATURA ---")
    for asig, count in asig_counts.most_common():
        print(f"  * {asig}: {count} preguntas")

    # 4. Actualizar CHECKLIST_CLASIFICACION_BANCO_4600.md
    if os.path.exists(CHECKLIST_FILE):
        try:
            with open(CHECKLIST_FILE, "r", encoding="utf-8") as cf:
                md_content = cf.read()

            tabla_metricas = (
                f"\n\n### 📊 RESULTADOS DE LA CLASIFICACIÓN EJECUTADA\n\n"
                f"| Métrica | Total Ítems | % del Banco | Descripción / Destino |\n"
                f"| :--- | :--- | :--- | :--- |\n"
                f"| **Total Preguntas Procesadas** | **{total}** | **100%** | Banco maestro saneado y enriquecido |\n"
                f"| **`FLASHCARD_Y_REPASO` (Nivel Medio/Alto)** | **{conteo_destino['FLASHCARD_Y_REPASO']}** | **{conteo_destino['FLASHCARD_Y_REPASO']*100/total:.1f}%** | Preguntas teóricas de buen nivel aptas para mazo y examen de repaso |\n"
                f"| **`SOLO_FLASHCARD` (Memoria Rápida / Básico)** | **{conteo_destino['SOLO_FLASHCARD']}** | **{conteo_destino['SOLO_FLASHCARD']*100/total:.1f}%** | Conceptos directos para memorización express en flashcards |\n"
                f"| **`SOLO_EXAMEN` (Cálculo / V-F / Columnas / Gráficos)** | **{conteo_destino['SOLO_EXAMEN']}** | **{conteo_destino['SOLO_EXAMEN']*100/total:.1f}%** | Preguntas analíticas exclusivas de simulacros con cronómetro |\n"
                f"| **`FORMULARIO` (Fórmulas / Teoremas canónicos)** | **{conteo_destino['FORMULARIO']}** | **{conteo_destino['FORMULARIO']*100/total:.1f}%** | Fórmulas explícitas aisladas para el módulo de leyes |\n"
                f"| **Dificultad `AVANZADO` (DECO / Complejos)** | **{conteo_nivel['AVANZADO']}** | **{conteo_nivel['AVANZADO']*100/total:.1f}%** | Análisis crítico, contexto situacional y cálculos avanzados |\n"
                f"| **Dificultad `INTERMEDIO` (Causa-Efecto / Explicativos)** | **{conteo_nivel['INTERMEDIO']}** | **{conteo_nivel['INTERMEDIO']*100/total:.1f}%** | Relaciones conceptuales, funciones y problemas estándar |\n"
                f"| **Dificultad `BASICO` (Definición / Mnemotecnia)** | **{conteo_nivel['BASICO']}** | **{conteo_nivel['BASICO']*100/total:.1f}%** | Memoria unívoca y definiciones de un paso |\n"
                f"| **`SIN_GRAFICO_TEXTUAL` (Texto autosuficiente)** | **{conteo_grafico['SIN_GRAFICO_TEXTUAL']}** | **{conteo_grafico['SIN_GRAFICO_TEXTUAL']*100/total:.1f}%** | Enunciados 100% verbales sin dependencia externa |\n"
                f"| **`GRAFICO_AUTOCONSTRUIBLE` (Dibujable en papel)** | **{conteo_grafico['GRAFICO_AUTOCONSTRUIBLE']}** | **{conteo_grafico['GRAFICO_AUTOCONSTRUIBLE']*100/total:.1f}%** | Problemas donde el alumno debe hacer el gráfico en borrador |\n"
                f"| **`REQUIERE_GRAFICO_FALTANTE` (Aisladas para corrección)** | **{conteo_grafico['REQUIERE_GRAFICO_FALTANTE']}** | **{conteo_grafico['REQUIERE_GRAFICO_FALTANTE']*100/total:.1f}%** | Preguntas con gráfico faltante aisladas para no romper la app |\n"
                f"| **Formato `PROBLEMA_CALCULO`** | **{conteo_formato['PROBLEMA_CALCULO']}** | **{conteo_formato['PROBLEMA_CALCULO']*100/total:.1f}%** | Ejercicios de física, química y matemática con cálculo numérico |\n"
                f"| **Formato `VERDADERO_FALSO`** | **{conteo_formato['VERDADERO_FALSO']}** | **{conteo_formato['VERDADERO_FALSO']*100/total:.1f}%** | Evaluaciones de secuencias V/F (exclusivas para simulacros) |\n"
                f"| **Formato `RELACIONAR_COLUMNAS`** | **{conteo_formato['RELACIONAR_COLUMNAS']}** | **{conteo_formato['RELACIONAR_COLUMNAS']*100/total:.1f}%** | Preguntas de emparejamiento (Ia, IIb, IIIc) |\n"
                f"| **Subtemas Únicos Clasificados** | **{len(subtemas_set)}** | **-** | Mapeo curricular preciso según temario UNSA |\n\n"
            )

            # Reemplazar tabla de resultados existente
            if "### 📊 RESULTADOS DE LA CLASIFICACIÓN EJECUTADA" in md_content:
                parts = md_content.split("### 📊 RESULTADOS DE LA CLASIFICACIÓN EJECUTADA")
                resto = parts[1].split("## 📚 MATRIZ DE ASIGNATURAS Y SUBTEMAS OFICIALES UNSA")
                md_content = parts[0] + tabla_metricas + "## 📚 MATRIZ DE ASIGNATURAS Y SUBTEMAS OFICIALES UNSA" + (resto[1] if len(resto) > 1 else "")
            else:
                md_content = md_content.replace("## 📚 MATRIZ DE ASIGNATURAS Y SUBTEMAS OFICIALES UNSA", tabla_metricas + "## 📚 MATRIZ DE ASIGNATURAS Y SUBTEMAS OFICIALES UNSA")
            
            with open(CHECKLIST_FILE, "w", encoding="utf-8") as cf:
                cf.write(md_content)
            print(f"Checklist actualizado en {CHECKLIST_FILE}")
        except Exception as e:
            print(f"Aviso: no se pudo actualizar el checklist automáticamente: {e}")

if __name__ == "__main__":
    main()

