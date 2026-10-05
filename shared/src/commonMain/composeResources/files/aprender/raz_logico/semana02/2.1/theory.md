## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Clasificación de conectores lógicos, tablas de verdad de fórmulas moleculares, tautología / contradicción / contingencia, y conector condicional directo e inverso. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de conectores lógicos en textos legales (Constitución, leyes), contratos y condicionales necesarios vs. suficientes. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Leyes del álgebra proposicional (De Morgan, absorción, transposición), minimización de esquemas moleculares y circuitos de conmutación. | Avanzado-Extremo | ⭐⭐⭐⭐⭐ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Interpretar el sentido semántico y formal de los conectores: negación, conjunción, disyunción débil y fuerte, condicional y bicondicional.
2. Analizar el impacto determinante del conector sobre el valor de verdad global de un esquema molecular.
3. Reconocer alteraciones semánticas y cambios de sentido al modificar o negar conectores lógicos en un discurso.
4. Construir y evaluar tablas de verdad matrices clasificando el resultado en Tautológico, Contradictorio o Contingente.
5. Aplicar leyes lógicas fundamentales para simplificar expresiones proposicionales extensas.

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Conector Monádico (Afecta a una sola variable: Negación ~)
        ┌─ 1. Tipología de ────┴─ Conectores Diádicos (Enlazan dos variables proposicionales)
        │      Conectores
        │
CONECTORES                     ┌─ Conjunción (p ^ q): Nexo copulativo
LÓGICOS Y ──────┼─ 2. Los Seis ────────┼─ Disyunción Débil (p v q) y Disyunción Fuerte (p Delta q)
TABLAS          │      Operadores      ├─ Condicional Directo (p -> q) e Inverso (q <- p)
DE VERDAD       │      Canónicos       ├─ Bicondicional (p <-> q)
        │                      └─ Barra de Sheffer (~(p ^ q)) y Flecha de Peirce (~(p v q))
        │
        │                      ┌─ Matriz Principal y Número de Filas: 2^n
        ├─ 3. Evaluación de ───┼─ Tautología (Todo Verdadero)
        │      Esquemas        ├─ Contradicción (Todo Falso)
        │                      └─ Contingencia o Consistencia (Valores mixtos V y F)
        │
        └─ 4. Leyes del ───────┌─ Leyes de De Morgan: ~(p ^ q) = ~p v ~q
               Álgebra         ├─ Ley del Condicional: p -> q = ~p v q
               Proposicional   └─ Leyes de Absorción (Claves para simplificación rápida)
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 Clasificación y Semántica de los Conectores Lógicos

#### A. Conector Monádico: La Negación (\sim, \neg)
Afecta a una sola proposición o a un bloque agrupado entre signos de colección.
* **Operación:** Invierte el valor de verdad: \sim V = F, \sim F = V.
* **Traducciones verbales:** "no", "ni", "es falso que", "no es cierto que", "es inadmisible que", "carece de verdad que".

---

#### B. Conectores Diádicos (Binarios)

1. **La Conjunción (\land, \&):**
   * **Semántica:** Copulativa y simultánea. Exige que ambas condiciones se satisfagan plenamente.
   * **Regla estricta:** Es **VERDADERA** únicamente cuando **ambas componentes son verdaderas**.
   * **Traducciones verbales:** "y", "e", "pero", "sin embargo", "además", "aunque", "a la vez que", "no obstante", "tanto... como...", "también".

2. **La Disyunción Inclusiva o Débil (\lor):**
   * **Semántica:** Opción no excluyente; admite la posibilidad de que ambas proposiciones ocurran simultáneamente.
   * **Regla estricta:** Es **FALSA** únicamente cuando **ambas componentes son falsas**.
   * **Traducciones verbales:** "o", "a menos que", "salvo que", "excepto que", "o en su defecto".

3. **La Disyunción Exclusiva o Fuerte (\vartriangle, \oplus, \not\leftrightarrow):**
   * **Semántica:** Opción mutuamente excluyente; una alternativa descarta por completo a la otra.
   * **Regla estricta:** Es **VERDADERA** cuando los valores de verdad son **DIFERENTES** (V \vartriangle F = V, F \vartriangle V = V). Si son iguales, es falsa (V \vartriangle V = F, F \vartriangle F = F).
   * **Traducciones verbales:** "o bien p o bien q", "ya bien... ya bien...", "o solo p o solo q".

4. **El Condicional Directo (\to):**
   * **Semántica:** Estructura de Causa-Efecto, Antecedente \implies Consecuente.
   * **Regla estricta:** Es **FALSA** únicamente cuando el **antecedente es Verdadero y el consecuente es Falso** (V \to F = F). En todos los demás casos es V.
   * **Traducciones verbales (Antecedente \to Consecuente):**  
     "si p, entonces q", "p por lo tanto q", "p en consecuencia q", "p luego q", "p de ahí que q", "dado que p, q".

5. **El Condicional Inverso (\leftarrow):**
   * **Semántica:** El consecuente aparece al inicio de la oración y el antecedente al final.

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE LEYES DEL ÁLGEBRA PROPOSICIONAL

| Nombre de la Ley | Expresión Lógica Equivalente |
| :--- | :--- |
| **Idempotencia** | p \land p \equiv p <br> p \lor p \equiv p |
| **Conmutativa** | p \land q \equiv q \land p <br> p \lor q \equiv q \lor p |
| **Asociativa** | (p \land q) \land r \equiv p \land (q \land r) <br> (p \lor q) \lor r \equiv p \lor (q \lor r) |
| **Distributiva** | p \land (q \lor r) \equiv (p \land q) \lor (p \land r) <br> p \lor (q \land r) \equiv (p \lor q) \land (p \lor r) |
