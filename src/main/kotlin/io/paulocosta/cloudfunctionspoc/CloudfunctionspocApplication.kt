package io.paulocosta.cloudfunctionspoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class CloudfunctionspocApplication {

    @Bean
    open fun test(): () -> String {
        return { "hai" }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(CloudfunctionspocApplication::class.java, *args)
        }
    }

}

