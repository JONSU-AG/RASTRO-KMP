# TEMA 04: Estructura Electrónica y Tabla Periódica Moderna

---

## 1. FICHA TÉCNICA DEL TEMA
* **Eje Temático:** 04 - Ciencia y Tecnología
* **Área Disciplinar:** Mecánica Cuántica Química y Periodicidad
* **Ponderación Oficial UNSA (Resolución N.° 0028-2026):**
  * *Área 1 (Ingenierías):* 1.425411425 pts/pregunta (Examen: 6 preguntas)
  * *Área 2 (Biomédicas):* 1.684740000 pts/pregunta (Examen: 6 preguntas) — **MÁXIMA PRIORIDAD**
  * *Área 3 (Sociales):* 1.109300781 pts/pregunta (Examen: 3 preguntas)
* **Nivel de Dificultad Teórica:** Medio - Alto (Números cuánticos, excepciones Aufbau, periodicidad)
* **Nivel de Recurrencia en Exámenes (UNSA / CEPRUNSA / UNMSM / UNI):** 9.8 / 10 (Imprescindible en todo examen de admisión)

---

## 2. MAPA CONCEPTUAL Y ÁRBOL DE CONTENIDOS
```
                         ESTRUCTURA ELECTRÓNICA Y TABLA PERIÓDICA
                                            │
         ┌──────────────────────────────────┴──────────────────────────────────┐
         ▼                                                                     ▼
NÚMEROS CUÁNTICOS (4)                                                 CONFIGURACIÓN ELECTRÓNICA
• $n$: Nivel principal (tamaño/energía)                               • Principio de Aufbau (Energía Relativa)
• $l$: Subnivel (forma: $s, p, d, f$)                                  • Principio de Exclusión de Pauli
• $m_l$: Orbital (orientación espacial)                               • Regla de Máxima Multiplicidad de Hund
• $m_s$: Spin (giro del electrón: $\pm 1/2$)                          • Anomalías / Antiserrucho ($d^4 \to d^5, d^9 \to d^{10}$)
                                                                               │
         ┌─────────────────────────────────────────────────────────────────────┘
         ▼
TABLA PERIÓDICA MODERNA
• Ley Periódica Moderna (Henry Moseley): Propiedades en función creciente de $Z$.
• Organización: 7 Períodos (filas) y 18 Grupos / 16 Familias (columnas: A y B).
• Bloques: $s, p$ (Representativos), $d$ (Transición), $f$ (Transición Interna / Tierras Raras).
• Propiedades Periódicas:
  - Crecen hacia $\leftarrow \downarrow$: Radio Atómico ($RA$), Radio Iónico, Carácter Metálico ($CM$).
  - Crecen hacia $\rightarrow \uparrow$: Electronegatividad ($EN$), Energía de Ionización ($EI$),
                                        Afinidad Electrónica ($AE$), Carácter No Metálico ($CNM$).
```

---

## 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Números Cuánticos y Orbitales Atómicos
Derivan de la solución matemática de la ecuación de onda no relativista de Erwin Schrödinger (1926): $\hat{H}\Psi = E\Psi$.
Los tres primeros números cuánticos ($n, l, m_l$) definen al **orbital atómico** (REEMPE: Región de Espacio Energético de Manifestación Probabilística del Electrón). El cuarto número cuántico ($m_s$) caracteriza al electrón individual.

1. **Número Cuántico Principal ($n$):**
   * *Para el electrón:* Determina el nivel principal de energía y su distancia promedio al núcleo.
   * *Para el orbital:* Define el volumen efectivo o tamaño del orbital.
   * *Valores permitidos:* $n \in \{1, 2, 3, 4, 5, 6, 7, \dots, \infty\}$ o capas $\{K, L, M, N, O, P, Q\}$.
   * *Capacidad máxima:* $2n^2$ electrones por nivel; $n^2$ orbitales por nivel.
2. **Número Cuántico Secundario o Azimutal ($l$):**
   * *Para el electrón:* Determina el subnivel de energía donde se halla.
   * *Para el orbital:* Define la forma geométrica o simetría espacial de la nube electrónica.
   * *Valores permitidos:* $l \in \{0, 1, 2, \dots, n-1\}$.
   * *Subniveles:*
     * $l = 0$ ($s$ - Sharp): Esférico. Contiene 1 orbital ($2e^-$ máx).
     * $l = 1$ ($p$ - Principal): Dilobular o bilobular. Contiene 3 orbitales: $p_x, p_y, p_z$ ($6e^-$ máx).
     * $l = 2$ ($d$ - Diffuse): Tetralobular (salvo $d_{z^2}$ que es bilobular con toroide anular). Contiene 5 orbitales ($10e^-$ máx).
     * $l = 3$ ($f$ - Fundamental): Octalobular / compleja. Contiene 7 orbitales ($14e^-$ máx).
   * *Capacidad máxima del subnivel:* $2(2l + 1)$ electrones; $(2l + 1)$ orbitales.
3. **Número Cuántico Magnético ($m_l$ o $m$):**
   * Determina la orientación espacial tridimensional del orbital bajo un campo magnético externo.
   * *Valores permitidos:* $m_l \in \{-l, \dots, 0, \dots, +l\}$.
4. **Número Cuántico de Spin Magnético ($m_s$ o $s$):**
   * Introducido empíricamente por Uhlenbeck y Goudsmit (y fundamentado por Paul Dirac).
   * Describe el momento intrínseco de giro angular y campo magnético propio del electrón.
   * *Valores permitidos:* $m_s \in \{+1/2, -1/2\}$ (antiparalelos).

### 3.2. Principios de la Configuración Electrónica
1. **Principio de Aufbau (Construcción Progresiva):**
   Los electrones se ubican de menor a mayor contenido de **Energía Relativa ($E_R$)**:
   $$E_R = n + l$$
   * Si dos o más subniveles tienen la misma $E_R$ (subniveles *degenerados*), es más estable el que tiene menor nivel principal $n$.
   * *Secuencia Nemotécnica del Serrucho:*
     $$1s^2 \to 2s^2 \to 2p^6 \to 3s^2 \to 3p^6 \to 4s^2 \to 3d^{10} \to 4p^6 \to 5s^2 \to 4d^{10} \to 5p^6 \to 6s^2 \to 4f^{14} \to 5d^{10} \to 6p^6 \to 7s^2 \to 5f^{14} \to 6d^{10} \to 7p^6$$
2. **Principio de Exclusión de Wolfgang Pauli (1925):**
   En un mismo átomo no pueden existir dos electrones con sus cuatro números cuánticos idénticos. Como mínimo deben diferir en el spin ($m_s$).
   * *Consecuencia:* Un orbital atómico puede albergar como máximo a 2 electrones con espines opuestos (apareados).
3. **Regla de Máxima Multiplicidad de Friedrich Hund:**
   Al llenar orbitales de un mismo subnivel degenerado, los electrones ocupan primero el mayor número posible de orbitales con espines paralelos ($m_s = +1/2$), y solo se aparean cuando todos los orbitales contienen ya un electrón (desapareado / semilleno).
4. **Casos Especiales de Inestabilidad (Anomalías / Antiserrucho):**
   Las configuraciones que culminan en $ns^2 (n-1)d^4$ o $ns^2 (n-1)d^9$ son energéticamente inestables. Un electrón del orbital $s$ salta espontáneamente al orbital $d$ para adquirir mayor estabilidad por simetría esférica de subnivel semilleno ($d^5$) o lleno ($d^{10}$):
   * Grupo VIB ($Cr, Mo$):
     $$_{24}Cr: [Ar] 4s^2 3d^4 \text{ (Inestable)} \implies [Ar] 4s^1 3d^5 \text{ (Real)}$$
   * Grupo IB ($Cu, Ag, Au$):
     $$_{29}Cu: [Ar] 4s^2 3d^9 \text{ (Inestable)} \implies [Ar] 4s^1 3d^{10} \text{ (Real)}$$

### 3.3. Configuración Electrónica de Iones
* **Para un Anión ($X^{q-}$):** Se halla el número total de electrones ($Z + q$) y se distribuye normalmente con el serrucho.
* **Para un Catión ($X^{q+}$):** ¡CUIDADO EXAMEN!
  1. Primero se realiza la configuración electrónica del átomo neutro ($Z$).
  2. Luego se retiran los $q$ electrones comenzando estrictamente por el **nivel más externo** (mayor $n$), y si este se vacía, del subnivel inmediato de mayor energía.
  * *Ejemplo:* $^{26}Fe \to [Ar] 4s^2 3d^6$. Para $^{26}Fe^{3+}$, se pierden primero los dos electrones de $4s$ y luego uno de $3d$: $^{26}Fe^{3+} \to [Ar] 3d^5$.

### 3.4. Tabla Periódica Moderna y Clasificación
* **Ley Periódica Moderna (Henry Moseley, 1913):** "Las propiedades físicas y químicas de los elementos químicos son funciones periódicas de sus números atómicos crecientes ($Z$)".
* **Diseño Estructural (Alfred Werner):**
  * **7 Períodos (Filas horizontales):** Coinciden con el número cuántico principal más alto del nivel ocupado ($n_{\text{máx}}$).
  * **18 Columnas / Grupos:**
    * **Elementos Representativos (Grupo A / Bloques $s$ y $p$):** Terminan en $s$ o $p$.
      * IA (Alcalinos): $ns^1$ (valencia +1)
      * IIA (Alcalinotérreos): $ns^2$ (valencia +2)
      * IIIA (Boroideos o Térreos): $ns^2 np^1$
      * IVA (Carbonoideos): $ns^2 np^2$
      * VA (Nitrogenoideos): $ns^2 np^3$
      * VIA (Calcógenos o Anfígenos): $ns^2 np^4$
      * VIIA (Halógenos): $ns^2 np^5$
      * VIIIA (Gases Nobles): $ns^2 np^6$ (salvo $He: 1s^2$)
    * **Elementos de Transición (Grupo B / Bloque $d$):** Terminan en $ns^2 (n-1)d^x$. Su grupo es $(2 + x)$. Si la suma es 8, 9 o 10 pertenecen al grupo VIIIB ($Fe, Co, Ni$). Si suma 11 es IB, si suma 12 es IIB.
    * **Elementos de Transición Interna (Bloque $f$):** Lantánidos ($4f$) y Actínidos ($5f$). Pertenecen formalmente al grupo IIIB.

### 3.5. Propiedades Periódicas Fundamentales
1. **Radio Atómico ($RA$):** Mitad de la distancia internuclear entre dos átomos idénticos unidos por enlace covalente simple.
   * En un período: aumenta hacia la izquierda ($\leftarrow$) por disminución de la Carga Nuclear Efectiva ($Z_{\text{ef}}$).
   * En un grupo: aumenta hacia abajo ($\downarrow$) por aumento del número de capas ($n$).
2. **Radio Iónico ($RI$):**
   * Para una misma especie: $RI(\text{anión}) > RA(\text{neutro}) > RI(\text{catión})$.
   * Para especies isoelectrónicas: A mayor carga nuclear ($Z$), menor radio iónico (más atracción nuclear):
     $$_{7}N^{3-} > \, _{8}O^{2-} > \, _{9}F^- > \, _{11}Na^+ > \, _{12}Mg^{2+} > \, _{13}Al^{3+}$$
3. **Energía o Potencial de Ionización ($EI$):** Energía mínima requerida para arrancar el electrón más externo de un átomo o ión en estado gaseoso fundamental:
   $$X_{(g)} + EI_1 \to X^+_{(g)} + 1e^- \quad (EI_1 < EI_2 < EI_3 \dots)$$
   * Aumenta hacia arriba y a la derecha ($\rightarrow \uparrow$). Máximo en los Gases Nobles (Helio).
4. **Electronegatividad ($EN$):** Capacidad de un átomo enlazado en una molécula para atraer hacia sí el par de electrones compartidos (Escala de Linus Pauling: Flúor = 4.0 [máximo]; Francio y Cesio = 0.7 [mínimos]).
   * Aumenta hacia arriba y a la derecha ($\rightarrow \uparrow$).
5. **Afinidad Electrónica ($AE$):** Energía liberada o absorbida cuando un átomo gaseoso neutro en estado basal captura un electrón para formar un anión monovalente:
   $$X_{(g)} + 1e^- \to X^-_{(g)} + AE$$
   * Aumenta hacia arriba y a la derecha ($\rightarrow \uparrow$). El Cloro posee la mayor afinidad electrónica exotérmica.

---

## 4. RESUMEN DE VARIACIÓN PERIÓDICA
$$\begin{array}{|c|c|c|}
\hline
\textbf{Propiedad} & \textbf{En un Grupo (Vertical)} & \textbf{En un Período (Horizontal)} \\
\hline
\text{Radio Atómico } (RA) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\
\text{Carácter Metálico } (CM) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\
\text{Electronegatividad } (EN) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\text{Energía de Ionización } (EI) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\text{Afinidad Electrónica } (AE) & \text{Aumenta hacia arriba } (\uparrow) & \text{Aumenta hacia la derecha } (\rightarrow) \\
\hline
\end{array}$$

---

## 5. ERRORES FRECUENTES Y TRAMPAS DE ADMISIÓN
* **Trampa 1: Quitar electrones del subnivel $d$ antes del $s$ en cationes.** En el $^{28}Ni^{2+}$, jamás retires electrones de $3d^8$ antes de agotar el $4s^2$. La configuración correcta de $^{28}Ni^{2+}$ es $[Ar] 3d^8$ y NO $[Ar] 4s^2 3d^6$.
* **Trampa 2: Creer que el Flúor tiene mayor afinidad electrónica que el Cloro.** FALSO. Aunque el Flúor es el más electronegativo, debido al tamaño extraordinariamente pequeño de su orbital $2p$, la densidad electrónica genera fuerte repulsión al nuevo electrón. Por ello, el **Cloro ($Cl$)** tiene la mayor afinidad electrónica neta liberada del sistema periódico.
* **Trampa 3: "La Tabla Periódica de Mendeleiev se basó en el número atómico".** FALSO. Mendeleiev y Meyer la ordenaron en función de la **masa atómica creciente**, lo que generó anomalías como el par $Te-I$ o $Co-Ni$. Fue Henry Moseley quien demostró que la periodicidad se debe al número atómico ($Z$).

---

## 6. HACKING Y REGLAS MNEMOTÉCNICAS
* **Mnemotecnia del Serrucho:**
  * **"Sí, Sopa Sopa, Se Da Pensión, Se Da Pensión, Se Fue De Paseo, Se Fue De Paseo"**
  * $1s \mid 2s \ 2p \mid 3s \ 3p \mid 4s \ 3d \ 4p \mid 5s \ 4d \ 5p \mid 6s \ 4f \ 5d \ 6p \mid 7s \ 5f \ 6d \ 7p$.
* **Mnemotecnia de los Gases Nobles para Kernel de Configuración:**
  * **He**lio (2), **Ne**ón (10), **Ar**gón (18), **Kr**iptón (36), **Xe**nón (54), **Ra**dón (86).
  * *"Helena Negra Ardiente Quiere Cero Rayas"*.
* **Mnemotecnia de Flechas Periódicas:**
  * Las que tienen prefijo "E" o "A" (**E**lectronegatividad, **E**nergía de ionización, **A**finidad electrónica) crecen hacia el **Extremo Arriba-Derecha** ($\nearrow$).
  * El **R**adio atómico y carácter metálico crecen hacia el **R**incón Abajo-Izquierda ($\swarrow$).

---

## 7. PROBLEMAS RESUELTOS Y COMENTADOS

### Problema 1 (Nivel Básico - Números Cuánticos Válidos)
Determine cuál de los siguientes juegos de cuatro números cuánticos $(n, l, m_l, m_s)$ es físicamente posible para un electrón en el estado fundamental de un átomo:
a) $(3, 3, -1, +1/2)$
b) $(4, 2, -3, -1/2)$
c) $(2, 1, 0, -1/2)$
d) $(3, 1, +2, +1/2)$

* **Resolución:**
  Analizamos las reglas cuánticas: $n \ge 1$; $0 \le l \le n-1$; $-l \le m_l \le +l$; $m_s = \pm 1/2$.
  * a) $(3, 3, -1, +1/2)$: Incorrecto, si $n=3$, $l$ como máximo puede ser $n-1 = 2$. No existe $l=3$.
  * b) $(4, 2, -3, -1/2)$: Incorrecto, si $l=2$, $m_l$ solo puede tomar valores desde $-2$ hasta $+2$. No puede ser $-3$.
  * c) $(2, 1, 0, -1/2)$: Correcto, $n=2$, $l=1$ ($p$), $m_l=0$ (está en $[-1, +1]$) y $m_s = -1/2$. Corresponde a un electrón en $2p$.
  * d) $(3, 1, +2, +1/2)$: Incorrecto, para $l=1$, $m_l$ solo puede ser $-1, 0, +1$. No puede ser $+2$.
* **Respuesta:** El juego c) $(2, 1, 0, -1/2)$.

---

### Problema 2 (Nivel Intermedio - Ubicación en la Tabla Periódica)
Un átomo neutro posee 17 orbitales apareados y 1 orbital semilleno en su estructura electrónica. Determine su número atómico ($Z$), el período y el grupo al que pertenece en la Tabla Periódica Moderna.

* **Resolución:**
  1. Contabilizamos orbitales y electrones:
     * 17 orbitales apareados contienen: $17 \times 2 = 34\text{ electrones}$.
     * 1 orbital semilleno contiene: $1\text{ electrón}$.
     * Total de electrones: $34 + 1 = 35\text{ electrones}$.
  2. Como es átomo neutro: $Z = 35$ (Bromo).
  3. Realizamos la configuración electrónica:
     $$1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^{10} 4p^5$$
     * Verificación de orbitales:
       $s$ (4 orbitales: $1s, 2s, 3s, 4s$) $\to 4$ llenos.
       $p$ (6 orbitales llenos: $2p^6, 3p^6$ y en $4p^5$ hay 2 llenos y 1 semilleno) $\to 8$ llenos, 1 semilleno.
       $d$ (5 orbitales llenos: $3d^{10}$) $\to 5$ llenos.
       Total llenos: $4 + 8 + 5 = 17$ orbitales apareados. Cumple rigurosamente.
  4. Período y Grupo:
     * Nivel más alto: $n = 4 \implies \textbf{Período 4}$.
     * Electrones de valencia: $4s^2 4p^5 \implies 2 + 5 = 7$ electrones de valencia.
     * Termina en bloque $p \implies \textbf{Grupo VIIA (Grupo 17 - Halógenos)}$.
* **Respuesta:** $Z = 35$, Período 4, Grupo VIIA (17).

---

### Problema 3 (Nivel Intermedio - Números Cuánticos del Último Electrón)
Determine los cuatro números cuánticos del último electrón configurado para el ión férrico ($_{26}Fe^{3+}$).

* **Resolución:**
  1. Configuración del átomo neutro $_{26}Fe$:
     $$_{26}Fe: 1s^2 2s^2 2p^6 3s^2 3p^6 4s^2 3d^6 = [Ar] 4s^2 3d^6$$
  2. Formación del catión trivalente $Fe^{3+}$ (pierde 3 electrones):
     * Primero pierde los $2$ electrones del nivel exterior ($4s^2$): queda $[Ar] 3d^6$.
     * Luego pierde $1$ electrón del subnivel $3d^6$: queda $[Ar] 3d^5$.
     $$_{26}Fe^{3+}: [Ar] 3d^5$$
  3. Llenado del subnivel $3d^5$ por Regla de Hund:
     $l = 2$ (5 orbitales: $m_l \in \{-2, -1, 0, +1, +2\}$).
     * $e_1 \to m_l = -2 \ (\uparrow)$
     * $e_2 \to m_l = -1 \ (\uparrow)$
     * $e_3 \to m_l = 0 \ (\uparrow)$
     * $e_4 \to m_l = +1 \ (\uparrow)$
     * $e_5 \to m_l = +2 \ (\uparrow)$ (este es el último electrón configurado).
  4. Asignación de números cuánticos para $e_5$:
     * $n = 3$
     * $l = 2$ ($d$)
     * $m_l = +2$
     * $m_s = +1/2$ (hacia arriba)
* **Respuesta:** $(3, 2, +2, +1/2)$.

---

### Problema 4 (Nivel Avanzado - Comparación de Radios Iónicos y Propiedades)
Dadas las siguientes especies químicas: $_{8}O^{2-}$, $_{9}F^-$, $_{11}Na^+$, $_{12}Mg^{2+}$, ordénelas de forma estrictamente decreciente según su radio iónico y justifique físicamente el comportamiento de su energía de ionización.

* **Resolución:**
  1. Determinamos el número de electrones de cada especie:
     * $_{8}O^{2-}: 8 - (-2) = 10e^-$
     * $_{9}F^-: 9 - (-1) = 10e^-$
     * $_{11}Na^+: 11 - (+1) = 10e^-$
     * $_{12}Mg^{2+}: 12 - (+2) = 10e^-$
     Todas son especies **isoelectrónicas** con configuración $[Ne] = 1s^2 2s^2 2p^6$.
  2. Criterio de Radio Iónico para isoelectrónicos:
     A menor número atómico ($Z$), menor es la carga nuclear positiva que atrae a los 10 electrones, por lo que la nube electrónica se expande.
     $$Z: O (8) < F (9) < Na (11) < Mg (12)$$
     Por ende, el orden decreciente de tamaño iónico es:
     $$O^{2-} > F^- > Na^+ > Mg^{2+}$$
  3. Justificación: El núcleo de magnesio ($12p^+$) ejerce una fuerza coulómbica atractiva sobre los 10 electrones mucho más intensa que el núcleo de oxígeno ($8p^+$), comprimiendo los orbitales.
* **Respuesta:** Radio decreciente: $O^{2-} > F^- > Na^+ > Mg^{2+}$.

---

### Problema 5 (Nivel Reto UNSA / UNI - Antiserrucho y Electrones Desapareados)
Un catión divalente $X^{2+}$ tiene en su configuración electrónica 4 orbitales semillenos y pertenece al cuarto período de la tabla periódica. Si además el átomo neutro $X$ presentó una anomalía en su distribución electrónica basal (antiserrucho), determine el número de nucleones de $X$ sabiendo que posee 30 neutrones.

* **Resolución:**
  1. Los elementos del cuarto período con anomalía antiserrucho son el Cromo ($_{24}Cr: [Ar] 4s^1 3d^5$) y el Cobre ($_{29}Cu: [Ar] 4s^1 3d^{10}$).
  2. Probemos con el Cromo ($Z = 24$):
     * Neutro: $_{24}Cr \to [Ar] 4s^1 3d^5$.
     * Catión divalente $Cr^{2+}$: pierde 2 electrones (1 de $4s$ y 1 de $3d$).
       $$Cr^{2+}: [Ar] 3d^4$$
     * Distribución en los 5 orbitales de $3d$ por regla de Hund:
       $(\uparrow)(\uparrow)(\uparrow)(\uparrow)(\_)$
       Tiene exactamente **4 orbitales semillenos** y 1 vacío. ¡Cumple perfectamente con el enunciado!
  3. Probemos con el Cobre ($Z = 29$) para verificar:
     * Neutro: $_{29}Cu \to [Ar] 4s^1 3d^{10}$.
     * Catión divalente $Cu^{2+}$: pierde 1 de $4s$ y 1 de $3d$ $\implies [Ar] 3d^9$.
     * En $3d^9$ tiene 4 orbitales llenos y solo **1 orbital semilleno** (no cumple).
  4. Por tanto, el elemento es el Cromo ($Z = 24$).
  5. Cálculo del número de nucleones ($A$):
     $$A = Z + n = 24 + 30 = 54$$
* **Respuesta:** $Z = 24$ y posee 54 nucleones fundamentales.

---

## 8. GLOSARIO DE TÉRMINOS CLAVE (10 TÉRMINOS)
1. **Orbital Atómico (REEMPE):** Región tridimensional del espacio perinuclear donde existe la máxima probabilidad ($\ge 90\%$) de encontrar al electrón.
2. **Principio de Aufbau:** Criterio termodinámico según el cual los electrones llenan orbitales en orden creciente de energía relativa ($n + l$).
3. **Regla de Hund:** Disposición electrónica en la cual los electrones maximizan el spin total ocupando orbitales degenerados individualmente antes del apareamiento.
4. **Electronegatividad:** Medida relativa del poder de un átomo para atraer densidad electrónica hacia sí en un enlace químico.
5. **Energía de Ionización:** Energía mínima requerida para separar el electrón menos retenido de un átomo gaseoso aislado en su estado basal.
6. **Radio Atómico:** Mitad de la distancia internuclear entre dos núcleos adyacentes de átomos enlazados homogéneamente.
7. **Carga Nuclear Efectiva ($Z_{\text{ef}}$):** Carga nuclear neta positiva que experimenta un electrón exterior debido al apantallamiento de los electrones internos.
8. **Anomalía Antiserrucho:** Transición espontánea de un electrón del orbital $s$ al $d$ para adquirir configuraciones de mayor simetría y estabilidad ($d^5$ o $d^{10}$).
9. **Diamagnetismo:** Propiedad de las sustancias donde todos sus electrones están apareados, siendo repelidas débilmente por campos magnéticos.
10. **Paramagnetismo:** Fenómeno característico de especies con electrones desapareados, manifestando atracción ante un campo magnético externo.

---

## 9. FLASHCARDS
* **Front:** ¿Qué forma geométrica poseen los orbitales correspondientes a $l=0$ y $l=1$?
  * **Back:** $l=0$ ($s$): forma esférica. $l=1$ ($p$): forma dilobular orientada según los ejes cartesianos ($p_x, p_y, p_z$).
* **Front:** ¿Por qué la configuración real del cromo ($Z=24$) no es $[Ar]4s^2 3d^4$?
  * **Back:** Por el principio de semilleno (antiserrucho); la configuración $[Ar]4s^1 3d^5$ otorga una simetría esférica que minimiza la repulsión interelectrónica y maximiza el canje cuántico.
* **Front:** ¿Cómo se define el elemento con mayor carácter no metálico y mayor electronegatividad?
  * **Back:** El Flúor ($F$, $EN = 4.0$). Crecen hacia la esquina superior derecha del sistema periódico.
* **Front:** Para ordenar radios iónicos de iones isoelectrónicos, ¿cuál es la regla fundamental?
  * **Back:** A mayor número de protones ($Z$), mayor atracción nuclear y menor radio iónico: $Anión > Neutro > Catión$.
* **Front:** ¿Cuál es la diferencia entre una sustancia paramagnética y una diamagnética?
  * **Back:** Paramagnética posee al menos un electrón desapareado (atraída por imanes); diamagnética posee todos sus electrones apareados (levemente repelida por imanes).

---

## 10. GAMIFICACIÓN Y BLOQUE KMP (JSON)
```json
{
  "tema_id": "QUI_04",
  "titulo": "Estructura Electrónica y Tabla Periódica Moderna",
  "dificultad": "Avanzado",
  "preguntas": [
    {
      "id": "q1",
      "pregunta": "¿Cuál es la energía relativa del subnivel 4d?",
      "opciones": ["4", "5", "6", "7"],
      "respuesta_correcta": 2,
      "retroalimentacion": "Er = n + l. Para 4d, n = 4 y l = 2, por lo que Er = 4 + 2 = 6."
    },
    {
      "id": "q2",
      "pregunta": "Un elemento químico finaliza su configuración en 3p4. ¿A qué grupo y período pertenece?",
      "opciones": ["Período 3, Grupo IVA", "Período 3, Grupo VIA (16)", "Período 4, Grupo IIIA", "Período 3, Grupo IIA"],
      "respuesta_correcta": 1,
      "retroalimentacion": "El nivel más alto es n = 3 (Período 3). Los electrones de valencia en 3s2 3p4 son 2 + 4 = 6 (Grupo VIA o 16, anfígenos)."
    },
    {
      "id": "q3",
      "pregunta": "¿Qué elemento tiene la mayor afinidad electrónica liberada en la tabla periódica?",
      "opciones": ["Flúor", "Oxígeno", "Cloro", "Helio"],
      "respuesta_correcta": 2,
      "retroalimentacion": "El Cloro posee la mayor afinidad electrónica exotérmica debido a la menor repulsión electrónica en su orbital 3p comparado con el 2p del Flúor."
    }
  ]
}
```
