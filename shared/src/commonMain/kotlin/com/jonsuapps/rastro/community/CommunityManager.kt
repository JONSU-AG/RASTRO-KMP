package com.jonsuapps.rastro.community

import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow

object CommunityManager {

    private val initialPosts = listOf(
        MuroPost(
            id = "post_1",
            authorUid = "jonsu_official",
            authorName = "TU BUEN AMIGO JONSU",
            timeAgo = "Hace 2 horas",
            tag = "Tomos CEPREUNSA",
            title = "Banco Oficial CEPREUNSA II Fase",
            content = "¡Comunidad RASTRO! Ya están listos los resúmenes clave de Biología celular y Anatomía para el área de Biomédicas. Descárguenlos y repasen las preguntas fijas.",
            fileUrl = "https://drive.google.com/drive/folders/cepreunsa_biomedicas",
            reactions = mapOf(
                "❤️" to listOf("u1", "u2", "u3", "u4", "u5", "u6", "u7"),
                "🔥" to listOf("u8", "u9", "u10", "u11"),
                "👍" to listOf("u12", "u13", "u14", "local_student_1")
            ),
            comments = listOf(
                PostComment(
                    id = "c1_1",
                    postId = "post_1",
                    authorUid = "mari_unsa",
                    authorName = "Mariana Salas",
                    text = "¡Excelente material Jonsu! Justo lo que necesitaba para el repaso de Ciclo de Krebs.",
                    timeAgo = "Hace 1 hora",
                    reactions = mapOf("👍" to listOf("jonsu_official", "u1"))
                ),
                PostComment(
                    id = "c1_2",
                    postId = "post_1",
                    authorUid = "carlos_med",
                    authorName = "Carlos Mendoza",
                    text = "¿Vienen los temas de ecología también?",
                    timeAgo = "Hace 45 min",
                    reactions = mapOf("👍" to listOf("local_student_1"))
                )
            ),
            destacado = true,
            fijado = true
        ),
        MuroPost(
            id = "post_2",
            authorUid = "maria_v",
            authorName = "María José V.",
            timeAgo = "Ayer a las 18:30",
            tag = "Trucos Matemáticos",
            title = "Regla mnemotécnica trigonometría",
            content = "Comparto la regla mnemotécnica para identidades trigonométricas fundamentales. ¡Me sirvió muchísimo en el simulacro de 80 preguntas!",
            fileUrl = "https://drive.google.com/file/trigo_mnemo.pdf",
            reactions = mapOf(
                "❤️" to listOf("u1", "u2", "u3", "u4", "u5"),
                "🔥" to listOf("u6", "u7", "u8", "u9", "u10", "local_student_1"),
                "👍" to listOf("u11", "u12", "u13")
            ),
            comments = listOf(
                PostComment(
                    id = "c2_1",
                    postId = "post_2",
                    authorUid = "pedro_ing",
                    authorName = "Pedro Quispe",
                    text = "Muchísimas gracias, ahorra un montón de tiempo en el examen de Ingenierías.",
                    timeAgo = "Ayer",
                    reactions = mapOf("👍" to listOf("maria_v"))
                )
            ),
            destacado = false,
            fijado = false
        ),
        MuroPost(
            id = "post_3",
            authorUid = "lucia_letras",
            authorName = "Lucía Cornejo",
            timeAgo = "Hace 3 días",
            tag = "Literatura UNSA",
            title = "Análisis de Los Ríos Profundos (Arguedas)",
            content = "Cuadro comparativo entre Ernesto, el Viejo y el colegio de Abancay. Muy preguntado en la matriz de evaluación del área de Sociales.",
            fileUrl = "https://drive.google.com/file/rios_profundos_resumen.pdf",
            reactions = mapOf(
                "👍" to listOf("u1", "u2", "u3", "u4", "u5", "u6", "local_student_1"),
                "❤️" to listOf("u7", "u8", "u9")
            ),
            comments = emptyList(),
            destacado = true,
            fijado = false
        )
    )

    private val _posts = MutableStateFlow<List<MuroPost>>(initialPosts)
    val posts: StateFlow<List<MuroPost>> = _posts.asStateFlow()

    fun createPost(
        title: String,
        tag: String,
        content: String,
        fileUrl: String?,
        authorUid: String,
        authorName: String
    ): MuroPost {
        val newPost = MuroPost(
            id = "post_${System.currentTimeMillis()}",
            authorUid = authorUid,
            authorName = authorName,
            timeAgo = "Hace un momento",
            tag = tag.ifBlank { "Aporte General" },
            title = title.ifBlank { "Aporte Académico" },
            content = content,
            fileUrl = fileUrl?.takeIf { it.isNotBlank() },
            reactions = mapOf("❤️" to listOf(authorUid)),
            comments = emptyList()
        )
        _posts.value = listOf(newPost) + _posts.value
        return newPost
    }

    fun togglePostReaction(postId: String, emoji: String, userUid: String) {
        _posts.value = _posts.value.map { post ->
            if (post.id == postId) {
                val currentReactions = post.reactions.toMutableMap()
                val userList = (currentReactions[emoji] ?: emptyList()).toMutableList()
                if (userList.contains(userUid)) {
                    userList.remove(userUid)
                    if (userList.isEmpty()) {
                        currentReactions.remove(emoji)
                    } else {
                        currentReactions[emoji] = userList
                    }
                } else {
                    userList.add(userUid)
                    currentReactions[emoji] = userList
                }
                post.copy(reactions = currentReactions)
            } else {
                post
            }
        }
    }

    fun addComment(
        postId: String,
        text: String,
        userUid: String,
        userName: String
    ): PostComment {
        val newComment = PostComment(
            id = "comm_${System.currentTimeMillis()}",
            postId = postId,
            authorUid = userUid,
            authorName = userName,
            text = text.trim(),
            timeAgo = "Hace un momento",
            reactions = emptyMap()
        )

        _posts.value = _posts.value.map { post ->
            if (post.id == postId) {
                post.copy(comments = post.comments + newComment)
            } else {
                post
            }
        }
        return newComment
    }

    fun toggleCommentReaction(
        postId: String,
        commentId: String,
        emoji: String,
        userUid: String
    ) {
        _posts.value = _posts.value.map { post ->
            if (post.id == postId) {
                val updatedComments = post.comments.map { comment ->
                    if (comment.id == commentId) {
                        val currentReactions = comment.reactions.toMutableMap()
                        val userList = (currentReactions[emoji] ?: emptyList()).toMutableList()
                        if (userList.contains(userUid)) {
                            userList.remove(userUid)
                            if (userList.isEmpty()) {
                                currentReactions.remove(emoji)
                            } else {
                                currentReactions[emoji] = userList
                            }
                        } else {
                            userList.add(userUid)
                            currentReactions[emoji] = userList
                        }
                        comment.copy(reactions = currentReactions)
                    } else {
                        comment
                    }
                }
                post.copy(comments = updatedComments)
            } else {
                post
            }
        }
    }

    fun deletePost(postId: String, userUid: String) {
        _posts.value = _posts.value.filterNot { it.id == postId && it.authorUid == userUid }
    }

    fun deleteComment(postId: String, commentId: String, userUid: String) {
        _posts.value = _posts.value.map { post ->
            if (post.id == postId) {
                post.copy(comments = post.comments.filterNot { it.id == commentId && it.authorUid == userUid })
            } else {
                post
            }
        }
    }

    fun getUserUploadsCount(userUid: String): Int {
        return _posts.value.count { it.authorUid == userUid }
    }

    fun getUserReputation(userUid: String): Int {
        return _posts.value
            .filter { it.authorUid == userUid }
            .sumOf { it.totalReactionsCount }
    }
}
