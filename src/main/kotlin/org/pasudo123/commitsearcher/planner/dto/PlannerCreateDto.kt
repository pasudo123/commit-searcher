package org.pasudo123.commitsearcher.planner.dto

import org.pasudo123.commitsearcher.planner.domain.Planner
import javax.validation.constraints.NotBlank

class PlannerCreateDto {

    data class RequestDto(
        @NotBlank
        private var title: String = "",
        private var description: String = ""
    ) {
        fun toPlannerEntity(): Planner {
            return Planner(title  = title, description = description)
        }
    }

    data class ResponseDto(
        var title: String = "",
        var description: String = "",
        var createdDate: String = "",
        var updateDate: String = ""
    )
}