import React, { useState, useEffect } from 'react';
import { Header } from './components/Header';
import { Footer } from './components/Footer';
import { Home } from './pages/Home';
import { Privacidad } from './pages/Privacidad';
import { Terminos } from './pages/Terminos';
import { Comunidad } from './pages/Comunidad';
import { EliminarCuenta } from './pages/EliminarCuenta';

function normalizePath(pathname: string, hash: string): string {
  // Support legacy hash routes e.g. /#/privacidad -> /privacidad
  if (hash && hash.startsWith('#/')) {
    const cleanHash = hash.replace(/^#/, '');
    return cleanHash || '/';
  }
  
  // Normal clean pathname
  const cleaned = pathname.replace(/\/$/, '');
  return cleaned || '/';
}

export default function App() {
  const [currentPath, setCurrentPath] = useState<string>(() => {
    return normalizePath(window.location.pathname, window.location.hash);
  });

  useEffect(() => {
    const handlePopState = () => {
      const path = normalizePath(window.location.pathname, window.location.hash);
      setCurrentPath(path);
    };

    window.addEventListener('popstate', handlePopState);
    window.addEventListener('hashchange', handlePopState);

    return () => {
      window.removeEventListener('popstate', handlePopState);
      window.removeEventListener('hashchange', handlePopState);
    };
  }, []);

  const navigate = (path: string) => {
    if (path === currentPath) return;
    window.history.pushState({}, '', path);
    setCurrentPath(path);
    window.scrollTo(0, 0);
  };

  // Dynamic SEO metadata update
  useEffect(() => {
    let title = 'RASTRO | Centro Legal';
    let description = 'Centro Legal de RASTRO Preuniversitario: Consulta la información legal, condiciones de uso, normas de la comunidad y eliminación de cuenta.';

    switch (currentPath) {
      case '/privacidad':
        title = 'RASTRO | Política de Privacidad';
        description = 'Política de Privacidad de RASTRO Preuniversitario. Información sobre datos recopilados, tratamiento, servicios de Google y Firebase, y seguridad.';
        break;
      case '/terminos':
        title = 'RASTRO | Términos y Condiciones';
        description = 'Términos y Condiciones de uso de RASTRO Preuniversitario. Normas de uso, derechos de autor, conductas prohibidas y moderación.';
        break;
      case '/comunidad':
        title = 'RASTRO | Normas de la Comunidad';
        description = 'Normas de la Comunidad RASTRO Preuniversitario. Principios de respeto, uso de materiales, privacidad, reportes y moderación.';
        break;
      case '/eliminar-cuenta':
        title = 'RASTRO | Eliminar Cuenta';
        description = 'Eliminación de cuenta y datos de RASTRO Preuniversitario. Instrucciones para eliminar tu cuenta desde la app o mediante correo electrónico.';
        break;
      default:
        title = 'RASTRO | Centro Legal';
        description = 'Centro Legal de RASTRO Preuniversitario: Consulta la información legal, condiciones de uso, normas de la comunidad y eliminación de cuenta.';
    }

    document.title = title;

    // Update meta tags
    const metaDesc = document.querySelector('meta[name="description"]');
    if (metaDesc) metaDesc.setAttribute('content', description);

    const ogTitle = document.querySelector('meta[property="og:title"]');
    if (ogTitle) ogTitle.setAttribute('content', title);

    const ogDesc = document.querySelector('meta[property="og:description"]');
    if (ogDesc) ogDesc.setAttribute('content', description);

    const twitterTitle = document.querySelector('meta[name="twitter:title"]');
    if (twitterTitle) twitterTitle.setAttribute('content', title);

    const twitterDesc = document.querySelector('meta[name="twitter:description"]');
    if (twitterDesc) twitterDesc.setAttribute('content', description);
  }, [currentPath]);

  const renderPage = () => {
    switch (currentPath) {
      case '/privacidad':
        return <Privacidad />;
      case '/terminos':
        return <Terminos />;
      case '/comunidad':
        return <Comunidad />;
      case '/eliminar-cuenta':
        return <EliminarCuenta />;
      case '/':
      default:
        return <Home navigate={navigate} />;
    }
  };

  return (
    <div className="min-h-screen bg-white text-slate-900 flex flex-col font-sans">
      <Header currentPath={currentPath} navigate={navigate} />
      <div className="flex-1">
        {renderPage()}
      </div>
      <Footer navigate={navigate} />
    </div>
  );
}
