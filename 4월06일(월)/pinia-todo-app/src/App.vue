<script setup></script>

<template>
  <h1>TodoList 테스트(composition API)!</h1>
  <span><input type="text" /><button>추가</button></span>
  <ul>
    <li>
      예시 할일
      <button>삭제</button>
    </li>
  </ul>
  <p>완료된 할일 수 : {{}}</p>
</template>

<style scoped></style>

<!-- 
1. pinia 인스턴스 만들기 (stores/counter.js)
2. 등록하기 app.use(pinia)
3. 
-->

<!-- 
데이터: 
1. todoList (+ completed인지 아닌지)
2. countComplete
동작 : 
1. delete
2. complete
3. AddTodo
-->
