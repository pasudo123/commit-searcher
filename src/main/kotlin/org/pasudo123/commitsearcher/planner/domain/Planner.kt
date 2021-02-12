package org.pasudo123.commitsearcher.planner.domain

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "planner")
data class Planner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "title")
    var title: String = ""

    @Column(name = "description")
    var description: String = ""

    @OneToMany(fetch = FetchType.LAZY)
    var issueTickets: List<IssueTicket> = emptyList()

}