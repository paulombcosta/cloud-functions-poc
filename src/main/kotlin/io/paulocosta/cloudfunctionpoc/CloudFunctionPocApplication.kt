package io.paulocosta.cloudfunctionpoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CloudFunctionPocApplication {

    @Bean
    fun test(): () -> String {
        return {"hai"}
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(CloudFunctionPocApplication::class.java, *args)
        }
    }
}
