package com.fabio.simpleapispring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SimpleApiController {

    @GetMapping("/hello")
    fun hello():String {
        return "Hello World!"
    }

    @GetMapping("/")
    fun hello2():String {
        return "Hello World2!"
    }
}