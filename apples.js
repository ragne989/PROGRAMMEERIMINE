const apples = [ 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65];

let smallApples = [];
let mediumApples = [];
let bigApples = [];
 
for (const i in apples) {
  if (apples[i] <= 50) {
    smallApples.push(apples[i]);
  } else if (apples[i] < 71 && apples[i] > 50) {
    mediumApples.push(apples[i]);
  } else {
    bigApples.push(apples[i]);
  }
}
 
console.log("Kokku loendati enne sorteerimist " + apples.length + " õuna.");
console.log("Õunad sorteeriti järgmiselt:");
console.log("Väikseid õunu: " + smallApples.length + " massiga " + smallApples);
console.log("Keskmisi õunu: " + mediumApples.length + " massiga " + mediumApples);
console.log("Suuri õunu: " + bigApples.length + " massiga " + bigApples);
