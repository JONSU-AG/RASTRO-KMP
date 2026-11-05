# Revisión de la práctica pendiente de Geometría

02/11/2026. Se revisan los 20 niveles pendientes y sus fixtures: 220 ejercicios explícitos, 180 numéricos y 40 conceptuales. Se conservan 200 IDs y se añade c11 por nivel. Los niveles 3.1 y 7.1 conservan su revisión previa y sus once preguntas; sus hashes se verifican antes y después. El banco de recursos de Geometría suma 242 preguntas en 22 niveles.

No se modifica el catálogo Kotlin legacy, el temario, los títulos, la teoría, la navegación ni Firebase. La revisión es de práctica; no certifica toda la teoría, todos los artificios avanzados o todos los gráficos.

## Contenido y condiciones

| Tema | Aspectos comprobados |
|---|---|
| Segmentos y ángulos | Orden de puntos, suma de partes, bisectriz, complemento, suplemento y posiciones respecto de una secante |
| Rectas y coordenadas | Pendiente finita/vertical, intersección, punto medio, distancias perpendiculares y paralelismo |
| Triángulos | Correspondencia en semejanza, razón de áreas al cuadrado, congruencia LAL y criterios sin confundir igualdad de forma con tamaño |
| Relaciones métricas | Proyecciones sobre hipotenusa, altura, bisectriz, Apolonio, cuerdas, tangentes y secante exterior por total |
| Centros | Mediatriz, bisectriz, baricentro 2:1, centros de rectángulos/equiláteros, recta de Euler y radio de nueve puntos |
| Polígonos y cuadriláteros | Polígonos simples/convexos cuando corresponde, diagonales enteras, regularidad, trapecio, rombo y clasificaciones inclusivas |
| Circunferencia | Arcos interceptados, ángulos, cuadrilátero cíclico y Pitot como condición necesaria, no un converso no justificado |
| Áreas | Base y altura perpendicular, Herón, escala cuadrática, partición por medianas y regiones circulares contenidas |
| Espacio y poliedros | Plano por puntos no colineales, Euler para convexos, conteos, prismas, pirámides y troncos con altura perpendicular |
| Revolución | Cilindro/conos rectos, área lateral frente a total, esfera/casquete y Pappus con eje externo |
| Cónicas | Centro y radio, foco/directriz parabólica, c²=a²−b² para elipse frente a c²=a²+b² para hipérbola |

Los enunciados definen sus figuras y datos sin remitir a otra pregunta. Las raíces para longitudes se toman positivas. Las opciones numéricas conservan la unidad pedida; los conteos de elementos usan enteros. Se distinguen cm, cm² y cm³. Se evitan inferencias basadas solo en el aspecto de un dibujo.

Los ejercicios son originales de RASTRO, no preguntas atribuidas a un examen oficial. Once ejercicios distintos por nivel, sin repetir un mismo modelo con once cambios numéricos.

## Verificación

`scripts/academic/review_geometry_practice.py` formula cada ejercicio. Los 180 resultados numéricos se contrastan con aritmética exacta, radicales, razones y fórmulas explícitas mediante SymPy local. Los 40 conceptuales tienen tres pasos razonados; la igualdad de una operación numérica no demuestra por sí sola los teoremas geométricos que se aplican.

Se reutilizan las utilidades locales de autoría de los lotes anteriores; no se crea un motor paralelo dentro de la app. Los JSON son estáticos. Los fragmentos conocidos de fórmulas se delimitan para que la conjunción «y» no se convierta en variable. Los productos con subíndices llevan notación explícita para impedir un subíndice doble accidental.

Evidencia local: `build/geometry-pending-proofs.json`, `build/geometry-pending-preview.json`, `build/geometry-pending-render.json` y copia anterior en `build/academic-backup-geometry-pending/`. Estos archivos no son respaldo remoto.

## Fuentes de contraste

- [OpenStax, volumen y área superficial](https://openstax.org/books/prealgebra-2e/pages/9-6-solve-geometry-applications-volume-and-surface-area).
- [OpenStax, elipse](https://openstax.org/books/algebra-and-trigonometry-2e/pages/12-1-the-ellipse) e [hipérbola](https://openstax.org/books/algebra-and-trigonometry-2e/pages/12-2-the-hyperbola).
- [Wolfram MathWorld, fórmula triangular de Euler](https://mathworld.wolfram.com/EulerTriangleFormula.html) y [recta de Euler](https://mathworld.wolfram.com/EulerLine.html).
- [Wolfram MathWorld, teoremas del centroide de Pappus](https://mathworld.wolfram.com/PappussCentroidTheorem.html).

Se contrastan definiciones, condiciones y fórmulas; no se copian sus ejercicios. Las expresiones numéricas propuestas se comprueban además con los datos concretos del problema.

## Evidencia y límites

El renderizador aislado acepta 1.149 fragmentos y muestra todos los enunciados, opciones y resoluciones en 60 vistas: 20 niveles con tema claro, oscuro y letra grande a 360 px. Cero errores, fallbacks, peticiones externas o desbordamientos horizontales del documento. Se inspeccionan las capturas de relaciones métricas y cónicas. Las expresiones largas conservan scroll horizontal interno; no se garantiza que una fórmula arbitraria quepa sin él.

No se agregan dibujos individuales para estos 220 problemas ni se ejecuta Android. Las construcciones ilustrativas existentes no se presentan como diagramas exactos de un ejercicio distinto. La teoría y la revisión física siguen pendientes.

La auditoría global queda en 4.442 preguntas, 570 con alertas. Ausencia de alertas no equivale a certificación de todo el banco; el informe vigente se regenera en `../estado/AUDITORIA_ESTRUCTURAL_TOTAL.md`.

Validación final: assembleDebug y 239 pruebas Android repetidas, cero fallos, errores u omitidas. GeometryPracticeReviewTest carga los 22 niveles y comprueba claves específicas de cuerdas/tangentes, centros, cuadrilátero cíclico, tronco de pirámide, casquete y diferencias entre elipse e hipérbola. CatalogValidator: cero errores/cero advertencias. Log: build/geometry-practice-final.log.
