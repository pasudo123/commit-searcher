package org.pasudo123.commitsearcher.comment.repository

import org.pasudo123.commitsearcher.comment.domain.Comment
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CommentRepository: JpaRepository<Comment, Long> {

}