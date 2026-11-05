# Reparación de relaciones de Biología

Ámbito concreto: una pregunta de fisiología en 8.1 y diez preguntas de relación en 9.2, 9.3, 9.4, 10.1, 11.4, 12.3 y 13.1–13.4. Solo esos once objetos, sus fixtures y pruebas; no se crean niveles, no se migra el catálogo Kotlin legacy ni se modifica la teoría o el motor.

## Problema

Los diez ejercicios pedían relacionar, pero eran MULTIPLE_CHOICE y ofrecían respuestas ambiguas como «la correspondencia directa descrita». La correspondencia ya aparecía en el enunciado, de modo que no era un ejercicio real. Se conservan sus IDs y se usa MATCH_PAIRS, ya existente, con cuatro pares distintos y columna derecha desordenada. Cada explicación desarrolla los cuatro vínculos.

Se precisan además los contenidos: neurotransmisor según la vía y el receptor, no «simpático=siempre noradrenalina»; G2 como preparación/control, no el ensamblaje completo del huso; cariotipos de ejemplo de formas completas, no fórmulas erróneas como 45X0 ni una única forma universal; vestigial no significa necesariamente inútil, y no todo fósil es transicional. Las relaciones tróficas, ciclos e interacciones ecológicas se definen con su alcance.

En bio_t08_s01_c1 se evalúa factor intrínseco y absorción de B12, retirando una prescripción de tratamiento inyectable de por vida que no era necesaria para preguntar por la secreción. Se conserva la clave y las alternativas.

## Validación y límites

`scripts/academic/review_biology_relations.py` modifica únicamente esos objetos y comprueba cuatro etiquetas y respuestas distintas por relación. El respaldo anterior está en `build/academic-backup-biology-relations/`; producción y fixtures coinciden. El total sigue siendo 296 preguntas de Biología.

BiologyRelationsReviewTest comprueba los once cambios mediante el loader real y el motor de interacciones existente: IDs, cuatro pares, IDs/textos de la columna derecha, orden mezclado y explicaciones de cuatro segmentos. CatalogValidator sin errores ni advertencias en los once niveles afectados; sanitizador sin contaminación. La pregunta de B12 se mantiene como opción múltiple y no prescribe tratamiento.

El render aislado comprueba 33 vistas de los textos, parejas y respuestas, en claro/oscuro/letra grande a 360 px, sin fallbacks ni desbordamiento del documento. Al no haber expresiones matemáticas en este lote, no se exige que se descarguen fuentes KaTeX que no se utilizan. No se prueba visualmente la interacción de emparejamiento en un teléfono.

No se declara revisado académicamente todo Biología. La comprobación técnica no certifica todos los otros hechos o claves. Resultado integrado de compilación/pruebas en `build/academic-final-validation.log`.

## Fuentes de contraste

- [OpenStax: estómago y factor intrínseco](https://openstax.org/books/anatomy-and-physiology-2e/pages/23-4-the-stomach), [sistema nervioso central](https://openstax.org/books/anatomy-and-physiology-2e/pages/13-2-the-central-nervous-system), [divisiones autonómicas](https://openstax.org/books/anatomy-and-physiology-2e/pages/15-1-divisions-of-the-autonomic-nervous-system).
- [OpenStax: regulación del calcio](https://openstax.org/books/anatomy-and-physiology-2e/pages/17-5-the-parathyroid-glands), [páncreas endocrino](https://openstax.org/books/anatomy-and-physiology-2e/pages/17-9-the-endocrine-pancreas), [ciclo celular](https://openstax.org/books/biology-2e/pages/10-2-the-cell-cycle).
- [MedlinePlus: Down](https://medlineplus.gov/genetics/condition/down-syndrome/), [trisomía 18](https://medlineplus.gov/genetics/condition/trisomy-18/), [trisomía 13](https://medlineplus.gov/genetics/condition/trisomy-13/), [cromosoma X y Turner](https://www.medlineplus.gov/genetics/chromosome/x/).
- [OpenStax: evolución](https://openstax.org/books/biology-2e/pages/18-1-understanding-evolution), [flujo de energía](https://openstax.org/books/biology-2e/pages/46-2-energy-flow-through-ecosystems), [ciclos biogeoquímicos](https://openstax.org/books/biology-2e/pages/46-3-biogeochemical-cycles), [interacciones comunitarias](https://openstax.org/books/biology-2e/pages/45-6-community-ecology).
- [EPA: agotamiento de ozono](https://www.epa.gov/ozone-layer-protection/information-ozone-and-ozone-depletion), [deposición ácida](https://www.epa.gov/acidrain/what-acid-rain) y fuentes ambientales del [lote de Química](../quimica/REVISION_PRACTICA_PENDIENTE.md).

Pares redactados para el contexto de cada nivel; no se copian preguntas de estas fuentes.
