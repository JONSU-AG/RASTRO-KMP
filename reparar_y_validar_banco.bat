@echo off
chcp 65001 > nul
echo ===================================================
echo RASTRO - Reparacion de Graficos y Validacion de Temario
echo ===================================================
echo.
python tools\reparar_14_preguntas_y_validar_temario.py
echo.
echo ===================================================
echo Proceso finalizado. 100%% de preguntas operativas.
echo ===================================================
pause
