import React from 'react';
import { 
  Trophy, 
  Award, 
  Sparkles, 
  ShieldCheck, 
  Star, 
  Flame, 
  Target,
  CheckCircle2,
  Lock
} from 'lucide-react';
import { UserProgressState, CurriculumDatabase } from '../types/curriculum';

interface GamificationPanelProps {
  progress: UserProgressState;
  curriculum: CurriculumDatabase;
}

export const GamificationPanel: React.FC<GamificationPanelProps> = ({
  progress,
  curriculum
}) => {
  const level = Math.floor(progress.xp / 100) + 1;
  const xpInCurrentLevel = progress.xp % 100;

  const ranks = [
    { lvl: 1, name: 'Postulante Novato', desc: 'Comenzando el camino a la universidad' },
    { lvl: 2, name: 'Alumno Disciplinado', desc: 'Constancia en la lectura y simulacros' },
    { lvl: 3, name: 'Cachimbo Promesa', desc: 'Dominio de más de 30 temas oficiales' },
    { lvl: 5, name: 'Estratega Preuniversitario', desc: 'Resolución certera de preguntas DECO' },
    { lvl: 7, name: 'Catedrático Sanmarquino', desc: 'Manejo impecable de ciencias y humanidades' },
    { lvl: 10, name: 'Primer Puesto Cómputo General', desc: 'Puntaje de élite nacional en admisión' }
  ];

  const currentRank = [...ranks].reverse().find(r => level >= r.lvl) || ranks[0];

  const badges = [
    {
      id: 'b1',
      title: 'Cachimbo Promesa',
      desc: 'Ingreso a la Academia Élite',
      icon: '🎓',
      unlocked: true
    },
    {
      id: 'b2',
      title: 'Lector Voraz',
      desc: 'Completar 10 temas de Comprensión Lectora',
      icon: '📚',
      unlocked: progress.xp >= 300
    },
    {
      id: 'b3',
      title: 'Genio del Álgebra',
      desc: 'Dominar 5 temas de Álgebra y Aritmética',
      icon: '📐',
      unlocked: progress.xp >= 500
    },
    {
      id: 'b4',
      title: 'Cerebro Científico',
      desc: 'Dominar temas de Física, Química y Biología',
      icon: '🔬',
      unlocked: progress.xp >= 800
    },
    {
      id: 'b5',
      title: 'Auditor de Retail',
      desc: 'Dominar Tanto por Ciento y Aplicaciones Comerciales',
      icon: '💼',
      unlocked: progress.xp >= 400
    },
    {
      id: 'b6',
      title: 'Erudito Literario',
      desc: 'Revisar las obras cumbre de la literatura peruana',
      icon: '🖋️',
      unlocked: progress.xp >= 600
    },
    {
      id: 'b7',
      title: 'Simulador Máster',
      desc: 'Aprobar un simulacro con más del 80%',
      icon: '🏆',
      unlocked: progress.simulacroHistory.some(s => s.percent >= 80)
    },
    {
      id: 'b8',
      title: 'Cómputo General UNI',
      desc: 'Alcanzar el Nivel 10 de preparación',
      icon: '👑',
      unlocked: level >= 10
    }
  ];

  return (
    <div className="max-w-4xl mx-auto space-y-8 pb-20">
      {/* Top Profile Card */}
      <div className="p-8 rounded-3xl bg-gradient-to-br from-amber-950/40 via-slate-900 to-indigo-950/40 border border-amber-500/20 shadow-2xl relative overflow-hidden">
        <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-6 relative z-10">
          <div className="flex items-center gap-4">
            <div className="w-16 h-16 rounded-2xl bg-amber-500/20 border border-amber-500/40 flex items-center justify-center text-3xl shadow-lg shadow-amber-500/10">
              👑
            </div>
            <div>
              <span className="px-2.5 py-0.5 rounded text-[10px] font-bold bg-amber-500/20 text-amber-300 border border-amber-500/30">
                Rango Actual
              </span>
              <h1 className="text-xl sm:text-2xl font-extrabold text-white mt-1">
                {currentRank.name}
              </h1>
              <p className="text-xs text-slate-400">{currentRank.desc}</p>
            </div>
          </div>

          <div className="text-right sm:border-l sm:border-slate-800 sm:pl-6">
            <span className="text-xs text-slate-400 block">Nivel de Postulante</span>
            <span className="text-3xl font-extrabold text-amber-400">Nivel {level}</span>
            <span className="text-xs text-slate-500 block font-mono mt-0.5">{progress.xp} XP acumulados</span>
          </div>
        </div>

        {/* Level XP Bar */}
        <div className="mt-6 pt-4 border-t border-slate-800/80 space-y-2">
          <div className="flex items-center justify-between text-xs font-semibold">
            <span className="text-slate-400">Progreso hacia el Nivel {level + 1}</span>
            <span className="text-amber-300 font-mono">{xpInCurrentLevel} / 100 XP</span>
          </div>
          <div className="w-full h-3 rounded-full bg-slate-950 overflow-hidden border border-slate-800">
            <div
              className="h-full rounded-full bg-gradient-to-r from-amber-500 to-indigo-500 transition-all duration-700"
              style={{ width: `${xpInCurrentLevel}%` }}
            />
          </div>
        </div>
      </div>

      {/* Badges Collection */}
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <div>
            <h2 className="text-lg font-bold text-white flex items-center gap-2">
              <Award className="w-5 h-5 text-amber-400" />
              <span>Insignias de Mérito Académico</span>
            </h2>
            <p className="text-xs text-slate-400">
              Desbloquea insignias estudiando temas, repasando flashcards y aprobando simulacros
            </p>
          </div>
          <span className="text-xs font-bold text-slate-400">
            {badges.filter(b => b.unlocked).length} / {badges.length} desbloqueadas
          </span>
        </div>

        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
          {badges.map((b) => (
            <div
              key={b.id}
              className={`p-5 rounded-2xl border transition-all flex flex-col items-center text-center ${
                b.unlocked
                  ? 'bg-slate-900 border-amber-500/30 shadow-md shadow-amber-500/5'
                  : 'bg-slate-950/40 border-slate-800/80 opacity-60'
              }`}
            >
              <div className="text-3xl mb-2 relative">
                <span>{b.icon}</span>
                {!b.unlocked && (
                  <div className="absolute inset-0 bg-slate-950/70 rounded-full flex items-center justify-center">
                    <Lock className="w-4 h-4 text-slate-400" />
                  </div>
                )}
              </div>
              <h3 className="text-sm font-bold text-white mb-1">{b.title}</h3>
              <p className="text-xs text-slate-400 leading-snug">{b.desc}</p>
            </div>
          ))}
        </div>
      </div>

      {/* How to Earn XP */}
      <div className="p-6 rounded-3xl bg-slate-900/60 border border-slate-800 space-y-4">
        <h3 className="text-sm font-bold text-white flex items-center gap-2">
          <Sparkles className="w-4 h-4 text-indigo-400" />
          <span>Reglas de Puntos de Experiencia (XP)</span>
        </h3>
        <div className="grid grid-cols-1 sm:grid-cols-3 gap-3 text-xs">
          <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
            <span className="font-bold text-emerald-400 block mb-0.5">+50 XP</span>
            <span className="text-slate-300">Por cada tema oficial marcado como Dominado</span>
          </div>
          <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
            <span className="font-bold text-indigo-400 block mb-0.5">+100 XP</span>
            <span className="text-slate-300">Por completar un Simulacro de Examen</span>
          </div>
          <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
            <span className="font-bold text-purple-400 block mb-0.5">+15 XP</span>
            <span className="text-slate-300">Por dominar una flashcard de repaso</span>
          </div>
        </div>
      </div>
    </div>
  );
};
