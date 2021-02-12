package org.pasudo123.commitsearcher.til.dto

import org.pasudo123.commitsearcher.til.pojo.MyContribution

data class ContributionResponseDto(
    val myContribution: MyContribution = MyContribution.EMPTY,
    val html: String = "") {
}