## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
### 3.3 Las Cuatro Formas del Condicional y sus Equivalencias
Sea la proposición original P: p \to q:
1. **Directa:** p \to q
2. **Recíproca:** q \to p (No equivalente a la directa: p \to q \not\equiv q \to p)
3. **Contraria:** \neg p \to \neg q (No equivalente a la directa)
4. **Contrarrecíproca:** \neg q \to \neg p (Totalmente equivalente: p \to q \equiv \neg q \to \neg p)

**Teorema Fundamental de la Contrarrecíproca:**
\neg q \to \neg p \equiv \neg(\neg q) \lor \neg p \equiv q \lor \neg p \equiv \neg p \lor q \equiv p \to q

### 3.4 Las Falacias Formales Condicionales

#### A. Falacia de Afirmación del Consecuente (FAC)
Consiste en pretender deducir el antecedente a partir de la verdad del consecuente:
\begin{array}{l}
p \to q \\
q \\
\hline
\therefore p \quad \text{\textbf{(INVÁLIDO / FALACIA)}}
\end{array}
*Ejemplo:* "Si llueve, la pista se moja. La pista está mojada. Por lo tanto, llovió." (Pudo haberse roto una tubería o regado la calle).

#### B. Falacia de Negación del Antecedente (FNA)
Consiste en pretender negar el consecuente al haberse negado el antecedente:
\begin{array}{l}
p \to q \\
\neg p \\
\hline
\therefore \neg q \quad \text{\textbf{(INVÁLIDO / FALACIA)}}
\end{array}
*Ejemplo:* "Si estudias en la academia, ingresas a la UNSA. No estudiaste en la academia. Por lo tanto, no ingresarás." (Pudo haber estudiado por su cuenta de forma autodidacta e ingresar en primer puesto).

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Dilema Constructivo Simple** | [(p \to q) \land (r \to q) \land (p \lor r)] \implies q | **VÁLIDO** |
| **Dilema Constructivo Complejo** | [(p \to q) \land (r \to s) \land (p \lor r)] \implies (q \lor s) | **VÁLIDO** |
| **Afirmación del Consecuente (FAC)** | [(p \to q) \land q] \to p | **FALACIA** (Contingencia) |
| **Negación del Antecedente (FNA)** | [(p \to q) \land \neg p] \to \neg q | **FALACIA** (Contingencia) |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Decodificación Quirúrgica del "SOLO SI"
En preguntas de admisión de la UNSA y UNMSM, la frase "solo si" suele confundir a los postulantes:
- Enunciado: *"A ocurrirá **solo si** ocurre B"*.
- **Regla mnemotécnica infalible:** *"El que va pegado a 'solo si' es siempre el consecuente"*.
- Simbolización directa: A \to B.
- **¡Jamás simbolices B \to A!** "Solo si" introduce la condición necesaria.

### Hack 2: La Cadena de Implicaciones (Regla del Dominó)
Cuando el examen presenta un párrafo largo con 4 o 5 condicionales:
1. Traduce cada oración a flechas: p \to q, \neg r \to \neg q, s \to p.
2. Transforma los condicionales usando contrarrecíprocas para empalmar la cadena:
   - \neg r \to \neg q \equiv q \to r
3. Ordena el tren lógico continuo:
   s \implies p \implies q \implies r
4. Toda conclusión que conecte el inicio con el final (s \to r) o sus contrarrecíprocas (\neg r \to \neg s) es **inmediatamente válida**. Las relaciones inversas son trampas.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "PO-PO vs. TO-TO"
- **PO-PO (Ponendo Ponens):** *"PO-niendo (afirmando) el antecedente, PO-ngo (afirmo) el consecuente"*.
- **TO-TO (Tollendo Tollens):** *"TO-mando (negando) el consecuente, TO-co (niego) el antecedente"*.

### Mnemotecnia 2: "La Flecha de la Necesidad" (\text{SUF} \to \text{NEC})
\text{SUFICIENTE} \implies \text{NECESARIO}
- El que está al **inicio** de la flecha es **SUFICIENTE**.
- El que recibe la **punta** de la flecha es **NECESARIO**.
- *"Basta ser arequipeño (\text{SUF}) para ser peruano (\text{NEC})"*.
- *"Es necesario ser peruano (\text{NEC}) para ser arequipeño (\text{SUF})"*.

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Consecuente Falso no implica Antecedente Falso si no hay relación causal probada**
> Si el examen te dice: *"Si Pedro estudia, aprueba. Pedro aprobó."* La tentación instintiva es marcar: *"Pedro estudió"*. ¡Esa es la opción trampa diseñada por la comisión de admisión! Pedro pudo haber copiado o tenido suerte. La respuesta correcta obligatoria es: *"No se puede concluir nada con certeza (Falacia de afirmación del consecuente)"*.

> [!CAUTION]
> **Trampa 2: La Negación de un Condicional**
> Muchos postulantes creen erróneamente que negar "Si llueve, me mojo" es "Si no llueve, no me mojo".
> **¡ERROR FATAL!** La negación de un condicional es una **conjunción**:
> \neg(p \to q) \equiv p \land \neg q
> *"Llueve y no me mojo"*.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En medicina diagnóstica, la diferencia entre condición necesaria y suficiente salva vidas. Tener el virus SARS-CoV-2 en el organismo es **condición necesaria** para desarrollar la enfermedad COVID-19 (sin el virus no hay enfermedad). Sin embargo, no es **condición suficiente** para presentar un cuadro clínico grave, pues entran en juego factores inmunológicos, edad y comorbilidades. Confundir necesidad con suficiencia en el diseño de protocolos sanitarios o en la programación de inteligencia artificial (árboles de decisión en autos autónomos) genera diagnósticos erróneos y fallos catastróficos de seguridad.

---
