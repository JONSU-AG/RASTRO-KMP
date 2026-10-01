const fs = require('fs');

function extractBalancedBlock(str, startIndex, openChar, closeChar) {
  let depth = 0;
  let inString = false;
  let stringChar = '';
  let isEscaped = false;
  let isTripleQuote = false;

  for (let i = startIndex; i < str.length; i++) {
    const char = str[i];
    const prevChar = i > 0 ? str[i - 1] : '';

    if (isTripleQuote) {
      if (char === '"' && str.slice(i, i + 3) === '"""') {
        isTripleQuote = false;
        i += 2;
      }
      continue;
    }

    if (inString) {
      if (char === '\\' && !isEscaped) {
        isEscaped = true;
      } else if (char === stringChar && !isEscaped) {
        inString = false;
      } else {
        isEscaped = false;
      }
      continue;
    }

    if (char === '"') {
      if (str.slice(i, i + 3) === '"""') {
        isTripleQuote = true;
        i += 2;
      } else {
        inString = true;
        stringChar = '"';
      }
      continue;
    }

    if (char === openChar) {
      depth++;
    } else if (char === closeChar) {
      depth--;
      if (depth === 0) {
        return { content: str.slice(startIndex, i + 1), endIndex: i };
      }
    }
  }
  return null;
}

function parseKotlinFileRobust(filePath) {
  const content = fs.readFileSync(filePath, 'utf8');
  const lessons = [];

  let searchIdx = 0;
  while (true) {
    const nodeIdx = content.indexOf('LessonNode(', searchIdx);
    if (nodeIdx === -1) break;

    const block = extractBalancedBlock(content, nodeIdx + 'LessonNode'.length, '(', ')');
    if (!block) break;

    searchIdx = block.endIndex + 1;
    const nodeText = block.content;

    const idMatch = nodeText.match(/id\s*=\s*"([^"]+)"/);
    const subjectIdMatch = nodeText.match(/subjectId\s*=\s*"([^"]+)"/);
    const semanaMatch = nodeText.match(/semana\s*=\s*(\d+)/);
    const subtemaMatch = nodeText.match(/subtema\s*=\s*"([^"]+)"/);
    const titleMatch = nodeText.match(/title\s*=\s*"([^"]+)"/);

    // Theory
    let theoryContent = '';
    const tripleIdx = nodeText.indexOf('content = """');
    if (tripleIdx !== -1) {
      const startContent = tripleIdx + 'content = """'.length;
      const endContent = nodeText.indexOf('"""', startContent);
      if (endContent !== -1) {
        theoryContent = nodeText.slice(startContent, endContent);
      }
    } else {
      const singleMatch = nodeText.match(/content\s*=\s*"([\s\S]*?)"\s*\n\s*\)/);
      if (singleMatch) {
        theoryContent = singleMatch[1].replace(/\\n/g, '\n').replace(/\\"/g, '"');
      }
    }

    // Challenges
    const challenges = [];
    let chSearchIdx = 0;
    while (true) {
      const chIdx = nodeText.indexOf('Challenge(', chSearchIdx);
      if (chIdx === -1) break;

      const chBlock = extractBalancedBlock(nodeText, chIdx + 'Challenge'.length, '(', ')');
      if (!chBlock) break;

      chSearchIdx = chBlock.endIndex + 1;
      const chText = chBlock.content;

      const chIdMatch = chText.match(/id\s*=\s*"([^"]+)"/);
      const chCorrectMatch = chText.match(/correctIndex\s*=\s*(\d+)/);

      // Question: can be "..." or """..."""
      let question = '';
      const qIdx = chText.indexOf('question =');
      if (qIdx !== -1) {
        const rem = chText.slice(qIdx + 'question ='.length).trimStart();
        if (rem.startsWith('"""')) {
          const qEnd = rem.indexOf('"""', 3);
          if (qEnd !== -1) question = rem.slice(3, qEnd);
        } else if (rem.startsWith('"')) {
          let esc = false;
          let end = -1;
          for (let j = 1; j < rem.length; j++) {
            if (rem[j] === '\\' && !esc) esc = true;
            else if (rem[j] === '"' && !esc) { end = j; break; }
            else esc = false;
          }
          if (end !== -1) {
            try {
              question = JSON.parse(rem.slice(0, end + 1));
            } catch (e) {
              question = rem.slice(1, end);
            }
          }
        }
      }

      // Options
      const options = [];
      const optIdx = chText.indexOf('options = listOf(');
      if (optIdx !== -1) {
        const optBlock = extractBalancedBlock(chText, optIdx + 'options = listOf'.length, '(', ')');
        if (optBlock) {
          const optRaw = optBlock.content;
          // extract quoted strings in optRaw
          let optSearch = 0;
          while (optSearch < optRaw.length) {
            const nextQuote = optRaw.indexOf('"', optSearch);
            if (nextQuote === -1) break;
            let esc = false;
            let end = -1;
            for (let k = nextQuote + 1; k < optRaw.length; k++) {
              if (optRaw[k] === '\\' && !esc) esc = true;
              else if (optRaw[k] === '"' && !esc) { end = k; break; }
              else esc = false;
            }
            if (end !== -1) {
              try {
                options.push(JSON.parse(optRaw.slice(nextQuote, end + 1)));
              } catch (e) {
                options.push(optRaw.slice(nextQuote + 1, end));
              }
              optSearch = end + 1;
            } else {
              break;
            }
          }
        }
      }

      // Explanation
      let explanation = '';
      const expIdx = chText.indexOf('explanation =');
      if (expIdx !== -1) {
        const rem = chText.slice(expIdx + 'explanation ='.length).trimStart();
        if (rem.startsWith('"""')) {
          const expEnd = rem.indexOf('"""', 3);
          if (expEnd !== -1) explanation = rem.slice(3, expEnd);
        } else if (rem.startsWith('"')) {
          let esc = false;
          let end = -1;
          for (let j = 1; j < rem.length; j++) {
            if (rem[j] === '\\' && !esc) esc = true;
            else if (rem[j] === '"' && !esc) { end = j; break; }
            else esc = false;
          }
          if (end !== -1) {
            try {
              explanation = JSON.parse(rem.slice(0, end + 1));
            } catch (e) {
              explanation = rem.slice(1, end);
            }
          }
        }
      }

      challenges.push({
        id: chIdMatch ? chIdMatch[1] : '',
        question,
        options,
        correctIndex: chCorrectMatch ? parseInt(chCorrectMatch[1], 10) : -1,
        explanation
      });
    }

    lessons.push({
      id: idMatch ? idMatch[1] : '',
      subjectId: subjectIdMatch ? subjectIdMatch[1] : '',
      semana: semanaMatch ? parseInt(semanaMatch[1], 10) : 0,
      subtema: subtemaMatch ? subtemaMatch[1] : '',
      title: titleMatch ? titleMatch[1] : '',
      theory: theoryContent,
      challenges
    });
  }

  return { filePath, lessons };
}

module.exports = { parseKotlinFileRobust };

if (require.main === module) {
  const parsed = parseKotlinFileRobust('SALIDA_KOTLIN/lenguaje/LenguajeSemana01.kt');
  console.log(`Semana01: ${parsed.lessons.length} lessons, total challenges: ${parsed.lessons.reduce((acc, l) => acc + l.challenges.length, 0)}`);
  for (const l of parsed.lessons) {
    console.log(`  ${l.id}: ${l.challenges.length} challenges`);
  }
}
