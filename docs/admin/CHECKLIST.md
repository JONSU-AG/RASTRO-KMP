# Checklist — actividad diaria

## Sesión y directorio — 08/10/2026

- [x] Registros existentes del teléfono leídos sin ejecutar la app: dos fallos de creación de ventana en MainActivity identificados.
- [x] ComposeView instalado explícitamente y cambios de alias aplazados durante la pantalla visible; última solicitud y rotación cubiertas por 2 pruebas.
- [x] Ambos accesos de logout limpian navegación/modo Admin; callbacks de perfil/Pro de otra cuenta descartados.
- [x] Directorio de usuarios paginado completo, búsqueda por correo/nombre/UID, caché por Admin y actualización explícita; 4 pruebas de búsqueda/identidad correctas.
- [x] Selector Pro reutiliza el directorio y permite seleccionar la propia cuenta; concesión sin aceptación del estudiante.
- [x] 146 pruebas Android sin fallos, lintVitalRelease correcto; log build/session-admin-fix-final.log.
- [x] compilar_app.bat / assembleDebug correcto; build/session-admin-assemble.log. Sin instalación ni ejecución.
- [ ] Comprobar logout/login, cuentas reales y concesión Pro efectiva en el teléfono. No se ejecutó la APK ni se desplegaron reglas.
- [ ] Publicar estas correcciones: no se ha generado ni subido una nueva AAB; interna 204 corresponde al código anterior.

Detalles y límites: SESION_Y_DIRECTORIO.md.

- [x] Error de ejecución de Android Studio identificado: alias Base deshabilitado en dispositivo; actividad real declarada y habilitada.
- [x] Configuración compartida «RASTRO - actividad real» creada y XML validado; no borra datos.
- [ ] Probar el botón Run con esa configuración desde Android Studio; no se ejecutó la app.

- [x] Actualizar conectado a la consulta existente desde servidor; botón visible y bloqueo durante carga revisados en código.
- [x] Ajuste del botón compilado con compileDebugKotlin; BUILD SUCCESSFUL (build/admin-refresh-check.log). Sin ejecución de app.

- [x] Código real, mapa, Git y CodeGraph revisados dentro del ámbito.
- [x] Registro de apertura inmediato, acumulación foreground y división local por fecha.
- [x] Lote persistente/idempotente; mapas existentes reutilizados y campos antiguos recuperados.
- [x] Mismo agregador de resumen/detalle, tres categorías y rango inclusivo.
- [x] Lecturas paginadas desde servidor, errores y respuesta obsoleta protegidos.
- [x] 11 tests JVM correctos; assembleDebug mediante compilar_app.bat correcto.
- [x] Diff check del ámbito sin errores.
- [ ] Recorrido físico de los siete casos, red/reintentos, medianoche y cambio de cuenta (app no ejecutada).
- [ ] Confirmar datos de dos dispositivos en Firestore real.


## 04/10/2026 — métricas de uso
- [x] Duración legible diaria/período y desglose App/Web reutilizando el tracker y campos existentes.
- [x] Umbral de clasificación 5 minutos; registro sin segundos muestra duración desconocida.
- [x] Historial React Web identificado en fuente de solo lectura y conservado sin inventar minutos.
- [x] Pruebas de duración, umbral exacto, campos históricos y datos insuficientes correctas.
- [ ] Validación de sesiones reales en dos dispositivos y recorrido Admin; no se ejecutó la APK.

## 05/10/2026 — bandeja privada de la app
- [x] Contenedor exclusivo de Home, inmediatamente antes de MainPageEnd; revisión de la llamada.
- [x] Error/Sugerencia, límite de texto, confirmación tras envío y bloqueo de doble toque.
- [x] Pestaña Admin con paginación, recarga y resolución sin eliminación.
- [x] Compilación debug y 119 pruebas Android sin fallos.
- [x] Prueba Firestore local: envío permitido, lectura ajena y del propio emisor denegada, suplantación denegada, Admin verificado puede consultar/resolver.
- [x] Lectura de reglas publicadas y consulta de bandeja real aceptada; no escrituras remotas ni nuevos índices/reglas.
- [ ] Recorrido físico de envío desde Home y lectura en Admin; no se ejecutó la app.

## 07/10/2026 — RASTRO Pro y preparación publicitaria

Pro y economía: otorgar/retirar concesiones temporales o permanentes por cuenta; configuración global existente para vidas, precios, packs y frecuencia. Bienvenida separada y avisos temporales con vigencia. Reglas locales preparadas; aún sin despliegue remoto.
Detalle y estado real: docs/monetizacion/README.md.

## Validación 07/10/2026

129 pruebas Android y 185 shared sin fallos; lintVitalRelease correcto. Dos pruebas de reglas Firestore en emulador correctas. git diff --check sin errores. No se ejecutó la app, no se generó bundle y no se desplegaron reglas/configuración.

## 08/10/2026 — local y consumo

Estado y validación específica en ../sincronizacion/CHECKLIST.md. Prueba física y ahorro real pendientes; no confundir compilación con validación entre dispositivos.

- [x] Configuración local androidApp corregida a MainActivity y XML validado; aplicación no ejecutada.
- [ ] Confirmar lanzamiento manual después de reabrir el proyecto en Android Studio.


## 08/10/2026 — Iconos, revisión y regalos

Regalos a cuenta elegida en directorio existente; cargar/editar/desactivar códigos, un único destinatario o varios con un canje por usuario. Estudiante recibe desde Conseguir monedas > Actualizar regalos/Canjear. Reglas publicadas; canjes anteriores no se borran al editar.

- [x] Compilación, 348 pruebas Android/shared y lintVitalRelease sin errores.
- [x] Ocho pruebas de reglas Firestore sin fallos; reglas remotas coinciden.
- [ ] Recorrido físico y verificación visual en teléfono: app no ejecutada.
- [x] compilar_app.bat / assembleDebug final correcto; no se lanzó ni instaló la app.

## 08/10/2026 — Popup y promociones
- [x] Popup amplio con cierre fijo; filtros de Pro manual y enlace separado a compradores RevenueCat.
- [x] Listado de códigos paginado, filtros activos/inactivos/todos, editar y desactivar; máximo 1000000 monedas en UI/política/repositorio/reglas.
- [x] Marcar atendido existente conservado y borrado definitivo con confirmación añadido.
- [x] 358 pruebas Android/shared sin fallos; lintVitalRelease correcto.
- [x] Nueve pruebas de reglas sin fallos; límite remoto publicado y contenido comprobado igual al local normalizando BOM/fin de línea.
- [ ] Directorio interno unificado de Pro comprado y manual: necesita proyección segura desde RevenueCat. No hay secretos en APK ni información de compra simulada.
- [ ] Recorrido visual/físico: no se ejecutó la app ni se borraron mensajes reales.
- [x] compilar_app.bat / assembleDebug final correcto, sin instalar ni ejecutar app. La AAB anterior no incluye estos cambios.

## 09/10/2026 — Canjes y racha exclusiva Admin
- [x] Canjes/regalos con ganancia real abren recibo animado; cero monedas no abre recibo.
- [x] Acceso diario solo para Admin Firebase verificado; recuperación de aperturas históricas sin rellenar huecos.
- [x] 359 tests Android/shared sin fallos y lintVitalRelease correcto. Compilación debug comprobada sin lanzar aplicación.
- [ ] Validación visual/canje y recuperación de la cuenta real en el teléfono por el usuario.
