# Razonamiento Verbal: mapas y claridad

## Ámbito y contenido

Se revisan los esquemas de las dieciséis teorías, semanas 01–08. Se convierten 26 mapas con 274 nodos y 248 conexiones explícitas: dieciséis clasificaciones y diez procedimientos. Tres procedimientos idénticos repetidos dentro de 3.1, 4.1 y 8.1 se sustituyen por referencias a su primera aparición; se comprobó igualdad literal de las copias antes de eliminarlas de la presentación.

Los temas son relaciones semánticas, analogías, series y clasificación, conectores y orden, argumentos, pragmática, corrección y situaciones comunicativas. Las secuencias conservan dirección; una clasificación no se convierte en una relación causal. Se reutiliza el visor existente sin cambiar sus controles.

Cuatro tablas nuevas, en 1.1, 2.1, 6.1 y 7.1, comparan relaciones semánticas, dirección de analogías, acto comunicativo y revisión contextual. Los ejemplos añadidos son propios y explicativos; no se presentan como preguntas oficiales.

## Correcciones puntuales

- Hacer, poner, tener y decir no se prohíben por ser frecuentes: la sustitución depende de la precisión requerida.
- Un procedimiento de término excluido no se presenta como infalible. Si faltan condiciones puede haber más de una clasificación razonable.
- Las presuposiciones son contenido presentado como trasfondo; no constituyen prueba de hechos incuestionables. Se matiza la prueba de negación y la interpretación de hasta/incluso.
- Una redundancia puede tener función expresiva o aclaratoria. Se retira la afirmación sin fuente de que todo pleonasmo deba eliminarse por aparecer en un examen.
- Se corrige el diagnóstico de dequeísmo en «se quejaron de que»: quejarse admite complemento con de.
- Se corrige la prohibición general de concordancia plural en «La mayoría de estudiantes desaprobaron»: estas construcciones admiten variación según su estructura.
- Una palabra o registro no se escoge solo por elegancia; se comprueba pertinencia, dirección de relaciones y objetivo comunicativo.

No se declara revisado todo el texto heredado, sus demás ejemplos ni las preguntas de esta materia. Las correcciones se limitan a los mapas, ayudas y fragmentos concretos descritos.

## Fuentes de contraste

- [RAE: quejarse](https://www.rae.es/dpd/quejar).
- [RAE: dequeísmo](https://www.rae.es/dpd/deque%C3%ADsmo).
- [FundéuRAE: concordancia](https://www.fundeu.es/dudas/palabra-clave/concordancia/).
- [Universidad Complutense: relaciones semánticas](https://www.ucm.es/plataformaele/relaciones-semanticas).
- [RAE: hiperónimo](https://dle.rae.es/hiper%C3%B3nimo).
- [Instituto Cervantes: actos de habla](https://cvc.cervantes.es/ENSENANZA/biblioteca_ele/diccio_ele/diccionario/actodehabla.htm), contenido consultable en el resultado indexado; la apertura directa del servidor no estuvo disponible.
- [Instituto Cervantes: competencias discursivas](https://cvc.cervantes.es/ensenanza/biblioteca_Ele/marco/cap_05.htm).
- [Instituto Cervantes: pleonasmos y usos enfáticos](https://cvc.cervantes.es/el_rinconete/anteriores/marzo_01/01032001_02.htm).
- [UNED: fundamentos del fenómeno presuposicional](https://portalcientifico.uned.es/documentos/5ecb7f792999521315203b0b), ficha que advierte de la insuficiencia de la negación como criterio único.

Las páginas del diccionario de Cervantes sobre implicatura y presuposición no pudieron abrirse directamente. No se atribuyen citas literales ni una revisión completa de esas páginas.

## Evidencia

- Dieciséis bancos de preguntas conservados por SHA-256; dieciséis teorías/fixtures equivalentes. Registro: build/verbal-maps-review.json.
- Originales en build/academic-backup-verbal-maps.
- 274 etiquetas y cuatro tablas: 48 vistas aisladas a 360 px, en claro, oscuro y letra grande; cero errores. No hay fórmulas matemáticas nuevas en este lote. Informe: build/verbal-maps-render.json.
- VerbalTheoryMapsReviewTest comprueba raíces, extremos de conexiones, accesibilidad, fixtures, duplicados, tablas y regresiones gramaticales.

Android no se ejecuta ni se publica. La comprobación visual de controles en teléfono permanece pendiente.

Validación final: assembleDebug y 468 pruebas repetidas correctas (271 Android y 197 shared), sin fallos, errores u omitidas. Log: build/verbal-maps-validation.log. Cobertura global comprobada: 170 mapas y 141 bloques conservados; ningún Mermaid sin soporte.
