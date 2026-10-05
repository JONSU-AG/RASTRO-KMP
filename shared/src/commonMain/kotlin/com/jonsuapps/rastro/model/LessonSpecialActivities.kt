package com.jonsuapps.rastro.model

/** Deterministic practice derived only from the same lesson's existing correct answers.
 * Does not rewrite catalog files, create a second engine, or change original question IDs. */
object LessonSpecialActivities {
    private val subjects = setOf("biologia", "psicologia", "lenguaje", "literatura", "ingles", "civica",
        "geografia", "filosofia", "historia_peru", "historia_universal", "comprension_lectora", "raz_verbal", "quimica", "fisica")
    private val calculation = Regex("(?is)(?=.*(?:calcul[ae]|determina|hall[ae]|resuelve|cu[aá]nto|cu[aá]nta|valor de|resulta|magnitud))(?=.*(?:\\d|[=×÷]|m/s|joule|newton|mol/L)).*")
    private fun eligible(question: Challenge): Boolean {
        if (question.type != ChallengeType.MULTIPLE_CHOICE || !question.formula.isNullOrBlank() || calculation.containsMatchIn(question.statement)) return false
        val answer = question.options.getOrNull(question.correctIndex)?.trim() ?: return false
        return answer.length in 2..140 && question.options.size >= 2 &&
            question.options.all { it.isNotBlank() } && question.options.map { it.trim().lowercase() }.distinct().size == question.options.size &&
            !answer.contains(Regex("(?i)(todas|ninguna|solo|solamente) (las|los|anteriores|i\\b)")) &&
            !question.statement.contains(Regex("(?i)(incorrect[ao]|excepto|no corresponde|no es|son falsas|es falsa|falsedad)"))
    }

    fun prepare(lesson: LessonNode): LessonNode {
        if (lesson.subjectId !in subjects || lesson.challenges.isEmpty()) return lesson
        if (lesson.challenges.any { it.id.endsWith("_practice_fill") || it.id.startsWith("${lesson.id}_practice_match_") }) return lesson
        // Physics/chemistry levels requiring calculation retain their original exercises.
        if (lesson.subjectId in setOf("fisica", "quimica") && lesson.challenges.any {
                !it.formula.isNullOrBlank() || calculation.containsMatchIn(it.statement)
            }) return lesson
        val special = lesson.challenges.filter { it.type != ChallengeType.MULTIPLE_CHOICE }.toMutableList()
        val source = lesson.challenges.filter(::eligible).filter { q ->
            !com.jonsuapps.rastro.utils.AcademicSanitizer.hasUnrelatedStemContamination(
                lesson.theory.asignatura, q.statement + q.explanation + q.options.joinToString())
        }
        val fillsNeeded = (2 - special.count { it.type == ChallengeType.FILL_BLANK }).coerceAtLeast(0)
        val matchesNeeded = (2 - special.count { it.type == ChallengeType.MATCH_PAIRS }).coerceAtLeast(0)
        val generated = mutableListOf<Challenge>()
        val preferred = source.sortedByDescending { q -> q.explanation.contains(q.options[q.correctIndex], ignoreCase = true) }
        preferred.take(fillsNeeded).forEach { q -> generated += fill(q) }
        val pairs = source.filter { it.statement.length <= 240 && it.options[it.correctIndex].length <= 85 }
            .distinctBy { it.options[it.correctIndex].trim().lowercase() }.distinctBy { it.statement.trim().lowercase() }
        if (pairs.size >= 4) repeat(matchesNeeded) { index ->
            // Reuse only verified relations from this lesson; rotate when there are fewer than eight.
            val count = minOf(6, if (pairs.size >= 8) pairs.size / 2 else 4)
            if (index > 0 && pairs.size <= count) return@repeat
            val offset = minOf(index * count, pairs.size - count)
            val group = (pairs.drop(offset) + pairs.take(offset)).take(count)
            if (group.size >= 4) generated += matching(lesson, group, index)
        }
        // When pair relations are not suitable, use existing theory/answers for extra completion.
        preferred.drop(fillsNeeded).take((4 - special.size - generated.size).coerceAtLeast(0)).forEach { generated += fill(it) }
        // Explicit local term:definition notes are also valid sources when MC answers are too long.
        val notes = (lesson.theory.conceptosClave + lesson.theory.fechasYPersonajes + lesson.theory.hechosRelevantes + lesson.theory.clavesFijas +
            lesson.theory.resumen.lines().filter { it.trim().startsWith("• ") || it.trim().startsWith("- ") })
            .mapNotNull { raw ->
                val split = raw.indexOf(": ")
                if (split < 0) null else {
                    val left = raw.substring(0, split).trim().removePrefix("• ").removePrefix("- ").replace("**", "")
                    val right = raw.substring(split + 2).trim()
                    if (left.length in 2..85 && right.length in 3..400 &&
                        !com.jonsuapps.rastro.utils.AcademicSanitizer.hasUnrelatedStemContamination(lesson.theory.asignatura, raw)) left to right else null
                }
            }.distinctBy { it.first.lowercase() }.distinctBy { it.second.lowercase() }
        // Enrich authored relations only with associations already present in this same lesson.
        val localRelations = notes.mapIndexed { i, (left, right) -> ChallengePair("local_note_$i", left, right) } +
            pairs.map { ChallengePair("local_${it.id}", it.statement, it.options[it.correctIndex].trim()) }
        special.indices.forEach { index ->
            val exercise = special[index]
            if (exercise.type == ChallengeType.MATCH_PAIRS) {
                val expanded = exercise.pairs.take(6).toMutableList()
                if (expanded.size < 4) localRelations.forEach { relation ->
                    if (expanded.size < 6 && expanded.none { it.left.equals(relation.left, true) || it.right.equals(relation.right, true) || it.id == relation.id }) expanded += relation
                }
                if (expanded.size in 4..6 && expanded != exercise.pairs) special[index] = exercise.copy(pairs = expanded,
                    rightOptions = expanded.reversed().map { ChallengeMatchOption(it.id, it.right) })
            }
        }
        if (notes.size >= 2) {
            val missingMatches = (2 - (special + generated).count { it.type == ChallengeType.MATCH_PAIRS }).coerceAtLeast(0)
            notes.filter { it.second.length <= 200 }.chunked(6).filter { it.size >= 4 }
                .take(minOf(missingMatches, (4 - special.size - generated.size).coerceAtLeast(0))).forEachIndexed { index, group ->
                    val relations = group.mapIndexed { i, (term, definition) -> ChallengePair("note_$i", term, definition) }
                    generated += Challenge(id = "${lesson.id}_practice_match_${index + 10}", type = ChallengeType.MATCH_PAIRS,
                        statement = "Relaciona los conceptos de la lección con sus descripciones.", subject = lesson.subjectId, semana = lesson.semana,
                        pairs = relations, rightOptions = relations.reversed().map { ChallengeMatchOption(it.id, it.right) },
                        explanation = group.joinToString("\n") { "${it.first}: ${it.second}" }, pedagogicalTier = "relacion", fuente = "Teoría de ${lesson.id}")
                }
            val available = (4 - special.size - generated.size).coerceAtLeast(0)
            notes.take(available).forEachIndexed { index, (term, definition) ->
                generated += Challenge(id = "${lesson.id}_theory_${index}_practice_fill", type = ChallengeType.FILL_BLANK,
                    statement = "Completa el concepto de la lección.", subject = lesson.subjectId, semana = lesson.semana,
                    textTemplate = "{{answer}}: $definition", explanation = "$term: $definition",
                    blanks = listOf(ChallengeBlank("answer", notes.take(4).map { it.first }.let { if (term in it) it else it.dropLast(1) + term }, term)),
                    pedagogicalTier = "completar", fuente = "Teoría de ${lesson.id}")
            }
        }
        val highlighted = lesson.theory.resumen.lines().filter { line ->
            line.trim().firstOrNull() != '#' && !line.trim().startsWith("|") && line.length <= 1000 &&
                !com.jonsuapps.rastro.utils.AcademicSanitizer.hasUnrelatedStemContamination(lesson.theory.asignatura, line)
        }.flatMap { line ->
            Regex("\\*\\*([^*]+)\\*\\*").findAll(line).mapNotNull { match ->
                val term = match.groupValues[1].trim()
                if (term.length in 2..65 && line.replace("**", "").length > term.length + 20) Triple(term, line, match.range) else null
            }.toList()
        }.distinctBy { it.first.lowercase() }
        if (highlighted.size >= 2) {
            highlighted.take((4 - special.size - generated.size).coerceAtLeast(0)).forEachIndexed { index, (term, line, range) ->
                val options = highlighted.take(4).map { it.first }.let { if (term in it) it else it.dropLast(1) + term }
                generated += Challenge(id = "${lesson.id}_theory_mark_${index}_practice_fill", type = ChallengeType.FILL_BLANK,
                    statement = "Completa el texto de la lección.", subject = lesson.subjectId, semana = lesson.semana,
                    textTemplate = line.replaceRange(range, "{{answer}}").replace("**", ""),
                    explanation = line.replace("**", ""), blanks = listOf(ChallengeBlank("answer", options, term)),
                    pedagogicalTier = "completar", fuente = "Teoría de ${lesson.id}")
            }
        }
        special += generated
        if (special.isEmpty()) return lesson
        val base = lesson.challenges.filter { it.type == ChallengeType.MULTIPLE_CHOICE }
        // Even spacing, stable across recompositions/retries; existing specials also leave the tail.
        val result = mutableListOf<Challenge>()
        var nextSpecial = 0
        base.forEachIndexed { index, q ->
            result += q
            while (nextSpecial < special.size && index + 1 >= (nextSpecial + 1) * base.size / (special.size + 1)) {
                result += special[nextSpecial++]
            }
        }
        result += special.drop(nextSpecial)
        return lesson.copy(challenges = result)
    }

    private fun fill(q: Challenge): Challenge {
        val answer = q.options[q.correctIndex].trim()
        val occurrence = Regex("(?<![\\p{L}\\p{N}])${Regex.escape(answer)}(?![\\p{L}\\p{N}])", RegexOption.IGNORE_CASE).find(q.explanation)
        val template = if (occurrence != null) q.explanation.replaceRange(occurrence.range, "{{answer}}")
            else "${q.statement}\n{{answer}}"
        return q.copy(id = "${q.id}_practice_fill", type = ChallengeType.FILL_BLANK,
            statement = "Completa el texto con la opción correcta.", options = emptyList(), correctIndex = 0,
            textTemplate = template, blanks = listOf(ChallengeBlank("answer", q.options.map { it.trim() }, answer)),
            instruction = "Selecciona la opción que completa el texto.", pedagogicalTier = "completar")
    }
    private fun matching(lesson: LessonNode, questions: List<Challenge>, index: Int): Challenge {
        val pairs = questions.map { ChallengePair(it.id, it.statement, it.options[it.correctIndex].trim()) }
        return Challenge(id = "${lesson.id}_practice_match_$index", type = ChallengeType.MATCH_PAIRS,
            statement = "Relaciona cada enunciado con su respuesta.", subject = lesson.subjectId, semana = lesson.semana,
            pairs = pairs, rightOptions = pairs.reversed().map { ChallengeMatchOption(it.id, it.right) },
            explanation = questions.joinToString("\n\n") { it.explanation }, pedagogicalTier = "relacion",
            fuente = questions.mapNotNull { it.fuente }.distinct().joinToString("; ").ifBlank { null })
    }
}
