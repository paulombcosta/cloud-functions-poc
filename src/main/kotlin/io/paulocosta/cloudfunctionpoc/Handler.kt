package io.paulocosta.cloudfunctionpoc

import org.springframework.cloud.function.adapter.aws.SpringBootApiGatewayRequestHandler
import org.springframework.stereotype.Component

@Component
class Handler : SpringBootApiGatewayRequestHandler()
