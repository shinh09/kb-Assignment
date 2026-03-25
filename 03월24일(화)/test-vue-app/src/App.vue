<script>
import InputName from './components/InputName.vue';
export default {
  name: 'App',
  components: { InputName },
  data() {
    return {
      pName: '',
    };
  },
  methods: {
    nameChangedHandler(e) {
      this.pName = e.name;
    },
  },
};
</script>
<template>
  <div>
    <InputName @nameChanged="nameChangedHandler" />
    <h3>App 데이터: {{ pName }}</h3>
  </div>
</template>
