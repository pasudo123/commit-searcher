package org.pasudo123.commitsearcher.issueticket.repository

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.springframework.data.jpa.repository.JpaRepository

interface IssueTicketRepository: JpaRepository<IssueTicket, Long> {
}