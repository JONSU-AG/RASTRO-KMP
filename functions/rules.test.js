"use strict";
const { test, before, after } = require("node:test");
const { readFileSync } = require("node:fs");
const { initializeTestEnvironment, assertSucceeds, assertFails } = require("@firebase/rules-unit-testing");
const { doc, setDoc, updateDoc, deleteDoc, getDoc } = require("firebase/firestore");
let env;
before(async () => { env = await initializeTestEnvironment({projectId:"demo-rastro-audit",firestore:{host:"127.0.0.1",port:8089,rules:readFileSync(require("node:path").join(__dirname,"../firestore.rules"),"utf8")}}); });
after(async () => { if(env) await env.cleanup(); });
const user = id => env.authenticatedContext(id,{email:`${id}@example.test`,email_verified:true}).firestore();
test("friendship requests can only be answered by the recipient", async () => {
  const alice=user("alice"),bob=user("bob"),eve=user("eve");
  const ref=doc(alice,"racha_dual/alice_bob");
  await assertSucceeds(setDoc(ref,{user1Uid:"alice",user2Uid:"bob",participants:["alice","bob"],status:"pending",streakDays:0}));
  await assertFails(updateDoc(ref,{status:"active"}));
  await assertFails(getDoc(doc(eve,"racha_dual/alice_bob")));
  await assertSucceeds(updateDoc(doc(bob,"racha_dual/alice_bob"),{status:"rejected"}));
  await assertFails(updateDoc(doc(eve,"racha_dual/alice_bob"),{status:"pending"}));
  await assertSucceeds(updateDoc(ref,{status:"pending"}));
  await assertSucceeds(updateDoc(doc(bob,"racha_dual/alice_bob"),{status:"active"}));
});
test("group acceptance and daily activity cannot impersonate another member", async () => {
  const alice=user("alice"),bob=user("bob"),charlie=user("charlie"),eve=user("eve");
  const path="racha_dual/groupTest";
  await assertSucceeds(setDoc(doc(alice,path),{type:"group",user1Uid:"alice",user2Uid:"bob",participants:["alice","bob","charlie"],accepted:{alice:true},dailyActivity:{},status:"pending",streakDays:0}));
  await assertFails(getDoc(doc(eve,path)));
  await assertFails(updateDoc(doc(bob,path),{accepted:{alice:true,bob:true,charlie:true},status:"active"}));
  await assertSucceeds(updateDoc(doc(bob,path),{accepted:{alice:true,bob:true},status:"pending"}));
  await assertFails(updateDoc(doc(charlie,path),{accepted:{alice:true,bob:true,charlie:true},status:"pending"}));
  await assertSucceeds(updateDoc(doc(charlie,path),{accepted:{alice:true,bob:true,charlie:true},status:"active"}));
  await assertSucceeds(updateDoc(doc(bob,path),{"dailyActivity.bob.2026-10-04":true}));
  await assertFails(updateDoc(doc(bob,path),{"dailyActivity.alice.2026-10-04":true}));
  await assertFails(updateDoc(doc(bob,path),{participants:["alice","bob","charlie","eve"]}));
});
test("only verified allowlisted identity can edit editorial data", async () => {
  const admin = env.authenticatedContext("admin",{email:"aguilar.jonsu@gmail.com",email_verified:true}).firestore();
  const unverified = env.authenticatedContext("fake",{email:"aguilar.jonsu@gmail.com",email_verified:false}).firestore();
  await assertSucceeds(setDoc(doc(admin,"cursos/test"),{title:"test"}));
  await assertFails(updateDoc(doc(unverified,"cursos/test"),{title:"fake"}));
  await assertFails(updateDoc(doc(user("alice"),"cursos/test"),{title:"fake"}));
});
test("UGC accepts owner payloads and rejects impersonation or ownership transfer", async () => {
  const alice=user("alice"),bob=user("bob");
  for(const collection of ["libros","flashcards","preguntas_examen","perfil_comentarios","publicacion_comentarios","clase_comentarios"]){
    await assertSucceeds(setDoc(doc(alice,`${collection}/own`),{authorUid:"alice",q:"content"}));
    await assertFails(setDoc(doc(alice,`${collection}/fake`),{authorUid:"bob",q:"content"}));
    await assertSucceeds(updateDoc(doc(alice,`${collection}/own`),{q:"corrected"}));
    await assertFails(updateDoc(doc(alice,`${collection}/own`),{authorUid:"bob"}));
    await assertFails(deleteDoc(doc(bob,`${collection}/own`)));
  }
  await assertSucceeds(setDoc(doc(alice,"uploads/own"),{ownerId:"alice",uploadedBy:{uid:"alice"},description:"post"}));
  await assertFails(setDoc(doc(alice,"uploads/fake"),{ownerId:"bob",uploadedBy:{uid:"bob"}}));
  await assertFails(updateDoc(doc(alice,"uploads/own"),{ownerId:"bob"}));
  await assertFails(updateDoc(doc(bob,"uploads/own"),{reportsCount:3,reportedBy:["bob"],hidden:true,oculto:true}));
  await assertSucceeds(updateDoc(doc(bob,"uploads/own"),{reportsCount:2,reportedBy:["bob"]}));
  await assertSucceeds(updateDoc(doc(bob,"uploads/own"),{reportsCount:3,reportedBy:["bob"],hidden:true,oculto:true}));
  await assertFails(updateDoc(doc(bob,"uploads/own"),{hidden:false,oculto:false}));
  await assertFails(updateDoc(doc(alice,"uploads/own"),{hidden:false,oculto:false}));
});
test("private study history and playlists cannot be read by another account", async () => {
  const alice=user("alice"),bob=user("bob");
  await assertSucceeds(setDoc(doc(alice,"usuarios/alice/gamificacion/error1"),{recordType:"failed_question"}));
  await assertFails(getDoc(doc(bob,"usuarios/alice/gamificacion/error1")));
  await assertSucceeds(setDoc(doc(alice,"rastro_yt_playlists/own"),{ownerUid:"alice",isShared:false,isCurated:false,isHidden:false}));
  await assertFails(getDoc(doc(bob,"rastro_yt_playlists/own")));
  await assertSucceeds(updateDoc(doc(alice,"rastro_yt_playlists/own"),{isShared:true}));
  await assertSucceeds(getDoc(doc(bob,"rastro_yt_playlists/own")));
  await assertFails(updateDoc(doc(alice,"rastro_yt_playlists/own"),{ownerUid:"bob"}));
});
test("ranking records and reports must use the authenticated account", async () => {
  const alice=user("alice");
  await assertSucceeds(setDoc(doc(alice,"ranking_simulacros/own"),{uid:"alice",status:"STARTED"}));
  await assertFails(setDoc(doc(alice,"ranking_simulacros/fake"),{uid:"bob"}));
  await assertFails(updateDoc(doc(alice,"ranking_simulacros/own"),{uid:"bob"}));
  for(const col of ["reportes","reportes_ugc"]){
    await assertSucceeds(setDoc(doc(alice,`${col}/own`),{reporterUid:"alice"}));
    await assertFails(setDoc(doc(alice,`${col}/fake`),{reporterUid:"bob"}));
  }
});

