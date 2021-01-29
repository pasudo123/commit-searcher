package org.pasudo123.commitsearcher.til.crawl

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit.jupiter.SpringExtension

/**
 * 스프링 기본 의존성을 없애고,
 * 단순 객체로 테스트를 진행하였다. 속도는 체감상 더 빨라졌다.
 */
//@ExtendWith(SpringExtension::class)
//@SpringBootTest(classes = [ContributionCrawler::class])
@DisplayName("컨트리뷰션 크롤러는")
internal class ContributionCrawlerTest {

//    @Autowired
//    lateinit var contributionCrawler: ContributionCrawler

    private var contributionCrawler: ContributionCrawler = ContributionCrawler()

    @Test
    @DisplayName("특정 유저에 대한 컨트리뷰션 svg 태그를 반환한다.")
    fun getContributionHtmlByUserTest() {

        // when
        val html = contributionCrawler.getContributionHtmlByUser("pasudo123")

        // then
        assertThat(html).isNotBlank
    }
}