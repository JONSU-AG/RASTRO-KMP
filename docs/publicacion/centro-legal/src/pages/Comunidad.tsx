import React from 'react';

export const Comunidad: React.FC = () => {
  return (
    <main className="max-w-4xl mx-auto px-4 sm:px-6 py-8 sm:py-12">
      <article className="prose prose-slate max-w-none">
        <header className="border-b border-slate-200 pb-6 mb-8">
          <div className="text-xs font-semibold uppercase tracking-wider text-slate-500 mb-1">
            RASTRO — CENTRO LEGAL
          </div>
          <h1 className="text-2xl sm:text-3xl font-bold text-slate-900 tracking-tight mb-2">
            NORMAS DE LA COMUNIDAD
          </h1>
          <div className="flex flex-wrap items-center gap-x-4 gap-y-1 text-xs text-slate-500">
            <span><strong>Última actualización:</strong> 30 de septiembre de 2026</span>
            <span>·</span>
            <span><strong>Contacto:</strong> aguilar.jonsu@gmail.com</span>
          </div>
        </header>

        <div className="space-y-6 text-slate-700 leading-relaxed text-sm sm:text-base">
          <p>
            Las funciones sociales de RASTRO están destinadas al aprendizaje, colaboración y comunicación responsable.
          </p>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              1. RESPETO
            </h2>
            <p className="mb-2">No se permite:</p>
            <ul className="list-disc pl-5 space-y-1">
              <li>Acoso.</li>
              <li>Bullying.</li>
              <li>Amenazas.</li>
              <li>Hostigamiento.</li>
              <li>Discriminación.</li>
              <li>Suplantación.</li>
              <li>Divulgación maliciosa de información privada.</li>
              <li>Ataques dirigidos contra otros usuarios.</li>
            </ul>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              2. CONTENIDO Y MATERIALES
            </h2>
            <p className="mb-2">
              Antes de compartir un PDF, imagen u otro material, el usuario debe asegurarse de tener derecho a compartirlo.
            </p>
            <p>
              No debe publicarse material protegido sin autorización cuando dicha autorización sea necesaria.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              3. PRIVACIDAD
            </h2>
            <p className="mb-2">
              No publiques contraseñas, credenciales, documentos privados ni información sensible propia o de otras personas.
            </p>
            <p>
              Debe prestarse especial cuidado a la información relacionada con menores.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              4. CONTENIDO ILEGAL O PELIGROSO
            </h2>
            <p>
              No se permite utilizar RASTRO para actividades ilegales, fraude, explotación, distribución de software malicioso u otras actividades que puedan perjudicar a otras personas.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              5. REPORTAR
            </h2>
            <p className="mb-2">
              Si un usuario encuentra contenido o comportamiento que considere contrario a estas normas, puede utilizar la función Reportar.
            </p>
            <p>
              RASTRO podrá revisar el reporte y adoptar las medidas correspondientes.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              6. BLOQUEAR
            </h2>
            <p>
              Los usuarios pueden utilizar las herramientas de Bloquear disponibles para limitar interacciones no deseadas.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              7. MODERACIÓN
            </h2>
            <p>
              RASTRO podrá retirar contenido o restringir, suspender o cancelar cuentas cuando resulte necesario ante infracciones de estas normas, los Términos, riesgos de seguridad o requerimientos legales.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              8. REINCIDENCIA
            </h2>
            <p>
              Las infracciones reiteradas pueden resultar en medidas progresivamente más restrictivas, incluida la suspensión o cancelación de la cuenta.
            </p>
          </section>

          <section className="border-t border-slate-200 pt-6">
            <h2 className="text-lg font-semibold text-slate-900 mb-3">
              9. CONTACTO
            </h2>
            <p>
              <a href="mailto:aguilar.jonsu@gmail.com" className="underline hover:text-slate-800 font-medium">
                aguilar.jonsu@gmail.com
              </a>
            </p>
          </section>
        </div>
      </article>
    </main>
  );
};
