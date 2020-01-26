var book = new Map();
// an apple costs 67 cents
book["apple"] = 0.67;
// milk costs $1.49
book["milk"] = 1.49;
book["avocado"] = 1.49;

for ( [key, value]  of Object.entries(book)) {
  console.log(key, value);

}
