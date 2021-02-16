package org.pasudo123.commitsearcher.planner.dto

import org.pasudo123.commitsearcher.planner.domain.Planner

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
                description = it.description
            )
        }
    )

    data class Ticket(
        var id: Long = 0,
        var title: String = "",
        var description: String = ""
    )
}