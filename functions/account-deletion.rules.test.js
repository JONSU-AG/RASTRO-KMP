"use strict";
const {test,before,after}=require('node:test');
const {readFileSync}=require('node:fs');
const {initializeTestEnvironment,assertSucceeds,assertFails}=require('@firebase/rules-unit-testing');
const {doc,setDoc,getDoc,deleteDoc,updateDoc,serverTimestamp,collection,query,where,getDocs}=require('firebase/firestore');
let env;
before(async()=>{env=await initializeTestEnvironment({projectId:'demo-rastro-deletion',firestore:{host:'127.0.0.1',port:8089,rules:readFileSync(require('node:path').join(__dirname,'../firestore.rules'),'utf8')}});});
after(async()=>{if(env) await env.cleanup();});
const user=(id,authTime=Math.floor(Date.now()/1000))=>env.authenticatedContext(id,{email:`${id}@test.invalid`,email_verified:true,auth_time:authTime}).firestore();
test('recent owner can start deletion; stale or another identity cannot',async()=>{
 const a=user('a');
 await assertFails(setDoc(doc(user('stale',1),'account_deletions/stale'),{requestedAt:serverTimestamp()}));
 await assertFails(setDoc(doc(a,'account_deletions/b'),{requestedAt:serverTimestamp()}));
 await assertFails(setDoc(doc(a,'account_deletions/a'),{requestedAt:serverTimestamp(),email:'secret'}));
 await assertSucceeds(setDoc(doc(a,'account_deletions/a'),{requestedAt:serverTimestamp()}));
 await assertFails(deleteDoc(doc(a,'account_deletions/a')));
});
test('cleanup deletes own data without granting another account access',async()=>{
 const a=user('owner'),b=user('other');
 await env.withSecurityRulesDisabled(async c=>{
  const db=c.firestore();
  for(const [p,data] of Object.entries({
   'usuarios/owner':{email:'old',photoURL:'photo'},'usuarios/owner/coin_rewards/gift':{coins:20},
   'reportes/a':{reporterUid:'owner'},'reportes/b':{reporterUid:'other'},
   'uploads/a':{ownerId:'owner',uploadedBy:{uid:'owner'}},'publicacion_comentarios/a':{postId:'a',authorUid:'other'},
   'racha_dual/g':{participants:['owner','other','third'],user1Uid:'other',user2Uid:'third'},
   'rastro_pro/owner':{enabled:true},'rastro_pro/other':{enabled:true}
  })) await setDoc(doc(db,p),data);
 });
 await assertSucceeds(setDoc(doc(a,'account_deletions/owner'),{requestedAt:serverTimestamp()}));
 await assertFails(deleteDoc(doc(b,'usuarios/owner/coin_rewards/gift')));
 await assertSucceeds(getDocs(query(collection(a,'reportes'),where('reporterUid','==','owner'))));
 await assertSucceeds(deleteDoc(doc(a,'reportes/a')));
 await assertFails(getDoc(doc(a,'reportes/b')));
 await assertFails(deleteDoc(doc(a,'rastro_pro/other')));
 await assertSucceeds(deleteDoc(doc(a,'rastro_pro/owner')));
 await assertSucceeds(deleteDoc(doc(a,'publicacion_comentarios/a')));
 await assertSucceeds(deleteDoc(doc(a,'uploads/a')));
 await assertSucceeds(deleteDoc(doc(a,'racha_dual/g')));
 await assertSucceeds(deleteDoc(doc(a,'usuarios/owner/coin_rewards/gift')));
 await assertSucceeds(deleteDoc(doc(a,'usuarios/owner')));
 await assertFails(setDoc(doc(a,'usuarios/owner'),{email:'resurrected'}));
 await assertFails(setDoc(doc(a,'usuarios/owner/gamificacion/progress'),{xp:99}));
});
test('cleanup may remove only its own membership, not another users data',async()=>{
 const a=user('member');
 await env.withSecurityRulesDisabled(async c=>{await setDoc(doc(c.firestore(),'usuarios/target'),{friends:['member','other'],displayName:'Keep'});});
 await assertSucceeds(setDoc(doc(a,'account_deletions/member'),{requestedAt:serverTimestamp()}));
 await assertFails(updateDoc(doc(a,'usuarios/target'),{friends:[],displayName:'Changed'}));
 await assertFails(updateDoc(doc(a,'usuarios/target'),{friends:[]}));
 await assertSucceeds(updateDoc(doc(a,'usuarios/target'),{friends:['other']}));
});
test('group departure preserves other members progress',async()=>{
 const a=user('departing');
 await env.withSecurityRulesDisabled(async c=>{await setDoc(doc(c.firestore(),'racha_dual/retained'),{type:'group',participants:['departing','b','c'],user1Uid:'departing',user2Uid:'b',accepted:{departing:true,b:true,c:true},dailyActivity:{departing:{day:true},b:{day:true}},streakDays:10});});
 await assertSucceeds(setDoc(doc(a,'account_deletions/departing'),{requestedAt:serverTimestamp()}));
 const change={participants:['b','c'],user1Uid:'b',user2Uid:'c',accepted:{b:true,c:true},dailyActivity:{b:{day:true}},senderName:'',recipientName:''};
 await assertFails(deleteDoc(doc(a,'racha_dual/retained')));
 await assertFails(updateDoc(doc(a,'racha_dual/retained'),{...change,streakDays:0}));
 await assertSucceeds(updateDoc(doc(a,'racha_dual/retained'),change));
});
