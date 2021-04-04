<template>
  <div>
    <input type="text" v-model="message">
    <div>{{message}}</div>
  </div>
</template>

<script lang="ts">
/**
 * (01) 템플릿에 대한 컴포넌트 정의
 * (02) 해당 컴포넌트를 사용할 뷰 데코레이터를 임포트해주어야 한다.
 * (03) .vue 파일의 script 구문이 디폴트로 자바스크립트 구문으로 해석하기 때문에 ts 를 같이 붙여줄 수 있도록 한다.
 * (03-1) <script lang="ts"><\/script>
 * **/

import {Component, Vue} from 'vue-property-decorator'

// 클래스 선언 및 뷰를 상속
// 클래스 인스턴스를 컴포넌트 인스턴스로 사용하기 위해서 @Component 를 붙여준다.
@Component
export default class Message extends Vue {
  // 멤버변수로 데이터 속성을 정의
  message = "메세지를 입력해주세요.";
}
</script>