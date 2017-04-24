// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import Main from './Main.vue'
import MainLayout from './components/MainLayout.vue'
import Navigate from './components/Navigate.vue'

Vue.use(iView)
Vue.use(Main)
Vue.use(Navigate)
Vue.use(MainLayout)

var aa = new Vue({
  el: '#app',
  data: {message: 'hello22'},
  components: {MainLayout}
})

