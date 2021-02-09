package org.pasudo123.commitsearcher.til.parser

import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.Arguments
import org.junit.jupiter.params.provider.MethodSource
import java.util.stream.Stream

/**
 * 아래의 링크는 코틀린에서 MethodSource 사용하는 방법을 알려주고 있다.
 * https://blog.oio.de/2018/11/13/how-to-use-junit-5-methodsource-parameterized-tests-with-kotlin/
 *
 */
@DisplayName("컨트리뷰션 파서는")
internal class ContributionParserTest {

    private var contributionParser: ContributionParser = ContributionParser()

    @ParameterizedTest
    @MethodSource("provideHtml")
    @DisplayName("html 을 MyContribution 으로 파싱한다.")
    fun parseToMyContributionTest(paramHtml: String) {

        // given
        val html = paramHtml

        // when
        val myContribution = contributionParser.parseToMyContribution(html)

        // then
    }

    /**
     * companion object 내에 @JvmStatic 을 사용한다면 JVM 메모리 영역 내에 static 하게 만들어 이용할 수 있다.
     */
    companion object {
        @JvmStatic
        private fun provideHtml(): Stream<Arguments> {
            return Stream.of(
                Arguments.of(
                    "<g transform=\"translate(10, 20)\" data-hydro-click=\"{&quot;event_type&quot;:&quot;user_profile.click&quot;,&quot;payload&quot;:{&quot;profile_user_id&quot;:17797352,&quot;target&quot;:&quot;CONTRIBUTION_CALENDAR_SQUARE&quot;,&quot;user_id&quot;:null,&quot;originating_url&quot;:&quot;https://github.com/users/pasudo123/contributions?to=2021-12-31&quot;}}\" data-hydro-click-hmac=\"caaf33b72b58f2440472af530aec1ab0c049fba68e88341b5c9206952df08be8\"> \n" +
                            " <g transform=\"translate(0, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"14\" y=\"65\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"7\" data-date=\"2021-01-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"14\" y=\"78\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"3\" data-date=\"2021-01-02\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(14, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"0\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"6\" data-date=\"2021-01-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"13\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"1\" data-date=\"2021-01-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"26\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"39\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"4\" data-date=\"2021-01-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"52\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"65\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"4\" data-date=\"2021-01-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"13\" y=\"78\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"4\" data-date=\"2021-01-09\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(28, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"0\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"4\" data-date=\"2021-01-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"13\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"26\" fill=\"var(--color-calendar-graph-day-L3-bg)\" data-count=\"12\" data-date=\"2021-01-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"39\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"7\" data-date=\"2021-01-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"52\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"8\" data-date=\"2021-01-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"65\" fill=\"var(--color-calendar-graph-day-L3-bg)\" data-count=\"11\" data-date=\"2021-01-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"12\" y=\"78\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-16\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(42, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"0\" fill=\"var(--color-calendar-graph-day-L4-bg)\" data-count=\"21\" data-date=\"2021-01-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"13\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"7\" data-date=\"2021-01-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"26\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"39\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"9\" data-date=\"2021-01-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"52\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"7\" data-date=\"2021-01-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"65\" fill=\"var(--color-calendar-graph-day-L4-bg)\" data-count=\"18\" data-date=\"2021-01-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"11\" y=\"78\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"8\" data-date=\"2021-01-23\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(56, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"0\" fill=\"var(--color-calendar-graph-day-L4-bg)\" data-count=\"21\" data-date=\"2021-01-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"13\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"1\" data-date=\"2021-01-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"26\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"2\" data-date=\"2021-01-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"39\" fill=\"var(--color-calendar-graph-day-L1-bg)\" data-count=\"4\" data-date=\"2021-01-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"52\" fill=\"var(--color-calendar-graph-day-L2-bg)\" data-count=\"6\" data-date=\"2021-01-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"65\" fill=\"var(--color-calendar-graph-day-L3-bg)\" data-count=\"10\" data-date=\"2021-01-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"10\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-01-30\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(70, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-01-31\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"9\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-06\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(84, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"8\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-13\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(98, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"7\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-20\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(112, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"6\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-27\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(126, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-02-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"5\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-06\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(140, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"4\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-13\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(154, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"3\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-20\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(168, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"2\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-27\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(182, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-03-31\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"1\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-03\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(196, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"0\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-10\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(210, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-1\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-17\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(224, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-2\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-24\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(238, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-04-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-3\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-01\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(252, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-4\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-08\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(266, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-5\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-15\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(280, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-6\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-22\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(294, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-7\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-29\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(308, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-05-31\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-8\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-05\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(322, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-9\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-12\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(336, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-10\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-19\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(350, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-11\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-26\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(364, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-06-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-12\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-03\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(378, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-13\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-10\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(392, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-14\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-17\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(406, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-15\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-24\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(420, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-16\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-07-31\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(434, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-17\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-07\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(448, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-18\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-14\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(462, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-19\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-21\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(476, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-20\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-28\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(490, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-08-31\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-21\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-04\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(504, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-22\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-11\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(518, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-23\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-18\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(532, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-24\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-25\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(546, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-09-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-25\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-02\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(560, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-26\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-09\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(574, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-27\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-16\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(588, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-28\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-23\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(602, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-29\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-30\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(616, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-10-31\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-04\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-30\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-06\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(630, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-11\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-31\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-13\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(644, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-18\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-32\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-20\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(658, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-25\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-33\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-27\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(672, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-11-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-01\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-02\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-03\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-34\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-04\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(686, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-05\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-06\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-07\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-08\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-09\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-10\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-35\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-11\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(700, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-12\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-13\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-14\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-15\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-16\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-17\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-36\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-18\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(714, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-19\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-20\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-21\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-22\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-23\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-24\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-37\" y=\"78\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-25\" /> \n" +
                            " </g> \n" +
                            " <g transform=\"translate(728, 0)\"> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"0\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-26\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"13\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-27\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"26\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-28\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"39\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-29\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"52\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-30\" /> \n" +
                            "  <rect class=\"day\" width=\"10\" height=\"10\" x=\"-38\" y=\"65\" fill=\"var(--color-calendar-graph-day-bg)\" data-count=\"0\" data-date=\"2021-12-31\" /> \n" +
                            " </g> \n" +
                            " <text x=\"14\" y=\"-7\" class=\"month\">\n" +
                            "  Jan\n" +
                            " </text> \n" +
                            " <text x=\"92\" y=\"-7\" class=\"month\">\n" +
                            "  Feb\n" +
                            " </text> \n" +
                            " <text x=\"144\" y=\"-7\" class=\"month\">\n" +
                            "  Mar\n" +
                            " </text> \n" +
                            " <text x=\"196\" y=\"-7\" class=\"month\">\n" +
                            "  Apr\n" +
                            " </text> \n" +
                            " <text x=\"248\" y=\"-7\" class=\"month\">\n" +
                            "  May\n" +
                            " </text> \n" +
                            " <text x=\"313\" y=\"-7\" class=\"month\">\n" +
                            "  Jun\n" +
                            " </text> \n" +
                            " <text x=\"365\" y=\"-7\" class=\"month\">\n" +
                            "  Jul\n" +
                            " </text> \n" +
                            " <text x=\"417\" y=\"-7\" class=\"month\">\n" +
                            "  Aug\n" +
                            " </text> \n" +
                            " <text x=\"482\" y=\"-7\" class=\"month\">\n" +
                            "  Sep\n" +
                            " </text> \n" +
                            " <text x=\"534\" y=\"-7\" class=\"month\">\n" +
                            "  Oct\n" +
                            " </text> \n" +
                            " <text x=\"599\" y=\"-7\" class=\"month\">\n" +
                            "  Nov\n" +
                            " </text> \n" +
                            " <text x=\"651\" y=\"-7\" class=\"month\">\n" +
                            "  Dec\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"8\" style=\"display: none;\">\n" +
                            "  Sun\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"22\">\n" +
                            "  Mon\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"32\" style=\"display: none;\">\n" +
                            "  Tue\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"48\">\n" +
                            "  Wed\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"57\" style=\"display: none;\">\n" +
                            "  Thu\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"73\">\n" +
                            "  Fri\n" +
                            " </text> \n" +
                            " <text text-anchor=\"start\" class=\"wday\" dx=\"-10\" dy=\"81\" style=\"display: none;\">\n" +
                            "  Sat\n" +
                            " </text> \n" +
                            "</g>"
                )
            )
        }
    }
}

