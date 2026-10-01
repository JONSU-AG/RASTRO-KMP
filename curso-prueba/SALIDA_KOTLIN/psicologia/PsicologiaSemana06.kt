package psicologia

object PsicologiaSemana06 {

    val lessons = listOf(
        LessonNode(
            id = "psi_t06_s01",
            subjectId = "psicologia",
            semana = 6,
            subtema = "6.1",
            title = "3.1. Naturaleza y Ciclo de la Motivación",
            theory = LessonTheory(
                content = """## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[PROCESOS AFECTIVOS Y CONATIVOS] --> B[Motivación Humana]
    A --> C[Afectividad: Emociones y Sentimientos]
    A --> D[Conflictos Motivacionales de Kurt Lewin]

    B --> B1[Ciclo Motivacional: Necesidad -> Tensión -> Conducta -> Meta]
    B --> B2[Motivación Intrínseca vs. Extrínseca]
    B --> B3[Pirámide de Maslow: Jerarquía de Necesidades]
    B --> B4[Teoría de McClelland: Logro, Poder y Afiliación]

    C --> C1[Manifestaciones: Emociones, Sentimientos, Pasiones, Estados de Ánimo]
    C --> C2[Emociones Básicas de Paul Ekman]
    C --> C3[Bases Biológicas: Sistema Límbico y Amígdala]
    C --> C4[Teorías: James-Lange, Cannon-Bard, Schachter-Singer]

    D --> D1[Atracción - Atracción: ++]
    D --> D2[Evitación - Evitación: --]
    D --> D3[Atracción - Evitación: +-]
    D --> D4[Doble Atracción - Evitación: +- vs. +-]
```

---



## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Naturaleza y Ciclo de la Motivación
- **Motivación:** Proceso psicológico conativo-volitivo que energiza, orienta, dirige y sostiene la conducta de un individuo hacia la consecución de una meta u objetivo que satisface una necesidad.
- **El Ciclo Motivacional:**
  1. **Homeostasis:** Estado de equilibrio biopsicosocial basal del organismo.
  2. **Estímulo / Carencia:** Aparición de un requerimiento interno (fisiológico o psicológico) o incitación ambiental.
  3. **Necesidad:** Estado de carencia o desequilibrio orgánico o psicológico consciente o inconsciente.
  4. **Estado de Tensión:** Activación psicofisiológica displacentera que moviliza energía.
  5. **Comportamiento / Conducta Motivada:** Acciones deliberadas e instrumentales dirigidas a la meta.
  6. **Satisfacción:** Consecución del incentivo o meta, restableciendo el equilibrio homeostático. Si se frustra, genera agresión, resignación o mecanismos de defensa.



### 3.2. Tipos de Motivación
1. **Según su Origen y Naturaleza:**
   - **Biológicas o Primarias:** Innatas, homeostáticas, ligadas a la supervivencia orgánica de la especie (hambre, sed, sueño, regulación térmica, evitación del dolor, sexo).
   - **Psicosociales o Secundarias:** Adquiridas en el proceso de socialización cultural (necesidad de logro, filiación, poder, autorrealización, justicia).
2. **Según el Locus de Control de la Recompensa:**
   - **Motivación Intrínseca:** La conducta se realiza por el placer inherente, la curiosidad, el desafío intelectual o la satisfacción interna que genera la propia actividad (*"Estudio física porque me fascina entender las leyes del universo"*).
   - **Motivación Extrínseca:** La conducta es un medio instrumental para obtener una recompensa externa tangible o evitar un castigo (*"Estudio para que mis padres me compren un automóvil si ingreso"*).



### 3.3. Afectividad Humana: Formas de Manifestación
Conjunto de vivencias y resonancias internas que reflejan la relación de agrado o desagrado, valoración o rechazo que el sujeto experimenta ante la realidad:

| Forma Afectiva | Intensidad | Duración | Origen / Características | Ejemplos |
| :--- | :--- | :--- | :--- | :--- |
| **Emociones** | Muy alta (violenta) | Muy breve (minutos) | Reacción psicofisiológica súbita ante estímulos externos o internos; cambios vegetativos intensos. | Miedo súbito ante un temblor, ira, sorpresa. |
| **Sentimientos** | Moderada o suave | Prolongada (meses, años) | Proceso afectivo secundario, estructurado por la corteza cerebral y la cultura; mayor componente consciente. | Amor a la madre, patriotismo, gratitud, rencor. |
| **Pasiones** | Muy alta (absorbente) | Muy prolongada | Vivencia profunda que polariza y monopoliza la actividad vital del sujeto. Pueden ser superiores (arte, ciencia) o inferiores (ludopatía, fanatismo). | La pasión de Marie Curie por la física nuclear; la ludopatía. |
| **Estados de Ánimo (Humor)** | Baja | Moderada o prolongada (días) | Fondo afectivo basal difuso y persistente; colorea la percepción general del entorno. | Sentirse optimista, melancólico, irritable en una semana. |

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



### 4.1. Teorías de la Motivación
1. **Jerarquía de las Necesidades de Abraham Maslow (Pirámide Humanista):**
   Las necesidades humanas se estructuran piramidalmente; las necesidades inferiores (deficitarias o de deficiencia) deben ser satisfechas razonablemente antes de que emerjan las necesidades superiores (de desarrollo o ser):
   - **Nivel 1 (Fisiológicas):** Respirar, alimentarse, hidratarse, dormir, homeostasis.
   - **Nivel 2 (Seguridad):** Seguridad física, empleo, recursos, salud, propiedad.
   - **Nivel 3 (Afiliación / Sociales):** Amistad, afecto, intimidad sexual, sentido de pertenencia.
   - **Nivel 4 (Reconocimiento / Estima):** Confianza, autorrespeto, éxito profesional, reputación.
   - **Nivel 5 (Autorrealización / Trascendencia):** Moralidad, creatividad, espontaneidad, resolución de problemas; actualización plena del potencial del *self*.
2. **Teoría de las Tres Necesidades de David McClelland:**
   - **Necesidad de Logro (nLog):** Deseo de superar desafíos difíciles, alcanzar estándares de excelencia y asumir responsabilidad personal del resultado.
   - **Necesidad de Poder (nPod):** Deseo de influir, liderar, controlar e impactar en la conducta de los demás.
   - **Necesidad de Afiliación (nAfi):** Deseo de establecer relaciones interpersonales cálidas, de aceptación y pertenencia grupal.



### 4.2. Teorías Clásicas de la Emoción
1. **Teoría de James-Lange:** *"Lloramos porque estamos tristes, o estamos tristes porque lloramos"*. Sostiene que el estímulo desencadena primero cambios viscerales y fisiológicos periféricos, y la percepción cerebral consciente de dichos cambios corporales constituye la emoción (Estímulo \to Respuesta\ Fisiológica \to Emoción).
2. **Teoría de Cannon-Bard:** Sostiene que la respuesta fisiológica y la vivencia subjetiva emocional ocurren de manera **simultánea e independiente**, mediadas por el tálamo y el sistema límbico (Estímulo \to Activación\ Talámica \to Fisiología + Emoción\ a\ la\ vez).
3. **Teoría Bifactorial de Schachter-Singer:** La emoción es el resultado interactivo de dos factores: una **activación fisiológica indiferenciada** (*arousal*) y una **interpretación o etiquetado cognitivo** basado en el contexto ambiental (Estímulo \to Arousal + Evaluación\ Cognitiva \to Emoción).



### 4.3. Tipología de Conflictos Motivacionales de Kurt Lewin
Cuando coexisten tendencias motivacionales incompatibles:
1. **Atracción - Atracción (++):** El sujeto se encuentra ante dos metas igualmente atractivas y deseables, pero mutuamente excluyentes (ej. ser admitido simultáneamente en dos universidades de gran prestigio).
2. **Evitación - Evitación (--):** El sujeto debe elegir entre dos alternativas desagradables, temidas o aversivas (ej. someterse a una dolorosa cirugía dental o sufrir una infección crónica).
3. **Atracción - Evitación (+-):** Una **misma meta u objeto** posee simultáneamente aspectos sumamente atractivos y aspectos aversivos o costos elevados (ej. postular a la carrera de sus sueños sabiendo que exige un internado hospitalario extenuante de guardias nocturnas).
4. **Doble Atracción - Evitación (+- vs. +-):** El sujeto debe elegir entre dos o más opciones, y cada una de ellas contiene ventajas apetecibles y desventajas notables.

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Jerarquía de Maslow (de la base a la cima):**
   > **"FISI-SEGU-AFI-RECO-AUTO"** \implies **Fisi**ológicas, **Segu**ridad, **Afi**liación, **Reco**nocimiento, **Auto**rrealización.
2. **Necesidades de McClelland:**
   > **"L-P-A"** \implies **L**ogro, **P**oder, **A**filiación.
3. **Teoría de James-Lange:**
   > *"Primero corre el cuerpo, luego se asusta la mente"*.
4. **Conflictos de Lewin:**
   > ++ = Dos premios; -- = Dos castigos; +- = Un premio con espinas.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Emoción vs. Sentimiento):** Las emociones son biológicas, súbitas, intensas, con marcadas alteraciones autonómicas (sudoración, taquicardia) y comunes a los animales mamíferos (Paul Ekman: alegría, tristeza, ira, asco, miedo, sorpresa). Los sentimientos son exclusivamente humanos, estables, duraderos, de intensidad moderada y estructurados por el lenguaje y la cultura (amor, gratitud, patriotismo).
- **Trampa 2 (Conflicto Atracción-Evitación):** En el examen, muchos confunden atracción-evitación con tener dos opciones. Si hay **un solo objeto o situación** con doble cara (ej. comerse un pastel delicioso sabiendo que romperá la dieta médica estricta), es **Atracción - Evitación simple**.
- **Trampa 3 (El orden en Maslow):** No se puede buscar la autorrealización plena si las necesidades de seguridad y supervivencia no están previamente estabilizadas en lo fundamental.

---



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Identificación de la Forma Afectiva (Nivel Básico)
**Enunciado:** Mientras camina por una calle solitaria, Andrés escucha el frenazo intempestivo de un automóvil a pocos centímetros de él. De inmediato, su ritmo cardíaco se acelera a 130 latidos por minuto, se dilatan sus pupilas, palidece y da un salto hacia la acera. Esta reacción inmediata, intensa y de corta duración constituye un claro ejemplo de:
A) Sentimiento superior  
B) Estado de ánimo  
C) Emoción primaria o básica  
D) Pasión creadora  
E) Conflicto conativo  

**Solución paso a paso:**
1. El cuadro describe una respuesta automática súbita ante un peligro inminente (estímulo amenazante).
2. Se caracteriza por alta intensidad, brevedad temporal y una violenta activación del sistema nervioso simpático (taquicardia, midriasis, palidez periférica).
3. Estas propiedades definen a la **Emoción** (específicamente, el miedo reactivo).

**Respuesta:** C) Emoción primaria o básica.

---



### Problema 4: Teorías de la Emoción en Escenarios Experimentales (Nivel Avanzado)
**Enunciado:** En un experimento clásico de psicología social, dos grupos de participantes reciben una inyección de epinefrina (adrenalina) que les produce activación fisiológica (taquicardia, sudoración y temblor). A los miembros del Grupo A no se les informa de los efectos de la sustancia y se les coloca en una sala junto a un actor que finge estar sumamente eufórico y feliz; los participantes reportan sentirse eufóricos y alegres. A los miembros del Grupo B tampoco se les informa, pero se les coloca junto a un actor que simula estar furioso y hostil; estos participantes reportan sentir profunda rabia e indignación. ¿Qué teoría de la emoción queda validada por este experimento?
A) Teoría evolucionista pura de Charles Darwin  
B) Teoría fisiológica periférica de James-Lange  
C) Teoría talámica de Cannon-Bard  
D) Teoría bifactorial cognitiva de Schachter y Singer  
E) Teoría psicoanalítica de la catarsis afectiva  

**Solución paso a paso:**
1. Los sujetos de ambos grupos experimentaron exactamente la misma activación fisiológica inducida por la adrenalina (*arousal* neutro).
2. Sin embargo, la vivencia emocional subjetiva resultante (euforia vs. rabia) dependió enteramente de la **interpretación cognitiva** que hicieron del ambiente social en el que estaban situados.
3. Esto confirma la **Teoría Bifactorial de Schachter y Singer**: Emoción = Activación fisiológica + Etiquetado cognitivo contextual.

**Respuesta:** D) Teoría bifactorial cognitiva de Schachter y Singer.

---



### Problema 5: Conflictos Motivacionales de Kurt Lewin (Boss Challenge)
**Enunciado:** Identifique el tipo de conflicto motivacional de Kurt Lewin que se presenta en las siguientes situaciones:
1. Carlos debe elegir entre pasar un fin de semana en un campamento de playa con sus mejores amigos o asistir a un concierto VIP de su banda de rock favorita, ambas opciones con todos los gastos pagados.
2. Gabriela detesta estudiar física cuántica, pero si no la estudia reprobará el semestre y perderá su condición de becaria en la universidad.
3. Felipe tiene un intenso deseo de postular a una beca de posgrado en el extranjero que le garantizará éxito profesional, pero siente un inmenso temor al desarraigo, la soledad y la barrera idiomática de vivir solo en un país lejano.
La secuencia correcta de tipos de conflicto es:
A) Atracción-Atracción / Evitación-Evitación / Atracción-Evitación  
B) Evitación-Evitación / Atracción-Atracción / Doble Atracción-Evitación  
C) Atracción-Evitación / Evitación-Evitación / Atracción-Atracción  
D) Atracción-Atracción / Atracción-Evitación / Evitación-Evitación  
E) Doble Atracción-Evitación / Evitación-Evitación / Atracción-Atracción  

**Solución paso a paso:**
1. Situación 1: Dos metas deseadas y apetecibles (campamento o concierto VIP): **Atracción - Atracción (++)**.
2. Situación 2: Dos opciones temidas o indeseables (estudiar algo que detesta o perder la beca): **Evitación - Evitación (--)**.
3. Situación 3: Un mismo objetivo (la beca en el extranjero) que atrae poderosamente por el éxito pero asusta por el desarraigo: **Atracción - Evitación (+-)**.
4. Secuencia ordenada: Atracción-Atracción / Evitación-Evitación / Atracción-Evitación.

**Respuesta:** A) Atracción-Atracción / Evitación-Evitación / Atracción-Evitación.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Cómo se denomina el estado afectivo absorbente y de gran intensidad que canaliza y monopoliza todas las energías vitales de una persona hacia una meta exclusiva durante años?
   - *Pista:* Puede ser superior (arte/ciencia) o inferior (ludopatía).
   - *Clave:* Pasión.

2. Según Paul Ekman, ¿cuáles son las seis emociones básicas primarias universales reconocibles transculturalmente por las expresiones faciales?
   - *Pista:* Alegría, tristeza, ira, asco, sorpresa y...
   - *Clave:* Alegría, tristeza, ira, asco, miedo y sorpresa.

3. En la teoría de David McClelland, ¿qué tipo de necesidad domina en una persona que busca permanentemente dirigir equipos, asumir el mando y determinar las reglas de un colectivo?
   - *Pista:* Letra P en el modelo LPA.
   - *Clave:* Necesidad de poder.

4. ¿Qué estructura subcortical del sistema límbico desempeña un papel central en el procesamiento y memoria del miedo y la agresividad?
   - *Pista:* Estructura con forma de almendra en el lóbulo temporal.
   - *Clave:* Amígdala cerebral.

5. Un estudiante se debate entre dos ofertas de trabajo: el empleo A paga un excelente sueldo pero el clima laboral es tóxico; el empleo B tiene un ambiente laboral extraordinario pero el sueldo es muy modesto. ¿Qué tipo de conflicto de Lewin experimenta?
   - *Pista:* Ambas opciones tienen aspectos positivos y negativos a la vez.
   - *Clave:* Doble atracción - evitación.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Motivación:** Proceso dinámico orientador que activa y dirige la conducta humana hacia la satisfacción de necesidades.
2. **Homeostasis:** Tendencia del organismo a mantener la estabilidad interna y el equilibrio psicofisiológico.
3. **Emoción:** Reacción psicofisiológica aguda y transitoria provocada por estímulos significativos, con componentes autonómicos, motores y subjetivos.
4. **Sentimiento:** Estado afectivo duradero, consciente y estable, modelado por procesos cognitivos y socioculturales.
5. **Amígdala Cerebral:** Núcleo límbico subcortical especializado en el condicionamiento del miedo, la detección de amenazas y la reactividad emocional.
6. **Autorrealización (Maslow):** Cúspide de la pirámide motivacional caracterizada por el pleno despliegue creativo de las capacidades humanas.
7. **Motivación Intrínseca:** Impulso a actuar generado por el interés directo y la gratificación inherente de la propia tarea.
8. **Motivación Extrínseca:** Impulso a actuar subordinado a incentivos, recompensas o castigos externos ajenos a la tarea en sí.
9. **Conflicto Atracción-Evitación:** Estado motivacional dilemático generado por una meta única que presenta simultáneamente atributos deseables e indeseables.
10. **Arousal:** Grado de activación fisiológica, cortical y del sistema nervioso vegetativo ante situaciones ambientales o internas.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Qué distingue a una emoción de un sentimiento?**
  *R: La emoción es súbita, intensa, biológica y de corta duración; el sentimiento es prolongado, de intensidad moderada, consciente y cultural.*
- **P: ¿Qué postula la teoría de James-Lange sobre las emociones?**
  *R: Que la vivencia emocional consciente es la percepción cerebral de los cambios fisiológicos y viscerales previos del cuerpo (Fisiología \to Emoción).*
- **P: ¿Cuáles son los cinco niveles de la pirámide de Maslow en orden ascendente?**
  *R: Fisiológicas, Seguridad, Afiliación, Reconocimiento y Autorrealización.*
- **P: ¿Cuáles son las tres necesidades según David McClelland?**
  *R: Necesidad de Logro, Necesidad de Poder y Necesidad de Afiliación.*
- **P: ¿Qué es un conflicto de doble atracción-evitación?**
  *R: Una elección entre dos o más opciones donde cada una de ellas posee aspectos ventajosos y desventajas simultáneamente.*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neuroeconomía y Neuromarketing:** Los anunciantes y diseñadores de interfaces activan el circuito dopaminérgico mesolímbico para generar compras impulsivas asociando productos comerciales a necesidades de pertenencia social o estatus (Maslow).
- **Psicoterapia Cognitivo-Conductual (TCC):** La teoría bifactorial de Schachter-Singer y la terapia racional emotiva de Albert Ellis demuestran que modificando la interpretación cognitiva del estímulo se regula el pánico y la fobia social.
- **Liderazgo y Recursos Humanos:** Los perfiles de McClelland se emplean para ubicar a profesionales orientados al logro en investigación y desarrollo, a perfiles de poder en la gerencia general y a perfiles de afiliación en relaciones humanas.

---



### Problema 2: Clasificación de Motivación según Origen y Locus (Nivel Intermedio)
**Enunciado:** Rocío se prepara con esmero para el examen de admisión. Afirma que se apasiona resolviendo problemas de cálculo integral porque disfruta el reto intelectual y la sensación de descubrimiento. Su compañero Manuel, en cambio, postula a la misma carrera exclusivamente porque su padre le prometió entregarle la cuota inicial de un departamento moderno si obtiene una vacante. Las motivaciones de Rocío y Manuel son respectivamente:
A) Extrínseca y biológica.  
B) Extrínseca e intrínseca.  
C) Intrínseca y extrínseca.  
D) Psicosocial e innata.  
E) Trascendente y autorrealizada.  

**Solución paso a paso:**
1. Rocío realiza la acción por el disfrute interno, la curiosidad y la satisfacción intrínseca del aprendizaje: **Motivación Intrínseca**.
2. Manuel ejecuta la conducta como un mero instrumento para obtener un incentivo material exterior (el departamento ofrecido por su padre): **Motivación Extrínseca**.

**Respuesta:** C) Intrínseca y extrínseca.

---



### Problema 3: Jerarquía de Maslow en Casos Sociales (Nivel Intermedio-Avanzado)
**Enunciado:** En una zona rural afectada por un devastador huaico, los pobladores han perdido sus viviendas, agua potable y reservas de alimentos. Un grupo de voluntarios llega ofreciendo talleres de apreciación artística, poesía y meditación trascendental para mejorar la autoestima de los damnificados, pero la comunidad rechaza airadamente los talleres exigiendo maquinaria para encauzar el río, carpas, víveres y medicinas. Desde la teoría jerárquica de Abraham Maslow, la reacción de la comunidad se fundamenta en que:
A) Carecen de inteligencia emocional intrapersonal.  
B) Las necesidades de autorrealización y desarrollo estético solo emergen cuando las necesidades fisiológicas y de seguridad física están satisfechas.  
C) Presentan una fijación anal regresiva según el psicoanálisis.  
D) Su necesidad predominante es la de poder y dominancia social.  
E) Manifiestan un conflicto de atracción-atracción no resuelto.  

**Solución paso a paso:**
1. En la pirámide de Maslow, las necesidades fisiológicas (comida, agua) y de seguridad (refugio, protección contra el desastre natural) constituyen la base deficitaria indispensable.
2. Nadie puede enfocar su energía psíquica en la creatividad, la estética o la autorrealización si su propia supervivencia biológica y su integridad física están amenazadas.

**Respuesta:** B) Las necesidades de autorrealización y desarrollo estético solo emergen cuando las necesidades fisiológicas y de seguridad física están satisfechas.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t06_s01_c01",
                    question = "En la psicología general, la 'Motivación' se conceptualiza como el proceso psicofisiológico y conativo que:",
                    options = listOf(
                        "Mide la agudeza visual estereoscópica.",
                        "Destruye los recuerdos almacenados en la memoria semántica.",
                        "Inmoviliza los músculos esqueléticos para inducir el sueño.",
                        "Inicia, activa, dirige, sostiene y orienta la conducta del organismo hacia la consecución de una meta u objetivo determinado.",
                    ),
                    correctIndex = 3,
                    explanation = "La motivación es la fuerza energizadora interna que impulsa a actuar, otorgando direccionalidad, persistencia e intensidad a la conducta humana."
                ),
                Challenge(
                    id = "psi_t06_s01_c02",
                    question = "El 'Ciclo Motivacional' se inicia a partir de una ruptura del equilibrio biológico o psicológico del organismo, estado que se denomina técnicamente:",
                    options = listOf(
                        "Homeostasis",
                        "Estado de Necesidad o Carencia (tensión psicofisiológica)",
                        "Saciación plena",
                        "Conducta consumatoria",
                    ),
                    correctIndex = 1,
                    explanation = "La carencia (falta de agua, afecto o logro) rompe el equilibrio homeostático, generando un impulso o tensión que moviliza al sujeto hacia la búsqueda de un satisfactor."
                ),
                Challenge(
                    id = "psi_t06_s01_c03",
                    question = "Las fases secuenciales ordenadas del ciclo de la motivación son:",
                    options = listOf(
                        "Satisfacción → Tensión → Hambre → Sueño.",
                        "Castigo → Refuerzo → Extinción → Generalización.",
                        "Homeostasis (equilibrio) → Estímulo → Necesidad (tensión) → Conducta motivada → Meta/Satisfacción → Retorno a la homeostasis.",
                        "Introspección → Emoción → Sentimiento → Pasión.",
                    ),
                    correctIndex = 2,
                    explanation = "El ciclo motivacional describe el tránsito desde el equilibrio inicial hasta su restablecimiento tras alcanzar la meta que satisface la necesidad imperante."
                ),
                Challenge(
                    id = "psi_t06_s01_c04",
                    question = "Cuando un individuo experimenta un estado de necesidad pero encuentra una barrera insuperable que le impide alcanzar la meta deseada, se produce el estado emocional de:",
                    options = listOf(
                        "Apatía placentera",
                        "Autorrealización plena",
                        "Frustración (con respuestas frecuentes de agresión, resignación o ansiedad)",
                        "Éxtasis místico",
                    ),
                    correctIndex = 2,
                    explanation = "La frustración surge del bloqueo de una conducta dirigida a una meta; la hipótesis frustración-agresión (Dollard y Miller) postula que puede derivar en conductas hostiles o regresivas."
                ),
                Challenge(
                    id = "psi_t06_s01_c05",
                    question = "Las necesidades fisiológicas primarias (hambre, sed, sueño, sexo, regulación térmica) se caracterizan porque:",
                    options = listOf(
                        "Son aprendidas mediante imitación cultural en la escuela.",
                        "Son innatas, biológicas, universales y su satisfacción es indispensable para la supervivencia física del individuo y la especie.",
                        "Dependen de la posesión de títulos académicos superiores.",
                        "Solo aparecen después de los cincuenta años de edad.",
                    ),
                    correctIndex = 1,
                    explanation = "Las necesidades primarias están ancladas en mecanismos homeostáticos del hipotálamo y tronco encefálico para asegurar la homeostasis vital."
                ),
                Challenge(
                    id = "psi_t06_s01_c06",
                    question = "A diferencia de las biológicas, las necesidades psicosociales (afiliación, poder, logro, reconocimiento) se distinguen porque:",
                    options = listOf(
                        "Se heredan genéticamente a través del cromosoma Y.",
                        "Se satisfacen exclusivamente bebiendo agua purificada.",
                        "Desaparecen por completo durante la adolescencia.",
                        "Son adquiridas y moduladas a través de la interacción social, la cultura, la educación y la socialización en el entorno humano.",
                    ),
                    correctIndex = 3,
                    explanation = "David McClelland demostró que las necesidades de logro, afiliación y poder son moldeadas por las pautas de crianza y valores culturales de la sociedad."
                ),
                Challenge(
                    id = "psi_t06_s01_c07",
                    question = "La 'Necesidad de Logro' descrita por David McClelland impulsa a las personas a:",
                    options = listOf(
                        "Dormir la mayor cantidad de horas posibles.",
                        "Superar retos desafiantes, alcanzar estándares de excelencia personal y mejorar continuamente su desempeño por el orgullo del trabajo bien hecho.",
                        "Buscar la aprobación sumisa de los amigos evitando cualquier competencia.",
                        "Controlar y dominar a los demás imponiendo su voluntad a la fuerza.",
                    ),
                    correctIndex = 1,
                    explanation = "Los individuos con alta motivación de logro asumen riesgos calculados, buscan retroalimentación sobre su rendimiento y perseveran ante tareas de moderada y alta dificultad."
                ),
                Challenge(
                    id = "psi_t06_s01_c08",
                    question = "La 'Necesidad de Afiliación' en la teoría de McClelland se manifiesta predominantemente como:",
                    options = listOf(
                        "La tendencia a aislarse en montañas solitarias sin comunicación.",
                        "El deseo de acumular riquezas inmobiliarias.",
                        "El impulso de desafiar las leyes de tránsito vehicular.",
                        "El deseo de establecer, mantener y restaurar relaciones afectivas cálidas, íntimas y de aceptación mutua con otros semejantes.",
                    ),
                    correctIndex = 3,
                    explanation = "La motivación de afiliación prioriza la pertenencia afectiva a grupos de pares, la cooperación, el afecto y la evitación del conflicto y rechazo interpersonal."
                ),
                Challenge(
                    id = "psi_t06_s01_c09",
                    question = "La 'Necesidad de Poder' orienta la conducta del sujeto hacia:",
                    options = listOf(
                        "La sumisión voluntaria ante la autoridad de otros.",
                        "El estudio silencioso y anónimo de la botánica.",
                        "El rechazo a cualquier puesto de coordinación grupal.",
                        "Ejercer influencia, autoridad, control, liderazgo y persuasión sobre la conducta de los demás para obtener estatus o prestigio.",
                    ),
                    correctIndex = 3,
                    explanation = "El motivo de poder puede ser personalista (búsqueda de dominio egocéntrico) o institucionalizado (liderazgo orientado al bien común de la organización)."
                ),
                Challenge(
                    id = "psi_t06_s01_c10",
                    question = "En la dinámica motivacional, el 'Conflicto Atracción - Atracción' (Kurt Lewin) se presenta cuando el individuo debe elegir entre:",
                    options = listOf(
                        "Dos situaciones igualmente desagradables y aversivas (ej. tener dolor de muela o ir al dentista).",
                        "Tres castigos físicos severos.",
                        "Dos metas u objetivos simultáneos que resultan ambos altamente deseables y positivos pero mutuamente excluyentes (ej. elegir entre dos becas completas en prestigiosas universidades).",
                        "Una meta que posee simultáneamente aspectos positivos y negativos a la vez.",
                    ),
                    correctIndex = 2,
                    explanation = "El conflicto atracción-atracción genera vacilación entre dos opciones atrayentes; suele resolverse con rapidez en comparación con los conflictos de evitación-evitación."
                ),
            )
        ),
        LessonNode(
            id = "psi_t06_s02",
            subjectId = "psicologia",
            semana = 6,
            subtema = "6.2",
            title = "3.2. Tipos de Motivación",
            theory = LessonTheory(
                content = """# TEMA 06: MOTIVACIÓN Y AFECTIVIDAD HUMANA

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[PROCESOS AFECTIVOS Y CONATIVOS] --> B[Motivación Humana]
    A --> C[Afectividad: Emociones y Sentimientos]
    A --> D[Conflictos Motivacionales de Kurt Lewin]

    B --> B1[Ciclo Motivacional: Necesidad -> Tensión -> Conducta -> Meta]
    B --> B2[Motivación Intrínseca vs. Extrínseca]
    B --> B3[Pirámide de Maslow: Jerarquía de Necesidades]
    B --> B4[Teoría de McClelland: Logro, Poder y Afiliación]

    C --> C1[Manifestaciones: Emociones, Sentimientos, Pasiones, Estados de Ánimo]
    C --> C2[Emociones Básicas de Paul Ekman]
    C --> C3[Bases Biológicas: Sistema Límbico y Amígdala]
    C --> C4[Teorías: James-Lange, Cannon-Bard, Schachter-Singer]

    D --> D1[Atracción - Atracción: ++]
    D --> D2[Evitación - Evitación: --]
    D --> D3[Atracción - Evitación: +-]
    D --> D4[Doble Atracción - Evitación: +- vs. +-]
```

---



### 3.2. Tipos de Motivación
1. **Según su Origen y Naturaleza:**
   - **Biológicas o Primarias:** Innatas, homeostáticas, ligadas a la supervivencia orgánica de la especie (hambre, sed, sueño, regulación térmica, evitación del dolor, sexo).
   - **Psicosociales o Secundarias:** Adquiridas en el proceso de socialización cultural (necesidad de logro, filiación, poder, autorrealización, justicia).
2. **Según el Locus de Control de la Recompensa:**
   - **Motivación Intrínseca:** La conducta se realiza por el placer inherente, la curiosidad, el desafío intelectual o la satisfacción interna que genera la propia actividad (*"Estudio física porque me fascina entender las leyes del universo"*).
   - **Motivación Extrínseca:** La conducta es un medio instrumental para obtener una recompensa externa tangible o evitar un castigo (*"Estudio para que mis padres me compren un automóvil si ingreso"*).



### 3.3. Afectividad Humana: Formas de Manifestación
Conjunto de vivencias y resonancias internas que reflejan la relación de agrado o desagrado, valoración o rechazo que el sujeto experimenta ante la realidad:

| Forma Afectiva | Intensidad | Duración | Origen / Características | Ejemplos |
| :--- | :--- | :--- | :--- | :--- |
| **Emociones** | Muy alta (violenta) | Muy breve (minutos) | Reacción psicofisiológica súbita ante estímulos externos o internos; cambios vegetativos intensos. | Miedo súbito ante un temblor, ira, sorpresa. |
| **Sentimientos** | Moderada o suave | Prolongada (meses, años) | Proceso afectivo secundario, estructurado por la corteza cerebral y la cultura; mayor componente consciente. | Amor a la madre, patriotismo, gratitud, rencor. |
| **Pasiones** | Muy alta (absorbente) | Muy prolongada | Vivencia profunda que polariza y monopoliza la actividad vital del sujeto. Pueden ser superiores (arte, ciencia) o inferiores (ludopatía, fanatismo). | La pasión de Marie Curie por la física nuclear; la ludopatía. |
| **Estados de Ánimo (Humor)** | Baja | Moderada o prolongada (días) | Fondo afectivo basal difuso y persistente; colorea la percepción general del entorno. | Sentirse optimista, melancólico, irritable en una semana. |

---



### 4.1. Teorías de la Motivación
1. **Jerarquía de las Necesidades de Abraham Maslow (Pirámide Humanista):**
   Las necesidades humanas se estructuran piramidalmente; las necesidades inferiores (deficitarias o de deficiencia) deben ser satisfechas razonablemente antes de que emerjan las necesidades superiores (de desarrollo o ser):
   - **Nivel 1 (Fisiológicas):** Respirar, alimentarse, hidratarse, dormir, homeostasis.
   - **Nivel 2 (Seguridad):** Seguridad física, empleo, recursos, salud, propiedad.
   - **Nivel 3 (Afiliación / Sociales):** Amistad, afecto, intimidad sexual, sentido de pertenencia.
   - **Nivel 4 (Reconocimiento / Estima):** Confianza, autorrespeto, éxito profesional, reputación.
   - **Nivel 5 (Autorrealización / Trascendencia):** Moralidad, creatividad, espontaneidad, resolución de problemas; actualización plena del potencial del *self*.
2. **Teoría de las Tres Necesidades de David McClelland:**
   - **Necesidad de Logro (nLog):** Deseo de superar desafíos difíciles, alcanzar estándares de excelencia y asumir responsabilidad personal del resultado.
   - **Necesidad de Poder (nPod):** Deseo de influir, liderar, controlar e impactar en la conducta de los demás.
   - **Necesidad de Afiliación (nAfi):** Deseo de establecer relaciones interpersonales cálidas, de aceptación y pertenencia grupal.



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Jerarquía de Maslow (de la base a la cima):**
   > **"FISI-SEGU-AFI-RECO-AUTO"** \implies **Fisi**ológicas, **Segu**ridad, **Afi**liación, **Reco**nocimiento, **Auto**rrealización.
2. **Necesidades de McClelland:**
   > **"L-P-A"** \implies **L**ogro, **P**oder, **A**filiación.
3. **Teoría de James-Lange:**
   > *"Primero corre el cuerpo, luego se asusta la mente"*.
4. **Conflictos de Lewin:**
   > ++ = Dos premios; -- = Dos castigos; +- = Un premio con espinas.

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Emoción vs. Sentimiento):** Las emociones son biológicas, súbitas, intensas, con marcadas alteraciones autonómicas (sudoración, taquicardia) y comunes a los animales mamíferos (Paul Ekman: alegría, tristeza, ira, asco, miedo, sorpresa). Los sentimientos son exclusivamente humanos, estables, duraderos, de intensidad moderada y estructurados por el lenguaje y la cultura (amor, gratitud, patriotismo).
- **Trampa 2 (Conflicto Atracción-Evitación):** En el examen, muchos confunden atracción-evitación con tener dos opciones. Si hay **un solo objeto o situación** con doble cara (ej. comerse un pastel delicioso sabiendo que romperá la dieta médica estricta), es **Atracción - Evitación simple**.
- **Trampa 3 (El orden en Maslow):** No se puede buscar la autorrealización plena si las necesidades de seguridad y supervivencia no están previamente estabilizadas en lo fundamental.

---



### Problema 2: Clasificación de Motivación según Origen y Locus (Nivel Intermedio)
**Enunciado:** Rocío se prepara con esmero para el examen de admisión. Afirma que se apasiona resolviendo problemas de cálculo integral porque disfruta el reto intelectual y la sensación de descubrimiento. Su compañero Manuel, en cambio, postula a la misma carrera exclusivamente porque su padre le prometió entregarle la cuota inicial de un departamento moderno si obtiene una vacante. Las motivaciones de Rocío y Manuel son respectivamente:
A) Extrínseca y biológica.  
B) Extrínseca e intrínseca.  
C) Intrínseca y extrínseca.  
D) Psicosocial e innata.  
E) Trascendente y autorrealizada.  

**Solución paso a paso:**
1. Rocío realiza la acción por el disfrute interno, la curiosidad y la satisfacción intrínseca del aprendizaje: **Motivación Intrínseca**.
2. Manuel ejecuta la conducta como un mero instrumento para obtener un incentivo material exterior (el departamento ofrecido por su padre): **Motivación Extrínseca**.

**Respuesta:** C) Intrínseca y extrínseca.

---



### Problema 3: Jerarquía de Maslow en Casos Sociales (Nivel Intermedio-Avanzado)
**Enunciado:** En una zona rural afectada por un devastador huaico, los pobladores han perdido sus viviendas, agua potable y reservas de alimentos. Un grupo de voluntarios llega ofreciendo talleres de apreciación artística, poesía y meditación trascendental para mejorar la autoestima de los damnificados, pero la comunidad rechaza airadamente los talleres exigiendo maquinaria para encauzar el río, carpas, víveres y medicinas. Desde la teoría jerárquica de Abraham Maslow, la reacción de la comunidad se fundamenta en que:
A) Carecen de inteligencia emocional intrapersonal.  
B) Las necesidades de autorrealización y desarrollo estético solo emergen cuando las necesidades fisiológicas y de seguridad física están satisfechas.  
C) Presentan una fijación anal regresiva según el psicoanálisis.  
D) Su necesidad predominante es la de poder y dominancia social.  
E) Manifiestan un conflicto de atracción-atracción no resuelto.  

**Solución paso a paso:**
1. En la pirámide de Maslow, las necesidades fisiológicas (comida, agua) y de seguridad (refugio, protección contra el desastre natural) constituyen la base deficitaria indispensable.
2. Nadie puede enfocar su energía psíquica en la creatividad, la estética o la autorrealización si su propia supervivencia biológica y su integridad física están amenazadas.

**Respuesta:** B) Las necesidades de autorrealización y desarrollo estético solo emergen cuando las necesidades fisiológicas y de seguridad física están satisfechas.

---



### Problema 4: Teorías de la Emoción en Escenarios Experimentales (Nivel Avanzado)
**Enunciado:** En un experimento clásico de psicología social, dos grupos de participantes reciben una inyección de epinefrina (adrenalina) que les produce activación fisiológica (taquicardia, sudoración y temblor). A los miembros del Grupo A no se les informa de los efectos de la sustancia y se les coloca en una sala junto a un actor que finge estar sumamente eufórico y feliz; los participantes reportan sentirse eufóricos y alegres. A los miembros del Grupo B tampoco se les informa, pero se les coloca junto a un actor que simula estar furioso y hostil; estos participantes reportan sentir profunda rabia e indignación. ¿Qué teoría de la emoción queda validada por este experimento?
A) Teoría evolucionista pura de Charles Darwin  
B) Teoría fisiológica periférica de James-Lange  
C) Teoría talámica de Cannon-Bard  
D) Teoría bifactorial cognitiva de Schachter y Singer  
E) Teoría psicoanalítica de la catarsis afectiva  

**Solución paso a paso:**
1. Los sujetos de ambos grupos experimentaron exactamente la misma activación fisiológica inducida por la adrenalina (*arousal* neutro).
2. Sin embargo, la vivencia emocional subjetiva resultante (euforia vs. rabia) dependió enteramente de la **interpretación cognitiva** que hicieron del ambiente social en el que estaban situados.
3. Esto confirma la **Teoría Bifactorial de Schachter y Singer**: Emoción = Activación fisiológica + Etiquetado cognitivo contextual.

**Respuesta:** D) Teoría bifactorial cognitiva de Schachter y Singer.

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Motivación:** Proceso dinámico orientador que activa y dirige la conducta humana hacia la satisfacción de necesidades.
2. **Homeostasis:** Tendencia del organismo a mantener la estabilidad interna y el equilibrio psicofisiológico.
3. **Emoción:** Reacción psicofisiológica aguda y transitoria provocada por estímulos significativos, con componentes autonómicos, motores y subjetivos.
4. **Sentimiento:** Estado afectivo duradero, consciente y estable, modelado por procesos cognitivos y socioculturales.
5. **Amígdala Cerebral:** Núcleo límbico subcortical especializado en el condicionamiento del miedo, la detección de amenazas y la reactividad emocional.
6. **Autorrealización (Maslow):** Cúspide de la pirámide motivacional caracterizada por el pleno despliegue creativo de las capacidades humanas.
7. **Motivación Intrínseca:** Impulso a actuar generado por el interés directo y la gratificación inherente de la propia tarea.
8. **Motivación Extrínseca:** Impulso a actuar subordinado a incentivos, recompensas o castigos externos ajenos a la tarea en sí.
9. **Conflicto Atracción-Evitación:** Estado motivacional dilemático generado por una meta única que presenta simultáneamente atributos deseables e indeseables.
10. **Arousal:** Grado de activación fisiológica, cortical y del sistema nervioso vegetativo ante situaciones ambientales o internas.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Qué distingue a una emoción de un sentimiento?**
  *R: La emoción es súbita, intensa, biológica y de corta duración; el sentimiento es prolongado, de intensidad moderada, consciente y cultural.*
- **P: ¿Qué postula la teoría de James-Lange sobre las emociones?**
  *R: Que la vivencia emocional consciente es la percepción cerebral de los cambios fisiológicos y viscerales previos del cuerpo (Fisiología \to Emoción).*
- **P: ¿Cuáles son los cinco niveles de la pirámide de Maslow en orden ascendente?**
  *R: Fisiológicas, Seguridad, Afiliación, Reconocimiento y Autorrealización.*
- **P: ¿Cuáles son las tres necesidades según David McClelland?**
  *R: Necesidad de Logro, Necesidad de Poder y Necesidad de Afiliación.*
- **P: ¿Qué es un conflicto de doble atracción-evitación?**
  *R: Una elección entre dos o más opciones donde cada una de ellas posee aspectos ventajosos y desventajas simultáneamente.*

---



### 3.1. Naturaleza y Ciclo de la Motivación
- **Motivación:** Proceso psicológico conativo-volitivo que energiza, orienta, dirige y sostiene la conducta de un individuo hacia la consecución de una meta u objetivo que satisface una necesidad.
- **El Ciclo Motivacional:**
  1. **Homeostasis:** Estado de equilibrio biopsicosocial basal del organismo.
  2. **Estímulo / Carencia:** Aparición de un requerimiento interno (fisiológico o psicológico) o incitación ambiental.
  3. **Necesidad:** Estado de carencia o desequilibrio orgánico o psicológico consciente o inconsciente.
  4. **Estado de Tensión:** Activación psicofisiológica displacentera que moviliza energía.
  5. **Comportamiento / Conducta Motivada:** Acciones deliberadas e instrumentales dirigidas a la meta.
  6. **Satisfacción:** Consecución del incentivo o meta, restableciendo el equilibrio homeostático. Si se frustra, genera agresión, resignación o mecanismos de defensa.



### Problema 5: Conflictos Motivacionales de Kurt Lewin (Boss Challenge)
**Enunciado:** Identifique el tipo de conflicto motivacional de Kurt Lewin que se presenta en las siguientes situaciones:
1. Carlos debe elegir entre pasar un fin de semana en un campamento de playa con sus mejores amigos o asistir a un concierto VIP de su banda de rock favorita, ambas opciones con todos los gastos pagados.
2. Gabriela detesta estudiar física cuántica, pero si no la estudia reprobará el semestre y perderá su condición de becaria en la universidad.
3. Felipe tiene un intenso deseo de postular a una beca de posgrado en el extranjero que le garantizará éxito profesional, pero siente un inmenso temor al desarraigo, la soledad y la barrera idiomática de vivir solo en un país lejano.
La secuencia correcta de tipos de conflicto es:
A) Atracción-Atracción / Evitación-Evitación / Atracción-Evitación  
B) Evitación-Evitación / Atracción-Atracción / Doble Atracción-Evitación  
C) Atracción-Evitación / Evitación-Evitación / Atracción-Atracción  
D) Atracción-Atracción / Atracción-Evitación / Evitación-Evitación  
E) Doble Atracción-Evitación / Evitación-Evitación / Atracción-Atracción  

**Solución paso a paso:**
1. Situación 1: Dos metas deseadas y apetecibles (campamento o concierto VIP): **Atracción - Atracción (++)**.
2. Situación 2: Dos opciones temidas o indeseables (estudiar algo que detesta o perder la beca): **Evitación - Evitación (--)**.
3. Situación 3: Un mismo objetivo (la beca en el extranjero) que atrae poderosamente por el éxito pero asusta por el desarraigo: **Atracción - Evitación (+-)**.
4. Secuencia ordenada: Atracción-Atracción / Evitación-Evitación / Atracción-Evitación.

**Respuesta:** A) Atracción-Atracción / Evitación-Evitación / Atracción-Evitación.

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Neuroeconomía y Neuromarketing:** Los anunciantes y diseñadores de interfaces activan el circuito dopaminérgico mesolímbico para generar compras impulsivas asociando productos comerciales a necesidades de pertenencia social o estatus (Maslow).
- **Psicoterapia Cognitivo-Conductual (TCC):** La teoría bifactorial de Schachter-Singer y la terapia racional emotiva de Albert Ellis demuestran que modificando la interpretación cognitiva del estímulo se regula el pánico y la fobia social.
- **Liderazgo y Recursos Humanos:** Los perfiles de McClelland se emplean para ubicar a profesionales orientados al logro en investigación y desarrollo, a perfiles de poder en la gerencia general y a perfiles de afiliación en relaciones humanas.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Cómo se denomina el estado afectivo absorbente y de gran intensidad que canaliza y monopoliza todas las energías vitales de una persona hacia una meta exclusiva durante años?
   - *Pista:* Puede ser superior (arte/ciencia) o inferior (ludopatía).
   - *Clave:* Pasión.

2. Según Paul Ekman, ¿cuáles son las seis emociones básicas primarias universales reconocibles transculturalmente por las expresiones faciales?
   - *Pista:* Alegría, tristeza, ira, asco, sorpresa y...
   - *Clave:* Alegría, tristeza, ira, asco, miedo y sorpresa.

3. En la teoría de David McClelland, ¿qué tipo de necesidad domina en una persona que busca permanentemente dirigir equipos, asumir el mando y determinar las reglas de un colectivo?
   - *Pista:* Letra P en el modelo LPA.
   - *Clave:* Necesidad de poder.

4. ¿Qué estructura subcortical del sistema límbico desempeña un papel central en el procesamiento y memoria del miedo y la agresividad?
   - *Pista:* Estructura con forma de almendra en el lóbulo temporal.
   - *Clave:* Amígdala cerebral.

5. Un estudiante se debate entre dos ofertas de trabajo: el empleo A paga un excelente sueldo pero el clima laboral es tóxico; el empleo B tiene un ambiente laboral extraordinario pero el sueldo es muy modesto. ¿Qué tipo de conflicto de Lewin experimenta?
   - *Pista:* Ambas opciones tienen aspectos positivos y negativos a la vez.
   - *Clave:* Doble atracción - evitación.

---



### 4.3. Tipología de Conflictos Motivacionales de Kurt Lewin
Cuando coexisten tendencias motivacionales incompatibles:
1. **Atracción - Atracción (++):** El sujeto se encuentra ante dos metas igualmente atractivas y deseables, pero mutuamente excluyentes (ej. ser admitido simultáneamente en dos universidades de gran prestigio).
2. **Evitación - Evitación (--):** El sujeto debe elegir entre dos alternativas desagradables, temidas o aversivas (ej. someterse a una dolorosa cirugía dental o sufrir una infección crónica).
3. **Atracción - Evitación (+-):** Una **misma meta u objeto** posee simultáneamente aspectos sumamente atractivos y aspectos aversivos o costos elevados (ej. postular a la carrera de sus sueños sabiendo que exige un internado hospitalario extenuante de guardias nocturnas).
4. **Doble Atracción - Evitación (+- vs. +-):** El sujeto debe elegir entre dos o más opciones, y cada una de ellas contiene ventajas apetecibles y desventajas notables.

---



### Problema 1: Identificación de la Forma Afectiva (Nivel Básico)
**Enunciado:** Mientras camina por una calle solitaria, Andrés escucha el frenazo intempestivo de un automóvil a pocos centímetros de él. De inmediato, su ritmo cardíaco se acelera a 130 latidos por minuto, se dilatan sus pupilas, palidece y da un salto hacia la acera. Esta reacción inmediata, intensa y de corta duración constituye un claro ejemplo de:
A) Sentimiento superior  
B) Estado de ánimo  
C) Emoción primaria o básica  
D) Pasión creadora  
E) Conflicto conativo  

**Solución paso a paso:**
1. El cuadro describe una respuesta automática súbita ante un peligro inminente (estímulo amenazante).
2. Se caracteriza por alta intensidad, brevedad temporal y una violenta activación del sistema nervioso simpático (taquicardia, midriasis, palidez periférica).
3. Estas propiedades definen a la **Emoción** (específicamente, el miedo reactivo).

**Respuesta:** C) Emoción primaria o básica.

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t06_s02_c01",
                    question = "La 'Motivación Intrínseca' se produce cuando una persona realiza una actividad:",
                    options = listOf(
                        "Por el puro placer, curiosidad, interés y satisfacción inherente que la propia actividad le genera, sin depender de recompensas externas contingentes.",
                        "Para complacer la vanidad de sus progenitores.",
                        "Bajo amenaza de despido laboral inmediato.",
                        "Exclusivamente para ganar una suma de dinero o evitar un castigo severo.",
                    ),
                    correctIndex = 0,
                    explanation = "La motivación intrínseca nace del interior del sujeto: estudiar física porque fascina comprender el universo o tocar piano por el goce estético de la música."
                ),
                Challenge(
                    id = "psi_t06_s02_c02",
                    question = "Por el contrario, la 'Motivación Extrínseca' guía la conducta cuando el incentivo determinante proviene de:",
                    options = listOf(
                        "Factores externos al individuo o consecuencias ajenas a la tarea (premios materiales, dinero, diplomas, reconocimiento social, aprobación o elusión de castigos).",
                        "El amor desinteresado por la ciencia pura.",
                        "La satisfacción del deber moral cumplido.",
                        "La autocrítica reflexiva personal.",
                    ),
                    correctIndex = 0,
                    explanation = "En la motivación extrínseca la tarea es solo un medio instrumental para alcanzar una gratificación externa o evitar un perjuicio."
                ),
                Challenge(
                    id = "psi_t06_s02_c03",
                    question = "En la famosa Jerarquía de Necesidades formulada por el psicólogo humanista Abraham Maslow, las necesidades se estructuran piramidalmente desde la base hacia la cúspide en el siguiente orden:",
                    options = listOf(
                        "Fisiológicas → Seguridad → Afiliación/Amor → Estima/Reconocimiento → Autorrealización.",
                        "Autorrealización → Reconocimiento → Afiliación → Seguridad → Fisiológicas.",
                        "Dinero → Poder → Fama → Descanso → Inmortalidad.",
                        "Cognitivas → Estéticas → Espirituales → Materiales → Sintéticas.",
                    ),
                    correctIndex = 0,
                    explanation = "Maslow propuso que las necesidades deficitarias básicas (fisiología y seguridad) deben ser razonablemente satisfechas antes de que emerjan las necesidades superiores de crecimiento y autorrealización."
                ),
                Challenge(
                    id = "psi_t06_s02_c04",
                    question = "En la pirámide de Maslow, las 'Necesidades de Seguridad' abarcan:",
                    options = listOf(
                        "La estabilidad física, la protección ante peligros o agresiones, la seguridad en el empleo, la vivienda digna y la salud personal.",
                        "La obtención de premios Nobel y reconocimientos mundiales.",
                        "El consumo de agua y comida.",
                        "El despertar de la creatividad artística poética.",
                    ),
                    correctIndex = 0,
                    explanation = "Las necesidades de seguridad protegen al individuo de la incertidumbre, el caos, el miedo al futuro y la violencia del medio ambiente."
                ),
                Challenge(
                    id = "psi_t06_s02_c05",
                    question = "La 'Autorrealización' se ubica en el vértice superior de la pirámide de Maslow y representa el anhelo humano de:",
                    options = listOf(
                        "Ser el hombre más rico del cementerio.",
                        "Desarrollar al máximo el propio potencial humano, talentos, capacidades y creatividad para llegar a ser todo lo que uno es capaz de ser.",
                        "Someter la voluntad de las masas políticas.",
                        "Consumir productos de lujo exclusivos.",
                    ),
                    correctIndex = 1,
                    explanation = "La autorrealización (metanecesidad) es la cúspide de la salud mental según Maslow: vivir de acuerdo con la verdad, la belleza, la autonomía y la vocación plena."
                ),
                Challenge(
                    id = "psi_t06_s02_c06",
                    question = "El 'Efecto de Sobrejustificación' (Deci y Ryan) en la psicología motivacional demuestra experimentalmente que cuando a una persona se le otorga una recompensa extrínseca desmedida por realizar una tarea que antes disfrutaba intrínsecamente:",
                    options = listOf(
                        "Su interés y motivación intrínseca inicial por la tarea tienden a disminuir drásticamente, pues el sujeto pasa a atribuir su conducta al premio externo.",
                        "Su motivación intrínseca aumenta al triple de forma permanente.",
                        "Se convierte automáticamente en un genio de las matemáticas.",
                        "Olvida cómo realizar la tarea.",
                    ),
                    correctIndex = 0,
                    explanation = "Si se paga a un niño por dibujar cuando ya le encantaba hacerlo, al retirar el pago dejará de dibujar: el premio externo corrompió la motivación autónoma originaria."
                ),
                Challenge(
                    id = "psi_t06_s02_c07",
                    question = "La Teoría de la Autodeterminación (Deci y Ryan) postula que para cultivar una sólida motivación intrínseca en el aprendizaje se deben satisfacer tres necesidades psicológicas básicas innatas:",
                    options = listOf(
                        "Inmovilidad, silencio y memorización.",
                        "Castigo, obediencia y sumisión.",
                        "Autonomía (sentirse libre y en control), Competencia (sentirse eficaz y capaz) y Relación/Conexión social (sentirse aceptado y valorado).",
                        "Dinero, poder y fama.",
                    ),
                    correctIndex = 2,
                    explanation = "Cuando los estudiantes experimentan autonomía en sus métodos, sienten que dominan los desafíos (competencia) y se sienten apoyados por sus pares y maestros (relación), su motivación florece."
                ),
                Challenge(
                    id = "psi_t06_s02_c08",
                    question = "Un postulante que estudia exclusivamente porque sus padres le prometieron regalarle un teléfono de última generación si aprueba el examen de admisión, actúa bajo una motivación:",
                    options = listOf(
                        "Intrínseca pura",
                        "Extrínseca",
                        "Trascendente espiritual",
                        "Homeostática primaria",
                    ),
                    correctIndex = 1,
                    explanation = "La conducta de estudiar está subordinada al incentivo material externo; si se elimina la promesa del celular, la conducta de estudio decae."
                ),
                Challenge(
                    id = "psi_t06_s02_c09",
                    question = "En la tipología de Maslow, las necesidades se agrupan en dos grandes categorías cualitativas:",
                    options = listOf(
                        "Necesidades urbanas y rurales.",
                        "Necesidades infantiles y seniles.",
                        "Necesidades de Deficiencia o Carencia (D-needs: de la base a la estima) y Necesidades de Ser o Crecimiento (B-needs: autorrealización).",
                        "Necesidades computacionales y mecánicas.",
                    ),
                    correctIndex = 2,
                    explanation = "Las necesidades D se activan por privación y buscan reducir la tensión; las necesidades B no se agotan al satisfacerse, sino que se expanden hacia la plenitud y la verdad."
                ),
                Challenge(
                    id = "psi_t06_s02_c10",
                    question = "El concepto de 'Flujo' (Flow) descrito por Mihaly Csikszentmihalyi es un estado de motivación intrínseca óptima que ocurre cuando:",
                    options = listOf(
                        "La tarea es excesivamente fácil y provoca aburrimiento.",
                        "El sujeto está medio dormido sin ninguna actividad cerebral.",
                        "El desafío es imposible y desata un ataque de pánico paralizante.",
                        "La persona se encuentra totalmente inmersa y absorta en una actividad que representa un equilibrio perfecto entre un alto desafío y sus altas habilidades, perdiendo la noción del tiempo.",
                    ),
                    correctIndex = 3,
                    explanation = "En el estado de flujo, la concentración es máxima y placentera; resolver un problema desafiante absorbe toda la energía psíquica en una experiencia cumbre."
                ),
            )
        )
    )
}
