# Claridad de teoría, mapas y notación — 01/11/2026

## Alcance

Presentación compartida de la teoría de Aprender y explicación de vectores de Física 1.1/1.2. No modifica preguntas, alternativas, claves, progresos, Firebase ni navegación. El banco académico pendiente conserva su estado.

## Problemas comprobados y correcciones

1. El lector mostraba fichas técnicas, ponderaciones y datos administrativos junto a la explicación. `prepareAcademicTheory` omite esos bloques al presentar la lección, sin borrar las fuentes. También simplifica encabezados técnicos de la estructura editorial. Un puntaje dentro de un problema de probabilidad o la ponderación de una media se conserva: no se filtra por una palabra aislada.
2. Los bloques Mermaid entraban como texto al parser de párrafos. Ahora se extraen sus nodos y conexiones a `AcademicSourceDiagram`, y `AcademicSourceMap` muestra el concepto seleccionado con sus ramas reales. Cada rama permite explorar sus hijos y volver a sus padres. No convierte todas las conexiones en causalidad ni inventa relaciones. Soporta IDs Unicode como CAÑ, etiquetas con comillas e intervalos [a,b), cadenas de flechas y etiquetas de conexiones.
3. Se representaron 112 diagramas en los recursos actuales: los 111 bloques Mermaid y un esquema ASCII de clasificación de la materia cuya estructura se verificó expresamente. Los 202 bloques restantes son esquemas ASCII, código u otros formatos: conservan una vista monoespaciada desplazable. Esto no significa que todos estén vectorizados. Ningún bloque Mermaid de las fuentes actuales queda en el fallback.
4. La función que separaba el contenido entre paréntesis por comas podía romper coordenadas y fórmulas. Ya no infiere listas de esa forma: el texto se conserva completo. El parser reconoce el rótulo `**Componentes:**` con dos puntos dentro de la negrita.
5. Los títulos de secciones y las tarjetas de ramas usaban Text directamente, por lo que podían mostrar TeX crudo. Ahora usan el mismo AcademicText que el cuerpo. Los encabezados de cuatro niveles tampoco conservan un # sobrante.
6. El detector de matemáticas confundía «en +x» con una expresión: renderizaba palabras como símbolos y eliminaba su separación visual. La detección automática se limita a variables individuales o dimensiones en mayúsculas, y corta ante conectores de prosa. Las expresiones delimitadas explícitamente siguen siendo autoritativas.
7. Matrices, casos y ecuaciones de varias líneas se agrupan antes de dividir el contenido entre introducción y cuerpo. Si falta el cierre, no se absorbe la sección siguiente; conserva su texto y el fallo queda local.

## Vectores: contenido más claro

Física 1.2 empieza por tamaño y orientación, define el significado de la flecha de vector y del módulo, explica i/j/k como referencias unitarias de los ejes y aclara el nombre «canónicos». Interpreta el ejemplo (3,2) m antes de mostrar las fórmulas generales. Explica que R²/R³ indica dos/tres componentes reales.

Se distinguen vector libre y punto de aplicación de una fuerza. Se exige vector no nulo para normalizarlo y se advierte que una tangente no determina por sí sola el cuadrante; no se divide por componente x igual a cero. Se conservaron las operaciones y fórmulas avanzadas de consulta. La teoría de Física 1.1 añade la misma introducción a la notación; sus tablas del SI permanecen intactas.

Los diagramas de suma y componentes existentes se asocian además a los encabezados explícitos de vectores. No se elige un dibujo ajeno por compartir el número de nivel.

## Criterio para próximas revisiones

Primero decir qué representa el concepto con palabras comunes. Después explicar cada símbolo nuevo, presentar un ejemplo con datos completos y unidades, y recién entonces generalizar con la fórmula. Las excepciones deben aparecer junto a la regla que limitan. La vista de teoría no debe llenarse de ponderaciones de exámenes, formatos internos, promesas de frecuencia ni rótulos de complejidad sin utilidad para resolver.

## Evidencia y límites

`TheoryClarityTest` prueba ocultación selectiva de metadata, conservación de un problema con puntajes y de una media ponderada, mapas reales de Química/Trigonometría, conexiones/etiquetas, IDs Unicode, paréntesis vectoriales intactos, matrices y aislamiento de un cierre ausente. Recorre las fuentes de todos los niveles y conserva todo formato no compatible. Informe de cobertura en `build/theory-map-coverage.txt`; Mermaid no soportado actual: ninguno.

Motor de notación aislado inspeccionado en navegador a 360 px: cinco expresiones de vectores correctamente compuestas, texto natural legible, sin errores JavaScript ni recursos externos. Muestra `build/vector-clarity-preview.png`; no equivale a una captura de la app ni a probar el explorador nativo de mapas.

Android no ejecutado, instalado ni publicado. La lectura y navegación de mapas en teléfono, TalkBack, fuentes grandes y temas personalizados siguen pendientes de revisión física.
