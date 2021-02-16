package org.pasudo123.commitsearcher.planner.dto

import com.fasterxml.jackson.annotation.JsonFormat
import org.pasudo123.commitsearcher.planner.domain.Planner
import java.time.LocalDateTime

data class PlannerDetailResponseDto(
    var planner: PlannerResponseDto? = null,
    var plannerTickets: List<Ticket>? = mutableListOf()
) {

    constructor(planner: Planner) : this(
        planner = PlannerResponseDto(planner),
        plannerTickets = planner.issueTickets.map {
            Ticket(
                id = it.id,
                title = it.title,
                description = it.description,
                createdDate = it.createdDate,
                updateDate =  it.updatedDate
            )
        }
    )

    data class Ticket(
        var id: Long = 0,
        var title: String = "",
        var description: String = "",

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
        var createdDate: LocalDateTime = LocalDateTime.now(),

        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
        var updateDate: LocalDateTime = LocalDateTime.now()
    )
}