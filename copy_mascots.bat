@echo off
set "SRC=copia rastro react\public\assets\mascots"
set "DST=androidApp\src\main\res\drawable"

copy /y "%SRC%\artyon-asustado.png" "%DST%\artyon_asustado.png"
copy /y "%SRC%\artyon-asustado2.png" "%DST%\artyon_asustado2.png"
copy /y "%SRC%\artyon-confundido.png" "%DST%\artyon_confundido.png"
copy /y "%SRC%\artyon-contento.png" "%DST%\artyon_contento.png"
copy /y "%SRC%\artyon-emocionado.png" "%DST%\artyon_emocionado.png"
copy /y "%SRC%\artyon-enojado.png" "%DST%\artyon_enojado.png"
copy /y "%SRC%\artyon-feliz.png" "%DST%\artyon_feliz.png"
copy /y "%SRC%\artyon-guinando.png" "%DST%\artyon_guinando.png"
copy /y "%SRC%\artyon-pensativo.png" "%DST%\artyon_pensativo.png"
copy /y "%SRC%\artyon-sorprendido.png" "%DST%\artyon_sorprendido.png"
copy /y "%SRC%\artyon-timido.png" "%DST%\artyon_timido.png"
copy /y "%SRC%\artyon-triste.png" "%DST%\artyon_triste.png"

copy /y "%SRC%\orstty-asustado.png" "%DST%\orstty_asustado.png"
copy /y "%SRC%\orstty-asustado2.png" "%DST%\orstty_asustado2.png"
copy /y "%SRC%\orstty-contento.png" "%DST%\orstty_contento.png"
copy /y "%SRC%\orstty-enojado.png" "%DST%\orstty_enojado.png"
copy /y "%SRC%\orstty-feliz.png" "%DST%\orstty_feliz.png"
copy /y "%SRC%\orstty-guinando.png" "%DST%\orstty_guinando.png"
copy /y "%SRC%\orstty-pensativo.png" "%DST%\orstty_pensativo.png"
copy /y "%SRC%\orstty-sorprendido.png" "%DST%\orstty_sorprendido.png"
copy /y "%SRC%\orstty-timido.png" "%DST%\orstty_timido.png"
copy /y "%SRC%\orstty-triste.png" "%DST%\orstty_triste.png"

copy /y "copia rastro react\public\assets\ARTYON.png" "%DST%\artyon_banner.png"
copy /y "copia rastro react\public\assets\ORSTYY_ARTYON.png" "%DST%\orstty_artyon.png"
copy /y "copia rastro react\public\assets\ORSTYY_ARTYON2.png" "%DST%\orstty_artyon2.png"

copy /y "copia rastro react\public\applogo.png" "%DST%\app_logo.png"
copy /y "copia rastro react\public\astrologo.png" "%DST%\astro_logo.png"

copy /y "LOGO\LOGOBASE.png" "%DST%\rastro_logo_base.png"
copy /y "LOGO\LOGO-ENOJO.png" "%DST%\rastro_logo_enojo.png"
copy /y "LOGO\LOGO-FURIA.png" "%DST%\rastro_logo_furia.png"
copy /y "LOGO\LOGOTRISTE.png" "%DST%\rastro_logo_triste.png"

echo Done copying all mascots and logos!
