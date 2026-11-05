# Antigravity — adaptar una copia de RASTRO Kotlin a web

## Objetivo y autorización

Quiero una versión web de RASTRO basada EXCLUSIVAMENTE en mi proyecto Kotlin/KMP ACTUAL, lo más fiel posible a la APK en aspecto, comportamiento, contenido, imágenes y animaciones. Trabaja con Compose Multiplatform para web. La antigua React/Vite/Capacitor está desactualizada y tiene errores: NO la uses como base ni copies su lógica.

Original protegido:
`C:\Users\Usuario\Downloads\kotlin multi--rastro- no borrar`

Destino propuesto, separado:
`C:\Users\Usuario\Downloads\RASTRO-WEB-COMPOSE`

Si ese destino ya existe, inspecciónalo y reutilízalo sin sobrescribirlo a ciegas. El original solo se lee: ningún archivo de Android, shared, Gradle, Firebase, recursos, configuración o documentación original debe cambiar. Todas las modificaciones de adaptación deben ocurrir en la copia. No ejecutes la APK, emulador o dispositivo. Sí puedes compilar y probar la web en navegador.

## Qué debe significar «copia»

1. Antes de copiar, lee AGENTS.md, MAPA_PROYECTO_KMP.md, docs del módulo, CHECKLIST y código real. Revisa Git, sus cambios y el historial; no hagas reset, limpieza o descarte.
2. Registra hashes de los archivos originales relevantes y el estado Git inicial. Verifica al terminar que el original permanece intacto.
3. Copia fuentes, recursos, datos académicos, wrapper Gradle y documentación necesarios. Incluye el código actual no comprometido que pertenezca a la app; el estado de trabajo actual es más reciente que algunos bundles.
4. EXCLUYE .git, .gradle, .kotlin, build, node_modules, cachés, APK/AAB, local.properties, .env, claves JKS/keystore, contraseñas y credenciales privadas de cuentas de servicio. No copies el Escritorio/claves privadas. El JSON privado de RevenueCat JAMÁS debe llegar al navegador.
5. No dupliques ni traslades basura protegida innecesariamente. No borres nada del original.
6. En la copia, conserva el código Android como referencia y extrae/adapta componentes compatibles a fuentes comunes/web. No pretendas que cambiar el target hace portable toda la app: cada import Android necesita una decisión explícita.
7. Configura dependencias web en la copia sin actualizar las dependencias del original. Usa versiones oficiales estables compatibles, sin afirmar «última» si no la verificaste.

## Información del trabajo anterior

Existe un proyecto preliminar `web-compose/` dentro del original y documentación `docs/web/`. Puedes leerlo y copiar lo útil al destino. Ya se comprobó que temas, modelos Aprender, FilosofiaCatalog y LearningRewards.kt pueden compilar en web; LearningRewards contiene las animaciones originales de estrellas/cofre.

Ese piloto NO es la interfaz completa ni un Home fiel a la APK. No lo presentes como la aplicación terminada ni lo conviertas en la referencia visual. La referencia es el Home y las pantallas ACTUALES del módulo androidApp, sus componentes, recursos e imágenes reales.

## Fidelidad visual obligatoria

- Reutiliza los logos, banners, mascotas, fondos, iconos sticker/SVG/vectores, tipografías y contenido actuales. No sustituyas todo por emojis, iconos genéricos o tarjetas inventadas.
- Conserva los colores de cada tema, bordes, biseles, botones físicos, tamaños relativos, estados activos, espaciados, contenedores y jerarquía de la APK. Adapta a PC/iPhone sin convertirla en otro producto.
- Conserva las animaciones Compose compatibles directamente. No rehagas en CSS una animación Kotlin que puede compartirse.
- Si un drawable XML no funciona directamente en navegador, convierte de manera reproducible y fiel a vector/painter/SVG compatible dentro de la copia. Conserva colores opacos, contorno y proporciones, sin inventar otro dibujo.
- Identifica fuentes empaquetadas reales y licencias; no descargues una tipografía distinta y la presentes como la original.
- Mantén las preguntas de relaciones como relaciones, con las opciones y contenido académico reales. No convertirlas en ABCD ni inventar pares.
- La pantalla final conserva el tamaño compacto y orden/animaciones actuales de aciertos, XP, monedas y estrellas. Usa las reglas actuales de recompensa; no inventes cantidades ni concedas premios dos veces.
- Respeta preferencias de movimiento reducido y navegación por teclado sin cambiar arbitrariamente el diseño.
- Usa las skills de Compose cartoon, microinteracciones, Material3 y CodeGraph cuando aporten. No aplicar glassmorphism/transparencias que contradigan el estilo existente.

## Funciones y contenido

Haz una matriz por pantalla: ubicación original, dependencias Android, código reutilizable, adaptación web, estado real y verificación. Incluye al menos:

- Inicio completo: banner, racha, días, contador de examen, ruta, accesos, comunidad oficial y mensajes privados de sugerencias.
- Aprender: materias, selector, caminos/niveles, teoría, todos los tipos de preguntas, vidas, resultados, progreso y guardados.
- Cursos/playlists: propias/comunidad/compartidas, YouTube y gestión existente.
- Simulador: todos los modos, ranking, resultados, revisión de respuestas, errores y flashcards actuales.
- Biblioteca: archivos, obras individuales, lectura, pestañas, publicaciones, comentarios, guardar y compartir.
- Perfil: invitado sin perfil remoto, autenticación, avatar/portada, editor de portada, redes condicionales, actividad, fórmulas guardadas y errores en pausa por defecto.
- Fórmulas/mnemotecnias: mismo contenido, notación, integración y guardado.
- Pizarra: trazos, borrador por trazo y precisión, color RGB, grosor, deshacer/rehacer, exportar/compartir.
- Amigos, notificaciones y rachas grupales: conservar flujos existentes, no crear un sistema alternativo.
- Más/Ajustes, tabla periódica, ligas, Pomodoro, términos y eliminación de cuenta.
- Admin únicamente para quien ya tenga autorización: conservar permisos reales y funcionamiento, nunca decidirlo solo por una variable del cliente.

No habilites enlaces a secciones vacías diciendo que ya están implementadas. No uses datos ficticios para simular un perfil, compra, ranking, actividad o sincronización. Si hay una limitación, documéntala y presenta un estado claro.

## Firebase: mantener contratos, no reconfigurar la nube

El funcionamiento actual de Firebase en la APK es la referencia. NO cambies el proyecto remoto rumbo-jonsu, reglas, índices, Functions, Authentication, dominios, cuentas de facturación ni colección/esquema para acomodar la web. NO habilites Blaze ni servicios de pago.

Los SDK Android no se ejecutan en navegador: adapta el acceso mediante SDK web compatible detrás de interfaces/repositorios en la COPIA. Mantén exactamente los contratos existentes: nombres de colecciones y documentos, UID, campos, ownership, timestamps, consultas, operaciones permitidas y tratamiento de errores. No sustituyas seguridad del servidor por comprobaciones visuales.

- Reutiliza el proyecto Firebase existente y su configuración WEB pública correcta; google-services.json Android no sustituye la configuración web. Nunca uses una cuenta de servicio/Admin SDK en cliente.
- Si falta una configuración o dominio autorizado, informa del requisito concreto antes de cambiar la consola. No abras reglas ni inventes credenciales.
- Mantén invitado LOCAL sin crear perfil/usuario anónimo remoto si así funciona actualmente. Las funciones sociales que requieren cuenta deben pedirla como en Android.
- Conserva política local-first, caché, errores desactivados por defecto, sincronización manual/intervalo actual y actualización Admin al tocar Actualizar. No añadir listeners globales por comodidad.
- Distingue código app → web de datos compartidos: un perfil editado por un usuario autenticado en web puede verse en Android al sincronizar, usando el backend actual. Eso no autoriza modificar el código Android.
- Mantén limpieza de cuenta según su contrato actual, incluidas fotos generadas/Drive y referencias. No pruebes borrado sobre usuarios reales ni limpies huérfanos históricos durante este port.
- No ejecutes compras, publicaciones de prueba, regalos o cambios Admin sobre datos reales para validar la web. Usa pruebas locales/emulador de servicios o cuentas de prueba previamente autorizadas.

## Pagos y publicidad

Conserva la lectura del entitlement Pro existente sin crear otro sistema ni conceder Pro desde el cliente. El flujo Google Play Billing de Android no se puede copiar como compra web. No inventes una pasarela, enlace de cobro, ID de producto, precio o clave privada. Marca compra web pendiente o no disponible hasta que se defina; no romper la compra Android.

AdMob nativo tampoco se convierte automáticamente en publicidad web. No reutilices sus unidades como si fueran anuncios de navegador, ni añadas un proveedor nuevo sin autorización. No mostrar anuncios durante preguntas. Conservar beneficios Pro y reglas reales; nunca simular un rewarded para entregar monedas.

## PWA, dispositivos y navegación

- iPhone y PC: web instalable PWA con iconos reales en tamaños adecuados, manifest, HTTPS y service worker limitado al directorio web.
- Android: acceso web permitido y aviso discreto «Disfruta una experiencia más fluida con la app de RASTRO», Ver en Google Play y Ahora no. No bloquear estudio ni repetir en cada pantalla; recordar el cierre.
- Enlace Play: https://play.google.com/store/apps/details?id=com.jonsuapps.rastro.
- Verifica soporte Safari/iOS real. Wasm requiere capacidades de navegador; prepara y comprueba el modo Compose/Kotlin JS de compatibilidad si corresponde. No afirmar que todos los iPhone funcionan por compilar Wasm.
- Ajusta canvas, safe areas, teclado, orientación, scroll, ventanas y tamaños de PC. Mantén un contenido legible, sin estirar todo al ancho del monitor.
- Implementa navegación y retroceso del navegador correctamente; no mandar a Inicio cuando corresponde volver a Simulador.
- Notificaciones, compartir, vibraciones, descargas y almacenamiento tienen diferencias web: adaptar mediante capacidades y fallbacks visibles. No solicitar permisos inesperados.
- Widgets Android no tienen equivalente exacto PWA. No prometerlos en web.
- Caching offline: solo recursos públicos y datos locales autorizados; nada de tokens, credenciales privadas o respuestas sensibles en cachés públicas. Gestión de versión y actualización sin mezclar paquetes Wasm incompatibles.
- No desplegar encima del sitio de términos existente ni cambiar sus rutas/service worker. Primero preparar una distribución local y una estrategia de Hosting separada para revisión.

## Actualizaciones app → web

La app original manda. Implementa dentro de la copia un proceso unidireccional con allowlist, hashes y registro que incorpore contenidos/recursos/componentes compatibles desde el original. Nunca copiar de web al original. No sobrescribir adaptadores web con un copiado indiscriminado ni incluir secretos.

Sé honesto: una copia es una instantánea. Los cambios Android específicos necesitan adaptación y validación; no existe conversión universal automática. Documenta qué se incorpora al recompilar, qué necesita adaptación y qué requiere publicar la web.

## Orden de trabajo y entrega

1. Auditoría/matriz, copia segura y verificación del original intacto.
2. Compilación web independiente y uso de recursos originales.
3. Home fiel y navegación/temas; validar antes de expandir.
4. Una lección completa con tipos de pregunta y resultado/animaciones reales; después extender al resto.
5. Adaptadores web que mantienen los contratos actuales, funciones sección por sección.
6. PWA/compatibilidad, caché/actualizaciones, rendimiento y pruebas de navegador.
7. Documentación CHECKLIST/DECISIONES/CAMBIOS en la copia. Marca solo lo comprobado.

Trabaja de forma autónoma en tareas reversibles autorizadas, sin pedir confirmación por cada archivo. Detente para cambios remotos sensibles, datos fiscales/bancarios, contratos legales o publicación no autorizada.

Entrega una web local visible y navegable, instrucciones reproducibles de compilación y ejecución, comparativas de pantallas cuando haya referencias, resultados reales de pruebas, tamaño/carga inicial y lista concreta de diferencias/pendientes. Compilar no prueba fidelidad, fluidez, instalación ni funciones de backend. No presentes un demo genérico como «toda RASTRO».

NO publiques en Hosting, GitHub ni Google Play; NO generes una nueva APK/AAB; NO edites el original. Deja todo para revisión en la copia.
