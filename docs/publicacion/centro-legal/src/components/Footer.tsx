import React from 'react';

interface FooterProps {
  navigate: (path: string) => void;
}

export const Footer: React.FC<FooterProps> = ({ navigate }) => {
  return (
    <footer className="border-t border-slate-200 bg-slate-50 mt-16 py-10 text-slate-600 text-sm">
      <div className="max-w-4xl mx-auto px-4 sm:px-6 flex flex-col sm:flex-row items-center justify-between gap-6">
        <div className="space-y-1 text-center sm:text-left">
          <p className="font-semibold text-slate-900">RASTRO — Centro Legal</p>
          <p className="text-xs text-slate-500">Última actualización: 10 de octubre de 2026</p>
          <p className="text-xs text-slate-500">
            Contacto:{' '}
            <a
              href="mailto:aguilar.jonsu@gmail.com"
              className="text-slate-800 underline hover:text-slate-900 focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded"
            >
              aguilar.jonsu@gmail.com
            </a>
          </p>
        </div>

        <nav aria-label="Enlaces del pie de página" className="flex flex-wrap justify-center gap-x-6 gap-y-2 text-xs sm:text-sm">
          <button
            onClick={() => navigate('/privacidad')}
            className="hover:text-slate-900 underline underline-offset-2 transition-colors focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded"
          >
            Privacidad
          </button>
          <button
            onClick={() => navigate('/terminos')}
            className="hover:text-slate-900 underline underline-offset-2 transition-colors focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded"
          >
            Términos
          </button>
          <button
            onClick={() => navigate('/comunidad')}
            className="hover:text-slate-900 underline underline-offset-2 transition-colors focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded"
          >
            Comunidad
          </button>
          <button
            onClick={() => navigate('/eliminar-cuenta')}
            className="hover:text-slate-900 underline underline-offset-2 transition-colors focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded"
          >
            Eliminar cuenta
          </button>
        </nav>
      </div>
    </footer>
  );
};
