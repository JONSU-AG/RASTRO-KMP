## 1. MARCO CONCEPTUAL Y ONTOLOGÍA
## 1. FICHA TÉCNICA Y MATRIZ DE COMPETENCIAS

| Parámetro | Especificación Oficial |
| :--- | :--- |
| **Eje Temático** | EJE II: Matemática |
| **Asignatura / Componente** | Aritmética |
| **Tema Oficial N.°** | Tema II: Sistema de los números naturales (\mathbb{N}) y numeración |
| **Referencia Prospecto UNSA** | Resolución de Consejo Universitario N.° 0028-2026 (Págs. 9, 44-45) |
| **Ponderación por Pregunta** | **Ingenierías:** 1.658267400 pts (4 preg. = 6.633070 pts)<br>**Biomédicas:** 1.265447400 pts (3 preg. = 3.796342 pts)<br>**Sociales:** 0.824134300 pts (3 preg. = 2.472403 pts) |
| **Nivel de Complejidad Cognitiva** | Bloom: Aplicación Algorítmica, Análisis Estructural y Resolución Operativa |
| **Conexión Interuniversitaria** | **UNSA:** Algoritmo de la división entera (defecto/exceso), complemento aritmético, cambios de base y numerales de cifras máximas.<br>**UNMSM (DECO):** Criptoaritmética contextualizada en transacciones comerciales y sistemas binarios/octales computacionales.<br>**UNI:** Propiedades algebraicas de bases sucesivas, radicación entera inexacta y demostración de teoremas de numeración. |

### Matriz de Indicadores de Logro Evaluados
1. **Operaciones fundamentales y propiedades:** Aplicar las propiedades de la adición, sustracción (suma de los tres términos: M + S + D = 2M), complemento aritmético (CA) y multiplicación.
2. **Algoritmo euclidiano de la división entera:** Resolver problemas de división inexacta por defecto y por exceso, utilizando las leyes r + r_e = d, q_e = q + 1 y r_{máx} = d - 1.
3. **Potenciación y radicación entera:** Calcular raíces cuadradas enteras exactas e inexactas determinando residuos máximos (2k) y relaciones entre residuos.
4. **Principios del sistema posicional de numeración:** Dominar el principio de orden, base (cifra < base) y la descomposición polinómica simple y por bloques.
5. **Conversión entre sistemas de numeración:** Ejecutar conversiones entre bases cualesquiera (n \to 10 \to m, divisiones sucesivas, Ruffini) y resolver ecuaciones diofánticas con bases sucesivas.

---


## 2. MAPA TAXONÓMICO Y ONTOLOGÍA

```
                        NÚMEROS NATURALES (ℕ) Y NUMERACIÓN
                                        │
           ┌────────────────────────────┴────────────────────────────┐
           ▼                                                         ▼
OPERACIONES EN ℕ Y SUS LEYES                               TEORÍA DE LA NUMERACIÓN
           │                                                         │
  ┌────────┼────────┬────────┐                               ┌───────┴───────┐
  ▼        ▼        ▼        ▼                               ▼               ▼
Adición Sustrac.  Multipl. División                     Principios        Cambios
(Series) (C.A.)   (Prod.   Inexacta                      del Sistema      de Base
         M=S+D  Parcial) (Defecto/Exceso)             • Orden y Base   • Descomposición
                           D = dq + r                 • Cifra < Base   • Div. Sucesivas
                           r + r_e = d                • n^k - 1      • Bases Sucesivas
```

### Ontología de los Números Naturales y Sistemas Posicionales
- **Número Natural (\mathbb{N}):** Entidad abstracta que cuantifica el cardinal de conjuntos finitos (\mathbb{N} = \{0, 1, 2, 3, \dots\} en la axiomática de Peano adoptada por el prospecto UNSA).
- **Numeral:** Representación simbólica escrita o gráfica de un número (\overline{abcd}_n).
- **Base de un Sistema de Numeración (n):** Número entero mayor que 1 (n \ge 2) que indica la cantidad de unidades de un orden cualquiera necesarias para formar una unidad del orden inmediato superior.
- **Complemento Aritmético (CA):** Cantidad que le falta a un número natural para ser igual a la unidad del orden inmediato superior:
  CA(N) = 10^k - N \quad (k = \text{cantidad de cifras de } N)

---


## 2. DESARROLLO TEÓRICO FORMAL - PARTE I
### 3. DESARROLLO TEÓRICO FORMAL

### 3.1 La Sustracción y el Complemento Aritmético (CA)
Sea la sustracción en \mathbb{N}:
\text{Minuendo } (M) - \text{Sustraendo } (S) = \text{Diferencia } (D) \iff M = S + D
**Propiedad de la suma de los tres términos:**
M + S + D = M + (S + D) = M + M = 2M

#### Propiedad Fundamental de Numerales Invertidos de 3 Cifras
Sea \overline{abc}_{(n)} con a > c:
\begin{array}{r@{\quad}l}
  \overline{abc}_{(n)} & - \\
  \overline{cba}_{(n)} & \\
  \hline
  \overline{xyz}_{(n)} &
\end{array}
\implies
\begin{cases}
y = n - 1 \\
x + z = n - 1 \\
a - c = x + 1
\end{cases}
*(En base decimal n=10: la cifra central siempre es 9, la suma de los extremos es x + z = 9, y a - c = x + 1).*

#### Regla Práctica para el Complemento Aritmético
A la primera cifra significativa de la derecha se le resta de la base (10 en base decimal) y a todas las demás cifras de la izquierda se les resta de la base menos uno (9 en base decimal):
CA(\overline{abcd}) = (9 - a)(9 - b)(9 - c)(10 - d)
*Ejemplo:* CA(4720) = CA(472 \times 10) \implies (9-4)(9-7)(10-2)0 = 5280.

---

### 3.2 La División Entera (Defecto vs. Exceso)

## 3. FORMULARIO FUNDAMENTAL Y LEYES BASE
### 4. FORMULARIO MAESTRO DE NÚMEROS NATURALES Y NUMERACIÓN

### 4.1 Numeral de Cifras Máximas en Base n
\underbrace{\overline{(n-1)(n-1)\dots(n-1)}}_{k \text{ cifras}}_{(n)} = n^k - 1
*Ejemplos inmediatos:*
- 999 = 10^3 - 1 = 1000 - 1
- \overline{7777}_{(8)} = 8^4 - 1 = 4096 - 1 = 4095
- \overline{11111}_{(2)} = 2^5 - 1 = 32 - 1 = 31

### 4.2 Teorema de las Bases Sucesivas
