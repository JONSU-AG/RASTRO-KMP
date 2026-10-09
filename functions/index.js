"use strict";
const functions = require("firebase-functions/v1");
const admin = require("firebase-admin");
const { cleanupUser } = require("./cleanup");
admin.initializeApp();
exports.verifyRastroProPurchase = require("./play-billing").verifyRastroProPurchase;

// Auth deletion requires recent login. Privileged cleanup happens after its success,
// independently of the app staying open. Throwing retries partial failures.
exports.cleanupDeletedAccount = functions.runWith({
  timeoutSeconds: 540, memory: "512MB", failurePolicy: true
}).auth.user().onDelete(async user => {
  await cleanupUser(admin.firestore(), user.uid, {
    arrayRemove: uid => admin.firestore.FieldValue.arrayRemove(uid),
    fieldPath: segments => new admin.firestore.FieldPath(...segments)
  });
});
