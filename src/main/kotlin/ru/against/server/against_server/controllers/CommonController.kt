package ru.against.server.against_server.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import ru.against.server.against_server.models.InitialPageData

@RestController
class CommonController {

    @GetMapping("/")
    fun getInitialPageData(): InitialPageData {
        return InitialPageData()
    }
}