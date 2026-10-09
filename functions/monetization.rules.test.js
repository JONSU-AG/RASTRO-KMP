"use strict";
const { test, before, after } = require("node:test");
const { readFileSync } = require("node:fs");
const { initializeTestEnvironment, assertSucceeds, assertFails } = require("@firebase/rules-unit-testing");
const { doc, setDoc, getDoc, updateDoc } = require("firebase/firestore");
let env;
before(async()=> { env = await initializeTestEnvironment({projectId:"demo-rastro-pro",firestore:{host:"127.0.0.1",port:8089,rules:readFileSync(require("node:path").join(__dirname,"../firestore.rules"),"utf8")}}); });
after(async()=>{if(env)await env.cleanup();});
test("only verified Admin grants/revokes Pro; owner reads and cannot self grant",async()=>{
 const admin=env.authenticatedContext("admin",{email:"aguilar.jonsu@gmail.com",email_verified:true}).firestore();
 const fake=env.authenticatedContext("fake",{email:"aguilar.jonsu@gmail.com",email_verified:false}).firestore();
 const owner=env.authenticatedContext("student",{email:"s@example.test",email_verified:true}).firestore();
 const other=env.authenticatedContext("other").firestore();
 const path="rastro_pro/student",grant={enabled:true,plan:"Permanente",startsAt:0,endsAt:null,grantId:"grant1"};
 await assertFails(setDoc(doc(owner,path),grant)); await assertFails(setDoc(doc(fake,path),grant));
 await assertSucceeds(setDoc(doc(admin,path),grant)); await assertSucceeds(getDoc(doc(owner,path)));
 await assertFails(getDoc(doc(other,path)));await assertFails(getDoc(doc(env.unauthenticatedContext().firestore(),path)));
 await assertFails(updateDoc(doc(owner,path),{enabled:true}));await assertSucceeds(updateDoc(doc(admin,path),{enabled:false}));
});
test("economy config editable only by verified Admin",async()=>{
 const admin=env.authenticatedContext("admin2",{email:"aguilar.jonsu@gmail.com",email_verified:true}).firestore();
 const owner=env.authenticatedContext("student2").firestore();
 await assertFails(setDoc(doc(owner,"site_settings/global"),{economyJson:"{}"}));
 await assertSucceeds(setDoc(doc(admin,"site_settings/global"),{economyJson:"{}"}));
 await assertSucceeds(getDoc(doc(owner,"site_settings/global")));
});
