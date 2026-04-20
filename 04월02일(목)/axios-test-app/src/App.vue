<script setup>
import axios from 'axios';

const requestAPI = () => {
  const url = '/api/todos/2';

  axios.get(url).then((response) => {
    console.log('#응답객체:', response);
  });
};
requestAPI();
</script>

<template>
  <h1>You did it!</h1>
  <p>콘솔확인하기</p>
</template>

<style scoped></style>
