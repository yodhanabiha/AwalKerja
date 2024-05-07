package com.nabiha.awalkerja.domain.repository

import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import kotlinx.coroutines.flow.Flow
import com.nabiha.awalkerja.domain.utils.Result
import com.nabiha.awalkerja.model.apirequest.RegisterRequest
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse

interface AuthRepository {
    suspend fun fetchLoginUser(params: LoginRequest): Flow<Result<LoginResponse>>
    suspend fun fetchRegisterUser(params: RegisterRequest): Flow<Result<RegisterResponse>>
}