const fs = require('fs');

const data = fs.readFile(__dirname + '/example.txt', 'utf8', (err, data) => {
  if (err) {
    console.error(err);
  }
  fs.writeFile(__dirname + '/text2.txt', data, (err) => {
    if (err) {
      console.error(err);
    }
  });
});
