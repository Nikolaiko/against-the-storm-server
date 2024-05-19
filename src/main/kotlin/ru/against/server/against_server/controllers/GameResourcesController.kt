package ru.against.server.against_server.controllers

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import ru.against.server.against_server.models.GameResources
import ru.against.server.against_server.repositories.ResourcesStorage
import java.io.Console
import java.sql.DriverManager.println

@RestController
class GameResourcesController @Autowired constructor(
    private val resourceStorage: ResourcesStorage
) {

    @GetMapping("/resources")
    fun getAllResources(): List<GameResources?> {
        return resourceStorage.findAll()
    }

    @GetMapping("/resources/{name}")
    fun getResourceByName(@PathVariable name: String): GameResources? {
        return resourceStorage.findByName(name)[0]
    }
}