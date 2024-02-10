package com.example.demo.service

import com.example.demo.entity.User
import org.springframework.stereotype.Service
import com.example.demo.repository.UserRepository
import org.springframework.beans.factory.annotation.Autowired

@Service
class UserService {
    @Autowired
    lateinit var userRepository: UserRepository
    fun findByFirstName(firstName: String): User {
       val user = userRepository.findByFirstName(firstName)

        return  user[0]
    }
}