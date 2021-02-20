package org.pasudo123.commitsearcher.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.service.Contact
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket
import springfox.documentation.swagger2.annotations.EnableSwagger2

/**
 * http://localhost:8080/swagger-ui/index.html
 */
@Configuration
@EnableSwagger2
class SwaggerConfiguration {

    @Bean
    fun api(): Docket {
        return Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("org.pasudo123.commitsearcher"))
            .paths(PathSelectors.any())
            .build()
            .apiInfo(apiInfo());
    }

    private fun apiInfo(): ApiInfo {
        return ApiInfoBuilder()
            .title("commit-searcher api documentation")
            .description("커밋 수색꾼에 대한 api 문서입니다.")
            .version("1.0")
            .termsOfServiceUrl("https://terms.com")
            .contact(
                Contact(
                    "pasudo123",
                    "",
                    "pasudo123@naver.com"
                )
            )
            .build()
    }
}