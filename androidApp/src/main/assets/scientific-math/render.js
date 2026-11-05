'use strict';
let sizeObserver;
window.renderMath = function (payload) {
    const root = document.getElementById('math');
    root.classList.toggle('theory', !!payload.theoryStyle);
    root.style.setProperty('--concept',payload.conceptColor || 'inherit');
    root.style.setProperty('--secondary',payload.secondaryColor || 'inherit');
    root.style.setProperty('--underline',payload.underlineColor || 'inherit');
    document.body.style.color = payload.color;
    root.style.fontSize = payload.fontSize + 'px';
    root.replaceChildren();
    const options={displayMode:true, output:'htmlAndMathml', throwOnError:true,
        trust:false, strict:'ignore', maxExpand:200, maxSize:20};
    function appendScientific(paragraph,text){
        scientificRuns(text).forEach(function(run){
            if(run.math){
                const span=document.createElement('span');span.className='math-inline';paragraph.appendChild(span);
                // Explicit TeX is authoritative. In inferred notation, only group lowercase labels,
                // never swallow a following uppercase factor (C_nH, K_aC) or a second script.
                const source=run.explicit?run.text:run.text.replace(/_([a-z]{2,})(?![A-Za-z_{}])/g,'_{$1}');
                try{katex.render(source,span,{...options,displayMode:false});}
                catch(_){span.classList.add('fallback');span.textContent=run.text;span.title='Se muestra la notación original.';}
            }else{
                paragraph.appendChild(document.createTextNode(run.text));
            }
        });
    }
    function appendRich(paragraph,text){
        // Recognize only these formatting delimiters; source HTML is never executed.
        text.split(/(\*\*[^*]+\*\*|\*[^*]+\*|<u>[^<>]+<\/u>)/g).forEach(function(piece){
            let tag=null,content=piece;
            if(piece.startsWith('**')&&piece.endsWith('**')){tag='strong';content=piece.slice(2,-2);}
            else if(piece.startsWith('*')&&piece.endsWith('*')){tag='em';content=piece.slice(1,-1);}
            else if(piece.startsWith('<u>')&&piece.endsWith('</u>')){tag='u';content=piece.slice(3,-4);}
            const target=tag?document.createElement(tag):paragraph;
            if(tag)paragraph.appendChild(target);
            appendScientific(target,content);
        });
    }
    if(payload.richText){
        const paragraph=document.createElement('div');paragraph.className='prose';root.appendChild(paragraph);
        appendRich(paragraph,payload.richText);
    }
    (payload.tables||[]).forEach(function(source){
        if(source.headers.length>=3){const hint=document.createElement('div');hint.style.font='12px system-ui,sans-serif';hint.textContent='Desliza para ver todas las columnas →';root.appendChild(hint);}
        const wrapper=document.createElement('div');wrapper.className='table-scroll';root.appendChild(wrapper);
        const table=document.createElement('table');wrapper.appendChild(table);
        const head=document.createElement('thead');table.appendChild(head);
        const header=document.createElement('tr');head.appendChild(header);
        source.headers.forEach(function(value){const cell=document.createElement('th');cell.scope='col';appendRich(cell,value);header.appendChild(cell);});
        const body=document.createElement('tbody');table.appendChild(body);
        source.rows.forEach(function(values){const row=document.createElement('tr');body.appendChild(row);
            values.forEach(function(value){const cell=document.createElement('td');appendRich(cell,value);row.appendChild(cell);});
        });
    });
    payload.expressions.forEach(function (source) {
        const row = document.createElement('div'); row.className = 'formula'; root.appendChild(row);
        try {
            katex.render(source, row, options);
        } catch (_) {
            row.classList.add('fallback'); row.textContent = source;
            const notice = document.createElement('div'); notice.className='error';
            notice.textContent='No se pudo representar esta expresión. Se muestra el original.';
            root.appendChild(notice);
        }
    });
    const report = function () { if (window.RastroMathSize) window.RastroMathSize.height(Math.ceil(root.getBoundingClientRect().height)); };
    if (sizeObserver) sizeObserver.disconnect();
    sizeObserver = new ResizeObserver(report); sizeObserver.observe(root);
    document.fonts.ready.then(report); report();
};
