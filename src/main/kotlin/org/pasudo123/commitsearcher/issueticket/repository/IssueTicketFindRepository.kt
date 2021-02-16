package org.pasudo123.commitsearcher.issueticket.repository

import org.pasudo123.commitsearcher.exception.ErrorCode
import org.pasudo123.commitsearcher.exception.EntityNotFoundException
import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
class IssueTicketFindRepository(
    private val issueTicketRepository: IssueTicketRepository
) {

    fun findAll(): List<IssueTicket> {
        return issueTicketRepository.findAll()
    }

    fun findOneById(id: Long): IssueTicket {
        return issueTicketRepository.findByIdOrNull(id)
            ?: throw EntityNotFoundException(ErrorCode.E001, "해당되는 id = $id issueTicket 이 없습니다.")
    }
}