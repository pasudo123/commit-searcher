<template>
  <div>
    {{parentMessage}}
  </div>
</template>

<script lang="ts">
  import {Component, Prop, Vue} from 'vue-property-decorator'

  @Component
  export default class Children extends Vue {
    // Prop 에 대한 옵셔널 설정은 '물음표를 붙여준다.'
    @Prop() parentMessage?: string
  }
</script>