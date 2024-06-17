package com.lnbiuc.ktspring.pojo

import com.lnbiuc.ktspring.utils.SnowflakeIdGenerator
import jakarta.persistence.*
import java.util.Date

@Entity
data class Message(
    @Id
    val id: Long = SnowflakeIdGenerator.generateId(),

    @Column(nullable = false)
    val head: String,

    @Column(nullable = true)
    val body: String?,

    @Column(nullable = false)
    val time: Date
) {
    constructor(head: String, body: String) : this(SnowflakeIdGenerator.generateId(), head, body, Date())
}