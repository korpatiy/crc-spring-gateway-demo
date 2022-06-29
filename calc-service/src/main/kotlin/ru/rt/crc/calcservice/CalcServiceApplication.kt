package ru.rt.crc.calcservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CalcServiceApplication

fun main(args: Array<String>) {
    runApplication<CalcServiceApplication>(*args)
}
