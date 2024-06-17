package com.lnbiuc.ktspring.repository

import com.lnbiuc.ktspring.pojo.Message
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface MessageRepository: JpaRepository<Message, Long>