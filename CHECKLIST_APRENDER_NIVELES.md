# 🗺️ CHECKLIST MAESTRO: APLICACIÓN DE NIVELES Y SUBTEMAS EN "APRENDER"

**Proyecto:** RASTRO UNSA (Kotlin Multiplatform + Jetpack Compose)  
**Base Pedagógica:** Prospecto Oficial UNSA (Resolución N.° 0028-2026) y 208 Temas en `CONTENIDO_PEDAGOGICO/`  
**Arquitectura de UI:** En `AprenderSubjectDetailScreen.kt`, los cursos se agrupan por `semana` (que representa el **Tema Oficial** de la materia), y cada nodo hijo (`LessonNode`) constituye un **NIVEL / SUBTEMA** con su teoría concentrada, fórmulas, tips de admisión y retos interactivos DECO.

---

## 📊 RESUMEN EJECUTIVO DE INTEGRACIÓN

| Materia | Temas Oficiales | Niveles / Subtemas Implementados | Estado en Aprender |
| :--- | :---: | :---: | :---: |
| **Lenguaje** | 8 | 32 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Literatura** | 6 | 24 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Educación Cívica** | 11 | 33 (3 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Inglés** | 7 | 28 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Filosofía** | 13 | Multi-nivel estructurado | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Psicología** | 15 | Multi-nivel estructurado | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Razonamiento Verbal** | 8 | 32 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Comprensión Lectora** | 8 | 32 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Razonamiento Lógico** | 9 | 36 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Razonamiento Matemático** | 7 | 28 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Aritmética** | 13 | 52 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Historia Universal** | 8 | 32 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Historia del Perú** | 8 | 32 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO** ✅ |
| **Geografía** | 13 | 13 Temas oficiales completos | 🟢 **COMPLETO Y ESTRUCTURADO** ✅ |
| **Álgebra** | 16 | 64 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |
| **Geometría** | 11 | 44 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |
| **Trigonometría** | 12 | 48 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |
| **Física** | 12 | 48 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |
| **Química** | 16 | 64 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |
| **Biología** | 13 | 52 (4 por tema) | 🟢 **COMPLETO Y DESGLOSADO (100%)** ✅ |

---

## 📚 DETALLE DE DESGLOSE: LENGUAJE (`LenguajeCatalog.kt`)

- [x] **Tema 01: Comunicación y Lenguaje (Semana 1)**
  - [x] `len_t01_s01`: Concepto, Fases y Tipos de Comunicación
  - [x] `len_t01_s02`: Circuito y Elementos de la Comunicación (Ruido, Redundancia)
  - [x] `len_t01_s03`: Lenguaje, Lengua y Habla (Planos de Saussure, Doble Articulación)
  - [x] `len_t01_s04`: Las Seis Funciones del Lenguaje (Bühler y Jakobson)
- [x] **Tema 02: Lengua, Habla y Realidad Lingüística del Perú (Semana 2)**
  - [x] `len_t02_s01`: Variaciones de la Lengua: Dialecto, Sociolecto e Idiolecto
  - [x] `len_t02_s02`: Niveles de la Lengua: Superestándar, Estándar y Subestándar
  - [x] `len_t02_s03`: Lenguas Amerindias Andinas: Quechua y Familia Aru
  - [x] `len_t02_s04`: Lenguas Amazónicas (Arawak, Pano, Jíbaro) y Diglosia
- [x] **Tema 03: Fonología y Ortografía (Semana 3)**
  - [x] `len_t03_s01`: Fonemas del Español, Alófonos y Asimetría Grafemática
  - [x] `len_t03_s02`: Secuencias Vocálicas: Diptongos, Triptongos y Hiatos
  - [x] `len_t03_s03`: Normativa de Acentuación General (Oxítonas, Paroxítonas, etc.)
  - [x] `len_t03_s04`: Tildación Especial: Diacrítica, Enfática y Robúrica
- [x] **Tema 04: Morfología y Formación de Palabras (Semana 4)**
  - [x] `len_t04_s01`: El Morfema y el Alomorfo (Unidades mínimas de significado)
  - [x] `len_t04_s02`: Clasificación de Morfemas: Lexemas y Morfemas Flexivos/Derivativos
  - [x] `len_t04_s03`: Procesos Formativos: Derivación y Composición
  - [x] `len_t04_s04`: Parasíntesis y Otros Procesos Formativos (Acronimia, Siglas)
- [x] **Tema 05: Sintaxis: Categorías Gramaticales y Frases (Semana 5)**
  - [x] `len_t05_s01`: Categorías Gramaticales Variables y la Frase Nominal
  - [x] `len_t05_s02`: El Verbo y las Perífrasis Verbales
  - [x] `len_t05_s03`: Categorías Invariables: Adverbio, Preposición y Conjunción
  - [x] `len_t05_s04`: Estructura de Sintagmas y Complementos de la Frase Verbal
- [x] **Tema 06: La Oración Gramatical: Simples y Compuestas (Semana 6)**
  - [x] `len_t06_s01`: La Oración Simple: Bimembres vs. Unimembres
  - [x] `len_t06_s02`: Oraciones Compuestas por Coordinación
  - [x] `len_t06_s03`: Oraciones Compuestas por Subordinación Sustantiva y Adjetiva
  - [x] `len_t06_s04`: Oraciones Compuestas por Subordinación Adverbial
- [x] **Tema 07: Discurso Escrito y Normativa (Semana 7)**
  - [x] `len_t07_s01`: Puntuación: Clases de Coma
  - [x] `len_t07_s02`: El Punto, Punto y Coma, Dos Puntos y Puntos Suspensivos
  - [x] `len_t07_s03`: Normativa de Grafías de Escritura Dudosa (B/V, C/S/Z, G/J, H)
  - [x] `len_t07_s04`: Normativa de Letras Mayúsculas y Minúsculas
- [x] **Tema 08: Semántica y Lexicología (Semana 8)**
  - [x] `len_t08_s01`: El Signo Lingüístico: Características y Planos
  - [x] `len_t08_s02`: Significado Denotativo y Connotativo
  - [x] `len_t08_s03`: Relaciones Léxicas: Homonimia, Polisemia y Paronimia
  - [x] `len_t08_s04`: Relaciones de Inclusión: Hiperonimia, Hiponimia y Cohiponimia

---

## 📚 DETALLE DE DESGLOSE: LITERATURA (`LiteraturaCatalog.kt`)

- [x] **Tema 01: Teoría Literaria, Géneros y Figuras Retóricas (Semana 1)**
  - [x] `lit_t01_s01`: Naturaleza del Fenómeno Literario y Función Poética
  - [x] `lit_t01_s02`: Los Tres Géneros Clásicos y el Género Expositivo-Ensayo
  - [x] `lit_t01_s03`: Figuras Retóricas de Sentido o Tropos (Metáfora, Metonimia, Sinécdoque)
  - [x] `lit_t01_s04`: Figuras de Dicción y Construcción (Hipérbaton, Anáfora, Epíteto)
- [x] **Tema 02: Literatura Clásica Occidental (Grecia, Roma y Renacimiento) (Semana 2)**
  - [x] `lit_t02_s01`: Clasicismo Griego: La Épica Homérica (Ilíada y Odisea)
  - [x] `lit_t02_s02`: La Tragedia Ática: Esquilo y Sófocles (Edipo Rey)
  - [x] `lit_t02_s03`: Literatura Medieval Europea: Dante Alighieri y la Divina Comedia
  - [x] `lit_t02_s04`: Renacimiento Europeo: William Shakespeare (Hamlet y Romeo y Julieta)
- [x] **Tema 03: Siglo de Oro Español (Semana 3)**
  - [x] `lit_t03_s01`: Lírica Renacentista y Escuela Italiana: Garcilaso de la Vega
  - [x] `lit_t03_s02`: Narrativa Picaresca: La Vida de Lazarillo de Tormes
  - [x] `lit_t03_s03`: Miguel de Cervantes Saavedra: El Ingenioso Hidalgo Don Quijote de la Mancha
  - [x] `lit_t03_s04`: Barroco: Teatro Nacional (Lope de Vega) y Teatro Filosófico (Calderón de la Barca)
- [x] **Tema 04: Literatura Peruana: De los Orígenes al Romanticismo y Realismo (Semana 4)**
  - [x] `lit_t04_s01`: Literatura Prehispánica y Quechua: Ollantay
  - [x] `lit_t04_s02`: Crónicas de Indias: Inca Garcilaso de la Vega (Comentarios Reales) y Guamán Poma
  - [x] `lit_t04_s03`: Emancipación: Mariano Melgar y el Yaraví Arequipeño
  - [x] `lit_t04_s04`: Costumbrismo, Romanticismo (Palma) y Realismo (González Prada)
- [x] **Tema 05: Modernismo y Vanguardismo en el Perú y Latinoamérica (Semana 5)**
  - [x] `lit_t05_s01`: Modernismo Hispanoamericano y Peruano: Rubén Darío y Chocano
  - [x] `lit_t05_s02`: Posmodernismo y Grupo Colónida: Abraham Valdelomar (El Caballero Carmelo)
  - [x] `lit_t05_s03`: Poesía Vanguardista Universal: César Vallejo (Los Heraldos Negros, Trilce, Poemas Humanos)
  - [x] `lit_t05_s04`: Vanguardismo en América Latina: Pablo Neruda y la Poesía del Siglo XX
- [x] **Tema 06: Indigenismo y el Boom Narrativo Hispanoamericano (Semana 6)**
  - [x] `lit_t06_s01`: Indigenismo Peruano: Ciro Alegría (El Mundo es Ancho y Ajeno)
  - [x] `lit_t06_s02`: Indigenismo Profundo y Mestizaje: José María Arguedas (Los Ríos Profundos)
  - [x] `lit_t06_s03`: Narrativa Urbana de la Generación del 50: Julio Ramón Ribeyro
  - [x] `lit_t06_s04`: El Boom Latinoamericano: Gabriel García Márquez y Mario Vargas Llosa

---

## 📚 DETALLE DE DESGLOSE: EDUCACIÓN CÍVICA (`CivicaCatalog.kt`)

- [x] **Tema 01: La Persona Humana, Sujetos de Derecho y Derechos Fundamentales (Semana 1)**
  - [x] `civ_t01_s01`: La Persona Humana y Sujetos de Derecho
  - [x] `civ_t01_s02`: Atributos de la Personalidad y Fin de la Persona
  - [x] `civ_t01_s03`: Derechos Fundamentales en la Constitución Política del Perú
- [x] **Tema 02: Derechos Humanos: Evolución, Generaciones y Protección Internacional (Semana 2)**
  - [x] `civ_t02_s01`: Fundamento, Características y Declaración Universal (1948)
  - [x] `civ_t02_s02`: Las Tres Generaciones de Derechos Humanos de Karel Vasak
  - [x] `civ_t02_s03`: Sistemas Internacionales de Protección: Sistema Universal (ONU) y Sistema Interamericano (OEA)
- [x] **Tema 03: Garantías Constitucionales y el Estado Constitucional de Derecho (Semana 3)**
  - [x] `civ_t03_s01`: Hábeas Corpus y Acción de Amparo
  - [x] `civ_t03_s02`: Hábeas Data y Acción de Cumplimiento
  - [x] `civ_t03_s03`: Acción Popular e Inconstitucionalidad y el Tribunal Constitucional
- [x] **Tema 04: Familia, Parentesco, Matrimonio y Alimentos (Semana 4)**
  - [x] `civ_t04_s01`: La Familia: Naturaleza Jurídica y Tipología Sociológica
  - [x] `civ_t04_s02`: El Parentesco: Clases, Líneas y Cómputo de Grados
  - [x] `civ_t04_s03`: El Matrimonio, Uniones de Hecho, Patria Potestad y Régimen de Alimentos
- [x] **Tema 05: La Ciudadanía, Mecanismos de Participación y Control Ciudadano (Semana 5)**
  - [x] `civ_t05_s01`: Ciudadanía: Adquisición, Suspensión y Pérdida
  - [x] `civ_t05_s02`: Derechos de Participación Política: Sufragio, Iniciativa Legislativa y Referéndum
  - [x] `civ_t05_s03`: Derechos de Control Ciudadano: Revocatoria, Remoción y Demanda de Rendición de Cuentas
- [x] **Tema 06: Convivencia Democrática, Cultura de Paz y Medios de Resolución de Conflictos (Semana 6)**
  - [x] `civ_t06_s01`: Convivencia Democrática y Cultura de Paz
  - [x] `civ_t06_s02`: Los Medios Alternativos de Resolución de Conflictos (MARC)
  - [x] `civ_t06_s03`: Violencia, Discriminación y Prevención en la Sociedad Peruana
- [x] **Tema 07: Identidad Nacional, Diversidad Cultural y Patrimonio Cultural (Semana 7)**
  - [x] `civ_t07_s01`: Identidad Nacional: Símbolos Patrios e Interculturalidad
  - [x] `civ_t07_s02`: El Patrimonio Cultural de la Nación: Material e Inmaterial
  - [x] `civ_t07_s03`: Patrimonio Natural y Áreas Naturales Protegidas (SINANPE)
- [x] **Tema 08: El Estado Peruano, la Constitución y el Régimen de Excepción (Semana 8)**
  - [x] `civ_t08_s01`: El Estado Peruano: Elementos, Estructura y Deberes Primordiales
  - [x] `civ_t08_s02`: La Constitución Política: Supremacía Constitucional y Control Difuso
  - [x] `civ_t08_s03`: Regímenes de Excepción: Estado de Emergencia y Estado de Sitio
- [x] **Tema 09: Poderes del Estado: Legislativo, Ejecutivo y Judicial (Semana 9)**
  - [x] `civ_t09_s01`: Poder Legislativo: Estructura, Atribuciones y Función de Control
  - [x] `civ_t09_s02`: Poder Ejecutivo: Presidencia, Consejo de Ministros y Actos de Gobierno
  - [x] `civ_t09_s03`: Poder Judicial: Principios de la Función Jurisdiccional y Órganos
- [x] **Tema 10: Organismos Constitucionales Autónomos y Sistema Electoral (Semana 10)**
  - [x] `civ_t10_s01`: El Sistema Electoral: JNE, ONPE y RENIEC
  - [x] `civ_t10_s02`: Organismos Económicos: BCRP, SBS y Contraloría General de la República
  - [x] `civ_t10_s03`: Órganos de Justicia: JNJ, Ministerio Público y Defensoría del Pueblo
- [x] **Tema 11: Marco Normativo de la Educación Superior: Ley Universitaria 30220 y UNSA (Semana 11)**
  - [x] `civ_t11_s01`: Principios y Autonomía Universitaria (Ley 30220)
  - [x] `civ_t11_s02`: SUNEDU y el Licenciamiento Institucional de la Educación Superior
  - [x] `civ_t11_s03`: Gobierno de la Universidad Pública: Asamblea, Consejo Universitario y Rectorado (Estatuto UNSA)

---

## 📚 DETALLE DE DESGLOSE: INGLÉS (`InglesCatalog.kt`)

- [x] **Tema 01: Reading Comprehension & Short Functional Text Types (Semana 1)**
  - [x] `ing_t01_s01`: Skimming for Gist & Scanning for Specific Details
  - [x] `ing_t01_s02`: Context Clues: Inferring Word Meaning and Synonyms
  - [x] `ing_t01_s03`: Functional Texts: Public Notices, Signs and Job Announcements
  - [x] `ing_t01_s04`: Functional Texts: Emails, Messages and Travel Itineraries
- [x] **Tema 02: Thematic Reading (Profiles, Studies, Shopping & Health) (Semana 2)**
  - [x] `ing_t02_s01`: Personal & Family Backgrounds, Biographies and Personality Traits
  - [x] `ing_t02_s02`: University Life, Daily Routines & Study Habits (Key Phrasal Verbs)
  - [x] `ing_t02_s03`: Academic Careers, Majors & Professional Collocations
  - [x] `ing_t02_s04`: Nutrition, Health, Illnesses & Healthy Lifestyles
- [x] **Tema 03: Present Tenses & Stative Verbs (Semana 3)**
  - [x] `ing_t03_s01`: Present Simple: Habits, Universal Facts, 3rd Person Rules & Syntax
  - [x] `ing_t03_s02`: Adverbs of Frequency & Temporal Positioning Rules
  - [x] `ing_t03_s03`: Present Continuous: Morphology, -ING Rules & Contexts of Use
  - [x] `ing_t03_s04`: Stative Verbs vs. Dynamic Verbs & Verbs with Dual Meaning
- [x] **Tema 04: Past Simple & Future Systems (Semana 4)**
  - [x] `ing_t04_s01`: Past Simple: Regular Verbs Morphology (-ed) & Pronunciation (/t/, /d/, /ɪd/)
  - [x] `ing_t04_s02`: Past Simple: Irregular Verbs Mastery & Auxiliary Syntax (Did / Didn't)
  - [x] `ing_t04_s03`: Future with 'Be Going To': Prior Plans & Present Visual Evidence
  - [x] `ing_t04_s04`: Future with 'Will': Spontaneous Decisions, Promises & Subjective Predictions
- [x] **Tema 05: Modals, Existentials & Adjective Comparison Degrees (Semana 5)**
  - [x] `ing_t05_s01`: Modal Verbs: Can, Could (Ability & Requests) and Should (Advice)
  - [x] `ing_t05_s02`: Obligation vs. Prohibition: Must, Have to, Mustn't & Don't have to
  - [x] `ing_t05_s03`: Existential Structures: There is / There are (Present & Past)
  - [x] `ing_t05_s04`: Degrees of Comparison: Equative, Comparative & Superlative
- [x] **Tema 06: Communicative Functions & Discourse Connectors (Semana 6)**
  - [x] `ing_t06_s01`: Preferences: Like, Love, Enjoy, Hate + Gerund vs. Would Like To
  - [x] `ing_t06_s02`: Pragmatic Functions: Polite Requests, Permissions & Suggestions
  - [x] `ing_t06_s03`: Chronological Sequencing: Time Connectors & Prepositions with Gerund
  - [x] `ing_t06_s04`: Discourse Linkers: Contrast, Cause & Effect, Purpose
- [x] **Tema 07: Pronouns, Prepositions & English Syntax (Semana 7)**
  - [x] `ing_t07_s01`: Pronominal System: Subject, Object & Reflexive Pronouns
  - [x] `ing_t07_s02`: Possessives: Possessive Adjectives vs. Possessive Pronouns ('Its' vs. 'It's')
  - [x] `ing_t07_s03`: Prepositions Matrix: Specificity Pyramid (At, On, In) & Movement Prepositions
  - [x] `ing_t07_s04`: English Sentence Syntax: SVOPT Canonical Order & OSASCOMP Adjectives

---

## 📚 DETALLE DE DESGLOSE: RAZONAMIENTO VERBAL (`RazVerbalCatalog.kt`)

- [x] **Tema 01: Relaciones Semánticas Básicas (Semana 1)**
  - [x] `rv_t01_s01`: Sinonimia Contextual y Campo Semántico
  - [x] `rv_t01_s02`: Antonimia Contextual: Oposición Gradual, Complementaria y Recíproca
  - [x] `rv_t01_s03`: Polisemia, Homonimia (Homófonas y Homógrafas) y Paronimia
  - [x] `rv_t01_s04`: Precisión Léxica y Erradicación de Vocablos Vagos y Verbos Comodín
- [x] **Tema 02: Analogías Verbales (Semana 2)**
  - [x] `rv_t02_s01`: Principio Estructural y Método R-O-N (Relación, Orden, Naturaleza)
  - [x] `rv_t02_s02`: Tipología Analógica 1: Inclusión, Meronimia y Elemento-Conjunto
  - [x] `rv_t02_s03`: Tipología Analógica 2: Causa-Efecto, Intensidad y Secuencialidad
  - [x] `rv_t02_s04`: Tipología Analógica 3: Sujeto-Instrumento, Función y Analogías Verticales
- [x] **Tema 03: Series y Clasificaciones Verbales (Semana 3)**
  - [x] `rv_t03_s01`: Series Verbales Lineales Simples y Progresivas
  - [x] `rv_t03_s02`: Series Alternadas y Series por Parejas Compuestas
  - [x] `rv_t03_s03`: Discriminación de Término Excluido por Campo Semántico y Categoría
  - [x] `rv_t03_s04`: Redes Semánticas: Hiperonimia, Hiponimia y Taxonomías Conceptuales
- [x] **Tema 04: Lógica de Enunciados (Semana 4)**
  - [x] `rv_t04_s01`: Conectores Lógicos Textuales: Causa, Consecuencia, Oposición y Concesión
  - [x] `rv_t04_s02`: Completamiento de Oraciones y Detección de Rastros Verbales
  - [x] `rv_t04_s03`: Cohesión Textual: Referentes (Anáfora, Catáfora) y Elipsis
  - [x] `rv_t04_s04`: Coherencia Textual y Principio de No Contradicción
- [x] **Tema 05: Razonamiento Argumentativo Básico (Semana 5)**
  - [x] `rv_t05_s01`: Estructura Argumentativa: Tesis, Argumentos y Conclusión
  - [x] `rv_t05_s02`: Refutación, Debilitamiento y Contraargumentación
  - [x] `rv_t05_s03`: Falacias No Formales 1: Ataque Personal, Coerción y Apelación al Pueblo
  - [x] `rv_t05_s04`: Falacias No Formales 2: Autoridad Inadecuada, Ignorancia y Petición de Principio
- [x] **Tema 06: Pragmática en Enunciados (Semana 6)**
  - [x] `rv_t06_s01`: Teoría de los Actos de Habla de Austin y Searle
  - [x] `rv_t06_s02`: Principio de Cooperación y Máximas Conversacionales de Grice
  - [x] `rv_t06_s03`: Implicaturas Conversacionales, Presuposiciones e Ironía
  - [x] `rv_t06_s04`: Registro Lingüístico, Tono y Deixis Espaciotemporal
- [x] **Tema 07: Corrección por Sentido (Semana 7)**
  - [x] `rv_t07_s01`: Ambigüedad Léxica y Anfibología Sintáctica
  - [x] `rv_t07_s02`: Pleonasmo, Redundancia Viciosa y Economía Verbal
  - [x] `rv_t07_s03`: Impropiedad Léxica y Barbarismos en el Registro Académico
  - [x] `rv_t07_s04`: Discordancia Gramatical, Solecismos y Régimen Preposicional
- [x] **Tema 08: Resolución de Problemas Verbales (Semana 8)**
  - [x] `rv_t08_s01`: Plan de Redacción: Criterio Deductivo (De lo General a lo Particular)
  - [x] `rv_t08_s02`: Plan de Redacción: Criterio Cronológico y Proceso Causal
  - [x] `rv_t08_s03`: Eliminación de Oraciones por Criterio de Inatingencia (Impertinencia)
  - [x] `rv_t08_s04`: Eliminación de Oraciones por Redundancia y Resolución de Paradojas

---

## 📚 DETALLE DE DESGLOSE: COMPRENSIÓN LECTORA (`ComprensionLectoraCatalog.kt`)

- [x] **Tema 01: Comprensión Literal (Semana 1)**
  - [x] `cl_t01_s01`: Información Explícita Directa y Localización de Datos (Scanning)
  - [x] `cl_t01_s02`: Paráfrasis Fiel y Equivalencia Textual
  - [x] `cl_t01_s03`: Preguntas de Compatibilidad e Incompatibilidad Literal
  - [x] `cl_t01_s04`: Distractores Clásicos en Lectura Literal: Generalización Indebida y Distorsión
- [x] **Tema 02: Comprensión Inferencial (Semana 2)**
  - [x] `cl_t02_s01`: La Inferencia Lógica: Deducción, Inducción y Rastro Textual
  - [x] `cl_t02_s02`: Tipología de Inferencias: Prospectiva, Causal y Taxonómica
  - [x] `cl_t02_s03`: Extrapolación Textual: Cognitiva, Condicional y Opositiva
  - [x] `cl_t02_s04`: Distractores en Inferencia: La Sobreinterpretación y la Especulación
- [x] **Tema 03: Jerarquía Textual (Semana 3)**
  - [x] `cl_t03_s01`: Determinación del Tema Central y Eje Monográfico
  - [x] `cl_t03_s02`: Identificación de la Idea Principal (Tesis Textual)
  - [x] `cl_t03_s03`: El Mejor Título para el Texto: Concisión y Cobertura
  - [x] `cl_t03_s04`: Tipología de Párrafos: Analizante, Sintetizante, Encuadrado y Paralelo
- [x] **Tema 04: Pragmática y Propósito Comunicativo (Semana 4)**
  - [x] `cl_t04_s01`: El Propósito Comunicativo del Autor (Informar, Persuadir, Polemizar)
  - [x] `cl_t04_s02`: Tono del Texto y Postura Subjetiva del Emisor
  - [x] `cl_t04_s03`: El Destinatario y la Situación Comunicativa Pragmática
  - [x] `cl_t04_s04`: Actos Ilocutivos en la Argumentación Textual
- [x] **Tema 05: Comprensión Crítica y Evaluación del Texto (Semana 5)**
  - [x] `cl_t05_s01`: Hechos vs. Opiniones y Juicios de Valor
  - [x] `cl_t05_s02`: Validez, Solidez y Confiabilidad de las Fuentes de Información
  - [x] `cl_t05_s03`: Detección de Sesgos Ideológicos y Manipulación Argumentativa
  - [x] `cl_t05_s04`: Análisis Crítico de Tablas, Infografías y Textos Mixtos
- [x] **Tema 06: Sentido Contextual (Semana 6)**
  - [x] `cl_t06_s01`: Sentido Denotativo vs. Sentido Connotativo en Textos
  - [x] `cl_t06_s02`: Sinonimia y Antonimia Contextual en la Lectura
  - [x] `cl_t06_s03`: Sentido Figurado, Metáforas y Lenguaje Alegórico
  - [x] `cl_t06_s04`: Términos Técnicos, Neologismos y Tecnolectos Científicos
- [x] **Tema 07: Cohesión y Coherencia Textual (Semana 7)**
  - [x] `cl_t07_s01`: Mecanismos de Cohesión: Anáforas, Catáforas y Sustitución Léxica
  - [x] `cl_t07_s02`: Conectores Lógicos y Marcadores del Discurso en la Comprensión
  - [x] `cl_t07_s03`: Progresión Temática: Modelos de Tema Constante, Lineal y Derivado
  - [x] `cl_t07_s04`: Detección de Rupturas de Coherencia y Saltos Lógicos
- [x] **Tema 08: Tipología Textual por Formato y Contenido (Semana 8)**
  - [x] `cl_t08_s01`: Textos Expositivos y Científicos: Estructura y Divulgación
  - [x] `cl_t08_s02`: Textos Argumentativos y Ensayísticos: Tesis y Controversia Dialéctica
  - [x] `cl_t08_s03`: Textos Narrativos y Biográficos: Trama, Conflicto y Cronología
  - [x] `cl_t08_s04`: Textos Filosóficos y Humanísticos: Densidad Conceptual y Problematización

---

## 📚 DETALLE DE DESGLOSE: RAZONAMIENTO LÓGICO (`RazLogicoCatalog.kt`)

- [x] **Tema 01: Proposiciones y Enunciados Lógicos (Semana 1)**
  - [x] `rl_t01_s01`: Concepto de Enunciado, Proposición Lógica y Criterios de Bivalencia
  - [x] `rl_t01_s02`: Enunciados No Proposicionales, Juicios de Valor y Paradojas Lógicas
  - [x] `rl_t01_s03`: Enunciados Abiertos, Variables y Funciones Proposicionales
  - [x] `rl_t01_s04`: Proposiciones Simples (Predicativas y Relacionales) vs. Compuestas (Moleculares)
- [x] **Tema 02: Conectores Lógicos y Tablas de Verdad (Semana 2)**
  - [x] `rl_t02_s01`: La Negación, la Conjunción y la Disyunción Débil (Inclusiva)
  - [x] `rl_t02_s02`: El Condicional Material (Directo e Inverso) y el Bicondicional
  - [x] `rl_t02_s03`: Disyunción Fuerte (Exclusiva) y Operadores Especiales (Sheffer y Peirce)
  - [x] `rl_t02_s04`: Construcción y Evaluación de Tablas de Verdad: Tautología, Contradicción y Contingencia
- [x] **Tema 03: Relaciones Lógicas entre Proposiciones (Semana 3)**
  - [x] `rl_t03_s01`: Relaciones de Condición: Condición Suficiente vs. Condición Necesaria
  - [x] `rl_t03_s02`: Relación de Causa-Efecto y Nexos Condicionales Directos e Inversos
  - [x] `rl_t03_s03`: Equivalencia Lógica e Implicación Tautológica entre Proposiciones
  - [x] `rl_t03_s04`: Oposición, Contradicción, Contrariedad e Incompatibilidad de Testimonios
- [x] **Tema 04: Inferencias Lógicas y Reglas de Inferencia (Semana 4)**
  - [x] `rl_t04_s01`: Tipos de Inferencia: Deductiva (Necesaria) vs. Inductiva y Abductiva (Probables)
  - [x] `rl_t04_s02`: Estructura del Razonamiento: Premisas, Conclusión y Validez vs. Verdad
  - [x] `rl_t04_s03`: Reglas Clásicas de Inferencia: Modus Ponens, Modus Tollens y Silogismo Hipotético
  - [x] `rl_t04_s04`: Silogismo Disyuntivo, Dilemas Lógicos y Falacias Formales de Inferencia
- [x] **Tema 05: Silogismos y Razonamiento Deductivo Básico (Semana 5)**
  - [x] `rl_t05_s01`: Proposiciones Categóricas Típicas (A, E, I, O) y Cuadro Tradicional de Boecio
  - [x] `rl_t05_s02`: Estructura del Silogismo Categórico: Términos (Mayor, Menor y Medio) y Premisas
  - [x] `rl_t05_s03`: Las 8 Reglas Aristotélicas de Validez Silogística y Falacias Formales
  - [x] `rl_t05_s04`: Validación por Diagramas de Venn de Tres Clases Intersecadas
- [x] **Tema 06: Consistencia y Coherencia Lógica (Semana 6)**
  - [x] `rl_t06_s01`: Consistencia Lógica y Satisfacibilidad de un Conjunto de Premisas
  - [x] `rl_t06_s02`: Contradicción Formal Interna (p ∧ ¬p) e Incompatibilidad Contextual
  - [x] `rl_t06_s03`: Problemas de Verdades y Mentiras: Principio de Contradicción y Equivalencia
  - [x] `rl_t06_s04`: Método de Suposición Hipotética y Resolución de Paradojas de Veracidad
- [x] **Tema 07: Razonamiento con Condicionales (Semana 7)**
  - [x] `rl_t07_s01`: Estructura del Condicional: Antecedente, Consecuente y Jerarquía Causal
  - [x] `rl_t07_s02`: Condiciones Lógicas: Condición Suficiente vs. Condición Necesaria en Contexto
  - [x] `rl_t07_s03`: Leyes de Inferencia Válida: Modus Ponens, Modus Tollens y Silogismo Hipotético
  - [x] `rl_t07_s04`: Falacias Formales Clásicas: Afirmación del Consecuente y Negación del Antecedente
- [x] **Tema 08: Organización y Orden Lógico (Semana 8)**
  - [x] `rl_t08_s01`: Ordenamiento Lineal Horizontal: Posiciones Relativas y Absolutas (Izquierda/Derecha, Oeste/Este)
  - [x] `rl_t08_s02`: Ordenamiento Lineal Vertical: Edificios, Estaturas, Jerarquías y Puntajes
  - [x] `rl_t08_s03`: Ordenamiento Circular y Distribución Simétrica (Frente a Frente, Lateralidad Relativa)
  - [x] `rl_t08_s04`: Cuadro de Decisiones: Matrices Lógicas de Doble Entrada y Tablas de Descarte Cruzado
- [x] **Tema 09: Detección de Falacias Simples (Semana 9)**
  - [x] `rl_t09_s01`: Concepto de Falacia: Sofismas vs. Paralogismos y Falacias Formales vs. No Formales
  - [x] `rl_t09_s02`: Falacias de Atingencia 1: Ad Hominem, Ad Baculum, Ad Populum y Ad Verecundiam
  - [x] `rl_t09_s03`: Falacias de Atingencia 2: Causa Falsa (Post Hoc), Generalización Indebida y Ad Ignorantiam
  - [x] `rl_t09_s04`: Falacias de Ambigüedad: El Equívoco, la Anfibología, Énfasis y Composición/División

---

## 📚 DETALLE DE DESGLOSE: RAZONAMIENTO MATEMÁTICO (`RazMatematicoCatalog.kt`)

- [x] **Tema 01: Razonamiento Numérico y Regularidades (Semana 1)**
  - [x] `rm_t01_s01`: Sucesiones Aritméticas Lineales y Progresiones Aritméticas (Término Enésimo y Suma)
  - [x] `rm_t01_s02`: Sucesiones Cuadráticas de Segundo Orden (Método de Diferencias Previas)
  - [x] `rm_t01_s03`: Progresiones Geométricas y Series Infinitas Convergentes (Suma Límite)
  - [x] `rm_t01_s04`: Distribuciones Numéricas, Arreglos Gráficos y Sucesiones Recurrentes Notables (Fibonacci)
- [x] **Tema 02: Magnitudes y Proporcionalidad (Semana 2)**
  - [x] `rm_t02_s01`: Razones y Proporciones: Aritméticas, Geométricas, Continuas y Discretas
  - [x] `rm_t02_s02`: Magnitudes Directa e Inversamente Proporcionales (D.P. e I.P.) y Reparto Proporcional
  - [x] `rm_t02_s03`: Regla de Tres Simple y Compuesta: Método Causa - Circunstancia - Efecto
  - [x] `rm_t02_s04`: Tanto por Ciento: Variaciones Porcentuales, Descuentos/Aumentos Sucesivos y Aplicaciones Comerciales
- [x] **Tema 03: Razonamiento Algebraico Intuitivo y Edades (Semana 3)**
  - [x] `rm_t03_s01`: Planteo de Ecuaciones: Traducción Verbal a Expresiones Algebraicas y el Rol de la Coma
  - [x] `rm_t03_s02`: Problemas de Edades para un Sujeto y para Varios Sujetos (Diferencia Constante de Edades)
  - [x] `rm_t03_s03`: Relación entre Año de Nacimiento, Año Actual y Cumpleaños
  - [x] `rm_t03_s04`: Métodos Operativos Prácticos: Regla Conjunta, Método del Rombo y Balanzas en Equilibrio
- [x] **Tema 04: Razonamiento Geométrico, Áreas y Perímetros (Semana 4)**
  - [x] `rm_t04_s01`: Áreas de Regiones Sombreadas: Método de Traslación, Simetría y Diferencia de Áreas
  - [x] `rm_t04_s02`: Relaciones de Áreas en Triángulos, Medianas, Baricentro y Cuadriláteros
  - [x] `rm_t04_s03`: Perímetros y Contornos: Longitud de Curvas, Semicircunferencias y Proyección Ortogonal
  - [x] `rm_t04_s04`: Conteo Inductivo de Figuras (Segmentos, Triángulos, Cuadriláteros) y Visualización Espacial
- [x] **Tema 05: Análisis Combinatorio Intuitivo y Conteo (Semana 5)**
  - [x] `rm_t05_s01`: Principios Fundamentales del Conteo: Principio de Adición (O) y de Multiplicación (Y)
  - [x] `rm_t05_s02`: Problemas de Rutas, Caminos y Redes Viales (Método del Triángulo de Pascal)
  - [x] `rm_t05_s03`: Agrupaciones donde SÍ Importa el Orden: Permutaciones Lineales, Circulares y con Repetición
  - [x] `rm_t05_s04`: Agrupaciones donde NO Importa el Orden: Combinaciones Simples y Equipos con Restricciones
- [x] **Tema 06: Probabilidad Intuitiva y Condicional (Semana 6)**
  - [x] `rm_t06_s01`: Conceptos Fundamentales: Experimento Aleatorio, Espacio Muestral y Sucesos (Seguro, Imposible)
  - [x] `rm_t06_s02`: Regla Clásica de Laplace y Probabilidad del Suceso Contrario (Complemento)
  - [x] `rm_t06_s03`: Álgebra de Eventos: Eventos Mutuamente Excluyentes, Independientes y Regla del Producto
  - [x] `rm_t06_s04`: Probabilidad Condicional y Extracciones en Urnas (Con y Sin Reposición)
- [x] **Tema 07: Estadística y Análisis de Datos (Semana 7)**
  - [x] `rm_t07_s01`: Tablas de Distribución de Frecuencias (Absoluta, Relativa y Acumuladas)
  - [x] `rm_t07_s02`: Representación Gráfica: Diagramas de Barras, Histogramas y Diagramas Circulares (Sectores)
  - [x] `rm_t07_s03`: Medidas de Tendencia Central: Media Aritmética (Simple y Ponderada), Mediana y Moda
  - [x] `rm_t07_s04`: Medidas de Dispersión y Posición: Rango, Varianza, Desviación Estándar y Cuartiles

---

## 📚 DETALLE DE DESGLOSE: ARITMÉTICA (`AritmeticaCatalog.kt`)

- [x] **Tema 01: Relaciones Lógicas y Conjuntos (Semana 1)**
  - [x] `ari_t01_s01`: 1.1 Noción de Conjunto, Pertenencia e Inclusión
  - [x] `ari_t01_s02`: 1.2 Conjunto Potencia y Subconjuntos Propios
  - [x] `ari_t01_s03`: 1.3 Operaciones con Conjuntos y Álgebra Booleana
  - [x] `ari_t01_s04`: 1.4 Problemas de Cardinales: Venn-Euler y Lewis Carroll
- [x] **Tema 02: Sistema de los Números Naturales (N) (Semana 2)**
  - [x] `ari_t02_s01`: 2.1 Estructura de N y Principio del Buen Orden
  - [x] `ari_t02_s02`: 2.2 Sistemas de Numeración y Descomposición Polinómica
  - [x] `ari_t02_s03`: 2.3 Métodos de Cambio de Base y Cifras Máximas
  - [x] `ari_t02_s04`: 2.4 Conteo de Números y Cifras (Tipos de Imprenta)
- [x] **Tema 03: Divisibilidad, Primos, MCD y MCM (Semana 3)**
  - [x] `ari_t03_s01`: 3.1 Aritmética Modular y Criterios Notables de Divisibilidad
  - [x] `ari_t03_s02`: 3.2 Números Primos, Compuestos y Descomposición Canónica
  - [x] `ari_t03_s03`: 3.3 Estudio Analítico de los Divisores (CD, SD, SID, PD)
  - [x] `ari_t03_s04`: 3.4 Máximo Común Divisor (MCD) y Mínimo Común Múltiplo (MCM)
- [x] **Tema 04: Sistema de los Números Enteros (Z) (Semana 4)**
  - [x] `ari_t04_s01`: 4.1 Estructura de Z y Operaciones Fundamentales
  - [x] `ari_t04_s02`: 4.2 Algoritmo de la División Entera: Defecto y Exceso
  - [x] `ari_t04_s03`: 4.3 Complemento Aritmético (CA) y Propiedades
  - [x] `ari_t04_s04`: 4.4 Ecuaciones Diofánticas Lineales
- [x] **Tema 05: Sistema de los Números Racionales (Q) (Semana 5)**
  - [x] `ari_t05_s01`: 5.1 Fracciones: Clasificación Formal y Equivalencia
  - [x] `ari_t05_s02`: 5.2 Reducción a la Unidad: Tanques, Grifos y Rendimiento
  - [x] `ari_t05_s03`: 5.3 Números Decimales y Fracción Generatriz
  - [x] `ari_t05_s04`: 5.4 Densidad en Q y Promedios (MA, MG, MH)
- [x] **Tema 06: Razones y Proporciones (Semana 6)**
  - [x] `ari_t06_s01`: 6.1 Razones Aritmética y Geométrica
  - [x] `ari_t06_s02`: 6.2 Proporciones Discretas y Continuas
  - [x] `ari_t06_s03`: 6.3 Serie de Razones Geométricas Equivalentes (SRGE)
  - [x] `ari_t06_s04`: 6.4 Aplicaciones Prácticas a Mezclas y Edades
- [x] **Tema 07: Magnitudes y Proporcionalidad (Semana 7)**
  - [x] `ari_t07_s01`: 7.1 Magnitudes Directa e Inversamente Proporcionales
  - [x] `ari_t07_s02`: 7.2 Relaciones Compuestas de Magnitudes y Gráficas
  - [x] `ari_t07_s03`: 7.3 Reparto Proporcional Simple y Compuesto
  - [x] `ari_t07_s04`: 7.4 Regla de Compañía (Sociedades Mercantiles)
- [x] **Tema 08: Porcentajes (Semana 8)**
  - [x] `ari_t08_s01`: 8.1 Concepto de Tanto por Ciento y Operaciones Básicas
  - [x] `ari_t08_s02`: 8.2 Aumentos y Descuentos Sucesivos
  - [x] `ari_t08_s03`: 8.3 Aplicaciones Comerciales: Precio de Venta, Costo y Ganancia
  - [x] `ari_t08_s04`: 8.4 Variaciones Porcentuales Geométricas y de Magnitudes
- [x] **Tema 09: Sucesiones y Progresiones (Semana 9)**
  - [x] `ari_t09_s01`: 9.1 Progresión Aritmética (PA): Término Enésimo y Suma
  - [x] `ari_t09_s02`: 9.2 Sucesiones Cuadráticas (Segundo Orden)
  - [x] `ari_t09_s03`: 9.3 Progresión Geométrica (PG) y Serie Decreciente Infinita
  - [x] `ari_t09_s04`: 9.4 Interpolación de Medios y Aplicaciones Reales
- [x] **Tema 10: Sumatorias y Aplicaciones Aritméticas (Semana 10)**
  - [x] `ari_t10_s01`: 10.1 Notación Sigma (∑) y Propiedades Fundamentales
  - [x] `ari_t10_s02`: 10.2 Series Notables: Naturales, Impares y Cuadrados
  - [x] `ari_t10_s03`: 10.3 Series Notables Cúbicas y Productos Binarios
  - [x] `ari_t10_s04`: 10.4 Regla de Interés Simple y Monto Comercial
- [x] **Tema 11: Estadística Descriptiva y Dispersión (Semana 11)**
  - [x] `ari_t11_s01`: 11.1 Tablas de Distribución de Frecuencias y Gráficos
  - [x] `ari_t11_s02`: 11.2 Medidas de Tendencia Central: Media, Mediana y Moda
  - [x] `ari_t11_s03`: 11.3 Medidas de Posición: Cuartiles, Deciles y Percentiles
  - [x] `ari_t11_s04`: 11.4 Medidas de Dispersión: Varianza, Desviación Estándar y CV
- [x] **Tema 12: Análisis Combinatorio (Semana 12)**
  - [x] `ari_t12_s01`: 12.1 Principios Fundamentales del Conteo: Adición y Multiplicación
  - [x] `ari_t12_s02`: 12.2 Permutaciones Lineales y Circulares
  - [x] `ari_t12_s03`: 12.3 Permutaciones con Elementos Repetidos y Cuadrículas
  - [x] `ari_t12_s04`: 12.4 Combinaciones Simples y Agrupaciones en Comisiones
- [x] **Tema 13: Probabilidad (Semana 13)**
  - [x] `ari_t13_s01`: 13.1 Espacio Muestral, Sucesos y Álgebra de Eventos
  - [x] `ari_t13_s02`: 13.2 Probabilidad Clásica de Laplace y Axiomas
  - [x] `ari_t13_s03`: 13.3 Regla de la Adición: Eventos Excluyentes y Compatibles
  - [x] `ari_t13_s04`: 13.4 Probabilidad Condicional y Eventos Independientes

---

## 📚 DETALLE DE DESGLOSE: HISTORIA UNIVERSAL (`HistoriaUniversalCatalog.kt`)

- [x] **Tema 01: Hominización y Prehistoria (Semana 1)**
  - [x] `hu_t01_s01`: 1.1 Proceso de Hominización y Factores Evolutivos
  - [x] `hu_t01_s02`: 1.2 Paleolítico: Inferior, Medio y Superior
  - [x] `hu_t01_s03`: 1.3 Mesolítico: Transición Climática y Semisedentarismo
  - [x] `hu_t01_s04`: 1.4 Neolítico: Revolución Agropecuaria y Edad de los Metales
- [x] **Tema 02: Civilizaciones de Oriente (Mesopotamia y Egipto) (Semana 2)**
  - [x] `hu_t02_s01`: 2.1 Mesopotamia: Sumerios, Acadios y Primer Imperio Babilónico
  - [x] `hu_t02_s02`: 2.2 Imperio Asirio y Segundo Imperio Babilónico (Neobabilónico)
  - [x] `hu_t02_s03`: 2.3 Egipto Antiguo: Periodos Históricos y Faraones Notables
  - [x] `hu_t02_s04`: 2.4 Egipto: Organización Social, Religión y Momificación
- [x] **Tema 03: Grecia Clásica (Semana 3)**
  - [x] `hu_t03_s01`: 3.1 Civilizaciones del Egeo: Cretense y Micénica
  - [x] `hu_t03_s02`: 3.2 Esparta vs. Atenas: Modelos Políticos y Sociales
  - [x] `hu_t03_s03`: 3.3 Las Guerras Médicas y el Siglo de Pericles
  - [x] `hu_t03_s04`: 3.4 La Guerra del Peloponeso y el Helenismo de Alejandro Magno
- [x] **Tema 04: Roma Antigua (Semana 4)**
  - [x] `hu_t04_s01`: 4.1 Monarquía Romana y Orígenes del Estado
  - [x] `hu_t04_s02`: 4.2 República Romana: Patricios vs. Plebeyos y Ley de las XII Tablas
  - [x] `hu_t04_s03`: 4.3 Expansión Territorial, Guerras Púnicas y Crisis de la República
  - [x] `hu_t04_s04`: 4.4 El Imperio Romano: Pax Romana, Cristianismo y Caída de Occidente
- [x] **Tema 05: Edad Media Europea (Semana 5)**
  - [x] `hu_t05_s01`: 5.1 Reinos Bárbaros y el Imperio Carolingio
  - [x] `hu_t05_s02`: 5.2 El Imperio Bizantino y la Expansión Islámica
  - [x] `hu_t05_s03`: 5.3 El Sistema Feudal: Señorío, Vasallaje y Servidumbre
  - [x] `hu_t05_s04`: 5.4 Las Cruzadas y el Renacimiento Urbano-Comercial Medieval
- [x] **Tema 06: Edad Moderna y Revoluciones (Semana 6)**
  - [x] `hu_t06_s01`: 6.1 Humanismo y Renacimiento Artístico
  - [x] `hu_t06_s02`: 6.2 Reforma Protestante (Lutero, Calvino) y Contrarreforma Católica
  - [x] `hu_t06_s03`: 6.3 Monarquías Absolutistas y la Ilustración del Siglo XVIII
  - [x] `hu_t06_s04`: 6.4 Independencia de las Trece Colonias y Revolución Francesa
- [x] **Tema 07: Siglo XIX: Restauración, Revoluciones Liberales e Imperialismo (Semana 7)**
  - [x] `hu_t07_s01`: 7.1 La Era Napoleónica y la Restauración del Congreso de Viena
  - [x] `hu_t07_s02`: 7.2 Las Revoluciones Liberales de 1830 y 1848
  - [x] `hu_t07_s03`: 7.3 Primera y Segunda Revolución Industrial
  - [x] `hu_t07_s04`: 7.4 Imperialismo Colonial y Paz Armada en Europa
- [x] **Tema 08: El Siglo XX y el Mundo Contemporáneo (Semana 8)**
  - [x] `hu_t08_s01`: 8.1 Primera Guerra Mundial y Revolución Rusa de 1917
  - [x] `hu_t08_s02`: 8.2 Periodo de Entreguerras, Fascismo y Crack del 29
  - [x] `hu_t08_s03`: 8.3 Segunda Guerra Mundial y el Holocausto
  - [x] `hu_t08_s04`: 8.4 Guerra Fría, Descolonización y Globalización

---

## 📚 DETALLE DE DESGLOSE: HISTORIA DEL PERÚ (`HistoriaPeruCatalog.kt`)

- [x] **Tema 01: Poblamiento Americano, Periodo Lítico y Arcaico (Semana 1)**
  - [x] `hp_t01_s01`: 1.1 Teorías Científicas del Poblamiento Americano (Hrdlicka, Rivet, Mendes Correia)
  - [x] `hp_t01_s02`: 1.2 El Periodo Lítico Andino: Cazadores y Pescadores (Paiján, Lauricocha, Toquepala)
  - [x] `hp_t01_s03`: 1.3 Periodo Arcaico Inferior: Horticultura y Pastoreo (Nanchoc, Guitarrero II, Telarmachay)
  - [x] `hp_t01_s04`: 1.4 Periodo Arcaico Superior: Revolución Agrícola y Caral
- [x] **Tema 02: Altas Culturas Preíncas: Horizontes e Intermedios (Semana 2)**
  - [x] `hp_t02_s01`: 2.1 El Formativo Andino y Chavín: Primer Horizonte Panandino
  - [x] `hp_t02_s02`: 2.2 La Cultura Paracas: Medicina, Sociedad y Textilería
  - [x] `hp_t02_s03`: 2.3 El Intermedio Temprano: Maestros Artesanos (Moche y Nazca)
  - [x] `hp_t02_s04`: 2.4 Horizonte Medio (Tiahuanaco y Wari) e Intermedio Tardío (Chimú y Chincha)
- [x] **Tema 03: El Tahuantinsuyo: Expansión, Organización y Caída (Semana 3)**
  - [x] `hp_t03_s01`: 3.1 Orígenes, Dinastías y Expansión Imperial Incaica (Pachacútec a Huayna Cápac)
  - [x] `hp_t03_s02`: 3.2 Organización Política y Territorial del Tahuantinsuyo (Suyus, Tucuyricuy, Curaca)
  - [x] `hp_t03_s03`: 3.3 Economía y Trabajo: Ayllu, Reciprocidad y Mita
  - [x] `hp_t03_s04`: 3.4 Cosmovisión, Arte y Caída del Tahuantinsuyo (Alianzas y Guerra Civil)
- [x] **Tema 04: Invasión Hispana y Virreinato del Perú (Semana 4)**
  - [x] `hp_t04_s01`: 4.1 Los Viajes de Pizarro y la Invasión al Tahuantinsuyo (Capitulación de Toledo)
  - [x] `hp_t04_s02`: 4.2 Guerras Civiles entre Conquistadores y Creación del Virreinato (Leyes Nuevas)
  - [x] `hp_t04_s03`: 4.3 La Organización Toledana: Mita, Reducciones y Minería (Potosí y Huancavelica)
  - [x] `hp_t04_s04`: 4.4 Sociedad Estamental, Castas y Sistema Fiscal Colonial (Quinto Real, Alcabala)
- [x] **Tema 05: Reformas Borbónicas y Movimientos Anticoloniales (Semana 5)**
  - [x] `hp_t05_s01`: 5.1 Las Reformas Borbónicas del Siglo XVIII (Pérdida de Potosí, Intendencias)
  - [x] `hp_t05_s02`: 5.2 La Rebelión de Juan Santos Atahualpa en la Selva Central (Gran Pajonal)
  - [x] `hp_t05_s03`: 5.3 La Gran Rebelión de Túpac Amaru II (Fase Quechua y Aimara, Micaela Bastidas)
  - [x] `hp_t05_s04`: 5.4 Precursores de la Independencia: Reformistas y Separatistas (Vizcardo y Guzmán)
- [x] **Tema 06: Proceso de Emancipación e Independencia Nacional (Semana 6)**
  - [x] `hp_t06_s01`: 6.1 Rebeliones Criollas del Siglo XIX y Represión de Abascal (Zela, Melgar, Pumacahua)
  - [x] `hp_t06_s02`: 6.2 Corriente Libertadora del Sur y el Protectorado de San Martín
  - [x] `hp_t06_s03`: 6.3 La Entrevista de Guayaquil y el Primer Congreso Constituyente (Riva Agüero)
  - [x] `hp_t06_s04`: 6.4 Corriente Libertadora del Norte: Junín, Ayacucho y Capitulación de 1824
- [x] **Tema 07: República Temprana, Prosperidad Falaz y Guerra del Salitre (Semana 7)**
  - [x] `hp_t07_s01`: 7.1 El Primer Militarismo y la Confederación Perú-Boliviana (Yungay)
  - [x] `hp_t07_s02`: 7.2 La Prosperidad Falaz y el Boom del Guano de Islas (Castilla y Contrato Dreyfus)
  - [x] `hp_t07_s03`: 7.3 La Guerra del Pacífico: Orígenes y Campaña Marítima (Miguel Grau y Angamos)
  - [x] `hp_t07_s04`: 7.4 Campañas Terrestres, la Resistencia de la Breña y Tratado de Ancón (Cáceres)
- [x] **Tema 08: República Aristocrática, Oncenio y Siglos XX-XXI (Semana 8)**
  - [x] `hp_t08_s01`: 8.1 La Reconstrucción Nacional y la República Aristocrática (Jornada de 8 Horas de 1919)
  - [x] `hp_t08_s02`: 8.2 El Oncenio de Augusto B. Leguía (1919 - 1930) y Tratado de Lima de 1929
  - [x] `hp_t08_s03`: 8.3 Del Tercer Militarismo a la Revolución de las Fuerzas Armadas (Reforma Agraria 1969)
  - [x] `hp_t08_s04`: 8.4 Retorno Democrático, Conflicto Armado y el Perú Contemporáneo (Const. 1979/1993)

---

## 📚 DETALLE DE DESGLOSE: ÁLGEBRA (`AlgebraCatalog.kt` - 64 Niveles)

- [x] **Tema 01: Leyes de Exponentes y Radicales (Semana 1)** (`alg_t01_s01` a `alg_t01_s04`)
- [x] **Tema 02: Polinomios y Valor Numérico (Semana 2)** (`alg_t02_s01` a `alg_t02_s04`)
- [x] **Tema 03: Productos Notables e Identidades (Semana 3)** (`alg_t03_s01` a `alg_t03_s04`)
- [x] **Tema 04: División Polinomial, Horner, Ruffini y Teorema del Resto (Semana 4)** (`alg_t04_s01` a `alg_t04_s04`)
- [x] **Tema 05: Cocientes Notables y Término General (Semana 5)** (`alg_t05_s01` a `alg_t05_s04`)
- [x] **Tema 06: Factorización de Polinomios (Semana 6)** (`alg_t06_s01` a `alg_t06_s04`)
- [x] **Tema 07: Fracciones Algebraicas, MCD y MCM (Semana 7)** (`alg_t07_s01` a `alg_t07_s04`)
- [x] **Tema 08: Radicación y Racionalización (Semana 8)** (`alg_t08_s01` a `alg_t08_s04`)
- [x] **Tema 09: Ecuaciones de Primer Grado y Lineales (Semana 9)** (`alg_t09_s01` a `alg_t09_s04`)
- [x] **Tema 10: Ecuaciones de Segundo Grado y Teorema de Cardano-Vieta (Semana 10)** (`alg_t10_s01` a `alg_t10_s04`)
- [x] **Tema 11: Ecuaciones de Grado Superior y Bicuadradas (Semana 11)** (`alg_t11_s01` a `alg_t11_s04`)
- [x] **Tema 12: Sistemas de Ecuaciones Lineales y No Lineales (Semana 12)** (`alg_t12_s01` a `alg_t12_s04`)
- [x] **Tema 13: Desigualdades e Inecuaciones de Primer y Segundo Grado (Semana 13)** (`alg_t13_s01` a `alg_t13_s04`)
- [x] **Tema 14: Inecuaciones Fraccionarias, Polinomiales y Racionales (Semana 14)** (`alg_t14_s01` a `alg_t14_s04`)
- [x] **Tema 15: Valor Absoluto en Ecuaciones e Inecuaciones (Semana 15)** (`alg_t15_s01` a `alg_t15_s04`)
- [x] **Tema 16: Funciones Reales: Dominio, Rango y Gráficas (Semana 16)** (`alg_t16_s01` a `alg_t16_s04`)

---

## 📚 DETALLE DE DESGLOSE: GEOMETRÍA (`GeometriaCatalog.kt` - 44 Niveles)

- [x] **Tema 01: Segmentos de Recta y Ángulos (Semana 1)** (`geo_t01_s01` a `geo_t01_s04`)
- [x] **Tema 02: Triángulos: Propiedades Fundamentales y Líneas Notables (Semana 2)** (`geo_t02_s01` a `geo_t02_s04`)
- [x] **Tema 03: Congruencia de Triángulos y Aplicaciones (Semana 3)** (`geo_t03_s01` a `geo_t03_s04`)
- [x] **Tema 04: Polígonos y Cuadriláteros (Semana 4)** (`geo_t04_s01` a `geo_t04_s04`)
- [x] **Tema 05: Circunferencia: Ángulos, Propiedades y Posiciones Relativas (Semana 5)** (`geo_t05_s01` a `geo_t05_s04`)
- [x] **Tema 06: Proporcionalidad Geométrica y Semejanza de Triángulos (Semana 6)** (`geo_t06_s01` a `geo_t06_s04`)
- [x] **Tema 07: Relaciones Métricas en Triángulos Rectángulos y Oblicuángulos (Semana 7)** (`geo_t07_s01` a `geo_t07_s04`)
- [x] **Tema 08: Relaciones Métricas en la Circunferencia y Polígonos Regulares (Semana 8)** (`geo_t08_s01` a `geo_t08_s04`)
- [x] **Tema 09: Áreas de Regiones Triangulares y Cuadrangulares (Semana 9)** (`geo_t09_s01` a `geo_t09_s04`)
- [x] **Tema 10: Áreas de Regiones Circulares y Geometría del Espacio (Semana 10)** (`geo_t10_s01` a `geo_t10_s04`)
- [x] **Tema 11: Sólidos Geométricos: Prisma, Cilindro, Pirámide, Cono y Esfera (Semana 11)** (`geo_t11_s01` a `geo_t11_s04`)

---

## 📚 DETALLE DE DESGLOSE: TRIGONOMETRÍA (`TrigonometriaCatalog.kt` - 48 Niveles)

- [x] **Tema 01: Sistemas de Medición Angular y Longitud de Arco (Semana 1)** (`tri_t01_s01` a `tri_t01_s04`)
- [x] **Tema 02: Sector Circular, Trapecio Circular y Aplicaciones (Semana 2)** (`tri_t02_s01` a `tri_t02_s04`)
- [x] **Tema 03: Razones Trigonométricas en Triángulos Rectángulos (Semana 3)** (`tri_t03_s01` a `tri_t03_s04`)
- [x] **Tema 04: Triángulos Notables y Resolución de Triángulos Rectángulos (Semana 4)** (`tri_t04_s01` a `tri_t04_s04`)
- [x] **Tema 05: Ángulos Verticales (Elevación, Depresión) y Horizontales (Semana 5)** (`tri_t05_s01` a `tri_t05_s04`)
- [x] **Tema 06: Razones Trigonométricas de Ángulos en Posición Normal y Coterminales (Semana 6)** (`tri_t06_s01` a `tri_t06_s04`)
- [x] **Tema 07: Reducción al Primer Cuadrante (Semana 7)** (`tri_t07_s01` a `tri_t07_s04`)
- [x] **Tema 08: Circunferencia Trigonométrica (Líneas Seno, Coseno, Tangente) (Semana 8)** (`tri_t08_s01` a `tri_t08_s04`)
- [x] **Tema 09: Identidades Trigonométricas Fundamentales y Auxiliares (Semana 9)** (`tri_t09_s01` a `tri_t09_s04`)
- [x] **Tema 10: Arcos Compuestos: Suma y Diferencia de Ángulos (Semana 10)** (`tri_t10_s01` a `tri_t10_s04`)
- [x] **Tema 11: Arco Doble, Triple y Mitad (Semana 11)** (`tri_t11_s01` a `tri_t11_s04`)
- [x] **Tema 12: Transformaciones Trigonométricas y Resolución de Triángulos Oblicuángulos (Semana 12)** (`tri_t12_s01` a `tri_t12_s04`)

---

## 📚 DETALLE DE DESGLOSE: FÍSICA (`FisicaCatalog.kt` - 48 Niveles)

- [x] **Tema 01: Análisis Dimensional y Análisis Vectorial (Semana 1)** (`fis_t01_s01` a `fis_t01_s04`)
- [x] **Tema 02: Cinemática 1D: MRU, MRUV y Gráficas del Movimiento (Semana 2)** (`fis_t02_s01` a `fis_t02_s04`)
- [x] **Tema 03: Movimiento Vertical de Caída Libre (MVCL) y Parabólico (MPCL) (Semana 3)** (`fis_t03_s01` a `fis_t03_s04`)
- [x] **Tema 04: Movimiento Circular: MCU, MCUV y Transmisión de Giro (Semana 4)** (`fis_t04_s01` a `fis_t04_s04`)
- [x] **Tema 05: Estática I y II: Fuerzas, Equilibrio, Lamy y Momento de una Fuerza (Semana 5)** (`fis_t05_s01` a `fis_t05_s04`)
- [x] **Tema 06: Dinámica Lineal y Curvilínea (Segunda Ley de Newton y Fuerza Centrípeta) (Semana 6)** (`fis_t06_s01` a `fis_t06_s04`)
- [x] **Tema 07: Trabajo Mecánico, Potencia y Eficiencia (Semana 7)** (`fis_t07_s01` a `fis_t07_s04`)
- [x] **Tema 08: Energía Mecánica y Ley de Conservación de la Energía (Semana 8)** (`fis_t08_s01` a `fis_t08_s04`)
- [x] **Tema 09: Cantidad de Movimiento, Impulso, Choques y Gravitación Universal (Semana 9)** (`fis_t09_s01` a `fis_t09_s04`)
- [x] **Tema 10: Termometría, Calorimetría y Primera Ley de la Termodinámica (Semana 10)** (`fis_t10_s01` a `fis_t10_s04`)
- [x] **Tema 11: Mecánica de Fluidos: Densidad, Pascal, Arquímedes y Continuidad (Semana 11)** (`fis_t11_s01` a `fis_t11_s04`)
- [x] **Tema 12: Electrostática, Circuitos Eléctricos, Electromagnetismo y Física Moderna (Semana 12)** (`fis_t12_s01` a `fis_t12_s04`)

---

## 📚 DETALLE DE DESGLOSE: QUÍMICA (`QuimicaCatalog.kt` - 64 Niveles)

- [x] **Tema 01: La Química como Ciencia, Materia y Fenómenos Físico-Químicos (Semana 1)** (`qui_t01_s01` a `qui_t01_s04`)
- [x] **Tema 02: Estados de Agregación, Cambios de Fase y Sistemas Materiales (Semana 2)** (`qui_t02_s01` a `qui_t02_s04`)
- [x] **Tema 03: Estructura Atómica Fundamental y Especies Nucleares (Semana 3)** (`qui_t03_s01` a `qui_t03_s04`)
- [x] **Tema 04: Números Cuánticos y Configuración Electrónica (Semana 4)** (`qui_t04_s01` a `qui_t04_s04`)
- [x] **Tema 05: Tabla Periódica Moderna y Propiedades Periódicas (Semana 5)** (`qui_t05_s01` a `qui_t05_s04`)
- [x] **Tema 06: Enlace Químico I: Enlace Iónico y Enlace Metálico (Semana 6)** (`qui_t06_s01` a `qui_t06_s04`)
- [x] **Tema 07: Enlace Químico II: Enlace Covalente y Fuerzas Intermoleculares (Semana 7)** (`qui_t07_s01` a `qui_t07_s04`)
- [x] **Tema 08: Nomenclatura Inorgánica I: Óxidos, Hidruros e Hidróxidos (Semana 8)** (`qui_t08_s01` a `qui_t08_s04`)
- [x] **Tema 09: Nomenclatura Inorgánica II: Ácidos Oxácidos, Hidrácidos y Sales (Semana 9)** (`qui_t09_s01` a `qui_t09_s04`)
- [x] **Tema 10: Unidades Químicas de Masa (UQM) y Composición Centesimal (Semana 10)** (`qui_t10_s01` a `qui_t10_s04`)
- [x] **Tema 11: Estado Gaseoso: Leyes de los Gases Ideales y Dalton (Semana 11)** (`qui_t11_s01` a `qui_t11_s04`)
- [x] **Tema 12: Reacciones Químicas y Métodos de Balanceo (Tanteo y Redox) (Semana 12)** (`qui_t12_s01` a `qui_t12_s04`)
- [x] **Tema 13: Estequiometría de Reacciones: Reactivo Limitante, Rendimiento y Pureza (Semana 13)** (`qui_t13_s01` a `qui_t13_s04`)
- [x] **Tema 14: Soluciones Químicas: Unidades Físicas, Molaridad, Normalidad y Dilución (Semana 14)** (`qui_t14_s01` a `qui_t14_s04`)
- [x] **Tema 15: Cinética, Equilibrio Químico y Principio de Le Châtelier (Semana 15)** (`qui_t15_s01` a `qui_t15_s04`)
- [x] **Tema 16: Ácidos, Bases, pH, pOH, Electroquímica y Química del Carbono (Semana 16)** (`qui_t16_s01` a `qui_t16_s04`)

---

## 📚 DETALLE DE DESGLOSE: BIOLOGÍA (`BiologiaCatalog.kt` - 52 Niveles)

- [x] **Tema 01: La Biología como Ciencia y Método Científico (Semana 1)** (`bio_t01_s01` a `bio_t01_s04`)
- [x] **Tema 02: Seres Vivos, Características y Niveles de Organización (Semana 2)** (`bio_t02_s01` a `bio_t02_s04`)
- [x] **Tema 03: Base Química de la Vida: Bioelementos y Biomoléculas Inorgánicas (Semana 3)** (`bio_t03_s01` a `bio_t03_s04`)
- [x] **Tema 04: Biomoléculas Orgánicas: Glúcidos, Lípidos, Proteínas y Ácidos Nucleicos (Semana 4)** (`bio_t04_s01` a `bio_t04_s04`)
- [x] **Tema 05: Citología: Célula Procariota y Célula Eucariota (Semana 5)** (`bio_t05_s01` a `bio_t05_s04`)
- [x] **Tema 06: Fisiología Celular: Fotosíntesis y Respiración Celular (Semana 6)** (`bio_t06_s01` a `bio_t06_s04`)
- [x] **Tema 07: Histología Vegetal y Animal (Semana 7)** (`bio_t07_s01` a `bio_t07_s04`)
- [x] **Tema 08: Fisiología Humana I: Digestivo, Respiratorio y Circulatorio (Semana 8)** (`bio_t08_s01` a `bio_t08_s04`)
- [x] **Tema 09: Fisiología Humana II: Excretor, Nervioso y Endocrino (Semana 9)** (`bio_t09_s01` a `bio_t09_s04`)
- [x] **Tema 10: Reproducción Celular, Ciclo Celular, Mitosis, Meiosis y Gametogénesis (Semana 10)** (`bio_t10_s01` a `bio_t10_s04`)
- [x] **Tema 11: Genética Mendeliana, Herencia No Mendeliana, Ligada al Sexo y Mutaciones (Semana 11)** (`bio_t11_s01` a `bio_t11_s04`)
- [x] **Tema 12: Origen de la Vida, Teorías de la Evolución y Taxonomía (Semana 12)** (`bio_t12_s01` a `bio_t12_s04`)
- [x] **Tema 13: Ecología, Ecosistemas, Relaciones Biológicas y Contaminación Ambiental (Semana 13)** (`bio_t13_s01` a `bio_t13_s04`)



