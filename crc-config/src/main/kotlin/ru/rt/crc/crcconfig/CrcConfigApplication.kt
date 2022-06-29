package ru.rt.crc.crcconfig

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.cloud.config.server.EnableConfigServer

@SpringBootApplication
@EnableConfigServer
class CrcConfigApplication

fun main(args: Array<String>) {
    runApplication<CrcConfigApplication>(*args)
}
