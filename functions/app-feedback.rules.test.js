"use strict";
const { test, before, after } = require("node:test");
const { readFileSync } = require("node:fs");
const { initializeTestEnvironment, assertSucceeds, assertFails } = require("@firebase/rules-unit-testing");
const { doc, setDoc, getDoc, updateDoc, collection, query, where, orderBy, documentId, limit, getDocs } = require("firebase/firestore");
let env;
before(async () => {
  env = await initializeTestEnvironment({ projectId: "demo-rastro-feedback", firestore: {
    host: "127.0.0.1", port: 8089,
    rules: readFileSync(require("node:path").join(__dirname, "../firestore.rules"), "utf8")
  }});
});
after(async () => { if (env) await env.cleanup(); });
test("feedback is delivered privately; only verified Admin can read and resolve", async () => {
  const sender = env.authenticatedContext("feedback_sender", {email: "sender@example.test", email_verified: true}).firestore();
  const stranger = env.authenticatedContext("feedback_other", {email: "other@example.test", email_verified: true}).firestore();
  const admin = env.authenticatedContext("feedback_admin", {email: "aguilar.jonsu@gmail.com", email_verified: true}).firestore();
  const fakeAdmin = env.authenticatedContext("feedback_fake", {email: "aguilar.jonsu@gmail.com", email_verified: false}).firestore();
  const guest = env.unauthenticatedContext().firestore();
  const path = "reportes/app_feedback_1790000000000_private";
  const data = {targetType: "app_feedback", reporterUid: "feedback_sender", reporterName: "Estudiante",
    kind: "error", message: "El botón no responde", resolved: false};
  await assertSucceeds(setDoc(doc(sender, path), data));
  await assertFails(getDoc(doc(sender, path)));
  await assertFails(getDoc(doc(stranger, path)));
  await assertFails(getDoc(doc(guest, path)));
  await assertFails(getDoc(doc(fakeAdmin, path)));
  await assertSucceeds(getDoc(doc(admin, path)));
  const inbox = db => query(collection(db, "reportes"), where("targetType", "==", "app_feedback"), orderBy(documentId(), "desc"), limit(21));
  await assertFails(getDocs(inbox(stranger)));
  await assertSucceeds(getDocs(inbox(admin)));
  await assertFails(setDoc(doc(stranger, "reportes/app_feedback_fake"), data));
  await assertFails(setDoc(doc(guest, "reportes/app_feedback_guest"), data));
  await assertFails(updateDoc(doc(sender, path), {resolved: true}));
  await assertSucceeds(updateDoc(doc(admin, path), {resolved: true}));
});
