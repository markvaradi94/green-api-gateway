package ro.asis.green.api.gateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@EnableEurekaClient
@SpringBootApplication
class GreenApiGatewayApplication

fun main(args: Array<String>) {
    runApplication<GreenApiGatewayApplication>(*args)
}
