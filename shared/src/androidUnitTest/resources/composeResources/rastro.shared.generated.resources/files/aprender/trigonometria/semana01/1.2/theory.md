## 1. DESARROLLO TEÓRICO AVANZADO - PARTE II
---

### 3.3. Relación de Magnitud entre las Unidades
Comparando una vuelta completa en los tres sistemas:
1 \text{ vuelta} = 360^\circ = 400^g = 2\pi\text{ rad}
Dividiendo entre sus respectivas cantidades de unidades por vuelta:
1\text{ rad} > 1^\circ > 1^g
*Observación crucial:* Para un mismo ángulo positivo, el número de unidades verifica:
C > S > R

---

### 3.4. Fórmula General de Conversión

Sean S, C y R los números que representan la medida de un mismo ángulo en grados sexagesimales, grados centesimales y radianes respectivamente:
\frac{S}{360} = \frac{C}{400} = \frac{R}{2\pi}
Simplificando por 20:
\frac{S}{180} = \frac{C}{200} = \frac{R}{\pi}

#### 1. Escala Universal (con constante K):
S = 180K, \quad C = 200K, \quad R = \pi K

#### 2. Escala Práctica Simplificada entre S y C (con constante k):
\frac{S}{9} = \frac{C}{10} = k
De donde:
S = 9k, \quad C = 10k, \quad R = \frac{\pi k}{20}
*(Esta parametrización es la más rápida para resolver el 95% de ecuaciones preuniversitarias).*

#### 3. Relación entre Minutos y Segundos:
- Sean m_s el número de minutos sexagesimales y m_c el número de minutos centesimales:
  \frac{m_s}{27} = \frac{m_c}{50}
- Sean s_s el número de segundos sexagesimales y s_c el número de segundos centesimales:
  \frac{s_s}{81} = \frac{s_c}{250}

---

### 3.5. Método del Factor de Conversión Unitario
Para transformar un ángulo de un sistema a otro, se multiplica por una fracción equivalente a la unidad (1):
\text{Valor en Sistema Deseado} = \text{Valor Dado} \times \left( \frac{\text{Unidad que quiero}}{\text{Unidad que tengo}} \right)

*Factores Clave de Conversión Directa:*
- De grados sexagesimales a centesimales: \times \dfrac{10^g}{9^\circ}
- De grados centesimales a sexagesimales: \times \dfrac{9^\circ}{10^g}
- De sexagesimales a radianes: \times \dfrac{\pi\text{ rad}}{180^\circ}
- De centesimales a radianes: \times \dfrac{\pi\text{ rad}}{200^g}
- De radianes a sexagesimales: \times \dfrac{180^\circ}{\pi\text{ rad}}

---


## 2. FORMULARIO MAESTRO, ARTIFICIOS Y HACKING PREUNIVERSITARIO
| **Subunidades Centesimales** | 1^g = 100^m \quad \land \quad 1^m = 100^s \implies 1^g = 10000^s | Sistema francés decimal |
| **Relación de Minutos** | \dfrac{m_s}{27} = \dfrac{m_c}{50} | m_s: min sexagesimales, m_c: min centesimales |
| **Relación de Segundos**| \dfrac{s_s}{81} = \dfrac{s_c}{250} | s_s: seg sexagesimales, s_c: seg centesimales |
| **Comparación de Unidades** | 1\text{ rad} > 1^\circ > 1^g | Tamaño físico de 1 unidad angular |
| **Comparación Numérica** | C > S > R \quad (\text{para } \theta > 0) | Cantidad numérica de unidades |

---


### 6. TÉCNICAS Y ARTIFICIOS DE CÁLCULO (HACKING PREUNIVERSITARIO)

### Hack 1: Simplificación de la Fracción \frac{C + S}{C - S}
Esta fracción aparece en infinidad de preguntas de CEPREUNSA y UNMSM:
\frac{C + S}{C - S} = \frac{10k + 9k}{10k - 9k} = \frac{19k}{1k} = 19
- ¡Vale exactamente **19** siempre! No pierdas tiempo deduciendo, memorízalo como constante preuniversitaria.
- Análogamente:
  \frac{C - S}{C + S} = \frac{1}{19}
  \sqrt{\frac{C + S}{C - S} + 17} = \sqrt{19 + 17} = \sqrt{36} = 6

### Hack 2: Inversión Rápida de Ángulos en Figuras
En gráficos geométricos donde aparezcan ángulos con flechas en sentido horario (a favor del reloj):
1. Tacha la flecha original.
2. Dibuja la flecha en sentido antihorario.
3. Cambia de signo a toda la expresión: Si era (\alpha - 20^\circ) \to -( \alpha - 20^\circ) = (20^\circ - \alpha).
4. Ahora suma tranquilamente los ángulos e iguala a 90^\circ, 180^\circ o 360^\circ según la figura geométrica plana.

---


### 5. MNEMOTECNIAS DE COMBATE PREUNIVERSITARIO

### 1. Mnemotecnia del Tamaño vs Número: "EL ELEFANTE Y LAS HORMIGAS"
- **Unidad más grande:** El **R**adián es un **ELEFANTE** (1\text{ rad} \approx 57.3^\circ).
- **Unidad más pequeña:** El grado centesimal (^g) es una **HORMIGA**.
- Por eso, para medir el mismo ángulo:
  - Necesitas poquitos radianes (R es pequeño numéricamente).
  - Necesitas muchos centesimales (C es grande numéricamente).
  - Regla mnemotécnica:
    \text{Unidades: } \text{Rad} > ^\circ > ^g \quad \Longleftrightarrow \quad \text{Números: } C > S > R

### 2. Mnemotecnia de la Parametrización: "NUEVE Y DIEZ (9k y 10k)"
- Siempre que veas una ecuación con S y C (ejemplo: \frac{C + S}{C - S}):
  - Sustituye de inmediato: S = 9k, C = 10k.
  - Si aparece R: R = \frac{\pi k}{20}.
  - ¡El 99% de las k se cancelan al instante!

---


## 3. ZONA DE TRAMPAS Y DISTRACTORES DE EXAMEN
### 7. ZONA DE TRAMPAS Y DISTRACTORES ("¡PELIGRO EXAMEN!")

> [!WARNING]
> **Trampa 1: El Minuto Sexagesimal no es igual al Minuto Centesimal**
> 1' sexagesimal equivale a \frac{1^\circ}{60}.  
> 1^m centesimal equivale a \frac{1^g}{100}.  
> Muchos postulantes asumen erróneamente que 1' = 1^m. La relación real es:
> \frac{1'}{1^m} = \frac{50}{27} \approx 1.85
> ¡El minuto sexagesimal es casi el doble de grande que el minuto centesimal!

> [!CAUTION]
> **Trampa 2: La Notación a^\circ b' no significa multiplicación**
> En álgebra elemental, xy es x multiplicado por y.  
> En trigonometría angular, 3^\circ 20' es una **SUMA**:
> 3^\circ 20' = 3^\circ + 20' = 3^\circ + \frac{20^\circ}{60} = 3^\circ + \frac{1^\circ}{3} = \frac{10^\circ}{3}
> ¡Multiplicar 3 \times 20 = 60 es el error clásico número 1 en admisión!

> [!WARNING]
> **Trampa 3: Signo al Cambiar de Sentido**
> Si el ángulo es x^\circ en sentido horario, al cambiarlo a antihorario se vuelve -x^\circ. Si la ecuación geométrica es un ángulo llano (180^\circ):
> \text{Antihorario}_1 - \text{Horario}_2 = 180^\circ
> No olvides aplicar la ley de signos a todos los términos dentro del paréntesis: -(30^\circ - 2x) = 2x - 30^\circ.

---


## 4. MODELOS DE EXAMEN Y APLICACIÓN DECO
### 8. APLICACIÓN AL MUNDO REAL Y CONTEXTO DECO

1. **Topografía e Ingeniería Civil (Uso del Sistema Centesimal):** Los teodolitos y estaciones totales modernas emplean frecuentemente el sistema centesimal (grados gonios, 400^g) porque facilita el cálculo de pendientes y cotas en porcentaje mediante división decimal directa sin conversiones sexagesimales de base 60.
2. **Astronomía y Posicionamiento Orbital (Ascensión Recta y Declinación):** Las coordenadas celestes combinan horas, minutos y segundos de tiempo con grados sexagesimales de declinación para apuntar telescopios hacia estrellas y satélites geoestacionarios.
3. **Cálculo Diferencial e Integral (Obligatoriedad del Radián):** En física teórica y cálculo superior, las funciones trigonométricas (\sin(x), \cos(x)) y el límite fundamental \lim_{x \to 0} \frac{\sin(x)}{x} = 1 son válidos **únicamente si el ángulo x está expresado en radianes**. Si se emplearan grados, aparecería un factor parásito \frac{\pi}{180} en cada derivada.

---
