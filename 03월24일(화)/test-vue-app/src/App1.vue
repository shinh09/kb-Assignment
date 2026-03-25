<script>
//지역으로 설정하는 방법
import CheckboxItem from './components/CheckboxItem2.vue';
export default {
  name: 'App',
  components: { CheckboxItem }, //컴포넌트
  data() {
    return {
      idols: [
        { id: 1, name: 'BTS', checked: true },
        { id: 2, name: 'Black Pink', checked: false },
        { id: 3, name: 'EXO', checked: false },
        { id: 4, name: 'ITZY', checked: false },
      ],
    };
  },
};
</script>

<template>
  <div>
    <h2>관심있는 K-pop 가수는?</h2>
    <ul>
      <CheckboxItem
        v-for="idol in idols"
        :key="idol.id"
        :name="idol.name"
        :checked="idol.checked"
      />
    </ul>
  </div>
</template>
