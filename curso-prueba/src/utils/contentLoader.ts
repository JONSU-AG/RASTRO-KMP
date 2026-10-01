// Dynamically import all pre-university syllabus files as raw text
const markdownModules = import.meta.glob(['/0*/**/*.md', '/CHECKLIST*.md'], {
  query: '?raw',
  import: 'default'
});

export async function loadTopicContent(filePath: string): Promise<string> {
  const normalized = filePath.startsWith('/') ? filePath : `/${filePath}`;
  
  // Try Vite glob import first
  const loader = markdownModules[normalized];
  if (loader) {
    try {
      const rawText = await loader();
      return rawText as string;
    } catch (e) {
      console.warn(`Vite glob load failed for ${normalized}, trying fetch fallback...`, e);
    }
  }

  // Fallback: fetch from dev server static root
  try {
    const res = await fetch(normalized);
    if (res.ok) {
      return await res.text();
    }
  } catch (err) {
    console.error(`Fetch fallback failed for ${normalized}:`, err);
  }

  return `# Contenido en preparación\n\nNo fue posible cargar el archivo \`${filePath}\`. Por favor intente recargar la página.`;
}
