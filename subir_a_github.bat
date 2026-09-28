@echo off
chcp 65001 > nul
echo ======================================================
echo    SUBIENDO PROYECTO RASTRO KMP A GITHUB
echo ======================================================
echo.

echo Preparando rama main y origen remoto...
git branch -M main
git remote remove origin 2>nul
git remote add origin https://github.com/JONSU-AG/RASTRO-KMP.git

echo Añadiendo todos los archivos...
git add .

echo Confirmando cambios...
git commit -m "feat: complete RASTRO Kotlin Multiplatform app with tactile 3D cartoon UI, official UNSA syllabus, custom flashcards/questions with image upload, and universal favorites system"

echo.
echo Subiendo a https://github.com/JONSU-AG/RASTRO-KMP (rama main)...
git push -u origin main

if %errorlevel% neq 0 (
    echo.
    echo Si el repositorio remoto ya tenia commits previos o conflicto de ramas, intentando push con force...
    git push -u origin main --force
)

echo.
echo ======================================================
echo    PROCESO COMPLETADO EXITOSAMENTE
echo ======================================================
pause
