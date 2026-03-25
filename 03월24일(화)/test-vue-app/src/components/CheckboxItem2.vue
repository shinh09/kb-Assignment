<template>
    <input type="checkbox" :checked="idol.checked">{{ idol.name}}</input><br>
</template>
<script>
export default{
    name: 'CheckboxItem',
    props:['idol'],
}
</script>