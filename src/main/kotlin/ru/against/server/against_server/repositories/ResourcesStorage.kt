package ru.against.server.against_server.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.against.server.against_server.models.BooksReader
import ru.against.server.against_server.models.GameResources

interface ResourcesStorage: JpaRepository<GameResources?, Long?>