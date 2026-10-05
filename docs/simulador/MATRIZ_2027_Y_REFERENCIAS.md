# Calculadora UNSA — matriz 2027 y referencias 2025

## Cálculo y fuente

PDF entregado: `RCU-0028-Aprobacion-de-TEMARIO-y-MATRIZ-ADMISION-2027.pdf`. Ambas páginas escaneadas/giradas leídas visualmente.

[Matriz oficial](https://admision.unsa.edu.pe/wp-content/uploads/2026/03/RCU-0028-Aprobacion-de-TEMARIO-y-MATRIZ-ADMISION-2027.pdf).

Reemplazados pesos previamente redondeados por decimales impresos completos en `shared/.../data/SimuladorRepository.kt / getPonderaciones`. Misma fuente para calculadora/distribución de exámenes; banco académico intacto. `projectedScore` suma aciertos × peso y redondea únicamente al final a cuatro decimales. Límites 0..cantidad por asignatura; incorrectas/omitidas no aportan aciertos. No se inventa penalización ni nota mínima universal.

80 preguntas y 100 puntos por área; subtotales del PDF comprobados con tolerancia a sus últimos decimales impresos. No truncar pesos a cuatro cifras antes de multiplicar. Trigonometría Ingenierías = 1.69947700; Geometría = 1.658787450. Las pruebas de grupos detectaron y permitieron corregir una lectura inicial ambigua del escaneo.

## UI y estado

`SimuladorScreen.kt / ProjectedScoreCalculator`: entrada numérica de aciertos además de −/+, límites por asignatura y subtotales reales. `rememberSaveable/mapSaver` conserva el mapa por área+asignatura; cambiar área no mezcla ni borra entradas. Limpiar actúa solo sobre esa área. Todos correctos llena su distribución. Enlace al PDF oficial. Columnas adaptables existentes conservadas.

## Referencias históricas

Los rangos anteriores sin fuente fueron reemplazados por mínimo/máximo observado entre ingresantes TIPO NORMAL del **Ordinario II Fase 2025**. No son predicciones, promedios entre procesos ni garantía de ingreso 2027. Nombres de las 13 carreras existentes conservados exactamente. Mapeo documental: Medicina Humana → MEDICINA; Nutrición Humana → CIENCIAS DE LA NUTRICION.

[Reporte general oficial](https://www.unsa.edu.pe/wp-content/uploads/2022/11/reportes_resultados_Ing_ord2025F2R.pdf), fechado internamente 17/03/2025. La carpeta web 2022/11 no es el año del concurso.

**Psicología usa el [reporte corregido](https://www.unsa.edu.pe/wp-content/uploads/2025/03/reportes_resultados_Ingresa_ord2025F2_psicoR.pdf) del 18/03/2025**, no el puntaje reducido del general. [Página publicadora](https://www.unsa.edu.pe/comunicados/resultados-examen-ordinario-2025-ii-fase/).

`CareerCutoff` añade referenceProcess/referenceUrl/admittedCount. vacantCount=0 significa no establecido por esta fuente; admitidos NO se convierten en vacantes. Recursos de app contienen solo agregados, no nombres/documentos de postulantes. `CareerReferenceComparison` compartido por calculadora/resultado de simulacro, con fuente y proceso visibles; reemplaza la afirmación “Puntaje apto” por comparación histórica. Ranking conserva su comparación independiente.

## Comprobación

UnsaMatrix2027Test: 3 casos (totales por eje/área, cálculos diagnósticos/rounding, referencias oficiales y nombres conservados incluyendo Psicología corregida). Compilación Kotlin y 25 pruebas relacionadas/piloto correctas: `build/rewards-matrix-final.log`. Diff check correcto. App no ejecutada por AGENTS.md; pendiente revisión física de teclado, fuente, layout y enlaces. Sin deploy ni commit/push.
