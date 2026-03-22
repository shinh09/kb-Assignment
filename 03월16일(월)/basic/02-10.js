let obj = { result: 0 };

obj.add = function (x, y) {
  function inner() {
    this.result = x + y;
  }
  inner();
};
obj.add(3, 4);

console.log(obj);
console.log(result);

//obj객체는 선언 시 result 속성값이 0이다
//obj객체의 add함수가 호출이 될때
// 그 내부함수에서 x+y라는 함수가 실행이 된다.
// 이때 객체를 통한 호출이 아닌 일반 함수?의 호출이므로
// 전역객체의 result 값이 7로 변경된다
//여기서 가르키는 this.result의 this의 top level이 obj가 아니라 window이기 때문에 result값이 변경되지 않는다.
//obj.result의 값은 여전히 0이 된다.
