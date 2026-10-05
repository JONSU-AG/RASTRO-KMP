"use strict";
const test = require("node:test");
const assert = require("node:assert/strict");
const { cleanupUser } = require("./cleanup");

// Small in-memory Firestore adapter verifies paging, field paths and isolation.
function fixture(rows, failOnce = false) {
  const data = new Map(Object.entries(rows));
  let reads = 0;
  const deleted = [];
  const valueAt = (value, path) => path.split(".").reduce((result, key) => result?.[key], value);
  const db = {
    collection(name) { return {
      doc(id) { return { path: `${name}/${id}` }; },
      where(field, operator, value) { return { limit(count) { return { async get() {
        reads++;
        const docs = [...data].filter(([key, row]) => key.startsWith(`${name}/`) && key.split("/").length === 2 &&
          (operator === "==" ? valueAt(row, field) === value : valueAt(row, field)?.includes(value)))
          .slice(0, count).map(([path]) => ({ id: path.split("/").at(-1), ref: { path } }));
        return { empty: docs.length === 0, docs };
      } }; } }; }
    }; },
    async recursiveDelete(ref) {
      if (failOnce && deleted.length === 17) { failOnce = false; throw Error("network"); }
      [...data.keys()].filter(key => key === ref.path || key.startsWith(`${ref.path}/`)).forEach(key => data.delete(key));
      deleted.push(ref.path);
    },
    batch() {
      const changes = [];
      return {
        update(ref, field, remove) { changes.push([ref.path, field, remove]); },
        async commit() {
          for (const [path, field, uid] of changes) {
            const keys = field.split("."); let object = data.get(path);
            for (const key of keys.slice(0, -1)) object = object[key];
            const key = keys.at(-1); object[key] = object[key].filter(value => value !== uid);
          }
        }
      };
    }
  };
  return { db, data, reads: () => reads, deleted };
}
const fields = { arrayRemove: uid => uid, fieldPath: segments => segments.join(".") };

test("purges more than one page, descendants and related records; preserves another user", async () => {
  const rows = { "usuarios/u": { displayName: "U" }, "usuarios/u/gamificacion/progreso": { xp: 5 },
    "usuarios/v": { displayName: "V" }, "uploads/other": { uploadedBy: { uid: "v" }, reactions: { "👍": ["u", "v"] } },
    "publicacion_comentarios/foreign": { authorUid: "v", postId: "p0" },
    "rastro_yt_playlists/mine": { ownerUid: "u" }, "rastro_yt_playlists/theirs": { ownerUid: "v" },
    "siguiendo/relation": { followerUid: "v", followedUid: "u" }, "racha_dual/pair": { user1Uid: "v", user2Uid: "u" } };
  for (let i = 0; i < 251; i++) rows[`uploads/p${i}`] = { uploadedBy: { uid: "u" } };
  const f = fixture(rows);
  await cleanupUser(f.db, "u", fields);
  assert.equal(f.data.size, 3);
  assert.deepEqual(f.data.get("uploads/other").reactions["👍"], ["v"]);
  assert(f.data.has("usuarios/v")); assert(f.data.has("rastro_yt_playlists/theirs"));
  await cleanupUser(f.db, "u", fields);
  assert.equal(f.data.size, 3);
});
test("retry resumes partial deletion without touching foreign content", async () => {
  const rows = { "usuarios/v": {}, "uploads/foreign": { ownerId: "v" } };
  for (let i = 0; i < 240; i++) rows[`uploads/p${i}`] = { ownerId: "u" };
  const f = fixture(rows, true);
  await assert.rejects(cleanupUser(f.db, "u", fields), /network/);
  await cleanupUser(f.db, "u", fields);
  assert.equal(f.data.size, 2);
});
test("invalid UID is rejected before accessing the database", async () => {
  const f = fixture({});
  await assert.rejects(cleanupUser(f.db, "u/other", fields), /Invalid uid/);
  assert.equal(f.reads(), 0);
});
