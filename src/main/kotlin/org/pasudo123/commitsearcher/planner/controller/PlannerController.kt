package org.pasudo123.commitsearcher.planner.controller

import org.pasudo123.commitsearcher.planner.dto.PlannerCreateDto
import org.pasudo123.commitsearcher.planner.dto.PlannerResponseDto
import org.pasudo123.commitsearcher.planner.service.PlannerService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/planners"])
class PlannerController(
    private val plannerService: PlannerService
) {

    @PostMapping
    fun createPlanner(@RequestBody plannerRequestDto: PlannerCreateDto.RequestDto): ResponseEntity<PlannerResponseDto> {
        return ResponseEntity.ok(plannerService.createPlanner(plannerRequestDto))
    }

    @GetMapping
    fun findAll(): ResponseEntity<List<PlannerResponseDto>> {
        return ResponseEntity.ok(plannerService.findAll())
    }

    @GetMapping("{id}")
    fun findOneById(@PathVariable("id") id: Long): ResponseEntity<PlannerResponseDto> {
        return ResponseEntity.ok(plannerService.findOneById(id))
    }

}