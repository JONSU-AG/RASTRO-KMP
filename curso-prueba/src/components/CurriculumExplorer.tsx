import React, { useState, useMemo } from 'react';
import { 
  Search, 
  Filter, 
  Bookmark, 
  BookOpen, 
  CheckCircle2, 
  Clock, 
  HelpCircle, 
  Brain,
  SlidersHorizontal,
  ChevronRight,
  Sparkles,
  Flame
} from 'lucide-react';
import { CurriculumDatabase, UserProgressState, TopicItem, TopicStudyStatus } from '../types/curriculum';

interface CurriculumExplorerProps {
  curriculum: CurriculumDatabase;
  progress: UserProgressState;
  selectedEjeFilter?: string;
  onSelectTopic: (topic: TopicItem) => void;
  onToggleBookmark: (topicId: string) => void;
  onChangeTopicStatus: (topicId: string, status: TopicStudyStatus) => void;
}

export const CurriculumExplorer: React.FC<CurriculumExplorerProps> = ({
  curriculum,
  progress,
  selectedEjeFilter,
  onSelectTopic,
  onToggleBookmark,
  onChangeTopicStatus
}) => {
  const [selectedEje, setSelectedEje] = useState<string>(selectedEjeFilter || 'all');
  const [selectedSubject, setSelectedSubject] = useState<string>('all');
  const [statusFilter, setStatusFilter] = useState<'all' | 'unstudied' | 'reviewing' | 'mastered' | 'bookmarked' | 'obras'>('all');
  const [searchQuery, setSearchQuery] = useState<string>('');

  // Keep in sync if selectedEjeFilter prop changes
  React.useEffect(() => {
    if (selectedEjeFilter) {
      setSelectedEje(selectedEjeFilter);
      setSelectedSubject('all');
    }
  }, [selectedEjeFilter]);

  // Subjects available for selected Eje
  const availableSubjects = useMemo(() => {
    if (selectedEje === 'all') return curriculum.subjects;
    return curriculum.subjects.filter(s => s.ejeId === selectedEje);
  }, [curriculum.subjects, selectedEje]);

  // Filter topics
  const filteredTopics = useMemo(() => {
    return curriculum.topics.filter(topic => {
      // Eje filter
      if (selectedEje !== 'all' && topic.ejeId !== selectedEje) return false;

      // Subject filter
      if (selectedSubject !== 'all' && topic.subjectId !== selectedSubject) return false;

      // Status filter
      const status = progress.topicStatus[topic.id] || 'unstudied';
      if (statusFilter === 'unstudied' && status !== 'unstudied') return false;
      if (statusFilter === 'reviewing' && status !== 'reviewing') return false;
      if (statusFilter === 'mastered' && status !== 'mastered') return false;
      if (statusFilter === 'bookmarked' && !progress.bookmarks.includes(topic.id)) return false;
      if (statusFilter === 'obras' && !topic.isObra) return false;

      // Search query
      if (searchQuery.trim()) {
        const q = searchQuery.toLowerCase();
        const matchesTitle = topic.title.toLowerCase().includes(q);
        const matchesSubject = topic.subjectName.toLowerCase().includes(q);
        const matchesSummary = topic.summary.toLowerCase().includes(q);
        const matchesFull = topic.fullTitle.toLowerCase().includes(q);
        if (!matchesTitle && !matchesSubject && !matchesSummary && !matchesFull) return false;
      }

      return true;
    });
  }, [curriculum.topics, selectedEje, selectedSubject, statusFilter, searchQuery, progress]);

  return (
    <div className="space-y-6 pb-16">
      {/* Header & Search */}
      <div className="flex flex-col md:flex-row md:items-center justify-between gap-4">
        <div>
          <h1 className="text-2xl sm:text-3xl font-extrabold text-white tracking-tight">
            Temario Oficial de Preparación Preuniversitaria
          </h1>
          <p className="text-xs sm:text-sm text-slate-400">
            {curriculum.stats.totalTopics} temas analizados meticulosamente para examen de admisión
          </p>
        </div>

        {/* Search input */}
        <div className="relative min-w-[280px]">
          <Search className="w-4 h-4 text-slate-400 absolute left-3 top-1/2 -translate-y-1/2" />
          <input
            type="text"
            value={searchQuery}
            onChange={(e) => setSearchQuery(e.target.value)}
            placeholder="Buscar por título, concepto..."
            className="w-full pl-9 pr-4 py-2 text-sm bg-slate-900 border border-slate-700/80 rounded-xl text-white placeholder-slate-500 focus:outline-none focus:ring-2 focus:ring-indigo-500"
          />
        </div>
      </div>

      {/* Filter Tabs: Eje Horizontal Scroll */}
      <div className="space-y-3">
        <div className="flex items-center gap-2 overflow-x-auto pb-2 scrollbar-none text-xs font-semibold">
          <button
            onClick={() => {
              setSelectedEje('all');
              setSelectedSubject('all');
            }}
            className={`px-3.5 py-2 rounded-xl transition-all whitespace-nowrap ${
              selectedEje === 'all'
                ? 'bg-indigo-600 text-white shadow-md'
                : 'bg-slate-900 text-slate-400 hover:text-slate-200 border border-slate-800'
            }`}
          >
            Todos los Ejes ({curriculum.stats.totalTopics})
          </button>

          {curriculum.ejes.map((eje) => {
            const count = curriculum.topics.filter(t => t.ejeId === eje.id).length;
            return (
              <button
                key={eje.id}
                onClick={() => {
                  setSelectedEje(eje.id);
                  setSelectedSubject('all');
                }}
                className={`px-3.5 py-2 rounded-xl transition-all whitespace-nowrap flex items-center gap-2 ${
                  selectedEje === eje.id
                    ? 'bg-indigo-600 text-white shadow-md'
                    : 'bg-slate-900 text-slate-400 hover:text-slate-200 border border-slate-800'
                }`}
              >
                <span>{eje.shortName}</span>
                <span className="px-1.5 py-0.5 rounded-full bg-slate-800 text-[10px] text-slate-300">
                  {count}
                </span>
              </button>
            );
          })}
        </div>

        {/* Secondary filters: Subject & Status */}
        <div className="flex flex-wrap items-center justify-between gap-3 pt-2 border-t border-slate-800/80 text-xs">
          {/* Subject Pills */}
          <div className="flex items-center gap-1.5 flex-wrap">
            <span className="text-slate-500 font-semibold mr-1">Asignatura:</span>
            <button
              onClick={() => setSelectedSubject('all')}
              className={`px-2.5 py-1 rounded-lg ${
                selectedSubject === 'all'
                  ? 'bg-slate-700 text-white font-bold'
                  : 'bg-slate-900/60 text-slate-400 hover:text-slate-200'
              }`}
            >
              Todas
            </button>
            {availableSubjects.map((sub) => (
              <button
                key={sub.id}
                onClick={() => setSelectedSubject(sub.id)}
                className={`px-2.5 py-1 rounded-lg ${
                  selectedSubject === sub.id
                    ? 'bg-indigo-600 text-white font-bold'
                    : 'bg-slate-900/60 text-slate-400 hover:text-slate-200'
                }`}
              >
                {sub.name} ({sub.topicsCount})
              </button>
            ))}
          </div>

          {/* Status Filter */}
          <div className="flex items-center gap-1 bg-slate-900/90 p-1 rounded-xl border border-slate-800">
            <button
              onClick={() => setStatusFilter('all')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'all' ? 'bg-slate-700 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              Todos ({filteredTopics.length})
            </button>
            <button
              onClick={() => setStatusFilter('unstudied')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'unstudied' ? 'bg-slate-700 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              Por Estudiar
            </button>
            <button
              onClick={() => setStatusFilter('reviewing')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'reviewing' ? 'bg-amber-600 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              En Repaso
            </button>
            <button
              onClick={() => setStatusFilter('mastered')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'mastered' ? 'bg-emerald-600 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              Dominados
            </button>
            <button
              onClick={() => setStatusFilter('bookmarked')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'bookmarked' ? 'bg-indigo-600 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              Guardados
            </button>
            <button
              onClick={() => setStatusFilter('obras')}
              className={`px-2.5 py-1 rounded-lg transition-colors ${
                statusFilter === 'obras' ? 'bg-rose-600 text-white font-semibold' : 'text-slate-400 hover:text-slate-200'
              }`}
            >
              Obras (39)
            </button>
          </div>
        </div>
      </div>

      {/* Topics Grid */}
      {filteredTopics.length === 0 ? (
        <div className="text-center py-16 px-4 rounded-3xl bg-slate-900/40 border border-slate-800">
          <BookOpen className="w-12 h-12 text-slate-600 mx-auto mb-3" />
          <h3 className="text-base font-bold text-white mb-1">No se encontraron temas</h3>
          <p className="text-xs text-slate-400">Intenta cambiar los filtros o el término de búsqueda.</p>
        </div>
      ) : (
        <div className="grid grid-cols-1 md:grid-cols-2 lg:grid-cols-3 gap-4">
          {filteredTopics.map((topic) => {
            const status = progress.topicStatus[topic.id] || 'unstudied';
            const isBookmarked = progress.bookmarks.includes(topic.id);

            return (
              <div
                key={topic.id}
                className="group relative p-5 rounded-2xl bg-slate-900/90 border border-slate-800 hover:border-indigo-500/40 transition-all flex flex-col justify-between shadow-md hover:shadow-xl hover:shadow-indigo-500/5"
              >
                <div>
                  {/* Top Bar: Subject Badge, Bookmark & Status */}
                  <div className="flex items-center justify-between gap-2 mb-3">
                    <span className="px-2.5 py-0.5 rounded-md text-[11px] font-semibold bg-slate-800 text-indigo-300 border border-slate-700">
                      {topic.subjectName}
                    </span>

                    <div className="flex items-center gap-1.5">
                      <button
                        onClick={(e) => {
                          e.stopPropagation();
                          onToggleBookmark(topic.id);
                        }}
                        className={`p-1.5 rounded-lg border transition-colors ${
                          isBookmarked
                            ? 'bg-amber-500/20 text-amber-400 border-amber-500/40'
                            : 'text-slate-500 hover:text-slate-300 border-transparent hover:border-slate-700'
                        }`}
                        title={isBookmarked ? 'Quitar marcador' : 'Guardar tema'}
                      >
                        <Bookmark className="w-3.5 h-3.5" fill={isBookmarked ? 'currentColor' : 'none'} />
                      </button>

                      {/* Status indicator dot */}
                      <button
                        onClick={(e) => {
                          e.stopPropagation();
                          const nextStatus: TopicStudyStatus =
                            status === 'unstudied'
                              ? 'reviewing'
                              : status === 'reviewing'
                              ? 'mastered'
                              : 'unstudied';
                          onChangeTopicStatus(topic.id, nextStatus);
                        }}
                        className={`px-2 py-0.5 rounded text-[10px] font-bold border transition-colors ${
                          status === 'mastered'
                            ? 'bg-emerald-950/40 text-emerald-300 border-emerald-700/50'
                            : status === 'reviewing'
                            ? 'bg-amber-950/40 text-amber-300 border-amber-700/50'
                            : 'bg-slate-800/80 text-slate-400 border-slate-700'
                        }`}
                        title="Clic para cambiar estado"
                      >
                        {status === 'mastered' ? 'Dominado ✓' : status === 'reviewing' ? 'En Repaso ⏳' : 'Por Estudiar'}
                      </button>
                    </div>
                  </div>

                  {/* Title */}
                  <h3
                    onClick={() => onSelectTopic(topic)}
                    className="text-base font-bold text-white group-hover:text-indigo-300 transition-colors cursor-pointer mb-2 leading-snug line-clamp-2"
                  >
                    {topic.title}
                  </h3>

                  {/* Summary */}
                  <p className="text-xs text-slate-400 line-clamp-2 mb-4 leading-relaxed">
                    {topic.summary || 'Análisis curricular exhaustivo con marco teórico, mnemotecnias y reactivos resueltos.'}
                  </p>
                </div>

                {/* Footer Metrics */}
                <div className="pt-3 border-t border-slate-800/80 flex items-center justify-between text-[11px] text-slate-500">
                  <div className="flex items-center gap-3">
                    <span className="flex items-center gap-1" title="Tiempo estimado de estudio">
                      <Clock className="w-3 h-3 text-slate-400" />
                      <span>{topic.readTimeMinutes}m</span>
                    </span>
                    {topic.exercisesCount > 0 && (
                      <span className="flex items-center gap-1 text-emerald-400/90" title="Reactivos tipo admisión">
                        <HelpCircle className="w-3 h-3" />
                        <span>{topic.exercisesCount} preg</span>
                      </span>
                    )}
                    {topic.flashcardsCount > 0 && (
                      <span className="flex items-center gap-1 text-purple-400/90" title="Flashcards de repaso activo">
                        <Brain className="w-3 h-3" />
                        <span>{topic.flashcardsCount} FC</span>
                      </span>
                    )}
                  </div>

                  <button
                    onClick={() => onSelectTopic(topic)}
                    className="flex items-center gap-1 text-indigo-400 hover:text-indigo-300 font-semibold group-hover:translate-x-0.5 transition-transform"
                  >
                    <span>Estudiar</span>
                    <ChevronRight className="w-3.5 h-3.5" />
                  </button>
                </div>
              </div>
            );
          })}
        </div>
      )}
    </div>
  );
};
