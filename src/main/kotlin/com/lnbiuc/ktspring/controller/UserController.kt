package com.lnbiuc.ktspring.controller

import com.lnbiuc.ktspring.pojo.User
import com.lnbiuc.ktspring.repository.UserRepository
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.Optional


@RestController
@RequestMapping("/user")
class UserController(private val repository: UserRepository) {

    @GetMapping("/create/{name}")
    fun createUser(@PathVariable name: String): User = repository.save(User(name))

    @GetMapping("/get")
    fun getUsers(): List<User> = repository.findAll()

    @GetMapping("/get/{id}")
    fun getById(@PathVariable id: Long): Optional<User> = repository.findById(id)
}