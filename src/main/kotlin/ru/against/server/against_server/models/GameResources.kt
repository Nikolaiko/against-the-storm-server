package ru.against.server.against_server.models

import jakarta.persistence.*

@Entity
@Table(name = "resources")
data class GameResources constructor(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    var name: String? = null,
    var imageUrl: String? = null,
    var description: String? = null,

)
