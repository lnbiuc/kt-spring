package com.lnbiuc.ktspring.pojo

import com.lnbiuc.ktspring.utils.SnowflakeIdGenerator
import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import java.util.*

@Entity
data class User(
    @Id
    var id: Long = SnowflakeIdGenerator.generateId(),

    @Column
    var username: String,

    @Column
    var createAt: Date = Date()
) {
    constructor(name: String) : this(SnowflakeIdGenerator.generateId(), name, Date())
}