package com.nabiha.awalkerja.domain.usecase

import com.nabiha.awalkerja.domain.repository.AuthRepository
import com.nabiha.awalkerja.domain.utils.ApiUseCaseAuth
import com.nabiha.awalkerja.domain.utils.Result
import com.nabiha.awalkerja.model.apirequest.LoginRequest
import com.nabiha.awalkerja.model.apirequest.RegisterRequest
import com.nabiha.awalkerja.model.apiresponse.LoginResponse
import com.nabiha.awalkerja.model.apiresponse.RegisterResponse
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class AuthUseCase @Inject constructor(
    private val repository: AuthRepository
): ApiUseCaseAuth{
    override suspend fun login(params: LoginRequest): Flow<Result<LoginResponse>> {
        return  repository.fetchLoginUser(params)
    }

    override suspend fun register(params: RegisterRequest): Flow<Result<RegisterResponse>> {
        return repository.fetchRegisterUser(params)
    }

}