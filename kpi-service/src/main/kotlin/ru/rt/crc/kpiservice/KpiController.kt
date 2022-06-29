package ru.rt.crc.kpiservice

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/kpi")
class KpiController {

    @GetMapping
    fun getKpi(): String {
        return "Hi, from kpi!"
    }
}