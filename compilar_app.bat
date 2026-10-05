@echo off
chcp 65001 > nul
echo ===================================================
echo RASTRO - Compilando Proyecto Android y KMP...
echo ===================================================
echo.
call gradlew.bat assembleDebug
echo.
echo ===================================================
echo Proceso finalizado.
echo ===================================================
pause
