package ru.against.server.against_server.repositories

import org.springframework.data.jpa.repository.JpaRepository
import ru.against.server.against_server.models.Reader


interface UserRepository : JpaRepository<ru.against.server.against_server.models.Reader?, Int?>