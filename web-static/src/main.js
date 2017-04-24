// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import App from './App.vue'
import Main from './Main.vue'

Vue.use(iView)
Vue.use(App)
Vue.use(Main)

new Vue({
  el: '#app',
  render: h=>h(Main),
  components: {Main}
})

