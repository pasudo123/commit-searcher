<template>
  <div>
    <button @click="plusMethod">숫자 증가</button>
    <button @click="resetMethod">숫자 리셋</button>
    <button @click="fixMethod">숫자 항상 고정</button>
  </div>
</template>

<script lang="ts">
import { Component, Vue, Emit } from 'vue-property-decorator'

@Component
export default class EmitView extends Vue {

  @Emit("plus")
  plusMethod() {
    console.info('method plus')
  }

  @Emit("reset")
  resetMethod() {
    console.info("method reset")
  }

  @Emit("fix")
  fixMethod() {
    return 5000
  }
}
</script>

<style scoped>

</style>