package com.example.demo.repository

import org.springframework.data.jpa.repository.JpaRepository
import com.example.demo.entity.User
import org.springframework.stereotype.Repository

@Repository
interface UserRepository:JpaRepository<User, Long>{
    fun findByFirstName(firstName: String): List<User>
}