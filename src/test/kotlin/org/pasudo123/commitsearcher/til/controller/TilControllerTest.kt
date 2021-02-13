package org.pasudo123.commitsearcher.til.controller

import io.kotest.matchers.shouldNotBe
import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.pasudo123.commitsearcher.til.dto.ContributionResponseDto
import org.pasudo123.commitsearcher.til.pojo.MyContribution
import org.pasudo123.commitsearcher.til.service.TilService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest
import org.springframework.boot.test.context.TestConfiguration
import org.springframework.context.annotation.Bean
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.get
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import java.time.LocalDate

@DisplayName("tilController 는")
@WebMvcTest(value = [(TilController::class)])
internal class TilControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private lateinit var tilService: TilService

    @TestConfiguration
    class ControllerTestConfiguration {
        @Bean
        fun tilService(): TilService {
            return mockk()
        }
    }

    @Test
    @DisplayName("[classic] 특정 유저에 대한 til 현황을 반환한다.")
    fun getTilTestByClassic() {

        // Given
        every { tilService.findTilByUsername(any() as String) } answers {
            ContributionResponseDto()
        }

        // When
        val result = mockMvc.perform(
            MockMvcRequestBuilders.get("/til/{username}", "pasudo123")
            .accept(MediaType.APPLICATION_JSON))
            .andExpect(MockMvcResultMatchers.status().isOk)
            .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
            .andReturn()

        // Then
        result shouldNotBe null
    }

    @Test
    @DisplayName("[kotlin dsl] 특정 유저에 대한 til 현황을 반환한다.")
    fun getTilTestByAdvanced() {

        // Given
        every { tilService.findTilByUsername(any() as String) } answers {
            ContributionResponseDto(
                myContribution = MyContribution(listOf(
                    MyContribution.MyElement(commitCount = 100, commitDate = LocalDate.now().minusDays(1L)),
                    MyContribution.MyElement(commitCount = 90, commitDate = LocalDate.now().minusDays(2L)),
                    MyContribution.MyElement(commitCount = 80, commitDate = LocalDate.now().minusDays(3L)),
                    MyContribution.MyElement(commitCount = 70, commitDate = LocalDate.now().minusDays(4L)),
                    MyContribution.MyElement(commitCount = 60, commitDate = LocalDate.now().minusDays(5L)),
                )),
                html = "<html><title></title><body></body></html>")
        }

        // When
        val result = mockMvc.get("/til/{username}", "pasudo123") {
            accept = MediaType.APPLICATION_JSON
        }.andExpect {
            status { isOk }
            content { contentType(MediaType.APPLICATION_JSON) }
            content { json("{\"myContribution\":{}, \"html\":{}}") }
        }.andDo {
            print()
        }.andReturn()

        // Then
        result shouldNotBe null
    }
}