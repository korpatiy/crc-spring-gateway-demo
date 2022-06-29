package ru.rt.crc.calcservice

import org.springframework.beans.factory.annotation.Value
import org.springframework.cloud.context.config.annotation.RefreshScope
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

//actuator/refresh
@RefreshScope
@RestController
@RequestMapping("/calc")
class CalcController {

    @Value("\${greeting}")
    var greeting: String = ""

    @GetMapping
    fun getCalc(): String {
        return greeting
    }
}