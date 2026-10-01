import React, { useState, useEffect } from 'react';
import curriculumData from './data/curriculum.json';
import { 
  CurriculumDatabase, 
  TopicItem, 
  TopicStudyStatus, 
  UserProgressState 
} from './types/curriculum';
import { 
  loadProgress, 
  saveProgress, 
  toggleBookmark 
} from './utils/storage';
import { Navbar } from './components/Navbar';
import { Dashboard } from './components/Dashboard';
import { CurriculumExplorer } from './components/CurriculumExplorer';
import { TopicReader } from './components/TopicReader';
import { QuizSimulator } from './components/QuizSimulator';
import { FlashcardTrainer } from './components/FlashcardTrainer';
import { GamificationPanel } from './components/GamificationPanel';
import { SearchModal } from './components/SearchModal';

const curriculum = curriculumData as CurriculumDatabase;

export const App: React.FC = () => {
  const [progress, setProgress] = useState<UserProgressState>(loadProgress);
  const [currentTab, setCurrentTab] = useState<'dashboard' | 'curriculum' | 'quiz' | 'flashcards' | 'gamification'>('dashboard');
  const [selectedTopic, setSelectedTopic] = useState<TopicItem | null>(null);
  const [selectedEjeFilter, setSelectedEjeFilter] = useState<string>('all');
  const [quizInitialTopic, setQuizInitialTopic] = useState<TopicItem | null>(null);
  const [isSearchOpen, setIsSearchOpen] = useState<boolean>(false);

  // Sync progress state to localStorage whenever it changes
  useEffect(() => {
    saveProgress(progress);
  }, [progress]);

  // Global keyboard shortcut: Cmd+K / Ctrl+K
  useEffect(() => {
    const handleKeyDown = (e: KeyboardEvent) => {
      if ((e.metaKey || e.ctrlKey) && e.key === 'k') {
        e.preventDefault();
        setIsSearchOpen(prev => !prev);
      }
    };
    window.addEventListener('keydown', handleKeyDown);
    return () => window.removeEventListener('keydown', handleKeyDown);
  }, []);

  // Update topic status
  const handleChangeTopicStatus = (topicId: string, newStatus: TopicStudyStatus) => {
    setProgress(prev => {
      const prevStatus = prev.topicStatus[topicId] || 'unstudied';
      let xpDelta = 0;
      if (newStatus === 'mastered' && prevStatus !== 'mastered') {
        xpDelta = 50;
      }

      return {
        ...prev,
        xp: prev.xp + xpDelta,
        topicStatus: {
          ...prev.topicStatus,
          [topicId]: newStatus
        }
      };
    });
  };

  // Toggle bookmark
  const handleToggleBookmark = (topicId: string) => {
    setProgress(prev => ({
      ...prev,
      bookmarks: toggleBookmark(topicId, prev.bookmarks)
    }));
  };

  // Save personal topic note
  const handleSaveNote = (topicId: string, note: string) => {
    setProgress(prev => ({
      ...prev,
      notes: {
        ...prev.notes,
        [topicId]: note
      }
    }));
  };

  // Target university change
  const handleChangeTargetUniversity = (uni: 'UNSA' | 'UNMSM' | 'UNI') => {
    setProgress(prev => ({
      ...prev,
      targetUniversity: uni
    }));
  };

  // Target area change
  const handleChangeTargetArea = (area: 'Ingenierías' | 'Biomédicas' | 'Sociales') => {
    setProgress(prev => ({
      ...prev,
      targetArea: area
    }));
  };

  // Add XP
  const handleAddXp = (amount: number) => {
    setProgress(prev => ({
      ...prev,
      xp: prev.xp + amount
    }));
  };

  // Quiz finish handler
  const handleFinishQuiz = (score: number, total: number, mode: string) => {
    const percent = Math.round((score / total) * 100);
    setProgress(prev => ({
      ...prev,
      xp: prev.xp + 100,
      simulacroHistory: [
        {
          date: new Date().toLocaleDateString(),
          mode,
          score,
          total,
          percent
        },
        ...prev.simulacroHistory
      ]
    }));
  };

  // Navigate to reader for a topic
  const handleSelectTopic = (topic: TopicItem) => {
    setSelectedTopic(topic);
    window.scrollTo({ top: 0, behavior: 'smooth' });
  };

  // Select Eje from Dashboard
  const handleSelectEje = (ejeId: string) => {
    setSelectedEjeFilter(ejeId);
    setSelectedTopic(null);
    setCurrentTab('curriculum');
  };

  // Trigger quiz for topic
  const handleStartQuizForTopic = (topic: TopicItem) => {
    setQuizInitialTopic(topic);
    setSelectedTopic(null);
    setCurrentTab('quiz');
  };

  // Trigger flashcards for topic
  const handleStartFlashcardsForTopic = (topic: TopicItem) => {
    setSelectedTopic(null);
    setCurrentTab('flashcards');
  };

  return (
    <div className="min-h-screen bg-slate-950 text-slate-100 flex flex-col font-['Plus_Jakarta_Sans',sans-serif]">
      {/* Top Navbar */}
      <Navbar
        currentTab={currentTab}
        onSelectTab={(tab) => {
          setSelectedTopic(null);
          setCurrentTab(tab);
        }}
        progress={progress}
        onOpenSearch={() => setIsSearchOpen(true)}
        onChangeTargetUniversity={handleChangeTargetUniversity}
        onChangeTargetArea={handleChangeTargetArea}
      />

      {/* Main Content Area */}
      <main className="flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 pt-6">
        {selectedTopic ? (
          <TopicReader
            topic={selectedTopic}
            allTopics={curriculum.topics}
            progress={progress}
            onBack={() => setSelectedTopic(null)}
            onSelectTopic={handleSelectTopic}
            onToggleBookmark={handleToggleBookmark}
            onChangeTopicStatus={handleChangeTopicStatus}
            onSaveNote={handleSaveNote}
            onStartQuizForTopic={handleStartQuizForTopic}
            onStartFlashcardsForTopic={handleStartFlashcardsForTopic}
          />
        ) : (
          <>
            {currentTab === 'dashboard' && (
              <Dashboard
                curriculum={curriculum}
                progress={progress}
                onSelectTopic={handleSelectTopic}
                onSelectEje={handleSelectEje}
                onStartQuiz={() => setCurrentTab('quiz')}
                onStartFlashcards={() => setCurrentTab('flashcards')}
                onChangeTargetUniversity={handleChangeTargetUniversity}
                onChangeTargetArea={handleChangeTargetArea}
              />
            )}

            {currentTab === 'curriculum' && (
              <CurriculumExplorer
                curriculum={curriculum}
                progress={progress}
                selectedEjeFilter={selectedEjeFilter}
                onSelectTopic={handleSelectTopic}
                onToggleBookmark={handleToggleBookmark}
                onChangeTopicStatus={handleChangeTopicStatus}
              />
            )}

            {currentTab === 'quiz' && (
              <QuizSimulator
                curriculum={curriculum}
                initialTopic={quizInitialTopic}
                onFinishQuiz={handleFinishQuiz}
              />
            )}

            {currentTab === 'flashcards' && (
              <FlashcardTrainer
                curriculum={curriculum}
                onXpEarned={handleAddXp}
              />
            )}

            {currentTab === 'gamification' && (
              <GamificationPanel
                progress={progress}
                curriculum={curriculum}
              />
            )}
          </>
        )}
      </main>

      {/* Global Search Modal */}
      <SearchModal
        isOpen={isSearchOpen}
        onClose={() => setIsSearchOpen(false)}
        topics={curriculum.topics}
        onSelectTopic={handleSelectTopic}
      />
    </div>
  );
};

export default App;
