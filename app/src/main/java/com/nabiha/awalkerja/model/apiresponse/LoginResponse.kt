package com.nabiha.awalkerja.model.apiresponse

import com.nabiha.awalkerja.model.entity.User

data class LoginResponse(
    val success: Boolean,
    val user: User,
    val token: String
)
