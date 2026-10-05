## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
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
• n: Nivel principal (tamaño/energía)                               • Principio de Aufbau (Energía Relativa)
• l: Subnivel (forma: s, p, d, f)                                  • Principio de Exclusión de Pauli
• m_l: Orbital (orientación espacial)                               • Regla de Máxima Multiplicidad de Hund
• m_s: Spin (giro del electrón: \pm 1/2)                          • Anomalías / Antiserrucho (d^4 \to d^5, d^9 \to d^{10})
                                                                               │
         ┌─────────────────────────────────────────────────────────────────────┘
         ▼
TABLA PERIÓDICA MODERNA
• Ley Periódica Moderna (Henry Moseley): Propiedades en función creciente de Z.
• Organización: 7 Períodos (filas) y 18 Grupos / 16 Familias (columnas: A y B).
• Bloques: s, p (Representativos), d (Transición), f (Transición Interna / Tierras Raras).
• Propiedades Periódicas:
  - Crecen hacia \leftarrow \downarrow: Radio Atómico (RA), Radio Iónico, Carácter Metálico (CM).
  - Crecen hacia \rightarrow \uparrow: Electronegatividad (EN), Energía de Ionización (EI),
                                        Afinidad Electrónica (AE), Carácter No Metálico (CNM).
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. MARCO TEÓRICO RIGUROSO Y FORMALIZACIÓN

### 3.1. Números Cuánticos y Orbitales Atómicos
Derivan de la solución matemática de la ecuación de onda no relativista de Erwin Schrödinger (1926): \hat{H}\Psi = E\Psi.
Los tres primeros números cuánticos (n, l, m_l) definen al **orbital atómico** (REEMPE: Región de Espacio Energético de Manifestación Probabilística del Electrón). El cuarto número cuántico (m_s) caracteriza al electrón individual.

1. **Número Cuántico Principal (n):**
   * *Para el electrón:* Determina el nivel principal de energía y su distancia promedio al núcleo.
   * *Para el orbital:* Define el volumen efectivo o tamaño del orbital.
   * *Valores permitidos:* n \in \{1, 2, 3, 4, 5, 6, 7, \dots, \infty\} o capas \{K, L, M, N, O, P, Q\}.
   * *Capacidad máxima:* 2n^2 electrones por nivel; n^2 orbitales por nivel.
2. **Número Cuántico Secundario o Azimutal (l):**
   * *Para el electrón:* Determina el subnivel de energía donde se halla.
   * *Para el orbital:* Define la forma geométrica o simetría espacial de la nube electrónica.
   * *Valores permitidos:* l \in \{0, 1, 2, \dots, n-1\}.
   * *Subniveles:*
     * l = 0 (s - Sharp): Esférico. Contiene 1 orbital (2e^- máx).
     * l = 1 (p - Principal): Dilobular o bilobular. Contiene 3 orbitales: p_x, p_y, p_z (6e^- máx).
     * l = 2 (d - Diffuse): Tetralobular (salvo d_{z^2} que es bilobular con toroide anular). Contiene 5 orbitales (10e^- máx).
     * l = 3 (f - Fundamental): Octalobular / compleja. Contiene 7 orbitales (14e^- máx).
   * *Capacidad máxima del subnivel:* 2(2l + 1) electrones; (2l + 1) orbitales.
3. **Número Cuántico Magnético (m_l o m):**
   * Determina la orientación espacial tridimensional del orbital bajo un campo magnético externo.
   * *Valores permitidos:* m_l \in \{-l, \dots, 0, \dots, +l\}.
4. **Número Cuántico de Spin Magnético (m_s o s):**
   * Introducido empíricamente por Uhlenbeck y Goudsmit (y fundamentado por Paul Dirac).
   * Describe el momento intrínseco de giro angular y campo magnético propio del electrón.
   * *Valores permitidos:* m_s \in \{+1/2, -1/2\} (antiparalelos).

### 3.2. Principios de la Configuración Electrónica
1. **Principio de Aufbau (Construcción Progresiva):**
   Los electrones se ubican de menor a mayor contenido de **Energía Relativa (E_R)**:
   E_R = n + l
   * Si dos o más subniveles tienen la misma E_R (subniveles *degenerados*), es más estable el que tiene menor nivel principal n.
   * *Secuencia Nemotécnica del Serrucho:*
     1s^2 \to 2s^2 \to 2p^6 \to 3s^2 \to 3p^6 \to 4s^2 \to 3d^{10} \to 4p^6 \to 5s^2 \to 4d^{10} \to 5p^6 \to 6s^2 \to 4f^{14} \to 5d^{10} \to 6p^6 \to 7s^2 \to 5f^{14} \to 6d^{10} \to 7p^6
2. **Principio de Exclusión de Wolfgang Pauli (1925):**
   En un mismo átomo no pueden existir dos electrones con sus cuatro números cuánticos idénticos. Como mínimo deben diferir en el spin (m_s).
   * *Consecuencia:* Un orbital atómico puede albergar como máximo a 2 electrones con espines opuestos (apareados).
3. **Regla de Máxima Multiplicidad de Friedrich Hund:**
   Al llenar orbitales de un mismo subnivel degenerado, los electrones ocupan primero el mayor número posible de orbitales con espines paralelos (m_s = +1/2), y solo se aparean cuando todos los orbitales contienen ya un electrón (desapareado / semilleno).
4. **Casos Especiales de Inestabilidad (Anomalías / Antiserrucho):**
   Las configuraciones que culminan en ns^2 (n-1)d^4 o ns^2 (n-1)d^9 son energéticamente inestables. Un electrón del orbital s salta espontáneamente al orbital d para adquirir mayor estabilidad por simetría esférica de subnivel semilleno (d^5) o lleno (d^{10}):
   * Grupo VIB (Cr, Mo):
     _{24}Cr: [Ar] 4s^2 3d^4 \text{ (Inestable)} \implies [Ar] 4s^1 3d^5 \text{ (Real)}

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. RESUMEN DE VARIACIÓN PERIÓDICA
\begin{array}{|c|c|c|}
\hline
\textbf{Propiedad} & \textbf{En un Grupo (Vertical)} & \textbf{En un Período (Horizontal)} \\
\hline
\text{Radio Atómico } (RA) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\
\text{Carácter Metálico } (CM) & \text{Aumenta hacia abajo } (\downarrow) & \text{Aumenta hacia la izquierda } (\leftarrow) \\
