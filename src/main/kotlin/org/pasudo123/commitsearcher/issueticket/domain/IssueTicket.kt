package org.pasudo123.commitsearcher.issueticket.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "issue_ticket")
data class IssueTicket {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null

    @Column(name = "title")
    var title: String = ""

    @Column(name = "description")
    var description: String = ""



}
