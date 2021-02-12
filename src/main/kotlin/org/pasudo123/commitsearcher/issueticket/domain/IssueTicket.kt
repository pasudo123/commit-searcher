package org.pasudo123.commitsearcher.issueticket.domain

import org.pasudo123.commitsearcher.planner.domain.Planner
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
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "issue_ticket")
@EntityListeners(AuditingEntityListener::class)
data class IssueTicket(
    @Column(name = "title", columnDefinition = "VARCHAR(100)")
    var title: String = "",

    @Column(name = "description", columnDefinition = "VARCHAR(255)")
    var description: String = "",

    @Column(name = "status", columnDefinition = "ENUM('IN_PROGRESS', 'RESOLVED', 'CLOSED')")
    var status: Status? = null
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Planner::class, optional = false)
    var planner: Planner? = null

    @CreatedDate
    var createdDate: LocalDateTime = LocalDateTime.MIN
        private set

    @LastModifiedDate
    var updatedDate: LocalDateTime = LocalDateTime.MIN
        private set

    enum class Status {
        IN_PROGRESS,
        RESOLVED,
        CLOSED
    }
}
