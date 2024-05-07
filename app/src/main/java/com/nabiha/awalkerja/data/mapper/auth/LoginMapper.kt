package com.nabiha.awalkerja.data.mapper.auth

import com.nabiha.awalkerja.data.utils.Mapper
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import javax.inject.Inject

class LoginMapper @Inject constructor() : Mapper<LoginResponse, LoginResponse> {
    override fun mapFromApiResponse(type: LoginResponse): LoginResponse {
        return type
    }
}