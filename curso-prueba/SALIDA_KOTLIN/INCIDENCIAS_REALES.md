# REGISTRO DE INCIDENCIAS REALES Y REPARACIONES DE FRONTERA

Este documento registra detalladamente las incidencias pedagógicas reales, contaminaciones cruzadas entre `LessonNodes` contiguos, omisiones teóricas y distractores impropios detectados durante la reconstrucción integral de fronteras de lección.

**Total de reactivos / fronteras reparadas:** 1011

---

## CASOS DE REGRESIÓN Y PRUEBAS CIEGAS EXTERNAS

### CASO 1: Historia Universal - Semana 05 (`huni_t05_s02`)
- **LESSON_ID:** `huni_t05_s02`
- **TIPO:** CROSS_LESSON_CONTAMINATION
- **CHALLENGE:** `huni_t05_s02_c01`, `c02`, `c03`, `c04`, `c05`
- **PROBLEMA:** Los desafíos evaluaban la Reforma Protestante (Lutero, 95 Tesis, Sola Fide/Sola Scriptura, Dieta de Worms, Calvino y predestinación, Enrique VIII y Acta de Supremacía), pero dicha teoría estaba erróneamente ubicada al final de `huni_t05_s01.theory` y ausente en `huni_t05_s02.theory`.
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md` (Sección 3.4).
- **ACCIÓN:** Se trasladó la sección 3.4 íntegra (Causas, vertiente Luterana, Calvinista y Anglicana) a `huni_t05_s02.theory`, dejando `huni_t05_s01.theory` estrictamente delimitada a Humanismo (3.1), Renacimiento (3.2) y Descubrimientos Geográficos (3.3).
- **RESULTADO:** Frontera natural restablecida; `huni_t05_s02` es ahora 100% autosuficiente y supera la prueba de borrado mental.

### CASO 2: Historia Universal - Semana 05 (`huni_t05_s01_c09`)
- **LESSON_ID:** `huni_t05_s01`
- **TIPO:** EVIDENCIA_PARCIAL_INSUFICIENTE
- **CHALLENGE:** `huni_t05_s01_c09`
- **PROBLEMA:** La teoría original solo mencionaba "Rafael Sanzio: *La escuela de Atenas*, Madonnas", pero el challenge exigía conocer detalles filosóficos extratextuales (Platón señalando al cielo de las ideas y Aristóteles a la tierra empírica).
- **FUENTE UTILIZADA PARA REPARAR:** `TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md` (Secciones 3.2, 10 y 11).
- **ACCIÓN:** Se reorientó la formulación del desafío para evaluar la autoría renacentista del fresco vaticano de Rafael Sanzio en la Stanza della Segnatura según el texto curricular de referencia, con distractores de pintores renacentistas equivalentes (La Gioconda, El nacimiento de Venus, La creación de Adán).
- **RESULTADO:** Desafío respaldado con rigor textual directo e irrebatible dentro de `huni_t05_s01.theory`.

### CASO 3: Historia Universal - Semana 05 (`huni_t05_s01_c10`)
- **LESSON_ID:** `huni_t05_s01`
- **TIPO:** CONTENIDO_NO_DESARROLLADO_Y_DISTRACTOR_ABSURDO
- **CHALLENGE:** `huni_t05_s01_c10`
- **PROBLEMA:** Se preguntaba por Nicolás Copérnico y heliocentrismo (tema ausente en el texto curricular de la semana), e incluía un distractor absurdo ("Tierra sostenida por elefantes cósmicos").
- **FUENTE UTILIZADA PARA REPARAR:** `TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md` (Sección 3.3: Grandes Descubrimientos Geográficos).
- **ACCIÓN:** Se sustituyó el challenge por una pregunta preuniversitaria rigurosa sobre el Tratado de Tordesillas (1494, 370 leguas al oeste de Cabo Verde entre España y Portugal), con distractores diplomáticos reales (Bula Inter Caetera, Capitulación de Santa Fe, Tratado de Utrecht).
- **RESULTADO:** Reactivo de alto nivel preuniversitario plenamente respaldado en la teoría de `huni_t05_s01` y libre de absurdos.

### CASO 4: Historia Universal - Semana 05 (`huni_t05_s02_c10`)
- **LESSON_ID:** `huni_t05_s02`
- **TIPO:** DISTRACTOR_ABSURDO
- **CHALLENGE:** `huni_t05_s02_c10`
- **PROBLEMA:** Distractores caricaturescos e impropios ("sometido con garrotes por el Estado", "redactadas por sabios extranjeros").
- **FUENTE UTILIZADA PARA REPARAR:** Teoría política de la Ilustración y filosofía del derecho (`TEMA_05`).
- **ACCIÓN:** Se reemplazaron por doctrinas políticas plausibles (monarquía absoluta de derecho divino de Hobbes, soberanía de terratenientes, sumisión al derecho canónico).
- **RESULTADO:** Alternativas disciplinarias homogéneas y académicamente plausibles.

### CASO 5: Razonamiento Verbal - Semana 06 (`rv_t06_s02`)
- **LESSON_ID:** `rv_t06_s02`
- **TIPO:** CROSS_LESSON_CONTAMINATION
- **CHALLENGE:** `rv_t06_s02_c01` a `c09`
- **PROBLEMA:** La lección evaluaba el Principio de Cooperación y las 4 Máximas de Paul Grice, pero dicha sección teórica (3.2) había sido asignada a `rv_t06_s01.theory`, dejando a `s02` únicamente con el formulario maestro sin explicaciones teóricas.
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md` (Sección 3.2 y Mnemotecnias).
- **ACCIÓN:** Se reestructuró la frontera: `s01` retuvo Presuposiciones vs. Implicaturas (3.1 y 3.3), y `s02` recibió íntegramente el Principio de Cooperación, las Máximas de Grice (3.2) y los Actos de Habla de Austin.
- **RESULTADO:** Autosuficiencia teórica demostrada en ambos LessonNodes.

### CASO 6: Filosofía - Semana 01 (`filo_t01_s01`)
- **LESSON_ID:** `filo_t01_s01`
- **TIPO:** CORTE_ARTIFICIAL_DE_SECCION
- **CHALLENGE:** `filo_t01_s01_c03`, `c04`, `c05`, `c06`, `c07`
- **PROBLEMA:** Los desafíos evaluaban las características esenciales de la filosofía (totalizadora, radical, crítica, problemática) y su comparación con el saber religioso y vulgar, las cuales estaban en la Sección 4 del markdown y habían sido omitidas al truncar en la Sección 3.
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_01_Nociones_Preliminares_de_Filosofia.md` (Sección 4.1 y 4.2).
- **ACCIÓN:** Se incorporaron las secciones 4.1 y 4.2 directamente a `filo_t01_s01.theory`.
- **RESULTADO:** Cobertura de las características del saber filosófico al 100%.

## REGISTRO SISTEMÁTICO DE REPARACIONES DE FRONTERA POR MATERIA

### civ_t01_s01
- **LESSON_ID:** `civ_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t01_s01_c02`, `civ_t01_s01_c03`, `civ_t01_s01_c06`, `civ_t01_s01_c06`, `civ_t01_s01_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t01_s01 y ubicados en otra sección de la semana (En el ordenamiento civil peruano, el concebido es considerad...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_01_Persona_y_Vida_en_Sociedad.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t01_s02
- **LESSON_ID:** `civ_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t01_s02_c03`, `civ_t01_s02_c04`, `civ_t01_s02_c06`, `civ_t01_s02_c07`, `civ_t01_s02_c08` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t01_s02 y ubicados en otra sección de la semana (Un ciudadano cede voluntariamente el asiento reservado a una...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_01_Persona_y_Vida_en_Sociedad.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t02_s01
- **LESSON_ID:** `civ_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t02_s01_c03`, `civ_t02_s01_c05`, `civ_t02_s01_c05`, `civ_t02_s01_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t02_s01 y ubicados en otra sección de la semana (Un ciudadano que se encuentra cumpliendo una condena efectiv...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_02_Ciudadania_Derechos_y_Deberes.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t02_s02
- **LESSON_ID:** `civ_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t02_s02_c04`, `civ_t02_s02_c04`, `civ_t02_s02_c04`, `civ_t02_s02_c05`, `civ_t02_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t02_s02 y ubicados en otra sección de la semana (El principio según el cual todo voto ciudadano tiene idéntic...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_02_Ciudadania_Derechos_y_Deberes.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t03_s01
- **LESSON_ID:** `civ_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t03_s01_c01`, `civ_t03_s01_c01`, `civ_t03_s01_c03`, `civ_t03_s01_c03`, `civ_t03_s01_c03` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t03_s01 y ubicados en otra sección de la semana (La diferencia conceptual medular entre Estado y Nación radic...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_03_Estado_y_Nacion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t03_s02
- **LESSON_ID:** `civ_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t03_s02_c02`, `civ_t03_s02_c02`, `civ_t03_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t03_s02 y ubicados en otra sección de la semana (De acuerdo con el Artículo 46° de la Carta Magna, ante la in...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_03_Estado_y_Nacion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t04_s01
- **LESSON_ID:** `civ_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t04_s01_c03`, `civ_t04_s01_c03`, `civ_t04_s01_c03`, `civ_t04_s01_c03`, `civ_t04_s01_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t04_s01 y ubicados en otra sección de la semana (¿Qué causal de vacancia presidencial procede cuando el Jefe ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_04_Organizacion_del_Estado_Peruano.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t04_s02
- **LESSON_ID:** `civ_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t04_s02_c01`, `civ_t04_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t04_s02 y ubicados en otra sección de la semana (La función de organizar y ejecutar materialmente las eleccio...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_04_Organizacion_del_Estado_Peruano.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t05_s01
- **LESSON_ID:** `civ_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t05_s01_c01`, `civ_t05_s01_c04`, `civ_t05_s01_c04`, `civ_t05_s01_c04`, `civ_t05_s01_c05` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t05_s01 y ubicados en otra sección de la semana (Etimológicamente, la palabra democracia deriva de las voces ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_05_Democracia_y_Sistema_Politico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t05_s02
- **LESSON_ID:** `civ_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t05_s02_c01`, `civ_t05_s02_c03`, `civ_t05_s02_c05`, `civ_t05_s02_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t05_s02 y ubicados en otra sección de la semana (Para que una fórmula presidencial resulte electa en primera ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_05_Democracia_y_Sistema_Politico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t06_s01
- **LESSON_ID:** `civ_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t06_s01_c02`, `civ_t06_s01_c02`, `civ_t06_s01_c03`, `civ_t06_s01_c03`, `civ_t06_s01_c03` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t06_s01 y ubicados en otra sección de la semana (¿Qué característica de los derechos humanos establece que es...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_06_Derechos_Humanos_y_Garantias_Constitucionales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t06_s02
- **LESSON_ID:** `civ_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t06_s02_c03`, `civ_t06_s02_c03`, `civ_t06_s02_c03`, `civ_t06_s02_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t06_s02 y ubicados en otra sección de la semana (Si una persona es despedida arbitrariamente de su centro de ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_06_Derechos_Humanos_y_Garantias_Constitucionales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t07_s01
- **LESSON_ID:** `civ_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t07_s01_c04`, `civ_t07_s01_c04`, `civ_t07_s01_c04`, `civ_t07_s01_c04`, `civ_t07_s01_c07` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t07_s01 y ubicados en otra sección de la semana (El modelo económico consagrado formalmente en el Artículo 58...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_07_Constitucion_y_Orden_Juridico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t07_s02
- **LESSON_ID:** `civ_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t07_s02_c03`, `civ_t07_s02_c03`, `civ_t07_s02_c03`, `civ_t07_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t07_s02 y ubicados en otra sección de la semana (Para que el Poder Ejecutivo pueda expedir Decretos Legislati...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_07_Constitucion_y_Orden_Juridico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t08_s01
- **LESSON_ID:** `civ_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t08_s01_c04`, `civ_t08_s01_c04`, `civ_t08_s01_c07`, `civ_t08_s01_c07`, `civ_t08_s01_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t08_s01 y ubicados en otra sección de la semana (¿Puede someterse a referéndum una propuesta ciudadana que pr...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_08_Participacion_y_Control_Ciudadano.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t08_s02
- **LESSON_ID:** `civ_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t08_s02_c02`, `civ_t08_s02_c02`, `civ_t08_s02_c04`, `civ_t08_s02_c04`, `civ_t08_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t08_s02 y ubicados en otra sección de la semana (Constitucionalmente, ¿se puede someter a un proceso de revoc...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_08_Participacion_y_Control_Ciudadano.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t09_s01
- **LESSON_ID:** `civ_t09_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t09_s01_c03`, `civ_t09_s01_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t09_s01 y ubicados en otra sección de la semana (La norma jurídica de más alta jerarquía expedida por el Cons...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_09_Gobiernos_Regionales_y_Locales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t09_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t09_s02
- **LESSON_ID:** `civ_t09_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t09_s02_c05`, `civ_t09_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t09_s02 y ubicados en otra sección de la semana (El tributo municipal de periodicidad anual que grava el valo...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_09_Gobiernos_Regionales_y_Locales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t09_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t10_s01
- **LESSON_ID:** `civ_t10_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t10_s01_c01`, `civ_t10_s01_c04`, `civ_t10_s01_c07`, `civ_t10_s01_c07`, `civ_t10_s01_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t10_s01 y ubicados en otra sección de la semana (El concepto de Desarrollo Humano formulado por Amartya Sen y...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_10_Desarrollo_Convivencia_y_Cultura_Civica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t10_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t10_s02
- **LESSON_ID:** `civ_t10_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t10_s02_c06`, `civ_t10_s02_c06`, `civ_t10_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t10_s02 y ubicados en otra sección de la semana (Si un alcalde se concierta clandestinamente con una empresa ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_10_Desarrollo_Convivencia_y_Cultura_Civica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t10_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t11_s01
- **LESSON_ID:** `civ_t11_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t11_s01_c01`, `civ_t11_s01_c01`, `civ_t11_s01_c01`, `civ_t11_s01_c01`, `civ_t11_s01_c05` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t11_s01 y ubicados en otra sección de la semana (Según el Artículo 18° de la Constitución y la Ley N.° 30220,...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_11_Derecho_Universitario.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t11_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### civ_t11_s02
- **LESSON_ID:** `civ_t11_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `civ_t11_s02_c07`, `civ_t11_s02_c07`, `civ_t11_s02_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de civ_t11_s02 y ubicados en otra sección de la semana (La función principal de la SUNEDU consistente en autorizar e...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/CIVICA/TEMA_11_Derecho_Universitario.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode civ_t11_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t01_s01
- **LESSON_ID:** `cl_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t01_s01_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t01_s01 y ubicados en otra sección de la semana (En conclusión metodológica, la comprensión literal es consid...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_01_Comprension_Literal.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t01_s02
- **LESSON_ID:** `cl_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t01_s02_c01`, `cl_t01_s02_c01`, `cl_t01_s02_c04`, `cl_t01_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t01_s02 y ubicados en otra sección de la semana (En la elaboración de preguntas de examen de admisión, los di...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_01_Comprension_Literal.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t02_s01
- **LESSON_ID:** `cl_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t02_s01_c01`, `cl_t02_s01_c01`, `cl_t02_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t02_s01 y ubicados en otra sección de la semana (En la teoría epistemológica de la comprensión lectora, la 'E...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_02_Comprension_Inferencial.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t02_s02
- **LESSON_ID:** `cl_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t02_s02_c01`, `cl_t02_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t02_s02 y ubicados en otra sección de la semana (El denominado 'Límite Dorado' en la resolución de preguntas ...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_02_Comprension_Inferencial.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t03_s01
- **LESSON_ID:** `cl_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t03_s01_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t03_s01 y ubicados en otra sección de la semana (En la lectura crítica y comprensión global, la 'Trinidad Tex...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_03_Comprension_Global.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t03_s02
- **LESSON_ID:** `cl_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t03_s02_c01`, `cl_t03_s02_c01`, `cl_t03_s02_c01`, `cl_t03_s02_c01`, `cl_t03_s02_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t03_s02 y ubicados en otra sección de la semana (Las 'Ideas Secundarias' cumplen un rol indispensable en la a...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_03_Comprension_Global.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t04_s01
- **LESSON_ID:** `cl_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t04_s01_c01`, `cl_t04_s01_c01`, `cl_t04_s01_c01`, `cl_t04_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t04_s01 y ubicados en otra sección de la semana (En el análisis discursivo y pragmático de la lectura, el 'Pr...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_04_Intencion_y_Proposito_del_Texto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t04_s02
- **LESSON_ID:** `cl_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t04_s02_c01`, `cl_t04_s02_c01`, `cl_t04_s02_c01`, `cl_t04_s02_c01`, `cl_t04_s02_c01` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t04_s02 y ubicados en otra sección de la semana (En el análisis literario y pragmático de textos de admisión,...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_04_Intencion_y_Proposito_del_Texto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t05_s02
- **LESSON_ID:** `cl_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t05_s02_c01`, `cl_t05_s02_c01`, `cl_t05_s02_c01`, `cl_t05_s02_c01`, `cl_t05_s02_c04` (y 7 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t05_s02 y ubicados en otra sección de la semana (En el análisis crítico de textos, la distinción fundamental ...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_05_Evaluacion_de_la_Informacion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t06_s01
- **LESSON_ID:** `cl_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t06_s01_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t06_s01 y ubicados en otra sección de la semana (En una pregunta de extrapolación, si el texto trata sobre la...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_06_Vocabulario_en_Contexto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t06_s02
- **LESSON_ID:** `cl_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t06_s02_c01`, `cl_t06_s02_c01`, `cl_t06_s02_c01`, `cl_t06_s02_c01`, `cl_t06_s02_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t06_s02 y ubicados en otra sección de la semana (En las pruebas de admisión modernas (estándar DECO), un 'Tex...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_06_Vocabulario_en_Contexto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t07_s02
- **LESSON_ID:** `cl_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t07_s02_c01`, `cl_t07_s02_c01`, `cl_t07_s02_c05`, `cl_t07_s02_c07`, `cl_t07_s02_c07` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t07_s02 y ubicados en otra sección de la semana (En el análisis DECO, el 'Tono del Autor' se define formalmen...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_07_Coherencia_y_Cohesion_Textual.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t08_s01
- **LESSON_ID:** `cl_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t08_s01_c01`, `cl_t08_s01_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t08_s01 y ubicados en otra sección de la semana (En la lectura crítica avanzada, el concepto de 'Premisa Ocul...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_08_Tipos_de_Texto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### cl_t08_s02
- **LESSON_ID:** `cl_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `cl_t08_s02_c02`, `cl_t08_s02_c04`, `cl_t08_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de cl_t08_s02 y ubicados en otra sección de la semana (Por su parte, al abordar textos de divulgación científica, l...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/COMPRENSION_LECTORA/TEMA_08_Tipos_de_Texto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode cl_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t01_s01
- **LESSON_ID:** `filo_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t01_s01_c02`, `filo_t01_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t01_s01 y ubicados en otra sección de la semana (La actitud filosófica se distingue de la actitud cotidiana p...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_01_Nociones_Preliminares_de_Filosofia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t01_s02
- **LESSON_ID:** `filo_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t01_s02_c03`, `filo_t01_s02_c04`, `filo_t01_s02_c04`, `filo_t01_s02_c04`, `filo_t01_s02_c05` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t01_s02 y ubicados en otra sección de la semana (Entre los factores económicos y geográficos que hicieron pos...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_01_Nociones_Preliminares_de_Filosofia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t02_s01
- **LESSON_ID:** `filo_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t02_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t02_s01 y ubicados en otra sección de la semana (Frente a la interrogante '¿Es el conocimiento humano objetiv...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_02_Disciplinas_Filosoficas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t02_s02
- **LESSON_ID:** `filo_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t02_s02_c02`, `filo_t02_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t02_s02 y ubicados en otra sección de la semana (La Ética se define formalmente como la disciplina filosófica...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_02_Disciplinas_Filosoficas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t03_s01
- **LESSON_ID:** `filo_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t03_s01_c01`, `filo_t03_s01_c01`, `filo_t03_s01_c01`, `filo_t03_s01_c01`, `filo_t03_s01_c02` (y 5 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t03_s01 y ubicados en otra sección de la semana (En el problema ontológico sobre la naturaleza última del ser...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_03_Problemas_Fundamentales_de_la_Filosofia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t03_s02
- **LESSON_ID:** `filo_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t03_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t03_s02 y ubicados en otra sección de la semana (Respecto a la posibilidad del conocimiento, la doctrina gnos...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_03_Problemas_Fundamentales_de_la_Filosofia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t04_s01
- **LESSON_ID:** `filo_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t04_s01_c01`, `filo_t04_s01_c01`, `filo_t04_s01_c01`, `filo_t04_s01_c01`, `filo_t04_s01_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t04_s01 y ubicados en otra sección de la semana (El Principio Lógico Supremo formulado inicialmente por Parmé...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_04_Logica_y_Teoria_de_la_Argumentacion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t04_s02
- **LESSON_ID:** `filo_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t04_s02_c01`, `filo_t04_s02_c04`, `filo_t04_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t04_s02 y ubicados en otra sección de la semana (En un debate público, un candidato cuestiona la propuesta tr...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_04_Logica_y_Teoria_de_la_Argumentacion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t05_s01
- **LESSON_ID:** `filo_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t05_s01_c01`, `filo_t05_s01_c01`, `filo_t05_s01_c01`, `filo_t05_s01_c01`, `filo_t05_s01_c01` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t05_s01 y ubicados en otra sección de la semana (¿Cuál es la característica primordial que diferencia al cono...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_05_Conocimiento_Ciencia_y_Verdad.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t05_s02
- **LESSON_ID:** `filo_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t05_s02_c01`, `filo_t05_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t05_s02 y ubicados en otra sección de la semana (En la estructura lógica de la investigación científica, una ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_05_Conocimiento_Ciencia_y_Verdad.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t06_s01
- **LESSON_ID:** `filo_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t06_s01_c01`, `filo_t06_s01_c02`, `filo_t06_s01_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t06_s01 y ubicados en otra sección de la semana (Sócrates de Atenas orientó la filosofía hacia el ámbito antr...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_06_La_Filosofia_en_la_Historia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t06_s02
- **LESSON_ID:** `filo_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t06_s02_c01`, `filo_t06_s02_c01`, `filo_t06_s02_c05`, `filo_t06_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t06_s02 y ubicados en otra sección de la semana (René Descartes inició la filosofía moderna utilizando la 'du...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_06_La_Filosofia_en_la_Historia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t07_s01
- **LESSON_ID:** `filo_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t07_s01_c01`, `filo_t07_s01_c01`, `filo_t07_s01_c04`, `filo_t07_s01_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t07_s01 y ubicados en otra sección de la semana (En el gran debate contemporáneo sobre la filosofía latinoame...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_07_Filosofia_en_Latinoamerica_y_el_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t07_s02
- **LESSON_ID:** `filo_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t07_s02_c01`, `filo_t07_s02_c01`, `filo_t07_s02_c02`, `filo_t07_s02_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t07_s02 y ubicados en otra sección de la semana (Durante el Virreinato peruano (siglos XVI al XVIII), la corr...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_07_Filosofia_en_Latinoamerica_y_el_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t08_s01
- **LESSON_ID:** `filo_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t08_s01_c01`, `filo_t08_s01_c02`, `filo_t08_s01_c03`, `filo_t08_s01_c05`, `filo_t08_s01_c06` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t08_s01 y ubicados en otra sección de la semana (En 'Dialéctica de la Ilustración' (1944), Theodor Adorno y M...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_08_Pensamiento_Filosofico_Contemporaneo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t08_s02
- **LESSON_ID:** `filo_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t08_s02_c01`, `filo_t08_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t08_s02 y ubicados en otra sección de la semana (Michel Foucault formula la tesis de la 'Microfísica del Pode...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_08_Pensamiento_Filosofico_Contemporaneo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t09_s01
- **LESSON_ID:** `filo_t09_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t09_s01_c01`, `filo_t09_s01_c01`, `filo_t09_s01_c01`, `filo_t09_s01_c02`, `filo_t09_s01_c02` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t09_s01 y ubicados en otra sección de la semana (La disciplina filosófica que fue acuñada formalmente en 1750...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_09_Estetica_y_Filosofia_del_Arte.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t09_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t09_s02
- **LESSON_ID:** `filo_t09_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t09_s02_c01`, `filo_t09_s02_c02`, `filo_t09_s02_c03`, `filo_t09_s02_c03`, `filo_t09_s02_c04` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t09_s02 y ubicados en otra sección de la semana (En el diálogo 'La República', Platón condena el arte imitati...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_09_Estetica_y_Filosofia_del_Arte.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t09_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t10_s01
- **LESSON_ID:** `filo_t10_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t10_s01_c01`, `filo_t10_s01_c01`, `filo_t10_s01_c01`, `filo_t10_s01_c01`, `filo_t10_s01_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t10_s01 y ubicados en otra sección de la semana (En la filosofía práctica, la distinción categorial rigurosa ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_10_Etica_y_Moral.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t10_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t10_s02
- **LESSON_ID:** `filo_t10_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t10_s02_c01`, `filo_t10_s02_c02`, `filo_t10_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t10_s02 y ubicados en otra sección de la semana (La doctrina ética de Aristóteles expuesta en la 'Ética a Nic...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_10_Etica_y_Moral.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t10_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t11_s01
- **LESSON_ID:** `filo_t11_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t11_s01_c01`, `filo_t11_s01_c01`, `filo_t11_s01_c01`, `filo_t11_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t11_s01 y ubicados en otra sección de la semana (La disciplina filosófica que estudia el valor, el juicio de ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_11_Axiologia_y_Teoria_del_Valor.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t11_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t11_s02
- **LESSON_ID:** `filo_t11_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t11_s02_c01`, `filo_t11_s02_c01`, `filo_t11_s02_c02`, `filo_t11_s02_c06`, `filo_t11_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t11_s02 y ubicados en otra sección de la semana (El debate central de la axiología se formula mediante la clá...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_11_Axiologia_y_Teoria_del_Valor.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t11_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t12_s01
- **LESSON_ID:** `filo_t12_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t12_s01_c01`, `filo_t12_s01_c01`, `filo_t12_s01_c01`, `filo_t12_s01_c01`, `filo_t12_s01_c01` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t12_s01 y ubicados en otra sección de la semana (La disciplina filosófica que tiene por objeto reflexivo exam...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_12_Filosofia_Politica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t12_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t13_s01
- **LESSON_ID:** `filo_t13_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t13_s01_c01`, `filo_t13_s01_c01`, `filo_t13_s01_c02`, `filo_t13_s01_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t13_s01 y ubicados en otra sección de la semana (La disciplina filosófica que tiene por objeto reflexivo espe...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_13_Antropologia_Filosofica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t13_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### filo_t13_s02
- **LESSON_ID:** `filo_t13_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `filo_t13_s02_c01`, `filo_t13_s02_c01`, `filo_t13_s02_c01`, `filo_t13_s02_c01`, `filo_t13_s02_c01` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de filo_t13_s02 y ubicados en otra sección de la semana (En el debate sobre el origen del ser humano, la teoría del '...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/FILOSOFIA/TEMA_13_Antropologia_Filosofica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode filo_t13_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t01_s01
- **LESSON_ID:** `geo_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t01_s01_c02`, `geo_t01_s01_c02`, `geo_t01_s01_c02`, `geo_t01_s01_c02`, `geo_t01_s01_c02` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t01_s01 y ubicados en otra sección de la semana (Etimológicamente, el vocablo Geografía proviene de las raíce...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_01_Nociones_Fundamentales_de_Geografia_y_Espacio_Geografico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t01_s02
- **LESSON_ID:** `geo_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t01_s02_c01`, `geo_t01_s02_c01`, `geo_t01_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t01_s02 y ubicados en otra sección de la semana (El principio geográfico de Localización o Extensión fue post...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_01_Nociones_Fundamentales_de_Geografia_y_Espacio_Geografico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t02_s01
- **LESSON_ID:** `geo_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t02_s01_c02`, `geo_t02_s01_c04`, `geo_t02_s01_c04`, `geo_t02_s01_c04`, `geo_t02_s01_c04` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t02_s01 y ubicados en otra sección de la semana (El achatamiento en los polos y el ensanchamiento en el ecuad...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_02_Geodesia_y_Cartografia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t02_s02
- **LESSON_ID:** `geo_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t02_s02_c04`, `geo_t02_s02_c04`, `geo_t02_s02_c04`, `geo_t02_s02_c04`, `geo_t02_s02_c06` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t02_s02 y ubicados en otra sección de la semana (La proyección cartográfica cilíndrica de Mercator es muy pre...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_02_Geodesia_y_Cartografia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t03_s01
- **LESSON_ID:** `geo_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t03_s01_c01`, `geo_t03_s01_c01`, `geo_t03_s01_c02`, `geo_t03_s01_c04`, `geo_t03_s01_c04` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t03_s01 y ubicados en otra sección de la semana (La teoría cosmológica del Big Bang (o de la Gran Explosión) ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_03_El_Universo_SPS_y_la_Tierra.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t03_s02
- **LESSON_ID:** `geo_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t03_s02_c04`, `geo_t03_s02_c04`, `geo_t03_s02_c04`, `geo_t03_s02_c04`, `geo_t03_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t03_s02 y ubicados en otra sección de la semana (La velocidad tangencial de rotación de la Tierra es máxima e...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_03_El_Universo_SPS_y_la_Tierra.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t04_s01
- **LESSON_ID:** `geo_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t04_s01_c01`, `geo_t04_s01_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t04_s01 y ubicados en otra sección de la semana (La corteza terrestre o litosfera está dividida geoquímicamen...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_04_Geosfera_y_Geodinamica_Interna_y_Externa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t04_s02
- **LESSON_ID:** `geo_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t04_s02_c01`, `geo_t04_s02_c01`, `geo_t04_s02_c01`, `geo_t04_s02_c01`, `geo_t04_s02_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t04_s02 y ubicados en otra sección de la semana (La geodinámica externa comprende el conjunto de fuerzas exóg...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_04_Geosfera_y_Geodinamica_Interna_y_Externa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t05_s01
- **LESSON_ID:** `geo_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t05_s01_c01`, `geo_t05_s01_c01`, `geo_t05_s01_c02`, `geo_t05_s01_c02`, `geo_t05_s01_c02` (y 5 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t05_s01 y ubicados en otra sección de la semana (¿Cuál es el gas más abundante y volumétricamente predominant...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_05_Atmosfera_Tiempo_y_Clima.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t05_s02
- **LESSON_ID:** `geo_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t05_s02_c01`, `geo_t05_s02_c05`, `geo_t05_s02_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t05_s02 y ubicados en otra sección de la semana (En climatología, la distinción conceptual rigurosa entre 'ti...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_05_Atmosfera_Tiempo_y_Clima.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t06_s01
- **LESSON_ID:** `geo_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t06_s01_c01`, `geo_t06_s01_c01`, `geo_t06_s01_c02`, `geo_t06_s01_c05`, `geo_t06_s01_c05` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t06_s01 y ubicados en otra sección de la semana (La hidrosfera comprende la totalidad de las aguas del planet...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_06_Hidrosfera_Mar_Peruano_y_Aguas_Continentales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t06_s02
- **LESSON_ID:** `geo_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t06_s02_c01`, `geo_t06_s02_c01`, `geo_t06_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t06_s02 y ubicados en otra sección de la semana (En la hidrografía del Perú, el territorio nacional se divide...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_06_Hidrosfera_Mar_Peruano_y_Aguas_Continentales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t07_s01
- **LESSON_ID:** `geo_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t07_s01_c03`, `geo_t07_s01_c03`, `geo_t07_s01_c03`, `geo_t07_s01_c03`, `geo_t07_s01_c06` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t07_s01 y ubicados en otra sección de la semana (Las fosas marinas del Perú (fosa de Chimbote y fosa del Call...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_07_Geomorfologia_y_Relieve_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t07_s02
- **LESSON_ID:** `geo_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t07_s02_c01`, `geo_t07_s02_c03`, `geo_t07_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t07_s02 y ubicados en otra sección de la semana (En la geomorfología andina del Perú, las 'mesetas' o altipla...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_07_Geomorfologia_y_Relieve_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t08_s01
- **LESSON_ID:** `geo_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t08_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t08_s01 y ubicados en otra sección de la semana (Dentro de los seis criterios científicos adoptados por Javie...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_08_Las_Ocho_Regiones_Naturales_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t08_s02
- **LESSON_ID:** `geo_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t08_s02_c02`, `geo_t08_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t08_s02 y ubicados en otra sección de la semana (¿Qué planta gigante con inflorescencias que alcanzan hasta 8...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_08_Las_Ocho_Regiones_Naturales_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t09_s01
- **LESSON_ID:** `geo_t09_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t09_s01_c02`, `geo_t09_s01_c02`, `geo_t09_s01_c02`, `geo_t09_s01_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t09_s01 y ubicados en otra sección de la semana (La ecorregión del 'Mar Frío de la Corriente Peruana' se exti...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_09_Las_Once_Ecorregiones_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t09_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t09_s02
- **LESSON_ID:** `geo_t09_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t09_s02_c01`, `geo_t09_s02_c01`, `geo_t09_s02_c01`, `geo_t09_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t09_s02 y ubicados en otra sección de la semana (La ecorregión andina de la 'Serranía Esteparia' se localiza ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_09_Las_Once_Ecorregiones_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t09_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t10_s01
- **LESSON_ID:** `geo_t10_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t10_s01_c01`, `geo_t10_s01_c01`, `geo_t10_s01_c01`, `geo_t10_s01_c01`, `geo_t10_s01_c01` (y 9 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t10_s01 y ubicados en otra sección de la semana (Los recursos naturales renovables se diferencian conceptualm...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_10_Recursos_Naturales_ANP_y_Desarrollo_Sostenible.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t10_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t10_s02
- **LESSON_ID:** `geo_t10_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t10_s02_c02`, `geo_t10_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t10_s02 y ubicados en otra sección de la semana (Dentro de la categorización del SINANPE, las Áreas de Uso Ta...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_10_Recursos_Naturales_ANP_y_Desarrollo_Sostenible.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t10_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t11_s01
- **LESSON_ID:** `geo_t11_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t11_s01_c02`, `geo_t11_s01_c02`, `geo_t11_s01_c02`, `geo_t11_s01_c02`, `geo_t11_s01_c02` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t11_s01 y ubicados en otra sección de la semana (La institución pública rectora oficial encargada de planific...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_11_Poblacion_y_Demografia_del_Peru_y_el_Mundo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t11_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t11_s02
- **LESSON_ID:** `geo_t11_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t11_s02_c01`, `geo_t11_s02_c01`, `geo_t11_s02_c01`, `geo_t11_s02_c01`, `geo_t11_s02_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t11_s02 y ubicados en otra sección de la semana (En demografía espacial, la 'Población Relativa' o Densidad D...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_11_Poblacion_y_Demografia_del_Peru_y_el_Mundo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t11_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t12_s01
- **LESSON_ID:** `geo_t12_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t12_s01_c01`, `geo_t12_s01_c01`, `geo_t12_s01_c01`, `geo_t12_s01_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t12_s01 y ubicados en otra sección de la semana (La actividad minera es de trascendencia vital para la macroe...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_12_Actividades_Economicas_en_el_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t12_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t12_s02
- **LESSON_ID:** `geo_t12_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t12_s02_c01`, `geo_t12_s02_c01`, `geo_t12_s02_c01`, `geo_t12_s02_c01`, `geo_t12_s02_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t12_s02 y ubicados en otra sección de la semana (La industria en el Perú se concentra predominantemente en la...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_12_Actividades_Economicas_en_el_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t12_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t13_s01
- **LESSON_ID:** `geo_t13_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t13_s01_c01`, `geo_t13_s01_c01`, `geo_t13_s01_c02`, `geo_t13_s01_c02`, `geo_t13_s01_c02` (y 7 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t13_s01 y ubicados en otra sección de la semana (Etimológica y doctrinariamente, el término 'Geopolítica' fue...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_13_Geopolitica_Fronteras_y_Tratados_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t13_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### geo_t13_s02
- **LESSON_ID:** `geo_t13_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `geo_t13_s02_c01`, `geo_t13_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de geo_t13_s02 y ubicados en otra sección de la semana (Desde una perspectiva geoestratégica hemisférica y global, e...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/GEOGRAFIA/TEMA_13_Geopolitica_Fronteras_y_Tratados_del_Peru.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode geo_t13_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t01_s01
- **LESSON_ID:** `hper_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t01_s01_c01`, `hper_t01_s01_c01`, `hper_t01_s01_c01`, `hper_t01_s01_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t01_s01 y ubicados en otra sección de la semana (La teoría inmigracionista asiática del poblamiento americano...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_01_Poblamiento_Americano_Periodo_Litico_Arcaico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t01_s02
- **LESSON_ID:** `hper_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t01_s02_c01`, `hper_t01_s02_c01`, `hper_t01_s02_c01`, `hper_t01_s02_c01`, `hper_t01_s02_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t01_s02 y ubicados en otra sección de la semana (El hallazgo arqueológico realizado por Tom Dillehay en el va...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_01_Poblamiento_Americano_Periodo_Litico_Arcaico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t02_s01
- **LESSON_ID:** `hper_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t02_s01_c01`, `hper_t02_s01_c01`, `hper_t02_s01_c01`, `hper_t02_s01_c01`, `hper_t02_s01_c02` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t02_s01 y ubicados en otra sección de la semana (En la periodización de la historia prehispánica formulada po...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_02_Altas_Culturas_Preincas_Horizontes_e_Intermedios.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t02_s02
- **LESSON_ID:** `hper_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t02_s02_c01`, `hper_t02_s02_c01`, `hper_t02_s02_c01`, `hper_t02_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t02_s02 y ubicados en otra sección de la semana (En el Altiplano del Collao, la civilización de Tiahuanaco lo...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_02_Altas_Culturas_Preincas_Horizontes_e_Intermedios.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t03_s01
- **LESSON_ID:** `hper_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t03_s01_c02`, `hper_t03_s01_c02`, `hper_t03_s01_c02`, `hper_t03_s01_c03`, `hper_t03_s01_c03` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t03_s01 y ubicados en otra sección de la semana (El hecho histórico decisivo que marca la transformación de l...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_03_El_Tawantinsuyu_Organizacion_Expansion_Caida.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t03_s02
- **LESSON_ID:** `hper_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t03_s02_c01`, `hper_t03_s02_c01`, `hper_t03_s02_c01`, `hper_t03_s02_c01`, `hper_t03_s02_c03` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t03_s02 y ubicados en otra sección de la semana (Los dos principios rectores que articularon el funcionamient...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_03_El_Tawantinsuyu_Organizacion_Expansion_Caida.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t04_s01
- **LESSON_ID:** `hper_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t04_s01_c01`, `hper_t04_s01_c01`, `hper_t04_s01_c01`, `hper_t04_s01_c01`, `hper_t04_s01_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t04_s01 y ubicados en otra sección de la semana (El documento jurídico firmado en julio de 1529 entre Francis...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_04_Virreinato_del_Peru_Economia_Sociedad_Reformas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t04_s02
- **LESSON_ID:** `hper_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t04_s02_c01`, `hper_t04_s02_c01`, `hper_t04_s02_c01`, `hper_t04_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t04_s02 y ubicados en otra sección de la semana (El virrey Francisco de Toledo (1569 - 1581) es considerado e...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_04_Virreinato_del_Peru_Economia_Sociedad_Reformas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t05_s01
- **LESSON_ID:** `hper_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t05_s01_c01`, `hper_t05_s01_c01`, `hper_t05_s01_c01`, `hper_t05_s01_c01`, `hper_t05_s01_c01` (y 11 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t05_s01 y ubicados en otra sección de la semana (La gran rebelión anticolonial iniciada el 4 de noviembre de ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_05_Independencia_y_Republica_Siglos_XIX_XX_XXI.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### hper_t05_s02
- **LESSON_ID:** `hper_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `hper_t05_s02_c02`, `hper_t05_s02_c03`, `hper_t05_s02_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de hper_t05_s02 y ubicados en otra sección de la semana (Durante su segundo gobierno constitucional (1854 - 1862), el...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_DEL_PERU/TEMA_05_Independencia_y_Republica_Siglos_XIX_XX_XXI.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode hper_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t01_s01
- **LESSON_ID:** `huni_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t01_s01_c01`, `huni_t01_s01_c01`, `huni_t01_s01_c03`, `huni_t01_s01_c04`, `huni_t01_s01_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t01_s01 y ubicados en otra sección de la semana (En el proceso evolutivo de la hominización, la transformació...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_01_Hominizacion_y_Prehistoria.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t01_s02
- **LESSON_ID:** `huni_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t01_s02_c02`, `huni_t01_s02_c02`, `huni_t01_s02_c03`, `huni_t01_s02_c03`, `huni_t01_s02_c04` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t01_s02 y ubicados en otra sección de la semana (La región geográfica del Próximo Oriente en forma de arco do...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_01_Hominizacion_y_Prehistoria.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t02_s01
- **LESSON_ID:** `huni_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t02_s01_c01`, `huni_t02_s01_c01`, `huni_t02_s01_c01`, `huni_t02_s01_c01`, `huni_t02_s01_c01` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t02_s01 y ubicados en otra sección de la semana (Las primeras civilizaciones fluviales del mundo antiguo (Sum...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_02_Primeras_Civilizaciones_Mesopotamia_Egipto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t02_s02
- **LESSON_ID:** `huni_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t02_s02_c01`, `huni_t02_s02_c03`, `huni_t02_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t02_s02 y ubicados en otra sección de la semana (La célebre sentencia del historiador griego Heródoto que def...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_02_Primeras_Civilizaciones_Mesopotamia_Egipto.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t03_s01
- **LESSON_ID:** `huni_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t03_s01_c01`, `huni_t03_s01_c02`, `huni_t03_s01_c03`, `huni_t03_s01_c03`, `huni_t03_s01_c03` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t03_s01 y ubicados en otra sección de la semana (La civilización cretense o minoica (florecida en la isla de ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_03_Antiguedad_Clasica_Grecia_Roma.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t03_s02
- **LESSON_ID:** `huni_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t03_s02_c01`, `huni_t03_s02_c01`, `huni_t03_s02_c04`, `huni_t03_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t03_s02 y ubicados en otra sección de la semana (En la República Romana (509 - 27 a.C.), el órgano político c...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_03_Antiguedad_Clasica_Grecia_Roma.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t04_s01
- **LESSON_ID:** `huni_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t04_s01_c01`, `huni_t04_s01_c01`, `huni_t04_s01_c01`, `huni_t04_s01_c01`, `huni_t04_s01_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t04_s01 y ubicados en otra sección de la semana (La caída formal del Imperio Romano de Occidente en el año 47...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_04_Edad_Media_Feudalismo_Islam_Cruzadas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t04_s02
- **LESSON_ID:** `huni_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t04_s02_c01`, `huni_t04_s02_c01`, `huni_t04_s02_c04`, `huni_t04_s02_c04`, `huni_t04_s02_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t04_s02 y ubicados en otra sección de la semana (El régimen feudal que imperó en Europa occidental entre los ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_04_Edad_Media_Feudalismo_Islam_Cruzadas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t05_s01
- **LESSON_ID:** `huni_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t05_s01_c01`, `huni_t05_s01_c01`, `huni_t05_s01_c01`, `huni_t05_s01_c01`, `huni_t05_s01_c03` (y 7 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t05_s01 y ubicados en otra sección de la semana (El Humanismo, movimiento intelectual y filosófico nacido en ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t05_s02
- **LESSON_ID:** `huni_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t05_s02_c04`, `huni_t05_s02_c05`, `huni_t05_s02_c08`, `huni_t05_s02_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t05_s02 y ubicados en otra sección de la semana (La doctrina reformadora fundada por el teólogo francés Juan ...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_05_Edad_Moderna_Renacimiento_Reforma_Ilustracion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t06_s01
- **LESSON_ID:** `huni_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t06_s01_c01`, `huni_t06_s01_c01`, `huni_t06_s01_c01`, `huni_t06_s01_c01`, `huni_t06_s01_c01` (y 6 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t06_s01 y ubicados en otra sección de la semana (El hecho simbólico e insurreccional popular ocurrido el 14 d...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_06_Edad_Contemporanea_Revoluciones_Guerras_Mundiales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### huni_t06_s02
- **LESSON_ID:** `huni_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `huni_t06_s02_c01`, `huni_t06_s02_c01`, `huni_t06_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de huni_t06_s02 y ubicados en otra sección de la semana (El pretexto o causa detonante inmediata que provocó el estal...)
- **FUENTE UTILIZADA PARA REPARAR:** `03_CIENCIAS_SOCIALES/HISTORIA_UNIVERSAL/TEMA_06_Edad_Contemporanea_Revoluciones_Guerras_Mundiales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode huni_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t01_s01
- **LESSON_ID:** `leng_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t01_s01_c02`, `leng_t01_s01_c02`, `leng_t01_s01_c02`, `leng_t01_s01_c02`, `leng_t01_s01_c02` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t01_s01 y ubicados en otra sección de la semana (Si un estudiante lee una obra de Mario Vargas Llosa en su ha...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_01_Comunicacion_y_Lenguaje.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t01_s02
- **LESSON_ID:** `leng_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t01_s02_c01`, `leng_t01_s02_c01`, `leng_t01_s02_c01`, `leng_t01_s02_c02`, `leng_t01_s02_c02` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t01_s02 y ubicados en otra sección de la semana (El sonido estridente de la sirena de una ambulancia que soli...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_01_Comunicacion_y_Lenguaje.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t01_s03
- **LESSON_ID:** `leng_t01_s03`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t01_s03_c01`, `leng_t01_s03_c01`, `leng_t01_s03_c01`, `leng_t01_s03_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t01_s03 y ubicados en otra sección de la semana (La función del lenguaje en la cual el emisor busca influir e...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_01_Comunicacion_y_Lenguaje.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t01_s03 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t02_s01
- **LESSON_ID:** `leng_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t02_s01_c03`, `leng_t02_s01_c03`, `leng_t02_s01_c03`, `leng_t02_s01_c03`, `leng_t02_s01_c06` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t02_s01 y ubicados en otra sección de la semana (La palabra 'guagua' significa 'bebé o infante' en el área an...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_02_Lengua_Habla_y_Realidad_Linguistica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t02_s02
- **LESSON_ID:** `leng_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t02_s02_c05`, `leng_t02_s02_c06`, `leng_t02_s02_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t02_s02 y ubicados en otra sección de la semana (La coexistencia asimétrica de dos lenguas donde una goza de ...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_02_Lengua_Habla_y_Realidad_Linguistica.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t03_s01
- **LESSON_ID:** `leng_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t03_s01_c02`, `leng_t03_s01_c04`, `leng_t03_s01_c04`, `leng_t03_s01_c04`, `leng_t03_s01_c04` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t03_s01 y ubicados en otra sección de la semana (El sistema fonológico del idioma castellano estándar está co...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_03_Fonologia_y_Ortografia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t03_s02
- **LESSON_ID:** `leng_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t03_s02_c04`, `leng_t03_s02_c04`, `leng_t03_s02_c04`, `leng_t03_s02_c04`, `leng_t03_s02_c04` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t03_s02 y ubicados en otra sección de la semana (La regla que exige colocar tilde sobre la vocal cerrada tóni...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_03_Fonologia_y_Ortografia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t03_s03
- **LESSON_ID:** `leng_t03_s03`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t03_s03_c01`, `leng_t03_s03_c03`, `leng_t03_s03_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t03_s03 y ubicados en otra sección de la semana (¿En cuál de las siguientes opciones el monosílabo 'si' debe ...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_03_Fonologia_y_Ortografia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t03_s03 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t04_s01
- **LESSON_ID:** `leng_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t04_s01_c06`, `leng_t04_s01_c06`, `leng_t04_s01_c06`, `leng_t04_s01_c06`, `leng_t04_s01_c07` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t04_s01 y ubicados en otra sección de la semana (¿Cuál de las siguientes palabras está constituida exclusivam...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_04_Morfologia_y_Formacion_de_Palabras.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t04_s02
- **LESSON_ID:** `leng_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t04_s02_c03`, `leng_t04_s02_c03`, `leng_t04_s02_c03`, `leng_t04_s02_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t04_s02 y ubicados en otra sección de la semana (La palabra 'quinceañero' es un ejemplo clásico de parasíntes...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_04_Morfologia_y_Formacion_de_Palabras.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t05_s01
- **LESSON_ID:** `leng_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t05_s01_c02`, `leng_t05_s01_c02`, `leng_t05_s01_c06`, `leng_t05_s01_c06`, `leng_t05_s01_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t05_s01 y ubicados en otra sección de la semana (En la frase 'Esos jóvenes ingresaron a la universidad, pero ...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_05_Sintaxis_Categorias_y_Frases.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t05_s02
- **LESSON_ID:** `leng_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t05_s02_c02`, `leng_t05_s02_c07`, `leng_t05_s02_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t05_s02 y ubicados en otra sección de la semana (Para comprobar con rigor sintáctico si un sintagma desempeña...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_05_Sintaxis_Categorias_y_Frases.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t06_s01
- **LESSON_ID:** `leng_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t06_s01_c01`, `leng_t06_s01_c01`, `leng_t06_s01_c01`, `leng_t06_s01_c01`, `leng_t06_s01_c03` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t06_s01 y ubicados en otra sección de la semana (La oración 'Hubo muchos postulantes en el examen de admisión...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_06_Oracion_Gramatical_Simples_y_Compuestas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t06_s02
- **LESSON_ID:** `leng_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t06_s02_c01`, `leng_t06_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t06_s02 y ubicados en otra sección de la semana (En la oración compuesta 'El expositor presentó su investigac...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_06_Oracion_Gramatical_Simples_y_Compuestas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t07_s01
- **LESSON_ID:** `leng_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t07_s01_c02`, `leng_t07_s01_c02`, `leng_t07_s01_c03`, `leng_t07_s01_c04`, `leng_t07_s01_c04` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t07_s01 y ubicados en otra sección de la semana (En la frase 'Ella solo trajo esto: su mochila y sus libros d...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_07_Discurso_Escrito_y_Normativa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t07_s02
- **LESSON_ID:** `leng_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t07_s02_c01`, `leng_t07_s02_c01`, `leng_t07_s02_c01`, `leng_t07_s02_c02`, `leng_t07_s02_c02` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t07_s02 y ubicados en otra sección de la semana (En la oración 'Estimados postulantes, presten atención a las...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_07_Discurso_Escrito_y_Normativa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t07_s03
- **LESSON_ID:** `leng_t07_s03`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t07_s03_c02`, `leng_t07_s03_c02`, `leng_t07_s03_c02`, `leng_t07_s03_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t07_s03 y ubicados en otra sección de la semana (¿Cuál de las siguientes oraciones presenta un uso totalmente...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_07_Discurso_Escrito_y_Normativa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t07_s03 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t08_s01
- **LESSON_ID:** `leng_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t08_s01_c01`, `leng_t08_s01_c01`, `leng_t08_s01_c04`, `leng_t08_s01_c05`, `leng_t08_s01_c07` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t08_s01 y ubicados en otra sección de la semana (La concepción del signo lingüístico como una entidad bipláni...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_08_Semantica_y_Lexicologia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### leng_t08_s02
- **LESSON_ID:** `leng_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `leng_t08_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de leng_t08_s02 y ubicados en otra sección de la semana (La diferencia conceptual crucial entre la polisemia y la hom...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LENGUAJE/TEMA_08_Semantica_y_Lexicologia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode leng_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t01_s01
- **LESSON_ID:** `lit_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t01_s01_c01`, `lit_t01_s01_c01`, `lit_t01_s01_c03`, `lit_t01_s01_c04`, `lit_t01_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t01_s01 y ubicados en otra sección de la semana (En la teoría literaria moderna formulada por Roman Jakobson,...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_01_Conceptos_Fundamentales_Generos_y_Figuras.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t01_s02
- **LESSON_ID:** `lit_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t01_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t01_s02 y ubicados en otra sección de la semana (Identifique la figura retórica presente en la siguiente fras...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_01_Conceptos_Fundamentales_Generos_y_Figuras.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t02_s01
- **LESSON_ID:** `lit_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t02_s01_c02`, `lit_t02_s01_c02`, `lit_t02_s01_c02`, `lit_t02_s01_c02`, `lit_t02_s01_c02` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t02_s01 y ubicados en otra sección de la semana (En la tragedia Edipo Rey de Sófocles, ¿cuál es la revelación...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_02_Literatura_Universal.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t02_s02
- **LESSON_ID:** `lit_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t02_s02_c05`, `lit_t02_s02_c06`, `lit_t02_s02_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t02_s02 y ubicados en otra sección de la semana (La célebre novela corta La metamorfosis (1915) de Franz Kafk...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_02_Literatura_Universal.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t03_s01
- **LESSON_ID:** `lit_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t03_s01_c03`, `lit_t03_s01_c03`, `lit_t03_s01_c03`, `lit_t03_s01_c03`, `lit_t03_s01_c03` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t03_s01 y ubicados en otra sección de la semana (La virtud moral y conductual que distingue a Rodrigo Díaz de...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_03_Literatura_Espanola.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t03_s02
- **LESSON_ID:** `lit_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t03_s02_c02`, `lit_t03_s02_c03`, `lit_t03_s02_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t03_s02 y ubicados en otra sección de la semana (¿Cuál es el propósito paródico explícito que declara Miguel ...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_03_Literatura_Espanola.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t04_s01
- **LESSON_ID:** `lit_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t04_s01_c02`, `lit_t04_s01_c02`, `lit_t04_s01_c03`, `lit_t04_s01_c04`, `lit_t04_s01_c05` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t04_s01 y ubicados en otra sección de la semana (¿Cuál es el animal emblemático que simboliza la elegancia ar...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_04_Literatura_Hispanoamericana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t04_s02
- **LESSON_ID:** `lit_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t04_s02_c01`, `lit_t04_s02_c01`, `lit_t04_s02_c01`, `lit_t04_s02_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t04_s02 y ubicados en otra sección de la semana (En el prólogo de su novela El reino de este mundo (1949), Al...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_04_Literatura_Hispanoamericana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t05_s01
- **LESSON_ID:** `lit_t05_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t05_s01_c01`, `lit_t05_s01_c03`, `lit_t05_s01_c03`, `lit_t05_s01_c05`, `lit_t05_s01_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t05_s01 y ubicados en otra sección de la semana (En los Comentarios Reales de los Incas (Primera Parte, Lisbo...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_05_Literatura_Peruana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t05_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t05_s02
- **LESSON_ID:** `lit_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t05_s02_c01`, `lit_t05_s02_c02`, `lit_t05_s02_c05`, `lit_t05_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t05_s02 y ubicados en otra sección de la semana (El poemario Trilce (1922) de César Vallejo es considerado un...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_05_Literatura_Peruana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t06_s01
- **LESSON_ID:** `lit_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t06_s01_c02`, `lit_t06_s01_c03`, `lit_t06_s01_c03`, `lit_t06_s01_c03`, `lit_t06_s01_c10`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t06_s01 y ubicados en otra sección de la semana (La musa inspiradora inmortalizada en los apasionados sonetos...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_06_Literatura_Regional_Sur_Andino_y_Arequipa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### lit_t06_s02
- **LESSON_ID:** `lit_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `lit_t06_s02_c01`, `lit_t06_s02_c01`, `lit_t06_s02_c01`, `lit_t06_s02_c01`, `lit_t06_s02_c02` (y 5 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de lit_t06_s02 y ubicados en otra sección de la semana (El grupo literario de vanguardia puneño de la década de 1920...)
- **FUENTE UTILIZADA PARA REPARAR:** `06_COMUNICACION/LITERATURA/TEMA_06_Literatura_Regional_Sur_Andino_y_Arequipa.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode lit_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t01_s01
- **LESSON_ID:** `psi_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t01_s01_c01`, `psi_t01_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t01_s01 y ubicados en otra sección de la semana (Etimológicamente, la palabra Psicología deriva de las voces ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_01_La_Psicologia_como_Ciencia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t01_s02
- **LESSON_ID:** `psi_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t01_s02_c01`, `psi_t01_s02_c01`, `psi_t01_s02_c01`, `psi_t01_s02_c01`, `psi_t01_s02_c01` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t01_s02 y ubicados en otra sección de la semana (La definición científica contemporánea de la Psicología la c...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_01_La_Psicologia_como_Ciencia.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t02_s01
- **LESSON_ID:** `psi_t02_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t02_s01_c01`, `psi_t02_s01_c01`, `psi_t02_s01_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t02_s01 y ubicados en otra sección de la semana (En psicología personal y vocacional, el 'Proyecto de Vida' s...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_02_Proyecto_de_Vida.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t02_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t02_s02
- **LESSON_ID:** `psi_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t02_s02_c01`, `psi_t02_s02_c05`, `psi_t02_s02_c06`, `psi_t02_s02_c07`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t02_s02 y ubicados en otra sección de la semana (En la planeación estratégica personal, la 'Visión' responde ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_02_Proyecto_de_Vida.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t03_s01
- **LESSON_ID:** `psi_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t03_s01_c01`, `psi_t03_s01_c01`, `psi_t03_s01_c02`, `psi_t03_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t03_s01 y ubicados en otra sección de la semana (En la psicología de la orientación vocacional, la 'Aptitud' ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_03_Orientacion_Vocacional.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t03_s02
- **LESSON_ID:** `psi_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t03_s02_c02`, `psi_t03_s02_c02`, `psi_t03_s02_c02`, `psi_t03_s02_c03`, `psi_t03_s02_c03` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t03_s02 y ubicados en otra sección de la semana (En el modelo RIASEC de Holland, las siglas corresponden a lo...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_03_Orientacion_Vocacional.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t04_s01
- **LESSON_ID:** `psi_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t04_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t04_s01 y ubicados en otra sección de la semana (El organizador visual jerárquico creado por Joseph Novak sus...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Habitos_de_Estudio.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t04_s02
- **LESSON_ID:** `psi_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t04_s02_c01`, `psi_t04_s02_c01`, `psi_t04_s02_c01`, `psi_t04_s02_c01`, `psi_t04_s02_c02` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t04_s02 y ubicados en otra sección de la semana (En la gestión estratégica del tiempo, la conocida 'Matriz de...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_04_Habitos_de_Estudio.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t06_s01
- **LESSON_ID:** `psi_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t06_s01_c01`, `psi_t06_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t06_s01 y ubicados en otra sección de la semana (En la psicología general, la 'Motivación' se conceptualiza c...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_06_Motivacion_y_Afectividad_Humana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t06_s02
- **LESSON_ID:** `psi_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t06_s02_c01`, `psi_t06_s02_c03`, `psi_t06_s02_c03`, `psi_t06_s02_c04`, `psi_t06_s02_c06` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t06_s02 y ubicados en otra sección de la semana (La 'Motivación Intrínseca' se produce cuando una persona rea...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_06_Motivacion_y_Afectividad_Humana.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t07_s01
- **LESSON_ID:** `psi_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t07_s01_c01`, `psi_t07_s01_c01`, `psi_t07_s01_c05`, `psi_t07_s01_c08`, `psi_t07_s01_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t07_s01 y ubicados en otra sección de la semana (La 'Afectividad' en psicología se conceptualiza como el conj...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t07_s02
- **LESSON_ID:** `psi_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t07_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t07_s02 y ubicados en otra sección de la semana (Daniel Goleman estructura el modelo de la Inteligencia Emoci...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_07_Inteligencia_Emocional.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t08_s01
- **LESSON_ID:** `psi_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t08_s01_c01`, `psi_t08_s01_c01`, `psi_t08_s01_c01`, `psi_t08_s01_c01`, `psi_t08_s01_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t08_s01 y ubicados en otra sección de la semana (La 'Personalidad' se define en la psicología contemporánea c...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_08_Personalidad_Temperamento_Caracter.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t08_s02
- **LESSON_ID:** `psi_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t08_s02_c03`, `psi_t08_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t08_s02 y ubicados en otra sección de la semana (Carl Gustav Jung propuso dos grandes orientaciones o actitud...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_08_Personalidad_Temperamento_Caracter.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t09_s01
- **LESSON_ID:** `psi_t09_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t09_s01_c01`, `psi_t09_s01_c01`, `psi_t09_s01_c01`, `psi_t09_s01_c01`, `psi_t09_s01_c01` (y 8 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t09_s01 y ubicados en otra sección de la semana (En psicología científica, el 'Aprendizaje' se define formalm...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_09_Aprendizaje_Teorias_y_Estilos.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t09_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t09_s02
- **LESSON_ID:** `psi_t09_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t09_s02_c03`, `psi_t09_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t09_s02 y ubicados en otra sección de la semana (En el condicionamiento operante, el 'Reforzamiento Positivo'...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_09_Aprendizaje_Teorias_y_Estilos.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t09_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t10_s01
- **LESSON_ID:** `psi_t10_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t10_s01_c01`, `psi_t10_s01_c01`, `psi_t10_s01_c01`, `psi_t10_s01_c05`, `psi_t10_s01_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t10_s01 y ubicados en otra sección de la semana (En la psicología sensorial, la 'Sensación' se define como el...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_10_Procesos_Psicologicos_Basicos.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t10_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t10_s02
- **LESSON_ID:** `psi_t10_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t10_s02_c01`, `psi_t10_s02_c01`, `psi_t10_s02_c01`, `psi_t10_s02_c01`, `psi_t10_s02_c04` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t10_s02 y ubicados en otra sección de la semana (La 'Atención' se define en la psicología cognitiva como el p...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_10_Procesos_Psicologicos_Basicos.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t10_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t11_s01
- **LESSON_ID:** `psi_t11_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t11_s01_c01`, `psi_t11_s01_c01`, `psi_t11_s01_c01`, `psi_t11_s01_c01`, `psi_t11_s01_c01` (y 8 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t11_s01 y ubicados en otra sección de la semana (En la psicología cognitiva contemporánea, la 'Inteligencia' ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_11_Inteligencia_y_Teorias_Multiples.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t11_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t11_s02
- **LESSON_ID:** `psi_t11_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t11_s02_c01`, `psi_t11_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t11_s02 y ubicados en otra sección de la semana (La 'Teoría Bifactorial de la Inteligencia' formulada en 1904...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_11_Inteligencia_y_Teorias_Multiples.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t11_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t12_s01
- **LESSON_ID:** `psi_t12_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t12_s01_c01`, `psi_t12_s01_c01`, `psi_t12_s01_c01`, `psi_t12_s01_c01`, `psi_t12_s01_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t12_s01 y ubicados en otra sección de la semana (En la psicología social y del desarrollo, la 'Familia' se co...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_12_Factores_de_Proteccion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t12_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t12_s02
- **LESSON_ID:** `psi_t12_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t12_s02_c01`, `psi_t12_s02_c01`, `psi_t12_s02_c01`, `psi_t12_s02_c04`, `psi_t12_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t12_s02 y ubicados en otra sección de la semana (En la sociología y psicología familiar contemporánea, la 'Fa...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_12_Factores_de_Proteccion.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t12_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t13_s01
- **LESSON_ID:** `psi_t13_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t13_s01_c04`, `psi_t13_s01_c06`, `psi_t13_s01_c07`, `psi_t13_s01_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t13_s01 y ubicados en otra sección de la semana (En el 'Ciclo de la Violencia' intrafamiliar formulado por Le...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_13_Factores_de_Riesgo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t13_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t13_s02
- **LESSON_ID:** `psi_t13_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t13_s02_c05`, `psi_t13_s02_c08`, `psi_t13_s02_c09`, `psi_t13_s02_c09`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t13_s02 y ubicados en otra sección de la semana (En el estudio de las drogodependencias, el fenómeno neuroada...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_13_Factores_de_Riesgo.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t13_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t14_s01
- **LESSON_ID:** `psi_t14_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t14_s01_c01`, `psi_t14_s01_c01`, `psi_t14_s01_c01`, `psi_t14_s01_c01`, `psi_t14_s01_c01` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t14_s01 y ubicados en otra sección de la semana (La 'Sexualidad Humana' se conceptualiza en la psicología y s...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_14_Salud_Sexual_y_Reproductiva.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t14_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t14_s02
- **LESSON_ID:** `psi_t14_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t14_s02_c01`, `psi_t14_s02_c02`, `psi_t14_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t14_s02 y ubicados en otra sección de la semana (En la Teoría del Desarrollo Psicosexual de Sigmund Freud, la...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_14_Salud_Sexual_y_Reproductiva.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t14_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t15_s01
- **LESSON_ID:** `psi_t15_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t15_s01_c01`, `psi_t15_s01_c01`, `psi_t15_s01_c01`, `psi_t15_s01_c01`, `psi_t15_s01_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t15_s01 y ubicados en otra sección de la semana (El 'Desarrollo Humano' se define en la psicología evolutiva ...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_15_Desarrollo_Humano_y_Etapas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t15_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### psi_t15_s02
- **LESSON_ID:** `psi_t15_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `psi_t15_s02_c01`, `psi_t15_s02_c01`, `psi_t15_s02_c01`, `psi_t15_s02_c02`, `psi_t15_s02_c05`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de psi_t15_s02 y ubicados en otra sección de la semana (El biólogo y epistemólogo suizo Jean Piaget revolucionó la p...)
- **FUENTE UTILIZADA PARA REPARAR:** `05_PERSONA_Y_FAMILIA/PSICOLOGIA/TEMA_15_Desarrollo_Humano_y_Etapas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode psi_t15_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t01_s01
- **LESSON_ID:** `rv_t01_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t01_s01_c01`, `rv_t01_s01_c01`, `rv_t01_s01_c01`, `rv_t01_s01_c01`, `rv_t01_s01_c09` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t01_s01 y ubicados en otra sección de la semana (En el enfoque moderno de las pruebas de admisión (estándar D...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_01_Relaciones_Semanticas_Basicas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t01_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t01_s02
- **LESSON_ID:** `rv_t01_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t01_s02_c01`, `rv_t01_s02_c01`, `rv_t01_s02_c01`, `rv_t01_s02_c01`, `rv_t01_s02_c01` (y 2 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t01_s02 y ubicados en otra sección de la semana (La distinción rigurosa entre 'Polisemia' y 'Homonimia' en la...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_01_Relaciones_Semanticas_Basicas.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t01_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t02_s02
- **LESSON_ID:** `rv_t02_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t02_s02_c01`, `rv_t02_s02_c01`, `rv_t02_s02_c01`, `rv_t02_s02_c01`, `rv_t02_s02_c01` (y 8 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t02_s02 y ubicados en otra sección de la semana (En la analogía 'ARCHIPIÉLAGO : ISLA ::', ¿qué tipo de víncul...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_02_Analogias_Verbales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t02_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t03_s01
- **LESSON_ID:** `rv_t03_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t03_s01_c01`, `rv_t03_s01_c01`, `rv_t03_s01_c01`, `rv_t03_s01_c01`, `rv_t03_s01_c01` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t03_s01 y ubicados en otra sección de la semana (En el razonamiento verbal, una 'Serie Verbal' se define form...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_03_Series_y_Clasificaciones_Verbales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t03_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t03_s02
- **LESSON_ID:** `rv_t03_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t03_s02_c01`, `rv_t03_s02_c01`, `rv_t03_s02_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t03_s02 y ubicados en otra sección de la semana (En el examen de razonamiento verbal, el ejercicio de 'Términ...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_03_Series_y_Clasificaciones_Verbales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t03_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t04_s01
- **LESSON_ID:** `rv_t04_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t04_s01_c01`, `rv_t04_s01_c01`, `rv_t04_s01_c01`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t04_s01 y ubicados en otra sección de la semana (Los 'Conectores Lógicos Textuales' se definen en el razonami...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_04_Logica_de_Enunciados.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t04_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t04_s02
- **LESSON_ID:** `rv_t04_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t04_s02_c01`, `rv_t04_s02_c01`, `rv_t04_s02_c01`, `rv_t04_s02_c01`, `rv_t04_s02_c01` (y 3 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t04_s02 y ubicados en otra sección de la semana (El ejercicio de 'Oraciones Incompletas' en las pruebas de ap...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_04_Logica_de_Enunciados.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t04_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t05_s02
- **LESSON_ID:** `rv_t05_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t05_s02_c01`, `rv_t05_s02_c01`, `rv_t05_s02_c01`, `rv_t05_s02_c01`, `rv_t05_s02_c01` (y 4 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t05_s02 y ubicados en otra sección de la semana (En las preguntas de lectura crítica y estándar DECO, la tare...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_05_Razonamiento_Argumentativo_Basico.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t05_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t06_s01
- **LESSON_ID:** `rv_t06_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t06_s01_c01`, `rv_t06_s01_c01`, `rv_t06_s01_c04`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t06_s01 y ubicados en otra sección de la semana (En la pragmática y la filosofía del lenguaje, una 'Presuposi...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t06_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t06_s02
- **LESSON_ID:** `rv_t06_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t06_s02_c01`, `rv_t06_s02_c06`, `rv_t06_s02_c07`, `rv_t06_s02_c07`, `rv_t06_s02_c08`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t06_s02 y ubicados en otra sección de la semana (El 'Principio de Cooperación' formulado por el filósofo Paul...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_06_Pragmatica_en_Enunciados.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t06_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t07_s01
- **LESSON_ID:** `rv_t07_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t07_s01_c01`, `rv_t07_s01_c01`, `rv_t07_s01_c01`, `rv_t07_s01_c02`, `rv_t07_s01_c02`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t07_s01 y ubicados en otra sección de la semana (El vicio de dicción denominado 'Anfibología' (o ambigüedad s...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_07_Correccion_por_Sentido.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t07_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t07_s02
- **LESSON_ID:** `rv_t07_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t07_s02_c01`, `rv_t07_s02_c01`, `rv_t07_s02_c01`, `rv_t07_s02_c03`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t07_s02 y ubicados en otra sección de la semana (La 'Discordancia Gramatical' es un error morfosintáctico que...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_07_Correccion_por_Sentido.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t07_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t08_s01
- **LESSON_ID:** `rv_t08_s01`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t08_s01_c01`, `rv_t08_s01_c01`, `rv_t08_s01_c05`, `rv_t08_s01_c06`
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t08_s01 y ubicados en otra sección de la semana (El concepto de 'Adecuación Sociolingüística' en la comunicac...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_08_Resolucion_de_Problemas_Verbales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t08_s01 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

### rv_t08_s02
- **LESSON_ID:** `rv_t08_s02`
- **TIPO:** CONTAMINACION_CRUZADA_REPARADA
- **CHALLENGES AFECTADOS:** `rv_t08_s02_c01`, `rv_t08_s02_c01`, `rv_t08_s02_c01`, `rv_t08_s02_c02`, `rv_t08_s02_c02` (y 1 más)
- **PROBLEMA:** Conceptos clave requeridos para responder el challenge estaban ausentes en la teoría de rv_t08_s02 y ubicados en otra sección de la semana (En las preguntas complejas de comprensión y razonamiento ver...)
- **FUENTE UTILIZADA PARA REPARAR:** `01_APTITUD_ACADEMICA/RAZONAMIENTO_VERBAL/TEMA_08_Resolucion_de_Problemas_Verbales.md`
- **ACCIÓN:** Se incorporó la sección curricular específica a la cápsula del LessonNode para garantizar autosuficiencia pedagógica absoluta
- **RESULTADO:** El LessonNode rv_t08_s02 ahora contiene toda la fundamentación textual necesaria sin requerir lecciones vecinas.

