package com.TreeNut.ChatBot_Backend.service

import com.TreeNut.ChatBot_Backend.model.User
import com.TreeNut.ChatBot_Backend.repository.UserRepository
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder
import org.springframework.stereotype.Service

@Service
class UserService(private val userRepository: UserRepository) {

    private val passwordEncoder = BCryptPasswordEncoder()

    fun register(user: User): User {
        val encodedUser = user.copy(password = passwordEncoder.encode(user.password)) // 복사하여 패스워드 인코딩
        return userRepository.save(encodedUser)
    }

    fun login(id: String, password: String): User? {
        val user = userRepository.findById(id) ?: return null
        return if (passwordEncoder.matches(password, user.password)) user else null
    }
}

