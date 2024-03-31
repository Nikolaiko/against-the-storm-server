package ru.against.server.against_server.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class TestController {

    @GetMapping("/test")
    fun testGetRequest(): String {
        return  "Hello it's get test"
    }

    @PostMapping("/test")
    fun testPostRequest(): String {
        return  "Hello it's post test"
    }

    @PutMapping("/test")
    fun testPutRequest(): String {
        return  "Hello it's put test"
    }
}