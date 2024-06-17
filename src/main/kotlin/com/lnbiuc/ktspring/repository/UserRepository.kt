package com.lnbiuc.ktspring.repository

import com.lnbiuc.ktspring.pojo.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface UserRepository: JpaRepository<User, Long>