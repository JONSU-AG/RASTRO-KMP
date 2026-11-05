# Propuestas de Tablas Candidatas para Aprender (Versión Exposición)

> **Documento de trabajo para revisión del propietario.**
> Ámbito: Exclusivamente lectura y relevamiento de listas y comparaciones en los archivos `theory.md` de Química, Biología y Geografía (`shared/src/commonMain/composeResources/files/aprender/`).
> **Aviso de alcance:** Este documento NO valida académicamente ninguna de las materias ni modifica archivos fuente, preguntas, claves ni código del proyecto.

---

## Metodología y Criterios de Selección

Conforme a las directrices de `MAPA_PROYECTO_KMP.md`, `docs/formulas/README.md`, `docs/aprender/AUDITORIA_MUESTRA_2026-11-01.md` y la especificación del componente `AcademicTable.kt`:
1. **Fidelidad estricta y sin invención:** Los datos de las propuestas provienen al 100% del texto existente en los archivos `theory.md`. No se han agregado hechos externos ni completado vacíos con fuentes ajenas.
2. **Estructura rectangular pura:** Cada tabla propuesta cumple los requisitos del analizador de `AcademicTable`: al menos dos columnas de encabezado, delimitación con tuberías (`|`), fila separadora con guiones (`:?-{3,}:?`) y paridad exacta en el número de celdas por fila.
3. **Criterio de exclusión por falta de contexto:** Si un fragmento presentaba atributos dispares, datos truncados o asimetría insalvable sin recurrir a fuentes externas, se descartó como tabla y se registró en la sección de observaciones.
4. **Límite acotado:** Dos propuestas por materia (6 en total: 2 Química, 2 Biología, 2 Geografía).

---

## 1. Química

### Propuesta Q1: Subniveles del Número Cuántico Secundario ($l$)
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/quimica/semana04/4.1/theory.md`
* **Encabezado de sección:** `### 3.1. Números Cuánticos y Orbitales Atómicos` (dentro de `2. **Número Cuántico Secundario o Azimutal (l):**`)

#### Texto original completo del fragmento:
```markdown
     * l = 0 (s - Sharp): Esférico. Contiene 1 orbital (2e^- máx).
     * l = 1 (p - Principal): Dilobular o bilobular. Contiene 3 orbitales: p_x, p_y, p_z (6e^- máx).
     * l = 2 (d - Diffuse): Tetralobular (salvo d_{z^2} que es bilobular con toroide anular). Contiene 5 orbitales (10e^- máx).
     * l = 3 (f - Fundamental): Octalobular / compleja. Contiene 7 orbitales (14e^- máx).
```

#### Propuesta de tabla Markdown (mismos datos):
| Valor de $l$ | Subnivel (Notación y Denominación) | Forma geométrica del orbital | Número de orbitales | Capacidad máxima de electrones |
| :---: | :--- | :--- | :--- | :---: |
| $l = 0$ | s - Sharp | Esférico | 1 orbital | $2e^-$ máx |
| $l = 1$ | p - Principal | Dilobular o bilobular | 3 orbitales: $p_x, p_y, p_z$ | $6e^-$ máx |
| $l = 2$ | d - Diffuse | Tetralobular (salvo $d_{z^2}$ que es bilobular con toroide anular) | 5 orbitales | $10e^-$ máx |
| $l = 3$ | f - Fundamental | Octalobular / compleja | 7 orbitales | $14e^-$ máx |

---

### Propuesta Q2: Clasificación de Fenómenos o Cambios de la Materia
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/quimica/semana01/1.2/theory.md`
* **Encabezado de sección:** `### 3.4. Fenómenos o Cambios de la Materia`

#### Texto original completo del fragmento:
```markdown
1. **Fenómeno Físico:** Modificación que no altera la estructura molecular ni la identidad química de la sustancia. Son generalmente reversibles y con bajo intercambio energético.
   * Cambios de estado físico (ebullición, fusión, condensación), disolución de azúcar en agua, dilatación térmica, fragmentación mecánica.
2. **Fenómeno Químico (Reacción Química):** Transformación irreversible o en equilibrio que altera la composición íntima y enlaces químicos, originando nuevas sustancias con propiedades distintas.
   * Combustión, corrosión/oxidación de metales, digestión de alimentos, fotosíntesis, fermentación, saponificación.
3. **Fenómeno Nuclear:** Alteración de los núcleos atómicos con transmutación de elementos y enorme desprendimiento de energía según E = \Delta m \cdot c^2.
   * Fisión nuclear (ruptura de núcleos pesados: U-235) y Fusión nuclear (unión de núcleos livianos: ^2H + ^3H \to ^4He + n).
```

#### Propuesta de tabla Markdown (mismos datos):
| Tipo de Fenómeno | Modificación y Características Energéticas / Reversibilidad | Ejemplos en el Texto Original |
| :--- | :--- | :--- |
| **Fenómeno Físico** | Modificación que no altera la estructura molecular ni la identidad química de la sustancia. Son generalmente reversibles y con bajo intercambio energético. | Cambios de estado físico (ebullición, fusión, condensación), disolución de azúcar en agua, dilatación térmica, fragmentación mecánica. |
| **Fenómeno Químico (Reacción Química)** | Transformación irreversible o en equilibrio que altera la composición íntima y enlaces químicos, originando nuevas sustancias con propiedades distintas. | Combustión, corrosión/oxidación de metales, digestión de alimentos, fotosíntesis, fermentación, saponificación. |
| **Fenómeno Nuclear** | Alteración de los núcleos atómicos con transmutación de elementos y enorme desprendimiento de energía según $E = \Delta m \cdot c^2$. | Fisión nuclear (ruptura de núcleos pesados: U-235) y Fusión nuclear (unión de núcleos livianos: $^2\text{H} + {}^3\text{H} \to {}^4\text{He} + n$). |

---

## 2. Biología

### Propuesta B1: Células de las Glándulas Gástricas y sus Secreciones
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/biologia/semana08/8.1/theory.md`
* **Encabezado de sección:** `# 8.1.2 — Estómago: el laboratorio ácido`

#### Texto original completo del fragmento:
```markdown
- **Células parietales u oxínticas:** secretan **ácido clorhídrico (HCl)** mediante la bomba de protones H y K ATPasa y secretan el **factor intrínseco de Castle**. El HCl tiene tres funciones: activa el pepsinógeno a pepsina, desnaturaliza proteínas desplegando sus cadenas para exponer enlaces, y esteriliza el quimo matando la mayoría de patógenos. El factor intrínseco es una glicoproteína que viajará con la vitamina B12 hasta el íleon para permitir su absorción.
- **Células principales o cimógenas:** secretan **pepsinógeno**, proenzima inactiva, y lipasa gástrica que inicia algo de digestión de grasas emulsionadas de la leche.
- **Células mucosas del cuello:** producen mucina y bicarbonato que forman la **barrera citoprotectora** de moco alcalino sobre la pared.
- **Células G endocrinas del antro:** secretan **gastrina** a la sangre cuando detectan distensión del estómago y presencia de péptidos. La gastrina ordena a las parietales secretar más HCl.
```

#### Propuesta de tabla Markdown (mismos datos):
| Tipo Celular Gástrico | Secreción / Sustancias Producidas | Mecanismo y Función Reportada |
| :--- | :--- | :--- |
| **Células parietales u oxínticas** | Ácido clorhídrico (HCl) [mediante bomba de protones H y K ATPasa] y factor intrínseco de Castle | El HCl activa el pepsinógeno a pepsina, desnaturaliza proteínas y esteriliza el quimo matando patógenos. El factor intrínseco (glicoproteína) viaja con la vitamina B12 hasta el íleon para permitir su absorción. |
| **Células principales o cimógenas** | Pepsinógeno (proenzima inactiva) y lipasa gástrica | Inicia digestión de proteínas tras activación y digestión de grasas emulsionadas de la leche. |
| **Células mucosas del cuello** | Mucina y bicarbonato | Forman la barrera citoprotectora de moco alcalino sobre la pared gástrica. |
| **Células G endocrinas del antro** | Gastrina (secretada a la sangre) | Se libera al detectar distensión del estómago y presencia de péptidos; ordena a las parietales secretar más HCl. |

---

### Propuesta B2: Relaciones Biológicas Interespecíficas y sus Signos Ecológicos
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/biologia/semana13/13.3/theory.md`
* **Encabezado de sección:** `## CONCEPTOS IMPORTANTES`

#### Texto original completo del fragmento:
```markdown
- Signos ecológicos con más como beneficio, menos como perjuicio y cero como neutro.
- Mutualismo más más obligado y permanente con líquenes y micorrizas como modelos.
- Protocooperación más más facultativa y separable con pez payaso y aves limpiadoras.
- Comensalismo más cero con rémora y orquídeas epífitas, más inquilinismo como vivienda sin daño.
- Parasitismo más menos crónico sin muerte inmediata con tenia y ectoparásitos.
- Depredación más menos letal e inmediata con puma y lechuza.
- Competencia menos menos con exclusión de Gause por recurso limitante.
- Amensalismo menos cero con Penicillium y alelopatía del eucalipto.
```

#### Propuesta de tabla Markdown (mismos datos):
| Relación Interespecífica | Signos Ecológicos (+ beneficio / - perjuicio / 0 neutro) | Grado y Característica de la Interacción | Modelos y Ejemplos en el Texto |
| :--- | :---: | :--- | :--- |
| **Mutualismo** | más más ($+/+$) | Obligado y permanente | Líquenes y micorrizas |
| **Protocooperación** | más más ($+/+$) | Facultativa y separable | Pez payaso y aves limpiadoras |
| **Comensalismo** | más cero ($+/0$) | Beneficio de una especie y efecto neutro en otra (incluye inquilinismo como vivienda sin daño) | Rémora y orquídeas epífitas |
| **Parasitismo** | más menos ($+/-$) | Crónico sin muerte inmediata | Tenia y ectoparásitos |
| **Depredación** | más menos ($+/-$) | Letal e inmediata | Puma y lechuza |
| **Competencia** | menos menos ($-/-$) | Disputa entre ambas especies con exclusión de Gause | Recurso limitante |
| **Amensalismo** | menos cero ($-/0$) | Inhibición sin beneficio directo | Penicillium y alelopatía del eucalipto |

---

## 3. Geografía

### Propuesta G1: Principios Geográficos Metodológicos
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/geografia/semana01/1.1/theory.md`
* **Encabezado de sección:** `### 3.4. Principios Geográficos Metodológicos`

#### Texto original completo del fragmento:
```markdown
1. **Principio de Localización (Extensión / Ubicación):**
   * **Autor:** **Federico Ratzel**.
   * **Fundamento:** Todo fenómeno o hecho geográfico debe ser ubicado con precisión en el espacio mediante coordenadas geográficas (latitud, longitud, altitud), límites, extensión territorial y accesibilidad.
   * *Consigna:* Es el principio **fundamental y cardinal** de la geografía; ningún fenómeno puede ser estudiado científicamente si no se sabe con certeza matemática dónde ocurre.
2. **Principio de Descripción:**
   * **Autor:** **Paul Vidal de la Blache**.
   * **Fundamento:** Consiste en señalar las características, rasgos morfológicos, composición, extensión, volumen y particularidades esenciales del fenómeno geográfico para individualizarlo.
3. **Principio de Causalidad (Explicación):**
   * **Autor:** **Alexander von Humboldt**.
   * **Fundamento:** Investiga el origen, las causas primarias y secundarias, los mecanismos de génesis y las consecuencias directas de un fenómeno geográfico. Otorga rango de ciencia formal a la geografía, trascendiendo la mera crónica.
4. **Principio de Conexión (Relación o Coordinación):**
   * **Autor:** **Jean Brunhes**.
   * **Fundamento:** Los hechos y fenómenos geográficos nunca ocurren de forma aislada; están íntimamente interconectados y subordinados entre sí. La variación de un factor geográfico altera la cadena ecosistémica y territorial contigua.
5. **Principio de Actividad (Evolución o Transformación):**
   * **Autor:** **Jean Brunhes**.
   * **Fundamento:** Las entidades geográficas están en perpetuo cambio, dinamismo y modificación; nada es estático. El paisaje cambia por fuerzas endógenas, exógenas y por el trabajo antrópico.
6. **Principio de Comparación (Analogía o Generalización):**
   * **Autores:** **Karl Ritter** y **Paul Vidal de la Blache**.
   * **Fundamento:** Permite cotejar dos o más fenómenos o hechos geográficos que ocurren en distintas partes del planeta para encontrar similitudes, diferencias y leyes generales (e.g., comparar el desierto de Atacama con el desierto de Namibia).
```

#### Propuesta de tabla Markdown (mismos datos):
| Principio Geográfico | Autor(es) | Fundamento y Alcance Metodológico |
| :--- | :--- | :--- |
| **Localización** (Extensión / Ubicación) | **Federico Ratzel** | Ubicar con precisión matemática en el espacio mediante coordenadas (latitud, longitud, altitud), límites, extensión y accesibilidad. Es el principio fundamental y cardinal. |
| **Descripción** | **Paul Vidal de la Blache** | Señalar características, rasgos morfológicos, composición, extensión, volumen y particularidades esenciales para individualizar el fenómeno. |
| **Causalidad** (Explicación) | **Alexander von Humboldt** | Investigar origen, causas primarias/secundarias, mecanismos de génesis y consecuencias directas. Otorga rango de ciencia formal a la geografía. |
| **Conexión** (Relación o Coordinación) | **Jean Brunhes** | Los hechos y fenómenos nunca ocurren aislados; están íntimamente interconectados y subordinados. Variar un factor altera la cadena ecosistémica y territorial contigua. |
| **Actividad** (Evolución o Transformación) | **Jean Brunhes** | Las entidades geográficas están en perpetuo cambio, dinamismo y modificación (nada es estático), por fuerzas endógenas, exógenas y trabajo antrópico. |
| **Comparación** (Analogía o Generalización) | **Karl Ritter** y **Paul Vidal de la Blache** | Cotejar dos o más fenómenos en distintas partes del planeta para encontrar similitudes, diferencias y leyes generales (ej. desierto de Atacama vs. Namibia). |

---

### Propuesta G2: Posiciones Geográficas Especiales (Relaciones de Coordenadas)
* **Ruta exacta:** `shared/src/commonMain/composeResources/files/aprender/geografia/semana02/2.1/theory.md`
* **Encabezado de sección:** `#### Posiciones Geográficas Especiales:` (dentro de `### 3.2. Líneas, Círculos y Semicírculos Imaginarios`)

#### Texto original completo del fragmento:
```markdown
1. **Antecos:** Dos puntos que se encuentran en el **mismo meridiano** (igual longitud), pero en **hemisferios opuestos a la misma distancia del ecuador** (misma latitud pero de signo contrario).
   * Comparten la misma hora solar, pero tienen estaciones contrarias.
2. **Periecos:** Dos puntos que se encuentran en el **mismo paralelo** (igual latitud y hemisferio), pero en **meridianos diametralmente opuestos** (diferencia de 180^\circ de longitud).
   * Tienen la misma estación climática y duración del día, pero horas opuestas (diferencia de 12 horas solares).
3. **Antípodas:** Dos puntos situados en los extremos de un diámetro que pasa por el centro geocéntrico terrestre (puntos diametralmente opuestos).
   * Tienen latitudes numéricas idénticas pero hemisferios opuestos (+\varphi y -\varphi) y longitudes suplementarias respecto a 180^\circ (\lambda_1 + \lambda_2 = 180^\circ en hemisferios contrarios).
   * Tienen estaciones contrarias y horas totalmente opuestas (diferencia de 12 horas).
```

#### Propuesta de tabla Markdown (mismos datos):
| Posición Geográfica Especial | Condición de Coordenadas (Latitud y Longitud) | Relación de Hora Solar | Régimen Estacional y de Día |
| :--- | :--- | :--- | :--- |
| **Antecos** | Mismo meridiano (igual longitud), en hemisferios opuestos a la misma distancia del ecuador (misma latitud con signo contrario). | Comparten la misma hora solar | Tienen estaciones contrarias |
| **Periecos** | Mismo paralelo (igual latitud y hemisferio), en meridianos diametralmente opuestos (diferencia de $180^\circ$ de longitud). | Horas opuestas (diferencia de 12 horas solares) | Misma estación climática y duración del día |
| **Antípodas** | Puntos en extremos de un diámetro que pasa por el centro geocéntrico: latitudes numéricas idénticas en hemisferios opuestos ($+\varphi$ y $-\varphi$) y longitudes suplementarias ($180^\circ$ en hemisferios contrarios). | Horas totalmente opuestas (diferencia de 12 horas) | Estaciones contrarias |

---

## 4. Observaciones de Fragmentos Descartados por Falta de Contexto o Truncamiento

En cumplimiento de la instrucción (*"No añadas hechos, no completes vacíos y no uses fuentes distintas para inventar celdas. Si falta contexto, anótalo y no hagas la tabla"*), se documentan los siguientes casos identificados durante la revisión donde NO se generó tabla:

1. **Química (`quimica/semana06/6.1/theory.md`, línea 89 en adelante):**
   * *Sección:* `### 3.4. Sistemas de Nomenclatura Química` -> `1. **Nomenclatura Tradicional o Clásica:**`.
   * *Situación:* La lista describe prefijos y sufijos para 1 E.O. (`-ico`), 2 E.O. (`-oso` / `-ico`), 3 E.O. (`hipo-...-oso` / `-oso` / `-ico`), pero en 4 E.O. el archivo se trunca abruptamente en la línea 96 (`- Mínimo (+1): **hipo- ... -oso**`) sin listar el resto de estados ni cerrar la enumeración antes de pasar a la sección 3.
   * *Decisión:* **Descartado para tabla.** No se inventaron las filas restantes de 4 E.O.
2. **Química (`quimica/semana04/4.1/theory.md` y `quimica/semana04/4.2/theory.md`):**
   * *Sección:* `### 4. RESUMEN DE VARIACIÓN PERIÓDICA`.
   * *Situación:* El archivo `4.1/theory.md` (líneas 91-96) abre un `\begin{array}{|c|c|c|}` que se interrumpe a mitad de tabla y continúa sin encabezado en `4.2/theory.md` (líneas 50-55) donde finalmente se cierra con `\end{array}`.
   * *Decisión:* **Descartado para tabla Markdown estándar.** Truncamiento y partición física entre archivos requieren saneamiento editorial previo por parte del propietario.
3. **Química (`quimica/semana04/4.2/theory.md`, líneas 17-25):**
   * *Sección:* `### 3.4. Tabla Periódica Moderna y Clasificación` -> `* **Elementos Representativos (Grupo A / Bloques s y p):**`.
   * *Situación:* La lista menciona grupos IA y IIA con configuración y valencia (`ns^1 (valencia +1)`, `ns^2 (valencia +2)`), pero a partir del grupo IIIA únicamente lista la configuración terminal (`ns^2 np^1` a `ns^2 np^6`), omitiendo la valencia en los 6 grupos restantes.
   * *Decisión:* **Descartado para tabla.** Convertir a tabla de 3 columnas habría requerido inventar celdas de valencia o dejarlas asimétricas.

