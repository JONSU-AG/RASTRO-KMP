'use strict';
// Keep prose as prose. Only delimited math and recognizable mathematical atoms are typeset.
function scientificRuns(input) {
    const text = input.replace(/\\\\(?=[A-Za-z])/g, '\\');
    const runs=[]; let plain='', i=0;
    function flush(){if(plain){runs.push({text:plain,math:false});plain='';}}
    function group(at,open,close){let depth=0;for(let j=at;j<text.length;j++){if(text[j]===open)depth++;if(text[j]===close&&!--depth)return j+1;}return at;}
    function atom(at){
        const rest=text.slice(at);
        const environment=/^\\begin\{([^}]+)\}/.exec(rest);
        if(environment){const end=text.indexOf('\\end{'+environment[1]+'}',at+environment[0].length);if(end>=0)return end+environment[1].length+6;}
        if(text[at]==='_'||text[at]==='^'){
            let start=at+1;while(text[start]===' ')start++;
            if(text[start]==='{')return group(start,'{','}');
            const script=/^[A-Za-z0-9+-]+/.exec(text.slice(start));
            if(script)return start+script[0].length;
            if(text[start]==='\\')return atom(start);
            return at;
        }
        const command=/^\\(?:[A-Za-z]+|[,;! {}|])/u.exec(rest);
        if(command){let end=at+command[0].length;while(text[end]==='{'){const next=group(end,'{','}');if(next===end)break;end=next;}return end;}
        if(text[at]==='{')return group(at,'{','}');
        const word=/^(?:[A-Z]{1,4}(?![A-Za-z])|[A-Za-z]{1,2}(?![A-Za-z])|sin|cos|tan|sen|log|ln|[Α-Ωα-ω]|\d+(?:\.\d+)?|[+−\-*/=<>^_|()[\],.²³⁴⁵⁶⁷⁸⁹⁰⁻⁺₀₁₂₃₄₅₆₇₈₉·×÷±∓≤≥≠≈⇒→√])/u.exec(rest);
        return word?at+word[0].length:at;
    }
    while(i<text.length){
        const rest=text.slice(i);
        let opener=null,closer=null;
        for(const pair of [['$$','$$'],['\\[','\\]'],['\\(','\\)'],['$','$']]){
            if(rest.startsWith(pair[0])){opener=pair[0];closer=pair[1];break;}
        }
        if(opener){const end=text.indexOf(closer,i+opener.length);if(end>=0){flush();runs.push({text:text.slice(i+opener.length,end),math:true,explicit:true});i=end+closer.length;continue;}}
        const boundary=i===0||!/[\p{L}\p{N}]/u.test(text[i-1]);
        const starts=/^\\[A-Za-z]+/.test(rest)||boundary&&(
            /^\[[A-Za-zΑ-Ωα-ω]\]/u.test(rest)||/^(?:[A-Z]{2,4}(?![A-Za-z])|[A-Za-zΑ-Ωα-ω](?![A-Za-z]))(?:_[A-Za-z0-9{}]+)?\s*[=^_+·×]/u.test(rest)||/^\d+(?:\.\d+)?\s*\\[A-Za-z]+/u.test(rest));
        if(starts){
            let end=atom(i); if(end===i){plain+=text[i++];continue;}
            while(end<text.length){
                if(text[end]==='.' && /^\.\s+\p{L}/u.test(text.slice(end)))break;
                const spaces=/^[ \t]*/.exec(text.slice(end))[0];const next=end+spaces.length;
                if(spaces&&/^(?:en|de|la|el|un|es|al|se|si|lo|le|su|no|ni|por|con|una|del)\b/u.test(text.slice(next)))break;
                // Spanish conjunctions/articles belong to the explanation, not to the equation.
                if(spaces&&/^[yoa] [\p{L}]{3,}/u.test(text.slice(next)))break;
                const after=atom(next);if(after===next)break;
                end=after;
            }
            // A trailing full stop/comma is punctuation, not part of the formula.
            while(end>i&&/[.,]/.test(text[end-1]))end--;
            if(end>i){flush();runs.push({text:text.slice(i,end),math:true});i=end;continue;}
        }
        plain+=text[i++];
    }
    flush();return runs;
}
if(typeof module!=='undefined')module.exports={scientificRuns};
