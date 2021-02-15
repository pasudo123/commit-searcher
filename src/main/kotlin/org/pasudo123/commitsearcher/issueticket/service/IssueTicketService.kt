package org.pasudo123.commitsearcher.issueticket.service

import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketCreateDto
import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketResponseDto
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class IssueTicketService(
    private val issueTicketRepository: IssueTicketRepository
) {

    fun createIssueTicket(issueTicketRequestDto: IssueTicketCreateDto.RequestDto): IssueTicketResponseDto {
        TODO("구현이 필요함")
    }
}
