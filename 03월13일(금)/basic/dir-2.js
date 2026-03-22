const fs = require('fs');

if (fs.existsSync(__dirname + '/test2/test3/test4')) {
  console.log('folder already exists');
} else {
  fs.mkdir(__dirname + '/test2/test3/test4', { recursive: true }, (err) => {
    if (err) {
      return console.error(err);
    }
    console.log('folder created');
  });
}
//recursive: true ---> 상위폴더가 없어도 해당 폴더를 만들수 있도록
// 원래는 상위폴더에 파일이 없으면 에러가 난다
