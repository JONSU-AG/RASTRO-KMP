## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. 🎯 FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Universidad | Tipo de Enfoque Evaluado | Nivel de Complejidad | Frecuencia Histórica |
| :--- | :--- | :---: | :---: |
| **UNSA** (Ordinario / CEPREUNSA) | Clasificación de enunciados (proposición, enunciado abierto, no proposicional), distinción de proposiciones simples y compuestas, valores de verdad en contextos fácticos. | Intermedio | ⭐⭐⭐⭐⭐ (En todos los exámenes) |
| **UNMSM** (San Marcos) | Enfoque DECO: análisis de discursos argumentativos, declaraciones científicas e históricas, detección de enunciados con sentido o sin sentido. | Intermedio-Alto | ⭐⭐⭐⭐⭐ |
| **UNI** (Ciencias / Ingeniería) | Formalización estricta en lenguaje formal (\mathcal{L}), cuantificadores universales/existenciales implícitos, paradojas autorreferenciales clásicas (Russell, Epiménides). | Avanzado | ⭐⭐⭐⭐☆ |

### Capacidades Oficiales Evaluadas (Prospecto UNSA 2027)
1. Identificar proposiciones lógicas distinguiéndolas con precisión de oraciones no proposicionales.
2. Determinar y discriminar valores de verdad (Verdadero V o Falso F) según el contexto fáctico o formal dado.
3. Reconocer enunciados no proposicionales: directivos, expresivos, exclamativos, interrogativos, juicios estéticos y pseudoproposiciones.
4. Analizar, clasificar y formalizar afirmaciones simples (atómicas o elementales) y compuestas (moleculares o coligativas).

---


## 2. 🗺️ MAPA TAXONÓMICO Y ONTOLOGÍA DEL TEMA

```text
                               ┌─ Expresiones No Proposicionales (Deseos, órdenes, dudas, preguntas)
        ┌─ 1. Tipología de ────┼─ Enunciados Abiertos / Funciones Proposicionales (P(x) con variables)
        │      Enunciados      ├─ Pseudoproposiciones (Sin sentido lógico o metafísicas)
        │                      └─ Proposiciones Lógicas (Tienen valor bivalente V o F)
        │
PROPOSICIONES                  ┌─ Proposiciones Predicativas (Atribuyen una cualidad a un sujeto)
Y ENUNCIADOS ───┼─ 2. Proposiciones ───┴─ Proposiciones Relacionales (Establecen vínculo entre dos o más entes)
LÓGICOS         │      Simples
        │
        │                      ┌─ Conjuntivas (y, pero, aunque, sin embargo, además)
        ├─ 3. Proposiciones ───┼─ Disyuntivas Débiles o Inclusivas (o)
        │      Compuestas      ├─ Disyuntivas Fuertes o Exclusivas (o... o...)
        │                      ├─ Condicionales (Directa: p -> q; Inversa: q <- p)
        │                      ├─ Bicondicionales (si y solo si)
        │                      └─ Negativas (~p)
        │
        └─ 4. Criterios de ────┌─ Principio de Tercero Excluido (Solo V o F, no hay tercer estado)
               Bivalencia      └─ Principio de No Contradicción (~(p ^ ~p))
```

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. 📖 DESARROLLO TEÓRICO FORMAL

### 3.1 El Enunciado y sus Categorías Epistemológicas
* **Enunciado:** Toda frase, oración o expresión lingüística emitida mediante el lenguaje verbal o escrito.
* **Proposición Lógica:** Es un enunciado aseverativo (afirmativo o negativo) susceptible de ser calificado unívocamente como **Verdadero (V)** o **Falso (F)**, pero nunca ambos a la vez. Posee un significado objetivo e invariable.
  * *Ejemplo Verdadero:* "Arequipa es la capital del departamento homónimo". (V)
  * *Ejemplo Falso:* "2^3 + 3^2 = 25". (F, pues 8 + 9 = 17 \neq 25).

---

### 3.2 Clasificación Taxonómica de Expresiones No Proposicionales
No son proposiciones lógicas porque carecen de valor de verdad bivalente:
1. **Oraciones Interrogativas:** ¿A qué hora inicia el examen de la UNSA? (Buscan información, no afirman nada).
2. **Oraciones Imperativas / Directivas (Órdenes, mandatos, pedidos):** "¡Cierra la puerta inmediatamente!", "Prohibido fumar".
3. **Oraciones Exclamativas o Admirativas:** "¡Qué hermosa tarde arequipeña!", "¡Auxilio!".
4. **Oraciones Desiderativas (Deseos):** "Ojalá ingrese a Medicina en primera opción".
5. **Oraciones Dubitativas (Duda):** "Tal vez viaje a Mollendo este fin de semana".
6. **Juicios de Valor Estético o Subjetivo:** "La música clásica es superior al rock".
7. **Pseudoproposiciones / Disparates sin sentido:** "Los triángulos son inteligentes y cantan baladas".
8. **Paradojas Lógicas Autorreferenciales:** "Esta afirmación que estoy escribiendo es falsa" (Si es verdadera, es falsa; si es falsa, es verdadera \implies Indecidible).

---

### 3.3 Enunciado Abierto (Función Proposicional)
Es un enunciado que contiene una o más variables libres y que no puede ser calificado como V o F **hasta que la variable no sea reemplazada por una constante específica del universo**:
* *Ejemplo 1:* "x + 5 = 12" (Es un enunciado abierto).
  - Si x = 7 \implies 7 + 5 = 12 (V, se transforma en proposición).

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. 📐 FORMULARIO MAESTRO DE OPERADORES Y VALORES DE VERDAD

| Operación Lógica | Símbolo | Conector Clave | Regla de Oro Preuniversitaria |
| :--- | :---: | :---: | :--- |
| **Negación** | \sim p | "no", "es falso que" | Invierte el valor: \sim V = F, \sim F = V. |
| **Conjunción** | p \land q | "y", "pero", "además" | **Solo es VERDADERA si AMBAS son Verdaderas (V \land V = V).** En cualquier otro caso es F. |
