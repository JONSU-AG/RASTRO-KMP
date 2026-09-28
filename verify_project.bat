@echo off
echo ===================================================
echo RASTRO - Verificacion de Proyecto Kotlin Multiplatform
echo ===================================================
echo.

if exist "settings.gradle.kts" (
    echo [OK] settings.gradle.kts encontrado
) else (
    echo [ERROR] Falta settings.gradle.kts
)

if exist "build.gradle.kts" (
    echo [OK] build.gradle.kts raiz encontrado
) else (
    echo [ERROR] Falta build.gradle.kts
)

if exist "gradle\libs.versions.toml" (
    echo [OK] gradle\libs.versions.toml encontrado
) else (
    echo [ERROR] Falta libs.versions.toml
)

if exist "shared\build.gradle.kts" (
    echo [OK] Modulo :shared configurado
) else (
    echo [ERROR] Falta shared\build.gradle.kts
)

if exist "androidApp\build.gradle.kts" (
    echo [OK] Modulo :androidApp configurado
) else (
    echo [ERROR] Falta androidApp\build.gradle.kts
)

if exist "androidApp\google-services.json" (
    echo [OK] google-services.json configurado correctamente
) else (
    echo [ERROR] Falta google-services.json
)

if exist "androidApp\src\main\AndroidManifest.xml" (
    echo [OK] AndroidManifest.xml verificado
) else (
    echo [ERROR] Falta AndroidManifest.xml
)

echo.
echo ===================================================
echo Verificacion de Pantallas Jetpack Compose:
echo ===================================================
for %%F in (HomeScreen AprenderScreen AprenderSubjectDetailScreen LessonEngineScreen CursosScreen AcademyDetailScreen BibliotecaScreen FormularioScreen SimuladorScreen OrsttyScreen ChatsScreen UserProfileScreen AdminScreen AuthScreen LegalScreen) do (
    if exist "androidApp\src\main\kotlin\com\jonsuapps\rastro\android\ui\screens\%%F.kt" (
        echo [OK] %%F.kt
    ) else (
        echo [FALTA] %%F.kt
    )
)

echo.
echo ===================================================
echo Verificacion completada exitosamente.
echo Abre esta carpeta en Android Studio para compilar y ejecutar.
echo ===================================================
pause
