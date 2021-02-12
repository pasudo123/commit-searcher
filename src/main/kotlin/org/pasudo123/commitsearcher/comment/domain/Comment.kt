package org.pasudo123.commitsearcher.comment.domain

import org.springframework.data.annotation.CreatedDate
import org.springframework.data.annotation.LastModifiedDate
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import java.time.LocalDateTime
import javax.persistence.Entity
import javax.persistence.EntityListeners
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "comment")
@EntityListeners(AuditingEntityListener::class)
data class Comment(
    var content: String = "",
) {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null

    @CreatedDate
    var createdDate: LocalDateTime = LocalDateTime.MIN
        private set

    @LastModifiedDate
    var updatedDate: LocalDateTime = LocalDateTime.MIN
        private set
}