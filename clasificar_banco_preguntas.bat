@echo off
chcp 65001 > nul
echo ===================================================
echo RASTRO - Clasificador de Banco Maestro (4600+ Preguntas)
echo ===================================================
echo.
echo Clasificando por Subtema, Destino de Uso, Formato y Estado de Grafico...
python tools\clasificar_banco_maestro.py
echo.
echo ===================================================
echo Proceso finalizado. Revisa el archivo maestro:
echo copia rastro react\src\data\bancoPreguntasCepreunsa.json
echo y el checklist CHECKLIST_CLASIFICACION_BANCO_4600.md
echo ===================================================
pause
