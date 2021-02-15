package org.pasudo123.commitsearcher.issueticket.dto

import com.fasterxml.jackson.annotation.JsonFormat
import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import java.time.LocalDateTime

class IssueTicketResponseDto(
    var title: String = "",
    var description: String = "",

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
    var createdDate: LocalDateTime = LocalDateTime.now(),

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy.MM.dd hh:mm:ss")
    var updateDate: LocalDateTime = LocalDateTime.now()
) {
    constructor(issueTicket: IssueTicket) : this(
        title = issueTicket.title,
        description = issueTicket.description,
        createdDate = issueTicket.createdDate,
        updateDate = issueTicket.updatedDate
    )
}
