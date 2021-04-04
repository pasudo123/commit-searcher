import Vue from 'vue'
import VueRouter from 'vue-router'
import Main from '@/components/main/Main.vue'
import Tutorial from '@/components/tutorial/Tutorial.vue'

Vue.use(VueRouter)

const routes = [
    {
        path: '/',
        component: Main
    },
    {
        path: '/tutorial',
        component: Tutorial
    },
]

export default new VueRouter({
    base: '/',
    mode: 'history',
    routes
})
