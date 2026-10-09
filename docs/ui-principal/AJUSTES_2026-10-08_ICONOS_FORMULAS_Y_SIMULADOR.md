# Ajustes de Perfil, formulario, Simulador y monedas — 08/10/2026

## Resultado implementado

- Aportar material usa carpeta, hoja y flecha de subida; Aportes subidos usa documentos apilados. Fórmulas usa un pergamino con Σ, Ligas una copa dorada y Racha el recurso de fuego original. Mis errores conserva su icono. Home distingue Aprender (libro) de Cursos (claqueta); Biblioteca utiliza una nueva carpeta opaca. Vectores nativos con rellenos sólidos y contornos.
- Formulario: 32 fórmulas y 37 mnemotecnias en total (+16 de cada una). Identidades algebraicas, geometría, trabajo/potencia/Ohm/energía, densidad/dilución, seno/coseno y porcentajes. Descripciones, condiciones de uso y ejemplos propios. No se modificaron preguntas ni catálogos de Aprender.
- Las fórmulas enlazan mnemotecnias por IDs explícitos del repositorio existente. Se muestran solo enlaces reales o una mnemotecnia propia ya existente; datoClave ya no actúa como falsa mnemotecnia. Se conservan guardados. Tipografía matemática serif negra de 21 sp en expresiones directas, subíndices y fracciones compuestas; scroll horizontal evita partir una identidad larga.
- Resultados de Simulacro, rápido y Ranking: revisión en popup con X, Todas/Errores y omitidas y LazyColumn. Ya no se componen simultáneamente las 80 tarjetas. Back cierra primero el popup y después vuelve al Simulador; durante examen conserva confirmación de finalizar.
- Intentos: coste visible, confirmación antes de gastar las monedas existentes y entrada a Conseguir monedas si no alcanzan. Se conservan primer intento gratuito, intentos Pro, reserva Ranking y devolución de reservas no iniciadas.
- Publicidad: al volver desde resultados se invoca la ubicación de fin de actividad. Admin en modo usuario conserva unidades demo y omite espera de cuenta nueva/frecuencia normal; nunca hay anuncios durante preguntas. Se conserva consentimiento y disponibilidad real de AdMob. No se simula un anuncio cuando el SDK no lo cargó.
- Aviso posterior a anuncio: máximo una vez por cuenta/día local de Lima, incluso entre dispositivos, mediante transacción en el documento existente entry_notices. La marca local evita repetir lecturas en esa instalación; fallo de red omite el aviso. Invitados usan la marca local. Sin aviso antes del anuncio.
- Admin: regalar monedas a una cuenta seleccionada por correo/nombre/UID; crear/cargar/editar/desactivar códigos. Código para un destinatario global o varios destinatarios con un recibo por cuenta. Editar el código conserva los canjes. En Conseguir monedas: Canjear y Actualizar regalos; cuentas invitadas ven invitación a iniciar sesión.

## Firebase y saldo

coin_promos guarda código, monedas, estado y alcance. usuarios/{uid}/coin_rewards contiene los recibos de regalos y canjes. Se consulta por acción del usuario y en páginas de 100; no hay nuevos listeners de regalos ni Cloud Functions. Créditos administrativos no reciben multiplicador Pro. El recibo se conserva en el estado local y en el respaldo personal actual.

Una transacción reserva códigos de un destinatario. Reglas impiden a estudiantes regalarse monedas, cambiar importes, editar recibos, leer recibos ajenos, repetir canjes o reservar un código sin su recibo. Los regalos no se canjean hasta que termine la restauración del progreso; callbacks de otra cuenta se ignoran.

El saldo de RASTRO sigue siendo local con respaldo opcional; este cambio no lo convierte en un monedero financiero ni en un sistema de compras verificadas. Las restauraciones deliberadas de estados antiguos y los conflictos de avance entre dispositivos siguen teniendo los límites del respaldo existente. Los regalos/códigos son créditos gratuitos; pagos reales continúan deshabilitados.

Reglas publicadas en rumbo-jonsu y releídas: coinciden exactamente con firestore.rules. Frente a la versión activa anterior solo se añadieron lectura privada de rastro_pro por su titular/administrador y las reglas de regalos/códigos. No se cambió Spark, cuentas de facturación, productos de pago ni documentos legales.

## Evidencia del cierre y validación

El registro del dispositivo mostró OutOfMemoryError a las 18:53:02 al medir texto de Compose (límite 256 MiB). El resultado componía todas las preguntas en una Column desplazable. La revisión ahora solo compone las tarjetas visibles mediante LazyColumn. Se corrigió esa presión de memoria; confirmar que no reaparece en el teléfono queda pendiente.

- 348 pruebas Android/shared: 0 fallos y 0 errores.
- 8 pruebas Firestore locales: regalos privados, prohibición de suplantación/importe, canje múltiple por usuario, destinatario único, concurrencia de canjes y aviso diario entre dispositivos; incluye regresiones Pro/economía.
- lintVitalRelease correcto.
- Reglas compiladas por Firebase, publicadas y lectura remota idéntica.
- XML de los nuevos vectores y git diff --check revisados.
- Compilación debug mediante compilar_app.bat: BUILD SUCCESSFUL, sin iniciar ni instalar la app. Registro: build/current-assemble.log.
- No se inició ni instaló la app, no se generó AAB ni se publicó en Play. Verificación física de revisión, Back, anuncios y diseño pendiente.

## Referencias académicas

Las expresiones y condiciones son hechos matemáticos/científicos; explicaciones, frases y ejemplos nuevos se redactaron para RASTRO, sin copiar bancos de preguntas ni atribuirlos a una universidad.

- Productos notables: https://openstax.org/books/college-algebra-2e/pages/1-4-polynomials
- Trabajo: https://openstax.org/books/college-physics-2e/pages/7-1-work-the-scientific-definition
- Potencia: https://openstax.org/books/college-physics-2e/pages/7-7-power
- Molaridad y dilución: https://openstax.org/books/chemistry-2e/pages/3-3-molarity
- Razones trigonométricas: https://openstax.org/books/precalculus-2e/pages/5-2-unit-circle-sine-and-cosine-functions
