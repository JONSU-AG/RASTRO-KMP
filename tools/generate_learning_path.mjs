import fs from 'node:fs';
import path from 'node:path';
import { fileURLToPath } from 'node:url';
import { SUBJECT_ROADMAP } from '../copia rastro react/src/data/learningPathData.js';

const root = path.resolve(path.dirname(fileURLToPath(import.meta.url)), '..');
const target = path.join(root, 'shared/src/commonMain/kotlin/com/jonsuapps/rastro/data/LearningPathCatalog.kt');
const kotlin = (value) => JSON.stringify(String(value ?? '')).replaceAll('$', '\\$');
const subjectId = (subject) => ({
  'Biología': 'biologia', 'Física': 'fisica', 'Química': 'quimica', 'Matemática': 'matematica',
  'Filosofía': 'filosofia', 'Historia': 'historia', 'Cívica': 'civica', 'Geografía': 'geografia',
  'Psicología': 'psicologia', 'Lenguaje': 'lenguaje', 'Literatura': 'literatura', 'Raz. Lógico': 'raz_logico',
  'Raz. Matemático': 'raz_matematico', 'Raz. Verbal': 'raz_verbal', 'Inglés': 'ingles'
}[subject] ?? subject.toLowerCase());

const nodes = [];
for (const [subject, planets] of Object.entries(SUBJECT_ROADMAP)) {
  for (const planet of planets) {
    if (planet.subtemas?.length) {
      for (const topic of planet.subtemas) {
        const theory = topic.theory ?? {};
        const sections = Array.isArray(theory.sections) ? theory.sections : [];
        const summary = theory.marcoteorico || sections.map((section) => section.body).filter(Boolean).join('\n\n');
        const formulaData = theory.formula_data ?? {};
        const formula = formulaData.formula_simple;
        const admissionSection = sections.find((section) =>
          (section.heading || '').includes('Claves de Admisión') || (section.heading || '').includes('Examen')
        );
        const admissionLines = (admissionSection?.body || '').split('\n').filter((line) =>
          line.trim().startsWith('•') || line.trim().length > 10
        );
        const concepts = sections.map((section) => section.heading).filter(Boolean);
        const challenges = (topic.challenges ?? []).map((question) => {
          if (question.type === 'multiple_choice') return question;
          if (question.type === 'cloze') {
            return {
              ...question,
              id: question.id,
              statement: `${question.sentenceParts?.before ?? question.sentence ?? question.statement ?? ''} ___ ${question.sentenceParts?.after ?? ''}`
            };
          }
          return question;
        });
        nodes.push({
          id: topic.id,
          subjectId: subjectId(subject),
          subject,
          week: planet.semana ?? 1,
          code: topic.subCode ?? '',
          title: topic.title ?? topic.shortTitle ?? planet.title,
          shortTitle: topic.shortTitle ?? topic.title ?? planet.title,
          summary,
          concepts,
          formula,
          formulaName: formulaData.teorema_nombre ?? '',
          formulaLatex: formulaData.formula_latex ?? '',
          formulaDescription: formulaData.descripcion ?? '',
          admissionTip: admissionLines[0]?.replace(/^•\s*/, '').trim() ?? '',
          admissionExplanation: admissionLines.slice(1).join('\n').replace(/•\s*/g, '• '),
          challenges
        });
      }
    } else {
      nodes.push({
        id: planet.id,
        subjectId: subjectId(subject),
        subject,
        week: planet.semana ?? 1,
        code: '',
        title: planet.title,
        shortTitle: planet.shortName ?? planet.title,
        summary: '',
        concepts: [],
        challenges: []
      });
    }
  }
}

const challengeType = (type) => type === 'cloze' ? 'FILL_BLANK' : type === 'match_pairs' ? 'MATCH_PAIRS' : 'MULTIPLE_CHOICE';
const challengePairs = (pairs = []) => `listOf(${pairs.map((pair, index) => `ChallengePair(
                id = ${kotlin(pair.id ?? index)},
                left = ${kotlin(pair.left)},
                right = ${kotlin(pair.right)}
            )`).join(', ')})`;
const matchOptions = (question) => {
  const options = question.shuffledRight ?? (question.pairs ?? []).map((pair, index) => ({ id: pair.id ?? index, text: pair.right }));
  return `listOf(${options.map((option, index) => `ChallengeMatchOption(
                id = ${kotlin(option.id ?? index)},
                text = ${kotlin(option.text)}
            )`).join(', ')})`;
};
const challenge = (q, node) => `Challenge(
            id = ${kotlin(q.id)},
            type = ChallengeType.${challengeType(q.type)},
            statement = ${kotlin(q.statement)},
            options = listOf(${(q.options ?? []).map(kotlin).join(', ')}),
            correctIndex = ${(q.correctIndex ?? 0)},
            explanation = ${kotlin(q.explanation)},
            subject = ${kotlin(node.subject)},
            semana = ${node.week},
            correctText = ${q.targetWord == null ? 'null' : kotlin(q.targetWord)},
            sentenceBefore = ${q.sentenceParts?.before == null ? 'null' : kotlin(q.sentenceParts.before)},
            sentenceAfter = ${q.sentenceParts?.after == null ? 'null' : kotlin(q.sentenceParts.after)},
            chips = listOf(${(q.chips ?? []).map(kotlin).join(', ')}),
            pairs = ${challengePairs(q.pairs)},
            rightOptions = ${matchOptions(q)},
            instruction = ${q.instruction == null ? 'null' : kotlin(q.instruction)},
            pedagogicalTier = ${q.pedagogicalTier == null ? 'null' : kotlin(q.pedagogicalTier)},
            fuente = ${q.fuente == null ? 'null' : kotlin(q.fuente)}
        )`;

const entries = nodes.map((node) => `        LessonNode(
            id = ${kotlin(node.id)},
            subjectId = ${kotlin(node.subjectId)},
            semana = ${node.week},
            subtema = ${kotlin([node.code, node.shortTitle].filter(Boolean).join(' '))},
            title = ${kotlin(node.code ? `${node.code} ${node.shortTitle}` : node.shortTitle)},
            theory = LessonTheory(
                id = ${kotlin(`theory_${node.id}`)},
                asignatura = ${kotlin(node.subject)},
                semana = ${node.week},
                titulo = ${kotlin(node.title)},
                resumen = ${kotlin(node.summary)},
                conceptosClave = listOf(${node.concepts.map(kotlin).join(', ')}),
                formulas = listOf(${node.formula ? kotlin(node.formula) : ''}),
                formulaName = ${node.formulaName ? kotlin(node.formulaName) : 'null'},
                formulaLatex = ${node.formulaLatex ? kotlin(node.formulaLatex) : 'null'},
                formulaDescription = ${node.formulaDescription ? kotlin(node.formulaDescription) : 'null'},
                admissionTip = ${node.admissionTip ? kotlin(node.admissionTip) : 'null'},
                admissionExplanation = ${node.admissionExplanation ? kotlin(node.admissionExplanation) : 'null'}
            ),
            challenges = listOf(${node.challenges.map((q) => challenge(q, node)).join(',\n                ')}),
            isLocked = ${node.challenges.length === 0},
            isCompleted = false,
            stars = 0
        )`);

const chunkSize = 2;
const chunks = Array.from({ length: Math.ceil(entries.length / chunkSize) }, (_, index) => entries.slice(index * chunkSize, (index + 1) * chunkSize));
const chunkProperties = chunks.map((chunk, index) => `    private val chunk${index}: List<LessonNode> get() = listOf(\n${chunk.join(',\n')}\n    )`).join('\n\n');
const lessonChunks = chunks.map((_, index) => `        addAll(chunk${index})`).join('\n');

const output = `// Generated from copia rastro react/src/data/learningPathData.js by tools/generate_learning_path.mjs.
// Keep the React reference untouched; regenerate this Kotlin catalog when its roadmap changes.
package com.jonsuapps.rastro.data

import com.jonsuapps.rastro.model.Challenge
import com.jonsuapps.rastro.model.ChallengeMatchOption
import com.jonsuapps.rastro.model.ChallengePair
import com.jonsuapps.rastro.model.ChallengeType
import com.jonsuapps.rastro.model.LessonNode
import com.jonsuapps.rastro.model.LessonTheory

internal object LearningPathCatalog {
${chunkProperties}

    val lessons: List<LessonNode> = buildList {
${lessonChunks}
    }

    fun forSubject(subjectId: String): List<LessonNode> = lessons.filter { it.subjectId.equals(subjectId, ignoreCase = true) }
    fun byId(lessonId: String): LessonNode? = lessons.firstOrNull { it.id == lessonId }
}
`;

fs.mkdirSync(path.dirname(target), { recursive: true });
fs.writeFileSync(target, output, 'utf8');
console.log(`Generated ${nodes.length} roadmap nodes at ${path.relative(root, target)}`);
