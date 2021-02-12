package org.pasudo123.commitsearcher.planner.domain

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "planner")
@EntityListeners(AuditingEntityListener::class)
data class Planner(
    @Column(name = "title")
    var title: String = "",

    @Column(name = "description")
    var description: String = ""
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "planner")
    var issueTickets: List<IssueTicket> = mutableListOf()

    @CreatedDate
    var createdDate: LocalDateTime = LocalDateTime.MIN
        private set

    @LastModifiedDate
    var updatedDate: LocalDateTime = LocalDateTime.MIN
        private set
}