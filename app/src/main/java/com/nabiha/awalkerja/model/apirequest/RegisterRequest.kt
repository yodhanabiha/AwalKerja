package com.nabiha.awalkerja.model.apirequest

data class RegisterRequest(
    val name:String,
    val email:String,
    val password:String,
    val level:Int,
)
