<template>
  <div>
    <div style="font-size: 19px; padding-bottom: 20px;">
      <router-link to="/">main</router-link>
    </div>
    튜토리얼

    <!--  -->
    <hr />
    ** Class Decorator : @Component
    <div><message /></div>
    <hr />
    ** Property Decorator : @Prop
    <div><children :parent-message="parentToChildrenMessage" /></div>

    <!--  -->
    <hr />
    ** Method Decorator : @Watch
    <div>
      <button @click="changeMessage">watch 효과 확인</button>
      <button-watch :parent-message="watchSampleMessage">watch 를 이용합니다.</button-watch>
    </div>

    <!--  -->
    <hr />
    ** Method Decorator : @Emit
    <div>
      <emit-view @plus="counter" @reset="resetCounter" @fix="fixCounter" />
      [ {{count}} ]
    </div>

    <!--  -->
    <hr />
    ** Property Decorator: @Provide & @Inject
    <div>
      <inject-view />
    </div>
  </div>
</template>

<script lang="ts">

import {Component, Provide, Vue} from 'vue-property-decorator'
import message from "@/components/tutorial/step01/message.vue";
import Children from "@/components/tutorial/step02/children.vue";
import ButtonWatch from "@/components/tutorial/step03/ButtonWatch.vue";
import EmitView from "@/components/tutorial/step04/EmitView.vue";
import InjectView from "@/components/tutorial/step05/InjectView.vue";

@Component({
  components: {
    InjectView,
    EmitView,
    ButtonWatch,
    Children,
    message,
  },
})

export default class Tutorial extends Vue {
  /**  **/
  parentToChildrenMessage = "부모에서 자식으로 넘기는 값이다."

  /**  **/
  watchSampleMessage = "누르기 전의 메시지입니다."
  changeMessage() {
    this.watchSampleMessage = "** 누른 이후의 메시지입니다. **"
  }

  /**  **/
  count = 0
  counter() {
    this.count++
  }
  resetCounter() {
    this.count = 0
  }
  fixCounter(fixValue: number) {
    this.count = fixValue
  }

  /** 일반 로직에서는 권장하지 않는 방법이다. **/
  @Provide('injectMessage') provideMessage = 'provide to inject message'
}
</script>