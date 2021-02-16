package org.pasudo123.commitsearcher.exception

import com.fasterxml.jackson.annotation.JsonFormat
import com.fasterxml.jackson.annotation.JsonProperty
import java.time.LocalDateTime

data class ErrorCustomMessage(
    @JsonProperty("code")
    var codeName: String,
    var message: String,

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
    var time: LocalDateTime = LocalDateTime.now()
) {
}