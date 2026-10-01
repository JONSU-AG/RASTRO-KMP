import React, { useState, useEffect, useMemo } from 'react';
import { 
  CheckCircle2, 
  XCircle, 
  HelpCircle, 
  Timer, 
  RotateCcw, 
  Award, 
  ChevronRight, 
  ChevronLeft, 
  Flag,
  Sparkles,
  Trophy,
  AlertTriangle
} from 'lucide-react';
import confetti from 'canvas-confetti';
import { CurriculumDatabase, Exercise, TopicItem } from '../types/curriculum';

interface QuizSimulatorProps {
  curriculum: CurriculumDatabase;
  initialTopic?: TopicItem | null;
  onFinishQuiz: (score: number, total: number, mode: string) => void;
}

export const QuizSimulator: React.FC<QuizSimulatorProps> = ({
  curriculum,
  initialTopic,
  onFinishQuiz
}) => {
  // Aggregate all exercises
  const allExercises = useMemo(() => {
    const list: (Exercise & { topicTitle: string; subjectName: string })[] = [];
    for (const t of curriculum.topics) {
      for (const ex of t.exercises) {
        list.push({
          ...ex,
          topicTitle: t.title,
          subjectName: t.subjectName
        });
      }
    }
    return list;
  }, [curriculum.topics]);

  // Quiz state
  const [examMode, setExamMode] = useState<'topic' | 'unsa' | 'unmsm' | 'uni'>('unsa');
  const [selectedTopicId, setSelectedTopicId] = useState<string>(initialTopic?.id || curriculum.topics[0]?.id || '');
  const [questionCount, setQuestionCount] = useState<number>(10);
  
  const [isExamActive, setIsExamActive] = useState<boolean>(false);
  const [isSubmitted, setIsSubmitted] = useState<boolean>(false);
  const [currentQuestionIndex, setCurrentQuestionIndex] = useState<number>(0);
  const [userAnswers, setUserAnswers] = useState<Record<number, string>>({});
  const [flaggedQuestions, setFlaggedQuestions] = useState<Record<number, boolean>>({});
  
  // Timer state
  const [timeRemaining, setTimeRemaining] = useState<number>(1800); // 30 mins
  const [activeQuestions, setActiveQuestions] = useState<(Exercise & { topicTitle: string; subjectName: string })[]>([]);

  // Start exam
  const handleStartExam = () => {
    let pool: (Exercise & { topicTitle: string; subjectName: string })[] = [];

    if (examMode === 'topic') {
      const topic = curriculum.topics.find(t => t.id === selectedTopicId);
      if (topic && topic.exercises.length > 0) {
        pool = topic.exercises.map(ex => ({
          ...ex,
          topicTitle: topic.title,
          subjectName: topic.subjectName
        }));
      }
    }

    if (pool.length === 0) {
      // Pick random from all exercises
      const shuffled = [...allExercises].sort(() => 0.5 - Math.random());
      pool = shuffled.slice(0, Math.min(questionCount, allExercises.length));
    }

    if (pool.length === 0) {
      alert('No se encontraron reactivos para este filtro.');
      return;
    }

    setActiveQuestions(pool);
    setUserAnswers({});
    setFlaggedQuestions({});
    setCurrentQuestionIndex(0);
    setTimeRemaining(pool.length * 120); // 2 mins per question
    setIsExamActive(true);
    setIsSubmitted(false);
  };

  // Timer countdown
  useEffect(() => {
    if (!isExamActive || isSubmitted) return;

    const timer = setInterval(() => {
      setTimeRemaining((prev) => {
        if (prev <= 1) {
          clearInterval(timer);
          handleSubmitExam();
          return 0;
        }
        return prev - 1;
      });
    }, 1000);

    return () => clearInterval(timer);
  }, [isExamActive, isSubmitted]);

  const handleSelectOption = (qIdx: number, optionLetter: string) => {
    if (isSubmitted) return;
    setUserAnswers(prev => ({
      ...prev,
      [qIdx]: optionLetter
    }));
  };

  const handleToggleFlag = (qIdx: number) => {
    setFlaggedQuestions(prev => ({
      ...prev,
      [qIdx]: !prev[qIdx]
    }));
  };

  const handleSubmitExam = () => {
    setIsSubmitted(true);
    setIsExamActive(false);

    // Score calculation
    let correct = 0;
    activeQuestions.forEach((q, idx) => {
      if (userAnswers[idx] === q.answerKey) {
        correct++;
      }
    });

    const percent = Math.round((correct / activeQuestions.length) * 100);
    if (percent >= 70) {
      confetti({
        particleCount: 100,
        spread: 70,
        origin: { y: 0.6 }
      });
    }

    onFinishQuiz(correct, activeQuestions.length, examMode.toUpperCase());
  };

  // Format seconds to MM:SS
  const formatTime = (secs: number) => {
    const mins = Math.floor(secs / 60);
    const s = secs % 60;
    return `${mins.toString().padStart(2, '0')}:${s.toString().padStart(2, '0')}`;
  };

  // If exam is not active and not submitted, show Setup screen
  if (!isExamActive && !isSubmitted) {
    return (
      <div className="max-w-4xl mx-auto space-y-8 pb-16">
        <div className="p-8 rounded-3xl bg-gradient-to-br from-slate-900 via-slate-900 to-indigo-950/40 border border-slate-800 shadow-2xl text-center space-y-4">
          <div className="w-16 h-16 rounded-2xl bg-indigo-500/10 border border-indigo-500/20 text-indigo-400 flex items-center justify-center mx-auto text-3xl">
            🎓
          </div>
          <h1 className="text-2xl sm:text-4xl font-extrabold text-white tracking-tight">
            Simulador de Examen de Admisión
          </h1>
          <p className="text-sm text-slate-400 max-w-xl mx-auto">
            Entrena bajo condiciones reales de cronómetro y ponderación oficial. Banco de reactivos resueltos extraídos directamente del temario preuniversitario.
          </p>
        </div>

        {/* Exam Mode Selector */}
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-4 gap-4">
          {[
            {
              id: 'unsa',
              title: 'Simulacro UNSA',
              desc: 'Formato estándar 100 preguntas (Aptitud + Conocimientos)',
              badge: 'Oficial UNSA 2026'
            },
            {
              id: 'unmsm',
              title: 'Simulacro UNMSM',
              desc: 'Destrezas cognitivas contextualizadas DECO',
              badge: 'Modelo San Marcos'
            },
            {
              id: 'uni',
              title: 'Desafío UNI',
              desc: 'Exigencia matemática y de ciencias aplicadas',
              badge: 'Rigor UNI'
            },
            {
              id: 'topic',
              title: 'Práctica por Tema',
              desc: 'Drill focalizado en una asignatura específica',
              badge: 'Entrenamiento'
            }
          ].map((mode) => (
            <div
              key={mode.id}
              onClick={() => setExamMode(mode.id as any)}
              className={`p-5 rounded-2xl border cursor-pointer transition-all ${
                examMode === mode.id
                  ? 'bg-indigo-600/15 border-indigo-500 shadow-lg shadow-indigo-500/10'
                  : 'bg-slate-900/80 border-slate-800 hover:border-slate-700'
              }`}
            >
              <span className="px-2 py-0.5 rounded text-[10px] font-bold bg-indigo-500/20 text-indigo-300 mb-2 inline-block">
                {mode.badge}
              </span>
              <h3 className="text-base font-bold text-white mb-1">{mode.title}</h3>
              <p className="text-xs text-slate-400">{mode.desc}</p>
            </div>
          ))}
        </div>

        {/* Configuration details */}
        <div className="p-6 rounded-3xl bg-slate-900/90 border border-slate-800 space-y-5">
          {examMode === 'topic' ? (
            <div className="space-y-2">
              <label className="text-xs font-bold text-slate-300 uppercase tracking-wider">
                Selecciona el Tema a Practicar:
              </label>
              <select
                value={selectedTopicId}
                onChange={(e) => setSelectedTopicId(e.target.value)}
                className="w-full p-3 rounded-xl bg-slate-950 border border-slate-700 text-white text-sm focus:outline-none focus:ring-2 focus:ring-indigo-500"
              >
                {curriculum.topics
                  .filter(t => t.exercisesCount > 0)
                  .map(t => (
                    <option key={t.id} value={t.id}>
                      {t.subjectName}: {t.title} ({t.exercisesCount} reactivos)
                    </option>
                  ))}
              </select>
            </div>
          ) : (
            <div className="space-y-2">
              <label className="text-xs font-bold text-slate-300 uppercase tracking-wider">
                Cantidad de Preguntas:
              </label>
              <div className="flex items-center gap-3">
                {[10, 20, 30].map(cnt => (
                  <button
                    key={cnt}
                    onClick={() => setQuestionCount(cnt)}
                    className={`flex-1 py-2.5 rounded-xl border text-sm font-bold transition-all ${
                      questionCount === cnt
                        ? 'bg-indigo-600 text-white border-indigo-500 shadow-md'
                        : 'bg-slate-800 text-slate-300 border-slate-700 hover:text-white'
                    }`}
                  >
                    {cnt} Preguntas ({cnt * 2} min)
                  </button>
                ))}
              </div>
            </div>
          )}

          <button
            onClick={handleStartExam}
            className="w-full py-4 rounded-2xl bg-indigo-600 hover:bg-indigo-500 text-white font-extrabold text-base shadow-xl shadow-indigo-600/25 transition-all flex items-center justify-center gap-2"
          >
            <Sparkles className="w-5 h-5 text-amber-300" />
            <span>Iniciar Simulacro con Cronómetro</span>
          </button>
        </div>
      </div>
    );
  }

  // Active Exam View
  const currentQ = activeQuestions[currentQuestionIndex];
  const isAnswered = userAnswers[currentQuestionIndex] !== undefined;

  return (
    <div className="max-w-4xl mx-auto space-y-6 pb-20">
      {/* Top Header with Timer and Progress */}
      <div className="p-4 sm:p-5 rounded-2xl bg-slate-900 border border-slate-800 flex flex-wrap items-center justify-between gap-4 shadow-lg">
        <div className="flex items-center gap-3">
          <span className="px-3 py-1 rounded-lg text-xs font-bold bg-indigo-500/20 text-indigo-300 border border-indigo-500/30">
            Pregunta {currentQuestionIndex + 1} de {activeQuestions.length}
          </span>
          <span className="text-xs text-slate-400 hidden sm:inline">
            {currentQ.subjectName}
          </span>
        </div>

        {/* Timer */}
        {!isSubmitted && (
          <div className={`flex items-center gap-2 px-4 py-1.5 rounded-xl font-mono text-sm font-bold border ${
            timeRemaining < 300
              ? 'bg-rose-950/40 text-rose-300 border-rose-500/50 animate-pulse'
              : 'bg-slate-950 text-indigo-300 border-slate-800'
          }`}>
            <Timer className="w-4 h-4 text-indigo-400" />
            <span>{formatTime(timeRemaining)}</span>
          </div>
        )}

        {/* Submit or Finish */}
        {!isSubmitted ? (
          <button
            onClick={handleSubmitExam}
            className="px-4 py-1.5 rounded-xl bg-emerald-600 hover:bg-emerald-500 text-white text-xs font-bold transition-all shadow-md shadow-emerald-600/20"
          >
            Finalizar Examen
          </button>
        ) : (
          <button
            onClick={() => {
              setIsExamActive(false);
              setIsSubmitted(false);
            }}
            className="inline-flex items-center gap-2 px-4 py-1.5 rounded-xl bg-indigo-600 hover:bg-indigo-500 text-white text-xs font-bold transition-all"
          >
            <RotateCcw className="w-3.5 h-3.5" />
            <span>Nuevo Simulacro</span>
          </button>
        )}
      </div>

      {/* Results Banner if submitted */}
      {isSubmitted && (
        <div className="p-6 rounded-3xl bg-slate-900/90 border border-slate-800 shadow-xl space-y-3">
          <div className="flex items-center justify-between">
            <h2 className="text-xl font-extrabold text-white flex items-center gap-2">
              <Trophy className="w-5 h-5 text-amber-400" />
              <span>Resultados del Simulacro</span>
            </h2>
            <span className="px-3 py-1 rounded-full bg-indigo-500/20 text-indigo-300 text-xs font-bold">
              +100 XP Ganados
            </span>
          </div>
          <div className="grid grid-cols-3 gap-3 text-center pt-2">
            <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
              <span className="text-2xl font-extrabold text-emerald-400">
                {activeQuestions.filter((q, i) => userAnswers[i] === q.answerKey).length}
              </span>
              <span className="text-xs text-slate-400 block">Correctas</span>
            </div>
            <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
              <span className="text-2xl font-extrabold text-rose-400">
                {activeQuestions.filter((q, i) => userAnswers[i] && userAnswers[i] !== q.answerKey).length}
              </span>
              <span className="text-xs text-slate-400 block">Incorrectas</span>
            </div>
            <div className="p-3 rounded-xl bg-slate-950 border border-slate-800">
              <span className="text-2xl font-extrabold text-slate-400">
                {activeQuestions.filter((q, i) => userAnswers[i] === undefined).length}
              </span>
              <span className="text-xs text-slate-400 block">En Blanco</span>
            </div>
          </div>
        </div>
      )}

      {/* Question Statement Card */}
      <div className="p-6 sm:p-8 rounded-3xl bg-slate-900 border border-slate-800 shadow-xl space-y-6">
        <div className="flex items-start justify-between gap-4">
          <div>
            <span className="text-xs font-semibold text-indigo-400 block mb-1">
              {currentQ.topicTitle}
            </span>
            <h3 className="text-base sm:text-lg font-bold text-white leading-relaxed whitespace-pre-wrap">
              {currentQ.statement}
            </h3>
          </div>

          {!isSubmitted && (
            <button
              onClick={() => handleToggleFlag(currentQuestionIndex)}
              className={`p-2 rounded-xl border transition-colors ${
                flaggedQuestions[currentQuestionIndex]
                  ? 'bg-amber-500/20 text-amber-400 border-amber-500/40'
                  : 'text-slate-500 border-slate-800 hover:text-slate-300'
              }`}
              title="Marcar pregunta para revisar luego"
            >
              <Flag className="w-4 h-4" />
            </button>
          )}
        </div>

        {/* Options List */}
        <div className="space-y-3">
          {currentQ.options.map((opt) => {
            const letter = opt.trim().charAt(0).toUpperCase();
            const isSelected = userAnswers[currentQuestionIndex] === letter;
            const isCorrect = currentQ.answerKey === letter;

            let optionStyle = 'bg-slate-950/80 border-slate-800 text-slate-200 hover:border-indigo-500/50';
            if (isSubmitted) {
              if (isCorrect) {
                optionStyle = 'bg-emerald-950/50 border-emerald-500 text-emerald-200 font-bold';
              } else if (isSelected && !isCorrect) {
                optionStyle = 'bg-rose-950/50 border-rose-500 text-rose-200';
              }
            } else if (isSelected) {
              optionStyle = 'bg-indigo-600/20 border-indigo-500 text-indigo-200 font-semibold shadow-md';
            }

            return (
              <div
                key={opt}
                onClick={() => handleSelectOption(currentQuestionIndex, letter)}
                className={`p-4 rounded-2xl border cursor-pointer transition-all flex items-center justify-between ${optionStyle}`}
              >
                <span className="text-sm">{opt}</span>
                {isSubmitted && isCorrect && (
                  <CheckCircle2 className="w-5 h-5 text-emerald-400 flex-shrink-0 ml-2" />
                )}
                {isSubmitted && isSelected && !isCorrect && (
                  <XCircle className="w-5 h-5 text-rose-400 flex-shrink-0 ml-2" />
                )}
              </div>
            );
          })}
        </div>

        {/* Step-by-Step Resolution (Visible after submit) */}
        {isSubmitted && (
          <div className="p-5 rounded-2xl bg-indigo-950/20 border border-indigo-500/30 space-y-2 mt-6">
            <div className="flex items-center gap-2 text-xs font-bold text-indigo-300">
              <Sparkles className="w-4 h-4 text-amber-400" />
              <span>Resolución Paso a Paso Oficial</span>
            </div>
            <p className="text-xs text-slate-300 leading-relaxed whitespace-pre-wrap font-sans">
              {currentQ.resolution}
            </p>
          </div>
        )}
      </div>

      {/* Navigation & Question Palette */}
      <div className="p-4 sm:p-5 rounded-2xl bg-slate-900 border border-slate-800 space-y-4">
        <div className="flex items-center justify-between">
          <button
            onClick={() => setCurrentQuestionIndex(Math.max(0, currentQuestionIndex - 1))}
            disabled={currentQuestionIndex === 0}
            className="inline-flex items-center gap-1 px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 disabled:opacity-40 text-xs font-semibold"
          >
            <ChevronLeft className="w-4 h-4" />
            <span>Anterior</span>
          </button>

          <span className="text-xs text-slate-500 font-medium">
            {currentQuestionIndex + 1} de {activeQuestions.length}
          </span>

          <button
            onClick={() => setCurrentQuestionIndex(Math.min(activeQuestions.length - 1, currentQuestionIndex + 1))}
            disabled={currentQuestionIndex === activeQuestions.length - 1}
            className="inline-flex items-center gap-1 px-4 py-2 rounded-xl bg-slate-800 hover:bg-slate-700 text-slate-300 disabled:opacity-40 text-xs font-semibold"
          >
            <span>Siguiente</span>
            <ChevronRight className="w-4 h-4" />
          </button>
        </div>

        {/* Palette Grid */}
        <div className="flex flex-wrap gap-2 pt-2 border-t border-slate-800">
          {activeQuestions.map((q, idx) => {
            const answered = userAnswers[idx] !== undefined;
            const flagged = flaggedQuestions[idx];
            const isCur = currentQuestionIndex === idx;

            let btnClass = 'bg-slate-950 text-slate-400 border-slate-800';
            if (isSubmitted) {
              const isCor = userAnswers[idx] === q.answerKey;
              btnClass = isCor ? 'bg-emerald-600 text-white border-emerald-500' : 'bg-rose-600 text-white border-rose-500';
            } else if (flagged) {
              btnClass = 'bg-amber-500/20 text-amber-300 border-amber-500';
            } else if (answered) {
              btnClass = 'bg-indigo-600 text-white border-indigo-500';
            }

            if (isCur) {
              btnClass += ' ring-2 ring-white ring-offset-2 ring-offset-slate-900';
            }

            return (
              <button
                key={idx}
                onClick={() => setCurrentQuestionIndex(idx)}
                className={`w-8 h-8 rounded-lg text-xs font-bold border transition-all ${btnClass}`}
              >
                {idx + 1}
              </button>
            );
          })}
        </div>
      </div>
    </div>
  );
};
