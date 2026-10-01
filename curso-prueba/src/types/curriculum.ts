export interface SectionHeader {
  id: string;
  title: string;
  lineIndex: number;
}

export interface Flashcard {
  id: string;
  question: string;
  answer: string;
}

export interface Exercise {
  id: string;
  number: number;
  statement: string;
  options: string[];
  answerKey: string;
  resolution: string;
}

export interface MicroMission {
  missionId: string;
  title: string;
  instruction: string;
  xpReward: number;
  badgeUnlocked?: string;
}

export interface GamificationData {
  totalXp: number;
  difficulty: 'Básico' | 'Intermedio' | 'Avanzado' | 'Élite' | string;
  microMissions: MicroMission[];
}

export interface TopicItem {
  id: string;
  filePath: string;
  ejeId: string;
  subjectId: string;
  subjectName: string;
  isObra: boolean;
  fullTitle: string;
  title: string;
  summary: string;
  sections: SectionHeader[];
  ponderacion: string;
  bloomLevel: string;
  wordCount: number;
  readTimeMinutes: number;
  flashcardsCount: number;
  flashcards: Flashcard[];
  exercisesCount: number;
  exercises: Exercise[];
  gamification: GamificationData;
}

export interface EjeItem {
  id: string;
  name: string;
  shortName: string;
  icon: string;
  color: string;
  badge: string;
  description: string;
}

export interface SubjectItem {
  id: string;
  name: string;
  ejeId: string;
  topicsCount: number;
  exercisesCount: number;
  flashcardsCount: number;
}

export interface CurriculumDatabase {
  ejes: EjeItem[];
  subjects: SubjectItem[];
  topics: TopicItem[];
  stats: {
    totalTopics: number;
    totalOfficialTopics: number;
    totalObras: number;
    totalExercises: number;
    totalFlashcards: number;
    totalWords: number;
  };
}

export type TopicStudyStatus = 'unstudied' | 'reviewing' | 'mastered';

export interface UserProgressState {
  topicStatus: Record<string, TopicStudyStatus>;
  notes: Record<string, string>;
  bookmarks: string[];
  xp: number;
  unlockedBadges: string[];
  completedMissions: string[];
  targetUniversity: 'UNSA' | 'UNMSM' | 'UNI';
  targetArea: 'Ingenierías' | 'Biomédicas' | 'Sociales';
  dailyGoalTopics: number;
  simulacroHistory: {
    date: string;
    mode: string;
    score: number;
    total: number;
    percent: number;
  }[];
}
