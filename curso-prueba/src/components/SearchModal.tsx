import React, { useState, useEffect, useRef } from 'react';
import { Search, X, BookOpen, ChevronRight, Sparkles } from 'lucide-react';
import { TopicItem } from '../types/curriculum';

interface SearchModalProps {
  isOpen: boolean;
  onClose: () => void;
  topics: TopicItem[];
  onSelectTopic: (topic: TopicItem) => void;
}

export const SearchModal: React.FC<SearchModalProps> = ({
  isOpen,
  onClose,
  topics,
  onSelectTopic
}) => {
  const [query, setQuery] = useState<string>('');
  const inputRef = useRef<HTMLInputElement>(null);

  useEffect(() => {
    if (isOpen) {
      setTimeout(() => inputRef.current?.focus(), 50);
    } else {
      setQuery('');
    }
  }, [isOpen]);

  // Handle escape key
  useEffect(() => {
    const handleKeyDown = (e: KeyboardEvent) => {
      if (e.key === 'Escape' && isOpen) {
        onClose();
      }
      if ((e.metaKey || e.ctrlKey) && e.key === 'k') {
        e.preventDefault();
        if (isOpen) onClose();
        else {
          // Open handled by parent
        }
      }
    };
    window.addEventListener('keydown', handleKeyDown);
    return () => window.removeEventListener('keydown', handleKeyDown);
  }, [isOpen, onClose]);

  if (!isOpen) return null;

  const filtered = query.trim()
    ? topics.filter((t) => {
        const q = query.toLowerCase();
        return (
          t.title.toLowerCase().includes(q) ||
          t.subjectName.toLowerCase().includes(q) ||
          t.summary.toLowerCase().includes(q) ||
          t.fullTitle.toLowerCase().includes(q)
        );
      }).slice(0, 10)
    : topics.slice(0, 6);

  return (
    <div className="fixed inset-0 z-50 flex items-start justify-center pt-16 sm:pt-24 px-4 bg-slate-950/80 backdrop-blur-sm animate-fade-in">
      <div 
        className="w-full max-w-2xl rounded-3xl bg-slate-900 border border-slate-700 shadow-2xl overflow-hidden flex flex-col max-h-[80vh]"
        onClick={(e) => e.stopPropagation()}
      >
        {/* Search Input Bar */}
        <div className="p-4 border-b border-slate-800 flex items-center gap-3">
          <Search className="w-5 h-5 text-indigo-400" />
          <input
            ref={inputRef}
            type="text"
            value={query}
            onChange={(e) => setQuery(e.target.value)}
            placeholder="Buscar entre los 208 temas, fórmulas o materias..."
            className="w-full bg-transparent text-white placeholder-slate-500 text-sm focus:outline-none"
          />
          <button
            onClick={onClose}
            className="p-1 rounded-lg text-slate-400 hover:text-white hover:bg-slate-800"
          >
            <X className="w-4 h-4" />
          </button>
        </div>

        {/* Results List */}
        <div className="overflow-y-auto p-2 space-y-1 divide-y divide-slate-800/40">
          {filtered.length === 0 ? (
            <div className="text-center py-12 text-slate-500 text-xs">
              No se encontraron resultados para "{query}"
            </div>
          ) : (
            filtered.map((topic) => (
              <div
                key={topic.id}
                onClick={() => {
                  onSelectTopic(topic);
                  onClose();
                }}
                className="p-3 rounded-2xl hover:bg-slate-800/80 transition-colors cursor-pointer flex items-center justify-between group"
              >
                <div className="space-y-1 pr-3">
                  <div className="flex items-center gap-2">
                    <span className="px-2 py-0.5 rounded text-[10px] font-semibold bg-indigo-500/20 text-indigo-300">
                      {topic.subjectName}
                    </span>
                    <span className="text-[11px] text-slate-400">{topic.readTimeMinutes} min</span>
                  </div>
                  <h4 className="text-sm font-bold text-white group-hover:text-indigo-300 transition-colors">
                    {topic.title}
                  </h4>
                  <p className="text-xs text-slate-400 line-clamp-1">
                    {topic.summary || 'Marco teórico y preguntas resueltas'}
                  </p>
                </div>
                <ChevronRight className="w-4 h-4 text-slate-500 group-hover:text-indigo-400 group-hover:translate-x-0.5 transition-all flex-shrink-0" />
              </div>
            ))
          )}
        </div>

        {/* Footer info */}
        <div className="p-3 bg-slate-950/60 border-t border-slate-800 flex items-center justify-between text-[11px] text-slate-500">
          <span>{topics.length} temas curriculares disponibles</span>
          <span>Presiona <kbd className="px-1.5 py-0.5 rounded bg-slate-800 text-slate-300">ESC</kbd> para cerrar</span>
        </div>
      </div>
    </div>
  );
};
