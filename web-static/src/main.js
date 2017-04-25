// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import iView from 'iview'
import 'iview/dist/styles/iview.css'
import axios from 'axios'
import Main from './Main.vue'

Vue.use(iView)
Vue.use(Main)
Vue.use(axios)

Vue.prototype.$ajax = axios;
new Vue({
  el: '#app',
  render: h=>h(Main)
});

