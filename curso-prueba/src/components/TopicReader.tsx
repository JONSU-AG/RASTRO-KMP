import React, { useState, useEffect } from 'react';
import { 
  ArrowLeft, 
  Bookmark, 
  CheckCircle2, 
  Brain, 
  GraduationCap, 
  FileText, 
  ChevronLeft, 
  ChevronRight, 
  Maximize2, 
  Minimize2, 
  Sparkles,
  Award,
  Clock,
  Edit3,
  Save,
  Check
} from 'lucide-react';
import { TopicItem, UserProgressState, TopicStudyStatus } from '../types/curriculum';
import { loadTopicContent } from '../utils/contentLoader';
import { MarkdownView } from './MarkdownView';

interface TopicReaderProps {
  topic: TopicItem;
  allTopics: TopicItem[];
  progress: UserProgressState;
  onBack: () => void;
  onSelectTopic: (topic: TopicItem) => void;
  onToggleBookmark: (topicId: string) => void;
  onChangeTopicStatus: (topicId: string, status: TopicStudyStatus) => void;
  onSaveNote: (topicId: string, note: string) => void;
  onStartQuizForTopic: (topic: TopicItem) => void;
  onStartFlashcardsForTopic: (topic: TopicItem) => void;
}

export const TopicReader: React.FC<TopicReaderProps> = ({
  topic,
  allTopics,
  progress,
  onBack,
  onSelectTopic,
  onToggleBookmark,
  onChangeTopicStatus,
  onSaveNote,
  onStartQuizForTopic,
  onStartFlashcardsForTopic
}) => {
  const [content, setContent] = useState<string>('');
  const [isLoading, setIsLoading] = useState<boolean>(true);
  const [fontSize, setFontSize] = useState<'normal' | 'large' | 'huge'>('normal');
  const [isFocusMode, setIsFocusMode] = useState<boolean>(false);
  const [showNotes, setShowNotes] = useState<boolean>(false);
  const [currentNote, setCurrentNote] = useState<string>(progress.notes[topic.id] || '');
  const [noteSavedFeedback, setNoteSavedFeedback] = useState<boolean>(false);

  // Find previous and next topics in sequence
  const currentIndex = allTopics.findIndex(t => t.id === topic.id);
  const prevTopic = currentIndex > 0 ? allTopics[currentIndex - 1] : null;
  const nextTopic = currentIndex < allTopics.length - 1 ? allTopics[currentIndex + 1] : null;

  const status = progress.topicStatus[topic.id] || 'unstudied';
  const isBookmarked = progress.bookmarks.includes(topic.id);

  // Load content
  useEffect(() => {
    let isMounted = true;
    setIsLoading(true);
    window.scrollTo({ top: 0, behavior: 'smooth' });

    loadTopicContent(topic.filePath)
      .then(text => {
        if (isMounted) {
          setContent(text);
          setIsLoading(false);
        }
      })
      .catch(err => {
        if (isMounted) {
          setContent('# Error de lectura\nNo se pudo cargar el archivo.');
          setIsLoading(false);
        }
      });

    return () => {
      isMounted = false;
    };
  }, [topic.filePath]);

  // Sync note
  useEffect(() => {
    setCurrentNote(progress.notes[topic.id] || '');
  }, [topic.id, progress.notes]);

  const handleSaveNote = () => {
    onSaveNote(topic.id, currentNote);
    setNoteSavedFeedback(true);
    setTimeout(() => setNoteSavedFeedback(false), 2000);
  };

  return (
    <div className={`space-y-6 pb-20 ${isFocusMode ? 'max-w-4xl mx-auto' : ''}`}>
      {/* Top Navigation & Breadcrumbs */}
      <div className="flex flex-wrap items-center justify-between gap-3 pb-3 border-b border-slate-800">
        <button
          onClick={onBack}
          className="inline-flex items-center gap-2 text-xs sm:text-sm font-semibold text-slate-400 hover:text-white transition-colors"
        >
          <ArrowLeft className="w-4 h-4" />
          <span>Volver al Temario</span>
        </button>

        <div className="flex items-center gap-2">
          {/* Previous Topic */}
          {prevTopic && (
            <button
              onClick={() => onSelectTopic(prevTopic)}
              className="p-1.5 rounded-lg bg-slate-900 border border-slate-800 text-slate-400 hover:text-white hover:border-slate-700 transition-colors"
              title={`Anterior: ${prevTopic.title}`}
            >
              <ChevronLeft className="w-4 h-4" />
            </button>
          )}

          {/* Next Topic */}
          {nextTopic && (
            <button
              onClick={() => onSelectTopic(nextTopic)}
              className="p-1.5 rounded-lg bg-slate-900 border border-slate-800 text-slate-400 hover:text-white hover:border-slate-700 transition-colors"
              title={`Siguiente: ${nextTopic.title}`}
            >
              <ChevronRight className="w-4 h-4" />
            </button>
          )}

          {/* Focus Mode Toggle */}
          <button
            onClick={() => setIsFocusMode(!isFocusMode)}
            className={`p-1.5 rounded-lg border transition-colors ${
              isFocusMode
                ? 'bg-indigo-600 text-white border-indigo-500'
                : 'bg-slate-900 border-slate-800 text-slate-400 hover:text-white'
            }`}
            title={isFocusMode ? 'Salir de Modo Enfoque' : 'Modo Enfoque (Sin distracciones)'}
          >
            {isFocusMode ? <Minimize2 className="w-4 h-4" /> : <Maximize2 className="w-4 h-4" />}
          </button>
        </div>
      </div>

      {/* Main Ficha Técnica Banner */}
      <div className="p-6 sm:p-8 rounded-3xl bg-gradient-to-br from-slate-900 via-slate-900 to-indigo-950/40 border border-slate-800 shadow-xl space-y-4">
        <div className="flex flex-wrap items-center justify-between gap-3">
          <div className="flex items-center gap-2">
            <span className="px-3 py-1 rounded-lg text-xs font-bold bg-indigo-500/20 text-indigo-300 border border-indigo-500/30">
              {topic.subjectName}
            </span>
            <span className="text-xs text-slate-400">
              • {topic.readTimeMinutes} min de lectura • {topic.wordCount} palabras
            </span>
          </div>

          <div className="flex items-center gap-2">
            {/* Bookmark button */}
            <button
              onClick={() => onToggleBookmark(topic.id)}
              className={`p-2 rounded-xl border transition-colors ${
                isBookmarked
                  ? 'bg-amber-500/20 text-amber-400 border-amber-500/40'
                  : 'bg-slate-800/80 text-slate-400 hover:text-white border-slate-700'
              }`}
              title={isBookmarked ? 'Quitar de guardados' : 'Guardar en favoritos'}
            >
              <Bookmark className="w-4 h-4" fill={isBookmarked ? 'currentColor' : 'none'} />
            </button>

            {/* Study Status Button */}
            <button
              onClick={() => {
                const nextStatus: TopicStudyStatus =
                  status === 'unstudied'
                    ? 'reviewing'
                    : status === 'reviewing'
                    ? 'mastered'
                    : 'unstudied';
                onChangeTopicStatus(topic.id, nextStatus);
              }}
              className={`flex items-center gap-2 px-3 py-1.5 rounded-xl border text-xs font-bold transition-all ${
                status === 'mastered'
                  ? 'bg-emerald-950/60 text-emerald-300 border-emerald-500/50 shadow-md shadow-emerald-500/10'
                  : status === 'reviewing'
                  ? 'bg-amber-950/60 text-amber-300 border-amber-500/50'
                  : 'bg-slate-800 text-slate-300 border-slate-700 hover:border-slate-600'
              }`}
            >
              <CheckCircle2 className="w-4 h-4" />
              <span>
                {status === 'mastered'
                  ? 'Dominado (+50 XP)'
                  : status === 'reviewing'
                  ? 'En Repaso'
                  : 'Marcar como Estudiado'}
              </span>
            </button>
          </div>
        </div>

        <h1 className="text-2xl sm:text-4xl font-extrabold text-white tracking-tight leading-tight">
          {topic.title}
        </h1>

        {/* Ficha Técnica Metadata Grid */}
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-3 pt-2 text-xs">
          <div className="p-3 rounded-xl bg-slate-950/60 border border-slate-800/80">
            <span className="text-slate-500 font-medium block">Ponderación Admisión:</span>
            <span className="text-indigo-300 font-semibold">{topic.ponderacion}</span>
          </div>

          <div className="p-3 rounded-xl bg-slate-950/60 border border-slate-800/80">
            <span className="text-slate-500 font-medium block">Nivel Cognitivo Bloom:</span>
            <span className="text-amber-300 font-semibold">{topic.bloomLevel}</span>
          </div>

          <div className="p-3 rounded-xl bg-slate-950/60 border border-slate-800/80 sm:col-span-2 lg:col-span-1">
            <span className="text-slate-500 font-medium block">Material Complementario:</span>
            <span className="text-emerald-300 font-semibold">
              {topic.exercisesCount} Reactivos con Claves • {topic.flashcardsCount} Flashcards
            </span>
          </div>
        </div>

        {/* Action Bar: Quiz & Flashcard shortcut */}
        <div className="flex flex-wrap items-center gap-3 pt-2">
          {topic.exercisesCount > 0 && (
            <button
              onClick={() => onStartQuizForTopic(topic)}
              className="inline-flex items-center gap-2 px-4 py-2 rounded-xl bg-indigo-600 hover:bg-indigo-500 text-white text-xs font-bold transition-all shadow-md shadow-indigo-600/20"
            >
              <GraduationCap className="w-4 h-4" />
              <span>Practicar Reactivos ({topic.exercisesCount})</span>
            </button>
          )}

          {topic.flashcardsCount > 0 && (
            <button
              onClick={() => onStartFlashcardsForTopic(topic)}
              className="inline-flex items-center gap-2 px-4 py-2 rounded-xl bg-purple-600/80 hover:bg-purple-600 text-white text-xs font-bold transition-all"
            >
              <Brain className="w-4 h-4" />
              <span>Repasar Flashcards ({topic.flashcardsCount})</span>
            </button>
          )}

          <button
            onClick={() => setShowNotes(!showNotes)}
            className="inline-flex items-center gap-2 px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 text-xs font-bold border border-slate-700 transition-all"
          >
            <Edit3 className="w-4 h-4 text-amber-400" />
            <span>{showNotes ? 'Ocultar Apuntes' : 'Mis Apuntes del Tema'}</span>
          </button>
        </div>
      </div>

      {/* Personal Notes Box (Collapsible) */}
      {showNotes && (
        <div className="p-5 rounded-2xl bg-amber-950/20 border border-amber-500/30 space-y-3">
          <div className="flex items-center justify-between">
            <div className="flex items-center gap-2 text-xs font-bold text-amber-300">
              <Edit3 className="w-4 h-4" />
              <span>Cuaderno de Apuntes del Tema</span>
            </div>
            <button
              onClick={handleSaveNote}
              className="inline-flex items-center gap-1.5 px-3 py-1 rounded-lg bg-amber-600 hover:bg-amber-500 text-white text-xs font-bold transition-colors"
            >
              {noteSavedFeedback ? <Check className="w-3.5 h-3.5" /> : <Save className="w-3.5 h-3.5" />}
              <span>{noteSavedFeedback ? 'Guardado!' : 'Guardar'}</span>
            </button>
          </div>
          <textarea
            value={currentNote}
            onChange={(e) => setCurrentNote(e.target.value)}
            placeholder="Escribe tus fórmulas mnemotécnicas, dudas clave o resúmenes personales de este tema..."
            className="w-full h-28 p-3 rounded-xl bg-slate-900 border border-slate-700/80 text-white text-sm focus:outline-none focus:ring-2 focus:ring-amber-500 font-mono"
          />
        </div>
      )}

      {/* Reader Layout: Content + TOC Sidebar */}
      <div className="grid grid-cols-1 lg:grid-cols-4 gap-8">
        {/* Main Content Area */}
        <div className={`lg:col-span-3 ${fontSize === 'large' ? 'text-base' : fontSize === 'huge' ? 'text-lg' : 'text-sm'}`}>
          <div className="p-6 sm:p-10 rounded-3xl bg-slate-900/90 border border-slate-800/90 shadow-2xl min-h-[600px]">
            {isLoading ? (
              <div className="flex flex-col items-center justify-center py-24 space-y-4">
                <div className="w-10 h-10 border-4 border-indigo-500 border-t-transparent rounded-full animate-spin" />
                <p className="text-xs text-slate-400">Cargando marco pedagógico oficial...</p>
              </div>
            ) : (
              <MarkdownView content={content} />
            )}
          </div>
        </div>

        {/* Sticky Table of Contents (Desktop) */}
        {!isFocusMode && (
          <div className="hidden lg:block lg:col-span-1">
            <div className="sticky top-24 space-y-4 p-5 rounded-2xl bg-slate-900/80 border border-slate-800">
              <h2 className="text-xs font-bold uppercase tracking-wider text-slate-400 pb-2 border-b border-slate-800">
                Secciones del Tema
              </h2>

              <nav className="space-y-1 max-h-[calc(100vh-220px)] overflow-y-auto pr-1">
                {topic.sections.map((sec, idx) => (
                  <div
                    key={sec.id}
                    className="text-xs text-slate-400 hover:text-indigo-300 py-1.5 px-2 rounded-lg hover:bg-slate-800/60 transition-colors cursor-pointer leading-snug truncate"
                    title={sec.title}
                  >
                    {sec.title}
                  </div>
                ))}
              </nav>

              {/* Text Size Control */}
              <div className="pt-3 border-t border-slate-800 flex items-center justify-between text-xs">
                <span className="text-slate-500">Tamaño de letra:</span>
                <div className="flex items-center gap-1">
                  <button
                    onClick={() => setFontSize('normal')}
                    className={`px-2 py-0.5 rounded text-[11px] ${fontSize === 'normal' ? 'bg-indigo-600 text-white' : 'text-slate-400'}`}
                  >
                    A
                  </button>
                  <button
                    onClick={() => setFontSize('large')}
                    className={`px-2 py-0.5 rounded text-[13px] ${fontSize === 'large' ? 'bg-indigo-600 text-white' : 'text-slate-400'}`}
                  >
                    A+
                  </button>
                  <button
                    onClick={() => setFontSize('huge')}
                    className={`px-2 py-0.5 rounded text-[15px] ${fontSize === 'huge' ? 'bg-indigo-600 text-white' : 'text-slate-400'}`}
                  >
                    A++
                  </button>
                </div>
              </div>
            </div>
          </div>
        )}
      </div>

      {/* Footer Navigation: Next / Prev Topic */}
      <div className="pt-8 border-t border-slate-800 flex flex-col sm:flex-row items-center justify-between gap-4">
        {prevTopic ? (
          <button
            onClick={() => onSelectTopic(prevTopic)}
            className="w-full sm:w-auto flex items-center gap-3 p-4 rounded-2xl bg-slate-900 border border-slate-800 hover:border-indigo-500/40 transition-all text-left"
          >
            <ChevronLeft className="w-5 h-5 text-indigo-400" />
            <div>
              <span className="text-[10px] text-slate-500 uppercase tracking-wider block">Tema Anterior</span>
              <span className="text-xs sm:text-sm font-bold text-white line-clamp-1">{prevTopic.title}</span>
            </div>
          </button>
        ) : <div />}

        {nextTopic && (
          <button
            onClick={() => onSelectTopic(nextTopic)}
            className="w-full sm:w-auto flex items-center justify-between sm:justify-end gap-3 p-4 rounded-2xl bg-slate-900 border border-slate-800 hover:border-indigo-500/40 transition-all text-right"
          >
            <div>
              <span className="text-[10px] text-slate-500 uppercase tracking-wider block">Siguiente Tema</span>
              <span className="text-xs sm:text-sm font-bold text-white line-clamp-1">{nextTopic.title}</span>
            </div>
            <ChevronRight className="w-5 h-5 text-indigo-400" />
          </button>
        )}
      </div>
    </div>
  );
};
