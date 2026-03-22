let p1 = { name: 'john', age: 20 };
p1.age = 22;
console.log(p1);

p1 = { name: 'lee', age: 25 };
console.log(p1);

// p1이 const로 선언이 될 경우 p1의 속성값을 변경하려고 할때 에러가 난다.
// p1은 let으로 선언
// 결과값은 속성값이 변경된다.
