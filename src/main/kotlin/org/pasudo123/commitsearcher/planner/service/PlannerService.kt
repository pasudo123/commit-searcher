package org.pasudo123.commitsearcher.planner.service

import org.pasudo123.commitsearcher.planner.dto.PlannerCreateDto
import org.pasudo123.commitsearcher.planner.dto.PlannerResponseDto
import org.pasudo123.commitsearcher.planner.repository.PlannerRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.RuntimeException

@Service
@Transactional
class PlannerService(
    private val plannerRepository: PlannerRepository
) {

    fun createPlanner(plannerRequestDto: PlannerCreateDto.RequestDto): PlannerResponseDto {
        return PlannerResponseDto(plannerRepository.save(plannerRequestDto.toPlannerEntity()))
    }

    @Transactional(readOnly = true)
    fun findAll(): List<PlannerResponseDto> {
        return plannerRepository.findAll().map {
            PlannerResponseDto(it)
        }
    }

    @Transactional(readOnly = true)
    fun findOneById(id: Long): PlannerResponseDto {
        TODO("구현이 필요")
    }
}
