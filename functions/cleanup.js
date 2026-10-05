"use strict";

// Explicit ownership fields from the Android repositories. No collection-wide erasure.
const ownedQueries = [
  ["uploads", "uploadedBy.uid"], ["uploads", "ownerId"],
  ["libros", "authorUid"], ["flashcards", "authorUid"], ["preguntas_examen", "authorUid"],
  ["perfil_comentarios", "authorUid"], ["perfil_comentarios", "profileUid"],
  ["publicacion_comentarios", "authorUid"], ["clase_comentarios", "authorUid"],
  ["publicacion_comentarios", "profileUid"],
  ["notificaciones", "senderUid"], ["notificaciones", "recipientUid"],
  ["mensajes_directos_privados", "senderUid"], ["mensajes_directos_privados", "recipientUid"],
  ["siguiendo", "followerUid"], ["siguiendo", "followedUid"],
  ["ranking_simulacros", "uid"], ["rastro_yt_playlists", "ownerUid"],
  ["racha_dual", "user1Uid"], ["racha_dual", "user2Uid"],
  ["reportes", "reporterUid"], ["reportes_ugc", "reporterUid"],
  ["reportes_ugc", "authorUid"], ["reportes_ugc", "targetUid"], ["solicitudes_aliados", "uid"]
];
const arrayQueries = [
  ["uploads", "savedBy"], ["uploads", "likedBy"], ["uploads", "reportedBy"],
  ...["uploads", "publicacion_comentarios", "perfil_comentarios", "clase_comentarios"]
    .flatMap(collection => ["👍", "❤️", "🔥"].map(emoji => [collection, `reactions.${emoji}`])),
  ["usuarios", "blockedUsers"], ["usuarios", "friends"], ["usuarios", "followers"], ["usuarios", "following"]
];

async function deleteQuery(db, query, beforeDelete = async () => {}) {
  // Reading the first remaining page makes retry after partial failure idempotent.
  for (;;) {
    const page = await query.limit(100).get();
    if (page.empty) return;
    for (const document of page.docs) {
      await beforeDelete(document);
      await db.recursiveDelete(document.ref);
    }
  }
}

async function cleanupUser(db, uid, fieldValue) {
  if (typeof uid !== "string" || !uid || uid.includes("/")) throw new Error("Invalid uid");
  for (const [collection, field] of ownedQueries) {
    await deleteQuery(db, db.collection(collection).where(field, "==", uid), async document => {
      if (collection === "uploads") {
        await deleteQuery(db, db.collection("publicacion_comentarios").where("postId", "==", document.id));
      }
    });
  }
  for (const [collection, field] of arrayQueries) {
    const fieldPath = fieldValue.fieldPath(field.split("."));
    for (;;) {
      const page = await db.collection(collection).where(fieldPath, "array-contains", uid).limit(200).get();
      if (page.empty) break;
      const batch = db.batch();
      page.docs.forEach(document => batch.update(document.ref, fieldPath, fieldValue.arrayRemove(uid)));
      await batch.commit();
    }
  }
  // Includes progress, error-bank, activity history and future user subcollections.
  await db.recursiveDelete(db.collection("usuarios").doc(uid));
}

module.exports = { cleanupUser, ownedQueries, arrayQueries };
