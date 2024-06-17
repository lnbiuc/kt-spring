package com.lnbiuc.ktspring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/")
    fun index() = "Hello, world"

    @GetMapping("/path/{params}")
    fun path(@PathVariable("params") params: String) = "Hello, $params!"

}