package com.fabio.simpleapispring.controller

import com.fasterxml.jackson.databind.util.JSONPObject
import com.google.gson.Gson
import jdk.nashorn.internal.parser.JSONParser
import org.springframework.boot.jackson.JsonObjectSerializer
import org.springframework.web.bind.annotation.*

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

    @PostMapping("/post")
    fun helloPost(@RequestBody body: RequestBody):String {
        val bodyReq:String = body.toString();

        val json = Gson().toJson(bodyReq);
        return json;
    }
}