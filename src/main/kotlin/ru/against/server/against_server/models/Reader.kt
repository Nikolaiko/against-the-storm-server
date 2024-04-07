package ru.against.server.against_server.models

import jakarta.persistence.*

@Entity
@Table(name="Author")
class Reader constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Int? = null,

    @Column(length = 5026)
    var name: String? = null,

    @Column(length = 5026)
    var phone: String? = null
)
