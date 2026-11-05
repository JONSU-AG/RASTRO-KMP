import React from 'react';

interface HomeProps {
  navigate: (path: string) => void;
}

export const Home: React.FC<HomeProps> = ({ navigate }) => {
  const sections = [
    {
      title: 'Política de privacidad',
      path: '/privacidad',
      description: 'Conoce cómo RASTRO recopila, utiliza, almacena y protege tu información personal y tus datos de aprendizaje.',
    },
    {
      title: 'Términos y condiciones',
      path: '/terminos',
      description: 'Consulta las reglas y condiciones de uso del servicio, responsabilidades, cuentas y moderación.',
    },
    {
      title: 'Normas de la comunidad',
      path: '/comunidad',
      description: 'Guía para el aprendizaje colaborativo, respeto, privacidad, reportes y convivencia responsable en RASTRO.',
    },
    {
      title: 'Eliminar cuenta',
      path: '/eliminar-cuenta',
      description: 'Instrucciones para eliminar tu cuenta y datos personales desde la aplicación o por correo electrónico.',
    },
  ];

  return (
    <main className="max-w-4xl mx-auto px-4 sm:px-6 py-10 sm:py-16">
      <div className="border-b border-slate-200 pb-8 mb-10 text-center sm:text-left">
        <span className="text-xs font-semibold tracking-wider text-slate-500 uppercase">
          RASTRO
        </span>
        <h1 className="text-3xl sm:text-4xl font-bold text-slate-900 tracking-tight mt-1 mb-3">
          Centro Legal
        </h1>
        <p className="text-slate-600 text-base sm:text-lg max-w-2xl leading-relaxed">
          Consulta la información legal, las condiciones de uso, las normas de la comunidad y las opciones relacionadas con tu cuenta de RASTRO.
        </p>
      </div>

      <div className="grid grid-cols-1 sm:grid-cols-2 gap-4 sm:gap-6 mb-12">
        {sections.map((section) => (
          <article
            key={section.path}
            className="border border-slate-200 rounded-lg p-6 bg-white hover:border-slate-400 transition-all flex flex-col justify-between group cursor-pointer focus-within:ring-2 focus-within:ring-slate-900"
            onClick={() => navigate(section.path)}
          >
            <div>
              <h2 className="text-lg font-semibold text-slate-900 group-hover:text-slate-800 mb-2 flex items-center justify-between">
                <span>{section.title}</span>
                <span className="text-slate-400 group-hover:text-slate-900 transition-colors text-base" aria-hidden="true">→</span>
              </h2>
              <p className="text-sm text-slate-600 leading-relaxed mb-6">
                {section.description}
              </p>
            </div>
            <button
              onClick={(e) => {
                e.stopPropagation();
                navigate(section.path);
              }}
              className="w-full py-2.5 px-4 text-xs font-semibold text-slate-900 bg-slate-100 hover:bg-slate-200 rounded-md transition-colors text-center focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900"
            >
              Ver {section.title.toLowerCase()}
            </button>
          </article>
        ))}
      </div>

      <div className="border-t border-slate-200 pt-8 text-xs text-slate-500 space-y-1">
        <p className="font-medium text-slate-700">Información del servicio</p>
        <p><strong>Última actualización:</strong> 30 de septiembre de 2026</p>
        <p>
          <strong>Contacto:</strong>{' '}
          <a
            href="mailto:aguilar.jonsu@gmail.com"
            className="text-slate-800 underline hover:text-slate-900"
          >
            aguilar.jonsu@gmail.com
          </a>
        </p>
      </div>
    </main>
  );
};
