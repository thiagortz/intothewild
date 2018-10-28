package com.surprisebox.intothewild.controller

import org.springframework.http.HttpEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/home")
class Home{

    @GetMapping
    fun index(): HttpEntity<String>{
        return HttpEntity("Hello")

    }
}