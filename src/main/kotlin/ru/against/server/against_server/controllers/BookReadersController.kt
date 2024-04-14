package ru.against.server.against_server.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController
import ru.against.server.against_server.models.BooksReader
import ru.against.server.against_server.repositories.BookReadersRepository

@RestController
class BookReadersController @Autowired constructor(
    private val repository: BookReadersRepository
) {

    @GetMapping("/readers")
    fun getAllReaders(): List<BooksReader?> {
        return repository.findAll()
    }

    @PostMapping("/readers/add")
    fun addNewReader() {
        val newReader = BooksReader(name = "Petya", phone = "1234")
        repository.save(newReader)
    }
}