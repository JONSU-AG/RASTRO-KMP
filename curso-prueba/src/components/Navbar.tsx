import React from 'react';
import { 
  BookOpen, 
  Brain, 
  Trophy, 
  Search, 
  CheckCircle2, 
  GraduationCap,
  Sparkles,
  Layers
} from 'lucide-react';
import { UserProgressState } from '../types/curriculum';

interface NavbarProps {
  currentTab: 'dashboard' | 'curriculum' | 'quiz' | 'flashcards' | 'gamification';
  onSelectTab: (tab: 'dashboard' | 'curriculum' | 'quiz' | 'flashcards' | 'gamification') => void;
  progress: UserProgressState;
  onOpenSearch: () => void;
  onChangeTargetUniversity: (uni: 'UNSA' | 'UNMSM' | 'UNI') => void;
  onChangeTargetArea: (area: 'Ingenierías' | 'Biomédicas' | 'Sociales') => void;
}

export const Navbar: React.FC<NavbarProps> = ({
  currentTab,
  onSelectTab,
  progress,
  onOpenSearch,
  onChangeTargetUniversity,
  onChangeTargetArea
}) => {
  // Calculate level based on XP
  const level = Math.floor(progress.xp / 100) + 1;
  const currentLevelXp = progress.xp % 100;

  return (
    <header className="sticky top-0 z-40 w-full border-b border-slate-800 bg-slate-900/90 backdrop-blur-md">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8">
        <div className="flex items-center justify-between h-16">
          {/* Logo & Platform Info */}
          <div className="flex items-center gap-3 cursor-pointer" onClick={() => onSelectTab('dashboard')}>
            <div className="w-10 h-10 rounded-xl bg-gradient-to-tr from-indigo-600 via-indigo-500 to-amber-500 flex items-center justify-center shadow-lg shadow-indigo-500/20 text-white font-bold text-xl">
              🎓
            </div>
            <div>
              <div className="flex items-center gap-2">
                <span className="font-extrabold text-base sm:text-lg tracking-tight text-white">
                  ACADEMIA <span className="text-indigo-400">ÉLITE</span>
                </span>
                <span className="hidden md:inline-flex items-center px-2 py-0.5 rounded text-[10px] font-semibold bg-indigo-500/20 text-indigo-300 border border-indigo-500/30">
                  UNSA · UNMSM · UNI
                </span>
              </div>
              <p className="text-[11px] text-slate-400 hidden sm:block">
                Prospecto Oficial 208 Temas & Obras Maestras
              </p>
            </div>
          </div>

          {/* Desktop Navigation Links */}
          <nav className="hidden lg:flex items-center gap-1">
            <button
              onClick={() => onSelectTab('dashboard')}
              className={`flex items-center gap-2 px-3.5 py-2 rounded-lg text-sm font-medium transition-all ${
                currentTab === 'dashboard'
                  ? 'bg-indigo-600/20 text-indigo-300 border border-indigo-500/30 shadow-sm'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <CheckCircle2 className="w-4 h-4 text-indigo-400" />
              <span>Avance & Ejes</span>
            </button>

            <button
              onClick={() => onSelectTab('curriculum')}
              className={`flex items-center gap-2 px-3.5 py-2 rounded-lg text-sm font-medium transition-all ${
                currentTab === 'curriculum'
                  ? 'bg-indigo-600/20 text-indigo-300 border border-indigo-500/30 shadow-sm'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <BookOpen className="w-4 h-4 text-blue-400" />
              <span>Temario Completo</span>
            </button>

            <button
              onClick={() => onSelectTab('quiz')}
              className={`flex items-center gap-2 px-3.5 py-2 rounded-lg text-sm font-medium transition-all ${
                currentTab === 'quiz'
                  ? 'bg-indigo-600/20 text-indigo-300 border border-indigo-500/30 shadow-sm'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <GraduationCap className="w-4 h-4 text-emerald-400" />
              <span>Simulacros & Drills</span>
            </button>

            <button
              onClick={() => onSelectTab('flashcards')}
              className={`flex items-center gap-2 px-3.5 py-2 rounded-lg text-sm font-medium transition-all ${
                currentTab === 'flashcards'
                  ? 'bg-indigo-600/20 text-indigo-300 border border-indigo-500/30 shadow-sm'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <Brain className="w-4 h-4 text-purple-400" />
              <span>Flashcards</span>
            </button>

            <button
              onClick={() => onSelectTab('gamification')}
              className={`flex items-center gap-2 px-3.5 py-2 rounded-lg text-sm font-medium transition-all ${
                currentTab === 'gamification'
                  ? 'bg-indigo-600/20 text-indigo-300 border border-indigo-500/30 shadow-sm'
                  : 'text-slate-400 hover:text-slate-200 hover:bg-slate-800/60'
              }`}
            >
              <Trophy className="w-4 h-4 text-amber-400" />
              <span>Logros & XP</span>
            </button>
          </nav>

          {/* Right Controls: Search, Target Selector & XP */}
          <div className="flex items-center gap-2 sm:gap-3">
            {/* Quick Search Button */}
            <button
              onClick={onOpenSearch}
              className="flex items-center gap-2 px-3 py-1.5 rounded-lg bg-slate-800/80 hover:bg-slate-800 text-slate-400 hover:text-slate-200 border border-slate-700/60 text-xs sm:text-sm transition-colors"
              title="Buscar en todo el temario"
            >
              <Search className="w-4 h-4 text-indigo-400" />
              <span className="hidden sm:inline">Buscar tema...</span>
              <kbd className="hidden sm:inline-block px-1.5 py-0.5 rounded bg-slate-700/80 text-[10px] font-mono text-slate-300 border border-slate-600">
                ⌘K
              </kbd>
            </button>

            {/* University Target Selector */}
            <div className="hidden sm:flex items-center rounded-lg bg-slate-800/90 border border-slate-700 p-0.5 text-xs font-semibold">
              {(['UNSA', 'UNMSM', 'UNI'] as const).map((uni) => (
                <button
                  key={uni}
                  onClick={() => onChangeTargetUniversity(uni)}
                  className={`px-2 py-1 rounded transition-colors ${
                    progress.targetUniversity === uni
                      ? 'bg-indigo-600 text-white shadow-sm'
                      : 'text-slate-400 hover:text-slate-200'
                  }`}
                >
                  {uni}
                </button>
              ))}
            </div>

            {/* XP Chip */}
            <div 
              onClick={() => onSelectTab('gamification')}
              className="flex items-center gap-2 px-3 py-1 rounded-xl bg-gradient-to-r from-amber-500/10 to-amber-600/20 border border-amber-500/30 text-amber-300 text-xs font-bold cursor-pointer hover:border-amber-400 transition-all shadow-sm"
              title={`Nivel ${level} • ${currentLevelXp}/100 XP para subir de nivel`}
            >
              <Sparkles className="w-3.5 h-3.5 text-amber-400 animate-pulse" />
              <span>Nvl {level}</span>
              <span className="hidden sm:inline text-amber-400/70 font-mono">({progress.xp} XP)</span>
            </div>
          </div>
        </div>

        {/* Mobile Submenu Bar */}
        <div className="flex lg:hidden items-center justify-around py-2 border-t border-slate-800/80 text-xs">
          <button
            onClick={() => onSelectTab('dashboard')}
            className={`flex flex-col items-center gap-1 ${
              currentTab === 'dashboard' ? 'text-indigo-400 font-semibold' : 'text-slate-400'
            }`}
          >
            <CheckCircle2 className="w-4 h-4" />
            <span>Avance</span>
          </button>
          <button
            onClick={() => onSelectTab('curriculum')}
            className={`flex flex-col items-center gap-1 ${
              currentTab === 'curriculum' ? 'text-indigo-400 font-semibold' : 'text-slate-400'
            }`}
          >
            <BookOpen className="w-4 h-4" />
            <span>Temario</span>
          </button>
          <button
            onClick={() => onSelectTab('quiz')}
            className={`flex flex-col items-center gap-1 ${
              currentTab === 'quiz' ? 'text-indigo-400 font-semibold' : 'text-slate-400'
            }`}
          >
            <GraduationCap className="w-4 h-4" />
            <span>Simulacros</span>
          </button>
          <button
            onClick={() => onSelectTab('flashcards')}
            className={`flex flex-col items-center gap-1 ${
              currentTab === 'flashcards' ? 'text-indigo-400 font-semibold' : 'text-slate-400'
            }`}
          >
            <Brain className="w-4 h-4" />
            <span>Flashcards</span>
          </button>
          <button
            onClick={() => onSelectTab('gamification')}
            className={`flex flex-col items-center gap-1 ${
              currentTab === 'gamification' ? 'text-indigo-400 font-semibold' : 'text-slate-400'
            }`}
          >
            <Trophy className="w-4 h-4" />
            <span>Logros</span>
          </button>
        </div>
      </div>
    </header>
  );
};
