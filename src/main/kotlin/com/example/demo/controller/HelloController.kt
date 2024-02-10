package com.example.demo.controller

import com.example.demo.entity.User
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.PathVariable

import com.example.demo.service.UserService
import org.springframework.beans.factory.annotation.Autowired

@RestController
class HelloController {

    @Autowired
    lateinit var userService: UserService

    @GetMapping("/user/{firstName}")
    fun findByFirstName(@PathVariable firstName: String): ResponseEntity<User> {
        return ResponseEntity.ok(userService.findByFirstName(firstName))
    }
}