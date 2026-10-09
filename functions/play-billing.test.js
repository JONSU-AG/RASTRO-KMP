"use strict";
const { test } = require("node:test");
const assert = require("node:assert/strict");
const { verifiedGrant, hash } = require("./play-billing");
const products = [{ plan: "Mensual", productId: "test-sub", basePlanId: "test-base", subscription: true }, { plan: "Permanente", productId: "test-once", subscription: false }];
const sub = () => ({ externalAccountIdentifiers: { obfuscatedExternalAccountId: hash("u") }, subscriptionState: "SUBSCRIPTION_STATE_ACTIVE", startTime: new Date(10).toISOString(), lineItems: [{ productId: "test-sub", offerDetails: { basePlanId: "test-base" }, expiryTime: new Date(1000).toISOString() }] });
test("active subscription and cancelled subscription retain only verified expiry", () => {
  assert.equal(verifiedGrant(sub(), true, "u", products, 100).endsAt, 1000);
  const p = sub(); p.subscriptionState = "SUBSCRIPTION_STATE_CANCELED";
  assert.equal(verifiedGrant(p, true, "u", products, 100).endsAt, 1000);
});
test("pending, held and expired subscriptions cannot grant Pro", () => {
  for (const state of ["SUBSCRIPTION_STATE_PENDING", "SUBSCRIPTION_STATE_ON_HOLD", "SUBSCRIPTION_STATE_EXPIRED"]) {
    const p = sub(); p.subscriptionState = state; assert.throws(() => verifiedGrant(p, true, "u", products, 100));
  }
  assert.throws(() => verifiedGrant(sub(), true, "u", products, 1000));
});
test("account and base plan must match", () => {
  assert.throws(() => verifiedGrant(sub(), true, "other", products, 100));
  const p = sub(); p.lineItems[0].offerDetails.basePlanId = "wrong"; assert.throws(() => verifiedGrant(p, true, "u", products, 100));
});
test("one-time purchase grants permanent only after actual purchased completion", () => {
  const p = { obfuscatedExternalAccountId: hash("u"), purchaseStateContext: { purchaseState: "PURCHASED" }, purchaseCompletionTime: new Date(10).toISOString(), productLineItem: [{ productId: "test-once", productOfferDetails: {} }] };
  assert.equal(verifiedGrant(p, false, "u", products, 100).endsAt, null);
  p.purchaseStateContext.purchaseState = "PENDING"; assert.throws(() => verifiedGrant(p, false, "u", products, 100));
});
