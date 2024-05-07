package com.nabiha.awalkerja.data.mapper.auth

import com.nabiha.awalkerja.data.utils.Mapper
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse
import javax.inject.Inject

class RegisterMapper @Inject constructor() : Mapper<RegisterResponse, RegisterResponse> {
    override fun mapFromApiResponse(type: RegisterResponse): RegisterResponse {
        return type
    }
}