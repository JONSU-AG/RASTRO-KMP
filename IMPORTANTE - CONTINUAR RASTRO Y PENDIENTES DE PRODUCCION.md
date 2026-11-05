# IMPORTANTE — PENDIENTES PARA CONTINUAR RASTRO

Fecha del registro: 09/10/2026.
Objetivo: retomar la preparación para producción sin duplicar sistemas ni perder lo ya comprobado.

## Pendientes principales

- [ ] Generar y subir una nueva versión que incluya la corrección de eliminación de cuentas. El propietario confirmó que funciona en su prueba; la corrección todavía no está en el bundle 205 de Play. Consultar el máximo REAL en Console y usar un versionCode superior antes de cargar.
- [ ] Obtener aprobación del propietario para el contenido legal final y publicar términos y privacidad actualizados, incluyendo anuncios y compras. Propuesta: docs/monetizacion/ADMOB_TEXTO_LEGAL_PARA_APROBAR.md. No publicar sin aprobación.
- [ ] Revisar y actualizar Seguridad de los datos y la declaración de anuncios de Google Play según los datos realmente tratados por la app y sus SDK.
- [ ] Completar AdMob: publicar app-ads.txt, finalizar el consentimiento y obtener la aprobación de la cuenta. Cuando la ficha sea pública, vincularla y verificar la entrega de anuncios reales. Las pruebas internas/cerradas no bastan para vincular la ficha privada. Detalle: docs/monetizacion/ADMOB_LISTO_Y_PENDIENTES.md.
- [ ] Revisar perfiles huérfanos de eliminaciones anteriores. Inventariar UID y contrastar con Authentication; no borrar únicamente por coincidencia de nombre o correo ni eliminar datos sin delimitar los casos.
- [ ] Cerrar la revisión del contenido académico heredado. No considerar validado todo el banco por haber compilado la app ni inventar contenido para completar preguntas.
- [ ] Consultar el estado actual de producción en Play: el propietario indicó que envió 2.0.1 / 201. Su aprobación/disponibilidad actual no está confirmada en este registro.

## Lo ya comprobado

- El propietario confirmó compras de prueba y reembolsos: Pro se activa y se retira correctamente. No repetir estas pruebas sin un cambio que lo justifique.
- Última comprobación de Console registrada: 2.0.3 / 205 disponible en prueba interna. Esto no significa que esté en producción ni que incluya cambios posteriores.
- Eliminación de cuentas: corrección en código, reglas desplegadas, compilación y pruebas automatizadas correctas; propietario reporta que funciona. No se han limpiado los perfiles históricos.
- Código subido a https://github.com/JONSU-AG/RASTRO-KMP, rama main, commit d0fdfbab737bb0ee46b047561546d0e6c6c579d3.
- Respaldo privado local preparado en C:/Users/Usuario/Desktop/claves privadas, con guía de recuperación. Nunca subir esa carpeta a GitHub.

## Cómo retomar

1. Leer AGENTS.md, MAPA_PROYECTO_KMP.md y los CHECKLIST/DECISIONES/CAMBIOS del módulo afectado.
2. Revisar Git y el código real; declarar el ámbito antes de editar.
3. Consultar Play/AdMob cuando se necesite un estado actual. Los estados de este documento son comprobaciones históricas, no garantías futuras.
4. Conservar la implementación actual de Pro, Billing, RevenueCat, Firebase y anuncios; no crear sistemas paralelos.
5. El propietario interviene para datos bancarios, identidad y datos fiscales. No seleccionar cuentas de pago ni activar Blaze sin autorización específica.
6. No ejecutar Android en emulador/dispositivo desde el agente. Validar mediante compilación y pruebas pertinentes; el propietario realiza las pruebas físicas.
7. Las novedades públicas de Play nunca deben mencionar funciones de Admin.

No declarar que todo está cerrado para producción hasta completar y comprobar los pendientes correspondientes.

## Actualización comprobada — 10/10/2026

- [x] Texto legal aprobado por el propietario, integrado en Android 206 y publicado en web.
- [x] app-ads.txt público con línea oficial y Asset Links conservados.
- [x] 2.0.4 / 206 aceptada y enviada a producción. Console: «Cambios en la etapa de revisión»; verificaciones rápidas pendientes. Seguridad de datos y disponibilidad enviadas juntas. Evidencia build/play-production-206-enviada.png.
- [x] 361 pruebas sin fallos; bundle, manifest BILLING y firma verificados. No se ejecutó Android.
- [ ] Aprobación de Google y ficha pública. No confundir envío con publicación.
- [ ] AdMob: cuenta en verificación; editor del mensaje europeo falla «No se puede cargar la página». Mensaje sigue en borrador. Vincular ficha pública cuando exista y comprobar anuncios reales.
- [ ] Seis candidatos de perfiles sin UID en Auth: inventario privado, no borrados. Auditados 218 cuentas Auth y 214 perfiles. Revisión individual pendiente.
- [ ] Validación académica heredada pendiente.

Firebase continúa Spark. No se eligieron cuentas de pago ni datos bancarios/fiscales. Las listas de tareas anteriores son históricas; este apartado sustituye su estado. Detalle actual: docs/publicacion/RELEASE_2.0.4_206.md. Próximo código mínimo 207, verificar Console antes de cargar.

## 12/10/2026 — Verificación actual sin nueva subida

Play Console, Actividad de envío: envío 3 de producción del 10/10/2026 figura Publicado. No se cargó otro bundle ni se enviaron nuevos cambios.
AdMob con aguilar.jonsu@gmail.com redirige a signup?sac=true: «No se aprobó su cuenta», «Debe corregir algunos problemas para poder usar AdMob». Muestra confirmación de lectura/cumplimiento de Políticas del Programa y botón Reenviar. No se marcó ni reenvió esa declaración. La pantalla no detalla una infracción específica. El propietario debe revisar la declaración antes de autorizar el reenvío. No se pudo acceder a la configuración de la app para vincularla en esta sesión. Evidencia: build/admob-cuenta-no-aprobada-2026-10-12.png.
El estado anterior «en verificación» queda sustituido por esta observación. No afirmar vinculación completada, consentimiento publicado ni anuncios reales habilitados.

## 12/10/2026 — Cuenta reenviada y vinculación completada

Por autorización explícita del propietario, se leyeron las políticas oficiales AdMob/AdSense, se marcó la declaración existente de lectura/cumplimiento y se pulsó Reenviar. Resultado: «Estamos revisando su información»; acceso al panel recuperado. No se aceptaron nuevos contratos ni se cambiaron datos bancarios.
Se vinculó la aplicación AdMob EXISTENTE 3422086209 con Google Play com.jonsuapps.rastro, JONSUAPPS, usando la URL pública exacta. AdMob confirmó «Verificaste RASTRO Preuniversitario (Android) correctamente». Tabla: En preparación / Publicación limitada / Revisión en curso. Dos unidades existentes conservadas; sin nueva aplicación ni bundle. Google indica revisión de app normalmente 2–3 días, no garantizados. Evidencia build/admob-rastro-vinculada-2026-10-12.png.
