package org.pasudo123.commitsearcher.til.parser

import org.jsoup.Jsoup
import org.pasudo123.commitsearcher.til.pojo.MyContribution
import org.springframework.stereotype.Component

@Component
class ContributionParser {

    fun parseToMyContribution(html: String): MyContribution {
        Jsoup.parse(html)

        return MyContribution()
    }
}