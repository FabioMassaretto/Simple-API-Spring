package com.fabio.simpleapispring

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SimpleApiSpringApplication

fun main(args: Array<String>) {
	runApplication<SimpleApiSpringApplication>(*args)
}
