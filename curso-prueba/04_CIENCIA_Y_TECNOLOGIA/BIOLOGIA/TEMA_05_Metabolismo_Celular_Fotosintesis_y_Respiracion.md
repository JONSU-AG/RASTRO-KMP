# TEMA 05: Metabolismo Celular: Fotosíntesis y Respiración Celular

---

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
$6CO_2 + 6H_2O + \text{Luz} \to C_6H_{12}O_6 + 6O_2$              $C_6H_{12}O_6 + 6O_2 \to 6CO_2 + 6H_2O + 36-38\text{ ATP}$
         │                                                                 │
 ┌───────┴───────┐                                                 ┌───────┴───────┐
 ▼               ▼                                                 ▼               ▼
FASE LUMINOSA   FASE OSCURA                                    RESPIRACIÓN     RESPIRACIÓN
(Tilacoide)     (Estroma / Calvin)                             ANAEROBIA       AEROBIA
• Fotoexcitación • Fijación de $CO_2$ (RuBisCO)                • Glucólisis    • Glucólisis (Citosol)
  (Clorofila)   • Reducción de PGA a PGAL                        (2 ATP netos) • Acetilación
• Fotólisis     • Síntesis de Glucosa                          • Fermentación: • Ciclo de Krebs
  de $H_2O$     • Regeneración de RuBP                           - Láctica     • Fosforilación Oxidativa
  (Complejo Mn)   (Gasto de ATP y NADPH)                         - Alcohólica    (Cadena respiratoria y
• Fotofosforilación (ATP)                                                        complejo ATP sintasa)
• Fotorreducción ($NADP^+ \to NADPH$)                                            • Lanzaderas (Glicerol vs Malato)
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Generalidades de la Bioenergética y el ATP
La moneda energética universal de los seres vivos es el **Adenosín Trifosfato (ATP)**, constituido por la base nitrogenada adenina, la pentosa ribosa y tres grupos fosfato unidos por dos **enlaces macroérgicos anhídrido fosfórico** ($\sim P$) de alta energía libre de hidrólisis ($\Delta G^{\circ\prime} \approx -7.3\text{ kcal/mol} = -30.5\text{ kJ/mol}$):
$$\text{ATP} + H_2O \rightleftharpoons \text{ADP} + P_i + 7.3\text{ kcal/mol}$$

---

### 3.2. La Fotosíntesis Oxigénica
Proceso anabólico endergónico fundamental que transforma la energía lumínica solar en energía química estable almacenada en los enlaces covalentes de la glucosa y otros compuestos orgánicos, utilizando $H_2O$ como donador de electrones y liberando $O_2$ a la atmósfera:
$$6CO_2 + 6H_2O \xrightarrow[\text{Clorofila}]{\text{Luz solar}} C_6H_{12}O_6 + 6O_2$$

#### A. Estructura del Cloroplasto
* **Membrana Tilacoidal:** Bicapa lipídica que encierra el espacio intratilacoidal (lumen). En ella se hallan insertados los **Fotosistemas (I y II)**, la cadena transportadora de electrones fotosintética y el complejo **ATP sintasa** ($CF_0-CF_1$). Aquí ocurre la **Fase Luminosa**.
* **Estroma:** Matriz coloidal fluida equivalente al citoplasma mitocondrial. Contiene ribosomas 70S, ADN circular cloroplástico y todas las enzimas del **Ciclo de Calvin-Benson** (fase oscura), principalmente la enzima **RuBisCO**.

#### B. Fase Luminosa, Fotoquímica o Reacción de Hill (En los Tilacoides)
Requiere luz solar directa. Ocurre en cuatro etapas moleculares coordinadas:
1. **Fotoexcitación de las Clorofilas:**
   * La luz es captada por los complejos antena de los fotosistemas formados por pigmentos (clorofila $a$, clorofila $b$ y carotenoides).
   * **Fotosistema II ($PS\text{-}II$ o $P_{680}$):** Absorbe a $\lambda = 680\text{ nm}$. Sus electrones son excitados a un nivel cuántico superior y captados por la feofitina, pasando a la cadena transportadora: Plastoquinona ($PQ$) $\to$ Complejo Citocromo $b_6f$ $\to$ Plastocianina ($PC$).
   * **Fotosistema I ($PS\text{-}I$ o $P_{700}$):** Absorbe a $\lambda = 700\text{ nm}$. Cede electrones de alta energía a la ferredoxina ($Fd$). Sus electrones perdidos son repuestos por la plastocianina procedente del $PS\text{-}II$.
2. **Fotólisis del Agua (Reacción de Hill):**
   * Ocurre en el lado luminal del $PS\text{-}II$ catalizada por el **Complejo Evolucionador de Oxígeno (que contiene un cúmulo de 4 átomos de Manganeso, $Mn_4CaO_5$ y cofactor $Cl^-$)**:
     $$2H_2O \xrightarrow[\text{Complejo } Mn]{\text{Luz}} O_{2(g)}\uparrow + 4H^+ + 4e^-$$
   * *Destino de los productos:*
     - Los **electrones ($e^-$)** reponen los electrones perdidos por el centro de reacción $P_{680}$.
     - El **oxígeno gaseoso ($O_2$)** se desprende a la atmósfera como subproducto. *(¡Cuidado en examen!: Todo el oxígeno que respiramos procede de la rotura del agua, jamás del dióxido de carbono)*.
     - Los **protones ($H^+$)** se acumulan en el lumen tilacoidal contribuyendo al gradiente electroquímico.
3. **Fotofosforilación (Síntesis de ATP por Quimiósmosis de Peter Mitchell):**
   * Durante el transporte de electrones, el complejo citocromo $b_6f$ bombea protones desde el estroma hacia el lumen tilacoidal contra gradiente.
   * Esto genera una enorme fuerza protón-motriz ($\Delta pH$).
   * Los protones regresan a favor de gradiente hacia el estroma cruzando exclusivamente por el canal de la **ATP sintasa** ($CF_0-CF_1$), rotando y fosforilando ADP en ATP:
     $$\text{ADP} + P_i \xrightarrow{\text{ATP sintasa}} \text{ATP}$$
4. **Fotorreducción del $NADP^+$:**
   * Los electrones transferidos desde el $PS\text{-}I$ llegan a la enzima estromal **Ferredoxina-$NADP^+$ Reductasa (FNR)**:
     $$NADP^+ + 2H^+ + 2e^- \xrightarrow{FNR} NADPH + H^+$$

* **Fotofosforilación Cíclica:** Cuando la célula tiene déficit de ATP, los electrones de la ferredoxina regresan al citocromo $b_6f$ en lugar de reducir al $NADP^+$, generando exclusivamente **ATP sin producción de $NADPH$ ni desprendimiento de $O_2$**.

#### C. Fase Oscura, Biosintética o Ciclo de Calvin-Benson (En el Estroma)
No depende directamente de la luz, pero utiliza los productos asimiladores generados en la fase luminosa (**ATP y NADPH**):
1. **Fijación del Carbono (Carboxilación):**
   * La molécula aceptora de 5 carbonos, la **Ribulosa-1,5-bisfosfato (RuBP)**, se combina con una molécula de dióxido de carbono ($CO_2$) gaseoso catalizada por la enzima más abundante del planeta: **RuBisCO (Ribulosa bisfosfato carboxilasa/oxigenasa)**.
   * Se forma un intermediario inestable de 6 carbonos que se rompe de inmediato en 2 moléculas de 3 carbonos: el **3-Fosfoglicerato (PGA)**.
2. **Reducción del PGA:**
   * Las moléculas de PGA son fosforiladas por el ATP y luego reducidas por el NADPH formando **Gliceraldehído-3-fosfato (PGAL o G3P)**.
3. **Síntesis de Biomoléculas:**
   * Por cada $6$ vueltas del ciclo de Calvin (fijación de $6CO_2$), se forman $12\text{ PGAL}$:
   * **$2\text{ moléculas de PGAL}$** salen del ciclo hacia el citosol para condensarse y sintetizar **$1\text{ molécula de Glucosa}$** ($C_6H_{12}O_6$), fructosa, almidón y aminoácidos.
4. **Regeneración de la Ribulosa-1,5-bisfosfato (RuBP):**
   * Las **$10\text{ moléculas de PGAL}$** restantes ($10 \times 3C = 30C$) se reorganizan mediante una serie de reacciones enzimáticas complejas consumiendo ATP para regenerar **$6\text{ moléculas de RuBP}$** ($6 \times 5C = 30C$), reiniciando el ciclo.
* **Gasto Energético Neto para formar 1 Molécula de Glucosa ($6CO_2$):**
  $$\mathbf{18 \ ATP} + \mathbf{12 \ NADPH}$$

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
* Una molécula de glucosa ($6C$) se escinde en **dos moléculas de piruvato ($3C$)**.
* *Fase de Inversión:* Se consumen $2\text{ ATP}$.
* *Fase de Rendimiento:* Se generan $4\text{ ATP}$ (por fosforilación a nivel de sustrato) y $2\text{ NADH} + 2H^+$.
* **Balance Neto de la Glucólisis:**
  $$\mathbf{2 \ Piruvato} + \mathbf{2 \ ATP (netos)} + \mathbf{2 \ NADH} + \mathbf{2 \ H_2O}$$

#### B. Vía Anaerobia: Fermentación (Sin Oxígeno)
Ocurre en el citosol para regenerar el $NAD^+$ necesario para que la glucólisis no se detenga. No produce ATP adicional:
1. **Fermentación Láctica:** El piruvato se reduce directamente a **Lactato (Ácido Láctico)** por la enzima lactato deshidrogenasa, oxidando el NADH a $NAD^+$:
   $$\text{Piruvato} + \text{NADH} + H^+ \to \text{Lactato} + NAD^+$$
   * Ocurre en bacterias lácticas (*Lactobacillus*, yogur, quesos) y en el músculo esquelético humano bajo ejercicio anaeróbico intenso (causante temporal de fatiga).
2. **Fermentación Alcohólica:** El piruvato se descarboxila liberando $CO_2$ formando acetaldehído, el cual se reduce a **Etanol** por la enzima alcohol deshidrogenasa:
   $$\text{Piruvato} \to \text{Acetaldehído} + CO_2\uparrow \xrightarrow{NADH} \text{Etanol} + NAD^+$$
   * Ocurre en levaduras (*Saccharomyces cerevisiae*) para la elaboración de pan, vino y cerveza.

#### C. Respiración Aerobia (En Presencia de $O_2$)

##### 1. Descarboxilación Oxidativa del Piruvato (Acetilación, en la Matriz Mitocondrial)
Cada piruvato ($3C$) entra a la mitocondria a través de transportadores específicos y es oxidado por el complejo multienzimático **Piruvato Deshidrogenasa**:
$$\text{Piruvato} (3C) + CoA-SH + NAD^+ \to \textbf{Acetil-CoA} (2C) + CO_2\uparrow + \text{NADH} + H^+$$
* Por cada glucosa ($2\text{ piruvatos}$): se generan **$2\text{ Acetil-CoA} + 2\text{ CO}_2 + 2\text{ NADH}$**.

##### 2. Ciclo de Krebs o Ciclo del Ácido Cítrico (En la Matriz Mitocondrial)
Vía cíclica anfibólica central de degradación oxidativa:
1. El **Acetil-CoA ($2C$)** se condensa con el **Oxalacetato ($4C$)** mediante la enzima *Citrato sintasa* para formar **Citrato ($6C$)**.
2. Isomerización a Isocitrato ($6C$).
3. Primera descarboxilación oxidativa: el Isocitrato se oxida a **$\alpha$-Cetoglutarato ($5C$)**, liberando el primer $CO_2$ y reduciendo $1\text{ NAD}^+ \to \text{NADH}$.
4. Segunda descarboxilación oxidativa: el $\alpha$-Cetoglutarato se oxida a **Succinil-CoA ($4C$)**, liberando el segundo $CO_2$ y generando otro $\text{NADH}$.
5. Fosforilación a nivel de sustrato: Succinil-CoA se convierte en **Succinato ($4C$)**, generando un **GTP (equivalente a 1 ATP)**.
6. Oxidación del Succinato a **Fumarato ($4C$)** por la *Succinato deshidrogenasa* (complejo II), reduciendo un **$FAD \to FADH_2$**.
7. Hidratación del Fumarato a **Malato ($4C$)**.
8. Oxidación final del Malato a **Oxalacetato ($4C$)**, reduciendo un tercer **$NAD^+ \to NADH$**, regenerando el aceptor para una nueva vuelta.

* **Balance por CADA Vuelta del Ciclo de Krebs (1 Acetil-CoA):**
  $$3\text{ NADH} + 1\text{ FADH}_2 + 1\text{ GTP (ATP)} + 2\text{ CO}_2$$
* **Balance del Ciclo de Krebs por molécula de Glucosa ($2\text{ vueltas}$):**
  $$\mathbf{6 \ NADH} + \mathbf{2 \ FADH}_2 + \mathbf{2 \ ATP} + \mathbf{4 \ CO}_2$$

##### 3. Cadena de Transporte de Electrones y Fosforilación Oxidativa (En las Crestas Mitocondriales)
Los electrones de alta energía transportados por los cofactores reducidos ($NADH$ y $FADH_2$) recorren una serie de cuatro complejos proteicos respiratorios incrustados en la membrana mitocondrial interna:
* **Complejo I (NADH deshidrogenasa):** Recibe electrones del $NADH$, los cede a la Coenzima Q (Ubiquinona) y **bombea $4H^+$** al espacio intermembrana.
* **Complejo II (Succinato deshidrogenasa):** Recibe electrones del $FADH_2$ y los pasa a la Ubiquinona (**no bombea protones**).
* **Complejo III (Citocromo $bc_1$):** Transfiere electrones de la Ubiquinona reducida al Citocromo c y **bombea $4H^+$**.
* **Complejo IV (Citocromo c oxidasa):** Transfiere los electrones a su **ACEPTOR FINAL DE ELECTRONES: EL OXÍGENO MOLECULAR ($O_2$)**, reduciéndolo a **Agua metabólica ($H_2O$)**, y **bombea $2H^+$**:
  $$\frac{1}{2}O_2 + 2H^+ + 2e^- \to H_2O$$
* **Fuerza Protón-Motriz y ATP Sintasa (Complejo $F_0-F_1$):**
  El gradiente electroquímico de protones acumulado en el espacio intermembrana impulsa el flujo quimiosmótico a través del canal $F_0$, haciendo rotar la subunidad catalítica $F_1$ que sintetiza ATP a partir de ADP y $P_i$.
  * **Rendimiento Bioenergético P/O Clásico de Examen:**
    * Por cada $1\text{ NADH}$ oxidado en la cadena $\implies$ se sintetizan **$3\text{ ATP}$** (ó $2.5\text{ ATP}$ moderno).
    * Por cada $1\text{ FADH}_2$ oxidado $\implies$ se sintetizan **$2\text{ ATP}$** (ó $1.5\text{ ATP}$ moderno).

##### 4. Sistemas de Lanzaderas de Electrones
Los $2\text{ NADH}$ formados durante la glucólisis en el citosol no pueden cruzar la membrana mitocondrial interna permeable; deben transferir sus electrones hacia la matriz mediante lanzaderas:
1. **Lanzadera del Malato-Aspartato:**
   * Transfiere los electrones al $NAD^+$ mitocondrial $\implies$ rinde **$3\text{ ATP}$ por cada NADH**.
   * Opera en tejidos de alta demanda: **corazón, hígado y riñones**.
   * Rendimiento total: **$38\text{ ATP}$**.
2. **Lanzadera del Glicerol-3-Fosfato:**
   * Transfiere los electrones al $FAD$ de la membrana interna $\implies$ rinde **$2\text{ ATP}$ por cada NADH** citosólico.
   * Opera en: **músculo esquelético y cerebro**.
   * Rendimiento total: **$36\text{ ATP}$**.

---

## 4. BALANCE ENERGÉTICO TOTAL DE LA RESPIRACIÓN AEROBIA (POR GLUCOSA)
$$\begin{array}{|l|c|c|c|}
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
\end{array}$$

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: "El oxígeno liberado en la fotosíntesis proviene del $CO_2$".** ERROR HISTÓRICO FATAL. Cornelius van Niel y los experimentos de Rubén y Kamen con agua marcada isotópicamente ($H_2^{18}O$) demostraron categóricamente que el $O_2$ liberado proviene al $100\%$ de la **fotólisis del agua**.
* **Trampa 2: Creer que la fermentación produce ATP en su segunda etapa.** FALSO. Los únicos 2 ATP netos de la fermentación se producen en la **glucólisis**. La conversión de piruvato a lactato o etanol no produce ATP; su única función fisiológica es **reoxidar el NADH a $NAD^+$** para mantener activa la glucólisis.
* **Trampa 3: "La fase oscura de la fotosíntesis solo ocurre de noche".** FALSO. Se llama fase oscura porque no requiere luz directamente, pero ocurre predominantemente **durante el día**, ya que necesita el ATP y NADPH que la fase luminosa produce continuamente bajo el sol.

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Productos de la Fase Luminosa:**
  * **"EL SOL DA O-P-A"**:
    * **O**xígeno ($O_2$, se libera)
    * **P**oder reductor ($NADPH$)
    * **A**TP (energía química para el ciclo de Calvin).
* **Mnemotecnia Lanzaderas:**
  * **M**alato-Aspartato rinde **M**ás ($38\text{ ATP}$).
  * **G**licerol-Fosfato rinde **G**astado ($36\text{ ATP}$).
* **Mnemotecnia Aceptores Finales:**
  * En Fotosíntesis: El aceptor final de electrones es el **$NADP^+$**.
  * En Respiración Celular Aerobia: El aceptor final de electrones es el **$O_2$** (formando $H_2O$).

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Etapas de la Fotosíntesis y Localización)
Indique en qué compartimento celular y en qué fase fotosintética ocurre cada uno de los siguientes eventos biológicos:
I. Fotólisis del agua con desprendimiento de oxígeno molecular.
II. Fijación enzimática del dióxido de carbono por la RuBisCO.
III. Fotofosforilación acoplada al flujo de protones por ATP sintasa.
IV. Regeneración de la Ribulosa-1,5-bisfosfato consumiendo ATP.

* **Resolución:**
  * I. Fotólisis del agua: Ocurre en el complejo de manganeso del Fotosistema II ubicado en la **Membrana Tilacoidal** durante la **Fase Luminosa**.
  * II. Fijación de $CO_2$: Ocurre en el **Estroma** del cloroplasto durante la **Fase Oscura (Ciclo de Calvin)**.
  * III. Fotofosforilación: Ocurre a través de la ATP sintasa insertada en la **Membrana Tilacoidal** durante la **Fase Luminosa**.
  * IV. Regeneración de RuBP: Ocurre en el **Estroma** del cloroplasto durante la **Fase Oscura (Ciclo de Calvin)**.
* **Respuesta:**
  I: Tilacoide / Fase Luminosa.
  II: Estroma / Fase Oscura.
  III: Tilacoide / Fase Luminosa.
  IV: Estroma / Fase Oscura.

---

### Problema 2 (Nivel Intermedio - Balance Cuantitativo del Ciclo de Calvin)
Para que una planta sintetice mediante fotosíntesis una molécula de glucosa ($C_6H_{12}O_6$), determine:
a) Cuántas moléculas de dióxido de carbono ($CO_2$) deben fijarse.
b) Cuántas moléculas de ATP y NADPH se consumen en total en el ciclo de Calvin.
c) Cuántas moléculas de agua debieron desintegrarse en la fase luminosa para liberar el oxígeno estequiométrico equivalente.

* **Resolución:**
  1. a) Como la glucosa posee 6 átomos de carbono ($C_6$), deben ingresar obligatoriamente **$6\text{ moléculas de } CO_2$** (se requieren 6 vueltas del ciclo de Calvin).
  2. b) En cada vuelta del ciclo de Calvin se consumen $3\text{ ATP}$ ($2$ en reducción de PGA a PGAL y $1$ en la regeneración de RuBP) y $2\text{ NADPH}$:
     * Para $6CO_2$:
       $$\text{ATP consumidos} = 6 \times 3 = \mathbf{18 \ ATP}$$
       $$\text{NADPH consumidos} = 6 \times 2 = \mathbf{12 \ NADPH}$$
  3. c) La ecuación global de la fotosíntesis genera $6O_2$ por cada glucosa:
     $$6CO_2 + 6H_2O \to C_6H_{12}O_6 + 6O_2$$
     Cada molécula de $O_2$ liberada requiere la fotólisis de $2$ moléculas de agua ($2H_2O \to O_2 + 4H^+ + 4e^-$). Para generar $6O_2$ se requiere la fotólisis de:
     $$6 \times 2 = \mathbf{12 \ moléculas de } H_2O$$
     *(Considerando la estequiometría real extendida de Hill: $6CO_2 + 12H_2O \to C_6H_{12}O_6 + 6O_2 + 6H_2O$)*.
* **Respuesta:** a) $6 CO_2$; b) $18\text{ ATP}$ y $12\text{ NADPH}$; c) $12\text{ moléculas de } H_2O$.

---

### Problema 3 (Nivel Intermedio - Comparación entre Fermentación y Respiración Aerobia)
Un atleta de velocidad corre $100\text{ metros}$ planos a máxima intensidad anaerobia en 10 segundos, acumulando ácido láctico en sus músculos cuádriceps. Paralelamente, un fondista corre una maratón de $42\text{ km}$ en régimen aeróbico constante.
a) Compare el rendimiento de ATP por molécula de glucosa en el músculo del velocista frente al del maratonista.
b) Explique por qué el velocista experimenta fatiga y dolor muscular temporal.

* **Resolución:**
  1. a) **Rendimiento Bioenergético:**
     * En el velocista (anaerobiosis estricta): La glucosa solo realiza glucólisis seguida de fermentación láctica en el citosol. Rinde netamente **$2\text{ ATP}$ por molécula de glucosa**.
     * En el maratonista (aerobiosis con aporte constante de $O_2$): La glucosa ingresa a la mitocondria y realiza respiración aerobia completa (glucólisis, acetilación, ciclo de Krebs y fosforilación oxidativa con lanzadera del glicerol fosfato en músculo). Rinde **$36\text{ ATP}$ por molécula de glucosa**.
     * La respiración aerobia es **18 veces más eficiente energéticamente** que la vía fermentativa.
  2. b) **Mecanismo de Fatiga:**
     * Durante la contracción anaerobia acelerada, la tasa de hidrólisis de ATP y la fermentación láctica exceden la capacidad de amortiguamiento; el lactato y los protones ($H^+$) se acumulan en el miocito provocando un descenso del pH intracelular (acidosis metabólica láctica local). El pH ácido inhibe alostéricamente a la enzima fosfofructoquinasa-1 (deteniendo la glucólisis) y desensibiliza a la troponina C frente al calcio, causando fallo contráctil (fatiga muscular aguda) hasta que el lactato se transporta por sangre al hígado para reconvertirse en glucosa vía el **Ciclo de Cori**.
* **Respuesta:** a) Velocista: $2\text{ ATP}$; Maratonista: $36\text{ ATP}$; b) La acumulación de ácido láctico y protones desciende el pH celular inhibiendo la maquinaria contráctil.

---

### Problema 4 (Nivel Avanzado - Inhibidores de la Cadena Respiratoria y Desacopladores)
En un ensayo farmacológico in vitro sobre mitocondrias hepáticas activas se agregan por separado dos sustancias tóxicas:
1. **Cianuro de potasio ($KCN$):** Bloqueador específico irreversible del citocromo $a_3$ del Complejo IV.
2. **2,4-Dinitrofenol (DNP):** Molécula ionófora lipofílica desacopladora que transporta protones libremente a través de la membrana mitocondrial interna sin pasar por la ATP sintasa.
Prediga qué sucederá en cada caso con: el consumo de oxígeno ($O_2$), la síntesis de ATP y la temperatura del sistema (disipación de calor).

* **Resolución:**
  1. **Efecto del Cianuro de Potasio (Inhibidor del Complejo IV):**
     * Al bloquear el Citocromo c oxidasa, los electrones no pueden transferirse al oxígeno ($O_2$).
     * Toda la cadena de transporte de electrones se satura y se detiene el bombeo de protones.
     * **Consumo de $O_2$:** Cesa completamente ($0\%$).
     * **Síntesis de ATP:** Se anula por completo la fosforilación oxidativa, colapsando el metabolismo celular y causando la muerte celular por anoxia histotóxica.
     * **Temperatura:** Disminuye (no hay actividad metabólica).
  2. **Efecto del 2,4-Dinitrofenol (Desacoplador Quimiosmótico):**
     * El DNP transporta los protones desde el espacio intermembrana directamente hacia la matriz disipando el gradiente electroquímico ($\Delta pH = 0$) sin atravesar el canal catalítico de la ATP sintasa.
     * La cadena respiratoria intenta compensar la falta de gradiente acelerando al máximo el transporte de electrones y oxidando frenéticamente $NADH$ y $FADH_2$.
     * **Consumo de $O_2$:** Se dispara a niveles máximos (**hiperconsumo de $O_2$**).
     * **Síntesis de ATP:** Cae a cero o niveles basales mínimos (se desacopla la fosforilación).
     * **Temperatura:** Toda la energía potencial del gradiente se disipa en forma de **CALOR masivo**, provocando una hipertermia maligna letal.
* **Respuesta:** Cianuro: Anula el consumo de $O_2$ y la síntesis de ATP; DNP (desacoplador): Dispara al máximo el consumo de $O_2$, anula la síntesis de ATP y disipa toda la energía como calor extremo (hipertermia).

---

### Problema 5 (Nivel Reto UNSA / UNI - Foto-respiración y Plantas $C_3, C_4$ y CAM)
Bajo climas áridos y calurosos como los del desierto de Arequipa (La Joya), las plantas con metabolismo fotosintético $C_3$ ordinario sufren el fenómeno de la **Fotorrespiración**, reduciendo su productividad hasta en un $50\%$.
a) Explique la actividad oxigenasa de la enzima RuBisCO que desencadena la fotorrespiración.
b) Describa la adaptación bioquímica y anatómica de las **Plantas $C_4$** (Anatomía de Kranz) y de las **Plantas CAM** (metabolismo ácido de las crasuláceas) para evitar este problema.

* **Resolución:**
  1. a) **Fotorrespiración y la RuBisCO:**
     * La enzima RuBisCO no es estrictamente específica para el $CO_2$; posee también afinidad por el oxígeno molecular ($O_2$).
     * En días calurosos y secos, la planta cierra sus estomas para evitar la deshidratación por transpiración. Al estar los estomas cerrados, la concentración de $CO_2$ interno desciende abruptamente mientras que el $O_2$ generado en la fase luminosa se acumula.
     * En estas condiciones ($[O_2] \gg [CO_2]$), la RuBisCO actúa como **oxigenasa**, uniendo $O_2$ a la ribulosa-1,5-bisfosfato (RuBP). Esto genera una molécula de 3-fosfoglicerato ($PGA, 3C$) y una molécula de **2-fosfoglicolato ($2C$)**.
     * El fosfoglicolato es tóxico y debe ser reciclado a través de una ruta metabólica energéticamente costosa que involucra tres organelas coordinadas: **Cloroplasto $\to$ Peroxisoma $\to$ Mitocondria**. En este proceso se consume ATP y se pierde carbono en forma de $CO_2$ sin producir glucosa ni ATP útil (fotorrespiración).
  2. b) **Estrategias Evolutivas de Adaptación:**
     * **Plantas $C_4$ (Maíz, caña de azúcar, sorgo):**
       - **Separación Espacial:** Poseen **Anatomía de Kranz** (células del mesófilo y células de la vaina perivascular).
       - En las células del mesófilo, el $CO_2$ es fijado primeramente por la enzima **PEP Carboxilasa** (Fosfoenolpiruvato carboxilasa), la cual **carece por completo de afinidad por el $O_2$**, formando un ácido de 4 carbonos: **Oxalacetato** (que se convierte en Malato).
       - El malato viaja a las células de la vaina (impermeables al $O_2$), donde se descarboxila liberando una altísima concentración local de $CO_2$ directamente sobre la RuBisCO, saturando su sitio activo e impidiendo totalmente la fotorrespiración.
     * **Plantas CAM (Cactus, piña, sábila):**
       - **Separación Temporal Día/Noche:**
       - *De Noche:* Abren sus estomas (menor temperatura y menor evaporación). Absorben $CO_2$ y lo fijan mediante PEP Carboxilasa en Malato, el cual se acumula en las grandes vacuolas como ácido málico.
       - *De Día:* Mantienen los estomas herméticamente cerrados para no perder agua. El ácido málico sale de la vacuola, se descarboxila liberando $CO_2$ en el estroma e inicia el ciclo de Calvin impulsado por el ATP y NADPH provistos por la fase luminosa solar diurna.
* **Respuesta:** a) RuBisCO actúa como oxigenasa en baja concentración de $CO_2$ generando fosfoglicolato con gasto de ATP; b) Las $C_4$ separan espacialmente la fijación con PEP carboxilasa y anatomía de Kranz; las CAM separan temporalmente abriendo estomas de noche y realizando Calvin de día.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **RuBisCO:** Enzima vegetal estromal más abundante del planeta encargada de catalizar la fijación del $CO_2$ en la ribulosa-1,5-bisfosfato.
2. **Fotólisis del Agua:** Reacción fotoquímica del $PS\text{-}II$ mediada por manganeso donde el agua se rompe liberando protones, electrones y gas $O_2$.
3. **Quimiósmosis:** Mecanismo biofísico de síntesis de ATP acoplado al retorno de protones a favor de un gradiente electroquímico a través de la ATP sintasa.
4. **Glucólisis:** Vía metabólica citosólica universal en la cual una molécula de glucosa se oxida a dos de piruvato rindiendo 2 ATP y 2 NADH.
5. **Ciclo de Krebs:** Vía anfibólica matricial mitocondrial que oxida restos acetilo ($2C$) a $CO_2$ generando coenzimas reducidas ($NADH, FADH_2$) y GTP.
6. **Lanzadera Malato-Aspartato:** Mecanismo de translocación mitocondrial de electrones citosólicos que rinde 3 ATP por cada NADH en corazón e hígado.
7. **Lanzadera Glicerol-3-Fosfato:** Sistema de transporte electrónico mitocondrial que transfiere electrones al FAD rindiendo 2 ATP por NADH en músculo esquelético.
8. **Fermentación:** Vía catabólica anaerobia citoplásmica que reoxida el NADH a $NAD^+$ mediante la reducción del piruvato a lactato o etanol.
9. **Fosforilación Oxidativa:** Proceso terminal de síntesis de ATP en las crestas mitocondriales acoplado a la cadena de transporte de electrones al oxígeno.
10. **Fotorrespiración:** Proceso metabólico energéticamente ineficiente donde la RuBisCO oxigena a la RuBP liberando $CO_2$ en días calurosos.

---

## 9. FLASHCARDS
* **Front:** ¿Cuál es el donador inicial de electrones en la fotosíntesis oxigénica y cuál es el aceptor final?
  * **Back:** El donador inicial de electrones es el **Agua ($H_2O$)** (que libera $O_2$); el aceptor final de electrones es el **$NADP^+$** (que se reduce a $NADPH$).
* **Front:** ¿Cuál es el aceptor final de electrones en la respiración celular aerobia y en qué se convierte?
  * **Back:** El aceptor final es el **Oxígeno molecular ($O_2$)**, el cual al captar electrones y protones se reduce formando **Agua ($H_2O$) metabólica**.
* **Front:** ¿Cuántos ATP netos produce una molécula de glucosa degradada por fermentación láctica frente a respiración aerobia?
  * **Back:** La fermentación rinde únicamente **$2\text{ ATP}$ netos** (producidos en la glucólisis); la respiración aerobia completa rinde **$36\text{ a }38\text{ ATP}$**.
* **Front:** ¿Dónde se localizan físicamente la fase luminosa y la fase oscura dentro del cloroplasto?
  * **Back:** La Fase Luminosa ocurre en la **membrana del tilacoide**; la Fase Oscura (Ciclo de Calvin) ocurre en el **estroma**.
* **Front:** ¿Qué enzima cataliza la síntesis de ATP impulsada por el gradiente de protones en mitocondrias y tilacoides?
  * **Back:** El complejo proteico enzimático transmembranal **ATP sintasa** (complejo $F_0-F_1$ en mitocondrias y $CF_0-CF_1$ en cloroplastos).

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "BIO_05",
  "titulo": "Metabolismo Celular: Fotosíntesis y Respiración Celular",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿De qué molécula proviene exactamente el oxígeno (O2) que se libera a la atmósfera durante la fotosíntesis?",
      "opciones": ["Del dióxido de carbono (CO2)", "Del agua (H2O)", "De la glucosa", "De la ribulosa bisfosfato"],
      "respuesta_correcta": 1,
      "retroalimentacion": "El O2 se origina exclusivamente por la fotólisis del agua en el Fotosistema II durante la fase luminosa."
    },
    {
      "id": "q2",
      "pregunta": "¿En qué compartimento de la mitocondria se lleva a cabo el Ciclo de Krebs?",
      "opciones": [
        "En la membrana mitocondrial externa",
        "En el espacio intermembrana",
        "En las crestas mitocondriales",
        "En la matriz mitocondrial"
      ],
      "respuesta_correcta": 3,
      "retroalimentacion": "Las enzimas del ciclo de Krebs se localizan solubles en la matriz mitocondrial (salvo la succinato deshidrogenasa en la cresta)."
    },
    {
      "id": "q3",
      "pregunta": "El balance neto de ganancia de ATP obtenido exclusivamente en la glucólisis por molécula de glucosa es:",
      "opciones": ["1 ATP", "2 ATP", "4 ATP", "36 ATP"],
      "respuesta_correcta": 1,
      "retroalimentacion": "La glucólisis genera 4 ATP brutos pero consume 2 ATP en su fase preparatoria, dejando una ganancia neta de 2 ATP."
    }
  ]
}
```
