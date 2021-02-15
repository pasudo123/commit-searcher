package org.pasudo123.commitsearcher.issueticket.controller

import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketCreateDto
import org.pasudo123.commitsearcher.issueticket.dto.IssueTicketResponseDto
import org.pasudo123.commitsearcher.issueticket.service.IssueTicketService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(path = ["/issue-ticket"])
class IssueTicketController(
    private val issueTicketService: IssueTicketService
) {

    @PostMapping
    fun createIssueTicket(@RequestBody issueTicketRequestDto: IssueTicketCreateDto.RequestDto): ResponseEntity<IssueTicketResponseDto> {
        return ResponseEntity.ok(issueTicketService.createIssueTicket(issueTicketRequestDto))
    }
}