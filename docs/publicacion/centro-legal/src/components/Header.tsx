import React from 'react';

interface HeaderProps {
  currentPath: string;
  navigate: (path: string) => void;
}

export const Header: React.FC<HeaderProps> = ({ currentPath, navigate }) => {
  const navItems = [
    { path: '/', label: 'Inicio' },
    { path: '/privacidad', label: 'Privacidad' },
    { path: '/terminos', label: 'Términos' },
    { path: '/comunidad', label: 'Comunidad' },
    { path: '/eliminar-cuenta', label: 'Eliminar cuenta' },
  ];

  return (
    <header className="sticky top-0 z-50 bg-white/95 backdrop-blur-sm border-b border-slate-200">
      <div className="max-w-4xl mx-auto px-4 sm:px-6 h-16 flex items-center justify-between gap-4">
        {/* Brand */}
        <button
          onClick={() => navigate('/')}
          className="text-left group focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 rounded-md p-1 -ml-1 transition-colors"
          aria-label="RASTRO Centro Legal Inicio"
        >
          <div className="flex items-baseline gap-2">
            <span className="font-bold text-lg sm:text-xl tracking-tight text-slate-900 group-hover:text-slate-700">
              RASTRO
            </span>
            <span className="text-xs sm:text-sm font-medium text-slate-500 uppercase tracking-wider">
              Centro Legal
            </span>
          </div>
        </button>

        {/* Navigation */}
        <nav aria-label="Navegación principal" className="flex items-center gap-1 sm:gap-2 overflow-x-auto py-2 no-scrollbar">
          {navItems.map((item) => {
            const isActive = currentPath === item.path;
            return (
              <button
                key={item.path}
                onClick={() => navigate(item.path)}
                className={`px-2.5 sm:px-3 py-1.5 text-xs sm:text-sm font-medium rounded-md whitespace-nowrap transition-colors focus:outline-none focus-visible:ring-2 focus-visible:ring-slate-900 ${
                  isActive
                    ? 'bg-slate-900 text-white shadow-xs font-semibold'
                    : 'text-slate-600 hover:text-slate-900 hover:bg-slate-100'
                }`}
                aria-current={isActive ? 'page' : undefined}
              >
                {item.label}
              </button>
            );
          })}
        </nav>
      </div>
    </header>
  );
};
