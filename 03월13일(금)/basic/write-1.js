const fs = require('fs');

const data = fs.readFileSync(__dirname + '/example.txt', 'utf8');

fs.writeFileSync(__dirname + '/text1.txt', data);
