import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

/**
 * https://docs.gradle.org/current/userguide/kotlin_dsl.html#kotdsl:accessor_applicability
 */
plugins {
    id("org.springframework.boot") version "2.3.8.RELEASE"
    id("io.spring.dependency-management") version "1.0.10.RELEASE"
    kotlin("jvm") version "1.4.21"
    kotlin("plugin.spring") version "1.4.21"
}

group = "org.pasudo123"
version = "1.0.0"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
    mavenCentral()
}

dependencies {

    // jsoup HTML parser library @ https://jsoup.org/
    implementation("org.jsoup:jsoup:1.13.1")

    implementation("org.springframework.boot:spring-boot-starter-actuator")
    implementation("org.springframework.boot:spring-boot-starter-freemarker")
    implementation("org.springframework.boot:spring-boot-starter-mustache")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf")
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.boot:spring-boot-starter-webflux")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
    implementation("io.projectreactor.kotlin:reactor-kotlin-extensions")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor")

    testImplementation("io.mockk:mockk:1.9.3")
    testImplementation("org.springframework.boot:spring-boot-starter-test")
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit5:1.3.72")
    testImplementation("io.projectreactor:reactor-test")

    testImplementation("io.kotest:kotest-runner-junit5:4.3.1")      // for kotest framework
    testImplementation("io.kotest:kotest-assertions-core:4.3.1")    // for kotest core jvm assertions
    testImplementation("io.kotest:kotest-property:4.3.1")           // for kotest property test
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}
