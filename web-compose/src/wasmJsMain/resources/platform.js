(() => {
  const notice = document.getElementById('platform-notice');
  let dismissed = false;
  try { dismissed = Date.now() - Number(localStorage.getItem('rastro.playNoticeDismissedAt') || 0) < 7 * 86400000; } catch (_) {}
  if (/Android/i.test(navigator.userAgent) && !dismissed) notice.style.display = 'flex';
  document.getElementById('dismiss-notice').addEventListener('click', () => {
    notice.style.display = 'none';
    try { localStorage.setItem('rastro.playNoticeDismissedAt', String(Date.now())); } catch (_) {}
  });
  if ('serviceWorker' in navigator && window.isSecureContext) {
    navigator.serviceWorker.register('./sw.js').catch(() => {});
  }
})();
