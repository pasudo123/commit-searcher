package org.pasudo123.commitsearcher.til.service

import org.pasudo123.commitsearcher.til.crawl.ContributionCrawler
import org.pasudo123.commitsearcher.til.dto.ContributionResponseDto
import org.pasudo123.commitsearcher.til.parser.ContributionParser
import org.springframework.stereotype.Service

@Service
class TilService(
    private val contributionCrawler: ContributionCrawler,
    private val contributionParser: ContributionParser
) {

    fun findTilByUsername(username: String): ContributionResponseDto {
        contributionCrawler.getContributionHtmlByUser(username)

        return ContributionResponseDto()
    }
}