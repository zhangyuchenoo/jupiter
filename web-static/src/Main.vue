<style scoped>
    .layout{
        width:100%;
        height:300px;
        background: #f5f7f9;
        position: relative;
    }
</style>

<template>
    <div>
        <div><Logo/></div>
        <div><MainLayout/></div>
    </div>
</template>

<script>
import MainLayout from './components/MainLayout.vue'
import Logo from './components/Logo.vue'
    export default {
        data () {
            return {
                theme3: 'light'
            }
        },
        components: {Logo,MainLayout}
    }
</script>