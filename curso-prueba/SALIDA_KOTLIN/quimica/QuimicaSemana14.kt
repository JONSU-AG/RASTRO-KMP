package quimica

import com.clase.app.data.model.LessonNode
import com.clase.app.data.model.LessonTheory
import com.clase.app.data.model.Challenge

object QuimicaSemana14 {
    val lessons: List<LessonNode> = listOf(
        LessonNode(
            id = "quim_t14_s01",
            title = "Química Orgánica, El Átomo de Carbono e Hidrocarburos - Fundamentos y Leyes Principales",
            theory = LessonTheory(
                title = "Química Orgánica, El Átomo de Carbono e Hidrocarburos - Fundamentos y Leyes Principales",
                content = """## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Química Orgánica Fundamental
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Hibridación sp^3, sp^2, sp, tipos de carbono, isomería, nomenclatura IUPAC de alcanos, alquenos, alquinos y cicloalcanos, y aromaticidad del benceno)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 10.0 / 10

---


## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         QUÍMICA ORGÁNICA E HIDROCARBUROS
                                        │
         ┌──────────────────────────────┴──────────────────────────────┐
         ▼                                                             ▼
EL ÁTOMO DE CARBONO                                           LOS HIDROCARBUROS
• Propiedades Químicas:                                       (Compuestos de C e H)
  - Tetravalencia (4 enlaces)                                          │
  - Autosaturación (Catenación / Cadenas)                      ┌───────┴───────┐
  - Hibridación orbital (sp^3, sp^2, sp)                     ▼               ▼
• Tipos de Carbono: Primario, Secundario, Terciario, Cuaternario  ALIFÁTICOS    AROMÁTICOS
• Isomería: De cadena, posición, función, geométrica (cis/trans)      │         (Benceno C_6H_6,
                                                                       │          Resonancia, Hückel)
         ┌─────────────────────────────────────────────────────────────┘
         ▼
HIDROCARBUROS ALIFÁTICOS
• Alcanos (Parafinas): C_n H_{2n+2} (Saturados, enlaces simples \sigma, hibridación sp^3)
• Alquenos (Olefinas): C_n H_{2n} (Insaturados, enlaces dobles \sigma + \pi, hibridación sp^2)
• Alquinos (Acetilénicos): C_n H_{2n-2} (Insaturados, enlaces triples \sigma + 2\pi, hibridación sp)
• Cicloalcanos: C_n H_{2n} (Anillos saturados)
• Reglas Sistemáticas de Nomenclatura IUPAC (Cadena principal, numeración, sustituyentes)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Generalidades de la Química Orgánica
La Química Orgánica es la rama de la química que estudia los compuestos del carbono y sus derivados (con excepción de formas inorgánicas simples como CO, CO_2, H_2CO_3, sales de carbonato CO_3^{2-}, cianuros CN^-, carburos CaC_2).
* **Hito Histórico (Friedrich Wöhler, 1828):** Derrumbe de la Teoría de la Fuerza Vital (Vitalismo) al sintetizar urea (H_2N-CO-NH_2, compuesto orgánico) a partir de una sustancia mineral inorgánica (cianato de amonio, NH_4OCN) mediante calentamiento:
  NH_4OCN \xrightarrow{\Delta} (NH_2)_2CO \text{ (Urea)}

### 3.2. Propiedades Singulares del Átomo de Carbono
El carbono (Z = 6, configuración basal: 1s^2 2s^2 2p^2) posee propiedades electrónicas únicas que explican la existencia de millones de compuestos orgánicos:
1. **Tetravalencia:** Capacidad del carbono para formar **cuatro enlaces covalentes**, completando su octeto electrónico en todos sus compuestos estables (postulado de Kekulé).
2. **Autosaturación (Catenación):** Capacidad intrínseca del carbono de unirse a otros átomos de carbono mediante enlaces simples, dobles o triples para formar cadenas moleculares lineales, ramificadas, cíclicas y redes infinitas de gran estabilidad termodinámica.
3. **Covalencia:** El carbono comparte electrones con otros no metales (H, O, N, S, P, X) mediante enlaces covalentes con baja diferencia de electronegatividad.
4. **Hibridación de Orbitales Atómicos (Linus Pauling):** Reordenamiento y mezcla cuántica de los orbitales atómicos puros (2s y 2p) para generar nuevos orbitales híbridos equivalentes:

| Tipo de Hibridación | Enlaces Formados | Geometría Molecular | Ángulo de Enlace | Tipo de Enlace | Ejemplo Característico |
| :---: | :---: | :---: | :---: | :---: | :---: |
| **sp^3** | 4 enlaces simples | **Tetraédrica** | 109.5^\circ (109^\circ 28') | 4\sigma | Metano (CH_4), Alcanos |
| **sp^2** | 1 doble y 2 simples | **Trigonal Plana** | 120^\circ | 3\sigma + 1\pi | Eteno (C_2H_4), Alquenos |
| **sp** | 1 triple y 1 simple (o 2 dobles acumulados) | **Lineal** | 180^\circ | 2\sigma + 2\pi | Etino (C_2H_2), Alquinos, Alenos |

### 3.3. Tipos de Átomos de Carbono en Cadenas Saturadas
Se clasifican de acuerdo al número de otros átomos de carbono a los que se encuentran enlazados directamente mediante enlaces simples:
1. **Carbono Primario (1^\circ):** Unido a **1 solo átomo de carbono**. En los extremos de cadenas lineales porta generalmente 3 hidrógenos (-CH_3, grupo metilo).
2. **Carbono Secundario (2^\circ):** Unido a **2 átomos de carbono**. En cadenas lineales porta 2 hidrógenos (-CH_2-, grupo metileno).
3. **Carbono Terciario (3^\circ):** Unido a **3 átomos de carbono**. Porta 1 hidrógeno (\diagup\hspace{-1mm}\text{CH}-, grupo metino).
4. **Carbono Cuaternario (4^\circ):** Unido a **4 átomos de carbono**. No porta hidrógenos (\backslash\hspace{-1.5mm}\text{C}\hspace{-1.5mm}\diagup).

### 3.4. Isomería en Química Orgánica
Fenómeno por el cual dos o más compuestos tienen la **misma fórmula molecular global**, pero difieren en su estructura, conectividad o disposición tridimensional en el espacio, presentando propiedades distintas:
1. **Isomería Estructural o Plana:**
   * *De Cadena:* Difiere la ramificación del esqueleto carbonado (ej. pentano lineal y 2-metilbutano, ambos C_5H_{12}).
   * *De Posición:* Difiere la ubicación del grupo funcional o del enlace múltiple en la misma cadena (ej. 1-butanol y 2-butanol; 1-buteno y 2-buteno).
   * *De Función:* Compuestos con distinta función química pero misma fórmula molecular (ej. etanol CH_3CH_2OH y éter dimetílico CH_3OCH_3, ambos C_2H_6O).
2. **Estereoisomería (Isomería Espacial):**
   * *Isomería Geométrica (Cis-Trans o E/Z):* Se presenta en alquenos con enlace doble rígido que impide la libre rotación:
     - **Cis:** Los sustituyentes de mayor prioridad se hallan en el mismo lado del plano del doble enlace.
     - **Trans:** Los sustituyentes se encuentran en lados opuestos del plano (más estable termodinámicamente).
   * *Isomería Óptica (Enantiómeros):* Moléculas con átomos de carbono asimétricos o quirales (carbono con 4 sustituyentes diferentes) que rotan el plano de la luz polarizada (dextrógiras y levógiras).

### 3.5. Hidrocarburos Alifáticos: Nomenclatura y Propiedades

#### A. Alcanos o Parafinas (Hidrocarburos Saturados)
* **Fórmula General Acíclica:**

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. RESUMEN DE PROPIEDADES FÍSICAS DE HIDROCARBUROS
* Son compuestos **apolares** o de polaridad casi nula; por tanto, son insolubles en agua e hidrófobos, pero solubles en solventes orgánicos apolares (éter, benceno, cloroformo).
* Sus moléculas se mantienen unidas exclusivamente por **fuerzas de dispersión de London**.
* Al aumentar el número de carbonos (masa molar), los puntos de ebullición y fusión **aumentan progresivamente**.

"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t14_s01_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 1: Contabilizar un carbono con doble o triple enlace como primario/secundario. CUIDADO EN ADMISIÓN. La clasificación de carbonos en primarios, secundarios, terciarios y cuat\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t14_s01_c02",
                    question = "Frente al distractor frecuente de examen: \"Trampa 2: Regla de Markovnikov al revés. Recuerda: \"El rico en hidrógenos se hace más rico\". El hidrógeno siempre se une al carbono del doble enlace que ya tiene más hidrógenos.\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t14_s01_c03",
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
                    id = "quim_t14_s01_c04",
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
                    id = "quim_t14_s01_c05",
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
                    id = "quim_t14_s01_c06",
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
                    id = "quim_t14_s01_c07",
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
                    id = "quim_t14_s01_c08",
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
                    id = "quim_t14_s01_c09",
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
                    id = "quim_t14_s01_c10",
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
            id = "quim_t14_s02",
            title = "Química Orgánica, El Átomo de Carbono e Hidrocarburos - Propiedades Avanzadas, Artificios y Aplicaciones",
            theory = LessonTheory(
                title = "Química Orgánica, El Átomo de Carbono e Hidrocarburos - Propiedades Avanzadas, Artificios y Aplicaciones",
                content = """## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
  C_n H_{2n+2}
* Todos los carbonos poseen hibridación sp^3 y forman enlaces covalentes simples \sigma.
* Son poco reactivos a temperatura ambiente (baja afinidad, *parum affinis*).
* Experimentan principalmente reacciones de **combustión** y de **sustitución por radicales libres (Halogenación con Cl_2 o Br_2 bajo luz UV)**.
* **Prefijos IUPAC de Cadena:** Met (1), Et (2), Prop (3), But (4), Pent (5), Hex (6), Hept (7), Oct (8), Non (9), Dec (10), Undec (11), Dodec (12). Terminación: **-ano**.
* **Radicales Alquilo Comunes:** Metil (-CH_3), Etil (-CH_2CH_3), Isopropil (-CH(CH_3)_2), Isobutil, sec-Butil, ter-Butil (-C(CH_3)_3).

#### B. Alquenos u Olefinas (Hidrocarburos Insaturados)
* **Fórmula General con 1 Doble Enlace:**
  C_n H_{2n}
* Poseen al menos un enlace doble (1\sigma + 1\pi) con hibridación sp^2.
* Terminación: **-eno**.
* Reactividad: Reacciones de **Adición Electrofílica** (hidrogenación, halogenación, hidratación).
* **Regla de Vladimir Markovnikov (1869):** "En la adición de un halogenuro de hidrógeno (HX) o agua a un alqueno asimétrico, el átomo de hidrógeno se adiciona preferentemente al átomo de carbono del doble enlace que contiene el **mayor número de hidrógenos** (el carbono más hidrogenado)".

#### C. Alquinos o Acetilénicos (Hidrocarburos Insaturados)
* **Fórmula General con 1 Triple Enlace:**
  C_n H_{2n-2}
* Poseen al menos un enlace triple (1\sigma + 2\pi) con carbonos de hibridación sp.
* Terminación: **-ino**.
* El más representativo es el **etino o acetileno (C_2H_2)**, gas empleado en soldadura oxiacetilénica (T > 3000^\circ\text{C}).

#### D. Cicloalcanos
* Hidrocarburos saturados de cadena cerrada. Su fórmula general es idéntica a la de los alquenos acíclicos:
  C_n H_{2n} \quad (n \ge 3)
* Ciclopropano (C_3H_6, tensión angular de Baeyer de 60^\circ), Ciclobutano (C_4H_8), Ciclopentano (C_5H_{10}), Ciclohexano (C_6H_{12}, conformaciones sin tensión en silla y bote).

### 3.6. Hidrocarburos Aromáticos y el Benceno
* **Estructura del Benceno (C_6H_6, August Kekulé, 1865):**
  Anillo hexagonal plano regular con 6 átomos de carbono con hibridación sp^2 y ángulos de enlace de 120^\circ. Los 6 electrones \pi están completamente deslocalizados en una nube anular continua sobre y bajo el plano molecular (energía de resonancia de 36\text{ kcal/mol}).
* **Regla de Aromaticidad de Erich Hückel:**
  Un compuesto es aromático si es **cíclico, plano, completamente conjugado** y posee un número de electrones \pi deslocalizados que satisface:
  N^\circ \text{ electrones } \pi = 4n + 2 \quad (n = 0, 1, 2, 3\dots)
  * Para el benceno: 6 \text{ electrones } \pi \implies 4(1) + 2 = 6 (Aromático).
  * Naftaleno: 10 \text{ electrones } \pi \implies 4(2) + 2 = 10 (Aromático).
  * Antraceno / Fenantreno: 14 \text{ electrones } \pi \implies 4(3) + 2 = 14 (Aromático).
* **Reactividad:** A diferencia de los alquenos, el anillo aromático resiste fuertemente la adición y experimenta preferentemente **Sustitución Electrofílica Aromática (SEAr)**: halogenación, nitración, sulfonación, alquilación y acilación de Friedel-Crafts.
* **Bencenos Disustituidos:** Posiciones relativas:
  * Posición 1,2: **Orto (o-)**.
  * Posición 1,3: **Meta (m-)**.
  * Posición 1,4: **Para (p-)**.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
* Para dos alcanos isómeros con la misma masa molar, a mayor número de ramificaciones, la molécula se hace más compacta y esférica, disminuyendo el área de contacto molecular y **reduciendo su punto de ebullición**.

---


### 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia Hibridación del Carbono:**
  * **sp^3**: Solo enlaces simples (forma **4** direcciones \to exponente 1+3 = 4).
  * **sp^2**: Contiene **1** enlace doble (forma **3** direcciones \to exponente 1+2 = 3).
  * **sp**: Contiene **1** enlace triple o **2** dobles (forma **2** direcciones \to exponente 1+1 = 2).
* **Mnemotecnia Posiciones del Benceno:** **"O-M-P"**
  * **O**rto = Vecinos (1,2).
  * **M**eta = Saltando uno (1,3).
  * **P**ara = Opuestos extremos (1,4).

---




## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Contabilizar un carbono con doble o triple enlace como primario/secundario.** CUIDADO EN ADMISIÓN. La clasificación de carbonos en primarios, secundarios, terciarios y cuaternarios es válida y aplicable **ESTRICTAMENTE para carbonos con hibridación sp^3 (saturados)**. En carbonos con enlaces dobles o triples no se aplica esta clasificación ordinaria en preguntas oficiales.
* **Trampa 2: Regla de Markovnikov al revés.** Recuerda: "El rico en hidrógenos se hace más rico". El hidrógeno siempre se une al carbono del doble enlace que ya tiene más hidrógenos.
* **Trampa 3: Asumir que el benceno decolora rápidamente el agua de bromo.** FALSO. Los alquenos ordinarios decoloran el agua de bromo (Br_2/CCl_4) instantáneamente por adición al doble enlace. El benceno NO reacciona con agua de bromo en frío porque destruiría su estabilidad aromática; requiere catalizadores de ácido de Lewis (FeBr_3) y calor para dar sustitución.

---


"""
            ),
            challenges = listOf(
                Challenge(
                    id = "quim_t14_s02_c01",
                    question = "Frente al distractor frecuente de examen: \"Trampa 3: Asumir que el benceno decolora rápidamente el agua de bromo. FALSO. Los alquenos ordinarios decoloran el agua de bromo (Br_2/CCl_4) instantáneamente por adición al dobl\", el procedimiento analítico riguroso exige:",
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
                    id = "quim_t14_s02_c02",
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
                    id = "quim_t14_s02_c03",
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
                    id = "quim_t14_s02_c04",
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
                    id = "quim_t14_s02_c05",
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
                    id = "quim_t14_s02_c06",
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
                    id = "quim_t14_s02_c07",
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
                    id = "quim_t14_s02_c08",
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
                    id = "quim_t14_s02_c09",
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
                    id = "quim_t14_s02_c10",
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
