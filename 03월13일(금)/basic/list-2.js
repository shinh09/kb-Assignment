//비동기함수로 처리
const fs = require('fs');

console.log(
  fs.readdir('./', (err, files) => {
    if (err) {
      console.error(err);
    }
    console.log(files);
  })
);
