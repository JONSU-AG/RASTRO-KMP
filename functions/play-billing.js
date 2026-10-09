"use strict";
const crypto = require("node:crypto");
const { GoogleAuth } = require("google-auth-library");
const { onCall, HttpsError } = require("firebase-functions/v2/https");
const admin = require("firebase-admin");
// PENDING real console IDs. Do not enable until Publisher access and lifecycle sync are configured.
const catalog = [
  { plan: "Mensual", productId: null, basePlanId: null, subscription: true },
  { plan: "6 meses", productId: null, basePlanId: null, subscription: true },
  { plan: "Anual", productId: null, basePlanId: null, subscription: true },
  { plan: "Permanente", productId: null, subscription: false }
];
const packageName = "com.jonsuapps.rastro";
const hash = value => crypto.createHash("sha256").update(value, "utf8").digest("hex");

function verifiedGrant(payload, subscription, uid, products, now = Date.now()) {
  const account = subscription ? payload.externalAccountIdentifiers?.obfuscatedExternalAccountId : payload.obfuscatedExternalAccountId;
  if (account !== hash(uid)) throw new Error("account-mismatch");
  const lines = subscription ? payload.lineItems : payload.productLineItem;
  const matches = (lines || []).flatMap(line => products.filter(product => product.productId &&
    product.subscription === subscription && product.productId === line.productId &&
    (!subscription || product.basePlanId === line.offerDetails?.basePlanId)).map(product => ({ product, line })));
  if (matches.length !== 1) throw new Error("unknown-product");
  const { product, line } = matches[0];
  if (subscription) {
    if (!["SUBSCRIPTION_STATE_ACTIVE", "SUBSCRIPTION_STATE_IN_GRACE_PERIOD", "SUBSCRIPTION_STATE_CANCELED"].includes(payload.subscriptionState)) throw new Error("inactive-subscription");
  } else if (payload.purchaseStateContext?.purchaseState !== "PURCHASED" || line.productOfferDetails?.rentOfferDetails || line.productOfferDetails?.preorderOfferDetails) throw new Error("not-purchased");
  const startsAt = Date.parse(subscription ? payload.startTime : payload.purchaseCompletionTime);
  const endsAt = subscription ? Date.parse(line.expiryTime) : null;
  if (!Number.isFinite(startsAt) || startsAt > now || (subscription && (!Number.isFinite(endsAt) || endsAt <= now))) throw new Error("invalid-window");
  return { plan: product.plan, startsAt, endsAt, enabled: true, source: "google_play", productId: product.productId };
}

const verifyRastroProPurchase = onCall({ region: "us-central1", enforceAppCheck: true, timeoutSeconds: 60 }, async request => {
  const uid = request.auth?.uid;
  if (!uid || request.auth.token.firebase?.sign_in_provider === "anonymous") throw new HttpsError("unauthenticated", "Inicia sesión.");
  const products = catalog.filter(p => p.productId && (!p.subscription || p.basePlanId));
  if (!products.length) throw new HttpsError("failed-precondition", "Productos Play pendientes de configuración.");
  const token = request.data?.purchaseToken;
  if (typeof token !== "string" || !token.length || token.length > 4096) throw new HttpsError("invalid-argument", "Recibo inválido.");
  const auth = new GoogleAuth({ scopes: ["https://www.googleapis.com/auth/androidpublisher"] });
  const google = await auth.getClient();
  const base = `https://androidpublisher.googleapis.com/androidpublisher/v3/applications/${packageName}/purchases`;
  let payload, subscription = true;
  try {
    payload = (await google.request({ url: `${base}/subscriptionsv2/tokens/${encodeURIComponent(token)}` })).data;
  } catch (error) {
    // Only absence is eligible for INAPP fallback, never authentication/network failure.
    if (![400, 404].includes(error.response?.status)) throw new HttpsError("unavailable", "No se pudo verificar con Play.");
    subscription = false;
    try { payload = (await google.request({ url: `${base}/productsv2/tokens/${encodeURIComponent(token)}` })).data; }
    catch { throw new HttpsError("unavailable", "No se pudo verificar con Play."); }
  }
  let grant;
  try { grant = verifiedGrant(payload, subscription, uid, products); }
  catch { throw new HttpsError("failed-precondition", "Compra no válida para esta cuenta."); }
  const receiptId = hash(token);
  const db = admin.firestore();
  const receipt = db.collection("rastro_play_receipts").doc(receiptId);
  const entitlement = db.collection("rastro_pro").doc(uid);
  await db.runTransaction(async tx => {
    const [saved, current] = await Promise.all([tx.get(receipt), tx.get(entitlement)]);
    if (saved.exists && saved.get("uid") !== uid) throw new HttpsError("permission-denied", "Recibo asociado a otra cuenta.");
    const existing = current.data();
    // Preserve a valid manually granted Pro, including permanent tester grants.
    const manualActive = existing?.enabled && existing.source !== "google_play" && existing.startsAt <= Date.now() &&
      (existing.endsAt == null || existing.endsAt > Date.now());
    const strongerStoreGrant = existing?.enabled && existing.source === "google_play" && existing.startsAt <= Date.now() &&
      (existing.endsAt == null || (grant.endsAt != null && existing.endsAt > grant.endsAt));
    tx.set(receipt, { uid, purchaseToken: token, subscription, ...grant, checkedAt: admin.firestore.FieldValue.serverTimestamp() }, { merge: true });
    if (!manualActive && !strongerStoreGrant) tx.set(entitlement, { ...grant, grantId: `play:${receiptId}`, checkedAt: admin.firestore.FieldValue.serverTimestamp() }, { merge: true });
  });
  if (payload.acknowledgementState !== "ACKNOWLEDGEMENT_STATE_ACKNOWLEDGED") {
    const kind = subscription ? "subscriptions" : "products";
    try { await google.request({ method: "POST", url: `${base}/${kind}/${encodeURIComponent(grant.productId)}/tokens/${encodeURIComponent(token)}:acknowledge`, data: {} }); }
    catch { throw new HttpsError("unavailable", "Compra registrada; restaura para reintentar su confirmación."); }
  }
  return { verified: true };
});
module.exports = { verifyRastroProPurchase, verifiedGrant, hash };
