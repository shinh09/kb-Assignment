<template>
    <input type="checkbox" v-model="checked">옵션1</input><br>
</template>
<script>
export default{
    name: 'CheckboxItem',
    data(){
        return{
            checked:false,
        }
    }
}
</script>