import { createRouter, createWebHistory } from 'vue-router';

import Home from '../pages/Home.vue';
import About from '../pages/About.vue';
import Members from '../pages/Members.vue';
import Videos from '../pages/Videos.vue';

//라우터 객체 생성
const router = createRouter({
  history: createWebHistory(),
  routes: [
    {
      path: '/', //URL
      name: 'home',
      component: Home,
    },
    {
      path: '/about',
      name: 'about',
      component: About,
    },
    {
      path: '/members',
      name: 'members',
      component: Members,
    },
    {
      path: '/videos',
      name: 'videos',
      component: Videos,
    },
  ],
});
//main.js에서 사용할 수 있도록 export
export default router;
