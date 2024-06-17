package com.lnbiuc.ktspring.pojo

import jakarta.persistence.*
import java.util.Date

@Entity
data class Message(
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "message_seq")
    @SequenceGenerator(name = "message_seq", sequenceName = "message_seq", allocationSize = 1)
    val id: Long?,

    @Column(nullable = false)
    val head: String,

    @Column(nullable = true)
    val body: String?,

    @Column(nullable = false)
    val time: Date
) {
    constructor(head: String, body: String) : this(null, head, body, Date())
}