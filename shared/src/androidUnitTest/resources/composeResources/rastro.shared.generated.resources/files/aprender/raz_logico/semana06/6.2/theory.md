## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
2. \neg P (Premisa)
3. P \lor Q (Adición sobre 1)
4. Q (Silogismo Disyuntivo entre 2 y 3)

Por ello, un sistema inconsistente carece de valor cognoscitivo en el examen de admisión: si se admite una contradicción, todo se vuelve trivialmente deducible.

### 3.3 Coherencia Lógica vs. Verdad Fáctica
- **Verdad fáctica:** Correspondencia empírica entre el enunciado y el mundo real.
- **Coherencia lógica:** Ausencia de contradicción interna y articulación deductiva entre las partes de un discurso. Un argumento sobre dragones y elfos puede ser perfectamente coherente y consistente sin ser fácticamente verdadero.

### 3.4 Clasificación de Incompatibilidades
1. **Incompatibilidad Contradictoria:** Oposición estricta (A y \neg A). No pueden ser ambas verdaderas ni ambas falsas al mismo tiempo.
2. **Incompatibilidad Contraria:** Dos proposiciones no pueden ser ambas verdaderas, pero sí pueden ser ambas falsas (ejemplo: "Esta pelota es completamente roja" y "Esta pelota es completamente verde").
3. **Incompatibilidad Condicional:** Un conjunto donde una regla condicional choca con hechos afirmados: \{p \to q, \, p, \, \neg q\}.

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Equivalencia Coherente** | P \iff Q \equiv (P \land Q) \lor (\neg P \land \neg Q) | Ambos dicen la verdad o ambos mienten al unísono. |
| **Contradicción Clásica** | P \oplus Q \equiv (P \land \neg Q) \lor (\neg P \land Q) | Exactamente uno de los dos dice la verdad (clave en culpables). |
| **Consistencia con Hipótesis** | \Gamma \cup \{H\} \not\vdash \bot | Asumir que sospechoso X es culpable no genera absurdos. |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Método del "Testigo Contradictorio" (Aislamiento de la Falsa Duda)
En problemas del tipo: *"Cuatro sospechosos declaran. Tres dicen la verdad y uno miente. ¿Quién es el culpable?"*:
1. Identifica inmediatamente a los dos declarantes que se contradicen mutuamente.
2. Como se contradicen, **uno de ellos es el mentiroso y el otro dice la verdad**.
3. **Conclusión automática:** Los otros dos declarantes restantes **dicen la verdad con 100% de certeza absoluta**.
4. Usa las declaraciones de esos dos declarantes verídicos para resolver el caso al instante, sin necesidad de probar casos uno por uno.

### Hack 2: Matriz de Asignación Booleana Rápida (Consistencia Tabular)
Cuando haya 3 o 4 proposiciones condicionadas complejas, crea una mini-tabla de columnas: *Hipótesis*, *Consecuencias*, *¿Choque?*:
- Si Hipótesis genera \mathbf{V} \land \mathbf{F}, anula la rama (Poda Lógica).
- La rama sin choque es la **única solución consistente**.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "El Ojo del Cíclope" (\text{C-O-N-T-R-A})
Para cazar contradicciones en problemas de testimonios cruzados:
- **C**oteja: Lee todos los testimonios de corrido.
- **O**puestos: Busca dos personajes que digan exactamente lo contrario (P vs. \neg P).
- **N**úcleo: La contradicción absorbe una verdad y una falsedad (si uno miente, el otro dice la verdad).
- **T**erceros: Analiza a los demás personajes, cuyos estados ahora son estables.
- **R**esuelve: Aplica el dato del problema (ejemplo: "solo uno dice la verdad").
- **A**segura: Verifica que el caso no genere paradojas secundarias.

### Mnemotecnia 2: "Los 3 Pilares de Aristóteles"
Para evaluar consistencia de un texto o sistema:
1. **IDENTIDAD:** Lo que es verdadero, es verdadero (A = A).
2. **NO CONTRADICCIÓN:** Nada puede ser y no ser al mismo tiempo (\neg(A \land \neg A)).
3. **TERCERO EXCLUIDO:** Una proposición o es verdadera o es falsa, no hay término medio (A \lor \neg A).

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: Confundir Contrarias con Contradictorias**
> - Proposiciones contradictorias: "Juan llegó a las 8:00" vs "Juan no llegó a las 8:00". Una es V y la otra F obligatoriamente.
> - Proposiciones contrarias: "El auto es rojo" vs "El auto es azul". ¡Ambas pueden ser falsas si el auto es blanco! Asumir que una es verdadera porque la otra es falsa es un error gravísimo de admisión.

> [!CAUTION]
> **Trampa 2: La Paradoja del Mentiroso encubierta**
> En enunciados del tipo: *"El habitante de la isla dice: Todos los de mi isla siempre mienten"*. No asumas que es una simple proposición inconsistente; analiza el metalenguaje: si fuera verdadera, se vuelve falsa; si fuera falsa, no todos mienten, lo cual es perfectamente consistente en la realidad (algunos mienten y otros no).

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

En auditoría de sistemas informáticos, seguridad de software de misión crítica (como los cohetes aeroespaciales de la NASA o el piloto automático de Tesla) y en el derecho procesal penal, la **consistencia lógica** es la base de los motores formales de verificación (*SAT Solvers* como Z3). Un fiscal o juez no busca únicamente pruebas físicas; busca en el expediente la consistencia testimonial: si un testigo incurre en una incompatibilidad temporal o lógica irresoluble con los hechos probados, su declaración es declarada nula por inconsistencia lógica interna.

---
