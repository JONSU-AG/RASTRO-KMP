# Pruebas de Pro, códigos y recuperación de rachas

Actualización del 08/10/2026. Código actual; la AAB 205 generada previamente no contiene estas nuevas mejoras. No se ha subido una versión nueva a Play.

## Desde Android Studio

Compilar/instalar manualmente la versión actual en el teléfono, conservando los datos de la aplicación: no desinstalar ni borrar almacenamiento si se quiere conservar evidencia local de la racha. Si Android Studio pide desinstalar por firmas distintas, cancelar y esperar la actualización desde el mismo canal de Play; la instalación debug no sustituye una instalación firmada por Play.

1. Más → RASTRO Pro abre el modal existente con corona y planes. La cuenta debe iniciar sesión para comprar/restaurar.
2. Admin → Pro/economía → Administrar Pro y promociones abre el popup grande. Seleccionar Todos, Pro manual o Sin Pro manual; buscar por correo/nombre/UID. Elegir usuario y revisar inicio, fin y plan. Asignar/retirar conserva el flujo existente sin aceptación del destinatario.
3. En Regalos/códigos, escribir 100, 200000 o 1000000 monedas. Crear un código, elegir un único usuario o varias cuentas (una vez cada una), guardar. Activos/Inactivos/Todos muestra páginas de 20; Actualizar códigos vuelve al inicio. Editar carga monto y opciones. Desactivar impide nuevos canjes, no quita monedas ya entregadas.
4. Con otra cuenta, Perfil → Conseguir monedas → Canjear. Comprobar aumento exacto del saldo, repetir código y comprobar que no vuelve a sumarse. Un código desactivado no concede monedas nuevas. Un recibo ya obtenido sigue siendo válido para recuperar una entrega pendiente.
5. La racha se reconstruye al leer progreso local; cuentas anteriores hacen dos lecturas del historial remoto una vez por migración exitosa. Comparar calendario e historial antes/después. Una cadena comprobada de 14 días hasta ayer permite 14; si hoy cumple estudio, 15. No usar bestStreak aislado para conceder una racha actual. Si falta un día o evidencia, no se inventa. Sin conexión se conserva avance y se reintenta al próximo inicio.
6. Inicio → Comunidad RASTRO abre el canal oficial fijo para todos, incluyendo invitados: https://whatsapp.com/channel/0029VbDFAEu7YScyVZBNul0X . Redes personales del perfil no se alteran.
7. Admin → Errores y sugerencias: Marcar como atendido conserva el mensaje y marca su estado. Eliminar mensaje abre confirmación; al confirmar se borra definitivamente. Cancelar conserva el mensaje.

## Compras sin cobrar dinero real

Configurar la cuenta de Google como verificadora de licencia en Play Console (estar en prueba interna por sí solo no evita cobros). Abrir Más → RASTRO Pro con esa cuenta de Play y una cuenta RASTRO sin Pro manual. El diálogo de Google debe mostrar compra de prueba y un método de pago de prueba; no confirmar con una tarjeta real. Verificar activación, cancelar pago, restaurar con misma cuenta y revocar/reembolsar el pedido de prueba en Play para comprobar retirada. Los regalos manuales siguen separados.

Google admite pruebas desde builds debug para verificadores de licencia con el mismo paquete com.jonsuapps.rastro. Para la revisión completa de distribución, generar una nueva AAB con estas mejoras y usar el canal interno. No se ha realizado esa subida ni se ha ejecutado la app por el agente.

Referencia oficial: https://developer.android.com/google/play/billing/test

## Límite del directorio Admin

El filtro dentro del popup es explícitamente de Pro manual (rastro_pro). Las compras se verifican en RevenueCat y se abre su listado de clientes desde el botón Ver compradores en RevenueCat. No se clasifica como gratuito a un comprador solo porque no tenga una concesión manual. Un filtro unificado de compras y regalos dentro de la APK requiere una proyección confiable del servidor; no se coloca una clave secreta RevenueCat en Android ni se crean datos de compra simulados. La consulta interna unificada de pagos queda pendiente de esa integración segura.

## 09/10/2026 — Confirmación de monedas y acceso Admin

Canjear o actualizar regalos abre una confirmación con conteo animado de 0 hasta las monedas realmente entregadas. Un canje repetido que devuelve 0 no abre otra celebración ni duplica saldo.

Solo una cuenta Firebase Admin con correo verificado obtiene el día de racha al entrar. Se recupera la cadena continua usando claves de acceso diarias, incluso aperturas de 0 segundos y el último acceso registrado. No se inventan fechas faltantes ni se usa el máximo histórico como prueba de acceso. La recuperación remota Admin cuesta dos lecturas, como máximo una vez por día exitoso en ese dispositivo; sin conexión se cuenta el ingreso actual y se reintenta en otra apertura. Las cuentas normales conservan lección completa o 15 minutos.

Si el Admin tiene Pro regalado, Más → RASTRO Pro → Probar compras (Admin) permite consultar/comprar planes sin quitar su regalo. Este botón no convierte una tarjeta real en una tarjeta de prueba: el correo de Play debe estar configurado como verificador de licencia. Para comprobar el vencimiento del Pro comprado sin que el regalo lo mantenga activo, usar una cuenta de pruebas sin regalo; no quitar regalos reales por defecto.

Anuncios: debug usa identificadores oficiales de prueba; release normal usa los identificadores AdMob reales configurados. Admin en modo usuario sigue usando anuncios de prueba también en release. No se transforma una APK debug en una release al publicar.

Comprobación de código: 359 tests Android/shared, 0 fallos; lintVitalRelease correcto. No se ejecutó la app ni se realizó una compra desde el dispositivo por el agente. La AAB anterior debe regenerarse para incorporar estos cambios.


Play Console verificado el 09/10/2026: tu correo confirmado quedó en la lista RASTRO compras de prueba, seleccionada y guardada en Prueba de licencia. Usa esa cuenta en Play Store, abre Más → RASTRO Pro → Probar compras (Admin) si tienes regalo, elige un plan y verifica Tarjeta de prueba, siempre aprueba. La primera activación y restauración requieren prueba manual en tu teléfono. No confirmar una tarjeta bancaria real.

## 09/10/2026 — Bundle actual distribuido
El estado anterior de candidata local queda sustituido: se regeneró la AAB 205 / 2.0.3 con los cambios actuales y Play confirma disponibilidad interna. Enlace: https://play.google.com/apps/internaltest/4701199787677789376. Usar la cuenta autorizada aguilar.jonsu@gmail.com; Probar compras (Admin) reutiliza checkout real y debe mostrar tarjeta de prueba. No se comprobó todavía una compra física. No desinstalar una APK local sin respaldar antes el progreso.
