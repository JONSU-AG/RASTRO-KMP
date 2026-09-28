---
name: firebase-scalability-and-performance
description: High-scalability architecture, performance tuning, and database optimization for Firebase Firestore, Authentication, and Cloud Storage in high-traffic Android / Kotlin Multiplatform apps. Use when scaling to 100k+ concurrent users, avoiding document write contention, preventing query timeout/latency, optimizing client-side caching, structuring subcollections, and eliminating read/write bill spikes.
---

# Firebase Scalability & High-Performance Engineering Guide

This skill guides the design, implementation, and audit of Firebase architectures to guarantee maximum throughput, sub-100ms response times, and resilience under massive concurrent student workloads (e.g., nationwide admission exam preparation peaks).

---

## 1. Golden Rules of Firestore Scaling

### A. The 1 MiB Document Limit & Boundless Collections
- **Anti-Pattern (Catastrophic Failure)**: Storing growing lists (comments, reactions, messages, quiz answers) as an `Array` inside a single document.
  - *Risk*: A popular post or active chat will quickly exceed 1 MiB, permanently breaking writes and reads for all users.
- **Scaling Rule**:
  - Store comments as a subcollection: `uploads/{uploadId}/comentarios/{comentarioId}`.
  - Store chat messages as a subcollection: `salas_chat/{chatId}/mensajes/{mensajeId}`.
  - Keep parent documents slim (< 20 KB), containing only metadata, counters, and indexed search tags.

### B. The 1 Write / Second Per Document Contention Limit
- Firestore documents can sustain approximately 1 sustained write per second.
- **Solution for High-Frequency Counters (Likes, Views, XP, Live Test Registrations)**:
  - Use **Distributed Counters** (sharding across 10-20 counter subdocuments).
  - Or batch client updates and debounce writes (e.g., sync XP or Pomodoro time every 30 seconds rather than every millisecond).

### C. Offline-First Architecture & Persistent Disk Cache
- Configure Firestore with robust local caching so repeated visits to screens (e.g., Biblioteca, Fórmulas, Perfil, Nodos de Aprendizaje) never hit network reads repeatedly:
  ```kotlin
  val settings = firestoreSettings {
      setLocalCacheSettings(
          persistentCacheSettings {
              setSizeBytes(100L * 1024L * 1024L) // 100 MB de caché local indexada
          }
      )
  }
  FirebaseFirestore.getInstance().firestoreSettings = settings
  ```
- Use `Source.CACHE` or `Source.DEFAULT` appropriately.

---

## 2. Query Pagination & Cursor Architecture

Never perform unbounded `.get()` or snapshot listening on root collections without limits.

### Safe Pagination Pattern:
```kotlin
// Siempre aplicar límite estricto
collection("uploads")
    .whereEqualTo("oculto", false)
    .orderBy("createdAt", Query.Direction.DESCENDING)
    .limit(20)
    .get()
    .addOnSuccessListener { snapshot ->
        val lastVisible = snapshot.documents.lastOrNull()
        // Carga subsiguiente mediante cursor
    }
```
- **Rule**: Every list feed (Biblioteca, Muro Comunitario, Exámenes Pasados) must enforce `.limit(15)` or `.limit(25)`.
- Use `startAfter(lastVisibleDocument)` when scrolling to fetch the next batch.

---

## 3. Realtime Listener Hygiene & Memory Leaks

Unmanaged `SnapshotListener`s cause severe memory leaks and runaway read operations in Android:
- **Rule**: Every `addSnapshotListener` inside Jetpack Compose MUST be registered inside a `DisposableEffect`:
  ```kotlin
  DisposableEffect(channelId) {
      val registration = query.addSnapshotListener { snapshot, error ->
          // update state
      }
      onDispose {
          registration.remove() // CRITICAL: Stop listening immediately on screen exit
      }
  }
  ```

---

## 4. Security Rules Performance Optimization

Inefficient Firestore Security Rules can multiply latency and consume excessive evaluation quota:
1. Avoid cascading `get()` or `exists()` calls inside rules. Keep rules evaluations to $\le 2$ document lookups.
2. Put `request.auth != null` as the first boolean clause to short-circuit unauthenticated calls instantly.
3. Validate immutable fields with `request.resource.data.authorUid == resource.data.authorUid`.

---

## 5. Pre-Admission Exam Traffic Spike Checklist

- [ ] Composite indexes created in `firestore.indexes.json` for all multiple-field `where` + `orderBy` queries.
- [ ] Offline persistence enabled with $\ge 50$ MB cache quota.
- [ ] No unbounded arrays stored in root document fields.
- [ ] All chat rooms and comment sections backed by subcollections with pagination.
- [ ] Push notifications dispatched asynchronously via background worker or serverless functions without blocking client UI threads.
