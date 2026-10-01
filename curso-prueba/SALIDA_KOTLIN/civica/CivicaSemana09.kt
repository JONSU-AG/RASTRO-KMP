package civica

object CivicaSemana09 {

    val lessons = listOf(
        LessonNode(
            id = "civ_t09_s01",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "La Descentralización y los Gobiernos Regionales: Estructura, Atribuciones y Competencias",
            theory = LessonTheory(
                content = """# TEMA 09: GOBIERNOS REGIONALES Y LOCALES

---



## 2. MAPA CONCEPTUAL Y ÁRBOL DE LA DESCENTRALIZACIÓN

```
                        GOBIERNOS REGIONALES Y LOCALES
                                      │
         ┌────────────────────────────┴────────────────────────────┐
         ▼                                                         ▼
GOBIERNOS REGIONALES                                      GOBIERNOS LOCALES
 (Ley N.° 27867 - Regional)                                (Ley N.° 27972 - Municipal)
         │                                                         │
 ┌───────┴───────┬───────────────┐                         ┌───────┴───────┬───────────────┐
 ▼               ▼               ▼                         ▼               ▼               ▼
ÓRGANO          ÓRGANO          ÓRGANO                    ÓRGANO          ÓRGANO          ÓRGANO
EJECUTIVO       NORMATIVO       CONSULTIVO                EJECUTIVO       NORMATIVO       CONSULTIVO
• Gobernador    • Consejo       • Consejo de              • Alcalde       • Concejo       • Consejo de
  Regional        Regional        Coordinación              (Mandato de     Municipal       Coordinación
• Vicegober-    • Dicta           Regional (CCR)            4 años, sin     (Alcalde +      Local (CCL)
  nador           Ordenanzas    • Alcaldes y                reelección)     Regidores)    • Sociedad
  (4 años)        Regionales      sociedad civil                          • Ordenanzas      civil
                                                                            Municipales
```

---



## 3. DESARROLLO TEÓRICO RIGUROSO



### A. El Proceso de Descentralización en el Perú
1. **Definición Constitucional (Artículo 188° de la Constitución)**:
   - *"La descentralización es una forma de organización democrática y constituye una política permanente de Estado, de carácter obligatorio, que tiene como objetivo fundamental el desarrollo integral del país"*.
   - El territorio de la República está dividido en **departamentos, provincias, distritos y centros poblados**, en cuyas circunscripciones se ejerce el gobierno de manera desconcentrada.
2. **Niveles de Gobierno**:
   - **Gobierno Nacional**: Con competencias en políticas generales, soberanía exterior, defensa nacional y moneda.
   - **Gobierno Regional**: Con competencias de desarrollo económico y social departamental.
   - **Gobierno Local**: Con competencias vecinales y de servicios públicos comunitarios distritales y provinciales.
3. **Autonomía Subnacional (Artículo 191° y 194°)**:
   - Los Gobiernos Regionales y las Municipalidades gozan de **autonomía política, económica y administrativa en los asuntos de su competencia**.
   - *Límite insoslayable*: La autonomía no equivale a soberanía; están subordinados a la Constitución y a las leyes de la República (principio de unidad del Estado).



### B. Los Gobiernos Regionales (Ley N.° 27867, Ley Orgánica de Gobiernos Regionales)
Ejercen su jurisdicción en los 24 departamentos más la Provincia Constitucional del Callao (existen 25 Gobiernos Regionales en total; la provincia de Lima Metropolitana tiene un régimen especial con competencias regionales asumidas por la Municipalidad Metropolitana de Lima).

#### Estructura Orgánica Regional:
1. **El Consejo Regional (Órgano Normativo y Fiscalizador)**:
   - Integrado por **Consejeros Regionales** elegidos por sufragio directo por 4 años (mínimo 7 consejeros, máximo 25).
   - Presidido por el **Consejero Delegado** (elegido entre ellos anualmente).
   - Funciones: Aprobar, modificar o derogar **Ordenanzas Regionales** (con rango de ley en su territorio) y **Acuerdos de Consejo**, fiscalizar los actos del gobernador, aprobar el presupuesto regional y el plan de desarrollo concertado.
2. **La Gobernación Regional (Órgano Ejecutivo)**:
   - Encabezada por el **Gobernador Regional**, máxima autoridad ejecutiva de la región, acompañado de un **Vicegobernador Regional**.
   - Elegidos por mandato de **4 años** mediante sufragio directo (requieren mínimo el 30\% de votos válidos para ganar en primera vuelta).
   - **Prohibición de reelección inmediata** (reforma constitucional Ley N.° 30305).
   - Funciones: Dirigir la administración regional, promulgar las ordenanzas, administrar los bienes y rentas de la región, y ejecutar el presupuesto de inversión pública.
3. **El Consejo de Coordinación Regional (CCR - Órgano Consultivo)**:
   - Espacio de concertación presidido por el Gobernador Regional e integrado por los Alcaldes Provinciales de la región y representantes de la sociedad civil organizada (organizaciones agrarias, laborales, empresariales, colegios profesionales). Emite opiniones consultivas no vinculantes.



### C. Los Gobiernos Locales o Municipalidades (Ley N.° 27972, Ley Orgánica de Municipalidades)
Son las entidades básicas de la organización territorial del Estado y canales inmediatos de participación vecinal en los asuntos públicos:
- **Clasificación Territorial**:
  - *Municipalidades Provinciales*: Ejerzan jurisdicción sobre el territorio de la provincia y coordinan con los distritos.
  - *Municipalidades Distritales*: Ejerzan jurisdicción sobre la circunscripción distrital.
  - *Municipalidades de Centros Poblados*: Creadas por ordenanza provincial a solicitud de comunidades rurales organizadas para delegarles servicios básicos.

#### Estructura Orgánica Municipal:
1. **El Concejo Municipal (Órgano Normativo y Fiscalizador)**:
   - Compuesto por el **Alcalde** (quien lo preside con voto dirimente) y el cuerpo de **Regidores** elegidos por sufragio popular para un período de **4 años** (sin reelección inmediata).
   - Funciones: Dictar **Ordenanzas Municipales** (normas de mayor jerarquía local con rango de ley) y **Acuerdos de Concejo**, aprobar el plan de desarrollo urbano, el presupuesto participativo y fiscalizar la gestión edil.
2. **La Alcaldía (Órgano Ejecutivo)**:
   - Ejercida por el **Alcalde**, representante legal de la municipalidad y máxima autoridad administrativa de la corporación edilicia.
   - Aplica las ordenanzas mediante **Decretos de Alcaldía** y ejecuta las obras y servicios públicos locales.
3. **El Consejo de Coordinación Local (CCL - Provincial o Distrital)**:
   - Órgano consultivo de coordinación integrado por el Alcalde, los regidores y delegados de las juntas vecinales y organizaciones sociales de base.

#### Competencias Exclusivas y Servicios Municipales:
- Planificación y zonificación urbana y rural; catastro distrital.
- Tránsito y transporte urbano (vialidad, señalización, semaforización).
- Saneamiento ambiental, recolección y disposición final de residuos sólidos (limpieza pública).
- Seguridad ciudadana en coordinación con la PNP (servicio de **Serenazgo**).
- Autorizaciones y fiscalización de **Licencias de Funcionamiento** comercial y de edificación.
- Registro Civil (en los municipios donde la función no ha sido asumida directamente por el RENIEC).



## 4. CUADRO COMPARATIVO: GOBIERNO REGIONAL VS. GOBIERNO LOCAL

| Dimensión Institucional | Gobierno Regional (GORE) | Gobierno Local (Municipalidad) |
| :--- | :--- | :--- |
| **Ley Orgánica Matriz** | Ley Orgánica N.° 27867. | Ley Orgánica N.° 27972. |
| **Ámbito Territorial** | Departamentos y Prov. Const. del Callao (25 en total).| Provincias, Distritos y Centros Poblados. |
| **Órgano Ejecutivo** | Gobernador y Vicegobernador Regional. | Alcalde Provincial o Distrital. |
| **Órgano Normativo** | Consejo Regional (Consejeros Regionales). | Concejo Municipal (Alcalde + Regidores). |
| **Norma Suprema Emitida**| **Ordenanza Regional** (Rango de ley). | **Ordenanza Municipal** (Rango de ley). |
| **Mandato y Reelección** | **4 años**, terminantemente prohibida la reelección inmediata.| **4 años**, terminantemente prohibida la reelección inmediata. |
| **Órgano Consultivo** | Consejo de Coordinación Regional (CCR). | Consejo de Coordinación Local (CCL). |
| **Competencias Clave** | Redes viales departamentales, hospitales, puertos, educación superior.| Serenazgo, limpieza pública, parques, pistas urbanas, licencias comerciales.|

---



## 5. MNEMOTECNIAS PREUNIVERSITARIAS



### Nemotecnia de los Órganos Subnacionales:
> **"CONSEJO NORMA, GOBERNADOR / ALCALDE EJECUTA, COORDINACIÓN CONSULTA"**
- Órgano normativo / fiscalizador = Consejo Regional / Concejo Municipal.
- Órgano ejecutivo = Gobernador Regional / Alcalde.
- Órgano de concertación y consulta = CCR / CCL.



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **Lima Metropolitana no es un Gobierno Regional común**:
   - La provincia de Lima no tiene un gobernador regional propio; la **Municipalidad Metropolitana de Lima asume simultáneamente las funciones de municipio provincial y de gobierno regional**.
2. **Reelección Inmediata de Alcaldes**:
   - Ningún alcalde ni gobernador puede postular a la reelección para el período siguiente inmediato. Si un examen plantea que un alcalde busca la reelección consecutiva, es **jurídicamente inválido**.
3. **El Canon no es un impuesto nuevo**:
   - El canon **no lo pagan los ciudadanos como tributo adicional**; es una participación del 50% del impuesto que las empresas mineras/petroleras ya tributaron al Tesoro Público nacional.

---



## 7. PROBLEMAS RESUELTOS CON RIGOR GRADUAL



### Nivel 1: Básico / Definición Directa
**Enunciado**: El órgano colegiado que ejerce funciones normativas y de fiscalización en la estructura orgánica de un Gobierno Regional en el Perú se denomina:
A) Gerencia General Regional  
B) Consejo de Coordinación Regional (CCR)  
C) Consejo Regional  
D) Concejo de Regidores  
E) Junta de Alcaldes Departamentales  

- **Resolución**: De conformidad con la Ley Orgánica de Gobiernos Regionales (Ley N.° 27867), el **Consejo Regional** es el órgano normativo y fiscalizador del gobierno regional, integrado por los consejeros regionales.
- **Clave Correcta**: **C**

---



### Nivel 2: Intermedio / Comprensión Financiera
**Enunciado**: Los recursos financieros que los Gobiernos Regionales y Locales reciben por concepto de **Canon Minero** provienen legalmente de:
A) El 18% del Impuesto General a las Ventas recaudado en la provincia.  
B) El 50% del Impuesto a la Renta que pagan las empresas mineras por la explotación de yacimientos en la zona.  
C) Un aporte voluntario mensual que las comunidades campesinas entregan al municipio.  
D) El cobro de los arbitrios de seguridad ciudadana y limpieza pública.  
E) Un préstamo extraordinario no reembolsable del Banco Mundial.  

- **Resolución**: Según la Ley de Canon (Ley N.° 27506), el canon es la participación del **50\% del Impuesto a la Renta** que el Estado percibe de las empresas por el aprovechamiento económico de los recursos naturales mineros.
- **Clave Correcta**: **B**

---



### Nivel 5: Reto Extremo (Boss Challenge / UNI - UNSA Medicina)
**Enunciado**: El Gobernador de una región del centro del país promulga una **Ordenanza Regional** en la cual prohíbe el tránsito de camiones de carga de empresas privadas por las carreteras nacionales que atraviesan su departamento y declara nula una concesión vial minera otorgada por el Ministerio de Transportes y Comunicaciones (MTC), argumentando que su región ejerce soberanía territorial absoluta sobre su espacio geográfico. Frente a este conflicto de competencias, el Poder Ejecutivo debe interponer una:
A) Acción de Hábeas Data ante el Juzgado de Paz Letrado de la provincia.  
B) Demanda de Inconstitucionalidad o Proceso Competencial ante el Tribunal Constitucional, demostrando que la ordenanza vulnera el carácter unitario de la República y competencias exclusivas del gobierno nacional.  
C) Demanda de interdicción civil contra todos los consejeros regionales.  
D) Solicitud de referéndum regional ante el Jurado Nacional de Elecciones.  
E) Acción Popular ante el alcalde distrital más antiguo de la región.  

- **Resolución**: La Constitución consagra que el Perú es un **Estado Unitario descentralizado** (Art. 43°); la autonomía regional no ampara la soberanía ni la invasión de competencias nacionales exclusivas (como la red vial nacional y el libre tránsito interdepartamental). Al emitirse una Ordenanza Regional que transgrede competencias del gobierno central, el Poder Ejecutivo acude al **Tribunal Constitucional** mediante un **Proceso Competencial** o una **Acción de Inconstitucionalidad** para anular la ordenanza regional ultra vires.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS CÍVICOS
1. **Descentralización**: Transferencia permanente de poderes, competencias y recursos desde el centro hacia las regiones y municipios.
2. **Autonomía Regional**: Potestad de autogobierno normativo, económico y administrativo de los GORE dentro del marco constitucional.
3. **Ordenanza Regional**: Norma jurídica de máxima jerarquía emitida por el Consejo Regional con rango de ley en su departamento.
4. **Ordenanza Municipal**: Norma de mayor rango emanada del Concejo Municipal obligatoria en su circunscripción distrital o provincial.
5. **Canon**: Asignación del 50% del impuesto a la renta de empresas extractivas para obras de inversión en la zona de explotación.
6. **FONCOMUN**: Fondo de Compensación Municipal nacional para financiar proyectos en municipios de menores recursos.
7. **Arbitrios**: Tasas municipales pagadas por los vecinos como contraprestación por servicios locales de limpieza, parques y serenazgo.
8. **Presupuesto Participativo**: Proceso democrático de priorización del gasto de inversión entre vecinos y autoridades ediles.
9. **CCR**: Consejo de Coordinación Regional, órgano consultivo integrado por alcaldes provinciales y sociedad civil.
10. **CCL**: Consejo de Coordinación Local, órgano consultivo municipal para articular políticas de desarrollo urbano y vecinal.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuáles son los dos órganos fundamentales que componen un Gobierno Regional?
  - *Reverso*: 1) El Consejo Regional (normativo y fiscalizador); 2) La Gobernación Regional (ejecutivo).

- **Flashcard 2**:
  - *Anverso*: ¿Cuánto dura el mandato de alcaldes y gobernadores y se permite su reelección inmediata?
  - *Reverso*: Mandato de 4 años; la reelección inmediata está prohibida en ambos cargos.

- **Flashcard 3**:
  - *Anverso*: ¿En qué está terminantemente prohibido utilizar los recursos del Canon Minero?
  - *Reverso*: En gasto corriente, pago de sueldos o remuneraciones de funcionarios administrativos.

- **Flashcard 4**:
  - *Anverso*: ¿Qué rango jerárquico tienen las Ordenanzas Regionales y Municipales?
  - *Reverso*: Rango de ley (Nivel Legal en la pirámide de Kelsen).

---



### D. Rentas, Tributos y Fuentes de Financiamiento Subnacional
1. **El Canon**:
   - Es la participación efectiva y equitativa de la que gozan los Gobiernos Regionales y Locales del **50% del Impuesto a la Renta que pagan las empresas extractivas al Estado nacional** por la explotación de recursos naturales en su territorio.
   - *Modalidades de Canon*: Minero (fundamental en Arequipa, Moquegua, Tacna, Cusco, Áncash), Petrolero, Gasífero (Camisea), Hidroenergético, Pesquero y Forestal.
   - *Destino legal obligatorio*: Los recursos del canon solo pueden destinarse al financiamiento de **obras de infraestructura e inversión pública de impacto regional y local**, y un porcentaje a la investigación científica en universidades públicas; **está terminantemente prohibido usarlos para pagar sueldos corrientes**.
2. **El Sobrecanon**:
   - Ingreso especial complementario establecido por leyes especiales para determinadas regiones (ej. Loreto, Ucayali, Piura) sobre la producción petrolera o gasífera.
3. **El FONCOMUN (Fondo de Compensación Municipal)**:
   - Fondo redistributivo nacional creado por la Constitución para promover la equidad territorial, financiado principalmente con dos puntos del Impuesto de Promoción Municipal (IPM) aplicado a las ventas gravadas con el IGV. Se distribuye con prioridad hacia municipios rurales pobres.
4. **Tributos Municipales Propios**:
   - *Impuestos Municipales*: Impuesto Predial (sobre el valor de predios urbanos y rústicos), Impuesto de Alcabala (sobre transferencias inmobiliarias), Impuesto al Patrimonio Vehicular.
   - *Tasas y Arbitrios*: Cobros por la prestación efectiva de un servicio público local individualizado (**arbitrios de limpieza pública, parques y jardines, y serenazgo**; derechos y licencias).



### Nivel 3: Aplicación / Casuística
**Enunciado**: Un alcalde provincial electo para el período 2023-2026 decide utilizar el 80% de los fondos recibidos por concepto de canon minero para duplicar el sueldo de los funcionarios de confianza de la municipalidad y pagar bonificaciones extraordinarias al personal administrativo. De acuerdo con el ordenamiento jurídico peruano, dicha disposición financiera es:
A) Legítima, dado que la autonomía municipal permite disponer libremente del presupuesto sin rendición de cuentas.  
B) Ilegal, porque la ley prohíbe taxativamente destinar los fondos del canon a gastos corrientes o pago de remuneraciones, debiendo aplicarse exclusivamente a proyectos de inversión pública e infraestructura.  
C) Permitida solo si el Concejo Municipal aprueba una resolución de alcaldía de urgencia.  
D) Una competencia exclusiva del Consejo de Coordinación Local (CCL).  
E) Válida únicamente en el último año de gestión municipal.  

- **Resolución**: La Ley de Canon establece con rigor que los fondos derivados del canon **están destinados exclusivamente a gastos de inversión pública** (construcción de obras de infraestructura, carreteras, saneamiento, educación) y está prohibido por ley emplearlos en el pago de gasto corriente, sueldos o bonos salariales.
- **Clave Correcta**: **B**

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "civ_t09_s01_c01",
                    question = "Según el Artículo 188° de la Constitución Política del Perú, la descentralización se define fundamentalmente como:",
                    options = listOf(
                        "Una medida temporal de emergencia fiscal",
                        "La conversión de la República en una federación de estados independientes",
                        "Una política permanente de Estado de carácter obligatorio para el desarrollo integral del país",
                        "La delegación de la seguridad interna a las fuerzas armadas",
                    ),
                    correctIndex = 2,
                    explanation = "La Carta Magna establece que la descentralización es una política permanente y obligatoria orientada al desarrollo nacional."
                ),
                Challenge(
                    id = "civ_t09_s01_c02",
                    question = "El órgano colegiado que ejerce las funciones normativas y fiscalizadoras dentro del Gobierno Regional se denomina:",
                    options = listOf(
                        "Consejo Regional",
                        "Gobernación Regional",
                        "Consejo de Coordinación Regional",
                        "Dirección Regional Agraria",
                    ),
                    correctIndex = 0,
                    explanation = "El Consejo Regional, integrado por los consejeros regionales y presidido por el consejero delegado, ejerce la potestad normativa y fiscalizadora."
                ),
                Challenge(
                    id = "civ_t09_s01_c03",
                    question = "La norma jurídica de más alta jerarquía expedida por el Consejo Regional que posee fuerza y rango de ley en su territorio es la:",
                    options = listOf(
                        "Resolución Ejecutiva Regional",
                        "Ordenanza Regional",
                        "Directiva Presidencial",
                        "Decreto Supremo Departamental",
                    ),
                    correctIndex = 1,
                    explanation = "Las Ordenanzas Regionales son las normas supremas del gobierno regional y tienen rango legal en su ámbito competencial."
                ),
                Challenge(
                    id = "civ_t09_s01_c04",
                    question = "Para que una fórmula a la gobernación regional resulte ganadora en primera vuelta electoral se requiere alcanzar como umbral legal mínimo:",
                    options = listOf(
                        "El 50% más uno de votos válidos",
                        "La mayoría simple de electores del padrón",
                        "El 45% de los votos computados",
                        "Al menos el 30% de los votos válidos",
                    ),
                    correctIndex = 3,
                    explanation = "A diferencia de la presidencia, la Ley de Elecciones Regionales fija en 30% de votos válidos el umbral para triunfar en primera vuelta."
                ),
                Challenge(
                    id = "civ_t09_s01_c05",
                    question = "Respecto a la reelección del Gobernador Regional al término de su período de cuatro años, el ordenamiento constitucional peruano establece:",
                    options = listOf(
                        "Prohibición taxativa de reelección inmediata",
                        "Reelección sujeta al permiso de la Corte Suprema",
                        "Reelección inmediata permitida por un mandato más",
                        "Reelección indefinida si supera el 60% de votos",
                    ),
                    correctIndex = 0,
                    explanation = "La Constitución prohíbe la reelección inmediata del Gobernador y Vicegobernador Regional para el período subsiguiente."
                ),
                Challenge(
                    id = "civ_t09_s01_c06",
                    question = "¿Qué entidad pública ejerce en la provincia de Lima las atribuciones y funciones correspondientes a un Gobierno Regional?",
                    options = listOf(
                        "El Gobierno Regional del Callao",
                        "El Ministerio de Vivienda y Construcción",
                        "La Presidencia del Consejo de Ministros",
                        "La Municipalidad Metropolitana de Lima",
                    ),
                    correctIndex = 3,
                    explanation = "La Municipalidad Metropolitana de Lima cuenta con régimen especial y asume las competencias de gobierno regional en la provincia de Lima."
                ),
                Challenge(
                    id = "civ_t09_s01_c07",
                    question = "El Consejo de Coordinación Regional (CCR) se caracteriza jurídicamente dentro del Gobierno Regional por ser un órgano:",
                    options = listOf(
                        "Jurisdiccional y disciplinario",
                        "Sancionador del gasto corriente",
                        "Legislativo con capacidad de vetar leyes",
                        "Consultivo y de concertación con los alcaldes provinciales y la sociedad civil",
                    ),
                    correctIndex = 3,
                    explanation = "El CCR es un espacio consultivo de concertación que reúne al gobernador con los alcaldes provinciales y la sociedad civil."
                ),
                Challenge(
                    id = "civ_t09_s01_c08",
                    question = "Los gobiernos regionales gozan de autonomía política, económica y administrativa, lo que significa que pueden:",
                    options = listOf(
                        "Crear su propia moneda e independizarse de la República",
                        "Firmar tratados limítrofes con potencias extranjeras",
                        "Rehusarse a acatar las sentencias del Tribunal Constitucional",
                        "Dictar normas y administrar sus recursos en materias de su competencia bajo el marco constitucional",
                    ),
                    correctIndex = 3,
                    explanation = "La autonomía les otorga autogobierno en sus competencias específicas, pero siempre bajo el imperio de la Constitución y del Estado unitario."
                ),
                Challenge(
                    id = "civ_t09_s01_c09",
                    question = "¿Cuántos Gobiernos Regionales existen formalmente en el Perú contando a los departamentos y al Callao?",
                    options = listOf(
                        "12",
                        "24",
                        "25",
                        "196",
                    ),
                    correctIndex = 2,
                    explanation = "Existen 25 Gobiernos Regionales correspondientes a los 24 departamentos más la Provincia Constitucional del Callao."
                ),
                Challenge(
                    id = "civ_t09_s01_c10",
                    question = "La función de dirigir y supervisar el funcionamiento del Consejo Regional cuando se reúne el pleno de consejeros recae en:",
                    options = listOf(
                        "El Consejero Delegado",
                        "El Prefecto Departamental",
                        "El Alcalde Provincial más antiguo",
                        "El Gobernador Regional",
                    ),
                    correctIndex = 0,
                    explanation = "El Consejero Delegado es elegido por los miembros del Consejo Regional para presidir sus sesiones de debate y fiscalización."
                ),
            )
        ),
        LessonNode(
            id = "civ_t09_s02",
            subjectId = "",
            semana = 0,
            subtema = "",
            title = "Los Gobiernos Locales (Municipalidades), Rentas Subnacionales y Presupuesto Participativo",
            theory = LessonTheory(
                content = """### C. Los Gobiernos Locales o Municipalidades (Ley N.° 27972, Ley Orgánica de Municipalidades)
Son las entidades básicas de la organización territorial del Estado y canales inmediatos de participación vecinal en los asuntos públicos:
- **Clasificación Territorial**:
  - *Municipalidades Provinciales*: Ejerzan jurisdicción sobre el territorio de la provincia y coordinan con los distritos.
  - *Municipalidades Distritales*: Ejerzan jurisdicción sobre la circunscripción distrital.
  - *Municipalidades de Centros Poblados*: Creadas por ordenanza provincial a solicitud de comunidades rurales organizadas para delegarles servicios básicos.

#### Estructura Orgánica Municipal:
1. **El Concejo Municipal (Órgano Normativo y Fiscalizador)**:
   - Compuesto por el **Alcalde** (quien lo preside con voto dirimente) y el cuerpo de **Regidores** elegidos por sufragio popular para un período de **4 años** (sin reelección inmediata).
   - Funciones: Dictar **Ordenanzas Municipales** (normas de mayor jerarquía local con rango de ley) y **Acuerdos de Concejo**, aprobar el plan de desarrollo urbano, el presupuesto participativo y fiscalizar la gestión edil.
2. **La Alcaldía (Órgano Ejecutivo)**:
   - Ejercida por el **Alcalde**, representante legal de la municipalidad y máxima autoridad administrativa de la corporación edilicia.
   - Aplica las ordenanzas mediante **Decretos de Alcaldía** y ejecuta las obras y servicios públicos locales.
3. **El Consejo de Coordinación Local (CCL - Provincial o Distrital)**:
   - Órgano consultivo de coordinación integrado por el Alcalde, los regidores y delegados de las juntas vecinales y organizaciones sociales de base.

#### Competencias Exclusivas y Servicios Municipales:
- Planificación y zonificación urbana y rural; catastro distrital.
- Tránsito y transporte urbano (vialidad, señalización, semaforización).
- Saneamiento ambiental, recolección y disposición final de residuos sólidos (limpieza pública).
- Seguridad ciudadana en coordinación con la PNP (servicio de **Serenazgo**).
- Autorizaciones y fiscalización de **Licencias de Funcionamiento** comercial y de edificación.
- Registro Civil (en los municipios donde la función no ha sido asumida directamente por el RENIEC).



### D. Rentas, Tributos y Fuentes de Financiamiento Subnacional
1. **El Canon**:
   - Es la participación efectiva y equitativa de la que gozan los Gobiernos Regionales y Locales del **50% del Impuesto a la Renta que pagan las empresas extractivas al Estado nacional** por la explotación de recursos naturales en su territorio.
   - *Modalidades de Canon*: Minero (fundamental en Arequipa, Moquegua, Tacna, Cusco, Áncash), Petrolero, Gasífero (Camisea), Hidroenergético, Pesquero y Forestal.
   - *Destino legal obligatorio*: Los recursos del canon solo pueden destinarse al financiamiento de **obras de infraestructura e inversión pública de impacto regional y local**, y un porcentaje a la investigación científica en universidades públicas; **está terminantemente prohibido usarlos para pagar sueldos corrientes**.
2. **El Sobrecanon**:
   - Ingreso especial complementario establecido por leyes especiales para determinadas regiones (ej. Loreto, Ucayali, Piura) sobre la producción petrolera o gasífera.
3. **El FONCOMUN (Fondo de Compensación Municipal)**:
   - Fondo redistributivo nacional creado por la Constitución para promover la equidad territorial, financiado principalmente con dos puntos del Impuesto de Promoción Municipal (IPM) aplicado a las ventas gravadas con el IGV. Se distribuye con prioridad hacia municipios rurales pobres.
4. **Tributos Municipales Propios**:
   - *Impuestos Municipales*: Impuesto Predial (sobre el valor de predios urbanos y rústicos), Impuesto de Alcabala (sobre transferencias inmobiliarias), Impuesto al Patrimonio Vehicular.
   - *Tasas y Arbitrios*: Cobros por la prestación efectiva de un servicio público local individualizado (**arbitrios de limpieza pública, parques y jardines, y serenazgo**; derechos y licencias).



### E. Mecanismos de Concertación y Participación Vecinal
- **El Presupuesto Participativo**:
  - Proceso de gestión pública mediante el cual los representantes de la sociedad civil organizada y las autoridades locales debaten, priorizan y asignan democráticamente una parte del presupuesto de inversión municipal a proyectos de impacto comunitario directo (pistas, postas, complejos deportivos, redes de agua).
- **Juntas Vecinales Comunales**:
  - Organizaciones vecinales representativas que canalizan peticiones barriales y apoyan la seguridad ciudadana y la vigilancia comunitaria.

---



## 4. CUADRO COMPARATIVO: GOBIERNO REGIONAL VS. GOBIERNO LOCAL

| Dimensión Institucional | Gobierno Regional (GORE) | Gobierno Local (Municipalidad) |
| :--- | :--- | :--- |
| **Ley Orgánica Matriz** | Ley Orgánica N.° 27867. | Ley Orgánica N.° 27972. |
| **Ámbito Territorial** | Departamentos y Prov. Const. del Callao (25 en total).| Provincias, Distritos y Centros Poblados. |
| **Órgano Ejecutivo** | Gobernador y Vicegobernador Regional. | Alcalde Provincial o Distrital. |
| **Órgano Normativo** | Consejo Regional (Consejeros Regionales). | Concejo Municipal (Alcalde + Regidores). |
| **Norma Suprema Emitida**| **Ordenanza Regional** (Rango de ley). | **Ordenanza Municipal** (Rango de ley). |
| **Mandato y Reelección** | **4 años**, terminantemente prohibida la reelección inmediata.| **4 años**, terminantemente prohibida la reelección inmediata. |
| **Órgano Consultivo** | Consejo de Coordinación Regional (CCR). | Consejo de Coordinación Local (CCL). |
| **Competencias Clave** | Redes viales departamentales, hospitales, puertos, educación superior.| Serenazgo, limpieza pública, parques, pistas urbanas, licencias comerciales.|

---



### Nemotecnia del Canon:
> **"CANON = 50% DEL IMPUESTO A LA RENTA PARA INVERSIÓN (NO SUELDOS)"**
- Solo para obras de infraestructura y desarrollo; prohibido gasto corriente administrativo.

---



## 6. CASUÍSTICA Y "HACKING" DE EXÁMENES (TRAMPAS FRECUENTES)
1. **Lima Metropolitana no es un Gobierno Regional común**:
   - La provincia de Lima no tiene un gobernador regional propio; la **Municipalidad Metropolitana de Lima asume simultáneamente las funciones de municipio provincial y de gobierno regional**.
2. **Reelección Inmediata de Alcaldes**:
   - Ningún alcalde ni gobernador puede postular a la reelección para el período siguiente inmediato. Si un examen plantea que un alcalde busca la reelección consecutiva, es **jurídicamente inválido**.
3. **El Canon no es un impuesto nuevo**:
   - El canon **no lo pagan los ciudadanos como tributo adicional**; es una participación del 50% del impuesto que las empresas mineras/petroleras ya tributaron al Tesoro Público nacional.

---



### Nivel 2: Intermedio / Comprensión Financiera
**Enunciado**: Los recursos financieros que los Gobiernos Regionales y Locales reciben por concepto de **Canon Minero** provienen legalmente de:
A) El 18% del Impuesto General a las Ventas recaudado en la provincia.  
B) El 50% del Impuesto a la Renta que pagan las empresas mineras por la explotación de yacimientos en la zona.  
C) Un aporte voluntario mensual que las comunidades campesinas entregan al municipio.  
D) El cobro de los arbitrios de seguridad ciudadana y limpieza pública.  
E) Un préstamo extraordinario no reembolsable del Banco Mundial.  

- **Resolución**: Según la Ley de Canon (Ley N.° 27506), el canon es la participación del **50\% del Impuesto a la Renta** que el Estado percibe de las empresas por el aprovechamiento económico de los recursos naturales mineros.
- **Clave Correcta**: **B**

---



### Nivel 3: Aplicación / Casuística
**Enunciado**: Un alcalde provincial electo para el período 2023-2026 decide utilizar el 80% de los fondos recibidos por concepto de canon minero para duplicar el sueldo de los funcionarios de confianza de la municipalidad y pagar bonificaciones extraordinarias al personal administrativo. De acuerdo con el ordenamiento jurídico peruano, dicha disposición financiera es:
A) Legítima, dado que la autonomía municipal permite disponer libremente del presupuesto sin rendición de cuentas.  
B) Ilegal, porque la ley prohíbe taxativamente destinar los fondos del canon a gastos corrientes o pago de remuneraciones, debiendo aplicarse exclusivamente a proyectos de inversión pública e infraestructura.  
C) Permitida solo si el Concejo Municipal aprueba una resolución de alcaldía de urgencia.  
D) Una competencia exclusiva del Consejo de Coordinación Local (CCL).  
E) Válida únicamente en el último año de gestión municipal.  

- **Resolución**: La Ley de Canon establece con rigor que los fondos derivados del canon **están destinados exclusivamente a gastos de inversión pública** (construcción de obras de infraestructura, carreteras, saneamiento, educación) y está prohibido por ley emplearlos en el pago de gasto corriente, sueldos o bonos salariales.
- **Clave Correcta**: **B**

---



### Nivel 4: Análisis Crítico / Modelo DECO - UNSA
**Enunciado**: En un distrito de la provincia de Arequipa, los dirigentes de las juntas vecinales, gremios de microempresarios y asociaciones juveniles son convocados por la municipalidad para participar en talleres donde evalúan las necesidades más urgentes del distrito y votan para priorizar la construcción de un centro de salud y el asfaltado de vías principales con cargo al presupuesto de inversión del año fiscal siguiente. Este proceso participativo institucionalizado se denomina:
A) Consulta previa para pueblos indígenas  
B) Presupuesto Participativo  
C) Demanda de rendición de cuentas  
D) Proceso de revocatoria popular  
E) Juicio político distrital  

- **Resolución**: El **Presupuesto Participativo** (regulado por la Ley Marco del Presupuesto Participativo, Ley N.° 28056) es el mecanismo cívico y democrático mediante el cual las autoridades locales y la sociedad civil organizada conciertan y priorizan conjuntamente los proyectos de inversión pública municipal.
- **Clave Correcta**: **B**

---



## 8. GLOSARIO TÉCNICO DE 10 TÉRMINOS CÍVICOS
1. **Descentralización**: Transferencia permanente de poderes, competencias y recursos desde el centro hacia las regiones y municipios.
2. **Autonomía Regional**: Potestad de autogobierno normativo, económico y administrativo de los GORE dentro del marco constitucional.
3. **Ordenanza Regional**: Norma jurídica de máxima jerarquía emitida por el Consejo Regional con rango de ley en su departamento.
4. **Ordenanza Municipal**: Norma de mayor rango emanada del Concejo Municipal obligatoria en su circunscripción distrital o provincial.
5. **Canon**: Asignación del 50% del impuesto a la renta de empresas extractivas para obras de inversión en la zona de explotación.
6. **FONCOMUN**: Fondo de Compensación Municipal nacional para financiar proyectos en municipios de menores recursos.
7. **Arbitrios**: Tasas municipales pagadas por los vecinos como contraprestación por servicios locales de limpieza, parques y serenazgo.
8. **Presupuesto Participativo**: Proceso democrático de priorización del gasto de inversión entre vecinos y autoridades ediles.
9. **CCR**: Consejo de Coordinación Regional, órgano consultivo integrado por alcaldes provinciales y sociedad civil.
10. **CCL**: Consejo de Coordinación Local, órgano consultivo municipal para articular políticas de desarrollo urbano y vecinal.

---



## 9. FLASHCARDS DE REPASO RÁPIDO (ANVERSO / REVERSO)

- **Flashcard 1**:
  - *Anverso*: ¿Cuáles son los dos órganos fundamentales que componen un Gobierno Regional?
  - *Reverso*: 1) El Consejo Regional (normativo y fiscalizador); 2) La Gobernación Regional (ejecutivo).

- **Flashcard 2**:
  - *Anverso*: ¿Cuánto dura el mandato de alcaldes y gobernadores y se permite su reelección inmediata?
  - *Reverso*: Mandato de 4 años; la reelección inmediata está prohibida en ambos cargos.

- **Flashcard 3**:
  - *Anverso*: ¿En qué está terminantemente prohibido utilizar los recursos del Canon Minero?
  - *Reverso*: En gasto corriente, pago de sueldos o remuneraciones de funcionarios administrativos.

- **Flashcard 4**:
  - *Anverso*: ¿Qué rango jerárquico tienen las Ordenanzas Regionales y Municipales?
  - *Reverso*: Rango de ley (Nivel Legal en la pirámide de Kelsen).

---



### B. Los Gobiernos Regionales (Ley N.° 27867, Ley Orgánica de Gobiernos Regionales)
Ejercen su jurisdicción en los 24 departamentos más la Provincia Constitucional del Callao (existen 25 Gobiernos Regionales en total; la provincia de Lima Metropolitana tiene un régimen especial con competencias regionales asumidas por la Municipalidad Metropolitana de Lima).

#### Estructura Orgánica Regional:
1. **El Consejo Regional (Órgano Normativo y Fiscalizador)**:
   - Integrado por **Consejeros Regionales** elegidos por sufragio directo por 4 años (mínimo 7 consejeros, máximo 25).
   - Presidido por el **Consejero Delegado** (elegido entre ellos anualmente).
   - Funciones: Aprobar, modificar o derogar **Ordenanzas Regionales** (con rango de ley en su territorio) y **Acuerdos de Consejo**, fiscalizar los actos del gobernador, aprobar el presupuesto regional y el plan de desarrollo concertado.
2. **La Gobernación Regional (Órgano Ejecutivo)**:
   - Encabezada por el **Gobernador Regional**, máxima autoridad ejecutiva de la región, acompañado de un **Vicegobernador Regional**.
   - Elegidos por mandato de **4 años** mediante sufragio directo (requieren mínimo el 30\% de votos válidos para ganar en primera vuelta).
   - **Prohibición de reelección inmediata** (reforma constitucional Ley N.° 30305).
   - Funciones: Dirigir la administración regional, promulgar las ordenanzas, administrar los bienes y rentas de la región, y ejecutar el presupuesto de inversión pública.
3. **El Consejo de Coordinación Regional (CCR - Órgano Consultivo)**:
   - Espacio de concertación presidido por el Gobernador Regional e integrado por los Alcaldes Provinciales de la región y representantes de la sociedad civil organizada (organizaciones agrarias, laborales, empresariales, colegios profesionales). Emite opiniones consultivas no vinculantes.



## 2. MAPA CONCEPTUAL Y ÁRBOL DE LA DESCENTRALIZACIÓN

```
                        GOBIERNOS REGIONALES Y LOCALES
                                      │
         ┌────────────────────────────┴────────────────────────────┐
         ▼                                                         ▼
GOBIERNOS REGIONALES                                      GOBIERNOS LOCALES
 (Ley N.° 27867 - Regional)                                (Ley N.° 27972 - Municipal)
         │                                                         │
 ┌───────┴───────┬───────────────┐                         ┌───────┴───────┬───────────────┐
 ▼               ▼               ▼                         ▼               ▼               ▼
ÓRGANO          ÓRGANO          ÓRGANO                    ÓRGANO          ÓRGANO          ÓRGANO
EJECUTIVO       NORMATIVO       CONSULTIVO                EJECUTIVO       NORMATIVO       CONSULTIVO
• Gobernador    • Consejo       • Consejo de              • Alcalde       • Concejo       • Consejo de
  Regional        Regional        Coordinación              (Mandato de     Municipal       Coordinación
• Vicegober-    • Dicta           Regional (CCR)            4 años, sin     (Alcalde +      Local (CCL)
  nador           Ordenanzas    • Alcaldes y                reelección)     Regidores)    • Sociedad
  (4 años)        Regionales      sociedad civil                          • Ordenanzas      civil
                                                                            Municipales
```

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "civ_t09_s02_c01",
                    question = "La norma jurídica de mayor jerarquía emitida por el Concejo Municipal que tiene rango de ley en su distrito o provincia es la:",
                    options = listOf(
                        "Ordenanza Municipal",
                        "Instrucción de Cobranza Coactiva",
                        "Resolución de Alcaldía",
                        "Directiva del Serenazgo",
                    ),
                    correctIndex = 0,
                    explanation = "Las Ordenanzas Municipales son normas con rango de ley en su jurisdicción expedidas por el Concejo Municipal."
                ),
                Challenge(
                    id = "civ_t09_s02_c02",
                    question = "El canon que reciben los Gobiernos Regionales y Municipalidades proviene formalmente del:",
                    options = listOf(
                        "10% de las multas de tránsito vehicular",
                        "100% de la venta de bonos soberanos de la República",
                        "50% del Impuesto a la Renta que pagan las empresas por la explotación de recursos naturales",
                        "Fondo monetario de la Reserva Federal",
                    ),
                    correctIndex = 2,
                    explanation = "El canon está constituido por el 50% del Impuesto a la Renta que abonan las empresas titulares de concesiones de recursos naturales."
                ),
                Challenge(
                    id = "civ_t09_s02_c03",
                    question = "Por disposición legal expresa, los recursos económicos derivados del canon minero o gasífero NO pueden utilizarse para:",
                    options = listOf(
                        "Obras de saneamiento y redes de agua potable",
                        "Pago de remuneraciones y planillas corrientes de personal municipal",
                        "Investigación científica en universidades públicas",
                        "Construcción de carreteras y puentes vecinales",
                    ),
                    correctIndex = 1,
                    explanation = "La ley prohíbe taxativamente destinar recursos del canon al gasto corriente o al pago de sueldos de la burocracia edil."
                ),
                Challenge(
                    id = "civ_t09_s02_c04",
                    question = "El Fondo de Compensación Municipal (FONCOMUN) se financia primordialmente a través de la recaudación del:",
                    options = listOf(
                        "Impuesto a las Transacciones Financieras (ITF)",
                        "Impuesto Selectivo al Consumo sobre combustibles",
                        "Impuesto de Promoción Municipal (IPM) aplicado a las ventas gravadas con IGV",
                        "Impuesto a la Renta de quinta categoría",
                    ),
                    correctIndex = 2,
                    explanation = "El FONCOMUN se financia con el rendimiento de dos puntos del Impuesto de Promoción Municipal (IPM) incorporado en el IGV."
                ),
                Challenge(
                    id = "civ_t09_s02_c05",
                    question = "El tributo municipal de periodicidad anual que grava el valor de los terrenos y las edificaciones urbanas y rústicas se denomina:",
                    options = listOf(
                        "Impuesto Predial",
                        "Impuesto de Alcabala",
                        "Impuesto al Patrimonio Vehicular",
                        "Contribución especial de mejoras",
                    ),
                    correctIndex = 0,
                    explanation = "El Impuesto Predial es un tributo municipal que grava el valor de los predios (terrenos y construcciones) de las personas."
                ),
                Challenge(
                    id = "civ_t09_s02_c06",
                    question = "Los pagos que los vecinos realizan a su municipalidad por la contraprestación efectiva del servicio de limpieza pública, parques y serenazgo son:",
                    options = listOf(
                        "Impuestos patrimoniales",
                        "Aranceles de aduana",
                        "Donaciones forzosas",
                        "Arbitrios municipales",
                    ),
                    correctIndex = 3,
                    explanation = "Los arbitrios son tasas municipales abonadas por el mantenimiento y prestación efectiva de un servicio público local individualizado."
                ),
                Challenge(
                    id = "civ_t09_s02_c07",
                    question = "El proceso mediante el cual los vecinos organizados y las autoridades debaten democráticamente qué obras públicas financiar con el presupuesto comunal es el:",
                    options = listOf(
                        "Cabildo Abierto de destitución",
                        "Plenario Fiscal de Inversión",
                        "Presupuesto Participativo",
                        "Referéndum municipal sancionatorio",
                    ),
                    correctIndex = 2,
                    explanation = "El Presupuesto Participativo es el mecanismo democrático donde sociedad civil y municipios conciertan proyectos de inversión prioritaria."
                ),
                Challenge(
                    id = "civ_t09_s02_c08",
                    question = "El cuerpo encargado de aplicar y reglamentar las ordenanzas municipales a través de Decretos de Alcaldía es:",
                    options = listOf(
                        "El Concejo Municipal",
                        "La Alcaldía",
                        "El Juez de Paz Letrado",
                        "El Comité de Defensa Civil",
                    ),
                    correctIndex = 1,
                    explanation = "La Alcaldía es el órgano ejecutivo del gobierno local y expide Decretos de Alcaldía para reglamentar ordenanzas."
                ),
                Challenge(
                    id = "civ_t09_s02_c09",
                    question = "El tributo que grava las transferencias de propiedad de bienes inmuebles (compraventa de departamentos, casas o terrenos) a título oneroso o gratuito es el:",
                    options = listOf(
                        "Arbitrio de Serenazgo",
                        "Impuesto de Alcabala",
                        "Impuesto Predial",
                        "Impuesto a las Apuestas",
                    ),
                    correctIndex = 1,
                    explanation = "El Impuesto de Alcabala grava las transferencias de inmuebles urbanos o rústicos a favor de la municipalidad provincial."
                ),
                Challenge(
                    id = "civ_t09_s02_c10",
                    question = "¿Cuál es el órgano consultivo y de concertación vecinal creado en cada municipalidad provincial y distrital conforme a la Ley N.° 27972?",
                    options = listOf(
                        "El Concejo Municipal Ordinario",
                        "El Consejo de Coordinación Local (CCL)",
                        "La Gerencia de Fiscalización Tributaria",
                        "La Sala de Conciliación Comunal",
                    ),
                    correctIndex = 1,
                    explanation = "El Consejo de Coordinación Local (CCL) es el órgano consultivo donde conciertan el alcalde, regidores y la sociedad civil."
                ),
            )
        )
    )
}
