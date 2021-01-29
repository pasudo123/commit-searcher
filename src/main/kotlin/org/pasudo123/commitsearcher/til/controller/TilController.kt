package org.pasudo123.commitsearcher.til.controller

import org.pasudo123.commitsearcher.til.dto.ContributionResponseDto
import org.pasudo123.commitsearcher.til.service.TilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

/**
 * Today I Learn Controller
 * "오늘 나는 무엇을 배웠는지" 컨트롤러
 */
@RestController
class TilController(
    @Autowired private val tilService: TilService
) {

    @GetMapping("til/{username}")
    fun getTil(@PathVariable("username") username: String): ResponseEntity<ContributionResponseDto> {
        return ResponseEntity.ok(tilService.findTilByUsername(username))
    }
}