# Centro legal publicado

Fuente reproducible de https://rumbo-jonsu.web.app. Texto aprobado el 10/10/2026; este sitio no sustituye la app Android ni la copia Compose web.

Validar con npm ci, npm run lint y npm run build. Desplegar únicamente Hosting mediante firebase deploy --only hosting --project rumbo-jonsu, después de aprobar cualquier cambio legal. No desplegar reglas ni funciones desde este centro.

public/app-ads.txt contiene la línea oficial AdMob. public/.well-known/assetlinks.json conserva las firmas de Play y de carga. La configuración anterior al despliegue está en build/hosting-before-206.json de la raíz local. No versionar credenciales, node_modules, dist ni .firebase.
