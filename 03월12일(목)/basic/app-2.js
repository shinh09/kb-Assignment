const { user1, user2, user3 } = require('./users-1');

const Hello = function (user) {
  console.log(`${user}님, 안녕하세요?`);
};

Hello(user1);
Hello(user2);
Hello(user3);
