# Eliminación de cuenta — reglas desplegadas y Functions pendientes

## Qué se corrigió

Perfil/Ajustes y Centro Legal llaman a AccountDeletionRepository. Primero se confirma `FirebaseAuth.currentUser.delete()`; si Auth exige acceso reciente o falla la red, NO se borra el perfil. Tras éxito, la limpieza no depende de que el usuario mantenga la app abierta.

`functions/index.js` registra `cleanupDeletedAccount`, trigger estable Auth onDelete (1.ª generación), Node 22, reintentos activados. `cleanup.js` borra por UID y campos reales de propiedad en páginas de 100, subcolecciones con recursiveDelete; retira referencias de arrays en lotes de 200. Reintentar una limpieza parcial es idempotente. No contiene ninguna credencial de servicio ni cambia usuarios reales durante las pruebas.

Se cubren perfil/progreso/errores/actividad; uploads y sus comentarios; libros, flashcards y preguntas propias; mensajes, notificaciones, follows, playlists, rachas duales, intentos de ranking, reportes y solicitudes. Las pruebas comprueban más de 200 documentos, subcolecciones, referencias con emojis, aislamiento de otros usuarios y reintento tras fallo. No se elimina el Drive personal del estudiante: se borran las referencias en RASTRO; los archivos externos permanecen bajo su control.

Las reglas ahora exigen correo verificado para privilegios Admin, UID real del creador en UGC/reportes/ranking, propiedad inmutable y restricción de desocultamiento a Admin. El hide de la transacción de tercer reporte se conserva. No se certifica un sistema antifraude de XP: su arquitectura histórica sigue calculando progreso en el cliente.

## Validación local

- `node --test functions/cleanup.test.js`: 3 casos, sin Firebase real.
- `firebase emulators:exec --config firebase.rules-test.json --only firestore --project demo-rastro-audit "node --test functions/rules.test.js"`: entorno demo aislado; valida las reglas reales, propiedad, Admin, errores privados, playlists y reportes. No ejecuta la app Android ni modifica producción.
- El SDK de Functions carga correctamente. Dependencias fijadas y lockfile presentes. Runtime desplegable Node 22; el runtime de herramientas local puede ser más reciente.
- Auth y las dos rutas UI compilan en debug/release. Prueba de autenticación reciente/eliminación real pendiente.

## Intervención del propietario

Las reglas se desplegaron el 04/10 y su contenido activo coincide con el archivo validado. Copias antes/después en build/firestore-rules-active-before.rules y build/firestore-rules-active-after.rules. Cuatro pruebas del emulador pasan. No se eliminaron cuentas ni datos.

El proyecto continúa en Spark. Cloud Functions requiere Blaze; el propietario debe habilitar facturación antes de este paso. No se cambió el plan. Desde la raíz, con Node 22 y Firebase CLI autenticada:

```powershell
firebase deploy --config firebase.account-cleanup.json --only functions:account-cleanup --project rumbo-jonsu
```

El codebase aislado evita administrar funciones de otros proyectos/paquetes. No se desplegaron Functions en esta intervención. La consulta de Functions devolvió error: eso no demuestra ausencia de funciones existentes. Requisito de plan: https://firebase.google.com/docs/functions/quotas.

Después, crear una **cuenta de prueba descartable**, publicar un recurso de prueba, registrar progreso y eliminar desde Ajustes. Verificar en Console: Auth sin esa cuenta; documento usuarios/{uid} y subcolecciones sin datos; registros propios y referencias eliminados; recursos de otra cuenta intactos; log cleanupDeletedAccount sin fallo. Probar ambas entradas y también una sesión antigua: debe pedir nuevo acceso sin borrar datos prematuramente. No usar la cuenta Admin para esta prueba.

El borrado masivo Admin `deleteUsers` no dispara el trigger individual; para solicitudes de eliminación por correo debe usarse eliminación individual y comprobar limpieza. Fuente: [Auth triggers](https://firebase.google.com/docs/functions/auth-events), [borrado Firestore](https://firebase.google.com/docs/firestore/manage-data/delete-data), [codebases](https://firebase.google.com/docs/functions/organize-functions).
