package org.pasudo123.commitsearcher.config

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.KotlinModule
import com.fasterxml.jackson.module.paramnames.ParameterNamesModule
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 * http://praxisit.de/convert-localdatetime-to-json-with-kotlin/
 */
@Configuration
class CustomObjectConfiguration {

    @Bean
    fun objectMapper(): ObjectMapper {
        val objectMapper = ObjectMapper()
        objectMapper.registerModule(JavaTimeModule())
        objectMapper.registerModule(ParameterNamesModule())
        objectMapper.registerModule(Jdk8Module())
        objectMapper.registerModule(KotlinModule())

        return objectMapper
    }
}