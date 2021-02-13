package org.pasudo123.commitsearcher.planner.service

import org.pasudo123.commitsearcher.planner.dto.PlannerCreateDto
import org.pasudo123.commitsearcher.planner.dto.PlannerResponseDto
import org.pasudo123.commitsearcher.planner.repository.PlannerRepository
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

@Service
@Transactional
class PlannerService(
    private val plannerRepository: PlannerRepository
) {

    fun createPlanner(plannerRequestDto: PlannerCreateDto.RequestDto): PlannerCreateDto.ResponseDto {
        TODO("구현 필요")
    }

    @Transactional
    fun findAll(): List<PlannerResponseDto> {
        TODO("구현 필요")
    }

    @Transactional(readOnly = true)
    fun findOneById(id: Long): PlannerResponseDto {
        TODO("구현 필요")
    }
}
