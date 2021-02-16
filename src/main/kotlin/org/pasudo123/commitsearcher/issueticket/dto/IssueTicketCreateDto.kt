package org.pasudo123.commitsearcher.issueticket.dto

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import javax.validation.constraints.NotBlank

class IssueTicketCreateDto {

    data class RequestDto(
        @NotBlank var plannerId: Long = 1,
        @NotBlank private var title: String = "",
        private var description: String = ""
    ) {
        fun toIssueTicketEntity(): IssueTicket {
            return IssueTicket(title = title, description = description)
        }
    }
}
