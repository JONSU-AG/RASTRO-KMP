---
name: playstore-policy-and-compliance
description: Google Play Developer Policy compliance, security, privacy mandates, and rejection-proofing for Android applications. Use when auditing or preparing an app for Google Play Store publication, handling User-Generated Content (UGC) safety, implementing Account Deletion requirements, configuring the Data Safety Form, verifying targetSdk compliance, and ensuring zero policy strikes.
---

# Google Play Store Policy & Developer Compliance Guide

This skill governs end-to-end compliance with Google Play Developer Program Policies to ensure smooth submission, instant app review approval, and protection against suspensions or rejections.

---

## 1. User Generated Content (UGC) Policy (§Google Play UGC Mandate)

Apps featuring community interaction, study material sharing, user comments, or public chat rooms MUST comply with the following 4 mandatory pillars:

1. **Explicit Terms of Use (EULA / Community Guidelines)**:
   - Users must accept clear terms stating zero tolerance for objectionable content, harassment, piracy, or abuse before uploading or commenting.
   - Accessible in-app at all times (e.g., `LegalScreen`, `TermsAndPrivacyDialog`).

2. **In-App Content Reporting System**:
   - Every piece of UGC (post, document, comment, message) must display a clear, accessible **"Reportar"** action.
   - Must allow selecting the specific problem category (Spam, Contenido Ofensivo, Infracción de Derechos de Autor, Información Errónea, etc.).
   - **Auto-Moderation Rule**: Accumulating 3 reports automatically hides the publication (`oculto = true`, `hidden = true`) pending admin review.

3. **In-App User Blocking**:
   - Users must be able to block abusive peers so their content and direct messages are immediately hidden from the blocker's view.

4. **Rapid Administrative Moderation**:
   - Admins must have tools to review reported items, ban/warn offenders, and permanently delete infringing media within 24 hours.

---

## 2. In-App and Web Account Deletion Mandate

Google Play strictly requires that if an app allows account creation, it MUST provide:

1. **Direct In-App Account Deletion**:
   - A clear button within Settings (e.g., `ProfileSettingsDialog` -> "Eliminar Cuenta").
   - Deletes the user profile, authentication record (`user.delete()`), and purges or anonymizes their personal data.
2. **Public Web Deletion Request URL**:
   - A publicly accessible web URL where users can request data and account deletion without reinstalling the app (e.g., `https://rumbo-jonsu.web.app/eliminar-cuenta` or terms page with contact form).
   - This URL must be provided in the Google Play Console "Data Safety" section.

---

## 3. Data Safety Form & Privacy Declarations

When completing the Google Play Console Data Safety questionnaire for RASTRO:

| Data Type | Collected? | Shared? | Purpose | Ephemeral? |
| :--- | :---: | :---: | :--- | :---: |
| **Name & Email** | Sí | No | Funcionalidad de la app / Gestión de cuenta | No |
| **User IDs (UID)** | Sí | No | Autenticación y sincronización de progreso | No |
| **Fotos / Avatares** | Sí (opcional) | No | Personalización de perfil | No |
| **Historial de Estudio / XP** | Sí | No | Gamificación y estadísticas académicas | No |
| **Crash Logs / Diagnósticos** | Opcional | No | Análisis de estabilidad técnica | Sí |

- **Encryption in Transit**: Must declare that all user data is encrypted in transit using HTTPS / TLS 1.3.

---

## 4. Permission Minimization & Privacy Protection

- **POST_NOTIFICATIONS** (Android 13+ / API 33+):
  - Must request permission at runtime with prior educational rationale (e.g., "Activa las alertas para no perder tu racha de estudio diaria").
- **No Broad Storage Permissions**:
  - Do NOT request `READ_EXTERNAL_STORAGE` or `WRITE_EXTERNAL_STORAGE`.
  - Use the native Android Photo Picker (`ActivityResultContracts.PickVisualMedia`) or Storage Access Framework for uploading study summaries.

---

## 5. Target SDK & Android Version Compliance

- Ensure `targetSdk = 35` (or latest mandated Play Store requirement).
- Use `compileSdk = 36` with compatible AGP.
- Follow edge-to-edge system bar enforcement and support adaptive themed icons.

---

## 6. Pre-Submission Rejection-Proof Checklist

- [ ] Community Guidelines & Terms of Service visible and accepted before posting UGC.
- [ ] Working "Reportar" action on all community posts with 3-report auto-hide.
- [ ] Working "Eliminar Cuenta" in Profile Settings.
- [ ] Public Privacy Policy URL hosted and live (`https://rumbo-jonsu.web.app/privacidad`).
- [ ] No placeholder or broken links in Legal screens.
- [ ] Release APK / AAB signed with Google Play App Signing key and ProGuard/R8 obfuscation enabled.
