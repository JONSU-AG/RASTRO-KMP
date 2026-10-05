@echo off
set "SRC=LOGO"
set "DST=androidApp\src\main\res\drawable"

copy /y "%SRC%\LOGOBASE.png" "%DST%\rastro_logo_base.png"
copy /y "%SRC%\LOGO-ENOJO.png" "%DST%\rastro_logo_enojo.png"
copy /y "%SRC%\LOGO-FURIA.png" "%DST%\rastro_logo_furia.png"
copy /y "%SRC%\LOGOTRISTE.png" "%DST%\rastro_logo_triste.png"

echo Logos copiados exitosamente a %DST%!
pause
