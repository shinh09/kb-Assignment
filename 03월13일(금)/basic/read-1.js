const fs = require('fs');

console.log(fs.readFileSync(__dirname + '/example.txt', 'utf8'));
