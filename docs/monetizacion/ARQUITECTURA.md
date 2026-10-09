# Arquitectura

shared/monetization: concesión con ventana temporal, configuración económica, política de intentos/anuncios y pack con recibos únicos. GamificationManager aplica beneficios y saldo existente; GamificationStateCodec conserva compatibilidad.

MonetizationRepository observa una concesión por cuenta y el único documento global; elimina listeners al cambiar cuenta o salir e ignora callbacks de una cuenta anterior. ProAccess se limpia al cambiar cuenta y refresca vencimiento desde el ticker existente. MonetizationDialogs usa tarjetas del tema, altura acotada y scroll interno. AdminUserDirectory comparte todos los perfiles paginados con Moderación y Pro; búsqueda por correo/nombre/UID y recarga explícita. Pro permite elegir la propia cuenta; no requiere aceptación del estudiante.

ExamSessionStore serializa en un único escritor fuera de Main. El ticket invalida escrituras antiguas al terminar el examen; cada cuenta tiene su sesión. No se guardan bitmaps ni actividad por frame.

EntryNoticeRepository reutiliza site_settings, notificaciones y un documento privado por cuenta para vistos. Bienvenida solo para cuentas creadas desde su activación; avisos requieren inicio/fin vigentes, sin backlog. El guardado de gamificación ahora une días históricos y protege fecha/racha más reciente en transacción. CommunityUploadCard observa perfil del autor y retira listener al salir; deja de depender de la foto antigua incrustada.

## 08/10/2026 — Compras reales con RevenueCat

Se completa el adaptador PlayBillingRepository existente, sin un segundo Pro ni un BillingClient paralelo. RevenueCat 10.26.0 usa Billing 8.3.0; verifica compras y acknowledgement sin callable de Firebase/Blaze. Google Play ProductDetails proporciona precio localizado y base plan. El SDK se identifica con Firebase UID de cuenta no anónima; callbacks de cuentas anteriores se ignoran. Entitlement firmado y tienda/base plan se verifican antes de aplicar Pro.

ProAccess combina concesión manual existente y compra verificada; vencimientos y reembolsos no eliminan regalos Admin. Restaurar requiere acción explícita y las compras quedan con su App User ID original. Al reanudar se consulta CustomerInfo; no se restauran recibos automáticamente. Anuncios normales esperan comprobación de Pro manual/comprado; Admin en vista usuario conserva su preview demo. No se copian credenciales privadas a la APK. Oferta default/Test Store anterior conservada: este modal consulta productos directamente, sin otro paywall.
