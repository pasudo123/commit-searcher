package org.pasudo123.commitsearcher

import org.pasudo123.commitsearcher.annotation.Log
import org.pasudo123.commitsearcher.annotation.Log.Companion.log
import org.pasudo123.commitsearcher.issueticket.domain.IssueTicket
import org.pasudo123.commitsearcher.issueticket.repository.IssueTicketRepository
import org.pasudo123.commitsearcher.planner.domain.Planner
import org.pasudo123.commitsearcher.planner.repository.PlannerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Log
@Profile(value = ["default"])
@Component
class DefaultInitializer @Autowired constructor(
    private val defaultPlannerInitializer: DefaultPlannerInitializer
): ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        log.info("default profile running !!")
        defaultPlannerInitializer.process()
    }
}