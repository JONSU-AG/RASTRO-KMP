import { UserProgressState, TopicStudyStatus } from '../types/curriculum';

const STORAGE_KEY = 'academia_elite_preu_v1';

const defaultState: UserProgressState = {
  topicStatus: {},
  notes: {},
  bookmarks: [],
  xp: 150, // Starting bonus for joining the academy
  unlockedBadges: ['Cachimbo Promesa'],
  completedMissions: [],
  targetUniversity: 'UNSA',
  targetArea: 'Ingenierías',
  dailyGoalTopics: 3,
  simulacroHistory: []
};

export function loadProgress(): UserProgressState {
  try {
    const raw = localStorage.getItem(STORAGE_KEY);
    if (!raw) return defaultState;
    const parsed = JSON.parse(raw);
    return { ...defaultState, ...parsed };
  } catch (e) {
    console.error('Error loading progress from localStorage:', e);
    return defaultState;
  }
}

export function saveProgress(state: UserProgressState): void {
  try {
    localStorage.setItem(STORAGE_KEY, JSON.stringify(state));
  } catch (e) {
    console.error('Error saving progress to localStorage:', e);
  }
}

export function toggleBookmark(topicId: string, currentBookmarks: string[]): string[] {
  if (currentBookmarks.includes(topicId)) {
    return currentBookmarks.filter(id => id !== topicId);
  } else {
    return [...currentBookmarks, topicId];
  }
}

export function calculateMasteryPercent(
  topicStatus: Record<string, TopicStudyStatus>,
  topics: { id: string }[]
): { mastered: number; reviewing: number; unstudied: number; percentMastered: number } {
  if (!topics.length) return { mastered: 0, reviewing: 0, unstudied: 0, percentMastered: 0 };
  let mastered = 0;
  let reviewing = 0;
  let unstudied = 0;

  for (const t of topics) {
    const s = topicStatus[t.id] || 'unstudied';
    if (s === 'mastered') mastered++;
    else if (s === 'reviewing') reviewing++;
    else unstudied++;
  }

  const percentMastered = Math.round((mastered / topics.length) * 100);
  return { mastered, reviewing, unstudied, percentMastered };
}
