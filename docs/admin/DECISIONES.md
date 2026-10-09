# Decisiones

Reparar TesterActivityRepository y la vista existente de Admin, sin segundo sistema de Analytics. Usar los mismos campos; leer campos con puntos sin borrar ni renombrar originales. No modificar RastroApplication, gamificación ni reglas de Firestore. Maps nested + increment y transacción con último recibo por instalación resuelven escritura y duplicación por reintento en el mismo documento. Mantener configuración Analytics de identidad ya existente.

Separar únicamente cálculo puro en DailyActivityMath para probar las categorías/fechas y compartirlo entre listado y detalle. Zona del sistema consistente con RASTRO; duración monotónica. Lecturas Admin desde servidor con paginación y error explícito. Sin reconstruir actividad histórica inexistente ni contabilizar días futuros.


## 04/10/2026 — duración fiable y límites históricos
La duración procede de segundos registrados en Firestore. Analytics agregado, XP, estrellas y simple apertura no se traducen a minutos. Los datos antiguos con duración insuficiente conservan su categoría de actividad registrada. Clasificación 5 minutos separada de racha 15 minutos. Se mantiene un solo tracker Admin, sin segundo sistema de métricas.

## 05/10/2026 — contacto privado desde Inicio

Reutilizar reportes y sus reglas privadas en vez de crear un foro, colección o segundo panel. Separar app_feedback de los reportes académicos/UGC. Una pestaña propia en Admin distingue errores y sugerencias; carga explícita paginada cuando se abre. No publicar los mensajes en perfiles, comunidad o notificaciones públicas.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro y economía: otorgar/retirar concesiones temporales o permanentes por cuenta; configuración global existente para vidas, precios, packs y frecuencia. Bienvenida separada y avisos temporales con vigencia. Reglas locales preparadas; aún sin despliegue remoto.
Detalle y estado real: docs/monetizacion/README.md.

## 08/10/2026

Separar respaldo personal de operaciones sociales; no depender de Blaze para estudiar. Cuenta RevenueCat y conexión de compras pendientes, sin doble sistema Pro. Detalles en ../sincronizacion/DECISIONES.md.
# 08/10/2026 — Consulta explícita

Conservar la actividad existente y su consulta desde servidor. Actualizar identifica visiblemente la acción y se bloquea mientras carga; actividad significa evidencia registrada en el período, no presencia en línea en tiempo real. Los datos pendientes en dispositivos no pueden aparecer hasta su envío.
# Sesión y directorio — 08/10/2026

Reutilizar usuarios y rastro_pro. Directorio compartido entre usuarios/Pro, carga paginada explícita y caché breve por Admin, sin consultas por cada pulsación ni listeners permanentes. Reparar identidad ausente al ingresar, sin sobreescribir el nombre elegido. No tratar invitados como cuentas nube ni inventar IDs de Authentication. El usuario beneficiario no acepta la concesión manual.

Para ejecutar desde Studio, usar MainActivity explícita: el alias de icono Base puede estar deshabilitado legítimamente por el estado de racha. Conservar los alias y datos instalados.


## 08/10/2026 — Iconos, revisión y regalos

Regalos a cuenta elegida en directorio existente; cargar/editar/desactivar códigos, un único destinatario o varios con un canje por usuario. Estudiante recibe desde Conseguir monedas > Actualizar regalos/Canjear. Reglas publicadas; canjes anteriores no se borran al editar.

Reutilizar saldo, repositorios, Pro y avisos existentes. No crear una economía paralela ni activar cobros. Catálogos de lecciones y recurso original de fuego conservados.

## 08/10/2026 — Gestión compacta

No duplicar Pro ni economía. Filtrar regalos manuales con fuente rastro_pro y mostrar pagos verificados en RevenueCat; no llamar no Pro a una cuenta sin regalo. No exponer credenciales secretas en Android para listar compradores. Gestión en popup amplio y consultas bajo demanda. Códigos de hasta un millón mantienen un recibo por cuenta. Desactivar no revoca monedas ya entregadas. Borrado de mensajes exige confirmación explícita dentro de la aplicación.

## 09/10/2026
El recibo visual reutiliza el resultado de CoinRewardsRepository, sin otra entrega. Solo Admin con correo Firebase verificado puede calificar por acceso; la recuperación une registros explícitos y no inventa días. Se consulta historial como máximo una vez por día exitoso por dispositivo.
