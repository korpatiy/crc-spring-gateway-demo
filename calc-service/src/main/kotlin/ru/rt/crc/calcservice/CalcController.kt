package ru.rt.crc.calcservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/calc")
class CalcController {

    @GetMapping
    fun getCalc(): String {
        return "Hi, from calc!"
    }
}