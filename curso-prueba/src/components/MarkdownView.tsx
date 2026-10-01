import React, { useMemo } from 'react';
import katex from 'katex';

interface MarkdownViewProps {
  content: string;
  onNavigateSection?: (sectionTitle: string) => void;
}

export const MarkdownView: React.FC<MarkdownViewProps> = ({ content }) => {
  // Render math expressions safely using KaTeX
  const renderMath = (text: string): string => {
    // 1. Block math: $$ ... $$
    let result = text.replace(/\$\$([\s\S]*?)\$\$/g, (_, math) => {
      try {
        return `<div class="my-4 py-2 px-3 bg-slate-950/60 border border-indigo-500/20 rounded-xl overflow-x-auto text-center">${katex.renderToString(math.trim(), {
          displayMode: true,
          throwOnError: false
        })}</div>`;
      } catch (e) {
        return `<pre class="text-xs text-amber-400 p-2 overflow-x-auto">${math}</pre>`;
      }
    });

    // 2. Inline math: $ ... $
    result = result.replace(/\$([^\$\n]+?)\$/g, (_, math) => {
      try {
        return katex.renderToString(math.trim(), {
          displayMode: false,
          throwOnError: false
        });
      } catch (e) {
        return `<code class="text-xs text-indigo-300 font-mono">${math}</code>`;
      }
    });

    return result;
  };

  const parsedHtml = useMemo(() => {
    if (!content) return '';

    // First process Math to avoid interference with other markdown rules
    const lines = content.split('\n');
    const htmlLines: string[] = [];
    let inCodeBlock = false;
    let codeBlockLang = '';
    let codeBuffer: string[] = [];
    let inTable = false;
    let tableBuffer: string[] = [];

    const flushTable = () => {
      if (tableBuffer.length === 0) return;
      let tableHtml = '<div class="my-6 overflow-x-auto rounded-xl border border-slate-700/60 bg-slate-900/40 shadow-sm"><table class="w-full text-left text-sm">';
      
      const headerLine = tableBuffer[0];
      const headers = headerLine.split('|').filter((_, idx, arr) => idx > 0 && idx < arr.length - 1).map(h => h.trim());
      
      tableHtml += '<thead class="bg-slate-800/80 text-xs uppercase font-semibold text-slate-300 tracking-wider"><tr>';
      headers.forEach(h => {
        tableHtml += `<th class="px-4 py-3 border-b border-slate-700/60">${renderMath(formatInline(h))}</th>`;
      });
      tableHtml += '</tr></thead><tbody class="divide-y divide-slate-800/60">';

      for (let r = 2; r < tableBuffer.length; r++) {
        const row = tableBuffer[r].split('|').filter((_, idx, arr) => idx > 0 && idx < arr.length - 1).map(c => c.trim());
        tableHtml += '<tr class="hover:bg-slate-800/30 transition-colors">';
        row.forEach(cell => {
          tableHtml += `<td class="px-4 py-3 text-slate-300">${renderMath(formatInline(cell))}</td>`;
        });
        tableHtml += '</tr>';
      }

      tableHtml += '</tbody></table></div>';
      htmlLines.push(tableHtml);
      tableBuffer = [];
      inTable = false;
    };

    const formatInline = (text: string): string => {
      return text
        .replace(/\*\*\*([^*]+)\*\*\*/g, '<em><strong>$1</strong></em>')
        .replace(/\*\*([^*]+)\*\*/g, '<strong class="text-white font-semibold">$1</strong>')
        .replace(/\*([^*]+)\*/g, '<em class="text-slate-300 italic">$1</em>')
        .replace(/`([^`]+)`/g, '<code class="px-1.5 py-0.5 text-xs font-mono rounded bg-slate-800 text-indigo-300 border border-slate-700/60">$1</code>');
    };

    for (let i = 0; i < lines.length; i++) {
      const line = lines[i];

      // Code blocks
      if (line.trim().startsWith('```')) {
        if (!inCodeBlock) {
          if (inTable) flushTable();
          inCodeBlock = true;
          codeBlockLang = line.trim().slice(3).toLowerCase();
          codeBuffer = [];
          continue;
        } else {
          inCodeBlock = false;
          const codeText = codeBuffer.join('\n');
          htmlLines.push(
            `<div class="my-5 rounded-xl border border-slate-700/60 bg-slate-950 p-4 font-mono text-xs text-slate-200 overflow-x-auto shadow-inner relative group">
              <span class="absolute top-2 right-3 text-[10px] uppercase font-bold tracking-wider text-slate-500">${codeBlockLang || 'code'}</span>
              <pre class="leading-relaxed whitespace-pre-wrap">${codeText}</pre>
            </div>`
          );
          codeBuffer = [];
          continue;
        }
      }

      if (inCodeBlock) {
        codeBuffer.push(line);
        continue;
      }

      // Tables
      if (line.trim().startsWith('|') && line.trim().endsWith('|')) {
        inTable = true;
        tableBuffer.push(line.trim());
        continue;
      } else if (inTable) {
        flushTable();
      }

      // Headings
      if (line.startsWith('# ')) {
        const title = line.replace(/^#\s+/, '').trim();
        htmlLines.push(`<h1 class="text-2xl sm:text-3xl font-extrabold tracking-tight text-white mb-6 pb-4 border-b border-slate-800 flex items-center gap-3">
          <span class="p-2 rounded-lg bg-indigo-500/10 text-indigo-400">📖</span>
          <span>${renderMath(formatInline(title))}</span>
        </h1>`);
        continue;
      }

      if (line.startsWith('## ')) {
        const title = line.replace(/^##\s+/, '').trim();
        
        // Highlight specific pre-u zones
        let badgeColor = 'bg-slate-800 text-slate-300 border-slate-700';
        let icon = '📌';
        if (title.includes('TRAMPAS') || title.includes('DISTRACTORES') || title.includes('PELIGRO')) {
          badgeColor = 'bg-rose-950/40 border-rose-600/50 text-rose-300';
          icon = '🚨';
        } else if (title.includes('HACKING') || title.includes('ARTIFICIOS') || title.includes('MNEMOTECNIA')) {
          badgeColor = 'bg-amber-950/40 border-amber-600/50 text-amber-300';
          icon = '⚡';
        } else if (title.includes('FICHA TÉCNICA') || title.includes('MATRIZ')) {
          badgeColor = 'bg-indigo-950/40 border-indigo-600/50 text-indigo-300';
          icon = '📋';
        } else if (title.includes('DECO') || title.includes('MUNDO REAL')) {
          badgeColor = 'bg-emerald-950/40 border-emerald-600/50 text-emerald-300';
          icon = '🎯';
        } else if (title.includes('FORMULARIO') || title.includes('TEÓRICO')) {
          badgeColor = 'bg-blue-950/40 border-blue-600/50 text-blue-300';
          icon = '📐';
        }

        htmlLines.push(`
          <div class="mt-10 mb-4 pt-4 border-t border-slate-800/80">
            <div class="inline-flex items-center gap-2 px-3 py-1.5 rounded-lg border text-sm font-semibold mb-3 ${badgeColor}">
              <span>${icon}</span>
              <span>${renderMath(formatInline(title))}</span>
            </div>
          </div>
        `);
        continue;
      }

      if (line.startsWith('### ')) {
        const title = line.replace(/^###\s+/, '').trim();
        htmlLines.push(`<h3 class="text-lg font-bold text-indigo-200 mt-6 mb-2 flex items-center gap-2">
          <span class="w-1.5 h-1.5 rounded-full bg-indigo-500"></span>
          <span>${renderMath(formatInline(title))}</span>
        </h3>`);
        continue;
      }

      if (line.startsWith('#### ')) {
        const title = line.replace(/^####\s+/, '').trim();
        htmlLines.push(`<h4 class="text-base font-semibold text-slate-200 mt-4 mb-2">${renderMath(formatInline(title))}</h4>`);
        continue;
      }

      // Horizontal rule
      if (line.trim() === '---' || line.trim() === '***') {
        htmlLines.push('<hr class="my-6 border-slate-800/60" />');
        continue;
      }

      // Blockquotes
      if (line.startsWith('> ')) {
        const quote = line.replace(/^>\s+/, '').trim();
        htmlLines.push(`<blockquote class="my-4 pl-4 border-l-4 border-indigo-500/60 bg-indigo-950/10 py-2 rounded-r-lg text-slate-300 italic text-sm">${renderMath(formatInline(quote))}</blockquote>`);
        continue;
      }

      // List items
      if (line.trim().startsWith('- ') || line.trim().startsWith('* ')) {
        const item = line.trim().replace(/^[-*]\s+/, '');
        htmlLines.push(`<div class="flex items-start gap-2.5 my-1.5 text-sm text-slate-300 leading-relaxed">
          <span class="text-indigo-400 mt-1 select-none text-xs">▸</span>
          <div>${renderMath(formatInline(item))}</div>
        </div>`);
        continue;
      }

      // Ordered list items
      if (/^\d+\.\s+/.test(line.trim())) {
        const numMatch = line.trim().match(/^(\d+)\.\s+(.*)/);
        if (numMatch) {
          htmlLines.push(`<div class="flex items-start gap-3 my-2 text-sm text-slate-300 leading-relaxed">
            <span class="flex-shrink-0 w-6 h-6 rounded-full bg-slate-800 text-indigo-400 font-semibold text-xs flex items-center justify-center border border-slate-700">${numMatch[1]}</span>
            <div class="pt-0.5">${renderMath(formatInline(numMatch[2]))}</div>
          </div>`);
          continue;
        }
      }

      // Regular paragraph
      if (line.trim()) {
        htmlLines.push(`<p class="my-2.5 text-sm leading-relaxed text-slate-300">${renderMath(formatInline(line))}</p>`);
      } else {
        htmlLines.push('<div class="h-2"></div>');
      }
    }

    if (inTable) flushTable();

    return htmlLines.join('\n');
  }, [content]);

  return (
    <div
      className="prose prose-invert max-w-none text-slate-300 font-normal leading-relaxed"
      dangerouslySetInnerHTML={{ __html: parsedHtml }}
    />
  );
};
