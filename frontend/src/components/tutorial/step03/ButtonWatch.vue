<template>
  <div>
    <div>{{parentMessage}}</div>
    <div></div>
    <div>{{alertMessage}}</div>
  </div>
</template>

<script lang="ts">
import {Component, Prop, Vue, Watch} from 'vue-property-decorator'

@Component
export default class ButtonWatch extends Vue {
  @Prop() parentMessage?: string

  alertMessage = ""

  /**
   * - immediate : true 인 경우, 속성의 현재값으로 핸들러를 바로 호출하겠다.
   * - deep : 속성이 객체일 경우, 속성의 내부까지 변화를 감지하겠다.
   */
  @Watch('parentMessage', {deep: true})
  updateHandler(value: string, oldValue: string) {
    console.debug('value : ', value, ' old-value : ', oldValue)
    this.alertMessage = '====> watch 로 감지가 되었습니다. <===='
  }
}
</script>

<style scoped>


</style>