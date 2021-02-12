package org.pasudo123.commitsearcher.issueticket.domain

import org.pasudo123.commitsearcher.planner.domain.Planner
import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.Table

@Entity
@Table(name = "issue_ticket")
@EntityListeners(AuditingEntityListener::class)
data class IssueTicket(
    @Column(name = "title", columnDefinition = "VARCHAR(100)", nullable = false)
    var title: String = "",

    @Column(name = "description", columnDefinition = "VARCHAR(255)")
    var description: String = "",

    @Enumerated(EnumType.STRING)
    @Column(name = "status", columnDefinition = "ENUM('IN_PROGRESS', 'RESOLVED', 'CLOSED')", nullable = false)
    var status: Status = Status.IN_PROGRESS
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Planner::class, optional = false)
    @JoinColumn(name = "planner_id")
    var planner: Planner? = null
        private set

    @Column(name = "created_date", columnDefinition = "datetime", nullable = false)
    @CreatedDate
    var createdDate: LocalDateTime = LocalDateTime.MIN
        private set

    @Column(name = "updated_date", columnDefinition = "datetime", nullable = false)
    @LastModifiedDate
    var updatedDate: LocalDateTime = LocalDateTime.MIN
        private set

    enum class Status {
        IN_PROGRESS,
        RESOLVED,
        CLOSED
    }

    fun setCurrentPlanner(planner: Planner) {
        this.planner = planner
        planner.addIssueTicket(this)
    }
}
