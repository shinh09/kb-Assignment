<template>
  <div>
    이름: <input type="text" v-model="name" />
    <button @click="$emit('nameChanged', { name })">이벤트발신</button>
    <!-- 자식->부모 알림 -->
  </div>
</template>

<script>
export default {
  name: 'InputName',
  data() {
    return {
      name: '',
    };
  },
};
</script>
