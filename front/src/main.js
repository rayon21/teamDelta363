// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import VueRouter from 'vue-router'
import RequestForm from './components/RequestForm.vue'
import Requests from './components/Requests.vue'

require('bootstrap/dist/css/bootstrap.min.css');
require('./assets/css/style.css');

Vue.config.productionTip = false
Vue.use(VueRouter);

/* set up vue router */
const routes = [
	{ path:'/', component: RequestForm },
	{ path:'/security', component: Requests }
];
const router = new VueRouter({
	routes,
	mode: 'history'
});

/* eslint-disable no-new */
new Vue({
  router,
  el: '#app',
  template: '<App/>',
  components: { App }
})
