package ru.against.server.against_server.models

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import org.jetbrains.annotations.NotNull
import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Entity
@Table
class Reader constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(length = 5026)
    var name: String? = null,

    @Column(length = 5026)
    var address: String? = null
)
