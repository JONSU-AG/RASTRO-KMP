import React from 'react';

export const EliminarCuenta: React.FC = () => {
  const mailtoUrl = "mailto:aguilar.jonsu@gmail.com?subject=Solicitud%20de%20eliminaci%C3%B3n%20de%20cuenta%20RASTRO";

  return (
    <main className="max-w-4xl mx-auto px-4 sm:px-6 py-8 sm:py-12">
      <article className="prose prose-slate max-w-none">
        <header className="border-b border-slate-200 pb-6 mb-8">
          <div className="text-xs font-semibold uppercase tracking-wider text-slate-500 mb-1">
            RASTRO — CENTRO LEGAL
          </div>
          <h1 className="text-2xl sm:text-3xl font-bold text-slate-900 tracking-tight mb-2">
            Eliminar tu cuenta de RASTRO
          </h1>
          <p className="text-sm sm:text-base text-slate-600 mb-3">
            ELIMINACIÓN DE CUENTA Y DATOS
          </p>
          <div className="flex flex-wrap items-center gap-x-4 gap-y-1 text-xs text-slate-500">
            <span><strong>Última actualización:</strong> 10 de octubre de 2026</span>
            <span>·</span>
            <span><strong>Contacto:</strong> aguilar.jonsu@gmail.com</span>
          </div>
        </header>

        {/* Action Card */}
        <div className="border-2 border-slate-900 rounded-lg p-6 bg-slate-50 mb-8 space-y-4">
          <h2 className="text-base sm:text-lg font-bold text-slate-900 m-0">
            ¿Deseas solicitar la eliminación de tu cuenta fuera de la aplicación?
          </h2>
          <p className="text-sm text-slate-700 m-0 leading-relaxed">
            Si ya no tienes acceso a la aplicación RASTRO o deseas iniciar una solicitud de eliminación directa por correo electrónico, puedes presionar el siguiente botón:
          </p>
          <div className="pt-2 flex flex-col sm:flex-row items-start sm:items-center gap-4">
            <a
              href={mailtoUrl}
              className="inline-flex items-center justify-center px-5 py-3 text-sm font-bold text-white bg-slate-900 hover:bg-slate-800 rounded-md transition-colors focus:outline-none focus:ring-2 focus:ring-offset-2 focus:ring-slate-900"
            >
              Solicitar eliminación por correo
            </a>
            <span className="text-xs text-slate-500">
              Se abrirá tu cliente de correo con el asunto recomendado.
            </span>
          </div>
        </div>

        {/* Security Alert Banner */}
        <div className="border border-slate-300 rounded-md p-4 bg-white text-xs sm:text-sm text-slate-800 mb-8 space-y-1">
          <p className="font-semibold text-slate-900 m-0">
            Aviso de seguridad importante:
          </p>
          <p className="m-0 text-slate-700">
            RASTRO <strong>nunca</strong> te solicitará tu contraseña para tramitar una solicitud de eliminación de cuenta. No envíes contraseñas en tus correos.
          </p>
        </div>

        <div className="space-y-6 text-slate-700 leading-relaxed text-sm sm:text-base">
          <p>
            Los usuarios de RASTRO pueden solicitar o ejecutar la eliminación de su cuenta y de los datos personales asociados que estén bajo control de RASTRO.
          </p>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              1. ELIMINACIÓN DESDE RASTRO
            </h2>
            <p className="mb-2">
              El usuario puede utilizar la opción <strong>Eliminar cuenta</strong> disponible en la aplicación y seguir las instrucciones correspondientes.
            </p>
            <p>
              Antes de confirmar una eliminación definitiva, debe revisar la información mostrada, ya que el proceso puede ser irreversible.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              2. SOLICITUD FUERA DE LA APLICACIÓN
            </h2>
            <p className="mb-2">
              Si el usuario ya no puede acceder a RASTRO o no tiene instalada la aplicación, puede iniciar una solicitud escribiendo a:
            </p>
            <div className="bg-slate-100 p-4 rounded-md text-sm border border-slate-200 my-3 space-y-2">
              <p className="m-0 font-semibold text-slate-900">Correo de contacto:</p>
              <p className="m-0 font-mono text-slate-800">aguilar.jonsu@gmail.com</p>
              <p className="m-0 font-semibold text-slate-900 pt-1">Asunto recomendado:</p>
              <p className="m-0 font-mono text-slate-800">Solicitud de eliminación de cuenta RASTRO</p>
            </div>
            <p className="mb-2">
              Se recomienda utilizar el mismo correo asociado a la cuenta para facilitar la verificación.
            </p>
            <p className="mb-2">
              RASTRO podrá solicitar la información razonablemente necesaria para verificar que la solicitud corresponde al titular de la cuenta.
            </p>
            <p className="font-medium text-slate-900">
              RASTRO nunca debe solicitar la contraseña del usuario para tramitar esta solicitud.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              3. DATOS ASOCIADOS
            </h2>
            <p>
              La eliminación definitiva está destinada a eliminar o desvincular, según corresponda, los datos personales asociados a la cuenta que se encuentren bajo control de RASTRO, incluidos los datos de perfil, progreso y demás datos asociados que deban eliminarse.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              4. CONTENIDO EN GOOGLE DRIVE
            </h2>
            <p className="mb-2">
              Cuando un archivo permanezca almacenado en el Google Drive personal del usuario, dicho archivo puede continuar existiendo en su cuenta de Google después de eliminar RASTRO.
            </p>
            <p>
              El usuario puede administrar o eliminar esos archivos directamente desde su cuenta de Google Drive cuando corresponda.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              5. EXCEPCIONES DE CONSERVACIÓN
            </h2>
            <p className="mb-2">
              Para impedir que escrituras pendientes recreen una cuenta eliminada, se conserva un marcador privado con el identificador de cuenta y fecha de solicitud, sin nombre, correo ni imagen. Las compras, recibos y registros de proveedores pueden conservarse conforme a sus obligaciones y políticas; eliminar RASTRO no cancela una suscripción de Google Play.
            </p>
            <p>
              La información no deberá conservarse durante más tiempo del necesario para la finalidad aplicable.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              6. AYUDA
            </h2>
            <p className="mb-1">Para consultas sobre eliminación:</p>
            <p className="font-medium text-slate-900">
              <a href="mailto:aguilar.jonsu@gmail.com" className="underline hover:text-slate-800">
                aguilar.jonsu@gmail.com
              </a>
            </p>
          </section>
        </div>
      </article>
    </main>
  );
};
