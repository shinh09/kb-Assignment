<!-- /*
$route는 현재 라우팅 상태 객체이며, URL, params 등을 포함. 디버깅 및 동적 라우팅에서 매우 중요.
*/ -->

<template>
  <div class="card card-body">
    <h2>About</h2>
    <!-- $route.fullPath : 현재 URL 쿼리를 포함한 전체 경로 -->
    <p>요청경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script>
export default {
  name: 'About',
  created() {
    //현재 라우터 객체를 콘솔에 출력

    console.log(this.$route);
  },
};
</script>
