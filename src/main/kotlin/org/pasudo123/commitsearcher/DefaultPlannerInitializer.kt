package org.pasudo123.commitsearcher

import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketRepository
import org.pasudo123.commitsearcher.planner.domain.Planner
import org.pasudo123.commitsearcher.planner.repository.PlannerRepository
import org.springframework.stereotype.Component

@Component
class DefaultPlannerInitializer(
    private val issueTicketRepository: IssueTicketRepository,
    private val plannerRepository: PlannerRepository
) {

    fun process() {
        // # 1
        val planForPlannerDomain = Planner(title = "플래너 레파지토리 구현하기", description = "플래너 도메인 모듈 설정 및 부가적인 것 설정")
        plannerRepository.save(planForPlannerDomain)

        val issueTickets: List<IssueTicket> = listOf(
            IssueTicket(title = "플래너 도메인 작성", description = "")
                .apply { this.setCurrentPlanner(planForPlannerDomain) },

            IssueTicket(title = "플래너에 대한 의존관계 설정", description = "이슈 티켓 의존관계를 만들어야 한다.")
                .apply { this.setCurrentPlanner(planForPlannerDomain) },

            IssueTicket(title = "디비 작성 관련한 더미 데이터 삽입", description = "default profile 에 대한 더미데이터를 삽입한다.")
                .apply { this.setCurrentPlanner(planForPlannerDomain) }
        )
        issueTicketRepository.saveAll(issueTickets)

        // # 2
        val planForPlannerDomain2 = Planner(title = "롯데마트 가기", description = "롯데마트를 가서 필요한 물품들을 구매한다.")
        plannerRepository.save(planForPlannerDomain2)

        val issueTickets2: List<IssueTicket> = listOf(
            IssueTicket(title = "치실 구매하기", description = "")
                .apply { this.setCurrentPlanner(planForPlannerDomain) },

            IssueTicket(title = "폼클렌징 구매하기", description = "이슈 티켓 의존관계를 만들어야 한다.")
                .apply { this.setCurrentPlanner(planForPlannerDomain) },
        )
        issueTicketRepository.saveAll(issueTickets2)
    }
}