package ru.against.server.against_server.models

import jakarta.persistence.*

@Entity
@Table(name = "readers")
class BooksReader constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var phone: String? = null,
)