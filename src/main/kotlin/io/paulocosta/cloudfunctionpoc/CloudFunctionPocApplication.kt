package io.paulocosta.cloudfunctionpoc

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.messaging.Message
import org.springframework.messaging.MessageHeaders
import org.springframework.messaging.support.MessageBuilder

@SpringBootApplication
class CloudFunctionPocApplication {

    @Bean
    fun test(): () -> Message<String> {
        return {MessageBuilder.createMessage("HAI", MessageHeaders(emptyMap()))}
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String> = emptyArray()) {
            SpringApplication.run(CloudFunctionPocApplication::class.java, *args)
        }
    }

}

