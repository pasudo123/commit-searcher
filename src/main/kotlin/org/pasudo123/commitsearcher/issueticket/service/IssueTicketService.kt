package org.pasudo123.commitsearcher.issueticket.service

import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketCreateDto
import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketResponseDto
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketFindRepository
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityNotFoundException

@Service
@Transactional
class IssueTicketService(
    private val issueTicketFindRepository: IssueTicketFindRepository
) {

    fun createIssueTicket(issueTicketRequestDto: IssueTicketCreateDto.RequestDto): IssueTicketResponseDto {
        TODO("구현이 필요함")
    }

    fun findAll(): List<IssueTicketResponseDto> {
        return issueTicketFindRepository.findAll().map {
            IssueTicketResponseDto(it)
        }
    }

    fun findOneById(id: Long): IssueTicketResponseDto {
        return IssueTicketResponseDto(issueTicketFindRepository.findOneById(id))
    }
}
