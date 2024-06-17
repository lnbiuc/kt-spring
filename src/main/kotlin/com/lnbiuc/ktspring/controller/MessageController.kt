package com.lnbiuc.ktspring.controller

import com.lnbiuc.ktspring.pojo.Message
import com.lnbiuc.ktspring.service.MessageService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@RestController
@RequestMapping("/msg")
class MessageController(private val messageService: MessageService) {

    @GetMapping("/get")
    fun randomMessage(): List<Message> {
        return messageService.findAll()
    }

    @GetMapping("/create/{title}/{body}")
    fun createMessage(@PathVariable("title") title: String, @PathVariable("body") body: String): Message =
        messageService.save(Message(title, body))

    @GetMapping("/get/{id}")
    fun getMessageById(@PathVariable("id") id: Long): Optional<Message> = messageService.findById(id)
}