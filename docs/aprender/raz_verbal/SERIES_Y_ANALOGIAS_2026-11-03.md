# Series y analogías: revisión 03/11/2026

Ámbito: treinta preguntas de Razonamiento Verbal (niveles 2.1, 2.2 y 3.1), dos teorías de analogías (2.1/2.2), sus fixtures, documentación y pruebas. No se cambian temario, nivel, identificadores, cantidad de retos, navegación, Firebase ni recompensas.

## Problemas confirmados

- 3.1/c09 exigía un sustantivo que nombrara una conducta y ofrecía «Pérfida» como clave, justificándola como si fuera «perfidia». Se sustituye por Perfidia, con el mismo correctIndex.
- 3.1/c04 llamaba alternada a una estructura por parejas capital–país. Se aclara la diferencia.
- 3.1/c05 presentaba ballena/delfín/orca como cohipónimos equivalentes. Se conserva la pregunta como pertenencia a cetáceos y se explica que la orca es de la familia de los delfines.
- 3.1/c06 describía viento, vendaval y huracán como una escala universal de fuerza destructiva. Se reemplaza por una gradación verbal contextual de enojo, sin medida psicológica ni escala meteorológica.
- 2.1/c03 no distinguía con suficiente precisión instrumento–función e instrumento–magnitud medida. La nueva premisa exige función expresada como acción y la clave es Termómetro–Medir la temperatura.
- 2.1/c08 planteaba la relación vertical como sustitución de la horizontal. Se precisa la disposición A:B / C:D y se comprueban ambas correspondencias.
- 2.1/c09 relacionaba cualquier fuego con ceniza. Se fija el caso de combustión de madera.
- 2.2/c04 omitía el alcance del ejemplo fiebre–infección. Ahora parte de un caso descrito y no presenta la relación como prueba diagnóstica universal.
- Se contextualizan símbolos, intensidad, finalidad profesional, lugar habitual de trabajo y comparación entre tecnologías sin convertir asociaciones típicas en resultados inevitables.

Se revisaron las treinta preguntas, se aclararon sus consignas y se desarrollaron explicaciones de relación, aplicación y respuesta. Todas conservan sus IDs y posiciones de clave. Perfidia, Furia y las alternativas de función/contexto se ajustan donde era necesario; no se altera el orden de calificación del motor.

## Teoría

Se retira la promesa de 100 % de efectividad de R-O-N y se presenta como guía de estudio. Se explica que la naturaleza o especificidad solo discrimina cuando el enunciado aporta una restricción pertinente.

Las comparaciones simbólicas de antorcha/libertad con laurel/triunfo, cetro/poder, balanza/justicia y paloma/paz ya no fuerzan una única clave por una supuesta tradición de exámenes. Se muestran como un ejercicio ambiguo que necesita contexto.

El ejemplo leche/queso admite varias correspondencias materia prima–producto. Se elimina el desempate forzado mediante un proceso de fermentación pretendidamente idéntico, junto con atribuciones no documentadas a editoriales o centros de preparación. No se sustituye esa afirmación por otra explicación técnica no verificada.

También se aclara que las partes no tienen que ser inseparables, se usa orografía/relieve y se reemplazan afirmaciones grandilocuentes sobre ciencia y derecho por una explicación acotada del uso y límite de comparar relaciones. Los mapas, sus nodos y conexiones permanecen iguales.

## Evidencia

- Producción y fixtures equivalentes en los cinco archivos editados.
- Respaldos en build/academic-backup-series-analogies/.
- SeriesAnalogyRepairTest: seis pruebas nuevas sobre carga real, IDs/claves, categoría gramatical, clasificación, contexto, ambigüedad y equivalencia de fixtures.
- assembleDebug y 562 pruebas correctas (365 Android + 197 shared), sin fallos, errores u omitidas. Log build/series-analogies-validation.log.
- CatalogValidator: cero errores críticos en los tres niveles; cada uno conserva la advertencia previa DEPTH_CHALLENGE_SHORTFALL (NORMAL con diez retos frente al objetivo orientativo de quince). No se oculta ni se añade contenido solo para eliminarla.
- AcademicSanitizer sin contaminación en los treinta enunciados. Auditoría estructural: 418 niveles y 4 554 preguntas, sin los patrones automáticos que detecta ese script; eso no certifica todas las claves.

Fuentes de contraste, sin copiar ejercicios:

- Perfidia: https://dle.rae.es/perfidia
- Pérfido/pérfida: https://dle.rae.es/p%C3%A9rfido
- Furia: https://dle.rae.es/furia
- Orca: https://www.fisheries.noaa.gov/species/killer-whale
- Cachalote: https://www.fisheries.noaa.gov/species/sperm-whale
- Alcance del ejemplo de fiebre: https://www.nhs.uk/symptoms/fever-in-adults/

## Límites

No se ejecutó Android ni se publicó una versión. Las revisiones de los otros niveles siguen pendientes; tampoco se afirma una revisión exhaustiva de toda la teoría de analogías por haber corregido estos pasajes. Los catálogos Kotlin legacy no se reescribieron.
