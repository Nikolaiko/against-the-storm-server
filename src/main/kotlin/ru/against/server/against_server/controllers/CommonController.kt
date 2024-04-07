package ru.against.server.against_server.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.against.server.against_server.models.InitialPageData
import ru.against.server.against_server.models.Reader
import ru.against.server.against_server.repositories.UserRepository

@RestController
class CommonController @Autowired constructor(
    val userRepository: UserRepository
){
    @GetMapping("/")
    fun getInitialPageData(): List<Reader?> {
        return userRepository.findAll().toList()
    }

    @PostMapping("/")
    fun putInitialPageData() {
        userRepository.save(Reader(name = "Another", phone = "dssddsdsds"))
    }
}