package com.TreeNut.ChatBot_Backend.model

import javax.persistence.* // 이 줄을 추가하세요

@Entity
@Table(name = "users")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val idx: Long? = null,
    val id: String,
    val username: String,
    val email: String,
    val password: String,
    val accessToken: String? = null,
    val refreshToken: String? = null,
    @Column(name = "created_at", updatable = false)
    val createdAt: java.time.LocalDateTime = java.time.LocalDateTime.now(),
    @Column(name = "updated_at")
    var updatedAt: java.time.LocalDateTime = java.time.LocalDateTime.now()
)
