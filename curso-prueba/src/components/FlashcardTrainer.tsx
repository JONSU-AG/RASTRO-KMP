import React, { useState, useMemo } from 'react';
import { 
  Brain, 
  RotateCw, 
  Check, 
  X, 
  Sparkles, 
  ChevronRight, 
  ChevronLeft, 
  Layers,
  Award
} from 'lucide-react';
import { CurriculumDatabase, Flashcard } from '../types/curriculum';

interface FlashcardTrainerProps {
  curriculum: CurriculumDatabase;
  onXpEarned: (amount: number) => void;
}

export const FlashcardTrainer: React.FC<FlashcardTrainerProps> = ({
  curriculum,
  onXpEarned
}) => {
  // Aggregate all flashcards with their topic title
  const allCards = useMemo(() => {
    const list: (Flashcard & { topicTitle: string; subjectName: string; ejeId: string })[] = [];
    for (const t of curriculum.topics) {
      for (const fc of t.flashcards) {
        list.push({
          ...fc,
          topicTitle: t.title,
          subjectName: t.subjectName,
          ejeId: t.ejeId
        });
      }
    }
    return list;
  }, [curriculum.topics]);

  const [selectedEje, setSelectedEje] = useState<string>('all');
  const [currentIndex, setCurrentIndex] = useState<number>(0);
  const [isFlipped, setIsFlipped] = useState<boolean>(false);
  const [masteredIds, setMasteredIds] = useState<string[]>([]);

  const filteredCards = useMemo(() => {
    if (selectedEje === 'all') return allCards;
    return allCards.filter(c => c.ejeId === selectedEje);
  }, [allCards, selectedEje]);

  const currentCard = filteredCards[currentIndex] || filteredCards[0];

  const handleNext = () => {
    setIsFlipped(false);
    setCurrentIndex((prev) => (prev + 1) % filteredCards.length);
  };

  const handlePrev = () => {
    setIsFlipped(false);
    setCurrentIndex((prev) => (prev - 1 + filteredCards.length) % filteredCards.length);
  };

  const handleMarkLearned = (cardId: string) => {
    if (!masteredIds.includes(cardId)) {
      setMasteredIds(prev => [...prev, cardId]);
      onXpEarned(15);
    }
    handleNext();
  };

  if (filteredCards.length === 0) {
    return (
      <div className="max-w-2xl mx-auto text-center py-20">
        <Brain className="w-12 h-12 text-slate-600 mx-auto mb-3" />
        <h2 className="text-lg font-bold text-white">No hay flashcards para este eje</h2>
        <button
          onClick={() => setSelectedEje('all')}
          className="mt-4 px-4 py-2 rounded-xl bg-indigo-600 text-white text-xs font-bold"
        >
          Ver Todas las Flashcards
        </button>
      </div>
    );
  }

  return (
    <div className="max-w-3xl mx-auto space-y-6 pb-20">
      {/* Header */}
      <div className="text-center space-y-2">
        <div className="inline-flex items-center gap-2 px-3 py-1 rounded-full bg-purple-500/10 text-purple-300 border border-purple-500/20 text-xs font-bold">
          <Brain className="w-3.5 h-3.5" />
          <span>Repaso Activo Espaciado</span>
        </div>
        <h1 className="text-2xl sm:text-3xl font-extrabold text-white tracking-tight">
          Entrenador de Flashcards Preuniversitarias
        </h1>
        <p className="text-xs text-slate-400">
          Refuerza definiciones, fórmulas y mnemotecnias clave de admisión
        </p>
      </div>

      {/* Filter by Eje */}
      <div className="flex items-center justify-center gap-2 overflow-x-auto pb-2 text-xs">
        <button
          onClick={() => {
            setSelectedEje('all');
            setCurrentIndex(0);
            setIsFlipped(false);
          }}
          className={`px-3 py-1.5 rounded-xl font-bold whitespace-nowrap ${
            selectedEje === 'all'
              ? 'bg-purple-600 text-white shadow-md'
              : 'bg-slate-900 text-slate-400 hover:text-white border border-slate-800'
          }`}
        >
          Todas ({allCards.length})
        </button>
        {curriculum.ejes.map((eje) => {
          const count = allCards.filter(c => c.ejeId === eje.id).length;
          if (count === 0) return null;
          return (
            <button
              key={eje.id}
              onClick={() => {
                setSelectedEje(eje.id);
                setCurrentIndex(0);
                setIsFlipped(false);
              }}
              className={`px-3 py-1.5 rounded-xl font-bold whitespace-nowrap ${
                selectedEje === eje.id
                  ? 'bg-purple-600 text-white shadow-md'
                  : 'bg-slate-900 text-slate-400 hover:text-white border border-slate-800'
              }`}
            >
              {eje.shortName} ({count})
            </button>
          );
        })}
      </div>

      {/* Progress & Card Index */}
      <div className="flex items-center justify-between text-xs text-slate-400 px-2">
        <span>Tarjeta {currentIndex + 1} de {filteredCards.length}</span>
        <span className="text-purple-400 font-semibold">{masteredIds.length} dominadas</span>
      </div>

      {/* Flip Card Container */}
      <div
        onClick={() => setIsFlipped(!isFlipped)}
        className="min-h-[320px] sm:min-h-[360px] p-8 sm:p-12 rounded-3xl bg-gradient-to-br from-slate-900 via-slate-900 to-purple-950/30 border border-slate-800 hover:border-purple-500/40 cursor-pointer shadow-2xl transition-all flex flex-col justify-between relative group select-none"
      >
        <div className="flex items-center justify-between text-xs">
          <span className="px-2.5 py-1 rounded-lg bg-slate-800 text-purple-300 font-semibold border border-slate-700">
            {currentCard.subjectName}
          </span>
          <span className="text-slate-500 flex items-center gap-1 group-hover:text-purple-400 transition-colors">
            <RotateCw className="w-3.5 h-3.5" />
            <span>Clic para voltear</span>
          </span>
        </div>

        <div className="my-auto py-6 text-center">
          {!isFlipped ? (
            <div className="space-y-3">
              <span className="text-xs uppercase font-extrabold tracking-wider text-purple-400 block">
                Pregunta de Admisión
              </span>
              <h2 className="text-lg sm:text-2xl font-bold text-white leading-relaxed">
                {currentCard.question}
              </h2>
            </div>
          ) : (
            <div className="space-y-3 animate-fade-in">
              <span className="text-xs uppercase font-extrabold tracking-wider text-emerald-400 block">
                Respuesta Clave
              </span>
              <p className="text-base sm:text-xl font-semibold text-slate-100 leading-relaxed">
                {currentCard.answer}
              </p>
            </div>
          )}
        </div>

        <div className="text-center text-xs text-slate-500 truncate">
          Tema: {currentCard.topicTitle}
        </div>
      </div>

      {/* Controls: Prev, Next, Grade */}
      <div className="flex items-center justify-between gap-4 pt-2">
        <button
          onClick={handlePrev}
          className="flex-1 py-3 rounded-2xl bg-slate-900 border border-slate-800 text-slate-300 hover:text-white font-semibold text-xs flex items-center justify-center gap-1.5 transition-colors"
        >
          <ChevronLeft className="w-4 h-4" />
          <span>Anterior</span>
        </button>

        <button
          onClick={() => handleMarkLearned(currentCard.id)}
          className="flex-1 py-3 rounded-2xl bg-emerald-600 hover:bg-emerald-500 text-white font-bold text-xs flex items-center justify-center gap-1.5 shadow-lg shadow-emerald-600/20 transition-all"
        >
          <Check className="w-4 h-4" />
          <span>¡La sé! (+15 XP)</span>
        </button>

        <button
          onClick={handleNext}
          className="flex-1 py-3 rounded-2xl bg-slate-900 border border-slate-800 text-slate-300 hover:text-white font-semibold text-xs flex items-center justify-center gap-1.5 transition-colors"
        >
          <span>Siguiente</span>
          <ChevronRight className="w-4 h-4" />
        </button>
      </div>
    </div>
  );
};
