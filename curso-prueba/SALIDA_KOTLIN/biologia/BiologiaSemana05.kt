package biologia

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object BiologiaSemana05 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "bio_t05_s01",
            title = "Metabolismo Celular: Fotosíntesis y Respiración Celular - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Metabolismo Celular: Fotosíntesis y Respiración Celular - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Bioenergética Celular y Fisiología Metabólica
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.154748700 pts/pregunta (Examen: 5 preguntas)
  * *Área 2 (Biomédicas):* 1.945140000 pts/pregunta (Examen: 9 preguntas) — **MÁXIMA PRIORIDAD DEL EXAMEN**
  * *Área 3 (Sociales):* 1.148603363 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Muy Alto (Complejos fotosintéticos I y II, Ciclo de Calvin, Glucólisis, Ciclo de Krebs, Cadena de transporte de electrones, Quimiósmosis y Balance neto de ATP)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10 (Pregunta obligada en todo examen de admisión)

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         BIOENERGÉTICA Y METABOLISMO CELULAR
                                          │
         ┌────────────────────────────────┴────────────────────────────────┐
         ▼                                                                 ▼
FOTOSÍNTESIS (ANABOLISMO AUTÓTROFO)                               RESPIRACIÓN CELULAR (CATABOLISMO)
6CO_2 + 6H_2O + \text{Luz} \to C_6H_{12}O_6 + 6O_2              C_6H_{12}O_6 + 6O_2 \to 6CO_2 + 6H_2O + 36-38\text{ ATP}
         │                                                                 │
 ┌───────┴───────┐                                                 ┌───────┴───────┐
 ▼               ▼                                                 ▼               ▼
FASE LUMINOSA   FASE OSCURA                                    RESPIRACIÓN     RESPIRACIÓN
(Tilacoide)     (Estroma / Calvin)                             ANAEROBIA       AEROBIA
• Fotoexcitación • Fijación de CO_2 (RuBisCO)                • Glucólisis    • Glucólisis (Citosol)
  (Clorofila)   • Reducción de PGA a PGAL                        (2 ATP netos) • Acetilación
• Fotólisis     • Síntesis de Glucosa                          • Fermentación: • Ciclo de Krebs
  de H_2O     • Regeneración de RuBP                           - Láctica     • Fosforilación Oxidativa
  (Complejo Mn)   (Gasto de ATP y NADPH)                         - Alcohólica    (Cadena respiratoria y
• Fotofosforilación (ATP)                                                        complejo ATP sintasa)
• Fotorreducción (NADP^+ \to NADPH)                                            • Lanzaderas (Glicerol vs Malato)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Generalidades de la Bioenergética y el ATP
La moneda energética universal de los seres vivos es el **Adenosín Trifosfato (ATP)**, constituido por la base nitrogenada adenina, la pentosa ribosa y tres grupos fosfato unidos por dos **enlaces macroérgicos anhídrido fosfórico** (\sim P) de alta energía libre de hidrólisis (\Delta G^{\circ\prime} \approx -7.3\text{ kcal/mol} = -30.5\text{ kJ/mol}):
\text{ATP} + H_2O \rightleftharpoons \text{ADP} + P_i + 7.3\text{ kcal/mol}

---

### 3.2. La Fotosíntesis Oxigénica
Proceso anabólico endergónico fundamental que transforma la energía lumínica solar en energía química estable almacenada en los enlaces covalentes de la glucosa y otros compuestos orgánicos, utilizando H_2O como donador de electrones y liberando O_2 a la atmósfera:
6CO_2 + 6H_2O \xrightarrow[\text{Clorofila}]{\text{Luz solar}} C_6H_{12}O_6 + 6O_2

#### A. Estructura del Cloroplasto
* **Membrana Tilacoidal:** Bicapa lipídica que encierra el espacio intratilacoidal (lumen). En ella se hallan insertados los **Fotosistemas (I y II)**, la cadena transportadora de electrones fotosintética y el complejo **ATP sintasa** (CF_0-CF_1). Aquí ocurre la **Fase Luminosa**.
* **Estroma:** Matriz coloidal fluida equivalente al citoplasma mitocondrial. Contiene ribosomas 70S, ADN circular cloroplástico y todas las enzimas del **Ciclo de Calvin-Benson** (fase oscura), principalmente la enzima **RuBisCO**.

#### B. Fase Luminosa, Fotoquímica o Reacción de Hill (En los Tilacoides)
Requiere luz solar directa. Ocurre en cuatro etapas moleculares coordinadas:
1. **Fotoexcitación de las Clorofilas:**
   * La luz es captada por los complejos antena de los fotosistemas formados por pigmentos (clorofila a, clorofila b y carotenoides).
   * **Fotosistema II (PS\text{-}II o P_{680}):** Absorbe a \lambda = 680\text{ nm}. Sus electrones son excitados a un nivel cuántico superior y captados por la feofitina, pasando a la cadena transportadora: Plastoquinona (PQ) \to Complejo Citocromo b_6f \to Plastocianina (PC).
   * **Fotosistema I (PS\text{-}I o P_{700}):** Absorbe a \lambda = 700\text{ nm}. Cede electrones de alta energía a la ferredoxina (Fd). Sus electrones perdidos son repuestos por la plastocianina procedente del PS\text{-}II.
2. **Fotólisis del Agua (Reacción de Hill):**
   * Ocurre en el lado luminal del PS\text{-}II catalizada por el **Complejo Evolucionador de Oxígeno (que contiene un cúmulo de 4 átomos de Manganeso, Mn_4CaO_5 y cofactor Cl^-)**:
     2H_2O \xrightarrow[\text{Complejo } Mn]{\text{Luz}} O_{2(g)}\uparrow + 4H^+ + 4e^-
   * *Destino de los productos:*
     - Los **electrones (e^-)** reponen los electrones perdidos por el centro de reacción P_{680}.
     - El **oxígeno gaseoso (O_2)** se desprende a la atmósfera como subproducto. *(¡Cuidado en examen!: Todo el oxígeno que respiramos procede de la rotura del agua, jamás del dióxido de carbono)*.
     - Los **protones (H^+)** se acumulan en el lumen tilacoidal contribuyendo al gradiente electroquímico.
3. **Fotofosforilación (Síntesis de ATP por Quimiósmosis de Peter Mitchell):**
   * Durante el transporte de electrones, el complejo citocromo b_6f bombea protones desde el estroma hacia el lumen tilacoidal contra gradiente.
   * Esto genera una enorme fuerza protón-motriz (\Delta pH).
   * Los protones regresan a favor de gradiente hacia el estroma cruzando exclusivamente por el canal de la **ATP sintasa** (CF_0-CF_1), rotando y fosforilando ADP en ATP:
     \text{ADP} + P_i \xrightarrow{\text{ATP sintasa}} \text{ATP}
4. **Fotorreducción del NADP^+:**
   * Los electrones transferidos desde el PS\text{-}I llegan a la enzima estromal **Ferredoxina-NADP^+ Reductasa (FNR)**:
     NADP^+ + 2H^+ + 2e^- \xrightarrow{FNR} NADPH + H^+

* **Fotofosforilación Cíclica:** Cuando la célula tiene déficit de ATP, los electrones de la ferredoxina regresan al citocromo b_6f en lugar de reducir al NADP^+, generando exclusivamente **ATP sin producción de NADPH ni desprendimiento de O_2**.

#### C. Fase Oscura, Biosintética o Ciclo de Calvin-Benson (En el Estroma)
No depende directamente de la luz, pero utiliza los productos asimiladores generados en la fase luminosa (**ATP y NADPH**):
1. **Fijación del Carbono (Carboxilación):**
   * La molécula aceptora de 5 carbonos, la **Ribulosa-1,5-bisfosfato (RuBP)**, se combina con una molécula de dióxido de carbono (CO_2) gaseoso catalizada por la enzima más abundante del planeta: **RuBisCO (Ribulosa bisfosfato carboxilasa/oxigenasa)**.
   * Se forma un intermediario inestable de 6 carbonos que se rompe de inmediato en 2 moléculas de 3 carbonos: el **3-Fosfoglicerato (PGA)**.
2. **Reducción del PGA:**
   * Las moléculas de PGA son fosforiladas por el ATP y luego reducidas por el NADPH formando **Gliceraldehído-3-fosfato (PGAL o G3P)**.
3. **Síntesis de Biomoléculas:**
   * Por cada 6 vueltas del ciclo de Calvin (fijación de 6CO_2), se forman 12\text{ PGAL}:
   * **2\text{ moléculas de PGAL}** salen del ciclo hacia el citosol para condensarse y sintetizar **1\text{ molécula de Glucosa}** (C_6H_{12}O_6), fructosa, almidón y aminoácidos.
4. **Regeneración de la Ribulosa-1,5-bisfosfato (RuBP):**
   * Las **10\text{ moléculas de PGAL}** restantes (10 \times 3C = 30C) se reorganizan mediante una serie de reacciones enzimáticas complejas consumiendo ATP para regenerar **6\text{ moléculas de RuBP}** (6 \times 5C = 30C), reiniciando el ciclo.
* **Gasto Energético Neto para formar 1 Molécula de Glucosa (6CO_2):**
  \mathbf{18 \ ATP} + \mathbf{12 \ NADPH}

---

### 3.3. La Respiración Celular
Proceso catabólico exergónico mediante el cual las células degradan enzimáticamente moléculas orgánicas (principalmente glucosa) para extraer energía libre y sintetizar ATP.

```
                             GLUCOSA (6C)
                                  │
                                  ▼ [GLUCÓLISIS en Citosol] (Produce: 2 ATP netos + 2 NADH)
                            2 PIRUVATO (3C)
                                  │
         ┌────────────────────────┴────────────────────────┐
         ▼ [En ausencia de O2]                             ▼ [En presencia de O2]
RESPIRACIÓN ANAEROBIA / FERMENTACIÓN              RESPIRACIÓN AEROBIA (Mitocondria)
• Láctica: Piruvato -> Lactato                     • Matriz Mitocondrial:
  (Músculo, bacterias lácticas)                      - Descarboxilación oxidativa (Acetilación)
• Alcohólica: Piruvato -> Etanol + CO2               - Ciclo de Krebs (Ácido Cítrico)
  (Levaduras, cerveza, pan)                        • Cresta Mitocondrial:
  (Rendimiento: 2 ATP netos)                         - Cadena de Transporte de e-
                                                     - Fosforilación Oxidativa (Quimiósmosis)
                                                     (Rendimiento: 36 o 38 ATP)
```

#### A. Glucólisis o Vía de Embden-Meyerhof-Parnas (En el Citosol / Citoplasma)
Vía anaerobia universal común a todos los seres vivos:
* Una molécula de glucosa (6C) se escinde en **dos moléculas de piruvato (3C)**.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: \"El oxígeno liberado en la fotosíntesis proviene del CO_2\". ERROR HISTÓRICO FATAL. Cornelius van Niel y los experimentos de Rubén y Kamen con agua marcada isotópicament\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t05_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Creer que la fermentación produce ATP en su segunda etapa. FALSO. Los únicos 2 ATP netos de la fermentación se producen en la glucólisis. La conversión de piruvato a lact\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 1,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t05_s01_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s01_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        ),
        LessonNode(
            id = "bio_t05_s02",
            title = "Metabolismo Celular: Fotosíntesis y Respiración Celular - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Metabolismo Celular: Fotosíntesis y Respiración Celular - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
* *Fase de Inversión:* Se consumen 2\text{ ATP}.
* *Fase de Rendimiento:* Se generan 4\text{ ATP} (por fosforilación a nivel de sustrato) y 2\text{ NADH} + 2H^+.
* **Balance Neto de la Glucólisis:**
  \mathbf{2 \ Piruvato} + \mathbf{2 \ ATP (netos)} + \mathbf{2 \ NADH} + \mathbf{2 \ H_2O}

#### B. Vía Anaerobia: Fermentación (Sin Oxígeno)
Ocurre en el citosol para regenerar el NAD^+ necesario para que la glucólisis no se detenga. No produce ATP adicional:
1. **Fermentación Láctica:** El piruvato se reduce directamente a **Lactato (Ácido Láctico)** por la enzima lactato deshidrogenasa, oxidando el NADH a NAD^+:
   \text{Piruvato} + \text{NADH} + H^+ \to \text{Lactato} + NAD^+
   * Ocurre en bacterias lácticas (*Lactobacillus*, yogur, quesos) y en el músculo esquelético humano bajo ejercicio anaeróbico intenso (causante temporal de fatiga).
2. **Fermentación Alcohólica:** El piruvato se descarboxila liberando CO_2 formando acetaldehído, el cual se reduce a **Etanol** por la enzima alcohol deshidrogenasa:
   \text{Piruvato} \to \text{Acetaldehído} + CO_2\uparrow \xrightarrow{NADH} \text{Etanol} + NAD^+
   * Ocurre en levaduras (*Saccharomyces cerevisiae*) para la elaboración de pan, vino y cerveza.

#### C. Respiración Aerobia (En Presencia de O_2)

##### 1. Descarboxilación Oxidativa del Piruvato (Acetilación, en la Matriz Mitocondrial)
Cada piruvato (3C) entra a la mitocondria a través de transportadores específicos y es oxidado por el complejo multienzimático **Piruvato Deshidrogenasa**:
\text{Piruvato} (3C) + CoA-SH + NAD^+ \to \textbf{Acetil-CoA} (2C) + CO_2\uparrow + \text{NADH} + H^+
* Por cada glucosa (2\text{ piruvatos}): se generan **2\text{ Acetil-CoA} + 2\text{ CO}_2 + 2\text{ NADH}**.

##### 2. Ciclo de Krebs o Ciclo del Ácido Cítrico (En la Matriz Mitocondrial)
Vía cíclica anfibólica central de degradación oxidativa:
1. El **Acetil-CoA (2C)** se condensa con el **Oxalacetato (4C)** mediante la enzima *Citrato sintasa* para formar **Citrato (6C)**.
2. Isomerización a Isocitrato (6C).
3. Primera descarboxilación oxidativa: el Isocitrato se oxida a **\alpha-Cetoglutarato (5C)**, liberando el primer CO_2 y reduciendo 1\text{ NAD}^+ \to \text{NADH}.
4. Segunda descarboxilación oxidativa: el \alpha-Cetoglutarato se oxida a **Succinil-CoA (4C)**, liberando el segundo CO_2 y generando otro \text{NADH}.
5. Fosforilación a nivel de sustrato: Succinil-CoA se convierte en **Succinato (4C)**, generando un **GTP (equivalente a 1 ATP)**.
6. Oxidación del Succinato a **Fumarato (4C)** por la *Succinato deshidrogenasa* (complejo II), reduciendo un **FAD \to FADH_2**.
7. Hidratación del Fumarato a **Malato (4C)**.
8. Oxidación final del Malato a **Oxalacetato (4C)**, reduciendo un tercer **NAD^+ \to NADH**, regenerando el aceptor para una nueva vuelta.

* **Balance por CADA Vuelta del Ciclo de Krebs (1 Acetil-CoA):**
  3\text{ NADH} + 1\text{ FADH}_2 + 1\text{ GTP (ATP)} + 2\text{ CO}_2
* **Balance del Ciclo de Krebs por molécula de Glucosa (2\text{ vueltas}):**
  \mathbf{6 \ NADH} + \mathbf{2 \ FADH}_2 + \mathbf{2 \ ATP} + \mathbf{4 \ CO}_2

##### 3. Cadena de Transporte de Electrones y Fosforilación Oxidativa (En las Crestas Mitocondriales)
Los electrones de alta energía transportados por los cofactores reducidos (NADH y FADH_2) recorren una serie de cuatro complejos proteicos respiratorios incrustados en la membrana mitocondrial interna:
* **Complejo I (NADH deshidrogenasa):** Recibe electrones del NADH, los cede a la Coenzima Q (Ubiquinona) y **bombea 4H^+** al espacio intermembrana.
* **Complejo II (Succinato deshidrogenasa):** Recibe electrones del FADH_2 y los pasa a la Ubiquinona (**no bombea protones**).
* **Complejo III (Citocromo bc_1):** Transfiere electrones de la Ubiquinona reducida al Citocromo c y **bombea 4H^+**.
* **Complejo IV (Citocromo c oxidasa):** Transfiere los electrones a su **ACEPTOR FINAL DE ELECTRONES: EL OXÍGENO MOLECULAR (O_2)**, reduciéndolo a **Agua metabólica (H_2O)**, y **bombea 2H^+**:
  \frac{1}{2}O_2 + 2H^+ + 2e^- \to H_2O
* **Fuerza Protón-Motriz y ATP Sintasa (Complejo F_0-F_1):**
  El gradiente electroquímico de protones acumulado en el espacio intermembrana impulsa el flujo quimiosmótico a través del canal F_0, haciendo rotar la subunidad catalítica F_1 que sintetiza ATP a partir de ADP y P_i.
  * **Rendimiento Bioenergético P/O Clásico de Examen:**
    * Por cada 1\text{ NADH} oxidado en la cadena \implies se sintetizan **3\text{ ATP}** (ó 2.5\text{ ATP} moderno).
    * Por cada 1\text{ FADH}_2 oxidado \implies se sintetizan **2\text{ ATP}** (ó 1.5\text{ ATP} moderno).

##### 4. Sistemas de Lanzaderas de Electrones
Los 2\text{ NADH} formados durante la glucólisis en el citosol no pueden cruzar la membrana mitocondrial interna permeable; deben transferir sus electrones hacia la matriz mediante lanzaderas:
1. **Lanzadera del Malato-Aspartato:**
   * Transfiere los electrones al NAD^+ mitocondrial \implies rinde **3\text{ ATP} por cada NADH**.
   * Opera en tejidos de alta demanda: **corazón, hígado y riñones**.
   * Rendimiento total: **38\text{ ATP}**.
2. **Lanzadera del Glicerol-3-Fosfato:**
   * Transfiere los electrones al FAD de la membrana interna \implies rinde **2\text{ ATP} por cada NADH** citosólico.
   * Opera en: **músculo esquelético y cerebro**.
   * Rendimiento total: **36\text{ ATP}**.

---

### 4. BALANCE ENERGÉTICO TOTAL DE LA RESPIRACIÓN AEROBIA (POR GLUCOSA)
\begin{array}{|l|c|c|c|}
\hline
\textbf{Etapa Metabólica} & \textbf{Lugar Celular} & \textbf{Coenzimas Reducidas / ATP directo} & \textbf{ATP Generado Total} \\
\hline
\text{Glucólisis} & \text{Citosol} & 2\text{ ATP (directos)} & 2\text{ ATP} \\
\text{Glucólisis} & \text{Citosol} & 2\text{ NADH (vía lanzadera)} & 4\text{ o } 6\text{ ATP} \\
\text{Acetilación (Descarboxilación)} & \text{Matriz Mitocondrial} & 2\text{ NADH} \times 3 & 6\text{ ATP} \\
\text{Ciclo de Krebs} & \text{Matriz Mitocondrial} & 2\text{ GTP (ATP directos)} & 2\text{ ATP} \\
\text{Ciclo de Krebs} & \text{Matriz Mitocondrial} & 6\text{ NADH} \times 3 & 18\text{ ATP} \\
\text{Ciclo de Krebs} & \text{Matriz Mitocondrial} & 2\text{ FADH}_2 \times 2 & 4\text{ ATP} \\
\hline
\textbf{TOTAL NETO TEÓRICO} & & & \mathbf{36 \text{ a } 38 \ ATP} \\
\hline
\end{array}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Productos de la Fase Luminosa:**
  * **"EL SOL DA O-P-A"**:
    * **O**xígeno (O_2, se libera)
    * **P**oder reductor (NADPH)
    * **A**TP (energía química para el ciclo de Calvin).
* **Mnemotecnia Lanzaderas:**
  * **M**alato-Aspartato rinde **M**ás (38\text{ ATP}).
  * **G**licerol-Fosfato rinde **G**astado (36\text{ ATP}).
* **Mnemotecnia Aceptores Finales:**
  * En Fotosíntesis: El aceptor final de electrones es el **NADP^+**.
  * En Respiración Celular Aerobia: El aceptor final de electrones es el **O_2** (formando H_2O).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "El oxígeno liberado en la fotosíntesis proviene del CO_2".** ERROR HISTÓRICO FATAL. Cornelius van Niel y los experimentos de Rubén y Kamen con agua marcada isotópicamente (H_2^{18}O) demostraron categóricamente que el O_2 liberado proviene al 100\% de la **fotólisis del agua**.
* **Trampa 2: Creer que la fermentación produce ATP en su segunda etapa.** FALSO. Los únicos 2 ATP netos de la fermentación se producen en la **glucólisis**. La conversión de piruvato a lactato o etanol no produce ATP; su única función fisiológica es **reoxidar el NADH a NAD^+** para mantener activa la glucólisis.
* **Trampa 3: "La fase oscura de la fotosíntesis solo ocurre de noche".** FALSO. Se llama fase oscura porque no requiere luz directamente, pero ocurre predominantemente **durante el día**, ya que necesita el ATP y NADPH que la fase luminosa produce continuamente bajo el sol.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "bio_t05_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: \"La fase oscura de la fotosíntesis solo ocurre de noche\". FALSO. Se llama fase oscura porque no requiere luz directamente, pero ocurre predominantemente durante el día, y\", el procedimiento analítico riguroso exige:",
                    options = listOf(
                        "Identificar la restricción teórica formal y evitar asumir propiedades no universales.",
                        "Aplicar de forma mecánica la fórmula sin verificar el dominio de validez.",
                        "Suponer que las operaciones siempre conmutan sin considerar casos excepcionales.",
                        "Ignorar las condiciones de contorno e igualar variables arbitrariamente."
                    ),
                    correctIndex = 0,
                    explanation = "La zona de trampas de la teoría advierte este error típico y fundamenta la resolución correcta."
                ),
                Challenge(
                    id = "bio_t05_s02_c02",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c03",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c04",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c05",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c06",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c07",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 2,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c08",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección."
                    ),
                    correctIndex = 3,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c09",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Suposición que contradice las definiciones de la lección",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 0,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                ),
                Challenge(
                    id = "bio_t05_s02_c10",
                    question = "En relación con el marco conceptual desarrollado en esta lección, ¿cuál es la proposición analíticamente válida?",
                    options = listOf(
                        "Suposición que contradice las definiciones de la lección",
                        "Principio formal deducido a partir de las leyes y definiciones de la presente lección.",
                        "Fórmula con signos invertidos o exponentes incompatibles",
                        "Relación empírica sin sustento en el marco conceptual"
                    ),
                    correctIndex = 1,
                    explanation = "Se deduce directamente del desarrollo teórico formal y los axiomas de la lección."
                )
            )
        )
    )
}
