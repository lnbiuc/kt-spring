package com.lnbiuc.ktspring.utils

import cn.hutool.core.util.IdUtil

object SnowflakeIdGenerator {
    private val snowflake = IdUtil.getSnowflake()

    fun generateId(): Long {
        return snowflake.nextId()
    }
}