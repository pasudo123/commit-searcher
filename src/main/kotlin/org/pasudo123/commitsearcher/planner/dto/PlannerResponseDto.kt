package org.pasudo123.commitsearcher.planner.dto

import com.fasterxml.jackson.annotation.JsonFormat
import org.pasudo123.commitsearcher.planner.domain.Planner
import java.time.LocalDateTime

data class PlannerResponseDto(
    var title: String = "",
    var description: String = "",

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
    var createdDate: LocalDateTime = LocalDateTime.now(),

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
    var updateDate: LocalDateTime = LocalDateTime.now()
) {
    constructor(planner: Planner) : this(
        title = planner.title,
        description = planner.description,
        createdDate = planner.createdDate,
        updateDate = planner.updatedDate
    )
}