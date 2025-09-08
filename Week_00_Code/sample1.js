// Lecture: Introduction, Scope, and Introductions
// Summary: In this program we explore ceremony vs essense through JavaScript.

let x = 1;
let y = 2;

console.log(`${x} ${y}`);

//high ceremony and incorrect
//let temp = y
//x = y
//y = temp

//essence
[x, y] = [y, x];

console.log(`${x} ${y}`);

const names = ["Dory", "Gill", "Bruce", "Nemo", "Darla", "Marlin", "Jacques"];

const [first, second, ...allElse] = names;

console.log(first);
console.log(second);
console.log(allElse);