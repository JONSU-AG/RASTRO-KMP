"use strict";
const {test,before,after}=require("node:test");
const {readFileSync}=require("node:fs");
const {initializeTestEnvironment,assertSucceeds,assertFails}=require("@firebase/rules-unit-testing");
const {doc,setDoc,getDoc,updateDoc,runTransaction,serverTimestamp}=require("firebase/firestore");
let env;
before(async()=>{env=await initializeTestEnvironment({projectId:"demo-rastro-coins",firestore:{host:"127.0.0.1",port:8089,rules:readFileSync(require("node:path").join(__dirname,"../firestore.rules"),"utf8")}});});
after(async()=>{await env?.cleanup();});
const account=(id)=>env.authenticatedContext(id,{email:id+"@example.test",email_verified:true,firebase:{sign_in_provider:"password"}}).firestore();
const admin=()=>env.authenticatedContext("admin",{email:"aguilar.jonsu@gmail.com",email_verified:true}).firestore();
async function offer(code,singleUser,enabled=true){await setDoc(doc(admin(),"coin_promos/"+code),{coins:50,singleUser,enabled,redeemedBy:null});}
async function redeem(db,uid,code,amount=50){return runTransaction(db,async tx=>{
 const promo=doc(db,"coin_promos/"+code), receipt=doc(db,`usuarios/${uid}/coin_rewards/promo_${code}`);
 const [p]=await Promise.all([tx.get(promo),tx.get(receipt)]);
 if(p.data().singleUser)tx.update(promo,{redeemedBy:uid});
 tx.set(receipt,{coins:amount,kind:"PROMO",code,createdAt:serverTimestamp(),grantedBy:""});
});}
test("only verified Admin can gift; receipts private and immutable for students",async()=>{
 const path="usuarios/alice/coin_rewards/gift1", gift={coins:100,kind:"GIFT",code:"",createdAt:serverTimestamp(),grantedBy:"admin"};
 await assertFails(setDoc(doc(account("alice"),path),gift));
 await assertSucceeds(setDoc(doc(admin(),path),gift));
 await assertSucceeds(getDoc(doc(account("alice"),path)));
 await assertFails(getDoc(doc(account("bob"),path)));
 await assertFails(updateDoc(doc(account("alice"),path),{coins:999}));
});
test("multi-user code allows one immutable receipt per account",async()=>{
 await offer("MULTI",false);
 await assertSucceeds(redeem(account("m1"),"m1","MULTI"));
 await assertSucceeds(redeem(account("m2"),"m2","MULTI"));
 await assertFails(redeem(account("m1"),"m1","MULTI"));
});
test("single-user code is atomically reserved; second account denied",async()=>{
 await offer("SINGLE",true);
 await assertSucceeds(redeem(account("s1"),"s1","SINGLE"));
 await assertFails(redeem(account("s2"),"s2","SINGLE"));
 await assertFails(updateDoc(doc(account("s2"),"coin_promos/SINGLE"),{redeemedBy:"s2"}));
});
test("forgery, disabled code, anonymous recipient and unpaired reservation denied",async()=>{
 await offer("FORGE",false); await offer("DISABLED",false,false); await offer("UNPAIRED",true);
 await assertFails(redeem(account("f1"),"f1","FORGE",51));
 await assertFails(redeem(account("f1"),"other","FORGE"));
 await assertFails(redeem(account("f1"),"f1","DISABLED"));
 const anonymous=env.authenticatedContext("anon",{firebase:{sign_in_provider:"anonymous"}}).firestore();
 await assertFails(redeem(anonymous,"anon","FORGE"));
 await assertFails(updateDoc(doc(account("f1"),"coin_promos/UNPAIRED"),{redeemedBy:"f1"}));
});
test("two concurrent recipients cannot both consume a single-user code",async()=>{
 await offer("CONCURRENT",true);
 const outcomes=await Promise.allSettled([redeem(account("c1"),"c1","CONCURRENT"),redeem(account("c2"),"c2","CONCURRENT")]);
 require("node:assert/strict").equal(outcomes.filter(r=>r.status==="fulfilled").length,1);
});
test("million coin code can be redeemed once; oversized receipt rejected",async()=>{
 await setDoc(doc(admin(),"coin_promos/MILLION"),{coins:1000000,singleUser:false,enabled:true,redeemedBy:null});
 await assertSucceeds(redeem(account("million"),"million","MILLION",1000000));
 await assertFails(redeem(account("million"),"million","MILLION",1000000));
 await setDoc(doc(admin(),"coin_promos/TOO_BIG"),{coins:1000001,singleUser:false,enabled:true,redeemedBy:null});
 await assertFails(redeem(account("large"),"large","TOO_BIG",1000001));
});
test("daily support notice is account scoped and atomic across two devices",async()=>{
 const claim=async(uid,day)=>{ const db=account(uid); return runTransaction(db,async tx=>{
  const ref=doc(db,`usuarios/${uid}/gamificacion/entry_notices`);
  if((await tx.get(ref)).data()?.lastAdSupportDay===day)return false;
  tx.set(ref,{lastAdSupportDay:day},{merge:true});return true;
 }); };
 const assert=require("node:assert/strict");
 const outcomes=await Promise.all([claim("daily1","2026-10-08"),claim("daily1","2026-10-08")]);
 assert.equal(outcomes.filter(Boolean).length,1);
 assert.equal(await claim("daily1","2026-10-09"),true);
 assert.equal(await claim("daily2","2026-10-08"),true);
 await assertFails(updateDoc(doc(account("daily2"),"usuarios/daily1/gamificacion/entry_notices"),{lastAdSupportDay:"2026-10-10"}));
});
