package org.pasudo123.commitsearcher.exception

import org.springframework.http.HttpStatus

enum class ErrorCode(val status: HttpStatus, val message: String) {

    // entity 관련 에러
    E001(HttpStatus.BAD_REQUEST, message = "해당 데이터는 확인되지 않습니다.")

}