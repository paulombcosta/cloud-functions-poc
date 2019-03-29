package io.paulocosta.cloudfunctionpoc

import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler
import org.springframework.context.annotation.Bean
import org.springframework.stereotype.Component

@Component
class Handler : SpringBootApiGatewayRequestHandler() {

    @Bean
    fun test(): () -> String {
        return {"hai"}
    }

}