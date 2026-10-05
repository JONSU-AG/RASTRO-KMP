# Copias Classic — guía para Antigravity

## Ámbito permitido

Trabaja únicamente con las copias de `logos/Loki`, `logos/Orstty` y `logos/Artyon`. Los archivos utilizados por RASTRO, incluidos `androidApp/`, `shared/` y la carpeta singular `LOGO/`, quedan fuera de este trabajo. No cambies referencias de la aplicación ni ejecutes `copiar_logos.bat`: ese archivo sobrescribe recursos reales de RASTRO.

Estas carpetas son un paquete aislado de recursos y copias de código, no un módulo de Kotlin que la aplicación importe. Editar aquí no debe cambiar el personaje original de RASTRO.

## Qué contiene cada carpeta

El prefijo es `loki_classic`, `orstty_classic` o `artyon_classic`.

- Diez PNG: `normal`, `feliz`, `triste`, `enojado`, `dormir`, `enamorado`, `dudoso`, `noqueado`, `racha` y `no_te_vayas`. Normal es la base canónica. No existe una emoción Sorprendido en el catálogo Classic actual.
- GIF `no_te_vayas`: la expresión tierna animada de 4 segundos.
- GIF `leer_lanzar_explosion`: la lectura, lanzamiento con la mano derecha, explosión posterior y cara seria. La copia dura ahora 5,1 segundos.
- Cuatro GIF de las secuencias existentes: `secuencia_bienvenida`, `secuencia_una_idea_nueva`, `secuencia_meta_cumplida` y `secuencia_volver_a_intentar`. Son capturas del renderer Classic de las recetas compartidas que ya existen, no emociones nuevas.
- `modelo.kt.txt`: copia del rig y dibujo Classic compartido.
- `emociones.kt.txt`: copia del catálogo y los elementos animados Classic.
- `secuencia_explosion.kt.txt`: copia de la actuación del papel/BOOM; únicamente su cronología se ha acortado aquí.
- `secuencias.kt.txt`: extracto de las recetas y del muestreo de secuencias existentes.
- `copia_segura.json`: inventario, procedencia y huellas SHA-256 de los archivos de esta carpeta.

Todos los archivos del personaje están directamente en su carpeta. No crees subcarpetas por emoción ni mezcles otros estilos.

## Cómo usar los recursos

Para consultar el aspecto, abre el PNG de la emoción y su GIF cuando exista. Los GIF se reproducen en bucle; el formato raster es una referencia animada, no un rig editable por partes. Las imágenes mantienen el fondo crema de las capturas reales: no se presentan como recortes transparentes ni como SVG.

Para modificar el dibujo vectorial, consulta las copias `.kt.txt`. La extensión de texto impide que se compilen accidentalmente o que aparezcan clases duplicadas. Conservan los nombres de clases y las referencias originales para documentar la implementación.

**Estas copias de código no constituyen una biblioteca independiente lista para compilar.** El renderer necesita modelos y utilidades Compose compartidos de RASTRO que no se incluyeron porque contienen otros estilos o sistemas. Si necesitas un renderer independiente, adapta esas dependencias en un entorno aislado de las copias; nunca edites ni agregues las copias a los source sets de RASTRO. No compiles las tres familias juntas: representan el mismo modelo compartido con distintas paletas y repiten definiciones.

## Reglas de fidelidad

1. Usa `normal.png` como referencia canónica; las tres paletas comparten la misma geometría.
2. Conserva cuerpo, proporciones, mechones anclados, conexión de brazos y pies. No dibujes un personaje diferente por emoción.
3. Ojos y pupilas mantienen su forma y tamaño. Las expresiones y parpadeos se hacen con párpados y recortes; no escalando el ojo.
4. Elementos acompañantes: trazados de caricatura con contorno coherente, nunca sustituidos por emojis o texto de una fuente.
5. El papel sale de la mano derecha anatómica, que aparece a la izquierda del espectador. Viaja detrás; no desaparece al soltarlo.
6. Explosión y BOOM se dibujan antes del cuerpo. El personaje queda delante y visible.
7. Si cambias la velocidad, cambia únicamente el tiempo de reproducción. No cambies geometría, amplitud o postura final.
8. No sobrescribas los PNG de referencia al experimentar. Usa nombres de trabajo dentro de estas carpetas y conserva el inventario inicial.

## Recorte de la intro de la explosión — solo en las copias

Se quitaron **1,7 segundos de lectura**: pasa de 3 a **1,3 segundos**. El lanzamiento, la explosión y el tiempo de expresión seria mantienen sus duraciones; sus instantes se adelantan 1,7 segundos. La secuencia original de RASTRO sigue intacta y dura 6,8 segundos.

| Etapa de la copia | Tiempo normal, a 1× |
|---|---|
| Preparar la hoja | 0–0,25 s |
| Leer con párpados ligeramente bajos | 0,25–1,55 s |
| Lanzar con la mano derecha | 1,55–2,10 s |
| Hoja pasa detrás | Desde 1,78 s |
| Empiezan explosión y gesto serio | 2,08 s |
| BOOM pleno hasta / disipación hasta | 4,10 / 4,80 s |
| Cara seria hasta / retorno a la base | 4,75 / 5,10 s |

El GIF corto procede de los fotogramas nativos existentes: se retiró el tramo de lectura y se preservó la actuación posterior, sin rediseñar ninguna parte.

## Antes de dar una edición por terminada

- Revisa las diez emociones y las seis animaciones de cada personaje.
- Compara los extremos de cada actuación con la base canónica.
- Revisa manos, párpados, pupilas y capas de la explosión.
- Confirma que solo cambiaste archivos dentro de las copias.
- Usa `originales_verificados.sha256.json` como evidencia de la implementación original al preparar este paquete; no lo actualices para ocultar cambios en originales.

Los archivos de exportación en la raíz son auxiliares de captura, no forman parte del personaje ni deben integrarse a RASTRO. No generes APK ni abras emulador/dispositivo para trabajar con este paquete.
