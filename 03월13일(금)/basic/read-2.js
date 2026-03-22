const fs = require('fs');

const data = fs.readFile(__dirname + '/example.txt', 'utf8', (err, data) => {
  if (err) {
    console.error(err);
  }
  console.log(data);
});
