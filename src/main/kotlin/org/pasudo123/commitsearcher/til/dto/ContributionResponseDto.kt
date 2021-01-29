package org.pasudo123.commitsearcher.til.dto

import java.time.LocalDate

data class ContributionResponseDto(
    private var name: String = "",
    private var todayCommitCount: Long = 0L,
    private var html: String = "",
    private var date: LocalDate = LocalDate.now()   ) {
}