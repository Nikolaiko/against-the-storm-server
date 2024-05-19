package ru.against.server.against_server

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration
import org.springframework.boot.runApplication

@SpringBootApplication
class AgainstServerApplication

fun main(args: Array<String>) {
	runApplication<AgainstServerApplication>(*args)
}
