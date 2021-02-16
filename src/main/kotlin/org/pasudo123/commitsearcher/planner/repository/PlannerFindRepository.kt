package org.pasudo123.commitsearcher.planner.repository

import org.pasudo123.commitsearcher.exception.ErrorCode
import org.pasudo123.commitsearcher.exception.EntityNotFoundException
import org.pasudo123.commitsearcher.planner.domain.Planner
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional

@Repository
@Transactional(readOnly = true)
class PlannerFindRepository(
    private val plannerRepository: PlannerRepository
) {

    fun findAll(): List<Planner> {
        return plannerRepository.findAll()
    }

    fun findOneById(id: Long): Planner {
        return plannerRepository.findByIdOrNull(id)
            ?: throw EntityNotFoundException(ErrorCode.E001, "해당되는 id = $id planner 가 없습니다.")
    }
}