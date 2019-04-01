package io.paulocosta.cloudfunctionpoc

import com.amazonaws.services.lambda.runtime.Context
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent
import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler
import org.springframework.stereotype.Component

//@Component
//class Handler : SpringBootApiGatewayRequestHandler() {
//
//    override fun handleRequest(event: APIGatewayProxyRequestEvent?, context: Context?): Any {
//    }

//    @Bean
//    fun test(): () -> String {
//    }

//}