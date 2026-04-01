<template>
  <div class="card card-body">
    <h2>VIDEO</h2>
    <p>요청경로 : {{ $route.fullPath }}</p>
  </div>
</template>

<script>
export default {
  name: 'Videos',
  created() {
    //현재 라우터 객체를 콘솔에 출력

    console.log(this.$route);
  },
};
</script>
