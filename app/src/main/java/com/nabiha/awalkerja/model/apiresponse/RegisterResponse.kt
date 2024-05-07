package com.nabiha.awalkerja.model.apiresponse

data class RegisterResponse(
    val id:Int,
    val name:String,
    val email:String,
    val password:String,
    val level: Int,
    val url_photo:String?,
)
