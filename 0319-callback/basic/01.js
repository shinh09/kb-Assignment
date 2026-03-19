function repeat(n, f) {
  for (var i = 0; i < n; i++) {
    f(i);
  }
}

// TODO: 콜백 함수 작성
var logAll = function (i) {
  console.log(i);
};

repeat(5, logAll);
