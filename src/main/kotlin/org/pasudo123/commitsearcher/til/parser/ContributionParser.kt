package org.pasudo123.commitsearcher.til.parser

import org.jsoup.Jsoup
import org.pasudo123.commitsearcher.til.pojo.MyContribution
import org.springframework.stereotype.Component
import java.time.LocalDate
import java.time.format.DateTimeFormatter

@Component
class ContributionParser {

    companion object {
        private const val RECT_ELEMENT = "day"
        private const val COMMIT_COUNT = "data-count"
        private const val COMMIT_DATE = "data-date"
    }

    fun parseToMyContribution(html: String): MyContribution {
        val document = Jsoup.parse(html)
        val elements = document.getElementsByClass(RECT_ELEMENT)

        val myContributionElements = elements.map {
            MyContribution.myElementCreate(
                it.attr(COMMIT_COUNT).toInt(),
                LocalDate.parse(it.attr(COMMIT_DATE), DateTimeFormatter.ISO_DATE)
            )
        }

        return MyContribution(myContributionElements)
    }
}