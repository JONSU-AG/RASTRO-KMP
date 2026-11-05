# Auditoría por muestreo de Aprender — 01/11/2026

## Método y límites

Se inspeccionaron 60 niveles de recursos nuevos: el primero disponible y dos elegidos al azar por materia, en las 20 materias. Selección reproducible con random.Random("20261101-" + subjectId), sobre rutas ordenadas. Biología comienza en 8.1 en estos recursos; el legacy 1–7 no forma parte de esta muestra. No se ejecutó Android. Se contrastaron títulos, encabezados, enunciados, opciones y explicaciones; no se resolvieron todas las preguntas del banco ni se certifica que las materias sin alertas estén correctas.

Además, una búsqueda sobre todos los questions.json de esos recursos nuevos detectó 1.356 preguntas con los textos de relleno «marco conceptual desarrollado» o «principio formal deducido». Es el conteo previo a corregir Física 1.1; no incluye todos los tipos de error ni los catálogos legacy. Tras sustituir los dos rellenos de 1.1 quedan 1.354 coincidencias.

| Materia | Niveles en recursos nuevos | Preguntas | Coincidencias de relleno antes de corregir | Observación de la muestra |
|---|---:|---:|---:|---|
| algebra | 32 | 320 | 287 | Relleno genérico y enunciados truncados (por ejemplo, se solicita simplificar un conjunto que no aparece). No basta cambiar tipografía. |
| aritmetica | 26 | 260 | 125 | Relleno genérico y preguntas cuyo conjunto/arreglo inicial falta; hay también preguntas numéricas completas que requieren resolver individualmente. |
| biologia | 24 | 296 | 0 | Sin el patrón genérico buscado. En los ejemplos revisados se reconocen preguntas relacionadas con digestión/ecosistemas/ciclos; no certifica todo el catálogo. |
| civica | 22 | 220 | 0 | Sin patrón genérico. La muestra está vinculada con persona, democracia y garantías; exige mantener contraste legal actualizado en revisión académica completa. |
| comprension_lectora | 16 | 160 | 0 | Título de 7.2 sobre supresión de oraciones, pero primeras preguntas sobre tono e intención del autor: desajuste temático confirmado en la muestra. |
| filosofia | 26 | 260 | 0 | Sin patrón genérico; correspondencia temática aparente entre actitud filosófica, principios lógicos y filosofía antigua. Atribuciones históricas no auditadas exhaustivamente. |
| fisica | 24 | 240 | 150 | Primer nivel con ecuación ausente, tres claves inconsistentes, dos rellenos y sección de vectores vacía. Corregido solo 1.1. Otros niveles conservan relleno pendiente. |
| geografia | 26 | 260 | 0 | Sin patrón genérico. La muestra trata historia de geografía, regiones y geopolítica; nombres/datos históricos necesitan verificación individual. |
| geometria | 22 | 220 | 195 | Gran cantidad de relleno, incluido el primer nivel; no puede considerarse un banco revisado solo por compilar. |
| historia_peru | 10 | 140 | 0 | Sin patrón genérico; temas de poblamiento, Tiahuanaco y conquista relacionados con sus títulos. La certeza factual de todas las opciones queda pendiente. |
| historia_universal | 12 | 168 | 0 | Sin patrón genérico; muestra sobre hominización, revoluciones y guerras. No equivale a revisión historiográfica completa. |
| ingles | 14 | 140 | 0 | Sin patrón genérico, pero preguntas referidas a una oración/pasaje no incluido y tablas TeX incompletas en la muestra: falta contexto de resolución. |
| lenguaje | 19 | 194 | 0 | Sin patrón genérico; muestra de comunicación y funciones del lenguaje con correspondencia temática aparente. No se certifican todas las claves. |
| literatura | 12 | 120 | 0 | Sin patrón genérico buscado; pendiente contrastar fuentes/obras y claves más allá del muestreo. |
| psicologia | 29 | 290 | 0 | Sin patrón genérico; contenido de escuelas psicológicas y desarrollo humano con correspondencia temática aparente. Teorías históricas no deben confundirse con diagnóstico clínico. |
| quimica | 32 | 328 | 254 | Preguntas que incluyen la propia explicación de la trampa en el enunciado y relleno genérico; requieren revisión pedagógica del contenido. |
| raz_logico | 18 | 180 | 97 | Faltan proposiciones/fragmentos en algunos enunciados y hay relleno; no basta renderizar símbolos. |
| raz_matematico | 14 | 140 | 63 | Faltan sucesiones/arreglos en las primeras preguntas y hay relleno. No se inventan los datos ausentes. |
| raz_verbal | 16 | 160 | 0 | Sin patrón genérico; sinonimia, presuposiciones y anfibología reconocibles en la muestra; revisión de ambigüedad y alternativas pendiente. |
| trigonometria | 24 | 240 | 185 | Relleno genérico abundante; algunas preguntas completas y otras simbólicas exigen revisión de claves por resolución, no solo sintaxis. |

## Niveles seleccionados

- algebra: `algebra/semana01/1.1`, `algebra/semana11/11.2`, `algebra/semana02/2.1`
- aritmetica: `aritmetica/semana01/1.1`, `aritmetica/semana13/13.2`, `aritmetica/semana03/3.1`
- biologia: `biologia/semana08/8.1`, `biologia/semana13/13.1`, `biologia/semana13/13.2`
- civica: `civica/semana01/1.1`, `civica/semana05/5.1`, `civica/semana06/6.2`
- comprension_lectora: `comprension_lectora/semana01/1.1`, `comprension_lectora/semana07/7.2`, `comprension_lectora/semana02/2.2`
- filosofia: `filosofia/semana01/1.1`, `filosofia/semana04/4.1`, `filosofia/semana06/6.1`
- fisica: `fisica/semana01/1.1`, `fisica/semana05/5.1`, `fisica/semana12/12.1`
- geografia: `geografia/semana01/1.1`, `geografia/semana13/13.2`, `geografia/semana08/8.1`
- geometria: `geometria/semana01/1.1`, `geometria/semana09/9.1`, `geometria/semana11/11.2`
- historia_peru: `historia_peru/semana01/1.1`, `historia_peru/semana02/2.2`, `historia_peru/semana04/4.1`
- historia_universal: `historia_universal/semana01/1.1`, `historia_universal/semana06/6.2`, `historia_universal/semana06/6.1`
- ingles: `ingles/semana01/1.1`, `ingles/semana03/3.2`, `ingles/semana07/7.1`
- lenguaje: `lenguaje/semana01/1.1`, `lenguaje/semana01/1.2`, `lenguaje/semana01/1.3`
- literatura: `literatura/semana01/1.1`, `literatura/semana02/2.1`, `literatura/semana03/3.2`
- psicologia: `psicologia/semana01/1.1`, `psicologia/semana14/14.2`, `psicologia/semana15/15.1`
- quimica: `quimica/semana01/1.1`, `quimica/semana10/10.1`, `quimica/semana02/2.2`
- raz_logico: `raz_logico/semana01/1.1`, `raz_logico/semana09/9.1`, `raz_logico/semana03/3.1`
- raz_matematico: `raz_matematico/semana01/1.1`, `raz_matematico/semana06/6.1`, `raz_matematico/semana02/2.1`
- raz_verbal: `raz_verbal/semana01/1.1`, `raz_verbal/semana06/6.1`, `raz_verbal/semana07/7.1`
- trigonometria: `trigonometria/semana01/1.1`, `trigonometria/semana09/9.2`, `trigonometria/semana03/3.1`

## Física 1.1 corregida

Archivo de producción: shared/src/commonMain/composeResources/files/aprender/fisica/semana01/1.1/. Se conservaron los diez IDs previos y se añadió c11 para practicar unidades de aceleración. No se alteró el catálogo Kotlin legacy. Se actualizó únicamente la copia existente de theory.md y questions.json de este mismo nivel en los fixtures Android.

- c01: se reconstruye explícitamente la ecuación que ya utilizaba su resolución y se corrige la clave: x+y+z=4 (índice 3).
- c02: la resolución da 60°, disponible en índice 0, pero la clave señalaba índice 2 (30°). Corregido.
- c03: C=(4,-6), módulo 2√13 N y ángulo 303.7°, disponible en índice 0, pero la clave señalaba índice 3. Corregido.
- c09/c10: dos preguntas de relleno sustituidas por presión dimensional y homogeneidad de x=v₀t+at²/2.
- Distractores de c04–c08 se mantienen en el mismo concepto; se ordena el recorrido desde fundamentos hacia aplicaciones.
- Se completa la explicación de vectores y se corrige la clasificación obsoleta de radián/estereorradián: derivados de dimensión uno; categoría suplementaria abolida en 1995.

Fuentes: NIST https://www.nist.gov/pml/special-publication-330/sp-330-section-2 ; BIPM https://www.bipm.org/en/committees/cg/cgpm/20-1995/resolution-8 ; OpenStax https://openstax.org/books/university-physics-volume-1/pages/2-4-products-of-vectors . Las reconstrucciones se justifican por las ecuaciones ya presentes y el cálculo explícito; no se inventan datos para los otros enunciados truncados.

## Presentación global

AcademicText conserva prosa/énfasis y compone matemáticas inline mediante KaTeX local en teoría, ejemplos, retos y opciones de Aprender, mensajes de explicación, flashcards, preguntas del Simulador y revisión de errores/resultados. Se preserva el original si el fragmento TeX es inválido. No se reemplaza contenido faltante con dibujos.

El primer muestreo del parser produjo 100 fragmentos incompletos por segmentación; tras corregir subíndices y entornos, quedan siete fragmentos de fuente incompleta en Aritmética/Inglés. Se muestran como original y quedan pendientes de reparación académica. No se informan como fórmulas correctas.

Los catálogos de recursos y Kotlin legacy reutilizan algunos IDs con temas distintos. Los gráficos ahora comprueban título e identidad para evitar, por ejemplo, poner un DCL en cantidad de movimiento o un gráfico de proyectil en otra materia/tema. Análisis Dimensional incorpora derivación de fuerza y presión.

## Pendiente sustantivo

Revisar y sustituir con fuentes/solucionarios aprobados las preguntas de relleno, recuperar los datos faltantes y revisar las claves de las ocho materias afectadas. No se ocultan alertas ni se afirma que la app completa esté académicamente validada.

01/11/2026 — Bloque académico 01: Trigonometría 1.1 y Geometría 3.1/7.1; 30 IDs conservados, 24 rellenos sustituidos, seis preguntas completadas/corregidas y c11 añadido por nivel (33 en total). Resoluciones completas, fuentes documentadas y siete giros con valor angular explícito. No se reconstruye por suposición la relación perdida de Trigonometría c02: se reemplaza expresamente el ejercicio. Ver REVISION_ACADEMICA_BLOQUE_01.md. Conteo de patrones genéricos restantes: 1.330; revisión completa pendiente.
