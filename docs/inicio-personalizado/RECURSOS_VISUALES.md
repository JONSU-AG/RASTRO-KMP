# Distintivos de universidades — fuentes y preparación

01/11/2026. Marcas de las instituciones usadas para identificar las opciones del catálogo, sin sugerir afiliación, aval ni equivalencia de temarios. Se conservan los colores originales. Archivos locales: androidApp/src/main/res/drawable-nodpi/university_*.

- UNSA: https://www.unsa.edu.pe/wp-content/uploads/2017/12/cropped-LogoUNSAFav-192x192.png (favicon del sitio oficial).
- UNMSM: https://www.unmsm.edu.pe/uploads/rescate-2026-10-27/unmsm-static-files-v2/unmsm/assets/logo-unmsm.svg (web institucional). Paths originales blancos convertidos a VectorDrawable; se omite sombra SVG no compatible y se compacta precisión de coordenadas para evitar STRING_TOO_LARGE de AAPT. Se verificó el render del vector reconstruido como SVG. No usar el recurso sin base oscura.
- UNI: https://portal.uni.edu.pe/images/logos/logo-uni-blanco_med.png (cabecera del portal institucional).
- UNT: https://www.unitru.edu.pe/Recursos/img-unt/logo-unt1.png (cabecera web institucional).
- UNAP-Puno: https://portal.unap.edu.pe/sites/default/files/Escudo%20UNA%20Puno_0.png (cabecera institucional).
- UNSAAC: https://www.unsaac.edu.pe/wp-content/uploads/2023/01/cropped-escudo-oficial-02-2-2-e1675183581418-192x192.png (favicon oficial).
- UNJBG: https://www.unjbg.edu.pe/images/themes/unjbg/logo-sm.png (portal institucional).
- UNCP: https://uncp.edu.pe/wp-content/uploads/2025/09/cropped-logo-uncp-2024-192x192.png (favicon oficial).

UniversityBadge conserva los archivos originales. Para las marcas horizontales, una ventana de dibujo muestra el escudo sin el texto pequeño (no se redibuja ni se deforma). Placa blanca para marcas a color; oscura para UNI y San Marcos, cuyas versiones originales son blancas. UNMSM calcula coordenadas proporcionalmente al tamaño intrínseco para respetar distintas densidades de pantalla. El nombre y la sigla están en el texto accesible de cada opción.

Google: https://www.gstatic.com/firebasejs/ui/2.0.0/images/auth/google.svg . Cuatro trazos/color originales convertidos a VectorDrawable; las traslaciones anidadas del original se cancelan. Sustituye el genérico AccountCircle del botón de acceso. Marca Google conservada sin tintado.

No se consultan estas webs al abrir la app y no hay escrituras Firebase nuevas. La revisión de archivos/gráficos no sustituye la prueba visual de Android en dispositivo.
