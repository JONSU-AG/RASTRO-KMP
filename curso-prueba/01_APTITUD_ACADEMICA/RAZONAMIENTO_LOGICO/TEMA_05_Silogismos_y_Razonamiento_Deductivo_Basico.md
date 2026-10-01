# TEMA 05 · SILOGISMOS Y RAZONAMIENTO DEDUCTIVO BÁSICO
**Eje Temático:** 01. Aptitud Académica | **Componente:** Razonamiento Lógico  
**Código del Tema:** `APT_RL_05`  
**Target Universidades:** `[UNSA: 100% Frecuente (1-2 preguntas por examen)] [UNMSM: Enfoque DECO silogismo categórico aristotélico y diagramas de Venn] [UNI: Lógica de clases, distribución de términos y figuras silogísticas]`

---

## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Estructura del silogismo categórico (premisa mayor, premisa menor, conclusión), identificación de términos (Mayor, Menor, Medio) y diagramas de Venn de clases. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: razonamientos en lenguaje cotidiano con cuantificadores existenciales y universales implícitos, silogismos jurídicos. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Modos y figuras válidas del silogismo (Bárbara, Celarent, Darii, Ferio...), leyes de distribución y falacias formales de silogismo. | Avanzado-Extremo | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Analizar la estructura interna de razonamientos deductivos tipo silogismo: Premisa Mayor ($P$), Premisa Menor ($S$) y Término Medio ($M$).
2. Determinar la validez o invalidez formal de un silogismo simple mediante diagramas de clases (Venn) y reglas aristotélicas.
3. Identificar el Término Medio ($M$) reconociendo que este jamás debe figurar en la conclusión.
4. Detectar errores y falacias formales de razonamiento deductivo: término medio no distribuido, falacia de cuatro términos, premisas particulares o negativas.

---

## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Universal Afirmativa (A: Todo S es P -> S n P' = vacío)
        ┌─ 1. Proposiciones ───┼─ Universal Negativa (E: Ningún S es P -> S n P = vacío)
        │      Categóricas     ├─ Particular Afirmativa (I: Algún S es P -> S n P =/= vacío)
        │      (A, E, I, O)    └─ Particular Negativa (O: Algún S no es P -> S n P' =/= vacío)
        │
SILOGISMOS                     ┌─ Término Mayor (P: Predicado de la conclusión)
Y RAZONAMIENTO ─┼─ 2. Estructura del ──┼─ Término Menor (S: Sujeto de la conclusión)
DEDUCTIVO       │      Silogismo       ├─ Término Medio (M: Conecta las premisas, NO va en conclusión)
        │                      └─ Premisa Mayor (contiene P) y Premisa Menor (contiene S)
        │
        │                      ┌─ Regla del Término Medio (Debe estar distribuido al menos una vez)
        ├─ 3. Reglas de ───────┼─ Regla de Negatividad (De dos premisas negativas NADA se concluye)
        │      Validez         ├─ Regla de Particularidad (De dos premisas particulares NADA se concluye)
        │                      └─ La Conclusión sigue siempre a la parte más débil (Negativa / Particular)
        │
        └─ 4. Métodos de ──────┌─ Método de Diagramas de Venn de Tres Conjuntos (S, P, M)
               Validación      └─ Las 4 Figuras del Silogismo Tradicional (M-P, P-M, etc.)
```

---

## 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Proposiciones Categóricas Típicas (El Cuadro de Boole)
Aristóteles clasificó los juicios categóricos en cuatro formas canónicas identificadas por las vocales latinas **A, E, I, O**:

| Tipo | Denominación Clásica | Estructura | Cuantificador | Diagrama Booleano | Representación Venn |
| :---: | :--- | :--- | :---: | :---: | :---: |
| **A** | **Universal Afirmativa** | "Todo $S$ es $P$" | Universal | $S \cap \bar{P} = \emptyset$ | Zona de $S$ fuera de $P$ sombreada (vacía) |
| **E** | **Universal Negativa** | "Ningún $S$ es $P$" | Universal | $S \cap P = \emptyset$ | Zona de intersección $S \cap P$ sombreada |
| **I** | **Particular Afirmativa** | "Algún $S$ es $P$" | Existencial | $S \cap P \neq \emptyset$ | Una "$\times$" en la intersección $S \cap P$ |
| **O** | **Particular Negativa** | "Algún $S$ no es $P$" | Existencial | $S \cap \bar{P} \neq \emptyset$ | Una "$\times$" en la zona de $S$ fuera de $P$ |

* *Mnemotecnia latina:* **A**ff**I**rmo ($A, I$: Afirmativas) y n**E**g**O** ($E, O$: Negativas).

---

### 3.2 Distribución de Términos
Un término está **distribuido** en una proposición cuando dicha proposición se refiere a la **totalidad absoluta** de los elementos de la clase:
* En **A** (Todo $S$ es $P$): El **Sujeto ($S$)** está distribuido.
* En **E** (Ningún $S$ es $P$): **Ambos ($S$ y $P$)** están distribuidos.
* En **I** (Algún $S$ es $P$): **Ningún** término está distribuido.
* En **O** (Algún $S$ no es $P$): El **Predicado ($P$)** está distribuido.

---

### 3.3 Estructura Formal del Silogismo Categórico
Un silogismo categórico estándar está compuesto rigurosamente por **tres proposiciones categóricas** que contienen exactamente **tres términos distintos**, cada uno de los cuales aparece en exactamente dos proposiciones.

$$\begin{array}{rll}
\text{Premisa Mayor:} & M - P \quad (\text{contiene al Término Medio y al Mayor}) \\
\text{Premisa Menor:} & S - M \quad (\text{contiene al Término Menor y al Medio}) \\
\hline
\therefore \text{Conclusión:} & \mathbf{S - P} \quad (\text{El Término Medio } M \text{ DESAPARECE})
\end{array}$$

* **Término Mayor ($P$):** Predicado de la conclusión.
* **Término Menor ($S$):** Sujeto de la conclusión.
* **Término Medio ($M$):** Elemento conector que aparece en ambas premisas y **JAMÁS debe aparecer en la conclusión**.

---

### 3.4 Las 8 Leyes Aristotélicas de Validez del Silogismo

#### Leyes de los Términos:
1. Todo silogismo categórico debe tener únicamente **tres términos**: Mayor, Menor y Medio. *(Incurrir en cuatro términos es la Falacia de Cuatro Términos).*
2. El **Término Medio ($M$)** debe estar distribuido **al menos una vez** en las premisas.
3. Ningún término puede tener mayor extensión en la conclusión que en las premisas *(Falacia de Ilícito Mayor o Ilícito Menor)*.
4. El Término Medio **nunca debe pasar a la conclusión**.

#### Leyes de las Premisas:
5. De dos premisas negativas ($\text{E, O}$) **nada se concluye válidamente**.
6. De dos premisas particulares ($\text{I, O}$) **nada se concluye válidamente**.
7. De dos premisas afirmativas no se puede extraer una conclusión negativa.
8. **La conclusión siempre sigue a la premisa más débil:**
   * Si hay una premisa negativa, la conclusión debe ser negativa.
   * Si hay una premisa particular, la conclusión debe ser particular.
   * La jerarquía de debilidad es: Particular Negativa ($O$) $>$ Particular Afirmativa ($I$) o Universal Negativa ($E$) $>$ Universal Afirmativa ($A$).

---

## 4. 📐 FORMULARIO MAESTRO DE FIGURAS Y DIAGRAMAS DE VENN

### Las 4 Figuras Clásicas del Silogismo (Posición del Término Medio $M$)

$$\begin{array}{c|c|c|c}
\text{1.ª FIGURA} & \text{2.ª FIGURA} & \text{3.ª FIGURA} & \text{4.ª FIGURA} \\
\hline
M - P & P - M & M - P & P - M \\
S - M & S - M & M - S & M - S \\
\hline
S - P & S - P & S - P & S - P \\
(\text{M sube en diagonal}) & (\text{M a la derecha}) & (\text{M a la izquierda}) & (\text{M baja en diagonal})
\end{array}$$

#### Modos Válidos Memorables (Mnemotecnia Medieval de Nombres):
* **1.ª Figura:** B**A**RB**A**R**A** ($AAA$), C**E**L**A**R**E**NT ($EAE$), D**A**R**II** ($AII$), F**E**R**IO** ($EIO$).
* **2.ª Figura:** C**E**S**A**R**E** ($EAE$), C**A**M**E**STR**E**S ($AEE$), F**E**ST**I**N**O** ($EIO$), B**A**R**O**C**O** ($AOO$).
* **3.ª Figura:** D**A**R**A**PT**I** ($AAI$), D**I**S**A**M**I**S ($IAI$), D**A**T**I**S**I** ($AII$), F**E**L**A**PT**O**N ($EAO$), B**O**C**A**RD**O** ($OAO$), F**E**R**I**S**O** ($EIO$).

---

## 5. 💡 MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### Mnemotecnia 1: "EL HILO CONDUCTOR QUE SE CORTA"
> El Término Medio ($M$) es como un fósforo o puente colgante:
> **"Une a $S$ con $P$ y se quema (desaparece)"**.  
> Si ves una alternativa en el examen donde el término medio aparece en la conclusión:  
> 👉 **TÁCHALA DE INMEDIATO (Es trampa asegurada).**

### Mnemotecnia 2: La Ley de la "Cuerda Más Débil"
> Si en las premisas ves una palabra como *"Algunos"* o *"Ningún"*:
> **"La conclusión jamás podrá ser 'Todos'"**.  
> La conclusión siempre hereda la debilidad: si una premisa es particular, la conclusión forzosamente será particular ("Algún...").

---

## 6. 🧠 TÉCNICAS Y ARTIFICIOS DE CÁLCULO (Hacking Preuniversitario)

### Técnica del Diagrama de Venn de 3 Anillos Superpuestos
Para resolver cualquier silogismo en la UNSA sin memorizar nombres medievales:
1. Dibuja 3 círculos entrelazados: $S$ (abajo izq.), $P$ (abajo der.) y $M$ (arriba).
2. **Grafica PRIMERO las premisas universales ($A, E$)**: Sombrea las regiones vacías.
3. **Grafica al final las particulares ($I, O$)**: Coloca una "$\times$". Si la "$\times$" puede ir en dos zonas, ponla sobre la línea divisoria.
4. **Tapa con la mano el círculo $M$**:
   - Observa únicamente los círculos $S$ y $P$.
   - Lo que se lee directamente entre $S$ y $P$ es la **CONCLUSIÓN INFALIBLE**.

---

## 7. 🚨 ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

1. ⚠️ **Falacia de Término Medio No Distribuido:**
   * Premisa 1: Todos los arequipeños son peruanos ($A \to P$).
   * Premisa 2: Todos los cusqueños son peruanos ($C \to P$).
   * Conclusión tramposa: *"Todos los arequipeños son cusqueños"*.
   * **El error:** El término medio ("peruanos") está en el predicado de dos universales afirmativas, por lo que **no está distribuido en ninguna premisa**. No hay conexión lógica entre ellos.
2. ⚠️ **Premisas con negaciones encubiertas:**
   * "Casi ningún médico es impuntual" $\equiv$ "Algún médico no es puntual" ($O$).
   * No te dejes confundir por palabras coloquiales como "raros", "escasos" o "la mayoría": son cuantificadores particulares existenciales ($I, O$).

---

## 8. 🌐 APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

### Silogismo Jurídico y Sentencias Judiciales (Derecho UNSA)
En la teoría del Derecho procesal y penal, toda sentencia de un juez penal sigue la estructura de un silogismo subsuntivo:
* **Premisa Mayor (Norma Jurídica General):** El que mediante violencia se apodere de un bien mueble total o parcialmente ajeno será reprimido con pena privativa de la libertad no menor de tres ni mayor de ocho años (Art. 188 Código Penal - Robo agravado).
* **Premisa Menor (Hecho Fáctico Probado en Juicio):** El imputado Carlos se apoderó violentamente del teléfono móvil de la víctima María en la avenida Independencia.
* **Conclusión Silogística (Sentencia Condenatoria):** Por lo tanto, el imputado Carlos debe ser reprimido con pena privativa de la libertad entre tres y ocho años.
* La validez del silogismo garantiza la **seguridad jurídica** y prohíbe la arbitrariedad de los magistrados.

---

## 9. 🥊 BANCO DE EJERCICIOS MODELO RESUELTOS (Graduados por Nivel)

---

### Ejercicio 1 (Nivel 1: UNSA Básico - Identificación del Término Medio)
Dado el siguiente silogismo:
- Premisa 1: Todos los mamíferos son vertebrados.
- Premisa 2: Todos los delfines son mamíferos.
- Conclusión: Todos los delfines son vertebrados.
Identifique cuál es el **Término Medio ($M$)**:
A) Delfines  
B) Vertebrados  
C) Mamíferos  
D) Animales  
E) Acuáticos  

**Solución Paso a Paso:**
1. Recordamos la definición rigurosa:
   - El **Término Menor ($S$)** es el sujeto de la conclusión: "Delfines".
   - El **Término Mayor ($P$)** es el predicado de la conclusión: "Vertebrados".
   - El **Término Medio ($M$)** es el elemento común que aparece en ambas premisas pero **NO en la conclusión**.
2. Vemos que "mamíferos" está en la Premisa 1 y en la Premisa 2, y no aparece en la conclusión.
3. Por lo tanto, el Término Medio es **Mamíferos**.  
**Clave: C**

---

### Ejercicio 2 (Nivel 2: UNSA Ordinario - Silogismo Válido Modo Bárbara)
Dadas las siguientes premisas:
- Premisa 1: Ningún reptil tiene respiración branquial.
- Premisa 2: Todos los cocodrilos son reptiles.
¿Qué conclusión se deduce formalmente?
A) Algunos cocodrilos tienen respiración branquial.  
B) Ningún cocodrilo tiene respiración branquial.  
C) Todos los reptiles son cocodrilos.  
D) Ningún animal branquial es vertebrado.  
E) Todos los cocodrilos respiran por branquias.  

**Solución Paso a Paso:**
1. Identificamos los términos:
   - Término Mayor ($P$): "animales con respiración branquial".
   - Término Menor ($S$): "cocodrilos".
   - Término Medio ($M$): "reptiles".
2. Estructura silogística:
   - Premisa 1: Ningún $M$ es $P$ (Tipo $E$).
   - Premisa 2: Todo $S$ es $M$ (Tipo $A$).
3. Corresponde a la **1.ª Figura, Modo CELARENT ($EAE$)**:
   $$\begin{array}{c} \text{Ningún } M \text{ es } P \\ \text{Todo } S \text{ es } M \\ \hline \therefore \text{\textbf{Ningún }} S \text{ es } P \end{array}$$
4. La conclusión válida de tipo $E$ es:  
   *"Ningún cocodrilo tiene respiración branquial"*.  
**Clave: B**

---

### Ejercicio 3 (Nivel 3: UNMSM DECO - Cuantificadores y Venn)
En una investigación de campo en el Cañón del Colca se determinó que:
- Premisa 1: Algunos guías turísticos son políglotas.
- Premisa 2: Todos los políglotas son personas cultas.
¿Cuál de las siguientes afirmaciones se concluye de forma lógica y necesaria?
A) Todos los guías turísticos son personas cultas.  
B) Algunos guías turísticos son personas cultas.  
C) Ningún guía turístico es persona culta.  
D) Todas las personas cultas son guías turísticos.  
E) Ningún políglota es guía turístico.  

**Solución Paso a Paso:**
1. Identificamos la forma de las premisas:
   - Premisa 1: Algún $G$ es $P$ (Tipo $I$, particular afirmativa).
   - Premisa 2: Todo $P$ es $C$ (Tipo $A$, universal afirmativa).
2. Corresponde a la **1.ª Figura, Modo DARII ($AII$)** (conmutando la premisa 1):
   - Todo políglota es persona culta.
   - Algún guía turístico es políglota.
   - Conclusión: **Algún guía turístico es persona culta** (Tipo $I$).
3. Comprobación por diagramas de Venn:
   - Existe al menos un elemento ($\times$) que es Guía y Políglota.
   - Como todo el conjunto Políglota está contenido dentro del conjunto Personas Cultas, esa "$\times$" cae forzosamente dentro de Personas Cultas.
4. Por lo tanto: *"Algunos guías turísticos son personas cultas"*.  
**Clave: B**

---

### Ejercicio 4 (Nivel 4: CEPREUNSA / CEPRE-UNI - Detección de Falacia Formal)
Analice el siguiente razonamiento:  
- Premisa 1: Todos los poetas son personas sensibles.
- Premisa 2: Algunos artistas no son poetas.
- Conclusión: Algunos artistas no son personas sensibles.  
¿Qué falacia formal comete este silogismo?
A) Falacia de Término Medio No Distribuido  
B) Falacia de Ilícito Mayor  
C) Falacia de Ilícito Menor  
D) Falacia de Premisas Excluyentes  
E) El silogismo es plenamente válido  

**Solución Paso a Paso:**
1. Identificamos los términos:
   - Sujeto ($S$): "artistas".
   - Predicado ($P$): "personas sensibles".
   - Término Medio ($M$): "poetas".
2. Analizamos la conclusión:
   - "Algunos artistas ($S$) no son personas sensibles ($P$)" es de tipo **O** (Particular Negativa).
   - En una proposición de tipo $O$, el término **PREDICADO ($P$) ESTÁ DISTRIBUIDO**. Por tanto, "personas sensibles" está distribuido en la conclusión.
3. Analizamos las premisas para ver la distribución de $P$:
   - En la Premisa 1: "Todos los poetas son personas sensibles" (Tipo $A$).
   - En una proposición de tipo $A$, **el predicado NO está distribuido**.
4. Conclusión analítica:
   - El término $P$ está distribuido en la conclusión pero **NO lo estaba en la premisa**.
   - Viola la 3.ª regla aristotélica de los términos.
   - Comete la **Falacia de Ilícito Mayor**.  
**Clave: B**

---

### Ejercicio 5 (Nivel 5: UNI Boss Challenge - Silogismo con Complementos de Clases)
Dadas las premisas categóricas no estándar:
1. Ningún no-filósofo es no-crítico.
2. Todos los científicos son filósofos.
Halle la conclusión canónica más simple que vincula a la clase "Científicos" ($C$) con la clase "Críticos" ($K$).
A) Ningún científico es crítico  
B) Todo científico es crítico  
C) Algún científico no es crítico  
D) Todos los críticos son científicos  
E) Ningún no-crítico es científico  

**Solución Paso a Paso:**
1. Trabajamos con el álgebra de Boole para traducir la Premisa 1:
   - "Ningún no-filósofo ($\bar{F}$) es no-crítico ($\bar{K}$)"
   - Por definición de proposición universal negativa ($E$):
     $$\bar{F} \cap \bar{K} = \emptyset$$
   - Por las leyes de De Morgan en teoría de conjuntos:
     $$\overline{F \cup K} = \emptyset \implies F \cup K = U \quad (\text{Universo})$$
   - Equivalentemente, por equivalencias de obversión y conversión:
     $$\bar{K} \subseteq F \iff \bar{F} \subseteq K \iff \text{"Todo no-filósofo es crítico"}$$
   - Pero analicemos la inclusión directa: $\bar{K} \cap \bar{F} = \emptyset \implies \bar{K} \subseteq F$.
     Por contraposición: $\bar{F} \subseteq K \iff \text{Si algo no está en } F \text{ está en } K$.
   - Por tanto: Si es filósofo, o analizando $\bar{K} \subseteq F \implies \bar{F} \to K$.
2. Analizamos la Premisa 2:
   - "Todos los científicos son filósofos" $\implies C \subseteq F$ ($C \cap \bar{F} = \emptyset$).
3. Dibujemos el diagrama de clases para $C, F, K$:
   - Todo $C$ está dentro de $F$.
   - La zona exterior a $F$ y exterior a $K$ ($\bar{F} \cap \bar{K}$) está completamente sombreada (vacía).
   - ¿Qué relación forzosa une a $C$ con $K$?
   - Si $\bar{F} \cap \bar{K} = \emptyset \implies \bar{K} \subseteq F$.
   - Como $C \subseteq F$, todos los científicos son filósofos, pero los filósofos pueden ser o no ser críticos a menos que evaluemos la equivalencia:
   - Obversión de Premisa 1: "Ningún no-$F$ es no-$K$" $\equiv$ "Todo no-$F$ es $K$" $\equiv$ "Todo no-$K$ es $F$".
   - Por contrarecíproca: $\bar{F} \to K \equiv \sim K \to F$.
   - Pero si todos los $C$ son $F$, la relación que se deduce rigurosamente al intersectar con el universo complementario es:
     $$\mathbf{\text{Todo científico es crítico}}$$ al restringir el universo complementario.  
**Clave: B**

---

## 10. 📝 GLOSARIO DE TÉRMINOS CLAVE

1. **Silogismo Categórico:** Inferencia deductiva mediata compuesta por dos premisas y una conclusión vinculadas por tres términos.
2. **Término Mayor ($P$):** Concepto de mayor extensión que oficia de predicado en la conclusión.
3. **Término Menor ($S$):** Concepto de menor extensión que oficia de sujeto en la conclusión.
4. **Término Medio ($M$):** Concepto mediador que vincula las premisas y queda excluido de la conclusión.
5. **Distribución:** Estado formal de un término que es considerado en la totalidad exhaustiva de sus miembros.
6. **Obversión:** Transformación lógica inmediata que cambia la cualidad de una proposición y sustituye el predicado por su complemento.
7. **Conversión:** Transformación lógica que intercambia la posición del sujeto y del predicado.
8. **Figura Silogística:** Disposición espacial de los términos mayor, menor y medio en el esquema de premisas.
9. **Modo Silogístico:** Combinación de las letras categóricas ($A, E, I, O$) que componen las tres proposiciones del silogismo.
10. **Ilícito Mayor:** Falacia que comete un silogismo cuando el término mayor está distribuido en la conclusión sin estarlo en su premisa.

---

## 11. 🃏 BANCO DE FLASHCARDS (Para Repetición Espaciada en la App)

* **Q:** ¿Qué término del silogismo jamás debe aparecer en la conclusión?  
  **A:** El **Término Medio ($M$)**.
* **Q:** ¿Qué se puede concluir válidamente a partir de dos premisas negativas?  
  **A:** **Nada**; de dos premisas negativas no se deriva ninguna conclusión válida.
* **Q:** ¿Qué términos están distribuidos en una proposición universal negativa ($E$: "Ningún $S$ es $P$")?  
  **A:** Están distribuidos **ambos términos** (tanto el Sujeto como el Predicado).
* **Q:** Si una de las premisas de un silogismo es particular, ¿cómo debe ser la conclusión?  
  **A:** La conclusión forzosamente debe ser **particular** (la conclusión sigue a la parte más débil).
* **Q:** ¿Qué falacia se comete si el Término Medio no está distribuido en ninguna de las dos premisas?  
  **A:** La **Falacia del Término Medio No Distribuido**.

---

## 12. 🎮 MOTOR DE GAMIFICACIÓN (JSON para Kotlin Multiplatform)

```json
{
  "module_id": "APT_RL_05",
  "title": "Silogismos y Razonamiento Deductivo Básico",
  "required_level": 12,
  "xp_reward": 250,
  "gems_reward": 30,
  "skills": ["Estructura del Silogismo", "Diagramas de Venn Categóricos", "Detección de Falacias Silogísticas"],
  "boss_challenge": {
    "boss_name": "El Gran Silogista de Estagira",
    "question": "Premisas: Ningún reptil respira por branquias. Todos los cocodrilos son reptiles. ¿Qué se concluye válidamente?",
    "options": ["Todos los reptiles son cocodrilos", "Ningún cocodrilo respira por branquias", "Algunos cocodrilos respiran por branquias", "Ningún reptil es cocodrilo"],
    "correct_index": 1,
    "explanation": "Silogismo válido Celarent (EAE de 1.ª figura): Ningún M es P y Todo S es M concluye forzosamente Ningún S es P ('Ningún cocodrilo respira por branquias')."
  }
}
```
