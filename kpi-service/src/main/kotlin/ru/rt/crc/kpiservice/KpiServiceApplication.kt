package ru.rt.crc.kpiservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class KpiServiceApplication

fun main(args: Array<String>) {
    runApplication<KpiServiceApplication>(*args)
}
