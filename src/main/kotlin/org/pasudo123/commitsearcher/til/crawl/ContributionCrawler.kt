package org.pasudo123.commitsearcher.til.crawl

import org.jsoup.Jsoup
import org.springframework.stereotype.Component
import java.time.Year

@Component
class ContributionCrawler(
    private val graphSvg: String = "js-calendar-graph-svg"
) {

    private fun getCurrentYear(): Int {
        return Year.now().value
    }

    fun getContributionHtmlByUser(username: String): String {
        // js-calendar-graph-svg
        val document = Jsoup.connect("https://github.com/users/${username}/contributions?to=${this.getCurrentYear()}-12-31").get()
        return document.getElementsByClass(graphSvg).html()
    }
}