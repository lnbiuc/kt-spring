package com.lnbiuc.ktspring.service

import com.lnbiuc.ktspring.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository)