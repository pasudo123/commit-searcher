package org.pasudo123.commitsearcher.planner.service

import org.pasudo123.commitsearcher.exception.EntityNotFoundException
import org.pasudo123.commitsearcher.planner.dto.PlannerCreateDto
import org.pasudo123.commitsearcher.planner.dto.PlannerDetailResponseDto
import org.pasudo123.commitsearcher.planner.dto.PlannerResponseDto
import org.pasudo123.commitsearcher.planner.repository.PlannerFindRepository
import org.pasudo123.commitsearcher.planner.repository.PlannerRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional
import java.lang.RuntimeException

@Service
@Transactional
class PlannerService(
    private val plannerRepository: PlannerRepository,
    private val plannerFindRepository: PlannerFindRepository
) {

    fun createPlanner(plannerRequestDto: PlannerCreateDto.RequestDto): PlannerResponseDto {
        return PlannerResponseDto(plannerRepository.save(plannerRequestDto.toPlannerEntity()))
    }

    fun findAll(): List<PlannerResponseDto> {
        return plannerFindRepository.findAll().map {
            PlannerResponseDto(it)
        }
    }

    @Transactional(readOnly = true)
    fun findOneById(id: Long): PlannerDetailResponseDto {
        return PlannerDetailResponseDto(plannerFindRepository.findOneById(id))
    }
}
