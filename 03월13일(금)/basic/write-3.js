const fs = require('fs');

const data = fs.readFileSync(__dirname + '/example.txt', 'utf8');

if (fs.existsSync(__dirname + 'text1.txt')) {
  console.log('이미 있음');
} else {
  fs.writeFileSync(__dirname + '/text1.txt', data);
  console.log('만듦');
}
