package org.pasudo123.commitsearcher.issueticket.service

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketCreateDto
import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketResponseDto
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketFindRepository
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketRepository
import org.pasudo123.commitsearcher.planner.repository.PlannerFindRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityNotFoundException

@Service
@Transactional
class IssueTicketService(
    private val issueTicketRepository: IssueTicketRepository,
    private val issueTicketFindRepository: IssueTicketFindRepository,
    private val plannerFindRepository: PlannerFindRepository
) {

    fun createIssueTicket(issueTicketRequestDto: IssueTicketCreateDto.RequestDto): IssueTicketResponseDto {
        val planner = plannerFindRepository.findOneById(issueTicketRequestDto.plannerId)
        val issueTicket = issueTicketRequestDto.toIssueTicketEntity().apply{
            this.setCurrentPlanner(planner)
        }
        return IssueTicketResponseDto(issueTicketRepository.save(issueTicket))
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
