<template>
  <div>
    {{injectMessage}}
  </div>
</template>

<script lang="ts">
import { Component, Vue, Inject } from 'vue-property-decorator'

@Component
export default class InjectView extends Vue {
  // 자식 컴포넌트는 인젝트로 메시지를 받을 수 있도록 설정
  // 느낌표를 붙이게 되면, 해당 값은 초기화하지 않겠음을 의도한다.
  @Inject() readonly injectMessage!: string
}
</script>