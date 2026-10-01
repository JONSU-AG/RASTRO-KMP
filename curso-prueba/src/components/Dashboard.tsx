import React from 'react';
import { 
  Trophy, 
  BookOpen, 
  Brain, 
  CheckCircle2, 
  Flame, 
  Target, 
  ArrowRight, 
  Sparkles,
  Award,
  ChevronRight,
  TrendingUp,
  GraduationCap
} from 'lucide-react';
import { CurriculumDatabase, UserProgressState, TopicItem } from '../types/curriculum';

interface DashboardProps {
  curriculum: CurriculumDatabase;
  progress: UserProgressState;
  onSelectTopic: (topic: TopicItem) => void;
  onSelectEje: (ejeId: string) => void;
  onStartQuiz: () => void;
  onStartFlashcards: () => void;
  onChangeTargetUniversity: (uni: 'UNSA' | 'UNMSM' | 'UNI') => void;
  onChangeTargetArea: (area: 'Ingenierías' | 'Biomédicas' | 'Sociales') => void;
}

export const Dashboard: React.FC<DashboardProps> = ({
  curriculum,
  progress,
  onSelectTopic,
  onSelectEje,
  onStartQuiz,
  onStartFlashcards,
  onChangeTargetUniversity,
  onChangeTargetArea
}) => {
  // Calculate overall stats
  const officialTopics = curriculum.topics.filter(t => !t.isObra);
  const totalTopics = curriculum.topics.length;
  
  let masteredCount = 0;
  let reviewingCount = 0;
  for (const t of curriculum.topics) {
    const s = progress.topicStatus[t.id];
    if (s === 'mastered') masteredCount++;
    else if (s === 'reviewing') reviewingCount++;
  }
  const unstudiedCount = totalTopics - masteredCount - reviewingCount;
  const masteryPercent = Math.round((masteredCount / totalTopics) * 100);

  // Find next recommended topic
  const nextTopic = curriculum.topics.find(t => !progress.topicStatus[t.id] || progress.topicStatus[t.id] === 'reviewing') || curriculum.topics[0];

  // University specific exam weights description
  const uniInfo = {
    UNSA: {
      name: 'Universidad Nacional de San Agustín',
      tag: 'Resolución N.° 0028-2026',
      desc: '100 Preguntas (20 Aptitud Académica + 80 Conocimientos por Área). Ponderación con 9 decimales de precisión.',
      areas: ['Ingenierías', 'Biomédicas', 'Sociales']
    },
    UNMSM: {
      name: 'Universidad Nacional Mayor de San Marcos',
      tag: 'Modelo DECO®',
      desc: 'Preguntas de destrezas cognitivas contextualizadas en lecturas críticas, casos reales e infografías.',
      areas: ['Ingenierías', 'Biomédicas', 'Sociales']
    },
    UNI: {
      name: 'Universidad Nacional de Ingeniería',
      tag: 'Trilogía de Exámenes',
      desc: 'Exigencia rigurosa en Matemática, Física, Química y Razonamiento Analítico.',
      areas: ['Ingenierías']
    }
  };

  return (
    <div className="space-y-8 pb-16">
      {/* Top Banner: Student Status & Target */}
      <div className="relative overflow-hidden rounded-3xl bg-gradient-to-br from-indigo-950 via-slate-900 to-slate-950 border border-indigo-500/20 p-6 sm:p-8 shadow-2xl">
        <div className="absolute top-0 right-0 -mt-8 -mr-8 w-64 h-64 bg-indigo-500/10 rounded-full blur-3xl pointer-events-none" />
        <div className="absolute bottom-0 left-1/3 -mb-10 w-80 h-80 bg-amber-500/5 rounded-full blur-3xl pointer-events-none" />

        <div className="relative z-10 flex flex-col lg:flex-row lg:items-center lg:justify-between gap-6">
          <div className="space-y-3 max-w-2xl">
            <div className="inline-flex items-center gap-2 px-3 py-1 rounded-full bg-indigo-500/10 border border-indigo-500/20 text-indigo-300 text-xs font-semibold">
              <Sparkles className="w-3.5 h-3.5 text-amber-400" />
              <span>Plan de Preparación Preuniversitaria de Élite</span>
            </div>
            <h1 className="text-2xl sm:text-4xl font-extrabold text-white tracking-tight leading-tight">
              Domina los <span className="text-transparent bg-clip-text bg-gradient-to-r from-indigo-400 to-amber-300">208 Temas Oficiales</span> del Prospecto
            </h1>
            <p className="text-sm sm:text-base text-slate-300 leading-relaxed">
              Curricula completa alineada al prospecto de admisión <strong className="text-white">UNSA</strong>, destrezas cognitivas <strong className="text-white">UNMSM (DECO)</strong> y rigor de ciencias <strong className="text-white">UNI</strong>.
            </p>

            {/* University & Area Selectors */}
            <div className="pt-2 flex flex-wrap items-center gap-3">
              <div className="flex items-center gap-2 text-xs text-slate-400">
                <Target className="w-4 h-4 text-indigo-400" />
                <span>Meta:</span>
              </div>
              <div className="flex items-center bg-slate-800/80 p-1 rounded-xl border border-slate-700/60 text-xs">
                {(['UNSA', 'UNMSM', 'UNI'] as const).map((uni) => (
                  <button
                    key={uni}
                    onClick={() => onChangeTargetUniversity(uni)}
                    className={`px-3 py-1 rounded-lg font-bold transition-all ${
                      progress.targetUniversity === uni
                        ? 'bg-indigo-600 text-white shadow-md'
                        : 'text-slate-400 hover:text-white'
                    }`}
                  >
                    {uni}
                  </button>
                ))}
              </div>

              <div className="flex items-center bg-slate-800/80 p-1 rounded-xl border border-slate-700/60 text-xs">
                {(['Ingenierías', 'Biomédicas', 'Sociales'] as const).map((area) => (
                  <button
                    key={area}
                    onClick={() => onChangeTargetArea(area)}
                    className={`px-3 py-1 rounded-lg font-medium transition-all ${
                      progress.targetArea === area
                        ? 'bg-amber-600/90 text-white shadow-md'
                        : 'text-slate-400 hover:text-white'
                    }`}
                  >
                    {area}
                  </button>
                ))}
              </div>
            </div>
          </div>

          {/* Quick Mastery Radial Progress Card */}
          <div className="flex-shrink-0 flex items-center gap-5 p-5 rounded-2xl bg-slate-900/80 border border-slate-800 backdrop-blur-md">
            <div className="relative w-24 h-24 flex items-center justify-center">
              <svg className="w-24 h-24 transform -rotate-90">
                <circle
                  cx="48"
                  cy="48"
                  r="40"
                  stroke="currentColor"
                  strokeWidth="8"
                  className="text-slate-800"
                  fill="transparent"
                />
                <circle
                  cx="48"
                  cy="48"
                  r="40"
                  stroke="currentColor"
                  strokeWidth="8"
                  className="text-indigo-500 transition-all duration-1000 ease-out"
                  fill="transparent"
                  strokeDasharray={251.2}
                  strokeDashoffset={251.2 - (251.2 * masteryPercent) / 100}
                  strokeLinecap="round"
                />
              </svg>
              <div className="absolute inset-0 flex flex-col items-center justify-center">
                <span className="text-xl font-extrabold text-white">{masteryPercent}%</span>
                <span className="text-[10px] uppercase font-bold text-slate-400">Avance</span>
              </div>
            </div>

            <div className="space-y-1.5 text-xs">
              <div className="flex items-center gap-2">
                <span className="w-2.5 h-2.5 rounded-full bg-emerald-500" />
                <span className="text-slate-300 font-semibold">{masteredCount} Dominados</span>
              </div>
              <div className="flex items-center gap-2">
                <span className="w-2.5 h-2.5 rounded-full bg-amber-500" />
                <span className="text-slate-300">{reviewingCount} En Repaso</span>
              </div>
              <div className="flex items-center gap-2">
                <span className="w-2.5 h-2.5 rounded-full bg-slate-700" />
                <span className="text-slate-400">{unstudiedCount} Por Estudiar</span>
              </div>
              <div className="pt-1 text-[11px] text-indigo-400 font-medium">
                Total: {totalTopics} temas analizados
              </div>
            </div>
          </div>
        </div>
      </div>

      {/* Target University Focus Details */}
      <div className="p-4 sm:p-5 rounded-2xl bg-indigo-950/20 border border-indigo-500/20 flex flex-col md:flex-row md:items-center md:justify-between gap-4">
        <div className="flex items-start gap-3.5">
          <div className="p-2.5 rounded-xl bg-indigo-500/10 text-indigo-400 border border-indigo-500/20 mt-0.5">
            <GraduationCap className="w-5 h-5" />
          </div>
          <div>
            <div className="flex items-center gap-2">
              <h2 className="text-sm font-bold text-white">Objetivo: {uniInfo[progress.targetUniversity].name}</h2>
              <span className="px-2 py-0.5 rounded text-[10px] font-semibold bg-indigo-500/20 text-indigo-300">
                {uniInfo[progress.targetUniversity].tag}
              </span>
            </div>
            <p className="text-xs text-slate-300 mt-0.5">
              {uniInfo[progress.targetUniversity].desc} • Área postulada: <strong className="text-amber-300">{progress.targetArea}</strong>
            </p>
          </div>
        </div>

        <div className="flex items-center gap-2">
          <button
            onClick={onStartQuiz}
            className="flex-1 sm:flex-initial inline-flex items-center justify-center gap-2 px-4 py-2 rounded-xl bg-indigo-600 hover:bg-indigo-500 text-white text-xs font-bold transition-all shadow-md shadow-indigo-600/20"
          >
            <TrendingUp className="w-3.5 h-3.5" />
            <span>Simulador de Admisión</span>
          </button>
          <button
            onClick={onStartFlashcards}
            className="flex-1 sm:flex-initial inline-flex items-center justify-center gap-2 px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-200 border border-slate-700 text-xs font-bold transition-all"
          >
            <Brain className="w-3.5 h-3.5 text-purple-400" />
            <span>Flashcards Activas</span>
          </button>
        </div>
      </div>

      {/* Recommended Next Topic Card */}
      {nextTopic && (
        <div className="p-5 sm:p-6 rounded-2xl bg-gradient-to-r from-slate-900 to-indigo-950/40 border border-slate-800 shadow-md flex flex-col md:flex-row md:items-center justify-between gap-4">
          <div className="space-y-1">
            <div className="flex items-center gap-2 text-xs font-bold text-amber-400 uppercase tracking-wider">
              <Flame className="w-4 h-4" />
              <span>Siguiente Tema Recomendado</span>
            </div>
            <h2 className="text-lg font-bold text-white flex items-center gap-2">
              <span>{nextTopic.title}</span>
            </h2>
            <p className="text-xs text-slate-400">
              {nextTopic.subjectName} • {nextTopic.readTimeMinutes} min de lectura • {nextTopic.exercisesCount} reactivos resueltos
            </p>
          </div>
          <button
            onClick={() => onSelectTopic(nextTopic)}
            className="inline-flex items-center justify-center gap-2 px-5 py-2.5 rounded-xl bg-indigo-600 hover:bg-indigo-500 text-white text-xs sm:text-sm font-bold transition-all shadow-lg shadow-indigo-600/25 self-start md:self-auto"
          >
            <span>Comenzar a Estudiar</span>
            <ArrowRight className="w-4 h-4" />
          </button>
        </div>
      )}

      {/* Master 7 Curriculum Axes Breakdown */}
      <div className="space-y-4">
        <div className="flex items-center justify-between">
          <div>
            <h2 className="text-lg sm:text-xl font-extrabold text-white tracking-tight">
              Los 7 Ejes Temáticos del Prospecto Oficial
            </h2>
            <p className="text-xs text-slate-400">
              Progreso granular por eje, asignaturas y temas oficiales
            </p>
          </div>
        </div>

        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
          {curriculum.ejes.map((eje) => {
            const ejeTopics = curriculum.topics.filter(t => t.ejeId === eje.id);
            const ejeMastered = ejeTopics.filter(t => progress.topicStatus[t.id] === 'mastered').length;
            const ejeReviewing = ejeTopics.filter(t => progress.topicStatus[t.id] === 'reviewing').length;
            const ejePercent = ejeTopics.length ? Math.round((ejeMastered / ejeTopics.length) * 100) : 0;

            return (
              <div
                key={eje.id}
                onClick={() => onSelectEje(eje.id)}
                className="group relative p-5 rounded-2xl bg-slate-900/90 border border-slate-800 hover:border-indigo-500/50 transition-all cursor-pointer shadow-md hover:shadow-indigo-500/10 flex flex-col justify-between"
              >
                <div>
                  <div className="flex items-center justify-between mb-3">
                    <span className={`px-2.5 py-1 rounded-lg text-xs font-bold border ${eje.badge}`}>
                      {eje.shortName}
                    </span>
                    <span className="text-xs font-bold text-slate-400 group-hover:text-indigo-400 transition-colors flex items-center gap-1">
                      <span>Ver temas</span>
                      <ChevronRight className="w-3.5 h-3.5 group-hover:translate-x-0.5 transition-transform" />
                    </span>
                  </div>

                  <p className="text-xs text-slate-400 leading-relaxed mb-4 line-clamp-2">
                    {eje.description}
                  </p>
                </div>

                <div className="space-y-2 pt-2 border-t border-slate-800/80">
                  <div className="flex items-center justify-between text-xs">
                    <span className="text-slate-400 font-medium">
                      {ejeMastered} / {ejeTopics.length} dominados
                    </span>
                    <span className="font-bold text-white">{ejePercent}%</span>
                  </div>

                  <div className="w-full h-2 rounded-full bg-slate-800 overflow-hidden">
                    <div
                      className="h-full rounded-full bg-indigo-500 transition-all duration-500"
                      style={{ width: `${ejePercent}%` }}
                    />
                  </div>

                  <div className="flex items-center justify-between text-[11px] text-slate-500 pt-1">
                    <span>{ejeTopics.filter(t => t.isObra).length ? `Incluye ${ejeTopics.filter(t => t.isObra).length} Obras` : `${ejeTopics.length} temas`}</span>
                    <span>{ejeTopics.reduce((acc, t) => acc + t.exercisesCount, 0)} preguntas</span>
                  </div>
                </div>
              </div>
            );
          })}
        </div>
      </div>
    </div>
  );
};
