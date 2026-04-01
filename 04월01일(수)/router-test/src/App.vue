<template>
  <div class="container">
    <Header />
    <!-- 라우터에 의해서 변경되는 페이지 영역 -->
    <!-- 현재 URL에 맞는 컴포넌트가 요기에 랜더링된다. -->
    <RouterView />
  </div>
</template>

<script setup>
import Header from './components/Header.vue';
</script>

<style>
.container {
  text-align: center;
  margin-top: 10px;
}

.card {
  margin-top: 10px;
}
</style>
