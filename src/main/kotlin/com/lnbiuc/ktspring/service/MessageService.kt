package com.lnbiuc.ktspring.service

import com.lnbiuc.ktspring.pojo.Message
import com.lnbiuc.ktspring.repository.MessageRepository
import org.springframework.stereotype.Service

@Service
class MessageService(private val messageRepository: MessageRepository) {
    fun findAll(): List<Message> = messageRepository.findAll()

    fun findById(id: Long) = messageRepository.findById(id)

    fun save(message: Message): Message {
        return messageRepository.save(message)
    }

    fun delete(id: Long) {
        messageRepository.deleteById(id)
    }

    fun update(message: Message): Message {
        return messageRepository.save(message)
    }
}