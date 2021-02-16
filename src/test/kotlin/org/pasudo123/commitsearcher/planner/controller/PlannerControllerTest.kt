package org.pasudo123.commitsearcher.planner.controller

import io.mockk.mockk
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.pasudo123.commitsearcher.planner.service.PlannerService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.MockMvc

/**
 * api 스펙 확인을 위함
 */
@DisplayName("plannerController 는")
internal class PlannerControllerTest {

    @Autowired
    private lateinit var mockMvc: MockMvc

    @Autowired
    private val plannerService: PlannerService = mockk()

    @Test
    @DisplayName("플래너를 생성한다.")
    fun createPlannerTest() {

    }
}