package org.pasudo123.commitsearcher.global

import org.pasudo123.commitsearcher.exception.EntityNotFoundException
import org.pasudo123.commitsearcher.exception.ErrorCustomMessage
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest
import java.time.LocalDateTime

/**
 * https://humancaching.com/2019/07/02/exceptions-for-apis-consistency-without-chaos-with-kotlin-spring-boot-example/
 */
@ControllerAdvice
class CustomControllerAdvice {

    @ExceptionHandler(value = [EntityNotFoundException::class])
    fun handleDataNotFoundException(ex: EntityNotFoundException, request: WebRequest): ResponseEntity<ErrorCustomMessage> {
        return ResponseEntity
            .status(ex.code.status)
            .body(
                ErrorCustomMessage(
                    codeName = ex.code.name,
                    message = ex.code.message
                )
            )
    }
}