const fs = require('fs');
const path = require('path');

function cleanForKotlin(str) {
  if (!str) return '';
  return str
    .replace(/\\/g, '\\\\')
    .replace(/"/g, '\\"')
    .replace(/\$/g, '')
    .trim();
}

function cleanTripleQuotes(str) {
  if (!str) return '';
  return str
    .replace(/"""/g, '\\"\\"\\"')
    .replace(/\$/g, '');
}

console.log("clean helper ready");
