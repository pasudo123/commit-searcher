package org.pasudo123.commitsearcher.annotation

import org.slf4j.Logger
import org.slf4j.LoggerFactory

/**
 * https://stackoverflow.com/questions/60419699/implement-slf4j-annotation-from-lombok-in-kotlin
 */
@Target(AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Log {
    companion object {
        inline var <reified T> T.log: Logger
            get() = LoggerFactory.getLogger(T::class.java)
            set(value) {}
    }
}