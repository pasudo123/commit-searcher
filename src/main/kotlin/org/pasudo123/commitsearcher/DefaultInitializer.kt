package org.pasudo123.commitsearcher

import org.pasudo123.commitsearcher.annotation.Log
import org.pasudo123.commitsearcher.annotation.Log.Companion.log
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Component

@Log
@Profile(value = ["default"])
@Component
class DefaultInitializer: ApplicationRunner {

    override fun run(args: ApplicationArguments?) {
        log.info("default profile running !!")
        TODO("Not yet implemented")
    }
}