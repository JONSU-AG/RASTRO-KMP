// Local preview only: never serves the repository or private configuration.
const http = require('node:http');
const fs = require('node:fs');
const path = require('node:path');
const root = path.resolve(__dirname, 'build/dist/wasmJs/productionExecutable');
if (!fs.existsSync(path.join(root, 'index.html'))) throw new Error('Primero compila wasmJsBrowserDistribution.');
const types = {'.html':'text/html; charset=utf-8','.js':'text/javascript; charset=utf-8','.wasm':'application/wasm','.png':'image/png','.webmanifest':'application/manifest+json','.css':'text/css'};
http.createServer((req, res) => {
  if (req.method !== 'GET' && req.method !== 'HEAD') { res.writeHead(405).end(); return; }
  let requestPath;
  try { requestPath = decodeURIComponent(new URL(req.url, 'http://127.0.0.1').pathname); }
  catch { res.writeHead(400).end(); return; }
  const file = path.resolve(root, '.' + (requestPath === '/' ? '/index.html' : requestPath));
  if (!file.startsWith(root + path.sep)) { res.writeHead(403).end(); return; }
  fs.stat(file, (error, stat) => {
    if (error || !stat.isFile()) { res.writeHead(404).end(); return; }
    res.writeHead(200, {'Content-Type':types[path.extname(file)] || 'application/octet-stream','Cache-Control':'no-cache'});
    if (req.method === 'HEAD') res.end(); else fs.createReadStream(file).pipe(res);
  });
}).listen(4173, '127.0.0.1', () => console.log('RASTRO Web: http://127.0.0.1:4173'));
