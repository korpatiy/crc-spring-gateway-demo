package ru.rt.crc.crcgateway

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
class CrcGatewayApplication

fun main(args: Array<String>) {
    runApplication<CrcGatewayApplication>(*args)
}
