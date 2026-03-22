let msg = 'GLOBAL';

function outer() {
  let msg = 'OUTER';
  console.log(msg);
  if (true) {
    let msg = 'BLOCK';
    console.log(msg);
  }
}
outer();

// msg는 전역변수로
// --실행예상
// OUTER
// BLOCK
