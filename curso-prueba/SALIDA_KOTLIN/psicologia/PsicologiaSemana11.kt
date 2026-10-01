package psicologia

object PsicologiaSemana11 {

    val lessons = listOf(
        LessonNode(
            id = "psi_t11_s01",
            subjectId = "psicologia",
            semana = 11,
            subtema = "11.1",
            title = "3.1. Definición y Evolución Histórica del Concepto",
            theory = LessonTheory(
                content = """## 3. MARCO TEÓRICO EXHAUSTIVO



### 3.1. Definición y Evolución Histórica del Concepto
- **Etimología:** Proviene del latín *intelligentia*, derivado de *inter* (entre) y *legere* (escoger, elegir, leer), denotando la capacidad de "saber elegir entre varias opciones la mejor alternativa".
- **Definición Psicológica Contemporánea:** Capacidad cognitiva global y multivariable que permite a un individuo asimilar información, razonar de manera abstracta, resolver problemas novedosos, aprender de la experiencia y adaptarse eficazmente a entornos cambiantes y desafiantes (David Wechsler / APA).
- **El Debate Herencia vs. Ambiente:**
  - Estudios en gemelos idénticos criados en ambientes separados demuestran una heredabilidad genética de entre el 50\% y el 70\% para el factor general de inteligencia.
  - El ambiente (nutrición en la primera infancia, estimulación cognitiva temprana, educación de calidad y nivel socioeconómico) modula y determina el grado de expresión de ese potencial genético dentro de un "rango de reacción".

---



### 4.1. Psicometría y Medición del Cociente Intelectual (CI)
1. **Escala Binet-Simon (1905):**
   Primer test científico de inteligencia, desarrollado en Francia para identificar niños con necesidades educativas especiales en escuelas públicas. Introduce el concepto de:
   - **Edad Mental (EM):** Nivel de desarrollo cognitivo alcanzado por un individuo en comparación con el promedio de su grupo de edad cronológica.
2. **Cociente Intelectual Clásico de William Stern (1912):**
   Fórmula de razón matemática:
   CI = \frac{EM}{EC} \times 100
   - EM: Edad Mental (puntuación obtenida en el test estandarizado).
   - EC: Edad Cronológica real del sujeto.
   - Si EM = EC \implies CI = 100 (rendimiento exactamente promedio).
   - Limitación: Útil solo en la niñez; pierde validez en adultos porque la edad cronológica avanza linealmente mientras que el desarrollo mental se estabiliza.
3. **Escalas de David Wechsler (WAIS, WISC, WPPSI) y CI de Desviación:**
   Wechsler reemplaza la fórmula de Stern por la **distribución normal de Gauss**, comparando el rendimiento del sujeto con personas de su mismo grupo de edad:
   - Media estandarizada: \mu = 100.
   - Desviación estándar: \sigma = 15.

```
                    Curva Normal de Gauss (CI Wechsler)
                                   100 (50%)
                                     │
                             ┌───────┴───────┐
                     85      │               │     115
             ┌───────┴───────┘               └───────┴───────┐
       70    │                                               │    130
  ─────┼─────┼───────────────┼───────────────┼───────────────┼─────┼─────
      -2σ   -1σ              0              +1σ             +2σ   +3σ
```

- **Clasificación Diagnóstica del CI (Wechsler):**
  - 130 a más: Muy superior / Superdotación intelectual (2.2\%).
  - 120 - 129: Superior.
  - 110 - 119: Promedio alto (Brillante).
  - 90 - 109: Promedio / Normal (50\% de la población).
  - 80 - 89: Promedio bajo (Torpe).
  - 70 - 79: Limítrofe / Fronterizo (*Borderline*).
  - Menor a 70: Discapacidad Intelectual (acompañada de fallas en conducta adaptativa).



## 7. 5 PROBLEMAS RESUELTOS Y GRADUADOS



### Problema 1: Cálculo Psicométrico de Stern (Nivel Básico)
**Enunciado:** Un psicólogo educativo evalúa a un niño de 8 años de edad cronológica con el test Stanford-Binet. El reporte final indica que el menor resolvió exitosamente todas las pruebas equivalentes a un nivel de desarrollo mental correspondiente a un niño de 10 años. Calcule el Cociente Intelectual (CI) del menor e indique su categoría diagnóstica según la escala clásica.
A) CI = 80 (Promedio bajo)  
B) CI = 100 (Promedio normal)  
C) CI = 125 (Superior)  
D) CI = 135 (Muy superior)  
E) CI = 115 (Promedio alto)  

**Solución paso a paso:**
1. Identificamos los datos psicométricos:
   - Edad Cronológica (EC): 8\text{ años}.
   - Edad Mental (EM): 10\text{ años}.
2. Aplicamos la fórmula clásica de William Stern:
   CI = \frac{EM}{EC} \times 100 = \frac{10}{8} \times 100 = 1.25 \times 100 = 125
3. Un CI de 125 se ubica en el rango de 120 - 129, correspondiente a la categoría **Superior**.

**Respuesta:** C) CI = 125 (Superior).

---



### Problema 5: Distribución Normal del CI y Propiedades Psicométricas (Boss Challenge)
**Enunciado:** En una muestra representativa de 10 000 postulantes a una universidad nacional, los resultados de una prueba psicométrica estandarizada de Wechsler (CI \sim N(100, 15^2)) arrojan una distribución normal simétrica. Sabiendo que el intervalo [\mu - 2\sigma, \mu + 2\sigma] abarca aproximadamente el 95.4\% de la población:
a) ¿Entre qué puntajes exactos de CI se ubica el 95.4\% central de los postulantes evaluados?
b) ¿Aproximadamente cuántos postulantes de los 10 000 evaluados obtendrán un puntaje igual o superior a 130 (categoría de superdotación / muy superior)?
A) Entre 85 y 115; aproximadamente 500 postulantes.  
B) Entre 70 y 130; aproximadamente 230 postulantes.  
C) Entre 70 y 130; aproximadamente 460 postulantes.  
D) Entre 55 y 145; aproximadamente 100 postulantes.  
E) Entre 80 y 120; aproximadamente 300 postulantes.  

**Solución paso a paso:**
1. Parámetros de la escala de Wechsler: Media \mu = 100, Desviación estándar \sigma = 15.
2. Intervalo de \pm 2\sigma:
   - Límite inferior: \mu - 2\sigma = 100 - 2(15) = 100 - 30 = 70.
   - Límite superior: \mu + 2\sigma = 100 + 2(15) = 100 + 30 = 130.
   - El 95.4\% central se ubica rigurosamente entre CI = 70 y CI = 130.
3. Postulantes con CI \ge 130:
   - Por fuera de los dos desvíos típicos queda el 100\% - 95.4\% = 4.6\% total.
   - Debido a la simetría de la campana de Gauss, la mitad corresponde a la cola inferior (CI < 70) y la otra mitad a la cola superior (CI \ge 130):
     \% (CI \ge 130) = \frac{4.6\%}{2} = 2.3\%
   - En una población de 10\ 000 personas:
     \text{Cantidad} = 10\ 000 \times 0.023 = 230\text{ postulantes}

**Respuesta:** B) Entre 70 y 130; aproximadamente 230 postulantes.

---



# TEMA 11: INTELIGENCIA Y TEORÍAS CONTEMPORÁNEAS

---



### 4.2. Teorías Factoriales Clásicas
1. **Teoría Bifactorial de Charles Spearman (1904):**
   El rendimiento en cualquier prueba intelectual depende de dos factores:
   - **Factor General (g):** Energía mental innata, biológica y constante presente en todas las actividades intelectuales.
   - **Factores Específicos (s):** Habilidades particulares requeridas para tareas concretas (dibujo, cálculo aritmético, motricidad), dependientes del aprendizaje.
2. **Teoría de las Aptitudes Mentales Primarias de Louis Thurstone (1938):**
   Rechaza el factor g único y postula siete factores independientes:
   - Comprensión verbal (V).
   - Fluidez verbal (W).
   - Aptitud numérica (N).
   - Aptitud espacial (S).
   - Memoria asociativa (M).
   - Velocidad perceptual (P).
   - Razonamiento inductivo (R).
3. **Teoría de Raymond Cattell (Inteligencia Fluida y Cristalizada):**
   - **Inteligencia Fluida (Gf):** Capacidad biológica e innata para resolver problemas abstractos y novedosos sin aprendizaje cultural previo (razonamiento inductivo, matrices lógicas, velocidad mental). Alcanza su pico hacia los 20-25 años y **declina fisiológicamente** en la vejez por envejecimiento neuronal.
   - **Inteligencia Cristalizada (Gc):** Conjunto de conocimientos, vocabulario, habilidades y sabiduría acumuladas a través de la educación, la cultura y la experiencia de vida. **Se mantiene estable o continúa creciendo** a lo largo de la adultez y la vejez.



### 4.3. Teorías Contemporáneas
1. **Teoría de las Inteligencias Múltiples de Howard Gardner (1983):**
   Rechaza el reduccionismo academicista del CI tradicional (que solo mide lógica y lenguaje). Define la inteligencia como la capacidad de resolver problemas o crear productos valorados en un contexto cultural, postulando ocho inteligencias independientes con base neurológica:
   - **Lingüística:** Sensibilidad al significado y orden de las palabras (escritores, poetas, oradores).
   - **Lógico-Matemática:** Razonamiento abstracto, cálculo y rigor deductivo (físicos, matemáticos, programadores).
   - **Espacial:** Visualización tridimensional y transformación mental de formas (arquitectos, ajedrecistas, cirujanos, navegantes).
   - **Cinético-Corporal:** Dominio del cuerpo para expresar ideas o manipular herramientas complejas (atletas, bailarines, artesanos, cirujanos).
   - **Musical:** Discriminación de tonos, ritmos, timbres y armonía (compositores, directores de orquesta).
   - **Interpersonal:** Comprensión de las intenciones, emociones y deseos de los demás (psicólogos, docentes, diplomáticos, líderes).
   - **Intrapersonal:** Autoconocimiento profundo, autorregulación y conciencia de las propias fortalezas y límites.
   - **Naturalista (añadida en 1995):** Reconocimiento y clasificación de flora, fauna y patrones del entorno ecológico (biólogos, botánicos, agricultores).

2. **Teoría Triárquica de Robert Sternberg (1985):**
   Define la inteligencia exitosa a través de tres dimensiones interrelacionadas:
   - **Inteligencia Analítica (Componencial):** Habilidad para analizar, evaluar, comparar, juzgar y resolver problemas académicos con una única respuesta correcta (lo que mide el CI tradicional).
   - **Inteligencia Creativa (Experiencial):** Habilidad para generar ideas innovadoras, formular soluciones originales ante situaciones imprevistas y combinar información de manera novedosa.
   - **Inteligencia Práctica (Contextual):** Capacidad de adaptación, moldeamiento o selección del entorno para aplicar los conocimientos en la vida cotidiana ("sentido común" o inteligencia callejera).

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Cálculo del CI Clásico):** Si un niño de 10 años (EC = 10) resuelve los problemas de un niño de 12 años (EM = 12):
  CI = \frac{12}{10} \times 100 = 120 \quad (\text{Categoría Superior})
  Si el niño tiene 10 años (EC = 10) pero su rendimiento es de 8 años (EM = 8):
  CI = \frac{8}{10} \times 100 = 80 \quad (\text{Categoría Promedio Bajo})
- **Trampa 2 (Inteligencia Fluida vs. Cristalizada en la Vejez):** Un anciano de 75 años suele presentar lentitud para resolver rompecabezas abstractos de velocidad (baja Gf), pero posee un vocabulario extraordinario y una alta capacidad para dar consejos éticos sabios basados en su experiencia acumulada (alta Gc).
- **Trampa 3 (Gardner y la Independencia Neuronal):** La prueba de que las inteligencias de Gardner son autónomas reside en los casos de *Savants* (personas con daño cerebral severo o autismo profundo que son prodigios en cálculo o música) y en lesiones cerebrales focales (la afasia daña el lenguaje sin afectar la inteligencia espacial o musical).

---



### Problema 2: Inteligencia Fluida vs. Cristalizada de Cattell (Nivel Intermedio)
**Enunciado:** Don Aurelio tiene 78 años y es un renombrado historiador arequipeño. Al realizarle una batería neuropsicológica, se observa que en pruebas de memorización rápida de secuencias de dígitos sin sentido y matrices abstractas por tiempo cronometrado su rendimiento ha descendido notablemente en comparación con su juventud. Sin embargo, en pruebas de vocabulario culto, redacción de ensayos históricos y comprensión de textos complejos, obtiene puntuaciones casi perfectas. De acuerdo con la teoría de Raymond Cattell, el perfil cognitivo de Don Aurelio se explica porque:
A) Su inteligencia cristalizada ha disminuido mientras su inteligencia fluida aumentó.  
B) Ambas inteligencias han sufrido una involución biológica irreversible.  
C) Su inteligencia fluida se ha deteriorado por el envejecimiento biológico, mientras que su inteligencia cristalizada se mantiene conservada gracias al aprendizaje acumulado.  
D) Presenta un déficit exclusivo en su inteligencia emocional interpersonal.  
E) Su factor general g ha desaparecido por completo.  

**Solución paso a paso:**
1. La **Inteligencia Fluida (Gf)** depende de la integridad neurofisiológica y la velocidad de procesamiento; declina naturalmente a partir de la adultez media.
2. La **Inteligencia Cristalizada (Gc)** depende de la cultura, la educación y la experiencia acumulada; no declina con la edad e incluso puede incrementarse en la vejez saludable.

**Respuesta:** C) Su inteligencia fluida se ha deteriorado por el envejecimiento biológico, mientras que su inteligencia cristalizada se mantiene conservada gracias al aprendizaje acumulado.

---



### Problema 4: Teoría Triárquica de Robert Sternberg en Casos DECO (Nivel Avanzado)
**Enunciado:** Sandra es una estudiante que en el colegio siempre obtenía el primer puesto gracias a su memoria impecable para resolver exámenes teóricos de opción múltiple con respuestas exactas predefinidas (alta inteligencia analítica). No obstante, al abrir su propio negocio de repostería artesanal, se quedó estancada porque no sabía cómo rediseñar sus postres ante la competencia ni cómo negociar astutamente con proveedores en el mercado informal cuando surgían imprevistos. Según la Teoría Triárquica de Robert Sternberg, ¿qué tipos de inteligencia carece o necesita desarrollar prioritariamente Sandra para alcanzar el éxito integral?
A) Inteligencia intrapersonal y naturalista  
B) Inteligencia creativa y práctica  
C) Inteligencia emocional y fluida  
D) Inteligencia musical y espacial  
E) Inteligencia cristalizada y factor g  

**Solución paso a paso:**
1. Sandra posee una destacada **Inteligencia Analítica** (resuelve problemas académicos convencionales).
2. Carece de **Inteligencia Creativa** (para innovar, crear nuevos diseños de postres y adaptarse a la novedad).
3. Carece de **Inteligencia Práctica** (el "sentido común" aplicado al entorno cotidiano, negociación callejera y resolución de contingencias reales del mercado).

**Respuesta:** B) Inteligencia creativa y práctica.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué psicólogo propuso por primera vez la fórmula del Cociente Intelectual clásico dividiendo la Edad Mental entre la Edad Cronológica?
   - *Pista:* Psicólogo alemán de apellido Stern.
   - *Clave:* William Stern.

2. ¿Cuál es la media y la desviación estándar estandarizadas en la escala de inteligencia para adultos (WAIS) creada por David Wechsler?
   - *Pista:* Media 100 y desvío...
   - *Clave:* Media \mu = 100 y desviación estándar \sigma = 15.

3. ¿Qué inteligencia según Howard Gardner es propia de cirujanos, escultores, artesanos y deportistas que poseen un refinado control de su cuerpo y herramientas físicas?
   - *Pista:* Inteligencia del movimiento y el cuerpo.
   - *Clave:* Inteligencia cinético-corporal.

4. ¿En qué teoría de la inteligencia se postula que el rendimiento cognitivo descansa en un Factor General biológico e innato (g) y en Factores Específicos aprendidos (s)?
   - *Pista:* Teoría bifactorial de Charles Spearman.
   - *Clave:* Teoría bifactorial de Spearman.

5. En la teoría triárquica de Robert Sternberg, ¿cómo se denomina la inteligencia responsable de generar ideas originales, innovar y adaptarse con éxito a situaciones novedosas?
   - *Pista:* Inteligencia creativa o experiencial.
   - *Clave:* Inteligencia creativa (o experiencial).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Inteligencia:** Capacidad cognitiva global de procesar información, aprender de la experiencia, razonar abstractamente y adaptarse a entornos nuevos.
2. **Edad Mental (EM):** Puntuación estándar en un test que indica el nivel promedio de desarrollo intelectual alcanzado por un sujeto comparado con su grupo etario.
3. **Cociente Intelectual (CI):** Medida cuantitativa estandarizada del rendimiento intelectual individual referida a una media poblacional de 100.
4. **Factor General (g):** Núcleo biológico constante y compartido de la energía mental que subyace a todas las operaciones intelectuales (Spearman).
5. **Inteligencia Fluida (Gf):** Capacidad biológica no verbal para razonar ante problemas novedosos y abstractos, vulnerable al envejecimiento orgánico.
6. **Inteligencia Cristalizada (Gc):** Conjunto de conocimientos, vocabulario y habilidades culturales adquiridas que se mantienen o crecen con la edad.
7. **Inteligencias Múltiples:** Modelo de Howard Gardner que postula ocho formas independientes de procesamiento cognitivo y resolución de problemas.
8. **Teoría Triárquica:** Modelo de Robert Sternberg que integra las inteligencias analítica, creativa y práctica como pilares del éxito vital.
9. **Savantismo (*Síndrome del Sabio*):** Condición neurocognitiva en la que una persona con discapacidad intelectual severa manifiesta una habilidad extraordinaria y deslumbrante en un área restringida (música, cálculo, dibujo).
10. **Curva Normal de Gauss:** Modelo probabilístico simétrico en forma de campana en el cual el 68.2\% de la población se concentra a \pm 1\sigma de la media.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es la fórmula clásica del Cociente Intelectual de William Stern?**
  *R: CI = (EM / EC) \times 100.*
- **P: ¿En qué se diferencia la inteligencia fluida de la inteligencia cristalizada según Cattell?**
  *R: La fluida es biológica e innata y declina con la edad; la cristalizada es cultural, aprendida y se mantiene o crece a lo largo de la vida.*
- **P: ¿Cuáles son las ocho inteligencias formuladas por Howard Gardner?**
  *R: Lingüística, Lógico-matemática, Espacial, Cinético-corporal, Musical, Interpersonal, Intrapersonal y Naturalista.*
- **P: ¿Cuáles son los tres tipos de inteligencia de la teoría triárquica de Sternberg?**
  *R: Analítica (componencial), Creativa (experiencial) y Práctica (contextual).*
- **P: ¿Qué porcentaje aproximado de la población se encuentra en el rango de CI promedio (entre 85 y 115) según la escala de Wechsler?**
  *R: Aproximadamente el 68.2\% (a \pm 1 desviación estándar).*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Educación Inclusiva y Neurodiversidad:** La teoría de las Inteligencias Múltiples transformó el diseño curricular mundial, permitiendo que estudiantes con dificultades en matemáticas tradicionales brillen a través de talentos espaciales, artísticos o de liderazgo comunitario.
- **Inteligencia Artificial General (AGI):** El debate entre modelos factoriales (g) y modelos múltiples de Gardner es el centro de la arquitectura de la IA: ¿debe construirse un modelo fundacional unificado monolítico o un ensamble de agentes especializados modulares cooperativos?
- **Medicina Laboral y Ergonomía Cognitiva:** La evaluación de la inteligencia práctica y analítica se emplea en la selección y entrenamiento de controladores de tráfico aéreo, pilotos de combate y cirujanos de alta complejidad.

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[TEORÍAS DE LA INTELIGENCIA] --> B[Psicometría y Medición del CI]
    A --> C[Enfoques Factoriales Clásicos]
    A --> D[Enfoques Contemporáneos Múltiples]

    B --> B1[Binet-Simon: Edad Mental]
    B --> B2[Stern: CI Clásico = EM / EC * 100]
    B --> B3[Wechsler: WAIS/WISC y CI de Desviación Normal]

    C --> C1[Spearman: Teoría Bifactorial Factor g y s]
    C --> C2[Thurstone: 7 Habilidades Mentales Primarias]
    C --> C3[Cattell: Inteligencia Fluida Gf y Cristalizada Gc]

    D --> D1[Gardner: 8 Inteligencias Múltiples]
    D --> D2[Sternberg: Teoría Triárquica Analítica, Creativa, Práctica]
```

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fórmula del CI de William Stern:**
   > **"C-I = E-M / E-C x 100"** \implies *"Mi Edad Mental sobre Mi Edad Cronológica multiplicada por cien"*.
2. **Cattell: Fluida vs. Cristalizada:**
   > **Fluida = Biológica y Juvenil** (como el agua corre rápido pero se seca con la vejez).  
   > **Cristalizada = Cultural y Eterna** (como un cristal que se va formando con los años y no mengua).
3. **Triárquica de Sternberg:**
   > **"A-C-P"** \implies **A**nalítica (examen), **C**reativa (invento), **P**ráctica (calle/cotidiano).

---



### Problema 3: Teoría de las Inteligencias Múltiples de Gardner (Nivel Intermedio-Avanzado)
**Enunciado:** Relacione a cada uno de los siguientes personajes célebres con la inteligencia predominante de Howard Gardner que fundamentó su genialidad:
1. Gabriel García Márquez (escritor laureado, premio Nobel de Literatura).
2. Lionel Messi (futbolista de extraordinaria coordinación óculo-podálica y regate milimétrico).
3. Charles Darwin (naturalista que clasificó meticulosamente especies en las islas Galápagos).
4. Ludwig van Beethoven (creador de la Novena Sinfonía en estado de sordera total).
a. Inteligencia Musical  
b. Inteligencia Naturalista  
c. Inteligencia Lingüística  
d. Inteligencia Cinético-Corporal  
La relación correcta es:
A) 1c, 2d, 3b, 4a  
B) 1c, 2b, 3d, 4a  
C) 1d, 2c, 3b, 4a  
D) 1a, 2d, 3b, 4c  
E) 1b, 2d, 3c, 4a  

**Solución paso a paso:**
1. García Márquez: maestría estética de la palabra escrita \implies **Lingüística (c)**.
2. Messi: control virtuoso del cuerpo, cálculo cinestésico y destreza motora \implies **Cinético-Corporal (d)**.
3. Darwin: observación, taxonomía de flora y fauna y patrones ecológicos \implies **Naturalista (b)**.
4. Beethoven: oído interno armónico, discriminación de tonos y composición \implies **Musical (a)**.
5. Secuencia ordenada: 1c, 2d, 3b, 4a.

**Respuesta:** A) 1c, 2d, 3b, 4a.

---

---

## 3. MARCO TEÓRICO EXHAUSTIVO

### 3.1. Definición y Evolución Histórica del Concepto
- **Etimología:** Proviene del latín *intelligentia*, derivado de *inter* (entre) y *legere* (escoger, elegir, leer), denotando la capacidad de "saber elegir entre varias opciones la mejor alternativa".
- **Definición Psicológica Contemporánea:** Capacidad cognitiva global y multivariable que permite a un individuo asimilar información, razonar de manera abstracta, resolver problemas novedosos, aprender de la experiencia y adaptarse eficazmente a entornos cambiantes y desafiantes (David Wechsler / APA).
- **El Debate Herencia vs. Ambiente:**
  - Estudios en gemelos idénticos criados en ambientes separados demuestran una heredabilidad genética de entre el 50\% y el 70\% para el factor general de inteligencia.
  - El ambiente (nutrición en la primera infancia, estimulación cognitiva temprana, educación de calidad y nivel socioeconómico) modula y determina el grado de expresión de ese potencial genético dentro de un "rango de reacción".

---

---

## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS

### 4.1. Psicometría y Medición del Cociente Intelectual (CI)
1. **Escala Binet-Simon (1905):**
   Primer test científico de inteligencia, desarrollado en Francia para identificar niños con necesidades educativas especiales en escuelas públicas. Introduce el concepto de:
   - **Edad Mental (EM):** Nivel de desarrollo cognitivo alcanzado por un individuo en comparación con el promedio de su grupo de edad cronológica.
2. **Cociente Intelectual Clásico de William Stern (1912):**
   Fórmula de razón matemática:
   CI = \frac{EM}{EC} \times 100
   - EM: Edad Mental (puntuación obtenida en el test estandarizado).
   - EC: Edad Cronológica real del sujeto.
   - Si EM = EC \implies CI = 100 (rendimiento exactamente promedio).
   - Limitación: Útil solo en la niñez; pierde validez en adultos porque la edad cronológica avanza linealmente mientras que el desarrollo mental se estabiliza.
3. **Escalas de David Wechsler (WAIS, WISC, WPPSI) y CI de Desviación:**
   Wechsler reemplaza la fórmula de Stern por la **distribución normal de Gauss**, comparando el rendimiento del sujeto con personas de su mismo grupo de edad:
   - Media estandarizada: \mu = 100.
   - Desviación estándar: \sigma = 15.

```
                    Curva Normal de Gauss (CI Wechsler)
                                   100 (50%)
                                     │
                             ┌───────┴───────┐
                     85      │               │     115
             ┌───────┴───────┘               └───────┴───────┐
       70    │                                               │    130
  ─────┼─────┼───────────────┼───────────────┼───────────────┼─────┼─────
      -2σ   -1σ              0              +1σ             +2σ   +3σ
```

- **Clasificación Diagnóstica del CI (Wechsler):**
  - 130 a más: Muy superior / Superdotación intelectual (2.2\%).
  - 120 - 129: Superior.
  - 110 - 119: Promedio alto (Brillante).
  - 90 - 109: Promedio / Normal (50\% de la población).
  - 80 - 89: Promedio bajo (Torpe).
  - 70 - 79: Limítrofe / Fronterizo (*Borderline*).
  - Menor a 70: Discapacidad Intelectual (acompañada de fallas en conducta adaptativa).

### 4.2. Teorías Factoriales Clásicas
1. **Teoría Bifactorial de Charles Spearman (1904):**
   El rendimiento en cualquier prueba intelectual depende de dos factores:
   - **Factor General (g):** Energía mental innata, biológica y constante presente en todas las actividades intelectuales.
   - **Factores Específicos (s):** Habilidades particulares requeridas para tareas concretas (dibujo, cálculo aritmético, motricidad), dependientes del aprendizaje.
2. **Teoría de las Aptitudes Mentales Primarias de Louis Thurstone (1938):**
   Rechaza el factor g único y postula siete factores independientes:
   - Comprensión verbal (V).
   - Fluidez verbal (W).
   - Aptitud numérica (N).
   - Aptitud espacial (S).
   - Memoria asociativa (M).
   - Velocidad perceptual (P).
   - Razonamiento inductivo (R).
3. **Teoría de Raymond Cattell (Inteligencia Fluida y Cristalizada):**
   - **Inteligencia Fluida (Gf):** Capacidad biológica e innata para resolver problemas abstractos y novedosos sin aprendizaje cultural previo (razonamiento inductivo, matrices lógicas, velocidad mental). Alcanza su pico hacia los 20-25 años y **declina fisiológicamente** en la vejez por envejecimiento neuronal.
   - **Inteligencia Cristalizada (Gc):** Conjunto de conocimientos, vocabulario, habilidades y sabiduría acumuladas a través de la educación, la cultura y la experiencia de vida. **Se mantiene estable o continúa creciendo** a lo largo de la adultez y la vejez.

### 4.3. Teorías Contemporáneas
1. **Teoría de las Inteligencias Múltiples de Howard Gardner (1983):**
   Rechaza el reduccionismo academicista del CI tradicional (que solo mide lógica y lenguaje). Define la inteligencia como la capacidad de resolver problemas o crear productos valorados en un contexto cultural, postulando ocho inteligencias independientes con base neurológica:
   - **Lingüística:** Sensibilidad al significado y orden de las palabras (escritores, poetas, oradores).
   - **Lógico-Matemática:** Razonamiento abstracto, cálculo y rigor deductivo (físicos, matemáticos, programadores).
   - **Espacial:** Visualización tridimensional y transformación mental de formas (arquitectos, ajedrecistas, cirujanos, navegantes).
   - **Cinético-Corporal:** Dominio del cuerpo para expresar ideas o manipular herramientas complejas (atletas, bailarines, artesanos, cirujanos).
   - **Musical:** Discriminación de tonos, ritmos, timbres y armonía (compositores, directores de orquesta).
   - **Interpersonal:** Comprensión de las intenciones, emociones y deseos de los demás (psicólogos, docentes, diplomáticos, líderes).
   - **Intrapersonal:** Autoconocimiento profundo, autorregulación y conciencia de las propias fortalezas y límites.
   - **Naturalista (añadida en 1995):** Reconocimiento y clasificación de flora, fauna y patrones del entorno ecológico (biólogos, botánicos, agricultores).

2. **Teoría Triárquica de Robert Sternberg (1985):**
   Define la inteligencia exitosa a través de tres dimensiones interrelacionadas:
   - **Inteligencia Analítica (Componencial):** Habilidad para analizar, evaluar, comparar, juzgar y resolver problemas académicos con una única respuesta correcta (lo que mide el CI tradicional).
   - **Inteligencia Creativa (Experiencial):** Habilidad para generar ideas innovadoras, formular soluciones originales ante situaciones imprevistas y combinar información de manera novedosa.
   - **Inteligencia Práctica (Contextual):** Capacidad de adaptación, moldeamiento o selección del entorno para aplicar los conocimientos en la vida cotidiana ("sentido común" o inteligencia callejera).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t11_s01_c01",
                    question = "En la psicología cognitiva contemporánea, la 'Inteligencia' se define integralmente como la capacidad biopsicosocial de:",
                    options = listOf(
                        "Aprender de memoria largas listas de nombres sin equivocarse.",
                        "Obedecer ciegamente órdenes de superiores jerárquicos.",
                        "Poseer un cerebro de mayor peso en la balanza anatómica.",
                        "Aprender de la experiencia, adaptarse flexiblemente a entornos novedosos, resolver problemas complejos y pensar de manera abstracta y racional.",
                    ),
                    correctIndex = 3,
                    explanation = "La inteligencia trasciende la memorización: es la capacidad plástica de procesar información, razonar y adaptarse a demandas inéditas del medio."
                ),
                Challenge(
                    id = "psi_t11_s01_c02",
                    question = "El primer test científico de inteligencia fue creado en Francia en 1905 por Alfred Binet y Théodore Simon con el objetivo de:",
                    options = listOf(
                        "Identificar a los escolares que requerían educación especial por presentar retraso pedagógico respecto a su edad cronológica.",
                        "Seleccionar a los mejores soldados para el ejército galo.",
                        "Medir la rapidez de los reflejos en la punta de los dedos.",
                        "Predecir la riqueza monetaria que acumularía un adulto.",
                    ),
                    correctIndex = 0,
                    explanation = "El Ministerio de Educación francés comisionó a Binet para diseñar un instrumento diagnóstico que detectara alumnos con necesidades de apoyo pedagógico especial."
                ),
                Challenge(
                    id = "psi_t11_s01_c03",
                    question = "El psicólogo alemán William Stern acuñó el término 'Cociente Intelectual' (CI), cuya fórmula matemática clásica perfeccionada por Lewis Terman en la Universidad de Stanford es:",
                    options = listOf(
                        "CI = (Edad Cronológica / Edad Mental) × 100",
                        "CI = (Puntaje directo + Estatura) / Peso",
                        "CI = Aciertos - Errores / 2",
                        "CI = (Edad Mental / Edad Cronológica) × 100",
                    ),
                    correctIndex = 3,
                    explanation = "CI = (EM / EC) × 100. Si un niño de 8 años (EC) rinde en el test como uno de 10 años (EM), su CI es (10/8) × 100 = 125 (superior al promedio)."
                ),
                Challenge(
                    id = "psi_t11_s01_c04",
                    question = "En la curva normal de distribución de la inteligencia (Campana de Gauss) de las escalas Wechsler (WAIS, WISC), el rango de puntuación considerado 'Promedio o Normal' oscila entre:",
                    options = listOf(
                        "50 y 69 puntos",
                        "90 y 109 puntos (o 85-115 según un desvío estándar)",
                        "130 y 160 puntos",
                        "20 y 49 puntos",
                    ),
                    correctIndex = 1,
                    explanation = "Cerca del 68% de la población se sitúa en el rango medio entre 90 y 109 (o 85-115); puntuaciones sobre 130 corresponden a muy superior/superdotación."
                ),
                Challenge(
                    id = "psi_t11_s01_c05",
                    question = "El 'Pensamiento' como proceso cognitivo superior se caracteriza por operar internamente mediante:",
                    options = listOf(
                        "Ondas sonoras que salen por la boca sin articulación.",
                        "Movimientos musculares de los dedos de la mano.",
                        "Respuestas fisiológicas involuntarias autónomas no asociadas al razonamiento.",
                        "Representaciones mentales simbólicas, conceptos, juicios, imágenes y proposiciones que permiten manipular mentalmente la realidad.",
                    ),
                    correctIndex = 3,
                    explanation = "El pensamiento permite resolver problemas en ausencia física de los objetos, recreando modelos mentales del mundo mediante símbolos y lenguaje."
                ),
                Challenge(
                    id = "psi_t11_s01_c06",
                    question = "El 'Razonamiento Deductivo' se distingue del inductivo en que el razonamiento deductivo parte de:",
                    options = listOf(
                        "Deseos afectivos subjetivos inconscientes.",
                        "Intuiciones subjetivas no contrastadas experimentalmente.",
                        "Premisas o principios generales universales para llegar necesariamente a una conclusión particular específica (de lo general a lo particular).",
                        "Casos particulares aislados para formular una regla general universal tentativa.",
                    ),
                    correctIndex = 2,
                    explanation = "La deducción es válida si la verdad de las premisas garantiza la verdad de la conclusión: 'Todos los metales se dilatan con el calor (general); el cobre es metal; por tanto, el cobre se dilata (particular)'."
                ),
                Challenge(
                    id = "psi_t11_s01_c07",
                    question = "Por el contrario, el 'Razonamiento Inductivo' se estructura al inferir:",
                    options = listOf(
                        "Un caso individual a partir de una verdad matemática axiomática.",
                        "Una orden militar imperativa sin discusión.",
                        "Una generalización o ley universal probable a partir de la observación empírica de múltiples casos particulares repetidos (de lo particular a lo general).",
                        "Un recuerdo de la infancia remota.",
                    ),
                    correctIndex = 2,
                    explanation = "La inducción es la base del método científico experimental: tras observar que el cisne 1, 2 y 3 son blancos, se formula la hipótesis de que todos los cisnes son blancos (conclusión probable)."
                ),
                Challenge(
                    id = "psi_t11_s01_c08",
                    question = "J. P. Guilford distinguió entre 'Pensamiento Convergente' y 'Pensamiento Divergente'; este último es la base de la Creatividad porque busca:",
                    options = listOf(
                        "La única respuesta convencional correcta y tradicionalmente aceptada.",
                        "Copiar al pie de la letra las soluciones de un manual técnico.",
                        "Múltiples respuestas originales, novedosas, variadas e insólitas frente a un mismo problema (flexibilidad, fluidez y originalidad).",
                        "Callar y no proponer ninguna alternativa.",
                    ),
                    correctIndex = 2,
                    explanation = "El pensamiento divergente explora caminos inexplorados y rompe esquemas rígidos, produciendo soluciones innovadoras y artísticas."
                ),
                Challenge(
                    id = "psi_t11_s01_c09",
                    question = "En la resolución de problemas, el procedimiento sistemático que garantiza con certeza llegar a la solución correcta si se siguen paso a paso sus reglas ordenadas es el:",
                    options = listOf(
                        "Heurístico intuitivo",
                        "Ensayo y error ciego",
                        "Algoritmo",
                        "Presentimiento esotérico",
                    ),
                    correctIndex = 2,
                    explanation = "Un algoritmo es un conjunto prescrito de instrucciones lógicas paso a paso (como una fórmula matemática o receta) que garantiza la solución infalible."
                ),
                Challenge(
                    id = "psi_t11_s01_c10",
                    question = "Los 'Heurísticos' (estudiados por Kahneman y Tversky) son 'atajos mentales' cognitivos que el cerebro utiliza habitualmente porque:",
                    options = listOf(
                        "Permiten calcular ecuaciones de décimo grado en un milisegundo.",
                        "Ahorran tiempo y esfuerzo mental para tomar decisiones rápidas bajo incertidumbre, aunque pueden inducir a sesgos cognitivos y juicios erróneos.",
                        "Garantizan siempre la perfección matemática de las decisiones.",
                        "Eliminan para siempre la memoria a corto plazo.",
                    ),
                    correctIndex = 1,
                    explanation = "Los heurísticos de disponibilidad y representatividad simplifican la complejidad del mundo para decidir velozmente, pero a costa de incurrir en sesgos sistemáticos."
                ),
            )
        ),
        LessonNode(
            id = "psi_t11_s02",
            subjectId = "psicologia",
            semana = 11,
            subtema = "11.2",
            title = "4.2. Teorías Factoriales Clásicas",
            theory = LessonTheory(
                content = """# TEMA 11: INTELIGENCIA Y TEORÍAS CONTEMPORÁNEAS

---



## 2. MAPA CONCEPTUAL SINTÉTICO (MERMAID)

```mermaid
graph TD
    A[TEORÍAS DE LA INTELIGENCIA] --> B[Psicometría y Medición del CI]
    A --> C[Enfoques Factoriales Clásicos]
    A --> D[Enfoques Contemporáneos Múltiples]

    B --> B1[Binet-Simon: Edad Mental]
    B --> B2[Stern: CI Clásico = EM / EC * 100]
    B --> B3[Wechsler: WAIS/WISC y CI de Desviación Normal]

    C --> C1[Spearman: Teoría Bifactorial Factor g y s]
    C --> C2[Thurstone: 7 Habilidades Mentales Primarias]
    C --> C3[Cattell: Inteligencia Fluida Gf y Cristalizada Gc]

    D --> D1[Gardner: 8 Inteligencias Múltiples]
    D --> D2[Sternberg: Teoría Triárquica Analítica, Creativa, Práctica]
```

---



### 3.1. Definición y Evolución Histórica del Concepto
- **Etimología:** Proviene del latín *intelligentia*, derivado de *inter* (entre) y *legere* (escoger, elegir, leer), denotando la capacidad de "saber elegir entre varias opciones la mejor alternativa".
- **Definición Psicológica Contemporánea:** Capacidad cognitiva global y multivariable que permite a un individuo asimilar información, razonar de manera abstracta, resolver problemas novedosos, aprender de la experiencia y adaptarse eficazmente a entornos cambiantes y desafiantes (David Wechsler / APA).
- **El Debate Herencia vs. Ambiente:**
  - Estudios en gemelos idénticos criados en ambientes separados demuestran una heredabilidad genética de entre el 50\% y el 70\% para el factor general de inteligencia.
  - El ambiente (nutrición en la primera infancia, estimulación cognitiva temprana, educación de calidad y nivel socioeconómico) modula y determina el grado de expresión de ese potencial genético dentro de un "rango de reacción".

---



## 4. LEYES, ECUACIONES Y MODELOS MATEMÁTICOS



### 4.2. Teorías Factoriales Clásicas
1. **Teoría Bifactorial de Charles Spearman (1904):**
   El rendimiento en cualquier prueba intelectual depende de dos factores:
   - **Factor General (g):** Energía mental innata, biológica y constante presente en todas las actividades intelectuales.
   - **Factores Específicos (s):** Habilidades particulares requeridas para tareas concretas (dibujo, cálculo aritmético, motricidad), dependientes del aprendizaje.
2. **Teoría de las Aptitudes Mentales Primarias de Louis Thurstone (1938):**
   Rechaza el factor g único y postula siete factores independientes:
   - Comprensión verbal (V).
   - Fluidez verbal (W).
   - Aptitud numérica (N).
   - Aptitud espacial (S).
   - Memoria asociativa (M).
   - Velocidad perceptual (P).
   - Razonamiento inductivo (R).
3. **Teoría de Raymond Cattell (Inteligencia Fluida y Cristalizada):**
   - **Inteligencia Fluida (Gf):** Capacidad biológica e innata para resolver problemas abstractos y novedosos sin aprendizaje cultural previo (razonamiento inductivo, matrices lógicas, velocidad mental). Alcanza su pico hacia los 20-25 años y **declina fisiológicamente** en la vejez por envejecimiento neuronal.
   - **Inteligencia Cristalizada (Gc):** Conjunto de conocimientos, vocabulario, habilidades y sabiduría acumuladas a través de la educación, la cultura y la experiencia de vida. **Se mantiene estable o continúa creciendo** a lo largo de la adultez y la vejez.



### 4.3. Teorías Contemporáneas
1. **Teoría de las Inteligencias Múltiples de Howard Gardner (1983):**
   Rechaza el reduccionismo academicista del CI tradicional (que solo mide lógica y lenguaje). Define la inteligencia como la capacidad de resolver problemas o crear productos valorados en un contexto cultural, postulando ocho inteligencias independientes con base neurológica:
   - **Lingüística:** Sensibilidad al significado y orden de las palabras (escritores, poetas, oradores).
   - **Lógico-Matemática:** Razonamiento abstracto, cálculo y rigor deductivo (físicos, matemáticos, programadores).
   - **Espacial:** Visualización tridimensional y transformación mental de formas (arquitectos, ajedrecistas, cirujanos, navegantes).
   - **Cinético-Corporal:** Dominio del cuerpo para expresar ideas o manipular herramientas complejas (atletas, bailarines, artesanos, cirujanos).
   - **Musical:** Discriminación de tonos, ritmos, timbres y armonía (compositores, directores de orquesta).
   - **Interpersonal:** Comprensión de las intenciones, emociones y deseos de los demás (psicólogos, docentes, diplomáticos, líderes).
   - **Intrapersonal:** Autoconocimiento profundo, autorregulación y conciencia de las propias fortalezas y límites.
   - **Naturalista (añadida en 1995):** Reconocimiento y clasificación de flora, fauna y patrones del entorno ecológico (biólogos, botánicos, agricultores).

2. **Teoría Triárquica de Robert Sternberg (1985):**
   Define la inteligencia exitosa a través de tres dimensiones interrelacionadas:
   - **Inteligencia Analítica (Componencial):** Habilidad para analizar, evaluar, comparar, juzgar y resolver problemas académicos con una única respuesta correcta (lo que mide el CI tradicional).
   - **Inteligencia Creativa (Experiencial):** Habilidad para generar ideas innovadoras, formular soluciones originales ante situaciones imprevistas y combinar información de manera novedosa.
   - **Inteligencia Práctica (Contextual):** Capacidad de adaptación, moldeamiento o selección del entorno para aplicar los conocimientos en la vida cotidiana ("sentido común" o inteligencia callejera).

---



## 5. NEMOTECNIAS PREUNIVERSITARIAS

1. **Fórmula del CI de William Stern:**
   > **"C-I = E-M / E-C x 100"** \implies *"Mi Edad Mental sobre Mi Edad Cronológica multiplicada por cien"*.
2. **Cattell: Fluida vs. Cristalizada:**
   > **Fluida = Biológica y Juvenil** (como el agua corre rápido pero se seca con la vejez).  
   > **Cristalizada = Cultural y Eterna** (como un cristal que se va formando con los años y no mengua).
3. **Triárquica de Sternberg:**
   > **"A-C-P"** \implies **A**nalítica (examen), **C**reativa (invento), **P**ráctica (calle/cotidiano).

---



## 6. HACKING DE ADMISIÓN Y ERRORES TRAMPA FRECUENTES

- **Trampa 1 (Cálculo del CI Clásico):** Si un niño de 10 años (EC = 10) resuelve los problemas de un niño de 12 años (EM = 12):
  CI = \frac{12}{10} \times 100 = 120 \quad (\text{Categoría Superior})
  Si el niño tiene 10 años (EC = 10) pero su rendimiento es de 8 años (EM = 8):
  CI = \frac{8}{10} \times 100 = 80 \quad (\text{Categoría Promedio Bajo})
- **Trampa 2 (Inteligencia Fluida vs. Cristalizada en la Vejez):** Un anciano de 75 años suele presentar lentitud para resolver rompecabezas abstractos de velocidad (baja Gf), pero posee un vocabulario extraordinario y una alta capacidad para dar consejos éticos sabios basados en su experiencia acumulada (alta Gc).
- **Trampa 3 (Gardner y la Independencia Neuronal):** La prueba de que las inteligencias de Gardner son autónomas reside en los casos de *Savants* (personas con daño cerebral severo o autismo profundo que son prodigios en cálculo o música) y en lesiones cerebrales focales (la afasia daña el lenguaje sin afectar la inteligencia espacial o musical).

---



### Problema 2: Inteligencia Fluida vs. Cristalizada de Cattell (Nivel Intermedio)
**Enunciado:** Don Aurelio tiene 78 años y es un renombrado historiador arequipeño. Al realizarle una batería neuropsicológica, se observa que en pruebas de memorización rápida de secuencias de dígitos sin sentido y matrices abstractas por tiempo cronometrado su rendimiento ha descendido notablemente en comparación con su juventud. Sin embargo, en pruebas de vocabulario culto, redacción de ensayos históricos y comprensión de textos complejos, obtiene puntuaciones casi perfectas. De acuerdo con la teoría de Raymond Cattell, el perfil cognitivo de Don Aurelio se explica porque:
A) Su inteligencia cristalizada ha disminuido mientras su inteligencia fluida aumentó.  
B) Ambas inteligencias han sufrido una involución biológica irreversible.  
C) Su inteligencia fluida se ha deteriorado por el envejecimiento biológico, mientras que su inteligencia cristalizada se mantiene conservada gracias al aprendizaje acumulado.  
D) Presenta un déficit exclusivo en su inteligencia emocional interpersonal.  
E) Su factor general g ha desaparecido por completo.  

**Solución paso a paso:**
1. La **Inteligencia Fluida (Gf)** depende de la integridad neurofisiológica y la velocidad de procesamiento; declina naturalmente a partir de la adultez media.
2. La **Inteligencia Cristalizada (Gc)** depende de la cultura, la educación y la experiencia acumulada; no declina con la edad e incluso puede incrementarse en la vejez saludable.

**Respuesta:** C) Su inteligencia fluida se ha deteriorado por el envejecimiento biológico, mientras que su inteligencia cristalizada se mantiene conservada gracias al aprendizaje acumulado.

---



### Problema 3: Teoría de las Inteligencias Múltiples de Gardner (Nivel Intermedio-Avanzado)
**Enunciado:** Relacione a cada uno de los siguientes personajes célebres con la inteligencia predominante de Howard Gardner que fundamentó su genialidad:
1. Gabriel García Márquez (escritor laureado, premio Nobel de Literatura).
2. Lionel Messi (futbolista de extraordinaria coordinación óculo-podálica y regate milimétrico).
3. Charles Darwin (naturalista que clasificó meticulosamente especies en las islas Galápagos).
4. Ludwig van Beethoven (creador de la Novena Sinfonía en estado de sordera total).
a. Inteligencia Musical  
b. Inteligencia Naturalista  
c. Inteligencia Lingüística  
d. Inteligencia Cinético-Corporal  
La relación correcta es:
A) 1c, 2d, 3b, 4a  
B) 1c, 2b, 3d, 4a  
C) 1d, 2c, 3b, 4a  
D) 1a, 2d, 3b, 4c  
E) 1b, 2d, 3c, 4a  

**Solución paso a paso:**
1. García Márquez: maestría estética de la palabra escrita \implies **Lingüística (c)**.
2. Messi: control virtuoso del cuerpo, cálculo cinestésico y destreza motora \implies **Cinético-Corporal (d)**.
3. Darwin: observación, taxonomía de flora y fauna y patrones ecológicos \implies **Naturalista (b)**.
4. Beethoven: oído interno armónico, discriminación de tonos y composición \implies **Musical (a)**.
5. Secuencia ordenada: 1c, 2d, 3b, 4a.

**Respuesta:** A) 1c, 2d, 3b, 4a.

---



### Problema 4: Teoría Triárquica de Robert Sternberg en Casos DECO (Nivel Avanzado)
**Enunciado:** Sandra es una estudiante que en el colegio siempre obtenía el primer puesto gracias a su memoria impecable para resolver exámenes teóricos de opción múltiple con respuestas exactas predefinidas (alta inteligencia analítica). No obstante, al abrir su propio negocio de repostería artesanal, se quedó estancada porque no sabía cómo rediseñar sus postres ante la competencia ni cómo negociar astutamente con proveedores en el mercado informal cuando surgían imprevistos. Según la Teoría Triárquica de Robert Sternberg, ¿qué tipos de inteligencia carece o necesita desarrollar prioritariamente Sandra para alcanzar el éxito integral?
A) Inteligencia intrapersonal y naturalista  
B) Inteligencia creativa y práctica  
C) Inteligencia emocional y fluida  
D) Inteligencia musical y espacial  
E) Inteligencia cristalizada y factor g  

**Solución paso a paso:**
1. Sandra posee una destacada **Inteligencia Analítica** (resuelve problemas académicos convencionales).
2. Carece de **Inteligencia Creativa** (para innovar, crear nuevos diseños de postres y adaptarse a la novedad).
3. Carece de **Inteligencia Práctica** (el "sentido común" aplicado al entorno cotidiano, negociación callejera y resolución de contingencias reales del mercado).

**Respuesta:** B) Inteligencia creativa y práctica.

---



## 8. 5 PROBLEMAS PROPUESTOS

1. ¿Qué psicólogo propuso por primera vez la fórmula del Cociente Intelectual clásico dividiendo la Edad Mental entre la Edad Cronológica?
   - *Pista:* Psicólogo alemán de apellido Stern.
   - *Clave:* William Stern.

2. ¿Cuál es la media y la desviación estándar estandarizadas en la escala de inteligencia para adultos (WAIS) creada por David Wechsler?
   - *Pista:* Media 100 y desvío...
   - *Clave:* Media \mu = 100 y desviación estándar \sigma = 15.

3. ¿Qué inteligencia según Howard Gardner es propia de cirujanos, escultores, artesanos y deportistas que poseen un refinado control de su cuerpo y herramientas físicas?
   - *Pista:* Inteligencia del movimiento y el cuerpo.
   - *Clave:* Inteligencia cinético-corporal.

4. ¿En qué teoría de la inteligencia se postula que el rendimiento cognitivo descansa en un Factor General biológico e innato (g) y en Factores Específicos aprendidos (s)?
   - *Pista:* Teoría bifactorial de Charles Spearman.
   - *Clave:* Teoría bifactorial de Spearman.

5. En la teoría triárquica de Robert Sternberg, ¿cómo se denomina la inteligencia responsable de generar ideas originales, innovar y adaptarse con éxito a situaciones novedosas?
   - *Pista:* Inteligencia creativa o experiencial.
   - *Clave:* Inteligencia creativa (o experiencial).

---



## 9. GLOSARIO TÉCNICO ESPECIALIZADO

1. **Inteligencia:** Capacidad cognitiva global de procesar información, aprender de la experiencia, razonar abstractamente y adaptarse a entornos nuevos.
2. **Edad Mental (EM):** Puntuación estándar en un test que indica el nivel promedio de desarrollo intelectual alcanzado por un sujeto comparado con su grupo etario.
3. **Cociente Intelectual (CI):** Medida cuantitativa estandarizada del rendimiento intelectual individual referida a una media poblacional de 100.
4. **Factor General (g):** Núcleo biológico constante y compartido de la energía mental que subyace a todas las operaciones intelectuales (Spearman).
5. **Inteligencia Fluida (Gf):** Capacidad biológica no verbal para razonar ante problemas novedosos y abstractos, vulnerable al envejecimiento orgánico.
6. **Inteligencia Cristalizada (Gc):** Conjunto de conocimientos, vocabulario y habilidades culturales adquiridas que se mantienen o crecen con la edad.
7. **Inteligencias Múltiples:** Modelo de Howard Gardner que postula ocho formas independientes de procesamiento cognitivo y resolución de problemas.
8. **Teoría Triárquica:** Modelo de Robert Sternberg que integra las inteligencias analítica, creativa y práctica como pilares del éxito vital.
9. **Savantismo (*Síndrome del Sabio*):** Condición neurocognitiva en la que una persona con discapacidad intelectual severa manifiesta una habilidad extraordinaria y deslumbrante en un área restringida (música, cálculo, dibujo).
10. **Curva Normal de Gauss:** Modelo probabilístico simétrico en forma de campana en el cual el 68.2\% de la población se concentra a \pm 1\sigma de la media.

---



## 10. FLASHCARDS DE REPASO RÁPIDO

- **P: ¿Cuál es la fórmula clásica del Cociente Intelectual de William Stern?**
  *R: CI = (EM / EC) \times 100.*
- **P: ¿En qué se diferencia la inteligencia fluida de la inteligencia cristalizada según Cattell?**
  *R: La fluida es biológica e innata y declina con la edad; la cristalizada es cultural, aprendida y se mantiene o crece a lo largo de la vida.*
- **P: ¿Cuáles son las ocho inteligencias formuladas por Howard Gardner?**
  *R: Lingüística, Lógico-matemática, Espacial, Cinético-corporal, Musical, Interpersonal, Intrapersonal y Naturalista.*
- **P: ¿Cuáles son los tres tipos de inteligencia de la teoría triárquica de Sternberg?**
  *R: Analítica (componencial), Creativa (experiencial) y Práctica (contextual).*
- **P: ¿Qué porcentaje aproximado de la población se encuentra en el rango de CI promedio (entre 85 y 115) según la escala de Wechsler?**
  *R: Aproximadamente el 68.2\% (a \pm 1 desviación estándar).*

---



## 11. CONEXIONES INTERDISCIPLINARIAS Y APLICACIÓN REAL

- **Educación Inclusiva y Neurodiversidad:** La teoría de las Inteligencias Múltiples transformó el diseño curricular mundial, permitiendo que estudiantes con dificultades en matemáticas tradicionales brillen a través de talentos espaciales, artísticos o de liderazgo comunitario.
- **Inteligencia Artificial General (AGI):** El debate entre modelos factoriales (g) y modelos múltiples de Gardner es el centro de la arquitectura de la IA: ¿debe construirse un modelo fundacional unificado monolítico o un ensamble de agentes especializados modulares cooperativos?
- **Medicina Laboral y Ergonomía Cognitiva:** La evaluación de la inteligencia práctica y analítica se emplea en la selección y entrenamiento de controladores de tráfico aéreo, pilotos de combate y cirujanos de alta complejidad.

---



### 4.1. Psicometría y Medición del Cociente Intelectual (CI)
1. **Escala Binet-Simon (1905):**
   Primer test científico de inteligencia, desarrollado en Francia para identificar niños con necesidades educativas especiales en escuelas públicas. Introduce el concepto de:
   - **Edad Mental (EM):** Nivel de desarrollo cognitivo alcanzado por un individuo en comparación con el promedio de su grupo de edad cronológica.
2. **Cociente Intelectual Clásico de William Stern (1912):**
   Fórmula de razón matemática:
   CI = \frac{EM}{EC} \times 100
   - EM: Edad Mental (puntuación obtenida en el test estandarizado).
   - EC: Edad Cronológica real del sujeto.
   - Si EM = EC \implies CI = 100 (rendimiento exactamente promedio).
   - Limitación: Útil solo en la niñez; pierde validez en adultos porque la edad cronológica avanza linealmente mientras que el desarrollo mental se estabiliza.
3. **Escalas de David Wechsler (WAIS, WISC, WPPSI) y CI de Desviación:**
   Wechsler reemplaza la fórmula de Stern por la **distribución normal de Gauss**, comparando el rendimiento del sujeto con personas de su mismo grupo de edad:
   - Media estandarizada: \mu = 100.
   - Desviación estándar: \sigma = 15.

```
                    Curva Normal de Gauss (CI Wechsler)
                                   100 (50%)
                                     │
                             ┌───────┴───────┐
                     85      │               │     115
             ┌───────┴───────┘               └───────┴───────┐
       70    │                                               │    130
  ─────┼─────┼───────────────┼───────────────┼───────────────┼─────┼─────
      -2σ   -1σ              0              +1σ             +2σ   +3σ
```

- **Clasificación Diagnóstica del CI (Wechsler):**
  - 130 a más: Muy superior / Superdotación intelectual (2.2\%).
  - 120 - 129: Superior.
  - 110 - 119: Promedio alto (Brillante).
  - 90 - 109: Promedio / Normal (50\% de la población).
  - 80 - 89: Promedio bajo (Torpe).
  - 70 - 79: Limítrofe / Fronterizo (*Borderline*).
  - Menor a 70: Discapacidad Intelectual (acompañada de fallas en conducta adaptativa).



### Problema 1: Cálculo Psicométrico de Stern (Nivel Básico)
**Enunciado:** Un psicólogo educativo evalúa a un niño de 8 años de edad cronológica con el test Stanford-Binet. El reporte final indica que el menor resolvió exitosamente todas las pruebas equivalentes a un nivel de desarrollo mental correspondiente a un niño de 10 años. Calcule el Cociente Intelectual (CI) del menor e indique su categoría diagnóstica según la escala clásica.
A) CI = 80 (Promedio bajo)  
B) CI = 100 (Promedio normal)  
C) CI = 125 (Superior)  
D) CI = 135 (Muy superior)  
E) CI = 115 (Promedio alto)  

**Solución paso a paso:**
1. Identificamos los datos psicométricos:
   - Edad Cronológica (EC): 8\text{ años}.
   - Edad Mental (EM): 10\text{ años}.
2. Aplicamos la fórmula clásica de William Stern:
   CI = \frac{EM}{EC} \times 100 = \frac{10}{8} \times 100 = 1.25 \times 100 = 125
3. Un CI de 125 se ubica en el rango de 120 - 129, correspondiente a la categoría **Superior**.

**Respuesta:** C) CI = 125 (Superior).

---"""
            ),
            challenges = listOf(
                Challenge(
                    id = "psi_t11_s02_c01",
                    question = "La 'Teoría Bifactorial de la Inteligencia' formulada en 1904 por el psicólogo británico Charles Spearman postula que el rendimiento intelectual se sustenta en:",
                    options = listOf(
                        "Ocho inteligencias totalmente independientes entre sí.",
                        "La memoria a corto plazo y la memoria a largo plazo.",
                        "El tamaño del cráneo y la velocidad de digestión.",
                        "Un Factor General ('g') de energía mental subyacente a toda actividad cognitiva y Factores Específicos ('s') propios de cada tarea particular.",
                    ),
                    correctIndex = 3,
                    explanation = "Spearman descubrió que quienes destacan en una prueba intelectual tienden a puntuar bien en las demás, deduciendo la existencia del factor 'g' general."
                ),
                Challenge(
                    id = "psi_t11_s02_c02",
                    question = "Raymond Cattell reformuló el factor 'g' dividiendo la inteligencia en dos vertientes; la 'Inteligencia Fluida' (Gf) se caracteriza por ser:",
                    options = listOf(
                        "La capacidad innata, biológica y no verbal de razonar con rapidez, resolver problemas abstractos novedosos y adaptarse sin depender de aprendizajes culturales previos.",
                        "El cúmulo de conocimientos culturales y vocabulario adquirido a través de la educación formal a lo largo de los años.",
                        "La facilidad para nadar en piscinas olímpicas.",
                        "El recuerdo de fechas de efemérides patrióticas.",
                    ),
                    correctIndex = 0,
                    explanation = "La inteligencia fluida alcanza su punto máximo en la juventud temprana y decae con el envejecimiento cerebral biológico."
                ),
                Challenge(
                    id = "psi_t11_s02_c03",
                    question = "Por el contrario, la 'Inteligencia Cristalizada' (Gc) en el modelo de Cattell representa:",
                    options = listOf(
                        "La amplitud y profundidad de los conocimientos acumulados, habilidades verbales y sabiduría práctica adquirida por la educación y la experiencia social, pudiendo incrementarse durante la adultez.",
                        "La velocidad pura de conducción nerviosa sinapsis a sinapsis.",
                        "La rigidez mental patológica que rechaza nuevas ideas.",
                        "La agudeza visual para leer letras pequeñas.",
                    ),
                    correctIndex = 0,
                    explanation = "La inteligencia cristalizada se enriquece continuamente con los años mediante la lectura, el trabajo profesional y la madurez cultural acumulada."
                ),
                Challenge(
                    id = "psi_t11_s02_c04",
                    question = "La revolucionaria 'Teoría de las Inteligencias Múltiples' propuesta en 1983 por Howard Gardner en la Universidad de Harvard rechazó el CI único tradicional al postular que:",
                    options = listOf(
                        "Todos los seres humanos poseen exactamente el mismo talento intelectual.",
                        "Existen múltiples inteligencias autónomas y modulares (al menos ocho), cada una con sus propios sistemas neurobiológicos y formas de expresión cultural.",
                        "La inteligencia es una sustancia química presente en el cerebelo.",
                        "Solo la inteligencia lógico-matemática merece llamarse inteligencia.",
                    ),
                    correctIndex = 1,
                    explanation = "Gardner demostró que un músico virtuoso, un atleta olímpico o un líder empático poseen inteligencias brillantes aunque no destaquen en tests de lógica escrita."
                ),
                Challenge(
                    id = "psi_t11_s02_c05",
                    question = "En la tipología de Gardner, un gran novelista como Mario Vargas Llosa o un poeta como César Vallejo destacan primordialmente en la:",
                    options = listOf(
                        "Inteligencia Cinético-Corporal",
                        "Inteligencia Espacial",
                        "Inteligencia Naturalista",
                        "Inteligencia Lingüístico-Verbal",
                    ),
                    correctIndex = 3,
                    explanation = "La inteligencia lingüística implica maestría y sensibilidad hacia la semántica, sintaxis, fonética y pragmática del lenguaje escrito y oral."
                ),
                Challenge(
                    id = "psi_t11_s02_c06",
                    question = "Un campeón de ajedrez, un cirujano plástico o un arquitecto que diseña planos tridimensionales manifiestan un alto desarrollo de la:",
                    options = listOf(
                        "Inteligencia Musical",
                        "Inteligencia Espacial o Viso-espacial",
                        "Inteligencia Interpersonal",
                        "Inteligencia Intrapersonal",
                    ),
                    correctIndex = 1,
                    explanation = "La inteligencia espacial es la habilidad para recrear, rotar y manipular mentalmente objetos e imágenes en el espacio bidimensional y tridimensional."
                ),
                Challenge(
                    id = "psi_t11_s02_c07",
                    question = "Gardner divide la esfera personal en dos inteligencias íntimas; la 'Inteligencia Intrapersonal' se define como la capacidad de:",
                    options = listOf(
                        "Seducir a multitudes para ganar elecciones presidenciales.",
                        "Tocar el violonchelo en una orquesta sinfónica.",
                        "Construir un modelo mental lúcido, preciso y verídico de uno mismo, conociendo las propias emociones, fortalezas, límites y orientando la propia conducta.",
                        "Clasificar especies de mariposas en la selva.",
                    ),
                    correctIndex = 2,
                    explanation = "La inteligencia intrapersonal es el autoconocimiento reflexivo profundo, base de la autorregulación y madurez existencial de la persona."
                ),
                Challenge(
                    id = "psi_t11_s02_c08",
                    question = "La 'Inteligencia Interpersonal' en el modelo de Gardner se expresa a través de la habilidad para:",
                    options = listOf(
                        "Escribir poemas en dialectos antiguos.",
                        "Entender, percibir y discriminar los estados de ánimo, intenciones, motivaciones y sentimientos de otras personas, actuando como líder o mediador empático.",
                        "Realizar cálculos integrales y diferenciales sin calculadora.",
                        "Trepar árboles y sobrevivir en el desierto.",
                    ),
                    correctIndex = 1,
                    explanation = "Grandes terapeutas, maestros, diplomáticos y líderes sociales exhiben una sobresaliente inteligencia interpersonal para conectar con las almas ajenas."
                ),
                Challenge(
                    id = "psi_t11_s02_c09",
                    question = "Robert Sternberg formuló la 'Teoría Triárquica de la Inteligencia', la cual sostiene que la inteligencia humana abarca tres dimensiones complementarias denominadas:",
                    options = listOf(
                        "Analítica (académica), Creativa (sintética) y Práctica (contextual o de la vida diaria).",
                        "Oral, anal y genital.",
                        "Física, química y biológica.",
                        "Consciente, preconsciente e inconsciente.",
                    ),
                    correctIndex = 0,
                    explanation = "Sternberg señala que el éxito en la vida requiere no solo sacar buenas notas (analítica), sino generar ideas nuevas (creativa) y saber resolver problemas prácticos callejeros (práctica)."
                ),
                Challenge(
                    id = "psi_t11_s02_c10",
                    question = "La 'Inteligencia Práctica' o 'sentido común de la calle' (street smarts) en la teoría triárquica de Sternberg permite al individuo:",
                    options = listOf(
                        "Adaptarse con éxito a las demandas cotidianas de su entorno real, seleccionando ambientes favorables y moldeando el contexto para resolver problemas del día a día.",
                        "Analizar y descomponer problemas abstractos para evaluar hipótesis lógicas formales (inteligencia analítica).",
                        "Generar ideas novedosas y sintetizar soluciones originales frente a situaciones desconocidas (inteligencia creativa).",
                        "Memorizar extensas listas léxicas sin procesar el significado contextual de las palabras.",
                    ),
                    correctIndex = 0,
                    explanation = "La inteligencia práctica es la pericia contextual pragmática: saber cómo desenvolverse en un empleo, negociar con un vecino o resolver emergencias domésticas."
                ),
            )
        )
    )
}
